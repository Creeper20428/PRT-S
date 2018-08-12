/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp6Column12getLogColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 921;
/*  16 */   public static final Function _instance = new _ZN7duchamp6Column12getLogColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp6Column12getLogColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE() { super("_ZN7duchamp6Column12getLogColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3);
/*  24 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*     */     
/*     */ 
/*  54 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       i = MainMemory.alloc(12);
/*  59 */       j = MainMemory.alloc(12);
/*  60 */       MainMemory.setI32(paramInt1, 0);
/*  61 */       k = paramInt1 + 4;
/*  62 */       MainMemory.setI32(k, 0);
/*  63 */       m = paramInt1 + 8;
/*  64 */       MainMemory.setI32(m, 0);
/*  65 */       MainMemory.setI32(j, 0);
/*  66 */       MainMemory.setI32(j + 4, 0);
/*  67 */       MainMemory.setI32(j + 8, 0);
/*  68 */       _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE.call(i, paramInt2, paramInt3);
/*  69 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_.call(j, i);
/*  70 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(i);
/*  71 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, 0, MainMemory.getI32(j));
/*  72 */       n = MainMemory.getI32(k);
/*  73 */       i2 = MainMemory.getI32(m);
/*  74 */       i1 = MainMemory.getI32(j) + 48;
/*  75 */       if (n != i2) {
/*     */         break label191;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/*  86 */       n = MainMemory.getI32(k);
/*  87 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label237;
/*     */       
/*     */       label191:
/*     */       
/*  94 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 110 */       n += 24;
/* 111 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label237:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 121 */       i1 = MainMemory.getI32(j) + 72;
/* 122 */       if (n != i2) {
/*     */         break label299;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 133 */       n = MainMemory.getI32(k);
/* 134 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label345;
/*     */       
/*     */       label299:
/*     */       
/* 141 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 157 */       n += 24;
/* 158 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label345:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 168 */       i1 = MainMemory.getI32(j) + 96;
/* 169 */       if (n != i2) {
/*     */         break label407;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 179 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 180 */       n = MainMemory.getI32(k);
/* 181 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label453;
/*     */       
/*     */       label407:
/*     */       
/* 188 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 204 */       n += 24;
/* 205 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label453:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 215 */       i1 = MainMemory.getI32(j) + 384;
/* 216 */       if (n != i2) {
/*     */         break label516;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 227 */       n = MainMemory.getI32(k);
/* 228 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label562;
/*     */       
/*     */       label516:
/*     */       
/* 235 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 251 */       n += 24;
/* 252 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label562:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 262 */       i1 = MainMemory.getI32(j) + 408;
/* 263 */       if (n != i2) {
/*     */         break label625;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 274 */       n = MainMemory.getI32(k);
/* 275 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label671;
/*     */       
/*     */       label625:
/*     */       
/* 282 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 298 */       n += 24;
/* 299 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label671:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 309 */       i1 = MainMemory.getI32(j) + 432;
/* 310 */       if (n != i2) {
/*     */         break label734;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 321 */       n = MainMemory.getI32(k);
/* 322 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label780;
/*     */       
/*     */       label734:
/*     */       
/* 329 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 345 */       n += 24;
/* 346 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label780:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 356 */       i1 = MainMemory.getI32(j) + 456;
/* 357 */       if (n != i2) {
/*     */         break label843;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 367 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 368 */       n = MainMemory.getI32(k);
/* 369 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label889;
/*     */       
/*     */       label843:
/*     */       
/* 376 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 386 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 392 */       n += 24;
/* 393 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label889:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 403 */       i1 = MainMemory.getI32(j) + 480;
/* 404 */       if (n != i2) {
/*     */         break label952;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 414 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 415 */       n = MainMemory.getI32(k);
/* 416 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label998;
/*     */       
/*     */       label952:
/*     */       
/* 423 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 439 */       n += 24;
/* 440 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label998:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 450 */       i1 = MainMemory.getI32(j) + 504;
/* 451 */       if (n != i2) {
/*     */         break label1061;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 462 */       n = MainMemory.getI32(k);
/* 463 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label1107;
/*     */       
/*     */       label1061:
/*     */       
/* 470 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 480 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 486 */       n += 24;
/* 487 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1107:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 497 */       i1 = MainMemory.getI32(j) + 528;
/* 498 */       if (n != i2) {
/*     */         break label1170;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 508 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 509 */       n = MainMemory.getI32(k);
/* 510 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label1216;
/*     */       
/*     */       label1170:
/*     */       
/* 517 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 527 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 533 */       n += 24;
/* 534 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1216:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 544 */       i1 = MainMemory.getI32(j) + 552;
/* 545 */       if (n != i2) {
/*     */         break label1279;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 555 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 556 */       n = MainMemory.getI32(k);
/* 557 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label1325;
/*     */       
/*     */       label1279:
/*     */       
/* 564 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 574 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 580 */       n += 24;
/* 581 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1325:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 591 */       i1 = MainMemory.getI32(j) + 576;
/* 592 */       if (n != i2) {
/*     */         break label1388;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 602 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 603 */       n = MainMemory.getI32(k);
/* 604 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label1434;
/*     */       
/*     */       label1388:
/*     */       
/* 611 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 621 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 627 */       n += 24;
/* 628 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1434:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 638 */       i1 = MainMemory.getI32(j) + 600;
/* 639 */       if (n != i2) {
/*     */         break label1497;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 649 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 650 */       n = MainMemory.getI32(k);
/* 651 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label1543;
/*     */       
/*     */       label1497:
/*     */       
/* 658 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 668 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 674 */       n += 24;
/* 675 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1543:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 685 */       i1 = MainMemory.getI32(j) + 864;
/* 686 */       if (n != i2) {
/*     */         break label1606;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 696 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/* 697 */       n = MainMemory.getI32(k);
/* 698 */       i2 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */       break label1652;
/*     */       
/*     */       label1606:
/*     */       
/* 705 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 715 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 721 */       n += 24;
/* 722 */       MainMemory.setI32(k, n);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1652:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 732 */       i1 = MainMemory.getI32(j) + 888;
/* 733 */       if (n != i2) {
/*     */         break label1701;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 743 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS2_S4_EERKS2_.call(paramInt1, n, i1);
/*     */       
/*     */       break label1743;
/*     */       
/*     */       label1701:
/* 748 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 758 */         _ZN7duchamp6Column3ColC1ERKS1_.call(n, i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 764 */       MainMemory.setI32(k, n + 24);
/*     */       
/*     */ 
/*     */       label1743:
/*     */       
/*     */ 
/* 770 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(j);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 781 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Column12getLogColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */