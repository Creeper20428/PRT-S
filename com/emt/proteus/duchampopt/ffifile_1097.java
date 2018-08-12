/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffifile_1097 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffifile_1097();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffifile_1097() { super("ffifile_1097", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, m, n, i1);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/*    */     try
/*    */     {
/* 54 */       com.emt.proteus.runtime.api.SystemLibrary.strncpy(paramInt4, paramInt3 + 1, paramInt5);
/* 55 */       MainMemory.setI8(paramInt4 + paramInt5, (byte)0);
/* 56 */       if (MainMemory.getI8(paramInt4 + (paramInt6 + -2)) == 32)
/*    */       {
/* 58 */         paramInt5 = paramInt1 + -3 - paramInt2;
/* 59 */         paramInt1 = paramInt1 + -2 - paramInt2;
/* 60 */         paramInt2 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 64 */           MainMemory.setI8(paramInt4 + (paramInt1 - paramInt2), (byte)0);
/* 65 */           paramInt6 = paramInt2 + 1;
/* 66 */           if (MainMemory.getI8(paramInt4 + (paramInt5 - paramInt2)) != 32) break;
/* 67 */           paramInt2 = paramInt6;
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
/*    */ 
/* 84 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffifile_1097.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */