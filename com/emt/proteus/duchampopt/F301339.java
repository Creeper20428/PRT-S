/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F301339 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3184;
/*  13 */   public static final Function _instance = new F301339();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F301339() { super("F301339", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     byte b1 = 0;
/*  41 */     int n = 0;
/*  42 */     byte b2 = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     byte b3 = 0;
/*  50 */     int i7 = 0;
/*  51 */     byte b4 = 0;
/*  52 */     int i8 = 0;
/*  53 */     byte b5 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     boolean bool = false;
/*  58 */     int i12 = 0;
/*  59 */     int i13 = 0;
/*  60 */     int i14 = 0;
/*  61 */     int i15 = 0;
/*  62 */     int i16 = 0;
/*  63 */     int i17 = 0;
/*  64 */     int i18 = 0;
/*  65 */     int i19 = 0;
/*  66 */     int i20 = 0;
/*  67 */     int i21 = 0;
/*  68 */     int i22 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       i = MainMemory.getI32Aligned(470792);
/*  75 */       j = MainMemory.getI32(paramInt + 12);
/*  76 */       k = MainMemory.getI32(paramInt + 16);
/*  77 */       m = i + j * 344;
/*  78 */       i9 = MainMemory.getI32(m) != 64536 ? 1 : 0;
/*  79 */       if (i9 == 0) {
/*     */         break label195;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       i1 = MainMemory.getI32(i + j * 344 + 56);
/*  90 */       b1 = 0;
/*  91 */       i18 = i1;
/*     */       
/*     */       break label234;
/*     */       
/*     */       label195:
/*  96 */       i1 = i9 != 0 ? 1 : 0;
/*  97 */       b1 = MainMemory.getI8(i + j * 344 + 56 + 32);
/*     */       
/*  99 */       i18 = i1;
/*     */       
/*     */ 
/*     */ 
/*     */       label234:
/*     */       
/*     */ 
/*     */ 
/* 107 */       n = i + k * 344;
/* 108 */       i9 = MainMemory.getI32(n) != 64536 ? 1 : 0;
/* 109 */       if (i9 == 0) {
/*     */         break label311;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       i1 = MainMemory.getI32(i + k * 344 + 56);
/* 120 */       b2 = 0;
/* 121 */       i19 = i1;
/*     */       
/*     */       break label350;
/*     */       
/*     */       label311:
/* 126 */       i1 = i9 != 0 ? 1 : 0;
/* 127 */       b2 = MainMemory.getI8(i + k * 344 + 56 + 32);
/*     */       
/* 129 */       i19 = i1;
/*     */       
/*     */ 
/*     */ 
/*     */       label350:
/*     */       
/*     */ 
/*     */ 
/* 137 */       i1 = MainMemory.getI32(paramInt);
/* 138 */       if ((i19 | i18) != 0) {
/*     */         break label739;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       switch (i1) {
/*     */       case 275: 
/*     */         break label694;
/*     */         break;
/*     */       case 276: 
/*     */         break label661;
/*     */         break;
/*     */       case 277: 
/*     */         break label588;
/*     */         break;
/*     */       case 278: 
/*     */         break label515;
/*     */         break;
/*     */       case 288:  break; }
/* 162 */       MainMemory.setI32(paramInt + 88, b1);
/*     */       
/*     */       break label722;
/*     */       
/*     */       label515:
/* 167 */       if ((b1 != 0) && (b2 == 0)) {
/* 168 */         b1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 178 */       else if ((b1 == 0) && (b2 != 0)) {
/* 179 */         b1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 189 */         b1 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */       MainMemory.setI8(paramInt + 88, b1);
/*     */       
/*     */       break label722;
/*     */       
/*     */       label588:
/* 201 */       if ((b1 != 0) && (b2 != 0)) {
/* 202 */         b1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 212 */       else if (MathUtils.or(b2, b1) == 0) {
/* 213 */         b1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 223 */         b1 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */       MainMemory.setI8(paramInt + 88, b1);
/*     */       
/*     */       break label722;
/*     */       
/*     */       label661:
/* 235 */       MainMemory.setI8(paramInt + 88, (byte)((b1 != 0) && (b2 != 0) ? 1 : 0));
/*     */       
/*     */       break label722;
/*     */       
/*     */       label694:
/* 240 */       MainMemory.setI8(paramInt + 88, (byte)(MathUtils.or(b2, b1) != 0 ? 1 : 0));
/*     */       
/*     */ 
/*     */       label722:
/*     */       
/*     */ 
/* 246 */       MainMemory.setI32(paramInt, 64536);
/*     */       
/*     */       break label2160;
/*     */       
/*     */       label739:
/* 251 */       i9 = i1 == 288 ? 1 : 0;
/* 252 */       i1 = MainMemory.getI32Aligned(470812);
/* 253 */       i2 = paramInt + 56;
/* 254 */       i20 = MainMemory.getI32(i2);
/* 255 */       i21 = i20 * i1;
/* 256 */       F301051.call(paramInt);
/* 257 */       bool = MainMemory.getI32Aligned(470852) == 0;
/* 258 */       if (i9 == 0) {
/*     */         break label843;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */       F301339_124.call(i1, j, i21, paramInt, i, i20, bool, k);
/*     */       
/*     */       break label2160;
/*     */       
/*     */       label843:
/* 273 */       if (!bool) {
/*     */         break label2160;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */       if (MainMemory.getI32(paramInt) != 288) {
/*     */         break label1106;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */       i3 = i + k * 344 + 56 + 32;
/* 294 */       i5 = MainMemory.getI32(i3);
/* 295 */       if (i21 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 299 */         i22 = i5;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 306 */         i10 = i + j * 344 + 56 + 28;
/* 307 */         i11 = i + j * 344 + 56 + 32;
/* 308 */         i4 = paramInt + 88;
/* 309 */         i12 = paramInt + 84;
/* 310 */         i22 = i1 * i20;
/* 311 */         i6 = i5;
/* 312 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 320 */           if (MainMemory.getI8(MainMemory.getI32(i10) + i5) != 0) {
/*     */             break label1037;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */           i6 = MainMemory.getI8(MainMemory.getI32(i11) + i5) + i6;
/*     */           
/*     */ 
/*     */ 
/*     */           label1037:
/*     */           
/*     */ 
/*     */ 
/* 339 */           MainMemory.setI32(MainMemory.getI32(i4) + (i5 << 2), i6);
/* 340 */           MainMemory.setI8(MainMemory.getI32(i12) + i5, (byte)0);
/* 341 */           i5 += 1;
/* 342 */           if (i5 == i22) {
/* 343 */             i22 = i6; break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */       MainMemory.setI32(i3, i22);
/*     */       
/*     */ 
/*     */       label1106:
/*     */       
/*     */ 
/* 362 */       if (i1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */         i9 = i18 > 1 ? 1 : 0;
/* 373 */         i10 = i + j * 344 + 56 + 32;
/* 374 */         i11 = i + j * 344 + 56 + 28;
/* 375 */         bool = i19 > 1;
/* 376 */         i12 = i + k * 344 + 56 + 32;
/* 377 */         i13 = i + k * 344 + 56 + 28;
/* 378 */         i14 = paramInt + 84;
/* 379 */         i15 = paramInt + 88;
/* 380 */         i16 = i19 == 0 ? 1 : 0;
/* 381 */         i17 = i18 == 0 ? 1 : 0;
/* 382 */         i18 = i1 + -1;
/* 383 */         i19 = 0;
/* 384 */         b4 = b1;
/* 385 */         b3 = b2;
/* 386 */         b2 = 0;
/* 387 */         b1 = 0;
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
/*     */         for (;;)
/*     */         {
/* 402 */           i22 = i18 - i19;
/* 403 */           if (i20 == 0)
/*     */           {
/*     */ 
/* 406 */             b5 = b2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */             i5 = i21 + -1;
/* 419 */             i6 = 0;
/*     */             
/*     */ 
/* 422 */             b5 = b2;
/* 423 */             b2 = b1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 434 */               i7 = i5 - i6;
/* 435 */               if (i9 == 0) {
/*     */                 break label1380;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 445 */               b4 = MainMemory.getI8(MainMemory.getI32(i10) + i7);
/* 446 */               b1 = MainMemory.getI8(MainMemory.getI32(i11) + i7);
/*     */               
/*     */ 
/*     */               break label1430;
/*     */               
/*     */               label1380:
/*     */               
/* 453 */               if (i17 != 0) {
/* 454 */                 b1 = b5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 465 */                 b4 = MainMemory.getI8(MainMemory.getI32(i10) + i22);
/* 466 */                 b1 = MainMemory.getI8(MainMemory.getI32(i11) + i22);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label1430:
/*     */               
/*     */ 
/*     */ 
/* 476 */               if (!bool) {
/*     */                 break label1484;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */               b3 = MainMemory.getI8(MainMemory.getI32(i12) + i7);
/* 487 */               b2 = MainMemory.getI8(MainMemory.getI32(i13) + i7);
/*     */               
/*     */ 
/*     */               break label1530;
/*     */               
/*     */               label1484:
/*     */               
/* 494 */               if (i16 == 0)
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
/*     */ 
/* 506 */                 b3 = MainMemory.getI8(MainMemory.getI32(i12) + i22);
/* 507 */                 b2 = MainMemory.getI8(MainMemory.getI32(i13) + i22);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label1530:
/*     */               
/*     */ 
/*     */ 
/* 517 */               b5 = MathUtils.or(b2, b1);
/* 518 */               MainMemory.setI8(MainMemory.getI32(i14) + i7, (byte)(b5 != 0 ? 1 : 0));
/* 519 */               switch (MainMemory.getI32(paramInt)) {
/*     */               case 275: 
/*     */                 break label1936;
/*     */                 break;
/*     */               case 276: 
/*     */                 break label1794;
/*     */                 break;
/*     */               case 277: 
/*     */                 break label1713;
/*     */                 break;
/*     */               case 278: 
/*     */                 break;
/*     */               }
/* 532 */               i8 = MainMemory.getI32(i15);
/* 533 */               if ((b4 != 0) && (b3 == 0)) {
/* 534 */                 b5 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 544 */               else if ((b4 == 0) && (b3 != 0)) {
/* 545 */                 b5 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 555 */                 b5 = 0;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 562 */               MainMemory.setI8(i8 + i7, b5);
/*     */               
/*     */               break label2073;
/*     */               
/*     */               label1713:
/* 567 */               i8 = MainMemory.getI32(i15);
/* 568 */               if ((b4 != 0) && (b3 != 0)) {
/* 569 */                 b5 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 579 */               else if (MathUtils.or(b3, b4) == 0) {
/* 580 */                 b5 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 590 */                 b5 = 0;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 597 */               MainMemory.setI8(i8 + i7, b5);
/*     */               
/*     */               break label2073;
/*     */               
/*     */               label1794:
/* 602 */               if (b5 != 0) {
/*     */                 break label1849;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 612 */               MainMemory.setI8(MainMemory.getI32(i15) + i7, (byte)((b4 != 0) && (b3 != 0) ? 1 : 0));
/*     */               
/*     */               break label2073;
/*     */               
/*     */               label1849:
/* 617 */               if ((b1 == 0) || (b2 != 0) || (b3 != 0))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 627 */                 if ((b1 != 0) || (b2 == 0) || (b4 != 0)) {
/*     */                   break label2073;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 637 */               MainMemory.setI8(MainMemory.getI32(i15) + i7, (byte)0);
/* 638 */               MainMemory.setI8(MainMemory.getI32(i14) + i7, (byte)0);
/*     */               
/*     */               break label2073;
/*     */               
/*     */               label1936:
/* 643 */               if (b5 != 0) {
/*     */                 break label1991;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 653 */               MainMemory.setI8(MainMemory.getI32(i15) + i7, (byte)(MathUtils.or(b3, b4) != 0 ? 1 : 0));
/*     */               
/*     */               break label2073;
/*     */               
/*     */               label1991:
/* 658 */               if ((b2 == 0) && (b1 != 0) && (b3 != 0)) {
/*     */                 break label2044;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 668 */               if ((b2 == 0) || (b1 != 0) || (b4 != 0))
/*     */               {
/*     */                 label2044:
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 678 */                 MainMemory.setI8(MainMemory.getI32(i15) + i7, (byte)1);
/* 679 */                 MainMemory.setI8(MainMemory.getI32(i14) + i7, (byte)0);
/*     */               }
/*     */               
/*     */ 
/*     */               label2073:
/*     */               
/* 685 */               i6 += 1;
/* 686 */               if (i6 == i20) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 693 */               b5 = b1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 701 */             i21 -= i20;
/*     */             
/*     */ 
/* 704 */             b5 = b1;
/* 705 */             b1 = b2;
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
/*     */ 
/* 717 */           i20 = MainMemory.getI32(i2);
/* 718 */           i19 += 1;
/* 719 */           if (i19 == i1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 726 */           b2 = b5;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2160:
/*     */       
/*     */ 
/*     */ 
/* 736 */       if (MainMemory.getI32(m) <= 0) {
/*     */         break label2205;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 746 */       free.call(MainMemory.getI32(i + j * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */       label2205:
/*     */       
/*     */ 
/* 752 */       if (MainMemory.getI32(n) <= 0) {
/*     */         break label2255;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 762 */       free.call(MainMemory.getI32(i + k * 344 + 56 + 32));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2255:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 774 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F301339.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */