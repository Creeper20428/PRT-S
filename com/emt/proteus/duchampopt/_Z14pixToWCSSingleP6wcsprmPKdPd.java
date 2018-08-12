/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
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
/*     */ public final class _Z14pixToWCSSingleP6wcsprmPKdPd extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2720;
/*  23 */   public static final Function _instance = new _Z14pixToWCSSingleP6wcsprmPKdPd();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _Z14pixToWCSSingleP6wcsprmPKdPd() { super("_Z14pixToWCSSingleP6wcsprmPKdPd", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  30 */     call(paramInt1, paramInt2, paramInt3);
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, k);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     double d = 0.0D;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     int i10 = 0;
/*  68 */     int i11 = 0;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*  72 */     int i15 = 0;
/*  73 */     int i16 = 0;
/*     */     
/*     */ 
/*  76 */     int i17 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  80 */       i = MainMemory.alloc(1);
/*  81 */       j = MainMemory.alloc(4);
/*  82 */       k = MainMemory.alloc(4);
/*  83 */       m = MainMemory.alloc(188);
/*  84 */       n = MainMemory.getI32(paramInt1 + 4);
/*  85 */       i1 = MainMemory.getI32(paramInt1 + 752);
/*  86 */       i1 = i1 < 0 ? 2 : i1;
/*  87 */       i1 = i1 < n ? i1 : n + -1;
/*  88 */       i2 = n << 3;
/*  89 */       i3 = SystemLibrary.newarray(i2);
/*  90 */       i4 = i3;
/*  91 */       if (n > 0) {
/*  92 */         i5 = 0;
/*     */       } else {
/*     */         break label219;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 103 */         MainMemory.setF64(i3 + (i5 << 3), 1.0D);
/* 104 */         i5 += 1;
/* 105 */         if (i5 == n) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label219:
/*     */       
/*     */ 
/*     */ 
/* 116 */       i6 = paramInt1 + 744;
/* 117 */       i11 = i4 + (MainMemory.getI32(i6) << 3);
/* 118 */       d = MainMemory.getF64(i11) + MainMemory.getF64(paramInt2);
/* 119 */       MainMemory.setF64(i11, d);
/* 120 */       i7 = paramInt1 + 748;
/* 121 */       i11 = i4 + (MainMemory.getI32(i7) << 3);
/* 122 */       d = MainMemory.getF64(i11) + MainMemory.getF64(paramInt2 + 8);
/* 123 */       MainMemory.setF64(i11, d);
/* 124 */       i11 = i4 + (i1 << 3);
/* 125 */       d = MainMemory.getF64(i11) + MainMemory.getF64(paramInt2 + 16);
/* 126 */       MainMemory.setF64(i11, d);
/* 127 */       i8 = SystemLibrary.newarray(4);
/* 128 */       i9 = i8;
/* 129 */       i10 = SystemLibrary.newarray(i2);
/* 130 */       i11 = i10;
/* 131 */       i12 = SystemLibrary.newarray(i2);
/* 132 */       paramInt2 = i12;
/* 133 */       i13 = SystemLibrary.newarray(8);
/* 134 */       i14 = i13;
/* 135 */       i15 = SystemLibrary.newarray(8);
/* 136 */       n = wcsp2s.call(paramInt1, 1, n, i4, i11, i14, i15, paramInt2, i9);
/* 137 */       if (n <= 0) {
/*     */         break label534;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(m, 24);
/* 148 */       i2 = MainMemory.getI32(i9);
/* 149 */       i16 = MainMemory.getI32(125536 + (n << 2));
/* 150 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m + 8, 59328), n), 14720), i16), 56288), i2), 79);
/* 151 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, m);
/* 152 */       _ZNSaIcEC1Ev.call(i);
/* 153 */       _ZNSsC1EPKcRKSaIcE.call(j, 54880, i);
/* 154 */       _ZN7duchamp12duchampErrorESsSs.call(j, k);
/* 155 */       _ZNSsD1Ev.call(j);
/* 156 */       _ZNSaIcED1Ev.call(i);
/* 157 */       _ZNSsD1Ev.call(k);
/* 158 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(m);
/*     */       
/*     */ 
/*     */       label534:
/*     */       
/*     */ 
/* 164 */       MainMemory.setF64(paramInt3, MainMemory.getF64(paramInt2 + (MainMemory.getI32(i6) << 3)));
/* 165 */       MainMemory.setF64(paramInt3 + 8, MainMemory.getF64(paramInt2 + (MainMemory.getI32(i7) << 3)));
/* 166 */       MainMemory.setF64(paramInt3 + 16, MainMemory.getF64(paramInt2 + (i1 << 3)));
/* 167 */       if (i8 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         SystemLibrary.deletearray(i8);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 183 */       if (i10 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */         SystemLibrary.deletearray(i10);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 199 */       if (i12 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */         SystemLibrary.deletearray(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 215 */       if (i13 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         SystemLibrary.deletearray(i13);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 231 */       if (i15 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */         SystemLibrary.deletearray(i15);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 247 */       if (i3 != 0) {
/*     */         break label738;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label748;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label738:
/*     */       
/*     */ 
/*     */ 
/* 263 */       SystemLibrary.deletearray(i3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label748:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */       MainMemory.dealloc_generated(i17);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z14pixToWCSSingleP6wcsprmPKdPd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */