/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ 
/*      */ public final class fits_hdecompress64 extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3665;
/*   15 */   public static final Function _instance = new fits_hdecompress64();
/*   16 */   public final Function resolve() { return _instance; }
/*      */   
/*   18 */   public fits_hdecompress64() { super("fits_hdecompress64", 7, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   31 */     paramInt4 += 2;
/*   32 */     paramInt3--;
/*   33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   34 */     paramInt4 += 2;
/*   35 */     paramInt3--;
/*   36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     int i3 = call(i, j, k, m, n, i1, i2);
/*   49 */     paramFrame.setI32(paramInt1, i3);
/*   50 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   55 */     int i = 0;
/*      */     
/*   57 */     int j = 0;
/*   58 */     int k = 0;
/*   59 */     int m = 0;
/*   60 */     int n = 0;
/*   61 */     int i1 = 0;
/*   62 */     int i2 = 0;
/*   63 */     float f = 0.0F;
/*   64 */     double d = 0.0D;
/*   65 */     int i3 = 0;
/*   66 */     long l1 = 0L;
/*   67 */     long l2 = 0L;
/*   68 */     int i4 = 0;
/*   69 */     int i5 = 0;
/*   70 */     int i6 = 0;
/*   71 */     int i7 = 0;
/*   72 */     int i8 = 0;
/*   73 */     int i9 = 0;
/*   74 */     int i10 = 0;
/*   75 */     int i11 = 0;
/*   76 */     int i12 = 0;
/*   77 */     int i13 = 0;
/*   78 */     int i14 = 0;
/*   79 */     int i15 = 0;
/*   80 */     int i16 = 0;
/*   81 */     int i17 = 0;
/*   82 */     long l3 = 0L;
/*   83 */     long l4 = 0L;
/*   84 */     long l5 = 0L;
/*   85 */     long l6 = 0L;
/*   86 */     long l7 = 0L;
/*   87 */     long l8 = 0L;
/*   88 */     long l9 = 0L;
/*   89 */     int i18 = 0;
/*   90 */     int i19 = 0;
/*   91 */     int i20 = 0;
/*   92 */     int i21 = 0;
/*   93 */     int i22 = 0;
/*   94 */     int i23 = 0;
/*   95 */     long l10 = 0L;
/*   96 */     int i24 = 0;
/*   97 */     int i25 = 0;
/*   98 */     int i26 = 0;
/*   99 */     int i27 = 0;
/*  100 */     int i28 = 0;
/*  101 */     int i29 = 0;
/*  102 */     int i30 = 0;
/*  103 */     int i31 = 0;
/*  104 */     long l11 = 0L;
/*  105 */     boolean bool = false;
/*  106 */     int i32 = 0;
/*  107 */     int i33 = 0;
/*  108 */     int i34 = 0;
/*  109 */     int i35 = 0;
/*  110 */     int i36 = 0;
/*  111 */     int i37 = 0;
/*  112 */     int i38 = 0;
/*  113 */     int i39 = 0;
/*  114 */     int i40 = 0;
/*  115 */     int i41 = 0;
/*  116 */     int i42 = 0;
/*  117 */     int i43 = 0;
/*  118 */     int i44 = 0;
/*  119 */     int i45 = 0;
/*  120 */     int i46 = 0;
/*  121 */     long l12 = 0L;
/*  122 */     long l13 = 0L;
/*  123 */     long l14 = 0L;
/*  124 */     long l15 = 0L;
/*  125 */     long l16 = 0L;
/*  126 */     long l17 = 0L;
/*      */     
/*      */ 
/*  129 */     int i47 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  133 */       j = paramInt3;
/*  134 */       k = MainMemory.alloc(2);
/*  135 */       i2 = MainMemory.getI32(paramInt7);
/*  136 */       if (i2 > 0) {
/*  137 */         paramInt2 = i2;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  147 */         MainMemory.setI16(k, MainMemory.getI16(paramInt1));
/*  148 */         MainMemory.setI32Aligned(459444, 2);
/*  149 */         if (SystemLibrary.memcmp(k, 459324, 2) != 0) {
/*      */           break label4657;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  159 */         MainMemory.setI32(paramInt5, ((MainMemory.getI8(paramInt1 + 3) & 0xFF | (MainMemory.getI8(paramInt1 + 2) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 4) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 5) & 0xFF);
/*  160 */         MainMemory.setI32(paramInt4, ((MainMemory.getI8(paramInt1 + 7) & 0xFF | (MainMemory.getI8(paramInt1 + 6) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 8) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 9) & 0xFF);
/*  161 */         MainMemory.setI32(paramInt6, ((MainMemory.getI8(paramInt1 + 11) & 0xFF | (MainMemory.getI8(paramInt1 + 10) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 12) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 13) & 0xFF);
/*  162 */         l1 = ((((((MainMemory.getI8(paramInt1 + 15) & 0xFF | (MainMemory.getI8(paramInt1 + 14) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 16) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 17) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 18) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 19) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 20) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 21) & 0xFF;
/*  163 */         m = MainMemory.getI8(paramInt1 + 22);
/*  164 */         n = MainMemory.getI8(paramInt1 + 23);
/*  165 */         i1 = MainMemory.getI8(paramInt1 + 24);
/*  166 */         MainMemory.setI32Aligned(459444, 25);
/*  167 */         i2 = MainMemory.getI32(paramInt4);
/*  168 */         i3 = MainMemory.getI32(paramInt5);
/*  169 */         i6 = (i3 + 1) / 2;
/*  170 */         i5 = (i2 + 1) / 2;
/*  171 */         i4 = i3 * i2 > 0 ? 1 : 0;
/*  172 */         if (i4 == 0) {
/*      */           break label742;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  182 */         i7 = i2 * i3;
/*  183 */         i8 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  190 */           MainMemory.setI64(paramInt3 + (i8 << 3), 0L);
/*  191 */           i8 += 1;
/*  192 */           if (i8 == i7) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label742:
/*      */         
/*      */ 
/*      */ 
/*  203 */         MainMemory.setI32Aligned(459440, 0);
/*  204 */         i7 = F423816.call(paramInt1, paramInt3, i2, i6, i5, m & 0xFF);
/*  205 */         if (i7 != 0)
/*      */         {
/*      */ 
/*      */ 
/*  209 */           i2 = i7;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  216 */           i8 = n & 0xFF;
/*  217 */           i7 = i2 / 2;
/*  218 */           i9 = F423816.call(paramInt1, paramInt3 + (i5 << 3), i2, i6, i7, i8);
/*  219 */           if (i9 != 0)
/*      */           {
/*      */ 
/*      */ 
/*  223 */             i2 = i9;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  230 */             i9 = i3 / 2;
/*  231 */             i6 *= i2;
/*  232 */             i8 = F423816.call(paramInt1, paramInt3 + (i6 << 3), i2, i9, i5, i8);
/*  233 */             if (i8 != 0)
/*      */             {
/*      */ 
/*      */ 
/*  237 */               i2 = i8;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  244 */               i5 = F423816.call(paramInt1, paramInt3 + (i6 + i5 << 3), i2, i9, i7, i1 & 0xFF);
/*  245 */               if (i5 != 0)
/*      */               {
/*      */ 
/*      */ 
/*  249 */                 i2 = i5;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  256 */                 i6 = MainMemory.getI32Aligned(459440);
/*  257 */                 i7 = MainMemory.getI32Aligned(459448);
/*  258 */                 if (i6 >= 4)
/*      */                 {
/*      */ 
/*      */ 
/*  262 */                   i5 = i7;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*  270 */                   i5 = MainMemory.getI32Aligned(459444);
/*  271 */                   i7 = MainMemory.getI8(paramInt1 + i5) & 0xFF | i7 << 8;
/*  272 */                   MainMemory.setI32Aligned(459448, i7);
/*  273 */                   MainMemory.setI32Aligned(459444, i5 + 1);
/*  274 */                   i6 += 8;
/*  275 */                   MainMemory.setI32Aligned(459440, i6);
/*  276 */                   i5 = i7;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  285 */                 i6 += -4;
/*  286 */                 MainMemory.setI32Aligned(459440, i6);
/*  287 */                 if ((i5 >> i6 & 0xF) != 0) {
/*      */                   break label1342;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  297 */                 MainMemory.setI32Aligned(459440, 0);
/*  298 */                 if (i4 == 0) {
/*      */                   break label1320;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  308 */                 i2 *= i3;
/*      */                 
/*  310 */                 i6 = 0;
/*  311 */                 i3 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  320 */                   i42 = paramInt3 + (i3 << 3);
/*  321 */                   l2 = MainMemory.getI64(i42);
/*  322 */                   if (l2 != 0L)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  334 */                     if (i6 != 0) {
/*      */                       break label1242;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  344 */                     i5 = MainMemory.getI32Aligned(459444);
/*  345 */                     i6 = MainMemory.getI8(paramInt1 + i5) & 0xFF;
/*  346 */                     MainMemory.setI32Aligned(459448, i6);
/*  347 */                     MainMemory.setI32Aligned(459444, i5 + 1);
/*  348 */                     MainMemory.setI32Aligned(459440, 8);
/*  349 */                     i5 = i6;
/*  350 */                     i6 = 7;
/*      */                     
/*      */                     break label1253;
/*      */                     
/*      */                     label1242:
/*  355 */                     i6 += -1;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     label1253:
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  365 */                     MainMemory.setI32Aligned(459440, i6);
/*  366 */                     if ((1 << i6 & i5) != 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  378 */                       MainMemory.setI64(i42, 0L - l2);
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  388 */                   i3 += 1;
/*  389 */                   if (i3 == i2) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label1320:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  402 */                 MainMemory.setI64(paramInt3, l1);
/*  403 */                 MainMemory.setI32(paramInt7, 0);
/*      */                 
/*      */                 break label1411;
/*      */                 
/*      */                 label1342:
/*  408 */                 ffxmsg.call(5, 79648);
/*  409 */                 MainMemory.setI64(paramInt3, l1);
/*  410 */                 MainMemory.setI32(paramInt7, 414);
/*  411 */                 i = 414;
/*      */                 
/*      */                 break label4681;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*  419 */         MainMemory.setI64(paramInt3, l1);
/*  420 */         MainMemory.setI32(paramInt7, i2);
/*  421 */         if (i2 != 0)
/*      */         {
/*      */ 
/*      */ 
/*  425 */           paramInt2 = i2;
/*      */         }
/*      */         else
/*      */         {
/*      */           label1411:
/*      */           
/*      */ 
/*  432 */           i3 = MainMemory.getI32(paramInt6);
/*  433 */           if (i3 < 2) {
/*  434 */             i5 = i3;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  444 */             l1 = i3;
/*  445 */             i2 = MainMemory.getI32(paramInt4) * MainMemory.getI32(paramInt5) + -1;
/*  446 */             if (i2 < 0) {
/*  447 */               i5 = i3;
/*      */               break label1549;
/*      */             } else {
/*  450 */               i5 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  459 */               i3 = i5 + 1;
/*  460 */               i42 = paramInt3 + (i5 << 3);
/*  461 */               MainMemory.setI64(i42, MainMemory.getI64(i42) * l1);
/*  462 */               if (i2 < i3) {
/*      */                 break;
/*      */               }
/*      */               
/*  466 */               i5 = i3;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  473 */             i2 = MainMemory.getI32(paramInt6);
/*  474 */             i5 = i2;
/*      */           }
/*      */           
/*      */ 
/*      */           label1549:
/*      */           
/*      */ 
/*  481 */           i2 = MainMemory.getI32(paramInt4);
/*  482 */           i18 = MainMemory.getI32(paramInt5);
/*  483 */           i3 = i2 >= i18 ? i2 : i18;
/*  484 */           f = i3;
/*  485 */           d = f;
/*  486 */           d = SystemLibrary.log(d);
/*  487 */           d /= SystemLibrary.log(2.0D);
/*  488 */           d += 0.5D;
/*  489 */           i16 = (int)d;
/*  490 */           i17 = 1 << i16 < i3 ? 1 : 0;
/*  491 */           i6 = i17 + i16;
/*  492 */           paramInt1 = malloc.call((i3 + 1) / 2 << 3);
/*  493 */           if (paramInt1 != 0) {
/*      */             break label1691;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  503 */           ffxmsg.call(5, 72864);
/*  504 */           paramInt2 = 414;
/*      */           
/*      */           break label4528;
/*      */           
/*      */           label1691:
/*  509 */           i3 = i6 + -1;
/*  510 */           l8 = 1L << (int)(i3 & 0xFFFFFFFF);
/*  511 */           l9 = l8 << 1;
/*  512 */           l4 = 0L - l8;
/*  513 */           l10 = l9 >> 1;
/*  514 */           l1 = l8 << 2 >> 1;
/*  515 */           l2 = MainMemory.getI64(paramInt3);
/*  516 */           MainMemory.setI64(paramInt3, (l2 > -1L ? l1 : l1 + -1L) + l2 & l4 << 2);
/*  517 */           if (i3 <= -1) {
/*      */             break label4517;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  527 */           i23 = 1 << i6;
/*  528 */           l3 = l10 + -1L;
/*  529 */           l5 = l4 << 1;
/*  530 */           i5 >>= 1;
/*  531 */           l1 = i5;
/*  532 */           l2 = 0L - l1;
/*  533 */           i4 = (paramInt2 == 0) || (i5 < 1) ? 1 : 0;
/*  534 */           paramInt2 = i2 + 1;
/*  535 */           i5 = i2 + 2;
/*  536 */           i6 = i2 << 1;
/*  537 */           i7 = i2 << 2;
/*  538 */           i8 = i7 + 4;
/*  539 */           i9 = i6 + 3;
/*  540 */           i10 = i6 + 2;
/*  541 */           i11 = i2 * 3;
/*  542 */           i12 = i11 + 3;
/*  543 */           i13 = i11 + 2;
/*  544 */           i14 = i2 * -2;
/*  545 */           i15 = 0 - i2;
/*  546 */           i16 += i17;
/*  547 */           i17 = 0;
/*  548 */           l11 = l8;
/*  549 */           i20 = 2;
/*  550 */           i22 = 2;
/*  551 */           i19 = i18;
/*  552 */           i21 = i2;
/*  553 */           i18 = i23;
/*      */           
/*  555 */           i23 = 1;
/*      */           
/*      */ 
/*  558 */           l6 = l10;
/*  559 */           l7 = l9;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  580 */             l9 = l11 >> 1;
/*  581 */             i18 >>= 1;
/*  582 */             i24 = i19 > i18 ? 1 : 0;
/*  583 */             i19 -= (i24 != 0 ? i18 : 0);
/*  584 */             i20 = i24 != 0 ? i20 : i20 + -1;
/*  585 */             i24 = i21 > i18 ? 1 : 0;
/*  586 */             i21 -= (i24 != 0 ? i18 : 0);
/*  587 */             i22 = i24 != 0 ? i22 : i22 + -1;
/*  588 */             i24 = i3 == i17 ? 1 : 0;
/*  589 */             i23 = i24 != 0 ? 2 : i23;
/*  590 */             l10 = i24 != 0 ? 0L : l9 + -1L;
/*  591 */             i24 = i20 > 0 ? 1 : 0;
/*  592 */             if (i24 == 0) {
/*      */               break label2501;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  602 */             i29 = i22 + 1 >> 1;
/*  603 */             bool = i29 < i22;
/*  604 */             i28 = i22 - i29;
/*  605 */             i30 = i29 + -1;
/*  606 */             i27 = i30 > -1 ? 1 : 0;
/*  607 */             i25 = i22 > 1 ? 1 : 0;
/*  608 */             i31 = i22 + -1 & 0xFFFFFFFE;
/*  609 */             i39 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  616 */               i32 = i2 * i39;
/*  617 */               i41 = i29 + i32;
/*  618 */               i36 = i31 + i32;
/*  619 */               i37 = i30 + i32;
/*  620 */               i32 += 1;
/*  621 */               if (bool) {
/*  622 */                 i33 = 0;
/*      */               } else {
/*      */                 break label2324;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  633 */                 MainMemory.setI64(paramInt1 + (i33 << 3), MainMemory.getI64(paramInt3 + (i41 + i33 << 3)));
/*  634 */                 i33 += 1;
/*  635 */                 if (i33 == i28) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2324:
/*      */               
/*      */ 
/*      */ 
/*  646 */               if (i27 != 0) {
/*  647 */                 i41 = 0;
/*      */               } else {
/*      */                 break label2398;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  658 */                 MainMemory.setI64(paramInt3 + (i36 + i41 * -2 << 3), MainMemory.getI64(paramInt3 + (i37 - i41 << 3)));
/*  659 */                 i41 += 1;
/*  660 */                 if (i41 == i29) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2398:
/*      */               
/*      */ 
/*      */ 
/*  671 */               if (i25 != 0) {
/*  672 */                 i37 = 0;
/*      */               } else {
/*      */                 break label2475;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               do
/*      */               {
/*  683 */                 i41 = i37 << 1;
/*  684 */                 i36 = i41 + 3;
/*  685 */                 MainMemory.setI64(paramInt3 + (i32 + i41 << 3), MainMemory.getI64(paramInt1 + (i37 << 3)));
/*  686 */                 i37 += 1;
/*  687 */               } while (i36 < i22);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               label2475:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  698 */               i39 += 1;
/*  699 */               if (i39 == i20) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label2501:
/*      */             
/*      */ 
/*      */ 
/*  710 */             i27 = i22 > 0 ? 1 : 0;
/*  711 */             if (i27 == 0) {
/*      */               break label2899;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  721 */             i29 = i20 + 1 >> 1;
/*  722 */             bool = i29 < i20;
/*  723 */             i28 = i20 - i29;
/*  724 */             i39 = i29 + -1;
/*  725 */             i25 = i39 > -1 ? 1 : 0;
/*  726 */             i26 = i20 > 1 ? 1 : 0;
/*  727 */             i30 = i2 * i39;
/*  728 */             i31 = i2 * i29;
/*  729 */             i39 = i6 * i39;
/*  730 */             i32 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  737 */               i33 = i31 + i32;
/*  738 */               i37 = i39 + i32;
/*  739 */               i41 = i30 + i32;
/*  740 */               i36 = i2 + i32;
/*  741 */               if (bool) {
/*  742 */                 i34 = 0;
/*      */               } else {
/*      */                 break label2720;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  753 */                 MainMemory.setI64(paramInt1 + (i34 << 3), MainMemory.getI64(paramInt3 + (i33 + i2 * i34 << 3)));
/*  754 */                 i34 += 1;
/*  755 */                 if (i34 == i28) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2720:
/*      */               
/*      */ 
/*      */ 
/*  766 */               if (i25 != 0) {
/*  767 */                 i33 = 0;
/*      */               } else {
/*      */                 break label2797;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  778 */                 MainMemory.setI64(paramInt3 + (i37 + i14 * i33 << 3), MainMemory.getI64(paramInt3 + (i41 + i33 * i15 << 3)));
/*  779 */                 i33 += 1;
/*  780 */                 if (i33 == i29) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2797:
/*      */               
/*      */ 
/*      */ 
/*  791 */               if (i26 != 0) {
/*  792 */                 i41 = 0;
/*      */               } else {
/*      */                 break label2873;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               do
/*      */               {
/*  803 */                 i37 = (i41 << 1) + 3;
/*  804 */                 MainMemory.setI64(paramInt3 + (i36 + i6 * i41 << 3), MainMemory.getI64(paramInt1 + (i41 << 3)));
/*  805 */                 i41 += 1;
/*  806 */               } while (i37 < i20);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               label2873:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  817 */               i32 += 1;
/*  818 */               if (i32 == i22) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label2899:
/*      */             
/*      */ 
/*      */ 
/*  829 */             if (i4 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  839 */               i29 = i20 + -2;
/*  840 */               bool = i29 > 2;
/*  841 */               if ((bool) && (i27 != 0)) {
/*  842 */                 i30 = 0;
/*      */               } else {
/*      */                 break label3340;
/*      */               }
/*      */               
/*      */ 
/*      */               label3294:
/*      */               
/*      */ 
/*      */               do
/*      */               {
/*  853 */                 i31 = i6 * i30;
/*  854 */                 i39 = i7 + i31;
/*  855 */                 i32 = i6 + i31;
/*  856 */                 i36 = i11 + i31;
/*  857 */                 i28 = (i30 << 1) + 4;
/*  858 */                 i41 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 do
/*      */                 {
/*  865 */                   i33 = i41 << 1;
/*  866 */                   i42 = paramInt3 + (i36 + i33 << 3);
/*  867 */                   i37 = i33 + 2;
/*  868 */                   l13 = MainMemory.getI64(paramInt3 + (i31 + i33 << 3));
/*  869 */                   l12 = MainMemory.getI64(paramInt3 + (i32 + i33 << 3));
/*  870 */                   l16 = MainMemory.getI64(paramInt3 + (i39 + i33 << 3));
/*  871 */                   l11 = l16 - l13;
/*  872 */                   l13 = l12 - l13;
/*  873 */                   l16 -= l12;
/*  874 */                   l12 = l13 <= l16 ? l13 : l16;
/*  875 */                   l12 = l12 < 0L ? 0L : l12 << 2;
/*  876 */                   l13 = l13 >= l16 ? l13 : l16;
/*  877 */                   l13 = l13 > 0L ? 0L : l13 << 2;
/*  878 */                   if (l13 >= l12) {
/*      */                     break label3294;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  888 */                   l12 = l12 <= l11 ? l12 : l11;
/*  889 */                   l11 = MainMemory.getI64(i42);
/*  890 */                   l13 = (l12 >= l13 ? l12 : l13) - (l11 << 3);
/*  891 */                   l13 = (l13 > -1L ? l13 : l13 + 7L) >> 3;
/*  892 */                   l13 = l1 <= l13 ? l1 : l13;
/*  893 */                   MainMemory.setI64(i42, (l13 <= l2 ? l2 : l13) + l11);
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  899 */                   i41 += 1;
/*  900 */                 } while (i37 < i22);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  911 */                 i30 += 1;
/*  912 */               } while (i29 > i28);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               label3340:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  923 */               if (i24 == 0) {
/*      */                 break label3377;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  933 */               fits_hdecompress64_1481.call(l1, i20, paramInt3, i6, i22, l2);
/*      */               
/*      */ 
/*      */               label3377:
/*      */               
/*      */ 
/*  939 */               fits_hdecompress64_1480.call(i13, bool, i10, i22, l2, i8, l1, i29, i9, paramInt3, i7, i6, i12);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  945 */             i28 = i20 % 2;
/*  946 */             i29 = i22 % 2;
/*  947 */             i30 = i20 - i28;
/*  948 */             if (i30 <= 0)
/*      */             {
/*      */ 
/*      */ 
/*  952 */               i31 = 0;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  959 */               i31 = i22 - i29;
/*  960 */               i24 = i31 > 0 ? 1 : 0;
/*  961 */               l11 = i23 & 0xFFFFFFFF;
/*  962 */               bool = i29 == 0;
/*  963 */               i32 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  970 */                 i33 = i6 * i32;
/*  971 */                 i34 = i5 + i33;
/*  972 */                 i35 = paramInt2 + i33;
/*  973 */                 i36 = i2 + i33;
/*  974 */                 i37 = i33 + 2;
/*  975 */                 i38 = i33 | 0x1;
/*  976 */                 i39 = (i32 << 1) + 2;
/*  977 */                 if (i24 != 0) {
/*  978 */                   i40 = 0;
/*      */                 }
/*      */                 else
/*      */                 {
/*  982 */                   i37 = i33;
/*      */                   
/*      */                   break label3986;
/*      */                 }
/*      */                 
/*      */                 label3836:
/*      */                 label3863:
/*      */                 do
/*      */                 {
/*  991 */                   i41 = i40 << 1;
/*  992 */                   i42 = paramInt3 + (i35 + i41 << 3);
/*  993 */                   i43 = paramInt3 + (i36 + i41 << 3);
/*  994 */                   i44 = paramInt3 + (i38 + i41 << 3);
/*  995 */                   i45 = paramInt3 + (i33 + i41 << 3);
/*  996 */                   i46 = i41 + 2;
/*  997 */                   l12 = MainMemory.getI64(i45);
/*  998 */                   l16 = MainMemory.getI64(i43);
/*  999 */                   l17 = MainMemory.getI64(i44);
/* 1000 */                   l13 = MainMemory.getI64(i42);
/* 1001 */                   l16 = (l16 > -1L ? l6 : l3) + l16 & l5;
/* 1002 */                   l17 = (l17 > -1L ? l6 : l3) + l17 & l5;
/* 1003 */                   l13 = (l13 > -1L ? l9 : l10) + l13 & l4;
/* 1004 */                   l14 = l13 & l8;
/* 1005 */                   l15 = 0L - l14;
/* 1006 */                   l16 = (l16 > -1L ? l15 : l14) + l16;
/* 1007 */                   l17 = (l17 > -1L ? l15 : l14) + l17;
/* 1008 */                   l15 = (l16 ^ l13 ^ l17) & l7;
/* 1009 */                   if (l12 <= -1L) {
/*      */                     break label3836;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1019 */                   l12 = l14 + l12 - l15;
/*      */                   
/*      */ 
/*      */                   break label3863;
/*      */                   
/*      */ 
/* 1025 */                   l12 = (l14 == 0L ? l15 : l14 - l15) + l12;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1033 */                   l14 = l17 + l13;
/* 1034 */                   MainMemory.setI64(i42, l14 + l16 + l12 >> (int)l11);
/* 1035 */                   MainMemory.setI64(i43, l16 - l14 + l12 >> (int)l11);
/* 1036 */                   MainMemory.setI64(i44, l17 - (l16 + l13) + l12 >> (int)l11);
/* 1037 */                   MainMemory.setI64(i45, l13 - l16 - l17 + l12 >> (int)l11);
/* 1038 */                   i40 += 1;
/* 1039 */                 } while (i31 > i46);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1050 */                 i36 = i34 + i41;
/* 1051 */                 i37 += i41;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label3986:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1061 */                 if (!bool)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1071 */                   i42 = paramInt3 + (i37 << 3);
/* 1072 */                   l13 = MainMemory.getI64(i42);
/* 1073 */                   i43 = paramInt3 + (i36 << 3);
/* 1074 */                   l12 = MainMemory.getI64(i43);
/* 1075 */                   l12 = (l12 > -1L ? l6 : l3) + l12 & l5;
/* 1076 */                   l16 = l12 & l7;
/* 1077 */                   l13 = (l13 > -1L ? 0L - l16 : l16) + l13;
/* 1078 */                   MainMemory.setI64(i43, l13 + l12 >> (int)l11);
/* 1079 */                   MainMemory.setI64(i42, l13 - l12 >> (int)l11);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1085 */                 i32 += 1;
/* 1086 */                 if (i30 <= i39)
/*      */                   break;
/*      */               }
/*      */               break label4148;
/* 1090 */               i31 = i39;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label4148:
/*      */             
/*      */ 
/*      */ 
/* 1099 */             if (i28 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1109 */               i28 = i31 * i2;
/* 1110 */               i30 = i22 - i29;
/* 1111 */               if (i30 <= 0) {
/*      */                 break label4392;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1122 */               l11 = i23 & 0xFFFFFFFF;
/* 1123 */               i31 = i2 * i31;
/* 1124 */               i39 = i31 + 1;
/* 1125 */               i37 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               do
/*      */               {
/* 1132 */                 i32 = i37 << 1;
/* 1133 */                 i36 = i32 + 2;
/* 1134 */                 i42 = paramInt3 + (i39 + i32 << 3);
/* 1135 */                 i43 = paramInt3 + (i31 + i32 << 3);
/* 1136 */                 l13 = MainMemory.getI64(i43);
/* 1137 */                 l12 = MainMemory.getI64(i42);
/* 1138 */                 l12 = (l12 > -1L ? l6 : l3) + l12 & l5;
/* 1139 */                 l16 = l12 & l7;
/* 1140 */                 l13 = (l13 > -1L ? 0L - l16 : l16) + l13;
/* 1141 */                 MainMemory.setI64(i42, l13 + l12 >> (int)l11);
/* 1142 */                 MainMemory.setI64(i43, l13 - l12 >> (int)l11);
/* 1143 */                 i37 += 1;
/* 1144 */               } while (i30 > i36);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1155 */               i28 = i28 + 2 + i32;
/*      */               
/*      */ 
/*      */ 
/*      */               label4392:
/*      */               
/*      */ 
/*      */ 
/* 1163 */               if (i29 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1173 */                 i42 = paramInt3 + (i28 << 3);
/* 1174 */                 MainMemory.setI64(i42, MainMemory.getI64(i42) >> (int)(i23 & 0xFFFFFFFF));
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/* 1180 */             i20 <<= 1;
/* 1181 */             i22 <<= 1;
/* 1182 */             l5 = l4 >> 1;
/* 1183 */             l13 = l8 >> 1;
/* 1184 */             i17 += 1;
/* 1185 */             if (i17 == i16) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/* 1190 */             l11 = l9;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1196 */             l3 = l10;
/*      */             
/* 1198 */             l4 = l5;
/* 1199 */             l5 = l4;
/* 1200 */             l6 = l9;
/* 1201 */             l7 = l8;
/* 1202 */             l8 = l13;
/*      */           }
/*      */           
/*      */ 
/*      */           label4517:
/*      */           
/*      */ 
/* 1209 */           free.call(paramInt1);
/* 1210 */           paramInt2 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */           label4528:
/*      */           
/*      */ 
/* 1217 */           MainMemory.setI32(paramInt7, paramInt2);
/* 1218 */           i2 = MainMemory.getI32(paramInt5);
/* 1219 */           i3 = MainMemory.getI32(paramInt4);
/* 1220 */           if (i3 * i2 <= 0) {
/*      */             break label4644;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1231 */           paramInt2 = i2 * i3;
/* 1232 */           i2 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1239 */             MainMemory.setI32(j + (i2 << 2), (int)MainMemory.getI64(paramInt3 + (i2 << 3)));
/* 1240 */             i2 += 1;
/* 1241 */             if (i2 == paramInt2) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1252 */           i = MainMemory.getI32(paramInt7);
/*      */           
/*      */           break label4681;
/*      */         }
/*      */       }
/*      */       
/*      */       label4644:
/*      */       
/* 1260 */       i = paramInt2;
/*      */       
/*      */ 
/*      */       break label4681;
/*      */       
/*      */       label4657:
/*      */       
/* 1267 */       ffxmsg.call(5, 57120);
/* 1268 */       MainMemory.setI32(paramInt7, 414);
/* 1269 */       i = 414;
/*      */       
/*      */ 
/*      */       label4681:
/*      */       
/*      */ 
/* 1275 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1280 */       MainMemory.dealloc_generated(i47);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hdecompress64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */