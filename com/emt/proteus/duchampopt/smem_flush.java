/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class smem_flush extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3126;
/*  12 */   public static final Function _instance = new smem_flush();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public smem_flush() { super("smem_flush", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  44 */       if (!MainMemory.getI1(459056))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  54 */         j = shared_init.call();
/*  55 */         if (j != 0)
/*     */         {
/*     */ 
/*     */ 
/*  59 */           paramInt = j;
/*     */           
/*     */ 
/*     */           break label237;
/*     */         }
/*     */       }
/*     */       
/*  66 */       if (paramInt < 0) {
/*  67 */         paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  77 */       else if (MainMemory.getI32Aligned(459504) <= paramInt)
/*     */       {
/*     */ 
/*     */ 
/*  81 */         paramInt = 151;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  88 */         k = MainMemory.getI32Aligned(458776);
/*  89 */         m = MainMemory.getI32(k + (paramInt << 4));
/*  90 */         if (m == 0) {
/*  91 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 101 */         else if (MainMemory.getI32(k + (paramInt << 4) + 8) == 0) {
/* 102 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 112 */         else if (MainMemory.getI8(m) != 74)
/*     */         {
/*     */ 
/*     */ 
/* 116 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 123 */         else if (MainMemory.getI8(m + 1) != 66)
/*     */         {
/*     */ 
/*     */ 
/* 127 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 134 */           paramInt = MainMemory.getI8(m + 2) == 1 ? 0 : 151;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label237:
/*     */       
/*     */ 
/* 142 */       i = paramInt != 0 ? -1 : 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       int n = i;return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/smem_flush.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */