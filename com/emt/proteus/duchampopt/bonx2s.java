/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class bonx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2855;
/*  13 */   public static final Function _instance = new bonx2s();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public bonx2s() { super("bonx2s", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  56 */     paramFrame.setI32(paramInt1, i6);
/*  57 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  62 */     int i = 0;
/*     */     
/*  64 */     int j = 0;
/*  65 */     int k = 0;
/*  66 */     int m = 0;
/*  67 */     int n = 0;
/*  68 */     int i1 = 0;
/*  69 */     int i2 = 0;
/*  70 */     int i3 = 0;
/*  71 */     int i4 = 0;
/*  72 */     double d1 = 0.0D;
/*  73 */     double d2 = 0.0D;
/*  74 */     int i5 = 0;
/*  75 */     int i6 = 0;
/*  76 */     int i7 = 0;
/*  77 */     int i8 = 0;
/*  78 */     int i9 = 0;
/*  79 */     int i10 = 0;
/*  80 */     int i11 = 0;
/*  81 */     double d3 = 0.0D;
/*  82 */     double d4 = 0.0D;
/*  83 */     double d5 = 0.0D;
/*  84 */     int i12 = 0;
/*  85 */     double d6 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  91 */       if (paramInt1 == 0) {
/*  92 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 102 */         j = paramInt1 + 24;
/* 103 */         if (!MathUtils.f_oeq(MainMemory.getF64(j), 0.0D)) {
/*     */           break label147;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         i = sflx2s.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */         
/*     */ 
/*     */         break label1095;
/*     */         
/*     */         label147:
/*     */         
/* 120 */         if (MainMemory.getI32(paramInt1) != 601)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */           if (bonset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 134 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1087;
/*     */           }
/*     */         }
/*     */         
/* 141 */         k = paramInt3 > 0 ? 1 : 0;
/* 142 */         i3 = k != 0 ? paramInt3 : 1;
/* 143 */         m = k != 0 ? paramInt2 : 1;
/* 144 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 145 */         if (paramInt2 <= 0) {
/*     */           break label271;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */         bonx2s_490.call(paramInt4, paramInt5, paramInt2, paramInt1, i3, paramInt6, paramInt8);
/*     */         
/*     */ 
/*     */         label271:
/*     */         
/*     */ 
/* 161 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 165 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 172 */           paramInt6 = paramInt1 + 376;
/* 173 */           n = paramInt1 + 352;
/* 174 */           i1 = paramInt1 + 368;
/* 175 */           i2 = paramInt1 + 8;
/* 176 */           if (m <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 180 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 187 */             paramInt2 = m * paramInt5 << 3;
/* 188 */             i3 = m << 2;
/*     */             
/*     */ 
/*     */ 
/* 192 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 202 */               d1 = MainMemory.getF64(paramInt7 + (i4 * paramInt4 << 3)) + MainMemory.getF64(n);
/* 203 */               d1 = MainMemory.getF64(paramInt6) - d1;
/* 204 */               d2 = d1 * d1;
/* 205 */               i5 = paramInt9 + paramInt2;
/* 206 */               i6 = paramInt8 + paramInt2;
/* 207 */               i7 = paramInt10 + i3;
/* 208 */               i8 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 215 */                 i12 = i8 * paramInt5;
/* 216 */                 i9 = paramInt9 + (i12 << 3);
/* 217 */                 i10 = paramInt8 + (i12 << 3);
/* 218 */                 i11 = paramInt10 + (i8 << 2);
/* 219 */                 d5 = MainMemory.getF64(i10);
/* 220 */                 d3 = d5 * d5;
/* 221 */                 d3 += d2;
/* 222 */                 d3 = SystemLibrary.sqrt(d3);
/* 223 */                 if (!MathUtils.f_olt(MainMemory.getF64(j), 0.0D)) {
/*     */                   break label523;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */                 d3 = -0.0D - d3;
/*     */                 
/*     */ 
/*     */ 
/*     */                 label523:
/*     */                 
/*     */ 
/*     */ 
/* 242 */                 if (MathUtils.f_oeq(d3, 0.0D)) {
/* 243 */                   d4 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 253 */                   d4 = d1 / d3;
/* 254 */                   d5 /= d3;
/* 255 */                   if (!MathUtils.f_oeq(d5, 0.0D)) {
/*     */                     break label638;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 265 */                   if (!MathUtils.f_ult(d4, 0.0D))
/*     */                   {
/*     */ 
/*     */ 
/* 269 */                     d4 = 0.0D;
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/* 276 */                     if (MathUtils.f_olt(d4, 0.0D)) {
/* 277 */                       d4 = 180.0D;
/*     */                       
/*     */                       break label738;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       break label708;
/*     */                     }
/*     */                     label638:
/* 286 */                     if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */                       break label708;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */                     if (MathUtils.f_ogt(d5, 0.0D)) {
/* 297 */                       d4 = 90.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     }
/* 307 */                     else if (MathUtils.f_olt(d5, 0.0D)) {
/* 308 */                       d4 = -90.0D;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label708:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 318 */                       d5 = SystemLibrary.atan2(d5, d4) * 180.0D;
/* 319 */                       d5 /= 3.141592653589793D;
/* 320 */                       d4 = d5;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */                 
/*     */                 label738:
/*     */                 
/* 327 */                 d5 = MainMemory.getF64(paramInt6) - d3;
/* 328 */                 d5 /= MainMemory.getF64(i1);
/* 329 */                 if (!MathUtils.f_oeq(SystemLibrary.fmod(d5, 90.0D), 0.0D)) {
/*     */                   break label920;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */                 d6 = d5 / 90.0D;
/* 340 */                 d6 += 0.5D;
/* 341 */                 i12 = (int)SystemLibrary.floor(d6);
/* 342 */                 switch ((i12 > -1 ? i12 : 0 - i12) & 0x3) {
/*     */                 case 0: 
/*     */                   break;
/* 345 */                 case 1:  d3 = 0.0D;
/*     */                   break label994;
/*     */                   break; case 2:  d6 = -1.0D;
/*     */                   break label965;
/*     */                   break; case 3:  d3 = 0.0D;
/*     */                   
/*     */ 
/*     */                   break label994;
/*     */                   
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/* 358 */                 d6 = 1.0D;
/*     */                 
/*     */                 break label965;
/*     */                 
/*     */                 label920:
/* 363 */                 d6 = d5 * 3.141592653589793D;
/* 364 */                 d6 /= 180.0D;
/* 365 */                 d6 = SystemLibrary.cos(d6);
/* 366 */                 if (MathUtils.f_oeq(d6, 0.0D)) {
/* 367 */                   d3 = 0.0D;
/*     */                 }
/*     */                 else
/*     */                 {
/*     */                   label965:
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */                   d3 /= MainMemory.getF64(i2);
/* 380 */                   d3 *= d4;
/* 381 */                   d3 /= d6;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */                 label994:
/*     */                 
/*     */ 
/* 389 */                 MainMemory.setF64(i10, d3);
/* 390 */                 MainMemory.setF64(i9, d5);
/* 391 */                 MainMemory.setI32(i11, 0);
/* 392 */                 i8 += 1;
/* 393 */                 if (i8 == m) {
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
/* 404 */               paramInt8 = i5;
/* 405 */               i9 = i6;
/* 406 */               paramInt10 = i7;
/* 407 */               i4 += 1;
/* 408 */               if (i4 == paramInt3) {
/* 409 */                 paramInt2 = 0; break;
/*     */               }
/*     */               
/*     */ 
/* 413 */               paramInt9 = paramInt8;
/* 414 */               paramInt8 = i9;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label1087:
/*     */       
/*     */ 
/* 424 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label1095:
/*     */       
/*     */ 
/* 430 */       int i13 = i; return i13;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/bonx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */