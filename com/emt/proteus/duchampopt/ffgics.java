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
/*      */ public final class ffgics
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3603;
/*   15 */   public static final Function _instance = new ffgics();
/*   16 */   public final Function resolve() { return _instance; }
/*      */   
/*   18 */   public ffgics() { super("ffgics", 10, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
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
/*   40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   41 */     paramInt4 += 2;
/*   42 */     paramInt3--;
/*   43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   44 */     paramInt4 += 2;
/*   45 */     paramInt3--;
/*   46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   47 */     paramInt4 += 2;
/*   48 */     paramInt3--;
/*   49 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   50 */     paramInt4 += 2;
/*   51 */     paramInt3--;
/*   52 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   53 */     paramInt4 += 2;
/*   54 */     paramInt3--;
/*   55 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   56 */     paramInt4 += 2;
/*   57 */     paramInt3--;
/*   58 */     call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*   59 */     return paramInt4;
/*      */   }
/*      */   
/*      */ 
/*      */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   65 */     int i = 0;
/*   66 */     int j = 0;
/*   67 */     int k = 0;
/*   68 */     int m = 0;
/*   69 */     int n = 0;
/*   70 */     int i1 = 0;
/*   71 */     int i2 = 0;
/*   72 */     int i3 = 0;
/*   73 */     int i4 = 0;
/*   74 */     int i5 = 0;
/*   75 */     int i6 = 0;
/*   76 */     int i7 = 0;
/*   77 */     int i8 = 0;
/*   78 */     int i9 = 0;
/*   79 */     double d1 = 0.0D;
/*   80 */     double d2 = 0.0D;
/*   81 */     double d3 = 0.0D;
/*   82 */     double d4 = 0.0D;
/*   83 */     double d5 = 0.0D;
/*      */     
/*      */ 
/*   86 */     int i10 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   90 */       i = MainMemory.alloc(81);
/*   91 */       j = MainMemory.alloc(71);
/*   92 */       k = MainMemory.alloc(4);
/*   93 */       m = MainMemory.alloc(71);
/*   94 */       n = MainMemory.alloc(8);
/*   95 */       i1 = MainMemory.alloc(8);
/*   96 */       i2 = MainMemory.alloc(8);
/*   97 */       i3 = MainMemory.alloc(8);
/*   98 */       i4 = MainMemory.alloc(8);
/*   99 */       i5 = MainMemory.alloc(8);
/*  100 */       i6 = MainMemory.alloc(8);
/*  101 */       i7 = MainMemory.alloc(8);
/*  102 */       MainMemory.setI32(k, 0);
/*  103 */       MainMemory.setF64(n, 0.0D);
/*  104 */       MainMemory.setF64(i1, 0.0D);
/*  105 */       MainMemory.setF64(i2, 0.0D);
/*  106 */       MainMemory.setF64(i3, 0.0D);
/*  107 */       MainMemory.setF64(i4, 1.0D);
/*  108 */       MainMemory.setF64(i5, 0.0D);
/*  109 */       MainMemory.setF64(i6, 1.0D);
/*  110 */       MainMemory.setF64(i7, 0.0D);
/*  111 */       if (MainMemory.getI32(paramInt10) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  121 */         MainMemory.setI32(k, 0);
/*  122 */         MainMemory.setI8(j, (byte)0);
/*  123 */         if (ffgcrd.call(paramInt1, 32576, i, k) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  133 */           ffpsvc.call(i, j, 0, k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  139 */         ffc2d.call(j, paramInt2, k);
/*  140 */         if (MainMemory.getI32(k) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  150 */           MainMemory.setF64(paramInt2, 0.0D);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  156 */         MainMemory.setI32(k, 0);
/*  157 */         MainMemory.setI8(j, (byte)0);
/*  158 */         if (ffgcrd.call(paramInt1, 32608, i, k) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  168 */           ffpsvc.call(i, j, 0, k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  174 */         ffc2d.call(j, paramInt3, k);
/*  175 */         if (MainMemory.getI32(k) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  185 */           MainMemory.setF64(paramInt3, 0.0D);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  191 */         MainMemory.setI32(k, 0);
/*  192 */         MainMemory.setI8(j, (byte)0);
/*  193 */         if (ffgcrd.call(paramInt1, 32512, i, k) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  203 */           ffpsvc.call(i, j, 0, k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  209 */         ffc2d.call(j, paramInt4, k);
/*  210 */         if (MainMemory.getI32(k) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  220 */           MainMemory.setF64(paramInt4, 0.0D);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  226 */         MainMemory.setI32(k, 0);
/*  227 */         MainMemory.setI8(j, (byte)0);
/*  228 */         if (ffgcrd.call(paramInt1, 32544, i, k) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  238 */           ffpsvc.call(i, j, 0, k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  244 */         ffc2d.call(j, paramInt5, k);
/*  245 */         if (MainMemory.getI32(k) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  255 */           MainMemory.setF64(paramInt5, 0.0D);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  261 */         MainMemory.setI32(k, 0);
/*  262 */         MainMemory.setI8(j, (byte)0);
/*  263 */         if (ffgcrd.call(paramInt1, 32640, i, k) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  273 */           ffpsvc.call(i, j, 0, k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  279 */         ffc2d.call(j, paramInt6, k);
/*  280 */         i8 = MainMemory.getI32(k);
/*  281 */         if (i8 != 0) {
/*      */           break label1547;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  291 */         if (i8 <= 0)
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
/*  302 */           MainMemory.setI8(j, (byte)0);
/*  303 */           if (ffgcrd.call(paramInt1, 32672, i, k) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  313 */             ffpsvc.call(i, j, 0, k);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  319 */           ffc2d.call(j, paramInt7, k);
/*  320 */           i8 = MainMemory.getI32(k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  328 */         if (i8 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  338 */           MainMemory.setF64(paramInt7, 1.0D);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  344 */         MainMemory.setI32(k, 0);
/*  345 */         MainMemory.setI8(j, (byte)0);
/*  346 */         if (ffgcrd.call(paramInt1, 32704, i, k) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  356 */           ffpsvc.call(i, j, 0, k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  362 */         ffc2d.call(j, paramInt8, k);
/*  363 */         if (MainMemory.getI32(k) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  373 */           MainMemory.setF64(paramInt8, 0.0D);
/*  374 */           MainMemory.setI32(k, 0);
/*  375 */           MainMemory.setI8(j, (byte)0);
/*  376 */           if (ffgcrd.call(paramInt1, 25792, i, k) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  386 */             ffpsvc.call(i, j, 0, k);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  392 */           ffc2d.call(j, i4, k);
/*  393 */           i9 = MainMemory.getI32(k);
/*  394 */           if (i9 != 0) {
/*      */             break label965;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  404 */           if (i9 > 0) {
/*  405 */             i8 = 1;
/*      */             break label1046;
/*      */           }
/*      */           else {
/*  409 */             i8 = 1;
/*      */             
/*      */             break label979;
/*      */           }
/*      */           
/*      */           label965:
/*      */           
/*  416 */           MainMemory.setI32(k, 0);
/*  417 */           i8 = 0;
/*      */           
/*      */ 
/*      */ 
/*      */           label979:
/*      */           
/*      */ 
/*  424 */           MainMemory.setI8(j, (byte)0);
/*  425 */           if (ffgcrd.call(paramInt1, 25920, i, k) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  435 */             ffpsvc.call(i, j, 0, k);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  441 */           ffc2d.call(j, i5, k);
/*  442 */           i9 = MainMemory.getI32(k);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1046:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  452 */           if (i9 != 0) {
/*      */             break label1093;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  462 */           if (i9 > 0) {
/*  463 */             i8 = 1;
/*      */             break label1171;
/*      */           }
/*      */           else {
/*  467 */             i8 = 1;
/*      */             
/*      */             break label1104;
/*      */           }
/*      */           
/*      */           label1093:
/*      */           
/*  474 */           MainMemory.setI32(k, 0);
/*      */           
/*      */ 
/*      */ 
/*      */           label1104:
/*      */           
/*      */ 
/*      */ 
/*  482 */           MainMemory.setI8(j, (byte)0);
/*  483 */           if (ffgcrd.call(paramInt1, 25856, i, k) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  493 */             ffpsvc.call(i, j, 0, k);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  499 */           ffc2d.call(j, i7, k);
/*  500 */           i9 = MainMemory.getI32(k);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1171:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  510 */           if (i9 != 0) {
/*      */             break label1218;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  520 */           if (i9 > 0) {
/*  521 */             i8 = 1;
/*      */             break label1296;
/*      */           }
/*      */           else {
/*  525 */             i8 = 1;
/*      */             
/*      */             break label1229;
/*      */           }
/*      */           
/*      */           label1218:
/*      */           
/*  532 */           MainMemory.setI32(k, 0);
/*      */           
/*      */ 
/*      */ 
/*      */           label1229:
/*      */           
/*      */ 
/*      */ 
/*  540 */           MainMemory.setI8(j, (byte)0);
/*  541 */           if (ffgcrd.call(paramInt1, 25984, i, k) <= 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  551 */             ffpsvc.call(i, j, 0, k);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  557 */           ffc2d.call(j, i6, k);
/*  558 */           i9 = MainMemory.getI32(k);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label1296:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  568 */           if (i9 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  578 */             MainMemory.setI32(k, 0);
/*  579 */             if (i8 == 0) {}
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  589 */             d1 = SystemLibrary.atan2(MainMemory.getF64(i5), MainMemory.getF64(i4));
/*  590 */             d3 = -0.0D - MainMemory.getF64(i7);
/*  591 */             d2 = SystemLibrary.atan2(d3, MainMemory.getF64(i6));
/*  592 */             d3 = MathUtils.f_olt(d1, d2) ? d1 : d2;
/*  593 */             d1 = MathUtils.f_ogt(d1, d2) ? d1 : d2;
/*  594 */             d2 = d1 - d3;
/*  595 */             if (!MathUtils.f_ogt(d2, 1.5707963267948966D)) {
/*      */               break label1452;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  606 */             d3 += 3.141592653589793D;
/*      */             
/*      */ 
/*      */ 
/*      */             label1452:
/*      */             
/*      */ 
/*      */ 
/*  614 */             d2 = d3 - d1;
/*  615 */             if (!MathUtils.f_ogt(SystemLibrary.fabs(d2), 2.0E-4D)) {
/*      */               break label1499;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  625 */             MainMemory.setI32(paramInt10, 506);
/*      */             
/*      */ 
/*      */             label1499:
/*      */             
/*      */ 
/*  631 */             d1 = d3 + d1;
/*  632 */             d1 *= 0.5D;
/*  633 */             d1 *= 180.0D;
/*  634 */             d1 /= 3.141592653589793D;
/*  635 */             MainMemory.setF64(paramInt8, d1);
/*      */             
/*      */             break label2420;
/*      */             
/*      */             label1547:
/*  640 */             MainMemory.setI32(k, 0);
/*  641 */             MainMemory.setI8(j, (byte)0);
/*  642 */             if (ffgcrd.call(paramInt1, 25824, i, k) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  652 */               ffpsvc.call(i, j, 0, k);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  658 */             ffc2d.call(j, n, k);
/*  659 */             i9 = MainMemory.getI32(k);
/*  660 */             if (i9 != 0) {
/*      */               break label1662;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  670 */             if (i9 > 0) {
/*  671 */               i8 = 1;
/*      */               break label1743;
/*      */             }
/*      */             else {
/*  675 */               i8 = 1;
/*      */               
/*      */               break label1676;
/*      */             }
/*      */             
/*      */             label1662:
/*      */             
/*  682 */             MainMemory.setI32(k, 0);
/*  683 */             i8 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */             label1676:
/*      */             
/*      */ 
/*  690 */             MainMemory.setI8(j, (byte)0);
/*  691 */             if (ffgcrd.call(paramInt1, 25952, i, k) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  701 */               ffpsvc.call(i, j, 0, k);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  707 */             ffc2d.call(j, i1, k);
/*  708 */             i9 = MainMemory.getI32(k);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label1743:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  718 */             if (i9 != 0) {
/*      */               break label1790;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  728 */             if (i9 > 0) {
/*  729 */               i8 = 1;
/*      */               break label1868;
/*      */             }
/*      */             else {
/*  733 */               i8 = 1;
/*      */               
/*      */               break label1801;
/*      */             }
/*      */             
/*      */             label1790:
/*      */             
/*  740 */             MainMemory.setI32(k, 0);
/*      */             
/*      */ 
/*      */ 
/*      */             label1801:
/*      */             
/*      */ 
/*      */ 
/*  748 */             MainMemory.setI8(j, (byte)0);
/*  749 */             if (ffgcrd.call(paramInt1, 25888, i, k) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  759 */               ffpsvc.call(i, j, 0, k);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  765 */             ffc2d.call(j, i3, k);
/*  766 */             i9 = MainMemory.getI32(k);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label1868:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  776 */             if (i9 != 0) {
/*      */               break label1915;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  786 */             if (i9 > 0) {
/*  787 */               i8 = 1;
/*      */               break label1993;
/*      */             }
/*      */             else {
/*  791 */               i8 = 1;
/*      */               
/*      */               break label1926;
/*      */             }
/*      */             
/*      */             label1915:
/*      */             
/*  798 */             MainMemory.setI32(k, 0);
/*      */             
/*      */ 
/*      */ 
/*      */             label1926:
/*      */             
/*      */ 
/*      */ 
/*  806 */             MainMemory.setI8(j, (byte)0);
/*  807 */             if (ffgcrd.call(paramInt1, 26016, i, k) <= 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  817 */               ffpsvc.call(i, j, 0, k);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  823 */             ffc2d.call(j, i2, k);
/*  824 */             i9 = MainMemory.getI32(k);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             label1993:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  834 */             if (i9 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  844 */               MainMemory.setI32(k, 0);
/*  845 */               if (i8 != 0) {
/*      */                 break label2223;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  855 */               MainMemory.setF64(paramInt6, 1.0D);
/*  856 */               MainMemory.setI32(k, 0);
/*  857 */               MainMemory.setI8(j, (byte)0);
/*  858 */               if (ffgcrd.call(paramInt1, 32672, i, k) <= 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  868 */                 ffpsvc.call(i, j, 0, k);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  874 */               ffc2d.call(j, paramInt7, k);
/*  875 */               if (MainMemory.getI32(k) != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  885 */                 MainMemory.setF64(paramInt7, 1.0D);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  891 */               MainMemory.setI32(k, 0);
/*  892 */               MainMemory.setI8(j, (byte)0);
/*  893 */               if (ffgcrd.call(paramInt1, 32704, i, k) <= 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  903 */                 ffpsvc.call(i, j, 0, k);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  909 */               ffc2d.call(j, paramInt8, k);
/*  910 */               if (MainMemory.getI32(k) == 0) {
/*      */                 break label2420;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  920 */               MainMemory.setF64(paramInt8, 0.0D);
/*      */               
/*      */               break label2420;
/*      */             }
/*      */             label2223:
/*  925 */             d1 = MainMemory.getF64(n);
/*  926 */             d2 = SystemLibrary.atan2(MainMemory.getF64(i1), d1);
/*  927 */             d3 = MainMemory.getF64(i2);
/*  928 */             d5 = -0.0D - MainMemory.getF64(i3);
/*  929 */             d4 = SystemLibrary.atan2(d5, d3);
/*  930 */             d5 = MathUtils.f_olt(d2, d4) ? d2 : d4;
/*  931 */             d2 = MathUtils.f_ogt(d2, d4) ? d2 : d4;
/*  932 */             d4 = d2 - d5;
/*  933 */             if (!MathUtils.f_ogt(d4, 1.5707963267948966D)) {
/*      */               break label2351;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  944 */             d5 += 3.141592653589793D;
/*      */             
/*      */ 
/*      */ 
/*      */             label2351:
/*      */             
/*      */ 
/*      */ 
/*  952 */             d4 = d5 - d2;
/*  953 */             if (!MathUtils.f_ogt(SystemLibrary.fabs(d4), 2.0E-4D)) {
/*      */               break label2398;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  963 */             MainMemory.setI32(paramInt10, 506);
/*      */             
/*      */ 
/*      */             label2398:
/*      */             
/*      */ 
/*  969 */             ffgics_1008.call(d5, d1, d3, paramInt8, paramInt6, d2, paramInt7);
/*      */           }
/*      */         }
/*      */         
/*      */         label2420:
/*      */         
/*  975 */         MainMemory.setI32(k, 0);
/*  976 */         MainMemory.setI8(j, (byte)0);
/*  977 */         if (ffgcrd.call(paramInt1, 32480, i, k) <= 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  987 */           ffpsvc.call(i, j, 0, k);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  993 */         MainMemory.setI8(m, (byte)0);
/*  994 */         ffc2s.call(j, m, k);
/*  995 */         if (MainMemory.getI32(k) != 0) {
/*      */           break label2653;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1005 */         SystemLibrary.strncpy(paramInt9, m + 4, 4);
/* 1006 */         MainMemory.setI8(paramInt9 + 4, (byte)0);
/* 1007 */         if (SystemLibrary.strncmp(m, 22368, 4) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1017 */           if (SystemLibrary.strncmp(m + 1, 18112, 3) != 0) {
/*      */             break label2643;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1027 */         d1 = 90.0D - MainMemory.getF64(paramInt8);
/* 1028 */         MainMemory.setF64(paramInt8, d1);
/* 1029 */         d1 = -0.0D - MainMemory.getF64(paramInt7);
/* 1030 */         MainMemory.setF64(paramInt7, d1);
/* 1031 */         d1 = MainMemory.getF64(paramInt2);
/* 1032 */         MainMemory.setF64(paramInt2, MainMemory.getF64(paramInt3));
/* 1033 */         MainMemory.setF64(paramInt3, d1);
/*      */         
/*      */ 
/*      */         break label2664;
/*      */       }
/*      */       
/*      */ 
/*      */       label2643:
/*      */       
/*      */       break label2664;
/*      */       
/*      */       label2653:
/*      */       
/* 1046 */       MainMemory.setI8(paramInt9, (byte)0);
/*      */     }
/*      */     finally
/*      */     {
/*      */       label2664:
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1057 */       MainMemory.dealloc_generated(i10);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */