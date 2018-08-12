/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ 
/*     */ public final class mem_compress_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3064;
/*  18 */   public static final Function _instance = new mem_compress_open();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public mem_compress_open() { super("mem_compress_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = call(i, j, k);
/*  40 */     paramFrame.setI32(paramInt1, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*     */     
/*     */ 
/*  56 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.alloc(4);
/*  61 */       k = MainMemory.alloc(4);
/*  62 */       if (paramInt2 != 0) {
/*     */         break label906;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       paramInt2 = file_openfile.call(paramInt1, 0, j);
/*  73 */       if (paramInt2 != 0) {
/*     */         break label883;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       m = MainMemory.getI32(j);
/*  84 */       if (SystemLibrary.fread(k, 1, 2, m) != 2) {
/*     */         break label864;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       if (SystemLibrary.memcmp(k, 15488, 2) != 0) {
/*     */         break label230;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       SystemLibrary.fseek(m, 0L, 2);
/* 105 */       SystemLibrary.fseek(m, -4L, 1);
/* 106 */       SystemLibrary.fread(k, 1, 4, m);
/* 107 */       paramInt2 = (MainMemory.getI8(k + 1) & 0xFF) << 8 | MainMemory.getI8(k) & 0xFF | (MainMemory.getI8(k + 2) & 0xFF) << 16 | (MainMemory.getI8(k + 3) & 0xFF) << 24;
/*     */       
/*     */       break label335;
/*     */       
/*     */       label230:
/*     */       
/* 113 */       if (SystemLibrary.memcmp(k, 15520, 2) != 0) {
/*     */         break label363;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       SystemLibrary.fseek(m, 22L, 0);
/* 124 */       SystemLibrary.fread(k, 1, 4, m);
/* 125 */       paramInt2 = (MainMemory.getI8(k + 1) & 0xFF) << 8 | MainMemory.getI8(k) & 0xFF | (MainMemory.getI8(k + 2) & 0xFF) << 16 | (MainMemory.getI8(k + 3) & 0xFF) << 24;
/*     */       
/*     */ 
/*     */ 
/*     */       label335:
/*     */       
/*     */ 
/*     */ 
/* 133 */       if (paramInt2 == 0) {
/* 134 */         n = 0;
/*     */         break label441;
/*     */       } else {
/* 137 */         n = 0;
/*     */         
/*     */ 
/*     */         break label462;
/*     */       }
/*     */       
/*     */       label363:
/*     */       
/* 145 */       if (SystemLibrary.memcmp(k, 15552, 2) == 0) {
/* 146 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 156 */       else if (SystemLibrary.memcmp(k, 15584, 2) == 0) {
/* 157 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 167 */       else if (SystemLibrary.memcmp(k, 15616, 2) == 0) {
/* 168 */         n = 1;
/*     */       } else {
/*     */         break label846;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label441:
/*     */       
/*     */ 
/*     */ 
/* 179 */       SystemLibrary.fseek(m, 0L, 2);
/* 180 */       paramInt2 = ftell.call(m) * 3;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label462:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 190 */       SystemLibrary.fseek(m, 0L, 0);
/* 191 */       i1 = mem_createmem.call(paramInt2, paramInt3);
/* 192 */       if ((i1 == 0) || (n == 0))
/*     */       {
/*     */ 
/*     */ 
/* 196 */         paramInt2 = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 203 */         paramInt2 = mem_createmem.call(MathUtils.udiv(paramInt2, 3), paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */       if (paramInt2 != 0) {
/*     */         break label822;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */       paramInt2 = mem_uncompress2mem.call(paramInt1, m, MainMemory.getI32(paramInt3));
/* 222 */       SystemLibrary.fclose(m);
/* 223 */       i1 = MainMemory.getI32(paramInt3);
/* 224 */       if (paramInt2 != 0) {
/*     */         break label763;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */       paramInt2 = (int)MainMemory.getI64(512000 + i1 * 44 + 32);
/* 235 */       if (!MathUtils.ugt(MainMemory.getI32(MainMemory.getI32(512000 + i1 * 44 + 8)), paramInt2 + 256)) {
/*     */         break label751;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */       paramInt1 = realloc.call(MainMemory.getI32(MainMemory.getI32(512000 + i1 * 44)), paramInt2);
/* 246 */       if (paramInt1 != 0) {
/*     */         break label687;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */       ffxmsg.call(5, 128096);
/* 257 */       i = 113;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label687:
/*     */       
/* 264 */       MainMemory.setI32(MainMemory.getI32(512000 + MainMemory.getI32(paramInt3) * 44), paramInt1);
/* 265 */       paramInt2 = MainMemory.getI32(paramInt3);
/* 266 */       MainMemory.setI32(MainMemory.getI32(512000 + paramInt2 * 44 + 8), (int)MainMemory.getI64(512000 + paramInt2 * 44 + 32));
/* 267 */       i = 0;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label751:
/*     */       
/* 274 */       i = 0;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label763:
/*     */       
/* 281 */       i2 = 512000 + i1 * 44;
/* 282 */       free.call(MainMemory.getI32(MainMemory.getI32(i2)));
/* 283 */       MainMemory.setI32(i2, 0);
/* 284 */       MainMemory.setI32(512000 + i1 * 44 + 4, 0);
/* 285 */       ffxmsg.call(5, 121888);
/* 286 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label822:
/*     */       
/* 293 */       SystemLibrary.fclose(m);
/* 294 */       ffxmsg.call(5, 116000);
/* 295 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label846:
/*     */       
/* 302 */       SystemLibrary.fclose(m);
/* 303 */       i = 1;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label864:
/*     */       
/* 310 */       SystemLibrary.fclose(m);
/* 311 */       i = 108;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label883:
/*     */       
/* 318 */       ffxmsg.call(5, 117920);
/* 319 */       ffxmsg.call(5, paramInt1);
/* 320 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       break label925;
/*     */       
/*     */       label906:
/*     */       
/* 327 */       ffxmsg.call(5, 136128);
/* 328 */       ffxmsg.call(5, paramInt1);
/* 329 */       i = 112;
/*     */       
/*     */ 
/*     */       label925:
/*     */       
/*     */ 
/* 335 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 340 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_compress_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */