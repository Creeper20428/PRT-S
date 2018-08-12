/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.c.free;
/*    */ 
/*    */ public final class ffchdu_550 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new ffchdu_550();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public ffchdu_550() { super("ffchdu_550", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 19 */     call(paramInt1, paramInt2);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     call(i, j);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 38 */     int i = 0;
/* 39 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 44 */       Jump.label(321617);
/* 45 */       i = MainMemory.getI32(paramInt1 + 944);
/* 46 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 51 */         free.call(i);
/* 52 */         MainMemory.setI32(MainMemory.getI32(paramInt2) + 944, 0);
/* 53 */         paramInt1 = MainMemory.getI32(paramInt2);
/* 54 */         j = MainMemory.getI32(paramInt1 + 1200);
/* 55 */         if (j != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 61 */           free.call(j);
/* 62 */           MainMemory.setI32(MainMemory.getI32(paramInt2) + 1200, 0);
/* 63 */           MainMemory.setI32(MainMemory.getI32(paramInt2) + 1188, 0);
/* 64 */           MainMemory.setI32(MainMemory.getI32(paramInt2) + 1192, 0);
/* 65 */           MainMemory.setI32(MainMemory.getI32(paramInt2) + 1196, 0);
/* 66 */           paramInt1 = MainMemory.getI32(paramInt2);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 74 */         Jump.label(321652);
/*    */         
/* 76 */         j = MainMemory.getI32(paramInt1 + 1204);
/* 77 */         if (j != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 82 */           free.call(j);
/* 83 */           MainMemory.setI32(MainMemory.getI32(paramInt2) + 1204, 0);
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
/* 96 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffchdu_550.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */