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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube11CubicSearchEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1484;
/*  19 */   public static final Function _instance = new _ZN7duchamp4Cube11CubicSearchEv();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public _ZN7duchamp4Cube11CubicSearchEv() { super("_ZN7duchamp4Cube11CubicSearchEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  26 */     call(paramInt);
/*  27 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     call(i);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*     */     
/*     */ 
/*  46 */     int k = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       i = MainMemory.alloc(12);
/*  51 */       j = paramInt + 590;
/*  52 */       if (MainMemory.getI8(j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  62 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 14336);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  68 */       _ZN7duchamp4Cube12setCubeStatsEv.call(paramInt);
/*  69 */       if (MainMemory.getI8(j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 55456), 80);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  85 */       _ZN7duchamp13search3DArrayEPlPfRNS_5ParamERN10Statistics14StatsContainerIfEE.call(i, MainMemory.getI32(paramInt + 8), MainMemory.getI32(paramInt + 20), paramInt + 32, paramInt + 592);
/*  86 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEaSERKS3_.call(MainMemory.getI32(paramInt + 28), i);
/*  87 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EED1Ev.call(i);
/*  88 */       if (MainMemory.getI8(j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 73152), 80);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 104 */       _ZN7duchamp4Cube15updateDetectMapEv.call(paramInt);
/* 105 */       if (MainMemory.getI8(j) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28096);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 121 */       if (MainMemory.getI8(paramInt + 116) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         if (MainMemory.getI8(j) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */           _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 87264), 80);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 147 */         _ZN7duchamp4Cube16logDetectionListEb.call(paramInt);
/* 148 */         if (MainMemory.getI8(j) != 0) {
/*     */           break label296;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label311;
/*     */       
/*     */ 
/*     */ 
/*     */       label296:
/*     */       
/*     */ 
/*     */ 
/* 164 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28096);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label311:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */       MainMemory.dealloc_generated(k);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11CubicSearchEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */