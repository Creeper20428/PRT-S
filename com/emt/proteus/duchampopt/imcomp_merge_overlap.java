/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class imcomp_merge_overlap extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3614;
/*  11 */   public static final Function _instance = new imcomp_merge_overlap();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public imcomp_merge_overlap() { super("imcomp_merge_overlap", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
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
/*  51 */     call(i, j, k, m, n, i1, i2, i3, i4);
/*  52 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  58 */     int i = 0;
/*  59 */     int j = 0;
/*  60 */     int k = 0;
/*  61 */     int m = 0;
/*  62 */     int n = 0;
/*  63 */     int i1 = 0;
/*  64 */     int i2 = 0;
/*  65 */     int i3 = 0;
/*  66 */     int i4 = 0;
/*  67 */     int i5 = 0;
/*  68 */     int i6 = 0;
/*  69 */     int i7 = 0;
/*  70 */     int i8 = 0;
/*  71 */     int i9 = 0;
/*  72 */     int i10 = 0;
/*  73 */     int i11 = 0;
/*  74 */     int i12 = 0;
/*  75 */     int i13 = 0;
/*  76 */     int i14 = 0;
/*  77 */     int i15 = 0;
/*  78 */     int i16 = 0;
/*  79 */     int i17 = 0;
/*  80 */     int i18 = 0;
/*  81 */     int i19 = 0;
/*  82 */     int i20 = 0;
/*  83 */     int i21 = 0;
/*  84 */     int i22 = 0;
/*  85 */     int i23 = 0;
/*  86 */     int i24 = 0;
/*  87 */     int i25 = 0;
/*  88 */     int i26 = 0;
/*  89 */     int i27 = 0;
/*  90 */     int i28 = 0;
/*  91 */     int i29 = 0;
/*  92 */     int i30 = 0;
/*  93 */     int i31 = 0;
/*  94 */     int i32 = 0;
/*  95 */     int i33 = 0;
/*  96 */     int i34 = 0;
/*  97 */     int i35 = 0;
/*  98 */     int i36 = 0;
/*  99 */     int i37 = 0;
/* 100 */     int i38 = 0;
/* 101 */     int i39 = 0;
/* 102 */     int i40 = 0;
/* 103 */     int i41 = 0;
/* 104 */     int i42 = 0;
/* 105 */     int i43 = 0;
/*     */     
/*     */ 
/* 108 */     int i44 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 112 */       i = MainMemory.alloc(24);
/* 113 */       j = MainMemory.alloc(24);
/* 114 */       k = MainMemory.alloc(24);
/* 115 */       m = MainMemory.alloc(24);
/* 116 */       n = MainMemory.alloc(24);
/* 117 */       i1 = MainMemory.alloc(24);
/* 118 */       if (MainMemory.getI32(paramInt9) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         MainMemory.setI32(i1, 1);
/* 129 */         MainMemory.setI32(i, 1);
/* 130 */         MainMemory.setI32(j, 1);
/* 131 */         MainMemory.setI32(k, 0);
/* 132 */         MainMemory.setI32(m, 0);
/* 133 */         MainMemory.setI32(n, 0);
/* 134 */         i2 = i + 4;
/* 135 */         i3 = j + 4;
/* 136 */         i4 = k + 4;
/* 137 */         i5 = m + 4;
/* 138 */         i6 = n + 4;
/* 139 */         MainMemory.setI32(i1 + 4, 1);
/* 140 */         MainMemory.setI32(i2, 1);
/* 141 */         MainMemory.setI32(i3, 1);
/* 142 */         MainMemory.setI32(i4, 0);
/* 143 */         MainMemory.setI32(i5, 0);
/* 144 */         MainMemory.setI32(i6, 0);
/* 145 */         i7 = i + 8;
/* 146 */         i8 = j + 8;
/* 147 */         i9 = k + 8;
/* 148 */         i10 = m + 8;
/* 149 */         i11 = n + 8;
/* 150 */         MainMemory.setI32(i1 + 8, 1);
/* 151 */         MainMemory.setI32(i7, 1);
/* 152 */         MainMemory.setI32(i8, 1);
/* 153 */         MainMemory.setI32(i9, 0);
/* 154 */         MainMemory.setI32(i10, 0);
/* 155 */         MainMemory.setI32(i11, 0);
/* 156 */         i12 = i + 12;
/* 157 */         i13 = j + 12;
/* 158 */         i14 = k + 12;
/* 159 */         i15 = m + 12;
/* 160 */         i16 = n + 12;
/* 161 */         MainMemory.setI32(i1 + 12, 1);
/* 162 */         MainMemory.setI32(i12, 1);
/* 163 */         MainMemory.setI32(i13, 1);
/* 164 */         MainMemory.setI32(i14, 0);
/* 165 */         MainMemory.setI32(i15, 0);
/* 166 */         MainMemory.setI32(i16, 0);
/* 167 */         i34 = i + 16;
/* 168 */         i36 = j + 16;
/* 169 */         i17 = k + 16;
/* 170 */         i18 = m + 16;
/* 171 */         i19 = n + 16;
/* 172 */         MainMemory.setI32(i1 + 16, 1);
/* 173 */         MainMemory.setI32(i34, 1);
/* 174 */         MainMemory.setI32(i36, 1);
/* 175 */         MainMemory.setI32(i17, 0);
/* 176 */         MainMemory.setI32(i18, 0);
/* 177 */         MainMemory.setI32(i19, 0);
/* 178 */         i34 = i + 20;
/* 179 */         i36 = j + 20;
/* 180 */         i39 = k + 20;
/* 181 */         i41 = m + 20;
/* 182 */         i42 = n + 20;
/* 183 */         MainMemory.setI32(i1 + 20, 1);
/* 184 */         MainMemory.setI32(i34, 1);
/* 185 */         MainMemory.setI32(i36, 1);
/* 186 */         MainMemory.setI32(i39, 0);
/* 187 */         MainMemory.setI32(i41, 0);
/* 188 */         MainMemory.setI32(i42, 0);
/* 189 */         i33 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */         i21 = i33 + -1;
/* 197 */         i34 = i + (i21 << 2);
/* 198 */         i35 = j + (i21 << 2);
/* 199 */         i36 = i + (i33 << 2);
/* 200 */         i37 = j + (i33 << 2);
/* 201 */         i38 = i1 + (i33 << 2);
/* 202 */         i39 = n + (i33 << 2);
/* 203 */         i40 = paramInt4 + (i33 << 2);
/* 204 */         i41 = m + (i33 << 2);
/* 205 */         i42 = k + (i33 << 2);
/* 206 */         i43 = paramInt8 + (i33 << 2);
/* 207 */         if (i33 >= paramInt3) {
/*     */           break label1414;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */         i20 = MainMemory.getI32(paramInt5 + (i33 << 2));
/* 218 */         i21 = MainMemory.getI32(paramInt7 + (i33 << 2));
/* 219 */         if (i20 >= i21)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 229 */           i22 = MainMemory.getI32(i40);
/* 230 */           i25 = MainMemory.getI32(i43);
/* 231 */           if (i22 <= i25)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 241 */             i23 = MainMemory.getI32(i38);
/* 242 */             i23 = i23 > -1 ? i23 : 0 - i23;
/* 243 */             i24 = (i25 - i21) / i23;
/* 244 */             i25 = i24 + 1;
/* 245 */             MainMemory.setI32(i36, i25);
/* 246 */             if (i25 >= 1) {
/*     */               break label887;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */             MainMemory.setI32(paramInt9, 323);
/*     */             
/*     */ 
/*     */             break label1477;
/*     */             
/*     */             label887:
/*     */             
/* 263 */             i27 = i20 - i22 + 1;
/* 264 */             MainMemory.setI32(i37, i27);
/* 265 */             if (i27 >= 1) {
/*     */               break label940;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */             MainMemory.setI32(paramInt9, 323);
/*     */             
/*     */ 
/*     */             break label1477;
/*     */             
/*     */             label940:
/*     */             
/* 282 */             i26 = i33 > 0 ? 1 : 0;
/* 283 */             if (i26 == 0) {
/*     */               break label992;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 294 */             i27 = MainMemory.getI32(i35) * i27;
/* 295 */             MainMemory.setI32(i37, i27);
/*     */             
/*     */ 
/*     */ 
/*     */             label992:
/*     */             
/*     */ 
/*     */ 
/* 303 */             i28 = i20 + -1;
/* 304 */             i31 = i22 + -1;
/* 305 */             i32 = i22 - i21;
/* 306 */             i30 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 313 */               if ((i32 + i30) % i23 != 0) {
/*     */                 break label1376;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */               i31 += i30;
/* 324 */               i32 = i20 - i21;
/* 325 */               i20 += -2;
/* 326 */               i30 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 333 */                 if ((i32 - i30) % i23 != 0) {
/*     */                   break label1338;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */                 i20 = i28 - i30;
/* 344 */                 i28 = (i31 + 1 - i21) / i23;
/* 345 */                 MainMemory.setI32(i42, i28 < 0 ? 0 : i28);
/* 346 */                 i20 = (i20 + 1 - i21) / i23;
/* 347 */                 MainMemory.setI32(i41, i24 <= i20 ? i24 : i20);
/* 348 */                 i24 = i21 - i22;
/* 349 */                 i24 = i24 < 0 ? 0 : i24;
/* 350 */                 MainMemory.setI32(i39, i24);
/* 351 */                 i20 = i24 + 1;
/* 352 */                 i21 = i24 + i22 - i21;
/* 353 */                 i22 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 360 */                   if ((i21 + i22) % i23 != 0) {
/*     */                     break label1299;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 370 */                   MainMemory.setI32(i39, i24 + i22);
/* 371 */                   if (i26 == 0) {
/*     */                     break label1283;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */                   MainMemory.setI32(i36, MainMemory.getI32(i34) * i25);
/*     */                   
/*     */ 
/*     */                   label1283:
/*     */                   
/*     */ 
/* 387 */                   i33 += 1;
/*     */                   
/* 389 */                   break;
/*     */                   
/*     */                   label1299:
/*     */                   
/* 393 */                   if (i20 + i22 >= i27) {
/*     */                     break label1472;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */                   i22 += 1;
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label1338:
/*     */                 
/* 409 */                 i29 = i30 + 1;
/* 410 */                 if (i31 > i20 - i30) { break label1472;
/*     */                   break label1376;
/*     */                 }
/* 413 */                 i30 = i29;
/*     */               }
/*     */               
/*     */ 
/*     */               label1376:
/*     */               
/*     */ 
/* 420 */               i29 = i30 + 1;
/* 421 */               if (i22 + i30 > i28) { break label1472;
/*     */                 break label1414;
/*     */               }
/* 424 */               i30 = i29;
/*     */             }
/*     */             
/*     */ 
/*     */             label1414:
/*     */             
/*     */ 
/* 431 */             imcomp_merge_overlap_1541.call(i12, i11, j, i10, m, k, i3, i14, i16, paramInt1, i9, i18, i4, paramInt2, i6, i2, n, i, i8, i13, i19, i17, i5, paramInt6, i15, i7);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1472:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1477:
/*     */       
/*     */ 
/*     */ 
/* 447 */       MainMemory.dealloc_generated(i44);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_merge_overlap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */