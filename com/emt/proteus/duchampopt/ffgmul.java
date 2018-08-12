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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgmul
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3436;
/*  23 */   public static final Function _instance = new ffgmul();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffgmul() { super("ffgmul", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = call(i, j);
/*  42 */     paramFrame.setI32(paramInt1, k);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*     */     
/*     */ 
/*  70 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  74 */       j = MainMemory.alloc(81);
/*  75 */       k = MainMemory.alloc(71);
/*  76 */       m = MainMemory.alloc(4);
/*  77 */       n = MainMemory.alloc(4);
/*  78 */       i1 = MainMemory.alloc(4);
/*  79 */       i2 = MainMemory.alloc(1025);
/*  80 */       i3 = MainMemory.alloc(1025);
/*  81 */       i4 = MainMemory.alloc(71);
/*  82 */       i5 = MainMemory.alloc(71);
/*  83 */       i6 = MainMemory.alloc(81);
/*  84 */       i7 = MainMemory.alloc(4);
/*  85 */       MainMemory.setI32(m, 0);
/*  86 */       MainMemory.setI32(n, 0);
/*  87 */       MainMemory.setI32(i1, 0);
/*  88 */       MainMemory.setI32(i7, 0);
/*  89 */       i10 = MainMemory.getI32(paramInt2);
/*  90 */       if (i10 != 0) {
/*     */         break label1183;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */       if (i10 <= 0)
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
/* 112 */         MainMemory.setI8(k, (byte)0);
/* 113 */         MainMemory.setI8(i6, (byte)0);
/* 114 */         if (ffgcrd.call(paramInt1, 45664, j, paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */           ffpsvc.call(j, k, i6, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 130 */         MainMemory.setI8(i4, (byte)0);
/* 131 */         ffc2s.call(k, i4, paramInt2);
/* 132 */         i10 = MainMemory.getI32(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       MainMemory.setI32(paramInt2, i10);
/* 141 */       if (i10 != 202) {
/*     */         break label316;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */       MainMemory.setI64(i4, 25141713350251088L);
/* 152 */       MainMemory.setI32(paramInt2, 0);
/*     */       
/*     */ 
/*     */       label316:
/*     */       
/*     */ 
/* 158 */       prepare_keyvalue.call(i4);
/* 159 */       i10 = MainMemory.getI32(paramInt2);
/* 160 */       if (i10 <= 0)
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
/* 171 */         MainMemory.setI8(k, (byte)0);
/* 172 */         MainMemory.setI8(i6, (byte)0);
/* 173 */         if (ffgcrd.call(paramInt1, 34656, j, paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           ffpsvc.call(j, k, i6, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 189 */         ffc2i.call(k, n, paramInt2);
/* 190 */         i10 = MainMemory.getI32(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */       MainMemory.setI32(paramInt2, i10);
/* 199 */       if (i10 != 202) {
/*     */         break label471;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */       MainMemory.setI32(n, 1);
/* 210 */       MainMemory.setI32(paramInt2, 0);
/* 211 */       MainMemory.setI8(k, (byte)0);
/* 212 */       i9 = k;
/* 213 */       i8 = i5;
/*     */       
/*     */ 
/*     */       label471:
/*     */       
/* 218 */       if (i10 > 0) {
/* 219 */         i9 = i5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 230 */         MainMemory.setI8(k, (byte)0);
/* 231 */         i9 = k;
/* 232 */         i8 = i5;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 240 */         MainMemory.setI8(i6, (byte)0);
/* 241 */         if (ffgcrd.call(paramInt1, 40928, j, paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */           ffpsvc.call(j, i9, i6, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 257 */         MainMemory.setI8(i8, (byte)0);
/* 258 */         ffc2s.call(i9, i8, paramInt2);
/* 259 */         i10 = MainMemory.getI32(paramInt2);
/* 260 */         i9 = i8;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */       MainMemory.setI32(paramInt2, i10);
/* 270 */       if (i10 != 202) {
/*     */         break label624;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 280 */       MainMemory.setI8(i9, (byte)0);
/* 281 */       MainMemory.setI32(paramInt2, 0);
/*     */       
/*     */ 
/*     */       label624:
/*     */       
/*     */ 
/* 287 */       prepare_keyvalue.call(i9);
/* 288 */       i10 = MainMemory.getI32(paramInt1) + 1;
/* 289 */       i11 = fits_get_url.call(paramInt1, i2, i3, 0, 0, 0, paramInt2);
/* 290 */       MainMemory.setI32(paramInt2, i11);
/* 291 */       if (i11 != 0)
/*     */       {
/*     */ 
/*     */ 
/* 295 */         i10 = i11;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 302 */         i14 = ffgmng.call(paramInt1, m, paramInt2);
/* 303 */         MainMemory.setI32(paramInt2, i14);
/* 304 */         i11 = MainMemory.getI32(m);
/* 305 */         i13 = i14;
/* 306 */         i14 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 314 */           if ((i14 > i11) || (i13 != 0))
/*     */           {
/*     */ 
/*     */ 
/* 318 */             i10 = i13;
/* 319 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 325 */           i13 = ffgtop.call(paramInt1, i14, i7, paramInt2);
/* 326 */           MainMemory.setI32(paramInt2, i13);
/* 327 */           if (i13 != 0) {
/*     */             break label1084;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */           i12 = MainMemory.getI32(i7);
/* 338 */           if (MainMemory.getI32(MainMemory.getI32(i12 + 4) + 72) != 1) {
/*     */             break label1048;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 348 */           MainMemory.setI32(i1, 0);
/* 349 */           if (MainMemory.getI8(i2) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 360 */             i13 = ffgmf.call(i12, i4, i9, MainMemory.getI32(n), i10, i2, i1, paramInt2);
/* 361 */             MainMemory.setI32(paramInt2, i13);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */           if (i13 != 342) {
/*     */             break label953;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 380 */           if (MainMemory.getI8(i3) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */             MainMemory.setI32(paramInt2, 0);
/* 392 */             i13 = ffgmf.call(MainMemory.getI32(i7), i4, i9, MainMemory.getI32(n), i10, i3, i1, paramInt2);
/* 393 */             MainMemory.setI32(paramInt2, i13);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label953:
/*     */           
/*     */ 
/* 401 */           if (i13 != 0) {
/*     */             break label1000;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */           i13 = ffdrow.call(MainMemory.getI32(i7), MainMemory.getI32(i1), 1L, paramInt2);
/* 413 */           MainMemory.setI32(paramInt2, i13);
/*     */           
/*     */ 
/*     */ 
/*     */           label1000:
/*     */           
/*     */ 
/*     */ 
/* 421 */           if (i13 != 342) {
/*     */             break label1032;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 431 */           ffxmsg.call(5, 119008);
/*     */           
/*     */ 
/*     */           label1032:
/*     */           
/*     */ 
/* 437 */           ffgmul_1053.call(paramInt2, i7);
/*     */           
/*     */           break label1120;
/*     */           
/*     */           label1048:
/* 442 */           SystemLibrary.sprintf(i6, 97312, new Object[] { Integer.valueOf(i14) });
/* 443 */           ffxmsg.call(5, i6);
/*     */           
/*     */           break label1120;
/*     */           
/*     */           label1084:
/* 448 */           MainMemory.setI32(paramInt2, 0);
/* 449 */           SystemLibrary.sprintf(i6, 95456, new Object[] { Integer.valueOf(i14) });
/* 450 */           ffxmsg.call(5, i6);
/*     */           
/*     */ 
/*     */           label1120:
/*     */           
/*     */ 
/* 456 */           i14 += 1;
/* 457 */           i13 = MainMemory.getI32(paramInt2);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 465 */       paramInt1 = MainMemory.getI32(i7);
/* 466 */       if (paramInt1 != 0)
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
/* 477 */         ffclos.call(paramInt1, paramInt2);
/* 478 */         i = MainMemory.getI32(paramInt2);
/*     */       }
/*     */       else
/*     */       {
/*     */         label1183:
/*     */         
/*     */ 
/*     */ 
/* 486 */         i = i10;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 492 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 497 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */