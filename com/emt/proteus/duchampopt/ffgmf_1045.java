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
/*    */ public final class ffgmf_1045 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 14 */   public static final Function _instance = new ffgmf_1045();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public ffgmf_1045() { super("ffgmf_1045", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 21 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
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
/* 39 */     call(i, j, k, m);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 46 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 51 */       Jump.label(360580);
/* 52 */       i = MainMemory.getI8(paramInt2);
/* 53 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 58 */         if ((fits_is_url_absolute.call(paramInt2) == 0) && (i != 47))
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 63 */           if (MainMemory.getI32(paramInt3) == 0)
/*    */           {
/* 65 */             SystemLibrary.getcwd(paramInt4, 1025);
/* 66 */             fits_path2url.call(paramInt4, paramInt1, paramInt3);
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 76 */           Jump.label(360602);
/* 77 */           MainMemory.setI16(paramInt1 + SystemLibrary.strlen(paramInt1), (short)47);
/* 78 */           SystemLibrary.strcat(paramInt1, paramInt2);
/* 79 */           fits_clean_url.call(paramInt1, paramInt2, paramInt3);
/*    */         }
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
/*    */ 
/* 92 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmf_1045.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */