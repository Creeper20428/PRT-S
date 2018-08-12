/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ffrdef extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3250;
/*  12 */   public static final Function _instance = new ffrdef();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ffrdef() { super("ffrdef", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = call(i, j);
/*  31 */     paramFrame.setI32(paramInt1, k);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     int i = 0;
/*     */     
/*  39 */     int j = 0;
/*  40 */     int k = 0;
/*  41 */     int m = 0;
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = 0;
/*  45 */     int i3 = 0;
/*  46 */     int i4 = 0;
/*  47 */     int i5 = 0;
/*  48 */     int i6 = 0;
/*  49 */     int i7 = 0;
/*  50 */     int i8 = 0;
/*  51 */     int i9 = 0;
/*     */     
/*     */ 
/*  54 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       j = MainMemory.alloc(81);
/*  59 */       k = MainMemory.alloc(71);
/*  60 */       m = MainMemory.alloc(4);
/*  61 */       n = MainMemory.alloc(4);
/*  62 */       i1 = MainMemory.alloc(8);
/*  63 */       i2 = MainMemory.alloc(8);
/*  64 */       i3 = MainMemory.alloc(81);
/*  65 */       i4 = MainMemory.alloc(73);
/*  66 */       i5 = MainMemory.alloc(71);
/*  67 */       MainMemory.setI32(n, 0);
/*  68 */       if (MainMemory.getI32(paramInt2) <= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */         i6 = MainMemory.getI32(paramInt1);
/*  79 */         i7 = paramInt1 + 4;
/*  80 */         i8 = MainMemory.getI32(i7);
/*  81 */         i9 = MainMemory.getI32(i8 + 64);
/*  82 */         if (i6 != i9) {
/*     */           break label214;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  92 */         ffrdef_1408.call(i5, i9, i2, i4, k, j, m, paramInt2, i7, i1, n, i3, i8, paramInt1);
/*     */         
/*     */         break label230;
/*     */         
/*     */         label214:
/*  97 */         ffmahd.call(paramInt1, i6 + 1, 0, paramInt2);
/*     */       }
/*     */       
/*     */ 
/*     */       label230:
/*     */       
/* 103 */       i = MainMemory.getI32(paramInt2);
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 114 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ffrdef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */