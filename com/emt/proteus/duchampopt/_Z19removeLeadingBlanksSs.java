/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsixEj;
/*     */ 
/*     */ public final class _Z19removeLeadingBlanksSs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2713;
/*  17 */   public static final Function _instance = new _Z19removeLeadingBlanksSs();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _Z19removeLeadingBlanksSs() { super("_Z19removeLeadingBlanksSs", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  24 */     call(paramInt1, paramInt2);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*     */     
/*     */ 
/*  49 */     int n = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  53 */       i = MainMemory.alloc(1);
/*  54 */       if (SystemLibrary.isspace(MainMemory.getI8(_ZNSsixEj.call(paramInt2, 0))) == 0) {
/*  55 */         j = 0;
/*     */         break label82;
/*     */       } else {
/*  58 */         j = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  67 */         j += 1;
/*  68 */         if (SystemLibrary.isspace(MainMemory.getI8(_ZNSsixEj.call(paramInt2, j))) == 0) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label82:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  81 */       com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(i);
/*  82 */       _ZNSsC1EPKcRKSaIcE.call(paramInt1, 12960, i);
/*  83 */       com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev.call(i);
/*  84 */       k = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  91 */         m = j + k;
/*  92 */         if (!MathUtils.ugt(_ZNKSs4sizeEv.call(paramInt2), m)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         com.emt.proteus.runtime.library.strings._ZNSspLEc.call(paramInt1, MainMemory.getI8(_ZNSsixEj.call(paramInt2, m)));
/* 103 */         k += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 119 */       MainMemory.dealloc_generated(n);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z19removeLeadingBlanksSs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */