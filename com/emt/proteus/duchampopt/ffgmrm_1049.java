/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffgmrm_1049 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 13 */   public static final Function _instance = new ffgmrm_1049();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public ffgmrm_1049() { super("ffgmrm_1049", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, byte paramByte, int paramInt3, int paramInt4)
/*    */   {
/* 20 */     call(paramInt1, paramInt2, paramByte, paramInt3, paramInt4);
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
/* 32 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     call(i, j, b, k, m);
/* 42 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, byte paramByte, int paramInt3, int paramInt4)
/*    */   {
/* 48 */     int i = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 53 */       Jump.label(361308);
/* 54 */       if ((fits_is_url_absolute.call(paramInt2) == 0) && (paramByte != 47))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 59 */         SystemLibrary.strcpy(paramInt4, MainMemory.getI32(MainMemory.getI32(MainMemory.getI32(paramInt1) + 4) + 12));
/* 60 */         i = SystemLibrary.strrchr(paramInt4, 47);
/* 61 */         if (i != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 66 */           MainMemory.setI8(i, (byte)0);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */         Jump.label(361330);
/* 74 */         MainMemory.setI16(paramInt4 + SystemLibrary.strlen(paramInt4), (short)47);
/* 75 */         SystemLibrary.strcat(paramInt4, paramInt2);
/* 76 */         MainMemory.setI32(paramInt3, fits_clean_url.call(paramInt4, paramInt2, paramInt3));
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 85 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgmrm_1049.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */