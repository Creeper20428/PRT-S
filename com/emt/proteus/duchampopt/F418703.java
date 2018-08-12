/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F418703 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3650;
/*  11 */   public static final Function _instance = new F418703();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F418703() { super("F418703", 6, false); }
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
/*  49 */     long l1 = 0L;
/*  50 */     long l2 = 0L;
/*  51 */     int i = 0;
/*  52 */     int j = 0;
/*  53 */     int k = 0;
/*  54 */     int m = 0;
/*  55 */     int n = 0;
/*  56 */     int i1 = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*  59 */     int i4 = 0;
/*  60 */     int i5 = 0;
/*  61 */     int i6 = 0;
/*  62 */     int i7 = 0;
/*  63 */     int i8 = 0;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*  67 */     int i12 = 0;
/*  68 */     int i13 = 0;
/*  69 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  75 */       l1 = paramInt6 & 0xFFFFFFFF;
/*  76 */       l2 = 1L << (int)l1;
/*  77 */       i = paramInt3 + -1;
/*  78 */       if (i <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  82 */         i = 0;
/*  83 */         paramInt6 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  90 */         j = paramInt4 + -1;
/*  91 */         k = j > 0 ? 1 : 0;
/*  92 */         m = paramInt2 + 1;
/*  93 */         n = paramInt2 + 2;
/*  94 */         i1 = paramInt2 << 1;
/*  95 */         i2 = 0;
/*  96 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 104 */           i4 = i1 * i2;
/* 105 */           i5 = n + i4;
/* 106 */           i6 = m + i4;
/* 107 */           i7 = i4 + paramInt2;
/* 108 */           i8 = i4 + 2;
/* 109 */           i9 = i4 | 0x1;
/* 110 */           paramInt6 = (i2 << 1) + 2;
/* 111 */           if (k == 0)
/*     */           {
/*     */ 
/*     */ 
/* 115 */             i5 = i4;
/* 116 */             i12 = i7;
/*     */             
/* 118 */             i13 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 125 */             i10 = i3 + 1;
/* 126 */             i11 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 133 */               i12 = i11 << 1;
/* 134 */               i13 = i12 + 2;
/* 135 */               MainMemory.setI8(paramInt5 + (i3 + i11), (byte)(int)(((MainMemory.getI64(paramInt1 + (i7 + i12 << 3)) & l2) << 1 | MainMemory.getI64(paramInt1 + (i6 + i12 << 3)) & l2 | (MainMemory.getI64(paramInt1 + (i9 + i12 << 3)) & l2) << 2 | (MainMemory.getI64(paramInt1 + (i4 + i12 << 3)) & l2) << 3) >> (int)l1));
/* 136 */               i14 = i11 + 1;
/* 137 */               if (j <= i13) break;
/* 138 */               i11 = i14;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */             i3 = i10 + i11;
/* 149 */             i7 = i8 + i12;
/* 150 */             i12 = i5 + i12;
/* 151 */             i5 = i7;
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
/* 164 */           if (i13 >= paramInt4)
/*     */           {
/*     */ 
/*     */ 
/* 168 */             i13 = i3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 175 */             MainMemory.setI8(paramInt5 + i3, (byte)(int)(((MainMemory.getI64(paramInt1 + (i5 << 3)) & l2) << 3 | (MainMemory.getI64(paramInt1 + (i12 << 3)) & l2) << 1) >> (int)l1));
/* 176 */             i13 = i3 + 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */           i2 += 1;
/* 185 */           if (i <= paramInt6)
/*     */             break;
/* 187 */           i3 = i13;
/*     */         }
/*     */         break label507;
/* 190 */         i = i13;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label507:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 201 */       if (paramInt6 >= paramInt3) {
/*     */         break label754;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */       j = paramInt6 * paramInt2;
/* 212 */       m = paramInt4 + -1;
/* 213 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 217 */         paramInt3 = j;
/* 218 */         paramInt6 = i;
/* 219 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 226 */         n = j + 1;
/* 227 */         paramInt3 = j + 2;
/* 228 */         i1 = i + 1;
/* 229 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 236 */           paramInt6 = i2 << 1;
/* 237 */           paramInt2 = paramInt6 + 2;
/* 238 */           MainMemory.setI8(paramInt5 + (i + i2), (byte)(int)(((MainMemory.getI64(paramInt1 + (j + paramInt6 << 3)) & l2) << 3 | (MainMemory.getI64(paramInt1 + (n + paramInt6 << 3)) & l2) << 2) >> (int)l1));
/* 239 */           i13 = i2 + 1;
/* 240 */           if (m <= paramInt2) break;
/* 241 */           i2 = i13;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */         i = i1 + i2;
/* 252 */         paramInt3 += paramInt6;
/*     */         
/* 254 */         paramInt6 = i;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */       if (paramInt2 >= paramInt4) {
/*     */         break label754;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */       MainMemory.setI8(paramInt5 + paramInt6, (byte)(int)((MainMemory.getI64(paramInt1 + (paramInt3 << 3)) & l2) << 3 >> (int)l1));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label754:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F418703.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */