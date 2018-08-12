/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ngp_keyword_all_write_1583 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ngp_keyword_all_write_1583();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ngp_keyword_all_write_1583() { super("ngp_keyword_all_write_1583", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, j, k, m, n);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 47 */     int i = 0;
/* 48 */     int j = 0;
/* 49 */     int k = 0;
/* 50 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 56 */       i = SystemLibrary.strlen(paramInt4 + paramInt1 * 172 + 92);
/* 57 */       if (i > 0)
/*    */       {
/* 59 */         i += -72;
/* 60 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 64 */           k = paramInt4 + paramInt1 * 172 + 92 + j * 72;
/* 65 */           SystemLibrary.memcpy(paramInt5, 44032, 9, 1);
/* 66 */           SystemLibrary.strncat(paramInt5, k, 72);
/* 67 */           ffprec.call(paramInt2, paramInt5, paramInt3);
/* 68 */           m = j + 1;
/* 69 */           if (i + j * -72 <= 0) break;
/* 70 */           j = m;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ngp_keyword_all_write_1583.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */