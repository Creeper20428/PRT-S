/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class pcox2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2807;
/*  12 */   public static final Function _instance = new pcox2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public pcox2s() { super("pcox2s", 10, false); }
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
/*  70 */     double d1 = 0.0D;
/*  71 */     boolean bool = false;
/*  72 */     double d2 = 0.0D;
/*  73 */     double d3 = 0.0D;
/*  74 */     double d4 = 0.0D;
/*  75 */     int i4 = 0;
/*  76 */     int i5 = 0;
/*  77 */     int i6 = 0;
/*  78 */     int i7 = 0;
/*  79 */     int i8 = 0;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     double d5 = 0.0D;
/*  83 */     double d6 = 0.0D;
/*  84 */     double d7 = 0.0D;
/*  85 */     double d8 = 0.0D;
/*  86 */     double d9 = 0.0D;
/*  87 */     double d10 = 0.0D;
/*  88 */     double d11 = 0.0D;
/*  89 */     double d12 = 0.0D;
/*  90 */     double d13 = 0.0D;
/*  91 */     double d14 = 0.0D;
/*  92 */     double d15 = 0.0D;
/*  93 */     double d16 = 0.0D;
/*  94 */     int i11 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 100 */       if (paramInt1 == 0) {
/* 101 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 111 */         if (MainMemory.getI32(paramInt1) != 602)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */           if (pcoset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 125 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1788;
/*     */           }
/*     */         }
/*     */         
/* 132 */         bool = paramInt3 > 0;
/* 133 */         i2 = bool ? paramInt3 : 1;
/* 134 */         j = bool ? paramInt2 : 1;
/* 135 */         paramInt3 = bool ? paramInt3 : paramInt2;
/* 136 */         if (paramInt2 <= 0) {
/*     */           break label239;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         pcox2s_1621.call(paramInt5, i2, paramInt1, paramInt6, paramInt2, paramInt4, paramInt8);
/*     */         
/*     */ 
/*     */         label239:
/*     */         
/*     */ 
/* 152 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 156 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 163 */           paramInt6 = paramInt1 + 352;
/* 164 */           k = paramInt1 + 368;
/* 165 */           m = paramInt1 + 360;
/* 166 */           n = paramInt1 + 376;
/* 167 */           i1 = paramInt1 + 8;
/* 168 */           if (j <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 172 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 179 */             paramInt2 = j * paramInt5 << 3;
/* 180 */             i2 = j << 2;
/*     */             
/*     */ 
/*     */ 
/* 184 */             i3 = 0;
/* 185 */             d6 = 0.0D;
/* 186 */             d5 = 0.0D;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 198 */               d1 = MainMemory.getF64(paramInt7 + (i3 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 199 */               d2 = MainMemory.getF64(k) * d1;
/* 200 */               d2 = SystemLibrary.fabs(d2);
/* 201 */               bool = MathUtils.f_olt(d2, 1.0E-12D);
/* 202 */               d2 += -90.0D;
/* 203 */               d3 = MathUtils.f_olt(d1, 0.0D) ? -90.0D : 90.0D;
/* 204 */               d4 = MathUtils.f_ogt(d1, 0.0D) ? 90.0D : -90.0D;
/* 205 */               i4 = paramInt9 + paramInt2;
/* 206 */               i5 = paramInt8 + paramInt2;
/* 207 */               i6 = paramInt10 + i2;
/* 208 */               i7 = 0;
/* 209 */               d13 = d6;
/* 210 */               d14 = d5;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 219 */                 i11 = i7 * paramInt5;
/* 220 */                 i8 = paramInt9 + (i11 << 3);
/* 221 */                 i9 = paramInt8 + (i11 << 3);
/* 222 */                 i10 = paramInt10 + (i7 << 2);
/* 223 */                 d5 = MainMemory.getF64(i9);
/* 224 */                 if (!bool) {
/*     */                   break label570;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */                 d5 = MainMemory.getF64(k) * d5;
/* 235 */                 MainMemory.setF64(i9, d5);
/* 236 */                 MainMemory.setF64(i8, 0.0D);
/* 237 */                 d5 = d14;
/* 238 */                 d6 = d13;
/*     */                 
/*     */                 break label1701;
/*     */                 
/*     */                 label570:
/* 243 */                 if (!MathUtils.f_olt(SystemLibrary.fabs(d2), 1.0E-12D)) {
/*     */                   break label628;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */                 MainMemory.setF64(i9, 0.0D);
/* 254 */                 MainMemory.setF64(i8, d3);
/* 255 */                 d5 = d14;
/* 256 */                 d6 = d13;
/*     */                 
/*     */                 break label1701;
/*     */                 
/*     */                 label628:
/* 261 */                 d6 = d5 * d5;
/* 262 */                 d7 = MainMemory.getF64(m);
/* 263 */                 d15 = d7 * d4;
/* 264 */                 d9 = d1 - d15;
/* 265 */                 d15 = d9 * d9;
/* 266 */                 d15 += d6;
/* 267 */                 d8 = d14;
/* 268 */                 d10 = d13;
/* 269 */                 d13 = d15;
/* 270 */                 d14 = -999.0D;
/* 271 */                 d15 = 0.0D;
/* 272 */                 d16 = d4;
/*     */                 
/* 274 */                 i11 = 0;
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
/*     */                 for (;;)
/*     */                 {
/* 288 */                   if (i11 >= 64)
/*     */                   {
/*     */ 
/*     */ 
/* 292 */                     d6 = d8;
/* 293 */                     d7 = d10;
/* 294 */                     d13 = d9;
/* 295 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 301 */                   if (!MathUtils.f_olt(d14, -100.0D)) {
/*     */                     break label787;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */                   d9 = d16 + d15;
/* 312 */                   d9 *= 0.5D;
/* 313 */                   d8 = d9;
/*     */                   
/*     */                   break label891;
/*     */                   
/*     */                   label787:
/* 318 */                   d9 = d13 - d14;
/* 319 */                   d9 = d13 / d9;
/* 320 */                   if (MathUtils.f_olt(d9, 0.1D)) {
/* 321 */                     d9 = 0.1D;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 331 */                     if (!MathUtils.f_ogt(d9, 0.9D)) {
/*     */                       break label861;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */                     d9 = 0.9D;
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label861:
/*     */                   
/*     */ 
/* 349 */                   d8 = d16 - d15;
/* 350 */                   d9 = d8 * d9;
/* 351 */                   d9 = d16 - d9;
/* 352 */                   d8 = d9;
/*     */                   
/*     */ 
/*     */ 
/*     */                   label891:
/*     */                   
/*     */ 
/* 359 */                   d9 = d7 * d8;
/* 360 */                   d9 = d1 - d9;
/* 361 */                   d10 = SystemLibrary.fmod(d8, 360.0D);
/* 362 */                   if (MathUtils.f_oeq(d10, 0.0D)) {
/* 363 */                     d10 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 373 */                   else if (MathUtils.f_oeq(SystemLibrary.fabs(d10), 180.0D)) {
/* 374 */                     d10 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 384 */                   else if ((MathUtils.f_oeq(d10, 45.0D)) || (MathUtils.f_oeq(d10, 225.0D))) {
/* 385 */                     d10 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 395 */                   else if ((MathUtils.f_oeq(d10, -135.0D)) || (MathUtils.f_oeq(d10, -315.0D))) {
/* 396 */                     d10 = -1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 406 */                     d10 = d8 * 3.141592653589793D;
/* 407 */                     d10 /= 180.0D;
/* 408 */                     d10 = SystemLibrary.tan(d10);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */                   d11 = MainMemory.getF64(n) / d10;
/* 417 */                   d11 = d9 - d11;
/* 418 */                   d11 *= d9;
/* 419 */                   d11 += d6;
/* 420 */                   if (MathUtils.f_olt(SystemLibrary.fabs(d11), 1.0E-12D)) {
/* 421 */                     d6 = d8;
/* 422 */                     d7 = d10;
/* 423 */                     d13 = d9;
/* 424 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */                   d12 = d16 - d15;
/* 434 */                   if (MathUtils.f_olt(SystemLibrary.fabs(d12), 1.0E-12D)) {
/* 435 */                     d6 = d8;
/* 436 */                     d7 = d10;
/* 437 */                     d13 = d9;
/* 438 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */                   if (MathUtils.f_ogt(d11, 0.0D)) {
/* 448 */                     d13 = d11;
/*     */                     
/*     */ 
/* 451 */                     d16 = d8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 462 */                     d14 = d11;
/* 463 */                     d15 = d8;
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
/* 474 */                   i11 += 1;
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
/*     */ 
/*     */ 
/*     */ 
/* 490 */                 d13 *= d7;
/* 491 */                 d13 = MainMemory.getF64(i1) - d13;
/* 492 */                 d5 *= d7;
/* 493 */                 if ((!MathUtils.f_une(d13, 0.0D)) && (!MathUtils.f_une(d5, 0.0D)))
/*     */                 {
/*     */ 
/*     */ 
/* 497 */                   d5 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 504 */                   if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                     break label1367;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */                   if (!MathUtils.f_ult(d13, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 518 */                     d5 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 525 */                     if (MathUtils.f_olt(d13, 0.0D)) {
/* 526 */                       d5 = 180.0D;
/*     */                       
/*     */                       break label1463;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1437;
/*     */                     }
/*     */                     label1367:
/* 535 */                     if (!MathUtils.f_oeq(d13, 0.0D)) {
/*     */                       break label1437;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 545 */                     if (MathUtils.f_ogt(d5, 0.0D)) {
/* 546 */                       d5 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 556 */                     else if (MathUtils.f_olt(d5, 0.0D)) {
/* 557 */                       d5 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label1437:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */                       d5 = SystemLibrary.atan2(d5, d13) * 180.0D;
/* 568 */                       d5 /= 3.141592653589793D;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1463:
/*     */                   
/*     */ 
/* 576 */                   if (!MathUtils.f_oeq(SystemLibrary.fmod(d6, 90.0D), 0.0D)) {
/*     */                     break label1634;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 586 */                   d13 = d6 / 90.0D;
/* 587 */                   d13 += -0.5D;
/* 588 */                   i11 = (int)SystemLibrary.floor(d13);
/* 589 */                   switch ((i11 > -1 ? i11 : 0 - i11) & 0x3) {
/*     */                   case 0:  break label1621;
/*     */                     break; case 1:  d13 = 0.0D;
/*     */                     break label1662;
/*     */                     break;
/*     */                   case 2: 
/*     */                     break; case 3:  d13 = 0.0D;
/*     */                     
/*     */ 
/*     */                     break label1662;
/*     */                     
/*     */                     break;
/*     */                   }
/*     */                   
/*     */                   
/* 604 */                   d13 = -1.0D;
/*     */                   
/*     */                   break label1662;
/*     */                   
/*     */                   label1621:
/* 609 */                   d13 = 1.0D;
/*     */                   
/*     */                   break label1662;
/*     */                   
/*     */                   label1634:
/* 614 */                   d13 = d6 * 3.141592653589793D;
/* 615 */                   d13 /= 180.0D;
/* 616 */                   d13 = SystemLibrary.sin(d13);
/*     */                   
/*     */ 
/*     */ 
/*     */                   label1662:
/*     */                   
/*     */ 
/*     */ 
/* 624 */                   d5 /= d13;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 632 */                 MainMemory.setF64(i9, d5);
/* 633 */                 MainMemory.setF64(i8, d6);
/* 634 */                 d5 = d6;
/* 635 */                 d6 = d7;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1701:
/*     */                 
/*     */ 
/*     */ 
/* 643 */                 MainMemory.setI32(i10, 0);
/* 644 */                 i7 += 1;
/* 645 */                 if (i7 == j) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/* 650 */                 d13 = d6;
/* 651 */                 d14 = d5;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 658 */               paramInt8 = i4;
/* 659 */               i8 = i5;
/* 660 */               paramInt10 = i6;
/* 661 */               i3 += 1;
/* 662 */               if (i3 == paramInt3) {
/* 663 */                 paramInt2 = 0; break;
/*     */               }
/*     */               
/*     */ 
/* 667 */               paramInt9 = paramInt8;
/* 668 */               paramInt8 = i8;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1788:
/*     */       
/*     */ 
/*     */ 
/* 680 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 686 */       int i12 = i;return i12;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/pcox2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */