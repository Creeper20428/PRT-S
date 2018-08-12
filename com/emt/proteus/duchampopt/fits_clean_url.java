/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class fits_clean_url extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3427;
/*  13 */   public static final Function _instance = new fits_clean_url();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public fits_clean_url() { super("fits_clean_url", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  56 */     int i10 = 0;
/*  57 */     int i11 = 0;
/*  58 */     int i12 = 0;
/*  59 */     int i13 = 0;
/*  60 */     int i14 = 0;
/*  61 */     int i15 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       if (MainMemory.getI32(paramInt3) != 0) {
/*     */         break label1681;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */       j = malloc.call(8);
/*  78 */       k = j == 0 ? 1 : 0;
/*  79 */       if (k == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         MainMemory.setI32(j, 0);
/*  90 */         MainMemory.setI32(j + 4, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  96 */       MainMemory.setI8(paramInt2, (byte)0);
/*  97 */       i7 = SystemLibrary.strstr(paramInt1, 17696);
/*  98 */       if (i7 != 0)
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
/* 109 */         i7 = SystemLibrary.strchr(i7 + 3, 47);
/* 110 */         if (i7 != 0) {
/*     */           break label212;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */         SystemLibrary.strcpy(paramInt2, paramInt1);
/* 121 */         i13 = 0;
/* 122 */         i1 = 0;
/*     */         
/*     */         break label1470;
/*     */         
/*     */         label212:
/* 127 */         i13 = i7 - paramInt1;
/* 128 */         SystemLibrary.strncpy(paramInt2, paramInt1, i13);
/* 129 */         MainMemory.setI8(paramInt2 + i13, (byte)0);
/* 130 */         paramInt1 = i7;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 137 */         if (MainMemory.getI8(paramInt1) != 47) {
/*     */           break label280;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)47);
/*     */         
/*     */ 
/*     */         label280:
/*     */         
/*     */ 
/* 153 */         i7 = SystemLibrary.strtok(paramInt1, 12992);
/* 154 */         if (i7 == 0) {
/* 155 */           i1 = 0;
/* 156 */           i4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 166 */           m = j;
/* 167 */           n = j + 4;
/* 168 */           i13 = 0;
/* 169 */           i1 = 0;
/* 170 */           i2 = 0;
/* 171 */           i3 = 0;
/* 172 */           i4 = 0;
/* 173 */           i5 = 0;
/* 174 */           i6 = 0;
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
/*     */           for (;;)
/*     */           {
/* 189 */             i8 = (MainMemory.getI8(i7) & 0xFF) + -46;
/* 190 */             i9 = i8 == 0 ? 1 : 0;
/* 191 */             if (i9 == 0)
/*     */             {
/*     */ 
/*     */ 
/* 195 */               i10 = i8;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 202 */               i10 = (MainMemory.getI8(i7 + 1) & 0xFF) + -46;
/* 203 */               if (i10 != 0) {
/*     */                 break label446;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */               i10 = MainMemory.getI8(i7 + 2) & 0xFF;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label446:
/*     */             
/*     */ 
/* 222 */             if (i10 != 0) {
/*     */               break label887;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */             if (i6 != 0) {
/*     */               break label694;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */             if ((MainMemory.getI8(paramInt1) == 47) || (k != 0))
/*     */             {
/*     */ 
/*     */ 
/* 246 */               i14 = i3;
/*     */ 
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
/*     */ 
/* 259 */               i11 = malloc.call(12);
/* 260 */               i3 = i11;
/* 261 */               MainMemory.setI32(i11, i7);
/* 262 */               if (i5 != 0) {
/*     */                 break label579;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */               MainMemory.setI32(i11 + 4, i3);
/* 273 */               MainMemory.setI32(i11 + 8, i3);
/* 274 */               i13 = i4;
/*     */               
/*     */               break label640;
/*     */               
/*     */               label579:
/* 279 */               i12 = i5 + 4;
/* 280 */               i2 = MainMemory.getI32(i12);
/* 281 */               MainMemory.setI32(i11 + 4, i2);
/* 282 */               MainMemory.setI32(i11 + 8, i5);
/* 283 */               MainMemory.setI32(i2 + 8, i3);
/* 284 */               MainMemory.setI32(i12, i3);
/* 285 */               i13 = MainMemory.getI32(m);
/*     */               
/*     */ 
/*     */ 
/*     */               label640:
/*     */               
/*     */ 
/*     */ 
/* 293 */               MainMemory.setI32(n, i3);
/* 294 */               i6 = i13 + 1;
/* 295 */               MainMemory.setI32(m, i6);
/* 296 */               i13 = i6;
/* 297 */               i1 = i6;
/* 298 */               i2 = i3;
/* 299 */               i14 = i3;
/* 300 */               i4 = i6;
/* 301 */               i5 = i3;
/*     */               
/*     */               break label1126;
/*     */               
/*     */               label694:
/*     */               
/* 307 */               if (k != 0)
/*     */               {
/*     */ 
/*     */ 
/* 311 */                 i14 = i3;
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
/*     */               }
/* 324 */               else if (i3 == 0)
/*     */               {
/*     */ 
/*     */ 
/* 328 */                 i14 = i3;
/*     */                 
/* 330 */                 i5 = i3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 341 */                 i12 = i3 + 8;
/* 342 */                 i5 = MainMemory.getI32(i12);
/* 343 */                 i15 = i3 + 4;
/* 344 */                 MainMemory.setI32(i5 + 4, MainMemory.getI32(i15));
/* 345 */                 MainMemory.setI32(MainMemory.getI32(i15) + 8, MainMemory.getI32(i12));
/* 346 */                 free.call(i3);
/* 347 */                 MainMemory.setI32(n, i5);
/* 348 */                 i6 = MainMemory.getI32(m) + -1;
/* 349 */                 MainMemory.setI32(m, i6);
/* 350 */                 if (i6 != 0)
/*     */                 {
/*     */ 
/*     */ 
/* 354 */                   i13 = i6;
/* 355 */                   i1 = i6;
/* 356 */                   i2 = i5;
/* 357 */                   i14 = i5;
/* 358 */                   i4 = i6;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/* 367 */                   MainMemory.setI32(n, 0);
/* 368 */                   i13 = i6;
/* 369 */                   i1 = i6;
/* 370 */                   i2 = 0;
/* 371 */                   i14 = 0;
/* 372 */                   i4 = i6;
/* 373 */                   i5 = 0;
/*     */                   
/*     */                   break label1126;
/*     */                   
/*     */                   label887:
/*     */                   
/* 379 */                   if (i9 == 0) {
/*     */                     break label923;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */                   i8 = MainMemory.getI8(i7 + 1) & 0xFF;
/*     */                   
/*     */ 
/*     */ 
/*     */                   label923:
/*     */                   
/*     */ 
/*     */ 
/* 398 */                   if ((i8 == 0) || (k != 0))
/*     */                   {
/*     */ 
/*     */ 
/* 402 */                     i14 = i3;
/*     */ 
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
/*     */ 
/* 415 */                     i11 = malloc.call(12);
/* 416 */                     i3 = i11;
/* 417 */                     MainMemory.setI32(i11, i7);
/* 418 */                     if (i2 != 0) {
/*     */                       break label1016;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 428 */                     MainMemory.setI32(i11 + 4, i3);
/* 429 */                     MainMemory.setI32(i11 + 8, i3);
/* 430 */                     i13 = i1;
/*     */                     
/*     */                     break label1077;
/*     */                     
/*     */                     label1016:
/* 435 */                     i12 = i2 + 4;
/* 436 */                     i5 = MainMemory.getI32(i12);
/* 437 */                     MainMemory.setI32(i11 + 4, i5);
/* 438 */                     MainMemory.setI32(i11 + 8, i2);
/* 439 */                     MainMemory.setI32(i5 + 8, i3);
/* 440 */                     MainMemory.setI32(i12, i3);
/* 441 */                     i13 = MainMemory.getI32(m);
/*     */                     
/*     */ 
/*     */ 
/*     */                     label1077:
/*     */                     
/*     */ 
/*     */ 
/* 449 */                     MainMemory.setI32(n, i3);
/* 450 */                     i6 = i13 + 1;
/* 451 */                     MainMemory.setI32(m, i6);
/* 452 */                     i13 = i6;
/* 453 */                     i1 = i6;
/* 454 */                     i2 = i3;
/* 455 */                     i14 = i3;
/* 456 */                     i4 = i6;
/* 457 */                     i5 = i3;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1126:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 471 */             i7 = SystemLibrary.strtok(0, 12992);
/* 472 */             if (i7 == 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 479 */             i3 = i14;
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
/* 490 */           if (i13 == 0) {
/* 491 */             i1 = i13;
/* 492 */             i4 = i13;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 502 */             m = j;
/* 503 */             n = j + 4;
/* 504 */             i4 = i13;
/* 505 */             i6 = i13;
/* 506 */             i1 = i13;
/* 507 */             i8 = i13;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 517 */               if (k != 0)
/*     */               {
/* 519 */                 i13 = i6;
/*     */                 
/*     */ 
/* 522 */                 paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 532 */                 i2 = MainMemory.getI32(n);
/* 533 */                 if (i2 == 0)
/*     */                 {
/* 535 */                   i13 = i6;
/*     */                   
/*     */ 
/* 538 */                   paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 548 */                   i2 = MainMemory.getI32(i2 + 4);
/* 549 */                   paramInt1 = MainMemory.getI32(i2);
/* 550 */                   i12 = i2 + 8;
/* 551 */                   i15 = i2 + 4;
/* 552 */                   MainMemory.setI32(MainMemory.getI32(i12) + 4, MainMemory.getI32(i15));
/* 553 */                   MainMemory.setI32(MainMemory.getI32(i15) + 8, MainMemory.getI32(i12));
/* 554 */                   free.call(i2);
/* 555 */                   i6 = i1 + -1;
/* 556 */                   MainMemory.setI32(m, i6);
/* 557 */                   if (i6 != 0)
/*     */                   {
/*     */ 
/*     */ 
/* 561 */                     i4 = i6;
/* 562 */                     i13 = i6;
/* 563 */                     i1 = i6;
/* 564 */                     i8 = i6;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/* 572 */                     MainMemory.setI32(n, 0);
/* 573 */                     i4 = i6;
/* 574 */                     i13 = i6;
/* 575 */                     i1 = i6;
/* 576 */                     i8 = i6;
/*     */                   }
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
/* 588 */               SystemLibrary.strcat(paramInt2, paramInt1);
/* 589 */               MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)47);
/* 590 */               if (i8 == 0) {
/* 591 */                 i1 = i4;
/* 592 */                 i4 = i13; break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/* 597 */               i6 = i13;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 608 */         MainMemory.setI8(paramInt2 + (SystemLibrary.strlen(paramInt2) + -1), (byte)0);
/* 609 */         i13 = i1;
/* 610 */         i1 = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1470:
/*     */       
/*     */ 
/* 618 */       if (k == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 628 */         m = j;
/* 629 */         if (i1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 639 */           n = j + 4;
/* 640 */           i2 = MainMemory.getI32(n);
/*     */           
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
/* 652 */             if (i2 != 0)
/*     */             {
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
/* 665 */               i12 = i2 + 8;
/* 666 */               i3 = MainMemory.getI32(i12);
/* 667 */               i15 = i2 + 4;
/* 668 */               MainMemory.setI32(i3 + 4, MainMemory.getI32(i15));
/* 669 */               MainMemory.setI32(MainMemory.getI32(i15) + 8, MainMemory.getI32(i12));
/* 670 */               free.call(i2);
/* 671 */               i1 = i13 + -1;
/* 672 */               MainMemory.setI32(m, i1);
/* 673 */               if (i1 != 0)
/*     */               {
/*     */ 
/*     */ 
/* 677 */                 i2 = i3;
/* 678 */                 i13 = i1;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 686 */                 i2 = 0;
/* 687 */                 i13 = i1;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 697 */             if (i1 == 0) {
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
/* 710 */           MainMemory.setI32(n, i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 716 */         free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */       label1681:
/*     */       
/* 722 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 728 */       int i16 = i;return i16;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_clean_url.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */