/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE4openEPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube19outputDetectionListEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1591;
/*  31 */   public static final Function _instance = new _ZN7duchamp4Cube19outputDetectionListEv();
/*  32 */   public final Function resolve() { return _instance; }
/*     */   
/*  34 */   public _ZN7duchamp4Cube19outputDetectionListEv() { super("_ZN7duchamp4Cube19outputDetectionListEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  38 */     call(paramInt);
/*  39 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  44 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*  64 */     int i6 = 0;
/*  65 */     int i7 = 0;
/*  66 */     int i8 = 0;
/*  67 */     int i9 = 0;
/*  68 */     int i10 = 0;
/*  69 */     int i11 = 0;
/*  70 */     int i12 = 0;
/*  71 */     int i13 = 0;
/*  72 */     int i14 = 0;
/*  73 */     int i15 = 0;
/*  74 */     int i16 = 0;
/*  75 */     int i17 = 0;
/*  76 */     int i18 = 0;
/*  77 */     int i19 = 0;
/*  78 */     byte b = 0;
/*  79 */     int i20 = 0;
/*  80 */     int i21 = 0;
/*     */     
/*     */ 
/*  83 */     int i22 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  87 */       i = MainMemory.alloc(12);
/*  88 */       j = MainMemory.alloc(1);
/*  89 */       k = MainMemory.alloc(4);
/*  90 */       m = MainMemory.alloc(12);
/*  91 */       n = MainMemory.alloc(1);
/*  92 */       i1 = MainMemory.alloc(4);
/*  93 */       i2 = MainMemory.alloc(12);
/*  94 */       i3 = MainMemory.alloc(1);
/*  95 */       i4 = MainMemory.alloc(4);
/*  96 */       i5 = MainMemory.alloc(12);
/*  97 */       i6 = MainMemory.alloc(1);
/*  98 */       i7 = MainMemory.alloc(4);
/*  99 */       i8 = MainMemory.alloc(4);
/* 100 */       i9 = MainMemory.alloc(4);
/* 101 */       i19 = MainMemory.alloc(4);
/* 102 */       i10 = MainMemory.alloc(4);
/* 103 */       i11 = MainMemory.alloc(4);
/* 104 */       i12 = MainMemory.alloc(276);
/* 105 */       _ZNSsC1Ev.call(i11);
/* 106 */       i13 = paramInt + 128;
/* 107 */       if (MainMemory.getI8(i13) != 0) {
/*     */         break label259;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */       _ZNSsC1ERKSs.call(i19, paramInt + 124);
/* 118 */       _ZNSsaSERKSs.call(i11, i19);
/* 119 */       _ZNSsD1Ev.call(i19);
/*     */       
/*     */       break label287;
/*     */       
/*     */       label259:
/* 124 */       _ZNSsC1ERKSs.call(i10, paramInt + 132);
/* 125 */       _ZNSsaSERKSs.call(i11, i10);
/* 126 */       _ZNSsD1Ev.call(i10);
/*     */       
/*     */ 
/*     */       label287:
/*     */       
/*     */ 
/* 132 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(i12, _ZNKSs5c_strEv.call(i11), 1);
/* 133 */       i14 = paramInt + 28;
/* 134 */       i15 = MainMemory.getI32(i14);
/* 135 */       i16 = MainMemory.getI32(i15 + 4);
/* 136 */       i17 = MainMemory.getI32(i15);
/* 137 */       i18 = i12;
/* 138 */       _ZNSolsEPFRSoS_E.call(_ZNSolsEj.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i18, 74784), (i16 - i17) / 276), 79);
/* 139 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i18, 64224);
/* 140 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(i12);
/* 141 */       i19 = paramInt + 124;
/* 142 */       if (MainMemory.getI8(i13) != 0) {
/*     */         break label429;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */       _ZNSsC1ERKSs.call(i8, i19);
/* 153 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE4openEPKcSt13_Ios_Openmode.call(i12, _ZNKSs5c_strEv.call(i8), 1);
/* 154 */       _ZNSsD1Ev.call(i8);
/*     */       
/*     */       break label458;
/*     */       
/*     */       label429:
/* 159 */       _ZNSsC1ERKSs.call(i9, i19);
/* 160 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE4openEPKcSt13_Ios_Openmode.call(i12, _ZNKSs5c_strEv.call(i9), 48);
/* 161 */       _ZNSsD1Ev.call(i9);
/*     */       
/*     */ 
/*     */       label458:
/*     */       
/*     */ 
/* 167 */       i15 = MainMemory.getI32(i14);
/* 168 */       if (!MathUtils.ult(MainMemory.getI32(i15 + 4) + 275 - MainMemory.getI32(i15), 551))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         _ZN7duchamp4Cube12setupColumnsEv.call(paramInt);
/* 179 */         i13 = paramInt + 660;
/* 180 */         b = MainMemory.getI8(i13);
/* 181 */         _ZNSaIcEC1Ev.call(i6);
/* 182 */         _ZNSsC1EPKcRKSaIcE.call(i7, 18624, i6);
/* 183 */         i20 = paramInt + 752;
/* 184 */         _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_.call(i5, i20);
/* 185 */         _ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb.call(i18, MainMemory.getI32(i5), MainMemory.getI32(i5 + 4), i7, b);
/* 186 */         _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(i5);
/* 187 */         _ZNSsD1Ev.call(i7);
/* 188 */         _ZNSaIcED1Ev.call(i6);
/* 189 */         b = MainMemory.getI8(i13);
/* 190 */         _ZNSaIcEC1Ev.call(i3);
/* 191 */         _ZNSsC1EPKcRKSaIcE.call(i4, 28480, i3);
/* 192 */         _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_.call(i2, i20);
/* 193 */         _ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb.call(1808, MainMemory.getI32(i2), MainMemory.getI32(i2 + 4), i4, b);
/* 194 */         _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(i2);
/* 195 */         _ZNSsD1Ev.call(i4);
/* 196 */         _ZNSaIcED1Ev.call(i3);
/* 197 */         i15 = MainMemory.getI32(i14);
/* 198 */         i16 = MainMemory.getI32(i15);
/*     */         
/* 200 */         i21 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 208 */           i17 = i16 + i21 * 276;
/* 209 */           if (!MathUtils.ult(i17, MainMemory.getI32(i15 + 4))) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */           _ZNSaIcEC1Ev.call(n);
/* 220 */           _ZNSsC1EPKcRKSaIcE.call(i1, 18624, n);
/* 221 */           _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_.call(m, i20);
/* 222 */           _ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs.call(i17, i18, m, i1);
/* 223 */           _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(m);
/* 224 */           _ZNSsD1Ev.call(i1);
/* 225 */           _ZNSaIcED1Ev.call(n);
/* 226 */           _ZNSaIcEC1Ev.call(j);
/* 227 */           _ZNSsC1EPKcRKSaIcE.call(k, 28480, j);
/* 228 */           _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_.call(i, i20);
/* 229 */           _ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs.call(i17, 1808, i, k);
/* 230 */           _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(i);
/* 231 */           _ZNSsD1Ev.call(k);
/* 232 */           _ZNSaIcED1Ev.call(j);
/* 233 */           i21 += 1;
/* 234 */           i15 = MainMemory.getI32(i14);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 241 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(i12);
/* 242 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(i12);
/* 243 */       _ZNSsD1Ev.call(i11);
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
/* 254 */       MainMemory.dealloc_generated(i22);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube19outputDetectionListEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */