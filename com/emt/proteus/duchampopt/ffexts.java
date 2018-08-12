/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp.__strcspn_c1;
/*     */ import com.emt.proteus.runtime.library.cpp.__strcspn_c3;
/*     */ import com.emt.proteus.runtime.library.cpp.__strspn_c3;
/*     */ 
/*     */ public final class ffexts extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2989;
/*  17 */   public static final Function _instance = new ffexts();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffexts() { super("ffexts", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
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
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     call(i, j, k, m, n, i1, i2, i3);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     int n = 0;
/*  66 */     int i1 = 0;
/*  67 */     int i2 = 0;
/*  68 */     int i3 = 0;
/*  69 */     int i4 = 0;
/*  70 */     int i5 = 0;
/*  71 */     int i6 = 0;
/*  72 */     int i7 = 0;
/*     */     
/*     */ 
/*  75 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  79 */       i = MainMemory.alloc(71);
/*  80 */       j = MainMemory.alloc(4);
/*  81 */       MainMemory.setI32(paramInt2, 0);
/*  82 */       MainMemory.setI8(paramInt3, (byte)0);
/*  83 */       MainMemory.setI32(paramInt4, 0);
/*  84 */       MainMemory.setI32(paramInt5, -1);
/*  85 */       MainMemory.setI8(paramInt6, (byte)0);
/*  86 */       MainMemory.setI8(paramInt7, (byte)0);
/*  87 */       if (MainMemory.getI32(paramInt8) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         i3 = MainMemory.getI8(paramInt1);
/*  98 */         if (i3 == 32) {
/*  99 */           n = 0;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/* 104 */           k = paramInt1;
/*     */           
/*     */ 
/*     */           break label173;
/*     */         }
/*     */         
/*     */         do
/*     */         {
/* 112 */           n += 1;
/* 113 */           k = paramInt1 + n;
/* 114 */           i3 = MainMemory.getI8(k);
/* 115 */         } while (i3 == 32);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label173:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         if ((MainMemory.getI16(MainMemory.getI32(com.emt.proteus.runtime.library.ctype.__ctype_b_loc.call()) + (i3 << 1)) & 0xFFFF & 0x800) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */           m = SystemLibrary.__errno_location();
/* 141 */           MainMemory.setI32(m, 0);
/* 142 */           n = SystemLibrary.strtol(k, j, 10);
/* 143 */           MainMemory.setI32(paramInt2, n);
/* 144 */           i6 = MainMemory.getI32(j);
/* 145 */           i3 = MainMemory.getI8(i6);
/* 146 */           if (i3 == 32) {
/* 147 */             i1 = 0;
/*     */           } else {
/*     */             break label321;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 159 */             i1 += 1;
/* 160 */             i2 = i6 + i1;
/* 161 */             i3 = MainMemory.getI8(i2);
/* 162 */           } while (i3 == 32);
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
/* 173 */           MainMemory.setI32(j, i2);
/*     */           
/*     */ 
/*     */ 
/*     */           label321:
/*     */           
/*     */ 
/*     */ 
/* 181 */           switch (i3)
/*     */           {
/*     */           case 0: 
/*     */             break;
/*     */           case 59: 
/*     */             break;
/*     */           }
/*     */           
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 193 */           if (MainMemory.getI32(m) != 34)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 198 */             i1 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 205 */             MainMemory.setI32(paramInt2, 0);
/* 206 */             MainMemory.setI32(m, 0);
/* 207 */             n = MainMemory.getI32(paramInt2);
/*     */             
/* 209 */             i1 = 1;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */           if (!MathUtils.ugt(n, 99999)) {
/*     */             break label474;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 227 */           MainMemory.setI32(paramInt2, 0);
/* 228 */           ffxmsg.call(5, 100000);
/* 229 */           ffxmsg.call(5, paramInt1);
/* 230 */           MainMemory.setI32(paramInt8, 125);
/*     */           
/*     */ 
/*     */           break label1561;
/*     */           
/*     */           label474:
/*     */           
/* 237 */           if (i1 == 0) {
/* 238 */             paramInt3 = k;
/*     */             
/*     */ 
/*     */ 
/*     */             break label1166;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 248 */         n = __strcspn_c3.call(k, 44, 58, 59);
/* 249 */         if (n <= 70) {
/*     */           break label542;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 259 */         MainMemory.setI32(paramInt8, 125);
/*     */         
/*     */ 
/*     */         break label1561;
/*     */         
/*     */         label542:
/*     */         
/* 266 */         SystemLibrary.strncat(paramInt3, k, n);
/* 267 */         i1 = n + -1;
/* 268 */         i4 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 275 */           i5 = n - i4;
/* 276 */           i6 = paramInt3 + (i1 - i4);
/* 277 */           if (i5 < 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 287 */           if (MainMemory.getI8(i6) != 32) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */           MainMemory.setI8(i6, (byte)0);
/* 298 */           i4 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 304 */         n = __strspn_c3.call(k + i5, 32, 44, 58) + i5;
/* 305 */         i6 = k + n;
/* 306 */         i1 = SystemLibrary.strcspn(i6, 20544);
/* 307 */         if (i1 != 0) {
/*     */           break label902;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 317 */         SystemLibrary.strcpy(i, paramInt3);
/* 318 */         n = SystemLibrary.strlen(i);
/* 319 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 329 */           i7 = com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc.call();
/* 330 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 337 */             k = i + i1;
/* 338 */             MainMemory.setI8(k, (byte)MainMemory.getI32(MainMemory.getI32(i7) + (MainMemory.getI8(k) << 2)));
/* 339 */             i1 += 1;
/* 340 */             if (i1 == n) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 351 */         if (SystemLibrary.strcmp(i, 40416) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 361 */           n = (MainMemory.getI8(i) & 0xFF) + -80;
/* 362 */           if (n != 0) {
/*     */             break label863;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */           n = MainMemory.getI8(i + 1) & 0xFF;
/*     */           
/*     */ 
/*     */ 
/*     */           label863:
/*     */           
/*     */ 
/*     */ 
/* 381 */           if (n != 0)
/*     */           {
/*     */ 
/*     */ 
/* 385 */             paramInt3 = i6;
/*     */             
/*     */ 
/*     */             break label1166;
/*     */           }
/*     */         }
/*     */         
/* 392 */         MainMemory.setI8(paramInt3, (byte)0);
/* 393 */         paramInt3 = i6;
/*     */         
/*     */         break label1166;
/*     */         
/*     */         label902:
/* 398 */         if (SystemLibrary.sscanf(i6, 15680, new int[] { paramInt4 }) != 1) {
/*     */           break label1538;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 408 */         n += i1;
/* 409 */         paramInt3 = k + (__strspn_c3.call(k + n, 32, 44, 58) + n);
/* 410 */         if (__strcspn_c1.call(paramInt3, 59) != 0)
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
/* 421 */           switch (MainMemory.getI8(paramInt3)) {
/*     */           case 66: 
/*     */             break label1155;
/*     */             break;
/*     */           case 98: 
/*     */             break label1155;
/*     */             break;
/*     */           case 84: 
/*     */             break label1139;
/*     */             break;
/*     */           case 116: 
/*     */             break label1139;
/*     */             break;
/*     */           case 97: 
/*     */             break label1139;
/*     */             break;
/*     */           case 65:  break label1139;
/*     */             break; case 73:  break; case 105:  break; }
/* 439 */           MainMemory.setI32(paramInt5, 0);
/*     */           
/*     */           break label1166;
/*     */           
/*     */           label1139:
/*     */           
/* 445 */           MainMemory.setI32(paramInt5, 1);
/*     */           
/*     */           break label1166;
/*     */           
/*     */           label1155:
/*     */           
/* 451 */           MainMemory.setI32(paramInt5, 2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label1166:
/*     */         
/*     */ 
/* 459 */         paramInt3 = SystemLibrary.strchr(paramInt3, 59);
/* 460 */         if (paramInt3 != 0)
/*     */         {
/*     */ 
/*     */ 
/* 464 */           n = 0;
/*     */           
/*     */ 
/*     */           break label1203;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */       break label1561;
/*     */       
/*     */       label1203:
/*     */       
/*     */       do
/*     */       {
/* 478 */         n += 1;
/* 479 */         k = paramInt3 + n;
/* 480 */       } while (MainMemory.getI8(k) == 32);
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
/* 491 */       paramInt3 = SystemLibrary.strchr(k, 40);
/* 492 */       if (paramInt3 != 0) {
/*     */         break label1294;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 502 */       ffxmsg.call(5, 129312);
/* 503 */       ffxmsg.call(5, 107168);
/* 504 */       ffxmsg.call(5, paramInt1);
/* 505 */       MainMemory.setI32(paramInt8, 125);
/*     */       
/*     */ 
/*     */       break label1561;
/*     */       
/*     */       label1294:
/*     */       
/* 512 */       n = paramInt3 - k;
/* 513 */       if (n <= 1024) {
/*     */         break label1338;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 523 */       MainMemory.setI32(paramInt8, 125);
/*     */       
/*     */ 
/*     */       break label1561;
/*     */       
/*     */       label1338:
/*     */       
/* 530 */       SystemLibrary.strncat(paramInt6, k, n);
/* 531 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       do
/*     */       {
/* 538 */         n += 1;
/* 539 */         paramInt6 = paramInt3 + n;
/* 540 */       } while (MainMemory.getI8(paramInt6) == 32);
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
/* 551 */       if (paramInt6 != 0) {
/*     */         break label1440;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 561 */       ffxmsg.call(5, 129312);
/* 562 */       ffxmsg.call(5, 111968);
/* 563 */       ffxmsg.call(5, paramInt1);
/* 564 */       MainMemory.setI32(paramInt8, 125);
/*     */       
/*     */ 
/*     */       break label1561;
/*     */       
/*     */       label1440:
/*     */       
/* 571 */       n = SystemLibrary.strchr(paramInt6, 41) - paramInt6;
/* 572 */       if (n <= 1024) {
/*     */         break label1490;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 582 */       MainMemory.setI32(paramInt8, 125);
/*     */       
/*     */ 
/*     */       break label1561;
/*     */       
/*     */       label1490:
/*     */       
/* 589 */       SystemLibrary.strncat(paramInt7, paramInt6, n);
/*     */       
/*     */ 
/*     */ 
/*     */       break label1561;
/*     */       
/*     */ 
/* 596 */       ffxmsg.call(5, 80992);
/* 597 */       ffxmsg.call(5, paramInt1);
/* 598 */       MainMemory.setI32(paramInt8, 125);
/*     */       
/*     */ 
/*     */       break label1561;
/*     */       
/*     */       label1538:
/*     */       
/* 605 */       ffxmsg.call(5, 82912);
/* 606 */       ffxmsg.call(5, paramInt1);
/* 607 */       MainMemory.setI32(paramInt8, 125);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label1561:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 618 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffexts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */