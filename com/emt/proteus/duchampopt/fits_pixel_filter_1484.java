/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fits_pixel_filter_1484 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_pixel_filter_1484();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_pixel_filter_1484() { super("fits_pixel_filter_1484", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     call(paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     call(i);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 38 */       com.emt.proteus.runtime.api.Jump.label(311955);
/* 39 */       if (com.emt.proteus.runtime.api.MainMemory.getI32(paramInt) != -64)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 44 */         com.emt.proteus.runtime.api.MainMemory.setI32(paramInt, -32);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 51 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 52 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_pixel_filter_1484.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */