/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffchdu_549
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  14 */   public static final Function _instance = new ffchdu_549();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffchdu_549() { super("ffchdu_549", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
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
/*  39 */     call(i, j, k, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       if (MainMemory.getI32(paramInt3 + 72) == 1)
/*     */       {
/*  56 */         i = MainMemory.getI32Aligned(467208) + -1;
/*  57 */         j = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  61 */           k = i - j;
/*  62 */           if (k <= -1)
/*     */             break;
/*  64 */           j += 1;
/*  65 */           if (SystemLibrary.strcmp(492288 + k * 84, 47904) == 0) {
/*     */             break;
/*     */           }
/*     */         }
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
/*  81 */         if (MainMemory.getI32(paramInt3 + 4) != k)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */           ffrdef.call(paramInt2, paramInt1);
/*  88 */           paramInt3 = MainMemory.getI32(paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (MainMemory.getI64(paramInt3 + 956) > 0L)
/*     */         {
/* 100 */           ffuptf.call(paramInt2, paramInt1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         ffpdfl.call(paramInt2, paramInt1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffchdu_549.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */