/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgtdmll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3413;
/*  16 */   public static final Function _instance = new ffgtdmll();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgtdmll() { super("ffgtdmll", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, j, k, m, n);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*     */     
/*     */ 
/*  58 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.alloc(81);
/*  63 */       j = MainMemory.alloc(71);
/*  64 */       k = MainMemory.alloc(4);
/*  65 */       m = MainMemory.alloc(72);
/*  66 */       n = MainMemory.alloc(71);
/*  67 */       MainMemory.setI32(k, 0);
/*  68 */       if (MainMemory.getI32(paramInt5) <= 0) {
/*     */         break label91;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label202;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label91:
/*     */       
/*     */ 
/*     */ 
/*  84 */       ffkeyn.call(22336, paramInt2, m, paramInt5);
/*  85 */       if (MainMemory.getI32(k) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         MainMemory.setI8(j, (byte)0);
/*  96 */         if (ffgcrd.call(paramInt1, m, i, k) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */           ffpsvc.call(i, j, 0, k);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 112 */         MainMemory.setI8(n, (byte)0);
/* 113 */         ffc2s.call(j, n, k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 119 */       ffdtdmll.call(paramInt1, n, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label202:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtdmll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */