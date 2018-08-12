/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class _ZN9PixelInfo8Object2D16getPositionAngleEv extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 351;
/*  11 */   public static final Function _instance = new _ZN9PixelInfo8Object2D16getPositionAngleEv();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public _ZN9PixelInfo8Object2D16getPositionAngleEv() { super("_ZN9PixelInfo8Object2D16getPositionAngleEv", 1, false); }
/*     */   
/*     */   public double executeDouble(int paramInt)
/*     */   {
/*  18 */     return call(paramInt);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     double d = call(i);
/*  27 */     paramFrame.setF64(paramInt1, d);
/*  28 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static double call(int paramInt)
/*     */   {
/*  33 */     double d1 = 0.0D;
/*     */     
/*  35 */     int i = 0;
/*  36 */     int j = 0;
/*  37 */     int k = 0;
/*  38 */     int m = 0;
/*  39 */     int n = 0;
/*  40 */     int i1 = 0;
/*  41 */     int i2 = 0;
/*  42 */     int i3 = 0;
/*  43 */     int i4 = 0;
/*  44 */     int i5 = 0;
/*  45 */     int i6 = 0;
/*  46 */     int i7 = 0;
/*  47 */     int i8 = 0;
/*  48 */     double d2 = 0.0D;
/*  49 */     float f1 = 0.0F;
/*  50 */     double d3 = 0.0D;
/*  51 */     double d4 = 0.0D;
/*  52 */     float f2 = 0.0F;
/*  53 */     float f3 = 0.0F;
/*  54 */     double d5 = 0.0D;
/*  55 */     double d6 = 0.0D;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  61 */       i = MainMemory.getI32(paramInt + 4);
/*  62 */       j = MainMemory.getI32(paramInt + 8);
/*  63 */       if (i == j) {
/*  64 */         n = 0;
/*  65 */         d2 = 0.0D;
/*  66 */         i3 = 0;
/*     */         break label358;
/*     */       } else {
/*  69 */         i4 = 0;
/*  70 */         k = 0;
/*  71 */         i3 = 0;
/*  72 */         m = 0;
/*     */       }
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
/*  84 */         n = i4 + 1;
/*  85 */         i1 = i + (n << 4);
/*  86 */         i2 = MainMemory.getI32(i + (i4 << 4) + 4);
/*  87 */         i5 = MainMemory.getI32(i + (i4 << 4) + 12);
/*  88 */         i3 = i2 * i2 * i5 + i3;
/*  89 */         i4 = MainMemory.getI32(i + (i4 << 4) + 8);
/*  90 */         i5 = i4 + -1 + i5;
/*  91 */         if (i5 < i4) {
/*  92 */           i5 = k;
/*  93 */           i2 = m;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/* 103 */           i6 = i4 + 1;
/* 104 */           i7 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 115 */             i8 = i4 + i7;
/* 116 */             m = i8 * i8 + m;
/* 117 */             k = i2 * i8 + k;
/* 118 */             i8 = i7 + 1;
/* 119 */             if (i5 < i6 + i7) {
/* 120 */               i5 = k;
/* 121 */               i2 = m; break;
/*     */             }
/*     */             
/*     */ 
/* 125 */             i7 = i8;
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 136 */         if (i1 == j) {
/*     */           break;
/*     */         }
/*     */         
/* 140 */         i4 = n;
/* 141 */         k = i5;
/*     */         
/* 143 */         m = i2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 150 */       d3 = i3;
/* 151 */       n = i5;
/* 152 */       d2 = d3;
/* 153 */       i3 = i2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */       label358:
/*     */       
/*     */ 
/*     */ 
/* 162 */       d4 = i3;
/* 163 */       f1 = MainMemory.getF32(paramInt + 20);
/* 164 */       f2 = f1 * f1;
/* 165 */       d5 = f2;
/* 166 */       d3 = MainMemory.getI32(paramInt + 16) & 0xFFFFFFFF;
/* 167 */       d5 /= d3;
/* 168 */       d4 -= d5;
/* 169 */       f2 = MainMemory.getF32(paramInt + 24);
/* 170 */       f3 = f2 * f2;
/* 171 */       d5 = f3;
/* 172 */       d5 /= d3;
/* 173 */       d2 -= d5;
/* 174 */       d5 = n;
/* 175 */       f1 *= f2;
/* 176 */       d6 = f1;
/* 177 */       d3 = d6 / d3;
/* 178 */       d3 = d5 - d3;
/* 179 */       if (!com.emt.proteus.lib.api.MathUtils.f_oeq(d3, 0.0D)) {
/*     */         break label529;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 189 */       d1 = com.emt.proteus.lib.api.MathUtils.f_ogt(d4, d2) ? 1.5707963267948966D : 0.0D;
/*     */       
/*     */ 
/*     */       break label601;
/*     */       
/*     */       label529:
/*     */       
/* 196 */       d2 = d4 - d2;
/* 197 */       d4 = d2 * d2;
/* 198 */       d5 = d3 * 4.0D;
/* 199 */       d5 *= d3;
/* 200 */       d4 += d5;
/* 201 */       d2 += com.emt.proteus.runtime.api.SystemLibrary.sqrt(d4);
/* 202 */       d3 *= 2.0D;
/* 203 */       d3 = d2 / d3;
/* 204 */       d1 = com.emt.proteus.runtime.api.SystemLibrary.atan(d3);
/*     */       
/*     */ 
/*     */       label601:
/*     */       
/*     */ 
/* 210 */       double d7 = d1; return d7;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/_ZN9PixelInfo8Object2D16getPositionAngleEv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */