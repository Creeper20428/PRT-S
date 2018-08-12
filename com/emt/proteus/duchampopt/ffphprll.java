/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
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
/*     */ public final class ffphprll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3587;
/*  19 */   public static final Function _instance = new ffphprll();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ffphprll() { super("ffphprll", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  26 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  27 */     return 0;
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
/*  41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i, j, k, m, n);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*  64 */     long l = 0L;
/*  65 */     double d = 0.0D;
/*  66 */     int i6 = 0;
/*  67 */     int i7 = 0;
/*     */     
/*     */ 
/*  70 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       i = MainMemory.alloc(71);
/*  75 */       j = MainMemory.alloc(81);
/*  76 */       k = MainMemory.alloc(80);
/*  77 */       m = MainMemory.alloc(72);
/*  78 */       n = MainMemory.alloc(73);
/*  79 */       i1 = MainMemory.alloc(81);
/*  80 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         i6 = MainMemory.getI32(paramInt1);
/*  91 */         i2 = paramInt1 + 4;
/*  92 */         i3 = MainMemory.getI32(i2);
/*  93 */         i4 = MainMemory.getI32(i3 + 64);
/*  94 */         if (i6 == i4) {
/*  95 */           i6 = i4;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 106 */           ffmahd.call(paramInt1, i6 + 1, 0, paramInt5);
/* 107 */           i3 = MainMemory.getI32(i2);
/* 108 */           i6 = MainMemory.getI32(i3 + 64);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         if (MainMemory.getI64(i3 + 88) != MainMemory.getI64(MainMemory.getI32(i3 + 84) + (i6 << 3))) {
/*     */           break label1607;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         if (paramInt3 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */           if (MainMemory.getI32(i3 + 964) != 0) {
/*     */             break label1522;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         if (i6 != 0) {
/*     */           break label310;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         ffphprll_1373.call(i, n, j, paramInt5, paramInt1);
/*     */         
/*     */         break label327;
/*     */         
/*     */         label310:
/* 163 */         ffphprll_1374.call(i, n, j, paramInt5, paramInt1);
/*     */         
/*     */ 
/*     */         label327:
/*     */         
/*     */ 
/* 169 */         switch (paramInt2) {
/* 170 */         case 20:  i6 = 16;
/*     */           
/*     */ 
/*     */           break label521;
/*     */           
/*     */           break;
/*     */         case 40: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 181 */         i6 = 32;
/*     */         
/*     */ 
/*     */         break label521;
/*     */         
/* 186 */         if (paramInt2 == 10) {
/* 187 */           i6 = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 197 */           switch (paramInt2) {
/* 198 */           case 8:  i6 = paramInt2;
/*     */             
/* 200 */             break;
/* 201 */           case 16:  i6 = paramInt2;
/*     */             
/* 203 */             break;
/* 204 */           case 32:  i6 = paramInt2;
/*     */             
/* 206 */             break;
/* 207 */           case 64:  i6 = paramInt2;
/*     */             
/* 209 */             break;
/* 210 */           case -64:  i6 = paramInt2;
/*     */             
/* 212 */             break;
/* 213 */           case -32:  i6 = paramInt2;
/*     */             
/* 215 */             break;
/*     */           }
/*     */           
/*     */         }
/*     */         
/*     */ 
/*     */         label521:
/*     */         
/*     */ 
/* 224 */         SystemLibrary.memcpy(n, 74976, 30, 1);
/* 225 */         if (ffpkyj.call(paramInt1, 28224, i6, n, paramInt5) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */           if (!MathUtils.ugt(paramInt3, 999)) {
/*     */             break label624;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */           SystemLibrary.sprintf(i1, 85536, new Object[] { Integer.valueOf(paramInt3) });
/* 246 */           ffxmsg.call(5, i1);
/* 247 */           MainMemory.setI32(paramInt5, 212);
/*     */           
/*     */ 
/*     */           break label1620;
/*     */           
/*     */           label624:
/*     */           
/* 254 */           SystemLibrary.memcpy(n, 62496, 20, 1);
/* 255 */           ffpkyj.call(paramInt1, 24224, paramInt3, n, paramInt5);
/* 256 */           SystemLibrary.memcpy(n, 63936, 21, 1);
/* 257 */           i5 = n + 20;
/* 258 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 265 */             i6 = i4 + 1;
/* 266 */             i7 = paramInt4 + (i4 << 3);
/* 267 */             if (i4 >= paramInt3) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */             l = MainMemory.getI64(i7);
/* 278 */             if (l >= 0L) {
/*     */               break label790;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */             d = l;
/* 289 */             SystemLibrary.sprintf(i1, 111648, new Object[] { Integer.valueOf(i6), Double.valueOf(d) });
/* 290 */             ffxmsg.call(5, i1);
/* 291 */             MainMemory.setI32(paramInt5, 213);
/*     */             
/*     */ 
/*     */             break label1620;
/*     */             
/*     */             label790:
/*     */             
/* 298 */             SystemLibrary.sprintf(i5, 15680, new Object[] { Integer.valueOf(i6) });
/* 299 */             ffkeyn.call(24224, i6, m, paramInt5);
/* 300 */             ffpkyj.call(paramInt1, m, MainMemory.getI64(i7), n, paramInt5);
/* 301 */             i4 = i6;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 306 */           if (MainMemory.getI32(MainMemory.getI32(i2) + 64) != 0) {
/*     */             break label970;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */           SystemLibrary.memcpy(n, 85600, 36, 1);
/* 317 */           if (MainMemory.getI32(paramInt5) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */             MainMemory.setI16(i, (short)84);
/* 328 */             ffmkky.call(34624, i, n, j, paramInt5);
/* 329 */             ffprec.call(paramInt1, j, paramInt5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 335 */           ffprec.call(paramInt1, 144192, paramInt5);
/* 336 */           ffprec.call(paramInt1, 143808, paramInt5);
/*     */           
/*     */           break label987;
/*     */           
/*     */           label970:
/* 341 */           ffphprll_1372.call(i, n, j, paramInt5, paramInt1);
/*     */           
/*     */ 
/*     */           label987:
/*     */           
/*     */ 
/* 347 */           switch (paramInt2)
/*     */           {
/*     */           case 20: 
/*     */             break label1330;
/*     */             break;
/*     */           case 40: 
/*     */             break label1191;
/*     */             break;
/*     */           case 10: 
/*     */             break;
/*     */           }
/*     */           
/* 359 */           SystemLibrary.memcpy(n, 93856, 41, 1);
/* 360 */           paramInt2 = MainMemory.getI32(paramInt5);
/* 361 */           if (paramInt2 <= 0)
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
/* 372 */             ffd2f.call(-128.0D, i, paramInt5);
/* 373 */             ffmkky.call(24096, i, n, j, paramInt5);
/* 374 */             ffprec.call(paramInt1, j, paramInt5);
/* 375 */             paramInt2 = MainMemory.getI32(paramInt5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 383 */           SystemLibrary.memcpy(n, 66752, 23, 1);
/* 384 */           if (paramInt2 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 394 */             ffd2f.call(1.0D, i, paramInt5);
/* 395 */             ffmkky.call(28256, i, n, j, paramInt5);
/* 396 */             ffprec.call(paramInt1, j, paramInt5);
/*     */             
/*     */ 
/*     */             break label1620;
/*     */             
/*     */             label1191:
/*     */             
/* 403 */             SystemLibrary.memcpy(n, 98208, 43, 1);
/* 404 */             paramInt2 = MainMemory.getI32(paramInt5);
/* 405 */             if (paramInt2 <= 0)
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
/* 416 */               ffd2f.call(2.147483648E9D, i, paramInt5);
/* 417 */               ffmkky.call(24096, i, n, j, paramInt5);
/* 418 */               ffprec.call(paramInt1, j, paramInt5);
/* 419 */               paramInt2 = MainMemory.getI32(paramInt5);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */             SystemLibrary.memcpy(n, 66752, 23, 1);
/* 428 */             if (paramInt2 <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 438 */               ffd2f.call(1.0D, i, paramInt5);
/* 439 */               ffmkky.call(28256, i, n, j, paramInt5);
/* 440 */               ffprec.call(paramInt1, j, paramInt5);
/*     */               
/*     */ 
/*     */               break label1620;
/*     */               
/*     */               label1330:
/*     */               
/* 447 */               SystemLibrary.memcpy(n, 100320, 44, 1);
/* 448 */               paramInt2 = MainMemory.getI32(paramInt5);
/* 449 */               if (paramInt2 <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */                 ffd2f.call(32768.0D, i, paramInt5);
/* 461 */                 ffmkky.call(24096, i, n, j, paramInt5);
/* 462 */                 ffprec.call(paramInt1, j, paramInt5);
/* 463 */                 paramInt2 = MainMemory.getI32(paramInt5);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 471 */               SystemLibrary.memcpy(n, 66752, 23, 1);
/* 472 */               if (paramInt2 <= 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 482 */                 ffd2f.call(1.0D, i, paramInt5);
/* 483 */                 ffmkky.call(28256, i, n, j, paramInt5);
/* 484 */                 ffprec.call(paramInt1, j, paramInt5);
/*     */                 
/*     */ 
/*     */                 break label1620;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       break label1620;
/*     */       
/* 497 */       SystemLibrary.sprintf(i1, 86880, new Object[] { Integer.valueOf(paramInt2) });
/* 498 */       ffxmsg.call(5, i1);
/* 499 */       MainMemory.setI32(paramInt5, 211);
/*     */       
/*     */ 
/*     */       break label1620;
/*     */       
/*     */       label1522:
/*     */       
/* 506 */       if (paramInt3 > 0) {
/* 507 */         i6 = 0;
/*     */       } else {
/*     */         break label1587;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 518 */         MainMemory.setI32(k + (i6 << 2), (int)MainMemory.getI64(paramInt4 + (i6 << 3)));
/* 519 */         i6 += 1;
/* 520 */         if (i6 == paramInt3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1587:
/*     */       
/*     */ 
/*     */ 
/* 531 */       imcomp_init_table.call(paramInt1, paramInt2, paramInt3, k, paramInt5);
/*     */       
/*     */ 
/*     */       break label1620;
/*     */       
/*     */       label1607:
/*     */       
/* 538 */       MainMemory.setI32(paramInt5, 201);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1620:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 549 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffphprll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */