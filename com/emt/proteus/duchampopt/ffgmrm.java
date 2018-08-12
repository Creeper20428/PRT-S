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
/*     */ public final class ffgmrm
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3437;
/*  28 */   public static final Function _instance = new ffgmrm();
/*  29 */   public final Function resolve() { return _instance; }
/*     */   
/*  31 */   public ffgmrm() { super("ffgmrm", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  35 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  40 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int m = call(i, j, k);
/*  50 */     paramFrame.setI32(paramInt1, m);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
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
/*  65 */     int i4 = 0;
/*  66 */     int i5 = 0;
/*  67 */     int i6 = 0;
/*  68 */     int i7 = 0;
/*  69 */     int i8 = 0;
/*  70 */     int i9 = 0;
/*  71 */     int i10 = 0;
/*  72 */     int i11 = 0;
/*  73 */     int i12 = 0;
/*  74 */     int i13 = 0;
/*  75 */     int i14 = 0;
/*  76 */     int i15 = 0;
/*  77 */     int i16 = 0;
/*  78 */     int i17 = 0;
/*  79 */     int i18 = 0;
/*  80 */     int i19 = 0;
/*  81 */     int i20 = 0;
/*  82 */     int i21 = 0;
/*  83 */     int i22 = 0;
/*  84 */     byte b = 0;
/*  85 */     int i23 = 0;
/*  86 */     int i24 = 0;
/*     */     
/*     */ 
/*  89 */     int i25 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  93 */       j = MainMemory.alloc(81);
/*  94 */       k = MainMemory.alloc(71);
/*  95 */       m = MainMemory.alloc(1025);
/*  96 */       n = MainMemory.alloc(4);
/*  97 */       i1 = MainMemory.alloc(4);
/*  98 */       i2 = MainMemory.alloc(4);
/*  99 */       i3 = MainMemory.alloc(1025);
/* 100 */       i4 = MainMemory.alloc(1025);
/* 101 */       i5 = MainMemory.alloc(1025);
/* 102 */       i6 = MainMemory.alloc(1025);
/* 103 */       i7 = MainMemory.alloc(72);
/* 104 */       i8 = MainMemory.alloc(1025);
/* 105 */       i9 = MainMemory.alloc(4);
/* 106 */       i10 = MainMemory.alloc(81);
/* 107 */       i11 = MainMemory.alloc(1025);
/* 108 */       i12 = MainMemory.alloc(1025);
/* 109 */       i13 = MainMemory.alloc(4);
/* 110 */       MainMemory.setI32(n, 0);
/* 111 */       MainMemory.setI32(i1, 0);
/* 112 */       MainMemory.setI32(i2, 0);
/* 113 */       MainMemory.setI32(i13, 0);
/* 114 */       i16 = MainMemory.getI32(paramInt3);
/* 115 */       if (i16 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 119 */         paramInt2 = i16;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 126 */         i14 = paramInt1 + 4;
/* 127 */         if (MainMemory.getI32(MainMemory.getI32(i14) + 72) != 1) {
/*     */           break label1510;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         i16 = ffgmop.call(paramInt1, paramInt2, i13, paramInt3);
/* 138 */         MainMemory.setI32(paramInt3, i16);
/* 139 */         i15 = MainMemory.getI32(i13);
/* 140 */         if (MainMemory.getI32(MainMemory.getI32(i15 + 4) + 72) != 1) {
/*     */           break label1486;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         if (i16 <= 0)
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
/*     */ 
/* 162 */           MainMemory.setI8(k, (byte)0);
/* 163 */           MainMemory.setI8(i10, (byte)0);
/* 164 */           if (ffgcrd.call(paramInt1, 34656, j, paramInt3) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */             ffpsvc.call(j, k, i10, paramInt3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 180 */           ffc2i.call(k, i1, paramInt3);
/* 181 */           i16 = MainMemory.getI32(paramInt3);
/* 182 */           i15 = MainMemory.getI32(i13);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         MainMemory.setI32(paramInt3, i16);
/* 193 */         ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i15 + 4) + 12), i11, paramInt3);
/* 194 */         ffrtnm.call(MainMemory.getI32(MainMemory.getI32(i14) + 12), i12, paramInt3);
/* 195 */         if (MainMemory.getI32(MainMemory.getI32(i13) + 4) != MainMemory.getI32(i14))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */           ffgmrm_1051.call(i11, i12, i1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 211 */         i16 = fits_get_url.call(paramInt1, i3, i4, 0, 0, 0, paramInt3);
/* 212 */         MainMemory.setI32(paramInt3, i16);
/* 213 */         if (i16 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 217 */           paramInt2 = i16;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 224 */           SystemLibrary.getcwd(m, 1025);
/* 225 */           fits_path2url.call(m, i6, paramInt3);
/* 226 */           switch (MainMemory.getI8(i3))
/*     */           {
/*     */           case 0: 
/*     */             break label704;
/*     */             
/*     */             break;
/*     */           case 47: 
/*     */             break label704;
/*     */             break;
/*     */           }
/*     */           
/* 237 */           if (fits_is_url_absolute.call(i3) != 0) {
/*     */             break label704;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */           SystemLibrary.strcpy(i5, i6);
/* 248 */           MainMemory.setI16(i5 + SystemLibrary.strlen(i5), (short)47);
/* 249 */           SystemLibrary.strcat(i5, i3);
/* 250 */           fits_clean_url.call(i5, i3, paramInt3);
/*     */           
/*     */ 
/*     */           label704:
/*     */           
/*     */ 
/* 256 */           switch (MainMemory.getI8(i4))
/*     */           {
/*     */           case 0: 
/*     */             break label820;
/*     */             
/*     */             break;
/*     */           case 47: 
/*     */             break label820;
/*     */             break;
/*     */           }
/*     */           
/* 267 */           if (fits_is_url_absolute.call(i4) != 0) {
/*     */             break label820;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */           SystemLibrary.strcpy(i5, i6);
/* 278 */           MainMemory.setI16(i5 + SystemLibrary.strlen(i5), (short)47);
/* 279 */           SystemLibrary.strcat(i5, i4);
/* 280 */           fits_clean_url.call(i5, i4, paramInt3);
/*     */           
/*     */ 
/*     */           label820:
/*     */           
/*     */ 
/* 286 */           MainMemory.setI32(paramInt3, ffgmng.call(MainMemory.getI32(i13), n, paramInt3));
/* 287 */           MainMemory.setI32(paramInt3, ffgrec.call(MainMemory.getI32(i13), 0, i10, paramInt3));
/* 288 */           i16 = MainMemory.getI32(n);
/* 289 */           i17 = MainMemory.getI32(i1);
/* 290 */           i23 = 1;
/* 291 */           i24 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */           while (i23 <= i16)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */             if ((MainMemory.getI32(paramInt3) | i24) != 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */             SystemLibrary.sprintf(i7, 39648, new Object[] { Integer.valueOf(i23) });
/* 320 */             i18 = MainMemory.getI32(paramInt3);
/* 321 */             if (i18 <= 0)
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
/* 332 */               i15 = MainMemory.getI32(i13);
/* 333 */               MainMemory.setI8(k, (byte)0);
/* 334 */               MainMemory.setI8(i10, (byte)0);
/* 335 */               if (ffgcrd.call(i15, i7, j, paramInt3) <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */                 ffpsvc.call(j, k, i10, paramInt3);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 351 */               ffc2i.call(k, i2, paramInt3);
/* 352 */               i18 = MainMemory.getI32(paramInt3);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */             MainMemory.setI32(paramInt3, i18);
/* 361 */             if (i18 != 0) {
/*     */               break label1453;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */             i18 = MainMemory.getI32(i2);
/* 373 */             i19 = i18 == i17 ? 1 : 0;
/* 374 */             if (i19 == 0) {
/*     */               break label1453;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */             i20 = i18 > 0 ? 1 : 0;
/* 386 */             i21 = i20 != 0 ? i23 : i24;
/* 387 */             if ((i20 != 0) || (i19 == 0)) {
/* 388 */               i24 = i21;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 398 */               if (i18 >= 0) {
/*     */                 break label1453;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */               SystemLibrary.sprintf(i7, 39680, new Object[] { Integer.valueOf(i23) });
/* 410 */               i18 = ffgkls.call(MainMemory.getI32(i13), i7, i9, i10, paramInt3);
/* 411 */               MainMemory.setI32(paramInt3, i18);
/* 412 */               if (i18 != 0) {
/*     */                 break label1257;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 423 */               i22 = MainMemory.getI32(i9);
/* 424 */               SystemLibrary.strcpy(i8, i22);
/* 425 */               free.call(i22);
/* 426 */               i18 = MainMemory.getI32(paramInt3);
/*     */               
/*     */ 
/*     */ 
/*     */               label1257:
/*     */               
/*     */ 
/*     */ 
/* 434 */               switch (i18)
/*     */               {
/*     */               case 202: 
/*     */                 break label1409;
/*     */                 
/*     */ 
/*     */                 break;
/*     */               case 0: 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 446 */               prepare_keyvalue.call(i8);
/* 447 */               b = MainMemory.getI8(i8);
/* 448 */               if (b != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 458 */                 ffgmrm_1049.call(i13, i8, b, paramInt3, i5);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 464 */               if (SystemLibrary.strcmp(i8, i3) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 474 */                 if (SystemLibrary.strcmp(i8, i4) != 0) {
/*     */                   break label1453;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */               i24 = i23;
/*     */               
/*     */               break label1453;
/*     */               
/*     */               label1409:
/* 490 */               SystemLibrary.sprintf(i10, 74272, new Object[] { Integer.valueOf(i23), Integer.valueOf(i23) });
/* 491 */               ffxmsg.call(5, i10);
/* 492 */               MainMemory.setI32(paramInt3, 0);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1453:
/*     */             
/*     */ 
/* 500 */             i23 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */           ffgmrm_1050.call(i13, i24, paramInt3, i7, n);
/*     */           
/*     */ 
/*     */           label1486:
/*     */           
/*     */ 
/* 513 */           paramInt2 = ffdrow.call(paramInt1, paramInt2, 1L, paramInt3);
/* 514 */           MainMemory.setI32(paramInt3, paramInt2);
/*     */           
/*     */           break label1532;
/*     */           
/*     */           label1510:
/*     */           
/* 520 */           ffxmsg.call(5, 88224);
/* 521 */           MainMemory.setI32(paramInt3, 350);
/* 522 */           paramInt2 = 350;
/*     */         }
/*     */         
/*     */ 
/*     */         label1532:
/*     */         
/*     */ 
/* 529 */         paramInt1 = MainMemory.getI32(i13);
/* 530 */         if (paramInt1 != 0)
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
/* 541 */           ffclos.call(paramInt1, paramInt3);
/* 542 */           i = MainMemory.getI32(paramInt3);
/*     */           
/*     */ 
/*     */           break label1580;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 550 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label1580:
/*     */       
/*     */ 
/* 556 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 561 */       MainMemory.dealloc_generated(i25);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmrm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */