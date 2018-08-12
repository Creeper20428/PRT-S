/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class F290094 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = 3162;
/*  11 */   public static final Function _instance = new F290094();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public F290094() { super("F290094", 2, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2)
/*     */   {
/*  18 */     return call(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
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
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  47 */       if ((paramInt2 | paramInt1) < 0) {
/*  48 */         paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*  58 */         j = MainMemory.getI32Aligned(470792);
/*  59 */         k = MainMemory.getI32(j + paramInt1 * 344 + 56);
/*  60 */         if (k == 1) {
/*  61 */           paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */         }
/*     */         else
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*  71 */           m = MainMemory.getI32(j + paramInt2 * 344 + 56);
/*  72 */           if (m == 1) {
/*  73 */             paramInt1 = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           }
/*  83 */           else if ((MainMemory.getI32(j + paramInt1 * 344 + 52) != MainMemory.getI32(j + paramInt2 * 344 + 52)) || (k != m))
/*     */           {
/*     */ 
/*     */ 
/*  87 */             paramInt1 = 0;
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/*  94 */             k = MainMemory.getI32(j + paramInt1 * 344 + 56 + 4);
/*  95 */             if (k != MainMemory.getI32(j + paramInt2 * 344 + 56 + 4))
/*     */             {
/*     */ 
/*     */ 
/*  99 */               paramInt1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 106 */             else if (k <= 0)
/*     */             {
/*     */ 
/*     */ 
/* 110 */               paramInt1 = 1;
/*     */ 
/*     */ 
/*     */             }
/*     */             else
/*     */             {
/*     */ 
/* 117 */               k = k > 1 ? k : 1;
/* 118 */               m = 0;
/* 119 */               n = 1;
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               for (;;)
/*     */               {
/* 127 */                 n = MainMemory.getI32(j + paramInt1 * 344 + 56 + 8 + (m << 2)) == MainMemory.getI32(j + paramInt2 * 344 + 56 + 8 + (m << 2)) ? n : 0;
/* 128 */                 m += 1;
/* 129 */                 if (m == k) {
/* 130 */                   paramInt1 = n; break;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 143 */       i = paramInt1;
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 149 */       int i1 = i;return i1;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/F290094.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */