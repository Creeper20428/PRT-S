/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class tscs2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2805;
/*  12 */   public static final Function _instance = new tscs2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tscs2x() { super("tscs2x", 10, false); }
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
/*  71 */     int i5 = 0;
/*  72 */     int i6 = 0;
/*  73 */     int i7 = 0;
/*  74 */     int i8 = 0;
/*  75 */     int i9 = 0;
/*  76 */     int i10 = 0;
/*  77 */     int i11 = 0;
/*  78 */     int i12 = 0;
/*  79 */     int i13 = 0;
/*  80 */     double d1 = 0.0D;
/*  81 */     double d2 = 0.0D;
/*  82 */     boolean bool1 = false;
/*  83 */     boolean bool2 = false;
/*  84 */     double d3 = 0.0D;
/*  85 */     boolean bool3 = false;
/*  86 */     double d4 = 0.0D;
/*  87 */     boolean bool4 = false;
/*  88 */     double d5 = 0.0D;
/*  89 */     double d6 = 0.0D;
/*  90 */     double d7 = 0.0D;
/*  91 */     int i14 = 0;
/*     */     
/*     */ 
/*  94 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  98 */       i2 = MainMemory.alloc(8);
/*  99 */       j = MainMemory.alloc(8);
/* 100 */       i3 = MainMemory.alloc(8);
/* 101 */       k = MainMemory.alloc(8);
/* 102 */       if (paramInt1 == 0) {
/* 103 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 113 */         if (MainMemory.getI32(paramInt1) != 701)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */           if (tscset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 127 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1969;
/*     */           }
/*     */         }
/*     */         
/* 134 */         i1 = paramInt3 > 0 ? 1 : 0;
/* 135 */         i4 = i1 != 0 ? paramInt3 : 1;
/* 136 */         m = i1 != 0 ? paramInt2 : 1;
/* 137 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/* 138 */         if (paramInt2 <= 0) {
/*     */           break label707;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         i1 = i4 > 0 ? 1 : 0;
/* 149 */         i5 = paramInt5 * paramInt2;
/* 150 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 157 */           i10 = i9 * paramInt5;
/* 158 */           d7 = MainMemory.getF64(paramInt6 + (i9 * paramInt4 << 3));
/* 159 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d7, 90.0D), 0.0D)) {
/*     */             break label548;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */           d6 = d7 / 90.0D;
/* 170 */           d6 += 0.5D;
/* 171 */           i14 = (int)SystemLibrary.floor(d6);
/* 172 */           switch ((i14 > -1 ? i14 : 0 - i14) & 0x3) {
/*     */           case 0: 
/*     */             break label526;
/*     */             break;
/*     */           case 1: 
/*     */             break label489;
/*     */             break;
/*     */           case 2: 
/*     */             break label465;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 185 */           MainMemory.setF64(i3, MathUtils.f_ogt(d7, 0.0D) ? -1.0D : 1.0D);
/* 186 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label465:
/* 191 */           MainMemory.setF64(i3, 0.0D);
/* 192 */           MainMemory.setF64(i2, -1.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label489:
/* 197 */           MainMemory.setF64(i3, MathUtils.f_ogt(d7, 0.0D) ? 1.0D : -1.0D);
/* 198 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label526:
/* 203 */           MainMemory.setF64(i3, 0.0D);
/* 204 */           MainMemory.setF64(i2, 1.0D);
/*     */           
/*     */           break label578;
/*     */           
/*     */           label548:
/* 209 */           d7 *= 3.141592653589793D;
/* 210 */           d7 /= 180.0D;
/* 211 */           SystemLibrary.sincos(d7, i3, i2);
/*     */           
/*     */ 
/*     */           label578:
/*     */           
/*     */ 
/* 217 */           if (i1 == 0) {
/*     */             break label682;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */           d7 = MainMemory.getF64(i2);
/* 228 */           d6 = MainMemory.getF64(i3);
/* 229 */           i14 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 236 */             n = i10 + i5 * i14;
/* 237 */             i11 = paramInt9 + (n << 3);
/* 238 */             MainMemory.setF64(paramInt8 + (n << 3), d7);
/* 239 */             MainMemory.setF64(i11, d6);
/* 240 */             i14 += 1;
/* 241 */             if (i14 == i4) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label682:
/*     */           
/*     */ 
/*     */ 
/* 252 */           i9 += 1;
/* 253 */           if (i9 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label707:
/*     */         
/*     */ 
/*     */ 
/* 264 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 268 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 275 */           i1 = m > 0 ? 1 : 0;
/* 276 */           paramInt6 = paramInt1 + 360;
/* 277 */           i2 = paramInt1 + 344;
/* 278 */           i3 = paramInt1 + 352;
/* 279 */           paramInt2 = m * paramInt5 << 3;
/* 280 */           i4 = m << 2;
/*     */           
/*     */ 
/*     */ 
/* 284 */           i5 = 0;
/* 285 */           i10 = 0;
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
/* 296 */             d7 = MainMemory.getF64(paramInt7 + (i5 * paramInt4 << 3));
/* 297 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d7, 90.0D), 0.0D)) {
/*     */               break label1056;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 307 */             d6 = d7 / 90.0D;
/* 308 */             d6 += 0.5D;
/* 309 */             i9 = (int)SystemLibrary.floor(d6);
/* 310 */             switch ((i9 > -1 ? i9 : 0 - i9) & 0x3) {
/*     */             case 0: 
/*     */               break label1034;
/*     */               break;
/*     */             case 1: 
/*     */               break label997;
/*     */               break;
/*     */             case 2: 
/*     */               break label973;
/*     */               break;
/*     */             case 3: 
/*     */               break;
/*     */             }
/* 323 */             MainMemory.setF64(k, MathUtils.f_ogt(d7, 0.0D) ? -1.0D : 1.0D);
/* 324 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1086;
/*     */             
/*     */             label973:
/* 329 */             MainMemory.setF64(k, 0.0D);
/* 330 */             MainMemory.setF64(j, -1.0D);
/*     */             
/*     */             break label1086;
/*     */             
/*     */             label997:
/* 335 */             MainMemory.setF64(k, MathUtils.f_ogt(d7, 0.0D) ? 1.0D : -1.0D);
/* 336 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1086;
/*     */             
/*     */             label1034:
/* 341 */             MainMemory.setF64(k, 0.0D);
/* 342 */             MainMemory.setF64(j, 1.0D);
/*     */             
/*     */             break label1086;
/*     */             
/*     */             label1056:
/* 347 */             d7 *= 3.141592653589793D;
/* 348 */             d7 /= 180.0D;
/* 349 */             SystemLibrary.sincos(d7, k, j);
/*     */             
/*     */ 
/*     */             label1086:
/*     */             
/*     */ 
/* 355 */             if (i1 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */               i9 = i10;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 369 */               i6 = paramInt9 + paramInt2;
/* 370 */               i7 = paramInt8 + paramInt2;
/* 371 */               i8 = paramInt10 + i4;
/* 372 */               i9 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 381 */                 i14 = i9 * paramInt5;
/* 382 */                 i11 = paramInt9 + (i14 << 3);
/* 383 */                 i12 = paramInt8 + (i14 << 3);
/* 384 */                 i13 = paramInt10 + (i9 << 2);
/* 385 */                 d7 = MainMemory.getF64(j);
/* 386 */                 d1 = MainMemory.getF64(i12) * d7;
/* 387 */                 d7 = MainMemory.getF64(i11) * d7;
/* 388 */                 d2 = MainMemory.getF64(k);
/* 389 */                 bool1 = MathUtils.f_ogt(d1, d2);
/* 390 */                 d6 = bool1 ? d1 : d2;
/* 391 */                 bool2 = MathUtils.f_ogt(d7, d6);
/* 392 */                 d6 = bool2 ? d7 : d6;
/* 393 */                 d3 = -0.0D - d1;
/* 394 */                 bool3 = MathUtils.f_olt(d6, d3);
/* 395 */                 d6 = bool3 ? d3 : d6;
/* 396 */                 d4 = -0.0D - d7;
/* 397 */                 bool4 = MathUtils.f_olt(d6, d4);
/* 398 */                 d6 = bool4 ? d4 : d6;
/* 399 */                 d5 = -0.0D - d2;
/* 400 */                 if (MathUtils.f_olt(d6, d5)) {
/* 401 */                   d6 = d5;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 411 */                   switch (bool1 ? 1 : bool2 ? 2 : bool3 ? 3 : bool4 ? 4 : 0) {
/* 412 */                   case 1:  d5 = d6;
/* 413 */                     d6 = 0.0D;
/* 414 */                     d4 = d7;
/* 415 */                     d7 = 0.0D;
/* 416 */                     d1 = d2;
/*     */                     break label1615;
/*     */                     break;
/*     */                   case 2: 
/*     */                     break label1560;
/*     */                     break;
/*     */                   case 3: 
/*     */                     break label1534;
/*     */                     break;
/*     */                   case 4: 
/*     */                     break label1504;
/*     */                     break;
/*     */                   case 5: 
/*     */                     break;
/*     */                   }
/*     */                 }
/* 432 */                 d5 = d6;
/* 433 */                 d6 = 0.0D;
/* 434 */                 d4 = d7;
/* 435 */                 d7 = -2.0D;
/*     */                 
/*     */                 break label1615;
/*     */                 
/*     */                 label1504:
/*     */                 
/* 441 */                 d5 = d6;
/* 442 */                 d6 = 6.0D;
/* 443 */                 d4 = d1;
/* 444 */                 d7 = 0.0D;
/* 445 */                 d1 = d2;
/*     */                 
/*     */                 break label1615;
/*     */                 
/*     */                 label1534:
/* 450 */                 d5 = d6;
/* 451 */                 d6 = 4.0D;
/*     */                 
/* 453 */                 d7 = 0.0D;
/* 454 */                 d1 = d2;
/*     */                 
/*     */                 break label1615;
/*     */                 
/*     */                 label1560:
/* 459 */                 d5 = d6;
/* 460 */                 d6 = 2.0D;
/* 461 */                 d4 = d3;
/* 462 */                 d7 = 0.0D;
/* 463 */                 d1 = d2;
/*     */                 
/*     */ 
/*     */                 break label1615;
/*     */                 
/* 468 */                 d5 = d6;
/* 469 */                 d6 = 0.0D;
/* 470 */                 d4 = d7;
/* 471 */                 d7 = 2.0D;
/* 472 */                 d1 = d3;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1615:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 483 */                 d1 /= d5;
/* 484 */                 d2 = d4 / d5;
/* 485 */                 d3 = SystemLibrary.fabs(d2);
/* 486 */                 if (!MathUtils.f_ogt(d3, 1.0D))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */                   i14 = 0;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 499 */                   bool1 = MathUtils.f_ogt(d3, 1.000000000001D);
/* 500 */                   i10 = bool1 ? 4 : i10;
/* 501 */                   i14 = bool1 ? 1 : 0;
/* 502 */                   d2 = MathUtils.f_olt(d2, 0.0D) ? -1.0D : 1.0D;
/*     */                 }
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
/* 514 */                 d3 = SystemLibrary.fabs(d1);
/* 515 */                 if (!MathUtils.f_ogt(d3, 1.0D)) {
/*     */                   break label1807;
/*     */                 }
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
/* 528 */                 bool1 = MathUtils.f_ogt(d3, 1.000000000001D);
/* 529 */                 i10 = bool1 ? 4 : i10;
/* 530 */                 i14 = bool1 ? 1 : i14;
/* 531 */                 d1 = MathUtils.f_olt(d1, 0.0D) ? -1.0D : 1.0D;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1807:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 543 */                 d6 = d2 + d6;
/* 544 */                 d6 = MainMemory.getF64(paramInt6) * d6;
/* 545 */                 d6 -= MainMemory.getF64(i2);
/* 546 */                 MainMemory.setF64(i12, d6);
/* 547 */                 d7 = d1 + d7;
/* 548 */                 d7 = MainMemory.getF64(paramInt6) * d7;
/* 549 */                 d7 -= MainMemory.getF64(i3);
/* 550 */                 MainMemory.setF64(i11, d7);
/* 551 */                 MainMemory.setI32(i13, i14);
/* 552 */                 i9 += 1;
/* 553 */                 if (i9 == m) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 565 */               paramInt8 = i6;
/* 566 */               i11 = i7;
/* 567 */               paramInt10 = i8;
/* 568 */               paramInt9 = paramInt8;
/* 569 */               paramInt8 = i11;
/*     */               
/* 571 */               i9 = i10;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 581 */             i5 += 1;
/* 582 */             if (i5 == paramInt3) {
/* 583 */               paramInt2 = i9; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */             i10 = i9;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1969:
/*     */       
/* 599 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 605 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 610 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tscs2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */