/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ 
/*    */ public final class ffi8fstr extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 3533;
/* 11 */   public static final Function _instance = new ffi8fstr();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffi8fstr() { super("ffi8fstr", 8, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2, paramInt3, paramInt4, paramInt5, paramInt6);
/* 19 */     return 0;
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
/* 30 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
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
/* 48 */     call(i, j, d1, d2, k, m, n, i1);
/* 49 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 55 */     boolean bool = false;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 61 */       bool = paramInt2 > 0;
/* 62 */       if ((!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble1, 1.0D)) && (!com.emt.proteus.lib.api.MathUtils.f_une(paramDouble2, 0.0D))) {
/*    */         break label72;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */       ffi8fstr_1084.call(paramInt5, paramInt4, paramInt2, paramDouble1, bool, paramInt6, paramInt3, paramDouble2, paramInt1);
/*    */       
/*    */       break label92;
/*    */       
/*    */       label72:
/* 77 */       ffi8fstr_1083.call(paramInt6, paramInt5, paramInt4, paramInt3, paramInt2, paramInt1, bool);
/*    */       
/*    */ 
/*    */       label92:
/*    */       
/*    */ 
/* 83 */       paramInt3 = com.emt.proteus.runtime.api.SystemLibrary.strchr(paramInt5, 44);
/* 84 */       if (paramInt3 != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         for (;;)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 96 */           com.emt.proteus.runtime.api.MainMemory.setI8(paramInt3, (byte)46);
/* 97 */           paramInt3 = com.emt.proteus.runtime.api.SystemLibrary.strchr(paramInt3, 44);
/* 98 */           if (paramInt3 == 0) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffi8fstr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */