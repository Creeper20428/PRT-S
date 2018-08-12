/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*    */ 
/*    */ public final class _Z9stringizeb extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2715;
/* 13 */   public static final Function _instance = new _Z9stringizeb();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _Z9stringizeb() { super("_Z9stringizeb", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, byte paramByte)
/*    */   {
/* 20 */     call(paramInt, paramByte);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, b);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt, byte paramByte)
/*    */   {
/*    */     try
/*    */     {
/* 44 */       _ZNSsC1Ev.call(paramInt);
/* 45 */       if (paramByte != 0) {
/*    */         break label39;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 55 */       _ZNSsaSEPKc.call(paramInt, 24960);
/*    */       
/*    */       break label52;
/*    */       
/*    */       label39:
/* 60 */       _ZNSsaSEPKc.call(paramInt, 18688);
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       label52:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 71 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z9stringizeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */