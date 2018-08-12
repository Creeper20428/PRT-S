/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2i8_703 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2i8_703();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2i8_703() { super("fffi2i8_703", 9, false); }
/*     */   
/*     */   public int execute(long paramLong, int paramInt1, short paramShort, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramLong, paramInt1, paramShort, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(l, i, s, j, k, m, n, i1, bool);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong, int paramInt1, short paramShort, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     short s = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (paramBoolean)
/*     */       {
/*  68 */         paramBoolean = paramInt6 == 1;
/*  69 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  73 */           i = paramInt2 + (paramInt6 << 3);
/*  74 */           j = paramInt4 + paramInt6;
/*  75 */           s = MainMemory.getI16(paramInt5 + (paramInt6 << 1));
/*  76 */           if (s == paramShort)
/*     */           {
/*  78 */             MainMemory.setI32(paramInt1, 1);
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
/*  99 */             MainMemory.setI64(i, s);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           paramInt6 += 1;
/* 108 */           if (paramInt6 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2i8_703.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */