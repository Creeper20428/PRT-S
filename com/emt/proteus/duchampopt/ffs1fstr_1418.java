/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffs1fstr_1418 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffs1fstr_1418();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffs1fstr_1418() { super("ffs1fstr_1418", 9, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, double paramDouble1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramBoolean, paramDouble1, paramInt1, paramInt2, paramInt3, paramInt4, paramDouble2, paramInt5, paramInt6);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
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
/* 42 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 49 */     paramInt4 += 2;
/* 50 */     paramInt3--;
/* 51 */     call(bool, d1, i, j, k, m, d2, n, i1);
/* 52 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, double paramDouble1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble2, int paramInt5, int paramInt6)
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
/* 72 */           j = i * paramInt1;
/* 73 */           k = paramInt2 + (j + paramInt1);
/* 74 */           d = MainMemory.getI8(paramInt5 + i);
/* 75 */           d -= paramDouble1;
/* 76 */           d /= paramDouble2;
/* 77 */           com.emt.proteus.runtime.api.SystemLibrary.sprintf(paramInt2 + j, paramInt6, new Object[] { Double.valueOf(d) });
/* 78 */           if (MainMemory.getI8(k) != 0)
/*    */           {
/*    */ 
/*    */ 
/*    */ 
/* 83 */             MainMemory.setI32(paramInt3, -11);
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 91 */           i += 1;
/* 92 */           if (i == paramInt4) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffs1fstr_1418.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */