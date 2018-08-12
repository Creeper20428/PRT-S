/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _Z13findMADFMDiffIfET_PS0_S1_Pbj
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2693;
/*  14 */   public static final Function _instance = new _Z13findMADFMDiffIfET_PS0_S1_Pbj();
/*  15 */   public final Function resolve() { return _instance; }
/*     */   
/*  17 */   public _Z13findMADFMDiffIfET_PS0_S1_Pbj() { super("_Z13findMADFMDiffIfET_PS0_S1_Pbj", 4, false); }
/*     */   
/*     */   public float executeFloat(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  21 */     return call(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  26 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  30 */     paramInt4 += 2;
/*  31 */     paramInt3--;
/*  32 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  33 */     paramInt4 += 2;
/*  34 */     paramInt3--;
/*  35 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  36 */     paramInt4 += 2;
/*  37 */     paramInt3--;
/*  38 */     float f = call(i, j, k, m);
/*  39 */     paramFrame.setF32(paramInt1, f);
/*  40 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static float call(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  45 */     float f1 = 0.0F;
/*     */     
/*  47 */     float f2 = 0.0F;
/*  48 */     int i = 0;
/*  49 */     int j = 0;
/*  50 */     int k = 0;
/*  51 */     int m = 0;
/*  52 */     float f3 = 0.0F;
/*  53 */     int n = 0;
/*  54 */     int i1 = 0;
/*  55 */     int i2 = 0;
/*  56 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       f2 = _Z14findMedianDiffIfET_PS0_S1_Pbj.call(paramInt1, paramInt2, paramInt3, paramInt4);
/*  63 */       i1 = paramInt4 == 0 ? 1 : 0;
/*  64 */       if (i1 == 0)
/*     */       {
/*     */ 
/*     */ 
/*  68 */         n = 0;
/*  69 */         i = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  76 */         paramInt3 = SystemLibrary.newarray(0);
/*  77 */         paramInt1 = paramInt3;
/*     */         
/*     */ 
/*  80 */         paramInt4 = 0;
/*     */         
/*     */         break label295;
/*     */       }
/*     */       
/*     */       for (;;)
/*     */       {
/*  87 */         i = (MainMemory.getI8(paramInt3 + n) != 0 ? 1 : 0) + i;
/*  88 */         n += 1;
/*  89 */         if (n == paramInt4) {
/*     */           break;
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
/* 101 */       j = SystemLibrary.newarray(i << 2);
/* 102 */       k = j;
/* 103 */       if (i1 != 0) {
/* 104 */         paramInt1 = k;
/* 105 */         paramInt3 = j;
/* 106 */         paramInt4 = i;
/*     */         break label295;
/*     */       } else {
/* 109 */         n = 0;
/* 110 */         m = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 120 */         if (MainMemory.getI8(paramInt3 + n) != 0)
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
/* 131 */           f3 = MainMemory.getF32(paramInt1 + (n << 2)) - MainMemory.getF32(paramInt2 + (n << 2));
/* 132 */           f3 -= f2;
/* 133 */           MainMemory.setF32(k + (m << 2), _Z6absvalIfET_S0_.call(f3));
/* 134 */           m += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 142 */         n += 1;
/* 143 */         if (n == paramInt4) {
/* 144 */           paramInt1 = k;
/* 145 */           paramInt3 = j;
/* 146 */           paramInt4 = i; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label295:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 161 */       i = paramInt4 & 0x1;
/* 162 */       paramInt2 = paramInt1 + (paramInt4 << 2);
/* 163 */       n = paramInt4 / 2;
/* 164 */       k = paramInt1 + (n << 2);
/* 165 */       i1 = paramInt4 == 0 ? 1 : 0;
/* 166 */       if ((i1 != 0) || (n != paramInt4))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */         m = paramInt2 - paramInt3 >> 2;
/* 177 */         if (m == 1) {
/* 178 */           m = 0;
/*     */           break label435;
/*     */         } else {
/* 181 */           i2 = m;
/* 182 */           m = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 192 */           i2 >>= 1;
/* 193 */           i3 = m + 1;
/* 194 */           if (i2 == 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 199 */           m = i3;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 206 */         m = (m << 1) + 2;
/*     */         
/*     */ 
/*     */ 
/*     */         label435:
/*     */         
/*     */ 
/*     */ 
/* 214 */         _ZSt13__introselectIPfiEvT_S1_S1_T0_.call(paramInt1, k, paramInt2, m);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 220 */       f2 = MainMemory.getF32(k);
/* 221 */       if (i != 0) {
/*     */         break label619;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 232 */       i = n + -1;
/* 233 */       k = paramInt1 + (i << 2);
/* 234 */       if ((i1 != 0) || (i != paramInt4))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */         paramInt4 = paramInt2 - paramInt3 >> 2;
/* 245 */         if (paramInt4 == 1) {
/* 246 */           paramInt4 = 0;
/*     */           break label584;
/*     */         } else {
/* 249 */           n = paramInt4;
/* 250 */           paramInt4 = 0;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 260 */           n >>= 1;
/* 261 */           i = paramInt4 + 1;
/* 262 */           if (n == 1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 267 */           paramInt4 = i;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */         paramInt4 = (paramInt4 << 1) + 2;
/*     */         
/*     */ 
/*     */ 
/*     */         label584:
/*     */         
/*     */ 
/*     */ 
/* 282 */         _ZSt13__introselectIPfiEvT_S1_S1_T0_.call(paramInt1, k, paramInt2, paramInt4);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 288 */       f2 = MainMemory.getF32(k) + f2;
/* 289 */       f2 *= 0.5F;
/*     */       
/*     */ 
/*     */ 
/*     */       label619:
/*     */       
/*     */ 
/*     */ 
/* 297 */       if (paramInt3 != 0) {
/*     */         break label650;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 307 */       f1 = f2;
/*     */       
/*     */ 
/*     */       break label663;
/*     */       
/*     */       label650:
/*     */       
/* 314 */       SystemLibrary.deletearray(paramInt3);
/* 315 */       f1 = f2;
/*     */       
/*     */ 
/*     */       label663:
/*     */       
/*     */ 
/* 321 */       float f4 = f1; return f4;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z13findMADFMDiffIfET_PS0_S1_Pbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */