/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class cooset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2869;
/*  12 */   public static final Function _instance = new cooset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cooset() { super("cooset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     double d1 = 0.0D;
/*  40 */     double d2 = 0.0D;
/*  41 */     double d3 = 0.0D;
/*  42 */     double d4 = 0.0D;
/*  43 */     double d5 = 0.0D;
/*  44 */     boolean bool = false;
/*  45 */     double d6 = 0.0D;
/*  46 */     double d7 = 0.0D;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*     */     
/*     */ 
/*  54 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       j = MainMemory.alloc(4);
/*  59 */       k = MainMemory.alloc(8);
/*  60 */       m = MainMemory.alloc(8);
/*  61 */       if (paramInt == 0) {
/*  62 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  72 */         MainMemory.setI32(paramInt, 504);
/*  73 */         MainMemory.setI32(paramInt + 4, 5197635);
/*  74 */         d1 = MainMemory.getF64(paramInt + 24);
/*  75 */         if (MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*  76 */           n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  86 */           i1 = paramInt + 32;
/*  87 */           d2 = MainMemory.getF64(i1);
/*  88 */           if (!MathUtils.f_oeq(d2, 9.87654321E107D))
/*     */           {
/*     */ 
/*     */ 
/*  92 */             d5 = d2;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  99 */             MainMemory.setF64(i1, 0.0D);
/* 100 */             d5 = 0.0D;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           i1 = paramInt + 8;
/* 108 */           d2 = MainMemory.getF64(i1);
/* 109 */           if (!MathUtils.f_oeq(d2, 0.0D)) {
/*     */             break label244;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */           MainMemory.setF64(i1, 57.29577951308232D);
/* 121 */           d2 = 57.29577951308232D;
/*     */           
/*     */ 
/*     */ 
/*     */           label244:
/*     */           
/*     */ 
/* 128 */           SystemLibrary.memcpy(paramInt + 276, 61216, 19, 1);
/* 129 */           MainMemory.setI32(paramInt + 316, 5);
/* 130 */           MainMemory.setI32(paramInt + 320, 102);
/* 131 */           MainMemory.setI32(paramInt + 324, 0);
/* 132 */           MainMemory.setI32(paramInt + 328, 0);
/* 133 */           MainMemory.setI32(paramInt + 332, 1);
/* 134 */           MainMemory.setI32(paramInt + 336, 0);
/* 135 */           MainMemory.setI32(paramInt + 340, 1);
/* 136 */           d3 = d1 - d5;
/* 137 */           d4 = d1 + d5;
/* 138 */           d5 = 90.0D - d3;
/* 139 */           d5 *= 0.5D;
/* 140 */           d6 = SystemLibrary.fmod(d5, 360.0D);
/* 141 */           if (MathUtils.f_oeq(d6, 0.0D)) {
/* 142 */             d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 152 */           else if (MathUtils.f_oeq(SystemLibrary.fabs(d6), 180.0D)) {
/* 153 */             d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 163 */           else if ((MathUtils.f_oeq(d6, 45.0D)) || (MathUtils.f_oeq(d6, 225.0D))) {
/* 164 */             d5 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 174 */           else if ((MathUtils.f_oeq(d6, -135.0D)) || (MathUtils.f_oeq(d6, -315.0D))) {
/* 175 */             d5 = -1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 185 */             d5 *= 3.141592653589793D;
/* 186 */             d5 /= 180.0D;
/* 187 */             d5 = SystemLibrary.tan(d5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */           bool = MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D);
/* 196 */           if (!bool) {
/*     */             break label686;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */           d6 = d3 / 90.0D;
/* 207 */           d6 += 0.5D;
/* 208 */           n = (int)SystemLibrary.floor(d6);
/* 209 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label673;
/*     */             break; case 1:  d6 = 0.0D;
/*     */             break label714;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d6 = 0.0D;
/*     */             
/*     */ 
/*     */             break label714;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 224 */           d6 = -1.0D;
/*     */           
/*     */           break label714;
/*     */           
/*     */           label673:
/* 229 */           d6 = 1.0D;
/*     */           
/*     */           break label714;
/*     */           
/*     */           label686:
/* 234 */           d6 = d3 * 3.141592653589793D;
/* 235 */           d6 /= 180.0D;
/* 236 */           d6 = SystemLibrary.cos(d6);
/*     */           
/*     */ 
/*     */ 
/*     */           label714:
/*     */           
/*     */ 
/*     */ 
/* 244 */           if (!MathUtils.f_oeq(d3, d4)) {
/*     */             break label946;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */           if (!bool) {
/*     */             break label898;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */           d4 = d3 / 90.0D;
/* 265 */           d4 += -0.5D;
/* 266 */           n = (int)SystemLibrary.floor(d4);
/* 267 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label885;
/*     */             break; case 1:  d4 = 0.0D;
/*     */             break label926;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d4 = 0.0D;
/*     */             
/*     */ 
/*     */             break label926;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 282 */           d4 = -1.0D;
/*     */           
/*     */           break label926;
/*     */           
/*     */           label885:
/* 287 */           d4 = 1.0D;
/*     */           
/*     */           break label926;
/*     */           
/*     */           label898:
/* 292 */           d4 = d3 * 3.141592653589793D;
/* 293 */           d4 /= 180.0D;
/* 294 */           d4 = SystemLibrary.sin(d4);
/*     */           
/*     */ 
/*     */ 
/*     */           label926:
/*     */           
/*     */ 
/*     */ 
/* 302 */           MainMemory.setF64(paramInt + 360, d4);
/*     */           
/*     */           break label1364;
/*     */           
/*     */           label946:
/*     */           
/* 308 */           d3 = 90.0D - d4;
/* 309 */           d3 *= 0.5D;
/* 310 */           d7 = SystemLibrary.fmod(d3, 360.0D);
/* 311 */           if (MathUtils.f_oeq(d7, 0.0D)) {
/* 312 */             d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 322 */           else if (MathUtils.f_oeq(SystemLibrary.fabs(d7), 180.0D)) {
/* 323 */             d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 333 */           else if ((MathUtils.f_oeq(d7, 45.0D)) || (MathUtils.f_oeq(d7, 225.0D))) {
/* 334 */             d3 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 344 */           else if ((MathUtils.f_oeq(d7, -135.0D)) || (MathUtils.f_oeq(d7, -315.0D))) {
/* 345 */             d3 = -1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 355 */             d3 *= 3.141592653589793D;
/* 356 */             d3 /= 180.0D;
/* 357 */             d3 = SystemLibrary.tan(d3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d4, 90.0D), 0.0D)) {
/*     */             break label1290;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */           d7 = d4 / 90.0D;
/* 376 */           d7 += 0.5D;
/* 377 */           n = (int)SystemLibrary.floor(d7);
/* 378 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label1277;
/*     */             break; case 1:  d4 = 0.0D;
/*     */             break label1318;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d4 = 0.0D;
/*     */             
/*     */ 
/*     */             break label1318;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 393 */           d4 = -1.0D;
/*     */           
/*     */           break label1318;
/*     */           
/*     */           label1277:
/* 398 */           d4 = 1.0D;
/*     */           
/*     */           break label1318;
/*     */           
/*     */           label1290:
/* 403 */           d4 *= 3.141592653589793D;
/* 404 */           d4 /= 180.0D;
/* 405 */           d4 = SystemLibrary.cos(d4);
/*     */           
/*     */ 
/*     */ 
/*     */           label1318:
/*     */           
/*     */ 
/*     */ 
/* 413 */           d4 /= d6;
/* 414 */           d4 = SystemLibrary.log(d4);
/* 415 */           d3 /= d5;
/* 416 */           d4 /= SystemLibrary.log(d3);
/* 417 */           MainMemory.setF64(paramInt + 360, d4);
/*     */           
/*     */ 
/*     */ 
/*     */           label1364:
/*     */           
/*     */ 
/*     */ 
/* 425 */           if (MathUtils.f_oeq(d4, 0.0D)) {
/* 426 */             n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 436 */             d3 = 1.0D / d4;
/* 437 */             MainMemory.setF64(paramInt + 368, d3);
/* 438 */             d6 /= d4;
/* 439 */             d2 *= d6;
/* 440 */             d2 /= SystemLibrary.pow(d5, d4);
/* 441 */             MainMemory.setF64(paramInt + 384, d2);
/* 442 */             if (MathUtils.f_oeq(d2, 0.0D)) {
/* 443 */               n = 2;
/*     */             } else {
/*     */               break label1476;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 454 */       i = n;
/*     */       
/*     */ 
/*     */       break label1900;
/*     */       
/*     */       label1476:
/*     */       
/* 461 */       d5 = 90.0D - d1;
/* 462 */       d5 *= 0.5D;
/* 463 */       d6 = SystemLibrary.fmod(d5, 360.0D);
/* 464 */       if (MathUtils.f_oeq(d6, 0.0D)) {
/* 465 */         d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 475 */       else if (MathUtils.f_oeq(SystemLibrary.fabs(d6), 180.0D)) {
/* 476 */         d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 486 */       else if ((MathUtils.f_oeq(d6, 45.0D)) || (MathUtils.f_oeq(d6, 225.0D))) {
/* 487 */         d5 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 497 */       else if ((MathUtils.f_oeq(d6, -135.0D)) || (MathUtils.f_oeq(d6, -315.0D))) {
/* 498 */         d5 = -1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 508 */         d5 *= 3.141592653589793D;
/* 509 */         d5 /= 180.0D;
/* 510 */         d5 = SystemLibrary.tan(d5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 518 */       d5 = d2 * SystemLibrary.pow(d5, d4);
/* 519 */       MainMemory.setF64(paramInt + 376, d5);
/* 520 */       d2 = 1.0D / d2;
/* 521 */       MainMemory.setF64(paramInt + 392, d2);
/* 522 */       MainMemory.setI32(paramInt + 448, 2870);
/* 523 */       MainMemory.setI32(paramInt + 452, 2871);
/* 524 */       i1 = paramInt + 344;
/* 525 */       MainMemory.setF64(i1, 0.0D);
/* 526 */       i2 = paramInt + 352;
/* 527 */       MainMemory.setF64(i2, 0.0D);
/* 528 */       i3 = paramInt + 256;
/* 529 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 539 */         i4 = paramInt + 264;
/* 540 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label1830;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 550 */       MainMemory.setF64(i3, 0.0D);
/* 551 */       MainMemory.setF64(paramInt + 264, d1);
/* 552 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1900;
/*     */       
/*     */       label1830:
/*     */       
/* 559 */       if (coos2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label1893;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 569 */       MainMemory.setF64(i1, MainMemory.getF64(k));
/* 570 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 571 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1900;
/*     */       
/*     */       label1893:
/*     */       
/* 578 */       i = 2;
/*     */       
/*     */ 
/*     */       label1900:
/*     */       
/*     */ 
/* 584 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 589 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cooset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */