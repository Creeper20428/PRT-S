/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ 
/*     */ public final class _ZSt16__merge_adaptiveIP4PairiS1_EvT_S2_S2_T0_S3_T1_S3_
/*     */   extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 1209;
/*  15 */   public static final Function _instance = new _ZSt16__merge_adaptiveIP4PairiS1_EvT_S2_S2_T0_S3_T1_S3_();
/*  16 */   public final Function resolve() { return _instance; }
/*     */   
/*  18 */   public _ZSt16__merge_adaptiveIP4PairiS1_EvT_S2_S2_T0_S3_T1_S3_() { super("_ZSt16__merge_adaptiveIP4PairiS1_EvT_S2_S2_T0_S3_T1_S3_", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  22 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
/*  23 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  28 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, j, k, m, n, i1, i2);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*  62 */     int i2 = 0;
/*  63 */     int i3 = 0;
/*  64 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  70 */       i = paramInt3;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       for (;;)
/*     */       {
/*  84 */         if ((paramInt4 > paramInt5) || (paramInt4 > paramInt7)) {
/*     */           break label253;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  94 */         paramInt4 = paramInt2 - paramInt1;
/*  95 */         if (paramInt4 <= 11)
/*     */         {
/*     */ 
/*     */ 
/*  99 */           i4 = paramInt6;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 106 */           paramInt4 /= 12;
/* 107 */           paramInt5 = 0 - paramInt4;
/* 108 */           paramInt5 = paramInt5 > -1 ? paramInt5 : -1;
/* 109 */           paramInt7 = paramInt4 + paramInt5 + 1;
/* 110 */           i = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 117 */             n = paramInt1 + i * 12 + 8;
/* 118 */             j = paramInt6 + i * 12 + 8;
/* 119 */             MainMemory.setF32(paramInt6 + i * 12 + 4, MainMemory.getF32(paramInt1 + i * 12 + 4));
/* 120 */             MainMemory.setF32(j, MainMemory.getF32(n));
/* 121 */             i += 1;
/* 122 */             if (i == paramInt7) {
/*     */               break;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */           i4 = paramInt6 + (paramInt4 + 1 + paramInt5) * 12;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 141 */         _ZSt5mergeIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.call(paramInt6, i4, paramInt2, paramInt3, paramInt1);
/*     */         
/*     */ 
/*     */         break label880;
/*     */         
/*     */         label253:
/*     */         
/* 148 */         if (paramInt5 <= paramInt7) {
/*     */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 158 */         if (paramInt4 <= paramInt5) {
/*     */           break label469;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */         k = paramInt4 / 2;
/* 169 */         m = paramInt2;
/* 170 */         i3 = (i - m) / 12;
/* 171 */         n = paramInt1 + k * 12 + 4;
/*     */         
/* 173 */         i4 = paramInt2;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 188 */           if (i3 <= 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 198 */           i1 = i3 >> 1;
/* 199 */           if (!MathUtils.f_olt(MainMemory.getF32(i4 + i1 * 12 + 4), MainMemory.getF32(n)))
/*     */           {
/*     */ 
/*     */ 
/* 203 */             i3 = i1;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 210 */             i4 += (i1 + 1) * 12;
/* 211 */             i3 = i3 + -1 - i1;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 218 */         i2 = paramInt1 + k * 12;
/* 219 */         i3 = (i4 - m) / 12;
/*     */         
/*     */ 
/* 222 */         m = k;
/* 223 */         k = i3;
/*     */         
/*     */         break label634;
/*     */         
/*     */         label469:
/* 228 */         k = paramInt5 / 2;
/* 229 */         m = paramInt1;
/* 230 */         i3 = (paramInt2 - m) / 12;
/* 231 */         n = paramInt2 + k * 12 + 4;
/*     */         
/* 233 */         i2 = paramInt1;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 248 */           if (i3 <= 0) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 258 */           i1 = i3 >> 1;
/* 259 */           if (MathUtils.f_olt(MainMemory.getF32(n), MainMemory.getF32(i2 + i1 * 12 + 4))) {
/* 260 */             i3 = i1;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 270 */             i4 = i2 + (i1 + 1) * 12;
/* 271 */             i3 = i3 + -1 - i1;
/*     */             
/* 273 */             i2 = i4;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/* 278 */         i4 = paramInt2 + k * 12;
/* 279 */         m = (i2 - m) / 12;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label634:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 293 */         paramInt4 -= m;
/* 294 */         paramInt2 = _ZSt17__rotate_adaptiveIP4PairS1_iET_S2_S2_S2_T1_S3_T0_S3_.call(i2, paramInt2, i4, paramInt4, k, paramInt6, paramInt7);
/* 295 */         call(paramInt1, i2, paramInt2, m, k, paramInt6, paramInt7);
/* 296 */         paramInt5 -= k;
/* 297 */         paramInt1 = paramInt2;
/* 298 */         paramInt2 = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */       paramInt4 = i - paramInt2;
/* 306 */       if (paramInt4 <= 11)
/*     */       {
/*     */ 
/*     */ 
/* 310 */         i4 = paramInt6;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 317 */         paramInt4 /= 12;
/* 318 */         paramInt5 = 0 - paramInt4;
/* 319 */         paramInt5 = paramInt5 > -1 ? paramInt5 : -1;
/* 320 */         paramInt7 = paramInt4 + paramInt5 + 1;
/* 321 */         i = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 328 */           n = paramInt2 + i * 12 + 8;
/* 329 */           j = paramInt6 + i * 12 + 8;
/* 330 */           MainMemory.setF32(paramInt6 + i * 12 + 4, MainMemory.getF32(paramInt2 + i * 12 + 4));
/* 331 */           MainMemory.setF32(j, MainMemory.getF32(n));
/* 332 */           i += 1;
/* 333 */           if (i == paramInt7) {
/*     */             break;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 344 */         i4 = paramInt6 + (paramInt4 + 1 + paramInt5) * 12;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 352 */       _ZSt16__merge_backwardIP4PairS1_S1_ET1_T_S3_T0_S4_S2_.call(paramInt1, paramInt2, paramInt6, i4, paramInt3);
/*     */       
/*     */ 
/*     */       label880:
/*     */       
/*     */ 
/* 358 */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZSt16__merge_adaptiveIP4PairiS1_EvT_S2_S2_T0_S3_T1_S3_.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */