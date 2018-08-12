/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube16calcObjectFluxesEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1345;
/*  14 */   public static final Function _instance = new _ZN7duchamp4Cube16calcObjectFluxesEv();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp4Cube16calcObjectFluxesEv() { super("_ZN7duchamp4Cube16calcObjectFluxesEv", 1, false); }
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
/*     */   public static void call(int paramInt)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       i = paramInt + 28;
/*  57 */       j = MainMemory.getI32(i);
/*  58 */       k = MainMemory.getI32(j);
/*  59 */       if (!MathUtils.ult(k, MainMemory.getI32(j + 4))) {
/*     */         break label295;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       m = paramInt + 8;
/*  70 */       n = paramInt + 20;
/*  71 */       i1 = paramInt + 452;
/*  72 */       i2 = paramInt + 592;
/*  73 */       i3 = paramInt + 616;
/*  74 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  81 */         i5 = k + i4 * 276 + 96;
/*  82 */         i6 = k + i4 * 276 + 112;
/*  83 */         i7 = i4 + 1;
/*  84 */         i8 = k + i7 * 276;
/*  85 */         _ZN7duchamp9Detection10calcFluxesEPfPl.call(k + i4 * 276, MainMemory.getI32(n), MainMemory.getI32(m));
/*  86 */         f = MainMemory.getF32(i5);
/*  87 */         if (MainMemory.getI8(i1) != 0) {
/*     */           break label242;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         f -= _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(i2);
/*  98 */         f /= _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(i2);
/*     */         
/*     */         break label257;
/*     */         
/*     */         label242:
/*     */         
/* 104 */         f /= MainMemory.getF32(i3);
/*     */         
/*     */ 
/*     */ 
/*     */         label257:
/*     */         
/*     */ 
/*     */ 
/* 112 */         MainMemory.setF32(i6, f);
/* 113 */         if (!MathUtils.ult(i8, MainMemory.getI32(MainMemory.getI32(i) + 4))) break;
/* 114 */         i4 = i7;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label295:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16calcObjectFluxesEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */