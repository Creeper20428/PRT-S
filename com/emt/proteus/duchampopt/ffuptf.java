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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffuptf
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3245;
/*  22 */   public static final Function _instance = new ffuptf();
/*  23 */   public final Function resolve() { return _instance; }
/*     */   
/*  25 */   public ffuptf() { super("ffuptf", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  29 */     call(paramInt1, paramInt2);
/*  30 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
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
/*  64 */     int i12 = 0;
/*  65 */     int i13 = 0;
/*  66 */     long l1 = 0L;
/*  67 */     int i14 = 0;
/*  68 */     int i15 = 0;
/*  69 */     int i16 = 0;
/*  70 */     long l2 = 0L;
/*  71 */     long l3 = 0L;
/*  72 */     long l4 = 0L;
/*  73 */     long l5 = 0L;
/*  74 */     double d = 0.0D;
/*  75 */     int i17 = 0;
/*  76 */     int i18 = 0;
/*  77 */     int i19 = 0;
/*  78 */     int i20 = 0;
/*     */     
/*     */ 
/*  81 */     int i21 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  85 */       i = MainMemory.alloc(81);
/*  86 */       j = MainMemory.alloc(71);
/*  87 */       k = MainMemory.alloc(4);
/*  88 */       m = MainMemory.alloc(8);
/*  89 */       n = MainMemory.alloc(8);
/*  90 */       i1 = MainMemory.alloc(8);
/*  91 */       i2 = MainMemory.alloc(73);
/*  92 */       i3 = MainMemory.alloc(72);
/*  93 */       i4 = MainMemory.alloc(71);
/*  94 */       i5 = MainMemory.alloc(71);
/*  95 */       i6 = MainMemory.alloc(40);
/*  96 */       i7 = MainMemory.alloc(81);
/*  97 */       i8 = MainMemory.alloc(81);
/*  98 */       i11 = MainMemory.getI32(paramInt1);
/*  99 */       i9 = paramInt1 + 4;
/* 100 */       i10 = MainMemory.getI32(i9);
/* 101 */       i20 = MainMemory.getI32(i10 + 64);
/* 102 */       if (i11 == i20) {
/* 103 */         i11 = i20;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 114 */         ffmahd.call(paramInt1, i11 + 1, 0, paramInt2);
/* 115 */         i10 = MainMemory.getI32(i9);
/* 116 */         i11 = MainMemory.getI32(i10 + 64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */       MainMemory.setI64(i10 + 104, MainMemory.getI64(MainMemory.getI32(i10 + 84) + (i11 << 3)) + 80L);
/* 127 */       i11 = MainMemory.getI32(paramInt2);
/* 128 */       if (i11 <= 0)
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
/* 139 */         MainMemory.setI8(j, (byte)0);
/* 140 */         MainMemory.setI8(i2, (byte)0);
/* 141 */         if (ffgcrd.call(paramInt1, 35712, i, paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */           ffpsvc.call(i, j, i2, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 157 */         ffc2j.call(j, i1, paramInt2);
/* 158 */         i11 = MainMemory.getI32(paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */       if (i11 > 0) {
/* 167 */         i11 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 177 */         MainMemory.setI8(j, (byte)0);
/* 178 */         MainMemory.setI8(i2, (byte)0);
/* 179 */         if (ffgcrd.call(paramInt1, 41248, i, paramInt2) <= 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */           ffpsvc.call(i, j, i2, paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 195 */         ffc2i.call(j, k, paramInt2);
/* 196 */         i11 = MainMemory.getI32(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 204 */       i12 = i4 + 1;
/* 205 */       i13 = i5;
/* 206 */       l1 = MainMemory.getI64(i1);
/* 207 */       i14 = l1 < 1L ? 1 : 0;
/* 208 */       i20 = 1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 215 */         if (i20 <= i11) {
/*     */           break label531;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */         break;
/*     */         
/*     */ 
/*     */         label531:
/*     */         
/*     */ 
/* 231 */         ffkeyn.call(27360, i20, i3, paramInt2);
/* 232 */         i18 = MainMemory.getI32(paramInt2);
/* 233 */         if (i18 <= 0)
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
/* 244 */           MainMemory.setI8(j, (byte)0);
/* 245 */           MainMemory.setI8(i2, (byte)0);
/* 246 */           if (ffgcrd.call(paramInt1, i3, i, paramInt2) <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 256 */             ffpsvc.call(i, j, i2, paramInt2);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 262 */           MainMemory.setI8(i4, (byte)0);
/* 263 */           ffc2s.call(j, i4, paramInt2);
/* 264 */           i18 = MainMemory.getI32(paramInt2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */         if (i18 <= 0) {
/*     */           break label678;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */         SystemLibrary.memcpy(i8, 137088, 68, 1);
/* 283 */         ffxmsg.call(5, i8);
/* 284 */         break;
/*     */         
/*     */ 
/*     */         label678:
/*     */         
/*     */ 
/* 290 */         i15 = MainMemory.getI8(i4);
/* 291 */         if (i15 != 80)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 301 */           i16 = MainMemory.getI8(i12);
/* 302 */           if ((i16 != 80) && (i15 != 81) && (i16 != 81)) {
/*     */             break label1041;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */         if (i14 != 0) {
/* 313 */           d = 0.0D;
/*     */           break label853;
/*     */         } else {
/* 316 */           l2 = 0L;
/* 317 */           l3 = 0L;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 327 */           l4 = l2 + 1L;
/* 328 */           ffgdesll.call(paramInt1, i20, l4, m, n, paramInt2);
/* 329 */           l5 = MainMemory.getI64(m);
/* 330 */           l3 = l5 > l3 ? l5 : l3;
/* 331 */           if (l2 + 2L > l1) {
/*     */             break;
/*     */           }
/*     */           
/* 335 */           l2 = l4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 343 */         d = l3;
/*     */         
/*     */ 
/*     */ 
/*     */         label853:
/*     */         
/*     */ 
/*     */ 
/* 351 */         MainMemory.setI16(i13, (short)39);
/* 352 */         i17 = SystemLibrary.strchr(i4, 40);
/* 353 */         if (i17 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */           MainMemory.setI8(i17, (byte)0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 369 */         SystemLibrary.strcat(i5, i4);
/* 370 */         SystemLibrary.sprintf(i6, 31712, new Object[] { Double.valueOf(d) });
/* 371 */         SystemLibrary.strcat(i5, i6);
/* 372 */         i18 = SystemLibrary.strlen(i5);
/* 373 */         i19 = i5 + i18;
/* 374 */         if (!MathUtils.ult(i18, 9)) {
/*     */           break label1010;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 387 */           MainMemory.setI16(i19, (short)32);
/* 388 */           i18 = SystemLibrary.strlen(i5);
/* 389 */           i19 = i5 + i18;
/* 390 */         } while (MathUtils.ult(i18, 9));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1010:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 403 */         MainMemory.setI16(i19, (short)39);
/* 404 */         ffmkky.call(i3, i5, i2, i7, paramInt2);
/* 405 */         ffmkey.call(paramInt1, i7, paramInt2);
/*     */         
/*     */ 
/*     */         label1041:
/*     */         
/*     */ 
/* 411 */         i20 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 421 */       MainMemory.dealloc_generated(i21);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffuptf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */