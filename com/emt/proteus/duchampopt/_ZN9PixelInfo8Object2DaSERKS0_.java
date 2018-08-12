/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object2DaSERKS0_ extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 358;
/* 12 */   public static final Function _instance = new _ZN9PixelInfo8Object2DaSERKS0_();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN9PixelInfo8Object2DaSERKS0_() { super("_ZN9PixelInfo8Object2DaSERKS0_", 2, false); }
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
/* 43 */       if (paramInt1 != paramInt2) {
/*    */         break label28;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label140;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label28:
/*    */       
/*    */ 
/*    */ 
/* 59 */       _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EEaSERKS3_.call(paramInt1 + 4, paramInt2 + 4);
/* 60 */       MainMemory.setI32(paramInt1 + 16, MainMemory.getI32(paramInt2 + 16));
/* 61 */       MainMemory.setF32(paramInt1 + 20, MainMemory.getF32(paramInt2 + 20));
/* 62 */       MainMemory.setF32(paramInt1 + 24, MainMemory.getF32(paramInt2 + 24));
/* 63 */       MainMemory.setI32(paramInt1 + 28, MainMemory.getI32(paramInt2 + 28));
/* 64 */       MainMemory.setI32(paramInt1 + 36, MainMemory.getI32(paramInt2 + 36));
/* 65 */       MainMemory.setI32(paramInt1 + 32, MainMemory.getI32(paramInt2 + 32));
/* 66 */       MainMemory.setI32(paramInt1 + 40, MainMemory.getI32(paramInt2 + 40));
/*    */       
/*    */ 
/*    */       label140:
/*    */       
/*    */ 
/* 72 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2DaSERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */