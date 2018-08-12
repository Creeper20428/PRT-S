/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class szpx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2861;
/*  12 */   public static final Function _instance = new szpx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public szpx2s() { super("szpx2s", 10, false); }
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
/*  71 */     double d1 = 0.0D;
/*  72 */     double d2 = 0.0D;
/*  73 */     int i5 = 0;
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
/*  85 */     double d6 = 0.0D;
/*  86 */     double d7 = 0.0D;
/*  87 */     double d8 = 0.0D;
/*  88 */     double d9 = 0.0D;
/*  89 */     double d10 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
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
/* 106 */         if (MainMemory.getI32(paramInt1) != 102)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           if (szpset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 120 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1504;
/*     */           }
/*     */         }
/*     */         
/* 127 */         m = paramInt3 > 0 ? 1 : 0;
/* 128 */         i3 = m != 0 ? paramInt3 : 1;
/* 129 */         j = m != 0 ? paramInt2 : 1;
/* 130 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 131 */         if (paramInt2 <= 0) {
/*     */           break label223;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         szpx2s_1678.call(paramInt6, paramInt5, paramInt2, i3, paramInt4, paramInt1, paramInt8);
/*     */         
/*     */ 
/*     */         label223:
/*     */         
/*     */ 
/* 147 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 151 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 158 */           paramInt6 = paramInt1 + 352;
/* 159 */           k = paramInt1 + 360;
/* 160 */           m = j > 0 ? 1 : 0;
/* 161 */           n = paramInt1 + 368;
/* 162 */           i1 = paramInt1 + 384;
/* 163 */           i2 = paramInt1 + 376;
/* 164 */           paramInt2 = j * paramInt5 << 3;
/* 165 */           i3 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 169 */           i4 = 0;
/* 170 */           i9 = 0;
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
/* 181 */             d1 = MainMemory.getF64(paramInt7 + (i4 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 182 */             d1 *= MainMemory.getF64(k);
/* 183 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */               i8 = i9;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 197 */               d2 = d1 * d1;
/* 198 */               i5 = paramInt9 + paramInt2;
/* 199 */               i6 = paramInt8 + paramInt2;
/* 200 */               i7 = paramInt10 + i3;
/* 201 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 210 */                 i10 = i8 * paramInt5;
/* 211 */                 i11 = paramInt9 + (i10 << 3);
/* 212 */                 i12 = paramInt8 + (i10 << 3);
/* 213 */                 i13 = paramInt10 + (i8 << 2);
/* 214 */                 d3 = MainMemory.getF64(i12);
/* 215 */                 d5 = d3 * d3;
/* 216 */                 d4 = d5 + d2;
/* 217 */                 d5 = d3 - MainMemory.getF64(n);
/* 218 */                 d6 = MainMemory.getF64(i1);
/* 219 */                 d5 /= d6;
/* 220 */                 d9 = d1 - MainMemory.getF64(i2);
/* 221 */                 d6 = d9 / d6;
/* 222 */                 d9 = d3 * d5;
/* 223 */                 d10 = d1 * d6;
/* 224 */                 d7 = d9 + d10;
/* 225 */                 if (!MathUtils.f_olt(d4, 1.0E-10D)) {
/*     */                   break label598;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */                 d9 = d4 * 0.5D;
/* 236 */                 d10 = d7 + 1.0D;
/* 237 */                 d10 = d4 / d10;
/* 238 */                 d10 = SystemLibrary.sqrt(d10) * -57.29577951308232D;
/* 239 */                 d10 += 90.0D;
/* 240 */                 MainMemory.setF64(i11, d10);
/*     */                 
/*     */                 break label1188;
/*     */                 
/*     */                 label598:
/*     */                 
/* 246 */                 d9 = d5 * d5;
/* 247 */                 d10 = d6 * d6;
/* 248 */                 d8 = d9 + d10;
/* 249 */                 d9 = d8 + 1.0D;
/* 250 */                 d10 = d7 - d8;
/* 251 */                 d4 -= d7;
/* 252 */                 d4 -= d7;
/* 253 */                 d4 += d8;
/* 254 */                 d7 = d4 + -1.0D;
/* 255 */                 d4 = d10 * d10;
/* 256 */                 d7 = d9 * d7;
/* 257 */                 d4 -= d7;
/* 258 */                 if (!MathUtils.f_olt(d4, 0.0D)) {
/*     */                   break label735;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */                 MainMemory.setF64(i12, 0.0D);
/* 269 */                 MainMemory.setF64(i11, 0.0D);
/* 270 */                 MainMemory.setI32(i13, 1);
/* 271 */                 i9 = 3;
/*     */                 
/*     */                 break label1417;
/*     */                 
/*     */                 label735:
/* 276 */                 d7 = SystemLibrary.sqrt(d4);
/* 277 */                 d4 = d7 - d10;
/* 278 */                 d4 /= d9;
/* 279 */                 d10 = -0.0D - d10;
/* 280 */                 d10 -= d7;
/* 281 */                 d9 = d10 / d9;
/* 282 */                 d10 = MathUtils.f_ogt(d4, d9) ? d4 : d9;
/* 283 */                 if (!MathUtils.f_ogt(d10, 1.0D))
/*     */                 {
/*     */ 
/*     */ 
/* 287 */                   d9 = d10;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 294 */                   d10 += -1.0D;
/* 295 */                   if (MathUtils.f_olt(d10, 1.0E-13D)) {
/* 296 */                     d9 = 1.0D;
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */                     break label943;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/* 306 */                   d9 = MathUtils.f_olt(d4, d9) ? d4 : d9;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */                 if (!MathUtils.f_olt(d9, -1.0D)) {
/*     */                   break label943;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */                 d10 = d9 + 1.0D;
/* 326 */                 if (!MathUtils.f_ogt(d10, -1.0E-13D)) {
/*     */                   break label943;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */                 d9 = -1.0D;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label943:
/*     */                 
/*     */ 
/* 344 */                 if ((!MathUtils.f_ogt(d9, 1.0D)) && (!MathUtils.f_olt(d9, -1.0D))) {
/*     */                   break label1007;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */                 MainMemory.setF64(i12, 0.0D);
/* 355 */                 MainMemory.setF64(i11, 0.0D);
/* 356 */                 MainMemory.setI32(i13, 1);
/* 357 */                 i9 = 3;
/*     */                 
/*     */                 break label1417;
/*     */                 
/*     */                 label1007:
/* 362 */                 if (!MathUtils.f_ugt(d9, -1.0D)) {
/*     */                   break label1114;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */                 if (MathUtils.f_oeq(d9, 0.0D)) {
/* 373 */                   d10 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 383 */                   if (!MathUtils.f_ult(d9, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */                     d10 = d9 + -1.0D;
/* 394 */                     if (MathUtils.f_olt(d10, 1.0E-10D)) {
/* 395 */                       d10 = 90.0D;
/*     */                       
/*     */                       break label1170;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1146;
/*     */                     }
/*     */                     label1114:
/* 404 */                     d10 = d9 + 1.0D;
/* 405 */                     if (MathUtils.f_ogt(d10, -1.0E-10D)) {
/* 406 */                       d10 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label1170;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1146:
/*     */                   
/* 416 */                   d10 = SystemLibrary.asin(d9) * 180.0D;
/* 417 */                   d10 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1170:
/*     */                 
/*     */ 
/* 425 */                 MainMemory.setF64(i11, d10);
/* 426 */                 d9 = 1.0D - d9;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1188:
/*     */                 
/*     */ 
/*     */ 
/* 434 */                 d6 *= d9;
/* 435 */                 d6 = d1 - d6;
/* 436 */                 d6 = -0.0D - d6;
/* 437 */                 d5 *= d9;
/* 438 */                 d3 -= d5;
/* 439 */                 if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */                   break label1303;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */                 if (!MathUtils.f_ult(d6, 0.0D))
/*     */                 {
/*     */ 
/*     */ 
/* 453 */                   d3 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 460 */                   if (MathUtils.f_olt(d6, 0.0D)) {
/* 461 */                     d3 = 180.0D;
/*     */                     
/*     */                     break label1399;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     break label1373;
/*     */                   }
/*     */                   label1303:
/* 470 */                   if (!MathUtils.f_oeq(d6, 0.0D)) {
/*     */                     break label1373;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */                   if (MathUtils.f_ogt(d3, 0.0D)) {
/* 481 */                     d3 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 491 */                   else if (MathUtils.f_olt(d3, 0.0D)) {
/* 492 */                     d3 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label1373:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */                     d3 = SystemLibrary.atan2(d3, d6) * 180.0D;
/* 503 */                     d3 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1399:
/*     */                 
/*     */ 
/* 511 */                 MainMemory.setF64(i12, d3);
/* 512 */                 MainMemory.setI32(i13, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1417:
/*     */                 
/*     */ 
/*     */ 
/* 520 */                 i8 += 1;
/* 521 */                 if (i8 == j) {
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
/* 533 */               paramInt8 = i5;
/* 534 */               i12 = i6;
/* 535 */               paramInt10 = i7;
/* 536 */               paramInt9 = paramInt8;
/* 537 */               paramInt8 = i12;
/*     */               
/* 539 */               i8 = i9;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 549 */             i4 += 1;
/* 550 */             if (i4 == paramInt3) {
/* 551 */               paramInt2 = i8; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 559 */             i9 = i8;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1504:
/*     */       
/* 567 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 573 */       int i14 = i;return i14;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/szpx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */