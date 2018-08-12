/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class parse_data_1603 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new parse_data_1603();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public parse_data_1603() { super("parse_data_1603", 7, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  19 */     call(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
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
/*  46 */     call(i, j, k, m, n, i1, i2);
/*  47 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  53 */     int i = 0;
/*  54 */     int j = 0;
/*  55 */     int k = 0;
/*  56 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  62 */       if (paramInt7 > 0)
/*     */       {
/*  64 */         i = paramInt6 + paramInt1 * 344 + 56 + 28;
/*  65 */         j = paramInt6 + paramInt1 * 344 + 56 + 32;
/*  66 */         paramInt1 = paramInt2 < 2500 ? paramInt2 : 2500;
/*  67 */         k = paramInt3 > 0 ? 1 : 0;
/*  68 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  72 */           MainMemory.setI32(paramInt4, 0);
/*  73 */           if (k != 0)
/*     */           {
/*  75 */             paramInt7 = paramInt3 * paramInt2;
/*  76 */             m = 0;
/*     */             
/*     */             do
/*     */             {
/*  80 */               ffcvtn.call(MainMemory.getI32Aligned(470844), MainMemory.getI32(j) + MainMemory.getI32Aligned(459344) * paramInt2, MainMemory.getI32(i) + paramInt2, 1, MainMemory.getI32(MainMemory.getI32Aligned(458752)), MainMemory.getI32Aligned(458820), MainMemory.getI32Aligned(458824) + (paramInt7 + m) * MainMemory.getI32Aligned(459340), paramInt5);
/*  81 */               m = MainMemory.getI32(paramInt4) + 1;
/*  82 */               MainMemory.setI32(paramInt4, m);
/*  83 */             } while (m < paramInt3);
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
/* 101 */           paramInt2 += 1;
/* 102 */           if (paramInt2 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1603.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */