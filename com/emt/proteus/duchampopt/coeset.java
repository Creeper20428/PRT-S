/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class coeset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2809;
/*  12 */   public static final Function _instance = new coeset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public coeset() { super("coeset", 1, false); }
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
/*  42 */     double d4 = 0.0D;
/*  43 */     double d5 = 0.0D;
/*  44 */     double d6 = 0.0D;
/*  45 */     double d7 = 0.0D;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*     */     
/*     */ 
/*  53 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       j = MainMemory.alloc(4);
/*  58 */       k = MainMemory.alloc(8);
/*  59 */       m = MainMemory.alloc(8);
/*  60 */       if (paramInt == 0) {
/*  61 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  71 */         MainMemory.setI32(paramInt, 502);
/*  72 */         MainMemory.setI32(paramInt + 4, 4542275);
/*  73 */         d1 = MainMemory.getF64(paramInt + 24);
/*  74 */         if (MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*  75 */           n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  85 */           i1 = paramInt + 32;
/*  86 */           d2 = MainMemory.getF64(i1);
/*  87 */           if (!MathUtils.f_oeq(d2, 9.87654321E107D))
/*     */           {
/*     */ 
/*     */ 
/*  91 */             d6 = d2;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  98 */             MainMemory.setF64(i1, 0.0D);
/*  99 */             d6 = 0.0D;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */           i1 = paramInt + 8;
/* 107 */           d2 = MainMemory.getF64(i1);
/* 108 */           if (!MathUtils.f_oeq(d2, 0.0D)) {
/*     */             break label241;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           MainMemory.setF64(i1, 57.29577951308232D);
/* 120 */           d2 = 57.29577951308232D;
/*     */           
/*     */ 
/*     */ 
/*     */           label241:
/*     */           
/*     */ 
/* 127 */           SystemLibrary.memcpy(paramInt + 276, 58304, 17, 1);
/* 128 */           MainMemory.setI32(paramInt + 316, 5);
/* 129 */           MainMemory.setI32(paramInt + 320, 102);
/* 130 */           MainMemory.setI32(paramInt + 324, 0);
/* 131 */           MainMemory.setI32(paramInt + 328, 1);
/* 132 */           MainMemory.setI32(paramInt + 332, 0);
/* 133 */           MainMemory.setI32(paramInt + 336, 1);
/* 134 */           MainMemory.setI32(paramInt + 340, 0);
/* 135 */           d3 = d1 - d6;
/* 136 */           d4 = d1 + d6;
/* 137 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */             break label502;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           d6 = d3 / 90.0D;
/* 148 */           d6 += -0.5D;
/* 149 */           n = (int)SystemLibrary.floor(d6);
/* 150 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label489;
/*     */             break; case 1:  d6 = 0.0D;
/*     */             break label530;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d6 = 0.0D;
/*     */             
/*     */ 
/*     */             break label530;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 165 */           d6 = -1.0D;
/*     */           
/*     */           break label530;
/*     */           
/*     */           label489:
/* 170 */           d6 = 1.0D;
/*     */           
/*     */           break label530;
/*     */           
/*     */           label502:
/* 175 */           d6 = d3 * 3.141592653589793D;
/* 176 */           d6 /= 180.0D;
/* 177 */           d6 = SystemLibrary.sin(d6);
/*     */           
/*     */ 
/*     */ 
/*     */           label530:
/*     */           
/*     */ 
/*     */ 
/* 185 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d4, 90.0D), 0.0D)) {
/*     */             break label702;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */           d5 = d4 / 90.0D;
/* 196 */           d5 += -0.5D;
/* 197 */           n = (int)SystemLibrary.floor(d5);
/* 198 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0:  break label689;
/*     */             break; case 1:  d5 = 0.0D;
/*     */             break label730;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d5 = 0.0D;
/*     */             
/*     */ 
/*     */             break label730;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 213 */           d5 = -1.0D;
/*     */           
/*     */           break label730;
/*     */           
/*     */           label689:
/* 218 */           d5 = 1.0D;
/*     */           
/*     */           break label730;
/*     */           
/*     */           label702:
/* 223 */           d5 = d4 * 3.141592653589793D;
/* 224 */           d5 /= 180.0D;
/* 225 */           d5 = SystemLibrary.sin(d5);
/*     */           
/*     */ 
/*     */ 
/*     */           label730:
/*     */           
/*     */ 
/*     */ 
/* 233 */           d6 += d5;
/* 234 */           d5 = d6 * 0.5D;
/* 235 */           MainMemory.setF64(paramInt + 360, d5);
/* 236 */           if (MathUtils.f_oeq(d5, 0.0D)) {
/* 237 */             n = 2;
/*     */           } else {
/*     */             break label793;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */       i = n;
/*     */       
/*     */ 
/*     */       break label1791;
/*     */       
/*     */       label793:
/*     */       
/* 255 */       d6 = 1.0D / d5;
/* 256 */       MainMemory.setF64(paramInt + 368, d6);
/* 257 */       d6 = d2 / d5;
/* 258 */       MainMemory.setF64(paramInt + 384, d6);
/* 259 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */         break label998;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */       d7 = d3 / 90.0D;
/* 270 */       d7 += -0.5D;
/* 271 */       n = (int)SystemLibrary.floor(d7);
/* 272 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label985;
/*     */         break; case 1:  d3 = 0.0D;
/*     */         break label1026;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d3 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1026;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 287 */       d3 = -1.0D;
/*     */       
/*     */       break label1026;
/*     */       
/*     */       label985:
/* 292 */       d3 = 1.0D;
/*     */       
/*     */       break label1026;
/*     */       
/*     */       label998:
/* 297 */       d3 *= 3.141592653589793D;
/* 298 */       d3 /= 180.0D;
/* 299 */       d3 = SystemLibrary.sin(d3);
/*     */       
/*     */ 
/*     */ 
/*     */       label1026:
/*     */       
/*     */ 
/*     */ 
/* 307 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d4, 90.0D), 0.0D)) {
/*     */         break label1198;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */       d7 = d4 / 90.0D;
/* 318 */       d7 += -0.5D;
/* 319 */       n = (int)SystemLibrary.floor(d7);
/* 320 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label1185;
/*     */         break; case 1:  d4 = 0.0D;
/*     */         break label1226;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d4 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1226;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 335 */       d4 = -1.0D;
/*     */       
/*     */       break label1226;
/*     */       
/*     */       label1185:
/* 340 */       d4 = 1.0D;
/*     */       
/*     */       break label1226;
/*     */       
/*     */       label1198:
/* 345 */       d4 *= 3.141592653589793D;
/* 346 */       d4 /= 180.0D;
/* 347 */       d4 = SystemLibrary.sin(d4);
/*     */       
/*     */ 
/*     */ 
/*     */       label1226:
/*     */       
/*     */ 
/*     */ 
/* 355 */       d4 = d3 * d4;
/* 356 */       d4 += 1.0D;
/* 357 */       MainMemory.setF64(paramInt + 392, d4);
/* 358 */       d3 = d5 * 2.0D;
/* 359 */       MainMemory.setF64(paramInt + 400, d3);
/* 360 */       d5 = d6 * d6;
/* 361 */       d5 *= d4;
/* 362 */       MainMemory.setF64(paramInt + 408, d5);
/* 363 */       d2 *= 2.0D;
/* 364 */       d2 *= d6;
/* 365 */       d2 = 1.0D / d2;
/* 366 */       MainMemory.setF64(paramInt + 416, d2);
/* 367 */       d2 = d4 + d3;
/* 368 */       d2 = d6 * SystemLibrary.sqrt(d2);
/* 369 */       MainMemory.setF64(paramInt + 424, d2);
/* 370 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */         break label1518;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */       d2 = d1 / 90.0D;
/* 381 */       d2 += -0.5D;
/* 382 */       n = (int)SystemLibrary.floor(d2);
/* 383 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label1505;
/*     */         break; case 1:  d2 = 0.0D;
/*     */         break label1546;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d2 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1546;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 398 */       d2 = -1.0D;
/*     */       
/*     */       break label1546;
/*     */       
/*     */       label1505:
/* 403 */       d2 = 1.0D;
/*     */       
/*     */       break label1546;
/*     */       
/*     */       label1518:
/* 408 */       d2 = d1 * 3.141592653589793D;
/* 409 */       d2 /= 180.0D;
/* 410 */       d2 = SystemLibrary.sin(d2);
/*     */       
/*     */ 
/*     */ 
/*     */       label1546:
/*     */       
/*     */ 
/*     */ 
/* 418 */       d2 = d3 * d2;
/* 419 */       d2 = d4 - d2;
/* 420 */       d2 = d6 * SystemLibrary.sqrt(d2);
/* 421 */       MainMemory.setF64(paramInt + 376, d2);
/* 422 */       MainMemory.setI32(paramInt + 448, 2810);
/* 423 */       MainMemory.setI32(paramInt + 452, 2811);
/* 424 */       i1 = paramInt + 344;
/* 425 */       MainMemory.setF64(i1, 0.0D);
/* 426 */       i2 = paramInt + 352;
/* 427 */       MainMemory.setF64(i2, 0.0D);
/* 428 */       i3 = paramInt + 256;
/* 429 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 439 */         i4 = paramInt + 264;
/* 440 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label1721;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 450 */       MainMemory.setF64(i3, 0.0D);
/* 451 */       MainMemory.setF64(paramInt + 264, d1);
/* 452 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1791;
/*     */       
/*     */       label1721:
/*     */       
/* 459 */       if (coes2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label1784;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 469 */       MainMemory.setF64(i1, MainMemory.getF64(k));
/* 470 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 471 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1791;
/*     */       
/*     */       label1784:
/*     */       
/* 478 */       i = 2;
/*     */       
/*     */ 
/*     */       label1791:
/*     */       
/*     */ 
/* 484 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 489 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/coeset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */