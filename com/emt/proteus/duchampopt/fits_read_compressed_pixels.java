/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class fits_read_compressed_pixels
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3621;
/*  17 */   public static final Function _instance = new fits_read_compressed_pixels();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public fits_read_compressed_pixels() { super("fits_read_compressed_pixels", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  25 */     return 0;
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
/*  36 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, j, l1, l2, k, m, n, i1, i2, i3);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     int n = 0;
/*  72 */     int i1 = 0;
/*  73 */     int i2 = 0;
/*  74 */     int i3 = 0;
/*  75 */     int i4 = 0;
/*  76 */     int i5 = 0;
/*  77 */     int i6 = 0;
/*  78 */     int i7 = 0;
/*  79 */     int i8 = 0;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     int i12 = 0;
/*  84 */     int i13 = 0;
/*  85 */     int i14 = 0;
/*  86 */     int i15 = 0;
/*  87 */     int i16 = 0;
/*  88 */     int i17 = 0;
/*  89 */     int i18 = 0;
/*  90 */     int i19 = 0;
/*  91 */     int i20 = 0;
/*  92 */     int i21 = 0;
/*  93 */     int i22 = 0;
/*  94 */     int i23 = 0;
/*  95 */     int i24 = 0;
/*  96 */     int i25 = 0;
/*  97 */     int i26 = 0;
/*  98 */     int i27 = 0;
/*  99 */     long l1 = 0L;
/* 100 */     long l2 = 0L;
/* 101 */     long l3 = 0L;
/*     */     
/*     */ 
/* 104 */     int i28 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 108 */       i = MainMemory.alloc(4);
/* 109 */       j = MainMemory.alloc(24);
/* 110 */       k = MainMemory.alloc(4);
/* 111 */       m = MainMemory.alloc(24);
/* 112 */       n = MainMemory.alloc(48);
/* 113 */       i1 = MainMemory.alloc(48);
/* 114 */       i2 = MainMemory.alloc(48);
/* 115 */       if (MainMemory.getI32(paramInt8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         switch (paramInt2) {
/*     */         case 11:  break label437;
/*     */           break; case 20:  i3 = 2;
/*     */           break label458;
/*     */           break; case 21:  i3 = 2;
/*     */           break label458;
/*     */           break;
/*     */         case 40: 
/*     */           break label424;
/*     */           break;
/*     */         case 41: 
/*     */           break label411;
/*     */           break;
/*     */         case 31: 
/*     */           break label398;
/*     */           break;
/*     */         case 30: 
/*     */           break label385;
/*     */           break; case 42:  break label372;
/*     */           break; case 82:  break; case 14:  break label437;
/*     */           break; }
/* 146 */         i3 = 8;
/*     */         
/*     */         break label458;
/*     */         
/*     */         label372:
/* 151 */         i3 = 4;
/*     */         
/*     */         break label458;
/*     */         
/*     */         label385:
/* 156 */         i3 = 4;
/*     */         
/*     */         break label458;
/*     */         
/*     */         label398:
/* 161 */         i3 = 4;
/*     */         
/*     */         break label458;
/*     */         
/*     */         label411:
/* 166 */         i3 = 4;
/*     */         
/*     */         break label458;
/*     */         
/*     */         label424:
/* 171 */         i3 = 4;
/*     */         
/*     */         break label458;
/*     */         
/*     */         label437:
/* 176 */         i3 = 1;
/*     */         
/*     */ 
/*     */         break label458;
/*     */         
/* 181 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label458:
/*     */         
/*     */ 
/* 188 */         MainMemory.setI32(j, 1);
/* 189 */         MainMemory.setI64(i1, 0L);
/* 190 */         MainMemory.setI64(i2, 0L);
/* 191 */         MainMemory.setI32(m, 1);
/* 192 */         i4 = j + 4;
/* 193 */         i5 = i1 + 8;
/* 194 */         i6 = i2 + 8;
/* 195 */         i7 = m + 4;
/* 196 */         MainMemory.setI32(i4, 1);
/* 197 */         MainMemory.setI64(i5, 0L);
/* 198 */         MainMemory.setI64(i6, 0L);
/* 199 */         MainMemory.setI32(i7, 1);
/* 200 */         i7 = j + 8;
/* 201 */         i8 = i1 + 16;
/* 202 */         i9 = i2 + 16;
/* 203 */         i10 = m + 8;
/* 204 */         MainMemory.setI32(i7, 1);
/* 205 */         MainMemory.setI64(i8, 0L);
/* 206 */         MainMemory.setI64(i9, 0L);
/* 207 */         MainMemory.setI32(i10, 1);
/* 208 */         i10 = j + 12;
/* 209 */         i11 = i1 + 24;
/* 210 */         i12 = i2 + 24;
/* 211 */         i13 = m + 12;
/* 212 */         MainMemory.setI32(i10, 1);
/* 213 */         MainMemory.setI64(i11, 0L);
/* 214 */         MainMemory.setI64(i12, 0L);
/* 215 */         MainMemory.setI32(i13, 1);
/* 216 */         i13 = j + 16;
/* 217 */         i14 = i1 + 32;
/* 218 */         i15 = i2 + 32;
/* 219 */         i18 = m + 16;
/* 220 */         MainMemory.setI32(i13, 1);
/* 221 */         MainMemory.setI64(i14, 0L);
/* 222 */         MainMemory.setI64(i15, 0L);
/* 223 */         MainMemory.setI32(i18, 1);
/* 224 */         i16 = i1 + 40;
/* 225 */         i17 = i2 + 40;
/* 226 */         i18 = m + 20;
/* 227 */         MainMemory.setI32(j + 20, 1);
/* 228 */         MainMemory.setI64(i16, 0L);
/* 229 */         MainMemory.setI64(i17, 0L);
/* 230 */         MainMemory.setI32(i18, 1);
/* 231 */         i22 = MainMemory.getI32(paramInt1);
/* 232 */         i19 = paramInt1 + 4;
/* 233 */         i20 = MainMemory.getI32(i19);
/* 234 */         if (i22 != MainMemory.getI32(i20 + 64)) {
/*     */           break label838;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */         if (MainMemory.getI64(i20 + 112) != -1L) {
/*     */           break label855;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */         if (ffrdef.call(paramInt1, paramInt8) > 0) {
/* 255 */           i21 = 0;
/*     */           
/*     */           break label976;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label855;
/*     */         }
/*     */         label838:
/* 264 */         ffmahd.call(paramInt1, i22 + 1, 0, paramInt8);
/*     */         
/*     */ 
/*     */         label855:
/*     */         
/*     */ 
/* 270 */         i20 = MainMemory.getI32(i19);
/* 271 */         if (MainMemory.getI32(i20 + 68) != 0) {
/*     */           break label910;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */         i22 = MainMemory.getI32(i20 + 120);
/* 282 */         i21 = i22;
/*     */         
/*     */         break label976;
/*     */         
/*     */         label910:
/* 287 */         if (MainMemory.getI32(i20 + 1012) != 0) {
/*     */           break label956;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */         MainMemory.setI32(paramInt8, 233);
/* 298 */         i21 = 0;
/*     */         
/*     */         break label976;
/*     */         
/*     */         label956:
/* 303 */         i22 = MainMemory.getI32(i20 + 1040);
/* 304 */         i21 = i22;
/*     */         
/*     */ 
/*     */ 
/*     */         label976:
/*     */         
/*     */ 
/* 311 */         ffgisz.call(paramInt1, 6, j, paramInt8);
/* 312 */         MainMemory.setI64(n, 1L);
/* 313 */         i22 = MainMemory.getI32(j);
/* 314 */         l1 = i22;
/* 315 */         MainMemory.setI64(n + 8, l1);
/* 316 */         i23 = MainMemory.getI32(i4);
/* 317 */         l1 = i23 * l1;
/* 318 */         MainMemory.setI64(n + 16, l1);
/* 319 */         l1 = MainMemory.getI32(i7) * l1;
/* 320 */         MainMemory.setI64(n + 24, l1);
/* 321 */         l1 = MainMemory.getI32(i10) * l1;
/* 322 */         MainMemory.setI64(n + 32, l1);
/* 323 */         MainMemory.setI64(n + 40, MainMemory.getI32(i13) * l1);
/* 324 */         l1 = paramLong1 + -1L;
/* 325 */         i24 = i21 + -1;
/* 326 */         if (i24 <= -1) {
/*     */           break label1257;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */         paramLong1 = paramLong2 + -1L + l1;
/* 337 */         i25 = 0;
/*     */         
/* 339 */         paramLong2 = l1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 348 */           i26 = i24 - i25;
/* 349 */           i27 = i2 + (i26 << 3);
/* 350 */           l1 = MainMemory.getI64(n + (i26 << 3));
/* 351 */           l2 = paramLong2 / l1;
/* 352 */           MainMemory.setI64(i1 + (i26 << 3), l2);
/* 353 */           l3 = paramLong1 / l1;
/* 354 */           MainMemory.setI64(i27, l3);
/* 355 */           paramLong1 -= l3 * l1;
/* 356 */           paramLong2 -= l1 * l2;
/* 357 */           i25 += 1;
/* 358 */           if (i25 == i21) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1257:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 371 */         switch (i21)
/*     */         {
/*     */         case 1: 
/*     */           break label1792;
/*     */           break;
/*     */         case 2: 
/*     */           break label1752;
/*     */           break;
/*     */         case 3: 
/*     */           break;
/*     */         }
/*     */         
/* 383 */         paramLong1 = MainMemory.getI64(i1);
/* 384 */         if (paramLong1 != 0L) {
/*     */           break label1594;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 394 */         paramLong2 = MainMemory.getI64(i5);
/* 395 */         if (paramLong2 != 0L) {
/*     */           break label1594;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */         l1 = MainMemory.getI64(i2);
/* 406 */         if (l1 != i22 + -1) {
/*     */           break label1594;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */         l2 = MainMemory.getI64(i6);
/* 417 */         if (l2 != i23 + -1) {
/*     */           break label1594;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */         MainMemory.setI64(i1, paramLong1 + 1L);
/* 428 */         MainMemory.setI64(i2, l1 + 1L);
/* 429 */         MainMemory.setI64(i5, paramLong2 + 1L);
/* 430 */         MainMemory.setI64(i6, l2 + 1L);
/* 431 */         MainMemory.setI64(i8, MainMemory.getI64(i8) + 1L);
/* 432 */         MainMemory.setI64(i9, MainMemory.getI64(i9) + 1L);
/* 433 */         MainMemory.setI64(i11, MainMemory.getI64(i11) + 1L);
/* 434 */         MainMemory.setI64(i12, MainMemory.getI64(i12) + 1L);
/* 435 */         MainMemory.setI64(i14, MainMemory.getI64(i14) + 1L);
/* 436 */         MainMemory.setI64(i15, MainMemory.getI64(i15) + 1L);
/* 437 */         MainMemory.setI64(i16, MainMemory.getI64(i16) + 1L);
/* 438 */         MainMemory.setI64(i17, MainMemory.getI64(i17) + 1L);
/* 439 */         fits_read_compressed_img.call(paramInt1, paramInt2, i1, i2, m, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */         
/*     */ 
/*     */         break label1868;
/*     */         
/*     */         label1594:
/*     */         
/* 446 */         if (paramInt7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 456 */           MainMemory.setI32(paramInt7, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 462 */         paramLong1 = MainMemory.getI64(i2);
/* 463 */         paramLong2 = MainMemory.getI64(i6);
/* 464 */         l1 = MainMemory.getI64(i8);
/* 465 */         l2 = MainMemory.getI64(i9);
/* 466 */         if (l1 >= l2) {
/*     */           break label1693;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 476 */         MainMemory.setI64(i2, i22 + -1);
/* 477 */         MainMemory.setI64(i6, i23 + -1);
/*     */         
/*     */ 
/*     */         label1693:
/*     */         
/*     */ 
/* 483 */         fits_read_compressed_pixels_1497.call(m, paramInt2, paramInt5, l2, l1, i3, j, paramInt1, i9, paramInt6, i2, paramInt3, paramLong1, paramInt4, i5, paramInt8, i6, paramInt7, i, paramLong2, i1, k);
/*     */       }
/*     */       else
/*     */       {
/*     */         break label1868;
/*     */         
/*     */ 
/*     */ 
/*     */         label1752:
/*     */         
/*     */ 
/*     */ 
/* 495 */         fits_read_compressed_img_plane.call(paramInt1, paramInt2, i3, 0, i1, i2, m, j, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, k, paramInt8);
/*     */         
/*     */ 
/*     */         break label1868;
/*     */         
/*     */         label1792:
/*     */         
/* 502 */         MainMemory.setI64(i1, MainMemory.getI64(i1) + 1L);
/* 503 */         MainMemory.setI64(i2, MainMemory.getI64(i2) + 1L);
/* 504 */         fits_read_compressed_img.call(paramInt1, paramInt2, i1, i2, m, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*     */         
/*     */ 
/*     */ 
/*     */         break label1868;
/*     */         
/*     */ 
/* 511 */         ffxmsg.call(5, 113824);
/* 512 */         MainMemory.setI32(paramInt8, 414);
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1868:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 523 */       MainMemory.dealloc_generated(i28);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_compressed_pixels.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */