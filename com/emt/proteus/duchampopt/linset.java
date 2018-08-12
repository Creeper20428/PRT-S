/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class linset extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2789;
/*  14 */   public static final Function _instance = new linset();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public linset() { super("linset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = call(i);
/*  30 */     paramFrame.setI32(paramInt1, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     boolean bool = false;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     double d = 0.0D;
/*  52 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       if (paramInt == 0) {
/*  59 */         j = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  69 */         j = MainMemory.getI32(paramInt + 4);
/*  70 */         k = paramInt + 28;
/*  71 */         MainMemory.setI32(k, 1);
/*  72 */         m = j > 0 ? 1 : 0;
/*  73 */         if (m == 0) {
/*     */           break label781;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         i1 = paramInt + 12;
/*  84 */         i4 = MainMemory.getI32(i1);
/*  85 */         i9 = 1;
/*     */         
/*  87 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  96 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 105 */             if (n >= j) {
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
/*     */ 
/* 117 */             d = MainMemory.getF64(i4);
/* 118 */             if (n != i2) {
/*     */               break label232;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */             i4 += 8;
/* 129 */             if (!MathUtils.f_une(d, 1.0D)) {
/*     */               break label279;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */             MainMemory.setI32(k, 0);
/* 141 */             i9 = 0;
/*     */             
/* 143 */             break;
/*     */             
/*     */             label232:
/*     */             
/* 147 */             i4 += 8;
/* 148 */             if (!MathUtils.f_une(d, 0.0D)) {
/*     */               break label279;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */             MainMemory.setI32(k, 0);
/* 160 */             i9 = 0;
/*     */             
/* 162 */             break;
/*     */             
/*     */ 
/*     */             label279:
/*     */             
/* 167 */             n += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */           i2 += 1;
/* 177 */           if (i2 == j) {
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
/*     */ 
/* 190 */         bool = MainMemory.getI32(paramInt) == 137;
/* 191 */         if (i9 != 0) {
/*     */           break label754;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */         if (!bool) {
/*     */           break label408;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */         if (MainMemory.getI32(paramInt + 32) >= j) {
/*     */           break label521;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */         linset_1561.call(paramInt, bool);
/*     */         
/*     */ 
/*     */         label408:
/*     */         
/*     */ 
/* 227 */         i9 = j * j;
/* 228 */         i7 = com.emt.proteus.runtime.library.c.calloc.call(i9, 8);
/* 229 */         i3 = paramInt + 20;
/* 230 */         MainMemory.setI32(i3, i7);
/* 231 */         if (i7 == 0) {
/* 232 */           j = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 242 */           i7 = com.emt.proteus.runtime.library.c.calloc.call(i9, 8);
/* 243 */           MainMemory.setI32(paramInt + 24, i7);
/* 244 */           if (i7 != 0) {
/*     */             break label508;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */           free.call(MainMemory.getI32(i3));
/* 255 */           i = 2;
/*     */           
/*     */ 
/*     */           break label919;
/*     */           
/*     */           label508:
/*     */           
/* 262 */           MainMemory.setI32(paramInt + 32, j);
/*     */           
/*     */ 
/*     */           label521:
/*     */           
/*     */ 
/* 268 */           i3 = paramInt + 20;
/* 269 */           i4 = MainMemory.getI32(i3);
/* 270 */           if (m == 0) {
/*     */             break label712;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */           i5 = MainMemory.getI32(i1);
/* 282 */           i1 = paramInt + 16;
/* 283 */           i9 = j << 3;
/*     */           
/*     */ 
/* 286 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 295 */             n = i2 << 3;
/* 296 */             i6 = i5 + i9;
/* 297 */             i7 = i4 + i9;
/* 298 */             i8 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 305 */               d = MainMemory.getF64(MainMemory.getI32(i1) + n) * MainMemory.getF64(i5 + (i8 << 3));
/* 306 */               MainMemory.setF64(i4 + (i8 << 3), d);
/* 307 */               i8 += 1;
/* 308 */               if (i8 == j) {
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
/* 319 */             i5 = i6;
/* 320 */             i4 = i7;
/* 321 */             i2 += 1;
/* 322 */             if (i2 == j) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 335 */           i4 = MainMemory.getI32(i3);
/*     */           
/*     */ 
/*     */ 
/*     */           label712:
/*     */           
/*     */ 
/*     */ 
/* 343 */           j = matinv.call(j, i4, MainMemory.getI32(paramInt + 24));
/* 344 */           if (j == 0) {
/* 345 */             k = paramInt;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             break label905;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 357 */       i = j;
/*     */       
/*     */ 
/*     */       break label919;
/*     */       
/*     */       label754:
/*     */       
/* 364 */       if (bool) {
/* 365 */         k = paramInt;
/*     */         break label808;
/*     */       } else {
/* 368 */         k = paramInt;
/*     */         
/*     */         break label876;
/*     */       }
/*     */       
/*     */       label781:
/*     */       
/* 375 */       if (MainMemory.getI32(paramInt) == 137) {
/* 376 */         k = paramInt;
/*     */       }
/*     */       else
/*     */       {
/* 380 */         k = paramInt;
/*     */         
/*     */ 
/*     */         break label876;
/*     */       }
/*     */       
/*     */       label808:
/*     */       
/* 388 */       i4 = MainMemory.getI32(paramInt + 20);
/* 389 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 399 */         free.call(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 405 */       i4 = MainMemory.getI32(paramInt + 24);
/* 406 */       if (i4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 417 */         free.call(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label876:
/*     */       
/*     */ 
/* 425 */       MainMemory.setI32(paramInt + 20, 0);
/* 426 */       MainMemory.setI32(paramInt + 24, 0);
/* 427 */       MainMemory.setI32(paramInt + 32, 0);
/*     */       
/*     */ 
/*     */ 
/*     */       label905:
/*     */       
/*     */ 
/*     */ 
/* 435 */       MainMemory.setI32(k, 137);
/* 436 */       i = 0;
/*     */       
/*     */ 
/*     */       label919:
/*     */       
/*     */ 
/* 442 */       int i10 = i; return i10;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */