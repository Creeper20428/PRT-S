/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class cypx2s extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2834;
/*  12 */   public static final Function _instance = new cypx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cypx2s() { super("cypx2s", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  19 */     return call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*  68 */     double d1 = 0.0D;
/*  69 */     double d2 = 0.0D;
/*  70 */     double d3 = 0.0D;
/*  71 */     int i2 = 0;
/*  72 */     int i3 = 0;
/*  73 */     int i4 = 0;
/*  74 */     int i5 = 0;
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
/*  91 */         if (MainMemory.getI32(paramInt1) != 201)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */           if (cypset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 105 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label667;
/*     */           }
/*     */         }
/*     */         
/* 112 */         m = paramInt3 > 0 ? 1 : 0;
/* 113 */         j = m != 0 ? paramInt2 : 1;
/* 114 */         n = m != 0 ? paramInt3 : 1;
/* 115 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
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
/* 126 */         cypx2s_513.call(paramInt4, paramInt5, n, paramInt2, paramInt1, paramInt8, paramInt6);
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
/* 145 */           k = paramInt1 + 24;
/* 146 */           m = j > 0 ? 1 : 0;
/* 147 */           paramInt2 = j * paramInt5 << 3;
/* 148 */           n = j << 2;
/*     */           
/*     */ 
/* 151 */           i1 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 160 */             d2 = MainMemory.getF64(paramInt7 + (i1 * paramInt4 << 3)) + MainMemory.getF64(paramInt8);
/* 161 */             d1 = MainMemory.getF64(paramInt6) * d2;
/* 162 */             if (MathUtils.f_oeq(d1, 0.0D)) {
/* 163 */               d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 173 */               d2 = SystemLibrary.atan2(d1, 1.0D) * 180.0D;
/* 174 */               d2 /= 3.141592653589793D;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 182 */             d3 = MainMemory.getF64(k) * d1;
/* 183 */             d1 *= d1;
/* 184 */             d1 += 1.0D;
/* 185 */             d1 = d3 / SystemLibrary.sqrt(d1);
/* 186 */             if (!MathUtils.f_ugt(d1, -1.0D)) {
/*     */               break label469;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 196 */             if (MathUtils.f_oeq(d1, 0.0D)) {
/* 197 */               d1 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 207 */               if (!MathUtils.f_ult(d1, 1.0D))
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 217 */                 d3 = d1 + -1.0D;
/* 218 */                 if (MathUtils.f_olt(d3, 1.0E-10D)) {
/* 219 */                   d1 = 90.0D;
/*     */                   
/*     */                   break label525;
/*     */                 }
/*     */                 else
/*     */                 {
/*     */                   break label501;
/*     */                 }
/*     */                 label469:
/* 228 */                 d3 = d1 + 1.0D;
/* 229 */                 if (MathUtils.f_ogt(d3, -1.0E-10D)) {
/* 230 */                   d1 = -90.0D;
/*     */                   
/*     */ 
/*     */                   break label525;
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/*     */               label501:
/*     */               
/* 240 */               d1 = SystemLibrary.asin(d1) * 180.0D;
/* 241 */               d1 /= 3.141592653589793D;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */             label525:
/*     */             
/*     */ 
/* 249 */             d2 += d1;
/* 250 */             if (m == 0) {
/*     */               break label640;
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
/* 262 */             i2 = paramInt9 + paramInt2;
/* 263 */             i3 = paramInt10 + n;
/* 264 */             i4 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 271 */               i5 = paramInt10 + (i4 << 2);
/* 272 */               MainMemory.setF64(paramInt9 + (i4 * paramInt5 << 3), d2);
/* 273 */               MainMemory.setI32(i5, 0);
/* 274 */               i4 += 1;
/* 275 */               if (i4 == j) {
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
/* 286 */             paramInt9 = i2;
/* 287 */             paramInt10 = i3;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label640:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 297 */             i1 += 1;
/* 298 */             if (i1 == paramInt3) {
/* 299 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label667:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 313 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */       int i6 = i;return i6;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cypx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */