/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class hpxs2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2796;
/*  12 */   public static final Function _instance = new hpxs2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public hpxs2x() { super("hpxs2x", 10, false); }
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
/*  76 */     int i10 = 0;
/*  77 */     int i11 = 0;
/*  78 */     double d1 = 0.0D;
/*  79 */     double d2 = 0.0D;
/*  80 */     int i12 = 0;
/*  81 */     int i13 = 0;
/*  82 */     int i14 = 0;
/*  83 */     int i15 = 0;
/*  84 */     int i16 = 0;
/*  85 */     int i17 = 0;
/*  86 */     double d3 = 0.0D;
/*  87 */     double d4 = 0.0D;
/*  88 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  94 */       if (paramInt1 == 0) {
/*  95 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 105 */         if (MainMemory.getI32(paramInt1) != 801)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           if (hpxset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 119 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1247;
/*     */           }
/*     */         }
/*     */         
/* 126 */         i3 = paramInt3 > 0 ? 1 : 0;
/* 127 */         i7 = i3 != 0 ? paramInt3 : 1;
/* 128 */         j = i3 != 0 ? paramInt2 : 1;
/* 129 */         paramInt3 = i3 != 0 ? paramInt3 : paramInt2;
/* 130 */         if (paramInt2 <= 0) {
/*     */           break label223;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         hpxs2x_1519.call(paramInt2, i7, paramInt5, paramInt8, paramInt6, paramInt1, paramInt4, paramInt9);
/*     */         
/*     */ 
/*     */         label223:
/*     */         
/*     */ 
/* 146 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 150 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 157 */           paramInt6 = paramInt1 + 376;
/* 158 */           k = paramInt1 + 444;
/* 159 */           m = paramInt1 + 32;
/* 160 */           n = paramInt1 + 432;
/* 161 */           i1 = paramInt1 + 392;
/* 162 */           i2 = paramInt1 + 352;
/* 163 */           i3 = j > 0 ? 1 : 0;
/* 164 */           i4 = paramInt1 + 344;
/* 165 */           i5 = paramInt1 + 440;
/* 166 */           i6 = paramInt1 + 424;
/* 167 */           paramInt2 = j << 2;
/* 168 */           i7 = j * paramInt5 << 3;
/*     */           
/*     */ 
/*     */ 
/* 172 */           i8 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 182 */             i9 = paramInt10;
/* 183 */             i10 = paramInt8;
/* 184 */             i12 = paramInt9;
/* 185 */             d2 = MainMemory.getF64(paramInt7 + (i8 * paramInt4 << 3));
/* 186 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */               break label534;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */             d1 = d2 / 90.0D;
/* 197 */             d1 += -0.5D;
/* 198 */             i13 = (int)SystemLibrary.floor(d1);
/* 199 */             switch ((i13 > -1 ? i13 : 0 - i13) & 0x3) {
/*     */             case 0:  break label521;
/*     */               break; case 1:  d3 = 0.0D;
/*     */               break label566;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d3 = 0.0D;
/*     */               
/*     */ 
/*     */               break label566;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 214 */             d3 = -1.0D;
/*     */             
/*     */             break label566;
/*     */             
/*     */             label521:
/* 219 */             d3 = 1.0D;
/*     */             
/*     */             break label566;
/*     */             
/*     */             label534:
/* 224 */             d1 = d2 * 3.141592653589793D;
/* 225 */             d1 /= 180.0D;
/* 226 */             d1 = SystemLibrary.sin(d1);
/* 227 */             d3 = d1;
/*     */             
/*     */ 
/*     */ 
/*     */             label566:
/*     */             
/*     */ 
/* 234 */             d1 = SystemLibrary.fabs(d3);
/* 235 */             if (!MathUtils.f_ult(MainMemory.getF64(paramInt6), d1)) {
/*     */               break label1081;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */             i11 = (MainMemory.getI32(k) != 0) || (MathUtils.f_ogt(d2, 0.0D)) ? 1 : 0;
/* 246 */             d1 = 1.0D - d1;
/* 247 */             d1 = MainMemory.getF64(m) * d1;
/* 248 */             d3 = SystemLibrary.sqrt(d1);
/* 249 */             d1 = d3 + -1.0D;
/* 250 */             d3 = MainMemory.getF64(i1) - d3;
/* 251 */             d3 = MainMemory.getF64(n) * d3;
/* 252 */             if (!MathUtils.f_olt(d2, 0.0D))
/*     */             {
/*     */ 
/*     */ 
/* 256 */               d2 = d3;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 263 */               d2 = -0.0D - d3;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */             d2 -= MainMemory.getF64(i2);
/* 272 */             if (i3 == 0) {
/*     */               break label1220;
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
/* 285 */             i9 += paramInt2;
/* 286 */             i12 += i7;
/* 287 */             i10 += i7;
/* 288 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 295 */               i14 = i13 * paramInt5;
/* 296 */               i15 = paramInt9 + (i14 << 3);
/* 297 */               i16 = paramInt8 + (i14 << 3);
/* 298 */               i17 = paramInt10 + (i13 << 2);
/* 299 */               if (i11 == 0) {
/*     */                 break label838;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */               d3 = MainMemory.getF64(i15);
/*     */               
/*     */               break label945;
/*     */               
/*     */               label838:
/*     */               
/* 315 */               d4 = MainMemory.getF64(i16) + MainMemory.getF64(i4);
/* 316 */               d3 = MainMemory.getF64(n);
/* 317 */               d4 /= d3;
/* 318 */               d5 = MainMemory.getF64(i15);
/* 319 */               if (((int)SystemLibrary.floor(d4) + MainMemory.getI32(i5) & 0x1) != 0) {
/*     */                 break label926;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */               d3 = d5 + d3;
/* 330 */               MainMemory.setF64(i15, d3);
/*     */               
/*     */               break label945;
/*     */               
/*     */               label926:
/*     */               
/* 336 */               d3 = d5 - d3;
/* 337 */               MainMemory.setF64(i15, d3);
/*     */               
/*     */ 
/*     */ 
/*     */               label945:
/*     */               
/*     */ 
/*     */ 
/* 345 */               d3 *= d1;
/* 346 */               d3 = MainMemory.getF64(i16) + d3;
/* 347 */               MainMemory.setF64(i16, d3);
/* 348 */               MainMemory.setF64(i15, d2);
/* 349 */               MainMemory.setI32(i17, 0);
/* 350 */               d3 = MainMemory.getF64(i16);
/* 351 */               if (!MathUtils.f_ogt(d3, 180.0D)) {
/*     */                 break label1033;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */               d3 = 360.0D - d3;
/* 362 */               MainMemory.setF64(i16, d3);
/*     */               
/*     */ 
/*     */               label1033:
/*     */               
/*     */ 
/* 368 */               i13 += 1;
/* 369 */               if (i13 == j) {
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
/* 380 */             paramInt10 = i9;
/* 381 */             paramInt9 = i12;
/* 382 */             paramInt8 = i10;
/*     */             
/*     */ 
/*     */             break label1220;
/*     */             
/*     */ 
/*     */             label1081:
/*     */             
/* 390 */             d1 = MainMemory.getF64(i6) * d3;
/* 391 */             d1 -= MainMemory.getF64(i2);
/* 392 */             if (i3 == 0) {
/*     */               break label1220;
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
/* 405 */             i12 += i7;
/* 406 */             i10 += i7;
/* 407 */             i9 += paramInt2;
/* 408 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 415 */               i17 = paramInt10 + (i13 << 2);
/* 416 */               MainMemory.setF64(paramInt9 + (i13 * paramInt5 << 3), d1);
/* 417 */               MainMemory.setI32(i17, 0);
/* 418 */               i13 += 1;
/* 419 */               if (i13 == j) {
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
/* 430 */             paramInt9 = i12;
/* 431 */             paramInt8 = i10;
/* 432 */             paramInt10 = i9;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1220:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */             i8 += 1;
/* 445 */             if (i8 == paramInt3) {
/* 446 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1247:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 461 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 467 */       int i18 = i;return i18;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/hpxs2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */