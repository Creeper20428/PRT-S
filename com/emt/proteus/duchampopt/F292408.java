/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F292408 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3176;
/*  12 */   public static final Function _instance = new F292408();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F292408() { super("F292408", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       j = MainMemory.getI32Aligned(470792);
/*  51 */       k = j + paramInt * 344 + 8;
/*  52 */       m = j + paramInt * 344 + 52;
/*  53 */       i2 = j;
/*  54 */       i3 = 0;
/*  55 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  64 */         i5 = j + paramInt * 344 + 12 + (i3 << 2);
/*  65 */         if (MainMemory.getI32(k) <= i3) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         n = MainMemory.getI32(i5);
/*  76 */         i1 = MainMemory.getI32(m);
/*  77 */         if (MainMemory.getI32(i2 + n * 344 + 52) != i1)
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
/*  88 */           n = F291637.call(i1, 0, n);
/*  89 */           MainMemory.setI32(i5, n);
/*  90 */           if (n >= 0) {
/*     */             break label200;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           i = -1;
/*     */           
/*     */ 
/*     */           break label299;
/*     */         }
/*     */         
/*     */         label200:
/*     */         
/* 109 */         i2 = MainMemory.getI32Aligned(470792);
/* 110 */         i4 = MainMemory.getI32(i2 + n * 344 + 56) + i4;
/* 111 */         i3 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       MainMemory.setI32(j + paramInt * 344 + 56 + 4, 1);
/* 120 */       MainMemory.setI32(j + paramInt * 344 + 56, i4);
/* 121 */       MainMemory.setI32(j + paramInt * 344 + 56 + 8, i4);
/* 122 */       i = paramInt;
/*     */       
/*     */ 
/*     */       label299:
/*     */       
/*     */ 
/* 128 */       int i6 = i; return i6;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F292408.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */