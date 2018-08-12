/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ngp_read_xtension_1589 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ngp_read_xtension_1589();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ngp_read_xtension_1589() { super("ngp_read_xtension_1589", 3, false); }
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
/* 46 */       com.emt.proteus.runtime.api.Jump.label(364953);
/* 47 */       i = MainMemory.getI32(paramInt2 + paramInt3 * 172 + 76);
/* 48 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 53 */         com.emt.proteus.runtime.library.c.free.call(i);
/* 54 */         MainMemory.setI32(MainMemory.getI32(paramInt1) + paramInt3 * 172 + 76, 0);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 61 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_read_xtension_1589.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */