/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class codx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2858;
/*  12 */   public static final Function _instance = new codx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public codx2s() { super("codx2s", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
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
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     double d1 = 0.0D;
/*  72 */     double d2 = 0.0D;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     int i11 = 0;
/*  80 */     int i12 = 0;
/*  81 */     double d3 = 0.0D;
/*  82 */     double d4 = 0.0D;
/*  83 */     double d5 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  89 */       if (paramInt1 == 0) {
/*  90 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (MainMemory.getI32(paramInt1) != 503)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */           if (codset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 114 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label789;
/*     */           }
/*     */         }
/*     */         
/* 121 */         j = paramInt3 > 0 ? 1 : 0;
/* 122 */         i3 = j != 0 ? paramInt3 : 1;
/* 123 */         k = j != 0 ? paramInt2 : 1;
/* 124 */         paramInt3 = j != 0 ? paramInt3 : paramInt2;
/* 125 */         if (paramInt2 <= 0) {
/*     */           break label206;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         codx2s_498.call(paramInt5, paramInt1, paramInt2, paramInt4, paramInt8, paramInt6, i3);
/*     */         
/*     */ 
/*     */         label206:
/*     */         
/*     */ 
/* 141 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 145 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 152 */           paramInt6 = paramInt1 + 376;
/* 153 */           m = paramInt1 + 352;
/* 154 */           n = paramInt1 + 24;
/* 155 */           i1 = paramInt1 + 368;
/* 156 */           i2 = paramInt1 + 384;
/* 157 */           if (k <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 161 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 168 */             paramInt2 = k * paramInt5 << 3;
/* 169 */             i3 = k << 2;
/*     */             
/*     */ 
/*     */ 
/* 173 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 183 */               d1 = MainMemory.getF64(paramInt7 + (i4 * paramInt4 << 3)) + MainMemory.getF64(m);
/* 184 */               d1 = MainMemory.getF64(paramInt6) - d1;
/* 185 */               d2 = d1 * d1;
/* 186 */               i5 = paramInt9 + paramInt2;
/* 187 */               i6 = paramInt8 + paramInt2;
/* 188 */               i7 = paramInt10 + i3;
/* 189 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 196 */                 i9 = i8 * paramInt5;
/* 197 */                 i10 = paramInt9 + (i9 << 3);
/* 198 */                 i11 = paramInt8 + (i9 << 3);
/* 199 */                 i12 = paramInt10 + (i8 << 2);
/* 200 */                 d3 = MainMemory.getF64(i11);
/* 201 */                 d4 = d3 * d3;
/* 202 */                 d4 += d2;
/* 203 */                 d4 = com.emt.proteus.runtime.api.SystemLibrary.sqrt(d4);
/* 204 */                 if (!MathUtils.f_olt(MainMemory.getF64(n), 0.0D)) {
/*     */                   break label465;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 215 */                 d4 = -0.0D - d4;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label465:
/*     */                 
/*     */ 
/*     */ 
/* 223 */                 if (MathUtils.f_oeq(d4, 0.0D)) {
/* 224 */                   d3 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 234 */                   d5 = d1 / d4;
/* 235 */                   d3 /= d4;
/* 236 */                   if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */                     break label580;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */                   if (!MathUtils.f_ult(d5, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 250 */                     d3 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 257 */                     if (MathUtils.f_olt(d5, 0.0D)) {
/* 258 */                       d3 = 180.0D;
/*     */                       
/*     */                       break label676;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label650;
/*     */                     }
/*     */                     label580:
/* 267 */                     if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                       break label650;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 277 */                     if (MathUtils.f_ogt(d3, 0.0D)) {
/* 278 */                       d3 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 288 */                     else if (MathUtils.f_olt(d3, 0.0D)) {
/* 289 */                       d3 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label650:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */                       d3 = com.emt.proteus.runtime.api.SystemLibrary.atan2(d3, d5) * 180.0D;
/* 300 */                       d3 /= 3.141592653589793D;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label676:
/*     */                 
/* 308 */                 d3 = MainMemory.getF64(i1) * d3;
/* 309 */                 MainMemory.setF64(i11, d3);
/* 310 */                 d4 = MainMemory.getF64(i2) - d4;
/* 311 */                 MainMemory.setF64(i10, d4);
/* 312 */                 MainMemory.setI32(i12, 0);
/* 313 */                 i8 += 1;
/* 314 */                 if (i8 == k) {
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
/* 325 */               paramInt8 = i5;
/* 326 */               i10 = i6;
/* 327 */               paramInt10 = i7;
/* 328 */               i4 += 1;
/* 329 */               if (i4 == paramInt3) {
/* 330 */                 paramInt2 = 0; break;
/*     */               }
/*     */               
/*     */ 
/* 334 */               paramInt9 = paramInt8;
/* 335 */               paramInt8 = i10;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label789:
/*     */       
/*     */ 
/* 345 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */       int i13 = i;return i13;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/codx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */