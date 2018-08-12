/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object3D11getZaverageEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 368;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo8Object3D11getZaverageEv();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo8Object3D11getZaverageEv() { super("_ZN9PixelInfo8Object3D11getZaverageEv", 1, false); }
/*    */   
/*    */   public float executeFloat(int paramInt)
/*    */   {
/* 18 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     float f = call(i);
/* 27 */     paramFrame.setF32(paramInt1, f);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt)
/*    */   {
/* 33 */     float f1 = 0.0F;
/*    */     
/* 35 */     int i = 0;
/* 36 */     float f2 = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 42 */       i = com.emt.proteus.runtime.api.MainMemory.getI32(paramInt + 28);
/* 43 */       if (i != 0) {
/*    */         break label43;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 53 */       f1 = 0.0F;
/*    */       
/*    */ 
/*    */       break label68;
/*    */       
/*    */       label43:
/*    */       
/* 60 */       f2 = (float)(i & 0xFFFFFFFF);
/* 61 */       f2 = com.emt.proteus.runtime.api.MainMemory.getF32(paramInt + 40) / f2;
/* 62 */       f1 = f2;
/*    */       
/*    */ 
/*    */       label68:
/*    */       
/*    */ 
/* 68 */       float f3 = f1; return f3;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D11getZaverageEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */