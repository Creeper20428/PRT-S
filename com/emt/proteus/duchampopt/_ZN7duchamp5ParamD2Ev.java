/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp5ParamD2Ev extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 137;
/*  14 */   public static final Function _instance = new _ZN7duchamp5ParamD2Ev();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp5ParamD2Ev() { super("_ZN7duchamp5ParamD2Ev", 1, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  43 */       MainMemory.setI32(paramInt, 12744);
/*  44 */       if (MainMemory.getI32(paramInt + 268) <= 0) {
/*     */         break label70;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  54 */       i = MainMemory.getI32(paramInt + 264);
/*  55 */       if (i != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         SystemLibrary.deletearray(i);
/*     */       }
/*     */       
/*     */ 
/*     */       label70:
/*     */       
/*  71 */       _ZNSsD1Ev.call(paramInt + 552);
/*  72 */       _ZNSsD1Ev.call(paramInt + 548);
/*  73 */       _ZNSsD1Ev.call(paramInt + 544);
/*  74 */       _ZNSsD1Ev.call(paramInt + 540);
/*  75 */       _ZNSsD1Ev.call(paramInt + 512);
/*  76 */       _ZN7duchamp6FilterD1Ev.call(paramInt + 464);
/*  77 */       _ZNSsD1Ev.call(paramInt + 424);
/*  78 */       _ZN7duchamp7SectionD1Ev.call(paramInt + 360);
/*  79 */       _ZNSsD1Ev.call(paramInt + 324);
/*  80 */       MainMemory.setI32(paramInt + 300, 12456);
/*  81 */       _ZNSsD1Ev.call(paramInt + 228);
/*  82 */       _ZNSsD1Ev.call(paramInt + 188);
/*  83 */       _ZNSsD1Ev.call(paramInt + 184);
/*  84 */       _ZNSsD1Ev.call(paramInt + 176);
/*  85 */       _ZNSsD1Ev.call(paramInt + 172);
/*  86 */       _ZNSsD1Ev.call(paramInt + 164);
/*  87 */       _ZNSsD1Ev.call(paramInt + 156);
/*  88 */       _ZNSsD1Ev.call(paramInt + 148);
/*  89 */       _ZNSsD1Ev.call(paramInt + 140);
/*  90 */       _ZNSsD1Ev.call(paramInt + 132);
/*  91 */       _ZNSsD1Ev.call(paramInt + 124);
/*  92 */       _ZNSsD1Ev.call(paramInt + 116);
/*  93 */       _ZNSsD1Ev.call(paramInt + 108);
/*  94 */       _ZNSsD1Ev.call(paramInt + 100);
/*  95 */       _ZNSsD1Ev.call(paramInt + 92);
/*  96 */       _ZNSsD1Ev.call(paramInt + 88);
/*  97 */       _ZNSsD1Ev.call(paramInt + 80);
/*  98 */       _ZNSsD1Ev.call(paramInt + 72);
/*  99 */       _ZNSsD1Ev.call(paramInt + 64);
/* 100 */       _ZN7duchamp7SectionD1Ev.call(paramInt + 12);
/* 101 */       _ZNSsD1Ev.call(paramInt + 4); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5ParamD2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */