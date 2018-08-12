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
/*     */ public final class _ZN7duchamp9DataArray9saveArrayEPfl extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1340;
/*  16 */   public static final Function _instance = new _ZN7duchamp9DataArray9saveArrayEPfl();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _ZN7duchamp9DataArray9saveArrayEPfl() { super("_ZN7duchamp9DataArray9saveArrayEPfl", 3, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3);
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
/*  38 */     call(i, j, k);
/*  39 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     int i = 0;
/*  46 */     int j = 0;
/*  47 */     int k = 0;
/*  48 */     int m = 0;
/*  49 */     int n = 0;
/*  50 */     int i1 = 0;
/*  51 */     int i2 = 0;
/*  52 */     int i3 = 0;
/*     */     
/*     */ 
/*  55 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  59 */       i = MainMemory.alloc(1);
/*  60 */       j = MainMemory.alloc(4);
/*  61 */       k = MainMemory.alloc(1);
/*  62 */       m = MainMemory.alloc(4);
/*  63 */       n = paramInt1 + 16;
/*  64 */       i1 = MainMemory.getI32(n);
/*  65 */       if (i1 != paramInt3) {
/*     */         break label233;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  75 */       if (i1 <= 0) {
/*     */         break label110;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */       _ZN7duchamp9DataArray9saveArrayEPfl_385.call(paramInt1);
/*     */       
/*     */ 
/*     */       label110:
/*     */       
/*     */ 
/*  91 */       MainMemory.setI32(n, paramInt3);
/*  92 */       i3 = com.emt.proteus.runtime.api.SystemLibrary.newarray(paramInt3 << 2);
/*  93 */       i2 = paramInt1 + 20;
/*  94 */       MainMemory.setI32(i2, i3);
/*  95 */       MainMemory.setI8(paramInt1 + 24, (byte)1);
/*  96 */       if (paramInt3 > 0)
/*     */       {
/*  98 */         i1 = 0;
/*     */       } else {
/*     */         break label223;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 110 */         MainMemory.setF32(i3 + (i1 << 2), MainMemory.getF32(paramInt2 + (i1 << 2)));
/* 111 */         i1 += 1;
/* 112 */         if (i1 == paramInt3) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         i3 = MainMemory.getI32(i2);
/*     */       }
/*     */       
/*     */ 
/*     */       label223:
/*     */       
/*     */ 
/*     */       break label290;
/*     */       
/*     */ 
/*     */       label233:
/*     */       
/*     */ 
/* 135 */       _ZNSaIcEC1Ev.call(k);
/* 136 */       _ZNSsC1EPKcRKSaIcE.call(m, 128480, k);
/* 137 */       _ZNSaIcEC1Ev.call(i);
/* 138 */       _ZNSsC1EPKcRKSaIcE.call(j, 63200, i);
/* 139 */       _ZN7duchamp12duchampErrorESsSs.call(j, m);
/* 140 */       _ZNSsD1Ev.call(j);
/* 141 */       _ZNSaIcED1Ev.call(i);
/* 142 */       _ZNSsD1Ev.call(m);
/* 143 */       _ZNSaIcED1Ev.call(k);
/*     */     }
/*     */     finally
/*     */     {
/*     */       label290:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 154 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp9DataArray9saveArrayEPfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */