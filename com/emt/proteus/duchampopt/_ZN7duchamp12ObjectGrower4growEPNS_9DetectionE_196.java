/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.Jump;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE_196
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  15 */   public static final Function _instance = new _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE_196();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp12ObjectGrower4growEPNS_9DetectionE_196() { super("_ZN7duchamp12ObjectGrower4growEPNS_9DetectionE_196", 12, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10, paramInt11, paramInt12);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  50 */     paramInt4 += 2;
/*  51 */     paramInt3--;
/*  52 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  53 */     paramInt4 += 2;
/*  54 */     paramInt3--;
/*  55 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  56 */     paramInt4 += 2;
/*  57 */     paramInt3--;
/*  58 */     int i6 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  59 */     paramInt4 += 2;
/*  60 */     paramInt3--;
/*  61 */     int i7 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  62 */     paramInt4 += 2;
/*  63 */     paramInt3--;
/*  64 */     call(i, j, k, m, n, i1, i2, i3, i4, i5, i6, i7);
/*  65 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
/*     */   {
/*  71 */     int i = 0;
/*  72 */     int j = 0;
/*     */     
/*     */ 
/*     */     try
/*     */     {
/*  77 */       Jump.label(79222);
/*  78 */       paramInt10 += paramInt12 * MainMemory.getI32(MainMemory.getI32(paramInt9));
/*  79 */       i = MainMemory.getI32(paramInt8) + (paramInt10 << 2);
/*  80 */       if (MainMemory.getI32(i) == 0)
/*     */       {
/*  82 */         if (_ZN10Statistics14StatsContainerIfE11isDetectionEf.call(paramInt6, MainMemory.getF32(MainMemory.getI32(paramInt4) + (paramInt10 << 2))) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  87 */           MainMemory.setI32(i, 1);
/*  88 */           _ZN9PixelInfo5VoxelC1Elll.call(paramInt7, paramInt1, paramInt12, paramInt2);
/*  89 */           j = MainMemory.getI32(paramInt5);
/*  90 */           if (j == MainMemory.getI32(paramInt11))
/*     */           {
/*  92 */             _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EE13_M_insert_auxEN9__gnu_cxx17__normal_iteratorIPS1_S3_EERKS1_.call(paramInt3, j, paramInt7);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  99 */             if (j != 0)
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 104 */               _ZN9PixelInfo5VoxelC1ERKS0_.call(j, paramInt7);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */             Jump.label(79257);
/* 112 */             MainMemory.setI32(paramInt5, j + 20);
/*     */           }
/*     */         }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       Jump.label(8000000); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp12ObjectGrower4growEPNS_9DetectionE_196.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */