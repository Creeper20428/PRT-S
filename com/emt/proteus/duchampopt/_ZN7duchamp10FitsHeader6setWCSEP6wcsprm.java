/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZN7duchamp10FitsHeader6setWCSEP6wcsprm
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 304;
/* 13 */   public static final Function _instance = new _ZN7duchamp10FitsHeader6setWCSEP6wcsprm();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp10FitsHeader6setWCSEP6wcsprm() { super("_ZN7duchamp10FitsHeader6setWCSEP6wcsprm", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     call(paramInt1, paramInt2);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 30 */     paramInt4 += 2;
/* 31 */     paramInt3--;
/* 32 */     call(i, j);
/* 33 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 39 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 45 */       i = paramInt1 + 4;
/* 46 */       wcssub.call(paramInt2, MainMemory.getI32(i));
/* 47 */       wcsset.call(MainMemory.getI32(i));
/* 48 */       if (MainMemory.getI32(paramInt2 + 744) != -1)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */         if (MainMemory.getI32(paramInt2 + 748) != -1) {
/*    */           break label79;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label92;
/*    */       
/*    */ 
/*    */ 
/*    */       label79:
/*    */       
/*    */ 
/*    */ 
/* 74 */       MainMemory.setI8(paramInt1 + 12, (byte)1);
/*    */       
/*    */ 
/*    */       label92:
/*    */       
/*    */ 
/* 80 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader6setWCSEP6wcsprm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */