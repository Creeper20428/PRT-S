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
/*     */ public final class ffukys
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3495;
/*  15 */   public static final Function _instance = new ffukys();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffukys() { super("ffukys", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, m, n);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*     */     
/*     */ 
/*  55 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       i = MainMemory.alloc(71);
/*  60 */       j = MainMemory.alloc(81);
/*  61 */       k = MainMemory.getI32(paramInt5);
/*  62 */       if (k <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         if (ffmkys.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5) != 202) {
/*     */           break label123;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setI32(paramInt5, k);
/*  83 */         ffs2c.call(paramInt3, i, k);
/*  84 */         ffmkky.call(paramInt2, i, paramInt4, j, paramInt5);
/*  85 */         ffprec.call(paramInt1, j, paramInt5);
/*     */         
/*     */ 
/*     */ 
/*     */         break label128;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label123:
/*     */       
/*     */ 
/*     */ 
/*     */       label128:
/*     */       
/*     */ 
/*     */ 
/* 102 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffukys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */