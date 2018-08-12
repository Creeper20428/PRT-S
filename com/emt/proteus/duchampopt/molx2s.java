/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class molx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2816;
/*  12 */   public static final Function _instance = new molx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public molx2s() { super("molx2s", 10, false); }
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
/*  74 */     double d3 = 0.0D;
/*  75 */     int i6 = 0;
/*  76 */     double d4 = 0.0D;
/*  77 */     double d5 = 0.0D;
/*  78 */     boolean bool = false;
/*  79 */     int i7 = 0;
/*  80 */     int i8 = 0;
/*  81 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  87 */       if (paramInt1 == 0) {
/*  88 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (MainMemory.getI32(paramInt1) != 303)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */           if (molset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 112 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1087;
/*     */           }
/*     */         }
/*     */         
/* 119 */         n = paramInt3 > 0 ? 1 : 0;
/* 120 */         i2 = n != 0 ? paramInt3 : 1;
/* 121 */         j = n != 0 ? paramInt2 : 1;
/* 122 */         paramInt3 = n != 0 ? paramInt3 : paramInt2;
/* 123 */         if (paramInt2 <= 0) {
/*     */           break label202;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         molx2s_1582.call(paramInt9, i2, paramInt4, paramInt6, paramInt8, paramInt2, paramInt5, paramInt1);
/*     */         
/*     */ 
/*     */         label202:
/*     */         
/*     */ 
/* 139 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 143 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 150 */           paramInt6 = paramInt1 + 352;
/* 151 */           k = paramInt1 + 8;
/* 152 */           m = paramInt1 + 376;
/* 153 */           n = j > 0 ? 1 : 0;
/* 154 */           i1 = paramInt1 + 392;
/* 155 */           paramInt2 = j * paramInt5 << 3;
/*     */           
/*     */ 
/*     */ 
/* 159 */           i2 = 0;
/* 160 */           i5 = 0;
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
/* 171 */             i3 = paramInt8;
/* 172 */             i4 = paramInt9;
/* 173 */             d1 = MainMemory.getF64(paramInt7 + (i2 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 174 */             d5 = d1 / MainMemory.getF64(k);
/* 175 */             d3 = d5 * d5;
/* 176 */             d3 = 2.0D - d3;
/* 177 */             if (!MathUtils.f_ugt(d3, 1.0E-12D)) {
/*     */               break label382;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */             d2 = SystemLibrary.sqrt(d3);
/* 188 */             d3 = 1.0D / d2;
/*     */             
/*     */ 
/*     */ 
/* 192 */             i6 = 0;
/*     */             
/*     */             break label428;
/*     */             
/*     */             label382:
/* 197 */             bool = MathUtils.f_olt(d3, -1.0E-12D);
/* 198 */             i5 = bool ? 3 : i5;
/* 199 */             i6 = bool ? 1 : -1;
/* 200 */             d2 = 0.0D;
/*     */             
/* 202 */             d3 = 0.0D;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label428:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 213 */             d1 = MainMemory.getF64(m) * d1;
/* 214 */             d4 = SystemLibrary.fabs(d1);
/* 215 */             if (!MathUtils.f_ogt(d4, 1.0D)) {
/*     */               break label543;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */             if (MathUtils.f_ogt(d4, 1.000000000001D)) {
/* 226 */               i5 = 3;
/* 227 */               d5 = 0.0D;
/* 228 */               i6 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 238 */               d5 *= d2;
/* 239 */               d5 /= 3.141592653589793D;
/* 240 */               d5 = (MathUtils.f_olt(d1, 0.0D) ? -1.0D : 1.0D) + d5;
/*     */               
/*     */ 
/*     */               break label583;
/*     */               
/*     */ 
/*     */               label543:
/*     */               
/* 248 */               d1 = SystemLibrary.asin(d1) * MainMemory.getF64(i1);
/* 249 */               d5 *= d2;
/* 250 */               d5 /= 3.141592653589793D;
/* 251 */               d5 = d1 + d5;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label583:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 263 */             d1 = SystemLibrary.fabs(d5);
/* 264 */             if (!MathUtils.f_ogt(d1, 1.0D)) {
/*     */               break label665;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */             if (MathUtils.f_ogt(d1, 1.000000000001D)) {
/* 276 */               i6 = 1;
/* 277 */               i5 = 3;
/* 278 */               d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 288 */               d5 = MathUtils.f_olt(d5, 0.0D) ? -1.0D : 1.0D;
/*     */               
/*     */ 
/*     */ 
/*     */               label665:
/*     */               
/*     */ 
/*     */ 
/* 296 */               if (!MathUtils.f_ugt(d5, -1.0D)) {
/*     */                 break label772;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */               if (MathUtils.f_oeq(d5, 0.0D))
/*     */               {
/*     */ 
/* 309 */                 d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 319 */                 if (!MathUtils.f_ult(d5, 1.0D))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */                   d1 = d5 + -1.0D;
/* 330 */                   if (MathUtils.f_olt(d1, 1.0E-10D))
/*     */                   {
/*     */ 
/* 333 */                     d5 = 90.0D;
/*     */                     
/*     */                     break label828;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     break label804;
/*     */                   }
/*     */                   label772:
/* 342 */                   d1 = d5 + 1.0D;
/* 343 */                   if (MathUtils.f_ogt(d1, -1.0E-10D))
/*     */                   {
/*     */ 
/* 346 */                     d5 = -90.0D;
/*     */                     
/*     */ 
/*     */                     break label828;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label804:
/*     */                 
/* 356 */                 d5 = SystemLibrary.asin(d5) * 180.0D;
/* 357 */                 d5 /= 3.141592653589793D;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label828:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 369 */             if (n == 0) {
/*     */               break label1059;
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
/*     */ 
/* 383 */             bool = i6 < 0;
/* 384 */             i4 += paramInt2;
/* 385 */             i3 += paramInt2;
/*     */             
/* 387 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 397 */               i7 = i6 * paramInt5;
/* 398 */               i8 = paramInt9 + (i7 << 3);
/* 399 */               i9 = paramInt8 + (i7 << 3);
/* 400 */               if (!bool) {
/*     */                 break label988;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */               if (!MathUtils.f_olt(MainMemory.getF64(i8), 0.0D)) {
/*     */                 break label968;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 422 */               MainMemory.setI32(paramInt10, 0);
/* 423 */               paramInt10 += 4;
/*     */               
/*     */ 
/*     */               break label988;
/*     */               
/*     */               label968:
/*     */               
/* 430 */               MainMemory.setI32(paramInt10, 1);
/* 431 */               paramInt10 += 4;
/* 432 */               i5 = 3;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label988:
/*     */               
/*     */ 
/*     */ 
/* 441 */               d1 = MainMemory.getF64(i9) * d3;
/* 442 */               MainMemory.setF64(i9, d1);
/* 443 */               MainMemory.setF64(i8, d5);
/* 444 */               i6 += 1;
/* 445 */               if (i6 == j) {
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
/*     */ 
/*     */ 
/* 458 */             paramInt8 = i4;
/* 459 */             i8 = i3;
/* 460 */             paramInt9 = paramInt8;
/* 461 */             paramInt8 = i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label1059:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 473 */             i2 += 1;
/* 474 */             if (i2 == paramInt3) {
/* 475 */               paramInt2 = i5; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1087:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 491 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 497 */       int i10 = i;return i10;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/molx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */