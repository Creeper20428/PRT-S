/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgkys
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3412;
/*  14 */   public static final Function _instance = new ffgkys();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgkys() { super("ffgkys", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = call(i, j, k, m, n);
/*  42 */     paramFrame.setI32(paramInt1, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*     */     
/*     */ 
/*  55 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(81);
/*  60 */       k = MainMemory.alloc(71);
/*  61 */       m = MainMemory.getI32(paramInt5);
/*  62 */       if (m <= 0) {
/*     */         break label70;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       i = m;
/*     */       
/*     */ 
/*     */       break label186;
/*     */       
/*     */       label70:
/*     */       
/*  79 */       MainMemory.setI8(k, (byte)0);
/*  80 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         MainMemory.setI8(paramInt4, (byte)0);
/*  92 */         m = MainMemory.getI32(paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         if (ffgcrd.call(paramInt1, paramInt2, j, paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */           ffpsvc.call(j, k, paramInt4, paramInt5);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 126 */       MainMemory.setI8(paramInt3, (byte)0);
/* 127 */       ffc2s.call(k, paramInt3, paramInt5);
/* 128 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       label186:
/*     */       
/*     */ 
/* 134 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 139 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgkys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */