/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffphbn_1370
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 15 */   public static final Function _instance = new ffphbn_1370();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public ffphbn_1370() { super("ffphbn_1370", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/* 22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/* 23 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 50 */     paramInt4 += 2;
/* 51 */     paramInt3--;
/* 52 */     call(i, j, k, m, n, i1, i2, i3);
/* 53 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*    */   {
/*    */     try
/*    */     {
/* 63 */       Jump.label(390913);
/* 64 */       SystemLibrary.sprintf(paramInt8, 62528, new Object[] { Integer.valueOf(paramInt4) });
/* 65 */       ffkeyn.call(26976, paramInt4, paramInt2, paramInt3);
/* 66 */       paramInt4 = MainMemory.getI32(paramInt3);
/* 67 */       if (paramInt4 <= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 72 */         ffs2c.call(MainMemory.getI32(paramInt7), paramInt1, paramInt4);
/* 73 */         ffmkky.call(paramInt2, paramInt1, paramInt8, paramInt5, paramInt3);
/* 74 */         ffprec.call(paramInt6, paramInt5, paramInt3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 81 */       Jump.label(8000000);
/* 82 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffphbn_1370.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */