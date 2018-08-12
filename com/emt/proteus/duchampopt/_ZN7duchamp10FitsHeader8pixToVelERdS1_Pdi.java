/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN7duchamp10FitsHeader8pixToVelERdS1_Pdi extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 300;
/*  12 */   public static final Function _instance = new _ZN7duchamp10FitsHeader8pixToVelERdS1_Pdi();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public _ZN7duchamp10FitsHeader8pixToVelERdS1_Pdi() { super("_ZN7duchamp10FitsHeader8pixToVelERdS1_Pdi", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int i1 = call(i, j, k, m, n);
/*  40 */     paramFrame.setI32(paramInt1, i1);
/*  41 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  46 */     int i = 0;
/*     */     
/*  48 */     int j = 0;
/*  49 */     int k = 0;
/*  50 */     int m = 0;
/*  51 */     int n = 0;
/*  52 */     int i1 = 0;
/*  53 */     int i2 = 0;
/*  54 */     int i3 = 0;
/*  55 */     int i4 = 0;
/*  56 */     int i5 = 0;
/*  57 */     int i6 = 0;
/*  58 */     int i7 = 0;
/*  59 */     int i8 = 0;
/*  60 */     double d1 = 0.0D;
/*  61 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  67 */       j = SystemLibrary.newarray(paramInt5 << 3);
/*  68 */       k = j;
/*  69 */       if (MainMemory.getI8(paramInt1 + 12) != 0) {
/*     */         break label99;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       _ZN7duchamp10FitsHeader8pixToVelERdS1_Pdi_184.call(paramInt4, paramInt5, j);
/*     */       
/*     */       break label464;
/*     */       
/*     */       label99:
/*  84 */       m = paramInt5 * 24;
/*  85 */       n = SystemLibrary.newarray(m);
/*  86 */       i1 = n;
/*  87 */       i2 = paramInt5 > 0 ? 1 : 0;
/*  88 */       if (i2 != 0) {
/*  89 */         i3 = 0;
/*     */       } else {
/*     */         break label242;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 100 */         i4 = paramInt4 + (i3 << 3);
/* 101 */         i5 = i3 * 24;
/* 102 */         i6 = n + (i5 + 8);
/* 103 */         i7 = n + (i5 + 16);
/* 104 */         MainMemory.setF64(n + i5, MainMemory.getF64(paramInt2));
/* 105 */         MainMemory.setF64(i6, MainMemory.getF64(paramInt3));
/* 106 */         MainMemory.setF64(i7, MainMemory.getF64(i4));
/* 107 */         i3 += 1;
/* 108 */         if (i3 == paramInt5) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label242:
/*     */       
/*     */ 
/*     */ 
/* 119 */       i8 = SystemLibrary.newarray(m);
/* 120 */       _Z13pixToWCSMultiP6wcsprmPKdPdi.call(MainMemory.getI32(paramInt1 + 4), i1, i8, paramInt5);
/* 121 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         SystemLibrary.deletearray(n);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 137 */       if (i2 == 0) {
/*     */         break label446;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */       paramInt2 = paramInt1 + 96;
/* 148 */       paramInt3 = paramInt1 + 80;
/* 149 */       paramInt4 = paramInt1 + 88;
/* 150 */       m = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 157 */         i1 = j + (m << 3);
/* 158 */         d1 = MainMemory.getF64(paramInt2);
/* 159 */         d2 = MainMemory.getF64(i8 + (m * 24 + 16)) * MainMemory.getF64(paramInt3);
/* 160 */         d2 += MainMemory.getF64(paramInt4);
/* 161 */         if (com.emt.proteus.lib.api.MathUtils.f_oeq(d1, 1.0D)) {
/* 162 */           d1 = d2;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 172 */           d1 = SystemLibrary.pow(d2, d1);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 180 */         MainMemory.setF64(i1, d1);
/* 181 */         m += 1;
/* 182 */         if (m == paramInt5) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label446:
/*     */       
/*     */ 
/*     */ 
/* 193 */       if (i8 != 0) {
/*     */         break label478;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label464:
/*     */       
/*     */ 
/*     */ 
/* 203 */       i = k;
/*     */       
/*     */ 
/*     */       break label492;
/*     */       
/*     */       label478:
/*     */       
/* 210 */       SystemLibrary.deletearray(i8);
/* 211 */       i = k;
/*     */       
/*     */ 
/*     */       label492:
/*     */       
/*     */ 
/* 217 */       int i9 = i; return i9;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp10FitsHeader8pixToVelERdS1_Pdi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */