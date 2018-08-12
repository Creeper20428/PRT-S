/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_M_copyEPKSt13_Rb_tree_nodeIS4_EPSC_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 425;
/*  13 */   public static final Function _instance = new _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_M_copyEPKSt13_Rb_tree_nodeIS4_EPSC_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_M_copyEPKSt13_Rb_tree_nodeIS4_EPSC_() { super("_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_M_copyEPKSt13_Rb_tree_nodeIS4_EPSC_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = call(i, j);
/*  32 */     paramFrame.setI32(paramInt1, k);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  38 */     int i = 0;
/*     */     
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       j = _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_.call(paramInt1 + 16);
/*  50 */       MainMemory.setI32(j, MainMemory.getI32(paramInt1));
/*  51 */       MainMemory.setI32(j + 8, 0);
/*  52 */       k = j + 12;
/*  53 */       MainMemory.setI32(k, 0);
/*  54 */       MainMemory.setI32(j + 4, paramInt2);
/*  55 */       n = MainMemory.getI32(paramInt1 + 12);
/*  56 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */         MainMemory.setI32(k, call(n, j));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  72 */       k = paramInt1 + 8;
/*  73 */       paramInt1 = j;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  82 */         n = MainMemory.getI32(k);
/*  83 */         if (n != 0) {
/*     */           break label146;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         i = j;
/*  94 */         break;
/*     */         
/*     */ 
/*     */         label146:
/*     */         
/*     */ 
/* 100 */         paramInt2 = _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_.call(n + 16);
/* 101 */         MainMemory.setI32(paramInt2, MainMemory.getI32(n));
/* 102 */         MainMemory.setI32(paramInt2 + 8, 0);
/* 103 */         k = paramInt2 + 12;
/* 104 */         MainMemory.setI32(k, 0);
/* 105 */         MainMemory.setI32(paramInt1 + 8, paramInt2);
/* 106 */         MainMemory.setI32(paramInt2 + 4, paramInt1);
/* 107 */         m = MainMemory.getI32(n + 12);
/* 108 */         if (m != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */           MainMemory.setI32(k, call(m, paramInt2));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 124 */         k = n + 8;
/* 125 */         paramInt1 = paramInt2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 130 */       int i1 = i;return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_M_copyEPKSt13_Rb_tree_nodeIS4_EPSC_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */