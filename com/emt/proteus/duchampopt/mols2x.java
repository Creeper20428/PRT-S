/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class mols2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2817;
/*  12 */   public static final Function _instance = new mols2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public mols2x() { super("mols2x", 10, false); }
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
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     int i5 = 0;
/*  72 */     boolean bool = false;
/*  73 */     double d1 = 0.0D;
/*  74 */     double d2 = 0.0D;
/*  75 */     double d3 = 0.0D;
/*  76 */     int i6 = 0;
/*  77 */     double d4 = 0.0D;
/*  78 */     double d5 = 0.0D;
/*  79 */     int i7 = 0;
/*  80 */     int i8 = 0;
/*  81 */     int i9 = 0;
/*  82 */     int i10 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  88 */       if (paramInt1 == 0) {
/*  89 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (MainMemory.getI32(paramInt1) != 303)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */           if (molset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 113 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1045;
/*     */           }
/*     */         }
/*     */         
/* 120 */         m = paramInt3 > 0 ? 1 : 0;
/* 121 */         i1 = m != 0 ? paramInt3 : 1;
/* 122 */         j = m != 0 ? paramInt2 : 1;
/* 123 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 124 */         if (paramInt2 <= 0) {
/*     */           break label203;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         mols2x_1581.call(i1, paramInt1, paramInt8, paramInt2, paramInt6, paramInt5, paramInt4);
/*     */         
/*     */ 
/*     */         label203:
/*     */         
/*     */ 
/* 140 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 144 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 151 */           paramInt6 = paramInt1 + 360;
/* 152 */           k = paramInt1 + 352;
/* 153 */           m = j > 0 ? 1 : 0;
/* 154 */           n = paramInt1 + 344;
/* 155 */           paramInt2 = j * paramInt5 << 3;
/* 156 */           i1 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 160 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 170 */             i3 = paramInt10;
/* 171 */             i4 = paramInt8;
/* 172 */             i5 = paramInt9;
/* 173 */             d4 = MainMemory.getF64(paramInt7 + (i2 * paramInt4 << 3));
/* 174 */             if (!MathUtils.f_oeq(SystemLibrary.fabs(d4), 90.0D)) {
/*     */               break label398;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */             bool = MathUtils.f_olt(d4, 0.0D);
/* 185 */             d4 = SystemLibrary.fabs(MainMemory.getF64(paramInt6));
/* 186 */             if (!bool)
/*     */             {
/*     */ 
/*     */ 
/* 190 */               d5 = d4;
/* 191 */               d4 = 0.0D;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 198 */               d4 = -0.0D - d4;
/* 199 */               d5 = d4;
/* 200 */               d4 = 0.0D;
/*     */               
/*     */               break label838;
/*     */               
/*     */               label398:
/* 205 */               if (MathUtils.f_oeq(d4, 0.0D)) {
/* 206 */                 d5 = 0.0D;
/* 207 */                 d4 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 217 */                 if (!MathUtils.f_oeq(SystemLibrary.fmod(d4, 90.0D), 0.0D)) {
/*     */                   break label596;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */                 d5 = d4 / 90.0D;
/* 228 */                 d5 += -0.5D;
/* 229 */                 i6 = (int)SystemLibrary.floor(d5);
/* 230 */                 switch ((i6 > -1 ? i6 : 0 - i6) & 0x3) {
/*     */                 case 0:  break label581;
/*     */                   break; case 1:  d4 = 0.0D;
/*     */                   break label628;
/*     */                   break;
/*     */                 case 2: 
/*     */                   break; case 3:  d4 = 0.0D;
/*     */                   
/*     */ 
/*     */                   break label628;
/*     */                   
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/* 245 */                 d4 = -3.141592653589793D;
/*     */                 
/*     */                 break label628;
/*     */                 
/*     */                 label581:
/* 250 */                 d4 = 3.141592653589793D;
/*     */                 
/*     */                 break label628;
/*     */                 
/*     */                 label596:
/* 255 */                 d4 *= 3.141592653589793D;
/* 256 */                 d4 /= 180.0D;
/* 257 */                 d4 = SystemLibrary.sin(d4) * 3.141592653589793D;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label628:
/*     */                 
/*     */ 
/*     */ 
/* 265 */                 d5 = d4;
/* 266 */                 i6 = 0;
/* 267 */                 d2 = -3.141592653589793D;
/* 268 */                 d3 = 3.141592653589793D;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 278 */                   if (i6 >= 100) {
/*     */                     break;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */                   d1 = d5 - d4;
/* 289 */                   d1 += SystemLibrary.sin(d5);
/* 290 */                   if (!MathUtils.f_olt(d1, 0.0D)) {
/*     */                     break label742;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 300 */                   if (MathUtils.f_ogt(d1, -1.0E-13D)) {
/*     */                     break;
/*     */                   } else {
/* 303 */                     d2 = d5;
/*     */                     
/*     */ 
/*     */                     break label770;
/*     */                   }
/*     */                   
/*     */                   label742:
/*     */                   
/* 311 */                   if (MathUtils.f_olt(d1, 1.0E-13D)) {
/*     */                     break;
/*     */                   }
/*     */                   else {
/* 315 */                     d3 = d5;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   label770:
/*     */                   
/*     */ 
/*     */ 
/* 325 */                   d5 = d2 + d3;
/* 326 */                   d5 *= 0.5D;
/* 327 */                   i6 += 1;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 336 */                 d5 *= 0.5D;
/* 337 */                 d4 = SystemLibrary.cos(d5);
/* 338 */                 d2 = MainMemory.getF64(paramInt6);
/* 339 */                 d5 = d2 * SystemLibrary.sin(d5);
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label838:
/*     */             
/*     */ 
/*     */ 
/* 349 */             d5 -= MainMemory.getF64(k);
/* 350 */             if (m == 0) {
/*     */               break label1018;
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
/* 363 */             i5 += paramInt2;
/* 364 */             i4 += paramInt2;
/* 365 */             i3 += i1;
/* 366 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 373 */               i7 = i6 * paramInt5;
/* 374 */               i8 = paramInt9 + (i7 << 3);
/* 375 */               i9 = paramInt8 + (i7 << 3);
/* 376 */               i10 = paramInt10 + (i6 << 2);
/* 377 */               d2 = MainMemory.getF64(i9) * d4;
/* 378 */               d2 -= MainMemory.getF64(n);
/* 379 */               MainMemory.setF64(i9, d2);
/* 380 */               MainMemory.setF64(i8, d5);
/* 381 */               MainMemory.setI32(i10, 0);
/* 382 */               i6 += 1;
/* 383 */               if (i6 == j) {
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
/* 394 */             paramInt8 = i5;
/* 395 */             i8 = i4;
/* 396 */             paramInt10 = i3;
/* 397 */             paramInt9 = paramInt8;
/* 398 */             paramInt8 = i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1018:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 408 */             i2 += 1;
/* 409 */             if (i2 == paramInt3) {
/* 410 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1045:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 425 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */       int i11 = i;return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mols2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */