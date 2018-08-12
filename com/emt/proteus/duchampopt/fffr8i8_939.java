/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8i8_939 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8i8_939();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8i8_939() { super("fffr8i8_939", 9, false); }
/*     */   
/*     */   public int execute(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramLong, paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  51 */     call(l, bool, i, j, k, m, n, i1, i2);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       if (paramBoolean)
/*     */       {
/*  70 */         paramBoolean = paramInt2 == 1;
/*  71 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  75 */           i = paramInt7 + (paramInt2 << 3);
/*  76 */           j = paramInt3 + (paramInt2 << 3);
/*  77 */           k = paramInt4 + paramInt2;
/*  78 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  79 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  84 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  87 */               d = MainMemory.getF64(i);
/*  88 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -9.223372036854776E18D))
/*     */               {
/*  90 */                 MainMemory.setI32(paramInt6, -11);
/*  91 */                 MainMemory.setI64(j, Long.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label277;
/*     */               }
/*  97 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 9.223372036854776E18D))
/*     */               {
/*  99 */                 MainMemory.setI32(paramInt6, -11);
/* 100 */                 MainMemory.setI64(j, Long.MAX_VALUE);
/*     */                 
/*     */                 break label277;
/*     */               }
/*     */               else
/*     */               {
/* 106 */                 MainMemory.setI64(j, d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label277;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 117 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 122 */               MainMemory.setI64(j, 0L);
/* 123 */               break;
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
/* 134 */           MainMemory.setI32(paramInt5, 1);
/* 135 */           if (paramBoolean)
/*     */           {
/* 137 */             MainMemory.setI64(j, paramLong);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 144 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label277:
/*     */           
/*     */ 
/*     */ 
/* 154 */           paramInt2 += 1;
/* 155 */           if (paramInt2 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8i8_939.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */