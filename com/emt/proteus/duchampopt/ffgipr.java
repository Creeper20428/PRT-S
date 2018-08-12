/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgipr
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3263;
/*  14 */   public static final Function _instance = new ffgipr();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgipr() { super("ffgipr", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*     */     try
/*     */     {
/*  54 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */           ffgidt.call(paramInt1, paramInt2, paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  80 */         if (paramInt3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */           ffgidm.call(paramInt1, paramInt3, paramInt5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  96 */         if (paramInt4 != 0) {
/*     */           break label98;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label112;
/*     */       
/*     */ 
/*     */ 
/*     */       label98:
/*     */       
/*     */ 
/*     */ 
/* 112 */       ffgisz.call(paramInt1, 3, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label112:
/*     */       
/*     */ 
/* 118 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgipr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */