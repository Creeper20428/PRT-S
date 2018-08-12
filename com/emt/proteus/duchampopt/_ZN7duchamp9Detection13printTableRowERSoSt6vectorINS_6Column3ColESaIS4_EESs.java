/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1197;
/*  18 */   public static final Function _instance = new _ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs() { super("_ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs", 4, false); }
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
/*  56 */     byte b = 0;
/*  57 */     int i2 = 0;
/*  58 */     int i3 = 0;
/*     */     
/*     */ 
/*  61 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(24);
/*  66 */       j = MainMemory.alloc(4);
/*  67 */       k = MainMemory.getI32(MainMemory.getI32(paramInt2) + -12) + paramInt2 + 12;
/*  68 */       MainMemory.setI32(k, MainMemory.getI32(k) | 0x4);
/*  69 */       m = MainMemory.getI32(paramInt3);
/*  70 */       n = MainMemory.getI32(paramInt3 + 4);
/*  71 */       i1 = paramInt1 + 148;
/*  72 */       i2 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  79 */         i3 = m + i2 * 24;
/*  80 */         if (!MathUtils.ult(i3, n)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */         b = MainMemory.getI8(i1);
/*  91 */         _ZNSsC1ERKSs.call(j, paramInt4);
/*  92 */         b = _ZN7duchamp6Column3Col5doColESsb.call(i3, j, b);
/*  93 */         _ZNSsD1Ev.call(j);
/*  94 */         if (b != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 104 */           _ZN7duchamp6Column3ColC1ERKS1_.call(i, i3);
/* 105 */           _ZN7duchamp9Detection15printTableEntryERSoNS_6Column3ColE.call(paramInt1, paramInt2, i);
/* 106 */           _ZN7duchamp6Column3ColD1Ev.call(i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 112 */         i2 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 118 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt2, 13408);
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
/* 129 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */