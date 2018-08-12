/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F423138 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3661;
/*  11 */   public static final Function _instance = new F423138();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F423138() { super("F423138", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = call(i);
/*  27 */     paramFrame.setI32(paramInt1, j);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  33 */     int i = 0;
/*     */     
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  44 */       n = MainMemory.getI32Aligned(459440);
/*  45 */       k = MainMemory.getI32Aligned(459448);
/*  46 */       if (n >= 3)
/*     */       {
/*     */ 
/*     */ 
/*  50 */         j = k;
/*  51 */         k = n;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  58 */         j = MainMemory.getI32Aligned(459444);
/*  59 */         k = MainMemory.getI8(paramInt + j) & 0xFF | k << 8;
/*  60 */         MainMemory.setI32Aligned(459448, k);
/*  61 */         MainMemory.setI32Aligned(459444, j + 1);
/*  62 */         n += 8;
/*  63 */         MainMemory.setI32Aligned(459440, n);
/*  64 */         j = k;
/*  65 */         k = n;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */       m = k + -3;
/*  74 */       MainMemory.setI32Aligned(459440, m);
/*  75 */       n = j >> m & 0x7;
/*  76 */       if (!com.emt.proteus.lib.api.MathUtils.ult(n, 4)) {
/*     */         break label168;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       i = 1 << n;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label168:
/*     */       
/*  93 */       if (m != 0) {
/*     */         break label239;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       j = MainMemory.getI32Aligned(459444);
/* 104 */       k = MainMemory.getI8(paramInt + j) & 0xFF;
/* 105 */       MainMemory.setI32Aligned(459448, k);
/* 106 */       MainMemory.setI32Aligned(459444, j + 1);
/* 107 */       MainMemory.setI32Aligned(459440, 8);
/* 108 */       j = k;
/* 109 */       k = 7;
/*     */       
/*     */       break label249;
/*     */       
/*     */       label239:
/* 114 */       k += -4;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label249:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 124 */       MainMemory.setI32Aligned(459440, k);
/* 125 */       n = j >>> k & 0x1 | n << 1;
/* 126 */       if (!com.emt.proteus.lib.api.MathUtils.ult(n, 13)) {
/*     */         break label426;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       switch (n) {
/* 137 */       case 8:  n = 3;
/*     */         break label660;
/*     */         break;
/*     */       case 9: 
/*     */         break label414;
/*     */         break;
/*     */       case 10: 
/*     */         break label401;
/*     */         break;
/*     */       case 11: 
/*     */         break label388;
/*     */         break;
/*     */       case 12: 
/*     */         break; }
/* 151 */       i = 15;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label388:
/*     */       
/* 158 */       i = 12;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label401:
/*     */       
/* 165 */       i = 10;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label414:
/*     */       
/* 172 */       i = 5;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label426:
/*     */       
/* 179 */       if (k != 0) {
/*     */         break label496;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */       j = MainMemory.getI32Aligned(459444);
/* 190 */       k = MainMemory.getI8(paramInt + j) & 0xFF;
/* 191 */       MainMemory.setI32Aligned(459448, k);
/* 192 */       MainMemory.setI32Aligned(459444, j + 1);
/* 193 */       MainMemory.setI32Aligned(459440, 8);
/* 194 */       j = k;
/* 195 */       k = 7;
/*     */       
/*     */       break label505;
/*     */       
/*     */       label496:
/* 200 */       k += -1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label505:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 210 */       MainMemory.setI32Aligned(459440, k);
/* 211 */       n = j >>> k & 0x1 | n << 1;
/* 212 */       switch (n) {
/* 213 */       case 26:  n = 6;
/*     */         break label660;
/*     */         break;
/*     */       case 27: 
/*     */         break label647;
/*     */         break;
/*     */       case 28: 
/*     */         break label634;
/*     */         break;
/*     */       case 29: 
/*     */         break label621;
/*     */         break;
/*     */       case 30: 
/*     */         break; }
/* 227 */       i = 13;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label621:
/*     */       
/* 234 */       i = 11;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label634:
/*     */       
/* 241 */       i = 9;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */       label647:
/*     */       
/* 248 */       i = 7;
/*     */       
/*     */ 
/*     */       break label785;
/*     */       
/*     */ 
/*     */       label660:
/*     */       
/* 256 */       i = n;
/*     */       
/*     */ 
/*     */ 
/*     */       break label785;
/*     */       
/*     */ 
/* 263 */       if (k != 0) {
/*     */         break label743;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       j = MainMemory.getI32Aligned(459444);
/* 274 */       k = MainMemory.getI8(paramInt + j) & 0xFF;
/* 275 */       MainMemory.setI32Aligned(459448, k);
/* 276 */       MainMemory.setI32Aligned(459444, j + 1);
/* 277 */       MainMemory.setI32Aligned(459440, 8);
/* 278 */       j = k;
/* 279 */       k = 7;
/*     */       
/*     */       break label752;
/*     */       
/*     */       label743:
/* 284 */       k += -1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label752:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 294 */       MainMemory.setI32Aligned(459440, k);
/* 295 */       i = (j >>> k & 0x1 | n << 1) == 62 ? 0 : 14;
/*     */       
/*     */ 
/*     */       label785:
/*     */       
/*     */ 
/* 301 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F423138.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */