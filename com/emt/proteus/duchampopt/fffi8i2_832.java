/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi8i2_832 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi8i2_832();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi8i2_832() { super("fffi8i2_832", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong, short paramShort, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramLong, paramShort, paramInt4, paramInt5, paramInt6, paramInt7);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     short s = paramFrame.getI16(paramArrayOfInt[paramInt4]);
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
/*  54 */     call(i, bool, j, k, l, s, m, n, i1, i2);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, long paramLong, short paramShort, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     long l = 0L;
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
/*  76 */           i = paramInt1 + (paramInt7 << 1);
/*  77 */           j = paramInt6 + paramInt7;
/*  78 */           l = MainMemory.getI64(paramInt5 + (paramInt7 << 3));
/*  79 */           if (l == paramLong)
/*     */           {
/*  81 */             MainMemory.setI32(paramInt4, 1);
/*  82 */             if (paramBoolean)
/*     */             {
/*  84 */               MainMemory.setI16(i, paramShort);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*  91 */               MainMemory.setI8(j, (byte)1);
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 102 */           else if (l < -32768L)
/*     */           {
/* 104 */             MainMemory.setI32(paramInt3, -11);
/* 105 */             MainMemory.setI16(i, (short)Short.MIN_VALUE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 112 */           else if (l > 32767L)
/*     */           {
/* 114 */             MainMemory.setI32(paramInt3, -11);
/* 115 */             MainMemory.setI16(i, (short)Short.MAX_VALUE);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 122 */             MainMemory.setI16(i, (short)(int)l);
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
/*     */ 
/* 138 */           paramInt7 += 1;
/* 139 */           if (paramInt7 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi8i2_832.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */