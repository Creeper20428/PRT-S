/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffcmph
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3273;
/*  32 */   public static final Function _instance = new ffcmph();
/*  33 */   public final Function resolve() { return _instance; }
/*     */   
/*  35 */   public ffcmph() { super("ffcmph", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     call(paramInt1, paramInt2);
/*  40 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  45 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     call(i, j);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     int n = 0;
/*  63 */     int i1 = 0;
/*  64 */     int i2 = 0;
/*  65 */     int i3 = 0;
/*  66 */     int i4 = 0;
/*  67 */     int i5 = 0;
/*  68 */     int i6 = 0;
/*  69 */     int i7 = 0;
/*  70 */     int i8 = 0;
/*  71 */     int i9 = 0;
/*  72 */     long l1 = 0L;
/*  73 */     long l2 = 0L;
/*  74 */     long l3 = 0L;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     int i12 = 0;
/*  78 */     int i13 = 0;
/*  79 */     long l4 = 0L;
/*  80 */     int i14 = 0;
/*  81 */     long l5 = 0L;
/*  82 */     int i15 = 0;
/*  83 */     int i16 = 0;
/*  84 */     int i17 = 0;
/*     */     
/*     */ 
/*  87 */     int i18 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  91 */       i = MainMemory.alloc(81);
/*  92 */       j = MainMemory.alloc(71);
/*  93 */       k = MainMemory.alloc(8);
/*  94 */       m = MainMemory.alloc(8);
/*  95 */       n = MainMemory.alloc(4);
/*  96 */       i1 = MainMemory.alloc(4);
/*  97 */       i2 = MainMemory.alloc(4);
/*  98 */       i14 = MainMemory.alloc(8);
/*  99 */       i3 = MainMemory.alloc(8);
/* 100 */       i4 = MainMemory.alloc(8);
/* 101 */       i5 = MainMemory.alloc(8);
/* 102 */       i6 = MainMemory.alloc(73);
/* 103 */       i7 = MainMemory.alloc(81);
/* 104 */       i8 = MainMemory.alloc(8);
/* 105 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         fftheap.call(paramInt1, i14, i3, i2, paramInt2);
/* 116 */         if (MainMemory.getI32(i2) != 0) {
/*     */           break label243;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         MainMemory.setI32(paramInt2, 264);
/*     */         
/*     */ 
/*     */         break label1561;
/*     */         
/*     */         label243:
/*     */         
/* 133 */         i9 = paramInt1 + 4;
/* 134 */         i13 = MainMemory.getI32(i9);
/* 135 */         if (MainMemory.getI32(i13 + 68) != 2) {
/*     */           break label1556;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         if (MainMemory.getI64(i13 + 956) != 0L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */           if (MainMemory.getI64(i14) != 0L) {
/*     */             break label347;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           if (MainMemory.getI64(i3) != 0L) {
/*     */             label347:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */             if (MainMemory.getI32(paramInt2) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */               if (ffinit.call(n, 61024, paramInt2) != 0) {
/*     */                 break label1530;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */               if (ffcopy.call(paramInt1, MainMemory.getI32(n), paramInt2) != 0) {
/*     */                 break label1494;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */               i16 = malloc.call(10000);
/* 206 */               if (i16 != 0) {
/*     */                 break label482;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */               SystemLibrary.memcpy(i7, 97248, 43, 1);
/* 217 */               ffxmsg.call(5, i7);
/* 218 */               ffclos.call(MainMemory.getI32(n), paramInt2);
/* 219 */               MainMemory.setI32(paramInt2, 113);
/*     */               
/*     */ 
/*     */               break label1561;
/*     */               
/*     */               label482:
/*     */               
/* 226 */               i13 = MainMemory.getI32(MainMemory.getI32(n) + 4);
/* 227 */               l3 = MainMemory.getI64(i13 + 112);
/* 228 */               l5 = MainMemory.getI64(i13 + 948);
/* 229 */               i13 = MainMemory.getI32(i9);
/* 230 */               l1 = MainMemory.getI64(i13 + 948) + MainMemory.getI64(i13 + 112);
/* 231 */               i14 = i13 + 956;
/* 232 */               l2 = MainMemory.getI64(i14);
/* 233 */               MainMemory.setI64(i14, 0L);
/* 234 */               l3 = l5 + l3;
/* 235 */               i17 = 1;
/* 236 */               i15 = 10000;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */               if (MainMemory.getI32(MainMemory.getI32(i9) + 916) >= i17)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */                 if (MainMemory.getI32(paramInt2) >= 1) {
/*     */                   break label1120;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */                 ffgtclll.call(MainMemory.getI32(n), i17, i1, k, m, paramInt2);
/* 267 */                 i10 = MainMemory.getI32(i1);
/* 268 */                 if (i10 > 0) {
/* 269 */                   i10 = i15;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 280 */                   i10 /= -10;
/* 281 */                   l5 = 1L;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 292 */                   if (l5 > MainMemory.getI64(MainMemory.getI32(i9) + 928)) {
/* 293 */                     i10 = i15;
/*     */                   } else {
/*     */                     break label744;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */                   i17 += 1;
/*     */                   
/* 308 */                   i15 = i10;
/*     */                   
/* 310 */                   break;
/*     */                   
/*     */                   label744:
/*     */                   
/* 314 */                   ffgdesll.call(MainMemory.getI32(n), i17, l5, i4, i5, paramInt2);
/* 315 */                   i11 = (int)MainMemory.getI64(i4);
/* 316 */                   if (MainMemory.getI32(i1) != -1) {
/*     */                     break label812;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */                   i11 = (i11 + 7) / 8;
/*     */                   
/*     */                   break label824;
/*     */                   
/*     */                   label812:
/*     */                   
/* 332 */                   i11 *= i10;
/*     */                   
/*     */ 
/*     */ 
/*     */                   label824:
/*     */                   
/*     */ 
/*     */ 
/* 340 */                   if (i11 <= i15) {
/*     */                     break label890;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 352 */                   i12 = realloc.call(i16, i11);
/* 353 */                   if (i12 != 0)
/*     */                   {
/*     */ 
/*     */ 
/* 357 */                     i15 = i11;
/* 358 */                     i16 = i12;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 365 */                     MainMemory.setI32(paramInt2, 113);
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   label890:
/*     */                   
/*     */ 
/*     */ 
/* 375 */                   i13 = MainMemory.getI32(i9);
/* 376 */                   if (MainMemory.getI32(i13 + 40) != 0) {
/*     */                     break label939;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */                   ffcmph_564.call(l1, paramInt2, i13, i11, paramInt1, i7);
/*     */                   
/*     */ 
/*     */                   label939:
/*     */                   
/*     */ 
/* 392 */                   ffmbyt.call(MainMemory.getI32(n), l3 + MainMemory.getI64(i5), 0, paramInt2);
/* 393 */                   l4 = i11;
/* 394 */                   ffgbyt.call(MainMemory.getI32(n), l4, i16, paramInt2);
/* 395 */                   ffmbyt.call(paramInt1, MainMemory.getI64(MainMemory.getI32(i9) + 956) + l1, 1, paramInt2);
/* 396 */                   ffpbyt.call(paramInt1, l4, i16, paramInt2);
/* 397 */                   ffpdes.call(paramInt1, i17, l5, MainMemory.getI64(i4), MainMemory.getI64(MainMemory.getI32(i9) + 956), paramInt2);
/* 398 */                   i14 = MainMemory.getI32(i9) + 956;
/* 399 */                   MainMemory.setI64(i14, MainMemory.getI64(i14) + l4);
/* 400 */                   if (MainMemory.getI32(paramInt2) <= 0) {
/*     */                     break label1104;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 410 */                   free.call(i16);
/* 411 */                   ffclos.call(MainMemory.getI32(n), paramInt2);
/*     */                   
/*     */ 
/*     */                   break label1561;
/*     */                   
/*     */                   label1104:
/*     */                   
/* 418 */                   l5 += 1L;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */               label1120:
/*     */               
/*     */ 
/* 426 */               free.call(i16);
/* 427 */               ffclos.call(MainMemory.getI32(n), paramInt2);
/* 428 */               i13 = MainMemory.getI32(i9);
/* 429 */               i17 = MainMemory.getI32(i13 + 64);
/* 430 */               k = i13 + 956;
/* 431 */               l3 = MainMemory.getI64(k);
/* 432 */               i10 = (int)((MainMemory.getI64(MainMemory.getI32(i13 + 84) + (i17 + 1 << 3)) - l1 - l3) / 2880L);
/* 433 */               if (i10 <= 0) {
/*     */                 break label1267;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 445 */               MainMemory.setI64(k, l2);
/* 446 */               ffdblk.call(paramInt1, i10, paramInt2);
/* 447 */               MainMemory.setI64(MainMemory.getI32(i9) + 956, l3);
/* 448 */               i13 = MainMemory.getI32(i9);
/* 449 */               i17 = MainMemory.getI32(i13 + 64);
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label1267:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 459 */               i10 = MainMemory.getI32(paramInt1);
/* 460 */               if (i10 != i17)
/*     */               {
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
/* 472 */                 ffmahd.call(paramInt1, i10 + 1, 0, paramInt2);
/* 473 */                 i13 = MainMemory.getI32(i9);
/* 474 */                 i17 = MainMemory.getI32(i13 + 64);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 484 */               MainMemory.setI64(i13 + 104, MainMemory.getI64(MainMemory.getI32(i13 + 84) + (i17 << 3)) + 80L);
/* 485 */               if (MainMemory.getI32(paramInt2) <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 495 */                 MainMemory.setI8(j, (byte)0);
/* 496 */                 MainMemory.setI8(i6, (byte)0);
/* 497 */                 if (ffgcrd.call(paramInt1, 34560, i, paramInt2) <= 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */                   ffpsvc.call(i, j, i6, paramInt2);
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 513 */                 ffc2j.call(j, i8, paramInt2);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 519 */               l1 = MainMemory.getI64(MainMemory.getI32(i9) + 956);
/* 520 */               if (l1 != MainMemory.getI64(i8))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 530 */                 ffmkyj.call(paramInt1, 34560, l1, i6, paramInt2);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 536 */               ffrdef.call(paramInt1, paramInt2);
/*     */               
/*     */ 
/*     */               break label1561;
/*     */               
/*     */               label1494:
/*     */               
/* 543 */               SystemLibrary.memcpy(i7, 80544, 34, 1);
/* 544 */               ffxmsg.call(5, i7);
/* 545 */               ffclos.call(MainMemory.getI32(n), paramInt2);
/*     */               
/*     */ 
/*     */               break label1561;
/*     */               
/*     */               label1530:
/*     */               
/* 552 */               SystemLibrary.memcpy(i7, 101152, 45, 1);
/* 553 */               ffxmsg.call(5, i7);
/*     */               
/*     */ 
/*     */               break label1561;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1556:
/*     */       
/*     */ 
/*     */       label1561:
/*     */       
/*     */ 
/* 570 */       MainMemory.dealloc_generated(i18);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcmph.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */