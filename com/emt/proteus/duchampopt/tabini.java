/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ 
/*     */ public final class tabini extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2914;
/*  13 */   public static final Function _instance = new tabini();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public tabini() { super("tabini", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = call(i, j, k);
/*  35 */     paramFrame.setI32(paramInt1, m);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*  55 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if (paramInt3 == 0) {
/*  62 */         paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  72 */       else if (paramInt1 < 1) {
/*  73 */         paramInt1 = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  83 */         j = paramInt2 == 0 ? 1 : 0;
/*  84 */         if (j != 0) {
/*  85 */           k = 0;
/*     */           break label186;
/*     */         } else {
/*  88 */           k = 0;
/*  89 */           i8 = paramInt1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  99 */           if (k >= paramInt1)
/*     */           {
/*     */ 
/*     */ 
/* 103 */             k = i8;
/* 104 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 110 */           i2 = MainMemory.getI32(paramInt2 + (k << 2));
/* 111 */           if (i2 < 0) {
/* 112 */             paramInt1 = 3;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label1708;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 122 */           i8 = i2 * i8;
/* 123 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label186:
/*     */         
/*     */ 
/* 131 */         if (MainMemory.getI32(paramInt3) != -1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */           if (MainMemory.getI32(paramInt3 + 52) != 137) {
/*     */             break label405;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */           m = paramInt3 + 56;
/* 152 */           i8 = MainMemory.getI32(m);
/* 153 */           if (i8 <= 0) {
/*     */             break label361;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */           n = paramInt3 + 84;
/* 165 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 172 */             i8 = i2 + 1;
/* 173 */             i6 = MainMemory.getI32(n) + (i2 << 2);
/* 174 */             if (MainMemory.getI32(i6) != 1) {
/*     */               break label326;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */             MainMemory.setI32(i6, 0);
/*     */             
/*     */ 
/*     */             label326:
/*     */             
/*     */ 
/* 190 */             i2 = MainMemory.getI32(m);
/* 191 */             if (i2 <= i8) break;
/* 192 */             i2 = i8;
/*     */           }
/*     */           break label361;
/* 195 */           i8 = i2;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label361:
/*     */           
/*     */ 
/*     */ 
/* 204 */           i6 = paramInt3 + 88;
/* 205 */           if (MainMemory.getI32(i6) != 1) {
/*     */             break label485;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */           MainMemory.setI32(i6, 0);
/*     */           
/*     */           break label485;
/*     */         }
/*     */         
/*     */         label405:
/* 222 */         MainMemory.setI32(paramInt3 + 52, 0);
/* 223 */         MainMemory.setI32(paramInt3 + 56, 0);
/* 224 */         MainMemory.setI32(paramInt3 + 60, 0);
/* 225 */         MainMemory.setI32(paramInt3 + 68, 0);
/* 226 */         MainMemory.setI32(paramInt3 + 72, 0);
/* 227 */         MainMemory.setI32(paramInt3 + 76, 0);
/* 228 */         MainMemory.setI32(paramInt3 + 80, 0);
/* 229 */         MainMemory.setI32(paramInt3 + 84, 0);
/* 230 */         MainMemory.setI32(paramInt3 + 88, 0);
/* 231 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label485:
/*     */         
/*     */ 
/* 238 */         if (MainMemory.getI32(paramInt3) != -1) {
/*     */           break label551;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */         MainMemory.setI32(paramInt3 + 36, 0);
/* 249 */         MainMemory.setI32(paramInt3 + 40, 0);
/* 250 */         MainMemory.setI32(paramInt3 + 44, 0);
/* 251 */         MainMemory.setI32(paramInt3 + 48, 0);
/* 252 */         MainMemory.setI32(paramInt3 + 64, 0);
/*     */         
/*     */ 
/*     */         label551:
/*     */         
/*     */ 
/* 258 */         m = paramInt3 + 52;
/* 259 */         if (MainMemory.getI32(m) != 137) {
/*     */           break label631;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */         if (i8 >= paramInt1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */           if (MainMemory.getI32(paramInt3 + 60) >= k) {
/*     */             break label631;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */         tabfree.call(paramInt3);
/*     */         
/*     */ 
/*     */         label631:
/*     */         
/*     */ 
/* 295 */         i5 = paramInt3 + 68;
/* 296 */         i9 = MainMemory.getI32(i5);
/* 297 */         if (i9 != 0) {
/*     */           break label732;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 307 */         i3 = calloc.call(paramInt1, 4);
/* 308 */         i9 = i3;
/* 309 */         MainMemory.setI32(paramInt3 + 8, i9);
/* 310 */         if (i3 == 0) {
/* 311 */           paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 321 */           MainMemory.setI32(m, 137);
/* 322 */           MainMemory.setI32(paramInt3 + 56, paramInt1);
/* 323 */           MainMemory.setI32(i5, i9);
/*     */           
/*     */           break label746;
/*     */           
/*     */           label732:
/* 328 */           MainMemory.setI32(paramInt3 + 8, i9);
/*     */           
/*     */ 
/*     */           label746:
/*     */           
/*     */ 
/* 334 */           i5 = paramInt3 + 72;
/* 335 */           i9 = MainMemory.getI32(i5);
/* 336 */           if (i9 != 0) {
/*     */             break label847;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 346 */           i3 = calloc.call(paramInt1, 4);
/* 347 */           i9 = i3;
/* 348 */           MainMemory.setI32(paramInt3 + 12, i9);
/* 349 */           if (i3 == 0) {
/* 350 */             paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 360 */             MainMemory.setI32(m, 137);
/* 361 */             MainMemory.setI32(paramInt3 + 56, paramInt1);
/* 362 */             MainMemory.setI32(i5, i9);
/*     */             
/*     */             break label861;
/*     */             
/*     */             label847:
/* 367 */             MainMemory.setI32(paramInt3 + 12, i9);
/*     */             
/*     */ 
/*     */             label861:
/*     */             
/*     */ 
/* 373 */             i6 = paramInt3 + 76;
/* 374 */             i4 = MainMemory.getI32(i6);
/* 375 */             if (i4 != 0) {
/*     */               break label963;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */             i3 = calloc.call(paramInt1, 8);
/* 386 */             i4 = i3;
/* 387 */             MainMemory.setI32(paramInt3 + 16, i4);
/* 388 */             if (i3 == 0) {
/* 389 */               paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 399 */               MainMemory.setI32(m, 137);
/* 400 */               MainMemory.setI32(paramInt3 + 56, paramInt1);
/* 401 */               MainMemory.setI32(i6, i4);
/*     */               
/*     */               break label977;
/*     */               
/*     */               label963:
/* 406 */               MainMemory.setI32(paramInt3 + 16, i4);
/*     */               
/*     */ 
/*     */               label977:
/*     */               
/*     */ 
/* 412 */               i1 = paramInt3 + 80;
/* 413 */               i6 = MainMemory.getI32(i1);
/* 414 */               if (i6 != 0) {
/*     */                 break label1276;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */               i3 = calloc.call(paramInt1, 4);
/* 425 */               i6 = i3;
/* 426 */               n = paramInt3 + 20;
/* 427 */               MainMemory.setI32(n, i6);
/* 428 */               if (i3 == 0) {
/* 429 */                 paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 439 */                 MainMemory.setI32(m, 137);
/* 440 */                 MainMemory.setI32(paramInt3 + 56, paramInt1);
/* 441 */                 MainMemory.setI32(paramInt3 + 60, k);
/* 442 */                 MainMemory.setI32(i1, i6);
/* 443 */                 i3 = calloc.call(paramInt1, 4);
/* 444 */                 i1 = paramInt3 + 84;
/* 445 */                 MainMemory.setI32(i1, i3);
/* 446 */                 if (i3 == 0) {
/* 447 */                   paramInt1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 457 */                   if (j != 0) {
/*     */                     break label1290;
/*     */                   } else {
/* 460 */                     i8 = 0;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 469 */                     if (i8 >= paramInt1) {
/*     */                       break;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 479 */                     i2 = MainMemory.getI32(paramInt2 + (i8 << 2));
/* 480 */                     if (i2 != 0)
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 490 */                       i6 = MainMemory.getI32(n);
/* 491 */                       i3 = calloc.call(i2, 8);
/* 492 */                       MainMemory.setI32(i6 + (i8 << 2), i3);
/* 493 */                       if (i3 == 0) {
/* 494 */                         paramInt1 = 2;
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */                         break label1708;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/* 504 */                       MainMemory.setI32(MainMemory.getI32(i1) + (i8 << 2), MainMemory.getI32(MainMemory.getI32(n) + (i8 << 2)));
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/* 510 */                     i8 += 1;
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1276:
/*     */                   
/* 516 */                   MainMemory.setI32(paramInt3 + 20, i6);
/*     */                   
/*     */ 
/*     */                   label1290:
/*     */                   
/*     */ 
/* 522 */                   i6 = paramInt3 + 88;
/* 523 */                   i4 = MainMemory.getI32(i6);
/* 524 */                   if (i4 != 0) {
/*     */                     break label1417;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 534 */                   if (k != 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 544 */                     i3 = calloc.call(k, 8);
/* 545 */                     i4 = i3;
/* 546 */                     MainMemory.setI32(paramInt3 + 24, i4);
/* 547 */                     if (i3 == 0) {
/* 548 */                       paramInt1 = 2;
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */                       break label1708;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/* 558 */                     MainMemory.setI32(m, 137);
/* 559 */                     MainMemory.setI32(paramInt3 + 56, paramInt1);
/* 560 */                     MainMemory.setI32(paramInt3 + 60, k);
/* 561 */                     MainMemory.setI32(i6, i4);
/*     */                     
/*     */                     break label1431;
/*     */                     
/*     */                     label1417:
/* 566 */                     MainMemory.setI32(paramInt3 + 24, i4);
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1431:
/*     */                   
/* 572 */                   MainMemory.setI32(paramInt3, 0);
/* 573 */                   MainMemory.setI32(paramInt3 + 4, paramInt1);
/* 574 */                   if (paramInt1 <= 0) {
/*     */                     break label1615;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 584 */                   i5 = paramInt3 + 12;
/* 585 */                   i6 = paramInt3 + 16;
/* 586 */                   i7 = paramInt3 + 8;
/* 587 */                   n = paramInt3 + 20;
/* 588 */                   i8 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 595 */                     m = paramInt2 + (i8 << 2);
/* 596 */                     MainMemory.setI32(MainMemory.getI32(i5) + (i8 << 2), -1);
/* 597 */                     MainMemory.setF64(MainMemory.getI32(i6) + (i8 << 3), 0.0D);
/* 598 */                     i9 = MainMemory.getI32(i7);
/* 599 */                     if (j == 0) {
/*     */                       break label1574;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 609 */                     MainMemory.setI32(i9 + (i8 << 2), 0);
/*     */                     
/*     */                     break label1590;
/*     */                     
/*     */                     label1574:
/* 614 */                     tabini_1683.call(m, n, i8, i9);
/*     */                     
/*     */ 
/*     */                     label1590:
/*     */                     
/*     */ 
/* 620 */                     i8 += 1;
/* 621 */                     if (i8 == paramInt1) {
/*     */                       break;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */                   label1615:
/*     */                   
/*     */ 
/*     */ 
/* 632 */                   if (k <= 0)
/*     */                   {
/*     */ 
/*     */ 
/* 636 */                     paramInt1 = 0;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 643 */                     i6 = paramInt3 + 24;
/* 644 */                     i4 = MainMemory.getI32(i6);
/* 645 */                     paramInt1 = 0;
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */                     for (;;)
/*     */                     {
/* 652 */                       MainMemory.setF64(i4 + (paramInt1 << 3), 9.87654321E107D);
/* 653 */                       paramInt1 += 1;
/* 654 */                       if (!com.emt.proteus.lib.api.MathUtils.ugt(MainMemory.getI32(i6) + (k << 3), i4 + (paramInt1 << 3)))
/*     */                         break;
/*     */                     }
/*     */                     break label1708;
/* 658 */                     paramInt1 = 0;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       label1708:
/* 667 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 673 */       int i10 = i;return i10;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tabini.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */