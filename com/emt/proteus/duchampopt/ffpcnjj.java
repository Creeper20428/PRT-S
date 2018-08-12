/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffpcnjj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3536;
/*  15 */   public static final Function _instance = new ffpcnjj();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpcnjj() { super("ffpcnjj", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, long paramLong4, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramLong4, paramInt4);
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
/*  34 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     long l4 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i, j, l1, l2, l3, k, l4, m);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, long paramLong4, int paramInt4)
/*     */   {
/*  59 */     int i = 0;
/*  60 */     int j = 0;
/*  61 */     int k = 0;
/*  62 */     boolean bool = false;
/*  63 */     long l1 = 0L;
/*  64 */     int m = 0;
/*  65 */     long l2 = 0L;
/*  66 */     long l3 = 0L;
/*  67 */     long l4 = 0L;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  76 */       i2 = paramInt3;
/*  77 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         n = MainMemory.getI32(paramInt1);
/*  88 */         i = paramInt1 + 4;
/*  89 */         j = MainMemory.getI32(i);
/*  90 */         if (n != MainMemory.getI32(j + 64)) {
/*     */           break label157;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (MainMemory.getI64(j + 112) != -1L) {
/*     */           break label174;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */           break label821;
/*     */         } else {
/*     */           break label174;
/*     */         }
/*     */         
/*     */ 
/*     */         label157:
/*     */         
/* 119 */         ffmahd.call(paramInt1, n + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label174:
/*     */         
/*     */ 
/* 125 */         k = MainMemory.getI32(MainMemory.getI32(i) + 944);
/* 126 */         i1 = paramInt2 + -1;
/* 127 */         n = MainMemory.getI32(k + i1 * 152 + 80);
/* 128 */         bool = n > 0;
/* 129 */         if (!bool) {
/*     */           break label267;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         l1 = MainMemory.getI64(k + i1 * 152 + 84);
/*     */         
/*     */         break label283;
/*     */         
/*     */         label267:
/*     */         
/* 145 */         l1 = paramLong2 + -1L + paramLong3;
/*     */         
/*     */ 
/*     */ 
/*     */         label283:
/*     */         
/*     */ 
/*     */ 
/* 153 */         if (n >= 0) {
/*     */           break label366;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         if (ffpcljj.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4) <= 0) {
/*     */           break label366;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         if (MainMemory.getI32(paramInt4) != 412) {
/*     */           break label821;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */         MainMemory.setI32(paramInt4, 0);
/*     */         
/*     */ 
/*     */         label366:
/*     */         
/*     */ 
/* 189 */         paramLong1 = l1 * (paramLong1 + -1L) + paramLong2;
/* 190 */         paramLong2 = i2 & 0xFFFFFFFF;
/* 191 */         l4 = 0L;
/* 192 */         n = 0;
/* 193 */         i1 = 0;
/* 194 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 204 */           m = (int)l4;
/* 205 */           if (l4 >= paramLong3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */           if (MainMemory.getI64((int)(paramLong2 + (l4 << 3))) != paramLong4) {
/*     */             break label626;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           if (n != 0)
/*     */           {
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
/* 237 */             m -= n;
/* 238 */             l2 = m + paramLong1;
/* 239 */             l3 = (l2 + -1L) / l1;
/* 240 */             if (!bool)
/*     */             {
/*     */ 
/*     */ 
/* 244 */               n = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 252 */             else if (ffpcljj.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, n, paramInt3 + (m << 3), paramInt4) <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 256 */               n = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 264 */               if (MainMemory.getI32(paramInt4) != 412) {
/*     */                 break label821;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */               MainMemory.setI32(paramInt4, 0);
/* 275 */               n = 0;
/* 276 */               i2 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */           i1 += 1;
/*     */           
/*     */ 
/*     */           break label714;
/*     */           
/*     */ 
/*     */           label626:
/*     */           
/* 292 */           if (i1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */             l2 = m - i1 + paramLong1;
/* 304 */             l3 = (l2 + -1L) / l1;
/* 305 */             if (ffpclu.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, i1, paramInt4) > 0) {
/*     */               break label821;
/*     */             } else {
/* 308 */               i1 = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */           n += 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label714:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */           l4 += 1L;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */         if (n != 0) {
/*     */           break label772;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */         ffpcnjj_1355.call(l1, paramInt1, m, paramLong1, paramInt2, paramInt4, i1);
/*     */         
/*     */         break label795;
/*     */         
/*     */         label772:
/* 353 */         ffpcnjj_1356.call(paramInt3, paramInt1, l1, m, paramInt2, paramInt4, paramLong1, n, bool);
/*     */         
/*     */ 
/*     */         label795:
/*     */         
/*     */ 
/* 359 */         if ((MainMemory.getI32(paramInt4) <= 0) && (i2 != 0)) {
/*     */           break label831;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label821:
/*     */       
/*     */ 
/*     */       break label844;
/*     */       
/*     */ 
/*     */       label831:
/*     */       
/*     */ 
/* 375 */       MainMemory.setI32(paramInt4, 412);
/*     */       
/*     */ 
/*     */       label844:
/*     */       
/*     */ 
/* 381 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcnjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */