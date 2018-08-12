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
/*     */ public final class _ZN7duchamp4Cube6SearchEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1353;
/*  16 */   public static final Function _instance = new _ZN7duchamp4Cube6SearchEv();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp4Cube6SearchEv() { super("_ZN7duchamp4Cube6SearchEv", 1, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  45 */       if (MainMemory.getI8(paramInt + 476) != 0) {
/*     */         break label161;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */       i = MainMemory.getI8(paramInt + 590) == 0 ? 1 : 0;
/*  56 */       if (MainMemory.getI8(paramInt + 453) != 0) {
/*     */         break label114;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       if (i == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 73280), 79);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  82 */       _ZN7duchamp4Cube11CubicSearchEv.call(paramInt);
/*     */       
/*     */ 
/*     */       break label210;
/*     */       
/*     */       label114:
/*     */       
/*  89 */       if (i == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 87328), 79);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 105 */       _ZN7duchamp4Cube12SmoothSearchEv.call(paramInt);
/*     */       
/*     */ 
/*     */       break label210;
/*     */       
/*     */       label161:
/*     */       
/* 112 */       if (MainMemory.getI8(paramInt + 590) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 96736), 79);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 128 */       _ZN7duchamp4Cube11ReconSearchEv.call(paramInt);
/*     */       
/*     */ 
/*     */       label210:
/*     */       
/*     */ 
/* 134 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube6SearchEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */