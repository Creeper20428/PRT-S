/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class bons2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2856;
/*  13 */   public static final Function _instance = new bons2x();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public bons2x() { super("bons2x", 10, false); }
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
/*  68 */     double d1 = 0.0D;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     double d2 = 0.0D;
/*  74 */     double d3 = 0.0D;
/*  75 */     double d4 = 0.0D;
/*  76 */     int i5 = 0;
/*  77 */     int i6 = 0;
/*  78 */     int i7 = 0;
/*  79 */     int i8 = 0;
/*  80 */     int i9 = 0;
/*  81 */     int i10 = 0;
/*  82 */     int i11 = 0;
/*  83 */     double d5 = 0.0D;
/*  84 */     double d6 = 0.0D;
/*  85 */     int i12 = 0;
/*     */     
/*     */ 
/*  88 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  92 */       j = MainMemory.alloc(8);
/*  93 */       k = MainMemory.alloc(8);
/*  94 */       if (paramInt1 == 0) {
/*  95 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 105 */         if (!MathUtils.f_oeq(MainMemory.getF64(paramInt1 + 24), 0.0D)) {
/*     */           break label162;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */         i = sfls2x.call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */         
/*     */ 
/*     */         break label1163;
/*     */         
/*     */         label162:
/*     */         
/* 122 */         if (MainMemory.getI32(paramInt1) != 601)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */           if (bonset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 136 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label1155;
/*     */           }
/*     */         }
/*     */         
/* 143 */         i1 = paramInt3 > 0 ? 1 : 0;
/* 144 */         m = i1 != 0 ? paramInt2 : 1;
/* 145 */         i3 = i1 != 0 ? paramInt3 : 1;
/* 146 */         paramInt3 = i1 != 0 ? paramInt3 : paramInt2;
/* 147 */         n = paramInt1 + 376;
/* 148 */         d1 = MainMemory.getF64(paramInt1 + 352) - MainMemory.getF64(n);
/* 149 */         if (paramInt2 <= 0) {
/*     */           break label309;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */         bons2x_489.call(paramInt5, paramInt8, paramInt4, paramInt2, i3, paramInt1, paramInt6);
/*     */         
/*     */ 
/*     */         label309:
/*     */         
/*     */ 
/* 165 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 169 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 176 */           paramInt6 = paramInt1 + 368;
/* 177 */           i1 = m > 0 ? 1 : 0;
/* 178 */           i2 = paramInt1 + 344;
/* 179 */           paramInt2 = m * paramInt5 << 3;
/* 180 */           i3 = m << 2;
/*     */           
/*     */ 
/*     */ 
/* 184 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 194 */             d3 = MainMemory.getF64(paramInt7 + (i4 * paramInt4 << 3));
/* 195 */             d2 = MainMemory.getF64(paramInt6) * d3;
/* 196 */             d2 = MainMemory.getF64(n) - d2;
/* 197 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d3, 90.0D), 0.0D)) {
/*     */               break label582;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */             d4 = d3 / 90.0D;
/* 208 */             d4 += 0.5D;
/* 209 */             i8 = (int)SystemLibrary.floor(d4);
/* 210 */             switch ((i8 > -1 ? i8 : 0 - i8) & 0x3) {
/*     */             case 0:  break label569;
/*     */               break; case 1:  d3 = 0.0D;
/*     */               break label610;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d3 = 0.0D;
/*     */               
/*     */ 
/*     */               break label610;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 225 */             d3 = -1.0D;
/*     */             
/*     */             break label610;
/*     */             
/*     */             label569:
/* 230 */             d3 = 1.0D;
/*     */             
/*     */             break label610;
/*     */             
/*     */             label582:
/* 235 */             d3 *= 3.141592653589793D;
/* 236 */             d3 /= 180.0D;
/* 237 */             d3 = SystemLibrary.cos(d3);
/*     */             
/*     */ 
/*     */ 
/*     */             label610:
/*     */             
/*     */ 
/*     */ 
/* 245 */             d3 /= d2;
/* 246 */             if (i1 == 0) {
/*     */               break label1128;
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
/* 259 */             d4 = -0.0D - d2;
/* 260 */             i5 = paramInt9 + paramInt2;
/* 261 */             i6 = paramInt8 + paramInt2;
/* 262 */             i7 = paramInt10 + i3;
/* 263 */             i8 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 270 */               i12 = i8 * paramInt5;
/* 271 */               i9 = paramInt9 + (i12 << 3);
/* 272 */               i10 = paramInt8 + (i12 << 3);
/* 273 */               i11 = paramInt10 + (i8 << 2);
/* 274 */               d5 = MainMemory.getF64(i10) * d3;
/* 275 */               if (!MathUtils.f_oeq(SystemLibrary.fmod(d5, 90.0D), 0.0D)) {
/*     */                 break label986;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 285 */               d6 = d5 / 90.0D;
/* 286 */               d6 += 0.5D;
/* 287 */               i12 = (int)SystemLibrary.floor(d6);
/* 288 */               switch ((i12 > -1 ? i12 : 0 - i12) & 0x3) {
/*     */               case 0: 
/*     */                 break label961;
/*     */                 break;
/*     */               case 1: 
/*     */                 break label920;
/*     */                 break;
/*     */               case 2: 
/*     */                 break label893;
/*     */                 break;
/*     */               case 3: 
/*     */                 break;
/*     */               }
/* 301 */               d5 = MathUtils.f_ogt(d5, 0.0D) ? -1.0D : 1.0D;
/* 302 */               MainMemory.setF64(k, d5);
/* 303 */               MainMemory.setF64(j, 0.0D);
/*     */               
/*     */               break label1023;
/*     */               
/*     */               label893:
/*     */               
/* 309 */               MainMemory.setF64(k, 0.0D);
/* 310 */               MainMemory.setF64(j, -1.0D);
/* 311 */               d5 = 0.0D;
/*     */               
/*     */               break label1023;
/*     */               
/*     */               label920:
/* 316 */               d5 = MathUtils.f_ogt(d5, 0.0D) ? 1.0D : -1.0D;
/* 317 */               MainMemory.setF64(k, d5);
/* 318 */               MainMemory.setF64(j, 0.0D);
/*     */               
/*     */               break label1023;
/*     */               
/*     */               label961:
/*     */               
/* 324 */               MainMemory.setF64(k, 0.0D);
/* 325 */               MainMemory.setF64(j, 1.0D);
/* 326 */               d5 = 0.0D;
/*     */               
/*     */               break label1023;
/*     */               
/*     */               label986:
/* 331 */               d5 *= 3.141592653589793D;
/* 332 */               d5 /= 180.0D;
/* 333 */               SystemLibrary.sincos(d5, k, j);
/* 334 */               d5 = MainMemory.getF64(k);
/*     */               
/*     */ 
/*     */ 
/*     */               label1023:
/*     */               
/*     */ 
/*     */ 
/* 342 */               d5 = d2 * d5;
/* 343 */               d5 -= MainMemory.getF64(i2);
/* 344 */               MainMemory.setF64(i10, d5);
/* 345 */               d5 = MainMemory.getF64(j) * d4;
/* 346 */               d5 -= d1;
/* 347 */               MainMemory.setF64(i9, d5);
/* 348 */               MainMemory.setI32(i11, 0);
/* 349 */               i8 += 1;
/* 350 */               if (i8 == m) {
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
/* 361 */             paramInt8 = i5;
/* 362 */             i9 = i6;
/* 363 */             paramInt10 = i7;
/* 364 */             paramInt9 = paramInt8;
/* 365 */             paramInt8 = i9;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label1128:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 375 */             i4 += 1;
/* 376 */             if (i4 == paramInt3) {
/* 377 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1155:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 392 */       i = paramInt2;
/*     */       
/*     */ 
/*     */       label1163:
/*     */       
/*     */ 
/* 398 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 403 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/bons2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */