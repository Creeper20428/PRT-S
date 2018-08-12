/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgmf
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3435;
/*  21 */   public static final Function _instance = new ffgmf();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public ffgmf() { super("ffgmf", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  28 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i4 = call(i, j, k, m, n, i1, i2, i3);
/*  58 */     paramFrame.setI32(paramInt1, i4);
/*  59 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  64 */     int i = 0;
/*     */     
/*  66 */     int j = 0;
/*  67 */     int k = 0;
/*  68 */     int m = 0;
/*  69 */     int n = 0;
/*  70 */     int i1 = 0;
/*  71 */     int i2 = 0;
/*  72 */     int i3 = 0;
/*  73 */     int i4 = 0;
/*  74 */     int i5 = 0;
/*  75 */     int i6 = 0;
/*  76 */     int i7 = 0;
/*  77 */     int i8 = 0;
/*  78 */     int i9 = 0;
/*  79 */     int i10 = 0;
/*  80 */     int i11 = 0;
/*  81 */     int i12 = 0;
/*  82 */     int i13 = 0;
/*  83 */     int i14 = 0;
/*  84 */     int i15 = 0;
/*  85 */     int i16 = 0;
/*  86 */     int i17 = 0;
/*  87 */     int i18 = 0;
/*  88 */     int i19 = 0;
/*  89 */     int i20 = 0;
/*  90 */     int i21 = 0;
/*  91 */     int i22 = 0;
/*  92 */     int i23 = 0;
/*  93 */     int i24 = 0;
/*  94 */     int i25 = 0;
/*  95 */     int i26 = 0;
/*  96 */     int i27 = 0;
/*  97 */     int i28 = 0;
/*  98 */     int i29 = 0;
/*  99 */     int i30 = 0;
/* 100 */     int i31 = 0;
/* 101 */     int i32 = 0;
/* 102 */     int i33 = 0;
/* 103 */     int i34 = 0;
/* 104 */     int i35 = 0;
/* 105 */     int i36 = 0;
/* 106 */     byte b = 0;
/* 107 */     long l = 0L;
/* 108 */     int i37 = 0;
/* 109 */     boolean bool = false;
/*     */     
/*     */ 
/* 112 */     int i38 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 116 */       j = MainMemory.alloc(1);
/* 117 */       k = MainMemory.alloc(1);
/* 118 */       m = MainMemory.alloc(2);
/* 119 */       n = MainMemory.alloc(1025);
/* 120 */       i1 = MainMemory.alloc(4);
/* 121 */       i2 = MainMemory.alloc(4);
/* 122 */       i3 = MainMemory.alloc(4);
/* 123 */       i4 = MainMemory.alloc(4);
/* 124 */       i5 = MainMemory.alloc(4);
/* 125 */       i6 = MainMemory.alloc(4);
/* 126 */       i7 = MainMemory.alloc(4);
/* 127 */       i8 = MainMemory.alloc(4);
/* 128 */       i9 = MainMemory.alloc(4);
/* 129 */       i10 = MainMemory.alloc(4);
/* 130 */       i11 = MainMemory.alloc(4);
/* 131 */       i12 = MainMemory.alloc(1025);
/* 132 */       i13 = MainMemory.alloc(1025);
/* 133 */       i14 = MainMemory.alloc(1025);
/* 134 */       i15 = MainMemory.alloc(1025);
/* 135 */       i16 = MainMemory.alloc(1025);
/* 136 */       i17 = MainMemory.alloc(1025);
/* 137 */       i18 = MainMemory.alloc(1025);
/* 138 */       i19 = MainMemory.alloc(1025);
/* 139 */       i20 = MainMemory.alloc(1025);
/* 140 */       i21 = MainMemory.alloc(1);
/* 141 */       i22 = MainMemory.alloc(8);
/* 142 */       MainMemory.setI32(i7, 0);
/* 143 */       MainMemory.setI32(i10, 0);
/* 144 */       MainMemory.setI32(i11, 0);
/* 145 */       MainMemory.setI8(i21, (byte)0);
/* 146 */       if (MainMemory.getI32(paramInt8) != 0) {
/*     */         break label1926;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       MainMemory.setI32(paramInt7, 0);
/* 157 */       MainMemory.setI32(i22, i12);
/* 158 */       MainMemory.setI32(i22 + 4, i13);
/* 159 */       if (MainMemory.getI32(paramInt8) != 0) {
/*     */         break label1926;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */       i23 = paramInt6 == 0 ? 1 : 0;
/* 170 */       if (i23 == 0) {
/*     */         break label451;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       MainMemory.setI8(i14, (byte)0);
/*     */       
/*     */       break label545;
/*     */       
/*     */       label451:
/* 185 */       if (MainMemory.getI8(paramInt6) != 0) {
/*     */         break label488;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */       MainMemory.setI8(i14, (byte)0);
/*     */       
/*     */       break label545;
/*     */       
/*     */       label488:
/* 200 */       if (fits_is_url_absolute.call(paramInt6) != 0) {
/*     */         break label532;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */       ffgmf_1047.call(i14, i20, paramInt6, paramInt8, n);
/*     */       
/*     */       break label545;
/*     */       
/*     */       label532:
/* 215 */       SystemLibrary.strcpy(i14, paramInt6);
/*     */       
/*     */ 
/*     */       label545:
/*     */       
/*     */ 
/* 221 */       MainMemory.setI32(paramInt8, ffgtgc.call(paramInt1, i1, i2, i3, i4, i5, i6, i8, paramInt8));
/* 222 */       MainMemory.setI32(paramInt8, ffgtnm.call(paramInt1, i10, paramInt8));
/* 223 */       i24 = MainMemory.getI32(i8);
/* 224 */       i25 = MainMemory.getI32(i10);
/* 225 */       i26 = MainMemory.getI32(i1);
/* 226 */       i27 = i26 == 0 ? 1 : 0;
/* 227 */       i28 = MainMemory.getI32(i2);
/* 228 */       i29 = i28 == 0 ? 1 : 0;
/* 229 */       i30 = MainMemory.getI32(i3);
/* 230 */       i31 = i30 == 0 ? 1 : 0;
/* 231 */       i32 = MainMemory.getI32(i4);
/* 232 */       i33 = i32 == 0 ? 1 : 0;
/* 233 */       i34 = MainMemory.getI32(i5);
/* 234 */       i35 = i34 == 0 ? 1 : 0;
/* 235 */       l = 1L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 242 */         i37 = (int)l;
/* 243 */         bool = MainMemory.getI32(paramInt7) == 0;
/* 244 */         if ((i37 > i25) || (!bool)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */         if (MainMemory.getI32(paramInt8) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */         if (i27 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */           ffgcls.call(paramInt1, i26, l, 1L, 1L, 1, i21, i22, m, i9, paramInt8);
/* 275 */           if (SystemLibrary.strcasecmp(MainMemory.getI32(i22), paramInt2) != 0) {
/*     */             break label1898;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */         if (i29 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */           ffgcls.call(paramInt1, i28, l, 1L, 1L, 1, i21, i22, m, i9, paramInt8);
/* 296 */           if (SystemLibrary.strcasecmp(MainMemory.getI32(i22), paramInt3) != 0) {
/*     */             break label1898;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */         if (i31 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */           ffgclj.call(paramInt1, i30, l, 1L, 1L, 1, 1, 0, i11, k, i9, paramInt8);
/* 317 */           if (MainMemory.getI32(i11) != paramInt4) {
/*     */             break label1898;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */         if (i33 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */           switch (i24)
/*     */           {
/*     */           case 2: 
/*     */             break;
/*     */           case 12: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 349 */           if (MainMemory.getI32(paramInt8) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */             ffgclj.call(paramInt1, i32, l, 1L, 1L, 1, 1, 0, i7, j, i9, paramInt8);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 365 */           if (MainMemory.getI32(i7) != paramInt5) {
/*     */             break label1898;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */         if (i23 == 0) {
/*     */           break label1115;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */         ffxmsg.call(5, 122592);
/* 386 */         MainMemory.setI32(paramInt7, i37);
/*     */         
/*     */         break label1898;
/*     */         
/*     */         label1115:
/* 391 */         if (i35 == 0) {
/*     */           break label1149;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 401 */         MainMemory.setI8(i15, (byte)0);
/*     */         
/*     */         break label1212;
/*     */         
/*     */         label1149:
/* 406 */         ffgcls.call(paramInt1, i34, l, 1L, 1L, 1, i21, i22, m, i9, paramInt8);
/* 407 */         SystemLibrary.strcpy(i15, MainMemory.getI32(i22));
/* 408 */         MainMemory.setI8(i16, (byte)0);
/* 409 */         b = MainMemory.getI8(i15);
/* 410 */         if (b != 0) {
/*     */           break label1297;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1212:
/*     */         
/*     */ 
/*     */ 
/* 420 */         i36 = fits_get_url.call(paramInt1, i15, i16, 0, 0, 0, paramInt8);
/* 421 */         MainMemory.setI32(paramInt8, i36);
/* 422 */         b = MainMemory.getI8(i15);
/* 423 */         if (b != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */           ffgmf_1046.call(i20, b, i36, paramInt8, n, i15);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 439 */         ffgmf_1045.call(i20, i16, paramInt8, n);
/*     */         
/*     */         break label1843;
/*     */         
/*     */         label1297:
/* 444 */         if ((fits_is_url_absolute.call(i15) != 0) || (b != 47))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 454 */           SystemLibrary.strcpy(i16, i15);
/* 455 */           i36 = fits_get_url.call(paramInt1, i18, i19, 0, 0, 0, paramInt8);
/* 456 */           MainMemory.setI32(paramInt8, i36);
/* 457 */           b = MainMemory.getI8(i18);
/* 458 */           if (b != 0) {
/*     */             break label1393;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 468 */           MainMemory.setI8(i15, (byte)0);
/*     */           
/*     */           break label1595;
/*     */           
/*     */           label1393:
/* 473 */           if ((fits_is_url_absolute.call(i18) != 0) || (b != 47))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */             if (i36 != 0) {
/*     */               break label1460;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 493 */             SystemLibrary.getcwd(n, 1025);
/* 494 */             fits_path2url.call(n, i20, paramInt8);
/*     */             
/*     */ 
/*     */             label1460:
/*     */             
/*     */ 
/* 500 */             MainMemory.setI16(i20 + SystemLibrary.strlen(i20), (short)47);
/* 501 */             SystemLibrary.strcat(i20, i18);
/* 502 */             fits_clean_url.call(i20, i18, paramInt8);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 508 */           fits_relurl2url.call(i18, i15, i17, paramInt8);
/* 509 */           switch (MainMemory.getI32(paramInt8))
/*     */           {
/*     */           case 0: 
/*     */             break label1582;
/*     */             
/*     */             break;
/*     */           case 125: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 520 */           MainMemory.setI32(paramInt8, 0);
/* 521 */           MainMemory.setI8(i15, (byte)0);
/*     */           
/*     */           break label1595;
/*     */           
/*     */           label1582:
/* 526 */           SystemLibrary.strcpy(i15, i17);
/*     */           
/*     */ 
/*     */           label1595:
/*     */           
/*     */ 
/* 532 */           b = MainMemory.getI8(i19);
/* 533 */           if (b != 0) {
/*     */             break label1636;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 543 */           MainMemory.setI8(i16, (byte)0);
/*     */           
/*     */           break label1843;
/*     */           
/*     */           label1636:
/* 548 */           if ((fits_is_url_absolute.call(i19) != 0) || (b != 47))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */             if (MainMemory.getI32(paramInt8) != 0) {
/*     */               break label1706;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */             SystemLibrary.getcwd(n, 1025);
/* 569 */             fits_path2url.call(n, i20, paramInt8);
/*     */             
/*     */ 
/*     */             label1706:
/*     */             
/*     */ 
/* 575 */             MainMemory.setI16(i20 + SystemLibrary.strlen(i20), (short)47);
/* 576 */             SystemLibrary.strcat(i20, i19);
/* 577 */             fits_clean_url.call(i20, i19, paramInt8);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 583 */           fits_relurl2url.call(i19, i16, i17, paramInt8);
/* 584 */           switch (MainMemory.getI32(paramInt8))
/*     */           {
/*     */           case 0: 
/*     */             break label1830;
/*     */             
/*     */             break;
/*     */           case 125: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 595 */           MainMemory.setI32(paramInt8, 0);
/* 596 */           MainMemory.setI8(i16, (byte)0);
/*     */           
/*     */           break label1843;
/*     */           
/*     */           label1830:
/* 601 */           SystemLibrary.strcpy(i16, i17);
/*     */         }
/*     */         
/*     */ 
/*     */         label1843:
/*     */         
/* 607 */         if (SystemLibrary.strcmp(i15, i14) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 617 */           if (SystemLibrary.strcmp(i16, i14) != 0) {
/*     */             break label1898;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */         MainMemory.setI32(paramInt7, i37);
/*     */         
/*     */ 
/*     */         label1898:
/*     */         
/*     */ 
/* 633 */         l += 1L;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 639 */       ffgmf_1048.call(bool, paramInt8);
/*     */       
/*     */ 
/*     */       label1926:
/*     */       
/*     */ 
/* 645 */       i = MainMemory.getI32(paramInt8);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 651 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 656 */       MainMemory.dealloc_generated(i38);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */