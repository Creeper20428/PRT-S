/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.Function;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ 
/*      */ public final class ffgkcl extends com.emt.proteus.runtime.api.ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3239;
/*   12 */   public static final Function _instance = new ffgkcl();
/*   13 */   public final Function resolve() { return _instance; }
/*      */   
/*   15 */   public ffgkcl() { super("ffgkcl", 1, false); }
/*      */   
/*      */   public int execute(int paramInt)
/*      */   {
/*   19 */     return call(paramInt);
/*      */   }
/*      */   
/*      */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*   44 */     int i5 = 0;
/*   45 */     int i6 = 0;
/*   46 */     int i7 = 0;
/*      */     
/*      */ 
/*   49 */     int i8 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   53 */       j = MainMemory.alloc(20);
/*   54 */       MainMemory.setI8(j, (byte)0);
/*   55 */       SystemLibrary.strncat(j, paramInt, 8);
/*   56 */       SystemLibrary.memcpy(j + SystemLibrary.strlen(j), 43584, 9, 1);
/*   57 */       k = SystemLibrary.strlen(j);
/*   58 */       if (k != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   68 */         m = com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc.call();
/*   69 */         n = 0;
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*   76 */           i1 = j + n;
/*   77 */           MainMemory.setI8(i1, (byte)MainMemory.getI32(MainMemory.getI32(m) + (MainMemory.getI8(i1) << 2)));
/*   78 */           n += 1;
/*   79 */           if (n == k) {
/*      */             break;
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   90 */       i1 = j + 1;
/*   91 */       i2 = j + 5;
/*   92 */       i5 = MainMemory.getI8(j);
/*   93 */       switch (i5) {
/*      */       case 90:  break label8086;
/*      */         break; case 32:  k = 130;
/*      */         break label9092;
/*      */         break;
/*      */       case 66: 
/*      */         break label7620;
/*      */         break;
/*      */       case 67: 
/*      */         break label6180;
/*      */         break;
/*      */       case 68: 
/*      */         break label5911;
/*      */         break;
/*      */       case 69: 
/*      */         break label5324;
/*      */         break; case 71:  break label5191;
/*      */         break; case 72:  break label4882;
/*      */         break; case 76:  break label4599;
/*      */         break; case 77:  break label4446;
/*      */         break; case 78:  break label4351;
/*      */         break; case 80:  break label4076;
/*      */         break; case 82:  break label3836;
/*      */         break; case 83:  break label3782;
/*      */         break; case 84:  break label885;
/*      */         break; case 88:  break label831;
/*      */         break; case 87:  break; }
/*  120 */       i5 = MainMemory.getI8(i1);
/*  121 */       if (i5 <= 66) {
/*      */         break label687;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  131 */       if (i5 >= 68) {
/*      */         break label641;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  141 */       if (SystemLibrary.strncmp(i1, 31648, 6) == 0) {
/*  142 */         k = 110;
/*      */       }
/*      */       else
/*      */       {
/*      */         label641:
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  152 */         if (i5 != 67) {
/*      */           break label10881;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  162 */         if (SystemLibrary.strncmp(i1, 31680, 6) == 0) {
/*  163 */           k = 110;
/*      */         }
/*      */         else
/*      */         {
/*      */           label687:
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  173 */           if (i5 != 67) {
/*      */             break label10881;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  183 */           if (SystemLibrary.strncmp(i1, 17056, 3) != 0) {
/*      */             break label769;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  193 */           i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */           
/*      */ 
/*      */           break label10890;
/*      */           
/*      */           label769:
/*      */           
/*  200 */           if (SystemLibrary.strncmp(i1, 17088, 3) != 0) {
/*      */             break label10881;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  210 */           i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */           
/*      */ 
/*      */           break label10890;
/*      */           
/*      */           label831:
/*      */           
/*  217 */           if (MainMemory.getI8(i1) != 84) {
/*      */             break label10881;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  227 */           i = SystemLibrary.strncmp(i1, 38464, 7) == 0 ? 10 : 150;
/*      */           
/*      */ 
/*      */           break label10890;
/*      */           
/*      */           label885:
/*      */           
/*  234 */           i5 = MainMemory.getI8(i1);
/*  235 */           if (i5 != 84) {
/*      */             break label973;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  245 */           if (SystemLibrary.strncmp(i1, 21792, 4) != 0) {
/*      */             break label973;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  255 */           i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 10 : 150;
/*      */           
/*      */ 
/*      */           break label10890;
/*      */           
/*      */           label973:
/*      */           
/*  262 */           i6 = i5 == 70 ? 1 : 0;
/*  263 */           if (i6 == 0) {
/*      */             break label1066;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  273 */           if (SystemLibrary.strncmp(i1, 21760, 4) != 0) {
/*      */             break label1066;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  283 */           i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 10 : 150;
/*      */           
/*      */ 
/*      */           break label10890;
/*      */           
/*      */           label1066:
/*      */           
/*  290 */           if (i5 != 66) {
/*      */             break label1147;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  300 */           if (SystemLibrary.strncmp(i1, 21728, 4) != 0) {
/*      */             break label1147;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  310 */           i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 10 : 150;
/*      */           
/*      */ 
/*      */           break label10890;
/*      */           
/*      */           label1147:
/*      */           
/*  317 */           if (i6 == 0) {
/*      */             break label1190;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  327 */           if (SystemLibrary.strncmp(i1, 39392, 7) == 0) {
/*  328 */             k = 10;
/*      */           }
/*      */           else
/*      */           {
/*      */             label1190:
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  338 */             switch (i5)
/*      */             {
/*      */             case 72: 
/*      */               break;
/*      */             case 78: 
/*      */               break label1285;
/*      */               
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*  349 */             if (SystemLibrary.strncmp(i1, 39424, 7) == 0) {
/*  350 */               k = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  360 */               if (i5 != 78) {
/*      */                 break label1346;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */               label1285:
/*      */               
/*      */ 
/*      */ 
/*  370 */               if (SystemLibrary.strncmp(i1, 19264, 4) != 0) {
/*      */                 break label1346;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  380 */               i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 40 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label1346:
/*      */               
/*  387 */               i3 = i5 < 68 ? 1 : 0;
/*  388 */               i4 = i5 == 68 ? 1 : 0;
/*  389 */               if (i4 == 0) {
/*      */                 break label1454;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  399 */               if (SystemLibrary.strncmp(i1, 16768, 3) != 0) {
/*      */                 break label1454;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  409 */               i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 50 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label1454:
/*      */               
/*  416 */               if (i5 != 85) {
/*      */                 break label1535;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  426 */               if (SystemLibrary.strncmp(i1, 21856, 4) != 0) {
/*      */                 break label1535;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  436 */               i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 70 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label1535:
/*      */               
/*  443 */               if (i4 == 0) {
/*      */                 break label1614;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  453 */               if (SystemLibrary.strncmp(i1, 21952, 4) != 0) {
/*      */                 break label1614;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  463 */               i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 80 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label1614:
/*      */               
/*  470 */               i6 = i5 == 83 ? 1 : 0;
/*  471 */               if (i6 == 0) {
/*      */                 break label1707;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  481 */               if (SystemLibrary.strncmp(i1, 21824, 4) != 0) {
/*      */                 break label1707;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  491 */               i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 30 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label1707:
/*      */               
/*  498 */               if (i5 != 90) {
/*      */                 break label1788;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  508 */               if (SystemLibrary.strncmp(i1, 21920, 4) != 0) {
/*      */                 break label1788;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  518 */               i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 30 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label1788:
/*      */               
/*  525 */               if (i5 >= 76)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  535 */                 if (i5 <= 76)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  545 */                   if (SystemLibrary.strncmp(i1, 21984, 4) != 0) {
/*      */                     break label1883;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  555 */                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 60 : 150;
/*      */                   
/*      */                   break label10890;
/*      */                 }
/*      */                 
/*      */                 label1883:
/*      */                 
/*  562 */                 if (i5 != 76) {
/*      */                   break label1964;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  572 */                 if (SystemLibrary.strncmp(i1, 22016, 4) != 0) {
/*      */                   break label1964;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  582 */                 i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 60 : 150;
/*      */                 
/*      */                 break label10890;
/*      */               }
/*      */               
/*      */               label1964:
/*      */               
/*  589 */               if (i3 == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  599 */                 if (i5 <= 68)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  609 */                   if (SystemLibrary.strncmp(i1, 22048, 4) != 0) {
/*      */                     break label2057;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  619 */                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 60 : 150;
/*      */                   
/*      */                   break label10890;
/*      */                 }
/*      */                 
/*      */                 label2057:
/*      */                 
/*  626 */                 if (i4 == 0) {
/*      */                   break label2136;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  636 */                 if (SystemLibrary.strncmp(i1, 22080, 4) != 0) {
/*      */                   break label2136;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  646 */                 i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 60 : 150;
/*      */                 
/*      */                 break label10890;
/*      */               }
/*      */               
/*      */               label2136:
/*      */               
/*  653 */               i3 = i5 < 67 ? 1 : 0;
/*  654 */               if (i3 == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  664 */                 i4 = i5 > 67 ? 1 : 0;
/*  665 */                 if (i4 == 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  675 */                   if (SystemLibrary.strncmp(i1, 22112, 4) != 0) {
/*      */                     break label2255;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  685 */                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                   
/*      */                   break label10890;
/*      */                 }
/*      */                 
/*      */                 label2255:
/*      */                 
/*  692 */                 if (i3 == 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  702 */                   if (i4 == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  712 */                     if (SystemLibrary.strncmp(i1, 16800, 3) != 0) {
/*      */                       break label2347;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  722 */                     i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                     
/*      */                     break label10890;
/*      */                   }
/*      */                   
/*      */                   label2347:
/*      */                   
/*  729 */                   if (i3 == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  739 */                     if (i4 == 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  749 */                       if (SystemLibrary.strncmp(i1, 22304, 4) != 0) {
/*      */                         break label2438;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  759 */                       i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                       
/*      */                       break label10890;
/*      */                     }
/*      */                     
/*      */                     label2438:
/*      */                     
/*  766 */                     if (i3 == 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  776 */                       if (i4 == 0)
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  786 */                         if (SystemLibrary.strncmp(i1, 16832, 3) != 0) {
/*      */                           break label2530;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  796 */                         i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                         
/*      */                         break label10890;
/*      */                       }
/*      */                       
/*      */                       label2530:
/*      */                       
/*  803 */                       if (i3 == 0)
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  813 */                         if (i4 == 0)
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  823 */                           if (SystemLibrary.strncmp(i1, 22176, 4) != 0) {
/*      */                             break label2621;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  833 */                           i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                           
/*      */                           break label10890;
/*      */                         }
/*      */                         
/*      */                         label2621:
/*      */                         
/*  840 */                         if (i3 == 0)
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  850 */                           if (i4 == 0)
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  860 */                             if (SystemLibrary.strncmp(i1, 16864, 3) != 0) {
/*      */                               break label2713;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  870 */                             i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                             
/*      */                             break label10890;
/*      */                           }
/*      */                           
/*      */                           label2713:
/*      */                           
/*  877 */                           if (i3 == 0)
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  887 */                             if (i4 == 0)
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  897 */                               if (SystemLibrary.strncmp(i1, 22144, 4) != 0) {
/*      */                                 break label2804;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  907 */                               i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                               
/*      */                               break label10890;
/*      */                             }
/*      */                             
/*      */                             label2804:
/*      */                             
/*  914 */                             if (i3 == 0)
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  924 */                               if (i4 == 0)
/*      */                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  934 */                                 if (SystemLibrary.strncmp(i1, 16896, 3) != 0) {
/*      */                                   break label2896;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  944 */                                 i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                                 
/*      */                                 break label10890;
/*      */                               }
/*      */                               
/*      */                               label2896:
/*      */                               
/*  951 */                               if (i3 == 0)
/*      */                               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  961 */                                 if (i4 == 0)
/*      */                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  971 */                                   if (SystemLibrary.strncmp(i1, 22272, 4) != 0) {
/*      */                                     break label2987;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  981 */                                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                   
/*      */                                   break label10890;
/*      */                                 }
/*      */                                 
/*      */                                 label2987:
/*      */                                 
/*  988 */                                 if (i3 == 0)
/*      */                                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  998 */                                   if (i4 == 0)
/*      */                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1008 */                                     if (SystemLibrary.strncmp(i1, 22208, 4) != 0) {
/*      */                                       break label3078;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1018 */                                     i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                     
/*      */                                     break label10890;
/*      */                                   }
/*      */                                   
/*      */                                   label3078:
/*      */                                   
/* 1025 */                                   if (i3 == 0)
/*      */                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1035 */                                     if (i4 == 0)
/*      */                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1045 */                                       if (SystemLibrary.strncmp(i1, 16928, 3) != 0) {
/*      */                                         break label3170;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1055 */                                       i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                                       
/*      */                                       break label10890;
/*      */                                     }
/*      */                                     
/*      */                                     label3170:
/*      */                                     
/* 1062 */                                     if (i3 == 0)
/*      */                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1072 */                                       if (i4 == 0)
/*      */                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1082 */                                         if (SystemLibrary.strncmp(i1, 16960, 3) != 0) {
/*      */                                           break label3262;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1092 */                                         i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                                         
/*      */                                         break label10890;
/*      */                                       }
/*      */                                       
/*      */                                       label3262:
/*      */                                       
/* 1099 */                                       switch (i5) {
/*      */                                       case 67: 
/*      */                                         break;
/*      */                                       case 87: 
/*      */                                         break label3488;
/*      */                                         break;
/*      */                                       case 80: 
/*      */                                         break label3653;
/*      */                                         break;
/*      */                                       case 86: 
/*      */                                         break label3616;
/*      */                                         break;
/*      */                                       }
/* 1112 */                                       if (SystemLibrary.strncmp(i1, 16992, 3) != 0) {
/*      */                                         break label3406;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1122 */                                       i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                                       break label10890;
/*      */                                     }
/*      */                                   }
/*      */                                 }
/*      */                               } } } } } } } } }
/*      */               label3406:
/* 1129 */               switch (i5) {
/*      */               case 87: 
/*      */                 break;
/*      */               case 67: 
/*      */                 break label3690;
/*      */                 break;
/*      */               case 80: 
/*      */                 break label3653;
/*      */                 break;
/*      */               case 86: 
/*      */                 break label3616;
/*      */                 break; }
/*      */               label3488:
/* 1142 */               if (SystemLibrary.strncmp(i1, 17024, 3) != 0) {
/*      */                 break label3550;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1152 */               i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label3550:
/*      */               
/* 1159 */               switch (i5)
/*      */               {
/*      */               case 67: 
/*      */                 break label3690;
/*      */                 break;
/*      */               case 80: 
/*      */                 break label3653;
/*      */                 break;
/*      */               case 86: 
/*      */                 break;
/*      */               }
/*      */               label3616:
/* 1171 */               i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label3653:
/*      */               
/* 1178 */               i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label3690:
/*      */               
/* 1185 */               i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */               
/*      */ 
/*      */ 
/*      */               break label10890;
/*      */               
/*      */ 
/* 1192 */               if (i6 == 0) {
/*      */                 break label10881;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1202 */               i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label3782:
/*      */               
/* 1209 */               if (MainMemory.getI8(i1) != 73) {
/*      */                 break label10881;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1219 */               i = SystemLibrary.strncmp(i1, 39360, 7) == 0 ? 10 : 150;
/*      */               
/*      */ 
/*      */               break label10890;
/*      */               
/*      */               label3836:
/*      */               
/* 1226 */               i5 = MainMemory.getI8(i1);
/* 1227 */               i6 = i5 > 64 ? 1 : 0;
/* 1228 */               if (i6 == 0) {
/*      */                 break label10881;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1238 */               i3 = i5 < 66 ? 1 : 0;
/* 1239 */               if (i3 == 0) {
/*      */                 break label3932;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1249 */               if (SystemLibrary.strncmp(i1, 39328, 7) == 0) {
/* 1250 */                 k = 120;
/*      */               }
/*      */               else
/*      */               {
/*      */                 label3932:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1260 */                 if (i6 == 0) {
/*      */                   break label10881;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1270 */                 if (i3 == 0) {
/*      */                   break label3994;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1280 */                 if (SystemLibrary.strncmp(i1, 31616, 6) == 0) {
/* 1281 */                   k = 120;
/*      */                 }
/*      */                 else
/*      */                 {
/*      */                   label3994:
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1291 */                   if (i5 != 65) {
/*      */                     break label10881;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1301 */                   if (SystemLibrary.strncmp(i1, 16736, 3) != 0) {
/*      */                     break label10881;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1311 */                   i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 120 : 150;
/*      */                   
/*      */ 
/*      */                   break label10890;
/*      */                   
/*      */                   label4076:
/*      */                   
/* 1318 */                   i5 = MainMemory.getI8(i1);
/* 1319 */                   switch (i5)
/*      */                   {
/*      */                   case 67: 
/*      */                     break;
/*      */                   case 86: 
/*      */                     break label4277;
/*      */                     break;
/*      */                   case 83: 
/*      */                     break label4240;
/*      */                     break;
/*      */                   }
/*      */                   
/* 1331 */                   if (SystemLibrary.strncmp(i1, 39136, 7) == 0) {
/* 1332 */                     k = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/* 1342 */                     switch (i5)
/*      */                     {
/*      */                     case 67: 
/*      */                       break label4314;
/*      */                       break;
/*      */                     case 86: 
/*      */                       break label4277;
/*      */                       break;
/*      */                     case 83: 
/*      */                       break;
/*      */                     }
/*      */                     label4240:
/* 1354 */                     i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */                     
/*      */ 
/*      */                     break label10890;
/*      */                     
/*      */                     label4277:
/*      */                     
/* 1361 */                     i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */                     
/*      */ 
/*      */                     break label10890;
/*      */                     
/*      */                     label4314:
/*      */                     
/* 1368 */                     i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */                     
/*      */ 
/*      */                     break label10890;
/*      */                     
/*      */                     label4351:
/*      */                     
/* 1375 */                     if (MainMemory.getI8(i1) != 65) {
/*      */                       break label10881;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1385 */                     if (SystemLibrary.strncmp(i1, 19872, 4) != 0) {
/*      */                       break label10881;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1395 */                     i5 = MainMemory.getI8(i2);
/* 1396 */                     i = (MathUtils.ult((byte)(i5 + -48), (byte)10)) || (i5 == 32) ? 10 : 150;
/*      */                     
/*      */ 
/*      */                     break label10890;
/*      */                     
/*      */                     label4446:
/*      */                     
/* 1403 */                     i5 = MainMemory.getI8(i1);
/* 1404 */                     if (i5 <= 73) {
/*      */                       break label10881;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1414 */                     if (i5 >= 75) {
/*      */                       break label4518;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1424 */                     if (SystemLibrary.strncmp(i1, 39296, 7) == 0) {
/* 1425 */                       k = 120;
/*      */                     }
/*      */                     else
/*      */                     {
/*      */                       label4518:
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1435 */                       if (i5 != 74) {
/*      */                         break label10881;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1445 */                       if (SystemLibrary.strncmp(i1, 19840, 4) != 0) {
/*      */                         break label10881;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1455 */                       i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 120 : 150;
/*      */                       
/*      */ 
/*      */                       break label10890;
/*      */                       
/*      */                       label4599:
/*      */                       
/* 1462 */                       i5 = MainMemory.getI8(i1);
/* 1463 */                       i6 = i5 == 79 ? 1 : 0;
/* 1464 */                       if (i6 == 0) {
/*      */                         break label4664;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1474 */                       if (SystemLibrary.strncmp(i1, 31552, 6) == 0) {
/* 1475 */                         k = 110;
/*      */                       }
/*      */                       else
/*      */                       {
/*      */                         label4664:
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1485 */                         i3 = i5 == 65 ? 1 : 0;
/* 1486 */                         if (i3 == 0) {
/*      */                           break label4722;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1496 */                         if (SystemLibrary.strncmp(i1, 31584, 6) == 0) {
/* 1497 */                           k = 110;
/*      */                         }
/*      */                         else
/*      */                         {
/*      */                           label4722:
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1507 */                           if (i6 == 0) {
/*      */                             break label4802;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1517 */                           if (SystemLibrary.strncmp(i1, 16672, 3) != 0) {
/*      */                             break label4802;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1527 */                           i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                           
/*      */ 
/*      */                           break label10890;
/*      */                           
/*      */                           label4802:
/*      */                           
/* 1534 */                           if (i3 == 0) {
/*      */                             break label10881;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1544 */                           if (SystemLibrary.strncmp(i1, 16704, 3) != 0) {
/*      */                             break label10881;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1554 */                           i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                           
/*      */ 
/*      */                           break label10890;
/*      */                           
/*      */                           label4882:
/*      */                           
/* 1561 */                           i5 = MainMemory.getI8(i1);
/* 1562 */                           i6 = i5 > 67 ? 1 : 0;
/* 1563 */                           if (i6 == 0) {
/*      */                             break label5113;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1573 */                           i3 = i5 < 69 ? 1 : 0;
/* 1574 */                           if (i3 == 0) {
/*      */                             break label4978;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1584 */                           if (SystemLibrary.strncmp(i1, 39200, 7) == 0) {
/* 1585 */                             k = 90;
/*      */                           }
/*      */                           else
/*      */                           {
/*      */                             label4978:
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1595 */                             if (i6 == 0) {
/*      */                               break label5113;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1605 */                             if (i3 == 0) {
/*      */                               break label5039;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1615 */                             if (SystemLibrary.strncmp(i1, 39232, 7) == 0) {
/* 1616 */                               k = 90;
/*      */                             }
/*      */                             else
/*      */                             {
/*      */                               label5039:
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1626 */                               switch (i5)
/*      */                               {
/*      */                               case 68: 
/*      */                                 break;
/*      */                               case 73: 
/*      */                                 break label5133;
/*      */                                 
/*      */                                 break;
/*      */                               }
/*      */                               
/*      */                               
/* 1637 */                               if (SystemLibrary.strncmp(i1, 39264, 7) == 0) {
/* 1638 */                                 k = 90;
/*      */                               }
/*      */                               else
/*      */                               {
/*      */                                 label5113:
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1648 */                                 if (i5 != 73) {
/*      */                                   break label10881;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */                                 label5133:
/*      */                                 
/*      */ 
/*      */ 
/* 1658 */                                 if (SystemLibrary.strncmp(i1, 31520, 6) != 0) {
/*      */                                   break label10881;
/*      */                                 }
/*      */                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1668 */                                 i = MainMemory.getI8(j + 7) == 32 ? 130 : 150;
/*      */                                 
/*      */ 
/*      */                                 break label10890;
/*      */                                 
/*      */                                 label5191:
/*      */                                 
/* 1675 */                                 i5 = MainMemory.getI8(i1);
/* 1676 */                                 switch (i5)
/*      */                                 {
/*      */                                 case 67: 
/*      */                                   break;
/*      */                                 case 82: 
/*      */                                   break label5293;
/*      */                                   
/*      */                                   break;
/*      */                                 }
/*      */                                 
/*      */                                 
/* 1687 */                                 if (SystemLibrary.strncmp(i1, 39136, 7) == 0) {
/* 1688 */                                   k = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */                                 }
/*      */                                 else
/*      */                                 {
/*      */ 
/*      */ 
/*      */ 
/* 1698 */                                   if (i5 != 82) {
/*      */                                     break label10881;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */                                   label5293:
/*      */                                   
/*      */ 
/*      */ 
/* 1708 */                                   i = SystemLibrary.strncmp(i1, 39168, 7) == 0 ? 10 : 150;
/*      */                                   
/*      */ 
/*      */                                   break label10890;
/*      */                                   
/*      */                                   label5324:
/*      */                                   
/* 1715 */                                   i5 = MainMemory.getI8(i1);
/* 1716 */                                   i6 = i5 > 87 ? 1 : 0;
/* 1717 */                                   i3 = i5 == 88 ? 1 : 0;
/* 1718 */                                   if (i3 == 0) {
/*      */                                     break label5402;
/*      */                                   }
/*      */                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1728 */                                   if (SystemLibrary.strncmp(i1, 38944, 7) == 0) {
/* 1729 */                                     k = 10;
/*      */                                   }
/*      */                                   else
/*      */                                   {
/*      */                                     label5402:
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1739 */                                     if (i5 != 78) {
/*      */                                       break label5447;
/*      */                                     }
/*      */                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1749 */                                     if (SystemLibrary.strncmp(i1, 38976, 7) == 0) {
/* 1750 */                                       k = 10;
/*      */                                     }
/*      */                                     else
/*      */                                     {
/*      */                                       label5447:
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1760 */                                       if (i6 == 0) {
/*      */                                         break label5690;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1770 */                                       i4 = i5 < 89 ? 1 : 0;
/* 1771 */                                       if (i4 == 0) {
/*      */                                         break label5586;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1781 */                                       if (SystemLibrary.strncmp(i1, 39008, 7) != 0) {
/*      */                                         break label5586;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1791 */                                       if (MainMemory.getI8(paramInt) != 69) {
/*      */                                         break label5573;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1801 */                                       i = SystemLibrary.strncmp(paramInt, 74208, 28) == 0 ? 20 : 90;
/*      */                                       
/*      */ 
/*      */                                       break label10890;
/*      */                                       
/*      */                                       label5573:
/*      */                                       
/* 1808 */                                       i = 90;
/*      */                                       
/*      */ 
/*      */                                       break label10890;
/*      */                                       
/*      */                                       label5586:
/*      */                                       
/* 1815 */                                       if (i6 == 0) {
/*      */                                         break label5690;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1825 */                                       if (i4 == 0) {
/*      */                                         break label5647;
/*      */                                       }
/*      */                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1835 */                                       if (SystemLibrary.strncmp(i1, 39040, 7) == 0) {
/* 1836 */                                         k = 90;
/*      */                                       }
/*      */                                       else
/*      */                                       {
/*      */                                         label5647:
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1846 */                                         if (i3 == 0) {
/*      */                                           break label5690;
/*      */                                         }
/*      */                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1856 */                                         if (SystemLibrary.strncmp(i1, 39072, 7) == 0) {
/* 1857 */                                           k = 90;
/*      */                                         }
/*      */                                         else
/*      */                                         {
/*      */                                           label5690:
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1867 */                                           if (i5 <= 80) {
/*      */                                             break label5860;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1877 */                                           if (i5 >= 82) {
/*      */                                             break label5756;
/*      */                                           }
/*      */                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1887 */                                           if (SystemLibrary.strncmp(i1, 31488, 6) == 0) {
/* 1888 */                                             k = 120;
/*      */                                           }
/*      */                                           else
/*      */                                           {
/*      */                                             label5756:
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1898 */                                             switch (i5)
/*      */                                             {
/*      */                                             case 81: 
/*      */                                               break;
/*      */                                             case 80: 
/*      */                                               break label5880;
/*      */                                               
/*      */                                               break;
/*      */                                             }
/*      */                                             
/*      */                                             
/* 1909 */                                             if (SystemLibrary.strncmp(i1, 16640, 3) != 0) {
/*      */                                               break label5860;
/*      */                                             }
/*      */                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1919 */                                             if (MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10)) {
/* 1920 */                                               k = 120;
/*      */                                             }
/*      */                                             else
/*      */                                             {
/*      */                                               label5860:
/*      */                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1930 */                                               if (i5 != 80) {
/*      */                                                 break label10881;
/*      */                                               }
/*      */                                               
/*      */ 
/*      */ 
/*      */                                               label5880:
/*      */                                               
/*      */ 
/*      */ 
/* 1940 */                                               i = SystemLibrary.strncmp(i1, 39104, 7) == 0 ? 120 : 150;
/*      */                                               
/*      */ 
/*      */                                               break label10890;
/*      */                                               
/*      */                                               label5911:
/*      */                                               
/* 1947 */                                               i5 = MainMemory.getI8(i1);
/* 1948 */                                               i6 = i5 > 64 ? 1 : 0;
/* 1949 */                                               if (i6 == 0) {
/*      */                                                 break label10881;
/*      */                                               }
/*      */                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1959 */                                               i3 = i5 < 66 ? 1 : 0;
/* 1960 */                                               if (i3 == 0) {
/*      */                                                 break label6007;
/*      */                                               }
/*      */                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1970 */                                               if (SystemLibrary.strncmp(i1, 38816, 7) == 0) {
/* 1971 */                                                 k = 100;
/*      */                                               }
/*      */                                               else
/*      */                                               {
/*      */                                                 label6007:
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1981 */                                                 if (i6 == 0) {
/*      */                                                   break label10881;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1991 */                                                 if (i3 == 0) {
/*      */                                                   break label6068;
/*      */                                                 }
/*      */                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2001 */                                                 if (SystemLibrary.strncmp(i1, 38848, 7) == 0) {
/* 2002 */                                                   k = 60;
/*      */                                                 }
/*      */                                                 else
/*      */                                                 {
/*      */                                                   label6068:
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2012 */                                                   if (i6 == 0) {
/*      */                                                     break label10881;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2022 */                                                   if (i3 == 0) {
/*      */                                                     break label6129;
/*      */                                                   }
/*      */                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2032 */                                                   if (SystemLibrary.strncmp(i1, 38880, 7) == 0) {
/* 2033 */                                                     k = 60;
/*      */                                                   }
/*      */                                                   else
/*      */                                                   {
/*      */                                                     label6129:
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2043 */                                                     if (i5 != 65) {
/*      */                                                       break label10881;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2053 */                                                     i = SystemLibrary.strncmp(i1, 38912, 7) == 0 ? 120 : 150;
/*      */                                                     
/*      */ 
/*      */                                                     break label10890;
/*      */                                                     
/*      */                                                     label6180:
/*      */                                                     
/* 2060 */                                                     i5 = MainMemory.getI8(i1);
/* 2061 */                                                     i6 = i5 == 79 ? 1 : 0;
/* 2062 */                                                     if (i6 == 0) {
/*      */                                                       break label6627;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2072 */                                                     if (SystemLibrary.strncmp(i1, 31456, 6) != 0) {
/*      */                                                       break label6627;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2082 */                                                     i5 = MainMemory.getI8(paramInt);
/* 2083 */                                                     i6 = i5 > 66 ? 1 : 0;
/* 2084 */                                                     if (i6 == 0) {
/*      */                                                       break label6594;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2094 */                                                     i3 = i5 < 68 ? 1 : 0;
/* 2095 */                                                     if (i3 == 0) {
/*      */                                                       break label6348;
/*      */                                                     }
/*      */                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2105 */                                                     if (SystemLibrary.strncmp(paramInt, 110432, 47) == 0) {
/* 2106 */                                                       k = 10;
/*      */                                                     }
/*      */                                                     else
/*      */                                                     {
/*      */                                                       label6348:
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2116 */                                                       if (i6 == 0) {
/*      */                                                         break label6594;
/*      */                                                       }
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2126 */                                                       if (i3 == 0) {
/*      */                                                         break label6414;
/*      */                                                       }
/*      */                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2136 */                                                       if (SystemLibrary.strncmp(paramInt, 108256, 47) == 0) {
/* 2137 */                                                         k = 10;
/*      */                                                       }
/*      */                                                       else
/*      */                                                       {
/*      */                                                         label6414:
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2147 */                                                         if (i6 == 0) {
/*      */                                                           break label6594;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2157 */                                                         if (i3 == 0) {
/*      */                                                           break label6480;
/*      */                                                         }
/*      */                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2167 */                                                         if (SystemLibrary.strncmp(paramInt, 108320, 47) == 0) {
/* 2168 */                                                           k = 10;
/*      */                                                         }
/*      */                                                         else
/*      */                                                         {
/*      */                                                           label6480:
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2178 */                                                           if (i6 == 0) {
/*      */                                                             break label6594;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2188 */                                                           if (i3 == 0) {
/*      */                                                             break label6546;
/*      */                                                           }
/*      */                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2198 */                                                           if (SystemLibrary.strncmp(paramInt, 108384, 47) == 0) {
/* 2199 */                                                             k = 10;
/*      */                                                           }
/*      */                                                           else
/*      */                                                           {
/*      */                                                             label6546:
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2209 */                                                             if (i5 != 67) {
/*      */                                                               break label6594;
/*      */                                                             }
/*      */                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2219 */                                                             if (SystemLibrary.strncmp(paramInt, 108448, 47) == 0) {
/* 2220 */                                                               k = 10;
/*      */                                                             }
/*      */                                                             else
/*      */                                                             {
/*      */                                                               label6594:
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2230 */                                                               i = MainMemory.getI8(j + 7) == 32 ? 130 : 150;
/*      */                                                               
/*      */ 
/*      */                                                               break label10890;
/*      */                                                               
/*      */                                                               label6627:
/*      */                                                               
/* 2237 */                                                               if (i5 != 72) {
/*      */                                                                 break label6676;
/*      */                                                               }
/*      */                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2247 */                                                               if (SystemLibrary.strncmp(i1, 38752, 7) == 0) {
/* 2248 */                                                                 k = 100;
/*      */                                                               }
/*      */                                                               else
/*      */                                                               {
/*      */                                                                 label6676:
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2258 */                                                                 if (i6 == 0) {
/*      */                                                                   break label6724;
/*      */                                                                 }
/*      */                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2268 */                                                                 if (SystemLibrary.strncmp(i1, 38784, 7) == 0) {
/* 2269 */                                                                   k = 140;
/*      */                                                                 }
/*      */                                                                 else
/*      */                                                                 {
/*      */                                                                   label6724:
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2279 */                                                                   switch (i5)
/*      */                                                                   {
/*      */                                                                   case 84: 
/*      */                                                                     break;
/*      */                                                                   case 85: 
/*      */                                                                     break label6864;
/*      */                                                                     
/*      */                                                                     break;
/*      */                                                                   }
/*      */                                                                   
/*      */                                                                   
/* 2290 */                                                                   if (SystemLibrary.strncmp(i1, 21792, 4) != 0) {
/*      */                                                                     break label6842;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2300 */                                                                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                   
/*      */ 
/*      */                                                                   break label10890;
/*      */                                                                   
/*      */                                                                   label6842:
/*      */                                                                   
/* 2307 */                                                                   if (i5 != 85) {
/*      */                                                                     break label6928;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */                                                                   label6864:
/*      */                                                                   
/*      */ 
/*      */ 
/* 2317 */                                                                   if (SystemLibrary.strncmp(i1, 21856, 4) != 0) {
/*      */                                                                     break label6928;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2327 */                                                                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                   
/*      */ 
/*      */                                                                   break label10890;
/*      */                                                                   
/*      */                                                                   label6928:
/*      */                                                                   
/* 2334 */                                                                   i6 = i5 < 82 ? 1 : 0;
/* 2335 */                                                                   if (i6 == 0)
/*      */                                                                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2345 */                                                                     i3 = i5 > 82 ? 1 : 0;
/* 2346 */                                                                     if (i3 == 0)
/*      */                                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2356 */                                                                       if (SystemLibrary.strncmp(i1, 19648, 4) != 0) {
/*      */                                                                         break label7054;
/*      */                                                                       }
/*      */                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2366 */                                                                       i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                       
/*      */                                                                       break label10890;
/*      */                                                                     }
/*      */                                                                     
/*      */                                                                     label7054:
/*      */                                                                     
/* 2373 */                                                                     if (i6 == 0)
/*      */                                                                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2383 */                                                                       if (i3 == 0)
/*      */                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2393 */                                                                         if (SystemLibrary.strncmp(i1, 19680, 4) != 0) {
/*      */                                                                           break label7152;
/*      */                                                                         }
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2403 */                                                                         i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                         
/*      */                                                                         break label10890;
/*      */                                                                       }
/*      */                                                                       
/*      */                                                                       label7152:
/*      */                                                                       
/* 2410 */                                                                       if (i6 == 0)
/*      */                                                                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2420 */                                                                         if (i3 == 0)
/*      */                                                                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2430 */                                                                           if (SystemLibrary.strncmp(i1, 19712, 4) != 0) {
/*      */                                                                             break label7250;
/*      */                                                                           }
/*      */                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2440 */                                                                           i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                           
/*      */                                                                           break label10890;
/*      */                                                                         }
/*      */                                                                         
/*      */                                                                         label7250:
/*      */                                                                         
/* 2447 */                                                                         switch (i5)
/*      */                                                                         {
/*      */                                                                         case 82: 
/*      */                                                                           break;
/*      */                                                                         case 83: 
/*      */                                                                           break label7433;
/*      */                                                                           break;
/*      */                                                                         case 68: 
/*      */                                                                           break label7518;
/*      */                                                                           break;
/*      */                                                                         }
/*      */                                                                         
/* 2459 */                                                                         if (SystemLibrary.strncmp(i1, 19744, 4) != 0) {
/*      */                                                                           break label7382;
/*      */                                                                         }
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2469 */                                                                         i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                         
/*      */                                                                         break label10890;
/*      */                                                                       }
/*      */                                                                     }
/*      */                                                                   }
/*      */                                                                   label7382:
/* 2476 */                                                                   switch (i5)
/*      */                                                                   {
/*      */                                                                   case 83: 
/*      */                                                                     break;
/*      */                                                                   case 68: 
/*      */                                                                     break label7518;
/*      */                                                                     
/*      */                                                                     break;
/*      */                                                                   }
/*      */                                                                   
/*      */                                                                   label7433:
/* 2487 */                                                                   if (SystemLibrary.strncmp(i1, 19776, 4) != 0) {
/*      */                                                                     break label7497;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2497 */                                                                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                   
/*      */ 
/*      */                                                                   break label10890;
/*      */                                                                   
/*      */                                                                   label7497:
/*      */                                                                   
/* 2504 */                                                                   if (i5 != 68) {
/*      */                                                                     break label10881;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */                                                                   label7518:
/*      */                                                                   
/*      */ 
/*      */ 
/* 2514 */                                                                   if (SystemLibrary.strncmp(i1, 19808, 4) != 0) {
/*      */                                                                     break label7582;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2524 */                                                                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                   
/*      */ 
/*      */                                                                   break label10890;
/*      */                                                                   
/*      */                                                                   label7582:
/*      */                                                                   
/* 2531 */                                                                   i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */                                                                   
/*      */ 
/*      */                                                                   break label10890;
/*      */                                                                   
/*      */                                                                   label7620:
/*      */                                                                   
/* 2538 */                                                                   i5 = MainMemory.getI8(i1);
/* 2539 */                                                                   if (i5 != 73) {
/*      */                                                                     break label7675;
/*      */                                                                   }
/*      */                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2549 */                                                                   if (SystemLibrary.strncmp(i1, 38624, 7) == 0) {
/* 2550 */                                                                     k = 10;
/*      */                                                                   }
/*      */                                                                   else
/*      */                                                                   {
/*      */                                                                     label7675:
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2560 */                                                                     if (i5 <= 75) {
/*      */                                                                       break label7858;
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2570 */                                                                     if (i5 >= 77) {
/*      */                                                                       break label7746;
/*      */                                                                     }
/*      */                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2580 */                                                                     if (SystemLibrary.strncmp(i1, 38656, 7) == 0) {
/* 2581 */                                                                       k = 10;
/*      */                                                                     }
/*      */                                                                     else
/*      */                                                                     {
/*      */                                                                       label7746:
/*      */                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2591 */                                                                       switch (i5) {
/*      */                                                                       case 76: 
/*      */                                                                         break;
/*      */                                                                       case 83: 
/*      */                                                                         break label7926;
/*      */                                                                         break;
/*      */                                                                       case 90: 
/*      */                                                                         break label8005;
/*      */                                                                         break;
/*      */                                                                       case 85: 
/*      */                                                                         break label8053;
/*      */                                                                         break;
/*      */                                                                       }
/* 2604 */                                                                       if (SystemLibrary.strncmp(i1, 38688, 7) == 0) {
/* 2605 */                                                                         k = 40;
/*      */                                                                       }
/*      */                                                                       else
/*      */                                                                       {
/*      */                                                                         label7858:
/*      */                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2615 */                                                                         switch (i5)
/*      */                                                                         {
/*      */                                                                         case 83: 
/*      */                                                                           break;
/*      */                                                                         case 90: 
/*      */                                                                           break label8005;
/*      */                                                                           break;
/*      */                                                                         case 85: 
/*      */                                                                           break label8053;
/*      */                                                                           break;
/*      */                                                                         }
/*      */                                                                         label7926:
/* 2627 */                                                                         if (SystemLibrary.strncmp(i1, 38336, 7) == 0) {
/* 2628 */                                                                           k = 30;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                         }
/*      */                                                                         else
/*      */                                                                         {
/*      */ 
/*      */ 
/*      */ 
/* 2638 */                                                                           switch (i5)
/*      */                                                                           {
/*      */                                                                           case 90: 
/*      */                                                                             break;
/*      */                                                                           case 85: 
/*      */                                                                             break label8053;
/*      */                                                                             
/*      */                                                                             break;
/*      */                                                                           }
/*      */                                                                           
/*      */                                                                           label8005:
/* 2649 */                                                                           if (SystemLibrary.strncmp(i1, 38368, 7) == 0) {
/* 2650 */                                                                             k = 30;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                           }
/*      */                                                                           else
/*      */                                                                           {
/*      */ 
/*      */ 
/*      */ 
/* 2660 */                                                                             if (i5 != 85) {
/*      */                                                                               break label10881;
/*      */                                                                             }
/*      */                                                                             
/*      */ 
/*      */ 
/*      */                                                                             label8053:
/*      */                                                                             
/*      */ 
/*      */ 
/* 2670 */                                                                             i = SystemLibrary.strncmp(i1, 38720, 7) == 0 ? 70 : 150;
/*      */                                                                             
/*      */ 
/*      */                                                                             break label10890;
/*      */                                                                             
/*      */                                                                             label8086:
/*      */                                                                             
/* 2677 */                                                                             i5 = MainMemory.getI8(i1);
/* 2678 */                                                                             switch (i5)
/*      */                                                                             {
/*      */                                                                             case 73: 
/*      */                                                                               break;
/*      */                                                                             case 67: 
/*      */                                                                               break label8195;
/*      */                                                                               
/*      */                                                                               break;
/*      */                                                                             }
/*      */                                                                             
/*      */                                                                             
/* 2689 */                                                                             if (SystemLibrary.strncmp(i1, 38240, 7) == 0) {
/* 2690 */                                                                               k = 20;
/*      */ 
/*      */ 
/*      */ 
/*      */                                                                             }
/*      */                                                                             else
/*      */                                                                             {
/*      */ 
/*      */ 
/*      */ 
/* 2700 */                                                                               if (i5 != 67) {
/*      */                                                                                 break label8222;
/*      */                                                                               }
/*      */                                                                               
/*      */ 
/*      */ 
/*      */                                                                               label8195:
/*      */                                                                               
/*      */ 
/*      */ 
/* 2710 */                                                                               if (SystemLibrary.strncmp(i1, 38272, 7) == 0) {
/* 2711 */                                                                                 k = 20;
/*      */                                                                               }
/*      */                                                                               else
/*      */                                                                               {
/*      */                                                                                 label8222:
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2721 */                                                                                 i3 = i5 == 78 ? 1 : 0;
/* 2722 */                                                                                 if (i3 == 0) {
/*      */                                                                                   break label8320;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2732 */                                                                                 if (SystemLibrary.strncmp(i1, 19584, 4) != 0) {
/*      */                                                                                   break label8320;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2742 */                                                                                 i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 20 : 150;
/*      */                                                                                 
/*      */ 
/*      */                                                                                 break label10890;
/*      */                                                                                 
/*      */                                                                                 label8320:
/*      */                                                                                 
/* 2749 */                                                                                 if (i5 != 86) {
/*      */                                                                                   break label8407;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2759 */                                                                                 if (SystemLibrary.strncmp(i1, 16608, 3) != 0) {
/*      */                                                                                   break label8407;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2769 */                                                                                 i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 20 : 150;
/*      */                                                                                 
/*      */ 
/*      */                                                                                 break label10890;
/*      */                                                                                 
/*      */                                                                                 label8407:
/*      */                                                                                 
/* 2776 */                                                                                 i6 = i5 == 84 ? 1 : 0;
/* 2777 */                                                                                 if (i6 == 0) {
/*      */                                                                                   break label8505;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2787 */                                                                                 if (SystemLibrary.strncmp(i1, 19616, 4) != 0) {
/*      */                                                                                   break label8505;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2797 */                                                                                 i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 20 : 150;
/*      */                                                                                 
/*      */ 
/*      */                                                                                 break label10890;
/*      */                                                                                 
/*      */                                                                                 label8505:
/*      */                                                                                 
/* 2804 */                                                                                 i4 = i5 == 66 ? 1 : 0;
/* 2805 */                                                                                 if (i4 == 0) {
/*      */                                                                                   break label8566;
/*      */                                                                                 }
/*      */                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2815 */                                                                                 if (SystemLibrary.strncmp(i1, 38304, 7) == 0) {
/* 2816 */                                                                                   k = 20;
/*      */                                                                                 }
/*      */                                                                                 else
/*      */                                                                                 {
/*      */                                                                                   label8566:
/*      */                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2826 */                                                                                   if (i3 == 0) {
/*      */                                                                                     break label8663;
/*      */                                                                                   }
/*      */                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2836 */                                                                                   if (SystemLibrary.strncmp(i1, 24224, 5) != 0) {
/*      */                                                                                     break label8663;
/*      */                                                                                   }
/*      */                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2846 */                                                                                   i5 = MainMemory.getI8(j + 6);
/* 2847 */                                                                                   i = (MathUtils.ult((byte)(i5 + -48), (byte)10)) || (i5 == 32) ? 20 : 150;
/*      */                                                                                   
/*      */ 
/*      */                                                                                   break label10890;
/*      */                                                                                   
/*      */                                                                                   label8663:
/*      */                                                                                   
/* 2854 */                                                                                   i3 = i5 == 83 ? 1 : 0;
/* 2855 */                                                                                   if (i3 == 0) {
/*      */                                                                                     break label8724;
/*      */                                                                                   }
/*      */                                                                                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2865 */                                                                                   if (SystemLibrary.strncmp(i1, 38336, 7) == 0) {
/* 2866 */                                                                                     k = 20;
/*      */                                                                                   }
/*      */                                                                                   else
/*      */                                                                                   {
/*      */                                                                                     label8724:
/*      */                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2876 */                                                                                     if (i5 != 90) {
/*      */                                                                                       break label8773;
/*      */                                                                                     }
/*      */                                                                                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2886 */                                                                                     if (SystemLibrary.strncmp(i1, 38368, 7) == 0) {
/* 2887 */                                                                                       k = 20;
/*      */                                                                                     }
/*      */                                                                                     else
/*      */                                                                                     {
/*      */                                                                                       label8773:
/*      */                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2897 */                                                                                       if (i4 == 0) {
/*      */                                                                                         break label8820;
/*      */                                                                                       }
/*      */                                                                                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2907 */                                                                                       if (SystemLibrary.strncmp(i1, 38400, 7) == 0) {
/* 2908 */                                                                                         k = 20;
/*      */                                                                                       }
/*      */                                                                                       else
/*      */                                                                                       {
/*      */                                                                                         label8820:
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2918 */                                                                                         if (i3 == 0) {
/*      */                                                                                           break label8867;
/*      */                                                                                         }
/*      */                                                                                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2928 */                                                                                         if (SystemLibrary.strncmp(i1, 38432, 7) == 0) {
/* 2929 */                                                                                           k = 20;
/*      */                                                                                         }
/*      */                                                                                         else
/*      */                                                                                         {
/*      */                                                                                           label8867:
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2939 */                                                                                           if (i6 == 0) {
/*      */                                                                                             break label8913;
/*      */                                                                                           }
/*      */                                                                                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2949 */                                                                                           if (SystemLibrary.strncmp(i1, 38464, 7) == 0) {
/* 2950 */                                                                                             k = 20;
/*      */                                                                                           }
/*      */                                                                                           else
/*      */                                                                                           {
/*      */                                                                                             label8913:
/*      */                                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2960 */                                                                                             if (i5 != 69) {
/*      */                                                                                               break label8962;
/*      */                                                                                             }
/*      */                                                                                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2970 */                                                                                             if (SystemLibrary.strncmp(i1, 38496, 7) == 0) {
/* 2971 */                                                                                               k = 20;
/*      */                                                                                             }
/*      */                                                                                             else
/*      */                                                                                             {
/*      */                                                                                               label8962:
/*      */                                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2981 */                                                                                               if (i4 == 0) {
/*      */                                                                                                 break label9009;
/*      */                                                                                               }
/*      */                                                                                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2991 */                                                                                               if (SystemLibrary.strncmp(i1, 38528, 7) == 0) {
/* 2992 */                                                                                                 k = 20;
/*      */                                                                                               }
/*      */                                                                                               else
/*      */                                                                                               {
/*      */                                                                                                 label9009:
/*      */                                                                                                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3002 */                                                                                                 switch (i5)
/*      */                                                                                                 {
/*      */                                                                                                 case 80: 
/*      */                                                                                                   break;
/*      */                                                                                                 case 71: 
/*      */                                                                                                   break label9125;
/*      */                                                                                                   
/*      */                                                                                                   break;
/*      */                                                                                                 }
/*      */                                                                                                 
/*      */                                                                                                 
/* 3013 */                                                                                                 if (SystemLibrary.strncmp(i1, 38560, 7) == 0)
/* 3014 */                                                                                                   k = 20; else break label9104;
/*      */                                                                                               }
/*      */                                                                                             }
/*      */                                                                                           }
/*      */                                                                                         }
/*      */                                                                                       }
/*      */                                                                                     }
/*      */                                                                                   }
/*      */                                                                                 }
/*      */                                                                               } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } } }
/*      */       label9092:
/* 3025 */       i = k;
/*      */       
/*      */ 
/*      */       break label10890;
/*      */       
/*      */       label9104:
/*      */       
/* 3032 */       if (i5 != 71) {
/*      */         break label10881;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label9125:
/*      */       
/*      */ 
/*      */ 
/* 3042 */       i = SystemLibrary.strncmp(i1, 38592, 7) == 0 ? 20 : 150;
/*      */       
/*      */ 
/*      */ 
/*      */       break label10890;
/*      */       
/*      */ 
/* 3049 */       if (!MathUtils.ult((byte)(i5 + -48), (byte)10)) {
/*      */         break label10881;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3059 */       i5 = MainMemory.getI8(i1);
/* 3060 */       switch (i5)
/*      */       {
/*      */       case 67: 
/*      */         break label9339;
/*      */         break;
/*      */       case 86: 
/*      */         break label9301;
/*      */         break;
/*      */       case 83: 
/*      */         break;
/*      */       }
/*      */       
/* 3072 */       i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */       
/*      */ 
/*      */       break label10890;
/*      */       
/*      */       label9301:
/*      */       
/* 3079 */       i = MathUtils.ult((byte)(MainMemory.getI8(j + 2) + -48), (byte)10) ? 110 : 150;
/*      */       
/*      */ 
/*      */       break label10890;
/*      */       
/*      */       label9339:
/*      */       
/* 3086 */       i6 = i5 < 67 ? 1 : 0;
/* 3087 */       if (i6 == 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3097 */         i3 = i5 > 67 ? 1 : 0;
/* 3098 */         if (i3 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3108 */           if (SystemLibrary.strncmp(i1, 22112, 4) != 0) {
/*      */             break label9465;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3118 */           i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */           
/*      */           break label10890;
/*      */         }
/*      */         
/*      */         label9465:
/*      */         
/* 3125 */         if (i6 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3135 */           if (i3 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3145 */             if (SystemLibrary.strncmp(i1, 16800, 3) != 0) {
/*      */               break label9564;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3155 */             i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */             
/*      */             break label10890;
/*      */           }
/*      */           
/*      */           label9564:
/*      */           
/* 3162 */           if (i6 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3172 */             if (i3 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3182 */               if (SystemLibrary.strncmp(i1, 22304, 4) != 0) {
/*      */                 break label9662;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3192 */               i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */               
/*      */               break label10890;
/*      */             }
/*      */             
/*      */             label9662:
/*      */             
/* 3199 */             if (i6 == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3209 */               if (i3 == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3219 */                 if (SystemLibrary.strncmp(i1, 16832, 3) != 0) {
/*      */                   break label9761;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3229 */                 i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                 
/*      */                 break label10890;
/*      */               }
/*      */               
/*      */               label9761:
/*      */               
/* 3236 */               if (i6 == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3246 */                 if (i3 == 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3256 */                   if (SystemLibrary.strncmp(i1, 22176, 4) != 0) {
/*      */                     break label9859;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3266 */                   i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                   
/*      */                   break label10890;
/*      */                 }
/*      */                 
/*      */                 label9859:
/*      */                 
/* 3273 */                 if (i6 == 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3283 */                   if (i3 == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3293 */                     if (SystemLibrary.strncmp(i1, 16864, 3) != 0) {
/*      */                       break label9958;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3303 */                     i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                     
/*      */                     break label10890;
/*      */                   }
/*      */                   
/*      */                   label9958:
/*      */                   
/* 3310 */                   if (i6 == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3320 */                     if (i3 == 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3330 */                       if (SystemLibrary.strncmp(i1, 22144, 4) != 0) {
/*      */                         break label10056;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3340 */                       i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                       
/*      */                       break label10890;
/*      */                     }
/*      */                     
/*      */                     label10056:
/*      */                     
/* 3347 */                     if (i6 == 0)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3357 */                       if (i3 == 0)
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3367 */                         if (SystemLibrary.strncmp(i1, 16896, 3) != 0) {
/*      */                           break label10155;
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3377 */                         i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                         
/*      */                         break label10890;
/*      */                       }
/*      */                       
/*      */                       label10155:
/*      */                       
/* 3384 */                       if (i6 == 0)
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3394 */                         if (i3 == 0)
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3404 */                           if (SystemLibrary.strncmp(i1, 22272, 4) != 0) {
/*      */                             break label10253;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3414 */                           i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                           
/*      */                           break label10890;
/*      */                         }
/*      */                         
/*      */                         label10253:
/*      */                         
/* 3421 */                         if (i6 == 0)
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3431 */                           if (i3 == 0)
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3441 */                             if (SystemLibrary.strncmp(i1, 22208, 4) != 0) {
/*      */                               break label10351;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3451 */                             i = MathUtils.ult((byte)(MainMemory.getI8(i2) + -48), (byte)10) ? 110 : 150;
/*      */                             
/*      */                             break label10890;
/*      */                           }
/*      */                           
/*      */                           label10351:
/*      */                           
/* 3458 */                           if (i6 == 0)
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3468 */                             if (i3 == 0)
/*      */                             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3478 */                               if (SystemLibrary.strncmp(i1, 16928, 3) != 0) {
/*      */                                 break label10450;
/*      */                               }
/*      */                               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3488 */                               i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                               
/*      */                               break label10890;
/*      */                             }
/*      */                             
/*      */                             label10450:
/*      */                             
/* 3495 */                             if (i5 != 67) {
/*      */                               break label10881;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3505 */                             if (SystemLibrary.strncmp(i1, 16960, 3) != 0) {
/*      */                               break label10536;
/*      */                             }
/*      */                             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3515 */                             i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */                             break label10890;
/*      */                           }
/*      */                         }
/*      */                       }
/*      */                     } } } } } } } }
/*      */       label10536:
/* 3522 */       if (i5 != 67) {
/*      */         break label10881;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3532 */       if (SystemLibrary.strncmp(i1, 16992, 3) != 0) {
/*      */         break label10881;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3542 */       i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */       
/*      */ 
/*      */ 
/*      */       break label10890;
/*      */       
/*      */ 
/* 3549 */       if (!MathUtils.ult((byte)(i5 + -48), (byte)10)) {
/*      */         break label10881;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3559 */       i5 = MainMemory.getI8(j + 2);
/* 3560 */       switch (i5)
/*      */       {
/*      */       case 80: 
/*      */         break label10729;
/*      */         
/*      */         break;
/*      */       case 67: 
/*      */         break;
/*      */       }
/*      */       
/*      */       
/* 3571 */       i5 = MainMemory.getI8(j + 3);
/*      */       
/*      */       break label10822;
/*      */       
/*      */       label10729:
/*      */       
/* 3577 */       i7 = MainMemory.getI8(j + 3);
/* 3578 */       if (i7 != 67) {
/*      */         break label10797;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3588 */       i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */       
/*      */ 
/*      */       break label10890;
/*      */       
/*      */       label10797:
/*      */       
/* 3595 */       if (i5 == 67) {
/* 3596 */         i5 = i7;
/*      */       } else {
/*      */         break label10881;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */       label10822:
/*      */       
/*      */ 
/*      */ 
/* 3607 */       if (i5 != 68) {
/*      */         break label10881;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 3617 */       i = MathUtils.ult((byte)(MainMemory.getI8(j + 4) + -48), (byte)10) ? 110 : 150;
/*      */       
/*      */ 
/*      */       break label10890;
/*      */       
/*      */       label10881:
/*      */       
/* 3624 */       i = 150;
/*      */       
/*      */ 
/*      */       label10890:
/*      */       
/*      */ 
/* 3630 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 3635 */       MainMemory.dealloc_generated(i8);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgkcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */