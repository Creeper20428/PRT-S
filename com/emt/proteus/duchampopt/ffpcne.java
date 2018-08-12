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
/*     */ public final class ffpcne
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3522;
/*  15 */   public static final Function _instance = new ffpcne();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpcne() { super("ffpcne", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, float paramFloat, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramFloat, paramInt4);
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
/*  46 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     call(i, j, l1, l2, l3, k, f, m);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, float paramFloat, int paramInt4)
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
/*     */           break label857;
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
/* 153 */         l1 <<= (int)((n > -1 ? n : 0 - n) > 82 ? 1 : 0);
/* 154 */         if (n >= 0) {
/*     */           break label398;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         if (ffpcle.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramInt4) <= 0) {
/*     */           break label398;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         if (MainMemory.getI32(paramInt4) != 412) {
/*     */           break label857;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         MainMemory.setI32(paramInt4, 0);
/*     */         
/*     */ 
/*     */         label398:
/*     */         
/*     */ 
/* 190 */         paramLong1 = l1 * (paramLong1 + -1L) + paramLong2;
/* 191 */         paramLong2 = i2 & 0xFFFFFFFF;
/* 192 */         l4 = 0L;
/* 193 */         n = 0;
/* 194 */         i1 = 0;
/* 195 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 205 */           m = (int)l4;
/* 206 */           if (l4 >= paramLong3) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */           if (!MathUtils.f_une(MainMemory.getF32((int)(paramLong2 + (l4 << 2))), paramFloat)) {
/*     */             break label589;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */           if (i1 != 0)
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
/* 237 */             l2 = m - i1 + paramLong1;
/* 238 */             l3 = (l2 + -1L) / l1;
/* 239 */             if (ffpcluc.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, i1, paramInt4) > 0) {
/*     */               break label857;
/*     */             } else {
/* 242 */               i1 = 0;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */           n += 1;
/*     */           
/*     */ 
/*     */           break label750;
/*     */           
/*     */ 
/*     */           label589:
/*     */           
/* 259 */           if (n != 0)
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
/* 271 */             m -= n;
/* 272 */             l2 = m + paramLong1;
/* 273 */             l3 = (l2 + -1L) / l1;
/* 274 */             if (!bool)
/*     */             {
/*     */ 
/*     */ 
/* 278 */               n = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 286 */             else if (ffpcle.call(paramInt1, paramInt2, l3 + 1L, l2 - l3 * l1, n, paramInt3 + (m << 2), paramInt4) <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 290 */               n = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 298 */               if (MainMemory.getI32(paramInt4) != 412) {
/*     */                 break label857;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */               MainMemory.setI32(paramInt4, 0);
/* 309 */               n = 0;
/* 310 */               i2 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */           i1 += 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label750:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */           l4 += 1L;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */         if (n != 0) {
/*     */           break label808;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */         ffpcne_1349.call(l1, paramLong1, i1, paramInt1, m, paramInt4, paramInt2);
/*     */         
/*     */         break label831;
/*     */         
/*     */         label808:
/* 354 */         ffpcne_1350.call(l1, paramLong1, paramInt1, m, paramInt4, paramInt2, bool, n, paramInt3);
/*     */         
/*     */ 
/*     */         label831:
/*     */         
/*     */ 
/* 360 */         if ((MainMemory.getI32(paramInt4) <= 0) && (i2 != 0)) {
/*     */           break label867;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label857:
/*     */       
/*     */ 
/*     */       break label880;
/*     */       
/*     */ 
/*     */       label867:
/*     */       
/*     */ 
/* 376 */       MainMemory.setI32(paramInt4, 412);
/*     */       
/*     */ 
/*     */       label880:
/*     */       
/*     */ 
/* 382 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpcne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */