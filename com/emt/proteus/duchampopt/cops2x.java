/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class cops2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2868;
/*  12 */   public static final Function _instance = new cops2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cops2x() { super("cops2x", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     paramFrame.setI32(paramInt1, i6);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     double d1 = 0.0D;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     int i5 = 0;
/*  73 */     int i6 = 0;
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     boolean bool = false;
/*  77 */     double d2 = 0.0D;
/*  78 */     double d3 = 0.0D;
/*  79 */     double d4 = 0.0D;
/*  80 */     int i9 = 0;
/*  81 */     double d5 = 0.0D;
/*  82 */     int i10 = 0;
/*  83 */     double d6 = 0.0D;
/*  84 */     int i11 = 0;
/*  85 */     int i12 = 0;
/*  86 */     int i13 = 0;
/*  87 */     int i14 = 0;
/*  88 */     int i15 = 0;
/*     */     
/*     */ 
/*  91 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  95 */       k = MainMemory.alloc(8);
/*  96 */       n = MainMemory.alloc(8);
/*  97 */       if (paramInt1 == 0) {
/*  98 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 108 */         if (MainMemory.getI32(paramInt1) != 501)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           if (copset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 122 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1590;
/*     */           }
/*     */         }
/*     */         
/* 129 */         m = paramInt3 > 0 ? 1 : 0;
/* 130 */         i4 = m != 0 ? paramInt3 : 1;
/* 131 */         j = m != 0 ? paramInt2 : 1;
/* 132 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 133 */         if (paramInt2 <= 0) {
/*     */           break label695;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         i1 = paramInt1 + 360;
/* 144 */         m = i4 > 0 ? 1 : 0;
/* 145 */         i5 = paramInt5 * paramInt2;
/* 146 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 153 */           i10 = i9 * paramInt5;
/* 154 */           d1 = MainMemory.getF64(i1) * MainMemory.getF64(paramInt6 + (i9 * paramInt4 << 3));
/* 155 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label536;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           d5 = d1 / 90.0D;
/* 166 */           d5 += 0.5D;
/* 167 */           i11 = (int)SystemLibrary.floor(d5);
/* 168 */           switch ((i11 > -1 ? i11 : 0 - i11) & 0x3) {
/*     */           case 0: 
/*     */             break label514;
/*     */             break;
/*     */           case 1: 
/*     */             break label477;
/*     */             break;
/*     */           case 2: 
/*     */             break label453;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 181 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 182 */           MainMemory.setF64(k, 0.0D);
/*     */           
/*     */           break label566;
/*     */           
/*     */           label453:
/* 187 */           MainMemory.setF64(n, 0.0D);
/* 188 */           MainMemory.setF64(k, -1.0D);
/*     */           
/*     */           break label566;
/*     */           
/*     */           label477:
/* 193 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 194 */           MainMemory.setF64(k, 0.0D);
/*     */           
/*     */           break label566;
/*     */           
/*     */           label514:
/* 199 */           MainMemory.setF64(n, 0.0D);
/* 200 */           MainMemory.setF64(k, 1.0D);
/*     */           
/*     */           break label566;
/*     */           
/*     */           label536:
/* 205 */           d1 *= 3.141592653589793D;
/* 206 */           d1 /= 180.0D;
/* 207 */           SystemLibrary.sincos(d1, n, k);
/*     */           
/*     */ 
/*     */           label566:
/*     */           
/*     */ 
/* 213 */           if (m == 0) {
/*     */             break label670;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */           d1 = MainMemory.getF64(n);
/* 224 */           d5 = MainMemory.getF64(k);
/* 225 */           i11 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 232 */             i12 = i10 + i5 * i11;
/* 233 */             i3 = paramInt9 + (i12 << 3);
/* 234 */             MainMemory.setF64(paramInt8 + (i12 << 3), d1);
/* 235 */             MainMemory.setF64(i3, d5);
/* 236 */             i11 += 1;
/* 237 */             if (i11 == i4) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label670:
/*     */           
/*     */ 
/*     */ 
/* 248 */           i9 += 1;
/* 249 */           if (i9 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label695:
/*     */         
/*     */ 
/*     */ 
/* 260 */         paramInt6 = paramInt1 + 376;
/* 261 */         d1 = MainMemory.getF64(paramInt1 + 352) - MainMemory.getF64(paramInt6);
/* 262 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 266 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 273 */           k = paramInt1 + 24;
/* 274 */           m = j > 0 ? 1 : 0;
/* 275 */           n = paramInt1 + 344;
/* 276 */           i1 = paramInt1 + 384;
/* 277 */           i2 = paramInt1 + 272;
/* 278 */           i3 = paramInt1 + 360;
/* 279 */           paramInt2 = j * paramInt5 << 3;
/* 280 */           i4 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 284 */           i5 = 0;
/* 285 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 296 */             i6 = paramInt10;
/* 297 */             i7 = paramInt8;
/* 298 */             i8 = paramInt9;
/* 299 */             d5 = MainMemory.getF64(paramInt7 + (i5 * paramInt4 << 3)) - MainMemory.getF64(k);
/* 300 */             bool = MathUtils.f_oeq(SystemLibrary.fmod(d5, 90.0D), 0.0D);
/* 301 */             if (!bool) {
/*     */               break label1016;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */             d6 = d5 / 90.0D;
/* 312 */             d6 += 0.5D;
/* 313 */             i10 = (int)SystemLibrary.floor(d6);
/* 314 */             switch ((i10 > -1 ? i10 : 0 - i10) & 0x3) {
/*     */             case 0: 
/*     */               break;
/* 317 */             case 1:  i9 = 4;
/* 318 */               d5 = 0.0D;
/* 319 */               i10 = 1;
/*     */               break label1366;
/*     */               break; case 2:  d2 = -1.0D;
/*     */               break label1074;
/*     */               break; case 3:  i9 = 4;
/* 324 */               d5 = 0.0D;
/* 325 */               i10 = 1;
/*     */               
/*     */ 
/*     */               break label1366;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 334 */             d2 = 1.0D;
/*     */             
/*     */             break label1074;
/*     */             
/*     */             label1016:
/* 339 */             d6 = d5 * 3.141592653589793D;
/* 340 */             d6 /= 180.0D;
/* 341 */             d6 = SystemLibrary.cos(d6);
/* 342 */             if (MathUtils.f_oeq(d6, 0.0D)) {
/* 343 */               i9 = 4;
/* 344 */               d5 = 0.0D;
/* 345 */               i10 = 1;
/*     */               break label1366;
/*     */             } else {
/* 348 */               d2 = d6;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1074:
/*     */             
/*     */ 
/*     */ 
/* 357 */             d6 = MainMemory.getF64(paramInt6);
/* 358 */             d3 = MainMemory.getF64(i1);
/* 359 */             if (!bool) {
/*     */               break label1250;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */             d4 = d5 / 90.0D;
/* 370 */             d4 += -0.5D;
/* 371 */             i10 = (int)SystemLibrary.floor(d4);
/* 372 */             switch ((i10 > -1 ? i10 : 0 - i10) & 0x3) {
/*     */             case 0:  break label1237;
/*     */               break; case 1:  d5 = 0.0D;
/*     */               break label1278;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d5 = 0.0D;
/*     */               
/*     */ 
/*     */               break label1278;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 387 */             d5 = -1.0D;
/*     */             
/*     */             break label1278;
/*     */             
/*     */             label1237:
/* 392 */             d5 = 1.0D;
/*     */             
/*     */             break label1278;
/*     */             
/*     */             label1250:
/* 397 */             d5 *= 3.141592653589793D;
/* 398 */             d5 /= 180.0D;
/* 399 */             d5 = SystemLibrary.sin(d5);
/*     */             
/*     */ 
/*     */ 
/*     */             label1278:
/*     */             
/*     */ 
/*     */ 
/* 407 */             d5 = d3 * d5;
/* 408 */             d5 /= d2;
/* 409 */             d5 = d6 - d5;
/* 410 */             if (MainMemory.getI32(i2) == 0)
/*     */             {
/*     */ 
/* 413 */               i10 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 423 */               d6 = MainMemory.getF64(i3) * d5;
/* 424 */               if (!MathUtils.f_olt(d6, 0.0D))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 430 */                 i10 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 437 */                 i9 = 4;
/*     */                 
/* 439 */                 i10 = 1;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1366:
/*     */             
/*     */ 
/* 448 */             if (m == 0) {
/*     */               break label1562;
/*     */             }
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
/* 461 */             d6 = -0.0D - d5;
/* 462 */             i8 += paramInt2;
/* 463 */             i7 += paramInt2;
/* 464 */             i6 += i4;
/* 465 */             i11 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 472 */               i12 = i11 * paramInt5;
/* 473 */               i13 = paramInt9 + (i12 << 3);
/* 474 */               i14 = paramInt8 + (i12 << 3);
/* 475 */               i15 = paramInt10 + (i11 << 2);
/* 476 */               d2 = MainMemory.getF64(i14) * d5;
/* 477 */               d2 -= MainMemory.getF64(n);
/* 478 */               MainMemory.setF64(i14, d2);
/* 479 */               d2 = MainMemory.getF64(i13) * d6;
/* 480 */               d2 -= d1;
/* 481 */               MainMemory.setF64(i13, d2);
/* 482 */               MainMemory.setI32(i15, i10);
/* 483 */               i11 += 1;
/* 484 */               if (i11 == j) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 495 */             paramInt8 = i8;
/* 496 */             i13 = i7;
/* 497 */             paramInt10 = i6;
/* 498 */             paramInt9 = paramInt8;
/* 499 */             paramInt8 = i13;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1562:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 509 */             i5 += 1;
/* 510 */             if (i5 == paramInt3) {
/* 511 */               paramInt2 = i9; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1590:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 533 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 538 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cops2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */