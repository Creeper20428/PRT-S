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
/*     */ public final class _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EEaSERKS3_ extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 357;
/*  14 */   public static final Function _instance = new _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EEaSERKS3_();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EEaSERKS3_() { super("_ZNSt6vectorIN9PixelInfo4ScanESaIS1_EEaSERKS3_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     call(paramInt1, paramInt2);
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
/*  33 */     call(i, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       if (paramInt2 != paramInt1) {
/*     */         break label53;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label638;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label53:
/*     */       
/*     */ 
/*     */ 
/*  70 */       i = paramInt2 + 4;
/*  71 */       j = MainMemory.getI32(i);
/*  72 */       k = MainMemory.getI32(paramInt2);
/*  73 */       m = j - k >> 4;
/*  74 */       n = paramInt1 + 8;
/*  75 */       i1 = MainMemory.getI32(paramInt1);
/*  76 */       i3 = i1;
/*  77 */       if (!MathUtils.ult(MainMemory.getI32(n) - i3 >> 4, m)) {
/*     */         break label293;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       i2 = _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EE20_M_allocate_and_copyIN9__gnu_cxx17__normal_iteratorIPKS1_S3_EEEEPS1_jT_SB_.call(m, k, j);
/*  88 */       k = MainMemory.getI32(paramInt1 + 4);
/*  89 */       i1 = MainMemory.getI32(paramInt1);
/*  90 */       if (i1 == k) {
/*  91 */         k = i1;
/*     */         break label240;
/*     */       } else {
/*  94 */         i3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 103 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(i1 + (i3 << 4))), i1 + (i3 << 4));
/* 104 */         i3 += 1;
/* 105 */         if (i1 + (i3 << 4) == k) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       k = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */       label240:
/*     */       
/*     */ 
/*     */ 
/* 124 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */         SystemLibrary.delete(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 140 */       MainMemory.setI32(paramInt1, i2);
/* 141 */       MainMemory.setI32(n, i2 + (m << 4));
/*     */       
/*     */       break label618;
/*     */       
/*     */       label293:
/* 146 */       n = paramInt1 + 4;
/* 147 */       i2 = MainMemory.getI32(n);
/* 148 */       i3 = i2 - i3 >> 4;
/* 149 */       if (!MathUtils.ult(i3, m)) {
/*     */         break label458;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */       if (i3 > 0) {
/* 160 */         i4 = 0;
/*     */       } else {
/*     */         break label430;
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
/*     */       for (;;)
/*     */       {
/* 175 */         _ZN9PixelInfo4ScanaSERKS0_.call(i1 + (i4 << 4), k + (i4 << 4));
/* 176 */         i4 += 1;
/* 177 */         if (i4 == i3) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */       i2 = MainMemory.getI32(n);
/* 189 */       j = MainMemory.getI32(i);
/* 190 */       k = MainMemory.getI32(paramInt2);
/* 191 */       i1 = MainMemory.getI32(paramInt1);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label430:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */       _ZSt24__uninitialized_copy_auxIPN9PixelInfo4ScanES2_ET0_T_S4_S3_St12__false_type.call(k + (i2 - i1 >> 4 << 4), j, i2);
/*     */       
/*     */       break label618;
/*     */       
/*     */       label458:
/* 210 */       if (m > 0) {
/* 211 */         i3 = 0;
/*     */       }
/*     */       else
/*     */       {
/* 215 */         k = i1;
/*     */         
/*     */ 
/*     */         break label540;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/* 223 */         _ZN9PixelInfo4ScanaSERKS0_.call(i1 + (i3 << 4), k + (i3 << 4));
/* 224 */         i3 += 1;
/* 225 */         if (i3 == m) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */       k = i1 + (m << 4);
/*     */       
/*     */ 
/*     */ 
/*     */       label540:
/*     */       
/*     */ 
/*     */ 
/* 244 */       if (k == i2) {
/*     */         break label618;
/*     */       } else {
/* 247 */         i3 = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 256 */         SystemLibrary.do_indirect(MainMemory.getI32(MainMemory.getI32(k + (i3 << 4))), k + (i3 << 4));
/* 257 */         i3 += 1;
/* 258 */         if (k + (i3 << 4) == i2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label618:
/*     */       
/*     */ 
/*     */ 
/* 269 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt1) + (m << 4));
/*     */       
/*     */ 
/*     */       label638:
/*     */       
/*     */ 
/* 275 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN9PixelInfo4ScanESaIS1_EEaSERKS3_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */