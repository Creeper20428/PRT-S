/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffparse_1142 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffparse_1142();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffparse_1142() { super("ffparse_1142", 5, false); }
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
/* 52 */       if ((paramInt2 | paramInt3) >= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 57 */         MainMemory.setI32(paramInt5, paramInt1);
/* 58 */         paramInt5 = paramInt4 + paramInt3 * 344 + 56 + 4;
/* 59 */         MainMemory.setI32(paramInt4 + paramInt2 * 344 + 56 + 4, MainMemory.getI32(paramInt5));
/* 60 */         if (MainMemory.getI32(paramInt5) > 0) {
/* 61 */           paramInt1 = 0;
/*    */           
/*    */           for (;;)
/*    */           {
/* 65 */             i = paramInt1 + 1;
/* 66 */             MainMemory.setI32(paramInt4 + paramInt2 * 344 + 56 + 8 + (paramInt1 << 2), MainMemory.getI32(paramInt4 + paramInt3 * 344 + 56 + 8 + (paramInt1 << 2)));
/* 67 */             if (MainMemory.getI32(paramInt5) <= i) break;
/* 68 */             paramInt1 = i;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffparse_1142.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */