/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fftrun extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2983;
/*  11 */   public static final Function _instance = new fftrun();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fftrun() { super("fftrun", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramLong, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     long l = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, l, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong, int paramInt2)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  49 */       i = paramInt1 + 4;
/*  50 */       if (MainMemory.getI32(492288 + MainMemory.getI32(MainMemory.getI32(i) + 4) * 84 + 52) != 0)
/*     */       {
/*     */ 
/*     */ 
/*  54 */         j = 0;
/*     */       } else {
/*     */         break label367;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  68 */         k = MainMemory.getI32(i);
/*  69 */         if (MainMemory.getI32(k + 1216 + (j << 2)) <= -1) {
/*     */           break label119;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         fftrun_1427.call(paramInt2, j, k);
/*     */         
/*     */ 
/*     */         label119:
/*     */         
/*     */ 
/*  85 */         j += 1;
/*  86 */         if (j == 40) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */       if (MainMemory.getI32(paramInt2) != 112)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         fftrun_1428.call(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI64(MainMemory.getI32(i) + 24, paramLong);
/* 114 */       MainMemory.setI64(MainMemory.getI32(i) + 52, paramLong);
/* 115 */       MainMemory.setI64(MainMemory.getI32(i) + 32, paramLong);
/* 116 */       MainMemory.setI64(MainMemory.getI32(i) + 44, paramLong);
/* 117 */       j = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 124 */         k = MainMemory.getI32(i);
/* 125 */         m = k + 1216 + (j << 2);
/* 126 */         if (MainMemory.getI32(m) * 2880L >= MainMemory.getI64(k + 24))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */           MainMemory.setI32(m, -1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 142 */         j += 1;
/* 143 */         if (j == 40) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */       k = MainMemory.getI32(i);
/* 155 */       j = com.emt.proteus.runtime.api.SystemLibrary.do_indirect(MainMemory.getI32(492288 + MainMemory.getI32(k + 4) * 84 + 52), MainMemory.getI32(k), paramLong);
/* 156 */       MainMemory.setI32(paramInt2, j);
/*     */       
/*     */ 
/*     */       label367:
/*     */       
/*     */ 
/* 162 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fftrun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */