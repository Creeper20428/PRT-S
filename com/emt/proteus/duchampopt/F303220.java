/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F303220 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3188;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new F303220();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public F303220() { super("F303220", 1, false); }
/*     */   
/*     */   public int execute(double paramDouble)
/*     */   {
/*  18 */     return call(paramDouble);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int i = call(d);
/*  27 */     paramFrame.setI32(paramInt1, i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(double paramDouble)
/*     */   {
/*  33 */     int i = 0;
/*     */     
/*  35 */     boolean bool = false;
/*  36 */     double d1 = 0.0D;
/*  37 */     double d2 = 0.0D;
/*  38 */     double d3 = 0.0D;
/*  39 */     double d4 = 0.0D;
/*  40 */     double d5 = 0.0D;
/*  41 */     double d6 = 0.0D;
/*  42 */     double d7 = 0.0D;
/*  43 */     double d8 = 0.0D;
/*  44 */     double d9 = 0.0D;
/*  45 */     double d10 = 0.0D;
/*  46 */     double d11 = 0.0D;
/*  47 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (!MathUtils.f_oeq(MainMemory.getF64(467268), 0.0D)) {
/*     */         break label78;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */       MainMemory.setF64(467268, 3.141592653589793D);
/*     */       
/*     */ 
/*     */       label78:
/*     */       
/*     */ 
/*  69 */       bool = MathUtils.f_une(MainMemory.getF64(467276), paramDouble);
/*  70 */       if (!MathUtils.f_olt(paramDouble, 20.0D)) {
/*     */         break label400;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       if (!bool) {
/*     */         break label154;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       MainMemory.setF64(467276, paramDouble);
/*  91 */       paramDouble = -0.0D - paramDouble;
/*  92 */       MainMemory.setF64(467284, SystemLibrary.exp(paramDouble));
/*     */       
/*     */ 
/*     */       label154:
/*     */       
/*     */ 
/*  98 */       paramDouble = MainMemory.getF64(467252);
/*  99 */       d1 = paramDouble;
/* 100 */       d2 = -1.0D;
/* 101 */       paramDouble = 1.0D;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 110 */         d2 += 1.0D;
/* 111 */         if (!MathUtils.f_oeq(d1, 0.0D)) {
/*     */           break label275;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         if (SystemLibrary.rand() <= 32767)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */           if (SystemLibrary.rand() <= 32767) {
/*     */             break label262;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         MainMemory.setF64(467252, 2.147483648E9D);
/*     */         
/*     */         break label275;
/*     */         
/*     */         label262:
/* 146 */         MainMemory.setF64(467252, 32768.0D);
/*     */         
/*     */ 
/*     */         label275:
/*     */         
/*     */ 
/* 152 */         d1 = SystemLibrary.rand();
/* 153 */         d3 = MainMemory.getF64(467252);
/* 154 */         if (!MathUtils.f_ogt(d1, d3)) {
/*     */           break label351;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 167 */           d3 *= 2.0D;
/* 168 */         } while (MathUtils.f_ogt(d1, d3));
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
/* 179 */         MainMemory.setF64(467252, d3);
/*     */         
/*     */ 
/*     */ 
/*     */         label351:
/*     */         
/*     */ 
/*     */ 
/* 187 */         d1 /= d3;
/* 188 */         paramDouble = d1 * paramDouble;
/* 189 */         if (!MathUtils.f_ogt(paramDouble, MainMemory.getF64(467284))) break;
/* 190 */         d1 = d3;
/*     */       }
/*     */       
/*     */       break label400;
/*     */       
/* 195 */       paramDouble = d2;
/*     */       
/*     */ 
/*     */       break label1450;
/*     */       
/*     */       label400:
/*     */       
/* 202 */       if (!bool) {
/*     */         break label705;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */       MainMemory.setF64(467276, paramDouble);
/* 213 */       d2 = paramDouble * 2.0D;
/* 214 */       MainMemory.setF64(467292, SystemLibrary.sqrt(d2));
/* 215 */       d2 = SystemLibrary.log(paramDouble);
/* 216 */       MainMemory.setF64(467300, d2);
/* 217 */       d2 *= paramDouble;
/* 218 */       d1 = paramDouble + 1.0D;
/* 219 */       f = (float)d1;
/* 220 */       d1 = f;
/* 221 */       d3 = d1 + 5.5D;
/* 222 */       d4 = d1 + 0.5D;
/* 223 */       d4 *= SystemLibrary.log(d3);
/* 224 */       d3 -= d4;
/* 225 */       d9 = d1 + 1.0D;
/* 226 */       d10 = d9 + 1.0D;
/* 227 */       d6 = d10 + 1.0D;
/* 228 */       d5 = d6 + 1.0D;
/* 229 */       d4 = d5 + 1.0D;
/* 230 */       d9 = 76.18009172947146D / d9;
/* 231 */       d10 = -86.50532032941678D / d10;
/* 232 */       d9 += 1.000000000190015D;
/* 233 */       d10 += d9;
/* 234 */       d6 = 24.01409824083091D / d6;
/* 235 */       d5 = -1.231739572450155D / d5;
/* 236 */       d10 = d6 + d10;
/* 237 */       d6 = d4 + 1.0D;
/* 238 */       d5 += d10;
/* 239 */       d4 = 0.001208650973866179D / d4;
/* 240 */       d6 = -5.395239384953E-6D / d6;
/* 241 */       d4 += d5;
/* 242 */       d4 = d6 + d4;
/* 243 */       d4 *= 2.5066282746310007D;
/* 244 */       f = (float)d3;
/* 245 */       f = -0.0F - f;
/* 246 */       d3 = f;
/* 247 */       d1 = d4 / d1;
/* 248 */       d1 = d3 + SystemLibrary.log(d1);
/* 249 */       f = (float)d1;
/* 250 */       d1 = f;
/* 251 */       d2 -= d1;
/* 252 */       MainMemory.setF64(467284, d2);
/*     */       
/*     */ 
/*     */       label705:
/*     */       
/*     */ 
/* 258 */       d2 = MainMemory.getF64(467252);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 266 */         if (!MathUtils.f_oeq(d2, 0.0D)) {
/*     */           break label811;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */         if (SystemLibrary.rand() <= 32767)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */           if (SystemLibrary.rand() <= 32767) {
/*     */             break label798;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */         MainMemory.setF64(467252, 2.147483648E9D);
/*     */         
/*     */         break label811;
/*     */         
/*     */         label798:
/* 301 */         MainMemory.setF64(467252, 32768.0D);
/*     */         
/*     */ 
/*     */         label811:
/*     */         
/*     */ 
/* 307 */         d2 = SystemLibrary.rand();
/* 308 */         d1 = MainMemory.getF64(467252);
/* 309 */         if (!MathUtils.f_ogt(d2, d1)) {
/*     */           break label887;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 322 */           d1 *= 2.0D;
/* 323 */         } while (MathUtils.f_ogt(d2, d1));
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
/* 334 */         MainMemory.setF64(467252, d1);
/*     */         
/*     */ 
/*     */ 
/*     */         label887:
/*     */         
/*     */ 
/*     */ 
/* 342 */         d2 /= d1;
/* 343 */         d2 *= MainMemory.getF64(467268);
/* 344 */         d3 = SystemLibrary.tan(d2);
/* 345 */         d2 = MainMemory.getF64(467292) * d3;
/* 346 */         d2 += paramDouble;
/* 347 */         if (MathUtils.f_olt(d2, 0.0D)) {
/* 348 */           d2 = d1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 358 */           d2 = SystemLibrary.floor(d2);
/* 359 */           d3 *= d3;
/* 360 */           d3 += 1.0D;
/* 361 */           d3 *= 0.9D;
/* 362 */           d4 = d2 * MainMemory.getF64(467300);
/* 363 */           d5 = d2 + 1.0D;
/* 364 */           f = (float)d5;
/* 365 */           d5 = f;
/* 366 */           d6 = d5 + 5.5D;
/* 367 */           d10 = d5 + 0.5D;
/* 368 */           d10 *= SystemLibrary.log(d6);
/* 369 */           d6 -= d10;
/* 370 */           d11 = d5 + 1.0D;
/* 371 */           d7 = d11 + 1.0D;
/* 372 */           d8 = d7 + 1.0D;
/* 373 */           d9 = d8 + 1.0D;
/* 374 */           d10 = d9 + 1.0D;
/* 375 */           d11 = 76.18009172947146D / d11;
/* 376 */           d7 = -86.50532032941678D / d7;
/* 377 */           d11 += 1.000000000190015D;
/* 378 */           d7 += d11;
/* 379 */           d8 = 24.01409824083091D / d8;
/* 380 */           d9 = -1.231739572450155D / d9;
/* 381 */           d7 = d8 + d7;
/* 382 */           d8 = d10 + 1.0D;
/* 383 */           d9 += d7;
/* 384 */           d10 = 0.001208650973866179D / d10;
/* 385 */           d8 = -5.395239384953E-6D / d8;
/* 386 */           d10 += d9;
/* 387 */           d10 = d8 + d10;
/* 388 */           d10 *= 2.5066282746310007D;
/* 389 */           f = (float)d6;
/* 390 */           f = -0.0F - f;
/* 391 */           d6 = f;
/* 392 */           d5 = d10 / d5;
/* 393 */           d5 = d6 + SystemLibrary.log(d5);
/* 394 */           f = (float)d5;
/* 395 */           d5 = f;
/* 396 */           d4 -= d5;
/* 397 */           d4 -= MainMemory.getF64(467284);
/* 398 */           d3 *= SystemLibrary.exp(d4);
/* 399 */           if (!MathUtils.f_oeq(d1, 0.0D)) {
/*     */             break label1337;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */           if (SystemLibrary.rand() <= 32767)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 419 */             if (SystemLibrary.rand() <= 32767) {
/*     */               break label1324;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */           MainMemory.setF64(467252, 2.147483648E9D);
/*     */           
/*     */           break label1337;
/*     */           
/*     */           label1324:
/* 434 */           MainMemory.setF64(467252, 32768.0D);
/*     */           
/*     */ 
/*     */           label1337:
/*     */           
/*     */ 
/* 440 */           d1 = SystemLibrary.rand();
/* 441 */           d4 = MainMemory.getF64(467252);
/* 442 */           if (!MathUtils.f_ogt(d1, d4)) {
/*     */             break label1413;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 455 */             d4 *= 2.0D;
/* 456 */           } while (MathUtils.f_ogt(d1, d4));
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
/* 467 */           MainMemory.setF64(467252, d4);
/*     */           
/*     */ 
/*     */ 
/*     */           label1413:
/*     */           
/*     */ 
/*     */ 
/* 475 */           d1 /= d4;
/* 476 */           if (!MathUtils.f_ogt(d1, d3)) break;
/* 477 */           d2 = d4;
/*     */         } }
/*     */       break label1450;
/* 480 */       paramDouble = d2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1450:
/*     */       
/*     */ 
/*     */ 
/* 489 */       paramDouble += 0.5D;
/* 490 */       i = (int)SystemLibrary.floor(paramDouble);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 496 */       int j = i;return j;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F303220.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */