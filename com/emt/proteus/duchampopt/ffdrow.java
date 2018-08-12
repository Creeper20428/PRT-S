/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffdrow
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3149;
/*  14 */   public static final Function _instance = new ffdrow();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffdrow() { super("ffdrow", 4, false); }
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
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*     */     
/*     */ 
/*  57 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  61 */       j = MainMemory.alloc(81);
/*  62 */       k = MainMemory.alloc(71);
/*  63 */       m = MainMemory.alloc(4);
/*  64 */       n = MainMemory.alloc(8);
/*  65 */       i1 = MainMemory.alloc(73);
/*  66 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  76 */         i2 = MainMemory.getI32(paramInt1);
/*  77 */         i3 = paramInt1 + 4;
/*  78 */         i4 = MainMemory.getI32(i3);
/*  79 */         if (i2 != MainMemory.getI32(i4 + 64)) {
/*     */           break label183;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  89 */         if (MainMemory.getI64(i4 + 112) != -1L) {
/*     */           break label200;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         if (ffrdef.call(paramInt1, paramInt2) > 0) {
/*     */           break label319;
/*     */         } else {
/*     */           break label200;
/*     */         }
/*     */         
/*     */ 
/*     */         label183:
/*     */         
/* 108 */         ffmahd.call(paramInt1, i2 + 1, 0, paramInt2);
/*     */         
/*     */ 
/*     */         label200:
/*     */         
/*     */ 
/* 114 */         i4 = MainMemory.getI32(i3);
/* 115 */         if (MainMemory.getI32(i4 + 68) != 0) {
/*     */           break label255;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         ffxmsg.call(5, 131680);
/* 126 */         MainMemory.setI32(paramInt2, 235);
/*     */         
/*     */         break label319;
/*     */         
/*     */         label255:
/* 131 */         if (paramLong2 >= 0L) {
/*     */           break label292;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         MainMemory.setI32(paramInt2, 306);
/*     */         
/*     */         break label319;
/*     */         
/*     */         label292:
/* 146 */         ffdrow_603.call(paramLong2, m, i4, i3, paramInt2, paramLong1, i1, n, paramInt1, j, k);
/*     */       }
/*     */       
/*     */ 
/*     */       label319:
/*     */       
/* 152 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 163 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffdrow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */