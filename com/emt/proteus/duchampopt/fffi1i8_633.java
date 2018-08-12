/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi1i8_633 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi1i8_633();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1i8_633() { super("fffi1i8_633", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, byte paramByte, boolean paramBoolean, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramLong, paramInt2, paramDouble1, paramInt3, paramInt4, paramInt5, paramDouble2, paramByte, paramBoolean, paramInt6, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/*  45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, l, j, d1, k, m, n, d2, b, bool, i1, i2);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong, int paramInt2, double paramDouble1, int paramInt3, int paramInt4, int paramInt5, double paramDouble2, byte paramByte, boolean paramBoolean, int paramInt6, int paramInt7)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     byte b = 0;
/*  70 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       if (paramBoolean)
/*     */       {
/*  78 */         paramBoolean = paramInt5 == 1;
/*  79 */         paramInt5 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  83 */           i = paramInt2 + (paramInt5 << 3);
/*  84 */           j = paramInt4 + paramInt5;
/*  85 */           b = MainMemory.getI8(paramInt3 + paramInt5);
/*  86 */           if (b == paramByte)
/*     */           {
/*  88 */             MainMemory.setI32(paramInt7, 1);
/*  89 */             if (paramBoolean)
/*     */             {
/*  91 */               MainMemory.setI64(i, paramLong);
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
/* 109 */             d = b & 0xFF;
/* 110 */             d *= paramDouble1;
/* 111 */             d += paramDouble2;
/* 112 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -9.223372036854776E18D))
/*     */             {
/* 114 */               MainMemory.setI32(paramInt1, -11);
/* 115 */               MainMemory.setI64(i, Long.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 122 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 9.223372036854776E18D))
/*     */             {
/* 124 */               MainMemory.setI32(paramInt1, -11);
/* 125 */               MainMemory.setI64(i, Long.MAX_VALUE);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 132 */               MainMemory.setI64(i, d);
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
/* 148 */           paramInt5 += 1;
/* 149 */           if (paramInt5 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1i8_633.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */