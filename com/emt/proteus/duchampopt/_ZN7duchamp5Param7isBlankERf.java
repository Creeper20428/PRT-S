/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp5Param7isBlankERf extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 139;
/* 11 */   public static final Function _instance = new _ZN7duchamp5Param7isBlankERf();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp5Param7isBlankERf() { super("_ZN7duchamp5Param7isBlankERf", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     return call(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     byte b = call(i, j);
/* 30 */     paramFrame.setI8(paramInt1, b);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static byte call(int paramInt1, int paramInt2)
/*    */   {
/* 36 */     byte b1 = 0;
/*    */     
/* 38 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 44 */       if (MainMemory.getI8(paramInt1 + 209) != 0) {
/*    */         break label43;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */       b1 = 0;
/*    */       
/*    */ 
/*    */       break label94;
/*    */       
/*    */       label43:
/*    */       
/* 61 */       f = MainMemory.getF32(paramInt2) - MainMemory.getF32(paramInt1 + 224);
/* 62 */       f /= MainMemory.getF32(paramInt1 + 220);
/* 63 */       b1 = (byte)(MainMemory.getI32(paramInt1 + 216) == (int)f ? 1 : 0);
/*    */       
/*    */ 
/*    */       label94:
/*    */       
/*    */ 
/* 69 */       byte b2 = b1; return b2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param7isBlankERf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */