/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class fits_rebin_wcs extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3462;
/*  14 */   public static final Function _instance = new fits_rebin_wcs();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public fits_rebin_wcs() { super("fits_rebin_wcs", 5, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  21 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
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
/*  33 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     call(i, j, k, m, n);
/*  43 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/*  49 */     int i = 0;
/*  50 */     int j = 0;
/*  51 */     int k = 0;
/*  52 */     int m = 0;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     double d1 = 0.0D;
/*  57 */     int i3 = 0;
/*  58 */     double d2 = 0.0D;
/*     */     
/*     */ 
/*  61 */     int i4 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  65 */       i = MainMemory.alloc(4);
/*  66 */       j = MainMemory.alloc(72);
/*  67 */       k = MainMemory.alloc(71);
/*  68 */       m = MainMemory.alloc(8);
/*  69 */       if ((paramInt5 >= 1) || (paramInt2 <= 0)) {
/*     */         break label604;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  79 */       n = m;
/*  80 */       paramInt5 = 0;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  87 */         i1 = paramInt3 + (paramInt5 << 2);
/*  88 */         i2 = paramInt4 + (paramInt5 << 2);
/*  89 */         paramInt5 += 1;
/*  90 */         MainMemory.setI32(i, 0);
/*  91 */         ffkeyn.call(24608, paramInt5, j, i);
/*  92 */         ffgky.call(paramInt1, 82, j, n, 0, i);
/*  93 */         if (MainMemory.getI32(i) != 0)
/*     */         {
/*     */ 
/*     */ 
/*  97 */           i3 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 104 */         else if (!MathUtils.f_oeq(MainMemory.getF64(m), 1.0D))
/*     */         {
/*     */ 
/*     */ 
/* 108 */           i3 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 115 */           i3 = 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 122 */         MainMemory.setI32(i, 0);
/* 123 */         ffkeyn.call(24736, paramInt5, j, i);
/* 124 */         ffgky.call(paramInt1, 82, j, n, 0, i);
/* 125 */         if (MainMemory.getI32(i) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 129 */           i3 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 136 */           d1 = MainMemory.getF64(m);
/* 137 */           i3 = MathUtils.f_une(d1, 1.0D) ? 0 : i3;
/* 138 */           d2 = MainMemory.getF32(i1);
/* 139 */           d1 -= d2;
/* 140 */           d2 = MainMemory.getF32(i2);
/* 141 */           d1 /= d2;
/* 142 */           d1 += 0.5D;
/* 143 */           MainMemory.setF64(m, d1);
/* 144 */           ffmkyd.call(paramInt1, j, d1, -14, 0, i);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 152 */         MainMemory.setI32(i, 0);
/* 153 */         ffkeyn.call(24672, paramInt5, j, i);
/* 154 */         ffgky.call(paramInt1, 82, j, n, 0, i);
/* 155 */         if (MainMemory.getI32(i) != 0)
/*     */         {
/*     */ 
/*     */ 
/* 159 */           i3 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 166 */           fits_rebin_wcs_1501.call(j, i3, i2, i, paramInt1, paramInt5, m, i1);
/*     */           
/*     */           break label585;
/*     */         }
/*     */         for (;;)
/*     */         {
/* 172 */           i3 += 1;
/* 173 */           MainMemory.setI32(i, 0);
/* 174 */           ffkeyn.call(15104, i3, k, i);
/* 175 */           MainMemory.setI16(k + SystemLibrary.strlen(k), (short)95);
/* 176 */           ffkeyn.call(k, paramInt5, j, i);
/* 177 */           ffgky.call(paramInt1, 82, j, n, 0, i);
/* 178 */           if (MainMemory.getI32(i) != 0) {
/*     */             break label566;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 188 */           d1 = MainMemory.getF32(i2);
/* 189 */           d1 *= MainMemory.getF64(m);
/* 190 */           MainMemory.setF64(m, d1);
/* 191 */           ffmkyd.call(paramInt1, j, d1, -14, 0, i);
/*     */           
/*     */ 
/*     */           label566:
/*     */           
/*     */ 
/* 197 */           if (i3 == paramInt2) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */         label585:
/*     */         
/*     */ 
/*     */ 
/* 208 */         if (paramInt5 == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label604:
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
/* 229 */       MainMemory.dealloc_generated(i4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fits_rebin_wcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */