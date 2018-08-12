/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt9make_heapIPfEvT_S1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2698;
/*  11 */   public static final Function _instance = new _ZSt9make_heapIPfEvT_S1_();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZSt9make_heapIPfEvT_S1_() { super("_ZSt9make_heapIPfEvT_S1_", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     float f1 = 0.0F;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  54 */       i = paramInt2 - paramInt1;
/*  55 */       if (i >= 8)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         i >>= 2;
/*  66 */         j = (i + -2) / 2;
/*  67 */         k = j << 1;
/*  68 */         m = k + 2;
/*  69 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  76 */         i1 = j - n;
/*  77 */         i2 = n * -2;
/*  78 */         i5 = k + i2;
/*  79 */         i2 = m + i2;
/*  80 */         f1 = MainMemory.getF32(paramInt1 + (i1 << 2));
/*  81 */         if (i2 < i)
/*     */         {
/*  83 */           i3 = i5;
/*  84 */           i4 = i1;
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*  89 */           i4 = i5;
/*  90 */           i5 = i1;
/*     */           
/*     */ 
/*     */ 
/*     */           break label252;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 100 */           i5 = i3 | 0x1;
/* 101 */           i5 = com.emt.proteus.lib.api.MathUtils.f_olt(MainMemory.getF32(paramInt1 + (i2 << 2)), MainMemory.getF32(paramInt1 + (i5 << 2))) ? i5 : i2;
/* 102 */           MainMemory.setF32(paramInt1 + (i4 << 2), MainMemory.getF32(paramInt1 + (i5 << 2)));
/* 103 */           i4 = i5 << 1;
/* 104 */           i2 = i4 + 2;
/* 105 */           if (i2 >= i)
/*     */             break;
/* 107 */           i3 = i4;
/* 108 */           i4 = i5;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label252:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */         if (i2 != i) {
/*     */           break label304;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 135 */         i2 = i4 | 0x1;
/* 136 */         MainMemory.setF32(paramInt1 + (i5 << 2), MainMemory.getF32(paramInt1 + (i2 << 2)));
/* 137 */         i5 = i2;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*     */           label304:
/*     */           
/* 144 */           i2 = (i5 + -1) / 2;
/* 145 */           if (i5 <= i1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 155 */           f2 = MainMemory.getF32(paramInt1 + (i2 << 2));
/* 156 */           if (!com.emt.proteus.lib.api.MathUtils.f_olt(f2, f1)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */           MainMemory.setF32(paramInt1 + (i5 << 2), f2);
/* 167 */           i5 = i2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 172 */         MainMemory.setF32(paramInt1 + (i5 << 2), f1);
/* 173 */         if (j != n) {
/*     */           break label433;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */         break;
/*     */         
/*     */ 
/*     */         label433:
/*     */         
/*     */ 
/* 189 */         n += 1;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt9make_heapIPfEvT_S1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */