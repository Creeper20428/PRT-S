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
/*    */ public final class _ZN7duchamp16duchampFITSerrorEiSsSs
/*    */   extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2023;
/* 15 */   public static final Function _instance = new _ZN7duchamp16duchampFITSerrorEiSsSs();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public _ZN7duchamp16duchampFITSerrorEiSsSs() { super("_ZN7duchamp16duchampFITSerrorEiSsSs", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 22 */     call(paramInt1, paramInt2, paramInt3);
/* 23 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     call(i, j, k);
/* 38 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 44 */     int i = 0;
/* 45 */     int j = 0;
/*    */     
/*    */ 
/* 48 */     int k = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 52 */       i = MainMemory.alloc(4);
/* 53 */       j = MainMemory.alloc(4);
/* 54 */       if (paramInt1 != 0) {
/*    */         break label48;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       break label89;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       label48:
/*    */       
/*    */ 
/*    */ 
/* 70 */       _ZNSsC1ERKSs.call(j, paramInt3);
/* 71 */       _ZNSsC1ERKSs.call(i, paramInt2);
/* 72 */       _ZN7duchamp12duchampErrorESsSs.call(i, j);
/* 73 */       _ZNSsD1Ev.call(i);
/* 74 */       _ZNSsD1Ev.call(j);
/* 75 */       ffrprt.call(MainMemory.getI32Aligned(1800), paramInt1);
/*    */     }
/*    */     finally
/*    */     {
/*    */       label89:
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 86 */       MainMemory.dealloc_generated(k);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp16duchampFITSerrorEiSsSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */