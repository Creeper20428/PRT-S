/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ 
/*      */ public final class deflate
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3693;
/*   16 */   public static final Function _instance = new deflate();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public deflate() { super("deflate", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   23 */     return call(paramInt);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   29 */     paramInt4 += 2;
/*   30 */     paramInt3--;
/*   31 */     int j = call(i);
/*   32 */     paramFrame.setI32(paramInt1, j);
/*   33 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt)
/*      */   {
/*   38 */     int i = 0;
/*      */     
/*   40 */     int j = 0;
/*   41 */     int k = 0;
/*   42 */     int m = 0;
/*   43 */     int n = 0;
/*   44 */     int i1 = 0;
/*   45 */     int i2 = 0;
/*   46 */     int i3 = 0;
/*   47 */     int i4 = 0;
/*   48 */     int i5 = 0;
/*   49 */     int i6 = 0;
/*   50 */     int i7 = 0;
/*   51 */     int i8 = 0;
/*   52 */     int i9 = 0;
/*   53 */     int i10 = 0;
/*   54 */     int i11 = 0;
/*   55 */     int i12 = 0;
/*   56 */     int i13 = 0;
/*   57 */     int i14 = 0;
/*   58 */     int i15 = 0;
/*   59 */     int i16 = 0;
/*   60 */     int i17 = 0;
/*   61 */     int i18 = 0;
/*   62 */     int i19 = 0;
/*   63 */     int i20 = 0;
/*   64 */     int i21 = 0;
/*   65 */     int i22 = 0;
/*   66 */     int i25 = 0;
/*   67 */     int i26 = 0;
/*   68 */     int i27 = 0;
/*   69 */     int i28 = 0;
/*   70 */     int i29 = 0;
/*   71 */     int i30 = 0;
/*   72 */     int i31 = 0;
/*   73 */     int i32 = 0;
/*   74 */     int i33 = 0;
/*   75 */     int i34 = 0;
/*   76 */     int i35 = 0;
/*   77 */     int i36 = 0;
/*   78 */     int i37 = 0;
/*   79 */     int i38 = 0;
/*   80 */     int i39 = 0;
/*   81 */     int i40 = 0;
/*   82 */     int i41 = 0;
/*   83 */     int i42 = 0;
/*   84 */     int i43 = 0;
/*   85 */     int i44 = 0;
/*   86 */     int i45 = 0;
/*   87 */     int i46 = 0;
/*   88 */     int i47 = 0;
/*   89 */     int i48 = 0;
/*   90 */     int i49 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   96 */       if (paramInt == 0) {
/*   97 */         i20 = -2;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  107 */         j = paramInt + 28;
/*  108 */         k = MainMemory.getI32(j);
/*  109 */         if (k == 0) {
/*  110 */           i20 = -2;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  120 */           m = paramInt + 12;
/*  121 */           if (MainMemory.getI32(m) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  131 */             if (MainMemory.getI32(paramInt) != 0) {
/*      */               break label284;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  141 */             if (MainMemory.getI32(paramInt + 4) == 0) {}
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  151 */             MainMemory.setI32(paramInt + 24, 52640);
/*  152 */             i = -2;
/*      */             
/*      */             break label7336;
/*      */           }
/*      */           
/*      */           label284:
/*      */           
/*  159 */           n = k + 4;
/*  160 */           i20 = MainMemory.getI32(n);
/*  161 */           i1 = paramInt + 16;
/*  162 */           if (MainMemory.getI32(i1) != 0) {
/*      */             break label345;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  172 */           MainMemory.setI32(paramInt + 24, 52672);
/*  173 */           i = -5;
/*      */           
/*      */ 
/*      */           break label7336;
/*      */           
/*      */           label345:
/*      */           
/*  180 */           MainMemory.setI32(k, paramInt);
/*  181 */           i2 = k + 40;
/*  182 */           MainMemory.setI32(i2, 4);
/*  183 */           if (i20 != 42) {
/*      */             break label1853;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  194 */           if (MainMemory.getI32(k + 24) != 2) {
/*      */             break label1413;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  204 */           i10 = paramInt + 48;
/*  205 */           MainMemory.setI32(i10, crc32.call(0, 0, 0));
/*  206 */           i11 = k + 8;
/*  207 */           i5 = k + 20;
/*  208 */           i20 = MainMemory.getI32(i5);
/*  209 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)31);
/*  210 */           i19 = i20 + 1;
/*  211 */           MainMemory.setI32(i5, i19);
/*  212 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)-117);
/*  213 */           i19 = i20 + 2;
/*  214 */           MainMemory.setI32(i5, i19);
/*  215 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)8);
/*  216 */           i19 = i20 + 3;
/*  217 */           MainMemory.setI32(i5, i19);
/*  218 */           i3 = k + 28;
/*  219 */           i4 = MainMemory.getI32(i3);
/*  220 */           i21 = MainMemory.getI32(i11);
/*  221 */           if (i4 != 0) {
/*      */             break label822;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  231 */           MainMemory.setI8(i21 + i19, (byte)0);
/*  232 */           i19 = i20 + 4;
/*  233 */           MainMemory.setI32(i5, i19);
/*  234 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)0);
/*  235 */           i19 = i20 + 5;
/*  236 */           MainMemory.setI32(i5, i19);
/*  237 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)0);
/*  238 */           i19 = i20 + 6;
/*  239 */           MainMemory.setI32(i5, i19);
/*  240 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)0);
/*  241 */           i19 = i20 + 7;
/*  242 */           MainMemory.setI32(i5, i19);
/*  243 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)0);
/*  244 */           i19 = i20 + 8;
/*  245 */           MainMemory.setI32(i5, i19);
/*  246 */           i21 = MainMemory.getI32(i11);
/*  247 */           i25 = MainMemory.getI32(k + 132);
/*  248 */           if (i25 == 9) {
/*  249 */             i22 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*  259 */           else if ((MainMemory.getI32(k + 136) > 1) || (i25 < 2)) {
/*  260 */             i22 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  270 */             i22 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  277 */           MainMemory.setI8(i21 + i19, i22);
/*  278 */           i19 = i20 + 9;
/*  279 */           MainMemory.setI32(i5, i19);
/*  280 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)3);
/*  281 */           MainMemory.setI32(i5, i20 + 10);
/*  282 */           MainMemory.setI32(n, 113);
/*      */           
/*      */           break label3607;
/*      */           
/*      */           label822:
/*  287 */           MainMemory.setI8(i21 + i19, MathUtils.or(MathUtils.or(MathUtils.or(MathUtils.or((byte)(MainMemory.getI32(i4 + 44) == 0 ? 0 : 2), (byte)(MainMemory.getI32(i4) != 0 ? 1 : 0)), (byte)(MainMemory.getI32(i4 + 16) == 0 ? 0 : 4)), (byte)(MainMemory.getI32(i4 + 28) == 0 ? 0 : 8)), (byte)(MainMemory.getI32(i4 + 36) == 0 ? 0 : 16)));
/*  288 */           i19 = i20 + 4;
/*  289 */           MainMemory.setI32(i5, i19);
/*  290 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)MainMemory.getI32(MainMemory.getI32(i3) + 4));
/*  291 */           i19 = i20 + 5;
/*  292 */           MainMemory.setI32(i5, i19);
/*  293 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(MainMemory.getI32(i3) + 4) >>> 8));
/*  294 */           i19 = i20 + 6;
/*  295 */           MainMemory.setI32(i5, i19);
/*  296 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(MainMemory.getI32(i3) + 4) >>> 16));
/*  297 */           i19 = i20 + 7;
/*  298 */           MainMemory.setI32(i5, i19);
/*  299 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(MainMemory.getI32(i3) + 4) >>> 24));
/*  300 */           i19 = i20 + 8;
/*  301 */           MainMemory.setI32(i5, i19);
/*  302 */           i21 = MainMemory.getI32(i11);
/*  303 */           i25 = MainMemory.getI32(k + 132);
/*  304 */           if (i25 == 9) {
/*  305 */             i22 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*  315 */           else if ((MainMemory.getI32(k + 136) > 1) || (i25 < 2)) {
/*  316 */             i22 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  326 */             i22 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  333 */           MainMemory.setI8(i21 + i19, i22);
/*  334 */           i19 = i20 + 9;
/*  335 */           MainMemory.setI32(i5, i19);
/*  336 */           MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)MainMemory.getI32(MainMemory.getI32(i3) + 12));
/*  337 */           i19 = i20 + 10;
/*  338 */           MainMemory.setI32(i5, i19);
/*  339 */           i4 = MainMemory.getI32(i3);
/*  340 */           if (MainMemory.getI32(i4 + 16) == 0) {
/*  341 */             i20 = i19;
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
/*  352 */             MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)MainMemory.getI32(i4 + 20));
/*  353 */             i19 = i20 + 11;
/*  354 */             MainMemory.setI32(i5, i19);
/*  355 */             MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(MainMemory.getI32(i3) + 20) >>> 8));
/*  356 */             i20 += 12;
/*  357 */             MainMemory.setI32(i5, i20);
/*  358 */             i4 = MainMemory.getI32(i3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  368 */           if (MainMemory.getI32(i4 + 44) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  378 */             MainMemory.setI32(i10, crc32.call(MainMemory.getI32(i10), MainMemory.getI32(i11), i20));
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  384 */           MainMemory.setI32(k + 32, 0);
/*  385 */           MainMemory.setI32(n, 69);
/*      */           
/*      */           break label1873;
/*      */           
/*      */           label1413:
/*  390 */           i20 = (MainMemory.getI32(k + 48) << 12) + 34816;
/*  391 */           if (MainMemory.getI32(k + 136) > 1) {
/*  392 */             i19 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  402 */             i19 = MainMemory.getI32(k + 132);
/*  403 */             if (i19 < 2) {
/*  404 */               i19 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*  414 */             else if (i19 < 6) {
/*  415 */               i19 = 64;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*  425 */             else if (i19 == 6) {
/*  426 */               i19 = 128;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  436 */               i19 = 192;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  443 */           i20 = i19 | i20;
/*  444 */           i10 = k + 108;
/*  445 */           i20 = MainMemory.getI32(i10) == 0 ? i20 : i20 | 0x20;
/*  446 */           i19 = i20 - MathUtils.urem(i20, 31) + 31;
/*  447 */           MainMemory.setI32(n, 113);
/*  448 */           i11 = k + 8;
/*  449 */           i5 = k + 20;
/*  450 */           i20 = MainMemory.getI32(i5);
/*  451 */           MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i19 >>> 8));
/*  452 */           i25 = i20 + 1;
/*  453 */           MainMemory.setI32(i5, i25);
/*  454 */           MainMemory.setI8(MainMemory.getI32(i11) + i25, (byte)i19);
/*  455 */           i19 = i20 + 2;
/*  456 */           MainMemory.setI32(i5, i19);
/*  457 */           if (MainMemory.getI32(i10) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  467 */             i10 = paramInt + 48;
/*  468 */             i27 = MainMemory.getI32(i10);
/*  469 */             i25 = i27 >>> 16;
/*  470 */             MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(i27 >>> 24));
/*  471 */             i19 = i20 + 3;
/*  472 */             MainMemory.setI32(i5, i19);
/*  473 */             MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)i25);
/*  474 */             i19 = i20 + 4;
/*  475 */             MainMemory.setI32(i5, i19);
/*  476 */             i25 = MainMemory.getI32(i10);
/*  477 */             MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(i25 >>> 8));
/*  478 */             i19 = i20 + 5;
/*  479 */             MainMemory.setI32(i5, i19);
/*  480 */             MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)i25);
/*  481 */             MainMemory.setI32(i5, i20 + 6);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  487 */           MainMemory.setI32(paramInt + 48, adler32.call(0, 0, 0));
/*  488 */           i20 = MainMemory.getI32(n);
/*      */           
/*      */ 
/*      */ 
/*      */           label1853:
/*      */           
/*      */ 
/*      */ 
/*  496 */           if (i20 != 69) {
/*      */             break label2443;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1873:
/*      */           
/*      */ 
/*      */ 
/*  507 */           i3 = k + 28;
/*  508 */           i4 = MainMemory.getI32(i3);
/*  509 */           if (MainMemory.getI32(i4 + 16) != 0) {
/*      */             break label1927;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  519 */           MainMemory.setI32(n, 73);
/*      */           
/*      */           break label2477;
/*      */           
/*      */           label1927:
/*      */           
/*  525 */           i10 = k + 20;
/*  526 */           i19 = MainMemory.getI32(i10);
/*  527 */           i5 = k + 32;
/*  528 */           i16 = k + 12;
/*  529 */           i8 = paramInt + 20;
/*  530 */           i11 = k + 8;
/*  531 */           i9 = paramInt + 48;
/*  532 */           i25 = MainMemory.getI32(i5);
/*  533 */           i20 = i19;
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
/*  546 */             if (!MathUtils.ult(i25, MainMemory.getI32(i4 + 20) & 0xFFFF)) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  556 */             if (i20 != MainMemory.getI32(i16)) {
/*      */               break label2236;
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
/*  570 */             if ((MainMemory.getI32(i4 + 44) == 0) || (!MathUtils.ugt(i20, i19))) {
/*      */               break label2106;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  580 */             MainMemory.setI32(i9, crc32.call(MainMemory.getI32(i9), MainMemory.getI32(i11) + i19, i20 - i19));
/*      */             
/*      */ 
/*      */             label2106:
/*      */             
/*      */ 
/*  586 */             i48 = MainMemory.getI32(j);
/*  587 */             i20 = MainMemory.getI32(i48 + 20);
/*  588 */             i19 = MainMemory.getI32(i1);
/*  589 */             i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/*  590 */             if (i20 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  600 */               deflate_524.call(i1, i8, m, i20, j, i48);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  606 */             i19 = MainMemory.getI32(i10);
/*  607 */             i4 = MainMemory.getI32(i3);
/*  608 */             if (i19 == MainMemory.getI32(i16)) {
/*      */               break label2379;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  619 */             i20 = MainMemory.getI32(i5);
/*  620 */             i25 = i20;
/*      */             
/*  622 */             i20 = i19;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label2236:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  633 */             MainMemory.setI8(MainMemory.getI32(i11) + i20, MainMemory.getI8(MainMemory.getI32(i4 + 16) + i25));
/*  634 */             i20 += 1;
/*  635 */             MainMemory.setI32(i10, i20);
/*  636 */             i25 = MainMemory.getI32(i5) + 1;
/*  637 */             MainMemory.setI32(i5, i25);
/*  638 */             i4 = MainMemory.getI32(i3);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  647 */           if ((MainMemory.getI32(i4 + 44) == 0) || (!MathUtils.ugt(i20, i19))) {
/*      */             break label2379;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  658 */           MainMemory.setI32(i9, crc32.call(MainMemory.getI32(i9), MainMemory.getI32(i11) + i19, i20 - i19));
/*  659 */           i4 = MainMemory.getI32(i3);
/*      */           
/*      */ 
/*      */ 
/*      */           label2379:
/*      */           
/*      */ 
/*      */ 
/*  667 */           if (MainMemory.getI32(i5) != MainMemory.getI32(i4 + 20)) {
/*      */             break label2431;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  677 */           MainMemory.setI32(i5, 0);
/*  678 */           MainMemory.setI32(n, 73);
/*      */           
/*      */           break label2477;
/*      */           
/*      */           label2431:
/*      */           
/*  684 */           i20 = MainMemory.getI32(n);
/*      */           
/*      */ 
/*      */ 
/*      */           label2443:
/*      */           
/*      */ 
/*      */ 
/*  692 */           if (i20 != 73) {
/*      */             break label2964;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  703 */           i4 = MainMemory.getI32(k + 28);
/*      */           
/*      */ 
/*      */ 
/*      */           label2477:
/*      */           
/*      */ 
/*      */ 
/*  711 */           i3 = k + 28;
/*  712 */           if (MainMemory.getI32(i4 + 28) != 0) {
/*      */             break label2524;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  722 */           MainMemory.setI32(n, 91);
/*      */           
/*      */           break label2984;
/*      */           
/*      */           label2524:
/*  727 */           i5 = k + 20;
/*  728 */           i19 = MainMemory.getI32(i5);
/*  729 */           i10 = k + 12;
/*  730 */           i16 = paramInt + 20;
/*  731 */           i11 = k + 8;
/*  732 */           i8 = paramInt + 48;
/*  733 */           i9 = k + 32;
/*  734 */           i20 = i19;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  743 */             if (i20 != MainMemory.getI32(i10)) {
/*      */               break label2794;
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
/*  755 */             if ((MainMemory.getI32(MainMemory.getI32(i3) + 44) == 0) || (!MathUtils.ugt(i20, i19))) {
/*      */               break label2667;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  765 */             MainMemory.setI32(i8, crc32.call(MainMemory.getI32(i8), MainMemory.getI32(i11) + i19, i20 - i19));
/*      */             
/*      */ 
/*      */             label2667:
/*      */             
/*      */ 
/*  771 */             i48 = MainMemory.getI32(j);
/*  772 */             i20 = MainMemory.getI32(i48 + 20);
/*  773 */             i19 = MainMemory.getI32(i1);
/*  774 */             i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/*  775 */             if (i20 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  785 */               deflate_520.call(i1, i20, i16, i48, m, j);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  791 */             i19 = MainMemory.getI32(i5);
/*  792 */             if (i19 != MainMemory.getI32(i10))
/*      */             {
/*      */ 
/*      */ 
/*  796 */               i20 = i19;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*  804 */               i20 = MainMemory.getI32(n);
/*      */               
/*      */ 
/*      */               break label2964;
/*      */             }
/*      */             
/*      */             label2794:
/*      */             
/*  812 */             i25 = MainMemory.getI32(i9);
/*  813 */             i22 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(i3) + 28) + i25);
/*  814 */             MainMemory.setI32(i9, i25 + 1);
/*  815 */             MainMemory.setI8(MainMemory.getI32(i11) + i20, i22);
/*  816 */             i20 += 1;
/*  817 */             MainMemory.setI32(i5, i20);
/*  818 */             if (i22 == 0) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  830 */           if ((MainMemory.getI32(MainMemory.getI32(i3) + 44) == 0) || (!MathUtils.ugt(i20, i19))) {
/*      */             break label2941;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  840 */           MainMemory.setI32(i8, crc32.call(MainMemory.getI32(i8), MainMemory.getI32(i11) + i19, i20 - i19));
/*      */           
/*      */ 
/*      */           label2941:
/*      */           
/*      */ 
/*  846 */           MainMemory.setI32(i9, 0);
/*  847 */           MainMemory.setI32(n, 91);
/*      */           
/*      */           break label2984;
/*      */           
/*      */           label2964:
/*      */           
/*  853 */           if (i20 != 91) {
/*      */             break label3468;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label2984:
/*      */           
/*      */ 
/*      */ 
/*  864 */           i3 = k + 28;
/*  865 */           if (MainMemory.getI32(MainMemory.getI32(i3) + 36) != 0) {
/*      */             break label3034;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  875 */           MainMemory.setI32(n, 103);
/*      */           
/*      */           break label3488;
/*      */           
/*      */           label3034:
/*  880 */           i5 = k + 20;
/*  881 */           i19 = MainMemory.getI32(i5);
/*  882 */           i10 = k + 12;
/*  883 */           i16 = paramInt + 20;
/*  884 */           i11 = k + 8;
/*  885 */           i8 = paramInt + 48;
/*  886 */           i9 = k + 32;
/*  887 */           i20 = i19;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  896 */             if (i20 != MainMemory.getI32(i10)) {
/*      */               break label3304;
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
/*  908 */             if ((MainMemory.getI32(MainMemory.getI32(i3) + 44) == 0) || (!MathUtils.ugt(i20, i19))) {
/*      */               break label3177;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  918 */             MainMemory.setI32(i8, crc32.call(MainMemory.getI32(i8), MainMemory.getI32(i11) + i19, i20 - i19));
/*      */             
/*      */ 
/*      */             label3177:
/*      */             
/*      */ 
/*  924 */             i48 = MainMemory.getI32(j);
/*  925 */             i20 = MainMemory.getI32(i48 + 20);
/*  926 */             i19 = MainMemory.getI32(i1);
/*  927 */             i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/*  928 */             if (i20 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  938 */               deflate_517.call(i20, i1, i48, m, i16, j);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  944 */             i19 = MainMemory.getI32(i5);
/*  945 */             if (i19 != MainMemory.getI32(i10))
/*      */             {
/*      */ 
/*      */ 
/*  949 */               i20 = i19;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*  957 */               i20 = MainMemory.getI32(n);
/*      */               
/*      */ 
/*      */               break label3468;
/*      */             }
/*      */             
/*      */             label3304:
/*      */             
/*  965 */             i25 = MainMemory.getI32(i9);
/*  966 */             i22 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(i3) + 36) + i25);
/*  967 */             MainMemory.setI32(i9, i25 + 1);
/*  968 */             MainMemory.setI8(MainMemory.getI32(i11) + i20, i22);
/*  969 */             i20 += 1;
/*  970 */             MainMemory.setI32(i5, i20);
/*  971 */             if (i22 == 0) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  983 */           if ((MainMemory.getI32(MainMemory.getI32(i3) + 44) == 0) || (!MathUtils.ugt(i20, i19))) {
/*      */             break label3451;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  993 */           MainMemory.setI32(i8, crc32.call(MainMemory.getI32(i8), MainMemory.getI32(i11) + i19, i20 - i19));
/*      */           
/*      */ 
/*      */           label3451:
/*      */           
/*      */ 
/*  999 */           MainMemory.setI32(n, 103);
/*      */           
/*      */           break label3488;
/*      */           
/*      */           label3468:
/*      */           
/* 1005 */           if (i20 != 103) {
/*      */             break label3607;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3488:
/*      */           
/*      */ 
/*      */ 
/* 1015 */           if (MainMemory.getI32(MainMemory.getI32(k + 28) + 44) != 0) {
/*      */             break label3534;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1025 */           MainMemory.setI32(n, 113);
/*      */           
/*      */           break label3607;
/*      */           
/*      */           label3534:
/* 1030 */           i5 = k + 20;
/* 1031 */           i10 = k + 12;
/* 1032 */           if (!MathUtils.ugt(MainMemory.getI32(i5) + 2, MainMemory.getI32(i10))) {
/*      */             break label3591;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1042 */           deflate_515.call(i1, m, j, paramInt);
/*      */           
/*      */ 
/*      */           label3591:
/*      */           
/*      */ 
/* 1048 */           deflate_523.call(k, n, i5, i10, paramInt);
/*      */           
/*      */ 
/*      */           label3607:
/*      */           
/*      */ 
/* 1054 */           i5 = k + 20;
/* 1055 */           if (MainMemory.getI32(i5) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1065 */             i48 = MainMemory.getI32(j);
/* 1066 */             i20 = MainMemory.getI32(i48 + 20);
/* 1067 */             i19 = MainMemory.getI32(i1);
/* 1068 */             i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/* 1069 */             if (i20 == 0) {
/* 1070 */               i20 = i19;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1080 */               SystemLibrary.memcpy(MainMemory.getI32(m), MainMemory.getI32(i48 + 16), i20, 1);
/* 1081 */               MainMemory.setI32(m, MainMemory.getI32(m) + i20);
/* 1082 */               i11 = MainMemory.getI32(j) + 16;
/* 1083 */               MainMemory.setI32(i11, MainMemory.getI32(i11) + i20);
/* 1084 */               i10 = paramInt + 20;
/* 1085 */               MainMemory.setI32(i10, MainMemory.getI32(i10) + i20);
/* 1086 */               MainMemory.setI32(i1, MainMemory.getI32(i1) - i20);
/* 1087 */               i10 = MainMemory.getI32(j) + 20;
/* 1088 */               MainMemory.setI32(i10, MainMemory.getI32(i10) - i20);
/* 1089 */               i48 = MainMemory.getI32(j);
/* 1090 */               if (MainMemory.getI32(i48 + 20) != 0) {
/*      */                 break label3851;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1100 */               MainMemory.setI32(i48 + 16, MainMemory.getI32(i48 + 8));
/*      */               
/*      */ 
/*      */               label3851:
/*      */               
/*      */ 
/* 1106 */               i20 = MainMemory.getI32(i1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1114 */             if (i20 != 0) {
/*      */               break label3899;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1124 */             MainMemory.setI32(i2, -1);
/* 1125 */             i = 0;
/*      */             
/*      */             break label7336;
/*      */           }
/*      */           
/*      */           label3899:
/*      */           
/* 1132 */           i7 = MainMemory.getI32(n) == 666 ? 1 : 0;
/* 1133 */           i6 = MainMemory.getI32(paramInt + 4) == 0 ? 1 : 0;
/* 1134 */           if ((i6 == 0) && (i7 != 0)) {
/*      */             break label7319;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1144 */           if (i6 == 0) {
/*      */             break label4002;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1154 */           if ((MainMemory.getI32(k + 116) == 0) && (i7 != 0)) {
/*      */             break label6669;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label4002:
/*      */           
/*      */ 
/*      */ 
/* 1164 */           switch (MainMemory.getI32(k + 136))
/*      */           {
/*      */           case 2: 
/*      */             break label5536;
/*      */             
/*      */             break;
/*      */           case 3: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/* 1175 */           i8 = k + 116;
/* 1176 */           i9 = k + 96;
/* 1177 */           i10 = k + 108;
/* 1178 */           i11 = k + 56;
/* 1179 */           i12 = k + 5796;
/* 1180 */           i13 = k + 5792;
/* 1181 */           i14 = k + 5784;
/* 1182 */           i15 = k + 5788;
/* 1183 */           i16 = k + 92;
/* 1184 */           i17 = k;
/* 1185 */           i18 = k + 2440;
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1191 */             i20 = MainMemory.getI32(i8);
/* 1192 */             if (!MathUtils.ult(i20, 258))
/*      */             {
/*      */ 
/*      */ 
/* 1196 */               i19 = i20;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1203 */               F431145.call(k);
/* 1204 */               i20 = MainMemory.getI32(i8);
/* 1205 */               if (i20 != 0)
/*      */               {
/*      */ 
/*      */ 
/* 1209 */                 i19 = i20;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1216 */                 i19 = MainMemory.getI32(i16);
/* 1217 */                 i20 = MainMemory.getI32(i10) - i19;
/* 1218 */                 if (i19 <= -1)
/*      */                 {
/*      */ 
/*      */ 
/* 1222 */                   i21 = 0;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/* 1229 */                   i21 = MainMemory.getI32(i11) + i19;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1237 */                 _tr_flush_block.call(i17, i21, i20, 1);
/* 1238 */                 MainMemory.setI32(i16, MainMemory.getI32(i10));
/* 1239 */                 i46 = MainMemory.getI32(k);
/* 1240 */                 i47 = i46 + 28;
/* 1241 */                 i48 = MainMemory.getI32(i47);
/* 1242 */                 i20 = MainMemory.getI32(i48 + 20);
/* 1243 */                 i10 = i46 + 16;
/* 1244 */                 i19 = MainMemory.getI32(i10);
/* 1245 */                 i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/* 1246 */                 if (i20 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1256 */                   deflate_522.call(i10, i46, i47, i48, i20);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1262 */                 if (MainMemory.getI32(MainMemory.getI32(k) + 16) == 0) {
/* 1263 */                   i20 = 2;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   break label6255;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/* 1273 */                 i20 = 3;
/*      */                 
/*      */                 break label6255;
/*      */               }
/*      */             }
/*      */             
/* 1279 */             MainMemory.setI32(i9, 0);
/* 1280 */             i20 = MainMemory.getI32(i10);
/* 1281 */             i21 = MainMemory.getI32(i11);
/* 1282 */             if ((MathUtils.ult(i19, 3)) || (i20 != 0))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1292 */               i22 = MainMemory.getI8(i21 + (i20 + -1));
/* 1293 */               if (MainMemory.getI8(i21 + i20) != i22) {
/*      */                 break label5180;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1303 */               if (MainMemory.getI8(i21 + (i20 + 1)) != i22) {
/*      */                 break label5180;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1313 */               if (MainMemory.getI8(i21 + (i20 + 2)) != i22) {
/*      */                 break label5180;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1323 */               i25 = i20 + 258;
/* 1324 */               i26 = i21 + i25;
/* 1325 */               i27 = i20 + 8;
/* 1326 */               i28 = i20 + 7;
/* 1327 */               i29 = i20 + 6;
/* 1328 */               i30 = i20 + 5;
/* 1329 */               i31 = i20 + 4;
/* 1330 */               i32 = i20 + 3;
/* 1331 */               i33 = i20 + 9;
/* 1332 */               i34 = i20 + 10;
/* 1333 */               i35 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1340 */                 i43 = i35 << 3;
/* 1341 */                 i36 = i21 + (i32 + i43);
/* 1342 */                 i37 = i21 + (i31 + i43);
/* 1343 */                 i38 = i21 + (i30 + i43);
/* 1344 */                 i39 = i21 + (i29 + i43);
/* 1345 */                 i40 = i21 + (i28 + i43);
/* 1346 */                 i41 = i21 + (i27 + i43);
/* 1347 */                 i42 = i21 + (i33 + i43);
/* 1348 */                 i43 = i34 + i43;
/* 1349 */                 i44 = i21 + i43;
/* 1350 */                 if (MainMemory.getI8(i36) != i22) {
/*      */                   break label4935;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1361 */                 if (MainMemory.getI8(i37) != i22)
/*      */                 {
/*      */ 
/*      */ 
/* 1365 */                   i36 = i37;
/*      */                   
/*      */ 
/*      */                   break label4935;
/*      */                 }
/*      */                 
/*      */ 
/* 1372 */                 if (MainMemory.getI8(i38) != i22)
/*      */                 {
/*      */ 
/*      */ 
/* 1376 */                   i36 = i38;
/*      */                   
/*      */ 
/*      */                   break label4935;
/*      */                 }
/*      */                 
/*      */ 
/* 1383 */                 if (MainMemory.getI8(i39) != i22)
/*      */                 {
/*      */ 
/*      */ 
/* 1387 */                   i36 = i39;
/*      */                   
/*      */ 
/*      */                   break label4935;
/*      */                 }
/*      */                 
/*      */ 
/* 1394 */                 if (MainMemory.getI8(i40) != i22)
/*      */                 {
/*      */ 
/*      */ 
/* 1398 */                   i36 = i40;
/*      */                   
/*      */ 
/*      */                   break label4935;
/*      */                 }
/*      */                 
/*      */ 
/* 1405 */                 if (MainMemory.getI8(i41) != i22)
/*      */                 {
/*      */ 
/*      */ 
/* 1409 */                   i36 = i41;
/*      */                   
/*      */ 
/*      */                   break label4935;
/*      */                 }
/*      */                 
/*      */ 
/* 1416 */                 if (MainMemory.getI8(i42) != i22)
/*      */                 {
/*      */ 
/*      */ 
/* 1420 */                   i36 = i42;
/*      */                   
/*      */ 
/*      */                   break label4935;
/*      */                 }
/*      */                 
/*      */ 
/* 1427 */                 i35 += 1;
/* 1428 */                 if ((MainMemory.getI8(i44) != i22) || (i43 >= i25))
/*      */                   break;
/*      */               }
/*      */               break label4935;
/* 1432 */               i36 = i44;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label4935:
/*      */               
/*      */ 
/*      */ 
/* 1441 */               i25 = i36 - i26 + 258;
/* 1442 */               i19 = MathUtils.ugt(i25, i19) ? i19 : i25;
/* 1443 */               MainMemory.setI32(i9, i19);
/* 1444 */               if (!MathUtils.ugt(i19, 2)) {
/*      */                 break label5180;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1454 */               i22 = (byte)((byte)i19 + -3);
/* 1455 */               MainMemory.setI16(MainMemory.getI32(i12) + (MainMemory.getI32(i13) << 1), (short)1);
/* 1456 */               i20 = MainMemory.getI32(i13);
/* 1457 */               MainMemory.setI8(MainMemory.getI32(i14) + i20, i22);
/* 1458 */               MainMemory.setI32(i13, i20 + 1);
/* 1459 */               i45 = k + 148 + ((MainMemory.getI8(148416 + (i22 & 0xFF)) & 0xFF) + 257 << 2);
/* 1460 */               MainMemory.setI16(i45, (short)(MainMemory.getI16(i45) + 1));
/* 1461 */               MainMemory.setI16(i18, (short)(MainMemory.getI16(i18) + 1));
/* 1462 */               i19 = MainMemory.getI32(i13) == MainMemory.getI32(i15) + -1 ? 1 : 0;
/* 1463 */               i20 = MainMemory.getI32(i9);
/* 1464 */               MainMemory.setI32(i8, MainMemory.getI32(i8) - i20);
/* 1465 */               i20 = MainMemory.getI32(i10) + i20;
/* 1466 */               MainMemory.setI32(i10, i20);
/* 1467 */               MainMemory.setI32(i9, 0);
/*      */               
/*      */               break label5320;
/*      */             }
/*      */             
/*      */             label5180:
/*      */             
/* 1474 */             int i23 = MainMemory.getI8(i21 + i20);
/* 1475 */             MainMemory.setI16(MainMemory.getI32(i12) + (MainMemory.getI32(i13) << 1), (short)0);
/* 1476 */             i20 = MainMemory.getI32(i13);
/* 1477 */             MainMemory.setI8(MainMemory.getI32(i14) + i20, i23);
/* 1478 */             MainMemory.setI32(i13, i20 + 1);
/* 1479 */             i45 = k + 148 + ((i23 & 0xFF) << 2);
/* 1480 */             MainMemory.setI16(i45, (short)(MainMemory.getI16(i45) + 1));
/* 1481 */             i19 = MainMemory.getI32(i13) == MainMemory.getI32(i15) + -1 ? 1 : 0;
/* 1482 */             MainMemory.setI32(i8, MainMemory.getI32(i8) + -1);
/* 1483 */             i20 = MainMemory.getI32(i10) + 1;
/* 1484 */             MainMemory.setI32(i10, i20);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label5320:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1494 */             if (i19 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1504 */               i19 = MainMemory.getI32(i16);
/* 1505 */               i20 -= i19;
/* 1506 */               if (i19 <= -1)
/*      */               {
/*      */ 
/*      */ 
/* 1510 */                 i21 = 0;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1517 */                 i21 = MainMemory.getI32(i11) + i19;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1525 */               _tr_flush_block.call(i17, i21, i20, 0);
/* 1526 */               MainMemory.setI32(i16, MainMemory.getI32(i10));
/* 1527 */               i46 = MainMemory.getI32(k);
/* 1528 */               i47 = i46 + 28;
/* 1529 */               i48 = MainMemory.getI32(i47);
/* 1530 */               i20 = MainMemory.getI32(i48 + 20);
/* 1531 */               i49 = i46 + 16;
/* 1532 */               i19 = MainMemory.getI32(i49);
/* 1533 */               i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/* 1534 */               if (i20 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1544 */                 deflate_516.call(i20, i47, i49, i48, i46);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1550 */               if (MainMemory.getI32(MainMemory.getI32(k) + 16) == 0) {
/* 1551 */                 i20 = 0;
/*      */                 
/*      */                 break label6255;
/*      */                 
/*      */                 break;
/*      */               }
/*      */             }
/*      */           }
/*      */           label5536:
/* 1560 */           i8 = k + 116;
/* 1561 */           i9 = k + 96;
/* 1562 */           i11 = k + 56;
/* 1563 */           i10 = k + 108;
/* 1564 */           i12 = k + 5796;
/* 1565 */           i13 = k + 5792;
/* 1566 */           i14 = k + 5784;
/* 1567 */           i15 = k + 5788;
/* 1568 */           i16 = k + 92;
/* 1569 */           i17 = k;
/*      */           
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 1575 */             if (MainMemory.getI32(i8) != 0) {
/*      */               break label5857;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1585 */             F431145.call(k);
/* 1586 */             if (MainMemory.getI32(i8) != 0) {
/*      */               break label5857;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1596 */             i19 = MainMemory.getI32(i16);
/* 1597 */             i20 = MainMemory.getI32(i10) - i19;
/* 1598 */             if (i19 <= -1)
/*      */             {
/*      */ 
/*      */ 
/* 1602 */               i21 = 0;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1609 */               i21 = MainMemory.getI32(i11) + i19;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1617 */             _tr_flush_block.call(i17, i21, i20, 1);
/* 1618 */             MainMemory.setI32(i16, MainMemory.getI32(i10));
/* 1619 */             i46 = MainMemory.getI32(k);
/* 1620 */             i47 = i46 + 28;
/* 1621 */             i48 = MainMemory.getI32(i47);
/* 1622 */             i20 = MainMemory.getI32(i48 + 20);
/* 1623 */             i10 = i46 + 16;
/* 1624 */             i19 = MainMemory.getI32(i10);
/* 1625 */             i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/* 1626 */             if (i20 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1636 */               deflate_518.call(i20, i46, i10, i47, i48);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1642 */             if (MainMemory.getI32(MainMemory.getI32(k) + 16) == 0) {
/* 1643 */               i20 = 2;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               break label6255;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/* 1653 */             i20 = 3;
/*      */             
/*      */             break label6255;
/*      */             
/*      */             label5857:
/* 1658 */             MainMemory.setI32(i9, 0);
/* 1659 */             int i24 = MainMemory.getI8(MainMemory.getI32(i11) + MainMemory.getI32(i10));
/* 1660 */             MainMemory.setI16(MainMemory.getI32(i12) + (MainMemory.getI32(i13) << 1), (short)0);
/* 1661 */             i20 = MainMemory.getI32(i13);
/* 1662 */             MainMemory.setI8(MainMemory.getI32(i14) + i20, i24);
/* 1663 */             MainMemory.setI32(i13, i20 + 1);
/* 1664 */             i18 = k + 148 + ((i24 & 0xFF) << 2);
/* 1665 */             MainMemory.setI16(i18, (short)(MainMemory.getI16(i18) + 1));
/* 1666 */             i7 = MainMemory.getI32(i13) == MainMemory.getI32(i15) + -1 ? 1 : 0;
/* 1667 */             MainMemory.setI32(i8, MainMemory.getI32(i8) + -1);
/* 1668 */             i20 = MainMemory.getI32(i10) + 1;
/* 1669 */             MainMemory.setI32(i10, i20);
/* 1670 */             if (i7 == 0) {}
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1680 */             i19 = MainMemory.getI32(i16);
/* 1681 */             i20 -= i19;
/* 1682 */             if (i19 <= -1)
/*      */             {
/*      */ 
/*      */ 
/* 1686 */               i21 = 0;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1693 */               i21 = MainMemory.getI32(i11) + i19;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1701 */             _tr_flush_block.call(i17, i21, i20, 0);
/* 1702 */             MainMemory.setI32(i16, MainMemory.getI32(i10));
/* 1703 */             i46 = MainMemory.getI32(k);
/* 1704 */             i47 = i46 + 28;
/* 1705 */             i48 = MainMemory.getI32(i47);
/* 1706 */             i20 = MainMemory.getI32(i48 + 20);
/* 1707 */             i49 = i46 + 16;
/* 1708 */             i19 = MainMemory.getI32(i49);
/* 1709 */             i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/* 1710 */             if (i20 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1720 */               deflate_521.call(i20, i47, i46, i49, i48);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 1726 */             if (MainMemory.getI32(MainMemory.getI32(k) + 16) == 0) {
/* 1727 */               i20 = 0;
/*      */               
/*      */ 
/*      */               break label6255;
/*      */               
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/* 1736 */           i20 = SystemLibrary.do_indirect(MainMemory.getI32(146304 + MainMemory.getI32(k + 132) * 12 + 8), k, 4);
/*      */           
/*      */ 
/*      */ 
/*      */           label6255:
/*      */           
/*      */ 
/*      */ 
/* 1744 */           if (!MathUtils.ult(i20 + -2, 2)) {
/*      */             break label6293;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1754 */           MainMemory.setI32(n, 666);
/*      */           
/*      */ 
/*      */           label6293:
/*      */           
/*      */ 
/* 1760 */           switch (i20)
/*      */           {
/*      */           case 0: 
/*      */             break label6627;
/*      */             break;
/*      */           case 2: 
/*      */             break label6627;
/*      */             break;
/*      */           case 1: 
/*      */             break;
/*      */           }
/*      */           
/* 1772 */           _tr_stored_block.call(k, 0, 0, 0);
/* 1773 */           i48 = MainMemory.getI32(j);
/* 1774 */           i20 = MainMemory.getI32(i48 + 20);
/* 1775 */           i19 = MainMemory.getI32(i1);
/* 1776 */           i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/* 1777 */           if (i20 == 0) {
/* 1778 */             i20 = i19;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1788 */             SystemLibrary.memcpy(MainMemory.getI32(m), MainMemory.getI32(i48 + 16), i20, 1);
/* 1789 */             MainMemory.setI32(m, MainMemory.getI32(m) + i20);
/* 1790 */             i11 = MainMemory.getI32(j) + 16;
/* 1791 */             MainMemory.setI32(i11, MainMemory.getI32(i11) + i20);
/* 1792 */             n = paramInt + 20;
/* 1793 */             MainMemory.setI32(n, MainMemory.getI32(n) + i20);
/* 1794 */             MainMemory.setI32(i1, MainMemory.getI32(i1) - i20);
/* 1795 */             n = MainMemory.getI32(j) + 20;
/* 1796 */             MainMemory.setI32(n, MainMemory.getI32(n) - i20);
/* 1797 */             i48 = MainMemory.getI32(j);
/* 1798 */             if (MainMemory.getI32(i48 + 20) != 0) {
/*      */               break label6579;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1808 */             MainMemory.setI32(i48 + 16, MainMemory.getI32(i48 + 8));
/*      */             
/*      */ 
/*      */             label6579:
/*      */             
/*      */ 
/* 1814 */             i20 = MainMemory.getI32(i1);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1822 */           if (i20 != 0) {
/*      */             break label6669;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1832 */           MainMemory.setI32(i2, -1);
/* 1833 */           i = 0;
/*      */           
/*      */ 
/*      */           break label7336;
/*      */           
/*      */           label6627:
/*      */           
/* 1840 */           if (MainMemory.getI32(i1) != 0)
/*      */           {
/*      */ 
/*      */ 
/* 1844 */             i20 = 0;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1851 */             MainMemory.setI32(i2, -1);
/* 1852 */             i = 0;
/*      */             
/*      */ 
/*      */             break label7336;
/*      */             
/*      */             label6669:
/*      */             
/* 1859 */             i2 = k + 24;
/* 1860 */             i20 = MainMemory.getI32(i2);
/* 1861 */             if (i20 < 1) {
/* 1862 */               i20 = 1;
/*      */             } else {
/*      */               break label6717;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1873 */       i = i20;
/*      */       
/*      */ 
/*      */       break label7336;
/*      */       
/*      */       label6717:
/*      */       
/* 1880 */       if (i20 != 2) {
/*      */         break label7025;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1890 */       i11 = k + 8;
/* 1891 */       i20 = MainMemory.getI32(i5);
/* 1892 */       n = paramInt + 48;
/* 1893 */       MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)MainMemory.getI32(n));
/* 1894 */       i19 = i20 + 1;
/* 1895 */       MainMemory.setI32(i5, i19);
/* 1896 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(n) >>> 8));
/* 1897 */       i19 = i20 + 2;
/* 1898 */       MainMemory.setI32(i5, i19);
/* 1899 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(n) >>> 16));
/* 1900 */       i19 = i20 + 3;
/* 1901 */       MainMemory.setI32(i5, i19);
/* 1902 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(n) >>> 24));
/* 1903 */       i19 = i20 + 4;
/* 1904 */       MainMemory.setI32(i5, i19);
/* 1905 */       n = paramInt + 8;
/* 1906 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)MainMemory.getI32(n));
/* 1907 */       i19 = i20 + 5;
/* 1908 */       MainMemory.setI32(i5, i19);
/* 1909 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(n) >>> 8));
/* 1910 */       i19 = i20 + 6;
/* 1911 */       MainMemory.setI32(i5, i19);
/* 1912 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(n) >>> 16));
/* 1913 */       i19 = i20 + 7;
/* 1914 */       MainMemory.setI32(i5, i19);
/* 1915 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(MainMemory.getI32(n) >>> 24));
/* 1916 */       i20 += 8;
/*      */       
/*      */       break label7177;
/*      */       
/*      */       label7025:
/*      */       
/* 1922 */       n = paramInt + 48;
/* 1923 */       i25 = MainMemory.getI32(n);
/* 1924 */       i19 = i25 >>> 16;
/* 1925 */       i11 = k + 8;
/* 1926 */       i20 = MainMemory.getI32(i5);
/* 1927 */       MainMemory.setI8(MainMemory.getI32(i11) + i20, (byte)(i25 >>> 24));
/* 1928 */       i25 = i20 + 1;
/* 1929 */       MainMemory.setI32(i5, i25);
/* 1930 */       MainMemory.setI8(MainMemory.getI32(i11) + i25, (byte)i19);
/* 1931 */       i19 = i20 + 2;
/* 1932 */       MainMemory.setI32(i5, i19);
/* 1933 */       i25 = MainMemory.getI32(n);
/* 1934 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)(i25 >>> 8));
/* 1935 */       i19 = i20 + 3;
/* 1936 */       MainMemory.setI32(i5, i19);
/* 1937 */       MainMemory.setI8(MainMemory.getI32(i11) + i19, (byte)i25);
/* 1938 */       i20 += 4;
/*      */       
/*      */ 
/*      */ 
/*      */       label7177:
/*      */       
/*      */ 
/*      */ 
/* 1946 */       MainMemory.setI32(i5, i20);
/* 1947 */       k = MainMemory.getI32(j);
/* 1948 */       i20 = MainMemory.getI32(k + 20);
/* 1949 */       i19 = MainMemory.getI32(i1);
/* 1950 */       i20 = MathUtils.ult(i19, i20) ? i19 : i20;
/* 1951 */       if (i20 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1961 */         deflate_519.call(i1, k, m, i20, j, paramInt);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1967 */       i20 = MainMemory.getI32(i2);
/* 1968 */       if (i20 <= 0) {
/*      */         break label7295;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1978 */       MainMemory.setI32(i2, 0 - i20);
/*      */       
/*      */ 
/*      */       label7295:
/*      */       
/*      */ 
/* 1984 */       i = MainMemory.getI32(i5) == 0 ? 1 : 0;
/*      */       
/*      */ 
/*      */       break label7336;
/*      */       
/*      */       label7319:
/*      */       
/* 1991 */       MainMemory.setI32(paramInt + 24, 52672);
/* 1992 */       i = -5;
/*      */       
/*      */ 
/*      */       label7336:
/*      */       
/*      */ 
/* 1998 */       int i50 = i; return i50;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */