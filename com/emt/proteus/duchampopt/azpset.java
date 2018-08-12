/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class azpset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2863;
/*  12 */   public static final Function _instance = new azpset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public azpset() { super("azpset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     double d1 = 0.0D;
/*  40 */     double d2 = 0.0D;
/*  41 */     double d3 = 0.0D;
/*  42 */     double d4 = 0.0D;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*     */     
/*     */ 
/*  50 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  54 */       j = MainMemory.alloc(4);
/*  55 */       k = MainMemory.alloc(8);
/*  56 */       m = MainMemory.alloc(8);
/*  57 */       if (paramInt == 0) {
/*  58 */         i1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  68 */         MainMemory.setI32(paramInt, 101);
/*  69 */         MainMemory.setI32(paramInt + 4, 5265985);
/*  70 */         n = paramInt + 24;
/*  71 */         d1 = MainMemory.getF64(n);
/*  72 */         if (!MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*     */           break label141;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         MainMemory.setF64(n, 0.0D);
/*  84 */         d1 = 0.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label141:
/*     */         
/*     */ 
/*  91 */         n = paramInt + 32;
/*  92 */         d2 = MainMemory.getF64(n);
/*  93 */         if (!MathUtils.f_oeq(d2, 9.87654321E107D)) {
/*     */           break label192;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         MainMemory.setF64(n, 0.0D);
/* 105 */         d2 = 0.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label192:
/*     */         
/*     */ 
/* 112 */         n = paramInt + 8;
/* 113 */         d4 = MainMemory.getF64(n);
/* 114 */         if (!MathUtils.f_oeq(d4, 0.0D)) {
/*     */           break label245;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         MainMemory.setF64(n, 57.29577951308232D);
/* 126 */         d4 = 57.29577951308232D;
/*     */         
/*     */ 
/*     */ 
/*     */         label245:
/*     */         
/*     */ 
/* 133 */         SystemLibrary.memcpy(paramInt + 276, 77376, 31, 1);
/* 134 */         MainMemory.setI32(paramInt + 316, 1);
/* 135 */         MainMemory.setI32(paramInt + 320, 102);
/* 136 */         MainMemory.setI32(paramInt + 324, MathUtils.f_oeq(d2, 0.0D) ? 1 : 0);
/* 137 */         MainMemory.setI32(paramInt + 328, 0);
/* 138 */         MainMemory.setI32(paramInt + 332, 0);
/* 139 */         MainMemory.setI32(paramInt + 336, 0);
/* 140 */         MainMemory.setI32(paramInt + 340, MathUtils.f_ole(d1, 1.0D) ? 1 : 0);
/* 141 */         d3 = d1 + 1.0D;
/* 142 */         d4 *= d3;
/* 143 */         MainMemory.setF64(paramInt + 360, d4);
/* 144 */         if (MathUtils.f_oeq(d4, 0.0D)) {
/* 145 */           i1 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 155 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */             break label581;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */           d4 = d2 / 90.0D;
/* 166 */           d4 += 0.5D;
/* 167 */           i1 = (int)SystemLibrary.floor(d4);
/* 168 */           switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */           case 0: 
/*     */             break label549;
/*     */             break;
/*     */           case 1:  break; case 2:  d4 = -1.0D;
/*     */             
/*     */ 
/*     */             break label557;
/*     */             
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 183 */           MainMemory.setF64(paramInt + 384, 0.0D);
/* 184 */           i = 2;
/*     */           
/*     */ 
/*     */           break label1401;
/*     */           
/*     */           label549:
/*     */           
/* 191 */           d4 = 1.0D;
/*     */           
/*     */ 
/*     */ 
/*     */           label557:
/*     */           
/*     */ 
/* 198 */           n = paramInt + 384;
/* 199 */           MainMemory.setF64(n, d4);
/*     */           
/*     */ 
/*     */           break label656;
/*     */           
/*     */           label581:
/*     */           
/* 206 */           d4 = d2 * 3.141592653589793D;
/* 207 */           d4 /= 180.0D;
/* 208 */           d4 = SystemLibrary.cos(d4);
/* 209 */           n = paramInt + 384;
/* 210 */           MainMemory.setF64(n, d4);
/* 211 */           if (MathUtils.f_oeq(d4, 0.0D)) {
/* 212 */             i1 = 2;
/*     */           } else {
/*     */             break label656;
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
/* 225 */       i = i1;
/*     */       
/*     */ 
/*     */       break label1401;
/*     */       
/*     */ 
/*     */       label656:
/*     */       
/*     */ 
/* 234 */       d4 = 1.0D / d4;
/* 235 */       MainMemory.setF64(paramInt + 376, d4);
/* 236 */       if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */         break label842;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */       d4 = d2 / 90.0D;
/* 247 */       d4 += -0.5D;
/* 248 */       i1 = (int)SystemLibrary.floor(d4);
/* 249 */       switch ((i1 > -1 ? i1 : 0 - i1) & 0x3) {
/*     */       case 0:  break label829;
/*     */         break; case 1:  d4 = 0.0D;
/*     */         break label874;
/*     */         break;
/*     */       case 2: 
/*     */         break; case 3:  d4 = 0.0D;
/*     */         
/*     */ 
/*     */         break label874;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 264 */       d4 = -1.0D;
/*     */       
/*     */       break label874;
/*     */       
/*     */       label829:
/* 269 */       d4 = 1.0D;
/*     */       
/*     */       break label874;
/*     */       
/*     */       label842:
/* 274 */       d2 *= 3.141592653589793D;
/* 275 */       d2 /= 180.0D;
/* 276 */       d2 = SystemLibrary.sin(d2);
/* 277 */       d4 = d2;
/*     */       
/*     */ 
/*     */ 
/*     */       label874:
/*     */       
/*     */ 
/* 284 */       MainMemory.setF64(paramInt + 392, d4);
/* 285 */       d2 = MainMemory.getF64(n);
/* 286 */       d4 /= d2;
/* 287 */       MainMemory.setF64(paramInt + 368, d4);
/* 288 */       if (!MathUtils.f_ogt(SystemLibrary.fabs(d1), 1.0D)) {
/*     */         break label1131;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */       d2 = -1.0D / d1;
/* 299 */       if (!MathUtils.f_ugt(d2, -1.0D)) {
/*     */         break label1048;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 309 */       if (MathUtils.f_oeq(d2, 0.0D)) {
/* 310 */         d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 320 */         if (!MathUtils.f_ult(d2, 1.0D))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 330 */           d4 = d2 + -1.0D;
/* 331 */           if (MathUtils.f_olt(d4, 1.0E-10D)) {
/* 332 */             d2 = 90.0D;
/*     */             
/*     */             break label1104;
/*     */           }
/*     */           else
/*     */           {
/*     */             break label1080;
/*     */           }
/*     */           label1048:
/* 341 */           d4 = d2 + 1.0D;
/* 342 */           if (MathUtils.f_ogt(d4, -1.0E-10D)) {
/* 343 */             d2 = -90.0D;
/*     */             
/*     */ 
/*     */             break label1104;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label1080:
/*     */         
/* 353 */         d2 = SystemLibrary.asin(d2) * 180.0D;
/* 354 */         d2 /= 3.141592653589793D;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1104:
/*     */       
/*     */ 
/* 362 */       MainMemory.setF64(paramInt + 400, d2);
/* 363 */       d2 = MainMemory.getF64(n);
/*     */       
/*     */       break label1147;
/*     */       
/*     */       label1131:
/*     */       
/* 369 */       MainMemory.setF64(paramInt + 400, -90.0D);
/*     */       
/*     */ 
/*     */ 
/*     */       label1147:
/*     */       
/*     */ 
/*     */ 
/* 377 */       d1 *= d2;
/* 378 */       MainMemory.setF64(paramInt + 408, d1);
/* 379 */       MainMemory.setF64(paramInt + 416, MathUtils.f_olt(SystemLibrary.fabs(d1), 1.0D) ? 1.0D : 0.0D);
/* 380 */       MainMemory.setI32(paramInt + 448, 2864);
/* 381 */       MainMemory.setI32(paramInt + 452, 2865);
/* 382 */       n = paramInt + 344;
/* 383 */       MainMemory.setF64(n, 0.0D);
/* 384 */       i2 = paramInt + 352;
/* 385 */       MainMemory.setF64(i2, 0.0D);
/* 386 */       i3 = paramInt + 256;
/* 387 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 397 */         i4 = paramInt + 264;
/* 398 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label1331;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */       MainMemory.setF64(i3, 0.0D);
/* 409 */       MainMemory.setF64(paramInt + 264, 90.0D);
/* 410 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1401;
/*     */       
/*     */       label1331:
/*     */       
/* 417 */       if (azps2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label1394;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 427 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 428 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 429 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1401;
/*     */       
/*     */       label1394:
/*     */       
/* 436 */       i = 2;
/*     */       
/*     */ 
/*     */       label1401:
/*     */       
/*     */ 
/* 442 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 447 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/azpset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */