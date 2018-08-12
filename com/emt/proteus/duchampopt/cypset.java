/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class cypset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2833;
/*  12 */   public static final Function _instance = new cypset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cypset() { super("cypset", 1, false); }
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
/*  42 */     int i1 = 0;
/*  43 */     double d3 = 0.0D;
/*  44 */     double d4 = 0.0D;
/*  45 */     int i2 = 0;
/*  46 */     int i3 = 0;
/*  47 */     int i4 = 0;
/*     */     
/*     */ 
/*  50 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  54 */       j = MainMemory.alloc(4);
/*  55 */       k = MainMemory.alloc(8);
/*  56 */       m = MainMemory.alloc(8);
/*  57 */       if (paramInt == 0) {
/*  58 */         n = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  68 */         MainMemory.setI32(paramInt, 201);
/*  69 */         MainMemory.setI32(paramInt + 4, 5265731);
/*  70 */         i1 = paramInt + 24;
/*  71 */         d1 = MainMemory.getF64(i1);
/*  72 */         if (!MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*     */           break label142;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  83 */         MainMemory.setF64(i1, 1.0D);
/*  84 */         d1 = 1.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label142:
/*     */         
/*     */ 
/*  91 */         i1 = paramInt + 32;
/*  92 */         d2 = MainMemory.getF64(i1);
/*  93 */         if (!MathUtils.f_oeq(d2, 9.87654321E107D)) {
/*     */           break label193;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         MainMemory.setF64(i1, 1.0D);
/* 105 */         d2 = 1.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label193:
/*     */         
/*     */ 
/* 112 */         com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 67808, 24, 1);
/* 113 */         MainMemory.setI32(paramInt + 316, 2);
/* 114 */         MainMemory.setI32(paramInt + 320, 102);
/* 115 */         MainMemory.setI32(paramInt + 324, 0);
/* 116 */         MainMemory.setI32(paramInt + 328, 0);
/* 117 */         MainMemory.setI32(paramInt + 332, 0);
/* 118 */         n = (MathUtils.f_olt(d1, -1.0D)) || (MathUtils.f_ogt(d1, 0.0D)) ? 1 : 0;
/* 119 */         MainMemory.setI32(paramInt + 336, n);
/* 120 */         MainMemory.setI32(paramInt + 340, n ^ 0x1);
/* 121 */         i1 = paramInt + 8;
/* 122 */         d3 = MainMemory.getF64(i1);
/* 123 */         if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */           break label465;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         MainMemory.setF64(i1, 57.29577951308232D);
/* 134 */         MainMemory.setF64(paramInt + 360, d2);
/* 135 */         if (MathUtils.f_oeq(d2, 0.0D)) {
/* 136 */           n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 146 */           d3 = 1.0D / d2;
/* 147 */           MainMemory.setF64(paramInt + 368, d3);
/* 148 */           d1 += d2;
/* 149 */           d1 *= 57.29577951308232D;
/* 150 */           MainMemory.setF64(paramInt + 376, d1);
/* 151 */           if (MathUtils.f_oeq(d1, 0.0D)) {
/* 152 */             n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 162 */             d1 = 1.0D / d1;
/* 163 */             MainMemory.setF64(paramInt + 384, d1);
/*     */             
/*     */             break label619;
/*     */             
/*     */             label465:
/* 168 */             d4 = d3 * d2;
/* 169 */             d4 *= 3.141592653589793D;
/* 170 */             d4 /= 180.0D;
/* 171 */             MainMemory.setF64(paramInt + 360, d4);
/* 172 */             if (MathUtils.f_oeq(d4, 0.0D)) {
/* 173 */               n = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 183 */               d4 = 1.0D / d4;
/* 184 */               MainMemory.setF64(paramInt + 368, d4);
/* 185 */               d1 += d2;
/* 186 */               d1 = d3 * d1;
/* 187 */               MainMemory.setF64(paramInt + 376, d1);
/* 188 */               if (MathUtils.f_oeq(d1, 0.0D)) {
/* 189 */                 n = 2;
/*     */               } else {
/*     */                 break label598;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 200 */       i = n;
/*     */       
/*     */ 
/*     */       break label829;
/*     */       
/*     */       label598:
/*     */       
/* 207 */       d1 = 1.0D / d1;
/* 208 */       MainMemory.setF64(paramInt + 384, d1);
/*     */       
/*     */ 
/*     */       label619:
/*     */       
/*     */ 
/* 214 */       MainMemory.setI32(paramInt + 448, 2834);
/* 215 */       MainMemory.setI32(paramInt + 452, 2835);
/* 216 */       i1 = paramInt + 344;
/* 217 */       MainMemory.setF64(i1, 0.0D);
/* 218 */       i2 = paramInt + 352;
/* 219 */       MainMemory.setF64(i2, 0.0D);
/* 220 */       i3 = paramInt + 256;
/* 221 */       if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */         i4 = paramInt + 264;
/* 232 */         if (!MathUtils.f_oeq(MainMemory.getF64(i4), 9.87654321E107D)) {
/*     */           break label759;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 242 */       MainMemory.setF64(i3, 0.0D);
/* 243 */       MainMemory.setF64(paramInt + 264, 0.0D);
/* 244 */       i = 0;
/*     */       
/*     */ 
/*     */       break label829;
/*     */       
/*     */       label759:
/*     */       
/* 251 */       if (cyps2x.call(paramInt, 1, 1, 1, 1, i3, i4, k, m, j) != 0) {
/*     */         break label822;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 261 */       MainMemory.setF64(i1, MainMemory.getF64(k));
/* 262 */       MainMemory.setF64(i2, MainMemory.getF64(m));
/* 263 */       i = 0;
/*     */       
/*     */ 
/*     */       break label829;
/*     */       
/*     */       label822:
/*     */       
/* 270 */       i = 2;
/*     */       
/*     */ 
/*     */       label829:
/*     */       
/*     */ 
/* 276 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 281 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cypset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */