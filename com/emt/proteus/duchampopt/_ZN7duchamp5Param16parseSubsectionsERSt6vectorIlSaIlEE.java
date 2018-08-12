/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp5Param16parseSubsectionsERSt6vectorIlSaIlEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2520;
/*  23 */   public static final Function _instance = new _ZN7duchamp5Param16parseSubsectionsERSt6vectorIlSaIlEE();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _ZN7duchamp5Param16parseSubsectionsERSt6vectorIlSaIlEE() { super("_ZN7duchamp5Param16parseSubsectionsERSt6vectorIlSaIlEE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = call(i, j);
/*  42 */     paramFrame.setI32(paramInt1, k);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
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
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*  69 */     int i16 = 0;
/*  70 */     int i17 = 0;
/*  71 */     int i18 = 0;
/*  72 */     int i19 = 0;
/*  73 */     int i20 = 0;
/*  74 */     int i21 = 0;
/*     */     
/*     */ 
/*  77 */     int i22 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  81 */       j = MainMemory.alloc(1);
/*  82 */       k = MainMemory.alloc(4);
/*  83 */       m = MainMemory.alloc(1);
/*  84 */       n = MainMemory.alloc(4);
/*  85 */       i1 = MainMemory.alloc(48);
/*  86 */       i2 = MainMemory.alloc(1);
/*  87 */       i3 = MainMemory.alloc(4);
/*  88 */       i4 = MainMemory.alloc(1);
/*  89 */       i5 = MainMemory.alloc(4);
/*  90 */       i6 = MainMemory.alloc(48);
/*  91 */       i7 = MainMemory.alloc(1);
/*  92 */       i8 = MainMemory.alloc(4);
/*  93 */       i9 = MainMemory.alloc(1);
/*  94 */       i10 = MainMemory.alloc(4);
/*  95 */       i18 = MainMemory.alloc(48);
/*  96 */       i11 = paramInt2 + 4;
/*  97 */       i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/*  98 */       if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */         break label223;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       _ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label223:
/*     */       
/*     */ 
/* 114 */       i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 115 */       i13 = i12;
/* 116 */       i17 = MainMemory.getI32(paramInt2);
/* 117 */       i14 = MainMemory.getI32(i11) - i17;
/* 118 */       SystemLibrary.memmove(i12, i17, i14, 4);
/* 119 */       i15 = paramInt1 + 12;
/* 120 */       i16 = _ZN7duchamp7Section5parseESt6vectorIlSaIlEE.call(i15, i13, i13 + (i14 >> 2 << 2)) == 1 ? 1 : 0;
/* 121 */       if (i12 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         SystemLibrary.delete(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 137 */       if (i16 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */         i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/* 148 */         if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */           break label381;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         _ZSt17__throw_bad_allocv.call();
/*     */         
/*     */ 
/*     */         label381:
/*     */         
/*     */ 
/* 164 */         i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 165 */         i13 = i12;
/* 166 */         i17 = MainMemory.getI32(paramInt2);
/* 167 */         i14 = MainMemory.getI32(i11) - i17;
/* 168 */         SystemLibrary.memmove(i12, i17, i14, 4);
/* 169 */         _ZN7duchamp7Section9intersectESt6vectorIlSaIlEE.call(i18, i15, i13, i13 + (i14 >> 2 << 2));
/* 170 */         _ZN7duchamp7SectionaSERKS0_.call(i15, i18);
/* 171 */         _ZN7duchamp7SectionD1Ev.call(i18);
/* 172 */         if (i12 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */           SystemLibrary.delete(i12);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 188 */         i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/* 189 */         if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */           break label521;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */         _ZSt17__throw_bad_allocv.call();
/*     */         
/*     */ 
/*     */         label521:
/*     */         
/*     */ 
/* 205 */         i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 206 */         i13 = i12;
/* 207 */         i17 = MainMemory.getI32(paramInt2);
/* 208 */         i14 = MainMemory.getI32(i11) - i17;
/* 209 */         SystemLibrary.memmove(i12, i17, i14, 4);
/* 210 */         i16 = _ZN7duchamp7Section5parseESt6vectorIlSaIlEE.call(i15, i13, i13 + (i14 >> 2 << 2)) == 1 ? 1 : 0;
/* 211 */         if (i12 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */           SystemLibrary.delete(i12);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 227 */         if (i16 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */           if (_ZN7duchamp7Section7isValidEv.call(MainMemory.getI32(paramInt1 + 32), MainMemory.getI32(paramInt1 + 48), MainMemory.getI32(paramInt1 + 52)) != 0) {
/*     */             break label735;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */           _ZNSaIcEC1Ev.call(i9);
/* 248 */           _ZNSsC1EPKcRKSaIcE.call(i10, 96864, i9);
/* 249 */           _ZNSaIcEC1Ev.call(i7);
/* 250 */           _ZNSsC1EPKcRKSaIcE.call(i8, 58048, i7);
/* 251 */           _ZN7duchamp12duchampErrorESsSs.call(i8, i10);
/* 252 */           _ZNSsD1Ev.call(i8);
/* 253 */           _ZNSaIcED1Ev.call(i7);
/* 254 */           _ZNSsD1Ev.call(i10);
/* 255 */           _ZNSaIcED1Ev.call(i9);
/* 256 */           i = 1;
/*     */           
/*     */ 
/*     */           break label1783;
/*     */           
/*     */           label735:
/*     */           
/* 263 */           if (MainMemory.getI8(paramInt1 + 356) != 0) {
/*     */             break label771;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */           i = 0;
/*     */           
/*     */ 
/*     */           break label1783;
/*     */           
/*     */           label771:
/*     */           
/* 280 */           i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/* 281 */           if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */             break label816;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */           _ZSt17__throw_bad_allocv.call();
/*     */           
/*     */ 
/*     */           label816:
/*     */           
/*     */ 
/* 297 */           i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 298 */           i13 = i12;
/* 299 */           i17 = MainMemory.getI32(paramInt2);
/* 300 */           i14 = MainMemory.getI32(i11) - i17;
/* 301 */           SystemLibrary.memmove(i12, i17, i14, 4);
/* 302 */           i18 = paramInt1 + 360;
/* 303 */           i16 = _ZN7duchamp7Section5parseESt6vectorIlSaIlEE.call(i18, i13, i13 + (i14 >> 2 << 2)) == 1 ? 1 : 0;
/* 304 */           if (i12 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 314 */             SystemLibrary.delete(i12);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 320 */           if (i16 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */             i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/* 331 */             if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */               break label975;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */             _ZSt17__throw_bad_allocv.call();
/*     */             
/*     */ 
/*     */             label975:
/*     */             
/*     */ 
/* 347 */             i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 348 */             i13 = i12;
/* 349 */             i17 = MainMemory.getI32(paramInt2);
/* 350 */             i14 = MainMemory.getI32(i11) - i17;
/* 351 */             SystemLibrary.memmove(i12, i17, i14, 4);
/* 352 */             _ZN7duchamp7Section9intersectESt6vectorIlSaIlEE.call(i6, i18, i13, i13 + (i14 >> 2 << 2));
/* 353 */             _ZN7duchamp7SectionaSERKS0_.call(i18, i6);
/* 354 */             _ZN7duchamp7SectionD1Ev.call(i6);
/* 355 */             if (i12 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 365 */               SystemLibrary.delete(i12);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 371 */             i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/* 372 */             if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */               break label1115;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 382 */             _ZSt17__throw_bad_allocv.call();
/*     */             
/*     */ 
/*     */             label1115:
/*     */             
/*     */ 
/* 388 */             i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 389 */             i13 = i12;
/* 390 */             i17 = MainMemory.getI32(paramInt2);
/* 391 */             i14 = MainMemory.getI32(i11) - i17;
/* 392 */             SystemLibrary.memmove(i12, i17, i14, 4);
/* 393 */             i16 = _ZN7duchamp7Section5parseESt6vectorIlSaIlEE.call(i18, i13, i13 + (i14 >> 2 << 2)) == 1 ? 1 : 0;
/* 394 */             if (i12 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */               SystemLibrary.delete(i12);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 410 */             if (i16 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */               i13 = paramInt1 + 380;
/* 421 */               i19 = paramInt1 + 396;
/* 422 */               i20 = paramInt1 + 400;
/* 423 */               if (_ZN7duchamp7Section7isValidEv.call(MainMemory.getI32(i13), MainMemory.getI32(i19), MainMemory.getI32(i20)) != 0) {
/*     */                 break label1344;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */               _ZNSaIcEC1Ev.call(i4);
/* 434 */               _ZNSsC1EPKcRKSaIcE.call(i5, 85984, i4);
/* 435 */               _ZNSaIcEC1Ev.call(i2);
/* 436 */               _ZNSsC1EPKcRKSaIcE.call(i3, 58048, i2);
/* 437 */               _ZN7duchamp12duchampErrorESsSs.call(i3, i5);
/* 438 */               _ZNSsD1Ev.call(i3);
/* 439 */               _ZNSaIcED1Ev.call(i2);
/* 440 */               _ZNSsD1Ev.call(i5);
/* 441 */               _ZNSaIcED1Ev.call(i4);
/* 442 */               i = 1;
/*     */               
/*     */ 
/*     */               break label1783;
/*     */               
/*     */               label1344:
/*     */               
/* 449 */               _ZN7duchamp7Section9intersectERS0_.call(i1, i18, i15);
/* 450 */               _ZN7duchamp7SectionaSERKS0_.call(i18, i1);
/* 451 */               _ZN7duchamp7SectionD1Ev.call(i1);
/* 452 */               i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/* 453 */               if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */                 break label1410;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 463 */               _ZSt17__throw_bad_allocv.call();
/*     */               
/*     */ 
/*     */               label1410:
/*     */               
/*     */ 
/* 469 */               i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 470 */               i17 = i12;
/* 471 */               i21 = MainMemory.getI32(paramInt2);
/* 472 */               i14 = MainMemory.getI32(i11) - i21;
/* 473 */               SystemLibrary.memmove(i12, i21, i14, 4);
/* 474 */               i16 = _ZN7duchamp7Section5parseESt6vectorIlSaIlEE.call(i18, i17, i17 + (i14 >> 2 << 2)) == 1 ? 1 : 0;
/* 475 */               if (i12 != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 485 */                 SystemLibrary.delete(i12);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 491 */               if (i16 == 0) {
/*     */                 break label1532;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 501 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1783;
/*     */       
/*     */       label1532:
/*     */       
/* 508 */       if (_ZN7duchamp7Section7isValidEv.call(MainMemory.getI32(i13), MainMemory.getI32(i19), MainMemory.getI32(i20)) != 0) {
/*     */         break label1630;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 518 */       _ZNSaIcEC1Ev.call(m);
/* 519 */       _ZNSsC1EPKcRKSaIcE.call(n, 112800, m);
/* 520 */       _ZNSaIcEC1Ev.call(j);
/* 521 */       _ZNSsC1EPKcRKSaIcE.call(k, 58048, j);
/* 522 */       _ZN7duchamp12duchampErrorESsSs.call(k, n);
/* 523 */       _ZNSsD1Ev.call(k);
/* 524 */       _ZNSaIcED1Ev.call(j);
/* 525 */       _ZNSsD1Ev.call(n);
/* 526 */       _ZNSaIcED1Ev.call(m);
/* 527 */       i = 1;
/*     */       
/*     */ 
/*     */       break label1783;
/*     */       
/*     */       label1630:
/*     */       
/* 534 */       i14 = MainMemory.getI32(i11) - MainMemory.getI32(paramInt2);
/* 535 */       if (!MathUtils.ugt(i14 >> 2, 1073741823)) {
/*     */         break label1675;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 545 */       _ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label1675:
/*     */       
/*     */ 
/* 551 */       i12 = SystemLibrary.newobject(i14 & 0xFFFFFFFC);
/* 552 */       i13 = i12;
/* 553 */       i17 = MainMemory.getI32(paramInt2);
/* 554 */       i14 = MainMemory.getI32(i11) - i17;
/* 555 */       SystemLibrary.memmove(i12, i17, i14, 4);
/* 556 */       i16 = _ZN7duchamp7Section5parseESt6vectorIlSaIlEE.call(i18, i13, i13 + (i14 >> 2 << 2)) == 1 ? 1 : 0;
/* 557 */       if (i12 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */         SystemLibrary.delete(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 573 */       i = i16 != 0 ? 1 : 0;
/*     */       
/*     */ 
/*     */       label1783:
/*     */       
/*     */ 
/* 579 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 584 */       MainMemory.dealloc_generated(i22);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param16parseSubsectionsERSt6vectorIlSaIlEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */