/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi1u2_667 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi1u2_667();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi1u2_667() { super("fffi1u2_667", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, boolean paramBoolean, short paramShort, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6, int paramInt7, byte paramByte)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramDouble1, paramBoolean, paramShort, paramInt3, paramInt4, paramDouble2, paramInt5, paramInt6, paramInt7, paramByte);
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
/*  30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, j, d1, bool, s, k, m, d2, n, i1, i2, b);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, boolean paramBoolean, short paramShort, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6, int paramInt7, byte paramByte)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     byte b = 0;
/*  70 */     double d = 0.0D;
/*  71 */     short s = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  77 */       if (paramBoolean)
/*     */       {
/*  79 */         paramBoolean = paramInt2 == 1;
/*  80 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  84 */           i = paramInt1 + (paramInt2 << 1);
/*  85 */           j = paramInt7 + paramInt2;
/*  86 */           b = MainMemory.getI8(paramInt4 + paramInt2);
/*  87 */           if (b == paramByte)
/*     */           {
/*  89 */             MainMemory.setI32(paramInt6, 1);
/*  90 */             if (paramBoolean)
/*     */             {
/*  92 */               MainMemory.setI16(i, paramShort);
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
/* 115 */               MainMemory.setI32(paramInt3, -11);
/* 116 */               MainMemory.setI16(i, (short)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 123 */             else if (com.emt.proteus.lib.api.MathUtils.f_ogt(d, 65535.49D))
/*     */             {
/* 125 */               MainMemory.setI32(paramInt3, -11);
/* 126 */               MainMemory.setI16(i, (short)-1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 133 */               s = (short)(int)Math.abs(d);
/* 134 */               MainMemory.setI16(i, s);
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
/* 150 */           paramInt2 += 1;
/* 151 */           if (paramInt2 == paramInt5) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1u2_667.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */