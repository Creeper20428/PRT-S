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
/*      */ 
/*      */ public final class F273321
/*      */   extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 3095;
/*   16 */   public static final Function _instance = new F273321();
/*   17 */   public final Function resolve() { return _instance; }
/*      */   
/*   19 */   public F273321() { super("F273321", 4, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*   40 */     int n = call(i, j, k, m);
/*   41 */     paramFrame.setI32(paramInt1, n);
/*   42 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*   47 */     int i = 0;
/*      */     
/*   49 */     int j = 0;
/*   50 */     int k = 0;
/*   51 */     int m = 0;
/*   52 */     int n = 0;
/*   53 */     int i1 = 0;
/*   54 */     int i2 = 0;
/*   55 */     int i3 = 0;
/*   56 */     int i4 = 0;
/*   57 */     int i5 = 0;
/*   58 */     int i6 = 0;
/*   59 */     int i7 = 0;
/*   60 */     int i8 = 0;
/*   61 */     int i9 = 0;
/*   62 */     int i10 = 0;
/*   63 */     int i11 = 0;
/*   64 */     int i12 = 0;
/*   65 */     int i13 = 0;
/*   66 */     int i14 = 0;
/*   67 */     int i15 = 0;
/*      */     
/*      */ 
/*   70 */     int i16 = MainMemory.alloc_base_line();
/*      */     
/*      */     try
/*      */     {
/*   74 */       j = MainMemory.alloc(1200);
/*   75 */       k = MainMemory.alloc(4);
/*   76 */       m = MainMemory.alloc(1200);
/*   77 */       n = MainMemory.alloc(1200);
/*   78 */       i1 = MainMemory.alloc(1200);
/*   79 */       i2 = MainMemory.alloc(100);
/*   80 */       i3 = MainMemory.alloc(100);
/*   81 */       i4 = MainMemory.alloc(1200);
/*   82 */       i5 = MainMemory.alloc(100);
/*   83 */       i6 = MainMemory.alloc(1200);
/*   84 */       i7 = MainMemory.alloc(4);
/*   85 */       if (!MathUtils.ugt(SystemLibrary.strlen(paramInt1), 1193)) {
/*      */         break label192;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   95 */       ffxmsg.call(5, 85408);
/*   96 */       i = 104;
/*      */       
/*      */ 
/*      */       break label2982;
/*      */       
/*      */       label192:
/*      */       
/*  103 */       SystemLibrary.memcpy(i6, 33216, 7, 1);
/*  104 */       SystemLibrary.strcat(i6, paramInt1);
/*  105 */       if (F272601.call(i6, i2, i3, i7, i4) != 0) {
/*      */         break label2948;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  115 */       MainMemory.setI32(i7, 21);
/*  116 */       paramInt1 = SystemLibrary.strrchr(i3, 64);
/*  117 */       if (paramInt1 == 0) {
/*  118 */         i10 = i3;
/*  119 */         i8 = 48032;
/*  120 */         i15 = 53856;
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*  130 */         MainMemory.setI8(paramInt1, (byte)0);
/*  131 */         i10 = paramInt1 + 1;
/*  132 */         paramInt1 = SystemLibrary.strchr(i3, 58);
/*  133 */         if (paramInt1 == 0)
/*      */         {
/*  135 */           i8 = i3;
/*  136 */           i15 = 53856;
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*  146 */           MainMemory.setI8(paramInt1, (byte)0);
/*  147 */           paramInt1 += 1;
/*      */           
/*  149 */           i8 = i3;
/*  150 */           i15 = paramInt1;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  159 */       i11 = F272784.call(i10, MainMemory.getI32(i7));
/*  160 */       MainMemory.setI32(paramInt4, i11);
/*  161 */       i9 = fdopen.call(i11, 14016);
/*  162 */       MainMemory.setI32(paramInt3, i9);
/*  163 */       if (i9 != 0) {
/*      */         break label412;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  173 */       ffxmsg.call(5, 126624);
/*  174 */       i = 104;
/*      */       
/*      */ 
/*      */       break label2982;
/*      */       
/*      */       label412:
/*      */       
/*  181 */       paramInt1 = j + 4;
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  187 */       while (SystemLibrary.fgets(j, 1200, i9) != 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  197 */         MainMemory.setI8(paramInt1, (byte)0);
/*  198 */         if (SystemLibrary.strcmp(j, 21440) != 0) {
/*      */           break label2897;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  208 */         i10 = i1;
/*  209 */         SystemLibrary.sprintf(i10, 45504, new Object[] { Integer.valueOf(i8) });
/*  210 */         i11 = SystemLibrary.strlen(i10);
/*  211 */         i12 = MainMemory.getI32(paramInt4);
/*  212 */         if (i12 < 0) {
/*      */           break label603;
/*      */         } else {
/*  215 */           i14 = 0;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         for (;;)
/*      */         {
/*  224 */           if (i14 >= i11) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  234 */           i13 = send.call(i12, i10 + i14, i11 - i14, 0);
/*  235 */           if (i13 < 1) {
/*      */             break;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  245 */           i14 = i13 + i14;
/*      */         }
/*      */         
/*      */ 
/*      */         label603:
/*      */         
/*  251 */         i9 = MainMemory.getI32(paramInt3);
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  257 */         while (SystemLibrary.fgets(j, 1200, i9) != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  267 */           MainMemory.setI8(paramInt1, (byte)0);
/*  268 */           if (SystemLibrary.strcmp(j, 21472) != 0) {
/*      */             break label2846;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  278 */           SystemLibrary.sprintf(i10, 45536, new Object[] { Integer.valueOf(i15) });
/*  279 */           i11 = SystemLibrary.strlen(i10);
/*  280 */           i12 = MainMemory.getI32(paramInt4);
/*  281 */           if (i12 < 0) {
/*      */             break label791;
/*      */           } else {
/*  284 */             i14 = 0;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           for (;;)
/*      */           {
/*  293 */             if (i14 >= i11) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  303 */             i13 = send.call(i12, i10 + i14, i11 - i14, 0);
/*  304 */             if (i13 < 1) {
/*      */               break;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  314 */             i14 = i13 + i14;
/*      */           }
/*      */           
/*      */ 
/*      */           label791:
/*      */           
/*  320 */           i9 = MainMemory.getI32(paramInt3);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  326 */           while (SystemLibrary.fgets(j, 1200, i9) != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  336 */             MainMemory.setI8(paramInt1, (byte)0);
/*  337 */             if (SystemLibrary.strcmp(j, 21504) != 0) {
/*      */               break label2795;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  347 */             i15 = SystemLibrary.strrchr(i4, 47);
/*  348 */             if (i15 != 0) {
/*      */               break label905;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  358 */             SystemLibrary.memcpy(i10, 35808, 7, 1);
/*  359 */             i15 = i4;
/*      */             
/*      */             break label1045;
/*      */             
/*      */             label905:
/*  364 */             MainMemory.setI8(i15, (byte)0);
/*  365 */             i15 += 1;
/*  366 */             switch (MainMemory.getI8(i4))
/*      */             {
/*      */             case 0: 
/*      */               break label1000;
/*      */               
/*      */               break;
/*      */             case 47: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*  377 */             SystemLibrary.sprintf(i10, 41088, new Object[] { Integer.valueOf(i4 + 1) });
/*      */             
/*      */             break label1045;
/*      */             
/*      */             label1000:
/*      */             
/*  383 */             SystemLibrary.memcpy(i10, 35808, 7, 1);
/*      */             
/*      */ 
/*      */             break label1045;
/*      */             
/*      */ 
/*  389 */             SystemLibrary.sprintf(i10, 41088, new Object[] { Integer.valueOf(i4) });
/*      */             
/*      */ 
/*      */ 
/*      */             label1045:
/*      */             
/*      */ 
/*      */ 
/*  397 */             i11 = SystemLibrary.strlen(i10);
/*  398 */             i12 = MainMemory.getI32(paramInt4);
/*  399 */             if (i12 < 0) {
/*      */               break label1150;
/*      */             } else {
/*  402 */               i14 = 0;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  411 */               if (i14 >= i11) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  421 */               i13 = send.call(i12, i10 + i14, i11 - i14, 0);
/*  422 */               if (i13 < 1) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  432 */               i14 = i13 + i14;
/*      */             }
/*      */             
/*      */ 
/*      */             label1150:
/*      */             
/*  438 */             i9 = MainMemory.getI32(paramInt3);
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  444 */             while (SystemLibrary.fgets(j, 1200, i9) != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  454 */               MainMemory.setI8(paramInt1, (byte)0);
/*  455 */               if (SystemLibrary.strcmp(j, 21536) != 0) {
/*      */                 break label2744;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  465 */               if (MainMemory.getI8(i15) != 0) {
/*      */                 break label1262;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  475 */               ffxmsg.call(5, 70528);
/*  476 */               SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  477 */               i = 104;
/*      */               
/*      */ 
/*      */               break label2982;
/*      */               
/*      */               label1262:
/*      */               
/*  484 */               MainMemory.setI64(i1, 2895152717781332L);
/*  485 */               i11 = SystemLibrary.strlen(i10);
/*  486 */               i12 = MainMemory.getI32(paramInt4);
/*  487 */               if (i12 < 0) {
/*      */                 break label1375;
/*      */               } else {
/*  490 */                 i14 = 0;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  499 */                 if (i14 >= i11) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  509 */                 i13 = send.call(i12, i10 + i14, i11 - i14, 0);
/*  510 */                 if (i13 < 1) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  520 */                 i14 = i13 + i14;
/*      */               }
/*      */               
/*      */ 
/*      */               label1375:
/*      */               
/*  526 */               i9 = MainMemory.getI32(paramInt3);
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  532 */               while (SystemLibrary.fgets(j, 1200, i9) != 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  542 */                 MainMemory.setI8(paramInt1, (byte)0);
/*  543 */                 if (SystemLibrary.strcmp(j, 21568) != 0) {
/*      */                   break label2693;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  553 */                 i11 = MainMemory.getI32(paramInt4);
/*  554 */                 if (i11 < 0) {
/*      */                   break label1535;
/*      */                 } else {
/*  557 */                   i12 = 0;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  566 */                   if (i12 >= 5) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  576 */                   i14 = send.call(i11, 27040 + i12, 5 - i12, 0);
/*  577 */                   if (i14 < 1) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  587 */                   i12 = i14 + i12;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label1535:
/*      */                 
/*  593 */                 if (SystemLibrary.fgets(m, 1200, MainMemory.getI32(paramInt3)) != 0) {
/*      */                   break label1591;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  603 */                 ffxmsg.call(5, 65408);
/*  604 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  605 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label1591:
/*      */                 
/*  612 */                 if (MainMemory.getI8(m) != 50) {
/*      */                   break label2574;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  622 */                 if (MainMemory.getI8(m + 1) != 50) {
/*      */                   break label2574;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  632 */                 if (MainMemory.getI8(m + 2) != 55) {
/*      */                   break label2574;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  642 */                 i8 = SystemLibrary.strchr(m, 40);
/*  643 */                 if (i8 != 0) {
/*      */                   break label1719;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  653 */                 ffxmsg.call(5, 65408);
/*  654 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  655 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label1719:
/*      */                 
/*  662 */                 MainMemory.setI8(i8, (byte)0);
/*  663 */                 i8 += 1;
/*  664 */                 MainMemory.setI8(i5, (byte)0);
/*  665 */                 i8 = SystemLibrary.strtok(i8, 15712);
/*  666 */                 if (i8 != 0) {
/*      */                   break label1793;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  676 */                 ffxmsg.call(5, 65408);
/*  677 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  678 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label1793:
/*      */                 
/*  685 */                 SystemLibrary.strcpy(i5, i8);
/*  686 */                 MainMemory.setI16(i5 + SystemLibrary.strlen(i5), (short)46);
/*  687 */                 i8 = SystemLibrary.strtok(0, 15712);
/*  688 */                 if (i8 != 0) {
/*      */                   break label1869;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  698 */                 ffxmsg.call(5, 65408);
/*  699 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  700 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label1869:
/*      */                 
/*  707 */                 SystemLibrary.strcat(i5, i8);
/*  708 */                 MainMemory.setI16(i5 + SystemLibrary.strlen(i5), (short)46);
/*  709 */                 i8 = SystemLibrary.strtok(0, 15712);
/*  710 */                 if (i8 != 0) {
/*      */                   break label1945;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  720 */                 ffxmsg.call(5, 65408);
/*  721 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  722 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label1945:
/*      */                 
/*  729 */                 SystemLibrary.strcat(i5, i8);
/*  730 */                 MainMemory.setI16(i5 + SystemLibrary.strlen(i5), (short)46);
/*  731 */                 i8 = SystemLibrary.strtok(0, 15712);
/*  732 */                 if (i8 != 0) {
/*      */                   break label2021;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  742 */                 ffxmsg.call(5, 65408);
/*  743 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  744 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label2021:
/*      */                 
/*  751 */                 SystemLibrary.strcat(i5, i8);
/*  752 */                 i8 = SystemLibrary.strtok(0, 15712);
/*  753 */                 if (i8 != 0) {
/*      */                   break label2084;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  763 */                 ffxmsg.call(5, 65408);
/*  764 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  765 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label2084:
/*      */                 
/*  772 */                 SystemLibrary.sscanf(i8, 15680, new int[] { i7 });
/*  773 */                 MainMemory.setI32(i7, MainMemory.getI32(i7) << 8);
/*  774 */                 i8 = SystemLibrary.strtok(0, 15712);
/*  775 */                 if (i8 != 0) {
/*      */                   break label2169;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  785 */                 ffxmsg.call(5, 65408);
/*  786 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  787 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label2169:
/*      */                 
/*  794 */                 SystemLibrary.sscanf(i8, 15680, new int[] { k });
/*  795 */                 i11 = MainMemory.getI32(k) + MainMemory.getI32(i7);
/*  796 */                 MainMemory.setI32(i7, i11);
/*  797 */                 if (MainMemory.getI8(i15) != 0) {
/*      */                   break label2255;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  807 */                 ffxmsg.call(5, 70528);
/*  808 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  809 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label2255:
/*      */                 
/*  816 */                 i9 = fdopen.call(F272784.call(i5, i11), 14016);
/*  817 */                 MainMemory.setI32(paramInt2, i9);
/*  818 */                 if (i9 != 0) {
/*      */                   break label2322;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  828 */                 ffxmsg.call(5, 102944);
/*  829 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  830 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label2322:
/*      */                 
/*  837 */                 SystemLibrary.sprintf(i10, 45568, new Object[] { Integer.valueOf(i15) });
/*  838 */                 i11 = SystemLibrary.strlen(i10);
/*  839 */                 i12 = MainMemory.getI32(paramInt4);
/*  840 */                 if (i12 < 0) {
/*      */                   break label2447;
/*      */                 } else {
/*  843 */                   i14 = 0;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  852 */                   if (i14 >= i11) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  862 */                   i13 = send.call(i12, i10 + i14, i11 - i14, 0);
/*  863 */                   if (i13 < 1) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  873 */                   i14 = i13 + i14;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label2447:
/*      */                 
/*  879 */                 i9 = MainMemory.getI32(paramInt3);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  885 */                 while (SystemLibrary.fgets(j, 1200, i9) != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  895 */                   MainMemory.setI8(paramInt1, (byte)0);
/*  896 */                   if (SystemLibrary.strcmp(j, 21600) != 0) {
/*      */                     break label2523;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  906 */                   i = 0;
/*      */                   
/*      */ 
/*      */                   break label2982;
/*      */                   
/*      */                   label2523:
/*      */                   
/*  913 */                   if (MainMemory.getI8(j) > 51) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  923 */                 ffxmsg.call(5, 120160);
/*  924 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  925 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label2574:
/*      */                 
/*  932 */                 i11 = MainMemory.getI32(paramInt4);
/*  933 */                 if (i11 < 0) {
/*      */                   break label2671;
/*      */                 } else {
/*  936 */                   i12 = 0;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/*  945 */                   if (i12 >= 5) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  955 */                   i14 = send.call(i11, 27072 + i12, 5 - i12, 0);
/*  956 */                   if (i14 < 1) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  966 */                   i12 = i14 + i12;
/*      */                 }
/*      */                 
/*      */ 
/*      */                 label2671:
/*      */                 
/*  972 */                 SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  973 */                 i = 104;
/*      */                 
/*      */ 
/*      */                 break label2982;
/*      */                 
/*      */                 label2693:
/*      */                 
/*  980 */                 if (MainMemory.getI8(j) > 51) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  990 */               ffxmsg.call(5, 88800);
/*  991 */               SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/*  992 */               i = 104;
/*      */               
/*      */ 
/*      */               break label2982;
/*      */               
/*      */               label2744:
/*      */               
/*  999 */               if (MainMemory.getI8(j) > 51) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1009 */             ffxmsg.call(5, 81184);
/* 1010 */             SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/* 1011 */             i = 104;
/*      */             
/*      */ 
/*      */             break label2982;
/*      */             
/*      */             label2795:
/*      */             
/* 1018 */             if (MainMemory.getI8(j) > 51) {
/*      */               break;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1028 */           ffxmsg.call(5, 83040);
/* 1029 */           SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/* 1030 */           i = 104;
/*      */           
/*      */ 
/*      */           break label2982;
/*      */           
/*      */           label2846:
/*      */           
/* 1037 */           if (MainMemory.getI8(j) > 51) {
/*      */             break;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1047 */         ffxmsg.call(5, 81120);
/* 1048 */         SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/* 1049 */         i = 104;
/*      */         
/*      */ 
/*      */         break label2982;
/*      */         
/*      */         label2897:
/*      */         
/* 1056 */         if (MainMemory.getI8(j) > 51) {
/*      */           break;
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1066 */       ffxmsg.call(5, 128160);
/* 1067 */       SystemLibrary.fclose(MainMemory.getI32(paramInt3));
/* 1068 */       i = 104;
/*      */       
/*      */ 
/*      */       break label2982;
/*      */       
/*      */       label2948:
/*      */       
/* 1075 */       SystemLibrary.sprintf(n, 76064, new Object[] { Integer.valueOf(paramInt1) });
/* 1076 */       ffxmsg.call(5, n);
/* 1077 */       i = 104;
/*      */       
/*      */ 
/*      */       label2982:
/*      */       
/*      */ 
/* 1083 */       return i;
/*      */ 
/*      */     }
/*      */     finally
/*      */     {
/* 1088 */       MainMemory.dealloc_generated(i16);
/*      */     }
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F273321.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */