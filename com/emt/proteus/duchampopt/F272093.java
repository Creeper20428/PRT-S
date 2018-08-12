/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class F272093 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3080;
/*  12 */   public static final Function _instance = new F272093();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public F272093() { super("F272093", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3);
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
/*  33 */     int m = call(i, j, k);
/*  34 */     paramFrame.setI32(paramInt1, m);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*     */     
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*     */     
/*     */ 
/*  55 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.alloc(4);
/*  60 */       k = MainMemory.alloc(1200);
/*  61 */       n = j;
/*  62 */       if (paramInt1 < 0) {
/*  63 */         paramInt1 = -1;
/*     */         break label787;
/*     */       } else {
/*  66 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  75 */         if (m >= 4) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         i3 = 4 - m;
/*  87 */         i2 = n + m;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  93 */           i4 = recv.call(paramInt1, i2, i3, 0);
/*  94 */           if (i4 != -1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           i1 = SystemLibrary.__errno_location();
/* 105 */           if (MainMemory.getI32(i1) != 4) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           MainMemory.setI32(i1, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 120 */         if (i4 < 0) {
/* 121 */           m = i4;
/* 122 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         if (i4 == 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         m = i4 + m;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */       if (m < 0) {
/* 150 */         paramInt1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 160 */         MainMemory.setI32(j, SystemLibrary.bswapInt(MainMemory.getI32(j)) + -4);
/* 161 */         n = paramInt2;
/* 162 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 169 */           if (i3 >= 4) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */           i4 = 4 - i3;
/* 181 */           i2 = n + i3;
/*     */           
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 187 */             i6 = recv.call(paramInt1, i2, i4, 0);
/* 188 */             if (i6 != -1) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */             i1 = SystemLibrary.__errno_location();
/* 199 */             if (MainMemory.getI32(i1) != 4) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */             MainMemory.setI32(i1, 0);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 214 */           if (i6 < 0) {
/* 215 */             i3 = i6;
/* 216 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */           if (i6 == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */           i3 = i6 + i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */         if (i3 < 0) {
/* 244 */           paramInt1 = i3;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 254 */           MainMemory.setI32(paramInt2, SystemLibrary.bswapInt(MainMemory.getI32(paramInt2)));
/* 255 */           i4 = MainMemory.getI32(j);
/* 256 */           if (i4 <= 1200) {
/*     */             break label527;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 266 */           MainMemory.setI32(j, 1200);
/* 267 */           i4 = 1200;
/*     */           
/*     */           break label548;
/*     */           
/*     */           label527:
/* 272 */           if (i4 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 277 */             paramInt1 = i3;
/*     */             
/*     */ 
/*     */             break label799;
/*     */           }
/*     */           
/*     */           label548:
/*     */           
/* 285 */           i6 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 292 */             if (i6 >= i4)
/*     */             {
/*     */ 
/*     */ 
/* 296 */               paramInt1 = i6;
/* 297 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 303 */             i7 = i4 - i6;
/* 304 */             n = k + i6;
/*     */             
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 310 */               i5 = recv.call(paramInt1, n, i7, 0);
/* 311 */               if (i5 != -1) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */               paramInt2 = SystemLibrary.__errno_location();
/* 322 */               if (MainMemory.getI32(paramInt2) != 4) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 332 */               MainMemory.setI32(paramInt2, 0);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/* 337 */             if (i5 < 0) {
/* 338 */               paramInt1 = i5;
/* 339 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */             if (i5 == 0) {
/* 349 */               paramInt1 = i6;
/* 350 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */             i6 = i5 + i6;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */           i4 = MainMemory.getI32(j);
/* 367 */           if (i4 <= 4) {
/*     */             break label761;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 378 */           MainMemory.setI32(j, 4);
/* 379 */           i4 = 4;
/*     */           
/*     */ 
/*     */ 
/*     */           label761:
/*     */           
/*     */ 
/* 386 */           SystemLibrary.memcpy(paramInt3, k, i4, 1);
/* 387 */           if (paramInt1 >= 0) {
/*     */             break label799;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label787:
/*     */       
/*     */ 
/*     */ 
/* 400 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       break label812;
/*     */       
/*     */ 
/*     */       label799:
/*     */       
/* 408 */       i = i3 + m + paramInt1;
/*     */       
/*     */ 
/*     */       label812:
/*     */       
/*     */ 
/* 414 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 419 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F272093.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */