/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class aits2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2814;
/*  12 */   public static final Function _instance = new aits2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public aits2x() { super("aits2x", 10, false); }
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
/*  78 */     int i12 = 0;
/*  79 */     int i13 = 0;
/*  80 */     int i14 = 0;
/*  81 */     double d1 = 0.0D;
/*  82 */     double d2 = 0.0D;
/*  83 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*  86 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  90 */       i4 = MainMemory.alloc(8);
/*  91 */       j = MainMemory.alloc(8);
/*  92 */       i5 = MainMemory.alloc(8);
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
/* 105 */         if (MainMemory.getI32(paramInt1) != 401)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           if (aitset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 119 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1334;
/*     */           }
/*     */         }
/*     */         
/* 126 */         i3 = paramInt3 > 0 ? 1 : 0;
/* 127 */         m = i3 != 0 ? paramInt2 : 1;
/* 128 */         i6 = i3 != 0 ? paramInt3 : 1;
/* 129 */         paramInt3 = i3 != 0 ? paramInt3 : paramInt2;
/* 130 */         if (paramInt2 <= 0) {
/*     */           break label687;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         i3 = i6 > 0 ? 1 : 0;
/* 141 */         i7 = paramInt5 * paramInt2;
/* 142 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 149 */           n = i11 * paramInt5;
/* 150 */           d1 = MainMemory.getF64(paramInt6 + (i11 * paramInt4 << 3)) * 0.5D;
/* 151 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label528;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           d2 = d1 / 90.0D;
/* 162 */           d2 += 0.5D;
/* 163 */           i1 = (int)SystemLibrary.floor(d2);
/* 164 */           switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */           case 0: 
/*     */             break label506;
/*     */             break;
/*     */           case 1: 
/*     */             break label469;
/*     */             break;
/*     */           case 2: 
/*     */             break label445;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 177 */           MainMemory.setF64(i5, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 178 */           MainMemory.setF64(i4, 0.0D);
/*     */           
/*     */           break label558;
/*     */           
/*     */           label445:
/* 183 */           MainMemory.setF64(i5, 0.0D);
/* 184 */           MainMemory.setF64(i4, -1.0D);
/*     */           
/*     */           break label558;
/*     */           
/*     */           label469:
/* 189 */           MainMemory.setF64(i5, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 190 */           MainMemory.setF64(i4, 0.0D);
/*     */           
/*     */           break label558;
/*     */           
/*     */           label506:
/* 195 */           MainMemory.setF64(i5, 0.0D);
/* 196 */           MainMemory.setF64(i4, 1.0D);
/*     */           
/*     */           break label558;
/*     */           
/*     */           label528:
/* 201 */           d1 *= 3.141592653589793D;
/* 202 */           d1 /= 180.0D;
/* 203 */           SystemLibrary.sincos(d1, i5, i4);
/*     */           
/*     */ 
/*     */           label558:
/*     */           
/*     */ 
/* 209 */           if (i3 == 0) {
/*     */             break label662;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */           d1 = MainMemory.getF64(i5);
/* 220 */           d2 = MainMemory.getF64(i4);
/* 221 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 228 */             i2 = n + i7 * i1;
/* 229 */             i12 = paramInt9 + (i2 << 3);
/* 230 */             MainMemory.setF64(paramInt8 + (i2 << 3), d1);
/* 231 */             MainMemory.setF64(i12, d2);
/* 232 */             i1 += 1;
/* 233 */             if (i1 == i6) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label662:
/*     */           
/*     */ 
/*     */ 
/* 244 */           i11 += 1;
/* 245 */           if (i11 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label687:
/*     */         
/*     */ 
/*     */ 
/* 256 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 260 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 267 */           i3 = m > 0 ? 1 : 0;
/* 268 */           paramInt6 = paramInt1 + 360;
/* 269 */           i4 = paramInt1 + 344;
/* 270 */           i5 = paramInt1 + 352;
/* 271 */           paramInt2 = m * paramInt5 << 3;
/* 272 */           i6 = m << 2;
/*     */           
/*     */ 
/*     */ 
/* 276 */           i7 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 286 */             d1 = MainMemory.getF64(paramInt7 + (i7 * paramInt4 << 3));
/* 287 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */               break label1032;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */             d2 = d1 / 90.0D;
/* 298 */             d2 += 0.5D;
/* 299 */             i11 = (int)SystemLibrary.floor(d2);
/* 300 */             switch ((i11 > -1 ? i11 : 0 - i11) & 0x3) {
/*     */             case 0: 
/*     */               break label1010;
/*     */               break;
/*     */             case 1: 
/*     */               break label973;
/*     */               break;
/*     */             case 2: 
/*     */               break label949;
/*     */               break;
/*     */             case 3: 
/*     */               break;
/*     */             }
/* 313 */             MainMemory.setF64(k, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 314 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1062;
/*     */             
/*     */             label949:
/* 319 */             MainMemory.setF64(k, 0.0D);
/* 320 */             MainMemory.setF64(j, -1.0D);
/*     */             
/*     */             break label1062;
/*     */             
/*     */             label973:
/* 325 */             MainMemory.setF64(k, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 326 */             MainMemory.setF64(j, 0.0D);
/*     */             
/*     */             break label1062;
/*     */             
/*     */             label1010:
/* 331 */             MainMemory.setF64(k, 0.0D);
/* 332 */             MainMemory.setF64(j, 1.0D);
/*     */             
/*     */             break label1062;
/*     */             
/*     */             label1032:
/* 337 */             d1 *= 3.141592653589793D;
/* 338 */             d1 /= 180.0D;
/* 339 */             SystemLibrary.sincos(d1, k, j);
/*     */             
/*     */ 
/*     */             label1062:
/*     */             
/*     */ 
/* 345 */             if (i3 == 0) {
/*     */               break label1307;
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
/* 358 */             i8 = paramInt9 + paramInt2;
/* 359 */             i9 = paramInt8 + paramInt2;
/* 360 */             i10 = paramInt10 + i6;
/* 361 */             i11 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 368 */               n = i11 * paramInt5;
/* 369 */               i12 = paramInt9 + (n << 3);
/* 370 */               i13 = paramInt8 + (n << 3);
/* 371 */               i14 = paramInt10 + (i11 << 2);
/* 372 */               d1 = MainMemory.getF64(j);
/* 373 */               d2 = MainMemory.getF64(i12) * d1;
/* 374 */               d2 += 1.0D;
/* 375 */               d2 = MainMemory.getF64(paramInt6) / d2;
/* 376 */               d2 = SystemLibrary.sqrt(d2);
/* 377 */               d3 = d2 * 2.0D;
/* 378 */               d1 = d3 * d1;
/* 379 */               d1 *= MainMemory.getF64(i13);
/* 380 */               d1 -= MainMemory.getF64(i4);
/* 381 */               MainMemory.setF64(i13, d1);
/* 382 */               d1 = d2 * MainMemory.getF64(k);
/* 383 */               d1 -= MainMemory.getF64(i5);
/* 384 */               MainMemory.setF64(i12, d1);
/* 385 */               MainMemory.setI32(i14, 0);
/* 386 */               i11 += 1;
/* 387 */               if (i11 == m) {
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
/* 398 */             paramInt8 = i8;
/* 399 */             i12 = i9;
/* 400 */             paramInt10 = i10;
/* 401 */             paramInt9 = paramInt8;
/* 402 */             paramInt8 = i12;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1307:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 412 */             i7 += 1;
/* 413 */             if (i7 == paramInt3) {
/* 414 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1334:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 429 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 435 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 440 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/aits2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */