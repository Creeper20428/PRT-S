/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class F306033 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3193;
/*  14 */   public static final Function _instance = new F306033();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F306033() { super("F306033", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  38 */     int n = call(i, j, k, m);
/*  39 */     paramFrame.setI32(paramInt1, n);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*     */     
/*     */ 
/*  62 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       j = MainMemory.alloc(80);
/*  67 */       if ((paramInt4 | paramInt2) < 0) {
/*  68 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  78 */         i4 = MainMemory.getI32Aligned(470796);
/*  79 */         m = MainMemory.getI32Aligned(470800);
/*  80 */         if (i4 != m)
/*     */         {
/*     */ 
/*     */ 
/*  84 */           m = i4;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  91 */           n = MainMemory.getI32Aligned(470792);
/*  92 */           if (n != 0) {
/*     */             break label159;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */           MainMemory.setI32Aligned(470800, 100);
/* 103 */           k = com.emt.proteus.runtime.library.c.malloc.call(34400);
/*     */           
/*     */           break label186;
/*     */           
/*     */           label159:
/*     */           
/* 109 */           MainMemory.setI32Aligned(470800, m << 1);
/* 110 */           k = realloc.call(n, m * 688);
/*     */           
/*     */ 
/*     */ 
/*     */           label186:
/*     */           
/*     */ 
/*     */ 
/* 118 */           if (k != 0) {
/*     */             break label224;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */           MainMemory.setI32Aligned(470852, 113);
/* 129 */           i = -1;
/*     */           
/*     */ 
/*     */           break label1378;
/*     */           
/*     */           label224:
/*     */           
/* 136 */           MainMemory.setI32Aligned(470792, k);
/* 137 */           m = MainMemory.getI32Aligned(470796);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         MainMemory.setI32Aligned(470796, m + 1);
/* 146 */         if (m <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 150 */           paramInt1 = m;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 157 */           n = MainMemory.getI32Aligned(470792);
/* 158 */           i1 = n + m * 344;
/* 159 */           MainMemory.setI32(n + m * 344, paramInt3);
/* 160 */           MainMemory.setI32(n + m * 344 + 8, 2);
/* 161 */           MainMemory.setI32(n + m * 344 + 12, paramInt2);
/* 162 */           MainMemory.setI32(n + m * 344 + 12 + 4, paramInt4);
/* 163 */           MainMemory.setI32(n + m * 344 + 52, paramInt1);
/* 164 */           i2 = MainMemory.getI32Aligned(470792);
/* 165 */           if (MainMemory.getI32(i2 + paramInt2 * 344) != 64536) {
/*     */             break label437;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 175 */           if (MainMemory.getI32(i2 + paramInt4 * 344) == 64536) {
/* 176 */             paramInt1 = 1;
/*     */           } else {
/*     */             label437:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 186 */             paramInt1 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */           i4 = MainMemory.getI32(i2 + paramInt2 * 344 + 52);
/* 194 */           i5 = MainMemory.getI32(i2 + paramInt2 * 344 + 56);
/* 195 */           i3 = i5 == 1 ? 1 : 0;
/* 196 */           if ((com.emt.proteus.lib.api.MathUtils.ult(i4 + 65275, 2)) || (i3 == 0))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */             i6 = MainMemory.getI32(i2 + paramInt4 * 344 + 56);
/* 207 */             if (i6 != 1)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */               if ((i4 != MainMemory.getI32(i2 + paramInt4 * 344 + 52)) || (i5 != i6)) {
/*     */                 break label1265;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */               i4 = MainMemory.getI32(i2 + paramInt2 * 344 + 56 + 4);
/* 228 */               if (i4 != MainMemory.getI32(i2 + paramInt4 * 344 + 56 + 4)) {
/*     */                 break label1265;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 238 */               if (i4 <= 0) {
/*     */                 break label779;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 248 */               i4 = i4 > 1 ? i4 : 1;
/* 249 */               i5 = 0;
/* 250 */               i6 = 1;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 258 */                 i6 = MainMemory.getI32(i2 + paramInt2 * 344 + 56 + 8 + (i5 << 2)) == MainMemory.getI32(i2 + paramInt4 * 344 + 56 + 8 + (i5 << 2)) ? i6 : 0;
/* 259 */                 i5 += 1;
/* 260 */                 if (i5 == i4) {
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
/*     */ 
/* 272 */               if (i6 == 0) {
/*     */                 break label1265;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label779:
/*     */           
/*     */ 
/* 282 */           paramInt2 = i3 != 0 ? paramInt4 : paramInt2;
/* 283 */           i7 = n + m * 344 + 56;
/* 284 */           MainMemory.setI32(i7, MainMemory.getI32(i2 + paramInt2 * 344 + 56));
/* 285 */           i8 = i2 + paramInt2 * 344 + 56 + 4;
/* 286 */           i9 = n + m * 344 + 56 + 4;
/* 287 */           MainMemory.setI32(i9, MainMemory.getI32(i8));
/* 288 */           if (MainMemory.getI32(i8) > 0) {
/* 289 */             paramInt4 = 0;
/*     */           } else {
/*     */             break label953;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 300 */             MainMemory.setI32(n + m * 344 + 56 + 8 + (paramInt4 << 2), MainMemory.getI32(i2 + paramInt2 * 344 + 56 + 8 + (paramInt4 << 2)));
/* 301 */             paramInt4 += 1;
/* 302 */           } while (MainMemory.getI32(i8) > paramInt4);
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label953:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 313 */           if (paramInt3 != 288) {
/*     */             break label992;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */           F306033_139.call(i7, m, i9, n, i2, paramInt2);
/*     */           
/*     */ 
/*     */           label992:
/*     */           
/*     */ 
/* 329 */           switch (MainMemory.getI32(i2 + paramInt2 * 344 + 52)) {
/*     */           case 258: 
/*     */             break label1192;
/*     */             break;
/*     */           case 259: 
/*     */             break label1165;
/*     */             break;
/*     */           case 260: 
/*     */             break label1138;
/*     */             break;
/*     */           case 261: 
/*     */             break label1111;
/*     */             break;
/*     */           case 262:  break; }
/* 343 */           MainMemory.setI32(n + m * 344 + 4, 3187);
/*     */           
/*     */           break label1214;
/*     */           
/*     */           label1111:
/* 348 */           MainMemory.setI32(n + m * 344 + 4, 3186);
/*     */           
/*     */           break label1214;
/*     */           
/*     */           label1138:
/* 353 */           MainMemory.setI32(n + m * 344 + 4, 3195);
/*     */           
/*     */           break label1214;
/*     */           
/*     */           label1165:
/* 358 */           MainMemory.setI32(n + m * 344 + 4, 3194);
/*     */           
/*     */           break label1214;
/*     */           
/*     */           label1192:
/* 363 */           MainMemory.setI32(n + m * 344 + 4, 3184);
/*     */           
/*     */ 
/*     */           label1214:
/*     */           
/*     */ 
/* 369 */           if (paramInt1 == 0) {
/* 370 */             paramInt1 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 380 */             SystemLibrary.do_indirect(MainMemory.getI32(n + m * 344 + 4), i1);
/* 381 */             i = m;
/*     */             
/*     */ 
/*     */             break label1378;
/*     */             
/*     */             label1265:
/*     */             
/* 388 */             paramInt1 = MainMemory.getI32Aligned(470796);
/* 389 */             if (paramInt1 != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 399 */               MainMemory.setI32Aligned(470796, paramInt1 + -1);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 405 */             if (MainMemory.getI32Aligned(470852) != 0) {
/*     */               break label1332;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 415 */             MainMemory.setI32Aligned(470852, 431);
/*     */             
/*     */ 
/*     */             label1332:
/*     */             
/*     */ 
/* 421 */             SystemLibrary.strncpy(j, 114528, 80);
/* 422 */             MainMemory.setI8(j + 79, (byte)0);
/* 423 */             ffxmsg.call(5, j);
/* 424 */             i = -1;
/*     */             
/*     */ 
/*     */             break label1378;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 432 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label1378:
/*     */       
/*     */ 
/* 438 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 443 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F306033.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */