/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class parse_data_1615 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new parse_data_1615();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public parse_data_1615() { super("parse_data_1615", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4);
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
/* 30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, bool, k, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
/*    */   {
/* 46 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 52 */       if (paramBoolean)
/*    */       {
/* 54 */         i = paramInt2 + paramInt1 * 344 + 56 + 32;
/* 55 */         paramInt1 = 0;
/*    */         
/*    */         do
/*    */         {
/* 59 */           com.emt.proteus.runtime.api.SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32Aligned(458824) + (paramInt1 << 2)), MainMemory.getI32(MainMemory.getI32(i) + (paramInt1 << 2)));
/* 60 */           paramInt1 = MainMemory.getI32(paramInt4) + 1;
/* 61 */           MainMemory.setI32(paramInt4, paramInt1);
/* 62 */         } while (paramInt1 < paramInt3);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1615.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */