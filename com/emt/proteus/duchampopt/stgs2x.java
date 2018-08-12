/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class stgs2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2850;
/*  12 */   public static final Function _instance = new stgs2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public stgs2x() { super("stgs2x", 10, false); }
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
/*  78 */     double d4 = 0.0D;
/*  79 */     int i8 = 0;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     int i12 = 0;
/*     */     
/*     */ 
/*  86 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  90 */       n = MainMemory.alloc(8);
/*  91 */       i1 = MainMemory.alloc(8);
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
/* 103 */         if (MainMemory.getI32(paramInt1) != 104)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */           if (stgset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 117 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1586;
/*     */           }
/*     */         }
/*     */         
/* 124 */         m = paramInt3 > 0 ? 1 : 0;
/* 125 */         j = m != 0 ? paramInt2 : 1;
/* 126 */         i2 = m != 0 ? paramInt3 : 1;
/* 127 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 128 */         if (paramInt2 <= 0) {
/*     */           break label667;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         m = i2 > 0 ? 1 : 0;
/* 139 */         i3 = paramInt5 * paramInt2;
/* 140 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 147 */           i8 = i4 * paramInt5;
/* 148 */           d3 = MainMemory.getF64(paramInt6 + (i4 * paramInt4 << 3));
/* 149 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */             break label508;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           d4 = d3 / 90.0D;
/* 160 */           d4 += 0.5D;
/* 161 */           i9 = (int)SystemLibrary.floor(d4);
/* 162 */           switch ((i9 > -1 ? i9 : 0 - i9) & 0x3) {
/*     */           case 0: 
/*     */             break label486;
/*     */             break;
/*     */           case 1: 
/*     */             break label449;
/*     */             break;
/*     */           case 2: 
/*     */             break label425;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 175 */           MainMemory.setF64(i1, MathUtils.f_ogt(d3, 0.0D) ? -1.0D : 1.0D);
/* 176 */           MainMemory.setF64(n, 0.0D);
/*     */           
/*     */           break label538;
/*     */           
/*     */           label425:
/* 181 */           MainMemory.setF64(i1, 0.0D);
/* 182 */           MainMemory.setF64(n, -1.0D);
/*     */           
/*     */           break label538;
/*     */           
/*     */           label449:
/* 187 */           MainMemory.setF64(i1, MathUtils.f_ogt(d3, 0.0D) ? 1.0D : -1.0D);
/* 188 */           MainMemory.setF64(n, 0.0D);
/*     */           
/*     */           break label538;
/*     */           
/*     */           label486:
/* 193 */           MainMemory.setF64(i1, 0.0D);
/* 194 */           MainMemory.setF64(n, 1.0D);
/*     */           
/*     */           break label538;
/*     */           
/*     */           label508:
/* 199 */           d3 *= 3.141592653589793D;
/* 200 */           d3 /= 180.0D;
/* 201 */           SystemLibrary.sincos(d3, i1, n);
/*     */           
/*     */ 
/*     */           label538:
/*     */           
/*     */ 
/* 207 */           if (m == 0) {
/*     */             break label642;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           d3 = MainMemory.getF64(i1);
/* 218 */           d4 = MainMemory.getF64(n);
/* 219 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 226 */             k = i8 + i3 * i9;
/* 227 */             i10 = paramInt9 + (k << 3);
/* 228 */             MainMemory.setF64(paramInt8 + (k << 3), d3);
/* 229 */             MainMemory.setF64(i10, d4);
/* 230 */             i9 += 1;
/* 231 */             if (i9 == i2) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label642:
/*     */           
/*     */ 
/*     */ 
/* 242 */           i4 += 1;
/* 243 */           if (i4 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label667:
/*     */         
/*     */ 
/*     */ 
/* 254 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 258 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 265 */           paramInt6 = paramInt1 + 360;
/* 266 */           m = j > 0 ? 1 : 0;
/* 267 */           n = paramInt1 + 344;
/* 268 */           i1 = paramInt1 + 352;
/* 269 */           paramInt2 = j * paramInt5 << 3;
/* 270 */           i2 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 274 */           i3 = 0;
/* 275 */           i4 = 0;
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
/* 286 */             i5 = paramInt10;
/* 287 */             i6 = paramInt8;
/* 288 */             i7 = paramInt9;
/* 289 */             d3 = MainMemory.getF64(paramInt7 + (i3 * paramInt4 << 3));
/* 290 */             bool = MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D);
/* 291 */             if (!bool) {
/*     */               break label933;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */             d4 = d3 / 90.0D;
/* 302 */             d4 += -0.5D;
/* 303 */             i8 = (int)SystemLibrary.floor(d4);
/* 304 */             switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*     */             case 0: 
/*     */               break;
/* 307 */             case 1:  d4 = 1.0D;
/*     */               break label1139;
/*     */               break; case 2:  break label980;
/*     */               break; case 3:  d4 = 1.0D;
/*     */               
/*     */ 
/*     */               break label1139;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 319 */             d4 = 2.0D;
/*     */             
/*     */             break label1139;
/*     */             
/*     */             label933:
/* 324 */             d4 = d3 * 3.141592653589793D;
/* 325 */             d4 /= 180.0D;
/* 326 */             d4 = SystemLibrary.sin(d4) + 1.0D;
/* 327 */             if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */               break label1139;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label980:
/*     */             
/*     */ 
/*     */ 
/* 338 */             if (m == 0)
/*     */             {
/*     */ 
/*     */ 
/* 342 */               i4 = 4;
/*     */               
/* 344 */               i10 = paramInt8;
/* 345 */               paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 352 */               i7 += paramInt2;
/* 353 */               i6 += paramInt2;
/* 354 */               i5 += i2;
/* 355 */               i4 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 362 */                 i8 = i4 * paramInt5;
/* 363 */                 i10 = paramInt9 + (i8 << 3);
/* 364 */                 i12 = paramInt10 + (i4 << 2);
/* 365 */                 MainMemory.setF64(paramInt8 + (i8 << 3), 0.0D);
/* 366 */                 MainMemory.setF64(i10, 0.0D);
/* 367 */                 MainMemory.setI32(i12, 1);
/* 368 */                 i4 += 1;
/* 369 */                 if (i4 == j) {
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
/* 380 */               paramInt8 = i7;
/* 381 */               paramInt9 = i6;
/* 382 */               paramInt10 = i5;
/* 383 */               i4 = 4;
/*     */               
/* 385 */               i10 = paramInt9;
/*     */               
/*     */ 
/*     */               break label1550;
/*     */               
/*     */               label1139:
/*     */               
/* 392 */               d1 = MainMemory.getF64(paramInt6);
/* 393 */               if (!bool) {
/*     */                 break label1306;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */               d2 = d3 / 90.0D;
/* 404 */               d2 += 0.5D;
/* 405 */               i8 = (int)SystemLibrary.floor(d2);
/* 406 */               switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*     */               case 0:  break label1293;
/*     */                 break; case 1:  d3 = 0.0D;
/*     */                 break label1334;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d3 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label1334;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 421 */               d3 = -1.0D;
/*     */               
/*     */               break label1334;
/*     */               
/*     */               label1293:
/* 426 */               d3 = 1.0D;
/*     */               
/*     */               break label1334;
/*     */               
/*     */               label1306:
/* 431 */               d3 *= 3.141592653589793D;
/* 432 */               d3 /= 180.0D;
/* 433 */               d3 = SystemLibrary.cos(d3);
/*     */               
/*     */ 
/*     */ 
/*     */               label1334:
/*     */               
/*     */ 
/*     */ 
/* 441 */               d3 = d1 * d3;
/* 442 */               d3 /= d4;
/* 443 */               if (m == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */                 i10 = paramInt8;
/* 450 */                 paramInt8 = paramInt9;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 457 */                 d4 = -0.0D - d3;
/* 458 */                 i7 += paramInt2;
/* 459 */                 i6 += paramInt2;
/* 460 */                 i5 += i2;
/* 461 */                 i8 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 468 */                   i9 = i8 * paramInt5;
/* 469 */                   i10 = paramInt9 + (i9 << 3);
/* 470 */                   i11 = paramInt8 + (i9 << 3);
/* 471 */                   i12 = paramInt10 + (i8 << 2);
/* 472 */                   d1 = MainMemory.getF64(i11) * d3;
/* 473 */                   d1 -= MainMemory.getF64(n);
/* 474 */                   MainMemory.setF64(i11, d1);
/* 475 */                   d1 = MainMemory.getF64(i10) * d4;
/* 476 */                   d1 -= MainMemory.getF64(i1);
/* 477 */                   MainMemory.setF64(i10, d1);
/* 478 */                   MainMemory.setI32(i12, 0);
/* 479 */                   i8 += 1;
/* 480 */                   if (i8 == j) {
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
/* 491 */                 paramInt8 = i7;
/* 492 */                 paramInt9 = i6;
/* 493 */                 paramInt10 = i5;
/*     */                 
/*     */ 
/* 496 */                 i10 = paramInt9;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1550:
/*     */             
/*     */ 
/*     */ 
/* 507 */             i3 += 1;
/* 508 */             if (i3 == paramInt3) {
/* 509 */               paramInt2 = i4; break;
/*     */             }
/*     */             
/*     */ 
/* 513 */             paramInt9 = paramInt8;
/* 514 */             paramInt8 = i10;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1586:
/*     */       
/*     */ 
/*     */ 
/* 525 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 531 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 536 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/stgs2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */