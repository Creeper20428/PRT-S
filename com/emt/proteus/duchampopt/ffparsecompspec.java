/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffparsecompspec extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3000;
/*  12 */   public static final Function _instance = new ffparsecompspec();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffparsecompspec() { super("ffparsecompspec", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     double d = 0.0D;
/*  52 */     float f1 = 0.0F;
/*  53 */     float f2 = 0.0F;
/*  54 */     int i6 = 0;
/*     */     
/*     */ 
/*  57 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.alloc(4);
/*  62 */       j = MainMemory.alloc(24);
/*  63 */       MainMemory.setI32(j, 0);
/*  64 */       MainMemory.setI32(j + 4, 1);
/*  65 */       MainMemory.setI32(j + 8, 1);
/*  66 */       MainMemory.setI32(j + 12, 1);
/*  67 */       MainMemory.setI32(j + 16, 1);
/*  68 */       MainMemory.setI32(j + 20, 1);
/*  69 */       MainMemory.setI32(i, paramInt2);
/*  70 */       if (MainMemory.getI8(paramInt2) == 32) {
/*  71 */         k = 0;
/*     */       } else {
/*     */         break label184;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/*  83 */         k += 1;
/*  84 */         i2 = paramInt2 + k;
/*  85 */       } while (MainMemory.getI8(i2) == 32);
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
/*  96 */       MainMemory.setI32(i, i2);
/*  97 */       paramInt2 = i2;
/*     */       
/*     */ 
/*     */ 
/*     */       label184:
/*     */       
/*     */ 
/* 104 */       if (SystemLibrary.strncmp(paramInt2, 44640, 8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */         if (SystemLibrary.strncmp(paramInt2, 44768, 8) != 0) {
/*     */           break label2070;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       i2 = paramInt2 + 8;
/* 125 */       MainMemory.setI32(i, i2);
/* 126 */       i5 = MainMemory.getI8(i2);
/* 127 */       if (i5 == 32) {
/* 128 */         k = 0;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/* 133 */         paramInt2 = i2;
/*     */         
/*     */ 
/*     */         break label327;
/*     */       }
/*     */       
/*     */       do
/*     */       {
/* 141 */         i2 = paramInt2 + (k + 9);
/* 142 */         i5 = MainMemory.getI8(i2);
/* 143 */         k += 1;
/* 144 */       } while (i5 == 32);
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
/* 155 */       MainMemory.setI32(i, i2);
/*     */       
/* 157 */       paramInt2 = i2;
/*     */       
/*     */ 
/*     */ 
/*     */       label327:
/*     */       
/*     */ 
/*     */ 
/* 165 */       switch (i5)
/*     */       {
/*     */       case 82: 
/*     */         break label878;
/*     */         break;
/*     */       case 114: 
/*     */         break label878;
/*     */         break;
/*     */       case 71: 
/*     */         break label766;
/*     */         break;
/*     */       case 103: 
/*     */         break label766;
/*     */         break;
/*     */       case 80: 
/*     */         break label653;
/*     */         break;
/*     */       case 112: 
/*     */         break label653;
/*     */         break;
/*     */       case 72: 
/*     */         break;
/*     */       case 104: 
/*     */         break;
/*     */       default: 
/* 190 */         k = 11;
/* 191 */         m = 0;
/* 192 */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 199 */       paramInt2 += 1;
/* 200 */       MainMemory.setI32(i, paramInt2);
/* 201 */       i5 = MainMemory.getI8(paramInt2);
/* 202 */       switch (i5) {
/*     */       case 83: 
/*     */         break;
/*     */       case 115: 
/*     */         break;
/* 207 */       default:  m = 0;
/* 208 */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 215 */       m = 1;
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
/* 231 */         switch (i5)
/*     */         {
/*     */         case 32: 
/* 234 */           k = 41;
/*     */           
/*     */           break label990;
/*     */           break;
/*     */         case 59: 
/* 239 */           k = 41;
/*     */           
/*     */           break label990;
/*     */           break;
/*     */         case 0: 
/* 244 */           k = 41;
/*     */           
/*     */ 
/*     */           break label990;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/* 255 */         paramInt2 += 1;
/* 256 */         MainMemory.setI32(i, paramInt2);
/* 257 */         i5 = MainMemory.getI8(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label653:
/*     */         
/*     */ 
/* 266 */         switch (i5)
/*     */         {
/*     */         case 32: 
/* 269 */           k = 31;
/* 270 */           m = 0;
/*     */           break label990;
/*     */           break;
/*     */         case 59: 
/* 274 */           k = 31;
/* 275 */           m = 0;
/*     */           break label990;
/*     */           break;
/*     */         case 0: 
/* 279 */           k = 31;
/* 280 */           m = 0;
/*     */           
/*     */ 
/*     */           break label990;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 290 */         paramInt2 += 1;
/* 291 */         MainMemory.setI32(i, paramInt2);
/* 292 */         i5 = MainMemory.getI8(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label766:
/*     */         
/*     */ 
/* 301 */         switch (i5)
/*     */         {
/*     */         case 32: 
/* 304 */           k = 21;
/* 305 */           m = 0;
/*     */           break label990;
/*     */           break;
/*     */         case 59: 
/* 309 */           k = 21;
/* 310 */           m = 0;
/*     */           break label990;
/*     */           break;
/*     */         case 0: 
/* 314 */           k = 21;
/* 315 */           m = 0;
/*     */           
/*     */ 
/*     */           break label990;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 325 */         paramInt2 += 1;
/* 326 */         MainMemory.setI32(i, paramInt2);
/* 327 */         i5 = MainMemory.getI8(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/*     */         label878:
/*     */         
/*     */ 
/* 336 */         switch (i5)
/*     */         {
/*     */         case 32: 
/* 339 */           k = 11;
/* 340 */           m = 0;
/*     */           break label990;
/*     */           break;
/*     */         case 59: 
/* 344 */           k = 11;
/* 345 */           m = 0;
/*     */           break label990;
/*     */           break;
/*     */         case 0: 
/* 349 */           k = 11;
/* 350 */           m = 0;
/*     */           
/*     */ 
/*     */           break label990;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 360 */         paramInt2 += 1;
/* 361 */         MainMemory.setI32(i, paramInt2);
/* 362 */         i5 = MainMemory.getI8(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label990:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 373 */       if (i5 != 32)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */         i2 = paramInt2;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */         for (;;)
/*     */         {
/* 387 */           paramInt2 += 1;
/* 388 */           MainMemory.setI32(i, paramInt2);
/* 389 */           i5 = MainMemory.getI8(paramInt2);
/* 390 */           if (i5 != 32) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         break label1051;
/* 395 */         i2 = paramInt2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1051:
/*     */       
/*     */ 
/*     */ 
/* 405 */       n = com.emt.proteus.runtime.library.ctype.__ctype_b_loc.call();
/* 406 */       i1 = MainMemory.getI32(n);
/* 407 */       if ((MainMemory.getI16(i1 + (i5 << 1)) & 0xFFFF & 0x800) == 0) {
/* 408 */         paramInt2 = i2;
/*     */         break label1391;
/*     */       }
/*     */       else
/*     */       {
/* 413 */         paramInt2 = i2;
/*     */         
/* 415 */         i4 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */       label1233:
/*     */       
/*     */       label1280:
/*     */       
/*     */       label1347:
/*     */       
/*     */       do
/*     */       {
/* 427 */         i3 = j + (i4 << 2);
/* 428 */         i4 += 1;
/* 429 */         MainMemory.setI32(i3, SystemLibrary.atol(i2));
/* 430 */         i5 = MainMemory.getI8(i2);
/* 431 */         if ((MainMemory.getI16(i1 + (i5 << 1)) & 0xFFFF & 0x800) == 0)
/*     */         {
/*     */           break label1233;
/*     */         }
/*     */         else
/*     */         {
/* 437 */           paramInt2 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 446 */           i2 = paramInt2 + 1;
/* 447 */           MainMemory.setI32(i, i2);
/* 448 */           i5 = MainMemory.getI8(i2);
/* 449 */           if ((MainMemory.getI16(MainMemory.getI32(n) + (i5 << 1)) & 0xFFFF & 0x800) == 0) {
/* 450 */             paramInt2 = i2; break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 456 */           paramInt2 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 466 */         if (i5 != 44) {
/*     */           break label1280;
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
/* 479 */         i2 += 1;
/* 480 */         MainMemory.setI32(i, i2);
/* 481 */         i5 = MainMemory.getI8(i2);
/* 482 */         paramInt2 = i2;
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
/* 493 */         if (i5 == 32) {
/* 494 */           paramInt2 = i2;
/*     */         } else {
/*     */           break label1347;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 508 */           i2 = paramInt2 + 1;
/* 509 */           MainMemory.setI32(i, i2);
/* 510 */           i5 = MainMemory.getI8(i2);
/* 511 */           if (i5 != 32) break;
/* 512 */           paramInt2 = i2;
/*     */         }
/*     */         break label1347;
/* 515 */         paramInt2 = i2;
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
/* 528 */         i1 = MainMemory.getI32(n);
/* 529 */       } while (((MainMemory.getI16(i1 + (i5 << 1)) & 0xFFFF & 0x800) != 0) && (i4 < 9));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1391:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 547 */       if (i5 != 59)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 552 */         f1 = 0.0F;
/* 553 */         f2 = 0.0F;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */         for (;;)
/*     */         {
/* 561 */           paramInt2 += 1;
/* 562 */           MainMemory.setI32(i, paramInt2);
/* 563 */           i5 = MainMemory.getI8(paramInt2);
/* 564 */           if (i5 != 32) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */         break label1458;
/* 570 */         f1 = 0.0F;
/* 571 */         f2 = 0.0F;
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
/*     */         for (;;)
/*     */         {
/*     */           label1458:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 594 */           switch (i5) {
/*     */           case 0: 
/*     */             break label1865;
/*     */             break;
/* 598 */           case 83:  i4 = 0;
/*     */             break label1709;
/*     */             break; case 115:  i4 = 0;
/*     */             break label1709;
/*     */             break; case 81:  i4 = 0;
/*     */             
/* 604 */             break;
/* 605 */           case 113:  i4 = 0;
/*     */             
/* 607 */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 616 */             i4 += 1;
/* 617 */             i2 = paramInt2 + i4;
/* 618 */             MainMemory.setI32(i, i2);
/* 619 */           } while (MainMemory.getI8(i2) == 32);
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
/* 630 */           d = SystemLibrary.strtod(i2, i);
/* 631 */           paramInt2 = MainMemory.getI32(i);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 639 */             i5 = MainMemory.getI8(paramInt2);
/* 640 */             switch (i5)
/*     */             {
/*     */             case 32: 
/*     */               break;
/*     */             case 44: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 652 */             paramInt2 += 1;
/* 653 */             MainMemory.setI32(i, paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 659 */           f1 = (float)d;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 664 */           continue;
/*     */           
/*     */           label1709:
/*     */           do
/*     */           {
/* 669 */             i4 += 1;
/* 670 */             i2 = paramInt2 + i4;
/* 671 */             MainMemory.setI32(i, i2);
/* 672 */           } while (MainMemory.getI8(i2) == 32);
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
/* 683 */           d = SystemLibrary.strtod(i2, i);
/* 684 */           paramInt2 = MainMemory.getI32(i);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 692 */             i5 = MainMemory.getI8(paramInt2);
/* 693 */             switch (i5)
/*     */             {
/*     */             case 32: 
/*     */               break;
/*     */             case 44: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 705 */             paramInt2 += 1;
/* 706 */             MainMemory.setI32(i, paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 712 */           f2 = (float)d;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 720 */         MainMemory.setI32(paramInt3, 125);
/*     */         
/*     */ 
/*     */         break label2081;
/*     */       }
/*     */       
/*     */ 
/*     */       label1865:
/*     */       
/* 729 */       i6 = paramInt1 + 4;
/* 730 */       MainMemory.setI32(MainMemory.getI32(i6) + 964, k);
/* 731 */       i4 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 738 */         MainMemory.setI32(MainMemory.getI32(i6) + 968 + (i4 << 2), MainMemory.getI32(j + (i4 << 2)));
/* 739 */         i4 += 1;
/* 740 */         if (i4 == 6) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 751 */       if (k != 41) {
/*     */         break label1998;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 761 */       MainMemory.setF32(MainMemory.getI32(i6) + 992, f2);
/* 762 */       MainMemory.setI32(MainMemory.getI32(i6) + 996, m);
/*     */       
/*     */ 
/*     */       label1998:
/*     */       
/*     */ 
/* 768 */       if (!com.emt.proteus.lib.api.MathUtils.f_une(f1, 0.0D)) {
/*     */         break label2060;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 778 */       MainMemory.setF32(MainMemory.getI32(i6) + 1172, com.emt.proteus.lib.api.MathUtils.f_oeq(f1, 0.0D) ? 9999.0F : f1);
/*     */       
/*     */ 
/*     */       break label2081;
/*     */       
/*     */ 
/*     */       label2060:
/*     */       
/*     */ 
/*     */       break label2081;
/*     */       
/*     */       label2070:
/*     */       
/* 791 */       MainMemory.setI32(paramInt3, 125);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2081:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 802 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffparsecompspec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */