/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class zpnset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2839;
/*  12 */   public static final Function _instance = new zpnset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public zpnset() { super("zpnset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     double d1 = 0.0D;
/*  44 */     int i4 = 0;
/*  45 */     int i5 = 0;
/*  46 */     double d2 = 0.0D;
/*  47 */     double d3 = 0.0D;
/*  48 */     int i6 = 0;
/*  49 */     double d4 = 0.0D;
/*  50 */     double d5 = 0.0D;
/*  51 */     double d6 = 0.0D;
/*  52 */     double d7 = 0.0D;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*  55 */     int i9 = 0;
/*  56 */     int i10 = 0;
/*     */     
/*     */ 
/*  59 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       j = MainMemory.alloc(4);
/*  64 */       k = MainMemory.alloc(8);
/*  65 */       m = MainMemory.alloc(8);
/*  66 */       if (paramInt == 0) {
/*  67 */         i2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  77 */         MainMemory.setI32(paramInt + 4, 5132378);
/*  78 */         MainMemory.setI32(paramInt, 107);
/*  79 */         i7 = paramInt + 24;
/*  80 */         d4 = MainMemory.getF64(i7);
/*  81 */         if (!MathUtils.f_oeq(d4, 9.87654321E107D)) {
/*     */           break label168;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         MainMemory.setF64(i7, 0.0D);
/*  93 */         d4 = 0.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label168:
/*     */         
/*     */ 
/* 100 */         i7 = paramInt + 32;
/* 101 */         if (!MathUtils.f_oeq(MainMemory.getF64(i7), 9.87654321E107D)) {
/*     */           break label212;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         MainMemory.setF64(i7, 0.0D);
/*     */         
/*     */ 
/*     */         label212:
/*     */         
/*     */ 
/* 117 */         i7 = paramInt + 40;
/* 118 */         if (!MathUtils.f_oeq(MainMemory.getF64(i7), 9.87654321E107D)) {
/*     */           break label256;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         MainMemory.setF64(i7, 0.0D);
/*     */         
/*     */ 
/*     */         label256:
/*     */         
/*     */ 
/* 134 */         i7 = paramInt + 8;
/* 135 */         if (!MathUtils.f_oeq(MainMemory.getF64(i7), 0.0D)) {
/*     */           break label300;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         MainMemory.setF64(i7, 57.29577951308232D);
/*     */         
/*     */ 
/*     */         label300:
/*     */         
/*     */ 
/* 151 */         com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 76000, 30, 1);
/* 152 */         MainMemory.setI32(paramInt + 316, 1);
/* 153 */         MainMemory.setI32(paramInt + 320, 30);
/* 154 */         MainMemory.setI32(paramInt + 324, 1);
/* 155 */         MainMemory.setI32(paramInt + 328, 0);
/* 156 */         MainMemory.setI32(paramInt + 332, 0);
/* 157 */         n = paramInt + 336;
/* 158 */         MainMemory.setI32(n, 0);
/* 159 */         MainMemory.setI32(paramInt + 340, 0);
/* 160 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 167 */           i2 = 29 - i1;
/* 168 */           if (i2 < 0) {
/* 169 */             i2 = 2;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label1412;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 179 */           if (!MathUtils.f_oeq(MainMemory.getF64(paramInt + 16 + (i2 << 3)), 0.0D)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */           i2 = i1 + 1;
/* 190 */           i1 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 195 */         MainMemory.setI32(paramInt + 444, i2);
/* 196 */         if (i2 >= 2) {
/*     */           break label516;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */         MainMemory.setF64(paramInt + 360, 3.141592653589793D);
/*     */         
/*     */ 
/*     */         label516:
/*     */         
/* 211 */         if (!MathUtils.f_ugt(d4, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/* 215 */           i2 = 2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 222 */           i3 = i2 > 0 ? 1 : 0;
/* 223 */           d7 = 0.0D;
/* 224 */           d5 = d4;
/* 225 */           i6 = 0;
/* 226 */           d6 = 0.0D;
/* 227 */           d4 = 0.0D;
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
/* 238 */             if (i6 >= 180)
/*     */             {
/*     */ 
/*     */ 
/* 242 */               d2 = d7;
/* 243 */               d7 = d4;
/* 244 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 250 */             d4 = i6;
/* 251 */             d4 *= 3.141592653589793D;
/* 252 */             d4 /= 180.0D;
/* 253 */             if (i3 != 0) {
/* 254 */               i4 = 0;
/* 255 */               d7 = 0.0D;
/*     */             }
/*     */             else
/*     */             {
/* 259 */               d2 = 0.0D;
/* 260 */               d7 = d4;
/* 261 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 269 */               i5 = i2 - i4;
/* 270 */               d7 *= d4;
/* 271 */               d1 = i5;
/* 272 */               d1 *= MainMemory.getF64(paramInt + 16 + (i5 << 3));
/* 273 */               d1 = d7 + d1;
/* 274 */               i4 += 1;
/* 275 */               if (i4 == i2) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/* 280 */               d7 = d1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */             if (!MathUtils.f_ugt(d1, 0.0D))
/*     */             {
/*     */ 
/*     */ 
/* 291 */               d2 = d1;
/* 292 */               d7 = d4;
/* 293 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 299 */             i6 += 1;
/* 300 */             d7 = d1;
/* 301 */             d5 = d1;
/*     */             
/* 303 */             d6 = d4;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */           if (i6 != 180)
/*     */           {
/*     */ 
/*     */ 
/* 315 */             i6 = 1;
/* 316 */             d1 = 0.0D;
/* 317 */             d4 = d2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 327 */             MainMemory.setI32(n, 1);
/* 328 */             d4 = 3.141592653589793D;
/*     */             
/*     */ 
/*     */ 
/*     */             break label1077;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 339 */             if (i6 >= 11)
/*     */             {
/*     */ 
/*     */ 
/* 343 */               d4 = d1;
/* 344 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 350 */             d1 = d7 - d6;
/* 351 */             d1 *= d5;
/* 352 */             d2 = d4 - d5;
/* 353 */             d1 /= d2;
/* 354 */             d1 = d6 - d1;
/* 355 */             if (i3 != 0) {
/* 356 */               i4 = 0;
/* 357 */               d2 = 0.0D;
/*     */             }
/*     */             else
/*     */             {
/* 361 */               d2 = 0.0D;
/*     */               
/*     */ 
/*     */               break label993;
/*     */             }
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 370 */               i5 = i2 - i4;
/* 371 */               d2 *= d1;
/* 372 */               d3 = i5;
/* 373 */               d3 *= MainMemory.getF64(paramInt + 16 + (i5 << 3));
/* 374 */               d2 += d3;
/* 375 */               i4 += 1;
/* 376 */               if (i4 == i2) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label993:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 390 */             if (MathUtils.f_olt(com.emt.proteus.runtime.api.SystemLibrary.fabs(d2), 1.0E-13D)) {
/* 391 */               d4 = d1;
/* 392 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 401 */             if (MathUtils.f_olt(d2, 0.0D)) {
/* 402 */               d4 = d2;
/*     */               
/*     */ 
/* 405 */               d7 = d1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 416 */               d5 = d2;
/* 417 */               d6 = d1;
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
/* 428 */             i6 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label1077:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 440 */           if (i2 <= -1)
/*     */           {
/*     */ 
/*     */ 
/* 444 */             d5 = 0.0D;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 451 */             i1 = 30 - i1;
/* 452 */             i6 = 0;
/* 453 */             d5 = 0.0D;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 461 */               d5 *= d4;
/* 462 */               d5 += MainMemory.getF64(paramInt + 16 + (i2 - i6 << 3));
/* 463 */               i6 += 1;
/* 464 */               if (i6 == i1) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 478 */           MainMemory.setF64(paramInt + 360, d4);
/* 479 */           MainMemory.setF64(paramInt + 368, d5);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */           MainMemory.setI32(paramInt + 448, 2840);
/* 486 */           MainMemory.setI32(paramInt + 452, 2841);
/* 487 */           i7 = paramInt + 344;
/* 488 */           MainMemory.setF64(i7, 0.0D);
/* 489 */           i8 = paramInt + 352;
/* 490 */           MainMemory.setF64(i8, 0.0D);
/* 491 */           i9 = paramInt + 256;
/* 492 */           if (!MathUtils.f_oeq(MainMemory.getF64(i9), 9.87654321E107D))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */             i10 = paramInt + 264;
/* 503 */             if (!MathUtils.f_oeq(MainMemory.getF64(i10), 9.87654321E107D)) {
/*     */               break label1337;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 513 */           MainMemory.setF64(i9, 0.0D);
/* 514 */           MainMemory.setF64(paramInt + 264, 90.0D);
/* 515 */           i = 0;
/*     */           
/*     */ 
/*     */           break label1420;
/*     */           
/*     */           label1337:
/*     */           
/* 522 */           if (zpns2x.call(paramInt, 1, 1, 1, 1, i9, i10, k, m, j) != 0) {
/*     */             break label1400;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 532 */           MainMemory.setF64(i7, MainMemory.getF64(k));
/* 533 */           MainMemory.setF64(i8, MainMemory.getF64(m));
/* 534 */           i = 0;
/*     */           
/*     */ 
/*     */           break label1420;
/*     */           
/*     */           label1400:
/*     */           
/* 541 */           i = 2;
/*     */           
/*     */           break label1420;
/*     */         }
/*     */       }
/*     */       
/*     */       label1412:
/*     */       
/* 549 */       i = i2;
/*     */       
/*     */ 
/*     */       label1420:
/*     */       
/*     */ 
/* 555 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 560 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/zpnset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */