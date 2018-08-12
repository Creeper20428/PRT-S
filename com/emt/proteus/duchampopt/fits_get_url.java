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
/*     */ public final class fits_get_url
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3429;
/*  15 */   public static final Function _instance = new fits_get_url();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public fits_get_url() { super("fits_get_url", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = call(i, j, k, m, n, i1, i2);
/*  49 */     paramFrame.setI32(paramInt1, i3);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  55 */     int i = 0;
/*     */     
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*  62 */     int i2 = 0;
/*  63 */     int i3 = 0;
/*  64 */     int i4 = 0;
/*  65 */     int i5 = 0;
/*  66 */     int i6 = 0;
/*     */     
/*     */ 
/*  69 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       j = MainMemory.alloc(1025);
/*  74 */       k = MainMemory.alloc(1025);
/*  75 */       m = MainMemory.alloc(1025);
/*  76 */       n = MainMemory.alloc(1025);
/*  77 */       i1 = MainMemory.alloc(1025);
/*  78 */       i2 = MainMemory.alloc(1025);
/*  79 */       if (MainMemory.getI32(paramInt7) != 0) {
/*     */         break label1791;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */       MainMemory.setI8(i2, (byte)0);
/*  90 */       MainMemory.setI8(i1, (byte)0);
/*  91 */       MainMemory.setI8(n, (byte)0);
/*  92 */       MainMemory.setI8(m, (byte)0);
/*  93 */       i3 = paramInt1 + 4;
/*  94 */       SystemLibrary.strcpy(m, MainMemory.getI32(MainMemory.getI32(i3) + 12));
/*  95 */       MainMemory.setI32(paramInt7, ffifile.call(m, 0, j, k, 0, n, i1, i2, 0, paramInt7));
/*  96 */       if (MainMemory.getI8(n) != 0) {
/*     */         break label241;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       if (MainMemory.getI8(i1) != 0) {
/*     */         break label241;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       if (MainMemory.getI8(i2) == 0) {
/* 117 */         i4 = 0;
/*     */       } else {
/*     */         label241:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         i4 = -1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       SystemLibrary.strcpy(i1, 492288 + MainMemory.getI32(MainMemory.getI32(i3) + 4) * 84);
/* 135 */       SystemLibrary.strcpy(i2, i1);
/* 136 */       MainMemory.setI32(paramInt7, ffrtnm.call(m, n, paramInt7));
/* 137 */       SystemLibrary.strcpy(m, n);
/* 138 */       if (SystemLibrary.strcasecmp(i1, 40448) != 0) {
/*     */         break label481;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       if (MainMemory.getI8(k) != 0) {
/*     */         break label361;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       MainMemory.setI8(n, (byte)0);
/*     */       
/*     */       break label374;
/*     */       
/*     */       label361:
/* 163 */       SystemLibrary.strcpy(m, k);
/*     */       
/*     */ 
/*     */       label374:
/*     */       
/*     */ 
/* 169 */       i5 = SystemLibrary.strstr(m, 17696);
/* 170 */       if (i5 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */         SystemLibrary.strcpy(j, i5 + 3);
/* 181 */         SystemLibrary.strcpy(m, j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 187 */       i5 = SystemLibrary.strstr(n, 17696);
/* 188 */       if (i5 == 0) {
/* 189 */         i4 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 199 */         SystemLibrary.strcpy(j, i5 + 3);
/* 200 */         SystemLibrary.strcpy(n, j);
/* 201 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label481:
/* 206 */         if (SystemLibrary.strcasecmp(i1, 33248) != 0) {
/*     */           break label564;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */         if (i4 >= 0) {
/*     */           break label545;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         ffxmsg.call(5, 118880);
/* 227 */         MainMemory.setI32(paramInt7, 125);
/*     */         
/*     */         break label1791;
/*     */         
/*     */         label545:
/* 232 */         MainMemory.setI8(n, (byte)0);
/* 233 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label564:
/* 238 */         if (SystemLibrary.strcasecmp(i1, 49600) != 0) {
/*     */           break label622;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */         SystemLibrary.memcpy(i1, 33248, 7, 1);
/* 249 */         MainMemory.setI8(i2, (byte)0);
/* 250 */         MainMemory.setI8(n, (byte)0);
/* 251 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label622:
/* 256 */         if (SystemLibrary.strcasecmp(i1, 44672) != 0) {
/*     */           break label670;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */         MainMemory.setI8(i2, (byte)0);
/* 267 */         MainMemory.setI8(n, (byte)0);
/* 268 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label670:
/* 273 */         if (SystemLibrary.strcasecmp(i1, 40544) != 0) {
/*     */           break label718;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */         MainMemory.setI8(i2, (byte)0);
/* 284 */         MainMemory.setI8(n, (byte)0);
/* 285 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label718:
/* 290 */         if (SystemLibrary.strcasecmp(i1, 57152) != 0) {
/*     */           break label786;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */         SystemLibrary.strcpy(m, k);
/* 301 */         SystemLibrary.strcpy(n, j);
/* 302 */         MainMemory.setI64(i1, 13281251761613158L);
/* 303 */         MainMemory.setI64(i2, 13281251761613158L);
/* 304 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label786:
/* 309 */         if (SystemLibrary.strcasecmp(i1, 51424) != 0) {
/*     */           break label846;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */         SystemLibrary.strcpy(m, k);
/* 320 */         MainMemory.setI64(i1, 13281251761613158L);
/* 321 */         MainMemory.setI64(i2, 13281251946689640L);
/* 322 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label846:
/* 327 */         if (SystemLibrary.strcasecmp(i1, 49664) != 0) {
/*     */           break label908;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */         SystemLibrary.strcpy(m, k);
/* 338 */         MainMemory.setI64(i1, 13281251761613158L);
/* 339 */         SystemLibrary.memcpy(i2, 33216, 7, 1);
/* 340 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label908:
/* 345 */         if (SystemLibrary.strcasecmp(i1, 52704) != 0) {
/*     */           break label970;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */         SystemLibrary.strcpy(m, k);
/* 356 */         MainMemory.setI64(i1, 13281251761613158L);
/* 357 */         SystemLibrary.memcpy(i2, 44704, 9, 1);
/* 358 */         i4 = 1;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label970:
/* 363 */         if (SystemLibrary.strcasecmp(i1, 51392) != 0) {
/*     */           break label1038;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */         MainMemory.setI8(m, (byte)0);
/* 374 */         SystemLibrary.strcpy(n, j);
/* 375 */         SystemLibrary.memcpy(i1, 33248, 7, 1);
/* 376 */         MainMemory.setI64(i2, 13281251761613158L);
/* 377 */         i4 = 0;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label1038:
/* 382 */         if (SystemLibrary.strcasecmp(i1, 40512) != 0) {
/*     */           break label1098;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */         MainMemory.setI8(m, (byte)0);
/* 393 */         SystemLibrary.memcpy(i1, 33248, 7, 1);
/* 394 */         MainMemory.setI64(i2, 13281251946689640L);
/* 395 */         i4 = 0;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label1098:
/* 400 */         if (SystemLibrary.strcasecmp(i1, 57184) != 0) {
/*     */           break label1158;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 410 */         MainMemory.setI8(m, (byte)0);
/* 411 */         SystemLibrary.memcpy(i1, 33248, 7, 1);
/* 412 */         MainMemory.setI64(i2, 13281251946689640L);
/* 413 */         i4 = 0;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label1158:
/* 418 */         if (SystemLibrary.strcasecmp(i1, 33216) != 0) {
/*     */           break label1220;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 428 */         MainMemory.setI8(m, (byte)0);
/* 429 */         SystemLibrary.memcpy(i1, 33248, 7, 1);
/* 430 */         SystemLibrary.memcpy(i2, 33216, 7, 1);
/* 431 */         i4 = 0;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label1220:
/* 436 */         if (SystemLibrary.strcasecmp(i1, 55168) != 0) {
/*     */           break label1282;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 446 */         MainMemory.setI8(m, (byte)0);
/* 447 */         SystemLibrary.memcpy(i1, 33248, 7, 1);
/* 448 */         SystemLibrary.memcpy(i2, 33216, 7, 1);
/* 449 */         i4 = 0;
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label1282:
/* 454 */         if (SystemLibrary.strcasecmp(i1, 44704) != 0) {
/*     */           break label1340;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */         MainMemory.setI32(paramInt7, 125);
/* 465 */         ffxmsg.call(5, 115424);
/* 466 */         MainMemory.setI8(n, (byte)0);
/* 467 */         MainMemory.setI8(m, (byte)0);
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label1340:
/*     */         
/* 473 */         if (SystemLibrary.strcasecmp(i1, 47776) != 0) {
/*     */           break label1398;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */         MainMemory.setI32(paramInt7, 125);
/* 484 */         ffxmsg.call(5, 117088);
/* 485 */         MainMemory.setI8(n, (byte)0);
/* 486 */         MainMemory.setI8(m, (byte)0);
/*     */         
/*     */         break label1451;
/*     */         
/*     */         label1398:
/*     */         
/* 492 */         if (SystemLibrary.strcasecmp(i1, 49472) != 0) {
/*     */           break label1451;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 503 */         MainMemory.setI32(paramInt7, 125);
/* 504 */         ffxmsg.call(5, 118944);
/* 505 */         MainMemory.setI8(n, (byte)0);
/* 506 */         MainMemory.setI8(m, (byte)0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1451:
/*     */       
/*     */ 
/* 514 */       if (MainMemory.getI32(paramInt7) != 0) {
/*     */         break label1791;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 524 */       if (paramInt2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 534 */         if (MainMemory.getI8(m) != 0) {
/*     */           break label1522;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 544 */         MainMemory.setI8(paramInt2, (byte)0);
/*     */         
/*     */         break label1602;
/*     */         
/*     */         label1522:
/* 549 */         i5 = SystemLibrary.strstr(m, 17696);
/* 550 */         if (i5 == 0) {
/* 551 */           i6 = 0;
/* 552 */           i5 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 562 */           i5 += 3;
/* 563 */           i6 = i5 - m;
/* 564 */           SystemLibrary.strncpy(paramInt2, m, i6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 574 */         MainMemory.setI32(paramInt7, fits_path2url.call(i5, paramInt2 + i6, paramInt7));
/*     */       }
/*     */       
/*     */ 
/*     */       label1602:
/*     */       
/* 580 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 590 */         if (MainMemory.getI8(n) != 0) {
/*     */           break label1652;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 600 */         MainMemory.setI8(paramInt3, (byte)0);
/*     */         
/*     */         break label1725;
/*     */         
/*     */         label1652:
/* 605 */         paramInt2 = SystemLibrary.strstr(n, 17696);
/* 606 */         if (paramInt2 == 0) {
/* 607 */           i6 = 0;
/* 608 */           paramInt2 = n;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 618 */           paramInt2 += 3;
/* 619 */           i6 = paramInt2 - n;
/* 620 */           SystemLibrary.strncpy(paramInt3, n, i6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 630 */         MainMemory.setI32(paramInt7, fits_path2url.call(paramInt2, paramInt3 + i6, paramInt7));
/*     */       }
/*     */       
/*     */ 
/*     */       label1725:
/*     */       
/* 636 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 646 */         SystemLibrary.strcpy(paramInt4, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 652 */       if (paramInt5 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 662 */         SystemLibrary.strcpy(paramInt5, i2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 668 */       fits_get_url_1461.call(i4, paramInt6);
/*     */       
/*     */ 
/*     */       label1791:
/*     */       
/*     */ 
/* 674 */       i = MainMemory.getI32(paramInt7);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 680 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 685 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_get_url.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */