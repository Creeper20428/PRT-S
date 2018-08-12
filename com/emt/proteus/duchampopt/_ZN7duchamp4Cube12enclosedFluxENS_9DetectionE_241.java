/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube12enclosedFluxENS_9DetectionE_241 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new _ZN7duchamp4Cube12enclosedFluxENS_9DetectionE_241();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN7duchamp4Cube12enclosedFluxENS_9DetectionE_241() { super("_ZN7duchamp4Cube12enclosedFluxENS_9DetectionE_241", 15, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12, paramInt13, paramInt14, paramInt15);
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
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  55 */     paramInt4 += 2;
/*  56 */     paramInt3--;
/*  57 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  58 */     paramInt4 += 2;
/*  59 */     paramInt3--;
/*  60 */     int i8 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  61 */     paramInt4 += 2;
/*  62 */     paramInt3--;
/*  63 */     int i9 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  64 */     paramInt4 += 2;
/*  65 */     paramInt3--;
/*  66 */     int i10 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  67 */     paramInt4 += 2;
/*  68 */     paramInt3--;
/*  69 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10);
/*  70 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15)
/*     */   {
/*  76 */     int i = 0;
/*  77 */     int j = 0;
/*  78 */     int k = 0;
/*  79 */     int m = 0;
/*  80 */     int n = 0;
/*  81 */     int i1 = 0;
/*  82 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  88 */       i = paramInt2 > 0 ? 1 : 0;
/*  89 */       j = paramInt9 + 240;
/*  90 */       if (paramInt1 > 0)
/*     */       {
/*  92 */         paramInt1 = paramInt13 + 1 - paramInt8;
/*  93 */         paramInt2 = paramInt3 + 1 - paramInt10;
/*  94 */         paramInt3 = paramInt4 + 1 - paramInt5;
/*  95 */         paramInt4 = paramInt2 * paramInt3 << 2;
/*  96 */         paramInt5 = paramInt3 << 2;
/*  97 */         paramInt8 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/* 101 */           paramInt10 = paramInt8 << 2;
/* 102 */           if (i != 0) {
/* 103 */             paramInt13 = 0;
/*     */             
/*     */ 
/*     */ 
/* 107 */             k = paramInt10 + paramInt5 * paramInt13;
/* 108 */             m = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 112 */               n = paramInt14 + (k + paramInt4 * m);
/* 113 */               i1 = MainMemory.getI32(paramInt7);
/* 114 */               f = MainMemory.getF32(MainMemory.getI32(paramInt11) + (paramInt8 + MainMemory.getI32(paramInt6) + MainMemory.getI32(i1) * (paramInt13 + MainMemory.getI32(paramInt15) + MainMemory.getI32(i1 + 4) * (MainMemory.getI32(paramInt12) + m)) << 2));
/* 115 */               MainMemory.setF32(n, f);
/* 116 */               if (MainMemory.getI8(j) != 0)
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 121 */                 f = -0.0F - f;
/* 122 */                 MainMemory.setF32(n, f);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */               m += 1;
/* 131 */               if (m == paramInt1)
/*     */               {
/* 133 */                 paramInt13 += 1;
/* 134 */                 if (paramInt13 == paramInt2) {
/*     */                   break label276;
/*     */                 }
/*     */                 
/*     */ 
/* 139 */                 break;
/*     */                 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 break label276;
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label276:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */           paramInt8 += 1;
/* 162 */           if (paramInt8 == paramInt3) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12enclosedFluxENS_9DetectionE_241.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */