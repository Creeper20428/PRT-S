/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*    */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*    */ 
/*    */ public final class _ZN7duchamp5Param16getFullImageFileEv extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 58;
/* 14 */   public static final Function _instance = new _ZN7duchamp5Param16getFullImageFileEv();
/* 15 */   public final Function resolve() { return _instance; }
/*    */   
/* 17 */   public _ZN7duchamp5Param16getFullImageFileEv() { super("_ZN7duchamp5Param16getFullImageFileEv", 2, false); }
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
/* 40 */     int i = 0;
/*    */     
/*    */ 
/* 43 */     int j = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 47 */       i = MainMemory.alloc(4);
/* 48 */       if (MainMemory.getI8(paramInt2 + 8) != 0) {
/*    */         break label54;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */       _ZNSsC1ERKSs.call(paramInt1, paramInt2 + 4);
/*    */       
/*    */ 
/*    */       break label85;
/*    */       
/*    */       label54:
/*    */       
/* 65 */       _ZNSsC1ERKSs.call(i, paramInt2 + 16);
/* 66 */       _ZNSsC1ERKSs.call(paramInt1, paramInt2 + 4);
/* 67 */       com.emt.proteus.runtime.library.strings._ZNSs6appendERKSs.call(paramInt1, i);
/* 68 */       _ZNSsD1Ev.call(i);
/*    */     }
/*    */     finally
/*    */     {
/*    */       label85:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 79 */       MainMemory.dealloc_generated(j);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Param16getFullImageFileEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */