/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffcphd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3154;
/*  20 */   public static final Function _instance = new ffcphd();
/*  21 */   public final Function resolve() { return _instance; }
/*     */   
/*  23 */   public ffcphd() { super("ffcphd", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  27 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int m = call(i, j, k);
/*  42 */     paramFrame.setI32(paramInt1, m);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     boolean bool = false;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*  64 */     int i10 = 0;
/*  65 */     int i11 = 0;
/*     */     
/*     */ 
/*  68 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       j = MainMemory.alloc(81);
/*  73 */       k = MainMemory.alloc(71);
/*  74 */       m = MainMemory.alloc(4);
/*  75 */       n = MainMemory.alloc(4);
/*  76 */       i1 = MainMemory.alloc(73);
/*  77 */       i4 = MainMemory.getI32(paramInt3);
/*  78 */       if (i4 <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         if (paramInt1 != paramInt2) {
/*     */           break label143;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         MainMemory.setI32(paramInt3, 101);
/*     */         
/*     */         break label1205;
/*     */         
/*     */         label143:
/* 103 */         i3 = MainMemory.getI32(paramInt1);
/* 104 */         i2 = paramInt1 + 4;
/* 105 */         if (i3 == MainMemory.getI32(MainMemory.getI32(i2) + 64)) {
/* 106 */           i3 = i4;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 116 */           ffmahd.call(paramInt1, i3 + 1, 0, paramInt3);
/* 117 */           i4 = MainMemory.getI32(paramInt3);
/* 118 */           i3 = i4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         if (i3 > 0) {
/* 126 */           i4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 137 */           i8 = MainMemory.getI32(paramInt1);
/* 138 */           i7 = MainMemory.getI32(i2);
/* 139 */           i4 = MainMemory.getI32(i7 + 64);
/* 140 */           if (i8 != i4)
/*     */           {
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
/* 153 */             ffmahd.call(paramInt1, i8 + 1, 0, paramInt3);
/* 154 */             i7 = MainMemory.getI32(i2);
/* 155 */             i4 = MainMemory.getI32(i7 + 64);
/* 156 */             i3 = MainMemory.getI32(paramInt3);
/*     */           }
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
/* 168 */           i4 = (int)((MainMemory.getI64(i7 + 88) - MainMemory.getI64(MainMemory.getI32(i7 + 84) + (i4 << 3))) / 80L);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */         if (i3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           i5 = malloc.call(i4 * 81);
/* 189 */           if (i5 != 0) {
/*     */             break label403;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 199 */           MainMemory.setI32(paramInt3, 113);
/*     */           
/*     */           break label1205;
/*     */           
/*     */           label403:
/* 204 */           bool = i4 > 0;
/* 205 */           if (bool) {
/* 206 */             i3 = 0;
/*     */           } else {
/*     */             break label479;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 217 */             i8 = i3 + 1;
/* 218 */             ffgrec.call(paramInt1, i8, i5 + i3 * 81, paramInt3);
/* 219 */             if (i8 >= i4) break;
/* 220 */             i3 = i8;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label479:
/*     */           
/*     */ 
/*     */ 
/* 230 */           i6 = MainMemory.getI32(paramInt1) == 0 ? 1 : 0;
/* 231 */           MainMemory.setI32(m, -1);
/* 232 */           if (MainMemory.getI32(MainMemory.getI32(i2) + 68) != 0) {
/*     */             break label542;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */           ffcphd_576.call(m, paramInt3, k, j, paramInt1);
/*     */           
/*     */ 
/*     */           label542:
/*     */           
/*     */ 
/* 248 */           i3 = MainMemory.getI32(paramInt2);
/* 249 */           i2 = paramInt2 + 4;
/* 250 */           i7 = MainMemory.getI32(i2);
/* 251 */           i8 = MainMemory.getI32(i7 + 64);
/* 252 */           if (i3 == i8) {
/* 253 */             i3 = i8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 264 */             ffmahd.call(paramInt2, i3 + 1, 0, paramInt3);
/* 265 */             i7 = MainMemory.getI32(i2);
/* 266 */             i3 = MainMemory.getI32(i7 + 64);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */           if (MainMemory.getI64(i7 + 88) != MainMemory.getI64(MainMemory.getI32(i7 + 84) + (i3 << 3)))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 286 */             ffcrhd.call(paramInt2, paramInt3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 292 */           if (MainMemory.getI32(paramInt2) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 296 */             i3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/* 303 */           else if (MainMemory.getI32(m) >= 0)
/*     */           {
/*     */ 
/*     */ 
/* 307 */             i3 = 1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 314 */             ffcrim.call(paramInt2, 8, 0, n, paramInt3);
/* 315 */             ffcrhd.call(paramInt2, paramInt3);
/* 316 */             i3 = 0;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 323 */           i8 = MainMemory.getI32(paramInt3);
/* 324 */           if (i8 <= 0) {
/*     */             break label782;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 334 */           free.call(i5);
/*     */           
/*     */           break label1205;
/*     */           
/*     */           label782:
/* 339 */           if ((i6 == 0) || (i3 == 1)) {
/*     */             break label952;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 349 */           SystemLibrary.memcpy(i1, 57376, 16, 1);
/* 350 */           ffs2c.call(26848, k, i8);
/* 351 */           ffmkky.call(45664, k, i1, j, paramInt3);
/* 352 */           ffprec.call(paramInt2, j, paramInt3);
/* 353 */           i3 = MainMemory.getI32(m);
/* 354 */           i8 = i3 + 3;
/* 355 */           if (i8 > 1) {
/* 356 */             i10 = 0;
/*     */           } else {
/*     */             break label927;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 367 */             ffprec.call(paramInt2, i5 + (i10 * 81 + 81), paramInt3);
/* 368 */             i11 = i10 + 1;
/* 369 */             if (i8 <= i10 + 2) break;
/* 370 */             i10 = i11;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label927:
/*     */           
/*     */ 
/*     */ 
/* 380 */           ffcphd_574.call(i1, i3, i8, i5, paramInt3, i4, paramInt2);
/*     */           
/*     */           break label1195;
/*     */           
/*     */           label952:
/* 385 */           if ((i3 == 0) || (i6 != 0)) {
/*     */             break label1179;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 395 */           SystemLibrary.memcpy(i1, 83232, 35, 1);
/* 396 */           i9 = k;
/* 397 */           MainMemory.setI16(i9, (short)84);
/* 398 */           ffmkky.call(36032, k, i1, j, paramInt3);
/* 399 */           ffprec.call(paramInt2, j, paramInt3);
/* 400 */           i3 = MainMemory.getI32(m);
/* 401 */           i8 = i3 + 3;
/* 402 */           if (i8 > 1) {
/* 403 */             i10 = 0;
/*     */           } else {
/*     */             break label1097;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 414 */             ffprec.call(paramInt2, i5 + (i10 * 81 + 81), paramInt3);
/* 415 */             i11 = i10 + 1;
/* 416 */             if (i8 <= i10 + 2) break;
/* 417 */             i10 = i11;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label1097:
/*     */           
/*     */ 
/*     */ 
/* 427 */           SystemLibrary.memcpy(i1, 85600, 36, 1);
/* 428 */           if (MainMemory.getI32(paramInt3) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 438 */             MainMemory.setI16(i9, (short)84);
/* 439 */             ffmkky.call(34624, k, i1, j, paramInt3);
/* 440 */             ffprec.call(paramInt2, j, paramInt3);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 446 */           ffcphd_575.call(i5, paramInt3, i8, i4, i3, paramInt2);
/*     */           
/*     */           break label1195;
/*     */           
/*     */           label1179:
/* 451 */           ffcphd_577.call(bool, paramInt2, i5, paramInt3, i4);
/*     */           
/*     */ 
/*     */           label1195:
/*     */           
/*     */ 
/* 457 */           free.call(i5);
/*     */         }
/*     */       }
/*     */       
/*     */       label1205:
/*     */       
/* 463 */       i = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 469 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 474 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcphd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */