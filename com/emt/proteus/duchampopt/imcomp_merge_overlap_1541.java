/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_merge_overlap_1541 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new imcomp_merge_overlap_1541();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public imcomp_merge_overlap_1541() { super("imcomp_merge_overlap_1541", 26, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15, paramInt16, paramInt17, paramInt18, paramInt19, paramInt20, paramInt21, paramInt22, paramInt23, paramInt24, paramInt25, paramInt26);
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
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     int i11 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i12 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  73 */     paramInt4 += 2;
/*  74 */     paramInt3--;
/*  75 */     int i13 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  76 */     paramInt4 += 2;
/*  77 */     paramInt3--;
/*  78 */     int i14 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  79 */     paramInt4 += 2;
/*  80 */     paramInt3--;
/*  81 */     int i15 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  82 */     paramInt4 += 2;
/*  83 */     paramInt3--;
/*  84 */     int i16 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  85 */     paramInt4 += 2;
/*  86 */     paramInt3--;
/*  87 */     int i17 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  88 */     paramInt4 += 2;
/*  89 */     paramInt3--;
/*  90 */     int i18 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  91 */     paramInt4 += 2;
/*  92 */     paramInt3--;
/*  93 */     int i19 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  94 */     paramInt4 += 2;
/*  95 */     paramInt3--;
/*  96 */     int i20 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  97 */     paramInt4 += 2;
/*  98 */     paramInt3--;
/*  99 */     int i21 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 100 */     paramInt4 += 2;
/* 101 */     paramInt3--;
/* 102 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21);
/* 103 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26)
/*     */   {
/* 109 */     int i = 0;
/* 110 */     int j = 0;
/* 111 */     int k = 0;
/* 112 */     int m = 0;
/* 113 */     int n = 0;
/* 114 */     int i1 = 0;
/* 115 */     int i2 = 0;
/* 116 */     int i3 = 0;
/* 117 */     int i4 = 0;
/* 118 */     int i5 = 0;
/* 119 */     int i6 = 0;
/* 120 */     int i7 = 0;
/* 121 */     int i8 = 0;
/* 122 */     int i9 = 0;
/* 123 */     int i10 = 0;
/* 124 */     int i11 = 0;
/* 125 */     int i12 = 0;
/* 126 */     int i13 = 0;
/* 127 */     int i14 = 0;
/* 128 */     int i15 = 0;
/* 129 */     int i16 = 0;
/* 130 */     int i17 = 0;
/* 131 */     int i18 = 0;
/* 132 */     int i19 = 0;
/* 133 */     int i20 = 0;
/* 134 */     int i21 = 0;
/* 135 */     int i22 = 0;
/* 136 */     int i23 = 0;
/* 137 */     int i24 = 0;
/* 138 */     int i25 = 0;
/* 139 */     int i26 = 0;
/* 140 */     int i27 = 0;
/* 141 */     int i28 = 0;
/* 142 */     int i29 = 0;
/* 143 */     int i30 = 0;
/* 144 */     int i31 = 0;
/* 145 */     int i32 = 0;
/* 146 */     int i33 = 0;
/* 147 */     int i34 = 0;
/* 148 */     int i35 = 0;
/* 149 */     int i36 = 0;
/* 150 */     int i37 = 0;
/* 151 */     int i38 = 0;
/* 152 */     int i39 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 158 */       i = MainMemory.getI32(paramInt5);
/* 159 */       j = MainMemory.getI32(paramInt6);
/* 160 */       k = i + 1;
/* 161 */       m = k - j;
/* 162 */       n = m * paramInt14;
/* 163 */       i1 = MainMemory.getI32(paramInt22);
/* 164 */       i2 = MainMemory.getI32(paramInt12) - i1;
/* 165 */       if (i2 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 170 */         i3 = MainMemory.getI32(paramInt21);
/* 171 */         i4 = MainMemory.getI32(paramInt20);
/* 172 */         i5 = MainMemory.getI32(paramInt8);
/* 173 */         i6 = MainMemory.getI32(paramInt25) - i5;
/* 174 */         i7 = i6 < 0 ? 1 : 0;
/* 175 */         i8 = MainMemory.getI32(paramInt1);
/* 176 */         i9 = i < j ? 1 : 0;
/* 177 */         i10 = 0;
/* 178 */         i12 = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 183 */           i11 = i12 + 1;
/* 184 */           i12 = (i1 + i12) * i8;
/* 185 */           if (i7 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 190 */             i13 = MainMemory.getI32(paramInt9);
/* 191 */             i14 = MainMemory.getI32(paramInt19);
/* 192 */             i15 = MainMemory.getI32(paramInt11);
/* 193 */             i16 = MainMemory.getI32(paramInt4) - i15;
/* 194 */             i17 = i16 < 0 ? 1 : 0;
/* 195 */             i18 = i4 * (i3 + i10);
/* 196 */             i26 = 0;
/* 197 */             i19 = 0;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 202 */               i20 = i26 + 1;
/* 203 */               if (i17 == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 208 */                 i21 = MainMemory.getI32(paramInt2);
/* 209 */                 i22 = MainMemory.getI32(paramInt7);
/* 210 */                 i23 = MainMemory.getI32(paramInt13);
/* 211 */                 i24 = MainMemory.getI32(paramInt23) - i23;
/* 212 */                 i25 = i24 < 0 ? 1 : 0;
/* 213 */                 i26 = i12 + (i5 + i26) * MainMemory.getI32(paramInt26);
/* 214 */                 i27 = i18 + i14 * (i13 + i19);
/* 215 */                 i32 = 0;
/* 216 */                 i28 = 0;
/*     */                 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 221 */                   i29 = i32 + 1;
/* 222 */                   if (i25 == 0)
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 227 */                     i30 = MainMemory.getI32(paramInt15);
/* 228 */                     i31 = MainMemory.getI32(paramInt3);
/* 229 */                     i32 = i26 + (i15 + i32) * MainMemory.getI32(paramInt16);
/* 230 */                     i33 = i27 + MainMemory.getI32(paramInt17) + i22 * (i21 + i28);
/* 231 */                     i36 = 0;
/* 232 */                     i34 = 0;
/*     */                     
/*     */ 
/*     */                     for (;;)
/*     */                     {
/* 237 */                       i35 = i36 + 1;
/* 238 */                       if (i9 == 0)
/*     */                       {
/*     */ 
/*     */ 
/*     */ 
/* 243 */                         i36 = (i32 + (i23 + i36) * MainMemory.getI32(paramInt18) + j) * paramInt14;
/* 244 */                         i37 = (i33 + i31 * (i30 + i34)) * paramInt14;
/* 245 */                         i38 = 0;
/*     */                         
/*     */                         for (;;)
/*     */                         {
/* 249 */                           i39 = n * i38;
/* 250 */                           com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt10 + (i37 + i39), paramInt24 + (i36 + i39), n, 1);
/* 251 */                           i39 = i38 + 1;
/* 252 */                           if (i < k + m * i38) {
/*     */                             break;
/*     */                           }
/*     */                           
/* 256 */                           i38 = i39;
/*     */                         }
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 267 */                       i34 += 1;
/* 268 */                       if (i24 < i35) {
/*     */                         break;
/*     */                       }
/*     */                       
/* 272 */                       i36 = i35;
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
/*     */ 
/* 286 */                   i28 += 1;
/* 287 */                   if (i16 < i29) {
/*     */                     break;
/*     */                   }
/*     */                   
/* 291 */                   i32 = i29;
/*     */                 }
/*     */               }
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
/* 305 */               i19 += 1;
/* 306 */               if (i6 < i20) {
/*     */                 break;
/*     */               }
/*     */               
/* 310 */               i26 = i20;
/*     */             }
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
/* 324 */           i10 += 1;
/* 325 */           if (i2 < i11) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 330 */           i12 = i11;
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_merge_overlap_1541.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */