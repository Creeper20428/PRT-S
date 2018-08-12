/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class sflx2s extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 2822;
/*  12 */   public static final Function _instance = new sflx2s();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public sflx2s() { super("sflx2s", 10, false); }
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
/*     */             break label543;
/*     */           }
/*     */         }
/*     */         
/* 117 */         n = paramInt3 > 0 ? 1 : 0;
/* 118 */         i1 = n != 0 ? paramInt3 : 1;
/* 119 */         j = n != 0 ? paramInt2 : 1;
/* 120 */         paramInt3 = n != 0 ? paramInt3 : paramInt2;
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
/* 131 */         sflx2s_1632.call(i1, paramInt4, paramInt5, paramInt2, paramInt6, paramInt8, paramInt1);
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
/* 148 */           paramInt6 = paramInt1 + 352;
/* 149 */           k = paramInt1 + 8;
/* 150 */           m = paramInt1 + 368;
/* 151 */           n = j > 0 ? 1 : 0;
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
/* 167 */             i5 = paramInt10;
/* 168 */             i4 = paramInt8;
/* 169 */             i3 = paramInt9;
/* 170 */             d2 = MainMemory.getF64(paramInt7 + (i2 * paramInt4 << 3)) + MainMemory.getF64(paramInt6);
/* 171 */             d1 = d2 / MainMemory.getF64(k);
/* 172 */             d1 = com.emt.proteus.runtime.api.SystemLibrary.cos(d1);
/* 173 */             if (!com.emt.proteus.lib.api.MathUtils.f_oeq(d1, 0.0D))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */               d1 = 1.0D / d1;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 192 */             d2 = MainMemory.getF64(m) * d2;
/* 193 */             if (n == 0) {
/*     */               break label516;
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
/* 206 */             i3 += paramInt2;
/* 207 */             i4 += paramInt2;
/* 208 */             i5 += i1;
/* 209 */             i6 = 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             for (;;)
/*     */             {
/* 216 */               i7 = i6 * paramInt5;
/* 217 */               i8 = paramInt9 + (i7 << 3);
/* 218 */               i9 = paramInt8 + (i7 << 3);
/* 219 */               i10 = paramInt10 + (i6 << 2);
/* 220 */               d3 = MainMemory.getF64(i9) * d1;
/* 221 */               MainMemory.setF64(i9, d3);
/* 222 */               MainMemory.setF64(i8, d2);
/* 223 */               MainMemory.setI32(i10, 0);
/* 224 */               i6 += 1;
/* 225 */               if (i6 == j) {
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
/* 236 */             paramInt8 = i3;
/* 237 */             i8 = i4;
/* 238 */             paramInt10 = i5;
/* 239 */             paramInt9 = paramInt8;
/* 240 */             paramInt8 = i8;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */             label516:
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 250 */             i2 += 1;
/* 251 */             if (i2 == paramInt3) {
/* 252 */               paramInt2 = 0; break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       label543:
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 267 */       i = paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 273 */       int i11 = i;return i11;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/sflx2s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */