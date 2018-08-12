/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class cyps2x extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2835;
/*  12 */   public static final Function _instance = new cyps2x();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public cyps2x() { super("cyps2x", 10, false); }
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
/*  69 */     int i3 = 0;
/*  70 */     int i4 = 0;
/*  71 */     double d1 = 0.0D;
/*  72 */     boolean bool = false;
/*  73 */     double d2 = 0.0D;
/*  74 */     double d3 = 0.0D;
/*  75 */     double d4 = 0.0D;
/*  76 */     int i5 = 0;
/*  77 */     int i6 = 0;
/*  78 */     int i7 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  84 */       if (paramInt1 == 0) {
/*  85 */         paramInt2 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  95 */         if (MainMemory.getI32(paramInt1) != 201)
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 105 */           if (cypset.call(paramInt1) != 0)
/*     */           {
/*     */ 
/*     */ 
/* 109 */             paramInt2 = 2;
/*     */             
/*     */ 
/*     */             break label899;
/*     */           }
/*     */         }
/*     */         
/* 116 */         k = paramInt3 > 0 ? 1 : 0;
/* 117 */         n = k != 0 ? paramInt3 : 1;
/* 118 */         j = k != 0 ? paramInt2 : 1;
/* 119 */         paramInt3 = k != 0 ? paramInt3 : paramInt2;
/* 120 */         if (paramInt2 <= 0) {
/*     */           break label191;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */         cyps2x_512.call(paramInt2, paramInt4, paramInt6, paramInt1, paramInt8, n, paramInt5);
/*     */         
/*     */ 
/*     */         label191:
/*     */         
/*     */ 
/* 136 */         if (paramInt3 <= 0)
/*     */         {
/*     */ 
/*     */ 
/* 140 */           paramInt2 = 0;
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/* 147 */           paramInt6 = paramInt1 + 24;
/* 148 */           paramInt8 = paramInt1 + 352;
/* 149 */           k = j > 0 ? 1 : 0;
/* 150 */           m = paramInt1 + 376;
/* 151 */           paramInt2 = j * paramInt5 << 3;
/* 152 */           n = j << 2;
/*     */           
/*     */ 
/* 155 */           i1 = 0;
/* 156 */           i2 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 166 */             i3 = paramInt10;
/* 167 */             i4 = paramInt9;
/* 168 */             d2 = MainMemory.getF64(paramInt6);
/* 169 */             d1 = MainMemory.getF64(paramInt7 + (i1 * paramInt4 << 3));
/* 170 */             bool = com.emt.proteus.lib.api.MathUtils.f_oeq(SystemLibrary.fmod(d1, 90.0D), 0.0D);
/* 171 */             if (!bool) {
/*     */               break label470;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 181 */             d3 = d1 / 90.0D;
/* 182 */             d3 += 0.5D;
/* 183 */             i5 = (int)SystemLibrary.floor(d3);
/* 184 */             switch ((i5 > -1 ? i5 : 0 - i5) & 0x3) {
/*     */             case 0:  break label457;
/*     */               break; case 1:  d3 = 0.0D;
/*     */               break label498;
/*     */               break;
/*     */             case 2: 
/*     */               break; case 3:  d3 = 0.0D;
/*     */               
/*     */ 
/*     */               break label498;
/*     */               
/*     */               break;
/*     */             }
/*     */             
/*     */             
/* 199 */             d3 = -1.0D;
/*     */             
/*     */             break label498;
/*     */             
/*     */             label457:
/* 204 */             d3 = 1.0D;
/*     */             
/*     */             break label498;
/*     */             
/*     */             label470:
/* 209 */             d3 = d1 * 3.141592653589793D;
/* 210 */             d3 /= 180.0D;
/* 211 */             d3 = SystemLibrary.cos(d3);
/*     */             
/*     */ 
/*     */ 
/*     */             label498:
/*     */             
/*     */ 
/*     */ 
/* 219 */             d2 += d3;
/* 220 */             if (com.emt.proteus.lib.api.MathUtils.f_oeq(d2, 0.0D)) {
/* 221 */               i2 = 4;
/* 222 */               d1 = d2;
/* 223 */               i5 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 233 */               d3 = MainMemory.getF64(m);
/* 234 */               if (!bool) {
/*     */                 break label702;
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 244 */               d4 = d1 / 90.0D;
/* 245 */               d4 += -0.5D;
/* 246 */               i5 = (int)SystemLibrary.floor(d4);
/* 247 */               switch ((i5 > -1 ? i5 : 0 - i5) & 0x3) {
/*     */               case 0:  break label689;
/*     */                 break; case 1:  d1 = 0.0D;
/*     */                 break label730;
/*     */                 break;
/*     */               case 2: 
/*     */                 break; case 3:  d1 = 0.0D;
/*     */                 
/*     */ 
/*     */                 break label730;
/*     */                 
/*     */                 break;
/*     */               }
/*     */               
/*     */               
/* 262 */               d1 = -1.0D;
/*     */               
/*     */               break label730;
/*     */               
/*     */               label689:
/* 267 */               d1 = 1.0D;
/*     */               
/*     */               break label730;
/*     */               
/*     */               label702:
/* 272 */               d1 *= 3.141592653589793D;
/* 273 */               d1 /= 180.0D;
/* 274 */               d1 = SystemLibrary.sin(d1);
/*     */               
/*     */ 
/*     */ 
/*     */               label730:
/*     */               
/*     */ 
/*     */ 
/* 282 */               d1 = d3 * d1;
/* 283 */               d1 /= d2;
/*     */               
/*     */ 
/* 286 */               i5 = 0;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 295 */             d1 -= MainMemory.getF64(paramInt8);
/* 296 */             if (k == 0) {
/*     */               break label871;
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
/* 308 */             i4 += paramInt2;
/* 309 */             i3 += n;
/* 310 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 317 */               i7 = paramInt10 + (i6 << 2);
/* 318 */               MainMemory.setF64(paramInt9 + (i6 * paramInt5 << 3), d1);
/* 319 */               MainMemory.setI32(i7, i5);
/* 320 */               i6 += 1;
/* 321 */               if (i6 == j) {
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
/* 332 */             paramInt9 = i4;
/* 333 */             paramInt10 = i3;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label871:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 343 */             i1 += 1;
/* 344 */             if (i1 == paramInt3) {
/* 345 */               paramInt2 = i2; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label899:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 360 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 366 */       int i8 = i;return i8;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/cyps2x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */