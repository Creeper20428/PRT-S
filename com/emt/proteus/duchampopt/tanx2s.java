/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class tanx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2852;
/*  12 */   public static final Function _instance = new tanx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public tanx2s() { super("tanx2s", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
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
/*  54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     paramFrame.setI32(paramInt1, i6);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     double d1 = 0.0D;
/*  68 */     double d2 = 0.0D;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*  72 */     boolean bool1 = false;
/*  73 */     double d3 = 0.0D;
/*  74 */     int i4 = 0;
/*  75 */     int i5 = 0;
/*  76 */     int i6 = 0;
/*  77 */     int i7 = 0;
/*  78 */     int i8 = 0;
/*  79 */     double d4 = 0.0D;
/*  80 */     double d5 = 0.0D;
/*  81 */     boolean bool2 = false;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  87 */       if (paramInt1 == 0) {
/*  88 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (MainMemory.getI32(paramInt1) != 103)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */           if (tanset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 112 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label835;
/*     */           }
/*     */         }
/*     */         
/* 119 */         bool1 = paramInt3 > 0;
/* 120 */         j = bool1 ? paramInt2 : 1;
/* 121 */         m = bool1 ? paramInt3 : 1;
/* 122 */         paramInt3 = bool1 ? paramInt3 : paramInt2;
/* 123 */         if (paramInt2 <= 0) {
/*     */           break label199;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         tanx2s_1692.call(paramInt1, m, paramInt5, paramInt8, paramInt6, paramInt2, paramInt4);
/*     */         
/*     */ 
/*     */         label199:
/*     */         
/*     */ 
/* 139 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 143 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 150 */           paramInt6 = paramInt1 + 352;
/* 151 */           k = paramInt1 + 8;
/* 152 */           if (j <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 156 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 163 */             paramInt2 = j * paramInt5 << 3;
/* 164 */             m = j << 2;
/*     */             
/*     */ 
/*     */ 
/* 168 */             n = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 178 */               d2 = MainMemory.getF64(paramInt7 + (n * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 179 */               d1 = d2 * d2;
/* 180 */               d2 = -0.0D - d2;
/* 181 */               i1 = paramInt9 + paramInt2;
/* 182 */               i2 = paramInt8 + paramInt2;
/* 183 */               i3 = paramInt10 + m;
/* 184 */               bool1 = MathUtils.f_oeq(d2, 0.0D);
/* 185 */               d3 = MathUtils.f_oge(d2, 0.0D) ? 0.0D : 180.0D;
/* 186 */               i4 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 193 */                 i5 = i4 * paramInt5;
/* 194 */                 i6 = paramInt9 + (i5 << 3);
/* 195 */                 i7 = paramInt8 + (i5 << 3);
/* 196 */                 i8 = paramInt10 + (i4 << 2);
/* 197 */                 d4 = MainMemory.getF64(i7);
/* 198 */                 d5 = d4 * d4;
/* 199 */                 d5 += d1;
/* 200 */                 d5 = SystemLibrary.sqrt(d5);
/* 201 */                 bool2 = MathUtils.f_oeq(d5, 0.0D);
/* 202 */                 if (bool2) {
/* 203 */                   d4 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/* 213 */                 else if (MathUtils.f_oeq(d4, 0.0D)) {
/* 214 */                   d4 = d3;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 224 */                   if (!bool1) {
/*     */                     break label538;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */                   if (MathUtils.f_ogt(d4, 0.0D)) {
/* 235 */                     d4 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 245 */                   else if (MathUtils.f_olt(d4, 0.0D)) {
/* 246 */                     d4 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label538:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */                     d4 = SystemLibrary.atan2(d4, d2) * 180.0D;
/* 257 */                     d4 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */                 MainMemory.setF64(i7, d4);
/* 266 */                 d4 = MainMemory.getF64(k);
/* 267 */                 if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */                   break label657;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */                 if (!MathUtils.f_ult(d5, 0.0D))
/*     */                 {
/*     */ 
/*     */ 
/* 281 */                   d5 = 0.0D;
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/* 288 */                   if (MathUtils.f_olt(d5, 0.0D)) {
/* 289 */                     d5 = 180.0D;
/*     */                     
/*     */                     break label749;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     break label723;
/*     */                   }
/*     */                   label657:
/* 298 */                   if (!bool2) {
/*     */                     break label723;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */                   if (MathUtils.f_ogt(d4, 0.0D)) {
/* 309 */                     d5 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/* 319 */                   else if (MathUtils.f_olt(d4, 0.0D)) {
/* 320 */                     d5 = -90.0D;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label723:
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */                     d5 = SystemLibrary.atan2(d4, d5) * 180.0D;
/* 331 */                     d5 /= 3.141592653589793D;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label749:
/*     */                 
/*     */ 
/* 339 */                 MainMemory.setF64(i6, d5);
/* 340 */                 MainMemory.setI32(i8, 0);
/* 341 */                 i4 += 1;
/* 342 */                 if (i4 == j) {
/*     */                   break;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 353 */               paramInt8 = i1;
/* 354 */               i6 = i2;
/* 355 */               paramInt10 = i3;
/* 356 */               n += 1;
/* 357 */               if (n == paramInt3) {
/* 358 */                 paramInt2 = 0; break;
/*     */               }
/*     */               
/*     */ 
/* 362 */               paramInt9 = paramInt8;
/* 363 */               paramInt8 = i6;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label835:
/*     */       
/*     */ 
/* 373 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */       int i9 = i;return i9;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tanx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */