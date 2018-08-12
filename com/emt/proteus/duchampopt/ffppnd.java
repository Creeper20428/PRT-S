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
/*     */ public final class ffppnd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3514;
/*  15 */   public static final Function _instance = new ffppnd();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public ffppnd() { super("ffppnd", 6, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, int paramInt2, double paramDouble, int paramInt3)
/*     */   {
/*  22 */     call(paramInt1, paramLong1, paramLong2, paramInt2, paramDouble, paramInt3);
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
/*  40 */     double d = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, l1, l2, j, d, k);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, long paramLong1, long paramLong2, int paramInt2, double paramDouble, int paramInt3)
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
/*  63 */       i = MainMemory.alloc(8);
/*  64 */       if (MainMemory.getI32(paramInt3) <= 0)
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
/*     */           break label153;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         if (MainMemory.getI64(m + 112) != -1L) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         if (ffrdef.call(paramInt1, paramInt3) <= 0) {
/*     */           break label170;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */         j = MainMemory.getI32(paramInt3);
/*     */         
/*     */         break label197;
/*     */         
/*     */         label153:
/*     */         
/* 113 */         ffmahd.call(paramInt1, j + 1, 0, paramInt3);
/*     */         
/*     */ 
/*     */         label170:
/*     */         
/*     */ 
/* 119 */         j = MainMemory.getI32(MainMemory.getI32(k) + 1012) != 0 ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */         label197:
/*     */         
/*     */ 
/*     */ 
/* 127 */         if (j != 0) {
/*     */           break label239;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */       ffpcnd.call(paramInt1, 2, 1L, paramLong1, paramLong2, paramInt2, paramDouble, paramInt3);
/*     */       
/*     */ 
/*     */       break label266;
/*     */       
/*     */       label239:
/*     */       
/* 144 */       MainMemory.setF64(i, paramDouble);
/* 145 */       fits_write_compressed_pixels.call(paramInt1, 82, paramLong1, paramLong2, 1, paramInt2, i, paramInt3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label266:
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


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffppnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */