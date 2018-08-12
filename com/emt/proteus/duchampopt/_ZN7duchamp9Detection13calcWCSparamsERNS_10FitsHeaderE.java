/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
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
/*     */ public final class _ZN7duchamp9Detection13calcWCSparamsERNS_10FitsHeaderE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 840;
/*  32 */   public static final Function _instance = new _ZN7duchamp9Detection13calcWCSparamsERNS_10FitsHeaderE();
/*  33 */   public final Function resolve() { return _instance; }
/*     */   
/*  35 */   public _ZN7duchamp9Detection13calcWCSparamsERNS_10FitsHeaderE() { super("_ZN7duchamp9Detection13calcWCSparamsERNS_10FitsHeaderE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     call(paramInt1, paramInt2);
/*  40 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  45 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     int n = 0;
/*  63 */     int i1 = 0;
/*  64 */     int i2 = 0;
/*  65 */     int i3 = 0;
/*  66 */     int i4 = 0;
/*  67 */     int i5 = 0;
/*  68 */     int i6 = 0;
/*  69 */     int i7 = 0;
/*  70 */     int i8 = 0;
/*  71 */     int i9 = 0;
/*  72 */     int i10 = 0;
/*  73 */     int i11 = 0;
/*  74 */     int i12 = 0;
/*  75 */     int i13 = 0;
/*  76 */     int i14 = 0;
/*  77 */     float f1 = 0.0F;
/*  78 */     double d1 = 0.0D;
/*  79 */     int i15 = 0;
/*  80 */     int i16 = 0;
/*  81 */     int i17 = 0;
/*  82 */     byte b = 0;
/*  83 */     int i18 = 0;
/*  84 */     int i19 = 0;
/*  85 */     double d2 = 0.0D;
/*  86 */     double d3 = 0.0D;
/*  87 */     double d4 = 0.0D;
/*  88 */     double d5 = 0.0D;
/*  89 */     int i20 = 0;
/*  90 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*  93 */     int i21 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  97 */       i = MainMemory.alloc(4);
/*  98 */       j = MainMemory.alloc(4);
/*  99 */       k = MainMemory.alloc(4);
/* 100 */       m = MainMemory.alloc(4);
/* 101 */       n = MainMemory.alloc(4);
/* 102 */       i1 = MainMemory.alloc(4);
/* 103 */       i2 = MainMemory.alloc(4);
/* 104 */       i3 = MainMemory.alloc(4);
/* 105 */       i4 = MainMemory.alloc(1);
/* 106 */       i5 = MainMemory.alloc(4);
/* 107 */       i6 = MainMemory.alloc(1);
/* 108 */       i7 = MainMemory.alloc(4);
/* 109 */       i8 = MainMemory.alloc(44);
/* 110 */       i9 = MainMemory.alloc(16);
/* 111 */       if (MainMemory.getI8(paramInt2 + 12) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         i10 = SystemLibrary.newarray(120);
/* 122 */         i11 = i10;
/* 123 */         i12 = SystemLibrary.newarray(120);
/* 124 */         i13 = i12;
/* 125 */         i14 = paramInt1 + 128;
/* 126 */         if (_ZNKSs7compareEPKc.call(i14, 18784) != 0) {
/*     */           break label279;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         f1 = MainMemory.getI32(paramInt1 + 100);
/*     */         
/*     */         break label332;
/*     */         
/*     */         label279:
/*     */         
/* 142 */         if (_ZNKSs7compareEPKc.call(i14, 37024) != 0) {
/*     */           break label318;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         f1 = _ZN9PixelInfo8Object3D11getXaverageEv.call(paramInt1);
/*     */         
/*     */         break label332;
/*     */         
/*     */         label318:
/*     */         
/* 158 */         f1 = MainMemory.getF32(paramInt1 + 116);
/*     */         
/*     */ 
/*     */ 
/*     */         label332:
/*     */         
/*     */ 
/*     */ 
/* 166 */         d1 = f1;
/* 167 */         MainMemory.setF64(i10 + 48, d1);
/* 168 */         MainMemory.setF64(i10 + 24, d1);
/* 169 */         MainMemory.setF64(i11, d1);
/* 170 */         d1 = MainMemory.getI32(paramInt1 + 44);
/* 171 */         d1 += -0.5D;
/* 172 */         MainMemory.setF64(i10 + 72, d1);
/* 173 */         d1 = MainMemory.getI32(paramInt1 + 48);
/* 174 */         d1 += 0.5D;
/* 175 */         MainMemory.setF64(i10 + 96, d1);
/* 176 */         if (_ZNKSs7compareEPKc.call(i14, 18784) != 0) {
/*     */           break label464;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */         f1 = MainMemory.getI32(paramInt1 + 104);
/*     */         
/*     */         break label517;
/*     */         
/*     */         label464:
/*     */         
/* 192 */         if (_ZNKSs7compareEPKc.call(i14, 37024) != 0) {
/*     */           break label503;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */         f1 = _ZN9PixelInfo8Object3D11getYaverageEv.call(paramInt1);
/*     */         
/*     */         break label517;
/*     */         
/*     */         label503:
/*     */         
/* 208 */         f1 = MainMemory.getF32(paramInt1 + 120);
/*     */         
/*     */ 
/*     */ 
/*     */         label517:
/*     */         
/*     */ 
/*     */ 
/* 216 */         d1 = f1;
/* 217 */         MainMemory.setF64(i10 + 56, d1);
/* 218 */         MainMemory.setF64(i10 + 32, d1);
/* 219 */         MainMemory.setF64(i10 + 8, d1);
/* 220 */         d1 = MainMemory.getI32(paramInt1 + 52);
/* 221 */         d1 += -0.5D;
/* 222 */         MainMemory.setF64(i10 + 80, d1);
/* 223 */         d1 = MainMemory.getI32(paramInt1 + 56);
/* 224 */         d1 += 0.5D;
/* 225 */         MainMemory.setF64(i10 + 104, d1);
/* 226 */         if (_ZNKSs7compareEPKc.call(i14, 18784) != 0) {
/*     */           break label652;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         f1 = MainMemory.getI32(paramInt1 + 108);
/*     */         
/*     */         break label705;
/*     */         
/*     */         label652:
/*     */         
/* 242 */         if (_ZNKSs7compareEPKc.call(i14, 37024) != 0) {
/*     */           break label691;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */         f1 = _ZN9PixelInfo8Object3D11getZaverageEv.call(paramInt1);
/*     */         
/*     */         break label705;
/*     */         
/*     */         label691:
/*     */         
/* 258 */         f1 = MainMemory.getF32(paramInt1 + 124);
/*     */         
/*     */ 
/*     */ 
/*     */         label705:
/*     */         
/*     */ 
/*     */ 
/* 266 */         d1 = f1;
/* 267 */         MainMemory.setF64(i10 + 112, d1);
/* 268 */         MainMemory.setF64(i10 + 88, d1);
/* 269 */         MainMemory.setF64(i10 + 16, d1);
/* 270 */         d1 = MainMemory.getI32(paramInt1 + 60);
/* 271 */         MainMemory.setF64(i10 + 40, d1);
/* 272 */         d1 = MainMemory.getI32(paramInt1 + 64);
/* 273 */         MainMemory.setF64(i10 + 64, d1);
/* 274 */         i15 = paramInt2 + 4;
/* 275 */         i16 = _ZN7duchamp10FitsHeader8pixToWCSEPKdPdi.call(MainMemory.getI32(i15), i11, i13);
/* 276 */         if (i10 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */           SystemLibrary.deletearray(i10);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 292 */         if (i16 != 0) {
/*     */           break label1832;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */         MainMemory.setI8(paramInt1 + 80, (byte)1);
/* 303 */         i17 = MainMemory.getI32(i15);
/* 304 */         if (MainMemory.getI32(i17 + 752) > -1) {
/* 305 */           b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 315 */           b = (byte)(MainMemory.getI32(i17 + 4) > 2 ? 1 : 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */         MainMemory.setI8(paramInt1 + 188, b);
/* 324 */         i7 = paramInt1 + 204;
/* 325 */         _ZNSsaSEPKc.call(i7, MainMemory.getI32(i15) + 728);
/* 326 */         i5 = paramInt1 + 208;
/* 327 */         _ZNSsaSEPKc.call(i5, MainMemory.getI32(i15) + 736);
/* 328 */         _ZNSsC1ERKSs.call(i3, paramInt2 + 24);
/* 329 */         _ZNSsaSERKSs.call(paramInt1 + 192, i3);
/* 330 */         _ZNSsD1Ev.call(i3);
/* 331 */         _ZNSsC1ERKSs.call(i2, paramInt2 + 36);
/* 332 */         _ZNSsaSERKSs.call(paramInt1 + 196, i2);
/* 333 */         _ZNSsD1Ev.call(i2);
/* 334 */         _ZNSsC1ERKSs.call(i1, paramInt2 + 40);
/* 335 */         _ZNSsaSERKSs.call(paramInt1 + 200, i1);
/* 336 */         _ZNSsD1Ev.call(i1);
/* 337 */         f1 = (float)MainMemory.getF64(i13);
/* 338 */         i18 = paramInt1 + 160;
/* 339 */         MainMemory.setF32(i18, f1);
/* 340 */         i11 = i12 + 8;
/* 341 */         f1 = (float)MainMemory.getF64(i11);
/* 342 */         i19 = paramInt1 + 164;
/* 343 */         MainMemory.setF32(i19, f1);
/* 344 */         _ZNSsC1ERKSs.call(m, i7);
/* 345 */         d1 = MainMemory.getF32(i18);
/* 346 */         _Z8decToDMSdSs.call(n, d1, m);
/* 347 */         _ZNSsaSERKSs.call(paramInt1 + 152, n);
/* 348 */         _ZNSsD1Ev.call(n);
/* 349 */         _ZNSsD1Ev.call(m);
/* 350 */         _ZNSsC1ERKSs.call(j, i5);
/* 351 */         d1 = MainMemory.getF32(i19);
/* 352 */         _Z8decToDMSdSs.call(k, d1, j);
/* 353 */         _ZNSsaSERKSs.call(paramInt1 + 156, k);
/* 354 */         _ZNSsD1Ev.call(k);
/* 355 */         _ZNSsD1Ev.call(j);
/* 356 */         d1 = MainMemory.getF64(i11);
/* 357 */         d1 = _Z17angularSeparationRdS_S_S_.call(MainMemory.getF64(i12 + 72), d1, MainMemory.getF64(i12 + 96), d1) * 60.0D;
/* 358 */         f1 = (float)d1;
/* 359 */         MainMemory.setF32(paramInt1 + 168, f1);
/* 360 */         d1 = MainMemory.getF64(i13);
/* 361 */         d1 = _Z17angularSeparationRdS_S_S_.call(d1, MainMemory.getF64(i12 + 80), d1, MainMemory.getF64(i12 + 104)) * 60.0D;
/* 362 */         f1 = (float)d1;
/* 363 */         MainMemory.setF32(paramInt1 + 172, f1);
/* 364 */         _ZN9PixelInfo8Object3D13getSpatialMapEv.call(i8, paramInt1);
/* 365 */         _ZN9PixelInfo8Object2D16getPrincipleAxesEv.call(i9, i8);
/* 366 */         d1 = MainMemory.getF64(i9);
/* 367 */         d2 = MainMemory.getF64(i9 + 8);
/* 368 */         d3 = MathUtils.f_olt(d1, d2) ? d2 : d1;
/* 369 */         i17 = MainMemory.getI32(i15);
/* 370 */         i13 = MainMemory.getI32(i17 + 12);
/* 371 */         i11 = MainMemory.getI32(i17 + 16);
/* 372 */         d4 = MainMemory.getF64(i13) * MainMemory.getF64(i11);
/* 373 */         d5 = MainMemory.getF64(i13 + (MainMemory.getI32(i17 + 4) + 1 << 3)) * MainMemory.getF64(i11 + 8);
/* 374 */         d4 *= d5;
/* 375 */         f1 = (float)SystemLibrary.sqrt(SystemLibrary.fabs(d4));
/* 376 */         d4 = f1;
/* 377 */         d3 *= d4;
/* 378 */         f1 = (float)d3;
/* 379 */         MainMemory.setF32(paramInt1 + 176, f1);
/* 380 */         d1 = MathUtils.f_olt(d2, d1) ? d2 : d1;
/* 381 */         i17 = MainMemory.getI32(i15);
/* 382 */         i13 = MainMemory.getI32(i17 + 12);
/* 383 */         i11 = MainMemory.getI32(i17 + 16);
/* 384 */         d2 = MainMemory.getF64(i13) * MainMemory.getF64(i11);
/* 385 */         d3 = MainMemory.getF64(i13 + (MainMemory.getI32(i17 + 4) + 1 << 3)) * MainMemory.getF64(i11 + 8);
/* 386 */         d2 *= d3;
/* 387 */         f1 = (float)SystemLibrary.sqrt(SystemLibrary.fabs(d2));
/* 388 */         d2 = f1;
/* 389 */         d1 *= d2;
/* 390 */         f1 = (float)d1;
/* 391 */         MainMemory.setF32(paramInt1 + 180, f1);
/* 392 */         d1 = _ZN9PixelInfo8Object2D16getPositionAngleEv.call(i8) * 180.0D;
/* 393 */         d1 /= 3.141592653589793D;
/* 394 */         f1 = (float)d1;
/* 395 */         MainMemory.setF32(paramInt1 + 184, f1);
/* 396 */         d1 = MainMemory.getF32(i19);
/* 397 */         d2 = MainMemory.getF32(i18);
/* 398 */         _ZN7duchamp10FitsHeader10getIAUNameEdd.call(i, paramInt2, d2, d1);
/* 399 */         _ZNSsaSERKSs.call(paramInt1 + 144, i);
/* 400 */         _ZNSsD1Ev.call(i);
/* 401 */         i13 = paramInt2 + 96;
/* 402 */         i11 = paramInt2 + 88;
/* 403 */         i20 = paramInt2 + 80;
/* 404 */         f1 = (float)_ZN7duchamp10FitsHeader9specToVelERKd.call(MainMemory.getF64(i20), MainMemory.getF64(i11), MainMemory.getF64(i13), MainMemory.getF64(i12 + 16));
/* 405 */         MainMemory.setF32(paramInt1 + 212, f1);
/* 406 */         f1 = (float)_ZN7duchamp10FitsHeader9specToVelERKd.call(MainMemory.getF64(i20), MainMemory.getF64(i11), MainMemory.getF64(i13), MainMemory.getF64(i12 + 40));
/* 407 */         MainMemory.setF32(paramInt1 + 220, f1);
/* 408 */         f2 = (float)_ZN7duchamp10FitsHeader9specToVelERKd.call(MainMemory.getF64(i20), MainMemory.getF64(i11), MainMemory.getF64(i13), MainMemory.getF64(i12 + 64));
/* 409 */         MainMemory.setF32(paramInt1 + 224, f2);
/* 410 */         f1 = f2 - f1;
/* 411 */         MainMemory.setF32(paramInt1 + 216, SystemLibrary.fabsf(f1));
/* 412 */         MainMemory.setI8(paramInt1 + 148, (byte)1);
/* 413 */         MainMemory.setI32(i8, 12936);
/* 414 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i8 + 4);
/*     */         
/*     */         break label1892;
/*     */         
/*     */         label1832:
/* 419 */         _ZNSaIcEC1Ev.call(i6);
/* 420 */         _ZNSsC1EPKcRKSaIcE.call(i7, 105568, i6);
/* 421 */         _ZNSaIcEC1Ev.call(i4);
/* 422 */         _ZNSsC1EPKcRKSaIcE.call(i5, 52896, i4);
/* 423 */         _ZN7duchamp12duchampErrorESsSs.call(i5, i7);
/* 424 */         _ZNSsD1Ev.call(i5);
/* 425 */         _ZNSaIcED1Ev.call(i4);
/* 426 */         _ZNSsD1Ev.call(i7);
/* 427 */         _ZNSaIcED1Ev.call(i6);
/*     */         
/*     */ 
/*     */         label1892:
/*     */         
/*     */ 
/* 433 */         if (i12 != 0) {
/*     */           break label1920;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1930;
/*     */       
/*     */ 
/*     */ 
/*     */       label1920:
/*     */       
/*     */ 
/*     */ 
/* 449 */       SystemLibrary.deletearray(i12);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1930:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */       MainMemory.dealloc_generated(i21);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection13calcWCSparamsERNS_10FitsHeaderE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */