/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F290892 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3169;
/*  11 */   public static final Function _instance = new F290892();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F290892() { super("F290892", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     byte b = call(i, j, k);
/*  33 */     paramFrame.setI8(paramInt1, b);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     byte b1 = 0;
/*     */     
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*     */     
/*     */ 
/*  52 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       i = MainMemory.alloc(256);
/*  57 */       j = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt1);
/*  58 */       k = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt3);
/*  59 */       if (j >= k) {
/*     */         break label252;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       if (k == j) {
/*  70 */         i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  80 */         i1 = k - j;
/*  81 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  88 */           MainMemory.setI8(i + i4, (byte)48);
/*  89 */           i4 += 1;
/*  90 */           if (i4 == i1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */       if (j == 0) {
/* 104 */         j = i1;
/*     */         break label226;
/*     */       } else {
/* 107 */         i4 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 116 */         MainMemory.setI8(i + (i1 + i4), MainMemory.getI8(paramInt1 + i4));
/* 117 */         i4 += 1;
/* 118 */         if (i4 == j) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       j += i1;
/*     */       
/*     */ 
/*     */ 
/*     */       label226:
/*     */       
/*     */ 
/*     */ 
/* 137 */       MainMemory.setI8(i + j, (byte)0);
/* 138 */       i4 = k;
/*     */       
/* 140 */       paramInt1 = i;
/*     */       
/*     */       break label449;
/*     */       
/*     */       label252:
/* 145 */       if (k >= j)
/*     */       {
/*     */ 
/*     */ 
/* 149 */         i4 = j;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 158 */         if (j == k) {
/* 159 */           i1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 169 */           i1 = j - k;
/* 170 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 177 */             MainMemory.setI8(i + i4, (byte)48);
/* 178 */             i4 += 1;
/* 179 */             if (i4 == i1) {
/*     */               break;
/*     */             }
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
/* 192 */         if (k == 0) {
/* 193 */           k = i1;
/*     */           break label428;
/*     */         } else {
/* 196 */           i4 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 205 */           MainMemory.setI8(i + (i1 + i4), MainMemory.getI8(paramInt3 + i4));
/* 206 */           i4 += 1;
/* 207 */           if (i4 == k) {
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
/* 218 */         k += i1;
/*     */         
/*     */ 
/*     */ 
/*     */         label428:
/*     */         
/*     */ 
/*     */ 
/* 226 */         MainMemory.setI8(i + k, (byte)0);
/* 227 */         i4 = j;
/* 228 */         paramInt3 = i;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label449:
/*     */       
/*     */ 
/*     */ 
/* 238 */       j = 1;
/* 239 */       k = 0;
/* 240 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 251 */         i2 = i4 + -1;
/* 252 */         i3 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 259 */           i4 = i2 - i3;
/* 260 */           if (i4 != -1) {
/*     */             break label680;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */           switch (paramInt2) {
/*     */           case 279: 
/*     */             break label644;
/*     */             break;
/*     */           case 280: 
/*     */             break label620;
/*     */             break;
/*     */           case 281: 
/*     */             break label596;
/*     */             break;
/*     */           case 282: 
/*     */             break;
/*     */           }
/* 283 */           b1 = (byte)(i1 >= k ? 1 : 0);
/*     */           
/*     */ 
/*     */           break label863;
/*     */           
/*     */           label596:
/*     */           
/* 290 */           b1 = (byte)(i1 <= k ? 1 : 0);
/*     */           
/*     */ 
/*     */           break label863;
/*     */           
/*     */           label620:
/*     */           
/* 297 */           b1 = (byte)(i1 < k ? 1 : 0);
/*     */           
/*     */ 
/*     */           break label863;
/*     */           
/*     */           label644:
/*     */           
/* 304 */           b1 = (byte)(i1 > k ? 1 : 0);
/*     */           
/*     */ 
/*     */ 
/*     */           break label863;
/*     */           
/*     */ 
/* 311 */           b1 = 0;
/*     */           
/*     */ 
/*     */           break label863;
/*     */           
/*     */           label680:
/*     */           
/* 318 */           m = MainMemory.getI8(paramInt1 + i4);
/* 319 */           n = MainMemory.getI8(paramInt3 + i4);
/* 320 */           switch (m)
/*     */           {
/*     */           case 88: 
/*     */             break label791;
/*     */             
/*     */             break;
/*     */           case 120: 
/*     */             break label791;
/*     */             break;
/*     */           }
/*     */           
/* 331 */           switch (n)
/*     */           {
/*     */           case 88: 
/*     */             break;
/*     */           case 120: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */           label791:
/*     */           
/* 343 */           i4 = i3 + 1;
/* 344 */           i3 = i4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 349 */         i1 = (m == 49 ? j : 0) + i1;
/* 350 */         k = (n == 49 ? j : 0) + k;
/* 351 */         j <<= 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label863:
/*     */       
/*     */ 
/* 359 */       return b1;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 364 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F290892.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */