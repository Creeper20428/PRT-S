/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class uncompress2mem_1701 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new uncompress2mem_1701();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public uncompress2mem_1701() { super("uncompress2mem_1701", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, j, k, m);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 49 */       Jump.label(426630);
/* 50 */       i = MainMemory.getI32(paramInt2);
/* 51 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 56 */         j = MainMemory.getI32(paramInt3 + 52);
/* 57 */         if (j != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 64 */           com.emt.proteus.runtime.api.SystemLibrary.do_indirect(i, MainMemory.getI32(paramInt1), j);
/* 65 */           i = MainMemory.getI32(paramInt2);
/* 66 */           paramInt3 = MainMemory.getI32(paramInt4);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 75 */         Jump.label(426649);
/*    */         
/*    */ 
/* 78 */         com.emt.proteus.runtime.api.SystemLibrary.do_indirect(i, MainMemory.getI32(paramInt1), paramInt3);
/* 79 */         MainMemory.setI32(paramInt4, 0);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 88 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/uncompress2mem_1701.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */