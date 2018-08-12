/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F291785 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3175;
/*  13 */   public static final Function _instance = new F291785();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F291785() { super("F291785", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*  44 */     double d = 0.0D;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     int i9 = 0;
/*  51 */     int i10 = 0;
/*  52 */     int i11 = 0;
/*  53 */     int i12 = 0;
/*  54 */     int i13 = 0;
/*  55 */     int i14 = 0;
/*  56 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.getI32Aligned(470792);
/*  63 */       j = MainMemory.getI32(paramInt + 12);
/*  64 */       k = i + j * 344;
/*  65 */       if (MainMemory.getI32(k) != 64536) {
/*     */         break label1116;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       switch (MainMemory.getI32(paramInt)) {
/*     */       case 258: 
/*     */         break label955;
/*     */         break;
/*     */       case 259: 
/*     */         break label819;
/*     */         break;
/*     */       case 260: 
/*     */         break label678;
/*     */         break;
/*     */       case 284: 
/*     */         break label372;
/*     */         break;
/*     */       case 285:  break label819;
/*     */         break; case 286:  break label678;
/*     */         break; case 287:  break; }
/*  91 */       switch (MainMemory.getI32(i + j * 344 + 52))
/*     */       {
/*     */       case 260: 
/*     */         break label331;
/*     */         
/*     */         break;
/*     */       case 259: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 102 */       MainMemory.setI32(paramInt + 88, 0 - MainMemory.getI32(i + j * 344 + 56 + 32));
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label331:
/* 107 */       d = -0.0D - MainMemory.getF64(i + j * 344 + 56 + 32);
/* 108 */       MainMemory.setF64(paramInt + 88, d);
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label372:
/* 113 */       switch (MainMemory.getI32(i + j * 344 + 52))
/*     */       {
/*     */       case 258: 
/*     */         break label636;
/*     */         
/*     */         break;
/*     */       case 262: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 124 */       i10 = i + j * 344 + 56 + 32;
/* 125 */       i11 = paramInt + 88;
/* 126 */       m = com.emt.proteus.runtime.api.SystemLibrary.strlen(i10);
/* 127 */       if (m == 0) {
/* 128 */         i10 = i11;
/*     */         break label620;
/*     */       } else {
/* 131 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 140 */         i14 = i11 + n;
/* 141 */         b = MainMemory.getI8(i10 + n);
/* 142 */         switch (b)
/*     */         {
/*     */         case 49: 
/*     */           break label566;
/*     */           
/*     */ 
/*     */           break;
/*     */         case 48: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 154 */         b = 49;
/*     */         
/*     */         break label575;
/*     */         
/*     */         label566:
/* 159 */         b = 48;
/*     */         
/*     */ 
/*     */ 
/*     */         label575:
/*     */         
/*     */ 
/* 166 */         MainMemory.setI8(i14, b);
/* 167 */         n += 1;
/* 168 */         if (n == m) {
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
/* 179 */       i10 = i11 + m;
/*     */       
/*     */ 
/*     */ 
/*     */       label620:
/*     */       
/*     */ 
/*     */ 
/* 187 */       MainMemory.setI8(i10, (byte)0);
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label636:
/* 192 */       MainMemory.setI8(paramInt + 88, (byte)(MainMemory.getI8(i + j * 344 + 56 + 32) == 0 ? 1 : 0));
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label678:
/* 197 */       switch (MainMemory.getI32(i + j * 344 + 52))
/*     */       {
/*     */       case 259: 
/*     */         break label781;
/*     */         
/*     */         break;
/*     */       case 258: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 208 */       MainMemory.setF64(paramInt + 88, MainMemory.getI8(i + j * 344 + 56 + 32) == 0 ? 0.0D : 1.0D);
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label781:
/* 213 */       d = MainMemory.getI32(i + j * 344 + 56 + 32);
/* 214 */       MainMemory.setF64(paramInt + 88, d);
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label819:
/* 219 */       switch (MainMemory.getI32(i + j * 344 + 52))
/*     */       {
/*     */       case 260: 
/*     */         break label921;
/*     */         
/*     */         break;
/*     */       case 258: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 230 */       MainMemory.setI32(paramInt + 88, MainMemory.getI8(i + j * 344 + 56 + 32) != 0 ? 1 : 0);
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label921:
/* 235 */       MainMemory.setI32(paramInt + 88, (int)MainMemory.getF64(i + j * 344 + 56 + 32));
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label955:
/* 240 */       switch (MainMemory.getI32(i + j * 344 + 52))
/*     */       {
/*     */       case 260: 
/*     */         break label1058;
/*     */         
/*     */         break;
/*     */       case 259: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 251 */       MainMemory.setI8(paramInt + 88, (byte)(MainMemory.getI32(i + j * 344 + 56 + 32) != 0 ? 1 : 0));
/*     */       
/*     */       break label1099;
/*     */       
/*     */       label1058:
/* 256 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_une(MainMemory.getF64(i + j * 344 + 56 + 32), 0.0D) ? 1 : 0));
/*     */       
/*     */ 
/*     */       label1099:
/*     */       
/*     */ 
/* 262 */       MainMemory.setI32(paramInt, 64536);
/*     */       
/*     */       break label3195;
/*     */       
/*     */       label1116:
/* 267 */       F301051.call(paramInt);
/* 268 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label3195;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */       m = MainMemory.getI32(paramInt + 52);
/* 279 */       if (m != 262)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */         n = MainMemory.getI32Aligned(470812);
/* 290 */         if (m == 261) {
/* 291 */           m = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 301 */           m = MainMemory.getI32(paramInt + 56) * n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */         if (m != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */           i1 = paramInt + 84;
/* 320 */           i6 = i + j * 344 + 56 + 28;
/* 321 */           n = m + -1;
/* 322 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 329 */             i12 = n - i9;
/* 330 */             MainMemory.setI8(MainMemory.getI32(i1) + i12, MainMemory.getI8(MainMemory.getI32(i6) + i12));
/* 331 */             i9 += 1;
/* 332 */             if (i9 == m) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */       m = MainMemory.getI32Aligned(470812);
/* 344 */       n = MainMemory.getI32(paramInt + 56);
/* 345 */       i9 = n * m;
/* 346 */       switch (MainMemory.getI32(paramInt)) {
/*     */       case 258: 
/*     */         break label2881;
/*     */         break;
/*     */       case 259: 
/*     */         break label2573;
/*     */         break;
/*     */       case 260: 
/*     */         break label2259;
/*     */         break;
/*     */       case 284: 
/*     */         break label1784;
/*     */         break;
/*     */       case 285:  break label2573;
/*     */         break; case 286:  break label2259;
/*     */         break; case 287:  break; }
/* 362 */       switch (MainMemory.getI32(i + j * 344 + 52))
/*     */       {
/*     */       case 260: 
/*     */         break label1655;
/*     */         
/*     */         break;
/*     */       case 259: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 373 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 383 */         i3 = paramInt + 88;
/* 384 */         i5 = i + j * 344 + 56 + 32;
/* 385 */         m *= n;
/* 386 */         n = m + -1;
/* 387 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 394 */           i12 = n - i9;
/* 395 */           MainMemory.setI32(MainMemory.getI32(i3) + (i12 << 2), 0 - MainMemory.getI32(MainMemory.getI32(i5) + (i12 << 2)));
/* 396 */           i9 += 1;
/* 397 */           if (i9 == m) { break label3195;
/* 398 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1655:
/*     */         
/*     */ 
/* 407 */         if (i9 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */           i2 = paramInt + 88;
/* 418 */           i4 = i + j * 344 + 56 + 32;
/* 419 */           m *= n;
/* 420 */           n = m + -1;
/* 421 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 428 */             i12 = n - i9;
/* 429 */             d = -0.0D - MainMemory.getF64(MainMemory.getI32(i4) + (i12 << 3));
/* 430 */             MainMemory.setF64(MainMemory.getI32(i2) + (i12 << 3), d);
/* 431 */             i9 += 1;
/* 432 */             if (i9 == m) { break label3195;
/* 433 */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1784:
/*     */           
/*     */ 
/* 442 */           switch (MainMemory.getI32(i + j * 344 + 52))
/*     */           {
/*     */           case 258: 
/*     */             break label2133;
/*     */             
/*     */             break;
/*     */           case 262: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 453 */           if (m != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */             i7 = i + j * 344 + 56 + 32;
/* 464 */             i8 = paramInt + 88;
/* 465 */             n = m + -1;
/* 466 */             i9 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 473 */               i12 = n - i9;
/* 474 */               i10 = MainMemory.getI32(MainMemory.getI32(i7) + (i12 << 2));
/* 475 */               i11 = MainMemory.getI32(MainMemory.getI32(i8) + (i12 << 2));
/* 476 */               i12 = com.emt.proteus.runtime.api.SystemLibrary.strlen(i10);
/* 477 */               if (i12 == 0) {
/* 478 */                 i10 = i11;
/*     */                 break label2096;
/*     */               } else {
/* 481 */                 i13 = 0;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 490 */                 i14 = i11 + i13;
/* 491 */                 b = MainMemory.getI8(i10 + i13);
/* 492 */                 switch (b)
/*     */                 {
/*     */                 case 49: 
/*     */                   break label2042;
/*     */                   
/*     */ 
/*     */                   break;
/*     */                 case 48: 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/* 504 */                 b = 49;
/*     */                 
/*     */                 break label2051;
/*     */                 
/*     */                 label2042:
/* 509 */                 b = 48;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2051:
/*     */                 
/*     */ 
/* 516 */                 MainMemory.setI8(i14, b);
/* 517 */                 i13 += 1;
/* 518 */                 if (i13 == i12) {
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
/* 529 */               i10 = i11 + i12;
/*     */               
/*     */ 
/*     */ 
/*     */               label2096:
/*     */               
/*     */ 
/*     */ 
/* 537 */               MainMemory.setI8(i10, (byte)0);
/* 538 */               i9 += 1;
/* 539 */               if (i9 == m) { break label3195;
/* 540 */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label2133:
/*     */             
/*     */ 
/* 549 */             if (i9 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 559 */               i1 = paramInt + 88;
/* 560 */               i6 = i + j * 344 + 56 + 32;
/* 561 */               m *= n;
/* 562 */               n = m + -1;
/* 563 */               i9 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 570 */                 i12 = n - i9;
/* 571 */                 MainMemory.setI8(MainMemory.getI32(i1) + i12, (byte)(MainMemory.getI8(MainMemory.getI32(i6) + i12) == 0 ? 1 : 0));
/* 572 */                 i9 += 1;
/* 573 */                 if (i9 == m) { break label3195;
/* 574 */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label2259:
/*     */               
/*     */ 
/* 583 */               switch (MainMemory.getI32(i + j * 344 + 52))
/*     */               {
/*     */               case 259: 
/*     */                 break label2447;
/*     */                 
/*     */                 break;
/*     */               case 258: 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 594 */               if (i9 != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 604 */                 i2 = paramInt + 88;
/* 605 */                 i1 = i + j * 344 + 56 + 32;
/* 606 */                 m *= n;
/* 607 */                 n = m + -1;
/* 608 */                 i9 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 615 */                   i12 = n - i9;
/* 616 */                   MainMemory.setF64(MainMemory.getI32(i2) + (i12 << 3), MainMemory.getI8(MainMemory.getI32(i1) + i12) == 0 ? 0.0D : 1.0D);
/* 617 */                   i9 += 1;
/* 618 */                   if (i9 == m) { break label3195;
/* 619 */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label2447:
/*     */                 
/*     */ 
/* 628 */                 if (i9 != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 638 */                   i2 = paramInt + 88;
/* 639 */                   i3 = i + j * 344 + 56 + 32;
/* 640 */                   m *= n;
/* 641 */                   n = m + -1;
/* 642 */                   i9 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 649 */                     i12 = n - i9;
/* 650 */                     d = MainMemory.getI32(MainMemory.getI32(i3) + (i12 << 2));
/* 651 */                     MainMemory.setF64(MainMemory.getI32(i2) + (i12 << 3), d);
/* 652 */                     i9 += 1;
/* 653 */                     if (i9 == m) { break label3195;
/* 654 */                       break;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */                   label2573:
/*     */                   
/*     */ 
/* 663 */                   switch (MainMemory.getI32(i + j * 344 + 52))
/*     */                   {
/*     */                   case 260: 
/*     */                     break label2759;
/*     */                     
/*     */                     break;
/*     */                   case 258: 
/*     */                     break;
/*     */                   }
/*     */                   
/*     */                   
/* 674 */                   if (i9 != 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 684 */                     i3 = paramInt + 88;
/* 685 */                     i1 = i + j * 344 + 56 + 32;
/* 686 */                     m *= n;
/* 687 */                     n = m + -1;
/* 688 */                     i9 = 0;
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */                     for (;;)
/*     */                     {
/* 695 */                       i12 = n - i9;
/* 696 */                       MainMemory.setI32(MainMemory.getI32(i3) + (i12 << 2), MainMemory.getI8(MainMemory.getI32(i1) + i12) != 0 ? 1 : 0);
/* 697 */                       i9 += 1;
/* 698 */                       if (i9 == m) { break label3195;
/* 699 */                         break;
/*     */                       }
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */                     label2759:
/*     */                     
/*     */ 
/* 708 */                     if (i9 != 0)
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 718 */                       i3 = paramInt + 88;
/* 719 */                       i2 = i + j * 344 + 56 + 32;
/* 720 */                       m *= n;
/* 721 */                       n = m + -1;
/* 722 */                       i9 = 0;
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */                       for (;;)
/*     */                       {
/* 729 */                         i12 = n - i9;
/* 730 */                         MainMemory.setI32(MainMemory.getI32(i3) + (i12 << 2), (int)MainMemory.getF64(MainMemory.getI32(i2) + (i12 << 3)));
/* 731 */                         i9 += 1;
/* 732 */                         if (i9 == m) { break label3195;
/* 733 */                           break;
/*     */                         }
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */                       label2881:
/*     */                       
/*     */ 
/* 742 */                       switch (MainMemory.getI32(i + j * 344 + 52))
/*     */                       {
/*     */                       case 260: 
/*     */                         break label3068;
/*     */                         
/*     */                         break;
/*     */                       case 259: 
/*     */                         break;
/*     */                       }
/*     */                       
/*     */                       
/* 753 */                       if (i9 != 0)
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 763 */                         i1 = paramInt + 88;
/* 764 */                         i3 = i + j * 344 + 56 + 32;
/* 765 */                         m *= n;
/* 766 */                         n = m + -1;
/* 767 */                         i9 = 0;
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */                         for (;;)
/*     */                         {
/* 774 */                           i12 = n - i9;
/* 775 */                           MainMemory.setI8(MainMemory.getI32(i1) + i12, (byte)(MainMemory.getI32(MainMemory.getI32(i3) + (i12 << 2)) != 0 ? 1 : 0));
/* 776 */                           i9 += 1;
/* 777 */                           if (i9 == m) { break label3195;
/* 778 */                             break;
/*     */                           }
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */                         label3068:
/*     */                         
/*     */ 
/* 787 */                         if (i9 != 0)
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 797 */                           i1 = paramInt + 88;
/* 798 */                           i2 = i + j * 344 + 56 + 32;
/* 799 */                           m *= n;
/* 800 */                           n = m + -1;
/* 801 */                           i9 = 0;
/*     */                           
/*     */ 
/*     */ 
/*     */ 
/*     */                           for (;;)
/*     */                           {
/* 808 */                             i12 = n - i9;
/* 809 */                             MainMemory.setI8(MainMemory.getI32(i1) + i12, (byte)(MathUtils.f_une(MainMemory.getF64(MainMemory.getI32(i2) + (i12 << 3)), 0.0D) ? 1 : 0));
/* 810 */                             i9 += 1;
/* 811 */                             if (i9 == m) break;
/*     */                           }
/*     */                         }
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           } } }
/*     */       label3195:
/* 822 */       if (MainMemory.getI32(k) <= 0) {
/*     */         break label3244;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 832 */       com.emt.proteus.runtime.library.c.free.call(MainMemory.getI32(i + j * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label3244:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 844 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F291785.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */