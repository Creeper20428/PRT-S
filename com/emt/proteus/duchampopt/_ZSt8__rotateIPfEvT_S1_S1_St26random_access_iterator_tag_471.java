/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag_471 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag_471();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag_471() { super("_ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag_471", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/* 18 */     call(paramInt1, paramBoolean, paramInt2);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, bool, j);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/* 43 */     int m = 0;
/* 44 */     int n = 0;
/* 45 */     float f = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 51 */       if (!paramBoolean)
/*    */       {
/*    */ 
/*    */ 
/* 55 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 59 */           j = i + 1;
/* 60 */           k = paramInt2 + (j << 2);
/* 61 */           m = paramInt1 + (i << 2);
/* 62 */           n = paramInt2 + (i << 2);
/* 63 */           f = MainMemory.getF32(n);
/* 64 */           MainMemory.setF32(n, MainMemory.getF32(m));
/* 65 */           MainMemory.setF32(m, f);
/* 66 */           if (k == paramInt1) {
/*    */             break;
/*    */           }
/*    */           
/* 70 */           i = j;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt8__rotateIPfEvT_S1_S1_St26random_access_iterator_tag_471.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */