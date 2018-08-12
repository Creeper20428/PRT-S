/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSolsEl;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp4Cube9saveArrayEPfl extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1339;
/*  21 */   public static final Function _instance = new _ZN7duchamp4Cube9saveArrayEPfl();
/*  22 */   public final Function resolve() { return _instance; }
/*     */   
/*  24 */   public _ZN7duchamp4Cube9saveArrayEPfl() { super("_ZN7duchamp4Cube9saveArrayEPfl", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  28 */     call(paramInt1, paramInt2, paramInt3);
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  34 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     call(i, j, k);
/*  44 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     int i = 0;
/*  51 */     int j = 0;
/*  52 */     int k = 0;
/*  53 */     int m = 0;
/*  54 */     int n = 0;
/*  55 */     int i1 = 0;
/*  56 */     int i2 = 0;
/*  57 */     int i3 = 0;
/*     */     
/*     */ 
/*  60 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(1);
/*  65 */       j = MainMemory.alloc(4);
/*  66 */       k = MainMemory.alloc(4);
/*  67 */       m = MainMemory.alloc(188);
/*  68 */       n = paramInt1 + 16;
/*  69 */       i1 = MainMemory.getI32(n);
/*  70 */       if (i1 != paramInt3) {
/*     */         break label235;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  80 */       if (i1 <= 0) {
/*     */         break label112;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */       _ZN7duchamp4Cube9saveArrayEPfl_297.call(paramInt1);
/*     */       
/*     */ 
/*     */       label112:
/*     */       
/*     */ 
/*  96 */       MainMemory.setI32(n, paramInt3);
/*  97 */       i3 = SystemLibrary.newarray(paramInt3 << 2);
/*  98 */       i2 = paramInt1 + 20;
/*  99 */       MainMemory.setI32(i2, i3);
/* 100 */       MainMemory.setI8(paramInt1 + 24, (byte)1);
/* 101 */       if (paramInt3 > 0)
/*     */       {
/* 103 */         i1 = 0;
/*     */       } else {
/*     */         break label225;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 115 */         MainMemory.setF32(i3 + (i1 << 2), MainMemory.getF32(paramInt2 + (i1 << 2)));
/* 116 */         i1 += 1;
/* 117 */         if (i1 == paramInt3) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         i3 = MainMemory.getI32(i2);
/*     */       }
/*     */       
/*     */ 
/*     */       label225:
/*     */       
/*     */ 
/*     */       break label330;
/*     */       
/*     */ 
/*     */       label235:
/*     */       
/*     */ 
/* 140 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEEC1ESt13_Ios_Openmode.call(m, 24);
/* 141 */       i1 = MainMemory.getI32(n);
/* 142 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(_ZNSolsEl.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(m + 8, 105760), paramInt3), 23808), i1), 57664);
/* 143 */       _ZNKSt18basic_stringstreamIcSt11char_traitsIcESaIcEE3strEv.call(k, m);
/* 144 */       com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev.call(i);
/* 145 */       _ZNSsC1EPKcRKSaIcE.call(j, 55520, i);
/* 146 */       _ZN7duchamp12duchampErrorESsSs.call(j, k);
/* 147 */       _ZNSsD1Ev.call(j);
/* 148 */       _ZNSaIcED1Ev.call(i);
/* 149 */       _ZNSsD1Ev.call(k);
/* 150 */       _ZNSt18basic_stringstreamIcSt11char_traitsIcESaIcEED1Ev.call(m);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label330:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube9saveArrayEPfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */