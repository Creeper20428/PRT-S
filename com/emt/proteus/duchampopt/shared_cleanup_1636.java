/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ 
/*    */ public final class shared_cleanup_1636 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new shared_cleanup_1636();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public shared_cleanup_1636() { super("shared_cleanup_1636", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 19 */     call(paramInt1, paramInt2);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     call(i, j);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 38 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 43 */       Jump.label(276242);
/* 44 */       if (com.emt.proteus.runtime.api.MainMemory.getI32(paramInt1 + (paramInt2 << 4) + 8) == -1)
/*    */       {
/* 46 */         i = F276629.call(paramInt2);
/* 47 */         if (!com.emt.proteus.runtime.api.MainMemory.getI1(459004))
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 52 */           if (i == 0)
/*    */           {
/* 54 */             com.emt.proteus.runtime.api.SystemLibrary.printf(27264, new Object[] { Integer.valueOf(paramInt2) });
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/* 61 */             com.emt.proteus.runtime.api.SystemLibrary.printf(62848, new Object[] { Integer.valueOf(paramInt2) });
/*    */           }
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
/* 79 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/shared_cleanup_1636.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */