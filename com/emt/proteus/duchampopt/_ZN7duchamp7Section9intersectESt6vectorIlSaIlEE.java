/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.cpp._ZSt17__throw_bad_allocv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp7Section9intersectESt6vectorIlSaIlEE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2640;
/*  18 */   public static final Function _instance = new _ZN7duchamp7Section9intersectESt6vectorIlSaIlEE();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN7duchamp7Section9intersectESt6vectorIlSaIlEE() { super("_ZN7duchamp7Section9intersectESt6vectorIlSaIlEE", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k, m);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*     */     
/*     */ 
/*  58 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.alloc(4);
/*  63 */       j = MainMemory.alloc(48);
/*  64 */       k = paramInt4 - paramInt3;
/*  65 */       m = k >> 2;
/*  66 */       _ZN7duchamp11nullSectionEi.call(i, m);
/*  67 */       _ZN7duchamp7SectionC2ERSs.call(j, i);
/*  68 */       if (!MathUtils.ugt(m, 1073741823)) {
/*     */         break label92;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  78 */       _ZSt17__throw_bad_allocv.call();
/*     */       
/*     */ 
/*     */       label92:
/*     */       
/*     */ 
/*  84 */       n = SystemLibrary.newobject(k & 0xFFFFFFFC);
/*  85 */       paramInt4 = n;
/*  86 */       i1 = paramInt4 + (m << 2);
/*  87 */       SystemLibrary.memmove(n, paramInt3, k, 4);
/*  88 */       _ZN7duchamp7Section5parseESt6vectorIlSaIlEE.call(j, paramInt4, i1);
/*  89 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  99 */         SystemLibrary.delete(n);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 105 */       _ZN7duchamp7Section9intersectERS0_.call(paramInt1, paramInt2, j);
/* 106 */       _ZN7duchamp7SectionD1Ev.call(j);
/* 107 */       _ZNSsD1Ev.call(i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 118 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp7Section9intersectESt6vectorIlSaIlEE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */