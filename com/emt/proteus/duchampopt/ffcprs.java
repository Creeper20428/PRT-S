/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class ffcprs extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3203;
/*  12 */   public static final Function _instance = new ffcprs();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffcprs() { super("ffcprs", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  19 */     call();
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, com.emt.proteus.runtime.api.Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     call();
/*  26 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call()
/*     */   {
/*  32 */     int i = 0;
/*  33 */     int j = 0;
/*  34 */     int k = 0;
/*  35 */     int m = 0;
/*  36 */     int n = 0;
/*  37 */     int i1 = 0;
/*  38 */     int i2 = 0;
/*  39 */     int i3 = 0;
/*  40 */     int i4 = 0;
/*  41 */     int i5 = 0;
/*  42 */     int i6 = 0;
/*  43 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       if (MainMemory.getI32Aligned(470816) <= 0) {
/*     */         break label418;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  59 */       i = MainMemory.getI32Aligned(470820);
/*  60 */       if (i != 0) {
/*     */         break label113;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */       SystemLibrary.printf(89568, new Object[] { Integer.valueOf(43520), Integer.valueOf(938) });
/*     */       
/*     */       break label122;
/*     */       
/*     */       label113:
/*  75 */       free.call(i);
/*     */       
/*     */ 
/*     */       label122:
/*     */       
/*     */ 
/*  81 */       j = MainMemory.getI32Aligned(470824);
/*  82 */       if (MainMemory.getI32Aligned(470816) > 0)
/*     */       {
/*  84 */         m = 0;
/*     */       } else {
/*     */         break label344;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  97 */         k = m + 1;
/*  98 */         if (MainMemory.getI32(j + m * 124 + 116) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */           if (MainMemory.getI32(j + m * 124 + 84) != 262) {
/*     */             break label293;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           i2 = MainMemory.getI32(MainMemory.getI32(j + m * 124 + 120));
/* 119 */           if (i2 != 0) {
/*     */             break label283;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */           SystemLibrary.printf(131872, new Object[] { Integer.valueOf(43520), Integer.valueOf(942) });
/*     */           
/*     */           break label293;
/*     */           
/*     */           label283:
/* 134 */           free.call(i2);
/*     */           
/*     */ 
/*     */           label293:
/*     */           
/*     */ 
/* 140 */           free.call(MainMemory.getI32(MainMemory.getI32Aligned(470824) + m * 124 + 116));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 146 */         j = MainMemory.getI32Aligned(470824);
/* 147 */         if (MainMemory.getI32Aligned(470816) <= k)
/*     */           break;
/* 149 */         m = k;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label344:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 161 */       if (j != 0) {
/*     */         break label398;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */       SystemLibrary.printf(89632, new Object[] { Integer.valueOf(43520), Integer.valueOf(945) });
/*     */       
/*     */       break label407;
/*     */       
/*     */       label398:
/* 176 */       free.call(j);
/*     */       
/*     */ 
/*     */       label407:
/*     */       
/*     */ 
/* 182 */       MainMemory.setI32Aligned(470816, 0);
/*     */       
/*     */ 
/*     */       label418:
/*     */       
/*     */ 
/* 188 */       k = MainMemory.getI32Aligned(470796);
/* 189 */       if (k <= 0) {
/*     */         break label844;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */         m = k + -1;
/* 210 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 217 */           i7 = k - n;
/* 218 */           i1 = MainMemory.getI32Aligned(470792);
/* 219 */           switch (MainMemory.getI32(i1 + (m - n) * 344))
/*     */           {
/*     */           case 1032: 
/*     */             break label749;
/*     */             
/*     */             break;
/*     */           case 1033: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 230 */           i2 = MainMemory.getI32(i1 + MainMemory.getI32(i1 + i7 * 344 + 65204) * 344 + 56 + 32);
/* 231 */           i3 = i2;
/* 232 */           i4 = i2 + 4;
/* 233 */           i5 = MainMemory.getI32(i4);
/* 234 */           if (MainMemory.getI32(i3) > 0)
/*     */           {
/* 236 */             i6 = 0;
/*     */           } else {
/*     */             break label709;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 249 */             i7 = i6 + 1;
/* 250 */             if (MainMemory.getI32(i5 + i6 * 164 + 4) != 11) {
/*     */               break label678;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */             free.call(MainMemory.getI32(i5 + i6 * 164 + 44 + 4));
/*     */             
/*     */ 
/*     */             label678:
/*     */             
/*     */ 
/* 266 */             i5 = MainMemory.getI32(i4);
/* 267 */             if (MainMemory.getI32(i3) <= i7)
/*     */               break;
/* 269 */             i6 = i7;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label709:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 281 */           if (i5 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */             free.call(i5);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 297 */           free.call(i2);
/*     */           
/*     */           break label808;
/*     */           
/*     */           label749:
/* 302 */           i2 = MainMemory.getI32(i1 + MainMemory.getI32(i1 + i7 * 344 + 65204) * 344 + 56 + 32);
/* 303 */           if (i2 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 313 */             free.call(i2);
/*     */           }
/*     */           
/*     */ 
/*     */           label808:
/*     */           
/* 319 */           n += 1;
/* 320 */           if (n == k) {
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
/* 331 */       MainMemory.setI32Aligned(470796, 0);
/*     */       
/*     */ 
/*     */       label844:
/*     */       
/*     */ 
/* 337 */       i1 = MainMemory.getI32Aligned(470792);
/* 338 */       if (i1 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */         free.call(i1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 354 */       MainMemory.setI32Aligned(470792, 0);
/* 355 */       MainMemory.setI32Aligned(470848, -1);
/* 356 */       MainMemory.setI32Aligned(470828, 0); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcprs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */