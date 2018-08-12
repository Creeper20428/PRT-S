/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class wcs_types_1705 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new wcs_types_1705();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public wcs_types_1705() { super("wcs_types_1705", 2, false); }
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
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 44 */       if (MainMemory.getI8(paramInt1) == 45)
/*    */       {
/* 46 */         MainMemory.setI8(paramInt1, (byte)0);
/* 47 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 51 */           j = 7 - i;
/* 52 */           paramInt1 = paramInt2 + j;
/* 53 */           if (j <= 0)
/*    */             break;
/* 55 */           if (MainMemory.getI8(paramInt1) != 45)
/*    */             break;
/* 57 */           MainMemory.setI8(paramInt1, (byte)0);
/* 58 */           i += 1;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcs_types_1705.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */