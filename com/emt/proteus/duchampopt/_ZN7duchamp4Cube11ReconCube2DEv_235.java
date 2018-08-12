/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.Jump;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp4Cube11ReconCube2DEv_235 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 18 */   public static final Function _instance = new _ZN7duchamp4Cube11ReconCube2DEv_235();
/* 19 */   public final Function resolve() { return _instance; }
/*    */   
/* 21 */   public _ZN7duchamp4Cube11ReconCube2DEv_235() { super("_ZN7duchamp4Cube11ReconCube2DEv_235", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 25 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, paramInt5);
/* 26 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 41 */     paramInt4 += 2;
/* 42 */     paramInt3--;
/* 43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 44 */     paramInt4 += 2;
/* 45 */     paramInt3--;
/* 46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 47 */     paramInt4 += 2;
/* 48 */     paramInt3--;
/* 49 */     call(i, bool, j, k, m, n);
/* 50 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*    */     try
/*    */     {
/* 60 */       Jump.label(58931);
/* 61 */       MainMemory.setI8(paramInt3, (byte)1);
/* 62 */       if (MainMemory.getI8(paramInt1) != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 67 */         if (paramBoolean)
/*    */         {
/* 69 */           _ZNSaIcEC1Ev.call(paramInt5);
/* 70 */           _ZNSsC1EPKcRKSaIcE.call(paramInt2, 48128, paramInt5);
/* 71 */           _ZN11ProgressBar9fillSpaceESs.call(paramInt4, paramInt2);
/* 72 */           _ZNSsD1Ev.call(paramInt2);
/* 73 */           _ZNSaIcED1Ev.call(paramInt5);
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 83 */         Jump.label(58957);
/* 84 */         _Z10printSpacei.call(22);
/* 85 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13408);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 94 */       Jump.label(8000000);
/* 95 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11ReconCube2DEv_235.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */