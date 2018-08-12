/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp9Detection10calcFluxesEPfPl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 833;
/*  14 */   public static final Function _instance = new _ZN7duchamp9Detection10calcFluxesEPfPl();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp9Detection10calcFluxesEPfPl() { super("_ZN7duchamp9Detection10calcFluxesEPfPl", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*  54 */     int i7 = 0;
/*  55 */     int i8 = 0;
/*  56 */     int i9 = 0;
/*  57 */     int i10 = 0;
/*  58 */     int i11 = 0;
/*  59 */     float f1 = 0.0F;
/*  60 */     float f2 = 0.0F;
/*  61 */     int i12 = 0;
/*  62 */     int i13 = 0;
/*  63 */     int i14 = 0;
/*     */     
/*     */ 
/*  66 */     int i15 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  70 */       i = MainMemory.alloc(12);
/*  71 */       j = paramInt1 + 96;
/*  72 */       MainMemory.setF32(j, 0.0F);
/*  73 */       k = paramInt1 + 84;
/*  74 */       MainMemory.setF32(k, 0.0F);
/*  75 */       m = paramInt1 + 124;
/*  76 */       MainMemory.setF32(m, 0.0F);
/*  77 */       n = paramInt1 + 120;
/*  78 */       MainMemory.setF32(n, 0.0F);
/*  79 */       i1 = paramInt1 + 116;
/*  80 */       MainMemory.setF32(i1, 0.0F);
/*  81 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(i, paramInt1);
/*  82 */       i2 = MainMemory.getI32(i);
/*  83 */       i3 = paramInt1 + 100;
/*  84 */       i4 = paramInt1 + 104;
/*  85 */       i5 = paramInt1 + 108;
/*  86 */       i6 = paramInt1 + 132;
/*  87 */       i7 = MainMemory.getI32(i + 4);
/*  88 */       i8 = paramInt3 + 4;
/*  89 */       i13 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  96 */         i14 = i2 + i13 * 20;
/*  97 */         if (!MathUtils.ult(i14, i7)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         i9 = MainMemory.getI32(i2 + i13 * 20 + 4);
/* 108 */         i10 = MainMemory.getI32(i2 + i13 * 20 + 8);
/* 109 */         i11 = MainMemory.getI32(i2 + i13 * 20 + 12);
/* 110 */         f1 = MainMemory.getF32(paramInt2 + (_ZN9PixelInfo5Voxel10arrayIndexEPl.call(i9, i10, i11, MainMemory.getI32(paramInt3), MainMemory.getI32(i8)) << 2));
/* 111 */         f2 = MainMemory.getF32(k) + f1;
/* 112 */         MainMemory.setF32(k, f2);
/* 113 */         f2 = i9;
/* 114 */         f2 *= f1;
/* 115 */         f2 = MainMemory.getF32(i1) + f2;
/* 116 */         MainMemory.setF32(i1, f2);
/* 117 */         f2 = i10;
/* 118 */         f2 *= f1;
/* 119 */         f2 = MainMemory.getF32(n) + f2;
/* 120 */         MainMemory.setF32(n, f2);
/* 121 */         f2 = i11;
/* 122 */         f2 *= f1;
/* 123 */         f2 = MainMemory.getF32(m) + f2;
/* 124 */         MainMemory.setF32(m, f2);
/* 125 */         if (i14 != i2)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */           i12 = MainMemory.getI8(i6) == 0 ? 1 : 0;
/* 136 */           if (i12 == 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */             if (MathUtils.f_ogt(MainMemory.getF32(j), f1)) {
/*     */               break label519;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */             if (i12 == 0) {
/*     */               break label552;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */           if (!MathUtils.f_olt(MainMemory.getF32(j), f1)) {
/*     */             break label552;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label519:
/*     */         
/*     */ 
/* 176 */         MainMemory.setF32(j, f1);
/* 177 */         MainMemory.setI32(i3, i9);
/* 178 */         MainMemory.setI32(i4, i10);
/* 179 */         MainMemory.setI32(i5, i11);
/*     */         
/*     */ 
/*     */         label552:
/*     */         
/*     */ 
/* 185 */         i13 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 191 */       f1 = MainMemory.getF32(k);
/* 192 */       f2 = MainMemory.getF32(i1) / f1;
/* 193 */       MainMemory.setF32(i1, f2);
/* 194 */       f2 = MainMemory.getF32(n) / f1;
/* 195 */       MainMemory.setF32(n, f2);
/* 196 */       f1 = MainMemory.getF32(m) / f1;
/* 197 */       MainMemory.setF32(m, f1);
/* 198 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 209 */       MainMemory.dealloc_generated(i15);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection10calcFluxesEPfPl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */