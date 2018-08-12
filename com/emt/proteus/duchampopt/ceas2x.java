/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class ceas2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2832;
/*  12 */   public static final Function _instance = new ceas2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public ceas2x() { super("ceas2x", 10, false); }
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
/*  67 */     double d1 = 0.0D;
/*  68 */     double d2 = 0.0D;
/*  69 */     double d3 = 0.0D;
/*  70 */     int i1 = 0;
/*  71 */     int i2 = 0;
/*  72 */     int i3 = 0;
/*  73 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  79 */       if (paramInt1 == 0) {
/*  80 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  90 */         if (MainMemory.getI32(paramInt1) != 202)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 100 */           if (ceaset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 104 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label614;
/*     */           }
/*     */         }
/*     */         
/* 111 */         k = paramInt3 > 0 ? 1 : 0;
/* 112 */         j = k != 0 ? paramInt2 : 1;
/* 113 */         m = k != 0 ? paramInt3 : 1;
/* 114 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 115 */         if (paramInt2 <= 0) {
/*     */           break label176;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 125 */         ceas2x_493.call(paramInt2, paramInt8, paramInt1, paramInt4, paramInt5, paramInt6, m);
/*     */         
/*     */ 
/*     */         label176:
/*     */         
/*     */ 
/* 131 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 135 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 142 */           paramInt6 = paramInt1 + 376;
/* 143 */           paramInt8 = paramInt1 + 352;
/* 144 */           k = j > 0 ? 1 : 0;
/* 145 */           paramInt2 = j * paramInt5 << 3;
/* 146 */           m = j << 2;
/*     */           
/*     */ 
/* 149 */           n = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 158 */             d1 = MainMemory.getF64(paramInt6);
/* 159 */             d2 = MainMemory.getF64(paramInt7 + (n * paramInt4 << 3));
/* 160 */             if (!com.emt.proteus.lib.api.MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */               break label434;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */             d3 = d2 / 90.0D;
/* 171 */             d3 += -0.5D;
/* 172 */             i3 = (int)SystemLibrary.floor(d3);
/* 173 */             switch ((i3 > -1 ? i3 : 0 - i3) & 0x3) {
/*     */             case 0:  break label421;
/*     */               break; case 1:  d2 = 0.0D;
/*     */               break label462;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d2 = 0.0D;
/*     */               
/*     */ 
/*     */               break label462;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 188 */             d2 = -1.0D;
/*     */             
/*     */             break label462;
/*     */             
/*     */             label421:
/* 193 */             d2 = 1.0D;
/*     */             
/*     */             break label462;
/*     */             
/*     */             label434:
/* 198 */             d2 *= 3.141592653589793D;
/* 199 */             d2 /= 180.0D;
/* 200 */             d2 = SystemLibrary.sin(d2);
/*     */             
/*     */ 
/*     */ 
/*     */             label462:
/*     */             
/*     */ 
/*     */ 
/* 208 */             d1 *= d2;
/* 209 */             d1 -= MainMemory.getF64(paramInt8);
/* 210 */             if (k == 0) {
/*     */               break label587;
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
/* 222 */             i1 = paramInt9 + paramInt2;
/* 223 */             i2 = paramInt10 + m;
/* 224 */             i3 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 231 */               i4 = paramInt10 + (i3 << 2);
/* 232 */               MainMemory.setF64(paramInt9 + (i3 * paramInt5 << 3), d1);
/* 233 */               MainMemory.setI32(i4, 0);
/* 234 */               i3 += 1;
/* 235 */               if (i3 == j) {
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
/* 246 */             paramInt9 = i1;
/* 247 */             paramInt10 = i2;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label587:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 257 */             n += 1;
/* 258 */             if (n == paramInt3) {
/* 259 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label614:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 273 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 279 */       int i5 = i;return i5;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/ceas2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */