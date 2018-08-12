/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.LongJmpException;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class http_compress_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3103;
/*  19 */   public static final Function _instance = new http_compress_open();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public http_compress_open() { super("http_compress_open", 3, false); }
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
/*  57 */     long l = 0L;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*     */     
/*     */ 
/*  63 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       j = MainMemory.alloc(4);
/*  68 */       k = MainMemory.alloc(100);
/*  69 */       m = MainMemory.alloc(1200);
/*  70 */       i3 = MainMemory.alloc(4);
/*  71 */       MainMemory.setI32Aligned(459492, 0);
/*  72 */       MainMemory.setI32Aligned(459488, 0);
/*  73 */       MainMemory.setI32Aligned(459484, 0);
/*  74 */       MainMemory.setI32Aligned(459480, 0);
/*  75 */       n = SystemLibrary.strlen(489728);
/*  76 */       if (n != 0) {
/*     */         break label135;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       ffxmsg.call(5, 136224);
/*     */       
/*     */       break label1146;
/*     */       
/*     */       label135:
/*  91 */       if (paramInt2 != 0) {
/*     */         break label1129;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       paramInt2 = SystemLibrary._setjmp(471136);
/*     */       
/* 103 */       if (paramInt2 != 0) {
/*     */         break label1113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       SystemLibrary.signal(14, 3101);
/* 114 */       alarm.call(180);
/* 115 */       if (F274069.call(paramInt1, j, k, i3) != 0) {
/*     */         break label1087;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       MainMemory.setI32Aligned(459492, MainMemory.getI32Aligned(459492) + 1);
/* 126 */       i1 = (byte)SystemLibrary.fgetc(MainMemory.getI32(j));
/* 127 */       SystemLibrary.ungetc(i1, MainMemory.getI32(j));
/* 128 */       if (SystemLibrary.strcmp(k, 35872) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         if ((SystemLibrary.strcmp(k, 49888) != 0) && (i1 != 31)) {
/*     */           break label1071;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       if (MainMemory.getI8(489728) != 33) {
/*     */         break label403;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       if (n > 0) {
/* 159 */         paramInt2 = 0;
/*     */       } else {
/*     */         break label392;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 170 */         i2 = paramInt2 + 1;
/* 171 */         MainMemory.setI8(489728 + paramInt2, MainMemory.getI8(489728 + i2));
/* 172 */         if (i2 == n) {
/*     */           break;
/*     */         }
/*     */         
/* 176 */         paramInt2 = i2;
/*     */       }
/*     */       
/*     */ 
/*     */       label392:
/*     */       
/*     */ 
/* 183 */       remove.call(489728);
/*     */       
/*     */ 
/*     */       label403:
/*     */       
/*     */ 
/* 189 */       if (file_create.call(489728, paramInt3) != 0) {
/*     */         break label1049;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       MainMemory.setI32Aligned(459488, MainMemory.getI32Aligned(459488) + 1);
/* 200 */       alarm.call(180);
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 206 */         paramInt2 = SystemLibrary.fread(m, 1, 1200, MainMemory.getI32(j));
/* 207 */         if (paramInt2 != 0) {
/*     */           break label839;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */         i5 = 503808 + (MainMemory.getI32(paramInt3) << 4);
/* 218 */         if (SystemLibrary.fclose(MainMemory.getI32(i5)) != 0) {
/*     */           break label527;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */         MainMemory.setI32(i5, 0);
/*     */         
/*     */ 
/*     */         label527:
/*     */         
/*     */ 
/* 234 */         SystemLibrary.fclose(MainMemory.getI32(j));
/* 235 */         MainMemory.setI32Aligned(459492, MainMemory.getI32Aligned(459492) + -1);
/* 236 */         MainMemory.setI32Aligned(459488, MainMemory.getI32Aligned(459488) + -1);
/* 237 */         i6 = SystemLibrary.fopen(489728, 14016);
/* 238 */         MainMemory.setI32Aligned(458764, i6);
/* 239 */         if (i6 != 0) {
/*     */           break label617;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */         ffxmsg.call(5, 110176);
/* 250 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1146;
/*     */         
/*     */         label617:
/* 255 */         MainMemory.setI32Aligned(459484, MainMemory.getI32Aligned(459484) + 1);
/* 256 */         if (mem_create.call(paramInt1, paramInt3) != 0) {
/*     */           break label823;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */         MainMemory.setI32Aligned(459480, MainMemory.getI32Aligned(459480) + 1);
/* 267 */         paramInt2 = mem_uncompress2mem.call(paramInt1, MainMemory.getI32Aligned(458764), MainMemory.getI32(paramInt3));
/* 268 */         SystemLibrary.fclose(MainMemory.getI32Aligned(458764));
/* 269 */         MainMemory.setI32Aligned(459484, MainMemory.getI32Aligned(459484) + -1);
/* 270 */         if (paramInt2 != 0) {
/*     */           break label801;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */         SystemLibrary.signal(14, 0);
/* 281 */         alarm.call(0);
/* 282 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 283 */         if (MainMemory.getI64(512000 + paramInt2 * 44 + 32) >= 0L) {
/*     */           break label775;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */         i = 107;
/*     */         
/*     */ 
/*     */         break label1324;
/*     */         
/*     */         label775:
/*     */         
/* 300 */         MainMemory.setI64(512000 + paramInt2 * 44 + 24, 0L);
/* 301 */         i = 0;
/*     */         
/*     */ 
/*     */         break label1324;
/*     */         
/*     */         label801:
/*     */         
/* 308 */         ffxmsg.call(5, 131488);
/* 309 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1146;
/*     */         
/*     */         label823:
/* 314 */         ffxmsg.call(5, 114272);
/*     */         
/*     */         break label1146;
/*     */         
/*     */         label839:
/* 319 */         alarm.call(0);
/* 320 */         n = MainMemory.getI32(paramInt3);
/* 321 */         i3 = 503808 + (n << 4) + 12;
/* 322 */         if (MainMemory.getI32(i3) != 1) {
/*     */           break label946;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */         i4 = 503808 + (n << 4) + 4;
/* 333 */         l = MainMemory.getI64(i4);
/* 334 */         if (SystemLibrary.fseek(MainMemory.getI32(503808 + (n << 4)), l, 0) != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */         MainMemory.setI64(i4, l);
/*     */         
/*     */ 
/*     */         label946:
/*     */         
/*     */ 
/* 350 */         if (SystemLibrary.fwrite(m, 1, paramInt2, MainMemory.getI32(503808 + (n << 4))) != paramInt2) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */         i4 = 503808 + (n << 4) + 4;
/* 361 */         MainMemory.setI64(i4, MainMemory.getI64(i4) + paramInt2);
/* 362 */         MainMemory.setI32(i3, 2);
/* 363 */         alarm.call(180);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 368 */       ffxmsg.call(5, 100256);
/* 369 */       ffxmsg.call(5, 489728);
/*     */       
/*     */       break label1146;
/*     */       
/*     */       label1049:
/* 374 */       ffxmsg.call(5, 125408);
/* 375 */       ffxmsg.call(5, 489728);
/*     */       
/*     */       break label1146;
/*     */       
/*     */       label1071:
/* 380 */       ffxmsg.call(5, 126752);
/*     */       
/*     */       break label1146;
/*     */       
/*     */       label1087:
/* 385 */       alarm.call(0);
/* 386 */       ffxmsg.call(5, 105312);
/* 387 */       ffxmsg.call(5, paramInt1);
/*     */       
/*     */       break label1146;
/*     */       
/*     */       label1113:
/* 392 */       ffxmsg.call(5, 62784);
/*     */       
/*     */       break label1146;
/*     */       
/*     */       label1129:
/* 397 */       ffxmsg.call(5, 132448);
/* 398 */       ffxmsg.call(5, 123616);
/*     */       
/*     */ 
/*     */       label1146:
/*     */       
/*     */ 
/* 404 */       alarm.call(0);
/* 405 */       if (MainMemory.getI32Aligned(459492) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 415 */         SystemLibrary.fclose(MainMemory.getI32(j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 421 */       if (MainMemory.getI32Aligned(459484) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */         SystemLibrary.fclose(MainMemory.getI32Aligned(458764));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 437 */       if (MainMemory.getI32Aligned(459480) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 447 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 448 */         i7 = 512000 + paramInt2 * 44;
/* 449 */         free.call(MainMemory.getI32(MainMemory.getI32(i7)));
/* 450 */         MainMemory.setI32(i7, 0);
/* 451 */         MainMemory.setI32(512000 + paramInt2 * 44 + 4, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 457 */       if (MainMemory.getI32Aligned(459488) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 467 */         http_compress_open_1521.call(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 473 */       SystemLibrary.signal(14, 0);
/* 474 */       i = 104;
/*     */       
/*     */ 
/*     */       label1324:
/*     */       
/*     */ 
/* 480 */       return i;
/*     */     }
/*     */     catch (LongJmpException localLongJmpException)
/*     */     {
/*     */       for (;;) {
/* 485 */         paramInt2 = localLongJmpException.getReturnValue();
/*     */       }
/* 487 */       return i;
/*     */     }
/*     */     finally
/*     */     {
/* 491 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/http_compress_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */