/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class ffpkyc
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3582;
/* 14 */   public static final Function _instance = new ffpkyc();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public ffpkyc() { super("ffpkyc", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, m, n);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 49 */     int i = 0;
/* 50 */     int j = 0;
/* 51 */     int k = 0;
/*    */     
/*    */ 
/* 54 */     int m = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 58 */       i = MainMemory.alloc(71);
/* 59 */       j = MainMemory.alloc(71);
/* 60 */       k = MainMemory.alloc(81);
/* 61 */       if (MainMemory.getI32(paramInt5) <= 0) {
/*    */         break label66;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label171;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label66:
/*    */       
/*    */ 
/*    */ 
/* 77 */       MainMemory.setI16(i, (short)40);
/* 78 */       ffr2e.call(MainMemory.getF32(paramInt3), -7, j, paramInt5);
/* 79 */       SystemLibrary.strcat(i, j);
/* 80 */       SystemLibrary.memcpy(i + SystemLibrary.strlen(i), 14560, 3, 1);
/* 81 */       ffr2e.call(MainMemory.getF32(paramInt3 + 4), -7, j, paramInt5);
/* 82 */       SystemLibrary.strcat(i, j);
/* 83 */       MainMemory.setI16(i + SystemLibrary.strlen(i), (short)41);
/* 84 */       ffmkky.call(paramInt2, i, paramInt4, k, paramInt5);
/* 85 */       ffprec.call(paramInt1, k, paramInt5);
/*    */     }
/*    */     finally
/*    */     {
/*    */       label171:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 96 */       MainMemory.dealloc_generated(m);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpkyc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */