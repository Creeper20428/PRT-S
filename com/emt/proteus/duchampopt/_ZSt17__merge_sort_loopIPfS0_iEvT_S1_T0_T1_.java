/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1349;
/*  11 */   public static final Function _instance = new _ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_() { super("_ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  36 */     call(i, j, k, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     float f1 = 0.0F;
/*  54 */     float f2 = 0.0F;
/*  55 */     int i6 = 0;
/*  56 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       i = paramInt4 << 1;
/*  63 */       j = paramInt2;
/*  64 */       if (j - paramInt1 >> 2 < i) {
/*  65 */         n = paramInt1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  76 */         k = (paramInt4 != 0) && (i != paramInt4) ? 1 : 0;
/*  77 */         m = 0;
/*  78 */         n = paramInt3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  86 */         i4 = i * m;
/*  87 */         paramInt3 = paramInt1 + (i + i4 << 2);
/*  88 */         i3 = paramInt1 + (i4 << 2);
/*  89 */         i1 = paramInt1 + (i4 + paramInt4 << 2);
/*  90 */         if (k != 0) {
/*  91 */           i2 = 0;
/*     */           
/*  93 */           i6 = i1;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  99 */           i6 = i1;
/*     */           
/*     */ 
/*     */ 
/*     */           break label302;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 109 */           i4 = i2 + 1;
/* 110 */           i5 = n + (i2 << 2);
/* 111 */           f1 = MainMemory.getF32(i6);
/* 112 */           f2 = MainMemory.getF32(i3);
/* 113 */           if (!com.emt.proteus.lib.api.MathUtils.f_olt(f1, f2)) {
/*     */             break label243;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */           MainMemory.setF32(i5, f1);
/* 124 */           i6 += 4;
/*     */           
/*     */ 
/*     */           break label261;
/*     */           
/*     */           label243:
/*     */           
/* 131 */           MainMemory.setF32(i5, f2);
/* 132 */           i3 += 4;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label261:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 142 */           if ((i3 == i1) || (i6 == paramInt3)) break;
/* 143 */           i2 = i4;
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
/*     */ 
/* 155 */         n += (i4 << 2);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label302:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         i4 = i1 - i3;
/* 168 */         SystemLibrary.memmove(n, i3, i4, 4);
/* 169 */         i2 = i4 >> 2;
/* 170 */         i4 = paramInt3;
/* 171 */         i7 = i4 - i6;
/* 172 */         SystemLibrary.memmove(n + (i2 << 2), i6, i7, 4);
/* 173 */         i1 = n + ((i7 >> 2) + i2 << 2);
/* 174 */         if (j - i4 >> 2 < i) {
/* 175 */           n = paramInt3;
/* 176 */           paramInt3 = i1;
/*     */         }
/*     */         else
/*     */         {
/*     */           break label637;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */         i = j - n >> 2;
/* 189 */         paramInt4 = i > paramInt4 ? paramInt4 : i;
/* 190 */         paramInt1 = n + (paramInt4 << 2);
/* 191 */         if ((paramInt4 != 0) && (paramInt1 != paramInt2)) {
/* 192 */           i = 0;
/* 193 */           i1 = n;
/* 194 */           n = paramInt1;
/*     */         }
/*     */         else
/*     */         {
/* 198 */           paramInt2 = n;
/*     */           
/* 200 */           i1 = paramInt1;
/*     */           
/*     */ 
/*     */ 
/*     */           break label598;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 210 */           paramInt4 = i + 1;
/* 211 */           i3 = paramInt3 + (i << 2);
/* 212 */           f1 = MainMemory.getF32(n);
/* 213 */           f2 = MainMemory.getF32(i1);
/* 214 */           if (!com.emt.proteus.lib.api.MathUtils.f_olt(f1, f2)) {
/*     */             break label537;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */           MainMemory.setF32(i3, f1);
/* 225 */           n += 4;
/*     */           
/*     */ 
/*     */           break label555;
/*     */           
/*     */           label537:
/*     */           
/* 232 */           MainMemory.setF32(i3, f2);
/* 233 */           i1 += 4;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label555:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 243 */           if ((i1 == paramInt1) || (n == paramInt2)) break;
/* 244 */           i = paramInt4;
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
/*     */ 
/* 256 */         paramInt3 += (paramInt4 << 2);
/* 257 */         paramInt2 = i1;
/*     */         
/* 259 */         i1 = n;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label598:
/*     */         
/*     */ 
/*     */ 
/* 268 */         paramInt4 = paramInt1 - paramInt2;
/* 269 */         SystemLibrary.memmove(paramInt3, paramInt2, paramInt4, 4);
/* 270 */         SystemLibrary.memmove(paramInt3 + (paramInt4 >> 2 << 2), i1, j - i1, 4);
/* 271 */         break;
/*     */         
/*     */ 
/*     */         label637:
/*     */         
/*     */ 
/* 277 */         m += 1;
/*     */         
/* 279 */         n = i1;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt17__merge_sort_loopIPfS0_iEvT_S1_T0_T1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */