/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEd;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSspLERKSs;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube21outputDetectionsKarmaERSo extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1538;
/*  26 */   public static final Function _instance = new _ZN7duchamp4Cube21outputDetectionsKarmaERSo();
/*  27 */   public final Function resolve() { return _instance; }
/*     */   
/*  29 */   public _ZN7duchamp4Cube21outputDetectionsKarmaERSo() { super("_ZN7duchamp4Cube21outputDetectionsKarmaERSo", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  33 */     call(paramInt1, paramInt2);
/*  34 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  39 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
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
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*  66 */     int i10 = 0;
/*  67 */     int i11 = 0;
/*  68 */     int i12 = 0;
/*  69 */     int i13 = 0;
/*  70 */     int i14 = 0;
/*  71 */     int i15 = 0;
/*  72 */     int i16 = 0;
/*  73 */     int i17 = 0;
/*  74 */     double d1 = 0.0D;
/*  75 */     double d2 = 0.0D;
/*  76 */     int i18 = 0;
/*  77 */     int i19 = 0;
/*  78 */     int i20 = 0;
/*  79 */     int i21 = 0;
/*  80 */     float f1 = 0.0F;
/*  81 */     float f2 = 0.0F;
/*  82 */     int i22 = 0;
/*  83 */     int i23 = 0;
/*  84 */     int i24 = 0;
/*  85 */     int i25 = 0;
/*  86 */     int i26 = 0;
/*  87 */     int i27 = 0;
/*  88 */     int i28 = 0;
/*  89 */     int i29 = 0;
/*     */     
/*     */ 
/*  92 */     int i30 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  96 */       i = MainMemory.alloc(4);
/*  97 */       j = MainMemory.alloc(4);
/*  98 */       k = MainMemory.alloc(4);
/*  99 */       m = MainMemory.alloc(4);
/* 100 */       i9 = MainMemory.alloc(4);
/* 101 */       n = MainMemory.alloc(4);
/* 102 */       i1 = MainMemory.alloc(4);
/* 103 */       i2 = MainMemory.alloc(12);
/* 104 */       _ZNSsC1ERKSs.call(i1, paramInt1 + 36);
/* 105 */       if (MainMemory.getI8(paramInt1 + 40) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         _ZNSsC1ERKSs.call(n, paramInt1 + 48);
/* 116 */         _ZNSspLERKSs.call(i1, n);
/* 117 */         _ZNSsD1Ev.call(n);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 123 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 70816), 466840), 79);
/* 124 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 69568), i1), 79);
/* 125 */       if (MainMemory.getI8(paramInt1 + 376) != 0) {
/*     */         break label315;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */       f1 = MainMemory.getF32(paramInt1 + 444);
/* 136 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 54144), f1), 79);
/*     */       
/*     */       break label347;
/*     */       
/*     */       label315:
/* 141 */       f1 = MainMemory.getF32(paramInt1 + 380);
/* 142 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 64416), f1), 79);
/*     */       
/*     */ 
/*     */       label347:
/*     */       
/*     */ 
/* 148 */       if (MainMemory.getI8(paramInt1 + 476) != 0) {
/*     */         break label390;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       _ZN7duchamp4Cube21outputDetectionsKarmaERSo_283.call(k, paramInt1, m, paramInt2);
/*     */       
/*     */       break label520;
/*     */       
/*     */       label390:
/* 163 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 143040), 79);
/* 164 */       i23 = MainMemory.getI32(paramInt1 + 480);
/* 165 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 55552), i23), 79);
/* 166 */       f1 = MainMemory.getF32(paramInt1 + 492);
/* 167 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 55584), f1), 79);
/* 168 */       i23 = MainMemory.getI32(paramInt1 + 484);
/* 169 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEj.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 60256), i23), 79);
/* 170 */       _ZNSsC1ERKSs.call(i9, paramInt1 + 500);
/* 171 */       _ZNSolsEPFRSoS_E.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 51776), i9), 79);
/* 172 */       _ZNSsD1Ev.call(i9);
/*     */       
/*     */ 
/*     */       label520:
/*     */       
/*     */ 
/* 178 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 14368);
/* 179 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 46528), 79);
/* 180 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 36736), 79);
/* 181 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 60352), 79);
/* 182 */       _ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St13_Setprecision.call(paramInt2, 6);
/* 183 */       i29 = MainMemory.getI32(MainMemory.getI32(paramInt2) + -12) + paramInt2 + 12;
/* 184 */       MainMemory.setI32(i29, MainMemory.getI32(i29) | 0x4);
/* 185 */       i3 = SystemLibrary.newarray(24);
/* 186 */       i4 = i3;
/* 187 */       i5 = SystemLibrary.newarray(24);
/* 188 */       i6 = i5;
/* 189 */       i7 = paramInt1 + 28;
/* 190 */       i22 = MainMemory.getI32(i7);
/* 191 */       i8 = MainMemory.getI32(i22);
/* 192 */       i9 = paramInt1 + 208;
/* 193 */       i10 = i2 + 4;
/* 194 */       i11 = i3 + 8;
/* 195 */       i12 = i3 + 16;
/* 196 */       i13 = i5 + 8;
/* 197 */       i14 = paramInt1 + 652;
/*     */       
/* 199 */       i23 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 207 */         i24 = i8 + i23 * 276;
/* 208 */         i25 = i8 + i23 * 276 + 160;
/* 209 */         i26 = i8 + i23 * 276 + 164;
/* 210 */         i27 = i8 + i23 * 276 + 172;
/* 211 */         i28 = i8 + i23 * 276 + 168;
/* 212 */         i29 = i8 + i23 * 276 + 140;
/* 213 */         if (!MathUtils.ult(i24, MainMemory.getI32(i22 + 4))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */         _ZNSsC1ERKSs.call(j, i9);
/* 224 */         i16 = _ZNKSs7compareEPKc.call(j, 36960);
/* 225 */         _ZNSsD1Ev.call(j);
/* 226 */         if (i16 != 0) {
/*     */           break label1189;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         _ZN7duchamp9Detection12getVertexSetEv.call(i2, i24);
/* 237 */         i15 = MainMemory.getI32(i2);
/* 238 */         i16 = MainMemory.getI32(i10) - i15 >> 4 & 0x3FFFFFFF;
/* 239 */         i18 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 246 */           i19 = i18 << 2;
/* 247 */           i20 = i19 | 0x3;
/* 248 */           i21 = i19 | 0x2;
/* 249 */           if (!MathUtils.ugt(i16, i18)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */           i17 = i19 | 0x1;
/* 260 */           d1 = MainMemory.getI32(i15 + (i19 << 2));
/* 261 */           d1 += -0.5D;
/* 262 */           MainMemory.setF64(i4, d1);
/* 263 */           d1 = MainMemory.getI32(i15 + (i17 << 2));
/* 264 */           d1 += -0.5D;
/* 265 */           MainMemory.setF64(i11, d1);
/* 266 */           d1 = _ZN7duchamp9Detection10getZcentreEv.call(i24);
/* 267 */           MainMemory.setF64(i12, d1);
/* 268 */           _ZN7duchamp10FitsHeader8pixToWCSEPKdPd.call(MainMemory.getI32(i14), i4, i6);
/* 269 */           d1 = MainMemory.getF64(i13);
/* 270 */           d2 = MainMemory.getF64(i6);
/* 271 */           _ZNSolsEd.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEd.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 24320), d2), 13760), d1);
/* 272 */           d1 = MainMemory.getI32(i15 + (i21 << 2));
/* 273 */           d1 += -0.5D;
/* 274 */           MainMemory.setF64(i4, d1);
/* 275 */           d1 = MainMemory.getI32(i15 + (i20 << 2));
/* 276 */           d1 += -0.5D;
/* 277 */           MainMemory.setF64(i11, d1);
/* 278 */           _ZN7duchamp10FitsHeader8pixToWCSEPKdPd.call(MainMemory.getI32(i14), i4, i6);
/* 279 */           d1 = MainMemory.getF64(i13);
/* 280 */           d2 = MainMemory.getF64(i6);
/* 281 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEd.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEd.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 13760), d2), 13760), d1), 13408);
/* 282 */           i18 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 288 */         _ZN7duchamp4Cube21outputDetectionsKarmaERSo_286.call(i15);
/*     */         
/*     */         break label1209;
/*     */         
/*     */         label1189:
/* 293 */         _ZN7duchamp4Cube21outputDetectionsKarmaERSo_285.call(i25, i, i9, i28, paramInt2, i27, i26);
/*     */         
/*     */ 
/*     */         label1209:
/*     */         
/*     */ 
/* 299 */         i16 = MainMemory.getI32(i29);
/* 300 */         f1 = MainMemory.getF32(i26);
/* 301 */         f2 = MainMemory.getF32(i25);
/* 302 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 24384), f2), 13760), f1), 13760), i16), 14432);
/* 303 */         i23 += 1;
/* 304 */         i22 = MainMemory.getI32(i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */       if (i3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */         SystemLibrary.deletearray(i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 327 */       if (i5 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */         SystemLibrary.deletearray(i5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 343 */       _ZNSsD1Ev.call(i1);
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
/* 354 */       MainMemory.dealloc_generated(i30);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube21outputDetectionsKarmaERSo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */