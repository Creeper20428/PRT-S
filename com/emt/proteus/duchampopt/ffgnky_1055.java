/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffgnky_1055
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffgnky_1055();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffgnky_1055() { super("ffgnky_1055", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramLong, paramInt3, paramInt4);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, j, l, k, m);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4)
/*    */   {
/* 48 */     int i = 0;
/* 49 */     int j = 0;
/* 50 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 56 */       ffmbyt.call(paramInt3, paramLong, 0, paramInt1);
/* 57 */       MainMemory.setI8(paramInt4 + 80, (byte)0);
/* 58 */       if (ffgbyt.call(paramInt3, 80L, paramInt4, paramInt1) < 1)
/*    */       {
/* 60 */         i = MainMemory.getI32(paramInt2) + 104;
/* 61 */         MainMemory.setI64(i, MainMemory.getI64(i) + 80L);
/* 62 */         j = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 66 */           k = 79 - j;
/* 67 */           if (k < 0) {
/*    */             break;
/*    */           }
/*    */           
/*    */ 
/* 72 */           if (MainMemory.getI8(paramInt4 + k) != 32)
/*    */             break;
/* 74 */           j += 1;
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
/*    */ 
/* 89 */         MainMemory.setI8(paramInt4 + (k + 1), (byte)0);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgnky_1055.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */