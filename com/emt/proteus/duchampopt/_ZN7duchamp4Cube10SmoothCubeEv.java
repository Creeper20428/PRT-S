/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube10SmoothCubeEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2085;
/*  16 */   public static final Function _instance = new _ZN7duchamp4Cube10SmoothCubeEv();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp4Cube10SmoothCubeEv() { super("_ZN7duchamp4Cube10SmoothCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  23 */     call(paramInt);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     call(i);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*     */     
/*     */ 
/*  45 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  49 */       i = MainMemory.alloc(4);
/*  50 */       j = MainMemory.alloc(4);
/*  51 */       k = paramInt + 456;
/*  52 */       _ZNSsC1ERKSs.call(j, k);
/*  53 */       m = _ZNKSs7compareEPKc.call(j, 43360) == 0 ? 1 : 0;
/*  54 */       _ZNSsD1Ev.call(j);
/*  55 */       if (m == 0) {
/*     */         break label87;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       _ZN7duchamp4Cube14SpectralSmoothEv.call(paramInt);
/*     */       
/*     */ 
/*     */       break label149;
/*     */       
/*     */       label87:
/*     */       
/*  72 */       _ZNSsC1ERKSs.call(i, k);
/*  73 */       m = _ZNKSs7compareEPKc.call(i, 37664) == 0 ? 1 : 0;
/*  74 */       _ZNSsD1Ev.call(i);
/*  75 */       if (m == 0) {
/*     */         break label144;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       _ZN7duchamp4Cube13SpatialSmoothEv.call(paramInt);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label144:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label149:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube10SmoothCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */