/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class fffi1uint_683 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fffi1uint_683();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fffi1uint_683() { super("fffi1uint_683", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramInt1, paramBoolean, paramInt2, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, bool, j, k);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*    */   {
/* 43 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       if (paramBoolean) {
/* 50 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 54 */           com.emt.proteus.runtime.api.MainMemory.setI32(paramInt1 + (i << 2), com.emt.proteus.runtime.api.MainMemory.getI8(paramInt3 + i) & 0xFF);
/* 55 */           i += 1;
/* 56 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffi1uint_683.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */