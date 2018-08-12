/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class parse_data_1606 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new parse_data_1606();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public parse_data_1606() { super("parse_data_1606", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     call(i, j, k, m);
/* 38 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/*    */     try
/*    */     {
/* 48 */       Jump.label(309133);
/* 49 */       ffgknjj.call(MainMemory.getI32(paramInt1 + paramInt4 * 244), MainMemory.getI32(paramInt1 + paramInt4 * 244 + 4), paramInt3, paramInt2);
/* 50 */       if (MainMemory.getI32(paramInt2) == 403)
/*    */       {
/* 52 */         switch (MainMemory.getI32(MainMemory.getI32Aligned(458752))) {
/*    */         case 21: 
/* 54 */           Jump.label(309153);
/* 55 */           MainMemory.setI64Aligned(467228, -32768L);
/*    */           
/*    */ 
/*    */ 
/* 59 */           break;
/*    */         case 31: 
/* 61 */           Jump.label(309157);
/* 62 */           MainMemory.setI64Aligned(467228, -2147483648L);
/*    */           
/*    */ 
/*    */ 
/* 66 */           break;
/*    */         case 41: 
/* 68 */           Jump.label(309161);
/* 69 */           MainMemory.setI64Aligned(467228, -2147483648L);
/*    */           
/*    */ 
/*    */ 
/* 73 */           break;
/*    */         }
/*    */         
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
/* 86 */       Jump.label(8000000);
/* 87 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1606.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */