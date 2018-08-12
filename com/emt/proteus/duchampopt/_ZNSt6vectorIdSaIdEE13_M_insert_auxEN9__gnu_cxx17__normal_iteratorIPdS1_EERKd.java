/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIdSaIdEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPdS1_EERKd extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 345;
/*  13 */   public static final Function _instance = new _ZNSt6vectorIdSaIdEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPdS1_EERKd();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt6vectorIdSaIdEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPdS1_EERKd() { super("_ZNSt6vectorIdSaIdEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPdS1_EERKd", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     call(i, j, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     double d = 0.0D;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       i = paramInt1 + 4;
/*  57 */       n = MainMemory.getI32(i);
/*  58 */       j = paramInt1 + 8;
/*  59 */       if (n != MainMemory.getI32(j)) {
/*     */         break label402;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       i2 = n - MainMemory.getI32(paramInt1);
/*  70 */       k = i2 >> 3;
/*  71 */       switch (k) {
/*     */       case 536870911: 
/*     */         break;
/*  74 */       case 0:  i2 = 1;
/*     */         
/*     */ 
/*     */         break label155;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  83 */       com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       i2 = i2 >> 2 & 0xFFFFFFFE;
/*     */       
/*     */ 
/*     */ 
/*     */       label155:
/*     */       
/*     */ 
/*     */ 
/*  97 */       if (com.emt.proteus.lib.api.MathUtils.ult(i2, k)) {
/*  98 */         k = 536870911;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 108 */       else if (!com.emt.proteus.lib.api.MathUtils.ugt(i2, 536870911))
/*     */       {
/*     */ 
/*     */ 
/* 112 */         k = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 119 */         com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       m = SystemLibrary.newobject(k << 3);
/* 127 */       n = m;
/* 128 */       i1 = MainMemory.getI32(paramInt1);
/* 129 */       i2 = paramInt2;
/* 130 */       i3 = i2 - i1;
/* 131 */       SystemLibrary.memmove(m, i1, i3, 8);
/* 132 */       i3 >>= 3;
/* 133 */       i1 = n + (i3 << 3);
/* 134 */       if (i1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */         MainMemory.setF64(i1, MainMemory.getF64(paramInt3));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 150 */       i3 += 1;
/* 151 */       i2 = MainMemory.getI32(i) - i2;
/* 152 */       SystemLibrary.memmove(n + (i3 << 3), paramInt2, i2, 8);
/* 153 */       paramInt2 = n + ((i2 >> 3) + i3 << 3);
/* 154 */       paramInt3 = MainMemory.getI32(paramInt1);
/* 155 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         SystemLibrary.delete(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 171 */       MainMemory.setI32(paramInt1, n);
/* 172 */       MainMemory.setI32(i, paramInt2);
/* 173 */       MainMemory.setI32(j, n + (k << 3));
/*     */       
/*     */ 
/*     */       break label498;
/*     */       
/*     */       label402:
/*     */       
/* 180 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */         MainMemory.setF64(n, MainMemory.getF64(n + -8));
/* 192 */         n = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */       MainMemory.setI32(i, n + 8);
/* 201 */       d = MainMemory.getF64(paramInt3);
/* 202 */       k = n + -8 - paramInt2;
/* 203 */       SystemLibrary.memmove(n + (0 - (k >> 3) << 3), paramInt2, k & 0xFFFFFFF8, 8);
/* 204 */       MainMemory.setF64(paramInt2, d);
/*     */       
/*     */ 
/*     */       label498:
/*     */       
/*     */ 
/* 210 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIdSaIdEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPdS1_EERKd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */