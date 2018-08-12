/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4i8_892 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4i8_892();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4i8_892() { super("fffr4i8_892", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, double paramDouble1, int paramInt6, double paramDouble2, boolean paramBoolean, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramLong, paramInt5, paramDouble1, paramInt6, paramDouble2, paramBoolean, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  36 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, k, m, l, n, d1, i1, d2, bool, i2);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, double paramDouble1, int paramInt6, double paramDouble2, boolean paramBoolean, int paramInt7)
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
/*  79 */         paramBoolean = paramInt4 == 1;
/*  80 */         bool1 = MathUtils.f_olt(paramDouble1, -9.223372036854776E18D);
/*  81 */         bool2 = MathUtils.f_ogt(paramDouble1, 9.223372036854776E18D);
/*  82 */         l = paramDouble1;
/*  83 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  87 */           i = paramInt3 + (paramInt4 << 2);
/*  88 */           j = paramInt7 + (paramInt4 << 3);
/*  89 */           k = paramInt1 + paramInt4;
/*  90 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  91 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  96 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  99 */               d = MainMemory.getF32(i);
/* 100 */               d *= paramDouble2;
/* 101 */               d += paramDouble1;
/* 102 */               if (MathUtils.f_olt(d, -9.223372036854776E18D))
/*     */               {
/* 104 */                 MainMemory.setI32(paramInt5, -11);
/* 105 */                 MainMemory.setI64(j, Long.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label378;
/*     */               }
/* 111 */               else if (MathUtils.f_ogt(d, 9.223372036854776E18D))
/*     */               {
/* 113 */                 MainMemory.setI32(paramInt5, -11);
/* 114 */                 MainMemory.setI64(j, Long.MAX_VALUE);
/*     */                 
/*     */                 break label378;
/*     */               }
/*     */               else
/*     */               {
/* 120 */                 MainMemory.setI64(j, d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label378;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 131 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 136 */               if (bool1)
/*     */               {
/* 138 */                 MainMemory.setI32(paramInt5, -11);
/* 139 */                 MainMemory.setI64(j, Long.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label378;
/*     */               }
/* 145 */               else if (bool2)
/*     */               {
/* 147 */                 MainMemory.setI32(paramInt5, -11);
/* 148 */                 MainMemory.setI64(j, Long.MAX_VALUE);
/*     */                 
/*     */                 break label378;
/*     */               }
/*     */               else
/*     */               {
/* 154 */                 MainMemory.setI64(j, l); }
/* 155 */               break;
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
/* 174 */           MainMemory.setI32(paramInt2, 1);
/* 175 */           if (paramBoolean)
/*     */           {
/* 177 */             MainMemory.setI64(j, paramLong);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 184 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label378:
/*     */           
/*     */ 
/*     */ 
/* 194 */           paramInt4 += 1;
/* 195 */           if (paramInt4 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4i8_892.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */