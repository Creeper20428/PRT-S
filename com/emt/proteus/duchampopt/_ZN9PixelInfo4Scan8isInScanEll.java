/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN9PixelInfo4Scan8isInScanEll extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 325;
/* 11 */   public static final Function _instance = new _ZN9PixelInfo4Scan8isInScanEll();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN9PixelInfo4Scan8isInScanEll() { super("_ZN9PixelInfo4Scan8isInScanEll", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     return call(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     byte b = call(i, j, k);
/* 33 */     paramFrame.setI8(paramInt1, b);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static byte call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 39 */     byte b1 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 46 */       if (MainMemory.getI32(paramInt1 + 4) != paramInt3) {
/*    */         break label78;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 56 */       paramInt3 = MainMemory.getI32(paramInt1 + 8);
/* 57 */       if (paramInt3 <= paramInt2)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */         b1 = (byte)(paramInt3 + MainMemory.getI32(paramInt1 + 12) > paramInt2 ? 1 : 0);
/*    */       } else {
/*    */         label78:
/*    */         
/*    */ 
/*    */ 
/*    */ 
/* 74 */         b1 = 0;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 80 */       byte b2 = b1;return b2;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo4Scan8isInScanEll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */