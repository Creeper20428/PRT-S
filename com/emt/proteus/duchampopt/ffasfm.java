/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*     */ 
/*     */ public final class ffasfm extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3242;
/*  15 */   public static final Function _instance = new ffasfm();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffasfm() { super("ffasfm", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  22 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i1 = call(i, j, k, m, n);
/*  43 */     paramFrame.setI32(paramInt1, i1);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  49 */     int i = 0;
/*     */     
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
/*  63 */     float f = 0.0F;
/*  64 */     int i9 = 0;
/*  65 */     int i10 = 0;
/*     */     
/*     */ 
/*  68 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       j = MainMemory.alloc(4);
/*  73 */       k = MainMemory.alloc(4);
/*  74 */       m = MainMemory.alloc(4);
/*  75 */       n = MainMemory.alloc(71);
/*  76 */       i1 = MainMemory.alloc(81);
/*  77 */       i9 = MainMemory.getI32(paramInt5);
/*  78 */       if (i9 <= 0) {
/*     */         break label124;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */       i = i9;
/*     */       
/*     */ 
/*     */       break label1329;
/*     */       
/*     */       label124:
/*     */       
/*  95 */       i2 = paramInt2 == 0 ? 1 : 0;
/*  96 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */         MainMemory.setI32(paramInt2, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 112 */       i3 = paramInt3 == 0 ? 1 : 0;
/* 113 */       if (i3 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         MainMemory.setI32(paramInt3, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 129 */       i4 = paramInt4 == 0 ? 1 : 0;
/* 130 */       if (i4 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         MainMemory.setI32(paramInt4, 0);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 146 */       if (MainMemory.getI8(paramInt1) == 32) {
/* 147 */         i9 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 151 */         i9 = 0;
/*     */         
/*     */ 
/*     */         break label288;
/*     */       }
/*     */       
/*     */       do
/*     */       {
/* 159 */         i9 += 1;
/* 160 */       } while (MainMemory.getI8(paramInt1 + i9) == 32);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label288:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */       SystemLibrary.strcpy(n, paramInt1 + i9);
/* 174 */       i9 = SystemLibrary.strlen(n);
/* 175 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */         i5 = __ctype_toupper_loc.call();
/* 186 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 193 */           i6 = n + i8;
/* 194 */           MainMemory.setI8(i6, (byte)MainMemory.getI32(MainMemory.getI32(i5) + (MainMemory.getI8(i6) << 2)));
/* 195 */           i8 += 1;
/* 196 */           if (i8 == i9) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */       i7 = MainMemory.getI8(n);
/* 208 */       switch (i7) {
/*     */       case 0: 
/*     */         break;
/* 211 */       case 65:  i8 = 16;
/*     */         
/*     */ 
/*     */         break label580;
/*     */         
/*     */         break;
/*     */       }
/*     */       
/*     */       
/* 220 */       ffxmsg.call(5, 89888);
/* 221 */       MainMemory.setI32(paramInt5, 261);
/* 222 */       i = 261;
/*     */       
/*     */ 
/*     */ 
/*     */       break label1329;
/*     */       
/*     */ 
/* 229 */       if (i7 == 73) {
/* 230 */         i8 = 41;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 240 */         switch (i7) {
/* 241 */         case 70:  i8 = 42;
/*     */           break label580;
/*     */           break; case 69:  i8 = 42;
/*     */           
/*     */ 
/*     */           break label580;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 253 */         if (i7 == 68) {
/* 254 */           i8 = 82;
/*     */         } else {
/*     */           break label1286;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label580:
/*     */       
/*     */ 
/* 265 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */         MainMemory.setI32(paramInt2, i8);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 281 */       i6 = n + 1;
/* 282 */       switch (i8)
/*     */       {
/*     */       case 16: 
/*     */         break;
/*     */       case 41: 
/*     */         break;
/*     */       }
/*     */       
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 294 */       if (ffc2ii.call(i6, k, paramInt5) >= 1)
/*     */       {
/*     */ 
/*     */ 
/* 298 */         i9 = i8;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 305 */         i9 = MainMemory.getI32(k);
/* 306 */         if (i9 >= 1) {
/*     */           break label739;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 316 */         MainMemory.setI32(k, 0);
/* 317 */         MainMemory.setI32(paramInt5, 261);
/* 318 */         i9 = i8;
/*     */         
/*     */         break label1176;
/*     */         
/*     */         label739:
/* 323 */         if ((i9 >= 5) || (i8 != 41))
/*     */         {
/*     */ 
/*     */ 
/* 327 */           i9 = i8;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 334 */           i9 = 21;
/*     */           
/*     */ 
/*     */           break label1155;
/*     */           
/* 339 */           if (ffc2rr.call(i6, m, paramInt5) >= 1)
/*     */           {
/*     */ 
/*     */ 
/* 343 */             i9 = i8;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 350 */             f = MainMemory.getF32(m);
/* 351 */             if (!MathUtils.f_ugt(f, 0.0D)) {
/*     */               break label1133;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */             i9 = (int)f;
/* 362 */             MainMemory.setI32(k, i9);
/* 363 */             if (i9 <= 7) {
/*     */               break label899;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 374 */             i8 = MainMemory.getI8(n) == 70 ? 82 : i8;
/*     */             
/*     */ 
/*     */ 
/*     */             label899:
/*     */             
/*     */ 
/*     */ 
/* 382 */             if (i9 >= 10) {
/*     */               break label935;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 392 */             i6 = n + 2;
/*     */             
/*     */             break label946;
/*     */             
/*     */             label935:
/*     */             
/* 398 */             i6 = n + 3;
/*     */             
/*     */ 
/*     */ 
/*     */             label946:
/*     */             
/*     */ 
/*     */ 
/* 406 */             if (MainMemory.getI8(i6) != 46)
/*     */             {
/*     */ 
/*     */ 
/* 410 */               i9 = i8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 417 */             else if (ffc2ii.call(i6 + 1, j, paramInt5) >= 1)
/*     */             {
/*     */ 
/*     */ 
/* 421 */               i9 = i8;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 428 */               i10 = MainMemory.getI32(j);
/* 429 */               if (i4 == 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 439 */                 MainMemory.setI32(paramInt4, i10);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 445 */               if (i10 >= i9)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 455 */                 MainMemory.setI32(paramInt5, 261);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 461 */               if (i10 <= 6)
/*     */               {
/*     */ 
/*     */ 
/* 465 */                 i9 = i8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 472 */               else if (MainMemory.getI8(n) != 69)
/*     */               {
/*     */ 
/*     */ 
/* 476 */                 i9 = i8;
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/* 483 */                 i9 = 82;
/*     */                 
/*     */                 break label1155;
/*     */                 
/*     */                 label1133:
/* 488 */                 MainMemory.setI32(paramInt5, 261);
/* 489 */                 i9 = i8;
/*     */                 break label1176;
/*     */               }
/*     */             }
/*     */           } } }
/*     */       label1155:
/* 495 */       if (MainMemory.getI32(paramInt5) <= 0) {
/*     */         break label1214;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label1176:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 508 */       MainMemory.setI32(paramInt5, 261);
/* 509 */       SystemLibrary.sprintf(i1, 88032, new Object[] { Integer.valueOf(paramInt1) });
/* 510 */       ffxmsg.call(5, i1);
/*     */       
/*     */ 
/*     */ 
/*     */       label1214:
/*     */       
/*     */ 
/*     */ 
/* 518 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 528 */         MainMemory.setI32(paramInt2, i9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 534 */       if (i3 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 544 */         MainMemory.setI32(paramInt3, MainMemory.getI32(k));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 550 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       break label1329;
/*     */       
/*     */       label1286:
/*     */       
/* 557 */       SystemLibrary.sprintf(i1, 94816, new Object[] { Integer.valueOf(paramInt1) });
/* 558 */       ffxmsg.call(5, i1);
/* 559 */       MainMemory.setI32(paramInt5, 262);
/* 560 */       i = 262;
/*     */       
/*     */ 
/*     */       label1329:
/*     */       
/*     */ 
/* 566 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 571 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffasfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */