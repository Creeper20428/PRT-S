/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class linfree extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2792;
/*  12 */   public static final Function _instance = new linfree();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public linfree() { super("linfree", 1, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  42 */       if (paramInt != 0) {
/*     */         break label33;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  52 */       i = 1;
/*     */       
/*     */ 
/*     */       break label199;
/*     */       
/*     */       label33:
/*     */       
/*  59 */       if (MainMemory.getI32(paramInt) != -1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */         linfree_1557.call(paramInt);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  75 */       MainMemory.setI32(paramInt + 36, 0);
/*  76 */       MainMemory.setI32(paramInt + 40, 0);
/*  77 */       MainMemory.setI32(paramInt + 44, 0);
/*  78 */       MainMemory.setI32(paramInt + 48, 0);
/*  79 */       MainMemory.setI32(paramInt + 52, 0);
/*  80 */       if (MainMemory.getI32(paramInt) != 137) {
/*     */         break label163;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       j = MainMemory.getI32(paramInt + 20);
/*  91 */       if (j != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         com.emt.proteus.runtime.library.c.free.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 107 */       linfree_1558.call(paramInt);
/*     */       
/*     */ 
/*     */       label163:
/*     */       
/*     */ 
/* 113 */       MainMemory.setI32(paramInt + 20, 0);
/* 114 */       MainMemory.setI32(paramInt + 24, 0);
/* 115 */       MainMemory.setI32(paramInt + 32, 0);
/* 116 */       MainMemory.setI32(paramInt, 0);
/* 117 */       i = 0;
/*     */       
/*     */ 
/*     */       label199:
/*     */       
/*     */ 
/* 123 */       int k = i; return k;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linfree.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */