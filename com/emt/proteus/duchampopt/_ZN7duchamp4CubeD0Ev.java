/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp4CubeD0Ev
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1367;
/*  14 */   public static final Function _instance = new _ZN7duchamp4CubeD0Ev();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp4CubeD0Ev() { super("_ZN7duchamp4CubeD0Ev", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     call(paramInt);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*     */     try
/*     */     {
/*  42 */       MainMemory.setI32(paramInt, 12296);
/*  43 */       if (MainMemory.getI32(paramInt + 16) <= 0) {
/*     */         break label39;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  53 */       _ZN7duchamp4CubeD0Ev_298.call(paramInt);
/*     */       
/*     */ 
/*     */       label39:
/*     */       
/*     */ 
/*  59 */       if (MainMemory.getI8(paramInt + 644) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */         _ZN7duchamp4CubeD0Ev_299.call(paramInt);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  75 */       if (MainMemory.getI8(paramInt + 645) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         _ZN7duchamp4CubeD0Ev_300.call(paramInt);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  91 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(paramInt + 764);
/*  92 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(paramInt + 752);
/*  93 */       _ZN7duchamp10FitsHeaderD1Ev.call(paramInt + 648);
/*  94 */       _ZN7duchamp9DataArrayD2Ev.call(paramInt);
/*  95 */       SystemLibrary.delete(paramInt);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4CubeD0Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */