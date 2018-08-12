/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp5ParamaSERKS0__318 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZN7duchamp5ParamaSERKS0__318();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp5ParamaSERKS0__318() { super("_ZN7duchamp5ParamaSERKS0__318", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, j, k, m);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/* 45 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 51 */       i = com.emt.proteus.runtime.api.SystemLibrary.newarray(paramInt4 << 2);
/* 52 */       j = paramInt3 + 264;
/* 53 */       MainMemory.setI32(j, i);
/* 54 */       if (MainMemory.getI32(paramInt2) > 0)
/*    */       {
/* 56 */         k = paramInt1 + 264;
/*    */         
/* 58 */         paramInt4 = 0;
/*    */         
/*    */ 
/*    */         for (;;)
/*    */         {
/* 63 */           MainMemory.setI32(i + (paramInt4 << 2), MainMemory.getI32(MainMemory.getI32(k) + (paramInt4 << 2)));
/* 64 */           paramInt4 += 1;
/* 65 */           if (MainMemory.getI32(paramInt2) <= paramInt4)
/*    */             break;
/* 67 */           i = MainMemory.getI32(j);
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5ParamaSERKS0__318.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */