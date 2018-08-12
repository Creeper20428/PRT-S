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
/*     */ public final class ffgtgc
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3430;
/*  17 */   public static final Function _instance = new ffgtgc();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffgtgc() { super("ffgtgc", 9, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  51 */     paramInt4 += 2;
/*  52 */     paramInt3--;
/*  53 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  54 */     paramInt4 += 2;
/*  55 */     paramInt3--;
/*  56 */     int i5 = call(i, j, k, m, n, i1, i2, i3, i4);
/*  57 */     paramFrame.setI32(paramInt1, i5);
/*  58 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
/*     */   {
/*  63 */     int i = 0;
/*     */     
/*  65 */     int j = 0;
/*  66 */     int k = 0;
/*  67 */     int m = 0;
/*  68 */     int n = 0;
/*  69 */     int i1 = 0;
/*  70 */     int i2 = 0;
/*  71 */     int i3 = 0;
/*     */     
/*     */ 
/*  74 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  78 */       j = MainMemory.alloc(81);
/*  79 */       k = MainMemory.alloc(71);
/*  80 */       m = MainMemory.alloc(71);
/*  81 */       n = MainMemory.alloc(73);
/*  82 */       i1 = MainMemory.getI32(paramInt9);
/*  83 */       if (i1 != 0) {
/*     */         break label1385;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       if (i1 <= 0)
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
/* 105 */         MainMemory.setI8(k, (byte)0);
/* 106 */         MainMemory.setI8(n, (byte)0);
/* 107 */         if (ffgcrd.call(paramInt1, 40928, j, paramInt9) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */           ffpsvc.call(j, k, n, paramInt9);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 123 */         MainMemory.setI8(m, (byte)0);
/* 124 */         ffc2s.call(k, m, paramInt9);
/* 125 */         i1 = MainMemory.getI32(paramInt9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */       MainMemory.setI32(paramInt9, i1);
/* 134 */       if (i1 != 202) {
/*     */         break label231;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       MainMemory.setI32(paramInt9, 340);
/* 146 */       ffxmsg.call(5, 106400);
/* 147 */       i1 = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */ 
/*     */       label231:
/*     */       
/*     */ 
/*     */ 
/* 155 */       if (i1 != 0) {
/*     */         break label1326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */       prepare_keyvalue.call(m);
/* 166 */       if (SystemLibrary.strcasecmp(m, 44224) != 0) {
/*     */         break label1303;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */       ffgcnn.call(paramInt1, 1, 56736, k, paramInt2, paramInt9);
/* 177 */       i1 = MainMemory.getI32(paramInt9);
/* 178 */       if (i1 != 219) {
/*     */         break label340;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */       MainMemory.setI32(paramInt9, 0);
/* 190 */       MainMemory.setI32(paramInt2, 0);
/* 191 */       i1 = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */ 
/*     */       label340:
/*     */       
/*     */ 
/*     */ 
/* 199 */       if (i1 != 0) {
/*     */         break label1326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */       ffgcnn.call(paramInt1, 1, 51200, k, paramInt3, paramInt9);
/* 210 */       i1 = MainMemory.getI32(paramInt9);
/* 211 */       if (i1 != 219) {
/*     */         break label421;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 222 */       MainMemory.setI32(paramInt9, 0);
/* 223 */       MainMemory.setI32(paramInt3, 0);
/* 224 */       i1 = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */ 
/*     */       label421:
/*     */       
/*     */ 
/*     */ 
/* 232 */       if (i1 != 0) {
/*     */         break label1326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       ffgcnn.call(paramInt1, 1, 55072, k, paramInt4, paramInt9);
/* 243 */       i1 = MainMemory.getI32(paramInt9);
/* 244 */       if (i1 != 219) {
/*     */         break label502;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 255 */       MainMemory.setI32(paramInt9, 0);
/* 256 */       MainMemory.setI32(paramInt4, 0);
/* 257 */       i1 = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */ 
/*     */       label502:
/*     */       
/*     */ 
/*     */ 
/* 265 */       if (i1 != 0) {
/*     */         break label1326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 275 */       ffgcnn.call(paramInt1, 1, 56768, k, paramInt5, paramInt9);
/* 276 */       i1 = MainMemory.getI32(paramInt9);
/* 277 */       if (i1 != 219) {
/*     */         break label585;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 288 */       MainMemory.setI32(paramInt9, 0);
/* 289 */       MainMemory.setI32(paramInt5, 0);
/* 290 */       i1 = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */ 
/*     */       label585:
/*     */       
/*     */ 
/*     */ 
/* 298 */       if (i1 != 0) {
/*     */         break label1326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 308 */       ffgcnn.call(paramInt1, 1, 56832, k, paramInt6, paramInt9);
/* 309 */       i1 = MainMemory.getI32(paramInt9);
/* 310 */       if (i1 != 219) {
/*     */         break label668;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */       MainMemory.setI32(paramInt9, 0);
/* 322 */       MainMemory.setI32(paramInt6, 0);
/* 323 */       i1 = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */ 
/*     */       label668:
/*     */       
/*     */ 
/*     */ 
/* 331 */       if (i1 != 0) {
/*     */         break label1326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 341 */       ffgcnn.call(paramInt1, 1, 56800, k, paramInt7, paramInt9);
/* 342 */       i1 = MainMemory.getI32(paramInt9);
/* 343 */       if (i1 != 219) {
/*     */         break label751;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */       MainMemory.setI32(paramInt9, 0);
/* 355 */       MainMemory.setI32(paramInt7, 0);
/* 356 */       i1 = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */ 
/*     */       label751:
/*     */       
/*     */ 
/*     */ 
/* 364 */       if (i1 != 0) {
/*     */         break label1326;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 374 */       i2 = MainMemory.getI32(paramInt2) == 0 ? 1 : 0;
/* 375 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */         i3 = MainMemory.getI32(paramInt3) == 0 ? 1 : 0;
/* 386 */         if (i3 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 396 */           if (MainMemory.getI32(paramInt4) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 406 */             if (MainMemory.getI32(paramInt5) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 416 */               if (MainMemory.getI32(paramInt6) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */                 if (MainMemory.getI32(paramInt7) != 0) {
/*     */                   break label1287;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 436 */         if (i2 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 446 */           if (i3 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 456 */             if (MainMemory.getI32(paramInt4) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 466 */               if (MainMemory.getI32(paramInt6) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 476 */                 if (MainMemory.getI32(paramInt7) != 0) {
/*     */                   break label1270;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 486 */           if (i2 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 496 */             if (i3 == 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 506 */               if (MainMemory.getI32(paramInt4) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 516 */                 if (MainMemory.getI32(paramInt5) != 0) {
/*     */                   break label1254;
/*     */                 }
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 526 */             if ((i2 != 0) || (i3 == 0))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 536 */               if (MainMemory.getI32(paramInt4) != 0) {
/*     */                 break label1238;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 546 */       i2 = MainMemory.getI32(paramInt5) == 0 ? 1 : 0;
/* 547 */       if (i2 == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 557 */         if (MainMemory.getI32(paramInt6) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 567 */           if (MainMemory.getI32(paramInt7) != 0) {
/*     */             break label1221;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 577 */         if (i2 == 0) {
/*     */           break label1205;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 587 */       MainMemory.setI32(paramInt9, 340);
/* 588 */       i = 340;
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label1205:
/*     */       
/* 595 */       MainMemory.setI32(paramInt8, 2);
/*     */       
/*     */       break label1326;
/*     */       
/*     */       label1221:
/* 600 */       MainMemory.setI32(paramInt8, 12);
/*     */       
/*     */       break label1326;
/*     */       
/*     */       label1238:
/* 605 */       MainMemory.setI32(paramInt8, 1);
/*     */       
/*     */       break label1326;
/*     */       
/*     */       label1254:
/* 610 */       MainMemory.setI32(paramInt8, 3);
/*     */       
/*     */       break label1326;
/*     */       
/*     */       label1270:
/* 615 */       MainMemory.setI32(paramInt8, 11);
/*     */       
/*     */       break label1326;
/*     */       
/*     */       label1287:
/* 620 */       MainMemory.setI32(paramInt8, 0);
/*     */       
/*     */       break label1326;
/*     */       
/*     */       label1303:
/* 625 */       MainMemory.setI32(paramInt9, 340);
/* 626 */       i = 340;
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */       label1326:
/*     */       
/* 633 */       i1 = MainMemory.getI32(paramInt9);
/* 634 */       if (i1 != 237) {
/*     */         break label1385;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 645 */       MainMemory.setI32(paramInt9, 340);
/* 646 */       ffxmsg.call(5, 132064);
/* 647 */       i = MainMemory.getI32(paramInt9);
/*     */       
/*     */ 
/*     */       break label1394;
/*     */       
/*     */ 
/*     */       label1385:
/*     */       
/* 655 */       i = i1;
/*     */       
/*     */ 
/*     */       label1394:
/*     */       
/*     */ 
/* 661 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 666 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgtgc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */