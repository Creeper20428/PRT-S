/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffukyl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3494;
/*  14 */   public static final Function _instance = new ffukyl();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffukyl() { super("ffukyl", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*     */     
/*     */ 
/*  54 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       i = MainMemory.alloc(71);
/*  59 */       j = MainMemory.alloc(81);
/*  60 */       k = MainMemory.getI32(paramInt5);
/*  61 */       if (k <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */         if (ffmkyl.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5) != 202) {
/*     */           break label131;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         MainMemory.setI32(paramInt5, k);
/*  82 */         MainMemory.setI16(i, (short)(paramInt3 == 0 ? 70 : 84));
/*  83 */         ffmkky.call(paramInt2, i, paramInt4, j, paramInt5);
/*  84 */         ffprec.call(paramInt1, j, paramInt5);
/*     */         
/*     */ 
/*     */ 
/*     */         break label136;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label131:
/*     */       
/*     */ 
/*     */ 
/*     */       label136:
/*     */       
/*     */ 
/*     */ 
/* 101 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffukyl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */