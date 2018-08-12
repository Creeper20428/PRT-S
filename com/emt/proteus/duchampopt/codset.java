/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class codset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2857;
/*  12 */   public static final Function _instance = new codset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public codset() { super("codset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  39 */     double d1 = 0.0D;
/*  40 */     double d2 = 0.0D;
/*  41 */     double d3 = 0.0D;
/*  42 */     boolean bool = false;
/*  43 */     double d4 = 0.0D;
/*  44 */     double d5 = 0.0D;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*     */     
/*     */ 
/*  52 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       j = MainMemory.alloc(4);
/*  57 */       k = MainMemory.alloc(8);
/*  58 */       m = MainMemory.alloc(8);
/*  59 */       if (paramInt == 0) {
/*  60 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  70 */         MainMemory.setI32(paramInt, 503);
/*  71 */         MainMemory.setI32(paramInt + 4, 4476739);
/*  72 */         d1 = MainMemory.getF64(paramInt + 24);
/*  73 */         if (MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*  74 */           n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  84 */           i1 = paramInt + 32;
/*  85 */           d3 = MainMemory.getF64(i1);
/*  86 */           if (!MathUtils.f_oeq(d3, 9.87654321E107D))
/*     */           {
/*     */ 
/*     */ 
/*  90 */             d2 = d3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  97 */             MainMemory.setF64(i1, 0.0D);
/*  98 */             d2 = 0.0D;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           i1 = paramInt + 8;
/* 106 */           d3 = MainMemory.getF64(i1);
/* 107 */           if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */             break label238;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           MainMemory.setF64(i1, 57.29577951308232D);
/* 119 */           d3 = 57.29577951308232D;
/*     */           
/*     */ 
/*     */ 
/*     */           label238:
/*     */           
/*     */ 
/* 126 */           SystemLibrary.memcpy(paramInt + 276, 59648, 18, 1);
/* 127 */           MainMemory.setI32(paramInt + 316, 5);
/* 128 */           MainMemory.setI32(paramInt + 320, 102);
/* 129 */           MainMemory.setI32(paramInt + 324, 0);
/* 130 */           MainMemory.setI32(paramInt + 328, 0);
/* 131 */           MainMemory.setI32(paramInt + 332, 0);
/* 132 */           MainMemory.setI32(paramInt + 336, 1);
/* 133 */           MainMemory.setI32(paramInt + 340, 0);
/* 134 */           bool = MathUtils.f_oeq(d2, 0.0D);
/* 135 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label494;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */           d5 = d1 / 90.0D;
/* 146 */           d5 += -0.5D;
/* 147 */           n = (int)SystemLibrary.floor(d5);
/* 148 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label481;
/*     */             break; case 1:  d5 = 0.0D;
/*     */             break label522;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d5 = 0.0D;
/*     */             
/*     */ 
/*     */             break label522;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 163 */           d5 = -1.0D;
/*     */           
/*     */           break label522;
/*     */           
/*     */           label481:
/* 168 */           d5 = 1.0D;
/*     */           
/*     */           break label522;
/*     */           
/*     */           label494:
/* 173 */           d5 = d1 * 3.141592653589793D;
/* 174 */           d5 /= 180.0D;
/* 175 */           d5 = SystemLibrary.sin(d5);
/*     */           
/*     */ 
/*     */ 
/*     */           label522:
/*     */           
/*     */ 
/*     */ 
/* 183 */           d5 = d3 * d5;
/* 184 */           if (!bool) {
/*     */             break label583;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */           d5 *= 3.141592653589793D;
/* 195 */           d5 /= 180.0D;
/* 196 */           MainMemory.setF64(paramInt + 360, d5);
/*     */           
/*     */           break label811;
/*     */           
/*     */           label583:
/*     */           
/* 202 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */             break label754;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */           d4 = d2 / 90.0D;
/* 213 */           d4 += -0.5D;
/* 214 */           n = (int)SystemLibrary.floor(d4);
/* 215 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label741;
/*     */             break; case 1:  d4 = 0.0D;
/*     */             break label782;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d4 = 0.0D;
/*     */             
/*     */ 
/*     */             break label782;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 230 */           d4 = -1.0D;
/*     */           
/*     */           break label782;
/*     */           
/*     */           label741:
/* 235 */           d4 = 1.0D;
/*     */           
/*     */           break label782;
/*     */           
/*     */           label754:
/* 240 */           d4 = d2 * 3.141592653589793D;
/* 241 */           d4 /= 180.0D;
/* 242 */           d4 = SystemLibrary.sin(d4);
/*     */           
/*     */ 
/*     */ 
/*     */           label782:
/*     */           
/*     */ 
/*     */ 
/* 250 */           d5 *= d4;
/* 251 */           d5 /= d2;
/* 252 */           MainMemory.setF64(paramInt + 360, d5);
/*     */           
/*     */ 
/*     */ 
/*     */           label811:
/*     */           
/*     */ 
/*     */ 
/* 260 */           if (MathUtils.f_oeq(d5, 0.0D)) {
/* 261 */             n = 2;
/*     */           } else {
/*     */             break label849;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */       i = n;
/*     */       
/*     */ 
/*     */       break label1518;
/*     */       
/*     */       label849:
/*     */       
/* 279 */       d4 = 1.0D / d5;
/* 280 */       MainMemory.setF64(paramInt + 368, d4);
/* 281 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */         break label1034;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */       d4 = d2 / 90.0D;
/* 292 */       d4 += 0.5D;
/* 293 */       n = (int)SystemLibrary.floor(d4);
/* 294 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label1021;
/*     */         break; case 1:  d2 = 0.0D;
/*     */         break label1062;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d2 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1062;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 309 */       d2 = -1.0D;
/*     */       
/*     */       break label1062;
/*     */       
/*     */       label1021:
/* 314 */       d2 = 1.0D;
/*     */       
/*     */       break label1062;
/*     */       
/*     */       label1034:
/* 319 */       d2 *= 3.141592653589793D;
/* 320 */       d2 /= 180.0D;
/* 321 */       d2 = SystemLibrary.cos(d2);
/*     */       
/*     */ 
/*     */ 
/*     */       label1062:
/*     */       
/*     */ 
/*     */ 
/* 329 */       d3 *= d2;
/* 330 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */         break label1238;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */       d2 = d1 / 90.0D;
/* 341 */       d2 += 0.5D;
/* 342 */       n = (int)SystemLibrary.floor(d2);
/* 343 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label1225;
/*     */         break; case 1:  d2 = 0.0D;
/*     */         break label1266;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d2 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1266;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 358 */       d2 = -1.0D;
/*     */       
/*     */       break label1266;
/*     */       
/*     */       label1225:
/* 363 */       d2 = 1.0D;
/*     */       
/*     */       break label1266;
/*     */       
/*     */       label1238:
/* 368 */       d2 = d1 * 3.141592653589793D;
/* 369 */       d2 /= 180.0D;
/* 370 */       d2 = SystemLibrary.cos(d2);
/*     */       
/*     */ 
/*     */ 
/*     */       label1266:
/*     */       
/*     */ 
/*     */ 
/* 378 */       d3 *= d2;
/* 379 */       d3 /= d5;
/* 380 */       MainMemory.setF64(paramInt + 376, d3);
/* 381 */       d3 += d1;
/* 382 */       MainMemory.setF64(paramInt + 384, d3);
/* 383 */       MainMemory.setI32(paramInt + 448, 2858);
/* 384 */       MainMemory.setI32(paramInt + 452, 2859);
/* 385 */       i1 = paramInt + 344;
/* 386 */       MainMemory.setF64(i1, 0.0D);
/* 387 */       i2 = paramInt + 352;
/* 388 */       MainMemory.setF64(i2, 0.0D);
/* 389 */       i3 = paramInt + 256;
/* 390 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 400 */         i4 = paramInt + 264;
/* 401 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label1448;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */       MainMemory.setF64(i3, 0.0D);
/* 412 */       MainMemory.setF64(paramInt + 264, d1);
/* 413 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1518;
/*     */       
/*     */       label1448:
/*     */       
/* 420 */       if (cods2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label1511;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 430 */       MainMemory.setF64(i1, MainMemory.getF64(k));
/* 431 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 432 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1518;
/*     */       
/*     */       label1511:
/*     */       
/* 439 */       i = 2;
/*     */       
/*     */ 
/*     */       label1518:
/*     */       
/*     */ 
/* 445 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 450 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/codset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */