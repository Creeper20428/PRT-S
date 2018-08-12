/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F245069 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2937;
/*  11 */   public static final Function _instance = new F245069();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F245069() { super("F245069", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     call(paramInt1, paramInt2);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     call(i, j);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     byte b = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  52 */       i = MainMemory.getI32Aligned(458840);
/*  53 */       MainMemory.setI8(i, MainMemory.getI8(459016));
/*  54 */       j = MainMemory.getI32Aligned(458832);
/*  55 */       i4 = MainMemory.getI32(j);
/*  56 */       k = MainMemory.getI32(i4 + 4);
/*  57 */       if (!MathUtils.ugt(k + 2, i)) {
/*     */         break label360;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */       i3 = MainMemory.getI32Aligned(459360);
/*  70 */       m = i3 + 2;
/*  71 */       n = MainMemory.getI32(i4 + 12);
/*  72 */       i2 = k + (n + 2);
/*  73 */       i1 = k + m;
/*  74 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  78 */         i3 = n;
/*     */         
/*  80 */         k = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*  88 */         i3 += 1;
/*  89 */         n += 1;
/*  90 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/*  97 */           i1 = k + (i3 - m);
/*  98 */           i2 = k + (n - m);
/*  99 */           MainMemory.setI8(i2, MainMemory.getI8(i1));
/* 100 */           i4 = MainMemory.getI32(j);
/* 101 */           m += 1;
/* 102 */         } while (MathUtils.ult(MainMemory.getI32(i4 + 4), i1));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 113 */         i3 = MainMemory.getI32(i4 + 12);
/*     */         
/*     */ 
/* 116 */         k = i1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */       n = i2 - k;
/* 128 */       i += n;
/* 129 */       paramInt2 += n;
/* 130 */       MainMemory.setI32Aligned(459360, i3);
/* 131 */       MainMemory.setI32(i4 + 16, i3);
/* 132 */       if (!MathUtils.ugt(MainMemory.getI32(MainMemory.getI32(j) + 4) + 2, i)) {
/*     */         break label360;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */       com.emt.proteus.runtime.api.SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(78304) });
/* 145 */       com.emt.proteus.runtime.api.SystemLibrary.longjmp(481216, 2);
/*     */       
/*     */ 
/*     */ 
/*     */       label360:
/*     */       
/*     */ 
/*     */ 
/* 153 */       i += -1;
/* 154 */       b = (byte)paramInt1;
/* 155 */       MainMemory.setI8(i, b);
/* 156 */       MainMemory.setI32Aligned(458936, paramInt2);
/* 157 */       MainMemory.setI8(459016, b);
/* 158 */       MainMemory.setI32Aligned(458840, i); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F245069.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */