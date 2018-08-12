/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*     */ 
/*     */ public final class _ZN7duchamp5Param13defaultValuesEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 240;
/*  20 */   public static final Function _instance = new _ZN7duchamp5Param13defaultValuesEv();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public _ZN7duchamp5Param13defaultValuesEv() { super("_ZN7duchamp5Param13defaultValuesEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  27 */     call(paramInt);
/*  28 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*     */     
/*     */ 
/*  49 */     int n = MainMemory.alloc_base_line();
/*     */     try
/*     */     {
/*  52 */       i = MainMemory.alloc(4);
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       k = MainMemory.alloc(1);
/*  55 */       m = MainMemory.alloc(4);
/*  56 */       _ZNSaIcEC1Ev.call(k);
/*  57 */       _ZNSsC1EPKcRKSaIcE.call(m, 37504, k);
/*  58 */       _ZNSaIcED1Ev.call(k);
/*  59 */       _ZNSsaSEPKc.call(paramInt + 4, 12960);
/*  60 */       MainMemory.setI8(paramInt + 8, (byte)0);
/*  61 */       _ZNSsC1ERKSs.call(j, m);
/*  62 */       _ZNSsaSERKSs.call(paramInt + 16, j);
/*  63 */       _ZNSsD1Ev.call(j);
/*  64 */       MainMemory.setI8(paramInt + 60, (byte)0);
/*  65 */       _ZNSsaSEPKc.call(paramInt + 64, 12960);
/*  66 */       MainMemory.setI8(paramInt + 68, (byte)0);
/*  67 */       _ZNSsaSEPKc.call(paramInt + 72, 12960);
/*  68 */       MainMemory.setI8(paramInt + 76, (byte)0);
/*  69 */       _ZNSsaSEPKc.call(paramInt + 80, 12960);
/*  70 */       MainMemory.setI8(paramInt + 84, (byte)0);
/*  71 */       _ZNSsaSEPKc.call(paramInt + 88, 62176);
/*  72 */       _ZNSsaSEPKc.call(paramInt + 92, 62208);
/*  73 */       MainMemory.setI8(paramInt + 96, (byte)0);
/*  74 */       _ZNSsaSEPKc.call(paramInt + 100, 62240);
/*  75 */       MainMemory.setI8(paramInt + 104, (byte)1);
/*  76 */       _ZNSsaSEPKc.call(paramInt + 108, 60640);
/*  77 */       MainMemory.setI8(paramInt + 112, (byte)0);
/*  78 */       _ZNSsaSEPKc.call(paramInt + 116, 62272);
/*  79 */       MainMemory.setI8(paramInt + 120, (byte)0);
/*  80 */       _ZNSsaSEPKc.call(paramInt + 124, 12960);
/*  81 */       MainMemory.setI8(paramInt + 128, (byte)0);
/*  82 */       _ZNSsaSEPKc.call(paramInt + 132, 12960);
/*  83 */       MainMemory.setI8(paramInt + 136, (byte)0);
/*  84 */       MainMemory.setI8(paramInt + 137, (byte)0);
/*  85 */       _ZNSsaSEPKc.call(paramInt + 140, 12960);
/*  86 */       MainMemory.setI8(paramInt + 144, (byte)0);
/*  87 */       _ZNSsaSEPKc.call(paramInt + 148, 12960);
/*  88 */       MainMemory.setI8(paramInt + 152, (byte)0);
/*  89 */       _ZNSsaSEPKc.call(paramInt + 156, 12960);
/*  90 */       MainMemory.setI8(paramInt + 160, (byte)0);
/*  91 */       _ZNSsaSEPKc.call(paramInt + 164, 62304);
/*  92 */       MainMemory.setI8(paramInt + 168, (byte)0);
/*  93 */       _ZNSsaSEPKc.call(paramInt + 172, 62336);
/*  94 */       _ZNSsaSEPKc.call(paramInt + 176, 36960);
/*  95 */       MainMemory.setI8(paramInt + 180, (byte)1);
/*  96 */       _ZNSsaSEPKc.call(paramInt + 184, 67104);
/*  97 */       _ZNSsaSEPKc.call(paramInt + 188, 63552);
/*  98 */       MainMemory.setI8(paramInt + 192, (byte)1);
/*  99 */       MainMemory.setI32(paramInt + 196, 3);
/* 100 */       MainMemory.setI32(paramInt + 200, 3);
/* 101 */       MainMemory.setI32(paramInt + 204, 2);
/* 102 */       MainMemory.setI8(paramInt + 209, (byte)0);
/* 103 */       MainMemory.setF32(paramInt + 212, -8.00061F);
/* 104 */       MainMemory.setI32(paramInt + 216, 1);
/* 105 */       MainMemory.setF32(paramInt + 220, -8.00061F);
/* 106 */       MainMemory.setF32(paramInt + 224, 0.0F);
/* 107 */       _ZNSsaSEPKc.call(paramInt + 228, 12960);
/* 108 */       MainMemory.setI8(paramInt + 232, (byte)0);
/* 109 */       MainMemory.setI32(paramInt + 236, 112);
/* 110 */       MainMemory.setI32(paramInt + 240, 75);
/* 111 */       MainMemory.setF32(paramInt + 292, 0.0F);
/* 112 */       MainMemory.setF32(paramInt + 296, 0.0F);
/* 113 */       _ZN7duchamp11DuchampBeam5emptyEv.call(paramInt + 300);
/* 114 */       _ZNSsaSEPKc.call(paramInt + 324, 37664);
/* 115 */       MainMemory.setI8(paramInt + 244, (byte)0);
/* 116 */       MainMemory.setI8(paramInt + 245, (byte)0);
/* 117 */       MainMemory.setI32(paramInt + 248, 0);
/* 118 */       MainMemory.setI32(paramInt + 252, 0);
/* 119 */       MainMemory.setI32(paramInt + 256, 0);
/* 120 */       MainMemory.setI32(paramInt + 260, 0);
/* 121 */       MainMemory.setI32(paramInt + 268, 0);
/* 122 */       MainMemory.setI32(paramInt + 272, 0);
/* 123 */       MainMemory.setI32(paramInt + 276, 0);
/* 124 */       MainMemory.setI32(paramInt + 280, 0);
/* 125 */       MainMemory.setI8(paramInt + 284, (byte)0);
/* 126 */       MainMemory.setI8(paramInt + 208, (byte)0);
/* 127 */       MainMemory.setI8(paramInt + 328, (byte)0);
/* 128 */       MainMemory.setF32(paramInt + 332, 3.0F);
/* 129 */       MainMemory.setI8(paramInt + 336, (byte)0);
/* 130 */       MainMemory.setF32(paramInt + 340, 0.0F);
/* 131 */       MainMemory.setI8(paramInt + 344, (byte)0);
/* 132 */       MainMemory.setF32(paramInt + 348, 0.01F);
/* 133 */       MainMemory.setI32(paramInt + 352, 2);
/* 134 */       MainMemory.setI8(paramInt + 356, (byte)0);
/* 135 */       _ZNSsC1ERKSs.call(i, m);
/* 136 */       _ZNSsaSERKSs.call(paramInt + 364, i);
/* 137 */       _ZNSsD1Ev.call(i);
/* 138 */       MainMemory.setI8(paramInt + 408, (byte)1);
/* 139 */       MainMemory.setF32(paramInt + 412, 3.0F);
/* 140 */       MainMemory.setF32(paramInt + 416, 0.0F);
/* 141 */       MainMemory.setI8(paramInt + 420, (byte)0);
/* 142 */       MainMemory.setI8(paramInt + 421, (byte)0);
/* 143 */       _ZNSsaSEPKc.call(paramInt + 424, 43360);
/* 144 */       MainMemory.setI32(paramInt + 428, 5);
/* 145 */       MainMemory.setF32(paramInt + 432, 3.0F);
/* 146 */       MainMemory.setF32(paramInt + 436, -1.0F);
/* 147 */       MainMemory.setF32(paramInt + 440, 0.0F);
/* 148 */       MainMemory.setI8(paramInt + 444, (byte)0);
/* 149 */       MainMemory.setI32(paramInt + 448, 1);
/* 150 */       MainMemory.setI32(paramInt + 452, 1);
/* 151 */       MainMemory.setI32(paramInt + 456, 0);
/* 152 */       MainMemory.setF32(paramInt + 460, 4.0F);
/* 153 */       MainMemory.setI32(paramInt + 508, 1);
/* 154 */       _ZN7duchamp6Filter6defineEi.call(paramInt + 464, 1);
/* 155 */       MainMemory.setI8(paramInt + 516, (byte)1);
/* 156 */       MainMemory.setF32(paramInt + 520, 3.0F);
/* 157 */       MainMemory.setF32(paramInt + 524, 7.0F);
/* 158 */       MainMemory.setI32(paramInt + 528, 3);
/* 159 */       MainMemory.setI32(paramInt + 288, 2);
/* 160 */       MainMemory.setI32(paramInt + 532, 4);
/* 161 */       MainMemory.setI8(paramInt + 536, (byte)0);
/* 162 */       MainMemory.setI8(paramInt + 537, (byte)1);
/* 163 */       _ZNSsaSEPKc.call(paramInt + 540, 18784);
/* 164 */       _ZNSsaSEPKc.call(paramInt + 544, 18816);
/* 165 */       _ZNSsaSEPKc.call(paramInt + 548, 42784);
/* 166 */       _ZNSsaSEPKc.call(paramInt + 552, 16256);
/* 167 */       MainMemory.setI8(paramInt + 556, (byte)1);
/* 168 */       MainMemory.setI8(paramInt + 557, (byte)1);
/* 169 */       MainMemory.setI8(paramInt + 558, (byte)1);
/* 170 */       _ZNSsD1Ev.call(m);
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/* 178 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param13defaultValuesEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */