/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F410910 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3634;
/*  15 */   public static final Function _instance = new F410910();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public F410910() { super("F410910", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5, paramInt6);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, j, k, m, f, n, i1);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*  62 */     int i2 = 0;
/*  63 */     int i3 = 0;
/*  64 */     int i4 = 0;
/*  65 */     int i5 = 0;
/*  66 */     int i6 = 0;
/*  67 */     int i7 = 0;
/*  68 */     int i8 = 0;
/*  69 */     int i9 = 0;
/*  70 */     int i10 = 0;
/*  71 */     float f = 0.0F;
/*  72 */     int i11 = 0;
/*  73 */     double d1 = 0.0D;
/*  74 */     double d2 = 0.0D;
/*  75 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*  78 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  82 */       i = MainMemory.alloc(8);
/*  83 */       j = MainMemory.alloc(8);
/*  84 */       if (paramInt2 >= 3) {
/*     */         break label113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       MainMemory.setF64(paramInt5, 0.0D);
/*     */       
/*     */ 
/*     */       break label1124;
/*     */       
/*     */       label113:
/*     */       
/* 101 */       k = calloc.call(paramInt2, 4);
/* 102 */       m = k;
/* 103 */       if (k != 0) {
/*     */         break label159;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI32(paramInt6, 113);
/*     */       
/*     */ 
/*     */       break label1124;
/*     */       
/*     */       label159:
/*     */       
/* 120 */       n = calloc.call(paramInt3, 8);
/* 121 */       i1 = n;
/* 122 */       if (n != 0) {
/*     */         break label211;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       free.call(k);
/* 133 */       MainMemory.setI32(paramInt6, 113);
/*     */       
/*     */ 
/*     */       break label1124;
/*     */       
/*     */       label211:
/*     */       
/* 140 */       if (paramInt3 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 144 */         d1 = 0.0D;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 151 */         i2 = paramInt4 == 0 ? 1 : 0;
/* 152 */         i3 = 0;
/* 153 */         paramInt4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 161 */           i4 = paramInt4 * paramInt2;
/* 162 */           i5 = i4 + 1;
/* 163 */           if (i2 != 0) {
/* 164 */             i9 = 0;
/*     */             break label357;
/*     */           } else {
/* 167 */             i9 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 176 */             if (i9 >= paramInt2) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 187 */             if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i4 + i9 << 2)), paramFloat)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */             i9 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */           label357:
/*     */           
/*     */ 
/* 205 */           if (i9 == paramInt2) {
/*     */             break label949;
/*     */           }
/*     */           else {
/* 209 */             i6 = i9;
/* 210 */             i9 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 220 */             i10 = k + (i9 << 2);
/* 221 */             f = MainMemory.getF32(paramInt1 + (i4 + i6 << 2));
/* 222 */             i11 = i6 + 1;
/* 223 */             if (i11 >= paramInt2) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */             if (i2 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */               i6 = i5 + i6;
/* 245 */               i7 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 252 */                 i8 = i11 + i7;
/* 253 */                 if (i8 >= paramInt2)
/*     */                 {
/*     */ 
/*     */ 
/* 257 */                   i11 = i8;
/* 258 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 264 */                 if (!MathUtils.f_oeq(MainMemory.getF32(paramInt1 + (i6 + i7 << 2)), paramFloat))
/*     */                 {
/*     */ 
/*     */ 
/* 268 */                   i11 = i8;
/* 269 */                   break;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/* 275 */                 i7 += 1;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 282 */             if (i11 == paramInt2) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */             f -= MainMemory.getF32(paramInt1 + (i4 + i11 << 2));
/* 293 */             MainMemory.setF32(i10, f);
/* 294 */             i9 += 1;
/* 295 */             i6 = i11;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 301 */           if (i9 >= 2)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */             F410824.call(m, i9, i, j);
/* 313 */             d1 = MainMemory.getF64(j);
/* 314 */             if (MathUtils.f_ogt(d1, 0.0D)) {
/* 315 */               i4 = 0;
/* 316 */               i5 = i9;
/*     */             }
/*     */             else
/*     */             {
/*     */               break label926;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 329 */               if (i4 >= 3) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */               if (i5 <= 0)
/*     */               {
/*     */ 
/*     */ 
/* 343 */                 i9 = 0;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 350 */                 d1 = MainMemory.getF64(i);
/* 351 */                 d2 = MainMemory.getF64(j) * 5.0D;
/* 352 */                 i11 = 0;
/* 353 */                 i9 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 361 */                   f = MainMemory.getF32(k + (i9 << 2));
/* 362 */                   d3 = f;
/* 363 */                   d3 -= d1;
/* 364 */                   if (!MathUtils.f_olt(com.emt.proteus.runtime.api.SystemLibrary.fabs(d3), d2)) {
/*     */                     break label836;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */                   if (i11 >= i9) {
/*     */                     break label825;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */                   MainMemory.setF32(m + (i11 << 2), f);
/*     */                   
/*     */ 
/*     */                   label825:
/*     */                   
/*     */ 
/* 391 */                   i11 += 1;
/*     */                   
/*     */ 
/*     */ 
/*     */                   label836:
/*     */                   
/*     */ 
/*     */ 
/* 399 */                   i9 += 1;
/* 400 */                   if (i9 == i5) {
/* 401 */                     i9 = i11; break;
/*     */                   }
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
/* 414 */               if (i9 == i5) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */               F410824.call(m, i9, i, j);
/* 425 */               i4 += 1;
/*     */               
/* 427 */               i5 = i9;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 432 */             d1 = MainMemory.getF64(j);
/*     */             
/*     */ 
/*     */ 
/*     */             label926:
/*     */             
/*     */ 
/*     */ 
/* 440 */             MainMemory.setF64(i1 + (i3 << 3), d1);
/* 441 */             i3 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label949:
/*     */           
/*     */ 
/* 449 */           paramInt4 += 1;
/* 450 */           if (paramInt4 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 462 */         switch (i3) {
/* 463 */         case 0:  d1 = 0.0D;
/*     */           
/*     */ 
/*     */           break label1094;
/*     */           
/*     */           break;
/*     */         case 1: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 474 */         d1 = MainMemory.getF64(i1);
/*     */         
/*     */ 
/*     */         break label1094;
/*     */         
/*     */ 
/* 480 */         qsort.call(n, i3, 8, 3629);
/* 481 */         d1 = MainMemory.getF64(i1 + ((i3 + -1) / 2 << 3)) + MainMemory.getF64(i1 + (i3 / 2 << 3));
/* 482 */         d1 *= 0.5D;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1094:
/*     */       
/*     */ 
/* 490 */       d1 *= 0.70710678D;
/* 491 */       MainMemory.setF64(paramInt5, d1);
/* 492 */       free.call(n);
/* 493 */       free.call(k);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1124:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 504 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F410910.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */