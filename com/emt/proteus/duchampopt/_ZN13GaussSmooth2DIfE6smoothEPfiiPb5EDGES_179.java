/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES_179 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES_179();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES_179() { super("_ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES_179", 13, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     call(i, j, k, m, n, i1, i2, bool, i3, i4, i5, i6, i7);
/*  64 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  70 */     int i = 0;
/*  71 */     int j = 0;
/*  72 */     int k = 0;
/*  73 */     float f1 = 0.0F;
/*  74 */     int m = 0;
/*  75 */     int n = 0;
/*  76 */     int i1 = 0;
/*  77 */     int i2 = 0;
/*  78 */     int i3 = 0;
/*  79 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  85 */       MainMemory.setF32(paramInt10, 0.0F);
/*  86 */       if (!paramBoolean)
/*     */       {
/*     */ 
/*     */ 
/*  90 */         f1 = 0.0F;
/*  91 */         i = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  96 */           j = paramInt2 + i * paramInt6;
/*  97 */           i3 = paramInt5 + i;
/*  98 */           k = paramInt7 + i;
/*  99 */           if ((i3 > -1) && (i3 < paramInt11) && (!paramBoolean))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */             m = 0;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/* 110 */               n = j + m;
/* 111 */               i1 = paramInt12 + (n << 2);
/* 112 */               i2 = paramInt8 + m;
/* 113 */               i3 = paramInt7 + m;
/* 114 */               if ((i2 > -1) && (i2 < paramInt6))
/*     */               {
/* 116 */                 if (MainMemory.getI8(paramInt1 + n) != 0)
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */                   f2 = MainMemory.getF32(i1) * MainMemory.getF32(MainMemory.getI32(paramInt4) + (m + i * MainMemory.getI32(paramInt9) << 2));
/* 123 */                   f1 += f2;
/* 124 */                   MainMemory.setF32(paramInt10, f1);
/*     */                 }
/*     */               }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */               m += 1;
/* 143 */               if (i3 > paramInt3) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */           }
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
/*     */ 
/*     */ 
/* 161 */           i += 1;
/* 162 */           if (k > paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN13GaussSmooth2DIfE6smoothEPfiiPb5EDGES_179.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */