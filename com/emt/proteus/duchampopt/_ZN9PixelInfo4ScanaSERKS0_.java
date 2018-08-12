/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo4ScanaSERKS0_ extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 323;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo4ScanaSERKS0_();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo4ScanaSERKS0_() { super("_ZN9PixelInfo4ScanaSERKS0_", 2, false); }
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
/* 42 */       if (paramInt1 != paramInt2) {
/*    */         break label28;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label73;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label28:
/*    */       
/*    */ 
/*    */ 
/* 58 */       MainMemory.setI32(paramInt1 + 4, MainMemory.getI32(paramInt2 + 4));
/* 59 */       MainMemory.setI32(paramInt1 + 8, MainMemory.getI32(paramInt2 + 8));
/* 60 */       MainMemory.setI32(paramInt1 + 12, MainMemory.getI32(paramInt2 + 12));
/*    */       
/*    */ 
/*    */       label73:
/*    */       
/*    */ 
/* 66 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo4ScanaSERKS0_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */