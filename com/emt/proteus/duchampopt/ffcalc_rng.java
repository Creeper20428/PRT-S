/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffcalc_rng
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3210;
/*  36 */   public static final Function _instance = new ffcalc_rng();
/*  37 */   public final Function resolve() { return _instance; }
/*     */   
/*  39 */   public ffcalc_rng() { super("ffcalc_rng", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  43 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  48 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i4 = call(i, j, k, m, n, i1, i2, i3);
/*  73 */     paramFrame.setI32(paramInt1, i4);
/*  74 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  79 */     int i = 0;
/*     */     
/*  81 */     int j = 0;
/*  82 */     int k = 0;
/*  83 */     int m = 0;
/*  84 */     int n = 0;
/*  85 */     int i1 = 0;
/*  86 */     int i2 = 0;
/*  87 */     int i3 = 0;
/*  88 */     int i4 = 0;
/*  89 */     int i5 = 0;
/*  90 */     int i6 = 0;
/*  91 */     int i7 = 0;
/*  92 */     int i8 = 0;
/*  93 */     int i9 = 0;
/*  94 */     int i10 = 0;
/*  95 */     int i11 = 0;
/*  96 */     int i12 = 0;
/*  97 */     int i13 = 0;
/*  98 */     int i14 = 0;
/*  99 */     int i15 = 0;
/* 100 */     int i16 = 0;
/* 101 */     int i17 = 0;
/* 102 */     int i18 = 0;
/* 103 */     int i19 = 0;
/* 104 */     long l = 0L;
/* 105 */     byte b = 0;
/* 106 */     int i20 = 0;
/* 107 */     int i21 = 0;
/* 108 */     int i22 = 0;
/* 109 */     int i23 = 0;
/*     */     
/*     */ 
/* 112 */     int i24 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 116 */       j = MainMemory.alloc(81);
/* 117 */       k = MainMemory.alloc(4);
/* 118 */       m = MainMemory.alloc(4);
/* 119 */       n = MainMemory.alloc(71);
/* 120 */       i1 = MainMemory.alloc(20);
/* 121 */       i2 = MainMemory.alloc(4);
/* 122 */       i3 = MainMemory.alloc(4);
/* 123 */       i4 = MainMemory.alloc(4);
/* 124 */       i5 = MainMemory.alloc(20);
/* 125 */       i6 = MainMemory.alloc(4);
/* 126 */       i7 = MainMemory.alloc(4);
/* 127 */       i8 = MainMemory.alloc(4);
/* 128 */       i9 = MainMemory.alloc(81);
/* 129 */       i10 = MainMemory.alloc(16);
/* 130 */       i11 = MainMemory.alloc(9);
/* 131 */       i12 = MainMemory.alloc(9);
/* 132 */       i13 = MainMemory.alloc(4);
/* 133 */       if (MainMemory.getI32(paramInt8) != 0) {
/*     */         break label3032;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       if (ffiprs.call(paramInt1, paramInt2, i1, i4, i2, i5, paramInt8) != 0) {
/*     */         break label3024;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       i14 = MainMemory.getI32(i4);
/* 154 */       if (i14 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 159 */         i19 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 166 */         i14 = 0 - i14;
/* 167 */         MainMemory.setI32(i4, i14);
/*     */         
/* 169 */         i19 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */       MainMemory.setI32(i8, 0);
/* 178 */       ffgcnn.call(paramInt3, 0, paramInt4, n, i8, paramInt8);
/* 179 */       switch (MainMemory.getI32(paramInt8))
/*     */       {
/*     */       case 219: 
/*     */         break label588;
/*     */         
/*     */         break;
/*     */       case 0: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 190 */       i14 = MainMemory.getI32(i8);
/* 191 */       ffkeyn.call(22336, i14, i12, paramInt8);
/* 192 */       ffgcrd.call(paramInt3, i12, i9, paramInt8);
/* 193 */       i19 = MainMemory.getI32(paramInt8);
/* 194 */       switch (i19)
/*     */       {
/*     */       case 0: 
/*     */         break label523;
/*     */         
/*     */ 
/*     */         break;
/*     */       case 202: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 206 */       MainMemory.setI32(paramInt8, 0);
/* 207 */       ffxmsg.call(1, 0);
/* 208 */       i19 = MainMemory.getI32(i2);
/* 209 */       if (i19 <= 1) {
/*     */         break label543;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */       ffptdm.call(paramInt3, i14, i19, i5, paramInt8);
/*     */       
/*     */       break label543;
/*     */       
/*     */       label523:
/* 224 */       ffptdm.call(paramInt3, i14, MainMemory.getI32(i2), i5, paramInt8);
/*     */       
/*     */ 
/*     */       label543:
/*     */       
/*     */ 
/* 230 */       i19 = MainMemory.getI32(paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */       if (i19 == 0)
/*     */       {
/* 240 */         b = 0;
/*     */         
/* 242 */         paramInt2 = paramInt4;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 252 */         ffcprs.call();
/*     */         
/*     */         break label3032;
/*     */         
/*     */         label588:
/* 257 */         MainMemory.setI32(paramInt8, 0);
/* 258 */         i15 = i19 == 0 ? 1 : 0;
/* 259 */         if (MainMemory.getI8(paramInt4) != 35) {
/*     */           break label687;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */         if (i15 == 0) {
/*     */           break label673;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */         ffcprs.call();
/* 280 */         ffxmsg.call(5, 107936);
/* 281 */         MainMemory.setI32(paramInt8, 432);
/*     */         
/*     */         break label3032;
/*     */         
/*     */         label673:
/* 286 */         paramInt2 = paramInt4 + 1;
/*     */         
/*     */         break label798;
/*     */         
/*     */         label687:
/*     */         
/* 292 */         if (i15 == 0) {
/*     */           break label726;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */         MainMemory.setI32(i8, -1);
/* 303 */         i19 = -1;
/* 304 */         paramInt2 = paramInt4;
/*     */         
/*     */         break label830;
/*     */         
/*     */         label726:
/* 309 */         if (ffgcrd.call(paramInt3, paramInt4, i9, paramInt8) != 202) {
/*     */           break label775;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */         MainMemory.setI32(i8, -1);
/* 320 */         i19 = -1;
/* 321 */         paramInt2 = paramInt4;
/*     */         
/*     */         break label830;
/*     */         
/*     */         label775:
/* 326 */         if (MainMemory.getI32(paramInt8) == 0) {
/* 327 */           paramInt2 = paramInt4;
/*     */         } else {
/*     */           break label2998;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label798:
/*     */         
/*     */ 
/*     */ 
/* 338 */         i19 = MainMemory.getI32(i8);
/* 339 */         if (i19 >= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */           i14 = i19;
/* 346 */           b = 0;
/*     */         }
/*     */         else
/*     */         {
/*     */           label830:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */           MainMemory.setI32(paramInt8, 0);
/* 358 */           i16 = MainMemory.getI32(paramInt3);
/* 359 */           i17 = paramInt3 + 4;
/* 360 */           i18 = MainMemory.getI32(i17);
/* 361 */           if (i16 != MainMemory.getI32(i18 + 64)) {
/*     */             break label935;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */           if (MainMemory.getI64(i18 + 112) != -1L) {
/*     */             break label952;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */           if (ffrdef.call(paramInt3, paramInt8) > 0) {
/*     */             break label1024;
/*     */           } else {
/*     */             break label952;
/*     */           }
/*     */           
/*     */ 
/*     */           label935:
/*     */           
/*     */ 
/* 391 */           ffmahd.call(paramInt3, i16 + 1, 0, paramInt8);
/*     */           
/*     */ 
/*     */           label952:
/*     */           
/*     */ 
/* 397 */           i18 = MainMemory.getI32(i17);
/* 398 */           if (MainMemory.getI32(i18 + 68) != 0) {
/*     */             break label1001;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */           MainMemory.setI32(paramInt8, 235);
/*     */           
/*     */           break label1024;
/*     */           
/*     */           label1001:
/*     */           
/* 414 */           i19 = MainMemory.getI32(i18 + 916);
/* 415 */           MainMemory.setI32(i8, i19);
/*     */           
/*     */ 
/*     */ 
/*     */           label1024:
/*     */           
/*     */ 
/*     */ 
/* 423 */           i19 += 1;
/* 424 */           MainMemory.setI32(i8, i19);
/* 425 */           if (paramInt5 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 435 */             b = MainMemory.getI8(paramInt5);
/* 436 */             if (b != 0) {
/*     */               break label1572;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 446 */           if (MainMemory.getI32Aligned(470848) != 2) {
/*     */             break label1366;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 456 */           paramInt4 = i10;
/* 457 */           SystemLibrary.sprintf(paramInt4, 17920, new Object[] { Integer.valueOf(i14) });
/* 458 */           switch (MainMemory.getI32(i1)) {
/*     */           case 1: 
/*     */             break label1345;
/*     */             break;
/*     */           case 14: 
/*     */             break label1324;
/*     */             break;
/*     */           case 16: 
/*     */             break label1303;
/*     */             break;
/*     */           case 41: 
/*     */             break label1282;
/*     */             break;
/*     */           case 81:  break label1261;
/*     */             break; case 82:  break; }
/* 473 */           MainMemory.setI16(paramInt4 + SystemLibrary.strlen(paramInt4), (short)68);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1261:
/* 478 */           MainMemory.setI16(paramInt4 + SystemLibrary.strlen(paramInt4), (short)75);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1282:
/* 483 */           MainMemory.setI16(paramInt4 + SystemLibrary.strlen(paramInt4), (short)74);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1303:
/* 488 */           MainMemory.setI16(paramInt4 + SystemLibrary.strlen(paramInt4), (short)65);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1324:
/* 493 */           MainMemory.setI16(paramInt4 + SystemLibrary.strlen(paramInt4), (short)76);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1345:
/* 498 */           MainMemory.setI16(paramInt4 + SystemLibrary.strlen(paramInt4), (short)88);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1366:
/* 503 */           switch (MainMemory.getI32(i1)) {
/*     */           case 1: 
/*     */             break label1533;
/*     */             break;
/*     */           case 14: 
/*     */             break label1506;
/*     */             break;
/*     */           case 16: 
/*     */             break label1533;
/*     */             break;
/*     */           case 41: 
/*     */             break label1489;
/*     */             break;
/*     */           case 82:  break; }
/* 517 */           SystemLibrary.memcpy(i10, 29280, 7, 1);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1489:
/* 522 */           MainMemory.setI32(i10, 3223881);
/*     */           
/*     */           break label1559;
/*     */           
/*     */           label1506:
/* 527 */           ffcprs.call();
/* 528 */           ffxmsg.call(5, 98912);
/* 529 */           MainMemory.setI32(paramInt8, 227);
/*     */           
/*     */           break label3032;
/*     */           
/*     */           label1533:
/* 534 */           SystemLibrary.sprintf(i10, 19552, new Object[] { Integer.valueOf(i14) });
/*     */           
/*     */ 
/*     */           label1559:
/*     */           
/*     */ 
/* 540 */           paramInt4 = i10;
/*     */           
/*     */           break label1724;
/*     */           
/*     */           label1572:
/*     */           
/* 546 */           if ((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (b << 1)) & 0xFFFF & 0x800) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 550 */             paramInt4 = paramInt5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 557 */           else if (MainMemory.getI32Aligned(470848) != 2)
/*     */           {
/*     */ 
/*     */ 
/* 561 */             paramInt4 = paramInt5;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 568 */             if ((MainMemory.getI32(i1) != 1) || (b != 66)) {
/*     */               break label1688;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 579 */             i14 = (i14 + 7) / 8;
/* 580 */             MainMemory.setI32(i4, i14);
/*     */             
/*     */ 
/*     */ 
/*     */             label1688:
/*     */             
/*     */ 
/*     */ 
/* 588 */             paramInt4 = i10;
/* 589 */             SystemLibrary.sprintf(paramInt4, 25472, new Object[] { Integer.valueOf(i14), Integer.valueOf(paramInt5) });
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1724:
/*     */           
/*     */ 
/* 597 */           MainMemory.setI32(k, paramInt2);
/* 598 */           MainMemory.setI32(m, paramInt4);
/* 599 */           fficls.call(paramInt3, i19, k, m, paramInt8);
/* 600 */           i14 = MainMemory.getI32(i2);
/* 601 */           if (i14 <= 1) {
/*     */             break label1791;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 611 */           ffptdm.call(paramInt3, i19, i14, i5, paramInt8);
/*     */           
/*     */ 
/*     */           label1791:
/*     */           
/*     */ 
/* 617 */           ffkeyn.call(27584, i19, i11, paramInt8);
/* 618 */           if (ffgcrd.call(paramInt3, i11, i9, paramInt8) != 202)
/*     */           {
/*     */ 
/*     */ 
/* 622 */             i14 = i19;
/* 623 */             b = 0;
/* 624 */             paramInt5 = paramInt4;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 632 */             MainMemory.setI32(paramInt8, 0);
/* 633 */             switch (MainMemory.getI32Aligned(470848)) {
/*     */             case 2: 
/*     */               break label1969;
/*     */               break;
/*     */             case 1:  break; default:  i14 = i19;
/* 638 */               b = 0;
/* 639 */               paramInt5 = paramInt4;
/*     */               
/* 641 */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 648 */             ffs2c.call(19264, n, 0);
/* 649 */             ffmkky.call(i11, n, 59488, j, paramInt8);
/* 650 */             ffprec.call(paramInt3, j, paramInt8);
/* 651 */             ffsnul.call(paramInt3, i19, paramInt8);
/* 652 */             i14 = i19;
/* 653 */             b = 1;
/* 654 */             paramInt5 = paramInt4;
/*     */             
/*     */             break label2167;
/*     */             
/*     */             label1969:
/*     */             
/* 660 */             ffbnfm.call(paramInt4, i3, i6, i7, paramInt8);
/* 661 */             i14 = MainMemory.getI32(i3);
/* 662 */             if (i14 == 11) {
/* 663 */               l = 255L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 673 */             else if (i14 == 21) {
/* 674 */               l = -32768L;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 684 */               switch (i14) {
/* 685 */               case 31:  l = -2147483648L;
/*     */                 break label2129;
/*     */                 break; case 41:  l = -2147483648L;
/*     */                 
/*     */ 
/*     */                 break label2129;
/*     */                 
/*     */ 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 697 */               if (i14 == 81) {
/* 698 */                 l = Long.MIN_VALUE;
/*     */               }
/*     */               else
/*     */               {
/* 702 */                 i14 = i19;
/* 703 */                 b = 0;
/* 704 */                 paramInt5 = paramInt4;
/*     */                 
/*     */ 
/*     */                 break label2167;
/*     */               }
/*     */             }
/*     */             
/*     */             label2129:
/*     */             
/* 713 */             ffpkyj.call(paramInt3, i11, l, 49984, paramInt8);
/* 714 */             fftnul.call(paramInt3, i19, l, paramInt8);
/* 715 */             i14 = i19;
/* 716 */             b = 1;
/* 717 */             paramInt5 = paramInt4;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2167:
/*     */       
/*     */ 
/*     */ 
/* 728 */       if (i14 <= 0) {
/*     */         break label2700;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 738 */       if (MainMemory.getI32(paramInt8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 748 */         MainMemory.setI8(n, (byte)0);
/* 749 */         if (ffgcrd.call(paramInt1, 35712, j, paramInt8) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 759 */           ffpsvc.call(j, n, 0, paramInt8);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 765 */         ffc2i.call(n, i13, paramInt8);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 771 */       i19 = MainMemory.getI32Aligned(470816);
/* 772 */       if (F307812.call(i19, paramInt8) != 0) {
/*     */         break label2687;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 782 */       i20 = MainMemory.getI32Aligned(470820);
/* 783 */       MainMemory.setI32(i20 + i19 * 244, paramInt3);
/* 784 */       MainMemory.setI32(i20 + i19 * 244 + 4, i14);
/* 785 */       MainMemory.setI32(i20 + i19 * 244 + 80, 0);
/* 786 */       MainMemory.setI32(i20 + i19 * 244 + 84, 2);
/* 787 */       MainMemory.setI32Aligned(470816, MainMemory.getI32Aligned(470816) + 1);
/* 788 */       k = i1 + 4;
/* 789 */       i2 = i1 + 12;
/* 790 */       paramInt2 = i1;
/* 791 */       i3 = i1 + 16;
/* 792 */       i14 = MainMemory.getI32(i13);
/* 793 */       i19 = 0;
/* 794 */       i16 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 802 */         if (i16 >= 1) {
/*     */           break label2665;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 812 */         MainMemory.setI32(k, 0);
/* 813 */         i21 = MainMemory.getI32(paramInt6 + (i16 << 2));
/* 814 */         i22 = MainMemory.getI32(paramInt7 + (i16 << 2)) - i21 + 1;
/* 815 */         MainMemory.setI32(i2, i22);
/* 816 */         if (i22 >= 10)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 826 */           if (MainMemory.getI32(paramInt6) != 1) {
/*     */             break label2536;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 836 */           if (MainMemory.getI32(paramInt7) == i14) {
/* 837 */             i22 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */             break label2541;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2536:
/*     */         
/*     */ 
/*     */ 
/*     */         label2541:
/*     */         
/*     */ 
/* 854 */         if (ffiter.call(MainMemory.getI32Aligned(470816), MainMemory.getI32Aligned(470820), i21 + -1, i22, 3202, paramInt2, paramInt8) != -1) {
/*     */           break label2599;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 864 */         MainMemory.setI32(paramInt8, 0);
/*     */         
/*     */         break label2620;
/*     */         
/*     */         label2599:
/* 869 */         if (MainMemory.getI32(paramInt8) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2620:
/*     */         
/*     */ 
/*     */ 
/* 879 */         i19 = MainMemory.getI32(i3) == 0 ? i19 : 1;
/* 880 */         i16 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 887 */       ffcprs.call();
/*     */       
/*     */       break label3032;
/*     */       
/*     */       label2665:
/* 892 */       ffcalc_rng_539.call(paramInt3, b, i11, paramInt8, i19);
/*     */       
/*     */       break label2985;
/*     */       
/*     */       label2687:
/* 897 */       ffcprs.call();
/*     */       
/*     */       break label3032;
/*     */       
/*     */       label2700:
/* 902 */       i23 = MainMemory.getI32Aligned(470792);
/* 903 */       i14 = MainMemory.getI32Aligned(470804);
/* 904 */       switch (MainMemory.getI32(i1)) {
/*     */       case 1: 
/*     */         break label2956;
/*     */         break;
/*     */       case 14: 
/*     */         break label2919;
/*     */         break;
/*     */       case 16: 
/*     */         break label2956;
/*     */         break;
/*     */       case 41: 
/*     */         break label2853;
/*     */         break;
/*     */       case 82:  break; }
/* 918 */       ffukyd.call(paramInt3, paramInt2, MainMemory.getF64(i23 + i14 * 344 + 56 + 32), paramInt5, paramInt8);
/*     */       
/*     */       break label2985;
/*     */       
/*     */       label2853:
/* 923 */       l = MainMemory.getI32(i23 + i14 * 344 + 56 + 32);
/* 924 */       i14 = MainMemory.getI32(paramInt8);
/* 925 */       if (i14 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 935 */         ffcalc_rng_540.call(l, i14, paramInt5, paramInt2, paramInt3, paramInt8);
/*     */         
/*     */         break label2985;
/*     */         
/*     */         label2919:
/* 940 */         ffukyl.call(paramInt3, paramInt2, MainMemory.getI8(i23 + i14 * 344 + 56 + 32), paramInt5, paramInt8);
/*     */         
/*     */         break label2985;
/*     */         
/*     */         label2956:
/* 945 */         ffukys.call(paramInt3, paramInt2, i23 + i14 * 344 + 56 + 32, paramInt5, paramInt8);
/*     */       }
/*     */       
/*     */ 
/*     */       label2985:
/*     */       
/* 951 */       ffcprs.call();
/*     */       
/*     */       break label3032;
/*     */       
/*     */       label2998:
/* 956 */       ffcprs.call();
/*     */       
/*     */ 
/*     */       break label3032;
/*     */       
/* 961 */       ffcprs.call();
/*     */       
/*     */       break label3032;
/*     */       
/*     */       label3024:
/* 966 */       ffcprs.call();
/*     */       
/*     */ 
/*     */       label3032:
/*     */       
/*     */ 
/* 972 */       i = MainMemory.getI32(paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 978 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 983 */       MainMemory.dealloc_generated(i24);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcalc_rng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */