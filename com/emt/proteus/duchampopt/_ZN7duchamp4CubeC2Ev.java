/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp4CubeC2Ev
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1372;
/* 13 */   public static final Function _instance = new _ZN7duchamp4CubeC2Ev();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp4CubeC2Ev() { super("_ZN7duchamp4CubeC2Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     call(paramInt);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     call(i);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 40 */       _ZN7duchamp9DataArrayC2Ev.call(paramInt);
/* 41 */       MainMemory.setI32(paramInt, 12296);
/* 42 */       _ZN7duchamp10FitsHeaderC1Ev.call(paramInt + 648);
/* 43 */       MainMemory.setI32(paramInt + 752, 0);
/* 44 */       MainMemory.setI32(paramInt + 756, 0);
/* 45 */       MainMemory.setI32(paramInt + 760, 0);
/* 46 */       MainMemory.setI32(paramInt + 764, 0);
/* 47 */       MainMemory.setI32(paramInt + 768, 0);
/* 48 */       MainMemory.setI32(paramInt + 772, 0);
/* 49 */       MainMemory.setI32(paramInt + 16, 0);
/* 50 */       MainMemory.setI16(paramInt + 4, (short)3);
/* 51 */       MainMemory.setI8(paramInt + 632, (byte)0);
/* 52 */       MainMemory.setI8(paramInt + 644, (byte)0);
/* 53 */       MainMemory.setI8(paramInt + 645, (byte)0);
/* 54 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4CubeC2Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */