/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class F274069
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3098;
/*  17 */   public static final Function _instance = new F274069();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public F274069() { super("F274069", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = call(i, j, k, m);
/*  42 */     paramFrame.setI32(paramInt1, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*  69 */     int i16 = 0;
/*  70 */     int i17 = 0;
/*  71 */     int i18 = 0;
/*  72 */     int i19 = 0;
/*  73 */     int i20 = 0;
/*  74 */     int i21 = 0;
/*  75 */     int i22 = 0;
/*  76 */     int i23 = 0;
/*  77 */     int i24 = 0;
/*  78 */     int i25 = 0;
/*  79 */     int i26 = 0;
/*  80 */     int i27 = 0;
/*  81 */     int i28 = 0;
/*     */     
/*     */ 
/*  84 */     int i29 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  88 */       j = MainMemory.alloc(4);
/*  89 */       k = MainMemory.alloc(4);
/*  90 */       m = MainMemory.alloc(1200);
/*  91 */       n = MainMemory.alloc(1200);
/*  92 */       i1 = MainMemory.alloc(100);
/*  93 */       i2 = MainMemory.alloc(1200);
/*  94 */       i3 = MainMemory.alloc(1200);
/*  95 */       i4 = MainMemory.alloc(100);
/*  96 */       i5 = MainMemory.alloc(100);
/*  97 */       i6 = MainMemory.alloc(1200);
/*  98 */       i7 = MainMemory.alloc(1200);
/*  99 */       i8 = MainMemory.alloc(1200);
/* 100 */       i9 = MainMemory.alloc(4);
/* 101 */       i10 = MainMemory.alloc(100);
/* 102 */       i11 = MainMemory.alloc(100);
/* 103 */       i12 = MainMemory.alloc(4);
/* 104 */       i13 = MainMemory.alloc(1200);
/* 105 */       MainMemory.setI64(i8, 13281251946689640L);
/* 106 */       i14 = i8;
/* 107 */       SystemLibrary.strncat(i14, paramInt1, 1192);
/* 108 */       if (F272601.call(i14, i4, i5, i9, i7) != 0) {
/*     */         break label2145;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       SystemLibrary.strcpy(i6, paramInt1);
/* 119 */       paramInt1 = SystemLibrary.strchr(i6, 64);
/* 120 */       if (paramInt1 != 0) {
/*     */         break label326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       MainMemory.setI8(i6, (byte)0);
/*     */       
/*     */       break label336;
/*     */       
/*     */       label326:
/* 135 */       MainMemory.setI8(paramInt1, (byte)0);
/*     */       
/*     */ 
/*     */       label336:
/*     */       
/*     */ 
/* 141 */       paramInt1 = SystemLibrary.getenv(49856);
/* 142 */       i15 = paramInt1 == 0 ? 1 : 0;
/* 143 */       if (i15 == 0) {
/*     */         break label393;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       i16 = F272784.call(i5, MainMemory.getI32(i9));
/*     */       
/*     */       break label438;
/*     */       
/*     */       label393:
/*     */       
/* 159 */       if (F272601.call(paramInt1, i10, i11, i12, i13) != 0) {
/*     */         break label2106;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */       i16 = F272784.call(i11, MainMemory.getI32(i12));
/*     */       
/*     */ 
/*     */ 
/*     */       label438:
/*     */       
/*     */ 
/*     */ 
/* 177 */       if (i16 >= 0) {
/*     */         break label500;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */       if (i15 != 0) {
/* 188 */         i16 = 104;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 198 */         ffxmsg.call(5, 132384);
/* 199 */         ffxmsg.call(5, paramInt1);
/* 200 */         i = 104;
/*     */         
/*     */ 
/*     */         break label2179;
/*     */         
/*     */         label500:
/*     */         
/* 207 */         i17 = fdopen.call(i16, 14016);
/* 208 */         MainMemory.setI32(paramInt2, i17);
/* 209 */         if (i17 != 0) {
/*     */           break label560;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */         ffxmsg.call(5, 130464);
/* 220 */         SystemLibrary.close(i16);
/* 221 */         i = 104;
/*     */         
/*     */ 
/*     */         break label2179;
/*     */         
/*     */         label560:
/*     */         
/* 228 */         if (i15 == 0) {
/*     */           break label608;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */         SystemLibrary.sprintf(n, 59808, new Object[] { Integer.valueOf(i7) });
/*     */         
/*     */         break label652;
/*     */         
/*     */         label608:
/* 243 */         SystemLibrary.sprintf(n, 77600, new Object[] { Integer.valueOf(i5), Integer.valueOf(MainMemory.getI32(i9)), Integer.valueOf(i7) });
/*     */         
/*     */ 
/*     */         label652:
/*     */         
/*     */ 
/* 249 */         if (MainMemory.getI8(i6) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */           i18 = SystemLibrary.strlen(i6);
/* 260 */           i20 = 0;
/* 261 */           i21 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 269 */             i22 = i20 * 3;
/* 270 */             i27 = i22 - i18;
/* 271 */             i23 = i20 * -4 + 1200;
/* 272 */             i28 = MathUtils.ugt(i18, i22) ? i18 : i22;
/* 273 */             i19 = i20 << 2;
/* 274 */             i24 = i2 + (i19 | 0x3);
/* 275 */             i25 = i2 + (i19 | 0x2);
/* 276 */             paramInt1 = i2 + (i19 | 0x1);
/* 277 */             i26 = i2 + i19;
/* 278 */             i27 = MathUtils.ugt(i27, -3) ? 0 - i27 : 3;
/* 279 */             i28 = MathUtils.ugt(i22 + -1 - i28, -4) ? i28 + i20 * -3 : 3;
/* 280 */             if (MathUtils.ult(i22, i18)) {
/* 281 */               i19 = 0;
/*     */             } else {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 294 */               i21 = MainMemory.getI8(i6 + (i22 + i19)) & 0xFF | i21 << 8;
/* 295 */               i19 += 1;
/* 296 */               if (i19 == i27) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */             i22 = i21 << MathUtils.urem(6 - MathUtils.urem(i28 << 3, 6), 6);
/* 309 */             if (MathUtils.ult(i23, 4)) {
/*     */               break label1162;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */             MainMemory.setI8(i24, (byte)61);
/* 320 */             MainMemory.setI8(i25, (byte)61);
/* 321 */             MainMemory.setI8(paramInt1, (byte)61);
/* 322 */             MainMemory.setI8(i26, (byte)61);
/* 323 */             switch (i28) {
/* 324 */             case 1:  i23 = i22;
/*     */               break label1088;
/*     */               break; case 2:  i23 = i22;
/*     */               break label1060;
/*     */               break;
/*     */             case 3: 
/*     */               break; default:  i23 = i22;
/* 331 */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 338 */             MainMemory.setI8(i24, MainMemory.getI8(135360 + (i22 & 0x3F)));
/* 339 */             i23 = i22 >>> 6;
/*     */             
/*     */ 
/*     */ 
/*     */             label1060:
/*     */             
/*     */ 
/*     */ 
/* 347 */             MainMemory.setI8(i25, MainMemory.getI8(135360 + (i23 & 0x3F)));
/* 348 */             i23 >>>= 6;
/*     */             
/*     */ 
/*     */ 
/*     */             label1088:
/*     */             
/*     */ 
/*     */ 
/* 356 */             MainMemory.setI8(paramInt1, MainMemory.getI8(135360 + (i23 & 0x3F)));
/* 357 */             i23 >>>= 6;
/* 358 */             MainMemory.setI8(i26, MainMemory.getI8(135360 + (i23 & 0x3F)));
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */             i20 += 1;
/*     */             
/* 368 */             i21 = i23;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 373 */           MainMemory.setI8(i26, (byte)0);
/*     */           
/*     */ 
/*     */           label1162:
/*     */           
/*     */ 
/* 379 */           SystemLibrary.sprintf(i1, 70560, new Object[] { Integer.valueOf(i2) });
/* 380 */           i18 = SystemLibrary.strlen(n);
/* 381 */           if (MathUtils.ugt(SystemLibrary.strlen(i1) + i18, 1199)) {
/* 382 */             i16 = 104;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 392 */             SystemLibrary.strcat(n, i1);
/*     */           }
/*     */           
/*     */         }
/*     */         else
/*     */         {
/* 398 */           SystemLibrary.sprintf(i1, 86752, new Object[] { Double.valueOf(3.2699999809265137D) });
/* 399 */           i18 = SystemLibrary.strlen(n);
/* 400 */           if (MathUtils.ugt(SystemLibrary.strlen(i1) + i18, 1199)) {
/* 401 */             i16 = 104;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 411 */             SystemLibrary.strcat(n, i1);
/* 412 */             SystemLibrary.sprintf(i1, 58688, new Object[] { Integer.valueOf(i5), Integer.valueOf(MainMemory.getI32(i9)) });
/* 413 */             i18 = SystemLibrary.strlen(n);
/* 414 */             if (MathUtils.ugt(SystemLibrary.strlen(i1) + i18, 1199)) {
/* 415 */               i16 = 104;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 425 */               SystemLibrary.strcat(n, i1);
/* 426 */               i18 = SystemLibrary.strlen(n);
/* 427 */               i20 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 434 */                 if (i20 >= i18)
/*     */                 {
/*     */ 
/*     */ 
/* 438 */                   i16 = i20;
/* 439 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 445 */                 i23 = send.call(i16, n + i20, i18 - i20, 0);
/* 446 */                 if (i23 < 1) {
/* 447 */                   i16 = i23;
/* 448 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 457 */                 i20 = i23 + i20;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */               MainMemory.setI32(j, i16);
/* 465 */               if (SystemLibrary.fgets(m, 1200, MainMemory.getI32(paramInt2)) != 0) {
/*     */                 break label1554;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 475 */               SystemLibrary.sprintf(i3, 94240, new Object[] { Integer.valueOf(m) });
/* 476 */               ffxmsg.call(5, i3);
/* 477 */               SystemLibrary.fclose(MainMemory.getI32(paramInt2));
/* 478 */               i = 104;
/*     */               
/*     */ 
/*     */               break label2179;
/*     */               
/*     */               label1554:
/*     */               
/* 485 */               MainMemory.setI32(paramInt4, 0);
/* 486 */               MainMemory.setI8(paramInt3, (byte)0);
/* 487 */               SystemLibrary.sscanf(m, 27136, new int[] { n, j });
/* 488 */               i16 = MainMemory.getI32(j);
/* 489 */               if (i16 != 200) {
/*     */                 break label1863;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 499 */         if (SystemLibrary.fgets(m, 1200, MainMemory.getI32(paramInt2)) == 0) {
/* 500 */           i16 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 510 */         else if (MainMemory.getI8(m) == 13) {
/* 511 */           i16 = 0;
/*     */         } else {
/*     */           break label1682;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 522 */         i = i16;
/* 523 */         break;
/*     */         
/*     */ 
/*     */         label1682:
/*     */         
/*     */ 
/* 529 */         i16 = SystemLibrary.strlen(m);
/* 530 */         if (!MathUtils.ugt(i16, 3)) {
/*     */           break label1741;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 540 */         MainMemory.setI8(m + (i16 + -1), (byte)0);
/* 541 */         MainMemory.setI8(m + (SystemLibrary.strlen(m) + -1), (byte)0);
/*     */         
/*     */ 
/*     */         label1741:
/*     */         
/*     */ 
/* 547 */         SystemLibrary.sscanf(m, 27136, new int[] { n, k });
/* 548 */         if (SystemLibrary.strcmp(n, 57248) != 0) {
/*     */           break label1800;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */         MainMemory.setI32(paramInt4, MainMemory.getI32(k));
/*     */         
/*     */ 
/*     */         label1800:
/*     */         
/*     */ 
/* 564 */         if (SystemLibrary.strcmp(n, 59840) != 0) {}
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 574 */         paramInt1 = SystemLibrary.strchr(m, 58);
/* 575 */         if (paramInt1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 585 */           SystemLibrary.strcpy(paramInt3, paramInt1 + 2);
/*     */         }
/*     */       }
/*     */       
/*     */       label1863:
/* 590 */       if (!MathUtils.ult(i16 + 65235, 2)) {
/*     */         break label2084;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 600 */       if (i16 != 301) {
/*     */         break label1926;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 610 */       ffxmsg.call(5, 125344);
/*     */       
/*     */       break label1937;
/*     */       
/*     */       label1926:
/* 615 */       ffxmsg.call(5, 105248);
/*     */       
/*     */ 
/*     */       label1937:
/*     */       
/*     */ 
/* 621 */       ffxmsg.call(5, i14);
/*     */       
/*     */       label1992:
/*     */       
/*     */       do
/*     */       {
/* 627 */         if (SystemLibrary.fgets(m, 1200, MainMemory.getI32(paramInt2)) != 0) {
/*     */           break label1992;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 637 */         ffxmsg.call(5, 138816);
/* 638 */         break;
/*     */         
/*     */ 
/*     */ 
/* 642 */         paramInt1 = SystemLibrary.strstr(m, 48064);
/* 643 */       } while (paramInt1 == 0);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */       SystemLibrary.strcpy(i14, SystemLibrary.strtok(paramInt1 + 16, 14144));
/* 654 */       SystemLibrary.sprintf(i3, 35840, new Object[] { Integer.valueOf(i8) });
/* 655 */       ffxmsg.call(5, i3);
/* 656 */       SystemLibrary.fclose(MainMemory.getI32(paramInt2));
/* 657 */       i = call(i14, paramInt2, paramInt3, paramInt4);
/*     */       
/*     */ 
/*     */       break label2179;
/*     */       
/*     */       label2084:
/*     */       
/* 664 */       SystemLibrary.fclose(MainMemory.getI32(paramInt2));
/* 665 */       i = 104;
/*     */       
/*     */ 
/*     */       break label2179;
/*     */       
/*     */       label2106:
/*     */       
/* 672 */       SystemLibrary.sprintf(i3, 77568, new Object[] { Integer.valueOf(paramInt1) });
/* 673 */       ffxmsg.call(5, i3);
/* 674 */       i = 104;
/*     */       
/*     */ 
/*     */       break label2179;
/*     */       
/*     */       label2145:
/*     */       
/* 681 */       SystemLibrary.sprintf(i3, 77568, new Object[] { Integer.valueOf(paramInt1) });
/* 682 */       ffxmsg.call(5, i3);
/* 683 */       i = 104;
/*     */       
/*     */ 
/*     */       label2179:
/*     */       
/*     */ 
/* 689 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 694 */       MainMemory.dealloc_generated(i29);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F274069.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */