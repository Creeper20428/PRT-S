/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fits_hcompress64_1469 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_hcompress64_1469();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_hcompress64_1469() { super("fits_hcompress64_1469", 4, false); }
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
/* 43 */     long l1 = 0L;
/* 44 */     long l2 = 0L;
/* 45 */     long l3 = 0L;
/* 46 */     int i = 0;
/* 47 */     long l4 = 0L;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 53 */       l1 = (paramInt1 + 1) / 2 + -1;
/* 54 */       l2 = paramInt1;
/* 55 */       paramInt1 = paramInt2 * paramInt4 + -1;
/* 56 */       if (paramInt1 >= 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 61 */         l3 = 0L - l1;
/* 62 */         paramInt4 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 66 */           paramInt2 = paramInt4 + 1;
/* 67 */           i = paramInt3 + (paramInt4 << 3);
/* 68 */           l4 = com.emt.proteus.runtime.api.MainMemory.getI64(i);
/* 69 */           com.emt.proteus.runtime.api.MainMemory.setI64(i, ((l4 > 0L ? l1 : l3) + l4) / l2);
/* 70 */           if (paramInt1 < paramInt2) {
/*    */             break;
/*    */           }
/*    */           
/* 74 */           paramInt4 = paramInt2;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_hcompress64_1469.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */