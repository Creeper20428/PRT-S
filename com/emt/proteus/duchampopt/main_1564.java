/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class main_1564 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 19 */   public static final Function _instance = new main_1564();
/* 20 */   public final Function resolve() { return _instance; }
/*    */   
/* 22 */   public main_1564() { super("main_1564", 4, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 26 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/* 27 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 33 */     paramInt4 += 2;
/* 34 */     paramInt3--;
/* 35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 36 */     paramInt4 += 2;
/* 37 */     paramInt3--;
/* 38 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 39 */     paramInt4 += 2;
/* 40 */     paramInt3--;
/* 41 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 42 */     paramInt4 += 2;
/* 43 */     paramInt3--;
/* 44 */     call(i, j, k, m);
/* 45 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 51 */     int i = 0;
/* 52 */     int j = 0;
/*    */     
/*    */ 
/*    */     try
/*    */     {
/* 57 */       Jump.label(6614);
/* 58 */       if (MainMemory.getI8(paramInt3 + 116) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 63 */         i = MainMemory.getI32(paramInt1);
/* 64 */         if (MainMemory.getI32(i + 4) - MainMemory.getI32(i) >= 276)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/* 69 */           com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs.call(paramInt4, paramInt3 + 120);
/* 70 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(paramInt2, _ZNKSs5c_strEv.call(paramInt4), 1);
/* 71 */           _ZNSsD1Ev.call(paramInt4);
/* 72 */           j = paramInt2;
/* 73 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(j, 98464);
/* 74 */           _ZN7duchamplsERSoRNS_9DataArrayE.call(j, paramInt3);
/* 75 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(paramInt2);
/* 76 */           _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(paramInt2);
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
/* 87 */       Jump.label(8000000); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/main_1564.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */