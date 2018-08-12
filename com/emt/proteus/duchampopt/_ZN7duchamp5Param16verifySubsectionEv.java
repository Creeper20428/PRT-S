/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp5Param16verifySubsectionEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2521;
/*  25 */   public static final Function _instance = new _ZN7duchamp5Param16verifySubsectionEv();
/*  26 */   public final Function resolve() { return _instance; }
/*     */   
/*  28 */   public _ZN7duchamp5Param16verifySubsectionEv() { super("_ZN7duchamp5Param16verifySubsectionEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  32 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = call(i);
/*  41 */     paramFrame.setI32(paramInt1, j);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     int i7 = 0;
/*  60 */     int i8 = 0;
/*  61 */     int i9 = 0;
/*  62 */     int i10 = 0;
/*  63 */     int i11 = 0;
/*  64 */     int i12 = 0;
/*  65 */     int i13 = 0;
/*  66 */     int i14 = 0;
/*  67 */     int i15 = 0;
/*  68 */     int i16 = 0;
/*  69 */     int i17 = 0;
/*  70 */     int i18 = 0;
/*     */     
/*     */ 
/*  73 */     int i19 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  77 */       j = MainMemory.alloc(1);
/*  78 */       k = MainMemory.alloc(4);
/*  79 */       m = MainMemory.alloc(1);
/*  80 */       n = MainMemory.alloc(4);
/*  81 */       i1 = MainMemory.alloc(1);
/*  82 */       i2 = MainMemory.alloc(4);
/*  83 */       i3 = MainMemory.alloc(1);
/*  84 */       i4 = MainMemory.alloc(4);
/*  85 */       i5 = MainMemory.alloc(4);
/*  86 */       i6 = MainMemory.alloc(4);
/*  87 */       i7 = MainMemory.alloc(4);
/*  88 */       i8 = MainMemory.alloc(4);
/*  89 */       i9 = MainMemory.alloc(12);
/*  90 */       if (MainMemory.getI8(paramInt + 8) != 0) {
/*     */         break label207;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       if (MainMemory.getI8(paramInt + 356) != 0) {
/*     */         break label207;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1019;
/*     */       
/*     */       label207:
/*     */       
/* 117 */       MainMemory.setI32(i6, 0);
/* 118 */       i10 = paramInt + 4;
/* 119 */       ffexist.call(_ZNKSs5c_strEv.call(i10), i8, i6);
/* 120 */       if (MainMemory.getI32(i8) >= 1) {
/*     */         break label333;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/* 131 */       _ZNSaIcEC1Ev.call(i3);
/* 132 */       _ZNSsC1EPKcRKSaIcE.call(i4, 79136, i3);
/* 133 */       _ZNSaIcEC1Ev.call(i1);
/* 134 */       _ZNSsC1EPKcRKSaIcE.call(i2, 50176, i1);
/* 135 */       _ZN7duchamp14duchampWarningESsSs.call(i2, i4);
/* 136 */       _ZNSsD1Ev.call(i2);
/* 137 */       _ZNSaIcED1Ev.call(i1);
/* 138 */       _ZNSsD1Ev.call(i4);
/* 139 */       _ZNSaIcED1Ev.call(i3);
/* 140 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1019;
/*     */       
/*     */       label333:
/*     */       
/* 147 */       if (ffopentest.call(i7, _ZNKSs5c_strEv.call(i10), i6) != 0) {
/*     */         break label998;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */       MainMemory.setI32(i6, 0);
/* 158 */       if (ffgidm.call(MainMemory.getI32(i7), i5, i6) != 0) {
/*     */         break label972;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */       i11 = MainMemory.getI32(i5);
/* 169 */       i12 = i11 << 2;
/* 170 */       i13 = SystemLibrary.newarray(i12);
/* 171 */       i5 = i13;
/* 172 */       i14 = i11 > 0 ? 1 : 0;
/* 173 */       if (i14 != 0) {
/* 174 */         i15 = 0;
/*     */       } else {
/*     */         break label486;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 185 */         MainMemory.setI32(i13 + (i15 << 2), 1);
/* 186 */         i15 += 1;
/* 187 */       } while (i15 < i11);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label486:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 198 */       MainMemory.setI32(i6, 0);
/* 199 */       if (ffgisz.call(MainMemory.getI32(i7), i11, i5, i6) != 0) {
/*     */         break label946;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */       MainMemory.setI32(i6, 0);
/* 210 */       ffclos.call(MainMemory.getI32(i7), i6);
/* 211 */       if (MainMemory.getI32(i6) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */         _ZNSaIcEC1Ev.call(m);
/* 222 */         _ZNSsC1EPKcRKSaIcE.call(n, 63136, m);
/* 223 */         _ZNSaIcEC1Ev.call(j);
/* 224 */         _ZNSsC1EPKcRKSaIcE.call(k, 50176, j);
/* 225 */         _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 226 */         _ZNSsD1Ev.call(k);
/* 227 */         _ZNSaIcED1Ev.call(j);
/* 228 */         _ZNSsD1Ev.call(n);
/* 229 */         _ZNSaIcED1Ev.call(m);
/* 230 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 236 */       MainMemory.setI32(i9, 0);
/* 237 */       i16 = i9 + 4;
/* 238 */       MainMemory.setI32(i16, 0);
/* 239 */       i17 = i9 + 8;
/* 240 */       MainMemory.setI32(i17, 0);
/* 241 */       if (!MathUtils.ugt(i11, 1073741823)) {
/*     */         break label687;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */       _ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label687:
/*     */       
/*     */ 
/* 257 */       i18 = SystemLibrary.newobject(i12);
/* 258 */       i6 = i18;
/* 259 */       MainMemory.setI32(i9, i6);
/* 260 */       MainMemory.setI32(i16, i6);
/* 261 */       i5 = i6 + (i11 << 2);
/* 262 */       MainMemory.setI32(i17, i5);
/* 263 */       if (i11 == 0) {
/*     */         break label786;
/*     */       } else {
/* 266 */         i12 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 275 */         MainMemory.setI32(i18 + (i12 << 2), 0);
/* 276 */         i12 += 1;
/* 277 */         if (i12 == i11) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label786:
/*     */       
/*     */ 
/*     */ 
/* 288 */       MainMemory.setI32(i16, i5);
/* 289 */       if (i14 != 0) {
/* 290 */         i12 = 0;
/*     */       } else {
/*     */         break label857;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 301 */         MainMemory.setI32(i6 + (i12 << 2), MainMemory.getI32(i13 + (i12 << 2)));
/* 302 */         i12 += 1;
/* 303 */       } while (i12 < i11);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label857:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 314 */       if (i13 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */         SystemLibrary.deletearray(i13);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 330 */       i11 = _ZN7duchamp5Param16parseSubsectionsERSt6vectorIlSaIlEE.call(paramInt, i9);
/* 331 */       i6 = MainMemory.getI32(i9);
/* 332 */       if (i6 != 0) {
/*     */         break label928;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */       i = i11;
/*     */       
/*     */ 
/*     */       break label1019;
/*     */       
/*     */       label928:
/*     */       
/* 349 */       SystemLibrary.delete(i6);
/* 350 */       i = i11;
/*     */       
/*     */ 
/*     */       break label1019;
/*     */       
/*     */       label946:
/*     */       
/* 357 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/* 358 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1019;
/*     */       
/*     */       label972:
/*     */       
/* 365 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/* 366 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1019;
/*     */       
/*     */       label998:
/*     */       
/* 373 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/* 374 */       i = 1;
/*     */       
/*     */ 
/*     */       label1019:
/*     */       
/*     */ 
/* 380 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 385 */       MainMemory.dealloc_generated(i19);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param16verifySubsectionEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */