/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class coox2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2870;
/*  12 */   public static final Function _instance = new coox2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public coox2s() { super("coox2s", 10, false); }
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
/*  85 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  91 */       if (paramInt1 == 0) {
/*  92 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 102 */         if (MainMemory.getI32(paramInt1) != 504)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */           if (cooset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 116 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1025;
/*     */           }
/*     */         }
/*     */         
/* 123 */         m = paramInt3 > 0 ? 1 : 0;
/* 124 */         i4 = m != 0 ? paramInt3 : 1;
/* 125 */         j = m != 0 ? paramInt2 : 1;
/* 126 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 127 */         if (paramInt2 <= 0) {
/*     */           break label212;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         coox2s_504.call(i4, paramInt4, paramInt6, paramInt5, paramInt8, paramInt1, paramInt2);
/*     */         
/*     */ 
/*     */         label212:
/*     */         
/*     */ 
/* 143 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 147 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 154 */           paramInt6 = paramInt1 + 376;
/* 155 */           k = paramInt1 + 352;
/* 156 */           m = j > 0 ? 1 : 0;
/* 157 */           n = paramInt1 + 24;
/* 158 */           i1 = paramInt1 + 360;
/* 159 */           i2 = paramInt1 + 368;
/* 160 */           i3 = paramInt1 + 392;
/* 161 */           paramInt2 = j * paramInt5 << 3;
/* 162 */           i4 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 166 */           i5 = 0;
/* 167 */           i10 = 0;
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
/* 178 */             d1 = MainMemory.getF64(paramInt7 + (i5 * paramInt4 << 3)) + MainMemory.getF64(k);
/* 179 */             d1 = MainMemory.getF64(paramInt6) - d1;
/* 180 */             d2 = d1 * d1;
/* 181 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */               i9 = i10;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 195 */               i6 = paramInt9 + paramInt2;
/* 196 */               i7 = paramInt8 + paramInt2;
/* 197 */               i8 = paramInt10 + i4;
/* 198 */               i9 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 207 */                 i14 = i9 * paramInt5;
/* 208 */                 i11 = paramInt9 + (i14 << 3);
/* 209 */                 i12 = paramInt8 + (i14 << 3);
/* 210 */                 i13 = paramInt10 + (i9 << 2);
/* 211 */                 d5 = MainMemory.getF64(i12);
/* 212 */                 d3 = d5 * d5;
/* 213 */                 d3 += d2;
/* 214 */                 d3 = SystemLibrary.sqrt(d3);
/* 215 */                 if (!MathUtils.f_olt(MainMemory.getF64(n), 0.0D)) {
/*     */                   break label495;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */                 d3 = -0.0D - d3;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label495:
/*     */                 
/*     */ 
/*     */ 
/* 234 */                 if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */                   break label572;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */                 if (MathUtils.f_olt(MainMemory.getF64(i1), 0.0D)) {
/* 245 */                   d5 = 0.0D;
/*     */                   
/* 247 */                   d3 = -90.0D;
/* 248 */                   i14 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 258 */                   d5 = 0.0D;
/* 259 */                   i10 = 3;
/* 260 */                   d3 = 0.0D;
/* 261 */                   i14 = 1;
/*     */                   
/*     */                   break label907;
/*     */                   
/*     */                   label572:
/* 266 */                   d4 = d1 / d3;
/* 267 */                   d5 /= d3;
/* 268 */                   if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                     break label665;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */                   if (!MathUtils.f_ult(d4, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 282 */                     d5 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 289 */                     if (MathUtils.f_olt(d4, 0.0D)) {
/* 290 */                       d5 = 180.0D;
/*     */                       
/*     */                       break label761;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label735;
/*     */                     }
/*     */                     label665:
/* 299 */                     if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */                       break label735;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */                     if (MathUtils.f_ogt(d5, 0.0D)) {
/* 310 */                       d5 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 320 */                     else if (MathUtils.f_olt(d5, 0.0D)) {
/* 321 */                       d5 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label735:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */                       d5 = SystemLibrary.atan2(d5, d4) * 180.0D;
/* 332 */                       d5 /= 3.141592653589793D;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label761:
/*     */                   
/*     */ 
/* 340 */                   d3 = MainMemory.getF64(i3) * d3;
/* 341 */                   d3 = SystemLibrary.pow(d3, MainMemory.getF64(i2));
/* 342 */                   if (MathUtils.f_oeq(d3, -1.0D))
/*     */                   {
/*     */ 
/* 345 */                     d3 = 180.0D;
/* 346 */                     i14 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 356 */                   else if (MathUtils.f_oeq(d3, 0.0D))
/*     */                   {
/*     */ 
/* 359 */                     d3 = 90.0D;
/* 360 */                     i14 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 370 */                   else if (MathUtils.f_oeq(d3, 1.0D))
/*     */                   {
/*     */ 
/* 373 */                     d3 = 0.0D;
/* 374 */                     i14 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 384 */                     d3 = SystemLibrary.atan(d3) * 180.0D;
/* 385 */                     d3 /= 3.141592653589793D;
/* 386 */                     d3 *= -2.0D;
/* 387 */                     d3 += 90.0D;
/*     */                     
/*     */ 
/*     */ 
/* 391 */                     i14 = 0;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label907:
/*     */                 
/*     */ 
/*     */ 
/* 401 */                 d5 = MainMemory.getF64(i2) * d5;
/* 402 */                 MainMemory.setF64(i12, d5);
/* 403 */                 MainMemory.setF64(i11, d3);
/* 404 */                 MainMemory.setI32(i13, i14);
/* 405 */                 i9 += 1;
/* 406 */                 if (i9 == j) {
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
/*     */ 
/* 418 */               paramInt8 = i6;
/* 419 */               i11 = i7;
/* 420 */               paramInt10 = i8;
/* 421 */               paramInt9 = paramInt8;
/* 422 */               paramInt8 = i11;
/*     */               
/* 424 */               i9 = i10;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 434 */             i5 += 1;
/* 435 */             if (i5 == paramInt3) {
/* 436 */               paramInt2 = i9; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */             i10 = i9;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1025:
/*     */       
/* 452 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 458 */       int i15 = i;return i15;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/coox2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */