/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffgknjj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3416;
/*  17 */   public static final Function _instance = new ffgknjj();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public ffgknjj() { super("ffgknjj", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  42 */     call(i, j, k, m);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*  65 */     int i12 = 0;
/*  66 */     int i13 = 0;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*     */     
/*     */ 
/*  71 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i = MainMemory.alloc(4);
/*  76 */       j = MainMemory.alloc(81);
/*  77 */       k = MainMemory.alloc(72);
/*  78 */       m = MainMemory.alloc(8);
/*  79 */       n = MainMemory.alloc(81);
/*  80 */       i1 = MainMemory.alloc(71);
/*  81 */       i2 = MainMemory.alloc(73);
/*  82 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         MainMemory.setI32(paramInt3, 0);
/*  93 */         MainMemory.setI8(k, (byte)0);
/*  94 */         SystemLibrary.strncat(k, 27584, 8);
/*  95 */         i3 = SystemLibrary.strlen(k);
/*  96 */         if ((i3 == 0) || (i3 <= 7))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */           if (i3 <= 0) {
/*     */             break label267;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */           i4 = __ctype_toupper_loc.call();
/* 117 */           i5 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 124 */             i9 = k + i5;
/* 125 */             MainMemory.setI8(i9, (byte)MainMemory.getI32(MainMemory.getI32(i4) + (MainMemory.getI8(i9) << 2)));
/* 126 */             i5 += 1;
/* 127 */             if (i5 == i3) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */           label267:
/*     */           
/*     */ 
/*     */ 
/* 138 */           if (MainMemory.getI32(paramInt4) > 0) {
/* 139 */             i5 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 149 */             i5 = MainMemory.getI32(paramInt1);
/* 150 */             i6 = paramInt1 + 4;
/* 151 */             i7 = MainMemory.getI32(i6);
/* 152 */             i8 = MainMemory.getI32(i7 + 64);
/* 153 */             if (i5 == i8) {
/* 154 */               i5 = i8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 165 */               ffmahd.call(paramInt1, i5 + 1, 0, paramInt4);
/* 166 */               i7 = MainMemory.getI32(i6);
/* 167 */               i5 = MainMemory.getI32(i7 + 64);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */             i5 = (int)((MainMemory.getI64(i7 + 88) - MainMemory.getI64(MainMemory.getI32(i7 + 84) + (i5 << 3))) / 80L);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 185 */           i8 = MainMemory.getI32(paramInt1);
/* 186 */           i6 = paramInt1 + 4;
/* 187 */           i7 = MainMemory.getI32(i6);
/* 188 */           i10 = MainMemory.getI32(i7 + 64);
/* 189 */           if (i8 == i10) {
/* 190 */             i8 = i10;
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
/* 201 */             ffmahd.call(paramInt1, i8 + 1, 0, paramInt4);
/* 202 */             i7 = MainMemory.getI32(i6);
/* 203 */             i8 = MainMemory.getI32(i7 + 64);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */           MainMemory.setI64(i7 + 104, MainMemory.getI64(MainMemory.getI32(i7 + 84) + (i8 << 3)) + 160L);
/* 214 */           i8 = 8 - i3;
/* 215 */           i9 = n + i3;
/* 216 */           i10 = 1 - paramInt2;
/* 217 */           i14 = 0;
/* 218 */           i15 = 0;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 226 */         if (i14 + 3 <= i5) {
/*     */           break label621;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */         if (i15 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 246 */           if (MainMemory.getI32(paramInt4) >= 1) {
/*     */             break label644;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */           MainMemory.setI32(paramInt4, 204);
/* 257 */           break;
/*     */           
/*     */ 
/*     */           label621:
/*     */           
/*     */ 
/* 263 */           if (ffgnky.call(paramInt1, n, paramInt4) <= 0) {
/*     */             break label654;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label644:
/*     */         
/*     */ 
/* 273 */         break;
/*     */         
/*     */ 
/*     */         label654:
/*     */         
/*     */ 
/* 279 */         if (SystemLibrary.strncmp(k, n, i3) != 0) {
/*     */           break label979;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 290 */         MainMemory.setI8(m, (byte)0);
/* 291 */         SystemLibrary.strncat(m, i9, i8);
/* 292 */         i11 = SystemLibrary.__errno_location();
/* 293 */         MainMemory.setI32(i11, 0);
/* 294 */         i12 = SystemLibrary.strtol(m, i, 10);
/* 295 */         switch (MainMemory.getI8(MainMemory.getI32(i))) {
/* 296 */         case 0:  i13 = 0;
/*     */           break label788;
/*     */           break; case 32:  i13 = 0;
/*     */           
/*     */ 
/*     */           break label788;
/*     */           
/*     */ 
/*     */           break;
/*     */         }
/*     */         
/*     */         
/* 308 */         i13 = 407;
/*     */         
/*     */ 
/*     */ 
/*     */         label788:
/*     */         
/*     */ 
/* 315 */         if (MainMemory.getI32(i11) != 34) {
/*     */           break label853;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 325 */         SystemLibrary.memcpy(j, 120672, 54, 1);
/* 326 */         SystemLibrary.strncat(j, m, 25);
/* 327 */         ffxmsg.call(5, j);
/* 328 */         MainMemory.setI32(i11, 0);
/*     */         
/*     */         break label979;
/*     */         
/*     */         label853:
/*     */         
/* 334 */         if ((i13 != 0) || (i12 != paramInt2)) {
/*     */           break label979;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */         ffpsvc.call(n, i1, i2, paramInt4);
/* 346 */         ffc2j.call(i1, 467228 + (i12 - paramInt2 << 3), paramInt4);
/* 347 */         i12 = i10 + i12;
/* 348 */         if (i12 <= MainMemory.getI32(paramInt3)) {
/*     */           break label943;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 358 */         MainMemory.setI32(paramInt3, i12);
/*     */         
/*     */ 
/*     */         label943:
/*     */         
/*     */ 
/* 364 */         if (MainMemory.getI32(paramInt4) != 204) {
/*     */           break label979;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 375 */         MainMemory.setI32(paramInt4, 0);
/* 376 */         i15 = 1;
/*     */         
/*     */ 
/*     */ 
/*     */         label979:
/*     */         
/*     */ 
/* 383 */         i14 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 394 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgknjj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */