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
/*     */ public final class fits_execute_template
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3456;
/*  21 */   public static final Function _instance = new fits_execute_template();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public fits_execute_template() { super("fits_execute_template", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  28 */     call(paramInt1, paramInt2, paramInt3);
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
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*     */     
/*     */ 
/*  65 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       i = MainMemory.alloc(4);
/*  70 */       j = MainMemory.alloc(4);
/*  71 */       k = MainMemory.alloc(4);
/*  72 */       m = MainMemory.alloc(80);
/*  73 */       n = MainMemory.alloc(80);
/*  74 */       i1 = MainMemory.alloc(4);
/*  75 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         if (MainMemory.getI32(paramInt3) != 0) {
/*     */           break label1514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */         if ((paramInt1 != 0) && (paramInt2 != 0)) {
/*     */           break label152;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         MainMemory.setI32(paramInt3, 362);
/*     */         
/*     */ 
/*     */         break label1519;
/*     */         
/*     */         label152:
/*     */         
/* 112 */         MainMemory.setI32Aligned(467192, 0);
/* 113 */         MainMemory.setI32Aligned(467188, 0);
/* 114 */         MainMemory.setI32Aligned(467180, 1);
/* 115 */         MainMemory.setI8(483072, (byte)0);
/* 116 */         i4 = ngp_delete_extver_tab.call();
/* 117 */         if (i4 != 0) {
/*     */           break label1498;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         i4 = MainMemory.getI32(paramInt1) + 1;
/* 128 */         if (i4 >= 2) {
/*     */           break label322;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         ffmahd.call(paramInt1, 1, i, paramInt3);
/* 139 */         ffghsp.call(paramInt1, j, k, paramInt3);
/* 140 */         ffmahd.call(paramInt1, i4, i, paramInt3);
/* 141 */         i4 = MainMemory.getI32(paramInt3);
/* 142 */         if (i4 != 0) {
/*     */           break label1514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         if (MainMemory.getI32(j) <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 156 */           i8 = i4;
/* 157 */           i4 = 1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 164 */           i8 = i4;
/* 165 */           i4 = 0;
/*     */           
/*     */           break label564;
/*     */           
/*     */           label322:
/* 170 */           i2 = i1;
/* 171 */           i8 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           while (i8 + 2 <= i4)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */             MainMemory.setI32(paramInt3, 0);
/* 189 */             ffmahd.call(paramInt1, 1, i, paramInt3);
/* 190 */             if (MainMemory.getI32(paramInt3) != 0) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */             ffgky.call(paramInt1, 16, 40928, n, 0, paramInt3);
/* 201 */             if (MainMemory.getI32(paramInt3) != 0) {
/*     */               break label521;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */             ffgky.call(paramInt1, 41, 34656, i2, 0, paramInt3);
/* 212 */             i3 = MainMemory.getI32(i1);
/* 213 */             switch (MainMemory.getI32(paramInt3))
/*     */             {
/*     */             case 204: 
/*     */               break;
/*     */             case 0: 
/*     */               break label505;
/*     */               
/*     */ 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 225 */             MainMemory.setI32(paramInt3, 0);
/* 226 */             i3 = 1;
/*     */             
/*     */ 
/*     */ 
/*     */             label505:
/*     */             
/*     */ 
/* 233 */             MainMemory.setI32(paramInt3, ngp_set_extver.call(n, i3));
/*     */             
/*     */ 
/*     */             label521:
/*     */             
/*     */ 
/* 239 */             i8 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 245 */           ffmahd.call(paramInt1, i4, i, paramInt3);
/* 246 */           i4 = MainMemory.getI32(paramInt3);
/* 247 */           i8 = i4;
/* 248 */           i4 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label564:
/*     */         
/*     */ 
/* 256 */         if (i8 != 0) {
/*     */           break label1514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */         i8 = ngp_include_file.call(paramInt2);
/* 267 */         MainMemory.setI32(paramInt3, i8);
/* 268 */         if (i8 != 0) {
/*     */           break label1514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */         i8 = SystemLibrary.strlen(paramInt2);
/* 279 */         i3 = i8 + -1;
/* 280 */         i6 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 287 */           i7 = i3 - i6;
/* 288 */           if (i7 <= -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */           i5 = i6 + 1;
/* 299 */           if (MainMemory.getI8(paramInt2 + i7) == 47) {
/*     */             break;
/*     */           }
/*     */           
/* 303 */           i6 = i5;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */         i8 -= i6;
/* 311 */         i8 = i8 > 999 ? 999 : i8;
/* 312 */         if (i8 <= 0) {
/*     */           break label759;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 322 */         SystemLibrary.memcpy(483072, paramInt2, i8, 1);
/* 323 */         MainMemory.setI8(483072 + i8, (byte)0);
/*     */         
/*     */ 
/*     */         label759:
/*     */         
/*     */ 
/* 329 */         paramInt2 = m + 79;
/* 330 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 339 */           i3 = ngp_read_line.call(1);
/* 340 */           if (i3 != 0)
/*     */           {
/*     */ 
/*     */ 
/* 344 */             i4 = i3;
/*     */             
/*     */ 
/*     */             break label1342;
/*     */           }
/*     */           
/*     */ 
/* 351 */           switch (MainMemory.getI32Aligned(467196)) {
/*     */           case 1: 
/*     */             break label1190;
/*     */             break;
/*     */           case 3: 
/*     */             break label1040;
/*     */             break; case 4:  break; case 5:  i8 = 1;
/*     */             
/*     */ 
/*     */             break label1317;
/*     */             
/*     */ 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 367 */           if (i4 == 0) {
/* 368 */             i3 = 369;
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
/*     */ 
/* 380 */             i2 = MainMemory.getI32Aligned(468000);
/* 381 */             if (i2 == 0) {
/* 382 */               i3 = 363;
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
/*     */             }
/* 394 */             else if (MainMemory.getI32Aligned(458912) != 0)
/*     */             {
/*     */ 
/*     */ 
/* 398 */               i3 = 364;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/* 407 */               MainMemory.setI32Aligned(458912, i2);
/* 408 */               MainMemory.setI32Aligned(458916, MainMemory.getI32Aligned(468004));
/* 409 */               MainMemory.setI32Aligned(458920, MainMemory.getI32Aligned(468008));
/* 410 */               MainMemory.setI32Aligned(467200, MainMemory.getI32Aligned(468012));
/* 411 */               MainMemory.setI32Aligned(458924, MainMemory.getI32Aligned(468016));
/* 412 */               MainMemory.setI32Aligned(467204, MainMemory.getI32Aligned(468020));
/* 413 */               MainMemory.setI32Aligned(468000, 0);
/* 414 */               i4 = ngp_read_xtension.call(paramInt1, 0, 3);
/* 415 */               i3 = i4;
/*     */               
/* 417 */               i4 = 0;
/*     */               
/*     */               break label1317;
/*     */               
/*     */               label1040:
/* 422 */               i2 = MainMemory.getI32Aligned(468000);
/* 423 */               if (i2 == 0) {
/* 424 */                 i3 = 363;
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
/*     */               }
/* 436 */               else if (MainMemory.getI32Aligned(458912) != 0)
/*     */               {
/*     */ 
/*     */ 
/* 440 */                 i3 = 364;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 449 */                 MainMemory.setI32Aligned(458912, i2);
/* 450 */                 MainMemory.setI32Aligned(458916, MainMemory.getI32Aligned(468004));
/* 451 */                 MainMemory.setI32Aligned(458920, MainMemory.getI32Aligned(468008));
/* 452 */                 MainMemory.setI32Aligned(467200, MainMemory.getI32Aligned(468012));
/* 453 */                 MainMemory.setI32Aligned(458924, MainMemory.getI32Aligned(468016));
/* 454 */                 MainMemory.setI32Aligned(467204, MainMemory.getI32Aligned(468020));
/* 455 */                 MainMemory.setI32Aligned(468000, 0);
/* 456 */                 i4 = ngp_read_xtension.call(paramInt1, 0, i4 == 0 ? 0 : 2);
/* 457 */                 i3 = i4;
/*     */                 
/* 459 */                 i4 = 0;
/*     */                 
/*     */                 break label1317;
/*     */                 
/*     */                 label1190:
/* 464 */                 if (MainMemory.getI32Aligned(481696) != 2) {
/*     */                   break label1235;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 474 */                 SystemLibrary.strncpy(m, MainMemory.getI32Aligned(481772), 80);
/*     */                 
/*     */                 break label1276;
/*     */                 
/*     */                 label1235:
/* 479 */                 i4 = MainMemory.getI32Aligned(467180);
/* 480 */                 MainMemory.setI32Aligned(467180, i4 + 1);
/* 481 */                 SystemLibrary.sprintf(m, 58368, new Object[] { Integer.valueOf(i4) });
/*     */                 
/*     */ 
/*     */                 label1276:
/*     */                 
/*     */ 
/* 487 */                 MainMemory.setI8(paramInt2, (byte)0);
/* 488 */                 i4 = ngp_read_group.call(paramInt1, m, 0);
/* 489 */                 i3 = i4;
/*     */                 
/* 491 */                 i4 = 0;
/*     */                 
/*     */ 
/*     */                 break label1317;
/*     */                 
/* 496 */                 i3 = 369;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1317:
/*     */           
/*     */ 
/*     */ 
/* 507 */           if ((i8 | i3) != 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         break label1342;
/* 512 */         i4 = i3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1342:
/*     */         
/*     */ 
/*     */ 
/* 521 */         paramInt2 = MainMemory.getI32Aligned(468000);
/* 522 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 532 */           free.call(paramInt2);
/* 533 */           MainMemory.setI32Aligned(468000, 0);
/* 534 */           MainMemory.setI32Aligned(468004, 0);
/* 535 */           MainMemory.setI32Aligned(468008, 0);
/* 536 */           MainMemory.setI32Aligned(468016, 0);
/* 537 */           MainMemory.setI32Aligned(468012, 0);
/* 538 */           MainMemory.setI32Aligned(468020, 0);
/* 539 */           MainMemory.setI32Aligned(468024, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 545 */         paramInt2 = MainMemory.getI32Aligned(458912);
/* 546 */         if (paramInt2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 556 */           free.call(paramInt2);
/* 557 */           MainMemory.setI32Aligned(458912, 0);
/* 558 */           MainMemory.setI32Aligned(458916, 0);
/* 559 */           MainMemory.setI32Aligned(458920, 0);
/* 560 */           MainMemory.setI32Aligned(458924, 0);
/* 561 */           MainMemory.setI32Aligned(467200, 0);
/* 562 */           MainMemory.setI32Aligned(467204, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 568 */         ngp_delete_extver_tab.call();
/* 569 */         MainMemory.setI32(paramInt3, i4);
/*     */         
/*     */ 
/*     */         break label1519;
/*     */         
/*     */         label1498:
/*     */         
/* 576 */         MainMemory.setI32(paramInt3, i4);
/*     */         
/*     */ 
/*     */ 
/*     */         break label1519;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1514:
/*     */       
/*     */ 
/*     */ 
/*     */       label1519:
/*     */       
/*     */ 
/*     */ 
/* 593 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_execute_template.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */