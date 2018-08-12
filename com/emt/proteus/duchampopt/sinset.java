/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class sinset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2845;
/*  12 */   public static final Function _instance = new sinset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public sinset() { super("sinset", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  19 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = call(i);
/*  28 */     paramFrame.setI32(paramInt1, j);
/*  29 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*     */     
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     double d1 = 0.0D;
/*  40 */     double d2 = 0.0D;
/*  41 */     int n = 0;
/*  42 */     double d3 = 0.0D;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*     */     
/*     */ 
/*  48 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       j = MainMemory.alloc(4);
/*  53 */       k = MainMemory.alloc(8);
/*  54 */       m = MainMemory.alloc(8);
/*  55 */       if (paramInt != 0) {
/*     */         break label82;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */       i = 1;
/*     */       
/*     */ 
/*     */       break label645;
/*     */       
/*     */       label82:
/*     */       
/*  72 */       MainMemory.setI32(paramInt, 105);
/*  73 */       MainMemory.setI32(paramInt + 4, 5130579);
/*  74 */       n = paramInt + 24;
/*  75 */       d1 = MainMemory.getF64(n);
/*  76 */       if (!MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*     */         break label147;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       MainMemory.setF64(n, 0.0D);
/*  88 */       d1 = 0.0D;
/*     */       
/*     */ 
/*     */ 
/*     */       label147:
/*     */       
/*     */ 
/*  95 */       n = paramInt + 32;
/*  96 */       d2 = MainMemory.getF64(n);
/*  97 */       if (!MathUtils.f_oeq(d2, 9.87654321E107D)) {
/*     */         break label198;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */       MainMemory.setF64(n, 0.0D);
/* 109 */       d2 = 0.0D;
/*     */       
/*     */ 
/*     */ 
/*     */       label198:
/*     */       
/*     */ 
/* 116 */       n = paramInt + 8;
/* 117 */       d3 = MainMemory.getF64(n);
/* 118 */       if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */         break label251;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */       MainMemory.setF64(n, 57.29577951308232D);
/* 130 */       d3 = 57.29577951308232D;
/*     */       
/*     */ 
/*     */ 
/*     */       label251:
/*     */       
/*     */ 
/* 137 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 66688, 23, 1);
/* 138 */       MainMemory.setI32(paramInt + 316, 1);
/* 139 */       MainMemory.setI32(paramInt + 320, 102);
/* 140 */       MainMemory.setI32(paramInt + 324, ((MathUtils.f_une(d1, 0.0D)) || (MathUtils.f_une(d2, 0.0D)) ? 1 : 0) ^ 0x1);
/* 141 */       MainMemory.setI32(paramInt + 328, 0);
/* 142 */       MainMemory.setI32(paramInt + 332, 0);
/* 143 */       MainMemory.setI32(paramInt + 336, 0);
/* 144 */       MainMemory.setI32(paramInt + 340, 0);
/* 145 */       d3 = 1.0D / d3;
/* 146 */       MainMemory.setF64(paramInt + 360, d3);
/* 147 */       d1 *= d1;
/* 148 */       d2 *= d2;
/* 149 */       d1 += d2;
/* 150 */       MainMemory.setF64(paramInt + 368, d1);
/* 151 */       d2 = d1 + 1.0D;
/* 152 */       MainMemory.setF64(paramInt + 376, d2);
/* 153 */       d1 += -1.0D;
/* 154 */       MainMemory.setF64(paramInt + 384, d1);
/* 155 */       MainMemory.setI32(paramInt + 448, 2846);
/* 156 */       MainMemory.setI32(paramInt + 452, 2847);
/* 157 */       n = paramInt + 344;
/* 158 */       MainMemory.setF64(n, 0.0D);
/* 159 */       i1 = paramInt + 352;
/* 160 */       MainMemory.setF64(i1, 0.0D);
/* 161 */       i2 = paramInt + 256;
/* 162 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */         i3 = paramInt + 264;
/* 173 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label575;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */       MainMemory.setF64(i2, 0.0D);
/* 184 */       MainMemory.setF64(paramInt + 264, 90.0D);
/* 185 */       i = 0;
/*     */       
/*     */ 
/*     */       break label645;
/*     */       
/*     */       label575:
/*     */       
/* 192 */       if (sins2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label638;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 202 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 203 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 204 */       i = 0;
/*     */       
/*     */ 
/*     */       break label645;
/*     */       
/*     */       label638:
/*     */       
/* 211 */       i = 2;
/*     */       
/*     */ 
/*     */       label645:
/*     */       
/*     */ 
/* 217 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 222 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sinset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */