/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*      */ 
/*      */ public final class fits_translate_keyword extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3226;
/*   12 */   public static final Function _instance = new fits_translate_keyword();
/*   13 */   public final Function resolve() { return _instance; }
/*      */   
/*   15 */   public fits_translate_keyword() { super("fits_translate_keyword", 10, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*   20 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   26 */     paramInt4 += 2;
/*   27 */     paramInt3--;
/*   28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   29 */     paramInt4 += 2;
/*   30 */     paramInt3--;
/*   31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*   56 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   62 */     int i = 0;
/*   63 */     byte b1 = 0;
/*   64 */     int j = 0;
/*   65 */     int k = 0;
/*   66 */     int m = 0;
/*   67 */     int n = 0;
/*   68 */     int i1 = 0;
/*   69 */     int i2 = 0;
/*   70 */     int i3 = 0;
/*   71 */     int i4 = 0;
/*   72 */     int i5 = 0;
/*   73 */     int i6 = 0;
/*   74 */     byte b2 = 0;
/*   75 */     int i7 = 0;
/*   76 */     int i8 = 0;
/*   77 */     int i9 = 0;
/*   78 */     int i10 = 0;
/*   79 */     int i11 = 0;
/*   80 */     int i12 = 0;
/*   81 */     int i13 = 0;
/*   82 */     int i14 = 0;
/*   83 */     byte b3 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   89 */       if (MainMemory.getI32(paramInt10) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   99 */         if ((paramInt1 != 0) && (paramInt2 != 0)) {
/*      */           break label122;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  109 */         MainMemory.setI32(paramInt10, 115);
/*      */         
/*      */ 
/*      */         break label2344;
/*      */         
/*      */         label122:
/*      */         
/*  116 */         MainMemory.setI8(paramInt2, (byte)0);
/*  117 */         if (MainMemory.getI8(paramInt1) != 0)
/*      */         {
/*      */ 
/*      */ 
/*  121 */           i7 = 0;
/*  122 */           i5 = 0;
/*  123 */           i6 = 0;
/*  124 */           i12 = 0;
/*  125 */           b3 = 32;
/*  126 */           b2 = 0;
/*  127 */           i11 = 0;
/*  128 */           i10 = 0;
/*  129 */           i4 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  136 */           com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt1, 43584, 9, 1);
/*  137 */           i7 = 0;
/*  138 */           i5 = 0;
/*  139 */           i6 = 0;
/*  140 */           i12 = 0;
/*  141 */           b3 = 32;
/*  142 */           b2 = 0;
/*  143 */           i11 = 0;
/*  144 */           i10 = 0;
/*  145 */           i4 = 0;
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
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  160 */           if (i11 >= 70)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  165 */             i4 = i5;
/*  166 */             i5 = i6;
/*      */             
/*  168 */             b1 = b3;
/*  169 */             i6 = i10;
/*  170 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  176 */           i = MainMemory.getI32(paramInt3 + (i11 << 3));
/*  177 */           b1 = MainMemory.getI8(i);
/*  178 */           if (b1 == 42) {
/*  179 */             i7 = 0;
/*  180 */             i4 = 0;
/*  181 */             i5 = -1;
/*  182 */             i12 = -1;
/*  183 */             b1 = 32;
/*  184 */             i6 = 1;
/*  185 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  194 */           if ((i4 != 0) && (b1 == b2)) {
/*  195 */             i7 = 0;
/*  196 */             i5 = 0;
/*  197 */             i6 = -1;
/*  198 */             i12 = -1;
/*  199 */             b3 = 32;
/*  200 */             b1 = b2;
/*  201 */             i8 = 0;
/*      */             break label1306;
/*      */           }
/*      */           else {
/*  205 */             b3 = b1;
/*  206 */             i4 = 0;
/*  207 */             i5 = 0;
/*  208 */             i6 = -1;
/*  209 */             i12 = -1;
/*  210 */             b2 = 32;
/*  211 */             i7 = 0;
/*  212 */             i8 = 0;
/*  213 */             i9 = 0;
/*  214 */             i10 = 1;
/*      */           }
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
/*  232 */             if ((b3 == 0) || (i8 >= 8)) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  242 */             j = MainMemory.getI8(paramInt1 + i8);
/*  243 */             switch (b3)
/*      */             {
/*      */             case 105: 
/*      */               break label530;
/*      */               
/*      */               break;
/*      */             case 106: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*  254 */             m = j;
/*  255 */             if ((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (m << 1)) & 0xFFFF & 0x800) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  265 */               i4 = m + -48;
/*  266 */               i10 = 1;
/*      */               
/*      */ 
/*      */ 
/*      */               break label1138;
/*      */               
/*      */ 
/*      */ 
/*      */               label530:
/*      */               
/*      */ 
/*  277 */               m = j;
/*  278 */               if ((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (m << 1)) & 0xFFFF & 0x800) != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  288 */                 i5 = m + -48;
/*  289 */                 i10 = 1;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 break label1138;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  300 */                 if ((!MathUtils.ult((byte)(b3 + -109), (byte)2)) && (b3 != 35)) {
/*      */                   break label931;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  310 */                 k = MainMemory.getI32(__ctype_b_loc.call());
/*  311 */                 if ((MainMemory.getI16(k + (j << 1)) & 0xFFFF & 0x800) == 0) {
/*  312 */                   i7 = i4;
/*      */                   
/*      */ 
/*      */ 
/*  316 */                   b3 = b2;
/*      */                   
/*  318 */                   i8 = 0;
/*  319 */                   i4 = i10;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   break label1306;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*  329 */                 m = i8 + 1;
/*  330 */                 n = 0;
/*      */                 
/*  332 */                 i9 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  341 */                   i1 = i8 + n;
/*  342 */                   i2 = paramInt1 + (m + n);
/*  343 */                   if (i1 <= 7)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  353 */                     i3 = j;
/*  354 */                     if ((MainMemory.getI16(k + (i3 << 1)) & 0xFFFF & 0x800) != 0) {
/*      */                       break label895;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  364 */                   i8 = i1 + -1;
/*  365 */                   switch (b3) {
/*      */                   case 110: 
/*      */                     break label836;
/*      */                     break;
/*      */                   case 109:  break; default:  i10 = 1;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  376 */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  383 */                   i10 = 1;
/*      */                   
/*      */ 
/*  386 */                   i12 = i9;
/*      */                   
/*      */ 
/*      */ 
/*  390 */                   break;
/*      */                   
/*      */                   label836:
/*      */                   
/*  394 */                   if ((MathUtils.ult(i9 + -1, 999)) && (i9 == paramInt4)) {
/*  395 */                     i10 = 1;
/*      */                     
/*      */ 
/*      */ 
/*  399 */                     i6 = i9;
/*      */                     
/*      */ 
/*  402 */                     break;
/*      */                   } else {
/*  404 */                     i7 = i4;
/*      */                     
/*      */ 
/*      */ 
/*  408 */                     b3 = b2;
/*      */                     
/*  410 */                     i8 = 0;
/*  411 */                     i4 = i10;
/*      */                     
/*      */                     break label1306;
/*      */                   }
/*      */                   
/*      */                   label895:
/*      */                   
/*  418 */                   i9 = i3 + -48 + i9 * 10;
/*  419 */                   j = MainMemory.getI8(i2);
/*  420 */                   n += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label931:
/*      */                 
/*      */ 
/*  428 */                 switch (b3) {
/*      */                 case 97: 
/*      */                   break;
/*  431 */                 case 63:  i10 = 1;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   break label1138;
/*      */                   
/*      */ 
/*      */ 
/*      */                   break;
/*      */                 }
/*      */                 
/*      */                 
/*      */ 
/*      */ 
/*  446 */                 i13 = j == 32 ? 1 : 0;
/*  447 */                 if (MathUtils.or((byte)((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (j << 1)) & 0xFFFF) >>> 8 & 0x1), (byte)(i13 != 0 ? 1 : 0)) != 0)
/*      */                 {
/*      */ 
/*      */ 
/*  451 */                   i10 = 1;
/*      */                   
/*  453 */                   b2 = j;
/*      */                   
/*      */ 
/*      */ 
/*      */                   break label1138;
/*      */                 }
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  464 */             if (i9 == 0) {
/*  465 */               i7 = i4;
/*      */               
/*      */ 
/*      */ 
/*  469 */               b3 = b2;
/*      */               
/*  471 */               i8 = i9;
/*  472 */               i4 = i10;
/*      */               break label1306;
/*      */             } else {
/*  475 */               i10 = i9;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               break label1138;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  488 */             if (j == b3) {
/*  489 */               i10 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  499 */               i7 = i4;
/*      */               
/*      */ 
/*      */ 
/*  503 */               b3 = b2;
/*      */               
/*  505 */               i8 = 0;
/*  506 */               i4 = i10;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               break label1306;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label1138:
/*      */             
/*      */ 
/*      */ 
/*  520 */             i7 += 1;
/*  521 */             i8 += 1;
/*  522 */             b3 = MainMemory.getI8(i + i7);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  531 */             i9 = i10;
/*  532 */             i10 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*  537 */           if (i9 == 0) {
/*  538 */             i7 = i4;
/*      */             
/*      */ 
/*      */ 
/*  542 */             b3 = b2;
/*      */             
/*  544 */             i8 = i9;
/*  545 */             i4 = i10;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  555 */             if (i8 > 7) {
/*  556 */               i7 = i4;
/*  557 */               i4 = i5;
/*  558 */               i5 = i6;
/*      */               
/*  560 */               b1 = b2;
/*  561 */               i6 = i9;
/*  562 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  571 */             if (MainMemory.getI8(paramInt1 + i8) == 32) {
/*  572 */               i7 = i4;
/*  573 */               i4 = i5;
/*  574 */               i5 = i6;
/*      */               
/*  576 */               b1 = b2;
/*  577 */               i6 = i9;
/*  578 */               break;
/*      */             } else {
/*  580 */               i7 = i4;
/*      */               
/*      */ 
/*      */ 
/*  584 */               b3 = b2;
/*      */               
/*  586 */               i8 = i9;
/*  587 */               i4 = i10;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1306:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  603 */           i11 += 1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  609 */           b2 = b1;
/*      */           
/*  611 */           i10 = i8;
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
/*      */ 
/*  623 */         if (paramInt6 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  633 */           MainMemory.setI32(paramInt6, i4);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  639 */         if (paramInt7 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  649 */           MainMemory.setI32(paramInt7, i7);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  655 */         if (paramInt9 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  665 */           MainMemory.setI32(paramInt9, i5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  671 */         if (paramInt8 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  681 */           MainMemory.setI32(paramInt8, i12);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  687 */         if (paramInt5 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  697 */           MainMemory.setI32(paramInt5, i11);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  703 */         i = MainMemory.getI32(paramInt3 + (i11 << 3) + 4);
/*  704 */         if (i6 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  714 */           switch (MainMemory.getI8(i))
/*      */           {
/*      */           case 0: 
/*      */             break label2318;
/*      */             
/*      */             break;
/*      */           case 45: 
/*      */             break label2318;
/*      */             break;
/*      */           }
/*      */           
/*  725 */           com.emt.proteus.runtime.api.SystemLibrary.strcpy(paramInt2, paramInt1);
/*  726 */           j = MainMemory.getI8(i);
/*  727 */           switch (j) {
/*      */           case 43:  break label2318;
/*      */             break; case 0:  paramInt4 = 0;
/*      */             
/*      */ 
/*      */             break label2267;
/*      */             
/*      */ 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  739 */           i13 = i12 > -1 ? 1 : 0;
/*  740 */           i14 = i12 > 0 ? 1 : 0;
/*  741 */           b2 = (byte)((byte)i4 + 48);
/*  742 */           b3 = (byte)((byte)i7 + 48);
/*      */           
/*  744 */           i6 = 0;
/*  745 */           i11 = 1;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  756 */         paramInt1 = i + i11;
/*  757 */         switch (j)
/*      */         {
/*      */         case 105: 
/*      */           break label1942;
/*      */           break;
/*      */         case 106: 
/*      */           break label1923;
/*      */           break;
/*      */         case 110: 
/*      */           break;
/*      */         }
/*      */         
/*  769 */         i5 = i5 == -1 ? paramInt4 : i5;
/*  770 */         if (i5 > 0) {
/*  771 */           i7 = 1;
/*      */         } else {
/*      */           break label2214;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  784 */           i10 = i7 * 10;
/*  785 */           if (i5 / i10 <= 0) break;
/*  786 */           i7 = i10;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  796 */         if (i10 <= 9) {
/*      */           break label1907;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  807 */         i7 = i6 + 1;
/*  808 */         i4 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  817 */           i8 = i10 / 10;
/*  818 */           MainMemory.setI8(paramInt2 + (i6 + i4), (byte)((byte)(i5 / i8 % 10) + 48));
/*  819 */           i9 = i4 + 1;
/*  820 */           if (i10 <= 99) break;
/*  821 */           i4 = i9;
/*  822 */           i10 = i8;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  832 */         i6 = i7 + i4;
/*      */         
/*      */ 
/*      */ 
/*      */         label1907:
/*      */         
/*      */ 
/*      */ 
/*  840 */         i6 += -1;
/*      */         
/*      */ 
/*      */         break label2214;
/*      */         
/*      */         label1923:
/*      */         
/*  847 */         MainMemory.setI8(paramInt2 + i6, b3);
/*      */         
/*      */ 
/*      */         break label2214;
/*      */         
/*      */         label1942:
/*      */         
/*  854 */         MainMemory.setI8(paramInt2 + i6, b2);
/*      */         
/*      */ 
/*      */ 
/*      */         break label2214;
/*      */         
/*      */ 
/*  861 */         if ((j != 109) || (i13 == 0)) {
/*      */           break label2159;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  871 */         if (i14 != 0) {
/*  872 */           i7 = 1;
/*      */         } else {
/*      */           break label2143;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  884 */           i10 = i7 * 10;
/*  885 */           if (i12 / i10 <= 0) break;
/*  886 */           i7 = i10;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  896 */         if (i10 <= 9) {
/*      */           break label2143;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  907 */         i7 = i6 + 1;
/*  908 */         i4 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  917 */           i8 = i10 / 10;
/*  918 */           MainMemory.setI8(paramInt2 + (i6 + i4), (byte)((byte)(i12 / i8 % 10) + 48));
/*  919 */           i9 = i4 + 1;
/*  920 */           if (i10 <= 99) break;
/*  921 */           i4 = i9;
/*  922 */           i10 = i8;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  932 */         i6 = i7 + i4;
/*      */         
/*      */ 
/*      */ 
/*      */         label2143:
/*      */         
/*      */ 
/*      */ 
/*  940 */         i6 += -1;
/*      */         
/*      */ 
/*      */         break label2214;
/*      */         
/*      */         label2159:
/*      */         
/*  947 */         i2 = paramInt2 + i6;
/*  948 */         if (j != 97) {
/*      */           break label2202;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  958 */         MainMemory.setI8(i2, b1);
/*      */         
/*      */ 
/*      */         break label2214;
/*      */         
/*      */         label2202:
/*      */         
/*  965 */         MainMemory.setI8(i2, j);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2214:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  975 */         i6 += 1;
/*  976 */         j = MainMemory.getI8(paramInt1);
/*  977 */         if (j != 0) {
/*      */           break label2328;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  987 */         if (i6 < 8) {
/*  988 */           paramInt4 = i6;
/*      */         } else {
/*      */           break label2318;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2267:
/*      */         
/*      */ 
/*      */ 
/*  999 */         i11 = 8 - paramInt4;
/* 1000 */         i12 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1007 */           MainMemory.setI8(paramInt2 + (paramInt4 + i12), (byte)32);
/* 1008 */           i12 += 1;
/* 1009 */           if (i12 == i11) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2318:
/*      */         
/*      */ 
/*      */ 
/* 1020 */         break;
/*      */         
/*      */ 
/*      */         label2328:
/*      */         
/*      */ 
/* 1026 */         i11 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2344:
/*      */       
/*      */ 
/* 1034 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_translate_keyword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */