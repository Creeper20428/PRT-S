/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F291418_003 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new F291418_003();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F291418_003() { super("F291418_003", 10, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
/*  19 */     return 0;
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
/*  54 */     call(i, j, k, m, n, i1, i2, i3, i4, i5);
/*  55 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
/*     */   {
/*  61 */     int i = 0;
/*  62 */     int j = 0;
/*  63 */     int k = 0;
/*  64 */     int m = 0;
/*  65 */     int n = 0;
/*  66 */     int i1 = 0;
/*  67 */     int i2 = 0;
/*  68 */     int i3 = 0;
/*  69 */     int i4 = 0;
/*  70 */     int i5 = 0;
/*  71 */     int i6 = 0;
/*  72 */     int i7 = 0;
/*  73 */     int i8 = 0;
/*  74 */     int i9 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  80 */       if (paramInt4 != 0)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  85 */         i = paramInt1 + paramInt9 * 344 + 56;
/*  86 */         i3 = MainMemory.getI32(i) * paramInt4;
/*  87 */         j = paramInt1 + paramInt9 * 344 + 56 + 28;
/*  88 */         k = paramInt1 + paramInt9 * 344 + 56 + 32;
/*  89 */         m = k;
/*  90 */         n = k;
/*  91 */         i1 = k;
/*  92 */         paramInt5 += -1;
/*  93 */         paramInt9 = paramInt4 + -1;
/*  94 */         i2 = 0;
/*     */         
/*     */ 
/*     */ 
/*     */         for (;;)
/*     */         {
/* 100 */           i4 = MainMemory.getI32(i);
/* 101 */           if (i4 != 0)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 107 */             i5 = paramInt5 + i4 + MainMemory.getI32(paramInt8) * (paramInt9 - i2);
/* 108 */             i6 = i3 + -1;
/* 109 */             i7 = 0;
/*     */             
/*     */             for (;;)
/*     */             {
/* 113 */               i8 = i5 - i7;
/* 114 */               i9 = i6 - i7;
/* 115 */               MainMemory.setI8(MainMemory.getI32(paramInt3) + i8, MainMemory.getI8(MainMemory.getI32(j) + i9));
/* 116 */               switch (MainMemory.getI32(paramInt2))
/*     */               {
/*     */               case 258: 
/* 119 */                 MainMemory.setI8(MainMemory.getI32(paramInt6) + i8, MainMemory.getI8(MainMemory.getI32(m) + i9));
/*     */                 
/*     */ 
/*     */ 
/* 123 */                 break;
/*     */               
/*     */               case 259: 
/* 126 */                 MainMemory.setI32(MainMemory.getI32(paramInt7) + (i8 << 2), MainMemory.getI32(MainMemory.getI32(n) + (i9 << 2)));
/*     */                 
/*     */ 
/*     */ 
/* 130 */                 break;
/*     */               
/*     */               case 260: 
/* 133 */                 MainMemory.setF64(MainMemory.getI32(paramInt10) + (i8 << 3), MainMemory.getF64(MainMemory.getI32(i1) + (i9 << 3)));
/*     */                 
/*     */ 
/*     */ 
/* 137 */                 break;
/*     */               }
/*     */               
/*     */               
/*     */ 
/*     */ 
/*     */ 
/* 144 */               i7 += 1;
/* 145 */               if (i7 == i4)
/*     */               {
/* 147 */                 i3 -= i4; break;
/*     */               }
/*     */             }
/*     */           }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 168 */           i2 += 1;
/* 169 */           if (i2 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F291418_003.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */