/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ 
/*      */ public final class fits_hcompress extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3647;
/*   16 */   public static final Function _instance = new fits_hcompress();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public fits_hcompress() { super("fits_hcompress", 7, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*   24 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   30 */     paramInt4 += 2;
/*   31 */     paramInt3--;
/*   32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   33 */     paramInt4 += 2;
/*   34 */     paramInt3--;
/*   35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   36 */     paramInt4 += 2;
/*   37 */     paramInt3--;
/*   38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   39 */     paramInt4 += 2;
/*   40 */     paramInt3--;
/*   41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   42 */     paramInt4 += 2;
/*   43 */     paramInt3--;
/*   44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   45 */     paramInt4 += 2;
/*   46 */     paramInt3--;
/*   47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   48 */     paramInt4 += 2;
/*   49 */     paramInt3--;
/*   50 */     call(i, j, k, m, n, i1, i2);
/*   51 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*      */   {
/*   57 */     int i = 0;
/*   58 */     int j = 0;
/*   59 */     float f = 0.0F;
/*   60 */     double d = 0.0D;
/*   61 */     int k = 0;
/*   62 */     int m = 0;
/*   63 */     int n = 0;
/*   64 */     int i1 = 0;
/*   65 */     int i2 = 0;
/*   66 */     int i3 = 0;
/*   67 */     int i4 = 0;
/*   68 */     int i5 = 0;
/*   69 */     int i6 = 0;
/*   70 */     int i7 = 0;
/*   71 */     int i8 = 0;
/*   72 */     int i9 = 0;
/*   73 */     int i10 = 0;
/*   74 */     int i11 = 0;
/*   75 */     int i12 = 0;
/*   76 */     int i13 = 0;
/*   77 */     int i14 = 0;
/*   78 */     int i15 = 0;
/*   79 */     int i16 = 0;
/*   80 */     int i17 = 0;
/*   81 */     int i18 = 0;
/*   82 */     int i19 = 0;
/*   83 */     int i20 = 0;
/*   84 */     int i21 = 0;
/*   85 */     int i22 = 0;
/*   86 */     int i23 = 0;
/*   87 */     int i24 = 0;
/*   88 */     int i25 = 0;
/*   89 */     int i26 = 0;
/*   90 */     int i27 = 0;
/*   91 */     int i28 = 0;
/*   92 */     int i29 = 0;
/*   93 */     int i30 = 0;
/*   94 */     int i31 = 0;
/*   95 */     int i32 = 0;
/*   96 */     int i33 = 0;
/*   97 */     int i34 = 0;
/*   98 */     int i35 = 0;
/*   99 */     int i36 = 0;
/*  100 */     int i37 = 0;
/*  101 */     int i38 = 0;
/*  102 */     int i39 = 0;
/*  103 */     long l = 0L;
/*  104 */     int i40 = 0;
/*  105 */     int i41 = 0;
/*  106 */     int i42 = 0;
/*  107 */     int i43 = 0;
/*      */     
/*      */ 
/*  110 */     int i44 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  114 */       i = MainMemory.alloc(8);
/*  115 */       j = MainMemory.alloc(12);
/*  116 */       if (MainMemory.getI32(paramInt7) <= 0) {
/*      */         break label203;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label3966;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label203:
/*      */       
/*      */ 
/*      */ 
/*  132 */       m = paramInt2 >= paramInt3 ? paramInt2 : paramInt3;
/*  133 */       f = m;
/*  134 */       d = f;
/*  135 */       d = SystemLibrary.log(d);
/*  136 */       d /= SystemLibrary.log(2.0D);
/*  137 */       d += 0.5D;
/*  138 */       i4 = (int)d;
/*  139 */       k = malloc.call((m + 1) / 2 << 2);
/*  140 */       if (k != 0) {
/*      */         break label311;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  150 */       ffxmsg.call(5, 72800);
/*  151 */       MainMemory.setI32(paramInt7, 413);
/*      */       
/*      */ 
/*      */       break label3966;
/*      */       
/*      */       label311:
/*      */       
/*  158 */       i6 = 1 << i4 < m ? 1 : 0;
/*  159 */       if (i6 + i4 <= 0) {
/*      */         break label2069;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  169 */       m = paramInt2 << 1;
/*  170 */       n = paramInt2 + 1;
/*  171 */       i1 = paramInt2 + 2;
/*  172 */       i2 = i4 + i6;
/*  173 */       i3 = 1;
/*  174 */       i4 = 2;
/*  175 */       i5 = 1;
/*  176 */       i6 = -4;
/*  177 */       i7 = paramInt3;
/*  178 */       i8 = paramInt2;
/*  179 */       i9 = 0;
/*  180 */       i10 = -2;
/*  181 */       i11 = 0;
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
/*      */       for (;;)
/*      */       {
/*  196 */         i12 = i7 % 2;
/*  197 */         i13 = i8 % 2;
/*  198 */         i14 = i7 - i12;
/*  199 */         if (i14 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  203 */           i14 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  210 */           i15 = i8 - i13;
/*  211 */           i16 = i15 > 0 ? 1 : 0;
/*  212 */           i17 = i13 == 0 ? 1 : 0;
/*  213 */           i18 = 1 - i11;
/*  214 */           i19 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  221 */             i20 = m * i19;
/*  222 */             i21 = n + i20;
/*  223 */             i22 = i20 + paramInt2;
/*  224 */             i23 = i20 | 0x1;
/*  225 */             i24 = i1 + i20;
/*  226 */             i25 = i20 + 2;
/*  227 */             i26 = (i19 << 1) + 2;
/*  228 */             i33 = i19 * m;
/*  229 */             i28 = i33 + paramInt2;
/*  230 */             if (i16 != 0) {
/*  231 */               i27 = 0;
/*      */             }
/*      */             else
/*      */             {
/*  235 */               i25 = i33;
/*  236 */               i20 = i28;
/*      */               
/*      */ 
/*      */               break label843;
/*      */             }
/*      */             
/*      */             do
/*      */             {
/*  244 */               i28 = i27 << 1;
/*  245 */               i29 = paramInt1 + (i21 + i28 << 2);
/*  246 */               i30 = paramInt1 + (i22 + i28 << 2);
/*  247 */               i31 = paramInt1 + (i23 + i28 << 2);
/*  248 */               i32 = paramInt1 + (i20 + i28 << 2);
/*  249 */               i33 = i28 + 2;
/*  250 */               i34 = MainMemory.getI32(i29);
/*  251 */               i35 = MainMemory.getI32(i30);
/*  252 */               i36 = MainMemory.getI32(i31);
/*  253 */               i37 = MainMemory.getI32(i32);
/*  254 */               i39 = i35 + i34;
/*  255 */               i38 = i39 + i36 + i37 >> i11;
/*  256 */               i39 = i39 - i36 - i37 >> i11;
/*  257 */               i34 -= i35;
/*  258 */               i35 = i34 + i36 - i37 >> i11;
/*  259 */               MainMemory.setI32(i29, i34 - i36 + i37 >> i11);
/*  260 */               MainMemory.setI32(i30, (i39 > -1 ? i5 : 0) + i39 & i10);
/*  261 */               MainMemory.setI32(i31, (i35 > -1 ? i5 : 0) + i35 & i10);
/*  262 */               MainMemory.setI32(i32, (i38 > -1 ? i4 : i3) + i38 & i6);
/*  263 */               i27 += 1;
/*  264 */             } while (i15 > i33);
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
/*  275 */             i20 = i28 + i24;
/*  276 */             i25 = i28 + i25;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label843:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  286 */             if (i17 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  296 */               i29 = paramInt1 + (i20 << 2);
/*  297 */               i20 = MainMemory.getI32(i29);
/*  298 */               i30 = paramInt1 + (i25 << 2);
/*  299 */               i21 = MainMemory.getI32(i30);
/*  300 */               i25 = i21 + i20 << i18;
/*  301 */               i20 = i20 - i21 << i18;
/*  302 */               MainMemory.setI32(i29, (i20 > -1 ? i5 : 0) + i20 & i10);
/*  303 */               MainMemory.setI32(i30, (i25 > -1 ? i4 : i3) + i25 & i6);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  309 */             i19 += 1;
/*  310 */             if (i14 <= i26)
/*      */               break;
/*      */           }
/*      */           break label990;
/*  314 */           i14 = i26;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label990:
/*      */         
/*      */ 
/*      */ 
/*  323 */         if (i12 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  333 */           i12 = i14 * paramInt2;
/*  334 */           i14 = i8 - i13;
/*  335 */           if (i14 <= 0)
/*      */           {
/*      */ 
/*      */ 
/*  339 */             i5 = i12;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  346 */             i15 = 1 - i11;
/*  347 */             i18 = i12 + 1;
/*  348 */             i25 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             do
/*      */             {
/*  355 */               i26 = i25 << 1;
/*  356 */               i19 = i26 + 2;
/*  357 */               i29 = paramInt1 + (i18 + i26 << 2);
/*  358 */               i30 = paramInt1 + (i12 + i26 << 2);
/*  359 */               i21 = MainMemory.getI32(i29);
/*  360 */               i22 = MainMemory.getI32(i30);
/*  361 */               i20 = i22 + i21 << i15;
/*  362 */               i21 = i21 - i22 << i15;
/*  363 */               MainMemory.setI32(i29, (i21 > -1 ? i5 : 0) + i21 & i10);
/*  364 */               MainMemory.setI32(i30, (i20 > -1 ? i4 : i3) + i20 & i6);
/*  365 */               i25 += 1;
/*  366 */             } while (i14 > i19);
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
/*  377 */             i5 = i12 + 2 + i26;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  385 */           if (i13 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  395 */             i29 = paramInt1 + (i5 << 2);
/*  396 */             i5 = MainMemory.getI32(i29) << 2 - i11;
/*  397 */             MainMemory.setI32(i29, (i5 > -1 ? i4 : i3) + i5 & i6);
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  403 */         if (i7 <= 0) {
/*      */           break label1634;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  413 */         i16 = i8 > 1 ? 1 : 0;
/*  414 */         i17 = i8 > 2 ? 1 : 0;
/*  415 */         i3 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  422 */           i5 = i3 * paramInt2;
/*  423 */           i11 = i5 + 1;
/*  424 */           i13 = i5 + 2;
/*  425 */           if (i16 != 0) {
/*  426 */             i12 = 0;
/*      */           } else {
/*      */             break label1424;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  437 */             i14 = i12 << 1;
/*  438 */             i10 = i14 + 3;
/*  439 */             MainMemory.setI32(k + (i12 << 2), MainMemory.getI32(paramInt1 + (i11 + i14 << 2)));
/*  440 */             i12 += 1;
/*  441 */           } while (i10 < i8);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1424:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  452 */           if (i17 != 0) {
/*  453 */             i10 = 0;
/*      */           }
/*      */           else
/*      */           {
/*  457 */             i11 = 1;
/*      */             
/*      */ 
/*      */             break label1522;
/*      */           }
/*      */           
/*      */           for (;;)
/*      */           {
/*  465 */             i14 = i10 << 1;
/*  466 */             i12 = i14 + 4;
/*  467 */             MainMemory.setI32(paramInt1 + (i11 + i10 << 2), MainMemory.getI32(paramInt1 + (i13 + i14 << 2)));
/*  468 */             i14 = i10 + 1;
/*  469 */             if (i12 >= i8) break;
/*  470 */             i10 = i14;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  480 */           i11 = i10 + 2;
/*      */           
/*      */ 
/*      */ 
/*      */           label1522:
/*      */           
/*      */ 
/*      */ 
/*  488 */           if (i16 == 0) {
/*      */             break label1608;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  498 */           i5 = i11 + i5;
/*  499 */           i13 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  506 */             i11 = (i13 << 1) + 3;
/*  507 */             MainMemory.setI32(paramInt1 + (i5 + i13 << 2), MainMemory.getI32(k + (i13 << 2)));
/*  508 */             i13 += 1;
/*  509 */           } while (i11 < i8);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1608:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  520 */           i3 += 1;
/*  521 */           if (i3 == i7) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1634:
/*      */         
/*      */ 
/*      */ 
/*  532 */         if (i8 <= 0) {
/*      */           break label1990;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  542 */         i16 = i7 > 1 ? 1 : 0;
/*  543 */         i17 = i7 > 2 ? 1 : 0;
/*  544 */         i3 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  551 */           i5 = i3 + paramInt2;
/*  552 */           i11 = m + i3;
/*  553 */           if (i16 != 0) {
/*  554 */             i10 = 0;
/*      */           } else {
/*      */             break label1776;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  565 */             i13 = (i10 << 1) + 3;
/*  566 */             MainMemory.setI32(k + (i10 << 2), MainMemory.getI32(paramInt1 + (i5 + m * i10 << 2)));
/*  567 */             i10 += 1;
/*  568 */           } while (i13 < i7);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1776:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  579 */           if (i17 != 0) {
/*  580 */             i12 = 0;
/*      */           }
/*      */           else
/*      */           {
/*  584 */             i5 = paramInt2;
/*      */             
/*      */ 
/*      */             break label1876;
/*      */           }
/*      */           
/*      */           do
/*      */           {
/*  592 */             i13 = i12 * paramInt2;
/*  593 */             i10 = (i12 << 1) + 4;
/*  594 */             MainMemory.setI32(paramInt1 + (i5 + i13 << 2), MainMemory.getI32(paramInt1 + (i11 + m * i12 << 2)));
/*  595 */             i12 += 1;
/*  596 */           } while (i10 < i7);
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
/*  607 */           i5 = i13 + m;
/*      */           
/*      */ 
/*      */ 
/*      */           label1876:
/*      */           
/*      */ 
/*      */ 
/*  615 */           if (i16 == 0) {
/*      */             break label1964;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  625 */           i5 += i3;
/*  626 */           i13 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  633 */             i11 = (i13 << 1) + 3;
/*  634 */             MainMemory.setI32(paramInt1 + (i5 + i13 * paramInt2 << 2), MainMemory.getI32(k + (i13 << 2)));
/*  635 */             i13 += 1;
/*  636 */           } while (i11 < i7);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1964:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  647 */           i3 += 1;
/*  648 */           if (i3 == i8) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1990:
/*      */         
/*      */ 
/*      */ 
/*  659 */         i5 = i4 << 1;
/*  660 */         i9 += 1;
/*  661 */         i3 = i5 + -1;
/*  662 */         i11 = i6 << 1;
/*  663 */         i7 = i7 + 1 >> 1;
/*  664 */         i8 = i8 + 1 >> 1;
/*  665 */         if (i9 == i2) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*  670 */         i4 = i5;
/*  671 */         i5 = i4;
/*  672 */         i6 = i11;
/*      */         
/*      */ 
/*      */ 
/*  676 */         i10 = i6;
/*  677 */         i11 = 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label2069:
/*      */       
/*      */ 
/*  684 */       free.call(k);
/*  685 */       if (paramInt4 >= 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  695 */         fits_hcompress_1464.call(paramInt3, paramInt1, paramInt2, paramInt4);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  701 */       m = MainMemory.getI32(paramInt6);
/*  702 */       MainMemory.setI32Aligned(459436, m);
/*  703 */       MainMemory.setI32(paramInt6, 0);
/*  704 */       MainMemory.setI32Aligned(459432, 0);
/*  705 */       i6 = paramInt3 * paramInt2;
/*  706 */       if (m >= 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  716 */         MainMemory.setI16(paramInt5, (short)39389);
/*  717 */         MainMemory.setI32Aligned(459432, 2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  723 */       F419940.call(paramInt5, paramInt3);
/*  724 */       F419940.call(paramInt5, paramInt2);
/*  725 */       F419940.call(paramInt5, paramInt4);
/*  726 */       paramInt4 = MainMemory.getI32(paramInt1);
/*  727 */       l = paramInt4;
/*  728 */       MainMemory.setI8(i + 7, (byte)paramInt4);
/*  729 */       MainMemory.setI8(i + 6, (byte)(int)(l >>> 8));
/*  730 */       MainMemory.setI8(i + 5, (byte)(int)(l >>> 16));
/*  731 */       MainMemory.setI8(i + 4, (byte)(int)(l >>> 24));
/*  732 */       MainMemory.setI8(i + 3, (byte)(int)(l >>> 32));
/*  733 */       MainMemory.setI8(i + 2, (byte)(int)(l >>> 40));
/*  734 */       MainMemory.setI8(i + 1, (byte)(int)(l >>> 48));
/*  735 */       MainMemory.setI8(i, (byte)(int)(l >>> 56));
/*  736 */       n = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  743 */         paramInt4 = MainMemory.getI32Aligned(459432);
/*  744 */         i1 = paramInt4 + 1;
/*  745 */         if (i1 <= m)
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
/*  756 */           MainMemory.setI8(paramInt5 + paramInt4, MainMemory.getI8(i + n));
/*  757 */           MainMemory.setI32Aligned(459432, i1);
/*  758 */           paramInt4 = i1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  765 */         n += 1;
/*  766 */         if (n == 8) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  777 */       MainMemory.setI32(paramInt1, 0);
/*  778 */       k = malloc.call((i6 + 7) / 8);
/*  779 */       if (k != 0) {
/*      */         break label2449;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  789 */       ffxmsg.call(5, 72832);
/*  790 */       paramInt2 = 413;
/*      */       
/*      */       break label3955;
/*      */       
/*      */       label2449:
/*  795 */       MainMemory.setI8(k, (byte)0);
/*  796 */       i16 = i6 > 0 ? 1 : 0;
/*  797 */       if (i16 != 0) {
/*  798 */         i4 = 0;
/*  799 */         i2 = 8;
/*  800 */         i1 = 0;
/*  801 */         i7 = 0;
/*      */       }
/*      */       else
/*      */       {
/*  805 */         n = 0;
/*      */         
/*      */ 
/*      */ 
/*      */         break label2798;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  816 */         n = i7 + 1;
/*  817 */         i29 = paramInt1 + (n << 2);
/*  818 */         i30 = paramInt1 + (i7 << 2);
/*  819 */         if (i4 <= 0) {
/*      */           break label2578;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  829 */         i40 = k + i1;
/*  830 */         MainMemory.setI8(i40, MathUtils.shl(MainMemory.getI8(i40), 1));
/*  831 */         i4 = i2 + -1;
/*      */         
/*      */         break label2649;
/*      */         
/*      */         label2578:
/*      */         
/*  837 */         if (i4 >= 0)
/*      */         {
/*      */ 
/*      */ 
/*  841 */           i4 = i2;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  848 */           i40 = k + i1;
/*  849 */           MainMemory.setI8(i40, MathUtils.or(MathUtils.shl(MainMemory.getI8(i40), 1), (byte)1));
/*  850 */           i2 += -1;
/*  851 */           MainMemory.setI32(i30, 0 - i4);
/*  852 */           i4 = i2;
/*      */         }
/*      */         
/*      */ 
/*      */         label2649:
/*      */         
/*      */ 
/*  859 */         if (i4 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  864 */           i2 = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  871 */           i1 += 1;
/*  872 */           MainMemory.setI8(k + i1, (byte)0);
/*      */           
/*  874 */           i2 = 8;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  882 */         if (n != i6) {
/*      */           break label2777;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  892 */         if (i2 == 8) {
/*  893 */           n = i1;
/*  894 */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  903 */         i40 = k + i1;
/*  904 */         MainMemory.setI8(i40, (byte)((MainMemory.getI8(i40) & 0xFF) << i2));
/*  905 */         n = i1 + 1;
/*      */         
/*  907 */         break;
/*      */         
/*      */         label2777:
/*      */         
/*  911 */         i4 = MainMemory.getI32(i29);
/*      */         
/*      */ 
/*      */ 
/*  915 */         i7 = n;
/*      */       }
/*      */       
/*      */ 
/*      */       label2798:
/*      */       
/*  921 */       MainMemory.setI32(j, 0);
/*  922 */       i30 = j + 4;
/*  923 */       MainMemory.setI32(i30, 0);
/*  924 */       i29 = j + 8;
/*  925 */       MainMemory.setI32(i29, 0);
/*  926 */       i1 = (paramInt3 + 1) / 2;
/*  927 */       i4 = (paramInt2 + 1) / 2;
/*  928 */       if (i16 != 0) {
/*  929 */         i7 = 0;
/*  930 */         i8 = 0;
/*  931 */         i9 = 0;
/*      */       }
/*      */       else
/*      */       {
/*  935 */         i41 = 0;
/*  936 */         i6 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */         break label3130;
/*      */       }
/*      */       
/*      */ 
/*      */       for (;;)
/*      */       {
/*  946 */         i2 = i9 + 1;
/*  947 */         i31 = j + ((i8 >= i4 ? 1 : 0) + (i7 >= i1 ? 1 : 0) << 2);
/*  948 */         i9 = MainMemory.getI32(paramInt1 + (i9 << 2));
/*  949 */         if (MainMemory.getI32(i31) >= i9) {
/*      */           break label2960;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  959 */         MainMemory.setI32(i31, i9);
/*      */         
/*      */ 
/*      */         label2960:
/*      */         
/*      */ 
/*  965 */         i8 += 1;
/*  966 */         i16 = i8 < paramInt2 ? 1 : 0;
/*  967 */         if (i2 != i6) {
/*      */           break label3086;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  977 */         i6 = MainMemory.getI32(j);
/*  978 */         if (i6 > 0) {
/*  979 */           i41 = 0;
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*  984 */           i41 = 0;
/*  985 */           i6 = 0;
/*  986 */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         do
/*      */         {
/*  994 */           i6 >>= 1;
/*  995 */           i41 = (byte)(i41 + 1);
/*  996 */         } while (i6 > 0);
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
/* 1008 */         MainMemory.setI32(j, i6);
/* 1009 */         i6 = i41 & 0xFF;
/*      */         
/*      */ 
/* 1012 */         break;
/*      */         
/*      */         label3086:
/*      */         
/* 1016 */         i8 = i16 != 0 ? i8 : 0;
/* 1017 */         i7 = ((i16 != 0 ? 1 : 0) ^ 0x1) + i7;
/*      */         
/*      */ 
/* 1020 */         i9 = i2;
/*      */       }
/*      */       
/*      */ 
/*      */       label3130:
/*      */       
/*      */ 
/* 1027 */       i2 = MainMemory.getI32(i30);
/* 1028 */       if (i2 > 0) {
/* 1029 */         i42 = 0;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/* 1034 */         i42 = 0;
/*      */         
/*      */ 
/*      */         break label3201;
/*      */       }
/*      */       
/*      */ 
/*      */       do
/*      */       {
/* 1043 */         i2 >>= 1;
/* 1044 */         i42 = (byte)(i42 + 1);
/* 1045 */       } while (i2 > 0);
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
/* 1057 */       MainMemory.setI32(i30, i2);
/*      */       
/*      */ 
/*      */ 
/*      */       label3201:
/*      */       
/*      */ 
/*      */ 
/* 1065 */       i2 = MainMemory.getI32(i29);
/* 1066 */       if (i2 > 0) {
/* 1067 */         i43 = 0;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/* 1072 */         i43 = 0;
/* 1073 */         i2 = 0;
/*      */         
/*      */ 
/*      */         break label3283;
/*      */       }
/*      */       
/*      */ 
/*      */       do
/*      */       {
/* 1082 */         i2 >>= 1;
/* 1083 */         i43 = (byte)(i43 + 1);
/* 1084 */       } while (i2 > 0);
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
/* 1096 */       MainMemory.setI32(i29, i2);
/* 1097 */       i2 = i43 & 0xFF;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label3283:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1107 */       i7 = paramInt4 + 3;
/* 1108 */       if (i7 <= m) {
/*      */         break label3334;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1118 */       MainMemory.setI32(paramInt6, paramInt4);
/* 1119 */       ffxmsg.call(5, 78624);
/* 1120 */       paramInt2 = 413;
/*      */       
/*      */       break label3955;
/*      */       
/*      */       label3334:
/* 1125 */       MainMemory.setI8(paramInt5 + paramInt4, i41);
/* 1126 */       MainMemory.setI8(paramInt5 + (paramInt4 + 1), i42);
/* 1127 */       MainMemory.setI8(paramInt5 + (paramInt4 + 2), i43);
/* 1128 */       MainMemory.setI32Aligned(459432, i7);
/* 1129 */       MainMemory.setI32Aligned(459424, 0);
/* 1130 */       MainMemory.setI32Aligned(459428, 8);
/* 1131 */       MainMemory.setI64Aligned(467236, 0L);
/* 1132 */       paramInt4 = F419536.call(paramInt5, paramInt1, paramInt2, i1, i4, i6);
/* 1133 */       if (paramInt4 != 0) {
/*      */         break label3451;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1144 */       paramInt4 = F419536.call(paramInt5, paramInt1 + (i4 << 2), paramInt2, i1, paramInt2 / 2, i42 & 0xFF);
/*      */       
/*      */ 
/*      */ 
/*      */       label3451:
/*      */       
/*      */ 
/*      */ 
/* 1152 */       if (paramInt4 != 0) {
/*      */         break label3499;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1163 */       paramInt4 = F419536.call(paramInt5, paramInt1 + (i1 * paramInt2 << 2), paramInt2, paramInt3 / 2, i4, i42 & 0xFF);
/*      */       
/*      */ 
/*      */ 
/*      */       label3499:
/*      */       
/*      */ 
/*      */ 
/* 1171 */       if (paramInt4 != 0)
/*      */       {
/*      */ 
/*      */ 
/* 1175 */         paramInt2 = paramInt4;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/* 1182 */         paramInt2 = F419536.call(paramInt5, paramInt1 + (i1 * paramInt2 + i4 << 2), paramInt2, paramInt3 / 2, paramInt2 / 2, i2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1190 */       paramInt3 = MainMemory.getI32Aligned(459424) << 4;
/* 1191 */       MainMemory.setI32Aligned(459424, paramInt3);
/* 1192 */       paramInt4 = MainMemory.getI32Aligned(459428);
/* 1193 */       m = paramInt4 + -4;
/* 1194 */       MainMemory.setI32Aligned(459428, m);
/* 1195 */       if (m >= 1)
/*      */       {
/*      */ 
/*      */ 
/* 1199 */         paramInt4 = m;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/* 1206 */         m = MainMemory.getI32Aligned(459432);
/* 1207 */         MainMemory.setI8(paramInt5 + m, (byte)(paramInt3 >> 4 - paramInt4));
/* 1208 */         if (m >= MainMemory.getI32Aligned(459436)) {
/*      */           break label3662;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1218 */         MainMemory.setI32Aligned(459432, m + 1);
/*      */         
/*      */ 
/*      */         label3662:
/*      */         
/*      */ 
/* 1224 */         paramInt4 += 4;
/* 1225 */         MainMemory.setI32Aligned(459428, paramInt4);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1233 */       l = MainMemory.getI64Aligned(467236) + 4L;
/* 1234 */       MainMemory.setI64Aligned(467236, l);
/* 1235 */       if (paramInt4 >= 8) {
/*      */         break label3785;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1245 */       m = MainMemory.getI32Aligned(459432);
/* 1246 */       MainMemory.setI8(paramInt5 + m, (byte)(paramInt3 << paramInt4));
/* 1247 */       if (m >= MainMemory.getI32Aligned(459436)) {
/*      */         break label3770;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1257 */       MainMemory.setI32Aligned(459432, m + 1);
/*      */       
/*      */ 
/*      */       label3770:
/*      */       
/*      */ 
/* 1263 */       MainMemory.setI64Aligned(467236, paramInt4 + l);
/*      */       
/*      */ 
/*      */       label3785:
/*      */       
/*      */ 
/* 1269 */       if (n <= 0) {
/*      */         break label3904;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1279 */       paramInt3 = MainMemory.getI32Aligned(459432);
/* 1280 */       paramInt4 = paramInt3 + n;
/* 1281 */       if (paramInt4 <= MainMemory.getI32Aligned(459436))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1291 */         SystemLibrary.memcpy(paramInt5 + paramInt3, k, n, 1);
/* 1292 */         MainMemory.setI32Aligned(459432, paramInt4);
/* 1293 */         if (n != 0) {
/*      */           break label3904;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1303 */       free.call(k);
/* 1304 */       MainMemory.setI32(paramInt6, MainMemory.getI32Aligned(459432));
/* 1305 */       ffxmsg.call(5, 78624);
/* 1306 */       paramInt2 = 413;
/*      */       
/*      */       break label3955;
/*      */       
/*      */       label3904:
/* 1311 */       free.call(k);
/* 1312 */       paramInt3 = MainMemory.getI32Aligned(459432);
/* 1313 */       MainMemory.setI32(paramInt6, paramInt3);
/* 1314 */       if (paramInt3 >= MainMemory.getI32Aligned(459436))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1325 */         ffxmsg.call(5, 78624);
/* 1326 */         paramInt2 = 413;
/*      */       }
/*      */       
/*      */ 
/*      */       label3955:
/*      */       
/*      */ 
/* 1333 */       MainMemory.setI32(paramInt7, paramInt2);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3966:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1344 */       MainMemory.dealloc_generated(i44);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hcompress.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */