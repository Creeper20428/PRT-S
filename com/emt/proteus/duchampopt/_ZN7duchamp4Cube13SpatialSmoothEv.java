/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube13SpatialSmoothEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2083;
/*  26 */   public static final Function _instance = new _ZN7duchamp4Cube13SpatialSmoothEv();
/*  27 */   public final Function resolve() { return _instance; }
/*     */   
/*  29 */   public _ZN7duchamp4Cube13SpatialSmoothEv() { super("_ZN7duchamp4Cube13SpatialSmoothEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  33 */     call(paramInt);
/*  34 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  39 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
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
/*  65 */     boolean bool = false;
/*  66 */     float f1 = 0.0F;
/*  67 */     float f2 = 0.0F;
/*  68 */     float f3 = 0.0F;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*  72 */     int i15 = 0;
/*  73 */     int i16 = 0;
/*  74 */     int i17 = 0;
/*  75 */     int i18 = 0;
/*  76 */     int i19 = 0;
/*  77 */     int i20 = 0;
/*  78 */     int i21 = 0;
/*  79 */     int i22 = 0;
/*  80 */     int i23 = 0;
/*  81 */     int i24 = 0;
/*  82 */     int i25 = 0;
/*  83 */     int i26 = 0;
/*  84 */     int i27 = 0;
/*     */     
/*     */ 
/*  87 */     int i28 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  91 */       i = MainMemory.alloc(1);
/*  92 */       j = MainMemory.alloc(4);
/*  93 */       k = MainMemory.alloc(1);
/*  94 */       m = MainMemory.alloc(4);
/*  95 */       n = MainMemory.alloc(1);
/*  96 */       i1 = MainMemory.alloc(4);
/*  97 */       i2 = MainMemory.alloc(4);
/*  98 */       i3 = MainMemory.alloc(20);
/*  99 */       i4 = MainMemory.alloc(36);
/* 100 */       i5 = paramInt + 632;
/* 101 */       if (MainMemory.getI8(i5) != 0) {
/*     */         break label1177;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       _ZNSsC1ERKSs.call(i2, paramInt + 456);
/* 112 */       bool = _ZNKSs7compareEPKc.call(i2, 37664) == 0;
/* 113 */       _ZNSsD1Ev.call(i2);
/* 114 */       if (!bool) {
/*     */         break label1177;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       i6 = MainMemory.getI32(paramInt + 652);
/* 125 */       if (MainMemory.getI32(i6) != -1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         if (MainMemory.getI32(i6 + 4) >= 2) {
/*     */           break label356;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       _ZNSaIcEC1Ev.call(n);
/* 146 */       _ZNSsC1EPKcRKSaIcE.call(i1, 123744, n);
/* 147 */       _ZNSaIcEC1Ev.call(k);
/* 148 */       _ZNSsC1EPKcRKSaIcE.call(m, 52864, k);
/* 149 */       _ZN7duchamp14duchampWarningESsSs.call(m, i1);
/* 150 */       _ZNSsD1Ev.call(m);
/* 151 */       _ZNSaIcED1Ev.call(k);
/* 152 */       _ZNSsD1Ev.call(i1);
/* 153 */       _ZNSaIcED1Ev.call(n);
/*     */       
/*     */ 
/*     */       break label1182;
/*     */       
/*     */       label356:
/*     */       
/* 160 */       i7 = MainMemory.getI32(paramInt + 8);
/* 161 */       i8 = MainMemory.getI32(i7);
/* 162 */       i9 = MainMemory.getI32(i7 + 4);
/* 163 */       i10 = i9 * i8;
/* 164 */       i11 = MainMemory.getI32(i7 + 8);
/* 165 */       _ZN11ProgressBarC1Ev.call(i3);
/* 166 */       bool = i11 > 1;
/* 167 */       i15 = paramInt + 468;
/* 168 */       f2 = MainMemory.getF32(i15);
/* 169 */       f1 = MainMemory.getF32(paramInt + 464);
/* 170 */       if (!MathUtils.f_olt(f2, 0.0D)) {
/*     */         break label479;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */       MainMemory.setF32(i15, f1);
/* 182 */       f2 = f1;
/*     */       
/*     */ 
/*     */ 
/*     */       label479:
/*     */       
/*     */ 
/* 189 */       f3 = MainMemory.getF32(paramInt + 472);
/* 190 */       MainMemory.setI32(i4, 12552);
/* 191 */       i12 = i4 + 28;
/* 192 */       MainMemory.setI8(i12, (byte)0);
/* 193 */       MainMemory.setF32(i4 + 32, -99.0F);
/* 194 */       MainMemory.setI32(i4 + 16, -1);
/* 195 */       _ZN13GaussSmooth2DIfE6defineEfff.call(i4, f1, f2, f3);
/* 196 */       i13 = paramInt + 590;
/* 197 */       if (MainMemory.getI8(i13) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */         _ZN7duchamp4Cube13SpatialSmoothEv_254.call(i3, bool, i11);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 213 */       i14 = SystemLibrary.newarray(i10 << 2);
/* 214 */       i15 = i14;
/* 215 */       i16 = i10 > 0 ? 1 : 0;
/* 216 */       i17 = paramInt + 20;
/* 217 */       i18 = paramInt + 32;
/* 218 */       i19 = paramInt + 628;
/* 219 */       i20 = i8 * i9;
/* 220 */       i23 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 227 */         i26 = i10 * i23;
/* 228 */         i27 = i23 + 1;
/* 229 */         if (i23 >= i11) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */         if ((!bool) || (MainMemory.getI8(i13) == 0)) {
/*     */           break label709;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */         _ZN11ProgressBar6updateEi.call(i3, i27);
/*     */         
/*     */ 
/*     */         label709:
/*     */         
/*     */ 
/* 255 */         if (i16 != 0) {
/* 256 */           i23 = 0;
/*     */         } else {
/*     */           break label782;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 267 */           MainMemory.setF32(i14 + (i23 << 2), MainMemory.getF32(MainMemory.getI32(i17) + (i26 + i23 << 2)));
/* 268 */           i23 += 1;
/* 269 */           if (i23 == i20) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label782:
/*     */         
/*     */ 
/*     */ 
/* 280 */         i21 = _ZN7duchamp5Param13makeBlankMaskEPfi.call(i18, i15, i10);
/* 281 */         i22 = _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES.call(i4, i15, i8, i9, i21);
/* 282 */         if (i16 != 0) {
/* 283 */           i23 = 0;
/*     */         } else {
/*     */           break label951;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 294 */           i24 = i26 + i23;
/* 295 */           i25 = MainMemory.getI32(i19);
/* 296 */           if (MainMemory.getI8(i21 + i23) != 0) {
/*     */             break label897;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */           MainMemory.setF32(i25 + (i24 << 2), MainMemory.getF32(i22 + (i23 << 2)));
/*     */           
/*     */           break label925;
/*     */           
/*     */           label897:
/* 311 */           MainMemory.setF32(i25 + (i24 << 2), MainMemory.getF32(MainMemory.getI32(i17) + (i24 << 2)));
/*     */           
/*     */ 
/*     */           label925:
/*     */           
/*     */ 
/* 317 */           i23 += 1;
/* 318 */           if (i23 == i20) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label951:
/*     */         
/*     */ 
/*     */ 
/* 329 */         if (i22 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */           SystemLibrary.deletearray(i22);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 345 */         if (i21 == 0) {
/* 346 */           i23 = i27;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 356 */           SystemLibrary.deletearray(i21);
/* 357 */           i23 = i27;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 362 */       if (i14 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */         SystemLibrary.deletearray(i14);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 378 */       MainMemory.setI8(i5, (byte)1);
/* 379 */       if (MainMemory.getI8(i13) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 389 */         if (!bool) {
/*     */           break label1111;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 399 */         _ZNSaIcEC1Ev.call(i);
/* 400 */         _ZNSsC1EPKcRKSaIcE.call(j, 46272, i);
/* 401 */         _ZN11ProgressBar9fillSpaceESs.call(i3, j);
/* 402 */         _ZNSsD1Ev.call(j);
/* 403 */         _ZNSaIcED1Ev.call(i);
/*     */         
/*     */ 
/*     */         label1111:
/*     */         
/*     */ 
/* 409 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13408);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 415 */       MainMemory.setI32(i4, 12552);
/* 416 */       if (MainMemory.getI8(i12) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */         _ZN7duchamp4Cube13SpatialSmoothEv_253.call(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 432 */       _ZN11ProgressBarD1Ev.call(i3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1177:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1182:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */       MainMemory.dealloc_generated(i28);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube13SpatialSmoothEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */