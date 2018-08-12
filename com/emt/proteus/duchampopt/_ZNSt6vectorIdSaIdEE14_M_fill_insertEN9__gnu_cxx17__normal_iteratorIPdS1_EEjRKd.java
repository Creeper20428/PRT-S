/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 499;
/*  13 */   public static final Function _instance = new _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd() { super("_ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd", 4, false); }
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
/*  48 */     double d = 0.0D;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
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
/*  74 */         m = k;
/*  75 */         if (!MathUtils.ult(MainMemory.getI32(i) - m >> 3, paramInt3)) {
/*     */           break label434;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         m = m - MainMemory.getI32(paramInt1) >> 3;
/*  86 */         if (!MathUtils.ult(536870911 - m, paramInt3)) {
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
/* 104 */           m = 536870911;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 114 */         else if (!MathUtils.ugt(i2, 536870911))
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
/* 132 */         n = SystemLibrary.newobject(m << 3);
/* 133 */         k = n;
/* 134 */         i1 = MainMemory.getI32(paramInt1);
/* 135 */         i2 = paramInt2;
/* 136 */         i3 = i2 - i1;
/* 137 */         SystemLibrary.memmove(n, i1, i3, 8);
/* 138 */         i4 = i3 >> 3;
/* 139 */         d = MainMemory.getF64(paramInt4);
/* 140 */         i3 &= 0xFFFFFFF8;
/* 141 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           MainMemory.setF64(n + (i3 + (i5 << 3)), d);
/* 149 */           i5 += 1;
/* 150 */           if (i5 == paramInt3) {
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
/* 163 */         SystemLibrary.memmove(k + (paramInt3 << 3), paramInt2, i2, 8);
/* 164 */         paramInt2 = k + ((i2 >> 3) + paramInt3 << 3);
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
/* 184 */         MainMemory.setI32(i, k + (m << 3));
/*     */         
/*     */ 
/*     */         break label784;
/*     */         
/*     */         label434:
/*     */         
/* 191 */         d = MainMemory.getF64(paramInt4);
/* 192 */         i4 = paramInt2;
/* 193 */         m -= i4;
/* 194 */         i2 = m >> 3;
/* 195 */         if (!MathUtils.ugt(i2, paramInt3)) {
/*     */           break label593;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */         paramInt4 = k + (0 - paramInt3 << 3);
/* 206 */         SystemLibrary.memmove(k, paramInt4, paramInt3 << 3, 8);
/* 207 */         MainMemory.setI32(j, MainMemory.getI32(j) + (paramInt3 << 3));
/* 208 */         m = paramInt4 - i4;
/* 209 */         SystemLibrary.memmove(k + (0 - (m >> 3) << 3), paramInt2, m & 0xFFFFFFF8, 8);
/* 210 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 217 */           i2 = m + 1;
/* 218 */           MainMemory.setF64(paramInt2 + (m << 3), d);
/* 219 */           if (i2 == paramInt3) { break label779;
/* 220 */             break;
/*     */           }
/* 222 */           m = i2;
/*     */         }
/*     */         
/*     */ 
/*     */         label593:
/*     */         
/*     */ 
/* 229 */         if (i2 == paramInt3) {
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
/* 240 */           i4 = paramInt3 - i2;
/* 241 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 248 */             MainMemory.setF64(k + (i3 << 3), d);
/* 249 */             i3 += 1;
/* 250 */             if (i3 == i4) {
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
/* 269 */         paramInt4 += (paramInt3 - i2 << 3);
/* 270 */         MainMemory.setI32(j, paramInt4);
/* 271 */         SystemLibrary.memmove(paramInt4, paramInt2, m, 8);
/* 272 */         MainMemory.setI32(j, MainMemory.getI32(j) + (i2 << 3));
/* 273 */         if (k == paramInt2) {
/*     */           break label779;
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
/* 285 */           m = paramInt3 + 1;
/* 286 */           paramInt4 = paramInt2 + (m << 3);
/* 287 */           MainMemory.setF64(paramInt2 + (paramInt3 << 3), d);
/* 288 */           if (paramInt4 == k) {
/*     */             break;
/*     */           }
/*     */           
/* 292 */           paramInt3 = m;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label779:
/*     */       
/*     */ 
/*     */       label784:
/*     */       
/*     */ 
/* 304 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */