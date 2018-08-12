/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffi8u4_874 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffi8u4_874();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffi8u4_874() { super("fffi8u4_874", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, boolean paramBoolean, int paramInt7, int paramInt8)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramLong, paramInt6, paramBoolean, paramInt7, paramInt8);
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
/*  39 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
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
/*  51 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, k, m, n, l, i1, bool, i2, i3);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, boolean paramBoolean, int paramInt7, int paramInt8)
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
/*  71 */         paramBoolean = paramInt2 == 1;
/*  72 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  76 */           i = paramInt1 + (paramInt2 << 2);
/*  77 */           j = paramInt7 + paramInt2;
/*  78 */           l = MainMemory.getI64(paramInt5 + (paramInt2 << 3));
/*  79 */           if (l == paramLong)
/*     */           {
/*  81 */             MainMemory.setI32(paramInt8, 1);
/*  82 */             if (paramBoolean)
/*     */             {
/*  84 */               MainMemory.setI32(i, paramInt3);
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
/* 102 */           else if (l < 0L)
/*     */           {
/* 104 */             MainMemory.setI32(paramInt4, -11);
/* 105 */             MainMemory.setI32(i, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 112 */           else if (l > 4294967295L)
/*     */           {
/* 114 */             MainMemory.setI32(paramInt4, -11);
/* 115 */             MainMemory.setI32(i, -1);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 122 */             MainMemory.setI32(i, (int)l);
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
/* 138 */           paramInt2 += 1;
/* 139 */           if (paramInt2 == paramInt6) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi8u4_874.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */