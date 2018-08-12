/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fffstrr8 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3299;
/*  12 */   public static final Function _instance = new fffstrr8();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fffstrr8() { super("fffstrr8", 13, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, double paramDouble3, int paramInt4, int paramInt5, double paramDouble4, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramDouble3, paramInt4, paramInt5, paramDouble4, paramInt6, paramInt7, paramInt8, paramInt9);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     double d4 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     call(i, j, d1, d2, k, d3, m, n, d4, i1, i2, i3, i4);
/*  65 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, double paramDouble3, int paramInt4, int paramInt5, double paramDouble4, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  71 */     int i = 0;
/*  72 */     int j = 0;
/*  73 */     int k = 0;
/*  74 */     int m = 0;
/*  75 */     byte b = 0;
/*  76 */     double d1 = 0.0D;
/*  77 */     double d2 = 0.0D;
/*  78 */     int n = 0;
/*  79 */     double d3 = 0.0D;
/*  80 */     double d4 = 0.0D;
/*  81 */     int i1 = 0;
/*  82 */     int i2 = 0;
/*  83 */     int i3 = 0;
/*  84 */     int i4 = 0;
/*  85 */     int i5 = 0;
/*  86 */     int i6 = 0;
/*  87 */     int i7 = 0;
/*  88 */     int i8 = 0;
/*  89 */     int i9 = 0;
/*  90 */     int i10 = 0;
/*     */     
/*     */ 
/*  93 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  97 */       i = MainMemory.alloc(81);
/*  98 */       j = SystemLibrary.strlen(paramInt5);
/*  99 */       k = paramInt4 == 0 ? 1 : 0;
/* 100 */       m = paramInt4 == 1 ? 1 : 0;
/* 101 */       paramInt4 = 0;
/* 102 */       i9 = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 110 */         n = paramInt6 + paramInt4;
/* 111 */         i10 = paramInt8 + (paramInt4 << 3);
/* 112 */         if (paramInt4 >= paramInt2) {
/*     */           break label1423;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         paramInt1 = i9 + paramInt3;
/* 123 */         b = MainMemory.getI8(paramInt1);
/* 124 */         MainMemory.setI8(paramInt1, (byte)0);
/* 125 */         if (MainMemory.getI8(paramInt5) != 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */           if (SystemLibrary.strncmp(paramInt5, i9, j) != 0) {
/*     */             break label292;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */           if (k != 0) {
/* 146 */             i9 = paramInt1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label1335;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 156 */           MainMemory.setI32(paramInt7, 1);
/* 157 */           if (m == 0) {
/*     */             break label273;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */           MainMemory.setF64(i10, paramDouble4);
/* 168 */           i9 = paramInt1;
/*     */           
/*     */           break label1335;
/*     */           
/*     */           label273:
/* 173 */           MainMemory.setI8(n, (byte)1);
/* 174 */           i9 = paramInt1;
/*     */           
/*     */           break label1335;
/*     */         }
/*     */         label292:
/* 179 */         i3 = MainMemory.getI8(i9);
/* 180 */         if (i3 == 32) {
/* 181 */           i1 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 186 */           n = i9;
/*     */           
/*     */ 
/*     */           break label363;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/* 194 */           i1 += 1;
/* 195 */           n = i9 + i1;
/* 196 */           i3 = MainMemory.getI8(n);
/* 197 */         } while (i3 == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label363:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */         switch (i3) {
/* 213 */         case 43:  i1 = 0;
/*     */           
/* 215 */           break;
/* 216 */         case 45:  i1 = 0;
/*     */           
/* 218 */           break;
/*     */         
/*     */         default: 
/* 221 */           d1 = 1.0D;
/* 222 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 230 */           i1 += 1;
/* 231 */           i4 = n + i1;
/* 232 */           i7 = MainMemory.getI8(i4);
/* 233 */         } while (i7 == 32);
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
/* 244 */         d1 = i3 == 45 ? -1.0D : 1.0D;
/* 245 */         i3 = i7;
/* 246 */         n = i4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */         if (MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */         {
/* 258 */           d3 = 0.0D;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 264 */           d4 = 0.0D;
/* 265 */           i4 = n;
/*     */           
/*     */ 
/*     */ 
/*     */           break label627;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 275 */           d3 *= 10.0D;
/* 276 */           d4 = i3;
/* 277 */           d3 += d4;
/* 278 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 285 */             i1 += 1;
/* 286 */             i4 = n + i1;
/* 287 */             i3 = MainMemory.getI8(i4);
/* 288 */           } while (i3 == 32);
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
/* 299 */           d3 += -48.0D;
/* 300 */           if (!MathUtils.ult((byte)(i3 + -48), (byte)10)) {
/*     */             break;
/*     */           }
/* 303 */           n = i4;
/*     */         }
/*     */         
/*     */         break label627;
/* 307 */         d4 = d3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label627:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */         switch (i3) {
/* 320 */         case 44:  i1 = 0;
/*     */           
/* 322 */           break;
/* 323 */         case 46:  i1 = 0;
/*     */           
/* 325 */           break;
/*     */         default: 
/* 327 */           n = i4;
/* 328 */           d3 = d4;
/* 329 */           d4 = 1.0D;
/* 330 */           i1 = 0;
/* 331 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 339 */           i1 += 1;
/* 340 */           n = i4 + i1;
/* 341 */           i3 = MainMemory.getI8(n);
/* 342 */         } while (i3 == 32);
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
/* 353 */         if (MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */         {
/* 355 */           d3 = 1.0D;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 363 */           d3 = d4;
/* 364 */           d4 = 1.0D;
/* 365 */           i1 = 1;
/*     */           
/*     */ 
/*     */ 
/*     */           break label899;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 376 */           d4 *= 10.0D;
/* 377 */           d2 = i3;
/* 378 */           d4 += d2;
/* 379 */           d4 += -48.0D;
/* 380 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 387 */             i1 += 1;
/* 388 */             i4 = n + i1;
/* 389 */             i3 = MainMemory.getI8(i4);
/* 390 */           } while (i3 == 32);
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
/* 401 */           d2 = d3 * 10.0D;
/* 402 */           if (!MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */             break;
/* 404 */           d3 = d2;
/*     */           
/* 406 */           n = i4;
/*     */         }
/*     */         
/*     */         break label899;
/* 410 */         n = i4;
/* 411 */         d3 = d4;
/* 412 */         d4 = d2;
/* 413 */         i1 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label899:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */         if (MathUtils.ult((byte)(i3 + -68), (byte)2)) {
/* 427 */           i8 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 433 */           i5 = 0;
/* 434 */           i8 = 1;
/*     */           
/*     */ 
/*     */           break label1243;
/*     */         }
/*     */         
/*     */         for (;;)
/*     */         {
/* 442 */           i8 += 1;
/* 443 */           i4 = n + i8;
/* 444 */           i3 = MainMemory.getI8(i4);
/* 445 */           switch (i3)
/*     */           {
/*     */           }
/*     */           
/*     */         }
/*     */         break label1022;
/*     */         break label1022;
/*     */         break label1022;
/* 453 */         n = i4;
/* 454 */         i8 = 1;
/*     */         
/*     */ 
/*     */         break label1105;
/*     */         
/*     */ 
/*     */         label1022:
/*     */         
/* 462 */         i2 = i3 == 45 ? 1 : 0;
/* 463 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 470 */           i5 += 1;
/* 471 */           i4 = n + (i8 + i5);
/* 472 */           i3 = MainMemory.getI8(i4);
/* 473 */         } while (i3 == 32);
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
/* 484 */         i8 = i2 != 0 ? -1 : 1;
/*     */         
/* 486 */         n = i4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1105:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 496 */         if (MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */         {
/* 498 */           i5 = 0;
/* 499 */           i4 = n;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 505 */           i5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */           break label1243;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 516 */           i5 = i5 * 10 + -48;
/* 517 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 524 */             i6 += 1;
/* 525 */             n = i4 + i6;
/* 526 */             i7 = MainMemory.getI8(n);
/* 527 */           } while (i7 == 32);
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
/* 538 */           i5 += i3;
/* 539 */           if (!MathUtils.ult((byte)(i7 + -48), (byte)10)) break;
/* 540 */           i3 = i7;
/*     */           
/* 542 */           i4 = n;
/*     */         }
/*     */         break label1243;
/* 545 */         i3 = i7;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1243:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 560 */         if (i3 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 570 */         d1 *= d3;
/* 571 */         d1 /= (i1 == 0 ? paramDouble3 : d4);
/* 572 */         d3 = i8 * i5;
/* 573 */         d1 *= SystemLibrary.pow(10.0D, d3);
/* 574 */         d1 *= paramDouble1;
/* 575 */         d1 += paramDouble2;
/* 576 */         MainMemory.setF64(i10, d1);
/* 577 */         i9 = n;
/*     */         
/*     */ 
/*     */ 
/*     */         label1335:
/*     */         
/*     */ 
/* 584 */         MainMemory.setI8(paramInt1, b);
/* 585 */         paramInt4 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 592 */       SystemLibrary.memcpy(i, 84512, 36, 1);
/* 593 */       ffxmsg.call(5, i);
/* 594 */       SystemLibrary.sprintf(i, 61056, new Object[] { Integer.valueOf(i9) });
/* 595 */       ffxmsg.call(5, i);
/* 596 */       MainMemory.setI8(paramInt1, b);
/* 597 */       MainMemory.setI32(paramInt9, 409);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1423:
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
/*     */ 
/*     */ 
/* 614 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffstrr8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */