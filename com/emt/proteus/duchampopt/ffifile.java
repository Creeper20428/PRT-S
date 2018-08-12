/*      */ package com.emt.proteus.duchampopt;
/*      */ 
/*      */ import com.emt.proteus.lib.api.MathUtils;
/*      */ import com.emt.proteus.runtime.api.Env;
/*      */ import com.emt.proteus.runtime.api.Frame;
/*      */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*      */ import com.emt.proteus.runtime.api.MainMemory;
/*      */ import com.emt.proteus.runtime.api.SystemLibrary;
/*      */ import com.emt.proteus.runtime.library.c.free;
/*      */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*      */ 
/*      */ public final class ffifile extends ImplementedFunction
/*      */ {
/*      */   public static final int FNID = 2996;
/*   15 */   public static final com.emt.proteus.runtime.api.Function _instance = new ffifile();
/*   16 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*      */   
/*   18 */   public ffifile() { super("ffifile", 10, false); }
/*      */   
/*      */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*      */   }
/*      */   
/*      */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*      */   {
/*   27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   28 */     paramInt4 += 2;
/*   29 */     paramInt3--;
/*   30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   31 */     paramInt4 += 2;
/*   32 */     paramInt3--;
/*   33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   34 */     paramInt4 += 2;
/*   35 */     paramInt3--;
/*   36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   37 */     paramInt4 += 2;
/*   38 */     paramInt3--;
/*   39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   40 */     paramInt4 += 2;
/*   41 */     paramInt3--;
/*   42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   43 */     paramInt4 += 2;
/*   44 */     paramInt3--;
/*   45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   46 */     paramInt4 += 2;
/*   47 */     paramInt3--;
/*   48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   49 */     paramInt4 += 2;
/*   50 */     paramInt3--;
/*   51 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   52 */     paramInt4 += 2;
/*   53 */     paramInt3--;
/*   54 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*   55 */     paramInt4 += 2;
/*   56 */     paramInt3--;
/*   57 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*   58 */     paramFrame.setI32(paramInt1, i6);
/*   59 */     return paramInt4;
/*      */   }
/*      */   
/*      */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*      */   {
/*   64 */     int i = 0;
/*      */     
/*   66 */     int j = 0;
/*   67 */     boolean bool = false;
/*   68 */     int k = 0;
/*   69 */     int m = 0;
/*   70 */     int n = 0;
/*   71 */     int i1 = 0;
/*   72 */     int i2 = 0;
/*   73 */     int i3 = 0;
/*   74 */     int i4 = 0;
/*   75 */     int i5 = 0;
/*   76 */     int i6 = 0;
/*   77 */     int i7 = 0;
/*   78 */     int i8 = 0;
/*   79 */     int i9 = 0;
/*   80 */     int i10 = 0;
/*   81 */     int i11 = 0;
/*   82 */     int i12 = 0;
/*   83 */     int i13 = 0;
/*   84 */     int i14 = 0;
/*   85 */     int i15 = 0;
/*   86 */     int i16 = 0;
/*   87 */     int i17 = 0;
/*   88 */     int i18 = 0;
/*   89 */     int i19 = 0;
/*   90 */     int i20 = 0;
/*   91 */     int i21 = 0;
/*   92 */     int i22 = 0;
/*   93 */     int i23 = 0;
/*      */     
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/*   99 */       if (MainMemory.getI32(paramInt10) <= 0)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  109 */         j = paramInt3 == 0 ? 1 : 0;
/*  110 */         if (j == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  120 */           MainMemory.setI8(paramInt3, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  126 */         bool = paramInt2 == 0;
/*  127 */         if (!bool)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  137 */           MainMemory.setI8(paramInt2, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  143 */         k = paramInt4 == 0 ? 1 : 0;
/*  144 */         if (k == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  154 */           MainMemory.setI8(paramInt4, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  160 */         m = paramInt5 == 0 ? 1 : 0;
/*  161 */         if (m == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  171 */           MainMemory.setI8(paramInt5, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  177 */         n = paramInt7 == 0 ? 1 : 0;
/*  178 */         if (n == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  188 */           MainMemory.setI8(paramInt7, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  194 */         i1 = paramInt8 == 0 ? 1 : 0;
/*  195 */         if (i1 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  205 */           MainMemory.setI8(paramInt8, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  211 */         i2 = paramInt6 == 0 ? 1 : 0;
/*  212 */         if (i2 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  222 */           MainMemory.setI8(paramInt6, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  228 */         i3 = paramInt9 == 0 ? 1 : 0;
/*  229 */         if (i3 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  239 */           MainMemory.setI8(paramInt9, (byte)0);
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*  245 */         i4 = SystemLibrary.strlen(paramInt1);
/*  246 */         if (i4 != 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  256 */           i15 = i4 + 1;
/*  257 */           i5 = com.emt.proteus.runtime.library.c.calloc.call(3, i15);
/*  258 */           if (i5 != 0) {
/*      */             break label473;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  268 */           MainMemory.setI32(paramInt10, 113);
/*      */           
/*      */           break label7117;
/*      */           
/*      */           label473:
/*  273 */           i6 = i5 + i15;
/*  274 */           i7 = i5 + (i15 << 1);
/*  275 */           if (MainMemory.getI8(paramInt1) != 45) {
/*      */             break label624;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  285 */           i10 = paramInt1 + 1;
/*  286 */           switch (MainMemory.getI8(i10))
/*      */           {
/*      */           case 0: 
/*      */             break;
/*      */           case 32: 
/*      */             break;
/*      */           case 91: 
/*      */             break;
/*      */           case 40: 
/*      */             break;
/*      */           }
/*      */           
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*  302 */           if (!bool)
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
/*  313 */             SystemLibrary.memcpy(paramInt2 + SystemLibrary.strlen(paramInt2), 44704, 9, 1);
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label624:
/*      */             
/*  319 */             if (SystemLibrary.strncasecmp(paramInt1, 26464, 5) != 0) {
/*      */               break label697;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  329 */             if (!bool)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  339 */               SystemLibrary.memcpy(paramInt2 + SystemLibrary.strlen(paramInt2), 44704, 9, 1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  345 */             i10 = paramInt1 + 5;
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label697:
/*      */             
/*  351 */             i10 = SystemLibrary.strstr(paramInt1, 17696);
/*  352 */             i9 = SystemLibrary.strchr(paramInt1, 40);
/*  353 */             i10 = (i9 != 0) && (MathUtils.ult(i9, i10)) ? 0 : i10;
/*  354 */             if (i10 != 0) {
/*      */               break label1251;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  364 */             if (SystemLibrary.strncmp(paramInt1, 20576, 4) != 0) {
/*      */               break label828;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  374 */             if (!bool)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  384 */               SystemLibrary.memcpy(paramInt2 + SystemLibrary.strlen(paramInt2), 33216, 7, 1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  390 */             i10 = paramInt1 + 4;
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label828:
/*      */             
/*  396 */             if (SystemLibrary.strncmp(paramInt1, 40480, 7) != 0) {
/*      */               break label902;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  406 */             if (!bool)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  416 */               SystemLibrary.memcpy(paramInt2 + SystemLibrary.strlen(paramInt2), 47808, 10, 1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  422 */             i10 = paramInt1 + 7;
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label902:
/*      */             
/*  428 */             if (SystemLibrary.strncmp(paramInt1, 26528, 5) != 0) {
/*      */               break label973;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  438 */             if (!bool)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  448 */               MainMemory.setI64(paramInt2 + SystemLibrary.strlen(paramInt2), 13281251946689640L);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  454 */             i10 = paramInt1 + 5;
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label973:
/*      */             
/*  460 */             if (SystemLibrary.strncmp(paramInt1, 20608, 4) != 0) {
/*      */               break label1046;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  470 */             if (!bool)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  480 */               SystemLibrary.memcpy(paramInt2 + SystemLibrary.strlen(paramInt2), 33248, 7, 1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  486 */             i10 = paramInt1 + 4;
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label1046:
/*      */             
/*  492 */             if (SystemLibrary.strncmp(paramInt1, 33280, 6) != 0) {
/*      */               break label1120;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  502 */             if (!bool)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  512 */               SystemLibrary.memcpy(paramInt2 + SystemLibrary.strlen(paramInt2), 44672, 9, 1);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  518 */             i10 = paramInt1 + 6;
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label1120:
/*      */             
/*  524 */             i8 = paramInt2 != 0 ? 1 : 0;
/*  525 */             if (SystemLibrary.strncmp(paramInt1, 26560, 5) != 0) {
/*      */               break label1205;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  535 */             if (i8 == 0) {
/*      */               break label1190;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  545 */             MainMemory.setI64(paramInt2 + SystemLibrary.strlen(paramInt2), 13281251761613158L);
/*      */             
/*      */ 
/*      */             label1190:
/*      */             
/*      */ 
/*  551 */             i10 = paramInt1 + 5;
/*      */             
/*      */             break label1294;
/*      */             
/*      */             label1205:
/*      */             
/*  557 */             if (i8 == 0)
/*      */             {
/*      */ 
/*      */ 
/*  561 */               i10 = paramInt1;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*  568 */               MainMemory.setI64(paramInt2 + SystemLibrary.strlen(paramInt2), 13281251761613158L);
/*  569 */               i10 = paramInt1;
/*      */               
/*      */               break label1294;
/*      */               
/*      */               label1251:
/*  574 */               if (!bool)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  584 */                 SystemLibrary.strncat(paramInt2, paramInt1, 3 - paramInt1 + i10);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*  590 */               i10 += 3;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */             label1294:
/*      */             
/*      */ 
/*  598 */             if (!bool)
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
/*  609 */               if (SystemLibrary.strncmp(paramInt2, 40512, 7) != 0) {
/*      */                 break label1605;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  620 */               if (SystemLibrary.strchr(i10, 40) != 0) {
/*      */                 break label1376;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  630 */               if (SystemLibrary.strchr(i10, 91) != 0)
/*      */               {
/*      */                 label1376:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  641 */                 i15 = SystemLibrary.strlen(i10);
/*  642 */                 i12 = MainMemory.getI8(i10 + (i15 + -1));
/*  643 */                 if (i12 != 32) {
/*      */                   break label1466;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  654 */                 i16 = i15 + -2;
/*  655 */                 i18 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 do
/*      */                 {
/*  662 */                   i12 = MainMemory.getI8(i10 + (i16 - i18));
/*  663 */                   i18 += 1;
/*  664 */                 } while (i12 == 32);
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label1466:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  677 */                 switch (i12)
/*      */                 {
/*      */                 case 41: 
/*      */                   break label1605;
/*      */                   
/*      */                   break;
/*      */                 case 93: 
/*      */                   break label1605;
/*      */                   
/*      */                   break;
/*      */                 }
/*      */                 
/*      */                 
/*  690 */                 if (j == 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  700 */                   if (!MathUtils.ugt(i15, 1024)) {
/*      */                     break label1578;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  710 */                   ffxmsg.call(5, 70496);
/*  711 */                   MainMemory.setI32(paramInt10, 125);
/*      */                   
/*      */                   break label7117;
/*      */                   
/*      */                   label1578:
/*  716 */                   SystemLibrary.strcpy(paramInt3, i10);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*  722 */                 free.call(i5);
/*      */                 break label7117;
/*      */               }
/*      */             }
/*      */           }
/*      */           label1605:
/*  728 */           if (MainMemory.getI8(i10) != 91) {
/*      */             break label1669;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  738 */           if (MainMemory.getI8(paramInt1) == 45) {
/*  739 */             i9 = i10;
/*      */ 
/*      */ 
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*  749 */             paramInt1 = i10 + 1;
/*  750 */             i9 = paramInt1;
/*      */             
/*      */             break label1708;
/*      */             
/*      */             label1669:
/*  755 */             paramInt1 = SystemLibrary.strstr(i10, 15328);
/*  756 */             if (paramInt1 == 0) {
/*  757 */               i9 = i10;
/*      */ 
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*  767 */               paramInt1 += 2;
/*  768 */               i9 = paramInt1;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */           label1708:
/*      */           
/*  775 */           paramInt1 = SystemLibrary.strchr(i9, 40);
/*  776 */           i9 = SystemLibrary.strchr(i9, 91);
/*  777 */           if (paramInt1 != i9) {
/*      */             break label1765;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  787 */           SystemLibrary.strcat(i5, i10);
/*  788 */           paramInt1 = i9;
/*      */           
/*      */           break label1986;
/*      */           
/*      */           label1765:
/*  793 */           if (i9 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  803 */             if ((paramInt1 == 0) || (!MathUtils.ult(paramInt1, i9))) {
/*      */               break label1965;
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  813 */           SystemLibrary.strncat(i5, i10, paramInt1 - i10);
/*  814 */           paramInt1 += 1;
/*  815 */           i10 = SystemLibrary.strchr(paramInt1, 41);
/*  816 */           if (i10 != 0) {
/*      */             break label1870;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  826 */           free.call(i5);
/*  827 */           MainMemory.setI32(paramInt10, 125);
/*      */           
/*      */           break label7117;
/*      */           
/*      */           label1870:
/*  832 */           if (k == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  842 */             i15 = i10 - paramInt1;
/*  843 */             if (i15 <= 1024) {
/*      */               break label1934;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  853 */             free.call(i5);
/*  854 */             MainMemory.setI32(paramInt10, 125);
/*      */             
/*      */             break label7117;
/*      */             
/*      */             label1934:
/*  859 */             SystemLibrary.strncat(paramInt4, paramInt1, i15);
/*      */ 
/*      */           }
/*      */           else
/*      */           {
/*      */ 
/*  865 */             paramInt1 = SystemLibrary.strchr(i10, 91);
/*      */             
/*      */             break label1986;
/*      */             
/*      */             label1965:
/*      */             
/*  871 */             SystemLibrary.strncat(i5, i10, i9 - i10);
/*  872 */             paramInt1 = i9;
/*      */             
/*      */ 
/*      */ 
/*      */             label1986:
/*      */             
/*      */ 
/*  879 */             i15 = SystemLibrary.strlen(i5) + -1;
/*  880 */             i16 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  887 */               i18 = i15 - i16;
/*  888 */               i10 = i5 + i18;
/*  889 */               if (i18 < 1) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  899 */               if (MainMemory.getI8(i10) != 32) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  909 */               MainMemory.setI8(i10, (byte)0);
/*  910 */               i16 += 1;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  916 */             if (k == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  926 */               i15 = SystemLibrary.strlen(paramInt4) + -1;
/*  927 */               i16 = 0;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/*  934 */                 i18 = i15 - i16;
/*  935 */                 i10 = paramInt4 + i18;
/*  936 */                 if (i18 < 1) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  946 */                 if (MainMemory.getI8(i10) != 32) {
/*      */                   break;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  956 */                 MainMemory.setI8(i10, (byte)0);
/*  957 */                 i16 += 1;
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*  963 */             i10 = SystemLibrary.strstr(i5, 20640);
/*  964 */             if (i10 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  974 */               ffifile_1100.call(bool, paramInt2, i10);
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*  980 */             i15 = SystemLibrary.strlen(i5);
/*  981 */             i16 = i15 + -1;
/*  982 */             i20 = 0;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */             for (;;)
/*      */             {
/*  989 */               i18 = i16 - i20;
/*  990 */               if (i18 <= -1) {
/*      */                 break;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1000 */               i13 = i20 + 1;
/* 1001 */               if (MainMemory.getI8(i5 + i18) == 43) {
/*      */                 break;
/*      */               }
/*      */               
/* 1005 */               i20 = i13;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1012 */             i20 = i15 - i20;
/* 1013 */             if (i18 <= 0)
/*      */             {
/*      */ 
/*      */ 
/* 1017 */               i18 = 0;
/*      */ 
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1024 */               i13 = i15 - i18;
/* 1025 */               if (i13 >= 7)
/*      */               {
/*      */ 
/*      */ 
/* 1029 */                 i18 = 0;
/*      */ 
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1036 */                 i10 = i5 + i20;
/* 1037 */                 i14 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 1044 */                   i17 = i20 + i14;
/* 1045 */                   if (i17 >= i15) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1055 */                   i9 = i5 + i17;
/* 1056 */                   if ((MainMemory.getI16(MainMemory.getI32(__ctype_b_loc.call()) + (MainMemory.getI8(i9) << 1)) & 0xFFFF & 0x800) == 0) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1066 */                   i14 += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1072 */                 if (i17 != i15)
/*      */                 {
/*      */ 
/*      */ 
/* 1076 */                   i18 = 0;
/*      */ 
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/*      */ 
/* 1083 */                   if (m == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1093 */                     if (i13 <= 1024) {
/*      */                       break label2545;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1103 */                     free.call(i5);
/* 1104 */                     MainMemory.setI32(paramInt10, 125);
/*      */                     
/*      */                     break label7117;
/*      */                     
/*      */                     label2545:
/* 1109 */                     SystemLibrary.strncpy(paramInt5, i10, i13);
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 1115 */                   MainMemory.setI8(i5 + i18, (byte)0);
/* 1116 */                   i18 = 1;
/*      */                 }
/*      */               }
/*      */             }
/*      */             
/*      */ 
/*      */ 
/* 1123 */             if (k == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1133 */               if (MainMemory.getI8(paramInt4) == 42) {
/* 1134 */                 i20 = 0;
/*      */               } else {
/*      */                 break label2757;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1145 */                 i13 = i16 - i20;
/* 1146 */                 if (i13 <= -1) {
/*      */                   break label2757;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1156 */                 i14 = i20 + 1;
/* 1157 */                 if ((MainMemory.getI8(i5 + i13) == 47) || (i16 == i20)) {
/*      */                   break;
/*      */                 }
/*      */                 
/* 1161 */                 i20 = i14;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1168 */               i10 = i5 + (i15 - i20);
/* 1169 */               if (!MathUtils.ugt(SystemLibrary.strlen(i10), 1024)) {
/*      */                 break label2745;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1179 */               free.call(i5);
/* 1180 */               MainMemory.setI32(paramInt10, 125);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label2745:
/* 1185 */               SystemLibrary.strcpy(paramInt4, i10);
/*      */             }
/*      */             
/*      */ 
/*      */             label2757:
/*      */             
/* 1191 */             if (j == 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1201 */               if (!MathUtils.ugt(SystemLibrary.strlen(i5), 1024)) {
/*      */                 break label2821;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1211 */               free.call(i5);
/* 1212 */               MainMemory.setI32(paramInt10, 125);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label2821:
/* 1217 */               SystemLibrary.strcpy(paramInt3, i5);
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/*      */ 
/* 1223 */               if (paramInt1 != 0) {
/*      */                 break label2865;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1233 */               free.call(i5);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label2865:
/* 1238 */               if (i18 != 0) {
/*      */                 break label5158;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1248 */               i10 = paramInt1 + 1;
/* 1249 */               paramInt4 = SystemLibrary.strchr(i10, 93);
/* 1250 */               if (paramInt4 != 0) {
/*      */                 break label2941;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1260 */               ffxmsg.call(5, 104864);
/* 1261 */               free.call(i5);
/* 1262 */               MainMemory.setI32(paramInt10, 125);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label2941:
/* 1267 */               i12 = MainMemory.getI8(i10);
/* 1268 */               switch (i12)
/*      */               {
/*      */               case 66: 
/*      */                 break;
/*      */               case 98: 
/*      */                 break;
/*      */               case 105: 
/*      */                 break;
/*      */               case 73: 
/*      */                 break;
/*      */               case 106: 
/*      */                 break;
/*      */               case 74: 
/*      */                 break;
/*      */               case 100: 
/*      */                 break;
/*      */               case 68: 
/*      */                 break;
/*      */               case 114: 
/*      */                 break;
/*      */               case 82: 
/*      */                 break;
/*      */               case 102: 
/*      */                 break;
/*      */               case 70: 
/*      */                 break;
/*      */               case 117: 
/*      */                 break;
/*      */               case 85: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1304 */               i9 = paramInt1 + 2;
/* 1305 */               switch (MainMemory.getI8(i9))
/*      */               {
/*      */               case 66: 
/*      */                 break;
/*      */               case 98: 
/*      */                 break;
/*      */               case 108: 
/*      */                 break;
/*      */               case 76: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1322 */               i9 = paramInt1 + 3;
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1330 */               i11 = MainMemory.getI32(__ctype_b_loc.call());
/* 1331 */               if ((MainMemory.getI16(i11 + (MainMemory.getI8(i9) << 1)) & 0xFFFF & 0x800) == 0) {
/*      */                 break label3757;
/*      */               } else {
/* 1334 */                 i15 = 0;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               for (;;)
/*      */               {
/* 1343 */                 i15 += 1;
/* 1344 */                 i19 = MainMemory.getI8(i9 + i15);
/* 1345 */                 if ((MainMemory.getI16(i11 + (i19 << 1)) & 0xFFFF & 0x800) == 0) {
/*      */                   break;
/*      */                 }
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1356 */               switch (i19)
/*      */               {
/*      */               case 44: 
/*      */                 break;
/*      */               case 58: 
/*      */                 break;
/*      */               case 93: 
/*      */                 break;
/*      */               }
/*      */               
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 1370 */               if (!bool)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1380 */                 if (SystemLibrary.strstr(paramInt2, 26464) != 0) {
/*      */                   break label3515;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1390 */                 SystemLibrary.memcpy(paramInt2, 49504, 11, 1);
/*      */                 
/*      */                 break label3529;
/*      */                 
/*      */                 label3515:
/* 1395 */                 SystemLibrary.memcpy(paramInt2, 51360, 12, 1);
/*      */               }
/*      */               
/*      */ 
/*      */               label3529:
/*      */               
/* 1401 */               if (j == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1411 */                 i4 = SystemLibrary.strlen(paramInt3);
/* 1412 */                 if (!MathUtils.ugt(SystemLibrary.strlen(paramInt1) + i4, 1024)) {
/*      */                   break label3601;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1422 */                 free.call(i5);
/* 1423 */                 MainMemory.setI32(paramInt10, 125);
/*      */                 
/*      */                 break label7117;
/*      */                 
/*      */                 label3601:
/* 1428 */                 ffifile_1102.call(paramInt3, paramInt1);
/*      */ 
/*      */               }
/*      */               else
/*      */               {
/*      */ 
/* 1434 */                 if (m == 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1444 */                   MainMemory.setI16(paramInt5, (short)48);
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1450 */                 paramInt1 = SystemLibrary.strchr(paramInt4 + 1, 91);
/* 1451 */                 if ((paramInt1 == 0) || (paramInt6 == 0)) {
/*      */                   break label3742;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1461 */                 i4 = SystemLibrary.strlen(paramInt6);
/* 1462 */                 paramInt1 += 1;
/* 1463 */                 if (!MathUtils.ugt(SystemLibrary.strlen(paramInt1) + i4, 1024)) {
/*      */                   break label3731;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1473 */                 free.call(i5);
/* 1474 */                 MainMemory.setI32(paramInt10, 125);
/*      */                 
/*      */                 break label7117;
/*      */                 
/*      */                 label3731:
/* 1479 */                 ffifile_1099.call(paramInt1, paramInt6);
/*      */                 
/*      */ 
/*      */                 label3742:
/*      */                 
/*      */ 
/* 1485 */                 free.call(i5);
/*      */                 
/*      */                 break label7117;
/*      */                 
/*      */                 label3757:
/* 1490 */                 j = i12 == 32 ? 1 : 0;
/* 1491 */                 if (j != 0) {
/* 1492 */                   i15 = 0;
/*      */                 }
/*      */                 else
/*      */                 {
/* 1496 */                   i19 = i12;
/* 1497 */                   paramInt2 = i10;
/*      */                   
/*      */ 
/*      */                   break label3848;
/*      */                 }
/*      */                 
/*      */                 for (;;)
/*      */                 {
/* 1505 */                   paramInt2 = paramInt1 + (i15 + 2);
/* 1506 */                   i19 = MainMemory.getI8(paramInt2);
/* 1507 */                   if (i19 != 32) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1519 */                   i15 += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label3848:
/*      */                 
/*      */ 
/* 1527 */                 i11 = MainMemory.getI32(__ctype_b_loc.call());
/* 1528 */                 if ((MainMemory.getI16(i11 + (i19 << 1)) & 0xFFFF & 0x800) == 0) {
/*      */                   break label3940;
/*      */                 }
/*      */                 else {
/* 1532 */                   i15 = 0;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 1541 */                   i15 += 1;
/* 1542 */                   i19 = MainMemory.getI8(paramInt2 + i15);
/* 1543 */                   if ((MainMemory.getI16(i11 + (i19 << 1)) & 0xFFFF & 0x800) == 0) {
/*      */                     break;
/*      */                   }
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 label3940:
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1556 */                 switch (i19)
/*      */                 {
/*      */                 case 42: 
/*      */                   break;
/*      */                 case 58: 
/*      */                   break;
/*      */                 case 45: 
/*      */                   break;
/*      */                 }
/*      */                 
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1570 */                 SystemLibrary.strcat(i6, paramInt1);
/*      */                 
/*      */ 
/*      */                 break label5170;
/*      */                 
/* 1575 */                 if (j != 0) {
/* 1576 */                   i15 = 0;
/*      */ 
/*      */                 }
/*      */                 else
/*      */                 {
/* 1581 */                   paramInt2 = i10;
/*      */                   
/*      */ 
/*      */                   break label4084;
/*      */                 }
/*      */                 
/*      */                 for (;;)
/*      */                 {
/* 1589 */                   paramInt2 = paramInt1 + (i15 + 2);
/* 1590 */                   i12 = MainMemory.getI8(paramInt2);
/* 1591 */                   if (i12 != 32) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1603 */                   i15 += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */                 label4084:
/*      */                 
/*      */ 
/* 1611 */                 bool = SystemLibrary.strncasecmp(paramInt2, 20672, 4) == 0;
/* 1612 */                 i13 = SystemLibrary.strncasecmp(paramInt2, 17760, 3) == 0 ? 1 : 0;
/* 1613 */                 j = SystemLibrary.strncasecmp(paramInt2, 17792, 3) == 0 ? 1 : 0;
/* 1614 */                 i14 = j != 0 ? 1 : 0;
/* 1615 */                 if (SystemLibrary.strncasecmp(paramInt2, 49536, 10) != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1625 */                   if (SystemLibrary.strncasecmp(paramInt2, 49568, 10) != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1635 */                     i15 = paramInt4;
/* 1636 */                     i16 = i10;
/* 1637 */                     i17 = 1 - i16 + i15;
/* 1638 */                     i22 = 0;
/* 1639 */                     i18 = 0;
/* 1640 */                     i20 = 0;
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
/*      */                     for (;;)
/*      */                     {
/* 1665 */                       i23 = i22 + 1;
/* 1666 */                       paramInt3 = paramInt2 + i23;
/* 1667 */                       if (i17 <= i22)
/*      */                       {
/*      */ 
/*      */ 
/* 1671 */                         i13 = 0;
/* 1672 */                         i19 = 0;
/*      */                         
/*      */ 
/*      */                         break label4992;
/*      */                       }
/*      */                       
/*      */ 
/* 1679 */                       i19 = MainMemory.getI8(paramInt2 + i22);
/* 1680 */                       if (i19 == 46) {
/* 1681 */                         i22 = i23;
/* 1682 */                         i18 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/* 1693 */                       else if (MathUtils.ult((byte)(i19 + -60), (byte)3)) {
/* 1694 */                         i22 = i23;
/* 1695 */                         i20 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                       }
/*      */                       else
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/* 1705 */                         switch (i19) {
/*      */                         case 124: 
/*      */                           break label4485;
/*      */                           break;
/*      */                         case 38:  break; case 44:  i13 = 0;
/* 1710 */                           i19 = 0;
/*      */                           break label4992;
/*      */                           break; case 59:  i13 = 0;
/* 1713 */                           i19 = 0;
/*      */                           break label4992;
/*      */                           break; case 93:  i13 = 0;
/* 1716 */                           i19 = 0;
/*      */                           break label4992;
/*      */                           break; case 32:  i17 = 0;
/*      */                           break label4769;
/*      */                           break; default:  i22 = i23;
/* 1721 */                           break;
/*      */                         }
/*      */                         
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1728 */                         i21 = MainMemory.getI8(paramInt3);
/*      */                         
/*      */                         break label4637;
/*      */                         
/*      */                         label4485:
/*      */                         
/* 1734 */                         i21 = MainMemory.getI8(paramInt3);
/* 1735 */                         if (i21 == 124) {
/* 1736 */                           i22 = i23;
/* 1737 */                           i20 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                         }
/*      */                         else
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/* 1747 */                           switch (i19) {
/*      */                           case 38: 
/*      */                             break;
/*      */                           case 44: 
/* 1751 */                             i13 = 0;
/* 1752 */                             i19 = 0;
/*      */                             break label4992;
/*      */                             break; case 59:  i13 = 0;
/* 1755 */                             i19 = 0;
/*      */                             break label4992;
/*      */                             break; case 93:  i13 = 0;
/* 1758 */                             i19 = 0;
/*      */                             break label4992;
/*      */                             break; case 32:  i17 = 0;
/*      */                             break label4769;
/*      */                             break; default:  i22 = i23;
/* 1763 */                             break;
/*      */                           }
/*      */                           
/*      */                           
/*      */ 
/*      */                           label4637:
/*      */                           
/*      */ 
/* 1771 */                           if (i21 == 38) {
/* 1772 */                             i22 = i23;
/* 1773 */                             i20 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */                           }
/*      */                           else
/*      */                           {
/*      */ 
/*      */ 
/*      */ 
/* 1783 */                             switch (i19) {
/* 1784 */                             case 44:  i13 = 0;
/* 1785 */                               i19 = 0;
/*      */                               break label4992;
/*      */                               break; case 59:  i13 = 0;
/* 1788 */                               i19 = 0;
/*      */                               break label4992;
/*      */                               break; case 93:  i13 = 0;
/* 1791 */                               i19 = 0;
/*      */                               break label4992;
/*      */                               break; case 32:  i17 = 0;
/*      */                               
/* 1795 */                               break;
/* 1796 */                             default:  i22 = i23;
/*      */                             }
/*      */                           }
/*      */                         }
/*      */                       }
/*      */                     }
/*      */                     for (;;)
/*      */                     {
/*      */                       label4769:
/* 1805 */                       i19 = MainMemory.getI8(paramInt2 + (i23 + i17));
/* 1806 */                       i17 += 1;
/* 1807 */                       switch (i19) {}
/*      */                     }
/*      */                     break label4842;
/* 1810 */                     i13 = 0;
/* 1811 */                     i19 = 0;
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */                     label4842:
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/* 1821 */                     if (!bool)
/*      */                     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1831 */                       if (i22 <= 4)
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1841 */                         if ((i14 | i13) != 0) {
/*      */                           break label5141;
/*      */                         }
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1851 */                       i19 = (byte)((MathUtils.ult((byte)(i19 + -60), (byte)3)) || (i19 == 124) || (i19 == 38) || (i19 == 33) || (i19 == 43) || (i19 == 45) || (i19 == 42) || (i19 == 47) || (i19 == 37) ? 1 : 0);
/* 1852 */                       if (j != 0) {
/*      */                         break label5141;
/*      */                       } else {
/* 1855 */                         i13 = 1;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */                       label4992:
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/* 1866 */                       if (((i18 != 0) && (i12 == 64)) || (i20 != 0)) {
/*      */                         break label5141;
/*      */                       }
/*      */                       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1876 */                       if ((i13 == 0) || (i19 == 0))
/*      */                       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1886 */                         if (m == 0)
/*      */                         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1896 */                           i15 -= i16;
/* 1897 */                           if (i15 <= 1024) {
/*      */                             break label5107;
/*      */                           }
/*      */                           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1907 */                           free.call(i5);
/* 1908 */                           MainMemory.setI32(paramInt10, 125);
/*      */                           
/*      */                           break label7117;
/*      */                           
/*      */                           label5107:
/* 1913 */                           SystemLibrary.strncat(paramInt5, i10, i15);
/*      */                         }
/*      */                         
/*      */ 
/*      */ 
/*      */ 
/* 1919 */                         SystemLibrary.strcat(i6, paramInt4 + 1);
/*      */                         break label5170;
/*      */                       }
/*      */                     } } }
/*      */                 label5141:
/* 1924 */                 SystemLibrary.strcat(i6, paramInt1);
/*      */                 
/*      */                 break label5170;
/*      */                 
/*      */                 label5158:
/* 1929 */                 SystemLibrary.strcat(i6, paramInt1);
/*      */                 
/*      */ 
/*      */                 label5170:
/*      */                 
/*      */ 
/* 1935 */                 i16 = SystemLibrary.strlen(i6);
/* 1936 */                 i15 = i16 + i4;
/* 1937 */                 i16 += -1;
/* 1938 */                 i18 = 0;
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */                 for (;;)
/*      */                 {
/* 1945 */                   paramInt1 = i5 + (i15 - i18);
/* 1946 */                   if (i16 - i18 < 0) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1956 */                   if (MainMemory.getI8(paramInt1) != 32) {
/*      */                     break;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1966 */                   MainMemory.setI8(paramInt1, (byte)0);
/* 1967 */                   i18 += 1;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/* 1973 */                 if (MainMemory.getI8(i6) != 0) {
/*      */                   break label5304;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1983 */                 free.call(i5);
/*      */                 
/*      */                 break label7117;
/*      */                 
/*      */                 label5304:
/* 1988 */                 paramInt1 = SystemLibrary.strstr(i6, 20704);
/* 1989 */                 if (paramInt1 != 0) {
/*      */                   break label5344;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2000 */                 paramInt1 = SystemLibrary.strstr(i6, 20736);
/*      */                 
/*      */ 
/*      */ 
/*      */                 label5344:
/*      */                 
/*      */ 
/*      */ 
/* 2008 */                 if (paramInt1 != 0) {
/*      */                   break label5375;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2019 */                 paramInt1 = SystemLibrary.strstr(i6, 20768);
/*      */                 
/*      */ 
/*      */ 
/*      */                 label5375:
/*      */                 
/*      */ 
/*      */ 
/* 2027 */                 if (paramInt1 != 0)
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2037 */                   paramInt2 = paramInt1 + 4;
/* 2038 */                   switch (MainMemory.getI8(paramInt2))
/*      */                   {
/*      */                   case 98: 
/*      */                     break;
/*      */                   case 105: 
/*      */                     break;
/*      */                   case 106: 
/*      */                     break;
/*      */                   case 114: 
/*      */                     break;
/*      */                   case 100: 
/*      */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2057 */                   paramInt2 = paramInt1 + 5;
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2065 */                   switch (MainMemory.getI8(paramInt2))
/*      */                   {
/*      */                   case 32: 
/*      */                     break;
/*      */                   case 93: 
/*      */                     break;
/*      */                   }
/*      */                   
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/* 2077 */                   if (n == 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2087 */                     paramInt2 = paramInt1 + 1;
/* 2088 */                     if (!MathUtils.ugt(SystemLibrary.strlen(paramInt2), 1024)) {
/*      */                       break label5608;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2098 */                     free.call(i5);
/* 2099 */                     MainMemory.setI32(paramInt10, 125);
/*      */                     
/*      */                     break label7117;
/*      */                     
/*      */                     label5608:
/* 2104 */                     SystemLibrary.strcpy(paramInt7, paramInt2);
/* 2105 */                     paramInt2 = SystemLibrary.strchr(paramInt7, 93);
/* 2106 */                     if (paramInt2 != 0) {
/*      */                       break label5677;
/*      */                     }
/*      */                     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2116 */                     ffxmsg.call(5, 104864);
/* 2117 */                     ffxmsg.call(5, i6);
/* 2118 */                     free.call(i5);
/* 2119 */                     MainMemory.setI32(paramInt10, 125);
/*      */                     
/*      */                     break label7117;
/*      */                     
/*      */                     label5677:
/* 2124 */                     ffifile_1101.call(paramInt2);
/*      */ 
/*      */                   }
/*      */                   else
/*      */                   {
/*      */ 
/* 2130 */                     SystemLibrary.strcpy(i7, SystemLibrary.strchr(paramInt1, 93) + 1);
/* 2131 */                     SystemLibrary.strcpy(paramInt1, i7);
/*      */                   }
/*      */                   
/*      */                 }
/*      */                 else
/*      */                 {
/* 2137 */                   paramInt1 = SystemLibrary.strstr(i6, 26592);
/* 2138 */                   if (paramInt1 != 0) {
/*      */                     break label5785;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2149 */                   paramInt1 = SystemLibrary.strstr(i6, 26624);
/* 2150 */                   if (paramInt1 != 0) {
/*      */                     break label5785;
/*      */                   }
/*      */                   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2161 */                   paramInt1 = SystemLibrary.strstr(i6, 26656);
/*      */                   
/*      */ 
/*      */ 
/*      */                   label5785:
/*      */                   
/*      */ 
/*      */ 
/* 2169 */                   if (paramInt1 != 0)
/*      */                   {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2179 */                     paramInt2 = paramInt1 + 5; }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       for (;;) {
/* 2187 */         i12 = MainMemory.getI8(paramInt2);
/* 2188 */         switch (i12)
/*      */         {
/*      */         case 93: 
/*      */           break label5992;
/*      */           
/*      */           break;
/*      */         case 0: 
/*      */           break label5963;
/*      */           
/*      */           break;
/*      */         case 39: 
/*      */           break;
/*      */         }
/*      */         
/* 2202 */         paramInt2 = SystemLibrary.strchr(paramInt2 + 1, 39);
/* 2203 */         if (paramInt2 != 0) {
/*      */           break label5945;
/*      */         }
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2213 */         ffxmsg.call(5, 135168);
/* 2214 */         free.call(i5);
/* 2215 */         MainMemory.setI32(paramInt10, 125);
/*      */         
/*      */         break label7117;
/*      */         
/*      */         label5945:
/* 2220 */         i12 = MainMemory.getI8(paramInt2);
/*      */         
/*      */ 
/*      */         break label7042;
/*      */         
/*      */         label5963:
/*      */         
/* 2227 */         ffxmsg.call(5, 104864);
/* 2228 */         free.call(i5);
/* 2229 */         MainMemory.setI32(paramInt10, 125);
/*      */         
/*      */         break label7117;
/*      */         
/*      */         label5992:
/* 2234 */         i15 = paramInt2;
/* 2235 */         i16 = paramInt1;
/* 2236 */         i18 = i15 - i16;
/* 2237 */         i20 = i18 + -1;
/* 2238 */         if (i1 == 0)
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2248 */           if (i20 <= 1024) {
/*      */             break label6074;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2258 */           free.call(i5);
/* 2259 */           MainMemory.setI32(paramInt10, 125);
/*      */           
/*      */           break label7117;
/*      */           
/*      */           label6074:
/* 2264 */           ffifile_1097.call(i15, i16, paramInt1, paramInt8, i20, i18);
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*      */ 
/* 2270 */           SystemLibrary.strcpy(i7, paramInt2 + 1);
/* 2271 */           SystemLibrary.strcpy(paramInt1, i7);
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2277 */           paramInt1 = SystemLibrary.strstr(i6, 20800);
/* 2278 */           if (paramInt1 != 0) {
/*      */             break label6187;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2289 */           paramInt1 = SystemLibrary.strstr(i6, 20832);
/* 2290 */           if (paramInt1 != 0) {
/*      */             break label6187;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2301 */           paramInt1 = SystemLibrary.strstr(i6, 20864);
/*      */           
/*      */ 
/*      */ 
/*      */           label6187:
/*      */           
/*      */ 
/*      */ 
/* 2309 */           if (paramInt1 != 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2319 */             paramInt2 = paramInt1 + 4;
/* 2320 */             switch (MainMemory.getI8(paramInt2))
/*      */             {
/*      */             case 98: 
/*      */               break;
/*      */             case 105: 
/*      */               break;
/*      */             case 106: 
/*      */               break;
/*      */             case 66: 
/*      */               break;
/*      */             case 73: 
/*      */               break;
/*      */             case 74: 
/*      */               break;
/*      */             case 114: 
/*      */               break;
/*      */             case 100: 
/*      */               break;
/*      */             case 82: 
/*      */               break;
/*      */             case 68: 
/*      */               break;
/*      */             }
/*      */             
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2349 */             paramInt2 = paramInt1 + 5;
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2357 */             if (MainMemory.getI8(paramInt2) != 49) {
/*      */               break label6388;
/*      */             }
/*      */             
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2368 */             paramInt2 += 1;
/*      */             
/*      */ 
/*      */ 
/*      */             label6388:
/*      */             
/*      */ 
/*      */ 
/* 2376 */             i12 = MainMemory.getI8(paramInt2);
/* 2377 */             if (i12 != 32) {
/*      */               break label6824;
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
/*      */             for (;;)
/*      */             {
/* 2391 */               switch (i12)
/*      */               {
/*      */               case 93: 
/*      */                 break label6592;
/*      */                 
/*      */                 break;
/*      */               case 0: 
/*      */                 break label6563;
/*      */                 
/*      */                 break;
/*      */               case 39: 
/*      */                 break;
/*      */               }
/*      */               
/* 2405 */               paramInt2 = SystemLibrary.strchr(paramInt2 + 1, 39);
/* 2406 */               if (paramInt2 != 0) {
/*      */                 break label6545;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2416 */               ffxmsg.call(5, 135168);
/* 2417 */               free.call(i5);
/* 2418 */               MainMemory.setI32(paramInt10, 125);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label6545:
/* 2423 */               i12 = MainMemory.getI8(paramInt2);
/*      */               
/*      */ 
/*      */               break label6722;
/*      */               
/*      */               label6563:
/*      */               
/* 2430 */               ffxmsg.call(5, 104864);
/* 2431 */               free.call(i5);
/* 2432 */               MainMemory.setI32(paramInt10, 125);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label6592:
/* 2437 */               i15 = paramInt2;
/* 2438 */               i16 = paramInt1;
/* 2439 */               i18 = i15 - i16;
/* 2440 */               i20 = i18 + -1;
/* 2441 */               if (i3 == 0)
/*      */               {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2451 */                 if (i20 <= 1024) {
/*      */                   break label6674;
/*      */                 }
/*      */                 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2461 */                 free.call(i5);
/* 2462 */                 MainMemory.setI32(paramInt10, 125);
/*      */                 
/*      */                 break label7117;
/*      */                 
/*      */                 label6674:
/* 2467 */                 ffifile_1096.call(i15, paramInt1, i18, i16, i20, paramInt9);
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/* 2473 */               SystemLibrary.strcpy(i7, paramInt2 + 1);
/* 2474 */               SystemLibrary.strcpy(paramInt1, i7);
/* 2475 */               break;
/*      */               
/*      */ 
/*      */               label6722:
/*      */               
/*      */ 
/* 2481 */               if (i12 != 91) {
/*      */                 break label6802;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2492 */               paramInt2 = SystemLibrary.strchr(paramInt2 + 1, 93);
/* 2493 */               if (paramInt2 != 0) {
/*      */                 break label6802;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2504 */               ffxmsg.call(5, 131104);
/* 2505 */               free.call(i5);
/* 2506 */               MainMemory.setI32(paramInt10, 125);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label6802:
/*      */               
/* 2512 */               paramInt2 += 1;
/* 2513 */               i12 = MainMemory.getI8(paramInt2);
/*      */             }
/*      */           }
/*      */           
/*      */ 
/*      */           label6824:
/*      */           
/* 2520 */           if (i2 == 0)
/*      */           {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2530 */             i12 = MainMemory.getI8(i6);
/* 2531 */             if (i12 != 0)
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2541 */               paramInt1 = i5 + (i4 + SystemLibrary.strlen(i6));
/* 2542 */               if (i12 != 91) {
/*      */                 break label7006;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2552 */               if (MainMemory.getI8(paramInt1) != 93) {
/*      */                 break label7006;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2562 */               MainMemory.setI8(paramInt1, (byte)0);
/* 2563 */               paramInt1 = i5 + (i4 + 2);
/* 2564 */               if (!MathUtils.ugt(SystemLibrary.strlen(paramInt1), 1024)) {
/*      */                 break label6987;
/*      */               }
/*      */               
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2574 */               free.call(i5);
/* 2575 */               MainMemory.setI32(paramInt10, 125);
/*      */               
/*      */               break label7117;
/*      */               
/*      */               label6987:
/* 2580 */               SystemLibrary.strcpy(paramInt6, paramInt1);
/*      */               
/*      */               break label7026;
/*      */               
/*      */               label7006:
/* 2585 */               ffxmsg.call(5, 112032);
/* 2586 */               MainMemory.setI32(paramInt10, 125);
/*      */             }
/*      */           }
/*      */           
/*      */           label7026:
/*      */           
/* 2592 */           free.call(i5);
/*      */           
/*      */ 
/*      */           break label7117;
/*      */           
/*      */           label7042:
/*      */           
/* 2599 */           if (i12 != 91) {
/*      */             break label7135;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2610 */           paramInt2 = SystemLibrary.strchr(paramInt2 + 1, 93);
/* 2611 */           if (paramInt2 != 0) {
/*      */             break label7135;
/*      */           }
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2622 */           ffxmsg.call(5, 131104);
/* 2623 */           free.call(i5);
/* 2624 */           MainMemory.setI32(paramInt10, 125);
/*      */         }
/*      */         
/*      */ 
/*      */         label7117:
/*      */         
/* 2630 */         i = MainMemory.getI32(paramInt10);
/* 2631 */         break;
/*      */         
/*      */ 
/*      */ 
/*      */         label7135:
/*      */         
/*      */ 
/* 2638 */         paramInt2 += 1;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/* 2643 */       int i24 = i;return i24;
/*      */     }
/*      */     finally {}
/*      */   }
/*      */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffifile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */