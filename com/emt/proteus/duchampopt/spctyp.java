/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class spctyp extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2877;
/*  11 */   public static final Function _instance = new spctyp();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public spctyp() { super("spctyp", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i3 = call(i, j, k, m, n, i1, i2);
/*  45 */     paramFrame.setI32(paramInt1, i3);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
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
/*     */     
/*     */ 
/*  65 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       j = MainMemory.alloc(9);
/*  70 */       k = MainMemory.alloc(32);
/*  71 */       m = MainMemory.alloc(8);
/*  72 */       SystemLibrary.sprintf(j, 35680, new Object[] { Integer.valueOf(paramInt1) });
/*  73 */       MainMemory.setI8(j + 8, (byte)0);
/*  74 */       if (SystemLibrary.strncmp(j, 18432, 4) != 0) {
/*     */         break label149;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       SystemLibrary.memcpy(k, 47168, 10, 1);
/*  85 */       SystemLibrary.memcpy(m, 14304, 3, 1);
/*  86 */       n = 70;
/*  87 */       i1 = 0;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label149:
/*  92 */       if (SystemLibrary.strncmp(j, 21152, 4) != 0) {
/*     */         break label212;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       SystemLibrary.memcpy(k, 59712, 18, 1);
/* 103 */       SystemLibrary.memcpy(m, 26912, 6, 1);
/* 104 */       n = 70;
/* 105 */       i1 = 0;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label212:
/* 110 */       if (SystemLibrary.strncmp(j, 21184, 4) != 0) {
/*     */         break label271;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */       SystemLibrary.memcpy(k, 53824, 14, 1);
/* 121 */       MainMemory.setI16(m, (short)74);
/* 122 */       n = 70;
/* 123 */       i1 = 0;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label271:
/* 128 */       if (SystemLibrary.strncmp(j, 21216, 4) != 0) {
/*     */         break label333;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */       SystemLibrary.memcpy(k, 49760, 11, 1);
/* 139 */       SystemLibrary.memcpy(m, 15648, 3, 1);
/* 140 */       n = 70;
/* 141 */       i1 = 0;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label333:
/* 146 */       if (SystemLibrary.strncmp(j, 18560, 4) != 0) {
/*     */         break label392;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       SystemLibrary.memcpy(k, 55200, 15, 1);
/* 157 */       MainMemory.setI32(m, 7548781);
/* 158 */       n = 70;
/* 159 */       i1 = 1;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label392:
/* 164 */       if (SystemLibrary.strncmp(j, 21312, 4) != 0) {
/*     */         break label451;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */       SystemLibrary.memcpy(k, 59776, 18, 1);
/* 175 */       MainMemory.setI16(m, (short)109);
/* 176 */       n = 87;
/* 177 */       i1 = 0;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label451:
/* 182 */       if (SystemLibrary.strncmp(j, 18496, 4) != 0) {
/*     */         break label510;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */       SystemLibrary.memcpy(k, 58656, 17, 1);
/* 193 */       MainMemory.setI32(m, 7548781);
/* 194 */       n = 87;
/* 195 */       i1 = 1;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label510:
/* 200 */       if (SystemLibrary.strncmp(j, 18528, 4) != 0) {
/*     */         break label568;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */       SystemLibrary.memcpy(k, 45472, 9, 1);
/* 211 */       MainMemory.setI8(m, (byte)0);
/* 212 */       n = 87;
/* 213 */       i1 = 1;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label568:
/* 218 */       if (SystemLibrary.strncmp(j, 21376, 4) != 0) {
/*     */         break label627;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 228 */       SystemLibrary.memcpy(k, 55232, 15, 1);
/* 229 */       MainMemory.setI16(m, (short)109);
/* 230 */       n = 65;
/* 231 */       i1 = 0;
/*     */       
/*     */       break label742;
/*     */       
/*     */       label627:
/* 236 */       if (SystemLibrary.strncmp(j, 18464, 4) != 0) {
/*     */         break label686;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */       SystemLibrary.memcpy(k, 65376, 22, 1);
/* 247 */       MainMemory.setI32(m, 7548781);
/* 248 */       n = 86;
/* 249 */       i1 = 0;
/*     */       
/*     */ 
/*     */       label686:
/*     */       
/* 254 */       if (SystemLibrary.strncmp(j, 18592, 4) != 0)
/*     */       {
/*     */ 
/*     */ 
/* 258 */         i1 = 2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 265 */         SystemLibrary.memcpy(k, 64064, 21, 1);
/* 266 */         MainMemory.setI8(m, (byte)0);
/* 267 */         n = 86;
/* 268 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label742:
/*     */         
/*     */ 
/*     */ 
/* 276 */         paramInt1 = j + 5;
/* 277 */         i2 = MainMemory.getI8(paramInt1);
/* 278 */         i3 = j + 4;
/* 279 */         if (i2 != 32) {
/*     */           break label815;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 289 */         if (SystemLibrary.strcmp(i3, 20928) == 0) {
/* 290 */           i2 = n;
/*     */           break label1277;
/*     */         } else {
/* 293 */           i1 = 2;
/*     */           
/*     */           break label1602;
/*     */         }
/*     */         
/*     */         label815:
/*     */         
/* 300 */         if (MainMemory.getI8(i3) != 45)
/*     */         {
/*     */ 
/*     */ 
/* 304 */           i1 = 2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 311 */           i4 = i2 & 0xFF;
/* 312 */           i5 = i4 + -76;
/* 313 */           if (i5 != 0) {
/*     */             break label941;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 324 */           i5 = (MainMemory.getI8(j + 6) & 0xFF) + -79;
/* 325 */           if (i5 != 0) {
/*     */             break label941;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */           i5 = (MainMemory.getI8(j + 7) & 0xFF) + -71;
/* 337 */           if (i5 != 0) {
/*     */             label941:
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
/* 350 */             if (i5 != 0)
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
/* 361 */               i4 += -84;
/* 362 */               if (i4 != 0) {
/*     */                 break label1048;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */               i4 = (MainMemory.getI8(j + 6) & 0xFF) + -65;
/* 374 */               if (i4 != 0) {
/*     */                 break label1048;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */               i4 = (MainMemory.getI8(j + 7) & 0xFF) + -66;
/* 386 */               if (i4 != 0) {
/*     */                 label1048:
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
/* 399 */                 if (i4 != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 410 */                   i6 = MainMemory.getI8(j + 6);
/* 411 */                   if (i2 != 71) {
/*     */                     break label1179;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 421 */                   if (i6 != 82)
/*     */                   {
/*     */ 
/*     */ 
/* 425 */                     i1 = 2;
/*     */                     
/*     */ 
/*     */                     break label1602;
/*     */                   }
/*     */                   
/*     */ 
/* 432 */                   i2 = MainMemory.getI8(j + 7);
/* 433 */                   if (i2 == 73) {
/* 434 */                     i2 = 119;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 444 */                     if (i2 == 65) {
/* 445 */                       i2 = 97;
/*     */                       break label1277;
/*     */                     } else {
/* 448 */                       i1 = 2;
/*     */                       
/*     */                       break label1602;
/*     */                     }
/*     */                     
/*     */                     label1179:
/*     */                     
/* 455 */                     if (i6 != 50)
/*     */                     {
/*     */ 
/*     */ 
/* 459 */                       i1 = 2;
/*     */                       
/*     */ 
/*     */                       break label1602;
/*     */                     }
/*     */                     
/*     */ 
/* 466 */                     i6 = MainMemory.getI8(j + 7);
/* 467 */                     if ((i6 != n) && (i6 != 63))
/*     */                     {
/*     */ 
/*     */ 
/* 471 */                       i1 = 2;
/*     */                       
/*     */ 
/*     */                       break label1602;
/*     */                     }
/*     */                     
/*     */ 
/* 478 */                     if (i6 != i2) {
/*     */                       break label1277;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 489 */                     SystemLibrary.memcpy(i3, 20928, 5, 1);
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */           label1277:
/* 497 */           i4 = i2;
/* 498 */           if (SystemLibrary.memchr(27104, i4, 6) != 0) {
/*     */             break label1402;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 508 */           if (i2 != 86) {
/*     */             break label1369;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 518 */           i4 = i1 | 0x2;
/* 519 */           i1 = SystemLibrary.memchr(27104, n & 0xFF, 6) == 0 ? i1 : i4;
/*     */           
/*     */           break label1425;
/*     */           
/*     */           label1369:
/*     */           
/* 525 */           if (SystemLibrary.memchr(15744, i4, 3) == 0) {
/* 526 */             i1 = 2;
/*     */             
/*     */             break label1602;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label1425;
/*     */           }
/*     */           
/*     */           label1402:
/* 536 */           i1 = n == 86 ? i1 | 0x2 : i1;
/*     */           
/*     */ 
/*     */ 
/*     */           label1425:
/*     */           
/*     */ 
/*     */ 
/* 544 */           if (paramInt2 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 554 */             SystemLibrary.strncpy(paramInt2, j, 4);
/* 555 */             MainMemory.setI8(paramInt2 + 4, (byte)0);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 561 */           if (paramInt3 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 571 */             SystemLibrary.strcpy(paramInt3, paramInt1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 577 */           if (paramInt4 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 587 */             SystemLibrary.strcpy(paramInt4, m);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 593 */           if (paramInt5 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 603 */             MainMemory.setI8(paramInt5, n);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 609 */           if (paramInt6 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 619 */             MainMemory.setI8(paramInt6, i2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 625 */           if (paramInt7 == 0) {
/* 626 */             i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 636 */             MainMemory.setI32(paramInt7, i1);
/* 637 */             i = 0;
/*     */             
/*     */             break label1611;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */       label1602:
/* 645 */       i = i1;
/*     */       
/*     */ 
/*     */       label1611:
/*     */       
/*     */ 
/* 651 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 656 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/spctyp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */