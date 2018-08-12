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
/*     */ 
/*     */ public final class ftp_file_open
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3105;
/*  20 */   public static final Function _instance = new ftp_file_open();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ftp_file_open() { super("ftp_file_open", 3, false); }
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
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     long l = 0L;
/*  64 */     int i10 = 0;
/*     */     
/*     */ 
/*  67 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       j = MainMemory.alloc(4);
/*  72 */       k = MainMemory.alloc(4);
/*  73 */       m = MainMemory.alloc(1200);
/*  74 */       n = MainMemory.alloc(4);
/*  75 */       i1 = MainMemory.alloc(4);
/*  76 */       if (SystemLibrary.strncmp(489728, 20608, 4) != 0) {
/*     */         break label126;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       i = ftp_open.call(paramInt1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       break label1505;
/*     */       
/*     */       label126:
/*     */       
/*  93 */       MainMemory.setI32Aligned(459472, 0);
/*  94 */       MainMemory.setI32Aligned(459476, 0);
/*  95 */       MainMemory.setI32Aligned(459496, 0);
/*  96 */       MainMemory.setI32Aligned(459500, 0);
/*  97 */       i10 = SystemLibrary.strlen(489728);
/*  98 */       if (i10 != 0) {
/*     */         break label206;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       ffxmsg.call(5, 131552);
/* 109 */       i = 104;
/*     */       
/*     */ 
/*     */ 
/*     */       break label1505;
/*     */       
/*     */ 
/* 116 */       i7 = SystemLibrary._setjmp(471136);
/*     */       label206:
/* 118 */       if (i7 != 0) {
/*     */         break label1351;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */       SystemLibrary.signal(14, 3101);
/* 129 */       alarm.call(180);
/* 130 */       i7 = F273321.call(paramInt1, j, k, n);
/* 131 */       MainMemory.setI32(i1, i7);
/* 132 */       if (i7 != 0) {
/*     */         break label1325;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       MainMemory.setI32Aligned(459472, MainMemory.getI32Aligned(459472) + 1);
/* 143 */       MainMemory.setI32Aligned(459476, MainMemory.getI32Aligned(459476) + 1);
/* 144 */       if (MainMemory.getI8(489728) != 33) {
/*     */         break label408;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */       if (i10 > 0) {
/* 155 */         i7 = 0;
/*     */       } else {
/*     */         break label391;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 166 */         i2 = i7 + 1;
/* 167 */         MainMemory.setI8(489728 + i7, MainMemory.getI8(489728 + i2));
/* 168 */         if (i2 == i10) {
/*     */           break;
/*     */         }
/*     */         
/* 172 */         i7 = i2;
/*     */       }
/*     */       
/*     */ 
/*     */       label391:
/*     */       
/*     */ 
/* 179 */       remove.call(489728);
/* 180 */       MainMemory.setI32(i1, 0);
/*     */       
/*     */ 
/*     */       label408:
/*     */       
/*     */ 
/* 186 */       i3 = MainMemory.getI32(j);
/* 187 */       i4 = (byte)SystemLibrary.fgetc(i3);
/* 188 */       SystemLibrary.ungetc(i4, i3);
/* 189 */       if (SystemLibrary.strstr(paramInt1, 17728) != 0) {
/*     */         break label878;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       if ((SystemLibrary.strstr(paramInt1, 15392) != 0) || (i4 != 31))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */         i10 = file_create.call(489728, paramInt3);
/* 210 */         MainMemory.setI32(i1, i10);
/* 211 */         if (i10 != 0) {
/*     */           break label856;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */         MainMemory.setI32Aligned(459496, MainMemory.getI32Aligned(459496) + 1);
/* 222 */         alarm.call(180);
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 228 */           i10 = SystemLibrary.fread(m, 1, 1200, i3);
/* 229 */           if (i10 != 0) {
/*     */             break label620;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */           j = 503808 + (MainMemory.getI32(paramInt3) << 4);
/* 240 */           if (SystemLibrary.fclose(MainMemory.getI32(j)) != 0) {
/*     */             break label1109;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */           MainMemory.setI32(j, 0);
/*     */           
/*     */           break label1109;
/*     */           
/*     */           label620:
/* 255 */           alarm.call(0);
/* 256 */           i7 = MainMemory.getI32(paramInt3);
/* 257 */           i8 = 503808 + (i7 << 4) + 12;
/* 258 */           if (MainMemory.getI32(i8) != 1) {
/*     */             break label730;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */           i9 = 503808 + (i7 << 4) + 4;
/* 269 */           l = MainMemory.getI64(i9);
/* 270 */           if (SystemLibrary.fseek(MainMemory.getI32(503808 + (i7 << 4)), l, 0) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 274 */             paramInt2 = 116;
/* 275 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 281 */           MainMemory.setI64(i9, l);
/*     */           
/*     */ 
/*     */           label730:
/*     */           
/*     */ 
/* 287 */           if (SystemLibrary.fwrite(m, 1, i10, MainMemory.getI32(503808 + (i7 << 4))) != i10)
/*     */           {
/*     */ 
/*     */ 
/* 291 */             paramInt2 = 106;
/* 292 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 298 */           i9 = 503808 + (i7 << 4) + 4;
/* 299 */           MainMemory.setI64(i9, MainMemory.getI64(i9) + i10);
/* 300 */           MainMemory.setI32(i8, 2);
/* 301 */           MainMemory.setI32(i1, 0);
/* 302 */           alarm.call(180);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 308 */         MainMemory.setI32(i1, paramInt2);
/* 309 */         ffxmsg.call(5, 83168);
/* 310 */         ffxmsg.call(5, paramInt1);
/* 311 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1362;
/*     */         
/*     */         label856:
/* 316 */         ffxmsg.call(5, 103072);
/* 317 */         ffxmsg.call(5, 489728);
/*     */       }
/*     */       else
/*     */       {
/*     */         label878:
/* 322 */         i10 = file_create.call(489728, paramInt3);
/* 323 */         MainMemory.setI32(i1, i10);
/* 324 */         if (i10 != 0) {
/*     */           break label1303;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */         i5 = 503808 + (MainMemory.getI32(paramInt3) << 4);
/* 335 */         if (SystemLibrary.fclose(MainMemory.getI32(i5)) != 0) {
/*     */           break label957;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */         MainMemory.setI32(i5, 0);
/*     */         
/*     */ 
/*     */         label957:
/*     */         
/*     */ 
/* 351 */         i6 = SystemLibrary.fopen(489728, 14176);
/* 352 */         MainMemory.setI32Aligned(458768, i6);
/* 353 */         if (i6 != 0) {
/*     */           break label1014;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */         ffxmsg.call(5, 112544);
/* 364 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1362;
/*     */         
/*     */         label1014:
/* 369 */         MainMemory.setI32Aligned(459500, MainMemory.getI32Aligned(459500) + 1);
/* 370 */         MainMemory.setI32(i1, 0);
/* 371 */         alarm.call(1800);
/* 372 */         i10 = uncompress2file.call(i3, MainMemory.getI32Aligned(458768), i1);
/* 373 */         MainMemory.setI32(i1, i10);
/* 374 */         alarm.call(0);
/* 375 */         if (i10 != 0) {
/*     */           break label1276;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */         SystemLibrary.fclose(MainMemory.getI32Aligned(458768));
/* 386 */         MainMemory.setI32Aligned(459500, MainMemory.getI32Aligned(459500) + -1);
/*     */         
/*     */ 
/*     */         label1109:
/*     */         
/*     */ 
/* 392 */         SystemLibrary.fclose(i3);
/* 393 */         MainMemory.setI32Aligned(459472, MainMemory.getI32Aligned(459472) + -1);
/* 394 */         i10 = MainMemory.getI32(n);
/* 395 */         if (i10 < 0) {
/*     */           break label1225;
/*     */         } else {
/* 398 */           i7 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 407 */           if (i7 >= 5) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */           i2 = send.call(i10, 27072 + i7, 5 - i7, 0);
/* 418 */           if (i2 < 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 428 */           i7 = i2 + i7;
/*     */         }
/*     */         
/*     */ 
/*     */         label1225:
/*     */         
/* 434 */         SystemLibrary.fclose(MainMemory.getI32(k));
/* 435 */         MainMemory.setI32Aligned(459476, MainMemory.getI32Aligned(459476) + -1);
/* 436 */         SystemLibrary.signal(14, 0);
/* 437 */         alarm.call(0);
/* 438 */         i = file_open.call(489728, paramInt2, paramInt3);
/*     */         
/*     */ 
/*     */         break label1505;
/*     */         
/*     */         label1276:
/*     */         
/* 445 */         ffxmsg.call(5, 120224);
/* 446 */         ffxmsg.call(5, paramInt1);
/* 447 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1362;
/*     */         
/*     */         label1303:
/* 452 */         ffxmsg.call(5, 103072);
/* 453 */         ffxmsg.call(5, 489728);
/*     */         
/*     */         break label1362;
/*     */         
/*     */         label1325:
/* 458 */         alarm.call(0);
/* 459 */         ffxmsg.call(5, 94304);
/* 460 */         ffxmsg.call(5, paramInt1);
/*     */         
/*     */         break label1362;
/*     */         
/*     */         label1351:
/* 465 */         ffxmsg.call(5, 62784);
/*     */       }
/*     */       
/*     */ 
/*     */       label1362:
/*     */       
/* 471 */       alarm.call(0);
/* 472 */       if (MainMemory.getI32Aligned(459472) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */         SystemLibrary.fclose(MainMemory.getI32(j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 488 */       if (MainMemory.getI32Aligned(459476) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 498 */         SystemLibrary.fclose(MainMemory.getI32(k));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 504 */       if (MainMemory.getI32Aligned(459500) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */         SystemLibrary.fclose(MainMemory.getI32Aligned(458768));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 520 */       if (MainMemory.getI32Aligned(459496) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 530 */         ftp_file_open_1518.call(paramInt3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 536 */       SystemLibrary.signal(14, 0);
/* 537 */       i = 104;
/*     */       
/*     */ 
/*     */       label1505:
/*     */       
/*     */ 
/* 543 */       return i;
/*     */     }
/*     */     catch (LongJmpException localLongJmpException)
/*     */     {
/*     */       for (;;) {
/* 548 */         i7 = localLongJmpException.getReturnValue();
/*     */       }
/* 550 */       return i;
/*     */     }
/*     */     finally
/*     */     {
/* 554 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ftp_file_open.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */