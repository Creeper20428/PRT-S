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
/*      */ import com.emt.proteus.runtime.library.cpp.__strcspn_c3;
/*      */ 
/*      */ public final class ffbins extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3457;
/*   16 */   public static final Function _instance = new ffbins();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public ffbins() { super("ffbins", 14, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
/*      */   {
/*   23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14);
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
/*   50 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   51 */     paramInt4 += 2;
/*   52 */     paramInt3--;
/*   53 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   54 */     paramInt4 += 2;
/*   55 */     paramInt3--;
/*   56 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   57 */     paramInt4 += 2;
/*   58 */     paramInt3--;
/*   59 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   60 */     paramInt4 += 2;
/*   61 */     paramInt3--;
/*   62 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   63 */     paramInt4 += 2;
/*   64 */     paramInt3--;
/*   65 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   66 */     paramInt4 += 2;
/*   67 */     paramInt3--;
/*   68 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   69 */     paramInt4 += 2;
/*   70 */     paramInt3--;
/*   71 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9);
/*   72 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
/*      */   {
/*   78 */     int i = 0;
/*   79 */     int j = 0;
/*   80 */     int k = 0;
/*   81 */     int m = 0;
/*   82 */     int n = 0;
/*   83 */     int i1 = 0;
/*   84 */     int i2 = 0;
/*   85 */     int i3 = 0;
/*   86 */     int i4 = 0;
/*   87 */     int i5 = 0;
/*   88 */     int i6 = 0;
/*   89 */     int i7 = 0;
/*   90 */     int i8 = 0;
/*   91 */     int i9 = 0;
/*   92 */     int i10 = 0;
/*   93 */     int i11 = 0;
/*   94 */     int i12 = 0;
/*   95 */     int i13 = 0;
/*      */     
/*      */ 
/*   98 */     int i14 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  102 */       i = MainMemory.alloc(4);
/*  103 */       j = MainMemory.alloc(30);
/*  104 */       k = MainMemory.alloc(4);
/*  105 */       m = MainMemory.alloc(8);
/*  106 */       MainMemory.setI32(k, 0);
/*  107 */       if (MainMemory.getI32(paramInt14) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  117 */         MainMemory.setI32(paramInt3, 2);
/*  118 */         MainMemory.setI32(paramInt2, 31);
/*  119 */         MainMemory.setF64(paramInt11, 1.0D);
/*  120 */         MainMemory.setI32(paramInt13, 0);
/*  121 */         MainMemory.setI8(paramInt12, (byte)0);
/*  122 */         MainMemory.setI8(paramInt4, (byte)0);
/*  123 */         MainMemory.setI8(paramInt8, (byte)0);
/*  124 */         MainMemory.setI8(paramInt9, (byte)0);
/*  125 */         MainMemory.setI8(paramInt10, (byte)0);
/*  126 */         MainMemory.setF64(paramInt5, -9.1191291391491E-36D);
/*  127 */         MainMemory.setF64(paramInt6, -9.1191291391491E-36D);
/*  128 */         MainMemory.setF64(paramInt7, -9.1191291391491E-36D);
/*  129 */         i1 = paramInt5 + 8;
/*  130 */         i2 = paramInt6 + 8;
/*  131 */         n = paramInt7 + 8;
/*  132 */         i5 = paramInt8 + 71;
/*  133 */         i6 = paramInt9 + 71;
/*  134 */         i9 = paramInt10 + 71;
/*  135 */         MainMemory.setI8(paramInt4 + 71, (byte)0);
/*  136 */         MainMemory.setI8(i5, (byte)0);
/*  137 */         MainMemory.setI8(i6, (byte)0);
/*  138 */         MainMemory.setI8(i9, (byte)0);
/*  139 */         MainMemory.setF64(i1, -9.1191291391491E-36D);
/*  140 */         MainMemory.setF64(i2, -9.1191291391491E-36D);
/*  141 */         MainMemory.setF64(n, -9.1191291391491E-36D);
/*  142 */         i1 = paramInt5 + 16;
/*  143 */         i2 = paramInt6 + 16;
/*  144 */         i3 = paramInt7 + 16;
/*  145 */         i5 = paramInt8 + 142;
/*  146 */         i6 = paramInt9 + 142;
/*  147 */         i9 = paramInt10 + 142;
/*  148 */         MainMemory.setI8(paramInt4 + 142, (byte)0);
/*  149 */         MainMemory.setI8(i5, (byte)0);
/*  150 */         MainMemory.setI8(i6, (byte)0);
/*  151 */         MainMemory.setI8(i9, (byte)0);
/*  152 */         MainMemory.setF64(i1, -9.1191291391491E-36D);
/*  153 */         MainMemory.setF64(i2, -9.1191291391491E-36D);
/*  154 */         MainMemory.setF64(i3, -9.1191291391491E-36D);
/*  155 */         i1 = paramInt5 + 24;
/*  156 */         i2 = paramInt6 + 24;
/*  157 */         i3 = paramInt7 + 24;
/*  158 */         i5 = paramInt8 + 213;
/*  159 */         i6 = paramInt9 + 213;
/*  160 */         i9 = paramInt10 + 213;
/*  161 */         MainMemory.setI8(paramInt4 + 213, (byte)0);
/*  162 */         MainMemory.setI8(i5, (byte)0);
/*  163 */         MainMemory.setI8(i6, (byte)0);
/*  164 */         MainMemory.setI8(i9, (byte)0);
/*  165 */         MainMemory.setF64(i1, -9.1191291391491E-36D);
/*  166 */         MainMemory.setF64(i2, -9.1191291391491E-36D);
/*  167 */         MainMemory.setF64(i3, -9.1191291391491E-36D);
/*  168 */         i5 = paramInt1 + 3;
/*  169 */         MainMemory.setI32(i, i5);
/*  170 */         switch (MainMemory.getI8(i5)) {
/*      */         case 105: 
/*      */           break label701;
/*      */           break;
/*      */         case 106: 
/*      */           break label676;
/*      */           break; case 114:  break label645;
/*      */           break; case 100:  break label614;
/*      */           break; case 98:  break; default:  i4 = 1;
/*  179 */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  186 */         MainMemory.setI32(paramInt2, 11);
/*  187 */         i5 = paramInt1 + 4;
/*  188 */         MainMemory.setI32(i, i5);
/*      */         
/*  190 */         i4 = 0;
/*      */         
/*      */         break label727;
/*      */         
/*      */         label614:
/*  195 */         MainMemory.setI32(paramInt2, 82);
/*  196 */         i5 = paramInt1 + 4;
/*  197 */         MainMemory.setI32(i, i5);
/*      */         
/*  199 */         i4 = 0;
/*      */         
/*      */         break label727;
/*      */         
/*      */         label645:
/*  204 */         MainMemory.setI32(paramInt2, 42);
/*  205 */         i5 = paramInt1 + 4;
/*  206 */         MainMemory.setI32(i, i5);
/*      */         
/*  208 */         i4 = 0;
/*      */         
/*      */         break label727;
/*      */         
/*      */         label676:
/*  213 */         i5 = paramInt1 + 4;
/*  214 */         MainMemory.setI32(i, i5);
/*      */         
/*  216 */         i4 = 0;
/*      */         
/*      */         break label727;
/*      */         
/*      */         label701:
/*  221 */         MainMemory.setI32(paramInt2, 21);
/*  222 */         i5 = paramInt1 + 4;
/*  223 */         MainMemory.setI32(i, i5);
/*      */         
/*  225 */         i4 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */         label727:
/*      */         
/*      */ 
/*      */ 
/*  233 */         switch (MainMemory.getI8(i5))
/*      */         {
/*      */         case 0: 
/*      */           break label2923;
/*      */           
/*      */           break;
/*      */         case 32: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*      */         for (;;)
/*      */         {
/*  246 */           i6 = i5 + 1;
/*  247 */           MainMemory.setI32(i, i6);
/*  248 */           i10 = MainMemory.getI8(i6);
/*  249 */           switch (i10) {
/*  250 */           case 32:  i5 = i6; } }
/*      */         break label871;
/*      */         break label2923;
/*      */         break label871;
/*      */         break label871;
/*  255 */         i5 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */         break label999;
/*      */         
/*      */ 
/*      */         label871:
/*      */         
/*      */ 
/*  265 */         if (ffimport_file.call(i5 + 2, k, paramInt14) != 0) {
/*      */           break label2923;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  275 */         i6 = MainMemory.getI32(k);
/*  276 */         MainMemory.setI32(i, i6);
/*  277 */         i10 = MainMemory.getI8(i6);
/*  278 */         if (i10 == 32) {
/*  279 */           i5 = i6;
/*      */         }
/*      */         else
/*      */         {
/*  283 */           i5 = i6;
/*      */           
/*      */ 
/*      */ 
/*      */           break label999;
/*      */         }
/*      */         
/*      */ 
/*      */         for (;;)
/*      */         {
/*  293 */           i9 = i5 + 1;
/*  294 */           MainMemory.setI32(i, i9);
/*  295 */           i10 = MainMemory.getI8(i9);
/*  296 */           if (i10 != 32) break;
/*  297 */           i5 = i9;
/*      */         }
/*      */         break label999;
/*  300 */         i5 = i6;
/*      */         
/*  302 */         i6 = i9;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label999:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  313 */         if (i10 == 40) {
/*  314 */           i9 = i6;
/*  315 */           i11 = 0;
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*  320 */           i11 = 0;
/*      */           
/*      */ 
/*      */           break label1994;
/*      */         }
/*      */         
/*      */ 
/*      */         for (;;)
/*      */         {
/*  329 */           i12 = i11 + 1;
/*  330 */           i6 = paramInt4 + i11 * 71;
/*  331 */           if (i11 >= 4)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  336 */             i6 = i9;
/*      */             
/*      */ 
/*      */             break label1285;
/*      */           }
/*      */           
/*      */           do
/*      */           {
/*  344 */             i9 += 1;
/*  345 */             MainMemory.setI32(i, i9);
/*  346 */           } while (MainMemory.getI8(i9) == 32);
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
/*  357 */           i7 = __strcspn_c3.call(i9, 32, 44, 41);
/*  358 */           SystemLibrary.strncat(i6, MainMemory.getI32(i), i7);
/*  359 */           i6 = MainMemory.getI32(i);
/*  360 */           i9 = i6 + i7;
/*  361 */           MainMemory.setI32(i, i9);
/*  362 */           i10 = MainMemory.getI8(i9);
/*  363 */           if (i10 != 32)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  368 */             i6 = i9;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  375 */             i7 += 1;
/*  376 */             i8 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  383 */               i9 = i6 + (i7 + i8);
/*  384 */               MainMemory.setI32(i, i9);
/*  385 */               i10 = MainMemory.getI8(i9);
/*  386 */               i8 += 1;
/*  387 */               if (i10 != 32) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             break label1246;
/*  392 */             i6 = i9;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1246:
/*      */           
/*      */ 
/*      */ 
/*  402 */           if (i10 == 41) {
/*      */             break;
/*      */           }
/*      */           
/*  406 */           i9 = i6;
/*  407 */           i11 = i12;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  414 */         MainMemory.setI32(paramInt3, i12);
/*      */         
/*      */ 
/*      */ 
/*      */         label1285:
/*      */         
/*      */ 
/*      */ 
/*  422 */         if (i11 != 4)
/*      */         {
/*      */ 
/*      */ 
/*  426 */           i11 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  433 */           ffxmsg.call(5, 142752);
/*  434 */           ffxmsg.call(5, paramInt1);
/*  435 */           if (i5 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  445 */             free.call(i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  451 */           MainMemory.setI32(paramInt14, 125);
/*      */           
/*      */ 
/*      */           break label2956;
/*      */         }
/*      */         
/*      */         for (;;)
/*      */         {
/*  459 */           i11 += 1;
/*  460 */           i9 = i6 + i11;
/*  461 */           MainMemory.setI32(i, i9);
/*  462 */           switch (MainMemory.getI8(i9)) {} }
/*      */         break label1452;
/*      */         break label1905;
/*      */         break label1452;
/*  466 */         i6 = i9;
/*      */         
/*      */ 
/*      */         break label1452;
/*      */         
/*      */         break label1935;
/*      */         
/*      */         label1452:
/*      */         
/*      */         do
/*      */         {
/*  477 */           i6 += 1;
/*  478 */           MainMemory.setI32(i, i6);
/*  479 */         } while (MainMemory.getI8(i6) == 32);
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
/*  490 */         ffbinr.call(i, j, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, MainMemory.getI32(paramInt14));
/*  491 */         if (MainMemory.getI32(paramInt14) <= 0) {
/*      */           break label1571;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  501 */         ffxmsg.call(5, 88288);
/*  502 */         ffxmsg.call(5, paramInt1);
/*  503 */         if (i5 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  513 */           free.call(i5);
/*      */           
/*      */ 
/*      */           break label2956;
/*      */           
/*      */           label1571:
/*      */           
/*  520 */           if (MainMemory.getI32(paramInt3) > 1) {
/*  521 */             i11 = 0;
/*      */           } else {
/*      */             break label1733;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  532 */             i12 = i11 + 1;
/*  533 */             n = paramInt6 + (i12 << 3);
/*  534 */             i1 = paramInt7 + (i12 << 3);
/*  535 */             i6 = paramInt8 + i12 * 71;
/*  536 */             i9 = paramInt9 + i12 * 71;
/*  537 */             i13 = paramInt10 + i12 * 71;
/*  538 */             MainMemory.setF64(paramInt5 + (i12 << 3), MainMemory.getF64(paramInt5));
/*  539 */             MainMemory.setF64(n, MainMemory.getF64(paramInt6));
/*  540 */             MainMemory.setF64(i1, MainMemory.getF64(paramInt7));
/*  541 */             SystemLibrary.strcpy(i6, paramInt8);
/*  542 */             SystemLibrary.strcpy(i9, paramInt9);
/*  543 */             SystemLibrary.strcpy(i13, paramInt10);
/*  544 */             if (MainMemory.getI32(paramInt3) <= i11 + 2) break;
/*  545 */             i11 = i12;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1733:
/*      */           
/*      */ 
/*      */ 
/*  555 */           i6 = MainMemory.getI32(i);
/*  556 */           i10 = MainMemory.getI8(i6);
/*  557 */           if (i10 != 32) {
/*      */             break label1804;
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
/*      */           do
/*      */           {
/*  571 */             i6 += 1;
/*  572 */             MainMemory.setI32(i, i6);
/*  573 */             i10 = MainMemory.getI8(i6);
/*  574 */           } while (i10 == 32);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           label1804:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  589 */           switch (i10)
/*      */           {
/*      */           case 59: 
/*      */             break label2629;
/*      */             
/*      */             break;
/*      */           case 0: 
/*      */             break label2923;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*  601 */           ffxmsg.call(5, 125856);
/*  602 */           ffxmsg.call(5, paramInt1);
/*  603 */           if (i5 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  613 */             free.call(i5);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  619 */           MainMemory.setI32(paramInt14, 125);
/*      */           
/*      */ 
/*      */           break label2956;
/*      */           
/*      */           label1905:
/*      */           
/*  626 */           if (i5 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  636 */             free.call(i5);
/*      */             
/*      */ 
/*      */             break label2956;
/*      */             
/*      */             label1935:
/*      */             
/*  643 */             ffxmsg.call(5, 88288);
/*  644 */             ffxmsg.call(5, 111456);
/*  645 */             ffxmsg.call(5, paramInt1);
/*  646 */             if (i5 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  656 */               free.call(i5);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  662 */             MainMemory.setI32(paramInt14, 125);
/*      */             
/*      */ 
/*      */             break label2956;
/*      */             
/*      */             for (;;)
/*      */             {
/*      */               label1994:
/*      */               
/*  671 */               if (i11 >= 4) {
/*      */                 break label2451;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  682 */               ffbinr.call(i, paramInt4 + i11 * 71, paramInt5 + (i11 << 3), paramInt6 + (i11 << 3), paramInt7 + (i11 << 3), paramInt8 + i11 * 71, paramInt9 + i11 * 71, paramInt10 + i11 * 71, MainMemory.getI32(paramInt14));
/*  683 */               if (MainMemory.getI32(paramInt14) <= 0) {
/*      */                 break label2137;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  693 */               ffxmsg.call(5, 120992);
/*  694 */               ffxmsg.call(5, paramInt1);
/*  695 */               if (i5 == 0) {
/*      */                 break label2923;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  705 */               free.call(i5);
/*      */               
/*      */ 
/*      */               break label2956;
/*      */               
/*      */               label2137:
/*      */               
/*  712 */               i6 = MainMemory.getI32(i);
/*  713 */               switch (MainMemory.getI8(i6))
/*      */               {
/*      */               case 0: 
/*      */                 break label2451;
/*      */                 
/*      */                 break;
/*      */               case 59: 
/*      */                 break label2451;
/*      */                 break;
/*      */               case 32: 
/*      */                 break label2251;
/*      */                 break;
/*      */               case 44: 
/*      */                 break;
/*      */               }
/*      */               
/*  729 */               i6 += 1;
/*  730 */               MainMemory.setI32(i, i6);
/*      */               
/*      */               break label2382;
/*      */               
/*      */               for (;;)
/*      */               {
/*      */                 label2251:
/*  737 */                 i9 = i6 + 1;
/*  738 */                 MainMemory.setI32(i, i9);
/*  739 */                 switch (MainMemory.getI8(i9)) {
/*  740 */                 case 32:  i6 = i9; } }
/*      */               break label2364;
/*  742 */               i6 = i9;
/*      */               break label2451;
/*  744 */               break label2364; i6 = i9;
/*      */               break label2451;
/*      */               break label2364;
/*      */               break label2364;
/*  748 */               i6 = i9;
/*      */               
/*      */ 
/*      */               break label2382;
/*      */               
/*      */ 
/*      */               label2364:
/*      */               
/*  756 */               i6 += 2;
/*  757 */               MainMemory.setI32(i, i6);
/*      */               
/*      */ 
/*      */ 
/*      */               label2382:
/*      */               
/*      */ 
/*      */ 
/*  765 */               i11 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  772 */             ffxmsg.call(5, 129184);
/*  773 */             ffxmsg.call(5, paramInt1);
/*  774 */             if (i5 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  784 */               free.call(i5);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  790 */             MainMemory.setI32(paramInt14, 125);
/*      */             
/*      */ 
/*      */             break label2956;
/*      */             
/*      */ 
/*      */             label2451:
/*      */             
/*  798 */             if (i11 != 4) {
/*      */               break label2504;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  808 */             ffxmsg.call(5, 88288);
/*  809 */             ffxmsg.call(5, 106592);
/*  810 */             ffxmsg.call(5, paramInt1);
/*  811 */             MainMemory.setI32(paramInt14, 125);
/*      */             
/*      */ 
/*      */             break label2956;
/*      */             
/*      */             label2504:
/*      */             
/*  818 */             i11 += 1;
/*  819 */             MainMemory.setI32(paramInt3, i11);
/*  820 */             if (i11 != 1) {
/*      */               break label2629;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  831 */             if (MainMemory.getI8(paramInt4) != 0) {
/*      */               break label2629;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  842 */             if (!MathUtils.f_oeq(MainMemory.getF64(paramInt5), -9.1191291391491E-36D)) {
/*      */               break label2629;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  853 */             if (!MathUtils.f_oeq(MainMemory.getF64(paramInt6), -9.1191291391491E-36D)) {
/*      */               break label2629;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */             MainMemory.setI32(paramInt3, 2);
/*  865 */             MainMemory.setF64(n, MainMemory.getF64(paramInt7));
/*      */             
/*      */ 
/*      */ 
/*      */             label2629:
/*      */             
/*      */ 
/*      */ 
/*  873 */             if (MainMemory.getI8(i6) != 59) {
/*      */               break label2784;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             do
/*      */             {
/*  885 */               i6 += 1;
/*  886 */               MainMemory.setI32(i, i6);
/*  887 */             } while (MainMemory.getI8(i6) == 32);
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
/*  898 */             ffbinr.call(i, paramInt12, m, m, paramInt11, j, j, j, MainMemory.getI32(paramInt14));
/*  899 */             if (MainMemory.getI32(paramInt14) <= 0) {
/*      */               break label2771;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  909 */             ffxmsg.call(5, 102112);
/*  910 */             ffxmsg.call(5, paramInt1);
/*  911 */             if (i5 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  921 */               free.call(i5);
/*      */               
/*      */ 
/*      */               break label2956;
/*      */               
/*      */               label2771:
/*      */               
/*  928 */               ffbins_531.call(i4, paramInt11, paramInt2);
/*      */               
/*      */ 
/*      */               label2784:
/*      */               
/*      */ 
/*  934 */               paramInt12 = MainMemory.getI32(i);
/*  935 */               i10 = MainMemory.getI8(paramInt12);
/*  936 */               if (i10 != 32) {
/*      */                 break label2855;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               do
/*      */               {
/*  949 */                 paramInt12 += 1;
/*  950 */                 MainMemory.setI32(i, paramInt12);
/*  951 */                 i10 = MainMemory.getI8(paramInt12);
/*  952 */               } while (i10 == 32);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               label2855:
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  965 */               if (i10 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  975 */                 ffxmsg.call(5, 127392);
/*  976 */                 ffxmsg.call(5, paramInt1);
/*  977 */                 MainMemory.setI32(paramInt14, 125);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  983 */               if (i5 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  993 */                 free.call(i5);
/*      */                 
/*      */                 break label2956;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */       label2923:
/*      */       
/*      */       break label2956;
/*      */       
/* 1006 */       ffxmsg.call(5, 84704);
/* 1007 */       ffxmsg.call(5, paramInt1);
/* 1008 */       MainMemory.setI32(paramInt14, 125);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label2956:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1019 */       MainMemory.dealloc_generated(i14);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffbins.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */