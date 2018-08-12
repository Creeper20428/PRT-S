/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class ffimem
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2999;
/*  17 */   public static final Function _instance = new ffimem();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffimem() { super("ffimem", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  25 */     return 0;
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
/*  42 */     call(i, j, k, m);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*     */     
/*     */ 
/*  59 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(20);
/*  64 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         MainMemory.setI32(paramInt1, 0);
/*  75 */         if (!MainMemory.getI1(459320)) {
/*     */           break label95;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */         k = MainMemory.getI32(paramInt4);
/*     */         
/*     */         break label111;
/*     */         
/*     */         label95:
/*     */         
/*  91 */         k = fits_init_cfitsio.call();
/*  92 */         MainMemory.setI32(paramInt4, k);
/*     */         
/*     */ 
/*     */ 
/*     */         label111:
/*     */         
/*     */ 
/*     */ 
/* 100 */         if (k <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           SystemLibrary.memcpy(i, 49600, 11, 1);
/* 111 */           n = MainMemory.getI32Aligned(467208) + -1;
/* 112 */           j = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 119 */             k = n - j;
/* 120 */             if (k <= -1) {
/*     */               break label1412;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */             j += 1;
/* 131 */             if (SystemLibrary.strcmp(492288 + k * 84, i) == 0) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */           MainMemory.setI32(paramInt4, 0);
/* 143 */           n = 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       for (;;)
/*     */       {
/* 150 */         if (n >= 300) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         m = 512000 + n * 44;
/* 161 */         if (MainMemory.getI32(m) != 0) {
/*     */           break label1374;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         if (n == -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         MainMemory.setI32(m, paramInt2);
/* 182 */         MainMemory.setI32(512000 + n * 44 + 8, paramInt3);
/* 183 */         MainMemory.setI32(512000 + n * 44 + 16, 0);
/* 184 */         MainMemory.setI64(512000 + n * 44 + 32, MainMemory.getI32(paramInt3) & 0xFFFFFFFF);
/* 185 */         MainMemory.setI64(512000 + n * 44 + 24, 0L);
/* 186 */         MainMemory.setI32(512000 + n * 44 + 20, 0);
/* 187 */         MainMemory.setI32(paramInt4, 0);
/* 188 */         i1 = calloc.call(1, 8);
/* 189 */         MainMemory.setI32(paramInt1, i1);
/* 190 */         if (i1 != 0) {
/*     */           break label463;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 200 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + k * 84 + 56), n);
/* 201 */         ffxmsg.call(5, 123168);
/* 202 */         MainMemory.setI32(paramInt4, 113);
/*     */         
/*     */ 
/*     */         break label1429;
/*     */         
/*     */         label463:
/*     */         
/* 209 */         MainMemory.setI32(i1 + 4, calloc.call(1, 1696));
/* 210 */         i2 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 211 */         if (i2 != 0) {
/*     */           break label560;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + k * 84 + 56), n);
/* 222 */         ffxmsg.call(5, 123168);
/* 223 */         free.call(MainMemory.getI32(paramInt1));
/* 224 */         MainMemory.setI32(paramInt1, 0);
/* 225 */         MainMemory.setI32(paramInt4, 113);
/*     */         
/*     */ 
/*     */         break label1429;
/*     */         
/*     */         label560:
/*     */         
/* 232 */         MainMemory.setI32(i2 + 12, malloc.call(32));
/* 233 */         i2 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 234 */         if (MainMemory.getI32(i2 + 12) != 0) {
/*     */           break label674;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + k * 84 + 56), n);
/* 245 */         ffxmsg.call(5, 112096);
/* 246 */         free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/* 247 */         free.call(MainMemory.getI32(paramInt1));
/* 248 */         MainMemory.setI32(paramInt1, 0);
/* 249 */         MainMemory.setI32(paramInt4, 113);
/*     */         
/*     */ 
/*     */         break label1429;
/*     */         
/*     */         label674:
/*     */         
/* 256 */         MainMemory.setI32(i2 + 84, calloc.call(1001, 8));
/* 257 */         i2 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 258 */         if (MainMemory.getI32(i2 + 84) != 0) {
/*     */           break label809;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */         SystemLibrary.do_indirect(MainMemory.getI32(492288 + k * 84 + 56), n);
/* 269 */         ffxmsg.call(5, 124832);
/* 270 */         free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12));
/* 271 */         free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/* 272 */         free.call(MainMemory.getI32(paramInt1));
/* 273 */         MainMemory.setI32(paramInt1, 0);
/* 274 */         MainMemory.setI32(paramInt4, 113);
/*     */         
/*     */ 
/*     */         break label1429;
/*     */         
/*     */         label809:
/*     */         
/* 281 */         MainMemory.setI32(i2 + 1212, calloc.call(40, 2880));
/* 282 */         i2 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 283 */         if (MainMemory.getI32(i2 + 1212) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 288 */           j = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 295 */           SystemLibrary.do_indirect(MainMemory.getI32(492288 + k * 84 + 56), n);
/* 296 */           ffxmsg.call(5, 123232);
/* 297 */           free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 84));
/* 298 */           free.call(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12));
/* 299 */           free.call(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4));
/* 300 */           free.call(MainMemory.getI32(paramInt1));
/* 301 */           MainMemory.setI32(paramInt1, 0);
/* 302 */           MainMemory.setI32(paramInt4, 113);
/*     */           
/*     */ 
/*     */           break label1429;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 311 */           MainMemory.setI32(i2 + 1536 + (j << 2), j);
/* 312 */           MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 1216 + (j << 2), -1);
/* 313 */           j += 1;
/* 314 */           i2 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 315 */           if (j == 40) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 327 */         MainMemory.setI32(i2 + 80, 1000);
/* 328 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4), n);
/* 329 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 4, k);
/* 330 */         MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12), 28548172593587565L);
/* 331 */         MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 24, MainMemory.getI32(paramInt3) & 0xFFFFFFFF);
/* 332 */         MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 32, MainMemory.getI32(paramInt3) & 0xFFFFFFFF);
/* 333 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 72, 1);
/* 334 */         MainMemory.setI64(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 112, -1L);
/* 335 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 60, -1);
/* 336 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 8, 1);
/* 337 */         MainMemory.setI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 16, 555);
/* 338 */         ffldrc.call(MainMemory.getI32(paramInt1), 0, 1, paramInt4);
/* 339 */         i2 = MainMemory.getI32(MainMemory.getI32(paramInt1) + 4);
/* 340 */         if (MainMemory.getI32(paramInt4) > 0) {
/*     */           break label1364;
/*     */         } else {
/* 343 */           k = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 352 */           i3 = 491008 + (k << 2);
/* 353 */           if (k >= 300) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */           if (MainMemory.getI32(i3) != 0) {
/*     */             break label1348;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */           MainMemory.setI32(i3, i2);
/*     */           
/*     */ 
/*     */           break label1429;
/*     */           
/*     */           label1348:
/*     */           
/* 380 */           k += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label1364:
/*     */         
/*     */ 
/*     */         break label1429;
/*     */         
/*     */ 
/*     */         label1374:
/*     */         
/* 392 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 398 */       MainMemory.setI32(paramInt4, 103);
/* 399 */       ffxmsg.call(5, 114016);
/*     */       
/*     */ 
/*     */       break label1429;
/*     */       
/*     */       label1412:
/*     */       
/* 406 */       MainMemory.setI32(paramInt4, 124);
/* 407 */       ffxmsg.call(5, 131296);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1429:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 418 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffimem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */