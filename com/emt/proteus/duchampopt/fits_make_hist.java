/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class fits_make_hist
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3461;
/*  15 */   public static final Function _instance = new fits_make_hist();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public fits_make_hist() { super("fits_make_hist", 14, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, float paramFloat, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramFloat, paramInt10, paramInt11, paramInt12, paramInt13);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i9 = call(i, j, k, m, n, i1, i2, i3, i4, f, i5, i6, i7, i8);
/*  70 */     paramFrame.setI32(paramInt1, i9);
/*  71 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, float paramFloat, int paramInt10, int paramInt11, int paramInt12, int paramInt13)
/*     */   {
/*  76 */     int i = 0;
/*     */     
/*  78 */     int j = 0;
/*  79 */     int k = 0;
/*  80 */     int m = 0;
/*  81 */     int n = 0;
/*  82 */     int i1 = 0;
/*  83 */     int i2 = 0;
/*  84 */     int i3 = 0;
/*  85 */     int i4 = 0;
/*  86 */     int i5 = 0;
/*  87 */     int i6 = 0;
/*  88 */     int i7 = 0;
/*  89 */     int i8 = 0;
/*  90 */     int i9 = 0;
/*  91 */     int i10 = 0;
/*  92 */     int i11 = 0;
/*  93 */     int i12 = 0;
/*  94 */     int i13 = 0;
/*  95 */     int i14 = 0;
/*  96 */     int i15 = 0;
/*  97 */     float f1 = 0.0F;
/*  98 */     float f2 = 0.0F;
/*  99 */     float f3 = 0.0F;
/* 100 */     int i16 = 0;
/* 101 */     float f4 = 0.0F;
/*     */     
/*     */ 
/* 104 */     int i17 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 108 */       j = MainMemory.alloc(8);
/* 109 */       k = MainMemory.alloc(8);
/* 110 */       m = MainMemory.alloc(4);
/* 111 */       n = MainMemory.alloc(16);
/* 112 */       i1 = MainMemory.alloc(16);
/* 113 */       i2 = MainMemory.alloc(16);
/* 114 */       i3 = MainMemory.alloc(16);
/* 115 */       i4 = MainMemory.alloc(16);
/* 116 */       i5 = MainMemory.alloc(112);
/* 117 */       i6 = MainMemory.alloc(244);
/* 118 */       i16 = MainMemory.getI32(paramInt13);
/* 119 */       if (i16 <= 0) {
/*     */         break label189;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       i = i16;
/*     */       
/*     */ 
/*     */       break label1256;
/*     */       
/*     */       label189:
/*     */       
/* 136 */       if (paramInt4 <= 4) {
/*     */         break label236;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       ffxmsg.call(5, 86432);
/* 147 */       MainMemory.setI32(paramInt13, 320);
/* 148 */       i = 320;
/*     */       
/*     */ 
/*     */       break label1256;
/*     */       
/*     */       label236:
/*     */       
/* 155 */       switch (paramInt3) {
/* 156 */       case 8:  paramInt3 = 11;
/*     */         break label382;
/*     */         break;
/*     */       case 16: 
/*     */         break label374;
/*     */         break;
/*     */       case 32: 
/*     */         break label361;
/*     */         break;
/*     */       case -32: 
/*     */         break label348;
/*     */         break;
/*     */       case -64: 
/*     */         break; }
/* 170 */       paramInt3 = 82;
/*     */       
/*     */       break label382;
/*     */       
/*     */       label348:
/* 175 */       paramInt3 = 42;
/*     */       
/*     */       break label382;
/*     */       
/*     */       label361:
/* 180 */       paramInt3 = 31;
/*     */       
/*     */       break label382;
/*     */       
/*     */       label374:
/* 185 */       paramInt3 = 21;
/*     */       
/*     */ 
/*     */ 
/*     */       label382:
/*     */       
/*     */ 
/* 192 */       i16 = MainMemory.getI32(paramInt1);
/* 193 */       if (i16 != MainMemory.getI32(MainMemory.getI32(paramInt1 + 4) + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */         ffmahd.call(paramInt1, i16 + 1, 0, paramInt13);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 209 */       MainMemory.setF32(i5 + 104, paramFloat);
/* 210 */       MainMemory.setI32(i5 + 100, paramInt10);
/* 211 */       MainMemory.setI32(i5 + 96, paramInt11);
/* 212 */       MainMemory.setI32(i5 + 4, paramInt1);
/* 213 */       MainMemory.setI32(i5 + 28, paramInt3);
/* 214 */       i7 = i5 + 8;
/* 215 */       MainMemory.setI32(i7, paramInt4);
/* 216 */       MainMemory.setI32(i5 + 108, paramInt12);
/* 217 */       if (paramInt4 > 0) {
/* 218 */         paramInt10 = 0;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 223 */         paramInt10 = 0;
/* 224 */         f2 = 0.0F;
/* 225 */         f1 = 0.0F;
/* 226 */         paramFloat = 0.0F;
/*     */         
/*     */ 
/*     */         break label1089;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 234 */         i8 = i1 + (paramInt10 << 2);
/* 235 */         i9 = paramInt7 + (paramInt10 << 2);
/* 236 */         i10 = i2 + (paramInt10 << 2);
/* 237 */         i11 = paramInt8 + (paramInt10 << 2);
/* 238 */         i12 = i3 + (paramInt10 << 2);
/* 239 */         i13 = paramInt9 + (paramInt10 << 2);
/* 240 */         i14 = paramInt6 + (paramInt10 << 2);
/* 241 */         i15 = i4 + (paramInt10 << 2);
/* 242 */         f1 = MainMemory.getI32(paramInt5 + (paramInt10 << 2));
/* 243 */         MainMemory.setF32(n + (paramInt10 << 2), f1);
/* 244 */         f2 = MainMemory.getF32(i9);
/* 245 */         MainMemory.setF32(i8, f2);
/* 246 */         paramFloat = MainMemory.getF32(i11);
/* 247 */         MainMemory.setF32(i10, paramFloat);
/* 248 */         f3 = MainMemory.getF32(i13);
/* 249 */         if ((!MathUtils.f_ogt(f2, paramFloat)) || (!MathUtils.f_ogt(f3, 0.0D)))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */           if ((!MathUtils.f_olt(f2, paramFloat)) || (!MathUtils.f_olt(f3, 0.0D))) {
/*     */             break label745;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */         f3 = -0.0F - f3;
/*     */         
/*     */ 
/*     */ 
/*     */         label745:
/*     */         
/*     */ 
/*     */ 
/* 278 */         MainMemory.setF32(i12, f3);
/* 279 */         i16 = (int)paramFloat;
/* 280 */         paramInt11 = (int)f3;
/* 281 */         ffgtclll.call(paramInt1, MainMemory.getI32(i14), m, j, k, paramInt13);
/* 282 */         if (MainMemory.getI32(m) <= 41)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */           f4 = (int)f2;
/* 293 */           if (!MathUtils.f_une(f4, f2))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */             f4 = i16;
/* 304 */             if (!MathUtils.f_une(f4, paramFloat))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */               f4 = paramInt11;
/* 315 */               if (!MathUtils.f_une(f4, f3)) {
/*     */                 break label915;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 325 */         paramFloat -= f2;
/* 326 */         paramFloat /= f3;
/* 327 */         MainMemory.setF32(i15, paramFloat);
/*     */         
/*     */         break label1024;
/*     */         
/*     */         label915:
/* 332 */         f1 += 1.0F;
/* 333 */         MainMemory.setF32(i15, f1);
/* 334 */         if (!MathUtils.f_olt(f2, paramFloat)) {
/*     */           break label991;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */         f1 = f2 + -0.5F;
/* 345 */         MainMemory.setF32(i8, f1);
/* 346 */         paramFloat += 0.5F;
/* 347 */         MainMemory.setF32(i10, paramFloat);
/*     */         
/*     */         break label1024;
/*     */         
/*     */         label991:
/* 352 */         f1 = f2 + 0.5F;
/* 353 */         MainMemory.setF32(i8, f1);
/* 354 */         paramFloat += -0.5F;
/* 355 */         MainMemory.setF32(i10, paramFloat);
/*     */         
/*     */ 
/*     */         label1024:
/*     */         
/*     */ 
/* 361 */         paramInt10 += 1;
/* 362 */         if (paramInt10 == paramInt4) {
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
/* 373 */       paramFloat = MainMemory.getF32(i1);
/* 374 */       f1 = MainMemory.getF32(i4);
/* 375 */       f2 = MainMemory.getF32(i3);
/* 376 */       paramInt4 = MainMemory.getI32(i7);
/* 377 */       paramInt10 = (int)MainMemory.getF32(n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1089:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */       MainMemory.setI32(i5 + 12, MainMemory.getI32(paramInt6));
/* 394 */       MainMemory.setF32(i5 + 48, paramFloat);
/* 395 */       MainMemory.setF32(i5 + 64, f1);
/* 396 */       MainMemory.setF32(i5 + 80, f2);
/* 397 */       MainMemory.setI32(i5 + 32, paramInt10);
/* 398 */       if (paramInt4 <= 1) {
/*     */         break label1181;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */       fits_make_hist_1483.call(paramInt4, i4, n, paramInt6, i5, i1, i3);
/*     */       
/*     */ 
/*     */       label1181:
/*     */       
/*     */ 
/* 414 */       MainMemory.setI32(i6, paramInt2);
/* 415 */       MainMemory.setI32(i6 + 80, paramInt3);
/* 416 */       MainMemory.setI32(i6 + 84, 2);
/* 417 */       ffiter.call(1, i6, 0, -1, 3459, i5, paramInt13);
/* 418 */       i = MainMemory.getI32(paramInt13);
/*     */       
/*     */ 
/*     */ 
/*     */       break label1256;
/*     */       
/*     */ 
/* 425 */       MainMemory.setI32(paramInt13, 410);
/* 426 */       i = 410;
/*     */       
/*     */ 
/*     */       label1256:
/*     */       
/*     */ 
/* 432 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 437 */       MainMemory.dealloc_generated(i17);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_make_hist.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */