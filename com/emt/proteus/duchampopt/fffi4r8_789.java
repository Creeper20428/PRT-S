/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4r8_789 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4r8_789();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4r8_789() { super("fffi4r8_789", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, double paramDouble1, int paramInt5, double paramDouble2, int paramInt6, int paramInt7, double paramDouble3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4, paramDouble1, paramInt5, paramDouble2, paramInt6, paramInt7, paramDouble3);
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
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, bool, k, m, d1, n, d2, i1, i2, d3);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, double paramDouble1, int paramInt5, double paramDouble2, int paramInt6, int paramInt7, double paramDouble3)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (paramBoolean)
/*     */       {
/*  75 */         paramBoolean = paramInt7 == 1;
/*  76 */         paramInt7 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  80 */           i = paramInt5 + (paramInt7 << 3);
/*  81 */           j = paramInt2 + paramInt7;
/*  82 */           k = MainMemory.getI32(paramInt6 + (paramInt7 << 2));
/*  83 */           if (k == paramInt1)
/*     */           {
/*  85 */             MainMemory.setI32(paramInt4, 1);
/*  86 */             if (paramBoolean)
/*     */             {
/*  88 */               MainMemory.setF64(i, paramDouble1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  95 */               MainMemory.setI8(j, (byte)1);
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
/* 106 */             d = k;
/* 107 */             d *= paramDouble3;
/* 108 */             d += paramDouble2;
/* 109 */             MainMemory.setF64(i, d);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */           paramInt7 += 1;
/* 118 */           if (paramInt7 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4r8_789.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */