/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp9DataArrayD0Ev_386 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp9DataArrayD0Ev_386();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp9DataArrayD0Ev_386() { super("_ZN7duchamp9DataArrayD0Ev_386", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 18 */     call(paramInt);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/* 35 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 40 */       Jump.label(107762);
/* 41 */       i = paramInt + 12;
/* 42 */       if (MainMemory.getI8(i) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 47 */         j = MainMemory.getI32(paramInt + 8);
/* 48 */         if (j != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 53 */           com.emt.proteus.runtime.api.SystemLibrary.deletearray(j);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 60 */         Jump.label(107779);
/* 61 */         MainMemory.setI8(i, (byte)0);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 70 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DataArrayD0Ev_386.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */