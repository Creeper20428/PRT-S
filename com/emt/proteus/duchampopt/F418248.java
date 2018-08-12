/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F418248 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3648;
/*  11 */   public static final Function _instance = new F418248();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F418248() { super("F418248", 3, false); }
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
/*  50 */     long l = 0L;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  56 */       if (paramInt2 != 1) {
/*     */         break label208;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       paramInt2 = MainMemory.getI32Aligned(459424) << 4 | MainMemory.getI8(paramInt3) & 0xFF & 0xF;
/*  67 */       MainMemory.setI32Aligned(459424, paramInt2);
/*  68 */       i = MainMemory.getI32Aligned(459428);
/*  69 */       j = i + -4;
/*  70 */       MainMemory.setI32Aligned(459428, j);
/*  71 */       if (j >= 1) {
/*     */         break label184;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */       j = MainMemory.getI32Aligned(459432);
/*  82 */       MainMemory.setI8(paramInt1 + j, (byte)(paramInt2 >> 4 - i));
/*  83 */       if (j >= MainMemory.getI32Aligned(459436)) {
/*     */         break label171;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       MainMemory.setI32Aligned(459432, j + 1);
/*     */       
/*     */ 
/*     */       label171:
/*     */       
/*     */ 
/*  99 */       MainMemory.setI32Aligned(459428, i + 4);
/*     */       
/*     */ 
/*     */       label184:
/*     */       
/*     */ 
/* 105 */       MainMemory.setI64Aligned(467236, MainMemory.getI64Aligned(467236) + 4L);
/*     */       
/*     */ 
/*     */       break label1168;
/*     */       
/*     */       label208:
/*     */       
/* 112 */       j = MainMemory.getI32Aligned(459428);
/* 113 */       if (j >= 5)
/*     */       {
/*     */ 
/*     */ 
/* 117 */         i = j;
/* 118 */         j = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 125 */         i = MainMemory.getI32Aligned(459424) << 4 | MainMemory.getI8(paramInt3) & 0xFF & 0xF;
/* 126 */         MainMemory.setI32Aligned(459424, i);
/* 127 */         k = j + -4;
/* 128 */         MainMemory.setI32Aligned(459428, k);
/* 129 */         if (k >= 1)
/*     */         {
/*     */ 
/*     */ 
/* 133 */           j = k;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 140 */           k = MainMemory.getI32Aligned(459432);
/* 141 */           MainMemory.setI8(paramInt1 + k, (byte)(i >> 4 - j));
/* 142 */           if (k >= MainMemory.getI32Aligned(459436)) {
/*     */             break label361;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */           MainMemory.setI32Aligned(459432, k + 1);
/*     */           
/*     */ 
/*     */           label361:
/*     */           
/*     */ 
/* 158 */           j += 4;
/* 159 */           MainMemory.setI32Aligned(459428, j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         l = MainMemory.getI64Aligned(467236);
/* 168 */         MainMemory.setI64Aligned(467236, l + 4L);
/* 169 */         if (paramInt2 != 2)
/*     */         {
/*     */ 
/*     */ 
/* 173 */           i = j;
/* 174 */           j = 1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 181 */           paramInt2 = i << 4 | MainMemory.getI8(paramInt3 + 1) & 0xFF & 0xF;
/* 182 */           MainMemory.setI32Aligned(459424, paramInt2);
/* 183 */           i = j + -4;
/* 184 */           MainMemory.setI32Aligned(459428, i);
/* 185 */           if (i >= 1) {
/*     */             break label543;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */           i = MainMemory.getI32Aligned(459432);
/* 196 */           MainMemory.setI8(paramInt1 + i, (byte)(paramInt2 >> 4 - j));
/* 197 */           if (i >= MainMemory.getI32Aligned(459436)) {
/*     */             break label529;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */           MainMemory.setI32Aligned(459432, i + 1);
/*     */           
/*     */ 
/*     */           label529:
/*     */           
/*     */ 
/* 213 */           MainMemory.setI32Aligned(459428, j + 4);
/*     */           
/*     */ 
/*     */           label543:
/*     */           
/*     */ 
/* 219 */           MainMemory.setI64Aligned(467236, l + 8L);
/*     */           
/*     */ 
/*     */ 
/*     */           break label1168;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 228 */       k = 8 - i;
/* 229 */       m = paramInt2 - j;
/* 230 */       n = m / 2;
/* 231 */       if (i != 8) {
/*     */         break label771;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */       MainMemory.setI32Aligned(459424, 0);
/* 242 */       if (m <= 1)
/*     */       {
/*     */ 
/*     */ 
/* 246 */         k = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 254 */         k = n > 1 ? n : 1;
/* 255 */         m = k << 1;
/* 256 */         n = j + 1;
/* 257 */         i1 = MainMemory.getI32Aligned(459432);
/*     */         
/* 259 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 267 */           i3 = i2 << 1;
/* 268 */           MainMemory.setI8(paramInt1 + i1, MathUtils.or(MathUtils.and(MainMemory.getI8(paramInt3 + (n + i3)), (byte)15), MathUtils.shl(MainMemory.getI8(paramInt3 + (j | i3)), 4)));
/* 269 */           i1 += 1;
/* 270 */           MainMemory.setI32Aligned(459432, i1);
/* 271 */           i2 += 1;
/* 272 */           if (i2 == k) {
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
/* 284 */         j |= m;
/*     */         
/*     */ 
/*     */         break label968;
/*     */         
/*     */         label771:
/*     */         
/* 291 */         if (m <= 1)
/*     */         {
/*     */ 
/*     */ 
/* 295 */           k = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 303 */           m = n > 1 ? n : 1;
/* 304 */           n = m << 1;
/* 305 */           i1 = j + 1;
/* 306 */           i3 = MainMemory.getI32Aligned(459432);
/* 307 */           i2 = MainMemory.getI32Aligned(459424);
/*     */           
/*     */ 
/* 310 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 319 */             i5 = i4 << 1;
/* 320 */             i2 = MainMemory.getI8(paramInt3 + (i1 + i5)) & 0xFF & 0xF | i2 << 8 | (MainMemory.getI8(paramInt3 + (j | i5)) & 0xFF) << 4 & 0xF0;
/* 321 */             MainMemory.setI32Aligned(459424, i2);
/* 322 */             MainMemory.setI8(paramInt1 + i3, (byte)(i2 >> k));
/* 323 */             i3 += 1;
/* 324 */             MainMemory.setI32Aligned(459432, i3);
/* 325 */             i4 += 1;
/* 326 */             if (i4 == m) {
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
/*     */ 
/*     */ 
/* 339 */           j |= n;
/* 340 */           k = m;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label968:
/*     */       
/*     */ 
/* 349 */       l = (k << 3) + -8 + MainMemory.getI64Aligned(467236);
/* 350 */       MainMemory.setI64Aligned(467236, l);
/* 351 */       if (j != paramInt2) {
/*     */         break label1020;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1168;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1020:
/*     */       
/*     */ 
/*     */ 
/* 367 */       paramInt2 = MainMemory.getI32Aligned(459424) << 4 | MainMemory.getI8(paramInt3 + (paramInt2 + -1)) & 0xFF & 0xF;
/* 368 */       MainMemory.setI32Aligned(459424, paramInt2);
/* 369 */       j = i + -4;
/* 370 */       MainMemory.setI32Aligned(459428, j);
/* 371 */       if (j >= 1) {
/*     */         break label1152;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */       j = MainMemory.getI32Aligned(459432);
/* 382 */       MainMemory.setI8(paramInt1 + j, (byte)(paramInt2 >> 4 - i));
/* 383 */       if (j >= MainMemory.getI32Aligned(459436)) {
/*     */         break label1139;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */       MainMemory.setI32Aligned(459432, j + 1);
/*     */       
/*     */ 
/*     */       label1139:
/*     */       
/*     */ 
/* 399 */       MainMemory.setI32Aligned(459428, i + 4);
/*     */       
/*     */ 
/*     */       label1152:
/*     */       
/*     */ 
/* 405 */       MainMemory.setI64Aligned(467236, l + 4L);
/*     */       
/*     */ 
/*     */       label1168:
/*     */       
/*     */ 
/* 411 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F418248.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */