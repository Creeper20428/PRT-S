/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_b_loc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgcdw
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3360;
/*  20 */   public static final Function _instance = new ffgcdw();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffgcdw() { super("ffgcdw", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  27 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  28 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  33 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, k, m);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  52 */     int i = 0;
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
/*  63 */     int i7 = 0;
/*  64 */     int i8 = 0;
/*  65 */     int i9 = 0;
/*     */     
/*     */ 
/*  68 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       i = MainMemory.alloc(81);
/*  73 */       j = MainMemory.alloc(71);
/*  74 */       k = MainMemory.alloc(81);
/*  75 */       m = MainMemory.alloc(72);
/*  76 */       n = MainMemory.alloc(20);
/*  77 */       i1 = MainMemory.alloc(4);
/*  78 */       i2 = MainMemory.alloc(8);
/*  79 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         i5 = MainMemory.getI32(paramInt1);
/*  90 */         i3 = paramInt1 + 4;
/*  91 */         if (i5 != MainMemory.getI32(MainMemory.getI32(i3) + 64))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           ffmahd.call(paramInt1, i5 + 1, 0, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 107 */         if (paramInt2 >= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */           i4 = MainMemory.getI32(i3);
/* 118 */           if (MainMemory.getI32(i4 + 916) >= paramInt2) {
/*     */             break label255;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         SystemLibrary.sprintf(k, 99232, new Object[] { Integer.valueOf(paramInt2) });
/* 129 */         ffxmsg.call(5, k);
/* 130 */         MainMemory.setI32(paramInt4, 302);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label255:
/*     */         
/* 137 */         i5 = MainMemory.getI32(MainMemory.getI32(i4 + 944) + (paramInt2 + -1) * 152 + 80);
/* 138 */         i5 = i5 > -1 ? i5 : 0 - i5;
/* 139 */         ffkeyn.call(27488, paramInt2, m, paramInt4);
/* 140 */         MainMemory.setI32(paramInt3, 0);
/* 141 */         MainMemory.setI32(i1, 0);
/* 142 */         MainMemory.setI8(j, (byte)0);
/* 143 */         if (ffgcrd.call(paramInt1, m, i, i1) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */           ffpsvc.call(i, j, 0, i1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 159 */         MainMemory.setI8(n, (byte)0);
/* 160 */         ffc2s.call(j, n, i1);
/* 161 */         if (MainMemory.getI32(i1) != 0) {
/*     */           break label917;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         i9 = MainMemory.getI8(n);
/* 172 */         if (i9 == 32) {
/* 173 */           i8 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 178 */           i6 = n;
/*     */           
/*     */ 
/*     */           break label471;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/* 186 */           i8 += 1;
/* 187 */           i6 = n + i8;
/* 188 */           i9 = MainMemory.getI8(i6);
/* 189 */         } while (i9 == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label471:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */         switch (i9)
/*     */         {
/*     */         case 65: 
/*     */           break;
/*     */         case 97: 
/*     */           break;
/*     */         case 73: 
/*     */           break;
/*     */         case 105: 
/*     */           break;
/*     */         case 79: 
/*     */           break;
/*     */         case 111: 
/*     */           break;
/*     */         case 90: 
/*     */           break;
/*     */         case 122: 
/*     */           break;
/*     */         case 70: 
/*     */           break;
/*     */         case 102: 
/*     */           break;
/*     */         case 69: 
/*     */           break;
/*     */         case 101: 
/*     */           break;
/*     */         case 68: 
/*     */           break;
/*     */         case 100: 
/*     */           break;
/*     */         case 71: 
/*     */           break;
/*     */         case 103: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 244 */         i7 = MainMemory.getI32(__ctype_b_loc.call());
/*     */         
/* 246 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 254 */           if (((MainMemory.getI16(i7 + (i9 << 1)) & 0xFFFF & 0x800) == 0) && (i9 != 0)) {
/*     */             break label891;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */           i8 = SystemLibrary.atoi(i6 + i8);
/* 265 */           MainMemory.setI32(paramInt3, i8);
/* 266 */           if (i5 <= 82) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */           i8 = (i8 << 1) + 3;
/* 278 */           MainMemory.setI32(paramInt3, i8);
/*     */           
/* 280 */           break;
/*     */           
/*     */           label891:
/*     */           
/* 284 */           i8 += 1;
/* 285 */           i9 = MainMemory.getI8(i6 + i8);
/*     */         }
/*     */         
/*     */ 
/*     */         label917:
/*     */         
/*     */ 
/* 292 */         i8 = MainMemory.getI32(paramInt3);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */         if (i8 != 0) {
/*     */           break label2006;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 310 */         ffkeyn.call(27360, paramInt2, m, paramInt4);
/* 311 */         if (MainMemory.getI32(paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */           MainMemory.setI8(j, (byte)0);
/* 322 */           if (ffgcrd.call(paramInt1, m, i, paramInt4) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */             ffpsvc.call(i, j, 0, paramInt4);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 338 */           MainMemory.setI8(n, (byte)0);
/* 339 */           ffc2s.call(j, n, paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 345 */         ffkeyn.call(27424, paramInt2, m, paramInt4);
/* 346 */         MainMemory.setI32(i1, 0);
/* 347 */         MainMemory.setI8(j, (byte)0);
/* 348 */         if (ffgcrd.call(paramInt1, m, i, i1) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */           ffpsvc.call(i, j, 0, i1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 364 */         ffc2d.call(j, i2, i1);
/* 365 */         if (MainMemory.getI32(i1) != 0) {
/*     */           break label1224;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */         if (!MathUtils.f_une(MainMemory.getF64(i2), 1.0D)) {
/*     */           break label1224;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */         if (i5 >= 22) {
/*     */           break label1188;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 395 */         MainMemory.setI32(paramInt3, 14);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1188:
/*     */         
/* 402 */         if (i5 != 41) {
/*     */           break label1224;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */         MainMemory.setI32(paramInt3, 23);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1224:
/*     */         
/* 419 */         if (MainMemory.getI32(paramInt4) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 429 */           paramInt2 = MainMemory.getI32(paramInt1);
/* 430 */           i4 = MainMemory.getI32(i3);
/* 431 */           if (paramInt2 != 0) {
/*     */             break label1293;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */           if (MainMemory.getI64(i4 + 88) == 0L) {
/*     */             break label1530;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label1293:
/*     */           
/*     */ 
/*     */ 
/* 451 */           if (paramInt2 != MainMemory.getI32(i4 + 64)) {
/*     */             break label1372;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */           if (MainMemory.getI64(i4 + 112) != -1L) {
/*     */             break label1387;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 471 */           if (ffrdef.call(paramInt1, paramInt4) > 0) {
/*     */             break label1431;
/*     */           } else {
/*     */             break label1387;
/*     */           }
/*     */           
/*     */ 
/*     */           label1372:
/*     */           
/* 480 */           ffmahd.call(paramInt1, paramInt2 + 1, 0, paramInt4);
/*     */           
/*     */ 
/*     */           label1387:
/*     */           
/*     */ 
/* 486 */           i4 = MainMemory.getI32(i3);
/* 487 */           if ((MainMemory.getI32(i4 + 1012) != 0) || (MainMemory.getI32(i4 + 68) != 1)) {
/*     */             break label1530;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1431:
/*     */         
/*     */ 
/* 497 */         i7 = MainMemory.getI32(__ctype_b_loc.call());
/* 498 */         paramInt2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 505 */           i6 = n + paramInt2;
/* 506 */           i9 = MainMemory.getI8(i6);
/* 507 */           if (((MainMemory.getI16(i7 + (i9 << 1)) & 0xFFFF & 0x800) == 0) && (i9 != 0)) {
/*     */             break label1516;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 517 */           MainMemory.setI32(paramInt3, SystemLibrary.atoi(i6));
/* 518 */           break;
/*     */           
/*     */ 
/*     */           label1516:
/*     */           
/*     */ 
/* 524 */           paramInt2 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label1530:
/*     */         
/* 530 */         switch (i5) {
/*     */         case 1: 
/*     */           break label1990;
/*     */           break;
/*     */         case 11: 
/*     */           break label1975;
/*     */           break;
/*     */         case 21: 
/*     */           break label1959;
/*     */           break;
/*     */         case 41: 
/*     */           break label1943;
/*     */           break;
/*     */         case 81:  break label1927;
/*     */           break; case 42:  break label1911;
/*     */           break; case 82:  break label1895;
/*     */           break; case 83:  break label1879;
/*     */           break; case 163:  break label1863;
/*     */           break; case 14:  break label1848;
/*     */           break; case 16:  break; }
/* 550 */         i7 = MainMemory.getI32(__ctype_b_loc.call());
/* 551 */         paramInt2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 558 */           i6 = n + paramInt2;
/* 559 */           i9 = MainMemory.getI8(i6);
/* 560 */           if (((MainMemory.getI16(i7 + (i9 << 1)) & 0xFFFF & 0x800) == 0) && (i9 != 0)) {
/*     */             break label1834;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 570 */           paramInt2 = SystemLibrary.atoi(i6);
/* 571 */           MainMemory.setI32(paramInt3, paramInt2);
/* 572 */           if (paramInt2 >= 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 582 */           MainMemory.setI32(paramInt3, 1);
/*     */           
/*     */ 
/*     */           break label2011;
/*     */           
/*     */           label1834:
/*     */           
/* 589 */           paramInt2 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label1848:
/*     */         
/* 595 */         MainMemory.setI32(paramInt3, 1);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1863:
/*     */         
/* 602 */         MainMemory.setI32(paramInt3, 49);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1879:
/*     */         
/* 609 */         MainMemory.setI32(paramInt3, 31);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1895:
/*     */         
/* 616 */         MainMemory.setI32(paramInt3, 23);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1911:
/*     */         
/* 623 */         MainMemory.setI32(paramInt3, 14);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1927:
/*     */         
/* 630 */         MainMemory.setI32(paramInt3, 20);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1943:
/*     */         
/* 637 */         MainMemory.setI32(paramInt3, 11);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1959:
/*     */         
/* 644 */         MainMemory.setI32(paramInt3, 6);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1975:
/*     */         
/* 651 */         MainMemory.setI32(paramInt3, 4);
/*     */         
/*     */ 
/*     */         break label2011;
/*     */         
/*     */         label1990:
/*     */         
/* 658 */         MainMemory.setI32(paramInt3, 8);
/*     */         
/*     */ 
/*     */ 
/*     */         break label2011;
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label2006:
/*     */       
/*     */ 
/*     */ 
/*     */       label2011:
/*     */       
/*     */ 
/*     */ 
/* 675 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */