/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.c.free;
/*    */ 
/*    */ public final class F399604 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3611;
/* 13 */   public static final Function _instance = new F399604();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public F399604() { super("F399604", 2, false); }
/*    */   
/*    */   public int execute(int paramInt, long paramLong)
/*    */   {
/* 20 */     call(paramInt, paramLong);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, l);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt, long paramLong)
/*    */   {
/* 39 */     int i = 0;
/* 40 */     int j = 0;
/* 41 */     int k = 0;
/* 42 */     long l1 = 0L;
/* 43 */     long l2 = 0L;
/* 44 */     long l3 = 0L;
/* 45 */     long l4 = 0L;
/* 46 */     long l5 = 0L;
/* 47 */     int m = 0;
/* 48 */     long l6 = 0L;
/* 49 */     int n = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 55 */       i = (int)(paramLong << 1);
/* 56 */       j = com.emt.proteus.runtime.library.c.malloc.call(i);
/* 57 */       if (paramLong <= 0L) {
/*    */         break label204;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */       k = i + -1;
/* 68 */       l1 = paramInt + k & 0xFFFFFFFF;
/* 69 */       l2 = paramInt + (k - (int)paramLong) & 0xFFFFFFFF;
/* 70 */       l3 = j + k & 0xFFFFFFFF;
/* 71 */       l4 = j + (i + -2) & 0xFFFFFFFF;
/* 72 */       l5 = 0L;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 79 */         m = (int)(l2 - l5);
/* 80 */         l6 = l5 * -2L;
/* 81 */         n = (int)(l4 + l6);
/* 82 */         MainMemory.setI8((int)(l3 + l6), MainMemory.getI8((int)(l1 - l5)));
/* 83 */         MainMemory.setI8(n, MainMemory.getI8(m));
/* 84 */         l5 += 1L;
/* 85 */         if (l5 == paramLong) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */       label204:
/*    */       
/*    */ 
/*    */ 
/* 96 */       com.emt.proteus.runtime.api.SystemLibrary.memcpy(paramInt, j, i, 1);
/* 97 */       free.call(j); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F399604.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */