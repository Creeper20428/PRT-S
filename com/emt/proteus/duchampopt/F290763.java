/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F290763 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3168;
/*  11 */   public static final Function _instance = new F290763();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F290763() { super("F290763", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
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
/*  29 */     byte b = call(i, j);
/*  30 */     paramFrame.setI8(paramInt1, b);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     byte b1 = 0;
/*     */     
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     byte b2 = 0;
/*     */     
/*     */ 
/*  46 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  50 */       i = MainMemory.alloc(256);
/*  51 */       j = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt1);
/*  52 */       k = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt2);
/*  53 */       if (j >= k) {
/*     */         break label233;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */       if (k == j) {
/*  64 */         k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  74 */         k -= j;
/*  75 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  82 */           MainMemory.setI8(i + m, (byte)48);
/*  83 */           m += 1;
/*  84 */           if (m == k) {
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
/*  97 */       if (j == 0) {
/*  98 */         j = k;
/*     */         break label213;
/*     */       } else {
/* 101 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 110 */         MainMemory.setI8(i + (k + m), MainMemory.getI8(paramInt1 + m));
/* 111 */         m += 1;
/* 112 */         if (m == j) {
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
/* 123 */       j += k;
/*     */       
/*     */ 
/*     */ 
/*     */       label213:
/*     */       
/*     */ 
/*     */ 
/* 131 */       MainMemory.setI8(i + j, (byte)0);
/*     */       
/* 133 */       paramInt1 = i;
/*     */       
/*     */       break label414;
/*     */       
/*     */       label233:
/* 138 */       if (k >= j) {
/*     */         break label414;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       if (j == k) {
/* 151 */         j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 161 */         j -= k;
/* 162 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 169 */           MainMemory.setI8(i + m, (byte)48);
/* 170 */           m += 1;
/* 171 */           if (m == j) {
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
/* 184 */       if (k == 0) {
/*     */         break label399;
/*     */       }
/*     */       else {
/* 188 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 197 */         MainMemory.setI8(i + (j + m), MainMemory.getI8(paramInt2 + m));
/* 198 */         m += 1;
/* 199 */         if (m == k) {
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
/* 210 */       j = k + j;
/*     */       
/*     */ 
/*     */ 
/*     */       label399:
/*     */       
/*     */ 
/*     */ 
/* 218 */       MainMemory.setI8(i + j, (byte)0);
/* 219 */       paramInt2 = i;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label414:
/*     */       
/*     */ 
/*     */ 
/* 228 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 235 */         b2 = MainMemory.getI8(paramInt1 + j);
/* 236 */         if (b2 == 0) {
/* 237 */           b2 = 1;
/* 238 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */         n = MainMemory.getI8(paramInt2 + j);
/* 248 */         if ((b2 == 48) && (n == 49)) {
/* 249 */           b2 = 0;
/* 250 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */         j += 1;
/* 260 */         if ((b2 == 49) && (n == 48)) {
/* 261 */           b2 = 0; break;
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
/*     */ 
/* 273 */       b1 = b2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */       return b1;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 284 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F290763.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */