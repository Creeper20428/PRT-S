/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4i8_772 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4i8_772();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4i8_772() { super("fffi4i8_772", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, paramLong, paramInt5, paramInt6, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/*  39 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, bool, j, k, m, l, n, i1, i2);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (paramBoolean)
/*     */       {
/*  68 */         paramBoolean = paramInt3 == 1;
/*  69 */         paramInt3 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  73 */           i = paramInt1 + (paramInt3 << 3);
/*  74 */           j = paramInt7 + paramInt3;
/*  75 */           k = MainMemory.getI32(paramInt5 + (paramInt3 << 2));
/*  76 */           if (k == paramInt4)
/*     */           {
/*  78 */             MainMemory.setI32(paramInt2, 1);
/*  79 */             if (paramBoolean)
/*     */             {
/*  81 */               MainMemory.setI64(i, paramLong);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  88 */               MainMemory.setI8(j, (byte)1);
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*  99 */             MainMemory.setI64(i, k);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           paramInt3 += 1;
/* 108 */           if (paramInt3 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4i8_772.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */