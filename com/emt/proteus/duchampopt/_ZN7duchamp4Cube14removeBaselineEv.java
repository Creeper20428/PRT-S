/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube14removeBaselineEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1432;
/*  18 */   public static final Function _instance = new _ZN7duchamp4Cube14removeBaselineEv();
/*  19 */   public final Function resolve() { return _instance; }
/*     */   
/*  21 */   public _ZN7duchamp4Cube14removeBaselineEv() { super("_ZN7duchamp4Cube14removeBaselineEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  25 */     call(paramInt);
/*  26 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  31 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     call(i);
/*  35 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
/*     */   {
/*  41 */     int i = 0;
/*  42 */     int j = 0;
/*  43 */     int k = 0;
/*  44 */     int m = 0;
/*  45 */     int n = 0;
/*  46 */     int i1 = 0;
/*  47 */     int i2 = 0;
/*  48 */     int i3 = 0;
/*  49 */     int i4 = 0;
/*  50 */     int i5 = 0;
/*  51 */     int i6 = 0;
/*  52 */     int i7 = 0;
/*  53 */     int i8 = 0;
/*  54 */     int i9 = 0;
/*  55 */     int i10 = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*  59 */     int i14 = 0;
/*  60 */     int i15 = 0;
/*     */     
/*     */ 
/*  63 */     int i16 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  67 */       i = MainMemory.alloc(20);
/*  68 */       j = paramInt + 8;
/*  69 */       k = SystemLibrary.newarray(MainMemory.getI32(MainMemory.getI32(j) + 8) << 2);
/*  70 */       m = k;
/*  71 */       n = SystemLibrary.newarray(MainMemory.getI32(MainMemory.getI32(j) + 8) << 2);
/*  72 */       i1 = n;
/*  73 */       i2 = MainMemory.getI32(j);
/*  74 */       i3 = MainMemory.getI32(i2 + 4) * MainMemory.getI32(i2);
/*  75 */       _ZN11ProgressBarC1Ev.call(i);
/*  76 */       i4 = paramInt + 590;
/*  77 */       if (MainMemory.getI8(i4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */         _ZN11ProgressBar4initEi.call(i, i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*  93 */       i5 = paramInt + 20;
/*  94 */       i6 = paramInt + 32;
/*  95 */       i7 = paramInt + 640;
/*  96 */       i8 = paramInt + 632;
/*  97 */       i9 = paramInt + 628;
/*  98 */       i14 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */       i15 = i14 + 1;
/* 106 */       if (i14 >= i3) {
/*     */         break label530;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 116 */       if (MainMemory.getI8(i4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         _ZN11ProgressBar6updateEi.call(i, i15);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 132 */       i11 = MainMemory.getI32(MainMemory.getI32(j) + 8);
/* 133 */       if (i11 > 0) {
/* 134 */         i11 = 0;
/*     */       } else {
/*     */         break label373;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 146 */         MainMemory.setF32(k + (i11 << 2), MainMemory.getF32(MainMemory.getI32(i5) + (i14 + i3 * i11 << 2)));
/* 147 */         i11 += 1;
/* 148 */         i12 = MainMemory.getI32(MainMemory.getI32(j) + 8);
/* 149 */         if (i12 <= i11)
/*     */           break;
/*     */       }
/*     */       break label373;
/* 153 */       i11 = i12;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label373:
/*     */       
/*     */ 
/*     */ 
/* 162 */       _ZN7duchamp11getBaselineEmPfS0_RNS_5ParamE.call(i11, m, i1, i6);
/* 163 */       i11 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 170 */         i12 = i14 + i3 * i11;
/* 171 */         i13 = n + (i11 << 2);
/* 172 */         if (MainMemory.getI32(MainMemory.getI32(j) + 8) <= i11)
/*     */         {
/*     */ 
/*     */ 
/* 176 */           i14 = i15;
/* 177 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 183 */         MainMemory.setF32(MainMemory.getI32(i7) + (i12 << 2), MainMemory.getF32(i13));
/* 184 */         i10 = MainMemory.getI32(i5) + (i12 << 2);
/* 185 */         if (_ZN7duchamp5Param7isBlankERf.call(i6, i10) != 0) {
/*     */           break label514;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 195 */         _ZN7duchamp4Cube14removeBaselineEv_261.call(i12, i13, i9, i8, i10);
/*     */         
/*     */ 
/*     */         label514:
/*     */         
/*     */ 
/* 201 */         i11 += 1;
/*     */       }
/*     */       
/*     */ 
/*     */       label530:
/*     */       
/* 207 */       if (k != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */         SystemLibrary.deletearray(k);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 223 */       if (n != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 233 */         SystemLibrary.deletearray(n);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 239 */       if (MainMemory.getI8(i4) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */         _ZN11ProgressBar6removeEv.call(i);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 255 */       _ZN11ProgressBarD1Ev.call(i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 266 */       MainMemory.dealloc_generated(i16);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube14removeBaselineEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */