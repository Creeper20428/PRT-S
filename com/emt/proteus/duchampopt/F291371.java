/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.c.malloc;
/*     */ 
/*     */ public final class F291371 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3172;
/*  13 */   public static final Function _instance = new F291371();
/*  14 */   public final Function resolve() { return _instance; }
/*     */   
/*  16 */   public F291371() { super("F291371", 0, false); }
/*     */   
/*     */   public int execute()
/*     */   {
/*  20 */     return call();
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = call();
/*  26 */     paramFrame.setI32(paramInt1, i);
/*  27 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call()
/*     */   {
/*  32 */     int i = 0;
/*     */     
/*  34 */     int j = 0;
/*  35 */     int k = 0;
/*  36 */     int m = 0;
/*  37 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  43 */       j = MainMemory.getI32Aligned(470796);
/*  44 */       k = MainMemory.getI32Aligned(470800);
/*  45 */       if (j != k)
/*     */       {
/*     */ 
/*     */ 
/*  49 */         k = j;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  56 */         m = MainMemory.getI32Aligned(470792);
/*  57 */         if (m != 0) {
/*     */           break label90;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */         MainMemory.setI32Aligned(470800, 100);
/*  68 */         n = malloc.call(34400);
/*     */         
/*     */         break label114;
/*     */         
/*     */         label90:
/*     */         
/*  74 */         MainMemory.setI32Aligned(470800, k << 1);
/*  75 */         n = com.emt.proteus.runtime.library.c.realloc.call(m, k * 688);
/*     */         
/*     */ 
/*     */ 
/*     */         label114:
/*     */         
/*     */ 
/*     */ 
/*  83 */         if (n != 0) {
/*     */           break label151;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */         MainMemory.setI32Aligned(470852, 113);
/*  94 */         i = -1;
/*     */         
/*     */ 
/*     */         break label184;
/*     */         
/*     */         label151:
/*     */         
/* 101 */         MainMemory.setI32Aligned(470792, n);
/* 102 */         k = MainMemory.getI32Aligned(470796);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       MainMemory.setI32Aligned(470796, k + 1);
/* 111 */       i = k;
/*     */       
/*     */ 
/*     */       label184:
/*     */       
/*     */ 
/* 117 */       int i1 = i; return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F291371.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */