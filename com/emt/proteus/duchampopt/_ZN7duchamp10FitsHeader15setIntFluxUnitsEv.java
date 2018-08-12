/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs6substrEjj;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSs6appendERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSspLERKSs;
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader15setIntFluxUnitsEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 294;
/*  22 */   public static final Function _instance = new _ZN7duchamp10FitsHeader15setIntFluxUnitsEv();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public _ZN7duchamp10FitsHeader15setIntFluxUnitsEv() { super("_ZN7duchamp10FitsHeader15setIntFluxUnitsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  29 */     call(paramInt);
/*  30 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*     */     
/*     */ 
/*  52 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       i = MainMemory.alloc(1);
/*  57 */       j = MainMemory.alloc(4);
/*  58 */       k = MainMemory.alloc(4);
/*  59 */       m = MainMemory.alloc(4);
/*  60 */       n = paramInt + 36;
/*  61 */       if (_ZN7duchamp10FitsHeader12needBeamSizeEv.call(paramInt) != 0) {
/*     */         break label84;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */       _ZNSsaSERKSs.call(paramInt + 40, n);
/*     */       
/*     */       break label120;
/*     */       
/*     */       label84:
/*  76 */       _ZNKSs6substrEjj.call(m, n, 0, _ZNKSs4sizeEv.call(n) + -5);
/*  77 */       _ZNSsaSERKSs.call(paramInt + 40, m);
/*  78 */       _ZNSsD1Ev.call(m);
/*     */       
/*     */ 
/*     */       label120:
/*     */       
/*     */ 
/*  84 */       if (MainMemory.getI8(paramInt + 20) != 0) {
/*     */         break label200;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       _ZNSaIcEC1Ev.call(i);
/*  95 */       _ZNSsC1EPKcRKSaIcE.call(j, 13760, i);
/*  96 */       _ZNSsC1ERKSs.call(k, j);
/*  97 */       _ZNSs6appendERKSs.call(k, paramInt + 24);
/*  98 */       _ZNSspLERKSs.call(paramInt + 40, k);
/*  99 */       _ZNSsD1Ev.call(k);
/* 100 */       _ZNSsD1Ev.call(j);
/* 101 */       _ZNSaIcED1Ev.call(i);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label200:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader15setIntFluxUnitsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */