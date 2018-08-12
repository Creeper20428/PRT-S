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
/*     */ public final class ffgcx
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3357;
/*  16 */   public static final Function _instance = new ffgcx();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgcx() { super("ffgcx", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     call(i, j, l1, l2, l3, k, m);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, int paramInt4)
/*     */   {
/*  57 */     int i = 0;
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     long l1 = 0L;
/*  63 */     int i1 = 0;
/*  64 */     int i2 = 0;
/*  65 */     int i3 = 0;
/*  66 */     int i4 = 0;
/*  67 */     int i5 = 0;
/*  68 */     int i6 = 0;
/*  69 */     long l2 = 0L;
/*  70 */     long l3 = 0L;
/*  71 */     long l4 = 0L;
/*  72 */     long l5 = 0L;
/*  73 */     byte b = 0;
/*  74 */     long l6 = 0L;
/*  75 */     long l7 = 0L;
/*  76 */     long l8 = 0L;
/*  77 */     long l9 = 0L;
/*  78 */     long l10 = 0L;
/*  79 */     long l11 = 0L;
/*     */     
/*     */ 
/*  82 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  86 */       i = MainMemory.alloc(8);
/*  87 */       i6 = MainMemory.alloc(8);
/*  88 */       j = MainMemory.alloc(1);
/*  89 */       if ((MainMemory.getI32(paramInt4) > 0) || (paramLong3 >= 1L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (paramLong1 >= 1L) {
/*     */           break label156;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         MainMemory.setI32(paramInt4, 307);
/*     */         
/*     */ 
/*     */         break label1309;
/*     */         
/*     */         label156:
/*     */         
/* 116 */         if (paramLong2 >= 1L) {
/*     */           break label194;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         MainMemory.setI32(paramInt4, 308);
/*     */         
/*     */ 
/*     */         break label1309;
/*     */         
/*     */         label194:
/*     */         
/* 133 */         n = MainMemory.getI32(paramInt1);
/* 134 */         k = paramInt1 + 4;
/* 135 */         i1 = MainMemory.getI32(k);
/* 136 */         if (n != MainMemory.getI32(i1 + 64)) {
/*     */           break label293;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         if (MainMemory.getI64(i1 + 112) != -1L) {
/*     */           break label310;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */         if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */           break label1182;
/*     */         } else {
/*     */           break label310;
/*     */         }
/*     */         
/*     */ 
/*     */         label293:
/*     */         
/* 165 */         ffmahd.call(paramInt1, n + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label310:
/*     */         
/*     */ 
/* 171 */         m = (int)((paramLong2 + 7L) / 8L);
/* 172 */         n = (int)paramLong2 + -1 - (int)((paramLong2 + -1L) / 8L << 3);
/* 173 */         l3 = paramLong1 + -1L;
/* 174 */         l1 = m + -1;
/* 175 */         i1 = MainMemory.getI32(k);
/* 176 */         i2 = MainMemory.getI32(i1 + 944);
/* 177 */         i3 = paramInt2 + -1;
/* 178 */         i4 = MainMemory.getI32(i2 + i3 * 152 + 80);
/* 179 */         if ((i4 > -1 ? i4 : 0 - i4) <= 11) {
/*     */           break label449;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         MainMemory.setI32(paramInt4, 310);
/*     */         
/*     */ 
/*     */         break label1309;
/*     */         
/*     */         label449:
/*     */         
/* 196 */         if (i4 <= 0) {
/*     */           break label605;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */         paramInt2 = (int)MainMemory.getI64(i2 + i3 * 152 + 84);
/* 207 */         if (i4 != 1) {
/*     */           break label516;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */         paramInt2 = (paramInt2 + 7) / 8;
/*     */         
/*     */ 
/*     */ 
/*     */         label516:
/*     */         
/*     */ 
/*     */ 
/* 226 */         if (m <= paramInt2) {
/*     */           break label553;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         MainMemory.setI32(paramInt4, 308);
/*     */         
/*     */ 
/*     */         break label1309;
/*     */         
/*     */         label553:
/*     */         
/* 243 */         paramLong2 = MainMemory.getI64(i2 + i3 * 152 + 72) + MainMemory.getI64(i1 + 112) + MainMemory.getI64(i1 + 936) * l3;
/*     */         
/*     */ 
/* 246 */         i4 = 0;
/*     */         
/*     */         break label878;
/*     */         
/*     */         label605:
/* 251 */         if (ffgdesll.call(paramInt1, paramInt2, paramLong1, i, i6, paramInt4) > 0) {
/* 252 */           paramInt2 = 0;
/* 253 */           l3 = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 263 */           l3 = MainMemory.getI64(i);
/* 264 */           if (l3 <= 2147483647L) {
/*     */             break label684;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */           MainMemory.setI32(paramInt4, 412);
/* 275 */           paramInt2 = 0;
/*     */           
/*     */           break label693;
/*     */           
/*     */           label684:
/* 280 */           paramInt2 = (int)l3;
/*     */           
/*     */ 
/*     */ 
/*     */           label693:
/*     */           
/*     */ 
/*     */ 
/* 288 */           l3 = MainMemory.getI64(i6);
/* 289 */           if (l3 <= 2147483647L) {
/*     */             break label743;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */           MainMemory.setI32(paramInt4, 412);
/*     */           
/* 301 */           l3 = 0L;
/*     */           
/*     */           break label758;
/*     */           
/*     */           label743:
/* 306 */           l3 = l3 << 32 >> 32;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label758:
/*     */         
/*     */ 
/*     */ 
/* 316 */         if (i4 != -1) {
/*     */           break label790;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */         paramInt2 = (paramInt2 + 7) / 8;
/*     */         
/*     */ 
/*     */ 
/*     */         label790:
/*     */         
/*     */ 
/*     */ 
/* 335 */         if ((paramLong2 + 6L + paramLong3) / 8L <= paramInt2) {
/*     */           break label840;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */         MainMemory.setI32(paramInt4, 308);
/*     */         
/*     */ 
/*     */         break label1309;
/*     */         
/*     */         label840:
/*     */         
/* 352 */         i1 = MainMemory.getI32(k);
/* 353 */         paramLong2 = l3 + MainMemory.getI64(i1 + 112) + MainMemory.getI64(i1 + 948);
/*     */         
/*     */ 
/* 356 */         i4 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label878:
/*     */         
/*     */ 
/*     */ 
/* 365 */         if (ffmbyt.call(paramInt1, paramLong2 + l1, 0, paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */           i5 = i4 == 0 ? 1 : 0;
/* 376 */           i6 = i2 + i3 * 152 + 72;
/* 377 */           l3 = l1 + 1L;
/* 378 */           paramLong2 = paramInt2;
/* 379 */           l1 = 0L;
/* 380 */           paramInt2 = 0;
/*     */           
/* 382 */           l2 = l3;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 392 */         l3 = l1 + paramLong1;
/* 393 */         l4 = 0L;
/*     */         
/* 395 */         i3 = n;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 404 */           l5 = l2 + l4;
/* 405 */           n = paramInt2;
/* 406 */           paramInt2 = i3;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 414 */             if (ffgbyt.call(paramInt1, 1L, j, paramInt4) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */               b = MainMemory.getI8(j);
/* 425 */               l6 = n & 0xFFFFFFFF;
/* 426 */               l7 = paramInt3 + n & 0xFFFFFFFF;
/* 427 */               l8 = n;
/* 428 */               l9 = 39616 + paramInt2 & 0xFFFFFFFF;
/* 429 */               l10 = paramInt2 & 0xFFFFFFFF;
/* 430 */               l11 = 0L;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 437 */                 if (((int)(l10 + l11) >= 8) || (l8 + l11 >= paramLong3)) {
/*     */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */                 MainMemory.setI8((int)(l7 + l11), (byte)(MathUtils.and(b, MainMemory.getI8((int)(l9 + l11))) != 0 ? 1 : 0));
/* 448 */                 l11 += 1L;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 454 */               paramInt2 = (int)(l6 + l11);
/* 455 */               if (paramInt2 != paramLong3) {
/*     */                 break label1192;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1182:
/*     */             
/*     */ 
/*     */             break label1309;
/*     */             
/*     */ 
/*     */             label1192:
/*     */             
/*     */ 
/* 471 */             if (i5 != 0) {
/*     */               break;
/*     */             }
/*     */             
/* 475 */             n = paramInt2;
/* 476 */             paramInt2 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */           l4 += 1L;
/* 484 */           if (paramLong2 == l5) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 490 */           i3 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 497 */         i1 = MainMemory.getI32(k);
/* 498 */         ffmbyt.call(paramInt1, MainMemory.getI64(i6) + MainMemory.getI64(i1 + 112) + MainMemory.getI64(i1 + 936) * l3, 0, paramInt4);
/* 499 */         l1 += 1L;
/*     */         
/*     */ 
/* 502 */         n = 0;
/* 503 */         l2 = 1L;
/*     */       }
/*     */       
/*     */       label1309:
/*     */       
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 512 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */