/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class _ZN7duchamp6Filter12getNumScalesEl extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 506;
/* 11 */   public static final Function _instance = new _ZN7duchamp6Filter12getNumScalesEl();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZN7duchamp6Filter12getNumScalesEl() { super("_ZN7duchamp6Filter12getNumScalesEl", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     return call(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 24 */     paramInt4 += 2;
/* 25 */     paramInt3--;
/* 26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     int m = call(i, j, k);
/* 33 */     paramFrame.setI32(paramInt1, m);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 39 */     int i = 0;
/*    */     
/* 41 */     int j = 0;
/* 42 */     double d1 = 0.0D;
/* 43 */     double d2 = 0.0D;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 49 */       j = paramInt2 - paramInt1 >> 3;
/* 50 */       switch (j)
/*    */       {
/*    */       case 3: 
/*    */         break label101;
/*    */         
/*    */         break;
/*    */       case 5: 
/*    */         break;
/*    */       }
/*    */       
/*    */       
/* 61 */       d1 = paramInt3 + -1;
/* 62 */       d1 = SystemLibrary.log(d1) / 0.6931471805599453D;
/* 63 */       i = (int)d1 + -1;
/*    */       
/*    */ 
/*    */       break label179;
/*    */       
/*    */       label101:
/*    */       
/* 70 */       d1 = paramInt3 + -1;
/* 71 */       d1 = SystemLibrary.log(d1) / 0.6931471805599453D;
/* 72 */       i = (int)d1;
/*    */       
/*    */ 
/*    */ 
/*    */       break label179;
/*    */       
/*    */ 
/* 79 */       d1 = paramInt3 + -1;
/* 80 */       d2 = j + -1 & 0xFFFFFFFF;
/* 81 */       d1 /= d2;
/* 82 */       d1 = SystemLibrary.log(d1) / 0.6931471805599453D;
/* 83 */       i = (int)d1 + 1;
/*    */       
/*    */ 
/*    */       label179:
/*    */       
/*    */ 
/* 89 */       int k = i; return k;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp6Filter12getNumScalesEl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */