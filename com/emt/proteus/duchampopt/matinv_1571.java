/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class matinv_1571 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new matinv_1571();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public matinv_1571() { super("matinv_1571", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
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
/*  33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, k, bool, m, n, i1, i2, i3, i4);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     int n = 0;
/*  66 */     int i1 = 0;
/*  67 */     int i2 = 0;
/*  68 */     int i3 = 0;
/*  69 */     int i4 = 0;
/*  70 */     int i5 = 0;
/*  71 */     int i6 = 0;
/*  72 */     int i7 = 0;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*  75 */     int i10 = 0;
/*  76 */     int i11 = 0;
/*  77 */     int i12 = 0;
/*  78 */     double d1 = 0.0D;
/*  79 */     int i13 = 0;
/*  80 */     double d2 = 0.0D;
/*  81 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  87 */       if (paramBoolean) {
/*  88 */         i = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  92 */           MainMemory.setI32(paramInt2 + (MainMemory.getI32(paramInt3 + (i << 2)) << 2), i);
/*  93 */           i += 1;
/*  94 */           if (i == paramInt7)
/*     */           {
/*  96 */             if (!paramBoolean) break;
/*  97 */             i = 0;
/*  98 */             j = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 103 */             k = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 107 */               MainMemory.setF64(paramInt9 + (j + k << 3), 0.0D);
/* 108 */               k += 1;
/* 109 */               if (k == paramInt7)
/*     */               {
/* 111 */                 j += paramInt7;
/* 112 */                 i += 1;
/* 113 */                 if (i == paramInt7)
/*     */                 {
/* 115 */                   if (!paramBoolean)
/*     */                     break label738;
/* 117 */                   paramBoolean = paramInt4 > -1;
/* 118 */                   i = -8 - paramInt6;
/* 119 */                   j = paramInt5 << 3;
/* 120 */                   k = paramInt4 * (paramInt7 + 1) << 3;
/* 121 */                   m = paramInt4 * paramInt7;
/* 122 */                   n = 0 - paramInt7;
/* 123 */                   i1 = 0;
/*     */                   
/*     */                   for (;;)
/*     */                   {
/* 127 */                     i2 = m + i1;
/* 128 */                     i3 = paramInt5 + i1;
/* 129 */                     i4 = MainMemory.getI32(paramInt1 + (i1 << 2));
/* 130 */                     i5 = i1 + i4 * paramInt7;
/* 131 */                     MainMemory.setF64(paramInt9 + (i5 << 3), 1.0D);
/* 132 */                     i6 = i4 + 1;
/* 133 */                     if (i6 < paramInt7)
/*     */                     {
/* 135 */                       i7 = paramInt4 - i4;
/* 136 */                       i9 = i6 * paramInt7;
/* 137 */                       i8 = i4 + i9 << 3;
/* 138 */                       i9 = i1 + i9;
/* 139 */                       i13 = 0;
/*     */                       
/*     */                       for (;;)
/*     */                       {
/* 143 */                         i10 = i8 + paramInt6 * i13;
/* 144 */                         i11 = i13 + 1;
/* 145 */                         i12 = paramInt9 + (i9 + i13 * paramInt7 << 3);
/* 146 */                         if (i4 < i6 + i13)
/*     */                         {
/* 148 */                           d1 = MainMemory.getF64(i12);
/*     */                           
/* 150 */                           i13 = 0;
/*     */                           
/*     */ 
/*     */                           for (;;)
/*     */                           {
/* 155 */                             d2 = MainMemory.getF64(paramInt8 + (i10 + (i13 << 3))) * MainMemory.getF64(paramInt9 + (i5 + i13 * paramInt7 << 3));
/* 156 */                             d1 -= d2;
/* 157 */                             MainMemory.setF64(i12, d1);
/* 158 */                             i13 += 1;
/* 159 */                             if (i13 == i11) {
/*     */                               break;
/*     */                             }
/*     */                           }
/*     */                         }
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
/* 178 */                         if (i11 == i7) {
/*     */                           break;
/*     */                         }
/*     */                         
/* 182 */                         i13 = i11;
/*     */                       }
/*     */                     }
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
/* 198 */                     if (paramBoolean) {
/* 199 */                       i4 = 0;
/*     */                       
/*     */                       for (;;)
/*     */                       {
/* 203 */                         i5 = i4 * n;
/* 204 */                         i12 = paramInt9 + (i2 + i5 << 3);
/* 205 */                         i5 = i3 + i5;
/* 206 */                         i7 = i * i4;
/* 207 */                         i6 = j + i7;
/* 208 */                         i14 = paramInt8 + (k + i7);
/* 209 */                         d1 = MainMemory.getF64(i12);
/* 210 */                         if (paramInt7 - i4 < paramInt7) {
/* 211 */                           i7 = 0;
/*     */                           
/*     */ 
/*     */ 
/*     */                           for (;;)
/*     */                           {
/* 217 */                             d2 = MainMemory.getF64(paramInt8 + (i6 + (i7 << 3))) * MainMemory.getF64(paramInt9 + (i5 + i7 * paramInt7 << 3));
/* 218 */                             d1 -= d2;
/* 219 */                             MainMemory.setF64(i12, d1);
/* 220 */                             i7 += 1;
/* 221 */                             if (i7 == i4) {
/*     */                               break;
/*     */                             }
/*     */                           }
/*     */                         }
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
/* 241 */                         d1 /= MainMemory.getF64(i14);
/* 242 */                         MainMemory.setF64(i12, d1);
/* 243 */                         i4 += 1;
/* 244 */                         if (i4 == paramInt7) {
/*     */                           break;
/*     */                         }
/*     */                       }
/*     */                     }
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
/* 262 */                     i1 += 1;
/* 263 */                     if (i1 == paramInt7) {
/*     */                       break;
/*     */                     }
/*     */                   }
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
/*     */                   break label738;
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
/* 289 */                 break;
/*     */                 
/*     */ 
/*     */                 break label738;
/*     */               }
/*     */             }
/*     */             
/* 296 */             break;
/*     */           }
/*     */         }
/*     */       }
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
/*     */       label738:
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
/* 323 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/matinv_1571.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */