/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIiSaIiEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPiS1_EEjRKi extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2633;
/*  13 */   public static final Function _instance = new _ZNSt6vectorIiSaIiEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPiS1_EEjRKi();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt6vectorIiSaIiEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPiS1_EEjRKi() { super("_ZNSt6vectorIiSaIiEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPiS1_EEjRKi", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */         i = paramInt1 + 8;
/*  72 */         j = paramInt1 + 4;
/*  73 */         k = MainMemory.getI32(j);
/*  74 */         i2 = k;
/*  75 */         if (!MathUtils.ult(MainMemory.getI32(i) - i2 >> 2, paramInt3)) {
/*     */           break label432;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         m = i2 - MainMemory.getI32(paramInt1) >> 2;
/*  86 */         if (!MathUtils.ult(1073741823 - m, paramInt3)) {
/*     */           break label145;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc.call(65952);
/*     */         
/*     */ 
/*     */         label145:
/*     */         
/*     */ 
/* 102 */         i2 = (MathUtils.ult(m, paramInt3) ? paramInt3 : m) + m;
/* 103 */         if (MathUtils.ult(i2, m)) {
/* 104 */           m = 1073741823;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 114 */         else if (!MathUtils.ugt(i2, 1073741823))
/*     */         {
/*     */ 
/*     */ 
/* 118 */           m = i2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 125 */           com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         n = SystemLibrary.newobject(m << 2);
/* 133 */         k = n;
/* 134 */         i1 = MainMemory.getI32(paramInt1);
/* 135 */         i2 = paramInt2;
/* 136 */         i3 = i2 - i1;
/* 137 */         SystemLibrary.memmove(n, i1, i3, 4);
/* 138 */         i4 = i3 >> 2;
/* 139 */         i5 = MainMemory.getI32(paramInt4);
/* 140 */         i3 &= 0xFFFFFFFC;
/* 141 */         i6 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           MainMemory.setI32(n + (i3 + (i6 << 2)), i5);
/* 149 */           i6 += 1;
/* 150 */           if (i6 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */         paramInt3 = i4 + paramInt3;
/* 162 */         i2 = MainMemory.getI32(j) - i2;
/* 163 */         SystemLibrary.memmove(k + (paramInt3 << 2), paramInt2, i2, 4);
/* 164 */         paramInt2 = k + ((i2 >> 2) + paramInt3 << 2);
/* 165 */         paramInt4 = MainMemory.getI32(paramInt1);
/* 166 */         if (paramInt4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           SystemLibrary.delete(paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 182 */         MainMemory.setI32(paramInt1, k);
/* 183 */         MainMemory.setI32(j, paramInt2);
/* 184 */         MainMemory.setI32(i, k + (m << 2));
/*     */         
/*     */ 
/*     */         break label779;
/*     */         
/*     */         label432:
/*     */         
/* 191 */         m = MainMemory.getI32(paramInt4);
/* 192 */         i5 = paramInt2;
/* 193 */         i2 -= i5;
/* 194 */         i4 = i2 >> 2;
/* 195 */         if (!MathUtils.ugt(i4, paramInt3)) {
/*     */           break label589;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */         paramInt4 = k + (0 - paramInt3 << 2);
/* 206 */         SystemLibrary.memmove(k, paramInt4, paramInt3 << 2, 4);
/* 207 */         MainMemory.setI32(j, MainMemory.getI32(j) + (paramInt3 << 2));
/* 208 */         i2 = paramInt4 - i5;
/* 209 */         SystemLibrary.memmove(k + (0 - (i2 >> 2) << 2), paramInt2, i2 & 0xFFFFFFFC, 4);
/* 210 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 217 */           i4 = i2 + 1;
/* 218 */           MainMemory.setI32(paramInt2 + (i2 << 2), m);
/* 219 */           if (i4 == paramInt3) { break label774;
/* 220 */             break;
/*     */           }
/* 222 */           i2 = i4;
/*     */         }
/*     */         
/*     */ 
/*     */         label589:
/*     */         
/*     */ 
/* 229 */         if (i4 == paramInt3) {
/* 230 */           paramInt4 = k;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 240 */           i5 = paramInt3 - i4;
/* 241 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 248 */             MainMemory.setI32(k + (i3 << 2), m);
/* 249 */             i3 += 1;
/* 250 */             if (i3 == i5) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */           paramInt4 = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */         paramInt4 += (paramInt3 - i4 << 2);
/* 270 */         MainMemory.setI32(j, paramInt4);
/* 271 */         SystemLibrary.memmove(paramInt4, paramInt2, i2, 4);
/* 272 */         MainMemory.setI32(j, MainMemory.getI32(j) + (i4 << 2));
/* 273 */         if (k == paramInt2) {
/*     */           break label774;
/*     */         } else {
/* 276 */           paramInt3 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 285 */           i2 = paramInt3 + 1;
/* 286 */           paramInt4 = paramInt2 + (i2 << 2);
/* 287 */           MainMemory.setI32(paramInt2 + (paramInt3 << 2), m);
/* 288 */           if (paramInt4 == k) {
/*     */             break;
/*     */           }
/*     */           
/* 292 */           paramInt3 = i2;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label774:
/*     */       
/*     */ 
/*     */       label779:
/*     */       
/*     */ 
/* 304 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIiSaIiEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPiS1_EEjRKi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */