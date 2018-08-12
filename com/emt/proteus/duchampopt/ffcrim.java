/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffcrim
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3573;
/*  14 */   public static final Function _instance = new ffcrim();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffcrim() { super("ffcrim", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  41 */     int i1 = call(i, j, k, m, n);
/*  42 */     paramFrame.setI32(paramInt1, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*     */     
/*     */ 
/*  57 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       j = MainMemory.alloc(160);
/*  62 */       k = MainMemory.getI32(paramInt5);
/*  63 */       if (k <= 0) {
/*     */         break label70;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       i = k;
/*     */       
/*     */ 
/*     */       break label314;
/*     */       
/*     */       label70:
/*     */       
/*  80 */       k = MainMemory.getI32(paramInt1);
/*  81 */       m = paramInt1 + 4;
/*  82 */       n = MainMemory.getI32(m);
/*  83 */       i1 = MainMemory.getI32(n + 64);
/*  84 */       if (k == i1) {
/*  85 */         k = i1;
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
/*  96 */         ffmahd.call(paramInt1, k + 1, 0, paramInt5);
/*  97 */         n = MainMemory.getI32(m);
/*  98 */         k = MainMemory.getI32(n + 64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       if (MainMemory.getI64(n + 88) != MainMemory.getI64(MainMemory.getI32(n + 84) + (k << 3)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         ffcrhd.call(paramInt1, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 124 */       if (paramInt3 <= 0) {
/*     */         break label292;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       k = MathUtils.ugt(0 - paramInt3, -20) ? paramInt3 : 20;
/* 135 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 142 */         MainMemory.setI64(j + (i1 << 3), MainMemory.getI32(paramInt4 + (i1 << 2)));
/* 143 */         i1 += 1;
/* 144 */         if (i1 == k) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label292:
/*     */       
/*     */ 
/*     */ 
/* 155 */       ffphprll.call(paramInt1, paramInt2, paramInt3, j, paramInt5);
/* 156 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       label314:
/*     */       
/*     */ 
/* 162 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 167 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcrim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */