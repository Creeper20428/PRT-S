/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube15updateDetectMapEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1341;
/*  15 */   public static final Function _instance = new _ZN7duchamp4Cube15updateDetectMapEv();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp4Cube15updateDetectMapEv() { super("_ZN7duchamp4Cube15updateDetectMapEv", 1, false); }
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
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*  52 */     int i10 = 0;
/*  53 */     int i11 = 0;
/*     */     
/*     */ 
/*  56 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       i = MainMemory.alloc(12);
/*  61 */       j = MainMemory.alloc(276);
/*  62 */       k = paramInt + 28;
/*  63 */       i9 = MainMemory.getI32(k);
/*  64 */       m = MainMemory.getI32(i9);
/*  65 */       n = i + 4;
/*  66 */       i1 = paramInt + 636;
/*  67 */       i2 = paramInt + 8;
/*     */       
/*  69 */       i10 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  77 */         i11 = m + i10 * 276;
/*  78 */         if (!MathUtils.ult(i11, MainMemory.getI32(i9 + 4))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         _ZN7duchamp9DetectionC1ERKS0_.call(j, i11);
/*  89 */         _ZN9PixelInfo8Object3D11getPixelSetEv.call(i, j);
/*  90 */         i3 = MainMemory.getI32(i);
/*  91 */         i4 = MainMemory.getI32(n);
/*  92 */         if (MathUtils.ult(i3, i4)) {
/*  93 */           i5 = 0;
/*     */         } else {
/*     */           break label296;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 104 */           i6 = i5 + 1;
/* 105 */           i7 = i3 + i6 * 20;
/* 106 */           i8 = MainMemory.getI32(i1) + (MainMemory.getI32(MainMemory.getI32(i2)) * MainMemory.getI32(i3 + i5 * 20 + 8) + MainMemory.getI32(i3 + i5 * 20 + 4) << 1);
/* 107 */           MainMemory.setI16(i8, (short)(MainMemory.getI16(i8) + 1));
/* 108 */           if (!MathUtils.ult(i7, i4)) break;
/* 109 */           i5 = i6;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label296:
/*     */         
/*     */ 
/*     */ 
/* 119 */         _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EED1Ev.call(i);
/* 120 */         _ZN7duchamp9DetectionD2Ev.call(j);
/* 121 */         i10 += 1;
/* 122 */         i9 = MainMemory.getI32(k);
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
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 139 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube15updateDetectMapEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */