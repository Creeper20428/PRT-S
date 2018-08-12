/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2u2_735 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2u2_735();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2u2_735() { super("fffi2u2_735", 8, false); }
/*     */   
/*     */   public int execute(short paramShort1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, short paramShort2, int paramInt6)
/*     */   {
/*  18 */     call(paramShort1, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramShort2, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     short s1 = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
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
/*  42 */     short s2 = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(s1, i, j, k, m, n, s2, i1);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(short paramShort1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, short paramShort2, int paramInt6)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     short s = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramInt6 > 0)
/*     */       {
/*  66 */         i = paramInt5 == 1 ? 1 : 0;
/*  67 */         paramInt5 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  71 */           j = paramInt3 + (paramInt5 << 1);
/*  72 */           k = paramInt2 + paramInt5;
/*  73 */           s = MainMemory.getI16(paramInt1 + (paramInt5 << 1));
/*  74 */           if (s == paramShort1)
/*     */           {
/*  76 */             MainMemory.setI32(paramInt4, 1);
/*  77 */             if (i != 0)
/*     */             {
/*  79 */               MainMemory.setI16(j, paramShort2);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  86 */               MainMemory.setI8(k, (byte)1);
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
/*  97 */             MainMemory.setI16(j, com.emt.proteus.lib.api.MathUtils.xor(s, (short)Short.MIN_VALUE));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           paramInt5 += 1;
/* 106 */           if (paramInt5 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2u2_735.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */