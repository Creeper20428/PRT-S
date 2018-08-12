/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4i8_894 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4i8_894();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4i8_894() { super("fffr4i8_894", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramLong, paramInt5, paramInt6, paramBoolean, paramInt7);
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
/*  36 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, l, n, i1, bool, i2);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       if (paramBoolean)
/*     */       {
/*  70 */         paramBoolean = paramInt4 == 1;
/*  71 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  75 */           i = paramInt2 + (paramInt4 << 2);
/*  76 */           j = paramInt7 + (paramInt4 << 3);
/*  77 */           k = paramInt1 + paramInt4;
/*  78 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  79 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  84 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  87 */               f = MainMemory.getF32(i);
/*  88 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(f, -9.223372036854776E18D))
/*     */               {
/*  90 */                 MainMemory.setI32(paramInt5, -11);
/*  91 */                 MainMemory.setI64(j, Long.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label276;
/*     */               }
/*  97 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(f, 9.223372036854776E18D))
/*     */               {
/*  99 */                 MainMemory.setI32(paramInt5, -11);
/* 100 */                 MainMemory.setI64(j, Long.MAX_VALUE);
/*     */                 
/*     */                 break label276;
/*     */               }
/*     */               else
/*     */               {
/* 106 */                 MainMemory.setI64(j, f);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label276;
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
/* 134 */           MainMemory.setI32(paramInt3, 1);
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
/*     */           label276:
/*     */           
/*     */ 
/*     */ 
/* 154 */           paramInt4 += 1;
/* 155 */           if (paramInt4 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4i8_894.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */