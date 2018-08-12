/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fits_setup_shape extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3594;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new fits_setup_shape();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public fits_setup_shape() { super("fits_setup_shape", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*  40 */     int i2 = 0;
/*  41 */     double d1 = 0.0D;
/*  42 */     double d2 = 0.0D;
/*  43 */     double d3 = 0.0D;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     double d4 = 0.0D;
/*  49 */     double d5 = 0.0D;
/*  50 */     double d6 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       i = paramInt + 4;
/*  57 */       j = MainMemory.getI32(i);
/*  58 */       if (j != 11) {
/*     */         break label96;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       k = MainMemory.getI32(paramInt + 44 + 4);
/*     */       
/*     */       break label106;
/*     */       
/*     */       label96:
/*     */       
/*  74 */       k = paramInt + 44;
/*     */       
/*     */ 
/*     */ 
/*     */       label106:
/*     */       
/*     */ 
/*     */ 
/*  82 */       switch (j) {
/*     */       case 1: 
/*     */         break label1638;
/*     */         break;
/*     */       case 2: 
/*     */         break label1602;
/*     */         break;
/*     */       case 3: 
/*     */         break label1540;
/*     */         break;
/*     */       case 4: 
/*     */         break label1460;
/*     */         break;
/*     */       case 5: 
/*     */         break label1310;
/*     */         break;
/*     */       case 6: 
/*     */         break label1230;
/*     */         break; case 7:  break label1080;
/*     */         break; case 8:  break label806;
/*     */         break; case 9:  break label726;
/*     */         break; case 10:  break label425;
/*     */         break; case 12:  break label363;
/*     */         break; case 13:  break; case 14:  break; }
/* 106 */       m = k + 80;
/* 107 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 108 */       d1 *= 3.141592653589793D;
/* 109 */       MainMemory.setF64(paramInt + 132, SystemLibrary.sin(d1));
/* 110 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 111 */       d1 *= 3.141592653589793D;
/* 112 */       MainMemory.setF64(paramInt + 140, SystemLibrary.cos(d1));
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label363:
/*     */       
/* 118 */       d1 = MainMemory.getF64(paramInt + 84);
/* 119 */       d1 *= d1;
/* 120 */       MainMemory.setF64(paramInt + 148, d1);
/* 121 */       d1 = MainMemory.getF64(paramInt + 92);
/* 122 */       d1 *= d1;
/* 123 */       MainMemory.setF64(paramInt + 156, d1);
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label425:
/*     */       
/* 129 */       m = k + 16;
/* 130 */       d1 = MainMemory.getF64(m);
/* 131 */       if (!MathUtils.f_ogt(d1, 180.0D)) {
/*     */         break label503;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 144 */         d1 += -360.0D;
/* 145 */       } while (MathUtils.f_ogt(d1, 180.0D));
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
/* 156 */       MainMemory.setF64(m, d1);
/*     */       
/*     */ 
/*     */ 
/*     */       label503:
/*     */       
/*     */ 
/*     */ 
/* 164 */       if (!MathUtils.f_ugt(d1, -180.0D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           d1 += 360.0D;
/* 177 */           if (MathUtils.f_ugt(d1, -180.0D)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */         MainMemory.setF64(m, d1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 194 */       m = k + 24;
/* 195 */       d1 = MainMemory.getF64(m);
/* 196 */       if (!MathUtils.f_ogt(d1, 180.0D)) {
/*     */         break label646;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 209 */         d1 += -360.0D;
/* 210 */       } while (MathUtils.f_ogt(d1, 180.0D));
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
/* 221 */       MainMemory.setF64(m, d1);
/*     */       
/*     */ 
/*     */ 
/*     */       label646:
/*     */       
/*     */ 
/*     */ 
/* 229 */       if (!MathUtils.f_ugt(d1, -180.0D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */           d1 += 360.0D;
/* 242 */           if (MathUtils.f_ugt(d1, -180.0D)) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */         MainMemory.setF64(m, d1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 259 */       j = MainMemory.getI32(i);
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label726:
/*     */       
/* 265 */       m = k + 32;
/* 266 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 267 */       d1 *= 3.141592653589793D;
/* 268 */       MainMemory.setF64(paramInt + 132, SystemLibrary.sin(d1));
/* 269 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 270 */       d1 *= 3.141592653589793D;
/* 271 */       MainMemory.setF64(paramInt + 140, SystemLibrary.cos(d1));
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label806:
/*     */       
/* 277 */       m = k + 32;
/* 278 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 279 */       d1 *= 3.141592653589793D;
/* 280 */       d1 = SystemLibrary.sin(d1);
/* 281 */       MainMemory.setF64(paramInt + 132, d1);
/* 282 */       d2 = MainMemory.getF64(m) / 180.0D;
/* 283 */       d2 *= 3.141592653589793D;
/* 284 */       d2 = SystemLibrary.cos(d2);
/* 285 */       MainMemory.setF64(paramInt + 140, d2);
/* 286 */       i1 = k + 16;
/* 287 */       d3 = MainMemory.getF64(i1) - MainMemory.getF64(k);
/* 288 */       d3 *= 0.5D;
/* 289 */       m = k + 24;
/* 290 */       n = k + 8;
/* 291 */       d6 = MainMemory.getF64(m) - MainMemory.getF64(n);
/* 292 */       d6 *= 0.5D;
/* 293 */       d4 = d2 * d3;
/* 294 */       d5 = d1 * d6;
/* 295 */       d4 += d5;
/* 296 */       MainMemory.setF64(paramInt + 148, SystemLibrary.fabs(d4));
/* 297 */       d2 *= d6;
/* 298 */       d1 *= d3;
/* 299 */       d1 = d2 - d1;
/* 300 */       MainMemory.setF64(paramInt + 156, SystemLibrary.fabs(d1));
/* 301 */       d1 = MainMemory.getF64(i1) + MainMemory.getF64(k);
/* 302 */       d1 *= 0.5D;
/* 303 */       MainMemory.setF64(paramInt + 84, d1);
/* 304 */       d1 = MainMemory.getF64(m) + MainMemory.getF64(n);
/* 305 */       d1 *= 0.5D;
/* 306 */       MainMemory.setF64(paramInt + 92, d1);
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label1080:
/*     */       
/* 312 */       m = k + 48;
/* 313 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 314 */       d1 *= 3.141592653589793D;
/* 315 */       MainMemory.setF64(paramInt + 148, SystemLibrary.sin(d1));
/* 316 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 317 */       d1 *= 3.141592653589793D;
/* 318 */       MainMemory.setF64(paramInt + 156, SystemLibrary.cos(d1));
/* 319 */       m = k + 56;
/* 320 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 321 */       d1 *= 3.141592653589793D;
/* 322 */       MainMemory.setF64(paramInt + 132, SystemLibrary.sin(d1));
/* 323 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 324 */       d1 *= 3.141592653589793D;
/* 325 */       MainMemory.setF64(paramInt + 140, SystemLibrary.cos(d1));
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label1230:
/*     */       
/* 331 */       m = k + 32;
/* 332 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 333 */       d1 *= 3.141592653589793D;
/* 334 */       MainMemory.setF64(paramInt + 132, SystemLibrary.sin(d1));
/* 335 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 336 */       d1 *= 3.141592653589793D;
/* 337 */       MainMemory.setF64(paramInt + 140, SystemLibrary.cos(d1));
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label1310:
/*     */       
/* 343 */       m = k + 48;
/* 344 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 345 */       d1 *= 3.141592653589793D;
/* 346 */       MainMemory.setF64(paramInt + 148, SystemLibrary.sin(d1));
/* 347 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 348 */       d1 *= 3.141592653589793D;
/* 349 */       MainMemory.setF64(paramInt + 156, SystemLibrary.cos(d1));
/* 350 */       m = k + 56;
/* 351 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 352 */       d1 *= 3.141592653589793D;
/* 353 */       MainMemory.setF64(paramInt + 132, SystemLibrary.sin(d1));
/* 354 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 355 */       d1 *= 3.141592653589793D;
/* 356 */       MainMemory.setF64(paramInt + 140, SystemLibrary.cos(d1));
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label1460:
/*     */       
/* 362 */       m = k + 32;
/* 363 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 364 */       d1 *= 3.141592653589793D;
/* 365 */       MainMemory.setF64(paramInt + 132, SystemLibrary.sin(d1));
/* 366 */       d1 = MainMemory.getF64(m) / 180.0D;
/* 367 */       d1 *= 3.141592653589793D;
/* 368 */       MainMemory.setF64(paramInt + 140, SystemLibrary.cos(d1));
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label1540:
/*     */       
/* 374 */       d1 = MainMemory.getF64(k + 16);
/* 375 */       d1 *= d1;
/* 376 */       MainMemory.setF64(paramInt + 148, d1);
/* 377 */       d1 = MainMemory.getF64(k + 24);
/* 378 */       d1 *= d1;
/* 379 */       MainMemory.setF64(paramInt + 156, d1);
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label1602:
/*     */       
/* 385 */       d1 = MainMemory.getF64(k + 16);
/* 386 */       d1 *= d1;
/* 387 */       MainMemory.setF64(paramInt + 148, d1);
/*     */       
/*     */       break label1803;
/*     */       
/*     */       label1638:
/*     */       
/* 393 */       d1 = MainMemory.getF64(k + 16) - MainMemory.getF64(k);
/* 394 */       d2 = MainMemory.getF64(k + 24) - MainMemory.getF64(k + 8);
/* 395 */       d3 = d1 * d1;
/* 396 */       d6 = d2 * d2;
/* 397 */       d3 += d6;
/* 398 */       d3 = SystemLibrary.sqrt(d3);
/* 399 */       if (!MathUtils.f_une(d3, 0.0D)) {
/*     */         break label1753;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */       d2 /= d3;
/* 410 */       MainMemory.setF64(paramInt + 132, d2);
/* 411 */       d1 /= d3;
/*     */       
/*     */       break label1770;
/*     */       
/*     */       label1753:
/*     */       
/* 417 */       MainMemory.setF64(paramInt + 132, 0.0D);
/* 418 */       d1 = 1.0D;
/*     */       
/*     */ 
/*     */ 
/*     */       label1770:
/*     */       
/*     */ 
/* 425 */       MainMemory.setF64(paramInt + 140, d1);
/* 426 */       d1 = d3 + 0.5D;
/* 427 */       MainMemory.setF64(paramInt + 148, d1);
/*     */       
/*     */ 
/*     */ 
/*     */       label1803:
/*     */       
/*     */ 
/*     */ 
/* 435 */       switch (j) {
/* 436 */       case 0:  d1 = 1.0D;
/*     */         break label2434;
/*     */         break;
/*     */       case 2: 
/*     */         break label2398;
/*     */         break;
/*     */       case 3: 
/*     */         break label2379;
/*     */         break;
/*     */       case 4: 
/*     */         break label2327;
/*     */         break;
/*     */       case 5: 
/*     */         break label2275;
/*     */         break; case 6:  break label2215;
/*     */         break; case 7:  break label2169;
/*     */         break; case 9:  break label2092;
/*     */         break; case 12:  break label2073;
/*     */         break; case 13:  break label2021;
/*     */         break; case 14:  break; }
/* 456 */       d1 = MainMemory.getF64(k + 56) * MainMemory.getF64(k + 64);
/* 457 */       d1 *= 2.0D;
/* 458 */       d1 = SystemLibrary.sqrt(d1) * 0.5D;
/*     */       
/*     */       break label2412;
/*     */       
/*     */       label2021:
/*     */       
/* 464 */       d1 = MainMemory.getF64(k + 56);
/* 465 */       d2 = MainMemory.getF64(k + 64);
/* 466 */       if (!MathUtils.f_ogt(d1, d2))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 477 */         d1 = d2;
/*     */         
/*     */         break label2412;
/*     */         
/*     */         label2073:
/* 482 */         d1 = MainMemory.getF64(k + 48);
/*     */         
/*     */         break label2412;
/*     */         
/*     */         label2092:
/*     */         
/* 488 */         d1 = MainMemory.getF64(k + 16);
/* 489 */         d2 = MainMemory.getF64(k + 24);
/* 490 */         if (!MathUtils.f_ogt(d1, d2)) {
/*     */           break label2151;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 500 */         d1 *= 0.5D;
/*     */         
/*     */         break label2412;
/*     */         
/*     */         label2151:
/*     */         
/* 506 */         d1 = d2 * 0.5D;
/*     */         
/*     */         break label2412;
/*     */         
/*     */         label2169:
/*     */         
/* 512 */         d1 = MainMemory.getF64(k + 32) * MainMemory.getF64(k + 40);
/* 513 */         d1 *= 2.0D;
/* 514 */         d1 = SystemLibrary.sqrt(d1) * 0.5D;
/*     */         
/*     */         break label2412;
/*     */         
/*     */         label2215:
/*     */         
/* 520 */         d1 = MainMemory.getF64(k + 16);
/* 521 */         d1 *= d1;
/* 522 */         d2 = MainMemory.getF64(k + 24);
/* 523 */         d2 *= d2;
/* 524 */         d1 += d2;
/* 525 */         d1 = SystemLibrary.sqrt(d1) * 0.5D;
/*     */         
/*     */         break label2412;
/*     */         
/*     */         label2275:
/*     */         
/* 531 */         d1 = MainMemory.getF64(k + 32);
/* 532 */         d2 = MainMemory.getF64(k + 40);
/* 533 */         if (!MathUtils.f_ogt(d1, d2))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 544 */           d1 = d2;
/*     */           
/*     */           break label2412;
/*     */           
/*     */           label2327:
/* 549 */           d1 = MainMemory.getF64(k + 16);
/* 550 */           d2 = MainMemory.getF64(k + 24);
/* 551 */           if (!MathUtils.f_ogt(d1, d2))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 562 */             d1 = d2;
/*     */             
/*     */             break label2412;
/*     */             
/*     */             label2379:
/* 567 */             d1 = MainMemory.getF64(k + 24);
/*     */             
/*     */             break label2412;
/*     */             
/*     */             label2398:
/*     */             
/* 573 */             d1 = MainMemory.getF64(k + 16);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label2412:
/*     */       
/* 581 */       if (!MathUtils.f_ogt(d1, 0.0D)) {
/*     */         break label2521;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label2434:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 593 */       d2 = MainMemory.getF64(k) - d1;
/* 594 */       MainMemory.setF64(paramInt + 12, d2);
/* 595 */       d2 = MainMemory.getF64(k) + d1;
/* 596 */       MainMemory.setF64(paramInt + 20, d2);
/* 597 */       k += 8;
/* 598 */       d2 = MainMemory.getF64(k) - d1;
/* 599 */       MainMemory.setF64(paramInt + 28, d2);
/* 600 */       d1 = MainMemory.getF64(k) + d1;
/* 601 */       MainMemory.setF64(paramInt + 36, d1);
/*     */       
/*     */ 
/*     */       break label3390;
/*     */       
/*     */       label2521:
/*     */       
/* 608 */       switch (j) {
/*     */       case 1: 
/*     */         break label3175;
/*     */         break;
/*     */       case 8: 
/*     */         break label3021;
/*     */         break;
/*     */       case 10: 
/*     */         break label2975;
/*     */         break;
/*     */       case 11: 
/*     */         break;
/*     */       }
/* 621 */       d6 = MainMemory.getF64(k);
/* 622 */       m = paramInt + 12;
/* 623 */       MainMemory.setF64(m, d6);
/* 624 */       d3 = MainMemory.getF64(k);
/* 625 */       n = paramInt + 20;
/* 626 */       MainMemory.setF64(n, d3);
/* 627 */       i2 = k + 8;
/* 628 */       d2 = MainMemory.getF64(i2);
/* 629 */       i1 = paramInt + 28;
/* 630 */       MainMemory.setF64(i1, d2);
/* 631 */       d1 = MainMemory.getF64(i2);
/* 632 */       i2 = paramInt + 36;
/* 633 */       MainMemory.setF64(i2, d1);
/* 634 */       j = MainMemory.getI32(paramInt + 44);
/* 635 */       if (j > 2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 640 */         i3 = 0;
/*     */       } else {
/*     */         break label3385;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 655 */         i6 = i3 << 1;
/* 656 */         i4 = k + (i6 + 2 << 3);
/* 657 */         i5 = k + (i6 + 3 << 3);
/* 658 */         i6 += 4;
/* 659 */         d4 = MainMemory.getF64(i4);
/* 660 */         if (!MathUtils.f_ogt(d6, d4))
/*     */         {
/*     */ 
/*     */ 
/* 664 */           d5 = d4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 672 */           MainMemory.setF64(m, d4);
/* 673 */           d6 = MainMemory.getF64(i4);
/* 674 */           d5 = d6;
/* 675 */           d6 = d4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 683 */         if (!MathUtils.f_olt(d3, d5)) {
/*     */           break label2845;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 694 */         MainMemory.setF64(n, d5);
/* 695 */         d3 = d5;
/*     */         
/*     */ 
/*     */ 
/*     */         label2845:
/*     */         
/*     */ 
/* 702 */         d4 = MainMemory.getF64(i5);
/* 703 */         if (!MathUtils.f_ogt(d2, d4))
/*     */         {
/*     */ 
/*     */ 
/* 707 */           d5 = d4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 715 */           MainMemory.setF64(i1, d4);
/* 716 */           d2 = MainMemory.getF64(i5);
/* 717 */           d5 = d2;
/* 718 */           d2 = d4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 726 */         if (!MathUtils.f_olt(d1, d5)) {
/*     */           break label2945;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 737 */         MainMemory.setF64(i2, d5);
/* 738 */         d1 = d5;
/*     */         
/*     */ 
/*     */ 
/*     */         label2945:
/*     */         
/*     */ 
/* 745 */         i3 += 1;
/* 746 */         if (j <= i6) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       break label2975;
/*     */       
/*     */ 
/*     */       break label3385;
/*     */       
/*     */ 
/*     */       label2975:
/*     */       
/* 760 */       MainMemory.setF64(paramInt + 12, 1.0D);
/* 761 */       MainMemory.setF64(paramInt + 20, -1.0D);
/* 762 */       MainMemory.setF64(paramInt + 28, 1.0D);
/* 763 */       MainMemory.setF64(paramInt + 36, -1.0D);
/*     */       
/*     */ 
/*     */       break label3390;
/*     */       
/*     */       label3021:
/*     */       
/* 770 */       n = k + 40;
/* 771 */       d1 = MainMemory.getF64(n);
/* 772 */       d2 = d1 - MainMemory.getF64(k);
/* 773 */       d2 *= d2;
/* 774 */       m = k + 48;
/* 775 */       d3 = MainMemory.getF64(m) - MainMemory.getF64(k + 8);
/* 776 */       d3 *= d3;
/* 777 */       d2 += d3;
/* 778 */       d2 = SystemLibrary.sqrt(d2);
/* 779 */       d1 -= d2;
/* 780 */       MainMemory.setF64(paramInt + 12, d1);
/* 781 */       d1 = MainMemory.getF64(n) + d2;
/* 782 */       MainMemory.setF64(paramInt + 20, d1);
/* 783 */       d1 = MainMemory.getF64(m) - d2;
/* 784 */       MainMemory.setF64(paramInt + 28, d1);
/* 785 */       d1 = MainMemory.getF64(m) + d2;
/* 786 */       MainMemory.setF64(paramInt + 36, d1);
/*     */       
/*     */ 
/*     */       break label3390;
/*     */       
/*     */       label3175:
/*     */       
/* 793 */       d1 = MainMemory.getF64(k);
/* 794 */       m = k + 16;
/* 795 */       d2 = MainMemory.getF64(m);
/* 796 */       n = paramInt + 12;
/* 797 */       if (!MathUtils.f_ogt(d1, d2)) {
/*     */         break label3251;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 807 */       MainMemory.setF64(n, d2);
/* 808 */       MainMemory.setF64(paramInt + 20, MainMemory.getF64(k));
/*     */       
/*     */       break label3275;
/*     */       
/*     */       label3251:
/* 813 */       MainMemory.setF64(n, d1);
/* 814 */       MainMemory.setF64(paramInt + 20, MainMemory.getF64(m));
/*     */       
/*     */ 
/*     */       label3275:
/*     */       
/*     */ 
/* 820 */       m = k + 8;
/* 821 */       d1 = MainMemory.getF64(m);
/* 822 */       k += 24;
/* 823 */       d2 = MainMemory.getF64(k);
/* 824 */       n = paramInt + 28;
/* 825 */       if (!MathUtils.f_ogt(d1, d2)) {
/*     */         break label3357;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 835 */       MainMemory.setF64(n, d2);
/* 836 */       MainMemory.setF64(paramInt + 36, MainMemory.getF64(m));
/*     */       
/*     */ 
/*     */       break label3390;
/*     */       
/*     */       label3357:
/*     */       
/* 843 */       MainMemory.setF64(n, d1);
/* 844 */       MainMemory.setF64(paramInt + 36, MainMemory.getF64(k));
/*     */       
/*     */ 
/*     */ 
/*     */       label3385:
/*     */       
/*     */ 
/*     */ 
/*     */       label3390:
/*     */       
/*     */ 
/*     */ 
/* 856 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_setup_shape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */