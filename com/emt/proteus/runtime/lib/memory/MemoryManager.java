/*     */ package com.emt.proteus.runtime.lib.memory;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.Utils;
/*     */ import com.emt.proteus.runtime.api.AllocationTable;
/*     */ import com.emt.proteus.runtime.api.AllocationTable.Block;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.MemoryException;
/*     */ import com.emt.proteus.runtime.lib.session.SaveRestoreHandler;
/*     */ import com.emt.proteus.runtime.lib.session.SessionState;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MemoryManager
/*     */   implements SaveRestoreHandler
/*     */ {
/*     */   public static final String MAIN_MEMORY_START = "ram.main.start";
/*     */   public static final String MAIN_MEMORY_END = "ram.main.end";
/*     */   public static final String EX_MEMORY_START = "ram.ext.start";
/*     */   public static final String EX_MEMORY_END = "ram.ext.end";
/*     */   public static final String MAIN_MEMORY_FILE = ".ram.gz";
/*     */   public static final String EXT_PAGE_FILE = ".expages.gz";
/*     */   public static final String EXT_MEMORY_FILE = ".exram.gz";
/*     */   public static final int BLOCK_SHIFT = 10;
/*     */   private int stack;
/*     */   private int minStack;
/*     */   private int maxStack;
/*     */   private int extendedMemoryBase;
/*     */   private int extendedMemoryTop;
/*     */   private LazyMemoryLoader lazyLoader;
/*  76 */   private final AllocationTable heap = new AllocationTable();
/*     */   
/*     */   public MemoryManager()
/*     */   {
/*  80 */     this.maxStack = MainMemory.MEM_SIZE;
/*  81 */     this.extendedMemoryBase = this.maxStack;
/*     */   }
/*     */   
/*     */   public final int getMaxStack() {
/*  85 */     return this.maxStack;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public final void setMaxStack(int maxStack)
/*     */   {
/*  94 */     this.maxStack = maxStack;
/*     */   }
/*     */   
/*     */   public void setExtendedMemoryBase(int extendedMemoryBase) {
/*  98 */     this.extendedMemoryBase = extendedMemoryBase;
/*     */   }
/*     */   
/*     */   public void start(int address, byte[] data, String label) {
/* 102 */     this.stack = this.maxStack;
/* 103 */     this.minStack = this.stack;
/* 104 */     this.heap.init(address, data.length);
/* 105 */     this.extendedMemoryTop = this.extendedMemoryBase;
/*     */   }
/*     */   
/*     */ 
/*     */   public void stop() {}
/*     */   
/*     */   public int allocateStack(int size)
/*     */   {
/* 113 */     int real_amount = size + 4;
/* 114 */     int start = this.stack - real_amount & 0xFFFFFFFC;
/* 115 */     if (start < 0) {
/* 116 */       throw new MemoryException(this.stack + " " + real_amount + " " + start + " " + getClass());
/*     */     }
/* 118 */     this.stack = start;
/* 119 */     if (start < this.minStack) {
/* 120 */       this.minStack = Math.min(this.stack, this.minStack);
/* 121 */       this.minStack = start;
/* 122 */       checkMem();
/*     */     }
/* 124 */     return start;
/*     */   }
/*     */   
/*     */   public void freeStack(int base$)
/*     */   {
/* 129 */     this.stack = base$;
/*     */   }
/*     */   
/*     */   public int getStack() {
/* 133 */     return this.stack;
/*     */   }
/*     */   
/*     */   public int allocateHeap(int size, int i, int i1) {
/* 137 */     int address = this.heap.allocate(size, 0).getAddress();
/* 138 */     checkMem();
/* 139 */     return address;
/*     */   }
/*     */   
/*     */   public int allocateExtended(int size) {
/* 143 */     size = AllocationTable.correct_size(size);
/* 144 */     int address = this.extendedMemoryTop;
/* 145 */     this.extendedMemoryTop += size;
/* 146 */     return address;
/*     */   }
/*     */   
/*     */   public void free(int mem$) {
/* 150 */     this.heap.free(mem$);
/*     */   }
/*     */   
/*     */   private void checkMem()
/*     */   {
/* 155 */     if (this.stack < this.heap.getCurrent())
/* 156 */       throw new OutOfMemoryError("Proteus out of memory: " + status());
/*     */   }
/*     */   
/*     */   public String status() {
/* 160 */     return String.format("Bottom:%08X  Base: %08X Top : %08X (%08X)", new Object[] { Integer.valueOf(this.heap.getBase()), Integer.valueOf(this.heap.getCurrent()), Integer.valueOf(this.stack), Integer.valueOf(this.minStack) });
/*     */   }
/*     */   
/*     */   public int getHeapBottom() {
/* 164 */     return this.heap.getBase();
/*     */   }
/*     */   
/*     */   public int getHeapTop()
/*     */   {
/* 169 */     return this.heap.getCurrent();
/*     */   }
/*     */   
/*     */   public void save(Env env, SessionState state, Collection<Runnable> deferred) throws IOException
/*     */   {
/* 174 */     state.comment("Memory Configuration");
/* 175 */     int base = getHeapTop();
/* 176 */     state.set("ram.main.start", 0);
/* 177 */     state.set("ram.main.end", base);
/* 178 */     state.set("ram.ext.start", this.extendedMemoryBase);
/* 179 */     state.set("ram.ext.end", this.extendedMemoryTop);
/* 180 */     OutputStream out = state.getRelativeOutputStream(".ram.gz");
/*     */     try {
/* 182 */       MainMemory.save(out, 0, base);
/*     */     } finally {
/* 184 */       Utils.close(out);
/*     */     }
/* 186 */     int amount = 0;
/* 187 */     int byteLength = this.extendedMemoryTop - this.extendedMemoryBase;
/* 188 */     if (this.extendedMemoryBase != this.extendedMemoryTop) {
/* 189 */       OutputStream pages = state.getRelativeOutputStream(".expages.gz");
/* 190 */       if (pages != null) {
/*     */         try {
/* 192 */           MainMemory.savePages(pages);
/*     */         } finally {
/* 194 */           pages.close();
/*     */         }
/*     */       }
/* 197 */       OutputStream ext = state.getRelativeOutputStream(".exram.gz");
/*     */       try {
/* 199 */         MainMemory.save(ext, this.extendedMemoryBase, byteLength);
/*     */       } finally {
/* 201 */         ext.close();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void restore(Env env, SessionState state, Collection<Runnable> deferred) throws IOException
/*     */   {
/* 208 */     int heapStart = state.intValue("ram.main.start");
/* 209 */     int heapEnd = state.intValue("ram.main.end");
/* 210 */     this.heap.forceCurrent(heapEnd);
/* 211 */     this.extendedMemoryBase = state.intValue("ram.ext.start");
/* 212 */     this.extendedMemoryTop = state.intValue("ram.ext.end");
/* 213 */     InputStream inputStream = state.getRelativeInputStream(".ram.gz");
/*     */     try {
/* 215 */       MainMemory.load(inputStream, heapStart, heapEnd - heapStart);
/*     */     } finally {
/* 217 */       Utils.close(inputStream);
/*     */     }
/* 219 */     if (this.extendedMemoryBase != this.extendedMemoryTop) {
/* 220 */       this.lazyLoader = new LazyMemoryLoader(env, state, this);
/* 221 */       deferred.add(new Runnable() {
/* 222 */         public void run() { MemoryManager.this.lazyLoader.loadExtendedMemory(); }
/*     */       });
/*     */     }
/*     */   }
/*     */   
/*     */   public final LazyMemoryLoader getLazyLoader() {
/* 228 */     return this.lazyLoader;
/*     */   }
/*     */   
/*     */   public int[] loadPage(int pageIndex, int[][] memory, int pageShift) throws IOException {
/* 232 */     int pageSize = 1 << pageShift;
/* 233 */     int pageSizeInts = pageSize >> 2;
/*     */     try {
/* 235 */       if (this.lazyLoader.isNotActive()) {
/* 236 */         int deltaShift = 10 - pageShift;
/* 237 */         int blockIndex = pageIndex >>> deltaShift;
/* 238 */         int pageStart = blockIndex << deltaShift;
/* 239 */         int pageStop = 1 + blockIndex << deltaShift;
/* 240 */         byte[] block = this.lazyLoader.getBlockData(blockIndex);
/* 241 */         int offset; if (this.lazyLoader.pageOnly) {
/* 242 */           offset = pageIndex & (1 << deltaShift) - 1;
/*     */         } else {
/* 244 */           int i = pageStart; for (int bAddr = 0; i < pageStop; bAddr += pageSize) {
/* 245 */             if (memory[i] == null) {
/* 246 */               memory[i] = Utils.toIntArrayLe(block, bAddr, pageSize);
/*     */             }
/* 244 */             i++;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 250 */         return memory[pageIndex];
/*     */       }
/*     */     }
/*     */     catch (NullPointerException npe) {}
/* 254 */     memory[pageIndex] = new int[pageSizeInts];
/* 255 */     return memory[pageIndex];
/*     */   }
/*     */   
/*     */   public static final class LazyMemoryLoader
/*     */     implements Runnable
/*     */   {
/*     */     private final Env env;
/*     */     private final SessionState state;
/*     */     private final MemoryManager memoryManager;
/*     */     private boolean active;
/*     */     private final boolean loadExtended;
/*     */     private final boolean pageOnly;
/*     */     private final String memoryPrefix;
/* 268 */     private final Map<String, byte[]> cache = Collections.synchronizedMap(new HashMap());
/*     */     
/*     */     public LazyMemoryLoader(Env env, SessionState state, MemoryManager memoryManager) {
/* 271 */       this.env = env;
/* 272 */       this.state = state;
/* 273 */       this.memoryManager = memoryManager;
/* 274 */       String s = state.stringValue("memory.inputstream", "???");
/* 275 */       this.memoryPrefix = s;
/* 276 */       this.loadExtended = (!state.booleanValue("no-load"));
/* 277 */       this.pageOnly = state.booleanValue("page-only");
/*     */     }
/*     */     
/*     */ 
/*     */     public void run() {}
/*     */     
/*     */     public void loadExtendedMemory()
/*     */     {
/* 285 */       int base = this.memoryManager.extendedMemoryBase;
/* 286 */       int top = this.memoryManager.extendedMemoryTop;
/* 287 */       int size = top - base;
/*     */       
/*     */ 
/* 290 */       if ((size > 0) && (this.loadExtended)) {
/* 291 */         InputStream input = null;
/*     */         try {
/* 293 */           input = this.state.getRelativeInputStream(".expages.gz");
/* 294 */           if (input != null) MainMemory.loadPages(input);
/*     */         }
/*     */         catch (FileNotFoundException ioe) {}catch (IOException ioe)
/*     */         {
/* 298 */           ioe.printStackTrace();
/*     */         } finally {
/* 300 */           Utils.close(input);
/*     */         }
/* 302 */         this.active = true;
/*     */         try {
/* 304 */           input = this.state.getRelativeInputStream(".exram.gz");
/* 305 */           MainMemory.load(input, base, size);
/*     */         }
/*     */         catch (FileNotFoundException ioe) {}catch (IOException ioe)
/*     */         {
/* 309 */           ioe.printStackTrace();
/*     */         } finally {
/* 311 */           Utils.close(input);
/* 312 */           this.active = false;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */     public byte[] getBlockData(int blockIndex) throws IOException {
/* 318 */       String s = Utils.formatPartial(this.memoryPrefix, blockIndex);
/* 319 */       byte[] data = (byte[])this.cache.remove(s);
/* 320 */       if (data != null) {
/* 321 */         this.cache.put(s, null);
/* 322 */         return data;
/*     */       }
/* 324 */       return readBlock(s);
/*     */     }
/*     */     
/*     */     private byte[] readBlock(String s) throws IOException
/*     */     {
/* 329 */       byte[] tmp = new byte['Ѐ'];
/* 330 */       Utils.readFully(this.state.getRelativeInputStream(s), tmp);
/* 331 */       return tmp;
/*     */     }
/*     */     
/*     */     public boolean isNotActive() {
/* 335 */       return !this.active;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/memory/MemoryManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */