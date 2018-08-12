/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ import com.emt.proteus.runtime.library.streams._ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;
/*     */ 
/*     */ 
/*     */ public final class _Z12findAllStatsIfEvPT_jPbRfS3_RS0_S4_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2678;
/*  16 */   public static final Function _instance = new _Z12findAllStatsIfEvPT_jPbRfS3_RS0_S4_();
/*  17 */   public final Function resolve() { return _instance; }
/*     */   
/*  19 */   public _Z12findAllStatsIfEvPT_jPbRfS3_RS0_S4_() { super("_Z12findAllStatsIfEvPT_jPbRfS3_RS0_S4_", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  23 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  38 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  39 */     paramInt4 += 2;
/*  40 */     paramInt3--;
/*  41 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  42 */     paramInt4 += 2;
/*  43 */     paramInt3--;
/*  44 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  45 */     paramInt4 += 2;
/*  46 */     paramInt3--;
/*  47 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  48 */     paramInt4 += 2;
/*  49 */     paramInt3--;
/*  50 */     call(i, j, k, m, n, i1, i2);
/*  51 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  57 */     int i = 0;
/*  58 */     int j = 0;
/*  59 */     int k = 0;
/*  60 */     int m = 0;
/*  61 */     int n = 0;
/*  62 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       i = paramInt2 == 0 ? 1 : 0;
/*  69 */       if (i != 0) {
/*     */         break label116;
/*     */       } else {
/*  72 */         m = 0;
/*  73 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  83 */         n = (MainMemory.getI8(paramInt3 + m) != 0 ? 1 : 0) + n;
/*  84 */         m += 1;
/*  85 */         if (m == paramInt2) {
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
/*  97 */       if (n != 0) {
/*     */         break label135;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */       label116:
/*     */       
/*     */ 
/*     */ 
/* 107 */       _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc.call(2048, 91424);
/*     */       
/*     */ 
/*     */       break label339;
/*     */       
/*     */       label135:
/*     */       
/* 114 */       j = SystemLibrary.newarray(n << 2);
/* 115 */       k = j;
/* 116 */       if (i != 0) {
/* 117 */         paramInt2 = 0;
/*     */         break label252;
/*     */       } else {
/* 120 */         m = 0;
/* 121 */         n = 0;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/* 131 */         if (MainMemory.getI8(paramInt3 + m) != 0)
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
/* 142 */           MainMemory.setF32(k + (n << 2), MainMemory.getF32(paramInt1 + (m << 2)));
/* 143 */           n += 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 151 */         m += 1;
/* 152 */         if (m == paramInt2) {
/* 153 */           paramInt2 = n; break;
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label252:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 166 */       MainMemory.setF32(paramInt4, _Z8findMeanIfEfPT_j.call(k, paramInt2));
/* 167 */       MainMemory.setF32(paramInt5, _Z10findStddevIfEfPT_j.call(k, paramInt2));
/* 168 */       f = _Z10findMedianIfET_PS0_jb.call(k, paramInt2);
/* 169 */       MainMemory.setF32(paramInt6, f);
/* 170 */       MainMemory.setF32(paramInt7, _Z9findMADFMIfET_PS0_jS0_b.call(k, paramInt2, f));
/* 171 */       if (j != 0) {
/*     */         break label329;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       break label339;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label329:
/*     */       
/*     */ 
/*     */ 
/* 187 */       SystemLibrary.deletearray(j);
/*     */       
/*     */ 
/*     */       label339:
/*     */       
/*     */ 
/* 193 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_Z12findAllStatsIfEvPT_jPbRfS3_RS0_S4_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */