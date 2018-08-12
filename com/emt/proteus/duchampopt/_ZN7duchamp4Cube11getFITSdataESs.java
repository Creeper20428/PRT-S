/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube11getFITSdataESs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2367;
/*  25 */   public static final Function _instance = new _ZN7duchamp4Cube11getFITSdataESs();
/*  26 */   public final Function resolve() { return _instance; }
/*     */   
/*  28 */   public _ZN7duchamp4Cube11getFITSdataESs() { super("_ZN7duchamp4Cube11getFITSdataESs", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  32 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = call(i, j);
/*  44 */     paramFrame.setI32(paramInt1, k);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  50 */     int i = 0;
/*     */     
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*  70 */     int i15 = 0;
/*  71 */     int i16 = 0;
/*  72 */     int i17 = 0;
/*  73 */     int i18 = 0;
/*  74 */     int i19 = 0;
/*  75 */     int i20 = 0;
/*  76 */     int i21 = 0;
/*  77 */     int i22 = 0;
/*  78 */     int i23 = 0;
/*  79 */     int i24 = 0;
/*  80 */     int i25 = 0;
/*  81 */     int i26 = 0;
/*  82 */     int i27 = 0;
/*  83 */     int i28 = 0;
/*  84 */     int i29 = 0;
/*     */     
/*     */ 
/*  87 */     int i30 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  91 */       j = MainMemory.alloc(1);
/*  92 */       k = MainMemory.alloc(4);
/*  93 */       m = MainMemory.alloc(1);
/*  94 */       n = MainMemory.alloc(4);
/*  95 */       i1 = MainMemory.alloc(1);
/*  96 */       i2 = MainMemory.alloc(4);
/*  97 */       i3 = MainMemory.alloc(1);
/*  98 */       i4 = MainMemory.alloc(4);
/*  99 */       i5 = MainMemory.alloc(1);
/* 100 */       i6 = MainMemory.alloc(4);
/* 101 */       i7 = MainMemory.alloc(1);
/* 102 */       i8 = MainMemory.alloc(4);
/* 103 */       i15 = MainMemory.alloc(4);
/* 104 */       i9 = MainMemory.alloc(4);
/* 105 */       i10 = MainMemory.alloc(4);
/* 106 */       i11 = MainMemory.alloc(4);
/* 107 */       MainMemory.setI32(i9, 0);
/* 108 */       if (ffopentest.call(i10, _ZNKSs5c_strEv.call(paramInt2), i9) != 0) {
/*     */         break label1304;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       MainMemory.setI32(i9, 0);
/* 119 */       if (ffgidm.call(MainMemory.getI32(i10), i15, i9) != 0) {
/*     */         break label1278;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       i12 = MainMemory.getI32(i15);
/* 130 */       i13 = i12 << 2;
/* 131 */       i14 = SystemLibrary.newarray(i13);
/* 132 */       i15 = i14;
/* 133 */       i16 = i12 > 0 ? 1 : 0;
/* 134 */       if (i16 != 0) {
/* 135 */         i18 = 0;
/*     */       } else {
/*     */         break label358;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 146 */         MainMemory.setI32(i14 + (i18 << 2), 1);
/* 147 */         i18 += 1;
/* 148 */       } while (i18 < i12);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label358:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 159 */       MainMemory.setI32(i9, 0);
/* 160 */       if (ffgisz.call(MainMemory.getI32(i10), i12, i15, i9) != 0) {
/*     */         break label1252;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */       if (MainMemory.getI8(paramInt1 + 660) == 0) {
/* 171 */         i18 = 2;
/* 172 */         i19 = 1;
/* 173 */         i20 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 183 */         i17 = MainMemory.getI32(paramInt1 + 652);
/* 184 */         i18 = MainMemory.getI32(i17 + 752);
/* 185 */         if (i18 < 0) {
/* 186 */           i18 = 2;
/* 187 */           i19 = 1;
/* 188 */           i20 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 198 */           i20 = MainMemory.getI32(i17 + 744);
/* 199 */           i19 = MainMemory.getI32(i17 + 748);
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
/* 211 */       i21 = SystemLibrary.newarray(i13);
/* 212 */       i22 = i21;
/* 213 */       i23 = SystemLibrary.newarray(i13);
/* 214 */       i24 = i23;
/* 215 */       i25 = SystemLibrary.newarray(i13);
/* 216 */       i26 = i25;
/* 217 */       if (i16 != 0) {
/* 218 */         i13 = 0;
/*     */       } else {
/*     */         break label614;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 229 */         i27 = i13 << 2;
/* 230 */         i28 = i21 + i27;
/* 231 */         i29 = i25 + i27;
/* 232 */         MainMemory.setI32(i23 + i27, 1);
/* 233 */         MainMemory.setI32(i28, 1);
/* 234 */         MainMemory.setI32(i29, 1);
/* 235 */         i13 += 1;
/* 236 */       } while (i13 < i12);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label614:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 247 */       MainMemory.setI32(i24 + (i20 << 2), MainMemory.getI32(i15 + (i20 << 2)));
/* 248 */       if (i12 <= 1) {
/*     */         break label678;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */       MainMemory.setI32(i24 + (i19 << 2), MainMemory.getI32(i15 + (i19 << 2)));
/*     */       
/*     */ 
/*     */       label678:
/*     */       
/*     */ 
/* 264 */       if ((i18 <= -1) || (i12 <= i18)) {
/*     */         break label729;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */       MainMemory.setI32(i24 + (i18 << 2), MainMemory.getI32(i15 + (i18 << 2)));
/*     */       
/*     */ 
/*     */       label729:
/*     */       
/*     */ 
/* 280 */       if (_ZN7duchamp4Cube14initialiseCubeEPlb.call(paramInt1, i15, (byte)1) == 1) {
/* 281 */         i12 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 291 */         MainMemory.setI32(i9, 0);
/* 292 */         if (ffgsve.call(MainMemory.getI32(i10), 0, i12, i15, i22, i24, i26, MainMemory.getF32(paramInt1 + 244), MainMemory.getI32(paramInt1 + 20), i11, i9) != 0) {
/*     */           break label1171;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */         if (i21 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */           SystemLibrary.deletearray(i21);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 318 */         if (i23 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */           SystemLibrary.deletearray(i23);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 334 */         if (i25 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */           SystemLibrary.deletearray(i25);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 350 */         if (MainMemory.getI32(i11) != 0) {
/*     */           break label1014;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */         i21 = paramInt1 + 276;
/* 361 */         if (MainMemory.getI8(i21) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */           _ZNSaIcEC1Ev.call(i3);
/* 372 */           _ZNSsC1EPKcRKSaIcE.call(i4, 107808, i3);
/* 373 */           _ZNSaIcEC1Ev.call(i1);
/* 374 */           _ZNSsC1EPKcRKSaIcE.call(i2, 50176, i1);
/* 375 */           _ZN7duchamp14duchampWarningESsSs.call(i2, i4);
/* 376 */           _ZNSsD1Ev.call(i2);
/* 377 */           _ZNSaIcED1Ev.call(i1);
/* 378 */           _ZNSsD1Ev.call(i4);
/* 379 */           _ZNSaIcED1Ev.call(i3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 385 */         MainMemory.setI8(paramInt1 + 241, (byte)0);
/* 386 */         MainMemory.setI8(i21, (byte)0);
/*     */         
/*     */ 
/*     */         label1014:
/*     */         
/*     */ 
/* 392 */         if (i14 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */           SystemLibrary.deletearray(i14);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 408 */         MainMemory.setI32(i9, 0);
/* 409 */         ffclos.call(MainMemory.getI32(i10), i9);
/* 410 */         if (MainMemory.getI32(i9) == 0) {
/* 411 */           i12 = 0;
/*     */         } else {
/*     */           break label1093;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 422 */       i = i12;
/*     */       
/*     */ 
/*     */       break label1325;
/*     */       
/*     */       label1093:
/*     */       
/* 429 */       _ZNSaIcEC1Ev.call(m);
/* 430 */       _ZNSsC1EPKcRKSaIcE.call(n, 63136, m);
/* 431 */       _ZNSaIcEC1Ev.call(j);
/* 432 */       _ZNSsC1EPKcRKSaIcE.call(k, 50176, j);
/* 433 */       _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 434 */       _ZNSsD1Ev.call(k);
/* 435 */       _ZNSaIcED1Ev.call(j);
/* 436 */       _ZNSsD1Ev.call(n);
/* 437 */       _ZNSaIcED1Ev.call(m);
/* 438 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i9));
/* 439 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1325;
/*     */       
/*     */       label1171:
/*     */       
/* 446 */       _ZNSaIcEC1Ev.call(i7);
/* 447 */       _ZNSsC1EPKcRKSaIcE.call(i8, 103584, i7);
/* 448 */       _ZNSaIcEC1Ev.call(i5);
/* 449 */       _ZNSsC1EPKcRKSaIcE.call(i6, 50176, i5);
/* 450 */       _ZN7duchamp12duchampErrorESsSs.call(i6, i8);
/* 451 */       _ZNSsD1Ev.call(i6);
/* 452 */       _ZNSaIcED1Ev.call(i5);
/* 453 */       _ZNSsD1Ev.call(i8);
/* 454 */       _ZNSaIcED1Ev.call(i7);
/* 455 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i9));
/* 456 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1325;
/*     */       
/*     */       label1252:
/*     */       
/* 463 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i9));
/* 464 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1325;
/*     */       
/*     */       label1278:
/*     */       
/* 471 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i9));
/* 472 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1325;
/*     */       
/*     */       label1304:
/*     */       
/* 479 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i9));
/* 480 */       i = 1;
/*     */       
/*     */ 
/*     */       label1325:
/*     */       
/*     */ 
/* 486 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 491 */       MainMemory.dealloc_generated(i30);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11getFITSdataESs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */