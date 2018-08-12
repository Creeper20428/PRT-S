/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class datfix extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2928;
/*  11 */   public static final com.emt.proteus.runtime.api.Function _instance = new datfix();
/*  12 */   public final com.emt.proteus.runtime.api.Function resolve() { return _instance; }
/*     */   
/*  14 */   public datfix() { super("datfix", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = call(i);
/*  27 */     paramFrame.setI32(paramInt1, j);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  33 */     int i = 0;
/*     */     
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*  40 */     int i2 = 0;
/*  41 */     int i3 = 0;
/*  42 */     int i4 = 0;
/*  43 */     int i5 = 0;
/*  44 */     int i6 = 0;
/*  45 */     int i7 = 0;
/*  46 */     int i8 = 0;
/*  47 */     int i9 = 0;
/*  48 */     int i10 = 0;
/*  49 */     int i11 = 0;
/*  50 */     double d1 = 0.0D;
/*  51 */     double d2 = 0.0D;
/*  52 */     double d3 = 0.0D;
/*  53 */     double d4 = 0.0D;
/*     */     
/*     */ 
/*  56 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       j = MainMemory.alloc(4);
/*  61 */       k = MainMemory.alloc(4);
/*  62 */       m = MainMemory.alloc(4);
/*  63 */       n = MainMemory.alloc(4);
/*  64 */       i1 = MainMemory.alloc(4);
/*  65 */       i2 = MainMemory.alloc(8);
/*  66 */       MainMemory.setI32(k, 0);
/*  67 */       MainMemory.setI32(m, 0);
/*  68 */       MainMemory.setF64(i2, 0.0D);
/*  69 */       if (paramInt == 0) {
/*  70 */         i7 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  80 */         i3 = paramInt + 200;
/*  81 */         if (MainMemory.getI8(i3) != 0) {
/*     */           break label646;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         i4 = paramInt + 288;
/*  92 */         d1 = MainMemory.getF64(i4);
/*  93 */         if (MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*  94 */           i7 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 104 */           i7 = (int)d1 + 2400001;
/* 105 */           i5 = (((i7 << 2) + 47618) / 146097 * 6 / 4 + 1) / 2 + i7 << 2;
/* 106 */           i7 = (i5 + 65151) % 1461 / 4 * 10 + 5;
/* 107 */           i5 = (i5 + 65388) / 1461 + 60824;
/* 108 */           MainMemory.setI32(i1, i5);
/* 109 */           i6 = (i7 / 306 + 2) % 12 + 1;
/* 110 */           MainMemory.setI32(n, i6);
/* 111 */           i7 = i7 % 306 / 10 + 1;
/* 112 */           MainMemory.setI32(j, i7);
/* 113 */           SystemLibrary.sprintf(i3, 55008, new Object[] { Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7) });
/* 114 */           d1 = MainMemory.getF64(i4);
/* 115 */           d2 = (int)d1;
/* 116 */           d1 -= d2;
/* 117 */           if (!MathUtils.f_ogt(d1, 0.0D))
/*     */           {
/*     */ 
/*     */ 
/* 121 */             i7 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 128 */             d1 *= 24.0D;
/* 129 */             i7 = (int)d1;
/* 130 */             d2 = i7;
/* 131 */             d1 -= d2;
/* 132 */             d1 *= 60.0D;
/* 133 */             i5 = (int)d1;
/* 134 */             d2 = i5;
/* 135 */             d1 -= d2;
/* 136 */             d1 *= 60.0D;
/* 137 */             MainMemory.setF64(i2, d1);
/* 138 */             d1 += 5.0E-4D;
/* 139 */             d1 *= 1000.0D;
/* 140 */             i5 = (i7 * 60 + i5) * 60000 + (int)d1;
/* 141 */             i7 = i5 / 3600000;
/* 142 */             MainMemory.setI32(k, i7);
/* 143 */             i6 = i5 - i7 * 3600000;
/* 144 */             i5 = i6 / 60000;
/* 145 */             MainMemory.setI32(m, i5);
/* 146 */             i6 -= i5 * 60000;
/* 147 */             SystemLibrary.sprintf(paramInt + 210, 56608, new Object[] { Integer.valueOf(i7), Integer.valueOf(i5), Integer.valueOf(i6 / 1000) });
/* 148 */             i7 = i6 % 1000;
/* 149 */             if (i7 == 0) {
/* 150 */               i7 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 160 */               SystemLibrary.sprintf(paramInt + 219, 25536, new Object[] { Integer.valueOf(i7) });
/* 161 */               i = 0;
/*     */               
/*     */ 
/*     */               break label1935;
/*     */               
/*     */               label646:
/*     */               
/* 168 */               if (MathUtils.ult(SystemLibrary.strlen(i3), 8)) {
/* 169 */                 i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 179 */                 i8 = paramInt + 204;
/* 180 */                 i9 = MainMemory.getI8(i8);
/* 181 */                 switch (i9)
/*     */                 {
/*     */                 case 45: 
/*     */                   break label756;
/*     */                   
/*     */                   break;
/*     */                 case 47: 
/*     */                   break;
/*     */                 }
/*     */                 
/*     */                 
/* 192 */                 i9 = MainMemory.getI8(paramInt + 207);
/*     */                 
/*     */                 break label1052;
/*     */                 
/*     */                 label756:
/*     */                 
/* 198 */                 i10 = MainMemory.getI8(paramInt + 207);
/* 199 */                 if (i10 != 45) {
/*     */                   break label1028;
/*     */                 }
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */                 if (SystemLibrary.sscanf(i3, 50976, new int[] { i1, n, j }) < 3) {
/* 210 */                   i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 220 */                   i3 = paramInt + 210;
/* 221 */                   switch (MainMemory.getI8(i3))
/*     */                   {
/*     */                   case 84: 
/*     */                     break label976;
/*     */                     
/*     */                     break;
/*     */                   case 32: 
/*     */                     break;
/*     */                   }
/*     */                   
/*     */                   
/* 232 */                   if (SystemLibrary.sscanf(paramInt + 211, 51008, new int[] { k, m, i2 }) != 3) {
/*     */                     break label949;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */                   MainMemory.setI8(i3, (byte)84);
/*     */                   
/*     */                   break label1682;
/*     */                   
/*     */                   label949:
/* 247 */                   MainMemory.setI32(k, 0);
/* 248 */                   MainMemory.setI32(m, 0);
/* 249 */                   MainMemory.setF64(i2, 0.0D);
/*     */                   
/*     */                   break label1682;
/*     */                   
/*     */                   label976:
/* 254 */                   if (SystemLibrary.sscanf(paramInt + 211, 51008, new int[] { k, m, i2 }) < 3) {
/* 255 */                     i7 = 5;
/*     */                     
/*     */                     break label1927;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     break label1682;
/*     */                   }
/*     */                   label1028:
/* 264 */                   if (i9 == 47) {
/* 265 */                     i9 = i10;
/*     */                   } else {
/*     */                     break label1336;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */                   label1052:
/*     */                   
/*     */ 
/*     */ 
/* 276 */                   i11 = paramInt + 207;
/* 277 */                   if (i9 != 47) {
/*     */                     break label1336;
/*     */                   }
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */                   if (SystemLibrary.sscanf(i3, 51040, new int[] { i1, n, j }) < 3) {
/* 288 */                     i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */                   }
/*     */                   else
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/* 298 */                     i3 = paramInt + 210;
/* 299 */                     switch (MainMemory.getI8(i3))
/*     */                     {
/*     */                     case 84: 
/*     */                       break label1268;
/*     */                       
/*     */                       break;
/*     */                     case 32: 
/*     */                       break;
/*     */                     }
/*     */                     
/*     */                     
/* 310 */                     if (SystemLibrary.sscanf(paramInt + 211, 51008, new int[] { k, m, i2 }) != 3) {
/*     */                       break label1241;
/*     */                     }
/*     */                     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */                     MainMemory.setI8(i3, (byte)84);
/*     */                     
/*     */                     break label1312;
/*     */                     
/*     */                     label1241:
/* 325 */                     MainMemory.setI32(k, 0);
/* 326 */                     MainMemory.setI32(m, 0);
/* 327 */                     MainMemory.setF64(i2, 0.0D);
/*     */                     
/*     */ 
/*     */                     label1268:
/*     */                     
/* 332 */                     if (SystemLibrary.sscanf(paramInt + 211, 51008, new int[] { k, m, i2 }) < 3) {
/* 333 */                       i7 = 5;
/*     */                     }
/*     */                     else
/*     */                     {
/*     */                       label1312:
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */                       MainMemory.setI8(i8, (byte)45);
/* 344 */                       MainMemory.setI8(i11, (byte)45);
/*     */                       
/*     */                       break label1682;
/*     */                       
/*     */                       label1336:
/* 349 */                       i9 = MainMemory.getI8(paramInt + 202);
/* 350 */                       switch (i9) {
/*     */                       case 47: 
/*     */                         break label1419;
/*     */                         break;
/*     */                       case 45:  break; default:  i7 = 5;
/* 355 */                         break;
/*     */                       }
/*     */                       
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/* 362 */                       i9 = MainMemory.getI8(paramInt + 205);
/*     */                       
/*     */                       break label1525;
/*     */                       
/*     */                       label1419:
/*     */                       
/* 368 */                       i10 = MainMemory.getI8(paramInt + 205);
/* 369 */                       if (i10 != 47) {
/*     */                         break label1498;
/*     */                       }
/*     */                       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 379 */                       if (SystemLibrary.sscanf(i3, 51072, new int[] { j, n, i1 }) < 3) {
/* 380 */                         i7 = 5;
/*     */                         
/*     */                         break label1927;
/*     */                       }
/*     */                       else
/*     */                       {
/*     */                         break label1589;
/*     */                       }
/*     */                       label1498:
/* 389 */                       if (i9 == 45) {
/* 390 */                         i9 = i10;
/*     */                       }
/*     */                       else
/*     */                       {
/* 394 */                         i7 = 5;
/*     */                         
/*     */ 
/*     */                         break label1927;
/*     */                       }
/*     */                       
/*     */                       label1525:
/*     */                       
/* 402 */                       if (i9 != 45)
/*     */                       {
/*     */ 
/*     */ 
/* 406 */                         i7 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                       }
/* 413 */                       else if (SystemLibrary.sscanf(i3, 51104, new int[] { j, n, i1 }) < 3) {
/* 414 */                         i7 = 5;
/*     */                       }
/*     */                       else
/*     */                       {
/*     */                         label1589:
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 424 */                         i7 = MainMemory.getI32(i1);
/* 425 */                         if (i7 >= 100) {
/*     */                           break label1636;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 436 */                         i7 += 1900;
/* 437 */                         MainMemory.setI32(i1, i7);
/*     */                         
/*     */ 
/*     */ 
/*     */                         label1636:
/*     */                         
/*     */ 
/*     */ 
/* 445 */                         SystemLibrary.sprintf(i3, 55008, new Object[] { Integer.valueOf(i7), Integer.valueOf(MainMemory.getI32(n)), Integer.valueOf(MainMemory.getI32(j)) });
/*     */                         
/*     */ 
/*     */                         label1682:
/*     */                         
/*     */ 
/* 451 */                         i7 = MainMemory.getI32(i1);
/* 452 */                         i5 = MainMemory.getI32(n);
/* 453 */                         i6 = 12 - i5;
/* 454 */                         d1 = ((i7 - i6 / 10) * 1461 + 6884232) / 4 + -2399904 + ((i5 + 9) % 12 * 306 + 5) / 10 + (i7 + 4900 + i6 / -10) / 100 * 3 / -4 + MainMemory.getI32(j);
/* 455 */                         d2 = MainMemory.getI32(k);
/* 456 */                         d3 = MainMemory.getI32(m);
/* 457 */                         d4 = MainMemory.getF64(i2) / 60.0D;
/* 458 */                         d3 += d4;
/* 459 */                         d3 /= 60.0D;
/* 460 */                         d2 += d3;
/* 461 */                         d2 /= 24.0D;
/* 462 */                         d1 += d2;
/* 463 */                         i2 = paramInt + 288;
/* 464 */                         d2 = MainMemory.getF64(i2);
/* 465 */                         if (!MathUtils.f_oeq(d2, 9.87654321E107D)) {
/*     */                           break label1890;
/*     */                         }
/*     */                         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 475 */                         MainMemory.setF64(i2, d1);
/* 476 */                         i = 0;
/*     */                         
/*     */ 
/*     */                         break label1935;
/*     */                         
/*     */                         label1890:
/*     */                         
/* 483 */                         d1 -= d2;
/* 484 */                         i = MathUtils.f_ogt(SystemLibrary.fabs(d1), 0.5D) ? 5 : 0;
/*     */                         break label1935;
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/*     */               } } } } }
/*     */       label1927:
/* 492 */       i = i7;
/*     */       
/*     */ 
/*     */       label1935:
/*     */       
/*     */ 
/* 498 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 503 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/datfix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */