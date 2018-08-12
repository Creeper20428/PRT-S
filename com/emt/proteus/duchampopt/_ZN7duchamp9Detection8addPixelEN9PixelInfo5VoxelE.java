/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp9Detection8addPixelEN9PixelInfo5VoxelE extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 756;
/* 12 */   public static final Function _instance = new _ZN7duchamp9Detection8addPixelEN9PixelInfo5VoxelE();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp9Detection8addPixelEN9PixelInfo5VoxelE() { super("_ZN7duchamp9Detection8addPixelEN9PixelInfo5VoxelE", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 19 */     call(paramInt1, paramInt2);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     call(i, j);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 38 */     int i = 0;
/* 39 */     int j = 0;
/* 40 */     int k = 0;
/* 41 */     int m = 0;
/* 42 */     float f1 = 0.0F;
/* 43 */     float f2 = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       i = MainMemory.getI32(paramInt2 + 12);
/* 50 */       j = MainMemory.getI32(paramInt2 + 8);
/* 51 */       k = MainMemory.getI32(paramInt2 + 4);
/* 52 */       _ZN9PixelInfo8Object3D8addPixelElll.call(paramInt1, k, j, i);
/* 53 */       m = paramInt1 + 84;
/* 54 */       f1 = MainMemory.getF32(paramInt2 + 16);
/* 55 */       f2 = MainMemory.getF32(m) + f1;
/* 56 */       MainMemory.setF32(m, f2);
/* 57 */       m = paramInt1 + 96;
/* 58 */       if (!com.emt.proteus.lib.api.MathUtils.f_ogt(f1, MainMemory.getF32(m))) {
/*    */         break label156;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 68 */       MainMemory.setF32(m, f1);
/* 69 */       MainMemory.setI32(paramInt1 + 100, k);
/* 70 */       MainMemory.setI32(paramInt1 + 104, j);
/* 71 */       MainMemory.setI32(paramInt1 + 108, i);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       label156:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 83 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection8addPixelEN9PixelInfo5VoxelE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */