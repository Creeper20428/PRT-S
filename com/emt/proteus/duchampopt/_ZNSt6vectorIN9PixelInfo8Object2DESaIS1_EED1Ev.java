/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt6vectorIN9PixelInfo8Object2DESaIS1_EED1Ev extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 758;
/*  11 */   public static final Function _instance = new _ZNSt6vectorIN9PixelInfo8Object2DESaIS1_EED1Ev();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZNSt6vectorIN9PixelInfo8Object2DESaIS1_EED1Ev() { super("_ZNSt6vectorIN9PixelInfo8Object2DESaIS1_EED1Ev", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  42 */       i = MainMemory.getI32(paramInt + 4);
/*  43 */       j = MainMemory.getI32(paramInt);
/*  44 */       if (j == i) {
/*  45 */         i = j;
/*     */         break label99;
/*     */       } else {
/*  48 */         k = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  57 */         com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(j + k * 44)), j + k * 44);
/*  58 */         k += 1;
/*  59 */         if (j + k * 44 == i) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */       i = MainMemory.getI32(paramInt);
/*     */       
/*     */ 
/*     */ 
/*     */       label99:
/*     */       
/*     */ 
/*     */ 
/*  78 */       if (i != 0) {
/*     */         break label126;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label135;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label126:
/*     */       
/*     */ 
/*     */ 
/*  94 */       com.emt.proteus.runtime.api.SystemLibrary.delete(i);
/*     */       
/*     */ 
/*     */       label135:
/*     */       
/*     */ 
/* 100 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN9PixelInfo8Object2DESaIS1_EED1Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */