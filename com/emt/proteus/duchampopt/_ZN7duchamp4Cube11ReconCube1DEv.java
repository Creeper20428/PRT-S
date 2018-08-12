/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ 
/*     */ 
/*     */ public final class _ZN7duchamp4Cube11ReconCube1DEv
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 773;
/*  17 */   public static final Function _instance = new _ZN7duchamp4Cube11ReconCube1DEv();
/*  18 */   public final Function resolve() { return _instance; }
/*     */   
/*  20 */   public _ZN7duchamp4Cube11ReconCube1DEv() { super("_ZN7duchamp4Cube11ReconCube1DEv", 1, false); }
/*     */   
/*     */   public int execute(int paramInt)
/*     */   {
/*  24 */     call(paramInt);
/*  25 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  30 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     call(i);
/*  34 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt)
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
/*  55 */     byte b = 0;
/*  56 */     int i11 = 0;
/*  57 */     int i12 = 0;
/*  58 */     int i13 = 0;
/*     */     
/*     */ 
/*  61 */     int i14 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(1);
/*  66 */       j = MainMemory.alloc(4);
/*  67 */       k = MainMemory.alloc(4);
/*  68 */       m = MainMemory.alloc(20);
/*  69 */       n = MainMemory.alloc(4);
/*  70 */       i1 = MainMemory.alloc(4);
/*  71 */       i2 = MainMemory.getI32(paramInt + 8);
/*  72 */       i3 = MainMemory.getI32(i2 + 4) * MainMemory.getI32(i2);
/*  73 */       i13 = MainMemory.getI32(i2 + 8);
/*  74 */       MainMemory.setI32(k, i13);
/*  75 */       _ZN11ProgressBarC1Ev.call(m);
/*  76 */       i4 = paramInt + 632;
/*  77 */       if (MainMemory.getI8(i4) != 0) {
/*     */         break label619;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  87 */       i5 = paramInt + 590;
/*  88 */       if (MainMemory.getI8(i5) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  98 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 63008);
/*  99 */         _ZN11ProgressBar4initEi.call(m, i3);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 105 */       i6 = paramInt + 20;
/* 106 */       i7 = paramInt + 32;
/* 107 */       i8 = paramInt + 628;
/* 108 */       i11 = i13;
/* 109 */       i12 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 117 */         i13 = i12 + 1;
/* 118 */         if (i12 >= i3) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */         if (MainMemory.getI8(i5) != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */           _ZN11ProgressBar6updateEi.call(m, i13);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 144 */         i9 = i11 << 2;
/* 145 */         i10 = SystemLibrary.newarray(i9);
/* 146 */         MainMemory.setI32(n, i10);
/* 147 */         MainMemory.setI32(i1, SystemLibrary.newarray(i9));
/* 148 */         if (i11 == 0) {
/*     */           break label405;
/*     */         } else {
/* 151 */           i9 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         do
/*     */         {
/* 160 */           MainMemory.setF32(i10 + (i9 << 2), MainMemory.getF32(MainMemory.getI32(i6) + (i12 + i3 * i9 << 2)));
/* 161 */           i9 += 1;
/* 162 */         } while (MathUtils.ult(i9, i11));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label405:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 173 */         b = MainMemory.getI8(i5);
/* 174 */         MainMemory.setI8(i5, (byte)0);
/* 175 */         _ZN7duchamp19atrous1DReconstructERmRPfS2_RNS_5ParamE.call(k, n, i1, i7);
/* 176 */         MainMemory.setI8(i5, b);
/* 177 */         i11 = MainMemory.getI32(k);
/* 178 */         if (i11 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           i10 = MainMemory.getI32(i1);
/* 189 */           i9 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           do
/*     */           {
/* 196 */             MainMemory.setF32(MainMemory.getI32(i8) + (i12 + i3 * i9 << 2), MainMemory.getF32(i10 + (i9 << 2)));
/* 197 */             i9 += 1;
/* 198 */           } while (MathUtils.ult(i9, i11));
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 209 */         i10 = MainMemory.getI32(n);
/* 210 */         if (i10 != 0)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 220 */           SystemLibrary.deletearray(i10);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 226 */         i10 = MainMemory.getI32(i1);
/* 227 */         if (i10 == 0)
/*     */         {
/* 229 */           i12 = i13;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 239 */           SystemLibrary.deletearray(i10);
/*     */           
/* 241 */           i12 = i13;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 246 */       _ZN7duchamp4Cube11ReconCube1DEv_233.call(i, m, j, i5, i4);
/*     */       
/*     */ 
/*     */       label619:
/*     */       
/*     */ 
/* 252 */       _ZN11ProgressBarD1Ev.call(m);
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
/* 263 */       MainMemory.dealloc_generated(i14);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN7duchamp4Cube11ReconCube1DEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */