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
/*     */ public final class ffppnuk
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3547;
/*  15 */   public static final Function _instance = new ffppnuk();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffppnuk() { super("ffppnuk", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramInt2, paramInt3, paramInt4);
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
/*  46 */     call(i, l1, l2, j, k, m);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*     */     
/*     */ 
/*  59 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  63 */       i = MainMemory.alloc(4);
/*  64 */       if (MainMemory.getI32(paramInt4) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  74 */         j = MainMemory.getI32(paramInt1);
/*  75 */         k = paramInt1 + 4;
/*  76 */         m = MainMemory.getI32(k);
/*  77 */         if (j != MainMemory.getI32(m + 64)) {
/*     */           break label152;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         if (ffrdef.call(paramInt1, paramInt4) <= 0) {
/*     */           break label169;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         j = MainMemory.getI32(paramInt4);
/*     */         
/*     */         break label196;
/*     */         
/*     */         label152:
/*     */         
/* 113 */         ffmahd.call(paramInt1, j + 1, 0, paramInt4);
/*     */         
/*     */ 
/*     */         label169:
/*     */         
/*     */ 
/* 119 */         j = MainMemory.getI32(MainMemory.getI32(k) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label196:
/*     */         
/*     */ 
/*     */ 
/* 127 */         if (j != 0) {
/*     */           break label238;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       ffpcnuk.call(paramInt1, 2, 1L, paramLong1, paramLong2, paramInt2, paramInt3, paramInt4);
/*     */       
/*     */ 
/*     */       break label265;
/*     */       
/*     */       label238:
/*     */       
/* 144 */       MainMemory.setI32(i, paramInt3);
/* 145 */       fits_write_compressed_pixels.call(paramInt1, 30, paramLong1, paramLong2, 1, paramInt2, i, paramInt4);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label265:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 156 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffppnuk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */