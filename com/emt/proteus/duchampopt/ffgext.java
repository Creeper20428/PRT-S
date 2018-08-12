/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffgext
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3251;
/*  13 */   public static final Function _instance = new ffgext();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffgext() { super("ffgext", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = call(i, j, k, m);
/*  38 */     paramFrame.setI32(paramInt1, n);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     long l = 0L;
/*  52 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         j = paramInt1 + 4;
/*  69 */         if (ffmbyt.call(paramInt1, MainMemory.getI64(MainMemory.getI32(MainMemory.getI32(j) + 84) + (paramInt2 << 3)), 0, paramInt4) >= 1) {
/*     */           break label268;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         k = MainMemory.getI32(j);
/*  80 */         m = k + 64;
/*  81 */         n = MainMemory.getI32(m);
/*  82 */         i1 = MainMemory.getI32(k + 76);
/*  83 */         l = MainMemory.getI64(k + 88);
/*  84 */         MainMemory.setI32(m, paramInt2);
/*  85 */         MainMemory.setI32(paramInt1, paramInt2);
/*  86 */         m = MainMemory.getI32(j) + 76;
/*  87 */         i2 = MainMemory.getI32(m);
/*  88 */         MainMemory.setI32(m, i2 >= paramInt2 ? i2 : paramInt2);
/*  89 */         k = MainMemory.getI32(j);
/*  90 */         MainMemory.setI64(k + 88, MainMemory.getI64(k + 32));
/*  91 */         if (ffrhdu.call(paramInt1, paramInt3, paramInt4) <= 0) {
/*     */           break label268;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         MainMemory.setI32(MainMemory.getI32(j) + 64, n);
/* 102 */         MainMemory.setI32(paramInt1, n);
/* 103 */         MainMemory.setI32(MainMemory.getI32(j) + 76, i1);
/* 104 */         MainMemory.setI64(MainMemory.getI32(j) + 88, l);
/*     */       }
/*     */       
/*     */ 
/*     */       label268:
/*     */       
/* 110 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       int i3 = i;return i3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */