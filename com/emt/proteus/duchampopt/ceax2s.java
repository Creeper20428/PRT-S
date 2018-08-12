/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class ceax2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2831;
/*  12 */   public static final Function _instance = new ceax2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ceax2s() { super("ceax2s", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
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
/*  39 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     int i4 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  49 */     paramInt4 += 2;
/*  50 */     paramInt3--;
/*  51 */     int i5 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  52 */     paramInt4 += 2;
/*  53 */     paramInt3--;
/*  54 */     int i6 = call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     paramFrame.setI32(paramInt1, i6);
/*  56 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*     */     
/*  63 */     int j = 0;
/*  64 */     int k = 0;
/*  65 */     int m = 0;
/*  66 */     int n = 0;
/*  67 */     int i1 = 0;
/*  68 */     int i2 = 0;
/*  69 */     double d1 = 0.0D;
/*  70 */     int i3 = 0;
/*  71 */     double d2 = 0.0D;
/*  72 */     int i4 = 0;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  80 */       if (paramInt1 == 0) {
/*  81 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  91 */         if (MainMemory.getI32(paramInt1) != 202)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           if (ceaset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 105 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label691;
/*     */           }
/*     */         }
/*     */         
/* 112 */         k = paramInt3 > 0 ? 1 : 0;
/* 113 */         m = k != 0 ? paramInt3 : 1;
/* 114 */         j = k != 0 ? paramInt2 : 1;
/* 115 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 116 */         if (paramInt2 <= 0) {
/*     */           break label179;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 126 */         ceax2s_494.call(paramInt8, paramInt1, paramInt6, paramInt5, paramInt4, m, paramInt2);
/*     */         
/*     */ 
/*     */         label179:
/*     */         
/*     */ 
/* 132 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 136 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 143 */           paramInt6 = paramInt1 + 384;
/* 144 */           paramInt8 = paramInt1 + 352;
/* 145 */           k = j > 0 ? 1 : 0;
/* 146 */           paramInt2 = j * paramInt5 << 3;
/* 147 */           m = j << 2;
/*     */           
/*     */ 
/* 150 */           n = 0;
/* 151 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 161 */             i1 = paramInt10;
/* 162 */             i2 = paramInt9;
/* 163 */             d2 = MainMemory.getF64(paramInt7 + (n * paramInt4 << 3)) + MainMemory.getF64(paramInt8);
/* 164 */             d2 = MainMemory.getF64(paramInt6) * d2;
/* 165 */             d1 = com.emt.proteus.runtime.api.SystemLibrary.fabs(d2);
/* 166 */             if (!MathUtils.f_ogt(d1, 1.0D)) {
/*     */               break label379;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */             if (MathUtils.f_ogt(d1, 1.0000000000001D)) {
/* 177 */               i3 = 3;
/* 178 */               d2 = 0.0D;
/* 179 */               i4 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 189 */               d2 = MathUtils.f_olt(d2, 0.0D) ? -90.0D : 90.0D;
/*     */               
/*     */ 
/* 192 */               i4 = 0;
/*     */               
/*     */               break label554;
/*     */               
/*     */               label379:
/* 197 */               if (!MathUtils.f_ugt(d2, -1.0D)) {
/*     */                 break label492;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 207 */               if (MathUtils.f_oeq(d2, 0.0D))
/*     */               {
/* 209 */                 d2 = 0.0D;
/* 210 */                 i4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 220 */                 if (!MathUtils.f_ult(d2, 1.0D))
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 230 */                   d1 = d2 + -1.0D;
/* 231 */                   if (MathUtils.f_olt(d1, 1.0E-10D))
/*     */                   {
/* 233 */                     d2 = 90.0D;
/* 234 */                     i4 = 0;
/*     */                     
/*     */                     break label554;
/*     */                   }
/*     */                   else
/*     */                   {
/*     */                     break label527;
/*     */                   }
/*     */                   label492:
/* 243 */                   d1 = d2 + 1.0D;
/* 244 */                   if (MathUtils.f_ogt(d1, -1.0E-10D))
/*     */                   {
/* 246 */                     d2 = -90.0D;
/* 247 */                     i4 = 0;
/*     */                     
/*     */ 
/*     */                     break label554;
/*     */                   }
/*     */                 }
/*     */                 
/*     */ 
/*     */                 label527:
/*     */                 
/* 257 */                 d2 = com.emt.proteus.runtime.api.SystemLibrary.asin(d2) * 180.0D;
/* 258 */                 d2 /= 3.141592653589793D;
/*     */                 
/*     */ 
/* 261 */                 i4 = 0;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label554:
/*     */             
/*     */ 
/* 270 */             if (k == 0) {
/*     */               break label663;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 282 */             i2 += paramInt2;
/* 283 */             i1 += m;
/* 284 */             i5 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 291 */               i6 = paramInt10 + (i5 << 2);
/* 292 */               MainMemory.setF64(paramInt9 + (i5 * paramInt5 << 3), d2);
/* 293 */               MainMemory.setI32(i6, i4);
/* 294 */               i5 += 1;
/* 295 */               if (i5 == j) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 306 */             paramInt9 = i2;
/* 307 */             paramInt10 = i1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label663:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 317 */             n += 1;
/* 318 */             if (n == paramInt3) {
/* 319 */               paramInt2 = i3; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label691:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 334 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 340 */       int i7 = i;return i7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ceax2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */