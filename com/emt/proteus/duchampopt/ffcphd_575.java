/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffcphd_575 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new ffcphd_575();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffcphd_575() { super("ffcphd_575", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  20 */     return 0;
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
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, m, n, i1);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       ffprec.call(paramInt6, 144192, paramInt2);
/*  60 */       ffprec.call(paramInt6, 143808, paramInt2);
/*  61 */       if (paramInt3 < paramInt4)
/*     */       {
/*  63 */         paramInt3 = paramInt5 * 81 + 243;
/*  64 */         paramInt5 += 4;
/*  65 */         i = 0;
/*     */         label189:
/*     */         label203:
/*     */         do {
/*  69 */           j = paramInt1 + (paramInt3 + i * 81);
/*  70 */           k = paramInt5 + i;
/*  71 */           m = com.emt.proteus.runtime.api.MainMemory.getI8(j);
/*  72 */           switch (m)
/*     */           {
/*     */           case 80: 
/*  75 */             if (SystemLibrary.strncmp(j, 45408, 8) == 0)
/*     */             {
/*     */               break label203;
/*     */             }
/*  79 */             else if (m != 71) {
/*     */               break label189;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */             break;
/*     */           case 71: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*  99 */           if (SystemLibrary.strncmp(j, 45728, 8) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */             ffprec.call(paramInt6, j, paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 115 */           i += 1;
/* 116 */         } while (k < paramInt4);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcphd_575.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */