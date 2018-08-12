/*      */ package com.emt.proteus.duchampopt;
/*      */ 
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
/*      */ public final class prjset
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2875;
/*   38 */   public static final Function _instance = new prjset();
/*   39 */   public final Function resolve() { return _instance; }
/*      */   
/*   41 */   public prjset() { super("prjset", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   45 */     return call(paramInt);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   50 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   51 */     paramInt4 += 2;
/*   52 */     paramInt3--;
/*   53 */     int j = call(i);
/*   54 */     paramFrame.setI32(paramInt1, j);
/*   55 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt)
/*      */   {
/*   60 */     int i = 0;
/*      */     
/*   62 */     int j = 0;
/*   63 */     int k = 0;
/*   64 */     int m = 0;
/*   65 */     int n = 0;
/*   66 */     int i1 = 0;
/*   67 */     int i2 = 0;
/*   68 */     int i3 = 0;
/*   69 */     int i4 = 0;
/*   70 */     int i5 = 0;
/*   71 */     int i6 = 0;
/*   72 */     int i7 = 0;
/*   73 */     int i8 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   79 */       if (paramInt == 0) {
/*   80 */         j = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*   90 */         MainMemory.setI8(paramInt + 7, (byte)0);
/*   91 */         j = MainMemory.getI8(paramInt + 4) & 0xFF;
/*   92 */         k = j + -65;
/*   93 */         m = k == 0 ? 1 : 0;
/*   94 */         if (m == 0)
/*      */         {
/*      */ 
/*      */ 
/*   98 */           i2 = k;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  105 */           i2 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -90;
/*  106 */           if (i2 != 0) {
/*      */             break label172;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  117 */           i2 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -80;
/*  118 */           if (i2 == 0) {
/*      */             break label190;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label172:
/*      */         
/*      */ 
/*      */ 
/*  130 */         if (i2 != 0) {
/*      */           break label205;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label190:
/*      */         
/*      */ 
/*      */ 
/*  140 */         i = azpset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label205:
/*      */         
/*  147 */         n = j + -83;
/*  148 */         i1 = n == 0 ? 1 : 0;
/*  149 */         if (i1 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  153 */           i2 = n;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  160 */           i2 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -90;
/*  161 */           if (i2 != 0) {
/*      */             break label309;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  172 */           i2 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -80;
/*  173 */           if (i2 == 0) {
/*      */             break label327;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label309:
/*      */         
/*      */ 
/*      */ 
/*  185 */         if (i2 != 0) {
/*      */           break label342;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label327:
/*      */         
/*      */ 
/*      */ 
/*  195 */         i = szpset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label342:
/*      */         
/*  202 */         i2 = j + -84;
/*  203 */         i3 = i2 == 0 ? 1 : 0;
/*  204 */         if (i3 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  208 */           i4 = i2;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  215 */           i4 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -65;
/*  216 */           if (i4 != 0) {
/*      */             break label446;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  227 */           i4 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -78;
/*  228 */           if (i4 == 0) {
/*      */             break label464;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label446:
/*      */         
/*      */ 
/*      */ 
/*  240 */         if (i4 != 0) {
/*      */           break label479;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label464:
/*      */         
/*      */ 
/*      */ 
/*  250 */         i = tanset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label479:
/*      */         
/*  257 */         if (i1 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  261 */           i4 = n;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  268 */           i4 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -84;
/*  269 */           if (i4 != 0) {
/*      */             break label565;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  280 */           i4 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -71;
/*  281 */           if (i4 == 0) {
/*      */             break label583;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label565:
/*      */         
/*      */ 
/*      */ 
/*  293 */         if (i4 != 0) {
/*      */           break label598;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label583:
/*      */         
/*      */ 
/*      */ 
/*  303 */         i = stgset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label598:
/*      */         
/*  310 */         if (i1 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  314 */           i4 = n;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  321 */           i4 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -73;
/*  322 */           if (i4 != 0) {
/*      */             break label684;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  333 */           i4 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -78;
/*  334 */           if (i4 == 0) {
/*      */             break label702;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label684:
/*      */         
/*      */ 
/*      */ 
/*  346 */         if (i4 != 0) {
/*      */           break label717;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label702:
/*      */         
/*      */ 
/*      */ 
/*  356 */         i = sinset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label717:
/*      */         
/*  363 */         if (m == 0)
/*      */         {
/*      */ 
/*      */ 
/*  367 */           i4 = k;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  374 */           i4 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -82;
/*  375 */           if (i4 != 0) {
/*      */             break label802;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  386 */           i4 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -67;
/*  387 */           if (i4 == 0) {
/*      */             break label820;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label802:
/*      */         
/*      */ 
/*      */ 
/*  399 */         if (i4 != 0) {
/*      */           break label835;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label820:
/*      */         
/*      */ 
/*      */ 
/*  409 */         i = arcset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label835:
/*      */         
/*  416 */         i4 = j + -90;
/*  417 */         i5 = i4 == 0 ? 1 : 0;
/*  418 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  422 */           i6 = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  429 */           i6 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -80;
/*  430 */           if (i6 != 0) {
/*      */             break label939;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  441 */           i6 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -78;
/*  442 */           if (i6 == 0) {
/*      */             break label957;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label939:
/*      */         
/*      */ 
/*      */ 
/*  454 */         if (i6 != 0) {
/*      */           break label972;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label957:
/*      */         
/*      */ 
/*      */ 
/*  464 */         i = zpnset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label972:
/*      */         
/*  471 */         if (i5 == 0) {
/*      */           break label1054;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  482 */         i4 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -69;
/*  483 */         if (i4 != 0) {
/*      */           break label1054;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  494 */         i4 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -65;
/*  495 */         if (i4 != 0) {
/*      */           label1054:
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
/*  507 */           if (i4 != 0) {
/*      */             break label1087;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  517 */         i = zeaset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1087:
/*      */         
/*  524 */         if (m == 0)
/*      */         {
/*      */ 
/*      */ 
/*  528 */           i4 = k;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  535 */           i4 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -73;
/*  536 */           if (i4 != 0) {
/*      */             break label1172;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  547 */           i4 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -82;
/*  548 */           if (i4 == 0) {
/*      */             break label1190;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1172:
/*      */         
/*      */ 
/*      */ 
/*  560 */         if (i4 != 0) {
/*      */           break label1205;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1190:
/*      */         
/*      */ 
/*      */ 
/*  570 */         i = airset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1205:
/*      */         
/*  577 */         i4 = j + -67;
/*  578 */         i5 = i4 == 0 ? 1 : 0;
/*  579 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  583 */           i6 = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  590 */           i6 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -89;
/*  591 */           if (i6 != 0) {
/*      */             break label1309;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  602 */           i6 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -80;
/*  603 */           if (i6 == 0) {
/*      */             break label1327;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1309:
/*      */         
/*      */ 
/*      */ 
/*  615 */         if (i6 != 0) {
/*      */           break label1342;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1327:
/*      */         
/*      */ 
/*      */ 
/*  625 */         i = cypset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1342:
/*      */         
/*  632 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  636 */           i6 = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  643 */           i6 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -69;
/*  644 */           if (i6 != 0) {
/*      */             break label1428;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  655 */           i6 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -65;
/*  656 */           if (i6 == 0) {
/*      */             break label1446;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1428:
/*      */         
/*      */ 
/*      */ 
/*  668 */         if (i6 != 0) {
/*      */           break label1461;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1446:
/*      */         
/*      */ 
/*      */ 
/*  678 */         i = ceaset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1461:
/*      */         
/*  685 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  689 */           i6 = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  696 */           i6 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -65;
/*  697 */           if (i6 != 0) {
/*      */             break label1547;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  708 */           i6 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -82;
/*  709 */           if (i6 == 0) {
/*      */             break label1565;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1547:
/*      */         
/*      */ 
/*      */ 
/*  721 */         if (i6 != 0) {
/*      */           break label1580;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1565:
/*      */         
/*      */ 
/*      */ 
/*  731 */         i = carset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1580:
/*      */         
/*  738 */         i6 = j + -77;
/*  739 */         i7 = i6 == 0 ? 1 : 0;
/*  740 */         if (i7 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  744 */           i8 = i6;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  751 */           i8 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -69;
/*  752 */           if (i8 != 0) {
/*      */             break label1684;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  763 */           i8 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -82;
/*  764 */           if (i8 == 0) {
/*      */             break label1702;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1684:
/*      */         
/*      */ 
/*      */ 
/*  776 */         if (i8 != 0) {
/*      */           break label1717;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1702:
/*      */         
/*      */ 
/*      */ 
/*  786 */         i = merset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1717:
/*      */         
/*  793 */         if (i1 == 0) {
/*      */           break label1799;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  804 */         n = (MainMemory.getI8(paramInt + 5) & 0xFF) + -70;
/*  805 */         if (n != 0) {
/*      */           break label1799;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  816 */         n = (MainMemory.getI8(paramInt + 6) & 0xFF) + -76;
/*  817 */         if (n != 0) {
/*      */           label1799:
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
/*  829 */           if (n != 0) {
/*      */             break label1832;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  839 */         i = sflset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1832:
/*      */         
/*  846 */         n = j + -80;
/*  847 */         i1 = n == 0 ? 1 : 0;
/*  848 */         if (i1 == 0)
/*      */         {
/*      */ 
/*      */ 
/*  852 */           i8 = n;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*  859 */           i8 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -65;
/*  860 */           if (i8 != 0) {
/*      */             break label1936;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  871 */           i8 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -82;
/*  872 */           if (i8 == 0) {
/*      */             break label1954;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label1936:
/*      */         
/*      */ 
/*      */ 
/*  884 */         if (i8 != 0) {
/*      */           break label1969;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label1954:
/*      */         
/*      */ 
/*      */ 
/*  894 */         i = parset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label1969:
/*      */         
/*  901 */         if (i7 == 0) {
/*      */           break label2051;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  912 */         i6 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -79;
/*  913 */         if (i6 != 0) {
/*      */           break label2051;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  924 */         i6 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -76;
/*  925 */         if (i6 != 0) {
/*      */           label2051:
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
/*  937 */           if (i6 != 0) {
/*      */             break label2084;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  947 */         i = molset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2084:
/*      */         
/*  954 */         if (m == 0) {
/*      */           break label2162;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  965 */         k = (MainMemory.getI8(paramInt + 5) & 0xFF) + -73;
/*  966 */         if (k != 0) {
/*      */           break label2162;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  977 */         k = (MainMemory.getI8(paramInt + 6) & 0xFF) + -84;
/*  978 */         if (k != 0) {
/*      */           label2162:
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
/*  990 */           if (k != 0) {
/*      */             break label2194;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1000 */         i = aitset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2194:
/*      */         
/* 1007 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 1011 */           k = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1018 */           k = (MainMemory.getI8(paramInt + 5) & 0xFF) + -79;
/* 1019 */           if (k != 0) {
/*      */             break label2275;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1030 */           k = (MainMemory.getI8(paramInt + 6) & 0xFF) + -80;
/* 1031 */           if (k == 0) {
/*      */             break label2292;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2275:
/*      */         
/*      */ 
/*      */ 
/* 1043 */         if (k != 0) {
/*      */           break label2307;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2292:
/*      */         
/*      */ 
/*      */ 
/* 1053 */         i = copset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2307:
/*      */         
/* 1060 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 1064 */           k = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1071 */           k = (MainMemory.getI8(paramInt + 5) & 0xFF) + -79;
/* 1072 */           if (k != 0) {
/*      */             break label2388;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1083 */           k = (MainMemory.getI8(paramInt + 6) & 0xFF) + -69;
/* 1084 */           if (k == 0) {
/*      */             break label2405;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2388:
/*      */         
/*      */ 
/*      */ 
/* 1096 */         if (k != 0) {
/*      */           break label2420;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2405:
/*      */         
/*      */ 
/*      */ 
/* 1106 */         i = coeset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2420:
/*      */         
/* 1113 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 1117 */           k = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1124 */           k = (MainMemory.getI8(paramInt + 5) & 0xFF) + -79;
/* 1125 */           if (k != 0) {
/*      */             break label2501;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1136 */           k = (MainMemory.getI8(paramInt + 6) & 0xFF) + -68;
/* 1137 */           if (k == 0) {
/*      */             break label2518;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2501:
/*      */         
/*      */ 
/*      */ 
/* 1149 */         if (k != 0) {
/*      */           break label2533;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2518:
/*      */         
/*      */ 
/*      */ 
/* 1159 */         i = codset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2533:
/*      */         
/* 1166 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 1170 */           k = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1177 */           k = (MainMemory.getI8(paramInt + 5) & 0xFF) + -79;
/* 1178 */           if (k != 0) {
/*      */             break label2614;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1189 */           k = (MainMemory.getI8(paramInt + 6) & 0xFF) + -79;
/* 1190 */           if (k == 0) {
/*      */             break label2631;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2614:
/*      */         
/*      */ 
/*      */ 
/* 1202 */         if (k != 0) {
/*      */           break label2646;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2631:
/*      */         
/*      */ 
/*      */ 
/* 1212 */         i = cooset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2646:
/*      */         
/* 1219 */         k = j + -66;
/* 1220 */         if (k != 0) {
/*      */           break label2728;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1231 */         k = (MainMemory.getI8(paramInt + 5) & 0xFF) + -79;
/* 1232 */         if (k != 0) {
/*      */           break label2728;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1243 */         k = (MainMemory.getI8(paramInt + 6) & 0xFF) + -78;
/* 1244 */         if (k != 0) {
/*      */           label2728:
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
/* 1256 */           if (k != 0) {
/*      */             break label2760;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1266 */         i = bonset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2760:
/*      */         
/* 1273 */         if (i1 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 1277 */           k = n;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1284 */           k = (MainMemory.getI8(paramInt + 5) & 0xFF) + -67;
/* 1285 */           if (k != 0) {
/*      */             break label2841;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1296 */           k = (MainMemory.getI8(paramInt + 6) & 0xFF) + -79;
/* 1297 */           if (k == 0) {
/*      */             break label2858;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label2841:
/*      */         
/*      */ 
/*      */ 
/* 1309 */         if (k != 0) {
/*      */           break label2873;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label2858:
/*      */         
/*      */ 
/*      */ 
/* 1319 */         i = pcoset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2873:
/*      */         
/* 1326 */         if (i3 == 0) {
/*      */           break label2955;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1337 */         i2 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -83;
/* 1338 */         if (i2 != 0) {
/*      */           break label2955;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1349 */         i2 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -67;
/* 1350 */         if (i2 != 0) {
/*      */           label2955:
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
/* 1362 */           if (i2 != 0) {
/*      */             break label2988;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1372 */         i = tscset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label2988:
/*      */         
/* 1379 */         if (i5 == 0)
/*      */         {
/*      */ 
/*      */ 
/* 1383 */           i2 = i4;
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 1390 */           i2 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -83;
/* 1391 */           if (i2 != 0) {
/*      */             break label3074;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1402 */           i2 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -67;
/* 1403 */           if (i2 == 0) {
/*      */             break label3092;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         label3074:
/*      */         
/*      */ 
/*      */ 
/* 1415 */         if (i2 != 0) {
/*      */           break label3107;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */         label3092:
/*      */         
/*      */ 
/*      */ 
/* 1425 */         i = cscset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label3107:
/*      */         
/* 1432 */         i2 = j + -81;
/* 1433 */         if (i2 != 0) {
/*      */           break label3195;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1444 */         i2 = (MainMemory.getI8(paramInt + 5) & 0xFF) + -83;
/* 1445 */         if (i2 != 0) {
/*      */           break label3195;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1456 */         i2 = (MainMemory.getI8(paramInt + 6) & 0xFF) + -67;
/* 1457 */         if (i2 != 0) {
/*      */           label3195:
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
/* 1469 */           if (i2 != 0) {
/*      */             break label3228;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1479 */         i = qscset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */         
/*      */         label3228:
/*      */         
/* 1486 */         j += -72;
/* 1487 */         if (j != 0) {
/*      */           break label3310;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1498 */         j = (MainMemory.getI8(paramInt + 5) & 0xFF) + -80;
/* 1499 */         if (j != 0) {
/*      */           break label3310;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1510 */         j = (MainMemory.getI8(paramInt + 6) & 0xFF) + -88;
/* 1511 */         if (j != 0) {
/*      */           label3310:
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
/* 1523 */           if (j != 0)
/*      */           {
/*      */ 
/*      */ 
/* 1527 */             j = 2;
/*      */             
/*      */ 
/*      */             break label3344;
/*      */           }
/*      */         }
/*      */         
/* 1534 */         i = hpxset.call(paramInt);
/*      */         
/*      */ 
/*      */         break label3351;
/*      */       }
/*      */       
/*      */       label3344:
/*      */       
/* 1542 */       i = j;
/*      */       
/*      */ 
/*      */       label3351:
/*      */       
/*      */ 
/* 1548 */       int i9 = i; return i9;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/prjset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */