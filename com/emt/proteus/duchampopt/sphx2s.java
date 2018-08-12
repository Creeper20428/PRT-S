/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class sphx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2883;
/*  12 */   public static final com.emt.proteus.runtime.api.Function _instance = new sphx2s();
/*  13 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  15 */   public sphx2s() { super("sphx2s", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, j, k, m, n, i1, i2);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     double d1 = 0.0D;
/*  62 */     double d2 = 0.0D;
/*  63 */     double d3 = 0.0D;
/*  64 */     int i4 = 0;
/*  65 */     int i5 = 0;
/*  66 */     double d4 = 0.0D;
/*  67 */     double d5 = 0.0D;
/*  68 */     int i6 = 0;
/*  69 */     double d6 = 0.0D;
/*  70 */     double d7 = 0.0D;
/*  71 */     boolean bool = false;
/*     */     
/*     */ 
/*  74 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  78 */       i = MainMemory.alloc(8);
/*  79 */       j = MainMemory.alloc(8);
/*  80 */       k = MainMemory.alloc(8);
/*  81 */       m = MainMemory.alloc(8);
/*  82 */       n = paramInt1 + 32;
/*  83 */       if (!MathUtils.f_oeq(MainMemory.getF64(n), 0.0D)) {
/*     */         break label204;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       d1 = MainMemory.getF64(paramInt1);
/*  94 */       if (!MathUtils.f_oeq(MainMemory.getF64(paramInt1 + 8), 0.0D)) {
/*     */         break label179;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       sphx2s_1667.call(paramInt4, paramInt1, paramInt5, d1, paramInt2, paramInt3, paramInt7, paramInt6);
/*     */       
/*     */       break label2172;
/*     */       
/*     */       label179:
/* 109 */       sphx2s_1668.call(paramInt4, paramInt1, paramInt5, d1, paramInt2, paramInt3, paramInt7, paramInt6);
/*     */       
/*     */       break label2172;
/*     */       
/*     */       label204:
/* 114 */       if (paramInt2 <= 0) {
/*     */         break label2172;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       i1 = paramInt1 + 16;
/* 125 */       i3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 132 */         d1 = MainMemory.getF64(paramInt4 + (i3 << 3)) - MainMemory.getF64(i1);
/* 133 */         MainMemory.setF64(paramInt6 + (i3 * paramInt3 << 3), d1);
/* 134 */         i3 += 1;
/* 135 */         if (i3 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */       paramInt4 = paramInt1 + 24;
/* 147 */       i1 = paramInt1 + 8;
/* 148 */       paramInt3 <<= 3;
/* 149 */       i2 = paramInt6;
/* 150 */       paramInt6 = paramInt7;
/* 151 */       i3 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 160 */         paramInt7 = paramInt5 + (i3 << 3);
/* 161 */         d1 = MainMemory.getF64(paramInt7);
/* 162 */         if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */           break label632;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */         d2 = d1 / 90.0D;
/* 173 */         d2 += 0.5D;
/* 174 */         i6 = (int)SystemLibrary.floor(d2);
/* 175 */         switch ((i6 > -1 ? i6 : 0 - i6) & 0x3) {
/*     */         case 0: 
/*     */           break label604;
/*     */           break;
/*     */         case 1: 
/*     */           break label556;
/*     */           break;
/*     */         case 2: 
/*     */           break label524;
/*     */           break;
/*     */         case 3: 
/*     */           break;
/*     */         }
/* 188 */         d1 = MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D;
/* 189 */         MainMemory.setF64(m, d1);
/* 190 */         MainMemory.setF64(j, 0.0D);
/* 191 */         d4 = d1;
/* 192 */         d1 = 0.0D;
/*     */         
/*     */         break label680;
/*     */         
/*     */         label524:
/* 197 */         MainMemory.setF64(m, 0.0D);
/* 198 */         MainMemory.setF64(j, -1.0D);
/* 199 */         d4 = 0.0D;
/* 200 */         d1 = -1.0D;
/*     */         
/*     */         break label680;
/*     */         
/*     */         label556:
/* 205 */         d1 = MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D;
/* 206 */         MainMemory.setF64(m, d1);
/* 207 */         MainMemory.setF64(j, 0.0D);
/* 208 */         d4 = d1;
/* 209 */         d1 = 0.0D;
/*     */         
/*     */         break label680;
/*     */         
/*     */         label604:
/* 214 */         MainMemory.setF64(m, 0.0D);
/* 215 */         MainMemory.setF64(j, 1.0D);
/* 216 */         d4 = 0.0D;
/* 217 */         d1 = 1.0D;
/*     */         
/*     */         break label680;
/*     */         
/*     */         label632:
/* 222 */         d1 *= 3.141592653589793D;
/* 223 */         d1 /= 180.0D;
/* 224 */         SystemLibrary.sincos(d1, m, j);
/* 225 */         d1 = MainMemory.getF64(j);
/* 226 */         d2 = MainMemory.getF64(m);
/* 227 */         d4 = d2;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label680:
/*     */         
/*     */ 
/*     */ 
/* 236 */         d2 = MainMemory.getF64(paramInt4);
/* 237 */         d6 = d2 * d1;
/* 238 */         d7 = MainMemory.getF64(n);
/* 239 */         d1 = d7 * d1;
/* 240 */         d2 *= d4;
/* 241 */         d3 = d7 * d4;
/* 242 */         i4 = paramInt6 + paramInt3;
/* 243 */         i5 = i2 + paramInt3;
/* 244 */         d4 = MainMemory.getF64(i2);
/* 245 */         sincosd.call(d4, k, i);
/* 246 */         d7 = MainMemory.getF64(i);
/* 247 */         d5 = d6 * d7;
/* 248 */         d3 -= d5;
/* 249 */         if (!MathUtils.f_olt(SystemLibrary.fabs(d3), 1.0E-5D))
/*     */         {
/*     */ 
/*     */ 
/* 253 */           d6 = d3;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 260 */           d7 = 1.0D - d7;
/* 261 */           d6 = d7 * d6;
/* 262 */           d7 = MainMemory.getF64(paramInt7) + MainMemory.getF64(i1);
/* 263 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d7, 90.0D), 0.0D)) {
/*     */             break label998;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */           d3 = d7 / 90.0D;
/* 274 */           d3 += 0.5D;
/* 275 */           i6 = (int)SystemLibrary.floor(d3);
/* 276 */           switch ((i6 > -1 ? i6 : 0 - i6) & 0x3) {
/*     */           case 0:  break label985;
/*     */             break; case 1:  d7 = 0.0D;
/*     */             break label1026;
/*     */             break;
/*     */           case 2: 
/*     */             break; case 3:  d7 = 0.0D;
/*     */             
/*     */ 
/*     */             break label1026;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 291 */           d7 = -1.0D;
/*     */           
/*     */           break label1026;
/*     */           
/*     */           label985:
/* 296 */           d7 = 1.0D;
/*     */           
/*     */           break label1026;
/*     */           
/*     */           label998:
/* 301 */           d7 *= 3.141592653589793D;
/* 302 */           d7 /= 180.0D;
/* 303 */           d7 = SystemLibrary.cos(d7);
/*     */           
/*     */ 
/*     */ 
/*     */           label1026:
/*     */           
/*     */ 
/*     */ 
/* 311 */           d6 -= d7;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */         d7 = -0.0D - MainMemory.getF64(j);
/* 320 */         d7 = MainMemory.getF64(k) * d7;
/* 321 */         if ((!MathUtils.f_une(d6, 0.0D)) && (!MathUtils.f_une(d7, 0.0D))) {
/*     */           break label1270;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */         if (!MathUtils.f_oeq(d7, 0.0D)) {
/*     */           break label1169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */         if (!MathUtils.f_ult(d6, 0.0D))
/*     */         {
/*     */ 
/*     */ 
/* 345 */           d3 = 0.0D;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 352 */           if (MathUtils.f_olt(d6, 0.0D)) {
/* 353 */             d3 = 180.0D;
/*     */             
/*     */             break label1328;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label1239;
/*     */           }
/*     */           label1169:
/* 362 */           if (!MathUtils.f_oeq(d6, 0.0D)) {
/*     */             break label1239;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 372 */           if (MathUtils.f_ogt(d7, 0.0D)) {
/* 373 */             d3 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 383 */           else if (MathUtils.f_olt(d7, 0.0D)) {
/* 384 */             d3 = -90.0D;
/*     */           }
/*     */           else
/*     */           {
/*     */             label1239:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 394 */             d3 = SystemLibrary.atan2(d7, d6) * 180.0D;
/* 395 */             d3 /= 3.141592653589793D;
/*     */             
/*     */             break label1328;
/*     */             
/*     */             label1270:
/*     */             
/* 401 */             if (!MathUtils.f_olt(MainMemory.getF64(i1), 90.0D)) {
/*     */               break label1315;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 411 */             d3 = d4 + 180.0D;
/*     */             
/*     */             break label1328;
/*     */             
/*     */             label1315:
/*     */             
/* 417 */             d3 = -0.0D - d4;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label1328:
/*     */         
/*     */ 
/* 425 */         d3 = MainMemory.getF64(paramInt1) + d3;
/* 426 */         MainMemory.setF64(i2, d3);
/* 427 */         if (!MathUtils.f_ult(MainMemory.getF64(paramInt1), 0.0D)) {
/*     */           break label1415;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 437 */         if (!MathUtils.f_ogt(d3, 0.0D)) {
/*     */           break label1457;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */         d3 += -360.0D;
/* 449 */         MainMemory.setF64(i2, d3);
/*     */         
/*     */         break label1457;
/*     */         
/*     */         label1415:
/*     */         
/* 455 */         if (!MathUtils.f_olt(d3, 0.0D)) {
/*     */           break label1457;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 466 */         d3 += 360.0D;
/* 467 */         MainMemory.setF64(i2, d3);
/*     */         
/*     */ 
/*     */ 
/*     */         label1457:
/*     */         
/*     */ 
/*     */ 
/* 475 */         if (!MathUtils.f_ogt(d3, 360.0D)) {
/*     */           break label1506;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */         d3 += -360.0D;
/* 486 */         MainMemory.setF64(i2, d3);
/*     */         
/*     */         break label1518;
/*     */         
/*     */         label1506:
/* 491 */         sphx2s_1671.call(d3, i2);
/*     */         
/*     */ 
/*     */         label1518:
/*     */         
/*     */ 
/* 497 */         if (!MathUtils.f_oeq(SystemLibrary.fmod(d4, 180.0D), 0.0D)) {
/*     */           break label1662;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 507 */         d1 = MainMemory.getF64(i1) * MainMemory.getF64(i);
/* 508 */         d1 = MainMemory.getF64(paramInt7) + d1;
/* 509 */         if (!MathUtils.f_ogt(d1, 90.0D)) {
/*     */           break label1606;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 520 */         d1 = 180.0D - d1;
/*     */         
/*     */ 
/*     */ 
/*     */         label1606:
/*     */         
/*     */ 
/*     */ 
/* 528 */         MainMemory.setF64(paramInt6, d1);
/* 529 */         if (!MathUtils.f_olt(d1, -90.0D)) {
/*     */           break label2135;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 539 */         d1 = -180.0D - d1;
/* 540 */         MainMemory.setF64(paramInt6, d1);
/*     */         
/*     */         break label2135;
/*     */         
/*     */         label1662:
/* 545 */         d1 *= MainMemory.getF64(i);
/* 546 */         d1 += d2;
/* 547 */         if (!MathUtils.f_ogt(SystemLibrary.fabs(d1), 0.99D)) {
/*     */           break label1960;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 557 */         bool = MathUtils.f_olt(d1, 0.0D);
/* 558 */         d1 = d6 * d6;
/* 559 */         d2 = d7 * d7;
/* 560 */         d1 += d2;
/* 561 */         d1 = SystemLibrary.sqrt(d1);
/* 562 */         if (!MathUtils.f_ult(d1, 1.0D)) {
/*     */           break label1849;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 572 */         if (MathUtils.f_oeq(d1, 0.0D)) {
/* 573 */           d1 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 583 */           if (!MathUtils.f_ugt(d1, -1.0D))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 593 */             d2 = d1 + 1.0D;
/* 594 */             if (MathUtils.f_ogt(d2, -1.0E-10D)) {
/* 595 */               d1 = 180.0D;
/*     */               
/*     */               break label1905;
/*     */             }
/*     */             else
/*     */             {
/*     */               break label1881;
/*     */             }
/*     */             label1849:
/* 604 */             d2 = d1 + -1.0D;
/* 605 */             if (MathUtils.f_olt(d2, 1.0E-10D)) {
/* 606 */               d1 = 0.0D;
/*     */               
/*     */ 
/*     */               break label1905;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label1881:
/*     */           
/* 616 */           d1 = SystemLibrary.acos(d1) * 180.0D;
/* 617 */           d1 /= 3.141592653589793D;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1905:
/*     */         
/*     */ 
/* 625 */         d1 = SystemLibrary.fabs(d1);
/* 626 */         if (!bool) {
/*     */           break label1943;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 637 */         d1 = -0.0D - d1;
/*     */         
/*     */ 
/*     */ 
/*     */         label1943:
/*     */         
/*     */ 
/*     */ 
/* 645 */         MainMemory.setF64(paramInt6, d1);
/*     */         
/*     */         break label2135;
/*     */         
/*     */         label1960:
/* 650 */         if (!MathUtils.f_ugt(d1, -1.0D)) {
/*     */           break label2067;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 660 */         if (MathUtils.f_oeq(d1, 0.0D)) {
/* 661 */           d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 671 */           if (!MathUtils.f_ult(d1, 1.0D))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 681 */             d2 = d1 + -1.0D;
/* 682 */             if (MathUtils.f_olt(d2, 1.0E-10D)) {
/* 683 */               d1 = 90.0D;
/*     */               
/*     */               break label2123;
/*     */             }
/*     */             else
/*     */             {
/*     */               break label2099;
/*     */             }
/*     */             label2067:
/* 692 */             d2 = d1 + 1.0D;
/* 693 */             if (MathUtils.f_ogt(d2, -1.0E-10D)) {
/* 694 */               d1 = -90.0D;
/*     */               
/*     */ 
/*     */               break label2123;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label2099:
/*     */           
/* 704 */           d1 = SystemLibrary.asin(d1) * 180.0D;
/* 705 */           d1 /= 3.141592653589793D;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label2123:
/*     */         
/*     */ 
/* 713 */         MainMemory.setF64(paramInt6, d1);
/*     */         
/*     */ 
/*     */         label2135:
/*     */         
/*     */ 
/* 719 */         paramInt6 = i4;
/* 720 */         paramInt7 = i5;
/* 721 */         i3 += 1;
/* 722 */         if (i3 == paramInt2) {
/*     */           break;
/*     */         }
/*     */         
/* 726 */         i2 = paramInt7;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label2172:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 745 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sphx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */