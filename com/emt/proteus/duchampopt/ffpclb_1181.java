/*    */ package com.emt.proteus.duchampopt;
/*    */ 
/*    */ import com.emt.proteus.runtime.api.Env;
/*    */ import com.emt.proteus.runtime.api.Frame;
/*    */ import com.emt.proteus.runtime.api.Function;
/*    */ import com.emt.proteus.runtime.api.MainMemory;
/*    */ 
/*    */ public final class ffpclb_1181 extends com.emt.proteus.runtime.api.ImplementedFunction
/*    */ {
/*    */   public static final int FNID = Integer.MAX_VALUE;
/* 11 */   public static final Function _instance = new ffpclb_1181();
/* 12 */   public final Function resolve() { return _instance; }
/*    */   
/* 14 */   public ffpclb_1181() { super("ffpclb_1181", 3, false); }
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
/* 44 */     short s = 0;
/*    */     
/*    */ 
/*    */ 
/*    */     try
/*    */     {
/* 50 */       if (paramBoolean) {
/* 51 */         i = 0;
/*    */         
/*    */         for (;;)
/*    */         {
/* 55 */           j = paramInt1 + (i << 1);
/* 56 */           k = j;
/* 57 */           m = k + 1;
/* 58 */           s = MainMemory.getI16(j);
/* 59 */           i += 1;
/* 60 */           MainMemory.setI8(k, (byte)com.emt.proteus.lib.api.MathUtils.lshr(s, 8));
/* 61 */           MainMemory.setI8(m, (byte)s);
/* 62 */           if (i == paramInt2) {
/*    */             break;
/*    */           }
/*    */         }
/*    */       }
/*    */       return;
/*    */     }
/*    */     finally {}
/*    */   }
/*    */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpclb_1181.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */