/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object3D10addChannelERKlRNS_8Object2DE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 444;
/*  17 */   public static final Function _instance = new _ZN9PixelInfo8Object3D10addChannelERKlRNS_8Object2DE();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN9PixelInfo8Object3D10addChannelERKlRNS_8Object2DE() { super("_ZN9PixelInfo8Object3D10addChannelERKlRNS_8Object2DE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     call(paramInt1, paramInt2, paramInt3);
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
/*  39 */     call(i, j, k);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     int i12 = 0;
/*  63 */     int i13 = 0;
/*  64 */     float f = 0.0F;
/*  65 */     int i14 = 0;
/*  66 */     int i15 = 0;
/*     */     
/*     */ 
/*  69 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       i = MainMemory.alloc(44);
/*  74 */       j = MainMemory.alloc(44);
/*  75 */       k = MainMemory.alloc(44);
/*  76 */       m = MainMemory.alloc(48);
/*  77 */       n = MainMemory.alloc(48);
/*  78 */       i1 = MainMemory.alloc(8);
/*  79 */       i3 = MainMemory.getI32(paramInt1 + 16);
/*  80 */       i2 = paramInt1 + 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  88 */         i4 = i3 == i2 ? 1 : 0;
/*  89 */         if (i4 == 0) {
/*     */           break label176;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         i6 = MainMemory.getI32(paramInt2);
/*     */         
/*     */         break label226;
/*     */         
/*     */         label176:
/*     */         
/* 105 */         i6 = MainMemory.getI32(paramInt2);
/* 106 */         if (MainMemory.getI32(i3 + 16) != i6) {
/*     */           break label1425;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         if (i4 == 0) {
/*     */           break label901;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label226:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 128 */         MainMemory.setI32(m, i6);
/* 129 */         i = m + 4;
/* 130 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(i, paramInt3);
/* 131 */         MainMemory.setI32(n, MainMemory.getI32(m));
/* 132 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(n + 4, i);
/* 133 */         _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_.call(i1, paramInt1 + 4, n);
/* 134 */         MainMemory.setI32(n + 4, 12936);
/* 135 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(n + 8);
/* 136 */         MainMemory.setI32(m + 4, 12936);
/* 137 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(m + 8);
/* 138 */         i5 = paramInt1 + 28;
/* 139 */         i6 = MainMemory.getI32(i5);
/* 140 */         i7 = MainMemory.getI32(paramInt3 + 28);
/* 141 */         i14 = paramInt1 + 44;
/* 142 */         if (i6 != 0) {
/*     */           break label493;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         MainMemory.setI32(i14, i7);
/* 153 */         MainMemory.setI32(paramInt1 + 48, MainMemory.getI32(paramInt3 + 32));
/* 154 */         MainMemory.setI32(paramInt1 + 52, MainMemory.getI32(paramInt3 + 36));
/* 155 */         MainMemory.setI32(paramInt1 + 56, MainMemory.getI32(paramInt3 + 40));
/* 156 */         i7 = MainMemory.getI32(paramInt2);
/* 157 */         MainMemory.setI32(paramInt1 + 64, i7);
/* 158 */         MainMemory.setI32(paramInt1 + 60, i7);
/* 159 */         MainMemory.setF32(paramInt1 + 32, MainMemory.getF32(paramInt3 + 20));
/* 160 */         MainMemory.setF32(paramInt1 + 36, MainMemory.getF32(paramInt3 + 24));
/* 161 */         f = (float)(MainMemory.getI32(paramInt3 + 16) * MainMemory.getI32(paramInt2) & 0xFFFFFFFF);
/* 162 */         MainMemory.setF32(paramInt1 + 40, f);
/*     */         
/*     */         break label876;
/*     */         
/*     */         label493:
/* 167 */         if (i7 >= MainMemory.getI32(i14)) {
/*     */           break label528;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         MainMemory.setI32(i14, i7);
/*     */         
/*     */ 
/*     */         label528:
/*     */         
/*     */ 
/* 183 */         i7 = MainMemory.getI32(paramInt3 + 32);
/* 184 */         i14 = paramInt1 + 48;
/* 185 */         if (i7 <= MainMemory.getI32(i14)) {
/*     */           break label578;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         MainMemory.setI32(i14, i7);
/*     */         
/*     */ 
/*     */         label578:
/*     */         
/*     */ 
/* 201 */         i7 = MainMemory.getI32(paramInt3 + 36);
/* 202 */         i14 = paramInt1 + 52;
/* 203 */         if (i7 >= MainMemory.getI32(i14)) {
/*     */           break label628;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 213 */         MainMemory.setI32(i14, i7);
/*     */         
/*     */ 
/*     */         label628:
/*     */         
/*     */ 
/* 219 */         i7 = MainMemory.getI32(paramInt3 + 40);
/* 220 */         i14 = paramInt1 + 56;
/* 221 */         if (i7 <= MainMemory.getI32(i14)) {
/*     */           break label678;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */         MainMemory.setI32(i14, i7);
/*     */         
/*     */ 
/*     */         label678:
/*     */         
/*     */ 
/* 237 */         i7 = MainMemory.getI32(paramInt2);
/* 238 */         i14 = paramInt1 + 60;
/* 239 */         if (i7 >= MainMemory.getI32(i14)) {
/*     */           break label731;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 250 */         MainMemory.setI32(i14, i7);
/* 251 */         i7 = MainMemory.getI32(paramInt2);
/*     */         
/*     */ 
/*     */ 
/*     */         label731:
/*     */         
/*     */ 
/*     */ 
/* 259 */         i14 = paramInt1 + 64;
/* 260 */         if (i7 <= MainMemory.getI32(i14)) {
/*     */           break label772;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 270 */         MainMemory.setI32(i14, i7);
/*     */         
/*     */ 
/*     */         label772:
/*     */         
/*     */ 
/* 276 */         i12 = paramInt1 + 32;
/* 277 */         f = MainMemory.getF32(i12) + MainMemory.getF32(paramInt3 + 20);
/* 278 */         MainMemory.setF32(i12, f);
/* 279 */         i12 = paramInt1 + 36;
/* 280 */         f = MainMemory.getF32(i12) + MainMemory.getF32(paramInt3 + 24);
/* 281 */         MainMemory.setF32(i12, f);
/* 282 */         i12 = paramInt1 + 40;
/* 283 */         f = (float)(MainMemory.getI32(paramInt3 + 16) * MainMemory.getI32(paramInt2) & 0xFFFFFFFF);
/* 284 */         f = MainMemory.getF32(i12) + f;
/* 285 */         MainMemory.setF32(i12, f);
/*     */         
/*     */ 
/*     */         label876:
/*     */         
/*     */ 
/* 291 */         MainMemory.setI32(i5, MainMemory.getI32(paramInt3 + 16) + i6);
/* 292 */         break;
/*     */         
/*     */ 
/*     */         label901:
/*     */         
/*     */ 
/* 298 */         i8 = paramInt1 + 32;
/* 299 */         i9 = i3 + 40;
/* 300 */         f = MainMemory.getF32(i8) - MainMemory.getF32(i9);
/* 301 */         MainMemory.setF32(i8, f);
/* 302 */         i10 = paramInt1 + 36;
/* 303 */         i11 = i3 + 44;
/* 304 */         f = MainMemory.getF32(i10) - MainMemory.getF32(i11);
/* 305 */         MainMemory.setF32(i10, f);
/* 306 */         i12 = paramInt1 + 40;
/* 307 */         i13 = i3 + 20;
/* 308 */         i5 = i13 + 16;
/* 309 */         f = (float)(MainMemory.getI32(i5) * MainMemory.getI32(paramInt2) & 0xFFFFFFFF);
/* 310 */         f = MainMemory.getF32(i12) - f;
/* 311 */         MainMemory.setF32(i12, f);
/* 312 */         i14 = paramInt1 + 28;
/* 313 */         MainMemory.setI32(i14, MainMemory.getI32(i14) - MainMemory.getI32(i5));
/* 314 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(j, paramInt3);
/* 315 */         i15 = i13;
/* 316 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(i, i15);
/* 317 */         _ZN9PixelInfoplENS_8Object2DES0_.call(k, i, MainMemory.getI32(j + 4), MainMemory.getI32(j + 8));
/* 318 */         _ZN9PixelInfo8Object2DaSERKS0_.call(i15, k);
/* 319 */         MainMemory.setI32(k, 12936);
/* 320 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(k + 4);
/* 321 */         MainMemory.setI32(i, 12936);
/* 322 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i + 4);
/* 323 */         MainMemory.setI32(j, 12936);
/* 324 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(j + 4);
/* 325 */         f = MainMemory.getF32(i8) + MainMemory.getF32(i9);
/* 326 */         MainMemory.setF32(i8, f);
/* 327 */         f = MainMemory.getF32(i10) + MainMemory.getF32(i11);
/* 328 */         MainMemory.setF32(i10, f);
/* 329 */         f = (float)(MainMemory.getI32(i5) * MainMemory.getI32(paramInt2) & 0xFFFFFFFF);
/* 330 */         f = MainMemory.getF32(i12) + f;
/* 331 */         MainMemory.setF32(i12, f);
/* 332 */         MainMemory.setI32(i14, MainMemory.getI32(i5) + MainMemory.getI32(i14));
/* 333 */         i6 = MainMemory.getI32(paramInt3 + 28);
/* 334 */         paramInt2 = paramInt1 + 44;
/* 335 */         if (i6 >= MainMemory.getI32(paramInt2)) {
/*     */           break label1269;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 345 */         MainMemory.setI32(paramInt2, i6);
/*     */         
/*     */ 
/*     */         label1269:
/*     */         
/*     */ 
/* 351 */         i6 = MainMemory.getI32(paramInt3 + 32);
/* 352 */         paramInt2 = paramInt1 + 48;
/* 353 */         if (i6 <= MainMemory.getI32(paramInt2)) {
/*     */           break label1316;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 363 */         MainMemory.setI32(paramInt2, i6);
/*     */         
/*     */ 
/*     */         label1316:
/*     */         
/*     */ 
/* 369 */         i6 = MainMemory.getI32(paramInt3 + 36);
/* 370 */         paramInt2 = paramInt1 + 52;
/* 371 */         if (i6 >= MainMemory.getI32(paramInt2)) {
/*     */           break label1363;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 381 */         MainMemory.setI32(paramInt2, i6);
/*     */         
/*     */ 
/*     */         label1363:
/*     */         
/*     */ 
/* 387 */         i6 = MainMemory.getI32(paramInt3 + 40);
/* 388 */         paramInt2 = paramInt1 + 56;
/* 389 */         if (i6 <= MainMemory.getI32(paramInt2)) {
/*     */           break label1415;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 399 */         MainMemory.setI32(paramInt2, i6);
/* 400 */         break;
/*     */         
/*     */ 
/*     */         label1415:
/*     */         
/*     */ 
/* 406 */         break;
/*     */         
/*     */ 
/*     */         label1425:
/*     */         
/*     */ 
/* 412 */         i3 = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 422 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D10addChannelERKlRNS_8Object2DE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */