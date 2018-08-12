/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN9PixelInfolsERSoRNS_8Object3DE
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 440;
/* 12 */   public static final Function _instance = new _ZN9PixelInfolsERSoRNS_8Object3DE();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN9PixelInfolsERSoRNS_8Object3DE() { super("_ZN9PixelInfolsERSoRNS_8Object3DE", 2, false); }
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
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       _ZN9PixelInfo8Object3D5printERSo.call(paramInt2, paramInt1);
/* 43 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfolsERSoRNS_8Object3DE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */