/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F292659 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3179;
/*  12 */   public static final Function _instance = new F292659();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F292659() { super("F292659", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*  45 */     int i6 = 0;
/*  46 */     int i7 = 0;
/*  47 */     int i8 = 0;
/*  48 */     int i9 = 0;
/*  49 */     int i10 = 0;
/*  50 */     int i11 = 0;
/*  51 */     int i12 = 0;
/*  52 */     int i13 = 0;
/*  53 */     int i14 = 0;
/*  54 */     int i15 = 0;
/*  55 */     int i16 = 0;
/*  56 */     int i17 = 0;
/*  57 */     int i18 = 0;
/*  58 */     int i19 = 0;
/*  59 */     int i20 = 0;
/*  60 */     int i21 = 0;
/*  61 */     int i22 = 0;
/*  62 */     int i23 = 0;
/*  63 */     int i24 = 0;
/*  64 */     int i25 = 0;
/*  65 */     int i26 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       i = MainMemory.getI32Aligned(470792);
/*  72 */       j = MainMemory.getI32(paramInt + 12);
/*  73 */       k = MainMemory.getI32(i + MainMemory.getI32(paramInt + 16) * 344 + 56 + 32);
/*  74 */       F301051.call(paramInt);
/*  75 */       i6 = MainMemory.getI32Aligned(470808);
/*  76 */       i2 = i6 + k;
/*  77 */       m = paramInt + 52;
/*  78 */       if (com.emt.proteus.lib.api.MathUtils.ult(MainMemory.getI32(m) + 65275, 2)) {
/*  79 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  89 */         n = MainMemory.getI32(paramInt + 56);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */       i3 = MainMemory.getI32Aligned(470832);
/*  98 */       if (i3 <= i2) {
/*     */         break label658;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       i3 -= i2;
/* 109 */       i1 = MainMemory.getI32Aligned(470812);
/* 110 */       i3 = i1 < i3 ? i1 : i3;
/* 111 */       i1 -= i3;
/* 112 */       if ((i2 >= 1) || (i3 <= 0))
/*     */       {
/*     */ 
/*     */ 
/* 116 */         i7 = 0;
/*     */         
/* 118 */         i6 = i1;
/* 119 */         i1 = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 126 */         i4 = paramInt + 56;
/* 127 */         i23 = paramInt + 88;
/* 128 */         i5 = n == 0 ? 1 : 0;
/* 129 */         i16 = paramInt + 84;
/* 130 */         i7 = 0 - i3;
/* 131 */         i2 = k + i6;
/* 132 */         i6 = i2 + -1;
/* 133 */         i6 = com.emt.proteus.lib.api.MathUtils.ult(i6, i7) ? i7 : i6;
/* 134 */         i3 += i6;
/* 135 */         i7 = 0 - i6;
/* 136 */         i10 = 0;
/* 137 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 145 */           if (MainMemory.getI32(m) != 262) {
/*     */             break label529;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */           i11 = MainMemory.getI32(i4);
/* 156 */           MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i23) + (i8 << 2)) + i11, (byte)0);
/* 157 */           if (i11 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */             i12 = i11 + -1;
/* 168 */             i9 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 175 */               MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i23) + (i8 << 2)) + (i12 - i9), (byte)48);
/* 176 */               i9 += 1;
/* 177 */               if (i9 == i11) {
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
/* 188 */           i8 += 1;
/*     */           
/*     */           break label603;
/*     */           
/*     */           label529:
/*     */           
/* 194 */           if (i5 != 0) {
/*     */             break label603;
/*     */           }
/*     */           else {
/* 198 */             i11 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 207 */             MainMemory.setI8(MainMemory.getI32(i16) + (i8 + i11), (byte)1);
/* 208 */             i11 += 1;
/* 209 */             if (i11 == n) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */           i8 = n + i8;
/*     */           
/*     */ 
/*     */ 
/*     */           label603:
/*     */           
/*     */ 
/*     */ 
/* 228 */           i10 += 1;
/* 229 */           if (i10 == i7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */         i2 -= i6;
/* 242 */         i7 = i8;
/*     */         
/* 244 */         i6 = i1;
/* 245 */         i1 = i2;
/*     */         
/*     */         break label1183;
/*     */         
/*     */         label658:
/* 250 */         i7 = MainMemory.getI32Aligned(470812);
/* 251 */         i6 = i7 + i2;
/* 252 */         i10 = MainMemory.getI32Aligned(470836);
/* 253 */         i1 = i10 + i3;
/* 254 */         if (i6 <= i1)
/*     */         {
/*     */ 
/*     */ 
/* 258 */           i1 = i7;
/*     */           
/*     */ 
/*     */           break label1524;
/*     */         }
/*     */         
/*     */ 
/* 265 */         i3 = i6 - i3 - i10;
/* 266 */         i5 = i7 < i3 ? 1 : 0;
/* 267 */         i6 = i5 != 0 ? i7 : i3;
/* 268 */         i1 = i5 != 0 ? i2 : i1;
/* 269 */         i2 = i7 - i6;
/* 270 */         i3 = i2 * n;
/* 271 */         i8 = i6 + i1;
/* 272 */         if ((i8 <= MainMemory.getI32Aligned(470840)) || (i6 <= 0))
/*     */         {
/*     */ 
/*     */ 
/* 276 */           i7 = i3;
/* 277 */           i3 = i6;
/* 278 */           i6 = i2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 286 */           i10 = i7 * n;
/* 287 */           i4 = paramInt + 56;
/* 288 */           i23 = paramInt + 88;
/* 289 */           i5 = n == 0 ? 1 : 0;
/* 290 */           i16 = paramInt + 84;
/* 291 */           i6 += -1;
/* 292 */           i7 = i8 + -1;
/* 293 */           i8 = 0;
/* 294 */           i9 = i10;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 302 */             i10 = i6 - i8;
/* 303 */             i11 = i7 - i8;
/* 304 */             if (MainMemory.getI32(m) != 262) {
/*     */               break label1047;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */             i12 = MainMemory.getI32(i4);
/* 315 */             i9 += -1;
/* 316 */             MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i23) + (i9 << 2)) + i12, (byte)0);
/* 317 */             if (i12 == 0) {
/* 318 */               i12 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 328 */               i13 = i12 + -1;
/* 329 */               i14 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 336 */                 MainMemory.setI8(MainMemory.getI32(MainMemory.getI32(i23) + (i9 << 2)) + (i13 - i14), (byte)48);
/* 337 */                 i14 += 1;
/* 338 */                 if (i14 == i12) {
/* 339 */                   i12 = i9;
/*     */                   
/*     */                   break label1133;
/*     */                   
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */               label1047:
/*     */               
/* 349 */               if (i5 != 0) {
/* 350 */                 i12 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 360 */                 i12 = i9 + -1;
/* 361 */                 i13 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 368 */                   MainMemory.setI8(MainMemory.getI32(i16) + (i12 - i13), (byte)1);
/* 369 */                   i13 += 1;
/* 370 */                   if (i13 == n) {
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
/* 381 */                 i12 = i9 - n;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */             label1133:
/*     */             
/*     */ 
/* 389 */             i8 += 1;
/* 390 */             if ((i11 <= MainMemory.getI32Aligned(470840)) || (i10 <= 0))
/*     */               break;
/* 392 */             i9 = i12;
/*     */           }
/*     */           break label1183;
/* 395 */           i7 = i3;
/* 396 */           i3 = i10;
/* 397 */           i6 = i2;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1183:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 410 */       if (i3 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 414 */         i1 = i6;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 421 */         switch (MainMemory.getI32(m)) {
/*     */         case 258: 
/*     */           break label1470;
/*     */           break;
/*     */         case 259: 
/*     */           break label1409;
/*     */           break;
/*     */         case 260:  break label1348;
/*     */           break; case 261:  break; case 262:  break; default:  i1 = i6;
/* 430 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 437 */         SystemLibrary.do_indirect(MainMemory.getI32Aligned(470760), 0 - MainMemory.getI32(i + j * 344), i1, i3, MainMemory.getI32(paramInt + 88) + (i7 << 2), MainMemory.getI32(paramInt + 84) + i7);
/* 438 */         i1 = i6;
/*     */         
/*     */         break label1524;
/*     */         
/*     */         label1348:
/* 443 */         SystemLibrary.do_indirect(MainMemory.getI32Aligned(470760), 0 - MainMemory.getI32(i + j * 344), i1, i3, MainMemory.getI32(paramInt + 88) + (i7 << 3), MainMemory.getI32(paramInt + 84) + i7);
/* 444 */         i1 = i6;
/*     */         
/*     */         break label1524;
/*     */         
/*     */         label1409:
/* 449 */         SystemLibrary.do_indirect(MainMemory.getI32Aligned(470760), 0 - MainMemory.getI32(i + j * 344), i1, i3, MainMemory.getI32(paramInt + 88) + (i7 << 2), MainMemory.getI32(paramInt + 84) + i7);
/* 450 */         i1 = i6;
/*     */         
/*     */         break label1524;
/*     */         
/*     */         label1470:
/* 455 */         SystemLibrary.do_indirect(MainMemory.getI32Aligned(470760), 0 - MainMemory.getI32(i + j * 344), i1, i3, MainMemory.getI32(paramInt + 88) + i7, MainMemory.getI32(paramInt + 84) + i7);
/* 456 */         i1 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */       label1524:
/*     */       
/*     */ 
/* 463 */       if (i1 >= 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 473 */         if (k > 0) {
/* 474 */           i2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 484 */           i2 = MainMemory.getI32Aligned(470812);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */         i2 *= n;
/* 493 */         i15 = paramInt + 88;
/* 494 */         i16 = i15;
/* 495 */         i17 = i + j * 344 + 56 + 32;
/* 496 */         i18 = i17;
/* 497 */         i19 = i15;
/* 498 */         i20 = i17;
/* 499 */         i21 = i15;
/* 500 */         i22 = i17;
/* 501 */         i23 = i17;
/* 502 */         i24 = i15;
/* 503 */         i25 = paramInt + 84;
/* 504 */         i26 = i + j * 344 + 56 + 28;
/* 505 */         k = n * k + -1;
/* 506 */         n += -1;
/* 507 */         j = i1 + -1;
/* 508 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */         while (j - i1 != -1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 537 */           i3 = k + i2;
/* 538 */           i6 = i2 + -1;
/* 539 */           i7 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 546 */             i10 = i3 - i7;
/* 547 */             i8 = i6 - i7;
/* 548 */             if (n - i7 == -1) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 558 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */             i11 = MainMemory.getI32(m);
/* 569 */             if (i11 != 262)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 580 */               MainMemory.setI8(MainMemory.getI32(i25) + i8, MainMemory.getI8(MainMemory.getI32(i26) + i10));
/* 581 */               i11 = MainMemory.getI32(m);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 589 */             switch (i11) {
/*     */             case 258: 
/*     */               break label2084;
/*     */               break;
/*     */             case 259: 
/*     */               break label2048;
/*     */               break;
/*     */             case 260: 
/*     */               break label2012;
/*     */               break;
/*     */             case 261: 
/*     */               break label1972;
/*     */               break;
/*     */             case 262:  break; }
/* 603 */             SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32(i24) + (i8 << 2)), MainMemory.getI32(MainMemory.getI32(i23) + (i10 << 2)));
/*     */             
/*     */             break label2111;
/*     */             
/*     */             label1972:
/* 608 */             SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32(i24) + (i8 << 2)), MainMemory.getI32(MainMemory.getI32(i23) + (i10 << 2)));
/*     */             
/*     */             break label2111;
/*     */             
/*     */             label2012:
/* 613 */             MainMemory.setF64(MainMemory.getI32(i21) + (i8 << 3), MainMemory.getF64(MainMemory.getI32(i22) + (i10 << 3)));
/*     */             
/*     */             break label2111;
/*     */             
/*     */             label2048:
/* 618 */             MainMemory.setI32(MainMemory.getI32(i19) + (i8 << 2), MainMemory.getI32(MainMemory.getI32(i20) + (i10 << 2)));
/*     */             
/*     */             break label2111;
/*     */             
/*     */             label2084:
/* 623 */             MainMemory.setI8(MainMemory.getI32(i16) + i8, MainMemory.getI8(MainMemory.getI32(i18) + i10));
/*     */             
/*     */ 
/*     */             label2111:
/*     */             
/*     */ 
/* 629 */             i7 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 635 */           i2 -= i7;
/* 636 */           i1 += 1;
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F292659.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */