/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp9Detection13calcVelWidthsEPfPlRNS_10FitsHeaderE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 838;
/*  14 */   public static final Function _instance = new _ZN7duchamp9Detection13calcVelWidthsEPfPlRNS_10FitsHeaderE();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp9Detection13calcVelWidthsEPfPlRNS_10FitsHeaderE() { super("_ZN7duchamp9Detection13calcVelWidthsEPfPlRNS_10FitsHeaderE", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i, j, k, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     int i11 = 0;
/*  62 */     int i12 = 0;
/*  63 */     int i13 = 0;
/*  64 */     float f1 = 0.0F;
/*  65 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*  68 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  72 */       i = MainMemory.alloc(20);
/*  73 */       j = MainMemory.alloc(20);
/*  74 */       k = paramInt3 + 8;
/*  75 */       i1 = MainMemory.getI32(k);
/*  76 */       if (i1 <= 2) {
/*     */         break label550;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */       m = SystemLibrary.newarray(i1 << 2);
/*  87 */       n = m;
/*  88 */       i1 = MainMemory.getI32(paramInt3);
/*  89 */       i2 = MainMemory.getI32(paramInt3 + 4);
/*  90 */       i3 = MainMemory.getI32(k);
/*  91 */       i4 = i2 * i1 * i3;
/*  92 */       MainMemory.setI32(j, 0);
/*  93 */       i5 = j + 4;
/*  94 */       MainMemory.setI32(i5, 0);
/*  95 */       i6 = j + 8;
/*  96 */       MainMemory.setI32(i6, 0);
/*  97 */       i7 = j + 12;
/*  98 */       MainMemory.setI32(i7, 0);
/*  99 */       i8 = j + 16;
/* 100 */       MainMemory.setI32(i8, 0);
/* 101 */       i12 = i4 + 31;
/* 102 */       i9 = SystemLibrary.newobject(i12 >>> 3 & 0x1FFFFFFC);
/* 103 */       i10 = i9;
/* 104 */       i11 = i10 + (i12 >>> 5 << 2);
/* 105 */       MainMemory.setI32(i8, i11);
/* 106 */       MainMemory.setI32(j, i10);
/* 107 */       MainMemory.setI32(i5, 0);
/* 108 */       i12 = i4 / 32;
/* 109 */       i4 %= 32;
/* 110 */       i13 = i4 < 0 ? 1 : 0;
/* 111 */       MainMemory.setI32(i6, i10 + ((i13 != 0 ? i12 + -1 : i12) << 2));
/* 112 */       MainMemory.setI32(i7, i13 != 0 ? i4 + 32 : i4);
/* 113 */       if (i10 != i11)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         i1 = i1 * i2 * i3 + 31 >>> 5;
/* 124 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 131 */           i3 = i2 + 1;
/* 132 */           MainMemory.setI32(i9 + (i2 << 2), -1);
/* 133 */           if (i3 == i1) {
/*     */             break;
/*     */           }
/*     */           
/* 137 */           i2 = i3;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 144 */       _ZNSt6vectorIbSaIbEEC2ERKS1_.call(i, j);
/* 145 */       i7 = MainMemory.getI32(i);
/* 146 */       _ZN7duchamp10getIntSpecERNS_9DetectionEPfPlSt6vectorIbSaIbEEfS2_.call(paramInt1, paramInt2, paramInt3, i7, n);
/* 147 */       if (i7 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */         SystemLibrary.delete(i7);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 163 */       _ZN7duchamp9Detection13calcVelWidthsElPfRNS_10FitsHeaderE.call(paramInt1, MainMemory.getI32(k), n, paramInt4);
/* 164 */       if (m != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 174 */         SystemLibrary.deletearray(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 180 */       paramInt3 = MainMemory.getI32(j);
/* 181 */       if (paramInt3 != 0) {
/*     */         break label536;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label649;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label536:
/*     */       
/*     */ 
/*     */ 
/* 197 */       SystemLibrary.delete(paramInt3);
/*     */       
/*     */ 
/*     */       break label649;
/*     */       
/*     */       label550:
/*     */       
/* 204 */       f1 = MainMemory.getF32(paramInt1 + 220);
/* 205 */       MainMemory.setF32(paramInt1 + 228, f1);
/* 206 */       MainMemory.setF32(paramInt1 + 240, f1);
/* 207 */       f2 = MainMemory.getF32(paramInt1 + 224);
/* 208 */       MainMemory.setF32(paramInt1 + 232, f2);
/* 209 */       MainMemory.setF32(paramInt1 + 244, f2);
/* 210 */       f1 -= f2;
/* 211 */       f1 = SystemLibrary.fabsf(f1);
/* 212 */       MainMemory.setF32(paramInt1 + 236, f1);
/* 213 */       MainMemory.setF32(paramInt1 + 248, f1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label649:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 224 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection13calcVelWidthsEPfPlRNS_10FitsHeaderE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */