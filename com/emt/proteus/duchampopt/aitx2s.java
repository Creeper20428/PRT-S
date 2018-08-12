/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class aitx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2813;
/*  12 */   public static final Function _instance = new aitx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public aitx2s() { super("aitx2s", 10, false); }
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
/*  69 */     double d1 = 0.0D;
/*  70 */     double d2 = 0.0D;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     double d3 = 0.0D;
/*  81 */     double d4 = 0.0D;
/*  82 */     double d5 = 0.0D;
/*  83 */     boolean bool = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  89 */       if (paramInt1 == 0) {
/*  90 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (MainMemory.getI32(paramInt1) != 401)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           if (aitset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 114 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1134;
/*     */           }
/*     */         }
/*     */         
/* 121 */         m = paramInt3 > 0 ? 1 : 0;
/* 122 */         i1 = m != 0 ? paramInt3 : 1;
/* 123 */         j = m != 0 ? paramInt2 : 1;
/* 124 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 125 */         if (paramInt2 <= 0) {
/*     */           break label208;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         aitx2s_482.call(paramInt8, i1, paramInt1, paramInt5, paramInt4, paramInt6, paramInt2, paramInt9);
/*     */         
/*     */ 
/*     */         label208:
/*     */         
/*     */ 
/* 141 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 145 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 152 */           paramInt6 = paramInt1 + 352;
/* 153 */           k = paramInt1 + 368;
/* 154 */           m = j > 0 ? 1 : 0;
/* 155 */           n = paramInt1 + 8;
/* 156 */           paramInt2 = j * paramInt5 << 3;
/* 157 */           i1 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 161 */           i2 = 0;
/* 162 */           i11 = 0;
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
/* 173 */             d1 = MainMemory.getF64(paramInt7 + (i2 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 174 */             d2 = d1 * d1;
/* 175 */             d2 *= MainMemory.getF64(k);
/* 176 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */               i6 = i11;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 190 */               i3 = paramInt9 + paramInt2;
/* 191 */               i4 = paramInt8 + paramInt2;
/* 192 */               i5 = paramInt10 + i1;
/* 193 */               i6 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 202 */                 i10 = i6 * paramInt5;
/* 203 */                 i7 = paramInt9 + (i10 << 3);
/* 204 */                 i8 = paramInt8 + (i10 << 3);
/* 205 */                 i9 = paramInt10 + (i6 << 2);
/* 206 */                 d3 = MainMemory.getF64(i8) - d2;
/* 207 */                 if (!MathUtils.f_olt(d3, 0.5D))
/*     */                 {
/*     */ 
/*     */ 
/* 211 */                   i10 = i11;
/*     */                   
/* 213 */                   i11 = 0;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 220 */                   bool = MathUtils.f_olt(d3, 0.4999999999999D);
/* 221 */                   i10 = bool ? 3 : i11;
/* 222 */                   i11 = bool ? 1 : 0;
/*     */                   
/* 224 */                   d3 = 0.5D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */                 d3 = SystemLibrary.sqrt(d3);
/* 235 */                 d4 = d3 * 2.0D;
/* 236 */                 d4 *= d3;
/* 237 */                 d4 += -1.0D;
/* 238 */                 d5 = MainMemory.getF64(i7) * d3;
/* 239 */                 if ((!MathUtils.f_une(d4, 0.0D)) && (!MathUtils.f_une(d5, 0.0D)))
/*     */                 {
/*     */ 
/*     */ 
/* 243 */                   d4 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 250 */                   if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                     break label643;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */                   if (!MathUtils.f_ult(d4, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 264 */                     d4 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 271 */                     if (MathUtils.f_olt(d4, 0.0D)) {
/* 272 */                       d4 = 360.0D;
/*     */                       
/*     */                       break label747;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label713;
/*     */                     }
/*     */                     label643:
/* 281 */                     if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */                       break label713;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */                     if (MathUtils.f_ogt(d5, 0.0D)) {
/* 292 */                       d4 = 180.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 302 */                     else if (MathUtils.f_olt(d5, 0.0D)) {
/* 303 */                       d4 = -180.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label713:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */                       d4 = SystemLibrary.atan2(d5, d4) * 180.0D;
/* 314 */                       d4 /= 3.141592653589793D;
/* 315 */                       d4 *= 2.0D;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label747:
/*     */                 
/* 323 */                 MainMemory.setF64(i8, d4);
/* 324 */                 d3 *= d1;
/* 325 */                 d3 /= MainMemory.getF64(n);
/* 326 */                 d4 = SystemLibrary.fabs(d3);
/* 327 */                 if (!MathUtils.f_ogt(d4, 1.0D)) {
/*     */                   break label866;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */                 bool = MathUtils.f_ogt(d4, 1.0000000000001D);
/* 338 */                 i10 = bool ? 3 : i10;
/* 339 */                 i11 = bool ? 1 : i11;
/* 340 */                 d3 = MathUtils.f_olt(d3, 0.0D) ? -90.0D : 90.0D;
/*     */                 
/*     */ 
/*     */                 break label1029;
/*     */                 
/*     */ 
/*     */                 label866:
/*     */                 
/* 348 */                 if (!MathUtils.f_ugt(d3, -1.0D)) {
/*     */                   break label973;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */                 if (MathUtils.f_oeq(d3, 0.0D))
/*     */                 {
/* 360 */                   d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 371 */                   if (!MathUtils.f_ult(d3, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */                     d4 = d3 + -1.0D;
/* 382 */                     if (MathUtils.f_olt(d4, 1.0E-10D))
/*     */                     {
/* 384 */                       d3 = 90.0D;
/*     */                       
/*     */                       break label1029;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1005;
/*     */                     }
/*     */                     
/*     */                     label973:
/* 394 */                     d4 = d3 + 1.0D;
/* 395 */                     if (MathUtils.f_ogt(d4, -1.0E-10D))
/*     */                     {
/* 397 */                       d3 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label1029;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1005:
/*     */                   
/*     */ 
/* 408 */                   d3 = SystemLibrary.asin(d3) * 180.0D;
/* 409 */                   d3 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label1029:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 421 */                 MainMemory.setF64(i7, d3);
/* 422 */                 MainMemory.setI32(i9, i11);
/* 423 */                 i6 += 1;
/* 424 */                 if (i6 == j) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/* 429 */                 i11 = i10;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */               paramInt8 = i3;
/* 437 */               i7 = i4;
/* 438 */               paramInt10 = i5;
/* 439 */               paramInt9 = paramInt8;
/* 440 */               paramInt8 = i7;
/*     */               
/* 442 */               i6 = i10;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 452 */             i2 += 1;
/* 453 */             if (i2 == paramInt3) {
/* 454 */               paramInt2 = i6; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 462 */             i11 = i6;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1134:
/*     */       
/* 470 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 476 */       int i12 = i;return i12;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/aitx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */