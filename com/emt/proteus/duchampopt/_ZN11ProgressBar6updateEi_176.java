/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c;
/*    */ 
/*    */ public final class _ZN11ProgressBar6updateEi_176 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new _ZN11ProgressBar6updateEi_176();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _ZN11ProgressBar6updateEi_176() { super("_ZN11ProgressBar6updateEi_176", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 19 */     call(paramInt);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     call(i);
/* 29 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 35 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 41 */       paramInt += 2;
/* 42 */       if (paramInt > 0) {
/* 43 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 47 */           _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)8);
/* 48 */           i += 1;
/* 49 */           if (i == paramInt) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN11ProgressBar6updateEi_176.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */