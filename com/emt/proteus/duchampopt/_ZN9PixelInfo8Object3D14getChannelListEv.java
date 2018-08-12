/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object3D14getChannelListEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 435;
/*  13 */   public static final Function _instance = new _ZN9PixelInfo8Object3D14getChannelListEv();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZN9PixelInfo8Object3D14getChannelListEv() { super("_ZN9PixelInfo8Object3D14getChannelListEv", 2, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       MainMemory.setI32(paramInt1, 0);
/*  51 */       i = paramInt1 + 4;
/*  52 */       MainMemory.setI32(i, 0);
/*  53 */       j = paramInt1 + 8;
/*  54 */       MainMemory.setI32(j, 0);
/*  55 */       i1 = MainMemory.getI32(paramInt2 + 16);
/*  56 */       k = paramInt2 + 8;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  64 */         if (i1 != k) {
/*     */           break label90;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         break;
/*     */         
/*     */ 
/*     */         label90:
/*     */         
/*     */ 
/*  80 */         m = i1 + 16;
/*  81 */         n = MainMemory.getI32(i);
/*  82 */         if (n != MainMemory.getI32(j)) {
/*     */           break label143;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         _ZNSt6vectorIlSaIlEE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPlS1_EERKl.call(paramInt1, n, m);
/*     */         
/*     */         break label186;
/*     */         
/*     */         label143:
/*  97 */         if (n != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */           MainMemory.setI32(n, MainMemory.getI32(m));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 113 */         MainMemory.setI32(i, n + 4);
/*     */         
/*     */ 
/*     */         label186:
/*     */         
/*     */ 
/* 119 */         i1 = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i1);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D14getChannelListEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */