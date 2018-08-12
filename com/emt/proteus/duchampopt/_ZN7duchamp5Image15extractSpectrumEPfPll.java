/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp5Image15extractSpectrumEPfPll extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1337;
/*  16 */   public static final Function _instance = new _ZN7duchamp5Image15extractSpectrumEPfPll();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp5Image15extractSpectrumEPfPll() { super("_ZN7duchamp5Image15extractSpectrumEPfPll", 4, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  24 */     return 0;
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
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     call(i, j, k, m);
/*  42 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     int n = 0;
/*  53 */     int i1 = 0;
/*  54 */     int i2 = 0;
/*  55 */     int i3 = 0;
/*  56 */     int i4 = 0;
/*  57 */     int i5 = 0;
/*  58 */     int i6 = 0;
/*  59 */     int i7 = 0;
/*  60 */     int i8 = 0;
/*  61 */     int i9 = 0;
/*     */     
/*     */ 
/*  64 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  68 */       i = MainMemory.alloc(1);
/*  69 */       j = MainMemory.alloc(4);
/*  70 */       k = MainMemory.alloc(1);
/*  71 */       m = MainMemory.alloc(4);
/*  72 */       n = MainMemory.alloc(1);
/*  73 */       i1 = MainMemory.alloc(4);
/*  74 */       i2 = MainMemory.alloc(1);
/*  75 */       i3 = MainMemory.alloc(4);
/*  76 */       if (paramInt4 >= 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  86 */         i4 = paramInt3 + 4;
/*  87 */         if (MainMemory.getI32(i4) * MainMemory.getI32(paramInt3) <= paramInt4) {
/*     */           break label382;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */         i5 = paramInt3 + 8;
/*  98 */         i6 = MainMemory.getI32(i5);
/*  99 */         i7 = paramInt1 + 16;
/* 100 */         i8 = MainMemory.getI32(i7);
/* 101 */         if (i6 != i8) {
/*     */           break label317;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */         if (i8 <= 0) {
/*     */           break label266;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         if (MainMemory.getI8(paramInt1 + 24) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */           i9 = MainMemory.getI32(paramInt1 + 20);
/* 134 */           if (i9 != 0)
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
/* 145 */             com.emt.proteus.runtime.api.SystemLibrary.deletearray(i9);
/* 146 */             i6 = MainMemory.getI32(i5);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */         label266:
/*     */         
/*     */ 
/* 154 */         MainMemory.setI32(i7, i6);
/* 155 */         if (i6 <= 0) {
/*     */           break label307;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 165 */         _ZN7duchamp5Image15extractSpectrumEPfPll_307.call(i4, paramInt3, paramInt4, i5, paramInt2, paramInt1);
/*     */         
/*     */ 
/*     */         label307:
/*     */         
/*     */ 
/*     */         break label442;
/*     */         
/*     */ 
/*     */         label317:
/*     */         
/*     */ 
/* 177 */         _ZNSaIcEC1Ev.call(k);
/* 178 */         _ZNSsC1EPKcRKSaIcE.call(m, 128480, k);
/* 179 */         _ZNSaIcEC1Ev.call(i);
/* 180 */         _ZNSsC1EPKcRKSaIcE.call(j, 65728, i);
/* 181 */         _ZN7duchamp12duchampErrorESsSs.call(j, m);
/* 182 */         _ZNSsD1Ev.call(j);
/* 183 */         _ZNSaIcED1Ev.call(i);
/* 184 */         _ZNSsD1Ev.call(m);
/* 185 */         _ZNSaIcED1Ev.call(k);
/*     */         
/*     */         break label442;
/*     */       }
/*     */       
/*     */       label382:
/*     */       
/* 192 */       _ZNSaIcEC1Ev.call(i2);
/* 193 */       _ZNSsC1EPKcRKSaIcE.call(i3, 129504, i2);
/* 194 */       _ZNSaIcEC1Ev.call(n);
/* 195 */       _ZNSsC1EPKcRKSaIcE.call(i1, 65728, n);
/* 196 */       _ZN7duchamp12duchampErrorESsSs.call(i1, i3);
/* 197 */       _ZNSsD1Ev.call(i1);
/* 198 */       _ZNSaIcED1Ev.call(n);
/* 199 */       _ZNSsD1Ev.call(i3);
/* 200 */       _ZNSaIcED1Ev.call(i2);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label442:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 211 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5Image15extractSpectrumEPfPll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */