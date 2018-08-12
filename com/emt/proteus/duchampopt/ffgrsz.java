/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class ffgrsz
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2964;
/*  14 */   public static final Function _instance = new ffgrsz();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public ffgrsz() { super("ffgrsz", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j, k);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     long l = 0L;
/*     */     
/*     */ 
/*  52 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  56 */       i = MainMemory.alloc(8);
/*  57 */       j = MainMemory.alloc(8);
/*  58 */       k = MainMemory.alloc(4);
/*  59 */       m = MainMemory.getI32(paramInt1);
/*  60 */       n = paramInt1 + 4;
/*  61 */       i1 = MainMemory.getI32(n);
/*  62 */       if (m != MainMemory.getI32(i1 + 64)) {
/*     */         break label147;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */       if (MainMemory.getI64(i1 + 112) != -1L) {
/*     */         break label163;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */       if (ffrdef.call(paramInt1, paramInt3) <= 0) {
/*     */         break label163;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label289;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label147:
/*     */       
/*     */ 
/*     */ 
/*  98 */       ffmahd.call(paramInt1, m + 1, 0, paramInt3);
/*     */       
/*     */ 
/*     */       label163:
/*     */       
/*     */ 
/* 104 */       i1 = MainMemory.getI32(n);
/* 105 */       if (MainMemory.getI32(i1 + 68) != 0) {
/*     */         break label228;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */       ffgtclll.call(paramInt1, 2, k, i, j, paramInt3);
/* 116 */       m = 112320 / (MainMemory.getI32(k) / 10);
/*     */       
/*     */       break label278;
/*     */       
/*     */       label228:
/*     */       
/* 122 */       l = MainMemory.getI64(i1 + 936);
/* 123 */       m = (int)(112320L / (l < 1L ? 1L : l));
/* 124 */       m = m < 1 ? 1 : m;
/*     */       
/*     */ 
/*     */ 
/*     */       label278:
/*     */       
/*     */ 
/*     */ 
/* 132 */       MainMemory.setI32(paramInt2, m);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label289:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffgrsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */