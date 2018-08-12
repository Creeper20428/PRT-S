/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp7Section9intersectERS0_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2637;
/*  28 */   public static final Function _instance = new _ZN7duchamp7Section9intersectERS0_();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public _ZN7duchamp7Section9intersectERS0_() { super("_ZN7duchamp7Section9intersectERS0_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  35 */     call(paramInt1, paramInt2, paramInt3);
/*  36 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  41 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     call(i, j, k);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  57 */     int i = 0;
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*  65 */     int i4 = 0;
/*  66 */     int i5 = 0;
/*  67 */     int i6 = 0;
/*  68 */     int i7 = 0;
/*  69 */     int i8 = 0;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*  75 */     int i14 = 0;
/*  76 */     int i15 = 0;
/*  77 */     int i16 = 0;
/*  78 */     int i17 = 0;
/*     */     
/*     */ 
/*  81 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  85 */       i = MainMemory.alloc(4);
/*  86 */       j = MainMemory.alloc(4);
/*  87 */       k = MainMemory.alloc(4);
/*  88 */       m = MainMemory.alloc(1);
/*  89 */       n = MainMemory.alloc(4);
/*  90 */       i1 = MainMemory.alloc(1);
/*  91 */       i2 = MainMemory.alloc(4);
/*  92 */       i3 = MainMemory.alloc(12);
/*  93 */       i4 = MainMemory.alloc(188);
/*  94 */       i5 = MainMemory.alloc(48);
/*  95 */       i6 = MainMemory.alloc(188);
/*  96 */       i7 = paramInt2 + 20;
/*  97 */       i8 = paramInt3 + 20;
/*  98 */       if (MainMemory.getI32(i7) != MainMemory.getI32(i8)) {
/*     */         break label796;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       _ZNSsC1Ev.call(k);
/* 109 */       _ZNSt6vectorISsSaISsEEC2EjRKSsRKS0_.call(i3, MainMemory.getI32(i7), k);
/* 110 */       _ZNSsD1Ev.call(k);
/* 111 */       i9 = paramInt3 + 24;
/* 112 */       i10 = paramInt3 + 36;
/* 113 */       i11 = paramInt2 + 24;
/* 114 */       i12 = paramInt2 + 36;
/* 115 */       i13 = i6 + 8;
/* 116 */       i17 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 123 */         if (!MathUtils.ugt(MainMemory.getI32(i7), i17)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i6, 24);
/* 134 */         if (!MathUtils.ugt(MainMemory.getI32(i8), i17))
/*     */         {
/*     */ 
/*     */ 
/* 138 */           i14 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 145 */           i15 = MainMemory.getI32(MainMemory.getI32(i9) + (i17 << 2)) + -1 + MainMemory.getI32(MainMemory.getI32(i10) + (i17 << 2));
/* 146 */           i14 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         i15 = MainMemory.getI32(MainMemory.getI32(i11) + (i17 << 2));
/* 154 */         if (!MathUtils.ugt(MainMemory.getI32(i7), i17))
/*     */         {
/*     */ 
/*     */ 
/* 158 */           i16 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 165 */           i16 = i15 + -1 + MainMemory.getI32(MainMemory.getI32(i12) + (i17 << 2));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         i14 = (i14 < i16 ? i14 : i16) + 1;
/* 174 */         i16 = MainMemory.getI32(MainMemory.getI32(i9) + (i17 << 2));
/* 175 */         _ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(i13, (i15 < i16 ? i16 : i15) + 1), 13632), i14);
/* 176 */         _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(j, i6);
/* 177 */         _ZNSsaSERKSs.call(MainMemory.getI32(i3) + (i17 << 2), j);
/* 178 */         _ZNSsD1Ev.call(j);
/* 179 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i6);
/* 180 */         i17 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 186 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i4, 24);
/* 187 */       j = MainMemory.getI32(i3);
/* 188 */       i13 = i4 + 8;
/* 189 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i13, 13024), j);
/* 190 */       i17 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 197 */         if (!MathUtils.ugt(MainMemory.getI32(i7), i17)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */         _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i13, 13376), j + (i17 << 2));
/* 208 */         i17 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 214 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i13, 13056);
/* 215 */       MainMemory.setI32(i5, 12840);
/* 216 */       j = i5 + 4;
/* 217 */       _ZNSsC1Ev.call(j);
/* 218 */       MainMemory.setI32(i5 + 8, 0);
/* 219 */       MainMemory.setI32(i5 + 12, 0);
/* 220 */       MainMemory.setI32(i5 + 16, 0);
/* 221 */       MainMemory.setI32(i5 + 24, 0);
/* 222 */       MainMemory.setI32(i5 + 28, 0);
/* 223 */       MainMemory.setI32(i5 + 32, 0);
/* 224 */       MainMemory.setI32(i5 + 36, 0);
/* 225 */       MainMemory.setI32(i5 + 40, 0);
/* 226 */       MainMemory.setI32(i5 + 44, 0);
/* 227 */       MainMemory.setI32(i5 + 20, 0);
/* 228 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i, i4);
/* 229 */       _ZNSsaSERKSs.call(j, i);
/* 230 */       _ZNSsD1Ev.call(i);
/* 231 */       _ZN7duchamp7SectionC2ERKS0_.call(paramInt1, i5);
/* 232 */       _ZN7duchamp7SectionD1Ev.call(i5);
/* 233 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i4);
/* 234 */       _ZNSt6vectorISsSaISsEED1Ev.call(i3);
/*     */       
/*     */ 
/*     */       break label861;
/*     */       
/*     */       label796:
/*     */       
/* 241 */       _ZNSaIcEC1Ev.call(i1);
/* 242 */       _ZNSsC1EPKcRKSaIcE.call(i2, 123936, i1);
/* 243 */       _ZNSaIcEC1Ev.call(m);
/* 244 */       _ZNSsC1EPKcRKSaIcE.call(n, 60704, m);
/* 245 */       _ZN7duchamp12duchampErrorESsSs.call(n, i2);
/* 246 */       _ZNSsD1Ev.call(n);
/* 247 */       _ZNSaIcED1Ev.call(m);
/* 248 */       _ZNSsD1Ev.call(i2);
/* 249 */       _ZNSaIcED1Ev.call(i1);
/* 250 */       _ZN7duchamp7SectionC2ERKS0_.call(paramInt1, paramInt2);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label861:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7Section9intersectERS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */