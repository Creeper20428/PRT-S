/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffgcll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3358;
/*  14 */   public static final Function _instance = new ffgcll();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgcll() { super("ffgcll", 11, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, paramInt3, paramByte, paramInt4, paramInt5, paramInt6, paramInt7);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     long l3 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     call(i, j, l1, l2, l3, k, b, m, n, i1, i2);
/*  61 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, int paramInt3, byte paramByte, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  67 */     int i = 0;
/*  68 */     int j = 0;
/*  69 */     int k = 0;
/*  70 */     int m = 0;
/*  71 */     int n = 0;
/*  72 */     int i1 = 0;
/*  73 */     int i2 = 0;
/*  74 */     int i3 = 0;
/*  75 */     int i4 = 0;
/*  76 */     int i5 = 0;
/*  77 */     int i6 = 0;
/*  78 */     int i7 = 0;
/*  79 */     int i8 = 0;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     int i12 = 0;
/*  84 */     boolean bool = false;
/*  85 */     long l1 = 0L;
/*  86 */     int i13 = 0;
/*  87 */     long l2 = 0L;
/*  88 */     long l3 = 0L;
/*  89 */     int i14 = 0;
/*  90 */     long l4 = 0L;
/*  91 */     int i15 = 0;
/*  92 */     int i16 = 0;
/*  93 */     int i17 = 0;
/*  94 */     int i18 = 0;
/*  95 */     int i19 = 0;
/*  96 */     byte b = 0;
/*  97 */     double d1 = 0.0D;
/*  98 */     double d2 = 0.0D;
/*  99 */     int i20 = 0;
/* 100 */     long l5 = 0L;
/* 101 */     int i21 = 0;
/* 102 */     long l6 = 0L;
/* 103 */     long l7 = 0L;
/*     */     
/*     */ 
/* 106 */     int i22 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 110 */       i = MainMemory.alloc(4);
/* 111 */       j = MainMemory.alloc(4);
/* 112 */       k = MainMemory.alloc(4);
/* 113 */       m = MainMemory.alloc(4);
/* 114 */       n = MainMemory.alloc(4);
/* 115 */       i1 = MainMemory.alloc(8);
/* 116 */       i2 = MainMemory.alloc(8);
/* 117 */       i3 = MainMemory.alloc(8);
/* 118 */       i4 = MainMemory.alloc(8);
/* 119 */       i5 = MainMemory.alloc(8);
/* 120 */       i6 = MainMemory.alloc(8);
/* 121 */       i7 = MainMemory.alloc(8);
/* 122 */       i8 = MainMemory.alloc(20);
/* 123 */       i9 = MainMemory.alloc(81);
/* 124 */       i10 = MainMemory.alloc(20);
/* 125 */       i11 = MainMemory.alloc(28800);
/* 126 */       if ((MainMemory.getI32(paramInt7) > 0) || (paramLong3 != 0L))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         i12 = paramInt6 == 0 ? 1 : 0;
/* 137 */         if (i12 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           MainMemory.setI32(paramInt6, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 153 */         bool = paramInt3 == 2;
/* 154 */         if (!bool) {
/*     */           break label333;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */         SystemLibrary.memset(paramInt5, (byte)0, (int)paramLong3, 1);
/*     */         
/*     */ 
/*     */         label333:
/*     */         
/*     */ 
/* 170 */         if (ffgcprll.call(paramInt1, paramInt2, paramLong1, paramLong2, paramLong3, 0, i6, i7, i8, m, i, j, i2, i3, n, i1, i5, k, i4, i10, paramInt7) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */           if (MainMemory.getI32(i) != 14) {
/*     */             break label1154;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 190 */           i14 = (int)paramLong3;
/* 191 */           bool = (bool) && ((paramByte != 0) || (paramInt3 != 1));
/* 192 */           paramInt2 = MainMemory.getI32(j);
/* 193 */           paramLong1 = MainMemory.getI64(i5);
/* 194 */           paramInt3 = MainMemory.getI32(n);
/* 195 */           paramLong2 = paramInt3;
/* 196 */           l1 = MainMemory.getI64(i2);
/* 197 */           i13 = paramInt2 ^ 0xFFFFFFFF;
/* 198 */           l5 = MainMemory.getI64(i3);
/*     */           
/* 200 */           i21 = i14;
/* 201 */           l6 = 0L;
/*     */           
/* 203 */           l7 = 0L;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 214 */         if (i21 != 0) {
/*     */           break label524;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */         break;
/*     */         
/*     */ 
/*     */         label524:
/*     */         
/*     */ 
/* 230 */         l4 = MainMemory.getI64(i1);
/* 231 */         l2 = l4 - l5;
/* 232 */         l3 = paramInt2 <= i21 ? paramInt2 : i21;
/* 233 */         i14 = (int)(l2 <= l3 ? l2 : l3);
/* 234 */         ffgi1b.call(paramInt1, l1 + paramLong1 * l6 + paramLong2 * l5, i14, paramInt3, i11, paramInt7);
/* 235 */         if (i14 <= 0) {
/*     */           break label930;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */         l4 = l5 + -1L - l4;
/* 247 */         i21 ^= 0xFFFFFFFF;
/* 248 */         l2 = (i21 > i13 ? i21 : i13) ^ 0xFFFFFFFF ^ 0xFFFFFFFFFFFFFFFF;
/* 249 */         i21 = (int)((l4 > l2 ? l4 : l2) ^ 0xFFFFFFFF);
/* 250 */         l4 = i21 + -1 & 0xFFFFFFFF;
/* 251 */         i15 = (int)l7;
/* 252 */         i16 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 259 */           i17 = i15 + i16;
/* 260 */           i18 = paramInt4 + i17;
/* 261 */           i19 = paramInt5 + i17;
/* 262 */           b = MainMemory.getI8(i11 + i16);
/* 263 */           switch (b)
/*     */           {
/*     */           case 84: 
/*     */             break label862;
/*     */             break;
/*     */           case 70: 
/*     */             break label846;
/*     */             break;
/*     */           case 0: 
/*     */             break;
/*     */           }
/*     */           
/* 275 */           MainMemory.setI8(i18, paramByte);
/* 276 */           if (i12 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */             MainMemory.setI32(paramInt6, 1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 292 */           ffgcll_979.call(bool, i19);
/*     */           
/*     */           break label890;
/*     */           
/*     */           label846:
/* 297 */           MainMemory.setI8(i18, (byte)0);
/*     */           
/*     */           break label890;
/*     */           
/*     */           label862:
/* 302 */           MainMemory.setI8(i18, (byte)1);
/*     */           
/*     */ 
/*     */           break label890;
/*     */           
/* 307 */           MainMemory.setI8(i18, b);
/*     */           
/*     */ 
/*     */           label890:
/*     */           
/*     */ 
/* 313 */           i16 += 1;
/* 314 */           if (i16 == i21) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */         l7 = l7 + 1L + l4;
/*     */         
/*     */ 
/*     */ 
/*     */         label930:
/*     */         
/*     */ 
/*     */ 
/* 333 */         if (MainMemory.getI32(paramInt7) <= 0) {
/*     */           break label1018;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */         d1 = l7;
/* 344 */         d2 = i14;
/* 345 */         d2 += d1;
/* 346 */         d1 += 1.0D;
/* 347 */         SystemLibrary.sprintf(i9, 137184, new Object[] { Double.valueOf(d1), Double.valueOf(d2) });
/* 348 */         ffxmsg.call(5, i9);
/* 349 */         break;
/*     */         
/*     */ 
/*     */         label1018:
/*     */         
/*     */ 
/* 355 */         l2 = i14;
/* 356 */         l4 = paramLong3 - l2;
/* 357 */         if (paramLong3 == l2) {
/* 358 */           paramLong3 = l5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 369 */           paramLong3 = l5 + l2;
/* 370 */           i20 = paramLong3 == MainMemory.getI64(i1) ? 1 : 0;
/* 371 */           l5 = l6 + (i20 != 0 ? 1 : 0);
/* 372 */           if (i20 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 377 */             l6 = l5;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 384 */             paramLong3 = 0L;
/* 385 */             l6 = l5;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 393 */         i14 = (int)l4;
/* 394 */         l5 = paramLong3;
/* 395 */         i21 = i14;
/*     */         
/* 397 */         paramLong3 = l4;
/*     */       }
/*     */       
/*     */ 
/*     */       label1154:
/*     */       
/* 403 */       MainMemory.setI32(paramInt7, 310);
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
/* 414 */       MainMemory.dealloc_generated(i22);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgcll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */