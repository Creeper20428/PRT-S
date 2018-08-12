/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ 
/*    */ public final class _ZN7duchamp24writeMomentMapHeaderInfoEP8fitsfileRNS_5ParamE
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2019;
/* 17 */   public static final Function _instance = new _ZN7duchamp24writeMomentMapHeaderInfoEP8fitsfileRNS_5ParamE();
/* 18 */   public final Function resolve() { return _instance; }
/*    */   
/* 20 */   public _ZN7duchamp24writeMomentMapHeaderInfoEP8fitsfileRNS_5ParamE() { super("_ZN7duchamp24writeMomentMapHeaderInfoEP8fitsfileRNS_5ParamE", 2, false); }
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
/* 45 */     int k = 0;
/* 46 */     int m = 0;
/* 47 */     int n = 0;
/*    */     
/*    */ 
/* 50 */     int i1 = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 54 */       i = MainMemory.alloc(4);
/* 55 */       j = MainMemory.alloc(4);
/* 56 */       k = MainMemory.alloc(4);
/* 57 */       MainMemory.setI32(k, 0);
/* 58 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(465120), k);
/* 59 */       MainMemory.setI32(k, 0);
/* 60 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(466000), k);
/* 61 */       MainMemory.setI32(k, 0);
/* 62 */       _ZNSsC1ERKSs.call(j, paramInt2 + 4);
/* 63 */       ffphis.call(paramInt1, _ZNKSs5c_strEv.call(j), k);
/* 64 */       _ZNSsD1Ev.call(j);
/* 65 */       if (MainMemory.getI8(paramInt2 + 8) != 0) {
/*    */         break label128;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label198;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label128:
/*    */       
/*    */ 
/*    */ 
/* 81 */       MainMemory.setI32(k, 0);
/* 82 */       ffpcom.call(paramInt1, _ZNKSs5c_strEv.call(466704), k);
/* 83 */       MainMemory.setI32(k, 0);
/* 84 */       m = _ZNKSs5c_strEv.call(462480);
/* 85 */       _ZNSsC1ERKSs.call(i, paramInt2 + 16);
/* 86 */       n = _ZNKSs5c_strEv.call(i);
/* 87 */       ffpky.call(paramInt1, 16, _ZNKSs5c_strEv.call(463360), n, m, k);
/* 88 */       _ZNSsD1Ev.call(i);
/*    */     }
/*    */     finally
/*    */     {
/*    */       label198:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 99 */       MainMemory.dealloc_generated(i1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp24writeMomentMapHeaderInfoEP8fitsfileRNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */