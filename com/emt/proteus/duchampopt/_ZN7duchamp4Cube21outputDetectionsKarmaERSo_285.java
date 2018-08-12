/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube21outputDetectionsKarmaERSo_285 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  16 */   public static final Function _instance = new _ZN7duchamp4Cube21outputDetectionsKarmaERSo_285();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp4Cube21outputDetectionsKarmaERSo_285() { super("_ZN7duchamp4Cube21outputDetectionsKarmaERSo_285", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     call(i, j, k, m, n, i1, i2);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  57 */     int i = 0;
/*  58 */     float f1 = 0.0F;
/*  59 */     float f2 = 0.0F;
/*  60 */     double d1 = 0.0D;
/*  61 */     double d2 = 0.0D;
/*  62 */     float f3 = 0.0F;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  67 */       Jump.label(118963);
/*  68 */       com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs.call(paramInt2, paramInt3);
/*  69 */       i = com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc.call(paramInt2, 36992);
/*  70 */       _ZNSsD1Ev.call(paramInt2);
/*  71 */       if (i == 0)
/*     */       {
/*  73 */         f1 = MainMemory.getF32(paramInt4) / 120.0F;
/*  74 */         f2 = MainMemory.getF32(paramInt6);
/*  75 */         d1 = f2;
/*  76 */         d1 /= 120.0D;
/*  77 */         d2 = f1;
/*  78 */         if (com.emt.proteus.lib.api.MathUtils.f_ogt(d1, d2))
/*     */         {
/*  80 */           f1 = f2 / 120.0F;
/*     */         }
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
/*  92 */         Jump.label(118993);
/*     */         
/*  94 */         f2 = MainMemory.getF32(paramInt7);
/*  95 */         f3 = MainMemory.getF32(paramInt1);
/*  96 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt5, 36800), f3), 13760), f2), 13760), f1), 13408);
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
/* 108 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube21outputDetectionsKarmaERSo_285.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */