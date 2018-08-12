/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class bonset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2854;
/*  13 */   public static final Function _instance = new bonset();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public bonset() { super("bonset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     double d1 = 0.0D;
/*  41 */     double d2 = 0.0D;
/*  42 */     boolean bool = false;
/*  43 */     double d3 = 0.0D;
/*  44 */     int n = 0;
/*  45 */     double d4 = 0.0D;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*     */     
/*     */ 
/*  52 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       j = MainMemory.alloc(4);
/*  57 */       k = MainMemory.alloc(8);
/*  58 */       m = MainMemory.alloc(8);
/*  59 */       if (paramInt == 0) {
/*  60 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  70 */         MainMemory.setI32(paramInt, 601);
/*  71 */         MainMemory.setI32(paramInt + 4, 5132098);
/*  72 */         d1 = MainMemory.getF64(paramInt + 24);
/*  73 */         if (MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*  74 */           n = 2;
/*     */         } else {
/*     */           break label143;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       i = n;
/*     */       
/*     */ 
/*     */       break label1420;
/*     */       
/*     */       label143:
/*     */       
/*  92 */       if (!MathUtils.f_oeq(d1, 0.0D)) {
/*     */         break label180;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */       i = sflset.call(paramInt);
/*     */       
/*     */ 
/*     */       break label1420;
/*     */       
/*     */       label180:
/*     */       
/* 109 */       MainMemory.setI64(paramInt + 276, 32412938919636802L);
/* 110 */       MainMemory.setI32(paramInt + 316, 6);
/* 111 */       MainMemory.setI32(paramInt + 320, 101);
/* 112 */       MainMemory.setI32(paramInt + 324, 0);
/* 113 */       MainMemory.setI32(paramInt + 328, 1);
/* 114 */       MainMemory.setI32(paramInt + 332, 0);
/* 115 */       MainMemory.setI32(paramInt + 336, 1);
/* 116 */       MainMemory.setI32(paramInt + 340, 0);
/* 117 */       i1 = paramInt + 8;
/* 118 */       d2 = MainMemory.getF64(i1);
/* 119 */       if (!MathUtils.f_oeq(d2, 0.0D)) {
/*     */         break label740;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       MainMemory.setF64(i1, 57.29577951308232D);
/* 130 */       MainMemory.setF64(paramInt + 368, 1.0D);
/* 131 */       bool = MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D);
/* 132 */       if (!bool) {
/*     */         break label484;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       d2 = d1 / 90.0D;
/* 143 */       d2 += 0.5D;
/* 144 */       n = (int)SystemLibrary.floor(d2);
/* 145 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label469;
/*     */         break; case 1:  d2 = 0.0D;
/*     */         break label516;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d2 = 0.0D;
/*     */         
/*     */ 
/*     */         break label516;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 160 */       d2 = -57.29577951308232D;
/*     */       
/*     */       break label516;
/*     */       
/*     */       label469:
/* 165 */       d2 = 57.29577951308232D;
/*     */       
/*     */       break label516;
/*     */       
/*     */       label484:
/* 170 */       d2 = d1 * 3.141592653589793D;
/* 171 */       d2 /= 180.0D;
/* 172 */       d2 = SystemLibrary.cos(d2) * 57.29577951308232D;
/*     */       
/*     */ 
/*     */ 
/*     */       label516:
/*     */       
/*     */ 
/*     */ 
/* 180 */       if (!bool) {
/*     */         break label678;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */       d3 = d1 / 90.0D;
/* 191 */       d3 += -0.5D;
/* 192 */       n = (int)SystemLibrary.floor(d3);
/* 193 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label665;
/*     */         break; case 1:  d3 = 0.0D;
/*     */         break label706;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d3 = 0.0D;
/*     */         
/*     */ 
/*     */         break label706;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 208 */       d3 = -1.0D;
/*     */       
/*     */       break label706;
/*     */       
/*     */       label665:
/* 213 */       d3 = 1.0D;
/*     */       
/*     */       break label706;
/*     */       
/*     */       label678:
/* 218 */       d3 = d1 * 3.141592653589793D;
/* 219 */       d3 /= 180.0D;
/* 220 */       d3 = SystemLibrary.sin(d3);
/*     */       
/*     */ 
/*     */ 
/*     */       label706:
/*     */       
/*     */ 
/*     */ 
/* 228 */       d2 /= d3;
/* 229 */       d1 = d2 + d1;
/* 230 */       MainMemory.setF64(paramInt + 376, d1);
/*     */       
/*     */       break label1210;
/*     */       
/*     */       label740:
/* 235 */       d3 = d2 * 3.141592653589793D;
/* 236 */       d3 /= 180.0D;
/* 237 */       MainMemory.setF64(paramInt + 368, d3);
/* 238 */       bool = MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D);
/* 239 */       if (!bool) {
/*     */         break label942;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */       d3 = d1 / 90.0D;
/* 250 */       d3 += 0.5D;
/* 251 */       n = (int)SystemLibrary.floor(d3);
/* 252 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label929;
/*     */         break; case 1:  d3 = 0.0D;
/*     */         break label970;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d3 = 0.0D;
/*     */         
/*     */ 
/*     */         break label970;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 267 */       d3 = -1.0D;
/*     */       
/*     */       break label970;
/*     */       
/*     */       label929:
/* 272 */       d3 = 1.0D;
/*     */       
/*     */       break label970;
/*     */       
/*     */       label942:
/* 277 */       d3 = d1 * 3.141592653589793D;
/* 278 */       d3 /= 180.0D;
/* 279 */       d3 = SystemLibrary.cos(d3);
/*     */       
/*     */ 
/*     */ 
/*     */       label970:
/*     */       
/*     */ 
/*     */ 
/* 287 */       if (!bool) {
/*     */         break label1130;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */       d4 = d1 / 90.0D;
/* 298 */       d4 += -0.5D;
/* 299 */       n = (int)SystemLibrary.floor(d4);
/* 300 */       switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */       case 0:  break label1117;
/*     */         break; case 1:  d4 = 0.0D;
/*     */         break label1158;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d4 = 0.0D;
/*     */         
/*     */ 
/*     */         break label1158;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 315 */       d4 = -1.0D;
/*     */       
/*     */       break label1158;
/*     */       
/*     */       label1117:
/* 320 */       d4 = 1.0D;
/*     */       
/*     */       break label1158;
/*     */       
/*     */       label1130:
/* 325 */       d4 = d1 * 3.141592653589793D;
/* 326 */       d4 /= 180.0D;
/* 327 */       d4 = SystemLibrary.sin(d4);
/*     */       
/*     */ 
/*     */ 
/*     */       label1158:
/*     */       
/*     */ 
/*     */ 
/* 335 */       d3 /= d4;
/* 336 */       d1 *= 3.141592653589793D;
/* 337 */       d1 /= 180.0D;
/* 338 */       d1 = d3 + d1;
/* 339 */       d1 = d2 * d1;
/* 340 */       MainMemory.setF64(paramInt + 376, d1);
/*     */       
/*     */ 
/*     */       label1210:
/*     */       
/*     */ 
/* 346 */       MainMemory.setI32(paramInt + 448, 2855);
/* 347 */       MainMemory.setI32(paramInt + 452, 2856);
/* 348 */       i1 = paramInt + 344;
/* 349 */       MainMemory.setF64(i1, 0.0D);
/* 350 */       i2 = paramInt + 352;
/* 351 */       MainMemory.setF64(i2, 0.0D);
/* 352 */       i3 = paramInt + 256;
/* 353 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */         i4 = paramInt + 264;
/* 364 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label1350;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 374 */       MainMemory.setF64(i3, 0.0D);
/* 375 */       MainMemory.setF64(paramInt + 264, 0.0D);
/* 376 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1420;
/*     */       
/*     */       label1350:
/*     */       
/* 383 */       if (bons2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label1413;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */       MainMemory.setF64(i1, MainMemory.getF64(k));
/* 394 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 395 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1420;
/*     */       
/*     */       label1413:
/*     */       
/* 402 */       i = 2;
/*     */       
/*     */ 
/*     */       label1420:
/*     */       
/*     */ 
/* 408 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 413 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/bonset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */