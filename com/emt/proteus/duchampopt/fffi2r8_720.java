/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi2r8_720 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi2r8_720();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi2r8_720() { super("fffi2r8_720", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, int paramInt3, boolean paramBoolean, double paramDouble3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramShort, paramDouble1, paramDouble2, paramInt3, paramBoolean, paramDouble3, paramInt4, paramInt5, paramInt6);
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
/*  30 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     double d3 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     call(i, j, s, d1, d2, k, bool, d3, m, n, i1);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, short paramShort, double paramDouble1, double paramDouble2, int paramInt3, boolean paramBoolean, double paramDouble3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  64 */     int i = 0;
/*  65 */     int j = 0;
/*  66 */     short s = 0;
/*  67 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  73 */       if (paramBoolean)
/*     */       {
/*  75 */         paramBoolean = paramInt4 == 1;
/*  76 */         paramInt4 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  80 */           i = paramInt3 + (paramInt4 << 3);
/*  81 */           j = paramInt2 + paramInt4;
/*  82 */           s = MainMemory.getI16(paramInt5 + (paramInt4 << 1));
/*  83 */           if (s == paramShort)
/*     */           {
/*  85 */             MainMemory.setI32(paramInt1, 1);
/*  86 */             if (paramBoolean)
/*     */             {
/*  88 */               MainMemory.setF64(i, paramDouble2);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  95 */               MainMemory.setI8(j, (byte)1);
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
/* 106 */             d = s;
/* 107 */             d *= paramDouble3;
/* 108 */             d += paramDouble1;
/* 109 */             MainMemory.setF64(i, d);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */           paramInt4 += 1;
/* 118 */           if (paramInt4 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi2r8_720.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */