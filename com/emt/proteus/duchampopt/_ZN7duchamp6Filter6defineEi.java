/*     */ package com.emt.proteus.duchampopt;
/*     */ 
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
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp6Filter6defineEi
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 507;
/*  24 */   public static final Function _instance = new _ZN7duchamp6Filter6defineEi();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp6Filter6defineEi() { super("_ZN7duchamp6Filter6defineEi", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  31 */     call(paramInt1, paramInt2);
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
/*  43 */     call(i, j);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*     */     
/*     */ 
/*  56 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       i = MainMemory.alloc(1);
/*  61 */       j = MainMemory.alloc(4);
/*  62 */       k = MainMemory.alloc(4);
/*  63 */       m = MainMemory.alloc(188);
/*  64 */       switch (paramInt2)
/*     */       {
/*     */       case 2: 
/*     */         break label110;
/*     */         break;
/*     */       case 3: 
/*     */         break;
/*     */       case 1: 
/*     */         break label198;
/*     */         break;
/*     */       }
/*     */       
/*  76 */       _ZN7duchamp6Filter8loadHaarEv.call(paramInt1);
/*     */       
/*     */ 
/*     */       break label207;
/*     */       
/*     */       label110:
/*     */       
/*  83 */       _ZN7duchamp6Filter12loadTriangleEv.call(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       break label207;
/*     */       
/*     */ 
/*  90 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(m, 24);
/*  91 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m + 8, 52448), paramInt2), 75168);
/*  92 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, m);
/*  93 */       _ZNSaIcEC1Ev.call(i);
/*  94 */       _ZNSsC1EPKcRKSaIcE.call(j, 54784, i);
/*  95 */       _ZN7duchamp14duchampWarningESsSs.call(j, k);
/*  96 */       _ZNSsD1Ev.call(j);
/*  97 */       _ZNSaIcED1Ev.call(i);
/*  98 */       _ZNSsD1Ev.call(k);
/*  99 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(m);
/*     */       
/*     */ 
/*     */       label198:
/*     */       
/*     */ 
/* 105 */       _ZN7duchamp6Filter10loadSplineEv.call(paramInt1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label207:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Filter6defineEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */