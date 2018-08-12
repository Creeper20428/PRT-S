/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class sfls2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2823;
/*  12 */   public static final Function _instance = new sfls2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public sfls2x() { super("sfls2x", 10, false); }
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
/*  70 */     double d2 = 0.0D;
/*  71 */     int i3 = 0;
/*  72 */     int i4 = 0;
/*  73 */     int i5 = 0;
/*  74 */     int i6 = 0;
/*  75 */     int i7 = 0;
/*  76 */     int i8 = 0;
/*  77 */     int i9 = 0;
/*  78 */     int i10 = 0;
/*  79 */     double d3 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  85 */       if (paramInt1 == 0) {
/*  86 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  96 */         if (MainMemory.getI32(paramInt1) != 301)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 106 */           if (sflset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 110 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label699;
/*     */           }
/*     */         }
/*     */         
/* 117 */         m = paramInt3 > 0 ? 1 : 0;
/* 118 */         j = m != 0 ? paramInt2 : 1;
/* 119 */         i1 = m != 0 ? paramInt3 : 1;
/* 120 */         paramInt3 = m != 0 ? paramInt3 : paramInt2;
/* 121 */         if (paramInt2 <= 0) {
/*     */           break label194;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */         sfls2x_1631.call(paramInt8, i1, paramInt5, paramInt6, paramInt1, paramInt2, paramInt4);
/*     */         
/*     */ 
/*     */         label194:
/*     */         
/*     */ 
/* 137 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 141 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 148 */           paramInt6 = paramInt1 + 360;
/* 149 */           k = paramInt1 + 352;
/* 150 */           m = j > 0 ? 1 : 0;
/* 151 */           n = paramInt1 + 344;
/* 152 */           paramInt2 = j * paramInt5 << 3;
/* 153 */           i1 = j << 2;
/*     */           
/*     */ 
/*     */ 
/* 157 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 167 */             d2 = MainMemory.getF64(paramInt7 + (i2 * paramInt4 << 3));
/* 168 */             if (!com.emt.proteus.lib.api.MathUtils.f_oeq(SystemLibrary.fmod(d2, 90.0D), 0.0D)) {
/*     */               break label454;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 178 */             d1 = d2 / 90.0D;
/* 179 */             d1 += 0.5D;
/* 180 */             i6 = (int)SystemLibrary.floor(d1);
/* 181 */             switch ((i6 > -1 ? i6 : 0 - i6) & 0x3) {
/*     */             case 0:  break label441;
/*     */               break; case 1:  d1 = 0.0D;
/*     */               break label482;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d1 = 0.0D;
/*     */               
/*     */ 
/*     */               break label482;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 196 */             d1 = -1.0D;
/*     */             
/*     */             break label482;
/*     */             
/*     */             label441:
/* 201 */             d1 = 1.0D;
/*     */             
/*     */             break label482;
/*     */             
/*     */             label454:
/* 206 */             d1 = d2 * 3.141592653589793D;
/* 207 */             d1 /= 180.0D;
/* 208 */             d1 = SystemLibrary.cos(d1);
/*     */             
/*     */ 
/*     */ 
/*     */             label482:
/*     */             
/*     */ 
/*     */ 
/* 216 */             d2 = MainMemory.getF64(paramInt6) * d2;
/* 217 */             d2 -= MainMemory.getF64(k);
/* 218 */             if (m == 0) {
/*     */               break label672;
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
/*     */ 
/* 231 */             i3 = paramInt9 + paramInt2;
/* 232 */             i4 = paramInt8 + paramInt2;
/* 233 */             i5 = paramInt10 + i1;
/* 234 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 241 */               i7 = i6 * paramInt5;
/* 242 */               i8 = paramInt9 + (i7 << 3);
/* 243 */               i9 = paramInt8 + (i7 << 3);
/* 244 */               i10 = paramInt10 + (i6 << 2);
/* 245 */               d3 = MainMemory.getF64(i9) * d1;
/* 246 */               d3 -= MainMemory.getF64(n);
/* 247 */               MainMemory.setF64(i9, d3);
/* 248 */               MainMemory.setF64(i8, d2);
/* 249 */               MainMemory.setI32(i10, 0);
/* 250 */               i6 += 1;
/* 251 */               if (i6 == j) {
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
/* 262 */             paramInt8 = i3;
/* 263 */             i8 = i4;
/* 264 */             paramInt10 = i5;
/* 265 */             paramInt9 = paramInt8;
/* 266 */             paramInt8 = i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label672:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 276 */             i2 += 1;
/* 277 */             if (i2 == paramInt3) {
/* 278 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label699:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 293 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 299 */       int i11 = i;return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sfls2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */