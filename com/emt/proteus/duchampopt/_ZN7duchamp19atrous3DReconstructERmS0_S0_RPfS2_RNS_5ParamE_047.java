/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.CompiledFunction;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.lib.ExecVm;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_047
/*     */   extends ImplementedFunction
/*     */ {
/*  16 */   private static final Function _instance = new _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_047();
/*  17 */   public static boolean _guard = true;
/*     */   private static Function _previous;
/*     */   
/*  20 */   public _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_047() { super("_ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_047"); }
/*     */   
/*     */   public void replaces(Function paramFunction)
/*     */   {
/*  24 */     _previous = paramFunction;
/*     */   }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, boolean paramBoolean, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25) {
/*  28 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramBoolean, paramInt13, paramInt14, paramInt15, paramInt16, paramInt17, paramInt18, paramInt19, paramInt20, paramInt21, paramInt22, paramInt23, paramInt24, paramInt25);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     return ExecVm.exec_impl(paramEnv, (CompiledFunction)_previous, paramFrame, paramInt1, paramInt2, paramInt3, paramArrayOfInt, paramInt4);
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, boolean paramBoolean, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25)
/*     */   {
/*  41 */     int i = MainMemory.getI32Aligned(paramInt5);
/*     */     
/*  43 */     int j = MainMemory.getI32Aligned(paramInt22);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  52 */     long l = System.currentTimeMillis();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  57 */     float f1 = 0.0F;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*  62 */     int i2 = 0;
/*  63 */     int i3 = 0;
/*  64 */     int i4 = 0;
/*  65 */     int i5 = 0;
/*  66 */     int i6 = 0;
/*  67 */     float f2 = 0.0F;
/*  68 */     int i7 = 0;
/*  69 */     int i8 = 0;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*  75 */     int i14 = 0;
/*  76 */     int i15 = 0;
/*  77 */     int i16 = 0;
/*  78 */     int i17 = 0;
/*  79 */     int i18 = 0;
/*  80 */     int i19 = 0;
/*  81 */     int i20 = 0;
/*  82 */     int i21 = 0;
/*  83 */     int i22 = 0;
/*  84 */     int i23 = 0;
/*  85 */     float f3 = 0.0F;
/*  86 */     int i24 = 0;
/*  87 */     int i25 = 0;
/*  88 */     int i26 = 0;
/*  89 */     int i27 = 0;
/*  90 */     int i28 = 0;
/*  91 */     int i29 = 0;
/*  92 */     int i30 = 0;
/*  93 */     int i31 = 0;
/*  94 */     int i32 = 0;
/*  95 */     int i33 = 0;
/*  96 */     int i34 = 0;
/*  97 */     int i35 = 0;
/*  98 */     int i36 = 0;
/*  99 */     int i37 = 0;
/* 100 */     int i38 = 0;
/* 101 */     double d1 = 0.0D;
/* 102 */     float f4 = 0.0F;
/* 103 */     double d2 = 0.0D;
/* 104 */     double d3 = 0.0D;
/* 105 */     double d4 = 0.0D;
/* 106 */     float f5 = 0.0F;
/* 107 */     float f6 = 0.0F;
/* 108 */     int i39 = 0;
/* 109 */     int i40 = 0;
/* 110 */     float f7 = 0.0F;
/* 111 */     int i41 = 0;
/* 112 */     int i42 = 0;
/* 113 */     float f8 = 0.0F;
/* 114 */     int i43 = 0;
/* 115 */     int i44 = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/* 120 */       if (!paramBoolean)
/*     */       {
/*     */ 
/*     */ 
/* 124 */         f1 = paramFloat;
/* 125 */         k = 0;
/* 126 */         m = -1;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 132 */           n = paramInt20 + paramInt17 * k;
/* 133 */           i1 = paramInt15 + k;
/* 134 */           i2 = n < 0 ? paramInt6 + k * paramInt24 : n;
/* 135 */           i3 = j;
/* 136 */           if (i3 > i2) {
/* 137 */             i5 = i2;
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/* 142 */             i4 = -2 - i2 + (i3 << 1);
/* 143 */             i5 = i4;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */           i6 = paramInt1 * i5;
/* 153 */           if (paramBoolean) {
/* 154 */             f8 = f1;
/* 155 */             i43 = m;
/*     */           }
/*     */           else
/*     */           {
/* 159 */             f2 = f1;
/* 160 */             i7 = 0;
/* 161 */             i8 = m;
/*     */             
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 167 */               i9 = paramInt18 + paramInt17 * i7;
/* 168 */               i10 = paramInt15 + i7;
/* 169 */               i11 = MainMemory.getI32(paramInt8);
/* 170 */               i12 = MainMemory.getI32(paramInt9);
/* 171 */               if (i11 == i12) {
/* 172 */                 i20 = i9;
/*     */               }
/*     */               else
/*     */               {
/* 176 */                 i13 = i9;
/*     */                 
/*     */                 for (;;)
/*     */                 {
/* 180 */                   i14 = i11 > i13 ? 1 : 0;
/* 181 */                   if (i14 != 0) {
/* 182 */                     i18 = paramInt10;
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/* 187 */                     i15 = i12 < i13 ? 1 : 0;
/* 188 */                     i16 = (i15 != 0) || (i14 != 0) ? 1 : 0;
/* 189 */                     i17 = i15 != 0 ? paramInt3 : paramInt10;
/*     */                     
/*     */ 
/* 192 */                     while (i15 != 0)
/*     */                     {
/* 194 */                       if (i16 != 0) {
/* 195 */                         i18 = i17;
/*     */                         
/*     */                         break label496;
/*     */                       }
/* 199 */                       continue;
/*     */                       
/*     */ 
/*     */                       break label496;
/*     */                     }
/*     */                     
/* 205 */                     i20 = i13;
/* 206 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   label496:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 217 */                   i19 = (MainMemory.getI32(i18 + paramInt25) << 1) - i13;
/* 218 */                   i13 = i19;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */               if (paramBoolean) {
/* 229 */                 f7 = f2;
/* 230 */                 i41 = i8;
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/* 235 */                 i21 = i * i20 + i6;
/* 236 */                 i22 = i8 + 1;
/* 237 */                 i23 = (i8 << 3) + 8;
/* 238 */                 f3 = f2;
/* 239 */                 i24 = 0;
/*     */                 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 244 */                   i25 = paramInt7 + paramInt17 * i24;
/* 245 */                   i26 = paramInt15 + i24;
/* 246 */                   i27 = paramInt12 + (i23 + (i24 << 3));
/* 247 */                   i28 = MainMemory.getI32(paramInt19);
/* 248 */                   i29 = MainMemory.getI32(paramInt14);
/* 249 */                   if (i28 == i29) {
/* 250 */                     i37 = i25;
/*     */                   }
/*     */                   else
/*     */                   {
/* 254 */                     i30 = i25;
/*     */                     
/*     */                     for (;;)
/*     */                     {
/* 258 */                       i31 = i28 > i30 ? 1 : 0;
/* 259 */                       if (i31 != 0) {
/* 260 */                         i35 = paramInt21;
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/* 265 */                         i32 = i29 < i30 ? 1 : 0;
/* 266 */                         i33 = (i32 != 0) || (i31 != 0) ? 1 : 0;
/* 267 */                         i34 = i32 != 0 ? paramInt23 : paramInt21;
/*     */                         
/*     */ 
/* 270 */                         while (i32 != 0)
/*     */                         {
/* 272 */                           if (i33 != 0) {
/* 273 */                             i35 = i34;
/*     */                             
/*     */                             break label759;
/*     */                           }
/* 277 */                           continue;
/*     */                           
/*     */ 
/*     */                           break label759;
/*     */                         }
/*     */                         
/* 283 */                         i37 = i30;
/* 284 */                         break;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */                       label759:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/* 295 */                       i36 = (MainMemory.getI32(i35 + paramInt16) << 1) - i30;
/* 296 */                       i30 = i36;
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */                   i38 = i21 + i37;
/* 307 */                   if (MainMemory.getI8(paramInt4 + i38) == 0) {
/* 308 */                     f6 = f3;
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/* 313 */                     d1 = f3;
/* 314 */                     f4 = MainMemory.getF32(paramInt11 + (i38 << 2));
/* 315 */                     d2 = f4;
/* 316 */                     d3 = MainMemory.getF64(i27) * d2;
/* 317 */                     d4 = d1 - d3;
/* 318 */                     f5 = (float)d4;
/* 319 */                     MainMemory.setF32(paramInt2, f5);
/* 320 */                     f6 = f5;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */                   i39 = i24 + 1;
/* 330 */                   if (i26 > paramInt13)
/*     */                   {
/* 332 */                     i40 = i22 + i24;
/* 333 */                     f7 = f6;
/* 334 */                     i41 = i40; break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 340 */                   f3 = f6;
/* 341 */                   i24 = i39;
/*     */                 }
/*     */               }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */               i42 = i7 + 1;
/* 359 */               if (i10 > paramInt13) {
/* 360 */                 f8 = f7;
/* 361 */                 i43 = i41; break;
/*     */               }
/*     */               
/*     */ 
/* 365 */               f2 = f7;
/* 366 */               i7 = i42;
/* 367 */               i8 = i41;
/*     */             }
/*     */           }
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
/*     */ 
/*     */ 
/* 382 */           i44 = k + 1;
/* 383 */           if (i1 > paramInt13) {
/*     */             break;
/*     */           }
/*     */           
/* 387 */           f1 = f8;
/* 388 */           k = i44;
/* 389 */           m = i43;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       
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
/*     */ 
/* 411 */       _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE.time(1, l);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE_047.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */