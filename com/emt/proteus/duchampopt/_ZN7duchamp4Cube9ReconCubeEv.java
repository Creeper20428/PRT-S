/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube9ReconCubeEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 774;
/*  24 */   public static final Function _instance = new _ZN7duchamp4Cube9ReconCubeEv();
/*  25 */   public final Function resolve() { return _instance; }
/*     */   
/*  27 */   public _ZN7duchamp4Cube9ReconCubeEv() { super("_ZN7duchamp4Cube9ReconCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  31 */     call(paramInt);
/*  32 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  37 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     int i9 = 0;
/*  61 */     int i10 = 0;
/*  62 */     int i11 = 0;
/*     */     
/*     */ 
/*  65 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       i = MainMemory.alloc(1);
/*  70 */       j = MainMemory.alloc(4);
/*  71 */       k = MainMemory.alloc(4);
/*  72 */       m = MainMemory.alloc(1);
/*  73 */       n = MainMemory.alloc(4);
/*  74 */       i1 = MainMemory.alloc(4);
/*  75 */       i2 = MainMemory.alloc(1);
/*  76 */       i3 = MainMemory.alloc(4);
/*  77 */       i4 = MainMemory.alloc(4);
/*  78 */       i5 = MainMemory.alloc(188);
/*  79 */       i6 = MainMemory.alloc(188);
/*  80 */       i7 = MainMemory.alloc(188);
/*  81 */       i8 = paramInt + 480;
/*  82 */       i9 = MainMemory.getI32(i8);
/*  83 */       i10 = MainMemory.getI32(paramInt + 652);
/*  84 */       if (MainMemory.getI32(i10) == -1) {
/*  85 */         i11 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  95 */         i11 = MainMemory.getI32(i10 + 4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       if (i11 >= i9) {
/*     */         break label328;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */       MainMemory.setI32(i8, i11);
/* 115 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i5, 24);
/* 116 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i5 + 8, 57504), i11), 73024), 71648), i11), 53952), 64288), i11), 14656);
/* 117 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i4, i5);
/* 118 */       _ZNSaIcEC1Ev.call(i2);
/* 119 */       _ZNSsC1EPKcRKSaIcE.call(i3, 54048, i2);
/* 120 */       _ZN7duchamp14duchampWarningESsSs.call(i3, i4);
/* 121 */       _ZNSsD1Ev.call(i3);
/* 122 */       _ZNSaIcED1Ev.call(i2);
/* 123 */       _ZNSsD1Ev.call(i4);
/* 124 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i5);
/* 125 */       i9 = i11;
/*     */       
/*     */ 
/*     */ 
/*     */       label328:
/*     */       
/*     */ 
/* 132 */       switch (i9)
/*     */       {
/*     */       case 1: 
/*     */         break label412;
/*     */         break;
/*     */       case 2: 
/*     */         break label398;
/*     */         break;
/*     */       case 3: 
/*     */         break;
/*     */       }
/*     */       
/* 144 */       _ZN7duchamp4Cube11ReconCube3DEv.call(paramInt);
/*     */       
/*     */ 
/*     */       break label652;
/*     */       
/*     */       label398:
/*     */       
/* 151 */       _ZN7duchamp4Cube11ReconCube2DEv.call(paramInt);
/*     */       
/*     */ 
/*     */       break label652;
/*     */       
/*     */       label412:
/*     */       
/* 158 */       _ZN7duchamp4Cube11ReconCube1DEv.call(paramInt);
/*     */       
/*     */ 
/*     */ 
/*     */       break label652;
/*     */       
/*     */ 
/* 165 */       if (i9 >= 1) {
/*     */         break label541;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i6, 24);
/* 176 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i6 + 8, 48224), i9), 112672);
/* 177 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i1, i6);
/* 178 */       _ZNSaIcEC1Ev.call(m);
/* 179 */       _ZNSsC1EPKcRKSaIcE.call(n, 54048, m);
/* 180 */       _ZN7duchamp14duchampWarningESsSs.call(n, i1);
/* 181 */       _ZNSsD1Ev.call(n);
/* 182 */       _ZNSaIcED1Ev.call(m);
/* 183 */       _ZNSsD1Ev.call(i1);
/* 184 */       MainMemory.setI32(i8, 1);
/* 185 */       _ZN7duchamp4Cube11ReconCube1DEv.call(paramInt);
/* 186 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i6);
/*     */       
/*     */ 
/*     */       break label652;
/*     */       
/*     */       label541:
/*     */       
/* 193 */       if (i9 <= 3) {
/*     */         break label647;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i7, 24);
/* 204 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(i7 + 8, 48224), i9), 112736);
/* 205 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, i7);
/* 206 */       _ZNSaIcEC1Ev.call(i);
/* 207 */       _ZNSsC1EPKcRKSaIcE.call(j, 54048, i);
/* 208 */       _ZN7duchamp14duchampWarningESsSs.call(j, k);
/* 209 */       _ZNSsD1Ev.call(j);
/* 210 */       _ZNSaIcED1Ev.call(i);
/* 211 */       _ZNSsD1Ev.call(k);
/* 212 */       MainMemory.setI32(i8, 3);
/* 213 */       _ZN7duchamp4Cube11ReconCube3DEv.call(paramInt);
/* 214 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i7);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label647:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label652:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube9ReconCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */