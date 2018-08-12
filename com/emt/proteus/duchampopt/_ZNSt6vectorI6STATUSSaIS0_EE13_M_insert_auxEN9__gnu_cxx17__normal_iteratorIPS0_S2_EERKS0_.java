/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1090;
/*  13 */   public static final Function _instance = new _ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_() { super("_ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_", 3, false); }
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
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       i = paramInt1 + 4;
/*  60 */       n = MainMemory.getI32(i);
/*  61 */       j = paramInt1 + 8;
/*  62 */       if (n != MainMemory.getI32(j)) {
/*     */         break label597;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       i2 = n - MainMemory.getI32(paramInt1);
/*  73 */       k = i2 >> 2;
/*  74 */       switch (k) {
/*     */       case 1073741823: 
/*     */         break;
/*  77 */       case 0:  i2 = 1;
/*     */         
/*     */ 
/*     */         break label167;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  86 */       com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       i2 = i2 >> 1 & 0xFFFFFFFE;
/*     */       
/*     */ 
/*     */ 
/*     */       label167:
/*     */       
/*     */ 
/*     */ 
/* 100 */       if (MathUtils.ult(i2, k)) {
/* 101 */         k = 1073741823;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 111 */       else if (!MathUtils.ugt(i2, 1073741823))
/*     */       {
/*     */ 
/*     */ 
/* 115 */         k = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 122 */         com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       m = com.emt.proteus.runtime.api.SystemLibrary.newobject(k << 2);
/* 130 */       n = m;
/* 131 */       i1 = MainMemory.getI32(paramInt1);
/* 132 */       if (i1 == paramInt2) {
/* 133 */         i1 = n;
/*     */         break label371;
/*     */       } else {
/* 136 */         i2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 145 */         i3 = i2 << 2;
/* 146 */         i4 = i2 + 1;
/* 147 */         i5 = i1 + (i4 << 2);
/* 148 */         i6 = m + i3;
/* 149 */         if (i6 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           MainMemory.setI32(i6, MainMemory.getI32(i1 + (i2 << 2)));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 165 */         if (i5 == paramInt2) {
/*     */           break;
/*     */         }
/*     */         
/* 169 */         i2 = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */       i1 = m + (i3 + 4);
/*     */       
/*     */ 
/*     */ 
/*     */       label371:
/*     */       
/*     */ 
/*     */ 
/* 184 */       if (i1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         MainMemory.setI32(i1, MainMemory.getI32(paramInt3));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 200 */       paramInt3 = MainMemory.getI32(i);
/* 201 */       if (paramInt3 != paramInt2)
/*     */       {
/*     */ 
/*     */ 
/* 205 */         i2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 212 */         paramInt2 = i1 + 4;
/*     */         
/*     */         break label536;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 219 */         i3 = i2 + 1;
/* 220 */         i5 = i1 + (i3 << 2);
/* 221 */         i7 = paramInt2 + (i3 << 2);
/* 222 */         if (i5 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */           MainMemory.setI32(i5, MainMemory.getI32(paramInt2 + (i2 << 2)));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 238 */         if (i7 == paramInt3) {
/*     */           break;
/*     */         }
/*     */         
/* 242 */         i2 = i3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */       paramInt2 = i1 + (i2 + 2 << 2);
/*     */       
/*     */ 
/*     */ 
/*     */       label536:
/*     */       
/*     */ 
/*     */ 
/* 257 */       paramInt3 = MainMemory.getI32(paramInt1);
/* 258 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */         com.emt.proteus.runtime.api.SystemLibrary.delete(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 274 */       MainMemory.setI32(paramInt1, n);
/* 275 */       MainMemory.setI32(i, paramInt2);
/* 276 */       MainMemory.setI32(j, n + (k << 2));
/*     */       
/*     */ 
/*     */       break label744;
/*     */       
/*     */       label597:
/*     */       
/* 283 */       if (n != 0)
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
/* 294 */         MainMemory.setI32(n, MainMemory.getI32(n + -4));
/* 295 */         n = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */       MainMemory.setI32(i, n + 4);
/* 304 */       k = MainMemory.getI32(paramInt3);
/* 305 */       i2 = n + -4 - paramInt2 >> 2;
/* 306 */       if (i2 > 0) {
/* 307 */         i3 = 0;
/*     */       } else {
/*     */         break label733;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 318 */         MainMemory.setI32(n + ((i3 ^ 0xFFFFFFFF) << 2), MainMemory.getI32(n + (-2 - i3 << 2)));
/* 319 */         i3 += 1;
/* 320 */         if (i3 == i2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label733:
/*     */       
/*     */ 
/*     */ 
/* 331 */       MainMemory.setI32(paramInt2, k);
/*     */       
/*     */ 
/*     */       label744:
/*     */       
/*     */ 
/* 337 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorI6STATUSSaIS0_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS0_S2_EERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */