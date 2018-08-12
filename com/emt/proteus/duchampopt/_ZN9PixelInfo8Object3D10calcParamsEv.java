/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base;
/*     */ import com.emt.proteus.runtime.library.stl._ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object3D10calcParamsEv extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 441;
/*  14 */   public static final Function _instance = new _ZN9PixelInfo8Object3D10calcParamsEv();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN9PixelInfo8Object3D10calcParamsEv() { super("_ZN9PixelInfo8Object3D10calcParamsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  21 */     call(paramInt);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     float f = 0.0F;
/*  51 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       i = paramInt + 32;
/*  58 */       MainMemory.setF32(i, 0.0F);
/*  59 */       j = paramInt + 36;
/*  60 */       MainMemory.setF32(j, 0.0F);
/*  61 */       k = paramInt + 40;
/*  62 */       MainMemory.setF32(k, 0.0F);
/*  63 */       m = paramInt + 28;
/*  64 */       MainMemory.setI32(m, 0);
/*  65 */       n = paramInt + 16;
/*  66 */       MainMemory.setI32(paramInt + 60, MainMemory.getI32(MainMemory.getI32(n) + 16));
/*  67 */       i1 = paramInt + 8;
/*  68 */       MainMemory.setI32(paramInt + 64, MainMemory.getI32(_ZSt18_Rb_tree_decrementPSt18_Rb_tree_node_base.call(i1) + 16));
/*  69 */       i6 = MainMemory.getI32(n);
/*  70 */       if (i6 != i1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */         i2 = paramInt + 44;
/*  81 */         i3 = paramInt + 48;
/*  82 */         i4 = paramInt + 52;
/*  83 */         i5 = paramInt + 56;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  91 */           i7 = i6 + 20;
/*  92 */           _ZN9PixelInfo8Object2D10calcParamsEv.call(i7);
/*  93 */           if (i6 != MainMemory.getI32(n)) {
/*     */             break label282;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */           MainMemory.setI32(i2, MainMemory.getI32(i7 + 28));
/* 104 */           MainMemory.setI32(i3, MainMemory.getI32(i7 + 32));
/* 105 */           MainMemory.setI32(i4, MainMemory.getI32(i7 + 36));
/* 106 */           MainMemory.setI32(i5, MainMemory.getI32(i7 + 40));
/*     */           
/*     */           break label429;
/*     */           
/*     */           label282:
/* 111 */           i8 = MainMemory.getI32(i6 + 48);
/* 112 */           if (i8 >= MainMemory.getI32(i2)) {
/*     */             break label327;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */           MainMemory.setI32(i2, i8);
/*     */           
/*     */ 
/*     */           label327:
/*     */           
/*     */ 
/* 128 */           i8 = MainMemory.getI32(i6 + 52);
/* 129 */           if (i8 <= MainMemory.getI32(i3)) {
/*     */             break label372;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */           MainMemory.setI32(i3, i8);
/*     */           
/*     */ 
/*     */           label372:
/*     */           
/*     */ 
/* 145 */           i8 = MainMemory.getI32(i6 + 56);
/* 146 */           if (i8 >= MainMemory.getI32(i4)) {
/*     */             break label417;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */           MainMemory.setI32(i4, i8);
/*     */           
/*     */ 
/*     */           label417:
/*     */           
/*     */ 
/* 162 */           _ZN9PixelInfo8Object3D10calcParamsEv_410.call(i5, i6);
/*     */           
/*     */ 
/*     */           label429:
/*     */           
/*     */ 
/* 168 */           f = MainMemory.getF32(i) + MainMemory.getF32(i6 + 40);
/* 169 */           MainMemory.setF32(i, f);
/* 170 */           f = MainMemory.getF32(j) + MainMemory.getF32(i6 + 44);
/* 171 */           MainMemory.setF32(j, f);
/* 172 */           i9 = i7 + 16;
/* 173 */           f = (float)(MainMemory.getI32(i9) * MainMemory.getI32(i6 + 16) & 0xFFFFFFFF);
/* 174 */           f = MainMemory.getF32(k) + f;
/* 175 */           MainMemory.setF32(k, f);
/* 176 */           MainMemory.setI32(m, MainMemory.getI32(i9) + MainMemory.getI32(m));
/* 177 */           i6 = _ZSt18_Rb_tree_incrementPSt18_Rb_tree_node_base.call(i6);
/* 178 */           if (i6 == i1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D10calcParamsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */