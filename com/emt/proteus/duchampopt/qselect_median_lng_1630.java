/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class qselect_median_lng_1630 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new qselect_median_lng_1630();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public qselect_median_lng_1630() { super("qselect_median_lng_1630", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3);
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
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j, k);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 40 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 45 */       com.emt.proteus.runtime.api.Jump.label(290423);
/* 46 */       i = paramInt3 + (paramInt1 << 2);
/* 47 */       paramInt1 = MainMemory.getI32(i);
/* 48 */       paramInt3 += (paramInt2 << 2);
/* 49 */       paramInt2 = MainMemory.getI32(paramInt3);
/* 50 */       if (paramInt1 > paramInt2)
/*    */       {
/* 52 */         MainMemory.setI32(i, paramInt2);
/* 53 */         MainMemory.setI32(paramInt3, paramInt1);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 63 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/qselect_median_lng_1630.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */