/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F249315 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2945;
/*  11 */   public static final Function _instance = new F249315();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F249315() { super("F249315", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  18 */     call(paramInt);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     call(i);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  34 */     int i = 0;
/*  35 */     int j = 0;
/*  36 */     int k = 0;
/*  37 */     int m = 0;
/*  38 */     int n = 0;
/*  39 */     int i1 = 0;
/*  40 */     int i2 = 0;
/*  41 */     int i3 = 0;
/*  42 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  48 */       i = MainMemory.getI32Aligned(458852);
/*  49 */       MainMemory.setI8(i, MainMemory.getI8(459024));
/*  50 */       j = MainMemory.getI32Aligned(458844);
/*  51 */       i4 = MainMemory.getI32(j);
/*  52 */       k = MainMemory.getI32(i4 + 4);
/*  53 */       if (!MathUtils.ugt(k + 2, i)) {
/*     */         break label347;
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
/*  65 */       i3 = MainMemory.getI32Aligned(459384);
/*  66 */       m = i3 + 2;
/*  67 */       n = MainMemory.getI32(i4 + 12);
/*  68 */       i2 = k + (n + 2);
/*  69 */       i1 = k + m;
/*  70 */       if (m <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  74 */         i3 = n;
/*     */         
/*  76 */         k = i1;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*  84 */         i3 += 1;
/*  85 */         n += 1;
/*  86 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/*  93 */           i1 = k + (i3 - m);
/*  94 */           i2 = k + (n - m);
/*  95 */           MainMemory.setI8(i2, MainMemory.getI8(i1));
/*  96 */           i4 = MainMemory.getI32(j);
/*  97 */           m += 1;
/*  98 */         } while (MathUtils.ult(MainMemory.getI32(i4 + 4), i1));
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
/* 109 */         i3 = MainMemory.getI32(i4 + 12);
/*     */         
/*     */ 
/* 112 */         k = i1;
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
/* 123 */       n = i2 - k;
/* 124 */       i += n;
/* 125 */       paramInt += n;
/* 126 */       MainMemory.setI32Aligned(459384, i3);
/* 127 */       MainMemory.setI32(i4 + 16, i3);
/* 128 */       if (!MathUtils.ugt(MainMemory.getI32(MainMemory.getI32(j) + 4) + 2, i)) {
/*     */         break label347;
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
/* 140 */       com.emt.proteus.runtime.api.SystemLibrary.fprintf(MainMemory.getI32Aligned(1800), 17824, new Object[] { Integer.valueOf(78304) });
/* 141 */       com.emt.proteus.runtime.api.SystemLibrary.longjmp(481376, 2);
/*     */       
/*     */ 
/*     */ 
/*     */       label347:
/*     */       
/*     */ 
/*     */ 
/* 149 */       i += -1;
/* 150 */       MainMemory.setI8(i, (byte)40);
/* 151 */       MainMemory.setI32Aligned(458940, paramInt);
/* 152 */       MainMemory.setI8(459024, (byte)40);
/* 153 */       MainMemory.setI32Aligned(458852, i); return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F249315.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */