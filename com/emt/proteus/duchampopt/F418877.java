/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F418877 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3651;
/*  11 */   public static final Function _instance = new F418877();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F418877() { super("F418877", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k, m, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     int i12 = 0;
/*  63 */     int i13 = 0;
/*  64 */     int i14 = 0;
/*  65 */     int i15 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  71 */       i = paramInt3 + -1;
/*  72 */       if (i <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  76 */         i = 0;
/*  77 */         i10 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  84 */         j = paramInt4 + -1;
/*  85 */         k = j > 0 ? 1 : 0;
/*  86 */         m = paramInt2 + 1;
/*  87 */         n = paramInt2 + 2;
/*  88 */         i1 = paramInt2 << 1;
/*  89 */         i2 = 0;
/*  90 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  98 */           i4 = i1 * i2;
/*  99 */           i5 = n + i4;
/* 100 */           i6 = m + i4;
/* 101 */           i7 = i4 + paramInt2;
/* 102 */           i8 = i4 + 2;
/* 103 */           i9 = i4 | 0x1;
/* 104 */           i10 = (i2 << 1) + 2;
/* 105 */           if (k == 0)
/*     */           {
/*     */ 
/*     */ 
/* 109 */             i5 = i4;
/* 110 */             i13 = i7;
/*     */             
/* 112 */             i14 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 119 */             i11 = i3 + 1;
/* 120 */             i12 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 127 */               i13 = i12 << 1;
/* 128 */               i14 = i13 + 2;
/* 129 */               MainMemory.setI8(paramInt5 + (i3 + i12), MathUtils.or(MathUtils.or(MathUtils.or((byte)(MainMemory.getI8(paramInt1 + (i7 + i13)) == 0 ? 0 : 2), (byte)(MainMemory.getI8(paramInt1 + (i6 + i13)) != 0 ? 1 : 0)), (byte)(MainMemory.getI8(paramInt1 + (i9 + i13)) == 0 ? 0 : 4)), (byte)(MainMemory.getI8(paramInt1 + (i4 + i13)) == 0 ? 0 : 8)));
/* 130 */               i15 = i12 + 1;
/* 131 */               if (j <= i14) break;
/* 132 */               i12 = i15;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */             i3 = i11 + i12;
/* 143 */             i7 = i8 + i13;
/* 144 */             i13 = i5 + i13;
/* 145 */             i5 = i7;
/*     */           }
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
/* 158 */           if (i14 >= paramInt4)
/*     */           {
/*     */ 
/*     */ 
/* 162 */             i14 = i3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 169 */             MainMemory.setI8(paramInt5 + i3, MathUtils.or((byte)(MainMemory.getI8(paramInt1 + i5) == 0 ? 0 : 8), (byte)(MainMemory.getI8(paramInt1 + i13) == 0 ? 0 : 2)));
/* 170 */             i14 = i3 + 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */           i2 += 1;
/* 179 */           if (i <= i10)
/*     */             break;
/* 181 */           i3 = i14;
/*     */         }
/*     */         break label495;
/* 184 */         i = i14;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label495:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 195 */       if (i10 >= paramInt3) {
/*     */         break label737;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */       j = i10 * paramInt2;
/* 206 */       m = paramInt4 + -1;
/* 207 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 211 */         paramInt3 = j;
/* 212 */         i10 = i;
/* 213 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 220 */         n = j + 1;
/* 221 */         paramInt3 = j + 2;
/* 222 */         i1 = i + 1;
/* 223 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 230 */           i10 = i2 << 1;
/* 231 */           paramInt2 = i10 + 2;
/* 232 */           MainMemory.setI8(paramInt5 + (i + i2), MathUtils.or((byte)(MainMemory.getI8(paramInt1 + (j + i10)) == 0 ? 0 : 8), (byte)(MainMemory.getI8(paramInt1 + (n + i10)) == 0 ? 0 : 4)));
/* 233 */           i14 = i2 + 1;
/* 234 */           if (m <= paramInt2) break;
/* 235 */           i2 = i14;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 245 */         i = i1 + i2;
/* 246 */         paramInt3 += i10;
/*     */         
/* 248 */         i10 = i;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */       if (paramInt2 >= paramInt4) {
/*     */         break label737;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 268 */       MainMemory.setI8(paramInt5 + i10, (byte)(MainMemory.getI8(paramInt1 + paramInt3) == 0 ? 0 : 8));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label737:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F418877.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */