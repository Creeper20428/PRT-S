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
/*     */ 
/*     */ 
/*     */ public final class ffgpxvll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3281;
/*  17 */   public static final Function _instance = new ffgpxvll();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffgpxvll() { super("ffgpxvll", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, j, l, k, m, n);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     int n = 0;
/*  60 */     int i1 = 0;
/*  61 */     int i2 = 0;
/*  62 */     int i3 = 0;
/*  63 */     long l1 = 0L;
/*  64 */     int i4 = 0;
/*  65 */     long l2 = 0L;
/*  66 */     long l3 = 0L;
/*  67 */     long l4 = 0L;
/*  68 */     long l5 = 0L;
/*  69 */     int i5 = 0;
/*  70 */     int i6 = 0;
/*  71 */     int i7 = 0;
/*  72 */     int i8 = 0;
/*  73 */     long l6 = 0L;
/*     */     
/*     */ 
/*  76 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  80 */       i = MainMemory.alloc(1);
/*  81 */       j = MainMemory.alloc(72);
/*  82 */       k = MainMemory.alloc(72);
/*  83 */       m = MainMemory.alloc(36);
/*  84 */       SystemLibrary.memcpy(k, 141792, 72, 8);
/*  85 */       SystemLibrary.memcpy(m, 85280, 36, 4);
/*  86 */       n = MainMemory.getI32(paramInt5) > 0 ? 1 : 0;
/*  87 */       if ((n == 0) && (paramLong != 0L)) {
/*     */         break label159;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label1147;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label159:
/*     */       
/*     */ 
/*     */ 
/* 103 */       if (n == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         i3 = MainMemory.getI32(paramInt1);
/* 114 */         i1 = paramInt1 + 4;
/* 115 */         i6 = MainMemory.getI32(i1);
/* 116 */         if (i3 != MainMemory.getI32(i6 + 64)) {
/*     */           break label273;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         if (MainMemory.getI64(i6 + 112) != -1L) {
/*     */           break label290;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label376;
/*     */         } else {
/*     */           break label290;
/*     */         }
/*     */         
/*     */ 
/*     */         label273:
/*     */         
/* 145 */         ffmahd.call(paramInt1, i3 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label290:
/*     */         
/*     */ 
/* 151 */         i6 = MainMemory.getI32(i1);
/* 152 */         if (MainMemory.getI32(i6 + 68) != 0) {
/*     */           break label338;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         i2 = i6 + 120;
/*     */         
/*     */         break label409;
/*     */         
/*     */         label338:
/*     */         
/* 168 */         if (MainMemory.getI32(i6 + 1012) != 0) {
/*     */           break label396;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         MainMemory.setI32(paramInt5, 233);
/*     */       }
/*     */       
/*     */ 
/*     */       label376:
/*     */       
/* 184 */       ffgiszll.call(paramInt1, 9, j, paramInt5);
/*     */       
/*     */       break label468;
/*     */       
/*     */       label396:
/* 189 */       i2 = i6 + 1040;
/*     */       
/*     */ 
/*     */ 
/*     */       label409:
/*     */       
/*     */ 
/*     */ 
/* 197 */       i3 = MainMemory.getI32(i2);
/* 198 */       ffgiszll.call(paramInt1, 9, j, paramInt5);
/* 199 */       if (i3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */         l1 = MainMemory.getI64(j);
/* 210 */         if (l1 != 0L) {
/*     */           break label486;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label468:
/*     */       
/*     */ 
/* 220 */       MainMemory.setI32(paramInt5, 320);
/*     */       
/*     */ 
/*     */       break label1147;
/*     */       
/*     */       label486:
/*     */       
/* 227 */       if (i3 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 231 */         l2 = 1L;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 238 */         i4 = i3 > 1 ? i3 : 1;
/* 239 */         l2 = l1;
/* 240 */         l5 = 0L;
/* 241 */         l3 = 1L;
/* 242 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 252 */           l4 = MainMemory.getI64(paramInt2 + (i5 << 3));
/* 253 */           l5 = (l4 + -1L) * l3 + l5;
/* 254 */           MainMemory.setI64(k + (i5 << 3), l4);
/* 255 */           i5 += 1;
/* 256 */           if (i5 != i4) {
/*     */             break label618;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */           l2 = l5 + 1L;
/*     */           
/* 268 */           break;
/*     */           
/*     */           label618:
/*     */           
/* 272 */           l3 = l2 * l3;
/* 273 */           l2 = MainMemory.getI64(j + (i5 << 3));
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */         i4 = MainMemory.getI32(paramInt1);
/* 294 */         i6 = MainMemory.getI32(i1);
/* 295 */         if (i4 != MainMemory.getI32(i6 + 64)) {
/*     */           break label771;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */         if (MainMemory.getI64(i6 + 112) != -1L) {
/*     */           break label788;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */         if (ffrdef.call(paramInt1, paramInt5) <= 0) {
/*     */           break label788;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */         i4 = MainMemory.getI32(paramInt5);
/*     */         
/*     */         break label815;
/*     */         
/*     */         label771:
/*     */         
/* 331 */         ffmahd.call(paramInt1, i4 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label788:
/*     */         
/*     */ 
/* 337 */         i4 = MainMemory.getI32(MainMemory.getI32(i1) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label815:
/*     */         
/*     */ 
/*     */ 
/* 345 */         if (i4 != 0) {
/*     */           break label864;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */       ffgcle.call(paramInt1, 2, 1L, l2, paramLong, 1, 1, 0.0F, paramInt3, i, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       break label1147;
/*     */       
/*     */       label864:
/*     */       
/* 362 */       if (!MathUtils.ugt(i3 + -2, 1))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */         if (MainMemory.getI64(paramInt2) != 1L) {
/*     */           break label1124;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */         if (paramLong % l1 != 0L) {
/*     */           break label1124;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */         MainMemory.setI64(k, l1);
/* 393 */         l5 = MainMemory.getI64(paramInt2 + 8) + -1L + paramLong / l1;
/* 394 */         i7 = k + 8;
/* 395 */         MainMemory.setI64(i7, l5);
/* 396 */         paramLong = MainMemory.getI64(j + 8);
/* 397 */         if (l5 <= paramLong) {
/*     */           break label1094;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 407 */         i8 = k + 16;
/* 408 */         l1 = MainMemory.getI64(i8) + 1L;
/* 409 */         l2 = 0L - paramLong;
/* 410 */         l3 = l5 - paramLong;
/* 411 */         l4 = 0L;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 418 */           l5 = l3 + l4 * l2;
/* 419 */           l6 = l4 + 1L;
/* 420 */           if (l5 <= paramLong) break;
/* 421 */           l4 = l6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */         paramLong = l1 + l4;
/* 432 */         MainMemory.setI64(i7, l5);
/* 433 */         MainMemory.setI64(i8, paramLong);
/*     */         
/*     */ 
/*     */         label1094:
/*     */         
/*     */ 
/* 439 */         fits_read_compressed_img.call(paramInt1, 42, paramInt2, k, m, 1, 0, paramInt3, 0, paramInt4, paramInt5);
/*     */         
/*     */         break label1147;
/*     */       }
/*     */       
/*     */       label1124:
/*     */       
/* 446 */       fits_read_compressed_pixels.call(paramInt1, 42, l2, paramLong, 1, 0, paramInt3, 0, paramInt4, paramInt5);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1147:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 457 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgpxvll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */