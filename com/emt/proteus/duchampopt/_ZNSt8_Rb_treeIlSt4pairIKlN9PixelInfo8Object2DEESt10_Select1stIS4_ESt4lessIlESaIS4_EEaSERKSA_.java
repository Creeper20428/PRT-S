/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EEaSERKSA_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 426;
/*  13 */   public static final Function _instance = new _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EEaSERKSA_();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EEaSERKSA_() { super("_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EEaSERKSA_", 2, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  51 */       if (paramInt1 != paramInt2)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  61 */         i = paramInt1 + 8;
/*  62 */         _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E.call(MainMemory.getI32(i));
/*  63 */         j = paramInt1 + 12;
/*  64 */         k = paramInt1 + 4;
/*  65 */         MainMemory.setI32(j, k);
/*  66 */         MainMemory.setI32(i, 0);
/*  67 */         m = paramInt1 + 16;
/*  68 */         MainMemory.setI32(m, k);
/*  69 */         n = paramInt1 + 20;
/*  70 */         MainMemory.setI32(n, 0);
/*  71 */         MainMemory.setI8(paramInt1, MainMemory.getI8(paramInt2));
/*  72 */         i1 = MainMemory.getI32(paramInt2 + 8);
/*  73 */         if (i1 != 0) {
/*     */           break label137;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label304;
/*     */       
/*     */ 
/*     */ 
/*     */       label137:
/*     */       
/*     */ 
/*     */ 
/*  89 */       i2 = _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_M_copyEPKSt13_Rb_tree_nodeIS4_EPSC_.call(i1, k);
/*  90 */       MainMemory.setI32(i, i2);
/*  91 */       k = MainMemory.getI32(i2 + 8);
/*  92 */       if (k == 0) {
/*  93 */         k = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */ 
/*     */ 
/* 105 */           i1 = MainMemory.getI32(k + 8);
/* 106 */           if (i1 == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 111 */           k = i1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 119 */       MainMemory.setI32(j, k);
/* 120 */       k = MainMemory.getI32(i2 + 12);
/* 121 */       if (k == 0) {
/* 122 */         k = i2;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */ 
/*     */ 
/* 134 */           i1 = MainMemory.getI32(k + 12);
/* 135 */           if (i1 == 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 140 */           k = i1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */       MainMemory.setI32(m, k);
/* 149 */       MainMemory.setI32(n, MainMemory.getI32(paramInt2 + 20));
/*     */       
/*     */ 
/*     */       label304:
/*     */       
/*     */ 
/* 155 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EEaSERKSA_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */