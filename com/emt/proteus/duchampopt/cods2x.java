/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class cods2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2859;
/*  12 */   public static final Function _instance = new cods2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cods2x() { super("cods2x", 10, false); }
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
/*  72 */     double d1 = 0.0D;
/*  73 */     int i6 = 0;
/*  74 */     int i7 = 0;
/*  75 */     int i8 = 0;
/*  76 */     double d2 = 0.0D;
/*  77 */     double d3 = 0.0D;
/*  78 */     int i9 = 0;
/*  79 */     int i10 = 0;
/*  80 */     int i11 = 0;
/*  81 */     int i12 = 0;
/*  82 */     double d4 = 0.0D;
/*     */     
/*     */ 
/*  85 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  89 */       i6 = MainMemory.alloc(8);
/*  90 */       j = MainMemory.alloc(8);
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
/* 102 */         if (MainMemory.getI32(paramInt1) != 503)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */           if (codset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 116 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label992;
/*     */           }
/*     */         }
/*     */         
/* 123 */         n = paramInt3 > 0 ? 1 : 0;
/* 124 */         k = n != 0 ? paramInt2 : 1;
/* 125 */         i7 = n != 0 ? paramInt3 : 1;
/* 126 */         paramInt3 = n != 0 ? paramInt3 : paramInt2;
/* 127 */         if (paramInt2 <= 0) {
/*     */           break label679;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         m = paramInt1 + 360;
/* 138 */         n = i7 > 0 ? 1 : 0;
/* 139 */         i8 = paramInt5 * paramInt2;
/* 140 */         i1 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 147 */           i2 = i1 * paramInt5;
/* 148 */           d1 = MainMemory.getF64(m) * MainMemory.getF64(paramInt6 + (i1 * paramInt4 << 3));
/* 149 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label520;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */           d2 = d1 / 90.0D;
/* 160 */           d2 += 0.5D;
/* 161 */           i3 = (int)SystemLibrary.floor(d2);
/* 162 */           switch ((i3 > -1 ? i3 : 0 - i3) & 0x3) {
/*     */           case 0: 
/*     */             break label498;
/*     */             break;
/*     */           case 1: 
/*     */             break label461;
/*     */             break;
/*     */           case 2: 
/*     */             break label437;
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/* 175 */           MainMemory.setF64(j, MathUtils.f_ogt(d1, 0.0D) ? -1.0D : 1.0D);
/* 176 */           MainMemory.setF64(i6, 0.0D);
/*     */           
/*     */           break label550;
/*     */           
/*     */           label437:
/* 181 */           MainMemory.setF64(j, 0.0D);
/* 182 */           MainMemory.setF64(i6, -1.0D);
/*     */           
/*     */           break label550;
/*     */           
/*     */           label461:
/* 187 */           MainMemory.setF64(j, MathUtils.f_ogt(d1, 0.0D) ? 1.0D : -1.0D);
/* 188 */           MainMemory.setF64(i6, 0.0D);
/*     */           
/*     */           break label550;
/*     */           
/*     */           label498:
/* 193 */           MainMemory.setF64(j, 0.0D);
/* 194 */           MainMemory.setF64(i6, 1.0D);
/*     */           
/*     */           break label550;
/*     */           
/*     */           label520:
/* 199 */           d1 *= 3.141592653589793D;
/* 200 */           d1 /= 180.0D;
/* 201 */           SystemLibrary.sincos(d1, j, i6);
/*     */           
/*     */ 
/*     */           label550:
/*     */           
/*     */ 
/* 207 */           if (n == 0) {
/*     */             break label654;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           d1 = MainMemory.getF64(j);
/* 218 */           d2 = MainMemory.getF64(i6);
/* 219 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 226 */             i4 = i2 + i8 * i3;
/* 227 */             i5 = paramInt9 + (i4 << 3);
/* 228 */             MainMemory.setF64(paramInt8 + (i4 << 3), d1);
/* 229 */             MainMemory.setF64(i5, d2);
/* 230 */             i3 += 1;
/* 231 */             if (i3 == i7) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label654:
/*     */           
/*     */ 
/*     */ 
/* 242 */           i1 += 1;
/* 243 */           if (i1 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label679:
/*     */         
/*     */ 
/*     */ 
/* 254 */         d1 = MainMemory.getF64(paramInt1 + 352) - MainMemory.getF64(paramInt1 + 376);
/* 255 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 259 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 266 */           paramInt6 = paramInt1 + 384;
/* 267 */           i6 = paramInt1 + 344;
/* 268 */           if (k <= 0)
/*     */           {
/*     */ 
/*     */ 
/* 272 */             paramInt2 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 279 */             paramInt2 = k * paramInt5 << 3;
/* 280 */             i7 = k << 2;
/*     */             
/*     */ 
/*     */ 
/* 284 */             i8 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 294 */               d2 = MainMemory.getF64(paramInt6) - MainMemory.getF64(paramInt7 + (i8 * paramInt4 << 3));
/* 295 */               d3 = -0.0D - d2;
/* 296 */               i9 = paramInt9 + paramInt2;
/* 297 */               i10 = paramInt8 + paramInt2;
/* 298 */               i11 = paramInt10 + i7;
/* 299 */               i1 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 306 */                 i2 = i1 * paramInt5;
/* 307 */                 j = paramInt9 + (i2 << 3);
/* 308 */                 m = paramInt8 + (i2 << 3);
/* 309 */                 i12 = paramInt10 + (i1 << 2);
/* 310 */                 d4 = MainMemory.getF64(m) * d2;
/* 311 */                 d4 -= MainMemory.getF64(i6);
/* 312 */                 MainMemory.setF64(m, d4);
/* 313 */                 d4 = MainMemory.getF64(j) * d3;
/* 314 */                 d4 -= d1;
/* 315 */                 MainMemory.setF64(j, d4);
/* 316 */                 MainMemory.setI32(i12, 0);
/* 317 */                 i1 += 1;
/* 318 */                 if (i1 == k) {
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
/* 329 */               paramInt8 = i9;
/* 330 */               j = i10;
/* 331 */               paramInt10 = i11;
/* 332 */               i8 += 1;
/* 333 */               if (i8 == paramInt3) {
/* 334 */                 paramInt2 = 0; break;
/*     */               }
/*     */               
/*     */ 
/* 338 */               paramInt9 = paramInt8;
/* 339 */               paramInt8 = j;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label992:
/*     */       
/*     */ 
/* 349 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 355 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 360 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cods2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */