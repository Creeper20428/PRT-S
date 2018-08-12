/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class wcsutrn_switch_to_buffer_1760 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new wcsutrn_switch_to_buffer_1760();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public wcsutrn_switch_to_buffer_1760() { super("wcsutrn_switch_to_buffer_1760", 1, false); }
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
/*    */   public static void call(int paramInt)
/*    */   {
/* 34 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 39 */       com.emt.proteus.runtime.api.Jump.label(254439);
/* 40 */       if (MainMemory.getI32(paramInt) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 45 */         i = MainMemory.getI32Aligned(458884);
/* 46 */         MainMemory.setI8(i, MainMemory.getI8(459036));
/* 47 */         MainMemory.setI32(MainMemory.getI32(paramInt) + 8, i);
/* 48 */         MainMemory.setI32(MainMemory.getI32(paramInt) + 16, MainMemory.getI32Aligned(459416));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsutrn_switch_to_buffer_1760.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */