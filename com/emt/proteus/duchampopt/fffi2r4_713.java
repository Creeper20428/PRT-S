/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2r4_713 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2r4_713();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2r4_713() { super("fffi2r4_713", 11, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, double paramDouble1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, double paramDouble2, int paramInt5, int paramInt6, short paramShort)
/*     */   {
/*  18 */     call(paramBoolean, paramDouble1, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramDouble2, paramInt5, paramInt6, paramShort);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  42 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(bool, d1, i, j, k, m, f, d2, n, i1, s);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, double paramDouble1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, double paramDouble2, int paramInt5, int paramInt6, short paramShort)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     short s = 0;
/*  67 */     double d = 0.0D;
/*  68 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  74 */       if (paramBoolean)
/*     */       {
/*  76 */         paramBoolean = paramInt4 == 1;
/*  77 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  81 */           i = paramInt6 + (paramInt4 << 2);
/*  82 */           j = paramInt3 + paramInt4;
/*  83 */           s = MainMemory.getI16(paramInt1 + (paramInt4 << 1));
/*  84 */           if (s == paramShort)
/*     */           {
/*  86 */             MainMemory.setI32(paramInt2, 1);
/*  87 */             if (paramBoolean)
/*     */             {
/*  89 */               MainMemory.setF32(i, paramFloat);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  96 */               MainMemory.setI8(j, (byte)1);
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
/* 107 */             d = s;
/* 108 */             d *= paramDouble1;
/* 109 */             d += paramDouble2;
/* 110 */             f = (float)d;
/* 111 */             MainMemory.setF32(i, f);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           paramInt4 += 1;
/* 120 */           if (paramInt4 == paramInt5) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2r4_713.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */