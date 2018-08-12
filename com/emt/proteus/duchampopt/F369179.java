/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F369179 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3475;
/*  13 */   public static final Function _instance = new F369179();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F369179() { super("F369179", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
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
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*  48 */     int i5 = 0;
/*  49 */     int i6 = 0;
/*  50 */     int i7 = 0;
/*  51 */     int i8 = 0;
/*  52 */     int i9 = 0;
/*  53 */     int i10 = 0;
/*  54 */     int i11 = 0;
/*  55 */     int i12 = 0;
/*  56 */     int i13 = 0;
/*  57 */     int i14 = 0;
/*  58 */     int i15 = 0;
/*  59 */     int i16 = 0;
/*  60 */     int i17 = 0;
/*     */     
/*     */ 
/*  63 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       j = MainMemory.alloc(2);
/*  68 */       k = MainMemory.alloc(2);
/*  69 */       m = MainMemory.alloc(2);
/*  70 */       n = MainMemory.alloc(2);
/*  71 */       i1 = MainMemory.alloc(2);
/*  72 */       i2 = MainMemory.alloc(2);
/*  73 */       i3 = MainMemory.alloc(2);
/*  74 */       i4 = MainMemory.alloc(81);
/*  75 */       i5 = MainMemory.alloc(100);
/*  76 */       MainMemory.setI8(k, (byte)39);
/*  77 */       MainMemory.setI8(k + 1, (byte)0);
/*  78 */       MainMemory.setI8(m, (byte)34);
/*  79 */       MainMemory.setI8(m + 1, (byte)0);
/*  80 */       MainMemory.setI8(n, (byte)91);
/*  81 */       MainMemory.setI8(n + 1, (byte)0);
/*  82 */       MainMemory.setI8(i3, (byte)44);
/*  83 */       MainMemory.setI8(i3 + 1, (byte)0);
/*  84 */       MainMemory.setI8(i1, (byte)93);
/*  85 */       MainMemory.setI8(i1 + 1, (byte)0);
/*  86 */       MainMemory.setI8(i2, (byte)47);
/*  87 */       MainMemory.setI8(i2 + 1, (byte)0);
/*  88 */       SystemLibrary.strncpy(i4, paramInt2, 80);
/*  89 */       i6 = SystemLibrary.strlen(i4);
/*  90 */       paramInt2 = F368386.call(i4, n, i6);
/*  91 */       if (paramInt2 != 0) {
/*     */         break label272;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       paramInt2 = F368386.call(i4, i3, i6);
/*     */       
/*     */ 
/*     */ 
/*     */       label272:
/*     */       
/*     */ 
/*     */ 
/* 110 */       if (paramInt2 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */         MainMemory.setI8(paramInt2, (byte)0);
/* 122 */         paramInt2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       paramInt1 = F368458.call(paramInt1, i4);
/* 131 */       if (paramInt1 == 0) {
/* 132 */         paramInt1 = 0;
/*     */         break label1881;
/*     */       } else {
/* 135 */         i6 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 144 */         MainMemory.setI8(i5 + i6, (byte)0);
/* 145 */         i6 += 1;
/* 146 */         if (i6 == 100) {
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
/* 157 */       SystemLibrary.strncpy(i5, paramInt1, 80);
/* 158 */       i6 = SystemLibrary.strlen(i5);
/* 159 */       paramInt1 = F368386.call(i5, k, i6);
/* 160 */       i16 = F368386.call(i5, i2, i6);
/* 161 */       if (paramInt1 != 0) {
/*     */         break label553;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       paramInt1 = F368386.call(i5, m, i6);
/* 172 */       if (paramInt1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         if ((i16 == 0) || (!MathUtils.ult(paramInt1, i16))) {
/*     */           break label502;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         i16 = paramInt1 + 1;
/* 193 */         i16 = F368386.call(i16, m, SystemLibrary.strlen(i16));
/* 194 */         i17 = i16;
/*     */         
/*     */         break label659;
/*     */         
/*     */         label502:
/*     */         
/* 200 */         if (i16 != 0) {
/*     */           break label693;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */         i16 = paramInt1 + 1;
/* 211 */         i16 = F368386.call(i16, m, SystemLibrary.strlen(i16));
/* 212 */         i17 = i16;
/*     */         
/*     */         break label659;
/*     */         
/*     */         label553:
/*     */         
/* 218 */         if ((i16 == 0) || (!MathUtils.ult(paramInt1, i16))) {
/*     */           break label613;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         i16 = paramInt1 + 1;
/* 229 */         i16 = F368386.call(i16, k, SystemLibrary.strlen(i16));
/* 230 */         i17 = i16;
/*     */         
/*     */         break label659;
/*     */         
/*     */         label613:
/*     */         
/* 236 */         if (i16 != 0) {
/*     */           break label693;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */         i16 = paramInt1 + 1;
/* 247 */         i16 = F368386.call(i16, k, SystemLibrary.strlen(i16));
/* 248 */         i17 = i16;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label659:
/*     */         
/*     */ 
/*     */ 
/* 257 */         if (paramInt1 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */           paramInt1 += 1;
/* 268 */           i16 = paramInt1;
/* 269 */           paramInt1 = i17;
/*     */           break label1379;
/*     */         }
/*     */       }
/*     */       label693:
/* 274 */       i6 = SystemLibrary.strlen(i5);
/* 275 */       i13 = SystemLibrary.strlen(13952);
/* 276 */       if (i13 == 0) {
/* 277 */         paramInt1 = i5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 287 */       else if (i6 == 0) {
/* 288 */         paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 298 */         i14 = i13 + -1;
/* 299 */         i15 = MainMemory.getI8(13952 + i14);
/* 300 */         i7 = i6 + 1 - i13;
/* 301 */         i8 = i13 == 1 ? 1 : 0;
/* 302 */         i9 = i13 == 2 ? 1 : 0;
/* 303 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 310 */           i12 = i11 + 1;
/* 311 */           paramInt1 = i5 + i11;
/* 312 */           i16 = i5 + (i14 + i11);
/* 313 */           if (i11 >= i7)
/*     */           {
/*     */ 
/*     */ 
/* 317 */             paramInt1 = 0;
/* 318 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 324 */           if (MainMemory.getI8(paramInt1) != 61)
/*     */           {
/*     */ 
/*     */ 
/* 328 */             i11 = i12;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 335 */             if (i8 != 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 346 */             if (MainMemory.getI8(i16) != i15)
/*     */             {
/*     */ 
/*     */ 
/* 350 */               i11 = i12;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 357 */               if (i9 != 0) {
/*     */                 break;
/*     */               }
/*     */               else {
/* 361 */                 i11 = 0;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 370 */                 i10 = i11 + 1;
/* 371 */                 if (i10 >= i13) {
/*     */                   break label1011;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */                 if (MainMemory.getI8(i5 + (i12 + i11)) != MainMemory.getI8(13952 + i10)) break;
/* 383 */                 i11 = i10; }
/* 384 */               break;
/*     */               
/* 386 */               i11 = i12;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label1011:
/*     */       
/* 394 */       paramInt1 += 1;
/* 395 */       i13 = SystemLibrary.strlen(12992);
/* 396 */       if (i13 == 0) {
/* 397 */         i17 = i5;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 407 */         if (i6 == 0) {
/*     */           break label1361;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */         i14 = i13 + -1;
/* 418 */         i15 = MainMemory.getI8(12992 + i14);
/* 419 */         i6 = i6 + 1 - i13;
/* 420 */         i8 = i13 == 1 ? 1 : 0;
/* 421 */         i9 = i13 == 2 ? 1 : 0;
/* 422 */         i12 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 429 */           i7 = i12 + 1;
/* 430 */           i16 = i5 + i12;
/* 431 */           i17 = i5 + (i14 + i12);
/* 432 */           if (i12 >= i6) {
/*     */             break label1361;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 442 */           if (MainMemory.getI8(i16) != 47)
/*     */           {
/*     */ 
/*     */ 
/* 446 */             i12 = i7;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 453 */             if (i8 != 0) {
/* 454 */               i17 = i16;
/* 455 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */             if (MainMemory.getI8(i17) != i15)
/*     */             {
/*     */ 
/*     */ 
/* 468 */               i12 = i7;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 475 */               if (i9 != 0) {
/* 476 */                 i17 = i16;
/* 477 */                 break;
/*     */               } else {
/* 479 */                 i12 = 0;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 488 */                 i11 = i12 + 1;
/* 489 */                 if (i11 >= i13)
/*     */                 {
/*     */ 
/*     */ 
/* 493 */                   i17 = i16;
/*     */                   
/*     */ 
/*     */                   break label1337;
/*     */                 }
/*     */                 
/*     */ 
/* 500 */                 if (MainMemory.getI8(i5 + (i7 + i12)) != MainMemory.getI8(12992 + i11)) break;
/* 501 */                 i12 = i11; }
/* 502 */               break;
/*     */               
/* 504 */               i12 = i7;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label1337:
/*     */       
/* 512 */       if (i17 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 516 */         i16 = paramInt1;
/* 517 */         paramInt1 = i17;
/*     */       }
/*     */       else
/*     */       {
/*     */         label1361:
/*     */         
/*     */ 
/* 524 */         i17 = i5 + 79;
/* 525 */         i16 = paramInt1;
/* 526 */         paramInt1 = i17;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1379:
/*     */       
/*     */ 
/* 534 */       if ((MainMemory.getI8(i16) == 32) && (MathUtils.ult(i16, paramInt1))) {
/* 535 */         i6 = 0;
/*     */       } else {
/*     */         break label1463;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 547 */         i6 += 1;
/* 548 */         i17 = i16 + i6;
/* 549 */         if ((MainMemory.getI8(i17) != 32) || (!MathUtils.ult(i17, paramInt1)))
/*     */           break;
/*     */       }
/*     */       break label1463;
/* 553 */       i16 = i17;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1463:
/*     */       
/*     */ 
/*     */ 
/* 562 */       MainMemory.setI8(paramInt1, (byte)0);
/* 563 */       i17 = paramInt1 + -1;
/* 564 */       if ((MainMemory.getI8(i17) == 32) && (MathUtils.ugt(i17, i16))) {
/* 565 */         i6 = 0;
/*     */       } else {
/*     */         break label1564;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 576 */         i17 = paramInt1 + (-2 - i6);
/* 577 */         MainMemory.setI8(paramInt1 + (i6 ^ 0xFFFFFFFF), (byte)0);
/* 578 */         i6 += 1;
/* 579 */       } while ((MainMemory.getI8(i17) == 32) && (MathUtils.ugt(i17, i16)));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1564:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 590 */       i6 = (MainMemory.getI8(i16) & 0xFF) + -45;
/* 591 */       if (i6 != 0) {
/*     */         break label1648;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 602 */       i6 = (MainMemory.getI8(i16 + 1) & 0xFF) + -48;
/* 603 */       if (i6 != 0) {
/*     */         break label1648;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 614 */       i6 = MainMemory.getI8(i16 + 2) & 0xFF;
/*     */       
/*     */ 
/*     */ 
/*     */       label1648:
/*     */       
/*     */ 
/*     */ 
/* 622 */       if (i6 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 626 */         paramInt1 = i16;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 633 */         paramInt1 = i16 + 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 641 */       SystemLibrary.strcpy(470528, paramInt1);
/* 642 */       if (paramInt2 == 0) {
/* 643 */         paramInt1 = 470528;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 653 */         i16 = F368386.call(paramInt2, i1, SystemLibrary.strlen(paramInt2));
/* 654 */         if (i16 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 664 */           MainMemory.setI8(i16, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 670 */         i6 = SystemLibrary.atoi(paramInt2);
/* 671 */         if (i6 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 675 */           paramInt1 = 470528;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 682 */           MainMemory.setI8(j, (byte)32);
/* 683 */           MainMemory.setI8(j + 1, (byte)0);
/* 684 */           if (i6 < 1) {
/* 685 */             paramInt1 = 0;
/*     */             break label1881;
/*     */           } else {
/* 688 */             i13 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 699 */             paramInt1 = SystemLibrary.strtok(paramInt1, j);
/* 700 */             i14 = i13 + 1;
/* 701 */             if (i13 + 2 > i6) {
/*     */               break;
/*     */             }
/*     */             
/* 705 */             i13 = i14;
/* 706 */             paramInt1 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 713 */           if (paramInt1 == 0) {
/* 714 */             paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 724 */             SystemLibrary.strcpy(470528, paramInt1);
/* 725 */             i = 470528;
/*     */             
/*     */             break label1888;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label1881:
/* 733 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label1888:
/*     */       
/*     */ 
/* 739 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 744 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F369179.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */