/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class mers2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2826;
/*  12 */   public static final Function _instance = new mers2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public mers2x() { super("mers2x", 10, false); }
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
/*  68 */     int i2 = 0;
/*  69 */     double d1 = 0.0D;
/*  70 */     double d2 = 0.0D;
/*  71 */     double d3 = 0.0D;
/*  72 */     int i3 = 0;
/*  73 */     int i4 = 0;
/*  74 */     int i5 = 0;
/*  75 */     int i6 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  81 */       if (paramInt1 == 0) {
/*  82 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  92 */         if (MainMemory.getI32(paramInt1) != 204)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */           if (merset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 106 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label664;
/*     */           }
/*     */         }
/*     */         
/* 113 */         k = paramInt3 > 0 ? 1 : 0;
/* 114 */         m = k != 0 ? paramInt3 : 1;
/* 115 */         j = k != 0 ? paramInt2 : 1;
/* 116 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 117 */         if (paramInt2 <= 0) {
/*     */           break label182;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 127 */         mers2x_1579.call(paramInt2, paramInt1, paramInt8, m, paramInt5, paramInt4, paramInt6);
/*     */         
/*     */ 
/*     */         label182:
/*     */         
/*     */ 
/* 133 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 137 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 144 */           paramInt6 = paramInt1 + 8;
/* 145 */           paramInt8 = paramInt1 + 352;
/* 146 */           k = j > 0 ? 1 : 0;
/* 147 */           paramInt2 = j * paramInt5 << 3;
/* 148 */           m = j << 2;
/*     */           
/*     */ 
/* 151 */           n = 0;
/* 152 */           i3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 162 */             i1 = paramInt10;
/* 163 */             i2 = paramInt9;
/* 164 */             d2 = MainMemory.getF64(paramInt7 + (n * paramInt4 << 3));
/* 165 */             if ((!MathUtils.f_ugt(d2, -90.0D)) || (!MathUtils.f_ult(d2, 90.0D)))
/*     */             {
/*     */ 
/*     */ 
/* 169 */               i3 = 4;
/* 170 */               d1 = 0.0D;
/* 171 */               i4 = 1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 178 */               d1 = MainMemory.getF64(paramInt6);
/* 179 */               d2 += 90.0D;
/* 180 */               d2 *= 0.5D;
/* 181 */               d3 = SystemLibrary.fmod(d2, 360.0D);
/* 182 */               if (MathUtils.f_oeq(d3, 0.0D)) {
/* 183 */                 d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 193 */               else if (MathUtils.f_oeq(SystemLibrary.fabs(d3), 180.0D)) {
/* 194 */                 d2 = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 204 */               else if ((MathUtils.f_oeq(d3, 45.0D)) || (MathUtils.f_oeq(d3, 225.0D))) {
/* 205 */                 d2 = 1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/* 215 */               else if ((MathUtils.f_oeq(d3, -135.0D)) || (MathUtils.f_oeq(d3, -315.0D))) {
/* 216 */                 d2 = -1.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */               }
/*     */               else
/*     */               {
/*     */ 
/*     */ 
/*     */ 
/* 226 */                 d2 *= 3.141592653589793D;
/* 227 */                 d2 /= 180.0D;
/* 228 */                 d2 = SystemLibrary.tan(d2);
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 236 */               d1 *= SystemLibrary.log(d2);
/* 237 */               d1 -= MainMemory.getF64(paramInt8);
/*     */               
/*     */ 
/* 240 */               i4 = 0;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 249 */             if (k == 0) {
/*     */               break label636;
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
/* 261 */             i2 += paramInt2;
/* 262 */             i1 += m;
/* 263 */             i5 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 270 */               i6 = paramInt10 + (i5 << 2);
/* 271 */               MainMemory.setF64(paramInt9 + (i5 * paramInt5 << 3), d1);
/* 272 */               MainMemory.setI32(i6, i4);
/* 273 */               i5 += 1;
/* 274 */               if (i5 == j) {
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
/* 285 */             paramInt9 = i2;
/* 286 */             paramInt10 = i1;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label636:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 296 */             n += 1;
/* 297 */             if (n == paramInt3) {
/* 298 */               paramInt2 = i3; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label664:
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
/* 319 */       int i7 = i;return i7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/mers2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */