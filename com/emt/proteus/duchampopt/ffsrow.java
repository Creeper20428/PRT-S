/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffsrow
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3211;
/*  23 */   public static final Function _instance = new ffsrow();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffsrow() { super("ffsrow", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int n = call(i, j, k, m);
/*  48 */     paramFrame.setI32(paramInt1, n);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  54 */     int i = 0;
/*     */     
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     int n = 0;
/*  60 */     int i1 = 0;
/*  61 */     int i2 = 0;
/*  62 */     int i3 = 0;
/*  63 */     long l1 = 0L;
/*  64 */     long l2 = 0L;
/*  65 */     long l3 = 0L;
/*  66 */     int i4 = 0;
/*  67 */     int i5 = 0;
/*  68 */     long l4 = 0L;
/*  69 */     long l5 = 0L;
/*  70 */     int i6 = 0;
/*  71 */     byte b = 0;
/*  72 */     int i7 = 0;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     long l6 = 0L;
/*  78 */     long l7 = 0L;
/*  79 */     long l8 = 0L;
/*  80 */     long l9 = 0L;
/*  81 */     int i12 = 0;
/*  82 */     long l10 = 0L;
/*  83 */     int i13 = 0;
/*     */     
/*     */ 
/*  86 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  90 */       j = MainMemory.alloc(20);
/*  91 */       k = MainMemory.alloc(4);
/*  92 */       m = MainMemory.alloc(4);
/*  93 */       n = MainMemory.alloc(20);
/*  94 */       i1 = MainMemory.alloc(8);
/*  95 */       i2 = MainMemory.alloc(8);
/*  96 */       if (MainMemory.getI32(paramInt4) != 0) {
/*     */         break label1771;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       if (ffiprs.call(paramInt1, paramInt3, j, m, k, n, paramInt4) != 0) {
/*     */         break label1763;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       i7 = MainMemory.getI32(m);
/* 117 */       if (i7 >= 0)
/*     */       {
/*     */ 
/*     */ 
/* 121 */         i8 = i7;
/* 122 */         i7 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 129 */         i7 = 0 - i7;
/* 130 */         MainMemory.setI32(m, i7);
/* 131 */         i8 = i7;
/* 132 */         i7 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       if ((MainMemory.getI32(j) != 14) || (i8 != 1)) {
/*     */         break label1737;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       i8 = MainMemory.getI32(paramInt1);
/* 151 */       i3 = paramInt1 + 4;
/* 152 */       if (i8 != MainMemory.getI32(MainMemory.getI32(i3) + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         ffmahd.call(paramInt1, i8 + 1, 0, paramInt4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 168 */       if (MainMemory.getI32(paramInt4) != 0) {
/*     */         break label1724;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */       i5 = MainMemory.getI32(i3);
/* 179 */       l1 = MainMemory.getI64(i5 + 936) << 32 >> 32;
/* 180 */       l2 = MainMemory.getI64(i5 + 928);
/* 181 */       l3 = MainMemory.getI64(i5 + 956);
/* 182 */       if (l2 != 0L) {
/*     */         break label420;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */       ffcprs.call();
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label420:
/* 197 */       i8 = MainMemory.getI32(paramInt2);
/* 198 */       i4 = paramInt2 + 4;
/* 199 */       i5 = MainMemory.getI32(i4);
/* 200 */       if (i8 != MainMemory.getI32(i5 + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */         ffmahd.call(paramInt2, i8 + 1, 0, paramInt4);
/* 212 */         i5 = MainMemory.getI32(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */       if (MainMemory.getI64(i5 + 112) >= 0L) {
/*     */         break label521;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */       ffrdef.call(paramInt2, paramInt4);
/*     */       
/*     */ 
/*     */       label521:
/*     */       
/*     */ 
/* 236 */       if (MainMemory.getI32(paramInt4) != 0) {
/*     */         break label1711;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */       i5 = MainMemory.getI32(i4);
/* 247 */       l6 = MainMemory.getI64(i5 + 936) << 32 >> 32;
/* 248 */       l4 = MainMemory.getI64(i5 + 928);
/* 249 */       if (l4 != 0L) {
/*     */         break label618;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */       MainMemory.setI64(i5 + 956, 0L);
/* 261 */       i5 = MainMemory.getI32(i4);
/*     */       
/*     */ 
/*     */ 
/*     */       label618:
/*     */       
/*     */ 
/*     */ 
/* 269 */       l5 = MainMemory.getI64(i5 + 956);
/* 270 */       if (l1 != l6) {
/*     */         break label1685;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */       i8 = (int)l2;
/* 281 */       paramInt3 = malloc.call(i8 + 1);
/* 282 */       i6 = j + 4;
/* 283 */       MainMemory.setI32(i6, paramInt3);
/* 284 */       MainMemory.setI32(j + 8, 0);
/* 285 */       MainMemory.setI32(j + 12, i8);
/* 286 */       if (paramInt3 != 0) {
/*     */         break label736;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */       ffxmsg.call(5, 98976);
/* 297 */       ffcprs.call();
/* 298 */       MainMemory.setI32(paramInt4, 113);
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label736:
/* 303 */       MainMemory.setI8(paramInt3 + i8, (byte)0);
/* 304 */       if (i7 != 0) {
/*     */         break label884;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */       ffiter.call(MainMemory.getI32Aligned(470816), MainMemory.getI32Aligned(470820), 0, 0, 3202, j, paramInt4);
/* 315 */       if (l2 <= 0L)
/*     */       {
/*     */ 
/*     */ 
/* 319 */         i7 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 326 */         l6 = MainMemory.getI32(i6) & 0xFFFFFFFF;
/* 327 */         l7 = 0L;
/* 328 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 336 */           i7 = (MainMemory.getI8((int)(l6 + l7)) != 0 ? 1 : 0) + i7;
/* 337 */           l7 += 1L;
/* 338 */           if (l7 == l2) {
/*     */             break label1010;
/* 340 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label884:
/*     */         
/*     */ 
/*     */ 
/* 350 */         b = MainMemory.getI8(MainMemory.getI32Aligned(470792) + MainMemory.getI32Aligned(470804) * 344 + 56 + 32);
/* 351 */         if (l2 > 0L)
/*     */         {
/* 353 */           l6 = 0L;
/*     */         } else {
/*     */           break label983;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 365 */           MainMemory.setI8(paramInt3 + (int)l6, b);
/* 366 */           l6 += 1L;
/* 367 */           if (l6 == l2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 377 */           paramInt3 = MainMemory.getI32(i6);
/*     */         }
/*     */         
/*     */ 
/*     */         label983:
/*     */         
/*     */ 
/* 384 */         if (b == 0) {
/* 385 */           i7 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 395 */           i7 = i8;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1010:
/*     */       
/* 402 */       if (MainMemory.getI32(paramInt4) != 0) {
/*     */         break label1598;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */       i8 = (int)l1;
/* 413 */       paramInt3 = malloc.call(i8 < 500000 ? 500000 : i8);
/* 414 */       if (paramInt3 != 0) {
/*     */         break label1089;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */       ffcprs.call();
/* 425 */       MainMemory.setI32(paramInt4, 113);
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label1089:
/* 430 */       i9 = 500000 / i8;
/* 431 */       i9 = i9 < 1 ? 1 : i9;
/* 432 */       i10 = paramInt1 == paramInt2 ? 1 : 0;
/* 433 */       if (i10 == 0) {
/*     */         break label1231;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 443 */       i11 = MainMemory.getI32(i6);
/* 444 */       if (MainMemory.getI8(i11) == 0) {
/* 445 */         i13 = 1;
/* 446 */         i12 = 1;
/*     */         break label1279;
/*     */       } else {
/* 449 */         i13 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 458 */         i12 = i13 + 1;
/* 459 */         if (MainMemory.getI8(i11 + i12) == 0) {
/*     */           break;
/*     */         }
/*     */         
/* 463 */         i13 = i12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 470 */       i12 = i13 + 2;
/* 471 */       i13 = i12;
/*     */       
/*     */       break label1279;
/*     */       
/*     */       label1231:
/*     */       
/* 477 */       i12 = (int)l4 + 1;
/* 478 */       if (i12 <= 1)
/*     */       {
/*     */ 
/*     */ 
/* 482 */         i13 = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 490 */         ffirow.call(paramInt2, l4, i7, paramInt4);
/* 491 */         i13 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1279:
/*     */       
/*     */ 
/*     */ 
/* 500 */       l1 = i8;
/* 501 */       l6 = i13 + 1;
/* 502 */       l7 = i13 + -1 & 0xFFFFFFFF;
/* 503 */       l8 = i13;
/* 504 */       l9 = 0L;
/* 505 */       i13 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 515 */         l10 = l6 + l9;
/* 516 */         if (MainMemory.getI8(MainMemory.getI32(i6) + (int)(l7 + l9)) != 0)
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
/*     */ 
/* 528 */           ffgtbb.call(paramInt1, l8 + l9, 1L, l1, paramInt3 + i13 * i8, paramInt4);
/* 529 */           i13 += 1;
/* 530 */           if (i13 != i9) {
/*     */             break label1430;
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
/* 542 */           ffptbb.call(paramInt2, i12, 1L, i13 * i8, paramInt3, paramInt4);
/* 543 */           i12 += i13;
/* 544 */           i13 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1430:
/*     */         
/*     */ 
/*     */ 
/* 553 */         if (MainMemory.getI32(paramInt4) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 563 */         l9 += 1L;
/* 564 */         if (l10 > l2) {
/*     */           break;
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
/* 577 */       if (i13 == 0) {
/* 578 */         i8 = i12;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 588 */         ffptbb.call(paramInt2, i12, 1L, i13 * i8, paramInt3, paramInt4);
/* 589 */         i8 = i12 + i13;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 597 */       if (i10 == 0) {
/*     */         break label1561;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 607 */       ffsrow_1425.call(i8, l2, paramInt4, paramInt1);
/*     */       
/*     */       break label1589;
/*     */       
/*     */       label1561:
/* 612 */       ffsrow_1423.call(l3, l4, paramInt4, i1, i7, i4, i3, paramInt1, l5, paramInt3, i2, paramInt2);
/*     */       
/*     */ 
/*     */       label1589:
/*     */       
/*     */ 
/* 618 */       free.call(paramInt3);
/*     */       
/*     */ 
/*     */       label1598:
/*     */       
/*     */ 
/* 624 */       paramInt3 = MainMemory.getI32(i6);
/* 625 */       if (paramInt3 != 0) {
/*     */         break label1658;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 635 */       SystemLibrary.printf(86176, new Object[] { Integer.valueOf(43520), Integer.valueOf(412) });
/*     */       
/*     */       break label1667;
/*     */       
/*     */       label1658:
/* 640 */       free.call(paramInt3);
/*     */       
/*     */ 
/*     */       label1667:
/*     */       
/*     */ 
/* 646 */       ffcprs.call();
/* 647 */       ffcmph.call(paramInt2, paramInt4);
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label1685:
/* 652 */       ffxmsg.call(5, 111072);
/* 653 */       ffcprs.call();
/* 654 */       MainMemory.setI32(paramInt4, 436);
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label1711:
/* 659 */       ffcprs.call();
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label1724:
/* 664 */       ffcprs.call();
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label1737:
/* 669 */       ffcprs.call();
/* 670 */       ffxmsg.call(5, 113120);
/* 671 */       MainMemory.setI32(paramInt4, 432);
/*     */       
/*     */       break label1771;
/*     */       
/*     */       label1763:
/* 676 */       ffcprs.call();
/*     */       
/*     */ 
/*     */       label1771:
/*     */       
/*     */ 
/* 682 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 688 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 693 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffsrow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */