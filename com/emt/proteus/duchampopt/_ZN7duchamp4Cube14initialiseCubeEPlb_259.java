/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube14initialiseCubeEPlb_259 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new _ZN7duchamp4Cube14initialiseCubeEPlb_259();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN7duchamp4Cube14initialiseCubeEPlb_259() { super("_ZN7duchamp4Cube14initialiseCubeEPlb_259", 2, false); }
/*    */   
/*    */   public int execute(byte paramByte, int paramInt)
/*    */   {
/* 19 */     call(paramByte, paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     call(b, i);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(byte paramByte, int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       Jump.label(107207);
/* 43 */       if (com.emt.proteus.runtime.api.MainMemory.getI8(paramInt + 590) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 48 */         _ZN7duchamp4Cube16reportMemorySizeERSob.call(paramInt, paramByte);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       Jump.label(8000000);
/* 56 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14initialiseCubeEPlb_259.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */