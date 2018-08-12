/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsixEj;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSspLEc;
/*     */ 
/*     */ public final class _ZN7duchamp11fixUnitsVOTESs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2190;
/*  15 */   public static final Function _instance = new _ZN7duchamp11fixUnitsVOTESs();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZN7duchamp11fixUnitsVOTESs() { super("_ZN7duchamp11fixUnitsVOTESs", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  22 */     call(paramInt1, paramInt2);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i, j);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     int i = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       _ZNSsC1Ev.call(paramInt1);
/*  48 */       i = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  55 */         if (!com.emt.proteus.lib.api.MathUtils.ugt(com.emt.proteus.runtime.library.strings._ZNKSs4sizeEv.call(paramInt2), i)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */         if (MainMemory.getI8(_ZNSsixEj.call(paramInt2, i)) != 91)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */           if (MainMemory.getI8(_ZNSsixEj.call(paramInt2, i)) != 93)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */             if (MainMemory.getI8(_ZNSsixEj.call(paramInt2, i)) != 32) {
/*     */               break label126;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  95 */             _ZNSspLEc.call(paramInt1, (byte)46);
/*     */             
/*     */             break label144;
/*     */             
/*     */             label126:
/* 100 */             _ZNSspLEc.call(paramInt1, MainMemory.getI8(_ZNSsixEj.call(paramInt2, i)));
/*     */           }
/*     */         }
/*     */         
/*     */         label144:
/*     */         
/* 106 */         i += 1;
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp11fixUnitsVOTESs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */