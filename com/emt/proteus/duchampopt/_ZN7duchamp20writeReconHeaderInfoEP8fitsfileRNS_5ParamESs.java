/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp20writeReconHeaderInfoEP8fitsfileRNS_5ParamESs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2022;
/*  23 */   public static final Function _instance = new _ZN7duchamp20writeReconHeaderInfoEP8fitsfileRNS_5ParamESs();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _ZN7duchamp20writeReconHeaderInfoEP8fitsfileRNS_5ParamESs() { super("_ZN7duchamp20writeReconHeaderInfoEP8fitsfileRNS_5ParamESs", 3, false); }
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
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*  66 */     int i10 = 0;
/*     */     
/*     */ 
/*  69 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       i = MainMemory.alloc(1);
/*  74 */       j = MainMemory.alloc(4);
/*  75 */       k = MainMemory.alloc(1);
/*  76 */       m = MainMemory.alloc(4);
/*  77 */       n = MainMemory.alloc(4);
/*  78 */       i1 = MainMemory.alloc(4);
/*  79 */       i2 = MainMemory.alloc(1);
/*  80 */       i3 = MainMemory.alloc(1);
/*  81 */       i4 = MainMemory.alloc(4);
/*  82 */       i5 = MainMemory.alloc(4);
/*  83 */       i6 = MainMemory.alloc(4);
/*  84 */       i7 = MainMemory.alloc(4);
/*  85 */       i8 = MainMemory.alloc(4);
/*  86 */       MainMemory.setI32(i4, 0);
/*  87 */       _ZNSaIcEC1Ev.call(i3);
/*  88 */       _ZNSsC1EPKcRKSaIcE.call(i5, 12960, i3);
/*  89 */       _ZNSaIcED1Ev.call(i3);
/*  90 */       _ZNSaIcEC1Ev.call(i2);
/*  91 */       _ZNSsC1EPKcRKSaIcE.call(i6, 12960, i2);
/*  92 */       _ZNSaIcED1Ev.call(i2);
/*  93 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(464064), i4);
/*  94 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(464240), i4);
/*  95 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(465648), i4);
/*  96 */       _ZNSsC1ERKSs.call(i1, paramInt2 + 4);
/*  97 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(i1), i4);
/*  98 */       _ZNSsD1Ev.call(i1);
/*  99 */       if (MainMemory.getI8(paramInt2 + 8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         ffpcom.call(paramInt1, _ZNKSs5c_strEv.call(466352), i4);
/* 110 */         i9 = _ZNKSs5c_strEv.call(462480);
/* 111 */         _ZNSsC1ERKSs.call(n, paramInt2 + 16);
/* 112 */         i10 = _ZNKSs5c_strEv.call(n);
/* 113 */         ffpky.call(paramInt1, 16, _ZNKSs5c_strEv.call(463360), i10, i9, i4);
/* 114 */         _ZNSsD1Ev.call(n);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 120 */       ffpcom.call(paramInt1, _ZNKSs5c_strEv.call(464944), i4);
/* 121 */       MainMemory.setF32(i7, MainMemory.getF32(paramInt2 + 460));
/* 122 */       i9 = _ZNKSs5c_strEv.call(461248);
/* 123 */       ffpky.call(paramInt1, 42, _ZNKSs5c_strEv.call(461772), i7, i9, i4);
/* 124 */       MainMemory.setI32(i8, MainMemory.getI32(paramInt2 + 448));
/* 125 */       i10 = _ZNKSs5c_strEv.call(460896);
/* 126 */       i9 = i8;
/* 127 */       ffpky.call(paramInt1, 31, _ZNKSs5c_strEv.call(461420), i9, i10, i4);
/* 128 */       MainMemory.setI32(i8, MainMemory.getI32(paramInt2 + 452));
/* 129 */       i10 = _ZNKSs5c_strEv.call(461072);
/* 130 */       ffpky.call(paramInt1, 31, _ZNKSs5c_strEv.call(461596), i9, i10, i4);
/* 131 */       MainMemory.setI32(i8, MainMemory.getI32(paramInt2 + 508));
/* 132 */       i10 = _ZNKSs5c_strEv.call(462128);
/* 133 */       ffpky.call(paramInt1, 31, _ZNKSs5c_strEv.call(463008), i9, i10, i4);
/* 134 */       if (_ZNKSs7compareEPKc.call(paramInt3, 23488) != 0) {
/*     */         break label523;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */       _ZNSsaSEPKc.call(i5, 90848);
/* 145 */       _ZNSsaSEPKc.call(i6, 23552);
/*     */       
/*     */       break label630;
/*     */       
/*     */       label523:
/* 150 */       if (_ZNKSs7compareEPKc.call(paramInt3, 23584) != 0) {
/*     */         break label573;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */       _ZNSsaSEPKc.call(i5, 81440);
/* 161 */       _ZNSsaSEPKc.call(i6, 23616);
/*     */       
/*     */       break label630;
/*     */       
/*     */       label573:
/* 166 */       _ZNSaIcEC1Ev.call(k);
/* 167 */       _ZNSsC1EPKcRKSaIcE.call(m, 69504, k);
/* 168 */       _ZNSaIcEC1Ev.call(i);
/* 169 */       _ZNSsC1EPKcRKSaIcE.call(j, 58848, i);
/* 170 */       _ZN7duchamp14duchampWarningESsSs.call(j, m);
/* 171 */       _ZNSsD1Ev.call(j);
/* 172 */       _ZNSaIcED1Ev.call(i);
/* 173 */       _ZNSsD1Ev.call(m);
/* 174 */       _ZNSaIcED1Ev.call(k);
/*     */       
/*     */ 
/*     */       label630:
/*     */       
/*     */ 
/* 180 */       ffpcom.call(paramInt1, _ZNKSs5c_strEv.call(i5), i4);
/* 181 */       i9 = _ZNKSs5c_strEv.call(461952);
/* 182 */       i10 = _ZNKSs5c_strEv.call(i6);
/* 183 */       ffpky.call(paramInt1, 16, _ZNKSs5c_strEv.call(462832), i10, i9, i4);
/* 184 */       _ZNSsD1Ev.call(i6);
/* 185 */       _ZNSsD1Ev.call(i5);
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
/* 196 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp20writeReconHeaderInfoEP8fitsfileRNS_5ParamESs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */