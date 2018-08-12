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
/*      */ public final class fits_hcompress64 extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3657;
/*   16 */   public static final Function _instance = new fits_hcompress64();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public fits_hcompress64() { super("fits_hcompress64", 7, false); }
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
/*   66 */     long l1 = 0L;
/*   67 */     long l2 = 0L;
/*   68 */     long l3 = 0L;
/*   69 */     long l4 = 0L;
/*   70 */     long l5 = 0L;
/*   71 */     int i3 = 0;
/*   72 */     int i4 = 0;
/*   73 */     int i5 = 0;
/*   74 */     int i6 = 0;
/*   75 */     int i7 = 0;
/*   76 */     int i8 = 0;
/*   77 */     int i9 = 0;
/*   78 */     int i10 = 0;
/*   79 */     int i11 = 0;
/*   80 */     long l6 = 0L;
/*   81 */     int i12 = 0;
/*   82 */     long l7 = 0L;
/*   83 */     int i13 = 0;
/*   84 */     int i14 = 0;
/*   85 */     int i15 = 0;
/*   86 */     int i16 = 0;
/*   87 */     int i17 = 0;
/*   88 */     int i18 = 0;
/*   89 */     int i19 = 0;
/*   90 */     int i20 = 0;
/*   91 */     int i21 = 0;
/*   92 */     int i22 = 0;
/*   93 */     int i23 = 0;
/*   94 */     int i24 = 0;
/*   95 */     int i25 = 0;
/*   96 */     int i26 = 0;
/*   97 */     int i27 = 0;
/*   98 */     long l8 = 0L;
/*   99 */     long l9 = 0L;
/*  100 */     long l10 = 0L;
/*  101 */     long l11 = 0L;
/*  102 */     long l12 = 0L;
/*  103 */     long l13 = 0L;
/*  104 */     int i28 = 0;
/*  105 */     int i29 = 0;
/*  106 */     int i30 = 0;
/*  107 */     int i31 = 0;
/*      */     
/*      */ 
/*  110 */     int i32 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  114 */       i = MainMemory.alloc(8);
/*  115 */       j = MainMemory.alloc(24);
/*  116 */       if (MainMemory.getI32(paramInt7) <= 0) {
/*      */         break label203;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label4038;
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
/*  138 */       i2 = (int)d;
/*  139 */       k = malloc.call((m + 1) / 2 << 3);
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
/*  150 */       ffxmsg.call(5, 75808);
/*  151 */       MainMemory.setI32(paramInt7, 413);
/*      */       
/*      */ 
/*      */       break label4038;
/*      */       
/*      */       label311:
/*      */       
/*  158 */       i3 = 1 << i2 < m ? 1 : 0;
/*  159 */       if (i3 + i2 <= 0) {
/*      */         break label2136;
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
/*  172 */       i2 += i3;
/*  173 */       l1 = -4L;
/*  174 */       l2 = -2L;
/*  175 */       l3 = 1L;
/*  176 */       l4 = 2L;
/*  177 */       l5 = 1L;
/*  178 */       i3 = paramInt3;
/*  179 */       i4 = paramInt2;
/*  180 */       i5 = 0;
/*  181 */       i6 = 0;
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
/*  196 */         i7 = i3 % 2;
/*  197 */         i8 = i4 % 2;
/*  198 */         i9 = i3 - i7;
/*  199 */         if (i9 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  203 */           i9 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  210 */           i10 = i4 - i8;
/*  211 */           i11 = i10 > 0 ? 1 : 0;
/*  212 */           l6 = i6 & 0xFFFFFFFF;
/*  213 */           i12 = i8 == 0 ? 1 : 0;
/*  214 */           l7 = 1 - i6 & 0xFFFFFFFF;
/*  215 */           i13 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  222 */             i14 = m * i13;
/*  223 */             i15 = i14 | 0x1;
/*  224 */             i16 = n + i14;
/*  225 */             i17 = i14 + paramInt2;
/*  226 */             i18 = i1 + i14;
/*  227 */             i19 = i14 + 2;
/*  228 */             i20 = (i13 << 1) + 2;
/*  229 */             i22 = i13 * m;
/*  230 */             i27 = i22 + paramInt2;
/*  231 */             if (i11 != 0) {
/*  232 */               i21 = 0;
/*      */             }
/*      */             else
/*      */             {
/*  236 */               i19 = i27;
/*  237 */               i14 = i22;
/*      */               
/*      */ 
/*      */               break label882;
/*      */             }
/*      */             
/*      */             do
/*      */             {
/*  245 */               i22 = i21 << 1;
/*  246 */               i23 = paramInt1 + (i15 + i22 << 3);
/*  247 */               i24 = paramInt1 + (i14 + i22 << 3);
/*  248 */               i25 = paramInt1 + (i16 + i22 << 3);
/*  249 */               i26 = paramInt1 + (i17 + i22 << 3);
/*  250 */               i27 = i22 + 2;
/*  251 */               l8 = MainMemory.getI64(i25);
/*  252 */               l9 = MainMemory.getI64(i26);
/*  253 */               l10 = MainMemory.getI64(i23);
/*  254 */               l11 = MainMemory.getI64(i24);
/*  255 */               l13 = l9 + l8;
/*  256 */               l12 = l13 + l10 + l11 >> (int)l6;
/*  257 */               l13 = l13 - l10 - l11 >> (int)l6;
/*  258 */               l8 -= l9;
/*  259 */               l9 = l8 + l10 - l11 >> (int)l6;
/*  260 */               MainMemory.setI64(i25, l8 - l10 + l11 >> (int)l6);
/*  261 */               MainMemory.setI64(i26, (l13 > -1L ? l5 : 0L) + l13 & l2);
/*  262 */               MainMemory.setI64(i23, (l9 > -1L ? l5 : 0L) + l9 & l2);
/*  263 */               MainMemory.setI64(i24, (l12 > -1L ? l4 : l3) + l12 & l1);
/*  264 */               i21 += 1;
/*  265 */             } while (i10 > i27);
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
/*  276 */             i14 = i22 + i18;
/*  277 */             i15 = i22 + i19;
/*  278 */             i19 = i14;
/*  279 */             i14 = i15;
/*      */             
/*      */ 
/*      */ 
/*      */             label882:
/*      */             
/*      */ 
/*      */ 
/*  287 */             if (i12 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  297 */               i23 = paramInt1 + (i19 << 3);
/*  298 */               l10 = MainMemory.getI64(i23);
/*  299 */               i24 = paramInt1 + (i14 << 3);
/*  300 */               l12 = MainMemory.getI64(i24);
/*  301 */               l11 = l12 + l10 << (int)l7;
/*  302 */               l10 = l10 - l12 << (int)l7;
/*  303 */               MainMemory.setI64(i23, (l10 > -1L ? l5 : 0L) + l10 & l2);
/*  304 */               MainMemory.setI64(i24, (l11 > -1L ? l4 : l3) + l11 & l1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  310 */             i13 += 1;
/*  311 */             if (i9 <= i20)
/*      */               break;
/*      */           }
/*      */           break label1037;
/*  315 */           i9 = i20;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1037:
/*      */         
/*      */ 
/*      */ 
/*  324 */         if (i7 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  334 */           i7 = i9 * paramInt2;
/*  335 */           i9 = i4 - i8;
/*  336 */           if (i9 <= 0) {
/*      */             break label1268;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  347 */           l6 = 1 - i6 & 0xFFFFFFFF;
/*  348 */           i10 = i7 + 1;
/*  349 */           i19 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  356 */             i20 = i19 << 1;
/*  357 */             i13 = i20 + 2;
/*  358 */             i23 = paramInt1 + (i10 + i20 << 3);
/*  359 */             i24 = paramInt1 + (i7 + i20 << 3);
/*  360 */             l10 = MainMemory.getI64(i23);
/*  361 */             l11 = MainMemory.getI64(i24);
/*  362 */             l7 = l11 + l10 << (int)l6;
/*  363 */             l10 = l10 - l11 << (int)l6;
/*  364 */             MainMemory.setI64(i23, (l10 > -1L ? l5 : 0L) + l10 & l2);
/*  365 */             MainMemory.setI64(i24, (l7 > -1L ? l4 : l3) + l7 & l1);
/*  366 */             i19 += 1;
/*  367 */           } while (i9 > i13);
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
/*  378 */           i7 = i7 + 2 + i20;
/*      */           
/*      */ 
/*      */ 
/*      */           label1268:
/*      */           
/*      */ 
/*      */ 
/*  386 */           if (i8 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  396 */             i23 = paramInt1 + (i7 << 3);
/*  397 */             l2 = MainMemory.getI64(i23) << (int)(2 - i6 & 0xFFFFFFFF);
/*  398 */             MainMemory.setI64(i23, (l2 > -1L ? l4 : l3) + l2 & l1);
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  404 */         if (i3 <= 0) {
/*      */           break label1699;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  414 */         i11 = i4 > 1 ? 1 : 0;
/*  415 */         i12 = i4 > 2 ? 1 : 0;
/*  416 */         i6 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  423 */           i8 = i6 * paramInt2;
/*  424 */           i7 = i8 + 1;
/*  425 */           i9 = i8 + 2;
/*  426 */           if (i11 != 0) {
/*  427 */             i20 = 0;
/*      */           } else {
/*      */             break label1489;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  438 */             i13 = i20 << 1;
/*  439 */             i10 = i13 + 3;
/*  440 */             MainMemory.setI64(k + (i20 << 3), MainMemory.getI64(paramInt1 + (i7 + i13 << 3)));
/*  441 */             i20 += 1;
/*  442 */           } while (i10 < i4);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1489:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  453 */           if (i12 != 0) {
/*  454 */             i10 = 0;
/*      */           }
/*      */           else
/*      */           {
/*  458 */             i7 = 1;
/*      */             
/*      */ 
/*      */             break label1587;
/*      */           }
/*      */           
/*      */           for (;;)
/*      */           {
/*  466 */             i13 = i10 << 1;
/*  467 */             i20 = i13 + 4;
/*  468 */             MainMemory.setI64(paramInt1 + (i7 + i10 << 3), MainMemory.getI64(paramInt1 + (i9 + i13 << 3)));
/*  469 */             i13 = i10 + 1;
/*  470 */             if (i20 >= i4) break;
/*  471 */             i10 = i13;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  481 */           i7 = i10 + 2;
/*      */           
/*      */ 
/*      */ 
/*      */           label1587:
/*      */           
/*      */ 
/*      */ 
/*  489 */           if (i11 == 0) {
/*      */             break label1673;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  499 */           i8 = i7 + i8;
/*  500 */           i9 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  507 */             i7 = (i9 << 1) + 3;
/*  508 */             MainMemory.setI64(paramInt1 + (i8 + i9 << 3), MainMemory.getI64(k + (i9 << 3)));
/*  509 */             i9 += 1;
/*  510 */           } while (i7 < i4);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1673:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  521 */           i6 += 1;
/*  522 */           if (i6 == i3) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1699:
/*      */         
/*      */ 
/*      */ 
/*  533 */         if (i4 <= 0) {
/*      */           break label2055;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  543 */         i11 = i3 > 1 ? 1 : 0;
/*  544 */         i12 = i3 > 2 ? 1 : 0;
/*  545 */         i6 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  552 */           i8 = i6 + paramInt2;
/*  553 */           i7 = m + i6;
/*  554 */           if (i11 != 0) {
/*  555 */             i10 = 0;
/*      */           } else {
/*      */             break label1841;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  566 */             i9 = (i10 << 1) + 3;
/*  567 */             MainMemory.setI64(k + (i10 << 3), MainMemory.getI64(paramInt1 + (i8 + m * i10 << 3)));
/*  568 */             i10 += 1;
/*  569 */           } while (i9 < i3);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1841:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  580 */           if (i12 != 0) {
/*  581 */             i20 = 0;
/*      */           }
/*      */           else
/*      */           {
/*  585 */             i8 = paramInt2;
/*      */             
/*      */ 
/*      */             break label1941;
/*      */           }
/*      */           
/*      */           do
/*      */           {
/*  593 */             i9 = i20 * paramInt2;
/*  594 */             i10 = (i20 << 1) + 4;
/*  595 */             MainMemory.setI64(paramInt1 + (i8 + i9 << 3), MainMemory.getI64(paramInt1 + (i7 + m * i20 << 3)));
/*  596 */             i20 += 1;
/*  597 */           } while (i10 < i3);
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
/*  608 */           i8 = i9 + m;
/*      */           
/*      */ 
/*      */ 
/*      */           label1941:
/*      */           
/*      */ 
/*      */ 
/*  616 */           if (i11 == 0) {
/*      */             break label2029;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  626 */           i8 += i6;
/*  627 */           i9 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  634 */             i7 = (i9 << 1) + 3;
/*  635 */             MainMemory.setI64(paramInt1 + (i8 + i9 * paramInt2 << 3), MainMemory.getI64(k + (i9 << 3)));
/*  636 */             i9 += 1;
/*  637 */           } while (i7 < i3);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label2029:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  648 */           i6 += 1;
/*  649 */           if (i6 == i4) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2055:
/*      */         
/*      */ 
/*      */ 
/*  660 */         l5 = l4 << 1;
/*  661 */         i5 += 1;
/*  662 */         l2 = l1 << 1;
/*  663 */         l3 = l5 + -1L;
/*  664 */         i3 = i3 + 1 >> 1;
/*  665 */         i4 = i4 + 1 >> 1;
/*  666 */         if (i5 == i2) {
/*      */           break;
/*      */         }
/*      */         
/*  670 */         l1 = l2;
/*  671 */         l2 = l1;
/*      */         
/*  673 */         l4 = l5;
/*  674 */         l5 = l4;
/*      */         
/*      */ 
/*      */ 
/*  678 */         i6 = 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label2136:
/*      */       
/*      */ 
/*  685 */       free.call(k);
/*  686 */       if (paramInt4 >= 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  696 */         fits_hcompress64_1469.call(paramInt4, paramInt3, paramInt1, paramInt2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  702 */       m = MainMemory.getI32(paramInt6);
/*  703 */       MainMemory.setI32Aligned(459436, m);
/*  704 */       MainMemory.setI32(paramInt6, 0);
/*  705 */       MainMemory.setI32Aligned(459432, 0);
/*  706 */       i3 = paramInt3 * paramInt2;
/*  707 */       if (m >= 2)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  717 */         MainMemory.setI16(paramInt5, (short)39389);
/*  718 */         MainMemory.setI32Aligned(459432, 2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  724 */       F419940.call(paramInt5, paramInt3);
/*  725 */       F419940.call(paramInt5, paramInt2);
/*  726 */       F419940.call(paramInt5, paramInt4);
/*  727 */       l1 = MainMemory.getI64(paramInt1);
/*  728 */       MainMemory.setI8(i + 7, (byte)(int)l1);
/*  729 */       MainMemory.setI8(i + 6, (byte)(int)(l1 >>> 8));
/*  730 */       MainMemory.setI8(i + 5, (byte)(int)(l1 >>> 16));
/*  731 */       MainMemory.setI8(i + 4, (byte)(int)(l1 >>> 24));
/*  732 */       MainMemory.setI8(i + 3, (byte)(int)(l1 >>> 32));
/*  733 */       MainMemory.setI8(i + 2, (byte)(int)(l1 >>> 40));
/*  734 */       MainMemory.setI8(i + 1, (byte)(int)(l1 >>> 48));
/*  735 */       MainMemory.setI8(i, (byte)(int)(l1 >>> 56));
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
/*  777 */       MainMemory.setI64(paramInt1, 0L);
/*  778 */       k = malloc.call((i3 + 7) / 8);
/*  779 */       if (k != 0) {
/*      */         break label2515;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  789 */       ffxmsg.call(5, 75840);
/*  790 */       paramInt2 = 413;
/*      */       
/*      */       break label4027;
/*      */       
/*      */       label2515:
/*  795 */       MainMemory.setI8(k, (byte)0);
/*  796 */       i11 = i3 > 0 ? 1 : 0;
/*  797 */       if (i11 != 0) {
/*  798 */         l1 = 0L;
/*  799 */         i2 = 8;
/*  800 */         i1 = 0;
/*  801 */         i4 = 0;
/*      */       }
/*      */       else
/*      */       {
/*  805 */         n = 0;
/*      */         
/*      */ 
/*      */ 
/*      */         break label2856;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  816 */         n = i4 + 1;
/*  817 */         i23 = paramInt1 + (n << 3);
/*  818 */         i24 = paramInt1 + (i4 << 3);
/*  819 */         if (l1 <= 0L) {
/*      */           break label2646;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  829 */         i28 = k + i1;
/*  830 */         MainMemory.setI8(i28, MathUtils.shl(MainMemory.getI8(i28), 1));
/*  831 */         i2 += -1;
/*      */         
/*      */         break label2711;
/*      */         
/*      */         label2646:
/*      */         
/*  837 */         if (l1 >= 0L) {
/*      */           break label2711;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  848 */         i28 = k + i1;
/*  849 */         MainMemory.setI8(i28, MathUtils.or(MathUtils.shl(MainMemory.getI8(i28), 1), (byte)1));
/*  850 */         i2 += -1;
/*  851 */         MainMemory.setI64(i24, 0L - l1);
/*      */         
/*      */ 
/*      */ 
/*      */         label2711:
/*      */         
/*      */ 
/*      */ 
/*  859 */         if (i2 != 0) {
/*      */           break label2753;
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
/*  871 */         i1 += 1;
/*  872 */         MainMemory.setI8(k + i1, (byte)0);
/*      */         
/*  874 */         i2 = 8;
/*      */         
/*      */ 
/*      */ 
/*      */         label2753:
/*      */         
/*      */ 
/*      */ 
/*  882 */         if (n != i3) {
/*      */           break label2835;
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
/*  903 */         i28 = k + i1;
/*  904 */         MainMemory.setI8(i28, (byte)((MainMemory.getI8(i28) & 0xFF) << i2));
/*  905 */         n = i1 + 1;
/*      */         
/*  907 */         break;
/*      */         
/*      */         label2835:
/*      */         
/*  911 */         l1 = MainMemory.getI64(i23);
/*      */         
/*      */ 
/*      */ 
/*  915 */         i4 = n;
/*      */       }
/*      */       
/*      */ 
/*      */       label2856:
/*      */       
/*  921 */       MainMemory.setI64(j, 0L);
/*  922 */       i24 = j + 8;
/*  923 */       MainMemory.setI64(i24, 0L);
/*  924 */       i23 = j + 16;
/*  925 */       MainMemory.setI64(i23, 0L);
/*  926 */       i1 = (paramInt3 + 1) / 2;
/*  927 */       i2 = (paramInt2 + 1) / 2;
/*  928 */       if (i11 != 0) {
/*  929 */         i5 = 0;
/*  930 */         i6 = 0;
/*  931 */         i8 = 0;
/*      */       }
/*      */       else
/*      */       {
/*  935 */         i29 = 0;
/*  936 */         i3 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */         break label3194;
/*      */       }
/*      */       
/*      */ 
/*      */       for (;;)
/*      */       {
/*  946 */         i4 = i8 + 1;
/*  947 */         i25 = j + ((i6 >= i2 ? 1 : 0) + (i5 >= i1 ? 1 : 0) << 3);
/*  948 */         l1 = MainMemory.getI64(paramInt1 + (i8 << 3));
/*  949 */         if (MainMemory.getI64(i25) >= l1) {
/*      */           break label3020;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  959 */         MainMemory.setI64(i25, l1);
/*      */         
/*      */ 
/*      */         label3020:
/*      */         
/*      */ 
/*  965 */         i6 += 1;
/*  966 */         i11 = i6 < paramInt2 ? 1 : 0;
/*  967 */         if (i4 != i3) {
/*      */           break label3150;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  977 */         l1 = MainMemory.getI64(j);
/*  978 */         if (l1 > 0L) {
/*  979 */           i29 = 0;
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*  984 */           i29 = 0;
/*  985 */           i3 = 0;
/*  986 */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         do
/*      */         {
/*  994 */           l1 >>= 1;
/*  995 */           i29 = (byte)(i29 + 1);
/*  996 */         } while (l1 > 0L);
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
/* 1008 */         MainMemory.setI64(j, l1);
/* 1009 */         i3 = i29 & 0xFF;
/*      */         
/*      */ 
/* 1012 */         break;
/*      */         
/*      */         label3150:
/*      */         
/* 1016 */         i6 = i11 != 0 ? i6 : 0;
/* 1017 */         i5 = ((i11 != 0 ? 1 : 0) ^ 0x1) + i5;
/*      */         
/*      */ 
/* 1020 */         i8 = i4;
/*      */       }
/*      */       
/*      */ 
/*      */       label3194:
/*      */       
/*      */ 
/* 1027 */       l1 = MainMemory.getI64(i24);
/* 1028 */       if (l1 > 0L) {
/* 1029 */         i30 = 0;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/* 1034 */         i30 = 0;
/*      */         
/*      */ 
/*      */         break label3269;
/*      */       }
/*      */       
/*      */ 
/*      */       do
/*      */       {
/* 1043 */         l1 >>= 1;
/* 1044 */         i30 = (byte)(i30 + 1);
/* 1045 */       } while (l1 > 0L);
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
/* 1057 */       MainMemory.setI64(i24, l1);
/*      */       
/*      */ 
/*      */ 
/*      */       label3269:
/*      */       
/*      */ 
/*      */ 
/* 1065 */       l1 = MainMemory.getI64(i23);
/* 1066 */       if (l1 > 0L) {
/* 1067 */         i31 = 0;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/* 1072 */         i31 = 0;
/* 1073 */         i4 = 0;
/*      */         
/*      */ 
/*      */         break label3355;
/*      */       }
/*      */       
/*      */ 
/*      */       do
/*      */       {
/* 1082 */         l1 >>= 1;
/* 1083 */         i31 = (byte)(i31 + 1);
/* 1084 */       } while (l1 > 0L);
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
/* 1096 */       MainMemory.setI64(i23, l1);
/* 1097 */       i4 = i31 & 0xFF;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label3355:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1107 */       i5 = paramInt4 + 3;
/* 1108 */       if (i5 <= m) {
/*      */         break label3406;
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
/*      */       break label4027;
/*      */       
/*      */       label3406:
/* 1125 */       MainMemory.setI8(paramInt5 + paramInt4, i29);
/* 1126 */       MainMemory.setI8(paramInt5 + (paramInt4 + 1), i30);
/* 1127 */       MainMemory.setI8(paramInt5 + (paramInt4 + 2), i31);
/* 1128 */       MainMemory.setI32Aligned(459432, i5);
/* 1129 */       MainMemory.setI32Aligned(459424, 0);
/* 1130 */       MainMemory.setI32Aligned(459428, 8);
/* 1131 */       MainMemory.setI64Aligned(467236, 0L);
/* 1132 */       paramInt4 = F419132.call(paramInt5, paramInt1, paramInt2, i1, i2, i3);
/* 1133 */       if (paramInt4 != 0) {
/*      */         break label3523;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1144 */       paramInt4 = F419132.call(paramInt5, paramInt1 + (i2 << 3), paramInt2, i1, paramInt2 / 2, i30 & 0xFF);
/*      */       
/*      */ 
/*      */ 
/*      */       label3523:
/*      */       
/*      */ 
/*      */ 
/* 1152 */       if (paramInt4 != 0) {
/*      */         break label3571;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1163 */       paramInt4 = F419132.call(paramInt5, paramInt1 + (i1 * paramInt2 << 3), paramInt2, paramInt3 / 2, i2, i30 & 0xFF);
/*      */       
/*      */ 
/*      */ 
/*      */       label3571:
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
/* 1182 */         paramInt2 = F419132.call(paramInt5, paramInt1 + (i1 * paramInt2 + i2 << 3), paramInt2, paramInt3 / 2, paramInt2 / 2, i4);
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
/*      */           break label3734;
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
/*      */         label3734:
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
/* 1233 */       l1 = MainMemory.getI64Aligned(467236) + 4L;
/* 1234 */       MainMemory.setI64Aligned(467236, l1);
/* 1235 */       if (paramInt4 >= 8) {
/*      */         break label3857;
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
/*      */         break label3842;
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
/*      */       label3842:
/*      */       
/*      */ 
/* 1263 */       MainMemory.setI64Aligned(467236, paramInt4 + l1);
/*      */       
/*      */ 
/*      */       label3857:
/*      */       
/*      */ 
/* 1269 */       if (n <= 0) {
/*      */         break label3976;
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
/*      */           break label3976;
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
/*      */       break label4027;
/*      */       
/*      */       label3976:
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
/* 1325 */         ffxmsg.call(5, 80864);
/* 1326 */         paramInt2 = 413;
/*      */       }
/*      */       
/*      */ 
/*      */       label4027:
/*      */       
/*      */ 
/* 1333 */       MainMemory.setI32(paramInt7, paramInt2);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label4038:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1344 */       MainMemory.dealloc_generated(i32);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hcompress64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */