/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class ffgmf_1048 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffgmf_1048();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffgmf_1048() { super("ffgmf_1048", 2, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt)
/*    */   {
/* 19 */     call(paramBoolean, paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     call(bool, i);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 42 */       Jump.label(360756);
/* 43 */       if (paramBoolean)
/*    */       {
/* 45 */         if (com.emt.proteus.runtime.api.MainMemory.getI32(paramInt) == 0)
/*    */         {
/* 47 */           com.emt.proteus.runtime.api.MainMemory.setI32(paramInt, 342);
/* 48 */           ffxmsg.call(5, 93600);
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
/* 65 */       Jump.label(8000000);
/* 66 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmf_1048.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */