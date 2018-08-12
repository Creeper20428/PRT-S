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
/*     */ public final class _ZN9PixelInfo8Object3D10getChanMapEl
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 434;
/*  15 */   public static final Function _instance = new _ZN9PixelInfo8Object3D10getChanMapEl();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN9PixelInfo8Object3D10getChanMapEl() { super("_ZN9PixelInfo8Object3D10getChanMapEl", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     call(i, j, k);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*     */     
/*     */ 
/*  50 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  54 */       i = MainMemory.alloc(44);
/*  55 */       _ZN9PixelInfo8Object2DC1Ev.call(paramInt1);
/*  56 */       j = MainMemory.getI32(paramInt2 + 16);
/*  57 */       k = paramInt2 + 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  65 */         m = j == k ? 1 : 0;
/*  66 */         if (m == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */           if (MainMemory.getI32(j + 16) != paramInt3) {
/*     */             break label174;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */           if (m == 0) {
/*     */             break label150;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         _ZN9PixelInfo8Object2DC1Ev.call(i);
/*  97 */         _ZN9PixelInfo8Object2DaSERKS0_.call(paramInt1, i);
/*  98 */         MainMemory.setI32(i, 12936);
/*  99 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(i + 4);
/*     */         
/*     */         break label164;
/*     */         
/*     */         label150:
/* 104 */         _ZN9PixelInfo8Object2DaSERKS0_.call(paramInt1, j + 20);
/*     */         
/*     */ 
/*     */         label164:
/*     */         
/*     */ 
/* 110 */         break;
/*     */         
/*     */ 
/*     */         label174:
/*     */         
/*     */ 
/* 116 */         j = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 126 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D10getChanMapEl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */