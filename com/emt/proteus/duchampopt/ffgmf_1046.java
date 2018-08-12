/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffgmf_1046 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new ffgmf_1046();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public ffgmf_1046() { super("ffgmf_1046", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, byte paramByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 21 */     call(paramInt1, paramByte, paramInt2, paramInt3, paramInt4, paramInt5);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(i, b, j, k, m, n);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, byte paramByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 56 */       Jump.label(360555);
/* 57 */       if ((fits_is_url_absolute.call(paramInt5) == 0) && (paramByte != 47))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 62 */         if (paramInt2 == 0)
/*    */         {
/* 64 */           SystemLibrary.getcwd(paramInt4, 1025);
/* 65 */           fits_path2url.call(paramInt4, paramInt1, paramInt3);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 75 */         Jump.label(360571);
/* 76 */         MainMemory.setI16(paramInt1 + SystemLibrary.strlen(paramInt1), (short)47);
/* 77 */         SystemLibrary.strcat(paramInt1, paramInt5);
/* 78 */         fits_clean_url.call(paramInt1, paramInt5, paramInt3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 87 */       Jump.label(8000000);
/* 88 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmf_1046.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */