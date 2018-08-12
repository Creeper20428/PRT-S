/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 223;
/*  13 */   public static final Function _instance = new _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi() { super("_ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi", 3, false); }
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
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       i = paramInt1 + 4;
/*  56 */       n = MainMemory.getI32(i);
/*  57 */       j = paramInt1 + 8;
/*  58 */       if (n != MainMemory.getI32(j)) {
/*     */         break label416;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       i2 = n - MainMemory.getI32(paramInt1);
/*  69 */       k = i2 >> 2;
/*  70 */       switch (k) {
/*     */       case 1073741823: 
/*     */         break;
/*  73 */       case 0:  i2 = 1;
/*     */         
/*     */ 
/*     */         break label159;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  82 */       com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       i2 = i2 >> 1 & 0xFFFFFFFE;
/*     */       
/*     */ 
/*     */ 
/*     */       label159:
/*     */       
/*     */ 
/*     */ 
/*  96 */       if (com.emt.proteus.lib.api.MathUtils.ult(i2, k)) {
/*  97 */         k = 1073741823;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 107 */       else if (!com.emt.proteus.lib.api.MathUtils.ugt(i2, 1073741823))
/*     */       {
/*     */ 
/*     */ 
/* 111 */         k = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 118 */         com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       m = SystemLibrary.newobject(k << 2);
/* 126 */       n = m;
/* 127 */       i1 = MainMemory.getI32(paramInt1);
/* 128 */       i2 = paramInt2;
/* 129 */       i3 = i2 - i1;
/* 130 */       SystemLibrary.memmove(m, i1, i3, 4);
/* 131 */       i3 >>= 2;
/* 132 */       i1 = n + (i3 << 2);
/* 133 */       if (i1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */         MainMemory.setI32(i1, MainMemory.getI32(paramInt3));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 149 */       i3 += 1;
/* 150 */       i2 = MainMemory.getI32(i) - i2;
/* 151 */       SystemLibrary.memmove(n + (i3 << 2), paramInt2, i2, 4);
/* 152 */       paramInt2 = n + ((i2 >> 2) + i3 << 2);
/* 153 */       paramInt3 = MainMemory.getI32(paramInt1);
/* 154 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         SystemLibrary.delete(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 170 */       MainMemory.setI32(paramInt1, n);
/* 171 */       MainMemory.setI32(i, paramInt2);
/* 172 */       MainMemory.setI32(j, n + (k << 2));
/*     */       
/*     */ 
/*     */       break label514;
/*     */       
/*     */       label416:
/*     */       
/* 179 */       if (n != 0)
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
/* 190 */         MainMemory.setI32(n, MainMemory.getI32(n + -4));
/* 191 */         n = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       MainMemory.setI32(i, n + 4);
/* 200 */       k = MainMemory.getI32(paramInt3);
/* 201 */       i2 = n + -4 - paramInt2;
/* 202 */       SystemLibrary.memmove(n + (0 - (i2 >> 2) << 2), paramInt2, i2 & 0xFFFFFFFC, 4);
/* 203 */       MainMemory.setI32(paramInt2, k);
/*     */       
/*     */ 
/*     */       label514:
/*     */       
/*     */ 
/* 209 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIiSaIiEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPiS1_EERKi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */