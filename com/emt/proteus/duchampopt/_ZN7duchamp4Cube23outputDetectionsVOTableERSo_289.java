/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube23outputDetectionsVOTableERSo_289
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  22 */   public static final Function _instance = new _ZN7duchamp4Cube23outputDetectionsVOTableERSo_289();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public _ZN7duchamp4Cube23outputDetectionsVOTableERSo_289() { super("_ZN7duchamp4Cube23outputDetectionsVOTableERSo_289", 42, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27, int paramInt28, int paramInt29, int paramInt30, int paramInt31, int paramInt32, int paramInt33, int paramInt34, int paramInt35, int paramInt36, int paramInt37, int paramInt38, int paramInt39, int paramInt40, int paramInt41, int paramInt42)
/*     */   {
/*  29 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, paramInt17, paramInt18, paramInt19, paramInt20, paramInt21, paramInt22, paramInt23, paramInt24, paramInt25, paramInt26, paramInt27, paramInt28, paramInt29, paramInt30, paramInt31, paramInt32, paramInt33, paramInt34, paramInt35, paramInt36, paramInt37, paramInt38, paramInt39, paramInt40, paramInt41, paramInt42);
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
/*  86 */     int i13 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  87 */     paramInt4 += 2;
/*  88 */     paramInt3--;
/*  89 */     int i14 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  90 */     paramInt4 += 2;
/*  91 */     paramInt3--;
/*  92 */     int i15 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  93 */     paramInt4 += 2;
/*  94 */     paramInt3--;
/*  95 */     int i16 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  96 */     paramInt4 += 2;
/*  97 */     paramInt3--;
/*  98 */     int i17 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  99 */     paramInt4 += 2;
/* 100 */     paramInt3--;
/* 101 */     int i18 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 102 */     paramInt4 += 2;
/* 103 */     paramInt3--;
/* 104 */     int i19 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 105 */     paramInt4 += 2;
/* 106 */     paramInt3--;
/* 107 */     int i20 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 108 */     paramInt4 += 2;
/* 109 */     paramInt3--;
/* 110 */     int i21 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 111 */     paramInt4 += 2;
/* 112 */     paramInt3--;
/* 113 */     int i22 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 114 */     paramInt4 += 2;
/* 115 */     paramInt3--;
/* 116 */     int i23 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 117 */     paramInt4 += 2;
/* 118 */     paramInt3--;
/* 119 */     int i24 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 120 */     paramInt4 += 2;
/* 121 */     paramInt3--;
/* 122 */     int i25 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 123 */     paramInt4 += 2;
/* 124 */     paramInt3--;
/* 125 */     int i26 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 126 */     paramInt4 += 2;
/* 127 */     paramInt3--;
/* 128 */     int i27 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 129 */     paramInt4 += 2;
/* 130 */     paramInt3--;
/* 131 */     int i28 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 132 */     paramInt4 += 2;
/* 133 */     paramInt3--;
/* 134 */     int i29 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 135 */     paramInt4 += 2;
/* 136 */     paramInt3--;
/* 137 */     int i30 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 138 */     paramInt4 += 2;
/* 139 */     paramInt3--;
/* 140 */     int i31 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 141 */     paramInt4 += 2;
/* 142 */     paramInt3--;
/* 143 */     int i32 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 144 */     paramInt4 += 2;
/* 145 */     paramInt3--;
/* 146 */     int i33 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 147 */     paramInt4 += 2;
/* 148 */     paramInt3--;
/* 149 */     int i34 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 150 */     paramInt4 += 2;
/* 151 */     paramInt3--;
/* 152 */     int i35 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 153 */     paramInt4 += 2;
/* 154 */     paramInt3--;
/* 155 */     int i36 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 156 */     paramInt4 += 2;
/* 157 */     paramInt3--;
/* 158 */     int i37 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 159 */     paramInt4 += 2;
/* 160 */     paramInt3--;
/* 161 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37);
/* 162 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27, int paramInt28, int paramInt29, int paramInt30, int paramInt31, int paramInt32, int paramInt33, int paramInt34, int paramInt35, int paramInt36, int paramInt37, int paramInt38, int paramInt39, int paramInt40, int paramInt41, int paramInt42)
/*     */   {
/* 168 */     int i = 0;
/* 169 */     int j = 0;
/* 170 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/* 175 */       Jump.label(178247);
/* 176 */       _ZNSsC1ERKSs.call(paramInt24, paramInt42);
/* 177 */       i = _ZNKSs7compareEPKc.call(paramInt24, 37664);
/* 178 */       _ZNSsD1Ev.call(paramInt24);
/* 179 */       if (i == 0)
/*     */       {
/* 181 */         _ZNSaIcEC1Ev.call(paramInt11);
/* 182 */         _ZNSsC1EPKcRKSaIcE.call(paramInt27, 144576, paramInt11);
/* 183 */         _ZNSaIcED1Ev.call(paramInt11);
/* 184 */         _ZNSaIcEC1Ev.call(paramInt19);
/* 185 */         _ZNSsC1EPKcRKSaIcE.call(paramInt40, 12960, paramInt19);
/* 186 */         i = _ZNKSs4sizeEv.call(paramInt27);
/* 187 */         _ZNSsC1ERKSs.call(paramInt2, paramInt27);
/* 188 */         _ZNSaIcEC1Ev.call(paramInt28);
/* 189 */         _ZNSsC1EPKcRKSaIcE.call(paramInt26, 18976, paramInt28);
/* 190 */         _ZNSaIcEC1Ev.call(paramInt21);
/* 191 */         _ZNSsC1EPKcRKSaIcE.call(paramInt36, 46592, paramInt21);
/* 192 */         _ZNSaIcEC1Ev.call(paramInt41);
/* 193 */         _ZNSsC1EPKcRKSaIcE.call(paramInt35, 54400, paramInt41);
/* 194 */         _ZN7duchamp7VOParam6defineISsEEvSsSsSsT_iSs.call(paramInt31, paramInt35, paramInt36, paramInt26, paramInt2, i, paramInt40);
/* 195 */         _ZNSsD1Ev.call(paramInt35);
/* 196 */         _ZNSaIcED1Ev.call(paramInt41);
/* 197 */         _ZNSsD1Ev.call(paramInt36);
/* 198 */         _ZNSaIcED1Ev.call(paramInt21);
/* 199 */         _ZNSsD1Ev.call(paramInt26);
/* 200 */         _ZNSaIcED1Ev.call(paramInt28);
/* 201 */         _ZNSsD1Ev.call(paramInt2);
/* 202 */         _ZNSsD1Ev.call(paramInt40);
/* 203 */         _ZNSaIcED1Ev.call(paramInt19);
/* 204 */         j = MainMemory.getI32(paramInt13);
/* 205 */         if (j == MainMemory.getI32(paramInt8))
/*     */         {
/* 207 */           _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt10, j, paramInt31);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 214 */           if (j != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 219 */             _ZN7duchamp7VOParamC2ERKS0_.call(j, paramInt31);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */           Jump.label(178348);
/* 227 */           MainMemory.setI32(paramInt13, j + 24);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         Jump.label(178357);
/* 237 */         _ZNSaIcEC1Ev.call(paramInt37);
/* 238 */         _ZNSsC1EPKcRKSaIcE.call(paramInt14, 12960, paramInt37);
/* 239 */         f = MainMemory.getF32(paramInt6 + 464);
/* 240 */         _ZNSaIcEC1Ev.call(paramInt7);
/* 241 */         _ZNSsC1EPKcRKSaIcE.call(paramInt16, 15904, paramInt7);
/* 242 */         _ZNSaIcEC1Ev.call(paramInt30);
/* 243 */         _ZNSsC1EPKcRKSaIcE.call(paramInt33, 54368, paramInt30);
/* 244 */         _ZNSaIcEC1Ev.call(paramInt23);
/* 245 */         _ZNSsC1EPKcRKSaIcE.call(paramInt25, 77920, paramInt23);
/* 246 */         _ZN7duchamp7VOParam6defineIfEEvSsSsSsT_iSs.call(paramInt31, paramInt25, paramInt33, paramInt16, f, paramInt14);
/* 247 */         _ZNSsD1Ev.call(paramInt25);
/* 248 */         _ZNSaIcED1Ev.call(paramInt23);
/* 249 */         _ZNSsD1Ev.call(paramInt33);
/* 250 */         _ZNSaIcED1Ev.call(paramInt30);
/* 251 */         _ZNSsD1Ev.call(paramInt16);
/* 252 */         _ZNSaIcED1Ev.call(paramInt7);
/* 253 */         _ZNSsD1Ev.call(paramInt14);
/* 254 */         _ZNSaIcED1Ev.call(paramInt37);
/* 255 */         j = MainMemory.getI32(paramInt13);
/* 256 */         if (j == MainMemory.getI32(paramInt8))
/*     */         {
/* 258 */           _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt10, j, paramInt31);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 265 */           if (j != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 270 */             _ZN7duchamp7VOParamC2ERKS0_.call(j, paramInt31);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */           Jump.label(178426);
/* 278 */           MainMemory.setI32(paramInt13, j + 24);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */         Jump.label(178435);
/* 288 */         _ZNSaIcEC1Ev.call(paramInt4);
/* 289 */         _ZNSsC1EPKcRKSaIcE.call(paramInt17, 12960, paramInt4);
/* 290 */         f = MainMemory.getF32(paramInt6 + 468);
/* 291 */         _ZNSaIcEC1Ev.call(paramInt15);
/* 292 */         _ZNSsC1EPKcRKSaIcE.call(paramInt29, 15904, paramInt15);
/* 293 */         _ZNSaIcEC1Ev.call(paramInt39);
/* 294 */         _ZNSsC1EPKcRKSaIcE.call(paramInt5, 54368, paramInt39);
/* 295 */         _ZNSaIcEC1Ev.call(paramInt38);
/* 296 */         _ZNSsC1EPKcRKSaIcE.call(paramInt34, 77952, paramInt38);
/* 297 */         _ZN7duchamp7VOParam6defineIfEEvSsSsSsT_iSs.call(paramInt31, paramInt34, paramInt5, paramInt29, f, paramInt17);
/* 298 */         _ZNSsD1Ev.call(paramInt34);
/* 299 */         _ZNSaIcED1Ev.call(paramInt38);
/* 300 */         _ZNSsD1Ev.call(paramInt5);
/* 301 */         _ZNSaIcED1Ev.call(paramInt39);
/* 302 */         _ZNSsD1Ev.call(paramInt29);
/* 303 */         _ZNSaIcED1Ev.call(paramInt15);
/* 304 */         _ZNSsD1Ev.call(paramInt17);
/* 305 */         _ZNSaIcED1Ev.call(paramInt4);
/* 306 */         j = MainMemory.getI32(paramInt13);
/* 307 */         if (j == MainMemory.getI32(paramInt8))
/*     */         {
/* 309 */           _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt10, j, paramInt31);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 316 */           if (j != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 321 */             _ZN7duchamp7VOParamC2ERKS0_.call(j, paramInt31);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */           Jump.label(178504);
/* 329 */           MainMemory.setI32(paramInt13, j + 24);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */         Jump.label(178513);
/* 339 */         _ZNSaIcEC1Ev.call(paramInt32);
/* 340 */         _ZNSsC1EPKcRKSaIcE.call(paramInt20, 12960, paramInt32);
/* 341 */         f = MainMemory.getF32(paramInt6 + 472);
/* 342 */         _ZNSaIcEC1Ev.call(paramInt1);
/* 343 */         _ZNSsC1EPKcRKSaIcE.call(paramInt18, 15904, paramInt1);
/* 344 */         _ZNSaIcEC1Ev.call(paramInt22);
/* 345 */         _ZNSsC1EPKcRKSaIcE.call(paramInt12, 54368, paramInt22);
/* 346 */         _ZNSaIcEC1Ev.call(paramInt9);
/* 347 */         _ZNSsC1EPKcRKSaIcE.call(paramInt3, 76288, paramInt9);
/* 348 */         _ZN7duchamp7VOParam6defineIfEEvSsSsSsT_iSs.call(paramInt31, paramInt3, paramInt12, paramInt18, f, paramInt20);
/* 349 */         _ZNSsD1Ev.call(paramInt3);
/* 350 */         _ZNSaIcED1Ev.call(paramInt9);
/* 351 */         _ZNSsD1Ev.call(paramInt12);
/* 352 */         _ZNSaIcED1Ev.call(paramInt22);
/* 353 */         _ZNSsD1Ev.call(paramInt18);
/* 354 */         _ZNSaIcED1Ev.call(paramInt1);
/* 355 */         _ZNSsD1Ev.call(paramInt20);
/* 356 */         _ZNSaIcED1Ev.call(paramInt32);
/* 357 */         j = MainMemory.getI32(paramInt13);
/* 358 */         if (j == MainMemory.getI32(paramInt8))
/*     */         {
/* 360 */           _ZNSt6vectorIN7duchamp7VOParamESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt10, j, paramInt31);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 367 */           if (j != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 372 */             _ZN7duchamp7VOParamC2ERKS0_.call(j, paramInt31);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */           Jump.label(178582);
/* 380 */           MainMemory.setI32(paramInt13, j + 24);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 389 */         Jump.label(178591);
/* 390 */         _ZNSsD1Ev.call(paramInt27);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube23outputDetectionsVOTableERSo_289.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */