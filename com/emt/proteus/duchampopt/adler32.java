/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class adler32 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3674;
/*  11 */   public static final Function _instance = new adler32();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public adler32() { super("adler32", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     int i9 = 0;
/*  54 */     int i10 = 0;
/*  55 */     int i11 = 0;
/*  56 */     int i12 = 0;
/*  57 */     int i13 = 0;
/*  58 */     int i14 = 0;
/*  59 */     int i15 = 0;
/*  60 */     int i16 = 0;
/*  61 */     int i17 = 0;
/*  62 */     int i18 = 0;
/*  63 */     int i19 = 0;
/*  64 */     int i20 = 0;
/*  65 */     int i21 = 0;
/*  66 */     int i22 = 0;
/*  67 */     int i23 = 0;
/*  68 */     int i24 = 0;
/*  69 */     int i25 = 0;
/*  70 */     int i26 = 0;
/*  71 */     int i27 = 0;
/*  72 */     int i28 = 0;
/*  73 */     int i29 = 0;
/*  74 */     int i30 = 0;
/*  75 */     int i31 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  81 */       k = paramInt1 >>> 16;
/*  82 */       m = paramInt1 & 0xFFFF;
/*  83 */       if (paramInt3 != 1) {
/*     */         break label205;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       paramInt1 = (MainMemory.getI8(paramInt2) & 0xFF) + m;
/*  94 */       paramInt1 = MathUtils.ugt(paramInt1, 65520) ? paramInt1 + -65521 : paramInt1;
/*  95 */       paramInt3 = paramInt1 + k;
/*  96 */       i = (MathUtils.ugt(paramInt3, 65520) ? paramInt3 + 15 : paramInt3) << 16 | paramInt1;
/*     */       
/*     */ 
/*     */       break label1600;
/*     */       
/*     */       label205:
/*     */       
/* 103 */       if (paramInt2 != 0) {
/*     */         break label234;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1600;
/*     */       
/*     */       label234:
/*     */       
/* 120 */       if (!MathUtils.ult(paramInt3, 16)) {
/*     */         break label377;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       if (paramInt3 == 0) {
/* 131 */         paramInt1 = m;
/* 132 */         paramInt3 = k;
/*     */         break label339;
/*     */       } else {
/* 135 */         paramInt1 = 0;
/*     */         
/* 137 */         j = k;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 148 */         k = (MainMemory.getI8(paramInt2 + paramInt1) & 0xFF) + m;
/* 149 */         j = k + j;
/* 150 */         paramInt1 += 1;
/* 151 */         if (paramInt1 == paramInt3) {
/* 152 */           paramInt1 = k;
/* 153 */           paramInt3 = j; break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 158 */         m = k;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label339:
/*     */       
/*     */ 
/*     */ 
/* 168 */       i = MathUtils.urem(paramInt3, 65521) << 16 | (MathUtils.ugt(paramInt1, 65520) ? paramInt1 + -65521 : paramInt1);
/*     */       
/*     */ 
/*     */       break label1600;
/*     */       
/*     */       label377:
/*     */       
/* 175 */       if (!MathUtils.ugt(paramInt3, 5551))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         paramInt1 = paramInt3;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 189 */         paramInt3 += 59984;
/* 190 */         j = 0;
/* 191 */         i31 = m;
/* 192 */         i15 = k;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 201 */           k = j * 5552;
/* 202 */           m = k | 0x1;
/* 203 */           n = k | 0x2;
/* 204 */           i1 = k | 0x3;
/* 205 */           i2 = k | 0x4;
/* 206 */           i3 = k | 0x5;
/* 207 */           i4 = k | 0x6;
/* 208 */           i5 = k | 0x7;
/* 209 */           i6 = k | 0x8;
/* 210 */           i7 = k | 0x9;
/* 211 */           i8 = k | 0xA;
/* 212 */           i9 = k | 0xB;
/* 213 */           i10 = k | 0xC;
/* 214 */           i11 = k | 0xD;
/* 215 */           i12 = k | 0xE;
/* 216 */           i13 = k | 0xF;
/* 217 */           paramInt1 = paramInt3 + j * 59984;
/* 218 */           i14 = 0;
/*     */           
/* 220 */           i16 = i31;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 229 */             i31 = i14 << 4;
/* 230 */             i16 = (MainMemory.getI8(paramInt2 + (k + i31)) & 0xFF) + i16;
/* 231 */             i17 = (MainMemory.getI8(paramInt2 + (m + i31)) & 0xFF) + i16;
/* 232 */             i18 = (MainMemory.getI8(paramInt2 + (n + i31)) & 0xFF) + i17;
/* 233 */             i19 = (MainMemory.getI8(paramInt2 + (i1 + i31)) & 0xFF) + i18;
/* 234 */             i20 = (MainMemory.getI8(paramInt2 + (i2 + i31)) & 0xFF) + i19;
/* 235 */             i21 = (MainMemory.getI8(paramInt2 + (i3 + i31)) & 0xFF) + i20;
/* 236 */             i22 = (MainMemory.getI8(paramInt2 + (i4 + i31)) & 0xFF) + i21;
/* 237 */             i23 = (MainMemory.getI8(paramInt2 + (i5 + i31)) & 0xFF) + i22;
/* 238 */             i24 = (MainMemory.getI8(paramInt2 + (i6 + i31)) & 0xFF) + i23;
/* 239 */             i25 = (MainMemory.getI8(paramInt2 + (i7 + i31)) & 0xFF) + i24;
/* 240 */             i26 = (MainMemory.getI8(paramInt2 + (i8 + i31)) & 0xFF) + i25;
/* 241 */             i27 = (MainMemory.getI8(paramInt2 + (i9 + i31)) & 0xFF) + i26;
/* 242 */             i28 = (MainMemory.getI8(paramInt2 + (i10 + i31)) & 0xFF) + i27;
/* 243 */             i29 = (MainMemory.getI8(paramInt2 + (i11 + i31)) & 0xFF) + i28;
/* 244 */             i30 = (MainMemory.getI8(paramInt2 + (i12 + i31)) & 0xFF) + i29;
/* 245 */             i31 = (MainMemory.getI8(paramInt2 + (i13 + i31)) & 0xFF) + i30;
/* 246 */             i15 = i16 + i15 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + i27 + i28 + i29 + i30 + i31;
/* 247 */             i14 += 1;
/* 248 */             if (i14 == 347) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 254 */             i16 = i31;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */           m = MathUtils.urem(i31, 65521);
/* 262 */           n = MathUtils.urem(i15, 65521);
/* 263 */           j += 1;
/* 264 */           if (!MathUtils.ugt(paramInt1, 5551))
/*     */             break;
/* 266 */           i31 = m;
/* 267 */           i15 = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */         paramInt2 += k + 5552;
/*     */         
/*     */ 
/*     */ 
/* 281 */         k = n;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */       if (paramInt1 == 0) {
/* 292 */         paramInt3 = k;
/* 293 */         paramInt1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 303 */         if (!MathUtils.ugt(paramInt1, 15))
/*     */         {
/*     */ 
/*     */ 
/* 307 */           paramInt3 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 317 */           paramInt3 = paramInt1 + -16;
/* 318 */           j = 0;
/*     */           
/* 320 */           n = k;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 329 */             k = j << 4;
/* 330 */             paramInt1 = paramInt3 + j * -16;
/* 331 */             i1 = (MainMemory.getI8(paramInt2 + k) & 0xFF) + m;
/* 332 */             i2 = (MainMemory.getI8(paramInt2 + (k | 0x1)) & 0xFF) + i1;
/* 333 */             i3 = (MainMemory.getI8(paramInt2 + (k | 0x2)) & 0xFF) + i2;
/* 334 */             i4 = (MainMemory.getI8(paramInt2 + (k | 0x3)) & 0xFF) + i3;
/* 335 */             i5 = (MainMemory.getI8(paramInt2 + (k | 0x4)) & 0xFF) + i4;
/* 336 */             i6 = (MainMemory.getI8(paramInt2 + (k | 0x5)) & 0xFF) + i5;
/* 337 */             i7 = (MainMemory.getI8(paramInt2 + (k | 0x6)) & 0xFF) + i6;
/* 338 */             i8 = (MainMemory.getI8(paramInt2 + (k | 0x7)) & 0xFF) + i7;
/* 339 */             i9 = (MainMemory.getI8(paramInt2 + (k | 0x8)) & 0xFF) + i8;
/* 340 */             i10 = (MainMemory.getI8(paramInt2 + (k | 0x9)) & 0xFF) + i9;
/* 341 */             i11 = (MainMemory.getI8(paramInt2 + (k | 0xA)) & 0xFF) + i10;
/* 342 */             i12 = (MainMemory.getI8(paramInt2 + (k | 0xB)) & 0xFF) + i11;
/* 343 */             i13 = (MainMemory.getI8(paramInt2 + (k | 0xC)) & 0xFF) + i12;
/* 344 */             i14 = (MainMemory.getI8(paramInt2 + (k | 0xD)) & 0xFF) + i13;
/* 345 */             i15 = (MainMemory.getI8(paramInt2 + (k | 0xE)) & 0xFF) + i14;
/* 346 */             m = (MainMemory.getI8(paramInt2 + (k | 0xF)) & 0xFF) + i15;
/* 347 */             n = i1 + n + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + m;
/* 348 */             j += 1;
/* 349 */           } while (MathUtils.ugt(paramInt1, 15));
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
/* 362 */           paramInt2 += k + 16;
/* 363 */           paramInt3 = m;
/*     */           
/*     */ 
/* 366 */           k = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */         if (paramInt1 == 0) {
/* 377 */           paramInt1 = paramInt3;
/* 378 */           paramInt3 = k;
/*     */           break label1569;
/*     */         } else {
/* 381 */           j = 0;
/* 382 */           m = paramInt3;
/* 383 */           paramInt3 = k;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 394 */           k = (MainMemory.getI8(paramInt2 + j) & 0xFF) + m;
/* 395 */           paramInt3 = k + paramInt3;
/* 396 */           j += 1;
/* 397 */           if (j == paramInt1) {
/* 398 */             paramInt1 = k; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 404 */           m = k;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1569:
/*     */         
/*     */ 
/*     */ 
/* 414 */         paramInt1 = MathUtils.urem(paramInt1, 65521);
/* 415 */         paramInt3 = MathUtils.urem(paramInt3, 65521);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 425 */       i = paramInt3 << 16 | paramInt1;
/*     */       
/*     */ 
/*     */       label1600:
/*     */       
/*     */ 
/* 431 */       int i32 = i; return i32;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/adler32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */