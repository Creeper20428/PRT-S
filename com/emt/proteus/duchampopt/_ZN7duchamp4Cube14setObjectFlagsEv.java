/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs7compareEPKc;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1ERKSs;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSspLERKSs;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube14setObjectFlagsEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1344;
/*  23 */   public static final Function _instance = new _ZN7duchamp4Cube14setObjectFlagsEv();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _ZN7duchamp4Cube14setObjectFlagsEv() { super("_ZN7duchamp4Cube14setObjectFlagsEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  30 */     call(paramInt);
/*  31 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  36 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     call(i);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  46 */     int i = 0;
/*  47 */     int j = 0;
/*  48 */     int k = 0;
/*  49 */     int m = 0;
/*  50 */     int n = 0;
/*  51 */     int i1 = 0;
/*  52 */     int i2 = 0;
/*  53 */     int i3 = 0;
/*  54 */     int i4 = 0;
/*  55 */     int i5 = 0;
/*  56 */     int i6 = 0;
/*  57 */     int i7 = 0;
/*  58 */     int i8 = 0;
/*  59 */     int i9 = 0;
/*  60 */     int i10 = 0;
/*  61 */     boolean bool = false;
/*  62 */     int i11 = 0;
/*  63 */     int i12 = 0;
/*  64 */     int i13 = 0;
/*  65 */     int i14 = 0;
/*  66 */     int i15 = 0;
/*     */     
/*     */ 
/*  69 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       i = MainMemory.alloc(1);
/*  74 */       j = MainMemory.alloc(4);
/*  75 */       k = MainMemory.alloc(4);
/*  76 */       m = MainMemory.alloc(1);
/*  77 */       n = MainMemory.alloc(4);
/*  78 */       i1 = MainMemory.alloc(276);
/*  79 */       i2 = MainMemory.alloc(1);
/*  80 */       i3 = MainMemory.alloc(4);
/*  81 */       i4 = MainMemory.alloc(276);
/*  82 */       i5 = MainMemory.alloc(1);
/*  83 */       i6 = MainMemory.alloc(4);
/*  84 */       i7 = MainMemory.alloc(276);
/*  85 */       i8 = paramInt + 28;
/*  86 */       i12 = MainMemory.getI32(i8);
/*  87 */       i9 = MainMemory.getI32(i12);
/*  88 */       i10 = paramInt + 8;
/*     */       
/*  90 */       i13 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  98 */         i14 = i9 + i13 * 276 + 136;
/*  99 */         i15 = i9 + i13 * 276;
/* 100 */         if (!MathUtils.ult(i15, MainMemory.getI32(i12 + 4))) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */         _ZN7duchamp9DetectionC1ERKS0_.call(i7, i15);
/* 111 */         bool = MathUtils.f_olt(_ZN7duchamp4Cube12enclosedFluxENS_9DetectionE.call(paramInt, i7), 0.0D);
/* 112 */         _ZN7duchamp9DetectionD2Ev.call(i7);
/* 113 */         if (!bool) {
/*     */           break label309;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 123 */         _ZNSaIcEC1Ev.call(i5);
/* 124 */         _ZNSsC1EPKcRKSaIcE.call(i6, 13184, i5);
/* 125 */         _ZNSspLERKSs.call(i14, i6);
/* 126 */         _ZNSsD1Ev.call(i6);
/* 127 */         _ZNSaIcED1Ev.call(i5);
/*     */         
/*     */ 
/*     */         label309:
/*     */         
/*     */ 
/* 133 */         _ZN7duchamp9DetectionC1ERKS0_.call(i4, i15);
/* 134 */         i11 = _ZN7duchamp4Cube16objAtSpatialEdgeENS_9DetectionE.call(paramInt, i4);
/* 135 */         _ZN7duchamp9DetectionD2Ev.call(i4);
/* 136 */         if (i11 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 146 */           _ZNSaIcEC1Ev.call(i2);
/* 147 */           _ZNSsC1EPKcRKSaIcE.call(i3, 13216, i2);
/* 148 */           _ZNSspLERKSs.call(i14, i3);
/* 149 */           _ZNSsD1Ev.call(i3);
/* 150 */           _ZNSaIcED1Ev.call(i2);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 156 */         _ZN7duchamp9DetectionC1ERKS0_.call(i1, i15);
/* 157 */         if (_ZN7duchamp4Cube17objAtSpectralEdgeENS_9DetectionE.call(paramInt, i1) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */           if (MainMemory.getI32(MainMemory.getI32(i10) + 8) >= 3) {
/*     */             break label451;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         _ZN7duchamp9DetectionD2Ev.call(i1);
/*     */         
/*     */         break label494;
/*     */         
/*     */         label451:
/* 182 */         _ZN7duchamp9DetectionD2Ev.call(i1);
/* 183 */         _ZNSaIcEC1Ev.call(m);
/* 184 */         _ZNSsC1EPKcRKSaIcE.call(n, 13248, m);
/* 185 */         _ZNSspLERKSs.call(i14, n);
/* 186 */         _ZNSsD1Ev.call(n);
/* 187 */         _ZNSaIcED1Ev.call(m);
/*     */         
/*     */ 
/*     */         label494:
/*     */         
/*     */ 
/* 193 */         _ZNSsC1ERKSs.call(k, i14);
/* 194 */         bool = _ZNKSs7compareEPKc.call(k, 12960) == 0;
/* 195 */         _ZNSsD1Ev.call(k);
/* 196 */         if (!bool) {
/*     */           break label571;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */         _ZNSaIcEC1Ev.call(i);
/* 207 */         _ZNSsC1EPKcRKSaIcE.call(j, 13472, i);
/* 208 */         _ZNSspLERKSs.call(i14, j);
/* 209 */         _ZNSsD1Ev.call(j);
/* 210 */         _ZNSaIcED1Ev.call(i);
/*     */         
/*     */ 
/*     */         label571:
/*     */         
/*     */ 
/* 216 */         i13 += 1;
/* 217 */         i12 = MainMemory.getI32(i8);
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
/*     */       return;
/*     */     }
/*     */     finally
/*     */     {
/* 234 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14setObjectFlagsEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */