/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZNSt6vectorISsSaISsEE6resizeEjSs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2630;
/*  13 */   public static final Function _instance = new _ZNSt6vectorISsSaISsEE6resizeEjSs();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt6vectorISsSaISsEE6resizeEjSs() { super("_ZNSt6vectorISsSaISsEE6resizeEjSs", 3, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       i = paramInt1 + 4;
/*  54 */       j = MainMemory.getI32(i);
/*  55 */       k = MainMemory.getI32(paramInt1);
/*  56 */       m = j - k >> 2;
/*  57 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(m, paramInt2)) {
/*     */         break label165;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */       paramInt3 = k + (paramInt2 << 2);
/*  68 */       if (j != paramInt3)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */         m = paramInt2 + 1;
/*  79 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  86 */           _ZNSsD1Ev.call(k + (n + paramInt2 << 2));
/*  87 */           i1 = n + 1;
/*  88 */           if (k + (m + n << 2) == j) {
/*     */             break;
/*     */           }
/*     */           
/*  92 */           n = i1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  99 */       MainMemory.setI32(i, paramInt3);
/*     */       
/*     */ 
/*     */       break label181;
/*     */       
/*     */       label165:
/*     */       
/* 106 */       _ZNSt6vectorISsSaISsEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPSsS1_EEjRKSs.call(paramInt1, j, paramInt2 - m, paramInt3);
/*     */       
/*     */ 
/*     */       label181:
/*     */       
/*     */ 
/* 112 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorISsSaISsEE6resizeEjSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */