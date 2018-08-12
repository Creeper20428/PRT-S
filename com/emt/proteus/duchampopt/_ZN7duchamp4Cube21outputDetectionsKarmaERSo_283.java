/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube21outputDetectionsKarmaERSo_283 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  19 */   public static final Function _instance = new _ZN7duchamp4Cube21outputDetectionsKarmaERSo_283();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public _ZN7duchamp4Cube21outputDetectionsKarmaERSo_283() { super("_ZN7duchamp4Cube21outputDetectionsKarmaERSo_283", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  26 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  27 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i, j, k, m);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  59 */       Jump.label(118640);
/*  60 */       if (MainMemory.getI8(paramInt2 + 453) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  65 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4, 142464), 79);
/*  66 */         i = paramInt2 + 456;
/*  67 */         _ZNSsC1ERKSs.call(paramInt3, i);
/*  68 */         _ZNSolsEPFRSoS_E.call(com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4, 63232), paramInt3), 79);
/*  69 */         _ZNSsD1Ev.call(paramInt3);
/*  70 */         _ZNSsC1ERKSs.call(paramInt1, i);
/*  71 */         j = com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc.call(paramInt1, 43360);
/*  72 */         _ZNSsD1Ev.call(paramInt1);
/*  73 */         if (j == 0)
/*     */         {
/*  75 */           j = MainMemory.getI32(paramInt2 + 460);
/*  76 */           _ZNSolsEPFRSoS_E.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4, 61504), j), 79);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  83 */           k = paramInt2 + 464;
/*  84 */           f = MainMemory.getF32(k);
/*  85 */           _ZNSolsEPFRSoS_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4, 66912), f), 79);
/*  86 */           f = MainMemory.getF32(paramInt2 + 468);
/*  87 */           if (com.emt.proteus.lib.api.MathUtils.f_ogt(f, 0.0D))
/*     */           {
/*  89 */             _ZNSolsEPFRSoS_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4, 66944), f), 79);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  96 */             f = MainMemory.getF32(k);
/*  97 */             _ZNSolsEPFRSoS_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4, 66944), f), 79);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           Jump.label(118750);
/* 105 */           f = MainMemory.getF32(paramInt2 + 472);
/* 106 */           _ZNSolsEPFRSoS_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt4, 66912), f), 79);
/*     */         }
/*     */       }
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
/* 119 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube21outputDetectionsKarmaERSo_283.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */