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
/*     */ public final class ffmnhd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3264;
/*  18 */   public static final Function _instance = new ffmnhd();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public ffmnhd() { super("ffmnhd", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  25 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = call(i, j, k, m, n);
/*  46 */     paramFrame.setI32(paramInt1, i1);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  52 */     int i = 0;
/*     */     
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
/*  69 */     int i12 = 0;
/*  70 */     int i13 = 0;
/*  71 */     int i14 = 0;
/*  72 */     int i15 = 0;
/*     */     
/*     */ 
/*  75 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       j = MainMemory.alloc(81);
/*  80 */       k = MainMemory.alloc(71);
/*  81 */       m = MainMemory.alloc(71);
/*  82 */       n = MainMemory.alloc(4);
/*  83 */       i1 = MainMemory.alloc(4);
/*  84 */       i2 = MainMemory.alloc(4);
/*  85 */       i3 = MainMemory.alloc(4);
/*  86 */       i4 = MainMemory.alloc(4);
/*  87 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         i5 = MainMemory.getI32(paramInt1) + 1;
/*  98 */         i6 = paramInt1 + 4;
/*  99 */         if (MainMemory.getI32(MainMemory.getI32(i6) + 20) == 0) {
/* 100 */           i7 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 110 */         else if (MainMemory.getI8(paramInt3 + (SystemLibrary.strlen(paramInt3) + -1)) == 35) {
/* 111 */           i7 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 121 */           i7 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         i8 = paramInt2 == -1 ? 1 : 0;
/* 129 */         i9 = paramInt4 == 0 ? 1 : 0;
/* 130 */         i10 = 1;
/* 131 */         i11 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 139 */           MainMemory.setI32(i1, 0);
/* 140 */           if (ffmahd.call(paramInt1, i10, n, i1) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */           if (MainMemory.getI32(paramInt5) > 0) {
/* 151 */             i14 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 161 */             i14 = MainMemory.getI32(paramInt1);
/* 162 */             i12 = MainMemory.getI32(i6);
/* 163 */             if (i14 != MainMemory.getI32(i12 + 64)) {
/*     */               break label404;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */             if (MainMemory.getI64(i12 + 112) != -1L) {
/*     */               break label421;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */             if (ffrdef.call(paramInt1, paramInt5) <= 0) {
/*     */               break label421;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */             i14 = MainMemory.getI32(paramInt5);
/*     */             
/*     */             break label448;
/*     */             
/*     */             label404:
/*     */             
/* 199 */             ffmahd.call(paramInt1, i14 + 1, 0, paramInt5);
/*     */             
/*     */ 
/*     */             label421:
/*     */             
/*     */ 
/* 205 */             i14 = MainMemory.getI32(MainMemory.getI32(i6) + 1012) != 0 ? 1 : 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label448:
/*     */           
/*     */ 
/* 213 */           if (i8 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 223 */             i13 = MainMemory.getI32(n);
/* 224 */             if (i13 != paramInt2) { if (i13 != (i14 == 0 ? -1 : 2)) {
/*     */                 break label1313;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */           i14 = MainMemory.getI32(paramInt1);
/* 236 */           i12 = MainMemory.getI32(i6);
/* 237 */           i13 = MainMemory.getI32(i12 + 64);
/* 238 */           if (i14 == i13) {
/* 239 */             i14 = i13;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 250 */             ffmahd.call(paramInt1, i14 + 1, 0, paramInt5);
/* 251 */             i12 = MainMemory.getI32(i6);
/* 252 */             i14 = MainMemory.getI32(i12 + 64);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */           MainMemory.setI64(i12 + 104, MainMemory.getI64(MainMemory.getI32(i12 + 84) + (i14 << 3)) + 80L);
/* 263 */           i14 = MainMemory.getI32(i1);
/* 264 */           if (i14 <= 0)
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
/* 275 */             MainMemory.setI8(k, (byte)0);
/* 276 */             if (ffgcrd.call(paramInt1, 40928, j, i1) <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */               ffpsvc.call(j, k, 0, i1);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 292 */             MainMemory.setI8(m, (byte)0);
/* 293 */             ffc2s.call(k, m, i1);
/* 294 */             i14 = MainMemory.getI32(i1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */           if (i14 >= 1) {
/*     */             break label814;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */           if (i7 == 0)
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
/* 325 */             i15 = m + (SystemLibrary.strlen(m) + -1);
/* 326 */             if (MainMemory.getI8(i15) != 35)
/*     */             {
/*     */ 
/*     */ 
/* 330 */               i11 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 337 */               MainMemory.setI8(i15, (byte)0);
/* 338 */               i11 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 345 */           ffcmps.call(m, paramInt3, 0, i2, i3);
/* 346 */           i14 = MainMemory.getI32(i1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label814:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 356 */           if (i14 != 0) {
/*     */             break label853;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */           if (MainMemory.getI32(i3) != 0) {
/*     */             break label1036;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label853:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 378 */           MainMemory.setI32(i1, 0);
/* 379 */           MainMemory.setI8(k, (byte)0);
/* 380 */           if (ffgcrd.call(paramInt1, 39488, j, i1) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */             ffpsvc.call(j, k, 0, i1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 396 */           MainMemory.setI8(m, (byte)0);
/* 397 */           ffc2s.call(k, m, i1);
/* 398 */           i14 = MainMemory.getI32(i1);
/* 399 */           if (i14 >= 1) {
/*     */             break label1036;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */           if (i7 == 0)
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
/* 422 */             i15 = m + (SystemLibrary.strlen(m) + -1);
/* 423 */             if (MainMemory.getI8(i15) != 35)
/*     */             {
/*     */ 
/*     */ 
/* 427 */               i11 = 0;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 434 */               MainMemory.setI8(i15, (byte)0);
/* 435 */               i11 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 442 */           ffcmps.call(m, paramInt3, 0, i2, i3);
/* 443 */           i14 = MainMemory.getI32(i1);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1036:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 453 */           if (i14 != 0) {
/*     */             break label1313;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */           if (MainMemory.getI32(i3) != 0)
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
/* 475 */             if (i9 == 0) {
/*     */               break label1127;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */             if (i11 == 0) {
/*     */               break label1352;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 495 */             MainMemory.setI32(MainMemory.getI32(i6) + 20, 0);
/*     */             
/*     */             break label1352;
/*     */             
/*     */             label1127:
/* 500 */             if (i14 <= 0)
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
/* 511 */               MainMemory.setI8(k, (byte)0);
/* 512 */               if (ffgcrd.call(paramInt1, 34656, j, i1) <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 522 */                 ffpsvc.call(j, k, 0, i1);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 528 */               ffc2i.call(k, i4, i1);
/* 529 */               i14 = MainMemory.getI32(i1);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 537 */             if (i14 <= 0) {
/*     */               break label1245;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 547 */             MainMemory.setI32(i4, 1);
/* 548 */             i14 = 1;
/*     */             
/*     */             break label1257;
/*     */             
/*     */             label1245:
/* 553 */             i14 = MainMemory.getI32(i4);
/*     */             
/*     */ 
/*     */ 
/*     */             label1257:
/*     */             
/*     */ 
/*     */ 
/* 561 */             if (i14 != paramInt4) {
/*     */               break label1313;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */             if (i11 == 0) {
/*     */               break label1352;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 582 */             MainMemory.setI32(MainMemory.getI32(i6) + 20, 0);
/*     */             
/*     */             break label1352;
/*     */           }
/*     */           
/*     */           label1313:
/* 588 */           i10 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 595 */         ffmahd.call(paramInt1, i5, 0, paramInt5);
/* 596 */         MainMemory.setI32(paramInt5, 301);
/*     */       }
/*     */       
/*     */ 
/*     */       label1352:
/*     */       
/* 602 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 608 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 613 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffmnhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */