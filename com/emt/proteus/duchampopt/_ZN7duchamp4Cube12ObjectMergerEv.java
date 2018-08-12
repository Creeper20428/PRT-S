/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt20__throw_out_of_rangePKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEj;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube12ObjectMergerEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1758;
/*  28 */   public static final Function _instance = new _ZN7duchamp4Cube12ObjectMergerEv();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public _ZN7duchamp4Cube12ObjectMergerEv() { super("_ZN7duchamp4Cube12ObjectMergerEv", 1, false); }
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
/*     */     
/*     */ 
/*  67 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       i = MainMemory.alloc(276);
/*  72 */       i5 = MainMemory.alloc(276);
/*  73 */       j = MainMemory.alloc(12);
/*  74 */       k = MainMemory.alloc(76);
/*  75 */       m = paramInt + 28;
/*  76 */       n = MainMemory.getI32(m);
/*  77 */       i8 = MainMemory.getI32(n + 4) - MainMemory.getI32(n);
/*  78 */       i7 = i8 / 276;
/*  79 */       if (i8 <= 275) {
/*     */         break label1090;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       _ZN7duchamp9DetectionC1Ev.call(i5);
/*  90 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EEC2EjRKS1_RKS2_.call(j, i7, i5);
/*  91 */       _ZN7duchamp9DetectionD2Ev.call(i5);
/*  92 */       i8 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  99 */         n = MainMemory.getI32(m);
/* 100 */         if (i8 >= i7) {
/*     */           break label272;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         i5 = MainMemory.getI32(n);
/* 111 */         if (!MathUtils.ugt((MainMemory.getI32(n + 4) - i5) / 276, i8)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         _ZN7duchamp9DetectionaSERKS0_.call(MainMemory.getI32(j) + i8 * 276, i5 + i8 * 276);
/* 122 */         i8 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 128 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */       
/*     */ 
/*     */       label272:
/*     */       
/*     */ 
/* 134 */       i5 = MainMemory.getI32(n);
/* 135 */       i3 = n + 4;
/* 136 */       i6 = MainMemory.getI32(i3);
/* 137 */       if (i6 == i5) {
/*     */         break label376;
/*     */       } else {
/* 140 */         i7 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 149 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i5 + i7 * 276)), i5 + i7 * 276);
/* 150 */         i7 += 1;
/* 151 */         if (i5 + i7 * 276 == i6) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label376:
/*     */       
/*     */ 
/*     */ 
/* 162 */       MainMemory.setI32(i3, i5);
/* 163 */       i1 = paramInt + 568;
/* 164 */       if (MainMemory.getI8(i1) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         _ZN7duchamp12finaliseListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE.call(j, paramInt + 32);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 180 */       i2 = paramInt + 32;
/* 181 */       _ZN7duchamp9mergeListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE.call(j, i2);
/* 182 */       if (MainMemory.getI8(paramInt + 360) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         _ZN7duchamp12ObjectGrowerC1Ev.call(k);
/* 193 */         _ZN7duchamp12ObjectGrower6defineEPNS_4CubeE.call(k, paramInt);
/* 194 */         i3 = j + 4;
/* 195 */         i4 = paramInt + 590;
/* 196 */         i7 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 203 */           i8 = i7 + 1;
/* 204 */           i5 = MainMemory.getI32(j);
/* 205 */           if (!MathUtils.ugt((MainMemory.getI32(i3) - i5) / 276, i7)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */           if (MainMemory.getI8(i4) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */             MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) | 0x80);
/* 227 */             _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 46208), 6), i8), 12992);
/* 228 */             MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) & 0xFF5F | 0x20);
/* 229 */             i5 = MainMemory.getI32(i3);
/* 230 */             i6 = MainMemory.getI32(j);
/* 231 */             _ZNSolsEPFRSoS_E.call(_ZNSolsEj.call(_ZStlsIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_St5_Setw.call(1808, 6), (i5 - i6) / 276), 80);
/* 232 */             _Z14printBackSpacei.call(22);
/* 233 */             _ZNSolsEPFRSoS_E.call(1808, 80);
/* 234 */             i5 = MainMemory.getI32(j);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */           _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE.call(k, i5 + i7 * 276);
/* 243 */           i7 = i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 248 */         MainMemory.setI32Aligned(1824, MainMemory.getI32Aligned(1824) & 0xFFFFFFDF);
/* 249 */         _ZN7duchamp9mergeListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE.call(j, i2);
/* 250 */         MainMemory.setI32(k, 12712);
/* 251 */         MainMemory.setI32(k + 28, 12648);
/* 252 */         i9 = MainMemory.getI32(k + 16);
/* 253 */         if (i9 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */           SystemLibrary.delete(i9);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 269 */         _ZN7duchamp4Cube12ObjectMergerEv_240.call(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 275 */       if (MainMemory.getI8(i1) != 0) {
/*     */         break label810;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */       _ZN7duchamp12finaliseListERSt6vectorINS_9DetectionESaIS1_EERNS_5ParamE.call(j, i2);
/*     */       
/*     */ 
/*     */       label810:
/*     */       
/*     */ 
/* 291 */       _ZN7duchamp9DetectionC1Ev.call(i);
/* 292 */       i3 = j + 4;
/* 293 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EE6resizeEjS1_.call(MainMemory.getI32(m), (MainMemory.getI32(i3) - MainMemory.getI32(j)) / 276, i);
/* 294 */       _ZN7duchamp9DetectionD2Ev.call(i);
/* 295 */       i7 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 302 */         i5 = MainMemory.getI32(i3);
/* 303 */         i = MainMemory.getI32(j);
/* 304 */         if (!MathUtils.ugt((i5 - i) / 276, i7)) {
/*     */           break label990;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */         n = MainMemory.getI32(m);
/* 315 */         i5 = MainMemory.getI32(n);
/* 316 */         if (!MathUtils.ugt((MainMemory.getI32(n + 4) - i5) / 276, i7)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */         _ZN7duchamp9DetectionaSERKS0_.call(i5 + i7 * 276, i + i7 * 276);
/* 327 */         i7 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 333 */       _ZSt20__throw_out_of_rangePKc.call(65984);
/*     */       
/*     */ 
/*     */       label990:
/*     */       
/*     */ 
/* 339 */       if (i5 == i) {
/*     */         break label1070;
/*     */       } else {
/* 342 */         i7 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 351 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i + i7 * 276)), i + i7 * 276);
/* 352 */         i7 += 1;
/* 353 */         if (i + i7 * 276 == i5) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1070:
/*     */       
/*     */ 
/*     */ 
/* 364 */       MainMemory.setI32(i3, i);
/* 365 */       _ZNSt6vectorIN7duchamp9DetectionESaIS1_EED1Ev.call(j);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1090:
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
/* 382 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12ObjectMergerEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */