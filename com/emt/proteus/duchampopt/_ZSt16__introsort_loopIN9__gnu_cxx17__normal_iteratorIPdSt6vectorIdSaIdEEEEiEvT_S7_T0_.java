/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEiEvT_S7_T0_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 340;
/*  14 */   public static final Function _instance = new _ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEiEvT_S7_T0_();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEiEvT_S7_T0_() { super("_ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEiEvT_S7_T0_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     double d1 = 0.0D;
/*  46 */     int k = 0;
/*  47 */     double d2 = 0.0D;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     double d3 = 0.0D;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       i = paramInt1;
/*  60 */       j = paramInt3 + -1;
/*  61 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  70 */         i3 = j - i2;
/*  71 */         n = paramInt2 - i >> 3;
/*  72 */         if (n <= 16) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         if (i2 != paramInt3) {
/*     */           break label121;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         _ZSt13__heap_selectIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_S7_.call(paramInt1, paramInt2, paramInt2);
/*  93 */         _ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_.call(paramInt1, paramInt2);
/*     */         
/*     */ 
/*     */         break label522;
/*     */         
/*     */         label121:
/*     */         
/* 100 */         k = paramInt2 + -8;
/* 101 */         i1 = paramInt1 + (n / 2 << 3);
/* 102 */         d2 = MainMemory.getF64(paramInt1);
/* 103 */         d1 = MainMemory.getF64(i1);
/* 104 */         d3 = MainMemory.getF64(k);
/* 105 */         if (!MathUtils.f_olt(d2, d1)) {
/*     */           break label232;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         if (MathUtils.f_olt(d1, d3)) {
/* 116 */           k = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 126 */           k = MathUtils.f_olt(d2, d3) ? k : paramInt1;
/*     */           
/*     */           break label279;
/*     */           
/*     */           label232:
/*     */           
/* 132 */           if (MathUtils.f_olt(d2, d3)) {
/* 133 */             k = paramInt1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 143 */             k = MathUtils.f_olt(d1, d3) ? k : i1;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label279:
/*     */         
/*     */ 
/* 151 */         d1 = MainMemory.getF64(k);
/*     */         
/* 153 */         k = paramInt2;
/* 154 */         i1 = paramInt1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 163 */           if (MathUtils.f_olt(d2, d1)) {
/* 164 */             n = 0;
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/* 169 */             m = i1;
/*     */             
/*     */ 
/*     */             break label369;
/*     */           }
/*     */           
/*     */           do
/*     */           {
/* 177 */             n += 1;
/* 178 */             m = i1 + (n << 3);
/* 179 */             d2 = MainMemory.getF64(m);
/* 180 */           } while (MathUtils.f_olt(d2, d1));
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label369:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 202 */             i1 = k + ((n ^ 0xFFFFFFFF) << 3);
/* 203 */             d3 = MainMemory.getF64(i1);
/* 204 */             n += 1;
/* 205 */           } while (MathUtils.f_ogt(d3, d1));
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
/* 216 */           if (!MathUtils.ult(m, i1)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */           MainMemory.setF64(m, d3);
/* 227 */           MainMemory.setF64(i1, d2);
/* 228 */           m += 8;
/* 229 */           d2 = MainMemory.getF64(m);
/*     */           
/* 231 */           k = i1;
/* 232 */           i1 = m;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 237 */         call(m, paramInt2, i3);
/* 238 */         i2 += 1;
/*     */         
/* 240 */         paramInt2 = m;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label522:
/*     */       
/*     */ 
/*     */ 
/* 250 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__introsort_loopIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEiEvT_S7_T0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */