/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffcalchist extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3458;
/*  11 */   public static final Function _instance = new ffcalchist();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public ffcalchist() { super("ffcalchist", 7, false); }
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
/*  53 */     double d = 0.0D;
/*  54 */     int j = 0;
/*  55 */     float f = 0.0F;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  66 */       if (paramInt3 != 1) {
/*     */         break label126;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(470880, paramInt7, 112, 4);
/*  77 */       MainMemory.setI32Aligned(458856, MainMemory.getI32Aligned(470988));
/*  78 */       MainMemory.setI32Aligned(458860, MainMemory.getI32(paramInt6 + 88));
/*  79 */       paramInt1 = MainMemory.getI32Aligned(470888);
/*  80 */       if (paramInt1 <= 1) {
/*     */         break label113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       ffcalchist_544.call(paramInt1, paramInt6);
/*     */       
/*     */ 
/*     */       label113:
/*     */       
/*     */ 
/*  96 */       ffcalchist_545.call(paramInt5, paramInt1, paramInt6);
/*     */       
/*     */ 
/*     */       label126:
/*     */       
/*     */ 
/* 102 */       if (paramInt4 < 1) {
/*     */         break label1930;
/*     */       } else {
/* 105 */         paramInt2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 114 */         paramInt1 = paramInt2 + 1;
/* 115 */         paramInt2 += 2;
/* 116 */         paramInt7 = MainMemory.getI32Aligned(458856);
/* 117 */         if (paramInt7 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */           MainMemory.setI32Aligned(458856, paramInt7 + 1);
/* 128 */           if (MainMemory.getI8(paramInt7) == 0) {}
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 138 */           f = MainMemory.getF32(MainMemory.getI32Aligned(458860) + (paramInt1 << 2));
/* 139 */           if (!MathUtils.f_oeq(f, -9.119119840596153E-36D))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */             f -= MainMemory.getF32(470928);
/* 150 */             f /= MainMemory.getF32(470960);
/* 151 */             d = f;
/* 152 */             d += 1.0D;
/* 153 */             paramInt5 = (int)d;
/* 154 */             if (paramInt5 >= 1)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */               if (MainMemory.getI32Aligned(470912) >= paramInt5)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */                 if (!MathUtils.f_olt(MainMemory.getF32(470944), f))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */                   paramInt3 = MainMemory.getI32Aligned(470888);
/* 185 */                   if (paramInt3 <= 1)
/*     */                   {
/*     */ 
/*     */ 
/* 189 */                     paramInt3 = paramInt5;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 196 */                     f = MainMemory.getF32(MainMemory.getI32Aligned(458864) + (paramInt1 << 2));
/* 197 */                     if (MathUtils.f_oeq(f, -9.119119840596153E-36D)) {
/*     */                       break label1910;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */                     f -= MainMemory.getF32(470932);
/* 208 */                     f /= MainMemory.getF32(470964);
/* 209 */                     j = (int)f;
/* 210 */                     if (MathUtils.f_olt(f, 0.0D)) {
/*     */                       break label1910;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */                     if (MainMemory.getI32Aligned(470916) <= j) {
/*     */                       break label1910;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */                     if (MathUtils.f_olt(MainMemory.getF32(470948), f)) {
/*     */                       break label1910;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */                     paramInt5 = MainMemory.getI32Aligned(459392) * j + paramInt5;
/* 241 */                     if (paramInt3 <= 2)
/*     */                     {
/*     */ 
/*     */ 
/* 245 */                       paramInt3 = paramInt5;
/*     */ 
/*     */ 
/*     */                     }
/*     */                     else
/*     */                     {
/*     */ 
/* 252 */                       f = MainMemory.getF32(MainMemory.getI32Aligned(458868) + (paramInt1 << 2));
/* 253 */                       if (MathUtils.f_oeq(f, -9.119119840596153E-36D)) {
/*     */                         break label1910;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */                       f -= MainMemory.getF32(470936);
/* 264 */                       f /= MainMemory.getF32(470968);
/* 265 */                       j = (int)f;
/* 266 */                       if (MathUtils.f_olt(f, 0.0D)) {
/*     */                         break label1910;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */                       if (MainMemory.getI32Aligned(470920) <= j) {
/*     */                         break label1910;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */                       if (MathUtils.f_olt(MainMemory.getF32(470952), f)) {
/*     */                         break label1910;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */                       paramInt5 = MainMemory.getI32Aligned(459396) * j + paramInt5;
/* 297 */                       if (paramInt3 <= 3)
/*     */                       {
/*     */ 
/*     */ 
/* 301 */                         paramInt3 = paramInt5;
/*     */ 
/*     */ 
/*     */                       }
/*     */                       else
/*     */                       {
/*     */ 
/* 308 */                         f = MainMemory.getF32(MainMemory.getI32Aligned(458872) + (paramInt1 << 2));
/* 309 */                         if (MathUtils.f_oeq(f, -9.119119840596153E-36D)) {
/*     */                           break label1910;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */                         f -= MainMemory.getF32(470940);
/* 320 */                         f /= MainMemory.getF32(470972);
/* 321 */                         paramInt3 = (int)f;
/* 322 */                         if (MathUtils.f_olt(f, 0.0D)) {
/*     */                           break label1910;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */                         if (MainMemory.getI32Aligned(470924) <= paramInt3) {
/*     */                           break label1910;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 342 */                         if (MathUtils.f_olt(MainMemory.getF32(470956), f)) {
/*     */                           break label1910;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 352 */                         paramInt3 = MainMemory.getI32Aligned(459400) * paramInt3 + paramInt5;
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/* 360 */                   f = MainMemory.getF32(470984);
/* 361 */                   if (!MathUtils.f_une(f, -9.119119840596153E-36D)) {
/*     */                     break label1152;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */                   switch (MainMemory.getI32Aligned(470908)) {
/*     */                   case 31: 
/*     */                     break label1117;
/*     */                     break;
/*     */                   case 21: 
/*     */                     break label1080;
/*     */                     break;
/*     */                   case 42: 
/*     */                     break label1042;
/*     */                     break;
/*     */                   case 82: 
/*     */                     break label999;
/*     */                     break;
/*     */                   case 11:  break; }
/* 385 */                   paramInt7 = MainMemory.getI32Aligned(470880) + paramInt3;
/* 386 */                   MainMemory.setI8(paramInt7, (byte)((byte)(int)f + MainMemory.getI8(paramInt7)));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label999:
/* 391 */                   i2 = MainMemory.getI32Aligned(470880) + (paramInt3 << 3);
/* 392 */                   d = f;
/* 393 */                   d = MainMemory.getF64(i2) + d;
/* 394 */                   MainMemory.setF64(i2, d);
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1042:
/* 399 */                   i1 = MainMemory.getI32Aligned(470880) + (paramInt3 << 2);
/* 400 */                   f = MainMemory.getF32(i1) + f;
/* 401 */                   MainMemory.setF32(i1, f);
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1080:
/* 406 */                   n = MainMemory.getI32Aligned(470880) + (paramInt3 << 1);
/* 407 */                   MainMemory.setI16(n, (short)((short)(int)f + MainMemory.getI16(n)));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1117:
/* 412 */                   m = MainMemory.getI32Aligned(470880) + (paramInt3 << 2);
/* 413 */                   MainMemory.setI32(m, (int)f + MainMemory.getI32(m));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1152:
/* 418 */                   paramInt5 = MainMemory.getI32Aligned(470908);
/* 419 */                   k = paramInt5 == 31 ? 1 : 0;
/* 420 */                   if (MainMemory.getI32Aligned(470976) != 0) {
/*     */                     break label1533;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 430 */                   if (k == 0) {
/*     */                     break label1257;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 440 */                   m = MainMemory.getI32Aligned(470880) + (paramInt3 << 2);
/* 441 */                   MainMemory.setI32(m, (int)MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2)) + MainMemory.getI32(m));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1257:
/* 446 */                   switch (paramInt5) {
/*     */                   case 21: 
/*     */                     break label1486;
/*     */                     break;
/*     */                   case 42: 
/*     */                     break label1438;
/*     */                     break;
/*     */                   case 82: 
/*     */                     break label1385;
/*     */                     break;
/*     */                   case 11: 
/*     */                     break;
/*     */                   }
/* 459 */                   paramInt7 = MainMemory.getI32Aligned(470880) + paramInt3;
/* 460 */                   MainMemory.setI8(paramInt7, (byte)((byte)(int)MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2)) + MainMemory.getI8(paramInt7)));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1385:
/* 465 */                   i2 = MainMemory.getI32Aligned(470880) + (paramInt3 << 3);
/* 466 */                   d = MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2));
/* 467 */                   d = MainMemory.getF64(i2) + d;
/* 468 */                   MainMemory.setF64(i2, d);
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1438:
/* 473 */                   i1 = MainMemory.getI32Aligned(470880) + (paramInt3 << 2);
/* 474 */                   f = MainMemory.getF32(i1) + MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2));
/* 475 */                   MainMemory.setF32(i1, f);
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1486:
/* 480 */                   n = MainMemory.getI32Aligned(470880) + (paramInt3 << 1);
/* 481 */                   MainMemory.setI16(n, (short)((short)(int)MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2)) + MainMemory.getI16(n)));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1533:
/* 486 */                   if (k == 0) {
/*     */                     break label1607;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 496 */                   m = MainMemory.getI32Aligned(470880) + (paramInt3 << 2);
/* 497 */                   d = MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2));
/* 498 */                   d = 1.0D / d;
/* 499 */                   MainMemory.setI32(m, (int)d + MainMemory.getI32(m));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1607:
/* 504 */                   switch (paramInt5) {
/*     */                   case 21: 
/*     */                     break label1857;
/*     */                     break;
/*     */                   case 42: 
/*     */                     break label1803;
/*     */                     break;
/*     */                   case 82: 
/*     */                     break label1744;
/*     */                     break;
/*     */                   case 11: 
/*     */                     break;
/*     */                   }
/* 517 */                   paramInt7 = MainMemory.getI32Aligned(470880) + paramInt3;
/* 518 */                   d = MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2));
/* 519 */                   d = 1.0D / d;
/* 520 */                   MainMemory.setI8(paramInt7, (byte)((byte)(int)d + MainMemory.getI8(paramInt7)));
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1744:
/* 525 */                   i2 = MainMemory.getI32Aligned(470880) + (paramInt3 << 3);
/* 526 */                   d = MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2));
/* 527 */                   d = 1.0D / d;
/* 528 */                   d = MainMemory.getF64(i2) + d;
/* 529 */                   MainMemory.setF64(i2, d);
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1803:
/* 534 */                   i1 = MainMemory.getI32Aligned(470880) + (paramInt3 << 2);
/* 535 */                   f = 1.0F / MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2));
/* 536 */                   f = MainMemory.getF32(i1) + f;
/* 537 */                   MainMemory.setF32(i1, f);
/*     */                   
/*     */                   break label1910;
/*     */                   
/*     */                   label1857:
/* 542 */                   n = MainMemory.getI32Aligned(470880) + (paramInt3 << 1);
/* 543 */                   d = MainMemory.getF32(MainMemory.getI32Aligned(458876) + (paramInt1 << 2));
/* 544 */                   d = 1.0D / d;
/* 545 */                   MainMemory.setI16(n, (short)((short)(int)d + MainMemory.getI16(n)));
/*     */                 } }
/*     */             }
/*     */           }
/*     */         }
/*     */         label1910:
/* 551 */         if (paramInt2 > paramInt4) {
/*     */           break;
/*     */         }
/*     */         
/* 555 */         paramInt2 = paramInt1;
/*     */       }
/*     */       
/*     */ 
/*     */       label1930:
/*     */       
/*     */ 
/* 562 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 568 */       int i3 = i;return i3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcalchist.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */