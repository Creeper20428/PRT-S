/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN7duchamp9Detection17hasEnoughChannelsEi
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 832;
/* 12 */   public static final Function _instance = new _ZN7duchamp9Detection17hasEnoughChannelsEi();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp9Detection17hasEnoughChannelsEi() { super("_ZN7duchamp9Detection17hasEnoughChannelsEi", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 19 */     return call(paramInt1, paramInt2);
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
/* 30 */     byte b = call(i, j);
/* 31 */     paramFrame.setI8(paramInt1, b);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static byte call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 43 */       byte b = (byte)(_ZN9PixelInfo8Object3D22getMaxAdjacentChannelsEv.call(paramInt1) >= paramInt2 ? 1 : 0);return b;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection17hasEnoughChannelsEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */