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
/*     */ public final class ffgpvd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3293;
/*  15 */   public static final Function _instance = new ffgpvd();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffgpvd() { super("ffgpvd", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, double paramDouble, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramDouble, paramInt2, paramInt3, paramInt4);
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
/*  37 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, l1, l2, d, j, k, m);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, double paramDouble, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*     */     
/*     */ 
/*  63 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       i = MainMemory.alloc(1);
/*  68 */       j = MainMemory.alloc(8);
/*  69 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */         k = MainMemory.getI32(paramInt1);
/*  80 */         m = paramInt1 + 4;
/*  81 */         n = MainMemory.getI32(m);
/*  82 */         if (k != MainMemory.getI32(n + 64)) {
/*     */           break label162;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         if (MainMemory.getI64(n + 112) != -1L) {
/*     */           break label179;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         if (ffrdef.call(paramInt1, paramInt4) <= 0) {
/*     */           break label179;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */         k = MainMemory.getI32(paramInt4);
/*     */         
/*     */         break label206;
/*     */         
/*     */         label162:
/*     */         
/* 118 */         ffmahd.call(paramInt1, k + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label179:
/*     */         
/*     */ 
/* 124 */         k = MainMemory.getI32(MainMemory.getI32(m) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label206:
/*     */         
/*     */ 
/*     */ 
/* 132 */         if (k != 0) {
/*     */           break label255;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */       ffgcld.call(paramInt1, 2, 1L, paramLong1, paramLong2, 1, 1, paramDouble, paramInt2, i, paramInt3, paramInt4);
/*     */       
/*     */ 
/*     */       break label285;
/*     */       
/*     */       label255:
/*     */       
/* 149 */       MainMemory.setF64(j, paramDouble);
/* 150 */       fits_read_compressed_pixels.call(paramInt1, 82, paramLong1, paramLong2, 1, j, paramInt2, 0, paramInt3, paramInt4);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label285:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgpvd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */