/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffmbyt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2963;
/*  13 */   public static final Function _instance = new ffmbyt();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffmbyt() { super("ffmbyt", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramLong, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = call(i, l, j, k);
/*  38 */     paramFrame.setI32(paramInt1, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*     */     
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       m = MainMemory.getI32(paramInt3);
/*  56 */       if (m > 0) {
/*  57 */         paramInt2 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         if (paramLong >= 0L) {
/*     */           break label82;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         MainMemory.setI32(paramInt3, 304);
/*  78 */         i = 304;
/*     */         
/*     */ 
/*     */         break label284;
/*     */         
/*     */         label82:
/*     */         
/*  85 */         m = MainMemory.getI32(paramInt1);
/*  86 */         j = paramInt1 + 4;
/*  87 */         k = MainMemory.getI32(j);
/*  88 */         if (m != MainMemory.getI32(k + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */           ffmahd.call(paramInt1, m + 1, 0, paramInt3);
/* 100 */           k = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         m = (int)(paramLong / 2880L);
/* 109 */         n = MainMemory.getI32(k + 60);
/* 110 */         if ((n < 0) || 
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */           (MainMemory.getI32(k + 1216 + (n << 2)) != m))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */           ffldrc.call(paramInt1, m, paramInt2, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 136 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 137 */         if (paramInt2 >= 1) {
/*     */           break label276;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         MainMemory.setI64(MainMemory.getI32(j) + 44, paramLong);
/* 149 */         i = MainMemory.getI32(paramInt3);
/*     */         
/*     */ 
/*     */         break label284;
/*     */       }
/*     */       
/*     */       label276:
/*     */       
/* 157 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label284:
/*     */       
/*     */ 
/* 163 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmbyt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */