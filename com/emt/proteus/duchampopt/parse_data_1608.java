/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class parse_data_1608 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new parse_data_1608();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public parse_data_1608() { super("parse_data_1608", 5, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(bool, i, j, k, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/* 48 */     int k = 0;
/* 49 */     int m = 0;
/* 50 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 56 */       if (paramBoolean)
/*    */       {
/* 58 */         i = paramInt4 + paramInt1 * 344 + 56;
/* 59 */         j = paramInt4 + paramInt1 * 344 + 56 + 32;
/* 60 */         paramInt1 = paramInt2 < 2500 ? paramInt2 : 2500;
/* 61 */         paramInt2 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 65 */           k = paramInt2 << 2;
/* 66 */           MainMemory.setI32(paramInt3, 0);
/* 67 */           n = MainMemory.getI32(i);
/* 68 */           if (n > 0) {
/* 69 */             m = 0;
/*    */             
/*    */ 
/*    */ 
/*    */             do
/*    */             {
/* 75 */               MainMemory.setI8(MainMemory.getI32Aligned(458824) + (n * paramInt2 + m), (byte)(MainMemory.getI8(MainMemory.getI32(MainMemory.getI32(j) + k) + m) == 49 ? 1 : 0));
/* 76 */               m = MainMemory.getI32(paramInt3) + 1;
/* 77 */               MainMemory.setI32(paramInt3, m);
/* 78 */               n = MainMemory.getI32(i);
/* 79 */             } while (n > m);
/*    */           }
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
/*    */ 
/* 96 */           paramInt2 += 1;
/* 97 */           if (paramInt2 == paramInt1) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1608.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */