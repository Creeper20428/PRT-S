/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube12enclosedFluxENS_9DetectionE extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1343;
/*  14 */   public static final Function _instance = new _ZN7duchamp4Cube12enclosedFluxENS_9DetectionE();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp4Cube12enclosedFluxENS_9DetectionE() { super("_ZN7duchamp4Cube12enclosedFluxENS_9DetectionE", 2, false); }
/*     */   
/*     */   public float executeFloat(int paramInt1, int paramInt2)
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
/*  32 */     float f = call(i, j);
/*  33 */     paramFrame.setF32(paramInt1, f);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static float call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     float f1 = 0.0F;
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
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*  59 */     int i14 = 0;
/*  60 */     int i15 = 0;
/*  61 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       i = paramInt1 + 8;
/*  68 */       j = paramInt1 + 20;
/*  69 */       _ZN7duchamp9Detection10calcFluxesEPfPl.call(paramInt2, MainMemory.getI32(j), MainMemory.getI32(i));
/*  70 */       k = MainMemory.getI32(paramInt2 + 48);
/*  71 */       m = paramInt2 + 44;
/*  72 */       n = MainMemory.getI32(m);
/*  73 */       i1 = k - n + 1;
/*  74 */       i2 = MainMemory.getI32(paramInt2 + 56);
/*  75 */       i3 = paramInt2 + 52;
/*  76 */       i4 = MainMemory.getI32(i3);
/*  77 */       i5 = i2 - i4 + 1;
/*  78 */       i6 = MainMemory.getI32(paramInt2 + 64);
/*  79 */       i7 = paramInt2 + 60;
/*  80 */       i8 = MainMemory.getI32(i7);
/*  81 */       i9 = i6 - i8 + 1;
/*  82 */       i10 = i5 * i1 * i9;
/*  83 */       if (!MathUtils.ugt(i10, 1073741823)) {
/*     */         break label222;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */       com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label222:
/*     */       
/*     */ 
/*  99 */       i11 = SystemLibrary.newobject(i10 << 2);
/* 100 */       i12 = i11;
/* 101 */       if (i10 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         i13 = (k + 1 - n) * (i2 + 1 - i4) * (i6 + 1 - i8);
/* 112 */         i14 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 119 */           MainMemory.setF32(i11 + (i14 << 2), 0.0F);
/* 120 */           i14 += 1;
/* 121 */           if (i14 == i13) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */       i12 += (i10 << 2);
/* 133 */       if (i1 <= 0) {
/*     */         break label383;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       _ZN7duchamp4Cube12enclosedFluxENS_9DetectionE_241.call(i5, i9, i2, k, n, m, i, i8, paramInt1, i4, j, i7, i6, i11, i3);
/*     */       
/*     */ 
/*     */       label383:
/*     */       
/*     */ 
/* 149 */       k = i12 - i11 >> 2;
/* 150 */       i15 = paramInt1 + 32;
/* 151 */       f2 = 0.0F;
/* 152 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 160 */         i12 = i11 + (n << 2);
/* 161 */         if (!MathUtils.ugt(k, n)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         if (_ZN7duchamp5Param7isBlankERf.call(i15, i12) != 0) {
/*     */           break label479;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         f2 = MainMemory.getF32(i12) + f2;
/*     */         
/*     */ 
/*     */ 
/*     */         label479:
/*     */         
/*     */ 
/*     */ 
/* 190 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 197 */       if (i11 != 0) {
/*     */         break label526;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */       f1 = f2;
/*     */       
/*     */ 
/*     */       break label539;
/*     */       
/*     */       label526:
/*     */       
/* 214 */       SystemLibrary.delete(i11);
/* 215 */       f1 = f2;
/*     */       
/*     */ 
/*     */       label539:
/*     */       
/*     */ 
/* 221 */       float f3 = f1; return f3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube12enclosedFluxENS_9DetectionE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */