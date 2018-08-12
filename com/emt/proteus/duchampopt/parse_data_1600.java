/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class parse_data_1600 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new parse_data_1600();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public parse_data_1600() { super("parse_data_1600", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean);
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
/* 39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, m, n, bool);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
/*    */   {
/* 49 */     int i = 0;
/* 50 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 56 */       if (paramBoolean)
/*    */       {
/* 58 */         i = paramInt3 + paramInt1 * 344 + 56 + 28;
/* 59 */         j = paramInt3 + paramInt1 * 344 + 56 + 32;
/* 60 */         paramInt1 = 0;
/*    */         
/*    */         do
/*    */         {
/* 64 */           if (MainMemory.getI8(MainMemory.getI32(i) + paramInt1) == 0)
/*    */           {
/* 66 */             com.emt.proteus.runtime.api.SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32Aligned(458824) + (paramInt1 << 2)), MainMemory.getI32(MainMemory.getI32(j) + (paramInt1 << 2)));
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 73 */             MainMemory.setI32(paramInt2, 1);
/* 74 */             com.emt.proteus.runtime.api.SystemLibrary.strcpy(MainMemory.getI32(MainMemory.getI32Aligned(458824) + (paramInt1 << 2)), MainMemory.getI32(MainMemory.getI32Aligned(458820)));
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 82 */           paramInt1 = MainMemory.getI32(paramInt5) + 1;
/* 83 */           MainMemory.setI32(paramInt5, paramInt1);
/* 84 */         } while (paramInt1 < paramInt4);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1600.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */