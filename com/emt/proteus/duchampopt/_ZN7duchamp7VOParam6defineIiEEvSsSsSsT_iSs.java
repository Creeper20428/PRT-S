/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSolsEi;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsaSERKSs;
/*    */ 
/*    */ public final class _ZN7duchamp7VOParam6defineIiEEvSsSsSsT_iSs extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2244;
/* 17 */   public static final Function _instance = new _ZN7duchamp7VOParam6defineIiEEvSsSsSsT_iSs();
/* 18 */   public final Function resolve() { return _instance; }
/*    */   
/* 20 */   public _ZN7duchamp7VOParam6defineIiEEvSsSsSsT_iSs() { super("_ZN7duchamp7VOParam6defineIiEEvSsSsSsT_iSs", 6, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 24 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
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
/* 42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 46 */     paramInt4 += 2;
/* 47 */     paramInt3--;
/* 48 */     call(i, j, k, m, n, i1);
/* 49 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 55 */     int i = 0;
/* 56 */     int j = 0;
/*    */     
/*    */ 
/* 59 */     int k = MainMemory.alloc_base_line();
/*    */     try
/*    */     {
/* 62 */       i = MainMemory.alloc(4);
/* 63 */       j = MainMemory.alloc(188);
/* 64 */       _ZNSsaSERKSs.call(paramInt1, paramInt2);
/* 65 */       _ZNSsaSERKSs.call(paramInt1 + 4, paramInt3);
/* 66 */       _ZNSsaSERKSs.call(paramInt1 + 8, paramInt4);
/* 67 */       MainMemory.setI32(paramInt1 + 16, 0);
/* 68 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(j, 24);
/* 69 */       _ZNSolsEi.call(j + 8, paramInt5);
/* 70 */       com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(i, j);
/* 71 */       _ZNSsaSERKSs.call(paramInt1 + 12, i);
/* 72 */       _ZNSsD1Ev.call(i);
/* 73 */       _ZNSsaSERKSs.call(paramInt1 + 20, paramInt6);
/* 74 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(j);
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/* 82 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7VOParam6defineIiEEvSsSsSsT_iSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */