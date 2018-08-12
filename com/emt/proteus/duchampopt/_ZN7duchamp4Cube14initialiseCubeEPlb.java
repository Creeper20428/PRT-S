/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube14initialiseCubeEPlb extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1358;
/*  24 */   public static final Function _instance = new _ZN7duchamp4Cube14initialiseCubeEPlb();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp4Cube14initialiseCubeEPlb() { super("_ZN7duchamp4Cube14initialiseCubeEPlb", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/*  31 */     return call(paramInt1, paramInt2, paramByte);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int k = call(i, j, b);
/*  46 */     paramFrame.setI32(paramInt1, k);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, byte paramByte)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     int i10 = 0;
/*  68 */     int i11 = 0;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*  72 */     int i15 = 0;
/*  73 */     int i16 = 0;
/*  74 */     int i17 = 0;
/*  75 */     int i18 = 0;
/*  76 */     int i19 = 0;
/*  77 */     int i20 = 0;
/*  78 */     int i21 = 0;
/*  79 */     int i22 = 0;
/*  80 */     int i23 = 0;
/*  81 */     int i24 = 0;
/*  82 */     int i25 = 0;
/*  83 */     int i26 = 0;
/*  84 */     int i27 = 0;
/*  85 */     int i28 = 0;
/*  86 */     int i29 = 0;
/*  87 */     int i30 = 0;
/*  88 */     int i31 = 0;
/*  89 */     int i32 = 0;
/*  90 */     int i33 = 0;
/*  91 */     int i34 = 0;
/*  92 */     int i35 = 0;
/*  93 */     int i36 = 0;
/*  94 */     int i37 = 0;
/*     */     
/*     */ 
/*  97 */     int i38 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 101 */       j = MainMemory.alloc(1);
/* 102 */       k = MainMemory.alloc(4);
/* 103 */       m = MainMemory.alloc(4);
/* 104 */       n = MainMemory.alloc(1);
/* 105 */       i1 = MainMemory.alloc(4);
/* 106 */       i2 = MainMemory.alloc(1);
/* 107 */       i3 = MainMemory.alloc(4);
/* 108 */       i4 = MainMemory.alloc(4);
/* 109 */       i5 = MainMemory.alloc(1);
/* 110 */       i6 = MainMemory.alloc(4);
/* 111 */       i7 = MainMemory.alloc(1);
/* 112 */       i8 = MainMemory.alloc(4);
/* 113 */       i9 = MainMemory.alloc(4);
/* 114 */       i10 = MainMemory.alloc(1);
/* 115 */       i11 = MainMemory.alloc(4);
/* 116 */       i12 = MainMemory.alloc(1);
/* 117 */       i13 = MainMemory.alloc(4);
/* 118 */       i14 = MainMemory.alloc(188);
/* 119 */       i15 = paramInt1 + 652;
/* 120 */       i16 = MainMemory.getI32(i15);
/* 121 */       if (MainMemory.getI32(i16) == -1) {
/* 122 */         i24 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 132 */         i24 = MainMemory.getI32(i16 + 4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       i24 = i24 < 1 ? 3 : i24;
/* 141 */       if ((MainMemory.getI8(paramInt1 + 660) == 0) || (i24 < 3)) {
/* 142 */         i21 = 0;
/* 143 */         i17 = 1;
/* 144 */         i18 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 154 */         i25 = MainMemory.getI32(i16 + 752);
/* 155 */         if (i25 < 0) {
/* 156 */           i21 = 0;
/* 157 */           i17 = 1;
/* 158 */           i18 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 168 */           i17 = MainMemory.getI32(i16 + 744);
/* 169 */           i18 = MainMemory.getI32(i16 + 748);
/* 170 */           i21 = i17;
/* 171 */           i17 = i18;
/* 172 */           i18 = i25;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */       i19 = paramInt2 + (i21 << 2);
/* 182 */       i25 = MainMemory.getI32(i19);
/* 183 */       i20 = i24 > 1 ? 1 : 0;
/* 184 */       if (i20 == 0)
/*     */       {
/*     */ 
/*     */ 
/* 188 */         i21 = i25;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 195 */         i21 = MainMemory.getI32(paramInt2 + (i17 << 2)) * i25;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */       if (MainMemory.getI32(i16 + 752) > -1) {
/* 204 */         i22 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 214 */         i23 = MainMemory.getI32(i16 + 4) > 2 ? 1 : 0;
/* 215 */         i22 = i23;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */       i23 = i24 > i18 ? 1 : 0;
/* 223 */       if ((i22 == 0) || (i23 == 0))
/*     */       {
/*     */ 
/*     */ 
/* 227 */         i24 = i21;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 234 */         i24 = MainMemory.getI32(paramInt2 + (i18 << 2)) * i21;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       if (i20 == 0) {
/*     */         break label633;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 253 */       i25 = MainMemory.getI32(paramInt2 + (i17 << 2)) * i25;
/*     */       
/*     */ 
/*     */ 
/*     */       label633:
/*     */       
/*     */ 
/*     */ 
/* 261 */       i26 = paramInt1 + 644;
/* 262 */       MainMemory.setI8(i26, (byte)0);
/* 263 */       i27 = paramInt1 + 645;
/* 264 */       MainMemory.setI8(i27, (byte)0);
/* 265 */       i28 = paramInt1 + 12;
/* 266 */       if (MainMemory.getI8(i28) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */         i29 = MainMemory.getI32(paramInt1 + 8);
/* 277 */         if (i29 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */           SystemLibrary.deletearray(i29);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 293 */         MainMemory.setI8(i28, (byte)0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 299 */       i30 = paramInt1 + 24;
/* 300 */       if (MainMemory.getI8(i30) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */         i31 = MainMemory.getI32(paramInt1 + 20);
/* 311 */         if (i31 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */           SystemLibrary.deletearray(i31);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 327 */         i32 = MainMemory.getI32(paramInt1 + 636);
/* 328 */         if (i32 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */           SystemLibrary.deletearray(i32);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 344 */         MainMemory.setI8(i30, (byte)0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 350 */       if (MainMemory.getI8(i26) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */         i31 = MainMemory.getI32(paramInt1 + 628);
/* 361 */         if (i31 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */           SystemLibrary.deletearray(i31);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 377 */         MainMemory.setI8(i26, (byte)0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 383 */       if (MainMemory.getI8(i27) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */         i31 = MainMemory.getI32(paramInt1 + 640);
/* 394 */         if (i31 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */           SystemLibrary.deletearray(i31);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 410 */         MainMemory.setI8(i27, (byte)0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 416 */       if ((i25 | i24) >= 0) {
/*     */         break label1048;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */       _ZNSaIcEC1Ev.call(i12);
/* 427 */       _ZNSsC1EPKcRKSaIcE.call(i13, 92832, i12);
/* 428 */       _ZNSaIcEC1Ev.call(i10);
/* 429 */       _ZNSsC1EPKcRKSaIcE.call(i11, 76224, i10);
/* 430 */       _ZN7duchamp12duchampErrorESsSs.call(i11, i13);
/* 431 */       _ZNSsD1Ev.call(i11);
/* 432 */       _ZNSaIcED1Ev.call(i10);
/* 433 */       _ZNSsD1Ev.call(i13);
/* 434 */       _ZNSaIcED1Ev.call(i12);
/* 435 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1991;
/*     */       
/*     */       label1048:
/*     */       
/* 442 */       MainMemory.setI32(paramInt1 + 16, i24);
/* 443 */       MainMemory.setI16(paramInt1 + 4, (short)3);
/* 444 */       i29 = SystemLibrary.newarray(12);
/* 445 */       i33 = paramInt1 + 8;
/* 446 */       MainMemory.setI32(i33, i29);
/* 447 */       MainMemory.setI8(i28, (byte)1);
/* 448 */       MainMemory.setI32(i29, MainMemory.getI32(i19));
/* 449 */       i19 = MainMemory.getI32(i33);
/* 450 */       if (i20 == 0) {
/*     */         break label1151;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */       MainMemory.setI32(i19 + 4, MainMemory.getI32(paramInt2 + (i17 << 2)));
/*     */       
/*     */       break label1164;
/*     */       
/*     */       label1151:
/* 465 */       MainMemory.setI32(i19 + 4, 1);
/*     */       
/*     */ 
/*     */       label1164:
/*     */       
/*     */ 
/* 471 */       i16 = MainMemory.getI32(i15);
/* 472 */       if (MainMemory.getI32(i16 + 752) > -1) {
/* 473 */         i20 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 483 */         i20 = MainMemory.getI32(i16 + 4) > 2 ? 1 : 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 491 */       i19 = MainMemory.getI32(i33);
/* 492 */       if ((i20 == 0) || (i23 == 0)) {
/*     */         break label1277;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */       MainMemory.setI32(i19 + 8, MainMemory.getI32(paramInt2 + (i18 << 2)));
/*     */       
/*     */       break label1291;
/*     */       
/*     */       label1277:
/* 507 */       MainMemory.setI32(i19 + 8, 1);
/*     */       
/*     */ 
/*     */       label1291:
/*     */       
/*     */ 
/* 513 */       paramInt2 = MainMemory.getI32(i33);
/* 514 */       i18 = (MainMemory.getI32(paramInt2 + 8) > 1 ? 1 : 0) + ((MainMemory.getI32(paramInt2 + 4) > 1 ? 1 : 0) + (MainMemory.getI32(paramInt2) > 1 ? 1 : 0));
/* 515 */       i28 = paramInt1 + 453;
/* 516 */       if (MainMemory.getI8(i28) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 526 */         i11 = paramInt1 + 456;
/* 527 */         _ZNSsC1ERKSs.call(i9, i11);
/* 528 */         i20 = (_ZNKSs7compareEPKc.call(i9, 43360) == 0) && (i18 == 2) ? 1 : 0;
/* 529 */         _ZNSsD1Ev.call(i9);
/* 530 */         if (i20 == 0) {
/*     */           break label1496;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 540 */         _ZNSaIcEC1Ev.call(i7);
/* 541 */         _ZNSsC1EPKcRKSaIcE.call(i8, 142080, i7);
/* 542 */         _ZNSaIcEC1Ev.call(i5);
/* 543 */         _ZNSsC1EPKcRKSaIcE.call(i6, 63328, i5);
/* 544 */         _ZN7duchamp14duchampWarningESsSs.call(i6, i8);
/* 545 */         _ZNSsD1Ev.call(i6);
/* 546 */         _ZNSaIcED1Ev.call(i5);
/* 547 */         _ZNSsD1Ev.call(i8);
/* 548 */         _ZNSaIcED1Ev.call(i7);
/* 549 */         MainMemory.setI8(i28, (byte)0);
/*     */         
/*     */ 
/*     */         label1496:
/*     */         
/*     */ 
/* 555 */         _ZN7duchamp4Cube14initialiseCubeEPlb_260.call(i3, i4, i2, n, i1, i11, i28, i18);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 561 */       i34 = paramInt1 + 476;
/* 562 */       if (MainMemory.getI8(i34) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */         paramInt2 = paramInt1 + 480;
/* 573 */         i35 = i14 + 8;
/* 574 */         i17 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 581 */           i21 = 2 - i17;
/* 582 */           i36 = 3 - i17;
/* 583 */           if (i36 <= 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 593 */           if ((MainMemory.getI32(paramInt2) != i36) || (i21 != i18)) {
/*     */             break label1714;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 603 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i14, 24);
/* 604 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(i35, i36), 94496), i21), 71872);
/* 605 */           _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(m, i14);
/* 606 */           _ZNSaIcEC1Ev.call(j);
/* 607 */           _ZNSsC1EPKcRKSaIcE.call(k, 63328, j);
/* 608 */           _ZN7duchamp14duchampWarningESsSs.call(k, m);
/* 609 */           _ZNSsD1Ev.call(k);
/* 610 */           _ZNSaIcED1Ev.call(j);
/* 611 */           _ZNSsD1Ev.call(m);
/* 612 */           MainMemory.setI8(i34, (byte)0);
/* 613 */           _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i14);
/*     */           
/*     */ 
/*     */           label1714:
/*     */           
/*     */ 
/* 619 */           i17 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 625 */       i20 = paramByte == 0 ? 1 : 0;
/* 626 */       if (i20 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 636 */         _ZN7duchamp4Cube14initialiseCubeEPlb_259.call(paramByte, paramInt1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 642 */       MainMemory.setI8(paramInt1 + 632, (byte)0);
/* 643 */       if ((i24 < 1) || (i20 == 0))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */         i18 = i24 << 2;
/* 654 */         MainMemory.setI32(paramInt1 + 20, SystemLibrary.newarray(i18));
/* 655 */         MainMemory.setI8(i30, (byte)1);
/* 656 */         i32 = SystemLibrary.newarray(i25 << 1);
/* 657 */         i37 = paramInt1 + 636;
/* 658 */         MainMemory.setI32(i37, i32);
/* 659 */         if (i25 > 0)
/*     */         {
/* 661 */           i17 = 0;
/*     */         } else {
/*     */           break label1915;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 673 */           MainMemory.setI16(i32 + (i17 << 1), (short)0);
/* 674 */           i17 += 1;
/* 675 */           if (i17 == i25) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 685 */           i32 = MainMemory.getI32(i37);
/*     */         }
/*     */         
/*     */ 
/*     */         label1915:
/*     */         
/*     */ 
/* 692 */         if (MainMemory.getI8(i34) != 0) {
/*     */           break label1954;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 702 */         if (MainMemory.getI8(i28) != 0) {
/*     */           label1954:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 712 */           _ZN7duchamp4Cube14initialiseCubeEPlb_258.call(paramInt1, i24, i26, i18);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 718 */         _ZN7duchamp4Cube14initialiseCubeEPlb_257.call(paramInt1, i24, i27, i18);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 724 */       i = 0;
/*     */       
/*     */ 
/*     */       label1991:
/*     */       
/*     */ 
/* 730 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 735 */       MainMemory.dealloc_generated(i38);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14initialiseCubeEPlb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */