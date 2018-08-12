/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F429182 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3681;
/*  11 */   public static final Function _instance = new F429182();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F429182() { super("F429182", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  63 */       i = paramInt1 + 5792;
/*  64 */       if (MainMemory.getI32(i) != 0) {
/*     */         break label105;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */       i = paramInt1 + 5820;
/*  75 */       i3 = MainMemory.getI32(i);
/*     */       
/*  77 */       i5 = i3;
/*     */       
/*     */       break label1565;
/*     */       
/*     */       label105:
/*  82 */       j = paramInt1 + 5796;
/*  83 */       k = paramInt1 + 5784;
/*  84 */       m = paramInt1 + 5820;
/*  85 */       n = paramInt1 + 5816;
/*  86 */       i1 = paramInt1 + 8;
/*  87 */       i2 = paramInt1 + 20;
/*  88 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  95 */         i3 = i5 + 1;
/*  96 */         i12 = MainMemory.getI16(MainMemory.getI32(j) + (i5 << 1));
/*  97 */         i4 = i12 & 0xFFFF;
/*  98 */         i5 = MainMemory.getI8(MainMemory.getI32(k) + i5) & 0xFF;
/*  99 */         if (i12 != 0) {
/*     */           break label465;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         i4 = MainMemory.getI16(paramInt2 + (i5 << 2) + 2) & 0xFFFF;
/* 110 */         i6 = MainMemory.getI32(m);
/* 111 */         if (i6 <= 16 - i4) {
/*     */           break label412;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         i5 = MainMemory.getI16(paramInt2 + (i5 << 2)) & 0xFFFF;
/* 122 */         i12 = MathUtils.or((short)(i5 << i6), MainMemory.getI16(n));
/* 123 */         MainMemory.setI16(n, i12);
/* 124 */         i6 = MainMemory.getI32(i2);
/* 125 */         MainMemory.setI8(MainMemory.getI32(i1) + i6, (byte)i12);
/* 126 */         i7 = i6 + 1;
/* 127 */         MainMemory.setI32(i2, i7);
/* 128 */         MainMemory.setI8(MainMemory.getI32(i1) + i7, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 129 */         MainMemory.setI32(i2, i6 + 2);
/* 130 */         i6 = MainMemory.getI32(m);
/* 131 */         MainMemory.setI16(n, (short)(i5 >>> 16 - i6));
/* 132 */         i4 = i4 + -16 + i6;
/* 133 */         MainMemory.setI32(m, i4);
/*     */         
/*     */         break label1529;
/*     */         
/*     */         label412:
/*     */         
/* 139 */         MainMemory.setI16(n, MathUtils.or((short)((MainMemory.getI16(paramInt2 + (i5 << 2)) & 0xFFFF) << i6), MainMemory.getI16(n)));
/* 140 */         i4 = i6 + i4;
/* 141 */         MainMemory.setI32(m, i4);
/*     */         
/*     */         break label1529;
/*     */         
/*     */         label465:
/*     */         
/* 147 */         i6 = MainMemory.getI8(148416 + i5) & 0xFF;
/* 148 */         i10 = i6 + 257;
/* 149 */         i7 = MainMemory.getI16(paramInt2 + (i10 << 2) + 2) & 0xFFFF;
/* 150 */         i8 = MainMemory.getI32(m);
/* 151 */         if (i8 <= 16 - i7) {
/*     */           break label684;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */         i10 = MainMemory.getI16(paramInt2 + (i10 << 2)) & 0xFFFF;
/* 162 */         s = MathUtils.or((short)(i10 << i8), MainMemory.getI16(n));
/* 163 */         MainMemory.setI16(n, s);
/* 164 */         i8 = MainMemory.getI32(i2);
/* 165 */         MainMemory.setI8(MainMemory.getI32(i1) + i8, (byte)s);
/* 166 */         i9 = i8 + 1;
/* 167 */         MainMemory.setI32(i2, i9);
/* 168 */         MainMemory.setI8(MainMemory.getI32(i1) + i9, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 169 */         MainMemory.setI32(i2, i8 + 2);
/* 170 */         i8 = MainMemory.getI32(m);
/* 171 */         s = (short)(i10 >>> 16 - i8);
/* 172 */         MainMemory.setI16(n, s);
/* 173 */         i7 = i7 + -16 + i8;
/* 174 */         i10 = i7;
/*     */         
/*     */         break label733;
/*     */         
/*     */         label684:
/*     */         
/* 180 */         s = MathUtils.or((short)((MainMemory.getI16(paramInt2 + (i10 << 2)) & 0xFFFF) << i8), MainMemory.getI16(n));
/* 181 */         MainMemory.setI16(n, s);
/* 182 */         i7 = i8 + i7;
/* 183 */         i10 = i7;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label733:
/*     */         
/*     */ 
/*     */ 
/* 192 */         MainMemory.setI32(m, i10);
/* 193 */         i7 = MainMemory.getI32(145664 + (i6 << 2));
/* 194 */         if (!MathUtils.ult(i6 + -8, 20))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 199 */           i7 = i10;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 206 */           i11 = i10 > 16 - i7 ? 1 : 0;
/* 207 */           i5 = i5 - MainMemory.getI32(145792 + (i6 << 2)) & 0xFFFF;
/* 208 */           s = MathUtils.or((short)(i5 << i10), s);
/* 209 */           MainMemory.setI16(n, s);
/* 210 */           if (i11 == 0) {
/*     */             break label976;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */           i6 = MainMemory.getI32(i2);
/* 221 */           MainMemory.setI8(MainMemory.getI32(i1) + i6, (byte)s);
/* 222 */           i10 = i6 + 1;
/* 223 */           MainMemory.setI32(i2, i10);
/* 224 */           MainMemory.setI8(MainMemory.getI32(i1) + i10, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 225 */           MainMemory.setI32(i2, i6 + 2);
/* 226 */           i6 = MainMemory.getI32(m);
/* 227 */           s = (short)(i5 >>> 16 - i6);
/* 228 */           MainMemory.setI16(n, s);
/* 229 */           i5 = i7 + -16 + i6;
/* 230 */           MainMemory.setI32(m, i5);
/*     */           
/* 232 */           i7 = i5;
/*     */           
/*     */           break label999;
/*     */           
/*     */           label976:
/* 237 */           i5 = i10 + i7;
/* 238 */           MainMemory.setI32(m, i5);
/*     */           
/* 240 */           i7 = i5;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label999:
/*     */         
/*     */ 
/* 248 */         i4 += -1;
/* 249 */         if (MathUtils.ult(i4, 256)) {
/* 250 */           i5 = i4;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 260 */           i5 = (i4 >>> 7) + 256;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */         i5 = MainMemory.getI8(151392 + i5) & 0xFF;
/* 269 */         i6 = MainMemory.getI16(paramInt3 + (i5 << 2) + 2) & 0xFFFF;
/* 270 */         i11 = i7 > 16 - i6 ? 1 : 0;
/* 271 */         i10 = MainMemory.getI16(paramInt3 + (i5 << 2)) & 0xFFFF;
/* 272 */         s = MathUtils.or((short)(i10 << i7), s);
/* 273 */         MainMemory.setI16(n, s);
/* 274 */         if (i11 == 0) {
/*     */           break label1259;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */         i7 = MainMemory.getI32(i2);
/* 285 */         MainMemory.setI8(MainMemory.getI32(i1) + i7, (byte)s);
/* 286 */         i8 = i7 + 1;
/* 287 */         MainMemory.setI32(i2, i8);
/* 288 */         MainMemory.setI8(MainMemory.getI32(i1) + i8, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 289 */         MainMemory.setI32(i2, i7 + 2);
/* 290 */         i7 = MainMemory.getI32(m);
/* 291 */         s = (short)(i10 >>> 16 - i7);
/* 292 */         MainMemory.setI16(n, s);
/* 293 */         i6 = i6 + -16 + i7;
/* 294 */         i7 = i6;
/*     */         
/*     */         break label1275;
/*     */         
/*     */         label1259:
/*     */         
/* 300 */         i6 = i7 + i6;
/* 301 */         i7 = i6;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1275:
/*     */         
/*     */ 
/*     */ 
/* 310 */         MainMemory.setI32(m, i7);
/* 311 */         i6 = MainMemory.getI32(146048 + (i5 << 2));
/* 312 */         if (!MathUtils.ult(i5 + -4, 26))
/*     */         {
/*     */ 
/*     */ 
/* 316 */           i4 = i7;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 323 */           i11 = i7 > 16 - i6 ? 1 : 0;
/* 324 */           i4 = i4 - MainMemory.getI32(146176 + (i5 << 2)) & 0xFFFF;
/* 325 */           s = MathUtils.or((short)(i4 << i7), s);
/* 326 */           MainMemory.setI16(n, s);
/* 327 */           if (i11 == 0) {
/*     */             break label1510;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */           i5 = MainMemory.getI32(i2);
/* 338 */           MainMemory.setI8(MainMemory.getI32(i1) + i5, (byte)s);
/* 339 */           i7 = i5 + 1;
/* 340 */           MainMemory.setI32(i2, i7);
/* 341 */           MainMemory.setI8(MainMemory.getI32(i1) + i7, (byte)MathUtils.lshr(MainMemory.getI16(n), 8));
/* 342 */           MainMemory.setI32(i2, i5 + 2);
/* 343 */           i5 = MainMemory.getI32(m);
/* 344 */           MainMemory.setI16(n, (short)(i4 >>> 16 - i5));
/* 345 */           i4 = i6 + -16 + i5;
/* 346 */           MainMemory.setI32(m, i4);
/*     */           
/*     */           break label1529;
/*     */           
/*     */           label1510:
/*     */           
/* 352 */           i4 = i7 + i6;
/* 353 */           MainMemory.setI32(m, i4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1529:
/*     */         
/*     */ 
/* 361 */         if (!MathUtils.ugt(MainMemory.getI32(i), i3)) break;
/* 362 */         i5 = i3;
/*     */       }
/*     */       break label1565;
/* 365 */       i = m;
/* 366 */       i5 = i4;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1565:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 376 */       n = paramInt2 + 1026;
/* 377 */       i3 = MainMemory.getI16(n) & 0xFFFF;
/* 378 */       if (i5 <= 16 - i3) {
/*     */         break label1765;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 388 */       i13 = paramInt1 + 5816;
/* 389 */       i4 = MainMemory.getI16(paramInt2 + 1024) & 0xFFFF;
/* 390 */       short s = MathUtils.or((short)(i4 << i5), MainMemory.getI16(i13));
/* 391 */       MainMemory.setI16(i13, s);
/* 392 */       k = paramInt1 + 8;
/* 393 */       m = paramInt1 + 20;
/* 394 */       i5 = MainMemory.getI32(m);
/* 395 */       MainMemory.setI8(MainMemory.getI32(k) + i5, (byte)s);
/* 396 */       i6 = i5 + 1;
/* 397 */       MainMemory.setI32(m, i6);
/* 398 */       MainMemory.setI8(MainMemory.getI32(k) + i6, (byte)MathUtils.lshr(MainMemory.getI16(i13), 8));
/* 399 */       MainMemory.setI32(m, i5 + 2);
/* 400 */       i5 = MainMemory.getI32(i);
/* 401 */       MainMemory.setI16(i13, (short)(i4 >>> 16 - i5));
/* 402 */       i3 = i3 + -16 + i5;
/*     */       
/*     */       break label1812;
/*     */       
/*     */       label1765:
/*     */       
/* 408 */       i13 = paramInt1 + 5816;
/* 409 */       MainMemory.setI16(i13, MathUtils.or((short)((MainMemory.getI16(paramInt2 + 1024) & 0xFFFF) << i5), MainMemory.getI16(i13)));
/* 410 */       i3 = i5 + i3;
/*     */       
/*     */ 
/*     */ 
/*     */       label1812:
/*     */       
/*     */ 
/*     */ 
/* 418 */       MainMemory.setI32(i, i3);
/* 419 */       MainMemory.setI32(paramInt1 + 5812, MainMemory.getI16(n) & 0xFFFF); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F429182.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */