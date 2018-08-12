/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube16objAtSpatialEdgeENS_9DetectionE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1333;
/*  14 */   public static final Function _instance = new _ZN7duchamp4Cube16objAtSpatialEdgeENS_9DetectionE();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp4Cube16objAtSpatialEdgeENS_9DetectionE() { super("_ZN7duchamp4Cube16objAtSpatialEdgeENS_9DetectionE", 2, false); }
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
/*  47 */     byte b2 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     int i5 = 0;
/*  52 */     int i6 = 0;
/*  53 */     int i7 = 0;
/*  54 */     int i8 = 0;
/*  55 */     int i9 = 0;
/*  56 */     int i10 = 0;
/*     */     
/*     */ 
/*  59 */     int i11 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(12);
/*  64 */       _ZN9PixelInfo8Object3D11getPixelSetEv.call(i, paramInt2);
/*  65 */       j = i + 4;
/*  66 */       k = paramInt1 + 8;
/*  67 */       m = paramInt1 + 20;
/*  68 */       n = paramInt1 + 32;
/*  69 */       b2 = 0;
/*  70 */       i6 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  78 */         i9 = i6 * 20;
/*  79 */         i7 = i9 + 4;
/*  80 */         i8 = i9 + 8;
/*  81 */         i9 += 12;
/*  82 */         if (b2 != 0) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         i10 = MainMemory.getI32(i);
/*  93 */         if (MathUtils.ugt((MainMemory.getI32(j) - i10) / 20, i6)) {
/*  94 */           i1 = 0;
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
/* 107 */           i3 = (i1 << 1) + -1;
/* 108 */           if (i3 >= 2)
/*     */           {
/*     */ 
/*     */ 
/* 112 */             i1 = 0;
/*     */             
/* 114 */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 120 */           i2 = i10;
/* 121 */           i3 = MainMemory.getI32(i2 + i7) + i3;
/* 122 */           if (i3 < 0) {
/* 123 */             b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 133 */             i4 = MainMemory.getI32(k);
/* 134 */             i5 = MainMemory.getI32(i4);
/* 135 */             if (i3 >= i5)
/*     */             {
/*     */ 
/*     */ 
/* 139 */               b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 146 */             else if (_ZN7duchamp5Param7isBlankERf.call(n, MainMemory.getI32(m) + (i3 + i5 * (MainMemory.getI32(i2 + i8) + MainMemory.getI32(i4 + 4) * MainMemory.getI32(i2 + i9)) << 2)) != 0)
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
/* 157 */               b2 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 164 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 173 */           i3 = (i1 << 1) + -1;
/* 174 */           if (i3 >= 2) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */           i2 = i10;
/* 185 */           i3 = MainMemory.getI32(i2 + i8) + i3;
/* 186 */           if (i3 < 0) {
/* 187 */             b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 197 */             i4 = MainMemory.getI32(k);
/* 198 */             i5 = MainMemory.getI32(i4 + 4);
/* 199 */             if (i3 >= i5)
/*     */             {
/*     */ 
/*     */ 
/* 203 */               b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 210 */             else if (_ZN7duchamp5Param7isBlankERf.call(n, MainMemory.getI32(m) + ((i3 + i5 * MainMemory.getI32(i2 + i9)) * MainMemory.getI32(i4) + MainMemory.getI32(i2 + i7) << 2)) != 0)
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
/* 221 */               b2 = 1;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 228 */           i1 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */         i6 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(i);
/* 243 */       b1 = b2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */       return b1;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 254 */       MainMemory.dealloc_generated(i11);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16objAtSpatialEdgeENS_9DetectionE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */