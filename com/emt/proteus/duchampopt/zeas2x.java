/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class zeas2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2838;
/*  12 */   public static final Function _instance = new zeas2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public zeas2x() { super("zeas2x", 10, false); }
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
/*  73 */     double d1 = 0.0D;
/*  74 */     double d2 = 0.0D;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*  84 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  88 */       i3 = MainMemory.alloc(8);
/*  89 */       i4 = MainMemory.alloc(8);
/*  90 */       if (paramInt1 == 0) {
/*  91 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 101 */         if (MainMemory.getI32(paramInt1) != 108)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           if (zeaset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 115 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1202;
/*     */           }
/*     */         }
/*     */         
/* 122 */         i2 = paramInt3 > 0 ? 1 : 0;
/* 123 */         j = i2 != 0 ? paramInt2 : 1;
/* 124 */         i5 = i2 != 0 ? paramInt3 : 1;
/* 125 */         paramInt3 = i2 != 0 ? paramInt3 : paramInt2;
/* 126 */         if (paramInt2 <= 0) {
/*     */           break label663;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         i2 = i5 > 0 ? 1 : 0;
/* 137 */         i6 = paramInt5 * paramInt2;
/* 138 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 145 */           m = k * paramInt5;
/* 146 */           d1 = MainMemory.getF64(paramInt6 + (k * paramInt4 << 3));
/* 147 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label504;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */           d2 = d1 / 90.0D;
/* 158 */           d2 += 0.5D;
/* 159 */           n = (int)SystemLibrary.floor(d2);
/* 160 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0: 
/*     */             break label482;
/*     */             break;
/*     */           case 1: 
/*     */             break label445;
/*     */             break;
/*     */           case 2: 
/*     */             break label421;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 173 */           MainMemory.setF64(i4, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 174 */           MainMemory.setF64(i3, 0.0D);
/*     */           
/*     */           break label534;
/*     */           
/*     */           label421:
/* 179 */           MainMemory.setF64(i4, 0.0D);
/* 180 */           MainMemory.setF64(i3, -1.0D);
/*     */           
/*     */           break label534;
/*     */           
/*     */           label445:
/* 185 */           MainMemory.setF64(i4, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 186 */           MainMemory.setF64(i3, 0.0D);
/*     */           
/*     */           break label534;
/*     */           
/*     */           label482:
/* 191 */           MainMemory.setF64(i4, 0.0D);
/* 192 */           MainMemory.setF64(i3, 1.0D);
/*     */           
/*     */           break label534;
/*     */           
/*     */           label504:
/* 197 */           d1 *= 3.141592653589793D;
/* 198 */           d1 /= 180.0D;
/* 199 */           SystemLibrary.sincos(d1, i4, i3);
/*     */           
/*     */ 
/*     */           label534:
/*     */           
/*     */ 
/* 205 */           if (i2 == 0) {
/*     */             break label638;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */           d1 = MainMemory.getF64(i4);
/* 216 */           d2 = MainMemory.getF64(i3);
/* 217 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 224 */             i1 = m + i6 * n;
/* 225 */             i10 = paramInt9 + (i1 << 3);
/* 226 */             MainMemory.setF64(paramInt8 + (i1 << 3), d1);
/* 227 */             MainMemory.setF64(i10, d2);
/* 228 */             n += 1;
/* 229 */             if (n == i5) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label638:
/*     */           
/*     */ 
/*     */ 
/* 240 */           k += 1;
/* 241 */           if (k == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label663:
/*     */         
/*     */ 
/*     */ 
/* 252 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 256 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 263 */           paramInt6 = paramInt1 + 360;
/* 264 */           i2 = j > 0 ? 1 : 0;
/* 265 */           i3 = paramInt1 + 344;
/* 266 */           i4 = paramInt1 + 352;
/* 267 */           paramInt2 = j * paramInt5 << 3;
/* 268 */           i5 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 272 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 282 */             d1 = MainMemory.getF64(paramInt6);
/* 283 */             d2 = 90.0D - MainMemory.getF64(paramInt7 + (i6 * paramInt4 << 3));
/* 284 */             d2 *= 0.5D;
/* 285 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */               break label942;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */             d3 = d2 / 90.0D;
/* 296 */             d3 += -0.5D;
/* 297 */             k = (int)SystemLibrary.floor(d3);
/* 298 */             switch ((k > -1 ? k : 0 - k) & 0x3) {
/*     */             case 0:  break label929;
/*     */               break; case 1:  d2 = 0.0D;
/*     */               break label970;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d2 = 0.0D;
/*     */               
/*     */ 
/*     */               break label970;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 313 */             d2 = -1.0D;
/*     */             
/*     */             break label970;
/*     */             
/*     */             label929:
/* 318 */             d2 = 1.0D;
/*     */             
/*     */             break label970;
/*     */             
/*     */             label942:
/* 323 */             d2 *= 3.141592653589793D;
/* 324 */             d2 /= 180.0D;
/* 325 */             d2 = SystemLibrary.sin(d2);
/*     */             
/*     */ 
/*     */ 
/*     */             label970:
/*     */             
/*     */ 
/*     */ 
/* 333 */             d1 *= d2;
/* 334 */             if (i2 == 0) {
/*     */               break label1175;
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
/* 347 */             d2 = -0.0D - d1;
/* 348 */             i7 = paramInt9 + paramInt2;
/* 349 */             i8 = paramInt8 + paramInt2;
/* 350 */             i9 = paramInt10 + i5;
/* 351 */             k = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 358 */               m = k * paramInt5;
/* 359 */               i10 = paramInt9 + (m << 3);
/* 360 */               i11 = paramInt8 + (m << 3);
/* 361 */               i12 = paramInt10 + (k << 2);
/* 362 */               d3 = MainMemory.getF64(i11) * d1;
/* 363 */               d3 -= MainMemory.getF64(i3);
/* 364 */               MainMemory.setF64(i11, d3);
/* 365 */               d3 = MainMemory.getF64(i10) * d2;
/* 366 */               d3 -= MainMemory.getF64(i4);
/* 367 */               MainMemory.setF64(i10, d3);
/* 368 */               MainMemory.setI32(i12, 0);
/* 369 */               k += 1;
/* 370 */               if (k == j) {
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
/* 381 */             paramInt8 = i7;
/* 382 */             i10 = i8;
/* 383 */             paramInt10 = i9;
/* 384 */             paramInt9 = paramInt8;
/* 385 */             paramInt8 = i10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1175:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 395 */             i6 += 1;
/* 396 */             if (i6 == paramInt3) {
/* 397 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1202:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 412 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 423 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/zeas2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */