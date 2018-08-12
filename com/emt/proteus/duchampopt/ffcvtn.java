/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
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
/*      */ public final class ffcvtn
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3201;
/*   23 */   public static final Function _instance = new ffcvtn();
/*   24 */   public final Function resolve() { return _instance; }
/*      */   
/*   26 */   public ffcvtn() { super("ffcvtn", 8, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*      */   {
/*   30 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*   31 */     return 0;
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
/*   45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   49 */     paramInt4 += 2;
/*   50 */     paramInt3--;
/*   51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   52 */     paramInt4 += 2;
/*   53 */     paramInt3--;
/*   54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   55 */     paramInt4 += 2;
/*   56 */     paramInt3--;
/*   57 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   58 */     paramInt4 += 2;
/*   59 */     paramInt3--;
/*   60 */     call(i, j, k, m, n, i1, i2, i3);
/*   61 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*      */   {
/*   67 */     int i = 0;
/*   68 */     int j = 0;
/*   69 */     int k = 0;
/*   70 */     float f = 0.0F;
/*   71 */     double d = 0.0D;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   77 */       switch (paramInt5) {
/*      */       case 11: 
/*      */         break label3311;
/*      */         break;
/*      */       case 14: 
/*      */         break label2806;
/*      */         break;
/*      */       case 21: 
/*      */         break label2250;
/*      */         break;
/*      */       case 31: 
/*      */         break label1874;
/*      */         break;
/*      */       case 41:  break label1484;
/*      */         break; case 42:  break label1038;
/*      */         break; case 81:  break label646;
/*      */         break; case 82:  break; }
/*   94 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label542;
/*      */         break;
/*      */       case 14: 
/*      */         break label542;
/*      */         break;
/*      */       case 21: 
/*      */         break label474;
/*      */         break;
/*      */       case 41: 
/*      */         break label406;
/*      */         break;
/*      */       case 42:  break label338;
/*      */         break; case 82:  break; }
/*  109 */       if (paramInt4 > 0) {
/*  110 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  121 */         paramInt5 = paramInt1 << 3;
/*  122 */         MainMemory.setF64(paramInt7 + paramInt5, MainMemory.getF64(paramInt2 + paramInt5));
/*  123 */         paramInt1 += 1;
/*  124 */         if (paramInt1 == paramInt4) { break label625;
/*  125 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label338:
/*      */       
/*      */ 
/*  134 */       if (paramInt4 > 0) {
/*  135 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  146 */         d = MainMemory.getF32(paramInt2 + (paramInt1 << 2));
/*  147 */         MainMemory.setF64(paramInt7 + (paramInt1 << 3), d);
/*  148 */         paramInt1 += 1;
/*  149 */         if (paramInt1 == paramInt4) { break label625;
/*  150 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label406:
/*      */       
/*      */ 
/*  159 */       if (paramInt4 > 0) {
/*  160 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  171 */         d = MainMemory.getI32(paramInt2 + (paramInt1 << 2));
/*  172 */         MainMemory.setF64(paramInt7 + (paramInt1 << 3), d);
/*  173 */         paramInt1 += 1;
/*  174 */         if (paramInt1 == paramInt4) { break label625;
/*  175 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label474:
/*      */       
/*      */ 
/*  184 */       if (paramInt4 > 0) {
/*  185 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  196 */         d = MainMemory.getI16(paramInt2 + (paramInt1 << 1));
/*  197 */         MainMemory.setF64(paramInt7 + (paramInt1 << 3), d);
/*  198 */         paramInt1 += 1;
/*  199 */         if (paramInt1 == paramInt4) { break label625;
/*  200 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label542:
/*      */       
/*      */ 
/*  209 */       if (paramInt4 > 0) {
/*  210 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  221 */         d = MainMemory.getI8(paramInt2 + paramInt1) & 0xFF;
/*  222 */         MainMemory.setF64(paramInt7 + (paramInt1 << 3), d);
/*  223 */         paramInt1 += 1;
/*  224 */         if (paramInt1 == paramInt4) { break label625;
/*  225 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  234 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label625:
/*      */       
/*      */ 
/*  240 */       ffcvtn_589.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */       break label3796;
/*      */       
/*      */       label646:
/*  245 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label938;
/*      */         break;
/*      */       case 14: 
/*      */         break label938;
/*      */         break;
/*      */       case 21: 
/*      */         break label874;
/*      */         break;
/*      */       case 41: 
/*      */         break label810;
/*      */         break;
/*      */       case 42:  break label785;
/*      */         break; case 82:  break; }
/*  260 */       fffr8i8.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, 0L, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label1017;
/*      */       
/*      */       label785:
/*  265 */       fffr4i8.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, 0L, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label1017;
/*      */       
/*      */       label810:
/*  270 */       if (paramInt4 > 0) {
/*  271 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  282 */         MainMemory.setI64(paramInt7 + (paramInt1 << 3), MainMemory.getI32(paramInt2 + (paramInt1 << 2)));
/*  283 */         paramInt1 += 1;
/*  284 */         if (paramInt1 == paramInt4) { break label1017;
/*  285 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label874:
/*      */       
/*      */ 
/*  294 */       if (paramInt4 > 0) {
/*  295 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  306 */         MainMemory.setI64(paramInt7 + (paramInt1 << 3), MainMemory.getI16(paramInt2 + (paramInt1 << 1)));
/*  307 */         paramInt1 += 1;
/*  308 */         if (paramInt1 == paramInt4) { break label1017;
/*  309 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label938:
/*      */       
/*      */ 
/*  318 */       if (paramInt4 > 0) {
/*  319 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  330 */         MainMemory.setI64(paramInt7 + (paramInt1 << 3), MainMemory.getI8(paramInt2 + paramInt1) & 0xFF);
/*  331 */         paramInt1 += 1;
/*  332 */         if (paramInt1 == paramInt4) { break label1017;
/*  333 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  342 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label1017:
/*      */       
/*      */ 
/*  348 */       ffcvtn_586.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */       break label3796;
/*      */       
/*      */       label1038:
/*  353 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label1380;
/*      */         break;
/*      */       case 14: 
/*      */         break label1380;
/*      */         break;
/*      */       case 21: 
/*      */         break label1312;
/*      */         break;
/*      */       case 41: 
/*      */         break label1241;
/*      */         break;
/*      */       case 42:  break label1175;
/*      */         break; case 82:  break; }
/*  368 */       fffr8r4.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, 0.0F, 0, 0, paramInt7);
/*      */       
/*      */       break label1463;
/*      */       
/*      */       label1175:
/*  373 */       if (paramInt4 > 0) {
/*  374 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  385 */         paramInt5 = paramInt1 << 2;
/*  386 */         MainMemory.setF32(paramInt7 + paramInt5, MainMemory.getF32(paramInt2 + paramInt5));
/*  387 */         paramInt1 += 1;
/*  388 */         if (paramInt1 == paramInt4) { break label1463;
/*  389 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1241:
/*      */       
/*      */ 
/*  398 */       if (paramInt4 > 0) {
/*  399 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  410 */         paramInt5 = paramInt1 << 2;
/*  411 */         f = MainMemory.getI32(paramInt2 + paramInt5);
/*  412 */         MainMemory.setF32(paramInt7 + paramInt5, f);
/*  413 */         paramInt1 += 1;
/*  414 */         if (paramInt1 == paramInt4) { break label1463;
/*  415 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1312:
/*      */       
/*      */ 
/*  424 */       if (paramInt4 > 0) {
/*  425 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  436 */         f = MainMemory.getI16(paramInt2 + (paramInt1 << 1));
/*  437 */         MainMemory.setF32(paramInt7 + (paramInt1 << 2), f);
/*  438 */         paramInt1 += 1;
/*  439 */         if (paramInt1 == paramInt4) { break label1463;
/*  440 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1380:
/*      */       
/*      */ 
/*  449 */       if (paramInt4 > 0) {
/*  450 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  461 */         f = MainMemory.getI8(paramInt2 + paramInt1) & 0xFF;
/*  462 */         MainMemory.setF32(paramInt7 + (paramInt1 << 2), f);
/*  463 */         paramInt1 += 1;
/*  464 */         if (paramInt1 == paramInt4) { break label1463;
/*  465 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  474 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label1463:
/*      */       
/*      */ 
/*  480 */       ffcvtn_587.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */       break label3796;
/*      */       
/*      */       label1484:
/*  485 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label1775;
/*      */         break;
/*      */       case 14: 
/*      */         break label1775;
/*      */         break;
/*      */       case 21: 
/*      */         break label1712;
/*      */         break;
/*      */       case 41: 
/*      */         break label1646;
/*      */         break;
/*      */       case 42:  break label1621;
/*      */         break; case 82:  break; }
/*  500 */       fffr8i4.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, 0, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label1853;
/*      */       
/*      */       label1621:
/*  505 */       fffr4i4.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, 0, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label1853;
/*      */       
/*      */       label1646:
/*  510 */       if (paramInt4 > 0) {
/*  511 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  522 */         paramInt5 = paramInt1 << 2;
/*  523 */         MainMemory.setI32(paramInt7 + paramInt5, MainMemory.getI32(paramInt2 + paramInt5));
/*  524 */         paramInt1 += 1;
/*  525 */         if (paramInt1 == paramInt4) { break label1853;
/*  526 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1712:
/*      */       
/*      */ 
/*  535 */       if (paramInt4 > 0) {
/*  536 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  547 */         MainMemory.setI32(paramInt7 + (paramInt1 << 2), MainMemory.getI16(paramInt2 + (paramInt1 << 1)));
/*  548 */         paramInt1 += 1;
/*  549 */         if (paramInt1 == paramInt4) { break label1853;
/*  550 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label1775:
/*      */       
/*      */ 
/*  559 */       if (paramInt4 > 0) {
/*  560 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  571 */         MainMemory.setI32(paramInt7 + (paramInt1 << 2), MainMemory.getI8(paramInt2 + paramInt1) & 0xFF);
/*  572 */         paramInt1 += 1;
/*  573 */         if (paramInt1 == paramInt4) { break label1853;
/*  574 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  583 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label1853:
/*      */       
/*      */ 
/*  589 */       ffcvtn_584.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */       break label3796;
/*      */       
/*      */       label1874:
/*  594 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label2151;
/*      */         break;
/*      */       case 14: 
/*      */         break label2151;
/*      */         break;
/*      */       case 21: 
/*      */         break label2088;
/*      */         break;
/*      */       case 41: 
/*      */         break label2022;
/*      */         break;
/*      */       case 42:  break label2005;
/*      */         break; case 82:  break; }
/*  609 */       fffr8int.call(paramInt2, paramInt4, paramInt7);
/*      */       
/*      */       break label2229;
/*      */       
/*      */       label2005:
/*  614 */       fffr4int.call(paramInt2, paramInt4, paramInt7);
/*      */       
/*      */       break label2229;
/*      */       
/*      */       label2022:
/*  619 */       if (paramInt4 > 0) {
/*  620 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  631 */         paramInt5 = paramInt1 << 2;
/*  632 */         MainMemory.setI32(paramInt7 + paramInt5, MainMemory.getI32(paramInt2 + paramInt5));
/*  633 */         paramInt1 += 1;
/*  634 */         if (paramInt1 == paramInt4) { break label2229;
/*  635 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2088:
/*      */       
/*      */ 
/*  644 */       if (paramInt4 > 0) {
/*  645 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  656 */         MainMemory.setI32(paramInt7 + (paramInt1 << 2), MainMemory.getI16(paramInt2 + (paramInt1 << 1)));
/*  657 */         paramInt1 += 1;
/*  658 */         if (paramInt1 == paramInt4) { break label2229;
/*  659 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2151:
/*      */       
/*      */ 
/*  668 */       if (paramInt4 > 0) {
/*  669 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  680 */         MainMemory.setI32(paramInt7 + (paramInt1 << 2), MainMemory.getI8(paramInt2 + paramInt1) & 0xFF);
/*  681 */         paramInt1 += 1;
/*  682 */         if (paramInt1 == paramInt4) { break label2229;
/*  683 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  692 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label2229:
/*      */       
/*      */ 
/*  698 */       ffcvtn_582.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */       break label3796;
/*      */       
/*      */       label2250:
/*  703 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label2706;
/*      */         break;
/*      */       case 14: 
/*      */         break label2706;
/*      */         break;
/*      */       case 21: 
/*      */         break label2640;
/*      */         break;
/*      */       case 41: 
/*      */         break label2414;
/*      */         break;
/*      */       case 42:  break label2389;
/*      */         break; case 82:  break; }
/*  718 */       fffr8i2.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, (short)0, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label2785;
/*      */       
/*      */       label2389:
/*  723 */       fffr4i2.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, (short)0, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label2785;
/*      */       
/*      */       label2414:
/*  728 */       if (paramInt4 <= 0) {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  738 */       j = paramInt6;
/*  739 */       paramInt1 = 0;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  746 */         k = paramInt7 + (paramInt1 << 1);
/*  747 */         if (MainMemory.getI8(paramInt3 + paramInt1) != 0) {
/*      */           break label2592;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  757 */         paramInt5 = MainMemory.getI32(paramInt2 + (paramInt1 << 2));
/*  758 */         if (paramInt5 >= 32768) {
/*      */           break label2528;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  768 */         MainMemory.setI32Aligned(470852, -11);
/*  769 */         MainMemory.setI16(k, (short)Short.MIN_VALUE);
/*      */         
/*      */         break label2613;
/*      */         
/*      */         label2528:
/*  774 */         if (paramInt5 <= 32767) {
/*      */           break label2574;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  784 */         MainMemory.setI32Aligned(470852, -11);
/*  785 */         MainMemory.setI16(k, (short)Short.MAX_VALUE);
/*      */         
/*      */         break label2613;
/*      */         
/*      */         label2574:
/*  790 */         MainMemory.setI16(k, (short)paramInt5);
/*      */         
/*      */         break label2613;
/*      */         
/*      */         label2592:
/*  795 */         MainMemory.setI16(k, MainMemory.getI16(j));
/*  796 */         MainMemory.setI32(paramInt8, 1);
/*      */         
/*      */ 
/*      */         label2613:
/*      */         
/*      */ 
/*  802 */         paramInt1 += 1;
/*  803 */         if (paramInt1 == paramInt4) { break label3796;
/*  804 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2640:
/*      */       
/*      */ 
/*  813 */       if (paramInt4 > 0) {
/*  814 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  825 */         paramInt5 = paramInt1 << 1;
/*  826 */         MainMemory.setI16(paramInt7 + paramInt5, MainMemory.getI16(paramInt2 + paramInt5));
/*  827 */         paramInt1 += 1;
/*  828 */         if (paramInt1 == paramInt4) { break label2785;
/*  829 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2706:
/*      */       
/*      */ 
/*  838 */       if (paramInt4 > 0) {
/*  839 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  850 */         MainMemory.setI16(paramInt7 + (paramInt1 << 1), (short)(MainMemory.getI8(paramInt2 + paramInt1) & 0xFF));
/*  851 */         paramInt1 += 1;
/*  852 */         if (paramInt1 == paramInt4) { break label2785;
/*  853 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  862 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label2785:
/*      */       
/*      */ 
/*  868 */       ffcvtn_588.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */       break label3796;
/*      */       
/*      */       label2806:
/*  873 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label3209;
/*      */         break;
/*      */       case 14: 
/*      */         break label3209;
/*      */         break;
/*      */       case 21: 
/*      */         break label3139;
/*      */         break;
/*      */       case 41: 
/*      */         break label3069;
/*      */         break;
/*      */       case 42:  break label2994;
/*      */         break; case 82:  break; }
/*  888 */       if (paramInt4 > 0) {
/*  889 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  900 */         MainMemory.setI8(paramInt7 + paramInt1, (byte)(MathUtils.f_une(MainMemory.getF64(paramInt2 + (paramInt1 << 3)), 0.0D) ? 1 : 0));
/*  901 */         paramInt1 += 1;
/*  902 */         if (paramInt1 == paramInt4) { break label3290;
/*  903 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label2994:
/*      */       
/*      */ 
/*  912 */       if (paramInt4 > 0) {
/*  913 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  924 */         MainMemory.setI8(paramInt7 + paramInt1, (byte)(MathUtils.f_une(MainMemory.getF32(paramInt2 + (paramInt1 << 2)), 0.0D) ? 1 : 0));
/*  925 */         paramInt1 += 1;
/*  926 */         if (paramInt1 == paramInt4) { break label3290;
/*  927 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3069:
/*      */       
/*      */ 
/*  936 */       if (paramInt4 > 0) {
/*  937 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  948 */         MainMemory.setI8(paramInt7 + paramInt1, (byte)(MainMemory.getI32(paramInt2 + (paramInt1 << 2)) != 0 ? 1 : 0));
/*  949 */         paramInt1 += 1;
/*  950 */         if (paramInt1 == paramInt4) { break label3290;
/*  951 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3139:
/*      */       
/*      */ 
/*  960 */       if (paramInt4 > 0) {
/*  961 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  972 */         MainMemory.setI8(paramInt7 + paramInt1, (byte)(MainMemory.getI16(paramInt2 + (paramInt1 << 1)) != 0 ? 1 : 0));
/*  973 */         paramInt1 += 1;
/*  974 */         if (paramInt1 == paramInt4) { break label3290;
/*  975 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3209:
/*      */       
/*      */ 
/*  984 */       if (paramInt4 > 0) {
/*  985 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/*  996 */         MainMemory.setI8(paramInt7 + paramInt1, (byte)(MainMemory.getI8(paramInt2 + paramInt1) != 0 ? 1 : 0));
/*  997 */         paramInt1 += 1;
/*  998 */         if (paramInt1 == paramInt4) { break label3290;
/*  999 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1008 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label3290:
/*      */       
/*      */ 
/* 1014 */       ffcvtn_591.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */       break label3796;
/*      */       
/*      */       label3311:
/* 1019 */       switch (paramInt1) {
/*      */       case 11: 
/*      */         break label3708;
/*      */         break;
/*      */       case 14: 
/*      */         break label3708;
/*      */         break;
/*      */       case 21: 
/*      */         break label3682;
/*      */         break;
/*      */       case 41: 
/*      */         break label3474;
/*      */         break;
/*      */       case 42:  break label3449;
/*      */         break; case 82:  break; }
/* 1034 */       fffr8i1.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, (byte)0, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label3780;
/*      */       
/*      */       label3449:
/* 1039 */       fffr4i1.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, (byte)0, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label3780;
/*      */       
/*      */       label3474:
/* 1044 */       if (paramInt4 > 0) {
/* 1045 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1056 */         i = paramInt7 + paramInt1;
/* 1057 */         if (MainMemory.getI8(paramInt3 + paramInt1) != 0) {
/*      */           break label3634;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1067 */         paramInt5 = MainMemory.getI32(paramInt2 + (paramInt1 << 2));
/* 1068 */         if (paramInt5 >= 0) {
/*      */           break label3572;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1078 */         MainMemory.setI32Aligned(470852, -11);
/* 1079 */         MainMemory.setI8(i, (byte)0);
/*      */         
/*      */         break label3655;
/*      */         
/*      */         label3572:
/* 1084 */         if (paramInt5 <= 255) {
/*      */           break label3616;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1094 */         MainMemory.setI32Aligned(470852, -11);
/* 1095 */         MainMemory.setI8(i, (byte)-1);
/*      */         
/*      */         break label3655;
/*      */         
/*      */         label3616:
/* 1100 */         MainMemory.setI8(i, (byte)paramInt5);
/*      */         
/*      */         break label3655;
/*      */         
/*      */         label3634:
/* 1105 */         MainMemory.setI8(i, MainMemory.getI8(paramInt6));
/* 1106 */         MainMemory.setI32(paramInt8, 1);
/*      */         
/*      */ 
/*      */         label3655:
/*      */         
/*      */ 
/* 1112 */         paramInt1 += 1;
/* 1113 */         if (paramInt1 == paramInt4) { break label3796;
/* 1114 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label3682:
/*      */       
/*      */ 
/* 1123 */       fffi2i1.call(paramInt2, paramInt4, 1.0D, 0.0D, 0, (short)0, (byte)0, 0, 0, paramInt7, 470852);
/*      */       
/*      */       break label3780;
/*      */       
/*      */       label3708:
/* 1128 */       if (paramInt4 > 0) {
/* 1129 */         paramInt1 = 0;
/*      */       } else {
/*      */         break label3796;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       for (;;)
/*      */       {
/* 1140 */         MainMemory.setI8(paramInt7 + paramInt1, MainMemory.getI8(paramInt2 + paramInt1));
/* 1141 */         paramInt1 += 1;
/* 1142 */         if (paramInt1 == paramInt4) { break label3780;
/* 1143 */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1152 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label3780:
/*      */       
/*      */ 
/* 1158 */       ffcvtn_590.call(paramInt7, paramInt4, paramInt3, paramInt8, paramInt6);
/*      */       
/*      */ 
/*      */ 
/*      */       label3796:
/*      */       
/*      */ 
/*      */ 
/*      */       break label3819;
/*      */       
/*      */ 
/*      */ 
/* 1170 */       MainMemory.setI32Aligned(470852, 410);
/*      */       
/*      */ 
/*      */       label3819:
/*      */       
/*      */ 
/* 1176 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcvtn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */