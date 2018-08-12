/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4int extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3353;
/*  11 */   public static final Function _instance = new fffr4int();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4int() { super("fffr4int", 3, false); }
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
/*  42 */     float f = 0.0F;
/*  43 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       if (paramInt2 > 0) {
/*  50 */         i = 0;
/*     */       } else {
/*     */         break label183;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  61 */         j = paramInt3 + (i << 2);
/*  62 */         f = MainMemory.getF32(paramInt1 + (i << 2));
/*  63 */         d = f;
/*  64 */         if (!com.emt.proteus.lib.api.MathUtils.f_olt(d, -2.14748364849E9D)) {
/*     */           break label100;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         MainMemory.setI32Aligned(470852, -11);
/*  75 */         MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */         
/*     */         break label161;
/*     */         
/*     */         label100:
/*  80 */         if (!com.emt.proteus.lib.api.MathUtils.f_ogt(d, 2.14748364749E9D)) {
/*     */           break label148;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         MainMemory.setI32Aligned(470852, -11);
/*  91 */         MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */         
/*     */         break label161;
/*     */         
/*     */         label148:
/*  96 */         MainMemory.setI32(j, (int)f);
/*     */         
/*     */ 
/*     */         label161:
/*     */         
/*     */ 
/* 102 */         i += 1;
/* 103 */         if (i == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label183:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4int.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */