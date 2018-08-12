/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.lib.api.MathUtils;
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsixEj;
/*    */ 
/*    */ public final class _Z9makelowerSs extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2709;
/* 17 */   public static final Function _instance = new _Z9makelowerSs();
/* 18 */   public final Function resolve() { return _instance; }
/*    */   
/* 20 */   public _Z9makelowerSs() { super("_Z9makelowerSs", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 24 */     call(paramInt1, paramInt2);
/* 25 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(i, j);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/*    */     
/*    */ 
/* 47 */     int k = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 51 */       i = MainMemory.alloc(1);
/* 52 */       com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(i);
/* 53 */       _ZNSsC1EPKcRKSaIcE.call(paramInt1, 12960, i);
/* 54 */       com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev.call(i);
/* 55 */       j = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 62 */         if (!MathUtils.ugt(_ZNKSs4sizeEv.call(paramInt2), j)) {
/*    */           break;
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */         com.emt.proteus.runtime.library.strings._ZNSspLEc.call(paramInt1, (byte)SystemLibrary.tolower(MainMemory.getI8(_ZNSsixEj.call(paramInt2, j))));
/* 73 */         j += 1;
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
/*    */       return;
/*    */     }
/*    */     finally
/*    */     {
/* 89 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z9makelowerSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */