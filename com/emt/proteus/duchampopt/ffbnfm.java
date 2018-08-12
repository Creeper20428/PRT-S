/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffbnfm extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3241;
/*  14 */   public static final Function _instance = new ffbnfm();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffbnfm() { super("ffbnfm", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  41 */     int i1 = call(i, j, k, m, n);
/*  42 */     paramFrame.setI32(paramInt1, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
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
/*     */     
/*     */ 
/*  65 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       j = MainMemory.alloc(4);
/*  70 */       k = MainMemory.alloc(4);
/*  71 */       m = MainMemory.alloc(71);
/*  72 */       n = MainMemory.alloc(81);
/*  73 */       i9 = MainMemory.getI32(paramInt5);
/*  74 */       if (i9 <= 0) {
/*     */         break label112;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */       i = i9;
/*     */       
/*     */ 
/*     */       break label1495;
/*     */       
/*     */       label112:
/*     */       
/*  91 */       i1 = paramInt2 == 0 ? 1 : 0;
/*  92 */       if (i1 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         MainMemory.setI32(paramInt2, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 108 */       i2 = paramInt3 == 0 ? 1 : 0;
/* 109 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */         MainMemory.setI32(paramInt3, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 125 */       i3 = paramInt4 == 0 ? 1 : 0;
/* 126 */       if (i3 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         MainMemory.setI32(paramInt4, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 142 */       i9 = SystemLibrary.strlen(paramInt1);
/* 143 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 150 */         if (!MathUtils.ult(i5, i9)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */         if (MainMemory.getI8(paramInt1 + i5) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */         i5 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 176 */       if (i5 != i9) {
/*     */         break label347;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */       ffxmsg.call(5, 113248);
/* 187 */       MainMemory.setI32(paramInt5, 261);
/* 188 */       i = 261;
/*     */       
/*     */ 
/*     */       break label1495;
/*     */       
/*     */       label347:
/*     */       
/* 195 */       SystemLibrary.strcpy(m, paramInt1 + i5);
/* 196 */       i9 = SystemLibrary.strlen(m);
/* 197 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */         i4 = com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc.call();
/* 208 */         i5 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 215 */           i7 = m + i5;
/* 216 */           MainMemory.setI8(i7, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(i7) << 2)));
/* 217 */           i5 += 1;
/* 218 */           if (i5 == i9) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */       i6 = MainMemory.getI32(com.emt.proteus.runtime.library.ctype.__ctype_b_loc.call());
/* 230 */       i8 = MainMemory.getI8(m);
/* 231 */       if ((MainMemory.getI16(i6 + (i8 << 1)) & 0xFFFF & 0x800) == 0) {
/* 232 */         i9 = 0;
/*     */         break label572;
/*     */       }
/*     */       else {
/* 236 */         i9 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 245 */         i9 += 1;
/* 246 */         i7 = m + i9;
/* 247 */         i8 = MainMemory.getI8(i7);
/* 248 */         if ((MainMemory.getI16(i6 + (i8 << 1)) & 0xFFFF & 0x800) == 0) {
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
/* 259 */       if (i9 != 0) {
/*     */         break label595;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label572:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       MainMemory.setI32(k, 1);
/* 274 */       i7 = m + i9;
/*     */       
/*     */ 
/*     */       break label624;
/*     */       
/*     */ 
/*     */       label595:
/*     */       
/* 282 */       SystemLibrary.sscanf(m, 17920, new int[] { k });
/* 283 */       i8 = MainMemory.getI8(i7);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label624:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */       if (!MathUtils.ult((byte)(i8 + -80), (byte)2))
/*     */       {
/*     */ 
/*     */ 
/* 299 */         i9 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 307 */         i7 = m + (i9 + 1);
/* 308 */         i9 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */       switch (MainMemory.getI8(i7)) {
/*     */       case 85: 
/*     */         break label1324;
/*     */         break;
/*     */       case 73: 
/*     */         break label1304;
/*     */         break;
/*     */       case 86: 
/*     */         break label1284;
/*     */         break;
/*     */       case 74: 
/*     */         break label1264;
/*     */         break;
/*     */       case 75:  break label1243;
/*     */         break; case 69:  break label1223;
/*     */         break; case 68:  break label1202;
/*     */         break; case 65:  break label1026;
/*     */         break; case 76:  break label1006;
/*     */         break; case 88:  break label987;
/*     */         break; case 66:  break label967;
/*     */         break; case 83:  break label947;
/*     */         break; case 67:  break label926;
/*     */         break; case 77:  break; }
/* 340 */       MainMemory.setI32(j, 16);
/* 341 */       i5 = 163;
/*     */       
/*     */       break label1339;
/*     */       
/*     */       label926:
/* 346 */       MainMemory.setI32(j, 8);
/* 347 */       i5 = 83;
/*     */       
/*     */       break label1339;
/*     */       
/*     */       label947:
/* 352 */       MainMemory.setI32(j, 1);
/* 353 */       i5 = 12;
/*     */       
/*     */       break label1339;
/*     */       
/*     */       label967:
/* 358 */       MainMemory.setI32(j, 1);
/* 359 */       i5 = 11;
/*     */       
/*     */       break label1339;
/*     */       
/*     */       label987:
/* 364 */       MainMemory.setI32(j, 1);
/* 365 */       i5 = 1;
/*     */       
/*     */       break label1339;
/*     */       
/*     */       label1006:
/* 370 */       MainMemory.setI32(j, 1);
/* 371 */       i5 = 14;
/*     */       
/*     */       break label1339;
/*     */       
/*     */       label1026:
/* 376 */       paramInt1 = i7 + 1;
/* 377 */       switch (MainMemory.getI8(paramInt1)) {
/*     */       case 0: 
/*     */         break label1178;
/*     */         break;
/*     */       case 40:  break; default:  paramInt1 = i7;
/* 382 */         break;
/*     */       }
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
/*     */ 
/* 396 */       if (SystemLibrary.sscanf(paramInt1 + 1, 17920, new int[] { j }) != 1) {
/*     */         break label1178;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 406 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 410 */         i5 = 16;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 417 */       else if (MainMemory.getI32(j) <= MainMemory.getI32(k))
/*     */       {
/*     */ 
/*     */ 
/* 421 */         i5 = 16;
/*     */       }
/*     */       else
/*     */       {
/*     */         label1178:
/*     */         
/*     */ 
/* 428 */         MainMemory.setI32(j, MainMemory.getI32(k));
/* 429 */         i5 = 16;
/*     */         
/*     */         break label1339;
/*     */         
/*     */         label1202:
/* 434 */         MainMemory.setI32(j, 8);
/* 435 */         i5 = 82;
/*     */         
/*     */         break label1339;
/*     */         
/*     */         label1223:
/* 440 */         MainMemory.setI32(j, 4);
/* 441 */         i5 = 42;
/*     */         
/*     */         break label1339;
/*     */         
/*     */         label1243:
/* 446 */         MainMemory.setI32(j, 8);
/* 447 */         i5 = 81;
/*     */         
/*     */         break label1339;
/*     */         
/*     */         label1264:
/* 452 */         MainMemory.setI32(j, 4);
/* 453 */         i5 = 41;
/*     */         
/*     */         break label1339;
/*     */         
/*     */         label1284:
/* 458 */         MainMemory.setI32(j, 4);
/* 459 */         i5 = 40;
/*     */         
/*     */         break label1339;
/*     */         
/*     */         label1304:
/* 464 */         MainMemory.setI32(j, 2);
/* 465 */         i5 = 21;
/*     */         
/*     */         break label1339;
/*     */         
/*     */         label1324:
/* 470 */         MainMemory.setI32(j, 2);
/* 471 */         i5 = 20;
/*     */       }
/*     */       
/*     */ 
/*     */       label1339:
/*     */       
/*     */ 
/* 478 */       if (i1 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 488 */         MainMemory.setI32(paramInt2, i9 == 0 ? i5 : 0 - i5);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 494 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 504 */         MainMemory.setI32(paramInt3, MainMemory.getI32(k));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 510 */       if (i3 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 520 */         MainMemory.setI32(paramInt4, MainMemory.getI32(j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 526 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */ 
/*     */       break label1495;
/*     */       
/*     */ 
/* 533 */       SystemLibrary.sprintf(n, 99040, new Object[] { Integer.valueOf(paramInt1) });
/* 534 */       ffxmsg.call(5, n);
/* 535 */       MainMemory.setI32(paramInt5, 262);
/* 536 */       i = 262;
/*     */       
/*     */ 
/*     */       label1495:
/*     */       
/*     */ 
/* 542 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 547 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffbnfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */