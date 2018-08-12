/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F428690 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3680;
/*  11 */   public static final Function _instance = new F428690();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F428690() { super("F428690", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
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
/*  61 */     short s = 0;
/*  62 */     int i17 = 0;
/*  63 */     int i18 = 0;
/*  64 */     int i19 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       i10 = MainMemory.getI16(paramInt2 + 2);
/*  71 */       i13 = i10 == 0 ? 1 : 0;
/*  72 */       if (paramInt3 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         i8 = i13 != 0 ? 3 : 4;
/*  83 */         i9 = i13 != 0 ? 138 : 7;
/*  84 */         i11 = i10 & 0xFFFF;
/*  85 */         i = paramInt1 + 2754;
/*  86 */         j = paramInt1 + 5820;
/*  87 */         k = paramInt1 + 2752;
/*  88 */         m = paramInt1 + 5816;
/*  89 */         n = paramInt1 + 8;
/*  90 */         i1 = paramInt1 + 20;
/*  91 */         i2 = paramInt1 + 2758;
/*  92 */         i3 = paramInt1 + 2756;
/*  93 */         i4 = paramInt1 + 2750;
/*  94 */         i5 = paramInt1 + 2748;
/*  95 */         i6 = i8;
/*  96 */         i16 = i9;
/*  97 */         i7 = 0;
/*  98 */         i8 = 1;
/*  99 */         i17 = -1;
/* 100 */         i9 = i11;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 112 */         i10 = MainMemory.getI16(paramInt2 + (i8 << 2) + 2);
/* 113 */         i11 = i10 & 0xFFFF;
/* 114 */         i12 = i7 + 1;
/* 115 */         i13 = i9 == i11 ? 1 : 0;
/* 116 */         if ((i12 < i16) && (i13 != 0)) {
/* 117 */           i9 = i17;
/* 118 */           i7 = i12;
/* 119 */           i12 = i16;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 130 */           if (i12 >= i6) {
/*     */             break label627;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */           i14 = paramInt1 + 2684 + (i9 << 2) + 2;
/* 141 */           i15 = paramInt1 + 2684 + (i9 << 2);
/* 142 */           i7 = MainMemory.getI32(j);
/* 143 */           i17 = i7;
/* 144 */           i7 = 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 152 */             i6 = MainMemory.getI16(i14) & 0xFFFF;
/* 153 */             if (i17 <= 16 - i6) {
/*     */               break label546;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */             i16 = MainMemory.getI16(i15) & 0xFFFF;
/* 164 */             s = MathUtils.or((short)(i16 << i17), MainMemory.getI16(m));
/* 165 */             MainMemory.setI16(m, s);
/* 166 */             i17 = MainMemory.getI32(i1);
/* 167 */             MainMemory.setI8(MainMemory.getI32(n) + i17, (byte)s);
/* 168 */             i18 = i17 + 1;
/* 169 */             MainMemory.setI32(i1, i18);
/* 170 */             MainMemory.setI8(MainMemory.getI32(n) + i18, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 171 */             MainMemory.setI32(i1, i17 + 2);
/* 172 */             i17 = MainMemory.getI32(j);
/* 173 */             MainMemory.setI16(m, (short)(i16 >>> 16 - i17));
/* 174 */             i6 = i6 + -16 + i17;
/*     */             
/*     */             break label583;
/*     */             
/*     */             label546:
/*     */             
/* 180 */             MainMemory.setI16(m, MathUtils.or((short)((MainMemory.getI16(i15) & 0xFFFF) << i17), MainMemory.getI16(m)));
/* 181 */             i6 = i17 + i6;
/*     */             
/*     */ 
/*     */ 
/*     */             label583:
/*     */             
/*     */ 
/*     */ 
/* 189 */             MainMemory.setI32(j, i6);
/* 190 */             if (i7 == i12) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */             i7 += 1;
/* 201 */             i17 = i6;
/*     */           }
/*     */           
/*     */ 
/*     */           label627:
/*     */           
/* 207 */           if (i9 != 0) {
/*     */             break label1501;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           if (i12 >= 11) {
/*     */             break label1082;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */           i12 = MainMemory.getI16(i) & 0xFFFF;
/* 228 */           i16 = MainMemory.getI32(j);
/* 229 */           if (i16 <= 16 - i12) {
/*     */             break label847;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */           i6 = MainMemory.getI16(k) & 0xFFFF;
/* 240 */           s = MathUtils.or((short)(i6 << i16), MainMemory.getI16(m));
/* 241 */           MainMemory.setI16(m, s);
/* 242 */           i16 = MainMemory.getI32(i1);
/* 243 */           MainMemory.setI8(MainMemory.getI32(n) + i16, (byte)s);
/* 244 */           i17 = i16 + 1;
/* 245 */           MainMemory.setI32(i1, i17);
/* 246 */           MainMemory.setI8(MainMemory.getI32(n) + i17, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 247 */           MainMemory.setI32(i1, i16 + 2);
/* 248 */           i16 = MainMemory.getI32(j);
/* 249 */           s = (short)(i6 >>> 16 - i16);
/* 250 */           MainMemory.setI16(m, s);
/* 251 */           i12 = i12 + -16 + i16;
/*     */           
/*     */ 
/*     */           break label888;
/*     */           
/*     */           label847:
/*     */           
/* 258 */           s = MathUtils.or((short)((MainMemory.getI16(k) & 0xFFFF) << i16), MainMemory.getI16(m));
/* 259 */           MainMemory.setI16(m, s);
/* 260 */           i12 = i16 + i12;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label888:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 270 */           MainMemory.setI32(j, i12);
/* 271 */           i19 = i12 > 13 ? 1 : 0;
/* 272 */           i7 = i7 + 65534 & 0xFFFF;
/* 273 */           s = MathUtils.or((short)(i7 << i12), s);
/* 274 */           MainMemory.setI16(m, s);
/* 275 */           if (i19 == 0) {
/*     */             break label1063;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */           i12 = MainMemory.getI32(i1);
/* 286 */           MainMemory.setI8(MainMemory.getI32(n) + i12, (byte)s);
/* 287 */           i6 = i12 + 1;
/* 288 */           MainMemory.setI32(i1, i6);
/* 289 */           MainMemory.setI8(MainMemory.getI32(n) + i6, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 290 */           MainMemory.setI32(i1, i12 + 2);
/* 291 */           i12 = MainMemory.getI32(j);
/* 292 */           MainMemory.setI16(m, (short)(i7 >>> 16 - i12));
/* 293 */           MainMemory.setI32(j, i12 + -13);
/*     */           
/*     */           break label2216;
/*     */           
/*     */           label1063:
/* 298 */           MainMemory.setI32(j, i12 + 3);
/*     */           
/*     */           break label2216;
/*     */           
/*     */           label1082:
/* 303 */           i12 = MainMemory.getI16(i2) & 0xFFFF;
/* 304 */           i16 = MainMemory.getI32(j);
/* 305 */           if (i16 <= 16 - i12) {
/*     */             break label1265;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */           i6 = MainMemory.getI16(i3) & 0xFFFF;
/* 316 */           s = MathUtils.or((short)(i6 << i16), MainMemory.getI16(m));
/* 317 */           MainMemory.setI16(m, s);
/* 318 */           i16 = MainMemory.getI32(i1);
/* 319 */           MainMemory.setI8(MainMemory.getI32(n) + i16, (byte)s);
/* 320 */           i17 = i16 + 1;
/* 321 */           MainMemory.setI32(i1, i17);
/* 322 */           MainMemory.setI8(MainMemory.getI32(n) + i17, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 323 */           MainMemory.setI32(i1, i16 + 2);
/* 324 */           i16 = MainMemory.getI32(j);
/* 325 */           s = (short)(i6 >>> 16 - i16);
/* 326 */           MainMemory.setI16(m, s);
/* 327 */           i12 = i12 + -16 + i16;
/*     */           
/*     */ 
/*     */           break label1306;
/*     */           
/*     */           label1265:
/*     */           
/* 334 */           s = MathUtils.or((short)((MainMemory.getI16(i3) & 0xFFFF) << i16), MainMemory.getI16(m));
/* 335 */           MainMemory.setI16(m, s);
/* 336 */           i12 = i16 + i12;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1306:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 346 */           MainMemory.setI32(j, i12);
/* 347 */           i19 = i12 > 9 ? 1 : 0;
/* 348 */           i7 = i7 + 65526 & 0xFFFF;
/* 349 */           s = MathUtils.or((short)(i7 << i12), s);
/* 350 */           MainMemory.setI16(m, s);
/* 351 */           if (i19 == 0) {
/*     */             break label1481;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */           i12 = MainMemory.getI32(i1);
/* 362 */           MainMemory.setI8(MainMemory.getI32(n) + i12, (byte)s);
/* 363 */           i6 = i12 + 1;
/* 364 */           MainMemory.setI32(i1, i6);
/* 365 */           MainMemory.setI8(MainMemory.getI32(n) + i6, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 366 */           MainMemory.setI32(i1, i12 + 2);
/* 367 */           i12 = MainMemory.getI32(j);
/* 368 */           MainMemory.setI16(m, (short)(i7 >>> 16 - i12));
/* 369 */           MainMemory.setI32(j, i12 + -9);
/*     */           
/*     */           break label2216;
/*     */           
/*     */           label1481:
/* 374 */           MainMemory.setI32(j, i12 + 7);
/*     */           
/*     */           break label2216;
/*     */           
/*     */           label1501:
/* 379 */           if (i9 != i17) {
/*     */             break label1546;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 389 */           i7 = MainMemory.getI32(j);
/* 390 */           i16 = i7;
/* 391 */           i7 = i12;
/*     */           
/*     */           break label1810;
/*     */           
/*     */           label1546:
/* 396 */           i12 = MainMemory.getI16(paramInt1 + 2684 + (i9 << 2) + 2) & 0xFFFF;
/* 397 */           i16 = MainMemory.getI32(j);
/* 398 */           if (i16 <= 16 - i12) {
/*     */             break label1754;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */           i6 = MainMemory.getI16(paramInt1 + 2684 + (i9 << 2)) & 0xFFFF;
/* 409 */           s = MathUtils.or((short)(i6 << i16), MainMemory.getI16(m));
/* 410 */           MainMemory.setI16(m, s);
/* 411 */           i16 = MainMemory.getI32(i1);
/* 412 */           MainMemory.setI8(MainMemory.getI32(n) + i16, (byte)s);
/* 413 */           i17 = i16 + 1;
/* 414 */           MainMemory.setI32(i1, i17);
/* 415 */           MainMemory.setI8(MainMemory.getI32(n) + i17, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 416 */           MainMemory.setI32(i1, i16 + 2);
/* 417 */           i16 = MainMemory.getI32(j);
/* 418 */           MainMemory.setI16(m, (short)(i6 >>> 16 - i16));
/* 419 */           i12 = i12 + -16 + i16;
/* 420 */           MainMemory.setI32(j, i12);
/* 421 */           i16 = i12;
/*     */           
/*     */           break label1810;
/*     */           
/*     */           label1754:
/*     */           
/* 427 */           MainMemory.setI16(m, MathUtils.or((short)((MainMemory.getI16(paramInt1 + 2684 + (i9 << 2)) & 0xFFFF) << i16), MainMemory.getI16(m)));
/* 428 */           i12 = i16 + i12;
/* 429 */           MainMemory.setI32(j, i12);
/* 430 */           i16 = i12;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1810:
/*     */           
/*     */ 
/*     */ 
/* 439 */           i12 = MainMemory.getI16(i4) & 0xFFFF;
/* 440 */           if (i16 <= 16 - i12) {
/*     */             break label1986;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 450 */           i6 = MainMemory.getI16(i5) & 0xFFFF;
/* 451 */           s = MathUtils.or((short)(i6 << i16), MainMemory.getI16(m));
/* 452 */           MainMemory.setI16(m, s);
/* 453 */           i16 = MainMemory.getI32(i1);
/* 454 */           MainMemory.setI8(MainMemory.getI32(n) + i16, (byte)s);
/* 455 */           i17 = i16 + 1;
/* 456 */           MainMemory.setI32(i1, i17);
/* 457 */           MainMemory.setI8(MainMemory.getI32(n) + i17, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 458 */           MainMemory.setI32(i1, i16 + 2);
/* 459 */           i16 = MainMemory.getI32(j);
/* 460 */           s = (short)(i6 >>> 16 - i16);
/* 461 */           MainMemory.setI16(m, s);
/* 462 */           i12 = i12 + -16 + i16;
/*     */           
/*     */ 
/*     */           break label2027;
/*     */           
/*     */           label1986:
/*     */           
/* 469 */           s = MathUtils.or((short)((MainMemory.getI16(i5) & 0xFFFF) << i16), MainMemory.getI16(m));
/* 470 */           MainMemory.setI16(m, s);
/* 471 */           i12 = i16 + i12;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label2027:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 481 */           MainMemory.setI32(j, i12);
/* 482 */           i19 = i12 > 14 ? 1 : 0;
/* 483 */           i7 = i7 + 65533 & 0xFFFF;
/* 484 */           s = MathUtils.or((short)(i7 << i12), s);
/* 485 */           MainMemory.setI16(m, s);
/* 486 */           if (i19 == 0) {
/*     */             break label2202;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 496 */           i12 = MainMemory.getI32(i1);
/* 497 */           MainMemory.setI8(MainMemory.getI32(n) + i12, (byte)s);
/* 498 */           i6 = i12 + 1;
/* 499 */           MainMemory.setI32(i1, i6);
/* 500 */           MainMemory.setI8(MainMemory.getI32(n) + i6, (byte)MathUtils.lshr(MainMemory.getI16(m), 8));
/* 501 */           MainMemory.setI32(i1, i12 + 2);
/* 502 */           i12 = MainMemory.getI32(j);
/* 503 */           MainMemory.setI16(m, (short)(i7 >>> 16 - i12));
/* 504 */           MainMemory.setI32(j, i12 + -14);
/*     */           
/*     */           break label2216;
/*     */           
/*     */           label2202:
/* 509 */           MainMemory.setI32(j, i12 + 2);
/*     */           
/*     */ 
/*     */           label2216:
/*     */           
/*     */ 
/* 515 */           if (i10 == 0)
/*     */           {
/* 517 */             i7 = 0;
/* 518 */             i12 = 138;
/* 519 */             i6 = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 529 */           else if (i13 != 0)
/*     */           {
/* 531 */             i7 = 0;
/* 532 */             i12 = 6;
/* 533 */             i6 = 3;
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
/* 544 */             i7 = 0;
/* 545 */             i12 = 7;
/* 546 */             i6 = 4;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 556 */         if (i8 <= paramInt3) {
/*     */           break label2311;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 566 */         break;
/*     */         
/*     */ 
/*     */         label2311:
/*     */         
/*     */ 
/* 572 */         i8 += 1;
/*     */         
/* 574 */         i16 = i12;
/*     */         
/*     */ 
/* 577 */         i17 = i9;
/* 578 */         i9 = i11;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F428690.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */