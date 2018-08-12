/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ 
/*      */ public final class wcs_types extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2918;
/*   15 */   public static final Function _instance = new wcs_types();
/*   16 */   public final Function resolve() { return _instance; }
/*      */   
/*   18 */   public wcs_types() { super("wcs_types", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   22 */     return call(paramInt);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     int j = call(i);
/*   31 */     paramFrame.setI32(paramInt1, j);
/*   32 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt)
/*      */   {
/*   37 */     int i = 0;
/*      */     
/*   39 */     int j = 0;
/*   40 */     int k = 0;
/*   41 */     int m = 0;
/*   42 */     int n = 0;
/*   43 */     int i1 = 0;
/*   44 */     int i2 = 0;
/*   45 */     int i3 = 0;
/*   46 */     int i4 = 0;
/*   47 */     int i5 = 0;
/*   48 */     int i6 = 0;
/*   49 */     int i7 = 0;
/*   50 */     int i8 = 0;
/*   51 */     int i9 = 0;
/*   52 */     int i10 = 0;
/*   53 */     int i11 = 0;
/*   54 */     int i12 = 0;
/*   55 */     int i13 = 0;
/*   56 */     int i14 = 0;
/*   57 */     int i15 = 0;
/*   58 */     int i16 = 0;
/*   59 */     int i17 = 0;
/*   60 */     int i18 = 0;
/*   61 */     int i19 = 0;
/*   62 */     int i20 = 0;
/*   63 */     int i21 = 0;
/*   64 */     int i22 = 0;
/*   65 */     int i23 = 0;
/*   66 */     int i24 = 0;
/*   67 */     int i25 = 0;
/*   68 */     int i26 = 0;
/*   69 */     int i27 = 0;
/*   70 */     int i28 = 0;
/*   71 */     int i29 = 0;
/*   72 */     int i30 = 0;
/*   73 */     int i31 = 0;
/*   74 */     int i32 = 0;
/*   75 */     int i33 = 0;
/*   76 */     int i34 = 0;
/*      */     
/*      */ 
/*   79 */     int i35 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   83 */       j = MainMemory.alloc(16);
/*   84 */       k = MainMemory.alloc(4);
/*   85 */       m = MainMemory.alloc(9);
/*   86 */       n = MainMemory.alloc(4);
/*   87 */       i1 = MainMemory.alloc(9);
/*   88 */       if (paramInt == 0) {
/*   89 */         i6 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   99 */         MainMemory.setI8(k, (byte)0);
/*  100 */         MainMemory.setI8(m, (byte)0);
/*  101 */         i2 = paramInt + 744;
/*  102 */         MainMemory.setI32(i2, -1);
/*  103 */         i3 = paramInt + 748;
/*  104 */         MainMemory.setI32(i3, -1);
/*  105 */         i4 = paramInt + 752;
/*  106 */         MainMemory.setI32(i4, -1);
/*  107 */         i5 = paramInt + 756;
/*  108 */         MainMemory.setI32(i5, -1);
/*  109 */         i6 = MainMemory.getI32(paramInt + 4);
/*  110 */         i7 = paramInt + 724;
/*  111 */         i12 = MainMemory.getI32(i7);
/*  112 */         if (i12 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  122 */           free.call(i12);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  128 */         MainMemory.setI32(i7, calloc.call(i6, 4));
/*  129 */         i8 = paramInt + 28;
/*  130 */         i9 = j + 15;
/*  131 */         i10 = j + 8;
/*  132 */         i11 = j + 4;
/*  133 */         i12 = paramInt + 100;
/*  134 */         i13 = paramInt + 392;
/*  135 */         i14 = j + 5;
/*  136 */         i15 = paramInt + 728;
/*  137 */         i16 = paramInt + 736;
/*  138 */         i17 = i16;
/*  139 */         i18 = j + 1;
/*  140 */         i19 = j + 2;
/*  141 */         i20 = j + 3;
/*  142 */         i32 = 0;
/*  143 */         i33 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  151 */           if (i32 >= i6) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  161 */           i21 = MainMemory.getI32(i8);
/*  162 */           MainMemory.setI8(i21 + i32 * 72 + 71, (byte)0);
/*  163 */           i25 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  170 */             if (i25 >= 72) {
/*      */               break label499;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  180 */             i28 = i25 + 1;
/*  181 */             if (MainMemory.getI8(i21 + i32 * 72 + i25) == 0) {
/*      */               break;
/*      */             }
/*      */             
/*  185 */             i25 = i28;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  192 */           wcs_types_1707.call(i25, i21, i32, i28);
/*      */           
/*      */ 
/*      */           label499:
/*      */           
/*      */ 
/*  198 */           i25 += -1;
/*  199 */           i28 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  206 */             i23 = i25 - i28;
/*  207 */             i22 = i21 + i32 * 72 + i23;
/*  208 */             if (i23 <= 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  218 */             if (MainMemory.getI8(i22) != 32) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  228 */             MainMemory.setI8(i22, (byte)0);
/*  229 */             i28 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  235 */           SystemLibrary.strncpy(j, MainMemory.getI32(i8) + i32 * 72, 15);
/*  236 */           MainMemory.setI8(i9, (byte)0);
/*  237 */           if (SystemLibrary.strlen(j) != 12) {
/*      */             break label653;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  247 */           wcs_types_1705.call(i10, j);
/*      */           
/*      */ 
/*      */           label653:
/*      */           
/*      */ 
/*  253 */           MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), 0);
/*  254 */           if (SystemLibrary.strcmp(i11, 21632) != 0) {
/*      */             break label717;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  264 */           MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), 400);
/*      */           
/*      */           break label731;
/*      */           
/*      */           label717:
/*  269 */           wcs_types_1709.call(i11, i32, i7);
/*      */           
/*      */ 
/*      */           label731:
/*      */           
/*      */ 
/*  275 */           if (MainMemory.getI32(MainMemory.getI32(i7) + (i32 << 2)) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  285 */             MainMemory.setI8(i11, (byte)0);
/*  286 */             i25 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  293 */               i28 = 3 - i25;
/*  294 */               i22 = j + i28;
/*  295 */               if (i28 <= -1) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  305 */               if (MainMemory.getI8(i22) != 45) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  315 */               MainMemory.setI8(i22, (byte)0);
/*  316 */               i25 += 1;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*  322 */           if (spcaips.call(j, MainMemory.getI32(i12), j, i1) != 0) {
/*      */             break label892;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  332 */           wcs_types_1708.call(i13, i8, i1, j, i32);
/*      */           
/*      */ 
/*      */           label892:
/*      */           
/*      */ 
/*  338 */           if (SystemLibrary.strlen(j) != 8) {
/*      */             break label2161;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  348 */           if (MainMemory.getI8(i11) != 45) {
/*      */             break label2161;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  358 */           if (spctyp.call(j, 0, n, 0, 0, 0, 0) != 0)
/*      */           {
/*      */ 
/*      */ 
/*  362 */             i25 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  369 */             MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), 3300);
/*  370 */             if (MainMemory.getI32(i4) > -1) {
/*  371 */               i6 = 4;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               break label3431;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  381 */             MainMemory.setI32(i4, i32);
/*      */             
/*      */             break label3180;
/*      */           }
/*      */           
/*      */           for (;;)
/*      */           {
/*  388 */             if (i25 >= 27) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  398 */             if (SystemLibrary.strncmp(i14, 145408 + (i25 << 2), 3) == 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  408 */             i25 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  414 */           if (i25 == 27) {
/*  415 */             i25 = 0;
/*      */           } else {
/*      */             break label1213;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  426 */             if (i25 >= 2) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  436 */             if (SystemLibrary.strncmp(i14, 41216 + (i25 << 2), 3) == 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  446 */             i25 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  452 */           if (i25 != 2) {
/*      */             break label1213;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  462 */           MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), -1);
/*  463 */           i = 4;
/*      */           
/*      */ 
/*      */           break label3463;
/*      */           
/*      */           label1213:
/*      */           
/*  470 */           MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), 2200);
/*  471 */           if (MainMemory.getI8(k) != 0) {
/*      */             break label2040;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  481 */           SystemLibrary.sprintf(k, 21888, new Object[] { Integer.valueOf(i14) });
/*  482 */           if (SystemLibrary.strncmp(j, 22240, 4) != 0) {
/*      */             break label1350;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  492 */           MainMemory.setI32(i2, i32);
/*  493 */           SystemLibrary.memcpy(i15, 14784, 3, 1);
/*  494 */           MainMemory.setI32(i17, 4408644);
/*  495 */           SystemLibrary.sprintf(m, 41280, new Object[] { Integer.valueOf(k) });
/*  496 */           i33 = i3;
/*      */           
/*      */           break label1946;
/*      */           
/*      */           label1350:
/*  501 */           if (SystemLibrary.strncmp(j, 22368, 4) != 0) {
/*      */             break label1431;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  511 */           MainMemory.setI32(i3, i32);
/*  512 */           SystemLibrary.memcpy(i15, 14784, 3, 1);
/*  513 */           MainMemory.setI32(i17, 4408644);
/*  514 */           SystemLibrary.sprintf(m, 41312, new Object[] { Integer.valueOf(k) });
/*  515 */           i33 = i2;
/*      */           
/*      */           break label1946;
/*      */           
/*      */           label1431:
/*  520 */           if (SystemLibrary.strncmp(i18, 18080, 3) != 0) {
/*      */             break label1551;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  530 */           MainMemory.setI32(i2, i32);
/*  531 */           SystemLibrary.sprintf(i15, 27616, new Object[] { Integer.valueOf(MainMemory.getI8(j)) });
/*  532 */           SystemLibrary.sprintf(i16, 27648, new Object[] { Integer.valueOf(MainMemory.getI8(j)) });
/*  533 */           SystemLibrary.sprintf(m, 27168, new Object[] { Integer.valueOf(i16), Integer.valueOf(k) });
/*  534 */           i33 = i3;
/*      */           
/*      */           break label1946;
/*      */           
/*      */           label1551:
/*  539 */           if (SystemLibrary.strncmp(i18, 18112, 3) != 0) {
/*      */             break label1671;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  549 */           MainMemory.setI32(i3, i32);
/*  550 */           SystemLibrary.sprintf(i15, 27616, new Object[] { Integer.valueOf(MainMemory.getI8(j)) });
/*  551 */           SystemLibrary.sprintf(i16, 27648, new Object[] { Integer.valueOf(MainMemory.getI8(j)) });
/*  552 */           SystemLibrary.sprintf(m, 27168, new Object[] { Integer.valueOf(i15), Integer.valueOf(k) });
/*  553 */           i33 = i2;
/*      */           
/*      */           break label1946;
/*      */           
/*      */           label1671:
/*  558 */           if (SystemLibrary.strncmp(i19, 15776, 2) != 0) {
/*      */             break label1811;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  568 */           MainMemory.setI32(i2, i32);
/*  569 */           SystemLibrary.sprintf(i15, 36064, new Object[] { Integer.valueOf(MainMemory.getI8(j)), Integer.valueOf(MainMemory.getI8(i18)) });
/*  570 */           SystemLibrary.sprintf(i16, 36096, new Object[] { Integer.valueOf(MainMemory.getI8(j)), Integer.valueOf(MainMemory.getI8(i18)) });
/*  571 */           SystemLibrary.sprintf(m, 27168, new Object[] { Integer.valueOf(i16), Integer.valueOf(k) });
/*  572 */           i33 = i3;
/*      */           
/*      */           break label1946;
/*      */           
/*      */           label1811:
/*  577 */           if (SystemLibrary.strncmp(i19, 15744, 2) != 0) {
/*      */             break label2002;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  587 */           MainMemory.setI32(i3, i32);
/*  588 */           SystemLibrary.sprintf(i15, 36064, new Object[] { Integer.valueOf(MainMemory.getI8(j)), Integer.valueOf(MainMemory.getI8(i18)) });
/*  589 */           SystemLibrary.sprintf(i16, 36096, new Object[] { Integer.valueOf(MainMemory.getI8(j)), Integer.valueOf(MainMemory.getI8(i18)) });
/*  590 */           SystemLibrary.sprintf(m, 27168, new Object[] { Integer.valueOf(i15), Integer.valueOf(k) });
/*  591 */           i33 = i2;
/*      */           
/*      */ 
/*      */ 
/*      */           label1946:
/*      */           
/*      */ 
/*  598 */           if (MainMemory.getI32(i3) <= -1) {
/*      */             break label3180;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  609 */           i31 = MainMemory.getI32(i7) + (i32 << 2);
/*  610 */           MainMemory.setI32(i31, MainMemory.getI32(i31) + 1);
/*      */           
/*      */           break label3180;
/*      */           
/*      */           label2002:
/*      */           
/*  616 */           MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), -1);
/*  617 */           MainMemory.setI32(i2, -1);
/*  618 */           MainMemory.setI32(i3, -1);
/*  619 */           i = 4;
/*      */           
/*      */ 
/*      */           break label3463;
/*      */           
/*      */           label2040:
/*      */           
/*  626 */           if (MainMemory.getI32(i3) >= 0) {
/*      */             break label2090;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  636 */           i31 = MainMemory.getI32(i7) + (i32 << 2);
/*  637 */           MainMemory.setI32(i31, MainMemory.getI32(i31) + 1);
/*      */           
/*      */ 
/*      */           label2090:
/*      */           
/*      */ 
/*  643 */           if (SystemLibrary.strncmp(j, m, 8) != 0) {
/*      */             break label2137;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  653 */           MainMemory.setI32(i33, i32);
/*  654 */           MainMemory.setI8(m, (byte)0);
/*      */           
/*      */           break label3180;
/*      */           
/*      */           label2137:
/*      */           
/*  660 */           MainMemory.setI32(i2, -1);
/*  661 */           MainMemory.setI32(i3, -1);
/*  662 */           i = 4;
/*      */           
/*      */ 
/*      */           break label3463;
/*      */           
/*      */           label2161:
/*      */           
/*  669 */           if (SystemLibrary.strcmp(j, 35904) != 0) {
/*      */             break label2209;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  679 */           MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), 1100);
/*      */           
/*      */           break label3180;
/*      */           
/*      */           label2209:
/*      */           
/*  685 */           i23 = MainMemory.getI8(j) & 0xFF;
/*  686 */           i25 = i23 + -82;
/*  687 */           if (i25 != 0) {
/*      */             break label2292;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  698 */           i25 = (MainMemory.getI8(i18) & 0xFF) + -65;
/*  699 */           if (i25 != 0) {
/*      */             break label2292;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  710 */           i25 = MainMemory.getI8(i19) & 0xFF;
/*      */           
/*      */ 
/*      */ 
/*      */           label2292:
/*      */           
/*      */ 
/*      */ 
/*  718 */           if (i25 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  728 */             i24 = MainMemory.getI8(i18) & 0xFF;
/*  729 */             i25 = i24 + -76;
/*  730 */             i26 = i25 == 0 ? 1 : 0;
/*  731 */             if (i26 == 0)
/*      */             {
/*      */ 
/*      */ 
/*  735 */               i28 = i25;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  742 */               i28 = (MainMemory.getI8(i19) & 0xFF) + -79;
/*  743 */               if (i28 != 0) {
/*      */                 break label2439;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  754 */               i28 = (MainMemory.getI8(i20) & 0xFF) + -78;
/*  755 */               if (i28 != 0) {
/*      */                 break label2439;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  766 */               i28 = MainMemory.getI8(i11) & 0xFF;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label2439:
/*      */             
/*      */ 
/*  774 */             if (i28 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  784 */               i27 = MainMemory.getI8(i19) & 0xFF;
/*  785 */               i28 = i27 + -76;
/*  786 */               i29 = i28 == 0 ? 1 : 0;
/*  787 */               if (i29 == 0)
/*      */               {
/*      */ 
/*      */ 
/*  791 */                 i30 = i28;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  798 */                 i30 = (MainMemory.getI8(i20) & 0xFF) + -78;
/*  799 */                 if (i30 != 0) {
/*      */                   break label2554;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  810 */                 i30 = MainMemory.getI8(i11) & 0xFF;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2554:
/*      */               
/*      */ 
/*  818 */               if (i30 != 0) {
/*      */                 break label2641;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  828 */           if (MainMemory.getI32(i2) >= 0) {
/*      */             break label2605;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  838 */           MainMemory.setI32(i2, i32);
/*      */           
/*      */ 
/*      */           label2605:
/*      */           
/*      */ 
/*  844 */           i31 = MainMemory.getI32(i7) + (i32 << 2);
/*  845 */           MainMemory.setI32(i31, MainMemory.getI32(i31) + 2000);
/*      */           
/*      */           break label3180;
/*      */           
/*      */           label2641:
/*      */           
/*  851 */           i23 += -68;
/*  852 */           if (i23 != 0) {
/*      */             break label2732;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  863 */           i23 = i24 + -69;
/*  864 */           if (i23 != 0) {
/*      */             break label2732;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  875 */           i23 = i27 + -67;
/*  876 */           if (i23 != 0) {
/*      */             break label2732;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  887 */           i23 = MainMemory.getI8(i20) & 0xFF;
/*      */           
/*      */ 
/*      */ 
/*      */           label2732:
/*      */           
/*      */ 
/*      */ 
/*  895 */           if (i23 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  905 */             if (i26 == 0) {
/*      */               break label2838;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  916 */             i25 = i27 + -65;
/*  917 */             if (i25 != 0) {
/*      */               break label2838;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  928 */             i25 = (MainMemory.getI8(i20) & 0xFF) + -84;
/*  929 */             if (i25 != 0) {
/*      */               break label2838;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  940 */             i25 = MainMemory.getI8(i11) & 0xFF;
/*      */             
/*      */ 
/*      */ 
/*      */             label2838:
/*      */             
/*      */ 
/*      */ 
/*  948 */             if (i25 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  958 */               if (i29 == 0)
/*      */               {
/*      */ 
/*      */ 
/*  962 */                 i25 = i28;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  969 */                 i25 = (MainMemory.getI8(i20) & 0xFF) + -84;
/*  970 */                 if (i25 != 0) {
/*      */                   break label2923;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  981 */                 i25 = MainMemory.getI8(i11) & 0xFF;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2923:
/*      */               
/*      */ 
/*  989 */               if (i25 != 0) {
/*      */                 break label3010;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  999 */           if (MainMemory.getI32(i3) >= 0) {
/*      */             break label2974;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1009 */           MainMemory.setI32(i3, i32);
/*      */           
/*      */ 
/*      */           label2974:
/*      */           
/*      */ 
/* 1015 */           i31 = MainMemory.getI32(i7) + (i32 << 2);
/* 1016 */           MainMemory.setI32(i31, MainMemory.getI32(i31) + 2001);
/*      */           
/*      */           break label3180;
/*      */           
/*      */           label3010:
/*      */           
/* 1022 */           if (SystemLibrary.strcmp(j, 45632) != 0) {
/*      */             break label3090;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1032 */           if (MainMemory.getI32(i5) != -1)
/*      */           {
/*      */ 
/*      */ 
/* 1036 */             i6 = 4;
/*      */             
/*      */ 
/*      */             break label3431;
/*      */           }
/*      */           
/*      */ 
/* 1043 */           MainMemory.setI32(MainMemory.getI32(i7) + (i32 << 2), 2102);
/* 1044 */           MainMemory.setI32(i5, i32);
/*      */           
/*      */           break label3180;
/*      */           
/*      */           label3090:
/*      */           
/* 1050 */           if (spctyp.call(j, 0, 0, 0, 0, 0, 0) != 0) {
/*      */             break label3180;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1061 */           if (MainMemory.getI32(i4) >= 0) {
/*      */             break label3149;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1071 */           MainMemory.setI32(i4, i32);
/*      */           
/*      */ 
/*      */           label3149:
/*      */           
/*      */ 
/* 1077 */           i31 = MainMemory.getI32(i7) + (i32 << 2);
/* 1078 */           MainMemory.setI32(i31, MainMemory.getI32(i31) + 3000);
/*      */           
/*      */ 
/*      */ 
/*      */           label3180:
/*      */           
/*      */ 
/*      */ 
/* 1086 */           i32 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1093 */         if (MainMemory.getI8(m) != 0) {
/*      */           break label3444;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1103 */         i2 = paramInt + 704;
/* 1104 */         i34 = paramInt + 712;
/* 1105 */         i6 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1112 */           i32 = i6 * 10;
/* 1113 */           i28 = i6 * 92;
/* 1114 */           i25 = i28 + 12;
/* 1115 */           i28 += 4;
/* 1116 */           if (MainMemory.getI32(i2) > i6) {
/* 1117 */             i23 = 0;
/*      */           }
/*      */           else
/*      */           {
/* 1121 */             i6 = 0;
/* 1122 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1129 */             i9 = MainMemory.getI32(i34);
/* 1130 */             if (MainMemory.getI32(i9 + i28) <= i23) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1140 */             i3 = MainMemory.getI32(i7) + (MainMemory.getI32(MainMemory.getI32(i9 + i25) + (i23 << 2)) << 2);
/* 1141 */             i24 = MainMemory.getI32(i3);
/* 1142 */             if (i24 / 100 % 10 != 5)
/*      */             {
/*      */ 
/*      */ 
/* 1146 */               i6 = 4;
/*      */               
/*      */ 
/*      */               break label3431;
/*      */             }
/*      */             
/*      */ 
/* 1153 */             MainMemory.setI32(i3, i32 + i24);
/* 1154 */             i23 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1160 */           i6 += 1;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       label3431:
/*      */       
/* 1167 */       i = i6;
/*      */       
/*      */ 
/*      */       break label3463;
/*      */       
/*      */       label3444:
/*      */       
/* 1174 */       MainMemory.setI32(i2, -1);
/* 1175 */       MainMemory.setI32(i3, -1);
/* 1176 */       i = 4;
/*      */       
/*      */ 
/*      */       label3463:
/*      */       
/*      */ 
/* 1182 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1187 */       MainMemory.dealloc_generated(i35);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcs_types.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */