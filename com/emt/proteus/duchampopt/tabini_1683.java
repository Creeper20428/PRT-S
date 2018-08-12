/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class tabini_1683 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new tabini_1683();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public tabini_1683() { super("tabini_1683", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 36 */     call(i, j, k, m);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     double d = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 50 */       MainMemory.setI32(paramInt4 + (paramInt3 << 2), MainMemory.getI32(paramInt1));
/* 51 */       i = MainMemory.getI32(MainMemory.getI32(paramInt2) + (paramInt3 << 2));
/* 52 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 57 */         if (MainMemory.getI32(paramInt1) > 0) {
/* 58 */           paramInt3 = 0;
/*    */           
/*    */           do
/*    */           {
/* 62 */             d = paramInt3;
/* 63 */             MainMemory.setF64(i + (paramInt3 << 3), d);
/* 64 */             paramInt3 += 1;
/* 65 */           } while (MainMemory.getI32(paramInt1) > paramInt3);
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/tabini_1683.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */