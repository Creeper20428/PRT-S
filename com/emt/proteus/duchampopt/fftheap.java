/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.calloc;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ 
/*     */ 
/*     */ public final class fftheap
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3272;
/*  17 */   public static final Function _instance = new fftheap();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public fftheap() { super("fftheap", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     call(i, j, k, m, n);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     int j = 0;
/*  54 */     int k = 0;
/*  55 */     int m = 0;
/*  56 */     int n = 0;
/*  57 */     int i1 = 0;
/*  58 */     int i2 = 0;
/*  59 */     boolean bool = false;
/*  60 */     int i3 = 0;
/*  61 */     int i4 = 0;
/*  62 */     int i5 = 0;
/*  63 */     int i6 = 0;
/*  64 */     int i7 = 0;
/*  65 */     long l1 = 0L;
/*  66 */     int i8 = 0;
/*  67 */     int i9 = 0;
/*  68 */     long l2 = 0L;
/*  69 */     int i10 = 0;
/*     */     
/*     */ 
/*  72 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  76 */       i = MainMemory.alloc(8);
/*  77 */       j = MainMemory.alloc(8);
/*  78 */       k = MainMemory.alloc(4);
/*  79 */       m = MainMemory.alloc(8);
/*  80 */       n = MainMemory.alloc(8);
/*  81 */       i1 = MainMemory.alloc(81);
/*  82 */       if (MainMemory.getI32(paramInt5) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         i6 = MainMemory.getI32(paramInt1);
/*  93 */         i2 = paramInt1 + 4;
/*  94 */         if (i6 != MainMemory.getI32(MainMemory.getI32(i2) + 64)) {
/*     */           break label185;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         if (ffrdef.call(paramInt1, paramInt5) > 0) {
/*     */           break label817;
/*     */         } else {
/*     */           break label202;
/*     */         }
/*     */         
/*     */ 
/*     */         label185:
/*     */         
/* 113 */         ffmahd.call(paramInt1, i6 + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label202:
/*     */         
/*     */ 
/* 119 */         bool = paramInt4 == 0;
/* 120 */         if (!bool)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */           MainMemory.setI32(paramInt4, 1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 136 */         i3 = paramInt2 == 0 ? 1 : 0;
/* 137 */         if (i3 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */           MainMemory.setI64(paramInt2, 0L);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 153 */         i4 = paramInt3 == 0 ? 1 : 0;
/* 154 */         if (i4 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 164 */           MainMemory.setI64(paramInt3, 0L);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 170 */         i5 = MainMemory.getI32(i2);
/* 171 */         if (MainMemory.getI32(i5 + 68) != 2) {
/*     */           break label817;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */         l1 = MainMemory.getI64(i5 + 956);
/* 182 */         if (l1 != 0L)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */           if (l1 <= 2147483647L) {
/*     */             break label415;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */           ffxmsg.call(5, 116896);
/* 203 */           MainMemory.setI32(paramInt5, 113);
/*     */           
/*     */ 
/*     */           break label822;
/*     */           
/*     */           label415:
/*     */           
/* 210 */           i6 = (int)l1;
/* 211 */           i7 = calloc.call(1, i6);
/* 212 */           if (i7 != 0) {
/*     */             break label479;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */           SystemLibrary.memcpy(i1, 97184, 43, 1);
/* 223 */           ffxmsg.call(5, i1);
/* 224 */           MainMemory.setI32(paramInt5, 113);
/*     */           
/*     */ 
/*     */           break label822;
/*     */           
/*     */           label479:
/*     */           
/* 231 */           l1 = i6;
/* 232 */           i9 = 1;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 239 */           while (MainMemory.getI32(MainMemory.getI32(i2) + 916) >= i9)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */             if (MainMemory.getI32(paramInt5) >= 1) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */             ffgtclll.call(paramInt1, i9, k, i, j, paramInt5);
/* 260 */             i8 = MainMemory.getI32(k);
/* 261 */             if (i8 <= 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */               fftheap_1426.call(paramInt1, i7, paramInt4, paramInt5, i2, n, i8, i9, m, l1, bool, k, i1);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 277 */             i9 += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 283 */           if (i6 > 0) {
/* 284 */             l1 = 0L;
/* 285 */             l2 = 0L;
/* 286 */             i9 = 0;
/*     */           }
/*     */           else
/*     */           {
/* 290 */             l2 = 0L;
/* 291 */             l1 = 0L;
/*     */             
/*     */ 
/*     */ 
/*     */             break label750;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 301 */             i10 = MainMemory.getI8(i7 + i9);
/* 302 */             if (i10 != 0) {
/*     */               break label702;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */             l2 += 1L;
/*     */             
/*     */ 
/*     */             break label724;
/*     */             
/*     */             label702:
/*     */             
/* 319 */             l1 = (i10 > 1 ? 1 : 0) + l1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label724:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 329 */             i9 += 1;
/* 330 */             if (i9 == i6) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label750:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 347 */           if (i3 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */             MainMemory.setI64(paramInt2, l2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 363 */           if (i4 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */             MainMemory.setI64(paramInt3, l1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 379 */           free.call(i7);
/*     */           
/*     */ 
/*     */ 
/*     */           break label822;
/*     */         }
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label817:
/*     */       
/*     */ 
/*     */ 
/*     */       label822:
/*     */       
/*     */ 
/* 396 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftheap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */