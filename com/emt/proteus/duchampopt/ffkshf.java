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
/*     */ 
/*     */ public final class ffkshf
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3143;
/*  18 */   public static final Function _instance = new ffkshf();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffkshf() { super("ffkshf", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, j, k, m, n);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     int i8 = 0;
/*  66 */     int i9 = 0;
/*  67 */     int i10 = 0;
/*  68 */     int i11 = 0;
/*     */     
/*     */ 
/*  71 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i = MainMemory.alloc(4);
/*  76 */       j = MainMemory.alloc(81);
/*  77 */       k = MainMemory.alloc(4);
/*  78 */       i8 = MainMemory.alloc(4);
/*  79 */       m = MainMemory.alloc(81);
/*  80 */       n = MainMemory.alloc(72);
/*  81 */       i1 = MainMemory.alloc(72);
/*  82 */       ffghsp.call(paramInt1, k, i8, paramInt5);
/*  83 */       if (MainMemory.getI32(k) >= 9)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         i2 = m + 1;
/*  94 */         i3 = m;
/*  95 */         i4 = paramInt4 < 1 ? 1 : 0;
/*  96 */         i5 = paramInt1 + 4;
/*  97 */         i6 = 9;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 104 */           ffgrec.call(paramInt1, i6, m, paramInt5);
/* 105 */           if (MainMemory.getI8(m) != 84) {
/*     */             break label1163;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           SystemLibrary.strncpy(n, i2, 4);
/* 117 */           if (SystemLibrary.strncmp(n, 21728, 4) == 0) {
/* 118 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 128 */           else if (SystemLibrary.strncmp(n, 21760, 4) == 0) {
/* 129 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 139 */           else if (SystemLibrary.strncmp(n, 21792, 4) == 0) {
/* 140 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 150 */           else if (SystemLibrary.strncmp(n, 21824, 4) == 0) {
/* 151 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 161 */           else if (SystemLibrary.strncmp(n, 21856, 4) == 0) {
/* 162 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 172 */           else if (SystemLibrary.strncmp(n, 19264, 4) == 0) {
/* 173 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 183 */           else if (SystemLibrary.strncmp(n, 21920, 4) == 0) {
/* 184 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 194 */           else if (SystemLibrary.strncmp(n, 21952, 4) == 0) {
/* 195 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 205 */           else if (SystemLibrary.strncmp(n, 21984, 4) == 0) {
/* 206 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 216 */           else if (SystemLibrary.strncmp(n, 22016, 4) == 0) {
/* 217 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 227 */           else if (SystemLibrary.strncmp(n, 22048, 4) == 0) {
/* 228 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 238 */           else if (SystemLibrary.strncmp(n, 22080, 4) == 0) {
/* 239 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 249 */           else if (SystemLibrary.strncmp(n, 22112, 4) == 0) {
/* 250 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 260 */           else if (SystemLibrary.strncmp(n, 22144, 4) == 0) {
/* 261 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 271 */           else if (SystemLibrary.strncmp(n, 22176, 4) == 0) {
/* 272 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 282 */           else if (SystemLibrary.strncmp(n, 22208, 4) == 0) {
/* 283 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 293 */           else if (SystemLibrary.strncmp(n, 22272, 4) == 0) {
/* 294 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 304 */           else if (SystemLibrary.strncmp(n, 22304, 4) == 0) {
/* 305 */             i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 315 */           else if (SystemLibrary.strncmp(m, 22336, 4) == 0) {
/* 316 */             i7 = 4;
/*     */           } else {
/*     */             break label1163;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */           MainMemory.setI8(n, (byte)0);
/* 329 */           SystemLibrary.strncat(n, m + i7, 8 - i7);
/* 330 */           i8 = SystemLibrary.__errno_location();
/* 331 */           MainMemory.setI32(i8, 0);
/* 332 */           i9 = SystemLibrary.strtol(n, i, 10);
/* 333 */           switch (MainMemory.getI8(MainMemory.getI32(i))) {
/* 334 */           case 0:  i10 = 0;
/*     */             break label804;
/*     */             break; case 32:  i10 = 0;
/*     */             
/*     */ 
/*     */             break label804;
/*     */             
/*     */ 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 346 */           i10 = 407;
/*     */           
/*     */ 
/*     */ 
/*     */           label804:
/*     */           
/*     */ 
/* 353 */           if (MainMemory.getI32(i8) != 34) {
/*     */             break label869;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */           SystemLibrary.memcpy(j, 120672, 54, 1);
/* 364 */           SystemLibrary.strncat(j, n, 25);
/* 365 */           ffxmsg.call(5, j);
/* 366 */           MainMemory.setI32(i8, 0);
/*     */           
/*     */           break label1163;
/*     */           
/*     */           label869:
/*     */           
/* 372 */           if (i10 != 0) {
/*     */             break label1163;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 383 */           if ((i9 < paramInt2) || (i9 <= paramInt3))
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
/* 394 */             if ((i4 == 0) || (i9 != paramInt2)) {
/*     */               break label969;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */             ffdrec.call(paramInt1, i6, paramInt5);
/* 405 */             MainMemory.setI32(k, MainMemory.getI32(k) + -1);
/* 406 */             i6 += -1;
/*     */             
/*     */             break label1163;
/*     */             
/*     */             label969:
/*     */             
/* 412 */             i9 += paramInt4;
/* 413 */             MainMemory.setI8(n, (byte)0);
/* 414 */             SystemLibrary.strncat(n, m, i7);
/* 415 */             ffkeyn.call(n, i9, i1, paramInt5);
/* 416 */             MainMemory.setI64(i3, 2314885530818453536L);
/* 417 */             SystemLibrary.strncpy(m, i1, SystemLibrary.strlen(i1));
/* 418 */             if (MainMemory.getI32(paramInt5) <= 0)
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
/* 429 */               i7 = MainMemory.getI32(paramInt1);
/* 430 */               i11 = MainMemory.getI32(i5);
/* 431 */               i9 = MainMemory.getI32(i11 + 64);
/* 432 */               if (i7 == i9) {
/* 433 */                 i7 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 444 */                 ffmahd.call(paramInt1, i7 + 1, 0, paramInt5);
/* 445 */                 i11 = MainMemory.getI32(i5);
/* 446 */                 i7 = MainMemory.getI32(i11 + 64);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 456 */               MainMemory.setI64(i11 + 104, MainMemory.getI64(MainMemory.getI32(i11 + 84) + (i7 << 3)) + i6 * 80);
/* 457 */               ffmkey.call(paramInt1, m, paramInt5);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label1163:
/*     */           
/*     */ 
/* 465 */           i6 += 1;
/* 466 */           if (i6 > MainMemory.getI32(k))
/*     */           {
/*     */ 
/*     */             break;
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */         }
/*     */         
/*     */ 
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/* 487 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffkshf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */