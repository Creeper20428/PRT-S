/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp5Image13findSources2DEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1334;
/*  14 */   public static final Function _instance = new _ZN7duchamp5Image13findSources2DEv();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN7duchamp5Image13findSources2DEv() { super("_ZN7duchamp5Image13findSources2DEv", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  21 */     call(paramInt1, paramInt2);
/*  22 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  27 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i, j);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  40 */     int i = 0;
/*  41 */     int j = 0;
/*  42 */     int k = 0;
/*  43 */     int m = 0;
/*  44 */     int n = 0;
/*  45 */     int i1 = 0;
/*  46 */     int i2 = 0;
/*  47 */     int i3 = 0;
/*  48 */     int i4 = 0;
/*  49 */     int i5 = 0;
/*  50 */     int i6 = 0;
/*  51 */     int i7 = 0;
/*  52 */     int i8 = 0;
/*  53 */     int i9 = 0;
/*  54 */     int i10 = 0;
/*  55 */     int i11 = 0;
/*  56 */     int i12 = 0;
/*  57 */     int i13 = 0;
/*     */     
/*     */ 
/*  60 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(20);
/*  65 */       j = paramInt2 + 8;
/*  66 */       i1 = MainMemory.getI32(j);
/*  67 */       i13 = MainMemory.getI32(i1);
/*  68 */       i9 = MainMemory.getI32(i1 + 4);
/*  69 */       k = i9 * i13;
/*  70 */       MainMemory.setI32(i, 0);
/*  71 */       m = i + 4;
/*  72 */       MainMemory.setI32(m, 0);
/*  73 */       n = i + 8;
/*  74 */       MainMemory.setI32(n, 0);
/*  75 */       i1 = i + 12;
/*  76 */       MainMemory.setI32(i1, 0);
/*  77 */       i2 = i + 16;
/*  78 */       MainMemory.setI32(i2, 0);
/*  79 */       i6 = k + 31;
/*  80 */       i3 = SystemLibrary.newobject(i6 >>> 3 & 0x1FFFFFFC);
/*  81 */       i4 = i3;
/*  82 */       i5 = i4 + (i6 >>> 5 << 2);
/*  83 */       MainMemory.setI32(i2, i5);
/*  84 */       MainMemory.setI32(i, i4);
/*  85 */       MainMemory.setI32(m, 0);
/*  86 */       i6 = k / 32;
/*  87 */       k %= 32;
/*  88 */       i7 = k < 0 ? 1 : 0;
/*  89 */       MainMemory.setI32(n, i4 + ((i7 != 0 ? i6 + -1 : i6) << 2));
/*  90 */       MainMemory.setI32(i1, i7 != 0 ? k + 32 : k);
/*  91 */       if (i4 != i5)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */         i13 = i13 * i9 + 31 >>> 5;
/* 102 */         i9 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 109 */           k = i9 + 1;
/* 110 */           MainMemory.setI32(i3 + (i9 << 2), 0);
/* 111 */           if (k == i13) {
/*     */             break;
/*     */           }
/*     */           
/* 115 */           i9 = k;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 122 */       i10 = paramInt2 + 20;
/* 123 */       i11 = paramInt2 + 32;
/* 124 */       i12 = paramInt2 + 592;
/* 125 */       i1 = MainMemory.getI32(j);
/*     */       
/* 127 */       i13 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 135 */         i9 = MainMemory.getI32(i1 + 4);
/* 136 */         if (i9 > i13) {
/* 137 */           i9 = 0;
/*     */         } else {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 148 */           i1 = MainMemory.getI32(j);
/* 149 */           k = MainMemory.getI32(i1);
/* 150 */           if (k <= i9) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 160 */           k = i9 + i13 * k;
/* 161 */           i8 = MainMemory.getI32(i10) + (k << 2);
/* 162 */           if (_ZN7duchamp5Param7isBlankERf.call(i11, i8) != 0) {
/*     */             break label562;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 172 */           i1 = MainMemory.getI32(i) + (k >>> 5 << 2);
/* 173 */           i6 = 1 << (k & 0x1F);
/* 174 */           k = MainMemory.getI32(i1);
/* 175 */           if (_ZN10Statistics14StatsContainerIfE11isDetectionEf.call(i12, MainMemory.getF32(i8)) != 0)
/*     */           {
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
/* 188 */             k |= i6;
/*     */             
/*     */ 
/*     */             break label610;
/*     */             
/*     */             label562:
/*     */             
/* 195 */             i1 = MainMemory.getI32(i) + (k >>> 5 << 2);
/* 196 */             i6 = 1 << (k & 0x1F);
/* 197 */             k = MainMemory.getI32(i1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */             k &= (i6 ^ 0xFFFFFFFF);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label610:
/*     */           
/*     */ 
/*     */ 
/* 219 */           MainMemory.setI32(i1, k);
/* 220 */           i9 += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 226 */         i13 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */       _ZN7duchamp11lutz_detectERSt6vectorIbSaIbEEllj.call(paramInt1, i, MainMemory.getI32(i1), i9, MainMemory.getI32(paramInt2 + 628));
/* 234 */       i1 = MainMemory.getI32(i);
/* 235 */       if (i1 != 0) {
/*     */         break label703;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label713;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label703:
/*     */       
/*     */ 
/*     */ 
/* 251 */       SystemLibrary.delete(i1);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label713:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 262 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Image13findSources2DEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */