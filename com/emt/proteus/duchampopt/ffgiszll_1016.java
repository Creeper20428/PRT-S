/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffgiszll_1016 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffgiszll_1016();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffgiszll_1016() { super("ffgiszll_1016", 4, false); }
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
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       i = MainMemory.getI32(paramInt3 + 1040);
/* 50 */       if ((i <= paramInt2 ? i : paramInt2) > 0)
/*    */       {
/* 52 */         i ^= 0xFFFFFFFF;
/* 53 */         paramInt2 ^= 0xFFFFFFFF;
/* 54 */         paramInt2 = (i > paramInt2 ? i : paramInt2) ^ 0xFFFFFFFF;
/*    */         
/* 56 */         i = 0;
/*    */         
/*    */ 
/*    */         for (;;)
/*    */         {
/* 61 */           MainMemory.setI64(paramInt4 + (i << 3), MainMemory.getI32(paramInt3 + 1044 + (i << 2)));
/* 62 */           i += 1;
/* 63 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */           
/*    */ 
/* 68 */           paramInt3 = MainMemory.getI32(paramInt1);
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgiszll_1016.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */