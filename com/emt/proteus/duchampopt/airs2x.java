/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class airs2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2874;
/*  12 */   public static final Function _instance = new airs2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public airs2x() { super("airs2x", 10, false); }
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
/*  76 */     double d1 = 0.0D;
/*  77 */     int i10 = 0;
/*  78 */     double d2 = 0.0D;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     int i13 = 0;
/*  82 */     int i14 = 0;
/*  83 */     int i15 = 0;
/*  84 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*  87 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  91 */       m = MainMemory.alloc(8);
/*  92 */       n = MainMemory.alloc(8);
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
/* 104 */         if (MainMemory.getI32(paramInt1) != 109)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           if (airset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 118 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1441;
/*     */           }
/*     */         }
/*     */         
/* 125 */         k = paramInt3 > 0 ? 1 : 0;
/* 126 */         i4 = k != 0 ? paramInt3 : 1;
/* 127 */         j = k != 0 ? paramInt2 : 1;
/* 128 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 129 */         if (paramInt2 <= 0) {
/*     */           break label671;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         k = i4 > 0 ? 1 : 0;
/* 140 */         i5 = paramInt5 * paramInt2;
/* 141 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           i10 = i9 * paramInt5;
/* 149 */           d1 = MainMemory.getF64(paramInt6 + (i9 * paramInt4 << 3));
/* 150 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label512;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           d2 = d1 / 90.0D;
/* 161 */           d2 += 0.5D;
/* 162 */           i11 = (int)SystemLibrary.floor(d2);
/* 163 */           switch ((i11 > -1 ? i11 : 0 - i11) & 0x3) {
/*     */           case 0: 
/*     */             break label490;
/*     */             break;
/*     */           case 1: 
/*     */             break label453;
/*     */             break;
/*     */           case 2: 
/*     */             break label429;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 176 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 177 */           MainMemory.setF64(m, 0.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label429:
/* 182 */           MainMemory.setF64(n, 0.0D);
/* 183 */           MainMemory.setF64(m, -1.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label453:
/* 188 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 189 */           MainMemory.setF64(m, 0.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label490:
/* 194 */           MainMemory.setF64(n, 0.0D);
/* 195 */           MainMemory.setF64(m, 1.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label512:
/* 200 */           d1 *= 3.141592653589793D;
/* 201 */           d1 /= 180.0D;
/* 202 */           SystemLibrary.sincos(d1, n, m);
/*     */           
/*     */ 
/*     */           label542:
/*     */           
/*     */ 
/* 208 */           if (k == 0) {
/*     */             break label646;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */           d1 = MainMemory.getF64(n);
/* 219 */           d2 = MainMemory.getF64(m);
/* 220 */           i11 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 227 */             i12 = i10 + i5 * i11;
/* 228 */             i1 = paramInt9 + (i12 << 3);
/* 229 */             MainMemory.setF64(paramInt8 + (i12 << 3), d1);
/* 230 */             MainMemory.setF64(i1, d2);
/* 231 */             i11 += 1;
/* 232 */             if (i11 == i4) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label646:
/*     */           
/*     */ 
/*     */ 
/* 243 */           i9 += 1;
/* 244 */           if (i9 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label671:
/*     */         
/*     */ 
/*     */ 
/* 255 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 259 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 266 */           k = j > 0 ? 1 : 0;
/* 267 */           paramInt6 = paramInt1 + 344;
/* 268 */           m = paramInt1 + 352;
/* 269 */           n = paramInt1 + 392;
/* 270 */           i1 = paramInt1 + 384;
/* 271 */           i2 = paramInt1 + 360;
/* 272 */           i3 = paramInt1 + 368;
/* 273 */           paramInt2 = j * paramInt5 << 3;
/* 274 */           i4 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 278 */           i5 = 0;
/* 279 */           i9 = 0;
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
/* 290 */             i6 = paramInt10;
/* 291 */             i7 = paramInt8;
/* 292 */             i8 = paramInt9;
/* 293 */             d1 = MainMemory.getF64(paramInt7 + (i5 * paramInt4 << 3));
/* 294 */             if (MathUtils.f_oeq(d1, 90.0D))
/*     */             {
/* 296 */               d1 = 0.0D;
/* 297 */               i10 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 307 */             else if (!MathUtils.f_ogt(d1, -90.0D))
/*     */             {
/*     */ 
/*     */ 
/* 311 */               i9 = 4;
/* 312 */               d1 = 0.0D;
/* 313 */               i10 = 1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 320 */               d1 = 90.0D - d1;
/* 321 */               d2 = d1 * 0.017453292519943295D;
/* 322 */               d2 *= 0.5D;
/* 323 */               if (!MathUtils.f_ogt(MainMemory.getF64(n), d2)) {
/*     */                 break label928;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */               d1 = MainMemory.getF64(i1) * d2;
/*     */               
/*     */ 
/* 336 */               i10 = 0;
/*     */               
/*     */               break label1214;
/*     */               
/*     */               label928:
/* 341 */               d1 *= 0.5D;
/* 342 */               if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */                 break label1106;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 352 */               d2 = d1 / 90.0D;
/* 353 */               d2 += 0.5D;
/* 354 */               i10 = (int)SystemLibrary.floor(d2);
/* 355 */               switch ((i10 > -1 ? i10 : 0 - i10) & 0x3) {
/*     */               case 0:  break label1093;
/*     */                 break; case 1:  d2 = 0.0D;
/*     */                 break label1138;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d2 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label1138;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 370 */               d2 = -1.0D;
/*     */               
/*     */               break label1138;
/*     */               
/*     */               label1093:
/* 375 */               d2 = 1.0D;
/*     */               
/*     */               break label1138;
/*     */               
/*     */               label1106:
/* 380 */               d1 *= 3.141592653589793D;
/* 381 */               d1 /= 180.0D;
/* 382 */               d1 = SystemLibrary.cos(d1);
/* 383 */               d2 = d1;
/*     */               
/*     */ 
/*     */ 
/*     */               label1138:
/*     */               
/*     */ 
/* 390 */               d1 = d2 * d2;
/* 391 */               d1 = 1.0D - d1;
/* 392 */               d3 = SystemLibrary.sqrt(d1) / d2;
/* 393 */               d1 = -0.0D - MainMemory.getF64(i2);
/* 394 */               d2 = SystemLibrary.log(d2) / d3;
/* 395 */               d3 = MainMemory.getF64(i3) * d3;
/* 396 */               d2 += d3;
/* 397 */               d1 = d2 * d1;
/*     */               
/*     */ 
/* 400 */               i10 = 0;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1214:
/*     */             
/*     */ 
/*     */ 
/* 409 */             if (k == 0) {
/*     */               break label1413;
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
/* 422 */             d2 = -0.0D - d1;
/* 423 */             i8 += paramInt2;
/* 424 */             i7 += paramInt2;
/* 425 */             i6 += i4;
/* 426 */             i11 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 433 */               i12 = i11 * paramInt5;
/* 434 */               i13 = paramInt9 + (i12 << 3);
/* 435 */               i14 = paramInt8 + (i12 << 3);
/* 436 */               i15 = paramInt10 + (i11 << 2);
/* 437 */               d3 = MainMemory.getF64(i14) * d1;
/* 438 */               d3 -= MainMemory.getF64(paramInt6);
/* 439 */               MainMemory.setF64(i14, d3);
/* 440 */               d3 = MainMemory.getF64(i13) * d2;
/* 441 */               d3 -= MainMemory.getF64(m);
/* 442 */               MainMemory.setF64(i13, d3);
/* 443 */               MainMemory.setI32(i15, i10);
/* 444 */               i11 += 1;
/* 445 */               if (i11 == j) {
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
/* 456 */             paramInt8 = i8;
/* 457 */             i13 = i7;
/* 458 */             paramInt10 = i6;
/* 459 */             paramInt9 = paramInt8;
/* 460 */             paramInt8 = i13;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1413:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 470 */             i5 += 1;
/* 471 */             if (i5 == paramInt3) {
/* 472 */               paramInt2 = i9; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1441:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 488 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 494 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 499 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/airs2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */