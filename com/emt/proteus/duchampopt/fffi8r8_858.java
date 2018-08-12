/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fffi8r8_858 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffi8r8_858();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffi8r8_858() { super("fffi8r8_858", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramDouble1, paramDouble2, paramBoolean);
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
/* 33 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, d1, d2, bool);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, boolean paramBoolean)
/*    */   {
/* 49 */     int i = 0;
/* 50 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 56 */       if (paramBoolean) {
/* 57 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 61 */           d = com.emt.proteus.runtime.api.MainMemory.getI64(paramInt2 + (i << 3));
/* 62 */           d *= paramDouble1;
/* 63 */           d += paramDouble2;
/* 64 */           com.emt.proteus.runtime.api.MainMemory.setF64(paramInt1 + (i << 3), d);
/* 65 */           i += 1;
/* 66 */           if (i == paramInt3) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi8r8_858.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */