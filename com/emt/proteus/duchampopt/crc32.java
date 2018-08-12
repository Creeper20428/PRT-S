/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class crc32 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3675;
/*  11 */   public static final Function _instance = new crc32();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public crc32() { super("crc32", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int m = call(i, j, k);
/*  33 */     paramFrame.setI32(paramInt1, m);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       if (paramInt2 != 0) {
/*     */         break label70;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1219;
/*     */       
/*     */       label70:
/*     */       
/*  76 */       k = paramInt1 ^ 0xFFFFFFFF;
/*  77 */       paramInt1 = 0;
/*  78 */       i7 = k;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  86 */         j = paramInt2 + paramInt1;
/*  87 */         if (paramInt1 != paramInt3)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */           if ((j & 0x3) != 0) {
/*     */             break label1169;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         k = paramInt3 - paramInt1;
/* 108 */         if (!MathUtils.ugt(k, 31))
/*     */         {
/*     */ 
/*     */ 
/* 112 */           paramInt2 = j;
/* 113 */           paramInt1 = k;
/* 114 */           k = i7;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 121 */           k = paramInt1 + 24;
/* 122 */           m = paramInt1 + 28;
/* 123 */           n = paramInt3 + -32 - paramInt1;
/* 124 */           i1 = paramInt1 + 20;
/* 125 */           i2 = paramInt1 + 16;
/* 126 */           i3 = paramInt1 + 12;
/* 127 */           i4 = paramInt1 + 8;
/* 128 */           i5 = paramInt1 + 4;
/* 129 */           i6 = 0;
/* 130 */           i8 = i7;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 138 */             paramInt3 = n + i6 * -32;
/* 139 */             i7 = i6 << 5;
/* 140 */             i8 = MainMemory.getI32(paramInt2 + (paramInt1 + i7)) ^ i8;
/* 141 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2)) ^ MainMemory.getI32(paramInt2 + (i5 + i7));
/* 142 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2)) ^ MainMemory.getI32(paramInt2 + (i4 + i7));
/* 143 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2)) ^ MainMemory.getI32(paramInt2 + (i3 + i7));
/* 144 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2)) ^ MainMemory.getI32(paramInt2 + (i2 + i7));
/* 145 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2)) ^ MainMemory.getI32(paramInt2 + (i1 + i7));
/* 146 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2)) ^ MainMemory.getI32(paramInt2 + (k + i7));
/* 147 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2)) ^ MainMemory.getI32(paramInt2 + (m + i7));
/* 148 */             i8 = MainMemory.getI32(174496 + ((i8 >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((i8 & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((i8 >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (i8 >>> 24 << 2));
/* 149 */             i6 += 1;
/* 150 */           } while (MathUtils.ugt(paramInt3, 31));
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
/* 162 */           paramInt2 += paramInt1 + 32 + i7;
/*     */           
/* 164 */           paramInt1 = paramInt3;
/* 165 */           k = i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         i9 = paramInt2;
/* 175 */         if (!MathUtils.ugt(paramInt1, 3)) {
/*     */           break label1072;
/*     */         }
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
/* 188 */         paramInt3 = paramInt1 + -4;
/* 189 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 198 */           paramInt1 = paramInt3 + m * -4;
/* 199 */           n = m + 1;
/* 200 */           k = MainMemory.getI32(paramInt2 + (m << 2)) ^ k;
/* 201 */           k = MainMemory.getI32(174496 + ((k >>> 8 & 0xFF) << 2)) ^ MainMemory.getI32(175520 + ((k & 0xFF) << 2)) ^ MainMemory.getI32(173472 + ((k >>> 16 & 0xFF) << 2)) ^ MainMemory.getI32(172448 + (k >>> 24 << 2));
/* 202 */           if (!MathUtils.ugt(paramInt1, 3)) break;
/* 203 */           m = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */         i9 += (n << 2);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1072:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         paramInt2 = i9;
/* 227 */         if (paramInt1 == 0) {
/* 228 */           paramInt1 = k;
/*     */           break label1155;
/*     */         } else {
/* 231 */           paramInt3 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 242 */           k = MainMemory.getI32(172448 + ((MainMemory.getI8(paramInt2 + paramInt3) & 0xFF ^ k & 0xFF) << 2)) ^ k >>> 8;
/* 243 */           paramInt3 += 1;
/* 244 */           if (paramInt3 == paramInt1) {
/* 245 */             paramInt1 = k; break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1155:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 258 */         i = paramInt1 ^ 0xFFFFFFFF;
/* 259 */         break;
/*     */         
/*     */ 
/*     */         label1169:
/*     */         
/*     */ 
/* 265 */         k = MainMemory.getI32(172448 + ((MainMemory.getI8(j) & 0xFF ^ i7 & 0xFF) << 2)) ^ i7 >>> 8;
/* 266 */         paramInt1 += 1;
/*     */         
/* 268 */         i7 = k;
/*     */       }
/*     */       
/*     */       label1219:
/* 272 */       int i10 = i; return i10;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/crc32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */