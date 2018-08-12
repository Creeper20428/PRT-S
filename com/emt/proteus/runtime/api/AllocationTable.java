/*     */ package com.emt.proteus.runtime.api;
/*     */ 
/*     */ import com.emt.proteus.runtime.utils.Items;
/*     */ import java.util.Arrays;
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
/*     */ public final class AllocationTable
/*     */ {
/*     */   public static final int MINIMUM_SIZE = 32;
/*     */   public static final int MAX_POW2 = 65536;
/*     */   public static final int MAX_POW2_MULTIPLE = 4096;
/*     */   public static final int INDEX_BITS = 16;
/*     */   private final Items freed;
/*     */   private Block[] entries;
/*     */   private int blockLength;
/*     */   private int current;
/*     */   private final int[] index;
/*     */   
/*     */   public AllocationTable()
/*     */   {
/*  48 */     this.entries = new Block[65536];
/*  49 */     this.blockLength = 0;
/*  50 */     this.freed = new Items(1024, 256);
/*  51 */     this.index = new int[32768];
/*     */   }
/*     */   
/*     */   public void init(int address, int length) {
/*  55 */     this.blockLength = 0;
/*  56 */     Arrays.fill(this.entries, null);
/*  57 */     this.freed.clear();
/*  58 */     this.current = address;
/*  59 */     allocate(length, 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Block allocate(int size, int type)
/*     */   {
/*  70 */     int address = this.current;
/*  71 */     return reserve(address, size, type, null);
/*     */   }
/*     */   
/*     */   private Block reserve(int address, int size, int type, Object data)
/*     */   {
/*  76 */     size = correct_size(size);
/*     */     
/*  78 */     Block entry = findFreedEntry(size, type);
/*  79 */     if (entry == null) {
/*  80 */       entry = new Block(this.blockLength, address, size, type);
/*     */       try {
/*  82 */         this.entries[this.blockLength] = entry;
/*     */       } catch (ArrayIndexOutOfBoundsException aie) {
/*  84 */         Block[] tmp = new Block[this.entries.length << 1];
/*  85 */         System.arraycopy(this.entries, 0, tmp, 0, this.entries.length);
/*  86 */         this.entries = tmp;
/*  87 */         this.entries[this.blockLength] = entry;
/*     */       }
/*  89 */       this.blockLength += 1;
/*  90 */       this.current = Math.max(address + size, this.current);
/*     */     }
/*  92 */     entry.allocate(data);
/*  93 */     return entry;
/*     */   }
/*     */   
/*     */   public Block getBlock(int address) {
/*     */     try {
/*  98 */       int index = indexOf(address);
/*  99 */       return this.entries[index];
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 101 */       throw aie;
/*     */     }
/*     */   }
/*     */   
/*     */   private int indexOf(int address)
/*     */   {
/* 107 */     if ((address >= this.current) || (address < 0)) return -1;
/* 108 */     int low = 0;
/* 109 */     int high = this.blockLength - 1;
/*     */     
/* 111 */     Block[] entries = this.entries;
/* 112 */     while (low <= high) {
/* 113 */       int index = low + high >>> 1;
/* 114 */       int testAddress = entries[index].getAddress();
/* 115 */       int cmp = testAddress - address;
/* 116 */       if (cmp < 0) {
/* 117 */         low = index + 1;
/* 118 */       } else if (cmp > 0) {
/* 119 */         high = index - 1;
/*     */       } else {
/* 121 */         return index;
/*     */       }
/*     */     }
/* 124 */     int index = low;
/* 125 */     return index;
/*     */   }
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
/*     */   public void free(Block entry)
/*     */   {
/* 140 */     entry.free();
/*     */     
/* 142 */     this.freed.add(entry);
/*     */   }
/*     */   
/* 145 */   public void free(int address) { if (address != 0) {
/* 146 */       Block entry = getBlock(address);
/* 147 */       free(entry);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int correct_size(int size)
/*     */   {
/* 157 */     if (size < 32)
/* 158 */       return 32;
/* 159 */     if (size < 65536) {
/* 160 */       int pow2Less = Integer.highestOneBit(size);
/* 161 */       int pow2More = pow2Less << 1;
/* 162 */       if (size == pow2Less) {
/* 163 */         return pow2Less;
/*     */       }
/* 165 */       return pow2More;
/*     */     }
/* 167 */     return (size - 1 & 0xF000) + 4096;
/*     */   }
/*     */   
/*     */   private Block findFreedEntry(int size, int type)
/*     */   {
/* 172 */     for (int i = this.freed.getLength() - 1; i >= 0; i--) {
/* 173 */       Block entry = (Block)this.freed.get(i);
/* 174 */       if (matches(entry, size, type)) {
/* 175 */         return (Block)this.freed.remove(i);
/*     */       }
/*     */     }
/* 178 */     return null;
/*     */   }
/*     */   
/*     */   private boolean matches(Block entry, int size, int type) {
/* 182 */     return entry.size == size;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 188 */     AllocationTable table = new AllocationTable();
/*     */   }
/*     */   
/*     */   public int getCurrent() {
/* 192 */     return this.current;
/*     */   }
/*     */   
/*     */   public int getBase() {
/* 196 */     return this.entries[0].getAddress();
/*     */   }
/*     */   
/*     */ 
/* 200 */   public void forceCurrent(int newValue) { this.current = newValue; }
/*     */   
/*     */   public static class Block {
/*     */     private final int id;
/*     */     private final int address;
/*     */     private final int size;
/*     */     private final int type;
/*     */     private boolean free;
/*     */     private Object object;
/*     */     
/*     */     public Block(int id, int address, int size, int type) {
/* 211 */       this.id = id;
/* 212 */       this.address = address;
/* 213 */       this.size = size;
/* 214 */       this.type = type;
/*     */     }
/*     */     
/* 217 */     public boolean isFree() { return this.free; }
/*     */     
/*     */     public void free()
/*     */     {
/* 221 */       if (this.free)
/* 222 */         throw new IllegalStateException("Already freed memory");
/* 223 */       this.free = true;
/* 224 */       this.object = null;
/*     */     }
/*     */     
/*     */     public int getId() {
/* 228 */       return this.id;
/*     */     }
/*     */     
/*     */     public int getAddress() {
/* 232 */       return this.address;
/*     */     }
/*     */     
/*     */     public int getSize() {
/* 236 */       return this.size;
/*     */     }
/*     */     
/*     */     public int getType() {
/* 240 */       return this.type;
/*     */     }
/*     */     
/*     */     public Object get() {
/* 244 */       return this.object;
/*     */     }
/*     */     
/* 247 */     public void set(Object object) { this.object = object; }
/*     */     
/*     */     public void allocate(Object data)
/*     */     {
/* 251 */       this.free = false;
/* 252 */       this.object = data;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/api/AllocationTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */