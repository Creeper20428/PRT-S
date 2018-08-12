/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube11getMetadataESs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1704;
/*  35 */   public static final Function _instance = new _ZN7duchamp4Cube11getMetadataESs();
/*  36 */   public final Function resolve() { return _instance; }
/*     */   
/*  38 */   public _ZN7duchamp4Cube11getMetadataESs() { super("_ZN7duchamp4Cube11getMetadataESs", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  42 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  47 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int k = call(i, j);
/*  54 */     paramFrame.setI32(paramInt1, k);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  60 */     int i = 0;
/*     */     
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     int n = 0;
/*  66 */     int i1 = 0;
/*  67 */     int i2 = 0;
/*  68 */     int i3 = 0;
/*  69 */     int i4 = 0;
/*  70 */     int i5 = 0;
/*  71 */     int i6 = 0;
/*  72 */     int i7 = 0;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     int i12 = 0;
/*  78 */     int i13 = 0;
/*  79 */     int i14 = 0;
/*  80 */     int i15 = 0;
/*  81 */     int i16 = 0;
/*  82 */     int i17 = 0;
/*  83 */     int i18 = 0;
/*  84 */     int i19 = 0;
/*  85 */     int i20 = 0;
/*  86 */     int i21 = 0;
/*  87 */     int i22 = 0;
/*  88 */     int i23 = 0;
/*  89 */     int i24 = 0;
/*  90 */     int i25 = 0;
/*     */     
/*     */ 
/*  93 */     int i26 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  97 */       j = MainMemory.alloc(1);
/*  98 */       k = MainMemory.alloc(4);
/*  99 */       m = MainMemory.alloc(1);
/* 100 */       n = MainMemory.alloc(4);
/* 101 */       i1 = MainMemory.alloc(4);
/* 102 */       i2 = MainMemory.alloc(4);
/* 103 */       i3 = MainMemory.alloc(1);
/* 104 */       i4 = MainMemory.alloc(4);
/* 105 */       i5 = MainMemory.alloc(1);
/* 106 */       i6 = MainMemory.alloc(4);
/* 107 */       i7 = MainMemory.alloc(1);
/* 108 */       i8 = MainMemory.alloc(4);
/* 109 */       i9 = MainMemory.alloc(1);
/* 110 */       i10 = MainMemory.alloc(4);
/* 111 */       i11 = MainMemory.alloc(1);
/* 112 */       i12 = MainMemory.alloc(4);
/* 113 */       i13 = MainMemory.alloc(4);
/* 114 */       i20 = MainMemory.alloc(4);
/* 115 */       i14 = MainMemory.alloc(4);
/* 116 */       i15 = MainMemory.alloc(4);
/* 117 */       i16 = MainMemory.alloc(4);
/* 118 */       i17 = MainMemory.alloc(188);
/* 119 */       MainMemory.setI32(i14, 0);
/* 120 */       ffexist.call(_ZNKSs5c_strEv.call(paramInt2), i16, i14);
/* 121 */       if (MainMemory.getI32(i16) >= 1) {
/*     */         break label366;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i14));
/* 132 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i17, 24);
/* 133 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i17 + 8, 58880), paramInt2), 60128);
/* 134 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i13, i17);
/* 135 */       _ZNSaIcEC1Ev.call(i11);
/* 136 */       _ZNSsC1EPKcRKSaIcE.call(i12, 50176, i11);
/* 137 */       _ZN7duchamp12duchampErrorESsSs.call(i12, i13);
/* 138 */       _ZNSsD1Ev.call(i12);
/* 139 */       _ZNSaIcED1Ev.call(i11);
/* 140 */       _ZNSsD1Ev.call(i13);
/* 141 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i17);
/* 142 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1265;
/*     */       
/*     */       label366:
/*     */       
/* 149 */       MainMemory.setI32(i14, 0);
/* 150 */       if (ffopentest.call(i15, _ZNKSs5c_strEv.call(paramInt2), i14) != 0) {
/*     */         break label1108;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */       MainMemory.setI32(i14, 0);
/* 161 */       if (ffgidm.call(MainMemory.getI32(i15), i20, i14) != 0) {
/*     */         break label1082;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       i18 = MainMemory.getI32(i20);
/* 172 */       i19 = SystemLibrary.newarray(i18 << 2);
/* 173 */       i20 = i19;
/* 174 */       if (i18 > 0) {
/* 175 */         i21 = 0;
/*     */       } else {
/*     */         break label508;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 186 */         MainMemory.setI32(i19 + (i21 << 2), 1);
/* 187 */         i21 += 1;
/* 188 */       } while (i21 < i18);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label508:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 199 */       MainMemory.setI32(i14, 0);
/* 200 */       if (ffgisz.call(MainMemory.getI32(i15), i18, i20, i14) != 0) {
/*     */         break label1056;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */       MainMemory.setI32(i14, 0);
/* 211 */       ffclos.call(MainMemory.getI32(i15), i14);
/* 212 */       if (MainMemory.getI32(i14) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */         _ZNSaIcEC1Ev.call(i5);
/* 223 */         _ZNSsC1EPKcRKSaIcE.call(i6, 63136, i5);
/* 224 */         _ZNSaIcEC1Ev.call(i3);
/* 225 */         _ZNSsC1EPKcRKSaIcE.call(i4, 50176, i3);
/* 226 */         _ZN7duchamp14duchampWarningESsSs.call(i4, i6);
/* 227 */         _ZNSsD1Ev.call(i4);
/* 228 */         _ZNSaIcED1Ev.call(i3);
/* 229 */         _ZNSsD1Ev.call(i6);
/* 230 */         _ZNSaIcED1Ev.call(i5);
/* 231 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i14));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 237 */       if (MainMemory.getI8(paramInt1 + 590) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 69536);
/* 248 */         _ZNSolsEl.call(1808, MainMemory.getI32(i20));
/* 249 */         if (i18 > 1) {
/* 250 */           i21 = 0;
/*     */         } else {
/*     */           break label775;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 261 */           i22 = MainMemory.getI32(i19 + ((i21 << 2) + 4));
/* 262 */           _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13120), i22);
/* 263 */           i22 = i21 + 1;
/* 264 */           if (i21 + 2 >= i18) break;
/* 265 */           i21 = i22;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label775:
/*     */         
/*     */ 
/*     */ 
/* 275 */         _ZNSolsEPFRSoS_E.call(1808, 79);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 281 */       i23 = paramInt1 + 32;
/* 282 */       _ZNSsC1ERKSs.call(i2, paramInt2);
/* 283 */       i24 = paramInt1 + 648;
/* 284 */       i25 = _ZN7duchamp10FitsHeader9defineWCSESsRNS_5ParamE.call(i24, i2, i23) == 1 ? 1 : 0;
/* 285 */       _ZNSsD1Ev.call(i2);
/* 286 */       if (i25 != 0) {
/* 287 */         i18 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 297 */         _ZNSsC1ERKSs.call(i1, paramInt2);
/* 298 */         i25 = _ZN7duchamp10FitsHeader14readHeaderInfoESsRNS_5ParamE.call(i24, i1, i23) == 1 ? 1 : 0;
/* 299 */         _ZNSsD1Ev.call(i1);
/* 300 */         if (i25 != 0) {
/* 301 */           i18 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 311 */           if (MainMemory.getI8(paramInt1 + 660) != 0) {
/*     */             break label981;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */           _ZNSaIcEC1Ev.call(m);
/* 322 */           _ZNSsC1EPKcRKSaIcE.call(n, 83424, m);
/* 323 */           _ZNSaIcEC1Ev.call(j);
/* 324 */           _ZNSsC1EPKcRKSaIcE.call(k, 50176, j);
/* 325 */           _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 326 */           _ZNSsD1Ev.call(k);
/* 327 */           _ZNSaIcED1Ev.call(j);
/* 328 */           _ZNSsD1Ev.call(n);
/* 329 */           _ZNSaIcED1Ev.call(m);
/*     */           
/*     */ 
/*     */           label981:
/*     */           
/*     */ 
/* 335 */           if (_ZN7duchamp4Cube14initialiseCubeEPlb.call(paramInt1, i20, (byte)0) == 1) {
/* 336 */             i18 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 346 */           else if (i19 == 0) {
/* 347 */             i18 = 0;
/*     */           } else {
/*     */             break label1039;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */       i = i18;
/*     */       
/*     */ 
/*     */       break label1265;
/*     */       
/*     */       label1039:
/*     */       
/* 365 */       SystemLibrary.deletearray(i19);
/* 366 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1265;
/*     */       
/*     */       label1056:
/*     */       
/* 373 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i14));
/* 374 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1265;
/*     */       
/*     */       label1082:
/*     */       
/* 381 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i14));
/* 382 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1265;
/*     */       
/*     */       label1108:
/*     */       
/* 389 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i14));
/* 390 */       switch (MainMemory.getI32(i14))
/*     */       {
/*     */       case 125: 
/*     */         break;
/*     */       case 212: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 402 */       if (MainMemory.getI8(paramInt1 + 40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */         _ZNSaIcEC1Ev.call(i9);
/* 413 */         _ZNSsC1EPKcRKSaIcE.call(i10, 146720, i9);
/* 414 */         _ZNSaIcEC1Ev.call(i7);
/* 415 */         _ZNSsC1EPKcRKSaIcE.call(i8, 50176, i7);
/* 416 */         _ZN7duchamp12duchampErrorESsSs.call(i8, i10);
/* 417 */         _ZNSsD1Ev.call(i8);
/* 418 */         _ZNSaIcED1Ev.call(i7);
/* 419 */         _ZNSsD1Ev.call(i10);
/* 420 */         _ZNSaIcED1Ev.call(i9);
/* 421 */         i = 1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 428 */         i = 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label1265:
/*     */       
/* 434 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 439 */       MainMemory.dealloc_generated(i26);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11getMetadataESs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */