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
/*     */ public final class ffgpfuk
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3376;
/*  15 */   public static final Function _instance = new ffgpfuk();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgpfuk() { super("ffgpfuk", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramInt2, paramInt3, paramInt4, paramInt5);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, l1, l2, j, k, m, n);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.getI32(paramInt5);
/*  65 */       if (i <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         i = MainMemory.getI32(paramInt1);
/*  77 */         j = paramInt1 + 4;
/*  78 */         k = MainMemory.getI32(j);
/*  79 */         if (i != MainMemory.getI32(k + 64)) {
/*     */           break label142;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (MainMemory.getI64(k + 112) != -1L) {
/*     */           break label159;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (ffrdef.call(paramInt1, paramInt5) <= 0) {
/*     */           break label159;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */         i = MainMemory.getI32(paramInt5);
/*     */         
/*     */         break label186;
/*     */         
/*     */         label142:
/*     */         
/* 115 */         ffmahd.call(paramInt1, i + 1, 0, paramInt5);
/*     */         
/*     */ 
/*     */         label159:
/*     */         
/*     */ 
/* 121 */         i = MainMemory.getI32(MainMemory.getI32(j) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label186:
/*     */         
/*     */ 
/*     */ 
/* 129 */         if (i != 0) {
/*     */           break label278;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 139 */         i = MainMemory.getI32(paramInt5);
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/* 147 */         if ((i <= 0) && (paramLong2 != 0L)) {
/*     */           break label250;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         break label301;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label250:
/*     */         
/*     */ 
/*     */ 
/* 163 */         ffgcluj.call(paramInt1, 2, 1L, paramLong1, paramLong2, 2, 0, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */         
/*     */         break label301;
/*     */       }
/*     */       
/*     */       label278:
/*     */       
/* 170 */       fits_read_compressed_pixels.call(paramInt1, 30, paramLong1, paramLong2, 2, 0, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */       
/*     */ 
/*     */       label301:
/*     */       
/*     */ 
/* 176 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgpfuk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */