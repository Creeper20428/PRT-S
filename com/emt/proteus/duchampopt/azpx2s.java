/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class azpx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2864;
/*  12 */   public static final Function _instance = new azpx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public azpx2s() { super("azpx2s", 10, false); }
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
/*  73 */     double d3 = 0.0D;
/*  74 */     int i5 = 0;
/*  75 */     int i6 = 0;
/*  76 */     int i7 = 0;
/*  77 */     boolean bool = false;
/*  78 */     double d4 = 0.0D;
/*  79 */     int i8 = 0;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     int i12 = 0;
/*  84 */     int i13 = 0;
/*  85 */     double d5 = 0.0D;
/*  86 */     double d6 = 0.0D;
/*  87 */     double d7 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
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
/* 104 */         if (MainMemory.getI32(paramInt1) != 101)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           if (azpset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 118 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1267;
/*     */           }
/*     */         }
/*     */         
/* 125 */         i1 = paramInt3 > 0 ? 1 : 0;
/* 126 */         i3 = i1 != 0 ? paramInt3 : 1;
/* 127 */         j = i1 != 0 ? paramInt2 : 1;
/* 128 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/* 129 */         if (paramInt2 <= 0) {
/*     */           break label217;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         azpx2s_488.call(paramInt6, paramInt2, paramInt4, i3, paramInt1, paramInt5, paramInt8);
/*     */         
/*     */ 
/*     */         label217:
/*     */         
/*     */ 
/* 145 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 149 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 156 */           paramInt6 = paramInt1 + 352;
/* 157 */           k = paramInt1 + 384;
/* 158 */           m = paramInt1 + 360;
/* 159 */           n = paramInt1 + 392;
/* 160 */           i1 = j > 0 ? 1 : 0;
/* 161 */           i2 = paramInt1 + 24;
/* 162 */           paramInt2 = j * paramInt5 << 3;
/* 163 */           i3 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 167 */           i4 = 0;
/* 168 */           i9 = 0;
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
/* 179 */             d2 = MainMemory.getF64(paramInt7 + (i4 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 180 */             d3 = MainMemory.getF64(k) * d2;
/* 181 */             d1 = d3 * d3;
/* 182 */             d2 = MainMemory.getF64(n) * d2;
/* 183 */             d2 = MainMemory.getF64(m) + d2;
/* 184 */             if (i1 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */               i8 = i9;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 198 */               d3 = -0.0D - d3;
/* 199 */               i5 = paramInt9 + paramInt2;
/* 200 */               i6 = paramInt8 + paramInt2;
/* 201 */               i7 = paramInt10 + i3;
/* 202 */               bool = MathUtils.f_oeq(d3, 0.0D);
/* 203 */               d4 = MathUtils.f_oge(d3, 0.0D) ? 0.0D : 180.0D;
/* 204 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 213 */                 i10 = i8 * paramInt5;
/* 214 */                 i11 = paramInt9 + (i10 << 3);
/* 215 */                 i12 = paramInt8 + (i10 << 3);
/* 216 */                 i13 = paramInt10 + (i8 << 2);
/* 217 */                 d6 = MainMemory.getF64(i12);
/* 218 */                 d7 = d6 * d6;
/* 219 */                 d7 += d1;
/* 220 */                 d7 = SystemLibrary.sqrt(d7);
/* 221 */                 if (!MathUtils.f_oeq(d7, 0.0D)) {
/*     */                   break label561;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */                 MainMemory.setF64(i12, 0.0D);
/* 232 */                 MainMemory.setF64(i11, 90.0D);
/* 233 */                 MainMemory.setI32(i13, 0);
/*     */                 
/*     */                 break label1180;
/*     */                 
/*     */                 label561:
/*     */                 
/* 239 */                 if (MathUtils.f_oeq(d6, 0.0D)) {
/* 240 */                   d6 = d4;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 250 */                   if (!bool) {
/*     */                     break label650;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */                   if (MathUtils.f_ogt(d6, 0.0D)) {
/* 261 */                     d6 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 271 */                   else if (MathUtils.f_olt(d6, 0.0D)) {
/* 272 */                     d6 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label650:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */                     d6 = SystemLibrary.atan2(d6, d3) * 180.0D;
/* 283 */                     d6 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */                 MainMemory.setF64(i12, d6);
/* 292 */                 d7 /= d2;
/* 293 */                 d6 = MainMemory.getF64(i2) * d7;
/* 294 */                 d5 = d7 * d7;
/* 295 */                 d5 += 1.0D;
/* 296 */                 d6 /= SystemLibrary.sqrt(d5);
/* 297 */                 if (MathUtils.f_oeq(d7, 0.0D)) {
/* 298 */                   d7 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 308 */                   d7 = SystemLibrary.atan2(1.0D, d7) * 180.0D;
/* 309 */                   d7 /= 3.141592653589793D;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */                 d5 = SystemLibrary.fabs(d6);
/* 318 */                 if (!MathUtils.f_ogt(d5, 1.0D)) {
/*     */                   break label884;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */                 if (!MathUtils.f_ogt(d5, 1.0000000000001D)) {
/*     */                   break label850;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */                 MainMemory.setF64(i11, 0.0D);
/* 339 */                 MainMemory.setI32(i13, 1);
/* 340 */                 i9 = 3;
/*     */                 
/*     */                 break label1180;
/*     */                 
/*     */                 label850:
/* 345 */                 d6 = MathUtils.f_olt(d6, 0.0D) ? -90.0D : 90.0D;
/* 346 */                 d5 = d6;
/*     */                 
/*     */                 break label1051;
/*     */                 
/*     */                 label884:
/* 351 */                 if (!MathUtils.f_ugt(d6, -1.0D)) {
/*     */                   break label991;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */                 if (MathUtils.f_oeq(d6, 0.0D)) {
/* 362 */                   d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 372 */                   if (!MathUtils.f_ult(d6, 1.0D))
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */                     d5 = d6 + -1.0D;
/* 383 */                     if (MathUtils.f_olt(d5, 1.0E-10D)) {
/* 384 */                       d5 = 90.0D;
/*     */                       
/*     */                       break label1051;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label1023;
/*     */                     }
/*     */                     label991:
/* 393 */                     d5 = d6 + 1.0D;
/* 394 */                     if (MathUtils.f_ogt(d5, -1.0E-10D)) {
/* 395 */                       d5 = -90.0D;
/*     */                       
/*     */ 
/*     */                       break label1051;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */                   label1023:
/*     */                   
/* 405 */                   d6 = SystemLibrary.asin(d6) * 180.0D;
/* 406 */                   d6 /= 3.141592653589793D;
/* 407 */                   d5 = d6;
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1051:
/*     */                 
/*     */ 
/* 414 */                 d6 = d7 - d5;
/* 415 */                 d7 += d5;
/* 416 */                 d7 += 180.0D;
/* 417 */                 if (!MathUtils.f_ogt(d6, 90.0D)) {
/*     */                   break label1110;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 428 */                 d6 += -360.0D;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1110:
/*     */                 
/*     */ 
/*     */ 
/* 436 */                 if (!MathUtils.f_ogt(d7, 90.0D)) {
/*     */                   break label1147;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */                 d7 += -360.0D;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1147:
/*     */                 
/*     */ 
/*     */ 
/* 455 */                 MainMemory.setF64(i11, MathUtils.f_ogt(d6, d7) ? d6 : d7);
/* 456 */                 MainMemory.setI32(i13, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label1180:
/*     */                 
/*     */ 
/*     */ 
/* 464 */                 i8 += 1;
/* 465 */                 if (i8 == j) {
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
/* 477 */               paramInt8 = i5;
/* 478 */               i11 = i6;
/* 479 */               paramInt10 = i7;
/* 480 */               paramInt9 = paramInt8;
/* 481 */               paramInt8 = i11;
/*     */               
/* 483 */               i8 = i9;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 493 */             i4 += 1;
/* 494 */             if (i4 == paramInt3) {
/* 495 */               paramInt2 = i8; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 503 */             i9 = i8;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1267:
/*     */       
/* 511 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */       int i14 = i;return i14;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/azpx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */