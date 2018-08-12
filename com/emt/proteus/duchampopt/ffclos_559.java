/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffclos_559 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffclos_559();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffclos_559() { super("ffclos_559", 2, false); }
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
/* 38 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 43 */       com.emt.proteus.runtime.api.Jump.label(259044);
/* 44 */       if (MainMemory.getI32(paramInt2) != 112)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 49 */         i = MainMemory.getI32(paramInt1);
/* 50 */         j = MainMemory.getI32(492288 + MainMemory.getI32(i + 4) * 84 + 68);
/* 51 */         if (j != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 56 */           com.emt.proteus.runtime.api.SystemLibrary.do_indirect(j, MainMemory.getI32(i));
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
/* 67 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffclos_559.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */