/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*      */ 
/*      */ public final class fits_translate_pixkeyword extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3225;
/*   12 */   public static final Function _instance = new fits_translate_pixkeyword();
/*   13 */   public final Function resolve() { return _instance; }
/*      */   
/*   15 */   public fits_translate_pixkeyword() { super("fits_translate_pixkeyword", 11, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*      */   {
/*   19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11);
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
/*   55 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6);
/*   59 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*      */   {
/*   65 */     int i = 0;
/*   66 */     int j = 0;
/*   67 */     int k = 0;
/*   68 */     byte b1 = 0;
/*   69 */     int m = 0;
/*   70 */     int n = 0;
/*   71 */     int i1 = 0;
/*   72 */     int i2 = 0;
/*   73 */     int i3 = 0;
/*   74 */     int i4 = 0;
/*   75 */     int i5 = 0;
/*   76 */     int i6 = 0;
/*   77 */     byte b2 = 0;
/*   78 */     int i7 = 0;
/*   79 */     int i8 = 0;
/*   80 */     byte b3 = 0;
/*   81 */     int i9 = 0;
/*   82 */     int i10 = 0;
/*   83 */     int i11 = 0;
/*   84 */     int i12 = 0;
/*   85 */     int i13 = 0;
/*   86 */     int i14 = 0;
/*   87 */     int i15 = 0;
/*   88 */     int i16 = 0;
/*   89 */     int i17 = 0;
/*   90 */     int i18 = 0;
/*   91 */     int i19 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   97 */       if (MainMemory.getI32(paramInt11) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  107 */         if ((paramInt1 != 0) && (paramInt2 != 0)) {
/*      */           break label137;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  117 */         MainMemory.setI32(paramInt11, 115);
/*      */         
/*      */ 
/*      */         break label2740;
/*      */         
/*      */         label137:
/*      */         
/*  124 */         MainMemory.setI8(paramInt2, (byte)0);
/*  125 */         if (MainMemory.getI8(paramInt1) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  135 */           paramInt11 = paramInt4 + 4;
/*  136 */           i = paramInt4 + 8;
/*  137 */           j = paramInt4 + 12;
/*  138 */           i14 = 0;
/*  139 */           i13 = 0;
/*  140 */           i9 = 0;
/*  141 */           i11 = 0;
/*  142 */           i15 = 0;
/*  143 */           b2 = 32;
/*  144 */           b3 = 0;
/*  145 */           i12 = 0;
/*  146 */           i7 = 0;
/*  147 */           i10 = 0;
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
/*  163 */             if (i12 >= 99)
/*      */             {
/*      */ 
/*      */ 
/*  167 */               i8 = i14;
/*  168 */               i10 = i13;
/*  169 */               i13 = i9;
/*  170 */               i14 = i11;
/*      */               
/*  172 */               b1 = b2;
/*  173 */               i11 = i7;
/*  174 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  180 */             k = MainMemory.getI32(paramInt3 + (i12 << 3));
/*  181 */             b1 = MainMemory.getI8(k);
/*  182 */             if (b1 == 42) {
/*  183 */               i8 = 0;
/*  184 */               i10 = 0;
/*  185 */               i13 = i9;
/*  186 */               i14 = i11;
/*      */               
/*  188 */               b1 = 32;
/*  189 */               i11 = 1;
/*  190 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  199 */             if ((i10 != 0) && (b1 == b3)) {
/*  200 */               i14 = 0;
/*  201 */               i13 = 0;
/*  202 */               i7 = i9;
/*  203 */               i8 = i11;
/*      */               
/*  205 */               b2 = 32;
/*  206 */               b1 = b3;
/*  207 */               i3 = 0;
/*      */               break label1446;
/*      */             }
/*      */             else {
/*  211 */               b2 = b1;
/*  212 */               i14 = 0;
/*  213 */               i13 = 0;
/*  214 */               i7 = i9;
/*  215 */               i8 = i11;
/*      */               
/*  217 */               b3 = 32;
/*  218 */               i9 = 0;
/*  219 */               i10 = 0;
/*  220 */               i3 = 0;
/*  221 */               i11 = 1;
/*      */             }
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
/*      */             for (;;)
/*      */             {
/*  240 */               if ((b2 == 0) || (i10 >= 8))
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  245 */                 i1 = i8;
/*  246 */                 i8 = i10;
/*  247 */                 i9 = i3;
/*  248 */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  254 */               m = MainMemory.getI8(paramInt1 + i10);
/*  255 */               switch (b2)
/*      */               {
/*      */               case 105: 
/*      */                 break label550;
/*      */                 
/*      */                 break;
/*      */               case 106: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/*  266 */               i1 = m;
/*  267 */               if ((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (i1 << 1)) & 0xFFFF & 0x800) != 0)
/*      */               {
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
/*  281 */                 i14 = i1 + -48;
/*  282 */                 i11 = 1;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label1270;
/*      */                 
/*      */ 
/*      */ 
/*      */                 label550:
/*      */                 
/*      */ 
/*      */ 
/*  294 */                 i1 = m;
/*  295 */                 if ((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (i1 << 1)) & 0xFFFF & 0x800) != 0)
/*      */                 {
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
/*  309 */                   i13 = i1 + -48;
/*  310 */                   i11 = 1;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   break label1270;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  322 */                   if ((!MathUtils.ult((byte)(b2 + -108), (byte)3)) && (b2 != 35)) {
/*      */                     break label1071;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  332 */                   n = MainMemory.getI32(__ctype_b_loc.call());
/*  333 */                   if ((MainMemory.getI16(n + (m << 1)) & 0xFFFF & 0x800) == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  339 */                     b2 = b3;
/*      */                     
/*  341 */                     i3 = 0;
/*  342 */                     i10 = i11;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     break label1446;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*  352 */                   i1 = i10 + 1;
/*  353 */                   i2 = 0;
/*  354 */                   i3 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  364 */                     i4 = i10 + i2;
/*  365 */                     i5 = paramInt1 + (i1 + i2);
/*  366 */                     if (i4 <= 7)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  376 */                       i6 = m;
/*  377 */                       if ((MainMemory.getI16(n + (i6 << 1)) & 0xFFFF & 0x800) != 0) {
/*      */                         break label1035;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  387 */                     i10 = i4 + -1;
/*  388 */                     if (!MathUtils.ult((byte)(b2 + -109), (byte)2)) {
/*      */                       break label995;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  398 */                     if (!MathUtils.ult(i3 + -1, 999))
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  407 */                       b2 = b3;
/*      */                       
/*  409 */                       i3 = 0;
/*  410 */                       i10 = i11;
/*      */                       
/*      */ 
/*      */                       break label1446;
/*      */                     }
/*      */                     
/*      */ 
/*  417 */                     if (MainMemory.getI32(paramInt4) == i3) {
/*  418 */                       i1 = 1;
/*  419 */                       i3 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*  429 */                     else if (MainMemory.getI32(paramInt11) == i3) {
/*  430 */                       i1 = 2;
/*  431 */                       i3 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*  441 */                     else if (MainMemory.getI32(i) == i3) {
/*  442 */                       i1 = 3;
/*  443 */                       i3 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*  453 */                     else if (MainMemory.getI32(j) == i3) {
/*  454 */                       i1 = 4;
/*  455 */                       i3 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*  465 */                       i1 = 0;
/*  466 */                       i3 = 0;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  474 */                     if (b2 == 110) {
/*  475 */                       i7 = i1;
/*      */                       
/*      */ 
/*      */ 
/*  479 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  489 */                     i8 = i1;
/*      */                     
/*      */ 
/*  492 */                     break;
/*      */                     
/*      */                     label995:
/*      */                     
/*  496 */                     if (b2 != 108)
/*      */                     {
/*      */ 
/*      */ 
/*  500 */                       i11 = 1;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       break label1270;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  514 */                     i11 = 1;
/*      */                     
/*      */ 
/*  517 */                     i15 = i3;
/*      */                     
/*      */ 
/*      */                     break label1270;
/*      */                     
/*      */ 
/*      */                     label1035:
/*      */                     
/*      */ 
/*  526 */                     i3 = i3 * 10 + -48 + i6;
/*  527 */                     m = MainMemory.getI8(i5);
/*  528 */                     i2 += 1;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */                   label1071:
/*      */                   
/*      */ 
/*  536 */                   switch (b2) {
/*      */                   case 97: 
/*      */                     break;
/*  539 */                   case 63:  i11 = 1;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     break label1270;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*      */ 
/*      */ 
/*  555 */                   i16 = m == 32 ? 1 : 0;
/*  556 */                   if (MathUtils.or((byte)((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (m << 1)) & 0xFFFF) >>> 8 & 0x1), (byte)(i16 != 0 ? 1 : 0)) != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  564 */                     i11 = 1;
/*      */                     
/*  566 */                     b3 = m;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     break label1270;
/*      */                   }
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  582 */               if (i3 == 0)
/*      */               {
/*  584 */                 i1 = i8;
/*  585 */                 i8 = i10;
/*  586 */                 i9 = i3;
/*  587 */                 break;
/*      */               } else {
/*  589 */                 i11 = i3;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 break label1270;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  603 */               if (m == b2) {
/*  604 */                 i11 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  620 */                 b2 = b3;
/*      */                 
/*  622 */                 i3 = 0;
/*  623 */                 i10 = i11;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 break label1446;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label1270:
/*      */               
/*      */ 
/*      */ 
/*  638 */               i9 += 1;
/*  639 */               i10 += 1;
/*  640 */               b2 = MainMemory.getI8(k + i9);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  650 */               i3 = i11;
/*  651 */               i11 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  660 */             if (i9 == 0)
/*      */             {
/*      */ 
/*      */ 
/*  664 */               i8 = i1;
/*      */               
/*  666 */               b2 = b3;
/*      */               
/*  668 */               i3 = i9;
/*  669 */               i10 = i11;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  679 */               if (i8 > 7) {
/*  680 */                 i8 = i14;
/*  681 */                 i10 = i13;
/*  682 */                 i13 = i7;
/*  683 */                 i14 = i1;
/*      */                 
/*  685 */                 b1 = b3;
/*  686 */                 i11 = i9;
/*  687 */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  696 */               if (MainMemory.getI8(paramInt1 + i8) == 32) {
/*  697 */                 i8 = i14;
/*  698 */                 i10 = i13;
/*  699 */                 i13 = i7;
/*  700 */                 i14 = i1;
/*      */                 
/*  702 */                 b1 = b3;
/*  703 */                 i11 = i9;
/*  704 */                 break;
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*  709 */                 i8 = i1;
/*      */                 
/*  711 */                 b2 = b3;
/*      */                 
/*  713 */                 i3 = i9;
/*  714 */                 i10 = i11;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label1446:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  731 */             i12 += 1;
/*      */             
/*      */ 
/*  734 */             i9 = i7;
/*  735 */             i11 = i8;
/*      */             
/*      */ 
/*  738 */             b3 = b1;
/*      */             
/*  740 */             i7 = i3;
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
/*  753 */           if (paramInt6 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  763 */             MainMemory.setI32(paramInt6, i10);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  769 */           if (paramInt7 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  779 */             MainMemory.setI32(paramInt7, i8);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  785 */           if (paramInt8 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  795 */             MainMemory.setI32(paramInt8, i13);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  801 */           if (paramInt9 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  811 */             MainMemory.setI32(paramInt9, i14);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  817 */           if (paramInt10 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  827 */             MainMemory.setI32(paramInt10, i15);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  833 */           if (paramInt5 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  843 */             MainMemory.setI32(paramInt5, i12);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  849 */           k = MainMemory.getI32(paramInt3 + (i12 << 3) + 4);
/*  850 */           if (i11 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  860 */             switch (MainMemory.getI8(k))
/*      */             {
/*      */             case 0: 
/*      */               break label2714;
/*      */               
/*      */               break;
/*      */             case 45: 
/*      */               break label2714;
/*      */               break;
/*      */             }
/*      */             
/*  871 */             com.emt.proteus.runtime.api.SystemLibrary.strcpy(paramInt2, paramInt1);
/*  872 */             m = MainMemory.getI8(k);
/*  873 */             switch (m) {
/*      */             case 43:  break label2714;
/*      */               break; case 0:  i12 = 0;
/*      */               
/*      */ 
/*      */               break label2661;
/*      */               
/*      */ 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*  885 */             i16 = i13 > 0 ? 1 : 0;
/*  886 */             i17 = i14 > 0 ? 1 : 0;
/*  887 */             i18 = i15 > -1 ? 1 : 0;
/*  888 */             i19 = i15 > 0 ? 1 : 0;
/*  889 */             b3 = (byte)((byte)i10 + 48);
/*  890 */             b2 = (byte)((byte)i8 + 48);
/*      */             
/*  892 */             i11 = 0;
/*  893 */             i12 = 1;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  902 */         paramInt1 = k + i12;
/*  903 */         switch (m)
/*      */         {
/*      */         case 105: 
/*      */           break label1939;
/*      */           
/*      */           break;
/*      */         case 106: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  914 */         MainMemory.setI8(paramInt2 + i11, b2);
/*      */         
/*      */         break label2607;
/*      */         
/*      */         label1939:
/*      */         
/*  920 */         MainMemory.setI8(paramInt2 + i11, b3);
/*      */         
/*      */ 
/*      */         break label2607;
/*      */         
/*      */ 
/*  926 */         if ((m != 110) || (i16 == 0)) {
/*      */           break label2156;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  936 */         if (i16 != 0) {
/*  937 */           i9 = 1;
/*      */         } else {
/*      */           break label2140;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  949 */           i7 = i9 * 10;
/*  950 */           if (i13 / i7 <= 0) break;
/*  951 */           i9 = i7;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  961 */         if (i7 <= 9) {
/*      */           break label2140;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  972 */         i9 = i11 + 1;
/*  973 */         i8 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  982 */           i10 = i7 / 10;
/*  983 */           MainMemory.setI8(paramInt2 + (i11 + i8), (byte)((byte)(i13 / i10 % 10) + 48));
/*  984 */           i3 = i8 + 1;
/*  985 */           if (i7 <= 99) break;
/*  986 */           i8 = i3;
/*  987 */           i7 = i10;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  997 */         i11 = i9 + i8;
/*      */         
/*      */ 
/*      */ 
/*      */         label2140:
/*      */         
/*      */ 
/*      */ 
/* 1005 */         i11 += -1;
/*      */         
/*      */         break label2607;
/*      */         
/*      */         label2156:
/*      */         
/* 1011 */         if ((m != 109) || (i17 == 0)) {
/*      */           break label2354;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1021 */         if (i17 != 0) {
/* 1022 */           i9 = 1;
/*      */         } else {
/*      */           break label2338;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1034 */           i7 = i9 * 10;
/* 1035 */           if (i14 / i7 <= 0) break;
/* 1036 */           i9 = i7;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1046 */         if (i7 <= 9) {
/*      */           break label2338;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1057 */         i9 = i11 + 1;
/* 1058 */         i8 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1067 */           i10 = i7 / 10;
/* 1068 */           MainMemory.setI8(paramInt2 + (i11 + i8), (byte)((byte)(i14 / i10 % 10) + 48));
/* 1069 */           i3 = i8 + 1;
/* 1070 */           if (i7 <= 99) break;
/* 1071 */           i8 = i3;
/* 1072 */           i7 = i10;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1082 */         i11 = i9 + i8;
/*      */         
/*      */ 
/*      */ 
/*      */         label2338:
/*      */         
/*      */ 
/*      */ 
/* 1090 */         i11 += -1;
/*      */         
/*      */         break label2607;
/*      */         
/*      */         label2354:
/*      */         
/* 1096 */         if ((m != 108) || (i18 == 0)) {
/*      */           break label2552;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1106 */         if (i19 != 0) {
/* 1107 */           i9 = 1;
/*      */         } else {
/*      */           break label2536;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1119 */           i7 = i9 * 10;
/* 1120 */           if (i15 / i7 <= 0) break;
/* 1121 */           i9 = i7;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1131 */         if (i7 <= 9) {
/*      */           break label2536;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1142 */         i9 = i11 + 1;
/* 1143 */         i8 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1152 */           i10 = i7 / 10;
/* 1153 */           MainMemory.setI8(paramInt2 + (i11 + i8), (byte)((byte)(i15 / i10 % 10) + 48));
/* 1154 */           i3 = i8 + 1;
/* 1155 */           if (i7 <= 99) break;
/* 1156 */           i8 = i3;
/* 1157 */           i7 = i10;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1167 */         i11 = i9 + i8;
/*      */         
/*      */ 
/*      */ 
/*      */         label2536:
/*      */         
/*      */ 
/*      */ 
/* 1175 */         i11 += -1;
/*      */         
/*      */         break label2607;
/*      */         
/*      */         label2552:
/*      */         
/* 1181 */         i5 = paramInt2 + i11;
/* 1182 */         if (m != 97) {
/*      */           break label2595;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1192 */         MainMemory.setI8(i5, b1);
/*      */         
/*      */         break label2607;
/*      */         
/*      */         label2595:
/*      */         
/* 1198 */         MainMemory.setI8(i5, m);
/*      */         
/*      */ 
/*      */ 
/*      */         label2607:
/*      */         
/*      */ 
/*      */ 
/* 1206 */         i11 += 1;
/* 1207 */         m = MainMemory.getI8(paramInt1);
/* 1208 */         if (m != 0) {
/*      */           break label2724;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1218 */         if (i11 < 8) {
/* 1219 */           i12 = i11;
/*      */         } else {
/*      */           break label2714;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2661:
/*      */         
/*      */ 
/*      */ 
/* 1230 */         i13 = 8 - i12;
/* 1231 */         i14 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1238 */           MainMemory.setI8(paramInt2 + (i12 + i14), (byte)32);
/* 1239 */           i14 += 1;
/* 1240 */           if (i14 == i13) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2714:
/*      */         
/*      */ 
/*      */ 
/* 1251 */         break;
/*      */         
/*      */ 
/*      */         label2724:
/*      */         
/*      */ 
/* 1257 */         i12 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label2740:
/*      */       
/*      */ 
/* 1264 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_translate_pixkeyword.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */