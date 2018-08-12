/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class F272877
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3092;
/*  16 */   public static final Function _instance = new F272877();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public F272877() { super("F272877", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = call(i, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
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
/*  56 */     int i7 = 0;
/*  57 */     int i8 = 0;
/*  58 */     int i9 = 0;
/*  59 */     int i10 = 0;
/*  60 */     int i11 = 0;
/*  61 */     int i12 = 0;
/*     */     
/*     */ 
/*  64 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       j = MainMemory.alloc(8);
/*  69 */       k = MainMemory.alloc(1200);
/*  70 */       m = MainMemory.alloc(1200);
/*  71 */       n = MainMemory.alloc(100);
/*  72 */       i1 = MainMemory.alloc(100);
/*  73 */       i2 = MainMemory.alloc(1200);
/*  74 */       i3 = MainMemory.alloc(1200);
/*  75 */       i6 = MainMemory.alloc(4);
/*  76 */       i4 = MainMemory.alloc(4);
/*  77 */       i5 = MainMemory.alloc(4);
/*  78 */       MainMemory.setI64(i3, 13281252013469554L);
/*  79 */       i7 = i3;
/*  80 */       SystemLibrary.strcat(i7, paramInt1);
/*  81 */       if (F272601.call(i7, n, i1, i6, i2) != 0) {
/*     */         break label1634;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       i9 = F272784.call(i1, MainMemory.getI32(i6));
/*  92 */       MainMemory.setI32(paramInt3, i9);
/*  93 */       if (i9 >= 0) {
/*     */         break label229;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       ffxmsg.call(5, 102880);
/* 104 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label229:
/*     */       
/* 111 */       paramInt1 = SystemLibrary.getenv(52736);
/* 112 */       if (paramInt1 != 0) {
/*     */         break label301;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */       SystemLibrary.printf(49792, new Object[0]);
/* 123 */       SystemLibrary.fgets(k, 1200, MainMemory.getI32Aligned(1792));
/* 124 */       MainMemory.setI8(k + (SystemLibrary.strlen(k) + -1), (byte)0);
/*     */       
/*     */       break label313;
/*     */       
/*     */       label301:
/* 129 */       SystemLibrary.strcpy(k, paramInt1);
/*     */       
/*     */ 
/*     */       label313:
/*     */       
/*     */ 
/* 135 */       i9 = SystemLibrary.strlen(k);
/* 136 */       i10 = MainMemory.getI32(paramInt3);
/* 137 */       MainMemory.setI32(j, SystemLibrary.bswapInt(i9 + 4));
/* 138 */       i6 = j + 4;
/* 139 */       MainMemory.setI32(i6, -804847616);
/* 140 */       paramInt1 = j;
/* 141 */       if (i10 < 0) {
/*     */         break label571;
/*     */       } else {
/* 144 */         i11 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 153 */         if (i11 >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         i12 = send.call(i10, paramInt1 + i11, 8 - i11, 0);
/* 165 */         if (i12 < 1) {
/* 166 */           i11 = i12;
/* 167 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         i11 = i12 + i11;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */       if (i11 < 0) {
/* 184 */         i9 = i11;
/*     */         break label553;
/*     */       } else {
/* 187 */         i11 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 196 */         if (i11 >= i9)
/*     */         {
/*     */ 
/*     */ 
/* 200 */           i9 = i11;
/* 201 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 207 */         i12 = send.call(i10, k + i11, i9 - i11, 0);
/* 208 */         if (i12 < 1) {
/* 209 */           i9 = i12;
/* 210 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */         i11 = i12 + i11;
/*     */       }
/*     */       
/*     */ 
/*     */       label553:
/*     */       
/*     */ 
/* 226 */       if (i9 >= 0) {
/*     */         break label590;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label571:
/*     */       
/*     */ 
/*     */ 
/* 236 */       ffxmsg.call(5, 100128);
/* 237 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label590:
/*     */       
/* 244 */       i7 = i5;
/* 245 */       if (F272093.call(MainMemory.getI32(paramInt3), i4, i7) != 0) {
/*     */         break label640;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */       ffxmsg.call(5, 98144);
/* 256 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label640:
/*     */       
/* 263 */       if (MainMemory.getI32(i4) != 2002) {
/*     */         break label1609;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       i8 = SystemLibrary.getenv(52768);
/* 274 */       if (i8 != 0) {
/*     */         break label738;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */       SystemLibrary.printf(49824, new Object[0]);
/* 285 */       SystemLibrary.fgets(k, 1200, MainMemory.getI32Aligned(1792));
/* 286 */       MainMemory.setI8(k + (SystemLibrary.strlen(k) + -1), (byte)0);
/*     */       
/*     */       break label751;
/*     */       
/*     */       label738:
/* 291 */       SystemLibrary.strcpy(k, i8);
/*     */       
/*     */ 
/*     */       label751:
/*     */       
/*     */ 
/* 297 */       if (SystemLibrary.strlen(k) == 0) {
/*     */         break label825;
/*     */       } else {
/* 300 */         i9 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 309 */         i8 = k + i9;
/* 310 */         MainMemory.setI8(i8, MathUtils.xor(MainMemory.getI8(i8), (byte)-1));
/* 311 */         i9 += 1;
/* 312 */       } while (MathUtils.ult(i9, SystemLibrary.strlen(k)));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label825:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 323 */       i9 = SystemLibrary.strlen(k);
/* 324 */       i10 = MainMemory.getI32(paramInt3);
/* 325 */       MainMemory.setI32(j, SystemLibrary.bswapInt(i9 + 4));
/* 326 */       MainMemory.setI32(i6, -788070400);
/* 327 */       if (i10 < 0) {
/*     */         break label1074;
/*     */       } else {
/* 330 */         i11 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 339 */         if (i11 >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 350 */         i12 = send.call(i10, paramInt1 + i11, 8 - i11, 0);
/* 351 */         if (i12 < 1) {
/* 352 */           i11 = i12;
/* 353 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */         i11 = i12 + i11;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */       if (i11 < 0) {
/* 370 */         i9 = i11;
/*     */         break label1056;
/*     */       } else {
/* 373 */         i11 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 382 */         if (i11 >= i9)
/*     */         {
/*     */ 
/*     */ 
/* 386 */           i9 = i11;
/* 387 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 393 */         i12 = send.call(i10, k + i11, i9 - i11, 0);
/* 394 */         if (i12 < 1) {
/* 395 */           i9 = i12;
/* 396 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */         i11 = i12 + i11;
/*     */       }
/*     */       
/*     */ 
/*     */       label1056:
/*     */       
/*     */ 
/* 412 */       if (i9 >= 0) {
/*     */         break label1093;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1074:
/*     */       
/*     */ 
/*     */ 
/* 422 */       ffxmsg.call(5, 110112);
/* 423 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1093:
/*     */       
/* 430 */       if (F272093.call(MainMemory.getI32(paramInt3), i4, i7) >= 0) {
/*     */         break label1139;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */       ffxmsg.call(5, 107680);
/* 441 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1139:
/*     */       
/* 448 */       if (MainMemory.getI32(i4) != 2002) {
/*     */         break label1584;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 458 */       SystemLibrary.strcpy(k, i2);
/* 459 */       MainMemory.setI16(k + SystemLibrary.strlen(k), (short)32);
/* 460 */       SystemLibrary.strcat(k, paramInt2);
/* 461 */       i9 = SystemLibrary.strlen(k);
/* 462 */       i10 = MainMemory.getI32(paramInt3);
/* 463 */       MainMemory.setI32(j, SystemLibrary.bswapInt(i9 + 4));
/* 464 */       MainMemory.setI32(i6, -737738752);
/* 465 */       if (i10 < 0) {
/*     */         break label1440;
/*     */       } else {
/* 468 */         i11 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 477 */         if (i11 >= 8) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 488 */         i12 = send.call(i10, paramInt1 + i11, 8 - i11, 0);
/* 489 */         if (i12 < 1) {
/* 490 */           i11 = i12;
/* 491 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 500 */         i11 = i12 + i11;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */       if (i11 < 0) {
/* 508 */         i9 = i11;
/*     */         break label1422;
/*     */       } else {
/* 511 */         i11 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 520 */         if (i11 >= i9)
/*     */         {
/*     */ 
/*     */ 
/* 524 */           i9 = i11;
/* 525 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 531 */         i12 = send.call(i10, k + i11, i9 - i11, 0);
/* 532 */         if (i12 < 1) {
/* 533 */           i9 = i12;
/* 534 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 543 */         i11 = i12 + i11;
/*     */       }
/*     */       
/*     */ 
/*     */       label1422:
/*     */       
/*     */ 
/* 550 */       if (i9 >= 0) {
/*     */         break label1459;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1440:
/*     */       
/*     */ 
/*     */ 
/* 560 */       ffxmsg.call(5, 92448);
/* 561 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1459:
/*     */       
/* 568 */       if (F272093.call(MainMemory.getI32(paramInt3), i4, i7) >= 0) {
/*     */         break label1505;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 578 */       ffxmsg.call(5, 90336);
/* 579 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1505:
/*     */       
/* 586 */       if (MainMemory.getI32(i4) != 2004)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 596 */         if (MainMemory.getI32(i5) != 0) {
/*     */           break label1559;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 606 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1559:
/*     */       
/* 613 */       ffxmsg.call(5, 62752);
/* 614 */       ffxmsg.call(5, k);
/* 615 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1584:
/*     */       
/* 622 */       ffxmsg.call(5, 62720);
/* 623 */       ffxmsg.call(5, k);
/* 624 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1609:
/*     */       
/* 631 */       ffxmsg.call(5, 62688);
/* 632 */       ffxmsg.call(5, k);
/* 633 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1667;
/*     */       
/*     */       label1634:
/*     */       
/* 640 */       SystemLibrary.sprintf(m, 77536, new Object[] { Integer.valueOf(paramInt1) });
/* 641 */       ffxmsg.call(5, m);
/* 642 */       i = 104;
/*     */       
/*     */ 
/*     */       label1667:
/*     */       
/*     */ 
/* 648 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 653 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F272877.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */