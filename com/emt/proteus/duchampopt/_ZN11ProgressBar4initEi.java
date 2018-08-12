/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ 
/*    */ public final class _ZN11ProgressBar4initEi extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2665;
/* 14 */   public static final Function _instance = new _ZN11ProgressBar4initEi();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN11ProgressBar4initEi() { super("_ZN11ProgressBar4initEi", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 21 */     call(paramInt1, paramInt2);
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 40 */     float f1 = 0.0F;
/* 41 */     int i = 0;
/* 42 */     float f2 = 0.0F;
/* 43 */     int j = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       f1 = paramInt2;
/* 50 */       i = paramInt1 + 12;
/* 51 */       f2 = MainMemory.getI32(i);
/* 52 */       f1 /= f2;
/* 53 */       MainMemory.setF32(paramInt1 + 8, f1);
/* 54 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13728);
/* 55 */       paramInt2 = MainMemory.getI32(i);
/* 56 */       if (paramInt2 > 0) {
/* 57 */         j = 0;
/*    */       } else {
/*    */         break label107;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 68 */         com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)32);
/* 69 */         j += 1;
/* 70 */         if (j == paramInt2) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */       label107:
/*    */       
/*    */ 
/*    */ 
/* 81 */       _ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13728), 80);
/* 82 */       MainMemory.setI32(paramInt1 + 4, 1); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN11ProgressBar4initEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */