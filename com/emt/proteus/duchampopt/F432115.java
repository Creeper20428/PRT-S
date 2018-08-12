/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F432115
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3692;
/*  14 */   public static final Function _instance = new F432115();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F432115() { super("F432115", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = call(i, j);
/*  33 */     paramFrame.setI32(paramInt1, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     int i9 = 0;
/*  54 */     int i10 = 0;
/*  55 */     int i11 = 0;
/*  56 */     int i12 = 0;
/*  57 */     int i13 = 0;
/*  58 */     int i14 = 0;
/*  59 */     int i15 = 0;
/*  60 */     int i16 = 0;
/*  61 */     int i17 = 0;
/*  62 */     int i18 = 0;
/*  63 */     int i19 = 0;
/*  64 */     int i20 = 0;
/*  65 */     int i21 = 0;
/*  66 */     int i22 = 0;
/*  67 */     int i25 = 0;
/*  68 */     int i27 = 0;
/*  69 */     int i28 = 0;
/*  70 */     int i29 = 0;
/*  71 */     int i30 = 0;
/*  72 */     int i31 = 0;
/*  73 */     int i32 = 0;
/*  74 */     int i33 = 0;
/*  75 */     int i34 = 0;
/*  76 */     int i35 = 0;
/*  77 */     int i36 = 0;
/*  78 */     int i37 = 0;
/*  79 */     int i38 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  85 */       j = paramInt1 + 116;
/*  86 */       k = paramInt2 == 0 ? 1 : 0;
/*  87 */       m = paramInt1 + 72;
/*  88 */       n = paramInt1 + 88;
/*  89 */       i1 = paramInt1 + 56;
/*  90 */       i2 = paramInt1 + 108;
/*  91 */       i3 = paramInt1 + 84;
/*  92 */       i4 = paramInt1 + 64;
/*  93 */       i5 = paramInt1 + 52;
/*  94 */       i6 = paramInt1 + 68;
/*  95 */       i7 = paramInt1 + 96;
/*  96 */       i8 = paramInt1 + 120;
/*  97 */       i9 = paramInt1 + 112;
/*  98 */       i10 = paramInt1 + 100;
/*  99 */       i11 = paramInt1 + 104;
/* 100 */       i12 = paramInt1 + 5796;
/* 101 */       i13 = paramInt1 + 5792;
/* 102 */       i14 = paramInt1 + 5784;
/* 103 */       i15 = paramInt1 + 5788;
/* 104 */       i16 = paramInt1 + 92;
/* 105 */       i17 = paramInt1 + 128;
/* 106 */       i18 = paramInt1 + 44;
/* 107 */       i19 = paramInt1 + 136;
/* 108 */       i20 = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 114 */         i21 = MainMemory.getI32(j);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 122 */           if (!MathUtils.ult(i21, 262)) {
/*     */             break label740;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */           F431145.call(paramInt1);
/* 134 */           i21 = MainMemory.getI32(j);
/* 135 */           if ((MathUtils.ult(i21, 262)) && (k != 0)) {
/*     */             break label2343;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */           if (i21 != 0) {
/*     */             break label740;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */           if (MainMemory.getI32(i11) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */             i22 = MainMemory.getI8(MainMemory.getI32(i1) + (MainMemory.getI32(i2) + -1));
/* 167 */             MainMemory.setI16(MainMemory.getI32(i12) + (MainMemory.getI32(i13) << 1), (short)0);
/* 168 */             i21 = MainMemory.getI32(i13);
/* 169 */             MainMemory.setI8(MainMemory.getI32(i14) + i21, i22);
/* 170 */             MainMemory.setI32(i13, i21 + 1);
/* 171 */             i27 = paramInt1 + 148 + ((i22 & 0xFF) << 2);
/* 172 */             MainMemory.setI16(i27, (short)(MainMemory.getI16(i27) + 1));
/* 173 */             MainMemory.setI32(i11, 0);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 179 */           k = paramInt2 == 4 ? 1 : 0;
/* 180 */           paramInt2 = k != 0 ? 1 : 0;
/* 181 */           i28 = MainMemory.getI32(i16);
/* 182 */           i21 = MainMemory.getI32(i2) - i28;
/* 183 */           if (i28 <= -1)
/*     */           {
/*     */ 
/*     */ 
/* 187 */             i34 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 194 */             i34 = MainMemory.getI32(i1) + i28;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */           _tr_flush_block.call(i20, i34, i21, paramInt2);
/* 203 */           MainMemory.setI32(i16, MainMemory.getI32(i2));
/* 204 */           i35 = MainMemory.getI32(paramInt1);
/* 205 */           i36 = i35 + 28;
/* 206 */           i37 = MainMemory.getI32(i36);
/* 207 */           paramInt2 = MainMemory.getI32(i37 + 20);
/* 208 */           i2 = i35 + 16;
/* 209 */           i21 = MainMemory.getI32(i2);
/* 210 */           paramInt2 = MathUtils.ult(i21, paramInt2) ? i21 : paramInt2;
/* 211 */           if (paramInt2 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */             F432115_173.call(i36, i2, i37, i35, paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 227 */           if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) != 0) {
/*     */             break label719;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */           i = k != 0 ? 2 : 0;
/*     */           
/*     */ 
/*     */           break label2350;
/*     */           
/*     */           label719:
/*     */           
/* 244 */           i = k != 0 ? 3 : 1;
/*     */           
/*     */ 
/*     */           break label2350;
/*     */           
/*     */ 
/*     */           label740:
/*     */           
/* 252 */           if (!MathUtils.ugt(i21, 2)) {
/*     */             break label1119;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */           i21 = MainMemory.getI32(i2);
/* 263 */           i28 = (MainMemory.getI8(MainMemory.getI32(i1) + (i21 + 2)) & 0xFF ^ MainMemory.getI32(m) << MainMemory.getI32(n)) & MainMemory.getI32(i3);
/* 264 */           MainMemory.setI32(m, i28);
/* 265 */           i25 = MainMemory.getI16(MainMemory.getI32(i6) + (i28 << 1));
/* 266 */           MainMemory.setI16(MainMemory.getI32(i4) + ((MainMemory.getI32(i5) & i21) << 1), i25);
/* 267 */           i21 = i25 & 0xFFFF;
/* 268 */           MainMemory.setI16(MainMemory.getI32(i6) + (MainMemory.getI32(m) << 1), (short)MainMemory.getI32(i2));
/* 269 */           i28 = MainMemory.getI32(i7);
/* 270 */           MainMemory.setI32(i8, i28);
/* 271 */           MainMemory.setI32(i10, MainMemory.getI32(i9));
/* 272 */           MainMemory.setI32(i7, 2);
/* 273 */           if (i25 == 0) {
/* 274 */             i21 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 284 */           else if (!MathUtils.ult(i28, MainMemory.getI32(i17)))
/*     */           {
/*     */ 
/*     */ 
/* 288 */             i21 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 295 */           else if (MathUtils.ugt(MainMemory.getI32(i2) - i21, MainMemory.getI32(i18) + 65274)) {
/* 296 */             i21 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 306 */             i21 = F430905.call(paramInt1, i21);
/* 307 */             MainMemory.setI32(i7, i21);
/* 308 */             if (!MathUtils.ult(i21, 6)) {
/*     */               break label1153;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */             if (MainMemory.getI32(i19) != 1)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */               if (i21 != 3) {
/*     */                 break label1153;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */               if (!MathUtils.ugt(MainMemory.getI32(i2) - MainMemory.getI32(i9), 4096)) {
/*     */                 break label1153;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */             MainMemory.setI32(i7, 2);
/* 352 */             i21 = 2;
/*     */             
/*     */             break label1153;
/*     */             
/*     */             label1119:
/* 357 */             MainMemory.setI32(i8, MainMemory.getI32(i7));
/* 358 */             MainMemory.setI32(i10, MainMemory.getI32(i9));
/* 359 */             MainMemory.setI32(i7, 2);
/* 360 */             i21 = 2;
/*     */           }
/*     */           
/*     */ 
/*     */           label1153:
/*     */           
/*     */ 
/* 367 */           i28 = MainMemory.getI32(i8);
/* 368 */           if ((!MathUtils.ult(i28, 3)) && (!MathUtils.ugt(i21, i28))) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 378 */           if (MainMemory.getI32(i11) != 0) {
/*     */             break label1255;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */           MainMemory.setI32(i11, 1);
/* 389 */           MainMemory.setI32(i2, MainMemory.getI32(i2) + 1);
/* 390 */           i21 = MainMemory.getI32(j) + -1;
/* 391 */           MainMemory.setI32(j, i21);
/*     */           
/* 393 */           continue;
/*     */           
/*     */           label1255:
/*     */           
/* 397 */           int i23 = MainMemory.getI8(MainMemory.getI32(i1) + (MainMemory.getI32(i2) + -1));
/* 398 */           MainMemory.setI16(MainMemory.getI32(i12) + (MainMemory.getI32(i13) << 1), (short)0);
/* 399 */           i21 = MainMemory.getI32(i13);
/* 400 */           MainMemory.setI8(MainMemory.getI32(i14) + i21, i23);
/* 401 */           MainMemory.setI32(i13, i21 + 1);
/* 402 */           i27 = paramInt1 + 148 + ((i23 & 0xFF) << 2);
/* 403 */           MainMemory.setI16(i27, (short)(MainMemory.getI16(i27) + 1));
/* 404 */           if (MainMemory.getI32(i13) != MainMemory.getI32(i15) + -1) {
/*     */             break label1546;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 414 */           i28 = MainMemory.getI32(i16);
/* 415 */           i21 = MainMemory.getI32(i2) - i28;
/* 416 */           if (i28 <= -1)
/*     */           {
/*     */ 
/*     */ 
/* 420 */             i34 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 427 */             i34 = MainMemory.getI32(i1) + i28;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 435 */           _tr_flush_block.call(i20, i34, i21, 0);
/* 436 */           MainMemory.setI32(i16, MainMemory.getI32(i2));
/* 437 */           i35 = MainMemory.getI32(paramInt1);
/* 438 */           i36 = i35 + 28;
/* 439 */           i37 = MainMemory.getI32(i36);
/* 440 */           i21 = MainMemory.getI32(i37 + 20);
/* 441 */           i38 = i35 + 16;
/* 442 */           i28 = MainMemory.getI32(i38);
/* 443 */           i21 = MathUtils.ult(i28, i21) ? i28 : i21;
/* 444 */           if (i21 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 454 */             F432115_171.call(i37, i35, i38, i21, i36);
/*     */           }
/*     */           
/*     */ 
/*     */           label1546:
/*     */           
/* 460 */           MainMemory.setI32(i2, MainMemory.getI32(i2) + 1);
/* 461 */           i21 = MainMemory.getI32(j) + -1;
/* 462 */           MainMemory.setI32(j, i21);
/* 463 */           if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) == 0) { break label2343;
/* 464 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 473 */         i29 = MainMemory.getI32(i2);
/* 474 */         i21 = i29 + -3 + MainMemory.getI32(j);
/* 475 */         int i24 = (byte)((byte)i28 + -3);
/* 476 */         int i26 = (short)((short)i29 - (short)MainMemory.getI32(i10));
/* 477 */         MainMemory.setI16(MainMemory.getI32(i12) + (MainMemory.getI32(i13) << 1), (short)(i26 + -1));
/* 478 */         i28 = MainMemory.getI32(i13);
/* 479 */         MainMemory.setI8(MainMemory.getI32(i14) + i28, i24);
/* 480 */         MainMemory.setI32(i13, i28 + 1);
/* 481 */         i26 = (short)(i26 + -2);
/* 482 */         i27 = paramInt1 + 148 + ((MainMemory.getI8(148416 + (i24 & 0xFF)) & 0xFF) + 257 << 2);
/* 483 */         MainMemory.setI16(i27, (short)(MainMemory.getI16(i27) + 1));
/* 484 */         if (!MathUtils.ult(i26, (short)256)) {
/*     */           break label1786;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 494 */         i28 = i26 & 0xFFFF;
/*     */         
/*     */         break label1807;
/*     */         
/*     */         label1786:
/*     */         
/* 500 */         i28 = (MathUtils.lshr(i26, 7) & 0xFFFF) + 256;
/*     */         
/*     */ 
/*     */ 
/*     */         label1807:
/*     */         
/*     */ 
/*     */ 
/* 508 */         i27 = paramInt1 + 2440 + ((MainMemory.getI8(151392 + i28) & 0xFF) << 2);
/* 509 */         MainMemory.setI16(i27, (short)(MainMemory.getI16(i27) + 1));
/* 510 */         i28 = MainMemory.getI32(i13);
/* 511 */         i29 = MainMemory.getI32(i15) + -1;
/* 512 */         i32 = MainMemory.getI32(i8);
/* 513 */         MainMemory.setI32(j, MainMemory.getI32(j) + 1 - i32);
/* 514 */         i32 += -2;
/* 515 */         MainMemory.setI32(i8, i32);
/* 516 */         i30 = i32;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 523 */           i31 = MainMemory.getI32(i2);
/* 524 */           i32 = i31 + 1;
/* 525 */           MainMemory.setI32(i2, i32);
/* 526 */           if (MathUtils.ugt(i32, i21)) {
/* 527 */             i32 = i30;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 537 */             i30 = (MainMemory.getI8(MainMemory.getI32(i1) + (i31 + 3)) & 0xFF ^ MainMemory.getI32(m) << MainMemory.getI32(n)) & MainMemory.getI32(i3);
/* 538 */             MainMemory.setI32(m, i30);
/* 539 */             MainMemory.setI16(MainMemory.getI32(i4) + ((MainMemory.getI32(i5) & i32) << 1), MainMemory.getI16(MainMemory.getI32(i6) + (i30 << 1)));
/* 540 */             MainMemory.setI16(MainMemory.getI32(i6) + (MainMemory.getI32(m) << 1), (short)MainMemory.getI32(i2));
/* 541 */             i32 = MainMemory.getI32(i8);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 549 */           i32 += -1;
/* 550 */           MainMemory.setI32(i8, i32);
/* 551 */           if (i32 == 0) {
/*     */             break;
/*     */           }
/*     */           
/* 555 */           i30 = i32;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 562 */         i33 = i28 == i29 ? 1 : 0;
/* 563 */         MainMemory.setI32(i11, 0);
/* 564 */         MainMemory.setI32(i7, 2);
/* 565 */         i21 = MainMemory.getI32(i2) + 1;
/* 566 */         MainMemory.setI32(i2, i21);
/* 567 */         if (i33 == 0) {}
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 577 */         i28 = MainMemory.getI32(i16);
/* 578 */         i21 -= i28;
/* 579 */         if (i28 <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 583 */           i34 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 590 */           i34 = MainMemory.getI32(i1) + i28;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 598 */         _tr_flush_block.call(i20, i34, i21, 0);
/* 599 */         MainMemory.setI32(i16, MainMemory.getI32(i2));
/* 600 */         i35 = MainMemory.getI32(paramInt1);
/* 601 */         i36 = i35 + 28;
/* 602 */         i37 = MainMemory.getI32(i36);
/* 603 */         i21 = MainMemory.getI32(i37 + 20);
/* 604 */         i38 = i35 + 16;
/* 605 */         i28 = MainMemory.getI32(i38);
/* 606 */         i21 = MathUtils.ult(i28, i21) ? i28 : i21;
/* 607 */         if (i21 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 617 */           F432115_172.call(i36, i37, i38, i35, i21);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 623 */         if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) == 0) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label2343:
/*     */       
/*     */ 
/* 633 */       i = 0;
/*     */       
/*     */ 
/*     */       label2350:
/*     */       
/*     */ 
/* 639 */       int i39 = i; return i39;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F432115.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */