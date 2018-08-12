/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import com.emt.proteus.lib.app.MainCtx;
/*     */ import com.emt.proteus.lib.utils.IoSystem;
/*     */ import com.emt.proteus.lib.utils.io.FileProxy;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.lib.session.SaveRestoreHandler;
/*     */ import com.emt.proteus.runtime.lib.session.SessionState;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
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
/*     */ public class IoSys
/*     */   implements SaveRestoreHandler
/*     */ {
/*     */   public static final int MEMORY_FILE_LIMIT = 16777216;
/*     */   private final DescriptorIndex descriptors2handles;
/*     */   public static final String DEV_CONSOLE = "/dev/console";
/*     */   public static final int PRINTSTREAM = -2;
/*     */   public static final int CONSOLE = -1;
/*     */   public static final int DEFAULT = 0;
/*     */   public static final int MEMORY_HANDLE = 1;
/*     */   public static final int CACHED = 2;
/*     */   public static final int COPYONWRITE = 3;
/*     */   public static final int CTXCOPYONWRITE = 4;
/*     */   public static final int SIMPLE_PROXY = 5;
/*     */   public static final int VERIFY = 1000;
/*     */   public static final int MEM_STREAM_RTTI = -16711680;
/*     */   public static final int MEM_OSTREAM_RTTI = -16711672;
/*     */   public static final int MEM_STRBUF_RTTI = -16711668;
/*     */   public static final int MEM_IOSBASE_RTTI = -16711628;
/*     */   public static final int FILE_RTTI = -16646144;
/*     */   public static final int FILE_OSTREAM_RTTI = -16646136;
/*     */   public static final int FILE_STRBUF_RTTI = -16646132;
/*     */   public static final int FILE_IOSBASE_RTTI = -16646092;
/*     */   private static final int IO_VTABLE_MEM_STREAM_START = 2304;
/*     */   private static final int IO_VTABLE_FILE_STREAM_START = 2560;
/*  75 */   private static final int[] FILESTREAM_VTABLE = { 0, 0, 0, 0, 0, 52, 0, -16646144, 0, 0, 0, 0, 0, 0, -8, -16646136, 0, 0, 0, 0, 0, 40, -12, -16646132, 0, 0, 0, 0, 0, 0, -52, -16646092 };
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
/*  86 */   private static final int[] MEMSTREAM_VTABLE = { 0, 0, 0, 0, 0, 52, 0, -16711680, 0, 0, 0, 0, 0, 44, -8, -16711672, 0, 0, 0, 0, 0, 40, -12, -16711668, 0, 0, 0, 0, 0, 0, -52, -16711628 };
/*     */   
/*     */ 
/*     */   public static final int DEFAULT_FMT = 4224;
/*     */   
/*     */ 
/*     */   private static final int IO_VTABLE_FILE_STREAM = 2592;
/*     */   
/*     */ 
/*     */   private static final int IO_VTABLE_FILE_OSTREAM = 2624;
/*     */   
/*     */ 
/*     */   private static final int IO_VTABLE_FILE_BUF = 2656;
/*     */   
/*     */ 
/*     */   private static final int IO_VTABLE_FILE_IOSBASE = 2688;
/*     */   
/*     */   private static final int IO_VTABLE_MEM_STREAM = 2336;
/*     */   
/*     */   private static final int IO_VTABLE_MEM_OSTREAM = 2368;
/*     */   
/*     */   private static final int IO_VTABLE_MEM_STRINGBUF = 2368;
/*     */   
/*     */   private static final int IO_VTABLE_MEM_IOSBASE = 2384;
/*     */   
/* 111 */   private static int[] MEMSTREAM_IMAGE = { 2336, 0, 2368, 2368, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2384, 0, 0, 4224, 0, 0, 0 };
/*     */   
/*     */ 
/*     */ 
/* 115 */   private static int[] FILESTREAM_IMAGE = { 2592, 0, 2624, 2656, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2688, 0, 0, 4224, 0, 0, 0 };
/*     */   
/*     */ 
/*     */   private static final String DEV_STDERR = "/dev/stderr";
/*     */   
/*     */ 
/*     */   private final ConsoleIoHandle console;
/*     */   
/*     */ 
/*     */   private final IoHandle stderr;
/*     */   
/*     */ 
/*     */ 
/*     */   public IoSys()
/*     */   {
/* 130 */     this.descriptors2handles = new DescriptorIndex(null);
/* 131 */     this.stderr = new PrintStreamIoHandle(this, "/dev/stderr", System.err, -1, 1800);
/* 132 */     this.console = new ConsoleIoHandle(this, "/dev/console", 1, 1792);
/*     */   }
/*     */   
/*     */   public IoSys(PrintStream out) {
/* 136 */     this.descriptors2handles = new DescriptorIndex(null);
/* 137 */     this.stderr = new PrintStreamIoHandle(this, "/dev/stderr", System.err, -1, 1800);
/* 138 */     this.console = new ConsoleIoHandle(this, out, "/dev/console", 1, 1792);
/*     */   }
/*     */   
/*     */   public void start() {
/* 142 */     this.descriptors2handles.clear();
/* 143 */     MainMemory.store(2560, FILESTREAM_VTABLE, FILESTREAM_VTABLE.length);
/* 144 */     MainMemory.store(2304, MEMSTREAM_VTABLE, MEMSTREAM_VTABLE.length);
/*     */     
/* 146 */     registerHandle(this.console);
/* 147 */     registerHandle(this.stderr);
/* 148 */     MainMemory.setI32Aligned(this.console.getAddress(), this.console.getAddress());
/* 149 */     MainMemory.setI32Aligned(this.stderr.getAddress(), this.stderr.getAddress());
/*     */     
/* 151 */     initStream(1808, this.console, FILESTREAM_IMAGE);
/* 152 */     initStream(2048, this.stderr, FILESTREAM_IMAGE);
/* 153 */     this.console.setStreamDefaults();
/* 154 */     this.stderr.setStreamDefaults();
/*     */   }
/*     */   
/*     */   public IoHandle getByAddress(int address) {
/* 158 */     switch (address) {
/*     */     case 1800: 
/* 160 */       return this.stderr;
/*     */     case 1792: 
/* 162 */       return this.console;
/*     */     }
/*     */     try {
/* 165 */       int handleId = MainMemory.getI32Aligned(address);
/* 166 */       return getByDescriptor(handleId);
/*     */     } catch (ArrayIndexOutOfBoundsException aie) {
/* 168 */       aie.printStackTrace();
/* 169 */       throw aie;
/*     */     }
/*     */   }
/*     */   
/*     */   public IoHandle getStreamByAddress(int stream)
/*     */   {
/* 175 */     switch (stream) {
/*     */     case 2048: 
/* 177 */       return this.stderr;
/*     */     case 1808: 
/* 179 */       return this.console;
/*     */     }
/* 181 */     int handleAddress = getHandleAddressFor(stream);
/* 182 */     if (handleAddress != 0) {
/* 183 */       int handleId = MainMemory.getI32Aligned(handleAddress);
/* 184 */       if (handleId > 0) {
/* 185 */         return getByDescriptor(handleId);
/*     */       }
/*     */     }
/* 188 */     System.out.printf(".......No Handle at %08X\n", new Object[] { Integer.valueOf(stream) });
/* 189 */     return null;
/*     */   }
/*     */   
/*     */   public IoHandle getByDescriptor(int desc)
/*     */   {
/* 194 */     return this.descriptors2handles.get(desc);
/*     */   }
/*     */   
/*     */   public ConsoleIoHandle getConsole() {
/* 198 */     return this.console;
/*     */   }
/*     */   
/*     */   public IoHandle getStdErr() {
/* 202 */     return this.stderr;
/*     */   }
/*     */   
/*     */   public IoHandle open(String fileName, String mode) {
/*     */     try {
/* 207 */       IoSystem ioSystem = MainCtx.getIoSystem();
/* 208 */       boolean readOnly = mode.equals("r");
/* 209 */       FileProxy file = ioSystem.getFile(fileName, !readOnly);
/* 210 */       if (file == null) return null;
/* 211 */       int address = MainMemory.malloc(4, fileName);
/* 212 */       int desc = this.descriptors2handles.nextDescriptor();
/*     */       
/* 214 */       long length = file.getLength();
/* 215 */       IoHandle handle; IoHandle handle; if (length > 0L) { IoHandle handle;
/* 216 */         if (length > 16777216L)
/*     */         {
/* 218 */           handle = new CopyOnWriteIoHandle(this, file, mode, desc, address);
/*     */         }
/*     */         else {
/* 221 */           handle = new MemoryIoHandle(this, fileName, mode, desc, address);
/*     */         }
/*     */       } else {
/* 224 */         handle = new ProxyIoHandle(this, file, mode, desc, address);
/*     */       }
/* 226 */       return registerHandle(handle);
/*     */     } catch (IOException e) {}
/* 228 */     return null;
/*     */   }
/*     */   
/*     */   public IoHandle openFileStream(int stream, String fileName, int openMode)
/*     */   {
/*     */     try {
/* 234 */       MainMemory.setI32Aligned(stream, 0);
/* 235 */       IoSystem ioSystem = MainCtx.getIoSystem();
/* 236 */       boolean writeable = OpenMode.isWritable(openMode);
/* 237 */       FileProxy file = ioSystem.getFile(fileName, writeable);
/* 238 */       if (file == null) return null;
/* 239 */       String mode = writeable ? "rw" : "r";
/* 240 */       int desc = this.descriptors2handles.nextDescriptor();
/*     */       
/*     */ 
/* 243 */       IoHandle ioHandle = new ProxyIoHandle(this, file, mode, desc, stream);
/* 244 */       if (OpenMode.seekEnd(openMode)) {
/* 245 */         ioHandle.end();
/* 246 */       } else if (writeable) {
/* 247 */         ioHandle.truncate(0L);
/*     */       }
/* 249 */       int[] baseImage = FILESTREAM_IMAGE;
/* 250 */       initStream(stream, ioHandle, baseImage);
/* 251 */       return ioHandle;
/*     */     } catch (IOException e) {}
/* 253 */     return null;
/*     */   }
/*     */   
/*     */   public IoHandle createMemoryStream(int stream, byte[] content, int openMode)
/*     */   {
/*     */     try {
/* 259 */       int desc = this.descriptors2handles.nextDescriptor();
/* 260 */       boolean writeable = OpenMode.isWritable(openMode);
/* 261 */       String mode = writeable ? "rw" : "r";
/* 262 */       IoHandle ioHandle = new MemoryIoHandle(this, "string", content, mode, desc, stream);
/* 263 */       if (OpenMode.seekEnd(openMode)) {
/* 264 */         ioHandle.end();
/* 265 */       } else if (writeable) {
/* 266 */         ioHandle.truncate(0L);
/*     */       }
/* 268 */       initStream(stream, ioHandle, MEMSTREAM_IMAGE);
/* 269 */       return ioHandle;
/*     */     } catch (IOException e) {}
/* 271 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   private void initStream(int stream, IoHandle ioHandle, int[] baseImage)
/*     */   {
/* 277 */     registerHandle(stream, ioHandle);
/* 278 */     MainMemory.store(stream, baseImage, baseImage.length);
/* 279 */     int fd = ioHandle.getDescriptor();
/* 280 */     int address = getHandleAddressFor(stream);
/* 281 */     MainMemory.setI32Aligned(address, fd);
/* 282 */     ioHandle.setFormatAddress(getFormatAddressFor(stream));
/*     */   }
/*     */   
/*     */   private IoHandle registerHandle(IoHandle handle) {
/* 286 */     registerHandle(handle.getAddress(), handle);
/* 287 */     return handle;
/*     */   }
/*     */   
/*     */   private IoHandle registerHandle(int struct$, IoHandle handle) {
/* 291 */     this.descriptors2handles.put(handle);
/* 292 */     MainMemory.setI32(struct$, handle.getDescriptor());
/* 293 */     return handle;
/*     */   }
/*     */   
/*     */   public static String getCwdPath() {
/*     */     try {
/* 298 */       return new File(".").getCanonicalPath();
/*     */     } catch (IOException e) {}
/* 300 */     return "";
/*     */   }
/*     */   
/*     */   public void dispose(IoHandle ioHandle)
/*     */   {
/* 305 */     this.descriptors2handles.remove(ioHandle);
/*     */   }
/*     */   
/*     */ 
/*     */   public void stop() {}
/*     */   
/*     */ 
/*     */   private static class DescriptorIndex
/*     */   {
/* 314 */     private IoHandle[] handles = new IoHandle['Ā'];
/* 315 */     private int length = 0;
/*     */     
/*     */     public IoHandle get(int desc) {
/* 318 */       return this.handles[to_index(desc)];
/*     */     }
/*     */     
/*     */     private int to_index(int desc) {
/* 322 */       return Math.max(0, desc);
/*     */     }
/*     */     
/*     */     public int nextDescriptor() {
/* 326 */       return this.length;
/*     */     }
/*     */     
/*     */     public void put(IoHandle handle) {
/* 330 */       int index = to_index(handle.getDescriptor());
/* 331 */       this.handles[index] = handle;
/* 332 */       this.length = Math.max(++this.length, index + 1);
/*     */     }
/*     */     
/*     */ 
/*     */     public void clear()
/*     */     {
/* 338 */       this.length = 0;
/* 339 */       Arrays.fill(this.handles, null);
/*     */     }
/*     */     
/*     */     public void remove(IoHandle handle)
/*     */     {
/* 344 */       int index = to_index(handle.getDescriptor());
/* 345 */       this.handles[index] = null;
/* 346 */       for (int i = this.length; i >= 0; i--) {
/* 347 */         if (this.handles[i] != null) break;
/* 348 */         this.length = i;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void restore(Env env, SessionState properties, Collection<Runnable> deferred)
/*     */     throws IOException
/*     */   {
/* 359 */     boolean fileAccess = MainCtx.isFileAccess();
/* 360 */     int length = properties.intValue("iosys.handle.count");
/* 361 */     for (int i = 0; i < length; i++) {
/* 362 */       String prefix = "iosys.handle." + i;
/* 363 */       int descriptor = properties.intValue(prefix + ".descriptor");
/* 364 */       int address = properties.intValue(prefix + ".address");
/* 365 */       String name = properties.stringValue(prefix + ".name");
/* 366 */       String mode = properties.stringValue(prefix + ".mode");
/* 367 */       long flen = properties.longValue(prefix + ".length", -1L);
/* 368 */       int type = properties.intValue(prefix + ".type");
/*     */       
/*     */       IoHandle handle;
/* 371 */       switch (type) {
/*     */       case 1: 
/* 373 */         handle = new MemoryIoHandle(this, name, mode, descriptor, address);
/* 374 */         break;
/*     */       case 3: 
/*     */       case 4: 
/* 377 */         handle = createCopyOnWriteHandle(descriptor, address, name, mode);
/* 378 */         break;
/*     */       
/*     */ 
/*     */ 
/*     */       case 0: 
/*     */       case 1000: 
/*     */       default: 
/* 385 */         handle = createCopyOnWriteHandle(descriptor, address, name, mode);
/*     */       }
/*     */       
/* 388 */       this.descriptors2handles.put(handle);
/*     */     }
/*     */   }
/*     */   
/*     */   private IoHandle createCopyOnWriteHandle(int descriptor, int address, String name, String mode) throws IOException
/*     */   {
/*     */     IoHandle handle;
/*     */     try {
/* 396 */       handle = new CopyOnWriteIoHandle(this, MainCtx.getFile(name), mode, descriptor, address);
/*     */     } catch (IOException ie) {
/* 398 */       throw ie;
/*     */     } catch (Exception e) {
/* 400 */       e.printStackTrace();
/* 401 */       throw new IOException(e);
/*     */     }
/* 403 */     return handle;
/*     */   }
/*     */   
/*     */   public void save(Env env, SessionState properties, Collection<Runnable> deferred) throws IOException
/*     */   {
/* 408 */     int length = this.descriptors2handles.length;
/* 409 */     properties.comment("Open Files at session save");
/* 410 */     int used = 0;
/* 411 */     for (int i = 0; i < length; i++) {
/* 412 */       IoHandle handle = this.descriptors2handles.handles[i];
/* 413 */       if (handle != null) {
/* 414 */         int type = handle.getType();
/* 415 */         if (type >= 0) {
/* 416 */           int descriptor = handle.getDescriptor();
/* 417 */           int address = handle.getAddress();
/* 418 */           String name = handle.getName();
/* 419 */           String mode = handle.getMode();
/* 420 */           handle.saveChanges();
/* 421 */           String prefix = "iosys.handle." + used;
/* 422 */           properties.set(prefix + ".descriptor", descriptor);
/* 423 */           properties.set(prefix + ".address", address);
/* 424 */           properties.set(prefix + ".name", name);
/* 425 */           properties.set(prefix + ".mode", mode);
/* 426 */           properties.set(prefix + ".type", type);
/* 427 */           properties.set(prefix + ".length", handle.getLength());
/* 428 */           used++;
/*     */         } } }
/* 430 */     properties.set("iosys.handle.count", used);
/*     */   }
/*     */   
/*     */   private static int getHandleAddressFor(int stream_address)
/*     */   {
/* 435 */     int vttable = MainMemory.getI32Aligned(stream_address);
/* 436 */     int topoffset = MainMemory.getI32Aligned(vttable - 8);
/* 437 */     return stream_address + topoffset + 4;
/*     */   }
/*     */   
/*     */   private static int getFormatAddressFor(int stream_address) {
/* 441 */     int vttable = MainMemory.getI32Aligned(stream_address);
/* 442 */     int baseoffset = MainMemory.getI32Aligned(vttable - 12);
/* 443 */     int fieldoffset = 12;
/* 444 */     return stream_address + baseoffset + fieldoffset;
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/IoSys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */