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
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffinit
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3004;
/*  20 */   public static final Function _instance = new ffinit();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffinit() { super("ffinit", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  27 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = call(i, j, k);
/*  42 */     paramFrame.setI32(paramInt1, m);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*     */     
/*     */ 
/*  67 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       j = MainMemory.alloc(20);
/*  72 */       k = MainMemory.alloc(1025);
/*  73 */       m = MainMemory.alloc(1025);
/*  74 */       n = MainMemory.alloc(80);
/*  75 */       i1 = MainMemory.alloc(4);
/*  76 */       i7 = MainMemory.getI32(paramInt3);
/*  77 */       if (i7 <= 0) {
/*     */         break label125;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       i = i7;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label125:
/*     */       
/*  94 */       if (i7 != -106)
/*     */       {
/*     */ 
/*     */ 
/*  98 */         i7 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 105 */         MainMemory.setI32(paramInt3, 0);
/* 106 */         i7 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI32(paramInt1, 0);
/* 114 */       if (!MainMemory.getI1(459320)) {
/*     */         break label203;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       i4 = MainMemory.getI32(paramInt3);
/*     */       
/*     */       break label219;
/*     */       
/*     */       label203:
/*     */       
/* 130 */       i4 = fits_init_cfitsio.call();
/* 131 */       MainMemory.setI32(paramInt3, i4);
/*     */       
/*     */ 
/*     */ 
/*     */       label219:
/*     */       
/*     */ 
/*     */ 
/* 139 */       if (i4 <= 0) {
/*     */         break label250;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */       i = i4;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label250:
/*     */       
/* 156 */       i2 = MainMemory.getI8(paramInt2);
/* 157 */       if (i2 == 32) {
/* 158 */         i4 = 0;
/*     */       } else {
/*     */         break label321;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 171 */         i4 += 1;
/* 172 */         i3 = paramInt2 + i4;
/* 173 */         i2 = MainMemory.getI8(i3);
/* 174 */         if (i2 != 32) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       break label321;
/* 179 */       paramInt2 = i3;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label321:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 189 */       if (i2 != 0) {
/*     */         break label364;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       ffxmsg.call(5, 96224);
/* 200 */       MainMemory.setI32(paramInt3, 105);
/* 201 */       i = 105;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label364:
/*     */       
/* 208 */       if (i7 != 0) {
/*     */         break label484;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */       if (i2 != 33)
/*     */       {
/*     */ 
/*     */ 
/* 222 */         i7 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 230 */         paramInt2 += 1;
/* 231 */         i7 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */       ffourl.call(paramInt2, j, k, m, n, paramInt3);
/* 241 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 245 */         i3 = j;
/* 246 */         i4 = i7;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 254 */         ffxmsg.call(5, 105056);
/* 255 */         ffxmsg.call(5, paramInt2);
/* 256 */         i = MainMemory.getI32(paramInt3);
/*     */         
/*     */ 
/*     */         break label1955;
/*     */         
/*     */         label484:
/*     */         
/* 263 */         if (!MathUtils.ugt(SystemLibrary.strlen(paramInt2), 1024)) {
/*     */           break label535;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */         ffxmsg.call(5, 77472);
/* 274 */         MainMemory.setI32(paramInt3, 105);
/* 275 */         i = 105;
/*     */         
/*     */ 
/*     */         break label1955;
/*     */         
/*     */         label535:
/*     */         
/* 282 */         SystemLibrary.strcpy(k, paramInt2);
/* 283 */         MainMemory.setI64(j, 13281251761613158L);
/* 284 */         MainMemory.setI8(m, (byte)0);
/* 285 */         MainMemory.setI8(n, (byte)0);
/* 286 */         i3 = j;
/* 287 */         i4 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */       i5 = MainMemory.getI32Aligned(467208) + -1;
/* 298 */       i6 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 305 */         i7 = i5 - i6;
/* 306 */         if (i7 <= -1) {
/*     */           break label1928;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */         i6 += 1;
/* 317 */         if (SystemLibrary.strcmp(492288 + i7 * 84, i3) == 0) {
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
/* 328 */       MainMemory.setI32(paramInt3, 0);
/* 329 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */         ffinit_1105.call(k, i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 345 */       i8 = MainMemory.getI32(492288 + i7 * 84 + 48);
/* 346 */       if (i8 != 0) {
/*     */         break label748;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */       ffxmsg.call(5, 109472);
/* 357 */       ffxmsg.call(5, paramInt2);
/* 358 */       MainMemory.setI32(paramInt3, 105);
/* 359 */       i = 105;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label748:
/*     */       
/* 366 */       i4 = SystemLibrary.do_indirect(i8, k, i1);
/* 367 */       MainMemory.setI32(paramInt3, i4);
/* 368 */       if (i4 != 0) {
/*     */         break label1902;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 378 */       i3 = calloc.call(1, 8);
/* 379 */       MainMemory.setI32(paramInt1, i3);
/* 380 */       if (i3 != 0) {
/*     */         break label868;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */       SystemLibrary.do_indirect(MainMemory.getI32(492288 + i7 * 84 + 56), MainMemory.getI32(i1));
/* 391 */       ffxmsg.call(5, 127776);
/* 392 */       ffxmsg.call(5, paramInt2);
/* 393 */       MainMemory.setI32(paramInt3, 113);
/* 394 */       i = 113;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label868:
/*     */       
/* 401 */       MainMemory.setI32(i3 + 4, calloc.call(1, 1696));
/* 402 */       i9 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 403 */       if (i9 != 0) {
/*     */         break label976;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 413 */       SystemLibrary.do_indirect(MainMemory.getI32(492288 + i7 * 84 + 56), MainMemory.getI32(i1));
/* 414 */       ffxmsg.call(5, 127776);
/* 415 */       ffxmsg.call(5, paramInt2);
/* 416 */       free.call(MainMemory.getI32(paramInt1));
/* 417 */       MainMemory.setI32(paramInt1, 0);
/* 418 */       MainMemory.setI32(paramInt3, 113);
/* 419 */       i = 113;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label976:
/*     */       
/* 426 */       i4 = SystemLibrary.strlen(paramInt2) + 1;
/* 427 */       MainMemory.setI32(i9 + 12, malloc.call(i4 < 32 ? 32 : i4));
/* 428 */       i9 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 429 */       if (MainMemory.getI32(i9 + 12) != 0) {
/*     */         break label1121;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 439 */       SystemLibrary.do_indirect(MainMemory.getI32(492288 + i7 * 84 + 56), MainMemory.getI32(i1));
/* 440 */       ffxmsg.call(5, 112352);
/* 441 */       ffxmsg.call(5, paramInt2);
/* 442 */       free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/* 443 */       free.call(MainMemory.getI32(paramInt1));
/* 444 */       MainMemory.setI32(paramInt1, 0);
/* 445 */       MainMemory.setI32(paramInt3, 105);
/* 446 */       i = 105;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label1121:
/*     */       
/* 453 */       MainMemory.setI32(i9 + 84, calloc.call(1001, 8));
/* 454 */       i9 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 455 */       if (MainMemory.getI32(i9 + 84) != 0) {
/*     */         break label1267;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */       SystemLibrary.do_indirect(MainMemory.getI32(492288 + i7 * 84 + 56), MainMemory.getI32(i1));
/* 466 */       ffxmsg.call(5, 125216);
/* 467 */       ffxmsg.call(5, paramInt2);
/* 468 */       free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12));
/* 469 */       free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/* 470 */       free.call(MainMemory.getI32(paramInt1));
/* 471 */       MainMemory.setI32(paramInt1, 0);
/* 472 */       MainMemory.setI32(paramInt3, 113);
/* 473 */       i = 113;
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label1267:
/*     */       
/* 480 */       MainMemory.setI32(i9 + 1212, calloc.call(40, 2880));
/* 481 */       i9 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 482 */       if (MainMemory.getI32(i9 + 1212) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 487 */         i4 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 494 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + i7 * 84 + 56), MainMemory.getI32(i1));
/* 495 */         ffxmsg.call(5, 123424);
/* 496 */         ffxmsg.call(5, paramInt2);
/* 497 */         free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 84));
/* 498 */         free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12));
/* 499 */         free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/* 500 */         free.call(MainMemory.getI32(paramInt1));
/* 501 */         MainMemory.setI32(paramInt1, 0);
/* 502 */         MainMemory.setI32(paramInt3, 113);
/* 503 */         i = 113;
/*     */         
/*     */ 
/*     */         break label1955;
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/* 512 */         MainMemory.setI32(i9 + 1536 + (i4 << 2), i4);
/* 513 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 1216 + (i4 << 2), -1);
/* 514 */         i4 += 1;
/* 515 */         i9 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 516 */         if (i4 == 40) {
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
/* 528 */       MainMemory.setI32(i9 + 80, 1000);
/* 529 */       MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4), MainMemory.getI32(i1));
/* 530 */       MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 4, i7);
/* 531 */       SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12), paramInt2);
/* 532 */       MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 24, 0L);
/* 533 */       MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 32, 0L);
/* 534 */       MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 72, 1);
/* 535 */       MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 112, -1L);
/* 536 */       MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 60, -1);
/* 537 */       MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 8, 1);
/* 538 */       MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 16, 555);
/* 539 */       ffldrc.call(MainMemory.getI32(paramInt1), 0, 1, paramInt3);
/* 540 */       i10 = MainMemory.getI32(paramInt1);
/* 541 */       i9 = MainMemory.getI32(i10 + 4);
/* 542 */       if (MainMemory.getI32(paramInt3) > 0) {
/*     */         break label1823;
/*     */       } else {
/* 545 */         i7 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 554 */         i11 = 491008 + (i7 << 2);
/* 555 */         if (i7 >= 300) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 565 */         if (MainMemory.getI32(i11) != 0) {
/*     */           break label1807;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 575 */         MainMemory.setI32(i11, i9);
/* 576 */         break;
/*     */         
/*     */         label1807:
/*     */         
/* 580 */         i7 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label1823:
/*     */       
/* 586 */       if (MainMemory.getI8(m) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 596 */         ffoptplt.call(i10, m, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 602 */       if (MainMemory.getI8(n) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 612 */         ffparsecompspec.call(MainMemory.getI32(paramInt1), n, paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 618 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label1902:
/*     */       
/* 625 */       ffxmsg.call(5, 102816);
/* 626 */       ffxmsg.call(5, paramInt2);
/* 627 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */       break label1955;
/*     */       
/*     */       label1928:
/*     */       
/* 634 */       MainMemory.setI32(paramInt3, 124);
/* 635 */       ffxmsg.call(5, 105120);
/* 636 */       ffxmsg.call(5, paramInt2);
/* 637 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */       label1955:
/*     */       
/*     */ 
/* 643 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 648 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffinit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */