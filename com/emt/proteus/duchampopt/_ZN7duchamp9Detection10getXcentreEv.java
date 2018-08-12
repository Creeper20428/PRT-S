/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*    */ 
/*    */ public final class _ZN7duchamp9Detection10getXcentreEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 836;
/* 13 */   public static final Function _instance = new _ZN7duchamp9Detection10getXcentreEv();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp9Detection10getXcentreEv() { super("_ZN7duchamp9Detection10getXcentreEv", 1, false); }
/*    */   
/*    */   public float executeFloat(int paramInt)
/*    */   {
/* 20 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     float f = call(i);
/* 29 */     paramFrame.setF32(paramInt1, f);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static float call(int paramInt)
/*    */   {
/* 35 */     float f1 = 0.0F;
/*    */     
/* 37 */     int i = 0;
/* 38 */     float f2 = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 44 */       i = paramInt + 128;
/* 45 */       if (_ZNKSs7compareEPKc.call(i, 18784) != 0) {
/*    */         break label56;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       f2 = MainMemory.getI32(paramInt + 100);
/* 56 */       f1 = f2;
/*    */       
/*    */ 
/*    */       break label106;
/*    */       
/*    */       label56:
/*    */       
/* 63 */       if (_ZNKSs7compareEPKc.call(i, 37024) != 0) {
/*    */         break label93;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */       f1 = _ZN9PixelInfo8Object3D11getXaverageEv.call(paramInt);
/*    */       
/*    */ 
/*    */       break label106;
/*    */       
/*    */       label93:
/*    */       
/* 80 */       f1 = MainMemory.getF32(paramInt + 116);
/*    */       
/*    */ 
/*    */       label106:
/*    */       
/*    */ 
/* 86 */       float f3 = f1; return f3;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection10getXcentreEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */