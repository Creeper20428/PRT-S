/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class zeax2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2837;
/*  12 */   public static final Function _instance = new zeax2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public zeax2s() { super("zeax2s", 10, false); }
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
/*  74 */     boolean bool = false;
/*  75 */     double d3 = 0.0D;
/*  76 */     int i6 = 0;
/*  77 */     int i7 = 0;
/*  78 */     int i8 = 0;
/*  79 */     int i9 = 0;
/*  80 */     int i10 = 0;
/*  81 */     double d4 = 0.0D;
/*  82 */     double d5 = 0.0D;
/*  83 */     int i11 = 0;
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
/* 100 */         if (MainMemory.getI32(paramInt1) != 108)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           if (zeaset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 114 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label979;
/*     */           }
/*     */         }
/*     */         
/* 121 */         k = paramInt3 > 0 ? 1 : 0;
/* 122 */         i1 = k != 0 ? paramInt3 : 1;
/* 123 */         j = k != 0 ? paramInt2 : 1;
/* 124 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 125 */         if (paramInt2 <= 0) {
/*     */           break label205;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         zeax2s_1763.call(paramInt6, paramInt1, paramInt4, i1, paramInt8, paramInt2, paramInt5);
/*     */         
/*     */ 
/*     */         label205:
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
/* 153 */           k = j > 0 ? 1 : 0;
/* 154 */           m = paramInt1 + 368;
/* 155 */           n = paramInt1 + 360;
/* 156 */           paramInt2 = j * paramInt5 << 3;
/* 157 */           i1 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 161 */           i2 = 0;
/* 162 */           i7 = 0;
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
/* 173 */             d2 = MainMemory.getF64(paramInt7 + (i2 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 174 */             d1 = d2 * d2;
/* 175 */             if (k == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */               i6 = i7;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 189 */               d2 = -0.0D - d2;
/* 190 */               i3 = paramInt9 + paramInt2;
/* 191 */               i4 = paramInt8 + paramInt2;
/* 192 */               i5 = paramInt10 + i1;
/* 193 */               bool = MathUtils.f_oeq(d2, 0.0D);
/* 194 */               d3 = MathUtils.f_oge(d2, 0.0D) ? 0.0D : 180.0D;
/* 195 */               i6 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 204 */                 i11 = i6 * paramInt5;
/* 205 */                 i8 = paramInt9 + (i11 << 3);
/* 206 */                 i9 = paramInt8 + (i11 << 3);
/* 207 */                 i10 = paramInt10 + (i6 << 2);
/* 208 */                 d4 = MainMemory.getF64(i9);
/* 209 */                 d5 = d4 * d4;
/* 210 */                 d5 += d1;
/* 211 */                 d5 = SystemLibrary.sqrt(d5);
/* 212 */                 if (MathUtils.f_oeq(d5, 0.0D)) {
/* 213 */                   d4 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 223 */                 else if (MathUtils.f_oeq(d4, 0.0D)) {
/* 224 */                   d4 = d3;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 234 */                   if (!bool) {
/*     */                     break label565;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */                   if (MathUtils.f_ogt(d4, 0.0D)) {
/* 245 */                     d4 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 255 */                   else if (MathUtils.f_olt(d4, 0.0D)) {
/* 256 */                     d4 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label565:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */                     d4 = SystemLibrary.atan2(d4, d2) * 180.0D;
/* 267 */                     d4 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */                 MainMemory.setF64(i9, d4);
/* 276 */                 d4 = MainMemory.getF64(m) * d5;
/* 277 */                 if (!MathUtils.f_ogt(SystemLibrary.fabs(d4), 1.0D)) {
/*     */                   break label689;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */                 d5 -= MainMemory.getF64(n);
/* 288 */                 if (MathUtils.f_olt(SystemLibrary.fabs(d5), 1.0E-12D)) {
/* 289 */                   d5 = -90.0D;
/*     */                   break label870;
/*     */                 } else {
/* 292 */                   d5 = 0.0D;
/* 293 */                   i11 = 1;
/* 294 */                   i7 = 3;
/*     */                   
/*     */                   break label878;
/*     */                 }
/*     */                 
/*     */                 label689:
/*     */                 
/* 301 */                 if (!MathUtils.f_ugt(d4, -1.0D)) {
/*     */                   break label798;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */                 if (MathUtils.f_oeq(d4, 0.0D)) {
/* 312 */                   d5 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 322 */                   if (!MathUtils.f_ult(d4, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */                     d5 = d4 + -1.0D;
/* 333 */                     if (MathUtils.f_olt(d5, 1.0E-10D)) {
/* 334 */                       d5 = -90.0D;
/*     */                       
/*     */                       break label870;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label830;
/*     */                     }
/*     */                     label798:
/* 343 */                     d5 = d4 + 1.0D;
/* 344 */                     if (MathUtils.f_ogt(d5, -1.0E-10D)) {
/* 345 */                       d5 = 270.0D;
/*     */                       
/*     */ 
/*     */                       break label870;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label830:
/*     */                   
/* 355 */                   d5 = SystemLibrary.asin(d4) * 180.0D;
/* 356 */                   d5 /= 3.141592653589793D;
/* 357 */                   d5 *= -2.0D;
/* 358 */                   d5 += 90.0D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label870:
/*     */                 
/*     */ 
/*     */ 
/* 367 */                 i11 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label878:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 377 */                 MainMemory.setF64(i8, d5);
/* 378 */                 MainMemory.setI32(i10, i11);
/* 379 */                 i6 += 1;
/* 380 */                 if (i6 == j) {
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
/* 392 */               paramInt8 = i3;
/* 393 */               i8 = i4;
/* 394 */               paramInt10 = i5;
/* 395 */               paramInt9 = paramInt8;
/* 396 */               paramInt8 = i8;
/*     */               
/* 398 */               i6 = i7;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */             i2 += 1;
/* 409 */             if (i2 == paramInt3) {
/* 410 */               paramInt2 = i6; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */             i7 = i6;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label979:
/*     */       
/* 426 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 432 */       int i12 = i;return i12;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/zeax2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */