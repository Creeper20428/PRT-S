/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fffstru2 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3384;
/*  12 */   public static final Function _instance = new fffstru2();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public fffstru2() { super("fffstru2", 13, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, double paramDouble3, int paramInt4, int paramInt5, short paramShort, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramDouble3, paramInt4, paramInt5, paramShort, paramInt6, paramInt7, paramInt8, paramInt9);
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
/*  49 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
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
/*  64 */     call(i, j, d1, d2, k, d3, m, n, s, i1, i2, i3, i4);
/*  65 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, double paramDouble3, int paramInt4, int paramInt5, short paramShort, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
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
/*  89 */     short s = 0;
/*  90 */     int i9 = 0;
/*  91 */     int i10 = 0;
/*     */     
/*     */ 
/*  94 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  98 */       i = MainMemory.alloc(81);
/*  99 */       j = SystemLibrary.strlen(paramInt5);
/* 100 */       k = paramInt4 == 0 ? 1 : 0;
/* 101 */       m = paramInt4 == 1 ? 1 : 0;
/* 102 */       paramInt4 = 0;
/* 103 */       i9 = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 111 */         n = paramInt6 + paramInt4;
/* 112 */         i10 = paramInt8 + (paramInt4 << 1);
/* 113 */         if (paramInt4 >= paramInt2) {
/*     */           break label1538;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         paramInt1 = i9 + paramInt3;
/* 124 */         b = MainMemory.getI8(paramInt1);
/* 125 */         MainMemory.setI8(paramInt1, (byte)0);
/* 126 */         if (MainMemory.getI8(paramInt5) != 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           if (SystemLibrary.strncmp(paramInt5, i9, j) != 0) {
/*     */             break label295;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */           if (k != 0) {
/* 147 */             i9 = paramInt1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label1450;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 157 */           MainMemory.setI32(paramInt7, 1);
/* 158 */           if (m == 0) {
/*     */             break label276;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */           MainMemory.setI16(i10, paramShort);
/* 169 */           i9 = paramInt1;
/*     */           
/*     */           break label1450;
/*     */           
/*     */           label276:
/* 174 */           MainMemory.setI8(n, (byte)1);
/* 175 */           i9 = paramInt1;
/*     */           
/*     */           break label1450;
/*     */         }
/*     */         label295:
/* 180 */         i3 = MainMemory.getI8(i9);
/* 181 */         if (i3 == 32) {
/* 182 */           i1 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 187 */           n = i9;
/*     */           
/*     */ 
/*     */           break label366;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/* 195 */           i1 += 1;
/* 196 */           n = i9 + i1;
/* 197 */           i3 = MainMemory.getI8(n);
/* 198 */         } while (i3 == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label366:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */         switch (i3) {
/* 214 */         case 43:  i1 = 0;
/*     */           
/* 216 */           break;
/* 217 */         case 45:  i1 = 0;
/*     */           
/* 219 */           break;
/*     */         
/*     */         default: 
/* 222 */           d1 = 1.0D;
/* 223 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 231 */           i1 += 1;
/* 232 */           i4 = n + i1;
/* 233 */           i7 = MainMemory.getI8(i4);
/* 234 */         } while (i7 == 32);
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
/* 245 */         d1 = i3 == 45 ? -1.0D : 1.0D;
/* 246 */         i3 = i7;
/* 247 */         n = i4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */         if (MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */         {
/* 259 */           d3 = 0.0D;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 265 */           d4 = 0.0D;
/* 266 */           i4 = n;
/*     */           
/*     */ 
/*     */ 
/*     */           break label631;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 276 */           d3 *= 10.0D;
/* 277 */           d4 = i3;
/* 278 */           d3 += d4;
/* 279 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 286 */             i1 += 1;
/* 287 */             i4 = n + i1;
/* 288 */             i3 = MainMemory.getI8(i4);
/* 289 */           } while (i3 == 32);
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
/* 300 */           d3 += -48.0D;
/* 301 */           if (!MathUtils.ult((byte)(i3 + -48), (byte)10)) {
/*     */             break;
/*     */           }
/* 304 */           n = i4;
/*     */         }
/*     */         
/*     */         break label631;
/* 308 */         d4 = d3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label631:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */         switch (i3) {
/* 321 */         case 44:  i1 = 0;
/*     */           
/* 323 */           break;
/* 324 */         case 46:  i1 = 0;
/*     */           
/* 326 */           break;
/*     */         default: 
/* 328 */           n = i4;
/* 329 */           d3 = d4;
/* 330 */           d4 = 1.0D;
/* 331 */           i1 = 0;
/* 332 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 340 */           i1 += 1;
/* 341 */           n = i4 + i1;
/* 342 */           i3 = MainMemory.getI8(n);
/* 343 */         } while (i3 == 32);
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
/* 354 */         if (MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */         {
/* 356 */           d3 = 1.0D;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 364 */           d3 = d4;
/* 365 */           d4 = 1.0D;
/* 366 */           i1 = 1;
/*     */           
/*     */ 
/*     */ 
/*     */           break label903;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 377 */           d4 *= 10.0D;
/* 378 */           d2 = i3;
/* 379 */           d4 += d2;
/* 380 */           d4 += -48.0D;
/* 381 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 388 */             i1 += 1;
/* 389 */             i4 = n + i1;
/* 390 */             i3 = MainMemory.getI8(i4);
/* 391 */           } while (i3 == 32);
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
/* 402 */           d2 = d3 * 10.0D;
/* 403 */           if (!MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */             break;
/* 405 */           d3 = d2;
/*     */           
/* 407 */           n = i4;
/*     */         }
/*     */         
/*     */         break label903;
/* 411 */         n = i4;
/* 412 */         d3 = d4;
/* 413 */         d4 = d2;
/* 414 */         i1 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label903:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */         if (MathUtils.ult((byte)(i3 + -68), (byte)2)) {
/* 428 */           i8 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 434 */           i5 = 0;
/* 435 */           i8 = 1;
/*     */           
/*     */ 
/*     */           break label1247;
/*     */         }
/*     */         
/*     */         for (;;)
/*     */         {
/* 443 */           i8 += 1;
/* 444 */           i4 = n + i8;
/* 445 */           i3 = MainMemory.getI8(i4);
/* 446 */           switch (i3)
/*     */           {
/*     */           }
/*     */           
/*     */         }
/*     */         break label1026;
/*     */         break label1026;
/*     */         break label1026;
/* 454 */         n = i4;
/* 455 */         i8 = 1;
/*     */         
/*     */ 
/*     */         break label1109;
/*     */         
/*     */ 
/*     */         label1026:
/*     */         
/* 463 */         i2 = i3 == 45 ? 1 : 0;
/* 464 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 471 */           i5 += 1;
/* 472 */           i4 = n + (i8 + i5);
/* 473 */           i3 = MainMemory.getI8(i4);
/* 474 */         } while (i3 == 32);
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
/* 485 */         i8 = i2 != 0 ? -1 : 1;
/*     */         
/* 487 */         n = i4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1109:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 497 */         if (MathUtils.ult((byte)(i3 + -48), (byte)10))
/*     */         {
/* 499 */           i5 = 0;
/* 500 */           i4 = n;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 506 */           i5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */           break label1247;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 517 */           i5 = i5 * 10 + -48;
/* 518 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 525 */             i6 += 1;
/* 526 */             n = i4 + i6;
/* 527 */             i7 = MainMemory.getI8(n);
/* 528 */           } while (i7 == 32);
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
/* 539 */           i5 += i3;
/* 540 */           if (!MathUtils.ult((byte)(i7 + -48), (byte)10)) break;
/* 541 */           i3 = i7;
/*     */           
/* 543 */           i4 = n;
/*     */         }
/*     */         break label1247;
/* 546 */         i3 = i7;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1247:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 561 */         if (i3 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 571 */         d1 *= d3;
/* 572 */         d1 /= (i1 == 0 ? paramDouble3 : d4);
/* 573 */         d3 = i8 * i5;
/* 574 */         d1 *= SystemLibrary.pow(10.0D, d3);
/* 575 */         d1 *= paramDouble1;
/* 576 */         d1 += paramDouble2;
/* 577 */         if (!MathUtils.f_olt(d1, -0.49D)) {
/*     */           break label1374;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 587 */         MainMemory.setI32(paramInt9, -11);
/* 588 */         MainMemory.setI16(i10, (short)0);
/* 589 */         i9 = n;
/*     */         
/*     */         break label1450;
/*     */         
/*     */         label1374:
/* 594 */         if (!MathUtils.f_ogt(d1, 65535.49D)) {
/*     */           break label1425;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 604 */         MainMemory.setI32(paramInt9, -11);
/* 605 */         MainMemory.setI16(i10, (short)-1);
/* 606 */         i9 = n;
/*     */         
/*     */         break label1450;
/*     */         
/*     */         label1425:
/* 611 */         s = (short)(int)Math.abs(d1);
/* 612 */         MainMemory.setI16(i10, s);
/* 613 */         i9 = n;
/*     */         
/*     */ 
/*     */ 
/*     */         label1450:
/*     */         
/*     */ 
/* 620 */         MainMemory.setI8(paramInt1, b);
/* 621 */         paramInt4 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 628 */       SystemLibrary.memcpy(i, 84512, 36, 1);
/* 629 */       ffxmsg.call(5, i);
/* 630 */       SystemLibrary.sprintf(i, 61056, new Object[] { Integer.valueOf(i9) });
/* 631 */       ffxmsg.call(5, i);
/* 632 */       MainMemory.setI8(paramInt1, b);
/* 633 */       MainMemory.setI32(paramInt9, 409);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1538:
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
/* 650 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffstru2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */