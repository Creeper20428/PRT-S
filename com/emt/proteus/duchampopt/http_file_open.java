/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.LongJmpException;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class http_file_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3106;
/*  19 */   public static final Function _instance = new http_file_open();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public http_file_open() { super("http_file_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  40 */     int m = call(i, j, k);
/*  41 */     paramFrame.setI32(paramInt1, m);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     int i7 = 0;
/*  60 */     int i8 = 0;
/*  61 */     int i9 = 0;
/*  62 */     long l = 0L;
/*     */     
/*     */ 
/*  65 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       j = MainMemory.alloc(4);
/*  70 */       k = MainMemory.alloc(100);
/*  71 */       m = MainMemory.alloc(1200);
/*  72 */       n = MainMemory.alloc(1200);
/*  73 */       i1 = MainMemory.alloc(4);
/*  74 */       i2 = MainMemory.alloc(4);
/*  75 */       if (SystemLibrary.strncmp(489728, 20608, 4) != 0) {
/*     */         break label132;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       i = http_open.call(paramInt1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       break label1417;
/*     */       
/*     */       label132:
/*     */       
/*  92 */       MainMemory.setI32Aligned(459492, 0);
/*  93 */       MainMemory.setI32Aligned(459496, 0);
/*  94 */       MainMemory.setI32Aligned(459500, 0);
/*  95 */       i3 = SystemLibrary.strlen(489728);
/*  96 */       if (i3 != 0) {
/*     */         break label206;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */       ffxmsg.call(5, 132512);
/* 107 */       i = 104;
/*     */       
/*     */ 
/*     */ 
/*     */       break label1417;
/*     */       
/*     */ 
/* 114 */       i4 = SystemLibrary._setjmp(471136);
/*     */       label206:
/* 116 */       if (i4 != 0) {
/*     */         break label1295;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       SystemLibrary.signal(14, 3101);
/* 127 */       alarm.call(180);
/* 128 */       i4 = F274069.call(paramInt1, j, k, i1);
/* 129 */       MainMemory.setI32(i2, i4);
/* 130 */       if (i4 != 0) {
/*     */         break label1269;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       MainMemory.setI32Aligned(459492, MainMemory.getI32Aligned(459492) + 1);
/* 141 */       if (MainMemory.getI8(489728) != 33) {
/*     */         break label396;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       if (i3 > 0) {
/* 152 */         i4 = 0;
/*     */       } else {
/*     */         break label379;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 163 */         i5 = i4 + 1;
/* 164 */         MainMemory.setI8(489728 + i4, MainMemory.getI8(489728 + i5));
/* 165 */         if (i5 == i3) {
/*     */           break;
/*     */         }
/*     */         
/* 169 */         i4 = i5;
/*     */       }
/*     */       
/*     */ 
/*     */       label379:
/*     */       
/*     */ 
/* 176 */       remove.call(489728);
/* 177 */       MainMemory.setI32(i2, 0);
/*     */       
/*     */ 
/*     */       label396:
/*     */       
/*     */ 
/* 183 */       i6 = (byte)SystemLibrary.fgetc(MainMemory.getI32(j));
/* 184 */       SystemLibrary.ungetc(i6, MainMemory.getI32(j));
/* 185 */       if (SystemLibrary.strcmp(k, 35872) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         if ((SystemLibrary.strcmp(k, 49888) != 0) && (i6 != 31)) {
/*     */           break label756;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */       i3 = file_create.call(489728, paramInt3);
/* 206 */       MainMemory.setI32(i2, i3);
/* 207 */       if (i3 != 0) {
/*     */         break label734;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */       i7 = 503808 + (MainMemory.getI32(paramInt3) << 4);
/* 218 */       if (SystemLibrary.fclose(MainMemory.getI32(i7)) != 0) {
/*     */         break label547;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */       MainMemory.setI32(i7, 0);
/*     */       
/*     */ 
/*     */       label547:
/*     */       
/*     */ 
/* 234 */       i8 = SystemLibrary.fopen(489728, 14176);
/* 235 */       MainMemory.setI32Aligned(458768, i8);
/* 236 */       if (i8 != 0) {
/*     */         break label604;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */       ffxmsg.call(5, 114400);
/* 247 */       ffxmsg.call(5, 489728);
/*     */       
/*     */       break label1306;
/*     */       
/*     */       label604:
/* 252 */       MainMemory.setI32Aligned(459500, MainMemory.getI32Aligned(459500) + 1);
/* 253 */       MainMemory.setI32(i2, 0);
/* 254 */       alarm.call(1800);
/* 255 */       i3 = uncompress2file.call(MainMemory.getI32(j), MainMemory.getI32Aligned(458768), i2);
/* 256 */       MainMemory.setI32(i2, i3);
/* 257 */       alarm.call(0);
/* 258 */       if (i3 != 0) {
/*     */         break label707;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */       SystemLibrary.fclose(MainMemory.getI32Aligned(458768));
/* 269 */       MainMemory.setI32Aligned(459500, MainMemory.getI32Aligned(459500) + -1);
/*     */       
/*     */       break label967;
/*     */       
/*     */       label707:
/* 274 */       ffxmsg.call(5, 130528);
/* 275 */       ffxmsg.call(5, paramInt1);
/* 276 */       ffxmsg.call(5, 489728);
/*     */       
/*     */       break label1306;
/*     */       
/*     */       label734:
/* 281 */       ffxmsg.call(5, 105376);
/* 282 */       ffxmsg.call(5, 489728);
/*     */       
/*     */       break label1306;
/*     */       
/*     */       label756:
/* 287 */       i3 = file_create.call(489728, paramInt3);
/* 288 */       MainMemory.setI32(i2, i3);
/* 289 */       if (i3 != 0) {
/*     */         break label1247;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */       MainMemory.setI32Aligned(459496, MainMemory.getI32Aligned(459496) + 1);
/* 300 */       i3 = MainMemory.getI32(i1);
/* 301 */       if (i3 % 2880 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 311 */         SystemLibrary.sprintf(m, 128224, new Object[] { Integer.valueOf(i3) });
/* 312 */         ffxmsg.call(5, m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 318 */       alarm.call(180);
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 324 */         i3 = SystemLibrary.fread(n, 1, 1200, MainMemory.getI32(j));
/* 325 */         if (i3 != 0) {
/*     */           break label1018;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */         i7 = 503808 + (MainMemory.getI32(paramInt3) << 4);
/* 336 */         if (SystemLibrary.fclose(MainMemory.getI32(i7)) != 0) {
/*     */           break label950;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 346 */         MainMemory.setI32(i7, 0);
/*     */         
/*     */ 
/*     */         label950:
/*     */         
/*     */ 
/* 352 */         MainMemory.setI32Aligned(459496, MainMemory.getI32Aligned(459496) + -1);
/*     */         
/*     */ 
/*     */         label967:
/*     */         
/*     */ 
/* 358 */         SystemLibrary.fclose(MainMemory.getI32(j));
/* 359 */         MainMemory.setI32Aligned(459492, MainMemory.getI32Aligned(459492) + -1);
/* 360 */         SystemLibrary.signal(14, 0);
/* 361 */         alarm.call(0);
/* 362 */         i = file_open.call(489728, paramInt2, paramInt3);
/*     */         
/*     */ 
/*     */         break label1417;
/*     */         
/*     */         label1018:
/*     */         
/* 369 */         alarm.call(0);
/* 370 */         i4 = MainMemory.getI32(paramInt3);
/* 371 */         i1 = 503808 + (i4 << 4) + 12;
/* 372 */         if (MainMemory.getI32(i1) != 1) {
/*     */           break label1128;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */         i9 = 503808 + (i4 << 4) + 4;
/* 383 */         l = MainMemory.getI64(i9);
/* 384 */         if (SystemLibrary.fseek(MainMemory.getI32(503808 + (i4 << 4)), l, 0) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 388 */           paramInt2 = 116;
/* 389 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 395 */         MainMemory.setI64(i9, l);
/*     */         
/*     */ 
/*     */         label1128:
/*     */         
/*     */ 
/* 401 */         if (SystemLibrary.fwrite(n, 1, i3, MainMemory.getI32(503808 + (i4 << 4))) != i3)
/*     */         {
/*     */ 
/*     */ 
/* 405 */           paramInt2 = 106;
/* 406 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 412 */         i9 = 503808 + (i4 << 4) + 4;
/* 413 */         MainMemory.setI64(i9, MainMemory.getI64(i9) + i3);
/* 414 */         MainMemory.setI32(i1, 2);
/* 415 */         MainMemory.setI32(i2, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 421 */       MainMemory.setI32(i2, paramInt2);
/* 422 */       ffxmsg.call(5, 121952);
/* 423 */       ffxmsg.call(5, paramInt1);
/* 424 */       ffxmsg.call(5, 489728);
/*     */       
/*     */       break label1306;
/*     */       
/*     */       label1247:
/* 429 */       ffxmsg.call(5, 105376);
/* 430 */       ffxmsg.call(5, 489728);
/*     */       
/*     */       break label1306;
/*     */       
/*     */       label1269:
/* 435 */       alarm.call(0);
/* 436 */       ffxmsg.call(5, 96352);
/* 437 */       ffxmsg.call(5, paramInt1);
/*     */       
/*     */       break label1306;
/*     */       
/*     */       label1295:
/* 442 */       ffxmsg.call(5, 62784);
/*     */       
/*     */ 
/*     */       label1306:
/*     */       
/*     */ 
/* 448 */       alarm.call(0);
/* 449 */       if (MainMemory.getI32Aligned(459492) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */         SystemLibrary.fclose(MainMemory.getI32(j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 465 */       if (MainMemory.getI32Aligned(459500) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 475 */         SystemLibrary.fclose(MainMemory.getI32Aligned(458768));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 481 */       if (MainMemory.getI32Aligned(459496) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 491 */         http_file_open_1522.call(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 497 */       SystemLibrary.signal(14, 0);
/* 498 */       i = 104;
/*     */       
/*     */ 
/*     */       label1417:
/*     */       
/*     */ 
/* 504 */       return i;
/*     */     }
/*     */     catch (LongJmpException localLongJmpException)
/*     */     {
/*     */       for (;;) {
/* 509 */         i4 = localLongJmpException.getReturnValue();
/*     */       }
/* 511 */       return i;
/*     */     }
/*     */     finally
/*     */     {
/* 515 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/http_file_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */