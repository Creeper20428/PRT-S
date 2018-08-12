/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object3D8addPixelElll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 373;
/*  18 */   public static final Function _instance = new _ZN9PixelInfo8Object3D8addPixelElll();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN9PixelInfo8Object3D8addPixelElll() { super("_ZN9PixelInfo8Object3D8addPixelElll", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  26 */     return 0;
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
/*  43 */     call(i, j, k, m);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*  58 */     int i4 = 0;
/*  59 */     int i5 = 0;
/*  60 */     int i6 = 0;
/*  61 */     int i7 = 0;
/*  62 */     int i8 = 0;
/*  63 */     int i9 = 0;
/*  64 */     int i10 = 0;
/*  65 */     int i11 = 0;
/*  66 */     int i12 = 0;
/*  67 */     float f = 0.0F;
/*  68 */     int i13 = 0;
/*     */     
/*     */ 
/*  71 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  75 */       i = MainMemory.alloc(4);
/*  76 */       j = MainMemory.alloc(4);
/*  77 */       k = MainMemory.alloc(48);
/*  78 */       m = MainMemory.alloc(48);
/*  79 */       n = MainMemory.alloc(8);
/*  80 */       i1 = MainMemory.alloc(44);
/*  81 */       MainMemory.setI32(i, paramInt2);
/*  82 */       MainMemory.setI32(j, paramInt3);
/*  83 */       i2 = paramInt1 + 16;
/*  84 */       i4 = MainMemory.getI32(i2);
/*  85 */       i3 = paramInt1 + 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  93 */         i5 = i4 == i3 ? 1 : 0;
/*  94 */         if (i5 == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           if (MainMemory.getI32(i4 + 16) != paramInt4) {
/*     */             break label1191;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           if (i5 == 0) {
/*     */             break label775;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         _ZN9PixelInfo8Object2DC1Ev.call(i1);
/* 125 */         _ZN9PixelInfo8Object2D8addPixelERlS1_.call(i1, i, j);
/* 126 */         MainMemory.setI32(k, paramInt4);
/* 127 */         i6 = k + 4;
/* 128 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(i6, i1);
/* 129 */         MainMemory.setI32(m, MainMemory.getI32(k));
/* 130 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(m + 4, i6);
/* 131 */         _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_.call(n, paramInt1 + 4, m);
/* 132 */         MainMemory.setI32(m + 4, 12936);
/* 133 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(m + 8);
/* 134 */         MainMemory.setI32(k + 4, 12936);
/* 135 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(k + 8);
/* 136 */         i7 = paramInt1 + 28;
/* 137 */         paramInt2 = MainMemory.getI32(i7);
/* 138 */         if (paramInt2 != 0) {
/*     */           break label446;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */         paramInt3 = MainMemory.getI32(i);
/* 149 */         MainMemory.setI32(paramInt1 + 48, paramInt3);
/* 150 */         MainMemory.setI32(paramInt1 + 44, paramInt3);
/* 151 */         f = paramInt3;
/* 152 */         MainMemory.setF32(paramInt1 + 32, f);
/* 153 */         paramInt3 = MainMemory.getI32(j);
/* 154 */         MainMemory.setI32(paramInt1 + 56, paramInt3);
/* 155 */         MainMemory.setI32(paramInt1 + 52, paramInt3);
/* 156 */         f = paramInt3;
/* 157 */         MainMemory.setF32(paramInt1 + 36, f);
/* 158 */         MainMemory.setI32(paramInt1 + 64, paramInt4);
/* 159 */         MainMemory.setI32(paramInt1 + 60, paramInt4);
/* 160 */         f = paramInt4;
/* 161 */         MainMemory.setF32(paramInt1 + 40, f);
/*     */         
/*     */         break label742;
/*     */         
/*     */         label446:
/*     */         
/* 167 */         i12 = paramInt1 + 32;
/* 168 */         paramInt2 = MainMemory.getI32(i);
/* 169 */         f = paramInt2;
/* 170 */         f = MainMemory.getF32(i12) + f;
/* 171 */         MainMemory.setF32(i12, f);
/* 172 */         i12 = paramInt1 + 36;
/* 173 */         paramInt3 = MainMemory.getI32(j);
/* 174 */         f = paramInt3;
/* 175 */         f = MainMemory.getF32(i12) + f;
/* 176 */         MainMemory.setF32(i12, f);
/* 177 */         i12 = paramInt1 + 40;
/* 178 */         f = paramInt4;
/* 179 */         f = MainMemory.getF32(i12) + f;
/* 180 */         MainMemory.setF32(i12, f);
/* 181 */         j = paramInt1 + 44;
/* 182 */         if (MainMemory.getI32(j) <= paramInt2) {
/*     */           break label578;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */         MainMemory.setI32(j, paramInt2);
/*     */         
/*     */ 
/*     */         label578:
/*     */         
/*     */ 
/* 198 */         j = paramInt1 + 48;
/* 199 */         if (MainMemory.getI32(j) >= paramInt2) {
/*     */           break label617;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */         MainMemory.setI32(j, paramInt2);
/*     */         
/*     */ 
/*     */         label617:
/*     */         
/*     */ 
/* 215 */         j = paramInt1 + 52;
/* 216 */         if (MainMemory.getI32(j) <= paramInt3) {
/*     */           break label656;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 226 */         MainMemory.setI32(j, paramInt3);
/*     */         
/*     */ 
/*     */         label656:
/*     */         
/*     */ 
/* 232 */         j = paramInt1 + 56;
/* 233 */         if (MainMemory.getI32(j) >= paramInt3) {
/*     */           break label695;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 243 */         MainMemory.setI32(j, paramInt3);
/*     */         
/*     */ 
/*     */         label695:
/*     */         
/*     */ 
/* 249 */         MainMemory.setI32(paramInt1 + 60, MainMemory.getI32(MainMemory.getI32(i2) + 16));
/* 250 */         MainMemory.setI32(paramInt1 + 64, MainMemory.getI32(_ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base.call(i3) + 16));
/* 251 */         paramInt2 = MainMemory.getI32(i7);
/*     */         
/*     */ 
/*     */ 
/*     */         label742:
/*     */         
/*     */ 
/*     */ 
/* 259 */         MainMemory.setI32(i7, paramInt2 + 1);
/* 260 */         MainMemory.setI32(i1, 12936);
/* 261 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i1 + 4);
/* 262 */         break;
/*     */         
/*     */ 
/*     */         label775:
/*     */         
/*     */ 
/* 268 */         i8 = paramInt1 + 32;
/* 269 */         i9 = i4 + 40;
/* 270 */         f = MainMemory.getF32(i8) - MainMemory.getF32(i9);
/* 271 */         MainMemory.setF32(i8, f);
/* 272 */         i10 = paramInt1 + 36;
/* 273 */         i11 = i4 + 44;
/* 274 */         f = MainMemory.getF32(i10) - MainMemory.getF32(i11);
/* 275 */         MainMemory.setF32(i10, f);
/* 276 */         i12 = paramInt1 + 40;
/* 277 */         i7 = i4 + 36;
/* 278 */         f = (float)(MainMemory.getI32(i7) * paramInt4 & 0xFFFFFFFF);
/* 279 */         f = MainMemory.getF32(i12) - f;
/* 280 */         MainMemory.setF32(i12, f);
/* 281 */         i13 = paramInt1 + 28;
/* 282 */         MainMemory.setI32(i13, MainMemory.getI32(i13) - MainMemory.getI32(i7));
/* 283 */         _ZN9PixelInfo8Object2D8addPixelERlS1_.call(i4 + 20, i, j);
/* 284 */         MainMemory.setI32(i13, MainMemory.getI32(i7) + MainMemory.getI32(i13));
/* 285 */         f = MainMemory.getF32(i8) + MainMemory.getF32(i9);
/* 286 */         MainMemory.setF32(i8, f);
/* 287 */         f = MainMemory.getF32(i10) + MainMemory.getF32(i11);
/* 288 */         MainMemory.setF32(i10, f);
/* 289 */         f = (float)(MainMemory.getI32(i7) * paramInt4 & 0xFFFFFFFF);
/* 290 */         f = MainMemory.getF32(i12) + f;
/* 291 */         MainMemory.setF32(i12, f);
/* 292 */         i7 = paramInt1 + 44;
/* 293 */         paramInt2 = MainMemory.getI32(i);
/* 294 */         if (MainMemory.getI32(i7) <= paramInt2) {
/*     */           break label1053;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 304 */         MainMemory.setI32(i7, paramInt2);
/*     */         
/*     */ 
/*     */         label1053:
/*     */         
/*     */ 
/* 310 */         i = paramInt1 + 48;
/* 311 */         if (MainMemory.getI32(i) >= paramInt2) {
/*     */           break label1092;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 321 */         MainMemory.setI32(i, paramInt2);
/*     */         
/*     */ 
/*     */         label1092:
/*     */         
/*     */ 
/* 327 */         i = paramInt1 + 52;
/* 328 */         paramInt2 = MainMemory.getI32(j);
/* 329 */         if (MainMemory.getI32(i) <= paramInt2) {
/*     */           break label1137;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 339 */         MainMemory.setI32(i, paramInt2);
/*     */         
/*     */ 
/*     */         label1137:
/*     */         
/*     */ 
/* 345 */         j = paramInt1 + 56;
/* 346 */         if (MainMemory.getI32(j) >= paramInt2) {
/*     */           break label1181;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 356 */         MainMemory.setI32(j, paramInt2);
/* 357 */         break;
/*     */         
/*     */ 
/*     */         label1181:
/*     */         
/*     */ 
/* 363 */         break;
/*     */         
/*     */ 
/*     */         label1191:
/*     */         
/*     */ 
/* 369 */         i4 = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 379 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D8addPixelElll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */