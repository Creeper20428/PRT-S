/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
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
/*     */ public final class ngp_read_group
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3455;
/*  23 */   public static final Function _instance = new ngp_read_group();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ngp_read_group() { super("ngp_read_group", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int m = call(i, j, k);
/*  45 */     paramFrame.setI32(paramInt1, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  51 */     int i = 0;
/*     */     
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     int i3 = 0;
/*  60 */     int i4 = 0;
/*  61 */     int i5 = 0;
/*  62 */     int i6 = 0;
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*     */     
/*     */ 
/*  68 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       j = MainMemory.alloc(4);
/*  73 */       k = MainMemory.alloc(4);
/*  74 */       m = MainMemory.alloc(4);
/*  75 */       n = MainMemory.alloc(4);
/*  76 */       i1 = MainMemory.alloc(80);
/*  77 */       i2 = MainMemory.alloc(80);
/*  78 */       i3 = MainMemory.alloc(8);
/*  79 */       MainMemory.setI8(i2, (byte)0);
/*  80 */       MainMemory.setI32Aligned(467188, MainMemory.getI32Aligned(467188) + 1);
/*  81 */       i4 = i3 + 4;
/*  82 */       MainMemory.setI32(i4, 0);
/*  83 */       MainMemory.setI32(i3, 0);
/*  84 */       MainMemory.setI32(m, 0);
/*  85 */       i5 = ffthdu.call(paramInt1, k, m);
/*  86 */       MainMemory.setI32(m, i5);
/*  87 */       i8 = MainMemory.getI32(k);
/*  88 */       if (i8 != 0)
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
/*  99 */         i5 = ffmahd.call(paramInt1, i8, j, m);
/* 100 */         MainMemory.setI32(m, i5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       if (i5 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         MainMemory.setI32(m, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 124 */       i5 = ffgtis.call(paramInt1, paramInt2, m);
/* 125 */       MainMemory.setI32(m, i5);
/* 126 */       if (i5 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 130 */         paramInt3 = i5;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 137 */         i5 = MainMemory.getI32(paramInt1) + 1;
/* 138 */         if (paramInt3 <= 0) {
/*     */           break label336;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         ffmahd.call(paramInt1, paramInt3, n, m);
/* 149 */         ffgtam.call(paramInt1, i5, m);
/* 150 */         ffmahd.call(paramInt1, i5, n, m);
/* 151 */         paramInt3 = MainMemory.getI32(m);
/* 152 */         if (paramInt3 != 0) {
/*     */           break label1296;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label336:
/*     */         
/*     */ 
/*     */ 
/* 163 */         paramInt2 = i1 + 79;
/* 164 */         paramInt3 = 0;
/* 165 */         i8 = 6;
/*     */         label497:
/*     */         label662:
/*     */         label686:
/*     */         label731:
/*     */         label772:
/*     */         label917:
/*     */         label967:
/* 173 */         label993: do { if (paramInt3 != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           i7 = ngp_read_line.call(0);
/* 184 */           MainMemory.setI32(m, i7);
/* 185 */           if (i7 != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */           switch (MainMemory.getI32Aligned(467196)) {
/*     */           case 1: 
/*     */             break label686;
/*     */             break;
/*     */           case 2: 
/*     */             break label662;
/*     */             break;
/*     */           case 3: 
/*     */             break label497;
/*     */             break;
/*     */           case 4: 
/*     */             break;
/*     */           case 5: 
/*     */             break;
/*     */           }
/* 210 */           MainMemory.setI32(m, 369);
/* 211 */           break;
/*     */           
/*     */ 
/*     */ 
/* 215 */           i6 = MainMemory.getI32Aligned(468000);
/* 216 */           if (i6 == 0) {
/* 217 */             i7 = 363;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 227 */           else if (MainMemory.getI32Aligned(458912) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 231 */             i7 = 364;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 238 */             MainMemory.setI32Aligned(458912, i6);
/* 239 */             MainMemory.setI32Aligned(458916, MainMemory.getI32Aligned(468004));
/* 240 */             MainMemory.setI32Aligned(458920, MainMemory.getI32Aligned(468008));
/* 241 */             MainMemory.setI32Aligned(467200, MainMemory.getI32Aligned(468012));
/* 242 */             MainMemory.setI32Aligned(458924, MainMemory.getI32Aligned(468016));
/* 243 */             MainMemory.setI32Aligned(467204, MainMemory.getI32Aligned(468020));
/* 244 */             MainMemory.setI32Aligned(468000, 0);
/* 245 */             MainMemory.setI32(m, 0);
/* 246 */             i7 = ngp_read_xtension.call(paramInt1, i5, 0);
/* 247 */             MainMemory.setI32(m, i7);
/*     */             
/*     */ 
/*     */ 
/* 251 */             continue;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 256 */           MainMemory.setI32(m, i7);
/*     */           
/*     */ 
/*     */ 
/* 260 */           continue;
/*     */           
/*     */ 
/*     */ 
/* 264 */           MainMemory.setI32Aligned(467188, MainMemory.getI32Aligned(467188) + -1);
/*     */           
/* 266 */           paramInt3 = 1;
/*     */           
/* 268 */           continue;
/*     */           
/*     */ 
/*     */ 
/* 272 */           if (MainMemory.getI32Aligned(481696) != 2) {
/*     */             break label731;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */           SystemLibrary.strncpy(i1, MainMemory.getI32Aligned(481772), 80);
/*     */           
/*     */ 
/*     */           break label772;
/*     */           
/* 287 */           i7 = MainMemory.getI32Aligned(467180);
/* 288 */           MainMemory.setI32Aligned(467180, i7 + 1);
/* 289 */           SystemLibrary.sprintf(i1, 58368, new Object[] { Integer.valueOf(i7) });
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */           MainMemory.setI8(paramInt2, (byte)0);
/* 296 */           i7 = call(paramInt1, i1, i5);
/* 297 */           MainMemory.setI32(m, i7);
/*     */           
/*     */ 
/*     */ 
/* 301 */           continue;
/*     */           
/*     */ 
/*     */ 
/* 305 */           i7 = SystemLibrary.strlen(481700);
/* 306 */           if (!MathUtils.ult(i7 + -2, 5)) {
/*     */             break label993;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */           i7 += -1;
/* 318 */           i6 = 481700 + i7;
/* 319 */           if (MainMemory.getI8(i6) != 35) {
/*     */             break label993;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */           if (MainMemory.getI8(i2) != 0) {
/*     */             break label917;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */           SystemLibrary.memcpy(i2, 481700, i7, 1);
/* 341 */           MainMemory.setI8(i2 + i7, (byte)0);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 347 */           if (i7 != SystemLibrary.strlen(i2)) {
/*     */             break label967;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */           i8 = (SystemLibrary.memcmp(i2, 481700, i7) == 0 ? 1 : 0) + i8;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */           SystemLibrary.sprintf(i6, 15680, new Object[] { Integer.valueOf(i8) });
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 374 */           i7 = ngp_hdu_insert_token.call(i3);
/* 375 */           MainMemory.setI32(m, i7);
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
/*     */         }
/* 387 */         while (i7 == 0);
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
/* 399 */         ffmahd.call(paramInt1, i5, n, m);
/* 400 */         paramInt3 = MainMemory.getI32(m);
/* 401 */         if (paramInt3 != 0) {
/*     */           break label1081;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */         paramInt3 = ngp_append_columns.call(paramInt1, i3, 6);
/* 413 */         MainMemory.setI32(m, paramInt3);
/*     */         
/*     */ 
/*     */ 
/*     */         label1081:
/*     */         
/*     */ 
/*     */ 
/* 421 */         if (paramInt3 != 0) {
/*     */           break label1116;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 432 */         paramInt3 = ngp_keyword_all_write.call(i3, paramInt1);
/* 433 */         MainMemory.setI32(m, paramInt3);
/*     */         
/*     */ 
/*     */ 
/*     */         label1116:
/*     */         
/*     */ 
/*     */ 
/* 441 */         if (paramInt3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 451 */           MainMemory.setI32(n, 0);
/* 452 */           ffgtrm.call(paramInt1, n);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 458 */         i9 = MainMemory.getI32(i4);
/* 459 */         if (MainMemory.getI32(i3) > 0)
/*     */         {
/* 461 */           i5 = 0;
/*     */         } else {
/*     */           break label1255;
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
/* 474 */           paramInt3 = i5 + 1;
/* 475 */           if (MainMemory.getI32(i9 + i5 * 172) != 2) {
/*     */             break label1226;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */           ngp_read_group_1586.call(i5, i4, i9);
/*     */           
/*     */ 
/*     */           label1226:
/*     */           
/*     */ 
/* 491 */           i9 = MainMemory.getI32(i4);
/* 492 */           if (MainMemory.getI32(i3) <= paramInt3)
/*     */             break;
/* 494 */           i5 = paramInt3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1255:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 506 */         if (i9 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */           free.call(i9);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 522 */         i = MainMemory.getI32(m);
/*     */         
/*     */ 
/*     */         break label1303;
/*     */       }
/*     */       
/*     */       label1296:
/*     */       
/* 530 */       i = paramInt3;
/*     */       
/*     */ 
/*     */       label1303:
/*     */       
/*     */ 
/* 536 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 541 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_read_group.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */