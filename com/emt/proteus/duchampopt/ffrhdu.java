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
/*     */ 
/*     */ 
/*     */ public final class ffrhdu
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3252;
/*  17 */   public static final Function _instance = new ffrhdu();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffrhdu() { super("ffrhdu", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = call(i, j, k);
/*  39 */     paramFrame.setI32(paramInt1, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*     */     
/*     */ 
/*  61 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       j = MainMemory.alloc(4);
/*  66 */       k = MainMemory.alloc(81);
/*  67 */       m = MainMemory.alloc(72);
/*  68 */       n = MainMemory.alloc(71);
/*  69 */       i1 = MainMemory.alloc(73);
/*  70 */       i2 = MainMemory.alloc(71);
/*  71 */       i3 = MainMemory.alloc(20);
/*  72 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         if (ffgrec.call(paramInt1, 1, k, paramInt3) <= 0) {
/*     */           break label148;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         ffxmsg.call(5, 103968);
/*     */         
/*     */         break label964;
/*     */         
/*     */         label148:
/*  97 */         SystemLibrary.strncpy(m, k, 8);
/*  98 */         MainMemory.setI8(m + 8, (byte)0);
/*  99 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 106 */           i5 = 7 - i4;
/* 107 */           i6 = m + i5;
/* 108 */           if (i5 <= -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           if (MainMemory.getI8(i6) != 32) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           MainMemory.setI8(i6, (byte)0);
/* 129 */           i4 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 135 */         if (ffpsvc.call(k, n, i1, paramInt3) <= 0) {
/*     */           break label301;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         ffxmsg.call(5, 124192);
/* 146 */         ffxmsg.call(5, k);
/*     */         
/*     */         break label964;
/*     */         
/*     */         label301:
/* 151 */         if (SystemLibrary.strcmp(m, 36032) != 0) {
/*     */           break label340;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */         ffrhdu_1409.call(paramInt1, paramInt2, paramInt3);
/*     */         
/*     */         break label771;
/*     */         
/*     */         label340:
/* 166 */         if (SystemLibrary.strcmp(m, 45664) != 0) {
/*     */           break label685;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         if (ffc2s.call(n, i2, paramInt3) <= 0) {
/*     */           break label409;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */         ffxmsg.call(5, 89952);
/* 187 */         ffxmsg.call(5, n);
/*     */         
/*     */         break label964;
/*     */         
/*     */         label409:
/* 192 */         if (MainMemory.getI8(i2) == 32) {
/* 193 */           i4 = 0;
/*     */         }
/*     */         else
/*     */         {
/* 197 */           i6 = i2;
/*     */           
/*     */ 
/*     */           break label472;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/* 205 */           i4 += 1;
/* 206 */           i6 = i2 + i4;
/* 207 */         } while (MainMemory.getI8(i6) == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label472:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         if (SystemLibrary.strcmp(i6, 26880) != 0) {
/*     */           break label512;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */         ffrhdu_1411.call(paramInt1, paramInt2, paramInt3);
/*     */         
/*     */         break label771;
/*     */         
/*     */         label512:
/* 235 */         if (SystemLibrary.strcmp(i6, 45216) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */           if (SystemLibrary.strcmp(i6, 44096) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */             if (SystemLibrary.strcmp(i6, 39520) != 0) {
/*     */               break label591;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */         ffrhdu_1410.call(paramInt1, paramInt2, paramInt3);
/*     */         
/*     */         break label771;
/*     */         
/*     */         label591:
/* 270 */         MainMemory.setI32(j, 0);
/* 271 */         ffpinit.call(paramInt1, j);
/* 272 */         i4 = MainMemory.getI32(j);
/* 273 */         if ((i4 != 251) || (paramInt2 == 0)) {
/*     */           break label650;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */         MainMemory.setI32(paramInt2, -1);
/*     */         
/*     */         break label771;
/*     */         
/*     */         label650:
/* 288 */         MainMemory.setI32(paramInt3, i4);
/* 289 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */           MainMemory.setI32(paramInt2, 0);
/*     */           
/*     */           break label771;
/*     */           
/*     */           label685:
/* 304 */           switch (MainMemory.getI8(k))
/*     */           {
/*     */           case 0: 
/*     */             break;
/*     */           case 10: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 316 */           MainMemory.setI32(paramInt3, 107);
/*     */           
/*     */ 
/*     */           break label771;
/*     */           
/* 321 */           MainMemory.setI32(paramInt3, 252);
/* 322 */           ffxmsg.call(5, 135744);
/* 323 */           ffxmsg.call(5, k);
/*     */         }
/*     */         
/*     */ 
/*     */         label771:
/*     */         
/* 329 */         i7 = paramInt1 + 4;
/* 330 */         i8 = MainMemory.getI32(i7);
/* 331 */         paramInt2 = i8 + 40;
/* 332 */         if (MainMemory.getI64(MainMemory.getI32(i8 + 84) + (MainMemory.getI32(i8 + 64) + 1 << 3)) >= MainMemory.getI64(i8 + 32)) {
/*     */           break label853;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */         break label964;
/*     */         
/*     */         label853:
/* 347 */         MainMemory.setI32(paramInt2, 1);
/* 348 */         SystemLibrary.strcpy(i3, 492288 + MainMemory.getI32(MainMemory.getI32(i7) + 4) * 84);
/* 349 */         if (SystemLibrary.strcmp(i3, 33248) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */           if (SystemLibrary.strcmp(i3, 49600) != 0) {
/*     */             break label964;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */         i8 = MainMemory.getI32(i7);
/* 370 */         fftrun.call(paramInt1, MainMemory.getI64(MainMemory.getI32(i8 + 84) + (MainMemory.getI32(i8 + 64) + 1 << 3)), paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */       label964:
/*     */       
/* 376 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 387 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffrhdu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */