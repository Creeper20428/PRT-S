/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class F368666_147 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new F368666_147();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F368666_147() { super("F368666_147", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/* 39 */     call(i, j, k, m, n);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 46 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 52 */       paramInt3 = paramInt3 + 2 + paramInt2 > 80 ? 78 - paramInt2 : paramInt3;
/* 53 */       com.emt.proteus.runtime.api.MainMemory.setI8(paramInt5 + (paramInt2 + 2), (byte)47);
/* 54 */       i = paramInt2 + 3;
/* 55 */       com.emt.proteus.runtime.api.SystemLibrary.strncpy(paramInt5 + i, paramInt1, paramInt3);
/* 56 */       if (com.emt.proteus.lib.api.MathUtils.ult(paramInt5 + (paramInt3 + i), paramInt4))
/*    */       {
/* 58 */         paramInt3 += paramInt2;
/* 59 */         paramInt2 = paramInt4 + (-3 - (paramInt5 + paramInt3));
/* 60 */         paramInt3 += 3;
/* 61 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 65 */           com.emt.proteus.runtime.api.MainMemory.setI8(paramInt5 + (paramInt3 + i), (byte)32);
/* 66 */           i += 1;
/* 67 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368666_147.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */