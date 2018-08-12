/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object2D8addPixelERlS1_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 361;
/*  17 */   public static final Function _instance = new _ZN9PixelInfo8Object2D8addPixelERlS1_();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN9PixelInfo8Object2D8addPixelERlS1_() { super("_ZN9PixelInfo8Object2D8addPixelERlS1_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3);
/*  25 */     return 0;
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
/*  39 */     call(i, j, k);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     int i12 = 0;
/*  63 */     int i13 = 0;
/*  64 */     int i14 = 0;
/*  65 */     int i15 = 0;
/*  66 */     int i16 = 0;
/*  67 */     int i17 = 0;
/*  68 */     float f = 0.0F;
/*     */     
/*     */ 
/*  71 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i6 = MainMemory.alloc(16);
/*  76 */       i = paramInt1 + 4;
/*  77 */       i15 = MainMemory.getI32(i);
/*  78 */       j = paramInt1 + 8;
/*  79 */       i14 = 0;
/*  80 */       i1 = 0;
/*  81 */       i2 = 0;
/*  82 */       i3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  92 */         i16 = i15 + (i14 << 4) + 12;
/*  93 */         i4 = i15 + (i14 << 4) + 8;
/*  94 */         i13 = i15 + (i14 << 4);
/*  95 */         i5 = i15 + (i14 << 4) + 4;
/*  96 */         if (i1 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         if (i13 != MainMemory.getI32(j)) {
/*     */           break label322;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         _ZN9PixelInfo4ScanC1Elll.call(i6, MainMemory.getI32(paramInt3), MainMemory.getI32(paramInt2), 1);
/* 117 */         i15 = MainMemory.getI32(j);
/* 118 */         if (i15 != MainMemory.getI32(paramInt1 + 12)) {
/*     */           break label264;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt1 + 4, i15, i6);
/*     */         
/*     */         break label1040;
/*     */         
/*     */         label264:
/* 133 */         if (i15 == 0) {
/* 134 */           i6 = i15;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 144 */           _ZN9PixelInfo4ScanC1ERKS0_.call(i15, i6);
/* 145 */           i6 = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         MainMemory.setI32(j, i6 + 16);
/*     */         
/*     */         break label1040;
/*     */         
/*     */         label322:
/* 158 */         i8 = MainMemory.getI32(paramInt3);
/* 159 */         if (i8 != MainMemory.getI32(i5)) {
/*     */           break label533;
/*     */         }
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
/* 172 */         i12 = MainMemory.getI32(paramInt2);
/* 173 */         if (_ZN9PixelInfo4Scan8isInScanEll.call(i13, i12, i8) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 177 */           i1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 186 */           i8 = MainMemory.getI32(i4);
/* 187 */           k = i8 + -1;
/* 188 */           m = i12 == k ? 1 : 0;
/* 189 */           n = MainMemory.getI32(i16);
/* 190 */           if (m == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */             if (i12 != n + i8) {
/*     */               break label533;
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
/* 213 */             if (m == 0) {
/*     */               break label510;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */           MainMemory.setI32(i4, k);
/* 224 */           MainMemory.setI32(i16, n + 1);
/* 225 */           i1 = 1;
/* 226 */           i2 = 1;
/* 227 */           i3 = 1;
/*     */           
/*     */           break label533;
/*     */           
/*     */           label510:
/* 232 */           MainMemory.setI32(i16, n + 1);
/* 233 */           i1 = 1;
/* 234 */           i2 = 1;
/* 235 */           i3 = 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label533:
/*     */         
/*     */ 
/*     */ 
/* 244 */         i14 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */       if (i2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */         i6 = MainMemory.getI32(i);
/* 264 */         i14 = 0;
/* 265 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 273 */           i15 = i6 + (i14 << 4);
/* 274 */           i16 = i6 + (i14 << 4) + 4;
/* 275 */           if (i1 != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */           if (i15 == MainMemory.getI32(j)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */           if (MainMemory.getI32(i16) == MainMemory.getI32(paramInt3)) {
/* 296 */             i11 = i15;
/*     */           } else {
/*     */             break label996;
/*     */           }
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
/* 310 */             m = i1 == 0 ? 1 : 0;
/* 311 */             i8 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 318 */               i12 = i8 + 1;
/* 319 */               i16 = i11 + (i12 << 4) + 4;
/* 320 */               i13 = i11 + (i12 << 4);
/* 321 */               if (m == 0) {
/*     */                 break label996;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */               if (i13 == MainMemory.getI32(j)) {
/*     */                 break label996;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */               if (MainMemory.getI32(i16) == MainMemory.getI32(paramInt3)) {
/*     */                 break;
/*     */               }
/*     */               
/* 347 */               i8 = i12;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */             i1 = _ZN9PixelInfo4Scan7addScanERKS0_.call(i15, i13);
/* 355 */             if (i1 == 0) {
/* 356 */               i11 = i13;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 367 */               i7 = MainMemory.getI32(j);
/* 368 */               i8 += 2;
/* 369 */               i9 = i11 + (i8 << 4);
/* 370 */               if (i9 == i7) {
/* 371 */                 i11 = i7;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 381 */                 k = i7 - i9 >> 4;
/* 382 */                 if (k > 0) {
/* 383 */                   n = 0;
/*     */                 }
/*     */                 else
/*     */                 {
/* 387 */                   i11 = i7;
/*     */                   
/*     */ 
/*     */                   break label951;
/*     */                 }
/*     */                 
/*     */                 for (;;)
/*     */                 {
/* 395 */                   i10 = n + 1;
/* 396 */                   _ZN9PixelInfo4ScanaSERKS0_.call(i11 + (i12 + n << 4), i11 + (i8 + n << 4));
/* 397 */                   if (i10 == k) {
/*     */                     break;
/*     */                   }
/*     */                   
/* 401 */                   n = i10;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */                 i11 = MainMemory.getI32(j);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label951:
/*     */               
/*     */ 
/* 416 */               i7 = i11 + -16;
/* 417 */               MainMemory.setI32(j, i7);
/* 418 */               SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i11 + -16)), i7);
/* 419 */               i11 = i13;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label996:
/*     */           
/* 426 */           i14 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 433 */       if (i3 != 0) {
/*     */         break label1040;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1410;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1040:
/*     */       
/*     */ 
/*     */ 
/* 449 */       i16 = paramInt1 + 16;
/* 450 */       i14 = MainMemory.getI32(i16);
/* 451 */       if (i14 != 0) {
/*     */         break label1157;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */       i12 = MainMemory.getI32(paramInt2);
/* 462 */       MainMemory.setI32(paramInt1 + 32, i12);
/* 463 */       MainMemory.setI32(paramInt1 + 28, i12);
/* 464 */       f = i12;
/* 465 */       MainMemory.setF32(paramInt1 + 20, f);
/* 466 */       i12 = MainMemory.getI32(paramInt3);
/* 467 */       MainMemory.setI32(paramInt1 + 40, i12);
/* 468 */       MainMemory.setI32(paramInt1 + 36, i12);
/* 469 */       f = i12;
/* 470 */       MainMemory.setF32(paramInt1 + 24, f);
/*     */       
/*     */       break label1396;
/*     */       
/*     */       label1157:
/* 475 */       i17 = paramInt1 + 20;
/* 476 */       f = MainMemory.getI32(paramInt2);
/* 477 */       f = MainMemory.getF32(i17) + f;
/* 478 */       MainMemory.setF32(i17, f);
/* 479 */       i17 = paramInt1 + 24;
/* 480 */       f = MainMemory.getI32(paramInt3);
/* 481 */       f = MainMemory.getF32(i17) + f;
/* 482 */       MainMemory.setF32(i17, f);
/* 483 */       i12 = MainMemory.getI32(paramInt2);
/* 484 */       i4 = paramInt1 + 28;
/* 485 */       if (i12 >= MainMemory.getI32(i4)) {
/*     */         break label1270;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 496 */       MainMemory.setI32(i4, i12);
/* 497 */       i12 = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */       label1270:
/*     */       
/*     */ 
/*     */ 
/* 505 */       paramInt2 = paramInt1 + 32;
/* 506 */       if (i12 <= MainMemory.getI32(paramInt2)) {
/*     */         break label1308;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */       MainMemory.setI32(paramInt2, i12);
/*     */       
/*     */ 
/*     */       label1308:
/*     */       
/*     */ 
/* 522 */       i12 = MainMemory.getI32(paramInt3);
/* 523 */       paramInt2 = paramInt1 + 36;
/* 524 */       if (i12 >= MainMemory.getI32(paramInt2)) {
/*     */         break label1358;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 535 */       MainMemory.setI32(paramInt2, i12);
/* 536 */       i12 = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */       label1358:
/*     */       
/*     */ 
/*     */ 
/* 544 */       paramInt2 = paramInt1 + 40;
/* 545 */       if (i12 <= MainMemory.getI32(paramInt2)) {
/*     */         break label1396;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 555 */       MainMemory.setI32(paramInt2, i12);
/*     */       
/*     */ 
/*     */       label1396:
/*     */       
/*     */ 
/* 561 */       MainMemory.setI32(i16, i14 + 1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1410:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2D8addPixelERlS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */