/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEf;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube16reportMemorySizeERSob extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1328;
/*  19 */   public static final Function _instance = new _ZN7duchamp4Cube16reportMemorySizeERSob();
/*  20 */   public final Function resolve() { return _instance; }
/*     */   
/*  22 */   public _ZN7duchamp4Cube16reportMemorySizeERSob() { super("_ZN7duchamp4Cube16reportMemorySizeERSob", 2, false); }
/*     */   
/*     */   public int execute(int paramInt, byte paramByte)
/*     */   {
/*  26 */     call(paramInt, paramByte);
/*  27 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  32 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     byte b = paramFrame.getI8(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     call(i, b);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt, byte paramByte)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*  53 */     int i4 = 0;
/*  54 */     int i5 = 0;
/*  55 */     int i6 = 0;
/*  56 */     int i7 = 0;
/*  57 */     float f1 = 0.0F;
/*  58 */     float f2 = 0.0F;
/*  59 */     float f3 = 0.0F;
/*     */     
/*     */ 
/*  62 */     int i8 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  66 */       i = MainMemory.alloc(1);
/*  67 */       j = MainMemory.alloc(1);
/*  68 */       k = MainMemory.alloc(1);
/*  69 */       m = MainMemory.alloc(1);
/*  70 */       n = MainMemory.alloc(1);
/*  71 */       i1 = MainMemory.alloc(16);
/*  72 */       i2 = MainMemory.alloc(4);
/*  73 */       _ZNSaIcEC1Ev.call(n);
/*  74 */       _ZNSsC1EPKcRKSaIcE.call(i1, 14688, n);
/*  75 */       _ZNSaIcED1Ev.call(n);
/*  76 */       i3 = i1 + 4;
/*  77 */       _ZNSaIcEC1Ev.call(m);
/*  78 */       _ZNSsC1EPKcRKSaIcE.call(i3, 14400, m);
/*  79 */       _ZNSaIcED1Ev.call(m);
/*  80 */       i3 = i1 + 8;
/*  81 */       _ZNSaIcEC1Ev.call(k);
/*  82 */       _ZNSsC1EPKcRKSaIcE.call(i3, 14528, k);
/*  83 */       _ZNSaIcED1Ev.call(k);
/*  84 */       i3 = i1 + 12;
/*  85 */       _ZNSaIcEC1Ev.call(j);
/*  86 */       _ZNSsC1EPKcRKSaIcE.call(i3, 14624, j);
/*  87 */       _ZNSaIcED1Ev.call(j);
/*  88 */       i4 = MainMemory.getI32(paramInt + 8);
/*  89 */       i5 = MainMemory.getI32(i4);
/*  90 */       i6 = MainMemory.getI32(i4 + 4);
/*  91 */       i7 = i6 * i5 * MainMemory.getI32(i4 + 8);
/*  92 */       if ((i7 < 1) || (paramByte == 0)) {
/*  93 */         f2 = 12.0F;
/*  94 */         f3 = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 104 */         f1 = (float)(i7 << 2 & 0xFFFFFFFF);
/* 105 */         f2 = f1 + 12.0F;
/* 106 */         f3 = (float)((i6 << 1) * i5 & 0xFFFFFFFF);
/* 107 */         f2 = f3 + f2;
/* 108 */         if (MainMemory.getI8(paramInt + 476) != 0) {
/*     */           break label340;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 118 */         if (MainMemory.getI8(paramInt + 453) != 0) {
/*     */           label340:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 129 */           f2 = f1 + f2;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 137 */         if (MainMemory.getI8(paramInt + 316) == 0)
/*     */         {
/* 139 */           f3 = f1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 149 */           f2 = f1 + f2;
/*     */           
/* 151 */           f3 = f1;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 159 */       _ZNSaIcEC1Ev.call(i);
/* 160 */       _ZNSsC1EPKcRKSaIcE.call(i2, 25056, i);
/* 161 */       _ZNSaIcED1Ev.call(i);
/* 162 */       f1 = f2;
/* 163 */       f2 = f3;
/* 164 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 173 */         if ((i5 >= 4) || (!com.emt.proteus.lib.api.MathUtils.f_ogt(f1, 1024.0D))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */         com.emt.proteus.runtime.library.strings._ZNSsaSERKSs.call(i2, i1 + (i5 << 2));
/* 184 */         f2 *= 9.765625E-4F;
/* 185 */         f1 *= 9.765625E-4F;
/* 186 */         i5 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 194 */       _ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 63616), f1), i2);
/* 195 */       if (!com.emt.proteus.lib.api.MathUtils.f_ogt(f2, 0.0D)) {
/*     */         break label576;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 205 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZStlsIcSt11char_traitsIcESaIcEERSt13basic_ostreamIT_T0_ES7_RKSbIS4_S5_T1_E.call(_ZNSolsEf.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 49152), f2), i2), 60736);
/*     */       
/*     */       break label591;
/*     */       
/*     */       label576:
/* 210 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13408);
/*     */       
/*     */ 
/*     */       label591:
/*     */       
/*     */ 
/* 216 */       _ZNSsD1Ev.call(i2);
/* 217 */       i5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 224 */         _ZNSsD1Ev.call(i1 + (3 - i5 << 2));
/* 225 */         i5 += 1;
/* 226 */         if (i5 == 4) {
/*     */           break;
/*     */         }
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
/*     */ 
/*     */ 
/*     */ 
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 247 */       MainMemory.dealloc_generated(i8);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16reportMemorySizeERSob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */