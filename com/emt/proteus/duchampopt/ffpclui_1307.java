/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffpclui_1307 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffpclui_1307();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffpclui_1307() { super("ffpclui_1307", 9, false); }
/*     */   
/*     */   public int execute(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3, long paramLong4, int paramInt3, boolean paramBoolean, int paramInt4)
/*     */   {
/*  18 */     call(paramLong1, paramLong2, paramInt1, paramInt2, paramLong3, paramLong4, paramInt3, paramBoolean, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(l1, l2, i, j, l3, l4, k, bool, m);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(long paramLong1, long paramLong2, int paramInt1, int paramInt2, long paramLong3, long paramLong4, int paramInt3, boolean paramBoolean, int paramInt4)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     short s = 0;
/*  62 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       if (paramBoolean)
/*     */       {
/*  70 */         paramLong1 -= paramLong3;
/*  71 */         paramLong3 = paramLong4 ^ 0xFFFFFFFFFFFFFFFF;
/*  72 */         paramLong2 = ((paramLong3 > paramLong2 ? paramLong3 : paramLong2) << 32 ^ 0xFFFFFFFF00000000) >> 32 ^ 0xFFFFFFFFFFFFFFFF;
/*  73 */         i = (int)((paramLong1 > paramLong2 ? paramLong1 : paramLong2) ^ 0xFFFFFFFF);
/*  74 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  78 */           k = paramInt1 + j;
/*  79 */           s = MainMemory.getI16(paramInt3 + (paramInt4 + j << 1));
/*  80 */           if (com.emt.proteus.lib.api.MathUtils.ugt(s, (short)255))
/*     */           {
/*  82 */             MainMemory.setI32(paramInt2, -11);
/*  83 */             b = -1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  90 */             b = (byte)s;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */           MainMemory.setI8(k, b);
/* 101 */           j += 1;
/* 102 */           if (j == i) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclui_1307.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */