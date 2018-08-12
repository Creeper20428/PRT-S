/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.LongJmpException;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.malloc;
/*      */ import com.emt.proteus.runtime.library.c.realloc;
/*      */ 
/*      */ 
/*      */ public final class wcsutrn
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2962;
/*   19 */   public static final Function _instance = new wcsutrn();
/*   20 */   public final Function resolve() { return _instance; }
/*      */   
/*   22 */   public wcsutrn() { super("wcsutrn", 2, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2)
/*      */   {
/*   26 */     return call(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int k = call(i, j);
/*   38 */     paramFrame.setI32(paramInt1, k);
/*   39 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2)
/*      */   {
/*   44 */     int i = 0;
/*      */     
/*   46 */     int j = 0;
/*   47 */     int k = 0;
/*   48 */     int m = 0;
/*   49 */     int n = 0;
/*   50 */     int i1 = 0;
/*   51 */     int i2 = 0;
/*   52 */     short s1 = 0;
/*   53 */     short s2 = 0;
/*   54 */     short s3 = 0;
/*   55 */     int i3 = 0;
/*   56 */     int i4 = 0;
/*   57 */     int i5 = 0;
/*   58 */     int i6 = 0;
/*   59 */     int i9 = 0;
/*   60 */     int i10 = 0;
/*   61 */     int i11 = 0;
/*   62 */     int i12 = 0;
/*   63 */     int i13 = 0;
/*   64 */     int i14 = 0;
/*   65 */     int i15 = 0;
/*   66 */     int i16 = 0;
/*   67 */     int i17 = 0;
/*   68 */     int i18 = 0;
/*   69 */     int i19 = 0;
/*   70 */     int i20 = 0;
/*   71 */     int i21 = 0;
/*   72 */     int i22 = 0;
/*   73 */     int i23 = 0;
/*   74 */     int i24 = 0;
/*   75 */     int i25 = 0;
/*   76 */     int i26 = 0;
/*   77 */     int i27 = 0;
/*   78 */     int i28 = 0;
/*   79 */     int i29 = 0;
/*   80 */     int i30 = 0;
/*   81 */     int i31 = 0;
/*   82 */     int i32 = 0;
/*      */     
/*      */ 
/*   85 */     int i33 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   89 */       j = MainMemory.alloc(80);
/*   90 */       k = MainMemory.alloc(80);
/*   91 */       m = k;
/*   92 */       MainMemory.setI8(j, (byte)0);
/*   93 */       n = k;
/*   94 */       MainMemory.setI8(n, (byte)0);
/*   95 */       wcsutrn_scan_bytes.call(paramInt2, SystemLibrary.strlen(paramInt2));
/*   96 */       MainMemory.setI8(paramInt2, (byte)0);
/*   97 */       i3 = SystemLibrary._setjmp(481536);
/*      */       
/*   99 */       if (i3 != 0) {
/*      */         break label7153;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  109 */       MainMemory.setI32Aligned(459412, 1);
/*  110 */       if (!MainMemory.getI1(459040))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  120 */         MainMemory.setI1(459040, true);
/*  121 */         i1 = MainMemory.getI32Aligned(458812);
/*  122 */         if (i1 != 0) {
/*      */           break label267;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  133 */         i1 = MainMemory.getI32Aligned(1792);
/*  134 */         MainMemory.setI32Aligned(458812, i1);
/*      */         
/*      */ 
/*      */ 
/*      */         label267:
/*      */         
/*      */ 
/*      */ 
/*  142 */         if (MainMemory.getI32Aligned(458816) != 0) {
/*      */           break label304;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  152 */         MainMemory.setI32Aligned(458816, MainMemory.getI32Aligned(1792));
/*      */         
/*      */ 
/*      */         label304:
/*      */         
/*      */ 
/*  158 */         i13 = MainMemory.getI32Aligned(458880);
/*  159 */         i2 = i13 == 0 ? 1 : 0;
/*  160 */         if (i2 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  170 */           i29 = MainMemory.getI32(i13);
/*  171 */           if (i29 != 0) {
/*      */             break label532;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  182 */           if (i2 == 0) {
/*      */             break label420;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  192 */         i10 = malloc.call(4);
/*  193 */         i13 = i10;
/*  194 */         MainMemory.setI32Aligned(458880, i13);
/*  195 */         MainMemory.setI32(i10, 0);
/*  196 */         MainMemory.setI32Aligned(459420, 1);
/*      */         
/*      */ 
/*      */         break label507;
/*      */         
/*      */         label420:
/*      */         
/*  203 */         i3 = MainMemory.getI32Aligned(459420);
/*  204 */         if (i3 != 1) {
/*      */           break label507;
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
/*  216 */         i3 += 8;
/*  217 */         i13 = realloc.call(i13, i3 << 2);
/*  218 */         MainMemory.setI32Aligned(458880, i13);
/*  219 */         SystemLibrary.memset(i13 + (MainMemory.getI32Aligned(459420) << 2), (byte)0, 32, 4);
/*  220 */         MainMemory.setI32Aligned(459420, i3);
/*  221 */         i1 = MainMemory.getI32Aligned(458812);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label507:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  231 */         MainMemory.setI32(i13, wcsutrn_create_buffer.call(i1));
/*  232 */         i29 = MainMemory.getI32(MainMemory.getI32Aligned(458880));
/*      */         
/*      */ 
/*      */ 
/*      */         label532:
/*      */         
/*      */ 
/*      */ 
/*  240 */         MainMemory.setI32Aligned(459416, MainMemory.getI32(i29 + 16));
/*  241 */         i10 = MainMemory.getI32(i29 + 8);
/*  242 */         MainMemory.setI32Aligned(458884, i10);
/*  243 */         MainMemory.setI32Aligned(458944, i10);
/*  244 */         MainMemory.setI32Aligned(458812, MainMemory.getI32(i29));
/*  245 */         MainMemory.setI8(459036, MainMemory.getI8(i10));
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  251 */       s1 = (paramInt1 & 0x4) == 0 ? 68 : 100;
/*  252 */       s2 = (paramInt1 & 0x2) == 0 ? 72 : 104;
/*  253 */       s3 = (paramInt1 & 0x1) == 0 ? 83 : 115;
/*  254 */       paramInt1 = 0;
/*  255 */       i3 = 0;
/*  256 */       i4 = -1;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  265 */         i12 = MainMemory.getI32Aligned(458884);
/*  266 */         i6 = MainMemory.getI8(459036);
/*  267 */         MainMemory.setI8(i12, i6);
/*  268 */         i11 = MainMemory.getI32Aligned(459412);
/*  269 */         i20 = MainMemory.getI32Aligned(458880);
/*  270 */         i24 = MainMemory.getI32(MainMemory.getI32(i20) + 28) + i11;
/*      */         
/*  272 */         i13 = i20;
/*  273 */         i14 = i20;
/*  274 */         i15 = i20;
/*  275 */         i16 = i20;
/*  276 */         i17 = i20;
/*  277 */         i18 = i20;
/*  278 */         i32 = i20;
/*  279 */         i31 = i20;
/*      */         
/*      */ 
/*      */ 
/*  283 */         i10 = i12;
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
/*      */         for (;;)
/*      */         {
/*  304 */           i5 = MainMemory.getI16(180640 + (i24 << 8) + ((i6 & 0xFF) << 1));
/*  305 */           i24 = i5;
/*  306 */           if (i5 > 0) {
/*  307 */             i25 = 0;
/*      */           } else {
/*      */             break label859;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           int i7;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  323 */             i25 += 1;
/*  324 */             i21 = i10 + i25;
/*  325 */             i7 = MainMemory.getI8(i21);
/*  326 */             i5 = MainMemory.getI16(180640 + (i24 << 8) + ((i7 & 0xFF) << 1));
/*  327 */             i24 = i5;
/*  328 */             if (i5 <= 0) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */           break label859;
/*      */           
/*  335 */           i10 = i21;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label859:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  346 */           i25 = 0 - i24;
/*      */           
/*  348 */           i24 = i11;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  357 */           i9 = i20;
/*  358 */           i11 = i25;
/*      */           
/*  360 */           i21 = i12;
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
/*  380 */             i25 = MainMemory.getI16(150016 + (i11 << 1));
/*  381 */             MainMemory.setI32Aligned(458944, i21);
/*  382 */             i11 = i10;
/*  383 */             MainMemory.setI32Aligned(467224, i11 - i21);
/*  384 */             MainMemory.setI8(459036, i7);
/*  385 */             MainMemory.setI8(i10, (byte)0);
/*  386 */             MainMemory.setI32Aligned(458884, i10);
/*  387 */             i12 = i21;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  395 */             i19 = i10;
/*  396 */             i20 = i32;
/*      */             
/*  398 */             i32 = i9;
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
/*      */             for (;;)
/*      */             {
/*  420 */               switch (i25) {
/*      */               case 1: 
/*      */                 break label7032;
/*      */                 break;
/*      */               case 2: 
/*      */                 break label6965;
/*      */                 break;
/*      */               case 3: 
/*      */                 break label6836;
/*      */                 break;
/*      */               case 4: 
/*      */                 break label6738;
/*      */                 break;
/*      */               case 5: 
/*      */                 break label6640;
/*      */                 break;
/*      */               case 6: 
/*      */                 break label6545;
/*      */                 break;
/*      */               case 7:  break label6451;
/*      */                 break; case 8:  break label6357;
/*      */                 break; case 9:  break label6266;
/*      */                 break; case 10:  break label6172;
/*      */                 break; case 11:  break label6081;
/*      */                 break; case 12:  break label5990;
/*      */                 break; case 13:  break label5899;
/*      */                 break; case 14:  break label5805;
/*      */                 break; case 15:  break label5711;
/*      */                 break; case 16:  break label5620;
/*      */                 break; case 17:  break label5526;
/*      */                 break; case 18:  break label5435;
/*      */                 break; case 19:  break label5341;
/*      */                 break; case 20:  break label5250;
/*      */                 break; case 21:  break label5159;
/*      */                 break; case 22:  break label5068;
/*      */                 break; case 23:  break label4977;
/*      */                 break; case 24:  break label4883;
/*      */                 break; case 25:  break label4788;
/*      */                 break; case 26:  break label4697;
/*      */                 break; case 27:  break label4606;
/*      */                 break; case 28:  break label4512;
/*      */                 break; case 29:  break label4421;
/*      */                 break; case 30:  break label4327;
/*      */                 break; case 31:  break label4236;
/*      */                 break; case 32:  break label4151;
/*      */                 break; case 33:  break label4065;
/*      */                 break; case 34:  break label3922;
/*      */                 break; case 35:  break label3798;
/*      */                 break; case 36:  break label3720;
/*      */                 break; case 37:  break label3635;
/*      */                 break; case 38:  break label1544;
/*      */                 break; case 39:  break; case 40:  break; case 41:  break; }
/*  472 */               if (MainMemory.getI8(n) == 0) {
/*  473 */                 paramInt1 = i4;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  483 */                 SystemLibrary.strcat(paramInt2, n);
/*  484 */                 if (SystemLibrary.strcmp(j, n) == 0) {
/*  485 */                   paramInt1 = i4;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  495 */                   paramInt1 = 0;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  502 */               wcsutrnlex_destroy.call();
/*  503 */               i = i3 == 0 ? paramInt1 : 12;
/*      */               
/*      */ 
/*      */               break label7161;
/*      */               
/*      */               label1544:
/*      */               
/*  510 */               MainMemory.setI8(i10, MainMemory.getI8(459036));
/*  511 */               i29 = MainMemory.getI32(i32);
/*  512 */               if (MainMemory.getI32(i29 + 44) != 0) {
/*      */                 break label1640;
/*      */               }
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
/*  525 */               MainMemory.setI32Aligned(459416, MainMemory.getI32(i29 + 16));
/*  526 */               MainMemory.setI32(i29, MainMemory.getI32Aligned(458812));
/*  527 */               MainMemory.setI32(MainMemory.getI32(i31) + 44, 1);
/*  528 */               i29 = MainMemory.getI32(i20);
/*  529 */               i31 = i20;
/*      */               
/*  531 */               i32 = i20;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label1640:
/*      */               
/*      */ 
/*      */ 
/*  540 */               i22 = MainMemory.getI32(i29 + 4);
/*  541 */               i23 = MainMemory.getI32Aligned(459416);
/*  542 */               if (!MathUtils.ult(i22 + i23, i19)) {
/*      */                 break label3297;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  552 */               if (!MathUtils.ult(i22 + (i23 + 1), i19)) {
/*      */                 break label1746;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  562 */               SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(124896) });
/*  563 */               SystemLibrary.longjmp(481536, 2);
/*      */               
/*      */ 
/*      */               label1746:
/*      */               
/*      */ 
/*  569 */               i30 = i19;
/*  570 */               i24 = i21;
/*  571 */               i25 = i30 - i24;
/*  572 */               if (MainMemory.getI32(i29 + 40) != 0) {
/*      */                 break label1816;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  582 */               i25 = i25 == 1 ? 1 : 2;
/*      */               
/*  584 */               i19 = i22;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  592 */               i30 = i23;
/*      */               
/*      */ 
/*      */ 
/*      */               break label2749;
/*      */               
/*      */ 
/*      */               label1816:
/*      */               
/*      */ 
/*  602 */               i25 += -1;
/*  603 */               if (i25 <= 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  608 */                 i18 = i32;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  615 */                 i23 = i30 + -1 - i24;
/*  616 */                 i30 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  623 */                   MainMemory.setI8(i22 + i30, MainMemory.getI8(i21 + i30));
/*  624 */                   i30 += 1;
/*  625 */                   if (i30 == i23) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  636 */                 i29 = MainMemory.getI32(i18);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  646 */               if (MainMemory.getI32(i29 + 44) != 2)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  651 */                 i12 = i19;
/*  652 */                 i14 = i18;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*  660 */                 MainMemory.setI32Aligned(459416, 0);
/*  661 */                 MainMemory.setI32(i29 + 16, 0);
/*  662 */                 i23 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 break label2522;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  676 */                 i23 = MainMemory.getI32(i29 + 12) - i25 + -1;
/*  677 */                 if (i23 >= 1) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  687 */                 i29 = i14 == 0 ? 0 : i29;
/*  688 */                 i26 = i29 + 4;
/*  689 */                 i21 = MainMemory.getI32(i26);
/*  690 */                 i23 = i12 - i21;
/*  691 */                 if (MainMemory.getI32(i29 + 20) != 0) {
/*      */                   break label2083;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  701 */                 MainMemory.setI32(i26, 0);
/*      */                 
/*      */                 break label2183;
/*      */                 
/*      */                 label2083:
/*  706 */                 i27 = i29 + 12;
/*  707 */                 i30 = MainMemory.getI32(i27);
/*  708 */                 i28 = i30 << 1;
/*  709 */                 if (i28 >= 1)
/*      */                 {
/*      */ 
/*      */ 
/*  713 */                   i30 = i28;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  720 */                   i30 = (i30 >>> 3) + i30;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  728 */                 MainMemory.setI32(i27, i30);
/*  729 */                 i12 = realloc.call(i21, i30 + 2);
/*  730 */                 MainMemory.setI32(i26, i12);
/*  731 */                 if (i12 != 0) {
/*      */                   break label2219;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2183:
/*      */                 
/*      */ 
/*      */ 
/*  741 */                 SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(100064) });
/*  742 */                 SystemLibrary.longjmp(481536, 2);
/*      */                 
/*      */ 
/*      */                 label2219:
/*      */                 
/*      */ 
/*  748 */                 i12 += i23;
/*  749 */                 MainMemory.setI32Aligned(458884, i12);
/*  750 */                 i14 = MainMemory.getI32Aligned(458880);
/*  751 */                 i29 = MainMemory.getI32(i14);
/*  752 */                 i13 = i14;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  760 */               i30 = i23 > 8192 ? 8192 : i23;
/*  761 */               i27 = SystemLibrary.__errno_location();
/*  762 */               MainMemory.setI32(i27, 0);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  770 */                 i12 = MainMemory.getI32(MainMemory.getI32(i13) + 4) + i25;
/*  771 */                 i23 = SystemLibrary.read(fileno.call(MainMemory.getI32Aligned(458812)), i12, i30);
/*  772 */                 MainMemory.setI32Aligned(459416, i23);
/*  773 */                 if (i23 >= 0) {
/*      */                   break label2441;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  783 */                 if (MainMemory.getI32(i27) != 4) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  793 */                 MainMemory.setI32(i27, 0);
/*  794 */                 SystemLibrary.clearerr(MainMemory.getI32Aligned(458812));
/*  795 */                 i13 = MainMemory.getI32Aligned(458880);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  801 */               SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(74336) });
/*  802 */               SystemLibrary.longjmp(481536, 2);
/*      */               
/*      */ 
/*      */               label2441:
/*      */               
/*      */ 
/*  808 */               i18 = MainMemory.getI32Aligned(458880);
/*  809 */               MainMemory.setI32(MainMemory.getI32(i18) + 16, i23);
/*  810 */               if (i23 == 0)
/*      */               {
/*  812 */                 i17 = i18;
/*  813 */                 i16 = i18;
/*  814 */                 i15 = i18;
/*  815 */                 i14 = i18;
/*  816 */                 i13 = i18;
/*      */               }
/*      */               else
/*      */               {
/*  820 */                 i13 = i18;
/*  821 */                 i32 = i18;
/*  822 */                 i14 = i18;
/*  823 */                 i15 = i18;
/*  824 */                 i30 = i23;
/*  825 */                 i23 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */                 break label2627;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label2522:
/*      */               
/*      */ 
/*      */ 
/*  838 */               if (i25 != 0) {
/*      */                 break label2591;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  848 */               wcsutrnrestart.call(MainMemory.getI32Aligned(458812));
/*  849 */               i23 = MainMemory.getI32Aligned(459416);
/*  850 */               i15 = MainMemory.getI32Aligned(458880);
/*  851 */               i13 = i15;
/*  852 */               i32 = i15;
/*  853 */               i14 = i15;
/*      */               
/*  855 */               i30 = i23;
/*  856 */               i23 = 1;
/*      */               
/*      */               break label2627;
/*      */               
/*      */               label2591:
/*  861 */               MainMemory.setI32(MainMemory.getI32(i17) + 44, 2);
/*      */               
/*  863 */               i32 = i14;
/*  864 */               i14 = i15;
/*  865 */               i15 = i16;
/*  866 */               i30 = i23;
/*  867 */               i23 = 2;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               label2627:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  879 */               i25 = i30 + i25;
/*  880 */               MainMemory.setI32Aligned(459416, i25);
/*  881 */               MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i15) + 4) + i25, (byte)0);
/*  882 */               MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i14) + 4) + (i25 + 1), (byte)0);
/*  883 */               i29 = MainMemory.getI32(i32);
/*  884 */               i21 = MainMemory.getI32(i29 + 4);
/*  885 */               MainMemory.setI32Aligned(458944, i21);
/*  886 */               i12 = i21;
/*  887 */               i19 = i21;
/*      */               
/*      */ 
/*  890 */               i14 = i32;
/*  891 */               i15 = i32;
/*  892 */               i16 = i32;
/*  893 */               i17 = i32;
/*  894 */               i18 = i32;
/*  895 */               i30 = i25;
/*  896 */               i20 = i32;
/*  897 */               i31 = i32;
/*      */               
/*      */ 
/*  900 */               i25 = i23;
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
/*      */               label2749:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  921 */               switch (i25)
/*      */               {
/*      */               case 0: 
/*      */                 break label3074;
/*      */                 
/*      */                 break;
/*      */               case 1: 
/*      */                 break label3035;
/*      */                 
/*      */                 break;
/*      */               case 2: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/*  936 */               i10 = i19 + i30;
/*  937 */               MainMemory.setI32Aligned(458884, i10);
/*  938 */               i11 = MainMemory.getI32Aligned(459412);
/*  939 */               i24 = MainMemory.getI32(i29 + 28) + i11;
/*  940 */               if (!MathUtils.ult(i21, i10))
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
/*  953 */                 i9 = i32;
/*  954 */                 i25 = i24;
/*      */                 
/*  956 */                 i12 = i21;
/*      */                 
/*      */ 
/*      */                 break label3546;
/*      */               }
/*      */               
/*      */ 
/*  963 */               i12 = i21 + 1;
/*  964 */               i25 = (MathUtils.ugt(i10, i12) ? i10 : i12) + (0 - i21);
/*  965 */               i23 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  974 */                 i8 = MainMemory.getI8(i21 + i23);
/*  975 */                 if (i8 != 0) {
/*      */                   break label2965;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  985 */                 i24 = MainMemory.getI32(155232 + (i24 << 2));
/*      */                 
/*      */                 break label2992;
/*      */                 
/*      */                 label2965:
/*      */                 
/*  991 */                 i24 = MainMemory.getI16(180640 + (i24 << 8) + ((i8 & 0xFF) << 1));
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2992:
/*      */                 
/*      */ 
/*      */ 
/*  999 */                 i23 += 1;
/* 1000 */                 if (i23 == i25)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1010 */                   i9 = i32;
/* 1011 */                   i25 = i24;
/*      */                   
/* 1013 */                   i12 = i21;
/*      */                   
/*      */ 
/*      */                   break label3546;
/*      */                   
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */               label3035:
/*      */               
/* 1024 */               MainMemory.setI32Aligned(458884, i21);
/* 1025 */               i24 = MainMemory.getI32Aligned(459412);
/* 1026 */               i25 = (i24 + -1) / 2 + 39;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1035 */               i19 = i21;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label3074:
/*      */             
/*      */ 
/*      */ 
/* 1045 */             i25 = i11 - i24 + -1;
/* 1046 */             i10 = i21 + i25;
/* 1047 */             MainMemory.setI32Aligned(458884, i10);
/* 1048 */             i11 = MainMemory.getI32Aligned(459412);
/* 1049 */             i24 = MainMemory.getI32(i29 + 28) + i11;
/* 1050 */             if (i25 <= 0)
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
/* 1063 */               i9 = i32;
/*      */               
/*      */ 
/* 1066 */               i12 = i21;
/*      */               
/*      */ 
/*      */               break label3610;
/*      */             }
/*      */             
/*      */ 
/* 1073 */             i12 = i21 + 1;
/* 1074 */             i25 = (MathUtils.ugt(i10, i12) ? i10 : i12) + (0 - i21);
/* 1075 */             i23 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/* 1084 */               i8 = MainMemory.getI8(i21 + i23);
/* 1085 */               if (i8 != 0) {
/*      */                 break label3231;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1095 */               i24 = MainMemory.getI32(155232 + (i24 << 2));
/*      */               
/*      */               break label3258;
/*      */               
/*      */               label3231:
/*      */               
/* 1101 */               i24 = MainMemory.getI16(180640 + (i24 << 8) + ((i8 & 0xFF) << 1));
/*      */               
/*      */ 
/*      */ 
/*      */               label3258:
/*      */               
/*      */ 
/*      */ 
/* 1109 */               i23 += 1;
/* 1110 */               if (i23 == i25)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1120 */                 i9 = i32;
/*      */                 
/*      */ 
/* 1123 */                 i12 = i21;
/*      */                 
/*      */ 
/*      */                 break label3610;
/*      */                 
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */             label3297:
/*      */             
/* 1134 */             i11 -= i21;
/* 1135 */             i25 = i11 + -1;
/* 1136 */             i10 = i12 + i25;
/* 1137 */             MainMemory.setI32Aligned(458884, i10);
/* 1138 */             i30 = MainMemory.getI32(i29 + 28) + i24;
/* 1139 */             if (i25 <= 0)
/*      */             {
/*      */ 
/*      */ 
/* 1143 */               i23 = i30;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1150 */               i21 = i12 + 1;
/* 1151 */               i25 = (MathUtils.ugt(i10, i21) ? i10 : i21) + (0 - i12);
/* 1152 */               i23 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1161 */                 i8 = MainMemory.getI8(i12 + i23);
/* 1162 */                 if (i8 != 0) {
/*      */                   break label3447;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1172 */                 i30 = MainMemory.getI32(155232 + (i30 << 2));
/*      */                 
/*      */                 break label3474;
/*      */                 
/*      */                 label3447:
/*      */                 
/* 1178 */                 i30 = MainMemory.getI16(180640 + (i30 << 8) + ((i8 & 0xFF) << 1));
/*      */                 
/*      */ 
/*      */ 
/*      */                 label3474:
/*      */                 
/*      */ 
/*      */ 
/* 1186 */                 i23 += 1;
/* 1187 */                 if (i23 == i25) {
/* 1188 */                   i23 = i30; break;
/*      */                 }
/*      */               }
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
/* 1201 */             i25 = MainMemory.getI32(155232 + (i23 << 2));
/* 1202 */             if (i25 == 0) {
/* 1203 */               i11 = i24;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1212 */               i9 = i32;
/* 1213 */               i25 = i23;
/*      */             }
/*      */             else
/*      */             {
/*      */               break label3579;
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
/*      */             label3546:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1238 */             i8 = MainMemory.getI8(i10);
/*      */             
/* 1240 */             i24 = i11;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1247 */             i32 = i20;
/*      */             
/*      */ 
/* 1250 */             i11 = i25;
/*      */             
/* 1252 */             i21 = i12;
/*      */           }
/*      */           
/*      */           label3579:
/*      */           
/* 1257 */           i10 = i12 + i11;
/* 1258 */           MainMemory.setI32Aligned(458884, i10);
/* 1259 */           i11 = i24;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1268 */           i9 = i32;
/* 1269 */           i24 = i25;
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
/*      */           label3610:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1290 */           int i8 = MainMemory.getI8(i10);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1298 */           i32 = i20;
/*      */           
/* 1300 */           i20 = i9;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3635:
/*      */         
/*      */ 
/*      */ 
/* 1309 */         i11 = MainMemory.getI32Aligned(467224);
/* 1310 */         if (i11 <= 0) {
/*      */           break label3696;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1320 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label3696:
/*      */         
/*      */ 
/* 1326 */         SystemLibrary.fwrite(i21, i11, 1, MainMemory.getI32Aligned(458816));
/*      */         
/*      */ 
/*      */ 
/* 1330 */         continue;
/*      */         
/*      */         label3720:
/*      */         
/* 1334 */         i11 = MainMemory.getI32Aligned(467224);
/* 1335 */         if (i11 <= 0) {
/*      */           break label3781;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1345 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label3781:
/*      */         
/*      */ 
/* 1351 */         SystemLibrary.strcat(paramInt2, i21);
/*      */         
/*      */ 
/*      */ 
/* 1355 */         continue;
/*      */         
/*      */         label3798:
/*      */         
/* 1359 */         i11 = MainMemory.getI32Aligned(467224);
/* 1360 */         if (i11 <= 0) {
/*      */           break label3859;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1370 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label3859:
/*      */         
/*      */ 
/* 1376 */         SystemLibrary.strcat(paramInt2, n);
/* 1377 */         i4 = SystemLibrary.strcmp(j, n) == 0 ? i4 : 0;
/* 1378 */         i10 = MainMemory.getI32Aligned(458944);
/* 1379 */         F254301.call(MainMemory.getI8(i10), i10);
/* 1380 */         MainMemory.setI8(n, (byte)0);
/* 1381 */         MainMemory.setI32Aligned(459412, 1);
/*      */         
/*      */ 
/*      */ 
/* 1385 */         continue;
/*      */         
/*      */         label3922:
/*      */         
/* 1389 */         i11 = MainMemory.getI32Aligned(467224);
/* 1390 */         if (i11 <= 0) {
/*      */           break label3983;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1400 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label3983:
/*      */         
/*      */ 
/* 1406 */         SystemLibrary.strcat(paramInt2, n);
/* 1407 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)32);
/* 1408 */         i4 = SystemLibrary.strcmp(j, n) == 0 ? i4 : 0;
/* 1409 */         i10 = MainMemory.getI32Aligned(458944);
/* 1410 */         F254301.call(MainMemory.getI8(i10 + (MainMemory.getI32Aligned(467224) + -1)), i10);
/* 1411 */         MainMemory.setI8(n, (byte)0);
/* 1412 */         MainMemory.setI32Aligned(459412, 1);
/*      */         
/*      */ 
/*      */ 
/* 1416 */         continue;
/*      */         
/*      */         label4065:
/*      */         
/* 1420 */         i11 = MainMemory.getI32Aligned(467224);
/* 1421 */         if (i11 <= 0) {
/*      */           break label4126;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1431 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4126:
/*      */         
/*      */ 
/* 1437 */         F254301.call(MainMemory.getI8(i21 + (i11 + -1)), i21);
/*      */         
/*      */ 
/*      */ 
/* 1441 */         continue;
/*      */         
/*      */         label4151:
/*      */         
/* 1445 */         i11 = MainMemory.getI32Aligned(467224);
/* 1446 */         if (i11 <= 0) {
/*      */           break label4212;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1456 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4212:
/*      */         
/*      */ 
/* 1462 */         SystemLibrary.strcat(j, i21);
/* 1463 */         SystemLibrary.strcpy(n, j);
/*      */         
/*      */ 
/*      */ 
/* 1467 */         continue;
/*      */         
/*      */         label4236:
/*      */         
/* 1471 */         i11 = MainMemory.getI32Aligned(467224);
/* 1472 */         if (i11 <= 0) {
/*      */           break label4297;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1482 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4297:
/*      */         
/*      */ 
/* 1488 */         SystemLibrary.strcpy(j, i21);
/* 1489 */         SystemLibrary.strcpy(n, j);
/* 1490 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1494 */         continue;
/*      */         
/*      */         label4327:
/*      */         
/* 1498 */         i11 = MainMemory.getI32Aligned(467224);
/* 1499 */         if (i11 <= 0) {
/*      */           break label4388;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1509 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4388:
/*      */         
/*      */ 
/* 1515 */         SystemLibrary.strcpy(j, i21);
/* 1516 */         SystemLibrary.memcpy(n, 15264, 3, 1);
/* 1517 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1521 */         continue;
/*      */         
/*      */         label4421:
/*      */         
/* 1525 */         i11 = MainMemory.getI32Aligned(467224);
/* 1526 */         if (i11 <= 0) {
/*      */           break label4482;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1536 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4482:
/*      */         
/*      */ 
/* 1542 */         SystemLibrary.strcpy(j, i21);
/* 1543 */         MainMemory.setI16(m, (short)86);
/* 1544 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1548 */         continue;
/*      */         
/*      */         label4512:
/*      */         
/* 1552 */         i3 = MainMemory.getI32Aligned(467224);
/* 1553 */         if (i3 <= 0) {
/*      */           break label4573;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1563 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i3 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4573:
/*      */         
/*      */ 
/* 1569 */         SystemLibrary.strcpy(j, i21);
/* 1570 */         MainMemory.setI16(m, s3);
/* 1571 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/* 1573 */         i3 = 1;
/*      */         
/* 1575 */         continue;
/*      */         
/*      */         label4606:
/*      */         
/* 1579 */         i11 = MainMemory.getI32Aligned(467224);
/* 1580 */         if (i11 <= 0) {
/*      */           break label4667;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1590 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4667:
/*      */         
/*      */ 
/* 1596 */         SystemLibrary.strcpy(j, i21);
/* 1597 */         MainMemory.setI16(m, (short)115);
/* 1598 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1602 */         continue;
/*      */         
/*      */         label4697:
/*      */         
/* 1606 */         i11 = MainMemory.getI32Aligned(467224);
/* 1607 */         if (i11 <= 0) {
/*      */           break label4758;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1617 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4758:
/*      */         
/*      */ 
/* 1623 */         SystemLibrary.strcpy(j, i21);
/* 1624 */         MainMemory.setI32(k, 6578546);
/* 1625 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1629 */         continue;
/*      */         
/*      */         label4788:
/*      */         
/* 1633 */         i11 = MainMemory.getI32Aligned(467224);
/* 1634 */         if (i11 <= 0) {
/*      */           break label4849;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1644 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4849:
/*      */         
/*      */ 
/* 1650 */         SystemLibrary.strcpy(j, i21);
/* 1651 */         SystemLibrary.memcpy(n, 26240, 6, 1);
/* 1652 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1656 */         continue;
/*      */         
/*      */         label4883:
/*      */         
/* 1660 */         i11 = MainMemory.getI32Aligned(467224);
/* 1661 */         if (i11 <= 0) {
/*      */           break label4944;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1671 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label4944:
/*      */         
/*      */ 
/* 1677 */         SystemLibrary.strcpy(j, i21);
/* 1678 */         SystemLibrary.memcpy(n, 15232, 3, 1);
/* 1679 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1683 */         continue;
/*      */         
/*      */         label4977:
/*      */         
/* 1687 */         i11 = MainMemory.getI32Aligned(467224);
/* 1688 */         if (i11 <= 0) {
/*      */           break label5038;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1698 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5038:
/*      */         
/*      */ 
/* 1704 */         SystemLibrary.strcpy(j, i21);
/* 1705 */         MainMemory.setI32(k, 7170159);
/* 1706 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1710 */         continue;
/*      */         
/*      */         label5068:
/*      */         
/* 1714 */         i11 = MainMemory.getI32Aligned(467224);
/* 1715 */         if (i11 <= 0) {
/*      */           break label5129;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1725 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5129:
/*      */         
/*      */ 
/* 1731 */         SystemLibrary.strcpy(j, i21);
/* 1732 */         MainMemory.setI32(k, 8013901);
/* 1733 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1737 */         continue;
/*      */         
/*      */         label5159:
/*      */         
/* 1741 */         i11 = MainMemory.getI32Aligned(467224);
/* 1742 */         if (i11 <= 0) {
/*      */           break label5220;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1752 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5220:
/*      */         
/*      */ 
/* 1758 */         SystemLibrary.strcpy(j, i21);
/* 1759 */         MainMemory.setI32(k, 7235949);
/* 1760 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1764 */         continue;
/*      */         
/*      */         label5250:
/*      */         
/* 1768 */         i11 = MainMemory.getI32Aligned(467224);
/* 1769 */         if (i11 <= 0) {
/*      */           break label5311;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1779 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5311:
/*      */         
/*      */ 
/* 1785 */         SystemLibrary.strcpy(j, i21);
/* 1786 */         MainMemory.setI16(m, (short)109);
/* 1787 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1791 */         continue;
/*      */         
/*      */         label5341:
/*      */         
/* 1795 */         i11 = MainMemory.getI32Aligned(467224);
/* 1796 */         if (i11 <= 0) {
/*      */           break label5402;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1806 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5402:
/*      */         
/*      */ 
/* 1812 */         SystemLibrary.strcpy(j, i21);
/* 1813 */         SystemLibrary.memcpy(n, 15200, 3, 1);
/* 1814 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1818 */         continue;
/*      */         
/*      */         label5435:
/*      */         
/* 1822 */         i11 = MainMemory.getI32Aligned(467224);
/* 1823 */         if (i11 <= 0) {
/*      */           break label5496;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1833 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5496:
/*      */         
/*      */ 
/* 1839 */         SystemLibrary.strcpy(j, i21);
/* 1840 */         MainMemory.setI16(m, (short)75);
/* 1841 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1845 */         continue;
/*      */         
/*      */         label5526:
/*      */         
/* 1849 */         i11 = MainMemory.getI32Aligned(467224);
/* 1850 */         if (i11 <= 0) {
/*      */           break label5587;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1860 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5587:
/*      */         
/*      */ 
/* 1866 */         SystemLibrary.strcpy(j, i21);
/* 1867 */         SystemLibrary.memcpy(n, 15168, 3, 1);
/* 1868 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1872 */         continue;
/*      */         
/*      */         label5620:
/*      */         
/* 1876 */         i11 = MainMemory.getI32Aligned(467224);
/* 1877 */         if (i11 <= 0) {
/*      */           break label5681;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1887 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5681:
/*      */         
/*      */ 
/* 1893 */         SystemLibrary.strcpy(j, i21);
/* 1894 */         MainMemory.setI32(k, 8013931);
/* 1895 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1899 */         continue;
/*      */         
/*      */         label5711:
/*      */         
/* 1903 */         i11 = MainMemory.getI32Aligned(467224);
/* 1904 */         if (i11 <= 0) {
/*      */           break label5772;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1914 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5772:
/*      */         
/*      */ 
/* 1920 */         SystemLibrary.strcpy(j, i21);
/* 1921 */         SystemLibrary.memcpy(n, 14304, 3, 1);
/* 1922 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1926 */         continue;
/*      */         
/*      */         label5805:
/*      */         
/* 1930 */         i3 = MainMemory.getI32Aligned(467224);
/* 1931 */         if (i3 <= 0) {
/*      */           break label5866;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1941 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i3 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5866:
/*      */         
/*      */ 
/* 1947 */         SystemLibrary.strcpy(j, i21);
/* 1948 */         MainMemory.setI16(m, s2);
/* 1949 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/* 1951 */         i3 = 1;
/*      */         
/* 1953 */         continue;
/*      */         
/*      */         label5899:
/*      */         
/* 1957 */         i11 = MainMemory.getI32Aligned(467224);
/* 1958 */         if (i11 <= 0) {
/*      */           break label5960;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1968 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label5960:
/*      */         
/*      */ 
/* 1974 */         SystemLibrary.strcpy(j, i21);
/* 1975 */         MainMemory.setI16(m, (short)104);
/* 1976 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 1980 */         continue;
/*      */         
/*      */         label5990:
/*      */         
/* 1984 */         i11 = MainMemory.getI32Aligned(467224);
/* 1985 */         if (i11 <= 0) {
/*      */           break label6051;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1995 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6051:
/*      */         
/*      */ 
/* 2001 */         SystemLibrary.strcpy(j, i21);
/* 2002 */         MainMemory.setI32(k, 8013895);
/* 2003 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2007 */         continue;
/*      */         
/*      */         label6081:
/*      */         
/* 2011 */         i11 = MainMemory.getI32Aligned(467224);
/* 2012 */         if (i11 <= 0) {
/*      */           break label6142;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2022 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6142:
/*      */         
/*      */ 
/* 2028 */         SystemLibrary.strcpy(j, i21);
/* 2029 */         MainMemory.setI32(k, 6776164);
/* 2030 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2034 */         continue;
/*      */         
/*      */         label6172:
/*      */         
/* 2038 */         i3 = MainMemory.getI32Aligned(467224);
/* 2039 */         if (i3 <= 0) {
/*      */           break label6233;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2049 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i3 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6233:
/*      */         
/*      */ 
/* 2055 */         SystemLibrary.strcpy(j, i21);
/* 2056 */         MainMemory.setI16(m, s1);
/* 2057 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/* 2059 */         i3 = 1;
/*      */         
/* 2061 */         continue;
/*      */         
/*      */         label6266:
/*      */         
/* 2065 */         i11 = MainMemory.getI32Aligned(467224);
/* 2066 */         if (i11 <= 0) {
/*      */           break label6327;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2076 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6327:
/*      */         
/*      */ 
/* 2082 */         SystemLibrary.strcpy(j, i21);
/* 2083 */         MainMemory.setI16(m, (short)100);
/* 2084 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2088 */         continue;
/*      */         
/*      */         label6357:
/*      */         
/* 2092 */         i11 = MainMemory.getI32Aligned(467224);
/* 2093 */         if (i11 <= 0) {
/*      */           break label6418;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2103 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6418:
/*      */         
/*      */ 
/* 2109 */         SystemLibrary.strcpy(j, i21);
/* 2110 */         SystemLibrary.memcpy(n, 20480, 5, 1);
/* 2111 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2115 */         continue;
/*      */         
/*      */         label6451:
/*      */         
/* 2119 */         i11 = MainMemory.getI32Aligned(467224);
/* 2120 */         if (i11 <= 0) {
/*      */           break label6512;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2130 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6512:
/*      */         
/*      */ 
/* 2136 */         SystemLibrary.strcpy(j, i21);
/* 2137 */         SystemLibrary.memcpy(n, 20256, 5, 1);
/* 2138 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2142 */         continue;
/*      */         
/*      */         label6545:
/*      */         
/* 2146 */         i11 = MainMemory.getI32Aligned(467224);
/* 2147 */         if (i11 <= 0) {
/*      */           break label6606;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2157 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6606:
/*      */         
/*      */ 
/* 2163 */         SystemLibrary.strcpy(j, i21);
/* 2164 */         SystemLibrary.memcpy(n, 32992, 7, 1);
/* 2165 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2169 */         continue;
/*      */         
/*      */         label6640:
/*      */         
/* 2173 */         i11 = MainMemory.getI32Aligned(467224);
/* 2174 */         if (i11 <= 0) {
/*      */           break label6703;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2184 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6703:
/*      */         
/*      */ 
/* 2190 */         SystemLibrary.strcpy(j, i21);
/* 2191 */         SystemLibrary.memcpy(n, 32928, 7, 1);
/* 2192 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2196 */         continue;
/*      */         
/*      */         label6738:
/*      */         
/* 2200 */         i11 = MainMemory.getI32Aligned(467224);
/* 2201 */         if (i11 <= 0) {
/*      */           break label6801;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2211 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6801:
/*      */         
/*      */ 
/* 2217 */         SystemLibrary.strcpy(j, i21);
/* 2218 */         SystemLibrary.memcpy(n, 44576, 9, 1);
/* 2219 */         MainMemory.setI32Aligned(459412, 3);
/*      */         
/*      */ 
/*      */ 
/* 2223 */         continue;
/*      */         
/*      */         label6836:
/*      */         
/* 2227 */         i11 = MainMemory.getI32Aligned(467224);
/* 2228 */         if (i11 <= 0) {
/*      */           break label6899;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2238 */         MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */         
/*      */ 
/*      */         label6899:
/*      */         
/*      */ 
/* 2244 */         SystemLibrary.strcat(paramInt2, i21);
/* 2245 */         if (paramInt1 != 0)
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
/* 2258 */           if (MainMemory.getI8(MainMemory.getI32Aligned(458944)) != 93) {}
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
/* 2271 */           MainMemory.setI32Aligned(459412, 5);
/*      */           
/*      */ 
/*      */ 
/* 2275 */           continue;
/*      */           
/*      */           label6965:
/*      */           
/* 2279 */           i11 = MainMemory.getI32Aligned(467224);
/* 2280 */           if (i11 <= 0) {}
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
/* 2293 */           MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (i11 + -1)) == 10 ? 1 : 0);
/*      */           
/*      */ 
/*      */ 
/* 2297 */           continue;
/*      */           
/*      */           label7032:
/*      */           
/* 2301 */           paramInt1 = MainMemory.getI32Aligned(467224);
/* 2302 */           if (paramInt1 <= 0) {
/*      */             break label7092;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2312 */           MainMemory.setI32(MainMemory.getI32(i32) + 28, MainMemory.getI8(i21 + (paramInt1 + -1)) == 10 ? 1 : 0);
/*      */           
/*      */ 
/*      */           label7092:
/*      */           
/*      */ 
/* 2318 */           MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)91);
/* 2319 */           paramInt1 = 1;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 2326 */       SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(116192) });
/* 2327 */       SystemLibrary.longjmp(481536, 2);
/*      */       
/*      */ 
/*      */       label7153:
/*      */       
/*      */ 
/* 2333 */       i = 9;
/*      */       
/*      */ 
/*      */       label7161:
/*      */       
/*      */ 
/* 2339 */       return i;
/*      */     }
/*      */     catch (LongJmpException localLongJmpException)
/*      */     {
/*      */       for (;;) {
/* 2344 */         i3 = localLongJmpException.getReturnValue();
/*      */       }
/* 2346 */       return i;
/*      */     }
/*      */     finally
/*      */     {
/* 2350 */       MainMemory.dealloc_generated(i33);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsutrn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */