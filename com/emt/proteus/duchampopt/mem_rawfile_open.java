/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class mem_rawfile_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3061;
/*  18 */   public static final Function _instance = new mem_rawfile_open();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public mem_rawfile_open() { super("mem_rawfile_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = call(i, j, k);
/*  40 */     paramFrame.setI32(paramInt1, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     byte b = 0;
/*  61 */     int i9 = 0;
/*  62 */     int i10 = 0;
/*  63 */     int i11 = 0;
/*  64 */     int i12 = 0;
/*  65 */     int i13 = 0;
/*  66 */     int i14 = 0;
/*  67 */     int i15 = 0;
/*  68 */     int i16 = 0;
/*  69 */     int i17 = 0;
/*  70 */     int i18 = 0;
/*  71 */     int i19 = 0;
/*  72 */     int i20 = 0;
/*  73 */     int i21 = 0;
/*  74 */     int i22 = 0;
/*  75 */     int i23 = 0;
/*  76 */     boolean bool = false;
/*  77 */     int i24 = 0;
/*  78 */     int i25 = 0;
/*  79 */     short s = 0;
/*  80 */     int i26 = 0;
/*  81 */     int i27 = 0;
/*  82 */     int i28 = 0;
/*  83 */     int i29 = 0;
/*  84 */     int i30 = 0;
/*  85 */     int i31 = 0;
/*     */     
/*     */ 
/*  88 */     int i32 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  92 */       j = MainMemory.alloc(4);
/*  93 */       k = MainMemory.alloc(4);
/*  94 */       m = MainMemory.alloc(4);
/*  95 */       n = MainMemory.alloc(20);
/*  96 */       i1 = MainMemory.alloc(4);
/*  97 */       i2 = MainMemory.alloc(1025);
/*  98 */       i3 = MainMemory.alloc(4);
/*  99 */       i4 = MainMemory.alloc(4);
/* 100 */       MainMemory.setI32(n, 1);
/* 101 */       i5 = n + 4;
/* 102 */       MainMemory.setI32(i5, 1);
/* 103 */       i6 = n + 8;
/* 104 */       MainMemory.setI32(i6, 1);
/* 105 */       i7 = n + 12;
/* 106 */       MainMemory.setI32(i7, 1);
/* 107 */       i8 = n + 16;
/* 108 */       MainMemory.setI32(i8, 1);
/* 109 */       MainMemory.setI32(i1, 0);
/* 110 */       MainMemory.setI32(i3, 0);
/* 111 */       MainMemory.setI32(i4, 0);
/* 112 */       if (paramInt2 != 0) {
/*     */         break label2673;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */       i12 = SystemLibrary.strchr(paramInt1, 91);
/* 123 */       MainMemory.setI32(i3, i12);
/* 124 */       if (i12 != 0) {
/*     */         break label321;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       ffxmsg.call(5, 128032);
/* 135 */       ffxmsg.call(5, paramInt1);
/* 136 */       i = 125;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label321:
/*     */       
/* 143 */       MainMemory.setI8(i2, (byte)0);
/* 144 */       SystemLibrary.strncat(i2, paramInt1, i12 - paramInt1);
/* 145 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 152 */         paramInt2 = i10 + 1;
/* 153 */         i17 = i12 + paramInt2;
/* 154 */         b = MainMemory.getI8(i17);
/* 155 */         switch (b) {
/* 156 */         case 32:  i10 = paramInt2;
/*     */         }
/*     */         
/*     */       }
/*     */       
/*     */       break label426;
/*     */       
/*     */       break label426;
/*     */       
/*     */       break label426;
/*     */       
/*     */       break label449;
/*     */       label426:
/* 169 */       MainMemory.setI32(i3, i17);
/* 170 */       paramInt2 = 8;
/* 171 */       i9 = 1;
/*     */       
/*     */       break label797;
/*     */       
/*     */       label449:
/* 176 */       MainMemory.setI32(i3, i17);
/* 177 */       switch (b) {
/* 178 */       case 73:  paramInt2 = 16;
/* 179 */         i9 = 2;
/*     */         break label797;
/*     */         break; case 105:  paramInt2 = 16;
/* 182 */         i9 = 2;
/*     */         
/*     */ 
/*     */         break label797;
/*     */         
/*     */ 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 192 */       switch (b) {
/* 193 */       case 85:  paramInt2 = 20;
/* 194 */         i9 = 2;
/*     */         break label797;
/*     */         break; case 117:  paramInt2 = 20;
/* 197 */         i9 = 2;
/*     */         
/*     */ 
/*     */         break label797;
/*     */         
/*     */ 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 207 */       switch (b) {
/* 208 */       case 74:  paramInt2 = 32;
/* 209 */         i9 = 4;
/*     */         break label797;
/*     */         break; case 106:  paramInt2 = 32;
/* 212 */         i9 = 4;
/*     */         
/*     */ 
/*     */         break label797;
/*     */         
/*     */ 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 222 */       switch (b) {
/* 223 */       case 82:  paramInt2 = -32;
/* 224 */         i9 = 4;
/*     */         break label797;
/*     */         break; case 114:  paramInt2 = -32;
/* 227 */         i9 = 4;
/*     */         break label797;
/*     */         break; case 102:  paramInt2 = -32;
/* 230 */         i9 = 4;
/*     */         break label797;
/*     */         break; case 70:  paramInt2 = -32;
/* 233 */         i9 = 4;
/*     */         
/*     */ 
/*     */         break label797;
/*     */         
/*     */ 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 243 */       switch (b) {
/* 244 */       case 68:  paramInt2 = -64;
/* 245 */         i9 = 8;
/*     */         
/* 247 */         break;
/* 248 */       case 100:  paramInt2 = -64;
/* 249 */         i9 = 8;
/*     */         
/* 251 */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */       label797:
/*     */       
/*     */ 
/*     */ 
/* 261 */       paramInt1 = i12 + (i10 + 2);
/* 262 */       MainMemory.setI32(i3, paramInt1);
/* 263 */       switch (MainMemory.getI8(paramInt1)) {
/*     */       case 66: 
/*     */         break label927;
/*     */         break;
/*     */       case 98: 
/*     */         break label927;
/*     */         break;
/*     */       case 76:  break; case 108:  break; default:  i12 = paramInt1;
/* 271 */         i10 = 1;
/* 272 */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 279 */       paramInt1 = i12 + (i10 + 3);
/* 280 */       MainMemory.setI32(i3, paramInt1);
/* 281 */       i12 = paramInt1;
/* 282 */       i10 = 1;
/*     */       
/*     */       break label952;
/*     */       
/*     */       label927:
/* 287 */       paramInt1 = i12 + (i10 + 3);
/* 288 */       MainMemory.setI32(i3, paramInt1);
/* 289 */       i12 = paramInt1;
/* 290 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */       label952:
/*     */       
/*     */ 
/*     */ 
/* 298 */       i11 = SystemLibrary.strtol(i12, i4, 10);
/* 299 */       MainMemory.setI32(n, i11);
/* 300 */       paramInt1 = MainMemory.getI32(i4);
/* 301 */       if (paramInt1 == 0) {
/* 302 */         i13 = 1;
/* 303 */         i14 = 1;
/* 304 */         i15 = 1;
/* 305 */         i16 = 1;
/* 306 */         i17 = i12;
/*     */         
/* 308 */         i18 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 318 */       else if (MainMemory.getI8(paramInt1) != 44)
/*     */       {
/*     */ 
/*     */ 
/* 322 */         i13 = 1;
/* 323 */         i14 = 1;
/* 324 */         i15 = 1;
/* 325 */         i16 = 1;
/* 326 */         i17 = i12;
/*     */         
/* 328 */         i18 = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 335 */         i20 = SystemLibrary.strtol(paramInt1 + 1, i3, 10);
/* 336 */         MainMemory.setI32(i5, i20);
/* 337 */         i12 = MainMemory.getI32(i3);
/* 338 */         if (i12 == 0) {
/* 339 */           i13 = 1;
/* 340 */           i14 = 1;
/* 341 */           i15 = 1;
/* 342 */           i16 = i20;
/* 343 */           i17 = i12;
/*     */           
/* 345 */           i18 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 355 */         else if (MainMemory.getI8(i12) != 44)
/*     */         {
/*     */ 
/*     */ 
/* 359 */           i13 = 1;
/* 360 */           i14 = 1;
/* 361 */           i15 = 1;
/* 362 */           i16 = i20;
/* 363 */           i17 = i12;
/*     */           
/* 365 */           i18 = 2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 372 */           i15 = SystemLibrary.strtol(i12 + 1, i4, 10);
/* 373 */           MainMemory.setI32(i6, i15);
/* 374 */           paramInt1 = MainMemory.getI32(i4);
/* 375 */           if (paramInt1 == 0) {
/* 376 */             i13 = 1;
/* 377 */             i14 = 1;
/*     */             
/* 379 */             i16 = i20;
/* 380 */             i17 = i12;
/*     */             
/* 382 */             i18 = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 392 */           else if (MainMemory.getI8(paramInt1) != 44)
/*     */           {
/*     */ 
/*     */ 
/* 396 */             i13 = 1;
/* 397 */             i14 = 1;
/*     */             
/* 399 */             i16 = i20;
/* 400 */             i17 = i12;
/*     */             
/* 402 */             i18 = 3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 409 */             i14 = SystemLibrary.strtol(paramInt1 + 1, i3, 10);
/* 410 */             MainMemory.setI32(i7, i14);
/* 411 */             paramInt1 = MainMemory.getI32(i3);
/* 412 */             if (paramInt1 == 0) {
/* 413 */               i18 = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 423 */             else if (MainMemory.getI8(paramInt1) != 44)
/*     */             {
/*     */ 
/*     */ 
/* 427 */               i18 = 4;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 434 */               i18 = 5;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */             i13 = SystemLibrary.strtol(paramInt1 + 1, i4, 10);
/* 442 */             MainMemory.setI32(i8, i13);
/* 443 */             i12 = MainMemory.getI32(i4);
/*     */             
/*     */ 
/*     */ 
/* 447 */             i16 = i20;
/* 448 */             i17 = paramInt1;
/* 449 */             paramInt1 = i12;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */       paramInt1 = MathUtils.uge(paramInt1, i17) ? paramInt1 : i17;
/* 464 */       MainMemory.setI32(i3, paramInt1);
/* 465 */       if (MainMemory.getI8(paramInt1) != 58)
/*     */       {
/*     */ 
/*     */ 
/* 469 */         i19 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 476 */         i20 = SystemLibrary.strtol(paramInt1 + 1, 0, 10);
/* 477 */         i19 = i20;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 484 */       i20 = i16 * i11 * i15 * i14 * i13;
/* 485 */       i9 = i20 * i9;
/* 486 */       i21 = i9 + 2879;
/* 487 */       MainMemory.setI32(i1, 2880 - MathUtils.urem(i21, 2880) + i21);
/* 488 */       i21 = file_openfile.call(i2, 0, j);
/* 489 */       MainMemory.setI32(m, i21);
/* 490 */       if (i21 != 0) {
/*     */         break label2621;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 500 */       i21 = mem_createmem.call(MainMemory.getI32(i1), paramInt3);
/* 501 */       MainMemory.setI32(m, i21);
/* 502 */       if (i21 != 0) {
/*     */         break label2590;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 512 */       ffimem.call(k, MainMemory.getI32(512000 + MainMemory.getI32(paramInt3) * 44), i1, m);
/* 513 */       ffcrim.call(MainMemory.getI32(k), paramInt2, i18, n, m);
/* 514 */       ffclos.call(MainMemory.getI32(k), m);
/* 515 */       if (MainMemory.getI32(m) <= 0) {
/*     */         break label1700;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 525 */       ffxmsg.call(5, 121824);
/* 526 */       SystemLibrary.fclose(MainMemory.getI32(j));
/* 527 */       paramInt2 = MainMemory.getI32(paramInt3);
/* 528 */       i23 = 512000 + paramInt2 * 44;
/* 529 */       free.call(MainMemory.getI32(MainMemory.getI32(i23)));
/* 530 */       MainMemory.setI32(i23, 0);
/* 531 */       MainMemory.setI32(512000 + paramInt2 * 44 + 4, 0);
/* 532 */       i = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label1700:
/*     */       
/* 539 */       i22 = MainMemory.getI32(j);
/* 540 */       if (i19 <= 0) {
/*     */         break label1740;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 550 */       SystemLibrary.fseek(i22, i19, 0);
/*     */       
/*     */ 
/*     */       label1740:
/*     */       
/*     */ 
/* 556 */       paramInt1 = MainMemory.getI32(MainMemory.getI32(512000 + MainMemory.getI32(paramInt3) * 44));
/* 557 */       i12 = paramInt1 + 2880;
/* 558 */       if (SystemLibrary.fread(i12, 1, i9, i22) != i9)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */         MainMemory.setI32(m, 108);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 574 */       SystemLibrary.fclose(i22);
/* 575 */       if (MainMemory.getI32(m) != 0) {
/*     */         break label2524;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 585 */       if (paramInt2 != 20) {
/*     */         break label1925;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 595 */       bool = i20 > 0;
/* 596 */       if (i10 != 1) {
/*     */         break label1904;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 606 */       mem_rawfile_open_1577.call(bool, paramInt1, i16, i11, i15, i13, i14);
/*     */       
/*     */       break label1925;
/*     */       
/*     */       label1904:
/* 611 */       mem_rawfile_open_1576.call(bool, paramInt1, i16, i11, i15, i13, i14);
/*     */       
/*     */ 
/*     */       label1925:
/*     */       
/*     */ 
/* 617 */       if (i10 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */         switch (paramInt2) {
/*     */         case 16: 
/*     */           break label2379;
/*     */           break;
/*     */         case 20: 
/*     */           break label2379;
/*     */           break;
/*     */         case 32: 
/*     */           break label2254;
/*     */           break;
/*     */         case -32: 
/*     */           break label2254;
/*     */           break;
/*     */         case -64:  break; }
/* 641 */         i26 = i12;
/* 642 */         paramInt2 = i20 << 3;
/* 643 */         if (paramInt2 <= 0) {
/*     */           break label2469;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */         paramInt2 = (paramInt2 + -1 >>> 3) + 1;
/* 654 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 661 */           i27 = i26 + (i10 << 3);
/* 662 */           i28 = i27 + 7;
/* 663 */           i29 = i27 + 1;
/* 664 */           i30 = i27 + 6;
/* 665 */           i17 = i27 + 2;
/* 666 */           i31 = i27 + 5;
/* 667 */           paramInt1 = i27 + 3;
/* 668 */           i12 = i27 + 4;
/* 669 */           b = MainMemory.getI8(i27);
/* 670 */           MainMemory.setI8(i27, MainMemory.getI8(i28));
/* 671 */           MainMemory.setI8(i28, b);
/* 672 */           b = MainMemory.getI8(i29);
/* 673 */           MainMemory.setI8(i29, MainMemory.getI8(i30));
/* 674 */           MainMemory.setI8(i30, b);
/* 675 */           b = MainMemory.getI8(i17);
/* 676 */           MainMemory.setI8(i17, MainMemory.getI8(i31));
/* 677 */           MainMemory.setI8(i31, b);
/* 678 */           b = MainMemory.getI8(paramInt1);
/* 679 */           MainMemory.setI8(paramInt1, MainMemory.getI8(i12));
/* 680 */           MainMemory.setI8(i12, b);
/* 681 */           i10 += 1;
/* 682 */           if (i10 == paramInt2) { break label2469;
/* 683 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2254:
/*     */         
/*     */ 
/* 692 */         m = i12;
/* 693 */         if (i20 > 0) {
/* 694 */           paramInt2 = 0;
/*     */         } else {
/*     */           break label2469;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 705 */           i8 = m + (paramInt2 << 2);
/* 706 */           paramInt1 = i8;
/* 707 */           i12 = paramInt1 + 1;
/* 708 */           i17 = paramInt1 + 2;
/* 709 */           i31 = paramInt1 + 3;
/* 710 */           i10 = MainMemory.getI32(i8);
/* 711 */           paramInt2 += 1;
/* 712 */           MainMemory.setI8(paramInt1, (byte)(i10 >>> 24));
/* 713 */           MainMemory.setI8(i12, (byte)(i10 >>> 16));
/* 714 */           MainMemory.setI8(i17, (byte)(i10 >>> 8));
/* 715 */           MainMemory.setI8(i31, (byte)i10);
/* 716 */           if (paramInt2 == i20) { break label2469;
/* 717 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2379:
/*     */         
/*     */ 
/* 726 */         i24 = i12;
/* 727 */         if (i20 > 0) {
/* 728 */           paramInt2 = 0;
/*     */         } else {
/*     */           break label2469;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 739 */           i25 = i24 + (paramInt2 << 1);
/* 740 */           paramInt1 = i25;
/* 741 */           i12 = paramInt1 + 1;
/* 742 */           s = MainMemory.getI16(i25);
/* 743 */           paramInt2 += 1;
/* 744 */           MainMemory.setI8(paramInt1, (byte)MathUtils.lshr(s, 8));
/* 745 */           MainMemory.setI8(i12, (byte)s);
/* 746 */           if (paramInt2 == i20) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2469:
/*     */       
/*     */ 
/* 757 */       MainMemory.setI64(512000 + MainMemory.getI32(paramInt3) * 44 + 24, 0L);
/* 758 */       MainMemory.setI64(512000 + MainMemory.getI32(paramInt3) * 44 + 32, MainMemory.getI32(i1) & 0xFFFFFFFF);
/* 759 */       i = 0;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2524:
/*     */       
/* 766 */       paramInt2 = MainMemory.getI32(paramInt3);
/* 767 */       i23 = 512000 + paramInt2 * 44;
/* 768 */       free.call(MainMemory.getI32(MainMemory.getI32(i23)));
/* 769 */       MainMemory.setI32(i23, 0);
/* 770 */       MainMemory.setI32(512000 + paramInt2 * 44 + 4, 0);
/* 771 */       ffxmsg.call(5, 130400);
/* 772 */       i = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2590:
/*     */       
/* 779 */       ffxmsg.call(5, 109920);
/* 780 */       SystemLibrary.fclose(MainMemory.getI32(j));
/* 781 */       i = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2621:
/*     */       
/* 788 */       ffxmsg.call(5, 115872);
/* 789 */       ffxmsg.call(5, i2);
/* 790 */       i = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */ 
/*     */       break label2692;
/*     */       
/*     */ 
/* 797 */       ffxmsg.call(5, 120032);
/* 798 */       ffxmsg.call(5, paramInt1);
/* 799 */       i = 125;
/*     */       
/*     */ 
/*     */       break label2692;
/*     */       
/*     */       label2673:
/*     */       
/* 806 */       ffxmsg.call(5, 135264);
/* 807 */       ffxmsg.call(5, paramInt1);
/* 808 */       i = 112;
/*     */       
/*     */ 
/*     */       label2692:
/*     */       
/*     */ 
/* 814 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 819 */       MainMemory.dealloc_generated(i32);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_rawfile_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */