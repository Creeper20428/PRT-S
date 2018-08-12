/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class inflate_1553 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new inflate_1553();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public inflate_1553() { super("inflate_1553", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, byte paramByte, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramByte, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, b, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, byte paramByte, int paramInt2)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 46 */       com.emt.proteus.runtime.api.Jump.label(436054);
/* 47 */       i = MainMemory.getI32(paramInt2 + 36);
/* 48 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 53 */         j = MainMemory.getI32(paramInt1);
/* 54 */         if (com.emt.proteus.lib.api.MathUtils.ult(j, MainMemory.getI32(paramInt2 + 40)))
/*    */         {
/* 56 */           MainMemory.setI8(i + j, paramByte);
/* 57 */           MainMemory.setI32(paramInt1, j + 1);
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
/* 71 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/inflate_1553.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */