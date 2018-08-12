/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffldrc extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2966;
/*  13 */   public static final Function _instance = new ffldrc();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffldrc() { super("ffldrc", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, j, k, m);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     long l1 = 0L;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     long l2 = 0L;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  59 */       j = MainMemory.getI32(paramInt1);
/*  60 */       i = paramInt1 + 4;
/*  61 */       if (j == MainMemory.getI32(MainMemory.getI32(i) + 64)) {
/*  62 */         i2 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  72 */         ffmahd.call(paramInt1, j + 1, 0, paramInt4);
/*  73 */         i2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  80 */         j = 39 - i2;
/*  81 */         if (j <= -1) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         k = MainMemory.getI32(i);
/*  92 */         i1 = MainMemory.getI32(k + 1536 + (j << 2));
/*  93 */         if (MainMemory.getI32(k + 1216 + (i1 << 2)) == paramInt2)
/*     */         {
/*  95 */           paramInt2 = i1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           break label738;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 105 */         j = i2 + 1;
/* 106 */         i2 = j;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 111 */       l1 = paramInt2 * 2880L;
/* 112 */       k = MainMemory.getI32(i);
/* 113 */       if (paramInt3 != 0) {
/*     */         break label258;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */       if (MainMemory.getI64(k + 32) <= l1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         MainMemory.setI32(paramInt4, 107);
/*     */       }
/*     */       else
/*     */       {
/*     */         label258:
/*     */         
/*     */ 
/* 140 */         paramInt3 = MainMemory.getI32(k + 1536);
/* 141 */         if (paramInt3 >= 0) {
/*     */           break label301;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         MainMemory.setI32(paramInt4, 103);
/*     */         
/*     */ 
/*     */         break label960;
/*     */         
/*     */         label301:
/*     */         
/* 158 */         if (MainMemory.getI32(k + 1376 + (paramInt3 << 2)) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 169 */           ffbfwt.call(k, paramInt3, paramInt4);
/* 170 */           k = MainMemory.getI32(i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         if (MainMemory.getI64(k + 24) <= l1) {
/*     */           break label562;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */         if (MainMemory.getI64(k + 52) != l1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */           SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 72), MainMemory.getI32(k), l1);
/* 200 */           k = MainMemory.getI32(i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 208 */         i1 = SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 76), MainMemory.getI32(k), MainMemory.getI32(k + 1212) + paramInt3 * 2880, 2880);
/* 209 */         if (i1 != 107) {
/*     */           break label522;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */         MainMemory.setI32(paramInt4, 107);
/*     */         
/*     */         break label535;
/*     */         
/*     */         label522:
/* 224 */         ffldrc_1119.call(k, paramInt4, i1);
/*     */         
/*     */ 
/*     */         label535:
/*     */         
/*     */ 
/* 230 */         MainMemory.setI64(MainMemory.getI32(i) + 52, l1 + 2880L);
/*     */         
/*     */         break label707;
/*     */         
/*     */         label562:
/* 235 */         m = MainMemory.getI32(k + 1212) + paramInt3 * 2880;
/* 236 */         if (MainMemory.getI32(k + 68) != 1) {
/*     */           break label625;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */         SystemLibrary.memset(m, (byte)32, 2880, 1);
/*     */         
/*     */         break label640;
/*     */         
/*     */         label625:
/* 251 */         SystemLibrary.memset(m, (byte)0, 2880, 1);
/*     */         
/*     */ 
/*     */         label640:
/*     */         
/*     */ 
/* 257 */         l1 += 2880L;
/* 258 */         n = MainMemory.getI32(i) + 32;
/* 259 */         l2 = MainMemory.getI64(n);
/* 260 */         MainMemory.setI64(n, l1 >= l2 ? l1 : l2);
/* 261 */         MainMemory.setI32(MainMemory.getI32(i) + 1376 + (paramInt3 << 2), 1);
/*     */         
/*     */ 
/*     */         label707:
/*     */         
/*     */ 
/* 267 */         MainMemory.setI32(MainMemory.getI32(i) + 1216 + (paramInt3 << 2), paramInt2);
/* 268 */         k = MainMemory.getI32(i);
/*     */         
/* 270 */         paramInt2 = paramInt3;
/*     */         
/*     */ 
/*     */ 
/*     */         label738:
/*     */         
/*     */ 
/*     */ 
/* 278 */         MainMemory.setI32(k + 60, paramInt2);
/* 279 */         if (j < 0) {
/* 280 */           paramInt3 = 0;
/*     */         }
/*     */         else
/*     */         {
/* 284 */           paramInt3 = j;
/*     */           
/*     */ 
/*     */           break label833;
/*     */         }
/*     */         
/*     */         for (;;)
/*     */         {
/* 292 */           if (paramInt3 >= 40) {
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
/* 303 */           if (MainMemory.getI32(MainMemory.getI32(i) + 1536 + (paramInt3 << 2)) == paramInt2) {
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
/* 314 */           paramInt3 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */         label833:
/*     */         
/*     */ 
/* 321 */         j = paramInt3 + 1;
/* 322 */         k = MainMemory.getI32(i);
/* 323 */         if (j >= 40) {
/*     */           break label945;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */         i1 = 39 - paramInt3;
/* 335 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 344 */           MainMemory.setI32(k + 1536 + (paramInt3 + i2 << 2), MainMemory.getI32(k + 1536 + (j + i2 << 2)));
/* 345 */           k = MainMemory.getI32(i);
/* 346 */           i2 += 1;
/* 347 */           if (i2 == i1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label945:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 361 */         MainMemory.setI32(k + 1692, paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */       label960:
/*     */       
/* 367 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffldrc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */