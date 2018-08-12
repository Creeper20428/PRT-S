/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class parse_data_1610 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new parse_data_1610();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public parse_data_1610() { super("parse_data_1610", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3);
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
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     call(i, j, k);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 41 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 46 */       Jump.label(310106);
/* 47 */       if (com.emt.proteus.runtime.api.MainMemory.getI32(paramInt3) > 0)
/*    */       {
/* 49 */         i = com.emt.proteus.runtime.api.MainMemory.getI32(paramInt2 + paramInt1 * 344 + 56 + 32);
/* 50 */         if (i == 0)
/*    */         {
/* 52 */           com.emt.proteus.runtime.api.SystemLibrary.printf(106016, new Object[] { Integer.valueOf(43520), Integer.valueOf(1194) });
/*    */ 
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 59 */           com.emt.proteus.runtime.library.c.free.call(i);
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1610.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */