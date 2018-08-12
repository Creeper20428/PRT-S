/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c;
/*    */ 
/*    */ public final class _Z10printSpacei extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2661;
/* 12 */   public static final Function _instance = new _Z10printSpacei();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public _Z10printSpacei() { super("_Z10printSpacei", 1, false); }
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
/* 41 */       if (paramInt > 0) {
/* 42 */         i = 0;
/*    */       } else {
/*    */         break label52;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 53 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)32);
/* 54 */         i += 1;
/* 55 */         if (i == paramInt) {
/*    */           break;
/*    */         }
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       label52:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z10printSpacei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */