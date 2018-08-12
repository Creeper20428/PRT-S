/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.c.free;
/*    */ 
/*    */ public final class parse_data_1598 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new parse_data_1598();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public parse_data_1598() { super("parse_data_1598", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/* 42 */     int j = 0;
/* 43 */     int k = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 48 */       Jump.label(310394);
/* 49 */       if (MainMemory.getI32(paramInt3) > 0)
/*    */       {
/* 51 */         i = paramInt2 + paramInt1 * 344 + 56 + 32;
/* 52 */         j = MainMemory.getI32(MainMemory.getI32(i));
/* 53 */         if (j == 0)
/*    */         {
/* 55 */           com.emt.proteus.runtime.api.SystemLibrary.printf(118432, new Object[] { Integer.valueOf(43520), Integer.valueOf(1254) });
/*    */ 
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 62 */           free.call(j);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */         Jump.label(310416);
/* 70 */         k = MainMemory.getI32(i);
/* 71 */         if (k == 0)
/*    */         {
/* 73 */           com.emt.proteus.runtime.api.SystemLibrary.printf(112992, new Object[] { Integer.valueOf(43520), Integer.valueOf(1255) });
/*    */ 
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 80 */           free.call(k);
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
/*    */ 
/*    */ 
/* 96 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1598.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */