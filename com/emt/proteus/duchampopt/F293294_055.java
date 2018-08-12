/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F293294_055 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new F293294_055();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F293294_055() { super("F293294_055", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, bool, m, n);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     double d = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       if (!paramBoolean)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  66 */         i = paramInt4 + 84;
/*  67 */         j = paramInt4 + 88;
/*  68 */         paramInt3 = paramInt5 * paramInt3;
/*  69 */         paramInt5 = paramInt3 + -1;
/*     */         
/*  71 */         k = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  76 */           m = paramInt5 - k;
/*  77 */           MainMemory.setI8(MainMemory.getI32(i) + m, MainMemory.getI8(MainMemory.getI32(paramInt1 + 84) + m));
/*  78 */           if (MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt2) + 88) + (m << 2)) < 0)
/*     */           {
/*  80 */             MainMemory.setI8(MainMemory.getI32(i) + m, (byte)1);
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
/*  91 */           if (MainMemory.getI8(MainMemory.getI32(i) + m) == 0)
/*     */           {
/*  93 */             n = MainMemory.getI32(j);
/*  94 */             d = MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt2) + 88) + (m << 2));
/*  95 */             MainMemory.setI32(n + (m << 2), F303220.call(d));
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
/* 106 */           k += 1;
/* 107 */           if (k == paramInt3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 112 */           paramInt1 = MainMemory.getI32(paramInt2);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F293294_055.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */