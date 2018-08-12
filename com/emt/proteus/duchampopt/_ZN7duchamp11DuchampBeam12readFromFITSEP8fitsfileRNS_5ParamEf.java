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
/*     */ public final class _ZN7duchamp11DuchampBeam12readFromFITSEP8fitsfileRNS_5ParamEf
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2365;
/*  20 */   public static final Function _instance = new _ZN7duchamp11DuchampBeam12readFromFITSEP8fitsfileRNS_5ParamEf();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public _ZN7duchamp11DuchampBeam12readFromFITSEP8fitsfileRNS_5ParamEf() { super("_ZN7duchamp11DuchampBeam12readFromFITSEP8fitsfileRNS_5ParamEf", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
/*     */   {
/*  27 */     call(paramInt1, paramInt2, paramInt3, paramFloat);
/*  28 */     return 0;
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
/*  42 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, k, f);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
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
/*  65 */     float f = 0.0F;
/*  66 */     int i9 = 0;
/*     */     
/*     */ 
/*  69 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       i = MainMemory.alloc(1);
/*  74 */       j = MainMemory.alloc(1);
/*  75 */       k = MainMemory.alloc(1);
/*  76 */       m = MainMemory.alloc(12);
/*  77 */       n = MainMemory.alloc(4);
/*  78 */       i1 = MainMemory.alloc(4);
/*  79 */       i2 = MainMemory.alloc(4);
/*  80 */       i3 = MainMemory.alloc(12);
/*  81 */       i4 = SystemLibrary.newarray(80);
/*  82 */       _ZNSaIcEC1Ev.call(k);
/*  83 */       _ZNSsC1EPKcRKSaIcE.call(m, 19040, k);
/*  84 */       _ZNSaIcED1Ev.call(k);
/*  85 */       i5 = m + 4;
/*  86 */       _ZNSaIcEC1Ev.call(j);
/*  87 */       _ZNSsC1EPKcRKSaIcE.call(i5, 19104, j);
/*  88 */       _ZNSaIcED1Ev.call(j);
/*  89 */       i6 = m + 8;
/*  90 */       _ZNSaIcEC1Ev.call(i);
/*  91 */       _ZNSsC1EPKcRKSaIcE.call(i6, 16416, i);
/*  92 */       _ZNSaIcED1Ev.call(i);
/*  93 */       MainMemory.setI32(i3, 0);
/*  94 */       i7 = i3 + 4;
/*  95 */       MainMemory.setI32(i7, 0);
/*  96 */       i8 = i3 + 8;
/*  97 */       MainMemory.setI32(i8, 0);
/*  98 */       ffgky.call(paramInt2, 42, _ZNKSs5c_strEv.call(m), n, i4, i3);
/*  99 */       ffgky.call(paramInt2, 42, _ZNKSs5c_strEv.call(i5), i1, i4, i7);
/* 100 */       ffgky.call(paramInt2, 42, _ZNKSs5c_strEv.call(i6), i2, i4, i8);
/* 101 */       if (MainMemory.getI32(i3) != 0) {
/*     */         break label404;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       if (MainMemory.getI32(i7) != 0) {
/*     */         break label404;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       if (MainMemory.getI32(i8) != 0) {
/*     */         break label404;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       f = MainMemory.getF32(i1) / paramFloat;
/* 132 */       paramFloat = MainMemory.getF32(n) / paramFloat;
/* 133 */       _ZN7duchamp4Beam6defineEfff.call(paramInt1, paramFloat, f, MainMemory.getF32(i2));
/* 134 */       i7 = paramInt1 + 20;
/* 135 */       MainMemory.setI32(i7, 1);
/* 136 */       _ZN7duchamp4BeamaSERKS0_.call(paramInt3 + 300, paramInt1);
/* 137 */       MainMemory.setI32(paramInt3 + 320, MainMemory.getI32(i7));
/* 138 */       i9 = 0;
/*     */       
/*     */       break label417;
/*     */       
/*     */       label404:
/* 143 */       _ZN7duchamp11DuchampBeam6defineERNS_5ParamEb.call(paramInt1, paramInt3);
/* 144 */       i9 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label417:
/*     */         
/* 151 */         _ZNSsD1Ev.call(m + (2 - i9 << 2));
/* 152 */         i9 += 1;
/* 153 */         if (i9 == 3) {
/*     */           break;
/*     */         }
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
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 174 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp11DuchampBeam12readFromFITSEP8fitsfileRNS_5ParamEf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */