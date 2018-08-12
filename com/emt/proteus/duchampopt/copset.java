/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class copset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2866;
/*  12 */   public static final Function _instance = new copset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public copset() { super("copset", 1, false); }
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
/*  58 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  68 */         MainMemory.setI32(paramInt, 501);
/*  69 */         MainMemory.setI32(paramInt + 4, 5263171);
/*  70 */         d1 = MainMemory.getF64(paramInt + 24);
/*  71 */         if (MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*  72 */           n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  82 */           i1 = paramInt + 32;
/*  83 */           d3 = MainMemory.getF64(i1);
/*  84 */           if (!MathUtils.f_oeq(d3, 9.87654321E107D))
/*     */           {
/*     */ 
/*     */ 
/*  88 */             d2 = d3;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  95 */             MainMemory.setF64(i1, 0.0D);
/*  96 */             d2 = 0.0D;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */           i1 = paramInt + 8;
/* 104 */           d3 = MainMemory.getF64(i1);
/* 105 */           if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */             break label232;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           MainMemory.setF64(i1, 57.29577951308232D);
/* 117 */           d3 = 57.29577951308232D;
/*     */           
/*     */ 
/*     */ 
/*     */           label232:
/*     */           
/*     */ 
/* 124 */           SystemLibrary.memcpy(paramInt + 276, 59680, 18, 1);
/* 125 */           MainMemory.setI32(paramInt + 316, 5);
/* 126 */           MainMemory.setI32(paramInt + 320, 102);
/* 127 */           MainMemory.setI32(paramInt + 324, 0);
/* 128 */           MainMemory.setI32(paramInt + 328, 0);
/* 129 */           MainMemory.setI32(paramInt + 332, 0);
/* 130 */           MainMemory.setI32(paramInt + 336, 0);
/* 131 */           MainMemory.setI32(paramInt + 340, 1);
/* 132 */           if (!MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D)) {
/*     */             break label493;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */           d4 = d1 / 90.0D;
/* 143 */           d4 += -0.5D;
/* 144 */           n = (int)SystemLibrary.floor(d4);
/* 145 */           switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */           case 0: 
/*     */             break label465;
/*     */             break;
/*     */           case 1:  break; case 2:  d4 = -1.0D;
/*     */             
/*     */ 
/*     */             break label473;
/*     */             
/*     */             break;
/*     */           case 3: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/* 160 */           MainMemory.setF64(paramInt + 360, 0.0D);
/* 161 */           i = 2;
/*     */           
/*     */ 
/*     */           break label1236;
/*     */           
/*     */           label465:
/*     */           
/* 168 */           d4 = 1.0D;
/*     */           
/*     */ 
/*     */ 
/*     */           label473:
/*     */           
/*     */ 
/* 175 */           MainMemory.setF64(paramInt + 360, d4);
/*     */           
/*     */           break label548;
/*     */           
/*     */           label493:
/*     */           
/* 181 */           d4 = d1 * 3.141592653589793D;
/* 182 */           d4 /= 180.0D;
/* 183 */           d4 = SystemLibrary.sin(d4);
/* 184 */           MainMemory.setF64(paramInt + 360, d4);
/* 185 */           if (MathUtils.f_oeq(d4, 0.0D)) {
/* 186 */             n = 2;
/*     */           }
/*     */           else
/*     */           {
/*     */             label548:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */             d4 = 1.0D / d4;
/* 199 */             MainMemory.setF64(paramInt + 368, d4);
/* 200 */             if (!MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */               break label734;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */             d4 = d2 / 90.0D;
/* 211 */             d4 += 0.5D;
/* 212 */             n = (int)SystemLibrary.floor(d4);
/* 213 */             switch ((n > -1 ? n : 0 - n) & 0x3) {
/*     */             case 0:  break label721;
/*     */               break; case 1:  d2 = 0.0D;
/*     */               break label762;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d2 = 0.0D;
/*     */               
/*     */ 
/*     */               break label762;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 228 */             d2 = -1.0D;
/*     */             
/*     */             break label762;
/*     */             
/*     */             label721:
/* 233 */             d2 = 1.0D;
/*     */             
/*     */             break label762;
/*     */             
/*     */             label734:
/* 238 */             d2 *= 3.141592653589793D;
/* 239 */             d2 /= 180.0D;
/* 240 */             d2 = SystemLibrary.cos(d2);
/*     */             
/*     */ 
/*     */ 
/*     */             label762:
/*     */             
/*     */ 
/*     */ 
/* 248 */             d3 *= d2;
/* 249 */             MainMemory.setF64(paramInt + 384, d3);
/* 250 */             if (MathUtils.f_oeq(d3, 0.0D)) {
/* 251 */               n = 2;
/*     */             } else {
/*     */               break label817;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 262 */       i = n;
/*     */       
/*     */ 
/*     */       break label1236;
/*     */       
/*     */       label817:
/*     */       
/* 269 */       d2 = 1.0D / d3;
/* 270 */       MainMemory.setF64(paramInt + 392, d2);
/* 271 */       d2 = SystemLibrary.fmod(d1, 360.0D);
/* 272 */       if (MathUtils.f_oeq(d2, 0.0D)) {
/* 273 */         d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 283 */       else if (MathUtils.f_oeq(SystemLibrary.fabs(d2), 180.0D)) {
/* 284 */         d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 294 */       else if ((MathUtils.f_oeq(d2, 45.0D)) || (MathUtils.f_oeq(d2, 225.0D))) {
/* 295 */         d2 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 305 */       else if ((MathUtils.f_oeq(d2, -135.0D)) || (MathUtils.f_oeq(d2, -315.0D))) {
/* 306 */         d2 = -1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 316 */         d2 = d1 * 3.141592653589793D;
/* 317 */         d2 /= 180.0D;
/* 318 */         d2 = SystemLibrary.tan(d2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 326 */       d2 = 1.0D / d2;
/* 327 */       MainMemory.setF64(paramInt + 400, d2);
/* 328 */       d3 *= d2;
/* 329 */       MainMemory.setF64(paramInt + 376, d3);
/* 330 */       MainMemory.setI32(paramInt + 448, 2867);
/* 331 */       MainMemory.setI32(paramInt + 452, 2868);
/* 332 */       i1 = paramInt + 344;
/* 333 */       MainMemory.setF64(i1, 0.0D);
/* 334 */       i2 = paramInt + 352;
/* 335 */       MainMemory.setF64(i2, 0.0D);
/* 336 */       i3 = paramInt + 256;
/* 337 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 347 */         i4 = paramInt + 264;
/* 348 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label1166;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */       MainMemory.setF64(i3, 0.0D);
/* 359 */       MainMemory.setF64(paramInt + 264, d1);
/* 360 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1236;
/*     */       
/*     */       label1166:
/*     */       
/* 367 */       if (cops2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label1229;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 377 */       MainMemory.setF64(i1, MainMemory.getF64(k));
/* 378 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 379 */       i = 0;
/*     */       
/*     */ 
/*     */       break label1236;
/*     */       
/*     */       label1229:
/*     */       
/* 386 */       i = 2;
/*     */       
/*     */ 
/*     */       label1236:
/*     */       
/*     */ 
/* 392 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 397 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/copset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */