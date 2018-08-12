/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class wcsp2s_1722 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new wcsp2s_1722();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public wcsp2s_1722() { super("wcsp2s_1722", 7, false); }
/*    */   
/*    */   public int execute(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, int paramInt5)
/*    */   {
/* 18 */     call(paramInt1, paramInt2, paramInt3, paramBoolean1, paramInt4, paramBoolean2, paramInt5);
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
/* 30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     boolean bool1 = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 37 */     paramInt4 += 2;
/* 38 */     paramInt3--;
/* 39 */     boolean bool2 = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 40 */     paramInt4 += 2;
/* 41 */     paramInt3--;
/* 42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 43 */     paramInt4 += 2;
/* 44 */     paramInt3--;
/* 45 */     call(i, j, k, bool1, m, bool2, n);
/* 46 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, int paramInt5)
/*    */   {
/* 52 */     int i = 0;
/* 53 */     double d = 0.0D;
/* 54 */     int j = 0;
/* 55 */     int k = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 61 */       i = MainMemory.getI32(paramInt5);
/* 62 */       if (!paramBoolean2)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 67 */         d = MainMemory.getF64(paramInt1 + (i << 3));
/* 68 */         if (paramBoolean1) {
/* 69 */           j = 0;
/*    */           
/*    */           do
/*    */           {
/* 73 */             k = j * paramInt2;
/* 74 */             MainMemory.setF64(paramInt1 + (i + (k + paramInt2) << 3), d);
/* 75 */             j += 1;
/* 76 */           } while (paramInt4 > paramInt3 + k);
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/wcsp2s_1722.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */