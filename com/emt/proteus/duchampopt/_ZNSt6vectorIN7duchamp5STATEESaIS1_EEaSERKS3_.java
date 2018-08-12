/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorIN7duchamp5STATEESaIS1_EEaSERKS3_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 976;
/*  12 */   public static final Function _instance = new _ZNSt6vectorIN7duchamp5STATEESaIS1_EEaSERKS3_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZNSt6vectorIN7duchamp5STATEESaIS1_EEaSERKS3_() { super("_ZNSt6vectorIN7duchamp5STATEESaIS1_EEaSERKS3_", 2, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       if (paramInt2 != paramInt1) {
/*     */         break label68;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label661;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label68:
/*     */       
/*     */ 
/*     */ 
/*  73 */       i = paramInt2 + 4;
/*  74 */       j = MainMemory.getI32(i);
/*  75 */       k = MainMemory.getI32(paramInt2);
/*  76 */       i6 = j - k;
/*  77 */       m = i6 >> 2;
/*  78 */       n = paramInt1 + 8;
/*  79 */       i1 = MainMemory.getI32(paramInt1);
/*  80 */       i2 = i1;
/*  81 */       if (!MathUtils.ult(MainMemory.getI32(n) - i2 >> 2, m)) {
/*     */         break label350;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       if (!MathUtils.ugt(m, 1073741823)) {
/*     */         break label173;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label173:
/*     */       
/*     */ 
/* 107 */       i3 = com.emt.proteus.runtime.api.SystemLibrary.newobject(i6 & 0xFFFFFFFC);
/* 108 */       i1 = i3;
/* 109 */       if (k == j) {
/*     */         break label291;
/*     */       } else {
/* 112 */         i2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 121 */         i6 = i2 + 1;
/* 122 */         i5 = k + (i6 << 2);
/* 123 */         i4 = i3 + (i2 << 2);
/* 124 */         if (i4 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */           MainMemory.setI32(i4, MainMemory.getI32(k + (i2 << 2)));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 140 */         if (i5 == j) {
/*     */           break;
/*     */         }
/*     */         
/* 144 */         i2 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */       label291:
/*     */       
/*     */ 
/* 151 */       k = MainMemory.getI32(paramInt1);
/* 152 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         com.emt.proteus.runtime.api.SystemLibrary.delete(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 168 */       MainMemory.setI32(paramInt1, i1);
/* 169 */       MainMemory.setI32(n, i1 + (m << 2));
/*     */       
/*     */       break label641;
/*     */       
/*     */       label350:
/* 174 */       n = paramInt1 + 4;
/* 175 */       i5 = MainMemory.getI32(n);
/* 176 */       i2 = i5 - i2 >> 2;
/* 177 */       if (!MathUtils.ult(i2, m)) {
/*     */         break label627;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */       if (i2 > 0) {
/* 188 */         i6 = 0;
/*     */       } else {
/*     */         break label490;
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
/*     */       for (;;)
/*     */       {
/* 203 */         MainMemory.setI32(i1 + (i6 << 2), MainMemory.getI32(k + (i6 << 2)));
/* 204 */         i6 += 1;
/* 205 */         if (i6 == i2) {
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
/* 216 */       i5 = MainMemory.getI32(n);
/* 217 */       j = MainMemory.getI32(i);
/* 218 */       k = MainMemory.getI32(paramInt2);
/* 219 */       i1 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label490:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */       i2 = i5 - i1 >> 2;
/* 234 */       if (k + (i2 << 2) != j)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */         i6 = i2 + 1;
/* 245 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 252 */           i1 = k + (i6 + i7 << 2);
/* 253 */           i8 = i5 + (i7 << 2);
/* 254 */           i9 = i7 + 1;
/* 255 */           if (i8 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */             MainMemory.setI32(i8, MainMemory.getI32(k + (i2 + i7 << 2)));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 271 */           if (i1 == j) { break label641;
/* 272 */             break;
/*     */           }
/* 274 */           i7 = i9;
/*     */         }
/*     */         
/*     */ 
/*     */         label627:
/*     */         
/*     */ 
/* 281 */         _ZNSt6vectorIN7duchamp5STATEESaIS1_EEaSERKS3__415.call(m, i1, k);
/*     */       }
/*     */       
/*     */ 
/*     */       label641:
/*     */       
/* 287 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt1) + (m << 2));
/*     */       
/*     */ 
/*     */       label661:
/*     */       
/*     */ 
/* 293 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN7duchamp5STATEESaIS1_EEaSERKS3_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */