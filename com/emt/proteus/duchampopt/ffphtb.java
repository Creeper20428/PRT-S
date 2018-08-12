/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffphtb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3586;
/*  22 */   public static final Function _instance = new ffphtb();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffphtb() { super("ffphtb", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  29 */     call(paramInt1, paramLong, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  30 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     call(i, l, j, k, m, n, i1, i2);
/*  60 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  66 */     int i = 0;
/*  67 */     int j = 0;
/*  68 */     int k = 0;
/*  69 */     int m = 0;
/*  70 */     int n = 0;
/*  71 */     int i1 = 0;
/*  72 */     int i2 = 0;
/*  73 */     int i3 = 0;
/*  74 */     int i4 = 0;
/*  75 */     int i5 = 0;
/*  76 */     int i6 = 0;
/*  77 */     int i7 = 0;
/*  78 */     int i8 = 0;
/*  79 */     int i9 = 0;
/*  80 */     int i10 = 0;
/*  81 */     int i11 = 0;
/*  82 */     int i12 = 0;
/*  83 */     int i13 = 0;
/*  84 */     int i14 = 0;
/*  85 */     int i15 = 0;
/*  86 */     int i16 = 0;
/*  87 */     int i17 = 0;
/*  88 */     int i18 = 0;
/*     */     
/*     */ 
/*  91 */     int i19 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  95 */       i = MainMemory.alloc(4);
/*  96 */       j = MainMemory.alloc(4);
/*  97 */       k = MainMemory.alloc(4);
/*  98 */       m = MainMemory.alloc(71);
/*  99 */       n = MainMemory.alloc(81);
/* 100 */       i1 = MainMemory.alloc(30);
/* 101 */       i2 = MainMemory.alloc(72);
/* 102 */       i3 = MainMemory.alloc(73);
/* 103 */       i4 = MainMemory.alloc(71);
/* 104 */       i8 = MainMemory.getI32(paramInt1);
/* 105 */       i5 = paramInt1 + 4;
/* 106 */       if (i8 != MainMemory.getI32(MainMemory.getI32(i5) + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         ffmahd.call(paramInt1, i8 + 1, 0, paramInt7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 122 */       if (MainMemory.getI32(paramInt7) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         i6 = MainMemory.getI32(i5);
/* 133 */         if (MainMemory.getI64(i6 + 88) != MainMemory.getI64(MainMemory.getI32(i6 + 84) + (MainMemory.getI32(i6 + 64) << 3))) {
/*     */           break label1943;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         if (paramLong >= 0L) {
/*     */           break label297;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         MainMemory.setI32(paramInt7, 218);
/*     */         
/*     */ 
/*     */         break label1956;
/*     */         
/*     */         label297:
/*     */         
/* 160 */         if (!MathUtils.ugt(paramInt2, 999)) {
/*     */           break label338;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */         MainMemory.setI32(paramInt7, 216);
/*     */         
/*     */ 
/*     */         break label1956;
/*     */         
/*     */         label338:
/*     */         
/* 177 */         MainMemory.setI8(i4, (byte)0);
/* 178 */         if (paramInt6 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           SystemLibrary.strncat(i4, paramInt6, 70);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 194 */         paramInt6 = calloc.call(paramInt2 < 5 ? 5 : paramInt2, 4);
/* 195 */         i7 = paramInt6;
/* 196 */         if (paramInt6 == 0) {
/* 197 */           i8 = 0;
/* 198 */           i9 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 208 */           i9 = MainMemory.getI32(paramInt7);
/* 209 */           if (i9 > 0) {
/* 210 */             i8 = 0;
/* 211 */             i15 = i9;
/* 212 */             i9 = 1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label608;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 222 */           if (paramInt2 < 1) {
/* 223 */             i8 = 0;
/* 224 */             i9 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 234 */             MainMemory.setI32(i7, 1);
/* 235 */             if (paramInt2 > 0) {
/* 236 */               i9 = 0;
/* 237 */               i8 = 0;
/*     */             }
/*     */             else
/*     */             {
/* 241 */               i8 = -1;
/* 242 */               i9 = 1;
/*     */               
/*     */ 
/*     */               break label596;
/*     */             }
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 251 */               i16 = paramInt4 + (i8 << 2);
/* 252 */               i9 += 1;
/* 253 */               MainMemory.setI32(i7 + (i8 << 2), i9);
/* 254 */               ffasfm.call(MainMemory.getI32(i16), i, k, j, paramInt7);
/* 255 */               i9 += MainMemory.getI32(k);
/* 256 */               i8 += 1;
/* 257 */               if (i8 == paramInt2) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */             i8 = i9 + -1;
/*     */             
/* 271 */             i9 = 1;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label596:
/*     */         
/*     */ 
/* 279 */         i15 = MainMemory.getI32(paramInt7);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label608:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */         if (i15 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */           ffs2c.call(26880, m, i15);
/* 302 */           ffmkky.call(45664, m, 65184, n, paramInt7);
/* 303 */           ffprec.call(paramInt1, n, paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 309 */         ffpkyj.call(paramInt1, 28224, 8L, 66432, paramInt7);
/* 310 */         ffpkyj.call(paramInt1, 24224, 2L, 70336, paramInt7);
/* 311 */         ffpkyj.call(paramInt1, 36000, i8, 74464, paramInt7);
/* 312 */         i15 = MainMemory.getI32(paramInt7);
/* 313 */         if (i15 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */           MainMemory.setI8(m, (byte)0);
/* 325 */           if (SystemLibrary.sprintf(m, 20096, new Object[] { Long.valueOf(paramLong) }) >= 0) {
/*     */             break label786;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */           ffxmsg.call(5, 99808);
/* 336 */           MainMemory.setI32(paramInt7, 401);
/*     */           
/*     */ 
/*     */           label786:
/*     */           
/*     */ 
/* 342 */           ffmkky.call(35712, m, 67680, n, paramInt7);
/* 343 */           ffprec.call(paramInt1, n, paramInt7);
/* 344 */           i15 = MainMemory.getI32(paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 352 */         if (i15 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */           MainMemory.setI8(m, (byte)0);
/* 364 */           if (SystemLibrary.sprintf(m, 20096, new Object[] { Long.valueOf(0L) }) >= 0) {
/*     */             break label895;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 374 */           ffxmsg.call(5, 99808);
/* 375 */           MainMemory.setI32(paramInt7, 401);
/*     */           
/*     */ 
/*     */           label895:
/*     */           
/*     */ 
/* 381 */           ffmkky.call(34560, m, 90144, n, paramInt7);
/* 382 */           ffprec.call(paramInt1, n, paramInt7);
/* 383 */           i15 = MainMemory.getI32(paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */         if (i15 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */           MainMemory.setI8(m, (byte)0);
/* 403 */           if (SystemLibrary.sprintf(m, 20096, new Object[] { Long.valueOf(1L) }) >= 0) {
/*     */             break label1004;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 413 */           ffxmsg.call(5, 99808);
/* 414 */           MainMemory.setI32(paramInt7, 401);
/*     */           
/*     */ 
/*     */           label1004:
/*     */           
/*     */ 
/* 420 */           ffmkky.call(34592, m, 80736, n, paramInt7);
/* 421 */           ffprec.call(paramInt1, n, paramInt7);
/* 422 */           i15 = MainMemory.getI32(paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 430 */         if (i15 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */           paramLong = paramInt2;
/* 441 */           MainMemory.setI8(m, (byte)0);
/* 442 */           if (SystemLibrary.sprintf(m, 20096, new Object[] { Long.valueOf(paramLong) }) >= 0) {
/*     */             break label1116;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 452 */           ffxmsg.call(5, 99808);
/* 453 */           MainMemory.setI32(paramInt7, 401);
/*     */           
/*     */ 
/*     */           label1116:
/*     */           
/*     */ 
/* 459 */           ffmkky.call(41248, m, 74432, n, paramInt7);
/* 460 */           ffprec.call(paramInt1, n, paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 466 */         i10 = paramInt5 == 0 ? 1 : 0;
/* 467 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 474 */           i15 = i11 + 1;
/* 475 */           i = i7 + (i11 << 2);
/* 476 */           i16 = paramInt5 + (i11 << 2);
/* 477 */           i17 = paramInt4 + (i11 << 2);
/* 478 */           i18 = paramInt3 + (i11 << 2);
/* 479 */           if (i11 >= paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 489 */           if (MainMemory.getI8(MainMemory.getI32(i18)) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 499 */             ffphtb_1375.call(i18, paramInt7, i15, i3, i2, paramInt1, m, n);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 505 */           i11 = MainMemory.getI32(i);
/* 506 */           if ((i11 >= 1) && (i11 <= i8)) {
/*     */             break label1314;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */           MainMemory.setI32(paramInt7, 234);
/*     */           
/*     */ 
/*     */           label1314:
/*     */           
/*     */ 
/* 522 */           SystemLibrary.sprintf(i3, 75680, new Object[] { Integer.valueOf(i15) });
/* 523 */           ffkeyn.call(27328, i15, i2, paramInt7);
/* 524 */           if (MainMemory.getI32(paramInt7) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 534 */             paramLong = i11;
/* 535 */             MainMemory.setI8(m, (byte)0);
/* 536 */             if (SystemLibrary.sprintf(m, 20096, new Object[] { Long.valueOf(paramLong) }) >= 0) {
/*     */               break label1428;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 546 */             ffxmsg.call(5, 99808);
/* 547 */             MainMemory.setI32(paramInt7, 401);
/*     */             
/*     */ 
/*     */             label1428:
/*     */             
/*     */ 
/* 553 */             ffmkky.call(i2, m, i3, n, paramInt7);
/* 554 */             ffprec.call(paramInt1, n, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 560 */           SystemLibrary.strcpy(i1, MainMemory.getI32(i17));
/* 561 */           i11 = SystemLibrary.strlen(i1);
/* 562 */           if (i11 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */             i12 = __ctype_toupper_loc.call();
/* 573 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 580 */               i14 = i1 + i13;
/* 581 */               MainMemory.setI8(i14, (byte)MainMemory.getI32(MainMemory.getI32(i12) + (MainMemory.getI8(i14) << 2)));
/* 582 */               i13 += 1;
/* 583 */               if (i13 == i11) {
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
/* 594 */           ffkeyn.call(27360, i15, i2, paramInt7);
/* 595 */           i11 = MainMemory.getI32(paramInt7);
/* 596 */           if (i11 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 606 */             ffs2c.call(i1, m, i11);
/* 607 */             ffmkky.call(i2, m, 71360, n, paramInt7);
/* 608 */             ffprec.call(paramInt1, n, paramInt7);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 614 */           if (i10 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 624 */             i14 = MainMemory.getI32(i16);
/* 625 */             if (i14 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 635 */               if (MainMemory.getI8(i14) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 645 */                 ffkeyn.call(27456, i15, i2, paramInt7);
/* 646 */                 i11 = MainMemory.getI32(paramInt7);
/* 647 */                 if (i11 > 0) {
/*     */                   break label1766;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 658 */                 ffs2c.call(MainMemory.getI32(i16), m, i11);
/* 659 */                 ffmkky.call(i2, m, 66400, n, paramInt7);
/* 660 */                 ffprec.call(paramInt1, n, paramInt7);
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/* 666 */           i11 = MainMemory.getI32(paramInt7);
/*     */           
/*     */ 
/*     */ 
/*     */           label1766:
/*     */           
/*     */ 
/*     */ 
/* 674 */           if (i11 > 0) {
/*     */             break;
/*     */           }
/*     */           
/* 678 */           i11 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 685 */         if (MainMemory.getI8(i4) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 695 */           paramInt2 = MainMemory.getI32(paramInt7);
/* 696 */           if (paramInt2 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 707 */             ffs2c.call(i4, m, paramInt2);
/* 708 */             ffmkky.call(40928, m, 82592, n, paramInt7);
/* 709 */             ffprec.call(paramInt1, n, paramInt7);
/*     */           }
/*     */           
/*     */         }
/*     */         else
/*     */         {
/* 715 */           paramInt2 = MainMemory.getI32(paramInt7);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 723 */         if (paramInt2 <= 0) {
/*     */           break label1900;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 733 */         ffxmsg.call(5, 119328);
/*     */         
/*     */ 
/*     */         label1900:
/*     */         
/*     */ 
/* 739 */         if (i9 != 0) {
/*     */           break label1928;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1956;
/*     */       
/*     */ 
/*     */ 
/*     */       label1928:
/*     */       
/*     */ 
/*     */ 
/* 755 */       free.call(paramInt6);
/*     */       
/*     */ 
/*     */       break label1956;
/*     */       
/*     */       label1943:
/*     */       
/* 762 */       MainMemory.setI32(paramInt7, 201);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1956:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 773 */       MainMemory.dealloc_generated(i19);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffphtb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */