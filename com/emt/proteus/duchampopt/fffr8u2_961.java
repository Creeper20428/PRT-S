/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8u2_961 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8u2_961();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8u2_961() { super("fffr8u2_961", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, double paramDouble2, boolean paramBoolean, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramDouble1, paramInt2, paramInt3, paramDouble2, paramBoolean, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, d1, j, k, d2, bool, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, double paramDouble2, boolean paramBoolean, int paramInt4)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     double d = 0.0D;
/*  55 */     short s = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if (paramBoolean) {
/*  62 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  66 */           j = paramInt1 + (i << 1);
/*  67 */           d = MainMemory.getF64(paramInt2 + (i << 3)) * paramDouble1;
/*  68 */           d += paramDouble2;
/*  69 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */           {
/*  71 */             MainMemory.setI32(paramInt4, -11);
/*  72 */             MainMemory.setI16(j, (short)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  79 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 65535.49D))
/*     */           {
/*  81 */             MainMemory.setI32(paramInt4, -11);
/*  82 */             MainMemory.setI16(j, (short)-1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  89 */             s = (short)(int)Math.abs(d);
/*  90 */             MainMemory.setI16(j, s);
/*     */           }
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
/* 102 */           i += 1;
/* 103 */           if (i == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8u2_961.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */