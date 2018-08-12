/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ 
/*      */ public final class F302135 extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3186;
/*   13 */   public static final Function _instance = new F302135();
/*   14 */   public final Function resolve() { return _instance; }
/*      */   
/*   16 */   public F302135() { super("F302135", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   20 */     call(paramInt);
/*   21 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   27 */     paramInt4 += 2;
/*   28 */     paramInt3--;
/*   29 */     call(i);
/*   30 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt)
/*      */   {
/*   36 */     int i = 0;
/*   37 */     int j = 0;
/*   38 */     int k = 0;
/*   39 */     int m = 0;
/*   40 */     int n = 0;
/*   41 */     int i1 = 0;
/*   42 */     int i2 = 0;
/*   43 */     int i3 = 0;
/*   44 */     int i4 = 0;
/*   45 */     int i5 = 0;
/*   46 */     int i6 = 0;
/*   47 */     int i7 = 0;
/*   48 */     int i8 = 0;
/*   49 */     int i9 = 0;
/*   50 */     int i10 = 0;
/*   51 */     int i11 = 0;
/*   52 */     int i12 = 0;
/*   53 */     int i13 = 0;
/*   54 */     int i14 = 0;
/*   55 */     byte b1 = 0;
/*   56 */     byte b2 = 0;
/*   57 */     byte b3 = 0;
/*   58 */     byte b4 = 0;
/*   59 */     int i15 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   65 */       i = MainMemory.getI32Aligned(470792);
/*   66 */       j = MainMemory.getI32(paramInt + 12);
/*   67 */       k = MainMemory.getI32(paramInt + 16);
/*   68 */       m = i + j * 344;
/*   69 */       n = MainMemory.getI32(m) == 64536 ? 1 : 0;
/*   70 */       i1 = i + k * 344;
/*   71 */       i2 = MainMemory.getI32(i1) == 64536 ? 1 : 0;
/*   72 */       if (n == 0)
/*      */       {
/*      */ 
/*      */ 
/*   76 */         i3 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*   83 */         i4 = i + j * 344 + 56 + 32;
/*   84 */         i3 = i4;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   91 */       if (i2 == 0)
/*      */       {
/*      */ 
/*      */ 
/*   95 */         i4 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  102 */         i4 = i + k * 344 + 56 + 32;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  110 */       if ((n == 0) || (i2 == 0)) {
/*      */         break label929;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  120 */       i5 = MainMemory.getI32(paramInt);
/*  121 */       switch (i5) {
/*      */       case 43: 
/*      */         break label885;
/*      */         break;
/*      */       case 277: 
/*      */         break label794;
/*      */         break;
/*      */       case 278: 
/*      */         break label794;
/*      */         break;
/*      */       case 279: 
/*      */         break label693;
/*      */         break;
/*      */       case 280:  break label592;
/*      */         break; case 281:  break label490;
/*      */         break; case 282:  break; }
/*  137 */       b1 = MainMemory.getI8(i3);
/*  138 */       b2 = MainMemory.getI8(i4);
/*  139 */       if (b1 >= b2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  149 */         if (b1 > b2) {
/*  150 */           b1 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           break label471;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  160 */         if (SystemLibrary.strcmp(i3, i4) > -1) {
/*  161 */           b1 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */           break label471;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  171 */       b1 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */       label471:
/*      */       
/*      */ 
/*  178 */       MainMemory.setI8(paramInt + 88, b1);
/*      */       
/*      */       break label912;
/*      */       
/*      */       label490:
/*  183 */       b1 = MainMemory.getI8(i3);
/*  184 */       b2 = MainMemory.getI8(i4);
/*  185 */       if (b1 < b2) {
/*  186 */         b1 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  196 */         if (b1 <= b2)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  206 */           if (SystemLibrary.strcmp(i3, i4) < 1) {
/*  207 */             b1 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */             break label573;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  217 */         b1 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */       label573:
/*      */       
/*      */ 
/*  224 */       MainMemory.setI8(paramInt + 88, b1);
/*      */       
/*      */       break label912;
/*      */       
/*      */       label592:
/*  229 */       b1 = MainMemory.getI8(i3);
/*  230 */       b2 = MainMemory.getI8(i4);
/*  231 */       if (b1 < b2) {
/*  232 */         b1 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  242 */         if (b1 <= b2)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  252 */           if (SystemLibrary.strcmp(i3, i4) < 0) {
/*  253 */             b1 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */             break label674;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  263 */         b1 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */       label674:
/*      */       
/*      */ 
/*  270 */       MainMemory.setI8(paramInt + 88, b1);
/*      */       
/*      */       break label912;
/*      */       
/*      */       label693:
/*  275 */       b1 = MainMemory.getI8(i3);
/*  276 */       b2 = MainMemory.getI8(i4);
/*  277 */       if (b1 >= b2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  287 */         if (b1 > b2) {
/*  288 */           b1 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           break label775;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  298 */         if (SystemLibrary.strcmp(i3, i4) > 0) {
/*  299 */           b1 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */           break label775;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  309 */       b1 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */       label775:
/*      */       
/*      */ 
/*  316 */       MainMemory.setI8(paramInt + 88, b1);
/*      */       
/*      */       break label912;
/*      */       
/*      */       label794:
/*  321 */       if (MainMemory.getI8(i3) != MainMemory.getI8(i4)) {
/*      */         break label843;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  331 */       if (SystemLibrary.strcmp(i3, i4) == 0) {
/*  332 */         i13 = 1;
/*      */       } else {
/*      */         label843:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  342 */         i13 = 0;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  349 */       MainMemory.setI8(paramInt + 88, (byte)((i5 != 277 ? 1 : 0) ^ i13));
/*      */       
/*      */       break label912;
/*      */       
/*      */       label885:
/*  354 */       i15 = paramInt + 88;
/*  355 */       SystemLibrary.strcpy(i15, i3);
/*  356 */       SystemLibrary.strcat(i15, i4);
/*      */       
/*      */ 
/*      */       label912:
/*      */       
/*      */ 
/*  362 */       MainMemory.setI32(paramInt, 64536);
/*      */       
/*      */       break label2809;
/*      */       
/*      */       label929:
/*  367 */       F301051.call(paramInt);
/*  368 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*      */         break label2809;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  378 */       i5 = MainMemory.getI32Aligned(470812);
/*  379 */       switch (MainMemory.getI32(paramInt)) {
/*      */       case 43: 
/*      */         break label2445;
/*      */         break;
/*      */       case 277: 
/*      */         break label2032;
/*      */         break;
/*      */       case 278: 
/*      */         break label2032;
/*      */         break;
/*      */       case 279: 
/*      */         break label1562;
/*      */         break;
/*      */       case 280: 
/*      */         break label1562;
/*      */         break;
/*      */       case 281:  break; case 282:  break; }
/*  396 */       i7 = paramInt + 84;
/*  397 */       i8 = i + k * 344 + 56 + 28;
/*  398 */       i9 = i + j * 344 + 56 + 28;
/*  399 */       i10 = paramInt + 88;
/*  400 */       i11 = i + k * 344 + 56 + 32;
/*  401 */       i12 = i + j * 344 + 56 + 32;
/*      */       
/*      */ 
/*  404 */       b1 = 0;
/*  405 */       b2 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  417 */         i13 = i5 + -1;
/*  418 */         i14 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  429 */           i5 = i13 - i14;
/*  430 */           if (i5 == -1) {
/*      */             break label2809;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  440 */           if (n == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  451 */             b1 = MainMemory.getI8(MainMemory.getI32(i9) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  459 */           if (i2 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  470 */             b2 = MainMemory.getI8(MainMemory.getI32(i8) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  478 */           MainMemory.setI8(MainMemory.getI32(i7) + i5, (byte)(MathUtils.or(b2, b1) != 0 ? 1 : 0));
/*  479 */           i14 += 1;
/*  480 */           if (MainMemory.getI8(MainMemory.getI32(i7) + i5) == 0) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  493 */         if (n == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  504 */           i3 = MainMemory.getI32(MainMemory.getI32(i12) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  512 */         if (i2 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  523 */           i4 = MainMemory.getI32(MainMemory.getI32(i11) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  531 */         b3 = MainMemory.getI8(i3);
/*  532 */         b4 = MainMemory.getI8(i4);
/*  533 */         if (b3 < b4) {
/*  534 */           i13 = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  544 */         else if (b3 > b4) {
/*  545 */           i13 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  555 */           i13 = SystemLibrary.strcmp(i3, i4);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  563 */         i15 = MainMemory.getI32(i10);
/*  564 */         if (MainMemory.getI32(paramInt) != 282) {
/*      */           break label1523;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  574 */         b3 = MathUtils.xor((byte)(i13 >>> 31), (byte)1);
/*      */         
/*      */         break label1542;
/*      */         
/*      */         label1523:
/*      */         
/*  580 */         b3 = (byte)(i13 < 1 ? 1 : 0);
/*      */         
/*      */ 
/*      */ 
/*      */         label1542:
/*      */         
/*      */ 
/*      */ 
/*  588 */         MainMemory.setI8(i15 + i5, b3);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label1562:
/*      */       
/*      */ 
/*      */ 
/*  598 */       i7 = paramInt + 84;
/*  599 */       i8 = i + k * 344 + 56 + 28;
/*  600 */       i9 = i + j * 344 + 56 + 28;
/*  601 */       i10 = paramInt + 88;
/*  602 */       i11 = i + k * 344 + 56 + 32;
/*  603 */       i12 = i + j * 344 + 56 + 32;
/*      */       
/*      */ 
/*  606 */       b1 = 0;
/*  607 */       b2 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  619 */         i13 = i5 + -1;
/*  620 */         i14 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  631 */           i5 = i13 - i14;
/*  632 */           if (i5 == -1) {
/*      */             break label2809;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  642 */           if (n == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  653 */             b1 = MainMemory.getI8(MainMemory.getI32(i9) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  661 */           if (i2 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  672 */             b2 = MainMemory.getI8(MainMemory.getI32(i8) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  680 */           MainMemory.setI8(MainMemory.getI32(i7) + i5, (byte)(MathUtils.or(b2, b1) != 0 ? 1 : 0));
/*  681 */           i14 += 1;
/*  682 */           if (MainMemory.getI8(MainMemory.getI32(i7) + i5) == 0) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  695 */         if (n == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  706 */           i3 = MainMemory.getI32(MainMemory.getI32(i12) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  714 */         if (i2 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  725 */           i4 = MainMemory.getI32(MainMemory.getI32(i11) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  733 */         b3 = MainMemory.getI8(i3);
/*  734 */         b4 = MainMemory.getI8(i4);
/*  735 */         if (b3 < b4) {
/*  736 */           i13 = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  746 */         else if (b3 > b4) {
/*  747 */           i13 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  757 */           i13 = SystemLibrary.strcmp(i3, i4);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  765 */         i15 = MainMemory.getI32(i10);
/*  766 */         if (MainMemory.getI32(paramInt) != 279) {
/*      */           break label1999;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  776 */         b3 = (byte)(i13 > 0 ? 1 : 0);
/*      */         
/*      */         break label2012;
/*      */         
/*      */         label1999:
/*      */         
/*  782 */         b3 = (byte)(i13 >>> 31);
/*      */         
/*      */ 
/*      */ 
/*      */         label2012:
/*      */         
/*      */ 
/*      */ 
/*  790 */         MainMemory.setI8(i15 + i5, b3);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label2032:
/*      */       
/*      */ 
/*      */ 
/*  800 */       i7 = paramInt + 84;
/*  801 */       i8 = i + k * 344 + 56 + 28;
/*  802 */       i9 = i + j * 344 + 56 + 28;
/*  803 */       i10 = paramInt + 88;
/*  804 */       i11 = i + k * 344 + 56 + 32;
/*  805 */       i12 = i + j * 344 + 56 + 32;
/*      */       
/*      */ 
/*  808 */       b1 = 0;
/*  809 */       b2 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  821 */         i13 = i5 + -1;
/*  822 */         i14 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  833 */           i5 = i13 - i14;
/*  834 */           if (i5 == -1) {
/*      */             break label2809;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  844 */           if (n == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  855 */             b1 = MainMemory.getI8(MainMemory.getI32(i9) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  863 */           if (i2 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  874 */             b2 = MainMemory.getI8(MainMemory.getI32(i8) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  882 */           MainMemory.setI8(MainMemory.getI32(i7) + i5, (byte)(MathUtils.or(b2, b1) != 0 ? 1 : 0));
/*  883 */           i14 += 1;
/*  884 */           if (MainMemory.getI8(MainMemory.getI32(i7) + i5) == 0) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  897 */         if (n == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  908 */           i3 = MainMemory.getI32(MainMemory.getI32(i12) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  916 */         if (i2 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  927 */           i4 = MainMemory.getI32(MainMemory.getI32(i11) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  935 */         if (MainMemory.getI8(i3) != MainMemory.getI8(i4)) {
/*      */           break label2397;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  945 */         if (SystemLibrary.strcmp(i3, i4) == 0) {
/*  946 */           i13 = 1;
/*      */         } else {
/*      */           label2397:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  956 */           i13 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  963 */         MainMemory.setI8(MainMemory.getI32(i10) + i5, (byte)((MainMemory.getI32(paramInt) != 277 ? 1 : 0) ^ i13));
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label2445:
/*      */       
/*      */ 
/*      */ 
/*  973 */       i7 = paramInt + 84;
/*  974 */       i8 = i + k * 344 + 56 + 28;
/*  975 */       i9 = i + j * 344 + 56 + 28;
/*  976 */       i11 = paramInt + 88;
/*  977 */       i12 = i + k * 344 + 56 + 32;
/*  978 */       i6 = i + j * 344 + 56 + 32;
/*      */       
/*      */ 
/*  981 */       b1 = 0;
/*  982 */       b2 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  994 */         i13 = i5 + -1;
/*  995 */         i14 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1006 */           i5 = i13 - i14;
/* 1007 */           if (i5 == -1) {
/*      */             break label2809;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1017 */           if (n == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1028 */             b1 = MainMemory.getI8(MainMemory.getI32(i9) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1036 */           if (i2 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1047 */             b2 = MainMemory.getI8(MainMemory.getI32(i8) + i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1055 */           MainMemory.setI8(MainMemory.getI32(i7) + i5, (byte)(MathUtils.or(b2, b1) != 0 ? 1 : 0));
/* 1056 */           i14 += 1;
/* 1057 */           if (MainMemory.getI8(MainMemory.getI32(i7) + i5) == 0) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1070 */         if (n == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1081 */           i3 = MainMemory.getI32(MainMemory.getI32(i6) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1089 */         if (i2 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1100 */           i4 = MainMemory.getI32(MainMemory.getI32(i12) + (i5 << 2));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1108 */         SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32(i11) + (i5 << 2)), i3);
/* 1109 */         SystemLibrary.strcat(MainMemory.getI32(MainMemory.getI32(i11) + (i5 << 2)), i4);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label2809:
/*      */       
/*      */ 
/*      */ 
/* 1119 */       if (MainMemory.getI32(m) <= 0) {
/*      */         break label2869;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1129 */       i11 = i + j * 344 + 56 + 32;
/* 1130 */       free.call(MainMemory.getI32(MainMemory.getI32(i11)));
/* 1131 */       free.call(MainMemory.getI32(i11));
/*      */       
/*      */ 
/*      */       label2869:
/*      */       
/*      */ 
/* 1137 */       if (MainMemory.getI32(i1) <= 0) {
/*      */         break label2934;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1147 */       i11 = i + k * 344 + 56 + 32;
/* 1148 */       free.call(MainMemory.getI32(MainMemory.getI32(i11)));
/* 1149 */       free.call(MainMemory.getI32(i11));
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label2934:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1161 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F302135.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */