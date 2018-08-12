/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffirow
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3147;
/*  14 */   public static final Function _instance = new ffirow();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffirow() { super("ffirow", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
/*     */   {
/*  21 */     return call(paramInt1, paramLong1, paramLong2, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     long l1 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     long l2 = paramFrame.getI64(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int k = call(i, l1, l2, j);
/*  39 */     paramFrame.setI32(paramInt1, k);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*     */     
/*     */ 
/*  53 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  57 */       j = MainMemory.alloc(4);
/*  58 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */         k = MainMemory.getI32(paramInt1);
/*  69 */         m = paramInt1 + 4;
/*  70 */         n = MainMemory.getI32(m);
/*  71 */         if (k != MainMemory.getI32(n + 64)) {
/*     */           break label143;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */         if (MainMemory.getI64(n + 112) != -1L) {
/*     */           break label160;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */         if (ffrdef.call(paramInt1, paramInt2) > 0) {
/*     */           break label271;
/*     */         } else {
/*     */           break label160;
/*     */         }
/*     */         
/*     */ 
/*     */         label143:
/*     */         
/* 100 */         ffmahd.call(paramInt1, k + 1, 0, paramInt2);
/*     */         
/*     */ 
/*     */         label160:
/*     */         
/*     */ 
/* 106 */         n = MainMemory.getI32(m);
/* 107 */         if (MainMemory.getI32(n + 68) != 0) {
/*     */           break label215;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */         ffxmsg.call(5, 128288);
/* 118 */         MainMemory.setI32(paramInt2, 235);
/*     */         
/*     */         break label271;
/*     */         
/*     */         label215:
/* 123 */         if (paramLong2 >= 0L) {
/*     */           break label252;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         MainMemory.setI32(paramInt2, 306);
/*     */         
/*     */         break label271;
/*     */         
/*     */         label252:
/* 138 */         ffirow_1109.call(paramInt1, n, j, m, paramInt2, paramLong1, paramLong2);
/*     */       }
/*     */       
/*     */ 
/*     */       label271:
/*     */       
/* 144 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 155 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffirow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */