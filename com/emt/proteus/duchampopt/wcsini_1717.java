/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class wcsini_1717 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new wcsini_1717();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public wcsini_1717() { super("wcsini_1717", 3, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramBoolean, paramInt1, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(bool, i, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       if (paramBoolean)
/*    */       {
/* 50 */         i = paramInt1 + 24;
/* 51 */         j = paramInt1 + 28;
/* 52 */         k = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 56 */           com.emt.proteus.runtime.api.SystemLibrary.memset(com.emt.proteus.runtime.api.MainMemory.getI32(i) + k * 72, (byte)0, 72, 1);
/* 57 */           com.emt.proteus.runtime.api.SystemLibrary.memset(com.emt.proteus.runtime.api.MainMemory.getI32(j) + k * 72, (byte)0, 72, 1);
/* 58 */           k += 1;
/* 59 */           if (k == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsini_1717.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */