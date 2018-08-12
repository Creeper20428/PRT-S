/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class ffwldp extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3605;
/*   11 */   public static final com.emt.proteus.runtime.api.Function _instance = new ffwldp();
/*   12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*      */   
/*   14 */   public ffwldp() { super("ffwldp", 12, false); }
/*      */   
/*      */   public int execute(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   18 */     call(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramDouble7, paramDouble8, paramDouble9, paramInt1, paramInt2, paramInt3);
/*   19 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   25 */     paramInt4 += 2;
/*   26 */     paramInt3--;
/*   27 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   31 */     paramInt4 += 2;
/*   32 */     paramInt3--;
/*   33 */     double d4 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   34 */     paramInt4 += 2;
/*   35 */     paramInt3--;
/*   36 */     double d5 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     double d6 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     double d7 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     double d8 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     double d9 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*   49 */     paramInt4 += 2;
/*   50 */     paramInt3--;
/*   51 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   52 */     paramInt4 += 2;
/*   53 */     paramInt3--;
/*   54 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   55 */     paramInt4 += 2;
/*   56 */     paramInt3--;
/*   57 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   58 */     paramInt4 += 2;
/*   59 */     paramInt3--;
/*   60 */     call(d1, d2, d3, d4, d5, d6, d7, d8, d9, i, j, k);
/*   61 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*   67 */     double d1 = 0.0D;
/*   68 */     double d2 = 0.0D;
/*   69 */     double d3 = 0.0D;
/*   70 */     double d4 = 0.0D;
/*   71 */     int i = 0;
/*   72 */     int j = 0;
/*   73 */     double d5 = 0.0D;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   79 */       if (MainMemory.getI32Aligned(470852) <= 0) {
/*      */         break label52;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label3777;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label52:
/*      */       
/*      */ 
/*      */ 
/*   95 */       paramDouble1 -= paramDouble5;
/*   96 */       paramDouble1 *= paramDouble7;
/*   97 */       paramDouble2 -= paramDouble6;
/*   98 */       paramDouble2 *= paramDouble8;
/*   99 */       paramDouble5 = paramDouble9 * 0.01745329252D;
/*  100 */       d1 = SystemLibrary.cos(paramDouble5);
/*  101 */       d2 = SystemLibrary.sin(paramDouble5);
/*  102 */       if (!MathUtils.f_une(paramDouble9, 0.0D))
/*      */       {
/*      */ 
/*      */ 
/*  106 */         paramDouble5 = paramDouble1;
/*  107 */         paramDouble6 = paramDouble2;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  114 */         paramDouble5 = paramDouble1 * d1;
/*  115 */         paramDouble6 = paramDouble2 * d2;
/*  116 */         paramDouble5 -= paramDouble6;
/*  117 */         paramDouble2 *= d1;
/*  118 */         paramDouble1 *= d2;
/*  119 */         paramDouble1 = paramDouble2 + paramDouble1;
/*      */         
/*  121 */         paramDouble6 = paramDouble1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  129 */       paramDouble1 = paramDouble3 * 0.01745329252D;
/*  130 */       paramDouble9 = paramDouble4 * 0.01745329252D;
/*  131 */       paramDouble2 = paramDouble5 * 0.01745329252D;
/*  132 */       paramDouble3 = paramDouble6 * 0.01745329252D;
/*  133 */       d3 = paramDouble2 * paramDouble2;
/*  134 */       paramDouble5 = paramDouble3 * paramDouble3;
/*  135 */       d4 = d3 + paramDouble5;
/*  136 */       paramDouble5 = SystemLibrary.cos(paramDouble9);
/*  137 */       paramDouble6 = SystemLibrary.sin(paramDouble9);
/*  138 */       if (MainMemory.getI8(paramInt1) != 45) {
/*      */         break label3764;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  148 */       switch (MainMemory.getI8(paramInt1 + 1)) {
/*      */       case 67: 
/*      */         break label3506;
/*      */         break;
/*      */       case 84: 
/*      */         break label3288;
/*      */         break;
/*      */       case 83: 
/*      */         break label2422;
/*      */         break;
/*      */       case 65: 
/*      */         break label1275;
/*      */         break;
/*      */       case 78:  break label997;
/*      */         break; case 71:  break label754;
/*      */         break; case 77:  break; }
/*  164 */       if (MainMemory.getI8(paramInt1 + 2) != 69) {
/*      */         break label736;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  174 */       if (MainMemory.getI8(paramInt1 + 3) != 82) {
/*      */         break label736;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  184 */       paramDouble6 = d1 * paramDouble8;
/*  185 */       paramDouble7 = d2 * paramDouble7;
/*  186 */       paramDouble6 += paramDouble7;
/*  187 */       paramDouble6 = MathUtils.f_oeq(paramDouble6, 0.0D) ? 1.0D : paramDouble6;
/*  188 */       paramDouble4 *= 0.5D;
/*  189 */       paramDouble4 += 45.0D;
/*  190 */       paramDouble4 *= 0.01745329252D;
/*  191 */       paramDouble7 = paramDouble6 * 0.5D;
/*  192 */       paramDouble7 *= 0.01745329252D;
/*  193 */       paramDouble7 += paramDouble4;
/*  194 */       paramDouble4 = SystemLibrary.log(SystemLibrary.tan(paramDouble4));
/*  195 */       paramDouble6 *= 0.01745329252D;
/*  196 */       paramDouble7 = SystemLibrary.log(SystemLibrary.tan(paramDouble7)) - paramDouble4;
/*  197 */       paramDouble6 /= paramDouble7;
/*  198 */       paramDouble7 = paramDouble6 * paramDouble4;
/*  199 */       paramDouble2 /= (MathUtils.f_ugt(paramDouble5, 0.0D) ? paramDouble5 : 1.0D);
/*  200 */       paramDouble4 = paramDouble2 + paramDouble1;
/*  201 */       paramDouble2 = paramDouble4 - paramDouble1;
/*  202 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble2), 6.28318530717959D)) {
/*      */         break label664;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  212 */       MainMemory.setI32Aligned(470852, 501);
/*      */       
/*      */ 
/*      */       break label3777;
/*      */       
/*      */       label664:
/*      */       
/*  219 */       if (!MathUtils.f_une(paramDouble6, 0.0D))
/*      */       {
/*      */ 
/*      */ 
/*  223 */         paramDouble2 = 0.0D;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  230 */         paramDouble2 = paramDouble3 + paramDouble7;
/*  231 */         paramDouble2 /= paramDouble6;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  239 */       paramDouble2 = SystemLibrary.atan(SystemLibrary.exp(paramDouble2)) * 2.0D;
/*  240 */       paramDouble2 += -1.5707963267948974D;
/*      */       
/*  242 */       paramDouble3 = paramDouble4;
/*      */       
/*      */       break label3576;
/*      */       
/*      */       label736:
/*  247 */       MainMemory.setI32Aligned(470852, 504);
/*      */       
/*      */ 
/*      */       break label3777;
/*      */       
/*      */       label754:
/*      */       
/*  254 */       if (MainMemory.getI8(paramInt1 + 2) != 76) {
/*      */         break label979;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  264 */       if (MainMemory.getI8(paramInt1 + 3) != 83) {
/*      */         break label979;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  274 */       paramDouble3 = paramDouble9 + paramDouble3;
/*  275 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble3), 1.5707963267948974D)) {
/*      */         break label856;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  285 */       MainMemory.setI32Aligned(470852, 501);
/*      */       
/*      */ 
/*      */       break label3777;
/*      */       
/*      */       label856:
/*      */       
/*  292 */       paramDouble4 = SystemLibrary.cos(paramDouble3);
/*  293 */       paramDouble5 = paramDouble4 * 6.28318530717959D;
/*  294 */       paramDouble5 *= 0.5D;
/*  295 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble2), paramDouble5)) {
/*      */         break label922;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  305 */       MainMemory.setI32Aligned(470852, 501);
/*      */       
/*      */ 
/*      */       break label3777;
/*      */       
/*      */       label922:
/*      */       
/*  312 */       if (!MathUtils.f_ogt(paramDouble4, 1.0E-5D))
/*      */       {
/*      */ 
/*      */ 
/*  316 */         paramDouble2 = paramDouble3;
/*  317 */         paramDouble3 = paramDouble1;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  324 */         paramDouble2 /= paramDouble4;
/*  325 */         paramDouble4 = paramDouble2 + paramDouble1;
/*  326 */         paramDouble2 = paramDouble3;
/*  327 */         paramDouble3 = paramDouble4;
/*      */         
/*      */         break label3576;
/*      */         
/*      */         label979:
/*  332 */         MainMemory.setI32Aligned(470852, 504);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label997:
/*      */         
/*  339 */         if (MainMemory.getI8(paramInt1 + 2) != 67) {
/*      */           break label1257;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  349 */         if (MainMemory.getI8(paramInt1 + 3) != 80) {
/*      */           break label1257;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  359 */         paramDouble3 *= paramDouble6;
/*  360 */         paramDouble4 = paramDouble5 - paramDouble3;
/*  361 */         if (!MathUtils.f_oeq(paramDouble4, 0.0D)) {
/*      */           break label1101;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  371 */         MainMemory.setI32Aligned(470852, 501);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label1101:
/*      */         
/*  378 */         paramDouble3 = SystemLibrary.atan2(paramDouble2, paramDouble4) + paramDouble1;
/*  379 */         paramDouble2 = paramDouble3 - paramDouble1;
/*  380 */         paramDouble2 = SystemLibrary.cos(paramDouble2);
/*  381 */         if (!MathUtils.f_oeq(paramDouble2, 0.0D)) {
/*      */           break label1160;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  391 */         MainMemory.setI32Aligned(470852, 501);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label1160:
/*      */         
/*  398 */         paramDouble2 = paramDouble4 / paramDouble2;
/*  399 */         if ((!MathUtils.f_ogt(paramDouble2, 1.0D)) && (!MathUtils.f_olt(paramDouble2, -1.0D))) {
/*      */           break label1214;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  409 */         MainMemory.setI32Aligned(470852, 501);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label1214:
/*      */         
/*  416 */         paramDouble2 = SystemLibrary.acos(paramDouble2);
/*  417 */         if (!MathUtils.f_olt(paramDouble9, 0.0D)) {
/*      */           break label3576;
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
/*  429 */         paramDouble2 = -0.0D - paramDouble2;
/*      */         
/*      */ 
/*      */         break label3576;
/*      */         
/*      */         label1257:
/*      */         
/*  436 */         MainMemory.setI32Aligned(470852, 504);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label1275:
/*      */         
/*  443 */         i = MainMemory.getI8(paramInt1 + 2);
/*  444 */         switch (i)
/*      */         {
/*      */         case 82: 
/*      */           break label1351;
/*      */           
/*      */           break;
/*      */         case 73: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/*  455 */         i = MainMemory.getI8(paramInt1 + 3);
/*      */         
/*      */         break label1685;
/*      */         
/*      */         label1351:
/*      */         
/*  461 */         j = MainMemory.getI8(paramInt1 + 3);
/*  462 */         if (j != 67) {
/*      */           break label1661;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  472 */         if (!MathUtils.f_ult(d4, 9.869604401089369D)) {
/*      */           break label1643;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  482 */         paramDouble7 = SystemLibrary.sqrt(d4);
/*  483 */         paramDouble4 = SystemLibrary.cos(paramDouble7);
/*  484 */         if (!MathUtils.f_une(paramDouble7, 0.0D))
/*      */         {
/*      */ 
/*      */ 
/*  488 */           paramDouble7 = 1.0D;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  495 */           paramDouble7 = SystemLibrary.sin(paramDouble7) / paramDouble7;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  503 */         paramDouble3 *= paramDouble5;
/*  504 */         paramDouble3 *= paramDouble7;
/*  505 */         paramDouble8 = paramDouble6 * paramDouble4;
/*  506 */         paramDouble3 += paramDouble8;
/*  507 */         if ((!MathUtils.f_ogt(paramDouble3, 1.0D)) && (!MathUtils.f_olt(paramDouble3, -1.0D))) {
/*      */           break label1537;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  517 */         MainMemory.setI32Aligned(470852, 501);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label1537:
/*      */         
/*  524 */         paramDouble6 = paramDouble3 * paramDouble6;
/*  525 */         paramDouble4 -= paramDouble6;
/*  526 */         paramDouble2 *= paramDouble7;
/*  527 */         paramDouble2 *= paramDouble5;
/*  528 */         if ((!MathUtils.f_oeq(paramDouble4, 0.0D)) || (!MathUtils.f_oeq(paramDouble2, 0.0D))) {
/*      */           break label1609;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  538 */         MainMemory.setI32Aligned(470852, 501);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label1609:
/*      */         
/*  545 */         paramDouble3 = SystemLibrary.asin(paramDouble3);
/*  546 */         paramDouble4 = SystemLibrary.atan2(paramDouble2, paramDouble4) + paramDouble1;
/*  547 */         paramDouble2 = paramDouble3;
/*  548 */         paramDouble3 = paramDouble4;
/*      */         
/*      */         break label3576;
/*      */         
/*      */         label1643:
/*  553 */         MainMemory.setI32Aligned(470852, 501);
/*      */         
/*      */ 
/*      */         break label3777;
/*      */         
/*      */         label1661:
/*      */         
/*  560 */         if (i == 73) {
/*  561 */           i = j;
/*      */         } else {
/*      */           break label2404;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1685:
/*      */         
/*      */ 
/*      */ 
/*  572 */         if (i != 84) {
/*      */           break label2404;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  582 */         paramDouble4 = d1 * paramDouble8;
/*  583 */         paramDouble5 = d2 * paramDouble7;
/*  584 */         paramDouble4 += paramDouble5;
/*  585 */         paramDouble5 = paramDouble4 * 0.01745329252D;
/*  586 */         paramDouble4 = MathUtils.f_oeq(paramDouble4, 0.0D) ? 0.01745329252D : paramDouble5;
/*  587 */         paramDouble6 = paramDouble9 + paramDouble4;
/*  588 */         paramDouble5 = SystemLibrary.sin(paramDouble6);
/*  589 */         paramDouble6 = SystemLibrary.cos(paramDouble6) + 1.0D;
/*  590 */         paramDouble6 *= 0.5D;
/*  591 */         paramDouble6 = paramDouble5 / SystemLibrary.sqrt(paramDouble6);
/*  592 */         d4 = SystemLibrary.sin(paramDouble9);
/*  593 */         paramDouble5 = SystemLibrary.cos(paramDouble9);
/*  594 */         d5 = paramDouble5 + 1.0D;
/*  595 */         d5 *= 0.5D;
/*  596 */         d4 /= SystemLibrary.sqrt(d5);
/*  597 */         paramDouble6 -= d4;
/*  598 */         paramDouble4 /= (MathUtils.f_oeq(paramDouble6, 0.0D) ? 1.0D : paramDouble6);
/*  599 */         paramDouble6 = d1 * paramDouble7;
/*  600 */         paramDouble7 = d2 * paramDouble8;
/*  601 */         paramDouble6 -= paramDouble7;
/*  602 */         paramDouble7 = paramDouble6 * 0.01745329252D;
/*  603 */         paramDouble6 = MathUtils.f_oeq(paramDouble6, 0.0D) ? 0.01745329252D : paramDouble7;
/*  604 */         paramDouble7 = paramDouble5 * 2.0D;
/*  605 */         paramDouble8 = paramDouble6 * 0.5D;
/*  606 */         paramDouble7 *= SystemLibrary.sin(paramDouble8);
/*  607 */         paramDouble7 = MathUtils.f_oeq(paramDouble7, 0.0D) ? 1.0D : paramDouble7;
/*  608 */         paramDouble5 *= SystemLibrary.cos(paramDouble8);
/*  609 */         paramDouble5 += 1.0D;
/*  610 */         paramDouble5 *= 0.5D;
/*  611 */         paramDouble5 = SystemLibrary.sqrt(paramDouble5) * paramDouble6;
/*  612 */         paramDouble5 /= paramDouble7;
/*  613 */         if ((!MathUtils.f_une(paramDouble2, 0.0D)) && (!MathUtils.f_une(paramDouble3, 0.0D)))
/*      */         {
/*      */ 
/*      */ 
/*  617 */           paramDouble2 = paramDouble9;
/*  618 */           paramDouble3 = paramDouble1;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  625 */           paramDouble6 = SystemLibrary.cos(paramDouble9) + 1.0D;
/*  626 */           paramDouble6 *= 0.5D;
/*  627 */           paramDouble7 = SystemLibrary.sin(paramDouble9);
/*  628 */           paramDouble7 *= paramDouble4;
/*  629 */           paramDouble6 = paramDouble7 / SystemLibrary.sqrt(paramDouble6);
/*  630 */           paramDouble7 = paramDouble5 * -4.0D;
/*  631 */           paramDouble7 *= paramDouble5;
/*  632 */           paramDouble7 = d3 / paramDouble7;
/*  633 */           paramDouble7 += 4.0D;
/*  634 */           paramDouble3 += paramDouble6;
/*  635 */           paramDouble6 = paramDouble3 / paramDouble4;
/*  636 */           paramDouble6 *= paramDouble6;
/*  637 */           paramDouble6 = paramDouble7 - paramDouble6;
/*  638 */           if ((!MathUtils.f_ogt(paramDouble6, 4.0D)) && (!MathUtils.f_olt(paramDouble6, 2.0D))) {
/*      */             break label2179;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  648 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2179:
/*      */           
/*  655 */           paramDouble6 = SystemLibrary.sqrt(paramDouble6) * 0.5D;
/*  656 */           paramDouble3 *= paramDouble6;
/*  657 */           paramDouble3 /= paramDouble4;
/*  658 */           if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble3), 1.0D)) {
/*      */             break label2247;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  668 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2247:
/*      */           
/*  675 */           paramDouble3 = SystemLibrary.asin(paramDouble3);
/*  676 */           paramDouble4 = SystemLibrary.cos(paramDouble3);
/*  677 */           if (!MathUtils.f_olt(SystemLibrary.fabs(paramDouble4), 1.0E-5D)) {
/*      */             break label2306;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  687 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2306:
/*      */           
/*  694 */           paramDouble2 *= paramDouble6;
/*  695 */           paramDouble5 *= 2.0D;
/*  696 */           paramDouble4 = paramDouble5 * paramDouble4;
/*  697 */           paramDouble2 /= paramDouble4;
/*  698 */           if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble2), 1.0D)) {
/*      */             break label2373;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  708 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2373:
/*      */           
/*  715 */           paramDouble2 = SystemLibrary.asin(paramDouble2) * 2.0D;
/*  716 */           paramDouble4 = paramDouble2 + paramDouble1;
/*  717 */           paramDouble2 = paramDouble3;
/*  718 */           paramDouble3 = paramDouble4;
/*      */           
/*      */           break label3576;
/*      */           
/*      */           label2404:
/*  723 */           MainMemory.setI32Aligned(470852, 504);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2422:
/*      */           
/*  730 */           i = MainMemory.getI8(paramInt1 + 2);
/*  731 */           switch (i)
/*      */           {
/*      */           case 73: 
/*      */             break label2499;
/*      */             
/*      */             break;
/*      */           case 84: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  742 */           i = MainMemory.getI8(paramInt1 + 3);
/*      */           
/*      */           break label2776;
/*      */           
/*      */           label2499:
/*      */           
/*  748 */           j = MainMemory.getI8(paramInt1 + 3);
/*  749 */           if (j != 78) {
/*      */             break label2752;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  759 */           if (!MathUtils.f_ogt(d4, 1.0D)) {
/*      */             break label2568;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  769 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2568:
/*      */           
/*  776 */           paramDouble4 = 1.0D - d4;
/*  777 */           paramDouble7 = SystemLibrary.sqrt(paramDouble4);
/*  778 */           paramDouble4 = paramDouble6 * paramDouble7;
/*  779 */           paramDouble8 = paramDouble5 * paramDouble3;
/*  780 */           paramDouble4 += paramDouble8;
/*  781 */           if ((!MathUtils.f_ogt(paramDouble4, 1.0D)) && (!MathUtils.f_olt(paramDouble4, -1.0D))) {
/*      */             break label2653;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  791 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2653:
/*      */           
/*  798 */           paramDouble5 *= paramDouble7;
/*  799 */           paramDouble3 = paramDouble6 * paramDouble3;
/*  800 */           paramDouble3 = paramDouble5 - paramDouble3;
/*  801 */           if ((!MathUtils.f_oeq(paramDouble3, 0.0D)) || (!MathUtils.f_oeq(paramDouble2, 0.0D))) {
/*      */             break label2722;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  811 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2722:
/*      */           
/*  818 */           paramDouble4 = SystemLibrary.asin(paramDouble4);
/*  819 */           paramDouble3 = SystemLibrary.atan2(paramDouble2, paramDouble3) + paramDouble1;
/*  820 */           paramDouble2 = paramDouble4;
/*      */           
/*      */           break label3576;
/*      */           
/*      */           label2752:
/*      */           
/*  826 */           if (i == 84) {
/*  827 */             i = j;
/*      */           } else {
/*      */             break label3270;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label2776:
/*      */           
/*      */ 
/*      */ 
/*  838 */           if (i != 71) {
/*      */             break label3270;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  848 */           paramDouble4 = 4.0D - d4;
/*  849 */           paramDouble7 = d4 + 4.0D;
/*  850 */           paramDouble8 = paramDouble4 / paramDouble7;
/*  851 */           if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble8), 1.0D)) {
/*      */             break label2862;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  861 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2862:
/*      */           
/*  868 */           paramDouble4 = paramDouble8 * paramDouble6;
/*  869 */           paramDouble7 = paramDouble3 * paramDouble5;
/*  870 */           paramDouble8 += 1.0D;
/*  871 */           paramDouble7 *= paramDouble8;
/*  872 */           paramDouble7 *= 0.5D;
/*  873 */           paramDouble4 += paramDouble7;
/*  874 */           if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble4), 1.0D)) {
/*      */             break label2947;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  884 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label2947:
/*      */           
/*  891 */           paramDouble4 = SystemLibrary.asin(paramDouble4);
/*  892 */           paramDouble7 = SystemLibrary.cos(paramDouble4);
/*  893 */           if (!MathUtils.f_olt(SystemLibrary.fabs(paramDouble7), 1.0E-5D)) {
/*      */             break label3006;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  903 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label3006:
/*      */           
/*  910 */           paramDouble2 = paramDouble8 * paramDouble2;
/*  911 */           paramDouble8 = paramDouble7 * 2.0D;
/*  912 */           paramDouble2 /= paramDouble8;
/*  913 */           if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble2), 1.0D)) {
/*      */             break label3066;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  923 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label3066:
/*      */           
/*  930 */           paramDouble2 = SystemLibrary.asin(paramDouble2);
/*  931 */           paramDouble8 = SystemLibrary.sin(paramDouble4);
/*  932 */           paramDouble9 = paramDouble8 * paramDouble6;
/*  933 */           paramDouble9 += 1.0D;
/*  934 */           paramDouble7 *= paramDouble5;
/*  935 */           paramDouble7 *= SystemLibrary.cos(paramDouble2);
/*  936 */           paramDouble7 = paramDouble9 + paramDouble7;
/*  937 */           if (!MathUtils.f_olt(SystemLibrary.fabs(paramDouble7), 1.0E-5D)) {
/*      */             break label3159;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  947 */           MainMemory.setI32Aligned(470852, 501);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label3159:
/*      */           
/*  954 */           paramDouble5 = paramDouble8 * paramDouble5;
/*  955 */           paramDouble6 = SystemLibrary.cos(paramDouble4) * paramDouble6;
/*  956 */           paramDouble6 *= SystemLibrary.cos(paramDouble2);
/*  957 */           paramDouble5 -= paramDouble6;
/*  958 */           paramDouble5 *= 2.0D;
/*  959 */           paramDouble5 /= paramDouble7;
/*  960 */           paramDouble3 = paramDouble5 - paramDouble3;
/*  961 */           if (!MathUtils.f_ogt(SystemLibrary.fabs(paramDouble3), 1.0E-5D)) {
/*      */             break label3252;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  972 */           paramDouble2 = 3.141592653589795D - paramDouble2;
/*      */           
/*      */ 
/*      */ 
/*      */           label3252:
/*      */           
/*      */ 
/*      */ 
/*  980 */           paramDouble3 = paramDouble1 + paramDouble2;
/*  981 */           paramDouble2 = paramDouble4;
/*      */           
/*      */           break label3576;
/*      */           
/*      */           label3270:
/*      */           
/*  987 */           MainMemory.setI32Aligned(470852, 504);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label3288:
/*      */           
/*  994 */           if (MainMemory.getI8(paramInt1 + 2) != 65) {
/*      */             break label3488;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1004 */           if (MainMemory.getI8(paramInt1 + 3) != 78) {
/*      */             break label3488;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1014 */           paramDouble8 = SystemLibrary.cos(paramDouble1);
/* 1015 */           paramDouble4 = paramDouble8 * paramDouble5;
/* 1016 */           paramDouble7 = SystemLibrary.sin(paramDouble1);
/* 1017 */           paramDouble9 = paramDouble7 * paramDouble2;
/* 1018 */           paramDouble4 -= paramDouble9;
/* 1019 */           paramDouble9 = paramDouble8 * paramDouble3;
/* 1020 */           paramDouble9 *= paramDouble6;
/* 1021 */           paramDouble4 -= paramDouble9;
/* 1022 */           paramDouble9 = paramDouble7 * paramDouble5;
/* 1023 */           paramDouble2 = paramDouble8 * paramDouble2;
/* 1024 */           paramDouble2 = paramDouble9 + paramDouble2;
/* 1025 */           paramDouble7 *= paramDouble3;
/* 1026 */           paramDouble7 *= paramDouble6;
/* 1027 */           paramDouble2 -= paramDouble7;
/* 1028 */           paramDouble3 *= paramDouble5;
/* 1029 */           paramDouble5 = paramDouble3 + paramDouble6;
/* 1030 */           paramDouble3 = SystemLibrary.atan2(paramDouble2, paramDouble4);
/* 1031 */           paramDouble4 *= paramDouble4;
/* 1032 */           paramDouble2 *= paramDouble2;
/* 1033 */           paramDouble2 = paramDouble4 + paramDouble2;
/* 1034 */           paramDouble2 = paramDouble5 / SystemLibrary.sqrt(paramDouble2);
/* 1035 */           paramDouble2 = SystemLibrary.atan(paramDouble2);
/*      */           
/*      */ 
/*      */           break label3576;
/*      */           
/*      */           label3488:
/*      */           
/* 1042 */           MainMemory.setI32Aligned(470852, 504);
/*      */           
/*      */ 
/*      */           break label3777;
/*      */           
/*      */           label3506:
/*      */           
/* 1049 */           if (MainMemory.getI8(paramInt1 + 2) != 65) {
/*      */             break label3728;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1059 */           if (MainMemory.getI8(paramInt1 + 3) != 82) {
/*      */             break label3728;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1069 */           paramDouble4 = paramDouble1 + paramDouble2;
/* 1070 */           paramDouble2 = paramDouble9 + paramDouble3;
/*      */           
/* 1072 */           paramDouble3 = paramDouble4;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */       label3576:
/*      */       
/*      */ 
/* 1080 */       paramDouble4 = paramDouble3 - paramDouble1;
/* 1081 */       if (!MathUtils.f_ogt(paramDouble4, 3.141592653589795D)) {
/*      */         break label3619;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1092 */       paramDouble3 += -6.28318530717959D;
/*      */       
/*      */ 
/*      */ 
/*      */       label3619:
/*      */       
/*      */ 
/*      */ 
/* 1100 */       paramDouble1 = paramDouble3 - paramDouble1;
/* 1101 */       if (!MathUtils.f_olt(paramDouble1, -3.141592653589795D))
/*      */       {
/*      */ 
/*      */ 
/* 1105 */         paramDouble1 = paramDouble3;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/* 1112 */         paramDouble1 = paramDouble3 + 6.28318530717959D;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1120 */       if (!MathUtils.f_olt(paramDouble1, 0.0D)) {
/*      */         break label3694;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1131 */       paramDouble1 += 6.28318530717959D;
/*      */       
/*      */ 
/*      */ 
/*      */       label3694:
/*      */       
/*      */ 
/*      */ 
/* 1139 */       paramDouble1 /= 0.01745329252D;
/* 1140 */       MainMemory.setF64(paramInt2, paramDouble1);
/* 1141 */       paramDouble1 = paramDouble2 / 0.01745329252D;
/* 1142 */       MainMemory.setF64(paramInt3, paramDouble1);
/*      */       
/*      */ 
/*      */       break label3777;
/*      */       
/*      */       label3728:
/*      */       
/* 1149 */       MainMemory.setI32Aligned(470852, 504);
/*      */       
/*      */ 
/*      */ 
/*      */       break label3777;
/*      */       
/*      */ 
/* 1156 */       MainMemory.setI32Aligned(470852, 504);
/*      */       
/*      */ 
/*      */       break label3777;
/*      */       
/*      */       label3764:
/*      */       
/* 1163 */       MainMemory.setI32Aligned(470852, 504);
/*      */       
/*      */ 
/*      */       label3777:
/*      */       
/*      */ 
/* 1169 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffwldp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */