/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffiblk_1085 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffiblk_1085();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffiblk_1085() { super("ffiblk_1085", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramBoolean, paramInt3);
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
/* 32 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     call(i, j, bool, k);
/* 39 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
/*    */   {
/* 45 */     int i = 0;
/* 46 */     int j = 0;
/* 47 */     int k = 0;
/* 48 */     int m = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 53 */       Jump.label(322481);
/* 54 */       if (!paramBoolean)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 59 */         i = MainMemory.getI32(paramInt1);
/* 60 */         j = paramInt1 + 4;
/* 61 */         k = MainMemory.getI32(j);
/* 62 */         m = MainMemory.getI32(k + 64);
/* 63 */         if (i == m) {
/* 64 */           i = m;
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 70 */           ffmahd.call(paramInt1, i + 1, 0, paramInt3);
/* 71 */           k = MainMemory.getI32(j);
/* 72 */           i = MainMemory.getI32(k + 64);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 81 */         Jump.label(322503);
/*    */         
/*    */ 
/* 84 */         MainMemory.setI64(k + 104, MainMemory.getI64(MainMemory.getI32(k + 84) + (i << 3)) + 80L);
/* 85 */         ffmkey.call(paramInt1, paramInt2, paramInt3);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 94 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffiblk_1085.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */