/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt19basic_ostringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamplsERSoRNS_5ParamE_403 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  22 */   public static final Function _instance = new _ZN7duchamplsERSoRNS_5ParamE_403();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public _ZN7duchamplsERSoRNS_5ParamE_403() { super("_ZN7duchamplsERSoRNS_5ParamE_403", 17, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17)
/*     */   {
/*  29 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, paramInt17);
/*  30 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  57 */     paramInt4 += 2;
/*  58 */     paramInt3--;
/*  59 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  60 */     paramInt4 += 2;
/*  61 */     paramInt3--;
/*  62 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  63 */     paramInt4 += 2;
/*  64 */     paramInt3--;
/*  65 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  66 */     paramInt4 += 2;
/*  67 */     paramInt3--;
/*  68 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  69 */     paramInt4 += 2;
/*  70 */     paramInt3--;
/*  71 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  72 */     paramInt4 += 2;
/*  73 */     paramInt3--;
/*  74 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  75 */     paramInt4 += 2;
/*  76 */     paramInt3--;
/*  77 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  78 */     paramInt4 += 2;
/*  79 */     paramInt3--;
/*  80 */     int i11 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  81 */     paramInt4 += 2;
/*  82 */     paramInt3--;
/*  83 */     int i12 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  84 */     paramInt4 += 2;
/*  85 */     paramInt3--;
/*  86 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
/*  87 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17)
/*     */   {
/*     */     try
/*     */     {
/*  97 */       Jump.label(16857);
/*  98 */       if (MainMemory.getI8(paramInt1 + 444) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 103 */         _ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(paramInt16, 16);
/* 104 */         _Z9stringizeb.call(paramInt13, MainMemory.getI8(paramInt17));
/* 105 */         _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(paramInt16, paramInt13);
/* 106 */         _ZNSsD1Ev.call(paramInt13);
/* 107 */         _ZNKSt19basic_ostringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt2, paramInt16);
/* 108 */         _ZNSaIcEC1Ev.call(paramInt12);
/* 109 */         _ZNSsC1EPKcRKSaIcE.call(paramInt15, 71680, paramInt12);
/* 110 */         _ZNSaIcEC1Ev.call(paramInt14);
/* 111 */         _ZNSsC1EPKcRKSaIcE.call(paramInt6, 52992, paramInt14);
/* 112 */         _ZN7duchamp16recordParametersERSoSsSsSs.call(paramInt5, paramInt6, paramInt15, paramInt2);
/* 113 */         _ZNSsD1Ev.call(paramInt6);
/* 114 */         _ZNSaIcED1Ev.call(paramInt14);
/* 115 */         _ZNSsD1Ev.call(paramInt15);
/* 116 */         _ZNSaIcED1Ev.call(paramInt12);
/* 117 */         _ZNSsD1Ev.call(paramInt2);
/* 118 */         _ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEED1Ev.call(paramInt16);
/* 119 */         _ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(paramInt7, 16);
/* 120 */         _ZNSsC1ERKSs.call(paramInt3, paramInt1 + 64);
/* 121 */         _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(paramInt7, paramInt3);
/* 122 */         _ZNSsD1Ev.call(paramInt3);
/* 123 */         _ZNKSt19basic_ostringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt8, paramInt7);
/* 124 */         _ZNSaIcEC1Ev.call(paramInt10);
/* 125 */         _ZNSsC1EPKcRKSaIcE.call(paramInt4, 83360, paramInt10);
/* 126 */         _ZNSaIcEC1Ev.call(paramInt9);
/* 127 */         _ZNSsC1EPKcRKSaIcE.call(paramInt11, 50240, paramInt9);
/* 128 */         _ZN7duchamp16recordParametersERSoSsSsSs.call(paramInt5, paramInt11, paramInt4, paramInt8);
/* 129 */         _ZNSsD1Ev.call(paramInt11);
/* 130 */         _ZNSaIcED1Ev.call(paramInt9);
/* 131 */         _ZNSsD1Ev.call(paramInt4);
/* 132 */         _ZNSaIcED1Ev.call(paramInt10);
/* 133 */         _ZNSsD1Ev.call(paramInt8);
/* 134 */         _ZNSt19basic_ostringstreamIcSt11char_traitsIcESaIcEED1Ev.call(paramInt7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       Jump.label(8000000);
/* 142 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamplsERSoRNS_5ParamE_403.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */