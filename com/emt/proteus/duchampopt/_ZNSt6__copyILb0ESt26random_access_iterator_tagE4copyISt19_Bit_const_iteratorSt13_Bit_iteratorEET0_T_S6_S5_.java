/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyISt19_Bit_const_iteratorSt13_Bit_iteratorEET0_T_S6_S5_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 148;
/*  11 */   public static final Function _instance = new _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyISt19_Bit_const_iteratorSt13_Bit_iteratorEET0_T_S6_S5_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyISt19_Bit_const_iteratorSt13_Bit_iteratorEET0_T_S6_S5_() { super("_ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyISt19_Bit_const_iteratorSt13_Bit_iteratorEET0_T_S6_S5_", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k, m, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       n = MainMemory.getI32(paramInt2);
/*  60 */       j = paramInt3 - n << 3;
/*  61 */       paramInt3 = paramInt2 + 4;
/*  62 */       i3 = MainMemory.getI32(paramInt3);
/*  63 */       if (paramInt4 - i3 + j <= 0) {
/*     */         break label361;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       i = paramInt5 + 4;
/*  74 */       m = MainMemory.getI32(i);
/*  75 */       k = MainMemory.getI32(paramInt5);
/*  76 */       paramInt4 = j + paramInt4 - i3;
/*  77 */       j = 1;
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
/*     */       for (;;)
/*     */       {
/*  92 */         i1 = 1 << m;
/*  93 */         i2 = MainMemory.getI32(k);
/*  94 */         if ((MainMemory.getI32(n) & 1 << i3) != 0) {
/*     */           break label172;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         i1 = i2 & (i1 ^ 0xFFFFFFFF);
/*     */         
/*     */         break label185;
/*     */         
/*     */         label172:
/*     */         
/* 110 */         i1 = i2 | i1;
/*     */         
/*     */ 
/*     */ 
/*     */         label185:
/*     */         
/*     */ 
/*     */ 
/* 118 */         MainMemory.setI32(k, i1);
/* 119 */         i3 += 1;
/* 120 */         if (i3 != 32) {
/*     */           break label235;
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
/* 132 */         n += 4;
/*     */         
/* 134 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label235:
/*     */         
/*     */ 
/*     */ 
/* 142 */         m += 1;
/* 143 */         if (m != 32) {
/*     */           break label278;
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
/* 155 */         k += 4;
/*     */         
/* 157 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label278:
/*     */         
/*     */ 
/*     */ 
/* 165 */         if (j != paramInt4) {
/*     */           break label343;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */         MainMemory.setI32(paramInt3, i3);
/* 176 */         MainMemory.setI32(paramInt2, n);
/* 177 */         MainMemory.setI32(i, m);
/* 178 */         MainMemory.setI32(paramInt5, k);
/* 179 */         paramInt4 = m;
/* 180 */         paramInt3 = k;
/* 181 */         break;
/*     */         
/*     */         label343:
/*     */         
/* 185 */         j += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label361:
/*     */       
/*     */ 
/*     */ 
/* 195 */       paramInt3 = MainMemory.getI32(paramInt5);
/* 196 */       paramInt4 = MainMemory.getI32(paramInt5 + 4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */       MainMemory.setI32(paramInt1, paramInt3);
/* 207 */       MainMemory.setI32(paramInt1 + 4, paramInt4); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6__copyILb0ESt26random_access_iterator_tagE4copyISt19_Bit_const_iteratorSt13_Bit_iteratorEET0_T_S6_S5_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */