/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ 
/*    */ public final class _ZN9PixelInfolsERSoRNS_4ScanE extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 327;
/* 13 */   public static final Function _instance = new _ZN9PixelInfolsERSoRNS_4ScanE();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN9PixelInfolsERSoRNS_4ScanE() { super("_ZN9PixelInfolsERSoRNS_4ScanE", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     return call(paramInt1, paramInt2);
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
/* 31 */     int k = call(i, j);
/* 32 */     paramFrame.setI32(paramInt1, k);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2)
/*    */   {
/* 38 */     int i = 0;
/*    */     
/* 40 */     int j = 0;
/* 41 */     int k = 0;
/* 42 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 48 */       j = paramInt2 + 4;
/* 49 */       k = paramInt2 + 8;
/* 50 */       m = MainMemory.getI32(k);
/* 51 */       if ((MainMemory.getI32(j) != -1) || (m != -1)) {
/*    */         break label97;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 61 */       if (MainMemory.getI32(paramInt2 + 12) != 0) {
/*    */         break label97;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 19264);
/* 72 */       i = paramInt1;
/*    */       
/*    */ 
/*    */       break label160;
/*    */       
/*    */       label97:
/*    */       
/* 79 */       _ZNSolsEl.call(paramInt1, m);
/* 80 */       m = MainMemory.getI32(k) + -1 + MainMemory.getI32(paramInt2 + 12);
/* 81 */       _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 13472), m);
/* 82 */       m = MainMemory.getI32(j);
/* 83 */       _ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 14560), m);
/* 84 */       i = paramInt1;
/*    */       
/*    */ 
/*    */       label160:
/*    */       
/*    */ 
/* 90 */       int n = i; return n;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfolsERSoRNS_4ScanE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */