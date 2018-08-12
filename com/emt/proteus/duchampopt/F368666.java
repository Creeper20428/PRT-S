/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F368666 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3473;
/*  12 */   public static final Function _instance = new F368666();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F368666() { super("F368666", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3);
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
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*     */     
/*     */ 
/*  61 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(100);
/*  66 */       j = MainMemory.alloc(50);
/*  67 */       k = SystemLibrary.strlen(paramInt2);
/*  68 */       m = SystemLibrary.strlen(paramInt3);
/*  69 */       if (k != 7) {
/*     */         break label297;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       if (SystemLibrary.strncmp(paramInt2, 39552, 7) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (SystemLibrary.strncmp(paramInt2, 39584, 7) != 0) {
/*     */           break label297;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */       paramInt1 = F368458.call(paramInt1, 17248);
/* 100 */       i12 = paramInt1 + 80;
/* 101 */       SystemLibrary.strncpy(i12, paramInt1, 80);
/* 102 */       SystemLibrary.strncpy(paramInt1, paramInt2, 7);
/* 103 */       if (k >= 80) {
/*     */         break label276;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       paramInt2 = paramInt1 + (k + 1);
/* 114 */       i1 = (MathUtils.ugt(i12, paramInt2) ? i12 : paramInt2) + (0 - (paramInt1 + k));
/* 115 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 122 */         MainMemory.setI8(paramInt1 + (k + i2), (byte)32);
/* 123 */         i2 += 1;
/* 124 */         if (i2 == i1) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label276:
/*     */       
/*     */ 
/*     */ 
/* 135 */       SystemLibrary.strncpy(paramInt1 + 9, paramInt3, m);
/*     */       
/*     */ 
/*     */       break label1640;
/*     */       
/*     */       label297:
/*     */       
/* 142 */       i12 = F368458.call(paramInt1, paramInt2);
/* 143 */       if (i12 == 0) {
/* 144 */         i1 = 0;
/*     */       } else {
/*     */         break label1144;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 155 */         if (i1 <= 57599)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           if (MainMemory.getI8(paramInt1 + i1) != 0) {
/*     */             break label1128;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */         n = paramInt1 + i1;
/* 176 */         i1 = paramInt1;
/* 177 */         i2 = n + -2;
/* 178 */         i12 = paramInt1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 185 */           i13 = i12;
/* 186 */           if (!MathUtils.ult(i12, n)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */           if ((i12 != 0) && (n == i12)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */           i9 = i2 - i13;
/* 207 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 214 */             i5 = i4 + 1;
/* 215 */             i10 = i12 + (i4 + 2);
/* 216 */             i6 = i12 + i4;
/* 217 */             if (i4 >= i9) {
/*     */               break label1080;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */             if (MainMemory.getI8(i6) != 69)
/*     */             {
/*     */ 
/*     */ 
/* 231 */               i4 = i5;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 238 */               if (MainMemory.getI8(i10) == 68) {
/* 239 */                 i7 = 0;
/*     */               }
/*     */               else
/*     */               {
/* 243 */                 i4 = i5;
/* 244 */                 continue;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 251 */                 i3 = i7 + 1;
/* 252 */                 if (i3 >= 3) {
/*     */                   break label626;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */                 if (MainMemory.getI8(i12 + (i5 + i7)) != MainMemory.getI8(17248 + i3)) break;
/* 263 */                 i7 = i3; }
/* 264 */               break;
/*     */               
/* 266 */               i4 = i5;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label626:
/*     */           
/* 273 */           if (i6 == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */           i7 = (i6 - i1) % 80;
/* 284 */           i8 = MainMemory.getI8(i12 + (i4 + 3));
/* 285 */           if (i7 <= 7) {
/*     */             break label700;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */           i12 += i5;
/*     */           
/* 297 */           continue;
/*     */           
/*     */           label700:
/*     */           
/* 301 */           if ((i8 >= 33) && (i8 != 61) && (i8 != 127)) {
/*     */             break label1063;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */           i9 = i4 - i7;
/* 312 */           if (i9 >= i4)
/*     */           {
/*     */ 
/*     */ 
/* 316 */             i10 = i12;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 323 */             i10 = i12 + i5;
/* 324 */             i11 = i12 + (i5 - i7);
/* 325 */             i13 = (MathUtils.ugt(i6, i11) ? i6 : i11) + (i7 - (i4 + i13));
/* 326 */             i5 = 0;
/* 327 */             i11 = i12;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 335 */               i11 = MainMemory.getI8(i12 + (i9 + i5)) == 32 ? i11 : i10;
/* 336 */               i5 += 1;
/* 337 */               if (i5 == i13) {
/* 338 */                 i10 = i11; break;
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
/* 351 */           if (MathUtils.ult(i6, i10)) {
/* 352 */             i12 = i10;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 362 */             n = i12 + i9;
/* 363 */             if (n == 0) {
/* 364 */               i12 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 374 */               if (n == paramInt1) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 384 */               i1 = -80 - i7 + i4;
/* 385 */               i4 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               do
/*     */               {
/* 392 */                 i2 = i4 * -80;
/* 393 */                 i4 += 1;
/* 394 */               } while (SystemLibrary.strncmp(i12 + (i1 + i2), 43584, 8) == 0);
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
/* 405 */               i1 = i9 + i2;
/* 406 */               i12 = i1 < i9 ? i12 + i1 : 0;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 414 */             if (i12 == 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */             paramInt1 = i12 + 80;
/*     */             
/*     */ 
/*     */             break label1109;
/*     */             
/*     */             label1063:
/*     */             
/* 431 */             i12 += i5;
/*     */           }
/*     */         }
/*     */         
/*     */         label1080:
/*     */         
/* 437 */         i12 = F368458.call(paramInt1, 17248);
/* 438 */         paramInt1 = i12 + 80;
/* 439 */         SystemLibrary.strncpy(paramInt1, i12, 80);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1109:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 449 */         MainMemory.setI8(j, (byte)0);
/*     */         
/*     */ 
/* 452 */         i1 = 0;
/* 453 */         break;
/*     */         
/*     */         label1128:
/*     */         
/* 457 */         i1 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label1144:
/*     */       
/* 463 */       SystemLibrary.strncpy(i, i12, 80);
/* 464 */       MainMemory.setI8(i + 80, (byte)0);
/* 465 */       paramInt1 = i12 + 80;
/* 466 */       n = SystemLibrary.strchr(i, 39);
/* 467 */       if (n == 0) {
/* 468 */         n = i;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 478 */         n = SystemLibrary.strchr(n + 1, 39);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */       n = SystemLibrary.strchr(n, 47);
/* 487 */       if (n != 0) {
/*     */         break label1255;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 497 */       MainMemory.setI8(j, (byte)0);
/*     */       
/*     */ 
/* 500 */       i1 = 0;
/*     */       
/*     */       break label1410;
/*     */       
/*     */       label1255:
/* 505 */       i2 = n;
/* 506 */       i4 = i;
/* 507 */       SystemLibrary.strncpy(j, n + 1, i4 - i2 + 80);
/* 508 */       i1 = i4 + 29 - i2;
/* 509 */       i2 = i4 + 28 - i2;
/* 510 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 517 */         n = j + 50 + (i2 - i4);
/* 518 */         if (!MathUtils.ult(j, j + 50 + (i1 - i4))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 528 */         if (MainMemory.getI8(n) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */         MainMemory.setI8(n, (byte)0);
/* 539 */         i4 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 545 */       i1 = SystemLibrary.strlen(j);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1410:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 557 */       if (!MathUtils.ult(i12, paramInt1)) {
/*     */         break label1484;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */       i2 = paramInt1 + (0 - i12);
/* 568 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 575 */         MainMemory.setI8(i12 + i4, (byte)32);
/* 576 */         i4 += 1;
/* 577 */         if (i4 == i2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1484:
/*     */       
/*     */ 
/*     */ 
/* 588 */       SystemLibrary.strncpy(i12, paramInt2, k);
/* 589 */       MainMemory.setI8(i12 + 8, (byte)61);
/* 590 */       MainMemory.setI8(i12 + 9, (byte)32);
/* 591 */       if (MainMemory.getI8(paramInt3) != 39) {
/*     */         break label1576;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 601 */       SystemLibrary.strncpy(i12 + 10, paramInt3, m);
/* 602 */       k = m > 19 ? m + 12 : 30;
/*     */       
/*     */       break label1600;
/*     */       
/*     */       label1576:
/*     */       
/* 608 */       SystemLibrary.strncpy(i12 + (30 - m), paramInt3, m);
/* 609 */       k = 30;
/*     */       
/*     */ 
/*     */ 
/*     */       label1600:
/*     */       
/*     */ 
/* 616 */       if (i1 <= 0) {
/*     */         break label1635;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 626 */       F368666_147.call(j, k, i1, paramInt1, i12);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1635:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1640:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 642 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368666.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */