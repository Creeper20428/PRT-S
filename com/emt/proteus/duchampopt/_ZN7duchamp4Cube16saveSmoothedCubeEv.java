/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube16saveSmoothedCubeEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2025;
/*  28 */   public static final Function _instance = new _ZN7duchamp4Cube16saveSmoothedCubeEv();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public _ZN7duchamp4Cube16saveSmoothedCubeEv() { super("_ZN7duchamp4Cube16saveSmoothedCubeEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  35 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  40 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int j = call(i);
/*  44 */     paramFrame.setI32(paramInt1, j);
/*  45 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  50 */     int i = 0;
/*     */     
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
/*  72 */     int i17 = 0;
/*  73 */     int i18 = 0;
/*  74 */     int i19 = 0;
/*  75 */     int i20 = 0;
/*  76 */     int i21 = 0;
/*  77 */     int i22 = 0;
/*  78 */     int i23 = 0;
/*  79 */     int i24 = 0;
/*  80 */     int i25 = 0;
/*  81 */     int i26 = 0;
/*  82 */     int i27 = 0;
/*  83 */     int i28 = 0;
/*  84 */     int i29 = 0;
/*  85 */     long l = 0L;
/*  86 */     int i30 = 0;
/*  87 */     int i31 = 0;
/*     */     
/*     */ 
/*  90 */     int i32 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  94 */       j = MainMemory.alloc(1);
/*  95 */       k = MainMemory.alloc(4);
/*  96 */       m = MainMemory.alloc(1);
/*  97 */       n = MainMemory.alloc(4);
/*  98 */       i1 = MainMemory.alloc(1);
/*  99 */       i2 = MainMemory.alloc(4);
/* 100 */       i3 = MainMemory.alloc(1);
/* 101 */       i4 = MainMemory.alloc(4);
/* 102 */       i5 = MainMemory.alloc(1);
/* 103 */       i6 = MainMemory.alloc(4);
/* 104 */       i7 = MainMemory.alloc(1);
/* 105 */       i8 = MainMemory.alloc(4);
/* 106 */       i9 = MainMemory.alloc(1);
/* 107 */       i10 = MainMemory.alloc(4);
/* 108 */       i11 = MainMemory.alloc(1);
/* 109 */       i12 = MainMemory.alloc(4);
/* 110 */       i13 = MainMemory.alloc(1);
/* 111 */       i14 = MainMemory.alloc(4);
/* 112 */       i15 = MainMemory.alloc(1);
/* 113 */       i16 = MainMemory.alloc(4);
/* 114 */       i17 = MainMemory.alloc(4);
/* 115 */       i18 = MainMemory.alloc(1);
/* 116 */       i19 = MainMemory.alloc(4);
/* 117 */       i20 = MainMemory.alloc(1);
/* 118 */       i21 = MainMemory.alloc(4);
/* 119 */       i22 = MainMemory.alloc(4);
/* 120 */       i23 = MainMemory.alloc(4);
/* 121 */       i24 = MainMemory.alloc(4);
/* 122 */       i25 = MainMemory.alloc(4);
/* 123 */       i26 = MainMemory.alloc(4);
/* 124 */       i27 = MainMemory.alloc(4);
/* 125 */       MainMemory.setF32(i23, MainMemory.getF32(paramInt + 244));
/* 126 */       MainMemory.setI32(i24, 0);
/* 127 */       i28 = paramInt + 32;
/* 128 */       _ZN7duchamp5Param16getFullImageFileEv.call(i22, i28);
/* 129 */       i29 = ffopentest.call(i25, _ZNKSs5c_strEv.call(i22), i24) == 0 ? 1 : 0;
/* 130 */       _ZNSsD1Ev.call(i22);
/* 131 */       if (i29 == 0) {
/*     */         break label1079;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */       if (MainMemory.getI8(paramInt + 169) != 0) {
/*     */         break label410;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1146;
/*     */       
/*     */       label410:
/*     */       
/* 158 */       _ZN7duchamp5Param16outputSmoothFileEv.call(i17, i28);
/* 159 */       _ZStplIcSt11char_traitsIcESaIcEESbIT_T0_T1_EPKS3_RKS6_.call(i27, 13088, i17);
/* 160 */       _ZNSsD1Ev.call(i17);
/* 161 */       MainMemory.setI32(i24, 0);
/* 162 */       if (ffinit.call(i26, _ZNKSs5c_strEv.call(i27), i24) != 0) {
/*     */         break label1002;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */       MainMemory.setI32(i24, 0);
/* 173 */       if (ffmahd.call(MainMemory.getI32(i25), 1, 0, i24) != 0) {
/*     */         break label925;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */       MainMemory.setI32(i24, 0);
/* 184 */       if (ffcphd.call(MainMemory.getI32(i25), MainMemory.getI32(i26), i24) != 0) {
/*     */         break label848;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */       _ZN7duchamp21writeSmoothHeaderInfoEP8fitsfileRNS_5ParamE.call(MainMemory.getI32(i26), i28);
/* 195 */       l = MainMemory.getI32(paramInt + 16);
/* 196 */       i30 = MainMemory.getI32(i26);
/* 197 */       i31 = MainMemory.getI32(paramInt + 628);
/* 198 */       if (MainMemory.getI8(paramInt + 241) != 0) {
/*     */         break label623;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */       ffppr.call(i30, 42, 1L, l, i31, i24);
/*     */       
/*     */       break label645;
/*     */       
/*     */       label623:
/* 213 */       ffppn.call(i30, 42, 1L, l, i31, i23, i24);
/*     */       
/*     */ 
/*     */       label645:
/*     */       
/*     */ 
/* 219 */       if (MainMemory.getI32(i24) != 0) {
/*     */         break label771;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */       MainMemory.setI32(i24, 0);
/* 230 */       if (ffclos.call(MainMemory.getI32(i26), i24) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */         _ZNSaIcEC1Ev.call(m);
/* 241 */         _ZNSsC1EPKcRKSaIcE.call(n, 61472, m);
/* 242 */         _ZNSaIcEC1Ev.call(j);
/* 243 */         _ZNSsC1EPKcRKSaIcE.call(k, 57632, j);
/* 244 */         _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i24), k, n);
/* 245 */         _ZNSsD1Ev.call(k);
/* 246 */         _ZNSaIcED1Ev.call(j);
/* 247 */         _ZNSsD1Ev.call(n);
/* 248 */         _ZNSaIcED1Ev.call(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 254 */       _ZNSsD1Ev.call(i27);
/* 255 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1146;
/*     */       
/*     */       label771:
/*     */       
/* 262 */       _ZNSaIcEC1Ev.call(i3);
/* 263 */       _ZNSsC1EPKcRKSaIcE.call(i4, 74944, i3);
/* 264 */       _ZNSaIcEC1Ev.call(i1);
/* 265 */       _ZNSsC1EPKcRKSaIcE.call(i2, 55488, i1);
/* 266 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i24), i2, i4);
/* 267 */       _ZNSsD1Ev.call(i2);
/* 268 */       _ZNSaIcED1Ev.call(i1);
/* 269 */       _ZNSsD1Ev.call(i4);
/* 270 */       _ZNSaIcED1Ev.call(i3);
/* 271 */       _ZNSsD1Ev.call(i27);
/* 272 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1146;
/*     */       
/*     */       label848:
/*     */       
/* 279 */       _ZNSaIcEC1Ev.call(i7);
/* 280 */       _ZNSsC1EPKcRKSaIcE.call(i8, 70848, i7);
/* 281 */       _ZNSaIcEC1Ev.call(i5);
/* 282 */       _ZNSsC1EPKcRKSaIcE.call(i6, 57632, i5);
/* 283 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i24), i6, i8);
/* 284 */       _ZNSsD1Ev.call(i6);
/* 285 */       _ZNSaIcED1Ev.call(i5);
/* 286 */       _ZNSsD1Ev.call(i8);
/* 287 */       _ZNSaIcED1Ev.call(i7);
/* 288 */       _ZNSsD1Ev.call(i27);
/* 289 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1146;
/*     */       
/*     */       label925:
/*     */       
/* 296 */       _ZNSaIcEC1Ev.call(i11);
/* 297 */       _ZNSsC1EPKcRKSaIcE.call(i12, 90976, i11);
/* 298 */       _ZNSaIcEC1Ev.call(i9);
/* 299 */       _ZNSsC1EPKcRKSaIcE.call(i10, 57632, i9);
/* 300 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i24), i10, i12);
/* 301 */       _ZNSsD1Ev.call(i10);
/* 302 */       _ZNSaIcED1Ev.call(i9);
/* 303 */       _ZNSsD1Ev.call(i12);
/* 304 */       _ZNSaIcED1Ev.call(i11);
/* 305 */       _ZNSsD1Ev.call(i27);
/* 306 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1146;
/*     */       
/*     */       label1002:
/*     */       
/* 313 */       _ZNSaIcEC1Ev.call(i15);
/* 314 */       _ZNSsC1EPKcRKSaIcE.call(i16, 81824, i15);
/* 315 */       _ZNSaIcEC1Ev.call(i13);
/* 316 */       _ZNSsC1EPKcRKSaIcE.call(i14, 57632, i13);
/* 317 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i24), i14, i16);
/* 318 */       _ZNSsD1Ev.call(i14);
/* 319 */       _ZNSaIcED1Ev.call(i13);
/* 320 */       _ZNSsD1Ev.call(i16);
/* 321 */       _ZNSaIcED1Ev.call(i15);
/* 322 */       _ZNSsD1Ev.call(i27);
/* 323 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1146;
/*     */       
/*     */       label1079:
/*     */       
/* 330 */       _ZNSaIcEC1Ev.call(i20);
/* 331 */       _ZNSsC1EPKcRKSaIcE.call(i21, 73056, i20);
/* 332 */       _ZNSaIcEC1Ev.call(i18);
/* 333 */       _ZNSsC1EPKcRKSaIcE.call(i19, 57632, i18);
/* 334 */       _ZN7duchamp16duchampFITSerrorEiSsSs.call(MainMemory.getI32(i24), i19, i21);
/* 335 */       _ZNSsD1Ev.call(i19);
/* 336 */       _ZNSaIcED1Ev.call(i18);
/* 337 */       _ZNSsD1Ev.call(i21);
/* 338 */       _ZNSaIcED1Ev.call(i20);
/* 339 */       i = 1;
/*     */       
/*     */ 
/*     */       label1146:
/*     */       
/*     */ 
/* 345 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 350 */       MainMemory.dealloc_generated(i32);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16saveSmoothedCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */