/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class F304879 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3191;
/*  14 */   public static final Function _instance = new F304879();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F304879() { super("F304879", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i3 = call(i, j, k, m, n, i1, i2);
/*  48 */     paramFrame.setI32(paramInt1, i3);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  54 */     int i = 0;
/*     */     
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     int n = 0;
/*  60 */     int i1 = 0;
/*  61 */     int i2 = 0;
/*  62 */     int i3 = 0;
/*  63 */     int i4 = 0;
/*  64 */     int i5 = 0;
/*  65 */     int i6 = 0;
/*  66 */     int i7 = 0;
/*     */     
/*     */ 
/*  69 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       j = MainMemory.alloc(80);
/*  74 */       k = MainMemory.alloc(20);
/*  75 */       if ((paramInt3 | paramInt1) < 0) {
/*  76 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  86 */       else if ((paramInt5 | paramInt4) < 0) {
/*  87 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  97 */       else if ((paramInt7 | paramInt6) < 0) {
/*  98 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 108 */         i1 = MainMemory.getI32Aligned(470792);
/* 109 */         if (MainMemory.getI32(i1 + paramInt1 * 344) != 64536)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */           if (MainMemory.getI32(i1 + paramInt1 * 344 + 56) != 1) {
/*     */             break label249;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         if (MainMemory.getI32Aligned(470852) != 0) {
/*     */           break label211;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         MainMemory.setI32Aligned(470852, 431);
/*     */         
/*     */ 
/*     */         label211:
/*     */         
/*     */ 
/* 145 */         SystemLibrary.strncpy(j, 72960, 80);
/* 146 */         MainMemory.setI8(j + 79, (byte)0);
/* 147 */         ffxmsg.call(5, j);
/* 148 */         i = -1;
/*     */         
/*     */ 
/*     */         break label1619;
/*     */         
/*     */         label249:
/*     */         
/* 155 */         i2 = MainMemory.getI32Aligned(470796);
/* 156 */         m = MainMemory.getI32Aligned(470800);
/* 157 */         if (i2 != m) {
/*     */           break label413;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */         if (i1 != 0) {
/*     */           break label325;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */         MainMemory.setI32Aligned(470800, 100);
/* 180 */         n = malloc.call(34400);
/*     */         
/*     */         break label352;
/*     */         
/*     */         label325:
/*     */         
/* 186 */         MainMemory.setI32Aligned(470800, m << 1);
/* 187 */         n = com.emt.proteus.runtime.library.c.realloc.call(i1, m * 688);
/*     */         
/*     */ 
/*     */ 
/*     */         label352:
/*     */         
/*     */ 
/*     */ 
/* 195 */         if (n != 0) {
/*     */           break label390;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */         MainMemory.setI32Aligned(470852, 113);
/* 206 */         i = -1;
/*     */         
/*     */ 
/*     */         break label1619;
/*     */         
/*     */         label390:
/*     */         
/* 213 */         i1 = n;
/* 214 */         MainMemory.setI32Aligned(470792, i1);
/* 215 */         i2 = MainMemory.getI32Aligned(470796);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label413:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 225 */         MainMemory.setI32Aligned(470796, i2 + 1);
/* 226 */         if (i2 <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 230 */           paramInt1 = i2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 237 */           i3 = i1 + i2 * 344;
/* 238 */           MainMemory.setI32(i1 + i2 * 344 + 8, paramInt2 + 1);
/* 239 */           i4 = MainMemory.getI32Aligned(470792);
/* 240 */           MainMemory.setI32(i1 + i2 * 344 + 12, paramInt1);
/* 241 */           i5 = MainMemory.getI32Aligned(470792);
/* 242 */           MainMemory.setI32(i1 + i2 * 344 + 12 + 4, paramInt3);
/* 243 */           MainMemory.setI32(k, i5 + paramInt3 * 344);
/* 244 */           i5 = MainMemory.getI32Aligned(470792);
/* 245 */           MainMemory.setI32(i1 + i2 * 344 + 12 + 8, paramInt4);
/* 246 */           MainMemory.setI32(k + 4, i5 + paramInt4 * 344);
/* 247 */           i5 = MainMemory.getI32Aligned(470792);
/* 248 */           MainMemory.setI32(i1 + i2 * 344 + 12 + 12, paramInt5);
/* 249 */           MainMemory.setI32(k + 8, i5 + paramInt5 * 344);
/* 250 */           i5 = MainMemory.getI32Aligned(470792);
/* 251 */           MainMemory.setI32(i1 + i2 * 344 + 12 + 16, paramInt6);
/* 252 */           MainMemory.setI32(k + 12, i5 + paramInt6 * 344);
/* 253 */           i5 = MainMemory.getI32Aligned(470792);
/* 254 */           MainMemory.setI32(i1 + i2 * 344 + 12 + 20, paramInt7);
/* 255 */           MainMemory.setI32(k + 16, i5 + paramInt7 * 344);
/* 256 */           paramInt3 = MainMemory.getI32(i4 + paramInt1 * 344) == 64536 ? 1 : 0;
/* 257 */           if (paramInt2 > 0)
/*     */           {
/* 259 */             paramInt4 = 0;
/*     */           } else {
/*     */             break label822;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 272 */             if (paramInt3 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */               if (MainMemory.getI32(MainMemory.getI32(k + (paramInt4 << 2))) == 64536) {
/* 283 */                 paramInt3 = 1;
/*     */                 
/*     */ 
/*     */ 
/*     */                 break label800;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 293 */             paramInt3 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */             label800:
/*     */             
/*     */ 
/* 300 */             paramInt4 += 1;
/* 301 */             if (paramInt4 == paramInt2) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label822:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 315 */           paramInt4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 322 */             if (paramInt4 >= paramInt2) {
/*     */               break label1134;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */             i5 = MainMemory.getI32(k + (paramInt4 << 2));
/* 333 */             if (MainMemory.getI32(i5 + 56) <= 1) {
/*     */               break label988;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */             paramInt1 = MainMemory.getI32Aligned(470796);
/* 344 */             if (paramInt1 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */               MainMemory.setI32Aligned(470796, paramInt1 + -1);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 360 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*     */               break label950;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 370 */             MainMemory.setI32Aligned(470852, 431);
/*     */             
/*     */ 
/*     */             label950:
/*     */             
/*     */ 
/* 376 */             SystemLibrary.strncpy(j, 89184, 80);
/* 377 */             MainMemory.setI8(j + 79, (byte)0);
/* 378 */             ffxmsg.call(5, j);
/* 379 */             i = -1;
/*     */             
/*     */ 
/*     */             break label1619;
/*     */             
/*     */             label988:
/*     */             
/* 386 */             if (MainMemory.getI32(i5 + 52) != 259) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */             paramInt4 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 402 */           paramInt1 = MainMemory.getI32Aligned(470796);
/* 403 */           if (paramInt1 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 413 */             MainMemory.setI32Aligned(470796, paramInt1 + -1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 419 */           if (MainMemory.getI32Aligned(470852) != 0) {
/*     */             break label1096;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */           MainMemory.setI32Aligned(470852, 431);
/*     */           
/*     */ 
/*     */           label1096:
/*     */           
/*     */ 
/* 435 */           SystemLibrary.strncpy(j, 85664, 80);
/* 436 */           MainMemory.setI8(j + 79, (byte)0);
/* 437 */           ffxmsg.call(5, j);
/* 438 */           i = -1;
/*     */           
/*     */ 
/*     */           break label1619;
/*     */           
/*     */           label1134:
/*     */           
/* 445 */           MainMemory.setI32(i1 + i2 * 344, 91);
/* 446 */           i6 = i1 + i2 * 344 + 4;
/* 447 */           MainMemory.setI32(i6, 3192);
/* 448 */           MainMemory.setI32(i1 + i2 * 344 + 52, MainMemory.getI32(i4 + paramInt1 * 344 + 52));
/* 449 */           paramInt4 = MainMemory.getI32(i4 + paramInt1 * 344 + 56 + 4);
/* 450 */           if (paramInt4 != paramInt2) {
/*     */             break label1296;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 460 */           MainMemory.setI32(i1 + i2 * 344 + 56, 1);
/* 461 */           MainMemory.setI32(i1 + i2 * 344 + 56 + 4, 1);
/* 462 */           MainMemory.setI32(i1 + i2 * 344 + 56 + 8, 1);
/*     */           
/*     */           break label1464;
/*     */           
/*     */           label1296:
/* 467 */           if (paramInt2 != 1) {
/*     */             break label1506;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 477 */           paramInt2 = paramInt4 + -1;
/* 478 */           i7 = i1 + i2 * 344 + 56 + 4;
/* 479 */           MainMemory.setI32(i7, paramInt2);
/* 480 */           if (paramInt2 > 0) {
/* 481 */             paramInt2 = 1;
/* 482 */             paramInt4 = 0;
/*     */           }
/*     */           else
/*     */           {
/* 486 */             paramInt1 = 1;
/*     */             
/*     */ 
/*     */             break label1443;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 495 */             paramInt5 = MainMemory.getI32(i4 + paramInt1 * 344 + 56 + 8 + (paramInt4 << 2));
/* 496 */             MainMemory.setI32(i1 + i2 * 344 + 56 + 8 + (paramInt4 << 2), paramInt5);
/* 497 */             paramInt2 = paramInt5 * paramInt2;
/* 498 */             paramInt4 += 1;
/* 499 */             if (MainMemory.getI32(i7) <= paramInt4) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           break label1443;
/* 504 */           paramInt1 = paramInt2;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1443:
/*     */           
/*     */ 
/*     */ 
/* 513 */           MainMemory.setI32(i1 + i2 * 344 + 56, paramInt1);
/*     */           
/*     */ 
/*     */           label1464:
/*     */           
/*     */ 
/* 519 */           if (paramInt3 == 0) {
/* 520 */             paramInt1 = i2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 530 */             SystemLibrary.do_indirect(MainMemory.getI32(i6), i3);
/* 531 */             i = i2;
/*     */             
/*     */ 
/*     */             break label1619;
/*     */             
/*     */             label1506:
/*     */             
/* 538 */             paramInt1 = MainMemory.getI32Aligned(470796);
/* 539 */             if (paramInt1 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 549 */               MainMemory.setI32Aligned(470796, paramInt1 + -1);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 555 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*     */               break label1573;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 565 */             MainMemory.setI32Aligned(470852, 431);
/*     */             
/*     */ 
/*     */             label1573:
/*     */             
/*     */ 
/* 571 */             SystemLibrary.strncpy(j, 110560, 80);
/* 572 */             MainMemory.setI8(j + 79, (byte)0);
/* 573 */             ffxmsg.call(5, j);
/* 574 */             i = -1;
/*     */             
/*     */ 
/*     */             break label1619;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 582 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label1619:
/*     */       
/*     */ 
/* 588 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 593 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F304879.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */