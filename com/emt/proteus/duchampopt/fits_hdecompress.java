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
/*      */ public final class fits_hdecompress extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3658;
/*   15 */   public static final Function _instance = new fits_hdecompress();
/*   16 */   public final Function resolve() { return _instance; }
/*      */   
/*   18 */   public fits_hdecompress() { super("fits_hdecompress", 7, false); }
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
/*   58 */     long l = 0L;
/*   59 */     int k = 0;
/*   60 */     int m = 0;
/*   61 */     int n = 0;
/*   62 */     int i1 = 0;
/*   63 */     float f = 0.0F;
/*   64 */     double d = 0.0D;
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
/*  103 */     int i40 = 0;
/*  104 */     boolean bool = false;
/*  105 */     int i41 = 0;
/*  106 */     int i42 = 0;
/*  107 */     int i43 = 0;
/*  108 */     int i44 = 0;
/*  109 */     int i45 = 0;
/*  110 */     int i46 = 0;
/*  111 */     int i47 = 0;
/*  112 */     int i48 = 0;
/*  113 */     int i49 = 0;
/*  114 */     int i50 = 0;
/*  115 */     int i51 = 0;
/*  116 */     int i52 = 0;
/*  117 */     int i53 = 0;
/*  118 */     int i54 = 0;
/*  119 */     int i55 = 0;
/*  120 */     int i56 = 0;
/*  121 */     int i57 = 0;
/*  122 */     int i58 = 0;
/*      */     
/*      */ 
/*  125 */     int i59 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  129 */       j = MainMemory.alloc(2);
/*  130 */       i1 = MainMemory.getI32(paramInt7);
/*  131 */       if (i1 <= 0) {
/*      */         break label251;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  141 */       i = i1;
/*      */       
/*      */ 
/*      */       break label4511;
/*      */       
/*      */       label251:
/*      */       
/*  148 */       MainMemory.setI16(j, MainMemory.getI16(paramInt1));
/*  149 */       MainMemory.setI32Aligned(459444, 2);
/*  150 */       if (SystemLibrary.memcmp(j, 459324, 2) != 0) {
/*      */         break label4487;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  160 */       MainMemory.setI32(paramInt5, ((MainMemory.getI8(paramInt1 + 3) & 0xFF | (MainMemory.getI8(paramInt1 + 2) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 4) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 5) & 0xFF);
/*  161 */       MainMemory.setI32(paramInt4, ((MainMemory.getI8(paramInt1 + 7) & 0xFF | (MainMemory.getI8(paramInt1 + 6) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 8) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 9) & 0xFF);
/*  162 */       MainMemory.setI32(paramInt6, ((MainMemory.getI8(paramInt1 + 11) & 0xFF | (MainMemory.getI8(paramInt1 + 10) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 12) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 13) & 0xFF);
/*  163 */       l = ((((((MainMemory.getI8(paramInt1 + 15) & 0xFF | (MainMemory.getI8(paramInt1 + 14) & 0xFF) << 8) << 8 | MainMemory.getI8(paramInt1 + 16) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 17) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 18) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 19) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 20) & 0xFF) << 8 | MainMemory.getI8(paramInt1 + 21) & 0xFF;
/*  164 */       k = MainMemory.getI8(paramInt1 + 22);
/*  165 */       m = MainMemory.getI8(paramInt1 + 23);
/*  166 */       n = MainMemory.getI8(paramInt1 + 24);
/*  167 */       MainMemory.setI32Aligned(459444, 25);
/*  168 */       i2 = MainMemory.getI32(paramInt4);
/*  169 */       i6 = MainMemory.getI32(paramInt5);
/*  170 */       i1 = i6 * i2;
/*  171 */       i4 = (i6 + 1) / 2;
/*  172 */       i3 = (i2 + 1) / 2;
/*  173 */       i5 = i1 > 0 ? 1 : 0;
/*  174 */       if (i5 == 0) {
/*      */         break label745;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  184 */       i7 = i2 * i6;
/*  185 */       i8 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  192 */         MainMemory.setI32(paramInt3 + (i8 << 2), 0);
/*  193 */         i8 += 1;
/*  194 */         if (i8 == i7) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label745:
/*      */       
/*      */ 
/*      */ 
/*  205 */       MainMemory.setI32Aligned(459440, 0);
/*  206 */       i7 = F425062.call(paramInt1, paramInt3, i2, i4, i3, k & 0xFF);
/*  207 */       if (i7 != 0)
/*      */       {
/*      */ 
/*      */ 
/*  211 */         i1 = i7;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  218 */         i8 = m & 0xFF;
/*  219 */         i7 = i2 / 2;
/*  220 */         i9 = F425062.call(paramInt1, paramInt3 + (i3 << 2), i2, i4, i7, i8);
/*  221 */         if (i9 != 0)
/*      */         {
/*      */ 
/*      */ 
/*  225 */           i1 = i9;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  232 */           i6 /= 2;
/*  233 */           i4 *= i2;
/*  234 */           i8 = F425062.call(paramInt1, paramInt3 + (i4 << 2), i2, i6, i3, i8);
/*  235 */           if (i8 != 0)
/*      */           {
/*      */ 
/*      */ 
/*  239 */             i1 = i8;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  246 */             i2 = F425062.call(paramInt1, paramInt3 + (i4 + i3 << 2), i2, i6, i7, n & 0xFF);
/*  247 */             if (i2 != 0)
/*      */             {
/*      */ 
/*      */ 
/*  251 */               i1 = i2;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  258 */               i2 = MainMemory.getI32Aligned(459440);
/*  259 */               i4 = MainMemory.getI32Aligned(459448);
/*  260 */               if (i2 >= 4)
/*      */               {
/*      */ 
/*      */ 
/*  264 */                 i3 = i4;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*  272 */                 i3 = MainMemory.getI32Aligned(459444);
/*  273 */                 i4 = MainMemory.getI8(paramInt1 + i3) & 0xFF | i4 << 8;
/*  274 */                 MainMemory.setI32Aligned(459448, i4);
/*  275 */                 MainMemory.setI32Aligned(459444, i3 + 1);
/*  276 */                 i2 += 8;
/*  277 */                 MainMemory.setI32Aligned(459440, i2);
/*  278 */                 i3 = i4;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  287 */               i2 += -4;
/*  288 */               MainMemory.setI32Aligned(459440, i2);
/*  289 */               if ((i3 >> i2 & 0xF) != 0) {
/*      */                 break label1356;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  299 */               MainMemory.setI32Aligned(459440, 0);
/*  300 */               if (i5 != 0) {
/*  301 */                 i4 = i3;
/*  302 */                 i6 = 0;
/*  303 */                 i3 = 0;
/*      */               }
/*      */               else
/*      */               {
/*      */                 break label1333;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  316 */                 i2 = i3 + 1;
/*  317 */                 i51 = paramInt3 + (i3 << 2);
/*  318 */                 i3 = MainMemory.getI32(i51);
/*  319 */                 if (i3 == 0) {
/*  320 */                   i3 = i4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  331 */                   if (i6 != 0) {
/*      */                     break label1245;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  341 */                   i4 = MainMemory.getI32Aligned(459444);
/*  342 */                   i6 = MainMemory.getI8(paramInt1 + i4) & 0xFF;
/*  343 */                   MainMemory.setI32Aligned(459448, i6);
/*  344 */                   MainMemory.setI32Aligned(459444, i4 + 1);
/*  345 */                   MainMemory.setI32Aligned(459440, 8);
/*  346 */                   i4 = i6;
/*  347 */                   i6 = 7;
/*      */                   
/*      */                   break label1256;
/*      */                   
/*      */                   label1245:
/*  352 */                   i6 += -1;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   label1256:
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  362 */                   MainMemory.setI32Aligned(459440, i6);
/*  363 */                   if ((1 << i6 & i4) == 0) {
/*  364 */                     i3 = i4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  375 */                     MainMemory.setI32(i51, 0 - i3);
/*  376 */                     i3 = i4;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  385 */                 if (i2 == i1) {
/*      */                   break;
/*      */                 }
/*      */                 
/*  389 */                 i4 = i3;
/*      */                 
/*  391 */                 i3 = i2;
/*      */               }
/*      */               
/*      */ 
/*      */               label1333:
/*      */               
/*      */ 
/*  398 */               MainMemory.setI32(paramInt3, (int)l);
/*  399 */               MainMemory.setI32(paramInt7, 0);
/*      */               
/*      */               break label1424;
/*      */               
/*      */               label1356:
/*  404 */               ffxmsg.call(5, 77312);
/*  405 */               MainMemory.setI32(paramInt3, (int)l);
/*  406 */               MainMemory.setI32(paramInt7, 414);
/*  407 */               i = 414;
/*      */               
/*      */               break label4511;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  415 */       MainMemory.setI32(paramInt3, (int)l);
/*  416 */       MainMemory.setI32(paramInt7, i1);
/*  417 */       if (i1 != 0) {
/*      */         break label4473;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1424:
/*      */       
/*      */ 
/*      */ 
/*  427 */       i1 = MainMemory.getI32(paramInt6);
/*  428 */       if (i1 < 2) {
/*  429 */         i3 = i1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  439 */         i2 = MainMemory.getI32(paramInt4) * MainMemory.getI32(paramInt5) + -1;
/*  440 */         if (i2 < 0) {
/*  441 */           i3 = i1;
/*      */           break label1557;
/*      */         } else {
/*  444 */           i4 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  453 */           i3 = i4 + 1;
/*  454 */           i51 = paramInt3 + (i4 << 2);
/*  455 */           MainMemory.setI32(i51, MainMemory.getI32(i51) * i1);
/*  456 */           if (i2 < i3) {
/*      */             break;
/*      */           }
/*      */           
/*  460 */           i4 = i3;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  467 */         i1 = MainMemory.getI32(paramInt6);
/*  468 */         i3 = i1;
/*      */       }
/*      */       
/*      */ 
/*      */       label1557:
/*      */       
/*      */ 
/*  475 */       i1 = MainMemory.getI32(paramInt4);
/*  476 */       i20 = MainMemory.getI32(paramInt5);
/*  477 */       i2 = i1 >= i20 ? i1 : i20;
/*  478 */       f = i2;
/*  479 */       d = f;
/*  480 */       d = SystemLibrary.log(d);
/*  481 */       d /= SystemLibrary.log(2.0D);
/*  482 */       d += 0.5D;
/*  483 */       i17 = (int)d;
/*  484 */       i18 = 1 << i17 < i2 ? 1 : 0;
/*  485 */       i4 = i18 + i17;
/*  486 */       paramInt1 = malloc.call((i2 + 1) / 2 << 2);
/*  487 */       if (paramInt1 != 0) {
/*      */         break label1699;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  497 */       ffxmsg.call(5, 70432);
/*  498 */       paramInt2 = 414;
/*      */       
/*      */       break label4454;
/*      */       
/*      */       label1699:
/*  503 */       i2 = i4 + -1;
/*  504 */       i21 = 1 << i2;
/*  505 */       i26 = i21 << 1;
/*  506 */       i22 = 0 - i21;
/*  507 */       i25 = i26 >> 1;
/*  508 */       i6 = i21 << 2 >> 1;
/*  509 */       i7 = MainMemory.getI32(paramInt3);
/*  510 */       MainMemory.setI32(paramInt3, (i7 > -1 ? i6 : i6 + -1) + i7 & i22 << 2);
/*  511 */       if (i2 <= -1) {
/*      */         break label4443;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  521 */       i31 = 1 << i4;
/*  522 */       i19 = i25 + -1;
/*  523 */       i32 = i22 << 1;
/*  524 */       i3 >>= 1;
/*  525 */       i4 = 0 - i3;
/*  526 */       i5 = (paramInt2 == 0) || (i3 < 1) ? 1 : 0;
/*  527 */       paramInt2 = i1 + 1;
/*  528 */       i6 = i1 + 2;
/*  529 */       i7 = i1 << 1;
/*  530 */       i8 = i1 << 2;
/*  531 */       i9 = i8 + 4;
/*  532 */       i10 = i7 + 3;
/*  533 */       i11 = i7 + 2;
/*  534 */       i12 = i1 * 3;
/*  535 */       i13 = i12 + 3;
/*  536 */       i14 = i12 + 2;
/*  537 */       i15 = i1 * -2;
/*  538 */       i16 = 0 - i1;
/*  539 */       i17 += i18;
/*  540 */       i18 = 0;
/*  541 */       i28 = i21;
/*  542 */       i38 = 2;
/*  543 */       i30 = 2;
/*  544 */       i27 = i20;
/*  545 */       i29 = i1;
/*  546 */       i37 = i31;
/*      */       
/*  548 */       i31 = 1;
/*  549 */       i20 = i21;
/*  550 */       i21 = i26;
/*      */       
/*  552 */       i23 = i32;
/*  553 */       i24 = i25;
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
/*      */       for (;;)
/*      */       {
/*  573 */         i25 = i28 >> 1;
/*  574 */         i26 = i37 >> 1;
/*  575 */         i33 = i27 > i26 ? 1 : 0;
/*  576 */         i27 -= (i33 != 0 ? i26 : 0);
/*  577 */         i28 = i33 != 0 ? i38 : i38 + -1;
/*  578 */         i33 = i29 > i26 ? 1 : 0;
/*  579 */         i29 -= (i33 != 0 ? i26 : 0);
/*  580 */         i30 = i33 != 0 ? i30 : i30 + -1;
/*  581 */         i33 = i2 == i18 ? 1 : 0;
/*  582 */         i31 = i33 != 0 ? 2 : i31;
/*  583 */         i32 = i33 != 0 ? 0 : i25 + -1;
/*  584 */         i33 = i28 > 0 ? 1 : 0;
/*  585 */         if (i33 == 0) {
/*      */           break label2497;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  595 */         i38 = i30 + 1 >> 1;
/*  596 */         bool = i38 < i30;
/*  597 */         i37 = i30 - i38;
/*  598 */         i39 = i38 + -1;
/*  599 */         i36 = i39 > -1 ? 1 : 0;
/*  600 */         i34 = i30 > 1 ? 1 : 0;
/*  601 */         i40 = i30 + -1 & 0xFFFFFFFE;
/*  602 */         i48 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  609 */           i41 = i1 * i48;
/*  610 */           i50 = i38 + i41;
/*  611 */           i45 = i40 + i41;
/*  612 */           i46 = i39 + i41;
/*  613 */           i41 += 1;
/*  614 */           if (bool) {
/*  615 */             i42 = 0;
/*      */           } else {
/*      */             break label2320;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  626 */             MainMemory.setI32(paramInt1 + (i42 << 2), MainMemory.getI32(paramInt3 + (i50 + i42 << 2)));
/*  627 */             i42 += 1;
/*  628 */             if (i42 == i37) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label2320:
/*      */           
/*      */ 
/*      */ 
/*  639 */           if (i36 != 0) {
/*  640 */             i50 = 0;
/*      */           } else {
/*      */             break label2394;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  651 */             MainMemory.setI32(paramInt3 + (i45 + i50 * -2 << 2), MainMemory.getI32(paramInt3 + (i46 - i50 << 2)));
/*  652 */             i50 += 1;
/*  653 */             if (i50 == i38) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label2394:
/*      */           
/*      */ 
/*      */ 
/*  664 */           if (i34 != 0) {
/*  665 */             i46 = 0;
/*      */           } else {
/*      */             break label2471;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  676 */             i50 = i46 << 1;
/*  677 */             i45 = i50 + 3;
/*  678 */             MainMemory.setI32(paramInt3 + (i41 + i50 << 2), MainMemory.getI32(paramInt1 + (i46 << 2)));
/*  679 */             i46 += 1;
/*  680 */           } while (i45 < i30);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label2471:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  691 */           i48 += 1;
/*  692 */           if (i48 == i28) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2497:
/*      */         
/*      */ 
/*      */ 
/*  703 */         i36 = i30 > 0 ? 1 : 0;
/*  704 */         if (i36 == 0) {
/*      */           break label2895;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  714 */         i38 = i28 + 1 >> 1;
/*  715 */         bool = i38 < i28;
/*  716 */         i37 = i28 - i38;
/*  717 */         i48 = i38 + -1;
/*  718 */         i34 = i48 > -1 ? 1 : 0;
/*  719 */         i35 = i28 > 1 ? 1 : 0;
/*  720 */         i39 = i1 * i48;
/*  721 */         i40 = i1 * i38;
/*  722 */         i48 = i7 * i48;
/*  723 */         i41 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  730 */           i42 = i40 + i41;
/*  731 */           i46 = i48 + i41;
/*  732 */           i50 = i39 + i41;
/*  733 */           i45 = i1 + i41;
/*  734 */           if (bool) {
/*  735 */             i43 = 0;
/*      */           } else {
/*      */             break label2716;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  746 */             MainMemory.setI32(paramInt1 + (i43 << 2), MainMemory.getI32(paramInt3 + (i42 + i1 * i43 << 2)));
/*  747 */             i43 += 1;
/*  748 */             if (i43 == i37) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label2716:
/*      */           
/*      */ 
/*      */ 
/*  759 */           if (i34 != 0) {
/*  760 */             i42 = 0;
/*      */           } else {
/*      */             break label2793;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  771 */             MainMemory.setI32(paramInt3 + (i46 + i15 * i42 << 2), MainMemory.getI32(paramInt3 + (i50 + i42 * i16 << 2)));
/*  772 */             i42 += 1;
/*  773 */             if (i42 == i38) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label2793:
/*      */           
/*      */ 
/*      */ 
/*  784 */           if (i35 != 0) {
/*  785 */             i50 = 0;
/*      */           } else {
/*      */             break label2869;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           do
/*      */           {
/*  796 */             i46 = (i50 << 1) + 3;
/*  797 */             MainMemory.setI32(paramInt3 + (i45 + i7 * i50 << 2), MainMemory.getI32(paramInt1 + (i50 << 2)));
/*  798 */             i50 += 1;
/*  799 */           } while (i46 < i28);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label2869:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  810 */           i41 += 1;
/*  811 */           if (i41 == i30) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2895:
/*      */         
/*      */ 
/*      */ 
/*  822 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  832 */           i38 = i28 + -2;
/*  833 */           bool = i38 > 2;
/*  834 */           if ((bool) && (i36 != 0)) {
/*  835 */             i39 = 0;
/*      */           } else {
/*      */             break label3318;
/*      */           }
/*      */           
/*      */ 
/*      */           label3272:
/*      */           
/*      */ 
/*      */           do
/*      */           {
/*  846 */             i40 = i7 * i39;
/*  847 */             i48 = i8 + i40;
/*  848 */             i41 = i7 + i40;
/*  849 */             i45 = i12 + i40;
/*  850 */             i37 = (i39 << 1) + 4;
/*  851 */             i50 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             do
/*      */             {
/*  858 */               i42 = i50 << 1;
/*  859 */               paramInt4 = paramInt3 + (i45 + i42 << 2);
/*  860 */               i46 = i42 + 2;
/*  861 */               i43 = MainMemory.getI32(paramInt3 + (i40 + i42 << 2));
/*  862 */               i44 = MainMemory.getI32(paramInt3 + (i41 + i42 << 2));
/*  863 */               i47 = MainMemory.getI32(paramInt3 + (i48 + i42 << 2));
/*  864 */               i42 = i47 - i43;
/*  865 */               i43 = i44 - i43;
/*  866 */               i47 -= i44;
/*  867 */               i44 = i43 <= i47 ? i43 : i47;
/*  868 */               i44 = i44 < 0 ? 0 : i44 << 2;
/*  869 */               i43 = i43 >= i47 ? i43 : i47;
/*  870 */               i43 = i43 > 0 ? 0 : i43 << 2;
/*  871 */               if (i43 >= i44) {
/*      */                 break label3272;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  881 */               i44 = i44 <= i42 ? i44 : i42;
/*  882 */               i42 = MainMemory.getI32(paramInt4);
/*  883 */               i43 = (i44 >= i43 ? i44 : i43) - (i42 << 3);
/*  884 */               i43 = (i43 > -1 ? i43 : i43 + 7) >> 3;
/*  885 */               i43 = i3 <= i43 ? i3 : i43;
/*  886 */               MainMemory.setI32(paramInt4, (i43 <= i4 ? i4 : i43) + i42);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  892 */               i50 += 1;
/*  893 */             } while (i46 < i30);
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
/*  904 */             i39 += 1;
/*  905 */           } while (i38 > i37);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label3318:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  916 */           if (i33 == 0) {
/*      */             break label3355;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  926 */           fits_hdecompress_1475.call(i28, i7, paramInt3, i30, i3, i4);
/*      */           
/*      */ 
/*      */           label3355:
/*      */           
/*      */ 
/*  932 */           fits_hdecompress_1474.call(bool, i11, i30, i8, i14, i7, i10, i9, paramInt3, i3, i13, i4, i38);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  938 */         i37 = i28 % 2;
/*  939 */         i38 = i30 % 2;
/*  940 */         i39 = i28 - i37;
/*  941 */         if (i39 <= 0)
/*      */         {
/*      */ 
/*      */ 
/*  945 */           i40 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  952 */           i40 = i30 - i38;
/*  953 */           i33 = i40 > 0 ? 1 : 0;
/*  954 */           bool = i38 == 0;
/*  955 */           i41 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  962 */             i42 = i7 * i41;
/*  963 */             i43 = i6 + i42;
/*  964 */             i44 = paramInt2 + i42;
/*  965 */             i45 = i1 + i42;
/*  966 */             i46 = i42 + 2;
/*  967 */             i47 = i42 | 0x1;
/*  968 */             i48 = (i41 << 1) + 2;
/*  969 */             if (i33 != 0) {
/*  970 */               i49 = 0;
/*      */             }
/*      */             else
/*      */             {
/*  974 */               i46 = i42;
/*  975 */               i50 = i45;
/*      */               
/*      */               break label3936;
/*      */             }
/*      */             label3789:
/*      */             label3814:
/*      */             do
/*      */             {
/*  983 */               i50 = i49 << 1;
/*  984 */               paramInt4 = paramInt3 + (i44 + i50 << 2);
/*  985 */               paramInt5 = paramInt3 + (i45 + i50 << 2);
/*  986 */               paramInt6 = paramInt3 + (i47 + i50 << 2);
/*  987 */               i51 = paramInt3 + (i42 + i50 << 2);
/*  988 */               i52 = i50 + 2;
/*  989 */               i53 = MainMemory.getI32(i51);
/*  990 */               i57 = MainMemory.getI32(paramInt5);
/*  991 */               i58 = MainMemory.getI32(paramInt6);
/*  992 */               i54 = MainMemory.getI32(paramInt4);
/*  993 */               i57 = (i57 > -1 ? i24 : i19) + i57 & i23;
/*  994 */               i58 = (i58 > -1 ? i24 : i19) + i58 & i23;
/*  995 */               i54 = (i54 > -1 ? i25 : i32) + i54 & i22;
/*  996 */               i55 = i54 & i20;
/*  997 */               i56 = 0 - i55;
/*  998 */               i57 = (i57 > -1 ? i56 : i55) + i57;
/*  999 */               i58 = (i58 > -1 ? i56 : i55) + i58;
/* 1000 */               i56 = (i57 ^ i54 ^ i58) & i21;
/* 1001 */               if (i53 <= -1) {
/*      */                 break label3789;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1011 */               i53 = i55 + i53 - i56;
/*      */               
/*      */ 
/*      */               break label3814;
/*      */               
/*      */ 
/* 1017 */               i53 = (i55 == 0 ? i56 : i55 - i56) + i53;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1025 */               i55 = i58 + i54;
/* 1026 */               MainMemory.setI32(paramInt4, i55 + i57 + i53 >> i31);
/* 1027 */               MainMemory.setI32(paramInt5, i57 - i55 + i53 >> i31);
/* 1028 */               MainMemory.setI32(paramInt6, i58 - (i57 + i54) + i53 >> i31);
/* 1029 */               MainMemory.setI32(i51, i54 - i57 - i58 + i53 >> i31);
/* 1030 */               i49 += 1;
/* 1031 */             } while (i40 > i52);
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
/* 1042 */             i45 = i43 + i50;
/* 1043 */             i46 += i50;
/*      */             
/* 1045 */             i50 = i45;
/*      */             
/*      */ 
/*      */ 
/*      */             label3936:
/*      */             
/*      */ 
/*      */ 
/* 1053 */             if (!bool)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1063 */               paramInt4 = paramInt3 + (i46 << 2);
/* 1064 */               i45 = MainMemory.getI32(paramInt4);
/* 1065 */               paramInt5 = paramInt3 + (i50 << 2);
/* 1066 */               i46 = MainMemory.getI32(paramInt5);
/* 1067 */               i46 = (i46 > -1 ? i24 : i19) + i46 & i23;
/* 1068 */               i50 = i46 & i21;
/* 1069 */               i45 = (i45 > -1 ? 0 - i50 : i50) + i45;
/* 1070 */               MainMemory.setI32(paramInt5, i45 + i46 >> i31);
/* 1071 */               MainMemory.setI32(paramInt4, i45 - i46 >> i31);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1077 */             i41 += 1;
/* 1078 */             if (i39 <= i48)
/*      */               break;
/*      */           }
/*      */           break label4087;
/* 1082 */           i40 = i48;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label4087:
/*      */         
/*      */ 
/*      */ 
/* 1091 */         if (i37 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1101 */           i37 = i40 * i1;
/* 1102 */           i39 = i30 - i38;
/* 1103 */           if (i39 <= 0)
/*      */           {
/*      */ 
/*      */ 
/* 1107 */             i19 = i37;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1114 */             i40 = i1 * i40;
/* 1115 */             i48 = i40 + 1;
/* 1116 */             i46 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             do
/*      */             {
/* 1123 */               i41 = i46 << 1;
/* 1124 */               i45 = i41 + 2;
/* 1125 */               paramInt4 = paramInt3 + (i48 + i41 << 2);
/* 1126 */               paramInt5 = paramInt3 + (i40 + i41 << 2);
/* 1127 */               i50 = MainMemory.getI32(paramInt5);
/* 1128 */               i42 = MainMemory.getI32(paramInt4);
/* 1129 */               i42 = (i42 > -1 ? i24 : i19) + i42 & i23;
/* 1130 */               i43 = i42 & i21;
/* 1131 */               i50 = (i50 > -1 ? 0 - i43 : i43) + i50;
/* 1132 */               MainMemory.setI32(paramInt4, i50 + i42 >> i31);
/* 1133 */               MainMemory.setI32(paramInt5, i50 - i42 >> i31);
/* 1134 */               i46 += 1;
/* 1135 */             } while (i39 > i45);
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
/* 1146 */             i19 = i37 + 2 + i41;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1154 */           if (i38 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1164 */             paramInt4 = paramInt3 + (i19 << 2);
/* 1165 */             MainMemory.setI32(paramInt4, MainMemory.getI32(paramInt4) >> i31);
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/* 1171 */         i19 = i28 << 1;
/* 1172 */         i24 = i30 << 1;
/* 1173 */         i21 = i20 >> 1;
/* 1174 */         i23 = i22 >> 1;
/* 1175 */         i18 += 1;
/* 1176 */         if (i18 == i17) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/* 1181 */         i28 = i25;
/* 1182 */         i38 = i19;
/* 1183 */         i30 = i24;
/*      */         
/*      */ 
/* 1186 */         i37 = i26;
/* 1187 */         i19 = i32;
/*      */         
/* 1189 */         i20 = i21;
/* 1190 */         i21 = i20;
/* 1191 */         i22 = i23;
/* 1192 */         i23 = i22;
/* 1193 */         i24 = i25;
/*      */       }
/*      */       
/*      */ 
/*      */       label4443:
/*      */       
/*      */ 
/* 1200 */       free.call(paramInt1);
/* 1201 */       paramInt2 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */       label4454:
/*      */       
/*      */ 
/* 1208 */       MainMemory.setI32(paramInt7, paramInt2);
/* 1209 */       i = paramInt2;
/*      */       
/*      */ 
/*      */       break label4511;
/*      */       
/*      */       label4473:
/*      */       
/* 1216 */       i = i1;
/*      */       
/*      */ 
/*      */       break label4511;
/*      */       
/*      */       label4487:
/*      */       
/* 1223 */       ffxmsg.call(5, 57120);
/* 1224 */       MainMemory.setI32(paramInt7, 414);
/* 1225 */       i = 414;
/*      */       
/*      */ 
/*      */       label4511:
/*      */       
/*      */ 
/* 1231 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1236 */       MainMemory.dealloc_generated(i59);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hdecompress.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */