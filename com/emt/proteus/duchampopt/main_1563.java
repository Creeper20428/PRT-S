/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class main_1563 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 17 */   public static final Function _instance = new main_1563();
/* 18 */   public final Function resolve() { return _instance; }
/*    */   
/* 20 */   public main_1563() { super("main_1563", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 24 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
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
/* 36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     call(i, j, k, m);
/* 43 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/*    */     try
/*    */     {
/* 53 */       Jump.label(6476);
/* 54 */       if (MainMemory.getI8(paramInt3 + 169) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 59 */         _ZN7duchamp5Param16outputSmoothFileEv.call(paramInt2, paramInt1);
/* 60 */         _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 68192), paramInt2), 18656), 80);
/* 61 */         _ZNSsD1Ev.call(paramInt2);
/* 62 */         if (_ZN7duchamp4Cube16saveSmoothedCubeEv.call(paramInt4) == 1)
/*    */         {
/* 64 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 42432);
/*    */ 
/*    */ 
/*    */         }
/*    */         else
/*    */         {
/*    */ 
/* 71 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 28288);
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 82 */       Jump.label(8000000);
/* 83 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/main_1563.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */