/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ import com.emt.proteus.runtime.api.SystemLibrary;
/*     */ 
/*     */ public final class _ZN13GaussSmooth2DIfE6defineEfff extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2082;
/*  11 */   public static final Function _instance = new _ZN13GaussSmooth2DIfE6defineEfff();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN13GaussSmooth2DIfE6defineEfff() { super("_ZN13GaussSmooth2DIfE6defineEfff", 4, false); }
/*     */   
/*     */   public int execute(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  18 */     call(paramInt, paramFloat1, paramFloat2, paramFloat3);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     float f1 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     float f2 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     float f3 = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     call(i, f1, f2, f3);
/*  37 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  43 */     int i = 0;
/*  44 */     int j = 0;
/*  45 */     int k = 0;
/*  46 */     int m = 0;
/*  47 */     int n = 0;
/*  48 */     int i1 = 0;
/*  49 */     int i2 = 0;
/*  50 */     int i3 = 0;
/*  51 */     int i4 = 0;
/*  52 */     int i5 = 0;
/*  53 */     int i6 = 0;
/*  54 */     double d1 = 0.0D;
/*  55 */     int i7 = 0;
/*  56 */     int i8 = 0;
/*  57 */     int i9 = 0;
/*  58 */     double d2 = 0.0D;
/*  59 */     double d3 = 0.0D;
/*  60 */     double d4 = 0.0D;
/*  61 */     double d5 = 0.0D;
/*  62 */     double d6 = 0.0D;
/*  63 */     float f = 0.0F;
/*  64 */     double d7 = 0.0D;
/*  65 */     int i10 = 0;
/*  66 */     int i11 = 0;
/*     */     
/*     */ 
/*  69 */     int i12 = MainMemory.alloc_base_line();
/*     */     
/*     */     try
/*     */     {
/*  73 */       i = MainMemory.alloc(1);
/*  74 */       j = MainMemory.alloc(4);
/*  75 */       k = MainMemory.alloc(4);
/*  76 */       m = MainMemory.alloc(188);
/*  77 */       MainMemory.setF32(paramInt + 4, paramFloat1);
/*  78 */       MainMemory.setF32(paramInt + 8, paramFloat2);
/*  79 */       n = paramInt + 12;
/*  80 */       MainMemory.setF32(n, paramFloat3);
/*  81 */       paramFloat3 = paramFloat1 * paramFloat1;
/*  82 */       d7 = paramFloat3;
/*  83 */       d7 *= 0.25D;
/*  84 */       d7 /= 1.3862943611198906D;
/*  85 */       paramFloat3 = (float)d7;
/*  86 */       paramFloat2 *= paramFloat2;
/*  87 */       d7 = paramFloat2;
/*  88 */       d7 *= 0.25D;
/*  89 */       d7 /= 1.3862943611198906D;
/*  90 */       paramFloat2 = (float)d7;
/*  91 */       d7 = paramFloat1;
/*  92 */       d7 /= 2.772588722239781D;
/*  93 */       paramFloat1 = (float)d7;
/*  94 */       d7 = paramFloat1;
/*  95 */       d1 = SystemLibrary.log(2.938736052218037E-39D) * -2.0D;
/*  96 */       d7 *= SystemLibrary.sqrt(d1);
/*  97 */       i1 = (int)SystemLibrary.ceil(d7);
/*  98 */       i2 = paramInt + 16;
/*  99 */       i11 = MainMemory.getI32(i2);
/* 100 */       i10 = i1 << 1 | 0x1;
/* 101 */       if (i11 >= 0) {
/*     */         break label292;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 111 */       MainMemory.setI32(i2, i10);
/*     */       
/*     */       break label314;
/*     */       
/*     */       label292:
/* 116 */       _ZN13GaussSmooth2DIfE6defineEfff_178.call(i10, k, m, i, i11, i2, j);
/*     */       
/*     */ 
/*     */       label314:
/*     */       
/*     */ 
/* 122 */       i3 = paramInt + 28;
/* 123 */       if (MainMemory.getI8(i3) != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 133 */         _ZN13GaussSmooth2DIfE6defineEfff_177.call(paramInt);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 139 */       i11 = MainMemory.getI32(i2);
/* 140 */       i4 = SystemLibrary.newarray((i11 << 2) * i11);
/* 141 */       i5 = paramInt + 24;
/* 142 */       MainMemory.setI32(i5, i4);
/* 143 */       MainMemory.setI8(i3, (byte)1);
/* 144 */       i6 = paramInt + 20;
/* 145 */       MainMemory.setF32(i6, 0.0F);
/* 146 */       i11 = MainMemory.getI32(i2);
/* 147 */       if (i11 <= 0)
/*     */       {
/*     */ 
/*     */ 
/* 151 */         paramFloat1 = 0.0F;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 158 */         d7 = MainMemory.getF32(n);
/* 159 */         d7 *= 3.141592653589793D;
/* 160 */         d7 /= 180.0D;
/* 161 */         paramFloat1 = (float)d7;
/* 162 */         d7 = paramFloat1;
/* 163 */         paramFloat1 = 0.0F;
/* 164 */         n = i4;
/* 165 */         i8 = i11;
/* 166 */         i10 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 176 */           i11 = i10 + 1;
/* 177 */           if (i8 <= 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/* 182 */             i10 = i8;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 190 */             d1 = i10 - i1;
/* 191 */             i7 = i8;
/*     */             
/* 193 */             i8 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 202 */               i9 = i8 - i1;
/* 203 */               d2 = SystemLibrary.sin(d7);
/* 204 */               d3 = d1 * d2;
/* 205 */               d4 = i9;
/* 206 */               d5 = SystemLibrary.cos(d7);
/* 207 */               d6 = d4 * d5;
/* 208 */               d3 -= d6;
/* 209 */               paramFloat1 = (float)d3;
/* 210 */               d5 = d1 * d5;
/* 211 */               d2 = d4 * d2;
/* 212 */               d2 = d5 + d2;
/* 213 */               f = (float)d2;
/* 214 */               paramFloat1 *= paramFloat1;
/* 215 */               paramFloat1 /= paramFloat3;
/* 216 */               f *= f;
/* 217 */               f /= paramFloat2;
/* 218 */               paramFloat1 += f;
/* 219 */               d2 = paramFloat1;
/* 220 */               d2 *= -0.5D;
/* 221 */               paramFloat1 = (float)SystemLibrary.exp(d2);
/* 222 */               MainMemory.setF32(n + (i8 + i10 * i7 << 2), paramFloat1);
/* 223 */               n = MainMemory.getI32(i5);
/* 224 */               i7 = MainMemory.getI32(i2);
/* 225 */               paramFloat1 = MainMemory.getF32(n + (i8 + i10 * i7 << 2));
/* 226 */               paramFloat1 *= paramFloat1;
/* 227 */               paramFloat1 = MainMemory.getF32(i6) + paramFloat1;
/* 228 */               MainMemory.setF32(i6, paramFloat1);
/* 229 */               i8 += 1;
/* 230 */               if (i7 <= i8) {
/*     */                 break;
/*     */               }
/*     */             }
/*     */             
/*     */             break label740;
/*     */             
/* 237 */             i10 = i7;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           label740:
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 249 */           if (i10 <= i11) {
/*     */             break;
/*     */           }
/* 252 */           i8 = i10;
/* 253 */           i10 = i11;
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
/* 265 */       MainMemory.setF32(i6, SystemLibrary.sqrtf(paramFloat1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     finally
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 276 */       MainMemory.dealloc_generated(i12);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN13GaussSmooth2DIfE6defineEfff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */