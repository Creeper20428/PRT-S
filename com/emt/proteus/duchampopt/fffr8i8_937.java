/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8i8_937 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8i8_937();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8i8_937() { super("fffr8i8_937", 11, false); }
/*     */   
/*     */   public int execute(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, double paramDouble1, double paramDouble2)
/*     */   {
/*  18 */     call(paramLong, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramDouble1, paramDouble2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(l, bool, i, j, k, m, n, i1, i2, d1, d2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, double paramDouble1, double paramDouble2)
/*     */   {
/*  64 */     boolean bool1 = false;
/*  65 */     boolean bool2 = false;
/*  66 */     long l = 0L;
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramBoolean)
/*     */       {
/*  79 */         paramBoolean = paramInt2 == 1;
/*  80 */         bool1 = MathUtils.f_olt(paramDouble1, -9.223372036854776E18D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble1, 9.223372036854776E18D);
/*  82 */         l = paramDouble1;
/*  83 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           i = paramInt7 + (paramInt2 << 3);
/*  88 */           j = paramInt3 + (paramInt2 << 3);
/*  89 */           k = paramInt4 + paramInt2;
/*  90 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  91 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  96 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  99 */               d = MainMemory.getF64(i) * paramDouble2;
/* 100 */               d += paramDouble1;
/* 101 */               if (MathUtils.f_olt(d, -9.223372036854776E18D))
/*     */               {
/* 103 */                 MainMemory.setI32(paramInt6, -11);
/* 104 */                 MainMemory.setI64(j, Long.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label380;
/*     */               }
/* 110 */               else if (MathUtils.f_ogt(d, 9.223372036854776E18D))
/*     */               {
/* 112 */                 MainMemory.setI32(paramInt6, -11);
/* 113 */                 MainMemory.setI64(j, Long.MAX_VALUE);
/*     */                 
/*     */                 break label380;
/*     */               }
/*     */               else
/*     */               {
/* 119 */                 MainMemory.setI64(j, d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label380;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 130 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 135 */               if (bool1)
/*     */               {
/* 137 */                 MainMemory.setI32(paramInt6, -11);
/* 138 */                 MainMemory.setI64(j, Long.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label380;
/*     */               }
/* 144 */               else if (bool2)
/*     */               {
/* 146 */                 MainMemory.setI32(paramInt6, -11);
/* 147 */                 MainMemory.setI64(j, Long.MAX_VALUE);
/*     */                 
/*     */                 break label380;
/*     */               }
/*     */               else
/*     */               {
/* 153 */                 MainMemory.setI64(j, l); }
/* 154 */               break;
/*     */             }
/*     */             
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
/*     */ 
/*     */ 
/* 173 */           MainMemory.setI32(paramInt5, 1);
/* 174 */           if (paramBoolean)
/*     */           {
/* 176 */             MainMemory.setI64(j, paramLong);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 183 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label380:
/*     */           
/*     */ 
/*     */ 
/* 193 */           paramInt2 += 1;
/* 194 */           if (paramInt2 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8i8_937.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */