/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class __tcf_475184 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 1645;
/* 12 */   public static final Function _instance = new __tcf_475184();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public __tcf_475184() { super("__tcf_475184", 1, false); }
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
/* 41 */       i = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 48 */         _ZNSsD1Ev.call(478816 + (38 - i << 2));
/* 49 */         i += 1;
/* 50 */         if (i == 39) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/__tcf_475184.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */