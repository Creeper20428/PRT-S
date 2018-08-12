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
/*     */ public final class _ZN9PixelInfo8Object3D13getSpatialMapEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 442;
/*  17 */   public static final Function _instance = new _ZN9PixelInfo8Object3D13getSpatialMapEv();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN9PixelInfo8Object3D13getSpatialMapEv() { super("_ZN9PixelInfo8Object3D13getSpatialMapEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  24 */     call(paramInt1, paramInt2);
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
/*  36 */     call(i, j);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
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
/*     */     
/*     */ 
/*  55 */     int i6 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       i = MainMemory.alloc(44);
/*  60 */       j = MainMemory.alloc(44);
/*  61 */       k = MainMemory.alloc(44);
/*  62 */       _ZN9PixelInfo8Object2DC1Ev.call(paramInt1);
/*  63 */       m = MainMemory.getI32(paramInt2 + 16);
/*  64 */       n = paramInt2 + 8;
/*  65 */       i1 = k + 4;
/*  66 */       i2 = i + 4;
/*  67 */       i3 = j + 4;
/*  68 */       i4 = j + 4;
/*  69 */       i5 = j + 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  77 */         if (m != n) {
/*     */           break label133;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         break;
/*     */         
/*     */ 
/*     */         label133:
/*     */         
/*     */ 
/*  93 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(j, m + 20);
/*  94 */         _ZN9PixelInfo8Object2DC1ERKS0_.call(i, paramInt1);
/*  95 */         _ZN9PixelInfoplENS_8Object2DES0_.call(k, i, MainMemory.getI32(i4), MainMemory.getI32(i5));
/*  96 */         _ZN9PixelInfo8Object2DaSERKS0_.call(paramInt1, k);
/*  97 */         MainMemory.setI32(k, 12936);
/*  98 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i1);
/*  99 */         MainMemory.setI32(i, 12936);
/* 100 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i2);
/* 101 */         MainMemory.setI32(j, 12936);
/* 102 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i3);
/* 103 */         m = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 113 */       MainMemory.dealloc_generated(i6);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D13getSpatialMapEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */