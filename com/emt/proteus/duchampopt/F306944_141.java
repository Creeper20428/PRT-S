/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F306944_141 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new F306944_141();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F306944_141() { super("F306944_141", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  45 */     call(i, j, k, m, n, i1, i2);
/*  46 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  52 */     int i = 0;
/*  53 */     double d1 = 0.0D;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*  57 */     int n = 0;
/*  58 */     int i1 = 0;
/*  59 */     int i2 = 0;
/*  60 */     int i3 = 0;
/*  61 */     double d2 = 0.0D;
/*  62 */     int i4 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       if (MainMemory.getI32Aligned(470852) == 0)
/*     */       {
/*  70 */         i = paramInt1 + paramInt5 * 344 + 56 + 32;
/*  71 */         d1 = MainMemory.getF64(i);
/*  72 */         j = paramInt1 + paramInt5 * 344 + 56 + 28;
/*  73 */         paramInt5 = MainMemory.getI32(j);
/*  74 */         k = paramInt2 > 0 ? 1 : 0;
/*  75 */         if (MainMemory.getI32(paramInt4) == 288)
/*     */         {
/*  77 */           if (k != 0)
/*     */           {
/*  79 */             n = paramInt1 + paramInt6 * 344 + 56 + 28;
/*  80 */             m = paramInt1 + paramInt6 * 344 + 56 + 32;
/*  81 */             i1 = paramInt4 + 88;
/*  82 */             i2 = paramInt4 + 84;
/*  83 */             paramInt2 = paramInt7 * paramInt3;
/*     */             
/*  85 */             paramInt3 = 0;
/*     */             
/*     */ 
/*     */             for (;;)
/*     */             {
/*  90 */               if (MainMemory.getI8(MainMemory.getI32(n) + paramInt3) == 0)
/*     */               {
/*  92 */                 d1 += MainMemory.getF64(MainMemory.getI32(m) + (paramInt3 << 3));
/*     */               }
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
/* 106 */               MainMemory.setF64(MainMemory.getI32(i1) + (paramInt3 << 3), d1);
/* 107 */               MainMemory.setI8(MainMemory.getI32(i2) + paramInt3, (byte)0);
/* 108 */               paramInt3 += 1;
/* 109 */               if (paramInt3 == paramInt2) {
/* 110 */                 paramInt2 = paramInt5; break;
/*     */ 
/*     */ 
/*     */               }
/*     */               
/*     */ 
/*     */ 
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*     */ 
/* 127 */             paramInt2 = paramInt5;
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/* 137 */         else if (k != 0)
/*     */         {
/* 139 */           m = paramInt1 + paramInt6 * 344 + 56 + 32;
/* 140 */           n = paramInt1 + paramInt6 * 344 + 56 + 28;
/* 141 */           i1 = paramInt4 + 88;
/* 142 */           i2 = paramInt4 + 84;
/* 143 */           paramInt2 = paramInt7 * paramInt3;
/* 144 */           i3 = MainMemory.getI32(n);
/*     */           
/* 146 */           d2 = d1;
/*     */           
/* 148 */           paramInt3 = 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           for (;;)
/*     */           {
/* 155 */             d1 = MainMemory.getF64(MainMemory.getI32(m) + (paramInt3 << 3));
/* 156 */             i4 = MainMemory.getI32(i1);
/* 157 */             if ((MainMemory.getI8(i3 + paramInt3) != 0) || (paramInt5 != 0))
/*     */             {
/* 159 */               MainMemory.setF64(i4 + (paramInt3 << 3), 0.0D);
/* 160 */               MainMemory.setI8(MainMemory.getI32(i2) + paramInt3, (byte)1);
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 167 */               d2 = d1 - d2;
/* 168 */               MainMemory.setF64(i4 + (paramInt3 << 3), d2);
/* 169 */               MainMemory.setI8(MainMemory.getI32(i2) + paramInt3, (byte)0);
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */             i3 = MainMemory.getI32(n);
/* 178 */             paramInt5 = MainMemory.getI8(i3 + paramInt3);
/* 179 */             paramInt3 += 1;
/* 180 */             if (paramInt3 == paramInt2) {
/* 181 */               paramInt2 = paramInt5; break;
/*     */             }
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 187 */             d2 = d1;
/*     */ 
/*     */ 
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/* 200 */           paramInt2 = paramInt5;
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
/*     */ 
/* 213 */         MainMemory.setF64(i, d1);
/* 214 */         MainMemory.setI32(j, paramInt2);
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F306944_141.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */