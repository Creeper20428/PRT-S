/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class ffpbyt
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2977;
/*  15 */   public static final Function _instance = new ffpbyt();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpbyt() { super("ffpbyt", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     return call(paramInt1, paramLong, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = call(i, l, j, k);
/*  40 */     paramFrame.setI32(paramInt1, m);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     long l1 = 0L;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     long l2 = 0L;
/*  59 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */         m = MainMemory.getI32(paramInt1);
/*  76 */         j = paramInt1 + 4;
/*  77 */         k = MainMemory.getI32(j);
/*  78 */         if (m != MainMemory.getI32(k + 64))
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
/*  89 */           ffmahd.call(paramInt1, m + 1, 0, paramInt3);
/*  90 */           k = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         i4 = (int)paramLong;
/*  99 */         if (MainMemory.getI32(k + 60) >= 0) {
/*     */           break label182;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         ffldrc.call(paramInt1, (int)(MainMemory.getI64(k + 44) / 2880L), 0, paramInt3);
/* 111 */         k = MainMemory.getI32(j);
/*     */         
/*     */ 
/*     */ 
/*     */         label182:
/*     */         
/*     */ 
/*     */ 
/* 119 */         if (paramLong <= 8639L) {
/*     */           break label1120;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         m = MainMemory.getI32(k + 60);
/* 130 */         l1 = MainMemory.getI64(k + 44);
/* 131 */         n = MainMemory.getI32(k + 1216 + (m << 2));
/* 132 */         i1 = (int)((paramLong + -1L + l1) / 2880L);
/* 133 */         i2 = (int)l1 - n * 2880;
/* 134 */         i3 = 2880 - i2;
/* 135 */         if (i2 == 2880)
/*     */         {
/*     */ 
/* 138 */           paramLong = l1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 149 */           SystemLibrary.memcpy(MainMemory.getI32(k + 1212) + (i2 + m * 2880), paramInt2, i3, 1);
/* 150 */           i4 -= i3;
/* 151 */           paramInt2 += i3;
/* 152 */           paramLong = i3 + l1;
/* 153 */           MainMemory.setI32(MainMemory.getI32(j) + 1376 + (m << 2), 1);
/* 154 */           k = MainMemory.getI32(j);
/*     */         }
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
/* 169 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 177 */           i2 = MainMemory.getI32(k + 1216 + (i3 << 2));
/* 178 */           if ((i2 < n) || (i2 <= i1))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */             if (MainMemory.getI32(k + 1376 + (i3 << 2)) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */               ffbfwt.call(k, i3, paramInt3);
/* 200 */               k = MainMemory.getI32(j);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */             MainMemory.setI32(k + 1216 + (i3 << 2), -1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 214 */           i3 += 1;
/* 215 */           k = MainMemory.getI32(j);
/* 216 */           if (i3 == 40) {
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
/* 228 */         if (MainMemory.getI64(k + 52) != paramLong)
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
/* 239 */           SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 72), MainMemory.getI32(k), paramLong);
/* 240 */           k = MainMemory.getI32(j);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */         n = i4 + -1;
/* 249 */         i3 = n - n % 2880;
/* 250 */         n = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 80), MainMemory.getI32(k), paramInt2, i3);
/* 251 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */           ffxmsg.call(5, 82848);
/* 262 */           ffxmsg.call(5, MainMemory.getI32(k + 12));
/* 263 */           MainMemory.setI32(paramInt3, 106);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 269 */         n = i4 - i3;
/* 270 */         paramInt2 += i3;
/* 271 */         paramLong = i3 + paramLong;
/* 272 */         MainMemory.setI64(MainMemory.getI32(j) + 52, paramLong);
/* 273 */         k = MainMemory.getI32(j);
/* 274 */         l1 = MainMemory.getI64(k + 52);
/* 275 */         i6 = k + 24;
/* 276 */         if (l1 >= MainMemory.getI64(i6)) {
/*     */           break label888;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */         i4 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 76), MainMemory.getI32(k), MainMemory.getI32(k + 1212) + m * 2880, 2880);
/* 287 */         if (i4 != 107) {
/*     */           break label840;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */         MainMemory.setI32(paramInt3, 107);
/*     */         
/*     */         break label854;
/*     */         
/*     */         label840:
/* 302 */         ffpbyt_1155.call(i4, paramInt3, k);
/*     */         
/*     */ 
/*     */         label854:
/*     */         
/*     */ 
/* 308 */         i6 = MainMemory.getI32(j) + 52;
/* 309 */         MainMemory.setI64(i6, MainMemory.getI64(i6) + 2880L);
/*     */         
/*     */         break label981;
/*     */         
/*     */         label888:
/* 314 */         MainMemory.setI64(i6, l1);
/* 315 */         k = MainMemory.getI32(j);
/* 316 */         i5 = MainMemory.getI32(k + 1212) + m * 2880;
/* 317 */         if (MainMemory.getI32(k + 68) != 1) {
/*     */           break label966;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */         SystemLibrary.memset(i5, (byte)32, 2880, 1);
/*     */         
/*     */         break label981;
/*     */         
/*     */         label966:
/* 332 */         SystemLibrary.memset(i5, (byte)0, 2880, 1);
/*     */         
/*     */ 
/*     */         label981:
/*     */         
/*     */ 
/* 338 */         SystemLibrary.memcpy(MainMemory.getI32(MainMemory.getI32(j) + 1212) + m * 2880, paramInt2, n, 1);
/* 339 */         MainMemory.setI32(MainMemory.getI32(j) + 1376 + (m << 2), 1);
/* 340 */         MainMemory.setI32(MainMemory.getI32(j) + 1216 + (m << 2), i1);
/* 341 */         l1 = i1 * 2880L + 2880L;
/* 342 */         i6 = MainMemory.getI32(j) + 32;
/* 343 */         l2 = MainMemory.getI64(i6);
/* 344 */         MainMemory.setI64(i6, l1 >= l2 ? l1 : l2);
/* 345 */         MainMemory.setI64(MainMemory.getI32(j) + 44, paramLong + n);
/*     */         
/*     */         break label1196;
/*     */         
/*     */         label1120:
/* 350 */         m = (int)MainMemory.getI64(k + 44) - MainMemory.getI32(k + 1216 + (MainMemory.getI32(k + 60) << 2)) * 2880;
/* 351 */         i1 = 2880 - m;
/* 352 */         n = i4;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 374 */         if (n != 0) {
/*     */           break label1213;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1196:
/*     */         
/*     */ 
/*     */ 
/* 384 */         i = MainMemory.getI32(paramInt3);
/* 385 */         break;
/*     */         
/*     */ 
/*     */         label1213:
/*     */         
/*     */ 
/* 391 */         i4 = i1 <= n ? i1 : n;
/* 392 */         k = MainMemory.getI32(j);
/* 393 */         SystemLibrary.memcpy(MainMemory.getI32(k + 1212) + (MainMemory.getI32(k + 60) * 2880 + m), paramInt2, i4, 1);
/* 394 */         i3 = n - i4;
/* 395 */         paramInt2 += i4;
/* 396 */         i6 = MainMemory.getI32(j) + 44;
/* 397 */         MainMemory.setI64(i6, MainMemory.getI64(i6) + i4);
/* 398 */         k = MainMemory.getI32(j);
/* 399 */         MainMemory.setI32(k + 1376 + (MainMemory.getI32(k + 60) << 2), 1);
/* 400 */         if (n == i4) {
/* 401 */           n = i3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 412 */           ffldrc.call(paramInt1, (int)(MainMemory.getI64(MainMemory.getI32(j) + 44) / 2880L), 1, paramInt3);
/* 413 */           n = i3;
/* 414 */           m = 0;
/* 415 */           i1 = 2880;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 420 */       int i7 = i;return i7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpbyt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */