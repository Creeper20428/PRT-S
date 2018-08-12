/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZdlPvRKSt9nothrow_t;
/*     */ import com.emt.proteus.runtime.library.cpp._ZnwjRKSt9nothrow_t;
/*     */ 
/*     */ public final class _ZSt11stable_sortIP4PairEvT_S2_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1260;
/*  15 */   public static final Function _instance = new _ZSt11stable_sortIP4PairEvT_S2_();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZSt11stable_sortIP4PairEvT_S2_() { super("_ZSt11stable_sortIP4PairEvT_S2_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       j = (paramInt2 - paramInt1) / 12;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  63 */         if (j <= 0) {
/*     */           break label309;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         i = _ZnwjRKSt9nothrow_t.call(j * 12, -1);
/*  74 */         if (i != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         j /= 2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  90 */       k = paramInt1 + 4;
/*  91 */       m = paramInt1 + 8;
/*  92 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  99 */         i1 = n * 12;
/* 100 */         i2 = i + i1;
/* 101 */         if (i2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */           i3 = i + (i1 + 8);
/* 112 */           MainMemory.setI32(i2, 12584);
/* 113 */           MainMemory.setF32(i + (i1 + 4), MainMemory.getF32(k));
/* 114 */           MainMemory.setF32(i3, MainMemory.getF32(m));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 120 */         n += 1;
/* 121 */         if (n == j) {
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
/* 132 */       i4 = i;
/* 133 */       _ZSt22__stable_sort_adaptiveIP4PairS1_iEvT_S2_T0_T1_.call(paramInt1, paramInt2, i4, j);
/* 134 */       if (j == 0) {
/* 135 */         paramInt1 = i4;
/*     */         break label321;
/*     */       } else {
/* 138 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 147 */         i1 = n + 1;
/* 148 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i4 + n * 12)), i4 + n * 12);
/* 149 */         if (i1 == j) {
/* 150 */           paramInt1 = i4;
/*     */           break label321;
/*     */           break; }
/* 153 */         n = i1;
/*     */       }
/*     */       
/*     */ 
/*     */       label309:
/*     */       
/*     */ 
/* 160 */       _ZSt21__inplace_stable_sortIP4PairEvT_S2_.call(paramInt1, paramInt2);
/* 161 */       paramInt1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */       label321:
/*     */       
/*     */ 
/* 168 */       _ZdlPvRKSt9nothrow_t.call(paramInt1, -1);
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt11stable_sortIP4PairEvT_S2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */