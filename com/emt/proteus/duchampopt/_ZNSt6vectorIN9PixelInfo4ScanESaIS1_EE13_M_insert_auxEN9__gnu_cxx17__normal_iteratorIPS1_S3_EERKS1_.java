/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 329;
/*  13 */   public static final Function _instance = new _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_() { super("_ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     call(i, j, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  42 */     int i = 0;
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     boolean bool = false;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*  54 */     int i7 = 0;
/*  55 */     int i8 = 0;
/*  56 */     int i9 = 0;
/*  57 */     int i10 = 0;
/*  58 */     int i11 = 0;
/*  59 */     int i12 = 0;
/*  60 */     int i13 = 0;
/*  61 */     int i14 = 0;
/*     */     
/*     */ 
/*  64 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       i2 = MainMemory.alloc(16);
/*  69 */       i = paramInt1 + 4;
/*  70 */       i3 = MainMemory.getI32(i);
/*  71 */       j = paramInt1 + 8;
/*  72 */       if (i3 != MainMemory.getI32(j)) {
/*     */         break label892;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       i5 = i3 - MainMemory.getI32(paramInt1);
/*  83 */       n = i5 >> 4;
/*  84 */       switch (n) {
/*     */       case 268435455: 
/*     */         break;
/*  87 */       case 0:  i5 = 1;
/*     */         
/*     */ 
/*     */         break label203;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*  96 */       com.emt.proteus.runtime.library.cpp._ZSt20__throw_length_errorPKc.call(64704);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       i5 = i5 >> 3 & 0xFFFFFFFE;
/*     */       
/*     */ 
/*     */ 
/*     */       label203:
/*     */       
/*     */ 
/*     */ 
/* 110 */       if (com.emt.proteus.lib.api.MathUtils.ult(i5, n)) {
/* 111 */         n = 268435455;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 121 */       else if (!com.emt.proteus.lib.api.MathUtils.ugt(i5, 268435455))
/*     */       {
/*     */ 
/*     */ 
/* 125 */         n = i5;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 132 */         com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */       i1 = SystemLibrary.newobject(n << 4);
/* 140 */       i2 = i1;
/* 141 */       i3 = MainMemory.getI32(paramInt1);
/* 142 */       if (i3 == paramInt2) {
/* 143 */         i3 = i2;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 153 */         bool = i2 == i3;
/* 154 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 161 */           i5 = i4 << 4;
/* 162 */           i6 = i4 + 1;
/* 163 */           i7 = i3 + (i6 << 4);
/* 164 */           i8 = i1 + i5;
/* 165 */           i9 = i1 + (i5 | 0xC);
/* 166 */           i10 = i1 + (i5 | 0x8);
/* 167 */           i11 = i1 + (i5 | 0x4);
/* 168 */           i12 = i3 + (i4 << 4) + 12;
/* 169 */           i13 = i3 + (i4 << 4) + 8;
/* 170 */           i14 = i3 + (i4 << 4) + 4;
/* 171 */           if (i8 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__424.call(i14, i13, bool, i12, i9, i8, i11, i10);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 187 */           if (i7 == paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/* 191 */           i4 = i6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */         i3 = i1 + (i5 + 16);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */       if (i3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__422.call(paramInt3, i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 222 */       i7 = i3 + 16;
/* 223 */       paramInt3 = MainMemory.getI32(i);
/* 224 */       if (paramInt3 == paramInt2) {
/* 225 */         paramInt2 = paramInt3;
/* 226 */         paramInt3 = i7;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 236 */         bool = i7 == paramInt2;
/* 237 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 244 */           i6 = i5 + 1;
/* 245 */           i9 = i3 + (i6 << 4) + 12;
/* 246 */           i10 = i3 + (i6 << 4) + 8;
/* 247 */           i11 = i3 + (i6 << 4) + 4;
/* 248 */           i7 = paramInt2 + (i6 << 4);
/* 249 */           i12 = paramInt2 + (i5 << 4) + 12;
/* 250 */           i13 = paramInt2 + (i5 << 4) + 8;
/* 251 */           i14 = paramInt2 + (i5 << 4) + 4;
/* 252 */           if (i3 + (i6 << 4) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */             _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1__423.call(i11, i13, bool, i14, i6, i3, i10, i9, i12);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 268 */           if (i7 == paramInt3) {
/*     */             break;
/*     */           }
/*     */           
/* 272 */           i5 = i6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */         paramInt3 = i3 + (i5 + 2 << 4);
/* 280 */         paramInt2 = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 290 */       i3 = MainMemory.getI32(paramInt1);
/* 291 */       if (i3 == paramInt2) {
/* 292 */         paramInt2 = i3;
/*     */         break label836;
/*     */       } else {
/* 295 */         i5 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 304 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i3 + (i5 << 4))), i3 + (i5 << 4));
/* 305 */         i5 += 1;
/* 306 */         if (i3 + (i5 << 4) == paramInt2) {
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
/* 317 */       paramInt2 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label836:
/*     */       
/*     */ 
/*     */ 
/* 325 */       if (paramInt2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */         SystemLibrary.delete(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 341 */       MainMemory.setI32(paramInt1, i2);
/* 342 */       MainMemory.setI32(i, paramInt3);
/* 343 */       MainMemory.setI32(j, i2 + (n << 4));
/*     */       
/*     */ 
/*     */       break label1262;
/*     */       
/*     */       label892:
/*     */       
/* 350 */       if (i3 != 0)
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
/* 361 */         MainMemory.setI32(i3, 12872);
/* 362 */         MainMemory.setI32(i3 + 4, MainMemory.getI32(i3 + -12));
/* 363 */         MainMemory.setI32(i3 + 8, MainMemory.getI32(i3 + -8));
/* 364 */         MainMemory.setI32(i3 + 12, MainMemory.getI32(i3 + -4));
/* 365 */         i3 = MainMemory.getI32(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */       MainMemory.setI32(i, i3 + 16);
/* 374 */       MainMemory.setI32(i2, 12872);
/* 375 */       if (i2 != paramInt3)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */         MainMemory.setI32(i2 + 4, MainMemory.getI32(paramInt3 + 4));
/* 386 */         MainMemory.setI32(i2 + 8, MainMemory.getI32(paramInt3 + 8));
/* 387 */         MainMemory.setI32(i2 + 12, MainMemory.getI32(paramInt3 + 12));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 393 */       n = i3 + -16 - paramInt2 >> 4;
/* 394 */       if (n > 0) {
/* 395 */         i5 = 0;
/*     */       } else {
/*     */         break label1185;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 406 */         k = i3 + (0 - i5 << 4);
/* 407 */         m = i3 + (-2 - i5 + 1 << 4);
/* 408 */         MainMemory.setI32(k + -12, MainMemory.getI32(m + -12));
/* 409 */         MainMemory.setI32(k + -8, MainMemory.getI32(m + -8));
/* 410 */         MainMemory.setI32(k + -4, MainMemory.getI32(m + -4));
/* 411 */         i5 += 1;
/* 412 */         if (i5 == n) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1185:
/*     */       
/*     */ 
/*     */ 
/* 423 */       if (i2 != paramInt2) {
/*     */         break label1214;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1262;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1214:
/*     */       
/*     */ 
/*     */ 
/* 439 */       MainMemory.setI32(paramInt2 + 4, MainMemory.getI32(i2 + 4));
/* 440 */       MainMemory.setI32(paramInt2 + 8, MainMemory.getI32(i2 + 8));
/* 441 */       MainMemory.setI32(paramInt2 + 12, MainMemory.getI32(i2 + 12));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1262:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 452 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */