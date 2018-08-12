/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffcmps_565 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffcmps_565();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffcmps_565() { super("ffcmps_565", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     call(paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     call(i);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/* 36 */     int j = 0;
/* 37 */     int k = 0;
/* 38 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 44 */       i = com.emt.proteus.runtime.api.SystemLibrary.strlen(paramInt);
/* 45 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 50 */         j = com.emt.proteus.runtime.library.ctype.__ctype_toupper_loc.call();
/* 51 */         k = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 55 */           m = paramInt + k;
/* 56 */           MainMemory.setI8(m, (byte)MainMemory.getI32(MainMemory.getI32(j) + (MainMemory.getI8(m) << 2)));
/* 57 */           k += 1;
/* 58 */           if (k == i) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffcmps_565.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */