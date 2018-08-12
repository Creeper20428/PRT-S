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
/*      */ import com.emt.proteus.runtime.library.c.realloc;
/*      */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*      */ 
/*      */ public final class fits_read_ascii_region
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3598;
/*   19 */   public static final Function _instance = new fits_read_ascii_region();
/*   20 */   public final Function resolve() { return _instance; }
/*      */   
/*   22 */   public fits_read_ascii_region() { super("fits_read_ascii_region", 3, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   26 */     call(paramInt1, paramInt2, paramInt3);
/*   27 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   33 */     paramInt4 += 2;
/*   34 */     paramInt3--;
/*   35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   36 */     paramInt4 += 2;
/*   37 */     paramInt3--;
/*   38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   39 */     paramInt4 += 2;
/*   40 */     paramInt3--;
/*   41 */     call(i, j, k);
/*   42 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   48 */     int i = 0;
/*   49 */     int j = 0;
/*   50 */     int k = 0;
/*   51 */     int m = 0;
/*   52 */     int n = 0;
/*   53 */     int i1 = 0;
/*   54 */     int i2 = 0;
/*   55 */     int i3 = 0;
/*   56 */     int i4 = 0;
/*   57 */     int i5 = 0;
/*   58 */     int i6 = 0;
/*   59 */     int i7 = 0;
/*   60 */     int i8 = 0;
/*   61 */     int i9 = 0;
/*   62 */     int i10 = 0;
/*   63 */     int i11 = 0;
/*   64 */     int i12 = 0;
/*   65 */     int i13 = 0;
/*   66 */     int i14 = 0;
/*   67 */     int i15 = 0;
/*   68 */     int i16 = 0;
/*   69 */     int i17 = 0;
/*   70 */     int i18 = 0;
/*   71 */     int i19 = 0;
/*   72 */     int i20 = 0;
/*   73 */     int i21 = 0;
/*   74 */     int i22 = 0;
/*   75 */     int i23 = 0;
/*   76 */     int i24 = 0;
/*   77 */     int i25 = 0;
/*   78 */     int i26 = 0;
/*   79 */     double d1 = 0.0D;
/*   80 */     int i27 = 0;
/*   81 */     int i28 = 0;
/*   82 */     double d2 = 0.0D;
/*   83 */     int i29 = 0;
/*   84 */     double d3 = 0.0D;
/*   85 */     double d4 = 0.0D;
/*   86 */     int i30 = 0;
/*   87 */     int i31 = 0;
/*   88 */     double d5 = 0.0D;
/*   89 */     double d6 = 0.0D;
/*   90 */     int i32 = 0;
/*   91 */     int i33 = 0;
/*   92 */     int i34 = 0;
/*   93 */     int i35 = 0;
/*   94 */     boolean bool = false;
/*      */     
/*      */ 
/*   97 */     int i36 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  101 */       i = MainMemory.alloc(4);
/*  102 */       j = MainMemory.alloc(8);
/*  103 */       k = MainMemory.alloc(8);
/*  104 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*      */         break label7397;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  114 */       m = malloc.call(76);
/*  115 */       n = m;
/*  116 */       if (m != 0) {
/*      */         break label237;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  126 */       ffxmsg.call(5, 122720);
/*  127 */       MainMemory.setI32Aligned(470852, 113);
/*      */       
/*      */ 
/*      */       break label7402;
/*      */       
/*      */       label237:
/*      */       
/*  134 */       i1 = m;
/*  135 */       MainMemory.setI32(i1, 0);
/*  136 */       i2 = m + 4;
/*  137 */       MainMemory.setI32(i2, 0);
/*  138 */       i3 = paramInt2 == 0 ? 1 : 0;
/*  139 */       if (i3 == 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  149 */         if (MainMemory.getI32(paramInt2) != 0) {
/*      */           break label324;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  159 */       MainMemory.setI32(m + 8, 0);
/*      */       
/*      */       break label341;
/*      */       
/*      */       label324:
/*  164 */       SystemLibrary.memcpy(m + 8, paramInt2, 68, 4);
/*      */       
/*      */ 
/*      */       label341:
/*      */       
/*      */ 
/*  170 */       i13 = malloc.call(512);
/*  171 */       if (i13 != 0) {
/*      */         break label395;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  181 */       free.call(m);
/*  182 */       ffxmsg.call(5, 122720);
/*  183 */       MainMemory.setI32Aligned(470852, 113);
/*      */       
/*      */ 
/*      */       break label7402;
/*      */       
/*      */       label395:
/*      */       
/*  190 */       i4 = SystemLibrary.fopen(paramInt1, 14016);
/*  191 */       if (i4 != 0) {
/*      */         break label474;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  201 */       SystemLibrary.sprintf(i13, 77248, new Object[] { Integer.valueOf(paramInt1) });
/*  202 */       ffxmsg.call(5, i13);
/*  203 */       free.call(i13);
/*  204 */       free.call(m);
/*  205 */       MainMemory.setI32Aligned(470852, 104);
/*      */       
/*      */ 
/*      */       break label7402;
/*      */       
/*      */       label474:
/*      */       
/*  212 */       paramInt1 = paramInt2 + 60;
/*  213 */       i5 = paramInt2 + 52;
/*  214 */       i6 = paramInt2 + 44;
/*  215 */       i7 = paramInt2 + 36;
/*  216 */       i8 = paramInt2 + 28;
/*  217 */       i9 = paramInt2 + 20;
/*  218 */       i10 = paramInt2 + 12;
/*  219 */       i11 = paramInt2 + 4;
/*  220 */       i12 = 512;
/*      */       
/*  222 */       d5 = 0.0D;
/*  223 */       d6 = 0.0D;
/*  224 */       i15 = 0;
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
/*  255 */         if (SystemLibrary.fgets(i13, i12, i4) != 0) {
/*      */           break label592;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  265 */         fits_set_region_components.call(n);
/*  266 */         paramInt1 = i13;
/*      */         
/*      */         break label7111;
/*      */         
/*      */         label592:
/*  271 */         i21 = SystemLibrary.strlen(i13);
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
/*  283 */           if (i12 + -1 != i21) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  293 */           if (MainMemory.getI8(i13 + (i21 + -1)) == 10) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  303 */           i33 = i12 << 1;
/*  304 */           i14 = realloc.call(i13, i33);
/*  305 */           if (i14 != 0) {
/*      */             break label710;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  315 */           ffxmsg.call(5, 122720);
/*  316 */           MainMemory.setI32Aligned(470852, 113);
/*  317 */           paramInt1 = i13;
/*      */           
/*      */           break label7206;
/*      */           
/*      */           label710:
/*  322 */           i13 = i14 + i21;
/*  323 */           SystemLibrary.fgets(i13, i12 + 1, i4);
/*  324 */           i12 = SystemLibrary.strlen(i13) + i21;
/*  325 */           i21 = i12;
/*  326 */           i12 = i33;
/*  327 */           i13 = i14;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*  332 */         if (MainMemory.getI8(i13) != 35) {
/*      */           break label1165;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  342 */         i20 = MainMemory.getI32(__ctype_b_loc.call());
/*  343 */         i21 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  350 */           i33 = i21 + 1;
/*  351 */           i14 = i13 + i33;
/*  352 */           if ((MainMemory.getI16(i20 + (MainMemory.getI8(i14) << 1)) & 0xFFFF & 0x2000) == 0) {
/*      */             break;
/*      */           }
/*      */           
/*  356 */           i21 = i33;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  363 */         if (SystemLibrary.strncasecmp(i14, 40096, 7) != 0) {}
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
/*  375 */         if (MainMemory.getI32(i1) != 0) {
/*      */           break label1138;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  385 */         i14 = i13 + (i21 + 8);
/*  386 */         if ((MainMemory.getI16(i20 + (MainMemory.getI8(i14) << 1)) & 0xFFFF & 0x2000) != 0)
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
/*  397 */           i15 = i21 + 9;
/*  398 */           i21 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  405 */             i14 = i13 + (i15 + i21);
/*  406 */             i21 += 1;
/*  407 */             if ((MainMemory.getI16(i20 + (MainMemory.getI8(i14) << 1)) & 0xFFFF & 0x2000) == 0) {
/*      */               break;
/*      */             }
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
/*  420 */         if (SystemLibrary.strncasecmp(i14, 26240, 5) == 0)
/*      */         {
/*      */ 
/*  423 */           i15 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  433 */         else if (SystemLibrary.strncasecmp(i14, 32224, 6) == 0)
/*      */         {
/*      */ 
/*  436 */           i15 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  446 */         else if (SystemLibrary.strncasecmp(i14, 32256, 6) == 0)
/*      */         {
/*      */ 
/*  449 */           i15 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  459 */         else if (SystemLibrary.strncasecmp(i14, 17312, 3) == 0)
/*      */         {
/*      */ 
/*  462 */           i15 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  472 */           ffxmsg.call(5, 109152);
/*  473 */           MainMemory.setI32Aligned(470852, 431);
/*  474 */           paramInt1 = i13;
/*      */           
/*      */           break label7206;
/*      */           
/*      */           label1138:
/*  479 */           ffxmsg.call(5, 124448);
/*  480 */           MainMemory.setI32Aligned(470852, 431);
/*  481 */           paramInt1 = i13;
/*      */           
/*      */           break label7206;
/*      */           
/*      */           label1165:
/*  486 */           if (SystemLibrary.strncasecmp(i13, 20288, 4) != 0)
/*      */             break;
/*      */         }
/*      */       }
/*      */       break label1194;
/*  491 */       i14 = i13;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*      */         label1194:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  506 */         i24 = i14;
/*  507 */         i21 = i15;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  515 */           if (MainMemory.getI8(i24) == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  520 */             i15 = i21;
/*  521 */             break;
/*      */             break label1245; }
/*  523 */           i14 = i24;
/*  524 */           i26 = 0;
/*  525 */           i15 = 1;
/*  526 */           i33 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*      */             label1245:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  540 */             if (i33 != 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  550 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  560 */             i27 = MainMemory.getI8(i14);
/*  561 */             if (i27 == 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  571 */             switch (i27) {
/*      */             case 10: 
/*      */               break label1624;
/*      */               break;
/*      */             case 35: 
/*      */               break label1624;
/*      */               break;
/*      */             case 40: 
/*      */               break label1569;
/*      */               break;
/*      */             case 41: 
/*      */               break label1520;
/*      */               break;
/*      */             case 44: 
/*      */               break label1504;
/*      */               break; case 58:  break label1470;
/*      */               break; case 100:  break; }
/*  588 */             i14 += 1;
/*  589 */             if (i26 != 0)
/*      */             {
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
/*  608 */               i21 = 1;
/*  609 */               continue;
/*      */               
/*      */               label1470:
/*      */               
/*  613 */               i14 += 1;
/*  614 */               if (i26 != 0)
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  633 */                 i21 = 2;
/*  634 */                 continue;
/*      */                 
/*      */                 label1504:
/*      */                 
/*  638 */                 i15 += 1;
/*      */                 
/*      */                 break label1661;
/*      */                 
/*      */                 label1520:
/*      */                 
/*  644 */                 MainMemory.setI8(i14, (byte)0);
/*  645 */                 i14 += 1;
/*  646 */                 if (i26 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  653 */                   i33 = 1;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*  661 */                   MainMemory.setI32Aligned(470852, 1);
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  667 */                   continue;
/*      */                   
/*      */                   label1569:
/*      */                   
/*  671 */                   MainMemory.setI8(i14, (byte)0);
/*  672 */                   i25 = i14 + 1;
/*  673 */                   if (i26 == 0) {
/*  674 */                     i14 = i25;
/*  675 */                     i26 = i25;
/*      */ 
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
/*      */ 
/*  688 */                     MainMemory.setI32Aligned(470852, 1);
/*  689 */                     i14 = i25;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  694 */                     continue;
/*      */                     
/*      */                     label1624:
/*      */                     
/*  698 */                     MainMemory.setI8(i14, (byte)0);
/*  699 */                     if (i26 != 0) {}
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
/*  717 */                     i33 = 1;
/*      */                     
/*  719 */                     continue;
/*      */                     
/*      */ 
/*      */                     label1661:
/*      */                     
/*  724 */                     i14 += 1;
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  734 */           if (MathUtils.or((byte)(MainMemory.getI32Aligned(470852) != 0 ? 1 : 0), (byte)(i33 ^ 0x1)) != 0) {
/*      */             break label7184;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  744 */           i16 = __ctype_b_loc.call();
/*  745 */           i20 = MainMemory.getI32(i16);
/*  746 */           i27 = MainMemory.getI8(i24);
/*  747 */           if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */           {
/*      */             break label1827;
/*      */           }
/*      */           else {
/*  752 */             i33 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  761 */             i33 += 1;
/*  762 */             i25 = i24 + i33;
/*  763 */             i27 = MainMemory.getI8(i25);
/*  764 */             if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */             {
/*  766 */               i24 = i25; break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1827:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  779 */           if ((i27 == 0) && (i26 == 0)) {
/*  780 */             i24 = i14;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  791 */             if (SystemLibrary.strncasecmp(i24, 32288, 6) != 0) {
/*      */               break label1897;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  801 */             i24 += 6;
/*      */             
/*  803 */             i33 = 0;
/*      */             
/*      */             break label2384;
/*      */             
/*      */             label1897:
/*  808 */             if (SystemLibrary.strncasecmp(i24, 47616, 9) != 0) {
/*      */               break label1942;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  818 */             i24 += 9;
/*      */             
/*  820 */             i33 = 0;
/*      */             
/*      */             break label2384;
/*      */             
/*      */             label1942:
/*  825 */             if (SystemLibrary.strncasecmp(i24, 40128, 7) != 0) {
/*      */               break label1987;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  835 */             i24 += 7;
/*      */             
/*  837 */             i33 = 0;
/*      */             
/*      */             break label2384;
/*      */             
/*      */             label1987:
/*  842 */             if (SystemLibrary.strncasecmp(i24, 20320, 4) != 0) {
/*      */               break label2031;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  852 */             i24 += 4;
/*      */             
/*  854 */             i33 = 1;
/*      */             
/*      */             break label2384;
/*      */             
/*      */             label2031:
/*  859 */             if (SystemLibrary.strncasecmp(i24, 20352, 4) != 0) {
/*      */               break label2075;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  869 */             i24 += 4;
/*      */             
/*  871 */             i33 = 1;
/*      */             
/*      */             break label2384;
/*      */             
/*      */             label2075:
/*  876 */             if (SystemLibrary.strncasecmp(i24, 26272, 5) != 0) {
/*      */               break label2119;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  886 */             i24 += 5;
/*      */             
/*  888 */             i33 = 1;
/*      */             
/*      */             break label2384;
/*      */             
/*      */             label2119:
/*  893 */             if (SystemLibrary.strncasecmp(i24, 17344, 3) == 0) {
/*  894 */               i24 = i14;
/*  895 */               i21 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*  905 */             else if (SystemLibrary.strncasecmp(i24, 17376, 3) == 0) {
/*  906 */               i24 = i14;
/*  907 */               i21 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*  917 */             else if (SystemLibrary.strncasecmp(i24, 20384, 4) == 0) {
/*  918 */               i24 = i14;
/*  919 */               i21 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*  929 */             else if (SystemLibrary.strncasecmp(i24, 23456, 5) == 0) {
/*  930 */               i24 = i14;
/*  931 */               i21 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  941 */               if (SystemLibrary.strncasecmp(i24, 44448, 8) != 0) break label2264;
/*  942 */               i24 = i14;
/*  943 */               i21 = 0;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2264:
/*      */         
/*      */ 
/*  953 */         if (SystemLibrary.strncasecmp(i24, 47648, 9) != 0) {
/*      */           break label2322;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  963 */         ffxmsg.call(5, 95840);
/*  964 */         ffxmsg.call(5, i24);
/*  965 */         MainMemory.setI32Aligned(470852, 431);
/*  966 */         paramInt1 = i13;
/*      */         
/*      */         break label7206;
/*      */         
/*      */         label2322:
/*  971 */         if (SystemLibrary.strncasecmp(i24, 47680, 9) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  976 */           i33 = i21;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  983 */           ffxmsg.call(5, 95904);
/*  984 */           ffxmsg.call(5, i24);
/*  985 */           MainMemory.setI32Aligned(470852, 431);
/*  986 */           paramInt1 = i13;
/*      */           
/*      */           break label7206;
/*      */         }
/*      */         
/*      */         label2384:
/*      */         
/*  993 */         i21 = MainMemory.getI32(i1);
/*  994 */         i18 = MainMemory.getI32(i2);
/*  995 */         if (i21 % 10 != 0)
/*      */         {
/*      */ 
/*      */ 
/*  999 */           i17 = i18;
/* 1000 */           i30 = i21;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1007 */           if (i18 != 0) {
/*      */             break label2463;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1017 */           i25 = malloc.call(1640);
/*      */           
/*      */           break label2485;
/*      */           
/*      */           label2463:
/*      */           
/* 1023 */           i25 = realloc.call(i18, i21 * 164 + 1640);
/*      */           
/*      */ 
/*      */ 
/*      */           label2485:
/*      */           
/*      */ 
/*      */ 
/* 1031 */           if (i25 != 0) {
/*      */             break label2529;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1041 */           ffxmsg.call(5, 95776);
/* 1042 */           MainMemory.setI32Aligned(470852, 113);
/* 1043 */           paramInt1 = i13;
/*      */           
/*      */           break label7206;
/*      */           
/*      */           label2529:
/* 1048 */           i18 = i25;
/* 1049 */           MainMemory.setI32(i2, i18);
/* 1050 */           i21 = MainMemory.getI32(i1);
/* 1051 */           i17 = i18;
/* 1052 */           i30 = i21;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1060 */         i18 = i17 + i30 * 164;
/* 1061 */         MainMemory.setI32(i1, i30 + 1);
/* 1062 */         i25 = i17 + i30 * 164;
/* 1063 */         MainMemory.setI8(i25, (byte)1);
/* 1064 */         i19 = i17 + i30 * 164 + 4;
/* 1065 */         MainMemory.setI32(i19, 0);
/* 1066 */         i23 = i17 + i30 * 164 + 44;
/* 1067 */         SystemLibrary.memset_long_addr(i23, (byte)0, 64L, 4);
/* 1068 */         MainMemory.setF64(i17 + i30 * 164 + 44 + 104, 0.0D);
/* 1069 */         MainMemory.setF64(i17 + i30 * 164 + 44 + 112, 0.0D);
/* 1070 */         MainMemory.setF64(i17 + i30 * 164 + 44 + 88, 0.0D);
/* 1071 */         MainMemory.setF64(i17 + i30 * 164 + 44 + 96, 0.0D);
/* 1072 */         i20 = MainMemory.getI32(i16);
/* 1073 */         i27 = MainMemory.getI8(i24);
/* 1074 */         if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */         {
/*      */           break label2823;
/*      */         }
/*      */         else {
/* 1079 */           i21 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1088 */           i21 += 1;
/* 1089 */           i31 = i24 + i21;
/* 1090 */           i27 = MainMemory.getI8(i31);
/* 1091 */           if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */           {
/* 1093 */             i24 = i31; break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label2823:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1106 */         switch (i27)
/*      */         {
/*      */         case 43: 
/*      */           break label2901;
/*      */           
/*      */ 
/*      */           break;
/*      */         case 45: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/* 1119 */         i24 += 1;
/* 1120 */         MainMemory.setI8(i25, (byte)0);
/* 1121 */         i20 = MainMemory.getI32(i16);
/*      */         
/*      */ 
/*      */         break label2912;
/*      */         
/*      */         label2901:
/*      */         
/* 1128 */         i24 += 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2912:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1138 */         i27 = MainMemory.getI8(i24);
/* 1139 */         if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */         {
/*      */           break label3012;
/*      */         }
/*      */         else {
/* 1144 */           i21 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1153 */           i21 += 1;
/* 1154 */           i25 = i24 + i21;
/* 1155 */           i27 = MainMemory.getI8(i25);
/* 1156 */           if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */           {
/* 1158 */             i24 = i25; break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label3012:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1171 */         if (i27 != 0) {
/*      */           break label3057;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1181 */         ffxmsg.call(5, 70368);
/* 1182 */         MainMemory.setI32Aligned(470852, 431);
/* 1183 */         paramInt1 = i13;
/*      */         
/*      */         break label7206;
/*      */         
/*      */         label3057:
/* 1188 */         i32 = SystemLibrary.strlen(i24);
/* 1189 */         i21 = i32 + -1;
/* 1190 */         if ((MainMemory.getI16(i20 + (MainMemory.getI8(i24 + i21) << 1)) & 0xFFFF & 0x2000) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1200 */           i32 += -2;
/* 1201 */           i28 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1208 */             MainMemory.setI8(i24 + (i21 - i28), (byte)0);
/* 1209 */             i29 = i28 + 1;
/* 1210 */             if ((MainMemory.getI16(MainMemory.getI32(i16) + (MainMemory.getI8(i24 + (i32 - i28)) << 1)) & 0xFFFF & 0x2000) == 0) {
/*      */               break;
/*      */             }
/*      */             
/* 1214 */             i28 = i29;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1221 */         if (SystemLibrary.strcasecmp(i24, 32320) != 0) {
/*      */           break label3255;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1231 */         MainMemory.setI32(i19, 2);
/* 1232 */         if (i15 == 3) {
/* 1233 */           i21 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1243 */           MainMemory.setI32Aligned(470852, 431);
/*      */           
/*      */           break label7090;
/*      */           
/*      */           label3255:
/* 1248 */           if (SystemLibrary.strcasecmp(i24, 40160) != 0) {
/*      */             break label3321;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1258 */           MainMemory.setI32(i19, 3);
/* 1259 */           if (i15 == 4) {
/* 1260 */             i21 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1270 */             MainMemory.setI32Aligned(470852, 431);
/*      */             
/*      */             break label7090;
/*      */             
/*      */             label3321:
/* 1275 */             if (SystemLibrary.strcasecmp(i24, 40192) != 0) {
/*      */               break label3502;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1285 */             if (!MathUtils.ugt(i15 + -4, 4)) {
/*      */               break label3387;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1295 */             MainMemory.setI32Aligned(470852, 431);
/*      */             
/*      */             break label7090;
/*      */             
/*      */             label3387:
/* 1300 */             if (i15 >= 6) {
/*      */               break label3445;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1310 */             MainMemory.setI32(i19, 4);
/* 1311 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 32, 0.0D);
/* 1312 */             i21 = 2;
/*      */             
/*      */             break label4704;
/*      */             
/*      */             label3445:
/* 1317 */             MainMemory.setI32(i19, 5);
/* 1318 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 48, 0.0D);
/* 1319 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 56, 0.0D);
/* 1320 */             i21 = 2;
/*      */             
/*      */             break label4704;
/*      */             
/*      */             label3502:
/* 1325 */             if (SystemLibrary.strcasecmp(i24, 53728) != 0) {
/*      */               break label3644;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1335 */             MainMemory.setI32(i19, 5);
/* 1336 */             switch (i15)
/*      */             {
/*      */             case 6: 
/*      */               break label3593;
/*      */               
/*      */               break;
/*      */             case 8: 
/*      */               break label3593;
/*      */               break;
/*      */             }
/*      */             
/* 1347 */             MainMemory.setI32Aligned(470852, 431);
/*      */             
/*      */ 
/*      */             label3593:
/*      */             
/*      */ 
/* 1353 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 48, 0.0D);
/* 1354 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 56, 0.0D);
/* 1355 */             i21 = 2;
/*      */             
/*      */             break label4704;
/*      */             
/*      */             label3644:
/* 1360 */             if (SystemLibrary.strcasecmp(i24, 17408) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1370 */               if (SystemLibrary.strcasecmp(i24, 32352) != 0) {
/*      */                 break label3849;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1380 */             if (!MathUtils.ugt(i15 + -4, 4)) {
/*      */               break label3732;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1390 */             MainMemory.setI32Aligned(470852, 431);
/*      */             
/*      */             break label7090;
/*      */             
/*      */             label3732:
/* 1395 */             if (i15 >= 6) {
/*      */               break label3791;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1405 */             MainMemory.setI32(i19, 6);
/* 1406 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 32, 0.0D);
/* 1407 */             i21 = 2;
/*      */             
/*      */             break label4704;
/*      */             
/*      */             label3791:
/* 1412 */             MainMemory.setI32(i19, 7);
/* 1413 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 48, 0.0D);
/* 1414 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 56, 0.0D);
/* 1415 */             i21 = 2;
/*      */             
/*      */             break label4704;
/*      */             
/*      */             label3849:
/* 1420 */             if (SystemLibrary.strcasecmp(i24, 47712) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1430 */               if (SystemLibrary.strcasecmp(i24, 52608) != 0) {
/*      */                 break label3969;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1440 */             MainMemory.setI32(i19, 8);
/* 1441 */             if (!MathUtils.ugt(i15 + -4, 1)) {
/*      */               break label3937;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1451 */             MainMemory.setI32Aligned(470852, 431);
/*      */             
/*      */ 
/*      */             label3937:
/*      */             
/*      */ 
/* 1457 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 32, 0.0D);
/* 1458 */             i21 = 4;
/*      */             
/*      */             break label4704;
/*      */             
/*      */             label3969:
/* 1463 */             if (SystemLibrary.strcasecmp(i24, 40224) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1473 */               if (SystemLibrary.strcasecmp(i24, 49376) != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1483 */                 if (SystemLibrary.strcasecmp(i24, 40256) != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1493 */                   if (SystemLibrary.strcasecmp(i24, 49408) != 0) {
/*      */                     break label4129;
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1503 */             MainMemory.setI32(i19, 9);
/* 1504 */             if (!MathUtils.ugt(i15 + -4, 1)) {
/*      */               break label4097;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1514 */             MainMemory.setI32Aligned(470852, 431);
/*      */             
/*      */ 
/*      */             label4097:
/*      */             
/*      */ 
/* 1520 */             MainMemory.setF64(i17 + i30 * 164 + 44 + 32, 0.0D);
/* 1521 */             i21 = 2;
/*      */             
/*      */             break label4704;
/*      */             
/*      */             label4129:
/* 1526 */             if (SystemLibrary.strcasecmp(i24, 32384) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1536 */               if (SystemLibrary.strcasecmp(i24, 17440) != 0) {
/*      */                 break label4218;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1546 */             MainMemory.setI32(i19, 10);
/* 1547 */             if (i15 == 4) {
/* 1548 */               i21 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1558 */               MainMemory.setI32Aligned(470852, 431);
/*      */               
/*      */               break label7090;
/*      */               
/*      */               label4218:
/* 1563 */               if (SystemLibrary.strcasecmp(i24, 25440) != 0) {
/*      */                 break label4285;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1573 */               MainMemory.setI32(i19, 0);
/* 1574 */               if (i15 == 2) {
/* 1575 */                 i21 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1585 */                 MainMemory.setI32Aligned(470852, 431);
/*      */                 
/*      */                 break label7090;
/*      */                 
/*      */                 label4285:
/* 1590 */                 if (SystemLibrary.strcasecmp(i24, 20416) != 0) {
/*      */                   break label4352;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1600 */                 MainMemory.setI32(i19, 1);
/* 1601 */                 if (i15 == 4) {
/* 1602 */                   i21 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/* 1612 */                   MainMemory.setI32Aligned(470852, 431);
/*      */                   
/*      */                   break label7090;
/*      */                   
/*      */                   label4352:
/* 1617 */                   if (SystemLibrary.strcasecmp(i24, 40288) != 0) {
/*      */                     break label4438;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1627 */                   MainMemory.setI32(i19, 11);
/* 1628 */                   if (i15 >= 6)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1638 */                     if ((i15 & 0x1) == 0) {
/* 1639 */                       i21 = i15;
/*      */                       
/*      */ 
/*      */ 
/*      */                       break label4704;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/* 1649 */                   MainMemory.setI32Aligned(470852, 431);
/*      */                   
/*      */                   break label7090;
/*      */                   
/*      */                   label4438:
/* 1654 */                   if (SystemLibrary.strcasecmp(i24, 26304) != 0) {
/*      */                     break label4507;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1664 */                   MainMemory.setI32(i19, 12);
/* 1665 */                   if (i15 == 8) {
/* 1666 */                     i21 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 1676 */                     MainMemory.setI32Aligned(470852, 431);
/*      */                     
/*      */                     break label7090;
/*      */                     
/*      */                     label4507:
/* 1681 */                     if (SystemLibrary.strcasecmp(i24, 32416) != 0) {
/*      */                       break label4608;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1691 */                     MainMemory.setI32(i19, 13);
/* 1692 */                     if (!MathUtils.ugt(i15 + -10, 1)) {
/*      */                       break label4576;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1702 */                     MainMemory.setI32Aligned(470852, 431);
/*      */                     
/*      */ 
/*      */                     label4576:
/*      */                     
/*      */ 
/* 1708 */                     MainMemory.setF64(i17 + i30 * 164 + 44 + 80, 0.0D);
/* 1709 */                     i21 = 2;
/*      */                     
/*      */                     break label4704;
/*      */                     
/*      */                     label4608:
/* 1714 */                     if (SystemLibrary.strcasecmp(i24, 32448) != 0) {
/*      */                       break label7150;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1724 */                     MainMemory.setI32(i19, 14);
/* 1725 */                     if (!MathUtils.ugt(i15 + -10, 1)) {
/*      */                       break label4677;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1735 */                     MainMemory.setI32Aligned(470852, 431);
/*      */                     
/*      */ 
/*      */                     label4677:
/*      */                     
/*      */ 
/* 1741 */                     MainMemory.setF64(i17 + i30 * 164 + 44 + 80, 0.0D);
/* 1742 */                     i21 = 2;
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           } }
/*      */         label4704:
/* 1749 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label7090;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1759 */         if (MainMemory.getI32(i19) != 11) {
/*      */           break label4840;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1770 */         i24 = malloc.call(i15 << 3);
/* 1771 */         i23 = i24;
/* 1772 */         i22 = i17 + i30 * 164 + 44;
/* 1773 */         MainMemory.setI32(i22 + 4, i23);
/* 1774 */         if (i24 != 0) {
/*      */           break label4828;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1784 */         ffxmsg.call(5, 119392);
/* 1785 */         MainMemory.setI32Aligned(470852, 113);
/* 1786 */         paramInt1 = i13;
/*      */         
/*      */         break label7206;
/*      */         
/*      */         label4828:
/* 1791 */         MainMemory.setI32(i22, i15);
/*      */         
/*      */ 
/*      */ 
/*      */         label4840:
/*      */         
/*      */ 
/*      */ 
/* 1799 */         i30 = 0;
/* 1800 */         i31 = i26;
/*      */         
/*      */ 
/* 1803 */         i32 = i33;
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
/* 1814 */           i33 = i30 << 1;
/* 1815 */           i34 = i23 + ((i33 | 0x1) << 3);
/* 1816 */           i35 = i23 + (i33 << 3);
/* 1817 */           if (i33 >= i21) {
/*      */             break label6055;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1827 */           if (MainMemory.getI8(i31) == 44) {
/* 1828 */             i24 = i31;
/*      */             break label4972;
/*      */           } else {
/* 1831 */             i28 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1840 */             i28 += 1;
/* 1841 */             i26 = i31 + i28;
/* 1842 */             if (MainMemory.getI8(i26) == 44) {
/* 1843 */               i24 = i26; break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label4972:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1855 */           MainMemory.setI8(i24, (byte)0);
/* 1856 */           i25 = i24 + 1;
/* 1857 */           i28 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1864 */             i29 = i28 + 1;
/* 1865 */             i26 = i24 + i29;
/* 1866 */             switch (MainMemory.getI8(i26)) {
/*      */             case 0: 
/*      */               break;
/*      */             case 44: 
/*      */               break;
/* 1871 */             default:  i28 = i29;
/*      */             }
/*      */             
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1879 */           MainMemory.setI8(i26, (byte)0);
/* 1880 */           i26 = i24 + (i28 + 2);
/* 1881 */           if (SystemLibrary.strchr(i31, 58) != 0) {
/*      */             break label5178;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1891 */           d1 = SystemLibrary.atof(i31);
/* 1892 */           d2 = SystemLibrary.atof(i25);
/* 1893 */           bool = i33 == 0;
/* 1894 */           d5 = bool ? d1 : d5;
/* 1895 */           d6 = bool ? d2 : d6;
/* 1896 */           if (i32 == 0)
/*      */           {
/*      */ 
/* 1899 */             i33 = i32;
/*      */             
/*      */ 
/*      */             break label5996;
/*      */           }
/*      */           else
/*      */           {
/* 1906 */             i33 = i32;
/*      */             
/*      */ 
/*      */             break label5844;
/*      */           }
/*      */           
/*      */ 
/*      */           label5178:
/*      */           
/* 1915 */           i32 = SystemLibrary.strtol(i31, i, 10);
/* 1916 */           i31 = MainMemory.getI32(i);
/* 1917 */           if (i31 == 0) {
/* 1918 */             d1 = 0.0D;
/* 1919 */             i28 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/* 1929 */           else if (MainMemory.getI8(i31) != 58)
/*      */           {
/*      */ 
/*      */ 
/* 1933 */             d1 = 0.0D;
/* 1934 */             i28 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1941 */             i28 = SystemLibrary.strtol(i31 + 1, i, 10);
/* 1942 */             i31 = MainMemory.getI32(i);
/* 1943 */             if (i31 == 0) {
/* 1944 */               d1 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/* 1955 */             else if (MainMemory.getI8(i31) != 58)
/*      */             {
/*      */ 
/*      */ 
/* 1959 */               d1 = 0.0D;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/* 1967 */               d1 = SystemLibrary.atof(i31 + 1);
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1977 */           d2 = i32;
/* 1978 */           d3 = i28;
/* 1979 */           d3 /= 60.0D;
/* 1980 */           d2 += d3;
/* 1981 */           d1 /= 3600.0D;
/* 1982 */           d1 = d2 + d1;
/* 1983 */           d1 *= 15.0D;
/* 1984 */           i20 = MainMemory.getI32(i16);
/* 1985 */           i27 = MainMemory.getI8(i25);
/* 1986 */           if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */           {
/* 1988 */             i24 = i25;
/*      */             break label5484;
/*      */           } else {
/* 1991 */             i32 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2000 */             i25 = i24 + (i32 + 2);
/* 2001 */             i27 = MainMemory.getI8(i25);
/* 2002 */             i32 += 1;
/* 2003 */             if ((MainMemory.getI16(i20 + (i27 << 1)) & 0xFFFF & 0x2000) == 0)
/*      */             {
/* 2005 */               i24 = i25; break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label5484:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 2018 */           if (i27 != 45)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2023 */             i32 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 2030 */             i24 += 1;
/*      */             
/* 2032 */             i32 = 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2040 */           i28 = SystemLibrary.strtol(i24, i, 10);
/* 2041 */           i24 = MainMemory.getI32(i);
/* 2042 */           if (i24 == 0) {
/* 2043 */             d2 = 0.0D;
/* 2044 */             i29 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/* 2054 */           else if (MainMemory.getI8(i24) != 58)
/*      */           {
/*      */ 
/*      */ 
/* 2058 */             d2 = 0.0D;
/* 2059 */             i29 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 2066 */             i29 = SystemLibrary.strtol(i24 + 1, i, 10);
/* 2067 */             i24 = MainMemory.getI32(i);
/* 2068 */             if (i24 == 0) {
/* 2069 */               d2 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/* 2080 */             else if (MainMemory.getI8(i24) != 58)
/*      */             {
/*      */ 
/*      */ 
/* 2084 */               d2 = 0.0D;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/* 2092 */               d2 = SystemLibrary.atof(i24 + 1);
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2102 */           if (i32 != 0) {
/*      */             break label5747;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2112 */           d3 = i28;
/* 2113 */           d4 = i29;
/* 2114 */           d4 /= 60.0D;
/* 2115 */           d3 += d4;
/* 2116 */           d2 /= 3600.0D;
/* 2117 */           d2 = d3 + d2;
/*      */           
/*      */           break label5795;
/*      */           
/*      */           label5747:
/*      */           
/* 2123 */           d3 = 0 - i28;
/* 2124 */           d4 = i29;
/* 2125 */           d4 /= -60.0D;
/* 2126 */           d3 += d4;
/* 2127 */           d2 /= -3600.0D;
/* 2128 */           d2 = d3 + d2;
/*      */           
/*      */ 
/*      */ 
/*      */           label5795:
/*      */           
/*      */ 
/*      */ 
/* 2136 */           bool = i33 == 0;
/* 2137 */           d5 = bool ? d1 : d5;
/* 2138 */           d6 = bool ? d2 : d6;
/*      */           
/*      */ 
/* 2141 */           i33 = 2;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label5844:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2154 */           if (i3 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2164 */             if (MainMemory.getI32(paramInt2) != 0) {
/*      */               break label5911;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2174 */           ffxmsg.call(5, 121312);
/* 2175 */           MainMemory.setI32Aligned(470852, 505);
/* 2176 */           paramInt1 = i13;
/*      */           
/*      */           break label7206;
/*      */           
/*      */           label5911:
/* 2181 */           if (ffxypx.call(d1, d2, MainMemory.getF64(i11), MainMemory.getF64(i10), MainMemory.getF64(i9), MainMemory.getF64(i8), MainMemory.getF64(i7), MainMemory.getF64(i6), MainMemory.getF64(i5), paramInt1, j, k) != 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2191 */           d1 = MainMemory.getF64(j);
/* 2192 */           d2 = MainMemory.getF64(k);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label5996:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2208 */           MainMemory.setF64(i35, d1);
/* 2209 */           MainMemory.setF64(i34, d2);
/* 2210 */           i30 += 1;
/*      */           
/* 2212 */           i31 = i26;
/*      */           
/*      */ 
/* 2215 */           i32 = i33;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/* 2220 */         ffxmsg.call(5, 104608);
/* 2221 */         paramInt1 = i13;
/*      */         
/*      */         break label7111;
/*      */         
/*      */         label6055:
/* 2226 */         bool = MathUtils.f_olt(d6, 0.0D);
/* 2227 */         i34 = i23 + 8;
/* 2228 */         i21 = 0;
/* 2229 */         i24 = i31;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2237 */         i30 = i33 + i21;
/* 2238 */         i35 = i23 + (i30 << 3);
/* 2239 */         if (i30 < i15) {
/* 2240 */           i30 = 0;
/*      */         } else {
/*      */           break label6578;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 2251 */           i26 = i24 + i30;
/* 2252 */           switch (MainMemory.getI8(i26))
/*      */           {
/*      */           case 0: 
/*      */             break;
/*      */           case 44: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 2264 */           MainMemory.setI8(i26, (byte)0);
/* 2265 */           i26 = i24 + (i30 + 1);
/* 2266 */           d1 = SystemLibrary.strtod(i24, i);
/* 2267 */           MainMemory.setF64(i35, d1);
/* 2268 */           i24 = MainMemory.getI32(i);
/* 2269 */           if (i24 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2279 */             i27 = MainMemory.getI8(i24);
/* 2280 */             switch (i27)
/*      */             {
/*      */             case 34: 
/*      */               break;
/*      */             case 39: 
/*      */               break;
/*      */             case 100: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 2294 */             d1 /= (i27 == 34 ? 3600.0D : i27 == 39 ? 60.0D : 1.0D);
/* 2295 */             if (!bool) {
/*      */               break label6370;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2305 */             d1 += d6;
/*      */             
/*      */             break label6383;
/*      */             
/*      */             label6370:
/*      */             
/* 2311 */             d1 = d6 - d1;
/*      */             
/*      */ 
/*      */ 
/*      */             label6383:
/*      */             
/*      */ 
/*      */ 
/* 2319 */             if (ffxypx.call(d5, d1, MainMemory.getF64(i11), MainMemory.getF64(i10), MainMemory.getF64(i9), MainMemory.getF64(i8), MainMemory.getF64(i7), MainMemory.getF64(i6), MainMemory.getF64(i5), paramInt1, j, k) != 0) {
/*      */               break label6517;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2329 */             d1 = MainMemory.getF64(j) - MainMemory.getF64(i23);
/* 2330 */             d1 *= d1;
/* 2331 */             d2 = MainMemory.getF64(k) - MainMemory.getF64(i34);
/* 2332 */             d2 *= d2;
/* 2333 */             d1 += d2;
/* 2334 */             MainMemory.setF64(i35, SystemLibrary.sqrt(d1));
/*      */             
/*      */             break label6538;
/*      */             
/*      */             label6517:
/* 2339 */             ffxmsg.call(5, 104608);
/* 2340 */             paramInt1 = i13;
/*      */             
/*      */             break label7111;
/*      */           }
/*      */           label6538:
/* 2345 */           i21 += 1;
/*      */           
/* 2347 */           i24 = i26;
/* 2348 */           break;
/*      */           
/*      */ 
/*      */ 
/* 2352 */           i30 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */         label6578:
/*      */         
/* 2358 */         i21 = MainMemory.getI32(i19);
/* 2359 */         if (((i21 != 5) && (i21 != 7)) || (i15 != 7)) {
/*      */           break label6642;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2369 */         MainMemory.setF64(i23 + 56, MainMemory.getF64(i23 + 48));
/*      */         
/*      */ 
/*      */         label6642:
/*      */         
/*      */ 
/* 2375 */         if (i32 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2385 */           switch (MainMemory.getI32(i19)) {
/*      */           case 4: 
/*      */             break label7037;
/*      */             break;
/*      */           case 5: 
/*      */             break label6971;
/*      */             break;
/*      */           case 6: 
/*      */             break label7037;
/*      */             break;
/*      */           case 7: 
/*      */             break label6971;
/*      */             break;
/*      */           case 8: 
/*      */             break label7037;
/*      */             break;
/*      */           case 9:  break label7037;
/*      */             break; case 10:  break label6905;
/*      */             break; case 12:  break label6905;
/*      */             break; case 13:  break; case 14:  break; }
/* 2405 */           i34 = i23 + 16;
/* 2406 */           d1 = MainMemory.getF64(i34) + MainMemory.getF64(i5);
/* 2407 */           MainMemory.setF64(i34, d1);
/* 2408 */           i34 = i23 + 24;
/* 2409 */           d1 = MainMemory.getF64(i34) + MainMemory.getF64(i5);
/* 2410 */           MainMemory.setF64(i34, d1);
/* 2411 */           i23 += 80;
/* 2412 */           d1 = MainMemory.getF64(i23) + MainMemory.getF64(i5);
/* 2413 */           MainMemory.setF64(i23, d1);
/*      */           
/*      */           break label7070;
/*      */           
/*      */           label6905:
/* 2418 */           i34 = i23 + 16;
/* 2419 */           d1 = MainMemory.getF64(i34) + MainMemory.getF64(i5);
/* 2420 */           MainMemory.setF64(i34, d1);
/* 2421 */           i23 += 24;
/* 2422 */           d1 = MainMemory.getF64(i23) + MainMemory.getF64(i5);
/* 2423 */           MainMemory.setF64(i23, d1);
/*      */           
/*      */           break label7070;
/*      */           
/*      */           label6971:
/* 2428 */           i34 = i23 + 48;
/* 2429 */           d1 = MainMemory.getF64(i34) + MainMemory.getF64(i5);
/* 2430 */           MainMemory.setF64(i34, d1);
/* 2431 */           i23 += 56;
/* 2432 */           d1 = MainMemory.getF64(i23) + MainMemory.getF64(i5);
/* 2433 */           MainMemory.setF64(i23, d1);
/*      */           
/*      */           break label7070;
/*      */           
/*      */           label7037:
/* 2438 */           i23 += 32;
/* 2439 */           d1 = MainMemory.getF64(i23) + MainMemory.getF64(i5);
/* 2440 */           MainMemory.setF64(i23, d1);
/*      */         }
/*      */         
/*      */ 
/*      */         label7070:
/*      */         
/* 2446 */         fits_setup_shape.call(i18);
/*      */         
/*      */ 
/*      */ 
/* 2450 */         i15 = i32;
/*      */       }
/*      */       
/*      */       label7090:
/*      */       
/* 2455 */       ffxmsg.call(5, 99872);
/* 2456 */       ffxmsg.call(5, i24);
/* 2457 */       paramInt1 = i13;
/*      */       
/*      */ 
/*      */ 
/*      */       label7111:
/*      */       
/*      */ 
/* 2464 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*      */         break label7206;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2475 */       MainMemory.setI32(paramInt3, n);
/*      */       
/*      */       break label7376;
/*      */       
/*      */       label7150:
/*      */       
/* 2481 */       ffxmsg.call(5, 95968);
/* 2482 */       ffxmsg.call(5, i24);
/* 2483 */       MainMemory.setI32Aligned(470852, 431);
/* 2484 */       paramInt1 = i13;
/*      */       
/*      */       break label7206;
/*      */       
/*      */       label7184:
/* 2489 */       ffxmsg.call(5, 70368);
/* 2490 */       MainMemory.setI32Aligned(470852, 431);
/* 2491 */       paramInt1 = i13;
/*      */       
/*      */ 
/*      */ 
/*      */       label7206:
/*      */       
/*      */ 
/* 2498 */       i18 = MainMemory.getI32(i2);
/* 2499 */       if (MainMemory.getI32(i1) > 0)
/*      */       {
/* 2501 */         i15 = 0;
/*      */       } else {
/*      */         break label7337;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 2514 */         i12 = i15 + 1;
/* 2515 */         if (MainMemory.getI32(i18 + i15 * 164 + 4) != 11) {
/*      */           break label7304;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2525 */         free.call(MainMemory.getI32(i18 + i15 * 164 + 44 + 4));
/*      */         
/*      */ 
/*      */         label7304:
/*      */         
/*      */ 
/* 2531 */         i18 = MainMemory.getI32(i2);
/* 2532 */         if (MainMemory.getI32(i1) <= i12)
/*      */           break;
/* 2534 */         i15 = i12;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label7337:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 2546 */       if (i18 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2556 */         free.call(i18);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 2562 */       free.call(m);
/*      */       
/*      */ 
/*      */ 
/*      */       label7376:
/*      */       
/*      */ 
/*      */ 
/* 2570 */       SystemLibrary.fclose(i4);
/* 2571 */       free.call(paramInt1);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label7397:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label7402:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2588 */       MainMemory.dealloc_generated(i36);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_ascii_region.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */