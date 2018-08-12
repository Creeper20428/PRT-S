/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ffcmps extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3240;
/*  13 */   public static final Function _instance = new ffcmps();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public ffcmps() { super("ffcmps", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m, n);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     int i7 = 0;
/*  60 */     int i8 = 0;
/*  61 */     int i9 = 0;
/*  62 */     int i10 = 0;
/*  63 */     int i11 = 0;
/*     */     
/*     */ 
/*  66 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(71);
/*  71 */       j = MainMemory.alloc(71);
/*  72 */       MainMemory.setI32(paramInt4, 0);
/*  73 */       MainMemory.setI32(paramInt5, 1);
/*  74 */       SystemLibrary.strncpy(i, paramInt1, 71);
/*  75 */       SystemLibrary.strncpy(j, paramInt2, 71);
/*  76 */       MainMemory.setI8(i + 70, (byte)0);
/*  77 */       MainMemory.setI8(j + 70, (byte)0);
/*  78 */       n = SystemLibrary.strlen(i) + -1;
/*  79 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  86 */         i5 = n - i1;
/*  87 */         paramInt1 = i + i5;
/*  88 */         if (i5 < 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         if (MainMemory.getI8(paramInt1) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         MainMemory.setI8(paramInt1, (byte)0);
/* 109 */         i1 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 115 */       n = SystemLibrary.strlen(j) + -1;
/* 116 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 123 */         i5 = n - i1;
/* 124 */         paramInt1 = j + i5;
/* 125 */         if (i5 < 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         if (MainMemory.getI8(paramInt1) != 32) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */         MainMemory.setI8(paramInt1, (byte)0);
/* 146 */         i1 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 152 */       if (paramInt3 != 0) {
/*     */         break label401;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 162 */       paramInt3 = SystemLibrary.strlen(i);
/* 163 */       if (paramInt3 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 173 */         k = com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc.call();
/* 174 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 181 */           paramInt1 = i + n;
/* 182 */           MainMemory.setI8(paramInt1, (byte)MainMemory.getI32(MainMemory.getI32(k) + (MainMemory.getI8(paramInt1) << 2)));
/* 183 */           n += 1;
/* 184 */           if (n == paramInt3) {
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
/* 195 */       ffcmps_565.call(j);
/*     */       
/*     */ 
/*     */       label401:
/*     */       
/*     */ 
/* 201 */       if (MainMemory.getI8(i) != MainMemory.getI8(j)) {
/*     */         break label465;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */       if (SystemLibrary.strcmp(i, j) != 0) {
/*     */         break label465;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 221 */       MainMemory.setI32(paramInt4, 1);
/*     */       
/*     */ 
/*     */       break label1267;
/*     */       
/*     */       label465:
/*     */       
/* 228 */       MainMemory.setI32(paramInt5, 0);
/* 229 */       i7 = 0;
/* 230 */       i8 = 0;
/* 231 */       m = 1;
/* 232 */       n = 0;
/* 233 */       paramInt3 = 0;
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
/* 244 */       i1 = paramInt3 + 1;
/* 245 */       paramInt1 = i + n;
/* 246 */       paramInt2 = j + i1;
/* 247 */       paramInt3 = i7;
/* 248 */       i5 = i8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 256 */         i4 = MainMemory.getI8(i + paramInt3);
/* 257 */         i2 = i4 == 0 ? 1 : 0;
/* 258 */         i3 = MainMemory.getI8(j + i5);
/* 259 */         if (i2 == 0) {
/*     */           break label663;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 269 */         if (i3 != 0) {
/*     */           break label601;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */         MainMemory.setI32(paramInt4, 1);
/*     */         
/*     */ 
/*     */         break label1267;
/*     */         
/*     */         label601:
/*     */         
/* 286 */         if (i2 == 0) {
/*     */           break label663;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */         if (m != 0) {
/*     */           break label1262;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */         i4 = MainMemory.getI8(paramInt1);
/* 307 */         i3 = MainMemory.getI8(paramInt2);
/*     */         
/*     */ 
/* 310 */         paramInt3 = n;
/* 311 */         i5 = i1;
/*     */         
/*     */         break label741;
/*     */         
/*     */         label663:
/* 316 */         if (i3 != 0) {
/*     */           break label741;
/*     */         }
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
/* 330 */         if (i4 != 42) {
/*     */           break label1262;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */         if (MainMemory.getI8(i + (paramInt3 + 1)) != 0) {
/*     */           break label1262;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 350 */         MainMemory.setI32(paramInt4, 1);
/*     */         
/*     */ 
/*     */ 
/*     */         break label1267;
/*     */         
/*     */ 
/*     */ 
/*     */         label741:
/*     */         
/*     */ 
/* 361 */         if ((i4 != i3) && (i4 != 63)) {
/*     */           break label788;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 371 */         i5 += 1;
/* 372 */         paramInt3 += 1;
/*     */         
/*     */ 
/* 375 */         continue;
/*     */         
/*     */         label788:
/*     */         
/* 379 */         switch (i4)
/*     */         {
/*     */         case 35: 
/*     */           break;
/*     */         case 42: 
/*     */           break label897;
/*     */           
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 390 */         i6 = MainMemory.getI32(com.emt.proteus.runtime.library.ctype.__ctype_b_loc.call());
/* 391 */         if ((MainMemory.getI16(i6 + (i3 << 1)) & 0xFFFF & 0x800) != 0) {
/*     */           break label1157;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 401 */         if (i4 != 42) {
/*     */           break label1237;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label897:
/*     */         
/*     */ 
/*     */ 
/* 411 */         n = paramInt3 + 1;
/* 412 */         switch (MainMemory.getI8(i + n)) {
/*     */         case 0: 
/*     */           break;
/*     */         case 32: 
/*     */           break;
/* 417 */         default:  i1 = 0;
/* 418 */           i7 = 0;
/* 419 */           i8 = i5;
/* 420 */           break;
/*     */         }
/*     */         
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 427 */         MainMemory.setI32(paramInt4, 1);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         break label1267;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 437 */         i9 = n + i1;
/* 438 */         paramInt1 = i + i9;
/* 439 */         m = i7 != 1 ? 1 : 0;
/* 440 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 447 */           i11 = i8 + i10;
/* 448 */           i3 = MainMemory.getI8(j + i11);
/* 449 */           if ((i3 == 0) || (m == 0)) {
/*     */             break label1117;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 459 */           if (MainMemory.getI8(paramInt1) != i3) {
/*     */             break label1097;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 469 */           i8 = i11 + 1;
/* 470 */           i1 += 1;
/*     */           
/* 472 */           i7 = 1;
/*     */           
/* 474 */           break;
/*     */           
/*     */           label1097:
/*     */           
/* 478 */           i11 = i10 + 1;
/* 479 */           i10 = i11;
/*     */         }
/*     */         
/*     */         label1117:
/*     */         
/* 484 */         if (i7 == 0) {
/*     */           break label1262;
/*     */         } else {
/* 487 */           i7 = i9;
/* 488 */           i8 = i11;
/* 489 */           m = 0;
/* 490 */           n = paramInt3;
/* 491 */           paramInt3 = i5;
/* 492 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */         label1157:
/*     */         
/* 498 */         i7 = i5 + 1;
/* 499 */         i8 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 506 */           i5 = i7 + i8;
/* 507 */           i8 += 1;
/* 508 */           if ((MainMemory.getI16(i6 + (MainMemory.getI8(j + i5) << 1)) & 0xFFFF & 0x800) == 0) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 519 */         paramInt3 += 1;
/*     */         
/*     */ 
/* 522 */         continue;
/*     */         
/*     */         label1237:
/*     */         
/* 526 */         if (m != 0) {
/*     */           break label1262;
/*     */         }
/*     */         
/* 530 */         paramInt3 = n;
/* 531 */         i5 = i1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label1262:
/*     */       
/*     */ 
/*     */ 
/*     */       label1267:
/*     */       
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 548 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcmps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */