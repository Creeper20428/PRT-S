/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ffppne
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3523;
/*  15 */   public static final Function _instance = new ffppne();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffppne() { super("ffppne", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, float paramFloat, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramLong1, paramLong2, paramInt3, paramFloat, paramInt4);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, j, l1, l2, k, f, m);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, float paramFloat, int paramInt4)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*     */     
/*     */ 
/*  62 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       i = MainMemory.alloc(4);
/*  67 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */         j = MainMemory.getI32(paramInt1);
/*  78 */         k = paramInt1 + 4;
/*  79 */         m = MainMemory.getI32(k);
/*  80 */         if (j != MainMemory.getI32(m + 64)) {
/*     */           break label152;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         if (ffrdef.call(paramInt1, paramInt4) <= 0) {
/*     */           break label169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         j = MainMemory.getI32(paramInt4);
/*     */         
/*     */         break label196;
/*     */         
/*     */         label152:
/*     */         
/* 116 */         ffmahd.call(paramInt1, j + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label169:
/*     */         
/*     */ 
/* 122 */         j = MainMemory.getI32(MainMemory.getI32(k) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label196:
/*     */         
/*     */ 
/*     */ 
/* 130 */         if (j != 0) {
/*     */           break label249;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */       ffpcne.call(paramInt1, 2, paramInt2 < 1 ? 1L : paramInt2, paramLong1, paramLong2, paramInt3, paramFloat, paramInt4);
/*     */       
/*     */ 
/*     */       break label277;
/*     */       
/*     */       label249:
/*     */       
/* 147 */       MainMemory.setF32(i, paramFloat);
/* 148 */       fits_write_compressed_pixels.call(paramInt1, 42, paramLong1, paramLong2, 1, paramInt3, i, paramInt4);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label277:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffppne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */