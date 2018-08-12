/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi1uint_679 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi1uint_679();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1uint_679() { super("fffi1uint_679", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, byte paramByte, int paramInt6, double paramDouble1, int paramInt7, int paramInt8, double paramDouble2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5, paramByte, paramInt6, paramDouble1, paramInt7, paramInt8, paramDouble2);
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
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, j, k, bool, m, n, b, i1, d1, i2, i3, d2);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, byte paramByte, int paramInt6, double paramDouble1, int paramInt7, int paramInt8, double paramDouble2)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     byte b = 0;
/*  70 */     double d = 0.0D;
/*  71 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramBoolean)
/*     */       {
/*  79 */         paramBoolean = paramInt6 == 1;
/*  80 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  84 */           i = paramInt3 + (paramInt6 << 2);
/*  85 */           j = paramInt2 + paramInt6;
/*  86 */           b = MainMemory.getI8(paramInt5 + paramInt6);
/*  87 */           if (b == paramByte)
/*     */           {
/*  89 */             MainMemory.setI32(paramInt1, 1);
/*  90 */             if (paramBoolean)
/*     */             {
/*  92 */               MainMemory.setI32(i, paramInt8);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  99 */               MainMemory.setI8(j, (byte)1);
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
/* 110 */             d = b & 0xFF;
/* 111 */             d *= paramDouble1;
/* 112 */             d += paramDouble2;
/* 113 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */             {
/* 115 */               MainMemory.setI32(paramInt4, -11);
/* 116 */               MainMemory.setI32(i, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 123 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 4.29496729549E9D))
/*     */             {
/* 125 */               MainMemory.setI32(paramInt4, -11);
/* 126 */               MainMemory.setI32(i, -1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 133 */               k = (int)Math.abs(d);
/* 134 */               MainMemory.setI32(i, k);
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
/* 150 */           paramInt6 += 1;
/* 151 */           if (paramInt6 == paramInt7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1uint_679.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */