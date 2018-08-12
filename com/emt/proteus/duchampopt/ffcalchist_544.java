/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffcalchist_544 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffcalchist_544();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffcalchist_544() { super("ffcalchist_544", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
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
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 42 */       com.emt.proteus.runtime.api.Jump.label(366170);
/* 43 */       MainMemory.setI32Aligned(458864, MainMemory.getI32(paramInt2 + 332));
/* 44 */       i = MainMemory.getI32Aligned(470912);
/* 45 */       MainMemory.setI32Aligned(459392, i);
/* 46 */       if (paramInt1 > 2)
/*    */       {
/* 48 */         MainMemory.setI32Aligned(458868, MainMemory.getI32(paramInt2 + 576));
/* 49 */         i *= MainMemory.getI32Aligned(470916);
/* 50 */         MainMemory.setI32Aligned(459396, i);
/* 51 */         if (paramInt1 > 3)
/*    */         {
/* 53 */           MainMemory.setI32Aligned(458872, MainMemory.getI32(paramInt2 + 820));
/* 54 */           MainMemory.setI32Aligned(459400, i * MainMemory.getI32Aligned(470920));
/*    */         }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcalchist_544.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */