/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ 
/*     */ public final class _ZN7duchamp11DuchampBeam11writeToFITSEP8fitsfile
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2362;
/*  18 */   public static final Function _instance = new _ZN7duchamp11DuchampBeam11writeToFITSEP8fitsfile();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN7duchamp11DuchampBeam11writeToFITSEP8fitsfile() { super("_ZN7duchamp11DuchampBeam11writeToFITSEP8fitsfile", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  25 */     call(paramInt1, paramInt2);
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
/*  37 */     call(i, j);
/*  38 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  44 */     int i = 0;
/*  45 */     int j = 0;
/*  46 */     int k = 0;
/*  47 */     int m = 0;
/*  48 */     int n = 0;
/*  49 */     int i1 = 0;
/*  50 */     int i2 = 0;
/*  51 */     int i3 = 0;
/*  52 */     int i4 = 0;
/*  53 */     int i5 = 0;
/*  54 */     int i6 = 0;
/*  55 */     int i7 = 0;
/*  56 */     int i8 = 0;
/*  57 */     int i9 = 0;
/*     */     
/*     */ 
/*  60 */     int i10 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  64 */       i = MainMemory.alloc(1);
/*  65 */       j = MainMemory.alloc(4);
/*  66 */       k = MainMemory.alloc(1);
/*  67 */       m = MainMemory.alloc(4);
/*  68 */       n = MainMemory.alloc(1);
/*  69 */       i1 = MainMemory.alloc(4);
/*  70 */       i2 = MainMemory.alloc(1);
/*  71 */       i3 = MainMemory.alloc(4);
/*  72 */       i4 = MainMemory.alloc(1);
/*  73 */       i5 = MainMemory.alloc(4);
/*  74 */       i6 = MainMemory.alloc(1);
/*  75 */       i7 = MainMemory.alloc(4);
/*  76 */       i8 = MainMemory.alloc(4);
/*  77 */       if (MainMemory.getI32(paramInt1 + 20) != 1) {
/*     */         break label501;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       i9 = SystemLibrary.newarray(72);
/*  88 */       MainMemory.setI32(i8, 0);
/*  89 */       SystemLibrary.memcpy(i9, 19040, 5, 1);
/*  90 */       if (ffuky.call(paramInt2, 42, i9, paramInt1 + 4, 0, i8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */         _ZNSaIcEC1Ev.call(i6);
/* 101 */         _ZNSsC1EPKcRKSaIcE.call(i7, 68512, i6);
/* 102 */         _ZNSaIcEC1Ev.call(i4);
/* 103 */         _ZNSsC1EPKcRKSaIcE.call(i5, 52480, i4);
/* 104 */         _ZN7duchamp12duchampErrorESsSs.call(i5, i7);
/* 105 */         _ZNSsD1Ev.call(i5);
/* 106 */         _ZNSaIcED1Ev.call(i4);
/* 107 */         _ZNSsD1Ev.call(i7);
/* 108 */         _ZNSaIcED1Ev.call(i6);
/* 109 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i8));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 115 */       MainMemory.setI32(i8, 0);
/* 116 */       SystemLibrary.memcpy(i9, 19104, 5, 1);
/* 117 */       if (ffuky.call(paramInt2, 42, i9, paramInt1 + 8, 0, i8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         _ZNSaIcEC1Ev.call(i2);
/* 128 */         _ZNSsC1EPKcRKSaIcE.call(i3, 68512, i2);
/* 129 */         _ZNSaIcEC1Ev.call(n);
/* 130 */         _ZNSsC1EPKcRKSaIcE.call(i1, 52480, n);
/* 131 */         _ZN7duchamp12duchampErrorESsSs.call(i1, i3);
/* 132 */         _ZNSsD1Ev.call(i1);
/* 133 */         _ZNSaIcED1Ev.call(n);
/* 134 */         _ZNSsD1Ev.call(i3);
/* 135 */         _ZNSaIcED1Ev.call(i2);
/* 136 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i8));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 142 */       MainMemory.setI32(i8, 0);
/* 143 */       MainMemory.setI32(i9, 4280386);
/* 144 */       if (ffuky.call(paramInt2, 42, i9, paramInt1 + 12, 0, i8) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */         _ZNSaIcEC1Ev.call(k);
/* 155 */         _ZNSsC1EPKcRKSaIcE.call(m, 68512, k);
/* 156 */         _ZNSaIcEC1Ev.call(i);
/* 157 */         _ZNSsC1EPKcRKSaIcE.call(j, 52480, i);
/* 158 */         _ZN7duchamp12duchampErrorESsSs.call(j, m);
/* 159 */         _ZNSsD1Ev.call(j);
/* 160 */         _ZNSaIcED1Ev.call(i);
/* 161 */         _ZNSsD1Ev.call(m);
/* 162 */         _ZNSaIcED1Ev.call(k);
/* 163 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i8));
/*     */       }
/*     */     }
/*     */     finally
/*     */     {
/*     */       label501:
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
/* 180 */       MainMemory.dealloc_generated(i10);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp11DuchampBeam11writeToFITSEP8fitsfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */