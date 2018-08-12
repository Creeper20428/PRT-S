/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.library.c.free;
/*    */ 
/*    */ public final class linset_1561 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new linset_1561();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public linset_1561() { super("linset_1561", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, boolean paramBoolean)
/*    */   {
/* 19 */     call(paramInt, paramBoolean);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     call(i, bool);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, boolean paramBoolean)
/*    */   {
/* 38 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 43 */       Jump.label(209236);
/* 44 */       if (paramBoolean)
/*    */       {
/* 46 */         i = com.emt.proteus.runtime.api.MainMemory.getI32(paramInt + 20);
/* 47 */         if (i != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 52 */           free.call(i);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 59 */         Jump.label(209250);
/* 60 */         i = com.emt.proteus.runtime.api.MainMemory.getI32(paramInt + 24);
/* 61 */         if (i != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 66 */           free.call(i);
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
/* 82 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/linset_1561.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */