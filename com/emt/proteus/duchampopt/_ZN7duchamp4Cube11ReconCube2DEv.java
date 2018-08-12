/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube11ReconCube2DEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 771;
/*  17 */   public static final Function _instance = new _ZN7duchamp4Cube11ReconCube2DEv();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN7duchamp4Cube11ReconCube2DEv() { super("_ZN7duchamp4Cube11ReconCube2DEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  24 */     call(paramInt);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
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
/*  50 */     boolean bool = false;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*  59 */     int i14 = 0;
/*  60 */     byte b = 0;
/*  61 */     int i15 = 0;
/*  62 */     int i16 = 0;
/*  63 */     int i17 = 0;
/*  64 */     int i18 = 0;
/*  65 */     int i19 = 0;
/*     */     
/*     */ 
/*  68 */     int i20 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       i = MainMemory.alloc(1);
/*  73 */       j = MainMemory.alloc(4);
/*  74 */       k = MainMemory.alloc(20);
/*  75 */       m = MainMemory.alloc(4);
/*  76 */       n = MainMemory.alloc(4);
/*  77 */       i1 = MainMemory.alloc(4);
/*  78 */       i2 = MainMemory.alloc(4);
/*  79 */       i3 = paramInt + 8;
/*  80 */       i5 = MainMemory.getI32(i3);
/*  81 */       i13 = MainMemory.getI32(i5);
/*  82 */       i19 = MainMemory.getI32(i5 + 4);
/*  83 */       i4 = i19 * i13;
/*  84 */       _ZN11ProgressBarC1Ev.call(k);
/*  85 */       i5 = MainMemory.getI32(i3);
/*  86 */       bool = MainMemory.getI32(i5 + 8) > 1;
/*  87 */       MainMemory.setI32(m, MainMemory.getI32(i5));
/*  88 */       MainMemory.setI32(n, MainMemory.getI32(i5 + 4));
/*  89 */       i6 = paramInt + 632;
/*  90 */       if (MainMemory.getI8(i6) != 0) {
/*     */         break label878;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       i7 = paramInt + 590;
/* 101 */       if (MainMemory.getI8(i7) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 63008);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 117 */       if (!bool) {
/*     */         break label306;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       _ZN7duchamp4Cube11ReconCube2DEv_237.call(i3, i7, k);
/*     */       
/*     */ 
/*     */       label306:
/*     */       
/*     */ 
/* 133 */       i8 = paramInt + 32;
/* 134 */       i9 = i4 << 2;
/* 135 */       i10 = i4 > 0 ? 1 : 0;
/* 136 */       i11 = paramInt + 20;
/* 137 */       i12 = paramInt + 628;
/* 138 */       i13 *= i19;
/* 139 */       i15 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 146 */         i16 = i4 * i15;
/* 147 */         i17 = i13 * i15;
/* 148 */         i18 = i13 + i17;
/* 149 */         i19 = i15 + 1;
/* 150 */         if (MainMemory.getI32(MainMemory.getI32(i3) + 8) <= i15) {
/*     */           break label861;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         if ((!bool) || (MainMemory.getI8(i7) == 0)) {
/*     */           break label451;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */         _ZN11ProgressBar6updateEi.call(k, i19);
/*     */         
/*     */ 
/*     */         label451:
/*     */         
/*     */ 
/* 176 */         if (_ZN7duchamp5Param6isInMWEi.call(i8, i15) != 0) {
/*     */           break label766;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */         i14 = SystemLibrary.newarray(i9);
/* 187 */         MainMemory.setI32(i1, i14);
/* 188 */         MainMemory.setI32(i2, SystemLibrary.newarray(i9));
/* 189 */         if (i10 != 0) {
/* 190 */           i15 = 0;
/*     */         } else {
/*     */           break label571;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 201 */           MainMemory.setF32(i14 + (i15 << 2), MainMemory.getF32(MainMemory.getI32(i11) + (i16 + i15 << 2)));
/* 202 */           i15 += 1;
/* 203 */           if (i15 == i13) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label571:
/*     */         
/*     */ 
/*     */ 
/* 214 */         b = MainMemory.getI8(i7);
/* 215 */         MainMemory.setI8(i7, (byte)0);
/* 216 */         _ZN7duchamp19atrous2DReconstructERmS0_RPfS2_RNS_5ParamE.call(m, n, i1, i2, i8);
/* 217 */         MainMemory.setI8(i7, b);
/* 218 */         if (i10 == 0) {
/*     */           break label689;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         i14 = MainMemory.getI32(i2);
/* 229 */         i15 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 236 */           MainMemory.setF32(MainMemory.getI32(i12) + (i16 + i15 << 2), MainMemory.getF32(i14 + (i15 << 2)));
/* 237 */           i15 += 1;
/* 238 */           if (i15 == i13) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label689:
/*     */         
/*     */ 
/*     */ 
/* 249 */         i14 = MainMemory.getI32(i1);
/* 250 */         if (i14 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */           SystemLibrary.deletearray(i14);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 266 */         i14 = MainMemory.getI32(i2);
/* 267 */         if (i14 == 0) {
/* 268 */           i15 = i19;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 278 */           SystemLibrary.deletearray(i14);
/* 279 */           i15 = i19;
/* 280 */           continue;
/*     */           
/*     */           label766:
/*     */           
/* 284 */           if (i18 > i17) {
/* 285 */             i15 = 0; break;
/*     */           }
/*     */           
/*     */ 
/* 289 */           i15 = i19;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 297 */         i17 = i16 + i15;
/* 298 */         MainMemory.setF32(MainMemory.getI32(i12) + (i17 << 2), MainMemory.getF32(MainMemory.getI32(i11) + (i17 << 2)));
/* 299 */         i15 += 1;
/* 300 */         if (i15 == i13) {
/* 301 */           i15 = i19;
/* 302 */           break;
/*     */           
/*     */ 
/*     */           break label861;
/*     */         }
/*     */       }
/*     */       
/*     */       label861:
/*     */       
/* 311 */       _ZN7duchamp4Cube11ReconCube2DEv_235.call(i7, bool, j, i6, k, i);
/*     */       
/*     */ 
/*     */       label878:
/*     */       
/*     */ 
/* 317 */       _ZN11ProgressBarD1Ev.call(k);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 328 */       MainMemory.dealloc_generated(i20);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11ReconCube2DEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */