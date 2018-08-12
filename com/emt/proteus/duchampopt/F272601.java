/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ public final class F272601 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3085;
/*  13 */   public static final Function _instance = new F272601();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F272601() { super("F272601", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  40 */     int i1 = call(i, j, k, m, n);
/*  41 */     paramFrame.setI32(paramInt1, i1);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  47 */     int i = 0;
/*     */     
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  58 */       j = com.emt.proteus.runtime.library.c.malloc.call(SystemLibrary.strlen(paramInt1) + 1);
/*  59 */       SystemLibrary.strcpy(j, paramInt1);
/*  60 */       MainMemory.setI32(paramInt4, 80);
/*  61 */       SystemLibrary.memcpy(paramInt2, 26528, 6, 1);
/*  62 */       SystemLibrary.memcpy(paramInt3, 48000, 10, 1);
/*  63 */       MainMemory.setI16(paramInt5, (short)47);
/*  64 */       paramInt1 = SystemLibrary.strstr(j, 26528);
/*  65 */       if (paramInt1 != 0) {
/*     */         break label262;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       paramInt1 = SystemLibrary.strstr(j, 27008);
/*  76 */       if (paramInt1 != 0) {
/*     */         break label210;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       paramInt1 = SystemLibrary.strstr(j, 20576);
/*  87 */       if (paramInt1 == 0) {
/*  88 */         paramInt1 = j;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (paramInt1 != j) {
/*     */           break label192;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         SystemLibrary.memcpy(paramInt2, 20576, 5, 1);
/* 109 */         MainMemory.setI32(paramInt4, 21);
/* 110 */         paramInt1 = j + 4;
/*     */         
/*     */         break label291;
/*     */         
/*     */         label192:
/*     */         
/* 116 */         free.call(j);
/* 117 */         i = 1;
/*     */         
/*     */ 
/*     */         break label802;
/*     */         
/*     */         label210:
/*     */         
/* 124 */         if (paramInt1 != j) {
/*     */           break label244;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         paramInt1 = j + 5;
/*     */         
/*     */         break label291;
/*     */         
/*     */         label244:
/*     */         
/* 140 */         free.call(j);
/* 141 */         i = 1;
/*     */         
/*     */ 
/*     */         break label802;
/*     */         
/*     */         label262:
/*     */         
/* 148 */         if (paramInt1 != j) {
/*     */           break label789;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         paramInt1 = j + 5;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label291:
/*     */       
/*     */ 
/* 166 */       if (MainMemory.getI8(paramInt1) != 47) {
/*     */         break label346;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */       if (MainMemory.getI8(paramInt1 + 1) != 47) {
/*     */         break label346;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */       paramInt1 += 2;
/*     */       
/*     */ 
/*     */ 
/*     */       label346:
/*     */       
/*     */ 
/*     */ 
/* 196 */       if (SystemLibrary.strcmp(paramInt2, 26528) != 0) {
/*     */         break label640;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */       paramInt2 = SystemLibrary.strchr(paramInt1, 64);
/* 207 */       if (paramInt2 != 0)
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
/* 218 */         paramInt1 = paramInt2 + 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */       SystemLibrary.strcpy(paramInt3, paramInt1);
/* 227 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 234 */         paramInt2 = paramInt1 + k;
/* 235 */         switch (MainMemory.getI8(paramInt2))
/*     */         {
/*     */         case 47: 
/*     */           break;
/*     */         case 58: 
/*     */           break;
/*     */         case 0: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 249 */         MainMemory.setI8(paramInt3 + k, (byte)0);
/* 250 */         n = MainMemory.getI8(paramInt2);
/* 251 */         if (n != 58)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 256 */           paramInt1 = paramInt2;
/* 257 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 263 */         k += 1;
/* 264 */         SystemLibrary.sscanf(paramInt1 + k, 15680, new int[] { paramInt4 });
/* 265 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 272 */           paramInt2 = paramInt1 + (k + m);
/* 273 */           n = MainMemory.getI8(paramInt2);
/* 274 */           switch (n) {
/*     */           case 0: 
/* 276 */             paramInt1 = paramInt2;
/*     */             break label728;
/*     */             break;
/* 279 */           case 47:  paramInt1 = paramInt2;
/*     */             
/*     */ 
/*     */             break label728;
/*     */             
/*     */ 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 289 */           m += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 295 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label640:
/*     */       
/* 301 */       SystemLibrary.strcpy(paramInt3, paramInt1);
/* 302 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 309 */         paramInt2 = paramInt1 + k;
/* 310 */         switch (MainMemory.getI8(paramInt2))
/*     */         {
/*     */         case 0: 
/*     */           break;
/*     */         case 47: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 322 */         MainMemory.setI8(paramInt3 + k, (byte)0);
/* 323 */         n = MainMemory.getI8(paramInt2);
/*     */         
/* 325 */         paramInt1 = paramInt2;
/*     */         
/*     */ 
/*     */ 
/*     */         label728:
/*     */         
/*     */ 
/*     */ 
/* 333 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */           SystemLibrary.strcpy(paramInt5, paramInt1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 349 */         free.call(j);
/* 350 */         i = 0;
/* 351 */         break;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label789:
/*     */       
/* 363 */       free.call(j);
/* 364 */       i = 1;
/*     */       
/*     */ 
/*     */       label802:
/*     */       
/*     */ 
/* 370 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F272601.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */