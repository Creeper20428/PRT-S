/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class mem_rawfile_open_1576 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new mem_rawfile_open_1576();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public mem_rawfile_open_1576() { super("mem_rawfile_open_1576", 7, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
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
/* 39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(bool, i, j, k, m, n, i1);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 52 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 58 */       if (paramBoolean)
/*    */       {
/* 60 */         paramInt2 = paramInt3 * paramInt2 * paramInt4 * paramInt6 * paramInt5;
/* 61 */         paramInt3 = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 65 */           i = paramInt1 + ((paramInt3 << 1) + 2880);
/* 66 */           com.emt.proteus.runtime.api.MainMemory.setI16(i, com.emt.proteus.lib.api.MathUtils.xor(com.emt.proteus.runtime.api.MainMemory.getI16(i), (short)128));
/* 67 */           paramInt3 += 1;
/* 68 */           if (paramInt3 == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mem_rawfile_open_1576.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */