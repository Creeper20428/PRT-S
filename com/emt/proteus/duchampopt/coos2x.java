/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class coos2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2871;
/*  12 */   public static final Function _instance = new coos2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public coos2x() { super("coos2x", 10, false); }
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
/*  64 */     double d1 = 0.0D;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     int i5 = 0;
/*  73 */     double d2 = 0.0D;
/*  74 */     int i6 = 0;
/*  75 */     double d3 = 0.0D;
/*  76 */     int i7 = 0;
/*  77 */     double d4 = 0.0D;
/*  78 */     int i8 = 0;
/*  79 */     int i9 = 0;
/*  80 */     int i10 = 0;
/*  81 */     int i11 = 0;
/*  82 */     int i12 = 0;
/*  83 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*  86 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  90 */       m = MainMemory.alloc(8);
/*  91 */       n = MainMemory.alloc(8);
/*  92 */       if (paramInt1 == 0) {
/*  93 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 103 */         if (MainMemory.getI32(paramInt1) != 504)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */           if (cooset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 117 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1309;
/*     */           }
/*     */         }
/*     */         
/* 124 */         k = paramInt3 > 0 ? 1 : 0;
/* 125 */         i1 = k != 0 ? paramInt3 : 1;
/* 126 */         j = k != 0 ? paramInt2 : 1;
/* 127 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 128 */         if (paramInt2 <= 0) {
/*     */           break label683;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         i10 = paramInt1 + 360;
/* 139 */         k = i1 > 0 ? 1 : 0;
/* 140 */         i2 = paramInt5 * paramInt2;
/* 141 */         i6 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           i7 = i6 * paramInt5;
/* 149 */           d1 = MainMemory.getF64(i10) * MainMemory.getF64(paramInt6 + (i6 * paramInt4 << 3));
/* 150 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label524;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           d3 = d1 / 90.0D;
/* 161 */           d3 += 0.5D;
/* 162 */           i8 = (int)SystemLibrary.floor(d3);
/* 163 */           switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*     */           case 0: 
/*     */             break label502;
/*     */             break;
/*     */           case 1: 
/*     */             break label465;
/*     */             break;
/*     */           case 2: 
/*     */             break label441;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 176 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 177 */           MainMemory.setF64(m, 0.0D);
/*     */           
/*     */           break label554;
/*     */           
/*     */           label441:
/* 182 */           MainMemory.setF64(n, 0.0D);
/* 183 */           MainMemory.setF64(m, -1.0D);
/*     */           
/*     */           break label554;
/*     */           
/*     */           label465:
/* 188 */           MainMemory.setF64(n, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 189 */           MainMemory.setF64(m, 0.0D);
/*     */           
/*     */           break label554;
/*     */           
/*     */           label502:
/* 194 */           MainMemory.setF64(n, 0.0D);
/* 195 */           MainMemory.setF64(m, 1.0D);
/*     */           
/*     */           break label554;
/*     */           
/*     */           label524:
/* 200 */           d1 *= 3.141592653589793D;
/* 201 */           d1 /= 180.0D;
/* 202 */           SystemLibrary.sincos(d1, n, m);
/*     */           
/*     */ 
/*     */           label554:
/*     */           
/*     */ 
/* 208 */           if (k == 0) {
/*     */             break label658;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */           d1 = MainMemory.getF64(n);
/* 219 */           d3 = MainMemory.getF64(m);
/* 220 */           i8 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 227 */             i9 = i7 + i2 * i8;
/* 228 */             i11 = paramInt9 + (i9 << 3);
/* 229 */             MainMemory.setF64(paramInt8 + (i9 << 3), d1);
/* 230 */             MainMemory.setF64(i11, d3);
/* 231 */             i8 += 1;
/* 232 */             if (i8 == i1) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label658:
/*     */           
/*     */ 
/*     */ 
/* 243 */           i6 += 1;
/* 244 */           if (i6 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label683:
/*     */         
/*     */ 
/*     */ 
/* 255 */         d1 = MainMemory.getF64(paramInt1 + 352) - MainMemory.getF64(paramInt1 + 376);
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
/* 267 */           paramInt6 = paramInt1 + 360;
/* 268 */           k = j > 0 ? 1 : 0;
/* 269 */           m = paramInt1 + 344;
/* 270 */           n = paramInt1 + 384;
/* 271 */           paramInt2 = j * paramInt5 << 3;
/* 272 */           i1 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 276 */           i2 = 0;
/* 277 */           i6 = 0;
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
/* 288 */             i3 = paramInt10;
/* 289 */             i4 = paramInt8;
/* 290 */             i5 = paramInt9;
/* 291 */             d5 = MainMemory.getF64(paramInt7 + (i2 * paramInt4 << 3));
/* 292 */             if (!MathUtils.f_oeq(d5, -90.0D)) {
/*     */               break label876;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */             if (MathUtils.f_ult(MainMemory.getF64(paramInt6), 0.0D))
/*     */             {
/* 304 */               d3 = 0.0D;
/* 305 */               i7 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 315 */               i6 = 4;
/* 316 */               d3 = 0.0D;
/* 317 */               i7 = 1;
/*     */               
/*     */               break label1085;
/*     */               
/*     */               label876:
/* 322 */               d3 = MainMemory.getF64(n);
/* 323 */               d4 = MainMemory.getF64(paramInt6);
/* 324 */               d5 = 90.0D - d5;
/* 325 */               d5 *= 0.5D;
/* 326 */               d2 = SystemLibrary.fmod(d5, 360.0D);
/* 327 */               if (MathUtils.f_oeq(d2, 0.0D)) {
/* 328 */                 d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 338 */               else if (MathUtils.f_oeq(SystemLibrary.fabs(d2), 180.0D)) {
/* 339 */                 d5 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 349 */               else if ((MathUtils.f_oeq(d2, 45.0D)) || (MathUtils.f_oeq(d2, 225.0D))) {
/* 350 */                 d5 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 360 */               else if ((MathUtils.f_oeq(d2, -135.0D)) || (MathUtils.f_oeq(d2, -315.0D))) {
/* 361 */                 d5 = -1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 371 */                 d5 *= 3.141592653589793D;
/* 372 */                 d5 /= 180.0D;
/* 373 */                 d5 = SystemLibrary.tan(d5);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */               d3 *= SystemLibrary.pow(d5, d4);
/*     */               
/*     */ 
/* 384 */               i7 = 0;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1085:
/*     */             
/*     */ 
/*     */ 
/* 393 */             if (k == 0) {
/*     */               break label1281;
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
/* 406 */             d4 = -0.0D - d3;
/* 407 */             i5 += paramInt2;
/* 408 */             i4 += paramInt2;
/* 409 */             i3 += i1;
/* 410 */             i8 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 417 */               i9 = i8 * paramInt5;
/* 418 */               i10 = paramInt9 + (i9 << 3);
/* 419 */               i11 = paramInt8 + (i9 << 3);
/* 420 */               i12 = paramInt10 + (i8 << 2);
/* 421 */               d5 = MainMemory.getF64(i11) * d3;
/* 422 */               d5 -= MainMemory.getF64(m);
/* 423 */               MainMemory.setF64(i11, d5);
/* 424 */               d5 = MainMemory.getF64(i10) * d4;
/* 425 */               d5 -= d1;
/* 426 */               MainMemory.setF64(i10, d5);
/* 427 */               MainMemory.setI32(i12, i7);
/* 428 */               i8 += 1;
/* 429 */               if (i8 == j) {
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
/* 440 */             paramInt8 = i5;
/* 441 */             i10 = i4;
/* 442 */             paramInt10 = i3;
/* 443 */             paramInt9 = paramInt8;
/* 444 */             paramInt8 = i10;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1281:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 454 */             i2 += 1;
/* 455 */             if (i2 == paramInt3) {
/* 456 */               paramInt2 = i6; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1309:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 472 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 478 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 483 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/coos2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */