/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffthdu extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3254;
/*  12 */   public static final Function _instance = new ffthdu();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffthdu() { super("ffthdu", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*     */     
/*     */ 
/*  49 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         m = MainMemory.getI32(paramInt1);
/*  65 */         k = m + 1;
/*  66 */         MainMemory.setI32(paramInt2, m);
/*  67 */         if (MainMemory.getI64(MainMemory.getI32(paramInt1 + 4) + 112) != -1L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */           MainMemory.setI32(j, 0);
/*  78 */           if (ffmahd.call(paramInt1, k, 0, j) >= 1) {
/*     */             break label183;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */           m += 2;
/*  89 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/*  96 */             MainMemory.setI32(paramInt2, k + n);
/*  97 */             i1 = n + 1;
/*  98 */             if (ffmahd.call(paramInt1, m + n, 0, j) >= 1) break;
/*  99 */             n = i1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label183:
/*     */           
/*     */ 
/*     */ 
/* 109 */           ffmahd.call(paramInt1, k, 0, paramInt3);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 115 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 126 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffthdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */