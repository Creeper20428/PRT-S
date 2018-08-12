/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class F302818
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3187;
/*  17 */   public static final Function _instance = new F302818();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public F302818() { super("F302818", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  24 */     call(paramInt);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     int i9 = 0;
/*  54 */     int i10 = 0;
/*  55 */     int i11 = 0;
/*  56 */     int i12 = 0;
/*  57 */     int i13 = 0;
/*  58 */     int i14 = 0;
/*  59 */     int i15 = 0;
/*  60 */     int i16 = 0;
/*  61 */     int i17 = 0;
/*  62 */     int i18 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       i = MainMemory.getI32Aligned(470792);
/*  69 */       j = MainMemory.getI32(paramInt + 12);
/*  70 */       k = MainMemory.getI32(paramInt + 16);
/*  71 */       m = i + j * 344;
/*  72 */       n = MainMemory.getI32(m) == 64536 ? 1 : 0;
/*  73 */       i1 = i + k * 344;
/*  74 */       i2 = MainMemory.getI32(i1) == 64536 ? 1 : 0;
/*  75 */       if (n == 0)
/*     */       {
/*     */ 
/*     */ 
/*  79 */         i3 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  86 */         i3 = i + j * 344 + 56 + 32;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*  98 */         i4 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 105 */         i4 = i + k * 344 + 56 + 32;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       if ((n == 0) || (i2 == 0)) {
/*     */         break label727;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       i5 = MainMemory.getI32(paramInt);
/* 124 */       switch (i5) {
/*     */       case 38: 
/*     */         break label694;
/*     */         break;
/*     */       case 43: 
/*     */         break label662;
/*     */         break;
/*     */       case 124: 
/*     */         break label641;
/*     */         break;
/*     */       case 277: 
/*     */         break label617;
/*     */         break;
/*     */       case 278:  break label584;
/*     */         break; case 279:  break label558;
/*     */         break; case 280:  break label558;
/*     */         break; case 281:  break label558;
/*     */         break; case 282:  break label558;
/*     */         break; case 288:  break; }
/* 143 */       i16 = paramInt + 88;
/* 144 */       MainMemory.setI32(i16, 0);
/* 145 */       i18 = MainMemory.getI8(i3);
/* 146 */       if (i18 == 0) {
/*     */         break label710;
/*     */       }
/*     */       else {
/* 150 */         i10 = 0;
/* 151 */         i5 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 162 */         i4 = i3 + i5;
/* 163 */         if (i18 != 49) {
/*     */           break label520;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         i10 += 1;
/* 175 */         MainMemory.setI32(i16, i10);
/*     */         
/*     */ 
/*     */ 
/*     */         label520:
/*     */         
/*     */ 
/*     */ 
/* 183 */         i18 = MainMemory.getI8(i4);
/* 184 */         if (i18 == 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */         i5 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label558:
/*     */       
/*     */ 
/* 202 */       MainMemory.setI8(paramInt + 88, F290892.call(i3, i5, i4));
/*     */       
/*     */       break label710;
/*     */       
/*     */       label584:
/* 207 */       MainMemory.setI8(paramInt + 88, (byte)(F290763.call(i3, i4) == 0 ? 1 : 0));
/*     */       
/*     */       break label710;
/*     */       
/*     */       label617:
/* 212 */       MainMemory.setI8(paramInt + 88, F290763.call(i3, i4));
/*     */       
/*     */       break label710;
/*     */       
/*     */       label641:
/* 217 */       F291071.call(paramInt + 88, i3, i4);
/*     */       
/*     */       break label710;
/*     */       
/*     */       label662:
/* 222 */       i14 = paramInt + 88;
/* 223 */       SystemLibrary.strcpy(i14, i3);
/* 224 */       SystemLibrary.strcat(i14, i4);
/*     */       
/*     */       break label710;
/*     */       
/*     */       label694:
/* 229 */       F291221.call(paramInt + 88, i3, i4);
/*     */       
/*     */ 
/*     */       label710:
/*     */       
/*     */ 
/* 235 */       MainMemory.setI32(paramInt, 64536);
/*     */       
/*     */       break label1908;
/*     */       
/*     */       label727:
/* 240 */       F301051.call(paramInt);
/* 241 */       if (MainMemory.getI32Aligned(470852) != 0) {
/*     */         break label1908;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */       i5 = MainMemory.getI32Aligned(470812);
/* 252 */       switch (MainMemory.getI32(paramInt)) {
/*     */       case 38: 
/*     */         break label1598;
/*     */         break;
/*     */       case 43: 
/*     */         break label1598;
/*     */         break;
/*     */       case 124: 
/*     */         break label1598;
/*     */         break;
/*     */       case 277: 
/*     */         break label1219;
/*     */         break;
/*     */       case 278:  break label1219;
/*     */         break; case 279:  break label1219;
/*     */         break; case 280:  break label1219;
/*     */         break; case 281:  break label1219;
/*     */         break; case 282:  break label1219;
/*     */         break; case 288:  break; }
/* 271 */       i16 = i + k * 344 + 56 + 32;
/* 272 */       i10 = MainMemory.getI32(i16);
/* 273 */       if (i5 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 277 */         i5 = i10;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 284 */         i8 = i + j * 344 + 56 + 32;
/* 285 */         i17 = paramInt + 88;
/* 286 */         i6 = paramInt + 84;
/*     */         
/* 288 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */         i3 = MainMemory.getI32(MainMemory.getI32(i8) + (i11 << 2));
/* 297 */         i18 = MainMemory.getI8(i3);
/* 298 */         if (i18 == 0) {
/* 299 */           i12 = 0;
/*     */           break label1117;
/*     */         }
/*     */         else {
/* 303 */           i12 = 1;
/* 304 */           i13 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 315 */           i13 = (i18 == 49 ? 1 : 0) + i13;
/* 316 */           i18 = MainMemory.getI8(i3 + i12);
/* 317 */           if (i18 == 0) {
/* 318 */             i12 = i13;
/*     */           } else {
/*     */             break label1186;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1117:
/*     */           
/*     */ 
/*     */ 
/* 329 */           i10 = i12 + i10;
/* 330 */           MainMemory.setI32(MainMemory.getI32(i17) + (i11 << 2), i10);
/* 331 */           MainMemory.setI8(MainMemory.getI32(i6) + i11, (byte)0);
/* 332 */           i11 += 1;
/* 333 */           if (i11 == i5) {
/* 334 */             i5 = i10;
/*     */             
/*     */             break label1202;
/*     */           }
/*     */           else
/*     */           {
/*     */             break;
/*     */           }
/*     */           
/*     */           label1186:
/*     */           
/* 345 */           i12 += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1202:
/*     */       
/*     */ 
/* 354 */       MainMemory.setI32(i16, i5);
/*     */       
/*     */       break label1908;
/*     */       
/*     */       label1219:
/* 359 */       if (i5 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */         i6 = paramInt + 84;
/* 370 */         i7 = paramInt + 88;
/* 371 */         i8 = i + k * 344 + 56 + 32;
/* 372 */         i9 = i + j * 344 + 56 + 32;
/* 373 */         i10 = i5 + -1;
/* 374 */         i11 = 0;
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
/* 385 */           i12 = i10 - i11;
/* 386 */           if (n == 0)
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
/* 397 */             i3 = MainMemory.getI32(MainMemory.getI32(i9) + (i12 << 2));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */           if (i2 == 0)
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
/* 416 */             i4 = MainMemory.getI32(MainMemory.getI32(i8) + (i12 << 2));
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */           i13 = MainMemory.getI32(paramInt);
/* 425 */           switch (i13)
/*     */           {
/*     */           case 277: 
/*     */             break label1528;
/*     */             break;
/*     */           case 278: 
/*     */             break label1487;
/*     */             break;
/*     */           case 279: 
/*     */             break;
/*     */           case 280: 
/*     */             break;
/*     */           case 281: 
/*     */             break;
/*     */           case 282: 
/*     */             break;
/*     */           }
/*     */           
/* 443 */           i14 = MainMemory.getI32(i7);
/* 444 */           MainMemory.setI8(i14 + i12, F290892.call(i3, i13, i4));
/*     */           
/*     */           break label1555;
/*     */           
/*     */           label1487:
/* 449 */           i14 = MainMemory.getI32(i7);
/* 450 */           MainMemory.setI8(i14 + i12, (byte)(F290763.call(i3, i4) == 0 ? 1 : 0));
/*     */           
/*     */           break label1555;
/*     */           
/*     */           label1528:
/* 455 */           i14 = MainMemory.getI32(i7);
/* 456 */           MainMemory.setI8(i14 + i12, F290763.call(i3, i4));
/*     */           
/*     */ 
/*     */           label1555:
/*     */           
/*     */ 
/* 462 */           MainMemory.setI8(MainMemory.getI32(i6) + i12, (byte)0);
/* 463 */           i11 += 1;
/* 464 */           if (i11 == i5) { break label1908;
/* 465 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1598:
/*     */         
/*     */ 
/*     */ 
/* 476 */         if (i5 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 486 */           i8 = paramInt + 88;
/* 487 */           i9 = i + k * 344 + 56 + 32;
/* 488 */           i15 = i + j * 344 + 56 + 32;
/* 489 */           i10 = i5 + -1;
/* 490 */           i11 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 501 */             i12 = i10 - i11;
/* 502 */             if (n == 0)
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
/* 513 */               i3 = MainMemory.getI32(MainMemory.getI32(i15) + (i12 << 2));
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 521 */             if (i2 == 0)
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
/* 532 */               i4 = MainMemory.getI32(MainMemory.getI32(i9) + (i12 << 2));
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 540 */             i13 = MainMemory.getI32(paramInt);
/* 541 */             if (i13 != 124) {
/*     */               break label1796;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 551 */             F291071.call(MainMemory.getI32(MainMemory.getI32(i8) + (i12 << 2)), i3, i4);
/*     */             
/*     */             break label1882;
/*     */             
/*     */             label1796:
/* 556 */             i14 = MainMemory.getI32(MainMemory.getI32(i8) + (i12 << 2));
/* 557 */             if (i13 != 38) {
/*     */               break label1850;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */             F291221.call(i14, i3, i4);
/*     */             
/*     */             break label1882;
/*     */             
/*     */             label1850:
/* 572 */             SystemLibrary.strcpy(i14, i3);
/* 573 */             SystemLibrary.strcat(MainMemory.getI32(MainMemory.getI32(i8) + (i12 << 2)), i4);
/*     */             
/*     */ 
/*     */             label1882:
/*     */             
/*     */ 
/* 579 */             i11 += 1;
/* 580 */             if (i11 == i5) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1908:
/*     */       
/*     */ 
/*     */ 
/* 593 */       if (MainMemory.getI32(m) <= 0) {
/*     */         break label1968;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 603 */       i8 = i + j * 344 + 56 + 32;
/* 604 */       free.call(MainMemory.getI32(MainMemory.getI32(i8)));
/* 605 */       free.call(MainMemory.getI32(i8));
/*     */       
/*     */ 
/*     */       label1968:
/*     */       
/*     */ 
/* 611 */       if (MainMemory.getI32(i1) <= 0) {
/*     */         break label2033;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 621 */       i8 = i + k * 344 + 56 + 32;
/* 622 */       free.call(MainMemory.getI32(MainMemory.getI32(i8)));
/* 623 */       free.call(MainMemory.getI32(i8));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2033:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 635 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F302818.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */