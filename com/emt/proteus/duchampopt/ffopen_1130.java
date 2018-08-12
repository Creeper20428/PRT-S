/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffopen_1130 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffopen_1130();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffopen_1130() { super("ffopen_1130", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, j, k, m, n);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 48 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 53 */       Jump.label(267657);
/* 54 */       ffclos.call(MainMemory.getI32(paramInt1), paramInt2);
/* 55 */       i = MainMemory.getI32(paramInt4);
/* 56 */       MainMemory.setI32(paramInt1, i);
/* 57 */       if (paramInt3 != paramInt5)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 62 */         ffmahd.call(i, paramInt5, 0, paramInt2);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffopen_1130.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */