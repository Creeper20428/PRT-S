/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class pl_l2pi extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3646;
/*  11 */   public static final Function _instance = new pl_l2pi();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public pl_l2pi() { super("pl_l2pi", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     short s = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*  59 */     int i14 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       m = MainMemory.getI16(paramInt1 + 4);
/*  66 */       if (m >= 1) {
/*     */         break label125;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */       i = (MainMemory.getI16(paramInt1 + 8) << 15) + MainMemory.getI16(paramInt1 + 6);
/*  77 */       j = MainMemory.getI16(paramInt1 + 2) + 1;
/*     */       
/*     */ 
/*     */       break label136;
/*     */       
/*     */       label125:
/*     */       
/*  84 */       i = m;
/*     */       
/*  86 */       j = 4;
/*     */       
/*     */ 
/*     */ 
/*     */       label136:
/*     */       
/*     */ 
/*     */ 
/*  94 */       if ((paramInt3 <= 0) || (i <= 0)) {
/*     */         break label1132;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       k = j + -1;
/* 105 */       i8 = 0;
/* 106 */       i9 = 1;
/* 107 */       i10 = 1;
/* 108 */       i11 = 1;
/* 109 */       i12 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 120 */         i13 = paramInt1 + (k + i8 << 1);
/* 121 */         n = j + i8;
/* 122 */         i14 = paramInt1 + (n << 1);
/* 123 */         if (n > i) {
/* 124 */           j = i10;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 134 */           if (i12 != 0)
/*     */           {
/*     */ 
/*     */ 
/* 138 */             i12 = i9;
/*     */             
/*     */ 
/* 141 */             n = 0;
/*     */             
/*     */ 
/*     */             break label1108;
/*     */           }
/*     */           
/*     */ 
/* 148 */           m = MainMemory.getI16(i13);
/* 149 */           s = (short)(m / 4096);
/* 150 */           n = m & 0xFFFF & 0xFFF;
/* 151 */           if (MathUtils.ugt(s, (short)7)) {
/* 152 */             n = i9;
/*     */             
/*     */ 
/* 155 */             i9 = i12;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 165 */             switch (s) {
/*     */             case 0: 
/*     */               break label619;
/*     */               break;
/*     */             case 1:  break label585;
/*     */               break; case 2:  break label560;
/*     */               break; case 3:  break label535;
/*     */               break; case 4:  break label619;
/*     */               break; case 5:  break label619;
/*     */               break; case 6:  break label453;
/*     */               break; case 7:  break; default:  n = i9;
/*     */               
/*     */ 
/* 178 */               i9 = i12;
/* 179 */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 186 */             i11 -= n;
/*     */             
/*     */             break label465;
/*     */             
/*     */             label453:
/*     */             
/* 192 */             i11 = n + i11;
/*     */             
/*     */ 
/*     */ 
/*     */             label465:
/*     */             
/*     */ 
/*     */ 
/* 200 */             if ((i9 < 1) || (i9 <= paramInt3))
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
/* 211 */               MainMemory.setI32(paramInt2 + (i10 + -1 << 2), i11);
/* 212 */               i10 += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */             i9 += 1;
/* 221 */             n = i9;
/*     */             
/*     */ 
/* 224 */             i9 = i12;
/*     */             
/*     */             break label993;
/*     */             
/*     */             label535:
/* 229 */             i11 -= n;
/* 230 */             n = i9;
/*     */             
/*     */ 
/* 233 */             i9 = i12;
/*     */             
/*     */             break label993;
/*     */             
/*     */             label560:
/* 238 */             i11 = n + i11;
/* 239 */             n = i9;
/*     */             
/*     */ 
/* 242 */             i9 = i12;
/*     */             
/*     */             break label993;
/*     */             
/*     */             label585:
/* 247 */             i12 = MainMemory.getI16(i14) << 12 | n;
/* 248 */             n = i9;
/*     */             
/* 250 */             i11 = i12;
/* 251 */             i9 = 1;
/*     */             
/*     */             break label993;
/*     */             
/*     */             label619:
/* 256 */             n += i9;
/* 257 */             i1 = n + -1;
/* 258 */             i2 = i1 >= paramInt3 ? paramInt3 : i1;
/* 259 */             i9 = i2 - (i9 > 1 ? i9 : 1) + 1;
/* 260 */             if (i9 < 1)
/*     */             {
/*     */ 
/*     */ 
/* 264 */               i9 = i12;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 274 */               i9 += i10;
/* 275 */               i3 = i9 + -1;
/* 276 */               i4 = i10 > i3 ? 1 : 0;
/* 277 */               if (!MathUtils.ugt((short)(m + 49152), (short)4095)) {
/*     */                 break label895;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */               if (i4 == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */                 i5 = i10 + -1;
/* 298 */                 i10 += 1;
/* 299 */                 i6 = 0;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */                 for (;;)
/*     */                 {
/* 306 */                   MainMemory.setI32(paramInt2 + (i5 + i6 << 2), 0);
/* 307 */                   i7 = i6 + 1;
/* 308 */                   if (i10 + i6 > i3) {
/*     */                     break;
/*     */                   }
/*     */                   
/* 312 */                   i6 = i7;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 319 */               if ((MathUtils.ugt((short)(m + 45056), (short)4095)) || (i2 != i1))
/*     */               {
/* 321 */                 i10 = i9;
/*     */                 
/* 323 */                 i9 = i12;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 333 */                 MainMemory.setI32(paramInt2 + (i9 + -2 << 2), i11);
/*     */                 
/* 335 */                 i10 = i9;
/*     */                 
/* 337 */                 i9 = i12;
/*     */                 
/*     */                 break label993;
/*     */                 
/*     */                 label895:
/* 342 */                 if (i4 != 0)
/*     */                 {
/* 344 */                   i10 = i9;
/*     */                   
/* 346 */                   i9 = i12;
/*     */ 
/*     */ 
/*     */ 
/*     */                 }
/*     */                 else
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/* 356 */                   i1 = i10 + -1;
/* 357 */                   i10 += 1;
/* 358 */                   i2 = 0;
/*     */                   
/*     */ 
/*     */ 
/*     */ 
/*     */                   for (;;)
/*     */                   {
/* 365 */                     MainMemory.setI32(paramInt2 + (i1 + i2 << 2), i11);
/* 366 */                     i5 = i2 + 1;
/* 367 */                     if (i10 + i2 > i3)
/*     */                     {
/* 369 */                       i10 = i9;
/*     */                       
/* 371 */                       i9 = i12; break;
/*     */                     }
/*     */                     
/*     */ 
/* 375 */                     i2 = i5;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */           label993:
/*     */           
/*     */ 
/* 386 */           if (n > paramInt3) {
/* 387 */             j = i10;
/*     */           }
/*     */           else
/*     */           {
/* 391 */             i12 = n;
/*     */             
/*     */ 
/* 394 */             n = i9;
/*     */             
/*     */ 
/*     */             break label1108;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/* 402 */         if (j > paramInt3) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */         i = j + -1;
/* 413 */         j += 1;
/* 414 */         k = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 421 */           MainMemory.setI32(paramInt2 + (i + k << 2), 0);
/* 422 */           i8 = k + 1;
/* 423 */           if (j + k > paramInt3) { break label1132;
/* 424 */             break;
/*     */           }
/* 426 */           k = i8;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label1108:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 437 */         i8 += 1;
/*     */         
/* 439 */         i9 = i12;
/*     */         
/*     */ 
/* 442 */         i12 = n;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label1132:
/*     */       
/*     */ 
/*     */ 
/* 452 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/pl_l2pi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */