/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object3D22getMaxAdjacentChannelsEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 433;
/*  12 */   public static final Function _instance = new _ZN9PixelInfo8Object3D22getMaxAdjacentChannelsEv();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN9PixelInfo8Object3D22getMaxAdjacentChannelsEv() { super("_ZN9PixelInfo8Object3D22getMaxAdjacentChannelsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       j = paramInt + 16;
/*  51 */       i3 = MainMemory.getI32(j);
/*  52 */       k = paramInt + 8;
/*  53 */       if (i3 == k) {
/*  54 */         i1 = 0;
/*  55 */         n = 0;
/*     */         break label236;
/*     */       } else {
/*  58 */         m = i3;
/*  59 */         n = 0;
/*  60 */         i1 = 0;
/*  61 */         i5 = 0;
/*  62 */         i2 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  77 */         if (i3 != m) {
/*     */           break label130;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         i5 += 1;
/*  88 */         i4 = MainMemory.getI32(i3 + 16);
/*     */         
/*     */ 
/*     */         break label206;
/*     */         
/*     */ 
/*     */         label130:
/*     */         
/*     */ 
/*  97 */         i4 = MainMemory.getI32(i3 + 16);
/*  98 */         if (i4 - i2 <= 1) {
/*     */           break label195;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */         i1 = i1 < i5 ? i5 : i1;
/* 109 */         n = i1;
/*     */         
/* 111 */         i5 = 1;
/*     */         
/*     */         break label206;
/*     */         
/*     */         label195:
/*     */         
/* 117 */         i5 += 1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label206:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         i3 = com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i3);
/* 132 */         if (i3 == k) {
/* 133 */           i1 = i5;
/*     */         } else {
/*     */           break label261;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label236:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 146 */         i = n < i1 ? i1 : n;
/* 147 */         break;
/*     */         
/*     */ 
/*     */         label261:
/*     */         
/*     */ 
/* 153 */         m = MainMemory.getI32(j);
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 158 */         i2 = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 163 */       int i6 = i;return i6;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D22getMaxAdjacentChannelsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */