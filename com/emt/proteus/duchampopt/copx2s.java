/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class copx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2867;
/*  12 */   public static final Function _instance = new copx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public copx2s() { super("copx2s", 10, false); }
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
/*  72 */     double d1 = 0.0D;
/*  73 */     double d2 = 0.0D;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     int i13 = 0;
/*  82 */     double d3 = 0.0D;
/*  83 */     double d4 = 0.0D;
/*  84 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
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
/* 101 */         if (MainMemory.getI32(paramInt1) != 501)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           if (copset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 115 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label919;
/*     */           }
/*     */         }
/*     */         
/* 122 */         j = paramInt3 > 0 ? 1 : 0;
/* 123 */         i4 = j != 0 ? paramInt3 : 1;
/* 124 */         k = j != 0 ? paramInt2 : 1;
/* 125 */         paramInt3 = j != 0 ? paramInt3 : paramInt2;
/* 126 */         if (paramInt2 <= 0) {
/*     */           break label209;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         copx2s_507.call(paramInt8, paramInt6, paramInt1, paramInt4, i4, paramInt2, paramInt5);
/*     */         
/*     */ 
/*     */         label209:
/*     */         
/*     */ 
/* 142 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 146 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 153 */           paramInt6 = paramInt1 + 376;
/* 154 */           m = paramInt1 + 352;
/* 155 */           n = paramInt1 + 24;
/* 156 */           i1 = paramInt1 + 368;
/* 157 */           i2 = paramInt1 + 400;
/* 158 */           i3 = paramInt1 + 392;
/* 159 */           if (k <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 163 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 170 */             paramInt2 = k * paramInt5 << 3;
/* 171 */             i4 = k << 2;
/*     */             
/*     */ 
/*     */ 
/* 175 */             i5 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 185 */               d1 = MainMemory.getF64(paramInt7 + (i5 * paramInt4 << 3)) + MainMemory.getF64(m);
/* 186 */               d1 = MainMemory.getF64(paramInt6) - d1;
/* 187 */               d2 = d1 * d1;
/* 188 */               i6 = paramInt9 + paramInt2;
/* 189 */               i7 = paramInt8 + paramInt2;
/* 190 */               i8 = paramInt10 + i4;
/* 191 */               i9 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 198 */                 i10 = i9 * paramInt5;
/* 199 */                 i11 = paramInt9 + (i10 << 3);
/* 200 */                 i12 = paramInt8 + (i10 << 3);
/* 201 */                 i13 = paramInt10 + (i9 << 2);
/* 202 */                 d3 = MainMemory.getF64(i12);
/* 203 */                 d4 = d3 * d3;
/* 204 */                 d4 += d2;
/* 205 */                 d4 = SystemLibrary.sqrt(d4);
/* 206 */                 if (!MathUtils.f_olt(MainMemory.getF64(n), 0.0D)) {
/*     */                   break label475;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */                 d4 = -0.0D - d4;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label475:
/*     */                 
/*     */ 
/*     */ 
/* 225 */                 if (MathUtils.f_oeq(d4, 0.0D)) {
/* 226 */                   d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 236 */                   d5 = d1 / d4;
/* 237 */                   d3 /= d4;
/* 238 */                   if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */                     break label590;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */                   if (!MathUtils.f_ult(d5, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 252 */                     d3 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 259 */                     if (MathUtils.f_olt(d5, 0.0D)) {
/* 260 */                       d3 = 180.0D;
/*     */                       
/*     */                       break label686;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label660;
/*     */                     }
/*     */                     label590:
/* 269 */                     if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                       break label660;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */                     if (MathUtils.f_ogt(d3, 0.0D)) {
/* 280 */                       d3 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 290 */                     else if (MathUtils.f_olt(d3, 0.0D)) {
/* 291 */                       d3 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label660:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */                       d3 = SystemLibrary.atan2(d3, d5) * 180.0D;
/* 302 */                       d3 /= 3.141592653589793D;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label686:
/*     */                 
/* 310 */                 d3 = MainMemory.getF64(i1) * d3;
/* 311 */                 MainMemory.setF64(i12, d3);
/* 312 */                 d3 = MainMemory.getF64(n);
/* 313 */                 d4 = MainMemory.getF64(i3) * d4;
/* 314 */                 d4 = MainMemory.getF64(i2) - d4;
/* 315 */                 if (MathUtils.f_oeq(d4, -1.0D)) {
/* 316 */                   d4 = -45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 326 */                 else if (MathUtils.f_oeq(d4, 0.0D)) {
/* 327 */                   d4 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 337 */                 else if (MathUtils.f_oeq(d4, 1.0D)) {
/* 338 */                   d4 = 45.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 348 */                   d4 = SystemLibrary.atan(d4) * 180.0D;
/* 349 */                   d4 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */                 d4 = d3 + d4;
/* 358 */                 MainMemory.setF64(i11, d4);
/* 359 */                 MainMemory.setI32(i13, 0);
/* 360 */                 i9 += 1;
/* 361 */                 if (i9 == k) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */               paramInt8 = i6;
/* 373 */               i11 = i7;
/* 374 */               paramInt10 = i8;
/* 375 */               i5 += 1;
/* 376 */               if (i5 == paramInt3) {
/* 377 */                 paramInt2 = 0; break;
/*     */               }
/*     */               
/*     */ 
/* 381 */               paramInt9 = paramInt8;
/* 382 */               paramInt8 = i11;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label919:
/*     */       
/*     */ 
/* 392 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */       int i14 = i;return i14;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/copx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */