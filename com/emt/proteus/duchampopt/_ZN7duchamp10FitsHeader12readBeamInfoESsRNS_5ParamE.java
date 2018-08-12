/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader12readBeamInfoESsRNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2469;
/*  21 */   public static final Function _instance = new _ZN7duchamp10FitsHeader12readBeamInfoESsRNS_5ParamE();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public _ZN7duchamp10FitsHeader12readBeamInfoESsRNS_5ParamE() { super("_ZN7duchamp10FitsHeader12readBeamInfoESsRNS_5ParamE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  28 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = call(i, j, k);
/*  43 */     paramFrame.setI32(paramInt1, m);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  49 */     int i = 0;
/*     */     
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     double d1 = 0.0D;
/*  61 */     double d2 = 0.0D;
/*  62 */     float f = 0.0F;
/*     */     
/*     */ 
/*  65 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       j = MainMemory.alloc(1);
/*  70 */       k = MainMemory.alloc(4);
/*  71 */       m = MainMemory.alloc(1);
/*  72 */       n = MainMemory.alloc(4);
/*  73 */       i1 = MainMemory.alloc(4);
/*  74 */       i2 = MainMemory.alloc(4);
/*  75 */       MainMemory.setI32(i1, 0);
/*  76 */       if (ffopentest.call(i2, _ZNKSs5c_strEv.call(paramInt2), i1) != 0) {
/*     */         break label345;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       i3 = MainMemory.getI32(paramInt1 + 4);
/*  87 */       i4 = MainMemory.getI32(i3 + 12);
/*  88 */       i5 = MainMemory.getI32(i3 + 16);
/*  89 */       d1 = MainMemory.getF64(i4) * MainMemory.getF64(i5);
/*  90 */       d2 = MainMemory.getF64(i4 + (MainMemory.getI32(i3 + 4) + 1 << 3)) * MainMemory.getF64(i5 + 8);
/*  91 */       d1 *= d2;
/*  92 */       f = (float)SystemLibrary.sqrt(SystemLibrary.fabs(d1));
/*  93 */       _ZN7duchamp11DuchampBeam12readFromFITSEP8fitsfileRNS_5ParamEf.call(paramInt1 + 44, MainMemory.getI32(i2), paramInt3, f);
/*  94 */       MainMemory.setI32(i1, 0);
/*  95 */       ffclos.call(MainMemory.getI32(i2), i1);
/*  96 */       if (MainMemory.getI32(i1) != 0) {
/*     */         break label264;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       i = 0;
/*     */       
/*     */ 
/*     */       break label366;
/*     */       
/*     */       label264:
/*     */       
/* 113 */       _ZNSaIcEC1Ev.call(m);
/* 114 */       _ZNSsC1EPKcRKSaIcE.call(n, 63136, m);
/* 115 */       _ZNSaIcEC1Ev.call(j);
/* 116 */       _ZNSsC1EPKcRKSaIcE.call(k, 50176, j);
/* 117 */       _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 118 */       _ZNSsD1Ev.call(k);
/* 119 */       _ZNSaIcED1Ev.call(j);
/* 120 */       _ZNSsD1Ev.call(n);
/* 121 */       _ZNSaIcED1Ev.call(m);
/* 122 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i1));
/* 123 */       i = 0;
/*     */       
/*     */ 
/*     */       break label366;
/*     */       
/*     */       label345:
/*     */       
/* 130 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i1));
/* 131 */       i = 1;
/*     */       
/*     */ 
/*     */       label366:
/*     */       
/*     */ 
/* 137 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 142 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader12readBeamInfoESsRNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */