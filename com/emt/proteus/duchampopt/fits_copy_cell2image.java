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
/*     */ 
/*     */ public final class fits_copy_cell2image
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3002;
/*  22 */   public static final Function _instance = new fits_copy_cell2image();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public fits_copy_cell2image() { super("fits_copy_cell2image", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  29 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i1 = call(i, j, k, m, n);
/*  50 */     paramFrame.setI32(paramInt1, i1);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  56 */     int i = 0;
/*     */     
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*  65 */     int i4 = 0;
/*  66 */     int i5 = 0;
/*  67 */     int i6 = 0;
/*  68 */     int i7 = 0;
/*  69 */     int i8 = 0;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*  75 */     int i14 = 0;
/*  76 */     int i15 = 0;
/*  77 */     int i16 = 0;
/*  78 */     int i17 = 0;
/*  79 */     int i18 = 0;
/*  80 */     int i19 = 0;
/*  81 */     long l1 = 0L;
/*  82 */     int i20 = 0;
/*  83 */     int i21 = 0;
/*  84 */     long l2 = 0L;
/*  85 */     long l3 = 0L;
/*     */     
/*     */ 
/*  88 */     int i22 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  92 */       j = MainMemory.alloc(71);
/*  93 */       k = MainMemory.alloc(30000);
/*  94 */       m = MainMemory.alloc(4);
/*  95 */       n = MainMemory.alloc(4);
/*  96 */       i1 = MainMemory.alloc(4);
/*  97 */       i2 = MainMemory.alloc(4);
/*  98 */       i3 = MainMemory.alloc(4);
/*  99 */       i4 = MainMemory.alloc(4);
/* 100 */       i5 = MainMemory.alloc(72);
/* 101 */       i6 = MainMemory.alloc(8);
/* 102 */       i7 = MainMemory.alloc(8);
/* 103 */       i8 = MainMemory.alloc(8);
/* 104 */       i9 = MainMemory.alloc(8);
/* 105 */       i10 = MainMemory.alloc(8);
/* 106 */       i11 = MainMemory.alloc(4);
/* 107 */       i12 = MainMemory.alloc(4);
/* 108 */       i13 = MainMemory.alloc(8);
/* 109 */       i14 = MainMemory.alloc(8);
/* 110 */       i15 = MainMemory.alloc(20);
/* 111 */       i16 = MainMemory.alloc(81);
/* 112 */       i17 = MainMemory.alloc(81);
/* 113 */       i18 = MainMemory.alloc(560);
/* 114 */       SystemLibrary.memcpy(i17, 144096, 81, 1);
/* 115 */       SystemLibrary.memcpy(i18, 151904, 560, 4);
/* 116 */       i19 = MainMemory.getI32(paramInt5);
/* 117 */       if (i19 <= 0) {
/*     */         break label300;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       i = i19;
/*     */       
/*     */ 
/*     */       break label1462;
/*     */       
/*     */       label300:
/*     */       
/* 134 */       ffgcnn.call(paramInt1, 0, paramInt3, j, n, paramInt5);
/* 135 */       if (MainMemory.getI32(paramInt5) <= 0) {
/*     */         break label361;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       ffxmsg.call(5, 121632);
/* 146 */       ffxmsg.call(5, paramInt3);
/* 147 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       break label1462;
/*     */       
/*     */       label361:
/*     */       
/* 154 */       i19 = MainMemory.getI32(n);
/* 155 */       if (ffgcprll.call(paramInt1, i19, paramInt4, 1L, 1L, 0, i13, i14, i15, i11, i1, i3, i7, i8, i12, i6, i9, m, i10, k, paramInt5) <= 0) {
/*     */         break label442;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       break label1462;
/*     */       
/*     */       label442:
/*     */       
/* 172 */       ffkeyn.call(12960, i19, i17, i4);
/* 173 */       ffgcnn.call(paramInt1, 0, i17, paramInt3, n, i4);
/* 174 */       if (MainMemory.getI32(m) != 2) {
/*     */         break label1432;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */       i19 = MainMemory.getI32(i1);
/* 185 */       if (i19 >= 0) {
/*     */         break label552;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */       i19 = 0 - i19;
/* 196 */       MainMemory.setI32(i1, i19);
/* 197 */       MainMemory.setI32(i2, 1);
/* 198 */       MainMemory.setI64(i5, MainMemory.getI64(i6));
/*     */       
/*     */       break label572;
/*     */       
/*     */       label552:
/*     */       
/* 204 */       ffgtdmll.call(paramInt1, MainMemory.getI32(n), i2, i5, paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */       label572:
/*     */       
/*     */ 
/*     */ 
/* 212 */       if (MainMemory.getI32(paramInt5) <= 0) {
/*     */         break label616;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */       ffxmsg.call(5, 96160);
/* 223 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       break label1462;
/*     */       
/*     */       label616:
/*     */       
/* 230 */       switch (i19) {
/*     */       case 11: 
/*     */         break label880;
/*     */         break;
/*     */       case 21: 
/*     */         break label857;
/*     */         break;
/*     */       case 41: 
/*     */         break label834;
/*     */         break;
/*     */       case 42: 
/*     */         break label811;
/*     */         break;
/*     */       case 82:  break label788;
/*     */         break; case 81:  break label765;
/*     */         break; case 14:  break; }
/* 246 */       l1 = MainMemory.getI64(i6);
/* 247 */       i19 = 8;
/*     */       
/*     */       break label896;
/*     */       
/*     */       label765:
/*     */       
/* 253 */       l1 = MainMemory.getI64(i6) << 3;
/* 254 */       i19 = 64;
/*     */       
/*     */       break label896;
/*     */       
/*     */       label788:
/*     */       
/* 260 */       l1 = MainMemory.getI64(i6) << 3;
/* 261 */       i19 = -64;
/*     */       
/*     */       break label896;
/*     */       
/*     */       label811:
/*     */       
/* 267 */       l1 = MainMemory.getI64(i6) << 2;
/* 268 */       i19 = -32;
/*     */       
/*     */       break label896;
/*     */       
/*     */       label834:
/*     */       
/* 274 */       l1 = MainMemory.getI64(i6) << 2;
/* 275 */       i19 = 32;
/*     */       
/*     */       break label896;
/*     */       
/*     */       label857:
/*     */       
/* 281 */       l1 = MainMemory.getI64(i6) << 1;
/* 282 */       i19 = 16;
/*     */       
/*     */       break label896;
/*     */       
/*     */       label880:
/*     */       
/* 288 */       l1 = MainMemory.getI64(i6);
/* 289 */       i19 = 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label896:
/*     */       
/*     */ 
/*     */ 
/* 298 */       if (ffcrimll.call(paramInt2, i19, MainMemory.getI32(i2), i5, paramInt5) <= 0) {
/*     */         break label950;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */       ffxmsg.call(5, 136896);
/* 309 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       break label1462;
/*     */       
/*     */       label950:
/*     */       
/* 316 */       fits_translate_keywords.call(paramInt1, paramInt2, i18, MainMemory.getI32(n), paramInt5);
/* 317 */       SystemLibrary.sprintf(i16, 130208, new Object[] { Integer.valueOf(paramInt4), Integer.valueOf(paramInt3) });
/* 318 */       i20 = paramInt1 + 4;
/* 319 */       paramInt4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 326 */         i21 = MainMemory.getI32(i20);
/* 327 */         if (MainMemory.getI32(i21 + 1216 + (paramInt4 << 2)) <= -1) {
/*     */           break label1052;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */         fits_copy_cell2image_1456.call(i21, paramInt4, paramInt5);
/*     */         
/*     */ 
/*     */         label1052:
/*     */         
/*     */ 
/* 343 */         paramInt4 += 1;
/* 344 */         if (paramInt4 == 40) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */       if (MainMemory.getI32(paramInt5) != 112)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */         fits_copy_cell2image_1455.call(i20);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 371 */       ffmbyt.call(paramInt1, MainMemory.getI64(i7), 1, paramInt5);
/* 372 */       l3 = l1 > 30000L ? 30000L : l1;
/* 373 */       ffgbyt.call(paramInt1, l3, k, paramInt5);
/* 374 */       ffptbb.call(paramInt2, 1L, 1L, l3, k, paramInt5);
/* 375 */       l1 -= l3;
/* 376 */       l3 += 1L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */       while (l1 != 0L)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */         if (MainMemory.getI32(paramInt5) >= 1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 406 */         l2 = l1 > 30000L ? 30000L : l1;
/* 407 */         i21 = MainMemory.getI32(i20);
/* 408 */         paramInt4 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(i21 + 4) * 84 + 76), MainMemory.getI32(i21), k, (int)l2);
/* 409 */         if (paramInt4 != 107) {
/*     */           break label1312;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 419 */         MainMemory.setI32(paramInt5, 107);
/*     */         
/*     */         break label1325;
/*     */         
/*     */         label1312:
/* 424 */         fits_copy_cell2image_1457.call(i21, paramInt4, paramInt5);
/*     */         
/*     */ 
/*     */         label1325:
/*     */         
/*     */ 
/* 430 */         ffptbb.call(paramInt2, 1L, l3, l2, k, paramInt5);
/* 431 */         l1 -= l2;
/* 432 */         l3 = l2 + l3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 439 */       ffrdef.call(paramInt2, paramInt5);
/* 440 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */       break label1462;
/*     */       
/*     */ 
/* 447 */       ffxmsg.call(5, 124960);
/* 448 */       ffxmsg.call(5, paramInt3);
/* 449 */       ffxmsg.call(5, i15);
/* 450 */       ffxmsg.call(5, 119904);
/* 451 */       MainMemory.setI32(paramInt5, 261);
/* 452 */       i = 261;
/*     */       
/*     */ 
/*     */       break label1462;
/*     */       
/*     */       label1432:
/*     */       
/* 459 */       ffxmsg.call(5, 88608);
/* 460 */       ffxmsg.call(5, 107232);
/* 461 */       MainMemory.setI32(paramInt5, 227);
/* 462 */       i = 227;
/*     */       
/*     */ 
/*     */       label1462:
/*     */       
/*     */ 
/* 468 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 473 */       MainMemory.dealloc_generated(i22);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_copy_cell2image.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */