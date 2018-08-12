/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ 
/*     */ public final class _ZN7Hanning6defineEi extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2675;
/*  13 */   public static final Function _instance = new _ZN7Hanning6defineEi();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public _ZN7Hanning6defineEi() { super("_ZN7Hanning6defineEi", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  20 */     call(paramInt1, paramInt2);
/*  21 */     return 0;
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
/*  32 */     call(i, j);
/*  33 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*  41 */     double d1 = 0.0D;
/*  42 */     double d2 = 0.0D;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     double d3 = 0.0D;
/*  46 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       if ((paramInt2 & 0x1) != 0) {
/*     */         break label89;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */       m = paramInt2 + 1;
/*  64 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(com.emt.proteus.runtime.library.streams._ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(com.emt.proteus.runtime.library.streams._ZNSolsEi.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(2048, 96928), 46688), paramInt2), 18400), m), 14656);
/*  65 */       paramInt2 = m;
/*     */       
/*     */ 
/*     */ 
/*     */       label89:
/*     */       
/*     */ 
/*  72 */       MainMemory.setI32(paramInt1 + 4, paramInt2);
/*  73 */       i = paramInt1 + 12;
/*  74 */       if (MainMemory.getI8(i) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         _ZN7Hanning6defineEi_182.call(paramInt1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  90 */       k = com.emt.proteus.runtime.api.SystemLibrary.newarray(paramInt2 << 2);
/*  91 */       j = paramInt1 + 8;
/*  92 */       MainMemory.setI32(j, k);
/*  93 */       MainMemory.setI8(i, (byte)1);
/*  94 */       if (paramInt2 <= 0) {
/*     */         break label329;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */       d1 = paramInt2;
/* 105 */       d1 += 1.0D;
/* 106 */       d1 *= 0.5D;
/* 107 */       f = (float)d1;
/* 108 */       d1 = paramInt2 + -1;
/* 109 */       d1 *= -0.5D;
/* 110 */       d2 = f;
/*     */       
/* 112 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 120 */         d3 = m;
/* 121 */         d3 += d1;
/* 122 */         f = (float)d3;
/* 123 */         d3 = f;
/* 124 */         d3 *= 3.141592653589793D;
/* 125 */         d3 /= d2;
/* 126 */         d3 = com.emt.proteus.runtime.api.SystemLibrary.cos(d3) * 0.5D;
/* 127 */         d3 += 0.5D;
/* 128 */         f = (float)d3;
/* 129 */         MainMemory.setF32(k + (m << 2), f);
/* 130 */         m += 1;
/* 131 */         if (m == paramInt2) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         k = MainMemory.getI32(j);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label329:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 153 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7Hanning6defineEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */