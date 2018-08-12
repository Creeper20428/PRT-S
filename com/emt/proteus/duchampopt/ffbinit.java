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
/*     */ public final class ffbinit
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3269;
/*  21 */   public static final Function _instance = new ffbinit();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public ffbinit() { super("ffbinit", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  28 */     call(paramInt1, paramInt2);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     call(i, j);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  47 */     int i = 0;
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     long l1 = 0L;
/*  58 */     int i6 = 0;
/*  59 */     boolean bool = false;
/*  60 */     long l2 = 0L;
/*  61 */     long l3 = 0L;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*  70 */     int i15 = 0;
/*  71 */     long l4 = 0L;
/*     */     
/*     */ 
/*  74 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  78 */       i = MainMemory.alloc(4);
/*  79 */       j = MainMemory.alloc(8);
/*  80 */       k = MainMemory.alloc(8);
/*  81 */       m = MainMemory.alloc(8);
/*  82 */       n = MainMemory.alloc(8);
/*  83 */       i1 = MainMemory.alloc(72);
/*  84 */       i2 = MainMemory.alloc(71);
/*  85 */       i3 = MainMemory.alloc(73);
/*  86 */       i4 = MainMemory.alloc(81);
/*  87 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         i6 = MainMemory.getI32(paramInt1);
/*  98 */         i5 = paramInt1 + 4;
/*  99 */         i14 = MainMemory.getI32(i5);
/* 100 */         if (i6 != MainMemory.getI32(i14 + 64))
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
/* 111 */           ffmahd.call(paramInt1, i6 + 1, 0, paramInt2);
/* 112 */           i14 = MainMemory.getI32(i5);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */         MainMemory.setI32(i14 + 68, 2);
/* 121 */         i14 = MainMemory.getI32(i5);
/* 122 */         MainMemory.setI64(i14 + 88, MainMemory.getI64(i14 + 32));
/* 123 */         if (ffgttb.call(paramInt1, k, m, j, i, paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */           l1 = MainMemory.getI64(k);
/* 134 */           MainMemory.setI64(MainMemory.getI32(i5) + 936, l1);
/* 135 */           i6 = MainMemory.getI32(i);
/* 136 */           MainMemory.setI32(MainMemory.getI32(i5) + 916, i6);
/* 137 */           i14 = MainMemory.getI32(i5);
/* 138 */           i7 = MainMemory.getI32(i14 + 1200);
/* 139 */           if (i7 != 0)
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
/* 150 */             free.call(i7);
/* 151 */             MainMemory.setI32(MainMemory.getI32(i5) + 1200, 0);
/* 152 */             MainMemory.setI32(MainMemory.getI32(i5) + 1188, 0);
/* 153 */             MainMemory.setI32(MainMemory.getI32(i5) + 1192, 0);
/* 154 */             MainMemory.setI32(MainMemory.getI32(i5) + 1196, 0);
/* 155 */             i14 = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */           i7 = MainMemory.getI32(i14 + 1204);
/* 164 */           if (i7 != 0)
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
/* 175 */             free.call(i7);
/* 176 */             MainMemory.setI32(MainMemory.getI32(i5) + 1204, 0);
/* 177 */             i14 = MainMemory.getI32(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */           i15 = MainMemory.getI32(i14 + 944);
/* 186 */           if (i15 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */             free.call(i15);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 202 */           bool = i6 > 0;
/* 203 */           if (!bool) {
/*     */             break label624;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */           i7 = calloc.call(i6, 152);
/* 214 */           if (i7 != 0) {
/*     */             break label603;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */           ffxmsg.call(5, 134688);
/* 225 */           MainMemory.setI32(MainMemory.getI32(i5) + 944, 0);
/* 226 */           MainMemory.setI32(paramInt2, 111);
/*     */           
/*     */ 
/*     */           break label1770;
/*     */           
/*     */           label603:
/*     */           
/* 233 */           ffbinit_528.call(bool, i7, i6, i5);
/*     */           
/*     */           break label642;
/*     */           
/*     */           label624:
/* 238 */           MainMemory.setI32(MainMemory.getI32(i5) + 944, 0);
/*     */           
/*     */ 
/*     */           label642:
/*     */           
/*     */ 
/* 244 */           l2 = MainMemory.getI64(m);
/* 245 */           MainMemory.setI64(MainMemory.getI32(i5) + 928, l2);
/* 246 */           MainMemory.setI64(MainMemory.getI32(i5) + 920, l2);
/* 247 */           l2 *= l1;
/* 248 */           MainMemory.setI64(MainMemory.getI32(i5) + 948, l2);
/* 249 */           l3 = MainMemory.getI64(j);
/* 250 */           MainMemory.setI64(MainMemory.getI32(i5) + 956, l3);
/* 251 */           MainMemory.setI32(MainMemory.getI32(i5) + 1012, 0);
/* 252 */           i7 = i1 + 1;
/* 253 */           i8 = i1 + 2;
/* 254 */           i9 = i1 + 3;
/* 255 */           i10 = 0;
/* 256 */           i11 = 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 264 */         ffgkyn.call(paramInt1, i10 + 8, i1, i2, i3, paramInt2);
/* 265 */         i12 = MainMemory.getI32(paramInt2);
/* 266 */         switch (i12)
/*     */         {
/*     */         case 205: 
/*     */           break label886;
/*     */           break;
/*     */         case 207: 
/*     */           break label871;
/*     */           break;
/*     */         case 107: 
/*     */           break;
/*     */         }
/*     */         
/* 278 */         ffxmsg.call(5, 124128);
/* 279 */         MainMemory.setI32(paramInt2, 210);
/* 280 */         break;
/*     */         
/*     */ 
/*     */         label871:
/*     */         
/*     */ 
/* 286 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */         break label929;
/*     */         
/*     */         label886:
/* 291 */         MainMemory.setI16(i2 + SystemLibrary.strlen(i2), (short)39);
/* 292 */         MainMemory.setI32(paramInt2, 0);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 297 */         if (i12 <= 0)
/*     */         {
/*     */           label929:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 307 */           i13 = MainMemory.getI8(i1);
/* 308 */           switch (i13)
/*     */           {
/*     */           case 84: 
/*     */             break label1660;
/*     */             
/*     */             break;
/*     */           case 90: 
/*     */             break;
/*     */           case 69: 
/*     */             break label1090;
/*     */             break;
/*     */           }
/*     */           
/* 321 */           if (SystemLibrary.strcmp(i1, 31776) != 0) {
/*     */             break label1070;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */           if (MainMemory.getI8(i2) != 84) {
/*     */             break label1674;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */           MainMemory.setI32(MainMemory.getI32(i5) + 1012, 1);
/*     */           
/*     */           break label1674;
/*     */           
/*     */           label1070:
/* 346 */           if (i13 != 69) {
/*     */             break label1674;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1090:
/*     */           
/*     */ 
/*     */ 
/* 356 */           i12 = (i13 & 0xFF) + -69;
/* 357 */           if (i12 != 0) {
/*     */             break label1199;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 368 */           i12 = (MainMemory.getI8(i7) & 0xFF) + -78;
/* 369 */           if (i12 != 0) {
/*     */             break label1199;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */           i12 = (MainMemory.getI8(i8) & 0xFF) + -68;
/* 381 */           if (i12 != 0) {
/*     */             break label1199;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */           i12 = MainMemory.getI8(i9) & 0xFF;
/*     */           
/*     */ 
/*     */ 
/*     */           label1199:
/*     */           
/*     */ 
/*     */ 
/* 400 */           if (i12 != 0) {
/*     */             break label1674;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 410 */           i14 = MainMemory.getI32(i5);
/* 411 */           i15 = MainMemory.getI32(i14 + 944);
/* 412 */           i10 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 419 */             if (i10 >= i6) {
/*     */               break label1361;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */             i12 = i10 + 1;
/* 430 */             if (MainMemory.getI32(i15 + i10 * 152 + 80) == 55537) {
/*     */               break;
/*     */             }
/*     */             
/* 434 */             i10 = i12;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */           ffkeyn.call(27360, i12, i1, paramInt2);
/* 442 */           SystemLibrary.sprintf(i4, 93536, new Object[] { Integer.valueOf(i1) });
/* 443 */           ffxmsg.call(5, i4);
/* 444 */           MainMemory.setI32(paramInt2, 232);
/* 445 */           break;
/*     */           
/*     */ 
/*     */           label1361:
/*     */           
/*     */ 
/* 451 */           MainMemory.setI64(i14 + 88, MainMemory.getI64(i14 + 104) - (i11 * 80 + 80));
/* 452 */           i14 = MainMemory.getI32(i5);
/* 453 */           l4 = MainMemory.getI64(i14 + 104) + -80L;
/* 454 */           MainMemory.setI64(i14 + 112, 2880L - l4 % 2880L + l4);
/* 455 */           i14 = MainMemory.getI32(i5);
/* 456 */           l2 = l3 + 2879L + l2;
/* 457 */           MainMemory.setI64(MainMemory.getI32(i14 + 84) + (MainMemory.getI32(i14 + 64) + 1 << 3), MainMemory.getI64(i14 + 112) - l2 % 2880L + l2);
/* 458 */           ffgtbc.call(paramInt1, n, paramInt2);
/* 459 */           l2 = MainMemory.getI64(n);
/* 460 */           if (l2 != l1)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 470 */             SystemLibrary.sprintf(i4, 128608, new Object[] { Integer.valueOf((int)l1), Integer.valueOf((int)l2) });
/* 471 */             ffxmsg.call(5, i4);
/* 472 */             MainMemory.setI32(paramInt2, 241);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 478 */           i14 = MainMemory.getI32(i5);
/* 479 */           MainMemory.setI64(i14 + 104, MainMemory.getI64(MainMemory.getI32(i14 + 84) + (MainMemory.getI32(i14 + 64) << 3)));
/* 480 */           if (MainMemory.getI32(MainMemory.getI32(i5) + 1012) != 1) {
/*     */             break label1650;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 490 */           imcomp_get_compressed_image_par.call(paramInt1, paramInt2);
/* 491 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */         label1650:
/*     */         
/* 497 */         break;
/*     */         
/*     */ 
/*     */         label1660:
/*     */         
/*     */ 
/* 503 */         ffgtbp.call(paramInt1, i1, i2, paramInt2);
/*     */         
/*     */ 
/*     */         label1674:
/*     */         
/*     */ 
/* 509 */         i13 = MainMemory.getI8(i1);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */         if (i13 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 521 */           i11 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 528 */         else if (MainMemory.getI8(i2) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 532 */           i11 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 539 */           i11 = MainMemory.getI8(i3) == 0 ? i11 + 1 : 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 547 */         i10 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label1770:
/*     */       
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 558 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffbinit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */