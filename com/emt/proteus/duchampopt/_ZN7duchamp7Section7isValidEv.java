/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ 
/*     */ public final class _ZN7duchamp7Section7isValidEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2575;
/*  11 */   public static final Function _instance = new _ZN7duchamp7Section7isValidEv();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp7Section7isValidEv() { super("_ZN7duchamp7Section7isValidEv", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     byte b = call(i, j, k);
/*  33 */     paramFrame.setI8(paramInt1, b);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     byte b1 = 0;
/*     */     
/*  41 */     int i = 0;
/*  42 */     byte b2 = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       i = paramInt1 != 0 ? 1 : 0;
/*  51 */       b2 = (byte)(i != 0 ? 1 : 0);
/*  52 */       paramInt1 = paramInt3 - paramInt2;
/*  53 */       if ((i == 0) || (!com.emt.proteus.lib.api.MathUtils.ugt(paramInt1, 3))) {
/*     */         break label174;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       paramInt1 >>= 2;
/*  65 */       i = i == 0 ? 1 : 0;
/*  66 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  75 */         k = j + 1;
/*  76 */         if (i != 0) {
/*  77 */           b2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label174;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*  87 */         if (com.emt.proteus.runtime.api.MainMemory.getI32(paramInt2 + (j << 2)) < 1) {
/*  88 */           b2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label174;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*  98 */         if (!com.emt.proteus.lib.api.MathUtils.ugt(paramInt1, k)) break;
/*  99 */         j = k;
/* 100 */         i = 0;
/*     */       }
/*     */       break label174;
/* 103 */       b2 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label174:
/*     */       
/*     */ 
/*     */ 
/* 112 */       b1 = b2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       byte b3 = b1;return b3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7Section7isValidEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */