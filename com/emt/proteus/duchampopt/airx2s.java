/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class airx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2873;
/*  12 */   public static final Function _instance = new airx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public airx2s() { super("airx2s", 10, false); }
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
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     double d1 = 0.0D;
/*  72 */     double d2 = 0.0D;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     boolean bool = false;
/*  77 */     double d3 = 0.0D;
/*  78 */     int i8 = 0;
/*  79 */     int i9 = 0;
/*  80 */     double d4 = 0.0D;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     int i12 = 0;
/*  84 */     double d5 = 0.0D;
/*  85 */     double d6 = 0.0D;
/*  86 */     double d7 = 0.0D;
/*  87 */     double d8 = 0.0D;
/*  88 */     double d9 = 0.0D;
/*  89 */     double d10 = 0.0D;
/*  90 */     int i13 = 0;
/*  91 */     double d11 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
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
/* 108 */         if (MainMemory.getI32(paramInt1) != 109)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           if (airset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 122 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1611;
/*     */           }
/*     */         }
/*     */         
/* 129 */         k = paramInt3 > 0 ? 1 : 0;
/* 130 */         i3 = k != 0 ? paramInt3 : 1;
/* 131 */         j = k != 0 ? paramInt2 : 1;
/* 132 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 133 */         if (paramInt2 <= 0) {
/*     */           break label229;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         airx2s_479.call(paramInt1, paramInt5, paramInt4, i3, paramInt8, paramInt6, paramInt2);
/*     */         
/*     */ 
/*     */         label229:
/*     */         
/*     */ 
/* 149 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 153 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 160 */           paramInt6 = paramInt1 + 352;
/* 161 */           k = j > 0 ? 1 : 0;
/* 162 */           m = paramInt1 + 360;
/* 163 */           n = paramInt1 + 400;
/* 164 */           i1 = paramInt1 + 408;
/* 165 */           i2 = paramInt1 + 368;
/* 166 */           paramInt2 = j * paramInt5 << 3;
/* 167 */           i3 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 171 */           i4 = 0;
/* 172 */           i9 = 0;
/* 173 */           d5 = 0.0D;
/*     */           
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
/* 185 */             d2 = MainMemory.getF64(paramInt7 + (i4 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 186 */             d1 = d2 * d2;
/* 187 */             if (k == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */               i8 = i9;
/* 195 */               d1 = d5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 202 */               d2 = -0.0D - d2;
/* 203 */               i5 = paramInt9 + paramInt2;
/* 204 */               i6 = paramInt8 + paramInt2;
/* 205 */               i7 = paramInt10 + i3;
/* 206 */               bool = MathUtils.f_oeq(d2, 0.0D);
/* 207 */               d3 = MathUtils.f_oge(d2, 0.0D) ? 0.0D : 180.0D;
/* 208 */               i8 = 0;
/*     */               
/* 210 */               d4 = d5;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 219 */                 i13 = i8 * paramInt5;
/* 220 */                 i10 = paramInt9 + (i13 << 3);
/* 221 */                 i11 = paramInt8 + (i13 << 3);
/* 222 */                 i12 = paramInt10 + (i8 << 2);
/* 223 */                 d8 = MainMemory.getF64(i11);
/* 224 */                 d5 = d8 * d8;
/* 225 */                 d5 += d1;
/* 226 */                 d5 = SystemLibrary.sqrt(d5) / MainMemory.getF64(m);
/* 227 */                 if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                   break label554;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */                 MainMemory.setF64(i11, 0.0D);
/* 238 */                 d5 = d4;
/* 239 */                 d8 = 0.0D;
/*     */                 
/*     */                 break label1478;
/*     */                 
/*     */                 label554:
/* 244 */                 if (MathUtils.f_oeq(d8, 0.0D)) {
/* 245 */                   d8 = d3;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 255 */                   if (!bool) {
/*     */                     break label643;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */                   if (MathUtils.f_ogt(d8, 0.0D)) {
/* 266 */                     d8 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 276 */                   else if (MathUtils.f_olt(d8, 0.0D)) {
/* 277 */                     d8 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label643:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */                     d8 = SystemLibrary.atan2(d8, d2) * 180.0D;
/* 288 */                     d8 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */                 MainMemory.setF64(i11, d8);
/* 297 */                 if (!MathUtils.f_ogt(MainMemory.getF64(n), d5))
/*     */                 {
/*     */ 
/*     */ 
/* 301 */                   d9 = 0.0D;
/* 302 */                   d11 = 1.0D;
/* 303 */                   i13 = 0;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 310 */                   d8 = MainMemory.getF64(i1) * d5;
/* 311 */                   d5 = d4;
/*     */                   
/*     */ 
/*     */                   break label1478;
/*     */                 }
/*     */                 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 320 */                   if (i13 >= 30)
/*     */                   {
/*     */ 
/*     */ 
/* 324 */                     d10 = d9;
/* 325 */                     d6 = d11;
/* 326 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 332 */                   d8 = d11 * 0.5D;
/* 333 */                   d6 = d8 * d8;
/* 334 */                   d6 = 1.0D - d6;
/* 335 */                   d10 = SystemLibrary.sqrt(d6) / d8;
/* 336 */                   d6 = SystemLibrary.log(d8) / d10;
/* 337 */                   d10 = MainMemory.getF64(i2) * d10;
/* 338 */                   d6 += d10;
/* 339 */                   d6 = -0.0D - d6;
/* 340 */                   if (!MathUtils.f_ugt(d5, d6))
/*     */                   {
/*     */ 
/*     */ 
/* 344 */                     d10 = d6;
/* 345 */                     d6 = d8;
/* 346 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 352 */                   i13 += 1;
/* 353 */                   d9 = d6;
/* 354 */                   d11 = d8;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */                 if (i13 != 30)
/*     */                 {
/*     */ 
/*     */ 
/* 366 */                   d8 = d10;
/*     */                   
/* 368 */                   d10 = d4;
/* 369 */                   d4 = d11;
/* 370 */                   i13 = 0;
/* 371 */                   d11 = d6;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 378 */                   MainMemory.setF64(i10, 0.0D);
/* 379 */                   MainMemory.setI32(i12, 1);
/* 380 */                   d5 = d4;
/* 381 */                   i9 = 3;
/*     */                   
/*     */ 
/*     */ 
/*     */                   break label1512;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 392 */                   if (i13 >= 100)
/*     */                   {
/*     */ 
/*     */ 
/* 396 */                     d5 = d10;
/* 397 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 403 */                   d6 = d8 - d5;
/* 404 */                   d10 = d8 - d9;
/* 405 */                   d6 /= d10;
/* 406 */                   if (MathUtils.f_olt(d6, 0.1D)) {
/* 407 */                     d6 = 0.1D;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 417 */                     if (!MathUtils.f_ogt(d6, 0.9D)) {
/*     */                       break label1057;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 428 */                     d6 = 0.9D;
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1057:
/*     */                   
/*     */ 
/* 435 */                   d10 = d11 - d4;
/* 436 */                   d6 = d10 * d6;
/* 437 */                   d6 = d11 - d6;
/* 438 */                   d10 = d6 * d6;
/* 439 */                   d10 = 1.0D - d10;
/* 440 */                   d7 = SystemLibrary.sqrt(d10) / d6;
/* 441 */                   d10 = SystemLibrary.log(d6) / d7;
/* 442 */                   d7 = MainMemory.getF64(i2) * d7;
/* 443 */                   d7 = d10 + d7;
/* 444 */                   d10 = -0.0D - d7;
/* 445 */                   if (!MathUtils.f_ogt(d5, d10)) {
/*     */                     break label1207;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 455 */                   d9 = d5 + d7;
/* 456 */                   if (MathUtils.f_olt(d9, 1.0E-12D)) {
/* 457 */                     d5 = d6;
/* 458 */                     break;
/*     */                   }
/*     */                   else {
/* 461 */                     d9 = d10;
/* 462 */                     d4 = d6;
/*     */                     
/*     */ 
/*     */                     break label1250;
/*     */                   }
/*     */                   
/*     */                   label1207:
/*     */                   
/* 470 */                   d8 = d10 - d5;
/* 471 */                   if (MathUtils.f_olt(d8, 1.0E-12D)) {
/* 472 */                     d5 = d6;
/* 473 */                     break;
/*     */                   } else {
/* 475 */                     d8 = d10;
/*     */                     
/*     */ 
/* 478 */                     d11 = d6;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   label1250:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 490 */                   i13 += 1;
/*     */                   
/*     */ 
/* 493 */                   d10 = d6;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */                 if (i13 != 100) {
/*     */                   break label1315;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 512 */                 MainMemory.setF64(i10, 0.0D);
/* 513 */                 MainMemory.setI32(i12, 1);
/*     */                 
/* 515 */                 i9 = 3;
/*     */                 
/*     */                 break label1512;
/*     */                 
/*     */                 label1315:
/* 520 */                 if (!MathUtils.f_ult(d5, 1.0D)) {
/*     */                   break label1422;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 530 */                 if (MathUtils.f_oeq(d5, 0.0D))
/*     */                 {
/* 532 */                   d8 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 542 */                   if (!MathUtils.f_ugt(d5, -1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 552 */                     d8 = d5 + 1.0D;
/* 553 */                     if (MathUtils.f_ogt(d8, -1.0E-10D))
/*     */                     {
/* 555 */                       d8 = 180.0D;
/*     */                       
/*     */                       break label1478;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1454;
/*     */                     }
/*     */                     label1422:
/* 564 */                     d8 = d5 + -1.0D;
/* 565 */                     if (MathUtils.f_olt(d8, 1.0E-10D))
/*     */                     {
/* 567 */                       d8 = 0.0D;
/*     */                       
/*     */ 
/*     */                       break label1478;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1454:
/*     */                   
/* 577 */                   d8 = SystemLibrary.acos(d5) * 180.0D;
/* 578 */                   d8 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1478:
/*     */                 
/*     */ 
/*     */ 
/* 588 */                 d8 *= -2.0D;
/* 589 */                 d8 += 90.0D;
/* 590 */                 MainMemory.setF64(i10, d8);
/* 591 */                 MainMemory.setI32(i12, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1512:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 601 */                 i8 += 1;
/* 602 */                 if (i8 == j) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/* 608 */                 d4 = d5;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 615 */               paramInt8 = i5;
/* 616 */               i10 = i6;
/* 617 */               paramInt10 = i7;
/* 618 */               paramInt9 = paramInt8;
/* 619 */               paramInt8 = i10;
/*     */               
/* 621 */               i8 = i9;
/* 622 */               d1 = d5;
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
/* 633 */             i4 += 1;
/* 634 */             if (i4 == paramInt3) {
/* 635 */               paramInt2 = i8; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 643 */             i9 = i8;
/* 644 */             d5 = d1;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1611:
/*     */       
/* 652 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 658 */       int i14 = i;return i14;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/airx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */