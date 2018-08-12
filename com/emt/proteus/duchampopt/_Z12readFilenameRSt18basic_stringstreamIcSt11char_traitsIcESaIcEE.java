/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _Z12readFilenameRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2714;
/* 16 */   public static final Function _instance = new _Z12readFilenameRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE();
/* 17 */   public final Function resolve() { return _instance; }
/*    */   
/* 19 */   public _Z12readFilenameRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE() { super("_Z12readFilenameRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 23 */     call(paramInt1, paramInt2);
/* 24 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     call(i, j);
/* 36 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 42 */     int i = 0;
/* 43 */     int j = 0;
/*    */     
/*    */ 
/* 46 */     int k = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 49 */       i = MainMemory.alloc(4);
/* 50 */       j = MainMemory.alloc(4);
/* 51 */       _ZNSsC1Ev.call(j);
/* 52 */       _ZSt7getlineIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RSbIS4_S5_T1_E.call(paramInt2, j);
/* 53 */       _ZNSsC1ERKSs.call(i, j);
/* 54 */       _Z19removeLeadingBlanksSs.call(paramInt1, i);
/* 55 */       _ZNSsD1Ev.call(i);
/* 56 */       _ZNSsD1Ev.call(j);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 64 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z12readFilenameRSt18basic_stringstreamIcSt11char_traitsIcESaIcEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */