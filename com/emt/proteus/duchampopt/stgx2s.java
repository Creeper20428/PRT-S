/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class stgx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2849;
/*  12 */   public static final Function _instance = new stgx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public stgx2s() { super("stgx2s", 10, false); }
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
/*  68 */     double d2 = 0.0D;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*  72 */     boolean bool = false;
/*  73 */     double d3 = 0.0D;
/*  74 */     int i4 = 0;
/*  75 */     int i5 = 0;
/*  76 */     int i6 = 0;
/*  77 */     int i7 = 0;
/*  78 */     int i8 = 0;
/*  79 */     double d4 = 0.0D;
/*  80 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  86 */       if (paramInt1 == 0) {
/*  87 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  97 */         if (MainMemory.getI32(paramInt1) != 104)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           if (stgset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 111 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label773;
/*     */           }
/*     */         }
/*     */         
/* 118 */         bool = paramInt3 > 0;
/* 119 */         j = bool ? paramInt2 : 1;
/* 120 */         m = bool ? paramInt3 : 1;
/* 121 */         paramInt3 = bool ? paramInt3 : paramInt2;
/* 122 */         if (paramInt2 <= 0) {
/*     */           break label196;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         stgx2s_1674.call(paramInt5, paramInt4, paramInt8, paramInt6, paramInt2, paramInt1, m);
/*     */         
/*     */ 
/*     */         label196:
/*     */         
/*     */ 
/* 138 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 142 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 149 */           paramInt6 = paramInt1 + 352;
/* 150 */           k = paramInt1 + 368;
/* 151 */           if (j <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 155 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 162 */             paramInt2 = j * paramInt5 << 3;
/* 163 */             m = j << 2;
/*     */             
/*     */ 
/*     */ 
/* 167 */             n = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 177 */               d2 = MainMemory.getF64(paramInt7 + (n * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 178 */               d1 = d2 * d2;
/* 179 */               d2 = -0.0D - d2;
/* 180 */               i1 = paramInt9 + paramInt2;
/* 181 */               i2 = paramInt8 + paramInt2;
/* 182 */               i3 = paramInt10 + m;
/* 183 */               bool = MathUtils.f_oeq(d2, 0.0D);
/* 184 */               d3 = MathUtils.f_oge(d2, 0.0D) ? 0.0D : 180.0D;
/* 185 */               i4 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 192 */                 i5 = i4 * paramInt5;
/* 193 */                 i6 = paramInt9 + (i5 << 3);
/* 194 */                 i7 = paramInt8 + (i5 << 3);
/* 195 */                 i8 = paramInt10 + (i4 << 2);
/* 196 */                 d4 = MainMemory.getF64(i7);
/* 197 */                 d5 = d4 * d4;
/* 198 */                 d5 += d1;
/* 199 */                 d5 = SystemLibrary.sqrt(d5);
/* 200 */                 if (MathUtils.f_oeq(d5, 0.0D)) {
/* 201 */                   d4 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 211 */                 else if (MathUtils.f_oeq(d4, 0.0D)) {
/* 212 */                   d4 = d3;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 222 */                   if (!bool) {
/*     */                     break label532;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */                   if (MathUtils.f_ogt(d4, 0.0D)) {
/* 233 */                     d4 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 243 */                   else if (MathUtils.f_olt(d4, 0.0D)) {
/* 244 */                     d4 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label532:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */                     d4 = SystemLibrary.atan2(d4, d2) * 180.0D;
/* 255 */                     d4 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */                 MainMemory.setF64(i7, d4);
/* 264 */                 d5 = MainMemory.getF64(k) * d5;
/* 265 */                 if (MathUtils.f_oeq(d5, -1.0D)) {
/* 266 */                   d5 = 180.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 276 */                 else if (MathUtils.f_oeq(d5, 0.0D)) {
/* 277 */                   d5 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 287 */                 else if (MathUtils.f_oeq(d5, 1.0D)) {
/* 288 */                   d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 298 */                   d5 = SystemLibrary.atan(d5) * 180.0D;
/* 299 */                   d5 /= 3.141592653589793D;
/* 300 */                   d5 *= -2.0D;
/* 301 */                   d5 += 90.0D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */                 MainMemory.setF64(i6, d5);
/* 310 */                 MainMemory.setI32(i8, 0);
/* 311 */                 i4 += 1;
/* 312 */                 if (i4 == j) {
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
/* 323 */               paramInt8 = i1;
/* 324 */               i6 = i2;
/* 325 */               paramInt10 = i3;
/* 326 */               n += 1;
/* 327 */               if (n == paramInt3) {
/* 328 */                 paramInt2 = 0; break;
/*     */               }
/*     */               
/*     */ 
/* 332 */               paramInt9 = paramInt8;
/* 333 */               paramInt8 = i6;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label773:
/*     */       
/*     */ 
/* 343 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */       int i9 = i;return i9;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stgx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */