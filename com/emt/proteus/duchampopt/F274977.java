/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class F274977 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3101;
/* 11 */   public static final Function _instance = new F274977();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public F274977() { super("F274977", 1, false); }
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
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/*    */     try
/*    */     {
/* 39 */       if (paramInt != 14) {
/*    */         break label30;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 49 */       com.emt.proteus.runtime.api.SystemLibrary.longjmp(471136, paramInt);
/*    */       
/*    */ 
/*    */       label30:
/*    */       
/*    */ 
/* 55 */       com.emt.proteus.runtime.api.SystemLibrary.exit(paramInt);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 60 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F274977.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */