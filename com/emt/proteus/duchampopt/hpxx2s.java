/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class hpxx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2795;
/*  12 */   public static final Function _instance = new hpxx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public hpxx2s() { super("hpxx2s", 10, false); }
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
/*  66 */     double d2 = 0.0D;
/*  67 */     int m = 0;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     double d3 = 0.0D;
/*  82 */     int i13 = 0;
/*  83 */     int i14 = 0;
/*  84 */     double d4 = 0.0D;
/*  85 */     int i15 = 0;
/*  86 */     int i16 = 0;
/*  87 */     int i17 = 0;
/*  88 */     int i18 = 0;
/*  89 */     double d5 = 0.0D;
/*  90 */     double d6 = 0.0D;
/*  91 */     double d7 = 0.0D;
/*  92 */     int i19 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  98 */       j = paramInt1 + 408;
/*  99 */       d1 = MainMemory.getF64(j) + 1.0E-12D;
/* 100 */       k = paramInt1 + 392;
/* 101 */       d2 = MainMemory.getF64(paramInt1 + 432) * MainMemory.getF64(k);
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
/* 113 */         if (MainMemory.getI32(paramInt1) != 801)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */           if (hpxset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 127 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1720;
/*     */           }
/*     */         }
/*     */         
/* 134 */         i3 = paramInt3 > 0 ? 1 : 0;
/* 135 */         i7 = i3 != 0 ? paramInt3 : 1;
/* 136 */         m = i3 != 0 ? paramInt2 : 1;
/* 137 */         paramInt3 = i3 != 0 ? paramInt3 : paramInt2;
/* 138 */         if (paramInt2 <= 0) {
/*     */           break label278;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         hpxx2s_1520.call(i7, paramInt5, paramInt4, j, paramInt8, paramInt1, paramInt2, paramInt9, paramInt6);
/*     */         
/*     */ 
/*     */         label278:
/*     */         
/*     */ 
/* 154 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 158 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 165 */           paramInt6 = paramInt1 + 368;
/* 166 */           n = paramInt1 + 352;
/* 167 */           i1 = paramInt1 + 400;
/* 168 */           i2 = paramInt1 + 444;
/* 169 */           i3 = m > 0 ? 1 : 0;
/* 170 */           i4 = paramInt1 + 440;
/* 171 */           i5 = paramInt1 + 32;
/* 172 */           i6 = paramInt1 + 384;
/* 173 */           paramInt2 = m * paramInt5 << 3;
/* 174 */           i7 = m << 2;
/*     */           
/*     */ 
/*     */ 
/* 178 */           i8 = 0;
/* 179 */           i12 = 0;
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
/* 190 */             i9 = paramInt10;
/* 191 */             i10 = paramInt8;
/* 192 */             i13 = paramInt9;
/* 193 */             d3 = MainMemory.getF64(paramInt7 + (i8 * paramInt4 << 3));
/* 194 */             d4 = d3 + MainMemory.getF64(n);
/* 195 */             d7 = MainMemory.getF64(paramInt6) * d4;
/* 196 */             d4 = SystemLibrary.fabs(d7);
/* 197 */             if (!MathUtils.f_ult(MainMemory.getF64(i1), d4)) {
/*     */               break label1401;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */             if (!MathUtils.f_ugt(d4, d2)) {
/*     */               break label631;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */             if (i3 == 0)
/*     */             {
/*     */ 
/*     */ 
/* 221 */               i12 = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 231 */               i13 += paramInt2;
/* 232 */               i10 += paramInt2;
/* 233 */               i9 += i7;
/* 234 */               i12 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 241 */                 i14 = i12 * paramInt5;
/* 242 */                 i16 = paramInt9 + (i14 << 3);
/* 243 */                 i18 = paramInt10 + (i12 << 2);
/* 244 */                 MainMemory.setF64(paramInt8 + (i14 << 3), 0.0D);
/* 245 */                 MainMemory.setF64(i16, 0.0D);
/* 246 */                 MainMemory.setI32(i18, 1);
/* 247 */                 i12 += 1;
/* 248 */                 if (i12 == m) {
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
/* 259 */               paramInt9 = i13;
/* 260 */               paramInt8 = i10;
/* 261 */               paramInt10 = i9;
/* 262 */               i12 = 3;
/*     */               
/*     */ 
/*     */               break label1692;
/*     */               
/*     */ 
/*     */               label631:
/*     */               
/* 270 */               i11 = (MainMemory.getI32(i2) != 0) || (MathUtils.f_ogt(d3, 0.0D)) ? 1 : 0;
/* 271 */               d4 /= MainMemory.getF64(j);
/* 272 */               d4 = MainMemory.getF64(k) - d4;
/* 273 */               if (MathUtils.f_oeq(d4, 0.0D)) {
/* 274 */                 i15 = i12;
/* 275 */                 d4 = 1.0E9D;
/* 276 */                 d7 = 90.0D;
/* 277 */                 i12 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 287 */                 d7 = d4 * d4;
/* 288 */                 d7 /= MainMemory.getF64(i5);
/* 289 */                 d7 = 1.0D - d7;
/* 290 */                 if (MathUtils.f_olt(d7, -1.0D)) {
/* 291 */                   i15 = 3;
/* 292 */                   d4 = 0.0D;
/* 293 */                   d7 = 0.0D;
/* 294 */                   i12 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 304 */                   d4 = 1.0D / d4;
/* 305 */                   if (!MathUtils.f_ugt(d7, -1.0D)) {
/*     */                     break label894;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */                   if (MathUtils.f_oeq(d7, 0.0D)) {
/* 316 */                     i15 = i12;
/*     */                     
/* 318 */                     d7 = 0.0D;
/* 319 */                     i12 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 329 */                     if (!MathUtils.f_ult(d7, 1.0D))
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */                       d6 = d7 + -1.0D;
/* 340 */                       if (MathUtils.f_olt(d6, 1.0E-10D)) {
/* 341 */                         i15 = i12;
/*     */                         
/* 343 */                         d7 = 90.0D;
/* 344 */                         i12 = 0;
/*     */                         
/*     */                         break label964;
/*     */                       }
/*     */                       else
/*     */                       {
/*     */                         break label933;
/*     */                       }
/*     */                       label894:
/* 353 */                       d6 = d7 + 1.0D;
/* 354 */                       if (MathUtils.f_ogt(d6, -1.0E-10D)) {
/* 355 */                         i15 = i12;
/*     */                         
/* 357 */                         d7 = -90.0D;
/* 358 */                         i12 = 0;
/*     */                         
/*     */ 
/*     */                         break label964;
/*     */                       }
/*     */                     }
/*     */                     
/*     */ 
/*     */                     label933:
/*     */                     
/* 368 */                     d7 = SystemLibrary.asin(d7) * 180.0D;
/* 369 */                     d7 /= 3.141592653589793D;
/* 370 */                     i15 = i12;
/*     */                     
/*     */ 
/* 373 */                     i12 = 0;
/*     */                   }
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label964:
/*     */               
/*     */ 
/* 383 */               if (!MathUtils.f_olt(d3, 0.0D))
/*     */               {
/*     */ 
/*     */ 
/* 387 */                 d3 = d7;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 394 */                 d3 = -0.0D - d7;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */               if (i3 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 406 */                 i12 = i15;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 416 */                 i13 += paramInt2;
/* 417 */                 i10 += paramInt2;
/* 418 */                 i9 += i7;
/* 419 */                 i14 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 430 */                   i19 = i14 * paramInt5;
/* 431 */                   i16 = paramInt9 + (i19 << 3);
/* 432 */                   i17 = paramInt8 + (i19 << 3);
/* 433 */                   i18 = paramInt10 + (i14 << 2);
/* 434 */                   if (i11 == 0) {
/*     */                     break label1121;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */                   d7 = MainMemory.getF64(i16);
/*     */                   
/*     */                   break label1218;
/*     */                   
/*     */                   label1121:
/*     */                   
/* 450 */                   d7 = MainMemory.getF64(j);
/* 451 */                   d6 = MainMemory.getF64(i17) / d7;
/* 452 */                   d5 = MainMemory.getF64(i16);
/* 453 */                   if (((int)SystemLibrary.floor(d6) + MainMemory.getI32(i4) & 0x1) != 0) {
/*     */                     break label1199;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */                   d7 = d5 + d7;
/* 464 */                   MainMemory.setF64(i16, d7);
/*     */                   
/*     */                   break label1218;
/*     */                   
/*     */                   label1199:
/*     */                   
/* 470 */                   d7 = d5 - d7;
/* 471 */                   MainMemory.setF64(i16, d7);
/*     */                   
/*     */ 
/*     */ 
/*     */                   label1218:
/*     */                   
/*     */ 
/*     */ 
/* 479 */                   d6 = d7 * d4;
/* 480 */                   if (!MathUtils.f_olt(SystemLibrary.fabs(d6), d1))
/*     */                   {
/*     */ 
/*     */ 
/* 484 */                     d4 = 0.0D;
/* 485 */                     d7 = 0.0D;
/* 486 */                     i19 = 1;
/* 487 */                     i15 = 3;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/* 495 */                     if (!MathUtils.f_une(d6, 0.0D)) {
/*     */                       break label1301;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 506 */                     d4 = d6 - d7;
/* 507 */                     d6 = d4;
/*     */                     
/*     */ 
/*     */ 
/*     */                     label1301:
/*     */                     
/*     */ 
/* 514 */                     d4 = MainMemory.getF64(i17) + d6;
/*     */                     
/* 516 */                     d7 = d3;
/* 517 */                     i19 = i12;
/*     */                   }
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
/* 530 */                   MainMemory.setF64(i17, d4);
/* 531 */                   MainMemory.setF64(i16, d7);
/* 532 */                   MainMemory.setI32(i18, i19);
/* 533 */                   i14 += 1;
/* 534 */                   if (i14 == m) {
/*     */                     break;
/*     */                   }
/*     */                   
/*     */ 
/* 539 */                   d4 = d6;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 547 */                 paramInt9 = i13;
/* 548 */                 paramInt8 = i10;
/* 549 */                 paramInt10 = i9;
/* 550 */                 i12 = i15;
/*     */                 
/*     */ 
/*     */                 break label1692;
/*     */                 
/*     */ 
/*     */                 label1401:
/*     */                 
/* 558 */                 d3 = d7 / MainMemory.getF64(i6);
/* 559 */                 if (!MathUtils.f_ugt(d3, -1.0D)) {
/*     */                   break label1518;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 569 */                 if (MathUtils.f_oeq(d3, 0.0D)) {
/* 570 */                   d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 580 */                   if (!MathUtils.f_ult(d3, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 590 */                     d4 = d3 + -1.0D;
/* 591 */                     if (MathUtils.f_olt(d4, 1.0E-10D)) {
/* 592 */                       d3 = 90.0D;
/*     */                       
/*     */                       break label1574;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1550;
/*     */                     }
/*     */                     label1518:
/* 601 */                     d4 = d3 + 1.0D;
/* 602 */                     if (MathUtils.f_ogt(d4, -1.0E-10D)) {
/* 603 */                       d3 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label1574;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1550:
/*     */                   
/* 613 */                   d3 = SystemLibrary.asin(d3) * 180.0D;
/* 614 */                   d3 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1574:
/*     */                 
/*     */ 
/* 622 */                 if (i3 == 0) {
/*     */                   break label1692;
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
/*     */ 
/* 636 */                 i13 += paramInt2;
/* 637 */                 i10 += paramInt2;
/* 638 */                 i9 += i7;
/* 639 */                 i14 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 646 */                   i18 = paramInt10 + (i14 << 2);
/* 647 */                   MainMemory.setF64(paramInt9 + (i14 * paramInt5 << 3), d3);
/* 648 */                   MainMemory.setI32(i18, 0);
/* 649 */                   i14 += 1;
/* 650 */                   if (i14 == m) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 661 */                 paramInt9 = i13;
/* 662 */                 paramInt8 = i10;
/* 663 */                 paramInt10 = i9;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1692:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 677 */             i8 += 1;
/* 678 */             if (i8 == paramInt3) {
/* 679 */               paramInt2 = i12; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1720:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 695 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 701 */       int i20 = i;return i20;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/hpxx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */