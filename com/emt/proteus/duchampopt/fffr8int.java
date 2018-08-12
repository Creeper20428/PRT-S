/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8int extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3354;
/*  11 */   public static final Function _instance = new fffr8int();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8int() { super("fffr8int", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       if (paramInt2 > 0) {
/*  49 */         i = 0;
/*     */       } else {
/*     */         break label175;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  60 */         j = paramInt3 + (i << 2);
/*  61 */         d = MainMemory.getF64(paramInt1 + (i << 3));
/*  62 */         if (!com.emt.proteus.lib.api.MathUtils.f_olt(d, -2.14748364849E9D)) {
/*     */           break label92;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         MainMemory.setI32Aligned(470852, -11);
/*  73 */         MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */         
/*     */         break label153;
/*     */         
/*     */         label92:
/*  78 */         if (!com.emt.proteus.lib.api.MathUtils.f_ogt(d, 2.14748364749E9D)) {
/*     */           break label140;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         MainMemory.setI32Aligned(470852, -11);
/*  89 */         MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */         
/*     */         break label153;
/*     */         
/*     */         label140:
/*  94 */         MainMemory.setI32(j, (int)d);
/*     */         
/*     */ 
/*     */         label153:
/*     */         
/*     */ 
/* 100 */         i += 1;
/* 101 */         if (i == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label175:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8int.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */