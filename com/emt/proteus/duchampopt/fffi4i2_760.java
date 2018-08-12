/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4i2_760 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4i2_760();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4i2_760() { super("fffi4i2_760", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, short paramShort, boolean paramBoolean, int paramInt4, double paramDouble1, int paramInt5, double paramDouble2, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramShort, paramBoolean, paramInt4, paramDouble1, paramInt5, paramDouble2, paramInt6, paramInt7, paramInt8);
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
/*  33 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, j, k, s, bool, m, d1, n, d2, i1, i2, i3);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, short paramShort, boolean paramBoolean, int paramInt4, double paramDouble1, int paramInt5, double paramDouble2, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       if (paramBoolean)
/*     */       {
/*  78 */         paramBoolean = paramInt8 == 1;
/*  79 */         paramInt8 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           i = paramInt3 + (paramInt8 << 1);
/*  84 */           j = paramInt4 + paramInt8;
/*  85 */           k = MainMemory.getI32(paramInt6 + (paramInt8 << 2));
/*  86 */           if (k == paramInt7)
/*     */           {
/*  88 */             MainMemory.setI32(paramInt2, 1);
/*  89 */             if (paramBoolean)
/*     */             {
/*  91 */               MainMemory.setI16(i, paramShort);
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
/* 109 */             d = k;
/* 110 */             d *= paramDouble1;
/* 111 */             d += paramDouble2;
/* 112 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -32768.49D))
/*     */             {
/* 114 */               MainMemory.setI32(paramInt5, -11);
/* 115 */               MainMemory.setI16(i, (short)Short.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 122 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 32767.49D))
/*     */             {
/* 124 */               MainMemory.setI32(paramInt5, -11);
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
/* 148 */           paramInt8 += 1;
/* 149 */           if (paramInt8 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4i2_760.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */