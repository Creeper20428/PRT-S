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
/*     */ 
/*     */ public final class ftp_compress_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3100;
/*  20 */   public static final Function _instance = new ftp_compress_open();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ftp_compress_open() { super("ftp_compress_open", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  27 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = call(i, j, k);
/*  42 */     paramFrame.setI32(paramInt1, m);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     long l = 0L;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*     */     
/*     */ 
/*  65 */     int i9 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       j = MainMemory.alloc(4);
/*  70 */       k = MainMemory.alloc(4);
/*  71 */       m = MainMemory.alloc(1200);
/*  72 */       n = MainMemory.alloc(4);
/*  73 */       MainMemory.setI32Aligned(459472, 0);
/*  74 */       MainMemory.setI32Aligned(459476, 0);
/*  75 */       MainMemory.setI32Aligned(459480, 0);
/*  76 */       MainMemory.setI32Aligned(459484, 0);
/*  77 */       MainMemory.setI32Aligned(459488, 0);
/*  78 */       if (paramInt2 != 0) {
/*     */         break label1482;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       paramInt2 = SystemLibrary.strlen(489728);
/*  89 */       if (paramInt2 != 0) {
/*     */         break label173;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */       ffxmsg.call(5, 135456);
/* 100 */       i = 104;
/*     */       
/*     */ 
/*     */ 
/*     */       break label1496;
/*     */       
/*     */ 
/* 107 */       i4 = SystemLibrary._setjmp(471136);
/*     */       label173:
/* 109 */       if (i4 != 0) {
/*     */         break label1256;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       SystemLibrary.signal(14, 3101);
/* 120 */       alarm.call(180);
/* 121 */       if (F273321.call(paramInt1, j, k, n) != 0) {
/*     */         break label1230;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       MainMemory.setI32Aligned(459472, MainMemory.getI32Aligned(459472) + 1);
/* 132 */       MainMemory.setI32Aligned(459476, MainMemory.getI32Aligned(459476) + 1);
/* 133 */       i1 = MainMemory.getI32(j);
/* 134 */       i2 = (byte)SystemLibrary.fgetc(i1);
/* 135 */       SystemLibrary.ungetc(i2, i1);
/* 136 */       if (SystemLibrary.strstr(paramInt1, 17728) != 0) {
/*     */         break label346;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       if ((SystemLibrary.strstr(paramInt1, 15392) != 0) || (i2 != 31))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */         ffxmsg.call(5, 116064);
/*     */       }
/*     */       else
/*     */       {
/*     */         label346:
/* 161 */         if (MainMemory.getI8(489728) != 33) {
/*     */           break label445;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         if (paramInt2 > 0) {
/* 172 */           i4 = 0;
/*     */         } else {
/*     */           break label434;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 183 */           i3 = i4 + 1;
/* 184 */           MainMemory.setI8(489728 + i4, MainMemory.getI8(489728 + i3));
/* 185 */           if (i3 == paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/* 189 */           i4 = i3;
/*     */         }
/*     */         
/*     */ 
/*     */         label434:
/*     */         
/*     */ 
/* 196 */         remove.call(489728);
/*     */         
/*     */ 
/*     */         label445:
/*     */         
/*     */ 
/* 202 */         if (file_create.call(489728, paramInt3) != 0) {
/*     */           break label1208;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */         MainMemory.setI32Aligned(459488, MainMemory.getI32Aligned(459488) + 1);
/* 213 */         alarm.call(180);
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 219 */           paramInt2 = SystemLibrary.fread(m, 1, 1200, i1);
/* 220 */           if (paramInt2 != 0) {
/*     */             break label993;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */           i7 = 503808 + (MainMemory.getI32(paramInt3) << 4);
/* 231 */           if (SystemLibrary.fclose(MainMemory.getI32(i7)) != 0) {
/*     */             break label566;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */           MainMemory.setI32(i7, 0);
/*     */           
/*     */ 
/*     */           label566:
/*     */           
/*     */ 
/* 247 */           MainMemory.setI32Aligned(459488, MainMemory.getI32Aligned(459488) + -1);
/* 248 */           SystemLibrary.fclose(i1);
/* 249 */           MainMemory.setI32Aligned(459472, MainMemory.getI32Aligned(459472) + -1);
/* 250 */           paramInt2 = MainMemory.getI32(n);
/* 251 */           if (paramInt2 < 0) {
/*     */             break label691;
/*     */           } else {
/* 254 */             i4 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 263 */             if (i4 >= 5) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */             i3 = send.call(paramInt2, 27072 + i4, 5 - i4, 0);
/* 274 */             if (i3 < 1) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */             i4 = i3 + i4;
/*     */           }
/*     */           
/*     */ 
/*     */           label691:
/*     */           
/* 290 */           SystemLibrary.fclose(MainMemory.getI32(k));
/* 291 */           MainMemory.setI32Aligned(459476, MainMemory.getI32Aligned(459476) + -1);
/* 292 */           i1 = SystemLibrary.fopen(489728, 14016);
/* 293 */           MainMemory.setI32Aligned(458764, i1);
/* 294 */           if (i1 != 0) {
/*     */             break label772;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */           ffxmsg.call(5, 107744);
/* 305 */           ffxmsg.call(5, 489728);
/* 306 */           i = 104;
/*     */           
/*     */ 
/*     */           break label1496;
/*     */           
/*     */           label772:
/*     */           
/* 313 */           MainMemory.setI32Aligned(459484, MainMemory.getI32Aligned(459484) + 1);
/* 314 */           if (mem_create.call(paramInt1, paramInt3) != 0) {
/*     */             break label972;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */           MainMemory.setI32Aligned(459480, MainMemory.getI32Aligned(459480) + 1);
/* 325 */           paramInt2 = mem_uncompress2mem.call(paramInt1, MainMemory.getI32Aligned(458764), MainMemory.getI32(paramInt3));
/* 326 */           SystemLibrary.fclose(MainMemory.getI32Aligned(458764));
/* 327 */           MainMemory.setI32Aligned(459484, MainMemory.getI32Aligned(459484) + -1);
/* 328 */           if (paramInt2 != 0) {
/*     */             break label956;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 338 */           SystemLibrary.signal(14, 0);
/* 339 */           alarm.call(0);
/* 340 */           paramInt2 = MainMemory.getI32(paramInt3);
/* 341 */           if (MainMemory.getI64(512000 + paramInt2 * 44 + 32) >= 0L) {
/*     */             break label930;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */           i = 107;
/*     */           
/*     */ 
/*     */           break label1496;
/*     */           
/*     */           label930:
/*     */           
/* 358 */           MainMemory.setI64(512000 + paramInt2 * 44 + 24, 0L);
/* 359 */           i = 0;
/*     */           
/*     */ 
/*     */           break label1496;
/*     */           
/*     */           label956:
/*     */           
/* 366 */           ffxmsg.call(5, 126688);
/*     */           
/*     */           break label1267;
/*     */           
/*     */           label972:
/* 371 */           ffxmsg.call(5, 112480);
/* 372 */           ffxmsg.call(5, paramInt1);
/*     */           
/*     */           break label1267;
/*     */           
/*     */           label993:
/* 377 */           alarm.call(0);
/* 378 */           i4 = MainMemory.getI32(paramInt3);
/* 379 */           i5 = 503808 + (i4 << 4) + 12;
/* 380 */           if (MainMemory.getI32(i5) != 1) {
/*     */             break label1100;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */           i6 = 503808 + (i4 << 4) + 4;
/* 391 */           l = MainMemory.getI64(i6);
/* 392 */           if (SystemLibrary.fseek(MainMemory.getI32(503808 + (i4 << 4)), l, 0) != 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 402 */           MainMemory.setI64(i6, l);
/*     */           
/*     */ 
/*     */           label1100:
/*     */           
/*     */ 
/* 408 */           if (SystemLibrary.fwrite(m, 1, paramInt2, MainMemory.getI32(503808 + (i4 << 4))) != paramInt2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */           i6 = 503808 + (i4 << 4) + 4;
/* 419 */           MainMemory.setI64(i6, MainMemory.getI64(i6) + paramInt2);
/* 420 */           MainMemory.setI32(i5, 2);
/* 421 */           alarm.call(180);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 426 */         ffxmsg.call(5, 88864);
/* 427 */         ffxmsg.call(5, paramInt1);
/* 428 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1267;
/*     */         
/*     */         label1208:
/* 433 */         ffxmsg.call(5, 112416);
/* 434 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1267;
/*     */         
/*     */         label1230:
/* 439 */         alarm.call(0);
/* 440 */         ffxmsg.call(5, 100192);
/* 441 */         ffxmsg.call(5, paramInt1);
/*     */         
/*     */         break label1267;
/*     */         
/*     */         label1256:
/* 446 */         ffxmsg.call(5, 62784);
/*     */       }
/*     */       
/*     */ 
/*     */       label1267:
/*     */       
/* 452 */       alarm.call(0);
/* 453 */       if (MainMemory.getI32Aligned(459472) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */         SystemLibrary.fclose(MainMemory.getI32(j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 469 */       if (MainMemory.getI32Aligned(459476) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 479 */         SystemLibrary.fclose(MainMemory.getI32(k));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 485 */       if (MainMemory.getI32Aligned(459484) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 495 */         SystemLibrary.fclose(MainMemory.getI32Aligned(458764));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 501 */       if (MainMemory.getI32Aligned(459480) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 511 */         paramInt2 = MainMemory.getI32(paramInt3);
/* 512 */         i8 = 512000 + paramInt2 * 44;
/* 513 */         free.call(MainMemory.getI32(MainMemory.getI32(i8)));
/* 514 */         MainMemory.setI32(i8, 0);
/* 515 */         MainMemory.setI32(512000 + paramInt2 * 44 + 4, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 521 */       if (MainMemory.getI32Aligned(459488) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 531 */         ftp_compress_open_1517.call(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 537 */       SystemLibrary.signal(14, 0);
/* 538 */       i = 104;
/*     */       
/*     */ 
/*     */       break label1496;
/*     */       
/*     */       label1482:
/*     */       
/* 545 */       ffxmsg.call(5, 74560);
/* 546 */       i = 104;
/*     */       
/*     */ 
/*     */       label1496:
/*     */       
/*     */ 
/* 552 */       return i;
/*     */     }
/*     */     catch (LongJmpException localLongJmpException)
/*     */     {
/*     */       for (;;) {
/* 557 */         i4 = localLongJmpException.getReturnValue();
/*     */       }
/* 559 */       return i;
/*     */     }
/*     */     finally
/*     */     {
/* 563 */       MainMemory.dealloc_generated(i9);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ftp_compress_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */