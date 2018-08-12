/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube14sortDetectionsEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1374;
/*  19 */   public static final Function _instance = new _ZN7duchamp4Cube14sortDetectionsEv();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public _ZN7duchamp4Cube14sortDetectionsEv() { super("_ZN7duchamp4Cube14sortDetectionsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  26 */     call(paramInt);
/*  27 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     call(i);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*  55 */     int i9 = 0;
/*  56 */     int i10 = 0;
/*  57 */     int i11 = 0;
/*  58 */     int i12 = 0;
/*  59 */     int i13 = 0;
/*  60 */     int i14 = 0;
/*  61 */     int i15 = 0;
/*  62 */     int i16 = 0;
/*  63 */     int i17 = 0;
/*  64 */     int i18 = 0;
/*  65 */     int i19 = 0;
/*  66 */     int i20 = 0;
/*  67 */     int i21 = 0;
/*  68 */     int i22 = 0;
/*  69 */     int i23 = 0;
/*  70 */     int i24 = 0;
/*  71 */     int i25 = 0;
/*  72 */     int i26 = 0;
/*     */     
/*     */ 
/*  75 */     int i27 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       i = MainMemory.alloc(4);
/*  80 */       j = MainMemory.alloc(4);
/*  81 */       k = MainMemory.alloc(1);
/*  82 */       m = MainMemory.alloc(4);
/*  83 */       n = MainMemory.alloc(1);
/*  84 */       i1 = MainMemory.alloc(4);
/*  85 */       i2 = MainMemory.alloc(1);
/*  86 */       i3 = MainMemory.alloc(4);
/*  87 */       i4 = MainMemory.alloc(4);
/*  88 */       i5 = MainMemory.alloc(4);
/*  89 */       i6 = MainMemory.alloc(1);
/*  90 */       i7 = MainMemory.alloc(4);
/*  91 */       i8 = MainMemory.alloc(1);
/*  92 */       i9 = MainMemory.alloc(4);
/*  93 */       i10 = MainMemory.alloc(1);
/*  94 */       i11 = MainMemory.alloc(4);
/*  95 */       i12 = MainMemory.alloc(4);
/*  96 */       i13 = MainMemory.alloc(1);
/*  97 */       i14 = MainMemory.alloc(4);
/*  98 */       i15 = MainMemory.alloc(1);
/*  99 */       i16 = MainMemory.alloc(4);
/* 100 */       i17 = MainMemory.alloc(1);
/* 101 */       i18 = MainMemory.alloc(4);
/* 102 */       i19 = MainMemory.alloc(4);
/* 103 */       i20 = paramInt + 584;
/* 104 */       if (MainMemory.getI8(paramInt + 660) != 0) {
/*     */         break label797;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */       _ZNSsC1ERKSs.call(i19, i20);
/* 115 */       i21 = _ZNKSs7compareEPKc.call(i19, 14752) == 0 ? 1 : 0;
/* 116 */       _ZNSsD1Ev.call(i19);
/* 117 */       if (i21 == 0) {
/*     */         break label416;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       _ZNSaIcEC1Ev.call(i17);
/* 128 */       _ZNSsC1EPKcRKSaIcE.call(i18, 81504, i17);
/* 129 */       _ZNSaIcEC1Ev.call(i15);
/* 130 */       _ZNSsC1EPKcRKSaIcE.call(i16, 54080, i15);
/* 131 */       _ZN7duchamp14duchampWarningESsSs.call(i16, i18);
/* 132 */       _ZNSsD1Ev.call(i16);
/* 133 */       _ZNSaIcED1Ev.call(i15);
/* 134 */       _ZNSsD1Ev.call(i18);
/* 135 */       _ZNSaIcED1Ev.call(i17);
/* 136 */       _ZNSaIcEC1Ev.call(i13);
/* 137 */       _ZNSsC1EPKcRKSaIcE.call(i14, 36544, i13);
/* 138 */       _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs.call(MainMemory.getI32(paramInt + 28), i14);
/* 139 */       _ZNSsD1Ev.call(i14);
/* 140 */       _ZNSaIcED1Ev.call(i13);
/*     */       
/*     */       break label823;
/*     */       
/*     */       label416:
/* 145 */       _ZNSsC1ERKSs.call(i12, i20);
/* 146 */       i21 = _ZNKSs7compareEPKc.call(i12, 16224) == 0 ? 1 : 0;
/* 147 */       _ZNSsD1Ev.call(i12);
/* 148 */       if (i21 == 0) {
/*     */         break label565;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       _ZNSaIcEC1Ev.call(i10);
/* 159 */       _ZNSsC1EPKcRKSaIcE.call(i11, 81696, i10);
/* 160 */       _ZNSaIcEC1Ev.call(i8);
/* 161 */       _ZNSsC1EPKcRKSaIcE.call(i9, 54080, i8);
/* 162 */       _ZN7duchamp14duchampWarningESsSs.call(i9, i11);
/* 163 */       _ZNSsD1Ev.call(i9);
/* 164 */       _ZNSaIcED1Ev.call(i8);
/* 165 */       _ZNSsD1Ev.call(i11);
/* 166 */       _ZNSaIcED1Ev.call(i10);
/* 167 */       _ZNSaIcEC1Ev.call(i6);
/* 168 */       _ZNSsC1EPKcRKSaIcE.call(i7, 36640, i6);
/* 169 */       _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs.call(MainMemory.getI32(paramInt + 28), i7);
/* 170 */       _ZNSsD1Ev.call(i7);
/* 171 */       _ZNSaIcED1Ev.call(i6);
/*     */       
/*     */       break label823;
/*     */       
/*     */       label565:
/* 176 */       _ZNSsC1ERKSs.call(i5, i20);
/* 177 */       if (_ZNKSs7compareEPKc.call(i5, 16256) != 0) {
/*     */         break label611;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */       _ZNSsD1Ev.call(i5);
/*     */       
/*     */       break label668;
/*     */       
/*     */       label611:
/* 192 */       _ZNSsC1ERKSs.call(i4, i20);
/* 193 */       i22 = _ZNKSs7compareEPKc.call(i4, 16288);
/* 194 */       _ZNSsD1Ev.call(i4);
/* 195 */       i21 = i22 == 0 ? 1 : 0;
/* 196 */       _ZNSsD1Ev.call(i5);
/* 197 */       if (i21 == 0) {
/*     */         break label766;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label668:
/*     */       
/*     */ 
/*     */ 
/* 207 */       _ZNSaIcEC1Ev.call(i2);
/* 208 */       _ZNSsC1EPKcRKSaIcE.call(i3, 81760, i2);
/* 209 */       _ZNSaIcEC1Ev.call(n);
/* 210 */       _ZNSsC1EPKcRKSaIcE.call(i1, 54080, n);
/* 211 */       _ZN7duchamp14duchampWarningESsSs.call(i1, i3);
/* 212 */       _ZNSsD1Ev.call(i1);
/* 213 */       _ZNSaIcED1Ev.call(n);
/* 214 */       _ZNSsD1Ev.call(i3);
/* 215 */       _ZNSaIcED1Ev.call(i2);
/* 216 */       _ZNSaIcEC1Ev.call(k);
/* 217 */       _ZNSsC1EPKcRKSaIcE.call(m, 36672, k);
/* 218 */       _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs.call(MainMemory.getI32(paramInt + 28), m);
/* 219 */       _ZNSsD1Ev.call(m);
/* 220 */       _ZNSaIcED1Ev.call(k);
/*     */       
/*     */       break label823;
/*     */       
/*     */       label766:
/* 225 */       _ZNSsC1ERKSs.call(j, i20);
/* 226 */       _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs.call(MainMemory.getI32(paramInt + 28), j);
/* 227 */       _ZNSsD1Ev.call(j);
/*     */       
/*     */       break label823;
/*     */       
/*     */       label797:
/* 232 */       _ZNSsC1ERKSs.call(i, i20);
/* 233 */       _ZN7duchamp14SortDetectionsERSt6vectorINS_9DetectionESaIS1_EESs.call(MainMemory.getI32(paramInt + 28), i);
/* 234 */       _ZNSsD1Ev.call(i);
/*     */       
/*     */ 
/*     */       label823:
/*     */       
/*     */ 
/* 240 */       i23 = paramInt + 28;
/* 241 */       i22 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 248 */         i24 = i22 + 1;
/* 249 */         i25 = MainMemory.getI32(i23);
/* 250 */         i26 = MainMemory.getI32(i25);
/* 251 */         if (!MathUtils.ugt((MainMemory.getI32(i25 + 4) - i26) / 276, i22)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */         MainMemory.setI32(i26 + i22 * 276 + 140, i24);
/* 262 */         i22 = i24;
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
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 277 */       MainMemory.dealloc_generated(i27);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14sortDetectionsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */