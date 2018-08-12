/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class _ZN9PixelInfo8Object3D7addScanENS_4ScanEl extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 369;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo8Object3D7addScanENS_4ScanEl();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo8Object3D7addScanENS_4ScanEl() { super("_ZN9PixelInfo8Object3D7addScanENS_4ScanEl", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/* 36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     call(i, j, k, m, n);
/* 40 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 46 */     int i = 0;
/* 47 */     int j = 0;
/* 48 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       paramInt4 = paramInt3 + -1 + paramInt4;
/* 55 */       if (paramInt4 >= paramInt3)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */         i = paramInt3 + 1;
/* 66 */         j = 0;
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */         for (;;)
/*    */         {
/* 73 */           com.emt.proteus.runtime.api.SystemLibrary.do_indirect(com.emt.proteus.runtime.api.MainMemory.getI32(com.emt.proteus.runtime.api.MainMemory.getI32(paramInt1) + 8), paramInt1, j + paramInt3, paramInt2, paramInt5);
/* 74 */           k = j + 1;
/* 75 */           if (paramInt4 < i + j) {
/*    */             break;
/*    */           }
/*    */           
/* 79 */           j = k;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object3D7addScanENS_4ScanEl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */