/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt20__throw_out_of_rangePKc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 982;
/*  23 */   public static final Function _instance = new _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE() { super("_ZN7duchamp12ObjectGrower6defineEPNS_4CubeE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  30 */     call(paramInt1, paramInt2);
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  49 */     int i = 0;
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
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*  69 */     int i16 = 0;
/*  70 */     int i17 = 0;
/*  71 */     int i18 = 0;
/*  72 */     int i19 = 0;
/*  73 */     int i20 = 0;
/*  74 */     int i21 = 0;
/*  75 */     int i22 = 0;
/*  76 */     int i23 = 0;
/*     */     
/*     */ 
/*  79 */     int i24 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  83 */       i = MainMemory.alloc(276);
/*  84 */       j = MainMemory.alloc(4);
/*  85 */       k = MainMemory.alloc(12);
/*  86 */       m = MainMemory.alloc(12);
/*  87 */       n = MainMemory.alloc(36);
/*  88 */       i1 = MainMemory.alloc(12);
/*  89 */       _ZN10Statistics14StatsContainerIfEC1ERKS1_.call(n, paramInt2 + 592);
/*  90 */       i2 = paramInt1 + 28;
/*  91 */       _ZN10Statistics14StatsContainerIfEaSERKS1_.call(i2, n);
/*  92 */       MainMemory.setI32(n, 12648);
/*  93 */       if (MainMemory.getI8(paramInt2 + 368) != 0) {
/*     */         break label205;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       _ZN10Statistics14StatsContainerIfE15setThresholdSNREf.call(i2, MainMemory.getF32(paramInt2 + 364));
/*     */       
/*     */       break label225;
/*     */       
/*     */       label205:
/* 108 */       MainMemory.setF32(paramInt1 + 52, MainMemory.getF32(paramInt2 + 372));
/*     */       
/*     */ 
/*     */       label225:
/*     */       
/*     */ 
/* 114 */       MainMemory.setI8(paramInt1 + 61, (byte)0);
/* 115 */       if (MainMemory.getI8(paramInt2 + 632) != 0) {
/*     */         break label281;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       MainMemory.setI32(paramInt1 + 72, MainMemory.getI32(paramInt2 + 20));
/*     */       
/*     */       break label301;
/*     */       
/*     */       label281:
/* 130 */       MainMemory.setI32(paramInt1 + 72, MainMemory.getI32(paramInt2 + 628));
/*     */       
/*     */ 
/*     */       label301:
/*     */       
/*     */ 
/* 136 */       MainMemory.setI32(m, 0);
/* 137 */       i4 = m + 4;
/* 138 */       MainMemory.setI32(i4, 0);
/* 139 */       i14 = m + 8;
/* 140 */       MainMemory.setI32(i14, 0);
/* 141 */       i3 = SystemLibrary.newobject(12);
/* 142 */       i6 = i3;
/* 143 */       MainMemory.setI32(m, i6);
/* 144 */       MainMemory.setI32(i4, i6);
/* 145 */       MainMemory.setI32(i14, i3 + 12);
/* 146 */       MainMemory.setI32(i6, 0);
/* 147 */       MainMemory.setI32(i3 + 4, 0);
/* 148 */       MainMemory.setI32(i3 + 8, 0);
/* 149 */       MainMemory.setI32(i4, MainMemory.getI32(m) + 12);
/* 150 */       _ZNSt6vectorIlSaIlEEaSERKS1_.call(paramInt1 + 16, m);
/* 151 */       i6 = MainMemory.getI32(m);
/* 152 */       if (i6 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         SystemLibrary.delete(i6);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 168 */       i4 = paramInt1 + 16;
/* 169 */       i6 = MainMemory.getI32(i4);
/* 170 */       i5 = paramInt2 + 4;
/* 171 */       if (MainMemory.getI16(i5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 175 */         i7 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 182 */         i7 = MainMemory.getI32(MainMemory.getI32(paramInt2 + 8));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */       MainMemory.setI32(i6, i7);
/* 191 */       i6 = MainMemory.getI32(i4) + 4;
/* 192 */       if (MainMemory.getI16(i5) <= 1)
/*     */       {
/*     */ 
/*     */ 
/* 196 */         i7 = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 203 */         i7 = MainMemory.getI32(MainMemory.getI32(paramInt2 + 8) + 4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */       MainMemory.setI32(i6, i7);
/* 212 */       i6 = MainMemory.getI32(i4) + 8;
/* 213 */       if (MainMemory.getI16(i5) <= 2)
/*     */       {
/*     */ 
/*     */ 
/* 217 */         i7 = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 224 */         i7 = MainMemory.getI32(MainMemory.getI32(paramInt2 + 8) + 8);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */       MainMemory.setI32(i6, i7);
/* 233 */       i6 = MainMemory.getI32(i4);
/* 234 */       i7 = MainMemory.getI32(i6);
/* 235 */       i8 = MainMemory.getI32(i6 + 4);
/* 236 */       i9 = i8 * i7;
/* 237 */       i10 = MainMemory.getI32(i6 + 8);
/* 238 */       i11 = i10 * i9;
/* 239 */       if (MainMemory.getI8(paramInt2 + 548) != 0) {
/*     */         break label729;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */       MainMemory.setI32(paramInt1 + 64, (int)MainMemory.getF32(paramInt2 + 552));
/*     */       
/*     */       break label742;
/*     */       
/*     */       label729:
/* 254 */       MainMemory.setI32(paramInt1 + 64, 1);
/*     */       
/*     */ 
/*     */       label742:
/*     */       
/*     */ 
/* 260 */       MainMemory.setI32(paramInt1 + 68, (int)MainMemory.getF32(paramInt2 + 556));
/* 261 */       MainMemory.setI32(j, 0);
/* 262 */       _ZNSt6vectorIN7duchamp5STATEESaIS1_EEC2EjRKS1_RKS2_.call(k, i11, j);
/* 263 */       _ZNSt6vectorIN7duchamp5STATEESaIS1_EEaSERKS3_.call(paramInt1 + 4, k);
/* 264 */       j = MainMemory.getI32(k);
/* 265 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */         SystemLibrary.delete(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 281 */       i12 = paramInt2 + 28;
/* 282 */       i13 = i1 + 4;
/* 283 */       i14 = paramInt1 + 4;
/* 284 */       i18 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 291 */         i19 = MainMemory.getI32(i12);
/* 292 */         i20 = MainMemory.getI32(i19);
/* 293 */         i16 = (MainMemory.getI32(i19 + 4) - i20) / 276;
/* 294 */         if (i16 <= i18) {
/*     */           break label1111;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */         if (!MathUtils.ugt(i16, i18)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */         _ZN7duchamp9DetectionC1ERKS0_.call(i, i20 + i18 * 276);
/* 315 */         _ZN9PixelInfo8Object3D11getPixelSetEv.call(i1, i);
/* 316 */         _ZN7duchamp9DetectionD2Ev.call(i);
/* 317 */         i15 = MainMemory.getI32(i1);
/* 318 */         i16 = MainMemory.getI32(i13) - i15;
/* 319 */         if (!MathUtils.ugt(i16 + 19, 38)) {
/*     */           break label1080;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */         i16 /= 20;
/* 330 */         i17 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 337 */           MainMemory.setI32(MainMemory.getI32(i14) + (MainMemory.getI32(i15 + i17 * 20 + 12) * i9 + MainMemory.getI32(i15 + i17 * 20 + 4) + MainMemory.getI32(MainMemory.getI32(i4)) * MainMemory.getI32(i15 + i17 * 20 + 8) << 2), 1);
/* 338 */           i17 += 1;
/* 339 */         } while (MathUtils.ugt(i16, i17));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1080:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 350 */         _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(i1);
/* 351 */         i18 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 357 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */       
/*     */ 
/*     */       label1111:
/*     */       
/*     */ 
/* 363 */       if (MainMemory.getI8(paramInt2 + 264) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */         i16 = MainMemory.getI32(paramInt2 + 312);
/* 374 */         i18 = MainMemory.getI32(paramInt2 + 272) - i16;
/* 375 */         i18 = i18 > 0 ? i18 : 0;
/* 376 */         i16 = MainMemory.getI32(paramInt2 + 268) - i16;
/* 377 */         if (MainMemory.getI16(i5) <= 2)
/*     */         {
/*     */ 
/*     */ 
/* 381 */           i17 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 388 */           i17 = MainMemory.getI32(MainMemory.getI32(paramInt2 + 8) + 8) + -1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */         i21 = i16 < i17 ? i16 : i17;
/* 397 */         if (i18 >= i21) {
/*     */           break label1288;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */         _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE_198.call(i18, i17, i14, i21, i8, i7, i16, i9);
/*     */       }
/*     */       
/*     */ 
/*     */       label1288:
/*     */       
/* 413 */       if (i11 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 423 */         i22 = paramInt2 + 20;
/* 424 */         i23 = paramInt2 + 32;
/* 425 */         i7 = i7 * i8 * i10;
/* 426 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 433 */           if (_ZN7duchamp5Param7isBlankERf.call(i23, MainMemory.getI32(i22) + (i8 << 2)) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 443 */             MainMemory.setI32(MainMemory.getI32(i14) + (i8 << 2), 2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 449 */           i8 += 1;
/* 450 */           if (i8 == i7)
/*     */           {
/*     */ 
/*     */             break;
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */         }
/*     */         
/*     */ 
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/* 471 */       MainMemory.dealloc_generated(i24);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp12ObjectGrower6defineEPNS_4CubeE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */