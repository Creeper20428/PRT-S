/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.api.SystemLibrary;
/*    */ 
/*    */ public final class _ZN7duchamp7SectionD0Ev extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 211;
/* 13 */   public static final Function _instance = new _ZN7duchamp7SectionD0Ev();
/* 14 */   public final Function resolve() { return _instance; }
/*    */   
/* 16 */   public _ZN7duchamp7SectionD0Ev() { super("_ZN7duchamp7SectionD0Ev", 1, false); }
/*    */   
/*    */   public int execute(int paramInt)
/*    */   {
/* 20 */     call(paramInt);
/* 21 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 27 */     paramInt4 += 2;
/* 28 */     paramInt3--;
/* 29 */     call(i);
/* 30 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt)
/*    */   {
/* 36 */     int i = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 42 */       MainMemory.setI32(paramInt, 12840);
/* 43 */       i = MainMemory.getI32(paramInt + 36);
/* 44 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */         SystemLibrary.delete(i);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 60 */       i = MainMemory.getI32(paramInt + 24);
/* 61 */       if (i != 0)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 71 */         SystemLibrary.delete(i);
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 77 */       _ZNSt6vectorISsSaISsEED1Ev.call(paramInt + 8);
/* 78 */       com.emt.proteus.runtime.library.strings._ZNSsD1Ev.call(paramInt + 4);
/* 79 */       SystemLibrary.delete(paramInt); return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7SectionD0Ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */