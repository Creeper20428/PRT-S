/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffifile_1099 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffifile_1099();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffifile_1099() { super("ffifile_1099", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/*    */     try
/*    */     {
/* 41 */       com.emt.proteus.runtime.api.Jump.label(261298);
/* 42 */       com.emt.proteus.runtime.api.SystemLibrary.strcat(paramInt2, paramInt1);
/* 43 */       paramInt1 = com.emt.proteus.runtime.api.SystemLibrary.strchr(paramInt2, 93);
/* 44 */       if (paramInt1 != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 49 */         com.emt.proteus.runtime.api.MainMemory.setI8(paramInt1, (byte)0);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 56 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 57 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffifile_1099.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */