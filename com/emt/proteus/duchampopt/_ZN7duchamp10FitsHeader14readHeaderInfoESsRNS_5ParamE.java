/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader14readHeaderInfoESsRNS_5ParamE
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2418;
/*  17 */   public static final Function _instance = new _ZN7duchamp10FitsHeader14readHeaderInfoESsRNS_5ParamE();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN7duchamp10FitsHeader14readHeaderInfoESsRNS_5ParamE() { super("_ZN7duchamp10FitsHeader14readHeaderInfoESsRNS_5ParamE", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     return call(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  29 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int m = call(i, j, k);
/*  39 */     paramFrame.setI32(paramInt1, m);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*     */     
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*     */     
/*     */ 
/*  54 */     int i2 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       j = MainMemory.alloc(4);
/*  59 */       k = MainMemory.alloc(4);
/*  60 */       m = MainMemory.alloc(4);
/*  61 */       _ZNSsC1ERKSs.call(m, paramInt2);
/*  62 */       n = _ZN7duchamp10FitsHeader9readBUNITESs.call(paramInt1, m) == 1 ? 1 : 0;
/*  63 */       _ZNSsD1Ev.call(m);
/*  64 */       if (n != 0) {
/*  65 */         i1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  75 */         _ZNSsC1ERKSs.call(k, paramInt2);
/*  76 */         i1 = _ZN7duchamp10FitsHeader13readBLANKinfoESsRNS_5ParamE.call(paramInt1, k, paramInt3);
/*  77 */         _ZNSsD1Ev.call(k);
/*  78 */         _ZNSsC1ERKSs.call(j, paramInt2);
/*  79 */         i1 = i1 == 1 ? 1 : 0;
/*  80 */         n = _ZN7duchamp10FitsHeader12readBeamInfoESsRNS_5ParamE.call(paramInt1, j, paramInt3) == 1 ? 1 : 0;
/*  81 */         _ZNSsD1Ev.call(j);
/*  82 */         i1 = n != 0 ? 1 : i1;
/*  83 */         if (MainMemory.getI32(MainMemory.getI32(paramInt1 + 4) + 752) <= -1) {
/*     */           break label209;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         _ZN7duchamp10FitsHeader8fixUnitsERNS_5ParamE.call(paramInt1, paramInt3);
/*  95 */         i = i1;
/*     */         
/*     */ 
/*     */         break label217;
/*     */       }
/*     */       
/*     */       label209:
/*     */       
/* 103 */       i = i1;
/*     */       
/*     */ 
/*     */       label217:
/*     */       
/*     */ 
/* 109 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 114 */       MainMemory.dealloc_generated(i2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader14readHeaderInfoESsRNS_5ParamE.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */