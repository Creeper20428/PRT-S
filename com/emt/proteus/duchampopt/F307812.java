/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.free;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class F307812 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3198;
/*  14 */   public static final Function _instance = new F307812();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public F307812() { super("F307812", 2, false); }
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  50 */       if (paramInt1 % 25 != 0) {
/*     */         break label274;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */       if (paramInt1 != 0) {
/*     */         break label81;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */       j = malloc.call(6100);
/*  71 */       MainMemory.setI32Aligned(470820, j);
/*  72 */       k = malloc.call(3100);
/*     */       
/*     */ 
/*     */       break label132;
/*     */       
/*     */       label81:
/*     */       
/*  79 */       MainMemory.setI32Aligned(470820, com.emt.proteus.runtime.library.c.realloc.call(MainMemory.getI32Aligned(470820), paramInt1 * 244 + 6100));
/*  80 */       k = com.emt.proteus.runtime.library.c.realloc.call(MainMemory.getI32Aligned(470824), paramInt1 * 124 + 3100);
/*  81 */       j = MainMemory.getI32Aligned(470820);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label132:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  91 */       m = k;
/*  92 */       MainMemory.setI32Aligned(470824, m);
/*  93 */       n = j == 0 ? 1 : 0;
/*  94 */       if (n == 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */         if (k != 0) {
/*     */           break label286;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */         if (n == 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */           free.call(j);
/* 128 */           m = MainMemory.getI32Aligned(470824);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */       if (m != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */         free.call(m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 152 */       MainMemory.setI32Aligned(470820, 0);
/* 153 */       MainMemory.setI32Aligned(470824, 0);
/* 154 */       MainMemory.setI32(paramInt2, 113);
/* 155 */       i = 113;
/*     */       
/*     */ 
/*     */       break label324;
/*     */       
/*     */       label274:
/*     */       
/* 162 */       m = MainMemory.getI32Aligned(470824);
/*     */       
/*     */ 
/*     */ 
/*     */       label286:
/*     */       
/*     */ 
/*     */ 
/* 170 */       MainMemory.setI32(m + paramInt1 * 124 + 120, 0);
/* 171 */       MainMemory.setI32(MainMemory.getI32Aligned(470824) + paramInt1 * 124 + 116, 0);
/* 172 */       i = 0;
/*     */       
/*     */ 
/*     */       label324:
/*     */       
/*     */ 
/* 178 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F307812.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */