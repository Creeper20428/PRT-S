/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube17objAtSpectralEdgeENS_9DetectionE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1332;
/*  14 */   public static final Function _instance = new _ZN7duchamp4Cube17objAtSpectralEdgeENS_9DetectionE();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp4Cube17objAtSpectralEdgeENS_9DetectionE() { super("_ZN7duchamp4Cube17objAtSpectralEdgeENS_9DetectionE", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
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
/*  32 */     byte b = call(i, j);
/*  33 */     paramFrame.setI8(paramInt1, b);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     byte b1 = 0;
/*     */     
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     byte b2 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*  55 */     int i9 = 0;
/*     */     
/*     */ 
/*  58 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.alloc(12);
/*  63 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(i, paramInt2);
/*  64 */       j = i + 4;
/*  65 */       k = paramInt1 + 8;
/*  66 */       m = paramInt1 + 20;
/*  67 */       n = paramInt1 + 32;
/*  68 */       b2 = 0;
/*  69 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  77 */         i8 = i5 * 20;
/*  78 */         i6 = i8 + 4;
/*  79 */         i7 = i8 + 8;
/*  80 */         i8 += 12;
/*  81 */         if (b2 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         i9 = MainMemory.getI32(i);
/*  92 */         if (MathUtils.ugt((MainMemory.getI32(j) - i9) / 20, i5)) {
/*  93 */           i4 = 0;
/*     */         } else {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 106 */           i2 = (i4 << 1) + -1;
/* 107 */           if (i2 >= 2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */           i1 = i9;
/* 118 */           i2 = MainMemory.getI32(i1 + i8) + i2;
/* 119 */           if (i2 < 0) {
/* 120 */             b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 130 */             i3 = MainMemory.getI32(k);
/* 131 */             if (i2 >= MainMemory.getI32(i3 + 8))
/*     */             {
/*     */ 
/*     */ 
/* 135 */               b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 142 */             else if (_ZN7duchamp5Param7isBlankERf.call(n, MainMemory.getI32(m) + ((i2 * MainMemory.getI32(i3 + 4) + MainMemory.getI32(i1 + i7)) * MainMemory.getI32(i3) + MainMemory.getI32(i1 + i6) << 2)) != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */               b2 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 160 */           i4 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */         i5 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(i);
/* 175 */       b1 = b2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */       return b1;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 186 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube17objAtSpectralEdgeENS_9DetectionE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */