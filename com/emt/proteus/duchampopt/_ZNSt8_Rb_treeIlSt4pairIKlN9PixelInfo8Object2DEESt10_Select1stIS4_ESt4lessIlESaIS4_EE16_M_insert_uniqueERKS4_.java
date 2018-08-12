/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_;
/*     */ 
/*     */ public final class _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 431;
/*  14 */   public static final Function _instance = new _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_() { super("_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_", 3, false); }
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
/*  52 */     byte b = 0;
/*  53 */     int i5 = 0;
/*  54 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  60 */       i = paramInt2 + 4;
/*  61 */       i4 = MainMemory.getI32(paramInt2 + 8);
/*  62 */       if (i4 == 0) {
/*  63 */         j = i;
/*  64 */         i1 = i4;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  74 */         i2 = MainMemory.getI32(paramInt3);
/*  75 */         j = i4;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  82 */           i3 = MainMemory.getI32(j + 16);
/*  83 */           k = i2 < i3 ? 1 : 0;
/*  84 */           if (k == 0) {
/*     */             break label144;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */           m = j + 8;
/*     */           
/*     */           break label156;
/*     */           
/*     */           label144:
/*     */           
/* 100 */           m = j + 12;
/*     */           
/*     */ 
/*     */ 
/*     */           label156:
/*     */           
/*     */ 
/*     */ 
/* 108 */           n = MainMemory.getI32(m);
/* 109 */           if (n == 0) {
/*     */             break;
/*     */           }
/*     */           
/* 113 */           j = n;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */         if (k != 0)
/*     */         {
/* 122 */           i1 = n;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 128 */           i4 = j;
/* 129 */           i1 = n;
/*     */           
/*     */ 
/*     */ 
/*     */           break label393;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 139 */       if (j != MainMemory.getI32(paramInt2 + 12)) {
/*     */         break label357;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */       if ((i1 != 0) || (i == j)) {
/* 150 */         b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 160 */       else if (MainMemory.getI32(paramInt3) < MainMemory.getI32(j + 16)) {
/* 161 */         b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 171 */         b = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */       i5 = _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_.call(paramInt3);
/* 179 */       _ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_.call(b, i5, j, i);
/* 180 */       i6 = paramInt2 + 20;
/* 181 */       MainMemory.setI32(i6, MainMemory.getI32(i6) + 1);
/* 182 */       MainMemory.setI32(paramInt1, i5);
/* 183 */       MainMemory.setI8(paramInt1 + 4, (byte)1);
/*     */       
/*     */ 
/*     */       break label546;
/*     */       
/*     */       label357:
/*     */       
/* 190 */       n = _ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base.call(j);
/* 191 */       i3 = MainMemory.getI32(n + 16);
/* 192 */       i2 = MainMemory.getI32(paramInt3);
/*     */       
/*     */ 
/* 195 */       i4 = j;
/*     */       
/* 197 */       j = n;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label393:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 208 */       if (i3 >= i2) {
/*     */         break label528;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 218 */       if ((i1 != 0) || (i == i4)) {
/* 219 */         b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 229 */       else if (i2 < MainMemory.getI32(i4 + 16)) {
/* 230 */         b = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 240 */         b = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 247 */       i5 = _ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE14_M_create_nodeERKS4_.call(paramInt3);
/* 248 */       _ZSt29_Rb_tree_insert_and_rebalancebPSt18_Rb_tree_node_baseS0_RS_.call(b, i5, i4, i);
/* 249 */       i6 = paramInt2 + 20;
/* 250 */       MainMemory.setI32(i6, MainMemory.getI32(i6) + 1);
/* 251 */       MainMemory.setI32(paramInt1, i5);
/* 252 */       MainMemory.setI8(paramInt1 + 4, (byte)1);
/*     */       
/*     */ 
/*     */       break label546;
/*     */       
/*     */       label528:
/*     */       
/* 259 */       MainMemory.setI32(paramInt1, j);
/* 260 */       MainMemory.setI8(paramInt1 + 4, (byte)0);
/*     */       
/*     */ 
/*     */       label546:
/*     */       
/*     */ 
/* 266 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt8_Rb_treeIlSt4pairIKlN9PixelInfo8Object2DEESt10_Select1stIS4_ESt4lessIlESaIS4_EE16_M_insert_uniqueERKS4_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */