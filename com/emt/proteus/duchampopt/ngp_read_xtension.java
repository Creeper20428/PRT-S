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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class ngp_read_xtension
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3454;
/*   24 */   public static final Function _instance = new ngp_read_xtension();
/*   25 */   public final Function resolve() { return _instance; }
/*      */   
/*   27 */   public ngp_read_xtension() { super("ngp_read_xtension", 3, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   31 */     return call(paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     int m = call(i, j, k);
/*   46 */     paramFrame.setI32(paramInt1, m);
/*   47 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   52 */     int i = 0;
/*      */     
/*   54 */     int j = 0;
/*   55 */     int k = 0;
/*   56 */     int m = 0;
/*   57 */     int n = 0;
/*   58 */     int i1 = 0;
/*   59 */     int i2 = 0;
/*   60 */     int i3 = 0;
/*   61 */     int i4 = 0;
/*   62 */     int i5 = 0;
/*   63 */     int i6 = 0;
/*   64 */     int i7 = 0;
/*   65 */     int i8 = 0;
/*   66 */     int i9 = 0;
/*   67 */     int i10 = 0;
/*   68 */     int i11 = 0;
/*   69 */     int i12 = 0;
/*   70 */     int i13 = 0;
/*   71 */     int i14 = 0;
/*   72 */     int i15 = 0;
/*   73 */     int i16 = 0;
/*   74 */     int i17 = 0;
/*      */     
/*      */ 
/*   77 */     int i18 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   81 */       j = MainMemory.alloc(4);
/*   82 */       k = MainMemory.alloc(4);
/*   83 */       m = MainMemory.alloc(4);
/*   84 */       n = MainMemory.alloc(4);
/*   85 */       i1 = MainMemory.alloc(80);
/*   86 */       i2 = MainMemory.alloc(1);
/*   87 */       i3 = MainMemory.alloc(3996);
/*   88 */       i4 = MainMemory.alloc(8);
/*   89 */       i5 = MainMemory.alloc(4);
/*   90 */       MainMemory.setI8(i1, (byte)0);
/*   91 */       i6 = i4 + 4;
/*   92 */       MainMemory.setI32(i6, 0);
/*   93 */       MainMemory.setI32(i4, 0);
/*   94 */       MainMemory.setI32(j, 0);
/*   95 */       i12 = ngp_read_line.call(0);
/*   96 */       MainMemory.setI32(j, i12);
/*   97 */       if (i12 != 0) {
/*      */         break label2664;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  107 */       i12 = MainMemory.getI32Aligned(467196);
/*  108 */       if ((paramInt3 & 0x1) != 0) {
/*      */         break label239;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  118 */       if (i12 == 3) {
/*      */         break label258;
/*      */       } else {
/*      */         break label2650;
/*      */       }
/*      */       
/*      */ 
/*      */       label239:
/*      */       
/*  127 */       if (i12 != 4) {
/*      */         break label2650;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label258:
/*      */       
/*      */ 
/*      */ 
/*  137 */       i12 = ngp_hdu_insert_token.call(i4);
/*  138 */       MainMemory.setI32(j, i12);
/*  139 */       if (i12 == 0) {
/*  140 */         i12 = 0;
/*      */       } else {
/*      */         break label2637;
/*      */       }
/*      */       
/*      */       label437:
/*      */       label694:
/*      */       label744:
/*      */       label770:
/*      */       do
/*      */       {
/*  151 */         i9 = ngp_read_line.call(0);
/*  152 */         MainMemory.setI32(j, i9);
/*  153 */         if (i9 != 0) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  163 */         switch (MainMemory.getI32Aligned(467196)) {
/*      */         case 1: 
/*      */           break label437;
/*      */           break;
/*      */         case 2: 
/*      */           break label437;
/*      */           break; case 3:  break label437;
/*      */           break; case 4:  break; case 5:  i10 = 1;
/*      */           
/*  172 */           continue; break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  180 */         MainMemory.setI32(j, 369);
/*  181 */         i9 = 369;
/*  182 */         i10 = 0;
/*      */         
/*  184 */         continue;
/*      */         
/*      */ 
/*      */ 
/*  188 */         i7 = MainMemory.getI32Aligned(468000);
/*  189 */         if (i7 == 0) {
/*  190 */           i9 = 363;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*  200 */         else if (MainMemory.getI32Aligned(458912) != 0)
/*      */         {
/*      */ 
/*      */ 
/*  204 */           i9 = 364;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  211 */           MainMemory.setI32Aligned(458912, i7);
/*  212 */           MainMemory.setI32Aligned(458916, MainMemory.getI32Aligned(468004));
/*  213 */           MainMemory.setI32Aligned(458920, MainMemory.getI32Aligned(468008));
/*  214 */           MainMemory.setI32Aligned(467200, MainMemory.getI32Aligned(468012));
/*  215 */           MainMemory.setI32Aligned(458924, MainMemory.getI32Aligned(468016));
/*  216 */           MainMemory.setI32Aligned(467204, MainMemory.getI32Aligned(468020));
/*  217 */           MainMemory.setI32Aligned(468000, 0);
/*  218 */           i9 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  225 */         MainMemory.setI32(j, i9);
/*      */         
/*  227 */         i10 = 1;
/*      */         
/*  229 */         continue;
/*      */         
/*      */ 
/*      */ 
/*  233 */         i9 = SystemLibrary.strlen(481700);
/*  234 */         if (!MathUtils.ult(i9 + -2, 5)) {
/*      */           break label770;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  245 */         i9 += -1;
/*  246 */         i7 = 481700 + i9;
/*  247 */         if (MainMemory.getI8(i7) != 35) {
/*      */           break label770;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  258 */         if (MainMemory.getI8(i1) != 0) {
/*      */           break label694;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  268 */         SystemLibrary.memcpy(i1, 481700, i9, 1);
/*  269 */         MainMemory.setI8(i1 + i9, (byte)0);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  275 */         if (i9 != SystemLibrary.strlen(i1)) {
/*      */           break label744;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  286 */         i12 = (SystemLibrary.memcmp(i1, 481700, i9) == 0 ? 1 : 0) + i12;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  294 */         SystemLibrary.sprintf(i7, 15680, new Object[] { Integer.valueOf(i12) });
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  302 */         i9 = ngp_hdu_insert_token.call(i4);
/*  303 */         MainMemory.setI32(j, i9);
/*      */         
/*  305 */         i10 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*  315 */       while ((i9 | i10) == 0);
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
/*  326 */       if (i9 == 0) {
/*  327 */         i12 = 0;
/*      */       }
/*      */       else
/*      */       {
/*  331 */         paramInt3 = i9;
/*      */         
/*      */ 
/*      */         break label2358;
/*      */       }
/*      */       
/*      */       for (;;)
/*      */       {
/*  339 */         MainMemory.setI32(i3 + (i12 << 2), 0);
/*  340 */         i12 += 1;
/*  341 */         if (i12 == 999) {
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
/*  352 */       if (MainMemory.getI32(i4) > 0) {
/*  353 */         i7 = 0;
/*  354 */         i8 = 0;
/*  355 */         i9 = 0;
/*  356 */         i10 = 0;
/*  357 */         i11 = 0;
/*      */       }
/*      */       else
/*      */       {
/*      */         break label2340;
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
/*  372 */         i12 = i11 + 1;
/*  373 */         i13 = MainMemory.getI32(i6);
/*  374 */         i14 = i13 + i11 * 172 + 4;
/*  375 */         if (SystemLibrary.strcmp(45664, i14) != 0) {
/*      */           break label1468;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  385 */         if (MainMemory.getI32(i13 + i11 * 172) != 2) {
/*      */           break label1936;
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
/*  399 */         i14 = MainMemory.getI32(i13 + i11 * 172 + 76);
/*  400 */         i11 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  407 */           if (i11 >= 8)
/*      */           {
/*      */ 
/*      */ 
/*  411 */             i8 = 3;
/*  412 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  418 */           i15 = MainMemory.getI8(45216 + i11);
/*  419 */           i15 = MathUtils.ult((byte)(i15 + -97), (byte)26) ? (byte)(i15 + -32) : i15;
/*  420 */           i16 = MainMemory.getI8(i14 + i11);
/*  421 */           if (i15 != (MathUtils.ult((byte)(i16 + -97), (byte)26) ? (byte)(i16 + -32) : i16)) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  432 */           if (i15 == 0) {
/*  433 */             i8 = 3;
/*  434 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  443 */           i11 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  450 */         i11 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  457 */           if (i11 >= 5)
/*      */           {
/*      */ 
/*      */ 
/*  461 */             i8 = 2;
/*  462 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  468 */           i15 = MainMemory.getI8(26880 + i11);
/*  469 */           i15 = MathUtils.ult((byte)(i15 + -97), (byte)26) ? (byte)(i15 + -32) : i15;
/*  470 */           i16 = MainMemory.getI8(i14 + i11);
/*  471 */           if (i15 != (MathUtils.ult((byte)(i16 + -97), (byte)26) ? (byte)(i16 + -32) : i16)) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  482 */           if (i15 == 0) {
/*  483 */             i8 = 2;
/*  484 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  493 */           i11 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  500 */         i11 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  507 */           if (i11 >= 5)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  513 */             i8 = 1;
/*      */             
/*  515 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  521 */           i15 = MainMemory.getI8(26848 + i11);
/*  522 */           i15 = MathUtils.ult((byte)(i15 + -97), (byte)26) ? (byte)(i15 + -32) : i15;
/*  523 */           i16 = MainMemory.getI8(i14 + i11);
/*  524 */           if (i15 != (MathUtils.ult((byte)(i16 + -97), (byte)26) ? (byte)(i16 + -32) : i16)) {
/*      */             break;
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
/*  538 */           if (i15 == 0)
/*      */           {
/*      */ 
/*  541 */             i8 = 1;
/*      */             
/*  543 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  552 */           i11 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */         label1468:
/*      */         
/*  558 */         if (SystemLibrary.strcmp(36032, i14) != 0) {
/*      */           break label1561;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  568 */         if (MainMemory.getI32(i13 + i11 * 172) != 1) {
/*      */           break label1936;
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
/*  582 */         if (MainMemory.getI8(i13 + i11 * 172 + 76) != 0)
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  598 */           i8 = 1;
/*      */           
/*      */           break label1936;
/*      */           
/*      */           label1561:
/*      */           
/*  604 */           if (SystemLibrary.strcmp(28224, i14) != 0) {
/*      */             break label1641;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  614 */           if (MainMemory.getI32(i13 + i11 * 172) != 3) {
/*      */             break label1936;
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
/*  628 */           i9 = MainMemory.getI32(i13 + i11 * 172 + 76);
/*      */           
/*      */ 
/*      */           break label1936;
/*      */           
/*      */ 
/*      */           label1641:
/*      */           
/*      */ 
/*  637 */           if (SystemLibrary.strcmp(24224, i14) != 0) {
/*      */             break label1721;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  647 */           if (MainMemory.getI32(i13 + i11 * 172) != 3) {
/*      */             break label1936;
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
/*  661 */           i10 = MainMemory.getI32(i13 + i11 * 172 + 76);
/*      */           
/*      */ 
/*      */           break label1936;
/*      */           
/*      */ 
/*      */           label1721:
/*      */           
/*      */ 
/*  670 */           if (SystemLibrary.strcmp(40928, i14) != 0) {
/*      */             break label1800;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  680 */           if (MainMemory.getI32(i13 + i11 * 172) != 2) {
/*      */             break label1936;
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
/*  694 */           i7 = MainMemory.getI32(i13 + i11 * 172 + 76);
/*      */           
/*      */ 
/*      */           break label1936;
/*      */           
/*      */ 
/*      */           label1800:
/*      */           
/*      */ 
/*  703 */           if (SystemLibrary.sscanf(i14, 47520, new int[] { m, i2 }) != 1) {
/*      */             break label1936;
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
/*  717 */           i13 = MainMemory.getI32(i6);
/*  718 */           if (MainMemory.getI32(i13 + i11 * 172) != 3) {
/*      */             break label1936;
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
/*  732 */           i17 = MainMemory.getI32(m) + -1;
/*  733 */           if (!MathUtils.ult(i17, 999)) {
/*      */             break label1936;
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
/*  747 */           MainMemory.setI32(i3 + (i17 << 2), MainMemory.getI32(i13 + i11 * 172 + 76));
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label1936:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  761 */         if (MainMemory.getI32(i4) <= i12) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*  766 */         i11 = i12;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  776 */       switch (i8) {
/*      */       case 1:  break label2176;
/*      */         break; case 2:  paramInt3 = 1;
/*      */         
/*      */ 
/*      */         break label2025;
/*      */         
/*      */         break;
/*      */       case 3: 
/*      */         break;
/*      */       }
/*      */       
/*      */       
/*  789 */       paramInt3 = 2;
/*      */       
/*      */ 
/*      */ 
/*      */       label2025:
/*      */       
/*      */ 
/*  796 */       ffcrtb.call(paramInt1, paramInt3, 0L, 0, 0, 0, 0, 0, j);
/*  797 */       paramInt3 = MainMemory.getI32(j);
/*  798 */       if (paramInt3 != 0) {
/*      */         break label2266;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  809 */       paramInt3 = ngp_append_columns.call(paramInt1, i4, 0);
/*  810 */       MainMemory.setI32(j, paramInt3);
/*  811 */       if (paramInt3 != 0) {
/*      */         break label2266;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  822 */       paramInt3 = ngp_keyword_all_write.call(i4, paramInt1);
/*  823 */       MainMemory.setI32(j, paramInt3);
/*  824 */       if (paramInt3 != 0) {
/*      */         break label2266;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  835 */       i12 = MainMemory.getI32(i3 + 4);
/*  836 */       if (i12 <= 0) {
/*      */         break label2266;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  847 */       ffirow.call(paramInt1, 0L, i12, j);
/*  848 */       paramInt3 = MainMemory.getI32(j);
/*      */       
/*      */       break label2266;
/*      */       
/*      */       label2176:
/*      */       
/*  854 */       if ((paramInt3 & 0x3) != 2) {
/*      */         break label2212;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */       ffcrim.call(paramInt1, 16, 0, 0, j);
/*      */       
/*      */ 
/*      */       label2212:
/*      */       
/*      */ 
/*  870 */       ffcrim.call(paramInt1, i9, i10, i3, j);
/*  871 */       paramInt3 = MainMemory.getI32(j);
/*  872 */       if (paramInt3 != 0) {
/*      */         break label2266;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  883 */       paramInt3 = ngp_keyword_all_write.call(i4, paramInt1);
/*  884 */       MainMemory.setI32(j, paramInt3);
/*      */       
/*      */ 
/*      */ 
/*      */       label2266:
/*      */       
/*      */ 
/*      */ 
/*  892 */       if ((paramInt3 != 0) || (i7 == 0)) {
/*      */         break label2358;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  903 */       MainMemory.setI32(j, ngp_get_extver.call(i7, n));
/*  904 */       MainMemory.setI32(i5, MainMemory.getI32(n));
/*  905 */       ffpky.call(paramInt1, 41, 34656, i5, 79392, j);
/*  906 */       paramInt3 = MainMemory.getI32(j);
/*      */       
/*      */       break label2358;
/*      */       
/*      */       label2340:
/*      */       
/*  912 */       MainMemory.setI32(j, 368);
/*      */       
/*      */       break label2461;
/*      */       
/*      */       label2358:
/*      */       
/*  918 */       if ((paramInt3 != 0) || (paramInt2 <= 0))
/*      */       {
/*      */ 
/*      */ 
/*  922 */         paramInt2 = paramInt3;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  929 */         paramInt3 = MainMemory.getI32(paramInt1) + 1;
/*  930 */         ffmahd.call(paramInt1, paramInt2, k, j);
/*  931 */         ffgtam.call(paramInt1, paramInt3, j);
/*  932 */         ffmahd.call(paramInt1, paramInt3, k, j);
/*  933 */         paramInt2 = MainMemory.getI32(j);
/*  934 */         if (paramInt2 != 0)
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
/*  945 */           i = paramInt2;
/*      */           
/*      */ 
/*      */           break label2672;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  953 */       if (paramInt2 != 0)
/*      */       {
/*      */         label2461:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  963 */         MainMemory.setI32(k, 0);
/*  964 */         ffdhdu.call(paramInt1, 0, k);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  970 */       i13 = MainMemory.getI32(i6);
/*  971 */       if (MainMemory.getI32(i4) > 0)
/*      */       {
/*  973 */         paramInt3 = 0;
/*      */       } else {
/*      */         break label2583;
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
/*  986 */         paramInt2 = paramInt3 + 1;
/*  987 */         if (MainMemory.getI32(i13 + paramInt3 * 172) != 2) {
/*      */           break label2555;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  997 */         ngp_read_xtension_1589.call(i6, i13, paramInt3);
/*      */         
/*      */ 
/*      */         label2555:
/*      */         
/*      */ 
/* 1003 */         i13 = MainMemory.getI32(i6);
/* 1004 */         if (MainMemory.getI32(i4) <= paramInt2)
/*      */           break;
/* 1006 */         paramInt3 = paramInt2;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label2583:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1018 */       if (i13 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1028 */         free.call(i13);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1034 */       i = MainMemory.getI32(j);
/*      */       
/*      */ 
/*      */ 
/*      */       break label2672;
/*      */       
/*      */ 
/* 1041 */       i = i9;
/*      */       
/*      */ 
/*      */       break label2672;
/*      */       
/*      */       label2637:
/*      */       
/* 1048 */       i = i12;
/*      */       
/*      */ 
/*      */       break label2672;
/*      */       
/*      */       label2650:
/*      */       
/* 1055 */       i = 369;
/*      */       
/*      */ 
/*      */       break label2672;
/*      */       
/*      */       label2664:
/*      */       
/* 1062 */       i = i12;
/*      */       
/*      */ 
/*      */       label2672:
/*      */       
/*      */ 
/* 1068 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1073 */       MainMemory.dealloc_generated(i18);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_read_xtension.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */