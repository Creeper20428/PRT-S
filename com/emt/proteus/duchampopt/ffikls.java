/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class ffikls
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3482;
/*  15 */   public static final Function _instance = new ffikls();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffikls() { super("ffikls", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, m, n);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*     */     
/*     */ 
/*  66 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(71);
/*  71 */       j = MainMemory.alloc(81);
/*  72 */       k = MainMemory.alloc(81);
/*  73 */       m = MainMemory.alloc(71);
/*  74 */       n = MainMemory.alloc(4);
/*  75 */       MainMemory.setI32(n, -1);
/*  76 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         i1 = SystemLibrary.strlen(paramInt3);
/*  87 */         i5 = SystemLibrary.strchr(paramInt3, 39);
/*  88 */         if (i5 == 0) {
/*  89 */           i2 = 0;
/*  90 */           i3 = 0;
/*     */           break label204;
/*     */         } else {
/*  93 */           i3 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 104 */           i5 = SystemLibrary.strchr(i5 + 1, 39);
/* 105 */           i8 = i3 + 1;
/* 106 */           if (i5 == 0) {
/*     */             break;
/*     */           }
/*     */           
/* 110 */           i3 = i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         i3 ^= 0xFFFFFFFF;
/* 119 */         i2 = i3;
/* 120 */         i3 = i8;
/*     */         
/*     */ 
/*     */ 
/*     */         label204:
/*     */         
/*     */ 
/*     */ 
/* 128 */         SystemLibrary.strncpy(k, paramInt2, 80);
/* 129 */         MainMemory.setI8(k + 80, (byte)0);
/* 130 */         i4 = MainMemory.getI8(k);
/* 131 */         if (i4 == 32) {
/* 132 */           i8 = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 137 */           i5 = k;
/*     */           
/*     */ 
/*     */           break label293;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/* 145 */           i8 += 1;
/* 146 */           i5 = k + i8;
/* 147 */           i4 = MainMemory.getI8(i5);
/* 148 */         } while (i4 == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label293:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */         i8 = SystemLibrary.strlen(i5);
/* 164 */         if (i8 <= 8)
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
/* 175 */           if (fftkey.call(i5, n) <= 0) {
/*     */             break label515;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */           i4 = MainMemory.getI8(i5);
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 193 */           switch (i4)
/*     */           {
/*     */           case 72: 
/*     */             break;
/*     */           case 104: 
/*     */             break label442;
/*     */             
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 204 */           if (SystemLibrary.strncmp(i5, 47360, 9) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */             if (i4 != 104) {
/*     */               break label491;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label442:
/*     */             
/*     */ 
/*     */ 
/* 224 */             if (SystemLibrary.strncmp(i5, 47392, 9) != 0) {
/*     */               break label491;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 234 */           i2 = i2 + 75 - i8;
/* 235 */           i8 = i2;
/*     */           
/*     */           break label531;
/*     */           
/*     */           label491:
/* 240 */           i2 = i2 + 66 - i8;
/* 241 */           i8 = i2;
/*     */           
/*     */           break label531;
/*     */         }
/*     */         label515:
/* 246 */         i2 = 68 - i3;
/* 247 */         i8 = i2;
/*     */         
/*     */ 
/*     */ 
/*     */         label531:
/*     */         
/*     */ 
/* 254 */         if (i1 <= 0) {
/*     */           break label831;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 264 */         i3 = 68 - i3;
/* 265 */         i6 = j + 8;
/* 266 */         i2 = 0;
/* 267 */         i7 = i8;
/*     */         
/* 269 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 279 */           SystemLibrary.strncpy(m, paramInt3 + i8, i7);
/* 280 */           MainMemory.setI8(m + i7, (byte)0);
/* 281 */           ffs2c.call(m, i, MainMemory.getI32(paramInt5));
/* 282 */           if (i1 <= i7) {
/*     */             break label723;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */           i9 = SystemLibrary.strlen(i);
/* 294 */           i7 += -1;
/* 295 */           i5 = i + (i9 + -2);
/* 296 */           if (MainMemory.getI8(i5) != 39) {
/*     */             break label711;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */           MainMemory.setI8(i + (i9 + -3), (byte)38);
/* 307 */           MainMemory.setI8(i + (i9 + -1), (byte)0);
/*     */           
/*     */           break label723;
/*     */           
/*     */           label711:
/*     */           
/* 313 */           MainMemory.setI8(i5, (byte)38);
/*     */           
/*     */ 
/*     */ 
/*     */           label723:
/*     */           
/*     */ 
/*     */ 
/* 321 */           if (i2 != 0) {
/*     */             break label762;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 331 */           ffmkky.call(paramInt2, i, paramInt4, j, paramInt5);
/*     */           
/*     */           break label787;
/*     */           
/*     */           label762:
/* 336 */           ffmkky.call(44288, i, paramInt4, j, paramInt5);
/* 337 */           MainMemory.setI16(i6, (short)8224);
/*     */           
/*     */ 
/*     */           label787:
/*     */           
/*     */ 
/* 343 */           ffikey.call(paramInt1, j, paramInt5);
/* 344 */           i1 -= i7;
/* 345 */           i8 = i7 + i8;
/* 346 */           if (i1 <= 0) break;
/* 347 */           i2 = 1;
/* 348 */           i7 = i3;
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label831:
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 370 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffikls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */