/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F423307 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3662;
/*  12 */   public static final Function _instance = new F423307();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F423307() { super("F423307", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j, k, m, n);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
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
/*  63 */     int i12 = 0;
/*  64 */     int i13 = 0;
/*  65 */     int i14 = 0;
/*  66 */     int i15 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  72 */       j = (paramInt3 + 1) / 2;
/*  73 */       i = paramInt4 + 1;
/*  74 */       k = i / 2;
/*  75 */       n = j + -1;
/*  76 */       if (n <= -1) {
/*     */         break label121;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       F423307_155.call(paramInt4, paramInt2, n, paramInt5, k, j);
/*     */       
/*     */ 
/*     */       label121:
/*     */       
/*     */ 
/*  92 */       j = paramInt3 + -1;
/*  93 */       if (j <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  97 */         i = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 104 */         k = paramInt4 + -1;
/* 105 */         m = k > 0 ? 1 : 0;
/* 106 */         n = paramInt4 + 2;
/* 107 */         i1 = paramInt4 << 1;
/* 108 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 115 */           i3 = i1 * i2;
/* 116 */           i4 = i3 + 2;
/* 117 */           i5 = i3 | 0x1;
/* 118 */           i6 = n + i3;
/* 119 */           i7 = i + i3;
/* 120 */           i8 = i3 + paramInt4;
/* 121 */           i9 = (i2 << 1) + 2;
/* 122 */           if (m != 0) {
/* 123 */             i10 = 0;
/*     */           }
/*     */           else
/*     */           {
/* 127 */             i6 = i8;
/*     */             
/* 129 */             i15 = 0;
/*     */             break label1093; }
/*     */           label561:
/*     */           label594:
/*     */           label627:
/*     */           label660:
/*     */           label693:
/*     */           label726:
/* 137 */           label759: label792: label825: label858: label891: label924: label957: label990: label1023: label1051: do { i11 = i10 << 1;
/* 138 */             paramInt2 = paramInt5 + (i5 + i11);
/* 139 */             i12 = paramInt5 + (i3 + i11);
/* 140 */             i13 = paramInt5 + (i7 + i11);
/* 141 */             i14 = paramInt5 + (i8 + i11);
/* 142 */             i15 = i11 + 2;
/* 143 */             switch (MainMemory.getI8(i12) & 0xFF) {
/*     */             case 0: 
/*     */               break label1023;
/*     */               break;
/*     */             case 1: 
/*     */               break label990;
/*     */               break;
/*     */             case 2: 
/*     */               break label957;
/*     */               break;
/*     */             case 3: 
/*     */               break label924;
/*     */               break;
/*     */             case 4:  break label891;
/*     */               break; case 5:  break label858;
/*     */               break; case 6:  break label825;
/*     */               break; case 7:  break label792;
/*     */               break; case 8:  break label759;
/*     */               break; case 9:  break label726;
/*     */               break; case 10:  break label693;
/*     */               break; case 11:  break label660;
/*     */               break; case 12:  break label627;
/*     */               break; case 13:  break label594;
/*     */               break; case 14:  break label561;
/*     */               break; case 15:  break; }
/* 168 */             MainMemory.setI8(i13, (byte)1);
/* 169 */             MainMemory.setI8(i14, (byte)1);
/* 170 */             MainMemory.setI8(paramInt2, (byte)1);
/* 171 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 176 */             MainMemory.setI8(i13, (byte)0);
/* 177 */             MainMemory.setI8(i14, (byte)1);
/* 178 */             MainMemory.setI8(paramInt2, (byte)1);
/* 179 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 184 */             MainMemory.setI8(i13, (byte)1);
/* 185 */             MainMemory.setI8(i14, (byte)0);
/* 186 */             MainMemory.setI8(paramInt2, (byte)1);
/* 187 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 192 */             MainMemory.setI8(i13, (byte)0);
/* 193 */             MainMemory.setI8(i14, (byte)0);
/* 194 */             MainMemory.setI8(paramInt2, (byte)1);
/* 195 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 200 */             MainMemory.setI8(i13, (byte)1);
/* 201 */             MainMemory.setI8(i14, (byte)1);
/* 202 */             MainMemory.setI8(paramInt2, (byte)0);
/* 203 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 208 */             MainMemory.setI8(i13, (byte)0);
/* 209 */             MainMemory.setI8(i14, (byte)1);
/* 210 */             MainMemory.setI8(paramInt2, (byte)0);
/* 211 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 216 */             MainMemory.setI8(i13, (byte)1);
/* 217 */             MainMemory.setI8(i14, (byte)0);
/* 218 */             MainMemory.setI8(paramInt2, (byte)0);
/* 219 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 224 */             MainMemory.setI8(i13, (byte)0);
/* 225 */             MainMemory.setI8(i14, (byte)0);
/* 226 */             MainMemory.setI8(paramInt2, (byte)0);
/* 227 */             MainMemory.setI8(i12, (byte)1);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 232 */             MainMemory.setI8(i13, (byte)1);
/* 233 */             MainMemory.setI8(i14, (byte)1);
/* 234 */             MainMemory.setI8(paramInt2, (byte)1);
/* 235 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 240 */             MainMemory.setI8(i13, (byte)0);
/* 241 */             MainMemory.setI8(i14, (byte)1);
/* 242 */             MainMemory.setI8(paramInt2, (byte)1);
/* 243 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 248 */             MainMemory.setI8(i13, (byte)1);
/* 249 */             MainMemory.setI8(i14, (byte)0);
/* 250 */             MainMemory.setI8(paramInt2, (byte)1);
/* 251 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 256 */             MainMemory.setI8(i13, (byte)0);
/* 257 */             MainMemory.setI8(i14, (byte)0);
/* 258 */             MainMemory.setI8(paramInt2, (byte)1);
/* 259 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 264 */             MainMemory.setI8(i13, (byte)1);
/* 265 */             MainMemory.setI8(i14, (byte)1);
/* 266 */             MainMemory.setI8(paramInt2, (byte)0);
/* 267 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 272 */             MainMemory.setI8(i13, (byte)0);
/* 273 */             MainMemory.setI8(i14, (byte)1);
/* 274 */             MainMemory.setI8(paramInt2, (byte)0);
/* 275 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 280 */             MainMemory.setI8(i13, (byte)1);
/* 281 */             MainMemory.setI8(i14, (byte)0);
/* 282 */             MainMemory.setI8(paramInt2, (byte)0);
/* 283 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */             break label1051;
/*     */             
/* 288 */             MainMemory.setI8(i13, (byte)0);
/* 289 */             MainMemory.setI8(i14, (byte)0);
/* 290 */             MainMemory.setI8(paramInt2, (byte)0);
/* 291 */             MainMemory.setI8(i12, (byte)0);
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */             i10 += 1;
/* 298 */           } while (k > i15);
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
/* 309 */           i3 = i4 + i11;
/* 310 */           i6 += i11;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label1093:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */           if (i15 >= paramInt4) {
/*     */             break label1159;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */           paramInt2 = paramInt5 + i3;
/* 333 */           MainMemory.setI8(paramInt5 + i6, MathUtils.and(MathUtils.lshr(MainMemory.getI8(paramInt2), 1), (byte)1));
/* 334 */           MainMemory.setI8(paramInt2, MathUtils.and(MathUtils.lshr(MainMemory.getI8(paramInt2), 3), (byte)1));
/*     */           
/*     */ 
/*     */           label1159:
/*     */           
/*     */ 
/* 340 */           i2 += 1;
/* 341 */           if (j <= i9)
/*     */             break;
/*     */         }
/*     */         break label1189;
/* 345 */         i = i9;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1189:
/*     */       
/*     */ 
/*     */ 
/* 354 */       if (i >= paramInt3) {
/*     */         break label1397;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 364 */       j = i * paramInt4;
/* 365 */       k = paramInt4 + -1;
/* 366 */       if (k <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 371 */         i = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 378 */         n = j + 1;
/* 379 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 386 */           i1 = i9 << 1;
/* 387 */           i = i1 + 2;
/* 388 */           paramInt2 = paramInt5 + (j + i1);
/* 389 */           MainMemory.setI8(paramInt5 + (n + i1), MathUtils.and(MathUtils.lshr(MainMemory.getI8(paramInt2), 2), (byte)1));
/* 390 */           MainMemory.setI8(paramInt2, MathUtils.and(MathUtils.lshr(MainMemory.getI8(paramInt2), 3), (byte)1));
/* 391 */           i9 += 1;
/* 392 */         } while (k > i);
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
/* 403 */         j = j + 2 + i1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 413 */       if (i >= paramInt4) {
/*     */         break label1397;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 423 */       paramInt2 = paramInt5 + j;
/* 424 */       MainMemory.setI8(paramInt2, MathUtils.and(MathUtils.lshr(MainMemory.getI8(paramInt2), 3), (byte)1));
/*     */       
/*     */ 
/*     */       label1397:
/*     */       
/*     */ 
/* 430 */       paramInt3 = paramInt4 * paramInt3;
/* 431 */       paramInt4 = paramInt3 + -1;
/* 432 */       if (paramInt4 > -1) {
/* 433 */         i = 0;
/*     */       } else {
/*     */         break label1490;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 444 */         paramInt2 = paramInt5 + (paramInt4 - i);
/* 445 */         if (MainMemory.getI8(paramInt2) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 455 */           MainMemory.setI8(paramInt2, (byte)F423138.call(paramInt1));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 461 */         i += 1;
/* 462 */         if (i == paramInt3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1490:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 478 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F423307.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */