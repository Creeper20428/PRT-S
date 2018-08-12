/*     */ package com.emt.proteus.duchampopt;
/*     */ 
/*     */ import com.emt.proteus.runtime.api.Env;
/*     */ import com.emt.proteus.runtime.api.Frame;
/*     */ import com.emt.proteus.runtime.api.Function;
/*     */ import com.emt.proteus.runtime.api.MainMemory;
/*     */ 
/*     */ public final class fffr8r4_944 extends com.emt.proteus.runtime.api.ImplementedFunction
/*     */ {
/*     */   public static final int FNID = Integer.MAX_VALUE;
/*  11 */   public static final Function _instance = new fffr8r4_944();
/*  12 */   public final Function resolve() { return _instance; }
/*     */   
/*  14 */   public fffr8r4_944() { super("fffr8r4_944", 8, false); }
/*     */   
/*     */   public int execute(int paramInt1, int paramInt2, int paramInt3, float paramFloat, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  18 */     call(paramInt1, paramInt2, paramInt3, paramFloat, paramBoolean, paramInt4, paramInt5, paramInt6);
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
/*  33 */     float f = paramFrame.getF32(paramArrayOfInt[paramInt4]);
/*  34 */     paramInt4 += 2;
/*  35 */     paramInt3--;
/*  36 */     boolean bool = paramFrame.getI1(paramArrayOfInt[paramInt4]);
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
/*  48 */     call(i, j, k, f, bool, m, n, i1);
/*  49 */     return paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */   public static void call(int paramInt1, int paramInt2, int paramInt3, float paramFloat, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  55 */     int i = 0;
/*  56 */     int j = 0;
/*  57 */     int k = 0;
/*  58 */     int m = 0;
/*  59 */     float f = 0.0F;
/*     */     
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/*  65 */       if (paramBoolean)
/*     */       {
/*  67 */         paramBoolean = paramInt6 == 1;
/*  68 */         paramInt6 = 0;
/*     */         
/*     */         for (;;)
/*     */         {
/*  72 */           i = paramInt4 + (paramInt6 << 3);
/*  73 */           j = paramInt5 + (paramInt6 << 2);
/*  74 */           k = paramInt2 + paramInt6;
/*  75 */           m = MainMemory.getI16(i + 6) & 0xFFFF & 0x7FF0;
/*  76 */           if (m != 32752)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*  81 */             switch (m == 0 ? 2 : 0)
/*     */             {
/*     */             case 0: 
/*  84 */               f = (float)MainMemory.getF64(i);
/*  85 */               MainMemory.setF32(j, f);
/*     */               
/*     */               break label213;
/*  88 */               break;
/*     */             case 1: 
/*     */               break;
/*     */             
/*     */             default: 
/*  93 */               MainMemory.setF32(j, 0.0F);
/*  94 */               break;
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
/* 105 */           MainMemory.setI32(paramInt3, 1);
/* 106 */           if (paramBoolean)
/*     */           {
/* 108 */             MainMemory.setF32(j, paramFloat);
/*     */ 
/*     */ 
/*     */           }
/*     */           else
/*     */           {
/*     */ 
/* 115 */             MainMemory.setI8(k, (byte)1);
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */           label213:
/*     */           
/*     */ 
/*     */ 
/* 125 */           paramInt6 += 1;
/* 126 */           if (paramInt6 == paramInt1) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       return;
/*     */     }
/*     */     finally {}
/*     */   }
/*     */ }


/* Location:              /home/jkim13/Desktop/emediatrack/codejar_s.jar!/com/emt/proteus/duchampopt/fffr8r4_944.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */