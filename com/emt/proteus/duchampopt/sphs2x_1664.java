/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class sphs2x_1664 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new sphs2x_1664();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public sphs2x_1664() { super("sphs2x_1664", 2, false); }
/*    */   
/*    */   public int execute(double paramDouble, int paramInt)
/*    */   {
/* 18 */     call(paramDouble, paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(d, i);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(double paramDouble, int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 41 */       com.emt.proteus.runtime.api.Jump.label(233002);
/* 42 */       if (com.emt.proteus.lib.api.MathUtils.f_olt(paramDouble, -180.0D))
/*    */       {
/* 44 */         paramDouble += 360.0D;
/* 45 */         com.emt.proteus.runtime.api.MainMemory.setF64(paramInt, paramDouble);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 56 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sphs2x_1664.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */