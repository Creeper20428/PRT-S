/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode;
/*     */ import com.emt.proteus.runtime.library.streams._ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube16logDetectionListEb
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1593;
/*  31 */   public static final Function _instance = new _ZN7duchamp4Cube16logDetectionListEb();
/*  32 */   public final Function resolve() { return _instance; }
/*     */   
/*  34 */   public _ZN7duchamp4Cube16logDetectionListEb() { super("_ZN7duchamp4Cube16logDetectionListEb", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  38 */     call(paramInt);
/*  39 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  44 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     call(i);
/*  48 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*  57 */     int m = 0;
/*  58 */     int n = 0;
/*  59 */     int i1 = 0;
/*  60 */     int i2 = 0;
/*  61 */     int i3 = 0;
/*  62 */     int i4 = 0;
/*  63 */     int i5 = 0;
/*  64 */     int i6 = 0;
/*  65 */     int i7 = 0;
/*  66 */     byte b = 0;
/*  67 */     int i8 = 0;
/*  68 */     int i9 = 0;
/*  69 */     int i10 = 0;
/*  70 */     int i11 = 0;
/*  71 */     int i12 = 0;
/*  72 */     int i13 = 0;
/*  73 */     int i14 = 0;
/*  74 */     int i15 = 0;
/*  75 */     int i16 = 0;
/*  76 */     int i17 = 0;
/*  77 */     int i18 = 0;
/*  78 */     int i19 = 0;
/*     */     
/*     */ 
/*  81 */     int i20 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  85 */       i = MainMemory.alloc(12);
/*  86 */       j = MainMemory.alloc(1);
/*  87 */       k = MainMemory.alloc(4);
/*  88 */       m = MainMemory.alloc(12);
/*  89 */       n = MainMemory.alloc(1);
/*  90 */       i1 = MainMemory.alloc(4);
/*  91 */       i2 = MainMemory.alloc(4);
/*  92 */       i3 = MainMemory.alloc(276);
/*  93 */       i4 = MainMemory.alloc(276);
/*  94 */       i5 = paramInt + 28;
/*  95 */       i18 = MainMemory.getI32(i5);
/*  96 */       if (!MathUtils.ult(MainMemory.getI32(i18 + 4) + 275 - MainMemory.getI32(i18), 551)) {
/*     */         break label196;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label638;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label196:
/*     */       
/*     */ 
/*     */ 
/* 112 */       i6 = MainMemory.getI32(paramInt + 280);
/* 113 */       i7 = MainMemory.getI32(paramInt + 288);
/* 114 */       _ZNSsC1ERKSs.call(i2, paramInt + 120);
/* 115 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEEC1EPKcSt13_Ios_Openmode.call(i3, _ZNKSs5c_strEv.call(i2), 1);
/* 116 */       _ZNSsD1Ev.call(i2);
/* 117 */       _ZN7duchamp4Cube16calcObjectFluxesEv.call(paramInt);
/* 118 */       _ZN7duchamp4Cube12setupColumnsEv.call(paramInt);
/* 119 */       b = MainMemory.getI8(paramInt + 660);
/* 120 */       _ZNSaIcEC1Ev.call(n);
/* 121 */       _ZNSsC1EPKcRKSaIcE.call(i1, 16192, n);
/* 122 */       i8 = paramInt + 752;
/* 123 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_.call(m, i8);
/* 124 */       i9 = i3;
/* 125 */       _ZN7duchamp17outputTableHeaderERSoSt6vectorINS_6Column3ColESaIS3_EESsb.call(i9, MainMemory.getI32(m), MainMemory.getI32(m + 4), i1, b);
/* 126 */       _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(m);
/* 127 */       _ZNSsD1Ev.call(i1);
/* 128 */       _ZNSaIcED1Ev.call(n);
/* 129 */       i10 = paramInt + 316;
/* 130 */       if (MainMemory.getI8(i10) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 140 */         _ZN7duchamp4Cube16logDetectionListEb_269.call(paramInt);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 146 */       i11 = paramInt + 32;
/* 147 */       i12 = paramInt + 277;
/* 148 */       i13 = i4 + 140;
/* 149 */       i14 = paramInt + 8;
/* 150 */       i15 = paramInt + 20;
/* 151 */       i16 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 158 */         i17 = i16 + 1;
/* 159 */         i18 = MainMemory.getI32(i5);
/* 160 */         i19 = MainMemory.getI32(i18);
/* 161 */         if (!MathUtils.ugt((MainMemory.getI32(i18 + 4) - i19) / 276, i16)) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 171 */         _ZN7duchamp9DetectionC1ERKS0_.call(i4, i19 + i16 * 276);
/* 172 */         _ZN7duchamp9Detection10setOffsetsERNS_5ParamE.call(i4, i11);
/* 173 */         if (MainMemory.getI8(i12) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 183 */           _ZN9PixelInfo8Object3D10addOffsetsElll.call(i4, i6, i7, 0);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 189 */         _ZN7duchamp9Detection10calcFluxesEPfPl.call(i4, MainMemory.getI32(i15), MainMemory.getI32(i14));
/* 190 */         MainMemory.setI32(i13, i17);
/* 191 */         _ZNSaIcEC1Ev.call(j);
/* 192 */         _ZNSsC1EPKcRKSaIcE.call(k, 16192, j);
/* 193 */         _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EEC2ERKS4_.call(i, i8);
/* 194 */         _ZN7duchamp9Detection13printTableRowERSoSt6vectorINS_6Column3ColESaIS4_EESs.call(i4, i9, i, k);
/* 195 */         _ZNSt6vectorIN7duchamp6Column3ColESaIS2_EED1Ev.call(i);
/* 196 */         _ZNSsD1Ev.call(k);
/* 197 */         _ZNSaIcED1Ev.call(j);
/* 198 */         _ZN7duchamp9DetectionD2Ev.call(i4);
/* 199 */         i16 = i17;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 204 */       if (MainMemory.getI8(i10) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 214 */         _ZN7duchamp4Cube16logDetectionListEb_268.call(i15, paramInt, i14);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 220 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEE5closeEv.call(i3);
/* 221 */       _ZNSt14basic_ofstreamIcSt11char_traitsIcEED1Ev.call(i3);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label638:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */       MainMemory.dealloc_generated(i20);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube16logDetectionListEb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */