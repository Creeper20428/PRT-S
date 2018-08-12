/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class coes2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2811;
/*  12 */   public static final Function _instance = new coes2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public coes2x() { super("coes2x", 10, false); }
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
/*  67 */     double d1 = 0.0D;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     int i5 = 0;
/*  73 */     int i6 = 0;
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     int i9 = 0;
/*  77 */     int i10 = 0;
/*  78 */     double d2 = 0.0D;
/*  79 */     double d3 = 0.0D;
/*  80 */     double d4 = 0.0D;
/*  81 */     double d5 = 0.0D;
/*  82 */     double d6 = 0.0D;
/*  83 */     int i11 = 0;
/*  84 */     int i12 = 0;
/*  85 */     int i13 = 0;
/*  86 */     int i14 = 0;
/*     */     
/*     */ 
/*  89 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  93 */       i2 = MainMemory.alloc(8);
/*  94 */       i3 = MainMemory.alloc(8);
/*  95 */       if (paramInt1 == 0) {
/*  96 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 106 */         if (MainMemory.getI32(paramInt1) != 502)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           if (coeset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 120 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1337;
/*     */           }
/*     */         }
/*     */         
/* 127 */         i1 = paramInt3 > 0 ? 1 : 0;
/* 128 */         j = i1 != 0 ? paramInt2 : 1;
/* 129 */         i6 = i1 != 0 ? paramInt3 : 1;
/* 130 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/* 131 */         if (paramInt2 <= 0) {
/*     */           break label691;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         i4 = paramInt1 + 360;
/* 142 */         i1 = i6 > 0 ? 1 : 0;
/* 143 */         i7 = paramInt5 * paramInt2;
/* 144 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 151 */           k = i11 * paramInt5;
/* 152 */           d1 = MainMemory.getF64(i4) * MainMemory.getF64(paramInt6 + (i11 * paramInt4 << 3));
/* 153 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label532;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */           d5 = d1 / 90.0D;
/* 164 */           d5 += 0.5D;
/* 165 */           m = (int)SystemLibrary.floor(d5);
/* 166 */           switch ((m > -1 ? m : 0 - m) & 0x3) {
/*     */           case 0: 
/*     */             break label510;
/*     */             break;
/*     */           case 1: 
/*     */             break label473;
/*     */             break;
/*     */           case 2: 
/*     */             break label449;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 179 */           MainMemory.setF64(i3, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 180 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label449:
/* 185 */           MainMemory.setF64(i3, 0.0D);
/* 186 */           MainMemory.setF64(i2, -1.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label473:
/* 191 */           MainMemory.setF64(i3, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 192 */           MainMemory.setF64(i2, 0.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label510:
/* 197 */           MainMemory.setF64(i3, 0.0D);
/* 198 */           MainMemory.setF64(i2, 1.0D);
/*     */           
/*     */           break label562;
/*     */           
/*     */           label532:
/* 203 */           d1 *= 3.141592653589793D;
/* 204 */           d1 /= 180.0D;
/* 205 */           SystemLibrary.sincos(d1, i3, i2);
/*     */           
/*     */ 
/*     */           label562:
/*     */           
/*     */ 
/* 211 */           if (i1 == 0) {
/*     */             break label666;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */           d1 = MainMemory.getF64(i3);
/* 222 */           d5 = MainMemory.getF64(i2);
/* 223 */           m = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 230 */             n = k + i7 * m;
/* 231 */             i5 = paramInt9 + (n << 3);
/* 232 */             MainMemory.setF64(paramInt8 + (n << 3), d1);
/* 233 */             MainMemory.setF64(i5, d5);
/* 234 */             m += 1;
/* 235 */             if (m == i6) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label666:
/*     */           
/*     */ 
/*     */ 
/* 246 */           i11 += 1;
/* 247 */           if (i11 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label691:
/*     */         
/*     */ 
/*     */ 
/* 258 */         d1 = MainMemory.getF64(paramInt1 + 352) - MainMemory.getF64(paramInt1 + 376);
/* 259 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 263 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 270 */           paramInt6 = paramInt1 + 424;
/* 271 */           i1 = j > 0 ? 1 : 0;
/* 272 */           i2 = paramInt1 + 344;
/* 273 */           i3 = paramInt1 + 384;
/* 274 */           i4 = paramInt1 + 392;
/* 275 */           i5 = paramInt1 + 400;
/* 276 */           paramInt2 = j * paramInt5 << 3;
/* 277 */           i6 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 281 */           i7 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 291 */             i8 = paramInt10;
/* 292 */             i9 = paramInt8;
/* 293 */             i10 = paramInt9;
/* 294 */             d2 = MainMemory.getF64(paramInt7 + (i7 * paramInt4 << 3));
/* 295 */             if (!MathUtils.f_oeq(d2, -90.0D)) {
/*     */               break label865;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */             d5 = MainMemory.getF64(paramInt6);
/*     */             
/*     */             break label1115;
/*     */             
/*     */             label865:
/*     */             
/* 311 */             d5 = MainMemory.getF64(i3);
/* 312 */             d6 = MainMemory.getF64(i4);
/* 313 */             d3 = MainMemory.getF64(i5);
/* 314 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */               break label1058;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */             d4 = d2 / 90.0D;
/* 325 */             d4 += -0.5D;
/* 326 */             i11 = (int)SystemLibrary.floor(d4);
/* 327 */             switch ((i11 > -1 ? i11 : 0 - i11) & 0x3) {
/*     */             case 0:  break label1045;
/*     */               break; case 1:  d2 = 0.0D;
/*     */               break label1086;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d2 = 0.0D;
/*     */               
/*     */ 
/*     */               break label1086;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 342 */             d2 = -1.0D;
/*     */             
/*     */             break label1086;
/*     */             
/*     */             label1045:
/* 347 */             d2 = 1.0D;
/*     */             
/*     */             break label1086;
/*     */             
/*     */             label1058:
/* 352 */             d2 *= 3.141592653589793D;
/* 353 */             d2 /= 180.0D;
/* 354 */             d2 = SystemLibrary.sin(d2);
/*     */             
/*     */ 
/*     */ 
/*     */             label1086:
/*     */             
/*     */ 
/*     */ 
/* 362 */             d3 *= d2;
/* 363 */             d6 -= d3;
/* 364 */             d5 *= SystemLibrary.sqrt(d6);
/*     */             
/*     */ 
/*     */ 
/*     */             label1115:
/*     */             
/*     */ 
/*     */ 
/* 372 */             if (i1 == 0) {
/*     */               break label1310;
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
/* 385 */             d6 = -0.0D - d5;
/* 386 */             i10 += paramInt2;
/* 387 */             i9 += paramInt2;
/* 388 */             i8 += i6;
/* 389 */             i11 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 396 */               k = i11 * paramInt5;
/* 397 */               i12 = paramInt9 + (k << 3);
/* 398 */               i13 = paramInt8 + (k << 3);
/* 399 */               i14 = paramInt10 + (i11 << 2);
/* 400 */               d3 = MainMemory.getF64(i13) * d5;
/* 401 */               d3 -= MainMemory.getF64(i2);
/* 402 */               MainMemory.setF64(i13, d3);
/* 403 */               d3 = MainMemory.getF64(i12) * d6;
/* 404 */               d3 -= d1;
/* 405 */               MainMemory.setF64(i12, d3);
/* 406 */               MainMemory.setI32(i14, 0);
/* 407 */               i11 += 1;
/* 408 */               if (i11 == j) {
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
/* 419 */             paramInt8 = i10;
/* 420 */             i12 = i9;
/* 421 */             paramInt10 = i8;
/* 422 */             paramInt9 = paramInt8;
/* 423 */             paramInt8 = i12;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1310:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 433 */             i7 += 1;
/* 434 */             if (i7 == paramInt3) {
/* 435 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1337:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 450 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 456 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 461 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/coes2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */