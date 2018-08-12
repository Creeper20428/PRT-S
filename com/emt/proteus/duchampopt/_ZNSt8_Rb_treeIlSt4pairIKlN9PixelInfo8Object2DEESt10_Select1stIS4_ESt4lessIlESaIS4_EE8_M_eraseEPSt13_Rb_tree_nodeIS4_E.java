/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ public final class _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 420;
/*  15 */   public static final Function _instance = new _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E() { super("_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     call(paramInt);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     call(i);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  38 */     int i = 0;
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*     */       for (;;)
/*     */       {
/*  53 */         if (paramInt != 0) {
/*     */           break label38;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */         break;
/*     */         
/*     */ 
/*     */         label38:
/*     */         
/*     */ 
/*  69 */         i = MainMemory.getI32(paramInt + 12);
/*  70 */         if (i != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */           j = i;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/*  88 */             call(MainMemory.getI32(j + 12));
/*  89 */             k = _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE7_S_leftEPSt18_Rb_tree_node_base.call(MainMemory.getI32(j + 8));
/*  90 */             _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE15_M_destroy_nodeEPSt13_Rb_tree_nodeIS4_E.call(j);
/*  91 */             if (k == 0) {
/*     */               break;
/*     */             }
/*     */             
/*  95 */             j = k;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 102 */         i = MainMemory.getI32(paramInt + 8);
/* 103 */         MainMemory.setI32(paramInt + 20, 12936);
/* 104 */         _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(paramInt + 24);
/* 105 */         j = i;
/* 106 */         SystemLibrary.delete(paramInt);
/* 107 */         paramInt = j;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE8_M_eraseEPSt13_Rb_tree_nodeIS4_E.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */