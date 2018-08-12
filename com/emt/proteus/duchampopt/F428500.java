/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F428500 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3678;
/*  11 */   public static final Function _instance = new F428500();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F428500() { super("F428500", 3, false); }
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
/*  46 */     short s1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     short s2 = 0;
/*  49 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  55 */       i = MainMemory.getI32(paramInt1 + 2908 + (paramInt3 << 2));
/*  56 */       j = paramInt1 + 5208 + i;
/*  57 */       k = paramInt1 + 5200;
/*  58 */       m = paramInt2 + (i << 2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  66 */         i3 = paramInt3 << 1;
/*  67 */         n = MainMemory.getI32(k);
/*  68 */         if (n >= i3)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */           if (n <= i3) {
/*     */             break label264;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */           n = i3 | 0x1;
/*  90 */           i1 = MainMemory.getI32(paramInt1 + 2908 + (n << 2));
/*  91 */           s1 = MainMemory.getI16(paramInt2 + (i1 << 2));
/*  92 */           i2 = MainMemory.getI32(paramInt1 + 2908 + (i3 << 2));
/*  93 */           s2 = MainMemory.getI16(paramInt2 + (i2 << 2));
/*  94 */           if (!MathUtils.ult(s1, s2))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */             if (s1 != s2) {
/*     */               break label264;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */             if (MathUtils.ugt(MainMemory.getI8(paramInt1 + 5208 + i1), MainMemory.getI8(paramInt1 + 5208 + i2))) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 126 */             i3 = n;
/*     */           }
/*     */           
/*     */ 
/*     */           label264:
/*     */           
/*     */ 
/* 133 */           s1 = MainMemory.getI16(m);
/* 134 */           n = MainMemory.getI32(paramInt1 + 2908 + (i3 << 2));
/* 135 */           s2 = MainMemory.getI16(paramInt2 + (n << 2));
/* 136 */           if (!MathUtils.ult(s1, s2))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */             if (s1 != s2) {
/*     */               break label392;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */             if (MathUtils.ugt(MainMemory.getI8(j), MainMemory.getI8(paramInt1 + 5208 + n))) {
/*     */               break label392;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 166 */         MainMemory.setI32(paramInt1 + 2908 + (paramInt3 << 2), i);
/* 167 */         break;
/*     */         
/*     */ 
/*     */         label392:
/*     */         
/*     */ 
/* 173 */         MainMemory.setI32(paramInt1 + 2908 + (paramInt3 << 2), n);
/* 174 */         paramInt3 = i3;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F428500.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */