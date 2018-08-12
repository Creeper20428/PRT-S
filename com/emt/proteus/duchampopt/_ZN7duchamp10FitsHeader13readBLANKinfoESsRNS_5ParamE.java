/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader13readBLANKinfoESsRNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2470;
/*  24 */   public static final Function _instance = new _ZN7duchamp10FitsHeader13readBLANKinfoESsRNS_5ParamE();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp10FitsHeader13readBLANKinfoESsRNS_5ParamE() { super("_ZN7duchamp10FitsHeader13readBLANKinfoESsRNS_5ParamE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  31 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  45 */     int m = call(i, j, k);
/*  46 */     paramFrame.setI32(paramInt1, m);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     int i10 = 0;
/*  68 */     int i11 = 0;
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*  72 */     int i15 = 0;
/*  73 */     float f1 = 0.0F;
/*  74 */     float f2 = 0.0F;
/*  75 */     float f3 = 0.0F;
/*     */     
/*     */ 
/*  78 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  82 */       j = MainMemory.alloc(1);
/*  83 */       k = MainMemory.alloc(4);
/*  84 */       m = MainMemory.alloc(1);
/*  85 */       n = MainMemory.alloc(4);
/*  86 */       i1 = MainMemory.alloc(1);
/*  87 */       i2 = MainMemory.alloc(4);
/*  88 */       i3 = MainMemory.alloc(1);
/*  89 */       i4 = MainMemory.alloc(4);
/*  90 */       i5 = MainMemory.alloc(1);
/*  91 */       i6 = MainMemory.alloc(4);
/*  92 */       i7 = MainMemory.alloc(4);
/*  93 */       i8 = MainMemory.alloc(4);
/*  94 */       i9 = MainMemory.alloc(4);
/*  95 */       i10 = MainMemory.alloc(4);
/*  96 */       i11 = MainMemory.alloc(4);
/*  97 */       i12 = MainMemory.alloc(188);
/*  98 */       MainMemory.setI32(i6, 0);
/*  99 */       i13 = SystemLibrary.newarray(73);
/* 100 */       if (ffopentest.call(i7, _ZNKSs5c_strEv.call(paramInt2), i6) != 0) {
/*     */         break label762;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       _ZNSaIcEC1Ev.call(i5);
/* 111 */       _ZNSsC1EPKcRKSaIcE.call(i11, 23520, i5);
/* 112 */       _ZNSaIcED1Ev.call(i5);
/* 113 */       if (ffgky.call(MainMemory.getI32(i7), 31, _ZNKSs5c_strEv.call(i11), i8, i13, i6) != 0) {
/*     */         break label467;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       MainMemory.setI32(i6, 0);
/* 124 */       _ZNSsaSEPKc.call(i11, 24096);
/* 125 */       ffgky.call(MainMemory.getI32(i7), 42, _ZNKSs5c_strEv.call(i11), i10, i13, i6);
/* 126 */       MainMemory.setI32(i6, 0);
/* 127 */       _ZNSsaSEPKc.call(i11, 28256);
/* 128 */       ffgky.call(MainMemory.getI32(i7), 42, _ZNKSs5c_strEv.call(i11), i9, 0, i6);
/* 129 */       i15 = MainMemory.getI32(i8);
/* 130 */       MainMemory.setI32(paramInt1 + 68, i15);
/* 131 */       f1 = MainMemory.getF32(i9);
/* 132 */       MainMemory.setF32(paramInt1 + 76, f1);
/* 133 */       f2 = MainMemory.getF32(i10);
/* 134 */       MainMemory.setF32(paramInt1 + 72, f2);
/* 135 */       MainMemory.setI8(paramInt3 + 209, (byte)1);
/* 136 */       MainMemory.setI32(paramInt3 + 216, i15);
/* 137 */       MainMemory.setF32(paramInt3 + 220, f1);
/* 138 */       MainMemory.setF32(paramInt3 + 224, f2);
/* 139 */       f3 = i15;
/* 140 */       f1 = f3 * f1;
/* 141 */       f1 += f2;
/* 142 */       MainMemory.setF32(paramInt3 + 212, f1);
/*     */       
/*     */       break label504;
/*     */       
/*     */       label467:
/* 147 */       MainMemory.setI8(paramInt3 + 209, (byte)0);
/* 148 */       i14 = paramInt3 + 244;
/* 149 */       if (MainMemory.getI8(i14) != 0) {
/*     */         break label649;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label504:
/*     */       
/*     */ 
/*     */ 
/* 159 */       MainMemory.setI32(i6, 0);
/* 160 */       ffclos.call(MainMemory.getI32(i7), i6);
/* 161 */       if (MainMemory.getI32(i6) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         _ZNSaIcEC1Ev.call(m);
/* 172 */         _ZNSsC1EPKcRKSaIcE.call(n, 63136, m);
/* 173 */         _ZNSaIcEC1Ev.call(j);
/* 174 */         _ZNSsC1EPKcRKSaIcE.call(k, 50176, j);
/* 175 */         _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 176 */         _ZNSsD1Ev.call(k);
/* 177 */         _ZNSaIcED1Ev.call(j);
/* 178 */         _ZNSsD1Ev.call(n);
/* 179 */         _ZNSaIcED1Ev.call(m);
/* 180 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 186 */       if (i13 == 0) {
/* 187 */         i15 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 197 */         SystemLibrary.deletearray(i13);
/* 198 */         i15 = 0;
/*     */         
/*     */         break label744;
/*     */         
/*     */         label649:
/* 203 */         MainMemory.setI8(i14, (byte)0);
/* 204 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i12, 24);
/* 205 */         _ZNSaIcEC1Ev.call(i3);
/* 206 */         _ZNSsC1EPKcRKSaIcE.call(i4, 123680, i3);
/* 207 */         _ZNSaIcEC1Ev.call(i1);
/* 208 */         _ZNSsC1EPKcRKSaIcE.call(i2, 50176, i1);
/* 209 */         _ZN7duchamp14duchampWarningESsSs.call(i2, i4);
/* 210 */         _ZNSsD1Ev.call(i2);
/* 211 */         _ZNSaIcED1Ev.call(i1);
/* 212 */         _ZNSsD1Ev.call(i4);
/* 213 */         _ZNSaIcED1Ev.call(i3);
/* 214 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/* 215 */         _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i12);
/* 216 */         i15 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label744:
/*     */       
/*     */ 
/* 223 */       _ZNSsD1Ev.call(i11);
/* 224 */       i = i15;
/*     */       
/*     */ 
/*     */       break label783;
/*     */       
/*     */       label762:
/*     */       
/* 231 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i6));
/* 232 */       i = 1;
/*     */       
/*     */ 
/*     */       label783:
/*     */       
/*     */ 
/* 238 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 243 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader13readBLANKinfoESsRNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */