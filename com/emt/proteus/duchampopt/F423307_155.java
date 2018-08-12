/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class F423307_155 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new F423307_155();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F423307_155() { super("F423307_155", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
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
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramInt5 + -1 > -1)
/*     */       {
/*  62 */         i = 0 - paramInt5;
/*  63 */         j = paramInt5 * paramInt6 + -1;
/*  64 */         k = paramInt1 * -2;
/*  65 */         paramInt1 = (paramInt5 + paramInt3 * paramInt1 << 1) + -2;
/*  66 */         paramInt3 = 0;
/*     */         
/*     */ 
/*     */ 
/*  70 */         m = j + paramInt3 * i;
/*  71 */         n = paramInt1 + k * paramInt3;
/*  72 */         i1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           com.emt.proteus.runtime.api.MainMemory.setI8(paramInt4 + (n + i1 * -2), com.emt.proteus.runtime.api.MainMemory.getI8(paramInt2 + (m - i1)));
/*  77 */           i1 += 1;
/*  78 */           if (i1 == paramInt5)
/*     */           {
/*  80 */             paramInt3 += 1;
/*  81 */             if (paramInt3 == paramInt6) {
/*     */               break label158;
/*     */             }
/*     */             
/*     */ 
/*  86 */             break;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             break label158;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label158:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F423307_155.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */