/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F301875_125 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  13 */   public static final Function _instance = new F301875_125();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F301875_125() { super("F301875_125", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, double paramDouble2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  20 */     call(paramInt1, paramDouble1, paramInt2, paramInt3, paramDouble2, paramInt4, paramInt5, paramInt6, paramInt7);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     call(i, d1, j, k, d2, m, n, i1, i2);
/*  54 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, double paramDouble1, int paramInt2, int paramInt3, double paramDouble2, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  60 */     int i = 0;
/*  61 */     int j = 0;
/*  62 */     int k = 0;
/*  63 */     int m = 0;
/*  64 */     int n = 0;
/*  65 */     int i1 = 0;
/*  66 */     int i2 = 0;
/*  67 */     int i3 = 0;
/*  68 */     int i4 = 0;
/*  69 */     int i5 = 0;
/*  70 */     int i6 = 0;
/*  71 */     int i7 = 0;
/*  72 */     int i8 = 0;
/*  73 */     int i9 = 0;
/*  74 */     int i10 = 0;
/*  75 */     int i11 = 0;
/*  76 */     int i12 = 0;
/*  77 */     byte b1 = 0;
/*  78 */     int i13 = 0;
/*  79 */     byte b2 = 0;
/*  80 */     byte b3 = 0;
/*  81 */     int i14 = 0;
/*  82 */     int i15 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  88 */       F301051.call(paramInt2);
/*  89 */       if (MainMemory.getI32Aligned(470852) == 0)
/*     */       {
/*  91 */         i = MainMemory.getI32Aligned(470812);
/*  92 */         j = paramInt2 + 56;
/*  93 */         i9 = MainMemory.getI32(j);
/*  94 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  99 */           i10 = i9 * i;
/* 100 */           k = paramInt1 > 1 ? 1 : 0;
/* 101 */           m = paramInt5 + paramInt4 * 344 + 56 + 32;
/* 102 */           n = paramInt5 + paramInt4 * 344 + 56 + 28;
/* 103 */           i1 = paramInt3 > 1 ? 1 : 0;
/* 104 */           i2 = paramInt5 + paramInt7 * 344 + 56 + 32;
/* 105 */           i3 = paramInt5 + paramInt7 * 344 + 56 + 28;
/* 106 */           i4 = paramInt2 + 84;
/* 107 */           i5 = paramInt2 + 88;
/* 108 */           i6 = paramInt5 + paramInt6 * 344 + 56 + 32;
/* 109 */           i7 = paramInt3 == 0 ? 1 : 0;
/* 110 */           i8 = paramInt1 == 0 ? 1 : 0;
/* 111 */           paramInt1 = (i << 3) + -8;
/* 112 */           paramInt3 = i + -1;
/* 113 */           paramInt4 = 0;
/* 114 */           paramInt6 = i10;
/* 115 */           paramInt7 = i9;
/*     */           
/*     */ 
/* 118 */           b3 = 0;
/* 119 */           b2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 129 */             i9 = paramInt1 + paramInt4 * -8;
/* 130 */             i10 = paramInt3 - paramInt4;
/* 131 */             if (paramInt7 == 0)
/*     */             {
/*     */ 
/*     */ 
/* 135 */               b1 = b3;
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 141 */               i11 = paramInt6 + -1;
/* 142 */               i12 = 0;
/*     */               
/*     */ 
/* 145 */               b1 = b3;
/* 146 */               b3 = b2;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 154 */                 i13 = i11 - i12;
/* 155 */                 if (k != 0)
/*     */                 {
/* 157 */                   paramDouble1 = MainMemory.getF64(MainMemory.getI32(m) + (i13 << 3));
/* 158 */                   b2 = MainMemory.getI8(MainMemory.getI32(n) + i13);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 167 */                 else if (i8 != 0) {
/* 168 */                   b2 = b1;
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 174 */                   paramDouble1 = MainMemory.getF64(MainMemory.getI32(m) + i9);
/* 175 */                   b2 = MainMemory.getI8(MainMemory.getI32(n) + i10);
/*     */                 }
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
/*     */ 
/*     */ 
/* 191 */                 if (i1 != 0)
/*     */                 {
/* 193 */                   paramDouble2 = MainMemory.getF64(MainMemory.getI32(i2) + (i13 << 3));
/* 194 */                   b3 = MainMemory.getI8(MainMemory.getI32(i3) + i13);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 203 */                 else if (i7 == 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */                   paramDouble2 = MainMemory.getF64(MainMemory.getI32(i2) + i9);
/* 211 */                   b3 = MainMemory.getI8(MainMemory.getI32(i3) + i10);
/*     */                 }
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
/*     */ 
/*     */ 
/* 227 */                 MainMemory.setI8(MainMemory.getI32(i4) + i13, (byte)(MathUtils.or(b3, b2) != 0 ? 1 : 0));
/* 228 */                 if (MainMemory.getI8(MainMemory.getI32(i4) + i13) == 0)
/*     */                 {
/* 230 */                   i14 = MainMemory.getI32(i5);
/* 231 */                   i15 = MainMemory.getI32(i6);
/* 232 */                   MainMemory.setI8(i14 + i13, (byte)(fits_in_region.call(paramDouble1, paramDouble2, MainMemory.getI32(i15), MainMemory.getI32(i15 + 4)) != 0 ? 1 : 0));
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */                 i12 += 1;
/* 244 */                 if (i12 == paramInt7)
/*     */                 {
/* 246 */                   paramInt6 -= paramInt7;
/*     */                   
/*     */ 
/*     */ 
/* 250 */                   b1 = b2;
/* 251 */                   b2 = b3; break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */                 b1 = b2;
/*     */               }
/*     */             }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 283 */             paramInt7 = MainMemory.getI32(j);
/* 284 */             paramInt4 += 1;
/* 285 */             if (paramInt4 == i) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 294 */             b3 = b1;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F301875_125.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */