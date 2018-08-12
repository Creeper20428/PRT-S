/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ import com.emt.proteus.runtime.library.c.realloc;
/*     */ 
/*     */ public final class F292555 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3178;
/*  14 */   public static final Function _instance = new F292555();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F292555() { super("F292555", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2);
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
/*  32 */     int k = call(i, j);
/*  33 */     paramFrame.setI32(paramInt1, k);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  39 */     int i = 0;
/*     */     
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       j = F292460.call(paramInt1);
/*  53 */       if (j < 0) {
/*  54 */         paramInt1 = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  64 */         k = MainMemory.getI32Aligned(470796);
/*  65 */         n = MainMemory.getI32Aligned(470800);
/*  66 */         if (k != n)
/*     */         {
/*     */ 
/*     */ 
/*  70 */           n = k;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*  77 */           i1 = MainMemory.getI32Aligned(470792);
/*  78 */           if (i1 != 0) {
/*     */             break label127;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */           MainMemory.setI32Aligned(470800, 100);
/*  89 */           m = malloc.call(34400);
/*     */           
/*     */           break label154;
/*     */           
/*     */           label127:
/*     */           
/*  95 */           MainMemory.setI32Aligned(470800, n << 1);
/*  96 */           m = realloc.call(i1, n * 688);
/*     */           
/*     */ 
/*     */ 
/*     */           label154:
/*     */           
/*     */ 
/*     */ 
/* 104 */           if (m != 0) {
/*     */             break label191;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 114 */           MainMemory.setI32Aligned(470852, 113);
/* 115 */           i = -1;
/*     */           
/*     */ 
/*     */           break label555;
/*     */           
/*     */           label191:
/*     */           
/* 122 */           MainMemory.setI32Aligned(470792, m);
/* 123 */           n = MainMemory.getI32Aligned(470796);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         MainMemory.setI32Aligned(470796, n + 1);
/* 132 */         if (n <= -1)
/*     */         {
/*     */ 
/*     */ 
/* 136 */           paramInt1 = n;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 143 */           i1 = MainMemory.getI32Aligned(470792);
/* 144 */           MainMemory.setI32(i1 + n * 344, 123);
/* 145 */           MainMemory.setI32(i1 + n * 344 + 4, 3179);
/* 146 */           MainMemory.setI32(i1 + n * 344 + 8, 2);
/* 147 */           MainMemory.setI32(i1 + n * 344 + 12, j);
/* 148 */           MainMemory.setI32(i1 + n * 344 + 12 + 4, paramInt2);
/* 149 */           MainMemory.setI32(i1 + n * 344 + 52, MainMemory.getI32(MainMemory.getI32Aligned(470824) + paramInt1 * 124 + 84));
/* 150 */           MainMemory.setI32(i1 + n * 344 + 56, MainMemory.getI32(MainMemory.getI32Aligned(470824) + paramInt1 * 124 + 88));
/* 151 */           MainMemory.setI32(i1 + n * 344 + 56 + 4, MainMemory.getI32(MainMemory.getI32Aligned(470824) + paramInt1 * 124 + 92));
/* 152 */           i2 = MainMemory.getI32Aligned(470824);
/* 153 */           if (MainMemory.getI32(i2 + paramInt1 * 124 + 92) > 0)
/*     */           {
/* 155 */             paramInt2 = 0;
/*     */           }
/*     */           else
/*     */           {
/* 159 */             paramInt1 = n;
/*     */             
/*     */ 
/*     */             break label548;
/*     */           }
/*     */           
/*     */ 
/*     */           for (;;)
/*     */           {
/* 168 */             MainMemory.setI32(i1 + n * 344 + 56 + 8 + (paramInt2 << 2), MainMemory.getI32(i2 + paramInt1 * 124 + 96 + (paramInt2 << 2)));
/* 169 */             paramInt2 += 1;
/* 170 */             i2 = MainMemory.getI32Aligned(470824);
/* 171 */             if (MainMemory.getI32(i2 + paramInt1 * 124 + 92) <= paramInt2) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           break label548;
/* 176 */           paramInt1 = n;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label548:
/*     */       
/*     */ 
/* 185 */       i = paramInt1;
/*     */       
/*     */ 
/*     */       label555:
/*     */       
/*     */ 
/* 191 */       int i3 = i; return i3;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F292555.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */