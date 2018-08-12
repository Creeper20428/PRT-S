/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.CharSource;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
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
/*     */ public final class IoLib
/*     */ {
/*  40 */   private static IoSys __HANDLES = new IoSys();
/*     */   
/*     */   public static final int SEEK_SET = 0;
/*     */   
/*     */   public static final int SEEK_CUR = 1;
/*     */   
/*     */   public static final int SEEK_END = 2;
/*     */   
/*     */   public static final int O_ACCMODE = 3;
/*     */   
/*     */   public static final int O_RDONLY = 0;
/*     */   
/*     */   public static final int O_WRONLY = 1;
/*     */   
/*     */   public static final int O_RDWR = 2;
/*     */   
/*     */   public static final int O_CREAT = 64;
/*     */   
/*     */   public static final int O_EXCL = 128;
/*     */   
/*     */   public static final int O_NOCTTY = 256;
/*     */   
/*     */   public static final int O_TRUNC = 512;
/*     */   public static final int O_APPEND = 1024;
/*     */   public static final int O_NONBLOCK = 2048;
/*     */   public static final int O_NDELAY = 2048;
/*     */   public static final int O_SYNC = 4096;
/*     */   public static final int FASYNC = 8192;
/*     */   public static final int O_DIRECT = 16384;
/*     */   public static final int O_LARGEFILE = 32768;
/*     */   public static final int O_DIRECTORY = 65536;
/*     */   public static final int O_NOFOLLOW = 131072;
/*     */   
/*     */   public static void setStdOut(PrintStream p)
/*     */   {
/*  75 */     __HANDLES = new IoSys(p);
/*     */   }
/*     */   
/*     */   public static IoHandle getStdIn() {
/*  79 */     return __HANDLES.getConsole();
/*     */   }
/*     */   
/*     */   public static IoHandle getStdOut() {
/*  83 */     return __HANDLES.getConsole();
/*     */   }
/*     */   
/*     */   public static IoHandle getStdErr() {
/*  87 */     return __HANDLES.getStdErr();
/*     */   }
/*     */   
/*     */   public static int mkstemp(int pbyte_0) {
/*  91 */     throw new UnsupportedOperationException("mkstemp");
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
/*     */   public static int mmap(int p_start, int length, int prot, int flags, int fd, long offset)
/*     */   {
/* 106 */     throw new UnsupportedOperationException("mmap");
/*     */   }
/*     */   
/*     */   public static int msync(int p_start, int length, int flags) {
/* 110 */     throw new UnsupportedOperationException("msync");
/*     */   }
/*     */   
/*     */   public static int munmap(int p_start, int length) {
/* 114 */     throw new UnsupportedOperationException("munmap");
/*     */   }
/*     */   
/*     */   public static int unlink(int pbyte_0) {
/* 118 */     throw new UnsupportedOperationException("unlink");
/*     */   }
/*     */   
/*     */   public static int select(int i_0, int pstruct$__sigset_t_1, int pstruct$__sigset_t_2, int pstruct$__sigset_t_3, int pstruct$$0$_155_4) {
/* 122 */     throw new UnsupportedOperationException("select");
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
/*     */   public static int ioctl(int i_0, int i_1, int[] var_args)
/*     */   {
/* 135 */     throw new UnsupportedOperationException("ioctl");
/*     */   }
/*     */   
/*     */   public static int fcntl(int i_0, int i_1, int[] var_args) {
/* 139 */     throw new UnsupportedOperationException("fcntl");
/*     */   }
/*     */   
/*     */   public static int fscanf(int pstruct$FILE_0, int pbyte_1, int[] var_args) {
/* 143 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_0);
/* 144 */     throw new UnsupportedOperationException("fscanf");
/*     */   }
/*     */   
/*     */   public static CharSource getCharSequence(int pstruct$FILE_0) {
/* 148 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_0);
/* 149 */     return handle.getCharSource();
/*     */   }
/*     */   
/*     */   public static int vfprintf(int pstruct$FILE_0, int pbyte_1, int pbyte_2) {
/* 153 */     throw new UnsupportedOperationException("vfprintf");
/*     */   }
/*     */   
/*     */   public static int out(int outstream, StringBuilder b)
/*     */   {
/* 158 */     IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 159 */     handle.out(b);
/* 160 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int out(int outstream, String b) {
/* 164 */     IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 165 */     handle.out(b);
/* 166 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int out(int outstream, int i) {
/* 170 */     IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 171 */     handle.out(i);
/* 172 */     return outstream;
/*     */   }
/*     */   
/* 175 */   public static int out(int outstream, boolean i) { IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 176 */     handle.out(i);
/* 177 */     return outstream;
/*     */   }
/*     */   
/* 180 */   public static int out(int outstream, long i) { IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 181 */     handle.out(i);
/* 182 */     return outstream;
/*     */   }
/*     */   
/* 185 */   public static int out(int outstream, float i) { IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 186 */     handle.out(i);
/* 187 */     return outstream;
/*     */   }
/*     */   
/* 190 */   public static int out(int outstream, double i) { IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 191 */     handle.out(i);
/* 192 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int out(int outstream, short i) {
/* 196 */     IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 197 */     handle.out(i);
/* 198 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int flush(int ostream) {
/* 202 */     IoHandle handle = __HANDLES.getStreamByAddress(ostream);
/* 203 */     handle.flush();
/* 204 */     return ostream;
/*     */   }
/*     */   
/*     */   public static int out(int outstream, char i) {
/* 208 */     IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 209 */     handle.out(i);
/* 210 */     return outstream;
/*     */   }
/*     */   
/* 213 */   public static int ostreamSetWidth(int outstream, int width) { IoHandle handle = __HANDLES.getStreamByAddress(outstream);
/* 214 */     handle.setWidth(width);
/* 215 */     return outstream;
/*     */   }
/*     */   
/*     */   public static int fstat(int fd, int p_stats_struct) {
/* 219 */     IoHandle fh = __HANDLES.getByDescriptor(fd);
/* 220 */     Stat stats = fh.stat();
/* 221 */     byte[] bytes = stats.getBytes();
/* 222 */     MainMemory.store(p_stats_struct, bytes);
/* 223 */     return 0;
/*     */   }
/*     */   
/*     */   public static int fstat64(int fd, int stat64$) {
/* 227 */     IoHandle fh = __HANDLES.getByDescriptor(fd);
/* 228 */     fh.stat64(stat64$);
/* 229 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public static int fclose(int pstruct$FILE_0)
/*     */   {
/* 235 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_0);
/* 236 */     return handle.fclose();
/*     */   }
/*     */   
/*     */   public static int feof(int pstruct$FILE_0)
/*     */   {
/* 241 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_0);
/* 242 */     return handle.feof();
/*     */   }
/*     */   
/* 245 */   public static int ferror(int pstruct$FILE_0) { IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_0);
/* 246 */     return handle.ferror();
/*     */   }
/*     */   
/*     */   public static boolean streamEof(int stream)
/*     */   {
/* 251 */     IoHandle handle = __HANDLES.getStreamByAddress(stream);
/* 252 */     return handle.feof() != 0;
/*     */   }
/*     */   
/*     */   public static int fflush(int pstruct$FILE_0) {
/* 256 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_0);
/* 257 */     return handle.flush();
/*     */   }
/*     */   
/*     */   public static int fgets(int pbyte_0, int i_1, int pstruct$FILE_2) {
/* 261 */     IoHandle fh = __HANDLES.getByAddress(pstruct$FILE_2);
/* 262 */     return fh.fgets(pbyte_0, i_1);
/*     */   }
/*     */   
/*     */   public static long ftello(int pstruct$FILE_2) {
/* 266 */     IoHandle fh = __HANDLES.getByAddress(pstruct$FILE_2);
/* 267 */     return fh.getPosition();
/*     */   }
/*     */   
/*     */   public static int fgetc(int pstruct$FILE_2) {
/* 271 */     IoHandle fh = __HANDLES.getByAddress(pstruct$FILE_2);
/* 272 */     return fh.fgetc();
/*     */   }
/*     */   
/*     */   public static int fopen(int p_path, int pmode) {
/* 276 */     String fileName = MainMemory.getString(p_path);
/* 277 */     String mode = MainMemory.getString(pmode);
/* 278 */     mode = standardizeMode(mode);
/* 279 */     IoHandle fileHandle = __HANDLES.open(fileName, mode);
/* 280 */     return fileHandle != null ? fileHandle.getAddress() : 0;
/*     */   }
/*     */   
/*     */   public static void clearerr(int pstruct$FILE_2) {
/* 284 */     IoHandle fh = __HANDLES.getByAddress(pstruct$FILE_2);
/* 285 */     fh.clearerr();
/*     */   }
/*     */   
/*     */   private static String standardizeMode(String mode) {
/* 289 */     if ((mode.equals("w")) || (mode.equals("wb"))) {
/* 290 */       mode = "rw";
/* 291 */     } else if (mode.equals("rb")) {
/* 292 */       mode = "r";
/*     */     }
/* 294 */     return mode;
/*     */   }
/*     */   
/*     */   public static int fprint(int pstruct$FILE_0, String literal)
/*     */   {
/* 299 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_0);
/* 300 */     return handle.print(literal);
/*     */   }
/*     */   
/*     */   public static int fputc(int i_0, int pstruct$FILE_1) {
/* 304 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_1);
/* 305 */     return handle.fputc((char)i_0);
/*     */   }
/*     */   
/*     */   public static int fputs(int pbyte_0, int pstruct$FILE_1) {
/* 309 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_1);
/* 310 */     String s = MainMemory.getString(pbyte_0);
/* 311 */     return handle.fputs(s);
/*     */   }
/*     */   
/*     */   public static int fread(int pbyte_0, int i_1, int i_2, int pstruct$FILE_3) {
/* 315 */     IoHandle handle = __HANDLES.getByAddress(pstruct$FILE_3);
/* 316 */     return handle.read(pbyte_0, i_1 * i_2);
/*     */   }
/*     */   
/*     */   public static int fwrite(int address, int sizeof, int countof, int p_file) {
/* 320 */     IoHandle fHandle = __HANDLES.getByAddress(p_file);
/*     */     try {
/* 322 */       return MainMemory.write(address, sizeof * countof, fHandle);
/*     */     } catch (IOException e) {}
/* 324 */     return -1;
/*     */   }
/*     */   
/*     */   public static int open(int p_path, int imode, int[] var_args)
/*     */   {
/* 329 */     String fileName = MainMemory.getString(p_path);
/* 330 */     if (fileName.equals("/dev/console"))
/* 331 */       return -1;
/* 332 */     String modestring = "rw";
/* 333 */     if ((imode & 0xF) == 0) modestring = "r";
/* 334 */     IoHandle handle = __HANDLES.open(fileName, modestring);
/* 335 */     return safeHandle(handle);
/*     */   }
/*     */   
/*     */   private static int safeHandle(IoHandle handle) {
/* 339 */     return handle != null ? handle.getDescriptor() : -1;
/*     */   }
/*     */   
/*     */   private static String openModeToMode(int openMode) {
/* 343 */     boolean input = (openMode & 0x8) != 0;
/* 344 */     boolean output = ((openMode & 0x10) != 0) || ((openMode & 0x1) != 0);
/* 345 */     boolean trunc = (openMode & 0x20) != 0;
/* 346 */     String mode = "";
/* 347 */     if (output) {
/* 348 */       mode = "rw";
/*     */     } else {
/* 350 */       mode = "r";
/*     */     }
/* 352 */     return mode;
/*     */   }
/*     */   
/*     */   public static int streamOpen(int stream, String fileName, int openMode) {
/* 356 */     IoHandle handle = __HANDLES.openFileStream(stream, fileName, openMode);
/* 357 */     return stream;
/*     */   }
/*     */   
/* 360 */   public static int istreamOpen(int stream, String fileName, int openMode) { return streamOpen(stream, fileName, openMode); }
/*     */   
/*     */   public static int ostreamOpen(int stream, String fileName, int openMode) {
/* 363 */     return streamOpen(stream, fileName, openMode);
/*     */   }
/*     */   
/*     */   public static void openMemoryStream(int stream, byte[] content, int openMode)
/*     */   {
/* 368 */     IoHandle handle = __HANDLES.createMemoryStream(stream, content, openMode);
/*     */   }
/*     */   
/*     */   public static void openMemoryOstream(int stream, int openMode) {
/* 372 */     IoHandle handle = __HANDLES.createMemoryStream(stream, null, openMode);
/*     */   }
/*     */   
/*     */   public static void memoryStreamSetContents(int stream, byte[] content)
/*     */   {
/* 377 */     MemoryIoHandle handle = (MemoryIoHandle)__HANDLES.getStreamByAddress(stream);
/* 378 */     handle.setContents(content);
/*     */   }
/*     */   
/* 381 */   public static byte[] memoryStreamGetContents(int stream) { MemoryIoHandle handle = (MemoryIoHandle)__HANDLES.getStreamByAddress(stream);
/* 382 */     return handle.getContents();
/*     */   }
/*     */   
/* 385 */   public static String memoryStreamGetStringContents(int stream) { MemoryIoHandle handle = (MemoryIoHandle)__HANDLES.getStreamByAddress(stream);
/* 386 */     return handle.getStringContents();
/*     */   }
/*     */   
/*     */   public static void disposeStream(int stream)
/*     */   {
/* 391 */     IoHandle ioHandle = __HANDLES.getStreamByAddress(stream);
/* 392 */     if (ioHandle != null) {
/* 393 */       ioHandle.fclose();
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean isOpen(int stream) {
/* 398 */     return MainMemory.getI32Aligned(stream) > 0;
/*     */   }
/*     */   
/*     */   public static int read(int handle$, int buf$, int len) {
/* 402 */     IoHandle handle = __HANDLES.getByDescriptor(handle$);
/* 403 */     return handle.read(buf$, len);
/*     */   }
/*     */   
/*     */   public static int stat(int p_fileName, int p_stats_struct)
/*     */   {
/* 408 */     Stat stats = Stat.stat(MainMemory.getString(p_fileName));
/* 409 */     byte[] bytes = stats.getBytes();
/* 410 */     MainMemory.store(p_stats_struct, bytes);
/* 411 */     return 0;
/*     */   }
/*     */   
/* 414 */   public static int stat64(int path$, int stat64$) { Stat.stat64(MainMemory.getString(path$), stat64$);
/* 415 */     return 0;
/*     */   }
/*     */   
/*     */   public static int write(int fd, int address, int amount)
/*     */   {
/* 420 */     IoHandle fHandle = __HANDLES.getByDescriptor(fd);
/*     */     try {
/* 422 */       return MainMemory.write(address, amount, fHandle);
/*     */     } catch (IOException e) {}
/* 424 */     return -1;
/*     */   }
/*     */   
/*     */   public static int puts(int pbyte_0)
/*     */   {
/* 429 */     return print(MainMemory.getString(pbyte_0) + "\n");
/*     */   }
/*     */   
/*     */   public static int perror(String text)
/*     */   {
/* 434 */     System.err.println(text);
/* 435 */     return text.length();
/*     */   }
/*     */   
/*     */   public static int print(String text) {
/* 439 */     System.out.print(text);
/* 440 */     return text.length();
/*     */   }
/*     */   
/*     */   public static int print(char text) {
/* 444 */     System.out.print(text);
/* 445 */     return text;
/*     */   }
/*     */   
/*     */   public static long lseek(int fd, long offset, int from) {
/* 449 */     IoHandle fh = __HANDLES.getByDescriptor(fd);
/* 450 */     long seek = fh.seek(offset, from);
/* 451 */     return seek;
/*     */   }
/*     */   
/* 454 */   public static int fseek(int p_file, long position, int whence) { IoHandle handle = __HANDLES.getByAddress(p_file);
/* 455 */     long seek = handle.seek(position, whence);
/* 456 */     return 0;
/*     */   }
/*     */   
/*     */   public static int close(int fd)
/*     */   {
/* 461 */     IoHandle fh = __HANDLES.getByDescriptor(fd);
/* 462 */     int fclose = fh.fclose();
/* 463 */     __HANDLES.dispose(fh);
/* 464 */     return fclose;
/*     */   }
/*     */   
/* 467 */   public static int closeStream(int stream) { int fd = MainMemory.getI32Aligned(stream);
/* 468 */     if (fd > 0) {
/* 469 */       close(fd);
/*     */     }
/* 471 */     return stream;
/*     */   }
/*     */   
/* 474 */   public static int dispose(int stream) { int fd = MainMemory.getI32Aligned(stream);
/* 475 */     if (fd > 0) {
/* 476 */       close(fd);
/*     */     }
/* 478 */     return stream;
/*     */   }
/*     */   
/*     */   public static void install(Env env) {
/* 482 */     env.addSaveRestoreHandler(__HANDLES);
/*     */   }
/*     */   
/* 485 */   public static void start() { __HANDLES.start(); }
/*     */   
/*     */   public static void stop() {
/* 488 */     __HANDLES.stop();
/*     */   }
/*     */   
/*     */   public static void streamGetLine(int stream, StringBuilder builder, int delimiter) {
/* 492 */     IoHandle ioStream = __HANDLES.getStreamByAddress(stream);
/* 493 */     ioStream.getLine(builder, delimiter, Integer.MAX_VALUE);
/*     */   }
/*     */   
/*     */   public static void streamGetString(int stream, StringBuilder builder) {
/* 497 */     IoHandle ioStream = __HANDLES.getStreamByAddress(stream);
/* 498 */     ioStream.getWord(builder);
/*     */   }
/*     */   
/* 501 */   public static double streamGetDouble(int stream) { IoHandle ioStream = __HANDLES.getStreamByAddress(stream);
/* 502 */     double aDouble = ioStream.getDouble();
/* 503 */     return aDouble;
/*     */   }
/*     */   
/* 506 */   public static long streamGetLong(int stream) { IoHandle ioStream = __HANDLES.getStreamByAddress(stream);
/* 507 */     long aLong = ioStream.getLong();
/* 508 */     return aLong;
/*     */   }
/*     */   
/*     */   public static void flushOutStream(int ostream) {
/* 512 */     IoHandle ioStream = __HANDLES.getStreamByAddress(ostream);
/* 513 */     ioStream.flush();
/*     */   }
/*     */   
/*     */   public static void ostreamSetFill(int ostream, int chr)
/*     */   {
/* 518 */     IoHandle ioStream = __HANDLES.getStreamByAddress(ostream);
/* 519 */     ioStream.setFill(MainMemory.getChar(chr));
/*     */   }
/*     */   
/* 522 */   public static void ostreamSetFlags(int ostream, int flags) { IoHandle ioStream = __HANDLES.getStreamByAddress(ostream);
/* 523 */     ioStream.setFlags(flags);
/*     */   }
/*     */   
/* 526 */   public static void ostreamResetFlags(int ostream, int flags) { IoHandle ioStream = __HANDLES.getStreamByAddress(ostream);
/* 527 */     ioStream.resetFlags(flags);
/*     */   }
/*     */   
/* 530 */   public static void ostreamSetPrecision(int ostream, int precision) { IoHandle ioStream = __HANDLES.getStreamByAddress(ostream);
/* 531 */     ioStream.setPrecision(precision);
/*     */   }
/*     */   
/*     */   public static int ungetc(int chr, int file$) {
/* 535 */     IoHandle handle = __HANDLES.getByAddress(file$);
/* 536 */     return handle.ungetc(chr);
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/IoLib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */