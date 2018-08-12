/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2int_707 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2int_707();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2int_707() { super("fffi2int_707", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, int paramInt8, short paramShort, double paramDouble2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramDouble1, paramInt5, paramInt6, paramInt7, paramBoolean, paramInt8, paramShort, paramDouble2);
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
/*  36 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, j, k, m, d1, n, i1, i2, bool, i3, s, d2);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, int paramInt8, short paramShort, double paramDouble2)
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
/*  78 */         paramBoolean = paramInt1 == 1;
/*  79 */         paramInt1 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           i = paramInt4 + (paramInt1 << 2);
/*  84 */           j = paramInt3 + paramInt1;
/*  85 */           s = MainMemory.getI16(paramInt7 + (paramInt1 << 1));
/*  86 */           if (s == paramShort)
/*     */           {
/*  88 */             MainMemory.setI32(paramInt6, 1);
/*  89 */             if (paramBoolean)
/*     */             {
/*  91 */               MainMemory.setI32(i, paramInt2);
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
/* 112 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -2.14748364849E9D))
/*     */             {
/* 114 */               MainMemory.setI32(paramInt8, -11);
/* 115 */               MainMemory.setI32(i, Integer.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 122 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */             {
/* 124 */               MainMemory.setI32(paramInt8, -11);
/* 125 */               MainMemory.setI32(i, Integer.MAX_VALUE);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 132 */               MainMemory.setI32(i, (int)d);
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
/* 148 */           paramInt1 += 1;
/* 149 */           if (paramInt1 == paramInt5) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2int_707.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */