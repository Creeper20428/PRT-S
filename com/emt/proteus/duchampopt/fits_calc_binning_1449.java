/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fits_calc_binning_1449 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_calc_binning_1449();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_calc_binning_1449() { super("fits_calc_binning_1449", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/*    */     try
/*    */     {
/* 47 */       Jump.label(367439);
/* 48 */       com.emt.proteus.runtime.api.SystemLibrary.strcpy(paramInt4, paramInt3);
/* 49 */       if (MainMemory.getI8(paramInt4) == 0)
/*    */       {
/* 51 */         switch (paramInt1) {
/*    */         case 0: 
/* 53 */           Jump.label(367453);
/* 54 */           MainMemory.setI16(paramInt2, (short)88);
/*    */           
/*    */ 
/*    */ 
/* 58 */           break;
/*    */         case 1: 
/* 60 */           Jump.label(367457);
/* 61 */           MainMemory.setI16(paramInt2, (short)89);
/*    */           
/*    */ 
/*    */ 
/* 65 */           break;
/*    */         case 2: 
/* 67 */           Jump.label(367461);
/* 68 */           MainMemory.setI16(paramInt2, (short)90);
/*    */           
/*    */ 
/*    */ 
/* 72 */           break;
/*    */         case 3: 
/* 74 */           Jump.label(367465);
/* 75 */           MainMemory.setI16(paramInt2, (short)84);
/*    */           
/*    */ 
/*    */ 
/* 79 */           break;
/*    */         }
/*    */         
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 92 */       Jump.label(8000000);
/* 93 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_calc_binning_1449.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */