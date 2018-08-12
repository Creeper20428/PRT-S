/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fits_pixel_filter_1485 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_pixel_filter_1485();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_pixel_filter_1485() { super("fits_pixel_filter_1485", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramBoolean, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, bool, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 44 */       com.emt.proteus.runtime.api.Jump.label(311832);
/* 45 */       com.emt.proteus.runtime.api.MainMemory.setI32(paramInt1, paramInt2);
/* 46 */       if (paramBoolean)
/*    */       {
/* 48 */         com.emt.proteus.runtime.api.SystemLibrary.printf(67168, new Object[] { Integer.valueOf(13536) });
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 59 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_pixel_filter_1485.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */