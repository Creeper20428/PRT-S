/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class parse_data_1609 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new parse_data_1609();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public parse_data_1609() { super("parse_data_1609", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     call(paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     call(i);
/* 28 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 38 */       com.emt.proteus.runtime.api.Jump.label(310623);
/* 39 */       if (MainMemory.getI32(paramInt + 4) == 0)
/*    */       {
/* 41 */         if (MainMemory.getI32(paramInt) == 16)
/*    */         {
/* 43 */           MainMemory.setI16(MainMemory.getI32(MainMemory.getI32Aligned(458820)), MainMemory.getI16(467840));
/*    */ 
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 50 */           com.emt.proteus.runtime.api.SystemLibrary.memcpy(MainMemory.getI32Aligned(458820), 467840, MainMemory.getI32Aligned(459340), 1);
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
/* 64 */       com.emt.proteus.runtime.api.Jump.label(8000000);
/* 65 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1609.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */