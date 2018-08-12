/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object2DC1ERKS0_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 359;
/* 12 */   public static final Function _instance = new _ZN9PixelInfo8Object2DC1ERKS0_();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN9PixelInfo8Object2DC1ERKS0_() { super("_ZN9PixelInfo8Object2DC1ERKS0_", 2, false); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 43 */       MainMemory.setI32(paramInt1, 12936);
/* 44 */       MainMemory.setI32(paramInt1 + 4, 0);
/* 45 */       MainMemory.setI32(paramInt1 + 8, 0);
/* 46 */       MainMemory.setI32(paramInt1 + 12, 0);
/* 47 */       if (paramInt1 != paramInt2) {
/*    */         break label58;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label170;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label58:
/*    */       
/*    */ 
/*    */ 
/* 63 */       _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EEaSERKS3_.call(paramInt1 + 4, paramInt2 + 4);
/* 64 */       MainMemory.setI32(paramInt1 + 16, MainMemory.getI32(paramInt2 + 16));
/* 65 */       MainMemory.setF32(paramInt1 + 20, MainMemory.getF32(paramInt2 + 20));
/* 66 */       MainMemory.setF32(paramInt1 + 24, MainMemory.getF32(paramInt2 + 24));
/* 67 */       MainMemory.setI32(paramInt1 + 28, MainMemory.getI32(paramInt2 + 28));
/* 68 */       MainMemory.setI32(paramInt1 + 36, MainMemory.getI32(paramInt2 + 36));
/* 69 */       MainMemory.setI32(paramInt1 + 32, MainMemory.getI32(paramInt2 + 32));
/* 70 */       MainMemory.setI32(paramInt1 + 40, MainMemory.getI32(paramInt2 + 40));
/*    */       
/*    */ 
/*    */       label170:
/*    */       
/*    */ 
/* 76 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2DC1ERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */