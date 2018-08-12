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
/*     */ public final class ngp_read_line extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3453;
/*  14 */   public static final Function _instance = new ngp_read_line();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ngp_read_line() { super("ngp_read_line", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = call(i);
/*  30 */     paramFrame.setI32(paramInt1, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     byte b1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     byte b2 = 0;
/*     */     
/*     */ 
/*  48 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.alloc(4);
/*  53 */       k = MainMemory.getI32Aligned(467192);
/*  54 */       if (k >= 1) {
/*     */         break label76;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  64 */       MainMemory.setI32Aligned(467196, 5);
/*  65 */       i = 0;
/*     */       
/*     */ 
/*     */       break label2032;
/*     */       
/*     */       label76:
/*     */       
/*  72 */       if (k > 10) {
/*  73 */         paramInt = 365;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*  83 */       else if (MainMemory.getI32(470464 + (k + -1 << 2)) == 0) {
/*  84 */         paramInt = 362;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  94 */         m = paramInt == 0 ? 1 : 0;
/*  95 */         paramInt = k;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         paramInt = ngp_read_line_buffered.call(MainMemory.getI32(470464 + (paramInt + -1 << 2)));
/* 103 */         switch (paramInt)
/*     */         {
/*     */         case 0: 
/*     */           break label307;
/*     */           
/*     */ 
/*     */           break;
/*     */         case 367: 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 115 */         paramInt = MainMemory.getI32Aligned(467192) + -1;
/* 116 */         MainMemory.setI32Aligned(467192, paramInt);
/* 117 */         n = MainMemory.getI32(470464 + (paramInt << 2));
/* 118 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */           SystemLibrary.fclose(n);
/* 130 */           paramInt = MainMemory.getI32Aligned(467192);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */         MainMemory.setI32(470464 + (paramInt << 2), 0);
/* 139 */         if (paramInt >= 1) {
/*     */           break label669;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */         MainMemory.setI32Aligned(467196, 5);
/* 150 */         i = 0;
/*     */         
/*     */ 
/*     */         break label2032;
/*     */         
/*     */         label307:
/*     */         
/* 157 */         if ((MainMemory.getI32Aligned(468024) & 0x1) != 0) {
/*     */           break label2025;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */         switch (MainMemory.getI8(MainMemory.getI32Aligned(468000)))
/*     */         {
/*     */         case 0: 
/*     */           break;
/*     */         case 35: 
/*     */           break label669;
/*     */           
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 179 */         if (m == 0) {
/*     */           break label669;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */         paramInt = ngp_extract_tokens.call();
/* 190 */         if (paramInt != 0) {
/*     */           break label2025;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 201 */         i2 = MainMemory.getI32Aligned(468004);
/* 202 */         if (i2 == 0) {
/*     */           break label669;
/*     */         } else {
/* 205 */           paramInt = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 214 */           if (!MathUtils.ugt(SystemLibrary.strlen(i2), paramInt))
/*     */           {
/*     */ 
/*     */ 
/* 218 */             paramInt = 0;
/* 219 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 225 */           i1 = i2 + paramInt;
/* 226 */           b1 = MainMemory.getI8(i1);
/* 227 */           if (!MathUtils.ult((byte)(b1 + -97), (byte)26)) {
/*     */             break label533;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 237 */           MainMemory.setI8(i1, (byte)(b1 + -32));
/*     */           
/*     */ 
/*     */           label533:
/*     */           
/*     */ 
/* 243 */           if (paramInt == 7) {
/* 244 */             paramInt = 0;
/* 245 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 254 */           paramInt += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 261 */           if (paramInt != 5)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */             if (SystemLibrary.strcmp(i2, MainMemory.getI32(110688 + (paramInt << 3))) != 0) {
/*     */               break label2011;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 281 */           MainMemory.setI32Aligned(467196, MainMemory.getI32(110688 + (paramInt << 3) + 4));
/* 282 */           if (paramInt != 0) {
/*     */             break label685;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 292 */           paramInt = ngp_include_file.call(MainMemory.getI32Aligned(468008));
/* 293 */           if (paramInt != 0) {
/*     */             break label2025;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label669:
/*     */           
/*     */ 
/*     */ 
/* 304 */           paramInt = MainMemory.getI32Aligned(467192);
/*     */           
/* 306 */           break;
/*     */           
/*     */           label685:
/*     */           
/* 310 */           MainMemory.setI32Aligned(481696, 0);
/* 311 */           i2 = MainMemory.getI32Aligned(468008);
/* 312 */           paramInt = MainMemory.getI32Aligned(468012);
/* 313 */           if (i2 != 0) {
/*     */             break label775;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */           if (paramInt != 7) {
/*     */             break label758;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 333 */           MainMemory.setI32Aligned(481696, 7);
/*     */           
/*     */           break label1899;
/*     */           
/*     */           label758:
/* 338 */           MainMemory.setI32Aligned(481696, 6);
/*     */           
/*     */           break label1899;
/*     */           
/*     */           label775:
/* 343 */           if (paramInt != 2)
/*     */           {
/*     */ 
/*     */ 
/* 347 */             paramInt = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 354 */             MainMemory.setI32Aligned(481696, 2);
/* 355 */             MainMemory.setI32Aligned(481772, i2);
/*     */             
/*     */             break label1349;
/*     */           }
/*     */           for (;;)
/*     */           {
/* 361 */             b1 = MainMemory.getI8(13888 + paramInt);
/* 362 */             b1 = MathUtils.ult((byte)(b1 + -97), (byte)26) ? (byte)(b1 + -32) : b1;
/* 363 */             b2 = MainMemory.getI8(i2 + paramInt);
/* 364 */             if (b1 != (MathUtils.ult((byte)(b2 + -97), (byte)26) ? (byte)(b2 + -32) : b2))
/*     */             {
/*     */ 
/*     */ 
/* 368 */               paramInt = 0;
/* 369 */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 375 */             if (b1 == 0) {
/*     */               break label1045;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */             paramInt += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 392 */             b1 = MainMemory.getI8(13920 + paramInt);
/* 393 */             b1 = MathUtils.ult((byte)(b1 + -97), (byte)26) ? (byte)(b1 + -32) : b1;
/* 394 */             b2 = MainMemory.getI8(i2 + paramInt);
/* 395 */             if (b1 != (MathUtils.ult((byte)(b2 + -97), (byte)26) ? (byte)(b2 + -32) : b2)) {
/*     */               break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */             if (b1 != 0) {
/*     */               break label1199;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label1045:
/*     */             
/*     */ 
/*     */ 
/* 415 */             MainMemory.setI32Aligned(481696, 1);
/* 416 */             paramInt = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 423 */               b1 = MainMemory.getI8(13888 + paramInt);
/* 424 */               b1 = MathUtils.ult((byte)(b1 + -97), (byte)26) ? (byte)(b1 + -32) : b1;
/* 425 */               b2 = MainMemory.getI8(i2 + paramInt);
/* 426 */               if (b1 != (MathUtils.ult((byte)(b2 + -97), (byte)26) ? (byte)(b2 + -32) : b2))
/*     */               {
/*     */ 
/*     */ 
/* 430 */                 b1 = 0;
/* 431 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 437 */               if (b1 == 0) {
/* 438 */                 b1 = 1;
/* 439 */                 break;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */               paramInt += 1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 455 */             MainMemory.setI8(481772, b1);
/*     */             
/*     */             break label1349;
/*     */             
/*     */             label1199:
/* 460 */             paramInt += 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 466 */           if (SystemLibrary.sscanf(i2, 51232, new int[] { 481772, 481780, j }) != 2) {
/*     */             break label1349;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 476 */           switch (MainMemory.getI8(MainMemory.getI32Aligned(468008) + MainMemory.getI32(j)))
/*     */           {
/*     */           case 9: 
/*     */             break;
/*     */           case 32: 
/*     */             break;
/*     */           case 10: 
/*     */             break;
/*     */           case 0: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 492 */           MainMemory.setI32Aligned(481696, 5);
/*     */           
/*     */           break label1695;
/*     */           
/*     */           label1349:
/* 497 */           paramInt = MainMemory.getI32Aligned(481696);
/* 498 */           if (paramInt != 0) {
/*     */             break label1706;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 509 */           i2 = MainMemory.getI32Aligned(468008);
/* 510 */           if (SystemLibrary.strchr(i2, 46) != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 520 */             if (SystemLibrary.sscanf(i2, 25696, new int[] { 481772, j }) != 1) {
/*     */               break label1695;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 530 */             i2 = MainMemory.getI32Aligned(468008);
/* 531 */             paramInt = MainMemory.getI32(j);
/* 532 */             i1 = i2 + paramInt;
/* 533 */             switch (MainMemory.getI8(i1))
/*     */             {
/*     */             case 68: 
/*     */               break label1557;
/*     */               
/*     */               break;
/*     */             case 9: 
/*     */               break;
/*     */             case 32: 
/*     */               break;
/*     */             case 10: 
/*     */               break;
/*     */             case 0: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 550 */             MainMemory.setI32Aligned(481696, 4);
/*     */             
/*     */             break label1899;
/*     */             
/*     */             label1557:
/* 555 */             MainMemory.setI8(i1, (byte)69);
/* 556 */             SystemLibrary.sscanf(i2, 25696, new int[] { 481772, j });
/* 557 */             i2 = MainMemory.getI32Aligned(468008);
/* 558 */             switch (MainMemory.getI8(i2 + MainMemory.getI32(j)))
/*     */             {
/*     */             case 9: 
/*     */               break;
/*     */             case 32: 
/*     */               break;
/*     */             case 10: 
/*     */               break;
/*     */             case 0: 
/*     */               break;
/*     */             }
/*     */             
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 574 */             MainMemory.setI32Aligned(481696, 4);
/*     */             
/*     */ 
/*     */             break label1899;
/*     */             
/* 579 */             MainMemory.setI8(i2 + paramInt, (byte)68);
/*     */           }
/*     */           
/*     */ 
/*     */           label1695:
/*     */           
/* 585 */           paramInt = MainMemory.getI32Aligned(481696);
/*     */           
/*     */ 
/*     */ 
/*     */           label1706:
/*     */           
/*     */ 
/*     */ 
/* 593 */           if (paramInt != 0) {
/*     */             break label1857;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 603 */           if (SystemLibrary.sscanf(MainMemory.getI32Aligned(468008), 20032, new int[] { 481772, j }) != 1) {
/*     */             break label1857;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 613 */           switch (MainMemory.getI8(MainMemory.getI32Aligned(468008) + MainMemory.getI32(j)))
/*     */           {
/*     */           case 9: 
/*     */             break;
/*     */           case 32: 
/*     */             break;
/*     */           case 10: 
/*     */             break;
/*     */           case 0: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 629 */           MainMemory.setI32Aligned(481696, 3);
/*     */           
/*     */           break label1899;
/*     */           
/*     */           label1857:
/* 634 */           if (MainMemory.getI32Aligned(481696) != 0) {
/*     */             break label1899;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 644 */           MainMemory.setI32Aligned(481696, 2);
/* 645 */           MainMemory.setI32Aligned(481772, MainMemory.getI32Aligned(468008));
/*     */           
/*     */ 
/*     */           label1899:
/*     */           
/*     */ 
/* 651 */           i2 = MainMemory.getI32Aligned(468016);
/* 652 */           if (i2 != 0) {
/*     */             break label1940;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 662 */           MainMemory.setI8(481788, (byte)0);
/*     */           
/*     */           break label1961;
/*     */           
/*     */           label1940:
/* 667 */           SystemLibrary.strncpy(481788, i2, 80);
/* 668 */           MainMemory.setI8(481867, (byte)0);
/*     */           
/*     */ 
/*     */           label1961:
/*     */           
/*     */ 
/* 674 */           SystemLibrary.strncpy(481700, MainMemory.getI32Aligned(468004), 72);
/* 675 */           MainMemory.setI8(481771, (byte)0);
/* 676 */           i = MathUtils.ugt(SystemLibrary.strlen(481700), 72) ? 368 : 0;
/*     */           
/*     */ 
/*     */           break label2032;
/*     */           
/*     */           label2011:
/*     */           
/* 683 */           paramInt += 1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       label2025:
/*     */       
/* 690 */       i = paramInt;
/*     */       
/*     */ 
/*     */       label2032:
/*     */       
/*     */ 
/* 696 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 701 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_read_line.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */