/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8u4_964 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8u4_964();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8u4_964() { super("fffr8u4_964", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean, paramInt7, paramInt8);
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
/*  42 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j, k, m, n, i1, bool, i2, i3);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7, int paramInt8)
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
/*  70 */         paramBoolean = paramInt6 == 1;
/*  71 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  75 */           i = paramInt5 + (paramInt6 << 3);
/*  76 */           j = paramInt7 + (paramInt6 << 2);
/*  77 */           k = paramInt8 + paramInt6;
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
/*  88 */               if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */               {
/*  90 */                 MainMemory.setI32(paramInt4, -11);
/*  91 */                 MainMemory.setI32(j, 0);
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label282;
/*     */               }
/*  97 */               else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 4.29496729549E9D))
/*     */               {
/*  99 */                 MainMemory.setI32(paramInt4, -11);
/* 100 */                 MainMemory.setI32(j, -1);
/*     */                 
/*     */                 break label282;
/*     */               }
/*     */               else
/*     */               {
/* 106 */                 m = (int)Math.abs(d);
/* 107 */                 MainMemory.setI32(j, m);
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label282;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 118 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/* 123 */               MainMemory.setI32(j, 0);
/* 124 */               break;
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
/* 135 */           MainMemory.setI32(paramInt1, 1);
/* 136 */           if (paramBoolean)
/*     */           {
/* 138 */             MainMemory.setI32(j, paramInt2);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 145 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label282:
/*     */           
/*     */ 
/*     */ 
/* 155 */           paramInt6 += 1;
/* 156 */           if (paramInt6 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8u4_964.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */