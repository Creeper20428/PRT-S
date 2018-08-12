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
/*     */ public final class _ZN7duchamp5ImageC2EPl extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1370;
/*  17 */   public static final Function _instance = new _ZN7duchamp5ImageC2EPl();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN7duchamp5ImageC2EPl() { super("_ZN7duchamp5ImageC2EPl", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  24 */     call(paramInt1, paramInt2);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, j);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*     */     
/*     */ 
/*  54 */     int i5 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  58 */       i = MainMemory.alloc(1);
/*  59 */       j = MainMemory.alloc(4);
/*  60 */       k = MainMemory.alloc(1);
/*  61 */       m = MainMemory.alloc(4);
/*  62 */       _ZN7duchamp9DataArrayC2Ev.call(paramInt1);
/*  63 */       MainMemory.setI32(paramInt1, 12328);
/*  64 */       n = paramInt1 + 4;
/*  65 */       MainMemory.setI16(n, (short)0);
/*  66 */       i1 = paramInt1 + 16;
/*  67 */       MainMemory.setI32(i1, 0);
/*  68 */       MainMemory.setI32(paramInt1 + 628, 2);
/*  69 */       i2 = paramInt2 + 4;
/*  70 */       i3 = MainMemory.getI32(i2) * MainMemory.getI32(paramInt2);
/*  71 */       if (i3 >= 0) {
/*     */         break label189;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */       _ZNSaIcEC1Ev.call(k);
/*  82 */       _ZNSsC1EPKcRKSaIcE.call(m, 91232, k);
/*  83 */       _ZNSaIcEC1Ev.call(i);
/*  84 */       _ZNSsC1EPKcRKSaIcE.call(j, 55808, i);
/*  85 */       _ZN7duchamp12duchampErrorESsSs.call(j, m);
/*  86 */       _ZNSsD1Ev.call(j);
/*  87 */       _ZNSaIcED1Ev.call(i);
/*  88 */       _ZNSsD1Ev.call(m);
/*  89 */       _ZNSaIcED1Ev.call(k);
/*     */       
/*     */ 
/*     */       break label304;
/*     */       
/*     */       label189:
/*     */       
/*  96 */       MainMemory.setI32(i1, i3);
/*  97 */       if (i3 <= 0) {
/*     */         break label241;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */       MainMemory.setI32(paramInt1 + 20, SystemLibrary.newarray(i3 << 2));
/* 108 */       MainMemory.setI8(paramInt1 + 24, (byte)1);
/*     */       
/*     */ 
/*     */       label241:
/*     */       
/*     */ 
/* 114 */       MainMemory.setI16(n, (short)2);
/* 115 */       i1 = SystemLibrary.newarray(8);
/* 116 */       i4 = paramInt1 + 8;
/* 117 */       MainMemory.setI32(i4, i1);
/* 118 */       MainMemory.setI8(paramInt1 + 12, (byte)1);
/* 119 */       MainMemory.setI32(i1, MainMemory.getI32(paramInt2));
/* 120 */       MainMemory.setI32(MainMemory.getI32(i4) + 4, MainMemory.getI32(i2));
/*     */     }
/*     */     finally
/*     */     {
/*     */       label304:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */       MainMemory.dealloc_generated(i5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp5ImageC2EPl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */