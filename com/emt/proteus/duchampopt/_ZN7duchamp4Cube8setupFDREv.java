/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube8setupFDREv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1355;
/*  17 */   public static final Function _instance = new _ZN7duchamp4Cube8setupFDREv();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN7duchamp4Cube8setupFDREv() { super("_ZN7duchamp4Cube8setupFDREv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  24 */     call(paramInt);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*     */     
/*     */ 
/*  46 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       i = MainMemory.alloc(1);
/*  51 */       j = MainMemory.alloc(4);
/*  52 */       k = MainMemory.alloc(1);
/*  53 */       m = MainMemory.alloc(4);
/*  54 */       if (MainMemory.getI8(paramInt + 453) != 0) {
/*     */         break label126;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       if (MainMemory.getI8(paramInt + 476) != 0) {
/*     */         break label104;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       _ZN7duchamp4Cube8setupFDREPf.call(paramInt, MainMemory.getI32(paramInt + 20));
/*     */       
/*     */ 
/*     */       break label234;
/*     */       
/*     */       label104:
/*     */       
/*  81 */       _ZN7duchamp4Cube8setupFDREPf.call(paramInt, MainMemory.getI32(paramInt + 628));
/*     */       
/*     */ 
/*     */       break label234;
/*     */       
/*     */       label126:
/*     */       
/*  88 */       if (MainMemory.getI8(paramInt + 632) != 0) {
/*     */         break label217;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */       _ZNSaIcEC1Ev.call(k);
/*  99 */       _ZNSsC1EPKcRKSaIcE.call(m, 142560, k);
/* 100 */       _ZNSaIcEC1Ev.call(i);
/* 101 */       _ZNSsC1EPKcRKSaIcE.call(j, 42464, i);
/* 102 */       _ZN7duchamp12duchampErrorESsSs.call(j, m);
/* 103 */       _ZNSsD1Ev.call(j);
/* 104 */       _ZNSaIcED1Ev.call(i);
/* 105 */       _ZNSsD1Ev.call(m);
/* 106 */       _ZNSaIcED1Ev.call(k);
/* 107 */       _ZN7duchamp4Cube8setupFDREPf.call(paramInt, MainMemory.getI32(paramInt + 20));
/*     */       
/*     */ 
/*     */       break label234;
/*     */       
/*     */       label217:
/*     */       
/* 114 */       _ZN7duchamp4Cube8setupFDREPf.call(paramInt, MainMemory.getI32(paramInt + 628));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label234:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube8setupFDREv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */