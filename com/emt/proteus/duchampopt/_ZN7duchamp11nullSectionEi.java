/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*    */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*    */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*    */ 
/*    */ public final class _ZN7duchamp11nullSectionEi extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = 2620;
/* 15 */   public static final Function _instance = new _ZN7duchamp11nullSectionEi();
/* 16 */   public final Function resolve() { return _instance; }
/*    */   
/* 18 */   public _ZN7duchamp11nullSectionEi() { super("_ZN7duchamp11nullSectionEi", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 22 */     call(paramInt1, paramInt2);
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
/* 34 */     call(i, j);
/* 35 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 41 */     int i = 0;
/* 42 */     int j = 0;
/* 43 */     int k = 0;
/*    */     
/*    */ 
/* 46 */     int m = MainMemory.alloc_base_line();
/*    */     
/*    */     try
/*    */     {
/* 50 */       i = MainMemory.alloc(188);
/* 51 */       com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(i, 24);
/* 52 */       j = i + 8;
/* 53 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(j, 13024);
/* 54 */       paramInt2 += -1;
/* 55 */       k = 0;
/*    */       
/*    */ 
/*    */ 
/*    */ 
/*    */       for (;;)
/*    */       {
/* 62 */         if (paramInt2 <= k) {
/*    */           break;
/*    */         }
/*    */         
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 72 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(j, 14464);
/* 73 */         k += 1;
/*    */       }
/*    */       
/*    */ 
/*    */ 
/*    */ 
/* 79 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(j, 14592);
/* 80 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(paramInt1, i);
/* 81 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(i);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     }
/*    */     finally
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/* 92 */       MainMemory.dealloc_generated(m);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp11nullSectionEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */