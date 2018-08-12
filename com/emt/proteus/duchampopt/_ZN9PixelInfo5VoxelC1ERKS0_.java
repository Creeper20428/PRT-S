/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo5VoxelC1ERKS0_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 314;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo5VoxelC1ERKS0_();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo5VoxelC1ERKS0_() { super("_ZN9PixelInfo5VoxelC1ERKS0_", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       MainMemory.setI32(paramInt1, 12904);
/* 43 */       if (paramInt1 != paramInt2) {
/*    */         break label35;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label94;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label35:
/*    */       
/*    */ 
/*    */ 
/* 59 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt2 + 4));
/* 60 */       MainMemory.setI32(paramInt1 + 8, MainMemory.getI32(paramInt2 + 8));
/* 61 */       MainMemory.setI32(paramInt1 + 12, MainMemory.getI32(paramInt2 + 12));
/* 62 */       MainMemory.setF32(paramInt1 + 16, MainMemory.getF32(paramInt2 + 16));
/*    */       
/*    */ 
/*    */       label94:
/*    */       
/*    */ 
/* 68 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo5VoxelC1ERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */