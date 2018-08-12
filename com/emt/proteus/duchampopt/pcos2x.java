/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class pcos2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2808;
/*  12 */   public static final Function _instance = new pcos2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public pcos2x() { super("pcos2x", 10, false); }
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
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     int i9 = 0;
/*  77 */     int i10 = 0;
/*  78 */     int i11 = 0;
/*  79 */     int i12 = 0;
/*  80 */     int i13 = 0;
/*  81 */     double d2 = 0.0D;
/*  82 */     double d3 = 0.0D;
/*  83 */     int i14 = 0;
/*  84 */     double d4 = 0.0D;
/*  85 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*  88 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  92 */       j = MainMemory.alloc(8);
/*  93 */       k = MainMemory.alloc(8);
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
/* 105 */         if (MainMemory.getI32(paramInt1) != 602)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           if (pcoset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 119 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1459;
/*     */           }
/*     */         }
/*     */         
/* 126 */         i1 = paramInt3 > 0 ? 1 : 0;
/* 127 */         m = i1 != 0 ? paramInt2 : 1;
/* 128 */         i5 = i1 != 0 ? paramInt3 : 1;
/* 129 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/* 130 */         if ((paramInt2 <= 0) || (i5 <= 0)) {
/*     */           break label329;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         i6 = paramInt5 * paramInt2;
/* 141 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           i2 = paramInt6 + (i10 * paramInt4 << 3);
/* 149 */           i14 = i10 * paramInt5;
/* 150 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 157 */             MainMemory.setF64(paramInt8 + (i14 + i6 * n << 3), MainMemory.getF64(i2));
/* 158 */             n += 1;
/* 159 */             if (n == i5) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */           i10 += 1;
/* 171 */           if (i10 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label329:
/*     */         
/*     */ 
/*     */ 
/* 182 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 186 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 193 */           i1 = m > 0 ? 1 : 0;
/* 194 */           paramInt6 = paramInt1 + 360;
/* 195 */           i2 = paramInt1 + 344;
/* 196 */           i3 = paramInt1 + 352;
/* 197 */           i4 = paramInt1 + 8;
/* 198 */           paramInt2 = m * paramInt5 << 3;
/* 199 */           i5 = m << 2;
/*     */           
/*     */ 
/*     */ 
/* 203 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 213 */             d3 = MainMemory.getF64(paramInt7 + (i6 * paramInt4 << 3));
/* 214 */             d1 = d3 * 3.141592653589793D;
/* 215 */             d1 /= 180.0D;
/* 216 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */               break label696;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */             d2 = d3 / 90.0D;
/* 227 */             d2 += 0.5D;
/* 228 */             i10 = (int)SystemLibrary.floor(d2);
/* 229 */             switch ((i10 > -1 ? i10 : 0 - i10) & 0x3) {
/*     */             case 0: 
/*     */               break label674;
/*     */               break;
/*     */             case 1: 
/*     */               break label637;
/*     */               break;
/*     */             case 2: 
/*     */               break label613;
/*     */               break;
/*     */             case 3: 
/*     */               break;
/*     */             }
/* 242 */             MainMemory.setF64(k, MathUtils.f_ogt(d3, 0.0D) ? -1.0D : 1.0D);
/* 243 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label710;
/*     */             
/*     */             label613:
/* 248 */             MainMemory.setF64(k, 0.0D);
/* 249 */             MainMemory.setF64(j, -1.0D);
/*     */             
/*     */             break label710;
/*     */             
/*     */             label637:
/* 254 */             MainMemory.setF64(k, MathUtils.f_ogt(d3, 0.0D) ? 1.0D : -1.0D);
/* 255 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label710;
/*     */             
/*     */             label674:
/* 260 */             MainMemory.setF64(k, 0.0D);
/* 261 */             MainMemory.setF64(j, 1.0D);
/*     */             
/*     */             break label710;
/*     */             
/*     */             label696:
/* 266 */             SystemLibrary.sincos(d1, k, j);
/*     */             
/*     */ 
/*     */             label710:
/*     */             
/*     */ 
/* 272 */             if (i1 == 0) {
/*     */               break label1432;
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
/* 285 */             i7 = paramInt9 + paramInt2;
/* 286 */             i8 = paramInt8 + paramInt2;
/* 287 */             i9 = paramInt10 + i5;
/* 288 */             i10 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 295 */               i14 = i10 * paramInt5;
/* 296 */               i11 = paramInt9 + (i14 << 3);
/* 297 */               i12 = paramInt8 + (i14 << 3);
/* 298 */               i13 = paramInt10 + (i10 << 2);
/* 299 */               d3 = MainMemory.getF64(k);
/* 300 */               if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */                 break label869;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */               d3 = MainMemory.getF64(paramInt6) * MainMemory.getF64(i12);
/* 311 */               d3 -= MainMemory.getF64(i2);
/* 312 */               MainMemory.setF64(i12, d3);
/* 313 */               d3 = -0.0D - MainMemory.getF64(i3);
/*     */               
/*     */               break label1368;
/*     */               
/*     */               label869:
/*     */               
/* 319 */               d2 = MainMemory.getF64(i12) * d3;
/* 320 */               d3 = MainMemory.getF64(j) / d3;
/* 321 */               d5 = MainMemory.getF64(i4) * d3;
/* 322 */               if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */                 break label1070;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */               d4 = d2 / 90.0D;
/* 333 */               d4 += -0.5D;
/* 334 */               i14 = (int)SystemLibrary.floor(d4);
/* 335 */               switch ((i14 > -1 ? i14 : 0 - i14) & 0x3) {
/*     */               case 0:  break label1057;
/*     */                 break; case 1:  d4 = 0.0D;
/*     */                 break label1098;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d4 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label1098;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 350 */               d4 = -1.0D;
/*     */               
/*     */               break label1098;
/*     */               
/*     */               label1057:
/* 355 */               d4 = 1.0D;
/*     */               
/*     */               break label1098;
/*     */               
/*     */               label1070:
/* 360 */               d4 = d2 * 3.141592653589793D;
/* 361 */               d4 /= 180.0D;
/* 362 */               d4 = SystemLibrary.sin(d4);
/*     */               
/*     */ 
/*     */ 
/*     */               label1098:
/*     */               
/*     */ 
/*     */ 
/* 370 */               d5 *= d4;
/* 371 */               d5 -= MainMemory.getF64(i2);
/* 372 */               MainMemory.setF64(i12, d5);
/* 373 */               d5 = MainMemory.getF64(i4);
/* 374 */               if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */                 break label1298;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 384 */               d4 = d2 / 90.0D;
/* 385 */               d4 += 0.5D;
/* 386 */               i14 = (int)SystemLibrary.floor(d4);
/* 387 */               switch ((i14 > -1 ? i14 : 0 - i14) & 0x3) {
/*     */               case 0:  break label1285;
/*     */                 break; case 1:  d2 = 0.0D;
/*     */                 break label1326;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d2 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label1326;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 402 */               d2 = -1.0D;
/*     */               
/*     */               break label1326;
/*     */               
/*     */               label1285:
/* 407 */               d2 = 1.0D;
/*     */               
/*     */               break label1326;
/*     */               
/*     */               label1298:
/* 412 */               d2 *= 3.141592653589793D;
/* 413 */               d2 /= 180.0D;
/* 414 */               d2 = SystemLibrary.cos(d2);
/*     */               
/*     */ 
/*     */ 
/*     */               label1326:
/*     */               
/*     */ 
/*     */ 
/* 422 */               d2 = 1.0D - d2;
/* 423 */               d3 = d2 * d3;
/* 424 */               d3 += d1;
/* 425 */               d3 = d5 * d3;
/* 426 */               d3 -= MainMemory.getF64(i3);
/*     */               
/*     */ 
/*     */ 
/*     */               label1368:
/*     */               
/*     */ 
/*     */ 
/* 434 */               MainMemory.setF64(i11, d3);
/* 435 */               MainMemory.setI32(i13, 0);
/* 436 */               i10 += 1;
/* 437 */               if (i10 == m) {
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
/* 448 */             paramInt8 = i7;
/* 449 */             i11 = i8;
/* 450 */             paramInt10 = i9;
/* 451 */             paramInt9 = paramInt8;
/* 452 */             paramInt8 = i11;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1432:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 462 */             i6 += 1;
/* 463 */             if (i6 == paramInt3) {
/* 464 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1459:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 479 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 490 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/pcos2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */