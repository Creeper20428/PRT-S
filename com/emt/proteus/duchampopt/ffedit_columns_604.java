/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffedit_columns_604 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffedit_columns_604();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffedit_columns_604() { super("ffedit_columns_604", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
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
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/* 38 */     int j = 0;
/* 39 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 45 */       i = MainMemory.getI32(paramInt2);
/* 46 */       MainMemory.setI32(paramInt1, i);
/* 47 */       if (MainMemory.getI8(i) == 32) {
/* 48 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 52 */           j += 1;
/* 53 */           k = i + j;
/* 54 */           if (MainMemory.getI8(k) != 32) {
/*    */             break;
/*    */           }
/*    */         }
/*    */         break label71;
/* 59 */         MainMemory.setI32(paramInt1, k);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       label71:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 74 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffedit_columns_604.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */