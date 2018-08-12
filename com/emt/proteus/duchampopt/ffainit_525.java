/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffainit_525 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffainit_525();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffainit_525() { super("ffainit_525", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean);
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
/* 33 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, j, k, bool);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/* 45 */     int k = 0;
/* 46 */     int m = 0;
/* 47 */     int n = 0;
/* 48 */     int i1 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       i = paramInt2;
/* 55 */       MainMemory.setI32(MainMemory.getI32(paramInt3) + 944, i);
/* 56 */       if (paramBoolean) {
/* 57 */         j = 0;
/*    */         
/*    */         do
/*    */         {
/* 61 */           k = i + j * 152 + 92;
/* 62 */           m = i + j * 152 + 100;
/* 63 */           n = i + j * 152 + 72;
/* 64 */           i1 = i + j * 152 + 80;
/* 65 */           paramInt2 = i + j * 152 + 116;
/* 66 */           MainMemory.setI8(i + j * 152, (byte)0);
/* 67 */           MainMemory.setF64(k, 1.0D);
/* 68 */           MainMemory.setF64(m, 0.0D);
/* 69 */           MainMemory.setI8(paramInt2, (byte)1);
/* 70 */           MainMemory.setI64(n, -1L);
/* 71 */           MainMemory.setI32(i1, 55537);
/* 72 */           j += 1;
/* 73 */         } while (j < paramInt1);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffainit_525.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */