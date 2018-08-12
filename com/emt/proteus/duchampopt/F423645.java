/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F423645 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3663;
/*  11 */   public static final Function _instance = new F423645();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F423645() { super("F423645", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
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
/*  49 */     int i5 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       i = MainMemory.getI32Aligned(459440);
/*  56 */       if (paramInt2 != 1) {
/*     */         break label171;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  66 */       j = MainMemory.getI32Aligned(459448);
/*  67 */       if (i >= 4)
/*     */       {
/*     */ 
/*     */ 
/*  71 */         paramInt2 = j;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*  79 */         paramInt2 = MainMemory.getI32Aligned(459444);
/*  80 */         j = MainMemory.getI8(paramInt1 + paramInt2) & 0xFF | j << 8;
/*  81 */         MainMemory.setI32Aligned(459448, j);
/*  82 */         MainMemory.setI32Aligned(459444, paramInt2 + 1);
/*  83 */         i += 8;
/*  84 */         MainMemory.setI32Aligned(459440, i);
/*  85 */         paramInt2 = j;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */       i += -4;
/*  95 */       MainMemory.setI32Aligned(459440, i);
/*  96 */       MainMemory.setI8(paramInt3, (byte)(paramInt2 >> i & 0xF));
/*     */       
/*     */ 
/*     */       break label767;
/*     */       
/*     */       label171:
/*     */       
/* 103 */       if (i != 8) {
/*     */         break label220;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI32Aligned(459444, MainMemory.getI32Aligned(459444) + -1);
/* 114 */       MainMemory.setI32Aligned(459440, 0);
/* 115 */       i = 0;
/*     */       
/*     */       break label242;
/*     */       
/*     */       label220:
/* 120 */       j = i + 4;
/* 121 */       if (i != 0) {
/*     */         break label425;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label242:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 133 */       if (paramInt2 <= 1)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 138 */         j = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 145 */         j = paramInt2 / 2;
/* 146 */         j = j > 1 ? j : 1;
/* 147 */         n = MainMemory.getI32Aligned(459448);
/* 148 */         m = MainMemory.getI32Aligned(459444);
/*     */         
/* 150 */         i2 = n;
/* 151 */         n = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 160 */           i1 = n << 1;
/* 161 */           i4 = paramInt3 + i1;
/* 162 */           i5 = paramInt3 + (i1 | 0x1);
/* 163 */           k = MainMemory.getI8(paramInt1 + m);
/* 164 */           i2 = k & 0xFF | i2 << 8;
/* 165 */           MainMemory.setI32Aligned(459448, i2);
/* 166 */           m += 1;
/* 167 */           MainMemory.setI32Aligned(459444, m);
/* 168 */           MainMemory.setI8(i4, MathUtils.lshr(k, 4));
/* 169 */           MainMemory.setI8(i5, MathUtils.and(k, (byte)15));
/* 170 */           n += 1;
/* 171 */           if (n == j)
/*     */           {
/*     */             break label611;
/* 174 */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label425:
/*     */         
/*     */ 
/*     */ 
/* 185 */         if (paramInt2 <= 1)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 190 */           j = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 197 */           m = paramInt2 / 2;
/* 198 */           m = m > 1 ? m : 1;
/* 199 */           i2 = MainMemory.getI32Aligned(459448);
/* 200 */           n = MainMemory.getI32Aligned(459444);
/*     */           
/* 202 */           i1 = i2;
/* 203 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 212 */             i3 = i2 << 1;
/* 213 */             i4 = paramInt3 + i3;
/* 214 */             i5 = paramInt3 + (i3 | 0x1);
/* 215 */             i1 = MainMemory.getI8(paramInt1 + n) & 0xFF | i1 << 8;
/* 216 */             MainMemory.setI32Aligned(459448, i1);
/* 217 */             n += 1;
/* 218 */             MainMemory.setI32Aligned(459444, n);
/* 219 */             MainMemory.setI8(i4, MathUtils.and((byte)(i1 >> j), (byte)15));
/* 220 */             MainMemory.setI8(i5, MathUtils.and((byte)(i1 >> i), (byte)15));
/* 221 */             i2 += 1;
/* 222 */             if (i2 == m)
/*     */             {
/* 224 */               j = m; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label611:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 239 */       if (j << 1 != paramInt2) {
/*     */         break label642;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label767;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label642:
/*     */       
/*     */ 
/*     */ 
/* 255 */       paramInt2 += -1;
/* 256 */       m = MainMemory.getI32Aligned(459448);
/* 257 */       if (i >= 4)
/*     */       {
/*     */ 
/*     */ 
/* 261 */         j = m;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 269 */         j = MainMemory.getI32Aligned(459444);
/* 270 */         m = MainMemory.getI8(paramInt1 + j) & 0xFF | m << 8;
/* 271 */         MainMemory.setI32Aligned(459448, m);
/* 272 */         MainMemory.setI32Aligned(459444, j + 1);
/* 273 */         i += 8;
/* 274 */         MainMemory.setI32Aligned(459440, i);
/* 275 */         j = m;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 284 */       i += -4;
/* 285 */       MainMemory.setI32Aligned(459440, i);
/* 286 */       MainMemory.setI8(paramInt3 + paramInt2, (byte)(j >> i & 0xF));
/*     */       
/*     */ 
/*     */       label767:
/*     */       
/*     */ 
/* 292 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F423645.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */