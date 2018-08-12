/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F431145 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3689;
/*  13 */   public static final Function _instance = new F431145();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F431145() { super("F431145", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     call(paramInt);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     call(i);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*  41 */     int i1 = 0;
/*  42 */     int i2 = 0;
/*  43 */     int i3 = 0;
/*  44 */     int i4 = 0;
/*  45 */     int i5 = 0;
/*  46 */     int i6 = 0;
/*  47 */     int i7 = 0;
/*  48 */     int i8 = 0;
/*  49 */     int i9 = 0;
/*  50 */     int i10 = 0;
/*  51 */     int i11 = 0;
/*  52 */     int i12 = 0;
/*  53 */     int i13 = 0;
/*  54 */     int i14 = 0;
/*  55 */     int i15 = 0;
/*  56 */     int i16 = 0;
/*  57 */     int i17 = 0;
/*  58 */     int i18 = 0;
/*  59 */     int i19 = 0;
/*  60 */     int i20 = 0;
/*  61 */     int i21 = 0;
/*  62 */     int i22 = 0;
/*  63 */     int i23 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  69 */       i = paramInt + 44;
/*  70 */       j = MainMemory.getI32(i);
/*  71 */       k = paramInt + 60;
/*  72 */       m = paramInt + 116;
/*  73 */       n = paramInt + 108;
/*  74 */       i1 = j + 65274;
/*  75 */       i2 = paramInt + 56;
/*  76 */       i3 = paramInt + 72;
/*  77 */       i4 = paramInt + 88;
/*  78 */       i5 = paramInt + 84;
/*  79 */       i6 = paramInt + 112;
/*  80 */       i7 = paramInt + 92;
/*  81 */       i8 = paramInt + 76;
/*  82 */       i9 = paramInt + 68;
/*  83 */       i10 = (short)j;
/*  84 */       i11 = paramInt + 64;
/*  85 */       i12 = j + -1;
/*  86 */       i13 = MainMemory.getI32(m);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  94 */         i14 = MainMemory.getI32(n);
/*  95 */         i13 = MainMemory.getI32(k) - i13 - i14;
/*  96 */         if (!MathUtils.ult(i14, i1 + MainMemory.getI32(i)))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           i22 = MainMemory.getI32(i2);
/* 108 */           SystemLibrary.memcpy(i22, i22 + j, j, 1);
/* 109 */           MainMemory.setI32(i6, MainMemory.getI32(i6) - j);
/* 110 */           MainMemory.setI32(n, MainMemory.getI32(n) - j);
/* 111 */           MainMemory.setI32(i7, MainMemory.getI32(i7) - j);
/* 112 */           i14 = MainMemory.getI32(i8);
/* 113 */           i15 = MainMemory.getI32(i9);
/* 114 */           i16 = i14 + -1;
/* 115 */           i17 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 122 */             i18 = i15 + (i16 - i17 << 1);
/* 123 */             i19 = MainMemory.getI16(i18);
/* 124 */             MainMemory.setI16(i18, MathUtils.ult(i19 & 0xFFFF, j) ? 0 : (short)(i19 - i10));
/* 125 */             i17 += 1;
/* 126 */             if (i17 == i14) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */           i15 = MainMemory.getI32(i11);
/* 138 */           i14 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 145 */             i18 = i15 + (i12 - i14 << 1);
/* 146 */             i19 = MainMemory.getI16(i18);
/* 147 */             MainMemory.setI16(i18, MathUtils.ult(i19 & 0xFFFF, j) ? 0 : (short)(i19 - i10));
/* 148 */             i14 += 1;
/* 149 */             if (i14 == j) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           i13 += j;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */         i20 = MainMemory.getI32(paramInt);
/* 169 */         i21 = i20 + 4;
/* 170 */         i14 = MainMemory.getI32(i21);
/* 171 */         if (i14 == 0) {
/*     */           break label1184;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         i16 = MainMemory.getI32(m);
/* 182 */         i22 = MainMemory.getI32(i2) + (i16 + MainMemory.getI32(n));
/* 183 */         i13 = MathUtils.ugt(i14, i13) ? i13 : i14;
/* 184 */         if (i13 == 0) {
/* 185 */           i14 = i16;
/* 186 */           i13 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 196 */           MainMemory.setI32(i21, i14 - i13);
/* 197 */           switch (MainMemory.getI32(MainMemory.getI32(i20 + 28) + 24))
/*     */           {
/*     */           case 1: 
/*     */             break label697;
/*     */             
/*     */             break;
/*     */           case 2: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 208 */           i23 = MainMemory.getI32(i20);
/* 209 */           i21 = i20 + 48;
/* 210 */           MainMemory.setI32(i21, crc32.call(MainMemory.getI32(i21), i23, i13));
/*     */           
/*     */           break label750;
/*     */           
/*     */           label697:
/*     */           
/* 216 */           i23 = MainMemory.getI32(i20);
/* 217 */           i21 = i20 + 48;
/* 218 */           MainMemory.setI32(i21, adler32.call(MainMemory.getI32(i21), i23, i13));
/*     */           
/*     */ 
/*     */           break label750;
/*     */           
/*     */ 
/* 224 */           i23 = MainMemory.getI32(i20);
/*     */           
/*     */ 
/*     */ 
/*     */           label750:
/*     */           
/*     */ 
/*     */ 
/* 232 */           SystemLibrary.memcpy(i22, i23, i13, 1);
/* 233 */           MainMemory.setI32(i20, MainMemory.getI32(i20) + i13);
/* 234 */           i21 = i20 + 8;
/* 235 */           MainMemory.setI32(i21, MainMemory.getI32(i21) + i13);
/* 236 */           i14 = MainMemory.getI32(m);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */         i13 = i14 + i13;
/* 247 */         MainMemory.setI32(m, i13);
/* 248 */         if (!MathUtils.ugt(i13, 2)) {
/*     */           break label915;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */         i22 = MainMemory.getI32(i2);
/* 259 */         i14 = MainMemory.getI32(n);
/* 260 */         i16 = MainMemory.getI8(i22 + i14) & 0xFF;
/* 261 */         MainMemory.setI32(i3, i16);
/* 262 */         MainMemory.setI32(i3, (MainMemory.getI8(i22 + (i14 + 1)) & 0xFF ^ i16 << MainMemory.getI32(i4)) & MainMemory.getI32(i5));
/*     */         
/*     */ 
/*     */         label915:
/*     */         
/*     */ 
/* 268 */         if (MathUtils.ugt(i13, 261)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 278 */         if (MainMemory.getI32(MainMemory.getI32(paramInt) + 4) == 0) {
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
/* 289 */       i = paramInt + 5824;
/* 290 */       j = MainMemory.getI32(i);
/* 291 */       i1 = MainMemory.getI32(k);
/* 292 */       if (!MathUtils.ult(j, i1)) {
/*     */         break label1184;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 302 */       i12 = i13 + MainMemory.getI32(n);
/* 303 */       if (!MathUtils.ult(j, i12)) {
/*     */         break label1088;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */       j = i1 - i12;
/* 314 */       j = MathUtils.ugt(j, 258) ? 258 : j;
/* 315 */       SystemLibrary.memset(MainMemory.getI32(i2) + i12, (byte)0, j, 1);
/* 316 */       MainMemory.setI32(i, j + i12);
/*     */       
/*     */ 
/*     */       break label1189;
/*     */       
/*     */       label1088:
/*     */       
/* 323 */       if (!MathUtils.ult(j, i12 + 258)) {
/*     */         break label1184;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */       i12 = i12 - j + 258;
/* 334 */       i1 -= j;
/* 335 */       i1 = MathUtils.ult(i1, i12) ? i1 : i12;
/* 336 */       SystemLibrary.memset(MainMemory.getI32(i2) + j, (byte)0, i1, 1);
/* 337 */       MainMemory.setI32(i, MainMemory.getI32(i) + i1);
/*     */       
/*     */ 
/*     */ 
/*     */       label1184:
/*     */       
/*     */ 
/*     */ 
/*     */       label1189:
/*     */       
/*     */ 
/*     */ 
/* 349 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F431145.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */