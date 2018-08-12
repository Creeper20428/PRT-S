/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class iraf2mem_1554 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new iraf2mem_1554();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public iraf2mem_1554() { super("iraf2mem_1554", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k, m);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*  54 */     int i7 = 0;
/*  55 */     int i8 = 0;
/*  56 */     int i9 = 0;
/*  57 */     int i10 = 0;
/*  58 */     int i11 = 0;
/*  59 */     int i12 = 0;
/*  60 */     byte b1 = 0;
/*  61 */     byte b2 = 0;
/*  62 */     byte b3 = 0;
/*  63 */     byte b4 = 0;
/*  64 */     byte b5 = 0;
/*  65 */     byte b6 = 0;
/*  66 */     byte b7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  72 */       if (MainMemory.getI32Aligned(459408) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  77 */         switch (paramInt2)
/*     */         {
/*     */         case -64: 
/*  80 */           if (paramInt4 > 7)
/*     */           {
/*  82 */             paramInt2 = paramInt1 + 2;
/*  83 */             i = paramInt1 + 3;
/*  84 */             j = paramInt1 + 4;
/*  85 */             k = paramInt1 + 5;
/*  86 */             m = paramInt1 + 6;
/*  87 */             n = paramInt1 + 7;
/*  88 */             i1 = paramInt1 + 1;
/*  89 */             i2 = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/*  93 */               i3 = i2 << 3;
/*  94 */               i4 = i3 + 8;
/*  95 */               i5 = paramInt3 + (n + i3);
/*  96 */               i6 = paramInt3 + (m + i3);
/*  97 */               i7 = paramInt3 + (k + i3);
/*  98 */               i8 = paramInt3 + (j + i3);
/*  99 */               i9 = paramInt3 + (i + i3);
/* 100 */               i10 = paramInt3 + (paramInt2 + i3);
/* 101 */               i11 = paramInt3 + (i1 + i3);
/* 102 */               i12 = paramInt3 + (paramInt1 + i3);
/* 103 */               b1 = MainMemory.getI8(i12);
/* 104 */               b2 = MainMemory.getI8(i11);
/* 105 */               b3 = MainMemory.getI8(i10);
/* 106 */               b4 = MainMemory.getI8(i9);
/* 107 */               b5 = MainMemory.getI8(i8);
/* 108 */               b6 = MainMemory.getI8(i7);
/* 109 */               b7 = MainMemory.getI8(i6);
/* 110 */               MainMemory.setI8(i12, MainMemory.getI8(i5));
/* 111 */               MainMemory.setI8(i11, b7);
/* 112 */               MainMemory.setI8(i10, b6);
/* 113 */               MainMemory.setI8(i9, b5);
/* 114 */               MainMemory.setI8(i8, b4);
/* 115 */               MainMemory.setI8(i7, b3);
/* 116 */               MainMemory.setI8(i6, b2);
/* 117 */               MainMemory.setI8(i5, b1);
/* 118 */               i2 += 1;
/* 119 */               if (i4 >= paramInt4) break;
/*     */             } }
/* 121 */           break;
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
/*     */         case -32: 
/* 140 */           if (paramInt4 > 3)
/*     */           {
/* 142 */             paramInt2 = paramInt1 + 1;
/* 143 */             i = paramInt1 + 2;
/* 144 */             j = paramInt1 + 3;
/* 145 */             m = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 149 */               n = m << 2;
/* 150 */               k = n + 4;
/* 151 */               i5 = paramInt3 + (j + n);
/* 152 */               i6 = paramInt3 + (i + n);
/* 153 */               i7 = paramInt3 + (paramInt2 + n);
/* 154 */               i8 = paramInt3 + (paramInt1 + n);
/* 155 */               b1 = MainMemory.getI8(i8);
/* 156 */               b2 = MainMemory.getI8(i7);
/* 157 */               b3 = MainMemory.getI8(i6);
/* 158 */               MainMemory.setI8(i8, MainMemory.getI8(i5));
/* 159 */               MainMemory.setI8(i7, b3);
/* 160 */               MainMemory.setI8(i6, b2);
/* 161 */               MainMemory.setI8(i5, b1);
/* 162 */               m += 1;
/* 163 */               if (k >= paramInt4) break;
/*     */             } }
/* 165 */           break;
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
/*     */         case -16: 
/* 184 */           if (paramInt4 > 1)
/*     */           {
/* 186 */             paramInt2 = paramInt1 + 1;
/* 187 */             j = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 191 */               k = j << 1;
/* 192 */               i = k + 2;
/* 193 */               i5 = paramInt3 + (paramInt2 + k);
/* 194 */               i6 = paramInt3 + (paramInt1 + k);
/* 195 */               b1 = MainMemory.getI8(i6);
/* 196 */               MainMemory.setI8(i6, MainMemory.getI8(i5));
/* 197 */               MainMemory.setI8(i5, b1);
/* 198 */               j += 1;
/* 199 */               if (i >= paramInt4) break;
/*     */             } }
/* 201 */           break;
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
/*     */         case 16: 
/* 220 */           if (paramInt4 > 1)
/*     */           {
/* 222 */             paramInt2 = paramInt1 + 1;
/* 223 */             j = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 227 */               k = j << 1;
/* 228 */               i = k + 2;
/* 229 */               i5 = paramInt3 + (paramInt2 + k);
/* 230 */               i6 = paramInt3 + (paramInt1 + k);
/* 231 */               b1 = MainMemory.getI8(i6);
/* 232 */               MainMemory.setI8(i6, MainMemory.getI8(i5));
/* 233 */               MainMemory.setI8(i5, b1);
/* 234 */               j += 1;
/* 235 */               if (i >= paramInt4) break;
/*     */             } }
/* 237 */           break;
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
/*     */         case 32: 
/* 256 */           if (paramInt4 > 3)
/*     */           {
/* 258 */             paramInt2 = paramInt1 + 1;
/* 259 */             i = paramInt1 + 2;
/* 260 */             j = paramInt1 + 3;
/* 261 */             m = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 265 */               n = m << 2;
/* 266 */               k = n + 4;
/* 267 */               i5 = paramInt3 + (j + n);
/* 268 */               i6 = paramInt3 + (i + n);
/* 269 */               i7 = paramInt3 + (paramInt2 + n);
/* 270 */               i8 = paramInt3 + (paramInt1 + n);
/* 271 */               b1 = MainMemory.getI8(i8);
/* 272 */               b2 = MainMemory.getI8(i7);
/* 273 */               b3 = MainMemory.getI8(i6);
/* 274 */               MainMemory.setI8(i8, MainMemory.getI8(i5));
/* 275 */               MainMemory.setI8(i7, b3);
/* 276 */               MainMemory.setI8(i6, b2);
/* 277 */               MainMemory.setI8(i5, b1);
/* 278 */               m += 1;
/* 279 */               if (k >= paramInt4) break;
/*     */             } }
/* 281 */           break;
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/iraf2mem_1554.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */