/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class matinv extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2788;
/*  13 */   public static final com.emt.proteus.runtime.api.Function _instance = new matinv();
/*  14 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  16 */   public matinv() { super("matinv", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = call(i, j, k);
/*  35 */     paramFrame.setI32(paramInt1, m);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     boolean bool1 = false;
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
/*  62 */     int i15 = 0;
/*  63 */     int i16 = 0;
/*  64 */     int i17 = 0;
/*  65 */     boolean bool2 = false;
/*  66 */     double d1 = 0.0D;
/*  67 */     int i18 = 0;
/*  68 */     double d2 = 0.0D;
/*  69 */     int i19 = 0;
/*  70 */     int i20 = 0;
/*  71 */     double d3 = 0.0D;
/*  72 */     boolean bool3 = false;
/*  73 */     int i21 = 0;
/*  74 */     int i22 = 0;
/*  75 */     int i23 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  81 */       j = calloc.call(paramInt1, 4);
/*  82 */       k = j;
/*  83 */       if (j != 0) {
/*     */         break label142;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       i = 2;
/*     */       
/*     */ 
/*     */       break label1138;
/*     */       
/*     */       label142:
/*     */       
/* 100 */       m = calloc.call(paramInt1, 4);
/* 101 */       n = m;
/* 102 */       if (m != 0) {
/*     */         break label188;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */       free.call(j);
/* 113 */       i = 2;
/*     */       
/*     */ 
/*     */       break label1138;
/*     */       
/*     */       label188:
/*     */       
/* 120 */       i1 = calloc.call(paramInt1, 8);
/* 121 */       i2 = i1;
/* 122 */       if (i1 != 0) {
/*     */         break label240;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       free.call(j);
/* 133 */       free.call(m);
/* 134 */       i = 2;
/*     */       
/*     */ 
/*     */       break label1138;
/*     */       
/*     */       label240:
/*     */       
/* 141 */       i3 = paramInt1 * paramInt1;
/* 142 */       i4 = calloc.call(i3, 8);
/* 143 */       if (i4 != 0) {
/*     */         break label299;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       free.call(j);
/* 154 */       free.call(m);
/* 155 */       free.call(i1);
/* 156 */       i = 2;
/*     */       
/*     */ 
/*     */       break label1138;
/*     */       
/*     */       label299:
/*     */       
/* 163 */       bool1 = paramInt1 > 0;
/* 164 */       i5 = 0;
/* 165 */       i6 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 173 */         i16 = i1 + (i6 << 3);
/* 174 */         if (i6 >= paramInt1) {
/*     */           break label566;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         MainMemory.setI32(j + (i6 << 2), i6);
/* 185 */         MainMemory.setF64(i16, 0.0D);
/* 186 */         if (!bool1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         i7 = i5 << 3;
/* 197 */         d1 = 0.0D;
/* 198 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 206 */           i20 = i4 + (i7 + (i9 << 3));
/* 207 */           d2 = MainMemory.getF64(paramInt2 + (i5 + i9 << 3));
/* 208 */           d3 = SystemLibrary.fabs(d2);
/* 209 */           d1 = MathUtils.f_olt(d1, d3) ? d3 : d1;
/* 210 */           MainMemory.setF64(i20, d2);
/* 211 */           i9 += 1;
/* 212 */           if (i9 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */         MainMemory.setF64(i16, d1);
/* 225 */         if (MathUtils.f_oeq(d1, 0.0D)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */         i5 += paramInt1;
/* 236 */         i6 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */       free.call(j);
/* 244 */       free.call(m);
/* 245 */       free.call(i1);
/* 246 */       free.call(i4);
/* 247 */       i = 3;
/*     */       
/*     */ 
/*     */       break label1138;
/*     */       
/*     */       label566:
/*     */       
/* 254 */       if (!bool1) {
/*     */         break label1111;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */       i5 = paramInt1 << 3;
/* 265 */       i6 = paramInt1 + -1;
/* 266 */       i7 = i5 + 8;
/* 267 */       i8 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 274 */         i21 = i7 * i8;
/* 275 */         i9 = i5 + i21;
/* 276 */         i10 = i7 + i21;
/* 277 */         i11 = i6 - i8;
/* 278 */         i12 = i21 + 8;
/* 279 */         i13 = i5 * i8;
/* 280 */         i14 = i8 + 1;
/* 281 */         i18 = i8 << 3;
/* 282 */         i15 = i18 + 8;
/* 283 */         i16 = i1 + i18;
/* 284 */         i17 = j + (i8 << 2);
/* 285 */         paramInt2 = i4 + i21;
/* 286 */         bool2 = i14 < paramInt1;
/* 287 */         if (!bool2) {
/*     */           break label1062;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */         d1 = MainMemory.getF64(i16);
/* 298 */         d2 = SystemLibrary.fabs(MainMemory.getF64(paramInt2)) / d1;
/* 299 */         i18 = 0;
/*     */         
/* 301 */         i21 = i8;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 310 */           i19 = i14 + i18;
/* 311 */           i20 = i1 + (i15 + (i18 << 3));
/* 312 */           d3 = SystemLibrary.fabs(MainMemory.getF64(i4 + (i9 + i5 * i18))) / MainMemory.getF64(i20);
/* 313 */           bool3 = MathUtils.f_ogt(d3, d2);
/* 314 */           i21 = bool3 ? i19 : i21;
/* 315 */           d2 = bool3 ? d3 : d2;
/* 316 */           i18 += 1;
/* 317 */           if (i18 == i11) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */         if (i21 <= i8) {
/*     */           break label1039;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */         i8 = i5 * i21;
/* 341 */         i15 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 348 */           i18 = i15 << 3;
/* 349 */           i20 = i4 + (i13 + i18);
/* 350 */           i22 = i4 + (i8 + i18);
/* 351 */           d2 = MainMemory.getF64(i22);
/* 352 */           MainMemory.setF64(i22, MainMemory.getF64(i20));
/* 353 */           MainMemory.setF64(i20, d2);
/* 354 */           i15 += 1;
/* 355 */           if (i15 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */         i20 = i2 + (i21 << 3);
/* 367 */         d2 = MainMemory.getF64(i20);
/* 368 */         MainMemory.setF64(i20, d1);
/* 369 */         MainMemory.setF64(i16, d2);
/* 370 */         i23 = k + (i21 << 2);
/* 371 */         i13 = MainMemory.getI32(i23);
/* 372 */         MainMemory.setI32(i23, MainMemory.getI32(i17));
/* 373 */         MainMemory.setI32(i17, i13);
/*     */         
/*     */ 
/*     */         label1039:
/*     */         
/*     */ 
/* 379 */         matinv_1573.call(i11, bool2, i10, paramInt2, i5, i12, i4, i9);
/*     */         
/*     */ 
/*     */         label1062:
/*     */         
/*     */ 
/* 385 */         if (i14 == paramInt1) {
/*     */           break;
/*     */         }
/*     */         
/* 389 */         i8 = i14;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */       matinv_1571.call(m, n, j, bool1, i6, i3, i5, paramInt1, i4, paramInt3);
/*     */       
/*     */ 
/*     */       label1111:
/*     */       
/*     */ 
/* 402 */       free.call(j);
/* 403 */       free.call(m);
/* 404 */       free.call(i1);
/* 405 */       free.call(i4);
/* 406 */       i = 0;
/*     */       
/*     */ 
/*     */       label1138:
/*     */       
/*     */ 
/* 412 */       int i24 = i; return i24;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/matinv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */