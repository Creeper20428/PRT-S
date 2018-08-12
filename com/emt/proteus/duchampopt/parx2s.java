/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class parx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2819;
/*  12 */   public static final Function _instance = new parx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public parx2s() { super("parx2s", 10, false); }
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
/*  69 */     double d1 = 0.0D;
/*  70 */     double d2 = 0.0D;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  83 */       if (paramInt1 == 0) {
/*  84 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  94 */         if (MainMemory.getI32(paramInt1) != 302)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           if (parset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 108 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label841;
/*     */           }
/*     */         }
/*     */         
/* 115 */         m = paramInt3 > 0 ? 1 : 0;
/* 116 */         n = m != 0 ? paramInt3 : 1;
/* 117 */         j = m != 0 ? paramInt2 : 1;
/* 118 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 119 */         if (paramInt2 <= 0) {
/*     */           break label190;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */         parx2s_1619.call(n, paramInt1, paramInt4, paramInt2, paramInt8, paramInt6, paramInt5, paramInt9);
/*     */         
/*     */ 
/*     */         label190:
/*     */         
/*     */ 
/* 135 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 139 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 146 */           paramInt6 = paramInt1 + 384;
/* 147 */           k = paramInt1 + 352;
/* 148 */           m = j > 0 ? 1 : 0;
/* 149 */           paramInt2 = j * paramInt5 << 3;
/*     */           
/*     */ 
/*     */ 
/* 153 */           n = 0;
/* 154 */           i8 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 165 */             i1 = paramInt8;
/* 166 */             i2 = paramInt9;
/* 167 */             d1 = MainMemory.getF64(paramInt7 + (n * paramInt4 << 3)) + MainMemory.getF64(k);
/* 168 */             d1 = MainMemory.getF64(paramInt6) * d1;
/* 169 */             if ((MathUtils.f_ogt(d1, 1.0D)) || (MathUtils.f_olt(d1, -1.0D))) {
/* 170 */               i8 = 3;
/* 171 */               d1 = 0.0D;
/* 172 */               d2 = 0.0D;
/* 173 */               i4 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 183 */               d2 = d1 * -4.0D;
/* 184 */               d2 *= d1;
/* 185 */               d2 += 1.0D;
/* 186 */               if (MathUtils.f_oeq(d2, 0.0D))
/*     */               {
/* 188 */                 i4 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 198 */                 d2 = 1.0D / d2;
/*     */                 
/* 200 */                 i4 = 0;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */               if (!MathUtils.f_ugt(d1, -1.0D)) {
/*     */                 break label506;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */               if (MathUtils.f_oeq(d1, 0.0D))
/*     */               {
/* 220 */                 d1 = d2;
/* 221 */                 d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 232 */                 if (!MathUtils.f_ult(d1, 1.0D))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */                   d3 = d1 + -1.0D;
/* 243 */                   if (MathUtils.f_olt(d3, 1.0E-10D))
/*     */                   {
/* 245 */                     d1 = d2;
/* 246 */                     d2 = 270.0D;
/*     */                     
/*     */                     break label582;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     break label542;
/*     */                   }
/*     */                   
/*     */                   label506:
/* 256 */                   d3 = d1 + 1.0D;
/* 257 */                   if (MathUtils.f_ogt(d3, -1.0E-10D))
/*     */                   {
/* 259 */                     d1 = d2;
/* 260 */                     d2 = -270.0D;
/*     */                     
/*     */ 
/*     */                     break label582;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label542:
/*     */                 
/*     */ 
/* 271 */                 d1 = com.emt.proteus.runtime.api.SystemLibrary.asin(d1) * 180.0D;
/* 272 */                 d1 /= 3.141592653589793D;
/* 273 */                 d3 = d1 * 3.0D;
/*     */                 
/* 275 */                 d1 = d2;
/* 276 */                 d2 = d3;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label582:
/*     */             
/*     */ 
/*     */ 
/* 287 */             if (m == 0) {
/*     */               break label813;
/*     */             }
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
/* 301 */             i3 = i4 < 0 ? 1 : 0;
/* 302 */             i2 += paramInt2;
/* 303 */             i1 += paramInt2;
/*     */             
/* 305 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 315 */               i5 = i4 * paramInt5;
/* 316 */               i6 = paramInt9 + (i5 << 3);
/* 317 */               i7 = paramInt8 + (i5 << 3);
/* 318 */               if (i3 == 0) {
/*     */                 break label742;
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
/* 330 */               if (!MathUtils.f_olt(MainMemory.getF64(i6), 0.0D)) {
/*     */                 break label722;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */               MainMemory.setI32(paramInt10, 0);
/* 341 */               paramInt10 += 4;
/*     */               
/*     */ 
/*     */               break label742;
/*     */               
/*     */               label722:
/*     */               
/* 348 */               MainMemory.setI32(paramInt10, 1);
/* 349 */               paramInt10 += 4;
/* 350 */               i8 = 3;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               label742:
/*     */               
/*     */ 
/*     */ 
/* 359 */               d3 = MainMemory.getF64(i7) * d1;
/* 360 */               MainMemory.setF64(i7, d3);
/* 361 */               MainMemory.setF64(i6, d2);
/* 362 */               i4 += 1;
/* 363 */               if (i4 == j) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 376 */             paramInt8 = i2;
/* 377 */             i6 = i1;
/* 378 */             paramInt9 = paramInt8;
/* 379 */             paramInt8 = i6;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             label813:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */             n += 1;
/* 392 */             if (n == paramInt3) {
/* 393 */               paramInt2 = i8; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label841:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 409 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 415 */       int i9 = i;return i9;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */