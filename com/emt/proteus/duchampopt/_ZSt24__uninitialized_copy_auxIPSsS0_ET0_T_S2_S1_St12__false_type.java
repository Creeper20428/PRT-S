/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ 
/*    */ public final class _ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2625;
/* 12 */   public static final Function _instance = new _ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type() { super("_ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     return call(paramInt1, paramInt2, paramInt3);
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
/* 33 */     int m = call(i, j, k);
/* 34 */     paramFrame.setI32(paramInt1, m);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 40 */     int i = 0;
/*    */     
/* 42 */     int j = 0;
/* 43 */     int k = 0;
/* 44 */     int m = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 50 */       j = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 57 */         k = paramInt3 + (j << 2);
/* 58 */         m = paramInt1 + (j << 2);
/* 59 */         if (m != paramInt2) {
/*    */           break label67;
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 69 */         i = k;
/* 70 */         break;
/*    */         
/*    */ 
/*    */         label67:
/*    */         
/*    */ 
/* 76 */         if (k != 0)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 86 */           _ZNSsC1ERKSs.call(k, m);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/* 92 */         j += 1;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/* 97 */       int n = i;return n;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt24__uninitialized_copy_auxIPSsS0_ET0_T_S2_S1_St12__false_type.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */