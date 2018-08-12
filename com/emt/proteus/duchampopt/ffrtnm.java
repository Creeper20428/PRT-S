/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffrtnm extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2994;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new ffrtnm();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffrtnm() { super("ffrtnm", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*     */     
/*     */ 
/*  52 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       j = MainMemory.alloc(20);
/*  57 */       k = MainMemory.alloc(1025);
/*  58 */       i1 = MainMemory.getI32(paramInt3);
/*  59 */       if (i1 <= 0) {
/*     */         break label86;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       i = i1;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label86:
/*     */       
/*  76 */       MainMemory.setI8(paramInt2, (byte)0);
/*  77 */       MainMemory.setI8(j, (byte)0);
/*  78 */       MainMemory.setI8(k, (byte)0);
/*  79 */       if (MainMemory.getI8(paramInt1) != 45) {
/*     */         break label152;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       MainMemory.setI16(j + SystemLibrary.strlen(j), (short)45);
/*  90 */       paramInt1 += 1;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label152:
/*     */       
/*  96 */       if (SystemLibrary.strncmp(paramInt1, 26464, 5) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         if (SystemLibrary.strncmp(paramInt1, 26496, 5) != 0) {
/*     */           break label224;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       MainMemory.setI16(j + SystemLibrary.strlen(j), (short)45);
/* 117 */       paramInt1 += 5;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label224:
/*     */       
/* 123 */       n = SystemLibrary.strstr(paramInt1, 17696);
/* 124 */       m = SystemLibrary.strchr(paramInt1, 40);
/* 125 */       n = (m != 0) && (MathUtils.ult(m, n)) ? 0 : n;
/* 126 */       if (n != 0) {
/*     */         break label590;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       if (SystemLibrary.strncmp(paramInt1, 20576, 4) != 0) {
/*     */         break label336;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 33216, 7, 1);
/* 147 */       paramInt1 += 4;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label336:
/*     */       
/* 153 */       if (SystemLibrary.strncmp(paramInt1, 40480, 7) != 0) {
/*     */         break label391;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */       SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 47808, 10, 1);
/* 164 */       paramInt1 += 7;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label391:
/*     */       
/* 170 */       if (SystemLibrary.strncmp(paramInt1, 26528, 5) != 0) {
/*     */         break label443;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       MainMemory.setI64(j + SystemLibrary.strlen(j), 13281251946689640L);
/* 181 */       paramInt1 += 5;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label443:
/*     */       
/* 187 */       if (SystemLibrary.strncmp(paramInt1, 20608, 4) != 0) {
/*     */         break label497;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 197 */       SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 33248, 7, 1);
/* 198 */       paramInt1 += 4;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label497:
/*     */       
/* 204 */       if (SystemLibrary.strncmp(paramInt1, 33280, 6) != 0) {
/*     */         break label552;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */       SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 44672, 9, 1);
/* 215 */       paramInt1 += 6;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label552:
/*     */       
/* 221 */       if (SystemLibrary.strncmp(paramInt1, 26560, 5) != 0) {
/*     */         break label663;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */       paramInt1 += 5;
/*     */       
/*     */       break label663;
/*     */       
/*     */       label590:
/*     */       
/* 238 */       i1 = n;
/* 239 */       i2 = paramInt1;
/* 240 */       if (i1 - i2 <= 16) {
/*     */         break label639;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */       MainMemory.setI32(paramInt3, 125);
/* 251 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label639:
/*     */       
/* 258 */       SystemLibrary.strncat(j, paramInt1, 3 - i2 + i1);
/* 259 */       paramInt1 = n + 3;
/*     */       
/*     */ 
/*     */ 
/*     */       label663:
/*     */       
/*     */ 
/*     */ 
/* 267 */       n = SystemLibrary.strchr(paramInt1, 40);
/* 268 */       m = SystemLibrary.strchr(paramInt1, 91);
/* 269 */       if (n != m) {
/*     */         break label761;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */       if (!MathUtils.ugt(SystemLibrary.strlen(paramInt1), 1024)) {
/*     */         break label744;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */       MainMemory.setI32(paramInt3, 125);
/* 290 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label744:
/*     */       
/* 297 */       SystemLibrary.strcat(k, paramInt1);
/*     */       
/*     */       break label1065;
/*     */       
/*     */       label761:
/* 302 */       if (m != 0) {
/*     */         break label878;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */       i1 = n - paramInt1;
/* 313 */       if (i1 <= 1024) {
/*     */         break label825;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */       MainMemory.setI32(paramInt3, 125);
/* 324 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label825:
/*     */       
/* 331 */       SystemLibrary.strncat(k, paramInt1, i1);
/* 332 */       if (SystemLibrary.strchr(n + 1, 41) != 0) {
/*     */         break label1065;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */       MainMemory.setI32(paramInt3, 125);
/* 343 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label878:
/*     */       
/* 350 */       if ((n == 0) || (!MathUtils.ult(n, m))) {
/*     */         break label1005;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */       i1 = n - paramInt1;
/* 361 */       if (i1 <= 1024) {
/*     */         break label952;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */       MainMemory.setI32(paramInt3, 125);
/* 372 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label952:
/*     */       
/* 379 */       SystemLibrary.strncat(k, paramInt1, i1);
/* 380 */       if (SystemLibrary.strchr(n + 1, 41) != 0) {
/*     */         break label1065;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */       MainMemory.setI32(paramInt3, 125);
/* 391 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label1005:
/*     */       
/* 398 */       i1 = m - paramInt1;
/* 399 */       if (i1 <= 1024) {
/*     */         break label1051;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */       MainMemory.setI32(paramInt3, 125);
/* 410 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label1051:
/*     */       
/* 417 */       SystemLibrary.strncat(k, paramInt1, i1);
/*     */       
/*     */ 
/*     */       label1065:
/*     */       
/*     */ 
/* 423 */       i1 = SystemLibrary.strlen(k) + -1;
/* 424 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 431 */         i4 = i1 - i2;
/* 432 */         paramInt1 = k + i4;
/* 433 */         if (i4 <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 443 */         if (MainMemory.getI8(paramInt1) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 453 */         MainMemory.setI8(paramInt1, (byte)0);
/* 454 */         i2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 460 */       i1 = SystemLibrary.strlen(k);
/* 461 */       i2 = i1 + -1;
/* 462 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 469 */         i5 = i2 - i4;
/* 470 */         if (i5 <= -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */         i3 = i4 + 1;
/* 481 */         if (MainMemory.getI8(k + i5) == 43) {
/*     */           break;
/*     */         }
/*     */         
/* 485 */         i4 = i3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */       if (i5 <= 0) {
/*     */         break label1273;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */       ffrtnm_1412.call(k, i1, i4, i5);
/*     */       
/*     */ 
/*     */       label1273:
/*     */       
/*     */ 
/* 508 */       i1 = SystemLibrary.strlen(j);
/* 509 */       if (!MathUtils.ugt(SystemLibrary.strlen(k) + i1, 1024)) {
/*     */         break label1329;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 519 */       MainMemory.setI32(paramInt3, 125);
/* 520 */       i = 125;
/*     */       
/*     */ 
/*     */       break label1353;
/*     */       
/*     */       label1329:
/*     */       
/* 527 */       SystemLibrary.strcat(paramInt2, j);
/* 528 */       SystemLibrary.strcat(paramInt2, k);
/* 529 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */       label1353:
/*     */       
/*     */ 
/* 535 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 540 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffrtnm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */