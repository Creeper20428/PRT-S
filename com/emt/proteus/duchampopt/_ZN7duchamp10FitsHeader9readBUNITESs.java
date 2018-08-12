/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.strings._ZNKSs5c_strEv;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcEC1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSaIcED1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsC1EPKcRKSaIcE;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsD1Ev;
/*     */ import com.emt.proteus.runtime.library.strings._ZNSsaSEPKc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader9readBUNITESs
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2471;
/*  23 */   public static final Function _instance = new _ZN7duchamp10FitsHeader9readBUNITESs();
/*  24 */   public final Function resolve() { return _instance; }
/*     */   
/*  26 */   public _ZN7duchamp10FitsHeader9readBUNITESs() { super("_ZN7duchamp10FitsHeader9readBUNITESs", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  30 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  35 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int k = call(i, j);
/*  42 */     paramFrame.setI32(paramInt1, k);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*  57 */     int i4 = 0;
/*  58 */     int i5 = 0;
/*  59 */     int i6 = 0;
/*  60 */     int i7 = 0;
/*  61 */     int i8 = 0;
/*  62 */     int i9 = 0;
/*  63 */     int i10 = 0;
/*  64 */     int i11 = 0;
/*     */     
/*     */ 
/*  67 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  71 */       j = MainMemory.alloc(1);
/*  72 */       k = MainMemory.alloc(4);
/*  73 */       m = MainMemory.alloc(1);
/*  74 */       n = MainMemory.alloc(4);
/*  75 */       i1 = MainMemory.alloc(1);
/*  76 */       i2 = MainMemory.alloc(4);
/*  77 */       i3 = MainMemory.alloc(1);
/*  78 */       i4 = MainMemory.alloc(4);
/*  79 */       i5 = MainMemory.alloc(1);
/*  80 */       i6 = MainMemory.alloc(4);
/*  81 */       i7 = MainMemory.alloc(4);
/*  82 */       i8 = MainMemory.alloc(4);
/*  83 */       i9 = SystemLibrary.newarray(73);
/*  84 */       i10 = SystemLibrary.newarray(71);
/*  85 */       MainMemory.setI32(i7, 0);
/*  86 */       if (ffopentest.call(i6, _ZNKSs5c_strEv.call(paramInt2), i7) != 0) {
/*     */         break label521;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       _ZNSaIcEC1Ev.call(i5);
/*  97 */       _ZNSsC1EPKcRKSaIcE.call(i8, 24192, i5);
/*  98 */       _ZNSaIcED1Ev.call(i5);
/*  99 */       ffgky.call(MainMemory.getI32(i6), 16, _ZNKSs5c_strEv.call(i8), i10, i9, i7);
/* 100 */       if (MainMemory.getI32(i7) != 0) {
/*     */         break label426;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       wcsutrn.call(0, i10);
/* 111 */       _ZNSsaSEPKc.call(paramInt1 + 36, i10);
/* 112 */       _ZNSsaSEPKc.call(paramInt1 + 32, i10);
/* 113 */       MainMemory.setI32(i7, 0);
/* 114 */       ffclos.call(MainMemory.getI32(i6), i7);
/* 115 */       if (MainMemory.getI32(i7) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         _ZNSaIcEC1Ev.call(m);
/* 126 */         _ZNSsC1EPKcRKSaIcE.call(n, 63136, m);
/* 127 */         _ZNSaIcEC1Ev.call(j);
/* 128 */         _ZNSsC1EPKcRKSaIcE.call(k, 50176, j);
/* 129 */         _ZN7duchamp14duchampWarningESsSs.call(k, n);
/* 130 */         _ZNSsD1Ev.call(k);
/* 131 */         _ZNSaIcED1Ev.call(j);
/* 132 */         _ZNSsD1Ev.call(n);
/* 133 */         _ZNSaIcED1Ev.call(m);
/* 134 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i7));
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 140 */       if (i9 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */         SystemLibrary.deletearray(i9);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 156 */       if (i10 == 0) {
/* 157 */         i11 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 167 */         SystemLibrary.deletearray(i10);
/* 168 */         i11 = 0;
/*     */         
/*     */         break label503;
/*     */         
/*     */         label426:
/* 173 */         _ZNSaIcEC1Ev.call(i3);
/* 174 */         _ZNSsC1EPKcRKSaIcE.call(i4, 74912, i3);
/* 175 */         _ZNSaIcEC1Ev.call(i1);
/* 176 */         _ZNSsC1EPKcRKSaIcE.call(i2, 50176, i1);
/* 177 */         _ZN7duchamp14duchampWarningESsSs.call(i2, i4);
/* 178 */         _ZNSsD1Ev.call(i2);
/* 179 */         _ZNSaIcED1Ev.call(i1);
/* 180 */         _ZNSsD1Ev.call(i4);
/* 181 */         _ZNSaIcED1Ev.call(i3);
/* 182 */         ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i7));
/* 183 */         i11 = 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label503:
/*     */       
/*     */ 
/* 190 */       _ZNSsD1Ev.call(i8);
/* 191 */       i = i11;
/*     */       
/*     */ 
/*     */       break label542;
/*     */       
/*     */       label521:
/*     */       
/* 198 */       ffrprt.call(MainMemory.getI32Aligned(1800), MainMemory.getI32(i7));
/* 199 */       i = 1;
/*     */       
/*     */ 
/*     */       label542:
/*     */       
/*     */ 
/* 205 */       return i;
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/* 210 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader9readBUNITESs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */