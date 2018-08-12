/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8i4_934 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8i4_934();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8i4_934() { super("fffr8i4_934", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, paramInt6, paramInt7, paramInt8);
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
/*  39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, n, bool, i1, i2, i3);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6, int paramInt7, int paramInt8)
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
/*  70 */         paramBoolean = paramInt7 == 1;
/*  71 */         paramInt7 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  75 */           i = paramInt2 + (paramInt7 << 3);
/*  76 */           j = paramInt3 + (paramInt7 << 2);
/*  77 */           k = paramInt1 + paramInt7;
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
/*  88 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -2.14748364849E9D))
/*     */               {
/*  90 */                 MainMemory.setI32(paramInt4, -11);
/*  91 */                 MainMemory.setI32(j, Integer.MIN_VALUE);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label275;
/*     */               }
/*  97 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 2.14748364749E9D))
/*     */               {
/*  99 */                 MainMemory.setI32(paramInt4, -11);
/* 100 */                 MainMemory.setI32(j, Integer.MAX_VALUE);
/*     */                 
/*     */                 break label275;
/*     */               }
/*     */               else
/*     */               {
/* 106 */                 MainMemory.setI32(j, (int)d);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label275;
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
/* 122 */               MainMemory.setI32(j, 0);
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
/* 137 */             MainMemory.setI32(j, paramInt8);
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
/*     */           label275:
/*     */           
/*     */ 
/*     */ 
/* 154 */           paramInt7 += 1;
/* 155 */           if (paramInt7 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8i4_934.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */