/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class fits_read_fits_region_1499 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new fits_read_fits_region_1499();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public fits_read_fits_region_1499() { super("fits_read_fits_region_1499", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
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
/* 36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, k, m, bool);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*    */   {
/* 46 */     double d1 = 0.0D;
/* 47 */     int i = 0;
/* 48 */     double d2 = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       if (!paramBoolean)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 59 */         d1 = MainMemory.getF64(paramInt2) - MainMemory.getF64(paramInt1);
/* 60 */         if (paramInt3 != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 65 */           paramInt3 = com.emt.proteus.lib.api.MathUtils.ugt(paramInt3, 1) ? paramInt3 : 1;
/* 66 */           i = 0;
/*    */           
/*    */           for (;;)
/*    */           {
/* 70 */             paramInt1 = paramInt4 + (i << 3);
/* 71 */             d2 = MainMemory.getF64(paramInt1) + d1;
/* 72 */             MainMemory.setF64(paramInt1, d2);
/* 73 */             i += 1;
/* 74 */             if (i == paramInt3) {
/*    */               break;
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_read_fits_region_1499.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */