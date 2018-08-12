/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffourl extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2993;
/*  11 */   public static final Function _instance = new ffourl();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffourl() { super("ffourl", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  63 */       if (MainMemory.getI32(paramInt6) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */         n = paramInt2 == 0 ? 1 : 0;
/*  74 */         if (n == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */           MainMemory.setI8(paramInt2, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  90 */         i = paramInt3 == 0 ? 1 : 0;
/*  91 */         if (i == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           MainMemory.setI8(paramInt3, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 107 */         j = paramInt4 == 0 ? 1 : 0;
/* 108 */         if (j == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           MainMemory.setI8(paramInt4, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 124 */         k = paramInt5 == 0 ? 1 : 0;
/* 125 */         if (k == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */           MainMemory.setI8(paramInt5, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 141 */         m = MainMemory.getI8(paramInt1);
/* 142 */         if (m == 32) {
/* 143 */           i1 = 0;
/*     */         } else {
/*     */           break label262;
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
/* 156 */           i1 += 1;
/* 157 */           i3 = paramInt1 + i1;
/* 158 */           m = MainMemory.getI8(i3);
/* 159 */           if (m != 32) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         break label262;
/* 164 */         paramInt1 = i3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label262:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 174 */         if (m != 45) {
/*     */           break label336;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         switch (MainMemory.getI8(paramInt1 + 1))
/*     */         {
/*     */         case 0: 
/*     */           break label377;
/*     */           break;
/*     */         case 32: 
/*     */           break label377;
/*     */           break;
/*     */         }
/*     */         
/*     */         label336:
/* 195 */         if (SystemLibrary.strcmp(paramInt1, 33152) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */           if (SystemLibrary.strcmp(paramInt1, 33184) != 0) {
/*     */             break label411;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label377:
/*     */         
/*     */ 
/* 215 */         if (n == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           SystemLibrary.memcpy(paramInt2, 47776, 10, 1);
/*     */           
/*     */ 
/*     */           break label1251;
/*     */           
/*     */           label411:
/*     */           
/* 232 */           i3 = SystemLibrary.strstr(paramInt1, 17696);
/* 233 */           n = paramInt2 != 0 ? 1 : 0;
/* 234 */           if (i3 != 0) {
/*     */             break label495;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */           if (n == 0)
/*     */           {
/*     */ 
/*     */ 
/* 248 */             i3 = paramInt1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 255 */             MainMemory.setI64(paramInt2 + SystemLibrary.strlen(paramInt2), 13281251761613158L);
/* 256 */             i3 = paramInt1;
/*     */             
/*     */             break label591;
/*     */             
/*     */             label495:
/* 261 */             if (n == 0) {
/*     */               break label578;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */             i1 = i3;
/* 272 */             i2 = paramInt1;
/* 273 */             if (i1 - i2 <= 16) {
/*     */               break label560;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */             MainMemory.setI32(paramInt6, 125);
/*     */             
/*     */ 
/*     */             break label1251;
/*     */             
/*     */             label560:
/*     */             
/* 290 */             SystemLibrary.strncat(paramInt2, paramInt1, 3 - i2 + i1);
/*     */             
/*     */ 
/*     */             label578:
/*     */             
/*     */ 
/* 296 */             paramInt1 = i3 + 3;
/* 297 */             i3 = paramInt1;
/*     */           }
/*     */           
/*     */ 
/*     */           label591:
/*     */           
/*     */ 
/* 304 */           i4 = SystemLibrary.strchr(i3, 40);
/* 305 */           paramInt1 = SystemLibrary.strchr(i3, 91);
/* 306 */           if (i == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */             if (i4 != 0) {
/*     */               break label782;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */             if (paramInt1 != 0) {
/*     */               break label719;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */             if (!com.emt.proteus.lib.api.MathUtils.ugt(SystemLibrary.strlen(i3), 1024)) {
/*     */               break label702;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 346 */             MainMemory.setI32(paramInt6, 125);
/*     */             
/*     */ 
/*     */             break label1251;
/*     */             
/*     */             label702:
/*     */             
/* 353 */             SystemLibrary.strcpy(paramInt3, i3);
/*     */             
/*     */             break label841;
/*     */             
/*     */             label719:
/* 358 */             i1 = paramInt1 - i3;
/* 359 */             if (i1 <= 1024) {
/*     */               break label763;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */             MainMemory.setI32(paramInt6, 125);
/*     */             
/*     */ 
/*     */             break label1251;
/*     */             
/*     */             label763:
/*     */             
/* 376 */             SystemLibrary.strncat(paramInt3, i3, i1);
/*     */             
/*     */             break label841;
/*     */             
/*     */             label782:
/* 381 */             i1 = i4 - i3;
/* 382 */             if (i1 <= 1024) {
/*     */               break label827;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */             MainMemory.setI32(paramInt6, 125);
/*     */             
/*     */ 
/*     */             break label1251;
/*     */             
/*     */             label827:
/*     */             
/* 399 */             SystemLibrary.strncat(paramInt3, i3, i1);
/*     */           }
/*     */           
/*     */ 
/*     */           label841:
/*     */           
/* 405 */           if (i4 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 415 */             i3 = i4 + 1;
/* 416 */             i4 = SystemLibrary.strchr(i3, 41);
/* 417 */             if (i4 != 0) {
/*     */               break label906;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */             MainMemory.setI32(paramInt6, 125);
/*     */             
/*     */ 
/*     */             break label1251;
/*     */             
/*     */             label906:
/*     */             
/* 434 */             if (j == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 444 */               i1 = i4 - i3;
/* 445 */               if (i1 <= 1024) {
/*     */                 break label966;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 455 */               MainMemory.setI32(paramInt6, 125);
/*     */               
/*     */ 
/*     */               break label1251;
/*     */               
/*     */               label966:
/*     */               
/* 462 */               SystemLibrary.strncat(paramInt4, i3, i1);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 468 */           if (paramInt1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 478 */             paramInt1 += 1;
/* 479 */             paramInt4 = SystemLibrary.strchr(paramInt1, 93);
/* 480 */             if (paramInt4 != 0) {
/*     */               break label1039;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 490 */             MainMemory.setI32(paramInt6, 125);
/*     */             
/*     */ 
/*     */             break label1251;
/*     */             
/*     */             label1039:
/*     */             
/* 497 */             if (k == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */               i1 = paramInt4 - paramInt1;
/* 508 */               if (i1 <= 1024) {
/*     */                 break label1097;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 518 */               MainMemory.setI32(paramInt6, 125);
/*     */               
/*     */ 
/*     */               break label1251;
/*     */               
/*     */               label1097:
/*     */               
/* 525 */               SystemLibrary.strncat(paramInt5, paramInt1, i1);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 531 */           if ((n == 0) || (paramInt3 == 0)) {
/*     */             break label1246;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 541 */           if (SystemLibrary.strcmp(paramInt2, 40448) != 0) {
/*     */             break label1246;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 551 */           paramInt1 = SystemLibrary.strstr(paramInt3, 17728);
/* 552 */           if (paramInt1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 562 */             switch (MainMemory.getI8(paramInt1 + 3))
/*     */             {
/*     */             case 0: 
/*     */               break;
/*     */             case 32: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 574 */             SystemLibrary.memcpy(paramInt2, 61184, 19, 1);
/*     */             
/*     */ 
/*     */             break label1251;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label1246:
/*     */       
/*     */       label1251:
/*     */       
/* 586 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffourl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */