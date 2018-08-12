/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp5Param6isInMWEi extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 140;
/* 11 */   public static final Function _instance = new _ZN7duchamp5Param6isInMWEi();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp5Param6isInMWEi() { super("_ZN7duchamp5Param6isInMWEi", 2, false); }
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
/* 38 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 44 */       if (MainMemory.getI8(paramInt1 + 232) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */         i = MainMemory.getI32(paramInt1 + 280);
/* 55 */         if (MainMemory.getI32(paramInt1 + 240) - i <= paramInt2) {
/*    */           break label78;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */       b1 = 0;
/*    */       
/*    */ 
/*    */       break label105;
/*    */       
/*    */       label78:
/*    */       
/* 72 */       b1 = (byte)(MainMemory.getI32(paramInt1 + 236) - i >= paramInt2 ? 1 : 0);
/*    */       
/*    */ 
/*    */       label105:
/*    */       
/*    */ 
/* 78 */       byte b2 = b1; return b2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param6isInMWEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */