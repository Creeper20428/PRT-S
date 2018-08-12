/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr4r4_898 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr4r4_898();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr4r4_898() { super("fffr4r4_898", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, float paramFloat, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramFloat, paramBoolean, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  19 */     return 0;
/*     */   }
/*     */   
/*     */   public int execute(Env paramEnv, Frame paramFrame, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
/*     */   {
/*  24 */     int i = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  25 */     paramInt4 += 2;
/*  26 */     paramInt3--;
/*  27 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  28 */     paramInt4 += 2;
/*  29 */     paramInt3--;
/*  30 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
/*  31 */     paramInt4 += 2;
/*  32 */     paramInt3--;
/*  33 */     int j = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     int k = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  37 */     paramInt4 += 2;
/*  38 */     paramInt3--;
/*  39 */     int m = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  40 */     paramInt4 += 2;
/*  41 */     paramInt3--;
/*  42 */     int n = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  43 */     paramInt4 += 2;
/*  44 */     paramInt3--;
/*  45 */     int i1 = paramFrame.getI32(paramArrayOfInt[paramInt4]);
/*  46 */     paramInt4 += 2;
/*  47 */     paramInt3--;
/*  48 */     call(i, f, bool, j, k, m, n, i1);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, float paramFloat, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  64 */       if (paramBoolean)
/*     */       {
/*  66 */         paramBoolean = paramInt2 == 1;
/*  67 */         paramInt2 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  71 */           i = paramInt1 + (paramInt2 << 2);
/*  72 */           j = paramInt6 + (paramInt2 << 2);
/*  73 */           k = paramInt5 + paramInt2;
/*  74 */           m = MainMemory.getI16(i + 2) & 0xFFFF & 0x7F80;
/*  75 */           if (m != 32640)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  80 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  83 */               MainMemory.setF32(j, MainMemory.getF32(i));
/*     */               
/*     */               break label203;
/*  86 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/*  91 */               MainMemory.setF32(j, 0.0F);
/*  92 */               break;
/*     */             }
/*     */             
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 103 */           MainMemory.setI32(paramInt3, 1);
/* 104 */           if (paramBoolean)
/*     */           {
/* 106 */             MainMemory.setF32(j, paramFloat);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 113 */             MainMemory.setI8(k, (byte)1);
/* 114 */             MainMemory.setF32(j, -9.11912E-36F);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label203:
/*     */           
/*     */ 
/*     */ 
/* 124 */           paramInt2 += 1;
/* 125 */           if (paramInt2 == paramInt4) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr4r4_898.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */