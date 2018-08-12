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
/*     */ public final class _ZN7duchamp4Cube12setupColumnsEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1342;
/*  15 */   public static final Function _instance = new _ZN7duchamp4Cube12setupColumnsEv();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp4Cube12setupColumnsEv() { super("_ZN7duchamp4Cube12setupColumnsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     call(paramInt);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*  54 */     int i12 = 0;
/*  55 */     int i13 = 0;
/*  56 */     int i14 = 0;
/*  57 */     int i15 = 0;
/*  58 */     int i16 = 0;
/*  59 */     int i17 = 0;
/*  60 */     int i18 = 0;
/*  61 */     int i19 = 0;
/*  62 */     int i20 = 0;
/*     */     
/*     */ 
/*  65 */     int i21 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  69 */       i = MainMemory.alloc(12);
/*  70 */       j = MainMemory.alloc(12);
/*  71 */       k = paramInt + 28;
/*  72 */       i6 = MainMemory.getI32(k);
/*  73 */       m = MainMemory.getI32(i6);
/*  74 */       if (!MathUtils.ult(m, MainMemory.getI32(i6 + 4))) {
/*     */         break label346;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       n = paramInt + 232;
/*  86 */       i1 = paramInt + 228;
/*  87 */       i2 = paramInt + 236;
/*  88 */       i12 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/*  95 */         i19 = m + i12 * 276 + 264;
/*  96 */         i20 = m + i12 * 276 + 256;
/*  97 */         i3 = m + i12 * 276 + 252;
/*  98 */         i4 = m + i12 * 276 + 260;
/*  99 */         i5 = m + i12 * 276 + 272;
/* 100 */         MainMemory.setI32(m + i12 * 276 + 268, MainMemory.getI32(n));
/* 101 */         MainMemory.setI32(i19, MainMemory.getI32(i1));
/* 102 */         MainMemory.setI32(i20, 1);
/* 103 */         MainMemory.setI32(i3, 2);
/* 104 */         MainMemory.setI32(i4, MainMemory.getI32(i1));
/* 105 */         MainMemory.setI32(i5, MainMemory.getI32(i2));
/* 106 */         i12 += 1;
/* 107 */         i6 = MainMemory.getI32(k);
/* 108 */       } while (MathUtils.ult(m + i12 * 276, MainMemory.getI32(i6 + 4)));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label346:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 121 */       i7 = paramInt + 752;
/* 122 */       i11 = MainMemory.getI32(i7);
/* 123 */       i8 = paramInt + 756;
/* 124 */       i9 = MainMemory.getI32(i8);
/* 125 */       if (i9 == i11) {
/*     */         break label466;
/*     */       }
/*     */       else {
/* 129 */         i12 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 138 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i11 + i12 * 24)), i11 + i12 * 24);
/* 139 */         i12 += 1;
/* 140 */         if (i11 + i12 * 24 == i9) {
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
/* 151 */       i6 = MainMemory.getI32(k);
/*     */       
/*     */ 
/*     */ 
/*     */       label466:
/*     */       
/*     */ 
/*     */ 
/* 159 */       MainMemory.setI32(i8, i11);
/* 160 */       i10 = paramInt + 648;
/* 161 */       _ZN7duchamp6Column13getFullColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE.call(j, i6, i10);
/* 162 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_.call(paramInt + 752, j);
/* 163 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(j);
/* 164 */       i11 = MainMemory.getI32(paramInt + 764);
/* 165 */       i8 = paramInt + 768;
/* 166 */       i9 = MainMemory.getI32(i8);
/* 167 */       if (i9 == i11) {
/*     */         break label606;
/*     */       } else {
/* 170 */         i12 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 179 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i11 + i12 * 24)), i11 + i12 * 24);
/* 180 */         i12 += 1;
/* 181 */         if (i11 + i12 * 24 == i9) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label606:
/*     */       
/*     */ 
/*     */ 
/* 192 */       MainMemory.setI32(i8, i11);
/* 193 */       _ZN7duchamp6Column12getLogColSetERSt6vectorINS_9DetectionESaIS2_EERNS_10FitsHeaderE.call(i, MainMemory.getI32(k), i10);
/* 194 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEaSERKS4_.call(paramInt + 764, i);
/* 195 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(i);
/* 196 */       i11 = MainMemory.getI32(i7);
/* 197 */       i12 = MainMemory.getI32(i11 + 224);
/* 198 */       i13 = MainMemory.getI32(i11 + 416);
/* 199 */       i14 = MainMemory.getI32(i11 + 440);
/* 200 */       i15 = MainMemory.getI32(i11 + 56);
/* 201 */       i16 = MainMemory.getI32(i11 + 80);
/* 202 */       i15 = i15 < i16 ? i16 : i15;
/* 203 */       i16 = MainMemory.getI32(i11 + 104);
/* 204 */       i15 = i15 < i16 ? i16 : i15;
/* 205 */       if (MainMemory.getI8(paramInt + 660) != 0) {
/*     */         break label780;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */       n = i11 + 392;
/*     */       
/*     */       break label793;
/*     */       
/*     */       label780:
/*     */       
/* 221 */       n = i11 + 368;
/*     */       
/*     */ 
/*     */ 
/*     */       label793:
/*     */       
/*     */ 
/*     */ 
/* 229 */       i16 = MainMemory.getI32(n);
/* 230 */       i17 = MainMemory.getI32(i11 + 248);
/* 231 */       i18 = MainMemory.getI32(i11 + 272);
/* 232 */       i17 = i17 < i18 ? i18 : i17;
/* 233 */       i6 = MainMemory.getI32(k);
/* 234 */       m = MainMemory.getI32(i6);
/* 235 */       if (MathUtils.ult(m, MainMemory.getI32(i6 + 4))) {
/* 236 */         i18 = 0;
/*     */       } else {
/*     */         break label1050;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 247 */         n = m + i18 * 276 + 264;
/* 248 */         i1 = m + i18 * 276 + 256;
/* 249 */         i2 = m + i18 * 276 + 252;
/* 250 */         i19 = m + i18 * 276 + 260;
/* 251 */         i20 = m + i18 * 276 + 272;
/* 252 */         MainMemory.setI32(m + i18 * 276 + 268, i12);
/* 253 */         MainMemory.setI32(n, i13);
/* 254 */         MainMemory.setI32(i1, i15);
/* 255 */         MainMemory.setI32(i2, i17);
/* 256 */         MainMemory.setI32(i19, i16);
/* 257 */         MainMemory.setI32(i20, i14);
/* 258 */         i18 += 1;
/* 259 */       } while (MathUtils.ult(m + i18 * 276, MainMemory.getI32(MainMemory.getI32(k) + 4)));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1050:
/*     */       
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
/* 280 */       MainMemory.dealloc_generated(i21);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12setupColumnsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */