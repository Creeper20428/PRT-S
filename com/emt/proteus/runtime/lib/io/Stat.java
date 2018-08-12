/*     */ package com.emt.proteus.runtime.lib.io;
/*     */ 
/*     */ import com.emt.proteus.lib.utils.ByteTools;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import java.io.File;
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
/*     */ public class Stat
/*     */ {
/*     */   public static final int S_IFMT = 61440;
/*     */   public static final int S_IFSOCK = 49152;
/*     */   public static final int S_IFLNK = 40960;
/*     */   public static final int S_IFREG = 32768;
/*     */   public static final int S_IFBLK = 24576;
/*     */   public static final int S_IFDIR = 16384;
/*     */   public static final int S_IFCHR = 8192;
/*     */   public static final int S_IFIFO = 4096;
/*     */   public static final int S_IRWXU = 448;
/*     */   public static final int S_IRUSR = 256;
/*     */   public static final int S_IWUSR = 128;
/*     */   public static final int S_IXUSR = 64;
/*     */   public static final int S_IRWXG = 56;
/*     */   public static final int S_IRGRP = 32;
/*     */   public static final int S_IWGRP = 16;
/*     */   public static final int S_IXGRP = 8;
/*     */   public static final int S_IRWXO = 7;
/*     */   public static final int S_IROTH = 4;
/*     */   public static final int S_IWOTH = 2;
/*     */   public static final int S_IXOTH = 1;
/*     */   public static final int _INODE_32 = 12;
/*     */   public static final int _MODE_32 = 16;
/*     */   public static final int _NLINK_32 = 20;
/*     */   public static final int _UID_32 = 24;
/*     */   public static final int _GID_32 = 28;
/*     */   public static final int _SIZE_32 = 44;
/*     */   public static final int _BLOCK_SIZE_32 = 48;
/*     */   public static final int _BLOCK_COUNT_32 = 52;
/*     */   public static final int _ATIME_1_32 = 56;
/*     */   public static final int _ATIME_2_32 = 60;
/*     */   public static final int _MTIME_1_32 = 64;
/*     */   public static final int _MTIME_2_32 = 68;
/*     */   public static final int _CTIME_1_32 = 72;
/*     */   public static final int _CTIME_2_32 = 76;
/*     */   public static final int _ANON_1_32 = 80;
/*     */   public static final int _ANON_2_32 = 80;
/*     */   public static final int TOTAL_SIZE = 88;
/*     */   private byte[] buffer;
/*     */   public static final int STAT64_DEV = 0;
/*     */   public static final int STAT64_MODE = 16;
/*     */   public static final int STAT64_LINK = 20;
/*     */   public static final int STAT64_UID = 24;
/*     */   public static final int STAT64_GID = 28;
/*     */   public static final int STAT64_RDEV = 32;
/*     */   public static final int STAT64_SIZE = 44;
/*     */   public static final int STAT64_BLOCK_SIZE = 52;
/*     */   public static final int STAT64_BLOCK_COUNT = 56;
/*     */   public static final int STAT64_ATIME = 64;
/*     */   public static final int STAT64_CTIME = 72;
/*     */   public static final int STAT64_MTIME = 80;
/*     */   public static final int STAT64_INODE = 88;
/*     */   
/*     */   public Stat()
/*     */   {
/*  97 */     this.buffer = new byte[88];
/*     */   }
/*     */   
/*     */   public void setINode(int inode) {
/* 101 */     ByteTools.storeI32(this.buffer, 12, inode);
/*     */   }
/*     */   
/*     */   public void setMode(int mode) {
/* 105 */     ByteTools.storeI32(this.buffer, 16, mode);
/*     */   }
/*     */   
/*     */   public void setNumberOfLinks(int count) {
/* 109 */     ByteTools.storeI32(this.buffer, 20, count);
/*     */   }
/*     */   
/*     */   public void setUid(int uid) {
/* 113 */     ByteTools.storeI32(this.buffer, 24, uid);
/*     */   }
/*     */   
/*     */   public void setGid(int gid) {
/* 117 */     ByteTools.storeI32(this.buffer, 28, gid);
/*     */   }
/*     */   
/*     */   public void setFileSize(int fileSize) {
/* 121 */     ByteTools.storeI32(this.buffer, 44, fileSize);
/* 122 */     ByteTools.storeI32(this.buffer, 52, 1 + fileSize / 512);
/* 123 */     ByteTools.storeI32(this.buffer, 48, 4096);
/*     */   }
/*     */   
/*     */   public void setFileSize(long fileSize) {
/* 127 */     setFileSize((int)fileSize);
/*     */   }
/*     */   
/*     */   public byte[] getBytes() {
/* 131 */     return this.buffer;
/*     */   }
/*     */   
/*     */   public void setLastModified(long last) {
/* 135 */     ByteTools.storeI64(this.buffer, 72, last);
/* 136 */     ByteTools.storeI64(this.buffer, 56, last);
/* 137 */     ByteTools.storeI64(this.buffer, 64, last);
/*     */   }
/*     */   
/*     */   public void setMode(boolean isFile, boolean isDirectory, boolean canRead, boolean canWrite, boolean canExecute) {
/* 141 */     int mode = getMode(isFile, isDirectory, canRead, canWrite, canExecute);
/* 142 */     setMode(mode);
/*     */   }
/*     */   
/*     */   private static int getMode(File file) {
/* 146 */     return getMode(file.isFile(), file.isDirectory(), file.canRead(), file.canWrite(), file.canExecute());
/*     */   }
/*     */   
/*     */   private static int getMode(boolean isFile, boolean isDirectory, boolean canRead, boolean canWrite, boolean canExecute) {
/* 150 */     int mode = 0;
/* 151 */     if (isFile) {
/* 152 */       mode |= (isDirectory ? 16384 : 32768);
/*     */     } else
/* 154 */       mode |= 0xC000;
/* 155 */     if (canRead)
/* 156 */       mode |= 0x124;
/* 157 */     if (canWrite)
/* 158 */       mode |= 0x92;
/* 159 */     if (canExecute)
/* 160 */       mode |= 0x49;
/* 161 */     return mode;
/*     */   }
/*     */   
/*     */   private static int getINode(File file) {
/* 165 */     int inode = file.getAbsolutePath().hashCode();
/* 166 */     return inode;
/*     */   }
/*     */   
/*     */   public static Stat stat(String path)
/*     */   {
/* 171 */     return stat(new File(path));
/*     */   }
/*     */   
/*     */   public static Stat stat(File file) {
/* 175 */     Stat stat = new Stat();
/* 176 */     stat.setFileSize(file.length());
/* 177 */     stat.setNumberOfLinks(1);
/* 178 */     stat.setMode(true, false, file.canRead(), file.canWrite(), file.canExecute());
/* 179 */     int inode = file.getAbsolutePath().hashCode() & 0xFF;
/* 180 */     stat.setINode(inode);
/* 181 */     long last = file.lastModified();
/* 182 */     stat.setLastModified(last);
/* 183 */     return stat;
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
/* 219 */   public static void stat64(String file, int stat64$) { stat64(new File(file), stat64$); }
/*     */   
/*     */   public static void stat64(File file, int stat64$) {
/* 222 */     long lastModified = file.lastModified();
/* 223 */     long length = file.length();
/* 224 */     MainMemory.setI32(stat64$ + 16, getMode(file));
/* 225 */     MainMemory.setI32(stat64$ + 20, 1);
/* 226 */     MainMemory.setI32(stat64$ + 24, 1);
/* 227 */     MainMemory.setI32(stat64$ + 28, 1);
/* 228 */     MainMemory.setI64(stat64$ + 44, length);
/* 229 */     MainMemory.setI64(stat64$ + 52, 4096L);
/* 230 */     MainMemory.setI64(stat64$ + 56, 1L + length / 512L);
/* 231 */     MainMemory.setI64(stat64$ + 64, lastModified);
/* 232 */     MainMemory.setI64(stat64$ + 72, lastModified);
/* 233 */     MainMemory.setI64(stat64$ + 80, lastModified);
/* 234 */     MainMemory.setI32(stat64$ + 88, getINode(file));
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/runtime/lib/io/Stat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */