/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIbSaIbEEaSERKS1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1863;
/*  12 */   public static final Function _instance = new _ZNSt6vectorIbSaIbEEaSERKS1_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorIbSaIbEEaSERKS1_() { super("_ZNSt6vectorIbSaIbEEaSERKS1_", 2, false); }
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
/*     */     
/*     */     try
/*     */     {
/*  59 */       i = MainMemory.alloc(8);
/*  60 */       j = MainMemory.alloc(8);
/*  61 */       k = MainMemory.alloc(8);
/*  62 */       if (paramInt2 != paramInt1) {
/*     */         break label95;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label527;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label95:
/*     */       
/*     */ 
/*     */ 
/*  78 */       m = paramInt2 + 4;
/*  79 */       n = MainMemory.getI32(m);
/*  80 */       i1 = MainMemory.getI32(paramInt2);
/*  81 */       i2 = paramInt2 + 12;
/*  82 */       i3 = MainMemory.getI32(i2);
/*  83 */       i4 = paramInt2 + 8;
/*  84 */       i5 = MainMemory.getI32(i4);
/*  85 */       i6 = paramInt1 + 4;
/*  86 */       i8 = MainMemory.getI32(paramInt1);
/*  87 */       i7 = paramInt1 + 16;
/*  88 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(i3 - n + (i5 - i1 << 3), (MainMemory.getI32(i7) - i8 << 3) - MainMemory.getI32(i6)))
/*     */       {
/*     */ 
/*     */ 
/*  92 */         i2 = i1;
/*  93 */         i6 = i5;
/*  94 */         n = i3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 102 */         if (i8 == 0) {
/* 103 */           i8 = i5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           SystemLibrary.delete(i8);
/* 117 */           n = MainMemory.getI32(m);
/* 118 */           i1 = MainMemory.getI32(paramInt2);
/* 119 */           i3 = MainMemory.getI32(i2);
/* 120 */           i8 = MainMemory.getI32(i4);
/*     */         }
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
/* 134 */         n = (i8 - i1 << 3) + (i3 - n);
/* 135 */         i3 = n + 31;
/* 136 */         i8 = SystemLibrary.newobject(i3 >>> 3 & 0x1FFFFFFC);
/* 137 */         MainMemory.setI32(i7, i8 + (i3 >>> 5 << 2));
/* 138 */         MainMemory.setI32(paramInt1, i8);
/* 139 */         MainMemory.setI32(i6, 0);
/* 140 */         i3 = n / 32;
/* 141 */         n %= 32;
/* 142 */         i9 = n < 0 ? 1 : 0;
/* 143 */         MainMemory.setI32(paramInt1 + 8, i8 + ((i9 != 0 ? i3 + -1 : i3) << 2));
/* 144 */         MainMemory.setI32(paramInt1 + 12, i9 != 0 ? n + 32 : n);
/* 145 */         n = MainMemory.getI32(i2);
/* 146 */         i6 = MainMemory.getI32(i4);
/* 147 */         i2 = MainMemory.getI32(paramInt2);
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
/* 161 */       i3 = i6;
/* 162 */       i10 = i3 - i2;
/* 163 */       SystemLibrary.memmove(i8, i2, i10, 4);
/* 164 */       i10 = i8 + (i10 >> 2 << 2);
/* 165 */       MainMemory.setI64(j, i3 & 0xFFFFFFFF);
/* 166 */       MainMemory.setI64(i, i10 & 0xFFFFFFFF);
/* 167 */       _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyISt19_Bit_const_iteratorSt13_Bit_iteratorEET0_T_S6_S5_.call(k, j, i6, n, i);
/* 168 */       MainMemory.setI32(paramInt1 + 8, MainMemory.getI32(k));
/* 169 */       MainMemory.setI32(paramInt1 + 12, MainMemory.getI32(k + 4));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label527:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIbSaIbEEaSERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */