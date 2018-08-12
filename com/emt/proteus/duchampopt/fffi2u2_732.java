/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2u2_732 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2u2_732();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2u2_732() { super("fffi2u2_732", 12, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, short paramShort1, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, short paramShort2, int paramInt7)
/*     */   {
/*  18 */     call(paramBoolean, paramShort1, paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramInt4, paramInt5, paramInt6, paramShort2, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     short s1 = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     short s2 = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(bool, s1, i, j, d1, d2, k, m, n, i1, s2, i2);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, short paramShort1, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, short paramShort2, int paramInt7)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     short s = 0;
/*  70 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       if (paramBoolean)
/*     */       {
/*  78 */         paramBoolean = paramInt6 == 1;
/*  79 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           i = paramInt4 + (paramInt6 << 1);
/*  84 */           j = paramInt2 + paramInt6;
/*  85 */           s = MainMemory.getI16(paramInt1 + (paramInt6 << 1));
/*  86 */           if (s == paramShort1)
/*     */           {
/*  88 */             MainMemory.setI32(paramInt5, 1);
/*  89 */             if (paramBoolean)
/*     */             {
/*  91 */               MainMemory.setI16(i, paramShort2);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  98 */               MainMemory.setI8(j, (byte)1);
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
/* 109 */             d = s;
/* 110 */             d *= paramDouble1;
/* 111 */             d += paramDouble2;
/* 112 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */             {
/* 114 */               MainMemory.setI32(paramInt3, -11);
/* 115 */               MainMemory.setI16(i, (short)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 122 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 65535.49D))
/*     */             {
/* 124 */               MainMemory.setI32(paramInt3, -11);
/* 125 */               MainMemory.setI16(i, (short)-1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 132 */               s = (short)(int)Math.abs(d);
/* 133 */               MainMemory.setI16(i, s);
/*     */             }
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
/*     */ 
/*     */ 
/*     */ 
/* 149 */           paramInt6 += 1;
/* 150 */           if (paramInt6 == paramInt7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2u2_732.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */