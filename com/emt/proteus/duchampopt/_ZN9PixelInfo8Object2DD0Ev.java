/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object2DD0Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 336;
/* 12 */   public static final Function _instance = new _ZN9PixelInfo8Object2DD0Ev();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN9PixelInfo8Object2DD0Ev() { super("_ZN9PixelInfo8Object2DD0Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     call(paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     call(i);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 39 */       com.emt.proteus.runtime.api.MainMemory.setI32(paramInt, 12936);
/* 40 */       _ZNSt6vectorIN9PixelInfo4ScanESaIS1_EED1Ev.call(paramInt + 4);
/* 41 */       SystemLibrary.delete(paramInt);
/* 42 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2DD0Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */