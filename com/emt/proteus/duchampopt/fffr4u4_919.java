/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4u4_919 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4u4_919();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4u4_919() { super("fffr4u4_919", 9, false); }
/*     */   
/*     */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(bool, i, j, k, m, n, i1, i2, i3);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
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
/*  71 */         paramBoolean = paramInt8 == 1;
/*  72 */         paramInt8 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           i = paramInt6 + (paramInt8 << 2);
/*  77 */           j = paramInt5 + (paramInt8 << 2);
/*  78 */           k = paramInt2 + paramInt8;
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
/*  90 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */               {
/*  92 */                 MainMemory.setI32(paramInt4, -11);
/*  93 */                 MainMemory.setI32(j, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label289;
/*     */               }
/*  99 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 4.29496729549E9D))
/*     */               {
/* 101 */                 MainMemory.setI32(paramInt4, -11);
/* 102 */                 MainMemory.setI32(j, -1);
/*     */                 
/*     */                 break label289;
/*     */               }
/*     */               else
/*     */               {
/* 108 */                 m = (int)Math.abs(f);
/* 109 */                 MainMemory.setI32(j, m);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label289;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 120 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 125 */               MainMemory.setI32(j, 0);
/* 126 */               break;
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
/* 137 */           MainMemory.setI32(paramInt3, 1);
/* 138 */           if (paramBoolean)
/*     */           {
/* 140 */             MainMemory.setI32(j, paramInt7);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 147 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label289:
/*     */           
/*     */ 
/*     */ 
/* 157 */           paramInt8 += 1;
/* 158 */           if (paramInt8 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4u4_919.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */