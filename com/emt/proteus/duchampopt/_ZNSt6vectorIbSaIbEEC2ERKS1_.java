/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorIbSaIbEEC2ERKS1_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 222;
/*  12 */   public static final Function _instance = new _ZNSt6vectorIbSaIbEEC2ERKS1_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorIbSaIbEEC2ERKS1_() { super("_ZNSt6vectorIbSaIbEEC2ERKS1_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     call(paramInt1, paramInt2);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i, j);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
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
/*     */     
/*     */ 
/*  55 */     int i11 = MainMemory.alloc_base_line();
/*     */     try
/*     */     {
/*  58 */       i = MainMemory.alloc(8);
/*  59 */       j = MainMemory.alloc(8);
/*  60 */       k = MainMemory.alloc(8);
/*  61 */       MainMemory.setI32(paramInt1, 0);
/*  62 */       m = paramInt1 + 4;
/*  63 */       MainMemory.setI32(m, 0);
/*  64 */       n = paramInt1 + 8;
/*  65 */       MainMemory.setI32(n, 0);
/*  66 */       i1 = paramInt1 + 12;
/*  67 */       MainMemory.setI32(i1, 0);
/*  68 */       i2 = paramInt1 + 16;
/*  69 */       MainMemory.setI32(i2, 0);
/*  70 */       i3 = paramInt2 + 12;
/*  71 */       i4 = paramInt2 + 8;
/*  72 */       i5 = (MainMemory.getI32(i4) - MainMemory.getI32(paramInt2) << 3) + (MainMemory.getI32(i3) - MainMemory.getI32(paramInt2 + 4));
/*  73 */       i6 = i5 + 31;
/*  74 */       i7 = com.emt.proteus.runtime.api.SystemLibrary.newobject(i6 >>> 3 & 0x1FFFFFFC);
/*  75 */       i8 = i7;
/*  76 */       MainMemory.setI32(i2, i8 + (i6 >>> 5 << 2));
/*  77 */       MainMemory.setI32(paramInt1, i8);
/*  78 */       MainMemory.setI32(m, 0);
/*  79 */       i6 = i5 / 32;
/*  80 */       i5 %= 32;
/*  81 */       i9 = i5 < 0 ? 1 : 0;
/*  82 */       MainMemory.setI32(n, i8 + ((i9 != 0 ? i6 + -1 : i6) << 2));
/*  83 */       MainMemory.setI32(i1, i9 != 0 ? i5 + 32 : i5);
/*  84 */       i5 = MainMemory.getI32(i3);
/*  85 */       i1 = MainMemory.getI32(i4);
/*  86 */       i3 = MainMemory.getI32(paramInt2);
/*  87 */       i6 = i1;
/*  88 */       i10 = i6 - i3;
/*  89 */       com.emt.proteus.runtime.api.SystemLibrary.memmove(i7, i3, i10, 4);
/*  90 */       i10 = i8 + (i10 >> 2 << 2);
/*  91 */       MainMemory.setI64(j, i6 & 0xFFFFFFFF);
/*  92 */       MainMemory.setI64(i, i10 & 0xFFFFFFFF);
/*  93 */       _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyISt19_Bit_const_iteratorSt13_Bit_iteratorEET0_T_S6_S5_.call(k, j, i1, i5, i);
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/* 101 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIbSaIbEEC2ERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */