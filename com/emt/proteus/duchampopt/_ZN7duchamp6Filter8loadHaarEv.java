/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ public final class _ZN7duchamp6Filter8loadHaarEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 500;
/*  15 */   public static final Function _instance = new _ZN7duchamp6Filter8loadHaarEv();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp6Filter8loadHaarEv() { super("_ZN7duchamp6Filter8loadHaarEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     call(paramInt);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*  54 */     int i12 = 0;
/*  55 */     int i13 = 0;
/*  56 */     int i14 = 0;
/*  57 */     int i15 = 0;
/*  58 */     int i16 = 0;
/*  59 */     int i17 = 0;
/*  60 */     double d = 0.0D;
/*     */     
/*     */ 
/*  63 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       i = MainMemory.alloc(4);
/*  68 */       j = MainMemory.alloc(4);
/*  69 */       k = MainMemory.alloc(8);
/*  70 */       m = MainMemory.alloc(8);
/*  71 */       n = MainMemory.alloc(8);
/*  72 */       i1 = MainMemory.alloc(8);
/*  73 */       i2 = MainMemory.alloc(56);
/*  74 */       i3 = MainMemory.alloc(56);
/*  75 */       _ZNSsaSEPKc.call(paramInt + 4, 52416);
/*  76 */       MainMemory.setF64(i1, 0.0D);
/*  77 */       i4 = paramInt + 12;
/*  78 */       i5 = MainMemory.getI32(i4);
/*  79 */       i6 = paramInt + 8;
/*  80 */       i7 = MainMemory.getI32(i6);
/*  81 */       i8 = i5 - i7 >> 3;
/*  82 */       if (!MathUtils.ugt(i8, 3)) {
/*     */         break label218;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */       MainMemory.setI32(i4, i7 + 24);
/*  93 */       i1 = i7;
/*     */       
/*     */       break label245;
/*     */       
/*     */       label218:
/*  98 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(paramInt + 8, i5, 3 - i8, i1);
/*  99 */       i1 = MainMemory.getI32(i6);
/*     */       
/*     */ 
/*     */ 
/*     */       label245:
/*     */       
/*     */ 
/*     */ 
/* 107 */       MainMemory.setF64(i1, 0.0D);
/* 108 */       MainMemory.setF64(MainMemory.getI32(i6) + 8, 0.5D);
/* 109 */       MainMemory.setF64(MainMemory.getI32(i6) + 16, 0.5D);
/* 110 */       MainMemory.setI32(i, 0);
/* 111 */       i9 = paramInt + 36;
/* 112 */       i10 = MainMemory.getI32(i9);
/* 113 */       i11 = paramInt + 32;
/* 114 */       i12 = MainMemory.getI32(i11);
/* 115 */       i8 = i10 - i12 >> 2;
/* 116 */       if (!MathUtils.ugt(i8, 3)) {
/*     */         break label361;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       MainMemory.setI32(i9, i12 + 12);
/*     */       
/*     */       break label380;
/*     */       
/*     */       label361:
/* 131 */       _ZNSt6vectorIPS_IdSaIdEESaIS2_EE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPS2_S4_EEjRKS2_.call(paramInt + 32, i10, 3 - i8, i);
/*     */       
/*     */ 
/*     */       label380:
/*     */       
/*     */ 
/* 137 */       MainMemory.setI32(j, 0);
/* 138 */       i13 = paramInt + 24;
/* 139 */       i14 = MainMemory.getI32(i13);
/* 140 */       i15 = paramInt + 20;
/* 141 */       i16 = MainMemory.getI32(i15);
/* 142 */       i8 = i14 - i16 >> 2;
/* 143 */       if (!MathUtils.ugt(i8, 3)) {
/*     */         break label465;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       MainMemory.setI32(i13, i16 + 12);
/* 154 */       j = i16;
/*     */       
/*     */       break label490;
/*     */       
/*     */       label465:
/* 159 */       _ZNSt6vectorIjSaIjEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPjS1_EEjRKj.call(paramInt + 20, i14, 3 - i8, j);
/* 160 */       j = MainMemory.getI32(i15);
/*     */       
/*     */ 
/*     */ 
/*     */       label490:
/*     */       
/*     */ 
/*     */ 
/* 168 */       MainMemory.setI32(j, 6);
/* 169 */       MainMemory.setF64(i2, 1.0D);
/* 170 */       MainMemory.setF64(i2 + 8, 0.70716781D);
/* 171 */       MainMemory.setF64(i2 + 16, 0.5D);
/* 172 */       MainMemory.setF64(i2 + 24, 0.353553391D);
/* 173 */       MainMemory.setF64(i2 + 32, 0.25D);
/* 174 */       MainMemory.setF64(i2 + 40, 0.176776695D);
/* 175 */       MainMemory.setF64(i2 + 48, 0.125D);
/* 176 */       i17 = MainMemory.getI32(MainMemory.getI32(i11));
/* 177 */       MainMemory.setF64(k, 0.0D);
/* 178 */       i6 = i17 + 4;
/* 179 */       i1 = MainMemory.getI32(i6);
/* 180 */       i5 = MainMemory.getI32(i17);
/* 181 */       i8 = i1 - i5 >> 3;
/* 182 */       if (!MathUtils.ugt(i8, 7)) {
/*     */         break label661;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */       MainMemory.setI32(i6, i5 + 56);
/* 193 */       d = 1.0D;
/* 194 */       i8 = 0;
/*     */       
/*     */       break label685;
/*     */       
/*     */       label661:
/* 199 */       _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i17, i1, 7 - i8, k);
/* 200 */       d = 1.0D;
/* 201 */       i8 = 0;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label685:
/*     */         
/*     */ 
/* 209 */         MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i11))) + (i8 << 3), d);
/* 210 */         i8 += 1;
/* 211 */         if (i8 != 19) {
/*     */           break label1199;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */         MainMemory.setI32(MainMemory.getI32(i15) + 4, 6);
/* 222 */         MainMemory.setF64(i3, 1.0D);
/* 223 */         MainMemory.setF64(i3 + 8, 0.433012702D);
/* 224 */         MainMemory.setF64(i3 + 16, 0.216506351D);
/* 225 */         MainMemory.setF64(i3 + 24, 0.108253175D);
/* 226 */         MainMemory.setF64(i3 + 32, 0.0541265877D);
/* 227 */         MainMemory.setF64(i3 + 40, 0.0270632939D);
/* 228 */         MainMemory.setF64(i3 + 48, 0.0135316469D);
/* 229 */         i17 = MainMemory.getI32(MainMemory.getI32(i11) + 4);
/* 230 */         MainMemory.setF64(m, 0.0D);
/* 231 */         i6 = i17 + 4;
/* 232 */         k = MainMemory.getI32(i6);
/* 233 */         i1 = MainMemory.getI32(i17);
/* 234 */         i8 = k - i1 >> 3;
/* 235 */         if (!MathUtils.ugt(i8, 7)) {
/*     */           break label910;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */         MainMemory.setI32(i6, i1 + 56);
/* 246 */         d = 1.0D;
/* 247 */         i8 = 0;
/*     */         
/*     */         break label934;
/*     */         
/*     */         label910:
/* 252 */         _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i17, k, 7 - i8, m);
/* 253 */         d = 1.0D;
/* 254 */         i8 = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */           label934:
/*     */           
/*     */ 
/* 262 */           MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i11) + 4)) + (i8 << 3), d);
/* 263 */           i8 += 1;
/* 264 */           if (i8 != 12) {
/*     */             break label1177;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */           MainMemory.setI32(MainMemory.getI32(i15) + 8, 8);
/* 275 */           i17 = MainMemory.getI32(MainMemory.getI32(i11) + 8);
/* 276 */           MainMemory.setF64(n, 0.0D);
/* 277 */           i6 = i17 + 4;
/* 278 */           m = MainMemory.getI32(i6);
/* 279 */           k = MainMemory.getI32(i17);
/* 280 */           i8 = m - k >> 3;
/* 281 */           if (!MathUtils.ugt(i8, 9)) {
/*     */             break label1087;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */           MainMemory.setI32(i6, k + 72);
/* 292 */           i8 = 0;
/*     */           
/*     */           break label1109;
/*     */           
/*     */           label1087:
/* 297 */           _ZNSt6vectorIdSaIdEE14_M_fill_insertEN9__gnu_cxx17__normal_iteratorIPdS1_EEjRKd.call(i17, m, 9 - i8, n);
/* 298 */           i8 = 0;
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/*     */             label1109:
/*     */             
/* 305 */             MainMemory.setF64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(i11) + 8)) + (i8 << 3), MainMemory.getF64(141984 + (i8 << 3)));
/* 306 */             i8 += 1;
/* 307 */             if (i8 == 12) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */           break;
/*     */           
/*     */ 
/*     */           label1177:
/*     */           
/*     */ 
/* 324 */           d = MainMemory.getF64(i3 + (i8 << 3));
/*     */         }
/*     */         
/*     */ 
/*     */         label1199:
/*     */         
/*     */ 
/* 331 */         d = MainMemory.getF64(i2 + (i8 << 3));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 342 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Filter8loadHaarEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */