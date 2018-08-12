/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ceaset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2830;
/*  12 */   public static final Function _instance = new ceaset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ceaset() { super("ceaset", 1, false); }
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
/*  41 */     double d3 = 0.0D;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*     */     
/*     */ 
/*  49 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       k = MainMemory.alloc(8);
/*  55 */       m = MainMemory.alloc(8);
/*  56 */       if (paramInt == 0) {
/*  57 */         i4 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         MainMemory.setI32(paramInt, 202);
/*  68 */         MainMemory.setI32(paramInt + 4, 4277571);
/*  69 */         n = paramInt + 24;
/*  70 */         d1 = MainMemory.getF64(n);
/*  71 */         if (!MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*     */           break label139;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */         MainMemory.setF64(n, 1.0D);
/*  83 */         d1 = 1.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label139:
/*     */         
/*     */ 
/*  90 */         com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt + 276, 66560, 23, 1);
/*  91 */         MainMemory.setI32(paramInt + 316, 2);
/*  92 */         MainMemory.setI32(paramInt + 320, 101);
/*  93 */         MainMemory.setI32(paramInt + 324, 0);
/*  94 */         MainMemory.setI32(paramInt + 328, 1);
/*  95 */         MainMemory.setI32(paramInt + 332, 0);
/*  96 */         MainMemory.setI32(paramInt + 336, 1);
/*  97 */         MainMemory.setI32(paramInt + 340, 0);
/*  98 */         n = paramInt + 8;
/*  99 */         d2 = MainMemory.getF64(n);
/* 100 */         if (!MathUtils.f_oeq(d2, 0.0D)) {
/*     */           break label354;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         MainMemory.setF64(n, 57.29577951308232D);
/* 111 */         MainMemory.setF64(paramInt + 360, 1.0D);
/* 112 */         MainMemory.setF64(paramInt + 368, 1.0D);
/* 113 */         if ((MathUtils.f_ole(d1, 0.0D)) || (MathUtils.f_ogt(d1, 1.0D))) {
/* 114 */           i4 = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 124 */           d2 = 57.29577951308232D / d1;
/* 125 */           MainMemory.setF64(paramInt + 376, d2);
/* 126 */           d1 /= 57.29577951308232D;
/* 127 */           MainMemory.setF64(paramInt + 384, d1);
/*     */           
/*     */           break label484;
/*     */           
/*     */           label354:
/* 132 */           d3 = d2 * 3.141592653589793D;
/* 133 */           d3 /= 180.0D;
/* 134 */           MainMemory.setF64(paramInt + 360, d3);
/* 135 */           d3 = 57.29577951308232D / d2;
/* 136 */           MainMemory.setF64(paramInt + 368, d3);
/* 137 */           if ((MathUtils.f_ole(d1, 0.0D)) || (MathUtils.f_ogt(d1, 1.0D))) {
/* 138 */             i4 = 2;
/*     */           } else {
/*     */             break label445;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */       i = i4;
/*     */       
/*     */ 
/*     */       break label694;
/*     */       
/*     */       label445:
/*     */       
/* 156 */       d3 = d2 / d1;
/* 157 */       MainMemory.setF64(paramInt + 376, d3);
/* 158 */       d1 /= d2;
/* 159 */       MainMemory.setF64(paramInt + 384, d1);
/*     */       
/*     */ 
/*     */       label484:
/*     */       
/*     */ 
/* 165 */       MainMemory.setI32(paramInt + 448, 2831);
/* 166 */       MainMemory.setI32(paramInt + 452, 2832);
/* 167 */       n = paramInt + 344;
/* 168 */       MainMemory.setF64(n, 0.0D);
/* 169 */       i1 = paramInt + 352;
/* 170 */       MainMemory.setF64(i1, 0.0D);
/* 171 */       i2 = paramInt + 256;
/* 172 */       if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */         i3 = paramInt + 264;
/* 183 */         if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */           break label624;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 193 */       MainMemory.setF64(i2, 0.0D);
/* 194 */       MainMemory.setF64(paramInt + 264, 0.0D);
/* 195 */       i = 0;
/*     */       
/*     */ 
/*     */       break label694;
/*     */       
/*     */       label624:
/*     */       
/* 202 */       if (ceas2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */         break label687;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 212 */       MainMemory.setF64(n, MainMemory.getF64(k));
/* 213 */       MainMemory.setF64(i1, MainMemory.getF64(m));
/* 214 */       i = 0;
/*     */       
/*     */ 
/*     */       break label694;
/*     */       
/*     */       label687:
/*     */       
/* 221 */       i = 2;
/*     */       
/*     */ 
/*     */       label694:
/*     */       
/*     */ 
/* 227 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 232 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ceaset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */