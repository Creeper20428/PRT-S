/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
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
/*     */ public final class ffgtop
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3433;
/*  27 */   public static final Function _instance = new ffgtop();
/*  28 */   public final Function resolve() { return _instance; }
/*     */   
/*  30 */   public ffgtop() { super("ffgtop", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  34 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  39 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int n = call(i, j, k, m);
/*  52 */     paramFrame.setI32(paramInt1, n);
/*  53 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  58 */     int i = 0;
/*     */     
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
/*     */     
/*     */ 
/*  79 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  83 */       j = MainMemory.alloc(81);
/*  84 */       k = MainMemory.alloc(71);
/*  85 */       m = MainMemory.alloc(4);
/*  86 */       n = MainMemory.alloc(4);
/*  87 */       i1 = MainMemory.alloc(72);
/*  88 */       i2 = MainMemory.alloc(1025);
/*  89 */       i3 = MainMemory.alloc(4);
/*  90 */       i4 = MainMemory.alloc(1025);
/*  91 */       i5 = MainMemory.alloc(1025);
/*  92 */       i6 = MainMemory.alloc(1025);
/*  93 */       i7 = MainMemory.alloc(73);
/*  94 */       i8 = MainMemory.alloc(8);
/*  95 */       MainMemory.setI32(m, 0);
/*  96 */       MainMemory.setI32(n, 0);
/*  97 */       i12 = MainMemory.getI32(paramInt4);
/*  98 */       if (i12 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 102 */         paramInt2 = i12;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 109 */         MainMemory.setI32(paramInt3, 0);
/* 110 */         MainMemory.setI32(paramInt4, ffgmng.call(paramInt1, m, paramInt4));
/* 111 */         i12 = MainMemory.getI32(m);
/* 112 */         if (i12 >= paramInt2) {
/*     */           break label280;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         MainMemory.setI32(paramInt4, 344);
/* 123 */         SystemLibrary.sprintf(i7, 124320, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(i12) });
/* 124 */         ffxmsg.call(5, i7);
/* 125 */         paramInt2 = MainMemory.getI32(paramInt4);
/*     */         
/*     */         break label1533;
/*     */         
/*     */         label280:
/*     */         
/* 131 */         SystemLibrary.sprintf(i1, 39648, new Object[] { Integer.valueOf(paramInt2) });
/* 132 */         i12 = MainMemory.getI32(paramInt4);
/* 133 */         if (i12 > 0) {
/* 134 */           i9 = i12;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 144 */           MainMemory.setI8(k, (byte)0);
/* 145 */           MainMemory.setI8(i7, (byte)0);
/* 146 */           if (ffgcrd.call(paramInt1, i1, j, paramInt4) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */             ffpsvc.call(j, k, i7, paramInt4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 162 */           ffc2i.call(k, n, paramInt4);
/* 163 */           i12 = MainMemory.getI32(paramInt4);
/* 164 */           i9 = i12;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         MainMemory.setI32(paramInt4, i9);
/* 172 */         if (i9 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 176 */           paramInt2 = i9;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 183 */           i12 = MainMemory.getI32(n);
/* 184 */           if (i12 <= 0) {
/*     */             break label647;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */           if (i9 <= 0)
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
/* 205 */             if (paramInt1 != 0) {
/*     */               break label501;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */             MainMemory.setI32(paramInt4, 115);
/* 216 */             i9 = 115;
/*     */             
/*     */             break label624;
/*     */             
/*     */             label501:
/* 221 */             i10 = paramInt1 + 4;
/* 222 */             if (MainMemory.getI32(MainMemory.getI32(i10) + 16) != 555) {
/*     */               break label609;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */             i13 = calloc.call(1, 8);
/* 233 */             MainMemory.setI32(paramInt3, i13);
/* 234 */             i11 = MainMemory.getI32(i10);
/* 235 */             MainMemory.setI32(i13 + 4, i11);
/* 236 */             MainMemory.setI32(i13, 0);
/* 237 */             n = i11 + 8;
/* 238 */             MainMemory.setI32(n, MainMemory.getI32(n) + 1);
/* 239 */             paramInt2 = MainMemory.getI32(paramInt4);
/* 240 */             i9 = paramInt2;
/*     */             
/*     */             break label624;
/*     */             
/*     */             label609:
/* 245 */             MainMemory.setI32(paramInt4, 114);
/* 246 */             i9 = 114;
/*     */           }
/*     */           
/*     */ 
/*     */           label624:
/*     */           
/*     */ 
/* 253 */           MainMemory.setI32(paramInt4, i9);
/* 254 */           paramInt2 = i12;
/* 255 */           i12 = i9;
/*     */           
/*     */           break label1413;
/*     */           
/*     */           label647:
/* 260 */           if (i12 != 0) {
/*     */             break label718;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */           MainMemory.setI32(paramInt4, 344);
/* 271 */           SystemLibrary.sprintf(i7, 95264, new Object[] { Integer.valueOf(i12), Integer.valueOf(paramInt2) });
/* 272 */           ffxmsg.call(5, i7);
/* 273 */           paramInt2 = i12;
/*     */           
/*     */           break label1316;
/*     */           
/*     */           label718:
/* 278 */           i12 = 0 - i12;
/* 279 */           MainMemory.setI32(n, i12);
/* 280 */           SystemLibrary.sprintf(i1, 39680, new Object[] { Integer.valueOf(paramInt2) });
/* 281 */           i9 = ffgkls.call(paramInt1, i1, i3, i7, paramInt4);
/* 282 */           MainMemory.setI32(paramInt4, i9);
/* 283 */           if (i9 != 0) {
/*     */             break label818;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 294 */           i13 = MainMemory.getI32(i3);
/* 295 */           SystemLibrary.strcpy(i2, i13);
/* 296 */           free.call(i13);
/* 297 */           i9 = MainMemory.getI32(paramInt4);
/*     */           
/*     */ 
/*     */ 
/*     */           label818:
/*     */           
/*     */ 
/*     */ 
/* 305 */           if (i9 != 202) {
/*     */             break label884;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 315 */           MainMemory.setI32(paramInt4, 344);
/* 316 */           SystemLibrary.sprintf(i7, 86368, new Object[] { Integer.valueOf(paramInt2) });
/* 317 */           ffxmsg.call(5, i7);
/* 318 */           paramInt2 = i12;
/*     */           
/*     */           break label1316;
/*     */           
/*     */           label884:
/* 323 */           prepare_keyvalue.call(i2);
/* 324 */           if (fits_is_url_absolute.call(i2) != 0) {
/*     */             break label1332;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */           MainMemory.setI32(paramInt4, fits_url2path.call(i2, i5, paramInt4));
/* 335 */           ffopen.call(paramInt3, i5, 1, paramInt4);
/* 336 */           i9 = MainMemory.getI32(paramInt4);
/* 337 */           if (i9 == 0) {
/* 338 */             paramInt2 = i12;
/* 339 */             i12 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 349 */             ffxmsg.call(5, 115488);
/* 350 */             MainMemory.setI32(paramInt4, 0);
/* 351 */             ffopen.call(paramInt3, i5, 0, paramInt4);
/* 352 */             i9 = MainMemory.getI32(paramInt4);
/* 353 */             if (i9 == 0) {
/* 354 */               paramInt2 = i12;
/* 355 */               i12 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 365 */               MainMemory.setI32(paramInt4, 0);
/* 366 */               MainMemory.setI32(i8, i5);
/* 367 */               MainMemory.setI32(i8 + 4, i6);
/* 368 */               MainMemory.setI32(paramInt4, fits_get_url.call(paramInt1, i5, i6, 0, 0, 0, paramInt4));
/* 369 */               MainMemory.setI32(paramInt3, 0);
/* 370 */               i13 = i5;
/* 371 */               paramInt2 = 1;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 379 */                 if (MainMemory.getI8(i13) != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 389 */                   i9 = fits_relurl2url.call(i13, i2, i4, paramInt4);
/* 390 */                   MainMemory.setI32(paramInt4, i9);
/* 391 */                   if (i9 != 0) {
/*     */                     break label1260;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 401 */                   if (fits_is_url_absolute.call(i4) != 0) {
/*     */                     break label1160;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */                   MainMemory.setI32(paramInt4, fits_url2path.call(i4, i13, paramInt4));
/* 412 */                   SystemLibrary.strcpy(i4, i13);
/*     */                   
/*     */ 
/*     */                   label1160:
/*     */                   
/*     */ 
/* 418 */                   ffopen.call(paramInt3, i4, 1, paramInt4);
/* 419 */                   i9 = MainMemory.getI32(paramInt4);
/* 420 */                   if (i9 != 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */                     ffxmsg.call(5, 95328);
/* 432 */                     ffxmsg.call(5, 95392);
/* 433 */                     MainMemory.setI32(paramInt4, 0);
/* 434 */                     ffopen.call(paramInt3, i4, 0, paramInt4);
/* 435 */                     i9 = MainMemory.getI32(paramInt4);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 443 */                   if (i9 == 0) {
/* 444 */                     paramInt2 = i12;
/* 445 */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 454 */                   MainMemory.setI32(paramInt4, 0);
/*     */                   
/*     */                   break label1270;
/*     */                   
/*     */                   label1260:
/* 459 */                   MainMemory.setI32(paramInt4, 0);
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1270:
/*     */                 
/* 465 */                 if (paramInt2 >= 2)
/*     */                 {
/*     */ 
/*     */ 
/* 469 */                   paramInt2 = i12;
/* 470 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 476 */                 i13 = MainMemory.getI32(i8 + (paramInt2 << 2));
/* 477 */                 paramInt2 += 1;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */               label1316:
/*     */               
/*     */ 
/* 485 */               i12 = MainMemory.getI32(paramInt4);
/*     */               
/*     */ 
/*     */               break label1413;
/*     */               
/*     */               label1332:
/*     */               
/* 492 */               ffxmsg.call(5, 120864);
/* 493 */               ffopen.call(paramInt3, i2, 1, paramInt4);
/* 494 */               i9 = MainMemory.getI32(paramInt4);
/* 495 */               if (i9 == 0) {
/* 496 */                 paramInt2 = i12;
/* 497 */                 i12 = i9;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 507 */                 ffxmsg.call(5, 115488);
/* 508 */                 MainMemory.setI32(paramInt4, 0);
/* 509 */                 ffopen.call(paramInt3, i2, 0, paramInt4);
/* 510 */                 i9 = MainMemory.getI32(paramInt4);
/* 511 */                 paramInt2 = i12;
/* 512 */                 i12 = i9;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label1413:
/*     */           
/* 520 */           if (i12 != 0)
/*     */           {
/*     */ 
/*     */ 
/* 524 */             paramInt2 = i12;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 531 */             paramInt1 = MainMemory.getI32(paramInt3);
/* 532 */             if (paramInt1 != 0) {
/*     */               break label1483;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 542 */             ffxmsg.call(5, 120928);
/* 543 */             MainMemory.setI32(paramInt4, 343);
/* 544 */             paramInt2 = 343;
/*     */             
/*     */             break label1547;
/*     */             
/*     */             label1483:
/* 549 */             paramInt2 = ffmnhd.call(paramInt1, -1, 44224, paramInt2, paramInt4);
/* 550 */             MainMemory.setI32(paramInt4, paramInt2);
/* 551 */             if (paramInt2 != 0)
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
/* 562 */               MainMemory.setI32(paramInt4, 343);
/* 563 */               paramInt2 = 343;
/*     */               break label1547;
/*     */             }
/*     */           }
/*     */         }
/*     */         label1533:
/* 569 */         if (paramInt2 != 0)
/*     */         {
/*     */           label1547:
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
/* 582 */           paramInt1 = MainMemory.getI32(paramInt3);
/* 583 */           if (paramInt1 != 0)
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
/* 594 */             ffclos.call(paramInt1, paramInt4);
/* 595 */             MainMemory.setI32(paramInt3, 0);
/* 596 */             i = MainMemory.getI32(paramInt4);
/*     */             
/*     */ 
/*     */             break label1601;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 604 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label1601:
/*     */       
/*     */ 
/* 610 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 615 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */