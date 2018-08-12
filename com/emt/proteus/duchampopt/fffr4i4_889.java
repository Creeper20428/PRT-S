/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4i4_889 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4i4_889();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4i4_889() { super("fffr4i4_889", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
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
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, n, i1, i2, i3, bool);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     float f = 0.0F;
/*  63 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       if (paramBoolean)
/*     */       {
/*  71 */         paramBoolean = paramInt7 == 1;
/*  72 */         paramInt7 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           i = paramInt4 + (paramInt7 << 2);
/*  77 */           j = paramInt8 + (paramInt7 << 2);
/*  78 */           k = paramInt5 + paramInt7;
/*  79 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  80 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  85 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  88 */               f = MainMemory.getF32(i);
/*  89 */               d = f;
/*  90 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -2.14748364849E9D))
/*     */               {
/*  92 */                 MainMemory.setI32(paramInt3, -11);
/*  93 */                 MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label283;
/*     */               }
/*  99 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */               {
/* 101 */                 MainMemory.setI32(paramInt3, -11);
/* 102 */                 MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */                 
/*     */                 break label283;
/*     */               }
/*     */               else
/*     */               {
/* 108 */                 MainMemory.setI32(j, (int)f);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label283;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 119 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 124 */               MainMemory.setI32(j, 0);
/* 125 */               break;
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
/* 136 */           MainMemory.setI32(paramInt2, 1);
/* 137 */           if (paramBoolean)
/*     */           {
/* 139 */             MainMemory.setI32(j, paramInt6);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 146 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label283:
/*     */           
/*     */ 
/*     */ 
/* 156 */           paramInt7 += 1;
/* 157 */           if (paramInt7 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4i4_889.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */