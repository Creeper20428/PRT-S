/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
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
/*     */ public final class ffhist2
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3465;
/*  23 */   public static final Function _instance = new ffhist2();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public ffhist2() { super("ffhist2", 16, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, double paramDouble, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  30 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramDouble, paramInt12, paramInt13, paramInt14, paramInt15);
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  70 */     paramInt4 += 2;
/*  71 */     paramInt3--;
/*  72 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  73 */     paramInt4 += 2;
/*  74 */     paramInt3--;
/*  75 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  76 */     paramInt4 += 2;
/*  77 */     paramInt3--;
/*  78 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  79 */     paramInt4 += 2;
/*  80 */     paramInt3--;
/*  81 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  82 */     paramInt4 += 2;
/*  83 */     paramInt3--;
/*  84 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, d, i7, i8, i9, i10);
/*  85 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, double paramDouble, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  91 */     int i = 0;
/*  92 */     int j = 0;
/*  93 */     int k = 0;
/*  94 */     int m = 0;
/*  95 */     int n = 0;
/*  96 */     int i1 = 0;
/*  97 */     int i2 = 0;
/*  98 */     int i3 = 0;
/*  99 */     int i4 = 0;
/* 100 */     int i5 = 0;
/* 101 */     int i6 = 0;
/* 102 */     float f = 0.0F;
/* 103 */     boolean bool = false;
/*     */     
/*     */ 
/* 106 */     int i7 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/* 110 */       i = MainMemory.alloc(71);
/* 111 */       j = MainMemory.alloc(4);
/* 112 */       k = MainMemory.alloc(16);
/* 113 */       m = MainMemory.alloc(4);
/* 114 */       n = MainMemory.alloc(16);
/* 115 */       i1 = MainMemory.alloc(16);
/* 116 */       i2 = MainMemory.alloc(16);
/* 117 */       i3 = MainMemory.alloc(16);
/* 118 */       i4 = MainMemory.alloc(4);
/* 119 */       if (MainMemory.getI32(paramInt15) <= 0) {
/*     */         break label135;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label981;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label135:
/*     */       
/*     */ 
/*     */ 
/* 135 */       if (paramInt4 <= 4) {
/*     */         break label177;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */       ffxmsg.call(5, 86432);
/* 146 */       MainMemory.setI32(paramInt15, 320);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label177:
/*     */       
/* 153 */       i5 = MainMemory.getI32(paramInt1);
/* 154 */       i6 = MainMemory.getI32(i5);
/* 155 */       if (i6 != MainMemory.getI32(MainMemory.getI32(i5 + 4) + 64))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         ffmahd.call(i5, i6 + 1, 0, paramInt15);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 171 */       switch (paramInt3) {
/* 172 */       case 11:  paramInt3 = 8;
/*     */         break label382;
/*     */         break;
/*     */       case 21: 
/*     */         break label374;
/*     */         break;
/*     */       case 31: 
/*     */         break label361;
/*     */         break;
/*     */       case 42: 
/*     */         break label348;
/*     */         break;
/*     */       case 82: 
/*     */         break; }
/* 186 */       paramInt3 = -64;
/*     */       
/*     */       break label382;
/*     */       
/*     */       label348:
/* 191 */       paramInt3 = -32;
/*     */       
/*     */       break label382;
/*     */       
/*     */       label361:
/* 196 */       paramInt3 = 32;
/*     */       
/*     */       break label382;
/*     */       
/*     */       label374:
/* 201 */       paramInt3 = 16;
/*     */       
/*     */ 
/*     */ 
/*     */       label382:
/*     */       
/*     */ 
/* 208 */       if (fits_calc_binning.call(MainMemory.getI32(paramInt1), paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, k, n, i1, i2, i3, paramInt15) <= 0) {
/*     */         break label448;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */       ffxmsg.call(5, 90080);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label448:
/*     */       
/* 225 */       if (MainMemory.getI8(paramInt12) != 0) {
/*     */         break label491;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */       f = (float)paramDouble;
/* 236 */       MainMemory.setF32(i4, f);
/*     */       
/*     */       break label535;
/*     */       
/*     */       label491:
/*     */       
/* 242 */       if (ffgky.call(MainMemory.getI32(paramInt1), 42, paramInt12, i4, 0, paramInt15) != 0) {
/*     */         break label618;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 252 */       f = MainMemory.getF32(i4);
/*     */       
/*     */ 
/*     */ 
/*     */       label535:
/*     */       
/*     */ 
/*     */ 
/* 260 */       bool = MathUtils.f_une(f, -9.119119840596153E-36D);
/* 261 */       if ((!MathUtils.f_ole(f, 0.0D)) || (!bool)) {
/*     */         break label597;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 271 */       ffxmsg.call(5, 101984);
/* 272 */       MainMemory.setI32(paramInt15, 125);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label597:
/*     */       
/* 279 */       ffhist2_1070.call(i4, f, paramInt13, bool);
/*     */       
/*     */       break label695;
/*     */       
/*     */       label618:
/* 284 */       MainMemory.setI32(paramInt15, 0);
/* 285 */       ffgcnn.call(MainMemory.getI32(paramInt1), 0, paramInt12, i, m, paramInt15);
/* 286 */       if (MainMemory.getI32(paramInt15) <= 0) {
/*     */         break label683;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 296 */       ffxmsg.call(5, 124384);
/* 297 */       ffxmsg.call(5, paramInt12);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label683:
/*     */       
/* 304 */       MainMemory.setF32(i4, -9.11912E-36F);
/*     */       
/*     */ 
/*     */       label695:
/*     */       
/*     */ 
/* 310 */       if (ffinit.call(j, paramInt2, paramInt15) <= 0) {
/*     */         break label735;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 320 */       ffxmsg.call(5, 108896);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label735:
/*     */       
/* 327 */       if (ffcrim.call(MainMemory.getI32(j), paramInt3, paramInt4, n, paramInt15) <= 0) {
/*     */         break label781;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */       ffxmsg.call(5, 102048);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label781:
/*     */       
/* 344 */       if (fits_copy_pixlist2image.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), k, paramInt15) <= 0) {
/*     */         break label829;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 354 */       ffxmsg.call(5, 129120);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label829:
/*     */       
/* 361 */       fits_write_keys_histo.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt4, k, MainMemory.getI32(paramInt15));
/* 362 */       fits_rebin_wcs.call(MainMemory.getI32(j), paramInt4, i1, i3, MainMemory.getI32(paramInt15));
/* 363 */       if (fits_make_hist.call(MainMemory.getI32(paramInt1), MainMemory.getI32(j), paramInt3, paramInt4, n, k, i1, i2, i3, MainMemory.getF32(i4), MainMemory.getI32(m), paramInt13, paramInt14, paramInt15) <= 0) {
/*     */         break label939;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 373 */       ffxmsg.call(5, 93664);
/*     */       
/*     */ 
/*     */       break label981;
/*     */       
/*     */       label939:
/*     */       
/* 380 */       ffclos.call(MainMemory.getI32(paramInt1), paramInt15);
/* 381 */       MainMemory.setI32(paramInt1, MainMemory.getI32(j));
/*     */       
/*     */ 
/*     */ 
/*     */       break label981;
/*     */       
/*     */ 
/* 388 */       MainMemory.setI32(paramInt15, 410);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label981:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 399 */       MainMemory.dealloc_generated(i7);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffhist2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */