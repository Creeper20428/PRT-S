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
/*     */ public final class _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1864;
/*  16 */   public static final Function _instance = new _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE() { super("_ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
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
/*  62 */     int i13 = 0;
/*  63 */     int i14 = 0;
/*  64 */     int i15 = 0;
/*  65 */     int i16 = 0;
/*  66 */     int i17 = 0;
/*  67 */     int i18 = 0;
/*  68 */     int i19 = 0;
/*  69 */     int i20 = 0;
/*  70 */     float f = 0.0F;
/*  71 */     int i21 = 0;
/*  72 */     int i22 = 0;
/*  73 */     boolean bool1 = false;
/*  74 */     int i23 = 0;
/*  75 */     int i24 = 0;
/*  76 */     int i25 = 0;
/*  77 */     boolean bool2 = false;
/*  78 */     double d = 0.0D;
/*  79 */     int i26 = 0;
/*     */     
/*     */ 
/*  82 */     int i27 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  86 */       i = MainMemory.alloc(20);
/*  87 */       j = MainMemory.alloc(20);
/*  88 */       k = MainMemory.alloc(8);
/*  89 */       m = MainMemory.alloc(8);
/*  90 */       n = MainMemory.alloc(12);
/*  91 */       i16 = MainMemory.getI32(paramInt1 + 8);
/*  92 */       i1 = MainMemory.getI32(i16);
/*  93 */       i2 = MainMemory.getI32(i16 + 4);
/*  94 */       i3 = MainMemory.getI32(i16 + 8);
/*  95 */       i4 = paramInt1 + 28;
/*  96 */       i12 = MainMemory.getI32(i4);
/*  97 */       i5 = paramInt1 + 32;
/*  98 */       _ZN7duchamp5Param16getObjectChoicesEi.call(j, i5, (MainMemory.getI32(i12 + 4) - MainMemory.getI32(i12)) / 276);
/*  99 */       i6 = i2 * i1;
/* 100 */       i11 = i6 * i3;
/* 101 */       i7 = SystemLibrary.newarray(i11);
/* 102 */       if (i11 <= 0) {
/*     */         break label313;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */       i11 = i1 * i2 * i3;
/* 113 */       i20 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 120 */         MainMemory.setI8(i7 + i20, (byte)0);
/* 121 */         i20 += 1;
/* 122 */         if (i20 == i11) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label313:
/*     */       
/*     */ 
/*     */ 
/* 133 */       i8 = n + 4;
/* 134 */       i11 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 141 */         i12 = MainMemory.getI32(i4);
/* 142 */         i13 = MainMemory.getI32(i12);
/* 143 */         if (!MathUtils.ugt((MainMemory.getI32(i12 + 4) - i13) / 276, i11)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         if ((MainMemory.getI32(MainMemory.getI32(j) + (i11 >>> 5 << 2)) & 1 << (i11 & 0x1F)) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */           _ZN9PixelInfo8Object3D11getPixelSetEv.call(n, i13 + i11 * 276);
/* 164 */           i9 = MainMemory.getI32(n);
/* 165 */           i10 = MainMemory.getI32(i8);
/* 166 */           if (MathUtils.ult(i9, i10)) {
/* 167 */             i20 = 0;
/*     */           } else {
/*     */             break label554;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 178 */             MainMemory.setI8(i7 + ((MainMemory.getI32(i9 + i20 * 20 + 8) + i2 * MainMemory.getI32(i9 + i20 * 20 + 12)) * i1 + MainMemory.getI32(i9 + i20 * 20 + 4)), (byte)1);
/* 179 */             i20 += 1;
/* 180 */           } while (MathUtils.ult(i9 + i20 * 20, i10));
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label554:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 191 */           _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(n);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 197 */         i11 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 203 */       if (i6 <= 0) {
/*     */         break label649;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */       i11 = i1 * i2;
/* 214 */       i20 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 221 */         MainMemory.setF32(paramInt2 + (i20 << 2), 0.0F);
/* 222 */         i20 += 1;
/* 223 */         if (i20 == i11) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label649:
/*     */       
/*     */ 
/*     */ 
/* 234 */       MainMemory.setI32(i, 0);
/* 235 */       i14 = i + 4;
/* 236 */       MainMemory.setI32(i14, 0);
/* 237 */       i15 = i + 8;
/* 238 */       MainMemory.setI32(i15, 0);
/* 239 */       i16 = i + 12;
/* 240 */       MainMemory.setI32(i16, 0);
/* 241 */       i17 = i + 16;
/* 242 */       MainMemory.setI32(i17, 0);
/* 243 */       i11 = i6 + 31;
/* 244 */       i21 = SystemLibrary.newobject(i11 >>> 3 & 0x1FFFFFFC);
/* 245 */       i18 = i21;
/* 246 */       i19 = i18 + (i11 >>> 5 << 2);
/* 247 */       MainMemory.setI32(i17, i19);
/* 248 */       MainMemory.setI32(i, i18);
/* 249 */       MainMemory.setI32(i14, 0);
/* 250 */       i11 = i6 / 32;
/* 251 */       i20 = i6 % 32;
/* 252 */       bool1 = i20 < 0;
/* 253 */       MainMemory.setI32(i15, i18 + ((bool1 ? i11 + -1 : i11) << 2));
/* 254 */       MainMemory.setI32(i16, bool1 ? i20 + 32 : i20);
/* 255 */       if (i18 != i19)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */         i2 = i1 * i2 + 31 >>> 5;
/* 266 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 273 */           i20 = i11 + 1;
/* 274 */           MainMemory.setI32(i21 + (i11 << 2), 0);
/* 275 */           if (i20 == i2) {
/*     */             break;
/*     */           }
/*     */           
/* 279 */           i11 = i20;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 286 */       _ZNSt6vectorIbSaIbEEaSERKS1_.call(paramInt3, i);
/* 287 */       i16 = MainMemory.getI32(i);
/* 288 */       if (i16 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */         SystemLibrary.delete(i16);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 304 */       f = MainMemory.getI8(paramInt1 + 240) == 0 ? 1.0F : -1.0F;
/* 305 */       i21 = SystemLibrary.newarray(i3 << 3);
/* 306 */       i22 = i21;
/* 307 */       bool1 = i3 > 0;
/* 308 */       if (bool1) {
/* 309 */         i2 = 0;
/*     */       } else {
/*     */         break label1046;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 320 */         d = i2;
/* 321 */         MainMemory.setF64(i21 + (i2 << 3), d);
/* 322 */         i2 += 1;
/* 323 */         if (i2 == i3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1046:
/*     */       
/*     */ 
/*     */ 
/* 334 */       i23 = paramInt1 + 20;
/* 335 */       i24 = paramInt1 + 636;
/* 336 */       i25 = paramInt1 + 648;
/* 337 */       bool2 = i3 == 1;
/* 338 */       i2 = i3 + -1;
/* 339 */       i11 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 346 */         i26 = paramInt2 + (i11 << 2);
/* 347 */         if (i6 <= i11) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */         d = i11 % i1;
/* 358 */         MainMemory.setF64(k, d);
/* 359 */         d = i11 / i1;
/* 360 */         MainMemory.setF64(m, d);
/* 361 */         if (_ZN7duchamp5Param7isBlankERf.call(i5, MainMemory.getI32(i23) + (i11 << 2)) != 0) {
/*     */           break label1221;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */         _ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE_243.call(m, i26, paramInt3, i11, bool2, f, i25, i24, i23, i2, i7, bool1, k, i3, i6, i22);
/*     */         
/*     */ 
/*     */         label1221:
/*     */         
/*     */ 
/* 377 */         i11 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 383 */       if (i21 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */         SystemLibrary.deletearray(i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 399 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */         SystemLibrary.deletearray(i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 415 */       i16 = MainMemory.getI32(j);
/* 416 */       if (i16 != 0) {
/*     */         break label1322;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1332;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1322:
/*     */       
/*     */ 
/*     */ 
/* 432 */       SystemLibrary.delete(i16);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1332:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 443 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12getMomentMapEPfRSt6vectorIbSaIbEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */