/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffpsvc_1387 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffpsvc_1387();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffpsvc_1387() { super("ffpsvc_1387", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3);
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
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     call(i, j, k);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 41 */     int i = 0;
/* 42 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       paramInt1 = com.emt.proteus.runtime.library.cpp.__strspn_c1.call(paramInt2 + paramInt1, 32) + paramInt1;
/* 49 */       if (com.emt.proteus.lib.api.MathUtils.ult(paramInt1, 80))
/*    */       {
/* 51 */         if (MainMemory.getI8(paramInt2 + paramInt1) == 47)
/*    */         {
/* 53 */           i = paramInt1 + 1;
/* 54 */           paramInt1 = MainMemory.getI8(paramInt2 + i) == 32 ? paramInt1 + 2 : i;
/*    */         }
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
/* 68 */         com.emt.proteus.runtime.api.SystemLibrary.strcat(paramInt3, paramInt2 + paramInt1);
/* 69 */         paramInt1 = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt3) + -1;
/* 70 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 74 */           j = paramInt1 - i;
/* 75 */           paramInt2 = paramInt3 + j;
/* 76 */           if (j <= -1)
/*    */             break;
/* 78 */           if (MainMemory.getI8(paramInt2) != 32)
/*    */             break;
/* 80 */           MainMemory.setI8(paramInt2, (byte)0);
/* 81 */           i += 1;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpsvc_1387.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */