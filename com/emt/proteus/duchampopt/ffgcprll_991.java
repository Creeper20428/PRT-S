/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgcprll_991 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new ffgcprll_991();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffgcprll_991() { super("ffgcprll_991", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramLong);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j, k, m, l);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     long l = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (paramInt2 > 0)
/*     */       {
/*  58 */         paramInt2 = MainMemory.getI32Aligned(459544);
/*  59 */         if (com.emt.proteus.lib.api.MathUtils.ugt(paramInt2 + -1, 39))
/*     */         {
/*  61 */           i = MainMemory.getI32Aligned(467208) + -1;
/*  62 */           j = 0;
/*     */           
/*     */           for (;;)
/*     */           {
/*  66 */             k = i - j;
/*  67 */             if (k <= -1)
/*     */               break;
/*  69 */             j += 1;
/*  70 */             if (com.emt.proteus.runtime.api.SystemLibrary.strcmp(492288 + k * 84, 47904) == 0)
/*     */             {
/*  72 */               MainMemory.setI32Aligned(459544, k);
/*  73 */               paramInt2 = k; break;
/*     */             }
/*     */           }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         if (MainMemory.getI32(paramInt1 + 4) == paramInt2)
/*     */         {
/* 105 */           paramLong += -2880L;
/* 106 */           l = MainMemory.getI64(paramInt1 + 88);
/* 107 */           if (MainMemory.getI64(paramInt1 + 96) != (paramLong >= l ? paramLong : l))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 112 */             ffwend.call(paramInt4, paramInt3);
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcprll_991.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */