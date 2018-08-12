/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSs6appendEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsixEj;
/*     */ 
/*     */ public final class _ZN7duchamp14duchampWarningESsSs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 86;
/*  21 */   public static final Function _instance = new _ZN7duchamp14duchampWarningESsSs();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public _ZN7duchamp14duchampWarningESsSs() { super("_ZN7duchamp14duchampWarningESsSs", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  28 */     call(paramInt1, paramInt2);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*     */     
/*     */ 
/*  52 */     int m = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       i = MainMemory.alloc(4);
/*  57 */       j = MainMemory.alloc(4);
/*  58 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i, 47104, paramInt1);
/*  59 */       com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs.call(j, i);
/*  60 */       _ZNSs6appendEPKc.call(j, 18880);
/*  61 */       _ZNSsD1Ev.call(i);
/*  62 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(2048, j);
/*  63 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  70 */         if (!MathUtils.ugt(_ZNKSs4sizeEv.call(paramInt2), k)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(2048, MainMemory.getI8(_ZNSsixEj.call(paramInt2, k)));
/*  81 */         if (_ZNKSs4sizeEv.call(paramInt2) + -1 != k)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */           if (MainMemory.getI8(_ZNSsixEj.call(paramInt2, k)) != 10) {
/*     */             break label181;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(2048, _ZNKSs4sizeEv.call(j)), 14720);
/*     */         }
/*     */         
/*     */ 
/*     */         label181:
/*     */         
/* 107 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 113 */       _ZNSsD1Ev.call(j);
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
/* 124 */       MainMemory.dealloc_generated(m);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp14duchampWarningESsSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */