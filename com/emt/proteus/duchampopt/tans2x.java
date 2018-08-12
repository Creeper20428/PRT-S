/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class tans2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2853;
/*  12 */   public static final Function _instance = new tans2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tans2x() { super("tans2x", 10, false); }
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
/*  74 */     boolean bool = false;
/*  75 */     double d1 = 0.0D;
/*  76 */     double d2 = 0.0D;
/*  77 */     double d3 = 0.0D;
/*  78 */     int i8 = 0;
/*  79 */     double d4 = 0.0D;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     int i12 = 0;
/*  84 */     int i13 = 0;
/*     */     
/*     */ 
/*  87 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  91 */       n = MainMemory.alloc(8);
/*  92 */       i1 = MainMemory.alloc(8);
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
/* 104 */         if (MainMemory.getI32(paramInt1) != 103)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           if (tanset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 118 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1640;
/*     */           }
/*     */         }
/*     */         
/* 125 */         m = paramInt3 > 0 ? 1 : 0;
/* 126 */         i2 = m != 0 ? paramInt3 : 1;
/* 127 */         j = m != 0 ? paramInt2 : 1;
/* 128 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
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
/* 139 */         m = i2 > 0 ? 1 : 0;
/* 140 */         i3 = paramInt5 * paramInt2;
/* 141 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           i8 = i4 * paramInt5;
/* 149 */           d3 = MainMemory.getF64(paramInt6 + (i4 * paramInt4 << 3));
/* 150 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */             break label512;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           d4 = d3 / 90.0D;
/* 161 */           d4 += 0.5D;
/* 162 */           i9 = (int)SystemLibrary.floor(d4);
/* 163 */           switch ((i9 > -1 ? i9 : 0 - i9) & 0x3) {
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
/* 176 */           MainMemory.setF64(i1, MathUtils.f_ogt(d3, 0.0D) ? -1.0D : 1.0D);
/* 177 */           MainMemory.setF64(n, 0.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label429:
/* 182 */           MainMemory.setF64(i1, 0.0D);
/* 183 */           MainMemory.setF64(n, -1.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label453:
/* 188 */           MainMemory.setF64(i1, MathUtils.f_ogt(d3, 0.0D) ? 1.0D : -1.0D);
/* 189 */           MainMemory.setF64(n, 0.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label490:
/* 194 */           MainMemory.setF64(i1, 0.0D);
/* 195 */           MainMemory.setF64(n, 1.0D);
/*     */           
/*     */           break label542;
/*     */           
/*     */           label512:
/* 200 */           d3 *= 3.141592653589793D;
/* 201 */           d3 /= 180.0D;
/* 202 */           SystemLibrary.sincos(d3, i1, n);
/*     */           
/*     */ 
/*     */           label542:
/*     */           
/*     */ 
/* 208 */           if (m == 0) {
/*     */             break label646;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */           d3 = MainMemory.getF64(i1);
/* 219 */           d4 = MainMemory.getF64(n);
/* 220 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 227 */             i10 = i8 + i3 * i9;
/* 228 */             i11 = paramInt9 + (i10 << 3);
/* 229 */             MainMemory.setF64(paramInt8 + (i10 << 3), d3);
/* 230 */             MainMemory.setF64(i11, d4);
/* 231 */             i9 += 1;
/* 232 */             if (i9 == i2) {
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
/* 243 */           i4 += 1;
/* 244 */           if (i4 == paramInt2) {
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
/* 266 */           paramInt6 = paramInt1 + 8;
/* 267 */           k = paramInt1 + 272;
/* 268 */           m = j > 0 ? 1 : 0;
/* 269 */           n = paramInt1 + 344;
/* 270 */           i1 = paramInt1 + 352;
/* 271 */           paramInt2 = j * paramInt5 << 3;
/* 272 */           i2 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 276 */           i3 = 0;
/* 277 */           i4 = 0;
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
/* 288 */             i5 = paramInt10;
/* 289 */             i6 = paramInt8;
/* 290 */             i7 = paramInt9;
/* 291 */             d3 = MainMemory.getF64(paramInt7 + (i3 * paramInt4 << 3));
/* 292 */             bool = MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D);
/* 293 */             if (!bool) {
/*     */               break label938;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */             d4 = d3 / 90.0D;
/* 304 */             d4 += -0.5D;
/* 305 */             i8 = (int)SystemLibrary.floor(d4);
/* 306 */             switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*     */             case 0: 
/*     */               break;
/*     */             case 1:  break label983;
/*     */               break; case 2:  d4 = -1.0D;
/*     */               
/*     */               break label1142;
/*     */               
/*     */               break;
/*     */             case 3: 
/*     */               break label983;
/*     */               break;
/*     */             }
/*     */             
/* 320 */             d4 = 1.0D;
/*     */             
/*     */             break label1142;
/*     */             
/*     */             label938:
/* 325 */             d4 = d3 * 3.141592653589793D;
/* 326 */             d4 /= 180.0D;
/* 327 */             d4 = SystemLibrary.sin(d4);
/* 328 */             if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */               break label1142;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label983:
/*     */             
/*     */ 
/*     */ 
/* 339 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/* 343 */               i4 = 4;
/*     */               
/* 345 */               i11 = paramInt8;
/* 346 */               paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 353 */               i7 += paramInt2;
/* 354 */               i6 += paramInt2;
/* 355 */               i5 += i2;
/* 356 */               i4 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 363 */                 i8 = i4 * paramInt5;
/* 364 */                 i11 = paramInt9 + (i8 << 3);
/* 365 */                 i13 = paramInt10 + (i4 << 2);
/* 366 */                 MainMemory.setF64(paramInt8 + (i8 << 3), 0.0D);
/* 367 */                 MainMemory.setF64(i11, 0.0D);
/* 368 */                 MainMemory.setI32(i13, 1);
/* 369 */                 i4 += 1;
/* 370 */                 if (i4 == j) {
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
/* 381 */               paramInt8 = i7;
/* 382 */               paramInt9 = i6;
/* 383 */               paramInt10 = i5;
/* 384 */               i4 = 4;
/*     */               
/* 386 */               i11 = paramInt9;
/*     */               
/*     */ 
/*     */               break label1604;
/*     */               
/*     */               label1142:
/*     */               
/* 393 */               d1 = MainMemory.getF64(paramInt6);
/* 394 */               if (!bool) {
/*     */                 break label1310;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */               d2 = d3 / 90.0D;
/* 405 */               d2 += 0.5D;
/* 406 */               i8 = (int)SystemLibrary.floor(d2);
/* 407 */               switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*     */               case 0:  break label1297;
/*     */                 break; case 1:  d3 = 0.0D;
/*     */                 break label1338;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d3 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label1338;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 422 */               d3 = -1.0D;
/*     */               
/*     */               break label1338;
/*     */               
/*     */               label1297:
/* 427 */               d3 = 1.0D;
/*     */               
/*     */               break label1338;
/*     */               
/*     */               label1310:
/* 432 */               d3 *= 3.141592653589793D;
/* 433 */               d3 /= 180.0D;
/* 434 */               d3 = SystemLibrary.cos(d3);
/*     */               
/*     */ 
/*     */ 
/*     */               label1338:
/*     */               
/*     */ 
/*     */ 
/* 442 */               d3 = d1 * d3;
/* 443 */               d3 /= d4;
/* 444 */               bool = (MainMemory.getI32(k) != 0) && (MathUtils.f_olt(d4, 0.0D));
/* 445 */               i4 = bool ? 4 : i4;
/* 446 */               i8 = bool ? 1 : 0;
/* 447 */               if (m == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 453 */                 i11 = paramInt8;
/* 454 */                 paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 461 */                 d4 = -0.0D - d3;
/* 462 */                 i7 += paramInt2;
/* 463 */                 i6 += paramInt2;
/* 464 */                 i5 += i2;
/* 465 */                 i9 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 472 */                   i10 = i9 * paramInt5;
/* 473 */                   i11 = paramInt9 + (i10 << 3);
/* 474 */                   i12 = paramInt8 + (i10 << 3);
/* 475 */                   i13 = paramInt10 + (i9 << 2);
/* 476 */                   d1 = MainMemory.getF64(i12) * d3;
/* 477 */                   d1 -= MainMemory.getF64(n);
/* 478 */                   MainMemory.setF64(i12, d1);
/* 479 */                   d1 = MainMemory.getF64(i11) * d4;
/* 480 */                   d1 -= MainMemory.getF64(i1);
/* 481 */                   MainMemory.setF64(i11, d1);
/* 482 */                   MainMemory.setI32(i13, i8);
/* 483 */                   i9 += 1;
/* 484 */                   if (i9 == j) {
/*     */                     break;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 495 */                 paramInt8 = i7;
/* 496 */                 paramInt9 = i6;
/* 497 */                 paramInt10 = i5;
/*     */                 
/*     */ 
/* 500 */                 i11 = paramInt9;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1604:
/*     */             
/*     */ 
/*     */ 
/* 511 */             i3 += 1;
/* 512 */             if (i3 == paramInt3) {
/* 513 */               paramInt2 = i4; break;
/*     */             }
/*     */             
/*     */ 
/* 517 */             paramInt9 = paramInt8;
/* 518 */             paramInt8 = i11;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1640:
/*     */       
/*     */ 
/*     */ 
/* 529 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 535 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 540 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tans2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */