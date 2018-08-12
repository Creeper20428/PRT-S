/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffu4fstr_1439 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffu4fstr_1439();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffu4fstr_1439() { super("ffu4fstr_1439", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, paramInt6);
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
/* 36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(i, j, k, m, n, bool, i1);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
/*    */   {
/* 52 */     int i = 0;
/* 53 */     int j = 0;
/* 54 */     int k = 0;
/* 55 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 61 */       if (paramBoolean) {
/* 62 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 66 */           j = i * paramInt5;
/* 67 */           k = paramInt1 + (j + paramInt5);
/* 68 */           d = MainMemory.getI32(paramInt6 + (i << 2)) & 0xFFFFFFFF;
/* 69 */           com.emt.proteus.runtime.api.SystemLibrary.sprintf(paramInt1 + j, paramInt2, new Object[] { Double.valueOf(d) });
/* 70 */           if (MainMemory.getI8(k) != 0)
/*    */           {
/*    */ 
/*    */ 
/*    */ 
/* 75 */             MainMemory.setI32(paramInt3, -11);
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 83 */           i += 1;
/* 84 */           if (i == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffu4fstr_1439.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */