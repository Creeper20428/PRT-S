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
/*     */ public final class fits_write_compressed_pixels
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3626;
/*  17 */   public static final Function _instance = new fits_write_compressed_pixels();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public fits_write_compressed_pixels() { super("fits_write_compressed_pixels", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  54 */     call(i, j, l1, l2, k, m, n, i1);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     int n = 0;
/*  66 */     int i1 = 0;
/*  67 */     int i2 = 0;
/*  68 */     int i3 = 0;
/*  69 */     int i4 = 0;
/*  70 */     int i5 = 0;
/*  71 */     int i6 = 0;
/*  72 */     int i7 = 0;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     int i12 = 0;
/*  78 */     int i13 = 0;
/*  79 */     int i14 = 0;
/*  80 */     int i15 = 0;
/*  81 */     int i16 = 0;
/*  82 */     int i17 = 0;
/*  83 */     int i18 = 0;
/*  84 */     int i19 = 0;
/*  85 */     int i20 = 0;
/*  86 */     int i21 = 0;
/*  87 */     int i22 = 0;
/*  88 */     int i23 = 0;
/*  89 */     long l = 0L;
/*  90 */     int i24 = 0;
/*     */     
/*     */ 
/*  93 */     int i25 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  97 */       i = MainMemory.alloc(24);
/*  98 */       j = MainMemory.alloc(4);
/*  99 */       k = MainMemory.alloc(48);
/* 100 */       m = MainMemory.alloc(24);
/* 101 */       n = MainMemory.alloc(24);
/* 102 */       if (MainMemory.getI32(paramInt6) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         switch (paramInt2) {
/*     */         case 11:  break label409;
/*     */           break; case 20:  i1 = 2;
/*     */           break label430;
/*     */           break; case 21:  i1 = 2;
/*     */           break label430;
/*     */           break;
/*     */         case 40: 
/*     */           break label396;
/*     */           break;
/*     */         case 41: 
/*     */           break label383;
/*     */           break;
/*     */         case 31: 
/*     */           break label370;
/*     */           break;
/*     */         case 30: 
/*     */           break label357;
/*     */           break; case 42:  break label344;
/*     */           break; case 82:  break; case 14:  break label409;
/*     */           break; }
/* 133 */         i1 = 8;
/*     */         
/*     */         break label430;
/*     */         
/*     */         label344:
/* 138 */         i1 = 4;
/*     */         
/*     */         break label430;
/*     */         
/*     */         label357:
/* 143 */         i1 = 4;
/*     */         
/*     */         break label430;
/*     */         
/*     */         label370:
/* 148 */         i1 = 4;
/*     */         
/*     */         break label430;
/*     */         
/*     */         label383:
/* 153 */         i1 = 4;
/*     */         
/*     */         break label430;
/*     */         
/*     */         label396:
/* 158 */         i1 = 4;
/*     */         
/*     */         break label430;
/*     */         
/*     */         label409:
/* 163 */         i1 = 1;
/*     */         
/*     */ 
/*     */         break label430;
/*     */         
/* 168 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label430:
/*     */         
/*     */ 
/* 175 */         MainMemory.setI32(i, 1);
/* 176 */         MainMemory.setI32(m, 0);
/* 177 */         MainMemory.setI32(n, 0);
/* 178 */         i2 = i + 4;
/* 179 */         i3 = m + 4;
/* 180 */         i4 = n + 4;
/* 181 */         MainMemory.setI32(i2, 1);
/* 182 */         MainMemory.setI32(i3, 0);
/* 183 */         MainMemory.setI32(i4, 0);
/* 184 */         i5 = i + 8;
/* 185 */         i6 = m + 8;
/* 186 */         i7 = n + 8;
/* 187 */         MainMemory.setI32(i5, 1);
/* 188 */         MainMemory.setI32(i6, 0);
/* 189 */         MainMemory.setI32(i7, 0);
/* 190 */         i8 = i + 12;
/* 191 */         i9 = m + 12;
/* 192 */         i10 = n + 12;
/* 193 */         MainMemory.setI32(i8, 1);
/* 194 */         MainMemory.setI32(i9, 0);
/* 195 */         MainMemory.setI32(i10, 0);
/* 196 */         i11 = i + 16;
/* 197 */         i12 = m + 16;
/* 198 */         i13 = n + 16;
/* 199 */         MainMemory.setI32(i11, 1);
/* 200 */         MainMemory.setI32(i12, 0);
/* 201 */         MainMemory.setI32(i13, 0);
/* 202 */         i14 = m + 20;
/* 203 */         i15 = n + 20;
/* 204 */         MainMemory.setI32(i + 20, 1);
/* 205 */         MainMemory.setI32(i14, 0);
/* 206 */         MainMemory.setI32(i15, 0);
/* 207 */         i19 = MainMemory.getI32(paramInt1);
/* 208 */         i16 = paramInt1 + 4;
/* 209 */         i17 = MainMemory.getI32(i16);
/* 210 */         if (i19 != MainMemory.getI32(i17 + 64)) {
/*     */           break label738;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         if (MainMemory.getI64(i17 + 112) != -1L) {
/*     */           break label755;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */         if (ffrdef.call(paramInt1, paramInt6) > 0) {
/* 231 */           i18 = 0;
/*     */           
/*     */           break label876;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label755;
/*     */         }
/*     */         label738:
/* 240 */         ffmahd.call(paramInt1, i19 + 1, 0, paramInt6);
/*     */         
/*     */ 
/*     */         label755:
/*     */         
/*     */ 
/* 246 */         i17 = MainMemory.getI32(i16);
/* 247 */         if (MainMemory.getI32(i17 + 68) != 0) {
/*     */           break label810;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */         i19 = MainMemory.getI32(i17 + 120);
/* 258 */         i18 = i19;
/*     */         
/*     */         break label876;
/*     */         
/*     */         label810:
/* 263 */         if (MainMemory.getI32(i17 + 1012) != 0) {
/*     */           break label856;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */         MainMemory.setI32(paramInt6, 233);
/* 274 */         i18 = 0;
/*     */         
/*     */         break label876;
/*     */         
/*     */         label856:
/* 279 */         i19 = MainMemory.getI32(i17 + 1040);
/* 280 */         i18 = i19;
/*     */         
/*     */ 
/*     */ 
/*     */         label876:
/*     */         
/*     */ 
/* 287 */         ffgisz.call(paramInt1, 6, i, paramInt6);
/* 288 */         MainMemory.setI64(k, 1L);
/* 289 */         i19 = MainMemory.getI32(i);
/* 290 */         l = i19;
/* 291 */         MainMemory.setI64(k + 8, l);
/* 292 */         i20 = MainMemory.getI32(i2);
/* 293 */         l = i20 * l;
/* 294 */         MainMemory.setI64(k + 16, l);
/* 295 */         l = MainMemory.getI32(i5) * l;
/* 296 */         MainMemory.setI64(k + 24, l);
/* 297 */         l = MainMemory.getI32(i8) * l;
/* 298 */         MainMemory.setI64(k + 32, l);
/* 299 */         MainMemory.setI64(k + 40, MainMemory.getI32(i11) * l);
/* 300 */         l = paramLong1 + -1L;
/* 301 */         i21 = i18 + -1;
/* 302 */         if (i21 <= -1) {
/*     */           break label1161;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */         paramLong1 = paramLong2 + -1L + l;
/* 313 */         i22 = 0;
/*     */         
/* 315 */         paramLong2 = l;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 324 */           i23 = i21 - i22;
/* 325 */           i11 = n + (i23 << 2);
/* 326 */           l = MainMemory.getI64(k + (i23 << 3));
/* 327 */           i24 = (int)(paramLong2 / l);
/* 328 */           MainMemory.setI32(m + (i23 << 2), i24);
/* 329 */           i23 = (int)(paramLong1 / l);
/* 330 */           MainMemory.setI32(i11, i23);
/* 331 */           paramLong1 -= i23 * l;
/* 332 */           paramLong2 -= i24 * l;
/* 333 */           i22 += 1;
/* 334 */           if (i22 == i18) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1161:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 347 */         switch (i18)
/*     */         {
/*     */         case 1: 
/*     */           break label1644;
/*     */           break;
/*     */         case 2: 
/*     */           break label1610;
/*     */           break;
/*     */         case 3: 
/*     */           break;
/*     */         }
/*     */         
/* 359 */         i18 = MainMemory.getI32(m);
/* 360 */         if (i18 != 0) {
/*     */           break label1487;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 370 */         i21 = MainMemory.getI32(i3);
/* 371 */         if (i21 != 0) {
/*     */           break label1487;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */         i22 = MainMemory.getI32(n);
/* 382 */         if (i22 != i19 + -1) {
/*     */           break label1487;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */         i24 = MainMemory.getI32(i4);
/* 393 */         if (i24 != i20 + -1) {
/*     */           break label1487;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */         MainMemory.setI32(m, i18 + 1);
/* 404 */         MainMemory.setI32(n, i22 + 1);
/* 405 */         MainMemory.setI32(i3, i21 + 1);
/* 406 */         MainMemory.setI32(i4, i24 + 1);
/* 407 */         MainMemory.setI32(i6, MainMemory.getI32(i6) + 1);
/* 408 */         MainMemory.setI32(i7, MainMemory.getI32(i7) + 1);
/* 409 */         MainMemory.setI32(i9, MainMemory.getI32(i9) + 1);
/* 410 */         MainMemory.setI32(i10, MainMemory.getI32(i10) + 1);
/* 411 */         MainMemory.setI32(i12, MainMemory.getI32(i12) + 1);
/* 412 */         MainMemory.setI32(i13, MainMemory.getI32(i13) + 1);
/* 413 */         MainMemory.setI32(i14, MainMemory.getI32(i14) + 1);
/* 414 */         MainMemory.setI32(i15, MainMemory.getI32(i15) + 1);
/* 415 */         fits_write_compressed_img.call(paramInt1, paramInt2, m, n, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */         
/*     */ 
/*     */         break label1714;
/*     */         
/*     */         label1487:
/*     */         
/* 422 */         i18 = MainMemory.getI32(n);
/* 423 */         i21 = MainMemory.getI32(i4);
/* 424 */         i22 = MainMemory.getI32(i6);
/* 425 */         i24 = MainMemory.getI32(i7);
/* 426 */         if (i22 >= i24) {
/*     */           break label1558;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */         MainMemory.setI32(n, i19 + -1);
/* 437 */         MainMemory.setI32(i4, i20 + -1);
/*     */         
/*     */ 
/*     */         label1558:
/*     */         
/*     */ 
/* 443 */         fits_write_compressed_pixels_1514.call(i18, j, paramInt6, i21, paramInt4, m, n, paramInt5, i7, i24, paramInt3, i4, i, paramInt1, paramInt2, i1, i3, i22);
/*     */       }
/*     */       else
/*     */       {
/*     */         break label1714;
/*     */         
/*     */ 
/*     */ 
/*     */         label1610:
/*     */         
/*     */ 
/*     */ 
/* 455 */         fits_write_compressed_img_plane.call(paramInt1, paramInt2, i1, 0, m, n, i, paramInt3, paramInt4, paramInt5, j, paramInt6);
/*     */         
/*     */ 
/*     */         break label1714;
/*     */         
/*     */         label1644:
/*     */         
/* 462 */         MainMemory.setI32(m, MainMemory.getI32(m) + 1);
/* 463 */         MainMemory.setI32(n, MainMemory.getI32(n) + 1);
/* 464 */         fits_write_compressed_img.call(paramInt1, paramInt2, m, n, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */         
/*     */ 
/*     */ 
/*     */         break label1714;
/*     */         
/*     */ 
/* 471 */         ffxmsg.call(5, 113824);
/* 472 */         MainMemory.setI32(paramInt6, 413);
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1714:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */       MainMemory.dealloc_generated(i25);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_write_compressed_pixels.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */