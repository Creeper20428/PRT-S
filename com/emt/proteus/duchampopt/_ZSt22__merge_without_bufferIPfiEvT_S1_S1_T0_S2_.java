/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt22__merge_without_bufferIPfiEvT_S1_S1_T0_S2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1274;
/*  13 */   public static final Function _instance = new _ZSt22__merge_without_bufferIPfiEvT_S1_S1_T0_S2_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZSt22__merge_without_bufferIPfiEvT_S1_S1_T0_S2_() { super("_ZSt22__merge_without_bufferIPfiEvT_S1_S1_T0_S2_", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m, n);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     float f1 = 0.0F;
/*  49 */     float f2 = 0.0F;
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       if ((paramInt4 == 0) || (paramInt5 != 0))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         if (paramInt5 + paramInt4 != 2) {
/*     */           break label136;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         f1 = MainMemory.getF32(paramInt2);
/*  83 */         f2 = MainMemory.getF32(paramInt1);
/*  84 */         if (!MathUtils.f_olt(f1, f2)) {
/*     */           break label126;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         MainMemory.setF32(paramInt1, f1);
/*  95 */         MainMemory.setF32(paramInt2, f2);
/*     */         
/*     */ 
/*     */         break label520;
/*     */       }
/*     */       
/*     */ 
/*     */       label126:
/*     */       
/*     */       break label520;
/*     */       
/*     */       label136:
/*     */       
/* 108 */       if (paramInt4 <= paramInt5) {
/*     */         break label313;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       j = paramInt4 / 2;
/* 119 */       i = paramInt1 + (j << 2);
/* 120 */       k = paramInt2;
/* 121 */       i1 = paramInt3 - k >> 2;
/*     */       
/* 123 */       i2 = paramInt2;
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
/* 138 */         if (i1 <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         m = i1 >> 1;
/* 149 */         if (!MathUtils.f_olt(MainMemory.getF32(i2 + (m << 2)), MainMemory.getF32(i)))
/*     */         {
/*     */ 
/*     */ 
/* 153 */           i1 = m;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 160 */           i2 += (m + 1 << 2);
/* 161 */           i1 = i1 + -1 - m;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 168 */       i1 = i2 - k >> 2;
/*     */       
/*     */ 
/* 171 */       k = j;
/* 172 */       j = i1;
/*     */       
/*     */       break label468;
/*     */       
/*     */       label313:
/* 177 */       j = paramInt5 / 2;
/* 178 */       i = paramInt2 + (j << 2);
/* 179 */       k = paramInt1;
/* 180 */       i1 = paramInt2 - k >> 2;
/*     */       
/* 182 */       n = paramInt1;
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
/* 197 */         if (i1 <= 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */         m = i1 >> 1;
/* 208 */         if (MathUtils.f_olt(MainMemory.getF32(i), MainMemory.getF32(n + (m << 2)))) {
/* 209 */           i1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 219 */           i2 = n + (m + 1 << 2);
/* 220 */           i1 = i1 + -1 - m;
/*     */           
/* 222 */           n = i2;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 227 */       k = n - k >> 2;
/* 228 */       i2 = i;
/* 229 */       i = n;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label468:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */       _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag.call(i, paramInt2, i2);
/* 242 */       paramInt2 = i + (i2 - paramInt2 >> 2 << 2);
/* 243 */       call(paramInt1, i, paramInt2, k, j);
/* 244 */       call(paramInt2, i2, paramInt3, paramInt4 - k, paramInt5 - j);
/*     */       
/*     */ 
/*     */       label520:
/*     */       
/*     */ 
/* 250 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__merge_without_bufferIPfiEvT_S1_S1_T0_S2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */