/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp21writeSmoothHeaderInfoEP8fitsfileRNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2021;
/*  18 */   public static final Function _instance = new _ZN7duchamp21writeSmoothHeaderInfoEP8fitsfileRNS_5ParamE();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN7duchamp21writeSmoothHeaderInfoEP8fitsfileRNS_5ParamE() { super("_ZN7duchamp21writeSmoothHeaderInfoEP8fitsfileRNS_5ParamE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  25 */     call(paramInt1, paramInt2);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(i, j);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*  53 */     int i5 = 0;
/*  54 */     int i6 = 0;
/*     */     
/*     */ 
/*  57 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.alloc(4);
/*  62 */       j = MainMemory.alloc(4);
/*  63 */       k = MainMemory.alloc(4);
/*  64 */       m = MainMemory.alloc(4);
/*  65 */       n = MainMemory.alloc(4);
/*  66 */       i1 = MainMemory.alloc(4);
/*  67 */       i2 = MainMemory.alloc(4);
/*  68 */       MainMemory.setI32(n, 0);
/*  69 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(464416), n);
/*  70 */       MainMemory.setI32(n, 0);
/*  71 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(465824), n);
/*  72 */       MainMemory.setI32(n, 0);
/*  73 */       _ZNSsC1ERKSs.call(m, paramInt2 + 4);
/*  74 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(m), n);
/*  75 */       _ZNSsD1Ev.call(m);
/*  76 */       if (MainMemory.getI8(paramInt2 + 8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         MainMemory.setI32(n, 0);
/*  87 */         ffpcom.call(paramInt1, _ZNKSs5c_strEv.call(466528), n);
/*  88 */         MainMemory.setI32(n, 0);
/*  89 */         i3 = _ZNKSs5c_strEv.call(462480);
/*  90 */         _ZNSsC1ERKSs.call(k, paramInt2 + 16);
/*  91 */         i4 = _ZNKSs5c_strEv.call(k);
/*  92 */         ffpky.call(paramInt1, 16, _ZNKSs5c_strEv.call(463360), i4, i3, n);
/*  93 */         _ZNSsD1Ev.call(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  99 */       k = paramInt2 + 424;
/* 100 */       _ZNSsC1ERKSs.call(j, k);
/* 101 */       i5 = _ZNKSs7compareEPKc.call(j, 37664) == 0 ? 1 : 0;
/* 102 */       _ZNSsD1Ev.call(j);
/* 103 */       if (i5 == 0) {
/*     */         break label488;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       i6 = paramInt2 + 436;
/* 114 */       if (!MathUtils.f_olt(MainMemory.getF32(i6), 0.0D)) {
/*     */         break label335;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       MainMemory.setF32(i6, MainMemory.getF32(paramInt2 + 432));
/*     */       
/*     */ 
/*     */       label335:
/*     */       
/*     */ 
/* 130 */       i3 = _ZNKSs5c_strEv.call(462304);
/* 131 */       i4 = _ZNKSs5c_strEv.call(464592);
/* 132 */       ffpky.call(paramInt1, 16, _ZNKSs5c_strEv.call(463184), i4, i3, n);
/* 133 */       MainMemory.setF32(i1, MainMemory.getF32(paramInt2 + 432));
/* 134 */       i4 = _ZNKSs5c_strEv.call(460192);
/* 135 */       i3 = i1;
/* 136 */       ffpky.call(paramInt1, 42, _ZNKSs5c_strEv.call(460544), i3, i4, n);
/* 137 */       MainMemory.setF32(i1, MainMemory.getF32(i6));
/* 138 */       i4 = _ZNKSs5c_strEv.call(460368);
/* 139 */       ffpky.call(paramInt1, 42, _ZNKSs5c_strEv.call(460720), i3, i4, n);
/* 140 */       MainMemory.setF32(i1, MainMemory.getF32(paramInt2 + 440));
/* 141 */       i4 = _ZNKSs5c_strEv.call(459840);
/* 142 */       ffpky.call(paramInt1, 42, _ZNKSs5c_strEv.call(460016), i3, i4, n);
/*     */       
/*     */ 
/*     */       break label615;
/*     */       
/*     */       label488:
/*     */       
/* 149 */       _ZNSsC1ERKSs.call(i, k);
/* 150 */       i5 = _ZNKSs7compareEPKc.call(i, 43360) == 0 ? 1 : 0;
/* 151 */       _ZNSsD1Ev.call(i);
/* 152 */       if (i5 == 0) {
/*     */         break label610;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */       i3 = _ZNKSs5c_strEv.call(462304);
/* 163 */       i4 = _ZNKSs5c_strEv.call(465296);
/* 164 */       ffpky.call(paramInt1, 16, _ZNKSs5c_strEv.call(463184), i4, i3, n);
/* 165 */       MainMemory.setI32(i2, MainMemory.getI32(paramInt2 + 428));
/* 166 */       i3 = _ZNKSs5c_strEv.call(463888);
/* 167 */       ffpky.call(paramInt1, 31, _ZNKSs5c_strEv.call(464768), i2, i3, n);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label610:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label615:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp21writeSmoothHeaderInfoEP8fitsfileRNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */