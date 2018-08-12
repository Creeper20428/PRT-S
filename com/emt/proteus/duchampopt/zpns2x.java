/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class zpns2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2841;
/*  12 */   public static final Function _instance = new zpns2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public zpns2x() { super("zpns2x", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     paramFrame.setI32(paramInt1, i6);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     int i5 = 0;
/*  72 */     int i6 = 0;
/*  73 */     int i7 = 0;
/*  74 */     int i8 = 0;
/*  75 */     int i9 = 0;
/*  76 */     double d1 = 0.0D;
/*  77 */     int i10 = 0;
/*  78 */     int i11 = 0;
/*  79 */     double d2 = 0.0D;
/*  80 */     int i12 = 0;
/*  81 */     int i13 = 0;
/*  82 */     int i14 = 0;
/*  83 */     int i15 = 0;
/*  84 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*  87 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  91 */       i1 = MainMemory.alloc(8);
/*  92 */       i2 = MainMemory.alloc(8);
/*  93 */       if (paramInt1 == 0) {
/*  94 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 104 */         if (MainMemory.getI32(paramInt1) != 107)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           if (zpnset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 118 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1211;
/*     */           }
/*     */         }
/*     */         
/* 125 */         n = paramInt3 > 0 ? 1 : 0;
/* 126 */         i4 = n != 0 ? paramInt3 : 1;
/* 127 */         j = n != 0 ? paramInt2 : 1;
/* 128 */         paramInt3 = n != 0 ? paramInt3 : paramInt2;
/* 129 */         if (paramInt2 <= 0) {
/*     */           break label671;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         n = i4 > 0 ? 1 : 0;
/* 140 */         i5 = paramInt5 * paramInt2;
/* 141 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           i11 = i10 * paramInt5;
/* 149 */           d1 = MainMemory.getF64(paramInt6 + (i10 * paramInt4 << 3));
/* 150 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label512;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           d2 = d1 / 90.0D;
/* 161 */           d2 += 0.5D;
/* 162 */           i12 = (int)SystemLibrary.floor(d2);
/* 163 */           switch ((i12 > -1 ? i12 : 0 - i12) & 0x3) {
/*     */           case 0: 
/*     */             break label490;
/*     */             break;
/*     */           case 1: 
/*     */             break label453;
/*     */             break;
/*     */           case 2: 
/*     */             break label429;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 176 */           MainMemory.setF64(i2, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 177 */           MainMemory.setF64(i1, 0.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label429:
/* 182 */           MainMemory.setF64(i2, 0.0D);
/* 183 */           MainMemory.setF64(i1, -1.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label453:
/* 188 */           MainMemory.setF64(i2, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 189 */           MainMemory.setF64(i1, 0.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label490:
/* 194 */           MainMemory.setF64(i2, 0.0D);
/* 195 */           MainMemory.setF64(i1, 1.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label512:
/* 200 */           d1 *= 3.141592653589793D;
/* 201 */           d1 /= 180.0D;
/* 202 */           SystemLibrary.sincos(d1, i2, i1);
/*     */           
/*     */ 
/*     */           label542:
/*     */           
/*     */ 
/* 208 */           if (n == 0) {
/*     */             break label646;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */           d1 = MainMemory.getF64(i2);
/* 219 */           d2 = MainMemory.getF64(i1);
/* 220 */           i12 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 227 */             i9 = i11 + i5 * i12;
/* 228 */             i3 = paramInt9 + (i9 << 3);
/* 229 */             MainMemory.setF64(paramInt8 + (i9 << 3), d1);
/* 230 */             MainMemory.setF64(i3, d2);
/* 231 */             i12 += 1;
/* 232 */             if (i12 == i4) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label646:
/*     */           
/*     */ 
/*     */ 
/* 243 */           i10 += 1;
/* 244 */           if (i10 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label671:
/*     */         
/*     */ 
/*     */ 
/* 255 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 259 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 266 */           k = paramInt1 + 444;
/* 267 */           paramInt6 = paramInt1 + 8;
/* 268 */           m = paramInt1 + 272;
/* 269 */           n = j > 0 ? 1 : 0;
/* 270 */           i1 = paramInt1 + 344;
/* 271 */           i2 = paramInt1 + 352;
/* 272 */           i3 = paramInt1 + 360;
/* 273 */           paramInt2 = j * paramInt5 << 3;
/* 274 */           i4 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 278 */           i5 = 0;
/* 279 */           i10 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 290 */             i6 = paramInt10;
/* 291 */             i7 = paramInt8;
/* 292 */             i8 = paramInt9;
/* 293 */             d1 = 90.0D - MainMemory.getF64(paramInt7 + (i5 * paramInt4 << 3));
/* 294 */             d1 *= 3.141592653589793D;
/* 295 */             d2 = d1 / 180.0D;
/* 296 */             i11 = MainMemory.getI32(k);
/* 297 */             if (i11 <= -1)
/*     */             {
/*     */ 
/*     */ 
/* 301 */               d1 = 0.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 308 */               i12 = i11 + 1;
/* 309 */               i9 = 0;
/* 310 */               d1 = 0.0D;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 318 */                 d1 *= d2;
/* 319 */                 d1 += MainMemory.getF64(paramInt1 + 16 + (i11 - i9 << 3));
/* 320 */                 i9 += 1;
/* 321 */                 if (i9 == i12) {
/*     */                   break;
/*     */                 }
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
/*     */ 
/* 335 */             d1 = MainMemory.getF64(paramInt6) * d1;
/* 336 */             if (MainMemory.getI32(m) == 0)
/*     */             {
/* 338 */               i11 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 348 */             else if (!MathUtils.f_olt(MainMemory.getF64(i3), d2))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 353 */               i11 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 360 */               i10 = 4;
/* 361 */               i11 = 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */             if (n == 0) {
/*     */               break label1183;
/*     */             }
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
/* 382 */             d2 = -0.0D - d1;
/* 383 */             i8 += paramInt2;
/* 384 */             i7 += paramInt2;
/* 385 */             i6 += i4;
/* 386 */             i12 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 393 */               i9 = i12 * paramInt5;
/* 394 */               i13 = paramInt9 + (i9 << 3);
/* 395 */               i14 = paramInt8 + (i9 << 3);
/* 396 */               i15 = paramInt10 + (i12 << 2);
/* 397 */               d3 = MainMemory.getF64(i14) * d1;
/* 398 */               d3 -= MainMemory.getF64(i1);
/* 399 */               MainMemory.setF64(i14, d3);
/* 400 */               d3 = MainMemory.getF64(i13) * d2;
/* 401 */               d3 -= MainMemory.getF64(i2);
/* 402 */               MainMemory.setF64(i13, d3);
/* 403 */               MainMemory.setI32(i15, i11);
/* 404 */               i12 += 1;
/* 405 */               if (i12 == j) {
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
/* 416 */             paramInt8 = i8;
/* 417 */             i13 = i7;
/* 418 */             paramInt10 = i6;
/* 419 */             paramInt9 = paramInt8;
/* 420 */             paramInt8 = i13;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1183:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 430 */             i5 += 1;
/* 431 */             if (i5 == paramInt3) {
/* 432 */               paramInt2 = i10; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1211:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 454 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 459 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/zpns2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */