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
/*     */ public final class ffukyd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3493;
/*  15 */   public static final Function _instance = new ffukyd();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffukyd() { super("ffukyd", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramDouble, paramInt3, paramInt4);
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
/*  34 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, d, k, m);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble, int paramInt3, int paramInt4)
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
/*  61 */       k = MainMemory.getI32(paramInt4);
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
/*  72 */         if (ffmkyd.call(paramInt1, paramInt2, paramDouble, 15, paramInt3, paramInt4) != 202) {
/*     */           break label129;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setI32(paramInt4, k);
/*  83 */         ffd2e.call(paramDouble, 15, i, paramInt4);
/*  84 */         ffmkky.call(paramInt2, i, paramInt3, j, paramInt4);
/*  85 */         ffprec.call(paramInt1, j, paramInt4);
/*     */         
/*     */ 
/*     */ 
/*     */         break label134;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label129:
/*     */       
/*     */ 
/*     */ 
/*     */       label134:
/*     */       
/*     */ 
/*     */ 
/* 102 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffukyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */