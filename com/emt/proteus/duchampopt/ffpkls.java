/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffpkls
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3584;
/*  15 */   public static final Function _instance = new ffpkls();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpkls() { super("ffpkls", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, m, n);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*     */     
/*     */ 
/*  66 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(81);
/*  71 */       j = MainMemory.alloc(81);
/*  72 */       k = MainMemory.alloc(81);
/*  73 */       m = MainMemory.alloc(81);
/*  74 */       n = MainMemory.alloc(4);
/*  75 */       MainMemory.setI32(n, -1);
/*  76 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         i1 = SystemLibrary.strlen(paramInt3);
/*  87 */         i1 = MathUtils.ugt(i1, 1) ? i1 : 1;
/*  88 */         MainMemory.setI8(m, (byte)0);
/*  89 */         SystemLibrary.strncat(m, paramInt3, 68);
/*  90 */         i4 = SystemLibrary.strchr(m, 39);
/*  91 */         if (i4 == 0) {
/*  92 */           i2 = 0;
/*  93 */           i8 = 0;
/*     */           break label229;
/*     */         } else {
/*  96 */           i2 = 0;
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
/* 107 */           i4 = SystemLibrary.strchr(i4 + 1, 39);
/* 108 */           i8 = i2 + 1;
/* 109 */           if (i4 == 0) {
/*     */             break;
/*     */           }
/*     */           
/* 113 */           i2 = i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         i2 ^= 0xFFFFFFFF;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label229:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 131 */         SystemLibrary.strncpy(k, paramInt2, 80);
/* 132 */         MainMemory.setI8(k + 80, (byte)0);
/* 133 */         i3 = MainMemory.getI8(k);
/* 134 */         if (i3 == 32) {
/* 135 */           i5 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 140 */           i4 = k;
/*     */           
/*     */ 
/*     */           break label318;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/* 148 */           i5 += 1;
/* 149 */           i4 = k + i5;
/* 150 */           i3 = MainMemory.getI8(i4);
/* 151 */         } while (i3 == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label318:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         i5 = SystemLibrary.strlen(i4);
/* 167 */         if (i5 <= 8)
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
/* 178 */           if (fftkey.call(i4, n) <= 0) {
/*     */             break label543;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           i3 = MainMemory.getI8(i4);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 196 */           switch (i3)
/*     */           {
/*     */           case 72: 
/*     */             break;
/*     */           case 104: 
/*     */             break label470;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 207 */           if (SystemLibrary.strncmp(i4, 47360, 9) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */             if (i3 != 104) {
/*     */               break label519;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label470:
/*     */             
/*     */ 
/*     */ 
/* 227 */             if (SystemLibrary.strncmp(i4, 47392, 9) != 0) {
/*     */               break label519;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */           i2 = i2 + 75 - i5;
/* 238 */           i8 = i2;
/*     */           
/*     */           break label559;
/*     */           
/*     */           label519:
/* 243 */           i2 = i2 + 66 - i5;
/* 244 */           i8 = i2;
/*     */           
/*     */           break label559;
/*     */         }
/*     */         label543:
/* 249 */         i2 = 68 - i8;
/* 250 */         i8 = i2;
/*     */         
/*     */ 
/*     */ 
/*     */         label559:
/*     */         
/*     */ 
/* 257 */         if (i1 <= 0) {
/*     */           break label969;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */         i6 = j + 8;
/* 268 */         i2 = 0;
/* 269 */         i5 = i8;
/*     */         
/* 271 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 281 */           MainMemory.setI8(m, (byte)0);
/* 282 */           SystemLibrary.strncat(m, paramInt3 + i8, i5);
/* 283 */           ffs2c.call(m, i, MainMemory.getI32(paramInt5));
/* 284 */           if (i1 <= i5) {
/*     */             break label741;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */           i7 = SystemLibrary.strlen(i);
/* 296 */           i5 += -1;
/* 297 */           i4 = i + (i7 + -2);
/* 298 */           if (MainMemory.getI8(i4) != 39) {
/*     */             break label729;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */           MainMemory.setI8(i + (i7 + -3), (byte)38);
/* 309 */           MainMemory.setI8(i + (i7 + -1), (byte)0);
/*     */           
/*     */           break label741;
/*     */           
/*     */           label729:
/*     */           
/* 315 */           MainMemory.setI8(i4, (byte)38);
/*     */           
/*     */ 
/*     */ 
/*     */           label741:
/*     */           
/*     */ 
/*     */ 
/* 323 */           if (i2 != 0) {
/*     */             break label780;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */           ffmkky.call(paramInt2, i, paramInt4, j, paramInt5);
/*     */           
/*     */           break label805;
/*     */           
/*     */           label780:
/* 338 */           ffmkky.call(44288, i, paramInt4, j, paramInt5);
/* 339 */           MainMemory.setI16(i6, (short)8224);
/*     */           
/*     */ 
/*     */           label805:
/*     */           
/*     */ 
/* 345 */           ffprec.call(paramInt1, j, paramInt5);
/* 346 */           i1 -= i5;
/* 347 */           i8 = i5 + i8;
/* 348 */           i9 = i1 > 0 ? 1 : 0;
/* 349 */           if (i9 == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */           MainMemory.setI8(m, (byte)0);
/* 360 */           SystemLibrary.strncat(m, paramInt3 + i8, 68);
/* 361 */           i4 = SystemLibrary.strchr(m, 39);
/* 362 */           if (i4 == 0) {
/* 363 */             i2 = 0;
/*     */             break label944;
/*     */           } else {
/* 366 */             i2 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 377 */             i4 = SystemLibrary.strchr(i4 + 1, 39);
/* 378 */             i2 += 1;
/* 379 */             if (i4 == 0) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label944:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 393 */           i5 = 68 - i2;
/* 394 */           if (i9 == 0) break;
/* 395 */           i2 = 1;
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label969:
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpkls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */