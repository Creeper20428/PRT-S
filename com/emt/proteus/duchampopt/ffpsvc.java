/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp.__strcspn_c1;
/*     */ 
/*     */ public final class ffpsvc extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3236;
/*  15 */   public static final Function _instance = new ffpsvc();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpsvc() { super("ffpsvc", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = call(i, j, k, m);
/*  40 */     paramFrame.setI32(paramInt1, n);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     byte b = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */         MainMemory.setI8(paramInt2, (byte)0);
/*  73 */         j = paramInt3 == 0 ? 1 : 0;
/*  74 */         if (j == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */           MainMemory.setI8(paramInt3, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*  90 */         k = SystemLibrary.strlen(paramInt1);
/*  91 */         b = MainMemory.getI8(paramInt1);
/*  92 */         i1 = b == 72 ? 1 : 0;
/*  93 */         if (i1 == 0) {
/*     */           break label325;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */         if (SystemLibrary.strncmp(paramInt1, 47360, 9) != 0) {
/*     */           break label325;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         m = __strcspn_c1.call(paramInt1, 61);
/* 114 */         if (m != k) {
/*     */           break label309;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         if ((paramInt3 == 0) || (!MathUtils.ugt(k, 8))) {
/*     */           break label1306;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         SystemLibrary.strcpy(paramInt3, paramInt1 + 8);
/* 135 */         k += -9;
/* 136 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 143 */           i2 = k - m;
/* 144 */           paramInt1 = paramInt3 + i2;
/* 145 */           if (i2 <= -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */           if (MainMemory.getI8(paramInt1) != 32) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           MainMemory.setI8(paramInt1, (byte)0);
/* 166 */           m += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label309:
/*     */         
/* 172 */         m += 1;
/*     */         
/*     */ 
/*     */         label325:
/*     */         
/*     */ 
/* 178 */         if (!MathUtils.ult(k, 9))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           if (b != 67) {
/*     */             break label386;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */           if (SystemLibrary.strncmp(paramInt1, 44000, 8) != 0)
/*     */           {
/*     */             label386:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */             if (i1 == 0) {
/*     */               break label425;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */             if (SystemLibrary.strncmp(paramInt1, 44032, 8) != 0)
/*     */             {
/*     */               label425:
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */               switch (b)
/*     */               {
/*     */               case 69: 
/*     */                 break;
/*     */               case 32: 
/*     */                 break label517;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 239 */               if (SystemLibrary.strncmp(paramInt1, 44064, 8) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */                 if (b != 32) {
/*     */                   break label538;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label517:
/*     */                 
/*     */ 
/*     */ 
/* 259 */                 if (SystemLibrary.strncmp(paramInt1, 43584, 8) != 0)
/*     */                 {
/*     */                   label538:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */                   n = paramInt1 + 8;
/* 270 */                   if (MainMemory.getI8(n) != 61) {
/*     */                     break label1181;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */                   if (SystemLibrary.strncmp(n, 15072, 2) == 0) {
/* 281 */                     m = 10;
/*     */                   } else {
/*     */                     break label1181;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */                   m = com.emt.proteus.runtime.library.cpp.__strspn_c1.call(paramInt1 + m, 32) + m;
/* 293 */                   if (m == k) {
/*     */                     break label1306;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 303 */                   n = paramInt1 + m;
/* 304 */                   b = MainMemory.getI8(n);
/* 305 */                   switch (b)
/*     */                   {
/*     */                   case 47: 
/*     */                     break label1093;
/*     */                     break;
/*     */                   case 39: 
/*     */                     break label804;
/*     */                     break;
/*     */                   case 40: 
/*     */                     break;
/*     */                   }
/*     */                   
/* 317 */                   k = __strcspn_c1.call(n, 41);
/* 318 */                   if (SystemLibrary.strlen(n) != k) {
/*     */                     break label764;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */                   ffxmsg.call(5, 106272);
/* 329 */                   ffxmsg.call(5, paramInt1);
/* 330 */                   MainMemory.setI32(paramInt4, 205);
/*     */                   
/*     */                   break label1306;
/*     */                   
/*     */                   label764:
/* 335 */                   k += 1;
/* 336 */                   SystemLibrary.strncpy(paramInt2, n, k);
/* 337 */                   MainMemory.setI8(paramInt2 + k, (byte)0);
/* 338 */                   k += m;
/*     */                   
/*     */                   break label1149;
/*     */                   
/*     */                   label804:
/*     */                   
/* 344 */                   MainMemory.setI8(paramInt2, b);
/* 345 */                   i2 = 1;
/* 346 */                   i3 = m;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 354 */                     i4 = i3 + 1;
/* 355 */                     if (!MathUtils.ult(i4, k)) {
/*     */                       break;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */                     b = MainMemory.getI8(paramInt1 + i4);
/* 366 */                     if (b != 39)
/*     */                     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */                       m = i4;
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/* 379 */                       m = i3 + 2;
/* 380 */                       n = paramInt1 + m;
/* 381 */                       i1 = MainMemory.getI8(n) == 39 ? 1 : 0;
/* 382 */                       MainMemory.setI8(paramInt2 + i2, b);
/* 383 */                       if (i1 == 0) {
/*     */                         break;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */                       i2 += 1;
/* 394 */                       b = MainMemory.getI8(n);
/*     */                     }
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
/* 406 */                     MainMemory.setI8(paramInt2 + i2, b);
/* 407 */                     i2 += 1;
/*     */                     
/* 409 */                     i3 = m;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/* 414 */                   if (i4 != k) {
/*     */                     break label1067;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */                   k = i2 > 69 ? 69 : i2;
/* 425 */                   MainMemory.setI8(paramInt2 + k, (byte)39);
/* 426 */                   MainMemory.setI8(paramInt2 + (k + 1), (byte)0);
/* 427 */                   ffxmsg.call(5, 108192);
/* 428 */                   ffxmsg.call(5, paramInt1);
/* 429 */                   k = i4;
/*     */                   
/*     */                   break label1149;
/*     */                   
/*     */                   label1067:
/* 434 */                   MainMemory.setI8(paramInt2 + (i2 + 1), (byte)0);
/* 435 */                   k = i3 + 2;
/*     */                   
/*     */                   break label1149;
/*     */                   
/*     */                   label1093:
/*     */                   
/* 441 */                   k = m + 1;
/*     */                   
/*     */ 
/*     */                   break label1149;
/*     */                   
/*     */ 
/* 447 */                   k = com.emt.proteus.runtime.library.cpp.__strcspn_c2.call(n, 32, 47);
/* 448 */                   SystemLibrary.strncpy(paramInt2, n, k);
/* 449 */                   MainMemory.setI8(paramInt2 + k, (byte)0);
/* 450 */                   k += m;
/*     */                   
/*     */ 
/*     */ 
/*     */                   label1149:
/*     */                   
/*     */ 
/*     */ 
/* 458 */                   if (j != 0) {
/*     */                     break label1306;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 468 */                   ffpsvc_1387.call(k, paramInt1, paramInt3);
/*     */                   break label1306;
/*     */                 }
/*     */               } } } }
/*     */         label1181:
/* 473 */         if ((paramInt3 == 0) || (!MathUtils.ugt(k, 8))) {
/*     */           break label1306;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 483 */         SystemLibrary.strcpy(paramInt3, paramInt1 + 8);
/* 484 */         k += -9;
/* 485 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 492 */           i2 = k - m;
/* 493 */           paramInt1 = paramInt3 + i2;
/* 494 */           if (i2 <= -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 504 */           if (MainMemory.getI8(paramInt1) != 32) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 514 */           MainMemory.setI8(paramInt1, (byte)0);
/* 515 */           m += 1;
/*     */         }
/*     */       }
/*     */       
/*     */       label1306:
/*     */       
/* 521 */       i = MainMemory.getI32(paramInt4);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpsvc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */