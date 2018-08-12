/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F418530 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3649;
/*  11 */   public static final Function _instance = new F418530();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F418530() { super("F418530", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n, i1);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  49 */     int i = 0;
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
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*  69 */     int i16 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  75 */       i = 1 << paramInt6;
/*  76 */       j = paramInt3 + -1;
/*  77 */       if (j <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  81 */         j = 0;
/*  82 */         i11 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  89 */         k = paramInt4 + -1;
/*  90 */         m = k > 0 ? 1 : 0;
/*  91 */         n = paramInt2 + 1;
/*  92 */         i1 = paramInt2 + 2;
/*  93 */         i2 = paramInt2 << 1;
/*  94 */         i3 = 0;
/*  95 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 103 */           i5 = i2 * i3;
/* 104 */           i6 = i1 + i5;
/* 105 */           i7 = n + i5;
/* 106 */           i8 = i5 + paramInt2;
/* 107 */           i9 = i5 + 2;
/* 108 */           i10 = i5 | 0x1;
/* 109 */           i11 = (i3 << 1) + 2;
/* 110 */           if (m == 0)
/*     */           {
/*     */ 
/*     */ 
/* 114 */             i6 = i5;
/* 115 */             i14 = i8;
/*     */             
/* 117 */             i15 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 124 */             i12 = i4 + 1;
/* 125 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 132 */               i14 = i13 << 1;
/* 133 */               i15 = i14 + 2;
/* 134 */               MainMemory.setI8(paramInt5 + (i4 + i13), (byte)(((MainMemory.getI32(paramInt1 + (i8 + i14 << 2)) & i) << 1 | MainMemory.getI32(paramInt1 + (i7 + i14 << 2)) & i | (MainMemory.getI32(paramInt1 + (i10 + i14 << 2)) & i) << 2 | (MainMemory.getI32(paramInt1 + (i5 + i14 << 2)) & i) << 3) >> paramInt6));
/* 135 */               i16 = i13 + 1;
/* 136 */               if (k <= i15) break;
/* 137 */               i13 = i16;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */             i4 = i12 + i13;
/* 148 */             i8 = i9 + i14;
/* 149 */             i14 = i6 + i14;
/* 150 */             i6 = i8;
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
/* 163 */           if (i15 >= paramInt4)
/*     */           {
/*     */ 
/*     */ 
/* 167 */             i15 = i4;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 174 */             MainMemory.setI8(paramInt5 + i4, (byte)(((MainMemory.getI32(paramInt1 + (i6 << 2)) & i) << 3 | (MainMemory.getI32(paramInt1 + (i14 << 2)) & i) << 1) >> paramInt6));
/* 175 */             i15 = i4 + 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           i3 += 1;
/* 184 */           if (j <= i11)
/*     */             break;
/* 186 */           i4 = i15;
/*     */         }
/*     */         break label493;
/* 189 */         j = i15;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label493:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 200 */       if (i11 >= paramInt3) {
/*     */         break label736;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */       k = i11 * paramInt2;
/* 211 */       n = paramInt4 + -1;
/* 212 */       if (n <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 216 */         paramInt3 = k;
/* 217 */         i11 = j;
/* 218 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 225 */         i1 = k + 1;
/* 226 */         paramInt3 = k + 2;
/* 227 */         i2 = j + 1;
/* 228 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 235 */           i11 = i3 << 1;
/* 236 */           paramInt2 = i11 + 2;
/* 237 */           MainMemory.setI8(paramInt5 + (j + i3), (byte)(((MainMemory.getI32(paramInt1 + (k + i11 << 2)) & i) << 3 | (MainMemory.getI32(paramInt1 + (i1 + i11 << 2)) & i) << 2) >> paramInt6));
/* 238 */           i15 = i3 + 1;
/* 239 */           if (n <= paramInt2) break;
/* 240 */           i3 = i15;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */         j = i2 + i3;
/* 251 */         paramInt3 += i11;
/*     */         
/* 253 */         i11 = j;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 263 */       if (paramInt2 >= paramInt4) {
/*     */         break label736;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       MainMemory.setI8(paramInt5 + i11, (byte)((MainMemory.getI32(paramInt1 + (paramInt3 << 2)) & i) << 3 >> paramInt6));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label736:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F418530.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */