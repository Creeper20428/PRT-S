/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube14SpectralSmoothEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2084;
/*  28 */   public static final Function _instance = new _ZN7duchamp4Cube14SpectralSmoothEv();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public _ZN7duchamp4Cube14SpectralSmoothEv() { super("_ZN7duchamp4Cube14SpectralSmoothEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  35 */     call(paramInt);
/*  36 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  41 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     call(i);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*  70 */     int i15 = 0;
/*  71 */     int i16 = 0;
/*  72 */     float f = 0.0F;
/*  73 */     int i17 = 0;
/*  74 */     int i18 = 0;
/*  75 */     int i19 = 0;
/*  76 */     int i20 = 0;
/*  77 */     int i21 = 0;
/*  78 */     int i22 = 0;
/*  79 */     int i23 = 0;
/*  80 */     int i24 = 0;
/*     */     
/*     */ 
/*  83 */     int i25 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  87 */       i = MainMemory.alloc(1);
/*  88 */       j = MainMemory.alloc(4);
/*  89 */       k = MainMemory.alloc(1);
/*  90 */       m = MainMemory.alloc(4);
/*  91 */       n = MainMemory.alloc(1);
/*  92 */       i1 = MainMemory.alloc(4);
/*  93 */       i2 = MainMemory.alloc(4);
/*  94 */       i3 = MainMemory.alloc(20);
/*  95 */       i4 = MainMemory.alloc(16);
/*  96 */       i5 = paramInt + 8;
/*  97 */       i6 = MainMemory.getI32(i5);
/*  98 */       i7 = MainMemory.getI32(i6 + 4) * MainMemory.getI32(i6);
/*  99 */       i8 = MainMemory.getI32(i6 + 8);
/* 100 */       _ZN11ProgressBarC1Ev.call(i3);
/* 101 */       i9 = paramInt + 632;
/* 102 */       if (MainMemory.getI8(i9) != 0) {
/*     */         break label943;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */       _ZNSsC1ERKSs.call(i2, paramInt + 456);
/* 113 */       i23 = _ZNKSs7compareEPKc.call(i2, 43360);
/* 114 */       _ZNSsD1Ev.call(i2);
/* 115 */       if (i23 != 0) {
/*     */         break label943;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       i10 = MainMemory.getI32(paramInt + 652);
/* 126 */       if (MainMemory.getI32(i10 + 752) <= -1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         if (MainMemory.getI32(i10 + 4) >= 3) {
/*     */           break label377;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         _ZNSaIcEC1Ev.call(n);
/* 147 */         _ZNSsC1EPKcRKSaIcE.call(i1, 134304, n);
/* 148 */         _ZNSaIcEC1Ev.call(k);
/* 149 */         _ZNSsC1EPKcRKSaIcE.call(m, 54016, k);
/* 150 */         _ZN7duchamp14duchampWarningESsSs.call(m, i1);
/* 151 */         _ZNSsD1Ev.call(m);
/* 152 */         _ZNSaIcED1Ev.call(k);
/* 153 */         _ZNSsD1Ev.call(i1);
/* 154 */         _ZNSaIcED1Ev.call(n);
/*     */         
/*     */         break label943;
/*     */       }
/*     */       label377:
/* 159 */       _ZN7HanningC1Ei.call(i4, MainMemory.getI32(paramInt + 460));
/* 160 */       i11 = SystemLibrary.newarray(MainMemory.getI32(MainMemory.getI32(i5) + 8) << 2);
/* 161 */       i12 = i11;
/* 162 */       i13 = paramInt + 590;
/* 163 */       if (MainMemory.getI8(i13) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 70752);
/* 174 */         _ZN11ProgressBar4initEi.call(i3, i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 180 */       i14 = paramInt + 20;
/* 181 */       i15 = paramInt + 32;
/* 182 */       i16 = paramInt + 628;
/* 183 */       i23 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 190 */         i24 = i23 + 1;
/* 191 */         if (i23 >= i7) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */         if (MainMemory.getI8(i13) == 0) {
/* 202 */           i20 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 212 */           _ZN11ProgressBar6updateEi.call(i3, i24);
/* 213 */           i20 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 220 */           i17 = i11 + (i20 << 2);
/* 221 */           if (i20 >= i8) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */           i22 = MainMemory.getI32(i14) + (i23 + i7 * i20 << 2);
/* 232 */           if (_ZN7duchamp5Param7isBlankERf.call(i15, i22) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 236 */             f = 0.0F;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 243 */             f = MainMemory.getF32(i22);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */           MainMemory.setF32(i17, f);
/* 252 */           i20 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 258 */         i17 = _ZN7Hanning6smoothEPfi.call(i4, i12, i8);
/* 259 */         i20 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 266 */           i21 = i23 + i7 * i20;
/* 267 */           i22 = i17 + (i20 << 2);
/* 268 */           if (i20 >= i8) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */           i18 = MainMemory.getI32(i14) + (i21 << 2);
/* 279 */           i19 = MainMemory.getI32(i16);
/* 280 */           if (_ZN7duchamp5Param7isBlankERf.call(i15, i18) != 0) {
/*     */             break label780;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 290 */           MainMemory.setF32(i19 + (i21 << 2), MainMemory.getF32(i22));
/*     */           
/*     */           break label800;
/*     */           
/*     */           label780:
/* 295 */           MainMemory.setF32(i19 + (i21 << 2), MainMemory.getF32(i18));
/*     */           
/*     */ 
/*     */           label800:
/*     */           
/*     */ 
/* 301 */           i20 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 307 */         if (i17 == 0) {
/* 308 */           i23 = i24;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 318 */           SystemLibrary.deletearray(i17);
/* 319 */           i23 = i24;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 324 */       MainMemory.setI8(i9, (byte)1);
/* 325 */       if (MainMemory.getI8(i13) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */         _ZNSaIcEC1Ev.call(i);
/* 336 */         _ZNSsC1EPKcRKSaIcE.call(j, 48256, i);
/* 337 */         _ZN11ProgressBar9fillSpaceESs.call(i3, j);
/* 338 */         _ZNSsD1Ev.call(j);
/* 339 */         _ZNSaIcED1Ev.call(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 345 */       if (i11 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */         SystemLibrary.deletearray(i11);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 361 */       _ZN7HanningD1Ev.call(i4);
/*     */       
/*     */ 
/*     */       label943:
/*     */       
/*     */ 
/* 367 */       _ZN11ProgressBarD1Ev.call(i3);
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
/* 378 */       MainMemory.dealloc_generated(i25);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14SpectralSmoothEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */