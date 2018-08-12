/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class imcomp_init_table_1540 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new imcomp_init_table_1540();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public imcomp_init_table_1540() { super("imcomp_init_table_1540", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, paramInt5);
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
/* 37 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     call(i, j, k, m, bool, n);
/* 44 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5)
/*    */   {
/* 50 */     int i = 0;
/* 51 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 57 */       if (paramBoolean) {
/* 58 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 62 */           j = paramInt5 + (i << 2);
/* 63 */           i += 1;
/* 64 */           SystemLibrary.sprintf(paramInt1, 40352, new Object[] { Integer.valueOf(i) });
/* 65 */           ffpkyj.call(paramInt2, paramInt1, com.emt.proteus.runtime.api.MainMemory.getI32(j), 77280, paramInt3);
/* 66 */           if (i == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_init_table_1540.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */