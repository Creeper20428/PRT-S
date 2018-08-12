/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube13SpatialSmoothEv_254 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new _ZN7duchamp4Cube13SpatialSmoothEv_254();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp4Cube13SpatialSmoothEv_254() { super("_ZN7duchamp4Cube13SpatialSmoothEv_254", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/* 21 */     call(paramInt1, paramBoolean, paramInt2);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, bool, j);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 47 */       Jump.label(161657);
/* 48 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 69472), 80);
/* 49 */       if (paramBoolean)
/*    */       {
/* 51 */         _ZN11ProgressBar4initEi.call(paramInt1, paramInt2);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 61 */       Jump.label(8000000);
/* 62 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube13SpatialSmoothEv_254.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */