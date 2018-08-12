/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class sphs2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2884;
/*  12 */   public static final Function _instance = new sphs2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public sphs2x() { super("sphs2x", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  19 */     call(paramInt1, paramDouble, paramInt2, paramInt3, paramInt4);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, d, j, k, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, double paramDouble, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     double d1 = 0.0D;
/*  55 */     double d2 = 0.0D;
/*  56 */     double d3 = 0.0D;
/*  57 */     double d4 = 0.0D;
/*  58 */     int i3 = 0;
/*  59 */     double d5 = 0.0D;
/*  60 */     double d6 = 0.0D;
/*  61 */     boolean bool = false;
/*     */     
/*     */ 
/*  64 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       i = MainMemory.alloc(8);
/*  69 */       j = MainMemory.alloc(8);
/*  70 */       k = MainMemory.alloc(8);
/*  71 */       m = MainMemory.alloc(8);
/*  72 */       n = paramInt1 + 32;
/*  73 */       if (!MathUtils.f_oeq(MainMemory.getF64(n), 0.0D)) {
/*     */         break label433;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */       d1 = MainMemory.getF64(paramInt1 + 16);
/*  84 */       if (!MathUtils.f_oeq(MainMemory.getF64(paramInt1 + 8), 0.0D)) {
/*     */         break label290;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       d1 += -180.0D;
/*  95 */       d1 -= MainMemory.getF64(paramInt1);
/*  96 */       paramDouble = SystemLibrary.fmod(d1, 360.0D) + paramDouble;
/*  97 */       MainMemory.setF64(paramInt3, SystemLibrary.fmod(paramDouble, 360.0D));
/*  98 */       MainMemory.setF64(paramInt4, MainMemory.getF64(paramInt2));
/*  99 */       paramDouble = MainMemory.getF64(paramInt3);
/* 100 */       if (!MathUtils.f_ogt(paramDouble, 180.0D)) {
/*     */         break label245;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       paramDouble += -360.0D;
/* 111 */       MainMemory.setF64(paramInt3, paramDouble);
/*     */       
/*     */ 
/*     */       break label2089;
/*     */       
/*     */       label245:
/*     */       
/* 118 */       if (!MathUtils.f_olt(paramDouble, -180.0D)) {
/*     */         break label1649;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       paramDouble += 360.0D;
/* 129 */       MainMemory.setF64(paramInt3, paramDouble);
/*     */       
/*     */ 
/*     */       break label2089;
/*     */       
/*     */       label290:
/*     */       
/* 136 */       d1 += MainMemory.getF64(paramInt1);
/* 137 */       paramDouble = SystemLibrary.fmod(d1, 360.0D) - paramDouble;
/* 138 */       MainMemory.setF64(paramInt3, SystemLibrary.fmod(paramDouble, 360.0D));
/* 139 */       paramDouble = -0.0D - MainMemory.getF64(paramInt2);
/* 140 */       MainMemory.setF64(paramInt4, paramDouble);
/* 141 */       paramDouble = MainMemory.getF64(paramInt3);
/* 142 */       if (!MathUtils.f_ogt(paramDouble, 180.0D)) {
/*     */         break label388;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */       paramDouble += -360.0D;
/* 153 */       MainMemory.setF64(paramInt3, paramDouble);
/*     */       
/*     */ 
/*     */       break label2089;
/*     */       
/*     */       label388:
/*     */       
/* 160 */       if (!MathUtils.f_olt(paramDouble, -180.0D)) {
/*     */         break label1649;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */       paramDouble += 360.0D;
/* 171 */       MainMemory.setF64(paramInt3, paramDouble);
/*     */       
/*     */ 
/*     */       break label2089;
/*     */       
/*     */       label433:
/*     */       
/* 178 */       paramDouble -= MainMemory.getF64(paramInt1);
/* 179 */       MainMemory.setF64(paramInt3, paramDouble);
/* 180 */       i1 = paramInt1 + 24;
/* 181 */       i2 = paramInt1 + 8;
/* 182 */       paramInt1 += 16;
/* 183 */       d1 = MainMemory.getF64(paramInt2);
/* 184 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */         break label760;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */       d2 = d1 / 90.0D;
/* 195 */       d2 += 0.5D;
/* 196 */       i3 = (int)SystemLibrary.floor(d2);
/* 197 */       switch ((i3 > -1 ? i3 : 0 - i3) & 0x3) {
/*     */       case 0: 
/*     */         break label732;
/*     */         break;
/*     */       case 1: 
/*     */         break label684;
/*     */         break;
/*     */       case 2: 
/*     */         break label652;
/*     */         break;
/*     */       case 3: 
/*     */         break;
/*     */       }
/* 210 */       d1 = MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D;
/* 211 */       MainMemory.setF64(k, d1);
/* 212 */       MainMemory.setF64(i, 0.0D);
/*     */       
/* 214 */       d3 = d1;
/* 215 */       d1 = 0.0D;
/*     */       
/*     */       break label810;
/*     */       
/*     */       label652:
/* 220 */       MainMemory.setF64(k, 0.0D);
/* 221 */       MainMemory.setF64(i, -1.0D);
/*     */       
/* 223 */       d3 = 0.0D;
/* 224 */       d1 = -1.0D;
/*     */       
/*     */       break label810;
/*     */       
/*     */       label684:
/* 229 */       d1 = MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D;
/* 230 */       MainMemory.setF64(k, d1);
/* 231 */       MainMemory.setF64(i, 0.0D);
/*     */       
/* 233 */       d3 = d1;
/* 234 */       d1 = 0.0D;
/*     */       
/*     */       break label810;
/*     */       
/*     */       label732:
/* 239 */       MainMemory.setF64(k, 0.0D);
/* 240 */       MainMemory.setF64(i, 1.0D);
/*     */       
/* 242 */       d3 = 0.0D;
/* 243 */       d1 = 1.0D;
/*     */       
/*     */       break label810;
/*     */       
/*     */       label760:
/* 248 */       paramDouble = d1 * 3.141592653589793D;
/* 249 */       paramDouble /= 180.0D;
/* 250 */       SystemLibrary.sincos(paramDouble, k, i);
/* 251 */       d1 = MainMemory.getF64(i);
/* 252 */       d2 = MainMemory.getF64(k);
/* 253 */       paramDouble = MainMemory.getF64(paramInt3);
/*     */       
/* 255 */       d3 = d2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label810:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 265 */       d2 = MainMemory.getF64(i1);
/* 266 */       d5 = d2 * d1;
/* 267 */       d6 = MainMemory.getF64(n);
/* 268 */       d1 = d6 * d1;
/* 269 */       d2 *= d3;
/* 270 */       d6 *= d3;
/* 271 */       sincosd.call(paramDouble, m, j);
/* 272 */       d3 = MainMemory.getF64(j);
/* 273 */       d4 = d5 * d3;
/* 274 */       d6 -= d4;
/* 275 */       if (!MathUtils.f_olt(SystemLibrary.fabs(d6), 1.0E-5D))
/*     */       {
/*     */ 
/*     */ 
/* 279 */         d5 = d6;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 286 */         d6 = 1.0D - d3;
/* 287 */         d5 = d6 * d5;
/* 288 */         d6 = MainMemory.getF64(paramInt2) + MainMemory.getF64(i2);
/* 289 */         if (!MathUtils.f_oeq(SystemLibrary.fmod(d6, 90.0D), 0.0D)) {
/*     */           break label1106;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */         d4 = d6 / 90.0D;
/* 300 */         d4 += 0.5D;
/* 301 */         i3 = (int)SystemLibrary.floor(d4);
/* 302 */         switch ((i3 > -1 ? i3 : 0 - i3) & 0x3) {
/*     */         case 0:  break label1093;
/*     */           break; case 1:  d6 = 0.0D;
/*     */           break label1134;
/*     */           break;
/*     */         case 2: 
/*     */           break; case 3:  d6 = 0.0D;
/*     */           
/*     */ 
/*     */           break label1134;
/*     */           
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 317 */         d6 = -1.0D;
/*     */         
/*     */         break label1134;
/*     */         
/*     */         label1093:
/* 322 */         d6 = 1.0D;
/*     */         
/*     */         break label1134;
/*     */         
/*     */         label1106:
/* 327 */         d6 *= 3.141592653589793D;
/* 328 */         d6 /= 180.0D;
/* 329 */         d6 = SystemLibrary.cos(d6);
/*     */         
/*     */ 
/*     */ 
/*     */         label1134:
/*     */         
/*     */ 
/*     */ 
/* 337 */         d5 -= d6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */       d6 = -0.0D - MainMemory.getF64(i);
/* 346 */       d6 = MainMemory.getF64(m) * d6;
/* 347 */       if ((!MathUtils.f_une(d5, 0.0D)) && (!MathUtils.f_une(d6, 0.0D))) {
/*     */         break label1378;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */       if (!MathUtils.f_oeq(d6, 0.0D)) {
/*     */         break label1277;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 367 */       if (!MathUtils.f_ult(d5, 0.0D))
/*     */       {
/*     */ 
/*     */ 
/* 371 */         d4 = 0.0D;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 378 */         if (MathUtils.f_olt(d5, 0.0D)) {
/* 379 */           d4 = 180.0D;
/*     */           
/*     */           break label1434;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label1347;
/*     */         }
/*     */         label1277:
/* 388 */         if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */           break label1347;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */         if (MathUtils.f_ogt(d6, 0.0D)) {
/* 399 */           d4 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 409 */         else if (MathUtils.f_olt(d6, 0.0D)) {
/* 410 */           d4 = -90.0D;
/*     */         }
/*     */         else
/*     */         {
/*     */           label1347:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */           d4 = SystemLibrary.atan2(d6, d5) * 180.0D;
/* 421 */           d4 /= 3.141592653589793D;
/*     */           
/*     */           break label1434;
/*     */           
/*     */           label1378:
/*     */           
/* 427 */           if (!MathUtils.f_olt(MainMemory.getF64(i2), 90.0D)) {
/*     */             break label1422;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 437 */           d4 = paramDouble + -180.0D;
/*     */           
/*     */           break label1434;
/*     */           
/*     */           label1422:
/*     */           
/* 443 */           d4 = -0.0D - paramDouble;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1434:
/*     */       
/*     */ 
/* 451 */       d4 = MainMemory.getF64(paramInt1) + d4;
/* 452 */       d4 = SystemLibrary.fmod(d4, 360.0D);
/* 453 */       MainMemory.setF64(paramInt3, d4);
/* 454 */       if (!MathUtils.f_ogt(d4, 180.0D)) {
/*     */         break label1509;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */       d4 += -360.0D;
/* 465 */       MainMemory.setF64(paramInt3, d4);
/*     */       
/*     */       break label1521;
/*     */       
/*     */       label1509:
/* 470 */       sphs2x_1664.call(d4, paramInt3);
/*     */       
/*     */ 
/*     */       label1521:
/*     */       
/*     */ 
/* 476 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(paramDouble, 180.0D), 0.0D)) {
/*     */         break label1659;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */       paramDouble = MainMemory.getF64(i2) * d3;
/* 487 */       paramDouble = MainMemory.getF64(paramInt2) + paramDouble;
/* 488 */       if (!MathUtils.f_ogt(paramDouble, 90.0D)) {
/*     */         break label1598;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */       paramDouble = 180.0D - paramDouble;
/*     */       
/*     */ 
/*     */ 
/*     */       label1598:
/*     */       
/*     */ 
/*     */ 
/* 507 */       MainMemory.setF64(paramInt4, paramDouble);
/* 508 */       if (!MathUtils.f_olt(paramDouble, -90.0D)) {
/*     */         break label1649;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 518 */       paramDouble = -180.0D - paramDouble;
/* 519 */       MainMemory.setF64(paramInt4, paramDouble);
/*     */       
/*     */ 
/*     */       break label2089;
/*     */       
/*     */ 
/*     */       label1649:
/*     */       
/*     */ 
/*     */       break label2089;
/*     */       
/*     */       label1659:
/*     */       
/* 532 */       paramDouble = d1 * d3;
/* 533 */       paramDouble += d2;
/* 534 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble), 0.99D)) {
/*     */         break label1927;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 544 */       bool = MathUtils.f_olt(paramDouble, 0.0D);
/* 545 */       paramDouble = d5 * d5;
/* 546 */       d1 = d6 * d6;
/* 547 */       paramDouble += d1;
/* 548 */       paramDouble = SystemLibrary.sqrt(paramDouble);
/* 549 */       if (!MathUtils.f_ult(paramDouble, 1.0D)) {
/*     */         break label1827;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 559 */       if (MathUtils.f_oeq(paramDouble, 0.0D)) {
/* 560 */         paramDouble = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 570 */         if (!MathUtils.f_ugt(paramDouble, -1.0D))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 580 */           d1 = paramDouble + 1.0D;
/* 581 */           if (MathUtils.f_ogt(d1, -1.0E-10D)) {
/* 582 */             paramDouble = 180.0D;
/*     */             
/*     */             break label1877;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label1857;
/*     */           }
/*     */           label1827:
/* 591 */           d1 = paramDouble + -1.0D;
/* 592 */           if (MathUtils.f_olt(d1, 1.0E-10D)) {
/* 593 */             paramDouble = 0.0D;
/*     */             
/*     */ 
/*     */             break label1877;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label1857:
/*     */         
/* 603 */         paramDouble = SystemLibrary.acos(paramDouble) * 180.0D;
/* 604 */         paramDouble /= 3.141592653589793D;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1877:
/*     */       
/*     */ 
/* 612 */       paramDouble = SystemLibrary.fabs(paramDouble);
/* 613 */       if (!bool) {
/*     */         break label1911;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 624 */       paramDouble = -0.0D - paramDouble;
/*     */       
/*     */ 
/*     */ 
/*     */       label1911:
/*     */       
/*     */ 
/*     */ 
/* 632 */       MainMemory.setF64(paramInt4, paramDouble);
/*     */       
/*     */ 
/*     */       break label2089;
/*     */       
/*     */       label1927:
/*     */       
/* 639 */       if (!MathUtils.f_ugt(paramDouble, -1.0D)) {
/*     */         break label2028;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 649 */       if (MathUtils.f_oeq(paramDouble, 0.0D)) {
/* 650 */         paramDouble = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 660 */         if (!MathUtils.f_ult(paramDouble, 1.0D))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 670 */           d1 = paramDouble + -1.0D;
/* 671 */           if (MathUtils.f_olt(d1, 1.0E-10D)) {
/* 672 */             paramDouble = 90.0D;
/*     */             
/*     */             break label2078;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label2058;
/*     */           }
/*     */           label2028:
/* 681 */           d1 = paramDouble + 1.0D;
/* 682 */           if (MathUtils.f_ogt(d1, -1.0E-10D)) {
/* 683 */             paramDouble = -90.0D;
/*     */             
/*     */ 
/*     */             break label2078;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label2058:
/*     */         
/* 693 */         paramDouble = SystemLibrary.asin(paramDouble) * 180.0D;
/* 694 */         paramDouble /= 3.141592653589793D;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2078:
/*     */       
/*     */ 
/* 702 */       MainMemory.setF64(paramInt4, paramDouble);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2089:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 713 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sphs2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */