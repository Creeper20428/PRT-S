/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgcls2_988 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new ffgcls2_988();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffgcls2_988() { super("ffgcls2_988", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean2)
/*     */   {
/*  18 */     call(paramInt1, paramBoolean1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     boolean bool1 = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool2 = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, bool1, j, k, m, n, i1, bool2);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void call(int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean2)
/*     */   {
/*     */     try
/*     */     {
/*  59 */       com.emt.proteus.runtime.api.Jump.label(345465);
/*  60 */       if (com.emt.proteus.runtime.api.SystemLibrary.strncmp(paramInt4, MainMemory.getI32(paramInt2), paramInt6) == 0)
/*     */       {
/*  62 */         MainMemory.setI32(paramInt3, 1);
/*  63 */         if (paramBoolean1)
/*     */         {
/*  65 */           paramInt1 = MainMemory.getI32(paramInt2);
/*  66 */           if (paramBoolean2)
/*     */           {
/*  68 */             MainMemory.setI16(paramInt1, (short)32);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  75 */             com.emt.proteus.runtime.api.SystemLibrary.strcpy(paramInt1, paramInt5);
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*  86 */           MainMemory.setI8(paramInt1, (byte)1);
/*     */         }
/*     */       }
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
/* 100 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 101 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcls2_988.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */