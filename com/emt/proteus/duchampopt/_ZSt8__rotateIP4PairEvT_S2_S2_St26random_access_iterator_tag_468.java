/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag_468 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag_468();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public _ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag_468() { super("_ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag_468", 3, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, boolean paramBoolean)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramBoolean);
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
/* 30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     call(i, j, bool);
/* 34 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, boolean paramBoolean)
/*    */   {
/* 40 */     int i = 0;
/* 41 */     int j = 0;
/* 42 */     int k = 0;
/* 43 */     int m = 0;
/* 44 */     int n = 0;
/* 45 */     int i1 = 0;
/* 46 */     int i2 = 0;
/* 47 */     float f1 = 0.0F;
/* 48 */     float f2 = 0.0F;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 54 */       if (!paramBoolean)
/*    */       {
/*    */ 
/*    */ 
/* 58 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 62 */           j = i + 1;
/* 63 */           k = paramInt1 + j * 12;
/* 64 */           m = paramInt2 + i * 12 + 8;
/* 65 */           n = paramInt2 + i * 12 + 4;
/* 66 */           i1 = paramInt1 + i * 12 + 8;
/* 67 */           i2 = paramInt1 + i * 12 + 4;
/* 68 */           f1 = MainMemory.getF32(i2);
/* 69 */           f2 = MainMemory.getF32(i1);
/* 70 */           MainMemory.setF32(i2, MainMemory.getF32(n));
/* 71 */           MainMemory.setF32(i1, MainMemory.getF32(m));
/* 72 */           MainMemory.setF32(n, f1);
/* 73 */           MainMemory.setF32(m, f2);
/* 74 */           if (k == paramInt2) {
/*    */             break;
/*    */           }
/*    */           
/* 78 */           i = j;
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt8__rotateIP4PairEvT_S2_S2_St26random_access_iterator_tag_468.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */