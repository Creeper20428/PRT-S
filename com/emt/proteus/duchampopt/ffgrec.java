/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgrec extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3399;
/*  12 */   public static final Function _instance = new ffgrec();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffgrec() { super("ffgrec", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = call(i, j, k, m);
/*  37 */     paramFrame.setI32(paramInt1, n);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     int i = 0;
/*     */     
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */         if (paramInt2 != 0) {
/*     */           break label175;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         paramInt2 = MainMemory.getI32(paramInt1);
/*  74 */         j = paramInt1 + 4;
/*  75 */         k = MainMemory.getI32(j);
/*  76 */         m = MainMemory.getI32(k + 64);
/*  77 */         if (paramInt2 == m) {
/*  78 */           paramInt2 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  89 */           ffmahd.call(paramInt1, paramInt2 + 1, 0, paramInt4);
/*  90 */           k = MainMemory.getI32(j);
/*  91 */           paramInt2 = MainMemory.getI32(k + 64);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         MainMemory.setI64(k + 104, MainMemory.getI64(MainMemory.getI32(k + 84) + (paramInt2 << 3)));
/* 102 */         if (paramInt3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */           MainMemory.setI8(paramInt3, (byte)0);
/*     */           
/*     */           break label187;
/*     */           
/*     */           label175:
/* 117 */           ffgrec_1060.call(paramInt3, paramInt1, paramInt4, paramInt2);
/*     */         }
/*     */       }
/*     */       
/*     */       label187:
/*     */       
/* 123 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       int n = i;return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgrec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */