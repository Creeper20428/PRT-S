/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c;
/*     */ 
/*     */ public final class _ZN11ProgressBar6updateEi extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2664;
/*  14 */   public static final Function _instance = new _ZN11ProgressBar6updateEi();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _ZN11ProgressBar6updateEi() { super("_ZN11ProgressBar6updateEi", 2, false); }
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
/*  42 */     float f1 = 0.0F;
/*  43 */     float f2 = 0.0F;
/*  44 */     int k = 0;
/*  45 */     int m = 0;
/*  46 */     float f3 = 0.0F;
/*  47 */     int n = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  53 */       i = paramInt1 + 12;
/*  54 */       j = MainMemory.getI32(i);
/*  55 */       if (j <= 0)
/*     */       {
/*     */ 
/*     */ 
/*  59 */         paramInt2 = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  66 */         f1 = paramInt2;
/*  67 */         f2 = MainMemory.getF32(paramInt1 + 8);
/*  68 */         paramInt2 = j > 1 ? j : 1;
/*  69 */         k = 0;
/*  70 */         m = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/*  78 */           f3 = k;
/*  79 */           f3 *= f2;
/*  80 */           m = (com.emt.proteus.lib.api.MathUtils.f_ogt(f1, f3) ? 1 : 0) + m;
/*  81 */           k += 1;
/*  82 */           if (k == paramInt2) {
/*  83 */             paramInt2 = m; break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       n = paramInt1 + 16;
/*  97 */       if (MainMemory.getI32(n) != paramInt2) {
/*     */         break label186;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label371;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label186:
/*     */       
/*     */ 
/*     */ 
/* 113 */       MainMemory.setI32(n, paramInt2);
/* 114 */       n = paramInt1 + 4;
/* 115 */       if (MainMemory.getI32(n) != 1) {
/*     */         break label228;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */       _ZN11ProgressBar6updateEi_176.call(j);
/*     */       
/*     */ 
/*     */       label228:
/*     */       
/*     */ 
/* 131 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13728);
/* 132 */       if (paramInt2 > 0) {
/* 133 */         j = 0;
/*     */       } else {
/*     */         break label288;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 144 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)35);
/* 145 */         j += 1;
/* 146 */         if (j == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label288:
/*     */       
/*     */ 
/*     */ 
/* 157 */       paramInt2 = MainMemory.getI32(i) - paramInt2;
/* 158 */       if (paramInt2 > 0) {
/* 159 */         j = 0;
/*     */       } else {
/*     */         break label345;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 170 */         _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_c.call(1808, (byte)32);
/* 171 */         j += 1;
/* 172 */         if (j == paramInt2) {
/*     */           break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label345:
/*     */       
/*     */ 
/*     */ 
/* 183 */       com.emt.proteus.runtime.library.streams._ZNSolsEPFRSoS_E.call(_ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(1808, 13728), 80);
/* 184 */       MainMemory.setI32(n, 1);
/*     */       
/*     */ 
/*     */       label371:
/*     */       
/*     */ 
/* 190 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN11ProgressBar6updateEi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */