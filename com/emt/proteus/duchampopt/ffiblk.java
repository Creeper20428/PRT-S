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
/*     */ public final class ffiblk
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3255;
/*  15 */   public static final Function _instance = new ffiblk();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffiblk() { super("ffiblk", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  39 */     int n = call(i, j, k, m);
/*  40 */     paramFrame.setI32(paramInt1, n);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     boolean bool = false;
/*  54 */     int i2 = 0;
/*  55 */     byte b = 0;
/*  56 */     int i3 = 0;
/*  57 */     long l1 = 0L;
/*  58 */     long l2 = 0L;
/*  59 */     long l3 = 0L;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     long l4 = 0L;
/*  66 */     long l5 = 0L;
/*  67 */     long l6 = 0L;
/*  68 */     int i9 = 0;
/*     */     
/*     */ 
/*  71 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       j = MainMemory.alloc(4);
/*  76 */       k = MainMemory.alloc(2880);
/*  77 */       m = MainMemory.alloc(2880);
/*  78 */       n = MainMemory.alloc(81);
/*  79 */       i1 = MainMemory.getI32(paramInt4);
/*  80 */       bool = i1 > 0;
/*  81 */       if ((!bool) && (paramInt2 >= 1)) {
/*     */         break label155;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       i = i1;
/*     */       
/*     */ 
/*     */       break label1251;
/*     */       
/*     */       label155:
/*     */       
/*  98 */       i2 = paramInt3 == 0 ? 1 : 0;
/*  99 */       if (i2 != 0) {
/* 100 */         b = 32;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 110 */       else if (MainMemory.getI32(MainMemory.getI32(paramInt1 + 4) + 68) == 1) {
/* 111 */         b = 32;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 121 */         b = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       switch (paramInt3)
/*     */       {
/*     */       case 0: 
/*     */         break label295;
/*     */         
/*     */         break;
/*     */       case -1: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 139 */       SystemLibrary.memcpy(n, 108576, 48, 1);
/* 140 */       l1 = 0L;
/*     */       
/*     */       break label377;
/*     */       
/*     */       label295:
/* 145 */       l1 = MainMemory.getI64(MainMemory.getI32(paramInt1 + 4) + 112);
/*     */       
/*     */ 
/*     */       break label377;
/*     */       
/*     */ 
/* 151 */       i3 = MainMemory.getI32(paramInt1 + 4);
/* 152 */       l1 = MainMemory.getI64(i3 + 112) + 2879L + MainMemory.getI64(i3 + 948) + MainMemory.getI64(i3 + 956);
/* 153 */       l1 -= l1 % 2880L;
/*     */       
/*     */ 
/*     */ 
/*     */       label377:
/*     */       
/*     */ 
/*     */ 
/* 161 */       SystemLibrary.memset(m, b, 2880, 1);
/* 162 */       if (paramInt2 != 1) {
/*     */         break label660;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */       if (paramInt3 != -1) {
/*     */         break label438;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */       ffiblk_1085.call(paramInt1, n, bool, paramInt4);
/*     */       
/*     */ 
/*     */       label438:
/*     */       
/*     */ 
/* 188 */       ffmbyt.call(paramInt1, l1, 0, paramInt4);
/* 189 */       ffgbyt.call(paramInt1, 2880L, k, paramInt4);
/* 190 */       l2 = l1 + 2880L;
/* 191 */       l3 = 0L;
/* 192 */       i4 = k;
/* 193 */       i5 = m;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 202 */         l5 = l3 * 2880L;
/* 203 */         l4 = l1 + l5;
/* 204 */         l5 = l2 + l5;
/* 205 */         if (MainMemory.getI32(paramInt4) >= 1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */         ffmbyt.call(paramInt1, l4, 0, paramInt4);
/* 216 */         ffpbyt.call(paramInt1, 2880L, i5, paramInt4);
/* 217 */         paramInt3 = MainMemory.getI32(paramInt4);
/* 218 */         if (paramInt3 <= 0) {
/*     */           break label580;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         i = paramInt3;
/*     */         
/*     */ 
/*     */         break label1251;
/*     */         
/*     */         label580:
/*     */         
/* 235 */         ffmbyt.call(paramInt1, l5, 0, paramInt4);
/* 236 */         ffgbyt.call(paramInt1, 2880L, i5, paramInt4);
/* 237 */         l3 += 1L;
/*     */         
/* 239 */         i4 = i5;
/* 240 */         i5 = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 245 */       MainMemory.setI32(paramInt4, i1);
/* 246 */       ffmbyt.call(paramInt1, l4, 1, paramInt4);
/* 247 */       ffpbyt.call(paramInt1, 2880L, i5, paramInt4);
/*     */       
/*     */       break label1056;
/*     */       
/*     */       label660:
/* 252 */       i6 = paramInt1 + 4;
/* 253 */       i7 = MainMemory.getI32(MainMemory.getI32(i6) + 64);
/* 254 */       if (i1 >= 1)
/*     */       {
/*     */ 
/*     */ 
/* 258 */         i8 = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 265 */         i8 = i1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 272 */           if (i8 <= 0)
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
/* 283 */             ffmahd.call(paramInt1, MainMemory.getI32(paramInt1) + 2, j, paramInt4);
/* 284 */             i8 = MainMemory.getI32(paramInt4);
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */         }
/* 292 */         while (i8 < 1);
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
/* 305 */       if (i8 != 107) {
/*     */         break label797;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */       MainMemory.setI32(paramInt4, i1);
/*     */       
/*     */ 
/*     */       label797:
/*     */       
/*     */ 
/* 321 */       ffmahd.call(paramInt1, i7 + 1, j, paramInt4);
/* 322 */       if (paramInt3 != -1) {
/*     */         break label841;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */       ffiblk_1086.call(paramInt1, i6, n, paramInt4);
/*     */       
/*     */ 
/*     */       label841:
/*     */       
/*     */ 
/* 338 */       i3 = MainMemory.getI32(i6);
/* 339 */       l3 = MainMemory.getI64(MainMemory.getI32(i3 + 84) + (MainMemory.getI32(i3 + 76) + 1 << 3));
/* 340 */       paramInt3 = (int)((l3 - l1) / 2880L);
/* 341 */       l2 = l3 + paramInt2 * 2880L + -2880L;
/* 342 */       l3 += -2880L;
/* 343 */       l4 = 0L;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 350 */         l5 = l4 * -2880L;
/* 351 */         l6 = l2 + l5;
/* 352 */         if ((int)l4 >= paramInt3) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 362 */         if (ffmbyt.call(paramInt1, l3 + l5, 0, paramInt4) <= 0) {
/*     */           break label994;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */         i = MainMemory.getI32(paramInt4);
/*     */         
/*     */ 
/*     */         break label1251;
/*     */         
/*     */         label994:
/*     */         
/* 379 */         ffgbyt.call(paramInt1, 2880L, k, paramInt4);
/* 380 */         ffmbyt.call(paramInt1, l6, 1, paramInt4);
/* 381 */         ffpbyt.call(paramInt1, 2880L, k, paramInt4);
/* 382 */         l4 += 1L;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 388 */       ffiblk_1087.call(paramInt2, paramInt1, l1, m, paramInt4);
/*     */       
/*     */ 
/*     */       label1056:
/*     */       
/*     */ 
/* 394 */       if (i2 == 0) {
/*     */         break label1107;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */       i9 = MainMemory.getI32(paramInt1 + 4) + 112;
/* 405 */       MainMemory.setI64(i9, MainMemory.getI64(i9) + paramInt2 * 2880L);
/*     */       
/*     */ 
/*     */       label1107:
/*     */       
/*     */ 
/* 411 */       i6 = paramInt1 + 4;
/* 412 */       i3 = MainMemory.getI32(i6);
/* 413 */       paramInt3 = MainMemory.getI32(i3 + 64);
/* 414 */       if (MainMemory.getI32(i3 + 76) >= paramInt3)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */         l1 = paramInt2 * 2880L;
/* 425 */         paramInt2 = paramInt3 + 1;
/*     */         
/* 427 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 435 */           paramInt3 = paramInt2 + i1;
/* 436 */           i9 = MainMemory.getI32(i3 + 84) + (paramInt3 << 3);
/* 437 */           MainMemory.setI64(i9, MainMemory.getI64(i9) + l1);
/* 438 */           i3 = MainMemory.getI32(i6);
/* 439 */           i1 += 1;
/* 440 */           if (MainMemory.getI32(i3 + 76) < paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 452 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */       label1251:
/*     */       
/*     */ 
/* 458 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 463 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffiblk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */