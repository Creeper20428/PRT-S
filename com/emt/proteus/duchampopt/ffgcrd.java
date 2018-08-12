/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*     */ 
/*     */ public final class ffgcrd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3411;
/*  16 */   public static final Function _instance = new ffgcrd();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public ffgcrd() { super("ffgcrd", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = call(i, j, k, m);
/*  41 */     paramFrame.setI32(paramInt1, n);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     long l = 0L;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     byte b = 0;
/*  63 */     int i9 = 0;
/*  64 */     int i10 = 0;
/*  65 */     int i11 = 0;
/*  66 */     int i12 = 0;
/*  67 */     int i13 = 0;
/*  68 */     int i14 = 0;
/*  69 */     int i15 = 0;
/*  70 */     int i16 = 0;
/*  71 */     int i17 = 0;
/*  72 */     int i18 = 0;
/*  73 */     int i19 = 0;
/*     */     
/*     */ 
/*  76 */     int i20 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  80 */       j = MainMemory.alloc(4);
/*  81 */       k = MainMemory.alloc(4);
/*  82 */       m = MainMemory.alloc(4);
/*  83 */       n = MainMemory.alloc(72);
/*  84 */       i1 = MainMemory.alloc(72);
/*  85 */       i3 = MainMemory.getI32(paramInt4);
/*  86 */       if (i3 <= 0) {
/*     */         break label153;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       i = i3;
/*     */       
/*     */ 
/*     */       break label1708;
/*     */       
/*     */       label153:
/*     */       
/* 103 */       MainMemory.setI8(n, (byte)0);
/* 104 */       if (MainMemory.getI8(paramInt2) == 32) {
/* 105 */         i3 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 109 */         i3 = 0;
/*     */         
/*     */ 
/*     */         break label215;
/*     */       }
/*     */       
/*     */       do
/*     */       {
/* 117 */         i3 += 1;
/* 118 */       } while (MainMemory.getI8(paramInt2 + i3) == 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label215:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       SystemLibrary.strncat(n, paramInt2 + i3, 71);
/* 132 */       i4 = SystemLibrary.strlen(n);
/* 133 */       i5 = i4 + -1;
/* 134 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 141 */         i3 = i4 - i10;
/* 142 */         if (i3 < 1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         if (MainMemory.getI8(n + (i5 - i10)) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */         i3 = i10 + 1;
/* 163 */         i10 = i3;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 168 */       MainMemory.setI8(n + i3, (byte)0);
/* 169 */       if (i3 <= 0) {
/*     */         break label412;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */       i2 = __ctype_toupper_loc.call();
/* 180 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 187 */         paramInt2 = n + i4;
/* 188 */         MainMemory.setI8(paramInt2, (byte)MainMemory.getI32(MainMemory.getI32(i2) + (MainMemory.getI8(paramInt2) << 2)));
/* 189 */         i4 += 1;
/* 190 */         if (i4 == i3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label412:
/*     */       
/*     */ 
/*     */ 
/* 201 */       if (MainMemory.getI8(n) != 72)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 206 */         i19 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 213 */       else if (SystemLibrary.strncmp(44128, n, 8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 218 */         i19 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 225 */       else if (i3 == 8)
/*     */       {
/* 227 */         i19 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 237 */         paramInt2 = n + 8;
/* 238 */         b = MainMemory.getI8(paramInt2);
/* 239 */         if (b == 32) {
/* 240 */           i3 = 0;
/*     */         } else {
/*     */           break label559;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 253 */           paramInt2 = n + (i3 + 9);
/* 254 */           b = MainMemory.getI8(paramInt2);
/* 255 */           i3 += 1;
/* 256 */         } while (b == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label559:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */         if (b == 0) {
/* 272 */           paramInt2 = n;
/* 273 */           i3 = 0;
/*     */           break label644;
/*     */         }
/*     */         else {
/* 277 */           i4 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 287 */           i3 = i4 + 1;
/* 288 */           MainMemory.setI8(n + i4, b);
/* 289 */           b = MainMemory.getI8(paramInt2 + i3);
/* 290 */           if (b == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 295 */           i4 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */         paramInt2 = n + i3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label644:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 312 */         MainMemory.setI8(paramInt2, (byte)0);
/*     */         
/* 314 */         i19 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */       if (i3 > 8) {
/* 323 */         i4 = i3;
/* 324 */         i10 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 334 */         if (SystemLibrary.strchr(n, 63) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 338 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 345 */           paramInt2 = SystemLibrary.strchr(n, 42);
/* 346 */           if (paramInt2 != 0) {
/*     */             break label758;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */           if (SystemLibrary.strchr(n, 35) == 0) {
/* 358 */             i4 = i3;
/* 359 */             i10 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */             break label782;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label758:
/*     */         
/*     */ 
/* 371 */         i4 = paramInt2 == 0 ? i3 : i3 + -2;
/*     */         
/* 373 */         i10 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label782:
/*     */       
/*     */ 
/* 381 */       if (MainMemory.getI32(paramInt4) > 0) {
/* 382 */         i18 = 0;
/* 383 */         i16 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 393 */         i5 = MainMemory.getI32(paramInt1);
/* 394 */         i9 = paramInt1 + 4;
/* 395 */         i17 = MainMemory.getI32(i9);
/* 396 */         i18 = MainMemory.getI32(i17 + 64);
/* 397 */         if (i5 == i18) {
/* 398 */           i5 = i18;
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
/* 409 */           ffmahd.call(paramInt1, i5 + 1, 0, paramInt4);
/* 410 */           i17 = MainMemory.getI32(i9);
/* 411 */           i5 = MainMemory.getI32(i17 + 64);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 421 */         l = MainMemory.getI64(MainMemory.getI32(i17 + 84) + (i5 << 3));
/* 422 */         i5 = (int)((MainMemory.getI64(i17 + 88) - l) / 80L);
/* 423 */         i18 = (int)((MainMemory.getI64(i17 + 104) - l) / 80L) + 1;
/*     */         
/* 425 */         i16 = i5;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */       i5 = i3 > 2 ? i3 + -1 : 1;
/* 434 */       i16 = 1 - i18 + i16;
/* 435 */       i6 = i19 == 0 ? 1 : 0;
/* 436 */       i7 = i10 == 0 ? 1 : 0;
/* 437 */       paramInt2 = n + i5;
/* 438 */       i8 = i1 + i5;
/* 439 */       b = (byte)i10;
/* 440 */       i9 = paramInt1 + 4;
/* 441 */       i10 = i18 + -1;
/* 442 */       i11 = i7 == 0 ? 1 : 0;
/* 443 */       i18 = i16;
/* 444 */       i19 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 452 */         if (i19 < 2) {
/* 453 */           i16 = 0;
/*     */         } else {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 464 */           if (i16 >= i18) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 474 */           ffgnky.call(paramInt1, paramInt3, paramInt4);
/* 475 */           if (i6 == 0) {
/*     */             break label1459;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */           ffgknm.call(paramInt3, i1, j);
/* 486 */           i12 = MainMemory.getI32(j);
/* 487 */           if (i12 >= i4)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 497 */             if ((i12 != i3) && (i11 == 0)) {
/*     */               break label1521;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */             if (i12 <= 0) {
/*     */               break label1303;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */             i12 = i12 > 1 ? i12 : 1;
/* 518 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 525 */               i14 = i1 + i13;
/* 526 */               i15 = MainMemory.getI8(i14);
/* 527 */               if (i15 <= 96) {
/*     */                 break label1277;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 537 */               MainMemory.setI8(i14, (byte)MainMemory.getI32(MainMemory.getI32(__ctype_toupper_loc.call()) + (i15 << 2)));
/*     */               
/*     */ 
/*     */               label1277:
/*     */               
/*     */ 
/* 543 */               i13 += 1;
/* 544 */               if (i13 == i12) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1303:
/*     */             
/*     */ 
/*     */ 
/* 555 */             if (i7 == 0) {
/*     */               break label1413;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 565 */             if (MainMemory.getI8(paramInt2) != MainMemory.getI8(i8)) {
/*     */               break label1521;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 575 */             if (MainMemory.getI8(n) != MainMemory.getI8(i1)) {
/*     */               break label1521;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 585 */             if (SystemLibrary.strncmp(n, i1, i5) != 0) {
/*     */               break label1521;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 595 */             i = MainMemory.getI32(paramInt4);
/*     */             
/*     */ 
/*     */             break label1708;
/*     */             
/*     */             label1413:
/*     */             
/* 602 */             ffcmps.call(n, i1, 1, k, m);
/* 603 */             if (MainMemory.getI32(k) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */               i = MainMemory.getI32(paramInt4);
/*     */               
/*     */ 
/*     */               break label1708;
/*     */               
/*     */               label1459:
/*     */               
/* 620 */               if (MainMemory.getI8(paramInt3) != 72) {
/*     */                 break label1521;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 630 */               if (SystemLibrary.strncmp(44128, paramInt3, 8) != 0) {
/*     */                 break label1521;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 640 */               i = MainMemory.getI32(paramInt4);
/*     */               
/*     */               break label1708;
/*     */             }
/*     */           }
/*     */           
/*     */           label1521:
/* 647 */           i16 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 653 */         if (MathUtils.or((byte)(i19 == 1 ? 1 : 0), b) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 663 */         i18 = MainMemory.getI32(paramInt1);
/* 664 */         i17 = MainMemory.getI32(i9);
/* 665 */         i16 = MainMemory.getI32(i17 + 64);
/* 666 */         if (i18 == i16) {
/* 667 */           i18 = i16;
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
/* 678 */           ffmahd.call(paramInt1, i18 + 1, 0, paramInt4);
/* 679 */           i17 = MainMemory.getI32(i9);
/* 680 */           i18 = MainMemory.getI32(i17 + 64);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 690 */         MainMemory.setI64(i17 + 104, MainMemory.getI64(MainMemory.getI32(i17 + 84) + (i18 << 3)));
/* 691 */         i19 += 1;
/* 692 */         i18 = i10;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 698 */       MainMemory.setI32(paramInt4, 202);
/* 699 */       i = 202;
/*     */       
/*     */ 
/*     */       label1708:
/*     */       
/*     */ 
/* 705 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 710 */       MainMemory.dealloc_generated(i20);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcrd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */