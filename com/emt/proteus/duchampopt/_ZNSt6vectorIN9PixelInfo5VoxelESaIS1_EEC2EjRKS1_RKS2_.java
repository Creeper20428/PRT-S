/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.lib.api.MathUtils;
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EEC2EjRKS1_RKS2_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 437;
/* 13 */   public static final Function _instance = new _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EEC2EjRKS1_RKS2_();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EEC2EjRKS1_RKS2_() { super("_ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EEC2EjRKS1_RKS2_", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     call(i, j, k);
/* 36 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 42 */     int i = 0;
/* 43 */     int j = 0;
/* 44 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 50 */       MainMemory.setI32(paramInt1, 0);
/* 51 */       i = paramInt1 + 4;
/* 52 */       MainMemory.setI32(i, 0);
/* 53 */       j = paramInt1 + 8;
/* 54 */       MainMemory.setI32(j, 0);
/* 55 */       if (!MathUtils.ugt(paramInt2, 214748364)) {
/*    */         break label64;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */       com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv.call();
/*    */       
/*    */ 
/*    */       label64:
/*    */       
/*    */ 
/* 71 */       k = com.emt.proteus.runtime.api.SystemLibrary.newobject(paramInt2 * 20);
/* 72 */       MainMemory.setI32(paramInt1, k);
/* 73 */       MainMemory.setI32(i, k);
/* 74 */       MainMemory.setI32(j, k + paramInt2 * 20);
/* 75 */       _ZSt26__uninitialized_fill_n_auxIPN9PixelInfo5VoxelEjS1_EvT_T0_RKT1_St12__false_type.call(k, paramInt2, paramInt3);
/* 76 */       MainMemory.setI32(i, MainMemory.getI32(paramInt1) + paramInt2 * 20); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZNSt6vectorIN9PixelInfo5VoxelESaIS1_EEC2EjRKS1_RKS2_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */