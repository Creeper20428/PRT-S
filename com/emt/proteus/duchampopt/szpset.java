/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class szpset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2860;
/*  12 */   public static final Function _instance = new szpset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public szpset() { super("szpset", 1, false); }
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
/*  42 */     int n = 0;
/*  43 */     double d4 = 0.0D;
/*  44 */     double d5 = 0.0D;
/*  45 */     double d6 = 0.0D;
/*  46 */     double d7 = 0.0D;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*     */     
/*     */ 
/*  53 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       j = MainMemory.alloc(4);
/*  58 */       k = MainMemory.alloc(8);
/*  59 */       m = MainMemory.alloc(8);
/*  60 */       if (paramInt == 0) {
/*  61 */         i1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  71 */         MainMemory.setI32(paramInt, 102);
/*  72 */         MainMemory.setI32(paramInt + 4, 5266003);
/*  73 */         n = paramInt + 24;
/*  74 */         d4 = MainMemory.getF64(n);
/*  75 */         if (!MathUtils.f_oeq(d4, 9.87654321E107D))
/*     */         {
/*     */ 
/*     */ 
/*  79 */           d1 = d4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  86 */           MainMemory.setF64(n, 0.0D);
/*  87 */           d1 = 0.0D;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         n = paramInt + 32;
/*  95 */         d4 = MainMemory.getF64(n);
/*  96 */         if (!MathUtils.f_oeq(d4, 9.87654321E107D))
/*     */         {
/*     */ 
/*     */ 
/* 100 */           d2 = d4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 107 */           MainMemory.setF64(n, 0.0D);
/* 108 */           d2 = 0.0D;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         n = paramInt + 40;
/* 116 */         d4 = MainMemory.getF64(n);
/* 117 */         if (!MathUtils.f_oeq(d4, 9.87654321E107D))
/*     */         {
/*     */ 
/*     */ 
/* 121 */           d3 = d4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 128 */           MainMemory.setF64(n, 90.0D);
/* 129 */           d3 = 90.0D;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         n = paramInt + 8;
/* 137 */         d4 = MainMemory.getF64(n);
/* 138 */         if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */           break label321;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */         MainMemory.setF64(n, 57.29577951308232D);
/* 150 */         d4 = 57.29577951308232D;
/*     */         
/*     */ 
/*     */ 
/*     */         label321:
/*     */         
/*     */ 
/* 157 */         SystemLibrary.memcpy(paramInt + 276, 71520, 27, 1);
/* 158 */         MainMemory.setI32(paramInt + 316, 1);
/* 159 */         MainMemory.setI32(paramInt + 320, 103);
/* 160 */         MainMemory.setI32(paramInt + 324, MathUtils.f_oeq(d3, 90.0D) ? 1 : 0);
/* 161 */         MainMemory.setI32(paramInt + 328, 0);
/* 162 */         MainMemory.setI32(paramInt + 332, 0);
/* 163 */         MainMemory.setI32(paramInt + 336, 0);
/* 164 */         MainMemory.setI32(paramInt + 340, MathUtils.f_ole(d1, 1.0D) ? 1 : 0);
/* 165 */         d5 = 1.0D / d4;
/* 166 */         MainMemory.setF64(paramInt + 360, d5);
/* 167 */         if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */           break label614;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         d5 = d3 / 90.0D;
/* 178 */         d5 += -0.5D;
/* 179 */         i1 = (int)SystemLibrary.floor(d5);
/* 180 */         switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */         case 0:  break label601;
/*     */           break; case 1:  d5 = 0.0D;
/*     */           break label642;
/*     */           break;
/*     */         case 2: 
/*     */           break; case 3:  d5 = 0.0D;
/*     */           
/*     */ 
/*     */           break label642;
/*     */           
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 195 */         d5 = -1.0D;
/*     */         
/*     */         break label642;
/*     */         
/*     */         label601:
/* 200 */         d5 = 1.0D;
/*     */         
/*     */         break label642;
/*     */         
/*     */         label614:
/* 205 */         d5 = d3 * 3.141592653589793D;
/* 206 */         d5 /= 180.0D;
/* 207 */         d5 = SystemLibrary.sin(d5);
/*     */         
/*     */ 
/*     */ 
/*     */         label642:
/*     */         
/*     */ 
/*     */ 
/* 215 */         d5 = d1 * d5;
/* 216 */         d5 += 1.0D;
/* 217 */         MainMemory.setF64(paramInt + 384, d5);
/* 218 */         if (MathUtils.f_oeq(d5, 0.0D)) {
/* 219 */           i1 = 2;
/*     */         } else {
/*     */           break label703;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */       i = i1;
/*     */       
/*     */ 
/*     */       break label2077;
/*     */       
/*     */       label703:
/*     */       
/* 237 */       d7 = -0.0D - d1;
/* 238 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */         break label882;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */       d6 = d3 / 90.0D;
/* 249 */       d6 += 0.5D;
/* 250 */       i1 = (int)SystemLibrary.floor(d6);
/* 251 */       switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */       case 0:  break label869;
/*     */         break; case 1:  d6 = 0.0D;
/*     */         break label910;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d6 = 0.0D;
/*     */         
/*     */ 
/*     */         break label910;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 266 */       d6 = -1.0D;
/*     */       
/*     */       break label910;
/*     */       
/*     */       label869:
/* 271 */       d6 = 1.0D;
/*     */       
/*     */       break label910;
/*     */       
/*     */       label882:
/* 276 */       d6 = d3 * 3.141592653589793D;
/* 277 */       d6 /= 180.0D;
/* 278 */       d6 = SystemLibrary.cos(d6);
/*     */       
/*     */ 
/*     */ 
/*     */       label910:
/*     */       
/*     */ 
/*     */ 
/* 286 */       d7 = d6 * d7;
/* 287 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */         break label1086;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */       d6 = d2 / 90.0D;
/* 298 */       d6 += -0.5D;
/* 299 */       i1 = (int)SystemLibrary.floor(d6);
/* 300 */       switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */       case 0:  break label1073;
/*     */         break; case 1:  d6 = 0.0D;
/*     */         break label1114;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d6 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1114;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 315 */       d6 = -1.0D;
/*     */       
/*     */       break label1114;
/*     */       
/*     */       label1073:
/* 320 */       d6 = 1.0D;
/*     */       
/*     */       break label1114;
/*     */       
/*     */       label1086:
/* 325 */       d6 = d2 * 3.141592653589793D;
/* 326 */       d6 /= 180.0D;
/* 327 */       d6 = SystemLibrary.sin(d6);
/*     */       
/*     */ 
/*     */ 
/*     */       label1114:
/*     */       
/*     */ 
/*     */ 
/* 335 */       d7 *= d6;
/* 336 */       MainMemory.setF64(paramInt + 368, d7);
/* 337 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */         break label1302;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 347 */       d6 = d3 / 90.0D;
/* 348 */       d6 += 0.5D;
/* 349 */       i1 = (int)SystemLibrary.floor(d6);
/* 350 */       switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */       case 0:  break label1289;
/*     */         break; case 1:  d3 = 0.0D;
/*     */         break label1330;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d3 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1330;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 365 */       d3 = -1.0D;
/*     */       
/*     */       break label1330;
/*     */       
/*     */       label1289:
/* 370 */       d3 = 1.0D;
/*     */       
/*     */       break label1330;
/*     */       
/*     */       label1302:
/* 375 */       d3 *= 3.141592653589793D;
/* 376 */       d3 /= 180.0D;
/* 377 */       d3 = SystemLibrary.cos(d3);
/*     */       
/*     */ 
/*     */ 
/*     */       label1330:
/*     */       
/*     */ 
/*     */ 
/* 385 */       d1 *= d3;
/* 386 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */         break label1506;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */       d3 = d2 / 90.0D;
/* 397 */       d3 += 0.5D;
/* 398 */       i1 = (int)SystemLibrary.floor(d3);
/* 399 */       switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */       case 0:  break label1493;
/*     */         break; case 1:  d2 = 0.0D;
/*     */         break label1534;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d2 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1534;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 414 */       d2 = -1.0D;
/*     */       
/*     */       break label1534;
/*     */       
/*     */       label1493:
/* 419 */       d2 = 1.0D;
/*     */       
/*     */       break label1534;
/*     */       
/*     */       label1506:
/* 424 */       d2 *= 3.141592653589793D;
/* 425 */       d2 /= 180.0D;
/* 426 */       d2 = SystemLibrary.cos(d2);
/*     */       
/*     */ 
/*     */ 
/*     */       label1534:
/*     */       
/*     */ 
/*     */ 
/* 434 */       d2 = d1 * d2;
/* 435 */       MainMemory.setF64(paramInt + 376, d2);
/* 436 */       d1 = d4 * d7;
/* 437 */       MainMemory.setF64(paramInt + 392, d1);
/* 438 */       d2 = d4 * d2;
/* 439 */       MainMemory.setF64(paramInt + 400, d2);
/* 440 */       d4 *= d5;
/* 441 */       MainMemory.setF64(paramInt + 408, d4);
/* 442 */       d4 = d5 + -1.0D;
/* 443 */       d2 = d4 * d5;
/* 444 */       d2 += -1.0D;
/* 445 */       MainMemory.setF64(paramInt + 416, d2);
/* 446 */       if (!MathUtils.f_olt(SystemLibrary.fabs(d4), 1.0D)) {
/*     */         break label1849;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 456 */       d4 = 1.0D - d5;
/* 457 */       if (!MathUtils.f_ugt(d4, -1.0D)) {
/*     */         break label1773;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 467 */       if (MathUtils.f_oeq(d4, 0.0D)) {
/* 468 */         d4 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 478 */         if (!MathUtils.f_ult(d4, 1.0D))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 488 */           d2 = d4 + -1.0D;
/* 489 */           if (MathUtils.f_olt(d2, 1.0E-10D)) {
/* 490 */             d4 = 90.0D;
/*     */             
/*     */             break label1829;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label1805;
/*     */           }
/*     */           label1773:
/* 499 */           d2 = d4 + 1.0D;
/* 500 */           if (MathUtils.f_ogt(d2, -1.0E-10D)) {
/* 501 */             d4 = -90.0D;
/*     */             
/*     */ 
/*     */             break label1829;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label1805:
/*     */         
/* 511 */         d4 = SystemLibrary.asin(d4) * 180.0D;
/* 512 */         d4 /= 3.141592653589793D;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1829:
/*     */       
/*     */ 
/* 520 */       MainMemory.setF64(paramInt + 424, d4);
/*     */       
/*     */       break label1865;
/*     */       
/*     */       label1849:
/* 525 */       MainMemory.setF64(paramInt + 424, -90.0D);
/*     */       
/*     */ 
/*     */       label1865:
/*     */       
/*     */ 
/* 531 */       MainMemory.setI32(paramInt + 448, 2861);
/* 532 */       MainMemory.setI32(paramInt + 452, 2862);
/* 533 */       n = paramInt + 344;
/* 534 */       MainMemory.setF64(n, 0.0D);
/* 535 */       i2 = paramInt + 352;
/* 536 */       MainMemory.setF64(i2, 0.0D);
/* 537 */       i3 = paramInt + 256;
/* 538 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 548 */         i4 = paramInt + 264;
/* 549 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label2007;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 559 */       MainMemory.setF64(i3, 0.0D);
/* 560 */       MainMemory.setF64(paramInt + 264, 90.0D);
/* 561 */       i = 0;
/*     */       
/*     */ 
/*     */       break label2077;
/*     */       
/*     */       label2007:
/*     */       
/* 568 */       if (szps2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label2070;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 578 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 579 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 580 */       i = 0;
/*     */       
/*     */ 
/*     */       break label2077;
/*     */       
/*     */       label2070:
/*     */       
/* 587 */       i = 2;
/*     */       
/*     */ 
/*     */       label2077:
/*     */       
/*     */ 
/* 593 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 598 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/szpset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */