/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
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
/*      */ public final class ffgphd
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3410;
/*   28 */   public static final Function _instance = new ffgphd();
/*   29 */   public final Function resolve() { return _instance; }
/*      */   
/*   31 */   public ffgphd() { super("ffgphd", 13, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/*   35 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13);
/*   36 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   41 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   42 */     paramInt4 += 2;
/*   43 */     paramInt3--;
/*   44 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   45 */     paramInt4 += 2;
/*   46 */     paramInt3--;
/*   47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   48 */     paramInt4 += 2;
/*   49 */     paramInt3--;
/*   50 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   51 */     paramInt4 += 2;
/*   52 */     paramInt3--;
/*   53 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   54 */     paramInt4 += 2;
/*   55 */     paramInt3--;
/*   56 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   57 */     paramInt4 += 2;
/*   58 */     paramInt3--;
/*   59 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   60 */     paramInt4 += 2;
/*   61 */     paramInt3--;
/*   62 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   63 */     paramInt4 += 2;
/*   64 */     paramInt3--;
/*   65 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   66 */     paramInt4 += 2;
/*   67 */     paramInt3--;
/*   68 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   69 */     paramInt4 += 2;
/*   70 */     paramInt3--;
/*   71 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   72 */     paramInt4 += 2;
/*   73 */     paramInt3--;
/*   74 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   75 */     paramInt4 += 2;
/*   76 */     paramInt3--;
/*   77 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   78 */     paramInt4 += 2;
/*   79 */     paramInt3--;
/*   80 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8);
/*   81 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*      */   {
/*   87 */     int i = 0;
/*   88 */     int j = 0;
/*   89 */     int k = 0;
/*   90 */     int m = 0;
/*   91 */     int n = 0;
/*   92 */     int i1 = 0;
/*   93 */     int i2 = 0;
/*   94 */     int i3 = 0;
/*   95 */     int i4 = 0;
/*   96 */     int i5 = 0;
/*   97 */     int i6 = 0;
/*   98 */     int i7 = 0;
/*   99 */     int i8 = 0;
/*  100 */     int i9 = 0;
/*  101 */     int i10 = 0;
/*  102 */     int i11 = 0;
/*  103 */     int i12 = 0;
/*  104 */     int i13 = 0;
/*  105 */     int i14 = 0;
/*  106 */     int i15 = 0;
/*  107 */     int i16 = 0;
/*  108 */     int i17 = 0;
/*  109 */     int i18 = 0;
/*  110 */     int i19 = 0;
/*  111 */     int i20 = 0;
/*  112 */     int i21 = 0;
/*  113 */     int i22 = 0;
/*  114 */     int i23 = 0;
/*      */     
/*      */ 
/*  117 */     int i24 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  121 */       i = MainMemory.alloc(4);
/*  122 */       j = MainMemory.alloc(4);
/*  123 */       k = MainMemory.alloc(4);
/*  124 */       m = MainMemory.alloc(8);
/*  125 */       n = MainMemory.alloc(81);
/*  126 */       i1 = MainMemory.alloc(72);
/*  127 */       i2 = MainMemory.alloc(81);
/*  128 */       i3 = MainMemory.alloc(72);
/*  129 */       i4 = MainMemory.alloc(71);
/*  130 */       i5 = MainMemory.alloc(73);
/*  131 */       i6 = MainMemory.alloc(71);
/*  132 */       if (MainMemory.getI32(paramInt13) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  142 */         i9 = MainMemory.getI32(paramInt1);
/*  143 */         i7 = paramInt1 + 4;
/*  144 */         if (i9 != MainMemory.getI32(MainMemory.getI32(i7) + 64))
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  154 */           ffmahd.call(paramInt1, i9 + 1, 0, paramInt13);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  160 */         i11 = paramInt2 == 0 ? 1 : 0;
/*  161 */         if (i11 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  171 */           MainMemory.setI32(paramInt2, 1);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  177 */         ffgkyn.call(paramInt1, 1, i3, i4, i5, paramInt13);
/*  178 */         if (MainMemory.getI32(MainMemory.getI32(i7) + 64) != 0) {
/*      */           break label489;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  188 */         if (SystemLibrary.strcmp(i3, 36032) != 0) {
/*      */           break label445;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  198 */         switch (MainMemory.getI8(i4)) {
/*      */         case 70: 
/*      */           break;
/*  201 */         case 84:  i9 = 0;
/*      */           
/*      */ 
/*      */           break label686;
/*      */           
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  210 */         if (i11 != 0) {
/*  211 */           i9 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  221 */           MainMemory.setI32(paramInt2, 0);
/*  222 */           i9 = 0;
/*      */           
/*      */ 
/*      */           break label686;
/*      */           
/*  227 */           MainMemory.setI32(paramInt13, 220);
/*      */           
/*      */ 
/*      */           break label3184;
/*      */           
/*      */           label445:
/*      */           
/*  234 */           SystemLibrary.sprintf(n, 99360, new Object[] { Integer.valueOf(i3) });
/*  235 */           ffxmsg.call(5, n);
/*  236 */           MainMemory.setI32(paramInt13, 221);
/*      */           
/*      */ 
/*      */           break label3184;
/*      */           
/*      */           label489:
/*      */           
/*  243 */           if (SystemLibrary.strcmp(i3, 45664) != 0) {
/*      */             break label3145;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  253 */           if (ffc2s.call(i4, i6, paramInt13) <= 0) {
/*      */             break label559;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  263 */           ffxmsg.call(5, 89952);
/*  264 */           ffxmsg.call(5, i4);
/*      */           
/*      */ 
/*      */           break label3184;
/*      */           
/*      */           label559:
/*      */           
/*  271 */           if (MainMemory.getI8(i4) != 39) {
/*      */             break label629;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  281 */           if (SystemLibrary.strcmp(i6, 26848) == 0) {
/*  282 */             i9 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*  292 */           else if (SystemLibrary.strcmp(i6, 44192) == 0) {
/*  293 */             i9 = 0;
/*      */           }
/*      */           else
/*      */           {
/*      */             label629:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  303 */             SystemLibrary.sprintf(n, 82336, new Object[] { Integer.valueOf(i4) });
/*  304 */             ffxmsg.call(5, n);
/*  305 */             if (MainMemory.getI32(MainMemory.getI32(i7) + 1012) == 0) {
/*  306 */               i9 = 1;
/*      */             } else {
/*      */               break label1431;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */         label686:
/*      */         
/*      */ 
/*  317 */         ffgkyn.call(paramInt1, 2, i3, i4, i5, paramInt13);
/*  318 */         if (SystemLibrary.strcmp(i3, 28224) != 0) {
/*      */           break label1387;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  328 */         if (ffc2ii.call(i4, j, paramInt13) <= 0) {
/*      */           break label793;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  338 */         SystemLibrary.sprintf(n, 104096, new Object[] { Integer.valueOf(i4) });
/*  339 */         ffxmsg.call(5, n);
/*  340 */         MainMemory.setI32(paramInt13, 211);
/*      */         
/*      */ 
/*      */         break label3184;
/*      */         
/*      */         label793:
/*      */         
/*  347 */         i10 = MainMemory.getI32(j);
/*  348 */         switch (i10)
/*      */         {
/*      */         case 8: 
/*      */           break;
/*      */         case 16: 
/*      */           break;
/*      */         case 32: 
/*      */           break;
/*      */         case 64: 
/*      */           break;
/*      */         case -32: 
/*      */           break;
/*      */         case -64: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  368 */         if (paramInt3 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  378 */           MainMemory.setI32(paramInt3, i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  384 */         ffgtkn.call(paramInt1, 3, 24224, k, paramInt13);
/*  385 */         switch (MainMemory.getI32(paramInt13))
/*      */         {
/*      */         case 208: 
/*      */           break label993;
/*      */           
/*      */           break;
/*      */         case 209: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  396 */         i9 = MainMemory.getI32(k);
/*      */         
/*      */         break label1043;
/*      */         
/*      */         label993:
/*      */         
/*  402 */         MainMemory.setI32(paramInt13, 223);
/*      */         
/*      */ 
/*      */ 
/*      */         break label3184;
/*      */         
/*      */ 
/*  409 */         i10 = MainMemory.getI32(k);
/*  410 */         if (i10 > 999) {
/*  411 */           i9 = i10;
/*      */         } else {
/*      */           break label1087;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1043:
/*      */         
/*      */ 
/*      */ 
/*  422 */         SystemLibrary.sprintf(n, 66304, new Object[] { Integer.valueOf(i9) });
/*  423 */         ffxmsg.call(5, n);
/*  424 */         MainMemory.setI32(paramInt13, 212);
/*      */         
/*      */ 
/*      */         break label3184;
/*      */         
/*      */         label1087:
/*      */         
/*  431 */         if (paramInt4 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  441 */           MainMemory.setI32(paramInt4, i10);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  447 */         i11 = paramInt5 == 0 ? 1 : 0;
/*  448 */         i22 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  455 */           i17 = i22 + 4;
/*  456 */           i8 = paramInt5 + (i22 << 3);
/*  457 */           if (i22 >= i10)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  462 */             i10 = i17;
/*  463 */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  469 */           i23 = i22 + 1;
/*  470 */           ffkeyn.call(24224, i23, i1, paramInt13);
/*  471 */           ffgtknjj.call(paramInt1, i17, i1, m, paramInt13);
/*  472 */           switch (MainMemory.getI32(paramInt13))
/*      */           {
/*      */           case 208: 
/*      */             break label1274;
/*      */             
/*      */             break;
/*      */           case 209: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  483 */           MainMemory.setI32(paramInt13, 213);
/*      */           
/*      */ 
/*      */           break label3184;
/*      */           
/*      */           label1274:
/*      */           
/*  490 */           MainMemory.setI32(paramInt13, 224);
/*      */           
/*      */ 
/*      */ 
/*      */           break label3184;
/*      */           
/*      */ 
/*  497 */           if ((i22 > 998) || (i11 != 0)) {
/*  498 */             i22 = i23;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  508 */             MainMemory.setI64(i8, MainMemory.getI64(m));
/*  509 */             i22 = i23;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  514 */         SystemLibrary.sprintf(n, 86304, new Object[] { Integer.valueOf(i4) });
/*  515 */         ffxmsg.call(5, n);
/*  516 */         MainMemory.setI32(paramInt13, 211);
/*      */         
/*      */ 
/*      */         break label3184;
/*      */         
/*      */         label1387:
/*      */         
/*  523 */         SystemLibrary.sprintf(n, 113632, new Object[] { Integer.valueOf(i3) });
/*  524 */         ffxmsg.call(5, n);
/*  525 */         MainMemory.setI32(paramInt13, 222);
/*      */         
/*      */ 
/*      */         break label3184;
/*      */         
/*      */         label1431:
/*      */         
/*  532 */         ffxmsg.call(3, n);
/*  533 */         if (paramInt3 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  543 */           ffgidt.call(paramInt1, paramInt3, paramInt13);
/*  544 */           if (MainMemory.getI32(paramInt13) <= 0) {
/*      */             break label1495;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  554 */           ffxmsg.call(5, 106336);
/*      */           
/*      */           break label3184;
/*      */         }
/*      */         
/*      */         label1495:
/*      */         
/*  561 */         if (paramInt4 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  571 */           ffgidm.call(paramInt1, paramInt4, paramInt13);
/*  572 */           if (MainMemory.getI32(paramInt13) <= 0) {
/*      */             break label1554;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  582 */           ffxmsg.call(5, 104032);
/*      */           
/*      */           break label3184;
/*      */         }
/*      */         
/*      */         label1554:
/*      */         
/*  589 */         if (paramInt5 == 0) {
/*  590 */           i9 = 0;
/*  591 */           i10 = 9;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  601 */           ffgiszll.call(paramInt1, 999, paramInt5, paramInt13);
/*  602 */           if (MainMemory.getI32(paramInt13) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*  606 */             i9 = 0;
/*  607 */             i10 = 9;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  614 */             ffxmsg.call(5, 108768);
/*      */             
/*      */ 
/*      */ 
/*      */             break label3184;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*  623 */         i11 = paramInt9 == 0 ? 1 : 0;
/*  624 */         if (i11 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  634 */           MainMemory.setF64(paramInt9, 1.0D);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  640 */         i12 = paramInt10 == 0 ? 1 : 0;
/*  641 */         if (i12 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  651 */           MainMemory.setF64(paramInt10, 0.0D);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  657 */         i13 = paramInt6 == 0 ? 1 : 0;
/*  658 */         if (i13 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  668 */           MainMemory.setI32(paramInt6, 0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  674 */         i14 = paramInt7 == 0 ? 1 : 0;
/*  675 */         if (i14 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  685 */           MainMemory.setI32(paramInt7, 1);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  691 */         i15 = paramInt8 == 0 ? 1 : 0;
/*  692 */         if (i15 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  702 */           MainMemory.setI32(paramInt8, 0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  708 */         i16 = paramInt11 == 0 ? 1 : 0;
/*  709 */         if (i16 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  719 */           MainMemory.setI64(paramInt11, 1234554321L);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  725 */         MainMemory.setI32(paramInt12, 0);
/*  726 */         i17 = MainMemory.getI32(paramInt13);
/*  727 */         i18 = i3 + 1;
/*  728 */         i19 = i3 + 2;
/*  729 */         i20 = i3 + 3;
/*  730 */         i22 = 0;
/*  731 */         i23 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  739 */           i21 = i10 + i22;
/*  740 */           if (i23 != 0) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  750 */           if (ffgrec.call(paramInt1, i21, i2, paramInt13) <= 0) {
/*      */             break label2018;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  760 */           if (MainMemory.getI32(paramInt13) != 203) {
/*      */             break label2002;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  770 */           MainMemory.setI32(paramInt13, i17);
/*  771 */           i21 = i17;
/*  772 */           i23 = 1;
/*      */           
/*      */           break label3006;
/*      */           
/*      */           label2002:
/*  777 */           ffxmsg.call(5, 115168);
/*      */           
/*      */           break label2994;
/*      */           
/*      */           label2018:
/*      */           
/*  783 */           ffgknm.call(i2, i3, i);
/*  784 */           if (fftrec.call(i3, paramInt13) <= 0) {
/*      */             break label2064;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  794 */           ffgphd_1056.call(i3, n, i21);
/*      */           
/*      */ 
/*      */           label2064:
/*      */           
/*      */ 
/*  800 */           if ((SystemLibrary.strcmp(i3, 28256) == 0) && (i11 == 0)) {
/*      */             break label2907;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  810 */           if ((SystemLibrary.strcmp(i3, 24096) == 0) && (i12 == 0)) {
/*      */             break label2815;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  820 */           if ((SystemLibrary.strcmp(i3, 23520) == 0) && (i16 == 0)) {
/*      */             break label2721;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  830 */           if ((SystemLibrary.strcmp(i3, 34560) == 0) && (i13 == 0)) {
/*      */             break label2642;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  840 */           if ((SystemLibrary.strcmp(i3, 34592) == 0) && (i14 == 0)) {
/*      */             break label2563;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  850 */           if ((SystemLibrary.strcmp(i3, 34624) == 0) && (i15 == 0)) {
/*      */             break label2424;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  860 */           i21 = (MainMemory.getI8(i3) & 0xFF) + -69;
/*  861 */           if (i21 != 0) {
/*      */             break label2347;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  872 */           i21 = (MainMemory.getI8(i18) & 0xFF) + -78;
/*  873 */           if (i21 != 0) {
/*      */             break label2347;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  884 */           i21 = (MainMemory.getI8(i19) & 0xFF) + -68;
/*  885 */           if (i21 != 0) {
/*      */             break label2347;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  896 */           i21 = MainMemory.getI8(i20) & 0xFF;
/*      */           
/*      */ 
/*      */ 
/*      */           label2347:
/*      */           
/*      */ 
/*      */ 
/*  904 */           if (i21 == 0) {
/*  905 */             i23 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  915 */             if (MainMemory.getI8(i2) != 0) {
/*      */               break label2408;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  925 */             MainMemory.setI32(paramInt12, MainMemory.getI32(paramInt12) + 1);
/*      */             
/*      */             break label2994;
/*      */             
/*      */             label2408:
/*      */             
/*  931 */             MainMemory.setI32(paramInt12, 0);
/*      */             
/*      */             break label2994;
/*      */             
/*      */             label2424:
/*      */             
/*  937 */             MainMemory.setI32(paramInt12, 0);
/*  938 */             ffpsvc.call(i2, i4, i5, paramInt13);
/*  939 */             i21 = MainMemory.getI32(paramInt13);
/*  940 */             if (i21 <= 0)
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
/*  951 */               MainMemory.setI32(paramInt8, MainMemory.getI8(i4) == 84 ? 1 : 0);
/*  952 */               i21 = MainMemory.getI32(paramInt13);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  960 */             if (i21 <= 0) {
/*      */               break label2994;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  971 */             MainMemory.setI32(paramInt13, i17);
/*  972 */             MainMemory.setI32(paramInt8, 0);
/*  973 */             SystemLibrary.sprintf(n, 117024, new Object[] { Integer.valueOf(i4) });
/*  974 */             ffxmsg.call(5, n);
/*      */             
/*      */             break label2994;
/*      */             
/*      */             label2563:
/*      */             
/*  980 */             MainMemory.setI32(paramInt12, 0);
/*  981 */             ffpsvc.call(i2, i4, i5, paramInt13);
/*  982 */             if (ffc2ii.call(i4, paramInt7, paramInt13) <= 0) {
/*      */               break label2994;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  993 */             SystemLibrary.sprintf(n, 118752, new Object[] { Integer.valueOf(i4) });
/*  994 */             ffxmsg.call(5, n);
/*      */             
/*      */             break label2994;
/*      */             
/*      */             label2642:
/*      */             
/* 1000 */             MainMemory.setI32(paramInt12, 0);
/* 1001 */             ffpsvc.call(i2, i4, i5, paramInt13);
/* 1002 */             if (ffc2ii.call(i4, paramInt6, paramInt13) <= 0) {
/*      */               break label2994;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1013 */             SystemLibrary.sprintf(n, 118688, new Object[] { Integer.valueOf(i4) });
/* 1014 */             ffxmsg.call(5, n);
/*      */             
/*      */             break label2994;
/*      */             
/*      */             label2721:
/*      */             
/* 1020 */             MainMemory.setI32(paramInt12, 0);
/* 1021 */             ffpsvc.call(i2, i4, i5, paramInt13);
/* 1022 */             if (ffc2jj.call(i4, paramInt11, paramInt13) <= 0) {
/*      */               break label2994;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1033 */             MainMemory.setI32(paramInt13, i17);
/* 1034 */             MainMemory.setI64(paramInt11, 1234554321L);
/* 1035 */             SystemLibrary.sprintf(n, 116960, new Object[] { Integer.valueOf(i4) });
/* 1036 */             ffxmsg.call(5, n);
/*      */             
/*      */             break label2994;
/*      */             
/*      */             label2815:
/*      */             
/* 1042 */             MainMemory.setI32(paramInt12, 0);
/* 1043 */             ffpsvc.call(i2, i4, i5, paramInt13);
/* 1044 */             if (ffc2dd.call(i4, paramInt10, paramInt13) <= 0) {
/*      */               break label2994;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1055 */             MainMemory.setI32(paramInt13, i17);
/* 1056 */             MainMemory.setF64(paramInt10, 0.0D);
/* 1057 */             SystemLibrary.sprintf(n, 113696, new Object[] { Integer.valueOf(i4) });
/* 1058 */             ffxmsg.call(5, n);
/*      */             
/*      */             break label2994;
/*      */             
/*      */             label2907:
/*      */             
/* 1064 */             MainMemory.setI32(paramInt12, 0);
/* 1065 */             ffpsvc.call(i2, i4, i5, paramInt13);
/* 1066 */             if (ffc2dd.call(i4, paramInt9, paramInt13) <= 0) {
/*      */               break label2994;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1077 */             MainMemory.setI32(paramInt13, i17);
/* 1078 */             MainMemory.setF64(paramInt9, 1.0D);
/* 1079 */             SystemLibrary.sprintf(n, 115232, new Object[] { Integer.valueOf(i4) });
/* 1080 */             ffxmsg.call(5, n);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label2994:
/*      */           
/*      */ 
/* 1088 */           i21 = MainMemory.getI32(paramInt13);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label3006:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/* 1098 */           if (i21 <= 0) {
/*      */             break label3083;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1108 */           if (MainMemory.getI32(MainMemory.getI32(i7) + 64) != 0) {
/*      */             break label3067;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1118 */           ffxmsg.call(5, 128992);
/*      */           
/*      */ 
/*      */           break label3184;
/*      */           
/*      */           label3067:
/*      */           
/* 1125 */           ffxmsg.call(5, 130848);
/*      */           
/*      */ 
/*      */           break label3184;
/*      */           
/*      */           label3083:
/*      */           
/* 1132 */           i22 += 1;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1139 */         if (i9 != 0) {
/*      */           break label3127;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label3184;
/*      */       
/*      */ 
/*      */ 
/*      */       label3127:
/*      */       
/*      */ 
/*      */ 
/* 1155 */       MainMemory.setI32(paramInt13, 233);
/*      */       
/*      */ 
/*      */       break label3184;
/*      */       
/*      */       label3145:
/*      */       
/* 1162 */       SystemLibrary.sprintf(n, 115104, new Object[] { Integer.valueOf(i3) });
/* 1163 */       ffxmsg.call(5, n);
/* 1164 */       MainMemory.setI32(paramInt13, 225);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label3184:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1175 */       MainMemory.dealloc_generated(i24);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgphd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */