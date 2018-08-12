/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffbinit_528 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffbinit_528();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffbinit_528() { super("ffbinit_528", 4, false); }
/*    */   
/*    */   public int execute(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 18 */     call(paramBoolean, paramInt1, paramInt2, paramInt3);
/* 19 */     return 0;
/*    */   }
/*    */   
/*    */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*    */   {
/* 24 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/* 25 */     paramInt4 += 2;
/* 26 */     paramInt3--;
/* 27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 28 */     paramInt4 += 2;
/* 29 */     paramInt3--;
/* 30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 31 */     paramInt4 += 2;
/* 32 */     paramInt3--;
/* 33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/* 34 */     paramInt4 += 2;
/* 35 */     paramInt3--;
/* 36 */     call(bool, i, j, k);
/* 37 */     return paramInt4;
/*    */   }
/*    */   
/*    */ 
/*    */   public static void call(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/* 45 */     int k = 0;
/* 46 */     int m = 0;
/* 47 */     int n = 0;
/* 48 */     int i1 = 0;
/* 49 */     int i2 = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 55 */       i = paramInt1;
/* 56 */       MainMemory.setI32(MainMemory.getI32(paramInt3) + 944, i);
/* 57 */       if (paramBoolean) {
/* 58 */         j = 0;
/*    */         
/*    */         do
/*    */         {
/* 62 */           k = i + j * 152 + 92;
/* 63 */           m = i + j * 152 + 100;
/* 64 */           n = i + j * 152 + 108;
/* 65 */           i1 = i + j * 152 + 80;
/* 66 */           i2 = i + j * 152 + 84;
/* 67 */           paramInt1 = i + j * 152 + 116;
/* 68 */           MainMemory.setI8(i + j * 152, (byte)0);
/* 69 */           MainMemory.setF64(k, 1.0D);
/* 70 */           MainMemory.setF64(m, 0.0D);
/* 71 */           MainMemory.setI64(n, 1234554321L);
/* 72 */           MainMemory.setI32(i1, 55537);
/* 73 */           MainMemory.setI64(i2, 1L);
/* 74 */           MainMemory.setI8(paramInt1, (byte)0);
/* 75 */           j += 1;
/* 76 */         } while (j < paramInt2);
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffbinit_528.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */