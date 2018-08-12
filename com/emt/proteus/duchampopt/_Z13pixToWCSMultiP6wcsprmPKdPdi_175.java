/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _Z13pixToWCSMultiP6wcsprmPKdPdi_175 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _Z13pixToWCSMultiP6wcsprmPKdPdi_175();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _Z13pixToWCSMultiP6wcsprmPKdPdi_175() { super("_Z13pixToWCSMultiP6wcsprmPKdPdi_175", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean);
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
/* 39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     call(i, j, k, m, n, i1, i2, bool);
/* 49 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*    */   {
/* 55 */     int i = 0;
/* 56 */     int j = 0;
/* 57 */     int k = 0;
/* 58 */     int m = 0;
/* 59 */     int n = 0;
/* 60 */     int i1 = 0;
/* 61 */     int i2 = 0;
/* 62 */     int i3 = 0;
/* 63 */     int i4 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 69 */       if (paramBoolean)
/*    */       {
/* 71 */         i = paramInt1 + 744;
/* 72 */         j = paramInt1 + 748;
/* 73 */         k = paramInt4 << 3;
/* 74 */         paramInt5 <<= 3;
/* 75 */         m = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 79 */           n = m * 3;
/* 80 */           i1 = paramInt4 * m;
/* 81 */           i2 = paramInt6 + (n + 1 << 3);
/* 82 */           i3 = paramInt6 + (n + 2 << 3);
/* 83 */           i4 = paramInt7 + (paramInt5 + k * m);
/* 84 */           MainMemory.setF64(paramInt6 + (n << 3), MainMemory.getF64(paramInt3 + (MainMemory.getI32(i) + i1 << 3)));
/* 85 */           MainMemory.setF64(i2, MainMemory.getF64(paramInt3 + (MainMemory.getI32(j) + i1 << 3)));
/* 86 */           MainMemory.setF64(i3, MainMemory.getF64(i4));
/* 87 */           m += 1;
/* 88 */           if (m == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z13pixToWCSMultiP6wcsprmPKdPdi_175.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */