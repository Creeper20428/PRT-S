/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZdlPvRKSt9nothrow_t;
/*     */ import com.emt.proteus.runtime.library.cpp._ZnwjRKSt9nothrow_t;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube8setupFDREPf
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1354;
/*  20 */   public static final Function _instance = new _ZN7duchamp4Cube8setupFDREPf();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public _ZN7duchamp4Cube8setupFDREPf() { super("_ZN7duchamp4Cube8setupFDREPf", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  27 */     call(paramInt1, paramInt2);
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
/*  39 */     call(i, j);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     int i12 = 0;
/*  63 */     int i13 = 0;
/*  64 */     float f = 0.0F;
/*  65 */     double d1 = 0.0D;
/*  66 */     double d2 = 0.0D;
/*  67 */     double d3 = 0.0D;
/*  68 */     double d4 = 0.0D;
/*  69 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  75 */       i = SystemLibrary.newarray(MainMemory.getI32(paramInt1 + 16) << 2);
/*  76 */       j = i;
/*  77 */       k = paramInt1 + 8;
/*  78 */       i3 = MainMemory.getI32(k);
/*  79 */       if (MainMemory.getI32(i3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  83 */         i11 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  90 */         i7 = paramInt1 + 20;
/*  91 */         i8 = paramInt1 + 32;
/*  92 */         i9 = paramInt1 + 592;
/*  93 */         i4 = i3;
/*  94 */         i10 = 0;
/*  95 */         i6 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 104 */           i11 = i10 + 1;
/* 105 */           if (MainMemory.getI32(i4 + 4) > 0) {
/* 106 */             i3 = i4;
/*     */             
/* 108 */             i5 = 0;
/* 109 */             n = i6;
/*     */           }
/*     */           else
/*     */           {
/* 113 */             i3 = i4;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label445;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 125 */             i6 = i5 + 1;
/* 126 */             if (MainMemory.getI32(i4 + 8) > 0) {
/* 127 */               i3 = i4;
/* 128 */               m = 0;
/* 129 */               i2 = n;
/*     */             }
/*     */             else
/*     */             {
/*     */               break label412;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 145 */               n = m + 1;
/* 146 */               i1 = i10 + MainMemory.getI32(i3) * (i5 + MainMemory.getI32(i3 + 4) * m);
/* 147 */               if (_ZN7duchamp5Param7isBlankERf.call(i8, MainMemory.getI32(i7) + (i1 << 2)) != 0) {
/*     */                 break label363;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */               if (_ZN7duchamp5Param6isInMWEi.call(i8, m) != 0) {
/*     */                 break label363;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */               MainMemory.setF32(j + (i2 << 2), _ZN10Statistics14StatsContainerIfE9getPValueEf.call(i9, MainMemory.getF32(paramInt2 + (i1 << 2))));
/* 170 */               m = i2 + 1;
/* 171 */               i2 = m;
/*     */               
/*     */ 
/*     */ 
/*     */               label363:
/*     */               
/*     */ 
/* 178 */               i4 = MainMemory.getI32(k);
/* 179 */               if (MainMemory.getI32(i4 + 8) <= n) break;
/* 180 */               i3 = i4;
/* 181 */               m = n;
/*     */             }
/*     */             
/*     */             break label412;
/* 185 */             i3 = i4;
/*     */             
/* 187 */             n = i2;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label412:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 198 */             if (MainMemory.getI32(i4 + 4) <= i6) {
/*     */               break;
/*     */             }
/* 201 */             i5 = i6;
/*     */           }
/*     */           
/*     */           break label445;
/*     */           
/* 206 */           i6 = n;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label445:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 216 */           if (MainMemory.getI32(i3) <= i11) break;
/* 217 */           i4 = i3;
/* 218 */           i10 = i11;
/*     */         }
/*     */         
/*     */         break label480;
/* 222 */         i11 = i6;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label480:
/*     */       
/*     */ 
/*     */ 
/* 231 */       paramInt2 = j + (i11 << 2);
/* 232 */       i10 = paramInt2 - i >> 2;
/* 233 */       if (i10 <= 536870911) {
/*     */         break label523;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */       i10 = 536870911;
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label523:
/*     */         
/* 251 */         if (i10 <= 0) {
/*     */           break label604;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */         i12 = _ZnwjRKSt9nothrow_t.call(i10 << 2, -1);
/* 262 */         if (i12 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */         i10 /= 2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 278 */       _ZSt22__stable_sort_adaptiveIPfS0_iEvT_S1_T0_T1_.call(j, paramInt2, i12, i10);
/*     */       
/*     */       break label617;
/*     */       
/*     */       label604:
/*     */       
/* 284 */       _ZSt21__inplace_stable_sortIPfEvT_S1_.call(j, paramInt2);
/* 285 */       i12 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */       label617:
/*     */       
/*     */ 
/* 292 */       _ZdlPvRKSt9nothrow_t.call(i12, -1);
/* 293 */       if (MainMemory.getI32(paramInt1 + 712) == 0) {
/* 294 */         i10 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 304 */         i10 = (int)SystemLibrary.ceilf(MainMemory.getF32(paramInt1 + 708));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */       i13 = MainMemory.getI32(paramInt1 + 652);
/* 313 */       if ((MainMemory.getI32(i13 + 752) > -1) || 
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */         (MainMemory.getI32(i13 + 4) >= 3))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */         i10 = MainMemory.getI32(paramInt1 + 384) * i10;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */       if (i10 < 1) {
/* 343 */         d2 = 0.0D;
/*     */         break label821;
/*     */       } else {
/* 346 */         i6 = 0;
/* 347 */         d2 = 0.0D;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 357 */         i5 = i6 + 1;
/* 358 */         f = i5;
/* 359 */         d3 = f;
/* 360 */         d3 = 1.0D / d3;
/* 361 */         d2 = d3 + d2;
/* 362 */         if (i6 + 2 > i10) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/* 367 */         i6 = i5;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label821:
/*     */       
/*     */ 
/*     */ 
/* 376 */       d3 = MainMemory.getF32(paramInt1 + 380);
/* 377 */       d2 = d3 / d2;
/* 378 */       if (i11 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 382 */         i11 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 389 */         d3 = i11;
/* 390 */         i10 = 0;
/* 391 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 399 */           i6 = i10 + 1;
/* 400 */           d4 = MainMemory.getF32(i + (i10 << 2));
/* 401 */           d1 = i6;
/* 402 */           d1 *= d2;
/* 403 */           d1 /= d3;
/* 404 */           i5 = MathUtils.f_olt(d4, d1) ? i10 : i5;
/* 405 */           if (i6 == i11) {
/* 406 */             i11 = i5; break;
/*     */           }
/*     */           
/*     */ 
/* 410 */           i10 = i6;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 419 */       f = MainMemory.getF32(j + (i11 << 2));
/* 420 */       MainMemory.setF32(paramInt1 + 620, f);
/* 421 */       d3 = SystemLibrary.erfc(0.0D) * 0.5D;
/* 422 */       d2 = f;
/* 423 */       d3 -= d2;
/* 424 */       d1 = 0.0D;
/* 425 */       d4 = 0.1D;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 433 */         d1 += d4;
/* 434 */         d5 = d1 / 1.4142135623730951D;
/* 435 */         d5 = SystemLibrary.erfc(d5) * 0.5D;
/* 436 */         d5 -= d2;
/* 437 */         d5 = d3 * d5;
/* 438 */         if (!MathUtils.f_olt(d5, 0.0D)) {}
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
/* 450 */         d1 -= d4;
/* 451 */         d4 *= 0.5D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 461 */       while (MathUtils.f_ogt(d4, 1.0E-6D));
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
/* 473 */       i9 = paramInt1 + 592;
/* 474 */       d2 = _ZN10Statistics14StatsContainerIfE9getSpreadEv.call(i9);
/* 475 */       d2 *= d1;
/* 476 */       d3 = _ZN10Statistics14StatsContainerIfE9getMiddleEv.call(i9);
/* 477 */       d2 += d3;
/* 478 */       f = (float)d2;
/* 479 */       MainMemory.setF32(paramInt1 + 616, f);
/* 480 */       if (i != 0) {
/*     */         break label1198;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1207;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1198:
/*     */       
/*     */ 
/*     */ 
/* 496 */       SystemLibrary.deletearray(i);
/*     */       
/*     */ 
/*     */       label1207:
/*     */       
/*     */ 
/* 502 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube8setupFDREPf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */