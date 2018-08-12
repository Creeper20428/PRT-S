/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F431680
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3691;
/*  14 */   public static final Function _instance = new F431680();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F431680() { super("F431680", 2, false); }
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
/*  62 */     int i19 = 0;
/*  63 */     int i21 = 0;
/*  64 */     int i22 = 0;
/*  65 */     int i23 = 0;
/*  66 */     int i24 = 0;
/*  67 */     int i25 = 0;
/*  68 */     int i26 = 0;
/*  69 */     int i27 = 0;
/*  70 */     int i28 = 0;
/*  71 */     int i29 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       j = paramInt1 + 116;
/*  78 */       k = paramInt2 == 0 ? 1 : 0;
/*  79 */       m = paramInt1 + 72;
/*  80 */       n = paramInt1 + 88;
/*  81 */       i1 = paramInt1 + 56;
/*  82 */       i2 = paramInt1 + 108;
/*  83 */       i3 = paramInt1 + 84;
/*  84 */       i4 = paramInt1 + 64;
/*  85 */       i5 = paramInt1 + 52;
/*  86 */       i6 = paramInt1 + 68;
/*  87 */       i7 = paramInt1 + 44;
/*  88 */       i8 = paramInt1 + 96;
/*  89 */       i9 = paramInt1 + 112;
/*  90 */       i10 = paramInt1 + 5796;
/*  91 */       i11 = paramInt1 + 5792;
/*  92 */       i12 = paramInt1 + 5784;
/*  93 */       i13 = paramInt1 + 5788;
/*  94 */       i14 = paramInt1 + 128;
/*  95 */       i15 = paramInt1 + 92;
/*  96 */       i16 = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 102 */         i22 = MainMemory.getI32(j);
/* 103 */         if (!MathUtils.ult(i22, 262)) {
/*     */           break label564;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         F431145.call(paramInt1);
/* 115 */         i22 = MainMemory.getI32(j);
/* 116 */         if ((MathUtils.ult(i22, 262)) && (k != 0)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         if (i22 != 0) {
/*     */           break label564;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         k = paramInt2 == 4 ? 1 : 0;
/* 138 */         paramInt2 = k != 0 ? 1 : 0;
/* 139 */         i29 = MainMemory.getI32(i15);
/* 140 */         i22 = MainMemory.getI32(i2) - i29;
/* 141 */         if (i29 <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 145 */           i23 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 152 */           i23 = MainMemory.getI32(i1) + i29;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         _tr_flush_block.call(i16, i23, i22, paramInt2);
/* 161 */         MainMemory.setI32(i15, MainMemory.getI32(i2));
/* 162 */         i25 = MainMemory.getI32(paramInt1);
/* 163 */         i26 = i25 + 28;
/* 164 */         i27 = MainMemory.getI32(i26);
/* 165 */         paramInt2 = MainMemory.getI32(i27 + 20);
/* 166 */         i2 = i25 + 16;
/* 167 */         i22 = MainMemory.getI32(i2);
/* 168 */         paramInt2 = MathUtils.ult(i22, paramInt2) ? i22 : paramInt2;
/* 169 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */           F431680_169.call(i25, i2, i27, i26, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 185 */         if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) != 0) {
/*     */           break label543;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         i = k != 0 ? 2 : 0;
/*     */         
/*     */ 
/*     */         break label1753;
/*     */         
/*     */         label543:
/*     */         
/* 202 */         i = k != 0 ? 3 : 1;
/*     */         
/*     */ 
/*     */         break label1753;
/*     */         
/*     */ 
/*     */         label564:
/*     */         
/* 210 */         if (!MathUtils.ugt(i22, 2)) {
/*     */           break label775;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         i22 = MainMemory.getI32(i2);
/* 221 */         i29 = (MainMemory.getI8(MainMemory.getI32(i1) + (i22 + 2)) & 0xFF ^ MainMemory.getI32(m) << MainMemory.getI32(n)) & MainMemory.getI32(i3);
/* 222 */         MainMemory.setI32(m, i29);
/* 223 */         i19 = MainMemory.getI16(MainMemory.getI32(i6) + (i29 << 1));
/* 224 */         MainMemory.setI16(MainMemory.getI32(i4) + ((MainMemory.getI32(i5) & i22) << 1), i19);
/* 225 */         i22 = i19 & 0xFFFF;
/* 226 */         MainMemory.setI16(MainMemory.getI32(i6) + (MainMemory.getI32(m) << 1), (short)MainMemory.getI32(i2));
/* 227 */         if (i19 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */           if (!MathUtils.ugt(MainMemory.getI32(i2) - i22, MainMemory.getI32(i7) + 65274))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */             i22 = F430905.call(paramInt1, i22);
/* 248 */             MainMemory.setI32(i8, i22);
/*     */             
/*     */             break label787;
/*     */           }
/*     */         }
/*     */         label775:
/* 254 */         i22 = MainMemory.getI32(i8);
/*     */         
/*     */ 
/*     */ 
/*     */         label787:
/*     */         
/*     */ 
/*     */ 
/* 262 */         if (!MathUtils.ugt(i22, 2)) {
/*     */           break label1394;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */         i17 = (byte)((byte)i22 + -3);
/* 273 */         int i20 = (short)((short)MainMemory.getI32(i2) - (short)MainMemory.getI32(i9));
/* 274 */         MainMemory.setI16(MainMemory.getI32(i10) + (MainMemory.getI32(i11) << 1), i20);
/* 275 */         i22 = MainMemory.getI32(i11);
/* 276 */         MainMemory.setI8(MainMemory.getI32(i12) + i22, i17);
/* 277 */         MainMemory.setI32(i11, i22 + 1);
/* 278 */         i20 = (short)(i20 + -1);
/* 279 */         i21 = paramInt1 + 148 + ((MainMemory.getI8(148416 + (i17 & 0xFF)) & 0xFF) + 257 << 2);
/* 280 */         MainMemory.setI16(i21, (short)(MainMemory.getI16(i21) + 1));
/* 281 */         if (!MathUtils.ult(i20, (short)256)) {
/*     */           break label972;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */         i22 = i20 & 0xFFFF;
/*     */         
/*     */         break label993;
/*     */         
/*     */         label972:
/*     */         
/* 297 */         i22 = (MathUtils.lshr(i20, 7) & 0xFFFF) + 256;
/*     */         
/*     */ 
/*     */ 
/*     */         label993:
/*     */         
/*     */ 
/*     */ 
/* 305 */         i21 = paramInt1 + 2440 + ((MainMemory.getI8(151392 + i22) & 0xFF) << 2);
/* 306 */         MainMemory.setI16(i21, (short)(MainMemory.getI16(i21) + 1));
/* 307 */         i22 = MainMemory.getI32(i11) == MainMemory.getI32(i13) + -1 ? 1 : 0;
/* 308 */         i29 = MainMemory.getI32(i8);
/* 309 */         i24 = MainMemory.getI32(j) - i29;
/* 310 */         MainMemory.setI32(j, i24);
/* 311 */         if ((!MathUtils.ugt(i29, MainMemory.getI32(i14))) && (!MathUtils.ult(i24, 3))) {
/*     */           break label1202;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */         i29 += MainMemory.getI32(i2);
/* 322 */         MainMemory.setI32(i2, i29);
/* 323 */         MainMemory.setI32(i8, 0);
/* 324 */         i23 = MainMemory.getI32(i1);
/* 325 */         i24 = MainMemory.getI8(i23 + i29) & 0xFF;
/* 326 */         MainMemory.setI32(m, i24);
/* 327 */         MainMemory.setI32(m, (MainMemory.getI8(i23 + (i29 + 1)) & 0xFF ^ i24 << MainMemory.getI32(n)) & MainMemory.getI32(i3));
/*     */         
/*     */ 
/*     */         break label1538;
/*     */         
/*     */         label1202:
/*     */         
/* 334 */         MainMemory.setI32(i8, i29 + -1);
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 340 */           i24 = MainMemory.getI32(i2);
/* 341 */           i29 = i24 + 1;
/* 342 */           MainMemory.setI32(i2, i29);
/* 343 */           i24 = (MainMemory.getI8(MainMemory.getI32(i1) + (i24 + 3)) & 0xFF ^ MainMemory.getI32(m) << MainMemory.getI32(n)) & MainMemory.getI32(i3);
/* 344 */           MainMemory.setI32(m, i24);
/* 345 */           MainMemory.setI16(MainMemory.getI32(i4) + ((MainMemory.getI32(i5) & i29) << 1), MainMemory.getI16(MainMemory.getI32(i6) + (i24 << 1)));
/* 346 */           MainMemory.setI16(MainMemory.getI32(i6) + (MainMemory.getI32(m) << 1), (short)MainMemory.getI32(i2));
/* 347 */           i29 = MainMemory.getI32(i8) + -1;
/* 348 */           MainMemory.setI32(i8, i29);
/* 349 */           if (i29 == 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */         i29 = MainMemory.getI32(i2) + 1;
/* 360 */         MainMemory.setI32(i2, i29);
/*     */         
/*     */ 
/*     */         break label1538;
/*     */         
/*     */         label1394:
/*     */         
/* 367 */         int i18 = MainMemory.getI8(MainMemory.getI32(i1) + MainMemory.getI32(i2));
/* 368 */         MainMemory.setI16(MainMemory.getI32(i10) + (MainMemory.getI32(i11) << 1), (short)0);
/* 369 */         i22 = MainMemory.getI32(i11);
/* 370 */         MainMemory.setI8(MainMemory.getI32(i12) + i22, i18);
/* 371 */         MainMemory.setI32(i11, i22 + 1);
/* 372 */         i21 = paramInt1 + 148 + ((i18 & 0xFF) << 2);
/* 373 */         MainMemory.setI16(i21, (short)(MainMemory.getI16(i21) + 1));
/* 374 */         i22 = MainMemory.getI32(i11) == MainMemory.getI32(i13) + -1 ? 1 : 0;
/* 375 */         MainMemory.setI32(j, MainMemory.getI32(j) + -1);
/* 376 */         i29 = MainMemory.getI32(i2) + 1;
/* 377 */         MainMemory.setI32(i2, i29);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1538:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 387 */         if (i22 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 397 */           i24 = MainMemory.getI32(i15);
/* 398 */           i22 = i29 - i24;
/* 399 */           if (i24 <= -1)
/*     */           {
/*     */ 
/*     */ 
/* 403 */             i23 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 410 */             i23 = MainMemory.getI32(i1) + i24;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */           _tr_flush_block.call(i16, i23, i22, 0);
/* 419 */           MainMemory.setI32(i15, MainMemory.getI32(i2));
/* 420 */           i25 = MainMemory.getI32(paramInt1);
/* 421 */           i26 = i25 + 28;
/* 422 */           i27 = MainMemory.getI32(i26);
/* 423 */           i22 = MainMemory.getI32(i27 + 20);
/* 424 */           i28 = i25 + 16;
/* 425 */           i29 = MainMemory.getI32(i28);
/* 426 */           i22 = MathUtils.ult(i29, i22) ? i29 : i22;
/* 427 */           if (i22 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 437 */             F431680_170.call(i27, i26, i28, i22, i25);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 443 */           if (MainMemory.getI32(MainMemory.getI32(paramInt1) + 16) == 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 453 */       i = 0;
/*     */       
/*     */ 
/*     */       label1753:
/*     */       
/*     */ 
/* 459 */       int i30 = i; return i30;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F431680.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */