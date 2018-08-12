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
/*     */ public final class _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 839;
/*  15 */   public static final Function _instance = new _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE() { super("_ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  23 */     return 0;
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
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j, k, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     int i9 = 0;
/*  61 */     int i10 = 0;
/*  62 */     int i11 = 0;
/*  63 */     int i12 = 0;
/*  64 */     int i13 = 0;
/*  65 */     int i14 = 0;
/*  66 */     int i15 = 0;
/*  67 */     int i16 = 0;
/*  68 */     int i17 = 0;
/*  69 */     int i18 = 0;
/*  70 */     int i19 = 0;
/*  71 */     int i20 = 0;
/*  72 */     int i21 = 0;
/*  73 */     int i22 = 0;
/*  74 */     int i23 = 0;
/*  75 */     int i24 = 0;
/*  76 */     int i25 = 0;
/*  77 */     int i26 = 0;
/*  78 */     int i27 = 0;
/*  79 */     int i28 = 0;
/*  80 */     int i29 = 0;
/*  81 */     double d1 = 0.0D;
/*  82 */     double d2 = 0.0D;
/*  83 */     double d3 = 0.0D;
/*  84 */     int i30 = 0;
/*     */     
/*     */ 
/*  87 */     int i31 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  91 */       i = MainMemory.alloc(12);
/*  92 */       j = MainMemory.alloc(8);
/*  93 */       k = MainMemory.alloc(8);
/*  94 */       m = MainMemory.alloc(8);
/*  95 */       if (MainMemory.getI8(paramInt4 + 20) != 0) {
/*     */         break label1508;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */       MainMemory.setI8(paramInt1 + 80, (byte)1);
/* 106 */       n = MainMemory.getI32(paramInt1 + 48);
/* 107 */       i1 = paramInt1 + 44;
/* 108 */       i2 = MainMemory.getI32(i1);
/* 109 */       i3 = n - i2 + 3;
/* 110 */       i4 = MainMemory.getI32(paramInt1 + 56);
/* 111 */       i5 = paramInt1 + 52;
/* 112 */       i6 = MainMemory.getI32(i5);
/* 113 */       i7 = i4 - i6 + 3;
/* 114 */       i8 = MainMemory.getI32(paramInt1 + 64);
/* 115 */       i9 = paramInt1 + 60;
/* 116 */       i10 = MainMemory.getI32(i9);
/* 117 */       i11 = i8 - i10;
/* 118 */       i12 = i11 + 3;
/* 119 */       i13 = i7 * i3;
/* 120 */       i29 = i13 * i12;
/* 121 */       i16 = i29 + 31;
/* 122 */       i14 = SystemLibrary.newobject(i16 >>> 3 & 0x1FFFFFFC);
/* 123 */       i15 = i14;
/* 124 */       if (i15 != i15 + (i16 >>> 5 << 2))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         i16 = (n + 3 - i2) * (i4 + 3 - i6) * (i8 + 3 - i10) + 31 >>> 5;
/* 135 */         i25 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 142 */           i26 = i25 + 1;
/* 143 */           MainMemory.setI32(i14 + (i25 << 2), 0);
/* 144 */           if (i26 == i16) {
/*     */             break;
/*     */           }
/*     */           
/* 148 */           i25 = i26;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 155 */       i16 = i29 << 3;
/* 156 */       i17 = SystemLibrary.newarray(i16);
/* 157 */       i18 = i17;
/* 158 */       if (i29 <= 0) {
/*     */         break label520;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */       i29 = (n + 3 - i2) * (i4 + 3 - i6) * (i8 + 3 - i10);
/* 169 */       i25 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 176 */         MainMemory.setF64(i17 + (i25 << 3), 0.0D);
/* 177 */         i25 += 1;
/* 178 */         if (i25 == i29) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label520:
/*     */       
/*     */ 
/*     */ 
/* 189 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(i, paramInt1);
/* 190 */       i19 = MainMemory.getI32(i);
/* 191 */       i20 = MainMemory.getI32(i + 4);
/* 192 */       i21 = paramInt3 + 4;
/* 193 */       i29 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 200 */         if (!MathUtils.ult(i19 + i29 * 20, i20)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */         i26 = MainMemory.getI32(i19 + i29 * 20 + 4);
/* 211 */         i27 = MainMemory.getI32(i19 + i29 * 20 + 12);
/* 212 */         i28 = MainMemory.getI32(i19 + i29 * 20 + 8);
/* 213 */         i25 = i26 + 1 - MainMemory.getI32(i1) + (i28 + 1 + i7 * (i27 + 1 - MainMemory.getI32(i9)) - MainMemory.getI32(i5)) * i3;
/* 214 */         d1 = MainMemory.getF32(paramInt2 + (_ZN9PixelInfo5Voxel10arrayIndexEPl.call(i26, i28, i27, MainMemory.getI32(paramInt3), MainMemory.getI32(i21)) << 2));
/* 215 */         MainMemory.setF64(i18 + (i25 << 3), d1);
/* 216 */         i22 = i15 + (i25 >>> 5 << 2);
/* 217 */         MainMemory.setI32(i22, MainMemory.getI32(i22) | 1 << (i25 & 0x1F));
/* 218 */         i29 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 224 */       i23 = SystemLibrary.newarray(i16);
/* 225 */       i25 = 0;
/* 226 */       i16 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 234 */         i29 = i16 + -1;
/* 235 */         if (i16 < i12)
/*     */         {
/* 237 */           i26 = 0;
/*     */         } else {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 249 */           i27 = i26 + -1;
/* 250 */           if (i26 >= i7) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */           i28 = i25 << 3;
/* 261 */           i24 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 268 */             i18 = i23 + (i28 + (i24 << 3));
/* 269 */             if (i24 >= i3) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */             d1 = MainMemory.getI32(i1) + (i24 + -1);
/* 280 */             MainMemory.setF64(j, d1);
/* 281 */             d1 = i27 + MainMemory.getI32(i5);
/* 282 */             MainMemory.setF64(k, d1);
/* 283 */             d1 = i29 + MainMemory.getI32(i9);
/* 284 */             MainMemory.setF64(m, d1);
/* 285 */             MainMemory.setF64(i18, _ZN7duchamp10FitsHeader8pixToVelERdS1_S1_.call(paramInt4, j, k, m));
/* 286 */             i24 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 292 */           i25 += i24;
/* 293 */           i26 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */         i16 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 307 */       if (i13 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 311 */         d1 = 0.0D;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 318 */         i30 = i12 > 0 ? 1 : 0;
/* 319 */         i11 += 2;
/* 320 */         i8 = i8 + 3 - i10;
/* 321 */         n = n + 3 - i2;
/* 322 */         i6 = i4 + 3 - i6;
/* 323 */         i4 = n * i6;
/* 324 */         i6 *= n;
/* 325 */         n = i6 << 3;
/* 326 */         i2 = i6 * -8;
/* 327 */         i10 = 0;
/* 328 */         d1 = 0.0D;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 336 */           i3 = i10 << 3;
/* 337 */           i7 = i2 + i3;
/* 338 */           i12 = n + i3;
/* 339 */           if (i30 != 0) {
/* 340 */             i13 = 0;
/*     */           } else {
/*     */             break label1402;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 354 */             i16 = i10 + i6 * i13;
/* 355 */             i29 = n * i13;
/* 356 */             k = i23 + (i7 + i29);
/* 357 */             i25 = i3 + i29;
/* 358 */             j = i17 + i25;
/* 359 */             m = i23 + i25;
/* 360 */             i18 = i23 + (i12 + i29);
/* 361 */             if ((MainMemory.getI32(i15 + (i16 >>> 5 << 2)) & 1 << (i16 & 0x1F)) != 0)
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
/* 372 */               if (i13 != 0) {
/*     */                 break label1278;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */               d2 = MainMemory.getF64(i18) - MainMemory.getF64(m);
/*     */               
/*     */               break label1347;
/*     */               
/*     */               label1278:
/*     */               
/* 388 */               if (i11 != i13) {
/*     */                 break label1321;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */               d2 = MainMemory.getF64(m) - MainMemory.getF64(k);
/*     */               
/*     */               break label1347;
/*     */               
/*     */               label1321:
/*     */               
/* 404 */               d2 = MainMemory.getF64(i18) - MainMemory.getF64(k);
/* 405 */               d2 *= 0.5D;
/*     */               
/*     */ 
/*     */ 
/*     */               label1347:
/*     */               
/*     */ 
/*     */ 
/* 413 */               d3 = MainMemory.getF64(j);
/* 414 */               d2 = d3 * SystemLibrary.fabs(d2);
/* 415 */               d1 = d2 + d1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 423 */             i13 += 1;
/* 424 */             if (i13 == i8) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label1402:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 438 */           i10 += 1;
/* 439 */           if (i10 == i4) {
/*     */             break;
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
/* 453 */       MainMemory.setF64(paramInt1 + 88, d1);
/* 454 */       if (i23 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */         SystemLibrary.deletearray(i23);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 470 */       if (i17 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */         SystemLibrary.deletearray(i17);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 486 */       _ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE_393.call(i, paramInt4, paramInt2, paramInt1, paramInt3, i14);
/*     */       
/*     */       break label1532;
/*     */       
/*     */       label1508:
/* 491 */       d1 = MainMemory.getF32(paramInt1 + 84);
/* 492 */       MainMemory.setF64(paramInt1 + 88, d1);
/*     */       
/*     */ 
/*     */       label1532:
/*     */       
/*     */ 
/* 498 */       if (MainMemory.getI8(paramInt4 + 12) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 508 */         if (_ZN7duchamp10FitsHeader12needBeamSizeEv.call(paramInt4) != 0) {
/*     */           break label1582;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1620;
/*     */       
/*     */ 
/*     */ 
/*     */       label1582:
/*     */       
/*     */ 
/*     */ 
/* 524 */       j = paramInt1 + 88;
/* 525 */       d1 = MainMemory.getF32(paramInt4 + 60);
/* 526 */       d1 = MainMemory.getF64(j) / d1;
/* 527 */       MainMemory.setF64(j, d1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1620:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 538 */       MainMemory.dealloc_generated(i31);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection13calcIntegFluxEPfPlRNS_10FitsHeaderE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */