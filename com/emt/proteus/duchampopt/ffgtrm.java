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
/*     */ public final class ffgtrm
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3438;
/*  15 */   public static final Function _instance = new ffgtrm();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgtrm() { super("ffgtrm", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
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
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*     */     
/*     */ 
/*  49 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       i = MainMemory.alloc(4);
/*  54 */       j = MainMemory.alloc(4);
/*  55 */       MainMemory.setI32(j, 0);
/*  56 */       if (MainMemory.getI32(paramInt2) != 0) {
/*     */         break label174;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       m = ffgtnm.call(paramInt1, j, paramInt2);
/*  67 */       MainMemory.setI32(paramInt2, m);
/*  68 */       k = MainMemory.getI32(j);
/*     */       
/*  70 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  78 */         i1 = k - n;
/*  79 */         if ((i1 <= 0) || (m != 0)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         m = ffgmrm.call(paramInt1, i1, paramInt2);
/*  90 */         MainMemory.setI32(paramInt2, m);
/*  91 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */       MainMemory.setI32(paramInt2, ffgmul.call(paramInt1, paramInt2));
/*  99 */       MainMemory.setI32(paramInt2, ffdhdu.call(paramInt1, i, paramInt2));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label174:
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
/* 116 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtrm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */