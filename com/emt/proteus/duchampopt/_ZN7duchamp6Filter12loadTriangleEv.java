/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ public final class _ZN7duchamp6Filter12loadTriangleEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 501;
/*  15 */   public static final Function _instance = new _ZN7duchamp6Filter12loadTriangleEv();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp6Filter12loadTriangleEv() { super("_ZN7duchamp6Filter12loadTriangleEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     call(paramInt);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*  54 */     int i12 = 0;
/*  55 */     int i13 = 0;
/*  56 */     int i14 = 0;
/*  57 */     int i15 = 0;
/*     */     
/*     */ 
/*  60 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(4);
/*  65 */       j = MainMemory.alloc(4);
/*  66 */       k = MainMemory.alloc(8);
/*  67 */       m = MainMemory.alloc(8);
/*  68 */       n = MainMemory.alloc(8);
/*  69 */       i1 = MainMemory.alloc(8);
/*  70 */       MainMemory.setF64(i1, 0.0D);
/*  71 */       i2 = paramInt + 12;
/*  72 */       i3 = MainMemory.getI32(i2);
/*  73 */       i4 = paramInt + 8;
/*  74 */       i5 = MainMemory.getI32(i4);
/*  75 */       i6 = i3 - i5 >> 3;
/*  76 */       if (!MathUtils.ugt(i6, 3)) {
/*     */         break label186;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       MainMemory.setI32(i2, i5 + 24);
/*  87 */       i1 = i5;
/*     */       
/*     */       break label213;
/*     */       
/*     */       label186:
/*  92 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(paramInt + 8, i3, 3 - i6, i1);
/*  93 */       i1 = MainMemory.getI32(i4);
/*     */       
/*     */ 
/*     */ 
/*     */       label213:
/*     */       
/*     */ 
/*     */ 
/* 101 */       MainMemory.setF64(i1, 0.25D);
/* 102 */       MainMemory.setF64(MainMemory.getI32(i4) + 8, 0.5D);
/* 103 */       MainMemory.setF64(MainMemory.getI32(i4) + 16, 0.25D);
/* 104 */       _ZNSsaSEPKc.call(paramInt + 4, 59296);
/* 105 */       MainMemory.setI32(i, 0);
/* 106 */       i7 = paramInt + 36;
/* 107 */       i8 = MainMemory.getI32(i7);
/* 108 */       i9 = paramInt + 32;
/* 109 */       i10 = MainMemory.getI32(i9);
/* 110 */       i6 = i8 - i10 >> 2;
/* 111 */       if (!MathUtils.ugt(i6, 3)) {
/*     */         break label340;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       MainMemory.setI32(i7, i10 + 12);
/*     */       
/*     */       break label359;
/*     */       
/*     */       label340:
/* 126 */       _ZNSt6vectorIPS_IdSaIdEESaIS2_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS2_S4_EEjRKS2_.call(paramInt + 32, i8, 3 - i6, i);
/*     */       
/*     */ 
/*     */       label359:
/*     */       
/*     */ 
/* 132 */       MainMemory.setI32(j, 0);
/* 133 */       i11 = paramInt + 24;
/* 134 */       i12 = MainMemory.getI32(i11);
/* 135 */       i13 = paramInt + 20;
/* 136 */       i14 = MainMemory.getI32(i13);
/* 137 */       i6 = i12 - i14 >> 2;
/* 138 */       if (!MathUtils.ugt(i6, 3)) {
/*     */         break label444;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       MainMemory.setI32(i11, i14 + 12);
/* 149 */       j = i14;
/*     */       
/*     */       break label469;
/*     */       
/*     */       label444:
/* 154 */       _ZNSt6vectorIjSaIjEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPjS1_EEjRKj.call(paramInt + 20, i12, 3 - i6, j);
/* 155 */       j = MainMemory.getI32(i13);
/*     */       
/*     */ 
/*     */ 
/*     */       label469:
/*     */       
/*     */ 
/*     */ 
/* 163 */       MainMemory.setI32(j, 18);
/* 164 */       i15 = MainMemory.getI32(MainMemory.getI32(i9));
/* 165 */       MainMemory.setF64(k, 0.0D);
/* 166 */       i4 = i15 + 4;
/* 167 */       i1 = MainMemory.getI32(i4);
/* 168 */       i3 = MainMemory.getI32(i15);
/* 169 */       i6 = i1 - i3 >> 3;
/* 170 */       if (!MathUtils.ugt(i6, 19)) {
/*     */         break label566;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       MainMemory.setI32(i4, i3 + 152);
/* 181 */       i6 = 0;
/*     */       
/*     */       break label587;
/*     */       
/*     */       label566:
/* 186 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i15, i1, 19 - i6, k);
/* 187 */       i6 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label587:
/*     */         
/* 194 */         MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i9))) + (i6 << 3), MainMemory.getF64(147200 + (i6 << 3)));
/* 195 */         i6 += 1;
/* 196 */         if (i6 == 19) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */       MainMemory.setI32(MainMemory.getI32(i13) + 4, 12);
/* 208 */       i15 = MainMemory.getI32(MainMemory.getI32(i9) + 4);
/* 209 */       MainMemory.setF64(m, 0.0D);
/* 210 */       i4 = i15 + 4;
/* 211 */       k = MainMemory.getI32(i4);
/* 212 */       i1 = MainMemory.getI32(i15);
/* 213 */       i6 = k - i1 >> 3;
/* 214 */       if (!MathUtils.ugt(i6, 13)) {
/*     */         break label745;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */       MainMemory.setI32(i4, i1 + 104);
/* 225 */       i6 = 0;
/*     */       
/*     */       break label766;
/*     */       
/*     */       label745:
/* 230 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i15, k, 13 - i6, m);
/* 231 */       i6 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label766:
/*     */         
/* 238 */         MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i9) + 4)) + (i6 << 3), MainMemory.getF64(145152 + (i6 << 3)));
/* 239 */         i6 += 1;
/* 240 */         if (i6 == 12) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */       MainMemory.setI32(MainMemory.getI32(i13) + 8, 8);
/* 252 */       i15 = MainMemory.getI32(MainMemory.getI32(i9) + 8);
/* 253 */       MainMemory.setF64(n, 0.0D);
/* 254 */       i4 = i15 + 4;
/* 255 */       m = MainMemory.getI32(i4);
/* 256 */       k = MainMemory.getI32(i15);
/* 257 */       i6 = m - k >> 3;
/* 258 */       if (!MathUtils.ugt(i6, 9)) {
/*     */         break label927;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */       MainMemory.setI32(i4, k + 72);
/* 269 */       i6 = 0;
/*     */       
/*     */       break label949;
/*     */       
/*     */       label927:
/* 274 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i15, m, 9 - i6, n);
/* 275 */       i6 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label949:
/*     */         
/* 282 */         MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i9) + 8)) + (i6 << 3), MainMemory.getF64(141888 + (i6 << 3)));
/* 283 */         i6 += 1;
/* 284 */         if (i6 == 12) {
/*     */           break;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 305 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Filter12loadTriangleEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */