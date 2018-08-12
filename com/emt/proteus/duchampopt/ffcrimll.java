/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffcrimll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3591;
/*  14 */   public static final Function _instance = new ffcrimll();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffcrimll() { super("ffcrimll", 5, false); }
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
/*  53 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.getI32(paramInt5);
/*  60 */       if (j <= 0) {
/*     */         break label54;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */       i = j;
/*     */       
/*     */ 
/*     */       break label207;
/*     */       
/*     */       label54:
/*     */       
/*  77 */       j = MainMemory.getI32(paramInt1);
/*  78 */       k = paramInt1 + 4;
/*  79 */       m = MainMemory.getI32(k);
/*  80 */       n = MainMemory.getI32(m + 64);
/*  81 */       if (j == n) {
/*  82 */         j = n;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  93 */         ffmahd.call(paramInt1, j + 1, 0, paramInt5);
/*  94 */         m = MainMemory.getI32(k);
/*  95 */         j = MainMemory.getI32(m + 64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */       if (MainMemory.getI64(m + 88) != MainMemory.getI64(MainMemory.getI32(m + 84) + (j << 3)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         ffcrhd.call(paramInt1, paramInt5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 121 */       ffphprll.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 122 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       label207:
/*     */       
/*     */ 
/* 128 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcrimll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */