/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi4i1_753 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi4i1_753();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi4i1_753() { super("fffi4i1_753", 12, false); }
/*     */   
/*     */   public int execute(double paramDouble1, int paramInt1, int paramInt2, int paramInt3, byte paramByte, double paramDouble2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  18 */     call(paramDouble1, paramInt1, paramInt2, paramInt3, paramByte, paramDouble2, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/*  36 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(d1, i, j, k, b, d2, m, n, i1, i2, i3, bool);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(double paramDouble1, int paramInt1, int paramInt2, int paramInt3, byte paramByte, double paramDouble2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     double d = 0.0D;
/*  71 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramBoolean)
/*     */       {
/*  79 */         paramBoolean = paramInt4 == 1;
/*  80 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  84 */           i = paramInt3 + paramInt4;
/*  85 */           j = paramInt1 + paramInt4;
/*  86 */           k = MainMemory.getI32(paramInt8 + (paramInt4 << 2));
/*  87 */           if (k == paramInt7)
/*     */           {
/*  89 */             MainMemory.setI32(paramInt6, 1);
/*  90 */             if (paramBoolean)
/*     */             {
/*  92 */               MainMemory.setI8(i, paramByte);
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
/* 110 */             d = k;
/* 111 */             d *= paramDouble2;
/* 112 */             d += paramDouble1;
/* 113 */             if (com.emt.proteus.lib.api.MathUtils.f_olt(d, -0.49D))
/*     */             {
/* 115 */               MainMemory.setI32(paramInt5, -11);
/* 116 */               MainMemory.setI8(i, (byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 123 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 255.49D))
/*     */             {
/* 125 */               MainMemory.setI32(paramInt5, -11);
/* 126 */               MainMemory.setI8(i, (byte)-1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 133 */               b = (byte)(int)Math.abs(d);
/* 134 */               MainMemory.setI8(i, b);
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
/* 150 */           paramInt4 += 1;
/* 151 */           if (paramInt4 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi4i1_753.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */