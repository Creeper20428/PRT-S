/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class cylfix
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2925;
/*  16 */   public static final Function _instance = new cylfix();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public cylfix() { super("cylfix", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  23 */     return call(paramInt1, paramInt2);
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
/*  34 */     int k = call(i, j);
/*  35 */     paramFrame.setI32(paramInt1, k);
/*  36 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*  43 */     int j = 0;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     int n = 0;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*  55 */     int i9 = 0;
/*  56 */     short s1 = 0;
/*  57 */     int i10 = 0;
/*  58 */     int i11 = 0;
/*  59 */     int i12 = 0;
/*  60 */     int i13 = 0;
/*  61 */     int i14 = 0;
/*  62 */     int i15 = 0;
/*  63 */     int i16 = 0;
/*  64 */     short s2 = 0;
/*  65 */     int i17 = 0;
/*  66 */     int i18 = 0;
/*  67 */     int i19 = 0;
/*  68 */     double d1 = 0.0D;
/*  69 */     int i20 = 0;
/*  70 */     double d2 = 0.0D;
/*  71 */     double d3 = 0.0D;
/*  72 */     double d4 = 0.0D;
/*  73 */     int i22 = 0;
/*  74 */     int i23 = 0;
/*     */     
/*     */ 
/*  77 */     int i24 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  81 */       j = MainMemory.alloc(32);
/*  82 */       k = MainMemory.alloc(16);
/*  83 */       m = MainMemory.alloc(512);
/*  84 */       n = MainMemory.alloc(8);
/*  85 */       i1 = MainMemory.alloc(32);
/*  86 */       i2 = MainMemory.alloc(8);
/*  87 */       i3 = MainMemory.alloc(512);
/*  88 */       i4 = MainMemory.alloc(32);
/*  89 */       i5 = MainMemory.alloc(8);
/*  90 */       i6 = MainMemory.alloc(512);
/*  91 */       i7 = MainMemory.alloc(8);
/*  92 */       i8 = MainMemory.alloc(8);
/*  93 */       if (paramInt2 == 0) {
/*  94 */         i13 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 104 */         if (MainMemory.getI32(paramInt2) != 137)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           i13 = wcsset.call(paramInt2);
/* 115 */           if (i13 != 0) {
/*     */             break label1564;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         if (MainMemory.getI32(paramInt2 + 1188) != 2)
/*     */         {
/*     */ 
/*     */ 
/* 130 */           i13 = -1;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 137 */           i9 = paramInt2 + 4;
/* 138 */           i13 = MainMemory.getI32(i9);
/* 139 */           if (i13 < 2) {
/* 140 */             i13 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 150 */             s1 = (short)(1 << i13);
/* 151 */             i13 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 158 */               MainMemory.setI16(j + (i13 << 1), (short)(1 << i13));
/* 159 */               i13 += 1;
/* 160 */               if (i13 == 16) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */             i10 = i1 + 8;
/* 172 */             i11 = i1 + 16;
/* 173 */             i12 = i1 + 24;
/* 174 */             i13 = 0;
/* 175 */             i20 = 0;
/* 176 */             d3 = -1.0E99D;
/* 177 */             d4 = 1.0E99D;
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
/*     */ 
/*     */             for (;;)
/*     */             {
/* 196 */               if (!MathUtils.ult(i20, s1)) {
/*     */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */               i13 = i20 & 0xFFFF;
/* 207 */               i14 = MainMemory.getI32(i9);
/* 208 */               i15 = i14 > 0 ? 1 : 0;
/* 209 */               i16 = 0;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 216 */                 s2 = (short)(i13 + i16);
/* 217 */                 if (i15 != 0) {
/* 218 */                   i17 = 0;
/*     */                 } else {
/*     */                   break label602;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 229 */                   i18 = i3 + (i16 << 7) + (i17 << 3);
/* 230 */                   i19 = i17 + 1;
/* 231 */                   if (MathUtils.and(MainMemory.getI16(j + (i17 << 1)), s2) == 0) {
/* 232 */                     d1 = 0.5D;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 242 */                     d1 = MainMemory.getI32(paramInt1 + (i17 << 2));
/* 243 */                     d1 += 0.5D;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 251 */                   MainMemory.setF64(i18, d1);
/* 252 */                   if (i14 <= i19) break;
/* 253 */                   i17 = i19;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 label602:
/*     */                 
/*     */ 
/*     */ 
/* 263 */                 i16 += 1;
/* 264 */                 if (i16 == 4) {
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
/* 275 */               int i21 = (short)(i20 + 4);
/* 276 */               i13 = wcsp2s.call(paramInt2, 4, 16, i3, m, i1, i4, i6, k);
/* 277 */               if (i13 != 0) {}
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
/* 289 */               d1 = MainMemory.getF64(i1);
/* 290 */               d4 = MathUtils.f_olt(d1, d4) ? d1 : d4;
/* 291 */               d1 = MathUtils.f_ogt(d1, d3) ? d1 : d3;
/* 292 */               d2 = MainMemory.getF64(i10);
/* 293 */               d3 = MathUtils.f_olt(d2, d4) ? d2 : d4;
/* 294 */               d4 = MathUtils.f_ogt(d2, d1) ? d2 : d1;
/* 295 */               d2 = MainMemory.getF64(i11);
/* 296 */               d1 = MathUtils.f_olt(d2, d3) ? d2 : d3;
/* 297 */               d3 = MathUtils.f_ogt(d2, d4) ? d2 : d4;
/* 298 */               d4 = MainMemory.getF64(i12);
/* 299 */               d1 = MathUtils.f_olt(d4, d1) ? d4 : d1;
/* 300 */               if (!MathUtils.f_ogt(d4, d3))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 307 */                 d4 = d1;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/* 316 */                 d3 = d4;
/* 317 */                 d4 = d1;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/* 322 */             if (!MathUtils.f_ogt(d4, d3))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */               if ((!MathUtils.f_ult(d4, -180.0D)) && (!MathUtils.f_ugt(d3, 180.0D)))
/*     */               {
/*     */ 
/*     */ 
/* 337 */                 i13 = -1;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 344 */                 d3 = d4 + d3;
/* 345 */                 d3 *= 0.5D;
/* 346 */                 MainMemory.setF64(i2, d3);
/* 347 */                 MainMemory.setF64(i5, 0.0D);
/* 348 */                 i22 = paramInt2 + 872;
/* 349 */                 if (i22 != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 359 */                   if (MainMemory.getI32(paramInt2 + 872) != 0) {
/*     */                     break label1035;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 369 */                   if (prjset.call(i22) != 0)
/*     */                   {
/*     */ 
/*     */ 
/* 373 */                     i13 = 5;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     label1035:
/*     */                     
/*     */ 
/* 380 */                     i13 = SystemLibrary.do_indirect(MainMemory.getI32(paramInt2 + 1324), i22, 1, 1, 1, 1, i2, i5, i7, i8, k);
/* 381 */                     switch (i13) {
/*     */                     case 0: 
/*     */                       break;
/* 384 */                     case 2:  i13 = 5;
/*     */                       
/*     */ 
/*     */                       break label1564;
/*     */                       
/*     */                       break;
/*     */                     }
/*     */                     
/*     */                     
/* 393 */                     i13 = MainMemory.getI32(i9);
/* 394 */                     if (i13 <= 0) {
/*     */                       break label1199;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 404 */                     i13 = i13 > 1 ? i13 : 1;
/* 405 */                     i14 = 0;
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */                     for (;;)
/*     */                     {
/* 412 */                       MainMemory.setF64(m + (i14 << 3), 0.0D);
/* 413 */                       i14 += 1;
/* 414 */                       if (i14 == i13) {
/*     */                         break;
/*     */                       }
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */                     label1199:
/*     */                     
/*     */ 
/*     */ 
/* 425 */                     paramInt1 = paramInt2 + 744;
/* 426 */                     MainMemory.setF64(m + (MainMemory.getI32(paramInt1) << 3), MainMemory.getF64(i7));
/* 427 */                     i9 = paramInt2 + 748;
/* 428 */                     MainMemory.setF64(m + (MainMemory.getI32(i9) << 3), MainMemory.getF64(i8));
/* 429 */                     i13 = linx2p.call(paramInt2 + 760, m, i3);
/* 430 */                     if (i13 != 0) {
/*     */                       break label1564;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 441 */                     i13 = wcsp2s.call(paramInt2, 1, 0, i3, m, i1, i4, i6, k);
/* 442 */                     switch (i13)
/*     */                     {
/*     */                     case 0: 
/*     */                       break label1361;
/*     */                       
/*     */ 
/*     */                       break;
/*     */                     case 8: 
/*     */                       break;
/*     */                     }
/*     */                     
/*     */                     
/* 454 */                     i = 10;
/*     */                     
/*     */ 
/*     */                     break label1572;
/*     */                     
/*     */                     label1361:
/*     */                     
/* 461 */                     MainMemory.setF64(n, 90.0D);
/* 462 */                     sphs2x.call(paramInt2 + 1328, 0.0D, n, i1, i4);
/* 463 */                     i23 = paramInt2 + 8;
/* 464 */                     i13 = MainMemory.getI32(paramInt1);
/* 465 */                     MainMemory.setF64(MainMemory.getI32(i23) + (i13 << 3), MainMemory.getF64(i3 + (i13 << 3)));
/* 466 */                     i13 = MainMemory.getI32(i9);
/* 467 */                     MainMemory.setF64(MainMemory.getI32(i23) + (i13 << 3), MainMemory.getF64(i3 + (i13 << 3)));
/* 468 */                     i23 = paramInt2 + 20;
/* 469 */                     i13 = MainMemory.getI32(paramInt1);
/* 470 */                     MainMemory.setF64(MainMemory.getI32(i23) + (i13 << 3), MainMemory.getF64(i6 + (i13 << 3)));
/* 471 */                     i13 = MainMemory.getI32(i9);
/* 472 */                     MainMemory.setF64(MainMemory.getI32(i23) + (i13 << 3), MainMemory.getF64(i6 + (i13 << 3)));
/* 473 */                     d3 = MainMemory.getF64(i1) - MainMemory.getF64(i2);
/* 474 */                     MainMemory.setF64(paramInt2 + 32, d3);
/* 475 */                     i = wcsset.call(paramInt2);
/*     */                     
/*     */                     break label1572;
/*     */                   }
/*     */                 }
/*     */                 else
/*     */                 {
/* 482 */                   i = 9;
/*     */                   break label1572;
/*     */                 }
/*     */               } }
/*     */           }
/*     */         }
/*     */       }
/*     */       label1564:
/* 490 */       i = i13;
/*     */       
/*     */ 
/*     */       label1572:
/*     */       
/*     */ 
/* 496 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 501 */       MainMemory.dealloc_generated(i24);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cylfix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */