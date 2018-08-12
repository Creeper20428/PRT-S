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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpclx
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3549;
/*  18 */   public static final Function _instance = new ffpclx();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffpclx() { super("ffpclx", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4, paramInt5, paramInt6);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i, j, l, k, m, n, i1);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  59 */     int i = 0;
/*  60 */     int j = 0;
/*  61 */     int k = 0;
/*  62 */     int m = 0;
/*  63 */     int n = 0;
/*  64 */     int i1 = 0;
/*  65 */     int i2 = 0;
/*  66 */     int i3 = 0;
/*  67 */     int i4 = 0;
/*  68 */     int i5 = 0;
/*  69 */     int i6 = 0;
/*  70 */     int i7 = 0;
/*  71 */     int i8 = 0;
/*  72 */     int i9 = 0;
/*  73 */     int i10 = 0;
/*  74 */     int i11 = 0;
/*  75 */     int i12 = 0;
/*  76 */     int i13 = 0;
/*  77 */     int i14 = 0;
/*  78 */     long l1 = 0L;
/*  79 */     long l2 = 0L;
/*  80 */     long l3 = 0L;
/*  81 */     long l4 = 0L;
/*  82 */     long l5 = 0L;
/*  83 */     long l6 = 0L;
/*  84 */     byte b = 0;
/*  85 */     int i15 = 0;
/*  86 */     int i16 = 0;
/*  87 */     int i17 = 0;
/*     */     
/*     */ 
/*  90 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  94 */       i = MainMemory.alloc(8);
/*  95 */       j = MainMemory.alloc(8);
/*  96 */       i13 = MainMemory.alloc(8);
/*  97 */       k = MainMemory.alloc(8);
/*  98 */       m = MainMemory.alloc(8);
/*  99 */       n = MainMemory.alloc(4);
/* 100 */       i1 = MainMemory.alloc(4);
/* 101 */       i2 = MainMemory.alloc(4);
/* 102 */       i3 = MainMemory.alloc(4);
/* 103 */       i4 = MainMemory.alloc(4);
/* 104 */       i5 = MainMemory.alloc(8);
/* 105 */       i6 = MainMemory.alloc(12);
/* 106 */       i7 = MainMemory.alloc(12);
/* 107 */       i8 = MainMemory.alloc(1);
/* 108 */       if ((MainMemory.getI32(paramInt6) > 0) || (paramInt4 >= 1))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         if (paramLong >= 1L) {
/*     */           break label245;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         MainMemory.setI32(paramInt6, 307);
/*     */         
/*     */ 
/*     */         break label1384;
/*     */         
/*     */         label245:
/*     */         
/* 135 */         if (paramInt3 >= 1) {
/*     */           break label282;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         MainMemory.setI32(paramInt6, 308);
/*     */         
/*     */ 
/*     */         break label1384;
/*     */         
/*     */         label282:
/*     */         
/* 152 */         i10 = MainMemory.getI32(paramInt1);
/* 153 */         i9 = paramInt1 + 4;
/* 154 */         i11 = MainMemory.getI32(i9);
/* 155 */         if (i10 != MainMemory.getI32(i11 + 64)) {
/*     */           break label381;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         if (MainMemory.getI64(i11 + 112) != -1L) {
/*     */           break label398;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */         if (ffrdef.call(paramInt1, paramInt6) > 0) {
/*     */           break label1245;
/*     */         } else {
/*     */           break label398;
/*     */         }
/*     */         
/*     */ 
/*     */         label381:
/*     */         
/* 184 */         ffmahd.call(paramInt1, i10 + 1, 0, paramInt6);
/*     */         
/*     */ 
/*     */         label398:
/*     */         
/*     */ 
/* 190 */         i10 = (paramInt3 + 7) / 8;
/* 191 */         l2 = MainMemory.getI64(MainMemory.getI32(i9) + 956);
/* 192 */         l1 = i10;
/* 193 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong, l1, 1 - i10 + (paramInt3 + 6 + paramInt4) / 8, 1, i5, i5, i6, n, i2, i3, i, k, i1, j, i13, i4, m, i7, paramInt6) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 203 */           i16 = paramInt3 + -1;
/* 204 */           paramInt3 = i16 - (i16 / 8 << 3);
/* 205 */           l4 = paramLong + -1L;
/* 206 */           l3 = i10 + -1;
/* 207 */           i11 = MainMemory.getI32(i9);
/* 208 */           i12 = MainMemory.getI32(i11 + 944);
/* 209 */           i10 = paramInt2 + -1;
/* 210 */           i15 = MainMemory.getI32(i12 + i10 * 152 + 80);
/* 211 */           MainMemory.setI32(i2, i15);
/* 212 */           if ((i15 > -1 ? i15 : 0 - i15) <= 11) {
/*     */             break label626;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */           MainMemory.setI32(paramInt6, 310);
/*     */           
/*     */ 
/*     */           break label1384;
/*     */           
/*     */           label626:
/*     */           
/* 229 */           if (i15 <= 0) {
/*     */             break label799;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */           l2 = MainMemory.getI64(i12 + i10 * 152 + 84);
/* 240 */           if (i15 != 1) {
/*     */             break label697;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */           l2 = (l2 + 7L) / 8L;
/*     */           
/*     */ 
/*     */ 
/*     */           label697:
/*     */           
/*     */ 
/*     */ 
/* 259 */           MainMemory.setI64(j, l2);
/* 260 */           if (l1 <= l2) {
/*     */             break label743;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */           MainMemory.setI32(paramInt6, 308);
/*     */           
/*     */ 
/*     */           break label1384;
/*     */           
/*     */           label743:
/*     */           
/* 277 */           i13 = i12 + i10 * 152 + 72;
/* 278 */           l1 = MainMemory.getI64(i13) + MainMemory.getI64(i11 + 112) + MainMemory.getI64(i11 + 936) * l4;
/*     */           
/*     */ 
/* 281 */           i14 = 1;
/*     */           
/*     */           break label879;
/*     */           
/*     */           label799:
/* 286 */           l1 = i16 + paramInt4;
/* 287 */           MainMemory.setI64(j, l1);
/* 288 */           if (i15 != -1) {
/*     */             break label850;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */           ffpdes.call(paramInt1, paramInt2, paramLong, l1, l2, paramInt6);
/*     */           
/*     */ 
/*     */           label850:
/*     */           
/*     */ 
/* 304 */           l1 = MainMemory.getI64(i);
/* 305 */           i13 = i12 + i10 * 152 + 72;
/*     */           
/*     */ 
/* 308 */           i14 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label879:
/*     */           
/*     */ 
/*     */ 
/* 317 */           l1 += l3;
/* 318 */           MainMemory.setI64(i, l1);
/* 319 */           ffmbyt.call(paramInt1, l1, 1, paramInt6);
/* 320 */           l2 = l3 + 1L;
/* 321 */           l4 = l1;
/* 322 */           l1 = 0L;
/*     */           
/* 324 */           paramInt2 = paramInt3;
/* 325 */           paramInt3 = 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 336 */         l3 = l1 + paramLong;
/* 337 */         l6 = l4;
/* 338 */         l4 = 0L;
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
/* 350 */           l5 = l2 + l4;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 362 */             if (ffgbyt.call(paramInt1, 1L, i8, paramInt6) != 107) {
/*     */               break label1001;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */             MainMemory.setI32(paramInt6, 0);
/* 373 */             MainMemory.setI8(i8, (byte)0);
/*     */             
/*     */ 
/*     */             label1001:
/*     */             
/*     */ 
/* 379 */             ffmbyt.call(paramInt1, l6, 1, paramInt6);
/* 380 */             if ((paramInt2 >= 8) || (paramInt3 >= paramInt4)) {
/*     */               break label1215;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */             b = MainMemory.getI8(i8);
/* 392 */             i10 = paramInt3 - paramInt4;
/* 393 */             i15 = paramInt2 + -8;
/* 394 */             i10 = MathUtils.ugt(i10, i15) ? i10 : i15;
/* 395 */             i15 = 0 - i10;
/* 396 */             i16 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 405 */               i17 = paramInt2 + i16;
/* 406 */               if (MainMemory.getI8(paramInt5 + (paramInt3 + i16)) != 0) {
/*     */                 break label1148;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */               b = MathUtils.and(b, MainMemory.getI8(40064 + i17));
/*     */               
/*     */               break label1168;
/*     */               
/*     */               label1148:
/*     */               
/* 422 */               b = MathUtils.or(b, MainMemory.getI8(39616 + i17));
/*     */               
/*     */ 
/*     */ 
/*     */               label1168:
/*     */               
/*     */ 
/*     */ 
/* 430 */               i16 += 1;
/* 431 */               if (i16 == i15) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 443 */             paramInt2 = paramInt3 - i10;
/* 444 */             MainMemory.setI8(i8, b);
/* 445 */             paramInt3 = paramInt2;
/*     */             
/*     */ 
/*     */ 
/*     */             label1215:
/*     */             
/*     */ 
/* 452 */             ffpbyt.call(paramInt1, 1L, i8, paramInt6);
/* 453 */             if (paramInt3 != paramInt4) {
/*     */               break label1255;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1245:
/*     */             
/*     */ 
/*     */ 
/*     */             break label1384;
/*     */             
/*     */ 
/*     */             label1255:
/*     */             
/*     */ 
/* 469 */             l6 += 1L;
/* 470 */             if (i14 != 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/* 475 */             paramInt2 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */           l4 += 1L;
/* 484 */           if (l5 == MainMemory.getI64(j)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 490 */           paramInt2 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 498 */         i11 = MainMemory.getI32(i9);
/* 499 */         l2 = MainMemory.getI64(i13) + MainMemory.getI64(i11 + 112) + MainMemory.getI64(i11 + 936) * l3;
/* 500 */         ffmbyt.call(paramInt1, l2, 1, paramInt6);
/* 501 */         l1 += 1L;
/* 502 */         l4 = l2;
/*     */         
/* 504 */         l2 = 1L;
/* 505 */         paramInt2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */       label1384:
/*     */       
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 515 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */