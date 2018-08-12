/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp6FilterD2Ev extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 494;
/*  12 */   public static final Function _instance = new _ZN7duchamp6FilterD2Ev();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp6FilterD2Ev() { super("_ZN7duchamp6FilterD2Ev", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     call(paramInt);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     call(i);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       MainMemory.setI32(paramInt, 12808);
/*  46 */       i = paramInt + 8;
/*  47 */       MainMemory.setI32(paramInt + 12, MainMemory.getI32(i));
/*  48 */       j = paramInt + 20;
/*  49 */       k = MainMemory.getI32(j);
/*  50 */       MainMemory.setI32(paramInt + 24, k);
/*  51 */       m = MainMemory.getI32(paramInt + 32);
/*  52 */       MainMemory.setI32(paramInt + 36, m);
/*  53 */       if (m != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */         SystemLibrary.delete(m);
/*  65 */         k = MainMemory.getI32(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         SystemLibrary.delete(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  89 */       n = MainMemory.getI32(i);
/*  90 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         SystemLibrary.delete(n);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 106 */       com.emt.proteus.runtime.library.strings._ZNSsD1Ev.call(paramInt + 4); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6FilterD2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */