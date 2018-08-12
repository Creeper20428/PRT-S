/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader10getIAUNameEdd
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 297;
/*  18 */   public static final Function _instance = new _ZN7duchamp10FitsHeader10getIAUNameEdd();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN7duchamp10FitsHeader10getIAUNameEdd() { super("_ZN7duchamp10FitsHeader10getIAUNameEdd", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramDouble1, paramDouble2);
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
/*  37 */     double d1 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     double d2 = paramFrame.getF64(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, d1, d2);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     float f = 0.0F;
/*     */     
/*     */ 
/*  58 */     int i1 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  62 */       i = MainMemory.alloc(1);
/*  63 */       j = MainMemory.alloc(4);
/*  64 */       _ZNSaIcEC1Ev.call(i);
/*  65 */       k = paramInt2 + 4;
/*  66 */       _ZNSsC1EPKcRKSaIcE.call(j, MainMemory.getI32(k) + 728, i);
/*  67 */       m = _ZNKSs7compareEPKc.call(j, 14784);
/*  68 */       _ZNSsD1Ev.call(j);
/*  69 */       n = m == 0 ? 1 : 0;
/*  70 */       _ZNSaIcED1Ev.call(i);
/*  71 */       if (n == 0) {
/*     */         break label145;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */       f = (float)MainMemory.getF64(MainMemory.getI32(k) + 272);
/*  82 */       _Z12getIAUNameEQddf.call(paramInt1, paramDouble1, paramDouble2, f);
/*     */       
/*     */ 
/*     */       break label157;
/*     */       
/*     */       label145:
/*     */       
/*  89 */       _Z13getIAUNameGALdd.call(paramInt1, paramDouble1, paramDouble2);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label157:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */       MainMemory.dealloc_generated(i1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader10getIAUNameEdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */