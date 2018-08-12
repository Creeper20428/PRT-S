/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffgrec_1060 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffgrec_1060();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffgrec_1060() { super("ffgrec_1060", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     call(i, j, k, m);
/* 39 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 45 */     int i = 0;
/* 46 */     int j = 0;
/* 47 */     int k = 0;
/* 48 */     int m = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 53 */       Jump.label(354156);
/* 54 */       if (paramInt4 > 0)
/*    */       {
/* 56 */         i = MainMemory.getI32(paramInt2);
/* 57 */         j = paramInt2 + 4;
/* 58 */         k = MainMemory.getI32(j);
/* 59 */         m = MainMemory.getI32(k + 64);
/* 60 */         if (i == m) {
/* 61 */           i = m;
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 67 */           ffmahd.call(paramInt2, i + 1, 0, paramInt3);
/* 68 */           k = MainMemory.getI32(j);
/* 69 */           i = MainMemory.getI32(k + 64);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 78 */         Jump.label(354178);
/*    */         
/*    */ 
/* 81 */         MainMemory.setI64(k + 104, MainMemory.getI64(MainMemory.getI32(k + 84) + (i << 3)) + (paramInt4 * 80 + -80));
/* 82 */         ffgnky.call(paramInt2, paramInt1, paramInt3);
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
/* 94 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgrec_1060.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */