/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 339;
/*  11 */   public static final Function _instance = new _ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_() { super("_ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
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
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     double d1 = 0.0D;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       i = paramInt1;
/*  53 */       if (paramInt2 - i >> 3 > 1) {
/*  54 */         j = 0;
/*     */       } else {
/*     */         break label389;
/*     */       }
/*     */       
/*     */       label229:
/*     */       
/*     */       label276:
/*     */       
/*     */       do
/*     */       {
/*  65 */         k = paramInt2 + ((j ^ 0xFFFFFFFF) << 3);
/*  66 */         d1 = MainMemory.getF64(k);
/*  67 */         MainMemory.setF64(k, MainMemory.getF64(paramInt1));
/*  68 */         m = k - i >> 3;
/*  69 */         if (m > 2) {
/*  70 */           n = 2;
/*  71 */           i1 = 0;
/*  72 */           i2 = 0;
/*     */         }
/*     */         else
/*     */         {
/*  76 */           n = 2;
/*  77 */           i2 = 1;
/*  78 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */           break label229;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  88 */           i3 = i1 | 0x1;
/*  89 */           i3 = com.emt.proteus.lib.api.MathUtils.f_olt(MainMemory.getF64(paramInt1 + (n << 3)), MainMemory.getF64(paramInt1 + (i3 << 3))) ? i3 : n;
/*  90 */           MainMemory.setF64(paramInt1 + (i2 << 3), MainMemory.getF64(paramInt1 + (i3 << 3)));
/*  91 */           i2 = i3 << 1;
/*  92 */           n = i2 + 2;
/*  93 */           if (n >= m)
/*     */             break;
/*  95 */           i1 = i2;
/*  96 */           i2 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         i2 |= 0x1;
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
/* 118 */         if (n != m) {
/*     */           break label276;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         MainMemory.setF64(paramInt1 + (i3 << 3), MainMemory.getF64(paramInt1 + (i2 << 3)));
/* 130 */         i3 = i2;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 137 */           n = (i3 + -1) / 2;
/* 138 */           if (i3 <= 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */           d2 = MainMemory.getF64(paramInt1 + (n << 3));
/* 149 */           if (com.emt.proteus.lib.api.MathUtils.f_uge(d2, d1)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           MainMemory.setF64(paramInt1 + (i3 << 3), d2);
/* 160 */           i3 = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 165 */         MainMemory.setF64(paramInt1 + (i3 << 3), d1);
/* 166 */         j += 1;
/* 167 */       } while (m > 1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label389:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt9sort_heapIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */