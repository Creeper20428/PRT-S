/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class fficls
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3148;
/*  31 */   public static final Function _instance = new fficls();
/*  32 */   public final Function resolve() { return _instance; }
/*     */   
/*  34 */   public fficls() { super("fficls", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  38 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  39 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  44 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     call(i, j, k, m, n);
/*  60 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  66 */     int i = 0;
/*  67 */     int j = 0;
/*  68 */     int k = 0;
/*  69 */     int m = 0;
/*  70 */     int n = 0;
/*  71 */     int i1 = 0;
/*  72 */     int i2 = 0;
/*  73 */     int i3 = 0;
/*  74 */     int i4 = 0;
/*  75 */     int i5 = 0;
/*  76 */     int i6 = 0;
/*  77 */     int i7 = 0;
/*  78 */     int i8 = 0;
/*  79 */     int i9 = 0;
/*  80 */     int i10 = 0;
/*  81 */     int i11 = 0;
/*  82 */     int i12 = 0;
/*  83 */     int i13 = 0;
/*  84 */     long l1 = 0L;
/*  85 */     int i14 = 0;
/*  86 */     long l2 = 0L;
/*  87 */     long l3 = 0L;
/*  88 */     long l4 = 0L;
/*  89 */     long l5 = 0L;
/*  90 */     int i15 = 0;
/*  91 */     int i16 = 0;
/*  92 */     long l6 = 0L;
/*     */     
/*     */ 
/*  95 */     int i17 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  99 */       i = MainMemory.alloc(81);
/* 100 */       j = MainMemory.alloc(71);
/* 101 */       k = MainMemory.alloc(4);
/* 102 */       m = MainMemory.alloc(4);
/* 103 */       n = MainMemory.alloc(4);
/* 104 */       i1 = MainMemory.alloc(8);
/* 105 */       i2 = MainMemory.alloc(4);
/* 106 */       i3 = MainMemory.alloc(4);
/* 107 */       i4 = MainMemory.alloc(71);
/* 108 */       i5 = MainMemory.alloc(72);
/* 109 */       i6 = MainMemory.alloc(73);
/* 110 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */         i9 = MainMemory.getI32(paramInt1);
/* 121 */         i7 = paramInt1 + 4;
/* 122 */         i14 = MainMemory.getI32(i7);
/* 123 */         if (i9 != MainMemory.getI32(i14 + 64)) {
/*     */           break label275;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         if (MainMemory.getI64(i14 + 112) != -1L) {
/*     */           break label292;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label986;
/*     */         } else {
/*     */           break label292;
/*     */         }
/*     */         
/*     */ 
/*     */         label275:
/*     */         
/* 152 */         ffmahd.call(paramInt1, i9 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label292:
/*     */         
/*     */ 
/* 158 */         i14 = MainMemory.getI32(i7);
/* 159 */         if (MainMemory.getI32(i14 + 68) != 0) {
/*     */           break label347;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         ffxmsg.call(5, 131616);
/* 170 */         MainMemory.setI32(paramInt5, 235);
/*     */         
/*     */ 
/*     */         break label2577;
/*     */         
/*     */         label347:
/*     */         
/* 177 */         i8 = MainMemory.getI32(i14 + 916);
/* 178 */         if (paramInt2 >= 1) {
/*     */           break label394;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */         MainMemory.setI32(paramInt5, 302);
/*     */         
/*     */ 
/*     */         break label2577;
/*     */         
/*     */         label394:
/*     */         
/* 195 */         i9 = i8 + 1;
/* 196 */         paramInt2 = i8 < paramInt2 ? i9 : paramInt2;
/* 197 */         SystemLibrary.strcpy(i4, MainMemory.getI32(paramInt4));
/* 198 */         i10 = SystemLibrary.strlen(i4);
/* 199 */         if (i10 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */           i11 = __ctype_toupper_loc.call();
/* 210 */           i12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 217 */             i13 = i4 + i12;
/* 218 */             MainMemory.setI8(i13, (byte)MainMemory.getI32(MainMemory.getI32(i11) + (MainMemory.getI8(i13) << 2)));
/* 219 */             i12 += 1;
/* 220 */             if (i12 == i10) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */         if (MainMemory.getI32(MainMemory.getI32(i7) + 68) != 1) {
/*     */           break label579;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */         ffasfm.call(i4, k, i2, m, paramInt5);
/* 242 */         l6 = MainMemory.getI32(i2) + 1;
/* 243 */         l1 = l6;
/*     */         
/*     */         break label741;
/*     */         
/*     */         label579:
/* 248 */         ffbnfm.call(i4, k, i3, i2, paramInt5);
/* 249 */         i10 = MainMemory.getI32(k);
/* 250 */         if (i10 < 0) {
/* 251 */           l1 = 8L;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 261 */           switch (i10)
/*     */           {
/*     */           case 1: 
/*     */             break label690;
/*     */             
/*     */             break;
/*     */           case 16: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 272 */           l6 = MainMemory.getI32(i3);
/* 273 */           l1 = l6;
/*     */           
/*     */           break label741;
/*     */           
/*     */           label690:
/* 278 */           l6 = (MainMemory.getI32(i3) + 7) / 8;
/* 279 */           l1 = l6;
/*     */           
/*     */ 
/*     */           break label741;
/*     */           
/* 284 */           l6 = MainMemory.getI32(i3) * (i10 / 10);
/* 285 */           l1 = l6;
/*     */         }
/*     */         
/*     */ 
/*     */         label741:
/*     */         
/*     */ 
/* 292 */         if (MainMemory.getI32(paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */           i14 = MainMemory.getI32(i7);
/* 303 */           l2 = MainMemory.getI64(i14 + 936);
/* 304 */           l3 = MainMemory.getI64(i14 + 928);
/* 305 */           l4 = MainMemory.getI64(i14 + 956);
/* 306 */           l6 = l4 + MainMemory.getI64(i14 + 948);
/* 307 */           l5 = l6 + 2879L;
/* 308 */           l5 = l5 - l5 % 2880L - l6;
/* 309 */           l6 = l3 * l1;
/* 310 */           if (l5 - l6 >= 0L) {
/*     */             break label922;
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
/* 322 */           if (ffiblk.call(paramInt1, (int)((l6 + 2879L - l5) / 2880L), 1, paramInt5) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */             i14 = MainMemory.getI32(i7);
/* 333 */             l4 = MainMemory.getI64(i14 + 956);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label922:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 343 */             if (l4 <= 0L) {
/*     */               break label1008;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */             if (ffshft.call(paramInt1, MainMemory.getI64(i14 + 948) + MainMemory.getI64(i14 + 112), l4, l6, paramInt5) <= 0) {
/*     */               break label996;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label986:
/*     */       
/*     */ 
/*     */       break label2577;
/*     */       
/*     */ 
/*     */       label996:
/*     */       
/* 370 */       i14 = MainMemory.getI32(i7);
/*     */       
/*     */ 
/*     */ 
/*     */       label1008:
/*     */       
/*     */ 
/*     */ 
/* 378 */       i15 = i14 + 948;
/* 379 */       MainMemory.setI64(i15, MainMemory.getI64(i15) + l6);
/* 380 */       MainMemory.setI32(n, 0);
/* 381 */       ffmkyj.call(paramInt1, 27296, MainMemory.getI64(MainMemory.getI32(i7) + 948), 14112, n);
/* 382 */       i16 = paramInt2 > i8 ? 1 : 0;
/* 383 */       if (i16 != 0) {
/* 384 */         l6 = l2;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 394 */         l6 = MainMemory.getI64(MainMemory.getI32(MainMemory.getI32(i7) + 944) + (paramInt2 + -1) * 152 + 72);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */       ffcins.call(paramInt1, l2, l3, l1, l6, paramInt5);
/* 403 */       if ((MainMemory.getI32(MainMemory.getI32(i7) + 68) != 1) || (i8 <= 0)) {
/*     */         break label1363;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 413 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 420 */         i10 += 1;
/* 421 */         ffkeyn.call(27328, i10, i5, paramInt5);
/* 422 */         if (MainMemory.getI32(paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 432 */           MainMemory.setI8(j, (byte)0);
/* 433 */           MainMemory.setI8(i6, (byte)0);
/* 434 */           if (ffgcrd.call(paramInt1, i5, i, paramInt5) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */             ffpsvc.call(i, j, i6, paramInt5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 450 */           ffc2j.call(j, i1, paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 456 */         l3 = MainMemory.getI64(i1);
/* 457 */         if (l3 <= l6) {
/*     */           break label1343;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 467 */         l3 += l1;
/* 468 */         MainMemory.setI64(i1, l3);
/* 469 */         ffmkyj.call(paramInt1, i5, l3, 14112, paramInt5);
/*     */         
/*     */ 
/*     */         label1343:
/*     */         
/*     */ 
/* 475 */         if (i10 == i8) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1363:
/*     */       
/*     */ 
/*     */ 
/* 486 */       ffmkyj.call(paramInt1, 41248, i9, 14112, paramInt5);
/* 487 */       ffmkyj.call(paramInt1, 36000, l2 + l1, 14112, paramInt5);
/* 488 */       if (i16 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 498 */         ffkshf.call(paramInt1, paramInt2, i8, 1, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 504 */       SystemLibrary.memcpy(i6, 57312, 16, 1);
/* 505 */       ffkeyn.call(26976, paramInt2, i5, paramInt5);
/* 506 */       i8 = MainMemory.getI32(paramInt5);
/* 507 */       if (i8 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */         ffs2c.call(MainMemory.getI32(paramInt3), j, i8);
/* 518 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 519 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 525 */       SystemLibrary.memcpy(i6, 57344, 16, 1);
/* 526 */       SystemLibrary.strcpy(i4, MainMemory.getI32(paramInt4));
/* 527 */       i8 = SystemLibrary.strlen(i4);
/* 528 */       if (i8 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */         i11 = __ctype_toupper_loc.call();
/* 539 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 546 */           i13 = i4 + i10;
/* 547 */           MainMemory.setI8(i13, (byte)MainMemory.getI32(MainMemory.getI32(i11) + (MainMemory.getI8(i13) << 2)));
/* 548 */           i10 += 1;
/* 549 */           if (i10 == i8) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 560 */       ffkeyn.call(27360, paramInt2, i5, paramInt5);
/* 561 */       i8 = MainMemory.getI32(k);
/* 562 */       switch (i8 > -1 ? i8 : 0 - i8)
/*     */       {
/*     */       case 12: 
/*     */         break label2176;
/*     */         break;
/*     */       case 20: 
/*     */         break label1944;
/*     */         break;
/*     */       case 40: 
/*     */         break;
/*     */       }
/*     */       
/* 574 */       if (MainMemory.getI8(i4) == 86) {
/* 575 */         i13 = i4;
/*     */         break label1778;
/*     */       } else {
/* 578 */         i8 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 587 */         i8 += 1;
/* 588 */         i13 = i4 + i8;
/* 589 */         if (MainMemory.getI8(i13) == 86) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1778:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 602 */       MainMemory.setI8(i13, (byte)74);
/* 603 */       i8 = MainMemory.getI32(paramInt5);
/* 604 */       if (i8 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 614 */         ffs2c.call(i4, j, i8);
/* 615 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 616 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 622 */       ffkeyn.call(27392, paramInt2, i5, paramInt5);
/* 623 */       SystemLibrary.memcpy(i6, 74656, 29, 1);
/* 624 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 634 */         ffd2f.call(2.147483648E9D, j, paramInt5);
/* 635 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 636 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 642 */       fficls_1093.call(paramInt1, j, i, paramInt2, i6, i5, paramInt5);
/*     */       
/*     */       break label2466;
/*     */       
/*     */       label1944:
/* 647 */       if (MainMemory.getI8(i4) == 85) {
/* 648 */         i13 = i4;
/*     */         break label2010;
/*     */       } else {
/* 651 */         i8 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 660 */         i8 += 1;
/* 661 */         i13 = i4 + i8;
/* 662 */         if (MainMemory.getI8(i13) == 85) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label2010:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 675 */       MainMemory.setI8(i13, (byte)73);
/* 676 */       i8 = MainMemory.getI32(paramInt5);
/* 677 */       if (i8 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 687 */         ffs2c.call(i4, j, i8);
/* 688 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 689 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 695 */       ffkeyn.call(27392, paramInt2, i5, paramInt5);
/* 696 */       SystemLibrary.memcpy(i6, 74656, 29, 1);
/* 697 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 707 */         ffd2f.call(32768.0D, j, paramInt5);
/* 708 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 709 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 715 */       fficls_1091.call(paramInt1, j, i, paramInt2, i6, i5, paramInt5);
/*     */       
/*     */       break label2466;
/*     */       
/*     */       label2176:
/* 720 */       if (MainMemory.getI8(i4) == 83) {
/* 721 */         i13 = i4;
/*     */         break label2242;
/*     */       } else {
/* 724 */         i8 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 733 */         i8 += 1;
/* 734 */         i13 = i4 + i8;
/* 735 */         if (MainMemory.getI8(i13) == 83) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label2242:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 748 */       MainMemory.setI8(i13, (byte)66);
/* 749 */       i8 = MainMemory.getI32(paramInt5);
/* 750 */       if (i8 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 760 */         ffs2c.call(i4, j, i8);
/* 761 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 762 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 768 */       ffkeyn.call(27392, paramInt2, i5, paramInt5);
/* 769 */       SystemLibrary.memcpy(i6, 67872, 24, 1);
/* 770 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 780 */         ffd2f.call(-128.0D, j, paramInt5);
/* 781 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 782 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 788 */       fficls_1092.call(paramInt1, j, i, paramInt2, i6, i5, paramInt5);
/*     */       
/*     */ 
/*     */       break label2466;
/*     */       
/* 793 */       i8 = MainMemory.getI32(paramInt5);
/* 794 */       if (i8 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 804 */         ffs2c.call(i4, j, i8);
/* 805 */         ffmkky.call(i5, j, i6, i, paramInt5);
/* 806 */         ffprec.call(paramInt1, i, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */       label2466:
/*     */       
/* 812 */       if (MainMemory.getI32(MainMemory.getI32(i7) + 68) != 1) {
/*     */         break label2565;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 822 */       l6 += (i9 == paramInt2 ? 2L : 1L);
/* 823 */       SystemLibrary.memcpy(i6, 70592, 26, 1);
/* 824 */       ffkeyn.call(27328, paramInt2, i5, paramInt5);
/* 825 */       ffpkyj.call(paramInt1, i5, l6, i6, paramInt5);
/* 826 */       ffasfm.call(i4, k, i2, m, paramInt5);
/*     */       
/*     */ 
/*     */       label2565:
/*     */       
/*     */ 
/* 832 */       ffrdef.call(paramInt1, paramInt5);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2577:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 843 */       MainMemory.dealloc_generated(i17);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fficls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */