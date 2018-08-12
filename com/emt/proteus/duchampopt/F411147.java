/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.calloc;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ 
/*      */ public final class F411147 extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3636;
/*   15 */   public static final com.emt.proteus.runtime.api.Function _instance = new F411147();
/*   16 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*      */   
/*   18 */   public F411147() { super("F411147", 12, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*      */   {
/*   22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11);
/*   23 */     return 0;
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   29 */     paramInt4 += 2;
/*   30 */     paramInt3--;
/*   31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   32 */     paramInt4 += 2;
/*   33 */     paramInt3--;
/*   34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   35 */     paramInt4 += 2;
/*   36 */     paramInt3--;
/*   37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   38 */     paramInt4 += 2;
/*   39 */     paramInt3--;
/*   40 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   59 */     paramInt4 += 2;
/*   60 */     paramInt3--;
/*   61 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   62 */     paramInt4 += 2;
/*   63 */     paramInt3--;
/*   64 */     call(i, j, k, m, f, n, i1, i2, i3, i4, i5, i6);
/*   65 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
/*      */   {
/*   71 */     int i = 0;
/*   72 */     int j = 0;
/*   73 */     int k = 0;
/*   74 */     int m = 0;
/*   75 */     int n = 0;
/*   76 */     int i1 = 0;
/*   77 */     int i2 = 0;
/*   78 */     int i3 = 0;
/*   79 */     int i4 = 0;
/*   80 */     int i5 = 0;
/*   81 */     int i6 = 0;
/*   82 */     int i7 = 0;
/*   83 */     int i8 = 0;
/*   84 */     int i9 = 0;
/*   85 */     int i10 = 0;
/*   86 */     int i11 = 0;
/*   87 */     int i12 = 0;
/*   88 */     int i13 = 0;
/*   89 */     int i14 = 0;
/*   90 */     float f1 = 0.0F;
/*   91 */     float f2 = 0.0F;
/*   92 */     float f3 = 0.0F;
/*   93 */     int i15 = 0;
/*   94 */     int i16 = 0;
/*   95 */     int i17 = 0;
/*   96 */     float f4 = 0.0F;
/*   97 */     float f5 = 0.0F;
/*   98 */     float f6 = 0.0F;
/*   99 */     boolean bool1 = false;
/*  100 */     boolean bool2 = false;
/*  101 */     float f7 = 0.0F;
/*  102 */     int i18 = 0;
/*  103 */     int i19 = 0;
/*  104 */     float f8 = 0.0F;
/*  105 */     int i20 = 0;
/*  106 */     int i21 = 0;
/*  107 */     float f9 = 0.0F;
/*  108 */     int i22 = 0;
/*  109 */     float f10 = 0.0F;
/*  110 */     float f11 = 0.0F;
/*  111 */     float f12 = 0.0F;
/*  112 */     float f13 = 0.0F;
/*  113 */     int i23 = 0;
/*  114 */     int i24 = 0;
/*  115 */     int i25 = 0;
/*  116 */     double d1 = 0.0D;
/*  117 */     double d2 = 0.0D;
/*  118 */     double d3 = 0.0D;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*  124 */       if (paramInt2 >= 5) {
/*      */         break label173;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  136 */       paramInt2 = paramInt3 * paramInt2;
/*  137 */       paramInt3 = 1;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label173:
/*      */       
/*      */ 
/*      */ 
/*  146 */       if (paramInt2 >= 9) {
/*      */         break label543;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  156 */       if (paramInt2 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*  160 */         paramFloat = 1.17549435E-38F;
/*  161 */         f1 = Float.MAX_VALUE;
/*  162 */         paramInt2 = 0;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  169 */         i = paramInt4 != 0 ? 1 : 0;
/*  170 */         f1 = 1.17549435E-38F;
/*  171 */         f2 = Float.MAX_VALUE;
/*  172 */         paramInt3 = 0;
/*  173 */         paramInt4 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  183 */           f3 = MainMemory.getF32(paramInt1 + (paramInt3 << 2));
/*  184 */           if ((i == 0) || (!MathUtils.f_oeq(f3, paramFloat)))
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
/*      */ 
/*      */ 
/*  197 */             f2 = MathUtils.f_olt(f3, f2) ? f3 : f2;
/*  198 */             f1 = MathUtils.f_ogt(f3, f1) ? f3 : f1;
/*  199 */             paramInt4 += 1;
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
/*      */ 
/*  211 */           paramInt3 += 1;
/*  212 */           if (paramInt3 == paramInt2) {
/*  213 */             paramFloat = f1;
/*  214 */             f1 = f2;
/*  215 */             paramInt2 = paramInt4; break;
/*      */           }
/*      */         }
/*      */       }
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
/*  232 */       if (paramInt6 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  242 */         MainMemory.setF32(paramInt6, f1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  248 */       if (paramInt7 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  258 */         MainMemory.setF32(paramInt7, paramFloat);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  264 */       if (paramInt5 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  274 */         MainMemory.setI32(paramInt5, paramInt2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  280 */       if (paramInt8 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  290 */         MainMemory.setF64(paramInt8, 0.0D);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  296 */       if (paramInt9 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  306 */         MainMemory.setF64(paramInt9, 0.0D);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*  312 */       if (paramInt10 != 0) {
/*      */         break label527;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       break label4595;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */       label527:
/*      */       
/*      */ 
/*      */ 
/*  328 */       MainMemory.setF64(paramInt10, 0.0D);
/*      */       
/*      */ 
/*      */       break label4595;
/*      */       
/*      */       label543:
/*      */       
/*  335 */       i = (paramInt6 != 0) || (paramInt7 != 0) ? 1 : 0;
/*  336 */       j = calloc.call(paramInt2, 4);
/*  337 */       k = j;
/*  338 */       if (j != 0) {
/*      */         break label606;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  348 */       MainMemory.setI32(paramInt11, 113);
/*      */       
/*      */ 
/*      */       break label4595;
/*      */       
/*      */       label606:
/*      */       
/*  355 */       m = calloc.call(paramInt2, 4);
/*  356 */       n = m;
/*  357 */       if (m != 0) {
/*      */         break label657;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  367 */       free.call(j);
/*  368 */       MainMemory.setI32(paramInt11, 113);
/*      */       
/*      */ 
/*      */       break label4595;
/*      */       
/*      */       label657:
/*      */       
/*  375 */       i1 = calloc.call(paramInt2, 4);
/*  376 */       i2 = i1;
/*  377 */       if (i1 != 0) {
/*      */         break label713;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  387 */       free.call(j);
/*  388 */       free.call(m);
/*  389 */       MainMemory.setI32(paramInt11, 113);
/*      */       
/*      */ 
/*      */       break label4595;
/*      */       
/*      */       label713:
/*      */       
/*  396 */       i3 = calloc.call(paramInt3, 8);
/*  397 */       i4 = i3;
/*  398 */       if (i3 != 0) {
/*      */         break label775;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  408 */       free.call(j);
/*  409 */       free.call(m);
/*  410 */       free.call(i1);
/*  411 */       MainMemory.setI32(paramInt11, 113);
/*      */       
/*      */ 
/*      */       break label4595;
/*      */       
/*      */       label775:
/*      */       
/*  418 */       i5 = calloc.call(paramInt3, 8);
/*  419 */       i6 = i5;
/*  420 */       if (i5 != 0) {
/*      */         break label842;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  430 */       free.call(j);
/*  431 */       free.call(m);
/*  432 */       free.call(i1);
/*  433 */       free.call(i3);
/*  434 */       MainMemory.setI32(paramInt11, 113);
/*      */       
/*      */ 
/*      */       break label4595;
/*      */       
/*      */       label842:
/*      */       
/*  441 */       i7 = calloc.call(paramInt3, 8);
/*  442 */       i8 = i7;
/*  443 */       if (i7 != 0) {
/*      */         break label914;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  453 */       free.call(j);
/*  454 */       free.call(m);
/*  455 */       free.call(i1);
/*  456 */       free.call(i3);
/*  457 */       free.call(i5);
/*  458 */       MainMemory.setI32(paramInt11, 113);
/*      */       
/*      */ 
/*      */       break label4595;
/*      */       
/*      */       label914:
/*      */       
/*  465 */       if (paramInt3 <= 0)
/*      */       {
/*      */ 
/*      */ 
/*  469 */         d1 = 0.0D;
/*  470 */         d2 = 0.0D;
/*  471 */         paramFloat = 1.17549435E-38F;
/*  472 */         f1 = Float.MAX_VALUE;
/*  473 */         paramInt2 = 0;
/*  474 */         d3 = 0.0D;
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*  481 */         i9 = paramInt4 == 0 ? 1 : 0;
/*  482 */         f2 = 1.17549435E-38F;
/*  483 */         f3 = Float.MAX_VALUE;
/*  484 */         paramInt4 = 0;
/*  485 */         i10 = 0;
/*  486 */         i11 = 0;
/*  487 */         i12 = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  499 */           i13 = paramInt2 * paramInt4;
/*  500 */           i14 = i13 + 1;
/*  501 */           if (i9 != 0) {
/*  502 */             i19 = 0;
/*      */             break label1098;
/*      */           } else {
/*  505 */             i18 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  514 */             if (i18 >= paramInt2)
/*      */             {
/*      */ 
/*      */ 
/*  518 */               i19 = i18;
/*  519 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  525 */             if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i13 + i18 << 2)), paramFloat))
/*      */             {
/*      */ 
/*      */ 
/*  529 */               i19 = i18;
/*  530 */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  536 */             i18 += 1;
/*      */           }
/*      */           
/*      */ 
/*      */           label1098:
/*      */           
/*      */ 
/*  543 */           if (i19 == paramInt2)
/*      */           {
/*      */ 
/*      */ 
/*  547 */             f1 = f3;
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
/*  558 */             f1 = MainMemory.getF32(paramInt1 + (i19 + i13 << 2));
/*  559 */             if (i == 0)
/*      */             {
/*      */ 
/*      */ 
/*  563 */               f11 = f3;
/*  564 */               f3 = f2;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  571 */               f3 = MathUtils.f_olt(f1, f3) ? f1 : f3;
/*  572 */               if (!MathUtils.f_ogt(f1, f2))
/*      */               {
/*      */ 
/*      */ 
/*  576 */                 f11 = f3;
/*  577 */                 f3 = f2;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  584 */                 f11 = f3;
/*  585 */                 f3 = f1;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  593 */             i18 = i19 + 1;
/*  594 */             if (i9 != 0) {
/*  595 */               i19 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  605 */               i19 += i14;
/*  606 */               i20 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  613 */                 i21 = i18 + i20;
/*  614 */                 if (i21 >= paramInt2)
/*      */                 {
/*      */ 
/*      */ 
/*  618 */                   i19 = i21;
/*  619 */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  625 */                 if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i19 + i20 << 2)), paramFloat))
/*      */                 {
/*      */ 
/*      */ 
/*  629 */                   i19 = i21;
/*  630 */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  636 */                 i20 += 1;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  643 */             if (i19 == paramInt2)
/*      */             {
/*      */ 
/*      */ 
/*  647 */               f1 = f11;
/*  648 */               f2 = f3;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  658 */               f2 = MainMemory.getF32(paramInt1 + (i19 + i13 << 2));
/*  659 */               if (i == 0)
/*      */               {
/*      */ 
/*      */ 
/*  663 */                 f12 = f11;
/*  664 */                 f11 = f3;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*  671 */                 f11 = MathUtils.f_olt(f2, f11) ? f2 : f11;
/*  672 */                 if (!MathUtils.f_ogt(f2, f3))
/*      */                 {
/*      */ 
/*      */ 
/*  676 */                   f12 = f11;
/*  677 */                   f11 = f3;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  684 */                   f12 = f11;
/*  685 */                   f11 = f2;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  693 */               i18 = i19 + 1;
/*  694 */               if (i9 != 0) {
/*  695 */                 i19 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  705 */                 i19 += i14;
/*  706 */                 i20 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  713 */                   i21 = i18 + i20;
/*  714 */                   if (i21 >= paramInt2)
/*      */                   {
/*      */ 
/*      */ 
/*  718 */                     i19 = i21;
/*  719 */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  725 */                   if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i19 + i20 << 2)), paramFloat))
/*      */                   {
/*      */ 
/*      */ 
/*  729 */                     i19 = i21;
/*  730 */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  736 */                   i20 += 1;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  743 */               if (i19 == paramInt2)
/*      */               {
/*      */ 
/*      */ 
/*  747 */                 f1 = f12;
/*  748 */                 f2 = f11;
/*      */ 
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*  758 */                 f3 = MainMemory.getF32(paramInt1 + (i19 + i13 << 2));
/*  759 */                 if (i == 0)
/*      */                 {
/*      */ 
/*      */ 
/*  763 */                   f13 = f12;
/*  764 */                   f12 = f11;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*  771 */                   f12 = MathUtils.f_olt(f3, f12) ? f3 : f12;
/*  772 */                   if (!MathUtils.f_ogt(f3, f11))
/*      */                   {
/*      */ 
/*      */ 
/*  776 */                     f13 = f12;
/*  777 */                     f12 = f11;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*  784 */                     f13 = f12;
/*  785 */                     f12 = f3;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  793 */                 i18 = i19 + 1;
/*  794 */                 if (i9 != 0) {
/*  795 */                   i19 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  805 */                   i19 += i14;
/*  806 */                   i20 = 0;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */                   for (;;)
/*      */                   {
/*  813 */                     i21 = i18 + i20;
/*  814 */                     if (i21 >= paramInt2)
/*      */                     {
/*      */ 
/*      */ 
/*  818 */                       i19 = i21;
/*  819 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  825 */                     if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i19 + i20 << 2)), paramFloat))
/*      */                     {
/*      */ 
/*      */ 
/*  829 */                       i19 = i21;
/*  830 */                       break;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*  836 */                     i20 += 1;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  843 */                 if (i19 == paramInt2)
/*      */                 {
/*      */ 
/*      */ 
/*  847 */                   f1 = f13;
/*  848 */                   f2 = f12;
/*      */ 
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*  858 */                   f11 = MainMemory.getF32(paramInt1 + (i19 + i13 << 2));
/*  859 */                   if (i == 0)
/*      */                   {
/*      */ 
/*      */ 
/*  863 */                     f10 = f13;
/*  864 */                     f13 = f12;
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*  871 */                     f13 = MathUtils.f_olt(f11, f13) ? f11 : f13;
/*  872 */                     if (!MathUtils.f_ogt(f11, f12))
/*      */                     {
/*      */ 
/*      */ 
/*  876 */                       f10 = f13;
/*  877 */                       f13 = f12;
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*  884 */                       f10 = f13;
/*  885 */                       f13 = f11;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  893 */                   i18 = i19 + 1;
/*  894 */                   if (i9 != 0) {
/*  895 */                     i19 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  905 */                     i19 += i14;
/*  906 */                     i20 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     for (;;)
/*      */                     {
/*  913 */                       i21 = i18 + i20;
/*  914 */                       if (i21 >= paramInt2)
/*      */                       {
/*      */ 
/*      */ 
/*  918 */                         i19 = i21;
/*  919 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  925 */                       if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i19 + i20 << 2)), paramFloat))
/*      */                       {
/*      */ 
/*      */ 
/*  929 */                         i19 = i21;
/*  930 */                         break;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*  936 */                       i20 += 1;
/*      */                     }
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*  943 */                   if (i19 == paramInt2)
/*      */                   {
/*      */ 
/*      */ 
/*  947 */                     f1 = f10;
/*  948 */                     f2 = f13;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*  958 */                     f12 = MainMemory.getF32(paramInt1 + (i19 + i13 << 2));
/*  959 */                     if (i == 0)
/*      */                     {
/*      */ 
/*      */ 
/*  963 */                       f9 = f10;
/*  964 */                       f10 = f13;
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*  971 */                       f10 = MathUtils.f_olt(f12, f10) ? f12 : f10;
/*  972 */                       if (!MathUtils.f_ogt(f12, f13))
/*      */                       {
/*      */ 
/*      */ 
/*  976 */                         f9 = f10;
/*  977 */                         f10 = f13;
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*  984 */                         f9 = f10;
/*  985 */                         f10 = f12;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  993 */                     i18 = i19 + 1;
/*  994 */                     if (i9 != 0) {
/*  995 */                       i19 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1005 */                       i19 += i14;
/* 1006 */                       i20 = 0;
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       for (;;)
/*      */                       {
/* 1013 */                         i21 = i18 + i20;
/* 1014 */                         if (i21 >= paramInt2)
/*      */                         {
/*      */ 
/*      */ 
/* 1018 */                           i19 = i21;
/* 1019 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1025 */                         if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i19 + i20 << 2)), paramFloat))
/*      */                         {
/*      */ 
/*      */ 
/* 1029 */                           i19 = i21;
/* 1030 */                           break;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1036 */                         i20 += 1;
/*      */                       }
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/* 1043 */                     if (i19 == paramInt2)
/*      */                     {
/*      */ 
/*      */ 
/* 1047 */                       f1 = f9;
/* 1048 */                       f2 = f10;
/*      */ 
/*      */ 
/*      */ 
/*      */                     }
/*      */                     else
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/* 1058 */                       f13 = MainMemory.getF32(paramInt1 + (i19 + i13 << 2));
/* 1059 */                       if (i == 0) {
/*      */                         break label2485;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1071 */                       f9 = MathUtils.f_olt(f13, f9) ? f13 : f9;
/* 1072 */                       if (!MathUtils.f_ogt(f13, f10)) {
/*      */                         break label2485;
/*      */                       }
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
/* 1085 */                       f10 = f13;
/*      */                       
/*      */ 
/*      */ 
/*      */                       label2485:
/*      */                       
/*      */ 
/*      */ 
/* 1093 */                       i18 = i19 + 1;
/* 1094 */                       if (i9 != 0) {
/* 1095 */                         i19 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1105 */                         i19 += i14;
/* 1106 */                         i20 = 0;
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */                         for (;;)
/*      */                         {
/* 1113 */                           i21 = i18 + i20;
/* 1114 */                           if (i21 >= paramInt2)
/*      */                           {
/*      */ 
/*      */ 
/* 1118 */                             i19 = i21;
/* 1119 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/* 1125 */                           if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i19 + i20 << 2)), paramFloat))
/*      */                           {
/*      */ 
/*      */ 
/* 1129 */                             i19 = i21;
/* 1130 */                             break;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/* 1136 */                           i20 += 1;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/* 1143 */                       if (i19 == paramInt2)
/*      */                       {
/*      */ 
/*      */ 
/* 1147 */                         f1 = f9;
/* 1148 */                         f2 = f10;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1158 */                         f6 = MainMemory.getF32(paramInt1 + (i19 + i13 << 2));
/* 1159 */                         if (i == 0)
/*      */                         {
/*      */ 
/*      */ 
/* 1163 */                           f4 = f9;
/* 1164 */                           f9 = f10;
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/* 1171 */                           f9 = MathUtils.f_olt(f6, f9) ? f6 : f9;
/* 1172 */                           if (!MathUtils.f_ogt(f6, f10))
/*      */                           {
/*      */ 
/*      */ 
/* 1176 */                             f4 = f9;
/* 1177 */                             f9 = f10;
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/* 1184 */                             f4 = f9;
/* 1185 */                             f9 = f6;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1193 */                         i18 = i19 + 1;
/* 1194 */                         if (i9 != 0) {
/* 1195 */                           i20 = i18;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1205 */                           i19 += i14;
/* 1206 */                           i20 = 0;
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 1213 */                             i21 = i18 + i20;
/* 1214 */                             if (i21 >= paramInt2)
/*      */                             {
/*      */ 
/*      */ 
/* 1218 */                               i20 = i21;
/* 1219 */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/* 1225 */                             if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i19 + i20 << 2)), paramFloat))
/*      */                             {
/*      */ 
/*      */ 
/* 1229 */                               i20 = i21;
/* 1230 */                               break;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/* 1236 */                             i20 += 1;
/*      */                           }
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1243 */                         if (i20 == paramInt2)
/*      */                         {
/*      */ 
/*      */ 
/* 1247 */                           f1 = f4;
/* 1248 */                           f2 = f9;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1258 */                           f5 = MainMemory.getF32(paramInt1 + (i20 + i13 << 2));
/* 1259 */                           if (i == 0)
/*      */                           {
/*      */ 
/*      */ 
/* 1263 */                             i18 = 0;
/*      */                             
/*      */ 
/* 1266 */                             f10 = f3;
/* 1267 */                             i22 = 0;
/* 1268 */                             i19 = 0;
/* 1269 */                             i17 = i20;
/* 1270 */                             f3 = f11;
/* 1271 */                             f11 = f12;
/* 1272 */                             f12 = f13;
/* 1273 */                             f13 = f6;
/* 1274 */                             f8 = f5;
/*      */                             
/* 1276 */                             f6 = f9;
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/* 1283 */                             f4 = MathUtils.f_olt(f5, f4) ? f5 : f4;
/* 1284 */                             if (!MathUtils.f_ogt(f5, f9))
/*      */                             {
/*      */ 
/*      */ 
/* 1288 */                               i18 = 0;
/*      */                               
/*      */ 
/* 1291 */                               f10 = f3;
/* 1292 */                               i22 = 0;
/* 1293 */                               i19 = 0;
/* 1294 */                               i17 = i20;
/* 1295 */                               f3 = f11;
/* 1296 */                               f11 = f12;
/* 1297 */                               f12 = f13;
/* 1298 */                               f13 = f6;
/* 1299 */                               f8 = f5;
/*      */                               
/* 1301 */                               f6 = f9;
/*      */ 
/*      */ 
/*      */                             }
/*      */                             else
/*      */                             {
/*      */ 
/* 1308 */                               i18 = 0;
/*      */                               
/*      */ 
/* 1311 */                               f10 = f3;
/* 1312 */                               i22 = 0;
/* 1313 */                               i19 = 0;
/* 1314 */                               i17 = i20;
/* 1315 */                               f3 = f11;
/* 1316 */                               f11 = f12;
/* 1317 */                               f12 = f13;
/* 1318 */                               f13 = f6;
/* 1319 */                               f8 = f5;
/*      */                               
/* 1321 */                               f6 = f5;
/*      */                             }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                           for (;;)
/*      */                           {
/* 1341 */                             i20 = i19 << 2;
/* 1342 */                             i21 = 0;
/* 1343 */                             f9 = f1;
/* 1344 */                             f1 = f2;
/* 1345 */                             f2 = f10;
/*      */                             
/*      */ 
/* 1348 */                             f10 = f3;
/* 1349 */                             f3 = f11;
/* 1350 */                             f11 = f12;
/* 1351 */                             f12 = f13;
/* 1352 */                             f13 = f8;
/* 1353 */                             f5 = f4;
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
/*      */ 
/*      */ 
/*      */                             for (;;)
/*      */                             {
/* 1373 */                               i25 = i20 + (i21 << 2);
/* 1374 */                               i23 = i1 + i25;
/* 1375 */                               i24 = m + i25;
/* 1376 */                               i25 = i17 + 1;
/* 1377 */                               if (i25 >= paramInt2) {
/*      */                                 break label3709;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1387 */                               if (i9 != 0) {
/* 1388 */                                 i17 = i25;
/*      */ 
/*      */ 
/*      */ 
/*      */                               }
/*      */                               else
/*      */                               {
/*      */ 
/*      */ 
/*      */ 
/* 1398 */                                 i17 = i14 + i17;
/* 1399 */                                 i15 = 0;
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */                                 for (;;)
/*      */                                 {
/* 1406 */                                   i16 = i25 + i15;
/* 1407 */                                   if (i16 >= paramInt2)
/*      */                                   {
/*      */ 
/*      */ 
/* 1411 */                                     i17 = i16;
/* 1412 */                                     break;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/* 1418 */                                   if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i17 + i15 << 2)), paramFloat))
/*      */                                   {
/*      */ 
/*      */ 
/* 1422 */                                     i17 = i16;
/* 1423 */                                     break;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/* 1429 */                                   i15 += 1;
/*      */                                 }
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/* 1436 */                               if (i17 == paramInt2) {
/*      */                                 break label3709;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1446 */                               f4 = MainMemory.getF32(paramInt1 + (i13 + i17 << 2));
/* 1447 */                               if (i == 0) {
/*      */                                 break label3416;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1459 */                               f5 = MathUtils.f_olt(f4, f5) ? f4 : f5;
/* 1460 */                               if (!MathUtils.f_ogt(f4, f6)) {
/*      */                                 break label3416;
/*      */                               }
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
/* 1473 */                               f6 = f4;
/*      */                               
/*      */ 
/*      */ 
/*      */                               label3416:
/*      */                               
/*      */ 
/*      */ 
/* 1481 */                               bool1 = MathUtils.f_une(f3, f11);
/* 1482 */                               bool2 = MathUtils.f_une(f11, f12);
/* 1483 */                               if ((!bool1) && (!bool2)) {
/*      */                                 break label3494;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1494 */                               f8 = f3 - f12;
/* 1495 */                               MainMemory.setF32(k + (i22 << 2), SystemLibrary.fabsf(f8));
/* 1496 */                               i22 += 1;
/*      */                               
/*      */ 
/*      */ 
/*      */                               label3494:
/*      */                               
/*      */ 
/*      */ 
/* 1504 */                               if ((!MathUtils.f_une(f2, f10)) && (!MathUtils.f_une(f10, f3)) && (!bool1) && (!bool2)) {
/*      */                                 break;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1514 */                               f8 = f3 * 2.0F;
/* 1515 */                               f8 -= f2;
/* 1516 */                               f8 -= f12;
/* 1517 */                               MainMemory.setF32(i24, SystemLibrary.fabsf(f8));
/* 1518 */                               f8 = f3 * 6.0F;
/* 1519 */                               f7 = f2 * -4.0F;
/* 1520 */                               f8 += f7;
/* 1521 */                               f7 = f12 * -4.0F;
/* 1522 */                               f8 += f7;
/* 1523 */                               f9 = f8 + f9;
/* 1524 */                               f9 += f4;
/* 1525 */                               MainMemory.setF32(i23, SystemLibrary.fabsf(f9));
/* 1526 */                               i21 += 1;
/*      */                               
/* 1528 */                               f9 = f1;
/* 1529 */                               f1 = f2;
/* 1530 */                               f2 = f10;
/*      */                               
/*      */ 
/* 1533 */                               f10 = f3;
/* 1534 */                               f3 = f11;
/* 1535 */                               f11 = f12;
/* 1536 */                               f12 = f13;
/* 1537 */                               f13 = f4;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1544 */                             i19 += i21;
/* 1545 */                             i18 += 1;
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
/* 1557 */                             f8 = f4;
/* 1558 */                             f4 = f5;
/*      */                           }
/*      */                           
/*      */ 
/*      */                           label3709:
/*      */                           
/* 1564 */                           i13 = i19 + i21;
/* 1565 */                           i12 = i12 + i18 + 8 + i13;
/* 1566 */                           switch (i13)
/*      */                           {
/*      */ 
/*      */                           case 0: 
/* 1570 */                             f1 = f5;
/* 1571 */                             f2 = f6;
/*      */                             
/*      */ 
/*      */                             break label4008;
/*      */                             
/*      */                             break;
/*      */                           case 1: 
/*      */                             break;
/*      */                           }
/*      */                           
/*      */                           
/* 1582 */                           if (i22 != 1) {
/*      */                             break label3838;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1593 */                           d1 = MainMemory.getF32(k);
/* 1594 */                           MainMemory.setF64(i4 + (i11 << 3), d1);
/* 1595 */                           i11 += 1;
/*      */                           
/*      */ 
/*      */ 
/*      */                           label3838:
/*      */                           
/*      */ 
/*      */ 
/* 1603 */                           d1 = MainMemory.getF32(n);
/* 1604 */                           MainMemory.setF64(i6 + (i10 << 3), d1);
/* 1605 */                           d1 = MainMemory.getF32(i2);
/* 1606 */                           MainMemory.setF64(i8 + (i10 << 3), d1);
/*      */                           
/*      */ 
/*      */                           break label3989;
/*      */                           
/*      */ 
/* 1612 */                           if (i22 <= 1) {
/*      */                             break label3940;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1623 */                           d1 = F410425.call(k, i13);
/* 1624 */                           MainMemory.setF64(i4 + (i11 << 3), d1);
/* 1625 */                           i11 += 1;
/*      */                           
/*      */ 
/*      */ 
/*      */                           label3940:
/*      */                           
/*      */ 
/*      */ 
/* 1633 */                           d1 = F410425.call(n, i13);
/* 1634 */                           MainMemory.setF64(i6 + (i10 << 3), d1);
/* 1635 */                           d1 = F410425.call(i2, i13);
/* 1636 */                           MainMemory.setF64(i8 + (i10 << 3), d1);
/*      */                           
/*      */ 
/*      */ 
/*      */                           label3989:
/*      */                           
/*      */ 
/*      */ 
/* 1644 */                           i10 += 1;
/*      */                           
/*      */ 
/*      */ 
/* 1648 */                           f1 = f5;
/* 1649 */                           f2 = f6;
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                   }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */           
/*      */           label4008:
/* 1660 */           paramInt4 += 1;
/* 1661 */           if (paramInt4 == paramInt3) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/* 1666 */           f3 = f1;
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
/* 1677 */         switch (i10) {
/* 1678 */         case 0:  d2 = 0.0D;
/* 1679 */           d1 = 0.0D;
/*      */           
/*      */ 
/*      */           break label4229;
/*      */           
/*      */           break;
/*      */         case 1: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 1690 */         d1 = MainMemory.getF64(i6);
/* 1691 */         d3 = MainMemory.getF64(i8);
/* 1692 */         d2 = d1;
/* 1693 */         d1 = d3;
/*      */         
/*      */ 
/*      */         break label4229;
/*      */         
/* 1698 */         qsort.call(i5, i10, 8, 3629);
/* 1699 */         qsort.call(i7, i10, 8, 3629);
/* 1700 */         paramInt2 = (i10 + -1) / 2;
/* 1701 */         paramInt3 = i10 / 2;
/* 1702 */         d1 = MainMemory.getF64(i6 + (paramInt2 << 3)) + MainMemory.getF64(i6 + (paramInt3 << 3));
/* 1703 */         d1 *= 0.5D;
/* 1704 */         d2 = MainMemory.getF64(i8 + (paramInt2 << 3)) + MainMemory.getF64(i8 + (paramInt3 << 3));
/* 1705 */         d3 = d2 * 0.5D;
/* 1706 */         d2 = d1;
/* 1707 */         d1 = d3;
/*      */         
/*      */ 
/*      */ 
/*      */         label4229:
/*      */         
/*      */ 
/*      */ 
/* 1715 */         switch (i11)
/*      */         {
/*      */         case 0: 
/* 1718 */           paramFloat = f2;
/*      */           
/* 1720 */           paramInt2 = i12;
/* 1721 */           d3 = 0.0D;
/*      */           
/*      */ 
/*      */           break label4375;
/*      */           
/*      */           break;
/*      */         case 1: 
/*      */           break;
/*      */         }
/*      */         
/*      */         
/* 1732 */         d3 = MainMemory.getF64(i4);
/*      */         
/*      */ 
/* 1735 */         paramFloat = f2;
/*      */         
/* 1737 */         paramInt2 = i12;
/*      */         
/*      */ 
/*      */         break label4375;
/*      */         
/*      */ 
/* 1743 */         qsort.call(i3, i11, 8, 3629);
/* 1744 */         d3 = MainMemory.getF64(i4 + ((i11 + -1) / 2 << 3)) + MainMemory.getF64(i4 + (i11 / 2 << 3));
/* 1745 */         d3 *= 0.5D;
/*      */         
/*      */ 
/* 1748 */         paramFloat = f2;
/*      */         
/* 1750 */         paramInt2 = i12;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       label4375:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1763 */       if (paramInt5 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1773 */         MainMemory.setI32(paramInt5, paramInt2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1779 */       if (paramInt6 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1789 */         MainMemory.setF32(paramInt6, f1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1795 */       if (paramInt7 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1805 */         MainMemory.setF32(paramInt7, paramFloat);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1811 */       if (paramInt8 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1821 */         d3 *= 1.0483579D;
/* 1822 */         MainMemory.setF64(paramInt8, d3);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1828 */       if (paramInt9 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1838 */         d2 *= 0.6052697D;
/* 1839 */         MainMemory.setF64(paramInt9, d2);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1845 */       if (paramInt10 != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1855 */         d1 *= 0.1772048D;
/* 1856 */         MainMemory.setF64(paramInt10, d1);
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/* 1862 */       free.call(i7);
/* 1863 */       free.call(i5);
/* 1864 */       free.call(i3);
/* 1865 */       free.call(i1);
/* 1866 */       free.call(m);
/* 1867 */       free.call(j);
/*      */       
/*      */ 
/*      */       label4595:
/*      */       
/*      */ 
/* 1873 */       return;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F411147.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */