/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__464 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__464();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__464() { super("_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__464", 2, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramInt2);
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
/* 30 */     call(i, j);
/* 31 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     int i = 0;
/* 38 */     int j = 0;
/* 39 */     int k = 0;
/* 40 */     int m = 0;
/* 41 */     int n = 0;
/* 42 */     double d = 0.0D;
/* 43 */     int i1 = 0;
/* 44 */     int i2 = 0;
/* 45 */     int i3 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 51 */       if (paramInt2 + 128 != paramInt1)
/*    */       {
/*    */ 
/*    */ 
/* 55 */         n = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 59 */           i = n + 16;
/* 60 */           j = n + 14;
/* 61 */           k = n + 15;
/* 62 */           m = paramInt2 + (n + 17 << 3);
/* 63 */           i2 = paramInt2 + (i << 3);
/* 64 */           n += 1;
/* 65 */           d = MainMemory.getF64(i2);
/* 66 */           if (com.emt.proteus.lib.api.MathUtils.f_ogt(MainMemory.getF64(paramInt2 + (k << 3)), d)) {
/* 67 */             i1 = 0;
/*    */             
/*    */             for (;;)
/*    */             {
/* 71 */               i2 = paramInt2 + (j - i1 << 3);
/* 72 */               i3 = paramInt2 + (k - i1 << 3);
/* 73 */               MainMemory.setF64(paramInt2 + (i - i1 << 3), MainMemory.getF64(i3));
/* 74 */               i1 += 1;
/* 75 */               if (!com.emt.proteus.lib.api.MathUtils.f_ogt(MainMemory.getF64(i2), d))
/*    */                 break;
/*    */             }
/*    */             break label193;
/* 79 */             i2 = i3;
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           label193:
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 94 */           MainMemory.setF64(i2, d);
/* 95 */           if (m == paramInt1) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt22__final_insertion_sortIN9__gnu_cxx17__normal_iteratorIPdSt6vectorIdSaIdEEEEEvT_S7__464.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */