/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZSt13__heap_selectIPfEvT_S1_S1_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2697;
/*  12 */   public static final Function _instance = new _ZSt13__heap_selectIPfEvT_S1_S1_();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZSt13__heap_selectIPfEvT_S1_S1_() { super("_ZSt13__heap_selectIPfEvT_S1_S1_", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j, k);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     float f1 = 0.0F;
/*  47 */     int i1 = 0;
/*  48 */     int i2 = 0;
/*  49 */     int i3 = 0;
/*  50 */     int i4 = 0;
/*  51 */     float f2 = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  57 */       _ZSt9make_heapIPfEvT_S1_.call(paramInt1, paramInt2);
/*  58 */       if (!MathUtils.ult(paramInt2, paramInt3)) {
/*     */         break label461;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */       i = paramInt2 - paramInt1 >> 2;
/*  69 */       j = i > 2 ? 1 : 0;
/*  70 */       m = 0;
/*     */       
/*     */       label293:
/*     */       
/*     */       label339:
/*     */       do
/*     */       {
/*  77 */         k = paramInt2 + (m << 2);
/*  78 */         m += 1;
/*  79 */         n = paramInt2 + (m << 2);
/*  80 */         f1 = MainMemory.getF32(k);
/*  81 */         f2 = MainMemory.getF32(paramInt1);
/*  82 */         if (!MathUtils.f_olt(f1, f2)) {}
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         MainMemory.setF32(k, f2);
/*  93 */         if (j != 0) {
/*  94 */           i1 = 2;
/*  95 */           i2 = 0;
/*  96 */           i3 = 0;
/*     */         }
/*     */         else
/*     */         {
/* 100 */           i1 = 2;
/* 101 */           i3 = 1;
/* 102 */           i4 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */           break label293;
/*     */         }
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/* 112 */           i4 = i2 | 0x1;
/* 113 */           i4 = MathUtils.f_olt(MainMemory.getF32(paramInt1 + (i1 << 2)), MainMemory.getF32(paramInt1 + (i4 << 2))) ? i4 : i1;
/* 114 */           MainMemory.setF32(paramInt1 + (i3 << 2), MainMemory.getF32(paramInt1 + (i4 << 2)));
/* 115 */           i3 = i4 << 1;
/* 116 */           i1 = i3 + 2;
/* 117 */           if (i1 >= i)
/*     */             break;
/* 119 */           i2 = i3;
/* 120 */           i3 = i4;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         i3 |= 0x1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         if (i1 != i) {
/*     */           break label339;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */         MainMemory.setF32(paramInt1 + (i4 << 2), MainMemory.getF32(paramInt1 + (i3 << 2)));
/* 154 */         i4 = i3;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 161 */           i1 = (i4 + -1) / 2;
/* 162 */           if (i4 <= 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */           f2 = MainMemory.getF32(paramInt1 + (i1 << 2));
/* 173 */           if (!MathUtils.f_olt(f2, f1)) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           MainMemory.setF32(paramInt1 + (i4 << 2), f2);
/* 184 */           i4 = i1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 189 */         MainMemory.setF32(paramInt1 + (i4 << 2), f1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/* 195 */       while (MathUtils.ult(n, paramInt3));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label461:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt13__heap_selectIPfEvT_S1_S1_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */