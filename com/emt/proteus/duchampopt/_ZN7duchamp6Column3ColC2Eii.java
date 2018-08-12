/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ public final class _ZN7duchamp6Column3ColC2Eii extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 919;
/*  24 */   public static final Function _instance = new _ZN7duchamp6Column3ColC2Eii();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp6Column3ColC2Eii() { super("_ZN7duchamp6Column3ColC2Eii", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  31 */     call(paramInt1, paramInt2, paramInt3);
/*  32 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, j, k);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*     */     
/*     */ 
/*  61 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(1);
/*  66 */       j = MainMemory.alloc(4);
/*  67 */       k = MainMemory.alloc(4);
/*  68 */       m = MainMemory.alloc(188);
/*  69 */       MainMemory.setI32(paramInt1, 12776);
/*  70 */       n = paramInt1 + 12;
/*  71 */       _ZNSsC1Ev.call(n);
/*  72 */       i1 = paramInt1 + 16;
/*  73 */       _ZNSsC1Ev.call(i1);
/*  74 */       if (!MathUtils.ult(paramInt2, 38)) {
/*     */         break label211;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(147520 + (paramInt2 << 2)));
/*  85 */       if (paramInt3 >= 0) {
/*     */         break label156;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */       MainMemory.setI32(paramInt1 + 8, MainMemory.getI32(147360 + (paramInt2 << 2)));
/*     */       
/*     */       break label169;
/*     */       
/*     */       label156:
/* 100 */       MainMemory.setI32(paramInt1 + 8, paramInt3);
/*     */       
/*     */ 
/*     */       label169:
/*     */       
/*     */ 
/* 106 */       _ZNSsaSERKSs.call(n, 471776 + (paramInt2 << 2));
/* 107 */       _ZNSsaSERKSs.call(i1, 476736 + (paramInt2 << 2));
/* 108 */       MainMemory.setI32(paramInt1 + 20, paramInt2);
/*     */       
/*     */ 
/*     */       break label341;
/*     */       
/*     */       label211:
/*     */       
/* 115 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(m, 24);
/* 116 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m + 8, 87200), paramInt2), 70656), 37), 14656);
/* 117 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, m);
/* 118 */       com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(i);
/* 119 */       _ZNSsC1EPKcRKSaIcE.call(j, 60064, i);
/* 120 */       _ZN7duchamp12duchampErrorESsSs.call(j, k);
/* 121 */       _ZNSsD1Ev.call(j);
/* 122 */       _ZNSaIcED1Ev.call(i);
/* 123 */       _ZNSsD1Ev.call(k);
/* 124 */       MainMemory.setI32(paramInt1 + 4, 1);
/* 125 */       MainMemory.setI32(paramInt1 + 8, 0);
/* 126 */       _ZNSsaSEPKc.call(n, 13760);
/* 127 */       _ZNSsaSEPKc.call(i1, 13760);
/* 128 */       MainMemory.setI32(paramInt1 + 20, 38);
/* 129 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(m);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label341:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column3ColC2Eii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */