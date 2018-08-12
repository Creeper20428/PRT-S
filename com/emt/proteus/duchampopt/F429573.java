/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F429573 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3682;
/*  12 */   public static final Function _instance = new F429573();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F429573() { super("F429573", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     call(paramInt1, paramInt2);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*  54 */     int i12 = 0;
/*  55 */     int i13 = 0;
/*  56 */     int i14 = 0;
/*  57 */     int i15 = 0;
/*  58 */     int i16 = 0;
/*  59 */     int i17 = 0;
/*  60 */     int i18 = 0;
/*  61 */     int i19 = 0;
/*  62 */     int i20 = 0;
/*  63 */     int i21 = 0;
/*  64 */     int i22 = 0;
/*  65 */     int i23 = 0;
/*  66 */     int i24 = 0;
/*  67 */     int i25 = 0;
/*     */     
/*     */ 
/*  70 */     int i27 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       i = MainMemory.alloc(32);
/*  75 */       j = MainMemory.getI32(paramInt2);
/*  76 */       k = paramInt2 + 8;
/*  77 */       i5 = MainMemory.getI32(k);
/*  78 */       i3 = MainMemory.getI32(i5);
/*  79 */       i4 = MainMemory.getI32(i5 + 12);
/*  80 */       m = paramInt1 + 5200;
/*  81 */       MainMemory.setI32(m, 0);
/*  82 */       i10 = paramInt1 + 5204;
/*  83 */       MainMemory.setI32(i10, 573);
/*  84 */       if (i4 > 0) {
/*  85 */         i8 = -1;
/*  86 */         n = 0;
/*     */       }
/*     */       else
/*     */       {
/*  90 */         n = -1;
/*  91 */         i8 = 0;
/*     */         
/*     */ 
/*     */         break label359;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/* 100 */         if (MainMemory.getI16(j + (n << 2)) != 0) {
/*     */           break label239;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         MainMemory.setI16(j + (n << 2) + 2, (short)0);
/*     */         
/*     */         break label295;
/*     */         
/*     */         label239:
/*     */         
/* 116 */         i23 = paramInt1 + 5208 + n;
/* 117 */         i8 = MainMemory.getI32(m) + 1;
/* 118 */         MainMemory.setI32(m, i8);
/* 119 */         MainMemory.setI32(paramInt1 + 2908 + (i8 << 2), n);
/* 120 */         MainMemory.setI8(i23, (byte)0);
/* 121 */         i8 = n;
/*     */         
/*     */ 
/*     */ 
/*     */         label295:
/*     */         
/*     */ 
/* 128 */         n += 1;
/* 129 */         if (n == i4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       i14 = MainMemory.getI32(m);
/* 142 */       if (i14 < 2) {
/* 143 */         n = i8;
/* 144 */         i8 = i14;
/*     */       }
/*     */       else
/*     */       {
/* 148 */         n = i8;
/*     */         
/*     */ 
/*     */         break label567;
/*     */       }
/*     */       
/*     */ 
/*     */       label359:
/*     */       
/* 157 */       i1 = paramInt1 + 5800;
/* 158 */       i11 = i3 == 0 ? 1 : 0;
/* 159 */       i2 = paramInt1 + 5804;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 169 */         i8 += 1;
/* 170 */         MainMemory.setI32(m, i8);
/* 171 */         i17 = n < 2 ? 1 : 0;
/* 172 */         i18 = n + 1;
/* 173 */         i14 = i17 != 0 ? i18 : 0;
/* 174 */         n = i17 != 0 ? i18 : n;
/* 175 */         MainMemory.setI32(paramInt1 + 2908 + (i8 << 2), i14);
/* 176 */         MainMemory.setI16(j + (i14 << 2), (short)1);
/* 177 */         MainMemory.setI8(paramInt1 + 5208 + i14, (byte)0);
/* 178 */         MainMemory.setI32(i1, MainMemory.getI32(i1) + -1);
/* 179 */         if (i11 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */           MainMemory.setI32(i2, MainMemory.getI32(i2) - (MainMemory.getI16(i3 + (i14 << 2) + 2) & 0xFFFF));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 195 */         i8 = MainMemory.getI32(m);
/* 196 */       } while (i8 < 2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label567:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */       i1 = paramInt2 + 4;
/* 211 */       MainMemory.setI32(i1, n);
/* 212 */       i8 = MainMemory.getI32(m);
/* 213 */       if (i8 <= 1) {
/*     */         break label692;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */       i8 /= 2;
/* 225 */       i14 = 0 - i8;
/* 226 */       i14 = i8 + (i14 > -1 ? i14 : -1) + 1;
/* 227 */       i18 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 234 */         F428500.call(paramInt1, j, i8 - i18);
/* 235 */         i18 += 1;
/* 236 */         if (i18 == i14) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */       i8 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */ 
/*     */       label692:
/*     */       
/*     */ 
/*     */ 
/* 255 */       i2 = paramInt1 + 2912;
/* 256 */       i7 = i8;
/* 257 */       i8 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 265 */         i14 = i4 + i8;
/* 266 */         i23 = paramInt1 + 5208 + i14;
/* 267 */         i16 = j + (i14 << 2);
/* 268 */         i25 = (short)i14;
/* 269 */         i18 = MainMemory.getI32(i2);
/* 270 */         MainMemory.setI32(i2, MainMemory.getI32(paramInt1 + 2908 + (i7 << 2)));
/* 271 */         MainMemory.setI32(m, i7 + -1);
/* 272 */         F428500.call(paramInt1, j, 1);
/* 273 */         i7 = MainMemory.getI32(i2);
/* 274 */         i9 = MainMemory.getI32(i10) + -1;
/* 275 */         MainMemory.setI32(i10, i9);
/* 276 */         MainMemory.setI32(paramInt1 + 2908 + (i9 << 2), i18);
/* 277 */         i9 = MainMemory.getI32(i10) + -1;
/* 278 */         MainMemory.setI32(i10, i9);
/* 279 */         MainMemory.setI32(paramInt1 + 2908 + (i9 << 2), i7);
/* 280 */         MainMemory.setI16(i16, (short)(MainMemory.getI16(j + (i7 << 2)) + MainMemory.getI16(j + (i18 << 2))));
/* 281 */         MainMemory.setI8(i23, (byte)(MainMemory.getI8(paramInt1 + 5208 + (com.emt.proteus.lib.api.MathUtils.ult(MainMemory.getI8(paramInt1 + 5208 + i18), MainMemory.getI8(paramInt1 + 5208 + i7)) ? i7 : i18)) + 1));
/* 282 */         MainMemory.setI16(j + (i7 << 2) + 2, i25);
/* 283 */         MainMemory.setI16(j + (i18 << 2) + 2, i25);
/* 284 */         MainMemory.setI32(i2, i14);
/* 285 */         F428500.call(paramInt1, j, 1);
/* 286 */         i14 = MainMemory.getI32(m);
/* 287 */         i8 += 1;
/* 288 */         if (i14 <= 1) break;
/* 289 */         i7 = i14;
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
/* 300 */       i4 = MainMemory.getI32(i10) + -1;
/* 301 */       MainMemory.setI32(i10, i4);
/* 302 */       MainMemory.setI32(paramInt1 + 2908 + (i4 << 2), MainMemory.getI32(i2));
/* 303 */       i3 = MainMemory.getI32(paramInt2);
/* 304 */       i4 = MainMemory.getI32(i1);
/* 305 */       i5 = MainMemory.getI32(k);
/* 306 */       i6 = MainMemory.getI32(i5);
/* 307 */       m = MainMemory.getI32(i5 + 4);
/* 308 */       i7 = MainMemory.getI32(i5 + 8);
/* 309 */       i8 = MainMemory.getI32(i5 + 16);
/* 310 */       com.emt.proteus.runtime.api.SystemLibrary.memset_long_addr(paramInt1 + 2876, (byte)0, 32L, 2);
/* 311 */       MainMemory.setI16(i3 + (MainMemory.getI32(paramInt1 + 2908 + (MainMemory.getI32(i10) << 2)) << 2) + 2, (short)0);
/* 312 */       i14 = MainMemory.getI32(i10);
/* 313 */       i9 = i14 + 1;
/* 314 */       if (i9 >= 573)
/*     */       {
/*     */ 
/*     */ 
/* 318 */         i4 = 0;
/* 319 */         i25 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 326 */         i10 = paramInt1 + 5800;
/* 327 */         i11 = i6 == 0 ? 1 : 0;
/* 328 */         i1 = paramInt1 + 5804;
/* 329 */         i12 = 572 - i14;
/* 330 */         i13 = 0;
/* 331 */         i14 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 339 */           i15 = MainMemory.getI32(paramInt1 + 2908 + (i9 + i13 << 2));
/* 340 */           i16 = i3 + (i15 << 2) + 2;
/* 341 */           i20 = (MainMemory.getI16(i3 + ((MainMemory.getI16(i16) & 0xFFFF) << 2) + 2) & 0xFFFF) + 1;
/* 342 */           i17 = i20 > i8 ? 1 : 0;
/* 343 */           i18 = i17 != 0 ? 1 : 0;
/* 344 */           i19 = i18 + i14;
/* 345 */           i20 = i17 != 0 ? i8 : i20;
/* 346 */           MainMemory.setI16(i16, (short)i20);
/* 347 */           if (i15 <= i4)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */             i16 = paramInt1 + 2876 + (i20 << 1);
/* 358 */             MainMemory.setI16(i16, (short)(MainMemory.getI16(i16) + 1));
/* 359 */             if (i15 < i7) {
/* 360 */               i21 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 370 */               i21 = MainMemory.getI32(m + (i15 - i7 << 2));
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 378 */             i22 = MainMemory.getI16(i3 + (i15 << 2)) & 0xFFFF;
/* 379 */             MainMemory.setI32(i10, i22 * (i21 + i20) + MainMemory.getI32(i10));
/* 380 */             if (i11 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */               MainMemory.setI32(i1, ((MainMemory.getI16(i6 + (i15 << 2) + 2) & 0xFFFF) + i21) * i22 + MainMemory.getI32(i1));
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 396 */           i13 += 1;
/* 397 */           if (i13 == i12) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 402 */           i14 = i19;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */         if (i19 == 0) {
/* 410 */           i4 = 0;
/* 411 */           i25 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 421 */           i16 = paramInt1 + 2876 + (i8 << 1);
/* 422 */           i7 = i8 + -1;
/* 423 */           i23 = paramInt1 + 2872;
/* 424 */           i9 = (i8 << 1) + 2;
/* 425 */           i14 = i14 + -2 + i18;
/* 426 */           i12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 433 */             i18 = i14 + i12 * -2;
/* 434 */             i19 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 441 */               i13 = i19 + 1;
/* 442 */               if (MainMemory.getI16(i23 + (i9 + i19 * -2)) != 0) break;
/* 443 */               i19 = i13;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 453 */             i13 = i8 - i19;
/* 454 */             i24 = paramInt1 + 2876 + (i7 - i19 << 1);
/* 455 */             MainMemory.setI16(i24, (short)(MainMemory.getI16(i24) + -1));
/* 456 */             i24 = paramInt1 + 2876 + (i13 << 1);
/* 457 */             MainMemory.setI16(i24, (short)(MainMemory.getI16(i24) + 2));
/* 458 */             MainMemory.setI16(i16, (short)(MainMemory.getI16(i16) + -1));
/* 459 */             i12 += 1;
/* 460 */           } while (i18 > 0);
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
/* 471 */           if (i8 == 0) {
/* 472 */             i4 = 0;
/* 473 */             i25 = 0;
/*     */             break label2070;
/*     */           } else {
/* 476 */             i14 = 0;
/* 477 */             i12 = 573;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 487 */           i18 = i8 - i14;
/* 488 */           i25 = (short)i18;
/* 489 */           i7 = MainMemory.getI16(paramInt1 + 2876 + (i18 << 1)) & 0xFFFF;
/* 490 */           i9 = 0;
/* 491 */           i19 = i12;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 499 */             i11 = i7 == i9 ? 1 : 0;
/* 500 */             i13 = i19 + -1;
/* 501 */             i15 = (i19 << 1) + 14;
/* 502 */             i20 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 509 */               if (i11 == 0) {
/*     */                 break label1919;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 519 */               i18 = i19 - i20;
/* 520 */               i14 += 1;
/* 521 */               if (i14 == i8) {
/* 522 */                 i4 = 0;
/* 523 */                 i25 = 0;
/*     */                 break label2070;
/*     */               }
/*     */               else {
/* 527 */                 i12 = i18;
/* 528 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */               label1919:
/*     */               
/* 534 */               i12 = MainMemory.getI32(paramInt1 + 2876 + (i15 + i20 * -2 << 1));
/* 535 */               i21 = i20 + 1;
/* 536 */               if (i12 <= i4) break label1967;
/* 537 */               i20 = i21;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1967:
/*     */             
/*     */ 
/*     */ 
/* 547 */             i19 = i13 - i20;
/* 548 */             i16 = i3 + (i12 << 2) + 2;
/* 549 */             i13 = MainMemory.getI16(i16) & 0xFFFF;
/* 550 */             if (i13 != i18)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 560 */               MainMemory.setI32(i10, (MainMemory.getI16(i3 + (i12 << 2)) & 0xFFFF) * (i18 - i13) + MainMemory.getI32(i10));
/* 561 */               MainMemory.setI16(i16, i25);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 567 */             i9 += 1;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/*     */         label2070:
/*     */         
/* 576 */         i8 = i4 + 1;
/* 577 */         i25 = com.emt.proteus.lib.api.MathUtils.shl((short)(MainMemory.getI16(paramInt1 + 2876 + (i4 << 1)) + i25), 1);
/* 578 */         MainMemory.setI16(i + (i8 << 1), i25);
/* 579 */         if (i8 == 15) {
/*     */           break;
/*     */         }
/*     */         
/* 583 */         i4 = i8;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 591 */       if (n < 0) {
/*     */         break label2351;
/*     */       } else {
/* 594 */         i8 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 603 */         i4 = i8 + 1;
/* 604 */         i16 = j + (i8 << 2);
/* 605 */         i25 = MainMemory.getI16(j + (i8 << 2) + 2);
/* 606 */         i8 = i25 & 0xFFFF;
/* 607 */         if (i25 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 617 */           i24 = i + (i8 << 1);
/* 618 */           int i26 = MainMemory.getI16(i24);
/* 619 */           i18 = i26 & 0xFFFF;
/* 620 */           MainMemory.setI16(i24, (short)(i26 + 1));
/* 621 */           i8 = 0 - i8 > -1 ? 1 : i8;
/* 622 */           i14 = 0;
/* 623 */           i9 = 0;
/* 624 */           i7 = i18;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 633 */             i18 = i7 & 0x1 | i9;
/* 634 */             i7 >>>= 1;
/* 635 */             i9 = i18 << 1;
/* 636 */             i14 += 1;
/* 637 */             if (i14 == i8) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 650 */           MainMemory.setI16(i16, (short)i18);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 656 */         if (i4 > n) {
/*     */           break;
/*     */         }
/*     */         
/* 660 */         i8 = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2351:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 677 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F429573.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */