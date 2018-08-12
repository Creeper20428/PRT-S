/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class hpxset extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2794;
/*  12 */   public static final Function _instance = new hpxset();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public hpxset() { super("hpxset", 1, false); }
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
/*  43 */     double d4 = 0.0D;
/*  44 */     double d5 = 0.0D;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*     */     
/*     */ 
/*  51 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  55 */       j = MainMemory.alloc(4);
/*  56 */       k = MainMemory.alloc(8);
/*  57 */       m = MainMemory.alloc(8);
/*  58 */       if (paramInt == 0) {
/*  59 */         i4 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  69 */         MainMemory.setI32(paramInt, 801);
/*  70 */         MainMemory.setI32(paramInt + 4, 5787720);
/*  71 */         n = paramInt + 24;
/*  72 */         d1 = MainMemory.getF64(n);
/*  73 */         if (!MathUtils.f_oeq(d1, 9.87654321E107D)) {
/*     */           break label149;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         MainMemory.setF64(n, 4.0D);
/*  85 */         d1 = 4.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label149:
/*     */         
/*     */ 
/*  92 */         n = paramInt + 32;
/*  93 */         d2 = MainMemory.getF64(n);
/*  94 */         if (!MathUtils.f_oeq(d2, 9.87654321E107D)) {
/*     */           break label204;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         MainMemory.setF64(n, 3.0D);
/* 106 */         d2 = 3.0D;
/*     */         
/*     */ 
/*     */ 
/*     */         label204:
/*     */         
/*     */ 
/* 113 */         MainMemory.setI64(paramInt + 276, 33892790802924872L);
/* 114 */         MainMemory.setI32(paramInt + 316, 8);
/* 115 */         MainMemory.setI32(paramInt + 320, 102);
/* 116 */         MainMemory.setI32(paramInt + 324, 0);
/* 117 */         MainMemory.setI32(paramInt + 328, 1);
/* 118 */         MainMemory.setI32(paramInt + 332, 0);
/* 119 */         MainMemory.setI32(paramInt + 336, 1);
/* 120 */         MainMemory.setI32(paramInt + 340, 0);
/* 121 */         if ((!MathUtils.f_ugt(d1, 0.0D)) || (!MathUtils.f_ugt(d2, 0.0D)))
/*     */         {
/*     */ 
/*     */ 
/* 125 */           i4 = 2;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 132 */           d3 = d1 + 0.5D;
/* 133 */           MainMemory.setI32(paramInt + 440, (int)d3 % 2);
/* 134 */           d3 = d2 + 0.5D;
/* 135 */           MainMemory.setI32(paramInt + 444, (int)d3 % 2);
/* 136 */           n = paramInt + 8;
/* 137 */           d3 = MainMemory.getF64(n);
/* 138 */           if (!MathUtils.f_oeq(d3, 0.0D)) {
/*     */             break label430;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 148 */           MainMemory.setF64(n, 57.29577951308232D);
/* 149 */           MainMemory.setF64(paramInt + 360, 1.0D);
/* 150 */           MainMemory.setF64(paramInt + 368, 1.0D);
/* 151 */           d3 = 1.0D;
/*     */           
/*     */           break label483;
/*     */           
/*     */           label430:
/* 156 */           d5 = d3 * 3.141592653589793D;
/* 157 */           d5 /= 180.0D;
/* 158 */           MainMemory.setF64(paramInt + 360, d5);
/* 159 */           d3 = 57.29577951308232D / d3;
/* 160 */           MainMemory.setF64(paramInt + 368, d3);
/* 161 */           d3 = d5;
/*     */           
/*     */ 
/*     */ 
/*     */           label483:
/*     */           
/*     */ 
/* 168 */           d4 = d2 + -1.0D;
/* 169 */           d5 = d4 / d2;
/* 170 */           MainMemory.setF64(paramInt + 376, d5);
/* 171 */           d5 = d2 * 90.0D;
/* 172 */           d5 /= d1;
/* 173 */           MainMemory.setF64(paramInt + 384, d5);
/* 174 */           d2 += 1.0D;
/* 175 */           d2 *= 0.5D;
/* 176 */           MainMemory.setF64(paramInt + 392, d2);
/* 177 */           d2 = d4 * 90.0D;
/* 178 */           d2 /= d1;
/* 179 */           MainMemory.setF64(paramInt + 400, d2);
/* 180 */           d2 = 180.0D / d1;
/* 181 */           MainMemory.setF64(paramInt + 408, d2);
/* 182 */           d1 /= 360.0D;
/* 183 */           MainMemory.setF64(paramInt + 416, d1);
/* 184 */           d1 = d5 * d3;
/* 185 */           MainMemory.setF64(paramInt + 424, d1);
/* 186 */           d1 = d2 * d3;
/* 187 */           MainMemory.setF64(paramInt + 432, d1);
/* 188 */           MainMemory.setI32(paramInt + 448, 2795);
/* 189 */           MainMemory.setI32(paramInt + 452, 2796);
/* 190 */           n = paramInt + 344;
/* 191 */           MainMemory.setF64(n, 0.0D);
/* 192 */           i1 = paramInt + 352;
/* 193 */           MainMemory.setF64(i1, 0.0D);
/* 194 */           i2 = paramInt + 256;
/* 195 */           if (!MathUtils.f_oeq(MainMemory.getF64(i2), 9.87654321E107D))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */             i3 = paramInt + 264;
/* 206 */             if (!MathUtils.f_oeq(MainMemory.getF64(i3), 9.87654321E107D)) {
/*     */               break label792;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 216 */           MainMemory.setF64(i2, 0.0D);
/* 217 */           MainMemory.setF64(paramInt + 264, 0.0D);
/* 218 */           i = 0;
/*     */           
/*     */ 
/*     */           break label875;
/*     */           
/*     */           label792:
/*     */           
/* 225 */           if (hpxs2x.call(paramInt, 1, 1, 1, 1, i2, i3, k, m, j) != 0) {
/*     */             break label855;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 235 */           MainMemory.setF64(n, MainMemory.getF64(k));
/* 236 */           MainMemory.setF64(i1, MainMemory.getF64(m));
/* 237 */           i = 0;
/*     */           
/*     */ 
/*     */           break label875;
/*     */           
/*     */           label855:
/*     */           
/* 244 */           i = 2;
/*     */           
/*     */ 
/*     */           break label875;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 252 */       i = i4;
/*     */       
/*     */ 
/*     */       label875:
/*     */       
/*     */ 
/* 258 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 263 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/hpxset.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */