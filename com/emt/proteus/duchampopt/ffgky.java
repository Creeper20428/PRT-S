/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgky
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3419;
/*  19 */   public static final Function _instance = new ffgky();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ffgky() { super("ffgky", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i2 = call(i, j, k, m, n, i1);
/*  50 */     paramFrame.setI32(paramInt1, i2);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  56 */     int i = 0;
/*     */     
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     int i1 = 0;
/*  63 */     int i2 = 0;
/*  64 */     int i3 = 0;
/*     */     
/*     */ 
/*  67 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       j = MainMemory.alloc(81);
/*  72 */       k = MainMemory.alloc(71);
/*  73 */       m = MainMemory.alloc(4);
/*  74 */       n = MainMemory.alloc(8);
/*  75 */       i1 = MainMemory.getI32(paramInt6);
/*  76 */       if (i1 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         switch (paramInt2) {
/*     */         case 16: 
/*     */           break label1501;
/*     */           break;
/*     */         case 11: 
/*     */           break label1408;
/*     */           break;
/*     */         case 12: 
/*     */           break label1315;
/*     */           break;
/*     */         case 20: 
/*     */           break label1222;
/*     */           break;
/*     */         case 21:  break label1129;
/*     */           break; case 30:  break label1037;
/*     */           break; case 31:  break label944;
/*     */           break; case 14:  break label849;
/*     */           break; case 40:  break label756;
/*     */           break; case 41:  break label661;
/*     */           break; case 81:  break label566;
/*     */           break; case 42:  break label471;
/*     */           break; case 82:  break label376;
/*     */           break; case 83:  break label356;
/*     */           break; case 163:  break; }
/* 110 */         ffgkym.call(paramInt1, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label356:
/* 115 */         ffgkyc.call(paramInt1, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label376:
/* 120 */         n = paramInt4;
/* 121 */         MainMemory.setI8(k, (byte)0);
/* 122 */         if (paramInt5 == 0) {
/* 123 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 133 */           MainMemory.setI8(paramInt5, (byte)0);
/* 134 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */           ffgky_1031.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 158 */         ffc2d.call(k, n, paramInt6);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label471:
/* 163 */         i3 = paramInt4;
/* 164 */         MainMemory.setI8(k, (byte)0);
/* 165 */         if (paramInt5 == 0) {
/* 166 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 176 */           MainMemory.setI8(paramInt5, (byte)0);
/* 177 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */           ffgky_1035.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 201 */         ffc2r.call(k, i3, paramInt6);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label566:
/* 206 */         i2 = paramInt4;
/* 207 */         MainMemory.setI8(k, (byte)0);
/* 208 */         if (paramInt5 == 0) {
/* 209 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 219 */           MainMemory.setI8(paramInt5, (byte)0);
/* 220 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */           ffgky_1040.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 244 */         ffc2j.call(k, i2, paramInt6);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label661:
/* 249 */         m = paramInt4;
/* 250 */         MainMemory.setI8(k, (byte)0);
/* 251 */         if (paramInt5 == 0) {
/* 252 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 262 */           MainMemory.setI8(paramInt5, (byte)0);
/* 263 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */           ffgky_1030.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 287 */         ffc2i.call(k, m, paramInt6);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label756:
/* 292 */         MainMemory.setI8(k, (byte)0);
/* 293 */         if (paramInt5 == 0) {
/* 294 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 304 */           MainMemory.setI8(paramInt5, (byte)0);
/* 305 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */           ffgky_1034.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 329 */         ffgky_1021.call(paramInt4, paramInt6, k, n);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label849:
/* 334 */         m = paramInt4;
/* 335 */         MainMemory.setI8(k, (byte)0);
/* 336 */         if (paramInt5 == 0) {
/* 337 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 347 */           MainMemory.setI8(paramInt5, (byte)0);
/* 348 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */           ffgky_1037.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 372 */         ffc2l.call(k, m, paramInt6);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label944:
/* 377 */         MainMemory.setI8(k, (byte)0);
/* 378 */         if (paramInt5 == 0) {
/* 379 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 389 */           MainMemory.setI8(paramInt5, (byte)0);
/* 390 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */           ffgky_1036.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 414 */         ffgky_1027.call(paramInt4, paramInt6, k, m);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label1037:
/* 419 */         MainMemory.setI8(k, (byte)0);
/* 420 */         if (paramInt5 == 0) {
/* 421 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 431 */           MainMemory.setI8(paramInt5, (byte)0);
/* 432 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 450 */           ffgky_1032.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 456 */         ffgky_1026.call(paramInt6, k, m);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label1129:
/* 461 */         MainMemory.setI8(k, (byte)0);
/* 462 */         if (paramInt5 == 0) {
/* 463 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 473 */           MainMemory.setI8(paramInt5, (byte)0);
/* 474 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 492 */           ffgky_1028.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 498 */         ffgky_1024.call(paramInt4, paramInt6, k, m);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label1222:
/* 503 */         MainMemory.setI8(k, (byte)0);
/* 504 */         if (paramInt5 == 0) {
/* 505 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 515 */           MainMemory.setI8(paramInt5, (byte)0);
/* 516 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 524 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 534 */           ffgky_1039.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 540 */         ffgky_1022.call(paramInt4, paramInt6, k, m);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label1315:
/* 545 */         MainMemory.setI8(k, (byte)0);
/* 546 */         if (paramInt5 == 0) {
/* 547 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 557 */           MainMemory.setI8(paramInt5, (byte)0);
/* 558 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 566 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 576 */           ffgky_1029.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 582 */         ffgky_1025.call(paramInt4, paramInt6, k, m);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label1408:
/* 587 */         MainMemory.setI8(k, (byte)0);
/* 588 */         if (paramInt5 == 0) {
/* 589 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 599 */           MainMemory.setI8(paramInt5, (byte)0);
/* 600 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 608 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 618 */           ffgky_1038.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 624 */         ffgky_1023.call(paramInt4, paramInt6, k, m);
/*     */         
/*     */         break label1611;
/*     */         
/*     */         label1501:
/* 629 */         MainMemory.setI8(k, (byte)0);
/* 630 */         if (paramInt5 == 0) {
/* 631 */           paramInt2 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 641 */           MainMemory.setI8(paramInt5, (byte)0);
/* 642 */           paramInt2 = MainMemory.getI32(paramInt6);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 650 */         if (paramInt2 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 660 */           ffgky_1033.call(paramInt6, k, j, paramInt1, paramInt5, paramInt3);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 666 */         MainMemory.setI8(paramInt4, (byte)0);
/* 667 */         ffc2s.call(k, paramInt4, paramInt6);
/*     */         
/*     */ 
/*     */         break label1611;
/*     */         
/* 672 */         MainMemory.setI32(paramInt6, 410);
/*     */       }
/*     */       
/*     */ 
/*     */       label1611:
/*     */       
/* 678 */       i = MainMemory.getI32(paramInt6);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 684 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 689 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */