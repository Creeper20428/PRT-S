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
/*     */ public final class _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 979;
/*  14 */   public static final Function _instance = new _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE() { super("_ZN7duchamp12ObjectGrower4growEPNS_9DetectionE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     call(paramInt1, paramInt2);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
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
/*  61 */     int i17 = 0;
/*  62 */     int i18 = 0;
/*  63 */     int i19 = 0;
/*  64 */     int i20 = 0;
/*  65 */     int i21 = 0;
/*  66 */     int i22 = 0;
/*  67 */     int i23 = 0;
/*  68 */     int i24 = 0;
/*  69 */     int i25 = 0;
/*  70 */     int i26 = 0;
/*  71 */     int i27 = 0;
/*  72 */     int i28 = 0;
/*  73 */     int i29 = 0;
/*  74 */     int i30 = 0;
/*  75 */     int i31 = 0;
/*  76 */     int i32 = 0;
/*     */     
/*     */ 
/*  79 */     int i33 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  83 */       i = MainMemory.alloc(20);
/*  84 */       j = MainMemory.alloc(20);
/*  85 */       k = MainMemory.alloc(12);
/*  86 */       m = paramInt1 + 16;
/*  87 */       i2 = MainMemory.getI32(m);
/*  88 */       i8 = MainMemory.getI32(i2);
/*  89 */       i31 = MainMemory.getI32(i2 + 4);
/*  90 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(k, paramInt2);
/*  91 */       n = k + 4;
/*  92 */       i30 = MainMemory.getI32(k);
/*  93 */       i1 = (MainMemory.getI32(n) - i30) / 20;
/*  94 */       i2 = paramInt1 + 64;
/*  95 */       i3 = paramInt1 + 68;
/*  96 */       i4 = paramInt1 + 4;
/*  97 */       i5 = paramInt1 + 72;
/*  98 */       i6 = paramInt1 + 28;
/*  99 */       i7 = k + 8;
/* 100 */       i8 = i31 * i8;
/*     */       
/* 102 */       i31 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       i9 = (MainMemory.getI32(n) - i30) / 20;
/* 111 */       if (!MathUtils.ugt(i9, i31)) {
/*     */         break label799;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       i9 = MainMemory.getI32(i30 + i31 * 20 + 4);
/* 122 */       i10 = MainMemory.getI32(i30 + i31 * 20 + 8);
/* 123 */       i11 = MainMemory.getI32(i30 + i31 * 20 + 12);
/* 124 */       i18 = MainMemory.getI32(i2);
/* 125 */       i12 = MainMemory.getI32(m);
/* 126 */       i13 = MainMemory.getI32(i12) + -1;
/* 127 */       i14 = i18 + i9;
/* 128 */       i13 = i13 < i14 ? i13 : i14;
/* 129 */       i14 = MainMemory.getI32(i12 + 4) + -1;
/* 130 */       i15 = i18 + i10;
/* 131 */       i14 = i14 < i15 ? i14 : i15;
/* 132 */       i16 = MainMemory.getI32(i3);
/* 133 */       i15 = MainMemory.getI32(i12 + 8) + -1;
/* 134 */       i17 = i16 + i11;
/* 135 */       i15 = i15 < i17 ? i15 : i17;
/* 136 */       i16 = i11 - i16;
/* 137 */       i16 = i16 < 0 ? 0 : i16;
/* 138 */       i17 = i10 - i18;
/* 139 */       i17 = i17 < 0 ? 0 : i17;
/* 140 */       i18 = i9 - i18;
/* 141 */       i18 = i18 < 0 ? 0 : i18;
/* 142 */       i19 = i18 + i8 * i16;
/* 143 */       i26 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 150 */         i27 = i19 + i26;
/* 151 */         i28 = i18 + i26;
/* 152 */         if (i28 <= i13) {
/*     */           break label585;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         i31 += 1;
/* 163 */         i30 = MainMemory.getI32(k);
/*     */         
/*     */ 
/* 166 */         break;
/*     */         
/*     */         label585:
/*     */         
/* 170 */         i29 = i28 == i9 ? 1 : 0;
/* 171 */         i23 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         i24 = i17 + i23;
/* 179 */         if (i24 <= i14) {
/*     */           break label650;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         i26 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label650:
/*     */       
/* 195 */       i25 = (i24 == i10) && (i29 != 0) ? 1 : 0;
/* 196 */       i20 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 203 */         i21 = i27 + i8 * i20;
/* 204 */         i22 = i16 + i20;
/* 205 */         if (i22 <= i15) {
/*     */           break label730;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */         i23 += 1;
/*     */         
/* 217 */         break;
/*     */         
/*     */         label730:
/*     */         
/* 221 */         if ((i25 == 0) || (i22 != i11))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */           _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE_196.call(i28, i22, k, i5, n, i6, j, i4, m, i21, i7, i24);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 237 */         i20 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label799:
/*     */       
/* 243 */       i8 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 250 */         i31 = i1 + i8;
/* 251 */         if (!MathUtils.ugt(i9, i31)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */         i32 = MainMemory.getI32(MainMemory.getI32(paramInt2) + 12);
/* 262 */         _ZN9PixelInfo5VoxelC1ERKS0_.call(i, i30 + i31 * 20);
/* 263 */         SystemLibrary.do_indirect(i32, paramInt2, i);
/* 264 */         i8 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 270 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(k);
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
/* 281 */       MainMemory.dealloc_generated(i33);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp12ObjectGrower4growEPNS_9DetectionE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */