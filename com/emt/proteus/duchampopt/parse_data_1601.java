/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class parse_data_1601 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new parse_data_1601();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public parse_data_1601() { super("parse_data_1601", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
/*  20 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  25 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  26 */     paramInt4 += 2;
/*  27 */     paramInt3--;
/*  28 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  29 */     paramInt4 += 2;
/*  30 */     paramInt3--;
/*  31 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  32 */     paramInt4 += 2;
/*  33 */     paramInt3--;
/*  34 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  35 */     paramInt4 += 2;
/*  36 */     paramInt3--;
/*  37 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  38 */     paramInt4 += 2;
/*  39 */     paramInt3--;
/*  40 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  41 */     paramInt4 += 2;
/*  42 */     paramInt3--;
/*  43 */     int i2 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  44 */     paramInt4 += 2;
/*  45 */     paramInt3--;
/*  46 */     int i3 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  47 */     paramInt4 += 2;
/*  48 */     paramInt3--;
/*  49 */     call(i, j, k, m, n, i1, i2, i3);
/*  50 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
/*     */   {
/*  56 */     int i = 0;
/*  57 */     int j = 0;
/*  58 */     int k = 0;
/*  59 */     int m = 0;
/*  60 */     int n = 0;
/*  61 */     int i1 = 0;
/*  62 */     int i2 = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  68 */       i = paramInt2 <= paramInt4 ? paramInt2 : paramInt4;
/*  69 */       if (paramInt7 > 0)
/*     */       {
/*  71 */         j = paramInt6 + paramInt1 * 344 + 56 + 28;
/*  72 */         k = paramInt6 + paramInt1 * 344 + 56 + 32;
/*  73 */         paramInt1 = paramInt3 < 2500 ? paramInt3 : 2500;
/*  74 */         m = i < paramInt4 ? 1 : 0;
/*  75 */         paramInt3 = paramInt4 - i;
/*     */         
/*  77 */         paramInt7 = 0;
/*     */         
/*     */ 
/*     */         for (;;)
/*     */         {
/*  82 */           n = MainMemory.getI32Aligned(458824);
/*  83 */           i1 = MainMemory.getI32Aligned(459340);
/*  84 */           i2 = paramInt4 * paramInt7;
/*  85 */           paramInt2 *= paramInt7;
/*  86 */           ffcvtn.call(MainMemory.getI32Aligned(470844), MainMemory.getI32(k) + paramInt2 * MainMemory.getI32Aligned(459344), MainMemory.getI32(j) + paramInt2, i, MainMemory.getI32(MainMemory.getI32Aligned(458752)), MainMemory.getI32Aligned(458820), n + i2 * i1, paramInt5);
/*  87 */           if (m != 0)
/*     */           {
/*  89 */             com.emt.proteus.runtime.api.SystemLibrary.memset(n + (i2 + i) * i1, (byte)0, paramInt3 * i1, 1);
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
/* 100 */           paramInt7 += 1;
/* 101 */           if (paramInt7 == paramInt1) {
/*     */             break;
/*     */           }
/*     */           
/*     */ 
/* 106 */           paramInt2 = MainMemory.getI32(paramInt8);
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1601.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */