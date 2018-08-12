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
/*     */ public final class ffibin
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3152;
/*  19 */   public static final Function _instance = new ffibin();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public ffibin() { super("ffibin", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  26 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i1 = call(i, j, k, m, n);
/*  47 */     paramFrame.setI32(paramInt1, i1);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  53 */     int i = 0;
/*     */     
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*  64 */     int i6 = 0;
/*  65 */     long l = 0L;
/*  66 */     int i7 = 0;
/*  67 */     int i8 = 0;
/*  68 */     int i9 = 0;
/*  69 */     int i10 = 0;
/*  70 */     int i11 = 0;
/*  71 */     int i12 = 0;
/*     */     
/*     */ 
/*  74 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  78 */       j = MainMemory.alloc(4);
/*  79 */       k = MainMemory.alloc(4);
/*  80 */       m = MainMemory.alloc(4);
/*  81 */       n = MainMemory.alloc(81);
/*  82 */       i1 = MainMemory.alloc(71);
/*  83 */       i5 = MainMemory.getI32(paramInt5);
/*  84 */       if (i5 <= 0) {
/*     */         break label130;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       i = i5;
/*     */       
/*     */ 
/*     */       break label1085;
/*     */       
/*     */       label130:
/*     */       
/* 101 */       MainMemory.setI8(i1, (byte)0);
/* 102 */       i5 = MainMemory.getI32(paramInt1);
/* 103 */       i2 = paramInt1 + 4;
/* 104 */       i3 = MainMemory.getI32(i2);
/* 105 */       i6 = MainMemory.getI32(i3 + 64);
/* 106 */       if (i5 == i6) {
/* 107 */         i5 = i6;
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
/* 118 */         ffmahd.call(paramInt1, i5 + 1, 0, paramInt5);
/* 119 */         i3 = MainMemory.getI32(i2);
/* 120 */         i5 = MainMemory.getI32(i3 + 64);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */       i6 = MainMemory.getI32(i3 + 76);
/* 131 */       i11 = MainMemory.getI32(i3 + 84);
/* 132 */       if (MainMemory.getI64(i3 + 88) != MainMemory.getI64(i11 + (i5 << 3)))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         if (i5 != i6) {
/*     */           break label356;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         if (MainMemory.getI64(i11 + (i6 + 1 << 3)) < MainMemory.getI64(i3 + 32)) {}
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 162 */         ffcrtb.call(paramInt1, 2, 0L, paramInt2, paramInt3, paramInt4, 0, i1, paramInt5);
/* 163 */         i = MainMemory.getI32(paramInt5);
/*     */         
/*     */         break label1085;
/*     */       }
/*     */       
/*     */       label356:
/*     */       
/* 170 */       if (!MathUtils.ugt(paramInt2, 999)) {
/*     */         break label427;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */       SystemLibrary.sprintf(n, 89120, new Object[] { Integer.valueOf(paramInt2) });
/* 181 */       ffxmsg.call(5, n);
/* 182 */       MainMemory.setI32(paramInt5, 216);
/* 183 */       i = 216;
/*     */       
/*     */ 
/*     */       break label1085;
/*     */       
/*     */       label427:
/*     */       
/* 190 */       i4 = paramInt2 > 0 ? 1 : 0;
/* 191 */       if (i4 != 0) {
/* 192 */         i5 = 0;
/*     */       } else {
/*     */         break label484;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 203 */         i5 += 1;
/* 204 */         if (i5 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label484:
/*     */       
/*     */ 
/*     */ 
/* 215 */       i5 = ((paramInt2 << 1) + 44 | (MainMemory.getI8(i1) != 0 ? 1 : 0)) / 36;
/* 216 */       if (i4 != 0) {
/* 217 */         i6 = 0;
/*     */       } else {
/*     */         break label588;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 229 */         ffbnfm.call(MainMemory.getI32(paramInt4 + (i6 << 2)), j, k, m, paramInt5);
/* 230 */         i6 += 1;
/* 231 */         if (i6 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       i3 = MainMemory.getI32(i2);
/*     */       
/*     */ 
/*     */ 
/*     */       label588:
/*     */       
/*     */ 
/*     */ 
/* 250 */       if (MainMemory.getI32(i3 + 72) != 1) {
/*     */         break label1069;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 260 */       ffrdef.call(paramInt1, paramInt5);
/* 261 */       ffpdfl.call(paramInt1, paramInt5);
/* 262 */       i3 = MainMemory.getI32(i2);
/* 263 */       i6 = MainMemory.getI32(i3 + 64) + 1;
/* 264 */       l = MainMemory.getI64(MainMemory.getI32(i3 + 84) + (i6 << 3));
/* 265 */       MainMemory.setI32(i3 + 68, 2);
/* 266 */       if (ffiblk.call(paramInt1, i5, 1, paramInt5) <= 0) {
/*     */         break label714;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 276 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       break label1085;
/*     */       
/*     */       label714:
/*     */       
/* 283 */       j = MainMemory.getI32(i2) + 76;
/* 284 */       MainMemory.setI32(j, MainMemory.getI32(j) + 1);
/* 285 */       i3 = MainMemory.getI32(i2);
/* 286 */       i7 = MainMemory.getI32(i3 + 76);
/* 287 */       i11 = MainMemory.getI32(i3 + 84);
/* 288 */       if (MainMemory.getI32(i3 + 64) >= i7) {
/*     */         break label888;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */       i8 = i7 + 1;
/* 300 */       i9 = i7 + -1;
/* 301 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 310 */         MainMemory.setI64(i11 + (i8 - i10 << 3), MainMemory.getI64(i11 + (i7 - i10 << 3)));
/* 311 */         i3 = MainMemory.getI32(i2);
/* 312 */         i11 = MainMemory.getI32(i3 + 84);
/* 313 */         i12 = i10 + 1;
/* 314 */         if (MainMemory.getI32(i3 + 64) >= i9 - i10) break;
/* 315 */         i10 = i12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label888:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 328 */       MainMemory.setI64(i11 + (i6 << 3), l);
/* 329 */       MainMemory.setI32(MainMemory.getI32(i2) + 64, i6);
/* 330 */       MainMemory.setI32(paramInt1, i6);
/* 331 */       i3 = MainMemory.getI32(i2);
/* 332 */       MainMemory.setI64(i3 + 104, MainMemory.getI64(MainMemory.getI32(i3 + 84) + (i6 << 3)));
/* 333 */       i3 = MainMemory.getI32(i2);
/* 334 */       MainMemory.setI64(i3 + 88, MainMemory.getI64(MainMemory.getI32(i3 + 84) + (i6 << 3)));
/* 335 */       i3 = MainMemory.getI32(i2);
/* 336 */       MainMemory.setI64(i3 + 112, MainMemory.getI64(MainMemory.getI32(i3 + 84) + (i6 << 3)) + i5 * 2880);
/* 337 */       MainMemory.setI32(MainMemory.getI32(i2) + 68, 2);
/* 338 */       ffphbn.call(paramInt1, 0L, paramInt2, paramInt3, paramInt4, 0, i1, paramInt5);
/* 339 */       ffrdef.call(paramInt1, paramInt5);
/* 340 */       i = MainMemory.getI32(paramInt5);
/*     */       
/*     */ 
/*     */       break label1085;
/*     */       
/*     */       label1069:
/*     */       
/* 347 */       MainMemory.setI32(paramInt5, 112);
/* 348 */       i = 112;
/*     */       
/*     */ 
/*     */       label1085:
/*     */       
/*     */ 
/* 354 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 359 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffibin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */