/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F276629
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3120;
/*  13 */   public static final Function _instance = new F276629();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F276629() { super("F276629", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       if (paramInt >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */         if (MainMemory.getI32Aligned(459504) <= paramInt) {
/*     */           break label311;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         j = MainMemory.getI32Aligned(458772);
/*  66 */         k = MainMemory.getI32(j + paramInt * 28);
/*  67 */         if (k == -1)
/*     */         {
/*  69 */           k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  79 */           k = semctl.call(k, 0, 0, new Object[] { Integer.valueOf(0) });
/*  80 */           j = MainMemory.getI32Aligned(458772);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         m = MainMemory.getI32(j + paramInt * 28 + 12);
/*  91 */         if (m == -1) {
/*  92 */           m = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 102 */           m = shmctl.call(m, 0, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         k = k == 0 ? m : k;
/* 111 */         if (MainMemory.getI32Aligned(459504) <= paramInt)
/*     */         {
/*     */ 
/*     */ 
/* 115 */           paramInt = 151;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 122 */           j = MainMemory.getI32Aligned(458772);
/* 123 */           MainMemory.setI32(j + paramInt * 28 + 8, -1);
/* 124 */           MainMemory.setI32(j + paramInt * 28 + 12, -1);
/* 125 */           MainMemory.setI32(j + paramInt * 28, -1);
/* 126 */           MainMemory.setI32(j + paramInt * 28 + 4, -1);
/* 127 */           MainMemory.setI32(j + paramInt * 28 + 20, 0);
/* 128 */           MainMemory.setI32(j + paramInt * 28 + 16, 0);
/* 129 */           MainMemory.setI8(j + paramInt * 28 + 24, (byte)0);
/* 130 */           paramInt = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         i = k == 0 ? paramInt : k;
/*     */         
/*     */         break label320;
/*     */       }
/*     */       
/*     */       label311:
/*     */       
/* 144 */       i = 151;
/*     */       
/*     */ 
/*     */       label320:
/*     */       
/*     */ 
/* 150 */       int n = i; return n;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F276629.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */