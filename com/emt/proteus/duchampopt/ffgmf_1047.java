/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffgmf_1047 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffgmf_1047();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffgmf_1047() { super("ffgmf_1047", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, j, k, m, n);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 52 */       Jump.label(360412);
/* 53 */       fits_path2url.call(paramInt3, paramInt1, paramInt4);
/* 54 */       if (MainMemory.getI8(paramInt1) != 47)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 59 */         if (MainMemory.getI32(paramInt4) == 0)
/*    */         {
/* 61 */           SystemLibrary.getcwd(paramInt5, 1025);
/* 62 */           fits_path2url.call(paramInt5, paramInt2, paramInt4);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */         Jump.label(360429);
/* 73 */         MainMemory.setI16(paramInt2 + SystemLibrary.strlen(paramInt2), (short)47);
/* 74 */         SystemLibrary.strcat(paramInt2, paramInt1);
/* 75 */         fits_clean_url.call(paramInt2, paramInt1, paramInt4);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 84 */       Jump.label(8000000);
/* 85 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmf_1047.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */