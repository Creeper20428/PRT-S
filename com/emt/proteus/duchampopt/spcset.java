/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class spcset extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2881;
/*   12 */   public static final com.emt.proteus.runtime.api.Function _instance = new spcset();
/*   13 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*      */   
/*   15 */   public spcset() { super("spcset", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   19 */     return call(paramInt);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   25 */     paramInt4 += 2;
/*   26 */     paramInt3--;
/*   27 */     int j = call(i);
/*   28 */     paramFrame.setI32(paramInt1, j);
/*   29 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt)
/*      */   {
/*   34 */     int i = 0;
/*      */     
/*   36 */     int j = 0;
/*   37 */     int k = 0;
/*   38 */     int m = 0;
/*   39 */     int n = 0;
/*   40 */     int i1 = 0;
/*   41 */     int i2 = 0;
/*   42 */     int i3 = 0;
/*   43 */     int i4 = 0;
/*   44 */     double d1 = 0.0D;
/*   45 */     int i5 = 0;
/*   46 */     double d2 = 0.0D;
/*   47 */     int i6 = 0;
/*   48 */     int i7 = 0;
/*   49 */     double d3 = 0.0D;
/*   50 */     double d4 = 0.0D;
/*   51 */     double d5 = 0.0D;
/*   52 */     double d6 = 0.0D;
/*   53 */     boolean bool = false;
/*   54 */     double d7 = 0.0D;
/*   55 */     double d8 = 0.0D;
/*   56 */     double d9 = 0.0D;
/*   57 */     int i8 = 0;
/*   58 */     double d10 = 0.0D;
/*      */     
/*      */ 
/*   61 */     int i9 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   65 */       j = MainMemory.alloc(9);
/*   66 */       k = MainMemory.alloc(1);
/*   67 */       m = MainMemory.alloc(1);
/*   68 */       n = MainMemory.alloc(4);
/*   69 */       i5 = MainMemory.alloc(8);
/*   70 */       i6 = MainMemory.alloc(8);
/*   71 */       if (paramInt == 0) {
/*   72 */         i8 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   82 */         i1 = paramInt + 16;
/*   83 */         if (MathUtils.f_oeq(MainMemory.getF64(i1), 9.87654321E107D)) {
/*   84 */           i8 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*   94 */           MainMemory.setI8(paramInt + 8, (byte)0);
/*   95 */           MainMemory.setI8(paramInt + 15, (byte)0);
/*   96 */           i2 = paramInt + 96;
/*   97 */           MainMemory.setF64(i2, 0.0D);
/*   98 */           i3 = paramInt + 4;
/*   99 */           SystemLibrary.sprintf(j, 27168, new Object[] { Integer.valueOf(i3), Integer.valueOf(paramInt + 12) });
/*  100 */           d1 = MainMemory.getF64(paramInt + 24);
/*  101 */           d2 = MainMemory.getF64(paramInt + 32);
/*  102 */           i8 = spcspx.call(j, MainMemory.getF64(i1), d1, d2, k, m, n, i5, i6);
/*  103 */           if (i8 != 0) {
/*      */             break label4590;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  114 */           i8 = MainMemory.getI32(n);
/*  115 */           if (i8 != 0) {
/*      */             break label325;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  125 */           i4 = MainMemory.getI8(k);
/*      */           
/*      */           break label550;
/*      */           
/*      */           label325:
/*      */           
/*  131 */           bool = MathUtils.f_oeq(d1, 0.0D);
/*  132 */           d2 = (i8 == 3) && (bool) && (MathUtils.f_oeq(d2, 0.0D)) ? 1.0D : d2;
/*  133 */           if (!bool) {
/*      */             break label397;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  143 */           d1 = 2.99792458E8D / d2;
/*      */           
/*      */ 
/*      */           break label410;
/*      */           
/*      */           label397:
/*      */           
/*  150 */           d2 = 2.99792458E8D / d1;
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */           label410:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  160 */           i4 = MainMemory.getI8(k);
/*  161 */           switch (i4)
/*      */           {
/*      */           case 70: 
/*      */             break label521;
/*      */             
/*      */             break;
/*      */           case 86: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  172 */           if (MainMemory.getI8(m) != 70) {
/*      */             break label504;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  182 */           MainMemory.setF64(i2, d1);
/*      */           
/*      */           break label550;
/*      */           
/*      */           label504:
/*      */           
/*  188 */           MainMemory.setF64(i2, d2);
/*      */           
/*      */           break label550;
/*      */           
/*      */           label521:
/*      */           
/*  194 */           MainMemory.setF64(i2, d1);
/*      */           
/*      */ 
/*      */           break label550;
/*      */           
/*      */ 
/*  200 */           MainMemory.setF64(i2, d2);
/*      */           
/*      */ 
/*      */ 
/*      */           label550:
/*      */           
/*      */ 
/*      */ 
/*  208 */           d1 = MainMemory.getF64(i5);
/*  209 */           i5 = paramInt + 104;
/*  210 */           MainMemory.setF64(i5, d1);
/*  211 */           d2 = MainMemory.getF64(i6);
/*  212 */           i6 = paramInt + 112;
/*  213 */           MainMemory.setF64(i6, d2);
/*  214 */           bool = i4 == 70;
/*  215 */           if (!bool) {
/*      */             break label878;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  225 */           if (SystemLibrary.strcmp(i3, 18432) != 0) {
/*      */             break label679;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  235 */           MainMemory.setI32(paramInt, 0);
/*  236 */           MainMemory.setI32(paramInt + 156, 0);
/*  237 */           MainMemory.setI32(paramInt + 160, 0);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label679:
/*  242 */           if (SystemLibrary.strcmp(i3, 21152) != 0) {
/*      */             break label740;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  252 */           MainMemory.setI32(paramInt, 1);
/*  253 */           MainMemory.setI32(paramInt + 156, 2894);
/*  254 */           MainMemory.setI32(paramInt + 160, 2895);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label740:
/*  259 */           if (SystemLibrary.strcmp(i3, 21184) != 0) {
/*      */             break label801;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  269 */           MainMemory.setI32(paramInt, 2);
/*  270 */           MainMemory.setI32(paramInt + 156, 2896);
/*  271 */           MainMemory.setI32(paramInt + 160, 2897);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label801:
/*  276 */           if (SystemLibrary.strcmp(i3, 21216) != 0) {
/*      */             break label862;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  286 */           MainMemory.setI32(paramInt, 3);
/*  287 */           MainMemory.setI32(paramInt + 156, 2898);
/*  288 */           MainMemory.setI32(paramInt + 160, 2899);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label862:
/*  293 */           spcset_1657.call(paramInt, i3);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label878:
/*  298 */           switch (i4)
/*      */           {
/*      */           case 87: 
/*      */             break label1076;
/*      */             break;
/*      */           case 65: 
/*      */             break label1018;
/*      */             break;
/*      */           case 86: 
/*      */             break;
/*      */           }
/*      */           
/*  310 */           if (SystemLibrary.strcmp(i3, 18464) != 0) {
/*      */             break label1002;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  320 */           MainMemory.setI32(paramInt, 30);
/*  321 */           MainMemory.setI32(paramInt + 156, 0);
/*  322 */           MainMemory.setI32(paramInt + 160, 0);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label1002:
/*  327 */           spcset_1659.call(paramInt, i3);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label1018:
/*  332 */           if (SystemLibrary.strcmp(i3, 21376) != 0) {
/*      */             break label1207;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  342 */           MainMemory.setI32(paramInt, 20);
/*  343 */           MainMemory.setI32(paramInt + 156, 0);
/*  344 */           MainMemory.setI32(paramInt + 160, 0);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label1076:
/*  349 */           if (SystemLibrary.strcmp(i3, 21312) != 0) {
/*      */             break label1134;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  359 */           MainMemory.setI32(paramInt, 10);
/*  360 */           MainMemory.setI32(paramInt + 156, 0);
/*  361 */           MainMemory.setI32(paramInt + 160, 0);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label1134:
/*  366 */           if (SystemLibrary.strcmp(i3, 18496) != 0) {
/*      */             break label1196;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  376 */           MainMemory.setI32(paramInt, 11);
/*  377 */           MainMemory.setI32(paramInt + 156, 2902);
/*  378 */           MainMemory.setI32(paramInt + 160, 2903);
/*      */           
/*      */           break label1207;
/*      */           
/*      */           label1196:
/*  383 */           spcset_1658.call(paramInt, i3);
/*      */           
/*      */ 
/*      */           label1207:
/*      */           
/*      */ 
/*  389 */           n = paramInt + 144;
/*  390 */           MainMemory.setI32(n, 0);
/*  391 */           i7 = MainMemory.getI8(m);
/*  392 */           switch (i7) {
/*      */           case 70: 
/*      */             break label4363;
/*      */             break;
/*      */           case 87:  break label1847;
/*      */             break; case 119:  break label1847;
/*      */             break; case 65:  break label1571;
/*      */             break; case 97:  break label1571;
/*      */             break; case 86:  break; default:  i8 = 0;
/*  401 */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  408 */           if (!bool) {
/*      */             break label1393;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  418 */           MainMemory.setI32(paramInt + 152, 2910);
/*  419 */           MainMemory.setI32(paramInt + 164, 2887);
/*      */           
/*      */           break label1547;
/*      */           
/*      */           label1393:
/*  424 */           switch (i4)
/*      */           {
/*      */           case 87: 
/*      */             break label1520;
/*      */             break;
/*      */           case 65: 
/*      */             break label1488;
/*      */             break;
/*      */           case 86: 
/*      */             break;
/*      */           }
/*      */           
/*  436 */           MainMemory.setI32(paramInt + 152, 0);
/*  437 */           MainMemory.setI32(paramInt + 164, 0);
/*      */           
/*      */           break label1547;
/*      */           
/*      */           label1488:
/*  442 */           MainMemory.setI32(paramInt + 152, 2909);
/*  443 */           MainMemory.setI32(paramInt + 164, 2893);
/*      */           
/*      */           break label1547;
/*      */           
/*      */           label1520:
/*  448 */           MainMemory.setI32(paramInt + 152, 2908);
/*  449 */           MainMemory.setI32(paramInt + 164, 2892);
/*      */           
/*      */ 
/*      */           label1547:
/*      */           
/*      */ 
/*  455 */           MainMemory.setI32(paramInt, MainMemory.getI32(paramInt) + 400);
/*  456 */           i = 0;
/*      */           
/*      */ 
/*      */           break label4598;
/*      */           
/*      */           label1571:
/*      */           
/*  463 */           if (!bool) {
/*      */             break label1621;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  473 */           MainMemory.setI32(paramInt + 152, 2891);
/*  474 */           MainMemory.setI32(paramInt + 164, 2889);
/*      */           
/*      */           break label1775;
/*      */           
/*      */           label1621:
/*  479 */           switch (i4)
/*      */           {
/*      */           case 87: 
/*      */             break label1748;
/*      */             break;
/*      */           case 65: 
/*      */             break label1720;
/*      */             break;
/*      */           case 86: 
/*      */             break;
/*      */           }
/*      */           
/*  491 */           MainMemory.setI32(paramInt + 152, 2893);
/*  492 */           MainMemory.setI32(paramInt + 164, 2909);
/*      */           
/*      */           break label1775;
/*      */           
/*      */           label1720:
/*  497 */           MainMemory.setI32(paramInt + 152, 0);
/*  498 */           MainMemory.setI32(paramInt + 164, 0);
/*      */           
/*      */           break label1775;
/*      */           
/*      */           label1748:
/*  503 */           MainMemory.setI32(paramInt + 152, 2890);
/*  504 */           MainMemory.setI32(paramInt + 164, 2888);
/*      */           
/*      */ 
/*      */           label1775:
/*      */           
/*      */ 
/*  510 */           if (i7 != 65) {
/*      */             break label1819;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  520 */           MainMemory.setI32(paramInt, MainMemory.getI32(paramInt) + 300);
/*  521 */           i = 0;
/*      */           
/*      */ 
/*      */           break label4598;
/*      */           
/*      */           label1819:
/*      */           
/*  528 */           MainMemory.setI32(n, 2);
/*  529 */           MainMemory.setI32(paramInt, MainMemory.getI32(paramInt) + 600);
/*      */           
/*      */           break label2118;
/*      */           
/*      */           label1847:
/*  534 */           if (!bool) {
/*      */             break label1897;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  544 */           MainMemory.setI32(paramInt + 152, 2886);
/*  545 */           MainMemory.setI32(paramInt + 164, 2885);
/*      */           
/*      */           break label2051;
/*      */           
/*      */           label1897:
/*  550 */           switch (i4)
/*      */           {
/*      */           case 87: 
/*      */             break label2028;
/*      */             break;
/*      */           case 65: 
/*      */             break label1996;
/*      */             break;
/*      */           case 86: 
/*      */             break;
/*      */           }
/*      */           
/*  562 */           MainMemory.setI32(paramInt + 152, 2892);
/*  563 */           MainMemory.setI32(paramInt + 164, 2908);
/*      */           
/*      */           break label2051;
/*      */           
/*      */           label1996:
/*  568 */           MainMemory.setI32(paramInt + 152, 2888);
/*  569 */           MainMemory.setI32(paramInt + 164, 2890);
/*      */           
/*      */           break label2051;
/*      */           
/*      */           label2028:
/*  574 */           MainMemory.setI32(paramInt + 152, 0);
/*  575 */           MainMemory.setI32(paramInt + 164, 0);
/*      */           
/*      */ 
/*      */           label2051:
/*      */           
/*      */ 
/*  581 */           if (i7 != 87) {
/*      */             break label2095;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  591 */           MainMemory.setI32(paramInt, MainMemory.getI32(paramInt) + 200);
/*  592 */           i = 0;
/*      */           
/*      */ 
/*      */           break label4598;
/*      */           
/*      */           label2095:
/*      */           
/*  599 */           MainMemory.setI32(n, 1);
/*  600 */           MainMemory.setI32(paramInt, MainMemory.getI32(paramInt) + 500);
/*      */           
/*      */ 
/*      */           label2118:
/*      */           
/*      */ 
/*  606 */           i2 = paramInt + 40;
/*  607 */           d3 = MainMemory.getF64(i2);
/*  608 */           if (!MathUtils.f_oeq(d3, 9.87654321E107D))
/*      */           {
/*      */ 
/*      */ 
/*  612 */             d8 = d3;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  619 */             MainMemory.setF64(i2, 0.0D);
/*  620 */             d8 = 0.0D;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  627 */           i2 = paramInt + 48;
/*  628 */           d3 = MainMemory.getF64(i2);
/*  629 */           if (!MathUtils.f_oeq(d3, 9.87654321E107D))
/*      */           {
/*      */ 
/*      */ 
/*  633 */             d7 = d3;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  640 */             MainMemory.setF64(i2, 0.0D);
/*  641 */             d7 = 0.0D;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  648 */           i2 = paramInt + 56;
/*  649 */           d3 = MainMemory.getF64(i2);
/*  650 */           if (!MathUtils.f_oeq(d3, 9.87654321E107D)) {
/*      */             break label2279;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  661 */           MainMemory.setF64(i2, 0.0D);
/*  662 */           d3 = 0.0D;
/*      */           
/*      */ 
/*      */ 
/*      */           label2279:
/*      */           
/*      */ 
/*  669 */           i2 = paramInt + 64;
/*  670 */           d4 = MainMemory.getF64(i2);
/*  671 */           if (!MathUtils.f_oeq(d4, 9.87654321E107D)) {
/*      */             break label2330;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  682 */           MainMemory.setF64(i2, 1.0D);
/*  683 */           d4 = 1.0D;
/*      */           
/*      */ 
/*      */ 
/*      */           label2330:
/*      */           
/*      */ 
/*  690 */           i2 = paramInt + 72;
/*  691 */           d5 = MainMemory.getF64(i2);
/*  692 */           if (!MathUtils.f_oeq(d5, 9.87654321E107D)) {
/*      */             break label2381;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  703 */           MainMemory.setF64(i2, 0.0D);
/*  704 */           d5 = 0.0D;
/*      */           
/*      */ 
/*      */ 
/*      */           label2381:
/*      */           
/*      */ 
/*  711 */           i2 = paramInt + 80;
/*  712 */           d6 = MainMemory.getF64(i2);
/*  713 */           if (!MathUtils.f_oeq(d6, 9.87654321E107D))
/*      */           {
/*      */ 
/*      */ 
/*  717 */             d9 = d6;
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  724 */             MainMemory.setF64(i2, 0.0D);
/*  725 */             d9 = 0.0D;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  732 */           i2 = paramInt + 88;
/*  733 */           d6 = MainMemory.getF64(i2);
/*  734 */           if (!MathUtils.f_oeq(d6, 9.87654321E107D)) {
/*      */             break label2487;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  745 */           MainMemory.setF64(i2, 0.0D);
/*  746 */           d6 = 0.0D;
/*      */           
/*      */ 
/*      */ 
/*      */           label2487:
/*      */           
/*      */ 
/*  753 */           d8 *= d7;
/*  754 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d9, 90.0D), 0.0D)) {
/*      */             break label2666;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  764 */           d7 = d9 / 90.0D;
/*  765 */           d7 += 0.5D;
/*  766 */           i8 = (int)SystemLibrary.floor(d7);
/*  767 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*      */           case 0:  break label2653;
/*      */             break; case 1:  d7 = 0.0D;
/*      */             break label2694;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d7 = 0.0D;
/*      */             
/*      */ 
/*      */             break label2694;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  782 */           d7 = -1.0D;
/*      */           
/*      */           break label2694;
/*      */           
/*      */           label2653:
/*  787 */           d7 = 1.0D;
/*      */           
/*      */           break label2694;
/*      */           
/*      */           label2666:
/*  792 */           d7 = d9 * 3.141592653589793D;
/*  793 */           d7 /= 180.0D;
/*  794 */           d7 = SystemLibrary.cos(d7);
/*      */           
/*      */ 
/*      */ 
/*      */           label2694:
/*      */           
/*      */ 
/*      */ 
/*  802 */           d8 /= d7;
/*  803 */           d7 = d8 * d1;
/*  804 */           bool = MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D);
/*  805 */           if (!bool) {
/*      */             break label2882;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  815 */           d9 = d3 / 90.0D;
/*  816 */           d9 += -0.5D;
/*  817 */           i8 = (int)SystemLibrary.floor(d9);
/*  818 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*      */           case 0:  break label2869;
/*      */             break; case 1:  d9 = 0.0D;
/*      */             break label2910;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d9 = 0.0D;
/*      */             
/*      */ 
/*      */             break label2910;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  833 */           d9 = -1.0D;
/*      */           
/*      */           break label2910;
/*      */           
/*      */           label2869:
/*  838 */           d9 = 1.0D;
/*      */           
/*      */           break label2910;
/*      */           
/*      */           label2882:
/*  843 */           d9 = d3 * 3.141592653589793D;
/*  844 */           d9 /= 180.0D;
/*  845 */           d9 = SystemLibrary.sin(d9);
/*      */           
/*      */ 
/*      */ 
/*      */           label2910:
/*      */           
/*      */ 
/*      */ 
/*  853 */           d9 *= d4;
/*  854 */           d7 -= d9;
/*  855 */           if (!MathUtils.f_ugt(d7, -1.0D)) {
/*      */             break label3031;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  865 */           if (MathUtils.f_oeq(d7, 0.0D)) {
/*  866 */             d7 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  876 */             if (!MathUtils.f_ult(d7, 1.0D))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  886 */               d9 = d7 + -1.0D;
/*  887 */               if (MathUtils.f_olt(d9, 1.0E-10D)) {
/*  888 */                 d7 = 90.0D;
/*      */                 
/*      */                 break label3087;
/*      */               }
/*      */               else
/*      */               {
/*      */                 break label3063;
/*      */               }
/*      */               label3031:
/*  897 */               d9 = d7 + 1.0D;
/*  898 */               if (MathUtils.f_ogt(d9, -1.0E-10D)) {
/*  899 */                 d7 = -90.0D;
/*      */                 
/*      */ 
/*      */                 break label3087;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */             label3063:
/*      */             
/*  909 */             d7 = SystemLibrary.asin(d7) * 180.0D;
/*  910 */             d7 /= 3.141592653589793D;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */           label3087:
/*      */           
/*      */ 
/*  918 */           if (!bool) {
/*      */             break label3246;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  928 */           d9 = d3 / 90.0D;
/*  929 */           d9 += -0.5D;
/*  930 */           i8 = (int)SystemLibrary.floor(d9);
/*  931 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*      */           case 0:  break label3233;
/*      */             break; case 1:  d9 = 0.0D;
/*      */             break label3274;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d9 = 0.0D;
/*      */             
/*      */ 
/*      */             break label3274;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*  946 */           d9 = -1.0D;
/*      */           
/*      */           break label3274;
/*      */           
/*      */           label3233:
/*  951 */           d9 = 1.0D;
/*      */           
/*      */           break label3274;
/*      */           
/*      */           label3246:
/*  956 */           d9 = d3 * 3.141592653589793D;
/*  957 */           d9 /= 180.0D;
/*  958 */           d9 = SystemLibrary.sin(d9);
/*      */           
/*      */ 
/*      */ 
/*      */           label3274:
/*      */           
/*      */ 
/*      */ 
/*  966 */           d9 *= d5;
/*  967 */           d8 -= d9;
/*  968 */           d9 = SystemLibrary.fmod(d6, 360.0D);
/*  969 */           if (MathUtils.f_oeq(d9, 0.0D)) {
/*  970 */             d9 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*  980 */           else if (MathUtils.f_oeq(SystemLibrary.fabs(d9), 180.0D)) {
/*  981 */             d9 = 0.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*  991 */           else if ((MathUtils.f_oeq(d9, 45.0D)) || (MathUtils.f_oeq(d9, 225.0D))) {
/*  992 */             d9 = 1.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/* 1002 */           else if ((MathUtils.f_oeq(d9, -135.0D)) || (MathUtils.f_oeq(d9, -315.0D))) {
/* 1003 */             d9 = -1.0D;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/* 1013 */             d9 = d6 * 3.141592653589793D;
/* 1014 */             d9 /= 180.0D;
/* 1015 */             d9 = SystemLibrary.tan(d9);
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1023 */           d9 = -0.0D - d9;
/* 1024 */           MainMemory.setF64(i5, d9);
/* 1025 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d7, 90.0D), 0.0D)) {
/*      */             break label3634;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1035 */           d9 = d7 / 90.0D;
/* 1036 */           d9 += 0.5D;
/* 1037 */           i8 = (int)SystemLibrary.floor(d9);
/* 1038 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*      */           case 0:  break label3621;
/*      */             break; case 1:  d9 = 0.0D;
/*      */             break label3662;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d9 = 0.0D;
/*      */             
/*      */ 
/*      */             break label3662;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/* 1053 */           d9 = -1.0D;
/*      */           
/*      */           break label3662;
/*      */           
/*      */           label3621:
/* 1058 */           d9 = 1.0D;
/*      */           
/*      */           break label3662;
/*      */           
/*      */           label3634:
/* 1063 */           d9 = d7 * 3.141592653589793D;
/* 1064 */           d9 /= 180.0D;
/* 1065 */           d9 = SystemLibrary.cos(d9);
/*      */           
/*      */ 
/*      */ 
/*      */           label3662:
/*      */           
/*      */ 
/*      */ 
/* 1073 */           bool = MathUtils.f_oeq(SystemLibrary.fmod(d6, 90.0D), 0.0D);
/* 1074 */           if (!bool) {
/*      */             break label3838;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1084 */           d10 = d6 / 90.0D;
/* 1085 */           d10 += 0.5D;
/* 1086 */           i8 = (int)SystemLibrary.floor(d10);
/* 1087 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*      */           case 0:  break label3825;
/*      */             break; case 1:  d10 = 0.0D;
/*      */             break label3866;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d10 = 0.0D;
/*      */             
/*      */ 
/*      */             break label3866;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/* 1102 */           d10 = -1.0D;
/*      */           
/*      */           break label3866;
/*      */           
/*      */           label3825:
/* 1107 */           d10 = 1.0D;
/*      */           
/*      */           break label3866;
/*      */           
/*      */           label3838:
/* 1112 */           d10 = d6 * 3.141592653589793D;
/* 1113 */           d10 /= 180.0D;
/* 1114 */           d10 = SystemLibrary.cos(d10);
/*      */           
/*      */ 
/*      */ 
/*      */           label3866:
/*      */           
/*      */ 
/*      */ 
/* 1122 */           d9 *= d10;
/* 1123 */           if (!bool) {
/*      */             break label4034;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1133 */           d10 = d6 / 90.0D;
/* 1134 */           d10 += 0.5D;
/* 1135 */           i8 = (int)SystemLibrary.floor(d10);
/* 1136 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*      */           case 0:  break label4021;
/*      */             break; case 1:  d10 = 0.0D;
/*      */             break label4062;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d10 = 0.0D;
/*      */             
/*      */ 
/*      */             break label4062;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/* 1151 */           d10 = -1.0D;
/*      */           
/*      */           break label4062;
/*      */           
/*      */           label4021:
/* 1156 */           d10 = 1.0D;
/*      */           
/*      */           break label4062;
/*      */           
/*      */           label4034:
/* 1161 */           d10 = d6 * 3.141592653589793D;
/* 1162 */           d10 /= 180.0D;
/* 1163 */           d10 = SystemLibrary.cos(d10);
/*      */           
/*      */ 
/*      */ 
/*      */           label4062:
/*      */           
/*      */ 
/*      */ 
/* 1171 */           d9 *= d10;
/* 1172 */           d9 = d8 / d9;
/* 1173 */           d2 *= d9;
/* 1174 */           MainMemory.setF64(i6, d2);
/* 1175 */           d2 = d7 + d6;
/* 1176 */           MainMemory.setF64(paramInt + 120, d2);
/* 1177 */           d1 = d5 * d1;
/* 1178 */           d1 = d4 - d1;
/* 1179 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*      */             break label4290;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1189 */           d2 = d3 / 90.0D;
/* 1190 */           d2 += -0.5D;
/* 1191 */           i8 = (int)SystemLibrary.floor(d2);
/* 1192 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*      */           case 0:  break label4277;
/*      */             break; case 1:  d2 = 0.0D;
/*      */             break label4318;
/*      */             break;
/*      */           case 2: 
/*      */             break; case 3:  d2 = 0.0D;
/*      */             
/*      */ 
/*      */             break label4318;
/*      */             
/*      */             break;
/*      */           }
/*      */           
/*      */           
/* 1207 */           d2 = -1.0D;
/*      */           
/*      */           break label4318;
/*      */           
/*      */           label4277:
/* 1212 */           d2 = 1.0D;
/*      */           
/*      */           break label4318;
/*      */           
/*      */           label4290:
/* 1217 */           d2 = d3 * 3.141592653589793D;
/* 1218 */           d2 /= 180.0D;
/* 1219 */           d2 = SystemLibrary.sin(d2);
/*      */           
/*      */ 
/*      */ 
/*      */           label4318:
/*      */           
/*      */ 
/*      */ 
/* 1227 */           d1 *= d2;
/* 1228 */           MainMemory.setF64(paramInt + 128, d1);
/* 1229 */           d1 = 1.0D / d8;
/* 1230 */           MainMemory.setF64(paramInt + 136, d1);
/* 1231 */           i = 0;
/*      */           
/*      */ 
/*      */           break label4598;
/*      */           
/*      */           label4363:
/*      */           
/* 1238 */           if (!bool) {
/*      */             break label4409;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1248 */           MainMemory.setI32(paramInt + 152, 0);
/* 1249 */           MainMemory.setI32(paramInt + 164, 0);
/*      */           
/*      */           break label4567;
/*      */           
/*      */           label4409:
/* 1254 */           switch (i4)
/*      */           {
/*      */           case 87: 
/*      */             break label4540;
/*      */             break;
/*      */           case 65: 
/*      */             break label4508;
/*      */             break;
/*      */           case 86: 
/*      */             break;
/*      */           }
/*      */           
/* 1266 */           MainMemory.setI32(paramInt + 152, 2887);
/* 1267 */           MainMemory.setI32(paramInt + 164, 2910);
/*      */           
/*      */           break label4567;
/*      */           
/*      */           label4508:
/* 1272 */           MainMemory.setI32(paramInt + 152, 2889);
/* 1273 */           MainMemory.setI32(paramInt + 164, 2891);
/*      */           
/*      */           break label4567;
/*      */           
/*      */           label4540:
/* 1278 */           MainMemory.setI32(paramInt + 152, 2885);
/* 1279 */           MainMemory.setI32(paramInt + 164, 2886);
/*      */           
/*      */ 
/*      */           label4567:
/*      */           
/*      */ 
/* 1285 */           MainMemory.setI32(paramInt, MainMemory.getI32(paramInt) + 100);
/* 1286 */           i = 0;
/*      */           
/*      */           break label4598;
/*      */         }
/*      */       }
/*      */       
/*      */       label4590:
/*      */       
/* 1294 */       i = i8;
/*      */       
/*      */ 
/*      */       label4598:
/*      */       
/*      */ 
/* 1300 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1305 */       MainMemory.dealloc_generated(i9);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spcset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */