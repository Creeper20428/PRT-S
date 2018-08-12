/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffainit
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3257;
/*  19 */   public static final Function _instance = new ffainit();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ffainit() { super("ffainit", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  26 */     call(paramInt1, paramInt2);
/*  27 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*  54 */     int i5 = 0;
/*  55 */     int i6 = 0;
/*  56 */     long l1 = 0L;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     int i12 = 0;
/*  63 */     int i13 = 0;
/*  64 */     int i14 = 0;
/*  65 */     int i15 = 0;
/*  66 */     long l2 = 0L;
/*  67 */     long l3 = 0L;
/*  68 */     boolean bool = false;
/*     */     
/*     */ 
/*  71 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i = MainMemory.alloc(4);
/*  76 */       j = MainMemory.alloc(8);
/*  77 */       k = MainMemory.alloc(8);
/*  78 */       m = MainMemory.alloc(8);
/*  79 */       n = MainMemory.alloc(72);
/*  80 */       i1 = MainMemory.alloc(71);
/*  81 */       i2 = MainMemory.alloc(73);
/*  82 */       i3 = MainMemory.alloc(81);
/*  83 */       i4 = MainMemory.alloc(81);
/*  84 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         i6 = MainMemory.getI32(paramInt1);
/*  95 */         i5 = paramInt1 + 4;
/*  96 */         i14 = MainMemory.getI32(i5);
/*  97 */         if (i6 != MainMemory.getI32(i14 + 64))
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
/* 108 */           ffmahd.call(paramInt1, i6 + 1, 0, paramInt2);
/* 109 */           i14 = MainMemory.getI32(i5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */         MainMemory.setI32(i14 + 68, 1);
/* 118 */         i14 = MainMemory.getI32(i5);
/* 119 */         MainMemory.setI64(i14 + 88, MainMemory.getI64(i14 + 32));
/* 120 */         if (ffgttb.call(paramInt1, k, m, j, i, paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */           l1 = MainMemory.getI64(j);
/* 131 */           if (l1 != 0L) {
/*     */             break label1963;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */           l1 = MainMemory.getI64(k);
/* 142 */           MainMemory.setI64(MainMemory.getI32(i5) + 936, l1);
/* 143 */           i6 = MainMemory.getI32(i);
/* 144 */           MainMemory.setI32(MainMemory.getI32(i5) + 916, i6);
/* 145 */           i14 = MainMemory.getI32(i5);
/* 146 */           i7 = MainMemory.getI32(i14 + 1200);
/* 147 */           if (i7 != 0)
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
/* 158 */             free.call(i7);
/* 159 */             MainMemory.setI32(MainMemory.getI32(i5) + 1200, 0);
/* 160 */             MainMemory.setI32(MainMemory.getI32(i5) + 1188, 0);
/* 161 */             MainMemory.setI32(MainMemory.getI32(i5) + 1192, 0);
/* 162 */             MainMemory.setI32(MainMemory.getI32(i5) + 1196, 0);
/* 163 */             i14 = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */           i7 = MainMemory.getI32(i14 + 1204);
/* 172 */           if (i7 != 0)
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
/* 183 */             free.call(i7);
/* 184 */             MainMemory.setI32(MainMemory.getI32(i5) + 1204, 0);
/* 185 */             i14 = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */           i15 = MainMemory.getI32(i14 + 944);
/* 194 */           if (i15 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */             free.call(i15);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 210 */           bool = i6 > 0;
/* 211 */           if (!bool) {
/*     */             break label647;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */           i7 = calloc.call(i6, 152);
/* 222 */           if (i7 != 0) {
/*     */             break label626;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */           ffxmsg.call(5, 134496);
/* 233 */           MainMemory.setI32(MainMemory.getI32(i5) + 944, 0);
/* 234 */           MainMemory.setI32(paramInt2, 111);
/*     */           
/*     */ 
/*     */           break label2008;
/*     */           
/*     */           label626:
/*     */           
/* 241 */           ffainit_525.call(i6, i7, i5, bool);
/*     */           
/*     */           break label665;
/*     */           
/*     */           label647:
/* 246 */           MainMemory.setI32(MainMemory.getI32(i5) + 944, 0);
/*     */           
/*     */ 
/*     */           label665:
/*     */           
/*     */ 
/* 252 */           l2 = MainMemory.getI64(m);
/* 253 */           MainMemory.setI64(MainMemory.getI32(i5) + 928, l2);
/* 254 */           MainMemory.setI64(MainMemory.getI32(i5) + 920, l2);
/* 255 */           l1 = l2 * l1;
/* 256 */           MainMemory.setI64(MainMemory.getI32(i5) + 948, l1);
/* 257 */           MainMemory.setI64(MainMemory.getI32(i5) + 956, 0L);
/* 258 */           MainMemory.setI32(MainMemory.getI32(i5) + 1012, 0);
/* 259 */           i7 = n + 1;
/* 260 */           i8 = n + 2;
/* 261 */           i9 = n + 3;
/* 262 */           i10 = 0;
/* 263 */           i11 = 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 271 */         ffgkyn.call(paramInt1, i10 + 8, n, i1, i2, paramInt2);
/* 272 */         i13 = MainMemory.getI32(paramInt2);
/* 273 */         switch (i13)
/*     */         {
/*     */         case 205: 
/*     */           break label902;
/*     */           break;
/*     */         case 207: 
/*     */           break label887;
/*     */           break;
/*     */         case 107: 
/*     */           break;
/*     */         }
/*     */         
/* 285 */         ffxmsg.call(5, 122464);
/* 286 */         MainMemory.setI32(paramInt2, 210);
/* 287 */         break;
/*     */         
/*     */ 
/*     */         label887:
/*     */         
/*     */ 
/* 293 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */         break label958;
/*     */         
/*     */         label902:
/* 298 */         MainMemory.setI16(i1 + SystemLibrary.strlen(i1), (short)39);
/* 299 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */ 
/*     */         break label958;
/*     */         
/* 304 */         if (i13 <= 0) {
/*     */           break label958;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */         break;
/*     */         
/*     */ 
/*     */         label958:
/*     */         
/*     */ 
/* 320 */         i12 = MainMemory.getI8(n);
/* 321 */         switch (i12)
/*     */         {
/*     */         case 84: 
/*     */           break label1858;
/*     */           
/*     */ 
/*     */           break;
/*     */         case 69: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 333 */         i13 = (i12 & 0xFF) + -69;
/* 334 */         if (i13 != 0) {
/*     */           break label1125;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */         i13 = (MainMemory.getI8(i7) & 0xFF) + -78;
/* 346 */         if (i13 != 0) {
/*     */           break label1125;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */         i13 = (MainMemory.getI8(i8) & 0xFF) + -68;
/* 358 */         if (i13 != 0) {
/*     */           break label1125;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */         i13 = MainMemory.getI8(i9) & 0xFF;
/*     */         
/*     */ 
/*     */ 
/*     */         label1125:
/*     */         
/*     */ 
/*     */ 
/* 377 */         if (i13 != 0) {
/*     */           break label1879;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */         i14 = MainMemory.getI32(i5);
/* 389 */         i15 = MainMemory.getI32(i14 + 944);
/* 390 */         m = i14 + 936;
/* 391 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 398 */           i = i15 + i10 * 152 + 148;
/* 399 */           if (i10 >= i6) {
/*     */             break label1686;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */           l2 = MainMemory.getI64(i15 + i10 * 152 + 72);
/* 410 */           if (MainMemory.getI32(i15 + i10 * 152 + 80) != 55537) {
/*     */             break label1318;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */           ffkeyn.call(27360, i10 + 1, n, paramInt2);
/* 421 */           SystemLibrary.sprintf(i3, 93344, new Object[] { Integer.valueOf(n) });
/* 422 */           ffxmsg.call(5, i3);
/* 423 */           MainMemory.setI32(paramInt2, 232);
/*     */           
/*     */ 
/*     */           break label2008;
/*     */           
/*     */           label1318:
/*     */           
/* 430 */           if (l2 != -1L) {
/*     */             break label1396;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */           ffkeyn.call(27328, i10 + 1, n, paramInt2);
/* 441 */           SystemLibrary.sprintf(i3, 93344, new Object[] { Integer.valueOf(n) });
/* 442 */           ffxmsg.call(5, i3);
/* 443 */           MainMemory.setI32(paramInt2, 231);
/*     */           
/*     */ 
/*     */           break label2008;
/*     */           
/*     */           label1396:
/*     */           
/* 450 */           l3 = MainMemory.getI64(m);
/* 451 */           bool = l3 == 0L;
/* 452 */           if (!bool)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 462 */             if ((l2 <= -1L) || (l3 <= l2)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 472 */             if (!bool)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */               if (MainMemory.getI32(i) + l2 <= l3) {
/*     */                 break label1605;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */               SystemLibrary.sprintf(i3, 108640, new Object[] { Integer.valueOf(i10 + 1) });
/* 493 */               ffxmsg.call(5, i3);
/* 494 */               SystemLibrary.sprintf(i3, 74240, new Object[] { Integer.valueOf(i15 + i10 * 152 + 136), Integer.valueOf((int)MainMemory.getI64(MainMemory.getI32(i5) + 936)) });
/* 495 */               ffxmsg.call(5, i3);
/* 496 */               MainMemory.setI32(paramInt2, 236);
/*     */               
/*     */               break label2008;
/*     */             }
/*     */           }
/*     */           
/*     */           label1605:
/* 503 */           i10 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 509 */         ffkeyn.call(27328, i10 + 1, n, paramInt2);
/* 510 */         SystemLibrary.sprintf(i3, 111200, new Object[] { Integer.valueOf(n), Integer.valueOf((int)l2) });
/* 511 */         ffxmsg.call(5, i3);
/* 512 */         MainMemory.setI32(paramInt2, 234);
/* 513 */         break;
/*     */         
/*     */ 
/*     */         label1686:
/*     */         
/*     */ 
/* 519 */         MainMemory.setI64(i14 + 88, MainMemory.getI64(i14 + 104) - (i11 * 80 + 80));
/* 520 */         i14 = MainMemory.getI32(i5);
/* 521 */         l2 = MainMemory.getI64(i14 + 104) + -80L;
/* 522 */         MainMemory.setI64(i14 + 112, 2880L - l2 % 2880L + l2);
/* 523 */         i14 = MainMemory.getI32(i5);
/* 524 */         l1 += 2879L;
/* 525 */         MainMemory.setI64(MainMemory.getI32(i14 + 84) + (MainMemory.getI32(i14 + 64) + 1 << 3), MainMemory.getI64(i14 + 112) - l1 % 2880L + l1);
/* 526 */         i14 = MainMemory.getI32(i5);
/* 527 */         MainMemory.setI64(i14 + 104, MainMemory.getI64(MainMemory.getI32(i14 + 84) + (MainMemory.getI32(i14 + 64) << 3)));
/* 528 */         break;
/*     */         
/*     */ 
/*     */         label1858:
/*     */         
/*     */ 
/* 534 */         ffgtbp.call(paramInt1, n, i1, paramInt2);
/* 535 */         i12 = MainMemory.getI8(n);
/*     */         
/*     */ 
/*     */ 
/*     */         label1879:
/*     */         
/*     */ 
/*     */ 
/* 543 */         if (i12 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 547 */           i11 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 554 */         else if (MainMemory.getI8(i1) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 558 */           i11 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 565 */           i11 = MainMemory.getI8(i2) == 0 ? i11 + 1 : 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 573 */         i10 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label1963:
/*     */       
/*     */ 
/* 580 */       ffxmsg.call(5, 124064);
/* 581 */       SystemLibrary.sprintf(i4, 55040, new Object[] { Integer.valueOf((int)l1) });
/* 582 */       ffxmsg.call(5, i4);
/* 583 */       MainMemory.setI32(paramInt2, 214);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2008:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 594 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffainit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */