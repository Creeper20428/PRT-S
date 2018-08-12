/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class deflate_523 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new deflate_523();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public deflate_523() { super("deflate_523", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, j, k, m, n);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 47 */     int i = 0;
/* 48 */     int j = 0;
/* 49 */     int k = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 54 */       com.emt.proteus.runtime.api.Jump.label(433638);
/* 55 */       i = MainMemory.getI32(paramInt3);
/* 56 */       j = i + 2;
/* 57 */       if (!com.emt.proteus.lib.api.MathUtils.ugt(j, MainMemory.getI32(paramInt4)))
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 62 */         k = paramInt1 + 8;
/* 63 */         paramInt4 = paramInt5 + 48;
/* 64 */         MainMemory.setI8(MainMemory.getI32(k) + i, (byte)MainMemory.getI32(paramInt4));
/* 65 */         i += 1;
/* 66 */         MainMemory.setI32(paramInt3, i);
/* 67 */         MainMemory.setI8(MainMemory.getI32(k) + i, (byte)(MainMemory.getI32(paramInt4) >>> 8));
/* 68 */         MainMemory.setI32(paramInt3, j);
/* 69 */         MainMemory.setI32(paramInt4, crc32.call(0, 0, 0));
/* 70 */         MainMemory.setI32(paramInt2, 113);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 77 */       com.emt.proteus.runtime.api.Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/deflate_523.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */