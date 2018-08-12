/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.ImplementedFunction;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class parse_data_1602 extends ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  12 */   public static final Function _instance = new parse_data_1602();
/*  13 */   public final Function resolve() { return _instance; }
/*     */   
/*  15 */   public parse_data_1602() { super("parse_data_1602", 7, false); }
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
/*  62 */       MainMemory.setI8(paramInt2, (byte)0);
/*  63 */       if (paramInt7 > 0)
/*     */       {
/*  65 */         i = paramInt6 + paramInt1 * 344 + 56;
/*  66 */         j = paramInt6 + paramInt1 * 344 + 56 + 32;
/*  67 */         paramInt1 = paramInt3 < 2500 ? paramInt3 : 2500;
/*  68 */         paramInt3 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  72 */           MainMemory.setI32(paramInt4, 0);
/*  73 */           paramInt7 = MainMemory.getI32Aligned(459336);
/*  74 */           if (paramInt7 > 0)
/*     */           {
/*  76 */             k = paramInt7 * paramInt3;
/*  77 */             m = 0;
/*     */             
/*     */             do
/*     */             {
/*  81 */               ffcvtn.call(MainMemory.getI32Aligned(470844), j, paramInt2, MainMemory.getI32(i), MainMemory.getI32(MainMemory.getI32Aligned(458752)), MainMemory.getI32Aligned(458820), MainMemory.getI32Aligned(458824) + (k + m) * MainMemory.getI32Aligned(459340), paramInt5);
/*  82 */               m = MainMemory.getI32(paramInt4) + 1;
/*  83 */               MainMemory.setI32(paramInt4, m);
/*  84 */             } while (m < paramInt7);
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
/* 102 */           paramInt3 += 1;
/* 103 */           if (paramInt3 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/parse_data_1602.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */