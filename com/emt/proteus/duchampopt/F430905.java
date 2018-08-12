/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.lib.api.MathUtils;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F430905 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3688;
/*  11 */   public static final Function _instance = new F430905();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F430905() { super("F430905", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(com.emt.proteus.runtime.api.Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  23 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  24 */     paramInt4 += 2;
/*  25 */     paramInt3--;
/*  26 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  27 */     paramInt4 += 2;
/*  28 */     paramInt3--;
/*  29 */     int k = call(i, j);
/*  30 */     paramFrame.setI32(paramInt1, k);
/*  31 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public static int call(int paramInt1, int paramInt2)
/*     */   {
/*  36 */     int i = 0;
/*     */     
/*  38 */     int j = 0;
/*  39 */     int k = 0;
/*  40 */     int m = 0;
/*  41 */     int n = 0;
/*  42 */     int i1 = 0;
/*  43 */     int i2 = 0;
/*  44 */     int i3 = 0;
/*  45 */     int i4 = 0;
/*  46 */     int i5 = 0;
/*  47 */     int i6 = 0;
/*  48 */     int i7 = 0;
/*  49 */     int i8 = 0;
/*  50 */     int i9 = 0;
/*  51 */     int i10 = 0;
/*  52 */     int i11 = 0;
/*  53 */     int i12 = 0;
/*  54 */     int i13 = 0;
/*  55 */     int i14 = 0;
/*  56 */     int i15 = 0;
/*  57 */     int i16 = 0;
/*  58 */     int i17 = 0;
/*  59 */     int i18 = 0;
/*  60 */     int i19 = 0;
/*  61 */     int i20 = 0;
/*  62 */     int i21 = 0;
/*  63 */     int i22 = 0;
/*  64 */     int i23 = 0;
/*  65 */     int i24 = 0;
/*  66 */     int i25 = 0;
/*  67 */     int i26 = 0;
/*  68 */     int i27 = 0;
/*  69 */     int i28 = 0;
/*  70 */     int i29 = 0;
/*  71 */     int i30 = 0;
/*  72 */     int i31 = 0;
/*  73 */     int i32 = 0;
/*  74 */     int i33 = 0;
/*  75 */     int i34 = 0;
/*  76 */     int i35 = 0;
/*  77 */     int i36 = 0;
/*  78 */     int i37 = 0;
/*  79 */     int i38 = 0;
/*  80 */     int i39 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  86 */       i9 = MainMemory.getI32(paramInt1 + 124);
/*  87 */       j = MainMemory.getI32(paramInt1 + 56);
/*  88 */       k = MainMemory.getI32(paramInt1 + 108);
/*  89 */       m = j + k;
/*  90 */       i12 = MainMemory.getI32(paramInt1 + 120);
/*  91 */       i5 = MainMemory.getI32(paramInt1 + 144);
/*  92 */       i4 = MainMemory.getI32(paramInt1 + 44);
/*  93 */       if (!MathUtils.ugt(k, i4 + 65274))
/*     */       {
/*     */ 
/*     */ 
/*  97 */         n = 0;
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/* 104 */         i4 = k + 262 - i4;
/* 105 */         n = i4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */       i1 = MainMemory.getI32(paramInt1 + 64);
/* 113 */       i2 = MainMemory.getI32(paramInt1 + 52);
/* 114 */       i3 = k + 258;
/* 115 */       i13 = MainMemory.getI8(j + (k + -1 + i12));
/* 116 */       i14 = MainMemory.getI8(j + (i12 + k));
/* 117 */       i4 = MainMemory.getI32(paramInt1 + 116);
/* 118 */       i5 = MathUtils.ugt(i5, i4) ? i4 : i5;
/* 119 */       i6 = paramInt1 + 112;
/* 120 */       i7 = j + i3;
/* 121 */       i8 = k + 257;
/* 122 */       i9 = (MathUtils.ult(i12, MainMemory.getI32(paramInt1 + 140)) ? i9 : i9 >>> 2) + -1;
/* 123 */       i10 = j + (k + 1);
/* 124 */       i11 = 0;
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
/*     */       for (;;)
/*     */       {
/* 139 */         i25 = j + paramInt2;
/* 140 */         if (MainMemory.getI8(j + (paramInt2 + i12)) != i14) {
/*     */           break label1071;
/*     */         }
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
/* 153 */         if (MainMemory.getI8(j + (i12 + -1 + paramInt2)) != i13) {
/*     */           break label1071;
/*     */         }
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
/* 166 */         if (MainMemory.getI8(i25) != MainMemory.getI8(m)) {
/*     */           break label1071;
/*     */         }
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
/* 179 */         if (MainMemory.getI8(j + (paramInt2 + 1)) != MainMemory.getI8(i10)) {
/*     */           break label1071;
/*     */         }
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
/* 192 */         i15 = paramInt2 + 10;
/* 193 */         i16 = paramInt2 + 9;
/* 194 */         i17 = paramInt2 + 8;
/* 195 */         i18 = paramInt2 + 7;
/* 196 */         i19 = paramInt2 + 6;
/* 197 */         i20 = paramInt2 + 5;
/* 198 */         i21 = paramInt2 + 4;
/* 199 */         i22 = paramInt2 + 3;
/* 200 */         i23 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 207 */           i24 = i23 << 3;
/* 208 */           i25 = j + (i15 + i24);
/* 209 */           i26 = j + (i16 + i24);
/* 210 */           i27 = j + (i17 + i24);
/* 211 */           i28 = j + (i18 + i24);
/* 212 */           i29 = j + (i19 + i24);
/* 213 */           i30 = j + (i20 + i24);
/* 214 */           i31 = k + (i24 + 10);
/* 215 */           i32 = j + i31;
/* 216 */           i33 = j + (k + (i24 + 9));
/* 217 */           i34 = j + (k + (i24 + 8));
/* 218 */           i35 = j + (k + (i24 | 0x7));
/* 219 */           i36 = j + (k + (i24 | 0x6));
/* 220 */           i37 = j + (k + (i24 | 0x5));
/* 221 */           i38 = j + (k + (i24 | 0x4));
/* 222 */           i39 = j + (k + (i24 | 0x3));
/* 223 */           if (MainMemory.getI8(i39) != MainMemory.getI8(j + (i22 + i24)))
/*     */           {
/*     */ 
/*     */ 
/* 227 */             i25 = i39;
/*     */             
/*     */ 
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/* 234 */           if (MainMemory.getI8(i38) != MainMemory.getI8(j + (i21 + i24)))
/*     */           {
/*     */ 
/*     */ 
/* 238 */             i25 = i38;
/*     */             
/*     */ 
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/* 245 */           if (MainMemory.getI8(i37) != MainMemory.getI8(i30))
/*     */           {
/*     */ 
/*     */ 
/* 249 */             i25 = i37;
/*     */             
/*     */ 
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/* 256 */           if (MainMemory.getI8(i36) != MainMemory.getI8(i29))
/*     */           {
/*     */ 
/*     */ 
/* 260 */             i25 = i36;
/*     */             
/*     */ 
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/* 267 */           if (MainMemory.getI8(i35) != MainMemory.getI8(i28))
/*     */           {
/*     */ 
/*     */ 
/* 271 */             i25 = i35;
/*     */             
/*     */ 
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/* 278 */           if (MainMemory.getI8(i34) != MainMemory.getI8(i27))
/*     */           {
/*     */ 
/*     */ 
/* 282 */             i25 = i34;
/*     */             
/*     */ 
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/* 289 */           if (MainMemory.getI8(i33) != MainMemory.getI8(i26))
/*     */           {
/*     */ 
/*     */ 
/* 293 */             i25 = i33;
/*     */             
/*     */ 
/*     */             break label974;
/*     */           }
/*     */           
/*     */ 
/* 300 */           i23 += 1;
/* 301 */           if ((MainMemory.getI8(i32) != MainMemory.getI8(i25)) || (i31 >= i3))
/*     */             break;
/*     */         }
/*     */         break label974;
/* 305 */         i25 = i32;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */         label974:
/*     */         
/*     */ 
/*     */ 
/* 314 */         i16 = i25 - i7;
/* 315 */         i15 = i16 + 258;
/* 316 */         if (i15 <= i12) {
/*     */           break label1071;
/*     */         }
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
/* 329 */         MainMemory.setI32(i6, paramInt2);
/* 330 */         if (i15 >= i5)
/*     */         {
/*     */ 
/*     */ 
/* 334 */           paramInt2 = i15;
/* 335 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 341 */         i13 = MainMemory.getI8(j + (i8 + i16));
/* 342 */         i14 = MainMemory.getI8(j + (i15 + k));
/* 343 */         i12 = i15;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         label1071:
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 354 */         paramInt2 = MainMemory.getI16(i1 + ((paramInt2 & i2) << 1)) & 0xFFFF;
/* 355 */         if (!MathUtils.ugt(paramInt2, n))
/*     */         {
/*     */ 
/*     */ 
/* 359 */           paramInt2 = i12;
/* 360 */           break;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 366 */         i15 = i11 + 1;
/* 367 */         if (i9 == i11) {
/* 368 */           paramInt2 = i12; break;
/*     */         }
/*     */         
/*     */ 
/* 372 */         i11 = i15;
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
/*     */ 
/* 384 */       i = MathUtils.ugt(paramInt2, i4) ? i4 : paramInt2;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 390 */       int i40 = i;return i40;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F430905.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */