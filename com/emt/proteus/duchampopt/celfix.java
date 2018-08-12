/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class celfix extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2927;
/*  14 */   public static final Function _instance = new celfix();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public celfix() { super("celfix", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = call(i);
/*  30 */     paramFrame.setI32(paramInt1, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     int i9 = 0;
/*  51 */     int i10 = 0;
/*  52 */     int i11 = 0;
/*  53 */     int i12 = 0;
/*  54 */     int i13 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramInt == 0) {
/*  61 */         i7 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  71 */         if (MainMemory.getI32(paramInt) != 137)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */           i7 = wcsset.call(paramInt);
/*  82 */           if (i7 != 0) {
/*     */             break label1952;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         j = paramInt + 748;
/*  94 */         i7 = MainMemory.getI32(j);
/*  95 */         if (i7 <= -1)
/*     */         {
/*     */ 
/*     */ 
/*  99 */           i7 = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 106 */           k = paramInt + 28;
/* 107 */           m = MainMemory.getI32(k);
/* 108 */           i4 = MainMemory.getI8(m + i7 * 72 + 5) & 0xFF;
/* 109 */           n = i4 + -78;
/* 110 */           if (n != 0) {
/*     */             break label308;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */           n = (MainMemory.getI8(m + i7 * 72 + 6) & 0xFF) + -67;
/* 122 */           if (n != 0) {
/*     */             break label308;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */           n = (MainMemory.getI8(m + i7 * 72 + 7) & 0xFF) + -80;
/* 134 */           if (n != 0) {
/*     */             break label308;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */           n = MainMemory.getI8(m + i7 * 72 + 8) & 0xFF;
/*     */           
/*     */ 
/*     */ 
/*     */           label308:
/*     */           
/*     */ 
/*     */ 
/* 153 */           if (n != 0) {
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */           MainMemory.setI32(m + MainMemory.getI32(paramInt + 744) * 72 + 5, 5130579);
/* 164 */           MainMemory.setI32(MainMemory.getI32(k) + MainMemory.getI32(j) * 72 + 5, 5130579);
/* 165 */           i6 = paramInt + 68;
/* 166 */           i1 = paramInt + 64;
/* 167 */           i7 = MainMemory.getI32(i1);
/* 168 */           i4 = i7 + 2;
/* 169 */           if (MainMemory.getI32(i6) >= i4) {
/*     */             break label789;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */           i5 = paramInt + 1544;
/* 180 */           if (MainMemory.getI32(i5) != 137)
/*     */           {
/*     */ 
/*     */ 
/* 184 */             i7 = 2;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 191 */             i9 = paramInt + 72;
/* 192 */             i10 = paramInt + 1576;
/* 193 */             if (MainMemory.getI32(i9) != MainMemory.getI32(i10))
/*     */             {
/*     */ 
/*     */ 
/* 197 */               i7 = 2;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 204 */               i11 = com.emt.proteus.runtime.library.c.calloc.call(i4, 16);
/* 205 */               i13 = i11;
/* 206 */               MainMemory.setI32(i9, i13);
/* 207 */               if (i11 != 0) {
/*     */                 break label550;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */               MainMemory.setI32(i9, MainMemory.getI32(i10));
/* 218 */               i = 2;
/*     */               
/*     */ 
/*     */               break label1960;
/*     */               
/*     */               label550:
/*     */               
/* 225 */               i7 = MainMemory.getI32(i1);
/* 226 */               MainMemory.setI32(i6, i7 + 2);
/* 227 */               MainMemory.setI32(i5, 137);
/* 228 */               if (i7 > 0)
/*     */               {
/* 230 */                 i7 = 0;
/*     */               } else {
/*     */                 break label726;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 243 */                 i12 = MainMemory.getI32(i10);
/* 244 */                 MainMemory.setI32(i13 + (i7 << 4), MainMemory.getI32(i12 + (i7 << 4)));
/* 245 */                 MainMemory.setI32(i13 + (i7 << 4) + 4, MainMemory.getI32(i12 + (i7 << 4) + 4));
/* 246 */                 MainMemory.setF64(i13 + (i7 << 4) + 8, MainMemory.getF64(i12 + (i7 << 4) + 8));
/* 247 */                 i7 += 1;
/* 248 */                 i4 = MainMemory.getI32(i1);
/* 249 */                 if (i4 <= i7)
/*     */                 {
/*     */ 
/*     */ 
/* 253 */                   i7 = i4;
/* 254 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 260 */                 i13 = MainMemory.getI32(i9);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label726:
/*     */               
/*     */ 
/* 268 */               i13 = MainMemory.getI32(i10);
/* 269 */               if (i13 != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */                 free.call(i13);
/* 281 */                 i7 = MainMemory.getI32(i1);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */               i13 = MainMemory.getI32(i9);
/* 290 */               MainMemory.setI32(i10, i13);
/*     */               
/*     */ 
/*     */               break label807;
/*     */               
/*     */ 
/*     */               label789:
/*     */               
/* 298 */               i9 = paramInt + 72;
/* 299 */               i13 = MainMemory.getI32(i9);
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               label807:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */               MainMemory.setI32(i13 + (i7 << 4), MainMemory.getI32(j) + 1);
/* 312 */               MainMemory.setI32(MainMemory.getI32(i9) + (MainMemory.getI32(i1) << 4) + 4, 1);
/* 313 */               MainMemory.setF64(MainMemory.getI32(i9) + (MainMemory.getI32(i1) << 4) + 8, MainMemory.getF64(paramInt + 896));
/* 314 */               i7 = MainMemory.getI32(i1) + 1;
/* 315 */               MainMemory.setI32(i1, i7);
/* 316 */               MainMemory.setI32(MainMemory.getI32(i9) + (i7 << 4), MainMemory.getI32(j) + 1);
/* 317 */               MainMemory.setI32(MainMemory.getI32(i9) + (MainMemory.getI32(i1) << 4) + 4, 2);
/* 318 */               MainMemory.setF64(MainMemory.getI32(i9) + (MainMemory.getI32(i1) << 4) + 8, MainMemory.getF64(paramInt + 904));
/* 319 */               MainMemory.setI32(i1, MainMemory.getI32(i1) + 1);
/* 320 */               i = 0;
/*     */               
/*     */ 
/*     */               break label1960;
/*     */               
/*     */               label974:
/*     */               
/* 327 */               i4 += -71;
/* 328 */               if (i4 != 0)
/*     */               {
/*     */ 
/*     */ 
/* 332 */                 i7 = i4;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 339 */                 i4 = (MainMemory.getI8(m + i7 * 72 + 6) & 0xFF) + -76;
/* 340 */                 if (i4 != 0)
/*     */                 {
/*     */ 
/*     */ 
/* 344 */                   i7 = i4;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 351 */                   i4 = (MainMemory.getI8(m + i7 * 72 + 7) & 0xFF) + -83;
/* 352 */                   if (i4 != 0)
/*     */                   {
/*     */ 
/*     */ 
/* 356 */                     i7 = i4;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 363 */                     i7 = MainMemory.getI8(m + i7 * 72 + 8) & 0xFF;
/*     */                   }
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 371 */               if (i7 != 0)
/*     */               {
/*     */ 
/*     */ 
/* 375 */                 i7 = -1;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 382 */                 i1 = paramInt + 744;
/* 383 */                 MainMemory.setI32(m + MainMemory.getI32(i1) * 72 + 5, 4998739);
/* 384 */                 MainMemory.setI32(MainMemory.getI32(k) + MainMemory.getI32(j) * 72 + 5, 4998739);
/* 385 */                 i2 = paramInt + 20;
/* 386 */                 i3 = MainMemory.getI32(i2);
/* 387 */                 i4 = MainMemory.getI32(i1);
/* 388 */                 if (!MathUtils.f_une(MainMemory.getF64(i3 + (i4 << 3)), 0.0D))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */                   if (!MathUtils.f_une(MainMemory.getF64(i3 + (MainMemory.getI32(j) << 3)), 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 402 */                     i7 = 0;
/*     */                     
/*     */ 
/*     */                     break label1952;
/*     */                   }
/*     */                 }
/*     */                 
/* 409 */                 i5 = paramInt + 68;
/* 410 */                 i6 = paramInt + 64;
/* 411 */                 i7 = MainMemory.getI32(i6);
/* 412 */                 if (MainMemory.getI32(i5) >= i7 + 2) {
/*     */                   break label1693;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 422 */                 i8 = paramInt + 1544;
/* 423 */                 if (MainMemory.getI32(i8) != 137)
/*     */                 {
/*     */ 
/*     */ 
/* 427 */                   i7 = 2;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 434 */                   i9 = paramInt + 72;
/* 435 */                   i10 = paramInt + 1576;
/* 436 */                   if (MainMemory.getI32(i9) != MainMemory.getI32(i10))
/*     */                   {
/*     */ 
/*     */ 
/* 440 */                     i7 = 2;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 447 */                     i11 = com.emt.proteus.runtime.library.c.calloc.call(i7 + 3, 16);
/* 448 */                     i13 = i11;
/* 449 */                     MainMemory.setI32(i9, i13);
/* 450 */                     if (i11 != 0) {
/*     */                       break label1447;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */                     MainMemory.setI32(i9, MainMemory.getI32(i10));
/* 461 */                     i = 2;
/*     */                     
/*     */ 
/*     */                     break label1960;
/*     */                     
/*     */                     label1447:
/*     */                     
/* 468 */                     i7 = MainMemory.getI32(i6);
/* 469 */                     MainMemory.setI32(i5, i7 + 3);
/* 470 */                     MainMemory.setI32(i8, 137);
/* 471 */                     if (i7 > 0)
/*     */                     {
/* 473 */                       i7 = 0;
/*     */                     } else {
/*     */                       break label1623;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     for (;;)
/*     */                     {
/* 486 */                       i12 = MainMemory.getI32(i10);
/* 487 */                       MainMemory.setI32(i13 + (i7 << 4), MainMemory.getI32(i12 + (i7 << 4)));
/* 488 */                       MainMemory.setI32(i13 + (i7 << 4) + 4, MainMemory.getI32(i12 + (i7 << 4) + 4));
/* 489 */                       MainMemory.setF64(i13 + (i7 << 4) + 8, MainMemory.getF64(i12 + (i7 << 4) + 8));
/* 490 */                       i7 += 1;
/* 491 */                       i4 = MainMemory.getI32(i6);
/* 492 */                       if (i4 <= i7)
/*     */                       {
/*     */ 
/*     */ 
/* 496 */                         i7 = i4;
/* 497 */                         break;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/* 503 */                       i13 = MainMemory.getI32(i9);
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */                     label1623:
/*     */                     
/*     */ 
/* 511 */                     i13 = MainMemory.getI32(i10);
/* 512 */                     if (i13 != 0)
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 523 */                       free.call(i13);
/* 524 */                       i7 = MainMemory.getI32(i6);
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 532 */                     i13 = MainMemory.getI32(i9);
/* 533 */                     MainMemory.setI32(i10, i13);
/* 534 */                     i4 = MainMemory.getI32(i1);
/*     */                     
/*     */ 
/*     */                     break label1711;
/*     */                     
/*     */ 
/*     */                     label1693:
/*     */                     
/*     */ 
/* 543 */                     i9 = paramInt + 72;
/* 544 */                     i13 = MainMemory.getI32(i9);
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     label1711:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */                     MainMemory.setI32(i13 + (i7 << 4), i4 + 1);
/* 559 */                     MainMemory.setI32(MainMemory.getI32(i9) + (MainMemory.getI32(i6) << 4) + 4, 0);
/* 560 */                     MainMemory.setF64(MainMemory.getI32(i9) + (MainMemory.getI32(i6) << 4) + 8, 1.0D);
/* 561 */                     i7 = MainMemory.getI32(i6) + 1;
/* 562 */                     MainMemory.setI32(i6, i7);
/* 563 */                     MainMemory.setI32(MainMemory.getI32(i9) + (i7 << 4), MainMemory.getI32(i1) + 1);
/* 564 */                     MainMemory.setI32(MainMemory.getI32(i9) + (MainMemory.getI32(i6) << 4) + 4, 1);
/* 565 */                     MainMemory.setF64(MainMemory.getI32(i9) + (MainMemory.getI32(i6) << 4) + 8, 0.0D);
/* 566 */                     i7 = MainMemory.getI32(i6) + 1;
/* 567 */                     MainMemory.setI32(i6, i7);
/* 568 */                     MainMemory.setI32(MainMemory.getI32(i9) + (i7 << 4), MainMemory.getI32(i1) + 1);
/* 569 */                     MainMemory.setI32(MainMemory.getI32(i9) + (MainMemory.getI32(i6) << 4) + 4, 2);
/* 570 */                     MainMemory.setF64(MainMemory.getI32(i9) + (MainMemory.getI32(i6) << 4) + 8, MainMemory.getF64(MainMemory.getI32(i2) + (MainMemory.getI32(j) << 3)));
/* 571 */                     MainMemory.setI32(i6, MainMemory.getI32(i6) + 1);
/* 572 */                     i = 0;
/*     */                     break label1960;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           } } }
/*     */       label1952:
/* 580 */       i = i7;
/*     */       
/*     */ 
/*     */       label1960:
/*     */       
/*     */ 
/* 586 */       int i14 = i; return i14;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/celfix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */