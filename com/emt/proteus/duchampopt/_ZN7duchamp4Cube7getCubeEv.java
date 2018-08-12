/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSspLERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube7getCubeEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1357;
/* 15 */   public static final Function _instance = new _ZN7duchamp4Cube7getCubeEv();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public _ZN7duchamp4Cube7getCubeEv() { super("_ZN7duchamp4Cube7getCubeEv", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 22 */     return call(paramInt);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = call(i);
/* 31 */     paramFrame.setI32(paramInt1, j);
/* 32 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt)
/*    */   {
/* 37 */     int i = 0;
/*    */     
/* 39 */     int j = 0;
/* 40 */     int k = 0;
/* 41 */     int m = 0;
/* 42 */     int n = 0;
/*    */     
/*    */ 
/* 45 */     int i1 = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 49 */       j = MainMemory.alloc(4);
/* 50 */       k = MainMemory.alloc(4);
/* 51 */       m = MainMemory.alloc(4);
/* 52 */       _ZNSsC1ERKSs.call(m, paramInt + 36);
/* 53 */       if (MainMemory.getI8(paramInt + 40) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 63 */         _ZNSsC1ERKSs.call(k, paramInt + 48);
/* 64 */         _ZNSspLERKSs.call(m, k);
/* 65 */         _ZNSsD1Ev.call(k);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 71 */       _ZNSsC1ERKSs.call(j, m);
/* 72 */       n = _ZN7duchamp4Cube7getCubeESs.call(paramInt, j);
/* 73 */       _ZNSsD1Ev.call(j);
/* 74 */       _ZNSsD1Ev.call(m);
/* 75 */       i = n;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 81 */       return i;
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/* 86 */       MainMemory.dealloc_generated(i1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube7getCubeEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */