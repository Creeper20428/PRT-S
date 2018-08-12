/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fits_hcompress_1464 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_hcompress_1464();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_hcompress_1464() { super("fits_hcompress_1464", 4, false); }
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
/* 45 */     int k = 0;
/* 46 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 52 */       j = (paramInt4 + 1) / 2;
/* 53 */       i = j + -1;
/* 54 */       paramInt1 = paramInt1 * paramInt3 + -1;
/* 55 */       if (paramInt1 >= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 60 */         paramInt3 = 1 - j;
/* 61 */         m = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 65 */           j = m + 1;
/* 66 */           k = paramInt2 + (m << 2);
/* 67 */           m = com.emt.proteus.runtime.api.MainMemory.getI32(k);
/* 68 */           com.emt.proteus.runtime.api.MainMemory.setI32(k, ((m > 0 ? i : paramInt3) + m) / paramInt4);
/* 69 */           if (paramInt1 < j) {
/*    */             break;
/*    */           }
/*    */           
/* 73 */           m = j;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hcompress_1464.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */