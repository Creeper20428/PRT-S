/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class celset extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2784;
/*   13 */   public static final Function _instance = new celset();
/*   14 */   public final Function resolve() { return _instance; }
/*      */   
/*   16 */   public celset() { super("celset", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   20 */     return call(paramInt);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   26 */     paramInt4 += 2;
/*   27 */     paramInt3--;
/*   28 */     int j = call(i);
/*   29 */     paramFrame.setI32(paramInt1, j);
/*   30 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt)
/*      */   {
/*   35 */     int i = 0;
/*      */     
/*   37 */     int j = 0;
/*   38 */     int k = 0;
/*   39 */     int m = 0;
/*   40 */     int n = 0;
/*   41 */     int i1 = 0;
/*   42 */     int i2 = 0;
/*   43 */     int i3 = 0;
/*   44 */     int i4 = 0;
/*   45 */     int i5 = 0;
/*   46 */     double d1 = 0.0D;
/*   47 */     double d2 = 0.0D;
/*   48 */     double d3 = 0.0D;
/*   49 */     int i6 = 0;
/*   50 */     int i7 = 0;
/*   51 */     double d4 = 0.0D;
/*   52 */     double d5 = 0.0D;
/*   53 */     int i8 = 0;
/*   54 */     int i9 = 0;
/*   55 */     double d6 = 0.0D;
/*   56 */     double d7 = 0.0D;
/*   57 */     boolean bool1 = false;
/*   58 */     boolean bool2 = false;
/*      */     
/*      */ 
/*   61 */     int i10 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   65 */       j = MainMemory.alloc(8);
/*   66 */       k = MainMemory.alloc(8);
/*   67 */       m = MainMemory.alloc(8);
/*   68 */       n = MainMemory.alloc(8);
/*   69 */       i1 = MainMemory.alloc(8);
/*   70 */       i2 = MainMemory.alloc(8);
/*   71 */       if (paramInt == 0) {
/*   72 */         i9 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   82 */         i3 = paramInt + 56;
/*   83 */         if (MainMemory.getI32(paramInt + 4) != 0) {
/*      */           break label188;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   93 */         MainMemory.setF64(paramInt + 312, 9.87654321E107D);
/*   94 */         MainMemory.setF64(paramInt + 320, 9.87654321E107D);
/*      */         
/*      */         break label223;
/*      */         
/*      */         label188:
/*   99 */         MainMemory.setF64(paramInt + 312, MainMemory.getF64(paramInt + 8));
/*  100 */         MainMemory.setF64(paramInt + 320, MainMemory.getF64(paramInt + 16));
/*      */         
/*      */ 
/*      */         label223:
/*      */         
/*      */ 
/*  106 */         i9 = prjset.call(i3);
/*  107 */         if (i9 != 0) {
/*      */           break label3331;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  118 */         i4 = paramInt + 8;
/*  119 */         d2 = MainMemory.getF64(i4);
/*  120 */         if (!MathUtils.f_oeq(d2, 9.87654321E107D))
/*      */         {
/*      */ 
/*      */ 
/*  124 */           d5 = d2;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  131 */           d2 = MainMemory.getF64(paramInt + 312);
/*  132 */           MainMemory.setF64(i4, d2);
/*  133 */           d5 = d2;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  140 */         i5 = paramInt + 16;
/*  141 */         d2 = MainMemory.getF64(i5);
/*  142 */         if (!MathUtils.f_oeq(d2, 9.87654321E107D)) {
/*      */           break label383;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  152 */         d2 = MainMemory.getF64(paramInt + 320);
/*  153 */         MainMemory.setF64(i5, d2);
/*  154 */         d1 = d2;
/*      */         
/*      */         break label507;
/*      */         
/*      */         label383:
/*  159 */         d4 = SystemLibrary.fabs(d2);
/*  160 */         if (!MathUtils.f_ogt(d4, 90.0D))
/*      */         {
/*      */ 
/*      */ 
/*  164 */           d1 = d2;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  171 */           if (MathUtils.f_ogt(d4, 90.0000000001D)) {
/*  172 */             i9 = 3;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             break label3331;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*  182 */           if (!MathUtils.f_ogt(d2, 90.0D)) {
/*      */             break label489;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  192 */           MainMemory.setF64(i5, 90.0D);
/*  193 */           d1 = 90.0D;
/*      */           
/*      */           break label507;
/*      */           
/*      */           label489:
/*  198 */           MainMemory.setF64(i5, -90.0D);
/*  199 */           d1 = -90.0D;
/*      */         }
/*      */         
/*      */ 
/*      */         label507:
/*      */         
/*      */ 
/*  206 */         d2 = MainMemory.getF64(paramInt + 24);
/*  207 */         d3 = MainMemory.getF64(paramInt + 32);
/*  208 */         i6 = paramInt + 40;
/*  209 */         d7 = MainMemory.getF64(i6);
/*  210 */         i7 = paramInt + 48;
/*  211 */         d4 = MainMemory.getF64(i7);
/*  212 */         if ((!MathUtils.f_oeq(d7, 9.87654321E107D)) && (!MathUtils.f_oeq(d7, 999.0D)))
/*      */         {
/*      */ 
/*      */ 
/*  216 */           d5 = d7;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  223 */           d5 += (MathUtils.f_ogt(d1, d3) ? 180.0D : 0.0D);
/*  224 */           if (!MathUtils.f_olt(d5, -180.0D)) {
/*      */             break label654;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  234 */           d5 += 360.0D;
/*      */           
/*      */           break label691;
/*      */           
/*      */           label654:
/*      */           
/*  240 */           if (!MathUtils.f_ogt(d5, 180.0D)) {
/*      */             break label691;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  251 */           d5 += -360.0D;
/*      */           
/*      */ 
/*      */ 
/*      */           label691:
/*      */           
/*      */ 
/*      */ 
/*  259 */           MainMemory.setF64(i6, d5);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  267 */         i8 = paramInt + 552;
/*  268 */         MainMemory.setI32(i8, 0);
/*  269 */         if (MathUtils.f_oeq(d1, 90.0D)) {
/*  270 */           d4 = d3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  281 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*      */             break label992;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  291 */           d7 = d3 / 90.0D;
/*  292 */           d7 += 0.5D;
/*  293 */           i9 = (int)SystemLibrary.floor(d7);
/*  294 */           switch ((i9 > -1 ? i9 : 0 - i9) & 0x3) {
/*      */           case 0: 
/*      */             break label971;
/*      */             break;
/*      */           case 1: 
/*      */             break label935;
/*      */             break;
/*      */           case 2: 
/*      */             break label912;
/*      */             break;
/*      */           case 3: 
/*      */             break;
/*      */           }
/*  307 */           MainMemory.setF64(n, MathUtils.f_ogt(d3, 0.0D) ? -1.0D : 1.0D);
/*  308 */           MainMemory.setF64(j, 0.0D);
/*      */           
/*      */           break label1028;
/*      */           
/*      */           label912:
/*      */           
/*  314 */           MainMemory.setF64(n, 0.0D);
/*  315 */           MainMemory.setF64(j, -1.0D);
/*      */           
/*      */           break label1028;
/*      */           
/*      */           label935:
/*      */           
/*  321 */           MainMemory.setF64(n, MathUtils.f_ogt(d3, 0.0D) ? 1.0D : -1.0D);
/*  322 */           MainMemory.setF64(j, 0.0D);
/*      */           
/*      */           break label1028;
/*      */           
/*      */           label971:
/*      */           
/*  328 */           MainMemory.setF64(n, 0.0D);
/*  329 */           MainMemory.setF64(j, 1.0D);
/*      */           
/*      */           break label1028;
/*      */           
/*      */           label992:
/*      */           
/*  335 */           d1 = d3 * 3.141592653589793D;
/*  336 */           d1 /= 180.0D;
/*  337 */           SystemLibrary.sincos(d1, n, j);
/*  338 */           d1 = MainMemory.getF64(i5);
/*      */           
/*      */ 
/*      */ 
/*      */           label1028:
/*      */           
/*      */ 
/*      */ 
/*  346 */           sincosd.call(d1, i2, m);
/*  347 */           d1 = MainMemory.getF64(i4);
/*  348 */           if (!MathUtils.f_oeq(d1, d5)) {
/*      */             break label1107;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  358 */           MainMemory.setF64(i1, 0.0D);
/*  359 */           MainMemory.setF64(k, 1.0D);
/*  360 */           d1 = MainMemory.getF64(i5);
/*  361 */           d3 = 90.0D - d3;
/*      */           
/*      */ 
/*  364 */           d7 = d3;
/*      */           
/*      */           break label1760;
/*      */           
/*      */           label1107:
/*  369 */           d3 = d5 - d1;
/*  370 */           sincosd.call(d3, i1, k);
/*  371 */           d3 = MainMemory.getF64(m) * MainMemory.getF64(k);
/*  372 */           d1 = MainMemory.getF64(i2);
/*  373 */           d7 = d3 * d3;
/*  374 */           d6 = d1 * d1;
/*  375 */           d7 += d6;
/*  376 */           d7 = SystemLibrary.sqrt(d7);
/*  377 */           d6 = MainMemory.getF64(n);
/*  378 */           if (!MathUtils.f_oeq(d7, 0.0D)) {
/*      */             break label1303;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  388 */           if (MathUtils.f_une(d6, 0.0D)) {
/*  389 */             i9 = 3;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             break label3331;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*  399 */           MainMemory.setI32(i8, 2);
/*  400 */           if (MathUtils.f_ogt(d4, 90.0D)) {
/*  401 */             d4 = 90.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  411 */             if (!MathUtils.f_olt(d4, -90.0D))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  416 */               d1 = 0.0D;
/*  417 */               d7 = 0.0D;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  424 */               d4 = -90.0D;
/*  425 */               d1 = 0.0D;
/*  426 */               d7 = 0.0D;
/*      */               
/*      */               break label1760;
/*      */               
/*      */               label1303:
/*  431 */               d7 = d6 / d7;
/*  432 */               d6 = SystemLibrary.fabs(d7);
/*  433 */               if (!MathUtils.f_ogt(d6, 1.0D)) {
/*      */                 break label1406;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  444 */               d6 += -1.0D;
/*  445 */               if (!MathUtils.f_olt(d6, 1.0E-10D))
/*      */               {
/*      */ 
/*      */ 
/*  449 */                 i9 = 3;
/*      */                 
/*      */ 
/*      */                 break label3331;
/*      */               }
/*      */               
/*      */ 
/*  456 */               if (MathUtils.f_ogt(d7, 0.0D)) {
/*  457 */                 d7 = 1.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  467 */                 d7 = -1.0D;
/*      */               }
/*      */               
/*      */ 
/*      */               label1406:
/*      */               
/*      */ 
/*  474 */               if (!MathUtils.f_oeq(d1, 0.0D)) {
/*      */                 break label1485;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  484 */               if (!MathUtils.f_ult(d3, 0.0D))
/*      */               {
/*      */ 
/*      */ 
/*  488 */                 d3 = 0.0D;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  495 */                 if (MathUtils.f_olt(d3, 0.0D)) {
/*  496 */                   d3 = 180.0D;
/*      */                   
/*      */                   break label1581;
/*      */                 }
/*      */                 else
/*      */                 {
/*      */                   break label1555;
/*      */                 }
/*      */                 label1485:
/*  505 */                 if (!MathUtils.f_oeq(d3, 0.0D)) {
/*      */                   break label1555;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  515 */                 if (MathUtils.f_ogt(d1, 0.0D)) {
/*  516 */                   d3 = 90.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*  526 */                 else if (MathUtils.f_olt(d1, 0.0D)) {
/*  527 */                   d3 = -90.0D;
/*      */                 }
/*      */                 else
/*      */                 {
/*      */                   label1555:
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  537 */                   d3 = SystemLibrary.atan2(d1, d3) * 180.0D;
/*  538 */                   d3 /= 3.141592653589793D;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */               label1581:
/*      */               
/*      */ 
/*  546 */               if (!MathUtils.f_ult(d7, 1.0D)) {
/*      */                 break label1696;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  556 */               if (MathUtils.f_oeq(d7, 0.0D))
/*      */               {
/*  558 */                 d1 = d3;
/*  559 */                 d7 = 90.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  569 */                 if (!MathUtils.f_ugt(d7, -1.0D))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  579 */                   d1 = d7 + 1.0D;
/*  580 */                   if (MathUtils.f_ogt(d1, -1.0E-10D))
/*      */                   {
/*  582 */                     d1 = d3;
/*  583 */                     d7 = 180.0D;
/*      */                     
/*      */                     break label1760;
/*      */                   }
/*      */                   else
/*      */                   {
/*      */                     break label1732;
/*      */                   }
/*      */                   label1696:
/*  592 */                   d1 = d7 + -1.0D;
/*  593 */                   if (MathUtils.f_olt(d1, 1.0E-10D))
/*      */                   {
/*  595 */                     d1 = d3;
/*  596 */                     d7 = 0.0D;
/*      */                     
/*      */ 
/*      */                     break label1760;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label1732:
/*      */                 
/*  606 */                 d1 = SystemLibrary.acos(d7) * 180.0D;
/*  607 */                 d7 = d1 / 3.141592653589793D;
/*      */                 
/*  609 */                 d1 = d3;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label1760:
/*      */             
/*      */ 
/*      */ 
/*  619 */             if (MainMemory.getI32(i8) != 0) {
/*      */               break label2200;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  630 */             d3 = d1 + d7;
/*  631 */             if (!MathUtils.f_ogt(d3, 180.0D)) {
/*      */               break label1830;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  641 */             d3 += -360.0D;
/*      */             
/*      */             break label1867;
/*      */             
/*      */             label1830:
/*      */             
/*  647 */             if (!MathUtils.f_olt(d3, -180.0D)) {
/*      */               break label1867;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  658 */             d3 += 360.0D;
/*      */             
/*      */ 
/*      */ 
/*      */             label1867:
/*      */             
/*      */ 
/*      */ 
/*  666 */             d1 -= d7;
/*  667 */             if (!MathUtils.f_ogt(d1, 180.0D)) {
/*      */               break label1916;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  677 */             d1 += -360.0D;
/*      */             
/*      */             break label1953;
/*      */             
/*      */             label1916:
/*      */             
/*  683 */             if (!MathUtils.f_olt(d1, -180.0D)) {
/*      */               break label1953;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  694 */             d1 += 360.0D;
/*      */             
/*      */ 
/*      */ 
/*      */             label1953:
/*      */             
/*      */ 
/*      */ 
/*  702 */             bool1 = MathUtils.f_olt(SystemLibrary.fabs(d3), 90.0000000001D);
/*  703 */             if (!bool1) {
/*      */               break label1996;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  713 */             celset_495.call(d1, i8);
/*      */             
/*      */ 
/*      */             label1996:
/*      */             
/*      */ 
/*  719 */             d7 = d4 - d3;
/*  720 */             d7 = SystemLibrary.fabs(d7);
/*  721 */             d4 -= d1;
/*  722 */             if (!MathUtils.f_olt(d7, SystemLibrary.fabs(d4))) {
/*      */               break label2076;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  732 */             if (bool1) {
/*  733 */               d4 = d3;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  743 */               d4 = d1;
/*      */               
/*      */               break label2113;
/*      */               
/*      */               label2076:
/*  748 */               if (MathUtils.f_olt(SystemLibrary.fabs(d1), 90.0000000001D)) {
/*  749 */                 d4 = d1;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  759 */                 d4 = d3;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */             label2113:
/*      */             
/*  766 */             if (!MathUtils.f_olt(SystemLibrary.fabs(d4), 90.0000000001D)) {
/*      */               break label2200;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  777 */             if (MathUtils.f_ogt(d4, 90.0D)) {
/*  778 */               d4 = 90.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  788 */               if (!MathUtils.f_olt(d4, -90.0D)) {
/*      */                 break label2200;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  799 */               d4 = -90.0D;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */           label2200:
/*      */           
/*  806 */           bool1 = MathUtils.f_oeq(SystemLibrary.fmod(d4, 90.0D), 0.0D);
/*  807 */           if (!bool1) {
/*      */             break label2374;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  817 */           d3 = d4 / 90.0D;
/*  818 */           d3 += 0.5D;
/*  819 */           i9 = (int)SystemLibrary.floor(d3);
/*  820 */           switch ((i9 > -1 ? i9 : 0 - i9) & 0x3) {
/*      */           case 0:  break label2361;
/*      */             break; case 1:  d1 = 0.0D;
/*      */             break label2406;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d1 = 0.0D;
/*      */             
/*      */ 
/*      */             break label2406;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  835 */           d1 = -1.0D;
/*      */           
/*      */           break label2406;
/*      */           
/*      */           label2361:
/*  840 */           d1 = 1.0D;
/*      */           
/*      */           break label2406;
/*      */           
/*      */           label2374:
/*  845 */           d3 = d4 * 3.141592653589793D;
/*  846 */           d3 /= 180.0D;
/*  847 */           d3 = SystemLibrary.cos(d3);
/*  848 */           d1 = d3;
/*      */           
/*      */ 
/*      */ 
/*      */           label2406:
/*      */           
/*      */ 
/*  855 */           d3 = MainMemory.getF64(j);
/*  856 */           d1 *= d3;
/*  857 */           if (!MathUtils.f_olt(SystemLibrary.fabs(d1), 1.0E-10D)) {
/*      */             break label2558;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  867 */           if (MathUtils.f_olt(SystemLibrary.fabs(d3), 1.0E-10D)) {
/*  868 */             d3 = d2;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  878 */             if (!MathUtils.f_ogt(d4, 0.0D)) {
/*      */               break label2531;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  888 */             d3 = d2 + d5;
/*  889 */             d3 -= MainMemory.getF64(i4);
/*  890 */             d3 += -180.0D;
/*      */             
/*      */             break label3016;
/*      */             
/*      */             label2531:
/*      */             
/*  896 */             d3 = d2 - d5;
/*  897 */             d3 += MainMemory.getF64(i4);
/*      */             
/*      */             break label3016;
/*      */             
/*      */             label2558:
/*      */             
/*  903 */             d7 = MainMemory.getF64(i2);
/*  904 */             if (!bool1) {
/*      */               break label2726;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  914 */             d6 = d4 / 90.0D;
/*  915 */             d6 += -0.5D;
/*  916 */             i9 = (int)SystemLibrary.floor(d6);
/*  917 */             switch ((i9 > -1 ? i9 : 0 - i9) & 0x3) {
/*      */             case 0:  break label2713;
/*      */               break; case 1:  d6 = 0.0D;
/*      */               break label2754;
/*      */               break;
/*      */             case 2: 
/*      */               break; case 3:  d6 = 0.0D;
/*      */               
/*      */ 
/*      */               break label2754;
/*      */               
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*  932 */             d6 = -1.0D;
/*      */             
/*      */             break label2754;
/*      */             
/*      */             label2713:
/*  937 */             d6 = 1.0D;
/*      */             
/*      */             break label2754;
/*      */             
/*      */             label2726:
/*  942 */             d6 = d4 * 3.141592653589793D;
/*  943 */             d6 /= 180.0D;
/*  944 */             d6 = SystemLibrary.sin(d6);
/*      */             
/*      */ 
/*      */ 
/*      */             label2754:
/*      */             
/*      */ 
/*      */ 
/*  952 */             d6 *= MainMemory.getF64(n);
/*  953 */             d7 -= d6;
/*  954 */             d1 = d7 / d1;
/*  955 */             d7 = MainMemory.getF64(i1) * MainMemory.getF64(m);
/*  956 */             d3 = d7 / d3;
/*  957 */             bool1 = MathUtils.f_oeq(d1, 0.0D);
/*  958 */             bool2 = MathUtils.f_oeq(d3, 0.0D);
/*  959 */             if ((bool1) && (bool2)) {
/*  960 */               i9 = 3;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               break label3331;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  970 */             if (!bool2) {
/*      */               break label2912;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  980 */             if (!MathUtils.f_ult(d1, 0.0D))
/*      */             {
/*      */ 
/*      */ 
/*  984 */               d3 = 0.0D;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  991 */               if (MathUtils.f_olt(d1, 0.0D)) {
/*  992 */                 d3 = 180.0D;
/*      */                 
/*      */                 break label3004;
/*      */               }
/*      */               else
/*      */               {
/*      */                 break label2978;
/*      */               }
/*      */               label2912:
/* 1001 */               if (!bool1) {
/*      */                 break label2978;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1011 */               if (MathUtils.f_ogt(d3, 0.0D)) {
/* 1012 */                 d3 = 90.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/* 1022 */               else if (MathUtils.f_olt(d3, 0.0D)) {
/* 1023 */                 d3 = -90.0D;
/*      */               }
/*      */               else
/*      */               {
/*      */                 label2978:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1033 */                 d3 = SystemLibrary.atan2(d3, d1) * 180.0D;
/* 1034 */                 d3 /= 3.141592653589793D;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */             label3004:
/*      */             
/*      */ 
/* 1042 */             d3 = d2 - d3;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3016:
/*      */           
/*      */ 
/* 1050 */           if (!MathUtils.f_ult(d2, 0.0D)) {
/*      */             break label3124;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1060 */           if (!MathUtils.f_ogt(d3, 0.0D)) {
/*      */             break label3078;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1070 */           d2 = d3 + -360.0D;
/*      */           
/*      */ 
/*      */           break label3205;
/*      */           
/*      */           label3078:
/*      */           
/* 1077 */           if (!MathUtils.f_olt(d3, -360.0D))
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1082 */             d2 = d3;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/* 1089 */             d2 = d3 + 360.0D;
/*      */             
/*      */ 
/*      */             break label3205;
/*      */             
/*      */             label3124:
/*      */             
/* 1096 */             if (!MathUtils.f_olt(d3, 0.0D)) {
/*      */               break label3164;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1106 */             d2 = d3 + 360.0D;
/*      */             
/*      */ 
/*      */             break label3205;
/*      */             
/*      */             label3164:
/*      */             
/* 1113 */             if (!MathUtils.f_ogt(d3, 360.0D))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/* 1118 */               d2 = d3;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1125 */               d2 = d3 + -360.0D;
/*      */             }
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3205:
/*      */         
/*      */ 
/* 1135 */         MainMemory.setF64(i7, d4);
/* 1136 */         MainMemory.setF64(paramInt + 512, d2);
/* 1137 */         d2 = 90.0D - d4;
/* 1138 */         MainMemory.setF64(paramInt + 520, d2);
/* 1139 */         MainMemory.setF64(paramInt + 528, d5);
/* 1140 */         i7 = paramInt + 544;
/* 1141 */         sincosd.call(d2, i7, paramInt + 536);
/* 1142 */         MainMemory.setI32(paramInt + 556, MathUtils.f_oeq(MainMemory.getF64(i7), 0.0D) ? 1 : 0);
/* 1143 */         MainMemory.setI32(paramInt, 137);
/* 1144 */         i = MathUtils.f_ogt(SystemLibrary.fabs(d4), 90.0000000001D) ? 4 : 0;
/*      */         
/*      */ 
/*      */         break label3339;
/*      */       }
/*      */       
/*      */       label3331:
/*      */       
/* 1152 */       i = i9;
/*      */       
/*      */ 
/*      */       label3339:
/*      */       
/*      */ 
/* 1158 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1163 */       MainMemory.dealloc_generated(i10);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/celset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */