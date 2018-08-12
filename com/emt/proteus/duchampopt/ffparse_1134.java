/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffparse_1134 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffparse_1134();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffparse_1134() { super("ffparse_1134", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/*    */ 
/*    */     try
/*    */     {
/* 50 */       if ((paramInt1 | paramInt3) >= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 55 */         MainMemory.setI32(paramInt4 + paramInt1 * 344 + 56, paramInt2);
/* 56 */         i = paramInt4 + paramInt3 * 344 + 56 + 4;
/* 57 */         MainMemory.setI32(paramInt4 + paramInt1 * 344 + 56 + 4, MainMemory.getI32(i));
/* 58 */         if (MainMemory.getI32(i) > 0) {
/* 59 */           paramInt2 = 0;
/*    */           
/*    */           for (;;)
/*    */           {
/* 63 */             j = paramInt2 + 1;
/* 64 */             MainMemory.setI32(paramInt4 + paramInt1 * 344 + 56 + 8 + (paramInt2 << 2), MainMemory.getI32(paramInt4 + paramInt3 * 344 + 56 + 8 + (paramInt2 << 2)));
/* 65 */             if (MainMemory.getI32(i) <= j) break;
/* 66 */             paramInt2 = j;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffparse_1134.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */