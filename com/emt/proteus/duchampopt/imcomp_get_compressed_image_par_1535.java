/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class imcomp_get_compressed_image_par_1535 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new imcomp_get_compressed_image_par_1535();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public imcomp_get_compressed_image_par_1535() { super("imcomp_get_compressed_image_par_1535", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
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
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/* 38 */     int j = 0;
/* 39 */     int k = 0;
/* 40 */     int m = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 45 */       com.emt.proteus.runtime.api.Jump.label(403937);
/* 46 */       i = MainMemory.getI32(paramInt2);
/* 47 */       j = i + 1164;
/* 48 */       if (MainMemory.getI32(j) < 16)
/*    */       {
/* 50 */         k = i + 1168;
/* 51 */         m = MainMemory.getI32(k);
/* 52 */         if (m > 8)
/*    */         {
/* 54 */           MainMemory.setI32(paramInt1, m);
/* 55 */           MainMemory.setI32(k, MainMemory.getI32(j));
/* 56 */           MainMemory.setI32(MainMemory.getI32(paramInt2) + 1164, MainMemory.getI32(paramInt1));
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
/* 73 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/imcomp_get_compressed_image_par_1535.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */