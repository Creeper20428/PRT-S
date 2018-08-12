/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs6substrEjj;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp10FitsHeader12needBeamSizeEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 293;
/* 16 */   public static final Function _instance = new _ZN7duchamp10FitsHeader12needBeamSizeEv();
/* 17 */   public final Function resolve() { return _instance; }
/*    */   
/* 19 */   public _ZN7duchamp10FitsHeader12needBeamSizeEv() { super("_ZN7duchamp10FitsHeader12needBeamSizeEv", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 23 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     byte b = call(i);
/* 32 */     paramFrame.setI8(paramInt1, b);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static byte call(int paramInt)
/*    */   {
/* 38 */     byte b1 = 0;
/*    */     
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/* 43 */     int m = 0;
/* 44 */     byte b2 = 0;
/*    */     
/*    */ 
/* 47 */     int n = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 51 */       i = MainMemory.alloc(4);
/* 52 */       j = MainMemory.alloc(4);
/* 53 */       k = paramInt + 36;
/* 54 */       m = _ZNKSs4sizeEv.call(k);
/* 55 */       if ((MainMemory.getI32(paramInt + 64) != 0) && (m >= 6)) {
/*    */         break label85;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 65 */       b1 = 0;
/*    */       
/*    */ 
/*    */       break label137;
/*    */       
/*    */       label85:
/*    */       
/* 72 */       _ZNKSs6substrEjj.call(i, k, m + -5, m);
/* 73 */       _Z9makelowerSs.call(j, i);
/* 74 */       _ZNSsD1Ev.call(i);
/* 75 */       b2 = (byte)(_ZNKSs7compareEPKc.call(j, 25184) == 0 ? 1 : 0);
/* 76 */       _ZNSsD1Ev.call(j);
/* 77 */       b1 = b2;
/*    */       
/*    */ 
/*    */       label137:
/*    */       
/*    */ 
/* 83 */       return b1;
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/* 88 */       MainMemory.dealloc_generated(n);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader12needBeamSizeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */