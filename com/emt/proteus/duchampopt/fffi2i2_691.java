/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2i2_691 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2i2_691();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2i2_691() { super("fffi2i2_691", 12, false); }
/*     */   
/*     */   public int execute(double paramDouble1, int paramInt1, double paramDouble2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, short paramShort1, int paramInt6, int paramInt7, boolean paramBoolean, short paramShort2)
/*     */   {
/*  18 */     call(paramDouble1, paramInt1, paramDouble2, paramInt2, paramInt3, paramInt4, paramInt5, paramShort1, paramInt6, paramInt7, paramBoolean, paramShort2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     short s1 = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     short s2 = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(d1, i, d2, j, k, m, n, s1, i1, i2, bool, s2);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble1, int paramInt1, double paramDouble2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, short paramShort1, int paramInt6, int paramInt7, boolean paramBoolean, short paramShort2)
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
/*  78 */         paramBoolean = paramInt2 == 1;
/*  79 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           i = paramInt5 + (paramInt2 << 1);
/*  84 */           j = paramInt4 + paramInt2;
/*  85 */           s = MainMemory.getI16(paramInt7 + (paramInt2 << 1));
/*  86 */           if (s == paramShort2)
/*     */           {
/*  88 */             MainMemory.setI32(paramInt1, 1);
/*  89 */             if (paramBoolean)
/*     */             {
/*  91 */               MainMemory.setI16(i, paramShort1);
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
/* 110 */             d *= paramDouble2;
/* 111 */             d += paramDouble1;
/* 112 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -32768.49D))
/*     */             {
/* 114 */               MainMemory.setI32(paramInt3, -11);
/* 115 */               MainMemory.setI16(i, (short)Short.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 122 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 32767.49D))
/*     */             {
/* 124 */               MainMemory.setI32(paramInt3, -11);
/* 125 */               MainMemory.setI16(i, (short)Short.MAX_VALUE);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 132 */               MainMemory.setI16(i, (short)(int)d);
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
/* 148 */           paramInt2 += 1;
/* 149 */           if (paramInt2 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2i2_691.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */