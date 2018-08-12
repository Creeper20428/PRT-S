/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.c.realloc;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class iraf2mem
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3476;
/*   23 */   public static final Function _instance = new iraf2mem();
/*   24 */   public final Function resolve() { return _instance; }
/*      */   
/*   26 */   public iraf2mem() { super("iraf2mem", 5, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   30 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   36 */     paramInt4 += 2;
/*   37 */     paramInt3--;
/*   38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   39 */     paramInt4 += 2;
/*   40 */     paramInt3--;
/*   41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   42 */     paramInt4 += 2;
/*   43 */     paramInt3--;
/*   44 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   45 */     paramInt4 += 2;
/*   46 */     paramInt3--;
/*   47 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   48 */     paramInt4 += 2;
/*   49 */     paramInt3--;
/*   50 */     int i1 = call(i, j, k, m, n);
/*   51 */     paramFrame.setI32(paramInt1, i1);
/*   52 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/*   57 */     int i = 0;
/*      */     
/*   59 */     int j = 0;
/*   60 */     int k = 0;
/*   61 */     int m = 0;
/*   62 */     int n = 0;
/*   63 */     int i1 = 0;
/*   64 */     int i2 = 0;
/*   65 */     int i3 = 0;
/*   66 */     int i4 = 0;
/*   67 */     int i5 = 0;
/*   68 */     int i6 = 0;
/*   69 */     int i7 = 0;
/*   70 */     int i8 = 0;
/*   71 */     int i9 = 0;
/*   72 */     int i10 = 0;
/*   73 */     int i11 = 0;
/*   74 */     int i12 = 0;
/*   75 */     int i13 = 0;
/*   76 */     int i14 = 0;
/*   77 */     int i15 = 0;
/*   78 */     int i16 = 0;
/*   79 */     int i17 = 0;
/*   80 */     int i18 = 0;
/*   81 */     int i19 = 0;
/*   82 */     int i20 = 0;
/*   83 */     int i21 = 0;
/*   84 */     int i22 = 0;
/*   85 */     int i23 = 0;
/*   86 */     int i24 = 0;
/*   87 */     int i25 = 0;
/*   88 */     double d1 = 0.0D;
/*   89 */     double d2 = 0.0D;
/*   90 */     int i26 = 0;
/*      */     
/*      */ 
/*   93 */     int i27 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   97 */       j = MainMemory.alloc(256);
/*   98 */       k = MainMemory.alloc(70);
/*   99 */       m = MainMemory.alloc(30);
/*  100 */       n = MainMemory.alloc(8);
/*  101 */       i1 = MainMemory.alloc(81);
/*  102 */       i2 = MainMemory.alloc(81);
/*  103 */       i3 = MainMemory.alloc(81);
/*  104 */       i4 = MainMemory.alloc(4);
/*  105 */       MainMemory.setI32(paramInt2, 0);
/*  106 */       MainMemory.setI32(paramInt3, 0);
/*  107 */       MainMemory.setI32(paramInt4, 0);
/*  108 */       i5 = F368312.call(paramInt1, i4);
/*  109 */       if (i5 != 0) {
/*      */         break label218;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  119 */       MainMemory.setI32(paramInt5, 104);
/*      */       
/*      */       break label8379;
/*      */       
/*      */       label218:
/*  124 */       i6 = MainMemory.getI32(i4);
/*  125 */       SystemLibrary.memcpy(i1, 17248, 3, 1);
/*  126 */       i7 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  133 */         MainMemory.setI8(i1 + (i7 + 3), (byte)32);
/*  134 */         i7 += 1;
/*  135 */         if (i7 == 77) {
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
/*  146 */       MainMemory.setI8(i1 + 80, (byte)0);
/*  147 */       i12 = F368223.call(i5);
/*  148 */       if (i12 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  158 */         i7 = SystemLibrary.strncmp(i12, 26080, 5);
/*  159 */         free.call(i12);
/*  160 */         if (i7 == 0) {
/*  161 */           i7 = 1;
/*      */           
/*      */ 
/*      */ 
/*      */           break label489;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  171 */       i7 = SystemLibrary.strncmp(i5, 26112, 5) == 0 ? 2 : 0;
/*  172 */       switch (i7)
/*      */       {
/*      */       case 0: 
/*      */         break label461;
/*      */         
/*      */ 
/*      */         break;
/*      */       case 2: 
/*      */         break;
/*      */       }
/*      */       
/*      */       
/*  184 */       i8 = (i6 + 63490) / 81;
/*      */       
/*  186 */       i15 = i8;
/*  187 */       i8 = 86;
/*  188 */       i16 = 18;
/*  189 */       i9 = 22;
/*  190 */       i10 = 50;
/*  191 */       i11 = 10;
/*      */       
/*      */       break label530;
/*      */       
/*      */       label461:
/*  196 */       ffxmsg.call(5, 79520);
/*  197 */       ffxmsg.call(5, paramInt1);
/*  198 */       MainMemory.setI32(paramInt5, 104);
/*      */       
/*      */       break label5803;
/*      */       
/*      */       label489:
/*      */       
/*  204 */       i8 = (i6 + 63484) / 162;
/*      */       
/*  206 */       i15 = i8;
/*  207 */       i8 = 88;
/*  208 */       i16 = 20;
/*  209 */       i9 = 24;
/*  210 */       i10 = 52;
/*  211 */       i11 = 16;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label530:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  224 */       i15 = (i15 + 24) / 36 * 2880 + 14404;
/*  225 */       MainMemory.setI32(paramInt3, i15);
/*  226 */       i12 = calloc.call(i15, 1);
/*  227 */       if (i12 != 0) {
/*      */         break label624;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  237 */       SystemLibrary.sprintf(i3, 104288, new Object[] { Integer.valueOf(MainMemory.getI32(paramInt3)) });
/*  238 */       ffxmsg.call(5, paramInt1);
/*  239 */       MainMemory.setI32(paramInt5, 104);
/*      */       
/*      */       break label5803;
/*      */       
/*      */       label624:
/*  244 */       MainMemory.setI32(paramInt2, i12);
/*  245 */       SystemLibrary.strncpy(i12, i1, 80);
/*  246 */       MainMemory.setI16(n, (short)84);
/*  247 */       i13 = n;
/*  248 */       F368666.call(i12, 36032, i13);
/*  249 */       i14 = MainMemory.getI8(i5 + i11);
/*  250 */       i21 = i14 != 0 ? 1 : 0;
/*  251 */       i15 = i21 != 0 ? 1 : 0;
/*  252 */       MainMemory.setI32Aligned(459404, i15);
/*  253 */       if (i7 != 1)
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
/*  264 */         i15 = MainMemory.getI8(i5 + 14) & 0xFF;
/*  265 */         if (i21 == 0) {
/*      */           break label811;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  275 */         i15 = (MainMemory.getI8(i5 + 15) & 0xFF) << 8 | i15 | (MainMemory.getI8(i5 + 16) & 0xFF) << 16 | (MainMemory.getI8(i5 + 17) & 0xFF) << 24;
/*      */         
/*      */         break label868;
/*      */         
/*      */         label811:
/*      */         
/*  281 */         i15 = (MainMemory.getI8(i5 + 15) & 0xFF) << 16 | i15 << 24 | MainMemory.getI8(i5 + 17) & 0xFF | (MainMemory.getI8(i5 + 16) & 0xFF) << 8;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label868:
/*      */       
/*      */ 
/*  289 */       MainMemory.setI32Aligned(459408, i15);
/*  290 */       i15 = i14 & 0xFF;
/*  291 */       if (i21 == 0) {
/*      */         break label969;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  301 */       i11 = (MainMemory.getI8(i5 + (i11 | 0x1)) & 0xFF) << 8 | i15 | (MainMemory.getI8(i5 + (i11 + 2)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i11 + 3)) & 0xFF) << 24;
/*      */       
/*      */       break label1032;
/*      */       
/*      */       label969:
/*      */       
/*  307 */       i11 = (MainMemory.getI8(i5 + (i11 | 0x1)) & 0xFF) << 16 | i15 << 24 | MainMemory.getI8(i5 + (i11 + 3)) & 0xFF | (MainMemory.getI8(i5 + (i11 + 2)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label1032:
/*      */       
/*      */ 
/*      */ 
/*  315 */       switch (i11) {
/*  316 */       case 2:  i11 = 8;
/*      */         break label1233;
/*      */         break;
/*      */       case 3: 
/*      */         break label1224;
/*      */         break; case 4:  break label1210;
/*      */         break; case 5:  break label1210;
/*      */         break; case 6:  break label1196;
/*      */         break; case 7:  break label1182;
/*      */         break; case 11:  break; case 12:  i11 = 8;
/*      */         
/*      */ 
/*      */         break label1233;
/*      */         
/*      */         break;
/*      */       }
/*      */       
/*      */       
/*  334 */       i11 = -16;
/*      */       
/*      */       break label1233;
/*      */       
/*      */       label1182:
/*  339 */       i11 = -64;
/*      */       
/*      */       break label1233;
/*      */       
/*      */       label1196:
/*  344 */       i11 = -32;
/*      */       
/*      */       break label1233;
/*      */       
/*      */       label1210:
/*  349 */       i11 = 32;
/*      */       
/*      */       break label1233;
/*      */       
/*      */       label1224:
/*  354 */       i11 = 16;
/*      */       
/*      */ 
/*      */ 
/*      */       label1233:
/*      */       
/*      */ 
/*  361 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i11) });
/*  362 */       F368666.call(i12, 28224, m);
/*  363 */       F369067.call(i12, 28224, 63872);
/*  364 */       i11 = MainMemory.getI8(i5 + i16) & 0xFF;
/*  365 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label1378;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  375 */       i16 = (MainMemory.getI8(i5 + (i16 | 0x1)) & 0xFF) << 8 | i11 | (MainMemory.getI8(i5 + (i16 + 2)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i16 + 3)) & 0xFF) << 24;
/*      */       
/*      */       break label1441;
/*      */       
/*      */       label1378:
/*      */       
/*  381 */       i16 = (MainMemory.getI8(i5 + (i16 | 0x1)) & 0xFF) << 16 | i11 << 24 | MainMemory.getI8(i5 + (i16 + 3)) & 0xFF | (MainMemory.getI8(i5 + (i16 + 2)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label1441:
/*      */       
/*      */ 
/*      */ 
/*  389 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i16) });
/*  390 */       F368666.call(i12, 24224, m);
/*  391 */       F369067.call(i12, 24224, 56992);
/*  392 */       i11 = MainMemory.getI8(i5 + i9) & 0xFF;
/*  393 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label1586;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  403 */       i11 = (MainMemory.getI8(i5 + (i9 | 0x1)) & 0xFF) << 8 | i11 | (MainMemory.getI8(i5 + (i9 + 2)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i9 + 3)) & 0xFF) << 24;
/*      */       
/*      */       break label1649;
/*      */       
/*      */       label1586:
/*      */       
/*  409 */       i11 = (MainMemory.getI8(i5 + (i9 | 0x1)) & 0xFF) << 16 | i11 << 24 | MainMemory.getI8(i5 + (i9 + 3)) & 0xFF | (MainMemory.getI8(i5 + (i9 + 2)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label1649:
/*      */       
/*      */ 
/*      */ 
/*  417 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i11) });
/*  418 */       F368666.call(i12, 36000, m);
/*  419 */       F369067.call(i12, 36000, 69088);
/*  420 */       i23 = i12 + 320;
/*  421 */       i17 = i16 > 1 ? 1 : 0;
/*  422 */       if (i17 == 0) {
/*      */         break label1952;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  433 */       i11 = MainMemory.getI8(i5 + (i9 + 4)) & 0xFF;
/*  434 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label1835;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  444 */       i11 = (MainMemory.getI8(i5 + (i9 + 5)) & 0xFF) << 8 | i11 | (MainMemory.getI8(i5 + (i9 + 6)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i9 + 7)) & 0xFF) << 24;
/*      */       
/*      */       break label1900;
/*      */       
/*      */       label1835:
/*      */       
/*  450 */       i11 = (MainMemory.getI8(i5 + (i9 + 5)) & 0xFF) << 16 | i11 << 24 | MainMemory.getI8(i5 + (i9 + 7)) & 0xFF | (MainMemory.getI8(i5 + (i9 + 6)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label1900:
/*      */       
/*      */ 
/*      */ 
/*  458 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i11) });
/*  459 */       F368666.call(i12, 35712, m);
/*  460 */       F369067.call(i12, 35712, 69120);
/*  461 */       i23 = i12 + 400;
/*      */       
/*      */ 
/*      */ 
/*      */       label1952:
/*      */       
/*      */ 
/*      */ 
/*  469 */       i18 = i16 > 2 ? 1 : 0;
/*  470 */       if (i18 == 0) {
/*      */         break label2212;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  481 */       i11 = MainMemory.getI8(i5 + (i9 + 8)) & 0xFF;
/*  482 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label2093;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  492 */       i11 = (MainMemory.getI8(i5 + (i9 + 9)) & 0xFF) << 8 | i11 | (MainMemory.getI8(i5 + (i9 + 10)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i9 + 11)) & 0xFF) << 24;
/*      */       
/*      */       break label2159;
/*      */       
/*      */       label2093:
/*      */       
/*  498 */       i11 = (MainMemory.getI8(i5 + (i9 + 9)) & 0xFF) << 16 | i11 << 24 | MainMemory.getI8(i5 + (i9 + 11)) & 0xFF | (MainMemory.getI8(i5 + (i9 + 10)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label2159:
/*      */       
/*      */ 
/*      */ 
/*  506 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i11) });
/*  507 */       F368666.call(i12, 32032, m);
/*  508 */       F369067.call(i12, 32032, 69152);
/*  509 */       i23 += 80;
/*      */       
/*      */ 
/*      */ 
/*      */       label2212:
/*      */       
/*      */ 
/*      */ 
/*  517 */       i19 = i16 > 3 ? 1 : 0;
/*  518 */       if (i19 == 0)
/*      */       {
/*      */ 
/*      */ 
/*  522 */         i20 = i23;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  529 */         i16 = MainMemory.getI8(i5 + (i9 + 12)) & 0xFF;
/*  530 */         if (MainMemory.getI32Aligned(459404) != 1) {
/*      */           break label2357;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  540 */         i9 = (MainMemory.getI8(i5 + (i9 + 13)) & 0xFF) << 8 | i16 | (MainMemory.getI8(i5 + (i9 + 14)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i9 + 15)) & 0xFF) << 24;
/*      */         
/*      */         break label2423;
/*      */         
/*      */         label2357:
/*      */         
/*  546 */         i9 = (MainMemory.getI8(i5 + (i9 + 13)) & 0xFF) << 16 | i16 << 24 | MainMemory.getI8(i5 + (i9 + 15)) & 0xFF | (MainMemory.getI8(i5 + (i9 + 14)) & 0xFF) << 8;
/*      */         
/*      */ 
/*      */ 
/*      */         label2423:
/*      */         
/*      */ 
/*      */ 
/*  554 */         SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i9) });
/*  555 */         F368666.call(i12, 32064, m);
/*  556 */         F369067.call(i12, 32064, 69184);
/*  557 */         i23 += 80;
/*  558 */         i20 = i23;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  565 */       i21 = i7 == 2 ? 1 : 0;
/*  566 */       if (i21 == 0) {
/*      */         break label2638;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  576 */       i23 = calloc.call(384, 1);
/*  577 */       if (i23 != 0)
/*      */       {
/*      */ 
/*      */ 
/*  581 */         i9 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  588 */         ffxmsg.call(5, 117216);
/*  589 */         i22 = 0;
/*      */         
/*      */         break label2657;
/*      */       }
/*      */       for (;;)
/*      */       {
/*  595 */         i14 = MainMemory.getI8(i5 + (i9 + 638));
/*  596 */         MainMemory.setI8(i23 + i9, MathUtils.ult((byte)(i14 + -1), (byte)31) ? 32 : i14);
/*  597 */         i9 += 1;
/*  598 */         if (i9 == 383) {
/*  599 */           i22 = i23;
/*      */           
/*      */           break label2657;
/*      */           
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */       label2638:
/*      */       
/*  609 */       i23 = F368254.call(i5, 732);
/*  610 */       i22 = i23;
/*      */       
/*      */ 
/*      */ 
/*      */       label2657:
/*      */       
/*      */ 
/*  617 */       i9 = SystemLibrary.strlen(i22);
/*  618 */       if (i9 >= 8) {
/*      */         break label2752;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  628 */       i16 = 8 - i9;
/*  629 */       i11 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  636 */         MainMemory.setI8(i22 + (i9 + i11), (byte)32);
/*  637 */         i11 += 1;
/*  638 */         if (i11 == i16) {
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
/*  649 */       MainMemory.setI8(i22 + 8, (byte)0);
/*      */       
/*      */ 
/*      */       label2752:
/*      */       
/*      */ 
/*  655 */       i9 = SystemLibrary.strlen(i22);
/*  656 */       i9 = i9 > 67 ? 67 : i9;
/*  657 */       MainMemory.setI8(k, (byte)39);
/*  658 */       i23 = k + 1;
/*  659 */       SystemLibrary.strncpy(i23, i22, i9);
/*  660 */       MainMemory.setI8(k + (i9 + 1), (byte)39);
/*  661 */       MainMemory.setI8(k + (i9 + 2), (byte)0);
/*  662 */       F368666.call(i12, 30528, k);
/*  663 */       F369067.call(i12, 30528, 57024);
/*  664 */       free.call(i22);
/*  665 */       i9 = MainMemory.getI8(i5 + i10) & 0xFF;
/*  666 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label2950;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  676 */       i9 = (MainMemory.getI8(i5 + (i10 | 0x1)) & 0xFF) << 8 | i9 | (MainMemory.getI8(i5 + (i10 + 2)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i10 + 3)) & 0xFF) << 24;
/*      */       
/*      */       break label3013;
/*      */       
/*      */       label2950:
/*      */       
/*  682 */       i9 = (MainMemory.getI8(i5 + (i10 | 0x1)) & 0xFF) << 16 | i9 << 24 | MainMemory.getI8(i5 + (i10 + 3)) & 0xFF | (MainMemory.getI8(i5 + (i10 + 2)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label3013:
/*      */       
/*      */ 
/*      */ 
/*  690 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i9) });
/*  691 */       F368666.call(i12, 39808, m);
/*  692 */       F369067.call(i12, 39808, 72608);
/*  693 */       i22 = i20 + 160;
/*  694 */       if (i17 == 0)
/*      */       {
/*      */ 
/*      */ 
/*  698 */         i20 = i22;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  705 */         i9 = MainMemory.getI8(i5 + (i10 + 4)) & 0xFF;
/*  706 */         if (MainMemory.getI32Aligned(459404) != 1) {
/*      */           break label3190;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  716 */         i9 = (MainMemory.getI8(i5 + (i10 + 5)) & 0xFF) << 8 | i9 | (MainMemory.getI8(i5 + (i10 + 6)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i10 + 7)) & 0xFF) << 24;
/*      */         
/*      */         break label3255;
/*      */         
/*      */         label3190:
/*      */         
/*  722 */         i9 = (MainMemory.getI8(i5 + (i10 + 5)) & 0xFF) << 16 | i9 << 24 | MainMemory.getI8(i5 + (i10 + 7)) & 0xFF | (MainMemory.getI8(i5 + (i10 + 6)) & 0xFF) << 8;
/*      */         
/*      */ 
/*      */ 
/*      */         label3255:
/*      */         
/*      */ 
/*      */ 
/*  730 */         SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i9) });
/*  731 */         F368666.call(i12, 39840, m);
/*  732 */         F369067.call(i12, 39840, 72640);
/*  733 */         i20 += 240;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  741 */       if (i18 == 0) {
/*      */         break label3552;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  752 */       i9 = i10 | 0x8;
/*  753 */       i16 = MainMemory.getI8(i5 + i9) & 0xFF;
/*  754 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label3437;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  764 */       i9 = (MainMemory.getI8(i5 + (i10 | 0x9)) & 0xFF) << 8 | i16 | (MainMemory.getI8(i5 + (i9 + 2)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i9 + 3)) & 0xFF) << 24;
/*      */       
/*      */       break label3501;
/*      */       
/*      */       label3437:
/*      */       
/*  770 */       i9 = (MainMemory.getI8(i5 + (i10 | 0x9)) & 0xFF) << 16 | i16 << 24 | MainMemory.getI8(i5 + (i9 + 3)) & 0xFF | (MainMemory.getI8(i5 + (i9 + 2)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label3501:
/*      */       
/*      */ 
/*      */ 
/*  778 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i9) });
/*  779 */       F368666.call(i12, 39872, m);
/*  780 */       F369067.call(i12, 39872, 72672);
/*  781 */       i20 += 80;
/*      */       
/*      */ 
/*      */ 
/*      */       label3552:
/*      */       
/*      */ 
/*      */ 
/*  789 */       if (i19 == 0) {
/*      */         break label3797;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  800 */       i9 = MainMemory.getI8(i5 + (i10 + 12)) & 0xFF;
/*  801 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label3680;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  811 */       i10 = (MainMemory.getI8(i5 + (i10 + 13)) & 0xFF) << 8 | i9 | (MainMemory.getI8(i5 + (i10 + 14)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i10 + 15)) & 0xFF) << 24;
/*      */       
/*      */       break label3746;
/*      */       
/*      */       label3680:
/*      */       
/*  817 */       i10 = (MainMemory.getI8(i5 + (i10 + 13)) & 0xFF) << 16 | i9 << 24 | MainMemory.getI8(i5 + (i10 + 15)) & 0xFF | (MainMemory.getI8(i5 + (i10 + 14)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label3746:
/*      */       
/*      */ 
/*      */ 
/*  825 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i10) });
/*  826 */       F368666.call(i12, 39904, m);
/*  827 */       F369067.call(i12, 39904, 72704);
/*  828 */       i20 += 80;
/*      */       
/*      */ 
/*      */ 
/*      */       label3797:
/*      */       
/*      */ 
/*      */ 
/*  836 */       i10 = SystemLibrary.strlen(paramInt1);
/*  837 */       i10 = i10 > 67 ? 67 : i10;
/*  838 */       MainMemory.setI8(k, (byte)39);
/*  839 */       SystemLibrary.strncpy(i23, paramInt1, i10);
/*  840 */       MainMemory.setI8(k + (i10 + 1), (byte)39);
/*  841 */       MainMemory.setI8(k + (i10 + 2), (byte)0);
/*  842 */       F368666.call(i12, 39936, k);
/*  843 */       F369067.call(i12, 39936, 65120);
/*  844 */       if (i21 == 0) {
/*      */         break label4016;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  854 */       i22 = calloc.call(256, 1);
/*  855 */       if (i22 != 0)
/*      */       {
/*      */ 
/*      */ 
/*  859 */         i10 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  866 */         ffxmsg.call(5, 117216);
/*  867 */         i22 = 0;
/*      */         break label4031;
/*      */       }
/*      */       byte b;
/*      */       for (;;)
/*      */       {
/*  873 */         b = MainMemory.getI8(i5 + (i10 + 126));
/*  874 */         MainMemory.setI8(i22 + i10, MathUtils.ult((byte)(b + -1), (byte)31) ? 32 : b);
/*  875 */         i10 += 1;
/*  876 */         if (i10 == 255) {
/*      */           break label4031;
/*  878 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label4016:
/*      */       
/*      */ 
/*  887 */       i22 = F368254.call(i5, 412);
/*      */       
/*      */ 
/*      */ 
/*      */       label4031:
/*      */       
/*      */ 
/*      */ 
/*  895 */       if (SystemLibrary.strncmp(i22, 17216, 3) != 0) {
/*      */         break label4093;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  906 */       i24 = F368560.call(i22, paramInt1);
/*  907 */       if (i24 != 0)
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
/*  918 */         free.call(i22);
/*  919 */         i22 = i24;
/*      */       }
/*      */       
/*      */ 
/*      */       label4093:
/*      */       
/*      */ 
/*  926 */       if (SystemLibrary.strchr(i22, 47) != 0)
/*      */       {
/*      */ 
/*      */ 
/*  930 */         paramInt1 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*  937 */       else if (SystemLibrary.strchr(i22, 36) != 0)
/*      */       {
/*      */ 
/*      */ 
/*  941 */         paramInt1 = i22;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  948 */         paramInt1 = F368560.call(i22, paramInt1);
/*  949 */         if (paramInt1 == 0) {
/*  950 */           paramInt1 = i22;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  960 */           free.call(i22);
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  968 */       i22 = SystemLibrary.strchr(paramInt1, 33);
/*  969 */       if (i22 != 0) {
/*      */         break label4285;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  979 */       i10 = SystemLibrary.strlen(paramInt1);
/*  980 */       i10 = i10 > 67 ? 67 : i10;
/*  981 */       MainMemory.setI8(k, (byte)39);
/*  982 */       SystemLibrary.strncpy(i23, paramInt1, i10);
/*  983 */       MainMemory.setI8(k + (i10 + 1), (byte)39);
/*  984 */       MainMemory.setI8(k + (i10 + 2), (byte)0);
/*  985 */       F368666.call(i12, 39968, k);
/*      */       
/*      */       break label4368;
/*      */       
/*      */       label4285:
/*  990 */       i22 += 1;
/*  991 */       i10 = SystemLibrary.strlen(i22);
/*  992 */       i10 = i10 > 67 ? 67 : i10;
/*  993 */       MainMemory.setI8(k, (byte)39);
/*  994 */       SystemLibrary.strncpy(i23, i22, i10);
/*  995 */       MainMemory.setI8(k + (i10 + 1), (byte)39);
/*  996 */       MainMemory.setI8(k + (i10 + 2), (byte)0);
/*  997 */       F368666.call(i12, 39968, k);
/*      */       
/*      */ 
/*      */       label4368:
/*      */       
/*      */ 
/* 1003 */       free.call(paramInt1);
/* 1004 */       F369067.call(i12, 39968, 63904);
/* 1005 */       i10 = MainMemory.getI8(i5 + i8) & 0xFF;
/* 1006 */       if (MainMemory.getI32Aligned(459404) != 1) {
/*      */         break label4485;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1016 */       i8 = (MainMemory.getI8(i5 + (i8 | 0x1)) & 0xFF) << 8 | i10 | (MainMemory.getI8(i5 + (i8 + 2)) & 0xFF) << 16 | (MainMemory.getI8(i5 + (i8 + 3)) & 0xFF) << 24;
/*      */       
/*      */       break label4548;
/*      */       
/*      */       label4485:
/*      */       
/* 1022 */       i8 = (MainMemory.getI8(i5 + (i8 | 0x1)) & 0xFF) << 16 | i10 << 24 | MainMemory.getI8(i5 + (i8 + 3)) & 0xFF | (MainMemory.getI8(i5 + (i8 + 2)) & 0xFF) << 8;
/*      */       
/*      */ 
/*      */ 
/*      */       label4548:
/*      */       
/*      */ 
/*      */ 
/* 1030 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf((i8 << 1) + -2) });
/* 1031 */       F368666.call(i12, 32096, m);
/* 1032 */       F369067.call(i12, 32096, 91744);
/* 1033 */       SystemLibrary.sprintf(m, 15680, new Object[] { Integer.valueOf(i7) });
/* 1034 */       F368666.call(i12, 32128, m);
/* 1035 */       F369067.call(i12, 32128, 80672);
/* 1036 */       if (MainMemory.getI32Aligned(459408) != 0) {
/*      */         break label4682;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1046 */       MainMemory.setI16(n, (short)70);
/* 1047 */       F368666.call(i12, 40000, i13);
/*      */       
/*      */       break label4703;
/*      */       
/*      */       label4682:
/* 1052 */       MainMemory.setI16(n, (short)84);
/* 1053 */       F368666.call(i12, 40000, i13);
/*      */       
/*      */ 
/*      */       label4703:
/*      */       
/*      */ 
/* 1059 */       F369067.call(i12, 40000, 95584);
/* 1060 */       paramInt1 = i20 + 400;
/* 1061 */       MainMemory.setI8(i2 + 80, (byte)0);
/* 1062 */       if (i21 != 0) {
/* 1063 */         i7 = 0;
/*      */       } else {
/*      */         break label5155;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1074 */         MainMemory.setI8(i2 + i7, (byte)32);
/* 1075 */         i7 += 1;
/* 1076 */         if (i7 == 80) {
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
/* 1087 */       i7 = 0;
/*      */       
/* 1089 */       i8 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1098 */         i10 = i7 + 2046;
/* 1099 */         if (i10 >= i6) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1110 */         b = MainMemory.getI8(i5 + i10);
/* 1111 */         switch (b)
/*      */         {
/*      */         case 0: 
/*      */           break label5603;
/*      */           
/*      */ 
/*      */           break;
/*      */         case 10: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 1123 */         SystemLibrary.strncpy(paramInt1, i2, 80);
/* 1124 */         if (SystemLibrary.strncmp(i2, 40032, 7) != 0)
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
/* 1135 */           paramInt1 += 80;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1143 */         i8 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1150 */           MainMemory.setI8(i2 + i8, (byte)32);
/* 1151 */           i8 += 1;
/* 1152 */           if (i8 == 80)
/*      */           {
/* 1154 */             i8 = 0;
/*      */             
/*      */ 
/*      */             break label5139;
/*      */             
/*      */ 
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/* 1164 */         if (i8 <= 80) {
/*      */           break label5086;
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
/* 1176 */         if (SystemLibrary.strncmp(i2, 40032, 7) != 0)
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
/* 1188 */           SystemLibrary.strncpy(paramInt1, i2, 80);
/* 1189 */           paramInt1 += 80;
/* 1190 */           i8 = 9;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1199 */         i10 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1206 */           MainMemory.setI8(i2 + i10, (byte)32);
/* 1207 */           i10 += 1;
/* 1208 */           if (i10 == 80) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label5086:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1223 */         if (!MathUtils.ult((byte)(b + -33), (byte)94)) {
/*      */           break label5128;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1233 */         MainMemory.setI8(i2 + i8, b);
/*      */         
/*      */ 
/*      */         label5128:
/*      */         
/*      */ 
/* 1239 */         i8 += 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label5139:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1249 */         i7 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label5155:
/*      */       
/*      */ 
/* 1257 */       i21 = MainMemory.getI32Aligned(459404) != 1 ? 1 : 0;
/* 1258 */       i7 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1265 */         MainMemory.setI8(i2 + i7, (byte)32);
/* 1266 */         i7 += 1;
/* 1267 */         if (i7 == 80) {
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
/* 1278 */       i7 = i21 != 0 ? 1 : 0;
/* 1279 */       i8 = 0;
/*      */       
/* 1281 */       i10 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1290 */         i9 = (i8 << 1) + 2052;
/* 1291 */         if (i9 >= i6) {
/*      */           break;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1302 */         b = MainMemory.getI8(i5 + (i9 | i7));
/* 1303 */         switch (b)
/*      */         {
/*      */         case 0: 
/*      */           break label5603;
/*      */           
/*      */ 
/*      */           break;
/*      */         case 10: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 1315 */         if (SystemLibrary.strncmp(i2, 40032, 7) != 0)
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
/* 1326 */           SystemLibrary.strncpy(paramInt1, i2, 80);
/* 1327 */           paramInt1 += 80;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1335 */         i10 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1342 */           MainMemory.setI8(i2 + i10, (byte)32);
/* 1343 */           i10 += 1;
/* 1344 */           if (i10 == 80)
/*      */           {
/* 1346 */             i10 = 0;
/*      */             
/*      */ 
/*      */             break label5587;
/*      */             
/*      */ 
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/* 1356 */         if (i10 <= 80) {
/*      */           break label5534;
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
/* 1368 */         if (SystemLibrary.strncmp(i2, 40032, 7) != 0)
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
/* 1380 */           SystemLibrary.strncpy(paramInt1, i2, 80);
/* 1381 */           paramInt1 += 80;
/* 1382 */           i10 = 9;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1391 */         i9 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1398 */           MainMemory.setI8(i2 + i9, (byte)32);
/* 1399 */           i9 += 1;
/* 1400 */           if (i9 == 80) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         label5534:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1415 */         if (!MathUtils.ult((byte)(b + -33), (byte)94)) {
/*      */           break label5576;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1425 */         MainMemory.setI8(i2 + i10, b);
/*      */         
/*      */ 
/*      */         label5576:
/*      */         
/*      */ 
/* 1431 */         i10 += 1;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label5587:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 1441 */         i8 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label5603:
/*      */       
/*      */ 
/*      */ 
/* 1450 */       SystemLibrary.strncpy(paramInt1, i1, 80);
/* 1451 */       paramInt1 = F368458.call(i12, 17248);
/* 1452 */       i23 = paramInt1 + 80;
/* 1453 */       i6 = MainMemory.getI32(paramInt3);
/* 1454 */       i13 = i12 + (i6 - MathUtils.urem(i6, 2880));
/* 1455 */       MainMemory.setI32(paramInt4, i23 - i12);
/* 1456 */       SystemLibrary.memcpy(i1, 17280, 3, 1);
/* 1457 */       if (MathUtils.ult(i23, i13)) {
/* 1458 */         i6 = 0;
/*      */       } else {
/*      */         break label5803;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1469 */         i7 = i6 * 80;
/* 1470 */         i12 = paramInt1 + (i7 + 160);
/* 1471 */         SystemLibrary.strncpy(paramInt1 + (i7 + 80), i1, 80);
/* 1472 */         i6 += 1;
/* 1473 */         if (!MathUtils.ult(i12, i13)) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */       break label5760;
/*      */       
/*      */       break label5803;
/*      */       
/*      */       label5760:
/* 1483 */       SystemLibrary.sprintf(i3, 77152, new Object[] { Integer.valueOf(i11) });
/* 1484 */       ffxmsg.call(5, i3);
/* 1485 */       ffxmsg.call(5, paramInt1);
/* 1486 */       MainMemory.setI32(paramInt5, 104);
/*      */       
/*      */ 
/*      */       label5803:
/*      */       
/*      */ 
/* 1492 */       free.call(i5);
/* 1493 */       if (MainMemory.getI32(paramInt5) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1503 */         i6 = MainMemory.getI32(paramInt4) + -1;
/* 1504 */         MainMemory.setI32(paramInt4, 2880 - MathUtils.urem(i6, 2880) + i6);
/* 1505 */         paramInt1 = MainMemory.getI32(paramInt2);
/* 1506 */         i5 = F369179.call(paramInt1, 39968);
/* 1507 */         if (i5 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1517 */           if (SystemLibrary.strlen(i5) >= 255) {
/*      */             break label5923;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1527 */           SystemLibrary.strcpy(j, i5);
/*      */           
/*      */           break label5939;
/*      */           
/*      */           label5923:
/* 1532 */           SystemLibrary.strncpy(j, i5, 254);
/*      */         }
/*      */         
/*      */ 
/*      */         label5939:
/*      */         
/* 1538 */         i5 = F369179.call(paramInt1, 32096);
/* 1539 */         if (i5 == 0) {
/* 1540 */           i6 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1550 */           SystemLibrary.strcpy(m, i5);
/* 1551 */           d1 = SystemLibrary.atof(m);
/* 1552 */           d2 = d1 + 0.001D;
/* 1553 */           if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 1554 */             i6 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1564 */             if (!MathUtils.f_ult(d1, 0.0D)) {
/*      */               break label6084;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1574 */             d1 += -0.001D;
/* 1575 */             if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 1576 */               i6 = Integer.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1586 */               i6 = (int)d1;
/*      */               
/*      */               break label6094;
/*      */               
/*      */               label6084:
/*      */               
/* 1592 */               i6 = (int)d2;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label6094:
/*      */         
/* 1600 */         i5 = SystemLibrary.strchr(j, 33);
/* 1601 */         if (i5 != 0) {
/*      */           break label6141;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1611 */         i25 = SystemLibrary.fopen(j, 15360);
/*      */         
/*      */         break label6158;
/*      */         
/*      */         label6141:
/*      */         
/* 1617 */         i25 = SystemLibrary.fopen(i5 + 1, 15360);
/*      */         
/*      */ 
/*      */ 
/*      */         label6158:
/*      */         
/*      */ 
/*      */ 
/* 1625 */         if (i25 != 0) {
/*      */           break label6205;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1635 */         ffxmsg.call(5, 93792);
/* 1636 */         ffxmsg.call(5, j);
/* 1637 */         MainMemory.setI32(paramInt5, 104);
/*      */         
/*      */         break label8379;
/*      */         
/*      */         label6205:
/* 1642 */         i5 = calloc.call(i6, 1);
/* 1643 */         if (i5 != 0) {
/*      */           break label6266;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1653 */         ffxmsg.call(5, 111520);
/* 1654 */         ffxmsg.call(5, j);
/* 1655 */         SystemLibrary.fclose(i25);
/* 1656 */         MainMemory.setI32(paramInt5, 104);
/*      */         
/*      */         break label8379;
/*      */         
/*      */         label6266:
/* 1661 */         i7 = SystemLibrary.fread(i5, 1, i6, i25);
/* 1662 */         if (i7 >= i6) {
/*      */           break label6361;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1672 */         SystemLibrary.sprintf(i1, 86496, new Object[] { Integer.valueOf(i7), Integer.valueOf(1024) });
/* 1673 */         ffxmsg.call(5, i1);
/* 1674 */         free.call(i5);
/* 1675 */         SystemLibrary.fclose(i25);
/* 1676 */         MainMemory.setI32(paramInt5, 104);
/*      */         
/*      */         break label8379;
/*      */         
/*      */         label6361:
/* 1681 */         i12 = calloc.call(6, 1);
/* 1682 */         if (i12 != 0) {
/*      */           break label6403;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1692 */         ffxmsg.call(5, 117152);
/*      */         
/*      */         break label6503;
/*      */         
/*      */         label6403:
/* 1697 */         i6 = MainMemory.getI8(i5) == 0 ? 1 : 0;
/* 1698 */         i7 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/* 1705 */           MainMemory.setI8(i12 + i7, MainMemory.getI8(i5 + (i6 | i7 << 1)));
/* 1706 */           i7 += 1;
/* 1707 */           if (i7 == 5) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1718 */         i6 = SystemLibrary.strncmp(i12, 26144, 5);
/* 1719 */         free.call(i12);
/* 1720 */         if (i6 != 0) {
/*      */           label6503:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1730 */           if (SystemLibrary.strncmp(i5, 26176, 5) != 0) {
/*      */             break label8342;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1740 */         free.call(i5);
/* 1741 */         i5 = F369179.call(paramInt1, 24224);
/* 1742 */         if (i5 == 0) {
/* 1743 */           i9 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1753 */           SystemLibrary.strcpy(m, i5);
/* 1754 */           d1 = SystemLibrary.atof(m);
/* 1755 */           d2 = d1 + 0.001D;
/* 1756 */           if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 1757 */             i9 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1767 */             if (!MathUtils.f_ult(d1, 0.0D)) {
/*      */               break label6692;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1777 */             d1 += -0.001D;
/* 1778 */             if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 1779 */               i9 = Integer.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1789 */               i6 = (int)d1;
/* 1790 */               i9 = i6;
/*      */               
/*      */               break label6707;
/*      */               
/*      */               label6692:
/* 1795 */               i6 = (int)d2;
/* 1796 */               i9 = i6;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */         label6707:
/*      */         
/* 1803 */         i5 = F369179.call(paramInt1, 36000);
/* 1804 */         if (i5 == 0) {
/* 1805 */           i6 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1815 */           SystemLibrary.strcpy(m, i5);
/* 1816 */           d1 = SystemLibrary.atof(m);
/* 1817 */           d2 = d1 + 0.001D;
/* 1818 */           if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 1819 */             i6 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1829 */             if (!MathUtils.f_ult(d1, 0.0D)) {
/*      */               break label6861;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1839 */             d1 += -0.001D;
/* 1840 */             if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 1841 */               i6 = Integer.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1851 */               i6 = (int)d1;
/*      */               
/*      */               break label6872;
/*      */               
/*      */               label6861:
/*      */               
/* 1857 */               i6 = (int)d2;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label6872:
/*      */         
/* 1865 */         i5 = F369179.call(paramInt1, 39808);
/* 1866 */         if (i5 == 0) {
/* 1867 */           i7 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 1877 */           SystemLibrary.strcpy(m, i5);
/* 1878 */           d1 = SystemLibrary.atof(m);
/* 1879 */           d2 = d1 + 0.001D;
/* 1880 */           if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 1881 */             i7 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1891 */             if (!MathUtils.f_ult(d1, 0.0D)) {
/*      */               break label7026;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1901 */             d1 += -0.001D;
/* 1902 */             if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 1903 */               i7 = Integer.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1913 */               i7 = (int)d1;
/*      */               
/*      */               break label7037;
/*      */               
/*      */               label7026:
/*      */               
/* 1919 */               i7 = (int)d2;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label7037:
/*      */         
/* 1927 */         if (i9 <= 1)
/*      */         {
/*      */ 
/*      */ 
/* 1931 */           i8 = 1;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1938 */           i5 = F369179.call(paramInt1, 35712);
/* 1939 */           if (i5 == 0) {
/* 1940 */             i8 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1950 */             SystemLibrary.strcpy(m, i5);
/* 1951 */             d1 = SystemLibrary.atof(m);
/* 1952 */             d2 = d1 + 0.001D;
/* 1953 */             if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 1954 */               i8 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1964 */               if (!MathUtils.f_ult(d1, 0.0D)) {
/*      */                 break label7215;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1974 */               d1 += -0.001D;
/* 1975 */               if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 1976 */                 i8 = Integer.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 1986 */                 i8 = (int)d1;
/*      */                 
/*      */                 break label7226;
/*      */                 
/*      */                 label7215:
/*      */                 
/* 1992 */                 i8 = (int)d2;
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */           label7226:
/*      */           
/* 2000 */           i5 = F369179.call(paramInt1, 39840);
/* 2001 */           if (i5 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2012 */             SystemLibrary.strcpy(m, i5);
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2020 */         if (i9 <= 2)
/*      */         {
/*      */ 
/*      */ 
/* 2024 */           i10 = 1;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2031 */           i5 = F369179.call(paramInt1, 32032);
/* 2032 */           if (i5 == 0) {
/* 2033 */             i10 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2043 */             SystemLibrary.strcpy(m, i5);
/* 2044 */             d1 = SystemLibrary.atof(m);
/* 2045 */             d2 = d1 + 0.001D;
/* 2046 */             if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 2047 */               i10 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2057 */               if (!MathUtils.f_ult(d1, 0.0D)) {
/*      */                 break label7444;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2067 */               d1 += -0.001D;
/* 2068 */               if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 2069 */                 i10 = Integer.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2079 */                 i10 = (int)d1;
/*      */                 
/*      */                 break label7455;
/*      */                 
/*      */                 label7444:
/*      */                 
/* 2085 */                 i10 = (int)d2;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */         label7455:
/*      */         
/* 2093 */         if (i9 <= 3)
/*      */         {
/*      */ 
/*      */ 
/* 2097 */           i16 = 1;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2104 */           i5 = F369179.call(paramInt1, 32064);
/* 2105 */           if (i5 == 0) {
/* 2106 */             i16 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2116 */             SystemLibrary.strcpy(m, i5);
/* 2117 */             d1 = SystemLibrary.atof(m);
/* 2118 */             d2 = d1 + 0.001D;
/* 2119 */             if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 2120 */               i16 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 2130 */               if (!MathUtils.f_ult(d1, 0.0D)) {
/*      */                 break label7638;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2140 */               d1 += -0.001D;
/* 2141 */               if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 2142 */                 i16 = Integer.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/* 2152 */                 i9 = (int)d1;
/* 2153 */                 i16 = i9;
/*      */                 
/*      */                 break label7653;
/*      */                 
/*      */                 label7638:
/* 2158 */                 i9 = (int)d2;
/* 2159 */                 i16 = i9;
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */         label7653:
/* 2166 */         i5 = F369179.call(paramInt1, 28224);
/* 2167 */         if (i5 == 0) {
/* 2168 */           i9 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/* 2178 */           SystemLibrary.strcpy(m, i5);
/* 2179 */           d1 = SystemLibrary.atof(m);
/* 2180 */           d2 = d1 + 0.001D;
/* 2181 */           if (MathUtils.f_ogt(d2, 2.147483647E9D)) {
/* 2182 */             i9 = Integer.MAX_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 2192 */             if (!MathUtils.f_ult(d1, 0.0D))
/*      */             {
/*      */ 
/*      */ 
/* 2196 */               d1 = d2;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 2203 */               d1 += -0.001D;
/* 2204 */               if (MathUtils.f_olt(d1, -2.147483648E9D)) {
/* 2205 */                 i9 = Integer.MIN_VALUE;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 break label7820;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 2217 */             i9 = (int)d1;
/* 2218 */             if (i9 >= 0) {
/*      */               break label7843;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             label7820:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/* 2231 */             i11 = i9 / -8;
/*      */             
/* 2233 */             i15 = i11;
/*      */             
/*      */             break label7860;
/*      */           }
/*      */         }
/*      */         label7843:
/* 2239 */         i11 = i9 / 8;
/*      */         
/* 2241 */         i15 = i11;
/*      */         
/*      */ 
/*      */ 
/*      */         label7860:
/*      */         
/*      */ 
/*      */ 
/* 2249 */         i16 = i8 * i6 * i10 * i16 * i15;
/* 2250 */         i11 = MainMemory.getI32(paramInt4) + -1 + i16;
/* 2251 */         i26 = i11 - MathUtils.urem(i11, 2880) + 2880;
/* 2252 */         if (!MathUtils.ult(MainMemory.getI32(paramInt3), i26)) {
/*      */           break label8019;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2263 */         paramInt1 = realloc.call(MainMemory.getI32(paramInt2), i26);
/* 2264 */         if (paramInt1 != 0) {
/*      */           break label8019;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2275 */         SystemLibrary.sprintf(i1, 108960, new Object[] { Integer.valueOf(MainMemory.getI32(paramInt4)) });
/* 2276 */         ffxmsg.call(5, i1);
/* 2277 */         ffxmsg.call(5, j);
/* 2278 */         SystemLibrary.fclose(i25);
/* 2279 */         MainMemory.setI32(paramInt5, 104);
/*      */         
/*      */         break label8379;
/*      */         
/*      */         label8019:
/*      */         
/* 2285 */         MainMemory.setI32(paramInt2, paramInt1);
/* 2286 */         MainMemory.setI32(paramInt3, i26);
/* 2287 */         i11 = MainMemory.getI32(paramInt4);
/* 2288 */         MainMemory.setI32(paramInt4, i26);
/* 2289 */         if (i7 != i6) {
/*      */           break label8090;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2299 */         i6 = SystemLibrary.fread(paramInt1 + i11, 1, i16, i25);
/*      */         
/*      */         break label8235;
/*      */         
/*      */         label8090:
/*      */         
/* 2305 */         i7 = i15 * (i7 - i6);
/* 2306 */         i26 = i15 * i6;
/* 2307 */         i8 = (i8 == 1) && (i10 > 1) ? i10 : i8;
/* 2308 */         if (i8 <= 0)
/*      */         {
/*      */ 
/*      */ 
/* 2312 */           i6 = 0;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2319 */           i6 *= i15;
/* 2320 */           i10 = 0;
/* 2321 */           i15 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 2329 */             i10 = SystemLibrary.fread(paramInt1 + (i11 + i6 * i15), 1, i26, i25) + i10;
/* 2330 */             SystemLibrary.fseek(i25, i7, 1);
/* 2331 */             i15 += 1;
/* 2332 */             if (i15 == i8) {
/* 2333 */               i6 = i10; break;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label8235:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/* 2346 */         SystemLibrary.fclose(i25);
/* 2347 */         if (i6 >= i16) {
/*      */           break label8321;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2357 */         SystemLibrary.sprintf(i1, 86496, new Object[] { Integer.valueOf(i6), Integer.valueOf(i16) });
/* 2358 */         ffxmsg.call(5, i1);
/* 2359 */         ffxmsg.call(5, j);
/* 2360 */         MainMemory.setI32(paramInt5, 104);
/*      */         
/*      */         break label8379;
/*      */         
/*      */         label8321:
/* 2365 */         iraf2mem_1554.call(i11, i9, paramInt1, i16);
/*      */         
/*      */         break label8379;
/*      */         
/*      */         label8342:
/* 2370 */         ffxmsg.call(5, 78464);
/* 2371 */         ffxmsg.call(5, j);
/* 2372 */         free.call(i5);
/* 2373 */         SystemLibrary.fclose(i25);
/* 2374 */         MainMemory.setI32(paramInt5, 104);
/*      */       }
/*      */       
/*      */ 
/*      */       label8379:
/*      */       
/* 2380 */       i = MainMemory.getI32(paramInt5);
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2386 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 2391 */       MainMemory.dealloc_generated(i27);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/iraf2mem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */