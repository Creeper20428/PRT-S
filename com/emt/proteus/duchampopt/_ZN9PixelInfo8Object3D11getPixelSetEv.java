/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object3D11getPixelSetEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 438;
/*  13 */   public static final Function _instance = new _ZN9PixelInfo8Object3D11getPixelSetEv();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZN9PixelInfo8Object3D11getPixelSetEv() { super("_ZN9PixelInfo8Object3D11getPixelSetEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     call(paramInt1, paramInt2);
/*  21 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     call(i, j);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*  48 */     int i5 = 0;
/*  49 */     int i6 = 0;
/*  50 */     int i7 = 0;
/*  51 */     int i8 = 0;
/*  52 */     int i9 = 0;
/*  53 */     int i10 = 0;
/*  54 */     int i11 = 0;
/*  55 */     int i12 = 0;
/*     */     
/*     */ 
/*  58 */     int i13 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       i9 = MainMemory.alloc(20);
/*  63 */       MainMemory.setI32(i9, 12904);
/*  64 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EEC2EjRKS1_RKS2_.call(paramInt1, MainMemory.getI32(paramInt2 + 28), i9);
/*  65 */       i12 = MainMemory.getI32(paramInt2 + 16);
/*  66 */       i = paramInt2 + 8;
/*  67 */       i1 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  76 */         if (i12 != i) {
/*     */           break label133;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         break;
/*     */         
/*     */ 
/*     */         label133:
/*     */         
/*     */ 
/*  92 */         j = MainMemory.getI32(i12 + 16);
/*  93 */         m = i12 + 24;
/*  94 */         k = MainMemory.getI32(m);
/*  95 */         m += 4;
/*  96 */         if (k == MainMemory.getI32(m)) {
/*  97 */           j = i1;
/*     */           break label463;
/*     */         } else {
/* 100 */           i5 = 0;
/* 101 */           n = i1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 111 */           i1 = i5 + 1;
/* 112 */           i2 = k + (i1 << 4);
/* 113 */           i3 = k + (i5 << 4) + 8;
/* 114 */           i4 = k + (i5 << 4) + 12;
/* 115 */           i5 = MainMemory.getI32(k + (i5 << 4) + 4);
/* 116 */           i6 = MainMemory.getI32(i3);
/* 117 */           if (i6 + -1 + MainMemory.getI32(i4) >= i6)
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
/* 128 */             i7 = i6 + 1;
/* 129 */             i8 = n + 1;
/* 130 */             i9 = MainMemory.getI32(paramInt1);
/* 131 */             i10 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 138 */               i11 = n + i10;
/* 139 */               MainMemory.setI32(i9 + i11 * 20 + 4, i6 + i10);
/* 140 */               MainMemory.setI32(i9 + i11 * 20 + 8, i5);
/* 141 */               MainMemory.setI32(i9 + i11 * 20 + 12, j);
/* 142 */               MainMemory.setF32(i9 + i11 * 20 + 16, 0.0F);
/* 143 */               i11 = i10 + 1;
/* 144 */               if (MainMemory.getI32(i3) + -1 + MainMemory.getI32(i4) < i7 + i10) {
/*     */                 break;
/*     */               }
/*     */               
/* 148 */               i10 = i11;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */             n = i8 + i10;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 163 */           if (i2 == MainMemory.getI32(m)) {
/* 164 */             j = n; break;
/*     */           }
/*     */           
/*     */ 
/* 168 */           i5 = i1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label463:
/*     */         
/*     */ 
/*     */ 
/* 177 */         i12 = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i12);
/* 178 */         i1 = j;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 188 */       MainMemory.dealloc_generated(i13);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D11getPixelSetEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */