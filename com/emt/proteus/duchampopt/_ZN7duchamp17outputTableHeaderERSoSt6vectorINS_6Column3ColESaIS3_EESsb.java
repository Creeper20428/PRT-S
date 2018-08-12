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
/*     */ public final class _ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1145;
/*  18 */   public static final Function _instance = new _ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb() { super("_ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte)
/*     */   {
/*  25 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramByte);
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
/*  43 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     call(i, j, k, m, b);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*     */     
/*     */ 
/*  62 */     int i3 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       i = MainMemory.alloc(4);
/*  67 */       j = MainMemory.alloc(4);
/*  68 */       k = MainMemory.alloc(4);
/*  69 */       m = MainMemory.alloc(4);
/*  70 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  77 */         i1 = paramInt2 + n * 24;
/*  78 */         if (!MathUtils.ult(i1, paramInt3)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  88 */         _ZNSsC1ERKSs.call(m, paramInt4);
/*  89 */         i2 = _ZN7duchamp6Column3Col5doColESsb.call(i1, m, paramByte);
/*  90 */         _ZNSsD1Ev.call(m);
/*  91 */         if (i2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           _ZN7duchamp6Column3Col9printDashERSo.call(MainMemory.getI32(paramInt2 + n * 24 + 4), paramInt1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 107 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 113 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 13408);
/* 114 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 121 */         i1 = paramInt2 + n * 24;
/* 122 */         if (!MathUtils.ult(i1, paramInt3)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 132 */         _ZNSsC1ERKSs.call(k, paramInt4);
/* 133 */         i2 = _ZN7duchamp6Column3Col5doColESsb.call(i1, k, paramByte);
/* 134 */         _ZNSsD1Ev.call(k);
/* 135 */         if (i2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 145 */           _ZN7duchamp6Column3Col10printTitleERSo.call(i1, paramInt1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 151 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 157 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 13408);
/* 158 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 165 */         i1 = paramInt2 + n * 24;
/* 166 */         if (!MathUtils.ult(i1, paramInt3)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         _ZNSsC1ERKSs.call(j, paramInt4);
/* 177 */         i2 = _ZN7duchamp6Column3Col5doColESsb.call(i1, j, paramByte);
/* 178 */         _ZNSsD1Ev.call(j);
/* 179 */         if (i2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */           _ZN7duchamp6Column3Col10printUnitsERSo.call(i1, paramInt1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 195 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 201 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 13408);
/* 202 */       n = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 209 */         i1 = paramInt2 + n * 24;
/* 210 */         if (!MathUtils.ult(i1, paramInt3)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */         _ZNSsC1ERKSs.call(i, paramInt4);
/* 221 */         i2 = _ZN7duchamp6Column3Col5doColESsb.call(i1, i, paramByte);
/* 222 */         _ZNSsD1Ev.call(i);
/* 223 */         if (i2 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */           _ZN7duchamp6Column3Col9printDashERSo.call(MainMemory.getI32(paramInt2 + n * 24 + 4), paramInt1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 239 */         n += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 245 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(paramInt1, 13408);
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
/* 256 */       MainMemory.dealloc_generated(i3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */