/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffr8fstr_1405 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffr8fstr_1405();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffr8fstr_1405() { super("ffr8fstr_1405", 9, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, double paramDouble1, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramDouble1, paramBoolean, paramInt3, paramInt4, paramInt5, paramInt6, paramDouble2);
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
/* 30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/* 45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(i, j, d1, bool, k, m, n, i1, d2);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, double paramDouble1, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble2)
/*    */   {
/* 58 */     int i = 0;
/* 59 */     int j = 0;
/* 60 */     int k = 0;
/* 61 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 67 */       if (paramBoolean) {
/* 68 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 72 */           j = i * paramInt6;
/* 73 */           k = paramInt2 + (j + paramInt6);
/* 74 */           d = MainMemory.getF64(paramInt3 + (i << 3)) - paramDouble2;
/* 75 */           d /= paramDouble1;
/* 76 */           com.emt.proteus.runtime.api.SystemLibrary.sprintf(paramInt2 + j, paramInt4, new Object[] { Double.valueOf(d) });
/* 77 */           if (MainMemory.getI8(k) != 0)
/*    */           {
/*    */ 
/*    */ 
/*    */ 
/* 82 */             MainMemory.setI32(paramInt1, -11);
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 90 */           i += 1;
/* 91 */           if (i == paramInt5) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffr8fstr_1405.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */