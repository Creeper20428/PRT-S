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
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class F293294
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3181;
/*   19 */   public static final Function _instance = new F293294();
/*   20 */   public final Function resolve() { return _instance; }
/*      */   
/*   22 */   public F293294() { super("F293294", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   26 */     call(paramInt);
/*   27 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   33 */     paramInt4 += 2;
/*   34 */     paramInt3--;
/*   35 */     call(i);
/*   36 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt)
/*      */   {
/*   42 */     int i = 0;
/*   43 */     int j = 0;
/*   44 */     int k = 0;
/*   45 */     int m = 0;
/*   46 */     int n = 0;
/*   47 */     int i1 = 0;
/*   48 */     int i2 = 0;
/*   49 */     int i3 = 0;
/*   50 */     int i4 = 0;
/*   51 */     int i5 = 0;
/*   52 */     int i6 = 0;
/*   53 */     int i7 = 0;
/*   54 */     int i8 = 0;
/*   55 */     int i9 = 0;
/*   56 */     int i10 = 0;
/*   57 */     int i11 = 0;
/*   58 */     int i12 = 0;
/*   59 */     int i13 = 0;
/*   60 */     int i14 = 0;
/*   61 */     int i15 = 0;
/*   62 */     int i16 = 0;
/*   63 */     int i17 = 0;
/*   64 */     int i18 = 0;
/*   65 */     int i19 = 0;
/*   66 */     int i20 = 0;
/*   67 */     int i21 = 0;
/*   68 */     int i22 = 0;
/*   69 */     int i23 = 0;
/*   70 */     int i24 = 0;
/*   71 */     int i25 = 0;
/*   72 */     double d1 = 0.0D;
/*   73 */     byte b1 = 0;
/*   74 */     int i26 = 0;
/*   75 */     int i27 = 0;
/*   76 */     int i28 = 0;
/*   77 */     int i29 = 0;
/*   78 */     int i30 = 0;
/*   79 */     int i31 = 0;
/*   80 */     int i32 = 0;
/*   81 */     int i33 = 0;
/*   82 */     int i34 = 0;
/*   83 */     int i35 = 0;
/*   84 */     int i36 = 0;
/*   85 */     int i37 = 0;
/*   86 */     int i38 = 0;
/*   87 */     int i39 = 0;
/*   88 */     int i40 = 0;
/*   89 */     int i41 = 0;
/*   90 */     int i42 = 0;
/*   91 */     double d2 = 0.0D;
/*   92 */     double d3 = 0.0D;
/*   93 */     double d4 = 0.0D;
/*   94 */     double d5 = 0.0D;
/*   95 */     double d6 = 0.0D;
/*   96 */     double d7 = 0.0D;
/*   97 */     double d8 = 0.0D;
/*   98 */     byte b2 = 0;
/*   99 */     int i43 = 0;
/*  100 */     int i44 = 0;
/*  101 */     int i45 = 0;
/*  102 */     boolean bool1 = false;
/*  103 */     boolean bool2 = false;
/*  104 */     int i46 = 0;
/*  105 */     int i47 = 0;
/*      */     
/*      */ 
/*  108 */     int i48 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*  112 */       i = MainMemory.alloc(80);
/*  113 */       j = MainMemory.alloc(40);
/*  114 */       k = MainMemory.alloc(40);
/*  115 */       m = MainMemory.alloc(2880);
/*  116 */       n = MainMemory.alloc(10);
/*  117 */       i1 = paramInt + 8;
/*  118 */       i3 = MainMemory.getI32(i1);
/*  119 */       i6 = i3;
/*  120 */       i3 = 1;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  128 */       i5 = i6 + -1;
/*  129 */       i17 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  136 */         i18 = i5 - i17;
/*  137 */         i19 = i6 - i17;
/*  138 */         i4 = m + i19 * 288 + 65280;
/*  139 */         i9 = i4;
/*  140 */         i13 = i4;
/*  141 */         i10 = n + i18;
/*  142 */         if (i18 != -1) {
/*      */           break label31494;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  152 */         i6 = MainMemory.getI32(paramInt);
/*  153 */         if ((i6 != 1001) && (i6 != 1042) && (i6 != 1043) && (MainMemory.getI32(i1) != 0) && (i3 != 0)) {
/*      */           break label26649;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  163 */         F301051.call(paramInt);
/*  164 */         i3 = MainMemory.getI32Aligned(470812);
/*  165 */         i4 = paramInt + 56;
/*  166 */         i5 = MainMemory.getI32(i4);
/*  167 */         i6 = i5 * i3;
/*  168 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */           break label31365;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  178 */         switch (MainMemory.getI32(paramInt)) {
/*      */         case 1001: 
/*      */           break label26327;
/*      */           break;
/*      */         case 1002: 
/*      */           break label25015;
/*      */           break;
/*      */         case 1004: 
/*      */           break label24831;
/*      */           break;
/*      */         case 1005: 
/*      */           break label24647;
/*      */           break;
/*      */         case 1006:  break label24463;
/*      */           break; case 1007:  break label24205;
/*      */           break; case 1008:  break label23947;
/*      */           break; case 1009:  break label23763;
/*      */           break; case 1010:  break label23579;
/*      */           break; case 1011:  break label23395;
/*      */           break; case 1012:  break label23211;
/*      */           break; case 1013:  break label23027;
/*      */           break; case 1014:  break label22780;
/*      */           break; case 1015:  break label22533;
/*      */           break; case 1016:  break label22286;
/*      */           break; case 1017:  break label22192;
/*      */           break; case 1018:  break label21561;
/*      */           break; case 1019:  break label21377;
/*      */           break; case 1020:  break label21193;
/*      */           break; case 1021:  break label21001;
/*      */           break; case 1022:  break label19961;
/*      */           break; case 1023:  break label18317;
/*      */           break; case 1024:  break label17277;
/*      */           break; case 1025:  break label15632;
/*      */           break; case 1026:  break label15046;
/*      */           break; case 1027:  break label14352;
/*      */           break; case 1028:  break label13424;
/*      */           break; case 1029:  break label12553;
/*      */           break; case 1030:  break label12395;
/*      */           break; case 1031:  break label10139;
/*      */           break; case 1034:  break label7422;
/*      */           break; case 1035:  break label7306;
/*      */           break; case 1036:  break label7028;
/*      */           break; case 1037:  break label6075;
/*      */           break; case 1038:  break label5208;
/*      */           break; case 1039:  break label3995;
/*      */           break; case 1040:  break label3689;
/*      */           break; case 1041:  break label2867;
/*      */           break; case 1042:  break label2188;
/*      */           break; case 1043:  break label1999;
/*      */           break; case 1044:  break label1449;
/*      */           break; case 1045:  break; }
/*  229 */         i2 = MainMemory.getI32(j);
/*  230 */         bool1 = MainMemory.getI32(i2) == 64536;
/*  231 */         i29 = j + 4;
/*  232 */         bool2 = MainMemory.getI32(MainMemory.getI32(i29)) == 64536;
/*  233 */         if (i3 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  243 */           i26 = paramInt + 88;
/*  244 */           i8 = paramInt + 84;
/*  245 */           i6 = i3 + -1;
/*  246 */           paramInt = i2;
/*  247 */           i5 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  255 */             i17 = i6 - i5;
/*  256 */             i13 = paramInt + 88;
/*  257 */             if (!bool1) {
/*      */               break label1118;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  267 */             i9 = i13;
/*      */             
/*  269 */             i18 = 0;
/*      */             
/*      */             break label1170;
/*      */             
/*      */             label1118:
/*  274 */             i9 = MainMemory.getI32(MainMemory.getI32(i13) + (i17 << 2));
/*  275 */             if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i17) == 0)
/*      */             {
/*  277 */               i18 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  288 */               i18 = 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label1170:
/*      */             
/*      */ 
/*  296 */             paramInt = MainMemory.getI32(i29);
/*  297 */             i13 = paramInt + 88;
/*  298 */             if (!bool2) {
/*      */               break label1214;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  308 */             i10 = i13;
/*      */             
/*      */             break label1258;
/*      */             
/*      */             label1214:
/*      */             
/*  314 */             i10 = MainMemory.getI32(MainMemory.getI32(i13) + (i17 << 2));
/*  315 */             if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i17) != 0) {
/*      */               break label1375;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label1258:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  327 */             MainMemory.setI32(MainMemory.getI32(i26) + (i17 << 2), 0);
/*  328 */             if (i18 != 0) {
/*      */               break label1397;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  339 */             i10 = SystemLibrary.strstr(i9, i10);
/*  340 */             i4 = MainMemory.getI32(i26);
/*  341 */             if (i10 != 0) {
/*      */               break label1348;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  351 */             MainMemory.setI32(i4 + (i17 << 2), 0);
/*  352 */             i18 = 1;
/*      */             
/*      */             break label1397;
/*      */             
/*      */             label1348:
/*  357 */             MainMemory.setI32(i4 + (i17 << 2), 1 - i9 + i10);
/*      */             
/*      */             break label1397;
/*      */             
/*      */             label1375:
/*      */             
/*  363 */             MainMemory.setI32(MainMemory.getI32(i26) + (i17 << 2), 0);
/*  364 */             i18 = 1;
/*      */             
/*      */ 
/*      */ 
/*      */             label1397:
/*      */             
/*      */ 
/*  371 */             MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)i18);
/*  372 */             i5 += 1;
/*  373 */             if (i5 == i3) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  383 */             paramInt = MainMemory.getI32(j);
/*      */           }
/*      */           
/*      */ 
/*      */           label1449:
/*      */           
/*      */ 
/*  390 */           i2 = MainMemory.getI32(j);
/*  391 */           bool1 = MainMemory.getI32(i2) == 64536;
/*  392 */           i29 = j + 4;
/*  393 */           bool2 = MainMemory.getI32(MainMemory.getI32(i29)) == 64536;
/*  394 */           i43 = j + 8;
/*  395 */           i46 = MainMemory.getI32(MainMemory.getI32(i43)) == 64536 ? 1 : 0;
/*  396 */           i17 = MainMemory.getI32(i2 + 56);
/*  397 */           i47 = paramInt + 88;
/*  398 */           i8 = paramInt + 84;
/*  399 */           i3 += -1;
/*  400 */           i6 = 0;
/*  401 */           i19 = i17;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  409 */             i17 = i3 - i6;
/*  410 */             if (i17 == -1) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  420 */             paramInt = MainMemory.getI32(i29);
/*  421 */             i13 = paramInt + 88;
/*  422 */             if (!bool2) {
/*      */               break label1639;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  432 */             i18 = MainMemory.getI32(i13);
/*      */             
/*  434 */             i20 = 0;
/*      */             
/*      */             break label1691;
/*      */             
/*      */             label1639:
/*  439 */             i18 = MainMemory.getI32(MainMemory.getI32(i13) + (i17 << 2));
/*  440 */             if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i17) == 0)
/*      */             {
/*  442 */               i20 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  453 */               i20 = 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label1691:
/*      */             
/*      */ 
/*  461 */             paramInt = MainMemory.getI32(j);
/*  462 */             i13 = paramInt + 88;
/*  463 */             if (!bool1) {
/*      */               break label1759;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  473 */             i9 = i13;
/*  474 */             if (i19 != 0) {
/*      */               break label1808;
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
/*  487 */             i19 = SystemLibrary.strlen(i9);
/*      */             
/*      */ 
/*      */             break label1808;
/*      */             
/*      */ 
/*      */             label1759:
/*      */             
/*  495 */             i9 = MainMemory.getI32(MainMemory.getI32(i13) + (i17 << 2));
/*  496 */             if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i17) != 0)
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
/*  511 */               i20 = 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label1808:
/*      */             
/*      */ 
/*      */ 
/*  520 */             if (i46 != 0) {
/*  521 */               i21 = i5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  532 */               paramInt = MainMemory.getI32(i43);
/*  533 */               i21 = MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i17 << 2));
/*  534 */               if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i17) != 0)
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
/*  547 */                 i20 = 1;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  555 */             MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i47) + (i17 << 2)), (byte)0);
/*  556 */             i20 = i18 == 0 ? 1 : i20;
/*  557 */             if (i20 != 0) {
/*      */               break label1969;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  567 */             if (F307607.call(MainMemory.getI32(MainMemory.getI32(i47) + (i17 << 2)), i21, i9, i19, i18) < 0) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label1969:
/*      */             
/*      */ 
/*      */ 
/*  577 */             MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)i20);
/*  578 */             i6 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */           label1999:
/*      */           
/*      */ 
/*  585 */           i2 = MainMemory.getI32(j);
/*  586 */           bool1 = MainMemory.getI32(i2) == 64536;
/*  587 */           bool2 = i6 == 0;
/*  588 */           if (MainMemory.getI32(i2 + 52) != 260) {
/*      */             break label2125;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  598 */           if (!bool1) {
/*      */             break label2102;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  608 */           F293294_069.call(i5, bool2, m, paramInt, i3);
/*      */           
/*      */           break label31365;
/*      */           
/*      */           label2102:
/*  613 */           F293294_056.call(i2, j, i5, bool2, paramInt, i3);
/*      */           
/*      */           break label31365;
/*      */           
/*      */           label2125:
/*  618 */           if (!bool1) {
/*      */             break label2165;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  628 */           F293294_070.call(i5, bool2, m, paramInt, i3);
/*      */           
/*      */           break label31365;
/*      */           
/*      */           label2165:
/*  633 */           F293294_055.call(i2, j, i5, bool2, paramInt, i3);
/*      */           
/*      */           break label31365;
/*      */           
/*      */           label2188:
/*  638 */           if (i6 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  648 */             i12 = paramInt + 88;
/*  649 */             i8 = paramInt + 84;
/*  650 */             i3 *= i5;
/*  651 */             i6 = i3 + -1;
/*  652 */             bool1 = MainMemory.getI1(459072);
/*      */             
/*  654 */             i5 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  662 */               i17 = i6 - i5;
/*  663 */               i13 = MainMemory.getI32(i12);
/*  664 */               if (!bool1) {
/*      */                 break label2301;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  674 */               MainMemory.setI1(459072, false);
/*  675 */               d1 = MainMemory.getF64(467260);
/*  676 */               bool1 = false;
/*      */               
/*      */               break label2812;
/*      */               
/*      */               label2301:
/*      */               
/*  682 */               d1 = MainMemory.getF64(467252);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  690 */                 if (!MathUtils.f_oeq(d1, 0.0D)) {
/*      */                   break label2407;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  700 */                 if (SystemLibrary.rand() <= 32767)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  710 */                   if (SystemLibrary.rand() <= 32767) {
/*      */                     break label2394;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  720 */                 MainMemory.setF64(467252, 2.147483648E9D);
/*      */                 
/*      */                 break label2407;
/*      */                 
/*      */                 label2394:
/*  725 */                 MainMemory.setF64(467252, 32768.0D);
/*      */                 
/*      */ 
/*      */                 label2407:
/*      */                 
/*      */ 
/*  731 */                 d1 = SystemLibrary.rand();
/*  732 */                 d2 = MainMemory.getF64(467252);
/*  733 */                 if (!MathUtils.f_ogt(d1, d2)) {
/*      */                   break label2483;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 do
/*      */                 {
/*  746 */                   d2 *= 2.0D;
/*  747 */                 } while (MathUtils.f_ogt(d1, d2));
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
/*  758 */                 MainMemory.setF64(467252, d2);
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2483:
/*      */                 
/*      */ 
/*      */ 
/*  766 */                 d1 /= d2;
/*  767 */                 d1 *= 2.0D;
/*  768 */                 d1 += -1.0D;
/*  769 */                 if (!MathUtils.f_oeq(d2, 0.0D)) {
/*      */                   break label2600;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  779 */                 if (SystemLibrary.rand() <= 32767)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  789 */                   if (SystemLibrary.rand() <= 32767) {
/*      */                     break label2587;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  799 */                 MainMemory.setF64(467252, 2.147483648E9D);
/*      */                 
/*      */                 break label2600;
/*      */                 
/*      */                 label2587:
/*  804 */                 MainMemory.setF64(467252, 32768.0D);
/*      */                 
/*      */ 
/*      */                 label2600:
/*      */                 
/*      */ 
/*  810 */                 d2 = SystemLibrary.rand();
/*  811 */                 d8 = MainMemory.getF64(467252);
/*  812 */                 if (!MathUtils.f_ogt(d2, d8)) {
/*      */                   break label2676;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 do
/*      */                 {
/*  825 */                   d8 *= 2.0D;
/*  826 */                 } while (MathUtils.f_ogt(d2, d8));
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
/*  837 */                 MainMemory.setF64(467252, d8);
/*      */                 
/*      */ 
/*      */ 
/*      */                 label2676:
/*      */                 
/*      */ 
/*      */ 
/*  845 */                 d2 /= d8;
/*  846 */                 d2 *= 2.0D;
/*  847 */                 d2 += -1.0D;
/*  848 */                 d4 = d1 * d1;
/*  849 */                 d5 = d2 * d2;
/*  850 */                 d4 += d5;
/*  851 */                 if ((!MathUtils.f_oge(d4, 1.0D)) && (!MathUtils.f_oeq(d4, 0.0D))) break;
/*  852 */                 d1 = d8;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  862 */               d8 = SystemLibrary.log(d4) * -2.0D;
/*  863 */               d8 /= d4;
/*  864 */               d8 = SystemLibrary.sqrt(d8);
/*  865 */               d1 *= d8;
/*  866 */               MainMemory.setF64(467260, d1);
/*  867 */               MainMemory.setI1(459072, true);
/*  868 */               d1 = d2 * d8;
/*  869 */               bool1 = true;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               label2812:
/*      */               
/*      */ 
/*      */ 
/*  878 */               MainMemory.setF64(i13 + (i17 << 3), d1);
/*  879 */               MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/*  880 */               i5 += 1;
/*  881 */               if (i5 == i3) { break label31365;
/*  882 */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label2867:
/*      */             
/*      */ 
/*      */ 
/*  892 */             if (i3 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  902 */               i8 = paramInt + 84;
/*  903 */               i9 = n + 1;
/*  904 */               i10 = n + 2;
/*  905 */               i11 = n + 3;
/*  906 */               i12 = paramInt + 88;
/*  907 */               i13 = m + 896;
/*  908 */               i14 = m + 608;
/*  909 */               i15 = m + 320;
/*  910 */               i16 = m + 32;
/*  911 */               i5 = i3 + -1;
/*  912 */               i17 = (i3 << 3) + -8;
/*  913 */               i18 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  922 */                 i19 = i5 - i18;
/*  923 */                 i20 = i17 + i18 * -8;
/*  924 */                 i21 = MainMemory.getI32(i4);
/*  925 */                 if (i21 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  936 */                   i22 = i6 + -1;
/*  937 */                   i23 = (i6 << 3) + -8;
/*  938 */                   i24 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  945 */                     i25 = i22 - i24;
/*  946 */                     i38 = i23 + i24 * -8;
/*  947 */                     i39 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/*  954 */                       i40 = 3 - i39;
/*  955 */                       i29 = j + (i40 << 2);
/*  956 */                       i31 = n + i40;
/*  957 */                       i35 = m + i40 * 288 + 32;
/*  958 */                       i40 = MainMemory.getI32(k + (i40 << 2));
/*  959 */                       if (i40 <= 1) {
/*      */                         break label3170;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  969 */                       paramInt = MainMemory.getI32(i29);
/*  970 */                       MainMemory.setF64(i35, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/*  971 */                       MainMemory.setI8(i31, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                       
/*      */                       break label3190;
/*      */                       
/*      */                       label3170:
/*  976 */                       F293294_114.call(i29, i31, i40, i20, i19, i35);
/*      */                       
/*      */ 
/*      */                       label3190:
/*      */                       
/*      */ 
/*  982 */                       i39 += 1;
/*  983 */                       if (i39 == 4) {
/*      */                         break;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  994 */                     i31 = MainMemory.getI32(i8);
/*  995 */                     if (MainMemory.getI8(n) != 0) {
/*      */                       break label3606;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1005 */                     if (MainMemory.getI8(i9) != 0) {
/*      */                       break label3606;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1015 */                     if (MainMemory.getI8(i10) != 0) {
/*      */                       break label3606;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1025 */                     if (MainMemory.getI8(i11) != 0) {
/*      */                       break label3606;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1035 */                     MainMemory.setI8(i31 + i25, (byte)0);
/* 1036 */                     i35 = MainMemory.getI32(i12);
/* 1037 */                     d2 = MainMemory.getF64(i13);
/* 1038 */                     d4 = MainMemory.getF64(i14);
/* 1039 */                     d8 = MainMemory.getF64(i15);
/* 1040 */                     d5 = MainMemory.getF64(i16);
/* 1041 */                     d1 = MainMemory.getF64(467244);
/* 1042 */                     if (!MathUtils.f_oeq(d1, 0.0D)) {
/*      */                       break label3397;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1053 */                     MainMemory.setF64(467244, 0.017453292519943295D);
/* 1054 */                     d1 = 0.017453292519943295D;
/*      */                     
/*      */ 
/*      */ 
/*      */                     label3397:
/*      */                     
/*      */ 
/* 1061 */                     d4 -= d5;
/* 1062 */                     d4 *= d1;
/* 1063 */                     d4 *= 0.5D;
/* 1064 */                     d4 = SystemLibrary.sin(d4);
/* 1065 */                     d5 = d2 - d8;
/* 1066 */                     d5 *= d1;
/* 1067 */                     d5 *= 0.5D;
/* 1068 */                     d5 = SystemLibrary.sin(d5);
/* 1069 */                     d5 *= d5;
/* 1070 */                     d8 = d1 * d8;
/* 1071 */                     d8 = SystemLibrary.cos(d8);
/* 1072 */                     d2 = d1 * d2;
/* 1073 */                     d2 = d8 * SystemLibrary.cos(d2);
/* 1074 */                     d2 *= d4;
/* 1075 */                     d2 *= d4;
/* 1076 */                     d2 = d5 + d2;
/* 1077 */                     d2 = MathUtils.f_olt(d2, 0.0D) ? 0.0D : d2;
/* 1078 */                     d2 = MathUtils.f_ogt(d2, 1.0D) ? 1.0D : d2;
/* 1079 */                     d8 = 1.0D - d2;
/* 1080 */                     d8 = SystemLibrary.sqrt(d8);
/* 1081 */                     d2 = SystemLibrary.atan2(SystemLibrary.sqrt(d2), d8) * 2.0D;
/* 1082 */                     d1 = d2 / d1;
/* 1083 */                     MainMemory.setF64(i35 + (i25 << 3), d1);
/*      */                     
/*      */                     break label3620;
/*      */                     
/*      */                     label3606:
/* 1088 */                     MainMemory.setI8(i31 + i25, (byte)1);
/*      */                     
/*      */ 
/*      */                     label3620:
/*      */                     
/*      */ 
/* 1094 */                     i24 += 1;
/* 1095 */                     if (i24 == i21) {
/*      */                       break;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1106 */                   i6 -= i21;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1114 */                 i18 += 1;
/* 1115 */                 if (i18 == i3) { break label31365;
/* 1116 */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label3689:
/*      */               
/*      */ 
/*      */ 
/* 1126 */               i2 = MainMemory.getI32(j);
/* 1127 */               i6 = MainMemory.getI32(i2 + 52) == 261 ? 1 : MainMemory.getI32(i2 + 56);
/* 1128 */               if (i3 != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1138 */                 i19 = i6 * i3;
/* 1139 */                 i8 = paramInt + 84;
/* 1140 */                 i26 = paramInt + 88;
/* 1141 */                 bool1 = i6 == 0;
/* 1142 */                 i5 = (i3 << 2) + -4;
/* 1143 */                 i17 = i3 + -1;
/* 1144 */                 i18 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 1153 */                   i20 = i5 + i18 * -4;
/* 1154 */                   i21 = i17 - i18;
/* 1155 */                   MainMemory.setI8(MainMemory.getI32(i8) + i21, (byte)0);
/* 1156 */                   MainMemory.setI32(MainMemory.getI32(i26) + (i21 << 2), 0);
/* 1157 */                   if (!bool1)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1168 */                     i21 = i19 + -1;
/* 1169 */                     i22 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 1176 */                       if (MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + (i21 - i22)) != 0) {
/*      */                         break label3926;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1186 */                       i4 = MainMemory.getI32(i26) + i20;
/* 1187 */                       MainMemory.setI32(i4, MainMemory.getI32(i4) + 1);
/*      */                       
/*      */ 
/*      */                       label3926:
/*      */                       
/*      */ 
/* 1193 */                       i22 += 1;
/* 1194 */                       if (i22 == i6) {
/*      */                         break;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1205 */                     i19 -= i6;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1213 */                   i18 += 1;
/* 1214 */                   if (i18 == i3) { break label31365;
/* 1215 */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label3995:
/*      */                 
/*      */ 
/*      */ 
/* 1225 */                 i2 = MainMemory.getI32(j);
/* 1226 */                 i5 = MainMemory.getI32(i2 + 56);
/* 1227 */                 i17 = i5 * i3;
/* 1228 */                 switch (MainMemory.getI32(i2 + 52))
/*      */                 {
/*      */                 case 259: 
/*      */                   break label4635;
/*      */                   
/*      */                   break;
/*      */                 case 260: 
/*      */                   break;
/*      */                 }
/*      */                 
/*      */                 
/* 1239 */                 if (i3 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1249 */                   i8 = paramInt + 84;
/* 1250 */                   i12 = paramInt + 88;
/* 1251 */                   i6 = i3 + -1;
/* 1252 */                   i18 = i5;
/* 1253 */                   paramInt = i2;
/* 1254 */                   i5 = 0;
/* 1255 */                   i20 = i17;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1265 */                   i17 = i6 - i5;
/* 1266 */                   i34 = paramInt + 84;
/* 1267 */                   i7 = paramInt + 88;
/* 1268 */                   d2 = 0.0D;
/* 1269 */                   i19 = 0;
/* 1270 */                   i21 = i18;
/* 1271 */                   i22 = i20;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/* 1281 */                     i23 = i21 + -1;
/* 1282 */                     i24 = i22 + -1;
/* 1283 */                     i25 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 1290 */                       i21 = i23 - i25;
/* 1291 */                       i20 = i24 - i25;
/* 1292 */                       if (i21 != -1) {
/*      */                         break label4560;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1302 */                       i20 = i22 - i25;
/* 1303 */                       if (i19 <= 1) {
/*      */                         break label4474;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1313 */                       d1 = i19;
/* 1314 */                       d2 /= d1;
/* 1315 */                       i20 = i18 + i20;
/* 1316 */                       d8 = 0.0D;
/* 1317 */                       i19 = i18;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 1327 */                         i21 = i19 + -1;
/* 1328 */                         i22 = i20 + -1;
/* 1329 */                         i23 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1336 */                           i19 = i21 - i23;
/* 1337 */                           i18 = i22 - i23;
/* 1338 */                           if (i19 != -1) {
/*      */                             break label4395;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1348 */                           i18 = i20 - i23;
/* 1349 */                           d1 += -1.0D;
/* 1350 */                           d1 = d8 / d1;
/* 1351 */                           MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/* 1352 */                           i13 = MainMemory.getI32(i12);
/* 1353 */                           MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.sqrt(d1));
/* 1354 */                           i17 = i18;
/*      */                           
/*      */                           break label4509;
/*      */                           
/*      */                           label4395:
/* 1359 */                           i23 += 1;
/* 1360 */                           if (MainMemory.getI8(MainMemory.getI32(i34) + i18) == 0) {
/*      */                             break;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1371 */                         d4 = MainMemory.getF64(MainMemory.getI32(i7) + (i18 << 3)) - d2;
/* 1372 */                         d4 *= d4;
/* 1373 */                         d8 = d4 + d8;
/*      */                         
/*      */ 
/* 1376 */                         i20 = i18;
/*      */                       }
/*      */                       
/*      */                       label4474:
/*      */                       
/* 1381 */                       MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/* 1382 */                       MainMemory.setF64(MainMemory.getI32(i12) + (i17 << 3), 0.0D);
/* 1383 */                       i17 = i20;
/*      */                       
/*      */ 
/*      */ 
/*      */                       label4509:
/*      */                       
/*      */ 
/* 1390 */                       i5 += 1;
/* 1391 */                       if (i5 == i3) {
/*      */                         break label31365;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1401 */                       paramInt = MainMemory.getI32(j);
/* 1402 */                       i18 = MainMemory.getI32(paramInt + 56);
/*      */                       
/*      */ 
/*      */ 
/* 1406 */                       i20 = i17;
/* 1407 */                       break;
/*      */                       
/*      */                       label4560:
/*      */                       
/* 1411 */                       i25 += 1;
/* 1412 */                       if (MainMemory.getI8(MainMemory.getI32(i34) + i20) == 0) {
/*      */                         break label4593;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */                     label4593:
/*      */                     
/*      */ 
/*      */ 
/* 1423 */                     d1 = MainMemory.getF64(MainMemory.getI32(i7) + (i20 << 3)) + d2;
/* 1424 */                     i19 += 1;
/* 1425 */                     d2 = d1;
/*      */                     
/*      */ 
/* 1428 */                     i22 = i20;
/*      */                   }
/*      */                   
/*      */                   label4635:
/*      */                   
/* 1433 */                   if (i3 != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1443 */                     i8 = paramInt + 84;
/* 1444 */                     i12 = paramInt + 88;
/* 1445 */                     i6 = i3 + -1;
/* 1446 */                     i18 = i5;
/* 1447 */                     paramInt = i2;
/* 1448 */                     i5 = 0;
/* 1449 */                     i20 = i17;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1459 */                     i17 = i6 - i5;
/* 1460 */                     i34 = paramInt + 84;
/* 1461 */                     i26 = paramInt + 88;
/* 1462 */                     d2 = 0.0D;
/* 1463 */                     i19 = 0;
/* 1464 */                     i21 = i18;
/* 1465 */                     i22 = i20;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/* 1475 */                       i23 = i21 + -1;
/* 1476 */                       i24 = i22 + -1;
/* 1477 */                       i25 = 0;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 1484 */                         i21 = i23 - i25;
/* 1485 */                         i20 = i24 - i25;
/* 1486 */                         if (i21 != -1) {
/*      */                           break label5128;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1496 */                         i20 = i22 - i25;
/* 1497 */                         if (i19 <= 1) {
/*      */                           break label5042;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1507 */                         d1 = i19;
/* 1508 */                         d2 /= d1;
/* 1509 */                         i20 = i18 + i20;
/* 1510 */                         d8 = 0.0D;
/* 1511 */                         i19 = i18;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1521 */                           i21 = i19 + -1;
/* 1522 */                           i22 = i20 + -1;
/* 1523 */                           i23 = 0;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 1530 */                             i19 = i21 - i23;
/* 1531 */                             i18 = i22 - i23;
/* 1532 */                             if (i19 != -1) {
/*      */                               break label4958;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1542 */                             i18 = i20 - i23;
/* 1543 */                             d1 += -1.0D;
/* 1544 */                             d1 = d8 / d1;
/* 1545 */                             MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/* 1546 */                             i13 = MainMemory.getI32(i12);
/* 1547 */                             MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.sqrt(d1));
/* 1548 */                             i17 = i18;
/*      */                             
/*      */                             break label5077;
/*      */                             
/*      */                             label4958:
/* 1553 */                             i23 += 1;
/* 1554 */                             if (MainMemory.getI8(MainMemory.getI32(i34) + i18) == 0) {
/*      */                               break;
/*      */                             }
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1565 */                           d4 = MainMemory.getI32(MainMemory.getI32(i26) + (i18 << 2));
/* 1566 */                           d4 -= d2;
/* 1567 */                           d4 *= d4;
/* 1568 */                           d8 = d4 + d8;
/*      */                           
/*      */ 
/* 1571 */                           i20 = i18;
/*      */                         }
/*      */                         
/*      */                         label5042:
/*      */                         
/* 1576 */                         MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/* 1577 */                         MainMemory.setF64(MainMemory.getI32(i12) + (i17 << 3), 0.0D);
/* 1578 */                         i17 = i20;
/*      */                         
/*      */ 
/*      */ 
/*      */                         label5077:
/*      */                         
/*      */ 
/* 1585 */                         i5 += 1;
/* 1586 */                         if (i5 == i3) {
/*      */                           break label31365;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1596 */                         paramInt = MainMemory.getI32(j);
/* 1597 */                         i18 = MainMemory.getI32(paramInt + 56);
/*      */                         
/*      */ 
/*      */ 
/* 1601 */                         i20 = i17;
/* 1602 */                         break;
/*      */                         
/*      */                         label5128:
/*      */                         
/* 1606 */                         i25 += 1;
/* 1607 */                         if (MainMemory.getI8(MainMemory.getI32(i34) + i20) == 0) {
/*      */                           break label5161;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */                       label5161:
/*      */                       
/*      */ 
/*      */ 
/* 1618 */                       d1 = MainMemory.getI32(MainMemory.getI32(i26) + (i20 << 2));
/* 1619 */                       d1 += d2;
/* 1620 */                       i19 += 1;
/* 1621 */                       d2 = d1;
/*      */                       
/*      */ 
/* 1624 */                       i22 = i20;
/*      */                     }
/*      */                     
/*      */                     label5208:
/*      */                     
/* 1629 */                     i2 = MainMemory.getI32(j);
/* 1630 */                     i18 = MainMemory.getI32(i2 + 56) * i3;
/* 1631 */                     switch (MainMemory.getI32(i2 + 52))
/*      */                     {
/*      */                     case 259: 
/*      */                       break label5677;
/*      */                       
/*      */                       break;
/*      */                     case 260: 
/*      */                       break;
/*      */                     }
/*      */                     
/*      */                     
/* 1642 */                     if (i3 != 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1652 */                       i12 = paramInt + 88;
/* 1653 */                       i8 = paramInt + 84;
/* 1654 */                       i6 = (i3 << 3) + -8;
/* 1655 */                       i5 = i3 + -1;
/* 1656 */                       i17 = 0;
/* 1657 */                       i21 = i18;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1665 */                       i20 = i6 + i17 * -8;
/* 1666 */                       i18 = i5 - i17;
/* 1667 */                       MainMemory.setF64(MainMemory.getI32(i12) + (i18 << 3), 0.0D);
/* 1668 */                       i22 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/* 1669 */                       i19 = 0;
/*      */                       
/* 1671 */                       i23 = i21;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 1680 */                         i24 = i22 + -1;
/* 1681 */                         i25 = i23 + -1;
/* 1682 */                         i38 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1689 */                           i22 = i24 - i38;
/* 1690 */                           i21 = i25 - i38;
/* 1691 */                           if (i22 != -1) {
/*      */                             break label5577;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1701 */                           i20 = i23 - i38;
/* 1702 */                           i9 = MainMemory.getI32(i8) + i18;
/* 1703 */                           if (i19 != 0) {
/*      */                             break label5497;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1713 */                           MainMemory.setI8(i9, (byte)1);
/*      */                           
/*      */                           break label5542;
/*      */                           
/*      */                           label5497:
/* 1718 */                           MainMemory.setI8(i9, (byte)0);
/* 1719 */                           i13 = MainMemory.getI32(i12) + (i18 << 3);
/* 1720 */                           d1 = i19;
/* 1721 */                           d1 = MainMemory.getF64(i13) / d1;
/* 1722 */                           MainMemory.setF64(i13, d1);
/*      */                           
/*      */ 
/*      */                           label5542:
/*      */                           
/*      */ 
/* 1728 */                           i17 += 1;
/* 1729 */                           if (i17 == i3) {
/*      */                             break label31365;
/*      */                           }
/*      */                           else {
/* 1733 */                             i21 = i20;
/* 1734 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */                           label5577:
/*      */                           
/* 1740 */                           paramInt = MainMemory.getI32(j);
/* 1741 */                           i38 += 1;
/* 1742 */                           if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i21) == 0) {
/*      */                             break label5617;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */                         label5617:
/*      */                         
/*      */ 
/*      */ 
/* 1753 */                         i13 = MainMemory.getI32(i12) + i20;
/* 1754 */                         d1 = MainMemory.getF64(i13) + MainMemory.getF64(MainMemory.getI32(paramInt + 88) + (i21 << 3));
/* 1755 */                         MainMemory.setF64(i13, d1);
/* 1756 */                         i19 += 1;
/*      */                         
/*      */ 
/* 1759 */                         i23 = i21;
/*      */                       }
/*      */                       
/*      */                       label5677:
/*      */                       
/* 1764 */                       if (i3 != 0)
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1774 */                         i12 = paramInt + 88;
/* 1775 */                         i8 = paramInt + 84;
/* 1776 */                         i6 = (i3 << 3) + -8;
/* 1777 */                         i5 = i3 + -1;
/* 1778 */                         i17 = 0;
/* 1779 */                         i21 = i18;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1787 */                         i20 = i6 + i17 * -8;
/* 1788 */                         i18 = i5 - i17;
/* 1789 */                         MainMemory.setF64(MainMemory.getI32(i12) + (i18 << 3), 0.0D);
/* 1790 */                         i22 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/* 1791 */                         i19 = 0;
/*      */                         
/* 1793 */                         i23 = i21;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1802 */                           i24 = i22 + -1;
/* 1803 */                           i25 = i23 + -1;
/* 1804 */                           i38 = 0;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 1811 */                             i22 = i24 - i38;
/* 1812 */                             i21 = i25 - i38;
/* 1813 */                             if (i22 != -1) {
/*      */                               break label5970;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1823 */                             i20 = i23 - i38;
/* 1824 */                             i9 = MainMemory.getI32(i8) + i18;
/* 1825 */                             if (i19 != 0) {
/*      */                               break label5890;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1835 */                             MainMemory.setI8(i9, (byte)1);
/*      */                             
/*      */                             break label5935;
/*      */                             
/*      */                             label5890:
/* 1840 */                             MainMemory.setI8(i9, (byte)0);
/* 1841 */                             i13 = MainMemory.getI32(i12) + (i18 << 3);
/* 1842 */                             d1 = i19;
/* 1843 */                             d1 = MainMemory.getF64(i13) / d1;
/* 1844 */                             MainMemory.setF64(i13, d1);
/*      */                             
/*      */ 
/*      */                             label5935:
/*      */                             
/*      */ 
/* 1850 */                             i17 += 1;
/* 1851 */                             if (i17 == i3) {
/*      */                               break label31365;
/*      */                             }
/*      */                             else {
/* 1855 */                               i21 = i20;
/* 1856 */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */                             label5970:
/*      */                             
/* 1862 */                             paramInt = MainMemory.getI32(j);
/* 1863 */                             i38 += 1;
/* 1864 */                             if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i21) == 0) {
/*      */                               break label6010;
/*      */                             }
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */                           label6010:
/*      */                           
/*      */ 
/*      */ 
/* 1875 */                           i13 = MainMemory.getI32(i12) + i20;
/* 1876 */                           d1 = MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i21 << 2));
/* 1877 */                           d1 = MainMemory.getF64(i13) + d1;
/* 1878 */                           MainMemory.setF64(i13, d1);
/* 1879 */                           i19 += 1;
/*      */                           
/*      */ 
/* 1882 */                           i23 = i21;
/*      */                         }
/*      */                         
/*      */                         label6075:
/*      */                         
/* 1887 */                         i2 = MainMemory.getI32(j);
/* 1888 */                         i6 = MainMemory.getI32(i2 + 56);
/* 1889 */                         i13 = i2 + 88;
/* 1890 */                         if (MainMemory.getI32(i2 + 52) != 259) {
/*      */                           break label6575;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1900 */                         i27 = MainMemory.getI32(i13);
/* 1901 */                         i10 = MainMemory.getI32(i2 + 84);
/* 1902 */                         i5 = i6 << 2;
/* 1903 */                         i9 = malloc.call(i5);
/* 1904 */                         i4 = i9;
/* 1905 */                         if (i9 != 0) {
/*      */                           break label6229;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1915 */                         MainMemory.setI32Aligned(470852, 431);
/* 1916 */                         SystemLibrary.strncpy(i, 122400, 80);
/* 1917 */                         MainMemory.setI8(i + 79, (byte)0);
/* 1918 */                         ffxmsg.call(5, i);
/* 1919 */                         free.call(MainMemory.getI32(paramInt + 88));
/*      */                         
/*      */                         break label31365;
/*      */                         
/*      */                         label6229:
/* 1924 */                         if (i3 <= 0) {
/*      */                           break label6559;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1934 */                         bool1 = i6 == 0;
/* 1935 */                         i17 = i9;
/* 1936 */                         i8 = paramInt + 84;
/* 1937 */                         i26 = paramInt + 88;
/*      */                         
/*      */ 
/* 1940 */                         i18 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1949 */                           if (bool1)
/*      */                           {
/*      */ 
/* 1952 */                             i28 = i4;
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/* 1962 */                             i11 = i27 + i5;
/* 1963 */                             i19 = 0;
/* 1964 */                             i28 = i4;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/* 1972 */                               if (MainMemory.getI8(i10 + i19) != 0) {
/*      */                                 break label6379;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1983 */                               MainMemory.setI32(i28, MainMemory.getI32(i27 + (i19 << 2)));
/* 1984 */                               i28 += 4;
/*      */                               
/*      */ 
/*      */ 
/*      */                               label6379:
/*      */                               
/*      */ 
/*      */ 
/* 1992 */                               i19 += 1;
/* 1993 */                               if (i19 == i6) {
/*      */                                 break;
/*      */                               }
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2005 */                             i10 += i6;
/* 2006 */                             i27 = i11;
/*      */                           }
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
/* 2018 */                           i19 = i28 - i17 >> 2;
/* 2019 */                           i11 = MainMemory.getI32(i8) + i18;
/* 2020 */                           if (i19 <= 0) {
/*      */                             break label6505;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2030 */                           MainMemory.setI8(i11, (byte)0);
/* 2031 */                           i28 = MainMemory.getI32(i26);
/* 2032 */                           MainMemory.setI32(i28 + (i18 << 2), qselect_median_lng.call(i4, i19));
/*      */                           
/*      */                           break label6531;
/*      */                           
/*      */                           label6505:
/* 2037 */                           MainMemory.setI8(i11, (byte)1);
/* 2038 */                           MainMemory.setI32(MainMemory.getI32(i26) + (i18 << 2), 0);
/*      */                           
/*      */ 
/*      */                           label6531:
/*      */                           
/*      */ 
/* 2044 */                           i18 += 1;
/* 2045 */                           if (i18 == i3) {
/*      */                             break;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         label6559:
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 2058 */                         free.call(i9);
/*      */                         
/*      */                         break label31365;
/*      */                         
/*      */                         label6575:
/* 2063 */                         i14 = MainMemory.getI32(i13);
/* 2064 */                         i10 = MainMemory.getI32(i2 + 84);
/* 2065 */                         i5 = i6 << 3;
/* 2066 */                         i9 = malloc.call(i5);
/* 2067 */                         i13 = i9;
/* 2068 */                         if (i9 != 0) {
/*      */                           break label6680;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2078 */                         MainMemory.setI32Aligned(470852, 431);
/* 2079 */                         SystemLibrary.strncpy(i, 122400, 80);
/* 2080 */                         MainMemory.setI8(i + 79, (byte)0);
/* 2081 */                         ffxmsg.call(5, i);
/* 2082 */                         free.call(MainMemory.getI32(paramInt + 88));
/*      */                         
/*      */                         break label31365;
/*      */                         
/*      */                         label6680:
/* 2087 */                         if (i3 <= 0) {
/*      */                           break label7012;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2097 */                         bool1 = i6 == 0;
/* 2098 */                         i17 = i9;
/* 2099 */                         i8 = paramInt + 84;
/* 2100 */                         i12 = paramInt + 88;
/*      */                         
/*      */ 
/* 2103 */                         i18 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 2112 */                           if (bool1)
/*      */                           {
/*      */ 
/* 2115 */                             i15 = i13;
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/* 2125 */                             i11 = i14 + i5;
/* 2126 */                             i19 = 0;
/* 2127 */                             i15 = i13;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/* 2135 */                               if (MainMemory.getI8(i10 + i19) != 0) {
/*      */                                 break label6832;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2146 */                               MainMemory.setF64(i15, MainMemory.getF64(i14 + (i19 << 3)));
/* 2147 */                               i15 += 8;
/*      */                               
/*      */ 
/*      */ 
/*      */                               label6832:
/*      */                               
/*      */ 
/*      */ 
/* 2155 */                               i19 += 1;
/* 2156 */                               if (i19 == i6) {
/*      */                                 break;
/*      */                               }
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2168 */                             i10 += i6;
/* 2169 */                             i14 = i11;
/*      */                           }
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
/* 2181 */                           i19 = i15 - i17 >> 3;
/* 2182 */                           i11 = MainMemory.getI32(i8) + i18;
/* 2183 */                           if (i19 <= 0) {
/*      */                             break label6958;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2193 */                           MainMemory.setI8(i11, (byte)0);
/* 2194 */                           i15 = MainMemory.getI32(i12);
/* 2195 */                           MainMemory.setF64(i15 + (i18 << 3), qselect_median_dbl.call(i13, i19));
/*      */                           
/*      */                           break label6984;
/*      */                           
/*      */                           label6958:
/* 2200 */                           MainMemory.setI8(i11, (byte)1);
/* 2201 */                           MainMemory.setF64(MainMemory.getI32(i12) + (i18 << 3), 0.0D);
/*      */                           
/*      */ 
/*      */                           label6984:
/*      */                           
/*      */ 
/* 2207 */                           i18 += 1;
/* 2208 */                           if (i18 == i3) {
/*      */                             break;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         label7012:
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 2221 */                         free.call(i9);
/*      */                         
/*      */                         break label31365;
/*      */                         
/*      */                         label7028:
/* 2226 */                         switch (MainMemory.getI32(paramInt + 52))
/*      */                         {
/*      */                         case 259: 
/*      */                           break label7197;
/*      */                           
/*      */                           break;
/*      */                         case 261: 
/*      */                           break;
/*      */                         }
/*      */                         
/*      */                         
/* 2237 */                         if (i3 != 0)
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2247 */                           i47 = paramInt + 88;
/* 2248 */                           i8 = paramInt + 84;
/* 2249 */                           i6 = i3 + -1;
/* 2250 */                           i5 = 0;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 2257 */                             i17 = i6 - i5;
/* 2258 */                             MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i47) + (i17 << 2)), (byte)0);
/* 2259 */                             MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/* 2260 */                             i5 += 1;
/* 2261 */                             if (i5 == i3) { break label31365;
/* 2262 */                               break;
/*      */                             }
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */                           label7197:
/*      */                           
/*      */ 
/* 2271 */                           if (i3 != 0)
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2281 */                             i26 = paramInt + 88;
/* 2282 */                             i8 = paramInt + 84;
/* 2283 */                             i6 = i3 + -1;
/* 2284 */                             i5 = 0;
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/* 2291 */                               i17 = i6 - i5;
/* 2292 */                               MainMemory.setI32(MainMemory.getI32(i26) + (i17 << 2), 0);
/* 2293 */                               MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/* 2294 */                               i5 += 1;
/* 2295 */                               if (i5 == i3) { break label31365;
/* 2296 */                                 break;
/*      */                               }
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */                             label7306:
/*      */                             
/*      */ 
/* 2305 */                             if (i3 != 0)
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2315 */                               i26 = paramInt + 88;
/* 2316 */                               i8 = paramInt + 84;
/* 2317 */                               i6 = i3 + -1;
/* 2318 */                               i5 = 0;
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */                               for (;;)
/*      */                               {
/* 2325 */                                 i17 = i6 - i5;
/* 2326 */                                 MainMemory.setI32(MainMemory.getI32(i26) + (i17 << 2), MainMemory.getI32Aligned(470808) + i17);
/* 2327 */                                 MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/* 2328 */                                 i5 += 1;
/* 2329 */                                 if (i5 == i3) { break label31365;
/* 2330 */                                   break;
/*      */                                 }
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */                               label7422:
/*      */                               
/*      */ 
/* 2339 */                               switch (MainMemory.getI32(paramInt + 52)) {
/*      */                               case 258: 
/*      */                                 break label9466;
/*      */                                 break;
/*      */                               case 259: 
/*      */                                 break label8747;
/*      */                                 break;
/*      */                               case 260: 
/*      */                                 break label8028;
/*      */                                 break;
/*      */                               case 261: 
/*      */                                 break;
/*      */                               }
/* 2352 */                               if (i3 != 0)
/*      */                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2362 */                                 i4 = k + 8;
/* 2363 */                                 i29 = j + 8;
/* 2364 */                                 i9 = m + 608;
/* 2365 */                                 i10 = n + 2;
/* 2366 */                                 i8 = paramInt + 84;
/* 2367 */                                 i47 = paramInt + 88;
/* 2368 */                                 i11 = m + 320;
/* 2369 */                                 i31 = n + 1;
/* 2370 */                                 i32 = m + 32;
/* 2371 */                                 i6 = i3 + -1;
/* 2372 */                                 i5 = (i3 << 2) + -4;
/* 2373 */                                 i17 = 0;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 for (;;)
/*      */                                 {
/* 2380 */                                   i18 = i6 - i17;
/* 2381 */                                   i19 = i5 + i17 * -4;
/* 2382 */                                   if (MainMemory.getI32(i4) == 0) {
/* 2383 */                                     i20 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                                   }
/*      */                                   else
/*      */                                   {
/*      */ 
/*      */ 
/*      */ 
/* 2393 */                                     paramInt = MainMemory.getI32(i29);
/* 2394 */                                     MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i18));
/* 2395 */                                     MainMemory.setI8(i10, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i18));
/* 2396 */                                     i20 = 0;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */                                   for (;;)
/*      */                                   {
/* 2403 */                                     i21 = 1 - i20;
/* 2404 */                                     i43 = j + (i21 << 2);
/* 2405 */                                     if (MainMemory.getI32(k + (i21 << 2)) != 0)
/*      */                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2415 */                                       i33 = n + i21;
/* 2416 */                                       SystemLibrary.strcpy(m + i21 * 288 + 32, MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i43) + 88) + i19));
/* 2417 */                                       MainMemory.setI8(i33, MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(i43) + 84) + i18));
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/* 2423 */                                     i20 += 1;
/* 2424 */                                     if (i20 == 2) {
/*      */                                       break;
/*      */                                     }
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2435 */                                   b2 = MainMemory.getI8(i10);
/* 2436 */                                   MainMemory.setI8(MainMemory.getI32(i8) + i18, b2);
/* 2437 */                                   if (b2 != 0) {
/*      */                                     break label7972;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2447 */                                   i33 = MainMemory.getI32(MainMemory.getI32(i47) + (i18 << 2));
/* 2448 */                                   if (MainMemory.getI8(i9) != 0) {
/*      */                                     break label7936;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2458 */                                   SystemLibrary.strcpy(i33, i11);
/* 2459 */                                   MainMemory.setI8(MainMemory.getI32(i8) + i18, MainMemory.getI8(i31));
/*      */                                   
/*      */                                   break label7995;
/*      */                                   
/*      */                                   label7936:
/* 2464 */                                   SystemLibrary.strcpy(i33, i32);
/* 2465 */                                   MainMemory.setI8(MainMemory.getI32(i8) + i18, MainMemory.getI8(n));
/*      */                                   
/*      */                                   break label7995;
/*      */                                   
/*      */                                   label7972:
/* 2470 */                                   MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i47) + (i18 << 2)), (byte)0);
/*      */                                   
/*      */ 
/*      */                                   label7995:
/*      */                                   
/*      */ 
/* 2476 */                                   i17 += 1;
/* 2477 */                                   if (i17 == i3) { break label31365;
/* 2478 */                                     break;
/*      */                                   }
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */                                 label8028:
/*      */                                 
/*      */ 
/* 2487 */                                 if (i3 != 0)
/*      */                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2497 */                                   i27 = k + 8;
/* 2498 */                                   i29 = j + 8;
/* 2499 */                                   i9 = m + 608;
/* 2500 */                                   i10 = n + 2;
/* 2501 */                                   i8 = paramInt + 84;
/* 2502 */                                   i12 = paramInt + 88;
/* 2503 */                                   i13 = m + 320;
/* 2504 */                                   i11 = n + 1;
/* 2505 */                                   i14 = m + 32;
/* 2506 */                                   i5 = i3 + -1;
/* 2507 */                                   i17 = (i3 << 3) + -8;
/* 2508 */                                   i43 = j + 4;
/* 2509 */                                   i28 = k + 4;
/* 2510 */                                   i18 = 0;
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                   for (;;)
/*      */                                   {
/* 2519 */                                     i19 = i5 - i18;
/* 2520 */                                     i20 = i17 + i18 * -8;
/* 2521 */                                     i21 = MainMemory.getI32(i4);
/* 2522 */                                     if (i21 != 0)
/*      */                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2533 */                                       i22 = i6 + -1;
/* 2534 */                                       i23 = (i6 << 3) + -8;
/* 2535 */                                       i24 = 0;
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */                                       for (;;)
/*      */                                       {
/* 2542 */                                         i25 = i22 - i24;
/* 2543 */                                         i38 = i23 + i24 * -8;
/* 2544 */                                         i39 = MainMemory.getI32(i27);
/* 2545 */                                         if (i39 <= 1) {
/*      */                                           break label8301;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2555 */                                         paramInt = MainMemory.getI32(i29);
/* 2556 */                                         MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i25));
/* 2557 */                                         MainMemory.setI8(i10, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                         
/*      */                                         break label8320;
/*      */                                         
/*      */                                         label8301:
/* 2562 */                                         F293294_106.call(i9, i39, i29, i10, i19);
/*      */                                         
/*      */ 
/*      */                                         label8320:
/*      */                                         
/*      */ 
/* 2568 */                                         i39 = MainMemory.getI32(i28);
/* 2569 */                                         if (i39 <= 1) {
/*      */                                           break label8402;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2579 */                                         paramInt = MainMemory.getI32(i43);
/* 2580 */                                         MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 2581 */                                         MainMemory.setI8(i11, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                         
/*      */                                         break label8423;
/*      */                                         
/*      */                                         label8402:
/* 2586 */                                         F293294_102.call(i20, i39, i13, i43, i11, i19);
/*      */                                         
/*      */ 
/*      */                                         label8423:
/*      */                                         
/*      */ 
/* 2592 */                                         i39 = MainMemory.getI32(k);
/* 2593 */                                         if (i39 <= 1) {
/*      */                                           break label8503;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2603 */                                         paramInt = MainMemory.getI32(j);
/* 2604 */                                         MainMemory.setF64(i14, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 2605 */                                         MainMemory.setI8(n, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                         
/*      */                                         break label8523;
/*      */                                         
/*      */                                         label8503:
/* 2610 */                                         F293294_109.call(i20, j, i14, i39, n, i19);
/*      */                                         
/*      */ 
/*      */                                         label8523:
/*      */                                         
/*      */ 
/* 2616 */                                         b2 = MainMemory.getI8(i10);
/* 2617 */                                         MainMemory.setI8(MainMemory.getI32(i8) + i25, b2);
/* 2618 */                                         if (b2 != 0) {
/*      */                                           break label8673;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2628 */                                         i15 = MainMemory.getI32(i12);
/* 2629 */                                         if (MainMemory.getI8(i9) != 0) {
/*      */                                           break label8636;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2639 */                                         MainMemory.setF64(i15 + (i25 << 3), MainMemory.getF64(i13));
/* 2640 */                                         MainMemory.setI8(MainMemory.getI32(i8) + i25, MainMemory.getI8(i11));
/*      */                                         
/*      */                                         break label8673;
/*      */                                         
/*      */                                         label8636:
/* 2645 */                                         MainMemory.setF64(i15 + (i25 << 3), MainMemory.getF64(i14));
/* 2646 */                                         MainMemory.setI8(MainMemory.getI32(i8) + i25, MainMemory.getI8(n));
/*      */                                         
/*      */ 
/*      */                                         label8673:
/*      */                                         
/*      */ 
/* 2652 */                                         i24 += 1;
/* 2653 */                                         if (i24 == i21) {
/*      */                                           break;
/*      */                                         }
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2664 */                                       i6 -= i21;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2672 */                                     i18 += 1;
/* 2673 */                                     if (i18 == i3) { break label31365;
/* 2674 */                                       break;
/*      */                                     }
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */                                   label8747:
/*      */                                   
/*      */ 
/*      */ 
/* 2684 */                                   if (i3 != 0)
/*      */                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2694 */                                     i27 = k + 8;
/* 2695 */                                     i29 = j + 8;
/* 2696 */                                     i9 = m + 608;
/* 2697 */                                     i10 = n + 2;
/* 2698 */                                     i8 = paramInt + 84;
/* 2699 */                                     i26 = paramInt + 88;
/* 2700 */                                     i28 = m + 320;
/* 2701 */                                     i11 = n + 1;
/* 2702 */                                     i30 = m + 32;
/* 2703 */                                     i5 = i3 + -1;
/* 2704 */                                     i17 = (i3 << 2) + -4;
/* 2705 */                                     i43 = j + 4;
/* 2706 */                                     i44 = k + 4;
/* 2707 */                                     i18 = 0;
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                     for (;;)
/*      */                                     {
/* 2716 */                                       i19 = i5 - i18;
/* 2717 */                                       i20 = i17 + i18 * -4;
/* 2718 */                                       i21 = MainMemory.getI32(i4);
/* 2719 */                                       if (i21 != 0)
/*      */                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2730 */                                         i22 = i6 + -1;
/* 2731 */                                         i23 = (i6 << 2) + -4;
/* 2732 */                                         i24 = 0;
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                         for (;;)
/*      */                                         {
/* 2739 */                                           i25 = i22 - i24;
/* 2740 */                                           i38 = i23 + i24 * -4;
/* 2741 */                                           i39 = MainMemory.getI32(i27);
/* 2742 */                                           if (i39 <= 1) {
/*      */                                             break label9020;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2752 */                                           paramInt = MainMemory.getI32(i29);
/* 2753 */                                           MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i25));
/* 2754 */                                           MainMemory.setI8(i10, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                           
/*      */                                           break label9039;
/*      */                                           
/*      */                                           label9020:
/* 2759 */                                           F293294_110.call(i19, i10, i9, i39, i29);
/*      */                                           
/*      */ 
/*      */                                           label9039:
/*      */                                           
/*      */ 
/* 2765 */                                           i39 = MainMemory.getI32(i44);
/* 2766 */                                           if (i39 <= 1) {
/*      */                                             break label9121;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2776 */                                           paramInt = MainMemory.getI32(i43);
/* 2777 */                                           MainMemory.setI32(i28, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/* 2778 */                                           MainMemory.setI8(i11, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                           
/*      */                                           break label9142;
/*      */                                           
/*      */                                           label9121:
/* 2783 */                                           F293294_118.call(i19, i28, i43, i11, i39, i20);
/*      */                                           
/*      */ 
/*      */                                           label9142:
/*      */                                           
/*      */ 
/* 2789 */                                           i39 = MainMemory.getI32(k);
/* 2790 */                                           if (i39 <= 1) {
/*      */                                             break label9222;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2800 */                                           paramInt = MainMemory.getI32(j);
/* 2801 */                                           MainMemory.setI32(i30, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/* 2802 */                                           MainMemory.setI8(n, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                           
/*      */                                           break label9242;
/*      */                                           
/*      */                                           label9222:
/* 2807 */                                           F293294_099.call(i19, j, i30, i20, n, i39);
/*      */                                           
/*      */ 
/*      */                                           label9242:
/*      */                                           
/*      */ 
/* 2813 */                                           b2 = MainMemory.getI8(i10);
/* 2814 */                                           MainMemory.setI8(MainMemory.getI32(i8) + i25, b2);
/* 2815 */                                           if (b2 != 0) {
/*      */                                             break label9392;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2825 */                                           i45 = MainMemory.getI32(i26);
/* 2826 */                                           if (MainMemory.getI8(i9) != 0) {
/*      */                                             break label9355;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2836 */                                           MainMemory.setI32(i45 + (i25 << 2), MainMemory.getI32(i28));
/* 2837 */                                           MainMemory.setI8(MainMemory.getI32(i8) + i25, MainMemory.getI8(i11));
/*      */                                           
/*      */                                           break label9392;
/*      */                                           
/*      */                                           label9355:
/* 2842 */                                           MainMemory.setI32(i45 + (i25 << 2), MainMemory.getI32(i30));
/* 2843 */                                           MainMemory.setI8(MainMemory.getI32(i8) + i25, MainMemory.getI8(n));
/*      */                                           
/*      */ 
/*      */                                           label9392:
/*      */                                           
/*      */ 
/* 2849 */                                           i24 += 1;
/* 2850 */                                           if (i24 == i21) {
/*      */                                             break;
/*      */                                           }
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2861 */                                         i6 -= i21;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2869 */                                       i18 += 1;
/* 2870 */                                       if (i18 == i3) { break label31365;
/* 2871 */                                         break;
/*      */                                       }
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */                                     label9466:
/*      */                                     
/*      */ 
/*      */ 
/* 2881 */                                     if (i3 != 0)
/*      */                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2891 */                                       i27 = k + 8;
/* 2892 */                                       i29 = j + 8;
/* 2893 */                                       i9 = m + 608;
/* 2894 */                                       i10 = n + 2;
/* 2895 */                                       i8 = paramInt + 84;
/* 2896 */                                       i34 = paramInt + 88;
/* 2897 */                                       i11 = m + 320;
/* 2898 */                                       i31 = n + 1;
/* 2899 */                                       i32 = m + 32;
/* 2900 */                                       i5 = i3 + -1;
/* 2901 */                                       i43 = j + 4;
/* 2902 */                                       i28 = k + 4;
/* 2903 */                                       i17 = 0;
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                       for (;;)
/*      */                                       {
/* 2912 */                                         i18 = i5 - i17;
/* 2913 */                                         i19 = MainMemory.getI32(i4);
/* 2914 */                                         if (i19 != 0)
/*      */                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2925 */                                           i20 = i6 + -1;
/* 2926 */                                           i21 = 0;
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                           for (;;)
/*      */                                           {
/* 2933 */                                             i22 = i20 - i21;
/* 2934 */                                             i23 = MainMemory.getI32(i27);
/* 2935 */                                             if (i23 <= 1) {
/*      */                                               break label9701;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2945 */                                             paramInt = MainMemory.getI32(i29);
/* 2946 */                                             MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i22));
/* 2947 */                                             MainMemory.setI8(i10, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i22));
/*      */                                             
/*      */                                             break label9720;
/*      */                                             
/*      */                                             label9701:
/* 2952 */                                             F293294_120.call(i29, i9, i23, i18, i10);
/*      */                                             
/*      */ 
/*      */                                             label9720:
/*      */                                             
/*      */ 
/* 2958 */                                             i23 = MainMemory.getI32(i28);
/* 2959 */                                             if (i23 <= 1) {
/*      */                                               break label9802;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2969 */                                             paramInt = MainMemory.getI32(i43);
/* 2970 */                                             MainMemory.setI8(i11, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i22));
/* 2971 */                                             MainMemory.setI8(i31, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i22));
/*      */                                             
/*      */                                             break label9821;
/*      */                                             
/*      */                                             label9802:
/* 2976 */                                             F293294_111.call(i43, i11, i31, i18, i23);
/*      */                                             
/*      */ 
/*      */                                             label9821:
/*      */                                             
/*      */ 
/* 2982 */                                             i23 = MainMemory.getI32(k);
/* 2983 */                                             if (i23 <= 1) {
/*      */                                               break label9901;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2993 */                                             paramInt = MainMemory.getI32(j);
/* 2994 */                                             MainMemory.setI8(i32, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i22));
/* 2995 */                                             MainMemory.setI8(n, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i22));
/*      */                                             
/*      */                                             break label9919;
/*      */                                             
/*      */                                             label9901:
/* 3000 */                                             F293294_119.call(i32, j, i23, n, i18);
/*      */                                             
/*      */ 
/*      */                                             label9919:
/*      */                                             
/*      */ 
/* 3006 */                                             b2 = MainMemory.getI8(i10);
/* 3007 */                                             MainMemory.setI8(MainMemory.getI32(i8) + i22, b2);
/* 3008 */                                             if (b2 != 0) {
/*      */                                               break label10065;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3018 */                                             i33 = MainMemory.getI32(i34);
/* 3019 */                                             if (MainMemory.getI8(i9) != 0) {
/*      */                                               break label10030;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3029 */                                             MainMemory.setI8(i33 + i22, MainMemory.getI8(i11));
/* 3030 */                                             MainMemory.setI8(MainMemory.getI32(i8) + i22, MainMemory.getI8(i31));
/*      */                                             
/*      */                                             break label10065;
/*      */                                             
/*      */                                             label10030:
/* 3035 */                                             MainMemory.setI8(i33 + i22, MainMemory.getI8(i32));
/* 3036 */                                             MainMemory.setI8(MainMemory.getI32(i8) + i22, MainMemory.getI8(n));
/*      */                                             
/*      */ 
/*      */                                             label10065:
/*      */                                             
/*      */ 
/* 3042 */                                             i21 += 1;
/* 3043 */                                             if (i21 == i19) {
/*      */                                               break;
/*      */                                             }
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3054 */                                           i6 -= i19;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3062 */                                         i17 += 1;
/* 3063 */                                         if (i17 == i3) { break label31365;
/* 3064 */                                           break;
/*      */                                         }
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */                                       label10139:
/*      */                                       
/*      */ 
/*      */ 
/* 3074 */                                       switch (MainMemory.getI32(paramInt + 52)) {
/*      */                                       case 258: 
/*      */                                         break label11820;
/*      */                                         break;
/*      */                                       case 259: 
/*      */                                         break label11201;
/*      */                                         break;
/*      */                                       case 260: 
/*      */                                         break label10582;
/*      */                                         break;
/*      */                                       case 261: 
/*      */                                         break;
/*      */                                       }
/* 3087 */                                       if (i3 != 0)
/*      */                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3097 */                                         i8 = paramInt + 84;
/* 3098 */                                         i47 = paramInt + 88;
/* 3099 */                                         i9 = m + 32;
/* 3100 */                                         i10 = n + 1;
/* 3101 */                                         i11 = m + 320;
/* 3102 */                                         i5 = i3 + -1;
/* 3103 */                                         i17 = (i3 << 2) + -4;
/* 3104 */                                         i18 = 0;
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                         for (;;)
/*      */                                         {
/* 3111 */                                           i19 = i5 - i18;
/* 3112 */                                           i20 = i17 + i18 * -4;
/* 3113 */                                           i21 = 0;
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                           for (;;)
/*      */                                           {
/* 3120 */                                             i22 = 1 - i21;
/* 3121 */                                             if (MainMemory.getI32(k + (i22 << 2)) != 0)
/*      */                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3131 */                                               i31 = m + i22 * 288 + 32;
/* 3132 */                                               paramInt = MainMemory.getI32(j + (i22 << 2));
/* 3133 */                                               MainMemory.setI8(n + i22, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19));
/* 3134 */                                               SystemLibrary.strcpy(i31, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i20));
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/* 3140 */                                             i21 += 1;
/* 3141 */                                             if (i21 == 2) {
/*      */                                               break;
/*      */                                             }
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3152 */                                           i31 = MainMemory.getI32(i8);
/* 3153 */                                           if (MainMemory.getI8(n) != 0) {
/*      */                                             break label10511;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3163 */                                           MainMemory.setI8(i31 + i6, (byte)0);
/* 3164 */                                           SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32(i47) + (i19 << 2)), i9);
/*      */                                           
/*      */                                           break label10549;
/*      */                                           
/*      */                                           label10511:
/* 3169 */                                           MainMemory.setI8(i31 + i19, MainMemory.getI8(i10));
/* 3170 */                                           SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32(i47) + (i19 << 2)), i11);
/*      */                                           
/*      */ 
/*      */                                           label10549:
/*      */                                           
/*      */ 
/* 3176 */                                           i18 += 1;
/* 3177 */                                           if (i18 == i3) { break label31365;
/* 3178 */                                             break;
/*      */                                           }
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */                                         label10582:
/*      */                                         
/*      */ 
/* 3187 */                                         if (i3 != 0)
/*      */                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3197 */                                           i8 = paramInt + 84;
/* 3198 */                                           i12 = paramInt + 88;
/* 3199 */                                           i13 = m + 32;
/* 3200 */                                           i9 = n + 1;
/* 3201 */                                           i14 = m + 320;
/* 3202 */                                           i5 = (i3 << 3) + -8;
/* 3203 */                                           i17 = i3 + -1;
/* 3204 */                                           i29 = j + 4;
/* 3205 */                                           i27 = k + 4;
/* 3206 */                                           i18 = 0;
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                           for (;;)
/*      */                                           {
/* 3215 */                                             i19 = i5 + i18 * -8;
/* 3216 */                                             i20 = i17 - i18;
/* 3217 */                                             i21 = MainMemory.getI32(i4);
/* 3218 */                                             if (i21 != 0)
/*      */                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3229 */                                               i22 = i6 + -1;
/* 3230 */                                               i23 = (i6 << 3) + -8;
/* 3231 */                                               i24 = 0;
/*      */                                               
/*      */ 
/*      */ 
/*      */ 
/*      */                                               for (;;)
/*      */                                               {
/* 3238 */                                                 i25 = i22 - i24;
/* 3239 */                                                 i38 = i23 + i24 * -8;
/* 3240 */                                                 i39 = MainMemory.getI32(i27);
/* 3241 */                                                 if (i39 <= 1) {
/*      */                                                   break label10829;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3251 */                                                 paramInt = MainMemory.getI32(i29);
/* 3252 */                                                 MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/* 3253 */                                                 MainMemory.setF64(i14, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/*      */                                                 
/*      */                                                 break label10850;
/*      */                                                 
/*      */                                                 label10829:
/* 3258 */                                                 F293294_116.call(i9, i39, i19, i14, i29, i20);
/*      */                                                 
/*      */ 
/*      */                                                 label10850:
/*      */                                                 
/*      */ 
/* 3264 */                                                 i39 = MainMemory.getI32(k);
/* 3265 */                                                 if (i39 <= 1) {
/*      */                                                   break label10934;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3275 */                                                 paramInt = MainMemory.getI32(j);
/* 3276 */                                                 b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25);
/* 3277 */                                                 MainMemory.setI8(n, b2);
/* 3278 */                                                 MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/*      */                                                 
/*      */                                                 break label11024;
/*      */                                                 
/*      */                                                 label10934:
/*      */                                                 
/* 3284 */                                                 if (i39 != 0) {
/*      */                                                   break label10973;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3294 */                                                 b2 = MainMemory.getI8(n);
/*      */                                                 
/*      */                                                 break label11024;
/*      */                                                 
/*      */                                                 label10973:
/*      */                                                 
/* 3300 */                                                 paramInt = MainMemory.getI32(j);
/* 3301 */                                                 b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i20);
/* 3302 */                                                 MainMemory.setI8(n, b2);
/* 3303 */                                                 MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i19));
/*      */                                                 
/*      */ 
/*      */ 
/*      */                                                 label11024:
/*      */                                                 
/*      */ 
/*      */ 
/* 3311 */                                                 i10 = MainMemory.getI32(i8);
/* 3312 */                                                 if (b2 != 0) {
/*      */                                                   break label11090;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3322 */                                                 MainMemory.setI8(i10 + i25, (byte)0);
/* 3323 */                                                 MainMemory.setF64(MainMemory.getI32(i12) + (i25 << 3), MainMemory.getF64(i13));
/*      */                                                 
/*      */                                                 break label11127;
/*      */                                                 
/*      */                                                 label11090:
/* 3328 */                                                 MainMemory.setI8(i10 + i25, MainMemory.getI8(i9));
/* 3329 */                                                 MainMemory.setF64(MainMemory.getI32(i12) + (i25 << 3), MainMemory.getF64(i14));
/*      */                                                 
/*      */ 
/*      */                                                 label11127:
/*      */                                                 
/*      */ 
/* 3335 */                                                 i24 += 1;
/* 3336 */                                                 if (i24 == i21) {
/*      */                                                   break;
/*      */                                                 }
/*      */                                               }
/*      */                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3347 */                                               i6 -= i21;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3355 */                                             i18 += 1;
/* 3356 */                                             if (i18 == i3) { break label31365;
/* 3357 */                                               break;
/*      */                                             }
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */                                           label11201:
/*      */                                           
/*      */ 
/*      */ 
/* 3367 */                                           if (i3 != 0)
/*      */                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3377 */                                             i8 = paramInt + 84;
/* 3378 */                                             i26 = paramInt + 88;
/* 3379 */                                             i27 = m + 32;
/* 3380 */                                             i9 = n + 1;
/* 3381 */                                             i28 = m + 320;
/* 3382 */                                             i5 = (i3 << 2) + -4;
/* 3383 */                                             i17 = i3 + -1;
/* 3384 */                                             i29 = j + 4;
/* 3385 */                                             i30 = k + 4;
/* 3386 */                                             i18 = 0;
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                             for (;;)
/*      */                                             {
/* 3395 */                                               i19 = i5 + i18 * -4;
/* 3396 */                                               i20 = i17 - i18;
/* 3397 */                                               i21 = MainMemory.getI32(i4);
/* 3398 */                                               if (i21 != 0)
/*      */                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3409 */                                                 i22 = i6 + -1;
/* 3410 */                                                 i23 = (i6 << 2) + -4;
/* 3411 */                                                 i24 = 0;
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                 for (;;)
/*      */                                                 {
/* 3418 */                                                   i25 = i22 - i24;
/* 3419 */                                                   i38 = i23 + i24 * -4;
/* 3420 */                                                   i39 = MainMemory.getI32(i30);
/* 3421 */                                                   if (i39 <= 1) {
/*      */                                                     break label11448;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3431 */                                                   paramInt = MainMemory.getI32(i29);
/* 3432 */                                                   MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/* 3433 */                                                   MainMemory.setI32(i28, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/*      */                                                   
/*      */                                                   break label11469;
/*      */                                                   
/*      */                                                   label11448:
/* 3438 */                                                   F293294_103.call(i20, i29, i19, i9, i28, i39);
/*      */                                                   
/*      */ 
/*      */                                                   label11469:
/*      */                                                   
/*      */ 
/* 3444 */                                                   i39 = MainMemory.getI32(k);
/* 3445 */                                                   if (i39 <= 1) {
/*      */                                                     break label11553;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3455 */                                                   paramInt = MainMemory.getI32(j);
/* 3456 */                                                   b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25);
/* 3457 */                                                   MainMemory.setI8(n, b2);
/* 3458 */                                                   MainMemory.setI32(i27, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/*      */                                                   
/*      */                                                   break label11643;
/*      */                                                   
/*      */                                                   label11553:
/*      */                                                   
/* 3464 */                                                   if (i39 != 0) {
/*      */                                                     break label11592;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3474 */                                                   b2 = MainMemory.getI8(n);
/*      */                                                   
/*      */                                                   break label11643;
/*      */                                                   
/*      */                                                   label11592:
/*      */                                                   
/* 3480 */                                                   paramInt = MainMemory.getI32(j);
/* 3481 */                                                   b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i20);
/* 3482 */                                                   MainMemory.setI8(n, b2);
/* 3483 */                                                   MainMemory.setI32(i27, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i19));
/*      */                                                   
/*      */ 
/*      */ 
/*      */                                                   label11643:
/*      */                                                   
/*      */ 
/*      */ 
/* 3491 */                                                   i10 = MainMemory.getI32(i8);
/* 3492 */                                                   if (b2 != 0) {
/*      */                                                     break label11709;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3502 */                                                   MainMemory.setI8(i10 + i25, (byte)0);
/* 3503 */                                                   MainMemory.setI32(MainMemory.getI32(i26) + (i25 << 2), MainMemory.getI32(i27));
/*      */                                                   
/*      */                                                   break label11746;
/*      */                                                   
/*      */                                                   label11709:
/* 3508 */                                                   MainMemory.setI8(i10 + i25, MainMemory.getI8(i9));
/* 3509 */                                                   MainMemory.setI32(MainMemory.getI32(i26) + (i25 << 2), MainMemory.getI32(i28));
/*      */                                                   
/*      */ 
/*      */                                                   label11746:
/*      */                                                   
/*      */ 
/* 3515 */                                                   i24 += 1;
/* 3516 */                                                   if (i24 == i21) {
/*      */                                                     break;
/*      */                                                   }
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3527 */                                                 i6 -= i21;
/*      */                                               }
/*      */                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3535 */                                               i18 += 1;
/* 3536 */                                               if (i18 == i3) { break label31365;
/* 3537 */                                                 break;
/*      */                                               }
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */                                             label11820:
/*      */                                             
/*      */ 
/*      */ 
/* 3547 */                                             if (i3 != 0)
/*      */                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3557 */                                               i8 = paramInt + 84;
/* 3558 */                                               i34 = paramInt + 88;
/* 3559 */                                               i9 = m + 32;
/* 3560 */                                               i10 = n + 1;
/* 3561 */                                               i11 = m + 320;
/* 3562 */                                               i5 = i3 + -1;
/* 3563 */                                               i29 = j + 4;
/* 3564 */                                               i27 = k + 4;
/* 3565 */                                               i17 = 0;
/*      */                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                               for (;;)
/*      */                                               {
/* 3574 */                                                 i18 = i5 - i17;
/* 3575 */                                                 i19 = MainMemory.getI32(i4);
/* 3576 */                                                 if (i19 != 0)
/*      */                                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3587 */                                                   i20 = i6 + -1;
/* 3588 */                                                   i21 = 0;
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                                   for (;;)
/*      */                                                   {
/* 3595 */                                                     i22 = i20 - i21;
/* 3596 */                                                     i23 = MainMemory.getI32(i27);
/* 3597 */                                                     if (i23 <= 1) {
/*      */                                                       break label12029;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3607 */                                                     paramInt = MainMemory.getI32(i29);
/* 3608 */                                                     MainMemory.setI8(i10, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i22));
/* 3609 */                                                     MainMemory.setI8(i11, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i22));
/*      */                                                     
/*      */                                                     break label12048;
/*      */                                                     
/*      */                                                     label12029:
/* 3614 */                                                     F293294_105.call(i10, i23, i29, i18, i11);
/*      */                                                     
/*      */ 
/*      */                                                     label12048:
/*      */                                                     
/*      */ 
/* 3620 */                                                     i23 = MainMemory.getI32(k);
/* 3621 */                                                     if (i23 <= 1) {
/*      */                                                       break label12132;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3631 */                                                     paramInt = MainMemory.getI32(j);
/* 3632 */                                                     b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i22);
/* 3633 */                                                     MainMemory.setI8(n, b2);
/* 3634 */                                                     MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i22));
/*      */                                                     
/*      */                                                     break label12222;
/*      */                                                     
/*      */                                                     label12132:
/*      */                                                     
/* 3640 */                                                     if (i23 != 0) {
/*      */                                                       break label12171;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3650 */                                                     b2 = MainMemory.getI8(n);
/*      */                                                     
/*      */                                                     break label12222;
/*      */                                                     
/*      */                                                     label12171:
/*      */                                                     
/* 3656 */                                                     paramInt = MainMemory.getI32(j);
/* 3657 */                                                     b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i18);
/* 3658 */                                                     MainMemory.setI8(n, b2);
/* 3659 */                                                     MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i18));
/*      */                                                     
/*      */ 
/*      */ 
/*      */                                                     label12222:
/*      */                                                     
/*      */ 
/*      */ 
/* 3667 */                                                     i31 = MainMemory.getI32(i8);
/* 3668 */                                                     if (b2 != 0) {
/*      */                                                       break label12286;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3678 */                                                     MainMemory.setI8(i31 + i22, (byte)0);
/* 3679 */                                                     MainMemory.setI8(MainMemory.getI32(i34) + i22, MainMemory.getI8(i9));
/*      */                                                     
/*      */                                                     break label12321;
/*      */                                                     
/*      */                                                     label12286:
/* 3684 */                                                     MainMemory.setI8(i31 + i22, MainMemory.getI8(i10));
/* 3685 */                                                     MainMemory.setI8(MainMemory.getI32(i34) + i22, MainMemory.getI8(i11));
/*      */                                                     
/*      */ 
/*      */                                                     label12321:
/*      */                                                     
/*      */ 
/* 3691 */                                                     i21 += 1;
/* 3692 */                                                     if (i21 == i19) {
/*      */                                                       break;
/*      */                                                     }
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3703 */                                                   i6 -= i19;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3711 */                                                 i17 += 1;
/* 3712 */                                                 if (i17 == i3) { break label31365;
/* 3713 */                                                   break;
/*      */                                                 }
/*      */                                               }
/*      */                                               
/*      */ 
/*      */ 
/*      */                                               label12395:
/*      */                                               
/*      */ 
/*      */ 
/* 3723 */                                               i2 = MainMemory.getI32(j);
/* 3724 */                                               i3 = MainMemory.getI32(i2 + 52) == 261 ? i3 : i6;
/* 3725 */                                               if (i3 != 0)
/*      */                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3735 */                                                 i8 = paramInt + 88;
/* 3736 */                                                 i34 = paramInt + 84;
/* 3737 */                                                 i6 = i3 + -1;
/* 3738 */                                                 paramInt = i2;
/* 3739 */                                                 i5 = 0;
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                 for (;;)
/*      */                                                 {
/* 3747 */                                                   i17 = i6 - i5;
/* 3748 */                                                   MainMemory.setI8(MainMemory.getI32(i8) + i17, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i17));
/* 3749 */                                                   MainMemory.setI8(MainMemory.getI32(i34) + i17, (byte)0);
/* 3750 */                                                   i5 += 1;
/* 3751 */                                                   if (i5 == i3) {
/*      */                                                     break;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3761 */                                                   paramInt = MainMemory.getI32(j);
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */                                                 label12553:
/*      */                                                 
/*      */ 
/* 3768 */                                                 if (i3 != 0)
/*      */                                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3778 */                                                   i8 = paramInt + 84;
/* 3779 */                                                   i9 = n + 1;
/* 3780 */                                                   i10 = n + 2;
/* 3781 */                                                   i11 = n + 3;
/* 3782 */                                                   i31 = n + 4;
/* 3783 */                                                   i32 = n + 5;
/* 3784 */                                                   i33 = n + 6;
/* 3785 */                                                   i34 = paramInt + 88;
/* 3786 */                                                   i13 = m + 1760;
/* 3787 */                                                   i14 = m + 1472;
/* 3788 */                                                   i15 = m + 1184;
/* 3789 */                                                   i16 = m + 896;
/* 3790 */                                                   i35 = m + 608;
/* 3791 */                                                   i36 = m + 320;
/* 3792 */                                                   i37 = m + 32;
/* 3793 */                                                   i5 = i3 + -1;
/* 3794 */                                                   i17 = (i3 << 3) + -8;
/* 3795 */                                                   i18 = 0;
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                   for (;;)
/*      */                                                   {
/* 3804 */                                                     i19 = i5 - i18;
/* 3805 */                                                     i20 = i17 + i18 * -8;
/* 3806 */                                                     i21 = MainMemory.getI32(i4);
/* 3807 */                                                     if (i21 != 0)
/*      */                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3818 */                                                       i22 = i6 + -1;
/* 3819 */                                                       i23 = (i6 << 3) + -8;
/* 3820 */                                                       i24 = 0;
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */                                                       for (;;)
/*      */                                                       {
/* 3827 */                                                         i25 = i22 - i24;
/* 3828 */                                                         i38 = i23 + i24 * -8;
/* 3829 */                                                         i39 = 0;
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                         for (;;)
/*      */                                                         {
/* 3836 */                                                           i40 = 6 - i39;
/* 3837 */                                                           i29 = j + (i40 << 2);
/* 3838 */                                                           i42 = n + i40;
/* 3839 */                                                           i41 = m + i40 * 288 + 32;
/* 3840 */                                                           i40 = MainMemory.getI32(k + (i40 << 2));
/* 3841 */                                                           if (i40 <= 1) {
/*      */                                                             break label12909;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3851 */                                                           paramInt = MainMemory.getI32(i29);
/* 3852 */                                                           MainMemory.setF64(i41, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 3853 */                                                           MainMemory.setI8(i42, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                           
/*      */                                                           break label12930;
/*      */                                                           
/*      */                                                           label12909:
/* 3858 */                                                           F293294_122.call(i29, i20, i19, i42, i40, i41);
/*      */                                                           
/*      */ 
/*      */                                                           label12930:
/*      */                                                           
/*      */ 
/* 3864 */                                                           i39 += 1;
/* 3865 */                                                           if (i39 == 7) {
/*      */                                                             break;
/*      */                                                           }
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3876 */                                                         i42 = MainMemory.getI32(i8);
/* 3877 */                                                         if (MainMemory.getI8(n) != 0) {
/*      */                                                           break label13335;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3887 */                                                         if (MainMemory.getI8(i9) != 0) {
/*      */                                                           break label13335;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3897 */                                                         if (MainMemory.getI8(i10) != 0) {
/*      */                                                           break label13335;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3907 */                                                         if (MainMemory.getI8(i11) != 0) {
/*      */                                                           break label13335;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3917 */                                                         if (MainMemory.getI8(i31) != 0) {
/*      */                                                           break label13335;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3927 */                                                         if (MainMemory.getI8(i32) != 0) {
/*      */                                                           break label13335;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3937 */                                                         if (MainMemory.getI8(i33) != 0) {
/*      */                                                           break label13335;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3947 */                                                         MainMemory.setI8(i42 + i25, (byte)0);
/* 3948 */                                                         i42 = MainMemory.getI32(i34);
/* 3949 */                                                         d1 = MainMemory.getF64(i16);
/* 3950 */                                                         d2 = MainMemory.getF64(i35);
/* 3951 */                                                         d8 = MainMemory.getF64(i15) / 180.0D;
/* 3952 */                                                         d6 = d8 * 3.141592653589793D;
/* 3953 */                                                         d3 = MainMemory.getF64(i14) - MainMemory.getF64(i37);
/* 3954 */                                                         d8 = MainMemory.getF64(i13) - MainMemory.getF64(i36);
/* 3955 */                                                         d4 = SystemLibrary.cos(d6);
/* 3956 */                                                         d5 = d4 * d3;
/* 3957 */                                                         d6 = SystemLibrary.sin(d6);
/* 3958 */                                                         d7 = d6 * d8;
/* 3959 */                                                         d5 += d7;
/* 3960 */                                                         d3 = -0.0D - d3;
/* 3961 */                                                         d3 = d6 * d3;
/* 3962 */                                                         d8 = d4 * d8;
/* 3963 */                                                         d8 = d3 + d8;
/* 3964 */                                                         d2 = d5 / d2;
/* 3965 */                                                         d1 = d8 / d1;
/* 3966 */                                                         d2 *= d2;
/* 3967 */                                                         d1 *= d1;
/* 3968 */                                                         d1 = d2 + d1;
/* 3969 */                                                         MainMemory.setI8(i42 + i25, (byte)(MathUtils.f_ole(d1, 1.0D) ? 1 : 0));
/*      */                                                         
/*      */                                                         break label13350;
/*      */                                                         
/*      */                                                         label13335:
/* 3974 */                                                         MainMemory.setI8(i42 + i25, (byte)1);
/*      */                                                         
/*      */ 
/*      */                                                         label13350:
/*      */                                                         
/*      */ 
/* 3980 */                                                         i24 += 1;
/* 3981 */                                                         if (i24 == i21) {
/*      */                                                           break;
/*      */                                                         }
/*      */                                                       }
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3992 */                                                       i6 -= i21;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4000 */                                                     i18 += 1;
/* 4001 */                                                     if (i18 == i3) { break label31365;
/* 4002 */                                                       break;
/*      */                                                     }
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */                                                   label13424:
/*      */                                                   
/*      */ 
/*      */ 
/* 4012 */                                                   if (i3 != 0)
/*      */                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4022 */                                                     i8 = paramInt + 84;
/* 4023 */                                                     i9 = n + 1;
/* 4024 */                                                     i10 = n + 2;
/* 4025 */                                                     i11 = n + 3;
/* 4026 */                                                     i31 = n + 4;
/* 4027 */                                                     i32 = n + 5;
/* 4028 */                                                     i33 = n + 6;
/* 4029 */                                                     i34 = paramInt + 88;
/* 4030 */                                                     i13 = m + 1760;
/* 4031 */                                                     i14 = m + 1472;
/* 4032 */                                                     i15 = m + 1184;
/* 4033 */                                                     i16 = m + 896;
/* 4034 */                                                     i35 = m + 608;
/* 4035 */                                                     i36 = m + 320;
/* 4036 */                                                     i37 = m + 32;
/* 4037 */                                                     i5 = i3 + -1;
/* 4038 */                                                     i17 = (i3 << 3) + -8;
/* 4039 */                                                     i18 = 0;
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                     for (;;)
/*      */                                                     {
/* 4048 */                                                       i19 = i5 - i18;
/* 4049 */                                                       i20 = i17 + i18 * -8;
/* 4050 */                                                       i21 = MainMemory.getI32(i4);
/* 4051 */                                                       if (i21 != 0)
/*      */                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4062 */                                                         i22 = i6 + -1;
/* 4063 */                                                         i23 = (i6 << 3) + -8;
/* 4064 */                                                         i24 = 0;
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                         for (;;)
/*      */                                                         {
/* 4071 */                                                           i25 = i22 - i24;
/* 4072 */                                                           i38 = i23 + i24 * -8;
/* 4073 */                                                           i39 = 0;
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                                           for (;;)
/*      */                                                           {
/* 4080 */                                                             i40 = 6 - i39;
/* 4081 */                                                             i29 = j + (i40 << 2);
/* 4082 */                                                             i42 = n + i40;
/* 4083 */                                                             i41 = m + i40 * 288 + 32;
/* 4084 */                                                             i40 = MainMemory.getI32(k + (i40 << 2));
/* 4085 */                                                             if (i40 <= 1) {
/*      */                                                               break label13780;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4095 */                                                             paramInt = MainMemory.getI32(i29);
/* 4096 */                                                             MainMemory.setF64(i41, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 4097 */                                                             MainMemory.setI8(i42, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                             
/*      */                                                             break label13801;
/*      */                                                             
/*      */                                                             label13780:
/* 4102 */                                                             F293294_104.call(i20, i41, i40, i19, i29, i42);
/*      */                                                             
/*      */ 
/*      */                                                             label13801:
/*      */                                                             
/*      */ 
/* 4108 */                                                             i39 += 1;
/* 4109 */                                                             if (i39 == 7) {
/*      */                                                               break;
/*      */                                                             }
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4120 */                                                           i42 = MainMemory.getI32(i8);
/* 4121 */                                                           if (MainMemory.getI8(n) != 0) {
/*      */                                                             break label14263;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4131 */                                                           if (MainMemory.getI8(i9) != 0) {
/*      */                                                             break label14263;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4141 */                                                           if (MainMemory.getI8(i10) != 0) {
/*      */                                                             break label14263;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4151 */                                                           if (MainMemory.getI8(i11) != 0) {
/*      */                                                             break label14263;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4161 */                                                           if (MainMemory.getI8(i31) != 0) {
/*      */                                                             break label14263;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4171 */                                                           if (MainMemory.getI8(i32) != 0) {
/*      */                                                             break label14263;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4181 */                                                           if (MainMemory.getI8(i33) != 0) {
/*      */                                                             break label14263;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4191 */                                                           MainMemory.setI8(i42 + i25, (byte)0);
/* 4192 */                                                           i42 = MainMemory.getI32(i34);
/* 4193 */                                                           d2 = MainMemory.getF64(i16);
/* 4194 */                                                           d1 = MainMemory.getF64(i35);
/* 4195 */                                                           d8 = MainMemory.getF64(i15) / 180.0D;
/* 4196 */                                                           d6 = d8 * 3.141592653589793D;
/* 4197 */                                                           d3 = MainMemory.getF64(i14) - MainMemory.getF64(i37);
/* 4198 */                                                           d4 = MainMemory.getF64(i13) - MainMemory.getF64(i36);
/* 4199 */                                                           d5 = SystemLibrary.cos(d6);
/* 4200 */                                                           d8 = d5 * d3;
/* 4201 */                                                           d6 = SystemLibrary.sin(d6);
/* 4202 */                                                           d7 = d6 * d4;
/* 4203 */                                                           d8 += d7;
/* 4204 */                                                           d3 = -0.0D - d3;
/* 4205 */                                                           d3 = d6 * d3;
/* 4206 */                                                           d4 = d5 * d4;
/* 4207 */                                                           d4 = d3 + d4;
/* 4208 */                                                           d5 = d1 * -0.5D;
/* 4209 */                                                           if (MathUtils.f_ult(d8, d5)) {
/* 4210 */                                                             b2 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                           }
/*      */                                                           else
/*      */                                                           {
/*      */ 
/*      */ 
/*      */ 
/* 4220 */                                                             d5 = d2 * 0.5D;
/* 4221 */                                                             d2 *= -0.5D;
/* 4222 */                                                             d1 *= 0.5D;
/* 4223 */                                                             b2 = MathUtils.xor((byte)((MathUtils.f_ugt(d8, d1)) || (MathUtils.f_ult(d4, d2)) || (MathUtils.f_ugt(d4, d5)) ? 1 : 0), (byte)1);
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4231 */                                                           MainMemory.setI8(i42 + i25, b2);
/*      */                                                           
/*      */                                                           break label14278;
/*      */                                                           
/*      */                                                           label14263:
/* 4236 */                                                           MainMemory.setI8(i42 + i25, (byte)1);
/*      */                                                           
/*      */ 
/*      */                                                           label14278:
/*      */                                                           
/*      */ 
/* 4242 */                                                           i24 += 1;
/* 4243 */                                                           if (i24 == i21) {
/*      */                                                             break;
/*      */                                                           }
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4254 */                                                         i6 -= i21;
/*      */                                                       }
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4262 */                                                       i18 += 1;
/* 4263 */                                                       if (i18 == i3) { break label31365;
/* 4264 */                                                         break;
/*      */                                                       }
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */                                                     label14352:
/*      */                                                     
/*      */ 
/*      */ 
/* 4274 */                                                     if (i3 != 0)
/*      */                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4284 */                                                       i8 = paramInt + 84;
/* 4285 */                                                       i9 = n + 1;
/* 4286 */                                                       i10 = n + 2;
/* 4287 */                                                       i11 = n + 3;
/* 4288 */                                                       i31 = n + 4;
/* 4289 */                                                       i34 = paramInt + 88;
/* 4290 */                                                       i13 = m + 1184;
/* 4291 */                                                       i14 = m + 896;
/* 4292 */                                                       i15 = m + 608;
/* 4293 */                                                       i16 = m + 320;
/* 4294 */                                                       i35 = m + 32;
/* 4295 */                                                       i5 = i3 + -1;
/* 4296 */                                                       i17 = (i3 << 3) + -8;
/* 4297 */                                                       i18 = 0;
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                       for (;;)
/*      */                                                       {
/* 4306 */                                                         i19 = i5 - i18;
/* 4307 */                                                         i20 = i17 + i18 * -8;
/* 4308 */                                                         i21 = MainMemory.getI32(i4);
/* 4309 */                                                         if (i21 != 0)
/*      */                                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4320 */                                                           i22 = i6 + -1;
/* 4321 */                                                           i23 = (i6 << 3) + -8;
/* 4322 */                                                           i24 = 0;
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                                           for (;;)
/*      */                                                           {
/* 4329 */                                                             i25 = i22 - i24;
/* 4330 */                                                             i38 = i23 + i24 * -8;
/* 4331 */                                                             i39 = 0;
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */                                                             for (;;)
/*      */                                                             {
/* 4338 */                                                               i40 = 4 - i39;
/* 4339 */                                                               i29 = j + (i40 << 2);
/* 4340 */                                                               i32 = n + i40;
/* 4341 */                                                               i36 = m + i40 * 288 + 32;
/* 4342 */                                                               i40 = MainMemory.getI32(k + (i40 << 2));
/* 4343 */                                                               if (i40 <= 1) {
/*      */                                                                 break label14678;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4353 */                                                               paramInt = MainMemory.getI32(i29);
/* 4354 */                                                               MainMemory.setF64(i36, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 4355 */                                                               MainMemory.setI8(i32, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                               
/*      */                                                               break label14699;
/*      */                                                               
/*      */                                                               label14678:
/* 4360 */                                                               F293294_115.call(i40, i36, i32, i19, i20, i29);
/*      */                                                               
/*      */ 
/*      */                                                               label14699:
/*      */                                                               
/*      */ 
/* 4366 */                                                               i39 += 1;
/* 4367 */                                                               if (i39 == 5) {
/*      */                                                                 break;
/*      */                                                               }
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4378 */                                                             i32 = MainMemory.getI32(i8);
/* 4379 */                                                             if (MainMemory.getI8(n) != 0) {
/*      */                                                               break label14957;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4389 */                                                             if (MainMemory.getI8(i9) != 0) {
/*      */                                                               break label14957;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4399 */                                                             if (MainMemory.getI8(i10) != 0) {
/*      */                                                               break label14957;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4409 */                                                             if (MainMemory.getI8(i11) != 0) {
/*      */                                                               break label14957;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4419 */                                                             if (MainMemory.getI8(i31) != 0) {
/*      */                                                               break label14957;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4429 */                                                             MainMemory.setI8(i32 + i25, (byte)0);
/* 4430 */                                                             d1 = MainMemory.getF64(i15);
/* 4431 */                                                             d8 = MainMemory.getF64(i14) - MainMemory.getF64(i35);
/* 4432 */                                                             d2 = MainMemory.getF64(i13) - MainMemory.getF64(i16);
/* 4433 */                                                             d8 *= d8;
/* 4434 */                                                             d2 *= d2;
/* 4435 */                                                             d2 = d8 + d2;
/* 4436 */                                                             d1 *= d1;
/* 4437 */                                                             MainMemory.setI8(MainMemory.getI32(i34) + i25, (byte)(MathUtils.f_ole(d2, d1) ? 1 : 0));
/*      */                                                             
/*      */                                                             break label14972;
/*      */                                                             
/*      */                                                             label14957:
/* 4442 */                                                             MainMemory.setI8(i32 + i25, (byte)1);
/*      */                                                             
/*      */ 
/*      */                                                             label14972:
/*      */                                                             
/*      */ 
/* 4448 */                                                             i24 += 1;
/* 4449 */                                                             if (i24 == i21) {
/*      */                                                               break;
/*      */                                                             }
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4460 */                                                           i6 -= i21;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4468 */                                                         i18 += 1;
/* 4469 */                                                         if (i18 == i3) { break label31365;
/* 4470 */                                                           break;
/*      */                                                         }
/*      */                                                       }
/*      */                                                       
/*      */ 
/*      */ 
/*      */                                                       label15046:
/*      */                                                       
/*      */ 
/*      */ 
/* 4480 */                                                       if (i3 != 0)
/*      */                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4490 */                                                         i8 = paramInt + 84;
/* 4491 */                                                         i9 = n + 1;
/* 4492 */                                                         i10 = n + 2;
/* 4493 */                                                         i34 = paramInt + 88;
/* 4494 */                                                         i13 = m + 608;
/* 4495 */                                                         i14 = m + 320;
/* 4496 */                                                         i15 = m + 32;
/* 4497 */                                                         i5 = i3 + -1;
/* 4498 */                                                         i17 = (i3 << 3) + -8;
/* 4499 */                                                         i18 = 0;
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                         for (;;)
/*      */                                                         {
/* 4508 */                                                           i19 = i5 - i18;
/* 4509 */                                                           i20 = i17 + i18 * -8;
/* 4510 */                                                           i21 = MainMemory.getI32(i4);
/* 4511 */                                                           if (i21 != 0)
/*      */                                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4522 */                                                             i22 = i6 + -1;
/* 4523 */                                                             i23 = (i6 << 3) + -8;
/* 4524 */                                                             i24 = 0;
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */                                                             for (;;)
/*      */                                                             {
/* 4531 */                                                               i25 = i22 - i24;
/* 4532 */                                                               i38 = i23 + i24 * -8;
/* 4533 */                                                               i39 = 0;
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */                                                               for (;;)
/*      */                                                               {
/* 4540 */                                                                 i40 = 2 - i39;
/* 4541 */                                                                 i29 = j + (i40 << 2);
/* 4542 */                                                                 i11 = n + i40;
/* 4543 */                                                                 i16 = m + i40 * 288 + 32;
/* 4544 */                                                                 i40 = MainMemory.getI32(k + (i40 << 2));
/* 4545 */                                                                 if (i40 <= 1) {
/*      */                                                                   break label15344;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4555 */                                                                 paramInt = MainMemory.getI32(i29);
/* 4556 */                                                                 MainMemory.setF64(i16, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 4557 */                                                                 MainMemory.setI8(i11, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                                 
/*      */                                                                 break label15365;
/*      */                                                                 
/*      */                                                                 label15344:
/* 4562 */                                                                 F293294_117.call(i29, i20, i16, i11, i19, i40);
/*      */                                                                 
/*      */ 
/*      */                                                                 label15365:
/*      */                                                                 
/*      */ 
/* 4568 */                                                                 i39 += 1;
/* 4569 */                                                                 if (i39 == 3) {
/*      */                                                                   break;
/*      */                                                                 }
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4580 */                                                               i11 = MainMemory.getI32(i8);
/* 4581 */                                                               if (MainMemory.getI8(n) != 0) {
/*      */                                                                 break label15543;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4591 */                                                               if (MainMemory.getI8(i9) != 0) {
/*      */                                                                 break label15543;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4601 */                                                               if (MainMemory.getI8(i10) != 0) {
/*      */                                                                 break label15543;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4611 */                                                               MainMemory.setI8(i11 + i25, (byte)0);
/* 4612 */                                                               i11 = MainMemory.getI32(i34);
/* 4613 */                                                               d1 = MainMemory.getF64(i13);
/* 4614 */                                                               d2 = MainMemory.getF64(i15) - MainMemory.getF64(i14);
/* 4615 */                                                               MainMemory.setI8(i11 + i25, (byte)(MathUtils.f_olt(SystemLibrary.fabs(d2), d1) ? 1 : 0));
/*      */                                                               
/*      */                                                               break label15558;
/*      */                                                               
/*      */                                                               label15543:
/* 4620 */                                                               MainMemory.setI8(i11 + i25, (byte)1);
/*      */                                                               
/*      */ 
/*      */                                                               label15558:
/*      */                                                               
/*      */ 
/* 4626 */                                                               i24 += 1;
/* 4627 */                                                               if (i24 == i21) {
/*      */                                                                 break;
/*      */                                                               }
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4638 */                                                             i6 -= i21;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4646 */                                                           i18 += 1;
/* 4647 */                                                           if (i18 == i3) { break label31365;
/* 4648 */                                                             break;
/*      */                                                           }
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */                                                         label15632:
/*      */                                                         
/*      */ 
/*      */ 
/* 4658 */                                                         switch (MainMemory.getI32(paramInt + 52))
/*      */                                                         {
/*      */                                                         case 259: 
/*      */                                                           break label16483;
/*      */                                                           
/*      */                                                           break;
/*      */                                                         case 260: 
/*      */                                                           break;
/*      */                                                         }
/*      */                                                         
/*      */                                                         
/* 4669 */                                                         if (i3 != 0)
/*      */                                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4679 */                                                           i9 = n + 1;
/* 4680 */                                                           i8 = paramInt + 84;
/* 4681 */                                                           i12 = paramInt + 88;
/* 4682 */                                                           i13 = m + 32;
/* 4683 */                                                           i14 = m + 320;
/* 4684 */                                                           i5 = i3 + -1;
/* 4685 */                                                           i17 = (i3 << 3) + -8;
/* 4686 */                                                           i29 = j + 4;
/* 4687 */                                                           i27 = k + 4;
/* 4688 */                                                           i18 = 0;
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                           for (;;)
/*      */                                                           {
/* 4697 */                                                             i19 = i5 - i18;
/* 4698 */                                                             i20 = i17 + i18 * -8;
/* 4699 */                                                             i21 = MainMemory.getI32(i4);
/* 4700 */                                                             if (i21 != 0)
/*      */                                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4711 */                                                               i22 = (i6 << 3) + -8;
/* 4712 */                                                               i23 = i6 + -1;
/* 4713 */                                                               i24 = 0;
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */                                                               for (;;)
/*      */                                                               {
/* 4720 */                                                                 i38 = i22 + i24 * -8;
/* 4721 */                                                                 i25 = i23 - i24;
/* 4722 */                                                                 i39 = MainMemory.getI32(i27);
/* 4723 */                                                                 if (i39 <= 1) {
/*      */                                                                   break label15936;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4733 */                                                                 paramInt = MainMemory.getI32(i29);
/* 4734 */                                                                 MainMemory.setF64(i14, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 4735 */                                                                 MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                                 
/*      */                                                                 break label15957;
/*      */                                                                 
/*      */                                                                 label15936:
/* 4740 */                                                                 F293294_113.call(i9, i19, i29, i14, i20, i39);
/*      */                                                                 
/*      */ 
/*      */                                                                 label15957:
/*      */                                                                 
/*      */ 
/* 4746 */                                                                 i39 = MainMemory.getI32(k);
/* 4747 */                                                                 if (i39 <= 1) {
/*      */                                                                   break label16041;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4757 */                                                                 paramInt = MainMemory.getI32(j);
/* 4758 */                                                                 MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 4759 */                                                                 b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25);
/* 4760 */                                                                 MainMemory.setI8(n, b2);
/*      */                                                                 
/*      */                                                                 break label16131;
/*      */                                                                 
/*      */                                                                 label16041:
/*      */                                                                 
/* 4766 */                                                                 if (i39 != 0) {
/*      */                                                                   break label16080;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4776 */                                                                 b2 = MainMemory.getI8(n);
/*      */                                                                 
/*      */                                                                 break label16131;
/*      */                                                                 
/*      */                                                                 label16080:
/*      */                                                                 
/* 4782 */                                                                 paramInt = MainMemory.getI32(j);
/* 4783 */                                                                 MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i20));
/* 4784 */                                                                 b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19);
/* 4785 */                                                                 MainMemory.setI8(n, b2);
/*      */                                                                 
/*      */ 
/*      */ 
/*      */                                                                 label16131:
/*      */                                                                 
/*      */ 
/*      */ 
/* 4793 */                                                                 bool1 = b2 == 0;
/* 4794 */                                                                 b2 = MainMemory.getI8(i9);
/* 4795 */                                                                 if (!bool1)
/*      */                                                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4805 */                                                                   if (b2 != 0) {
/*      */                                                                     break label16377;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4815 */                                                                   if (!bool1) {
/*      */                                                                     break label16335;
/*      */                                                                   }
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4825 */                                                                 bool1 = b2 == 0;
/* 4826 */                                                                 MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 4827 */                                                                 i15 = MainMemory.getI32(i12);
/* 4828 */                                                                 d1 = MainMemory.getF64(i13);
/* 4829 */                                                                 if (!bool1) {
/*      */                                                                   break label16311;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4839 */                                                                 d2 = MainMemory.getF64(i14);
/* 4840 */                                                                 MainMemory.setF64(i15 + (i25 << 3), MathUtils.f_ogt(d1, d2) ? d1 : d2);
/*      */                                                                 
/*      */                                                                 break label16409;
/*      */                                                                 
/*      */                                                                 label16311:
/* 4845 */                                                                 MainMemory.setF64(i15 + (i25 << 3), d1);
/*      */                                                                 
/*      */                                                                 break label16409;
/*      */                                                                 
/*      */                                                                 label16335:
/* 4850 */                                                                 MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 4851 */                                                                 MainMemory.setF64(MainMemory.getI32(i12) + (i25 << 3), MainMemory.getF64(i14));
/*      */                                                                 
/*      */                                                                 break label16409;
/*      */                                                                 
/*      */                                                                 label16377:
/* 4856 */                                                                 MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)1);
/* 4857 */                                                                 MainMemory.setF64(MainMemory.getI32(i12) + (i25 << 3), 0.0D);
/*      */                                                                 
/*      */ 
/*      */                                                                 label16409:
/*      */                                                                 
/*      */ 
/* 4863 */                                                                 i24 += 1;
/* 4864 */                                                                 if (i24 == i21) {
/*      */                                                                   break;
/*      */                                                                 }
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4875 */                                                               i6 -= i21;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4883 */                                                             i18 += 1;
/* 4884 */                                                             if (i18 == i3) { break label31365;
/* 4885 */                                                               break;
/*      */                                                             }
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */                                                           label16483:
/*      */                                                           
/*      */ 
/*      */ 
/* 4895 */                                                           if (i3 != 0)
/*      */                                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4905 */                                                             i9 = n + 1;
/* 4906 */                                                             i8 = paramInt + 84;
/* 4907 */                                                             i26 = paramInt + 88;
/* 4908 */                                                             i27 = m + 320;
/* 4909 */                                                             i28 = m + 32;
/* 4910 */                                                             i5 = i3 + -1;
/* 4911 */                                                             i17 = (i3 << 2) + -4;
/* 4912 */                                                             i29 = j + 4;
/* 4913 */                                                             i30 = k + 4;
/* 4914 */                                                             i18 = 0;
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                             for (;;)
/*      */                                                             {
/* 4923 */                                                               i19 = i5 - i18;
/* 4924 */                                                               i20 = i17 + i18 * -4;
/* 4925 */                                                               i21 = MainMemory.getI32(i4);
/* 4926 */                                                               if (i21 != 0)
/*      */                                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4937 */                                                                 i22 = (i6 << 2) + -4;
/* 4938 */                                                                 i23 = i6 + -1;
/* 4939 */                                                                 i24 = 0;
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                 for (;;)
/*      */                                                                 {
/* 4946 */                                                                   i38 = i22 + i24 * -4;
/* 4947 */                                                                   i25 = i23 - i24;
/* 4948 */                                                                   i39 = MainMemory.getI32(i30);
/* 4949 */                                                                   if (i39 <= 1) {
/*      */                                                                     break label16730;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4959 */                                                                   paramInt = MainMemory.getI32(i29);
/* 4960 */                                                                   MainMemory.setI32(i27, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/* 4961 */                                                                   MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                                   
/*      */                                                                   break label16751;
/*      */                                                                   
/*      */                                                                   label16730:
/* 4966 */                                                                   F293294_101.call(i9, i29, i19, i27, i20, i39);
/*      */                                                                   
/*      */ 
/*      */                                                                   label16751:
/*      */                                                                   
/*      */ 
/* 4972 */                                                                   i39 = MainMemory.getI32(k);
/* 4973 */                                                                   if (i39 <= 1) {
/*      */                                                                     break label16835;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 4983 */                                                                   paramInt = MainMemory.getI32(j);
/* 4984 */                                                                   MainMemory.setI32(i28, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/* 4985 */                                                                   b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25);
/* 4986 */                                                                   MainMemory.setI8(n, b2);
/*      */                                                                   
/*      */                                                                   break label16925;
/*      */                                                                   
/*      */                                                                   label16835:
/*      */                                                                   
/* 4992 */                                                                   if (i39 != 0) {
/*      */                                                                     break label16874;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5002 */                                                                   b2 = MainMemory.getI8(n);
/*      */                                                                   
/*      */                                                                   break label16925;
/*      */                                                                   
/*      */                                                                   label16874:
/*      */                                                                   
/* 5008 */                                                                   paramInt = MainMemory.getI32(j);
/* 5009 */                                                                   MainMemory.setI32(i28, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i20));
/* 5010 */                                                                   b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19);
/* 5011 */                                                                   MainMemory.setI8(n, b2);
/*      */                                                                   
/*      */ 
/*      */ 
/*      */                                                                   label16925:
/*      */                                                                   
/*      */ 
/*      */ 
/* 5019 */                                                                   bool1 = b2 == 0;
/* 5020 */                                                                   b2 = MainMemory.getI8(i9);
/* 5021 */                                                                   if (!bool1)
/*      */                                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5031 */                                                                     if (b2 != 0) {
/*      */                                                                       break label17171;
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5041 */                                                                     if (!bool1) {
/*      */                                                                       break label17129;
/*      */                                                                     }
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5051 */                                                                   bool1 = b2 == 0;
/* 5052 */                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 5053 */                                                                   i44 = MainMemory.getI32(i26);
/* 5054 */                                                                   if (!bool1) {
/*      */                                                                     break label17102;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5064 */                                                                   i38 = MainMemory.getI32(i27);
/* 5065 */                                                                   i39 = MainMemory.getI32(i28);
/* 5066 */                                                                   MainMemory.setI32(i44 + (i25 << 2), i38 >= i39 ? i38 : i39);
/*      */                                                                   
/*      */                                                                   break label17203;
/*      */                                                                   
/*      */                                                                   label17102:
/* 5071 */                                                                   MainMemory.setI32(i44 + (i25 << 2), MainMemory.getI32(i28));
/*      */                                                                   
/*      */                                                                   break label17203;
/*      */                                                                   
/*      */                                                                   label17129:
/* 5076 */                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 5077 */                                                                   MainMemory.setI32(MainMemory.getI32(i26) + (i25 << 2), MainMemory.getI32(i27));
/*      */                                                                   
/*      */                                                                   break label17203;
/*      */                                                                   
/*      */                                                                   label17171:
/* 5082 */                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)1);
/* 5083 */                                                                   MainMemory.setI32(MainMemory.getI32(i26) + (i25 << 2), 0);
/*      */                                                                   
/*      */ 
/*      */                                                                   label17203:
/*      */                                                                   
/*      */ 
/* 5089 */                                                                   i24 += 1;
/* 5090 */                                                                   if (i24 == i21) {
/*      */                                                                     break;
/*      */                                                                   }
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5101 */                                                                 i6 -= i21;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5109 */                                                               i18 += 1;
/* 5110 */                                                               if (i18 == i3) { break label31365;
/* 5111 */                                                                 break;
/*      */                                                               }
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */                                                             label17277:
/*      */                                                             
/*      */ 
/*      */ 
/* 5121 */                                                             i2 = MainMemory.getI32(j);
/* 5122 */                                                             i17 = MainMemory.getI32(i2 + 56) * i3;
/* 5123 */                                                             switch (MainMemory.getI32(paramInt + 52))
/*      */                                                             {
/*      */                                                             case 259: 
/*      */                                                               break label17972;
/*      */                                                               break;
/*      */                                                             case 260: 
/*      */                                                               break label17614;
/*      */                                                               break;
/*      */                                                             case 262: 
/*      */                                                               break;
/*      */                                                             }
/*      */                                                             
/* 5135 */                                                             if (i3 != 0)
/*      */                                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5145 */                                                               i47 = paramInt + 88;
/* 5146 */                                                               i6 = i3 + -1;
/* 5147 */                                                               paramInt = i2;
/* 5148 */                                                               i5 = 0;
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5156 */                                                               i17 = i6 - i5;
/* 5157 */                                                               i9 = MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i17 << 2));
/* 5158 */                                                               b2 = MainMemory.getI8(i9);
/* 5159 */                                                               if (b2 == 0) {
/* 5160 */                                                                 b2 = 48;
/*      */                                                                 break label17518;
/*      */                                                               }
/*      */                                                               else {
/* 5164 */                                                                 i18 = 1;
/* 5165 */                                                                 b1 = 48;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                               for (;;)
/*      */                                                               {
/* 5176 */                                                                 b1 = b2 == 49 ? 49 : b1;
/* 5177 */                                                                 b2 = MainMemory.getI8(i9 + i18);
/* 5178 */                                                                 if (b2 == 0) {
/* 5179 */                                                                   b2 = b1;
/*      */                                                                 } else {
/*      */                                                                   break label17596;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */                                                                 label17518:
/*      */                                                                 
/*      */ 
/*      */ 
/* 5190 */                                                                 MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i47) + (i17 << 2)), b2);
/* 5191 */                                                                 MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i47) + (i17 << 2)) + 1, (byte)0);
/* 5192 */                                                                 i5 += 1;
/* 5193 */                                                                 if (i5 == i3) {
/*      */                                                                   break label31365;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5203 */                                                                 paramInt = MainMemory.getI32(j);
/*      */                                                                 
/*      */ 
/* 5206 */                                                                 break;
/*      */                                                                 
/*      */                                                                 label17596:
/*      */                                                                 
/* 5210 */                                                                 i18 += 1;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */                                                               label17614:
/*      */                                                               
/*      */ 
/* 5218 */                                                               if (i3 != 0)
/*      */                                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5228 */                                                                 i8 = paramInt + 84;
/* 5229 */                                                                 i12 = paramInt + 88;
/* 5230 */                                                                 i6 = i3 + -1;
/* 5231 */                                                                 i5 = 0;
/* 5232 */                                                                 i18 = i17;
/* 5233 */                                                                 d1 = 0.0D;
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5242 */                                                                 i17 = i6 - i5;
/* 5243 */                                                                 MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/* 5244 */                                                                 i19 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/*      */                                                                 
/* 5246 */                                                                 i20 = i19;
/* 5247 */                                                                 i21 = i18;
/* 5248 */                                                                 i19 = 1;
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                 for (;;)
/*      */                                                                 {
/* 5258 */                                                                   i22 = i20 + -1;
/* 5259 */                                                                   i23 = i21 + -1;
/* 5260 */                                                                   i24 = 0;
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                   for (;;)
/*      */                                                                   {
/* 5267 */                                                                     i20 = i22 - i24;
/* 5268 */                                                                     i18 = i23 - i24;
/* 5269 */                                                                     if (i20 != -1) {
/*      */                                                                       break label17823;
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5279 */                                                                     i18 = i21 - i24;
/* 5280 */                                                                     MainMemory.setF64(MainMemory.getI32(i12) + (i17 << 3), d1);
/* 5281 */                                                                     i5 += 1;
/* 5282 */                                                                     if (i5 == i3) {
/*      */                                                                       break label31365;
/*      */                                                                     } else {
/*      */                                                                       break;
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */                                                                     label17823:
/*      */                                                                     
/*      */ 
/*      */ 
/* 5294 */                                                                     paramInt = MainMemory.getI32(j);
/* 5295 */                                                                     i24 += 1;
/* 5296 */                                                                     if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i18) == 0) {
/*      */                                                                       break label17865;
/*      */                                                                     }
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */                                                                   label17865:
/*      */                                                                   
/*      */ 
/*      */ 
/* 5307 */                                                                   d2 = MainMemory.getF64(MainMemory.getI32(paramInt + 88) + (i18 << 3));
/* 5308 */                                                                   if (i19 != 0)
/*      */                                                                   {
/*      */ 
/*      */ 
/* 5312 */                                                                     d1 = d2;
/* 5313 */                                                                     i19 = 0;
/*      */ 
/*      */ 
/*      */                                                                   }
/*      */                                                                   else
/*      */                                                                   {
/*      */ 
/* 5320 */                                                                     if (!MathUtils.f_uge(d2, d1)) {
/*      */                                                                       break label17944;
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5332 */                                                                     d1 = d2;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */                                                                   label17944:
/*      */                                                                   
/*      */ 
/*      */ 
/* 5341 */                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/*      */                                                                   
/*      */ 
/* 5344 */                                                                   i21 = i18;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */                                                                 label17972:
/*      */                                                                 
/* 5350 */                                                                 if (i3 != 0)
/*      */                                                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5360 */                                                                   i8 = paramInt + 84;
/* 5361 */                                                                   i26 = paramInt + 88;
/* 5362 */                                                                   i6 = i3 + -1;
/* 5363 */                                                                   i5 = 0;
/* 5364 */                                                                   i19 = i17;
/* 5365 */                                                                   i18 = 0;
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5374 */                                                                   i17 = i6 - i5;
/* 5375 */                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/* 5376 */                                                                   i20 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/*      */                                                                   
/* 5378 */                                                                   i21 = i20;
/* 5379 */                                                                   i22 = i19;
/* 5380 */                                                                   i20 = 1;
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                   for (;;)
/*      */                                                                   {
/* 5390 */                                                                     i23 = i21 + -1;
/* 5391 */                                                                     i24 = i22 + -1;
/* 5392 */                                                                     i25 = 0;
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                     for (;;)
/*      */                                                                     {
/* 5399 */                                                                       i21 = i23 - i25;
/* 5400 */                                                                       i19 = i24 - i25;
/* 5401 */                                                                       if (i21 != -1) {
/*      */                                                                         break label18181;
/*      */                                                                       }
/*      */                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5411 */                                                                       i19 = i22 - i25;
/* 5412 */                                                                       MainMemory.setI32(MainMemory.getI32(i26) + (i17 << 2), i18);
/* 5413 */                                                                       i5 += 1;
/* 5414 */                                                                       if (i5 == i3) {
/*      */                                                                         break label31365;
/*      */                                                                       } else {
/*      */                                                                         break;
/*      */                                                                       }
/*      */                                                                       
/*      */ 
/*      */ 
/*      */                                                                       label18181:
/*      */                                                                       
/*      */ 
/*      */ 
/* 5426 */                                                                       paramInt = MainMemory.getI32(j);
/* 5427 */                                                                       i25 += 1;
/* 5428 */                                                                       if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19) == 0) {
/*      */                                                                         break label18223;
/*      */                                                                       }
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */                                                                     label18223:
/*      */                                                                     
/*      */ 
/*      */ 
/* 5439 */                                                                     i22 = MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i19 << 2));
/* 5440 */                                                                     if (i20 != 0)
/*      */                                                                     {
/*      */ 
/*      */ 
/* 5444 */                                                                       i18 = i22;
/* 5445 */                                                                       i20 = 0;
/*      */ 
/*      */ 
/*      */                                                                     }
/*      */                                                                     else
/*      */                                                                     {
/*      */ 
/* 5452 */                                                                       i18 = i22 >= i18 ? i22 : i18;
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5462 */                                                                     MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/*      */                                                                     
/*      */ 
/* 5465 */                                                                     i22 = i19;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */                                                                   label18317:
/*      */                                                                   
/* 5471 */                                                                   switch (MainMemory.getI32(paramInt + 52))
/*      */                                                                   {
/*      */                                                                   case 259: 
/*      */                                                                     break label19167;
/*      */                                                                     
/*      */                                                                     break;
/*      */                                                                   case 260: 
/*      */                                                                     break;
/*      */                                                                   }
/*      */                                                                   
/*      */                                                                   
/* 5482 */                                                                   if (i3 != 0)
/*      */                                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5492 */                                                                     i9 = n + 1;
/* 5493 */                                                                     i8 = paramInt + 84;
/* 5494 */                                                                     i12 = paramInt + 88;
/* 5495 */                                                                     i13 = m + 32;
/* 5496 */                                                                     i14 = m + 320;
/* 5497 */                                                                     i5 = i3 + -1;
/* 5498 */                                                                     i17 = (i3 << 3) + -8;
/* 5499 */                                                                     i29 = j + 4;
/* 5500 */                                                                     i27 = k + 4;
/* 5501 */                                                                     i18 = 0;
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                     for (;;)
/*      */                                                                     {
/* 5510 */                                                                       i19 = i5 - i18;
/* 5511 */                                                                       i20 = i17 + i18 * -8;
/* 5512 */                                                                       i21 = MainMemory.getI32(i4);
/* 5513 */                                                                       if (i21 != 0)
/*      */                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5524 */                                                                         i22 = (i6 << 3) + -8;
/* 5525 */                                                                         i23 = i6 + -1;
/* 5526 */                                                                         i24 = 0;
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                         for (;;)
/*      */                                                                         {
/* 5533 */                                                                           i38 = i22 + i24 * -8;
/* 5534 */                                                                           i25 = i23 - i24;
/* 5535 */                                                                           i39 = MainMemory.getI32(i27);
/* 5536 */                                                                           if (i39 <= 1) {
/*      */                                                                             break label18620;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5546 */                                                                           paramInt = MainMemory.getI32(i29);
/* 5547 */                                                                           MainMemory.setF64(i14, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 5548 */                                                                           MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                                           
/*      */                                                                           break label18641;
/*      */                                                                           
/*      */                                                                           label18620:
/* 5553 */                                                                           F293294_100.call(i19, i9, i14, i20, i39, i29);
/*      */                                                                           
/*      */ 
/*      */                                                                           label18641:
/*      */                                                                           
/*      */ 
/* 5559 */                                                                           i39 = MainMemory.getI32(k);
/* 5560 */                                                                           if (i39 <= 1) {
/*      */                                                                             break label18725;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5570 */                                                                           paramInt = MainMemory.getI32(j);
/* 5571 */                                                                           MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 5572 */                                                                           b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25);
/* 5573 */                                                                           MainMemory.setI8(n, b2);
/*      */                                                                           
/*      */                                                                           break label18815;
/*      */                                                                           
/*      */                                                                           label18725:
/*      */                                                                           
/* 5579 */                                                                           if (i39 != 0) {
/*      */                                                                             break label18764;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5589 */                                                                           b2 = MainMemory.getI8(n);
/*      */                                                                           
/*      */                                                                           break label18815;
/*      */                                                                           
/*      */                                                                           label18764:
/*      */                                                                           
/* 5595 */                                                                           paramInt = MainMemory.getI32(j);
/* 5596 */                                                                           MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i20));
/* 5597 */                                                                           b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19);
/* 5598 */                                                                           MainMemory.setI8(n, b2);
/*      */                                                                           
/*      */ 
/*      */ 
/*      */                                                                           label18815:
/*      */                                                                           
/*      */ 
/*      */ 
/* 5606 */                                                                           bool1 = b2 == 0;
/* 5607 */                                                                           b2 = MainMemory.getI8(i9);
/* 5608 */                                                                           if (!bool1)
/*      */                                                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5618 */                                                                             if (b2 != 0) {
/*      */                                                                               break label19061;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5628 */                                                                             if (!bool1) {
/*      */                                                                               break label19019;
/*      */                                                                             }
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5638 */                                                                           bool1 = b2 == 0;
/* 5639 */                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 5640 */                                                                           i15 = MainMemory.getI32(i12);
/* 5641 */                                                                           d1 = MainMemory.getF64(i13);
/* 5642 */                                                                           if (!bool1) {
/*      */                                                                             break label18995;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5652 */                                                                           d2 = MainMemory.getF64(i14);
/* 5653 */                                                                           MainMemory.setF64(i15 + (i25 << 3), MathUtils.f_olt(d1, d2) ? d1 : d2);
/*      */                                                                           
/*      */                                                                           break label19093;
/*      */                                                                           
/*      */                                                                           label18995:
/* 5658 */                                                                           MainMemory.setF64(i15 + (i25 << 3), d1);
/*      */                                                                           
/*      */                                                                           break label19093;
/*      */                                                                           
/*      */                                                                           label19019:
/* 5663 */                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 5664 */                                                                           MainMemory.setF64(MainMemory.getI32(i12) + (i25 << 3), MainMemory.getF64(i14));
/*      */                                                                           
/*      */                                                                           break label19093;
/*      */                                                                           
/*      */                                                                           label19061:
/* 5669 */                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)1);
/* 5670 */                                                                           MainMemory.setF64(MainMemory.getI32(i12) + (i25 << 3), 0.0D);
/*      */                                                                           
/*      */ 
/*      */                                                                           label19093:
/*      */                                                                           
/*      */ 
/* 5676 */                                                                           i24 += 1;
/* 5677 */                                                                           if (i24 == i21) {
/*      */                                                                             break;
/*      */                                                                           }
/*      */                                                                         }
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5688 */                                                                         i6 -= i21;
/*      */                                                                       }
/*      */                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5696 */                                                                       i18 += 1;
/* 5697 */                                                                       if (i18 == i3) { break label31365;
/* 5698 */                                                                         break;
/*      */                                                                       }
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */                                                                     label19167:
/*      */                                                                     
/*      */ 
/*      */ 
/* 5708 */                                                                     if (i3 != 0)
/*      */                                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5718 */                                                                       i9 = n + 1;
/* 5719 */                                                                       i8 = paramInt + 84;
/* 5720 */                                                                       i26 = paramInt + 88;
/* 5721 */                                                                       i27 = m + 320;
/* 5722 */                                                                       i28 = m + 32;
/* 5723 */                                                                       i5 = i3 + -1;
/* 5724 */                                                                       i17 = (i3 << 2) + -4;
/* 5725 */                                                                       i29 = j + 4;
/* 5726 */                                                                       i30 = k + 4;
/* 5727 */                                                                       i18 = 0;
/*      */                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                       for (;;)
/*      */                                                                       {
/* 5736 */                                                                         i19 = i5 - i18;
/* 5737 */                                                                         i20 = i17 + i18 * -4;
/* 5738 */                                                                         i21 = MainMemory.getI32(i4);
/* 5739 */                                                                         if (i21 != 0)
/*      */                                                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5750 */                                                                           i22 = (i6 << 2) + -4;
/* 5751 */                                                                           i23 = i6 + -1;
/* 5752 */                                                                           i24 = 0;
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                           for (;;)
/*      */                                                                           {
/* 5759 */                                                                             i38 = i22 + i24 * -4;
/* 5760 */                                                                             i25 = i23 - i24;
/* 5761 */                                                                             i39 = MainMemory.getI32(i30);
/* 5762 */                                                                             if (i39 <= 1) {
/*      */                                                                               break label19414;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5772 */                                                                             paramInt = MainMemory.getI32(i29);
/* 5773 */                                                                             MainMemory.setI32(i27, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/* 5774 */                                                                             MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                                             
/*      */                                                                             break label19435;
/*      */                                                                             
/*      */                                                                             label19414:
/* 5779 */                                                                             F293294_112.call(i39, i19, i27, i9, i20, i29);
/*      */                                                                             
/*      */ 
/*      */                                                                             label19435:
/*      */                                                                             
/*      */ 
/* 5785 */                                                                             i39 = MainMemory.getI32(k);
/* 5786 */                                                                             if (i39 <= 1) {
/*      */                                                                               break label19519;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5796 */                                                                             paramInt = MainMemory.getI32(j);
/* 5797 */                                                                             MainMemory.setI32(i28, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i38));
/* 5798 */                                                                             b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25);
/* 5799 */                                                                             MainMemory.setI8(n, b2);
/*      */                                                                             
/*      */                                                                             break label19609;
/*      */                                                                             
/*      */                                                                             label19519:
/*      */                                                                             
/* 5805 */                                                                             if (i39 != 0) {
/*      */                                                                               break label19558;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5815 */                                                                             b2 = MainMemory.getI8(n);
/*      */                                                                             
/*      */                                                                             break label19609;
/*      */                                                                             
/*      */                                                                             label19558:
/*      */                                                                             
/* 5821 */                                                                             paramInt = MainMemory.getI32(j);
/* 5822 */                                                                             MainMemory.setI32(i28, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + i20));
/* 5823 */                                                                             b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19);
/* 5824 */                                                                             MainMemory.setI8(n, b2);
/*      */                                                                             
/*      */ 
/*      */ 
/*      */                                                                             label19609:
/*      */                                                                             
/*      */ 
/*      */ 
/* 5832 */                                                                             bool1 = b2 == 0;
/* 5833 */                                                                             b2 = MainMemory.getI8(i9);
/* 5834 */                                                                             if (!bool1)
/*      */                                                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5844 */                                                                               if (b2 != 0) {
/*      */                                                                                 break label19855;
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5854 */                                                                               if (!bool1) {
/*      */                                                                                 break label19813;
/*      */                                                                               }
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5864 */                                                                             bool1 = b2 == 0;
/* 5865 */                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 5866 */                                                                             i44 = MainMemory.getI32(i26);
/* 5867 */                                                                             if (!bool1) {
/*      */                                                                               break label19786;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5877 */                                                                             i38 = MainMemory.getI32(i27);
/* 5878 */                                                                             i39 = MainMemory.getI32(i28);
/* 5879 */                                                                             MainMemory.setI32(i44 + (i25 << 2), i38 <= i39 ? i38 : i39);
/*      */                                                                             
/*      */                                                                             break label19887;
/*      */                                                                             
/*      */                                                                             label19786:
/* 5884 */                                                                             MainMemory.setI32(i44 + (i25 << 2), MainMemory.getI32(i28));
/*      */                                                                             
/*      */                                                                             break label19887;
/*      */                                                                             
/*      */                                                                             label19813:
/* 5889 */                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)0);
/* 5890 */                                                                             MainMemory.setI32(MainMemory.getI32(i26) + (i25 << 2), MainMemory.getI32(i27));
/*      */                                                                             
/*      */                                                                             break label19887;
/*      */                                                                             
/*      */                                                                             label19855:
/* 5895 */                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i25, (byte)1);
/* 5896 */                                                                             MainMemory.setI32(MainMemory.getI32(i26) + (i25 << 2), 0);
/*      */                                                                             
/*      */ 
/*      */                                                                             label19887:
/*      */                                                                             
/*      */ 
/* 5902 */                                                                             i24 += 1;
/* 5903 */                                                                             if (i24 == i21) {
/*      */                                                                               break;
/*      */                                                                             }
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5914 */                                                                           i6 -= i21;
/*      */                                                                         }
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5922 */                                                                         i18 += 1;
/* 5923 */                                                                         if (i18 == i3) { break label31365;
/* 5924 */                                                                           break;
/*      */                                                                         }
/*      */                                                                       }
/*      */                                                                       
/*      */ 
/*      */ 
/*      */                                                                       label19961:
/*      */                                                                       
/*      */ 
/*      */ 
/* 5934 */                                                                       i2 = MainMemory.getI32(j);
/* 5935 */                                                                       i17 = MainMemory.getI32(i2 + 56) * i3;
/* 5936 */                                                                       switch (MainMemory.getI32(paramInt + 52))
/*      */                                                                       {
/*      */                                                                       case 259: 
/*      */                                                                         break label20656;
/*      */                                                                         break;
/*      */                                                                       case 260: 
/*      */                                                                         break label20298;
/*      */                                                                         break;
/*      */                                                                       case 262: 
/*      */                                                                         break;
/*      */                                                                       }
/*      */                                                                       
/* 5948 */                                                                       if (i3 != 0)
/*      */                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5958 */                                                                         i47 = paramInt + 88;
/* 5959 */                                                                         i6 = i3 + -1;
/* 5960 */                                                                         paramInt = i2;
/* 5961 */                                                                         i5 = 0;
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 5969 */                                                                         i17 = i6 - i5;
/* 5970 */                                                                         i9 = MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i17 << 2));
/* 5971 */                                                                         b2 = MainMemory.getI8(i9);
/* 5972 */                                                                         if (b2 == 0) {
/* 5973 */                                                                           b2 = 49;
/*      */                                                                           break label20202;
/*      */                                                                         }
/*      */                                                                         else {
/* 5977 */                                                                           i18 = 1;
/* 5978 */                                                                           b1 = 49;
/*      */                                                                         }
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                         for (;;)
/*      */                                                                         {
/* 5989 */                                                                           b1 = b2 == 48 ? 48 : b1;
/* 5990 */                                                                           b2 = MainMemory.getI8(i9 + i18);
/* 5991 */                                                                           if (b2 == 0) {
/* 5992 */                                                                             b2 = b1;
/*      */                                                                           } else {
/*      */                                                                             break label20280;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */                                                                           label20202:
/*      */                                                                           
/*      */ 
/*      */ 
/* 6003 */                                                                           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i47) + (i17 << 2)), b2);
/* 6004 */                                                                           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i47) + (i17 << 2)) + 1, (byte)0);
/* 6005 */                                                                           i5 += 1;
/* 6006 */                                                                           if (i5 == i3) {
/*      */                                                                             break label31365;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6016 */                                                                           paramInt = MainMemory.getI32(j);
/*      */                                                                           
/*      */ 
/* 6019 */                                                                           break;
/*      */                                                                           
/*      */                                                                           label20280:
/*      */                                                                           
/* 6023 */                                                                           i18 += 1;
/*      */                                                                         }
/*      */                                                                         
/*      */ 
/*      */ 
/*      */                                                                         label20298:
/*      */                                                                         
/*      */ 
/* 6031 */                                                                         if (i3 != 0)
/*      */                                                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6041 */                                                                           i8 = paramInt + 84;
/* 6042 */                                                                           i12 = paramInt + 88;
/* 6043 */                                                                           i6 = i3 + -1;
/* 6044 */                                                                           i5 = 0;
/* 6045 */                                                                           i18 = i17;
/* 6046 */                                                                           d1 = 0.0D;
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6055 */                                                                           i17 = i6 - i5;
/* 6056 */                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/* 6057 */                                                                           i19 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/*      */                                                                           
/* 6059 */                                                                           i20 = i19;
/* 6060 */                                                                           i21 = i18;
/* 6061 */                                                                           i19 = 1;
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                           for (;;)
/*      */                                                                           {
/* 6071 */                                                                             i22 = i20 + -1;
/* 6072 */                                                                             i23 = i21 + -1;
/* 6073 */                                                                             i24 = 0;
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                             for (;;)
/*      */                                                                             {
/* 6080 */                                                                               i20 = i22 - i24;
/* 6081 */                                                                               i18 = i23 - i24;
/* 6082 */                                                                               if (i20 != -1) {
/*      */                                                                                 break label20507;
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6092 */                                                                               i18 = i21 - i24;
/* 6093 */                                                                               MainMemory.setF64(MainMemory.getI32(i12) + (i17 << 3), d1);
/* 6094 */                                                                               i5 += 1;
/* 6095 */                                                                               if (i5 == i3) {
/*      */                                                                                 break label31365;
/*      */                                                                               } else {
/*      */                                                                                 break;
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */                                                                               label20507:
/*      */                                                                               
/*      */ 
/*      */ 
/* 6107 */                                                                               paramInt = MainMemory.getI32(j);
/* 6108 */                                                                               i24 += 1;
/* 6109 */                                                                               if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i18) == 0) {
/*      */                                                                                 break label20549;
/*      */                                                                               }
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */                                                                             label20549:
/*      */                                                                             
/*      */ 
/*      */ 
/* 6120 */                                                                             d2 = MainMemory.getF64(MainMemory.getI32(paramInt + 88) + (i18 << 3));
/* 6121 */                                                                             if (i19 != 0)
/*      */                                                                             {
/*      */ 
/*      */ 
/* 6125 */                                                                               d1 = d2;
/* 6126 */                                                                               i19 = 0;
/*      */ 
/*      */ 
/*      */                                                                             }
/*      */                                                                             else
/*      */                                                                             {
/*      */ 
/* 6133 */                                                                               if (!MathUtils.f_ule(d2, d1)) {
/*      */                                                                                 break label20628;
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6145 */                                                                               d1 = d2;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */                                                                             label20628:
/*      */                                                                             
/*      */ 
/*      */ 
/* 6154 */                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/*      */                                                                             
/*      */ 
/* 6157 */                                                                             i21 = i18;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */                                                                           label20656:
/*      */                                                                           
/* 6163 */                                                                           if (i3 != 0)
/*      */                                                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6173 */                                                                             i8 = paramInt + 84;
/* 6174 */                                                                             i26 = paramInt + 88;
/* 6175 */                                                                             i6 = i3 + -1;
/* 6176 */                                                                             i5 = 0;
/* 6177 */                                                                             i19 = i17;
/* 6178 */                                                                             i18 = 0;
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6187 */                                                                             i17 = i6 - i5;
/* 6188 */                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/* 6189 */                                                                             i20 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/*      */                                                                             
/* 6191 */                                                                             i21 = i20;
/* 6192 */                                                                             i22 = i19;
/* 6193 */                                                                             i20 = 1;
/*      */                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                             for (;;)
/*      */                                                                             {
/* 6203 */                                                                               i23 = i21 + -1;
/* 6204 */                                                                               i24 = i22 + -1;
/* 6205 */                                                                               i25 = 0;
/*      */                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                               for (;;)
/*      */                                                                               {
/* 6212 */                                                                                 i21 = i23 - i25;
/* 6213 */                                                                                 i19 = i24 - i25;
/* 6214 */                                                                                 if (i21 != -1) {
/*      */                                                                                   break label20865;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6224 */                                                                                 i19 = i22 - i25;
/* 6225 */                                                                                 MainMemory.setI32(MainMemory.getI32(i26) + (i17 << 2), i18);
/* 6226 */                                                                                 i5 += 1;
/* 6227 */                                                                                 if (i5 == i3) {
/*      */                                                                                   break label31365;
/*      */                                                                                 } else {
/*      */                                                                                   break;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */                                                                                 label20865:
/*      */                                                                                 
/*      */ 
/*      */ 
/* 6239 */                                                                                 paramInt = MainMemory.getI32(j);
/* 6240 */                                                                                 i25 += 1;
/* 6241 */                                                                                 if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19) == 0) {
/*      */                                                                                   break label20907;
/*      */                                                                                 }
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */                                                                               label20907:
/*      */                                                                               
/*      */ 
/*      */ 
/* 6252 */                                                                               i22 = MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i19 << 2));
/* 6253 */                                                                               if (i20 != 0)
/*      */                                                                               {
/*      */ 
/*      */ 
/* 6257 */                                                                                 i18 = i22;
/* 6258 */                                                                                 i20 = 0;
/*      */ 
/*      */ 
/*      */                                                                               }
/*      */                                                                               else
/*      */                                                                               {
/*      */ 
/* 6265 */                                                                                 i18 = i22 <= i18 ? i22 : i18;
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6275 */                                                                               MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/*      */                                                                               
/*      */ 
/* 6278 */                                                                               i22 = i19;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */                                                                             label21001:
/*      */                                                                             
/* 6284 */                                                                             if (i6 != 0)
/*      */                                                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6294 */                                                                               i8 = paramInt + 84;
/* 6295 */                                                                               i12 = paramInt + 88;
/* 6296 */                                                                               i3 *= i5;
/* 6297 */                                                                               i6 = i3 + -1;
/* 6298 */                                                                               i5 = 0;
/*      */                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                               for (;;)
/*      */                                                                               {
/* 6305 */                                                                                 i17 = i6 - i5;
/* 6306 */                                                                                 b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6307 */                                                                                 MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6308 */                                                                                 if (b2 != 0) {
/*      */                                                                                   break label21160;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6318 */                                                                                 i13 = MainMemory.getI32(i12);
/* 6319 */                                                                                 d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3)) + 0.5D;
/* 6320 */                                                                                 MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.floor(d1));
/*      */                                                                                 
/*      */ 
/*      */                                                                                 label21160:
/*      */                                                                                 
/*      */ 
/* 6326 */                                                                                 i5 += 1;
/* 6327 */                                                                                 if (i5 == i3) { break label31365;
/* 6328 */                                                                                   break;
/*      */                                                                                 }
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */                                                                               label21193:
/*      */                                                                               
/*      */ 
/* 6337 */                                                                               if (i6 != 0)
/*      */                                                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6347 */                                                                                 i8 = paramInt + 84;
/* 6348 */                                                                                 i12 = paramInt + 88;
/* 6349 */                                                                                 i3 *= i5;
/* 6350 */                                                                                 i6 = i3 + -1;
/* 6351 */                                                                                 i5 = 0;
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                 for (;;)
/*      */                                                                                 {
/* 6358 */                                                                                   i17 = i6 - i5;
/* 6359 */                                                                                   b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6360 */                                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6361 */                                                                                   if (b2 != 0) {
/*      */                                                                                     break label21344;
/*      */                                                                                   }
/*      */                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6371 */                                                                                   i13 = MainMemory.getI32(i12);
/* 6372 */                                                                                   MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.floor(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                   
/*      */ 
/*      */                                                                                   label21344:
/*      */                                                                                   
/*      */ 
/* 6378 */                                                                                   i5 += 1;
/* 6379 */                                                                                   if (i5 == i3) { break label31365;
/* 6380 */                                                                                     break;
/*      */                                                                                   }
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */                                                                                 label21377:
/*      */                                                                                 
/*      */ 
/* 6389 */                                                                                 if (i6 != 0)
/*      */                                                                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6399 */                                                                                   i8 = paramInt + 84;
/* 6400 */                                                                                   i12 = paramInt + 88;
/* 6401 */                                                                                   i3 *= i5;
/* 6402 */                                                                                   i6 = i3 + -1;
/* 6403 */                                                                                   i5 = 0;
/*      */                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                   for (;;)
/*      */                                                                                   {
/* 6410 */                                                                                     i17 = i6 - i5;
/* 6411 */                                                                                     b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6412 */                                                                                     MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6413 */                                                                                     if (b2 != 0) {
/*      */                                                                                       break label21528;
/*      */                                                                                     }
/*      */                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6423 */                                                                                     i13 = MainMemory.getI32(i12);
/* 6424 */                                                                                     MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.ceil(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                     
/*      */ 
/*      */                                                                                     label21528:
/*      */                                                                                     
/*      */ 
/* 6430 */                                                                                     i5 += 1;
/* 6431 */                                                                                     if (i5 == i3) { break label31365;
/* 6432 */                                                                                       break;
/*      */                                                                                     }
/*      */                                                                                   }
/*      */                                                                                   
/*      */ 
/*      */ 
/*      */                                                                                   label21561:
/*      */                                                                                   
/*      */ 
/* 6441 */                                                                                   if (i3 != 0)
/*      */                                                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6451 */                                                                                     i8 = paramInt + 84;
/* 6452 */                                                                                     i9 = n + 1;
/* 6453 */                                                                                     i12 = paramInt + 88;
/* 6454 */                                                                                     i13 = m + 320;
/* 6455 */                                                                                     i14 = m + 32;
/* 6456 */                                                                                     i5 = i3 + -1;
/* 6457 */                                                                                     i17 = (i3 << 3) + -8;
/* 6458 */                                                                                     i29 = j + 4;
/* 6459 */                                                                                     i27 = k + 4;
/* 6460 */                                                                                     i18 = 0;
/*      */                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                     for (;;)
/*      */                                                                                     {
/* 6469 */                                                                                       i19 = i5 - i18;
/* 6470 */                                                                                       i20 = i17 + i18 * -8;
/* 6471 */                                                                                       i21 = MainMemory.getI32(i4);
/* 6472 */                                                                                       if (i21 != 0)
/*      */                                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6483 */                                                                                         i22 = i6 + -1;
/* 6484 */                                                                                         i23 = (i6 << 3) + -8;
/* 6485 */                                                                                         i24 = 0;
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                         for (;;)
/*      */                                                                                         {
/* 6492 */                                                                                           i25 = i22 - i24;
/* 6493 */                                                                                           i38 = i23 + i24 * -8;
/* 6494 */                                                                                           i39 = MainMemory.getI32(i27);
/* 6495 */                                                                                           if (i39 <= 1) {
/*      */                                                                                             break label21807;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6505 */                                                                                           paramInt = MainMemory.getI32(i29);
/* 6506 */                                                                                           MainMemory.setF64(i13, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 6507 */                                                                                           MainMemory.setI8(i9, MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25));
/*      */                                                                                           
/*      */                                                                                           break label21828;
/*      */                                                                                           
/*      */                                                                                           label21807:
/* 6512 */                                                                                           F293294_098.call(i19, i29, i9, i39, i20, i13);
/*      */                                                                                           
/*      */ 
/*      */                                                                                           label21828:
/*      */                                                                                           
/*      */ 
/* 6518 */                                                                                           i39 = MainMemory.getI32(k);
/* 6519 */                                                                                           if (i39 <= 1) {
/*      */                                                                                             break label21912;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6529 */                                                                                           paramInt = MainMemory.getI32(j);
/* 6530 */                                                                                           MainMemory.setF64(i14, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i38));
/* 6531 */                                                                                           b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i25);
/* 6532 */                                                                                           MainMemory.setI8(n, b2);
/*      */                                                                                           
/*      */                                                                                           break label22002;
/*      */                                                                                           
/*      */                                                                                           label21912:
/*      */                                                                                           
/* 6538 */                                                                                           if (i39 != 0) {
/*      */                                                                                             break label21951;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6548 */                                                                                           b2 = MainMemory.getI8(n);
/*      */                                                                                           
/*      */                                                                                           break label22002;
/*      */                                                                                           
/*      */                                                                                           label21951:
/*      */                                                                                           
/* 6554 */                                                                                           paramInt = MainMemory.getI32(j);
/* 6555 */                                                                                           MainMemory.setF64(i14, MainMemory.getF64(MainMemory.getI32(paramInt + 88) + i20));
/* 6556 */                                                                                           b2 = MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i19);
/* 6557 */                                                                                           MainMemory.setI8(n, b2);
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */                                                                                           label22002:
/*      */                                                                                           
/*      */ 
/*      */ 
/* 6565 */                                                                                           i10 = MainMemory.getI32(i8);
/* 6566 */                                                                                           if (b2 != 0) {
/*      */                                                                                             break label22103;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6576 */                                                                                           if (MainMemory.getI8(i9) != 0) {
/*      */                                                                                             break label22103;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6586 */                                                                                           MainMemory.setI8(i10 + i25, (byte)0);
/* 6587 */                                                                                           i15 = MainMemory.getI32(i12);
/* 6588 */                                                                                           MainMemory.setF64(i15 + (i25 << 3), SystemLibrary.atan2(MainMemory.getF64(i14), MainMemory.getF64(i13)));
/*      */                                                                                           
/*      */                                                                                           break label22118;
/*      */                                                                                           
/*      */                                                                                           label22103:
/* 6593 */                                                                                           MainMemory.setI8(i10 + i25, (byte)1);
/*      */                                                                                           
/*      */ 
/*      */                                                                                           label22118:
/*      */                                                                                           
/*      */ 
/* 6599 */                                                                                           i24 += 1;
/* 6600 */                                                                                           if (i24 == i21) {
/*      */                                                                                             break;
/*      */                                                                                           }
/*      */                                                                                         }
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6611 */                                                                                         i6 -= i21;
/*      */                                                                                       }
/*      */                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6619 */                                                                                       i18 += 1;
/* 6620 */                                                                                       if (i18 == i3) { break label31365;
/* 6621 */                                                                                         break;
/*      */                                                                                       }
/*      */                                                                                     }
/*      */                                                                                     
/*      */ 
/*      */ 
/*      */                                                                                     label22192:
/*      */                                                                                     
/*      */ 
/*      */ 
/* 6631 */                                                                                     i2 = MainMemory.getI32(j);
/* 6632 */                                                                                     bool1 = i6 == 0;
/* 6633 */                                                                                     if (MainMemory.getI32(i2 + 52) != 260) {
/*      */                                                                                       break label22262;
/*      */                                                                                     }
/*      */                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6643 */                                                                                     F293294_068.call(j, i5, paramInt, i2, bool1, i3);
/*      */                                                                                     
/*      */                                                                                     break label31365;
/*      */                                                                                     
/*      */                                                                                     label22262:
/* 6648 */                                                                                     F293294_081.call(j, i5, paramInt, i2, bool1, i3);
/*      */                                                                                     
/*      */                                                                                     break label31365;
/*      */                                                                                     
/*      */                                                                                     label22286:
/* 6653 */                                                                                     if (i6 != 0)
/*      */                                                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6663 */                                                                                       i8 = paramInt + 84;
/* 6664 */                                                                                       i12 = paramInt + 88;
/* 6665 */                                                                                       i3 *= i5;
/* 6666 */                                                                                       i6 = i3 + -1;
/* 6667 */                                                                                       i5 = 0;
/*      */                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                       for (;;)
/*      */                                                                                       {
/* 6674 */                                                                                         i17 = i6 - i5;
/* 6675 */                                                                                         b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6676 */                                                                                         MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6677 */                                                                                         if (b2 != 0) {
/*      */                                                                                           break label22500;
/*      */                                                                                         }
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6687 */                                                                                         d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3));
/* 6688 */                                                                                         i13 = MainMemory.getI32(i12);
/* 6689 */                                                                                         if (!MathUtils.f_olt(d1, 0.0D)) {
/*      */                                                                                           break label22479;
/*      */                                                                                         }
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6699 */                                                                                         MainMemory.setF64(i13 + (i17 << 3), 0.0D);
/* 6700 */                                                                                         MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/*      */                                                                                         
/*      */                                                                                         break label22500;
/*      */                                                                                         
/*      */                                                                                         label22479:
/* 6705 */                                                                                         MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.sqrt(d1));
/*      */                                                                                         
/*      */ 
/*      */                                                                                         label22500:
/*      */                                                                                         
/*      */ 
/* 6711 */                                                                                         i5 += 1;
/* 6712 */                                                                                         if (i5 == i3) { break label31365;
/* 6713 */                                                                                           break;
/*      */                                                                                         }
/*      */                                                                                       }
/*      */                                                                                       
/*      */ 
/*      */ 
/*      */                                                                                       label22533:
/*      */                                                                                       
/*      */ 
/* 6722 */                                                                                       if (i6 != 0)
/*      */                                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6732 */                                                                                         i8 = paramInt + 84;
/* 6733 */                                                                                         i12 = paramInt + 88;
/* 6734 */                                                                                         i3 *= i5;
/* 6735 */                                                                                         i6 = i3 + -1;
/* 6736 */                                                                                         i5 = 0;
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                         for (;;)
/*      */                                                                                         {
/* 6743 */                                                                                           i17 = i6 - i5;
/* 6744 */                                                                                           b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6745 */                                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6746 */                                                                                           if (b2 != 0) {
/*      */                                                                                             break label22747;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6756 */                                                                                           d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3));
/* 6757 */                                                                                           i13 = MainMemory.getI32(i12);
/* 6758 */                                                                                           if (!MathUtils.f_ugt(d1, 0.0D)) {
/*      */                                                                                             break label22718;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6768 */                                                                                           MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.log10(d1));
/*      */                                                                                           
/*      */                                                                                           break label22747;
/*      */                                                                                           
/*      */                                                                                           label22718:
/* 6773 */                                                                                           MainMemory.setF64(i13 + (i17 << 3), 0.0D);
/* 6774 */                                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/*      */                                                                                           
/*      */ 
/*      */                                                                                           label22747:
/*      */                                                                                           
/*      */ 
/* 6780 */                                                                                           i5 += 1;
/* 6781 */                                                                                           if (i5 == i3) { break label31365;
/* 6782 */                                                                                             break;
/*      */                                                                                           }
/*      */                                                                                         }
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                         label22780:
/*      */                                                                                         
/*      */ 
/* 6791 */                                                                                         if (i6 != 0)
/*      */                                                                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6801 */                                                                                           i8 = paramInt + 84;
/* 6802 */                                                                                           i12 = paramInt + 88;
/* 6803 */                                                                                           i3 *= i5;
/* 6804 */                                                                                           i6 = i3 + -1;
/* 6805 */                                                                                           i5 = 0;
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                           for (;;)
/*      */                                                                                           {
/* 6812 */                                                                                             i17 = i6 - i5;
/* 6813 */                                                                                             b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6814 */                                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6815 */                                                                                             if (b2 != 0) {
/*      */                                                                                               break label22994;
/*      */                                                                                             }
/*      */                                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6825 */                                                                                             d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3));
/* 6826 */                                                                                             i13 = MainMemory.getI32(i12);
/* 6827 */                                                                                             if (!MathUtils.f_ugt(d1, 0.0D)) {
/*      */                                                                                               break label22965;
/*      */                                                                                             }
/*      */                                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6837 */                                                                                             MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.log(d1));
/*      */                                                                                             
/*      */                                                                                             break label22994;
/*      */                                                                                             
/*      */                                                                                             label22965:
/* 6842 */                                                                                             MainMemory.setF64(i13 + (i17 << 3), 0.0D);
/* 6843 */                                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/*      */                                                                                             
/*      */ 
/*      */                                                                                             label22994:
/*      */                                                                                             
/*      */ 
/* 6849 */                                                                                             i5 += 1;
/* 6850 */                                                                                             if (i5 == i3) { break label31365;
/* 6851 */                                                                                               break;
/*      */                                                                                             }
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */                                                                                           label23027:
/*      */                                                                                           
/*      */ 
/* 6860 */                                                                                           if (i6 != 0)
/*      */                                                                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6870 */                                                                                             i8 = paramInt + 84;
/* 6871 */                                                                                             i12 = paramInt + 88;
/* 6872 */                                                                                             i3 *= i5;
/* 6873 */                                                                                             i6 = i3 + -1;
/* 6874 */                                                                                             i5 = 0;
/*      */                                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                             for (;;)
/*      */                                                                                             {
/* 6881 */                                                                                               i17 = i6 - i5;
/* 6882 */                                                                                               b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6883 */                                                                                               MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6884 */                                                                                               if (b2 != 0) {
/*      */                                                                                                 break label23178;
/*      */                                                                                               }
/*      */                                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6894 */                                                                                               i13 = MainMemory.getI32(i12);
/* 6895 */                                                                                               MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.exp(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                               
/*      */ 
/*      */                                                                                               label23178:
/*      */                                                                                               
/*      */ 
/* 6901 */                                                                                               i5 += 1;
/* 6902 */                                                                                               if (i5 == i3) { break label31365;
/* 6903 */                                                                                                 break;
/*      */                                                                                               }
/*      */                                                                                             }
/*      */                                                                                             
/*      */ 
/*      */ 
/*      */                                                                                             label23211:
/*      */                                                                                             
/*      */ 
/* 6912 */                                                                                             if (i6 != 0)
/*      */                                                                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6922 */                                                                                               i8 = paramInt + 84;
/* 6923 */                                                                                               i12 = paramInt + 88;
/* 6924 */                                                                                               i3 *= i5;
/* 6925 */                                                                                               i6 = i3 + -1;
/* 6926 */                                                                                               i5 = 0;
/*      */                                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                               for (;;)
/*      */                                                                                               {
/* 6933 */                                                                                                 i17 = i6 - i5;
/* 6934 */                                                                                                 b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6935 */                                                                                                 MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6936 */                                                                                                 if (b2 != 0) {
/*      */                                                                                                   break label23362;
/*      */                                                                                                 }
/*      */                                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6946 */                                                                                                 i13 = MainMemory.getI32(i12);
/* 6947 */                                                                                                 MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.tanh(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                                 
/*      */ 
/*      */                                                                                                 label23362:
/*      */                                                                                                 
/*      */ 
/* 6953 */                                                                                                 i5 += 1;
/* 6954 */                                                                                                 if (i5 == i3) { break label31365;
/* 6955 */                                                                                                   break;
/*      */                                                                                                 }
/*      */                                                                                               }
/*      */                                                                                               
/*      */ 
/*      */ 
/*      */                                                                                               label23395:
/*      */                                                                                               
/*      */ 
/* 6964 */                                                                                               if (i6 != 0)
/*      */                                                                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6974 */                                                                                                 i8 = paramInt + 84;
/* 6975 */                                                                                                 i12 = paramInt + 88;
/* 6976 */                                                                                                 i3 *= i5;
/* 6977 */                                                                                                 i6 = i3 + -1;
/* 6978 */                                                                                                 i5 = 0;
/*      */                                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                 for (;;)
/*      */                                                                                                 {
/* 6985 */                                                                                                   i17 = i6 - i5;
/* 6986 */                                                                                                   b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 6987 */                                                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 6988 */                                                                                                   if (b2 != 0) {
/*      */                                                                                                     break label23546;
/*      */                                                                                                   }
/*      */                                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 6998 */                                                                                                   i13 = MainMemory.getI32(i12);
/* 6999 */                                                                                                   MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.cosh(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                                   
/*      */ 
/*      */                                                                                                   label23546:
/*      */                                                                                                   
/*      */ 
/* 7005 */                                                                                                   i5 += 1;
/* 7006 */                                                                                                   if (i5 == i3) { break label31365;
/* 7007 */                                                                                                     break;
/*      */                                                                                                   }
/*      */                                                                                                 }
/*      */                                                                                                 
/*      */ 
/*      */ 
/*      */                                                                                                 label23579:
/*      */                                                                                                 
/*      */ 
/* 7016 */                                                                                                 if (i6 != 0)
/*      */                                                                                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7026 */                                                                                                   i8 = paramInt + 84;
/* 7027 */                                                                                                   i12 = paramInt + 88;
/* 7028 */                                                                                                   i3 *= i5;
/* 7029 */                                                                                                   i6 = i3 + -1;
/* 7030 */                                                                                                   i5 = 0;
/*      */                                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                   for (;;)
/*      */                                                                                                   {
/* 7037 */                                                                                                     i17 = i6 - i5;
/* 7038 */                                                                                                     b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 7039 */                                                                                                     MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 7040 */                                                                                                     if (b2 != 0) {
/*      */                                                                                                       break label23730;
/*      */                                                                                                     }
/*      */                                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7050 */                                                                                                     i13 = MainMemory.getI32(i12);
/* 7051 */                                                                                                     MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.sinh(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                                     
/*      */ 
/*      */                                                                                                     label23730:
/*      */                                                                                                     
/*      */ 
/* 7057 */                                                                                                     i5 += 1;
/* 7058 */                                                                                                     if (i5 == i3) { break label31365;
/* 7059 */                                                                                                       break;
/*      */                                                                                                     }
/*      */                                                                                                   }
/*      */                                                                                                   
/*      */ 
/*      */ 
/*      */                                                                                                   label23763:
/*      */                                                                                                   
/*      */ 
/* 7068 */                                                                                                   if (i6 != 0)
/*      */                                                                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7078 */                                                                                                     i8 = paramInt + 84;
/* 7079 */                                                                                                     i12 = paramInt + 88;
/* 7080 */                                                                                                     i3 *= i5;
/* 7081 */                                                                                                     i6 = i3 + -1;
/* 7082 */                                                                                                     i5 = 0;
/*      */                                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                     for (;;)
/*      */                                                                                                     {
/* 7089 */                                                                                                       i17 = i6 - i5;
/* 7090 */                                                                                                       b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 7091 */                                                                                                       MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 7092 */                                                                                                       if (b2 != 0) {
/*      */                                                                                                         break label23914;
/*      */                                                                                                       }
/*      */                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7102 */                                                                                                       i13 = MainMemory.getI32(i12);
/* 7103 */                                                                                                       MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.atan(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                                       
/*      */ 
/*      */                                                                                                       label23914:
/*      */                                                                                                       
/*      */ 
/* 7109 */                                                                                                       i5 += 1;
/* 7110 */                                                                                                       if (i5 == i3) { break label31365;
/* 7111 */                                                                                                         break;
/*      */                                                                                                       }
/*      */                                                                                                     }
/*      */                                                                                                     
/*      */ 
/*      */ 
/*      */                                                                                                     label23947:
/*      */                                                                                                     
/*      */ 
/* 7120 */                                                                                                     if (i6 != 0)
/*      */                                                                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7130 */                                                                                                       i8 = paramInt + 84;
/* 7131 */                                                                                                       i12 = paramInt + 88;
/* 7132 */                                                                                                       i3 *= i5;
/* 7133 */                                                                                                       i6 = i3 + -1;
/* 7134 */                                                                                                       i5 = 0;
/*      */                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                       for (;;)
/*      */                                                                                                       {
/* 7141 */                                                                                                         i17 = i6 - i5;
/* 7142 */                                                                                                         b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 7143 */                                                                                                         MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 7144 */                                                                                                         if (b2 != 0) {
/*      */                                                                                                           break label24172;
/*      */                                                                                                         }
/*      */                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7154 */                                                                                                         d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3));
/* 7155 */                                                                                                         i13 = MainMemory.getI32(i12);
/* 7156 */                                                                                                         if ((!MathUtils.f_olt(d1, -1.0D)) && (!MathUtils.f_ogt(d1, 1.0D))) {
/*      */                                                                                                           break label24151;
/*      */                                                                                                         }
/*      */                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7166 */                                                                                                         MainMemory.setF64(i13 + (i17 << 3), 0.0D);
/* 7167 */                                                                                                         MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/*      */                                                                                                         
/*      */                                                                                                         break label24172;
/*      */                                                                                                         
/*      */                                                                                                         label24151:
/* 7172 */                                                                                                         MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.acos(d1));
/*      */                                                                                                         
/*      */ 
/*      */                                                                                                         label24172:
/*      */                                                                                                         
/*      */ 
/* 7178 */                                                                                                         i5 += 1;
/* 7179 */                                                                                                         if (i5 == i3) { break label31365;
/* 7180 */                                                                                                           break;
/*      */                                                                                                         }
/*      */                                                                                                       }
/*      */                                                                                                       
/*      */ 
/*      */ 
/*      */                                                                                                       label24205:
/*      */                                                                                                       
/*      */ 
/* 7189 */                                                                                                       if (i6 != 0)
/*      */                                                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7199 */                                                                                                         i8 = paramInt + 84;
/* 7200 */                                                                                                         i12 = paramInt + 88;
/* 7201 */                                                                                                         i3 *= i5;
/* 7202 */                                                                                                         i6 = i3 + -1;
/* 7203 */                                                                                                         i5 = 0;
/*      */                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                         for (;;)
/*      */                                                                                                         {
/* 7210 */                                                                                                           i17 = i6 - i5;
/* 7211 */                                                                                                           b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 7212 */                                                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 7213 */                                                                                                           if (b2 != 0) {
/*      */                                                                                                             break label24430;
/*      */                                                                                                           }
/*      */                                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7223 */                                                                                                           d1 = MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3));
/* 7224 */                                                                                                           i13 = MainMemory.getI32(i12);
/* 7225 */                                                                                                           if ((!MathUtils.f_olt(d1, -1.0D)) && (!MathUtils.f_ogt(d1, 1.0D))) {
/*      */                                                                                                             break label24409;
/*      */                                                                                                           }
/*      */                                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7235 */                                                                                                           MainMemory.setF64(i13 + (i17 << 3), 0.0D);
/* 7236 */                                                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)1);
/*      */                                                                                                           
/*      */                                                                                                           break label24430;
/*      */                                                                                                           
/*      */                                                                                                           label24409:
/* 7241 */                                                                                                           MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.asin(d1));
/*      */                                                                                                           
/*      */ 
/*      */                                                                                                           label24430:
/*      */                                                                                                           
/*      */ 
/* 7247 */                                                                                                           i5 += 1;
/* 7248 */                                                                                                           if (i5 == i3) { break label31365;
/* 7249 */                                                                                                             break;
/*      */                                                                                                           }
/*      */                                                                                                         }
/*      */                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                         label24463:
/*      */                                                                                                         
/*      */ 
/* 7258 */                                                                                                         if (i6 != 0)
/*      */                                                                                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7268 */                                                                                                           i8 = paramInt + 84;
/* 7269 */                                                                                                           i12 = paramInt + 88;
/* 7270 */                                                                                                           i3 *= i5;
/* 7271 */                                                                                                           i6 = i3 + -1;
/* 7272 */                                                                                                           i5 = 0;
/*      */                                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                           for (;;)
/*      */                                                                                                           {
/* 7279 */                                                                                                             i17 = i6 - i5;
/* 7280 */                                                                                                             b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 7281 */                                                                                                             MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 7282 */                                                                                                             if (b2 != 0) {
/*      */                                                                                                               break label24614;
/*      */                                                                                                             }
/*      */                                                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7292 */                                                                                                             i13 = MainMemory.getI32(i12);
/* 7293 */                                                                                                             MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.tan(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                                             
/*      */ 
/*      */                                                                                                             label24614:
/*      */                                                                                                             
/*      */ 
/* 7299 */                                                                                                             i5 += 1;
/* 7300 */                                                                                                             if (i5 == i3) { break label31365;
/* 7301 */                                                                                                               break;
/*      */                                                                                                             }
/*      */                                                                                                           }
/*      */                                                                                                           
/*      */ 
/*      */ 
/*      */                                                                                                           label24647:
/*      */                                                                                                           
/*      */ 
/* 7310 */                                                                                                           if (i6 != 0)
/*      */                                                                                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7320 */                                                                                                             i8 = paramInt + 84;
/* 7321 */                                                                                                             i12 = paramInt + 88;
/* 7322 */                                                                                                             i3 *= i5;
/* 7323 */                                                                                                             i6 = i3 + -1;
/* 7324 */                                                                                                             i5 = 0;
/*      */                                                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                             for (;;)
/*      */                                                                                                             {
/* 7331 */                                                                                                               i17 = i6 - i5;
/* 7332 */                                                                                                               b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 7333 */                                                                                                               MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 7334 */                                                                                                               if (b2 != 0) {
/*      */                                                                                                                 break label24798;
/*      */                                                                                                               }
/*      */                                                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7344 */                                                                                                               i13 = MainMemory.getI32(i12);
/* 7345 */                                                                                                               MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.cos(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                                               
/*      */ 
/*      */                                                                                                               label24798:
/*      */                                                                                                               
/*      */ 
/* 7351 */                                                                                                               i5 += 1;
/* 7352 */                                                                                                               if (i5 == i3) { break label31365;
/* 7353 */                                                                                                                 break;
/*      */                                                                                                               }
/*      */                                                                                                             }
/*      */                                                                                                             
/*      */ 
/*      */ 
/*      */                                                                                                             label24831:
/*      */                                                                                                             
/*      */ 
/* 7362 */                                                                                                             if (i6 != 0)
/*      */                                                                                                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7372 */                                                                                                               i8 = paramInt + 84;
/* 7373 */                                                                                                               i12 = paramInt + 88;
/* 7374 */                                                                                                               i3 *= i5;
/* 7375 */                                                                                                               i6 = i3 + -1;
/* 7376 */                                                                                                               i5 = 0;
/*      */                                                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                               for (;;)
/*      */                                                                                                               {
/* 7383 */                                                                                                                 i17 = i6 - i5;
/* 7384 */                                                                                                                 b2 = MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + 84) + i17);
/* 7385 */                                                                                                                 MainMemory.setI8(MainMemory.getI32(i8) + i17, b2);
/* 7386 */                                                                                                                 if (b2 != 0) {
/*      */                                                                                                                   break label24982;
/*      */                                                                                                                 }
/*      */                                                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7396 */                                                                                                                 i13 = MainMemory.getI32(i12);
/* 7397 */                                                                                                                 MainMemory.setF64(i13 + (i17 << 3), SystemLibrary.sin(MainMemory.getF64(MainMemory.getI32(MainMemory.getI32(j) + 88) + (i17 << 3))));
/*      */                                                                                                                 
/*      */ 
/*      */                                                                                                                 label24982:
/*      */                                                                                                                 
/*      */ 
/* 7403 */                                                                                                                 i5 += 1;
/* 7404 */                                                                                                                 if (i5 == i3) { break label31365;
/* 7405 */                                                                                                                   break;
/*      */                                                                                                                 }
/*      */                                                                                                               }
/*      */                                                                                                               
/*      */ 
/*      */ 
/*      */                                                                                                               label25015:
/*      */                                                                                                               
/*      */ 
/* 7414 */                                                                                                               i2 = MainMemory.getI32(j);
/* 7415 */                                                                                                               i18 = MainMemory.getI32(i2 + 56) * i3;
/* 7416 */                                                                                                               switch (MainMemory.getI32(i2 + 52))
/*      */                                                                                                               {
/*      */                                                                                                               case 258: 
/*      */                                                                                                                 break label25723;
/*      */                                                                                                                 break;
/*      */                                                                                                               case 259: 
/*      */                                                                                                                 break label25413;
/*      */                                                                                                                 break;
/*      */                                                                                                               case 260: 
/*      */                                                                                                                 break;
/*      */                                                                                                               }
/*      */                                                                                                               
/* 7428 */                                                                                                               if (i3 != 0)
/*      */                                                                                                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7438 */                                                                                                                 i12 = paramInt + 88;
/* 7439 */                                                                                                                 i8 = paramInt + 84;
/* 7440 */                                                                                                                 i6 = (i3 << 3) + -8;
/* 7441 */                                                                                                                 i5 = i3 + -1;
/* 7442 */                                                                                                                 i17 = 0;
/*      */                                                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                 for (;;)
/*      */                                                                                                                 {
/* 7451 */                                                                                                                   i19 = i6 + i17 * -8;
/* 7452 */                                                                                                                   i20 = i5 - i17;
/* 7453 */                                                                                                                   MainMemory.setF64(MainMemory.getI32(i12) + (i20 << 3), 0.0D);
/* 7454 */                                                                                                                   MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)1);
/* 7455 */                                                                                                                   i21 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/* 7456 */                                                                                                                   if (i21 != 0)
/*      */                                                                                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7467 */                                                                                                                     i22 = i18 + -1;
/* 7468 */                                                                                                                     i23 = 0;
/*      */                                                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                     for (;;)
/*      */                                                                                                                     {
/* 7475 */                                                                                                                       i24 = i22 - i23;
/* 7476 */                                                                                                                       paramInt = MainMemory.getI32(j);
/* 7477 */                                                                                                                       if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i24) != 0) {
/*      */                                                                                                                         break label25339;
/*      */                                                                                                                       }
/*      */                                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7487 */                                                                                                                       i13 = MainMemory.getI32(i12) + i19;
/* 7488 */                                                                                                                       d1 = MainMemory.getF64(i13) + MainMemory.getF64(MainMemory.getI32(paramInt + 88) + (i24 << 3));
/* 7489 */                                                                                                                       MainMemory.setF64(i13, d1);
/* 7490 */                                                                                                                       MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)0);
/*      */                                                                                                                       
/*      */ 
/*      */                                                                                                                       label25339:
/*      */                                                                                                                       
/*      */ 
/* 7496 */                                                                                                                       i23 += 1;
/* 7497 */                                                                                                                       if (i23 == i21) {
/*      */                                                                                                                         break;
/*      */                                                                                                                       }
/*      */                                                                                                                     }
/*      */                                                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7508 */                                                                                                                     i18 -= i21;
/*      */                                                                                                                   }
/*      */                                                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7516 */                                                                                                                   i17 += 1;
/* 7517 */                                                                                                                   if (i17 == i3) { break label31365;
/* 7518 */                                                                                                                     break;
/*      */                                                                                                                   }
/*      */                                                                                                                 }
/*      */                                                                                                                 
/*      */ 
/*      */ 
/*      */                                                                                                                 label25413:
/*      */                                                                                                                 
/*      */ 
/*      */ 
/* 7528 */                                                                                                                 if (i3 != 0)
/*      */                                                                                                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7538 */                                                                                                                   i26 = paramInt + 88;
/* 7539 */                                                                                                                   i8 = paramInt + 84;
/* 7540 */                                                                                                                   i6 = (i3 << 2) + -4;
/* 7541 */                                                                                                                   i5 = i3 + -1;
/* 7542 */                                                                                                                   i17 = 0;
/*      */                                                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                   for (;;)
/*      */                                                                                                                   {
/* 7551 */                                                                                                                     i19 = i6 + i17 * -4;
/* 7552 */                                                                                                                     i20 = i5 - i17;
/* 7553 */                                                                                                                     MainMemory.setI32(MainMemory.getI32(i26) + (i20 << 2), 0);
/* 7554 */                                                                                                                     MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)1);
/* 7555 */                                                                                                                     i21 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/* 7556 */                                                                                                                     if (i21 != 0)
/*      */                                                                                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7567 */                                                                                                                       i22 = i18 + -1;
/* 7568 */                                                                                                                       i23 = 0;
/*      */                                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                       for (;;)
/*      */                                                                                                                       {
/* 7575 */                                                                                                                         i24 = i22 - i23;
/* 7576 */                                                                                                                         paramInt = MainMemory.getI32(j);
/* 7577 */                                                                                                                         if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i24) != 0) {
/*      */                                                                                                                           break label25649;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7587 */                                                                                                                         i4 = MainMemory.getI32(i26) + i19;
/* 7588 */                                                                                                                         MainMemory.setI32(i4, MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i24 << 2)) + MainMemory.getI32(i4));
/* 7589 */                                                                                                                         MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)0);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label25649:
/*      */                                                                                                                         
/*      */ 
/* 7595 */                                                                                                                         i23 += 1;
/* 7596 */                                                                                                                         if (i23 == i21) {
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/*      */                                                                                                                       }
/*      */                                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7607 */                                                                                                                       i18 -= i21;
/*      */                                                                                                                     }
/*      */                                                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7615 */                                                                                                                     i17 += 1;
/* 7616 */                                                                                                                     if (i17 == i3) { break label31365;
/* 7617 */                                                                                                                       break;
/*      */                                                                                                                     }
/*      */                                                                                                                   }
/*      */                                                                                                                   
/*      */ 
/*      */ 
/*      */                                                                                                                   label25723:
/*      */                                                                                                                   
/*      */ 
/*      */ 
/* 7627 */                                                                                                                   if (i3 != 0)
/*      */                                                                                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7637 */                                                                                                                     i26 = paramInt + 88;
/* 7638 */                                                                                                                     i8 = paramInt + 84;
/* 7639 */                                                                                                                     i6 = (i3 << 2) + -4;
/* 7640 */                                                                                                                     i5 = i3 + -1;
/* 7641 */                                                                                                                     i17 = 0;
/*      */                                                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                     for (;;)
/*      */                                                                                                                     {
/* 7650 */                                                                                                                       i19 = i6 + i17 * -4;
/* 7651 */                                                                                                                       i20 = i5 - i17;
/* 7652 */                                                                                                                       MainMemory.setI32(MainMemory.getI32(i26) + (i20 << 2), 0);
/* 7653 */                                                                                                                       MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)1);
/* 7654 */                                                                                                                       i21 = MainMemory.getI32(MainMemory.getI32(j) + 56);
/* 7655 */                                                                                                                       if (i21 != 0)
/*      */                                                                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7666 */                                                                                                                         i22 = i18 + -1;
/* 7667 */                                                                                                                         i23 = 0;
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                         for (;;)
/*      */                                                                                                                         {
/* 7674 */                                                                                                                           i24 = i22 - i23;
/* 7675 */                                                                                                                           paramInt = MainMemory.getI32(j);
/* 7676 */                                                                                                                           if (MainMemory.getI8(MainMemory.getI32(paramInt + 84) + i24) != 0) {
/*      */                                                                                                                             break label25965;
/*      */                                                                                                                           }
/*      */                                                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7686 */                                                                                                                           i4 = MainMemory.getI32(i26) + i19;
/* 7687 */                                                                                                                           MainMemory.setI32(i4, (MainMemory.getI8(MainMemory.getI32(paramInt + 88) + i24) != 0 ? 1 : 0) + MainMemory.getI32(i4));
/* 7688 */                                                                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i20, (byte)0);
/*      */                                                                                                                           
/*      */ 
/*      */                                                                                                                           label25965:
/*      */                                                                                                                           
/*      */ 
/* 7694 */                                                                                                                           i23 += 1;
/* 7695 */                                                                                                                           if (i23 == i21) {
/*      */                                                                                                                             break;
/*      */                                                                                                                           }
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7706 */                                                                                                                         i18 -= i21;
/*      */                                                                                                                       }
/*      */                                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7714 */                                                                                                                       i17 += 1;
/* 7715 */                                                                                                                       if (i17 == i3) { break label31365;
/* 7716 */                                                                                                                         break;
/*      */                                                                                                                       }
/*      */                                                                                                                     }
/*      */                                                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7726 */                                                                                                                     if (i3 != 0)
/*      */                                                                                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7736 */                                                                                                                       i26 = paramInt + 88;
/* 7737 */                                                                                                                       i8 = paramInt + 84;
/* 7738 */                                                                                                                       i6 = (i3 << 2) + -4;
/* 7739 */                                                                                                                       i5 = i3 + -1;
/* 7740 */                                                                                                                       paramInt = i2;
/* 7741 */                                                                                                                       i17 = 0;
/*      */                                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7749 */                                                                                                                       i18 = i6 + i17 * -4;
/* 7750 */                                                                                                                       i19 = i5 - i17;
/* 7751 */                                                                                                                       i9 = MainMemory.getI32(MainMemory.getI32(paramInt + 88) + (i19 << 2));
/* 7752 */                                                                                                                       MainMemory.setI32(MainMemory.getI32(i26) + (i19 << 2), 0);
/* 7753 */                                                                                                                       MainMemory.setI8(MainMemory.getI32(i8) + i19, (byte)0);
/* 7754 */                                                                                                                       b2 = MainMemory.getI8(i9);
/* 7755 */                                                                                                                       if (b2 == 0) {
/*      */                                                                                                                         break label26268;
/*      */                                                                                                                       }
/*      */                                                                                                                       else {
/* 7759 */                                                                                                                         i19 = 1;
/*      */                                                                                                                       }
/*      */                                                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                       for (;;)
/*      */                                                                                                                       {
/* 7769 */                                                                                                                         i10 = i9 + i19;
/* 7770 */                                                                                                                         if (b2 != 49) {
/*      */                                                                                                                           break label26241;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7780 */                                                                                                                         i4 = MainMemory.getI32(i26) + i18;
/* 7781 */                                                                                                                         MainMemory.setI32(i4, MainMemory.getI32(i4) + 1);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label26241:
/*      */                                                                                                                         
/*      */ 
/* 7787 */                                                                                                                         b2 = MainMemory.getI8(i10);
/* 7788 */                                                                                                                         if (b2 != 0) {
/*      */                                                                                                                           break label26309;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label26268:
/*      */                                                                                                                         
/*      */ 
/*      */ 
/* 7798 */                                                                                                                         i17 += 1;
/* 7799 */                                                                                                                         if (i17 == i3) {
/*      */                                                                                                                           break label31365;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7809 */                                                                                                                         paramInt = MainMemory.getI32(j);
/*      */                                                                                                                         
/*      */ 
/* 7812 */                                                                                                                         break;
/*      */                                                                                                                         
/*      */                                                                                                                         label26309:
/*      */                                                                                                                         
/* 7816 */                                                                                                                         i19 += 1;
/*      */                                                                                                                       }
/*      */                                                                                                                       
/*      */ 
/*      */                                                                                                                       label26327:
/*      */                                                                                                                       
/*      */ 
/* 7823 */                                                                                                                       if (i6 != 0)
/*      */                                                                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7833 */                                                                                                                         i12 = paramInt + 88;
/* 7834 */                                                                                                                         i8 = paramInt + 84;
/* 7835 */                                                                                                                         i3 *= i5;
/* 7836 */                                                                                                                         i6 = i3 + -1;
/* 7837 */                                                                                                                         d1 = MainMemory.getF64(467252);
/*      */                                                                                                                         
/* 7839 */                                                                                                                         i5 = 0;
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                         for (;;)
/*      */                                                                                                                         {
/* 7847 */                                                                                                                           i17 = i6 - i5;
/* 7848 */                                                                                                                           i13 = MainMemory.getI32(i12);
/* 7849 */                                                                                                                           if (!MathUtils.f_oeq(d1, 0.0D)) {
/*      */                                                                                                                             break label26500;
/*      */                                                                                                                           }
/*      */                                                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7859 */                                                                                                                           if (SystemLibrary.rand() <= 32767)
/*      */                                                                                                                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7869 */                                                                                                                             if (SystemLibrary.rand() <= 32767) {
/*      */                                                                                                                               break label26486;
/*      */                                                                                                                             }
/*      */                                                                                                                           }
/*      */                                                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7879 */                                                                                                                           MainMemory.setF64(467252, 2.147483648E9D);
/*      */                                                                                                                           
/*      */                                                                                                                           break label26500;
/*      */                                                                                                                           
/*      */                                                                                                                           label26486:
/* 7884 */                                                                                                                           MainMemory.setF64(467252, 32768.0D);
/*      */                                                                                                                           
/*      */ 
/*      */                                                                                                                           label26500:
/*      */                                                                                                                           
/*      */ 
/* 7890 */                                                                                                                           d1 = SystemLibrary.rand();
/* 7891 */                                                                                                                           d2 = MainMemory.getF64(467252);
/* 7892 */                                                                                                                           if (!MathUtils.f_ogt(d1, d2)) {
/*      */                                                                                                                             break label26581;
/*      */                                                                                                                           }
/*      */                                                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                           do
/*      */                                                                                                                           {
/* 7905 */                                                                                                                             d2 *= 2.0D;
/* 7906 */                                                                                                                           } while (MathUtils.f_ogt(d1, d2));
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
/* 7917 */                                                                                                                           MainMemory.setF64(467252, d2);
/*      */                                                                                                                           
/*      */ 
/*      */ 
/*      */                                                                                                                           label26581:
/*      */                                                                                                                           
/*      */ 
/*      */ 
/* 7925 */                                                                                                                           d1 /= d2;
/* 7926 */                                                                                                                           MainMemory.setF64(i13 + (i17 << 3), d1);
/* 7927 */                                                                                                                           MainMemory.setI8(MainMemory.getI32(i8) + i17, (byte)0);
/* 7928 */                                                                                                                           i5 += 1;
/* 7929 */                                                                                                                           if (i5 == i3) { break label31365;
/* 7930 */                                                                                                                             break;
/*      */                                                                                                                           }
/* 7932 */                                                                                                                           d1 = d2;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label26649:
/*      */                                                                                                                         
/*      */ 
/* 7940 */                                                                                                                         switch (i6) {
/*      */                                                                                                                         case 1002: 
/*      */                                                                                                                           break label31156;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 1004: 
/*      */                                                                                                                           break label31126;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 1005: 
/*      */                                                                                                                           break label31096;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 1006: 
/*      */                                                                                                                           break label31066;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 1007:  break label30925;
/*      */                                                                                                                           break; case 1008:  break label30784;
/*      */                                                                                                                           break; case 1009:  break label30754;
/*      */                                                                                                                           break; case 1010:  break label30724;
/*      */                                                                                                                           break; case 1011:  break label30694;
/*      */                                                                                                                           break; case 1012:  break label30664;
/*      */                                                                                                                           break; case 1013:  break label30634;
/*      */                                                                                                                           break; case 1014:  break label30504;
/*      */                                                                                                                           break; case 1015:  break label30374;
/*      */                                                                                                                           break; case 1016:  break label30244;
/*      */                                                                                                                           break; case 1017:  break label30099;
/*      */                                                                                                                           break; case 1018:  break label30060;
/*      */                                                                                                                           break; case 1019:  break label30030;
/*      */                                                                                                                           break; case 1020:  break label30000;
/*      */                                                                                                                           break; case 1021:  break label29962;
/*      */                                                                                                                           break; case 1022:  break label29813;
/*      */                                                                                                                           break; case 1023:  break label29646;
/*      */                                                                                                                           break; case 1024:  break label29497;
/*      */                                                                                                                           break; case 1025:  break label29329;
/*      */                                                                                                                           break; case 1026:  break label29260;
/*      */                                                                                                                           break; case 1027:  break label29145;
/*      */                                                                                                                           break; case 1028:  break label28869;
/*      */                                                                                                                           break; case 1029:  break label28650;
/*      */                                                                                                                           break; case 1030:  break label28630;
/*      */                                                                                                                           break; case 1031:  break label28445;
/*      */                                                                                                                           break; case 1034:  break label28029;
/*      */                                                                                                                           break; case 1037:  break label27881;
/*      */                                                                                                                           break; case 1038:  break label27762;
/*      */                                                                                                                           break; case 1039:  break label27742;
/*      */                                                                                                                           break; case 1040:  break label27722;
/*      */                                                                                                                           break; case 1041:  break label27421;
/*      */                                                                                                                           break; case 1043:  break label27324;
/*      */                                                                                                                           break; case 1044:  break label27278;
/*      */                                                                                                                           break; case 1045:  break; }
/* 7987 */                                                                                                                         i13 = m + 32;
/* 7988 */                                                                                                                         i9 = SystemLibrary.strstr(i13, m + 320);
/* 7989 */                                                                                                                         if (i9 != 0) {
/*      */                                                                                                                           break label27250;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 7999 */                                                                                                                         MainMemory.setI32(paramInt + 88, 0);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27250:
/* 8004 */                                                                                                                         MainMemory.setI32(paramInt + 88, (0 - i13 | 0x1) + i9);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27278:
/* 8009 */                                                                                                                         F307607.call(paramInt + 88, MainMemory.getI32(paramInt + 56), m + 32, MainMemory.getI32(m), MainMemory.getI32(m + 320));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27324:
/* 8014 */                                                                                                                         i13 = m + 32;
/* 8015 */                                                                                                                         if (MainMemory.getI32(MainMemory.getI32(j) + 52) != 260) {
/*      */                                                                                                                           break label27389;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8025 */                                                                                                                         MainMemory.setI32(paramInt + 88, F303220.call(MainMemory.getF64(i13)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27389:
/* 8030 */                                                                                                                         d1 = MainMemory.getI32(i13);
/* 8031 */                                                                                                                         MainMemory.setI32(paramInt + 88, F303220.call(d1));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27421:
/* 8036 */                                                                                                                         d2 = MainMemory.getF64(m + 896);
/* 8037 */                                                                                                                         d4 = MainMemory.getF64(m + 608);
/* 8038 */                                                                                                                         d8 = MainMemory.getF64(m + 320);
/* 8039 */                                                                                                                         d5 = MainMemory.getF64(m + 32);
/* 8040 */                                                                                                                         d1 = MainMemory.getF64(467244);
/* 8041 */                                                                                                                         if (!MathUtils.f_oeq(d1, 0.0D)) {
/*      */                                                                                                                           break label27514;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8052 */                                                                                                                         MainMemory.setF64(467244, 0.017453292519943295D);
/* 8053 */                                                                                                                         d1 = 0.017453292519943295D;
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label27514:
/*      */                                                                                                                         
/*      */ 
/* 8060 */                                                                                                                         d4 -= d5;
/* 8061 */                                                                                                                         d4 *= d1;
/* 8062 */                                                                                                                         d4 *= 0.5D;
/* 8063 */                                                                                                                         d4 = SystemLibrary.sin(d4);
/* 8064 */                                                                                                                         d5 = d2 - d8;
/* 8065 */                                                                                                                         d5 *= d1;
/* 8066 */                                                                                                                         d5 *= 0.5D;
/* 8067 */                                                                                                                         d5 = SystemLibrary.sin(d5);
/* 8068 */                                                                                                                         d5 *= d5;
/* 8069 */                                                                                                                         d8 = d1 * d8;
/* 8070 */                                                                                                                         d8 = SystemLibrary.cos(d8);
/* 8071 */                                                                                                                         d2 = d1 * d2;
/* 8072 */                                                                                                                         d2 = d8 * SystemLibrary.cos(d2);
/* 8073 */                                                                                                                         d2 *= d4;
/* 8074 */                                                                                                                         d2 *= d4;
/* 8075 */                                                                                                                         d2 = d5 + d2;
/* 8076 */                                                                                                                         d2 = MathUtils.f_olt(d2, 0.0D) ? 0.0D : d2;
/* 8077 */                                                                                                                         d2 = MathUtils.f_ogt(d2, 1.0D) ? 1.0D : d2;
/* 8078 */                                                                                                                         d8 = 1.0D - d2;
/* 8079 */                                                                                                                         d8 = SystemLibrary.sqrt(d8);
/* 8080 */                                                                                                                         d2 = SystemLibrary.atan2(SystemLibrary.sqrt(d2), d8) * 2.0D;
/* 8081 */                                                                                                                         d1 = d2 / d1;
/* 8082 */                                                                                                                         MainMemory.setF64(paramInt + 88, d1);
/*      */                                                                                                                         
/*      */                                                                                                                         break label29813;
/*      */                                                                                                                         
/*      */                                                                                                                         label27722:
/* 8087 */                                                                                                                         MainMemory.setI32(paramInt + 88, 1);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27742:
/* 8092 */                                                                                                                         MainMemory.setF64(paramInt + 88, 0.0D);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27762:
/* 8097 */                                                                                                                         switch (MainMemory.getI32(MainMemory.getI32(j) + 52))
/*      */                                                                                                                         {
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break label27849;
/*      */                                                                                                                           
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */                                                                                                                         
/* 8108 */                                                                                                                         MainMemory.setF64(paramInt + 88, MainMemory.getF64(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27849:
/* 8113 */                                                                                                                         d1 = MainMemory.getI32(m + 32);
/* 8114 */                                                                                                                         MainMemory.setF64(paramInt + 88, d1);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27881:
/* 8119 */                                                                                                                         i3 = MainMemory.getI32(MainMemory.getI32(j) + 52);
/* 8120 */                                                                                                                         if (i3 != 258) {
/*      */                                                                                                                           break label27951;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8130 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI8(m + 32) != 0 ? 1 : 0);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label27951:
/* 8135 */                                                                                                                         i13 = m + 32;
/* 8136 */                                                                                                                         if (i3 != 259) {
/*      */                                                                                                                           break label28005;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8146 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI32(i13));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28005:
/* 8151 */                                                                                                                         MainMemory.setF64(paramInt + 88, MainMemory.getF64(i13));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28029:
/* 8156 */                                                                                                                         switch (MainMemory.getI32(paramInt + 52)) {
/*      */                                                                                                                         case 258: 
/*      */                                                                                                                           break label28361;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break label28277;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break label28190;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 261: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/* 8169 */                                                                                                                         if (MainMemory.getI8(m + 608) != 0) {
/*      */                                                                                                                           break label28155;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8179 */                                                                                                                         i13 = m + 320;
/*      */                                                                                                                         
/*      */                                                                                                                         break label28168;
/*      */                                                                                                                         
/*      */                                                                                                                         label28155:
/*      */                                                                                                                         
/* 8185 */                                                                                                                         i13 = m + 32;
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label28168:
/*      */                                                                                                                         
/*      */ 
/*      */ 
/* 8193 */                                                                                                                         SystemLibrary.strcpy(paramInt + 88, i13);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28190:
/* 8198 */                                                                                                                         if (MainMemory.getI8(m + 608) != 0) {
/*      */                                                                                                                           break label28240;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8208 */                                                                                                                         d1 = MainMemory.getF64(m + 320);
/*      */                                                                                                                         
/*      */                                                                                                                         break label28256;
/*      */                                                                                                                         
/*      */                                                                                                                         label28240:
/*      */                                                                                                                         
/* 8214 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label28256:
/*      */                                                                                                                         
/*      */ 
/*      */ 
/* 8222 */                                                                                                                         MainMemory.setF64(paramInt + 88, d1);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28277:
/* 8227 */                                                                                                                         if (MainMemory.getI8(m + 608) != 0) {
/*      */                                                                                                                           break label28324;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8237 */                                                                                                                         i13 = m + 320;
/*      */                                                                                                                         
/*      */                                                                                                                         break label28337;
/*      */                                                                                                                         
/*      */                                                                                                                         label28324:
/*      */                                                                                                                         
/* 8243 */                                                                                                                         i13 = m + 32;
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label28337:
/*      */                                                                                                                         
/*      */ 
/*      */ 
/* 8251 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI32(i13));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28361:
/* 8256 */                                                                                                                         if (MainMemory.getI8(m + 608) != 0) {
/*      */                                                                                                                           break label28408;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8266 */                                                                                                                         i13 = m + 320;
/*      */                                                                                                                         
/*      */                                                                                                                         break label28421;
/*      */                                                                                                                         
/*      */                                                                                                                         label28408:
/*      */                                                                                                                         
/* 8272 */                                                                                                                         i13 = m + 32;
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label28421:
/*      */                                                                                                                         
/*      */ 
/*      */ 
/* 8280 */                                                                                                                         MainMemory.setI8(paramInt + 88, MainMemory.getI8(i13));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28445:
/* 8285 */                                                                                                                         switch (MainMemory.getI32(paramInt + 52)) {
/*      */                                                                                                                         case 258: 
/*      */                                                                                                                           break label28603;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break label28576;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break label28549;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 261: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/* 8298 */                                                                                                                         SystemLibrary.strcpy(paramInt + 88, m + 32);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28549:
/* 8303 */                                                                                                                         MainMemory.setF64(paramInt + 88, MainMemory.getF64(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28576:
/* 8308 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI32(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28603:
/* 8313 */                                                                                                                         MainMemory.setI8(paramInt + 88, MainMemory.getI8(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28630:
/* 8318 */                                                                                                                         MainMemory.setI8(paramInt + 88, (byte)0);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28650:
/* 8323 */                                                                                                                         d1 = MainMemory.getF64(m + 896);
/* 8324 */                                                                                                                         d2 = MainMemory.getF64(m + 608);
/* 8325 */                                                                                                                         d8 = MainMemory.getF64(m + 1184) / 180.0D;
/* 8326 */                                                                                                                         d6 = d8 * 3.141592653589793D;
/* 8327 */                                                                                                                         d5 = MainMemory.getF64(m + 1472) - MainMemory.getF64(m + 32);
/* 8328 */                                                                                                                         d8 = MainMemory.getF64(m + 1760) - MainMemory.getF64(m + 320);
/* 8329 */                                                                                                                         d4 = SystemLibrary.cos(d6);
/* 8330 */                                                                                                                         d3 = d4 * d5;
/* 8331 */                                                                                                                         d6 = SystemLibrary.sin(d6);
/* 8332 */                                                                                                                         d7 = d6 * d8;
/* 8333 */                                                                                                                         d3 += d7;
/* 8334 */                                                                                                                         d5 = -0.0D - d5;
/* 8335 */                                                                                                                         d5 = d6 * d5;
/* 8336 */                                                                                                                         d8 = d4 * d8;
/* 8337 */                                                                                                                         d8 = d5 + d8;
/* 8338 */                                                                                                                         d2 = d3 / d2;
/* 8339 */                                                                                                                         d1 = d8 / d1;
/* 8340 */                                                                                                                         d2 *= d2;
/* 8341 */                                                                                                                         d1 *= d1;
/* 8342 */                                                                                                                         d1 = d2 + d1;
/* 8343 */                                                                                                                         MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_ole(d1, 1.0D) ? 1 : 0));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label28869:
/* 8348 */                                                                                                                         d2 = MainMemory.getF64(m + 896);
/* 8349 */                                                                                                                         d1 = MainMemory.getF64(m + 608);
/* 8350 */                                                                                                                         d8 = MainMemory.getF64(m + 1184) / 180.0D;
/* 8351 */                                                                                                                         d6 = d8 * 3.141592653589793D;
/* 8352 */                                                                                                                         d3 = MainMemory.getF64(m + 1472) - MainMemory.getF64(m + 32);
/* 8353 */                                                                                                                         d4 = MainMemory.getF64(m + 1760) - MainMemory.getF64(m + 320);
/* 8354 */                                                                                                                         d5 = SystemLibrary.cos(d6);
/* 8355 */                                                                                                                         d8 = d5 * d3;
/* 8356 */                                                                                                                         d6 = SystemLibrary.sin(d6);
/* 8357 */                                                                                                                         d7 = d6 * d4;
/* 8358 */                                                                                                                         d8 += d7;
/* 8359 */                                                                                                                         d3 = -0.0D - d3;
/* 8360 */                                                                                                                         d3 = d6 * d3;
/* 8361 */                                                                                                                         d4 = d5 * d4;
/* 8362 */                                                                                                                         d4 = d3 + d4;
/* 8363 */                                                                                                                         d5 = d1 * -0.5D;
/* 8364 */                                                                                                                         if (MathUtils.f_ult(d8, d5)) {
/* 8365 */                                                                                                                           b2 = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                                                                         }
/*      */                                                                                                                         else
/*      */                                                                                                                         {
/*      */ 
/*      */ 
/*      */ 
/* 8375 */                                                                                                                           d5 = d2 * 0.5D;
/* 8376 */                                                                                                                           d2 *= -0.5D;
/* 8377 */                                                                                                                           d1 *= 0.5D;
/* 8378 */                                                                                                                           b2 = MathUtils.xor((byte)((MathUtils.f_ugt(d8, d1)) || (MathUtils.f_ult(d4, d2)) || (MathUtils.f_ugt(d4, d5)) ? 1 : 0), (byte)1);
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8386 */                                                                                                                         MainMemory.setI8(paramInt + 88, b2);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29145:
/* 8391 */                                                                                                                         d1 = MainMemory.getF64(m + 608);
/* 8392 */                                                                                                                         d2 = MainMemory.getF64(m + 896) - MainMemory.getF64(m + 32);
/* 8393 */                                                                                                                         d8 = MainMemory.getF64(m + 1184) - MainMemory.getF64(m + 320);
/* 8394 */                                                                                                                         d2 *= d2;
/* 8395 */                                                                                                                         d8 *= d8;
/* 8396 */                                                                                                                         d2 += d8;
/* 8397 */                                                                                                                         d1 *= d1;
/* 8398 */                                                                                                                         MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_ole(d2, d1) ? 1 : 0));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29260:
/* 8403 */                                                                                                                         d1 = MainMemory.getF64(m + 608);
/* 8404 */                                                                                                                         d2 = MainMemory.getF64(m + 32) - MainMemory.getF64(m + 320);
/* 8405 */                                                                                                                         MainMemory.setI8(paramInt + 88, (byte)(MathUtils.f_olt(SystemLibrary.fabs(d2), d1) ? 1 : 0));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29329:
/* 8410 */                                                                                                                         switch (MainMemory.getI32(paramInt + 52))
/*      */                                                                                                                         {
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break label29440;
/*      */                                                                                                                           
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */                                                                                                                         
/* 8421 */                                                                                                                         i3 = MainMemory.getI32(m + 320);
/* 8422 */                                                                                                                         i6 = MainMemory.getI32(m + 32);
/* 8423 */                                                                                                                         MainMemory.setI32(paramInt + 88, i3 >= i6 ? i3 : i6);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29440:
/* 8428 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/* 8429 */                                                                                                                         d2 = MainMemory.getF64(m + 320);
/* 8430 */                                                                                                                         MainMemory.setF64(paramInt + 88, MathUtils.f_ogt(d1, d2) ? d1 : d2);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29497:
/* 8435 */                                                                                                                         switch (MainMemory.getI32(paramInt + 52))
/*      */                                                                                                                         {
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break label29619;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break label29592;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 262: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/* 8447 */                                                                                                                         SystemLibrary.strcpy(paramInt + 88, m + 32);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29592:
/* 8452 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI32(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29619:
/* 8457 */                                                                                                                         MainMemory.setF64(paramInt + 88, MainMemory.getF64(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29646:
/* 8462 */                                                                                                                         switch (MainMemory.getI32(paramInt + 52))
/*      */                                                                                                                         {
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break label29756;
/*      */                                                                                                                           
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */                                                                                                                         
/* 8473 */                                                                                                                         i3 = MainMemory.getI32(m + 320);
/* 8474 */                                                                                                                         i6 = MainMemory.getI32(m + 32);
/* 8475 */                                                                                                                         MainMemory.setI32(paramInt + 88, i3 <= i6 ? i3 : i6);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29756:
/* 8480 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/* 8481 */                                                                                                                         d2 = MainMemory.getF64(m + 320);
/* 8482 */                                                                                                                         MainMemory.setF64(paramInt + 88, MathUtils.f_olt(d1, d2) ? d1 : d2);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29813:
/* 8487 */                                                                                                                         switch (MainMemory.getI32(paramInt + 52))
/*      */                                                                                                                         {
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break label29935;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break label29908;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 262: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/* 8499 */                                                                                                                         SystemLibrary.strcpy(paramInt + 88, m + 32);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29908:
/* 8504 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI32(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29935:
/* 8509 */                                                                                                                         MainMemory.setF64(paramInt + 88, MainMemory.getF64(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label29962:
/* 8514 */                                                                                                                         d1 = MainMemory.getF64(m + 32) + 0.5D;
/* 8515 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.floor(d1));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30000:
/* 8520 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.floor(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30030:
/* 8525 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.ceil(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30060:
/* 8530 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.atan2(MainMemory.getF64(m + 32), MainMemory.getF64(m + 320)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30099:
/* 8535 */                                                                                                                         i13 = m + 32;
/* 8536 */                                                                                                                         if (MainMemory.getI32(MainMemory.getI32(j) + 52) != 260) {
/*      */                                                                                                                           break label30203;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8546 */                                                                                                                         d1 = MainMemory.getF64(i13);
/* 8547 */                                                                                                                         if (!MathUtils.f_ule(d1, 0.0D)) {
/*      */                                                                                                                           break label30182;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8558 */                                                                                                                         d1 = -0.0D - d1;
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */                                                                                                                         label30182:
/*      */                                                                                                                         
/*      */ 
/*      */ 
/* 8566 */                                                                                                                         MainMemory.setF64(paramInt + 88, d1);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30203:
/* 8571 */                                                                                                                         i3 = MainMemory.getI32(i13);
/* 8572 */                                                                                                                         MainMemory.setI32(paramInt + 88, i3 > -1 ? i3 : 0 - i3);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30244:
/* 8577 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/* 8578 */                                                                                                                         if (!MathUtils.f_olt(d1, 0.0D)) {
/*      */                                                                                                                           break label30350;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8588 */                                                                                                                         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */                                                                                                                           break label30315;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8598 */                                                                                                                         MainMemory.setI32Aligned(470852, 431);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label30315:
/*      */                                                                                                                         
/*      */ 
/* 8604 */                                                                                                                         SystemLibrary.strncpy(i, 75232, 80);
/* 8605 */                                                                                                                         MainMemory.setI8(i + 79, (byte)0);
/* 8606 */                                                                                                                         ffxmsg.call(5, i);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30350:
/* 8611 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.sqrt(d1));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30374:
/* 8616 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/* 8617 */                                                                                                                         if (!MathUtils.f_ugt(d1, 0.0D)) {
/*      */                                                                                                                           break label30432;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8627 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.log10(d1));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30432:
/* 8632 */                                                                                                                         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */                                                                                                                           break label30469;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8642 */                                                                                                                         MainMemory.setI32Aligned(470852, 431);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label30469:
/*      */                                                                                                                         
/*      */ 
/* 8648 */                                                                                                                         SystemLibrary.strncpy(i, 76512, 80);
/* 8649 */                                                                                                                         MainMemory.setI8(i + 79, (byte)0);
/* 8650 */                                                                                                                         ffxmsg.call(5, i);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30504:
/* 8655 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/* 8656 */                                                                                                                         if (!MathUtils.f_ugt(d1, 0.0D)) {
/*      */                                                                                                                           break label30562;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8666 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.log(d1));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30562:
/* 8671 */                                                                                                                         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */                                                                                                                           break label30599;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8681 */                                                                                                                         MainMemory.setI32Aligned(470852, 431);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label30599:
/*      */                                                                                                                         
/*      */ 
/* 8687 */                                                                                                                         SystemLibrary.strncpy(i, 73536, 80);
/* 8688 */                                                                                                                         MainMemory.setI8(i + 79, (byte)0);
/* 8689 */                                                                                                                         ffxmsg.call(5, i);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30634:
/* 8694 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.exp(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30664:
/* 8699 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.tanh(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30694:
/* 8704 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.cosh(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30724:
/* 8709 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.sinh(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30754:
/* 8714 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.atan(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30784:
/* 8719 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/* 8720 */                                                                                                                         if ((!MathUtils.f_olt(d1, -1.0D)) && (!MathUtils.f_ogt(d1, 1.0D))) {
/*      */                                                                                                                           break label30901;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8730 */                                                                                                                         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */                                                                                                                           break label30866;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8740 */                                                                                                                         MainMemory.setI32Aligned(470852, 431);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label30866:
/*      */                                                                                                                         
/*      */ 
/* 8746 */                                                                                                                         SystemLibrary.strncpy(i, 78272, 80);
/* 8747 */                                                                                                                         MainMemory.setI8(i + 79, (byte)0);
/* 8748 */                                                                                                                         ffxmsg.call(5, i);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30901:
/* 8753 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.acos(d1));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label30925:
/* 8758 */                                                                                                                         d1 = MainMemory.getF64(m + 32);
/* 8759 */                                                                                                                         if ((!MathUtils.f_olt(d1, -1.0D)) && (!MathUtils.f_ogt(d1, 1.0D))) {
/*      */                                                                                                                           break label31042;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8769 */                                                                                                                         if (MainMemory.getI32Aligned(470852) != 0) {
/*      */                                                                                                                           break label31007;
/*      */                                                                                                                         }
/*      */                                                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8779 */                                                                                                                         MainMemory.setI32Aligned(470852, 431);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label31007:
/*      */                                                                                                                         
/*      */ 
/* 8785 */                                                                                                                         SystemLibrary.strncpy(i, 78240, 80);
/* 8786 */                                                                                                                         MainMemory.setI8(i + 79, (byte)0);
/* 8787 */                                                                                                                         ffxmsg.call(5, i);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31042:
/* 8792 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.asin(d1));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31066:
/* 8797 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.tan(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31096:
/* 8802 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.cos(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31126:
/* 8807 */                                                                                                                         MainMemory.setF64(paramInt + 88, SystemLibrary.sin(MainMemory.getF64(m + 32)));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31156:
/* 8812 */                                                                                                                         switch (MainMemory.getI32(MainMemory.getI32(j) + 52)) {
/*      */                                                                                                                         case 258: 
/*      */                                                                                                                           break label31323;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 259: 
/*      */                                                                                                                           break label31296;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 260: 
/*      */                                                                                                                           break label31269;
/*      */                                                                                                                           break;
/*      */                                                                                                                         case 262: 
/*      */                                                                                                                           break;
/*      */                                                                                                                         }
/* 8825 */                                                                                                                         SystemLibrary.strcpy(paramInt + 88, m + 32);
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31269:
/* 8830 */                                                                                                                         MainMemory.setF64(paramInt + 88, MainMemory.getF64(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31296:
/* 8835 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI32(m + 32));
/*      */                                                                                                                         
/*      */                                                                                                                         break label31352;
/*      */                                                                                                                         
/*      */                                                                                                                         label31323:
/* 8840 */                                                                                                                         MainMemory.setI32(paramInt + 88, MainMemory.getI8(m + 32) != 0 ? 1 : 0);
/*      */                                                                                                                         
/*      */ 
/*      */                                                                                                                         label31352:
/*      */                                                                                                                         
/*      */ 
/* 8846 */                                                                                                                         MainMemory.setI32(paramInt, 64536);
/*      */                                                                                                                       }
/*      */                                                                                                                     }
/*      */                                                                                                                   }
/*      */                                                                                                                 } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } }
/*      */         label31365:
/* 8852 */         i3 = MainMemory.getI32(i1);
/* 8853 */         if (i3 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8863 */           i6 = i3 + -1;
/* 8864 */           i5 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/* 8871 */             paramInt = MainMemory.getI32(j + (i6 - i5 << 2));
/* 8872 */             if (MainMemory.getI32(paramInt) <= 0) {
/*      */               break label31454;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8882 */             free.call(MainMemory.getI32(paramInt + 88));
/*      */             
/*      */ 
/*      */             label31454:
/*      */             
/*      */ 
/* 8888 */             i5 += 1;
/* 8889 */             if (i5 == i3) {
/*      */               break;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         break label31875;
/*      */         
/*      */ 
/*      */ 
/*      */         label31494:
/*      */         
/*      */ 
/*      */ 
/* 8906 */         i27 = k + (i18 << 2);
/* 8907 */         i2 = MainMemory.getI32Aligned(470792);
/* 8908 */         i19 = MainMemory.getI32(i1 + (i19 << 2));
/* 8909 */         MainMemory.setI32(j + (i18 << 2), i2 + i19 * 344);
/* 8910 */         bool1 = MainMemory.getI32(i2 + i19 * 344) != 64536;
/* 8911 */         MainMemory.setI32(i27, bool1 ? 1 : 0);
/* 8912 */         if (!bool1) {
/*      */           break label31637;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8922 */         MainMemory.setI32(i27, MainMemory.getI32(i2 + i19 * 344 + 56));
/* 8923 */         i6 = i18;
/* 8924 */         i3 = 0;
/* 8925 */         break;
/*      */         
/*      */         label31637:
/*      */         
/* 8929 */         i18 = MainMemory.getI32(i2 + i19 * 344 + 52);
/* 8930 */         switch (i18)
/*      */         {
/*      */         case 260: 
/*      */           break label31741;
/*      */           
/*      */           break;
/*      */         case 259: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 8941 */         MainMemory.setI32(i4, MainMemory.getI32(i2 + i19 * 344 + 56 + 32));
/*      */         
/*      */         break label31852;
/*      */         
/*      */         label31741:
/* 8946 */         MainMemory.setF64(i13, MainMemory.getF64(i2 + i19 * 344 + 56 + 32));
/*      */         
/*      */ 
/*      */         break label31852;
/*      */         
/* 8951 */         i11 = i2 + i19 * 344 + 56 + 32;
/* 8952 */         if (i18 != 258) {
/*      */           break label31838;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 8962 */         MainMemory.setI8(i9, MainMemory.getI8(i11));
/*      */         
/*      */         break label31852;
/*      */         
/*      */         label31838:
/* 8967 */         SystemLibrary.strcpy(i9, i11);
/*      */         
/*      */ 
/*      */         label31852:
/*      */         
/*      */ 
/* 8973 */         MainMemory.setI8(i10, (byte)0);
/* 8974 */         i17 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */       label31875:
/*      */       
/*      */       return;
/*      */     }
/*      */     finally
/*      */     {
/* 8984 */       MainMemory.dealloc_generated(i48);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F293294.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */