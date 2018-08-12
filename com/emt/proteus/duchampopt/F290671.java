/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F290671 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3167;
/*  11 */   public static final Function _instance = new F290671();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F290671() { super("F290671", 5, false); }
/*     */   
/*     */   public int execute(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     return call(paramDouble, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = call(d, i, j, k, m);
/*  39 */     paramFrame.setI32(paramInt1, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       if ((paramInt4 == 0) || (paramInt1 <= 15)) {
/*     */         break label261;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       if (MathUtils.f_ugt(MainMemory.getF64(paramInt2), paramDouble)) {
/*  65 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  75 */       else if (MathUtils.f_ult(MainMemory.getF64(paramInt3 + (paramInt1 + -1 << 3)), paramDouble)) {
/*  76 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  86 */         paramInt4 = paramInt1 >> 1;
/*  87 */         paramInt1 = paramInt4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  96 */           paramInt4 >>= (paramInt4 > 1 ? 1 : 0);
/*  97 */           if (!MathUtils.f_olt(MainMemory.getF64(paramInt3 + (paramInt1 << 3)), paramDouble)) {
/*     */             break label188;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           if (MathUtils.f_ugt(MainMemory.getF64(paramInt2 + (paramInt1 + 1 << 3)), paramDouble)) {
/* 108 */             paramInt1 = -1;
/* 109 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           paramInt1 = paramInt4 + paramInt1;
/*     */           
/*     */ 
/* 121 */           continue;
/*     */           
/*     */           label188:
/*     */           
/* 125 */           if (!MathUtils.f_ogt(MainMemory.getF64(paramInt2 + (paramInt1 << 3)), paramDouble)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           if (MathUtils.f_ult(MainMemory.getF64(paramInt3 + (paramInt1 + -1 << 3)), paramDouble)) {
/* 137 */             paramInt1 = -1;
/* 138 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           paramInt1 -= paramInt4;
/*     */         }
/*     */         
/*     */ 
/*     */         label261:
/*     */         
/*     */ 
/* 154 */         paramInt1 += -1;
/* 155 */         paramInt4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 162 */           j = paramInt1 - paramInt4;
/* 163 */           k = paramInt3 + (j << 3);
/* 164 */           if (j == -1) {
/* 165 */             paramInt1 = j;
/* 166 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */           if (!MathUtils.f_ugt(MainMemory.getF64(paramInt2 + (j << 3)), paramDouble))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */             if (!MathUtils.f_ult(MainMemory.getF64(k), paramDouble))
/*     */             {
/*     */ 
/*     */ 
/* 189 */               paramInt1 = j;
/* 190 */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 196 */           paramInt4 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 203 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */       int m = i;return m;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F290671.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */