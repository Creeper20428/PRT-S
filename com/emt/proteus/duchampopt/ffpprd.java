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
/*     */ public final class ffpprd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3507;
/*  15 */   public static final Function _instance = new ffpprd();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffpprd() { super("ffpprd", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramInt2, paramInt3);
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
/*  43 */     call(i, l1, l2, j, k);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*     */     
/*     */ 
/*  56 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  60 */       i = MainMemory.alloc(8);
/*  61 */       if (MainMemory.getI32(paramInt3) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */         j = MainMemory.getI32(paramInt1);
/*  72 */         k = paramInt1 + 4;
/*  73 */         m = MainMemory.getI32(k);
/*  74 */         if (j != MainMemory.getI32(m + 64)) {
/*     */           break label153;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  84 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         if (ffrdef.call(paramInt1, paramInt3) <= 0) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */         j = MainMemory.getI32(paramInt3);
/*     */         
/*     */         break label197;
/*     */         
/*     */         label153:
/*     */         
/* 110 */         ffmahd.call(paramInt1, j + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label170:
/*     */         
/*     */ 
/* 116 */         j = MainMemory.getI32(MainMemory.getI32(k) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label197:
/*     */         
/*     */ 
/*     */ 
/* 124 */         if (j != 0) {
/*     */           break label238;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 134 */       ffpcld.call(paramInt1, 2, 1L, paramLong1, paramLong2, paramInt2, paramInt3);
/*     */       
/*     */ 
/*     */       break label258;
/*     */       
/*     */       label238:
/*     */       
/* 141 */       fits_write_compressed_pixels.call(paramInt1, 82, paramLong1, paramLong2, 0, paramInt2, i, paramInt3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label258:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffpprd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */