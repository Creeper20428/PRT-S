/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.c.calloc;
/*    */ 
/*    */ public final class F368223 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3467;
/* 13 */   public static final Function _instance = new F368223();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public F368223() { super("F368223", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = call(i);
/* 29 */     paramFrame.setI32(paramInt1, j);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/*    */     
/* 37 */     int j = 0;
/* 38 */     int k = 0;
/* 39 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 45 */       j = calloc.call(6, 1);
/* 46 */       if (j != 0) {
/*    */         break label51;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 56 */       ffxmsg.call(5, 117152);
/* 57 */       i = 0;
/*    */       
/*    */ 
/*    */       break label122;
/*    */       
/*    */       label51:
/*    */       
/* 64 */       k = MainMemory.getI8(paramInt) == 0 ? 1 : 0;
/* 65 */       m = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 72 */         MainMemory.setI8(j + m, MainMemory.getI8(paramInt + (k | m << 1)));
/* 73 */         m += 1;
/* 74 */         if (m == 5) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 85 */       i = j;
/*    */       
/*    */ 
/*    */       label122:
/*    */       
/*    */ 
/* 91 */       int n = i; return n;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F368223.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */