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
/*     */ public final class _Z13pixToWCSMultiP6wcsprmPKdPdi extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2767;
/*  23 */   public static final Function _instance = new _Z13pixToWCSMultiP6wcsprmPKdPdi();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _Z13pixToWCSMultiP6wcsprmPKdPdi() { super("_Z13pixToWCSMultiP6wcsprmPKdPdi", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  47 */     int n = call(i, j, k, m);
/*  48 */     paramFrame.setI32(paramInt1, n);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  54 */     int i = 0;
/*     */     
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     int n = 0;
/*  60 */     int i1 = 0;
/*  61 */     int i2 = 0;
/*  62 */     int i3 = 0;
/*  63 */     int i4 = 0;
/*  64 */     int i5 = 0;
/*  65 */     int i6 = 0;
/*  66 */     boolean bool = false;
/*  67 */     int i7 = 0;
/*  68 */     int i8 = 0;
/*  69 */     double d = 0.0D;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*  75 */     int i14 = 0;
/*  76 */     int i15 = 0;
/*  77 */     int i16 = 0;
/*  78 */     int i17 = 0;
/*  79 */     int i18 = 0;
/*  80 */     int i19 = 0;
/*  81 */     int i20 = 0;
/*  82 */     int i21 = 0;
/*  83 */     int i22 = 0;
/*  84 */     int i23 = 0;
/*  85 */     int i24 = 0;
/*  86 */     int i25 = 0;
/*     */     
/*     */ 
/*  89 */     int i26 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  93 */       j = MainMemory.alloc(1);
/*  94 */       k = MainMemory.alloc(4);
/*  95 */       m = MainMemory.alloc(4);
/*  96 */       n = MainMemory.alloc(188);
/*  97 */       i1 = MainMemory.getI32(paramInt1 + 4);
/*  98 */       i2 = MainMemory.getI32(paramInt1 + 752);
/*  99 */       i2 = i2 < 0 ? 2 : i2;
/* 100 */       i2 = i2 < i1 ? i2 : i1 + -1;
/* 101 */       i3 = paramInt4 << 3;
/* 102 */       i4 = i3 * i1;
/* 103 */       i5 = SystemLibrary.newarray(i4);
/* 104 */       i6 = i5;
/* 105 */       bool = paramInt4 > 0;
/* 106 */       if (!bool) {
/*     */         break label523;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       i9 = i1 > 0 ? 1 : 0;
/* 117 */       i10 = paramInt1 + 744;
/* 118 */       i11 = paramInt1 + 748;
/* 119 */       i12 = i1 << 3;
/* 120 */       i13 = i2 << 3;
/* 121 */       i14 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 128 */         i7 = i14 * 3;
/* 129 */         i15 = paramInt2 + (i7 + 2 << 3);
/* 130 */         i16 = i5 + (i13 + i12 * i14);
/* 131 */         i17 = paramInt2 + (i7 + 1 << 3);
/* 132 */         i18 = i1 * i14;
/* 133 */         i19 = paramInt2 + (i7 << 3);
/* 134 */         i7 = i14 * i1;
/* 135 */         if (i9 != 0) {
/* 136 */           i7 = 0;
/*     */         } else {
/*     */           break label400;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           MainMemory.setF64(i6 + (i18 + i7 << 3), 1.0D);
/* 149 */           i7 += 1;
/* 150 */           if (i7 == i1) {
/* 151 */             i7 = i18; break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label400:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 163 */         i8 = MainMemory.getI32(i10);
/* 164 */         d = MainMemory.getF64(i6 + (i8 + i18 << 3)) + MainMemory.getF64(i19);
/* 165 */         MainMemory.setF64(i6 + (i8 + i7 << 3), d);
/* 166 */         i19 = i6 + (MainMemory.getI32(i11) + i18 << 3);
/* 167 */         d = MainMemory.getF64(i19) + MainMemory.getF64(i17);
/* 168 */         MainMemory.setF64(i19, d);
/* 169 */         d = MainMemory.getF64(i16) + MainMemory.getF64(i15);
/* 170 */         MainMemory.setF64(i16, d);
/* 171 */         i14 += 1;
/* 172 */         if (i14 == paramInt4) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label523:
/*     */       
/*     */ 
/*     */ 
/* 183 */       i20 = SystemLibrary.newarray(paramInt4 << 2);
/* 184 */       i10 = i20;
/* 185 */       i21 = SystemLibrary.newarray(i4);
/* 186 */       paramInt2 = i21;
/* 187 */       i22 = SystemLibrary.newarray(i4);
/* 188 */       i16 = i22;
/* 189 */       i23 = SystemLibrary.newarray(i3);
/* 190 */       i15 = i23;
/* 191 */       i24 = SystemLibrary.newarray(i3);
/* 192 */       i3 = wcsp2s.call(paramInt1, paramInt4, i1, i6, paramInt2, i15, i24, i16, i10);
/* 193 */       if (i3 <= 0) {
/*     */         break label736;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(n, 24);
/* 204 */       paramInt4 = MainMemory.getI32(i10);
/* 205 */       i25 = MainMemory.getI32(125536 + (i3 << 2));
/* 206 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(n + 8, 59328), i3), 14720), i25), 56288), paramInt4), 79);
/* 207 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(m, n);
/* 208 */       _ZNSaIcEC1Ev.call(j);
/* 209 */       _ZNSsC1EPKcRKSaIcE.call(k, 53408, j);
/* 210 */       _ZN7duchamp12duchampErrorESsSs.call(k, m);
/* 211 */       _ZNSsD1Ev.call(k);
/* 212 */       _ZNSaIcED1Ev.call(j);
/* 213 */       _ZNSsD1Ev.call(m);
/* 214 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(n);
/*     */       
/*     */       break label757;
/*     */       
/*     */       label736:
/* 219 */       _Z13pixToWCSMultiP6wcsprmPKdPdi_175.call(paramInt1, paramInt4, i16, i1, i2, paramInt3, i22, bool);
/*     */       
/*     */ 
/*     */       label757:
/*     */       
/*     */ 
/* 225 */       if (i20 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */         SystemLibrary.deletearray(i20);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 241 */       if (i21 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */         SystemLibrary.deletearray(i21);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 257 */       if (i22 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */         SystemLibrary.deletearray(i22);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 273 */       if (i23 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */         SystemLibrary.deletearray(i23);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 289 */       if (i24 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */         SystemLibrary.deletearray(i24);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 305 */       if (i5 != 0) {
/*     */         break label914;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */       i = i3;
/*     */       
/*     */ 
/*     */       break label928;
/*     */       
/*     */       label914:
/*     */       
/* 322 */       SystemLibrary.deletearray(i5);
/* 323 */       i = i3;
/*     */       
/*     */ 
/*     */       label928:
/*     */       
/*     */ 
/* 329 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 334 */       MainMemory.dealloc_generated(i26);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z13pixToWCSMultiP6wcsprmPKdPdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */