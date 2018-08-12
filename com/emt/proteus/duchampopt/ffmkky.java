/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffmkky extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3244;
/*  13 */   public static final Function _instance = new ffmkky();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffmkky() { super("ffmkky", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m, n);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     boolean bool = false;
/*     */     
/*     */ 
/*  59 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(72);
/*  64 */       j = MainMemory.alloc(4);
/*  65 */       MainMemory.setI32(j, -1);
/*  66 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         MainMemory.setI8(i, (byte)0);
/*  77 */         MainMemory.setI8(paramInt4, (byte)0);
/*  78 */         if (MainMemory.getI8(paramInt1) == 32) {
/*  79 */           k = 0;
/*     */         }
/*     */         else
/*     */         {
/*  83 */           k = 0;
/*     */           
/*     */ 
/*     */           break label136;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/*  91 */           k += 1;
/*  92 */         } while (MainMemory.getI8(paramInt1 + k) == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label136:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         SystemLibrary.strncat(i, paramInt1 + k, 71);
/* 106 */         k = SystemLibrary.strlen(paramInt2);
/* 107 */         n = SystemLibrary.strlen(i);
/* 108 */         if (n == 0) {
/* 109 */           m = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 119 */           m = n + -1;
/* 120 */           i2 = i + m;
/* 121 */           if (MainMemory.getI8(i2) != 32) {
/*     */             break label279;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */           n += -2;
/* 133 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 140 */             i2 = i + (n - i1);
/* 141 */             MainMemory.setI8(i + (m - i1), (byte)0);
/* 142 */             i1 += 1;
/* 143 */           } while (MainMemory.getI8(i2) == 32);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label279:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */           m = 1 - i + i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         if (!MathUtils.ugt(m, 8))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */           if (fftkey.call(paramInt1, j) <= 0) {
/*     */             break label648;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         if (SystemLibrary.strchr(i, 61) != 0) {
/*     */           break label618;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         i3 = MainMemory.getI8(i);
/* 195 */         switch (i3)
/*     */         {
/*     */         case 72: 
/*     */           break;
/*     */         case 104: 
/*     */           break label458;
/*     */           
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 206 */         if (SystemLibrary.strncmp(i, 47360, 9) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */           if (i3 != 104) {
/*     */             break label500;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label458:
/*     */           
/*     */ 
/*     */ 
/* 226 */           if (SystemLibrary.strncmp(i, 47392, 9) != 0) {
/*     */             break label500;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         m += -9;
/*     */         
/*     */         break label519;
/*     */         
/*     */         label500:
/*     */         
/* 242 */         SystemLibrary.memcpy(paramInt4 + SystemLibrary.strlen(paramInt4), 47360, 10, 1);
/*     */         
/*     */ 
/*     */ 
/*     */         label519:
/*     */         
/*     */ 
/*     */ 
/* 250 */         SystemLibrary.strcat(paramInt4, i);
/* 251 */         bool = MathUtils.ugt(k + 12 + m, 80);
/* 252 */         i2 = paramInt4 + SystemLibrary.strlen(paramInt4);
/* 253 */         if (!bool) {
/*     */           break label594;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */         SystemLibrary.memcpy(i2, 15072, 3, 1);
/* 264 */         m += 11;
/*     */         
/*     */         break label766;
/*     */         
/*     */         label594:
/*     */         
/* 270 */         MainMemory.setI32(i2, 2112800);
/* 271 */         m += 12;
/*     */         
/*     */         break label766;
/*     */         
/*     */         label618:
/*     */         
/* 277 */         ffxmsg.call(5, 113312);
/* 278 */         ffxmsg.call(5, i);
/* 279 */         MainMemory.setI32(paramInt5, 207);
/*     */         
/*     */ 
/*     */         break label1403;
/*     */         
/*     */         label648:
/*     */         
/* 286 */         SystemLibrary.strcat(paramInt4, i);
/* 287 */         if (!MathUtils.ult(m, 8)) {
/*     */           break label731;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */         n = 8 - m;
/* 298 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 305 */           MainMemory.setI8(paramInt4 + (m + i1), (byte)32);
/* 306 */           i1 += 1;
/* 307 */           if (i1 == n) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label731:
/*     */         
/*     */ 
/*     */ 
/* 318 */         MainMemory.setI8(paramInt4 + 8, (byte)61);
/* 319 */         MainMemory.setI8(paramInt4 + 9, (byte)32);
/* 320 */         MainMemory.setI8(paramInt4 + 10, (byte)0);
/* 321 */         m = 10;
/*     */         
/*     */ 
/*     */ 
/*     */         label766:
/*     */         
/*     */ 
/* 328 */         if (k != 0) {
/*     */           break label848;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */         if (m != 10) {
/*     */           break label1398;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */         MainMemory.setI8(paramInt4 + 8, (byte)32);
/* 349 */         if (paramInt3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */           SystemLibrary.strncat(paramInt4, paramInt3, 80 - m);
/*     */           
/*     */ 
/*     */           break label1403;
/*     */           
/*     */           label848:
/*     */           
/* 366 */           if (MainMemory.getI8(paramInt2) != 39) {
/*     */             break label1181;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */           if (!MathUtils.ugt(m, 77)) {
/*     */             break label927;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */           ffxmsg.call(5, 129696);
/* 387 */           ffxmsg.call(5, paramInt1);
/* 388 */           ffxmsg.call(5, paramInt2);
/* 389 */           MainMemory.setI32(paramInt5, 207);
/*     */           
/*     */ 
/*     */           break label1403;
/*     */           
/*     */           label927:
/*     */           
/* 396 */           SystemLibrary.strncat(paramInt4, paramInt2, 80 - m);
/* 397 */           n = m + k;
/* 398 */           n = MathUtils.ugt(n, 80) ? 80 : n;
/* 399 */           if (n != 80) {
/*     */             break label998;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */           MainMemory.setI8(paramInt4 + 79, (byte)39);
/*     */           
/*     */ 
/*     */           label998:
/*     */           
/*     */ 
/* 415 */           if (paramInt3 == 0) {
/* 416 */             k = n;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 426 */             bool = MathUtils.ult(n, 30);
/* 427 */             if ((MainMemory.getI8(paramInt3) == 0) || (!bool))
/*     */             {
/*     */ 
/*     */ 
/* 431 */               k = n;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 438 */               if (!bool) {
/*     */                 break label1159;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */               k = k + m ^ 0xFFFFFFFF;
/* 449 */               m = MathUtils.ugt(k, -81) ? k : -81;
/* 450 */               k = m + 31;
/* 451 */               m ^= 0xFFFFFFFF;
/* 452 */               n = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 459 */                 MainMemory.setI8(paramInt4 + (n + m), (byte)32);
/* 460 */                 n += 1;
/* 461 */                 if (n == k) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label1159:
/*     */               
/*     */ 
/*     */ 
/* 472 */               MainMemory.setI8(paramInt4 + 30, (byte)0);
/* 473 */               k = 30;
/*     */               
/*     */               break label1322;
/*     */               
/*     */               label1181:
/* 478 */               n = m + k;
/* 479 */               if (!MathUtils.ugt(n, 80)) {
/*     */                 break label1245;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 489 */               ffxmsg.call(5, 129696);
/* 490 */               ffxmsg.call(5, paramInt1);
/* 491 */               ffxmsg.call(5, paramInt2);
/* 492 */               MainMemory.setI32(paramInt5, 207);
/*     */               
/*     */ 
/*     */               break label1403;
/*     */               
/*     */               label1245:
/*     */               
/* 499 */               bool = MathUtils.ult(n, 30);
/* 500 */               if (!bool) {
/*     */                 break label1292;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 510 */               SystemLibrary.strncat(paramInt4, 63840, 30 - k - m);
/*     */               
/*     */ 
/*     */               label1292:
/*     */               
/*     */ 
/* 516 */               SystemLibrary.strncat(paramInt4, paramInt2, 80 - m);
/* 517 */               k = bool ? 30 : n;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label1322:
/*     */           
/*     */ 
/* 525 */           if ((paramInt3 == 0) || (!MathUtils.ult(k, 77))) {
/*     */             break label1398;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 535 */           if (MainMemory.getI8(paramInt3) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 545 */             MainMemory.setI32(paramInt4 + SystemLibrary.strlen(paramInt4), 2109216);
/* 546 */             SystemLibrary.strncat(paramInt4, paramInt3, 77 - k);
/*     */             
/*     */ 
/*     */ 
/*     */             break label1403;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1398:
/*     */       
/*     */ 
/*     */       label1403:
/*     */       
/*     */ 
/* 563 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmkky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */