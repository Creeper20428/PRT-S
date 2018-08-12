/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class F292460 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3177;
/*  13 */   public static final Function _instance = new F292460();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F292460() { super("F292460", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  20 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = call(i);
/*  29 */     paramFrame.setI32(paramInt1, j);
/*  30 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt)
/*     */   {
/*  35 */     int i = 0;
/*     */     
/*  37 */     int j = 0;
/*  38 */     int k = 0;
/*  39 */     int m = 0;
/*  40 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  46 */       j = MainMemory.getI32Aligned(470796);
/*  47 */       k = MainMemory.getI32Aligned(470800);
/*  48 */       if (j != k)
/*     */       {
/*     */ 
/*     */ 
/*  52 */         k = j;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  59 */         m = MainMemory.getI32Aligned(470792);
/*  60 */         if (m != 0) {
/*     */           break label93;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  70 */         MainMemory.setI32Aligned(470800, 100);
/*  71 */         n = malloc.call(34400);
/*     */         
/*     */         break label118;
/*     */         
/*     */         label93:
/*     */         
/*  77 */         MainMemory.setI32Aligned(470800, k << 1);
/*  78 */         n = com.emt.proteus.runtime.library.c.realloc.call(m, k * 688);
/*     */         
/*     */ 
/*     */ 
/*     */         label118:
/*     */         
/*     */ 
/*     */ 
/*  86 */         if (n != 0) {
/*     */           break label155;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */         MainMemory.setI32Aligned(470852, 113);
/*  97 */         i = -1;
/*     */         
/*     */ 
/*     */         break label216;
/*     */         
/*     */         label155:
/*     */         
/* 104 */         MainMemory.setI32Aligned(470792, n);
/* 105 */         k = MainMemory.getI32Aligned(470796);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI32Aligned(470796, k + 1);
/* 114 */       if (k <= -1) {
/*     */         break label209;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 124 */       F292460_016.call(paramInt, k);
/*     */       
/*     */ 
/*     */       label209:
/*     */       
/*     */ 
/* 130 */       i = k;
/*     */       
/*     */ 
/*     */       label216:
/*     */       
/*     */ 
/* 136 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F292460.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */