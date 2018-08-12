/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class F293294_069 extends ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 12 */   public static final Function _instance = new F293294_069();
/* 13 */   public final Function resolve() { return _instance; }
/*    */   
/* 15 */   public F293294_069() { super("F293294_069", 5, false); }
/*    */   
/*    */   public int execute(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 19 */     call(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4);
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 26 */     paramInt4 += 2;
/* 27 */     paramInt3--;
/* 28 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 29 */     paramInt4 += 2;
/* 30 */     paramInt3--;
/* 31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 32 */     paramInt4 += 2;
/* 33 */     paramInt3--;
/* 34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 35 */     paramInt4 += 2;
/* 36 */     paramInt3--;
/* 37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 38 */     paramInt4 += 2;
/* 39 */     paramInt3--;
/* 40 */     call(i, bool, j, k, m);
/* 41 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 47 */     int i = 0;
/* 48 */     int j = 0;
/* 49 */     int k = 0;
/* 50 */     int m = 0;
/* 51 */     int n = 0;
/* 52 */     int i1 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 58 */       if (!paramBoolean)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/* 63 */         i = paramInt3 + 84;
/* 64 */         j = paramInt2 + 32;
/* 65 */         k = paramInt3 + 88;
/* 66 */         paramInt1 = paramInt4 * paramInt1;
/* 67 */         paramInt4 = paramInt1 + -1;
/* 68 */         m = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 72 */           n = paramInt4 - m;
/* 73 */           MainMemory.setI8(MainMemory.getI32(i) + n, (byte)(com.emt.proteus.lib.api.MathUtils.f_olt(MainMemory.getF64(j), 0.0D) ? 1 : 0));
/* 74 */           if (MainMemory.getI8(MainMemory.getI32(i) + n) == 0)
/*    */           {
/* 76 */             i1 = MainMemory.getI32(k);
/* 77 */             MainMemory.setI32(i1 + (n << 2), F303220.call(MainMemory.getF64(j)));
/*    */           }
/*    */           
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 88 */           m += 1;
/* 89 */           if (m == paramInt1) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F293294_069.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */