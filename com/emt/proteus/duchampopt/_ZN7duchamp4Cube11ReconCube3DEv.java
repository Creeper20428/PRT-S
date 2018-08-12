/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube11ReconCube3DEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 772;
/*  16 */   public static final Function _instance = new _ZN7duchamp4Cube11ReconCube3DEv();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp4Cube11ReconCube3DEv() { super("_ZN7duchamp4Cube11ReconCube3DEv", 1, false); }
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
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*     */     
/*     */ 
/*  48 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       i = MainMemory.alloc(4);
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       k = MainMemory.alloc(4);
/*  55 */       m = MainMemory.getI32(paramInt + 8);
/*  56 */       n = MainMemory.getI32(m + 8);
/*  57 */       if (n != 1) {
/*     */         break label90;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */       _ZN7duchamp4Cube11ReconCube2DEv.call(paramInt);
/*     */       
/*     */ 
/*     */       break label270;
/*     */       
/*     */       label90:
/*     */       
/*  74 */       MainMemory.setI32(i, MainMemory.getI32(m));
/*  75 */       MainMemory.setI32(j, MainMemory.getI32(m + 4));
/*  76 */       MainMemory.setI32(k, n);
/*  77 */       i1 = paramInt + 632;
/*  78 */       if (MainMemory.getI8(i1) != 0) {
/*     */         break label265;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       i2 = paramInt + 590;
/*  89 */       if (MainMemory.getI8(i2) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 63008), 80);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 105 */       _ZN7duchamp19atrous3DReconstructERmS0_S0_RPfS2_RNS_5ParamE.call(i, j, k, paramInt + 20, paramInt + 628, paramInt + 32);
/* 106 */       MainMemory.setI8(i1, (byte)1);
/* 107 */       if (MainMemory.getI8(i2) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 50144);
/* 118 */         _Z10printSpacei.call(22);
/* 119 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13408);
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label265:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label270:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11ReconCube3DEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */