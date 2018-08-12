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
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object3D10addOffsetsElll
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 374;
/*  18 */   public static final Function _instance = new _ZN9PixelInfo8Object3D10addOffsetsElll();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN9PixelInfo8Object3D10addOffsetsElll() { super("_ZN9PixelInfo8Object3D10addOffsetsElll", 4, false); }
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
/*  67 */     int i13 = 0;
/*  68 */     int i14 = 0;
/*  69 */     int i15 = 0;
/*  70 */     float f = 0.0F;
/*     */     
/*     */ 
/*  73 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  77 */       i = MainMemory.alloc(48);
/*  78 */       j = MainMemory.alloc(8);
/*  79 */       k = MainMemory.alloc(24);
/*  80 */       m = MainMemory.alloc(48);
/*  81 */       MainMemory.setI8(k, (byte)0);
/*  82 */       n = k + 4;
/*  83 */       i1 = k + 8;
/*  84 */       i3 = k + 12;
/*  85 */       i2 = k + 16;
/*  86 */       MainMemory.setI32(k + 20, 0);
/*  87 */       MainMemory.setI32(n, 0);
/*  88 */       MainMemory.setI32(i1, 0);
/*  89 */       i4 = k + 4;
/*  90 */       MainMemory.setI32(i3, i4);
/*  91 */       MainMemory.setI32(i2, i4);
/*  92 */       i3 = paramInt1 + 16;
/*  93 */       i12 = MainMemory.getI32(i3);
/*  94 */       i4 = paramInt1 + 8;
/*  95 */       i5 = m + 4;
/*  96 */       i6 = i + 4;
/*  97 */       i7 = i + 4;
/*  98 */       i8 = i + 8;
/*  99 */       i9 = m + 4;
/* 100 */       i10 = m + 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 108 */         if (i12 != i4) {
/*     */           break label568;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         i2 = paramInt1 + 12;
/* 119 */         _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E.call(MainMemory.getI32(i2));
/* 120 */         i13 = paramInt1 + 4;
/* 121 */         MainMemory.setI32(i3, i4);
/* 122 */         MainMemory.setI32(i2, 0);
/* 123 */         MainMemory.setI32(paramInt1 + 20, i4);
/* 124 */         MainMemory.setI32(paramInt1 + 24, 0);
/* 125 */         _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EEaSERKSA_.call(i13, k);
/* 126 */         i14 = MainMemory.getI32(paramInt1 + 28);
/* 127 */         if (i14 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */           i15 = paramInt1 + 32;
/* 138 */           f = (float)(i14 * paramInt2 & 0xFFFFFFFF);
/* 139 */           f = MainMemory.getF32(i15) + f;
/* 140 */           MainMemory.setF32(i15, f);
/* 141 */           n = paramInt1 + 44;
/* 142 */           MainMemory.setI32(n, MainMemory.getI32(n) + paramInt2);
/* 143 */           n = paramInt1 + 48;
/* 144 */           MainMemory.setI32(n, MainMemory.getI32(n) + paramInt2);
/* 145 */           i15 = paramInt1 + 36;
/* 146 */           f = (float)(i14 * paramInt3 & 0xFFFFFFFF);
/* 147 */           f = MainMemory.getF32(i15) + f;
/* 148 */           MainMemory.setF32(i15, f);
/* 149 */           n = paramInt1 + 52;
/* 150 */           MainMemory.setI32(n, MainMemory.getI32(n) + paramInt3);
/* 151 */           n = paramInt1 + 56;
/* 152 */           MainMemory.setI32(n, MainMemory.getI32(n) + paramInt3);
/* 153 */           i15 = paramInt1 + 40;
/* 154 */           f = (float)(i14 * paramInt4 & 0xFFFFFFFF);
/* 155 */           f = MainMemory.getF32(i15) + f;
/* 156 */           MainMemory.setF32(i15, f);
/* 157 */           n = paramInt1 + 60;
/* 158 */           MainMemory.setI32(n, MainMemory.getI32(n) + paramInt4);
/* 159 */           n = paramInt1 + 64;
/* 160 */           MainMemory.setI32(n, MainMemory.getI32(n) + paramInt4);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 166 */         _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E.call(MainMemory.getI32(i1));
/* 167 */         break;
/*     */         
/*     */ 
/*     */         label568:
/*     */         
/*     */ 
/* 173 */         i11 = i12 + 20;
/* 174 */         MainMemory.setI32(m, MainMemory.getI32(i12 + 16) + paramInt4);
/* 175 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(i5, i11);
/* 176 */         _ZN9PixelInfo8Object2D10addOffsetsEll.call(i5, paramInt2, paramInt3);
/* 177 */         MainMemory.setI32(i, MainMemory.getI32(m));
/* 178 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(i6, i5);
/* 179 */         _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_.call(j, k, i);
/* 180 */         MainMemory.setI32(i7, 12936);
/* 181 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i8);
/* 182 */         MainMemory.setI32(i9, 12936);
/* 183 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i10);
/* 184 */         i12 = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i12);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 194 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D10addOffsetsElll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */