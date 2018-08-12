/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class wcspih_inits
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2934;
/*  15 */   public static final Function _instance = new wcspih_inits();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public wcspih_inits() { super("wcspih_inits", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  45 */     int i2 = call(i, j, k, m, n, i1);
/*  46 */     paramFrame.setI32(paramInt1, i2);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  52 */     int i = 0;
/*     */     
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     byte b = 0;
/*  63 */     int i5 = 0;
/*  64 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       MainMemory.setI32(paramInt5, 0);
/*  71 */       n = 0;
/*  72 */       i1 = 0;
/*  73 */       j = 0;
/*  74 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  84 */         if (MainMemory.getI32(paramInt2 + (i2 << 2)) != 0)
/*     */         {
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
/*  97 */           j += 1;
/*  98 */           MainMemory.setI32(paramInt5, j);
/*  99 */           n = j;
/* 100 */           i1 = j;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         i2 += 1;
/* 111 */         if (i2 == 27) {
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
/*     */ 
/*     */ 
/*     */ 
/* 125 */       k = i1 == 0 ? 1 : 0;
/* 126 */       if ((k == 0) || (paramInt1 == 0)) {
/*     */         break label250;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       n = MainMemory.getI32(paramInt2);
/* 137 */       if (n >= paramInt1)
/*     */       {
/*     */ 
/*     */ 
/* 141 */         paramInt1 = n;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 148 */         MainMemory.setI32(paramInt2, paramInt1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       if (paramInt1 >= 0) {
/*     */         break label232;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */       MainMemory.setI32(paramInt2, 0);
/*     */       
/*     */ 
/*     */       label232:
/*     */       
/*     */ 
/* 172 */       MainMemory.setI32(paramInt5, 1);
/* 173 */       paramInt1 = 1;
/*     */       
/*     */       break label273;
/*     */       
/*     */       label250:
/* 178 */       if (k != 0) {
/* 179 */         paramInt1 = 0;
/*     */         break label313;
/*     */       } else {
/* 182 */         paramInt1 = n;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label273:
/*     */       
/*     */ 
/*     */ 
/* 191 */       m = calloc.call(paramInt1, 1616);
/* 192 */       i3 = m;
/* 193 */       MainMemory.setI32(paramInt6, i3);
/* 194 */       if (m == 0) {
/* 195 */         paramInt1 = 2;
/*     */       } else {
/*     */         break label326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label313:
/*     */       
/*     */ 
/*     */ 
/* 206 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       break label825;
/*     */       
/*     */       label326:
/*     */       
/* 213 */       paramInt1 = MainMemory.getI32Aligned(459540);
/* 214 */       n = MainMemory.getI32Aligned(459536);
/* 215 */       MainMemory.setI32(paramInt5, 0);
/* 216 */       i2 = 0;
/* 217 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 227 */         i4 = paramInt2 + (i2 << 2);
/* 228 */         b = (byte)(i2 + 64);
/* 229 */         i5 = paramInt4 + (i2 << 2);
/* 230 */         i6 = paramInt3 + (i2 << 2);
/* 231 */         if (i2 >= 27)
/*     */         {
/*     */ 
/*     */ 
/* 235 */           i2 = i1;
/*     */           
/*     */ 
/*     */           break label747;
/*     */         }
/*     */         
/*     */ 
/* 242 */         if (MainMemory.getI32(i4) != 0)
/*     */         {
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
/* 254 */           MainMemory.setI32(i3, -1);
/* 255 */           i1 = MainMemory.getI32(i6);
/* 256 */           if (i1 <= -1) {
/*     */             break label474;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */           MainMemory.setI32Aligned(459540, i1);
/*     */           
/*     */ 
/*     */           label474:
/*     */           
/*     */ 
/* 272 */           i1 = MainMemory.getI32(i5);
/* 273 */           if (i1 <= -1) {
/*     */             break label512;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */           MainMemory.setI32Aligned(459536, i1);
/*     */           
/*     */ 
/*     */           label512:
/*     */           
/*     */ 
/* 289 */           i1 = wcsini.call(MainMemory.getI32(i4), i3);
/* 290 */           if (i1 != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */           if (i2 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */             MainMemory.setI8(i3 + 104, b);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 316 */           j = MainMemory.getI32(paramInt5);
/* 317 */           MainMemory.setI32(i4, j);
/* 318 */           MainMemory.setI32(paramInt5, j + 1);
/* 319 */           i3 += 1616;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */         i2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */       if (paramInt6 == 0) {
/* 338 */         i2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 348 */         if (MainMemory.getI32(paramInt5) <= 0) {
/*     */           break label718;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */         i3 = MainMemory.getI32(paramInt6);
/* 359 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 366 */           wcsfree.call(i3 + i2 * 1616);
/* 367 */           i2 += 1;
/* 368 */         } while (MainMemory.getI32(paramInt5) > i2);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label718:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 379 */         free.call(MainMemory.getI32(paramInt6));
/* 380 */         MainMemory.setI32(paramInt5, 0);
/* 381 */         MainMemory.setI32(paramInt6, 0);
/* 382 */         i2 = i1;
/*     */       }
/*     */       
/*     */ 
/*     */       label747:
/*     */       
/*     */ 
/* 389 */       if (paramInt1 <= -1) {
/*     */         break label776;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 399 */       MainMemory.setI32Aligned(459540, paramInt1);
/*     */       
/*     */ 
/*     */       label776:
/*     */       
/*     */ 
/* 405 */       if (n <= -1) {
/*     */         break label816;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 415 */       MainMemory.setI32Aligned(459536, n);
/* 416 */       i = i2;
/*     */       
/*     */ 
/*     */       break label825;
/*     */       
/*     */       label816:
/*     */       
/* 423 */       i = i2;
/*     */       
/*     */ 
/*     */       label825:
/*     */       
/*     */ 
/* 429 */       int i7 = i; return i7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcspih_inits.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */