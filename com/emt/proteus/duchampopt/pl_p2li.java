/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class pl_p2li extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3645;
/*  11 */   public static final Function _instance = new pl_p2li();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public pl_p2li() { super("pl_p2li", 3, false); }
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
/*  54 */     short s = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*  59 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (paramInt3 <= 0) {
/*     */         break label1174;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       MainMemory.setI16(paramInt2 + 4, (short)-100);
/*  76 */       MainMemory.setI16(paramInt2 + 2, (short)7);
/*  77 */       MainMemory.setI16(paramInt2, (short)0);
/*  78 */       MainMemory.setI16(paramInt2 + 10, (short)0);
/*  79 */       MainMemory.setI16(paramInt2 + 12, (short)0);
/*  80 */       j = paramInt3 + 1;
/*  81 */       i3 = MainMemory.getI32(paramInt1);
/*  82 */       if (paramInt3 < 1) {
/*  83 */         paramInt3 = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  93 */         i3 = i3 < 0 ? 0 : i3;
/*  94 */         i4 = 0;
/*  95 */         i10 = i3;
/*  96 */         i6 = 0;
/*  97 */         k = 1;
/*  98 */         m = 8;
/*  99 */         n = 1;
/* 100 */         i5 = 1;
/* 101 */         i1 = 1;
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
/*     */         for (;;)
/*     */         {
/* 115 */           i2 = i4 + 61443;
/* 116 */           i3 = i4 + 2;
/* 117 */           i4 += 1;
/* 118 */           if (i4 >= paramInt3) {
/*     */             break label320;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           i6 = MainMemory.getI32(paramInt1 + (i4 << 2));
/* 129 */           i6 = i6 < 0 ? 0 : i6;
/* 130 */           if (i6 == i10) {
/* 131 */             i2 = i1;
/*     */             
/*     */ 
/*     */ 
/* 135 */             i7 = i6;
/* 136 */             i6 = i10;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 146 */             if (i10 != 0) {
/*     */               break label347;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */             i5 = n + 1;
/* 159 */             i2 = i1;
/*     */             
/*     */ 
/*     */ 
/* 163 */             i7 = i6;
/*     */             
/*     */             break label1094;
/*     */             
/*     */             label320:
/*     */             
/* 169 */             if (i10 != 0) {
/*     */               break label347;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */             i5 = j;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label347:
/*     */             
/*     */ 
/*     */ 
/* 190 */             i7 = i5 - k;
/* 191 */             i8 = i10 < 1 ? 1 : 0;
/* 192 */             if (i8 != 0) {
/* 193 */               i10 = i1;
/* 194 */               i1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 204 */               i11 = i10 - i1;
/* 205 */               if (i10 == i1) {
/* 206 */                 i10 = i1;
/* 207 */                 i1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 217 */                 i9 = i11 > -1 ? 1 : 0;
/* 218 */                 if ((i9 != 0 ? i11 : 0 - i11) >= 4096) {
/*     */                   break label631;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */                 s = (short)i11;
/* 229 */                 if (i9 == 0) {
/*     */                   break label523;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */                 s = (short)(s + 8192);
/* 240 */                 MainMemory.setI16(paramInt2 + (m + -1 << 1), s);
/*     */                 
/*     */                 break label550;
/*     */                 
/*     */                 label523:
/*     */                 
/* 246 */                 s = (short)(12288 - s);
/* 247 */                 MainMemory.setI16(paramInt2 + (m + -1 << 1), s);
/*     */                 
/*     */ 
/*     */ 
/*     */                 label550:
/*     */                 
/*     */ 
/*     */ 
/* 255 */                 i1 = m + 1;
/* 256 */                 if ((i3 - i5 != 1) || (i5 == k))
/*     */                 {
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
/* 268 */                   MainMemory.setI16(paramInt2 + (m + -1 << 1), MathUtils.or(s, (short)16384));
/* 269 */                   i2 = i10;
/* 270 */                   i5 = i3;
/* 271 */                   m = i1;
/* 272 */                   k = i3;
/* 273 */                   i7 = i6;
/*     */                   
/*     */                   break label1094;
/*     */                   
/*     */                   label631:
/*     */                   
/* 279 */                   MainMemory.setI16(paramInt2 + (m + -1 << 1), MathUtils.or(MathUtils.and((short)i10, (short)4095), (short)4096));
/* 280 */                   MainMemory.setI16(paramInt2 + (m << 1), (short)(i10 / 4096));
/* 281 */                   m += 2;
/*     */                   
/* 283 */                   i1 = m;
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 291 */             if (i7 < 1) {
/* 292 */               i7 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 302 */               k = i5 + 61441 - k;
/* 303 */               m = i1 + -1;
/* 304 */               i1 += 1;
/* 305 */               i11 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 312 */                 i12 = i11 * 61441;
/* 313 */                 i13 = i7 + i12;
/* 314 */                 MainMemory.setI16(paramInt2 + (m + i11 << 1), i13 > 4095 ? 4095 : (short)i13);
/* 315 */                 i13 = i11 + 1;
/* 316 */                 if (k + i12 < 1) {
/*     */                   break;
/*     */                 }
/*     */                 
/* 320 */                 i11 = i13;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */               k = i1 + i11;
/* 328 */               if ((i3 - i5 != 1) || (i8 != 0)) {
/* 329 */                 i7 = k;
/*     */               } else {
/*     */                 break label1043;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */             k = i3 - i5;
/* 341 */             if (k < 1) {
/* 342 */               i2 = i10;
/* 343 */               i5 = i3;
/* 344 */               m = i7;
/* 345 */               k = i3;
/* 346 */               i7 = i6;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 357 */               m = i7 + -1;
/* 358 */               i7 += 1;
/* 359 */               i1 = k + 16384;
/* 360 */               i2 -= i5;
/* 361 */               i5 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 368 */                 i11 = i5 * 61441;
/* 369 */                 MainMemory.setI16(paramInt2 + (m + i5 << 1), k + i11 > 4095 ? 20479 : (short)(i1 + i11));
/* 370 */                 i12 = i5 + 1;
/* 371 */                 if (i2 + i11 < 1) {
/*     */                   break;
/*     */                 }
/*     */                 
/* 375 */                 i5 = i12;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */               k = i7 + i5;
/* 383 */               i2 = i10;
/* 384 */               i5 = i3;
/* 385 */               m = k;
/* 386 */               k = i3;
/* 387 */               i7 = i6;
/*     */               
/*     */               break label1094;
/*     */               
/*     */               label1043:
/*     */               
/* 393 */               i14 = paramInt2 + (k + -2 << 1);
/* 394 */               MainMemory.setI16(i14, (short)(MainMemory.getI16(i14) + 20481));
/* 395 */               i2 = i10;
/* 396 */               i5 = i3;
/* 397 */               m = k;
/* 398 */               k = i3;
/* 399 */               i7 = i6;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label1094:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 412 */           n += 1;
/* 413 */           if (i3 > paramInt3) {
/* 414 */             paramInt3 = m; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 419 */           i10 = i6;
/* 420 */           i6 = i7;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 425 */           i1 = i2;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */       paramInt3 += -1;
/* 434 */       MainMemory.setI16(paramInt2 + 6, (short)(paramInt3 % 32768));
/* 435 */       MainMemory.setI16(paramInt2 + 8, (short)(paramInt3 / 32768));
/* 436 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       break label1181;
/*     */       
/*     */       label1174:
/*     */       
/* 443 */       i = 0;
/*     */       
/*     */ 
/*     */       label1181:
/*     */       
/*     */ 
/* 449 */       int i15 = i; return i15;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/pl_p2li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */