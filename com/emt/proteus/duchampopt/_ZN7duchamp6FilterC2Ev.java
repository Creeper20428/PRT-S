/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp6FilterC2Ev extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 445;
/*  14 */   public static final Function _instance = new _ZN7duchamp6FilterC2Ev();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp6FilterC2Ev() { super("_ZN7duchamp6FilterC2Ev", 1, false); }
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
/*     */     
/*     */ 
/*  49 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       MainMemory.setI32(paramInt, 12808);
/*  55 */       _ZNSsC1Ev.call(paramInt + 4);
/*  56 */       MainMemory.setI32(paramInt + 8, 0);
/*  57 */       MainMemory.setI32(paramInt + 12, 0);
/*  58 */       MainMemory.setI32(paramInt + 16, 0);
/*  59 */       MainMemory.setI32(paramInt + 20, 0);
/*  60 */       MainMemory.setI32(paramInt + 24, 0);
/*  61 */       MainMemory.setI32(paramInt + 28, 0);
/*  62 */       i = paramInt + 32;
/*  63 */       MainMemory.setI32(i, 0);
/*  64 */       MainMemory.setI32(paramInt + 36, 0);
/*  65 */       MainMemory.setI32(paramInt + 40, 0);
/*  66 */       MainMemory.setI32(j, 0);
/*  67 */       _ZNSt6vectorIPS_IdSaIdEESaIS2_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS2_S4_EEjRKS2_.call(paramInt + 32, 0, 3, j);
/*  68 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  75 */         if (i5 >= 3) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         j = MainMemory.getI32(i);
/*  86 */         i2 = SystemLibrary.newobject(12);
/*  87 */         k = i2;
/*  88 */         m = i2;
/*  89 */         MainMemory.setI32(m, 0);
/*  90 */         n = i2 + 4;
/*  91 */         MainMemory.setI32(n, 0);
/*  92 */         i1 = i2 + 8;
/*  93 */         MainMemory.setI32(i1, 0);
/*  94 */         i2 = SystemLibrary.newobject(160);
/*  95 */         i3 = i2;
/*  96 */         MainMemory.setI32(m, i3);
/*  97 */         MainMemory.setI32(n, i3);
/*  98 */         MainMemory.setI32(i1, i2 + 160);
/*  99 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 106 */           MainMemory.setF64(i2 + (i4 << 3), 0.0D);
/* 107 */           i4 += 1;
/* 108 */           if (i4 == 20) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */         MainMemory.setI32(n, MainMemory.getI32(m) + 160);
/* 120 */         MainMemory.setI32(j + (i5 << 2), k);
/* 121 */         i5 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 127 */       _ZN7duchamp6Filter10loadSplineEv.call(paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 138 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6FilterC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */