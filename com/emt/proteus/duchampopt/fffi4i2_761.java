/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4i2_761 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4i2_761();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4i2_761() { super("fffi4i2_761", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, double paramDouble1, int paramInt3, double paramDouble2, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramBoolean, paramDouble1, paramInt3, paramDouble2, paramInt4);
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
/*  30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, bool, d1, k, d2, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, double paramDouble1, int paramInt3, double paramDouble2, int paramInt4)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       if (paramBoolean) {
/*  61 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  65 */           j = paramInt2 + (i << 1);
/*  66 */           d = MainMemory.getI32(paramInt4 + (i << 2));
/*  67 */           d *= paramDouble1;
/*  68 */           d += paramDouble2;
/*  69 */           if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -32768.49D))
/*     */           {
/*  71 */             MainMemory.setI32(paramInt3, -11);
/*  72 */             MainMemory.setI16(j, (short)Short.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  79 */           else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 32767.49D))
/*     */           {
/*  81 */             MainMemory.setI32(paramInt3, -11);
/*  82 */             MainMemory.setI16(j, (short)Short.MAX_VALUE);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  89 */             MainMemory.setI16(j, (short)(int)d);
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
/* 101 */           i += 1;
/* 102 */           if (i == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4i2_761.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */