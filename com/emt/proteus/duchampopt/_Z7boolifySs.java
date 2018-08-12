/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _Z7boolifySs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2718;
/*  15 */   public static final Function _instance = new _Z7boolifySs();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _Z7boolifySs() { super("_Z7boolifySs", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  22 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     byte b = call(i);
/*  31 */     paramFrame.setI8(paramInt1, b);
/*  32 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static byte call(int paramInt)
/*     */   {
/*  37 */     byte b1 = 0;
/*     */     
/*  39 */     int i = 0;
/*  40 */     int j = 0;
/*  41 */     int k = 0;
/*  42 */     int m = 0;
/*  43 */     int n = 0;
/*  44 */     int i1 = 0;
/*  45 */     byte b2 = 0;
/*     */     
/*     */ 
/*  48 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  52 */       i = MainMemory.alloc(4);
/*  53 */       j = MainMemory.alloc(4);
/*  54 */       k = MainMemory.alloc(4);
/*  55 */       m = MainMemory.alloc(4);
/*  56 */       if (_ZNKSs7compareEPKc.call(paramInt, 13440) == 0) {
/*  57 */         b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  67 */         _ZNSsC1ERKSs.call(k, paramInt);
/*  68 */         _Z9makelowerSs.call(m, k);
/*  69 */         n = _ZNKSs7compareEPKc.call(m, 18688);
/*  70 */         _ZNSsD1Ev.call(m);
/*  71 */         i1 = n == 0 ? 1 : 0;
/*  72 */         _ZNSsD1Ev.call(k);
/*  73 */         if (i1 != 0) {
/*  74 */           b2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*  84 */         else if (_ZNKSs7compareEPKc.call(paramInt, 13504) == 0) {
/*  85 */           b2 = 0;
/*     */         } else {
/*     */           break label173;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       b1 = b2;
/*     */       
/*     */ 
/*     */       break label206;
/*     */       
/*     */       label173:
/*     */       
/* 103 */       _ZNSsC1ERKSs.call(i, paramInt);
/* 104 */       _Z9makelowerSs.call(j, i);
/* 105 */       _ZNKSs7compareEPKc.call(j, 24960);
/* 106 */       _ZNSsD1Ev.call(j);
/* 107 */       _ZNSsD1Ev.call(i);
/* 108 */       b1 = 0;
/*     */       
/*     */ 
/*     */       label206:
/*     */       
/*     */ 
/* 114 */       return b1;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 119 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z7boolifySs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */